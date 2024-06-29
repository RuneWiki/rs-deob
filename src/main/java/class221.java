import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class221 extends class65 {

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    private int field3818 = 0;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
    public int field3821 = -1;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public int field3823 = 0;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    private int field3824 = -1;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    private int field3819;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILll;)V", line = 5)
    public final void method1492(int arg0, int arg1, class221 arg2) {
        if (arg2 == null) {
            return;
        }
        class257.method1742();
        class257.method1736(arg2.field3821);
        arg2.method1495(1);
        GL var4 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3821);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class296.field5083) / (float) arg2.field3822;
        float var6 = (float) (arg1 - class296.field5082) / (float) arg2.field3820;
        float var7 = (float) (this.field1141 + arg0 - class296.field5083) / (float) arg2.field3822;
        float var8 = (float) (this.field1148 + arg1 - class296.field5082) / (float) arg2.field3820;
        int var9 = this.field1137 + arg0;
        int var10 = this.field1150 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1141 / (float) this.field3822;
        float var12 = (float) this.field1148 / (float) this.field3820;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1141 + var9), (float) (class257.field4423 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class257.field4423 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class257.field4423 - (this.field1148 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1141 + var9), (float) (class257.field4423 - (this.field1148 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V", line = 55)
    public final void method327(int arg0, int arg1) {
        class257.method1742();
        int var3 = this.field1137 + arg0;
        int var4 = this.field1150 + arg1;
        GL var5 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        var5.glTranslatef((float) var3, (float) (class257.field4423 - var4), 0.0F);
        var5.glCallList(this.field3824);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)V", line = 67)
    public final void method316(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class257.method1742();
        int var5 = this.field1141;
        int var6 = this.field1148;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1136;
        int var10 = this.field1145;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1137 > 0) {
            int var13 = ((this.field1137 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1137 << 16);
        }
        if (this.field1150 > 0) {
            int var14 = ((this.field1150 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1150 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class257.field4423 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1141 / (float) this.field3822;
        float var21 = (float) this.field1148 / (float) this.field3820;
        var15.glBegin(6);
        var15.glTexCoord2f(var20, 0.0F);
        var15.glVertex2f(var17, var18);
        var15.glTexCoord2f(0.0F, 0.0F);
        var15.glVertex2f(var16, var18);
        var15.glTexCoord2f(0.0F, var21);
        var15.glVertex2f(var16, var19);
        var15.glTexCoord2f(var20, var21);
        var15.glVertex2f(var17, var19);
        var15.glEnd();
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(IIIII)V", line = 137)
    public final void method1493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class257.method1739();
        GL var6 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        float var7 = (float) this.field1141 / (float) this.field3822;
        float var8 = (float) this.field1148 / (float) this.field3820;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1137 + arg0;
        int var12 = this.field1141 * arg3 + var11;
        int var13 = class257.field4423 - arg1 - this.field1150;
        int var14 = var13 - this.field1148 * arg4;
        float var15 = (float) arg2 / 256.0F;
        var6.glBegin(6);
        var6.glColor4f(1.0F, 1.0F, 1.0F, var15);
        var6.glTexCoord2f(var9, 0.0F);
        var6.glVertex2f((float) var12, (float) var13);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2f((float) var11, (float) var13);
        var6.glTexCoord2f(0.0F, var10);
        var6.glVertex2f((float) var11, (float) var14);
        var6.glTexCoord2f(var9, var10);
        var6.glVertex2f((float) var12, (float) var14);
        var6.glEnd();
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V", line = 172)
    private final void method1494() {
        float var1 = (float) this.field1141 / (float) this.field3822;
        float var2 = (float) this.field1148 / (float) this.field3820;
        GL var3 = class257.field4409;
        if (this.field3824 == -1) {
            this.field3824 = var3.glGenLists(1);
            this.field3819 = class196.field3439;
        }
        var3.glNewList(this.field3824, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1141, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1148));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1141, (float) (-this.field1148));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(II)V", line = 197)
    public final void method321(int arg0, int arg1) {
        class257.method1742();
        int var3 = this.field1137 + arg0;
        int var4 = this.field1150 + arg1;
        GL var5 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        var5.glTranslatef((float) var3, (float) (class257.field4423 - var4), 0.0F);
        var5.glCallList(this.field3824);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IIIII)V", line = 209)
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class257.method1739();
        int var6 = this.field1141;
        int var7 = this.field1148;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1136;
        int var11 = this.field1145;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1137 > 0) {
            int var14 = ((this.field1137 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1137 << 16);
        }
        if (this.field1150 > 0) {
            int var15 = ((this.field1150 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1150 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class257.field4423 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1141 / (float) this.field3822;
        float var22 = (float) this.field1148 / (float) this.field3820;
        float var23 = (float) arg4 / 256.0F;
        var16.glBegin(6);
        var16.glColor4f(1.0F, 1.0F, 1.0F, var23);
        var16.glTexCoord2f(var21, 0.0F);
        var16.glVertex2f(var18, var19);
        var16.glTexCoord2f(0.0F, 0.0F);
        var16.glVertex2f(var17, var19);
        var16.glTexCoord2f(0.0F, var22);
        var16.glVertex2f(var17, var20);
        var16.glTexCoord2f(var21, var22);
        var16.glVertex2f(var18, var20);
        var16.glEnd();
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 283)
    private final void method1495(int arg0) {
        if (this.field3818 == arg0) {
            return;
        }
        this.field3818 = arg0;
        GL var2 = class257.field4409;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIIILll;)V", line = 306)
    public final void method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class221 arg8) {
        if (arg8 == null) {
            return;
        }
        class257.method1742();
        class257.method1736(arg8.field3821);
        arg8.method1495(1);
        GL var10 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field3821);
        var10.glTexEnvi(8960, 34161, 7681);
        var10.glTexEnvi(8960, 34176, 34168);
        int var11 = -arg2 / 2;
        int var12 = -arg3 / 2;
        int var13 = -var11;
        int var14 = -var12;
        int var15 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
        int var16 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
        int var17 = arg7 * var15 >> 8;
        int var18 = arg7 * var16 >> 8;
        int var19 = (arg4 << 16) + var11 * var18 + var12 * var17;
        int var20 = (arg5 << 16) + (var12 * var18 - var11 * var17);
        int var21 = (arg4 << 16) + var12 * var17 + var13 * var18;
        int var22 = (arg5 << 16) + (var12 * var18 - var13 * var17);
        int var23 = (arg4 << 16) + var11 * var18 + var14 * var17;
        int var24 = (arg5 << 16) + (var14 * var18 - var11 * var17);
        int var25 = (arg4 << 16) + var13 * var18 + var14 * var17;
        int var26 = (arg5 << 16) + (var14 * var18 - var13 * var17);
        float var27 = (float) arg8.field1141 / (float) arg8.field3822;
        float var28 = (float) arg8.field1148 / (float) arg8.field3820;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field3822 * 65536.0F;
        float var30 = (float) (this.field3820 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class257.field4423 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class257.field4423 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class257.field4423 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class257.field4423 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IIIIII)V", line = 380)
    public final void method1497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class257.method1742();
        GL var7 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(2);
        int var8 = arg0 - (this.field1137 << 4);
        int var9 = arg1 - (this.field1150 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class257.field4423 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3824);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V", line = 397)
    public final void method322(int arg0, int arg1, int arg2) {
        class257.method1739();
        int var4 = this.field1137 + arg0;
        int var5 = this.field1150 + arg1;
        GL var6 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class257.field4423 - var5), 0.0F);
        var6.glCallList(this.field3824);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ll", name = "finalize", descriptor = "()V", line = 410)
    protected final void finalize() throws Throwable {
        if (this.field3821 != -1) {
            class196.method1317(this.field3821, this.field3823, this.field3819);
            this.field3821 = -1;
            this.field3823 = 0;
        }
        if (this.field3824 != -1) {
            class196.method1316(this.field3824, this.field3819);
            this.field3824 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([I)V", line = 426)
    public void method1498(int[] arg0) {
        this.field3822 = class286.method2014(this.field1141, 783135696);
        this.field3820 = class286.method2014(this.field1148, 783135696);
        byte[] var2 = new byte[this.field3822 * this.field3820 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3822 - this.field1141) * 4;
        for (int var6 = 0; var6 < this.field1148; var6++) {
            for (int var7 = 0; var7 < this.field1141; var7++) {
                int var8 = arg0[var4++];
                if (var8 == 0) {
                    var3 += 4;
                } else {
                    var2[var3++] = (byte) (var8 >> 16);
                    var2[var3++] = (byte) (var8 >> 8);
                    var2[var3++] = (byte) var8;
                    var2[var3++] = -1;
                }
            }
            var3 += var5;
        }
        ByteBuffer var9 = ByteBuffer.wrap(var2);
        GL var10 = class257.field4409;
        if (this.field3821 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3821 = var11[0];
            this.field3819 = class196.field3439;
        }
        class257.method1736(this.field3821);
        var10.glTexImage2D(3553, 0, 6408, this.field3822, this.field3820, 0, 6408, 5121, var9);
        class196.field3440 += var9.limit() - this.field3823;
        this.field3823 = var9.limit();
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1136 = arg0;
        this.field1145 = arg1;
        this.field1137 = arg2;
        this.field1150 = arg3;
        this.field1141 = arg4;
        this.field1148 = arg5;
        this.method1498(arg6);
        this.method1494();
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ldb;)V", line = 557)
    public class221(class41 arg0) {
        this.field1136 = arg0.field1136;
        this.field1145 = arg0.field1145;
        this.field1137 = arg0.field1137;
        this.field1150 = arg0.field1150;
        this.field1141 = arg0.field1141;
        this.field1148 = arg0.field1148;
        this.method1498(arg0.field573);
        this.method1494();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIII)V", line = 491)
    public final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class257.method1742();
        GL var7 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        int var8 = arg0 - (this.field1137 << 4);
        int var9 = arg1 - (this.field1150 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class257.field4423 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3824);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(IIII)V", line = 509)
    public final void method1499(int arg0, int arg1, int arg2, int arg3) {
        class257.method1742();
        GL var5 = class257.field4409;
        class257.method1736(this.field3821);
        this.method1495(1);
        float var6 = (float) this.field1141 / (float) this.field3822;
        float var7 = (float) this.field1148 / (float) this.field3820;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1137 + arg0;
        int var11 = this.field1141 * arg2 + var10;
        int var12 = class257.field4423 - arg1 - this.field1150;
        int var13 = var12 - this.field1148 * arg3;
        var5.glBegin(6);
        var5.glTexCoord2f(var8, 0.0F);
        var5.glVertex2f((float) var11, (float) var12);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) var10, (float) var12);
        var5.glTexCoord2f(0.0F, var9);
        var5.glVertex2f((float) var10, (float) var13);
        var5.glTexCoord2f(var8, var9);
        var5.glVertex2f((float) var11, (float) var13);
        var5.glEnd();
    }
}
