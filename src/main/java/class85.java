import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class85 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lvn;")
    public static class208 field1065;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1071;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[I")
    public static int[] field1066;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method621(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V", line = 7)
    public static final void method614(int arg0, int arg1) {
        class205.field2969 = -1;
        field1068++;
        class367.field5246 = 3;
        class515.field7594 = 100;
        if (arg0 != -16777216) {
            field1065 = null;
        }
        class163.field2416 = arg1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Ldj;", line = 23)
    public static final class232 method615(int arg0, int arg1, int arg2) {
        class239 var3 = class268.field3910[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3473;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 30)
    public static void method616(int arg0) {
        field1065 = null;
        if (arg0 < 115) {
            field1066 = null;
        }
        field1066 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)J", line = 43)
    public static final long method617(int arg0, String arg1) {
        field1064++;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0 != -58) {
            return -116L;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V", line = 93)
    public static final void method618(int arg0, int arg1) {
        field1070++;
        class335.field4854.method1087(1, arg1);
        int var2 = -3 % ((arg0 + 33) / 62);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lza;Lge;IIIII)V", line = 105)
    public static final void method619(class290 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class409.field5785 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class6.field109) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class272.field4032 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class239 var15 = class268.field3910[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class330.field4818[var12].method10(var13, var14) + class330.field4818[var12].method10(var13 + 1, var14) + class330.field4818[var12].method10(var13, var14 + 1) + class330.field4818[var12].method10(var13 + 1, var14 + 1)) / 4 - (class330.field4818[arg2].method10(arg3, arg4) + class330.field4818[arg2].method10(arg3 + 1, arg4) + class330.field4818[arg2].method10(arg3, arg4 + 1) + class330.field4818[arg2].method10(arg3 + 1, arg4 + 1)) / 4;
                                    class232 var17 = var15.field3487;
                                    class232 var18 = var15.field3473;
                                    if (var17 != null && var17.method118((byte) 102)) {
                                        arg1.method128(-79, arg0, var16, var17, (var13 - arg3) * class169.field2463 + (1 - arg5) * class534.field7832, var7, (var14 - arg4) * class169.field2463 + (1 - arg6) * class534.field7832);
                                    }
                                    if (var18 != null && var18.method118((byte) 102)) {
                                        arg1.method128(-87, arg0, var16, var18, (var13 - arg3) * class169.field2463 + (1 - arg5) * class534.field7832, var7, (var14 - arg4) * class169.field2463 + (1 - arg6) * class534.field7832);
                                    }
                                    for (class134 var19 = var15.field3482; var19 != null; var19 = var19.field1755) {
                                        class144 var20 = var19.field1761;
                                        if (var20 != null && var20.method118((byte) 102) && (var20.field1911 == var13 || var8 == var13) && (var20.field1902 == var14 || var10 == var14)) {
                                            int var21 = var20.field1898 + 1 - var20.field1911;
                                            int var22 = var20.field1907 + 1 - var20.field1902;
                                            arg1.method128(-89, arg0, var16, var20, (var20.field1911 - arg3) * class169.field2463 + (var21 - arg5) * class534.field7832, var7, (var20.field1902 - arg4) * class169.field2463 + (var22 - arg6) * class534.field7832);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lza;II)Z", line = 194)
    public static final boolean method620(class290 arg0, int arg1, int arg2) {
        field1069++;
        int var3 = (class43.field494 - 104) / 2;
        int var4 = (class500.field7068 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class36.method205(arg2, 0, var6, var51, var52)) {
                        int var53 = var52;
                        if (class362.method2135(var51, 45, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class410.method2424((byte) 55, var53, var51, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class463.field6476 = arg0.method344(var7, 0, 512, 512, 512);
        class482.method2776((byte) 81);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238) + ((int) (Math.random() * 20.0D)) - 10 | 0xFF000000;
        int var10 = ((((int) (Math.random() * 20.0D)) + 238) - 10 | 0x8528FF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        if (arg1 > -16) {
            return false;
        }
        boolean[][] var12 = new boolean[class120.field1661][class120.field1661];
        for (int var13 = var3; var13 < var3 + 104; var13 += class120.field1661) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class120.field1661) {
                arg0.method301(0, 0, class120.field1661 * 4, class120.field1661 * 4);
                arg0.method347(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class120.field1661; var44++) {
                        for (int var50 = 0; var50 < class120.field1661; var50++) {
                            var12[var44][var50] = class36.method205(arg2, 0, var13 + var44, var36 + var50, var37);
                        }
                    }
                    class68.field858[var37].method18(0, 0, 1024, var13, var36, class120.field1661 + var13, class120.field1661 + var36, var12);
                    if (!class468.field6529) {
                        for (int var45 = -4; var45 < class120.field1661; var45++) {
                            for (int var46 = -4; var46 < class120.field1661; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class36.method205(arg2, 0, var47, var48, var37)) {
                                    int var49 = var37;
                                    if (class362.method2135(var48, 53, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class431.method2547(var10, arg0, var49, var48, var47, (class120.field1661 - var46) * 4 - 4, true, var45 * 4, var9);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class468.field6529) {
                    class40 var38 = class143.field1877[arg2];
                    for (int var39 = 0; var39 < class120.field1661; var39++) {
                        for (int var40 = 0; var40 < class120.field1661; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field443[var41 - var38.field436][var42 - var38.field447];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method1794(4, (class120.field1661 - var40) * 4 - 4, -1713569622, 4, 97, var39 * 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method1793(var39 * 4, -29535, -1713569622, 4, (class120.field1661 - var40) * 4 - 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method1792(1, var39 * 4 + 3, 4, -1713569622, (class120.field1661 - var40) * 4 - 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method1793(var39 * 4, -29535, -1713569622, 4, (class120.field1661 - var40) * 4 + 3 - 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method1792(1, var39 * 4, 4, -1713569622, (class120.field1661 - var40) * 4 - 4);
                            }
                        }
                    }
                }
                arg0.method325(0, 0, class120.field1661 * 4, class120.field1661 * 4, var11, 2);
                class463.field6476.method147((var13 - var3) * 4 + 48, 464 - ((-var4 + var36) * 4 + class120.field1661 * 4), class120.field1661 * 4, class120.field1661 * 4, 0, 0);
            }
        }
        arg0.method295();
        arg0.method347(-16777215);
        class385.method2235((byte) 91);
        class216.field3124 = 0;
        class368.field5249.method2656(92);
        if (!class468.field6529) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; (arg2 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class36.method205(arg2, 0, var14, var20, var21)) {
                            class21 var22 = (class21) class87.method628(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class21) class248.method1622(var21, var14, var20, field1071 == null ? (field1071 = method621("nc")) : field1071);
                            }
                            if (var22 == null) {
                                var22 = (class21) class38.method211(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class21) class335.method2002(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class270 var23 = class377.field5338.method1901(50, var22.method110((byte) 127));
                                if (!var23.field3988 || class192.field2735) {
                                    int var24 = var23.field3959;
                                    if (var23.field3998 != null) {
                                        for (int var25 = 0; var25 < var23.field3998.length; var25++) {
                                            if (var23.field3998[var25] != -1) {
                                                class270 var26 = class377.field5338.method1901(50, var23.field3998[var25]);
                                                if (var26.field3959 >= 0) {
                                                    var24 = var26.field3959;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class156 var28 = class69.field876.method1316((byte) -68, var24);
                                            if (var28 != null && var28.field2318) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class143.field1877[var21].field443;
                                            int var32 = class143.field1877[var21].field436;
                                            int var33 = class143.field1877[var21].field447;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 103) > var29 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class154.field2214[class216.field3124] = var23.field3952;
                                        class15.field191[class216.field3124] = var29;
                                        class2.field58[class216.field3124] = var30;
                                        class216.field3124++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class399.field5628 != null) {
                class390.field5478.field662 = 1;
                class69.field876.method1317(1024, 64, 61);
                for (int var15 = 0; var15 < class399.field5628.field3839; var15++) {
                    int var16 = class399.field5628.field3837[var15];
                    if (var16 >> 28 == class246.field3587.field1904) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class441.field6171;
                        int var18 = (var16 & 0x3FFF) - class367.field5241;
                        if (var17 >= 0 && class43.field494 > var17 && var18 >= 0 && class500.field7068 > var18) {
                            class368.field5249.method2657(8492, new class254(var15));
                        } else {
                            class156 var19 = class69.field876.method1316((byte) -68, class399.field5628.field3840[var15]);
                            if (var19.field2310 != null && var19.field2329 + var17 >= 0 && (var19.field2328 + var17) < class43.field494 && var19.field2330 + var18 >= 0 && class500.field7068 > (var18 + var19.field2335)) {
                                class368.field5249.method2657(8492, new class254(var15));
                            }
                        }
                    }
                }
                class69.field876.method1317(128, 64, 61);
                class390.field5478.field662 = 2;
                class390.field5478.method447(true);
            }
        }
        return true;
    }
}
