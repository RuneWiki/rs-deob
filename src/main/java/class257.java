import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class257 extends class135 {

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    private int field4335 = 0;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public int field4339 = 0;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    private int field4340 = -1;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public int field4336 = -1;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    private int field4337;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(IIII)V", line = 6)
    public final void method1784(int arg0, int arg1, int arg2, int arg3) {
        class154.method1121();
        GL var5 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        float var6 = (float) this.field2207 / (float) this.field4334;
        float var7 = (float) this.field2202 / (float) this.field4338;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field2209 + arg0;
        int var11 = this.field2207 * arg2 + var10;
        int var12 = class154.field2464 - arg1 - this.field2193;
        int var13 = var12 - this.field2202 * arg3;
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

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() throws Throwable {
        if (this.field4336 != -1) {
            class79.method613(this.field4336, this.field4339, this.field4337);
            this.field4336 = -1;
            this.field4339 = 0;
        }
        if (this.field4340 != -1) {
            class79.method615(this.field4340, this.field4337);
            this.field4340 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V", line = 53)
    public final void method642(int arg0, int arg1, int arg2) {
        class154.method1143();
        int var4 = this.field2209 + arg0;
        int var5 = this.field2193 + arg1;
        GL var6 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class154.field2464 - var5), 0.0F);
        var6.glCallList(this.field4340);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)V", line = 66)
    public final void method305(int arg0, int arg1) {
        class154.method1121();
        int var3 = this.field2209 + arg0;
        int var4 = this.field2193 + arg1;
        GL var5 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        var5.glTranslatef((float) var3, (float) (class154.field2464 - var4), 0.0F);
        var5.glCallList(this.field4340);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIII[I)V", line = 566)
    public class257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field2205 = arg0;
        this.field2199 = arg1;
        this.field2209 = arg2;
        this.field2193 = arg3;
        this.field2207 = arg4;
        this.field2202 = arg5;
        this.method1776(arg6);
        this.method1790();
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lkb;)V", line = 576)
    public class257(class82 arg0) {
        this.field2205 = arg0.field2205;
        this.field2199 = arg0.field2199;
        this.field2209 = arg0.field2209;
        this.field2193 = arg0.field2193;
        this.field2207 = arg0.field2207;
        this.field2202 = arg0.field2202;
        this.method1776(arg0.field1363);
        this.method1790();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([I)V", line = 82)
    public void method1776(int[] arg0) {
        this.field4334 = class229.method1622(true, this.field2207);
        this.field4338 = class229.method1622(true, this.field2202);
        byte[] var2 = new byte[this.field4338 * this.field4334 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4334 - this.field2207) * 4;
        for (int var6 = 0; var6 < this.field2202; var6++) {
            for (int var7 = 0; var7 < this.field2207; var7++) {
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
        GL var10 = class154.field2479;
        if (this.field4336 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4336 = var11[0];
            this.field4337 = class79.field1324;
        }
        class154.method1141(this.field4336);
        var10.glTexImage2D(3553, 0, 6408, this.field4334, this.field4338, 0, 6408, 5121, var9);
        class79.field1321 += var9.limit() - this.field4339;
        this.field4339 = var9.limit();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIILsa;)V", line = 140)
    public final void method1785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class257 arg8) {
        if (arg8 == null) {
            return;
        }
        class154.method1121();
        class154.method1141(arg8.field4336);
        arg8.method1787(1);
        GL var10 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field4336);
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
        float var27 = (float) arg8.field2207 / (float) arg8.field4334;
        float var28 = (float) arg8.field2202 / (float) arg8.field4338;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field4334 * 65536.0F;
        float var30 = (float) (this.field4338 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class154.field2464 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class154.field2464 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class154.field2464 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class154.field2464 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(IIIIII)V", line = 214)
    public final void method1786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class154.method1121();
        GL var7 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(2);
        int var8 = arg0 - (this.field2209 << 4);
        int var9 = arg1 - (this.field2193 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class154.field2464 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4340);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)V", line = 232)
    public final void method644(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class154.method1121();
        int var5 = this.field2207;
        int var6 = this.field2202;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2205;
        int var10 = this.field2199;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2209 > 0) {
            int var13 = ((this.field2209 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2209 << 16);
        }
        if (this.field2193 > 0) {
            int var14 = ((this.field2193 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2193 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class154.field2464 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field2207 / (float) this.field4334;
        float var21 = (float) this.field2202 / (float) this.field4338;
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

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII)V", line = 303)
    public final void method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class154.method1121();
        GL var7 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        int var8 = arg0 - (this.field2209 << 4);
        int var9 = arg1 - (this.field2193 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class154.field2464 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4340);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 321)
    private final void method1787(int arg0) {
        if (this.field4335 == arg0) {
            return;
        }
        this.field4335 = arg0;
        GL var2 = class154.field2479;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(IIIII)V", line = 340)
    public final void method1788(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class154.method1143();
        GL var6 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        float var7 = (float) this.field2207 / (float) this.field4334;
        float var8 = (float) this.field2202 / (float) this.field4338;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field2209 + arg0;
        int var12 = this.field2207 * arg3 + var11;
        int var13 = class154.field2464 - arg1 - this.field2193;
        int var14 = var13 - this.field2202 * arg4;
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

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILsa;)V", line = 374)
    public final void method1789(int arg0, int arg1, class257 arg2) {
        if (arg2 == null) {
            return;
        }
        class154.method1121();
        class154.method1141(arg2.field4336);
        arg2.method1787(1);
        GL var4 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4336);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class311.field5305) / (float) arg2.field4334;
        float var6 = (float) (arg1 - class311.field5304) / (float) arg2.field4338;
        float var7 = (float) (this.field2207 + arg0 - class311.field5305) / (float) arg2.field4334;
        float var8 = (float) (this.field2202 + arg1 - class311.field5304) / (float) arg2.field4338;
        int var9 = this.field2209 + arg0;
        int var10 = this.field2193 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2207 / (float) this.field4334;
        float var12 = (float) this.field2202 / (float) this.field4338;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2207 + var9), (float) (class154.field2464 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class154.field2464 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class154.field2464 - (this.field2202 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2207 + var9), (float) (class154.field2464 - (this.field2202 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIII)V", line = 424)
    public final void method637(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class154.method1143();
        int var6 = this.field2207;
        int var7 = this.field2202;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2205;
        int var11 = this.field2199;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2209 > 0) {
            int var14 = ((this.field2209 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2209 << 16);
        }
        if (this.field2193 > 0) {
            int var15 = ((this.field2193 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2193 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class154.field2464 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field2207 / (float) this.field4334;
        float var22 = (float) this.field2202 / (float) this.field4338;
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

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V", line = 499)
    public final void method304(int arg0, int arg1) {
        class154.method1121();
        int var3 = this.field2209 + arg0;
        int var4 = this.field2193 + arg1;
        GL var5 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        var5.glTranslatef((float) var3, (float) (class154.field2464 - var4), 0.0F);
        var5.glCallList(this.field4340);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V", line = 511)
    public final void method638(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method305(arg0, arg1);
            return;
        }
        class154.method1116();
        int var5 = this.field2209 + arg0;
        int var6 = this.field2193 + arg1;
        GL var7 = class154.field2479;
        class154.method1141(this.field4336);
        this.method1787(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, (float) arg2 / 256.0F }, 0);
        var7.glTranslatef((float) var5, (float) (class154.field2464 - var6), 0.0F);
        var7.glCallList(this.field4340);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V", line = 536)
    private final void method1790() {
        float var1 = (float) this.field2207 / (float) this.field4334;
        float var2 = (float) this.field2202 / (float) this.field4338;
        GL var3 = class154.field2479;
        if (this.field4340 == -1) {
            this.field4340 = var3.glGenLists(1);
            this.field4337 = class79.field1324;
        }
        var3.glNewList(this.field4340, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2207, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2202));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2207, (float) (-this.field2202));
        var3.glEnd();
        var3.glEndList();
    }
}
