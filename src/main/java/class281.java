import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class281 {

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
    private int[] field4925;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "[I")
    private int[] field4933;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lql;")
    private class17 field4927;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lql;")
    private class17 field4931;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "[Lql;")
    private class17[] field4934;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4926 = 1;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "D")
    public static double field4929 = -1.0D;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "F")
    public static float field4924;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lfj;Lik;I)Z", line = 4)
    public final boolean method2019(class243 arg0, class262 arg1, int arg2) {
        field4918++;
        if (class182.field3342 <= 0) {
            for (int var4 = 0; var4 < this.field4933.length; var4++) {
                if (!arg1.method1861(this.field4933[var4], 117)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4933.length; var5++) {
                if (!arg1.method1885(this.field4933[var5], (byte) 124, class182.field3342)) {
                    return false;
                }
            }
        }
        for (int var6 = arg2; var6 < this.field4925.length; var6++) {
            if (!arg0.method575((byte) 77, this.field4925[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I", line = 57)
    public static final int method2020(byte arg0) {
        field4930++;
        if (arg0 > -27) {
            method2022((byte) -48);
        }
        if (class168.field3026 != null) {
            return 3;
        } else if (class231.field4051 && class60.field966) {
            return 2;
        } else if (class231.field4051 && !class60.field966) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(DZILik;Lfj;II)[B", line = 87)
    public final byte[] method2021(double arg0, boolean arg1, int arg2, class262 arg3, class243 arg4, int arg5, int arg6) {
        field4920++;
        byte[] var9 = new byte[arg5 * 4 * arg6];
        class276.method1992((byte) 108, arg0);
        class203.field3672 = arg3;
        class38.field523 = arg4;
        class316.method2199(arg6, arg5, -32527);
        for (int var10 = 0; var10 < this.field4934.length; var10++) {
            this.field4934[var10].method108((byte) -107, arg6, arg5);
        }
        int var11 = 0;
        int var12 = 0;
        int var13 = 92 % ((arg2 + 71) / 51);
        while (var12 < arg5) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4927.field225) {
                int[] var18 = this.field4927.method120(-124, var12);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field4927.method122(false, var12);
                var15 = var14[2];
                var16 = var14[0];
                var17 = var14[1];
            }
            int[] var19;
            if (this.field4931.field225) {
                var19 = this.field4931.method120(-126, var12);
            } else {
                var19 = this.field4931.method122(false, var12)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                int var23 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class81.field1272[var21];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class81.field1272[var22];
                int var26 = class81.field1272[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var26;
                var9[var11++] = (byte) var27;
                if (arg1) {
                    var11 += (arg6 << 2) - 4;
                }
            }
            var12++;
        }
        for (int var28 = 0; var28 < this.field4934.length; var28++) {
            this.field4934[var28].method107(25600);
        }
        return var9;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)Ltb;", line = 241)
    public static final class223 method2022(byte arg0) {
        if (arg0 != 16) {
            method2027(-69, -122, 22, -63, (class290) null, -99, 79L, -61, 62, -17, -97);
        }
        field4928++;
        try {
            return (class223) Class.forName("qc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIBII)V", line = 257)
    public static final void method2023(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 >= -78) {
            field4926 = -116;
        }
        if (arg0 >= 0 && arg6 >= 0 && arg0 < 103 && arg6 < 103) {
            if (arg4 == 0) {
                class174 var8 = class294.method2098(arg1, arg0, arg6);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3184 >>> 32);
                    if (arg2 == 2) {
                        var8.field3183 = new class114(var9, 2, arg3 + 4, arg1, arg0, arg6, arg7, false, var8.field3183);
                        var8.field3173 = new class114(var9, 2, arg3 + 1 & 0x3, arg1, arg0, arg6, arg7, false, var8.field3173);
                    } else {
                        var8.field3183 = new class114(var9, arg2, arg3, arg1, arg0, arg6, arg7, false, var8.field3183);
                    }
                }
            }
            if (arg4 == 1) {
                class36 var10 = class114.method813(arg1, arg0, arg6);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field502 >>> 32);
                    if (arg2 == 4 || arg2 == 5) {
                        var10.field513 = new class114(var11, 4, arg3, arg1, arg0, arg6, arg7, false, var10.field513);
                    } else if (arg2 == 6) {
                        var10.field513 = new class114(var11, 4, arg3 + 4, arg1, arg0, arg6, arg7, false, var10.field513);
                    } else if (arg2 == 7) {
                        var10.field513 = new class114(var11, 4, (arg3 + 2 & 0x3) + 4, arg1, arg0, arg6, arg7, false, var10.field513);
                    } else if (arg2 == 8) {
                        var10.field513 = new class114(var11, 4, arg3 + 4, arg1, arg0, arg6, arg7, false, var10.field513);
                        var10.field510 = new class114(var11, 4, (arg3 + 2 & 0x3) + 4, arg1, arg0, arg6, arg7, false, var10.field510);
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 11) {
                    arg2 = 10;
                }
                class326 var12 = class6.method38(arg1, arg0, arg6);
                if (var12 != null) {
                    var12.field5570 = new class114(Integer.MAX_VALUE & (int) (var12.field5563 >>> 32), arg2, arg3, arg1, arg0, arg6, arg7, false, var12.field5570);
                }
            }
            if (arg4 == 3) {
                class258 var13 = class262.method1871(arg1, arg0, arg6);
                if (var13 != null) {
                    var13.field4557 = new class114(Integer.MAX_VALUE & (int) (var13.field4560 >>> 32), 22, arg3, arg1, arg0, arg6, arg7, false, var13.field4557);
                }
            }
        }
        field4923++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZII)V", line = 353)
    public static final void method2024(boolean arg0, int arg1, int arg2) {
        field4932++;
        int var3 = 0;
        if (arg0) {
            field4926 = 60;
        }
        while (class72.field1099 > var3) {
            class7 var4 = class290.method2071((byte) -16, var3);
            if (var4 != null) {
                int var5 = var4.field77;
                if (var5 >= 0 && !class263.field4661.method567(var5, 36)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field82 >= 0) {
                    int var6 = var4.field82;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 & 0x380) + (arg1 + var6 & 0xFC00) + var7;
                    var9 = class263.field4657[class19.method128(96, 128, var8)];
                } else if (var5 >= 0) {
                    var9 = class263.field4657[class19.method128(96, 128, class263.field4661.method564(65535, var5))];
                } else if (var4.field89 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field89;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg1 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class263.field4657[class19.method128(96, 128, var12)];
                }
                class159.field2859[var3 + 1] = var9;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLik;)I", line = 441)
    public static final int method2025(byte arg0, class262 arg1) {
        field4919++;
        int var2 = 0;
        if (arg1.method1861(class328.field5604, 104)) {
            var2++;
        }
        if (arg1.method1861(class170.field3047, 104)) {
            var2++;
        }
        int var3 = 100 / ((arg0 - 64) / 41);
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(DZBZILfj;Lik;I)[I", line = 466)
    public final int[] method2026(double arg0, boolean arg1, byte arg2, boolean arg3, int arg4, class243 arg5, class262 arg6, int arg7) {
        class276.method1992((byte) 114, arg0);
        class203.field3672 = arg6;
        int[] var10 = new int[arg4 * arg7];
        class38.field523 = arg5;
        field4922++;
        class316.method2199(arg7, arg4, arg2 ^ 0xFFFF80F2);
        if (arg2 != 3) {
            return (int[]) null;
        }
        for (int var11 = 0; var11 < this.field4934.length; var11++) {
            this.field4934[var11].method108((byte) -121, arg7, arg4);
        }
        int var12;
        int var13;
        byte var14;
        if (arg1) {
            var13 = -1;
            var14 = -1;
            var12 = arg7 - 1;
        } else {
            var12 = 0;
            var13 = arg7;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4927.field225) {
                int[] var17 = this.field4927.method120(-124, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field4927.method122(false, var16);
                var20 = var21[2];
                var18 = var21[0];
                var19 = var21[1];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                int var23 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var19[var22] >> 4;
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class81.field1272[var23];
                int var26 = var20[var22] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class81.field1272[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class81.field1272[var26];
                var10[var15++] = (var25 << 16) + (var27 << 8) + var28;
                if (arg3) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field4934.length; var29++) {
            this.field4934[var29].method107(25600);
        }
        return var10;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILma;IJIIII)Z", line = 592)
    public static final boolean method2027(int arg0, int arg1, int arg2, int arg3, class290 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class121.method850(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 597)
    public class281() {
        this.field4925 = new int[0];
        this.field4933 = new int[0];
        this.field4927 = new class210();
        this.field4927.field218 = 1;
        this.field4931 = new class210();
        this.field4934 = new class17[] { this.field4927, this.field4931 };
        this.field4931.field218 = 1;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lrm;)V", line = 610)
    public class281(class249 arg0) {
        int var2 = arg0.method1731(true);
        int var3 = 0;
        this.field4934 = new class17[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class17 var7 = class25.method169((byte) 68, arg0);
            if (var7.method119(-103) >= 0) {
                var3++;
            }
            if (var7.method117((byte) -123) >= 0) {
                var4++;
            }
            int var8 = var7.field211.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1731(true);
            }
            this.field4934[var6] = var7;
        }
        this.field4925 = new int[var4];
        int var10 = 0;
        this.field4933 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class17 var13 = this.field4934[var12];
            int var14 = var13.field211.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field211[var15] = this.field4934[var5[var12][var15]];
            }
            int var16 = var13.method119(-125);
            int var17 = var13.method117((byte) -93);
            if (var16 > 0) {
                this.field4933[var11++] = var16;
            }
            if (var17 > 0) {
                this.field4925[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field4927 = this.field4934[arg0.method1731(true)];
        this.field4931 = this.field4934[arg0.method1731(true)];
    }
}
