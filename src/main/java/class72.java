import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class72 {

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lup;")
    public static class181 field929 = new class181(6, 7);

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Lik;")
    public static class140 field931;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Lad;")
    public static class294 field927;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "[Lan;")
    public static class20[] field933;

    static {
        new class335("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field932 = 0;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lya;Lhd;III)V", line = 6)
    public static final void method632(class38 arg0, class523 arg1, int arg2, int arg3, int arg4) {
        field928++;
        class10 var5 = arg1.method3122(true, arg0);
        if (arg2 != 710017550) {
            method632(null, null, 123, 21, -3);
        }
        if (var5 == null) {
            return;
        }
        arg0.method330(arg4, arg3, arg1.field7617 + arg4, arg3 - -arg1.field7574);
        if (class230.field2942 == 2 || class230.field2942 == 5 || class297.field3820 == null) {
            arg0.method324(-16777216, var5, arg4, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class142.field1835 == 4) {
            var6 = 4096;
            var7 = (int) (-class463.field6626) & 0x3FFF;
            var8 = class238.field3047;
            var9 = class527.field7783;
        } else {
            var7 = (int) (-class463.field6626) + class309.field3967 & 0x3FFF;
            var9 = class23.field336.field2677;
            var8 = class23.field336.field2666;
            var6 = 4096 - (class317.field4050 * 16);
        }
        int var10 = var8 / 32 + 48 - ((class452.field6526 - 104) * 2);
        int var11 = 48 - (var9 / 32) - (-(class440.field6307 * 4) - -((class440.field6307 + -104) * 2));
        class297.field3820.method145((float) arg1.field7617 / 2.0F + (float) arg4, (float) arg1.field7574 / 2.0F + (float) arg3, (float) var10, (float) var11, var6, var7 << 2, var5, arg4, arg3);
        for (class101 var12 = (class101) class21.field306.method153(arg2 - 710017550); var12 != null; var12 = (class101) class21.field306.method161(-102)) {
            int var54 = var12.field1222;
            int var55 = ((class452.field6528.field851[var54] & 0xFFFD8F5) >> 14) - class441.field6317;
            int var56 = (class452.field6528.field851[var54] & 0x3FFF) - class320.field4064;
            int var57 = var55 * 4 + 2 - (var8 / 32);
            int var58 = var56 * 4 + 2 - (var9 / 32);
            class328.method1912(false, class452.field6528.field856[var54], var57, arg4, var5, arg3, arg1, arg0, var58);
        }
        for (int var13 = 0; var13 < class265.field3349; var13++) {
            int var51 = class169.field2168[var13] * 4 + 2 - var8 / 32;
            int var52 = class532.field7834[var13] * 4 + 2 - (var9 / 32);
            class102 var53 = class315.field4017.method1958(-10091, class404.field5753[var13]);
            if (var53.field1291 != null) {
                var53 = var53.method761(84, class491.field7160);
                if (var53 == null || var53.field1263 == -1) {
                    continue;
                }
            }
            class328.method1912(false, var53.field1263, var51, arg4, var5, arg3, arg1, arg0, var52);
        }
        for (class91 var14 = (class91) class201.field2614.method2021(arg2 - 710017599); var14 != null; var14 = (class91) class201.field2614.method2017(106)) {
            int var48 = (int) (var14.field5043 >> 28 & 0x3L);
            if (class533.field7841 == var48) {
                int var49 = (int) (var14.field5043 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                int var50 = (int) (var14.field5043 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                class284.method1678(arg3, (byte) 86, var49, var5, class200.field2612[0], arg4, var50, arg1);
            }
        }
        for (int var15 = 0; var15 < class489.field7114; var15++) {
            class295 var44 = class187.field2446[class403.field5735[var15]];
            if (var44 != null && var44.method1734((byte) -126) && class23.field336.field2676 == var44.field2676) {
                class477 var45 = var44.field3773;
                if (var45 != null && var45.field6922 != null) {
                    var45 = var45.method2903(-1, class491.field7160);
                }
                if (var45 != null && var45.field6955 && var45.field6974) {
                    int var46 = var44.field2666 / 32 - (var8 / 32);
                    int var47 = var44.field2677 / 32 - (var9 / 32);
                    if (var45.field6927 == -1) {
                        class284.method1678(arg3, (byte) 86, var46, var5, class200.field2612[1], arg4, var47, arg1);
                    } else {
                        class328.method1912(false, var45.field6927, var46, arg4, var5, arg3, arg1, arg0, var47);
                    }
                }
            }
        }
        int var16 = class436.field6234;
        int[] var17 = class12.field218;
        for (int var18 = 0; var18 < var16; var18++) {
            class223 var36 = class387.field5107[var17[var18]];
            if (var36 != null && var36.method1368((byte) -126) && class23.field336 != var36 && class23.field336.field2676 == var36.field2676) {
                int var37 = var36.field2666 / 32 - (var8 / 32);
                int var38 = var36.field2677 / 32 - var9 / 32;
                boolean var39 = false;
                for (int var40 = 0; var40 < class280.field3555; var40++) {
                    if (var36.field2852.equals(class329.field4163[var40]) && class401.field5710[var40] != 0) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                for (int var42 = 0; var42 < class339.field4255; var42++) {
                    if (var36.field2852.equals(class313.field3994[var42].field5005)) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                if (class23.field336.field2835 != 0 && var36.field2835 != 0 && class23.field336.field2835 == var36.field2835) {
                    var43 = true;
                }
                if (var36.field2820) {
                    class284.method1678(arg3, (byte) 86, var37, var5, class200.field2612[6], arg4, var38, arg1);
                } else if (var39) {
                    class284.method1678(arg3, (byte) 86, var37, var5, class200.field2612[3], arg4, var38, arg1);
                } else if (var41) {
                    class284.method1678(arg3, (byte) 86, var37, var5, class200.field2612[5], arg4, var38, arg1);
                } else if (var43) {
                    class284.method1678(arg3, (byte) 86, var37, var5, class200.field2612[4], arg4, var38, arg1);
                } else {
                    class284.method1678(arg3, (byte) 86, var37, var5, class200.field2612[2], arg4, var38, arg1);
                }
            }
        }
        class277[] var19 = class147.field1869;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class277 var23 = var19[var20];
            if (var23 != null && var23.field3508 != 0 && class163.field2065 % 20 < 10) {
                if (var23.field3508 == 1 && var23.field3511 >= 0 && var23.field3511 < class187.field2446.length) {
                    class295 var24 = class187.field2446[var23.field3511];
                    if (var24 != null) {
                        int var25 = var24.field2666 / 32 - (var8 / 32);
                        int var26 = var24.field2677 / 32 - (var9 / 32);
                        class166.method1072(var5, arg3, var25, var23.field3506, arg1, arg2 ^ 0x2A523DF1, 360000L, var26, arg4);
                    }
                }
                if (var23.field3508 == 2) {
                    int var27 = var23.field3507 / 32 - var8 / 32;
                    int var28 = var23.field3503 / 32 - var9 / 32;
                    long var29 = (long) (var23.field3504 << 5);
                    long var31 = var29 * var29;
                    class166.method1072(var5, arg3, var27, var23.field3506, arg1, 16383, var31, var28, arg4);
                }
                if (var23.field3508 == 10 && var23.field3511 >= 0 && class387.field5107.length > var23.field3511) {
                    class223 var33 = class387.field5107[var23.field3511];
                    if (var33 != null) {
                        int var34 = var33.field2666 / 32 - (var8 / 32);
                        int var35 = var33.field2677 / 32 - (var9 / 32);
                        class166.method1072(var5, arg3, var34, var23.field3506, arg1, arg2 ^ 0x2A523DF1, 360000L, var35, arg4);
                    }
                }
            }
        }
        if (class142.field1835 == 4) {
            return;
        }
        if (class274.field3441 != 0) {
            int var21 = class274.field3441 * 4 + (class23.field336.method1366((byte) -90) + -1) * 2 + 2 - (var8 / 32);
            int var22 = class247.field3176 * 4 + (-(var9 / 32) - -((class23.field336.method1366((byte) -103) + -1) * 2)) + 2;
            class284.method1678(arg3, (byte) 86, var21, var5, class320.field4065[class199.field2593 ? 1 : 0], arg4, var22, arg1);
        }
        arg0.method364(3, arg4 + (arg1.field7617 / 2) - 1, 3, arg3 - (1 - (arg1.field7574 / 2)), (byte) -48, -1);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 312)
    public static void method633(int arg0) {
        field933 = null;
        field931 = null;
        if (arg0 == 2) {
            field927 = null;
            field929 = null;
        }
    }
}
