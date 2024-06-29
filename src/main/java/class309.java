import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class309 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lml;")
    private class142 field4771;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "La;")
    private class289 field4790;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lgf;")
    private class9 field4784;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Z")
    public static boolean field4772 = false;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[I")
    public static int[] field4785 = new int[2];

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[I")
    public static int[] field4778 = new int[5];

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Z")
    public static boolean field4783 = false;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Z")
    public static volatile boolean field4789 = true;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4779 = "wishes to trade with you.";

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lp;")
    private class107 field4781;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[Lti;")
    private class236[] field4770;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIIII)V", line = 4)
    public static final void method2163(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4773++;
        if (arg0 >= -24) {
            return;
        }
        for (int var6 = arg2; var6 <= (arg1 + arg2); var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class292.field4586[arg5][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg2; var8 < (arg1 + arg2); var8++) {
            for (int var9 = arg3; var9 < arg3 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class167.field2324[arg5][var9][var8] = arg5 > 0 ? class167.field2324[arg5 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg2 + 1; var10 < (arg1 + arg2); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class167.field2324[arg5][arg3][var10] = class167.field2324[arg5][arg3 - 1][var10];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var11 = arg3 + 1; var11 < arg3 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class167.field2324[arg5][var11][arg2] = class167.field2324[arg5][var11][arg2 - 1];
                }
            }
        }
        if (arg3 < 0 || arg2 < 0 || arg3 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 > 0 && class167.field2324[arg5][arg3 - 1][arg2] != 0) {
                class167.field2324[arg5][arg3][arg2] = class167.field2324[arg5][arg3 - 1][arg2];
            } else if (arg2 > 0 && class167.field2324[arg5][arg3][arg2 - 1] != 0) {
                class167.field2324[arg5][arg3][arg2] = class167.field2324[arg5][arg3][arg2 - 1];
            } else if (arg3 > 0 && arg2 > 0 && class167.field2324[arg5][arg3 - 1][arg2 - 1] != 0) {
                class167.field2324[arg5][arg3][arg2] = class167.field2324[arg5][arg3 - 1][arg2 - 1];
            }
        } else if (arg3 > 0 && class167.field2324[arg5 - 1][arg3 - 1][arg2] != class167.field2324[arg5][arg3 - 1][arg2]) {
            class167.field2324[arg5][arg3][arg2] = class167.field2324[arg5][arg3 - 1][arg2];
        } else if (arg2 > 0 && class167.field2324[arg5 - 1][arg3][arg2 - 1] != class167.field2324[arg5][arg3][arg2 - 1]) {
            class167.field2324[arg5][arg3][arg2] = class167.field2324[arg5][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class167.field2324[arg5][arg3 - 1][arg2 - 1] != class167.field2324[arg5 - 1][arg3 - 1][arg2 - 1]) {
            class167.field2324[arg5][arg3][arg2] = class167.field2324[arg5][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 125)
    public static final int method2164(String arg0, byte arg1) {
        field4775++;
        if (arg1 != 117) {
            method2176(-44, -49, 56);
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z", line = 136)
    public final boolean method2165(int arg0) {
        field4786++;
        if (this.field4781 != null) {
            return true;
        }
        if (this.field4784 == null) {
            if (this.field4771.method940((byte) -112)) {
                return false;
            }
            this.field4784 = this.field4771.method954(255, 255, (byte) -112, true, (byte) 0);
        }
        if (this.field4784.field2578) {
            return false;
        }
        this.field4781 = new class107(this.field4784.method45(116));
        this.field4770 = new class236[(this.field4781.field1388.length - 5) / 8];
        if (arg0 != -4558) {
            method2163((byte) 11, 61, 3, -21, 123, 2);
        }
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZILjg;ILjg;)Lti;", line = 166)
    private final class236 method2166(boolean arg0, int arg1, class315 arg2, int arg3, class315 arg4) {
        field4782++;
        if (this.field4781 == null) {
            throw new RuntimeException();
        }
        this.field4781.field1400 = arg3 * 8 + 5;
        if (this.field4781.field1400 >= this.field4781.field1388.length) {
            throw new RuntimeException();
        } else if (this.field4770[arg3] == null) {
            int var6 = this.field4781.method676(true);
            int var7 = this.field4781.method676(true);
            if (arg1 < 43) {
                field4779 = (String) null;
            }
            class236 var8 = new class236(arg3, arg4, arg2, this.field4771, this.field4790, var6, var7, arg0);
            this.field4770[arg3] = var8;
            return var8;
        } else {
            return this.field4770[arg3];
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljg;IILjg;)Lti;", line = 207)
    public final class236 method2167(class315 arg0, int arg1, int arg2, class315 arg3) {
        if (arg1 != -1) {
            this.method2166(true, 27, (class315) null, -73, (class315) null);
        }
        field4774++;
        return this.method2166(true, 69, arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V", line = 220)
    public static final void method2168(byte arg0, int arg1) {
        field4787++;
        class345.field5346.method1236(-495037017, arg1);
        if (arg0 != 0) {
            field4789 = true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 234)
    public final void method2169(byte arg0) {
        field4777++;
        if (this.field4770 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4770.length; var2++) {
            if (this.field4770[var2] != null) {
                this.field4770[var2].method1686((byte) 56);
            }
        }
        if (arg0 <= 39) {
            method2168((byte) -92, 73);
        }
        for (int var3 = 0; var3 < this.field4770.length; var3++) {
            if (this.field4770[var3] != null) {
                this.field4770[var3].method1681((byte) 62);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZI)V", line = 270)
    public static final void method2170(int arg0, boolean arg1, int arg2) {
        class205.field2872++;
        class140.field1954.method573(119, 29);
        if (arg1) {
            method2170(126, false, -94);
        }
        field4791++;
        class140.field1954.method642(-128, arg2);
        class140.field1954.method680(arg0, (byte) -85);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIBIIII)V", line = 291)
    public static final void method2171(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4769++;
        if (arg6 == arg7) {
            method2175(arg5, arg0, arg1, arg4, 26480, arg7, arg2);
            return;
        }
        if ((arg1 - arg7) >= class109.field1494 && arg1 + arg7 <= class56.field678 && (arg0 - arg6) >= class272.field4273 && (arg0 + arg6) <= class248.field3759) {
            class137.method914(arg1, arg0, arg6, arg2, arg5, arg4, -1, arg7);
        } else {
            class236.method1674(arg6, arg5, arg7, (byte) -102, arg2, arg0, arg4, arg1);
        }
        int var8 = 17 / ((arg3 - 47) / 52);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 319)
    public static final void method2172(byte arg0) {
        field4776++;
        class262.method1886(0, 3, 0);
        if (arg0 > -57) {
            field4783 = true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[[FIIBLgj;II[[II[[FZF[[FI[[III)I", line = 336)
    public static final int method2173(int arg0, float[][] arg1, int arg2, int arg3, byte arg4, class245 arg5, int arg6, int arg7, int[][] arg8, int arg9, float[][] arg10, boolean arg11, float arg12, float[][] arg13, int arg14, int[][] arg15, int arg16, int arg17) {
        field4788++;
        if (arg17 == 1) {
            int var18 = arg6;
            arg6 = arg16;
            arg16 = 128 - var18;
        } else if (arg17 == 2) {
            arg6 = 128 - arg6;
            arg16 = 128 - arg16;
        } else if (arg17 == 3) {
            int var19 = arg6;
            arg6 = 128 - arg16;
            arg16 = var19;
        }
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg6 == 0 && arg16 == 0) {
            var20 = arg1[arg3][arg7];
            var21 = arg13[arg3][arg7];
            var22 = arg0;
            var23 = arg10[arg3][arg7];
        } else if (arg6 == 128 && arg16 == 0) {
            var20 = arg1[arg3 + 1][arg7];
            var22 = arg14;
            var23 = arg10[arg3 + 1][arg7];
            var21 = arg13[arg3 + 1][arg7];
        } else if (arg6 == 128 && arg16 == 128) {
            var22 = arg2;
            var23 = arg10[arg3 + 1][arg7 + 1];
            var21 = arg13[arg3 + 1][arg7 + 1];
            var20 = arg1[arg3 + 1][arg7 + 1];
        } else if (arg6 == 0 && arg16 == 128) {
            var22 = arg9;
            var23 = arg10[arg3][arg7 + 1];
            var20 = arg1[arg3][arg7 + 1];
            var21 = arg13[arg3][arg7 + 1];
        } else {
            float var24 = arg10[arg3][arg7];
            float var25 = arg13[arg3][arg7];
            float var26 = (float) arg6 / 128.0F;
            float var27 = (float) arg16 / 128.0F;
            float var28 = arg1[arg3][arg7];
            float var29 = arg13[arg3][arg7 + 1];
            float var30 = (arg10[arg3 + 1][arg7] - var24) * var26 + var24;
            float var31 = (arg13[arg3 + 1][arg7 + 1] - var29) * var26 + var29;
            float var32 = (arg13[arg3 + 1][arg7] - var25) * var26 + var25;
            float var33 = arg10[arg3][arg7 + 1];
            float var34 = (arg10[arg3 + 1][arg7 + 1] - var33) * var26 + var33;
            float var35 = (arg1[arg3 + 1][arg7] - var28) * var26 + var28;
            var21 = (var31 - var32) * var27 + var32;
            var23 = (var34 - var30) * var27 + var30;
            float var36 = arg1[arg3][arg7 + 1];
            float var37 = (arg1[arg3 + 1][arg7 + 1] - var36) * var26 + var36;
            int var38 = class153.method1018(arg14, true, arg0, arg6);
            int var39 = class153.method1018(arg2, true, arg9, arg6);
            var20 = (var37 - var35) * var27 + var35;
            var22 = class153.method1018(var39, true, var38, arg16);
        }
        int var40 = (arg7 << 7) + arg16;
        int var41 = (arg3 << 7) + arg6;
        int var42 = class225.method1550(arg3, false, arg6, arg7, arg8, arg16);
        return arg4 == 103 ? arg5.method1767(var41, var42, var40, var20, var21, var23, arg11 ? -256 & var22 : var22, arg15 == null ? 0.0F : (float) (var42 - class225.method1550(arg3, false, arg6, arg7, arg15, arg16)) / arg12) : -101;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 449)
    public static void method2174(int arg0) {
        field4779 = null;
        field4785 = null;
        if (arg0 < 30) {
            method2168((byte) 80, -33);
        }
        field4778 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V", line = 463)
    private static final void method2175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 26480) {
            field4785 = (int[]) null;
        }
        field4768++;
        if ((arg2 - arg5) >= class109.field1494 && arg2 + arg5 <= class56.field678 && class272.field4273 <= arg1 - arg5 && class248.field3759 >= arg1 + arg5) {
            class32.method196(arg0, arg2, arg3, arg6, arg1, arg5, (byte) -112);
        } else {
            class79.method469(arg1, 88, arg6, arg5, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z", line = 485)
    public static final boolean method2176(int arg0, int arg1, int arg2) {
        field4780++;
        if (!class140.field1951) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class175.field2535[var3] == null || class175.field2535[var3][var4] == null) {
            return false;
        }
        class263 var5 = class175.field2535[var3][var4];
        if (arg0 == arg2 && var5.field3981 == 0) {
            for (int var6 = 0; var6 < class310.field4794; var6++) {
                if (class30.field371[var6] == 50 || class30.field371[var6] == 1002 || class30.field371[var6] == 18 || class30.field371[var6] == 49 || class30.field371[var6] == 6) {
                    for (class263 var7 = class91.method530(class121.field1702[var6], 10989328); var7 != null; var7 = class258.method1871(var7, 16011)) {
                        if (var5.field4083 == var7.field4083) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class310.field4794; var8++) {
                if (class168.field2332[var8] == arg2 && class121.field1702[var8] == var5.field4083 && (class30.field371[var8] == 50 || class30.field371[var8] == 1002 || class30.field371[var8] == 18 || class30.field371[var8] == 49 || class30.field371[var8] == 6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lml;La;)V", line = 564)
    public class309(class142 arg0, class289 arg1) {
        this.field4771 = arg0;
        this.field4790 = arg1;
        if (!this.field4771.method940((byte) -106)) {
            this.field4784 = this.field4771.method954(255, 255, (byte) -112, true, (byte) 0);
        }
    }
}
