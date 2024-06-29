import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class40 extends class55 {

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    private int field841 = 0;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    private int field840 = -1;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public int field842 = -1;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public int field845 = 0;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V", line = 5)
    public final void method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247.method1689();
        GL var7 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        int var8 = arg0 - (this.field1057 << 4);
        int var9 = arg1 - (this.field1063 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class247.field4246 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field840);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 23)
    public final void method271(int arg0, int arg1, int arg2) {
        class247.method1696();
        int var4 = this.field1057 + arg0;
        int var5 = this.field1063 + arg1;
        GL var6 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class247.field4246 - var5), 0.0F);
        var6.glCallList(this.field840);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIILqd;)V", line = 36)
    public final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class40 arg8) {
        if (arg8 == null) {
            return;
        }
        class247.method1689();
        class247.method1691(arg8.field842);
        arg8.method280(1);
        GL var10 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field842);
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
        float var27 = (float) arg8.field1058 / (float) arg8.field843;
        float var28 = (float) arg8.field1060 / (float) arg8.field844;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field843 * 65536.0F;
        float var30 = (float) (this.field844 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class247.field4246 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class247.field4246 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class247.field4246 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class247.field4246 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 111)
    public final void method273(int arg0, int arg1) {
        class247.method1689();
        int var3 = this.field1057 + arg0;
        int var4 = this.field1063 + arg1;
        GL var5 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        var5.glTranslatef((float) var3, (float) (class247.field4246 - var4), 0.0F);
        var5.glCallList(this.field840);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIII)V", line = 123)
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247.method1689();
        GL var7 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(2);
        int var8 = arg0 - (this.field1057 << 4);
        int var9 = arg1 - (this.field1063 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class247.field4246 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field840);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 142)
    protected final void finalize() throws Throwable {
        if (this.field842 != -1) {
            class274.method1921(this.field842, this.field845, this.field846);
            this.field842 = -1;
            this.field845 = 0;
        }
        if (this.field840 != -1) {
            class274.method1923(this.field840, this.field846);
            this.field840 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1065 = arg0;
        this.field1062 = arg1;
        this.field1057 = arg2;
        this.field1063 = arg3;
        this.field1058 = arg4;
        this.field1060 = arg5;
        this.method275(arg6);
        this.method276();
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lqg;)V", line = 557)
    public class40(class231 arg0) {
        this.field1065 = arg0.field1065;
        this.field1062 = arg0.field1062;
        this.field1057 = arg0.field1057;
        this.field1063 = arg0.field1063;
        this.field1058 = arg0.field1058;
        this.field1060 = arg0.field1060;
        this.method275(arg0.field4003);
        this.method276();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([I)V", line = 165)
    public void method275(int[] arg0) {
        this.field843 = class58.method383((byte) -113, this.field1058);
        this.field844 = class58.method383((byte) -122, this.field1060);
        byte[] var2 = new byte[this.field844 * this.field843 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field843 - this.field1058) * 4;
        for (int var6 = 0; var6 < this.field1060; var6++) {
            for (int var7 = 0; var7 < this.field1058; var7++) {
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
        GL var10 = class247.field4253;
        if (this.field842 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field842 = var11[0];
            this.field846 = class274.field4748;
        }
        class247.method1691(this.field842);
        var10.glTexImage2D(3553, 0, 6408, this.field843, this.field844, 0, 6408, 5121, var9);
        class274.field4746 += var9.limit() - this.field845;
        this.field845 = var9.limit();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V", line = 225)
    private final void method276() {
        float var1 = (float) this.field1058 / (float) this.field843;
        float var2 = (float) this.field1060 / (float) this.field844;
        GL var3 = class247.field4253;
        if (this.field840 == -1) {
            this.field840 = var3.glGenLists(1);
            this.field846 = class274.field4748;
        }
        var3.glNewList(this.field840, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1058, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1060));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1058, (float) (-this.field1060));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(IIIII)V", line = 250)
    public final void method277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class247.method1696();
        GL var6 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        float var7 = (float) this.field1058 / (float) this.field843;
        float var8 = (float) this.field1060 / (float) this.field844;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1057 + arg0;
        int var12 = this.field1058 * arg3 + var11;
        int var13 = class247.field4246 - arg1 - this.field1063;
        int var14 = var13 - this.field1060 * arg4;
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

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V", line = 284)
    public final void method278(int arg0, int arg1) {
        class247.method1689();
        int var3 = this.field1057 + arg0;
        int var4 = this.field1063 + arg1;
        GL var5 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        var5.glTranslatef((float) var3, (float) (class247.field4246 - var4), 0.0F);
        var5.glCallList(this.field840);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIII)V", line = 296)
    public final void method279(int arg0, int arg1, int arg2, int arg3) {
        class247.method1689();
        GL var5 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        float var6 = (float) this.field1058 / (float) this.field843;
        float var7 = (float) this.field1060 / (float) this.field844;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1057 + arg0;
        int var11 = this.field1058 * arg2 + var10;
        int var12 = class247.field4246 - arg1 - this.field1063;
        int var13 = var12 - this.field1060 * arg3;
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

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 327)
    private final void method280(int arg0) {
        if (this.field841 == arg0) {
            return;
        }
        this.field841 = arg0;
        GL var2 = class247.field4253;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILqd;)V", line = 346)
    public final void method281(int arg0, int arg1, class40 arg2) {
        if (arg2 == null) {
            return;
        }
        class247.method1689();
        class247.method1691(arg2.field842);
        arg2.method280(1);
        GL var4 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field842);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class269.field4667) / (float) arg2.field843;
        float var6 = (float) (arg1 - class269.field4665) / (float) arg2.field844;
        float var7 = (float) (this.field1058 + arg0 - class269.field4667) / (float) arg2.field843;
        float var8 = (float) (this.field1060 + arg1 - class269.field4665) / (float) arg2.field844;
        int var9 = this.field1057 + arg0;
        int var10 = this.field1063 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1058 / (float) this.field843;
        float var12 = (float) this.field1060 / (float) this.field844;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1058 + var9), (float) (class247.field4246 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class247.field4246 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class247.field4246 - (this.field1060 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1058 + var9), (float) (class247.field4246 - (this.field1060 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIII)V", line = 397)
    public final void method282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class247.method1696();
        int var6 = this.field1058;
        int var7 = this.field1060;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1065;
        int var11 = this.field1062;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1057 > 0) {
            int var14 = ((this.field1057 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1057 << 16);
        }
        if (this.field1063 > 0) {
            int var15 = ((this.field1063 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1063 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class247.field4246 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1058 / (float) this.field843;
        float var22 = (float) this.field1060 / (float) this.field844;
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

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V", line = 471)
    public final void method283(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class247.method1689();
        int var5 = this.field1058;
        int var6 = this.field1060;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1065;
        int var10 = this.field1062;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1057 > 0) {
            int var13 = ((this.field1057 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1057 << 16);
        }
        if (this.field1063 > 0) {
            int var14 = ((this.field1063 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1063 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class247.field4253;
        class247.method1691(this.field842);
        this.method280(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class247.field4246 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1058 / (float) this.field843;
        float var21 = (float) this.field1060 / (float) this.field844;
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
}
