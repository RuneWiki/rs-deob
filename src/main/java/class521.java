import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class521 {

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    private int field7216 = -1;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    private int field7218 = 128;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Z")
    public boolean field7219 = false;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public int field7228 = -1;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    private int field7232 = 128;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    private int field7217 = 0;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    private int field7231 = 0;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    private int field7220 = 0;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "B")
    public byte field7214 = 0;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "[I")
    public static int[] field7222 = new int[14];

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private int field7210;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public int field7230;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Lff;")
    public class519 field7229;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[S")
    private short[] field7211;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[S")
    private short[] field7223;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "[S")
    private short[] field7226;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "[S")
    private short[] field7233;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lio;B)V")
    public final void method2951(class157 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                if (arg1 != 101) {
                    return;
                }
                field7213++;
                return;
            }
            this.method2952(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLio;I)V")
    private final void method2952(boolean arg0, class157 arg1, int arg2) {
        if (arg0) {
            this.method2956(-46, -89, -66, null, -12, null, -46);
        }
        field7221++;
        if (arg2 == 1) {
            this.field7210 = arg1.method963(-119);
        } else if (arg2 == 2) {
            this.field7228 = arg1.method963(-124);
        } else if (arg2 == 4) {
            this.field7218 = arg1.method963(-122);
        } else if (arg2 == 5) {
            this.field7232 = arg1.method963(-126);
        } else if (arg2 == 6) {
            this.field7217 = arg1.method963(-118);
        } else if (arg2 == 7) {
            this.field7231 = arg1.method930(255);
        } else if (arg2 == 8) {
            this.field7220 = arg1.method930(255);
        } else if (arg2 == 9) {
            this.field7216 = 8224;
            this.field7214 = 3;
        } else if (arg2 == 10) {
            this.field7219 = true;
        } else if (arg2 == 11) {
            this.field7214 = 1;
        } else if (arg2 == 12) {
            this.field7214 = 4;
        } else if (arg2 == 13) {
            this.field7214 = 5;
        } else if (arg2 == 14) {
            this.field7214 = 2;
            this.field7216 = arg1.method930(255) * 256;
        } else if (arg2 == 15) {
            this.field7214 = 3;
            this.field7216 = arg1.method963(-127);
        } else if (arg2 == 16) {
            this.field7214 = 3;
            this.field7216 = arg1.method908(false);
            return;
        } else if (arg2 == 40) {
            int var4 = arg1.method930(255);
            this.field7226 = new short[var4];
            this.field7223 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7226[var5] = (short) arg1.method963(-121);
                this.field7223[var5] = (short) arg1.method963(-126);
            }
            return;
        } else if (arg2 == 41) {
            int var6 = arg1.method930(255);
            this.field7211 = new short[var6];
            this.field7233 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7211[var7] = (short) arg1.method963(-126);
                this.field7233[var7] = (short) arg1.method963(-118);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method2953(byte arg0) {
        if (arg0 < 22) {
            field7222 = null;
        }
        field7222 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIZILtfa;ILi;Li;IIBLr;)Lda;")
    private final class470 method2954(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class288 arg6, int arg7, class270 arg8, class270 arg9, int arg10, int arg11, byte arg12, class562 arg13) {
        field7227++;
        int var15 = arg3;
        class186 var16 = this.field7228 == -1 || arg7 == -1 ? null : arg6.method1707(this.field7228, 59);
        boolean var17 = arg4 & this.field7214 != 0;
        if (var16 != null) {
            var15 = arg3 | var16.method1234(arg7, (byte) -32, false, arg10);
        }
        int var18 = -61 % ((23 - arg0) / 60);
        if (var17) {
            var15 |= this.field7214 == 3 ? 7 : 2;
        }
        if (this.field7232 != 128) {
            var15 |= 0x2;
        }
        if (this.field7218 != 128 || this.field7217 != 0) {
            var15 |= 0x5;
        }
        class380 var19 = this.field7229.field7201;
        class470 var20;
        synchronized (this.field7229.field7201) {
            var20 = (class470) this.field7229.field7201.method2176(-128, (long) (this.field7230 |= arg13.field7672 << 29));
        }
        if (var20 == null || arg13.method1053(var20.method604(), var15) != 0) {
            if (var20 != null) {
                var15 = arg13.method1080(var15, var20.method604());
            }
            int var21 = var15;
            if (this.field7226 != null) {
                var21 = var15 | 0x4000;
            }
            if (this.field7211 != null) {
                var21 |= 0x8000;
            }
            class250 var22 = class258.method1563(0, this.field7229.field7197, this.field7210, 65535);
            if (var22 == null) {
                return null;
            }
            if (var22.field3261 < 13) {
                var22.method1513(2, (byte) 77);
            }
            var20 = arg13.method1089(var22, var21, this.field7229.field7206, this.field7231 + 64, this.field7220 - -850);
            if (this.field7226 != null) {
                for (int var23 = 0; var23 < this.field7226.length; var23++) {
                    var20.method638(this.field7226[var23], this.field7223[var23]);
                }
            }
            if (this.field7211 != null) {
                for (int var24 = 0; var24 < this.field7211.length; var24++) {
                    var20.method624(this.field7211[var24], this.field7233[var24]);
                }
            }
            var20.method602(var15);
            class380 var25 = this.field7229.field7201;
            synchronized (this.field7229.field7201) {
                this.field7229.field7201.method2174(var20, (long) (this.field7230 |= arg13.field7672 << 29), (byte) -115);
            }
        }
        class470 var26 = var16 == null ? var20.method649(arg12, var15, true) : var16.method1228(var15, arg1, 0, arg7, arg12, var20, true, arg10);
        if (this.field7218 != 128 || this.field7232 != 128) {
            var26.method611(this.field7218, this.field7232, this.field7218);
        }
        if (this.field7217 != 0) {
            if (this.field7217 == 90) {
                var26.method612(4096);
            }
            if (this.field7217 == 180) {
                var26.method612(8192);
            }
            if (this.field7217 == 270) {
                var26.method612(12288);
            }
        }
        if (var17) {
            var26.method645(this.field7214, this.field7216, arg8, arg9, arg5, arg11, arg2);
        }
        var26.method602(arg3);
        return var26;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[BIIIII)V")
    public static final void method2955(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7215++;
        if (arg2 > 0 && !class355.method2093(arg2, 1)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class355.method2093(arg0, 1)) {
            int var7 = class409.method2320(arg4, false);
            int var8 = 0;
            if (arg3 > -37) {
                method2955(-17, null, -105, -109, 28, -120, -42);
            }
            int var9 = arg0 > arg2 ? arg2 : arg0;
            int var10 = arg2 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg1;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg6, arg2, arg0, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg2 = var10;
                var12 = var16;
                arg0 = var11;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILr;ILtfa;I)Lda;")
    public final class470 method2956(int arg0, int arg1, int arg2, class562 arg3, int arg4, class288 arg5, int arg6) {
        field7224++;
        return arg0 <= 82 ? null : this.method2954(-68, arg4, 0, arg2, false, 0, arg5, arg6, null, null, arg1, 0, (byte) 5, arg3);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ltfa;Li;ILr;IIZIIILi;II)Lda;")
    public final class470 method2957(class288 arg0, class270 arg1, int arg2, class562 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class270 arg10, int arg11, int arg12) {
        field7225++;
        if (arg5 < 36) {
            this.field7226 = null;
        }
        return this.method2954(-80, arg8, arg9, arg2, arg6, arg12, arg0, arg4, arg10, arg1, arg11, arg7, (byte) 2, arg3);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIILtfa;IILr;)Lda;")
    public final class470 method2958(byte arg0, int arg1, int arg2, class288 arg3, int arg4, int arg5, class562 arg6) {
        if (arg0 != 45) {
            this.method2957(null, null, -41, null, -44, 43, true, 116, -75, -68, null, 11, 47);
        }
        field7212++;
        return this.method2954(96, arg2, 0, arg5, false, 0, arg3, arg1, null, null, arg4, 0, (byte) 2, arg6);
    }
}
