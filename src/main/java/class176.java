import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class176 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2809 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "J")
    public static long field2813 = 0L;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[Z")
    public static boolean[] field2817 = new boolean[100];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lpk;")
    public static class120 field2815;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[[S")
    public static short[][] field2816;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILpk;)V", line = 5)
    public static final void method1294(int arg0, class120 arg1) {
        if (arg0 == 22527) {
            class339.field5239 = arg1;
            field2808++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 16)
    public static void method1295(boolean arg0) {
        field2816 = (short[][]) null;
        field2809 = null;
        field2815 = null;
        if (!arg0) {
            field2814 = -125;
        }
        field2817 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V", line = 29)
    public static final void method1296(boolean arg0) {
        if (!arg0) {
            field2807++;
            class66.field979.method2282((byte) -119);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B)V", line = 50)
    public static final void method1297(int arg0, byte[] arg1) {
        field2811++;
        class1 var2 = new class1(arg1);
        var2.field48 = arg1.length - 2;
        class89.field1426 = var2.method56(19612);
        class107.field1759 = new boolean[class89.field1426];
        class61.field892 = new int[class89.field1426];
        class183.field2902 = new int[class89.field1426];
        class83.field1288 = new int[class89.field1426];
        class116.field1878 = new byte[class89.field1426][];
        class309.field4887 = new int[class89.field1426];
        class207.field3277 = new byte[class89.field1426][];
        var2.field48 = arg1.length - (class89.field1426 * 8) - 7;
        class185.field2926 = var2.method56(19612);
        class112.field1821 = var2.method56(19612);
        int var3 = (var2.method15((byte) -54) & 0xFF) + 1;
        for (int var4 = 0; var4 < class89.field1426; var4++) {
            class61.field892[var4] = var2.method56(19612);
        }
        for (int var5 = 0; var5 < class89.field1426; var5++) {
            class183.field2902[var5] = var2.method56(19612);
        }
        for (int var6 = 0; var6 < class89.field1426; var6++) {
            class309.field4887[var6] = var2.method56(19612);
        }
        if (arg0 <= 0) {
            method1295(false);
        }
        for (int var7 = 0; var7 < class89.field1426; var7++) {
            class83.field1288[var7] = var2.method56(19612);
        }
        var2.field48 = arg1.length - ((var3 - 1) * 3) - (class89.field1426 * 8) - 7;
        class260.field3873 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class260.field3873[var8] = var2.method4(true);
            if (class260.field3873[var8] == 0) {
                class260.field3873[var8] = 1;
            }
        }
        var2.field48 = 0;
        for (int var9 = 0; var9 < class89.field1426; var9++) {
            int var10 = class83.field1288[var9];
            int var11 = class309.field4887[var9];
            int var12 = var10 * var11;
            boolean var13 = false;
            byte[] var14 = new byte[var12];
            byte[] var15 = new byte[var12];
            class207.field3277[var9] = var15;
            class116.field1878[var9] = var14;
            int var16 = var2.method15((byte) 68);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var15[var17] = var2.method55(4);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method55(4);
                        var13 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label100: while (true) {
                    if (var11 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var11) {
                                break label100;
                            }
                            for (int var23 = 0; var23 < var10; var23++) {
                                byte var24 = var14[var11 * var23 + var22] = var2.method55(4);
                                var13 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var10; var21++) {
                        var15[var11 * var21 + var20] = var2.method55(4);
                    }
                    var20++;
                }
            }
            class107.field1759[var9] = var13;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZIII)V", line = 215)
    public static final void method1298(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2810++;
        class208.field3284++;
        class67.method535(102);
        if (arg2) {
            class77.method607(0, (byte) -67, false, false);
        } else {
            class10.method154(124, 0);
            class77.method607(0, (byte) -67, true, false);
            if (class314.field4953 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class77.method607(var6, (byte) -67, false, false);
                    class77.method607(var6, (byte) -67, false, true);
                    class10.method154(123, var6);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class10.method154(122, var7);
                    class77.method607(var7, (byte) -67, false, false);
                    class77.method607(var7, (byte) -67, false, true);
                }
            }
        }
        if (!arg2) {
            class25.method231(28413);
        }
        class274.method1952((byte) 125);
        if (class162.field2623) {
            class31.method282(arg1, arg0, arg5, true, 0, arg3);
            arg0 = class175.field2803;
            arg3 = class229.field3521;
            arg1 = class309.field4886;
            arg5 = class66.field984;
        }
        if (class73.field1112 == 1) {
            int var8 = (int) class86.field1388;
            if (class315.field4971 / 256 > var8) {
                var8 = class315.field4971 / 256;
            }
            if (class41.field637[4] && var8 < (class281.field4409[4] + 128)) {
                var8 = class281.field4409[4] + 128;
            }
            int var9 = (int) class171.field2747 + class147.field2399 & 0x7FF;
            class306.method2170(var9, class306.field4858, arg5, var8, class170.method1265(class345.field5363.field4671, class345.field5363.field4672, class75.field1153, 1) - 50, 600 - -(var8 * 3), class2.field77, arg4 ^ 0xFFFFECD7);
        } else if (class73.field1112 == 5) {
            class201.method1420(-32687, arg5);
        }
        int var10 = class332.field5180;
        int var11 = class152.field2498;
        int var12 = class137.field2239;
        int var13 = class64.field943;
        if (arg4 != -4986) {
            return;
        }
        int var14 = class43.field683;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class41.field637[var15]) {
                int var16 = (int) ((double) (-class273.field4268[var15]) + Math.random() * (double) (class273.field4268[var15] * 2 + 1) + Math.sin((double) class47.field719[var15] / 100.0D * (double) class334.field5194[var15]) * (double) class281.field4409[var15]);
                if (var15 == 2) {
                    class137.field2239 += var16;
                }
                if (var15 == 4) {
                    class43.field683 += var16;
                    if (class43.field683 < 128) {
                        class43.field683 = 128;
                    }
                    if (class43.field683 > 383) {
                        class43.field683 = 383;
                    }
                }
                if (var15 == 0) {
                    class152.field2498 += var16;
                }
                if (var15 == 3) {
                    class64.field943 = class64.field943 + var16 & 0x7FF;
                }
                if (var15 == 1) {
                    class332.field5180 += var16;
                }
            }
        }
        class140.method1072((byte) -27);
        if (class162.field2623) {
            class114.method886(arg3, arg1, arg0 + arg3, arg1 + arg5);
            float var17 = (float) class64.field943 * 0.17578125F;
            float var18 = (float) class43.field683 * 0.17578125F;
            boolean var19 = false;
            if (class73.field1112 == 3) {
                var18 = class156.field2561 * 360.0F / 6.2831855F;
                var17 = class110.field1792 * 360.0F / 6.2831855F;
            }
            int var20;
            if (class289.field4548 == 10) {
                var20 = class181.method1325(class137.field2241, class137.field2239 >> 10, class343.field5310, class152.field2498 >> 10, 0);
            } else {
                var20 = class181.method1325(class137.field2241, class345.field5363.field4619[0] >> 3, class343.field5310, class345.field5363.field4643[0] >> 3, 0);
            }
            if (class221.field3452 >= 0) {
                class162.method1227();
                class250 var21 = class218.method1577((byte) 112, class318.field4990, class334.field5200, class145.field2351, class221.field3452);
                var21.method1736(class171.field2749, arg3, arg1, arg0, arg5, class43.field683, class64.field943, var20);
            } else {
                class162.method1198(var20);
            }
            class162.method1209(arg3, arg1, arg0, arg5, arg0 / 2 + arg3, arg5 / 2 + arg1, var18, var17, class48.field740, class48.field740);
            class62.method500(true, false);
            class162.method1199();
            class162.method1193(true);
            class162.method1207(true);
        } else {
            class33.method304(arg3, arg1, arg0 + arg3, arg1 + arg5);
            class40.method368();
            if (class221.field3452 < 0) {
                class33.method288(arg3, arg1, arg0, arg5, 0);
            } else {
                class250 var22 = class218.method1577((byte) -105, class318.field4990, class334.field5200, class145.field2351, class221.field3452);
                var22.method1738(class171.field2749, arg3, arg1, arg0, arg5, class43.field683, class64.field943, 0);
            }
        }
        if (class260.field3858 || class95.field1535 < arg3 || class95.field1535 >= arg0 + arg3 || arg1 > class146.field2394 || arg1 + arg5 <= class146.field2394) {
            class342.field5301 = false;
            class79.field1236 = 0;
        } else {
            int var23 = class8.field198;
            int var24 = class179.field2851;
            class79.field1236 = 0;
            class109.field1784 = (class95.field1535 - arg3) * (var24 - var23) / arg0 + var23;
            class342.field5301 = true;
            int var25 = class323.field5064;
            int var26 = class149.field2428;
            class106.field1745 = (class146.field2394 - arg1) * (var25 - var26) / arg5 + var26;
        }
        class178.method1310(16);
        byte var27 = class85.method678(-38) == 2 ? (byte) class208.field3284 : 1;
        if (class162.field2623) {
            class219.method1582(class307.field4869, !class149.field2435);
            class338.method2349(class64.field943, class137.field2239, class152.field2498, class43.field683, class332.field5180, (byte) 75);
            class162.field2656 = class307.field4869;
            class166.method1243(class152.field2498, class332.field5180, class137.field2239, class43.field683, class64.field943, class242.field3621, class225.field3492, class32.field500, class93.field1517, class142.field2304, class73.field1108, class75.field1153 + 1, var27, class345.field5363.field4671 >> 7, class345.field5363.field4672 >> 7);
            class26.field436 = true;
            class219.method1597();
            class338.method2349(0, 0, 0, 0, 0, (byte) 75);
            class178.method1310(16);
            class41.method376(class48.field740, class48.field740, arg5, arg3, arg1, -1, arg0);
            class258.method1791(arg3, arg0, arg1, (byte) -47, class48.field740, class48.field740, arg5);
            class111.method871();
        } else {
            class166.method1243(class152.field2498, class332.field5180, class137.field2239, class43.field683, class64.field943, class242.field3621, class225.field3492, class32.field500, class93.field1517, class142.field2304, class73.field1108, class75.field1153 + 1, var27, class345.field5363.field4671 >> 7, class345.field5363.field4672 >> 7);
            class178.method1310(16);
            class111.method871();
            class41.method376(256, 256, arg5, arg3, arg1, -1, arg0);
            class258.method1791(arg3, arg0, arg1, (byte) -109, 256, 256, arg5);
        }
        ((class277) class40.field614).method1964((byte) -124, class137.field2241);
        class164.method1235(21633, arg5, arg1, arg0, arg3);
        class152.field2498 = var11;
        class137.field2239 = var12;
        class64.field943 = var13;
        class332.field5180 = var10;
        class43.field683 = var14;
        if (class260.field3855 && class53.field809.method2006(18744) == 0) {
            class260.field3855 = false;
        }
        if (class260.field3855) {
            if (class162.field2623) {
                class114.method887(arg3, arg1, arg0, arg5, 0);
            } else {
                class33.method288(arg3, arg1, arg0, arg5, 0);
            }
            class121.method968(class244.field3655, (byte) -97, false);
        }
        if (!arg2 && !class260.field3855 && !class260.field3858 && class95.field1535 >= arg3 && (arg0 + arg3) > class95.field1535 && class146.field2394 >= arg1 && class146.field2394 < (arg1 + arg5)) {
            class77.method608(arg3, arg0, arg5, arg1, class95.field1535, class146.field2394, -347);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 480)
    public static final void method1299(byte arg0) {
        field2806++;
        class313.field4923.method2282((byte) -120);
        if (arg0 == 120) {
            class260.field3857.method2282((byte) -127);
        }
    }
}
