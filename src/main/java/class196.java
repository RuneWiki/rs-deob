import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class196 extends class88 {

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    private int field3023 = -1;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    private int field3021 = 0;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public int field3027 = 0;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public int field3026 = -1;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIILek;)V", line = 6)
    public final void method1386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class196 arg8) {
        if (arg8 == null) {
            return;
        }
        class162.method1195();
        class162.method1219(arg8.field3026);
        arg8.method1389(1);
        GL var10 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field3026);
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
        float var27 = (float) arg8.field1412 / (float) arg8.field3022;
        float var28 = (float) arg8.field1413 / (float) arg8.field3024;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field3022 * 65536.0F;
        float var30 = (float) (this.field3024 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class162.field2618 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class162.field2618 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class162.field2618 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class162.field2618 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIIIII)V", line = 80)
    public final void method1387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class162.method1195();
        GL var7 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(2);
        int var8 = arg0 - (this.field1417 << 4);
        int var9 = arg1 - (this.field1415 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class162.field2618 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3023);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I)V", line = 97)
    public void method1147(int[] arg0) {
        this.field3022 = class319.method2255(1, this.field1412);
        this.field3024 = class319.method2255(1, this.field1413);
        byte[] var2 = new byte[this.field3024 * this.field3022 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3022 - this.field1412) * 4;
        for (int var6 = 0; var6 < this.field1413; var6++) {
            for (int var7 = 0; var7 < this.field1412; var7++) {
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
        GL var10 = class162.field2654;
        if (this.field3026 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3026 = var11[0];
            this.field3025 = class177.field2819;
        }
        class162.method1219(this.field3026);
        var10.glTexImage2D(3553, 0, 6408, this.field3022, this.field3024, 0, 6408, 5121, var9);
        class177.field2821 += var9.limit() - this.field3027;
        this.field3027 = var9.limit();
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIII)V", line = 155)
    public final void method1388(int arg0, int arg1, int arg2, int arg3) {
        class162.method1195();
        GL var5 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        float var6 = (float) this.field1412 / (float) this.field3022;
        float var7 = (float) this.field1413 / (float) this.field3024;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1417 + arg0;
        int var11 = this.field1412 * arg2 + var10;
        int var12 = class162.field2618 - arg1 - this.field1415;
        int var13 = var12 - this.field1413 * arg3;
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

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 186)
    private final void method1389(int arg0) {
        if (this.field3021 == arg0) {
            return;
        }
        this.field3021 = arg0;
        GL var2 = class162.field2654;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 205)
    public final void method693(int arg0, int arg1) {
        class162.method1195();
        int var3 = this.field1417 + arg0;
        int var4 = this.field1415 + arg1;
        GL var5 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        var5.glTranslatef((float) var3, (float) (class162.field2618 - var4), 0.0F);
        var5.glCallList(this.field3023);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)V", line = 218)
    public final void method699(int arg0, int arg1) {
        class162.method1195();
        int var3 = this.field1417 + arg0;
        int var4 = this.field1415 + arg1;
        GL var5 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        var5.glTranslatef((float) var3, (float) (class162.field2618 - var4), 0.0F);
        float var6 = (float) this.field1412 / (float) this.field3022;
        float var7 = (float) this.field1413 / (float) this.field3024;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field1412, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field1413));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field1412, (float) (-this.field1413));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)V", line = 243)
    public final void method695(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class162.method1195();
        int var5 = this.field1412;
        int var6 = this.field1413;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1422;
        int var10 = this.field1421;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1417 > 0) {
            int var13 = ((this.field1417 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1417 << 16);
        }
        if (this.field1415 > 0) {
            int var14 = ((this.field1415 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1415 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class162.field2618 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1412 / (float) this.field3022;
        float var21 = (float) this.field1413 / (float) this.field3024;
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

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)V", line = 313)
    public final void method698(int arg0, int arg1) {
        class162.method1195();
        int var3 = this.field1417 + arg0;
        int var4 = this.field1415 + arg1;
        GL var5 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        var5.glTranslatef((float) var3, (float) (class162.field2618 - var4), 0.0F);
        var5.glCallList(this.field3023);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V", line = 325)
    public final void method694(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class162.method1204();
        int var6 = this.field1412;
        int var7 = this.field1413;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1422;
        int var11 = this.field1421;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1417 > 0) {
            int var14 = ((this.field1417 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1417 << 16);
        }
        if (this.field1415 > 0) {
            int var15 = ((this.field1415 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1415 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class162.field2618 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1412 / (float) this.field3022;
        float var22 = (float) this.field1413 / (float) this.field3024;
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

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1422 = arg0;
        this.field1421 = arg1;
        this.field1417 = arg2;
        this.field1415 = arg3;
        this.field1412 = arg4;
        this.field1413 = arg5;
        this.method1147(arg6);
        this.method1391();
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Leg;)V", line = 582)
    public class196(class317 arg0) {
        this.field1422 = arg0.field1422;
        this.field1421 = arg0.field1421;
        this.field1417 = arg0.field1417;
        this.field1415 = arg0.field1415;
        this.field1412 = arg0.field1412;
        this.field1413 = arg0.field1413;
        this.method1147(arg0.field4988);
        this.method1391();
    }

    @OriginalMember(owner = "client!ek", name = "finalize", descriptor = "()V", line = 402)
    protected final void finalize() throws Throwable {
        if (this.field3026 != -1) {
            class177.method1307(this.field3026, this.field3027, this.field3025);
            this.field3026 = -1;
            this.field3027 = 0;
        }
        if (this.field3023 != -1) {
            class177.method1302(this.field3023, this.field3025);
            this.field3023 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILek;)V", line = 424)
    public final void method1390(int arg0, int arg1, class196 arg2) {
        if (arg2 == null) {
            return;
        }
        class162.method1195();
        class162.method1219(arg2.field3026);
        arg2.method1389(1);
        GL var4 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3026);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class114.field1836) / (float) arg2.field3022;
        float var6 = (float) (arg1 - class114.field1835) / (float) arg2.field3024;
        float var7 = (float) (this.field1412 + arg0 - class114.field1836) / (float) arg2.field3022;
        float var8 = (float) (this.field1413 + arg1 - class114.field1835) / (float) arg2.field3024;
        int var9 = this.field1417 + arg0;
        int var10 = this.field1415 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1412 / (float) this.field3022;
        float var12 = (float) this.field1413 / (float) this.field3024;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1412 + var9), (float) (class162.field2618 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class162.field2618 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class162.field2618 - (this.field1413 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1412 + var9), (float) (class162.field2618 - (this.field1413 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V", line = 475)
    public final void method697(int arg0, int arg1, int arg2) {
        class162.method1204();
        int var4 = this.field1417 + arg0;
        int var5 = this.field1415 + arg1;
        GL var6 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class162.field2618 - var5), 0.0F);
        var6.glCallList(this.field3023);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V", line = 489)
    public final void method701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class162.method1195();
        GL var7 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        int var8 = arg0 - (this.field1417 << 4);
        int var9 = arg1 - (this.field1415 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class162.field2618 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3023);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 508)
    private final void method1391() {
        float var1 = (float) this.field1412 / (float) this.field3022;
        float var2 = (float) this.field1413 / (float) this.field3024;
        GL var3 = class162.field2654;
        if (this.field3023 == -1) {
            this.field3023 = var3.glGenLists(1);
            this.field3025 = class177.field2819;
        }
        var3.glNewList(this.field3023, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1412, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1413));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1412, (float) (-this.field1413));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(IIIII)V", line = 536)
    public final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class162.method1204();
        GL var6 = class162.field2654;
        class162.method1219(this.field3026);
        this.method1389(1);
        float var7 = (float) this.field1412 / (float) this.field3022;
        float var8 = (float) this.field1413 / (float) this.field3024;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1417 + arg0;
        int var12 = this.field1412 * arg3 + var11;
        int var13 = class162.field2618 - arg1 - this.field1415;
        int var14 = var13 - this.field1413 * arg4;
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
}
