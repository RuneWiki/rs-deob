import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class305 extends class307 {

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    private int field4417 = 0;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    private int field4420 = 0;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    private int field4430 = 0;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    private int field4427 = 0;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Z")
    private boolean field4413 = false;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    private int field4432 = 0;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "Lrl;")
    private class487 field4414;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "Loc;")
    private class129 field4437;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "Lum;")
    public static class347 field4419 = new class347();

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "Lwt;")
    public static class194 field4442 = new class194("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "[I")
    public static int[] field4443 = new int[64];

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "Loc;")
    private class129 field4435;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1831(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field4426++;
            return arg0 == 60 || arg0 == 57 || arg0 == 1011 || arg0 == 18 || arg0 == 46;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3) {
        this.field4432 = arg0;
        field4428++;
        this.field4417 = arg2;
        this.field4430 = arg1;
        this.field4427 = arg3;
        this.field4413 = this.field4432 != 0 || this.field4430 != 0 || this.field4417 != 0 || this.field4427 != 0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "()I")
    public final int method85() {
        field4423++;
        return this.field4437.field1643;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIII)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4437.method1357(false, (byte) 106);
        field4431++;
        this.field4414.method2925(877);
        this.field4414.method2852(0, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field4430 + arg1;
        int var7 = this.field4432 + arg0;
        if (this.field4435 == null) {
            this.field4414.method2883(this.field4437, -99);
            this.field4414.method2914(126, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field4437.field1643);
            OpenGL.glTexCoord2f(this.field4437.field1645, 0.0F);
            OpenGL.glVertex2i(this.field4437.field1641 + var7, this.field4437.field1643 + var6);
            OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
            OpenGL.glVertex2i(this.field4437.field1641 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1835((byte) -109, arg2);
        this.field4435.method1357(false, (byte) 92);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4437.field1647);
        OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field4437.field1643 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field4437.field1645, 0.0F);
        OpenGL.glTexCoord2f(this.field4437.field1645, 0.0F);
        OpenGL.glVertex2i(var7 + this.field4437.field1641, var6 - -this.field4437.field1643);
        OpenGL.glMultiTexCoord2f(33985, this.field4437.field1645, this.field4437.field1647);
        OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
        OpenGL.glVertex2i(var7 + this.field4437.field1641, var6);
        OpenGL.glEnd();
        this.method1834(-90);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)V")
    public final void method1325(int arg0, int arg1, int arg2) {
        field4418++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field4435 = class285.method1727(this.field4437.field1643, arg1, this.field4437.field1641, this.field4414, 34037, arg0);
        this.field4420 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "()I")
    public final int method94() {
        field4440++;
        return this.field4437.field1643 + this.field4430 + this.field4427;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "()I")
    public final int method93() {
        field4429++;
        return this.field4437.field1641;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)Lab;")
    public static final class455 method1832(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6772;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(FFFFFFLfs;II)V")
    public final void method89(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class372 arg6, int arg7, int arg8) {
        field4434++;
        class129 var10 = ((class357) arg6).field5299;
        if (this.field4413) {
            float var11 = (float) this.method87();
            float var12 = (float) this.method94();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4430 * var15;
            float var18 = (float) this.field4430 * var16;
            float var19 = (float) this.field4432 * var13;
            float var20 = (float) this.field4432 * var14;
            float var21 = (float) this.field4417 * -var13;
            float var22 = (float) this.field4417 * -var14;
            float var23 = (float) this.field4427 * -var15;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field4427 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field4437.method1357(true, (byte) 117);
        float var26 = arg5 + arg3 - arg1;
        this.field4414.method2925(877);
        this.field4414.method2883(this.field4437, 87);
        this.field4414.method2914(126, 1);
        this.field4414.method2849(1, (byte) -109);
        this.field4414.method2883(var10, -98);
        this.field4414.method2919(8448, 7681, false);
        this.field4414.method2855(0, (byte) 50, 34168, 768);
        this.field4414.method2852(0, 1);
        float var27 = var10.field1645 / (float) var10.field1641;
        float var28 = var10.field1647 / (float) var10.field1643;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4437.field1647);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field1647 - ((float) (-arg8) + arg1) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field1647 - (arg5 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field4437.field1645, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field1647 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field4437.field1645, this.field4437.field1647);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field1647 - ((arg3 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field4414.method2855(0, (byte) 50, 5890, 768);
        this.field4414.method2914(124, 0);
        this.field4414.method2883(null, 41);
        this.field4414.method2849(0, (byte) -109);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILfs;II)V")
    public final void method83(int arg0, int arg1, class372 arg2, int arg3, int arg4) {
        field4422++;
        class357 var6 = (class357) arg2;
        class129 var7 = var6.field5299;
        this.field4437.method1357(false, (byte) 93);
        this.field4414.method2925(877);
        this.field4414.method2883(this.field4437, 96);
        this.field4414.method2914(124, 1);
        this.field4414.method2849(1, (byte) -109);
        this.field4414.method2883(var7, -105);
        this.field4414.method2919(8448, 7681, false);
        this.field4414.method2855(0, (byte) 50, 34168, 768);
        this.field4414.method2852(0, 1);
        int var8 = this.field4432 + arg0;
        int var9 = this.field4430 + arg1;
        int var10 = this.field4437.field1641 + var8;
        int var11 = this.field4437.field1643 + var9;
        float var12 = var7.field1645 / (float) var7.field1641;
        float var13 = var7.field1647 / (float) var7.field1643;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1647 - (float) (var9 - arg4) * var13;
        float var17 = var7.field1647 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4437.field1647);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field4437.field1643 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field4437.field1645, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field4437.field1641 + var8, this.field4437.field1643 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field4437.field1645, this.field4437.field1647);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field4437.field1641 + var8, var9);
        OpenGL.glEnd();
        this.field4414.method2855(0, (byte) 50, 5890, 768);
        this.field4414.method2914(124, 0);
        this.field4414.method2883(null, 59);
        this.field4414.method2849(0, (byte) -109);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)V")
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4437.method1357(true, (byte) 116);
        field4416++;
        this.field4414.method2925(877);
        this.field4414.method2852(0, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4413) {
            float var8 = (float) arg2 / (float) this.method87();
            float var9 = (float) arg3 / (float) this.method94();
            float var10 = (float) this.field4432 * var8 + (float) arg0;
            float var11 = (float) this.field4430 * var9 + (float) arg1;
            float var12 = (float) this.field4437.field1641 * var8 + var10;
            float var13 = (float) this.field4437.field1643 * var9 + var11;
            if (this.field4435 == null) {
                this.field4414.method2883(this.field4437, 37);
                this.field4414.method2914(126, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field4437.field1645, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1835((byte) -28, arg4);
                this.field4435.method1357(true, (byte) 118);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4437.field1647);
                OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4437.field1645, 0.0F);
                OpenGL.glTexCoord2f(this.field4437.field1645, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4437.field1645, this.field4437.field1647);
                OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1834(-84);
            }
        } else if (this.field4435 == null) {
            this.field4414.method2883(this.field4437, 65);
            this.field4414.method2914(125, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4437.field1645, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1835((byte) -98, arg4);
            this.field4435.method1357(true, (byte) 108);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4437.field1647);
            OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4437.field1645, 0.0F);
            OpenGL.glTexCoord2f(this.field4437.field1645, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4437.field1645, this.field4437.field1647);
            OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1834(-91);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static void method1833(int arg0) {
        field4419 = null;
        field4443 = null;
        if (arg0 > -118) {
            field4443 = null;
        }
        field4442 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method88(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4413) {
            float var10 = (float) this.method87();
            float var11 = (float) this.method94();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field4430 * var14;
            float var17 = (float) this.field4430 * var15;
            float var18 = (float) this.field4432 * var12;
            float var19 = (float) this.field4432 * var13;
            float var20 = (float) this.field4417 * -var12;
            float var21 = (float) this.field4417 * -var13;
            float var22 = (float) this.field4427 * -var14;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            float var23 = (float) this.field4427 * -var15;
            arg5 = arg5 + var19 + var23;
        }
        field4421++;
        float var24 = arg2 + arg4 - arg0;
        this.field4437.method1357(true, (byte) 123);
        float var25 = arg5 + arg3 - arg1;
        this.field4414.method2925(877);
        this.field4414.method2883(this.field4437, -115);
        this.field4414.method2852(0, arg8);
        this.field4414.method2914(124, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field4437.field1645, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIIIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4439++;
        int var8 = arg0 + arg2;
        this.field4437.method1357(false, (byte) 99);
        int var9 = arg1 + arg3;
        this.field4414.method2925(877);
        this.field4414.method2883(this.field4437, 92);
        this.field4414.method2852(0, arg6);
        this.field4414.method2914(124, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4437.field1642 && !this.field4413) {
            float var10 = (float) arg3 * this.field4437.field1647 / (float) this.field4437.field1643;
            float var11 = (float) arg2 * this.field4437.field1645 / (float) this.field4437.field1641;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field4432, (float) this.field4430, 0.0F);
        int var12 = this.method87();
        int var13 = this.method94();
        int var14 = this.field4437.field1643 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field4437.field1641 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field4437.field1645, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field4437.field1645 / (float) this.field4437.field1641;
                OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field4437.field1647);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field4437.field1643 + var15 - var9) * this.field4437.field1647 / (float) this.field4437.field1643;
            int var17 = this.field4437.field1641 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field4437.field1645, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field4437.field1645, this.field4437.field1647);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field4437.field1645 / (float) this.field4437.field1641;
                OpenGL.glTexCoord2f(0.0F, this.field4437.field1647);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field4437.field1647);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    private final void method1834(int arg0) {
        field4433++;
        this.field4414.method2849(1, (byte) -109);
        if (arg0 >= -23) {
            this.field4437 = null;
        }
        this.field4414.method2883(null, -125);
        this.field4414.method2919(8448, 8448, false);
        this.field4414.method2855(1, (byte) 50, 34168, 768);
        this.field4414.method2876(-397556104, 0, 770, 5890);
        this.field4414.method2849(0, (byte) -109);
        this.field4414.method2855(1, (byte) 50, 34168, 768);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)V")
    public final void method1326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4437.method225((byte) 56, arg0, arg3, arg2, arg5, arg1, arg4);
        field4425++;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "()I")
    public final int method87() {
        field4438++;
        return this.field4437.field1641 + this.field4432 + this.field4417;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)V")
    private final void method1835(byte arg0, int arg1) {
        field4415++;
        this.field4414.method2849(1, (byte) -109);
        this.field4414.method2883(this.field4437, -100);
        this.field4414.method2919(7681, this.field4414.method2922(arg1, 126), false);
        this.field4414.method2855(1, (byte) 50, 34167, 768);
        this.field4414.method2876(-397556104, 0, 770, 34168);
        this.field4414.method2849(0, (byte) -109);
        if (arg0 >= -10) {
            this.method90(18, 21, 43, 50, -32);
        }
        this.field4414.method2883(this.field4435, -120);
        this.field4414.method2919(7681, 34479, false);
        this.field4414.method2855(1, (byte) 50, 34166, 768);
        if (this.field4420 == 0) {
            this.field4414.method2853(0.5F, 0.5F, 44, 0.0F, 1.0F);
        } else if (this.field4420 == 1) {
            this.field4414.method2853(0.5F, 1.0F, -93, 0.0F, 0.5F);
        } else if (this.field4420 == 2) {
            this.field4414.method2853(1.0F, 0.5F, 22, 0.0F, 0.5F);
        } else if (this.field4420 == 3) {
            this.field4414.method2853(128.5F, 128.5F, 45, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(BI)I")
    public static final int method1836(byte arg0, int arg1) {
        if (arg0 >= -61) {
            return -45;
        } else {
            field4441++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(III)V")
    public static final void method1837(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field4442 = null;
        }
        class386.method2321(true, class380.field5669);
        field4436++;
        class231.field3227++;
        class79.field1108.method969(arg1 + 19866, arg0);
        class79.field1108.method972(arg2, -128);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lrl;IIII)V")
    public class305(class487 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4414 = arg0;
        this.field4437 = class285.method1727(arg4, arg2, arg3, arg0, 34037, arg1);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lrl;II[III)V")
    public class305(class487 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4414 = arg0;
        this.field4437 = class115.method665(-118, arg2, arg3, false, arg1, arg0);
    }
}
