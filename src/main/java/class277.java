import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class277 extends class258 {

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    private int field4754 = 0;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    public int field4753 = -1;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    private int field4757 = -1;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    public int field4756 = 0;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    private int field4758;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([I)V", line = 7)
    public void method1450(int[] arg0) {
        this.field4755 = class118.method904(1440830960, this.field4318);
        this.field4752 = class118.method904(1440830960, this.field4320);
        byte[] var2 = new byte[this.field4755 * this.field4752 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4755 - this.field4318) * 4;
        for (int var6 = 0; var6 < this.field4320; var6++) {
            for (int var7 = 0; var7 < this.field4318; var7++) {
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
        GL var10 = class47.field739;
        if (this.field4753 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4753 = var11[0];
            this.field4758 = class119.field2009;
        }
        class47.method317(this.field4753);
        var10.glTexImage2D(3553, 0, 6408, this.field4755, this.field4752, 0, 6408, 5121, var9);
        class119.field2005 += var9.limit() - this.field4756;
        this.field4756 = var9.limit();
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(II)V", line = 65)
    public final void method157(int arg0, int arg1) {
        class47.method328();
        int var3 = this.field4326 + arg0;
        int var4 = this.field4323 + arg1;
        GL var5 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        var5.glTranslatef((float) var3, (float) (class47.field762 - var4), 0.0F);
        var5.glCallList(this.field4757);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILgm;)V", line = 78)
    public final void method1964(int arg0, int arg1, class277 arg2) {
        if (arg2 == null) {
            return;
        }
        class47.method328();
        class47.method317(arg2.field4753);
        arg2.method1966(1);
        GL var4 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4753);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class222.field3773) / (float) arg2.field4755;
        float var6 = (float) (arg1 - class222.field3775) / (float) arg2.field4752;
        float var7 = (float) (this.field4318 + arg0 - class222.field3773) / (float) arg2.field4755;
        float var8 = (float) (this.field4320 + arg1 - class222.field3775) / (float) arg2.field4752;
        int var9 = this.field4326 + arg0;
        int var10 = this.field4323 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field4318 / (float) this.field4755;
        float var12 = (float) this.field4320 / (float) this.field4752;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field4318 + var9), (float) (class47.field762 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class47.field762 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class47.field762 - (this.field4320 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field4318 + var9), (float) (class47.field762 - (this.field4320 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(IIII)V", line = 128)
    public final void method1330(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method157(arg0, arg1);
            return;
        }
        class47.method309();
        int var5 = this.field4326 + arg0;
        int var6 = this.field4323 + arg1;
        GL var7 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, (float) arg2 / 256.0F }, 0);
        var7.glTranslatef((float) var5, (float) (class47.field762 - var6), 0.0F);
        var7.glCallList(this.field4757);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 149)
    private final void method1965() {
        float var1 = (float) this.field4318 / (float) this.field4755;
        float var2 = (float) this.field4320 / (float) this.field4752;
        GL var3 = class47.field739;
        if (this.field4757 == -1) {
            this.field4757 = var3.glGenLists(1);
            this.field4758 = class119.field2009;
        }
        var3.glNewList(this.field4757, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4318, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4320));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4318, (float) (-this.field4320));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(IIIIII[I)V", line = 553)
    public class277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4325 = arg0;
        this.field4335 = arg1;
        this.field4326 = arg2;
        this.field4323 = arg3;
        this.field4318 = arg4;
        this.field4320 = arg5;
        this.method1450(arg6);
        this.method1965();
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lcm;)V", line = 563)
    public class277(class181 arg0) {
        this.field4325 = arg0.field4325;
        this.field4335 = arg0.field4335;
        this.field4326 = arg0.field4326;
        this.field4323 = arg0.field4323;
        this.field4318 = arg0.field4318;
        this.field4320 = arg0.field4320;
        this.method1450(arg0.field3029);
        this.method1965();
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V", line = 177)
    private final void method1966(int arg0) {
        if (this.field4754 == arg0) {
            return;
        }
        this.field4754 = arg0;
        GL var2 = class47.field739;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(IIIIII)V", line = 196)
    public final void method1967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method328();
        GL var7 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(2);
        int var8 = arg0 - (this.field4326 << 4);
        int var9 = arg1 - (this.field4323 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class47.field762 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4757);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)V", line = 214)
    public final void method1340(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class47.method328();
        int var5 = this.field4318;
        int var6 = this.field4320;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4325;
        int var10 = this.field4335;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4326 > 0) {
            int var13 = ((this.field4326 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4326 << 16);
        }
        if (this.field4323 > 0) {
            int var14 = ((this.field4323 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4323 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class47.field762 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field4318 / (float) this.field4755;
        float var21 = (float) this.field4320 / (float) this.field4752;
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

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIII)V", line = 284)
    public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method328();
        GL var7 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        int var8 = arg0 - (this.field4326 << 4);
        int var9 = arg1 - (this.field4323 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class47.field762 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4757);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V", line = 301)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class47.method323();
        int var6 = this.field4318;
        int var7 = this.field4320;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4325;
        int var11 = this.field4335;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4326 > 0) {
            int var14 = ((this.field4326 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4326 << 16);
        }
        if (this.field4323 > 0) {
            int var15 = ((this.field4323 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4323 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class47.field762 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field4318 / (float) this.field4755;
        float var22 = (float) this.field4320 / (float) this.field4752;
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

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(IIIII)V", line = 377)
    public final void method1968(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method323();
        GL var6 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        float var7 = (float) this.field4318 / (float) this.field4755;
        float var8 = (float) this.field4320 / (float) this.field4752;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field4326 + arg0;
        int var12 = this.field4318 * arg3 + var11;
        int var13 = class47.field762 - arg1 - this.field4323;
        int var14 = var13 - this.field4320 * arg4;
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

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(IIII)V", line = 412)
    public final void method1969(int arg0, int arg1, int arg2, int arg3) {
        class47.method328();
        GL var5 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        float var6 = (float) this.field4318 / (float) this.field4755;
        float var7 = (float) this.field4320 / (float) this.field4752;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field4326 + arg0;
        int var11 = this.field4318 * arg2 + var10;
        int var12 = class47.field762 - arg1 - this.field4323;
        int var13 = var12 - this.field4320 * arg3;
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

    @OriginalMember(owner = "client!gm", name = "finalize", descriptor = "()V", line = 446)
    protected final void finalize() throws Throwable {
        if (this.field4753 != -1) {
            class119.method909(this.field4753, this.field4756, this.field4758);
            this.field4753 = -1;
            this.field4756 = 0;
        }
        if (this.field4757 != -1) {
            class119.method907(this.field4757, this.field4758);
            this.field4757 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)V", line = 465)
    public final void method156(int arg0, int arg1) {
        class47.method328();
        int var3 = this.field4326 + arg0;
        int var4 = this.field4323 + arg1;
        GL var5 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        var5.glTranslatef((float) var3, (float) (class47.field762 - var4), 0.0F);
        var5.glCallList(this.field4757);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIIILgm;)V", line = 480)
    public final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class277 arg8) {
        if (arg8 == null) {
            return;
        }
        class47.method328();
        class47.method317(arg8.field4753);
        arg8.method1966(1);
        GL var10 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field4753);
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
        float var27 = (float) arg8.field4318 / (float) arg8.field4755;
        float var28 = (float) arg8.field4320 / (float) arg8.field4752;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field4755 * 65536.0F;
        float var30 = (float) (this.field4752 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class47.field762 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class47.field762 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class47.field762 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class47.field762 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)V", line = 574)
    public final void method154(int arg0, int arg1, int arg2) {
        class47.method323();
        int var4 = this.field4326 + arg0;
        int var5 = this.field4323 + arg1;
        GL var6 = class47.field739;
        class47.method317(this.field4753);
        this.method1966(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class47.field762 - var5), 0.0F);
        var6.glCallList(this.field4757);
        var6.glLoadIdentity();
    }
}
