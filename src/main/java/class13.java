import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class13 {

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lhk;")
    public static class305 field150 = new class305(0, 0);

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Z")
    public static boolean field152 = false;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lfe;")
    public class243 field144;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[Lqd;")
    public static class44[] field141;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILlb;)Z", line = 5)
    public static final boolean method100(int arg0, class211 arg1) {
        field147++;
        if (arg0 == 19461) {
            return arg1.method1531(81, class104.field1586);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZILlb;Llb;Lje;)V", line = 22)
    public static final void method101(boolean arg0, int arg1, class211 arg2, class211 arg3, class74 arg4) {
        class178.field2671 = arg3;
        field148++;
        class200.field3180 = arg0;
        class204.field3237 = arg2;
        int var5 = class204.field3237.method1513(119) - 1;
        class291.field4576 = class204.field3237.method1523(9271, var5) + var5 * 256;
        class41.field618 = arg4;
        class180.field2700 = new String[] { null, null, null, null, class204.field3243 };
        if (arg1 > -125) {
            method105(-82);
        }
        class270.field4082 = new String[] { null, null, class281.field4343, null, null };
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 46)
    public static final void method102(int arg0, int arg1) {
        if (arg0 != -6129) {
            field152 = true;
        }
        field145++;
        if (arg1 == -1 || !class261.field3867[arg1]) {
            return;
        }
        class37.field563.method1520(141, arg1);
        if (class305.field4779[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class305.field4779[arg1].length; var3++) {
            if (class305.field4779[arg1][var3] != null) {
                if (class305.field4779[arg1][var3].field2945 == 2) {
                    var2 = false;
                } else {
                    class305.field4779[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class305.field4779[arg1] = null;
        }
        class261.field3867[arg1] = false;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIIIZI)Z", line = 95)
    public static final boolean method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field143++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class248.field3717[var12][var13] = 0;
                class45.field696[var12][var13] = 99999999;
            }
        }
        class248.field3717[arg1][arg5] = 99;
        class45.field696[arg1][arg5] = 0;
        int var14 = 89 % ((arg4 - 12) / 62);
        int var15 = arg5;
        int var16 = arg1;
        byte var17 = 0;
        class101.field1548[var17] = arg1;
        int var33 = var17 + 1;
        class245.field3684[var17] = arg5;
        boolean var18 = false;
        int var19 = 0;
        int[][] var20 = class90.field1309[class50.field775].field5037;
        while (var33 != var19) {
            var16 = class101.field1548[var19];
            var15 = class245.field3684[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg2 == var16 && arg0 == var15) {
                var18 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class90.field1309[class50.field775].method2218(arg6 - 1, (byte) 89, var15, arg7, arg2, arg0, 2, var16)) {
                    var18 = true;
                    break;
                }
                if (arg6 < 10 && class90.field1309[class50.field775].method2215(2, var15, var16, arg2, arg7, -120, arg6 - 1, arg0)) {
                    var18 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg3 != 0 && class90.field1309[class50.field775].method2206(2, false, arg3, arg2, arg11, arg0, var16, var15, arg8)) {
                var18 = true;
                break;
            }
            int var21 = class45.field696[var16][var15] + 1;
            if (var16 > 0 && class248.field3717[var16 - 1][var15] == 0 && (var20[var16 - 1][var15] & 0x12C010E) == 0 && (var20[var16 - 1][var15 + 1] & 0x12C0138) == 0) {
                class101.field1548[var33] = var16 - 1;
                class245.field3684[var33] = var15;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var16 - 1][var15] = 2;
                class45.field696[var16 - 1][var15] = var21;
            }
            if (var16 < 102 && class248.field3717[var16 + 1][var15] == 0 && (var20[var16 + 2][var15] & 0x12C0183) == 0 && (var20[var16 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class101.field1548[var33] = var16 + 1;
                class245.field3684[var33] = var15;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var16 + 1][var15] = 8;
                class45.field696[var16 + 1][var15] = var21;
            }
            if (var15 > 0 && class248.field3717[var16][var15 - 1] == 0 && (var20[var16][var15 - 1] & 0x12C010E) == 0 && (var20[var16 + 1][var15 - 1] & 0x12C0183) == 0) {
                class101.field1548[var33] = var16;
                class245.field3684[var33] = var15 - 1;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var16][var15 - 1] = 1;
                class45.field696[var16][var15 - 1] = var21;
            }
            if (var15 < 102 && class248.field3717[var16][var15 + 1] == 0 && (var20[var16][var15 + 2] & 0x12C0138) == 0 && (var20[var16 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class101.field1548[var33] = var16;
                class245.field3684[var33] = var15 + 1;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var16][var15 + 1] = 4;
                class45.field696[var16][var15 + 1] = var21;
            }
            if (var16 > 0 && var15 > 0 && class248.field3717[var16 - 1][var15 - 1] == 0 && (var20[var16 - 1][var15] & 0x12C0138) == 0 && (var20[var16 - 1][var15 - 1] & 0x12C010E) == 0 && (var20[var16][var15 - 1] & 0x12C0183) == 0) {
                class101.field1548[var33] = var16 - 1;
                class245.field3684[var33] = var15 - 1;
                class248.field3717[var16 - 1][var15 - 1] = 3;
                class45.field696[var16 - 1][var15 - 1] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var16 < 102 && var15 > 0 && class248.field3717[var16 + 1][var15 - 1] == 0 && (var20[var16 + 1][var15 - 1] & 0x12C010E) == 0 && (var20[var16 + 2][var15 - 1] & 0x12C0183) == 0 && (var20[var16 + 2][var15] & 0x12C01E0) == 0) {
                class101.field1548[var33] = var16 + 1;
                class245.field3684[var33] = var15 - 1;
                class248.field3717[var16 + 1][var15 - 1] = 9;
                class45.field696[var16 + 1][var15 - 1] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var16 > 0 && var15 < 102 && class248.field3717[var16 - 1][var15 + 1] == 0 && (var20[var16 - 1][var15 + 1] & 0x12C010E) == 0 && (var20[var16 - 1][var15 + 2] & 0x12C0138) == 0 && (var20[var16][var15 + 2] & 0x12C01E0) == 0) {
                class101.field1548[var33] = var16 - 1;
                class245.field3684[var33] = var15 + 1;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var16 - 1][var15 + 1] = 6;
                class45.field696[var16 - 1][var15 + 1] = var21;
            }
            if (var16 < 102 && var15 < 102 && class248.field3717[var16 + 1][var15 + 1] == 0 && (var20[var16 + 1][var15 + 2] & 0x12C0138) == 0 && (var20[var16 + 2][var15 + 2] & 0x12C01E0) == 0 && (var20[var16 + 2][var15 + 1] & 0x12C0183) == 0) {
                class101.field1548[var33] = var16 + 1;
                class245.field3684[var33] = var15 + 1;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var16 + 1][var15 + 1] = 12;
                class45.field696[var16 + 1][var15 + 1] = var21;
            }
        }
        class150.field2268 = 0;
        if (!var18) {
            if (!arg10) {
                return false;
            }
            int var22 = 1000;
            int var23 = 100;
            byte var24 = 10;
            for (int var25 = arg2 - var24; var25 <= arg2 + var24; var25++) {
                for (int var26 = arg0 - var24; var26 <= (arg0 + var24); var26++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && class45.field696[var25][var26] < 100) {
                        int var27 = 0;
                        if (var25 < arg2) {
                            var27 = arg2 - var25;
                        } else if (arg11 + arg2 - 1 < var25) {
                            var27 = var25 + 1 - arg11 - arg2;
                        }
                        int var28 = 0;
                        if (var26 < arg0) {
                            var28 = arg0 - var26;
                        } else if (var26 > (arg0 + arg3 - 1)) {
                            var28 = var26 + 1 - arg3 - arg0;
                        }
                        int var29 = var27 * var27 + var28 * var28;
                        if (var22 > var29 || var22 == var29 && var23 > class45.field696[var25][var26]) {
                            var23 = class45.field696[var25][var26];
                            var15 = var26;
                            var16 = var25;
                            var22 = var29;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg1 == var16 && arg5 == var15) {
                return false;
            }
            class150.field2268 = 1;
        }
        byte var30 = 0;
        class101.field1548[var30] = var16;
        int var34 = var30 + 1;
        class245.field3684[var30] = var15;
        int var31;
        int var32 = var31 = class248.field3717[var16][var15];
        while (arg1 != var16 || arg5 != var15) {
            if (var31 != var32) {
                class101.field1548[var34] = var16;
                var31 = var32;
                class245.field3684[var34++] = var15;
            }
            if ((var32 & 0x2) != 0) {
                var16++;
            } else if ((var32 & 0x8) != 0) {
                var16--;
            }
            if ((var32 & 0x1) != 0) {
                var15++;
            } else if ((var32 & 0x4) != 0) {
                var15--;
            }
            var32 = class248.field3717[var16][var15];
        }
        if (var34 > 0) {
            class118.method917(0, var34, arg9);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 490)
    public static final String method104(String arg0, String arg1, int arg2, String arg3) {
        field142++;
        if (arg2 != -8622) {
            return (String) null;
        }
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = arg0.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg1.indexOf(arg3, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg1.indexOf(arg3, var12);
            if (var13 < 0) {
                var11.append(arg1.substring(var12));
                return var11.toString();
            }
            var11.append(arg1.substring(var12, var13));
            var12 = var5 + var13;
            var11.append(arg0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 551)
    public static void method105(int arg0) {
        field150 = null;
        field141 = null;
        if (arg0 > -124) {
            method103(50, 3, -108, -67, -38, 111, -108, -39, 38, -103, true, -64);
        }
    }
}
