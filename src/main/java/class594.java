import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class class594 implements class116 {

    @OriginalMember(owner = "client!av", name = "e", descriptor = "Lgw;")
    private class155 field8533 = class34.field969;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "I")
    public int field8554;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "Lro;")
    public class2 field8551;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "Ljq;")
    public class475 field8555;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "Z")
    private boolean field8529;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    private int field8536;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "Lfda;")
    public class294 field8543;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    private int field8538;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "[C")
    private static char[] field8532 = new char[64];

    @OriginalMember(owner = "client!av", name = "u", descriptor = "Lkca;")
    public static class74 field8549;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!av", name = "v", descriptor = "[I")
    public static int[] field8550;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    private final void method3383(byte arg0) {
        if (this.field8538 > 0) {
            this.field8555.method2882(this.field8538, this.method3394((byte) 120), -13095);
            this.field8538 = 0;
        }
        int var2 = 116 % ((arg0 + 4) / 61);
        field8548++;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIB[BIII)Z")
    public static final boolean method3384(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field8531++;
        int var7 = arg0 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg6 + arg4 - 1) / arg6);
        if (arg2 != -21) {
            field8550 = null;
        }
        int var10 = -((arg0 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg5] == 0) {
                    return true;
                }
                arg5 += arg6;
            }
            int var13 = arg5 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V")
    public static void method3385(int arg0) {
        if (arg0 >= 78) {
            field8532 = null;
            field8549 = null;
            field8550 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIII[I)V")
    public final void method3386(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field8534++;
        if (arg0 > arg2 && !class141.method1144(0, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class141.method1144(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (class121.field2214 == this.field8543) {
            int var6 = 0;
            int var7 = arg3 <= arg0 ? arg3 : arg0;
            int var8 = arg0 >> 1;
            int var9 = arg3 >> 1;
            int[] var10 = arg4;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var6, this.method3387(arg2 ^ 0xFFFFFFFD), arg0, arg3, 0, 32993, this.field8555.field6838, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var10[var14++];
                        int var22 = var18 & 0xFF;
                        int var23 = var18 >> 24 & 0xFF;
                        int var24 = var18 >> 8 & 0xFF;
                        int var25 = var18 >> 16 & 0xFF;
                        int var26 = ((var20 & 0xFF0F92) >> 16) + var25;
                        int var27 = (var20 & 0xFF) + var22;
                        int var28 = (var20 >> 24 & 0xFF) + var23;
                        int var29 = ((var20 & 0xFFD9) >> 8) + var24;
                        int var30 = ((var19 & 0xFFB0) >> 8) + var29;
                        int var31 = (var19 & 0xFF) + var27;
                        int var32 = (var19 >> 24 & 0xFF) + var28;
                        int var33 = (var19 >> 16 & 0xFF) + var26;
                        int var34 = (var21 & 0xFF) + var31;
                        int var35 = ((var21 & 0xFF93) >> 8) + var30;
                        int var36 = (var21 >> 24 & 0xFF) + var32;
                        int var37 = (var21 >> 16 & 0xFF) + var33;
                        var11[var12++] = class2.method189(class481.method2919(255, var34 >> 2), class2.method189(class2.method189(class481.method2919(var37, 1020) << 14, class481.method2919(var36, 1020) << 22), class481.method2919(1020, var35) << 6));
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                arg3 = var9;
                var10 = var16;
                arg0 = var8;
                var6++;
                var8 >>= 0x1;
                var7 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!av", name = "f", descriptor = "(I)I")
    public final int method3387(int arg0) {
        field8535++;
        if (arg0 != -3) {
            field8549 = null;
        }
        if (class2.field372 == this.field8551) {
            if (class610.field8884 == this.field8543) {
                return 6407;
            }
            if (class121.field2214 == this.field8543) {
                return 6408;
            }
            if (class410.field5938 == this.field8543) {
                return 6406;
            }
            if (class101.field1782 == this.field8543) {
                return 6409;
            }
            if (class288.field4304 == this.field8543) {
                return 6410;
            }
            if (class364.field5413 == this.field8543) {
                return 6145;
            }
        } else if (class2.field375 == this.field8551) {
            if (class610.field8884 == this.field8543) {
                return 34843;
            }
            if (class121.field2214 == this.field8543) {
                return 34842;
            }
            if (class410.field5938 == this.field8543) {
                return 34844;
            }
            if (class101.field1782 == this.field8543) {
                return 34846;
            }
            if (class288.field4304 == this.field8543) {
                return 34847;
            }
            if (class364.field5413 == this.field8543) {
                return 6145;
            }
        } else if (class2.field376 == this.field8551) {
            if (class610.field8884 == this.field8543) {
                return 34837;
            }
            if (class121.field2214 == this.field8543) {
                return 34836;
            }
            if (class410.field5938 == this.field8543) {
                return 34838;
            }
            if (class101.field1782 == this.field8543) {
                return 34840;
            }
            if (class288.field4304 == this.field8543) {
                return 34841;
            }
            if (class364.field5413 == this.field8543) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
    private final void method3388(byte arg0) {
        this.field8555.method3266(-2, this);
        field8539++;
        if (class34.field969 == this.field8533) {
            OpenGL.glTexParameteri(this.field8554, 10241, this.field8529 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8554, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8554, 10241, this.field8529 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8554, 10240, 9728);
        }
        if (arg0 <= 123) {
            this.method3388((byte) -29);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIZ[B)V")
    public final void method3389(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field8547++;
        if (arg0 > 0 && !class141.method1144(0, arg0)) {
            throw new IllegalArgumentException("");
        }
        if (arg3) {
            this.method773(-53);
        }
        if (arg1 > 0 && !class141.method1144(0, arg1)) {
            throw new IllegalArgumentException("");
        }
        int var6 = this.field8543.field4407;
        int var7 = 0;
        int var8 = arg1 <= arg0 ? arg1 : arg0;
        int var9 = arg0 >> 1;
        int var10 = arg1 >> 1;
        byte[] var11 = arg4;
        byte[] var12 = new byte[var9 * var10 * var6];
        while (true) {
            OpenGL.glTexImage2Dub(arg2, var7, this.method3387(-3), arg0, arg1, 0, class635.method3618(this.field8543, 1), 5121, var11, 0);
            if (var8 <= 1) {
                return;
            }
            int var13 = arg0 * var6;
            byte[] var14 = var12;
            for (int var15 = 0; var15 < var6; var15++) {
                int var16 = var15;
                int var17 = var15;
                int var18 = var13 + var15;
                for (int var19 = 0; var19 < var10; var19++) {
                    for (int var20 = 0; var20 < var9; var20++) {
                        byte var21 = var11[var17];
                        int var22 = var6 + var17;
                        int var23 = var11[var22] + var21;
                        int var24 = var11[var18] + var23;
                        var17 = var6 + var22;
                        int var25 = var6 + var18;
                        int var26 = var11[var25] + var24;
                        var12[var16] = (byte) (var26 >> 2);
                        var18 = var6 + var25;
                        var16 += var6;
                    }
                    var18 += var13;
                    var17 += var13;
                }
            }
            var12 = var11;
            arg0 = var9;
            arg1 = var10;
            var11 = var14;
            var10 >>= 0x1;
            var8 >>= 0x1;
            var7++;
            var9 >>= 0x1;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
    private final void method3390(int arg0, int arg1) {
        if (arg0 < -41) {
            this.field8555.field8088 -= arg1;
            field8537++;
            this.field8555.field8088 += this.method3394((byte) 120);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIIFILss;[BFIFFF)V")
    public static final void method3391(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, class400 arg6, byte[] arg7, float arg8, int arg9, float arg10, float arg11, float arg12) {
        if (arg2 != -5843) {
            return;
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            class536.method3100(var13, arg7, arg4, arg10, arg3, arg9, arg1, arg0, arg11, arg6, false, arg8, arg12, arg5);
            arg3 += arg1 * arg5;
        }
        field8542++;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([FIIII)V")
    public final void method3392(float[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field8545++;
        if (arg1 > 0 && !class141.method1144(0, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class141.method1144(0, arg3)) {
            int var6 = this.field8543.field4407;
            int var7 = 0;
            int var8 = arg1 < arg3 ? arg1 : arg3;
            int var9 = arg1 >> 1;
            int var10 = arg3 >> 1;
            float[] var11 = arg0;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var7, this.method3387(-3), arg1, arg3, 0, class635.method3618(this.field8543, 1), 5126, var11, 0);
                if (var8 <= 1) {
                    if (arg4 < 95) {
                        this.field8543 = null;
                        return;
                    }
                    return;
                }
                int var13 = arg1 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            float var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var12[var16] = var26 * 0.25F;
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg3 = var10;
                var11 = var15;
                arg1 = var9;
                var7++;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(II)Lfu;")
    public static final class360 method3393(int arg0, int arg1) {
        if (arg1 != -2) {
            field8532 = null;
        }
        field8552++;
        if (arg0 == 0) {
            if ((double) class407.field5874 == 3.0D) {
                return class580.field8422;
            }
            if ((double) class407.field5874 == 4.0D) {
                return class216.field3281;
            }
            if ((double) class407.field5874 == 6.0D) {
                return class297.field4450;
            }
            if ((double) class407.field5874 >= 8.0D) {
                return class247.field3717;
            }
        } else if (arg0 == 1) {
            if ((double) class407.field5874 == 3.0D) {
                return class297.field4450;
            }
            if ((double) class407.field5874 == 4.0D) {
                return class247.field3717;
            }
            if ((double) class407.field5874 == 6.0D) {
                return class244.field3690;
            }
            if ((double) class407.field5874 >= 8.0D) {
                return class436.field6297;
            }
        } else if (arg0 == 2) {
            if ((double) class407.field5874 == 3.0D) {
                return class244.field3690;
            }
            if ((double) class407.field5874 == 4.0D) {
                return class436.field6297;
            }
            if ((double) class407.field5874 == 6.0D) {
                return class20.field846;
            }
            if ((double) class407.field5874 >= 8.0D) {
                return class409.field5928;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!av", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8541++;
        this.method3383((byte) 92);
        super.finalize();
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
    public final void method773(int arg0) {
        field8544++;
        int var2 = this.field8555.method3192((byte) 88);
        int var3 = this.field8555.field6830[var2];
        if (this.field8554 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field8554);
            this.field8555.field6830[var2] = this.field8554;
        }
        OpenGL.glBindTexture(this.field8554, this.field8538);
        if (arg0 != -23993) {
            this.field8536 = 57;
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(B)I")
    private final int method3394(byte arg0) {
        if (arg0 != 120) {
            this.method774(true, null);
        }
        field8540++;
        int var2 = this.field8551.field367 * this.field8543.field4407 * this.field8536;
        return this.field8529 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3395(int arg0, int arg1, boolean arg2) {
        field8546++;
        if (arg2) {
            method3384(-93, -19, (byte) -67, null, 93, 46, 60);
        }
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZLgw;)V")
    public final void method774(boolean arg0, class155 arg1) {
        if (!arg0) {
            method3391(-123, 56, -41, -66, -0.77284884F, -128, null, null, 0.5218344F, 57, 0.072632656F, 0.3380589F, -0.527018F);
        }
        field8530++;
        if (this.field8533 != arg1) {
            this.field8533 = arg1;
            this.method3388((byte) 126);
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Ljq;ILfda;Lro;IZ)V")
    public class594(class475 arg0, int arg1, class294 arg2, class2 arg3, int arg4, boolean arg5) {
        this.field8554 = arg1;
        this.field8551 = arg3;
        this.field8555 = arg0;
        this.field8529 = arg5;
        this.field8536 = arg4;
        this.field8543 = arg2;
        OpenGL.glGenTextures(1, class473.field6711, 0);
        this.field8538 = class473.field6711[0];
        this.method3388((byte) 127);
        this.method3390(-69, 0);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field8532[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field8532[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field8532[var2] = (char) (var2 + 48 - 52);
        }
        field8532[63] = '-';
        field8532[62] = '*';
        field8549 = new class74();
        field8553 = 0;
        field8550 = new int[] { 3, 7, 15 };
    }
}
