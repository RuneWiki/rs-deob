import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class241 extends class356 {

    @OriginalMember(owner = "client!rga", name = "L", descriptor = "I")
    private int field3527;

    @OriginalMember(owner = "client!rga", name = "r", descriptor = "I")
    private int field3507;

    @OriginalMember(owner = "client!rga", name = "s", descriptor = "I")
    private int field3508;

    @OriginalMember(owner = "client!rga", name = "y", descriptor = "I")
    private int field3514;

    @OriginalMember(owner = "client!rga", name = "B", descriptor = "Lej;")
    public static class124 field3517 = new class124(7, 6);

    @OriginalMember(owner = "client!rga", name = "N", descriptor = "Z")
    public static boolean field3529 = false;

    @OriginalMember(owner = "client!rga", name = "M", descriptor = "F")
    public static float field3528;

    @OriginalMember(owner = "client!rga", name = "q", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!rga", name = "t", descriptor = "I")
    private int field3509;

    @OriginalMember(owner = "client!rga", name = "u", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!rga", name = "v", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!rga", name = "w", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!rga", name = "x", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!rga", name = "A", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!rga", name = "C", descriptor = "I")
    private int field3518;

    @OriginalMember(owner = "client!rga", name = "D", descriptor = "I")
    private int field3519;

    @OriginalMember(owner = "client!rga", name = "E", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!rga", name = "F", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!rga", name = "G", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!rga", name = "I", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!rga", name = "K", descriptor = "Lwea;")
    public static class158 field3526;

    @OriginalMember(owner = "client!rga", name = "J", descriptor = "[B")
    private byte[] field3525;

    @OriginalMember(owner = "client!rga", name = "H", descriptor = "[Lmi;")
    public static class496[] field3523;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IBB)V", line = 5)
    public void method1668(int arg0, byte arg1, byte arg2) {
        if (arg2 != 14) {
            method1673(true, -38);
        }
        field3510++;
        this.field3525[arg0] = arg1;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Z)V", line = 18)
    public final void method1628(boolean arg0) {
        this.field3516 = 0;
        if (!arg0) {
            method1673(false, -53);
        }
        this.field3519 = 0;
        field3520++;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(III[FIII)V", line = 30)
    public static final void method1669(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        field3506++;
        if (arg4 < arg0 && !class476.method2796(arg4 - 23, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg5 <= 0 || class476.method2796(56, arg5)) {
            int var7 = class468.method2755(arg1, -6409);
            int var8 = 0;
            int var9 = arg0 < arg5 ? arg0 : arg5;
            int var10 = arg0 >> 1;
            int var11 = arg5 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var8, arg6, arg0, arg5, 0, arg1, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg0 = var10;
                arg5 = var11;
                var8++;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIIFFF)V", line = 124)
    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3527 = (int) (arg7 * 4096.0F);
        this.field3507 = (int) (arg6 * 4096.0F);
        this.field3514 = this.field3508 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIBIII[B)Z", line = 134)
    public static final boolean method1670(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field3511++;
        int var7 = arg4 % arg3;
        int var8 = 39 / ((31 - arg2) / 63);
        int var9;
        if (var7 == 0) {
            var9 = 0;
        } else {
            var9 = arg3 - var7;
        }
        int var10 = -((arg1 + arg3 - 1) / arg3);
        int var11 = -((arg3 + arg4 - 1) / arg3);
        for (int var12 = var10; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg6[arg5] == 0) {
                    return true;
                }
                arg5 += arg3;
            }
            int var14 = arg5 - var9;
            if (arg6[var14 - 1] == 0) {
                return true;
            }
            arg5 = arg0 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(III)V", line = 187)
    public final void method1627(int arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            return;
        }
        if (arg1 == 0) {
            this.field3509 = this.field3507 - (arg0 >= 0 ? arg0 : -arg0);
            this.field3518 = 4096;
            this.field3509 = this.field3509 * this.field3509 >> 12;
            this.field3519 = this.field3509;
        } else {
            this.field3518 = this.field3527 * this.field3509 >> 12;
            if (this.field3518 < 0) {
                this.field3518 = 0;
            } else if (this.field3518 > 4096) {
                this.field3518 = 4096;
            }
            this.field3509 = this.field3507 - (arg0 < 0 ? -arg0 : arg0);
            this.field3509 = this.field3509 * this.field3509 >> 12;
            this.field3509 = this.field3518 * this.field3509 >> 12;
            this.field3519 += this.field3514 * this.field3509 >> 12;
            this.field3514 = this.field3514 * this.field3508 >> 12;
        }
        field3521++;
    }

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "(I)V", line = 224)
    public static void method1671(int arg0) {
        field3523 = null;
        field3517 = null;
        if (arg0 != 0) {
            field3526 = null;
        }
        field3526 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(II[B)I", line = 241)
    public static final int method1672(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 5126) {
            method1671(52);
        }
        field3513++;
        return class651.method3680(arg1, true, arg2, 0);
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(ZI)V", line = 253)
    public static final void method1673(boolean arg0, int arg1) {
        field3515++;
        if (arg1 == class257.field3711.length()) {
            return;
        }
        class355.method2228("--> " + class257.field3711, 110);
        class549.method3162(class257.field3711, false, arg0, (byte) -79);
        class697.field9411 = 0;
        class257.field3711 = "";
        class680.field9218 = 0;
    }

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V", line = 275)
    public final void method1629(int arg0) {
        this.field3514 = this.field3508;
        this.field3519 >>= 0x4;
        field3524++;
        if (this.field3519 < 0) {
            this.field3519 = 0;
        } else if (this.field3519 > 255) {
            this.field3519 = 255;
        }
        if (arg0 != -1538606516) {
            this.field3518 = 17;
        }
        this.method1668(this.field3516++, (byte) this.field3519, (byte) 14);
        this.field3519 = 0;
    }
}
