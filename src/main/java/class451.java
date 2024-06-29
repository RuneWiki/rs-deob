import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class451 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[C")
    public static char[] field6586 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6585 = "Please remove ";

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field6587 = 10;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILii;Lps;II)V", line = 12)
    public static final void method2822(int arg0, class405 arg1, class394 arg2, int arg3, int arg4) {
        field6584++;
        class2 var5 = arg2.method2525((byte) 42, arg1);
        if (var5 == null) {
            return;
        }
        arg1.method1767(arg0, arg3, arg2.field5773 + arg0, arg2.field5672 + arg3);
        if (class351.field5090 == 2 || class351.field5090 == 5 || class253.field3497 == null) {
            arg1.method1784(-16777216, var5, arg0, arg3);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class346.field4979 == 4) {
                var9 = class122.field1687;
                var6 = (int) (-class396.field5847) & 0x3FFF;
                var8 = 4096;
                var7 = class363.field5238;
            } else {
                var6 = (int) (-class396.field5847) + class399.field5948 & 0x3FFF;
                var7 = class227.field2988.field740;
                var8 = 4096 - class364.field5261 * 16;
                var9 = class227.field2988.field734;
            }
            int var10 = var7 / 32 + (208 - (class192.field2574 * 2)) + 48;
            int var11 = (48 - -(class364.field5262 * 4)) - (var9 / 32) - (class364.field5262 - 104) * 2;
            class253.field3497.method450((float) arg2.field5773 / 2.0F + (float) arg0, (float) arg2.field5672 / 2.0F + (float) arg3, (float) var10, (float) var11, var8, var6 << 2, var5, arg0, arg3);
            for (class279 var12 = (class279) class164.field2210.method332(-2130841184); var12 != null; var12 = (class279) class164.field2210.method343((byte) -122)) {
                int var50 = var12.field4054;
                int var51 = (class181.field2398.field864[var50] >> 14 & 0x3FFF) - class7.field138;
                int var52 = (class181.field2398.field864[var50] & 0x3FFF) - class200.field2660;
                int var53 = var51 * 4 + 2 - (var7 / 32);
                int var54 = var52 * 4 + 2 - (var9 / 32);
                class189.method1147(var54, arg2, (byte) 39, arg0, arg3, var5, class181.field2398.field863[var50], var53, arg1);
            }
            for (int var13 = 0; var13 < class267.field3854; var13++) {
                int var47 = class156.field2124[var13] * 4 + 2 - (var7 / 32);
                int var48 = class241.field3219[var13] * 4 + 2 - (var9 / 32);
                class104 var49 = class329.method2190((byte) 63, class11.field170[var13]);
                if (var49.field1518 != null) {
                    var49 = var49.method708((byte) 86);
                    if (var49 == null || var49.field1504 == -1) {
                        continue;
                    }
                }
                class189.method1147(var48, arg2, (byte) 39, arg0, arg3, var5, var49.field1504, var47, arg1);
            }
            for (class38 var14 = (class38) class200.field2656.method389(0); var14 != null; var14 = (class38) class200.field2656.method388(0)) {
                int var44 = (int) (var14.field640 >> 28 & 0x3L);
                if (class276.field3998 == var44) {
                    int var45 = (int) (var14.field640 & 0x3FFFL) * 4 + 2 - var7 / 32;
                    int var46 = (int) (var14.field640 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                    class384.method2473(arg2, arg0, arg3, var45, class403.field6002[0], var5, var46, -10);
                }
            }
            for (int var15 = 0; var15 < class198.field2637; var15++) {
                class43 var40 = class306.field4496[class398.field5938[var15]];
                if (var40 != null && var40.method310(arg4 ^ 0x72A6)) {
                    class249 var41 = var40.field606;
                    if (var41 != null && var41.field3375 != null) {
                        var41 = var41.method1510(30);
                    }
                    if (var41 != null && var41.field3386 && var41.field3373) {
                        int var42 = var40.field740 / 32 - (var7 / 32);
                        int var43 = var40.field734 / 32 - var9 / 32;
                        if (var41.field3357 == -1) {
                            class384.method2473(arg2, arg0, arg3, var42, class403.field6002[1], var5, var43, -8);
                        } else {
                            class189.method1147(var43, arg2, (byte) 39, arg0, arg3, var5, var41.field3357, var42, arg1);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class65.field861; var16++) {
                class25 var32 = class206.field2777[class229.field3071[var16]];
                if (var32 != null && var32.method163(arg4 - 11942)) {
                    int var33 = var32.field740 / 32 - var7 / 32;
                    int var34 = var32.field734 / 32 - (var9 / 32);
                    boolean var35 = false;
                    for (int var36 = 0; var36 < class167.field2254; var36++) {
                        if (var32.field340.equals(class272.field3943[var36]) && class324.field4759[var36] != 0) {
                            var35 = true;
                            break;
                        }
                    }
                    boolean var37 = false;
                    for (int var38 = 0; var38 < class207.field2785; var38++) {
                        if (var32.field340.equals(class195.field2617[var38].field6219)) {
                            var37 = true;
                            break;
                        }
                    }
                    boolean var39 = false;
                    if (class227.field2988.field329 != 0 && var32.field329 != 0 && class227.field2988.field329 == var32.field329) {
                        var39 = true;
                    }
                    if (var35) {
                        class384.method2473(arg2, arg0, arg3, var33, class403.field6002[3], var5, var34, 2);
                    } else if (var37) {
                        class384.method2473(arg2, arg0, arg3, var33, class403.field6002[5], var5, var34, -128);
                    } else if (var39) {
                        class384.method2473(arg2, arg0, arg3, var33, class403.field6002[4], var5, var34, 100);
                    } else {
                        class384.method2473(arg2, arg0, arg3, var33, class403.field6002[2], var5, var34, 35);
                    }
                }
            }
            class194[] var17 = class219.field2903;
            for (int var18 = 0; var18 < var17.length; var18++) {
                class194 var21 = var17[var18];
                if (var21 != null && var21.field2596 != 0 && class28.field418 % 20 < 10) {
                    if (var21.field2596 == 1 && var21.field2601 >= 0 && var21.field2601 < class306.field4496.length) {
                        class43 var22 = class306.field4496[var21.field2601];
                        if (var22 != null) {
                            int var23 = var22.field740 / 32 - var7 / 32;
                            int var24 = var22.field734 / 32 - (var9 / 32);
                            class73.method540(var23, var5, var21.field2592, 360000, arg2, (byte) 9, var24, arg0, arg3);
                        }
                    }
                    if (var21.field2596 == 2) {
                        int var25 = (var21.field2597 - class7.field138) * 4 + 2 - (var7 / 32);
                        int var26 = (var21.field2603 - class200.field2660) * 4 + 2 - (var9 / 32);
                        int var27 = var21.field2600 * 4;
                        int var28 = var27 * var27;
                        class73.method540(var25, var5, var21.field2592, var28, arg2, (byte) 9, var26, arg0, arg3);
                    }
                    if (var21.field2596 == 10 && var21.field2601 >= 0 && var21.field2601 < class206.field2777.length) {
                        class25 var29 = class206.field2777[var21.field2601];
                        if (var29 != null) {
                            int var30 = var29.field740 / 32 - (var7 / 32);
                            int var31 = var29.field734 / 32 - (var9 / 32);
                            class73.method540(var30, var5, var21.field2592, 360000, arg2, (byte) 9, var31, arg0, arg3);
                        }
                    }
                }
            }
            if (class346.field4979 != 4) {
                if (class59.field792 != 0) {
                    int var19 = class59.field792 * 4 + (class227.field2988.method168(-123) * 2) + 2 - (var7 / 32) - 2;
                    int var20 = class376.field5470 * 4 + ((class227.field2988.method168(arg4 ^ 0xFFFFAE21) * 2) - (var9 / 32)) + 2 - 2;
                    class384.method2473(arg2, arg0, arg3, var19, class21.field275[class91.field1284 ? 1 : 0], var5, var20, 28);
                }
                arg1.method2610(3, -1, true, 3, arg2.field5773 / 2 + arg0 - 1, arg2.field5672 / 2 + arg3 + -1);
            }
        }
        if (arg4 != 20910) {
            method2823((byte) 94);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 318)
    public static void method2823(byte arg0) {
        if (arg0 != -118) {
            method2822(-108, (class405) null, (class394) null, -55, -72);
        }
        field6586 = null;
        field6585 = null;
    }
}
