import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class200 extends class2 {

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public int field3031 = 0;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    private int field3029 = 0;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public int field3034 = -1;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    private int field3032 = -1;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    private int field3033;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method19(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class272.method1939();
        int var5 = this.field13;
        int var6 = this.field24;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field17;
        int var10 = this.field16;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field21 > 0) {
            int var13 = ((this.field21 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field21 << 16);
        }
        if (this.field20 > 0) {
            int var14 = ((this.field20 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field20 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class272.field4311 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field13 / (float) this.field3028;
        float var21 = (float) this.field24 / (float) this.field3030;
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

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIII)V", line = 75)
    public final void method1388(int arg0, int arg1, int arg2, int arg3) {
        class272.method1939();
        GL var5 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        float var6 = (float) this.field13 / (float) this.field3028;
        float var7 = (float) this.field24 / (float) this.field3030;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field21 + arg0;
        int var11 = this.field13 * arg2 + var10;
        int var12 = class272.field4311 - arg1 - this.field20;
        int var13 = var12 - this.field24 * arg3;
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

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)V", line = 107)
    public final void method17(int arg0, int arg1) {
        class272.method1939();
        int var3 = this.field21 + arg0;
        int var4 = this.field20 + arg1;
        GL var5 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        var5.glTranslatef((float) var3, (float) (class272.field4311 - var4), 0.0F);
        var5.glCallList(this.field3032);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V", line = 120)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class272.method1939();
        GL var7 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        int var8 = arg0 - (this.field21 << 4);
        int var9 = arg1 - (this.field20 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class272.field4311 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3032);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([I)V", line = 137)
    public void method1141(int[] arg0) {
        this.field3028 = class226.method1571(true, this.field13);
        this.field3030 = class226.method1571(true, this.field24);
        byte[] var2 = new byte[this.field3030 * this.field3028 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3028 - this.field13) * 4;
        for (int var6 = 0; var6 < this.field24; var6++) {
            for (int var7 = 0; var7 < this.field13; var7++) {
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
        GL var10 = class272.field4310;
        if (this.field3034 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3034 = var11[0];
            this.field3033 = class1.field3;
        }
        class272.method1965(this.field3034);
        var10.glTexImage2D(3553, 0, 6408, this.field3028, this.field3030, 0, 6408, 5121, var9);
        class1.field5 += var9.limit() - this.field3031;
        this.field3031 = var9.limit();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V", line = 196)
    public final void method13(int arg0, int arg1, int arg2) {
        class272.method1944();
        int var4 = this.field21 + arg0;
        int var5 = this.field20 + arg1;
        GL var6 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class272.field4311 - var5), 0.0F);
        var6.glCallList(this.field3032);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(II)V", line = 209)
    public final void method18(int arg0, int arg1) {
        class272.method1939();
        int var3 = this.field21 + arg0;
        int var4 = this.field20 + arg1;
        GL var5 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        var5.glTranslatef((float) var3, (float) (class272.field4311 - var4), 0.0F);
        float var6 = (float) this.field13 / (float) this.field3028;
        float var7 = (float) this.field24 / (float) this.field3030;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field13, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field24));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field13, (float) (-this.field24));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIILaf;)V", line = 236)
    public final void method1389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class200 arg8) {
        if (arg8 == null) {
            return;
        }
        class272.method1939();
        class272.method1965(arg8.field3034);
        arg8.method1394(1);
        GL var10 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field3034);
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
        float var27 = (float) arg8.field13 / (float) arg8.field3028;
        float var28 = (float) arg8.field24 / (float) arg8.field3030;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field3028 * 65536.0F;
        float var30 = (float) (this.field3030 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class272.field4311 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class272.field4311 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class272.field4311 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class272.field4311 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field17 = arg0;
        this.field16 = arg1;
        this.field21 = arg2;
        this.field20 = arg3;
        this.field13 = arg4;
        this.field24 = arg5;
        this.method1141(arg6);
        this.method1391();
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lch;)V", line = 582)
    public class200(class158 arg0) {
        this.field17 = arg0.field17;
        this.field16 = arg0.field16;
        this.field21 = arg0.field21;
        this.field20 = arg0.field20;
        this.field13 = arg0.field13;
        this.field24 = arg0.field24;
        this.method1141(arg0.field2455);
        this.method1391();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILaf;)V", line = 314)
    public final void method1390(int arg0, int arg1, class200 arg2) {
        if (arg2 == null) {
            return;
        }
        class272.method1939();
        class272.method1965(arg2.field3034);
        arg2.method1394(1);
        GL var4 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3034);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class239.field3665) / (float) arg2.field3028;
        float var6 = (float) (arg1 - class239.field3666) / (float) arg2.field3030;
        float var7 = (float) (this.field13 + arg0 - class239.field3665) / (float) arg2.field3028;
        float var8 = (float) (this.field24 + arg1 - class239.field3666) / (float) arg2.field3030;
        int var9 = this.field21 + arg0;
        int var10 = this.field20 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field13 / (float) this.field3028;
        float var12 = (float) this.field24 / (float) this.field3030;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field13 + var9), (float) (class272.field4311 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class272.field4311 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class272.field4311 - (this.field24 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field13 + var9), (float) (class272.field4311 - (this.field24 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V", line = 365)
    private final void method1391() {
        float var1 = (float) this.field13 / (float) this.field3028;
        float var2 = (float) this.field24 / (float) this.field3030;
        GL var3 = class272.field4310;
        if (this.field3032 == -1) {
            this.field3032 = var3.glGenLists(1);
            this.field3033 = class1.field3;
        }
        var3.glNewList(this.field3032, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field13, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field24));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field13, (float) (-this.field24));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V", line = 394)
    public final void method11(int arg0, int arg1) {
        class272.method1939();
        int var3 = this.field21 + arg0;
        int var4 = this.field20 + arg1;
        GL var5 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        var5.glTranslatef((float) var3, (float) (class272.field4311 - var4), 0.0F);
        var5.glCallList(this.field3032);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIII)V", line = 406)
    public final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class272.method1939();
        GL var7 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(2);
        int var8 = arg0 - (this.field21 << 4);
        int var9 = arg1 - (this.field20 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class272.field4311 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3032);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V", line = 424)
    protected final void finalize() throws Throwable {
        if (this.field3034 != -1) {
            class1.method5(this.field3034, this.field3031, this.field3033);
            this.field3034 = -1;
            this.field3031 = 0;
        }
        if (this.field3032 != -1) {
            class1.method7(this.field3032, this.field3033);
            this.field3032 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V", line = 441)
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class272.method1944();
        int var6 = this.field13;
        int var7 = this.field24;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field17;
        int var11 = this.field16;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field21 > 0) {
            int var14 = ((this.field21 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field21 << 16);
        }
        if (this.field20 > 0) {
            int var15 = ((this.field20 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field20 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class272.field4311 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field13 / (float) this.field3028;
        float var22 = (float) this.field24 / (float) this.field3030;
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

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIII)V", line = 514)
    public final void method1393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class272.method1944();
        GL var6 = class272.field4310;
        class272.method1965(this.field3034);
        this.method1394(1);
        float var7 = (float) this.field13 / (float) this.field3028;
        float var8 = (float) this.field24 / (float) this.field3030;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field21 + arg0;
        int var12 = this.field13 * arg3 + var11;
        int var13 = class272.field4311 - arg1 - this.field20;
        int var14 = var13 - this.field24 * arg4;
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

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 551)
    public final void method1394(int arg0) {
        if (this.field3029 == arg0) {
            return;
        }
        this.field3029 = arg0;
        GL var2 = class272.field4310;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}
