import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class2 extends class215 {

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    private int field9 = -1;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public int field8 = -1;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    private int field11 = 0;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public int field13 = 0;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(III)V", line = 5)
    public final void method5(int arg0, int arg1, int arg2) {
        class240.method1781();
        int var4 = this.field3363 + arg0;
        int var5 = this.field3359 + arg1;
        GL var6 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class240.field3749 - var5), 0.0F);
        var6.glCallList(this.field9);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V", line = 18)
    public final void method6(int arg0) {
        if (this.field11 == arg0) {
            return;
        }
        this.field11 = arg0;
        GL var2 = class240.field3771;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        if (this.field8 != -1) {
            class28.method327(this.field8, this.field13, this.field10);
            this.field8 = -1;
            this.field13 = 0;
        }
        if (this.field9 != -1) {
            class28.method326(this.field9, this.field10);
            this.field9 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([I)V", line = 54)
    public void method7(int[] arg0) {
        this.field12 = class261.method1918(this.field3366, 22);
        this.field7 = class261.method1918(this.field3367, 22);
        byte[] var2 = new byte[this.field7 * this.field12 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field12 - this.field3366) * 4;
        for (int var6 = 0; var6 < this.field3367; var6++) {
            for (int var7 = 0; var7 < this.field3366; var7++) {
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
        GL var10 = class240.field3771;
        if (this.field8 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field8 = var11[0];
            this.field10 = class28.field455;
        }
        class240.method1786(this.field8);
        var10.glTexImage2D(3553, 0, 6408, this.field12, this.field7, 0, 6408, 5121, var9);
        class28.field458 += var9.limit() - this.field13;
        this.field13 = var9.limit();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V", line = 113)
    private final void method8() {
        float var1 = (float) this.field3366 / (float) this.field12;
        float var2 = (float) this.field3367 / (float) this.field7;
        GL var3 = class240.field3771;
        if (this.field9 == -1) {
            this.field9 = var3.glGenLists(1);
            this.field10 = class28.field455;
        }
        var3.glNewList(this.field9, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3366, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3367));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3366, (float) (-this.field3367));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(II)V", line = 138)
    public final void method9(int arg0, int arg1) {
        class240.method1780();
        int var3 = this.field3363 + arg0;
        int var4 = this.field3359 + arg1;
        GL var5 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        var5.glTranslatef((float) var3, (float) (class240.field3749 - var4), 0.0F);
        var5.glCallList(this.field9);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIII)V", line = 150)
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class240.method1781();
        GL var6 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        float var7 = (float) this.field3366 / (float) this.field12;
        float var8 = (float) this.field3367 / (float) this.field7;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field3363 + arg0;
        int var12 = this.field3366 * arg3 + var11;
        int var13 = class240.field3749 - arg1 - this.field3359;
        int var14 = var13 - this.field3367 * arg4;
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

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIII)V", line = 184)
    public final void method11(int arg0, int arg1, int arg2, int arg3) {
        class240.method1780();
        GL var5 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        float var6 = (float) this.field3366 / (float) this.field12;
        float var7 = (float) this.field3367 / (float) this.field7;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field3363 + arg0;
        int var11 = this.field3366 * arg2 + var10;
        int var12 = class240.field3749 - arg1 - this.field3359;
        int var13 = var12 - this.field3367 * arg3;
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

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V", line = 215)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class240.method1781();
        int var6 = this.field3366;
        int var7 = this.field3367;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field3360;
        int var11 = this.field3369;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field3363 > 0) {
            int var14 = ((this.field3363 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field3363 << 16);
        }
        if (this.field3359 > 0) {
            int var15 = ((this.field3359 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field3359 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class240.field3749 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field3366 / (float) this.field12;
        float var22 = (float) this.field3367 / (float) this.field7;
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

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V", line = 289)
    public final void method13(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class240.method1780();
        int var5 = this.field3366;
        int var6 = this.field3367;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3360;
        int var10 = this.field3369;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3363 > 0) {
            int var13 = ((this.field3363 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3363 << 16);
        }
        if (this.field3359 > 0) {
            int var14 = ((this.field3359 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3359 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class240.field3749 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field3366 / (float) this.field12;
        float var21 = (float) this.field3367 / (float) this.field7;
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

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V", line = 359)
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class240.method1780();
        GL var7 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        int var8 = arg0 - (this.field3363 << 4);
        int var9 = arg1 - (this.field3359 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class240.field3749 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field9);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIIII)V", line = 377)
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class240.method1780();
        GL var7 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(2);
        int var8 = arg0 - (this.field3363 << 4);
        int var9 = arg1 - (this.field3359 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class240.field3749 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field9);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIILml;)V", line = 394)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class2 arg8) {
        if (arg8 == null) {
            return;
        }
        class240.method1780();
        class240.method1786(arg8.field8);
        arg8.method6(1);
        GL var10 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field8);
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
        float var27 = (float) arg8.field3366 / (float) arg8.field12;
        float var28 = (float) arg8.field3367 / (float) arg8.field7;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field12 * 65536.0F;
        float var30 = (float) (this.field7 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class240.field3749 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class240.field3749 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class240.field3749 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class240.field3749 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field3360 = arg0;
        this.field3369 = arg1;
        this.field3363 = arg2;
        this.field3359 = arg3;
        this.field3366 = arg4;
        this.field3367 = arg5;
        this.method7(arg6);
        this.method8();
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lqn;)V", line = 582)
    public class2(class361 arg0) {
        this.field3360 = arg0.field3360;
        this.field3369 = arg0.field3369;
        this.field3363 = arg0.field3363;
        this.field3359 = arg0.field3359;
        this.field3366 = arg0.field3366;
        this.field3367 = arg0.field3367;
        this.method7(arg0.field5720);
        this.method8();
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V", line = 472)
    public final void method17(int arg0, int arg1) {
        class240.method1780();
        int var3 = this.field3363 + arg0;
        int var4 = this.field3359 + arg1;
        GL var5 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        var5.glTranslatef((float) var3, (float) (class240.field3749 - var4), 0.0F);
        var5.glCallList(this.field9);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)V", line = 489)
    public final void method18(int arg0, int arg1) {
        class240.method1780();
        int var3 = this.field3363 + arg0;
        int var4 = this.field3359 + arg1;
        GL var5 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        var5.glTranslatef((float) var3, (float) (class240.field3749 - var4), 0.0F);
        float var6 = (float) this.field3366 / (float) this.field12;
        float var7 = (float) this.field3367 / (float) this.field7;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field3366, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field3367));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field3366, (float) (-this.field3367));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILml;)V", line = 514)
    public final void method19(int arg0, int arg1, class2 arg2) {
        if (arg2 == null) {
            return;
        }
        class240.method1780();
        class240.method1786(arg2.field8);
        arg2.method6(1);
        GL var4 = class240.field3771;
        class240.method1786(this.field8);
        this.method6(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field8);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class213.field3342) / (float) arg2.field12;
        float var6 = (float) (arg1 - class213.field3344) / (float) arg2.field7;
        float var7 = (float) (this.field3366 + arg0 - class213.field3342) / (float) arg2.field12;
        float var8 = (float) (this.field3367 + arg1 - class213.field3344) / (float) arg2.field7;
        int var9 = this.field3363 + arg0;
        int var10 = this.field3359 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field3366 / (float) this.field12;
        float var12 = (float) this.field3367 / (float) this.field7;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field3366 + var9), (float) (class240.field3749 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class240.field3749 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class240.field3749 - (this.field3367 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field3366 + var9), (float) (class240.field3749 - (this.field3367 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }
}
