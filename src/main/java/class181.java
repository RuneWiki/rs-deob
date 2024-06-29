import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class181 implements class93 {

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Lfa;")
    private class98 field2875 = new class98(256);

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Ljd;")
    private class95 field2873;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Ljd;")
    private class95 field2878;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "[Lib;")
    private class67[] field2877;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2869 = "shake:";

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[C")
    public static char[] field2872 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Ljd;")
    public static class95 field2871;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "[I")
    public static int[] field2870;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)Lfb;", line = 9)
    public class308 method1349(int arg0, byte arg1) {
        field2880++;
        class325 var3 = this.field2875.method730((long) arg0, (byte) 90);
        if (var3 != null) {
            return (class308) var3;
        }
        byte[] var4 = this.field2878.method715((byte) 38, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg1 != -73) {
            this.field2877 = (class67[]) null;
        }
        class308 var5 = new class308(new class254(var4));
        this.field2875.method734((byte) -14, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIILfc;JLfc;Lfc;)V", line = 34)
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, class110 arg4, long arg5, class110 arg6, class110 arg7) {
        class91 var9 = new class91();
        var9.field1319 = arg4;
        var9.field1324 = arg1 * 128 + 64;
        var9.field1316 = arg2 * 128 + 64;
        var9.field1317 = arg3;
        var9.field1318 = arg5;
        var9.field1322 = arg6;
        var9.field1315 = arg7;
        int var10 = 0;
        class79 var11 = class213.field3262[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1169; var12++) {
                class228 var13 = var11.field1157[var12];
                if ((var13.field3482 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3480.method565();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1320 = -var10;
        if (class213.field3262[arg0][arg1][arg2] == null) {
            class213.field3262[arg0][arg1][arg2] = new class79(arg0, arg1, arg2);
        }
        class213.field3262[arg0][arg1][arg2].field1154 = var9;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Z", line = 80)
    public final boolean method678(int arg0, int arg1) {
        field2881++;
        class308 var3 = this.method1349(arg1, (byte) -73);
        if (arg0 == 3) {
            return var3 != null && var3.method2117(this.field2873, 0, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZFIIZI)[I", line = 93)
    public final int[] method677(boolean arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2867++;
        return arg0 ? this.method1349(arg5, (byte) -73).method2116((byte) 97, arg3, this.field2873, this.field2877[arg5].field968, arg4, this, (double) arg1, arg2) : (int[]) null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lmn;IIB)V", line = 104)
    public static final void method1351(class161 arg0, int arg1, int arg2, byte arg3) {
        field2865++;
        if (arg0.field2508 == 1) {
            class214.field3282++;
            class202.method1463((short) 10, arg0.field2615, 0L, -1, 0, arg3 ^ 0xFFFFFFBB, "", arg0.field2442);
        }
        if (arg0.field2508 == 2 && !class7.field110) {
            String var4 = class28.method214((byte) -122, arg0);
            if (var4 != null) {
                class202.method1463((short) 31, arg0.field2615, 0L, -1, -1, -127, "<col=00ff00>" + arg0.field2620, var4);
                class290.field4470++;
            }
        }
        if (arg0.field2508 == 3) {
            class202.method1463((short) 45, arg0.field2615, 0L, -1, 0, -126, "", class59.field780);
            class38.field557++;
        }
        if (arg0.field2508 == 4) {
            class202.method1463((short) 48, arg0.field2615, 0L, -1, 0, -59, "", arg0.field2442);
            class114.field1798++;
        }
        if (arg0.field2508 == 5) {
            class202.method1463((short) 50, arg0.field2615, 0L, -1, 0, -74, "", arg0.field2442);
            class151.field2286++;
        }
        if (arg3 != 1) {
            method1350(4, -96, 17, 120, (class110) null, -10L, (class110) null, (class110) null);
        }
        if (arg0.field2508 == 6 && class29.field352 == null) {
            class122.field1873++;
            class202.method1463((short) 51, arg0.field2615, 0L, -1, -1, -124, "", arg0.field2442);
        }
        if (arg0.field2590 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2462; var6++) {
                for (int var7 = 0; var7 < arg0.field2576; var7++) {
                    int var8 = (arg0.field2493 + 32) * var7;
                    int var9 = (arg0.field2497 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field2504[var5];
                        var8 += arg0.field2567[var5];
                    }
                    if (arg2 >= var8 && var9 <= arg1 && arg2 < (var8 + 32) && arg1 < (var9 + 32)) {
                        class322.field4971 = arg0;
                        class30.field358 = var5;
                        if (arg0.field2487[var5] > 0) {
                            class4 var10 = client.method1012(arg0);
                            class108 var11 = class222.method1576(arg0.field2487[var5] - 1, (byte) 92);
                            if (class320.field4939 == 1 && var10.method36(arg3 ^ 0x573684D1)) {
                                if (class171.field2759 != arg0.field2615 || class318.field4911 != var5) {
                                    class202.method1463((short) 21, arg0.field2615, (long) var11.field1598, -1, var5, -45, class170.field2757 + " -> <col=ff9040>" + var11.field1630, class201.field3092);
                                    class248.field3736++;
                                }
                            } else if (class7.field110 && var10.method36(1463190736)) {
                                class21 var12 = class280.field4352 == -1 ? null : class111.method851(class280.field4352, arg3 + 10);
                                if ((class201.field3098 & 0x10) != 0 && (var12 == null || var11.method822((byte) 68, class280.field4352, var12.field239) != var12.field239)) {
                                    class328.field5062++;
                                    class202.method1463((short) 16, arg0.field2615, (long) var11.field1598, class242.field3685, var5, arg3 ^ 0xFFFFFFDE, class267.field4153 + " -> <col=ff9040>" + var11.field1630, class60.field794);
                                }
                            } else {
                                class213.field3270++;
                                String[] var13 = var11.field1611;
                                if (class341.field5299) {
                                    var13 = class245.method1686(var13, 2048);
                                }
                                if (var10.method36(1463190736)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class82.field1210++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 30;
                                            } else {
                                                var15 = 23;
                                            }
                                            class202.method1463(var15, arg0.field2615, (long) var11.field1598, -1, var5, -45, "<col=ff9040>" + var11.field1630, var13[var14]);
                                        }
                                    }
                                }
                                if (var10.method37(true)) {
                                    class97.field1399++;
                                    class202.method1463((short) 47, arg0.field2615, (long) var11.field1598, class314.field4864, var5, -92, "<col=ff9040>" + var11.field1630, class201.field3092);
                                }
                                if (var10.method36(1463190736) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            class277.field4293++;
                                            if (var16 == 0) {
                                                var17 = 40;
                                            }
                                            if (var16 == 1) {
                                                var17 = 4;
                                            }
                                            if (var16 == 2) {
                                                var17 = 2;
                                            }
                                            class202.method1463(var17, arg0.field2615, (long) var11.field1598, -1, var5, arg3 ^ 0xFFFFFF8E, "<col=ff9040>" + var11.field1630, var13[var16]);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2552;
                                if (class341.field5299) {
                                    var18 = class245.method1686(var18, 2048);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class141.field2170++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 57;
                                            }
                                            if (var19 == 1) {
                                                var20 = 18;
                                            }
                                            if (var19 == 2) {
                                                var20 = 33;
                                            }
                                            if (var19 == 3) {
                                                var20 = 49;
                                            }
                                            if (var19 == 4) {
                                                var20 = 7;
                                            }
                                            class202.method1463(var20, arg0.field2615, (long) var11.field1598, -1, var5, -57, "<col=ff9040>" + var11.field1630, var18[var19]);
                                        }
                                    }
                                }
                                class202.method1463((short) 1003, arg0.field2615, (long) var11.field1598, class283.field4410, var5, -73, "<col=ff9040>" + var11.field1630, class133.field2032);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2550) {
            return;
        }
        if (!class7.field110) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class210.method1503(arg0, var21, false);
                if (var22 != null) {
                    class232.field3534++;
                    class202.method1463((short) 1007, arg0.field2615, (long) (var21 + 1), class270.method1887(arg0, arg3 - 16186, var21), arg0.field2510, arg3 - 101, arg0.field2545, var22);
                }
            }
            String var23 = class28.method214((byte) -124, arg0);
            if (var23 != null) {
                class202.method1463((short) 31, arg0.field2615, 0L, -1, arg0.field2510, arg3 - 111, arg0.field2545, var23);
                class290.field4470++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class210.method1503(arg0, var24, false);
                if (var25 != null) {
                    class202.method1463((short) 29, arg0.field2615, (long) (var24 + 1), class270.method1887(arg0, -16185, var24), arg0.field2510, -112, arg0.field2545, var25);
                    class232.field3534++;
                }
            }
            if (client.method1012(arg0).method24(arg3 ^ 0x40)) {
                if (arg0.field2527 == null) {
                    class202.method1463((short) 51, arg0.field2615, 0L, -1, arg0.field2510, -128, "", class201.field3073);
                } else {
                    class202.method1463((short) 51, arg0.field2615, 0L, -1, arg0.field2510, -67, "", arg0.field2527);
                }
                class122.field1873++;
            }
        } else if (client.method1012(arg0).method22(arg3 - 124) && (class201.field3098 & 0x20) != 0) {
            class202.method1463((short) 34, arg0.field2615, 0L, class242.field3685, arg0.field2510, -46, class267.field4153 + " -> " + arg0.field2545, class60.field794);
            class213.field3278++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)I", line = 422)
    public static final int method1352(boolean arg0) {
        if (arg0) {
            return 51;
        } else {
            field2876++;
            return class4.field45.method753(0);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 434)
    public static void method1353(int arg0) {
        field2871 = null;
        field2869 = null;
        field2872 = null;
        field2870 = null;
        if (arg0 != -3748) {
            method1353(93);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Lib;", line = 454)
    public final class67 method679(byte arg0, int arg1) {
        if (arg0 != -74) {
            this.method679((byte) -60, -20);
        }
        field2879++;
        return this.field2877[arg1];
    }

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "(II)Lve;", line = 466)
    public static final class223 method1354(int arg0, int arg1) {
        field2874++;
        class223 var2 = (class223) class172.field2769.method730((long) arg0, (byte) 90);
        if (var2 != null) {
            return var2;
        }
        int var3 = 11 % ((arg1 + 71) / 48);
        byte[] var4;
        if (arg0 < 32768) {
            var4 = class60.field796.method696(arg0, (byte) 107, 1);
        } else {
            var4 = class293.field4527.method696(arg0 & 0x7FFF, (byte) 95, 1);
        }
        class223 var5 = new class223();
        if (var4 != null) {
            var5.method1585(0, new class254(var4));
        }
        if (arg0 >= 32768) {
            var5.method1591(true);
        }
        class172.field2769.method734((byte) -14, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "(II)I", line = 496)
    public static int method1355(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIZI)V", line = 503)
    public static final void method1356(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class303.field4636 = 0L;
        int var5 = class63.method431(1);
        field2868++;
        boolean var6 = false;
        if (arg1 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (arg1 <= 0 == var5 > 0) {
            var6 = true;
        }
        if (class6.field101.startsWith("mac") && arg1 > 0) {
            arg3 = true;
        }
        if (arg3 && arg1 > 0) {
            var6 = true;
        }
        if (arg2 > -53) {
            field2872 = (char[]) null;
        }
        class231.method1629(arg3, arg0, (byte) 111, arg4, var5, var6, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljd;Ljd;Ljd;)V", line = 544)
    public class181(class95 arg0, class95 arg1, class95 arg2) {
        this.field2873 = arg2;
        this.field2878 = arg1;
        class254 var4 = new class254(arg0.method696(0, (byte) 101, 0));
        int var5 = var4.method1755(false);
        this.field2877 = new class67[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1774((byte) -1) == 1) {
                this.field2877[var6] = new class67();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2877[var7] != null) {
                this.field2877[var7].field971 = var4.method1774((byte) 52) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2877[var8] != null) {
                this.field2877[var8].field961 = var4.method1774((byte) -97) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2877[var9] != null) {
                this.field2877[var9].field962 = var4.method1774((byte) -111) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2877[var10] != null) {
                this.field2877[var10].field973 = var4.method1774((byte) -127) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2877[var11] != null) {
                this.field2877[var11].field965 = var4.method1733(2023893896);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2877[var12] != null) {
                this.field2877[var12].field958 = var4.method1733(2023893896);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2877[var13] != null) {
                this.field2877[var13].field974 = var4.method1733(2023893896);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2877[var14] != null) {
                this.field2877[var14].field963 = var4.method1733(2023893896);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2877[var15] != null) {
                this.field2877[var15].field969 = (short) var4.method1755(false);
            }
        }
        if (var4.field3840.length > var4.field3866) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2877[var16] != null) {
                    var4.method1733(2023893896);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2877[var17] != null) {
                    var4.method1733(2023893896);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2877[var18] != null) {
                    var4.method1774((byte) 83);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2877[var19] != null) {
                    this.field2877[var19].field968 = var4.method1774((byte) 107) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2877[var20] != null) {
                    var4.method1733(2023893896);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2877[var21] != null) {
                    var4.method1774((byte) -121);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2877[var22] != null) {
                    var4.method1774((byte) -119);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2877[var23] != null) {
                    var4.method1774((byte) -96);
                }
            }
        }
    }
}
