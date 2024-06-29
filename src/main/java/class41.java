import jagex3.jagmisc.jagmisc;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class41 {

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    private static int field472 = 0;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "[Ljava/lang/String;")
    private static String[] field471 = new String[1000];

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "[I")
    private static int[] field468 = new int[1000];

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "[[I")
    private static int[][] field473 = new int[5][5000];

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "[Lb;")
    private static class219[] field479 = new class219[50];

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    private static int field483 = 0;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    private static int field476 = 0;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "[I")
    private static int[] field482 = new int[5];

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "Ljava/util/Calendar;")
    private static Calendar field478 = Calendar.getInstance();

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "[I")
    private static int[] field486 = new int[3];

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field487 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "Lfa;")
    public static class156 field485 = new class156(4);

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    private static int field488 = 0;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "Luu;")
    private static class188 field469;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "Luu;")
    private static class188 field480;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "Lvq;")
    private static class321 field466;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "[I")
    private static int[] field460;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field484;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lop;I)V", line = 9)
    private static final void method401(class125 arg0, int arg1) {
        Object[] var2 = arg0.field1833;
        int var3 = (Integer) var2[0];
        class164 var4 = class519.method3085(var3, 88);
        if (var4 == null) {
            return;
        }
        field460 = new int[var4.field2322];
        int var5 = 0;
        field484 = new String[var4.field2324];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1835;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1831;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1830 == null ? -1 : arg0.field1830.field2678;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1828;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1830 == null ? -1 : arg0.field1830.field2773;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1825 == null ? -1 : arg0.field1825.field2678;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1825 == null ? -1 : arg0.field1825.field2773;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1834;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1829;
                }
                field460[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1821;
                }
                field484[var6++] = var9;
            }
        }
        field488 = arg0.field1827;
        method411(var4, arg1);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)Ljava/lang/String;", line = 88)
    private static final String method402(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field478.setTime(new Date(var1));
        int var3 = field478.get(5);
        int var4 = field478.get(2);
        int var5 = field478.get(1);
        return var3 + "-" + field487[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZ)V", line = 100)
    private static final void method403(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field476 -= 3;
                int var2 = field468[field476];
                int var3 = field468[field476 + 1];
                int var4 = field468[field476 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class188 var5 = class371.method2286(0, var2);
                if (var5.field2758 == null) {
                    var5.field2758 = new class188[var4 + 1];
                }
                if (var5.field2758.length <= var4) {
                    class188[] var6 = new class188[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2758.length; var7++) {
                        var6[var7] = var5.field2758[var7];
                    }
                    var5.field2758 = var6;
                }
                if (var4 > 0 && var5.field2758[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class188 var8 = new class188();
                var8.field2727 = var3;
                var8.field2745 = var8.field2678 = var5.field2678;
                var8.field2773 = var4;
                var5.field2758[var4] = var8;
                if (arg1) {
                    field480 = var8;
                } else {
                    field469 = var8;
                }
                class120.method951(var5, (byte) -109);
                return;
            }
            if (arg0 == 101) {
                class188 var9 = arg1 ? field480 : field469;
                if (var9.field2773 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class188 var10 = class371.method2286(0, var9.field2678);
                var10.field2758[var9.field2773] = null;
                class120.method951(var10, (byte) -109);
                return;
            }
            if (arg0 == 102) {
                class188 var11 = class371.method2286(0, field468[--field476]);
                var11.field2758 = null;
                class120.method951(var11, (byte) -109);
                return;
            }
            if (arg0 == 200) {
                field476 -= 2;
                int var12 = field468[field476];
                int var13 = field468[field476 + 1];
                class188 var14 = class274.method1766(var12, var13, (byte) 127);
                if (var14 != null && var13 != -1) {
                    field468[field476++] = 1;
                    if (arg1) {
                        field480 = var14;
                        return;
                    }
                    field469 = var14;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field468[--field476];
                class188 var16 = class371.method2286(0, var15);
                if (var16 != null) {
                    field468[field476++] = 1;
                    if (arg1) {
                        field480 = var16;
                        return;
                    }
                    field469 = var16;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field468[--field476];
                method404(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field468[--field476];
                method405(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field476 -= 2;
                int var19 = field468[field476];
                int var20 = field468[field476 + 1];
                for (int var21 = 0; var21 < class156.field2228.length; var21++) {
                    if (class156.field2228[var21] == var19) {
                        class435.field6375.field5065.method2931(var20, class104.field1458, var21, 108);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class429.field6319.length; var22++) {
                    if (class429.field6319[var22] == var19) {
                        class435.field6375.field5065.method2931(var20, class104.field1458, var22, 111);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field476 -= 2;
                int var23 = field468[field476];
                int var24 = field468[field476 + 1];
                class435.field6375.field5065.method2937(var23, var24, (byte) 27);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field468[--field476] != 0;
                class435.field6375.field5065.method2930(var25, 15366);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class188 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class371.method2286(0, field468[--field476]);
            } else {
                var26 = arg1 ? field480 : field469;
            }
            if (arg0 == 1000) {
                field476 -= 4;
                var26.field2671 = field468[field476];
                var26.field2675 = field468[field476 + 1];
                int var27 = field468[field476 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field468[field476 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field2656 = (byte) var27;
                var26.field2748 = (byte) var28;
                class120.method951(var26, (byte) -109);
                class465.method2786(var26, 0);
                if (var26.field2773 == -1) {
                    class252.method1636(var26.field2678, false);
                }
                return;
            }
            if (arg0 == 1001) {
                field476 -= 4;
                var26.field2688 = field468[field476];
                var26.field2666 = field468[field476 + 1];
                var26.field2695 = 0;
                var26.field2644 = 0;
                int var29 = field468[field476 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field468[field476 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field2668 = (byte) var29;
                var26.field2630 = (byte) var30;
                class120.method951(var26, (byte) -109);
                class465.method2786(var26, 0);
                if (var26.field2727 == 0) {
                    class140.method1050(var26, -1, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field468[--field476] == 1;
                if (var26.field2714 != var31) {
                    var26.field2714 = var31;
                    class120.method951(var26, (byte) -109);
                }
                if (var26.field2773 == -1) {
                    class452.method2726(var26.field2678, true);
                }
                return;
            }
            if (arg0 == 1004) {
                field476 -= 2;
                var26.field2607 = field468[field476];
                var26.field2760 = field468[field476 + 1];
                class120.method951(var26, (byte) -109);
                class465.method2786(var26, 0);
                if (var26.field2727 == 0) {
                    class140.method1050(var26, -1, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field2742 = field468[--field476] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class188 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class371.method2286(0, field468[--field476]);
            } else {
                var32 = arg1 ? field480 : field469;
            }
            if (arg0 == 1100) {
                field476 -= 2;
                var32.field2700 = field468[field476];
                if (var32.field2700 > var32.field2694 - var32.field2711) {
                    var32.field2700 = var32.field2694 - var32.field2711;
                }
                if (var32.field2700 < 0) {
                    var32.field2700 = 0;
                }
                var32.field2744 = field468[field476 + 1];
                if (var32.field2744 > var32.field2712 - var32.field2672) {
                    var32.field2744 = var32.field2712 - var32.field2672;
                }
                if (var32.field2744 < 0) {
                    var32.field2744 = 0;
                }
                class120.method951(var32, (byte) -109);
                if (var32.field2773 == -1) {
                    class310.method1932((byte) 9, var32.field2678);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field2604 = field468[--field476];
                class120.method951(var32, (byte) -109);
                if (var32.field2773 == -1) {
                    class112.method911(127, var32.field2678);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field2726 = field468[--field476] == 1;
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1103) {
                var32.field2747 = field468[--field476];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1104) {
                var32.field2646 = field468[--field476];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field468[--field476];
                if (var32.field2665 != var33) {
                    var32.field2665 = var33;
                    class120.method951(var32, (byte) -109);
                }
                if (var32.field2773 == -1) {
                    class500.method2998(var32.field2678, (byte) -5);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field2690 = field468[--field476];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1107) {
                var32.field2738 = field468[--field476] == 1;
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1108) {
                var32.field2651 = 1;
                var32.field2622 = field468[--field476];
                class120.method951(var32, (byte) -109);
                if (var32.field2773 == -1) {
                    class59.method534(var32.field2678, true);
                }
                return;
            }
            if (arg0 == 1109) {
                field476 -= 6;
                var32.field2685 = field468[field476];
                var32.field2701 = field468[field476 + 1];
                var32.field2735 = field468[field476 + 2];
                var32.field2764 = field468[field476 + 3];
                var32.field2733 = field468[field476 + 4];
                var32.field2761 = field468[field476 + 5];
                class120.method951(var32, (byte) -109);
                if (var32.field2773 == -1) {
                    class448.method2718((byte) 126, var32.field2678);
                    class409.method2507(0, var32.field2678);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field468[--field476];
                if (var32.field2639 != var34) {
                    var32.field2639 = var34;
                    var32.field2686 = 0;
                    var32.field2628 = 1;
                    var32.field2705 = 0;
                    class120.method951(var32, (byte) -109);
                }
                if (var32.field2773 == -1) {
                    class154.method1098(var32.field2678, 1012);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field2737 = field468[--field476] == 1;
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field471[--field472];
                if (!var35.equals(var32.field2677)) {
                    var32.field2677 = var35;
                    class120.method951(var32, (byte) -109);
                }
                if (var32.field2773 == -1) {
                    class349.method2105(var32.field2678, -125);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field2642 = field468[--field476];
                class120.method951(var32, (byte) -109);
                if (var32.field2773 == -1) {
                    class252.method1637(var32.field2678, (byte) 59);
                }
                return;
            }
            if (arg0 == 1114) {
                field476 -= 3;
                var32.field2720 = field468[field476];
                var32.field2669 = field468[field476 + 1];
                var32.field2752 = field468[field476 + 2];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1115) {
                var32.field2708 = field468[--field476] == 1;
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1116) {
                var32.field2709 = field468[--field476];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1117) {
                var32.field2616 = field468[--field476];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1118) {
                var32.field2608 = field468[--field476] == 1;
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1119) {
                var32.field2746 = field468[--field476] == 1;
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1120) {
                field476 -= 2;
                var32.field2694 = field468[field476];
                var32.field2712 = field468[field476 + 1];
                class120.method951(var32, (byte) -109);
                if (var32.field2727 == 0) {
                    class140.method1050(var32, -1, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field476 -= 2;
                var32.field2770 = (short) field468[field476];
                var32.field2624 = (short) field468[field476 + 1];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1122) {
                var32.field2682 = field468[--field476] == 1;
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1123) {
                var32.field2761 = field468[--field476];
                class120.method951(var32, (byte) -109);
                if (var32.field2773 == -1) {
                    class448.method2718((byte) 127, var32.field2678);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field468[--field476];
                var32.field2614 = var36 == 1;
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1125) {
                field476 -= 2;
                var32.field2739 = field468[field476];
                var32.field2645 = field468[field476 + 1];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1126) {
                var32.field2689 = field468[--field476];
                class120.method951(var32, (byte) -109);
                return;
            }
            if (arg0 == 1127) {
                field476 -= 2;
                int var37 = field468[field476];
                int var38 = field468[field476 + 1];
                class284 var39 = class215.field3100.method2740((byte) -80, var37);
                if (var39.field4127 != var38) {
                    var32.method1323(var37, var38, -122);
                    return;
                }
                var32.method1311((byte) 79, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field468[--field476];
                String var41 = field471[--field472];
                class284 var42 = class215.field3100.method2740((byte) 100, var40);
                if (!var42.field4122.equals(var41)) {
                    var32.method1305(var41, var40, 16);
                    return;
                }
                var32.method1311((byte) 114, var40);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class188 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class371.method2286(0, field468[--field476]);
            } else {
                var43 = arg1 ? field480 : field469;
            }
            class120.method951(var43, (byte) -109);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field476 -= 2;
                int var44 = field468[field476];
                int var45 = field468[field476 + 1];
                if (var43.field2773 == -1) {
                    class74.method705(95, var43.field2678);
                    class448.method2718((byte) 125, var43.field2678);
                    class409.method2507(0, var43.field2678);
                }
                if (var44 == -1) {
                    var43.field2651 = 1;
                    var43.field2622 = -1;
                    var43.field2617 = -1;
                    return;
                }
                var43.field2617 = var44;
                var43.field2710 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field2657 = true;
                } else {
                    var43.field2657 = false;
                }
                class72 var46 = class270.field3995.method6(22883, var44);
                var43.field2735 = var46.field927;
                var43.field2764 = var46.field909;
                var43.field2733 = var46.field931;
                var43.field2685 = var46.field953;
                var43.field2701 = var46.field972;
                var43.field2761 = var46.field934;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field2704 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field2704 = 1;
                } else {
                    var43.field2704 = 2;
                }
                if (var43.field2695 > 0) {
                    var43.field2761 = var43.field2761 * 32 / var43.field2695;
                    return;
                }
                if (var43.field2688 > 0) {
                    var43.field2761 = var43.field2761 * 32 / var43.field2688;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field2651 = 2;
                var43.field2622 = field468[--field476];
                if (var43.field2773 == -1) {
                    class59.method534(var43.field2678, true);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field2651 = 3;
                var43.field2622 = -1;
                if (var43.field2773 == -1) {
                    class59.method534(var43.field2678, true);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field2651 = 6;
                var43.field2622 = field468[--field476];
                if (var43.field2773 == -1) {
                    class59.method534(var43.field2678, true);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field2651 = 5;
                var43.field2622 = field468[--field476];
                if (var43.field2773 == -1) {
                    class59.method534(var43.field2678, true);
                }
                return;
            }
            if (arg0 == 1206) {
                field476 -= 4;
                var43.field2620 = field468[field476];
                var43.field2611 = field468[field476 + 1];
                var43.field2679 = field468[field476 + 2];
                var43.field2659 = field468[field476 + 3];
                class120.method951(var43, (byte) -109);
                return;
            }
            if (arg0 == 1207) {
                field476 -= 2;
                var43.field2683 = field468[field476];
                var43.field2766 = field468[field476 + 1];
                class120.method951(var43, (byte) -109);
                return;
            }
            if (arg0 == 1210) {
                field476 -= 4;
                var43.field2622 = field468[field476];
                var43.field2741 = field468[field476 + 1];
                if (field468[field476 + 2] == 1) {
                    var43.field2651 = 9;
                } else {
                    var43.field2651 = 8;
                }
                if (field468[field476 + 3] == 1) {
                    var43.field2657 = true;
                } else {
                    var43.field2657 = false;
                }
                if (var43.field2773 == -1) {
                    class59.method534(var43.field2678, true);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field2651 = 5;
                var43.field2622 = class396.field5815;
                var43.field2741 = 0;
                if (var43.field2773 == -1) {
                    class59.method534(var43.field2678, true);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class188 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class371.method2286(0, field468[--field476]);
                } else {
                    var58 = arg1 ? field480 : field469;
                }
                String var59 = field471[--field472];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field468[--field476];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field468[--field476];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field471[--field472];
                    } else {
                        var62[var63] = Integer.valueOf(field468[--field476]);
                    }
                }
                int var64 = field468[--field476];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field2634 = var62;
                } else if (arg0 == 1401) {
                    var58.field2662 = var62;
                } else if (arg0 == 1402) {
                    var58.field2734 = var62;
                } else if (arg0 == 1403) {
                    var58.field2730 = var62;
                } else if (arg0 == 1404) {
                    var58.field2619 = var62;
                } else if (arg0 == 1405) {
                    var58.field2699 = var62;
                } else if (arg0 == 1406) {
                    var58.field2680 = var62;
                } else if (arg0 == 1407) {
                    var58.field2650 = var62;
                    var58.field2602 = var60;
                } else if (arg0 == 1408) {
                    var58.field2618 = var62;
                } else if (arg0 == 1409) {
                    var58.field2643 = var62;
                } else if (arg0 == 1410) {
                    var58.field2648 = var62;
                } else if (arg0 == 1411) {
                    var58.field2667 = var62;
                } else if (arg0 == 1412) {
                    var58.field2703 = var62;
                } else if (arg0 == 1414) {
                    var58.field2653 = var62;
                    var58.field2715 = var60;
                } else if (arg0 == 1415) {
                    var58.field2763 = var62;
                    var58.field2754 = var60;
                } else if (arg0 == 1416) {
                    var58.field2658 = var62;
                } else if (arg0 == 1417) {
                    var58.field2676 = var62;
                } else if (arg0 == 1418) {
                    var58.field2625 = var62;
                } else if (arg0 == 1419) {
                    var58.field2654 = var62;
                } else if (arg0 == 1420) {
                    var58.field2751 = var62;
                } else if (arg0 == 1421) {
                    var58.field2728 = var62;
                } else if (arg0 == 1422) {
                    var58.field2638 = var62;
                } else if (arg0 == 1423) {
                    var58.field2716 = var62;
                } else if (arg0 == 1424) {
                    var58.field2623 = var62;
                } else if (arg0 == 1425) {
                    var58.field2637 = var62;
                } else if (arg0 == 1426) {
                    var58.field2605 = var62;
                } else if (arg0 == 1427) {
                    var58.field2613 = var62;
                } else if (arg0 == 1428) {
                    var58.field2724 = var62;
                    var58.field2627 = var60;
                } else if (arg0 == 1429) {
                    var58.field2750 = var62;
                    var58.field2615 = var60;
                } else if (arg0 == 1430) {
                    var58.field2649 = var62;
                }
                var58.field2629 = true;
                return;
            }
            if (arg0 < 1600) {
                class188 var65 = arg1 ? field480 : field469;
                if (arg0 == 1500) {
                    field468[field476++] = var65.field2718;
                    return;
                }
                if (arg0 == 1501) {
                    field468[field476++] = var65.field2765;
                    return;
                }
                if (arg0 == 1502) {
                    field468[field476++] = var65.field2711;
                    return;
                }
                if (arg0 == 1503) {
                    field468[field476++] = var65.field2672;
                    return;
                }
                if (arg0 == 1504) {
                    field468[field476++] = var65.field2714 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field468[field476++] = var65.field2745;
                    return;
                }
                if (arg0 == 1506) {
                    class188 var66 = class232.method1555(var65, (byte) 62);
                    field468[field476++] = var66 == null ? -1 : var66.field2678;
                    return;
                }
            } else if (arg0 < 1700) {
                class188 var67 = arg1 ? field480 : field469;
                if (arg0 == 1600) {
                    field468[field476++] = var67.field2700;
                    return;
                }
                if (arg0 == 1601) {
                    field468[field476++] = var67.field2744;
                    return;
                }
                if (arg0 == 1602) {
                    field471[field472++] = var67.field2677;
                    return;
                }
                if (arg0 == 1603) {
                    field468[field476++] = var67.field2694;
                    return;
                }
                if (arg0 == 1604) {
                    field468[field476++] = var67.field2712;
                    return;
                }
                if (arg0 == 1605) {
                    field468[field476++] = var67.field2761;
                    return;
                }
                if (arg0 == 1606) {
                    field468[field476++] = var67.field2735;
                    return;
                }
                if (arg0 == 1607) {
                    field468[field476++] = var67.field2733;
                    return;
                }
                if (arg0 == 1608) {
                    field468[field476++] = var67.field2764;
                    return;
                }
                if (arg0 == 1609) {
                    field468[field476++] = var67.field2747;
                    return;
                }
                if (arg0 == 1610) {
                    field468[field476++] = var67.field2685;
                    return;
                }
                if (arg0 == 1611) {
                    field468[field476++] = var67.field2701;
                    return;
                }
                if (arg0 == 1612) {
                    field468[field476++] = var67.field2665;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field468[--field476];
                    class284 var69 = class215.field3100.method2740((byte) 96, var68);
                    if (var69.method1810(115)) {
                        field471[field472++] = var67.method1322(var69.field4122, var68, -26191);
                    } else {
                        field468[field476++] = var67.method1307(-1, var69.field4127, var68);
                    }
                }
            } else if (arg0 < 1800) {
                class188 var70 = arg1 ? field480 : field469;
                if (arg0 == 1700) {
                    field468[field476++] = var70.field2617;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field2617 != -1) {
                        field468[field476++] = var70.field2710;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field468[field476++] = var70.field2773;
                    return;
                }
            } else if (arg0 < 1900) {
                class188 var71 = arg1 ? field480 : field469;
                if (arg0 == 1800) {
                    field468[field476++] = client.method1380(var71).method1789(16693);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field468[--field476];
                    int var334 = var72 - 1;
                    if (var71.field2698 != null && var334 < var71.field2698.length && var71.field2698[var334] != null) {
                        field471[field472++] = var71.field2698[var334];
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field2663 == null) {
                        field471[field472++] = "";
                        return;
                    }
                    field471[field472++] = var71.field2663;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class188 var332;
                if (arg0 >= 2000) {
                    var332 = class371.method2286(0, field468[--field476]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field480 : field469;
                }
                if (field488 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field2613 == null) {
                        return;
                    }
                    class125 var333 = new class125();
                    var333.field1830 = var332;
                    var333.field1833 = var332.field2613;
                    var333.field1827 = field488 + 1;
                    class440.field6536.method1015(false, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class188 var73 = class371.method2286(0, field468[--field476]);
                if (arg0 == 2500) {
                    field468[field476++] = var73.field2718;
                    return;
                }
                if (arg0 == 2501) {
                    field468[field476++] = var73.field2765;
                    return;
                }
                if (arg0 == 2502) {
                    field468[field476++] = var73.field2711;
                    return;
                }
                if (arg0 == 2503) {
                    field468[field476++] = var73.field2672;
                    return;
                }
                if (arg0 == 2504) {
                    field468[field476++] = var73.field2714 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field468[field476++] = var73.field2745;
                    return;
                }
                if (arg0 == 1506) {
                    class188 var74 = class232.method1555(var73, (byte) 97);
                    field468[field476++] = var74 == null ? -1 : var74.field2678;
                    return;
                }
            } else if (arg0 < 2700) {
                class188 var75 = class371.method2286(0, field468[--field476]);
                if (arg0 == 2600) {
                    field468[field476++] = var75.field2700;
                    return;
                }
                if (arg0 == 2601) {
                    field468[field476++] = var75.field2744;
                    return;
                }
                if (arg0 == 2602) {
                    field471[field472++] = var75.field2677;
                    return;
                }
                if (arg0 == 2603) {
                    field468[field476++] = var75.field2694;
                    return;
                }
                if (arg0 == 2604) {
                    field468[field476++] = var75.field2712;
                    return;
                }
                if (arg0 == 2605) {
                    field468[field476++] = var75.field2761;
                    return;
                }
                if (arg0 == 2606) {
                    field468[field476++] = var75.field2735;
                    return;
                }
                if (arg0 == 2607) {
                    field468[field476++] = var75.field2733;
                    return;
                }
                if (arg0 == 2608) {
                    field468[field476++] = var75.field2764;
                    return;
                }
                if (arg0 == 2609) {
                    field468[field476++] = var75.field2747;
                    return;
                }
                if (arg0 == 2610) {
                    field468[field476++] = var75.field2685;
                    return;
                }
                if (arg0 == 2611) {
                    field468[field476++] = var75.field2701;
                    return;
                }
                if (arg0 == 2612) {
                    field468[field476++] = var75.field2665;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class188 var76 = class371.method2286(0, field468[--field476]);
                    field468[field476++] = var76.field2617;
                    return;
                }
                if (arg0 == 2701) {
                    class188 var77 = class371.method2286(0, field468[--field476]);
                    if (var77.field2617 == -1) {
                        field468[field476++] = 0;
                        return;
                    } else {
                        field468[field476++] = var77.field2710;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field468[--field476];
                    class305 var79 = (class305) class49.field545.method875((long) var78, 126);
                    if (var79 != null) {
                        field468[field476++] = 1;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class188 var80 = class371.method2286(0, field468[--field476]);
                    if (var80.field2758 == null) {
                        field468[field476++] = 0;
                        return;
                    }
                    int var81 = var80.field2758.length;
                    for (int var82 = 0; var82 < var80.field2758.length; var82++) {
                        if (var80.field2758[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field468[field476++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field476 -= 2;
                    int var83 = field468[field476];
                    int var84 = field468[field476 + 1];
                    class305 var85 = (class305) class49.field545.method875((long) var83, 126);
                    if (var85 != null && var85.field4333 == var84) {
                        field468[field476++] = 1;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class188 var86 = class371.method2286(0, field468[--field476]);
                if (arg0 == 2800) {
                    field468[field476++] = client.method1380(var86).method1789(16693);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field468[--field476];
                    int var335 = var87 - 1;
                    if (var86.field2698 != null && var335 < var86.field2698.length && var86.field2698[var335] != null) {
                        field471[field472++] = var86.field2698[var335];
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field2663 == null) {
                        field471[field472++] = "";
                        return;
                    }
                    field471[field472++] = var86.field2663;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field471[--field472];
                    class407.method2497((byte) -99, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field476 -= 2;
                    class111.method907(field468[field476 + 1], class435.field6375, false, field468[field476]);
                    return;
                }
                if (arg0 == 3103) {
                    class522.method3102(-15257, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field471[--field472];
                    int var90 = 0;
                    if (class242.method1599(var89, 59)) {
                        var90 = class56.method521(var89, 10);
                    }
                    field464++;
                    class32.method258(-126, class493.field7210);
                    class472.field6970.method618(var90, (byte) -46);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field471[--field472];
                    field475++;
                    class32.method258(-53, class288.field4149);
                    class472.field6970.method638(255, var91.length() + 1);
                    class472.field6970.method605(55, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field471[--field472];
                    field463++;
                    class32.method258(-93, class101.field1425);
                    class472.field6970.method638(255, var92.length() + 1);
                    class472.field6970.method605(74, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field468[--field476];
                    String var94 = field471[--field472];
                    class325.method2010(var94, var93, (byte) -24);
                    return;
                }
                if (arg0 == 3108) {
                    field476 -= 3;
                    int var95 = field468[field476];
                    int var96 = field468[field476 + 1];
                    int var97 = field468[field476 + 2];
                    class188 var98 = class371.method2286(0, var97);
                    class141.method1051(0, var96, var98, var95);
                    return;
                }
                if (arg0 == 3109) {
                    field476 -= 2;
                    int var99 = field468[field476];
                    int var100 = field468[field476 + 1];
                    class188 var101 = arg1 ? field480 : field469;
                    class141.method1051(0, var100, var101, var99);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field468[--field476];
                    field477++;
                    class32.method258(-61, class371.field5518);
                    class472.field6970.method611((byte) 67, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field476 -= 2;
                    int var103 = field468[field476];
                    int var104 = field468[field476 + 1];
                    class305 var105 = (class305) class49.field545.method875((long) var103, 124);
                    if (var105 != null) {
                        class349.method2103(var105.field4333 != var104, var105, true, -43);
                    }
                    class169.method1185(var104, 3, true, (byte) -71, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field476--;
                    int var106 = field468[field476];
                    class305 var107 = (class305) class49.field545.method875((long) var106, 125);
                    if (var107 != null && var107.field4335 == 3) {
                        class349.method2103(true, var107, true, -41);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class99.method843(field471[--field472], -110);
                    return;
                }
                if (arg0 == 3114) {
                    field476 -= 2;
                    int var108 = field468[field476];
                    int var109 = field468[field476 + 1];
                    String var110 = field471[--field472];
                    class331.method2032(var109, var108, var110, "", "", true);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field476 -= 3;
                    class432.method2621(field468[field476], 0, field468[field476 + 1], 255, field468[field476 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class481.method2899(field468[--field476], -97, 50, 255);
                    return;
                }
                if (arg0 == 3202) {
                    field476 -= 2;
                    class373.method2300(255, 0, field468[field476 + 1], field468[field476]);
                    return;
                }
                if (arg0 == 3203) {
                    field476 -= 4;
                    class432.method2621(field468[field476], 0, field468[field476 + 1], field468[field476 + 3], field468[field476 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field476 -= 3;
                    class481.method2899(field468[field476], 125, field468[field476 + 2], field468[field476 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field476 -= 3;
                    class373.method2300(field468[field476 + 2], 0, field468[field476 + 1], field468[field476]);
                    return;
                }
                if (arg0 == 3206) {
                    field476 -= 4;
                    class148.method1068(field468[field476 + 1], field468[field476 + 2], false, field468[field476], field468[field476 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field468[field476++] = class263.field3867;
                    return;
                }
                if (arg0 == 3301) {
                    field476 -= 2;
                    int var111 = field468[field476];
                    int var112 = field468[field476 + 1];
                    field468[field476++] = class253.method1641(false, false, var112, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field476 -= 2;
                    int var113 = field468[field476];
                    int var114 = field468[field476 + 1];
                    field468[field476++] = class251.method1631(120, var114, var113, false);
                    return;
                }
                if (arg0 == 3303) {
                    field476 -= 2;
                    int var115 = field468[field476];
                    int var116 = field468[field476 + 1];
                    field468[field476++] = class228.method1539(-10077, false, var115, var116);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field468[--field476];
                    field468[field476++] = class156.field2223.method1458(5, var117).field233;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field468[--field476];
                    field468[field476++] = class391.field5763[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field468[--field476];
                    field468[field476++] = class56.field629[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field468[--field476];
                    field468[field476++] = class491.field7199[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class435.field6375.field6328;
                    int var122 = (class435.field6375.field6335 >> 7) + class340.field4713;
                    int var123 = (class435.field6375.field6334 >> 7) + class476.field7013;
                    field468[field476++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field468[--field476];
                    field468[field476++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field468[--field476];
                    field468[field476++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field468[--field476];
                    field468[field476++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field468[field476++] = class49.field542 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field476 -= 2;
                    int var127 = field468[field476];
                    int var128 = field468[field476 + 1];
                    field468[field476++] = class253.method1641(false, true, var128, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field476 -= 2;
                    int var129 = field468[field476];
                    int var130 = field468[field476 + 1];
                    field468[field476++] = class251.method1631(67, var130, var129, true);
                    return;
                }
                if (arg0 == 3315) {
                    field476 -= 2;
                    int var131 = field468[field476];
                    int var132 = field468[field476 + 1];
                    field468[field476++] = class228.method1539(-10077, true, var131, var132);
                    return;
                }
                if (arg0 == 3316) {
                    if (class365.field5273 >= 2) {
                        field468[field476++] = class365.field5273;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field468[field476++] = class76.field1036;
                    return;
                }
                if (arg0 == 3318) {
                    field468[field476++] = class77.field1046;
                    return;
                }
                if (arg0 == 3321) {
                    field468[field476++] = class150.field2123;
                    return;
                }
                if (arg0 == 3322) {
                    field468[field476++] = class333.field4631;
                    return;
                }
                if (arg0 == 3323) {
                    if (class499.field7409 >= 5 && class499.field7409 <= 9) {
                        field468[field476++] = 1;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class499.field7409 >= 5 && class499.field7409 <= 9) {
                        field468[field476++] = class499.field7409;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field468[field476++] = class40.field454 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field468[field476++] = class435.field6375.field5093;
                    return;
                }
                if (arg0 == 3327) {
                    field468[field476++] = class435.field6375.field5065.field7167 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field468[field476++] = class388.field5741 && !class53.field582 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field468[field476++] = class411.field6107 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field468[--field476];
                    field468[field476++] = class392.method2404(false, var133, true);
                    return;
                }
                if (arg0 == 3331) {
                    field476 -= 2;
                    int var134 = field468[field476];
                    int var135 = field468[field476 + 1];
                    field468[field476++] = class178.method1250(false, false, var134, var135, (byte) 120);
                    return;
                }
                if (arg0 == 3332) {
                    field476 -= 2;
                    int var136 = field468[field476];
                    int var137 = field468[field476 + 1];
                    field468[field476++] = class178.method1250(false, true, var136, var137, (byte) 84);
                    return;
                }
                if (arg0 == 3333) {
                    field468[field476++] = class412.field6114;
                    return;
                }
                if (arg0 == 3335) {
                    field468[field476++] = class377.field5585;
                    return;
                }
                if (arg0 == 3336) {
                    field476 -= 4;
                    int var138 = field468[field476];
                    int var139 = field468[field476 + 1];
                    int var140 = field468[field476 + 2];
                    int var141 = field468[field476 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field468[field476++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field468[field476++] = class401.field5950;
                    return;
                }
                if (arg0 == 3338) {
                    field468[field476++] = class165.method1167(-49);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field476 -= 2;
                    int var145 = field468[field476];
                    int var146 = field468[field476 + 1];
                    class64 var147 = class342.field4735.method1535(var145, -92);
                    field471[field472++] = var147.method574(114, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field476 -= 4;
                    int var148 = field468[field476];
                    int var149 = field468[field476 + 1];
                    int var150 = field468[field476 + 2];
                    int var151 = field468[field476 + 3];
                    class64 var152 = class342.field4735.method1535(var150, -93);
                    if (var152.field756 == var148 && var152.field759 == var149) {
                        if (var149 == 115) {
                            field471[field472++] = var152.method574(109, var151);
                            return;
                        }
                        field468[field476++] = var152.method569(var151, -6);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field476 -= 3;
                    int var153 = field468[field476];
                    int var154 = field468[field476 + 1];
                    int var155 = field468[field476 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class64 var156 = class342.field4735.method1535(var154, 22);
                    if (var156.field759 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field468[field476++] = var156.method572(true, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field468[--field476];
                    String var158 = field471[--field472];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class64 var159 = class342.field4735.method1535(var157, -98);
                    if (var159.field759 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field468[field476++] = var159.method571(2, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field468[--field476];
                    class64 var161 = class342.field4735.method1535(var160, -110);
                    field468[field476++] = var161.field763.method873(-5);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class471.field6950 == 0) {
                        field468[field476++] = -2;
                        return;
                    }
                    if (class471.field6950 == 1) {
                        field468[field476++] = -1;
                        return;
                    }
                    field468[field476++] = class91.field1257;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field468[--field476];
                    if (class471.field6950 == 2 && var162 < class91.field1257) {
                        field471[field472++] = class353.field4943[var162];
                        if (class326.field4578[var162] != null) {
                            field471[field472++] = class326.field4578[var162];
                            return;
                        }
                        field471[field472++] = "";
                        return;
                    }
                    field471[field472++] = "";
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field468[--field476];
                    if (class471.field6950 == 2 && var163 < class91.field1257) {
                        field468[field476++] = class45.field508[var163];
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field468[--field476];
                    if (class471.field6950 == 2 && var164 < class91.field1257) {
                        field468[field476++] = class348.field4831[var164];
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field471[--field472];
                    int var166 = field468[--field476];
                    class172.method1221(var165, var166, 1);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field471[--field472];
                    class475.method2866(var167, false);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field471[--field472];
                    class132.method1010(var168, (byte) -117);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field471[--field472];
                    class222.method1520((byte) -125, false, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field471[--field472];
                    class179.method1257(var170, 104);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field471[--field472];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field468[field476++] = class138.method1038(119, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field468[--field476];
                    if (class471.field6950 == 2 && var172 < class91.field1257) {
                        field471[field472++] = class198.field2895[var172];
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class158.field2242 != null) {
                        field471[field472++] = class281.method1800(true, class158.field2242);
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class158.field2242 != null) {
                        field468[field476++] = class221.field3177;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field468[--field476];
                    if (class158.field2242 != null && var173 < class221.field3177) {
                        field471[field472++] = class24.field288[var173].field3756;
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field468[--field476];
                    if (class158.field2242 != null && var174 < class221.field3177) {
                        field468[field476++] = class24.field288[var174].field3759;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field468[--field476];
                    if (class158.field2242 != null && var175 < class221.field3177) {
                        field468[field476++] = class24.field288[var175].field3757;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field468[field476++] = class280.field4100;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field471[--field472];
                    class494.method2959(var176, (byte) 67);
                    return;
                }
                if (arg0 == 3618) {
                    field468[field476++] = class491.field7196;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field471[--field472];
                    class117.method927(var177, 65);
                    return;
                }
                if (arg0 == 3620) {
                    class50.method505(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class471.field6950 == 0) {
                        field468[field476++] = -1;
                        return;
                    }
                    field468[field476++] = class188.field2696;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field468[--field476];
                    if (class471.field6950 != 0 && var178 < class188.field2696) {
                        field471[field472++] = class397.field5820[var178];
                        if (class367.field5467[var178] != null) {
                            field471[field472++] = class367.field5467[var178];
                            return;
                        }
                        field471[field472++] = "";
                        return;
                    }
                    field471[field472++] = "";
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field471[--field472];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field468[field476++] = class88.method778(var179, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field468[--field476];
                    if (class24.field288 != null && var180 < class221.field3177 && class24.field288[var180].field3755.equalsIgnoreCase(class435.field6375.field5074)) {
                        field468[field476++] = 1;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class391.field5758 != null) {
                        field471[field472++] = class391.field5758;
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field468[--field476];
                    if (class158.field2242 != null && var181 < class221.field3177) {
                        field471[field472++] = class24.field288[var181].field3751;
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field468[--field476];
                    if (class471.field6950 == 2 && var182 >= 0 && var182 < class91.field1257) {
                        field468[field476++] = class305.field4336[var182] ? 1 : 0;
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field471[--field472];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field468[field476++] = class28.method227(-30749, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field468[field476++] = class245.field3603;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field471[--field472];
                    class222.method1520((byte) -118, true, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field468[--field476];
                    field468[field476++] = class244.field3598[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field468[--field476];
                    if (class158.field2242 != null && var186 < class221.field3177) {
                        field471[field472++] = class24.field288[var186].field3755;
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field468[--field476];
                    if (class471.field6950 != 0 && var187 < class188.field2696) {
                        field471[field472++] = class474.field6987[var187];
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field468[--field476];
                    field468[field476++] = class404.field5978[var188].method2904((byte) 100);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field468[--field476];
                    field468[field476++] = class404.field5978[var189].field7082;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field468[--field476];
                    field468[field476++] = class404.field5978[var190].field7085;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field468[--field476];
                    field468[field476++] = class404.field5978[var191].field7086;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field468[--field476];
                    field468[field476++] = class404.field5978[var192].field7080;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field468[--field476];
                    field468[field476++] = class404.field5978[var193].field7093;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field468[--field476];
                    int var195 = class404.field5978[var194].method2903((byte) -111);
                    field468[field476++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field468[--field476];
                    int var197 = class404.field5978[var196].method2903((byte) -111);
                    field468[field476++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field468[--field476];
                    int var199 = class404.field5978[var198].method2903((byte) -111);
                    field468[field476++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field468[--field476];
                    int var201 = class404.field5978[var200].method2903((byte) -111);
                    field468[field476++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field476 -= 2;
                    int var202 = field468[field476];
                    int var203 = field468[field476 + 1];
                    field468[field476++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field476 -= 2;
                    int var204 = field468[field476];
                    int var205 = field468[field476 + 1];
                    field468[field476++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field476 -= 2;
                    int var206 = field468[field476];
                    int var207 = field468[field476 + 1];
                    field468[field476++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field476 -= 2;
                    int var208 = field468[field476];
                    int var209 = field468[field476 + 1];
                    field468[field476++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field468[--field476];
                    field468[field476++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field468[--field476];
                    field468[field476++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field476 -= 5;
                    int var212 = field468[field476];
                    int var213 = field468[field476 + 1];
                    int var214 = field468[field476 + 2];
                    int var215 = field468[field476 + 3];
                    int var216 = field468[field476 + 4];
                    field468[field476++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field476 -= 2;
                    long var217 = (long) field468[field476];
                    long var219 = (long) field468[field476 + 1];
                    field468[field476++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field476 -= 2;
                    int var221 = field468[field476];
                    int var222 = field468[field476 + 1];
                    field468[field476++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field476 -= 2;
                    int var223 = field468[field476];
                    int var224 = field468[field476 + 1];
                    field468[field476++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field476 -= 2;
                    int var225 = field468[field476];
                    int var226 = field468[field476 + 1];
                    field468[field476++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field476 -= 2;
                    int var227 = field468[field476];
                    int var228 = field468[field476 + 1];
                    field468[field476++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field476 -= 2;
                    int var229 = field468[field476];
                    int var230 = field468[field476 + 1];
                    if (var229 == 0) {
                        field468[field476++] = 0;
                        return;
                    }
                    field468[field476++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field476 -= 2;
                    int var231 = field468[field476];
                    int var232 = field468[field476 + 1];
                    if (var231 == 0) {
                        field468[field476++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field468[field476++] = Integer.MAX_VALUE;
                        return;
                    }
                    field468[field476++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field476 -= 2;
                    int var233 = field468[field476];
                    int var234 = field468[field476 + 1];
                    field468[field476++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field476 -= 2;
                    int var235 = field468[field476];
                    int var236 = field468[field476 + 1];
                    field468[field476++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field476 -= 2;
                    int var237 = field468[field476];
                    int var238 = field468[field476 + 1];
                    field468[field476++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field476 -= 2;
                    int var239 = field468[field476];
                    int var240 = field468[field476 + 1];
                    field468[field476++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field476 -= 3;
                    long var241 = (long) field468[field476];
                    long var243 = (long) field468[field476 + 1];
                    long var245 = (long) field468[field476 + 2];
                    field468[field476++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field471[--field472];
                    int var248 = field468[--field476];
                    field471[field472++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field472 -= 2;
                    String var249 = field471[field472];
                    String var250 = field471[field472 + 1];
                    field471[field472++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field471[--field472];
                    int var252 = field468[--field476];
                    field471[field472++] = var251 + class272.method1759(true, var252, (byte) 103);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field471[--field472];
                    field471[field472++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field471[field472++] = method402(field468[--field476]);
                    return;
                }
                if (arg0 == 4105) {
                    field472 -= 2;
                    String var254 = field471[field472];
                    String var255 = field471[field472 + 1];
                    if (class435.field6375.field5065 != null && class435.field6375.field5065.field7167) {
                        field471[field472++] = var255;
                        return;
                    }
                    field471[field472++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field468[--field476];
                    field471[field472++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field472 -= 2;
                    field468[field476++] = class17.method134(103, field471[field472 + 1], field471[field472], class377.field5585);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field471[--field472];
                    field476 -= 2;
                    int var258 = field468[field476];
                    int var259 = field468[field476 + 1];
                    class316 var260 = class88.method775(6, 0, var259, class55.field584);
                    field468[field476++] = var260.method1976(94, class32.field374, var258, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field471[--field472];
                    field476 -= 2;
                    int var262 = field468[field476];
                    int var263 = field468[field476 + 1];
                    class316 var264 = class88.method775(6, 0, var263, class55.field584);
                    field468[field476++] = var264.method1978((byte) 123, var261, var262, class32.field374);
                    return;
                }
                if (arg0 == 4110) {
                    field472 -= 2;
                    String var265 = field471[field472];
                    String var266 = field471[field472 + 1];
                    if (field468[--field476] == 1) {
                        field471[field472++] = var265;
                        return;
                    }
                    field471[field472++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field471[--field472];
                    field471[field472++] = class450.method2723(var267, (byte) 90);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field471[--field472];
                    int var269 = field468[--field476];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field471[field472++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field468[--field476];
                    field468[field476++] = class388.method2389((char) var270, 123) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field468[--field476];
                    field468[field476++] = class176.method1235(-122, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field468[--field476];
                    field468[field476++] = class101.method862(26959, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field468[--field476];
                    field468[field476++] = class195.method1366((char) var273, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field471[--field472];
                    if (var274 != null) {
                        field468[field476++] = var274.length();
                        return;
                    }
                    field468[field476++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field471[--field472];
                    field476 -= 2;
                    int var276 = field468[field476];
                    int var277 = field468[field476 + 1];
                    field471[field472++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field471[--field472];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field471[field472++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field471[--field472];
                    field476 -= 2;
                    int var284 = field468[field476];
                    int var285 = field468[field476 + 1];
                    field468[field476++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field472 -= 2;
                    String var286 = field471[field472];
                    String var287 = field471[field472 + 1];
                    int var288 = field468[--field476];
                    field468[field476++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field468[--field476];
                    field468[field476++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field468[--field476];
                    field468[field476++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field468[--field476] != 0;
                    int var292 = field468[--field476];
                    field471[field472++] = class74.method703(var291, (long) var292, 0, -121, class377.field5585);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field471[--field472];
                    int var294 = field468[--field476];
                    class316 var295 = class88.method775(6, 0, var294, class55.field584);
                    field468[field476++] = var295.method1971(var293, 67, class32.field374);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field468[--field476];
                    field471[field472++] = class270.field3995.method6(22883, var296).field929;
                    return;
                }
                if (arg0 == 4201) {
                    field476 -= 2;
                    int var297 = field468[field476];
                    int var298 = field468[field476 + 1];
                    class72 var299 = class270.field3995.method6(22883, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field947[var298 - 1] != null) {
                        field471[field472++] = var299.field947[var298 - 1];
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field476 -= 2;
                    int var300 = field468[field476];
                    int var301 = field468[field476 + 1];
                    class72 var302 = class270.field3995.method6(22883, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field930[var301 - 1] != null) {
                        field471[field472++] = var302.field930[var301 - 1];
                        return;
                    }
                    field471[field472++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field468[--field476];
                    field468[field476++] = class270.field3995.method6(22883, var303).field966;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field468[--field476];
                    field468[field476++] = class270.field3995.method6(22883, var304).field965 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field468[--field476];
                    class72 var306 = class270.field3995.method6(22883, var305);
                    if (var306.field980 == -1 && var306.field963 >= 0) {
                        field468[field476++] = var306.field963;
                        return;
                    }
                    field468[field476++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field468[--field476];
                    class72 var308 = class270.field3995.method6(22883, var307);
                    if (var308.field980 >= 0 && var308.field963 >= 0) {
                        field468[field476++] = var308.field963;
                        return;
                    }
                    field468[field476++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field468[--field476];
                    field468[field476++] = class270.field3995.method6(22883, var309).field945 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field476 -= 2;
                    int var310 = field468[field476];
                    int var311 = field468[field476 + 1];
                    class284 var312 = class215.field3100.method2740((byte) -77, var311);
                    if (var312.method1810(115)) {
                        field471[field472++] = class270.field3995.method6(22883, var310).method687(var312.field4122, -128, var311);
                        return;
                    }
                    field468[field476++] = class270.field3995.method6(22883, var310).method679(var311, -115, var312.field4127);
                    return;
                }
                if (arg0 == 4209) {
                    field476 -= 2;
                    int var313 = field468[field476];
                    int var314 = field468[field476 + 1] - 1;
                    class72 var315 = class270.field3995.method6(22883, var313);
                    if (var315.field941 == var314) {
                        field468[field476++] = var315.field961;
                        return;
                    }
                    if (var315.field990 == var314) {
                        field468[field476++] = var315.field916;
                        return;
                    }
                    field468[field476++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field471[--field472];
                    int var317 = field468[--field476];
                    class101.method864((byte) 105, var316, var317 == 1);
                    field468[field476++] = class402.field5967;
                    return;
                }
                if (arg0 == 4211) {
                    if (class503.field7464 != null && class206.field2996 < class402.field5967) {
                        field468[field476++] = class503.field7464[class206.field2996++] & 0xFFFF;
                        return;
                    }
                    field468[field476++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class206.field2996 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field476 -= 2;
                    int var318 = field468[field476];
                    int var319 = field468[field476 + 1];
                    class284 var320 = class215.field3100.method2740((byte) -80, var319);
                    if (var320.method1810(115)) {
                        field471[field472++] = class515.field7587.method1215(var318, 1).method853((byte) -116, var320.field4122, var319);
                        return;
                    }
                    field468[field476++] = class515.field7587.method1215(var318, 1).method856(var320.field4127, var319, 0);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field476 -= 2;
                    int var321 = field468[field476];
                    int var322 = field468[field476 + 1];
                    class284 var323 = class215.field3100.method2740((byte) 123, var322);
                    if (var323.method1810(115)) {
                        field471[field472++] = class384.field5645.method786(var321, 0).method1522(-126, var323.field4122, var322);
                        return;
                    }
                    field468[field476++] = class384.field5645.method786(var321, 0).method1510(var322, (byte) 85, var323.field4127);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field476 -= 2;
                    int var324 = field468[field476];
                    int var325 = field468[field476 + 1];
                    class284 var326 = class215.field3100.method2740((byte) 116, var325);
                    if (var326.method1810(115)) {
                        field471[field472++] = class348.field4829.method64(var324, -24).method219(-16471, var326.field4122, var325);
                        return;
                    }
                    field468[field476++] = class348.field4829.method64(var324, -24).method218(var326.field4127, 76, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field468[--field476];
                class531 var328 = class284.field4134.method2499(false, var327);
                if (var328.field7801 != null && var328.field7801.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field7807[0];
                    for (int var331 = 1; var331 < var328.field7801.length; var331++) {
                        if (var328.field7807[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field7807[var331];
                        }
                    }
                    field468[field476++] = var328.field7801[var329];
                    return;
                }
                field468[field476++] = var328.field7776;
                return;
            }
        } else {
            class188 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class371.method2286(0, field468[--field476]);
            } else {
                var47 = arg1 ? field480 : field469;
            }
            if (arg0 == 1300) {
                int var48 = field468[--field476] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1313(field471[--field472], var48, (byte) -54);
                    return;
                }
                field472--;
                return;
            }
            if (arg0 == 1301) {
                field476 -= 2;
                int var49 = field468[field476];
                int var50 = field468[field476 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field2687 = null;
                    return;
                }
                var47.field2687 = class274.method1766(var49, var50, (byte) -21);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field468[--field476];
                if (class278.field4073 != var51 && class369.field5489 != var51 && class193.field2815 != var51) {
                    return;
                }
                var47.field2612 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field2647 = field468[--field476];
                return;
            }
            if (arg0 == 1304) {
                var47.field2633 = field468[--field476];
                return;
            }
            if (arg0 == 1305) {
                var47.field2663 = field471[--field472];
                return;
            }
            if (arg0 == 1306) {
                var47.field2753 = field471[--field472];
                return;
            }
            if (arg0 == 1307) {
                var47.field2698 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field2606 = field468[--field476];
                var47.field2641 = field468[--field476];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field468[--field476];
                int var53 = field468[--field476];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1306(65535, var52, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field2636 = field471[--field472];
                return;
            }
            if (arg0 == 1311) {
                var47.field2736 = field468[--field476];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field476 -= 3;
                    var54 = field468[field476] - 1;
                    var55 = field468[field476 + 1];
                    var56 = field468[field476 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field476 -= 2;
                    var54 = 10;
                    var55 = field468[field476];
                    var56 = field468[field476 + 1];
                }
                if (var47.field2621 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field2621 = new byte[11];
                    var47.field2743 = new byte[11];
                    var47.field2762 = new int[11];
                }
                var47.field2621[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field2759 = false;
                    for (int var57 = 0; var57 < var47.field2621.length; var57++) {
                        if (var47.field2621[var57] != 0) {
                            var47.field2759 = true;
                            break;
                        }
                    }
                } else {
                    var47.field2759 = true;
                }
                var47.field2743[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field2640 = field468[--field476];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V", line = 3692)
    private static final void method404(int arg0) {
        class188 var1 = class371.method2286(0, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class188[] var3 = class335.field4671[var2];
        if (var3 == null) {
            class188[] var4 = class123.field1803[var2];
            int var5 = var4.length;
            var3 = class335.field4671[var2] = new class188[var5];
            class201.method1414(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class201.method1414(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V", line = 3736)
    private static final void method405(int arg0) {
        class188 var1 = class371.method2286(0, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class188[] var3 = class335.field4671[var2];
        if (var3 == null) {
            class188[] var4 = class123.field1803[var2];
            int var5 = var4.length;
            var3 = class335.field4671[var2] = new class188[var5];
            class201.method1414(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class201.method1414(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3775)
    private static final void method406(String arg0, int arg1) {
        if (class365.field5273 == 0 && !(!class388.field5741 || class53.field582) || class411.field6107) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class294.field4224.method2031(true, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class294.field4224.method2031(true, 0).length());
        } else if (var2.startsWith(class180.field2539.method2031(true, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class180.field2539.method2031(true, 0).length());
        } else if (var2.startsWith(class215.field3095.method2031(true, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class215.field3095.method2031(true, 0).length());
        } else if (var2.startsWith(class86.field1169.method2031(true, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class86.field1169.method2031(true, 0).length());
        } else if (var2.startsWith(class483.field7112.method2031(true, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class483.field7112.method2031(true, 0).length());
        } else if (var2.startsWith(class407.field6064.method2031(true, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class407.field6064.method2031(true, 0).length());
        } else if (var2.startsWith(class26.field315.method2031(true, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class26.field315.method2031(true, 0).length());
        } else if (var2.startsWith(class404.field5980.method2031(true, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class404.field5980.method2031(true, 0).length());
        } else if (var2.startsWith(class138.field1971.method2031(true, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class138.field1971.method2031(true, 0).length());
        } else if (var2.startsWith(class503.field7461.method2031(true, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class503.field7461.method2031(true, 0).length());
        } else if (var2.startsWith(class212.field3055.method2031(true, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class212.field3055.method2031(true, 0).length());
        } else if (var2.startsWith(class500.field7411.method2031(true, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class500.field7411.method2031(true, 0).length());
        } else if (class377.field5585 != 0) {
            if (var2.startsWith(class294.field4224.method2031(true, class377.field5585))) {
                var3 = 0;
                arg0 = arg0.substring(class294.field4224.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class180.field2539.method2031(true, class377.field5585))) {
                var3 = 1;
                arg0 = arg0.substring(class180.field2539.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class215.field3095.method2031(true, class377.field5585))) {
                var3 = 2;
                arg0 = arg0.substring(class215.field3095.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class86.field1169.method2031(true, class377.field5585))) {
                var3 = 3;
                arg0 = arg0.substring(class86.field1169.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class483.field7112.method2031(true, class377.field5585))) {
                var3 = 4;
                arg0 = arg0.substring(class483.field7112.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class407.field6064.method2031(true, class377.field5585))) {
                var3 = 5;
                arg0 = arg0.substring(class407.field6064.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class26.field315.method2031(true, class377.field5585))) {
                var3 = 6;
                arg0 = arg0.substring(class26.field315.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class404.field5980.method2031(true, class377.field5585))) {
                var3 = 7;
                arg0 = arg0.substring(class404.field5980.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class138.field1971.method2031(true, class377.field5585))) {
                var3 = 8;
                arg0 = arg0.substring(class138.field1971.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class503.field7461.method2031(true, class377.field5585))) {
                var3 = 9;
                arg0 = arg0.substring(class503.field7461.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class212.field3055.method2031(true, class377.field5585))) {
                var3 = 10;
                arg0 = arg0.substring(class212.field3055.method2031(true, class377.field5585).length());
            } else if (var2.startsWith(class500.field7411.method2031(true, class377.field5585))) {
                var3 = 11;
                arg0 = arg0.substring(class500.field7411.method2031(true, class377.field5585).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class101.field1424.method2031(true, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class101.field1424.method2031(true, 0).length());
        } else if (var4.startsWith(class334.field4633.method2031(true, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class334.field4633.method2031(true, 0).length());
        } else if (var4.startsWith(class229.field3357.method2031(true, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class229.field3357.method2031(true, 0).length());
        } else if (var4.startsWith(class86.field1172.method2031(true, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class86.field1172.method2031(true, 0).length());
        } else if (var4.startsWith(class464.field6826.method2031(true, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class464.field6826.method2031(true, 0).length());
        } else if (class377.field5585 != 0) {
            if (var4.startsWith(class101.field1424.method2031(true, class377.field5585))) {
                var5 = 1;
                arg0 = arg0.substring(class101.field1424.method2031(true, class377.field5585).length());
            } else if (var4.startsWith(class334.field4633.method2031(true, class377.field5585))) {
                var5 = 2;
                arg0 = arg0.substring(class334.field4633.method2031(true, class377.field5585).length());
            } else if (var4.startsWith(class229.field3357.method2031(true, class377.field5585))) {
                var5 = 3;
                arg0 = arg0.substring(class229.field3357.method2031(true, class377.field5585).length());
            } else if (var4.startsWith(class86.field1172.method2031(true, class377.field5585))) {
                var5 = 4;
                arg0 = arg0.substring(class86.field1172.method2031(true, class377.field5585).length());
            } else if (var4.startsWith(class464.field6826.method2031(true, class377.field5585))) {
                var5 = 5;
                arg0 = arg0.substring(class464.field6826.method2031(true, class377.field5585).length());
            }
        }
        field465++;
        class32.method258(-59, class199.field2913);
        class472.field6970.method638(255, 0);
        int var6 = class472.field6970.field827;
        if (arg1 == 5021) {
            class472.field6970.method638(255, 1);
        } else if (arg1 == 5022) {
            class472.field6970.method638(255, 2);
        } else {
            class472.field6970.method638(255, 0);
        }
        class472.field6970.method638(255, var3);
        class472.field6970.method638(255, var5);
        class131.method1006(arg0, 0, class472.field6970);
        class472.field6970.method632(-1591647264, class472.field6970.field827 - var6);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "()V", line = 4051)
    public static void method407() {
        field460 = null;
        field484 = null;
        field482 = null;
        field473 = null;
        field468 = null;
        field471 = null;
        field479 = null;
        field469 = null;
        field480 = null;
        field466 = null;
        field478 = null;
        field487 = null;
        field486 = null;
        field485 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "()V", line = 4074)
    public static final void method408() {
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lop;)V", line = 4080)
    public static final void method409(class125 arg0) {
        method401(arg0, 200000);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(IZ)V", line = 4085)
    public static final void method410(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lae;I)V", line = 4106)
    private static final void method411(class164 arg0, int arg1) {
        field476 = 0;
        field472 = 0;
        int var2 = -1;
        int[] var3 = arg0.field2318;
        int[] var4 = arg0.field2321;
        byte var5 = -1;
        field483 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method403(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method413(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field468[field476++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field468[field476++] = class253.field3739.field6689[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class253.field3739.method2746(0, field468[--field476], var8);
                } else if (var43 == 3) {
                    field471[field472++] = arg0.field2323[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field476 -= 2;
                    if (field468[field476 + 1] != field468[field476]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field476 -= 2;
                    if (field468[field476 + 1] == field468[field476]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field476 -= 2;
                    if (field468[field476] < field468[field476 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field476 -= 2;
                    if (field468[field476] > field468[field476 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field483 == 0) {
                        return;
                    }
                    class219 var9 = field479[--field483];
                    arg0 = var9.field3148;
                    var3 = arg0.field2318;
                    var4 = arg0.field2321;
                    var2 = var9.field3153;
                    field460 = var9.field3151;
                    field484 = var9.field3152;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field468[field476++] = class253.field3739.method2543((byte) 45, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class253.field3739.method2750(var11, (byte) 108, field468[--field476]);
                } else if (var43 == 31) {
                    field476 -= 2;
                    if (field468[field476] <= field468[field476 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field476 -= 2;
                    if (field468[field476] >= field468[field476 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field468[field476++] = field460[var4[var2]];
                } else if (var43 == 34) {
                    field460[var4[var2]] = field468[--field476];
                } else if (var43 == 35) {
                    field471[field472++] = field484[var4[var2]];
                } else if (var43 == 36) {
                    field484[var4[var2]] = field471[--field472];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field472 -= var12;
                    String var13 = class321.method1987(field472, field471, (byte) 123, var12);
                    field471[field472++] = var13;
                } else if (var43 == 38) {
                    field476--;
                } else if (var43 == 39) {
                    field472--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class164 var15 = class519.method3085(var14, 71);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field2322];
                    String[] var17 = new String[var15.field2324];
                    for (int var18 = 0; var18 < var15.field2320; var18++) {
                        var16[var18] = field468[field476 + var18 - var15.field2320];
                    }
                    for (int var19 = 0; var19 < var15.field2326; var19++) {
                        var17[var19] = field471[field472 + var19 - var15.field2326];
                    }
                    field476 -= var15.field2320;
                    field472 -= var15.field2326;
                    class219 var20 = new class219();
                    var20.field3148 = arg0;
                    var20.field3153 = var2;
                    var20.field3151 = field460;
                    var20.field3152 = field484;
                    if (field483 >= field479.length) {
                        throw new RuntimeException();
                    }
                    field479[field483++] = var20;
                    arg0 = var15;
                    var3 = var15.field2318;
                    var4 = var15.field2321;
                    var2 = -1;
                    field460 = var16;
                    field484 = var17;
                } else if (var43 == 42) {
                    field468[field476++] = class290.field4169[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class290.field4169[var21] = field468[--field476];
                    class482.method2906(var21, -117);
                    class34.field396 |= class450.field6635[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field468[--field476];
                    if (var24 >= 0 && var24 <= 5000) {
                        field482[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field473[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field468[--field476];
                    if (var28 < 0 || var28 >= field482[var27]) {
                        throw new RuntimeException();
                    }
                    field468[field476++] = field473[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field476 -= 2;
                    int var30 = field468[field476];
                    if (var30 < 0 || var30 >= field482[var29]) {
                        throw new RuntimeException();
                    }
                    field473[var29][var30] = field468[field476 + 1];
                } else if (var43 == 47) {
                    String var31 = class162.field2292[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field471[field472++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class162.field2292[var32] = field471[--field472];
                    class526.method3117(2, var32);
                } else if (var43 == 51) {
                    class106 var33 = arg0.field2330[var4[var2]];
                    class389 var34 = (class389) var33.method875((long) field468[--field476], 127);
                    if (var34 != null) {
                        var2 += var34.field5750;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field2328 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field3271).append(" ");
                for (int var41 = field483 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field479[var41].field3148.field3271).append(" ");
                }
                var40.append("op: ").append(var5);
                class194.method1362(var42, var40.toString(), -80);
            } else {
                class407.method2497((byte) -99, "Clientscript error in: " + arg0.field2328);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field2328).append("\n");
                for (int var38 = field483 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field479[var38].field3148.field2328).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class194.method1362(var42, var37.toString(), -79);
                class293.method1856(126, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)V", line = 4536)
    public static final void method412(int arg0) {
        if (arg0 == -1 || !class518.method3081(-125, arg0)) {
            return;
        }
        class188[] var1 = class123.field1803[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class188 var3 = var1[var2];
            if (var3.field2706 != null) {
                class125 var4 = new class125();
                var4.field1830 = var3;
                var4.field1833 = var3.field2706;
                method401(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(IZ)V", line = 4579)
    private static final void method413(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field468[field476++] = class445.field6585;
                return;
            }
            if (arg0 == 5001) {
                field476 -= 3;
                class445.field6585 = field468[field476];
                class110.field1553 = class336.method2053(0, field468[field476 + 1]);
                if (class110.field1553 == null) {
                    class110.field1553 = class490.field7194;
                }
                class81.field1100 = field468[field476 + 2];
                field462++;
                class32.method258(-101, class155.field2204);
                class472.field6970.method638(255, class445.field6585);
                class472.field6970.method638(255, class110.field1553.field6117);
                class472.field6970.method638(255, class81.field1100);
                return;
            }
            if (arg0 == 5002) {
                field472 -= 2;
                String var2 = field471[field472];
                String var3 = field471[field472 + 1];
                field476 -= 2;
                int var4 = field468[field476];
                int var5 = field468[field476 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field467++;
                class32.method258(-114, class524.field7701);
                class472.field6970.method638(255, class494.method2962(var2, (byte) -92) + class494.method2962(var3, (byte) -128) + 2);
                class472.field6970.method605(91, var2);
                class472.field6970.method638(255, var4 - 1);
                class472.field6970.method638(255, var5);
                class472.field6970.method605(125, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field468[--field476];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class20.field224[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field471[field472++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field468[--field476];
                int var9 = -1;
                if (var8 < 100 && class20.field224[var8] != null) {
                    var9 = class58.field673[var8];
                }
                field468[field476++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class110.field1553 == null) {
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = class110.field1553.field6117;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field471[--field472];
                method406(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field472 -= 2;
                String var11 = field471[field472];
                String var12 = field471[field472 + 1];
                if (class365.field5273 != 0 || (!class388.field5741 || class53.field582) && !class411.field6107) {
                    field470++;
                    class32.method258(-70, class268.field3953);
                    class472.field6970.method638(255, 0);
                    int var13 = class472.field6970.field827;
                    class472.field6970.method605(85, var11);
                    class131.method1006(var12, 0, class472.field6970);
                    class472.field6970.method632(-1591647264, class472.field6970.field827 - var13);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field468[--field476];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class128.field1855[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field471[field472++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field468[--field476];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class87.field1184[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field471[field472++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field468[--field476];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class344.field4774[var18];
                }
                field468[field476++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class435.field6375 == null || class435.field6375.field5057 == null) {
                    var20 = class336.field4677;
                } else {
                    var20 = class435.field6375.method2174(120, true);
                }
                field471[field472++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field468[field476++] = class81.field1100;
                return;
            }
            if (arg0 == 5017) {
                field468[field476++] = class311.field4438;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field468[--field476];
                int var22 = 0;
                if (var21 < 100 && class20.field224[var21] != null) {
                    var22 = class58.field673[var21];
                }
                field468[field476++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field468[--field476];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class225.field3301[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field471[field472++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class435.field6375 == null || class435.field6375.field5057 == null) {
                    var25 = class336.field4677;
                } else {
                    var25 = class435.field6375.method2178(false, 1);
                }
                field471[field472++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field468[--field476];
                field471[field472++] = class311.field4442.method2104(var26, (byte) 96).field4703;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field468[--field476];
                class339 var28 = class311.field4442.method2104(var27, (byte) -114);
                if (var28.field4708 == null) {
                    field468[field476++] = 0;
                    return;
                }
                field468[field476++] = var28.field4708.length;
                return;
            }
            if (arg0 == 5052) {
                field476 -= 2;
                int var29 = field468[field476];
                int var30 = field468[field476 + 1];
                class339 var31 = class311.field4442.method2104(var29, (byte) 107);
                int var32 = var31.field4708[var30];
                field468[field476++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field468[--field476];
                class339 var34 = class311.field4442.method2104(var33, (byte) -98);
                if (var34.field4694 == null) {
                    field468[field476++] = 0;
                    return;
                }
                field468[field476++] = var34.field4694.length;
                return;
            }
            if (arg0 == 5054) {
                field476 -= 2;
                int var35 = field468[field476];
                int var36 = field468[field476 + 1];
                field468[field476++] = class311.field4442.method2104(var35, (byte) 113).field4694[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field468[--field476];
                field471[field472++] = class95.field1280.method2335(var37, (byte) -99).method3064(0);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field468[--field476];
                class516 var39 = class95.field1280.method2335(var38, (byte) -99);
                if (var39.field7589 == null) {
                    field468[field476++] = 0;
                    return;
                }
                field468[field476++] = var39.field7589.length;
                return;
            }
            if (arg0 == 5057) {
                field476 -= 2;
                int var40 = field468[field476];
                int var41 = field468[field476 + 1];
                field468[field476++] = class95.field1280.method2335(var40, (byte) -99).field7589[var41];
                return;
            }
            if (arg0 == 5058) {
                field466 = new class321();
                field466.field4522 = field468[--field476];
                field466.field4523 = class95.field1280.method2335(field466.field4522, (byte) -99);
                field466.field4525 = new int[field466.field4523.method3068(0)];
                return;
            }
            if (arg0 == 5059) {
                field461++;
                class32.method258(-69, class172.field2442);
                class472.field6970.method638(255, 0);
                int var42 = class472.field6970.field827;
                class472.field6970.method638(255, 0);
                class472.field6970.method611((byte) 67, field466.field4522);
                field466.field4523.method3066((byte) 50, field466.field4525, class472.field6970);
                class472.field6970.method632(-1591647264, class472.field6970.field827 - var42);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field471[--field472];
                field474++;
                class32.method258(-65, class365.field5216);
                class472.field6970.method638(255, 0);
                int var44 = class472.field6970.field827;
                class472.field6970.method605(69, var43);
                class472.field6970.method611((byte) 67, field466.field4522);
                field466.field4523.method3066((byte) 27, field466.field4525, class472.field6970);
                class472.field6970.method632(-1591647264, class472.field6970.field827 - var44);
                return;
            }
            if (arg0 == 5061) {
                field461++;
                class32.method258(-123, class172.field2442);
                class472.field6970.method638(255, 0);
                int var45 = class472.field6970.field827;
                class472.field6970.method638(255, 1);
                class472.field6970.method611((byte) 67, field466.field4522);
                field466.field4523.method3066((byte) 39, field466.field4525, class472.field6970);
                class472.field6970.method632(-1591647264, class472.field6970.field827 - var45);
                return;
            }
            if (arg0 == 5062) {
                field476 -= 2;
                int var46 = field468[field476];
                int var47 = field468[field476 + 1];
                field468[field476++] = class311.field4442.method2104(var46, (byte) 79).field4698[var47];
                return;
            }
            if (arg0 == 5063) {
                field476 -= 2;
                int var48 = field468[field476];
                int var49 = field468[field476 + 1];
                field468[field476++] = class311.field4442.method2104(var48, (byte) 81).field4706[var49];
                return;
            }
            if (arg0 == 5064) {
                field476 -= 2;
                int var50 = field468[field476];
                int var51 = field468[field476 + 1];
                if (var51 == -1) {
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = class311.field4442.method2104(var50, (byte) -59).method2060((char) var51, (byte) -112);
                return;
            }
            if (arg0 == 5065) {
                field476 -= 2;
                int var52 = field468[field476];
                int var53 = field468[field476 + 1];
                if (var53 == -1) {
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = class311.field4442.method2104(var52, (byte) 119).method2058((char) var53, (byte) -88);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field468[--field476];
                field468[field476++] = class95.field1280.method2335(var54, (byte) -99).method3068(0);
                return;
            }
            if (arg0 == 5067) {
                field476 -= 2;
                int var55 = field468[field476];
                int var56 = field468[field476 + 1];
                int var57 = class95.field1280.method2335(var55, (byte) -99).method3061(var56, 30).field1430;
                field468[field476++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field476 -= 2;
                int var58 = field468[field476];
                int var59 = field468[field476 + 1];
                field466.field4525[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field476 -= 2;
                int var60 = field468[field476];
                int var61 = field468[field476 + 1];
                field466.field4525[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field476 -= 3;
                int var62 = field468[field476];
                int var63 = field468[field476 + 1];
                int var64 = field468[field476 + 2];
                class516 var65 = class95.field1280.method2335(var62, (byte) -99);
                if (var65.method3061(var63, 42).field1430 != 0) {
                    throw new RuntimeException("bad command");
                }
                field468[field476++] = var65.method3062(var64, false, var63);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field471[--field472];
                boolean var67 = field468[--field476] == 1;
                class513.method3053(var67, 32768, var66);
                field468[field476++] = class402.field5967;
                return;
            }
            if (arg0 == 5072) {
                if (class503.field7464 != null && class206.field2996 < class402.field5967) {
                    field468[field476++] = class503.field7464[class206.field2996++] & 0xFFFF;
                    return;
                }
                field468[field476++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class206.field2996 = 0;
                return;
            }
            if (arg0 == 5074) {
                field461++;
                class32.method258(-104, class172.field2442);
                class472.field6970.method638(255, 0);
                int var68 = class472.field6970.field827;
                class472.field6970.method638(255, 2);
                class472.field6970.method611((byte) 67, field466.field4522);
                field466.field4523.method3066((byte) 41, field466.field4525, class472.field6970);
                class472.field6970.method632(-1591647264, class472.field6970.field827 - var68);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class229.field3360.method796(-92, 86)) {
                    field468[field476++] = 1;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class229.field3360.method796(-89, 82)) {
                    field468[field476++] = 1;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class229.field3360.method796(-89, 81)) {
                    field468[field476++] = 1;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class268.method1724((byte) -126, field468[--field476]);
                return;
            }
            if (arg0 == 5201) {
                field468[field476++] = class353.method2131(true);
                return;
            }
            if (arg0 == 5205) {
                class527.method3124(-1, -1, -105, field468[--field476], false);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field468[--field476];
                class355 var70 = class399.method2441(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = var70.field4954;
                return;
            }
            if (arg0 == 5207) {
                class355 var71 = class399.method2458(field468[--field476]);
                if (var71 != null && var71.field4962 != null) {
                    field471[field472++] = var71.field4962;
                    return;
                }
                field471[field472++] = "";
                return;
            }
            if (arg0 == 5208) {
                field468[field476++] = class333.field4628;
                field468[field476++] = class229.field3361;
                return;
            }
            if (arg0 == 5209) {
                field468[field476++] = class63.field744 + class399.field5926;
                field468[field476++] = class512.field7555 + class399.field5910;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field468[--field476];
                class355 var73 = class399.method2458(var72);
                if (var73 == null) {
                    field468[field476++] = 0;
                    field468[field476++] = 0;
                    return;
                }
                field468[field476++] = var73.field4968 >> 14 & 0x3FFF;
                field468[field476++] = var73.field4968 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field468[--field476];
                class355 var75 = class399.method2458(var74);
                if (var75 == null) {
                    field468[field476++] = 0;
                    field468[field476++] = 0;
                    return;
                }
                field468[field476++] = var75.field4956 - var75.field4951;
                field468[field476++] = var75.field4963 - var75.field4960;
                return;
            }
            if (arg0 == 5212) {
                class111 var76 = class113.method915(true);
                if (var76 == null) {
                    field468[field476++] = -1;
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = var76.field1567;
                int var77 = var76.field1571 << 28 | class399.field5926 + var76.field1566 << 14 | class399.field5910 + var76.field1560;
                field468[field476++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class111 var78 = class432.method2624(-2);
                if (var78 == null) {
                    field468[field476++] = -1;
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = var78.field1567;
                int var79 = var78.field1571 << 28 | class399.field5926 + var78.field1566 << 14 | class399.field5910 + var78.field1560;
                field468[field476++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field468[--field476];
                class355 var81 = class84.method753((byte) -83);
                if (var81 != null) {
                    boolean var82 = var81.method2146(false, field486, var80 >> 28 & 0x3, var80 & 0x3FFF, var80 >> 14 & 0x3FFF);
                    if (var82) {
                        class256.method1644(field486[2], (byte) 109, field486[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field476 -= 2;
                int var83 = field468[field476];
                int var84 = field468[field476 + 1];
                class59 var85 = class399.method2453(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class355 var87 = (class355) var85.method537((byte) 87); var87 != null; var87 = (class355) var85.method540(true)) {
                    if (var87.field4954 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field468[field476++] = 1;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field468[--field476];
                class355 var89 = class399.method2458(var88);
                if (var89 == null) {
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = var89.field4958;
                return;
            }
            if (arg0 == 5220) {
                field468[field476++] = class228.field3318 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field468[--field476];
                class256.method1644(var90 & 0x3FFF, (byte) 93, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class355 var91 = class84.method753((byte) -83);
                if (var91 != null) {
                    boolean var92 = var91.method2141(class63.field744 + class399.field5926, field486, (byte) 111, class512.field7555 + class399.field5910);
                    if (var92) {
                        field468[field476++] = field486[1];
                        field468[field476++] = field486[2];
                        return;
                    }
                    field468[field476++] = -1;
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = -1;
                field468[field476++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field476 -= 2;
                int var93 = field468[field476];
                int var94 = field468[field476 + 1];
                class527.method3124(var94 >> 14 & 0x3FFF, var94 & 0x3FFF, -105, var93, false);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field468[--field476];
                class355 var96 = class84.method753((byte) -83);
                if (var96 != null) {
                    boolean var97 = var96.method2146(false, field486, var95 >> 28 & 0x3, var95 & 0x3FFF, var95 >> 14 & 0x3FFF);
                    if (var97) {
                        field468[field476++] = field486[1];
                        field468[field476++] = field486[2];
                        return;
                    }
                    field468[field476++] = -1;
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = -1;
                field468[field476++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field468[--field476];
                class355 var99 = class84.method753((byte) -83);
                if (var99 != null) {
                    boolean var100 = var99.method2141(var98 >> 14 & 0x3FFF, field486, (byte) 111, var98 & 0x3FFF);
                    if (var100) {
                        field468[field476++] = field486[1];
                        field468[field476++] = field486[2];
                        return;
                    }
                    field468[field476++] = -1;
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = -1;
                field468[field476++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class171.method1217(false, field468[--field476]);
                return;
            }
            if (arg0 == 5227) {
                field476 -= 2;
                int var101 = field468[field476];
                int var102 = field468[field476 + 1];
                class527.method3124(var102 >> 14 & 0x3FFF, var102 & 0x3FFF, -109, var101, true);
                return;
            }
            if (arg0 == 5228) {
                class513.field7561 = field468[--field476] == 1;
                return;
            }
            if (arg0 == 5229) {
                field468[field476++] = class513.field7561 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field468[--field476];
                class34.method270(120, var103);
                return;
            }
            if (arg0 == 5231) {
                field476 -= 2;
                int var104 = field468[field476];
                boolean var105 = field468[field476 + 1] == 1;
                if (class205.field2990 != null) {
                    class223 var106 = class205.field2990.method875((long) var104, 125);
                    if (var106 != null && !var105) {
                        var106.method1525((byte) 100);
                        return;
                    }
                    if (var106 == null && var105) {
                        class223 var107 = new class223();
                        class205.field2990.method878((long) var104, -2301, var107);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field468[--field476];
                if (class205.field2990 != null) {
                    class223 var109 = class205.field2990.method875((long) var108, 123);
                    field468[field476++] = var109 == null ? 0 : 1;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field476 -= 2;
                int var110 = field468[field476];
                boolean var111 = field468[field476 + 1] == 1;
                if (class57.field665 != null) {
                    class223 var112 = class57.field665.method875((long) var110, 126);
                    if (var112 != null && !var111) {
                        var112.method1525((byte) -79);
                        return;
                    }
                    if (var112 == null && var111) {
                        class223 var113 = new class223();
                        class57.field665.method878((long) var110, -2301, var113);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field468[--field476];
                if (class57.field665 != null) {
                    class223 var115 = class57.field665.method875((long) var114, 127);
                    field468[field476++] = var115 == null ? 0 : 1;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field468[field476++] = class399.field5889 == null ? -1 : class399.field5889.field4954;
                return;
            }
            if (arg0 == 5236) {
                field476 -= 2;
                int var116 = field468[field476];
                int var117 = field468[field476 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class8.method54(var118, (byte) 124, var119, var116);
                if (var120 < 0) {
                    field468[field476++] = -1;
                    return;
                }
                field468[field476++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field476 -= 2;
                int var121 = field468[field476];
                int var122 = field468[field476 + 1];
                class76.method711(3, var122, var121, false, false);
                field468[field476++] = class149.field2112 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class149.field2112 != null) {
                    class76.method711(class478.field7044.field3347, -1, -1, false, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class491[] var123 = class379.method2321(true);
                field468[field476++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field468[--field476];
                class491[] var125 = class379.method2321(true);
                field468[field476++] = var125[var124].field7197;
                field468[field476++] = var125[var124].field7198;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class478.field7044.field3324;
                int var127 = class478.field7044.field3351;
                int var128 = -1;
                class491[] var129 = class379.method2321(true);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class491 var131 = var129[var130];
                    if (var131.field7197 == var126 && var131.field7198 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field468[field476++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field468[field476++] = class114.method920((byte) -123);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field468[--field476];
                if (var132 >= 1 && var132 <= 2) {
                    class76.method711(var132, -1, -1, false, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field468[field476++] = class478.field7044.field3347;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field468[--field476];
                if (var133 >= 1 && var133 <= 2) {
                    class478.field7044.field3347 = var133;
                    class478.field7044.method2067(class498.field7404, (byte) 34);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field472 -= 2;
                String var134 = field471[field472];
                String var135 = field471[field472 + 1];
                int var136 = field468[--field476];
                field481++;
                class32.method258(-101, class453.field6665);
                class472.field6970.method638(255, class494.method2962(var134, (byte) -116) + class494.method2962(var135, (byte) -95) + 1);
                class472.field6970.method605(55, var134);
                class472.field6970.method605(119, var135);
                class472.field6970.method638(255, var136);
                return;
            }
            if (arg0 == 5401) {
                field476 -= 2;
                class350.field4850[field468[field476]] = (short) class501.method2999(0, field468[field476 + 1]);
                class270.field3995.method13((byte) -125);
                class270.field3995.method4((byte) 65);
                class515.field7587.method1209(3);
                class448.method2716(-11712);
                return;
            }
            if (arg0 == 5405) {
                field476 -= 2;
                int var137 = field468[field476];
                int var138 = field468[field476 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class408.field6081[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field476 -= 7;
                int var139 = field468[field476];
                int var140 = field468[field476 + 1] << 1;
                int var141 = field468[field476 + 2];
                int var142 = field468[field476 + 3];
                int var143 = field468[field476 + 4];
                int var144 = field468[field476 + 5];
                int var145 = field468[field476 + 6];
                if (var139 >= 0 && var139 < 2 && class408.field6081[var139] != null && var140 >= 0 && var140 < class408.field6081[var139].length) {
                    class408.field6081[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class408.field6081[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class408.field6081[field468[--field476]].length >> 1;
                field468[field476++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class149.field2112 != null) {
                    class76.method711(class478.field7044.field3347, -1, -1, false, false);
                }
                if (class245.field3611 != null) {
                    class393.method2406(-22125);
                    System.exit(0);
                    return;
                }
                String var147 = class386.field5680 == null ? class450.method2724(256) : class386.field5680;
                class287.method1823(class498.field7404, var147, class65.field802 == 1, false, 121);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class108.field1542 != null) {
                    if (class108.field1542.field6613 == null) {
                        var148 = class148.method1069(class108.field1542.field6615, (byte) -71);
                    } else {
                        var148 = (String) class108.field1542.field6613;
                    }
                }
                field471[field472++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field468[field476++] = class419.field6188 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class149.field2112 != null) {
                    class76.method711(class478.field7044.field3347, -1, -1, false, false);
                }
                String var149 = field471[--field472];
                boolean var150 = field468[--field476] == 1;
                String var151 = class450.method2724(256) + var149;
                class287.method1823(class498.field7404, var151, class65.field802 == 1, var150, -54);
                return;
            }
            if (arg0 == 5422) {
                field472 -= 2;
                String var152 = field471[field472];
                String var153 = field471[field472 + 1];
                int var154 = field468[--field476];
                if (var152.length() > 0) {
                    if (class89.field1211 == null) {
                        class89.field1211 = new String[class37.field420[class61.field703.field6591]];
                    }
                    class89.field1211[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class216.field3125 == null) {
                        class216.field3125 = new String[class37.field420[class61.field703.field6591]];
                    }
                    class216.field3125[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field471[--field472]);
                return;
            }
            if (arg0 == 5424) {
                field476 -= 11;
                class11.field130 = field468[field476];
                class296.field4248 = field468[field476 + 1];
                class102.field1434 = field468[field476 + 2];
                class493.field7217 = field468[field476 + 3];
                class485.field7134 = field468[field476 + 4];
                class346.field4819 = field468[field476 + 5];
                class339.field4707 = field468[field476 + 6];
                class484.field7120 = field468[field476 + 7];
                class270.field3994 = field468[field476 + 8];
                class462.field6803 = field468[field476 + 9];
                class258.field3806 = field468[field476 + 10];
                class240.field3533.method2384(-1, class485.field7134);
                class240.field3533.method2384(-1, class346.field4819);
                class240.field3533.method2384(-1, class339.field4707);
                class240.field3533.method2384(-1, class484.field7120);
                class240.field3533.method2384(-1, class270.field3994);
                class253.field3737 = null;
                class441.field6545 = null;
                class250.field3681 = null;
                class473.field6977 = null;
                class124.field1818 = null;
                class516.field7597 = null;
                class467.field6906 = null;
                class448.field6607 = null;
                class473.field6974 = true;
                return;
            }
            if (arg0 == 5425) {
                class40.method400((byte) 115);
                class473.field6974 = false;
                return;
            }
            if (arg0 == 5426) {
                field476 -= 2;
                class74.field1011 = field468[field476];
                class396.field5816 = field468[field476 + 1];
                return;
            }
            if (arg0 == 5427) {
                field476 -= 2;
                class170.field2413 = field468[field476 + 1];
                return;
            }
            if (arg0 == 5428) {
                field476 -= 2;
                int var155 = field468[field476];
                int var156 = field468[field476 + 1];
                field468[field476++] = class301.method1891(var155, -125, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class155.method1100(field471[--field472], false, 3);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class505.method3017(class498.field7404.field6180, "accountcreated", 127);
                    return;
                } catch (Throwable var267) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field476 -= 4;
                int var157 = field468[field476];
                int var158 = field468[field476 + 1];
                int var159 = field468[field476 + 2];
                int var160 = field468[field476 + 3];
                class463.method2778(var158, false, var160, (var157 & 0x3FFF) - class476.field7013, true, (var157 >> 14 & 0x3FFF) - class340.field4713, var159);
                return;
            }
            if (arg0 == 5501) {
                field476 -= 4;
                int var161 = field468[field476];
                int var162 = field468[field476 + 1];
                int var163 = field468[field476 + 2];
                int var164 = field468[field476 + 3];
                class310.method1931(var164, var162, (var161 & 0x3FFF) - class476.field7013, var163, -8, (var161 >> 14 & 0x3FFF) - class340.field4713);
                return;
            }
            if (arg0 == 5502) {
                field476 -= 6;
                int var165 = field468[field476];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class509.field7505 = var165;
                int var166 = field468[field476 + 1];
                if (var166 + 1 >= class408.field6081[class509.field7505].length >> 1) {
                    throw new RuntimeException();
                }
                class486.field7140 = var166;
                class75.field1026 = 0;
                class496.field7279 = field468[field476 + 2];
                class241.field3570 = field468[field476 + 3];
                int var167 = field468[field476 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class408.field6072 = var167;
                int var168 = field468[field476 + 5];
                if (var168 + 1 >= class408.field6081[class408.field6072].length >> 1) {
                    throw new RuntimeException();
                }
                class429.field6320 = var168;
                class462.field6802 = 3;
                return;
            }
            if (arg0 == 5503) {
                class510.method3035(-18006);
                return;
            }
            if (arg0 == 5504) {
                field476 -= 2;
                class344.method2081(field468[field476], (byte) -125, field468[field476 + 1], 0);
                return;
            }
            if (arg0 == 5505) {
                field468[field476++] = (int) class386.field5687 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field468[field476++] = (int) class328.field4588 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class245.method1608(-123);
                return;
            }
            if (arg0 == 5508) {
                class154.method1094(-107);
                return;
            }
            if (arg0 == 5509) {
                class283.method1805(-22855);
                return;
            }
            if (arg0 == 5510) {
                class268.method1725((byte) -127);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field468[--field476];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class340.field4713;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class397.field5828) {
                    var172 = class397.field5828;
                }
                int var173 = var171 - class476.field7013;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class457.field6713) {
                    var173 = class457.field6713;
                }
                class204.field2966 = (var172 << 7) + 64;
                class203.field2949 = (var173 << 7) + 64;
                class462.field6802 = 4;
                return;
            }
            if (arg0 == 5512) {
                class487.method2925(true);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field472 -= 2;
                String var174 = field471[field472];
                String var175 = field471[field472 + 1];
                int var176 = field468[--field476];
                if (class113.field1589 != 10) {
                    return;
                }
                if (class171.field2439 == 0 && class172.field2444 == 0 && class72.field989 == 0 && class323.field4550 == 0) {
                    class95.method827(6745, var174, var176, var175);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class133.method1024(true);
                return;
            }
            if (arg0 == 5602) {
                if (class172.field2444 == 0) {
                    class428.field6307 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field476 -= 4;
                if (class113.field1589 != 10) {
                    return;
                }
                if (class171.field2439 == 0 && class172.field2444 == 0 && class72.field989 == 0 && class323.field4550 == 0) {
                    class265.method1709(field468[field476 + 1], field468[field476], field468[field476 + 2], 4, field468[field476 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field472--;
                if (class113.field1589 != 10) {
                    return;
                }
                if (class171.field2439 == 0 && class172.field2444 == 0 && class72.field989 == 0 && class323.field4550 == 0) {
                    class517.method3074(class141.method1055(1, field471[field472]), (byte) 119);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field472 -= 3;
                field476 -= 7;
                if (class113.field1589 != 10) {
                    return;
                }
                if (class171.field2439 == 0 && class172.field2444 == 0 && class72.field989 == 0 && class323.field4550 == 0) {
                    class182.method1288(2, field468[field476 + 1], field468[field476 + 5] == 1, field471[field472 + 1], field468[field476 + 6] == 1, field468[field476 + 4] == 1, field468[field476 + 2], field468[field476 + 3], class141.method1055(1, field471[field472]), field471[field472 + 2], field468[field476]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class72.field989 == 0) {
                    class247.field3669 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field468[field476++] = class428.field6307;
                return;
            }
            if (arg0 == 5608) {
                field468[field476++] = class455.field6701;
                return;
            }
            if (arg0 == 5609) {
                field468[field476++] = class247.field3669;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field471[field472++] = class498.field7402.length > var177 ? class281.method1800(true, class498.field7402[var177]) : "";
                }
                class498.field7402 = null;
                return;
            }
            if (arg0 == 5611) {
                field468[field476++] = class473.field6982;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field468[--field476];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class478.field7044.field3330 = var178;
                class121.method956(true);
                class478.field7044.method2067(class498.field7404, (byte) 99);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6002) {
                class478.field7044.method2070(-2, field468[--field476] == 1);
                class121.method956(true);
                class524.method3110(0);
                class478.field7044.method2067(class498.field7404, (byte) -107);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6003) {
                class478.field7044.field3355 = field468[--field476] == 1;
                class524.method3110(0);
                class478.field7044.method2067(class498.field7404, (byte) 78);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6005) {
                class478.field7044.field3354 = field468[--field476] == 1;
                class121.method956(true);
                class478.field7044.method2067(class498.field7404, (byte) -108);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6006) {
                class478.field7044.field3333 = field468[--field476] == 1;
                class225.field3300.method290(!class478.field7044.field3333);
                class478.field7044.method2067(class498.field7404, (byte) -120);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6007) {
                class478.field7044.field3327 = field468[--field476];
                class478.field7044.method2067(class498.field7404, (byte) 89);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6008) {
                class478.field7044.field3323 = field468[--field476] == 1;
                class478.field7044.method2067(class498.field7404, (byte) 110);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6009) {
                class478.field7044.field3320 = field468[--field476] == 1;
                class121.method956(true);
                class478.field7044.method2067(class498.field7404, (byte) 106);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6010) {
                class478.field7044.field3348 = field468[--field476] == 1;
                class478.field7044.method2067(class498.field7404, (byte) 125);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field468[--field476];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class478.field7044.method1538(class65.field802, -4, var179);
                class121.method956(true);
                class478.field7044.method2067(class498.field7404, (byte) -128);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6012) {
                class478.field7044.method1541(field468[--field476] == 1, -115, class65.field802);
                class4.method36(-7);
                class284.method1815((byte) -36);
                class478.field7044.method2067(class498.field7404, (byte) 39);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6014) {
                class478.field7044.field3321 = field468[--field476] == 1;
                class121.method956(true);
                class478.field7044.method2067(class498.field7404, (byte) 71);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6015) {
                class478.field7044.field3339 = field468[--field476] == 1;
                class121.method956(true);
                class478.field7044.method2067(class498.field7404, (byte) -126);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field468[--field476];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class478.field7044.field3335 = var180;
                class88.method780(class65.field802, (byte) 56);
                class478.field7044.method2067(class498.field7404, (byte) -99);
                return;
            }
            if (arg0 == 6017) {
                class478.field7044.field3317 = field468[--field476] == 1;
                class7.method51(false);
                class478.field7044.method2067(class498.field7404, (byte) 108);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field468[--field476];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class478.field7044.field3349 = var181;
                class478.field7044.method2067(class498.field7404, (byte) 103);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field468[--field476];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class478.field7044.field3334 != var182) {
                    if (class478.field7044.field3334 == 0 && class398.field5850 != -1) {
                        class458.method2755(var182, class398.field5850, 0, class512.field7556, -15727, false);
                        class195.field2843 = false;
                    } else if (var182 == 0) {
                        class9.method62((byte) -19);
                        class195.field2843 = false;
                    } else {
                        class372.method2294(var182, 101);
                    }
                    class478.field7044.field3334 = var182;
                }
                class478.field7044.method2067(class498.field7404, (byte) 100);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field468[--field476];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class478.field7044.field3350 = var183;
                class478.field7044.method2067(class498.field7404, (byte) 121);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6021) {
                class478.field7044.field4721 = field468[--field476] == 1;
                class524.method3110(0);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field468[--field476];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class352.field4882 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class86.method766(var184, 9060);
                class478.field7044.method2067(class498.field7404, (byte) 106);
                class247.field3663 = false;
                field468[field476++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field468[--field476];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class478.field7044.field3337 = var186;
                class478.field7044.method2067(class498.field7404, (byte) 23);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field468[--field476];
                if (var187 < 0 || var187 > client.method1378(class352.field4882, (byte) -98)) {
                    var187 = 0;
                }
                class478.field7044.field3328 = var187;
                class478.field7044.method2067(class498.field7404, (byte) 77);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field468[--field476];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class128.method994(-14734, var188 == 1);
                return;
            }
            if (arg0 == 6028) {
                class478.field7044.field3353 = field468[--field476] != 0;
                class478.field7044.method2067(class498.field7404, (byte) -98);
                return;
            }
            if (arg0 == 6029) {
                class478.field7044.field3327 = field468[--field476];
                class478.field7044.method2067(class498.field7404, (byte) -116);
                return;
            }
            if (arg0 == 6030) {
                class478.field7044.field3314 = field468[--field476] != 0;
                class478.field7044.method2067(class498.field7404, (byte) -106);
                class121.method956(true);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field468[--field476];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class88.method780(var189, (byte) 58);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field468[--field476];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class478.field7044.field3345 = var190;
                class478.field7044.method2067(class498.field7404, (byte) -127);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field468[--field476];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class478.field7044.field3331 = var191;
                class478.field7044.method2067(class498.field7404, (byte) 39);
                return;
            }
            if (arg0 == 6034) {
                class478.field7044.field3356 = field468[--field476] == 1;
                class478.field7044.method2067(class498.field7404, (byte) 109);
                class4.method36(-7);
                class247.field3663 = false;
                return;
            }
            if (arg0 == 6035) {
                class478.field7044.field4714 = field468[--field476] == 1;
                class121.method956(true);
                class524.method3110(0);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field468[field476++] = class478.field7044.field3330;
                return;
            }
            if (arg0 == 6102) {
                field468[field476++] = class478.field7044.method2068(-117, class65.field802) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field468[field476++] = class478.field7044.field3355 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field468[field476++] = class478.field7044.field3354 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field468[field476++] = class478.field7044.field3333 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field468[field476++] = class478.field7044.field3327;
                return;
            }
            if (arg0 == 6108) {
                field468[field476++] = class478.field7044.field3323 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field468[field476++] = class478.field7044.field3320 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field468[field476++] = class478.field7044.field3348 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field468[field476++] = class478.field7044.method1536(class65.field802, (byte) -28);
                return;
            }
            if (arg0 == 6112) {
                field468[field476++] = class478.field7044.method1540(29083, class65.field802) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field468[field476++] = class478.field7044.field3321 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field468[field476++] = class478.field7044.field3339 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field468[field476++] = class478.field7044.field3335;
                return;
            }
            if (arg0 == 6117) {
                field468[field476++] = class478.field7044.field3317 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field468[field476++] = class478.field7044.field3349;
                return;
            }
            if (arg0 == 6119) {
                field468[field476++] = class478.field7044.field3334;
                return;
            }
            if (arg0 == 6120) {
                field468[field476++] = class478.field7044.field3350;
                return;
            }
            if (arg0 == 6121) {
                field468[field476++] = class225.field3300.method321() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field468[field476++] = class176.method1234(8458);
                return;
            }
            if (arg0 == 6124) {
                field468[field476++] = class478.field7044.field3337;
                return;
            }
            if (arg0 == 6125) {
                field468[field476++] = class478.field7044.field3328;
                return;
            }
            if (arg0 == 6126) {
                field468[field476++] = class225.field3300.method312() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field468[field476++] = class478.field7044.field3343 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field468[field476++] = class478.field7044.field3353 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field468[field476++] = class478.field7044.field3327;
                return;
            }
            if (arg0 == 6130) {
                field468[field476++] = class478.field7044.field3314 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field468[field476++] = class65.field802;
                return;
            }
            if (arg0 == 6132) {
                field468[field476++] = class478.field7044.field3345;
                return;
            }
            if (arg0 == 6133) {
                field468[field476++] = class419.field6188 == 1 || class419.field6188 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field468[field476++] = client.method1378(class352.field4882, (byte) -48);
                return;
            }
            if (arg0 == 6135) {
                field468[field476++] = class478.field7044.field3331;
                return;
            }
            if (arg0 == 6136) {
                field468[field476++] = class478.field7044.field3356 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var192 = true;
                try {
                    var192 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var268) {
                }
                field468[field476++] = var192 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field476 -= 2;
                class464.field6827 = (short) field468[field476];
                if (class464.field6827 <= 0) {
                    class464.field6827 = 256;
                }
                class331.field4616 = (short) field468[field476 + 1];
                if (class331.field4616 <= 0) {
                    class331.field4616 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field476 -= 2;
                class445.field6588 = (short) field468[field476];
                if (class445.field6588 <= 0) {
                    class445.field6588 = 256;
                }
                class146.field2033 = (short) field468[field476 + 1];
                if (class146.field2033 <= 0) {
                    class146.field2033 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field476 -= 4;
                class440.field6539 = (short) field468[field476];
                if (class440.field6539 <= 0) {
                    class440.field6539 = 1;
                }
                class465.field6838 = (short) field468[field476 + 1];
                if (class465.field6838 <= 0) {
                    class465.field6838 = 32767;
                } else if (class465.field6838 < class440.field6539) {
                    class465.field6838 = class440.field6539;
                }
                class92.field1266 = (short) field468[field476 + 2];
                if (class92.field1266 <= 0) {
                    class92.field1266 = 1;
                }
                class180.field2540 = (short) field468[field476 + 3];
                if (class180.field2540 <= 0) {
                    class180.field2540 = 32767;
                    return;
                }
                if (class180.field2540 < class92.field1266) {
                    class180.field2540 = class92.field1266;
                }
                return;
            }
            if (arg0 == 6203) {
                class24.method201(0, class56.field658.field2711, (byte) -21, 0, false, class56.field658.field2672);
                field468[field476++] = class515.field7581;
                field468[field476++] = class4.field70;
                return;
            }
            if (arg0 == 6204) {
                field468[field476++] = class445.field6588;
                field468[field476++] = class146.field2033;
                return;
            }
            if (arg0 == 6205) {
                field468[field476++] = class464.field6827;
                field468[field476++] = class331.field4616;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field468[field476++] = (int) (class437.method2644(-60) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field468[field476++] = (int) (class437.method2644(-115) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field476 -= 3;
                int var193 = field468[field476];
                int var194 = field468[field476 + 1];
                int var195 = field468[field476 + 2];
                field478.clear();
                field478.set(11, 12);
                field478.set(var195, var194, var193);
                field468[field476++] = (int) (field478.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field478.clear();
                field478.setTime(new Date(class437.method2644(-127)));
                field468[field476++] = field478.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var196 = field468[--field476];
                boolean var197 = true;
                if (var196 < 0) {
                    var197 = (var196 + 1) % 4 == 0;
                } else if (var196 < 1582) {
                    var197 = var196 % 4 == 0;
                } else if (var196 % 4 != 0) {
                    var197 = false;
                } else if (var196 % 100 != 0) {
                    var197 = true;
                } else if (var196 % 400 != 0) {
                    var197 = false;
                }
                field468[field476++] = var197 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field468[field476++] = class155.method1101(89) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field468[field476++] = class410.method2514(8271) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class113.field1589 == 10 && class171.field2439 == 0 && class172.field2444 == 0 && class72.field989 == 0) {
                    field468[field476++] = class518.method3082(3) == -1 ? 0 : 1;
                    return;
                }
                field468[field476++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class166 var198 = class291.method1837(0);
                if (var198 != null) {
                    field468[field476++] = var198.field2350;
                    field468[field476++] = var198.field2009;
                    field471[field472++] = var198.field2351;
                    class232 var199 = var198.method1172(-14839);
                    field468[field476++] = var199.field3419;
                    field471[field472++] = var199.field3409;
                    field468[field476++] = var198.field2013;
                    field468[field476++] = var198.field2360;
                    return;
                }
                field468[field476++] = -1;
                field468[field476++] = 0;
                field471[field472++] = "";
                field468[field476++] = 0;
                field471[field472++] = "";
                field468[field476++] = 0;
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class166 var200 = class134.method1028(1405);
                if (var200 != null) {
                    field468[field476++] = var200.field2350;
                    field468[field476++] = var200.field2009;
                    field471[field472++] = var200.field2351;
                    class232 var201 = var200.method1172(-14839);
                    field468[field476++] = var201.field3419;
                    field471[field472++] = var201.field3409;
                    field468[field476++] = var200.field2013;
                    field468[field476++] = var200.field2360;
                    return;
                }
                field468[field476++] = -1;
                field468[field476++] = 0;
                field471[field472++] = "";
                field468[field476++] = 0;
                field471[field472++] = "";
                field468[field476++] = 0;
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var202 = field468[--field476];
                if (class113.field1589 == 10 && class171.field2439 == 0 && class172.field2444 == 0 && class72.field989 == 0) {
                    field468[field476++] = class6.method46(false, var202) ? 1 : 0;
                    return;
                }
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class478.field7044.field3316 = field468[--field476];
                class478.field7044.method2067(class498.field7404, (byte) -112);
                return;
            }
            if (arg0 == 6505) {
                field468[field476++] = class478.field7044.field3316;
                return;
            }
            if (arg0 == 6506) {
                int var203 = field468[--field476];
                class166 var204 = class498.method2990(var203, (byte) 112);
                if (var204 != null) {
                    field468[field476++] = var204.field2009;
                    field471[field472++] = var204.field2351;
                    class232 var205 = var204.method1172(-14839);
                    field468[field476++] = var205.field3419;
                    field471[field472++] = var205.field3409;
                    field468[field476++] = var204.field2013;
                    field468[field476++] = var204.field2360;
                    return;
                }
                field468[field476++] = -1;
                field471[field472++] = "";
                field468[field476++] = 0;
                field471[field472++] = "";
                field468[field476++] = 0;
                field468[field476++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field476 -= 4;
                int var206 = field468[field476];
                boolean var207 = field468[field476 + 1] == 1;
                int var208 = field468[field476 + 2];
                boolean var209 = field468[field476 + 3] == 1;
                class482.method2905(var206, var207, var208, var209, (byte) 90);
                return;
            }
            if (arg0 == 6508) {
                class424.method2597((byte) -77);
                return;
            }
            if (arg0 == 6509) {
                if (class113.field1589 != 10) {
                    return;
                }
                class232.field3415 = field468[--field476] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class478.field7044.field3352 = field468[--field476] == 1;
                class478.field7044.method2067(class498.field7404, (byte) 23);
                return;
            }
            if (arg0 == 6601) {
                field468[field476++] = class478.field7044.field3352 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class368.field5471 == class239.field3506) {
            if (arg0 == 6700) {
                int var210 = class49.field545.method873(-5);
                if (class64.field761 != -1) {
                    var210++;
                }
                field468[field476++] = var210;
                return;
            }
            if (arg0 == 6701) {
                int var211 = field468[--field476];
                if (class64.field761 != -1) {
                    if (var211 == 0) {
                        field468[field476++] = class64.field761;
                        return;
                    }
                    var211--;
                }
                class305 var212 = (class305) class49.field545.method880((byte) -23);
                while (var211-- > 0) {
                    var212 = (class305) class49.field545.method879((byte) -20);
                }
                field468[field476++] = var212.field4333;
                return;
            }
            if (arg0 == 6702) {
                int var213 = field468[--field476];
                if (class123.field1803[var213] == null) {
                    field471[field472++] = "";
                    return;
                }
                String var214 = class123.field1803[var213][0].field2660;
                if (var214 == null) {
                    field471[field472++] = "";
                    return;
                }
                field471[field472++] = var214.substring(0, var214.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var215 = field468[--field476];
                if (class123.field1803[var215] == null) {
                    field468[field476++] = 0;
                    return;
                }
                field468[field476++] = class123.field1803[var215].length;
                return;
            }
            if (arg0 == 6704) {
                field476 -= 2;
                int var216 = field468[field476];
                int var217 = field468[field476 + 1];
                if (class123.field1803[var216] == null) {
                    field471[field472++] = "";
                    return;
                }
                String var218 = class123.field1803[var216][var217].field2660;
                if (var218 == null) {
                    field471[field472++] = "";
                    return;
                }
                field471[field472++] = var218;
                return;
            }
            if (arg0 == 6705) {
                field476 -= 2;
                int var219 = field468[field476];
                int var220 = field468[field476 + 1];
                if (class123.field1803[var219] == null) {
                    field468[field476++] = 0;
                    return;
                }
                field468[field476++] = class123.field1803[var219][var220].field2692;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field476 -= 3;
                int var221 = field468[field476];
                int var222 = field468[field476 + 1];
                int var223 = field468[field476 + 2];
                class188.method1317(true, 1, "", var221 << 16 | var222, var223);
                return;
            }
            if (arg0 == 6708) {
                field476 -= 3;
                int var224 = field468[field476];
                int var225 = field468[field476 + 1];
                int var226 = field468[field476 + 2];
                class188.method1317(true, 2, "", var224 << 16 | var225, var226);
                return;
            }
            if (arg0 == 6709) {
                field476 -= 3;
                int var227 = field468[field476];
                int var228 = field468[field476 + 1];
                int var229 = field468[field476 + 2];
                class188.method1317(true, 3, "", var227 << 16 | var228, var229);
                return;
            }
            if (arg0 == 6710) {
                field476 -= 3;
                int var230 = field468[field476];
                int var231 = field468[field476 + 1];
                int var232 = field468[field476 + 2];
                class188.method1317(true, 4, "", var230 << 16 | var231, var232);
                return;
            }
            if (arg0 == 6711) {
                field476 -= 3;
                int var233 = field468[field476];
                int var234 = field468[field476 + 1];
                int var235 = field468[field476 + 2];
                class188.method1317(true, 5, "", var233 << 16 | var234, var235);
                return;
            }
            if (arg0 == 6712) {
                field476 -= 3;
                int var236 = field468[field476];
                int var237 = field468[field476 + 1];
                int var238 = field468[field476 + 2];
                class188.method1317(true, 6, "", var236 << 16 | var237, var238);
                return;
            }
            if (arg0 == 6713) {
                field476 -= 3;
                int var239 = field468[field476];
                int var240 = field468[field476 + 1];
                int var241 = field468[field476 + 2];
                class188.method1317(true, 7, "", var239 << 16 | var240, var241);
                return;
            }
            if (arg0 == 6714) {
                field476 -= 3;
                int var242 = field468[field476];
                int var243 = field468[field476 + 1];
                int var244 = field468[field476 + 2];
                class188.method1317(true, 8, "", var242 << 16 | var243, var244);
                return;
            }
            if (arg0 == 6715) {
                field476 -= 3;
                int var245 = field468[field476];
                int var246 = field468[field476 + 1];
                int var247 = field468[field476 + 2];
                class188.method1317(true, 9, "", var245 << 16 | var246, var247);
                return;
            }
            if (arg0 == 6716) {
                field476 -= 3;
                int var248 = field468[field476];
                int var249 = field468[field476 + 1];
                int var250 = field468[field476 + 2];
                class188.method1317(true, 10, "", var248 << 16 | var249, var250);
                return;
            }
            if (arg0 == 6717) {
                field476 -= 3;
                int var251 = field468[field476];
                int var252 = field468[field476 + 1];
                int var253 = field468[field476 + 2];
                class188 var254 = class274.method1766(var251 << 16 | var252, var253, (byte) 126);
                class235.method1568((byte) 102);
                class278 var255 = client.method1380(var254);
                class258.method1663(var255.field4077, var255.method1789(16693), var254, (byte) -38);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var256 = field468[--field476];
                class405 var257 = class175.field2483.method837(var256, (byte) -41);
                if (var257.field5991 == null) {
                    field471[field472++] = "";
                    return;
                }
                field471[field472++] = var257.field5991;
                return;
            }
            if (arg0 == 6801) {
                int var258 = field468[--field476];
                class405 var259 = class175.field2483.method837(var258, (byte) -41);
                field468[field476++] = var259.field6019;
                return;
            }
            if (arg0 == 6802) {
                int var260 = field468[--field476];
                class405 var261 = class175.field2483.method837(var260, (byte) -41);
                field468[field476++] = var261.field5987;
                return;
            }
            if (arg0 == 6803) {
                int var262 = field468[--field476];
                class405 var263 = class175.field2483.method837(var262, (byte) -41);
                field468[field476++] = var263.field6007;
                return;
            }
            if (arg0 == 6804) {
                field476 -= 2;
                int var264 = field468[field476];
                int var265 = field468[field476 + 1];
                class284 var266 = class215.field3100.method2740((byte) -118, var265);
                if (var266.method1810(115)) {
                    field471[field472++] = class175.field2483.method837(var264, (byte) -41).method2480(120, var266.field4122, var265);
                    return;
                }
                field468[field476++] = class175.field2483.method837(var264, (byte) -41).method2482(121, var266.field4127, var265);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lpn;II)V", line = 7572)
    public static final void method414(class523 arg0, int arg1, int arg2) {
        class164 var3 = class4.method23(11639, arg2, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field460 = new int[var3.field2322];
        field484 = new String[var3.field2324];
        if (class129.field1866 == var3.field2332 || class150.field2118 == var3.field2332 || class314.field4458 == var3.field2332) {
            int var4 = 0;
            int var5 = 0;
            if (class502.field7456 != null) {
                var4 = class502.field7456.field2718;
                var5 = class502.field7456.field2765;
            }
            field460[0] = class104.field1460.method1268((byte) 58) - var4;
            field460[1] = class104.field1460.method1280(3045) - var5;
        }
        method411(var3, 200000);
    }
}
