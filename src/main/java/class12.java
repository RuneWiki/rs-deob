import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class12 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
    private int[] field173;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
    private int[] field184;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lc;")
    private class23 field179;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lc;")
    private class23 field170;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[Lc;")
    private class23[] field168;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lid;")
    public static class92 field174 = new class92(64);

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Li;")
    public static class88 field182 = class208.method1425(105, "<col=00ff00>");

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field183 = 100;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lnb;")
    public static class144 field177;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lbj;")
    public static class22 field172;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lgi;")
    public static class75 field175;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class95 var20 = new class95(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class29.field489[var21][arg1][arg2] == null) {
                    class29.field489[var21][arg1][arg2] = new class52(var21, arg1, arg2);
                }
            }
            class29.field489[arg0][arg1][arg2].field947 = var20;
        } else if (arg3 == 1) {
            class95 var22 = new class95(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class29.field489[var23][arg1][arg2] == null) {
                    class29.field489[var23][arg1][arg2] = new class52(var23, arg1, arg2);
                }
            }
            class29.field489[arg0][arg1][arg2].field947 = var22;
        } else {
            class56 var24 = new class56(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class29.field489[var25][arg1][arg2] == null) {
                    class29.field489[var25][arg1][arg2] = new class52(var25, arg1, arg2);
                }
            }
            class29.field489[arg0][arg1][arg2].field964 = var24;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static void method59(boolean arg0) {
        field177 = null;
        field174 = null;
        field182 = null;
        if (!arg0) {
            field172 = null;
        }
        field175 = null;
        field172 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(DIZLnb;Lfe;IIZ)[I")
    public final int[] method60(double arg0, int arg1, boolean arg2, class144 arg3, class61 arg4, int arg5, int arg6, boolean arg7) {
        class44.method282(arg0, (byte) -125);
        class244.field4490 = arg4;
        class39.field684 = arg3;
        class118.method804(arg1, 75, arg5);
        field171++;
        for (int var10 = 0; var10 < this.field168.length; var10++) {
            this.field168[var10].method128((byte) -126, arg1, arg5);
        }
        int[] var11 = new int[arg1 * arg5];
        if (arg6 != 255) {
            return null;
        }
        int var12;
        int var13;
        byte var14;
        if (arg7) {
            var12 = -1;
            var13 = arg1 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = arg1;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field179.field369) {
                int[] var22 = this.field179.method54(var16, (byte) 27);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field179.method7(var16, (byte) 13);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class174.field3509[var24];
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = var21[var23] >> 4;
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var27 > 255) {
                    var27 = 255;
                }
                int var28 = class174.field3509[var26];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class174.field3509[var27];
                var11[var15++] = (var25 << 16) + (var28 << 8) + var29;
                if (arg2) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field168.length; var17++) {
            this.field168[var17].method127(arg6 - 25866);
        }
        return var11;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Z")
    public static final boolean method61(int arg0) {
        field178++;
        try {
            if (arg0 > -78) {
                field183 = -44;
            }
            return class236.method1568(true);
        } catch (IOException var4) {
            class201.method1382(80);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class238.field4432 + "," + class46.field821 + "," + class88.field1634 + " - " + class228.field4272 + "," + (class240.field4458.field4089[0] + class223.field4214) + "," + (class240.field4458.field4143[0] + class190.field3681) + " - ";
            for (int var3 = 0; class228.field4272 > var3 && var3 < 50; var3++) {
                var2 = var2 + class230.field4314.field842[var3] + ",";
            }
            class221.method1490((byte) 0, var2, var5);
            class115.method787((byte) -123);
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lea;I)Lgh;")
    public static final class74 method62(class46 arg0, int arg1) {
        if (arg1 >= -47) {
            method58(-51, 31, 123, -22, 116, -47, 31, -64, -53, 52, -116, -75, -64, -5, -109, 94, -11, -123, -36, 116);
        }
        field169++;
        return new class74(arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method304(-29629), arg0.method304(-29629), arg0.method347(26119));
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lfe;Lnb;I)Z")
    public final boolean method63(class61 arg0, class144 arg1, int arg2) {
        field181++;
        if (arg2 > -11) {
            this.field170 = null;
        }
        for (int var4 = 0; var4 < this.field173.length; var4++) {
            if (!arg1.method955(0, this.field173[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field184.length; var5++) {
            if (!arg0.method439(this.field184[var5], (byte) -27)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)V")
    public static final void method64(int arg0, long arg1) {
        field176++;
        if (arg1 == 0L) {
            return;
        }
        if (class146.field2731 >= 100 && class6.field72 != 1 || class146.field2731 >= 200) {
            class223.method1501(class225.field4232, 12, 0, class174.field3455);
        } else if (arg0 <= -14) {
            class88 var3 = class200.method1377(arg1, (byte) 99).method614((byte) 83);
            for (int var4 = 0; var4 < class146.field2731; var4++) {
                if (class115.field2088[var4] == arg1) {
                    class223.method1501(class166.method1142(new class88[] { var3, class1.field8 }, -3), 12, 0, class174.field3455);
                    return;
                }
            }
            for (int var5 = 0; var5 < class67.field1221; var5++) {
                if (class95.field1765[var5] == arg1) {
                    class223.method1501(class166.method1142(new class88[] { class109.field1980, var3, class226.field4247 }, -3), 12, 0, class174.field3455);
                    return;
                }
            }
            if (var3.method597(-122, class240.field4458.field766)) {
                class223.method1501(class24.field395, 12, 0, class174.field3455);
            } else {
                class90.field1712++;
                class23.field370[class146.field2731] = var3;
                class115.field2088[class146.field2731] = arg1;
                class160.field3094[class146.field2731] = 0;
                class168.field3240[class146.field2731] = class174.field3455;
                class46.field845[class146.field2731] = 0;
                class59.field1120[class146.field2731] = false;
                class20.field313 = class67.field1211;
                class146.field2731++;
                class146.field2749.method30((byte) -66, 82);
                class146.field2749.method328(arg1, (byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILq;B)V")
    public static final void method65(int arg0, int arg1, class174 arg2, byte arg3) {
        if (arg2.field3370 == 1) {
            class103.field1859++;
            class98.method687(9746, 0, arg2.field3462, (short) 11, 0L, class174.field3455, arg2.field3425);
        }
        field180++;
        if (arg3 < 47) {
            method65(27, 118, null, (byte) -116);
        }
        if (arg2.field3370 == 2 && !class10.field145) {
            class88 var4 = class194.method1347(arg2, -2);
            if (var4 != null) {
                class98.method687(9746, -1, var4, (short) 15, 0L, class166.method1142(new class88[] { field182, arg2.field3461 }, -3), arg2.field3425);
                class111.field2025++;
            }
        }
        if (arg2.field3370 == 3) {
            class98.method687(9746, 0, class33.field530, (short) 14, 0L, class174.field3455, arg2.field3425);
            class204.field3888++;
        }
        if (arg2.field3370 == 4) {
            class146.field2738++;
            class98.method687(9746, 0, arg2.field3462, (short) 36, 0L, class174.field3455, arg2.field3425);
        }
        if (arg2.field3370 == 5) {
            class98.method687(9746, 0, arg2.field3462, (short) 20, 0L, class174.field3455, arg2.field3425);
            class90.field1700++;
        }
        if (arg2.field3370 == 6 && class53.field967 == null) {
            class9.field134++;
            class98.method687(9746, -1, arg2.field3462, (short) 47, 0L, class174.field3455, arg2.field3425);
        }
        if (arg2.field3392 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3420; var6++) {
                for (int var7 = 0; var7 < arg2.field3503; var7++) {
                    int var8 = (arg2.field3510 + 32) * var6;
                    int var9 = (arg2.field3468 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg2.field3399[var5];
                        var9 += arg2.field3474[var5];
                    }
                    if (arg1 >= var9 && arg0 >= var8 && var9 + 32 > arg1 && var8 + 32 > arg0) {
                        class225.field4231 = arg2;
                        class172.field3335 = var5;
                        if (arg2.field3390[var5] > 0) {
                            class149 var10 = class71.method472(arg2.field3390[var5] - 1, (byte) -100);
                            if (class28.field475 == 1 && class60.method431((byte) -25, class80.method530(-881710560, arg2))) {
                                if (class209.field3967 != arg2.field3425 || class58.field1105 != var5) {
                                    class98.field1799++;
                                    class98.method687(9746, var5, class35.field608, (short) 42, (long) var10.field2846, class166.method1142(new class88[] { class78.field1414, class34.field581, var10.field2894 }, -3), arg2.field3425);
                                }
                            } else if (!class10.field145 || !class60.method431((byte) -87, class80.method530(-881710560, arg2))) {
                                class141.field2603++;
                                class88[] var11 = var10.field2906;
                                if (class99.field1809) {
                                    var11 = class138.method923(var11, (byte) 62);
                                }
                                if (class60.method431((byte) -22, class80.method530(-881710560, arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 21;
                                            } else {
                                                var13 = 18;
                                            }
                                            class98.method687(9746, var5, var11[var12], var13, (long) var10.field2846, class166.method1142(new class88[] { class136.field2531, var10.field2894 }, -3), arg2.field3425);
                                            class147.field2764++;
                                        } else if (var12 == 4) {
                                            class116.field2108++;
                                            class98.method687(9746, var5, class221.field4173, (short) 18, (long) var10.field2846, class166.method1142(new class88[] { class136.field2531, var10.field2894 }, -3), arg2.field3425);
                                        }
                                    }
                                }
                                if (class6.method27(class80.method530(-881710560, arg2), (byte) -76)) {
                                    class98.method687(9746, var5, class35.field608, (short) 12, (long) var10.field2846, class166.method1142(new class88[] { class136.field2531, var10.field2894 }, -3), arg2.field3425);
                                    class71.field1310++;
                                }
                                if (class60.method431((byte) 127, class80.method530(-881710560, arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class16.field236++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 28;
                                            }
                                            if (var14 == 1) {
                                                var15 = 9;
                                            }
                                            if (var14 == 2) {
                                                var15 = 2;
                                            }
                                            class98.method687(9746, var5, var11[var14], var15, (long) var10.field2846, class166.method1142(new class88[] { class136.field2531, var10.field2894 }, -3), arg2.field3425);
                                        }
                                    }
                                }
                                class88[] var16 = arg2.field3513;
                                if (class99.field1809) {
                                    var16 = class138.method923(var16, (byte) -114);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class208.field3946++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 6;
                                            }
                                            if (var17 == 1) {
                                                var18 = 8;
                                            }
                                            if (var17 == 2) {
                                                var18 = 49;
                                            }
                                            if (var17 == 3) {
                                                var18 = 44;
                                            }
                                            if (var17 == 4) {
                                                var18 = 13;
                                            }
                                            class98.method687(9746, var5, var16[var17], var18, (long) var10.field2846, class166.method1142(new class88[] { class136.field2531, var10.field2894 }, -3), arg2.field3425);
                                        }
                                    }
                                }
                                class98.method687(9746, var5, class65.field1174, (short) 1001, (long) var10.field2846, class166.method1142(new class88[] { class136.field2531, var10.field2894 }, -3), arg2.field3425);
                            } else if ((class115.field2086 & 0x10) == 16) {
                                class166.field3189++;
                                class98.method687(9746, var5, class201.field3837, (short) 39, (long) var10.field2846, class166.method1142(new class88[] { class28.field464, class34.field581, var10.field2894 }, -3), arg2.field3425);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3412) {
            return;
        }
        if (!class10.field145) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class88 var23 = class222.method1496(arg2, (byte) 103, var19);
                if (var23 != null) {
                    class188.field3658++;
                    class98.method687(9746, arg2.field3408, var23, (short) 1003, (long) (var19 + 1), arg2.field3459, arg2.field3425);
                }
            }
            class88 var20 = class194.method1347(arg2, -2);
            if (var20 != null) {
                class98.method687(9746, arg2.field3408, var20, (short) 15, 0L, arg2.field3459, arg2.field3425);
                class111.field2025++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class88 var22 = class222.method1496(arg2, (byte) 108, var21);
                if (var22 != null) {
                    class188.field3658++;
                    class98.method687(9746, arg2.field3408, var22, (short) 43, (long) (var21 + 1), arg2.field3459, arg2.field3425);
                }
            }
            if (class229.method1528(class80.method530(-881710560, arg2), 1)) {
                class9.field134++;
                class98.method687(9746, arg2.field3408, class189.field3667, (short) 47, 0L, class174.field3455, arg2.field3425);
                return;
            }
            return;
        }
        if (class31.method201(class80.method530(-881710560, arg2), 29186) && (class115.field2086 & 0x20) == 32) {
            class227.field4256++;
            class98.method687(9746, arg2.field3408, class201.field3837, (short) 40, 0L, class166.method1142(new class88[] { class28.field464, class248.field4550, arg2.field3459 }, -3), arg2.field3425);
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class12() {
        this.field173 = new int[0];
        this.field184 = new int[0];
        this.field179 = new class172();
        this.field179.field363 = 1;
        this.field170 = new class172();
        this.field168 = new class23[] { this.field179, this.field170 };
        this.field170.field363 = 1;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lea;)V")
    public class12(class46 arg0) {
        int var2 = arg0.method347(26119);
        this.field168 = new class23[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class23 var16 = class94.method675(0, arg0);
            if (var16.method124(-1) >= 0) {
                var4++;
            }
            if (var16.method129(-285853214) >= 0) {
                var3++;
            }
            int var17 = var16.field376.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method347(26119);
            }
            this.field168[var6] = var16;
        }
        this.field173 = new int[var4];
        this.field184 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class23 var11 = this.field168[var9];
            int var12 = var11.field376.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field376[var13] = this.field168[var5[var9][var13]];
            }
            int var14 = var11.method124(-1);
            int var15 = var11.method129(-285853214);
            if (var14 > 0) {
                this.field173[var7++] = var14;
            }
            if (var15 > 0) {
                this.field184[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field179 = this.field168[arg0.method347(26119)];
        this.field170 = this.field168[arg0.method347(26119)];
    }
}
