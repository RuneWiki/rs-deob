import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public abstract class class83 implements class34 {

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "Lcw;")
    private class144 field1000 = class109.field1320;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "Loaa;")
    public class556 field1006;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "Z")
    private boolean field1003;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "Lpb;")
    public class2 field994;

    @OriginalMember(owner = "client!mba", name = "x", descriptor = "Loea;")
    public class612 field1017;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field1004 = -1;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!mba", name = "y", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!mba", name = "A", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "Lae;")
    public static class283 field1001;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field999;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLcw;)V")
    public final void method280(byte arg0, class144 arg1) {
        if (this.field1000 != arg1) {
            this.field1000 = arg1;
            this.method625(0);
        }
        field998++;
        int var3 = 87 / ((arg0 - 18) / 60);
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)V")
    private final void method625(int arg0) {
        field1019++;
        this.field1006.method1492(this, 2);
        if (class109.field1320 == this.field1000) {
            OpenGL.glTexParameteri(this.field1016, 10241, this.field1003 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1016, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1016, 10241, this.field1003 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1016, 10240, 9728);
        }
        if (arg0 != 0) {
            this.field1017 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB[B)[B")
    public static final byte[] method626(int arg0, byte arg1, byte[] arg2) {
        field1013++;
        byte[] var3 = new byte[arg0];
        if (arg1 > -48) {
            field999 = null;
        }
        class335.method2118(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)I")
    private final int method627(int arg0) {
        if (arg0 != 28449) {
            this.method628(49, 23, 119, null, 56);
        }
        field1007++;
        int var2 = this.field1017.field8609 * this.field994.field17 * this.field1005;
        return this.field1003 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[II)V")
    public final void method628(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field997++;
        if (arg1 > 0 && !class65.method506(arg1, 30440)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class65.method506(arg4, arg0 + 47348)) {
            throw new IllegalArgumentException("");
        } else if (class75.field837 == this.field994) {
            int var6 = 0;
            if (arg0 != -16908) {
                this.field1006 = null;
            }
            int var7 = arg4 > arg1 ? arg1 : arg4;
            int var8 = arg1 >> 1;
            int var9 = arg4 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method631(66), arg1, arg4, 0, 32993, this.field1006.field7816, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg1;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 & 0xFF;
                        int var22 = var18 >> 16 & 0xFF;
                        int var23 = var10[var14++];
                        int var24 = var18 >> 24 & 0xFF;
                        int var25 = (var18 & 0xFF47) >> 8;
                        int var26 = (var20 >> 8 & 0xFF) + var25;
                        int var27 = ((var20 & 0xFFDAA2) >> 16) + var22;
                        int var28 = (var20 >> 24 & 0xFF) + var24;
                        int var29 = (var20 & 0xFF) + var21;
                        int var30 = (var19 >> 24 & 0xFF) + var28;
                        int var31 = ((var19 & 0xFF0DD1) >> 16) + var27;
                        int var32 = (var19 & 0xFF) + var29;
                        int var33 = (var19 >> 8 & 0xFF) + var26;
                        int var34 = ((var23 & 0xFF2446) >> 16) + var31;
                        int var35 = ((var23 & 0xFF33) >> 8) + var33;
                        int var36 = (var23 & 0xFF) + var32;
                        int var37 = (var23 >> 24 & 0xFF) + var30;
                        var11[var12++] = class613.method3544(class613.method3544(class613.method3544(class407.method2490(16711680, var34 << 14), class407.method2490(-16777216, var37 << 22)), class407.method2490(65280, var35 << 6)), class407.method2490(1020, var36) >> 2);
                    }
                    var13 += arg1;
                    var14 += arg1;
                }
                var11 = var10;
                var10 = var15;
                arg1 = var8;
                arg4 = var9;
                var6++;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "(I)Lah;")
    public static final class277 method629(int arg0) {
        field1015++;
        if (arg0 != -4540) {
            return null;
        }
        try {
            return (class277) Class.forName("dr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class337();
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V")
    public final void method279(int arg0) {
        field1011++;
        int var2 = this.field1006.method1486((byte) 70);
        if (arg0 != 15320) {
            return;
        }
        int var3 = this.field1006.field7806[var2];
        if (this.field1016 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field1016);
            this.field1006.field7806[var2] = this.field1016;
        }
        OpenGL.glBindTexture(this.field1016, this.field996);
    }

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "(I)V")
    private final void method630(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (this.field996 > 0) {
            this.field1006.method3274(false, this.method627(28449), this.field996);
            this.field996 = 0;
        }
        field995++;
    }

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "(I)I")
    public final int method631(int arg0) {
        field1018++;
        int var2 = 18 % ((arg0 - 23) / 38);
        if (class612.field8616 == this.field1017) {
            if (class661.field9302 == this.field994) {
                return 6407;
            }
            if (class75.field837 == this.field994) {
                return 6408;
            }
            if (class29.field238 == this.field994) {
                return 6406;
            }
            if (class581.field8219 == this.field994) {
                return 6409;
            }
            if (class406.field5718 == this.field994) {
                return 6410;
            }
            if (class777.field10689 == this.field994) {
                return 6145;
            }
        } else if (class612.field8619 == this.field1017) {
            if (class661.field9302 == this.field994) {
                return 34843;
            }
            if (class75.field837 == this.field994) {
                return 34842;
            }
            if (class29.field238 == this.field994) {
                return 34844;
            }
            if (class581.field8219 == this.field994) {
                return 34846;
            }
            if (class406.field5718 == this.field994) {
                return 34847;
            }
            if (class777.field10689 == this.field994) {
                return 6145;
            }
        } else if (class612.field8620 == this.field1017) {
            if (class661.field9302 == this.field994) {
                return 34837;
            }
            if (class75.field837 == this.field994) {
                return 34836;
            }
            if (class29.field238 == this.field994) {
                return 34838;
            }
            if (class581.field8219 == this.field994) {
                return 34840;
            }
            if (class406.field5718 == this.field994) {
                return 34841;
            }
            if (class777.field10689 == this.field994) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)B")
    public static final byte method632(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return -108;
        }
        field1014++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)Z")
    public static final boolean method633(int arg0, int arg1, int arg2) {
        field1009++;
        if (arg1 != 0) {
            method626(5, (byte) 4, null);
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        class286 var3 = class390.field5558.method3065(arg1 ^ 0xFFFFFF8A, arg0);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1892(arg2, arg1 + 8329);
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(III)Z")
    public static final boolean method634(int arg0, int arg1, int arg2) {
        if (arg2 >= -20) {
            field1001 = null;
        }
        field1012++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[FI)V")
    public final void method635(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        field1002++;
        if (arg2 > 0 && !class65.method506(arg2, 30440)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class65.method506(arg1, 30440)) {
            int var6 = this.field994.field17;
            int var7 = -74 % ((-arg0 - 12) / 37);
            int var8 = 0;
            int var9 = arg1 > arg2 ? arg2 : arg1;
            int var10 = arg2 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var10 * var11 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, this.method631(-95), arg2, arg1, 0, class723.method4029(69, this.field994), 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var6;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var6; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var6 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var6 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var6 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var6 + var26;
                            var17 += var6;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg1 = var11;
                var12 = var15;
                arg2 = var10;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1020++;
        this.method630(0);
        super.finalize();
    }

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "(I)V")
    public static void method636(int arg0) {
        if (arg0 == 1) {
            field999 = null;
            field1001 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "([BIIII)V")
    public final void method637(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1010++;
        if (arg2 > 0 && !class65.method506(arg2, 30440)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class65.method506(arg1, 30440)) {
            if (arg3 > -124) {
                method633(-9, 19, -32);
            }
            int var6 = this.field994.field17;
            int var7 = 0;
            int var8 = arg2 < arg1 ? arg2 : arg1;
            int var9 = arg2 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method631(-25), arg2, arg1, 0, class723.method4029(7, this.field994), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var14 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg2 = var9;
                arg1 = var10;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Loaa;ILpb;Loea;IZ)V")
    public class83(class556 arg0, int arg1, class2 arg2, class612 arg3, int arg4, boolean arg5) {
        this.field1006 = arg0;
        this.field1005 = arg4;
        this.field1016 = arg1;
        this.field1003 = arg5;
        this.field994 = arg2;
        this.field1017 = arg3;
        OpenGL.glGenTextures(1, class177.field2238, 0);
        this.field996 = class177.field2238[0];
        this.method625(0);
        this.method638(0, (byte) -109);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)V")
    private final void method638(int arg0, byte arg1) {
        field1008++;
        this.field1006.field3277 -= arg0;
        this.field1006.field3277 += this.method627(28449);
        if (arg1 > -108) {
            method636(85);
        }
    }
}
