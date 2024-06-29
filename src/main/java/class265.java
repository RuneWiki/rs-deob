import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class265 extends class75 {

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public int field4336 = -1;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    private int field4334 = 0;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    private int field4335 = -1;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public int field4338 = 0;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    private int field4337;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public int field4339;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V", line = 8)
    private final void method1856() {
        float var1 = (float) this.field1353 / (float) this.field4339;
        float var2 = (float) this.field1356 / (float) this.field4340;
        GL var3 = class241.field4012;
        if (this.field4335 == -1) {
            this.field4335 = var3.glGenLists(1);
            this.field4337 = class239.field3974;
        }
        var3.glNewList(this.field4335, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1353, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1356));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1353, (float) (-this.field1356));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)V", line = 33)
    public final void method572(int arg0, int arg1) {
        class241.method1683();
        int var3 = this.field1361 + arg0;
        int var4 = this.field1358 + arg1;
        GL var5 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        var5.glTranslatef((float) var3, (float) (class241.field3993 - var4), 0.0F);
        var5.glCallList(this.field4335);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V", line = 47)
    protected final void finalize() throws Throwable {
        if (this.field4336 != -1) {
            class239.method1668(this.field4336, this.field4338, this.field4337);
            this.field4336 = -1;
            this.field4338 = 0;
        }
        if (this.field4335 != -1) {
            class239.method1673(this.field4335, this.field4337);
            this.field4335 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIII)V", line = 63)
    public final void method1857(int arg0, int arg1, int arg2, int arg3) {
        class241.method1683();
        GL var5 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        float var6 = (float) this.field1353 / (float) this.field4339;
        float var7 = (float) this.field1356 / (float) this.field4340;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1361 + arg0;
        int var11 = this.field1353 * arg2 + var10;
        int var12 = class241.field3993 - arg1 - this.field1358;
        int var13 = var12 - this.field1356 * arg3;
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

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V", line = 94)
    public final void method569(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class241.method1683();
        int var5 = this.field1353;
        int var6 = this.field1356;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1359;
        int var10 = this.field1355;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1361 > 0) {
            int var13 = ((this.field1361 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1361 << 16);
        }
        if (this.field1358 > 0) {
            int var14 = ((this.field1358 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1358 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class241.field3993 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1353 / (float) this.field4339;
        float var21 = (float) this.field1356 / (float) this.field4340;
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

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIILof;)V", line = 164)
    public final void method1858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class265 arg8) {
        if (arg8 == null) {
            return;
        }
        class241.method1683();
        class241.method1687(arg8.field4336);
        arg8.method1862(1);
        GL var10 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
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
        float var27 = (float) arg8.field1353 / (float) arg8.field4339;
        float var28 = (float) arg8.field1356 / (float) arg8.field4340;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field4339 * 65536.0F;
        float var30 = (float) (this.field4340 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class241.field3993 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class241.field3993 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class241.field3993 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class241.field3993 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1359 = arg0;
        this.field1355 = arg1;
        this.field1361 = arg2;
        this.field1358 = arg3;
        this.field1353 = arg4;
        this.field1356 = arg5;
        this.method1859(arg6);
        this.method1856();
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lsc;)V", line = 582)
    public class265(class288 arg0) {
        this.field1359 = arg0.field1359;
        this.field1355 = arg0.field1355;
        this.field1361 = arg0.field1361;
        this.field1358 = arg0.field1358;
        this.field1353 = arg0.field1353;
        this.field1356 = arg0.field1356;
        this.method1859(arg0.field4697);
        this.method1856();
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(II)V", line = 241)
    public final void method575(int arg0, int arg1) {
        class241.method1683();
        int var3 = this.field1361 + arg0;
        int var4 = this.field1358 + arg1;
        GL var5 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        var5.glTranslatef((float) var3, (float) (class241.field3993 - var4), 0.0F);
        float var6 = (float) this.field1353 / (float) this.field4339;
        float var7 = (float) this.field1356 / (float) this.field4340;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field1353, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field1356));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field1353, (float) (-this.field1356));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([I)V", line = 269)
    public void method1859(int[] arg0) {
        this.field4339 = class311.method2264(this.field1353, (byte) -51);
        this.field4340 = class311.method2264(this.field1356, (byte) -127);
        byte[] var2 = new byte[this.field4340 * this.field4339 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4339 - this.field1353) * 4;
        for (int var6 = 0; var6 < this.field1356; var6++) {
            for (int var7 = 0; var7 < this.field1353; var7++) {
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
        GL var10 = class241.field4012;
        if (this.field4336 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4336 = var11[0];
            this.field4337 = class239.field3974;
        }
        class241.method1687(this.field4336);
        var10.glTexImage2D(3553, 0, 6408, this.field4339, this.field4340, 0, 6408, 5121, var9);
        class239.field3976 += var9.limit() - this.field4338;
        this.field4338 = var9.limit();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V", line = 328)
    public final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class241.method1683();
        GL var7 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        int var8 = arg0 - (this.field1361 << 4);
        int var9 = arg1 - (this.field1358 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class241.field3993 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4335);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V", line = 349)
    public final void method568(int arg0, int arg1) {
        class241.method1683();
        int var3 = this.field1361 + arg0;
        int var4 = this.field1358 + arg1;
        GL var5 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        var5.glTranslatef((float) var3, (float) (class241.field3993 - var4), 0.0F);
        var5.glCallList(this.field4335);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIIII)V", line = 361)
    public final void method1860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class241.method1683();
        GL var7 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(2);
        int var8 = arg0 - (this.field1361 << 4);
        int var9 = arg1 - (this.field1358 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class241.field3993 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4335);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(IIIII)V", line = 378)
    public final void method1861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.method1701();
        GL var6 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        float var7 = (float) this.field1353 / (float) this.field4339;
        float var8 = (float) this.field1356 / (float) this.field4340;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1361 + arg0;
        int var12 = this.field1353 * arg3 + var11;
        int var13 = class241.field3993 - arg1 - this.field1358;
        int var14 = var13 - this.field1356 * arg4;
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

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V", line = 412)
    public final void method1862(int arg0) {
        if (this.field4334 == arg0) {
            return;
        }
        this.field4334 = arg0;
        GL var2 = class241.field4012;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V", line = 431)
    public final void method565(int arg0, int arg1, int arg2) {
        class241.method1701();
        int var4 = this.field1361 + arg0;
        int var5 = this.field1358 + arg1;
        GL var6 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class241.field3993 - var5), 0.0F);
        var6.glCallList(this.field4335);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIII)V", line = 445)
    public final void method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class241.method1701();
        int var6 = this.field1353;
        int var7 = this.field1356;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1359;
        int var11 = this.field1355;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1361 > 0) {
            int var14 = ((this.field1361 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1361 << 16);
        }
        if (this.field1358 > 0) {
            int var15 = ((this.field1358 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1358 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class241.field3993 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1353 / (float) this.field4339;
        float var22 = (float) this.field1356 / (float) this.field4340;
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

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILof;)V", line = 518)
    public final void method1863(int arg0, int arg1, class265 arg2) {
        if (arg2 == null) {
            return;
        }
        class241.method1683();
        class241.method1687(arg2.field4336);
        arg2.method1862(1);
        GL var4 = class241.field4012;
        class241.method1687(this.field4336);
        this.method1862(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4336);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class337.field5348) / (float) arg2.field4339;
        float var6 = (float) (arg1 - class337.field5350) / (float) arg2.field4340;
        float var7 = (float) (this.field1353 + arg0 - class337.field5348) / (float) arg2.field4339;
        float var8 = (float) (this.field1356 + arg1 - class337.field5350) / (float) arg2.field4340;
        int var9 = this.field1361 + arg0;
        int var10 = this.field1358 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1353 / (float) this.field4339;
        float var12 = (float) this.field1356 / (float) this.field4340;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1353 + var9), (float) (class241.field3993 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class241.field3993 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class241.field3993 - (this.field1356 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1353 + var9), (float) (class241.field3993 - (this.field1356 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }
}
