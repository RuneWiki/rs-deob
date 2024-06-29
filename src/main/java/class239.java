import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class239 {

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    private static int field3055 = 0;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "[[I")
    private static int[][] field3065 = new int[5][5000];

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    private static int field3070 = 0;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    private static int field3066 = 0;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "[Ljava/lang/String;")
    private static String[] field3068 = new String[1000];

    @OriginalMember(owner = "client!du", name = "k", descriptor = "[I")
    private static int[] field3061 = new int[1000];

    @OriginalMember(owner = "client!du", name = "a", descriptor = "[I")
    private static int[] field3051 = new int[5];

    @OriginalMember(owner = "client!du", name = "y", descriptor = "[Lbi;")
    private static class337[] field3075 = new class337[50];

    @OriginalMember(owner = "client!du", name = "m", descriptor = "Ljava/util/Calendar;")
    private static Calendar field3063 = Calendar.getInstance();

    @OriginalMember(owner = "client!du", name = "z", descriptor = "[I")
    private static int[] field3076 = new int[3];

    @OriginalMember(owner = "client!du", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field3078 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!du", name = "A", descriptor = "Ljk;")
    public static class449 field3077 = new class449(4);

    @OriginalMember(owner = "client!du", name = "C", descriptor = "I")
    private static int field3079 = 0;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "Lag;")
    private static class483 field3069;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Lhd;")
    private static class523 field3056;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Lhd;")
    private static class523 field3060;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "[I")
    private static int[] field3062;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field3072;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V", line = 4)
    private static final void method1434(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field3070 -= 3;
                int var2 = field3061[field3070];
                int var3 = field3061[field3070 + 1];
                int var4 = field3061[field3070 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class523 var5 = class310.method1810(var2, 1182823664);
                if (var5.field7717 == null) {
                    var5.field7717 = new class523[var4 + 1];
                }
                if (var5.field7717.length <= var4) {
                    class523[] var6 = new class523[var4 + 1];
                    for (int var7 = 0; var7 < var5.field7717.length; var7++) {
                        var6[var7] = var5.field7717[var7];
                    }
                    var5.field7717 = var6;
                }
                if (var4 > 0 && var5.field7717[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class523 var8 = new class523();
                var8.field7632 = var3;
                var8.field7673 = var8.field7723 = var5.field7723;
                var8.field7562 = var4;
                var5.field7717[var4] = var8;
                if (arg1) {
                    field3056 = var8;
                } else {
                    field3060 = var8;
                }
                class136.method935(var5, -126);
                return;
            }
            if (arg0 == 101) {
                class523 var9 = arg1 ? field3056 : field3060;
                if (var9.field7562 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class523 var10 = class310.method1810(var9.field7723, 1182823664);
                var10.field7717[var9.field7562] = null;
                class136.method935(var10, -124);
                return;
            }
            if (arg0 == 102) {
                class523 var11 = class310.method1810(field3061[--field3070], 1182823664);
                var11.field7717 = null;
                class136.method935(var11, -125);
                return;
            }
            if (arg0 == 200) {
                field3070 -= 2;
                int var12 = field3061[field3070];
                int var13 = field3061[field3070 + 1];
                class523 var14 = class202.method1268(var12, var13, 0);
                if (var14 != null && var13 != -1) {
                    field3061[field3070++] = 1;
                    if (arg1) {
                        field3056 = var14;
                        return;
                    }
                    field3060 = var14;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field3061[--field3070];
                class523 var16 = class310.method1810(var15, 1182823664);
                if (var16 != null) {
                    field3061[field3070++] = 1;
                    if (arg1) {
                        field3056 = var16;
                        return;
                    }
                    field3060 = var16;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field3061[--field3070];
                method1435(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field3061[--field3070];
                method1443(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field3070 -= 2;
                int var19 = field3061[field3070];
                int var20 = field3061[field3070 + 1];
                for (int var21 = 0; var21 < class289.field3692.length; var21++) {
                    if (class289.field3692[var21] == var19) {
                        class23.field336.field2823.method2614(var20, var21, class360.field4654, (byte) -111);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class334.field4208.length; var22++) {
                    if (class334.field4208[var22] == var19) {
                        class23.field336.field2823.method2614(var20, var22, class360.field4654, (byte) -110);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field3070 -= 2;
                int var23 = field3061[field3070];
                int var24 = field3061[field3070 + 1];
                class23.field336.field2823.method2612(var23, var24, 0);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field3061[--field3070] != 0;
                class23.field336.field2823.method2608(17866, var25);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class523 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class310.method1810(field3061[--field3070], 1182823664);
            } else {
                var26 = arg1 ? field3056 : field3060;
            }
            if (arg0 == 1000) {
                field3070 -= 4;
                var26.field7649 = field3061[field3070];
                var26.field7619 = field3061[field3070 + 1];
                int var27 = field3061[field3070 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field3061[field3070 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field7675 = (byte) var27;
                var26.field7670 = (byte) var28;
                class136.method935(var26, -127);
                class189.method1182(var26, 3);
                if (var26.field7562 == -1) {
                    class475.method2865(var26.field7723, true);
                }
                return;
            }
            if (arg0 == 1001) {
                field3070 -= 4;
                var26.field7604 = field3061[field3070];
                var26.field7664 = field3061[field3070 + 1];
                var26.field7622 = 0;
                var26.field7639 = 0;
                int var29 = field3061[field3070 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field3061[field3070 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field7702 = (byte) var29;
                var26.field7579 = (byte) var30;
                class136.method935(var26, -125);
                class189.method1182(var26, 3);
                if (var26.field7632 == 0) {
                    class319.method1881(var26, -115, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field3061[--field3070] == 1;
                if (var26.field7682 != var31) {
                    var26.field7682 = var31;
                    class136.method935(var26, -126);
                }
                if (var26.field7562 == -1) {
                    class162.method1042(121, var26.field7723);
                }
                return;
            }
            if (arg0 == 1004) {
                field3070 -= 2;
                var26.field7666 = field3061[field3070];
                var26.field7606 = field3061[field3070 + 1];
                class136.method935(var26, -125);
                class189.method1182(var26, 3);
                if (var26.field7632 == 0) {
                    class319.method1881(var26, -106, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field7711 = field3061[--field3070] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class523 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class310.method1810(field3061[--field3070], 1182823664);
            } else {
                var32 = arg1 ? field3056 : field3060;
            }
            if (arg0 == 1100) {
                field3070 -= 2;
                var32.field7636 = field3061[field3070];
                if (var32.field7636 > var32.field7644 - var32.field7617) {
                    var32.field7636 = var32.field7644 - var32.field7617;
                }
                if (var32.field7636 < 0) {
                    var32.field7636 = 0;
                }
                var32.field7659 = field3061[field3070 + 1];
                if (var32.field7659 > var32.field7585 - var32.field7574) {
                    var32.field7659 = var32.field7585 - var32.field7574;
                }
                if (var32.field7659 < 0) {
                    var32.field7659 = 0;
                }
                class136.method935(var32, -125);
                if (var32.field7562 == -1) {
                    class380.method2157(0, var32.field7723);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field7699 = field3061[--field3070];
                class136.method935(var32, -124);
                if (var32.field7562 == -1) {
                    class531.method3150(0, var32.field7723);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field7716 = field3061[--field3070] == 1;
                class136.method935(var32, -124);
                return;
            }
            if (arg0 == 1103) {
                var32.field7678 = field3061[--field3070];
                class136.method935(var32, -124);
                return;
            }
            if (arg0 == 1104) {
                var32.field7671 = field3061[--field3070];
                class136.method935(var32, -126);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field3061[--field3070];
                if (var32.field7647 != var33) {
                    var32.field7647 = var33;
                    class136.method935(var32, -127);
                }
                if (var32.field7562 == -1) {
                    class223.method1357(var32.field7723, 14);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field7597 = field3061[--field3070];
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1107) {
                var32.field7732 = field3061[--field3070] == 1;
                class136.method935(var32, -128);
                return;
            }
            if (arg0 == 1108) {
                var32.field7580 = 1;
                var32.field7689 = field3061[--field3070];
                class136.method935(var32, -127);
                if (var32.field7562 == -1) {
                    class100.method748((byte) -118, var32.field7723);
                }
                return;
            }
            if (arg0 == 1109) {
                field3070 -= 6;
                var32.field7603 = field3061[field3070];
                var32.field7688 = field3061[field3070 + 1];
                var32.field7620 = field3061[field3070 + 2];
                var32.field7586 = field3061[field3070 + 3];
                var32.field7690 = field3061[field3070 + 4];
                var32.field7674 = field3061[field3070 + 5];
                class136.method935(var32, -127);
                if (var32.field7562 == -1) {
                    class213.method1315(var32.field7723, (byte) 93);
                    class180.method1147(var32.field7723, 125);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field3061[--field3070];
                if (var32.field7703 != var34) {
                    var32.field7703 = var34;
                    var32.field7698 = 0;
                    var32.field7691 = 1;
                    var32.field7627 = 0;
                    class136.method935(var32, -125);
                }
                if (var32.field7562 == -1) {
                    class65.method579(5, var32.field7723);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field7608 = field3061[--field3070] == 1;
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field3068[--field3066];
                if (!var35.equals(var32.field7728)) {
                    var32.field7728 = var35;
                    class136.method935(var32, -124);
                }
                if (var32.field7562 == -1) {
                    class111.method812((byte) 65, var32.field7723);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field7694 = field3061[--field3070];
                class136.method935(var32, -127);
                if (var32.field7562 == -1) {
                    class405.method2394(var32.field7723, false);
                }
                return;
            }
            if (arg0 == 1114) {
                field3070 -= 3;
                var32.field7576 = field3061[field3070];
                var32.field7637 = field3061[field3070 + 1];
                var32.field7590 = field3061[field3070 + 2];
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1115) {
                var32.field7600 = field3061[--field3070] == 1;
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1116) {
                var32.field7616 = field3061[--field3070];
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1117) {
                var32.field7692 = field3061[--field3070];
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1118) {
                var32.field7625 = field3061[--field3070] == 1;
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1119) {
                var32.field7707 = field3061[--field3070] == 1;
                class136.method935(var32, -127);
                return;
            }
            if (arg0 == 1120) {
                field3070 -= 2;
                var32.field7644 = field3061[field3070];
                var32.field7585 = field3061[field3070 + 1];
                class136.method935(var32, -124);
                if (var32.field7632 == 0) {
                    class319.method1881(var32, -98, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field3070 -= 2;
                var32.field7566 = (short) field3061[field3070];
                var32.field7683 = (short) field3061[field3070 + 1];
                class136.method935(var32, -128);
                return;
            }
            if (arg0 == 1122) {
                var32.field7658 = field3061[--field3070] == 1;
                class136.method935(var32, -128);
                return;
            }
            if (arg0 == 1123) {
                var32.field7674 = field3061[--field3070];
                class136.method935(var32, -127);
                if (var32.field7562 == -1) {
                    class213.method1315(var32.field7723, (byte) 93);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field3061[--field3070];
                var32.field7607 = var36 == 1;
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1125) {
                field3070 -= 2;
                var32.field7645 = field3061[field3070];
                var32.field7668 = field3061[field3070 + 1];
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1126) {
                var32.field7681 = field3061[--field3070];
                class136.method935(var32, -125);
                return;
            }
            if (arg0 == 1127) {
                field3070 -= 2;
                int var37 = field3061[field3070];
                int var38 = field3061[field3070 + 1];
                class172 var39 = class199.field2592.method2579((byte) -88, var37);
                if (var39.field2188 != var38) {
                    var32.method3114(var37, -1, var38);
                    return;
                }
                var32.method3108(-1, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field3061[--field3070];
                String var41 = field3068[--field3066];
                class172 var42 = class199.field2592.method2579((byte) -103, var40);
                if (!var42.field2192.equals(var41)) {
                    var32.method3105((byte) 124, var40, var41);
                    return;
                }
                var32.method3108(-1, var40);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class523 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class310.method1810(field3061[--field3070], 1182823664);
            } else {
                var43 = arg1 ? field3056 : field3060;
            }
            class136.method935(var43, -124);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field3070 -= 2;
                int var44 = field3061[field3070];
                int var45 = field3061[field3070 + 1];
                if (var43.field7562 == -1) {
                    class19.method168(var43.field7723, 86);
                    class213.method1315(var43.field7723, (byte) 93);
                    class180.method1147(var43.field7723, 124);
                }
                if (var44 == -1) {
                    var43.field7580 = 1;
                    var43.field7689 = -1;
                    var43.field7567 = -1;
                    return;
                }
                var43.field7567 = var44;
                var43.field7609 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field7721 = true;
                } else {
                    var43.field7721 = false;
                }
                class9 var46 = class376.field4949.method624((byte) -122, var44);
                var43.field7620 = var46.field112;
                var43.field7586 = var46.field160;
                var43.field7690 = var46.field125;
                var43.field7603 = var46.field84;
                var43.field7688 = var46.field124;
                var43.field7674 = var46.field155;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field7633 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field7633 = 1;
                } else {
                    var43.field7633 = 2;
                }
                if (var43.field7622 > 0) {
                    var43.field7674 = var43.field7674 * 32 / var43.field7622;
                    return;
                }
                if (var43.field7604 > 0) {
                    var43.field7674 = var43.field7674 * 32 / var43.field7604;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field7580 = 2;
                var43.field7689 = field3061[--field3070];
                if (var43.field7562 == -1) {
                    class100.method748((byte) -127, var43.field7723);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field7580 = 3;
                var43.field7689 = -1;
                if (var43.field7562 == -1) {
                    class100.method748((byte) -118, var43.field7723);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field7580 = 6;
                var43.field7689 = field3061[--field3070];
                if (var43.field7562 == -1) {
                    class100.method748((byte) -118, var43.field7723);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field7580 = 5;
                var43.field7689 = field3061[--field3070];
                if (var43.field7562 == -1) {
                    class100.method748((byte) -119, var43.field7723);
                }
                return;
            }
            if (arg0 == 1206) {
                field3070 -= 4;
                var43.field7730 = field3061[field3070];
                var43.field7584 = field3061[field3070 + 1];
                var43.field7587 = field3061[field3070 + 2];
                var43.field7714 = field3061[field3070 + 3];
                class136.method935(var43, -128);
                return;
            }
            if (arg0 == 1207) {
                field3070 -= 2;
                var43.field7680 = field3061[field3070];
                var43.field7701 = field3061[field3070 + 1];
                class136.method935(var43, -128);
                return;
            }
            if (arg0 == 1210) {
                field3070 -= 4;
                var43.field7689 = field3061[field3070];
                var43.field7588 = field3061[field3070 + 1];
                if (field3061[field3070 + 2] == 1) {
                    var43.field7580 = 9;
                } else {
                    var43.field7580 = 8;
                }
                if (field3061[field3070 + 3] == 1) {
                    var43.field7721 = true;
                } else {
                    var43.field7721 = false;
                }
                if (var43.field7562 == -1) {
                    class100.method748((byte) -124, var43.field7723);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field7580 = 5;
                var43.field7689 = class66.field858;
                var43.field7588 = 0;
                if (var43.field7562 == -1) {
                    class100.method748((byte) -127, var43.field7723);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class523 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class310.method1810(field3061[--field3070], 1182823664);
                } else {
                    var58 = arg1 ? field3056 : field3060;
                }
                String var59 = field3068[--field3066];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field3061[--field3070];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field3061[--field3070];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field3068[--field3066];
                    } else {
                        var62[var63] = Integer.valueOf(field3061[--field3070]);
                    }
                }
                int var64 = field3061[--field3070];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field7677 = var62;
                } else if (arg0 == 1401) {
                    var58.field7612 = var62;
                } else if (arg0 == 1402) {
                    var58.field7641 = var62;
                } else if (arg0 == 1403) {
                    var58.field7705 = var62;
                } else if (arg0 == 1404) {
                    var58.field7648 = var62;
                } else if (arg0 == 1405) {
                    var58.field7583 = var62;
                } else if (arg0 == 1406) {
                    var58.field7565 = var62;
                } else if (arg0 == 1407) {
                    var58.field7696 = var62;
                    var58.field7709 = var60;
                } else if (arg0 == 1408) {
                    var58.field7672 = var62;
                } else if (arg0 == 1409) {
                    var58.field7578 = var62;
                } else if (arg0 == 1410) {
                    var58.field7662 = var62;
                } else if (arg0 == 1411) {
                    var58.field7572 = var62;
                } else if (arg0 == 1412) {
                    var58.field7676 = var62;
                } else if (arg0 == 1414) {
                    var58.field7624 = var62;
                    var58.field7724 = var60;
                } else if (arg0 == 1415) {
                    var58.field7605 = var62;
                    var58.field7656 = var60;
                } else if (arg0 == 1416) {
                    var58.field7564 = var62;
                } else if (arg0 == 1417) {
                    var58.field7718 = var62;
                } else if (arg0 == 1418) {
                    var58.field7638 = var62;
                } else if (arg0 == 1419) {
                    var58.field7602 = var62;
                } else if (arg0 == 1420) {
                    var58.field7631 = var62;
                } else if (arg0 == 1421) {
                    var58.field7651 = var62;
                } else if (arg0 == 1422) {
                    var58.field7665 = var62;
                } else if (arg0 == 1423) {
                    var58.field7582 = var62;
                } else if (arg0 == 1424) {
                    var58.field7715 = var62;
                } else if (arg0 == 1425) {
                    var58.field7700 = var62;
                } else if (arg0 == 1426) {
                    var58.field7684 = var62;
                } else if (arg0 == 1427) {
                    var58.field7598 = var62;
                } else if (arg0 == 1428) {
                    var58.field7591 = var62;
                    var58.field7687 = var60;
                } else if (arg0 == 1429) {
                    var58.field7726 = var62;
                    var58.field7720 = var60;
                } else if (arg0 == 1430) {
                    var58.field7667 = var62;
                }
                var58.field7634 = true;
                return;
            }
            if (arg0 < 1600) {
                class523 var65 = arg1 ? field3056 : field3060;
                if (arg0 == 1500) {
                    field3061[field3070++] = var65.field7623;
                    return;
                }
                if (arg0 == 1501) {
                    field3061[field3070++] = var65.field7660;
                    return;
                }
                if (arg0 == 1502) {
                    field3061[field3070++] = var65.field7617;
                    return;
                }
                if (arg0 == 1503) {
                    field3061[field3070++] = var65.field7574;
                    return;
                }
                if (arg0 == 1504) {
                    field3061[field3070++] = var65.field7682 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field3061[field3070++] = var65.field7673;
                    return;
                }
                if (arg0 == 1506) {
                    class523 var66 = class262.method1568(var65, -94);
                    field3061[field3070++] = var66 == null ? -1 : var66.field7723;
                    return;
                }
            } else if (arg0 < 1700) {
                class523 var67 = arg1 ? field3056 : field3060;
                if (arg0 == 1600) {
                    field3061[field3070++] = var67.field7636;
                    return;
                }
                if (arg0 == 1601) {
                    field3061[field3070++] = var67.field7659;
                    return;
                }
                if (arg0 == 1602) {
                    field3068[field3066++] = var67.field7728;
                    return;
                }
                if (arg0 == 1603) {
                    field3061[field3070++] = var67.field7644;
                    return;
                }
                if (arg0 == 1604) {
                    field3061[field3070++] = var67.field7585;
                    return;
                }
                if (arg0 == 1605) {
                    field3061[field3070++] = var67.field7674;
                    return;
                }
                if (arg0 == 1606) {
                    field3061[field3070++] = var67.field7620;
                    return;
                }
                if (arg0 == 1607) {
                    field3061[field3070++] = var67.field7690;
                    return;
                }
                if (arg0 == 1608) {
                    field3061[field3070++] = var67.field7586;
                    return;
                }
                if (arg0 == 1609) {
                    field3061[field3070++] = var67.field7678;
                    return;
                }
                if (arg0 == 1610) {
                    field3061[field3070++] = var67.field7603;
                    return;
                }
                if (arg0 == 1611) {
                    field3061[field3070++] = var67.field7688;
                    return;
                }
                if (arg0 == 1612) {
                    field3061[field3070++] = var67.field7647;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field3061[--field3070];
                    class172 var69 = class199.field2592.method2579((byte) 110, var68);
                    if (var69.method1095((byte) -63)) {
                        field3068[field3066++] = var67.method3117(var68, (byte) -8, var69.field2192);
                    } else {
                        field3061[field3070++] = var67.method3123(var68, var69.field2188, -2);
                    }
                }
            } else if (arg0 < 1800) {
                class523 var70 = arg1 ? field3056 : field3060;
                if (arg0 == 1700) {
                    field3061[field3070++] = var70.field7567;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field7567 != -1) {
                        field3061[field3070++] = var70.field7609;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field3061[field3070++] = var70.field7562;
                    return;
                }
            } else if (arg0 < 1900) {
                class523 var71 = arg1 ? field3056 : field3060;
                if (arg0 == 1800) {
                    field3061[field3070++] = client.method1226(var71).method644((byte) 51);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field3061[--field3070];
                    int var334 = var72 - 1;
                    if (var71.field7697 != null && var334 < var71.field7697.length && var71.field7697[var334] != null) {
                        field3068[field3066++] = var71.field7697[var334];
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field7592 == null) {
                        field3068[field3066++] = "";
                        return;
                    }
                    field3068[field3066++] = var71.field7592;
                    return;
                }
            } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
                class523 var332;
                if (arg0 >= 2000) {
                    var332 = class310.method1810(field3061[--field3070], 1182823664);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field3056 : field3060;
                }
                if (field3079 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field7598 == null) {
                        return;
                    }
                    class170 var333 = new class170();
                    var333.field2179 = var332;
                    var333.field2178 = var332.field7598;
                    var333.field2172 = field3079 + 1;
                    class434.field6164.method163(var333, 0);
                    return;
                }
            } else if (arg0 < 2600) {
                class523 var73 = class310.method1810(field3061[--field3070], 1182823664);
                if (arg0 == 2500) {
                    field3061[field3070++] = var73.field7623;
                    return;
                }
                if (arg0 == 2501) {
                    field3061[field3070++] = var73.field7660;
                    return;
                }
                if (arg0 == 2502) {
                    field3061[field3070++] = var73.field7617;
                    return;
                }
                if (arg0 == 2503) {
                    field3061[field3070++] = var73.field7574;
                    return;
                }
                if (arg0 == 2504) {
                    field3061[field3070++] = var73.field7682 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field3061[field3070++] = var73.field7673;
                    return;
                }
                if (arg0 == 1506) {
                    class523 var74 = class262.method1568(var73, -103);
                    field3061[field3070++] = var74 == null ? -1 : var74.field7723;
                    return;
                }
            } else if (arg0 < 2700) {
                class523 var75 = class310.method1810(field3061[--field3070], 1182823664);
                if (arg0 == 2600) {
                    field3061[field3070++] = var75.field7636;
                    return;
                }
                if (arg0 == 2601) {
                    field3061[field3070++] = var75.field7659;
                    return;
                }
                if (arg0 == 2602) {
                    field3068[field3066++] = var75.field7728;
                    return;
                }
                if (arg0 == 2603) {
                    field3061[field3070++] = var75.field7644;
                    return;
                }
                if (arg0 == 2604) {
                    field3061[field3070++] = var75.field7585;
                    return;
                }
                if (arg0 == 2605) {
                    field3061[field3070++] = var75.field7674;
                    return;
                }
                if (arg0 == 2606) {
                    field3061[field3070++] = var75.field7620;
                    return;
                }
                if (arg0 == 2607) {
                    field3061[field3070++] = var75.field7690;
                    return;
                }
                if (arg0 == 2608) {
                    field3061[field3070++] = var75.field7586;
                    return;
                }
                if (arg0 == 2609) {
                    field3061[field3070++] = var75.field7678;
                    return;
                }
                if (arg0 == 2610) {
                    field3061[field3070++] = var75.field7603;
                    return;
                }
                if (arg0 == 2611) {
                    field3061[field3070++] = var75.field7688;
                    return;
                }
                if (arg0 == 2612) {
                    field3061[field3070++] = var75.field7647;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class523 var76 = class310.method1810(field3061[--field3070], 1182823664);
                    field3061[field3070++] = var76.field7567;
                    return;
                }
                if (arg0 == 2701) {
                    class523 var77 = class310.method1810(field3061[--field3070], 1182823664);
                    if (var77.field7567 != -1) {
                        field3061[field3070++] = var77.field7609;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field3061[--field3070];
                    class175 var79 = (class175) class397.field5684.method2022(-1, (long) var78);
                    if (var79 != null) {
                        field3061[field3070++] = 1;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class523 var80 = class310.method1810(field3061[--field3070], 1182823664);
                    if (var80.field7717 == null) {
                        field3061[field3070++] = 0;
                        return;
                    }
                    int var81 = var80.field7717.length;
                    for (int var82 = 0; var82 < var80.field7717.length; var82++) {
                        if (var80.field7717[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field3061[field3070++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field3070 -= 2;
                    int var83 = field3061[field3070];
                    int var84 = field3061[field3070 + 1];
                    class175 var85 = (class175) class397.field5684.method2022(-1, (long) var83);
                    if (var85 != null && var85.field2279 == var84) {
                        field3061[field3070++] = 1;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class523 var86 = class310.method1810(field3061[--field3070], 1182823664);
                if (arg0 == 2800) {
                    field3061[field3070++] = client.method1226(var86).method644((byte) 51);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field3061[--field3070];
                    int var335 = var87 - 1;
                    if (var86.field7697 != null && var335 < var86.field7697.length && var86.field7697[var335] != null) {
                        field3068[field3066++] = var86.field7697[var335];
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field7592 == null) {
                        field3068[field3066++] = "";
                        return;
                    }
                    field3068[field3066++] = var86.field7592;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field3068[--field3066];
                    class445.method2622(true, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field3070 -= 2;
                    class370.method2108(field3061[field3070], field3061[field3070 + 1], -16032, class23.field336);
                    return;
                }
                if (arg0 == 3103) {
                    class38.method372(-44, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field3068[--field3066];
                    int var90 = 0;
                    if (class341.method1963(10, var89)) {
                        var90 = class521.method3099(var89, 88);
                    }
                    field3052++;
                    class282.method1669(class178.field2357, false);
                    class40.field511.method2777(var90, -11);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field3068[--field3066];
                    field3064++;
                    class282.method1669(class529.field7792, false);
                    class40.field511.method2729(var91.length() + 1, false);
                    class40.field511.method2769(var91, true);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field3068[--field3066];
                    field3058++;
                    class282.method1669(class293.field3737, false);
                    class40.field511.method2729(var92.length() + 1, false);
                    class40.field511.method2769(var92, true);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field3061[--field3070];
                    String var94 = field3068[--field3066];
                    class196.method1211(26438, var94, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field3070 -= 3;
                    int var95 = field3061[field3070];
                    int var96 = field3061[field3070 + 1];
                    int var97 = field3061[field3070 + 2];
                    class523 var98 = class310.method1810(var97, 1182823664);
                    class454.method2704(var98, var96, (byte) -38, var95);
                    return;
                }
                if (arg0 == 3109) {
                    field3070 -= 2;
                    int var99 = field3061[field3070];
                    int var100 = field3061[field3070 + 1];
                    class523 var101 = arg1 ? field3056 : field3060;
                    class454.method2704(var101, var100, (byte) 121, var99);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field3061[--field3070];
                    field3054++;
                    class282.method1669(class69.field900, false);
                    class40.field511.method2759((byte) -109, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field3070 -= 2;
                    int var103 = field3061[field3070];
                    int var104 = field3061[field3070 + 1];
                    class175 var105 = (class175) class397.field5684.method2022(-1, (long) var103);
                    if (var105 != null) {
                        class290.method1706(var105, 118, var105.field2279 != var104, true);
                    }
                    class534.method3159(true, 16384, var104, var103, 3);
                    return;
                }
                if (arg0 == 3112) {
                    field3070--;
                    int var106 = field3061[field3070];
                    class175 var107 = (class175) class397.field5684.method2022(-1, (long) var106);
                    if (var107 != null && var107.field2273 == 3) {
                        class290.method1706(var107, -29, true, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class335.method1938(field3068[--field3066], 92);
                    return;
                }
                if (arg0 == 3114) {
                    field3070 -= 2;
                    int var108 = field3061[field3070];
                    int var109 = field3061[field3070 + 1];
                    String var110 = field3068[--field3066];
                    class443.method2616("", var110, var109, false, "", var108);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field3070 -= 3;
                    class377.method2142(field3061[field3070 + 2], 0, field3061[field3070 + 1], field3061[field3070], 255);
                    return;
                }
                if (arg0 == 3201) {
                    class84.method681(field3061[--field3070], 50, 255, -101);
                    return;
                }
                if (arg0 == 3202) {
                    field3070 -= 2;
                    class247.method1501(field3061[field3070 + 1], field3061[field3070], 255, (byte) -107);
                    return;
                }
                if (arg0 == 3203) {
                    field3070 -= 4;
                    class377.method2142(field3061[field3070 + 2], 0, field3061[field3070 + 1], field3061[field3070], field3061[field3070 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field3070 -= 3;
                    class84.method681(field3061[field3070], field3061[field3070 + 2], field3061[field3070 + 1], -50);
                    return;
                }
                if (arg0 == 3205) {
                    field3070 -= 3;
                    class247.method1501(field3061[field3070 + 1], field3061[field3070], field3061[field3070 + 2], (byte) -107);
                    return;
                }
                if (arg0 == 3206) {
                    field3070 -= 4;
                    class317.method1870(field3061[field3070], field3061[field3070 + 1], field3061[field3070 + 2], field3061[field3070 + 3], false);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field3061[field3070++] = class163.field2065;
                    return;
                }
                if (arg0 == 3301) {
                    field3070 -= 2;
                    int var111 = field3061[field3070];
                    int var112 = field3061[field3070 + 1];
                    field3061[field3070++] = class178.method1137(var111, var112, false, -97);
                    return;
                }
                if (arg0 == 3302) {
                    field3070 -= 2;
                    int var113 = field3061[field3070];
                    int var114 = field3061[field3070 + 1];
                    field3061[field3070++] = class361.method2074(var113, (byte) 9, false, var114);
                    return;
                }
                if (arg0 == 3303) {
                    field3070 -= 2;
                    int var115 = field3061[field3070];
                    int var116 = field3061[field3070 + 1];
                    field3061[field3070++] = class316.method1850(var116, false, -104, var115);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field3061[--field3070];
                    field3061[field3070++] = class19.field280.method1985(true, var117).field1194;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field3061[--field3070];
                    field3061[field3070++] = class350.field4502[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field3061[--field3070];
                    field3061[field3070++] = class63.field826[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field3061[--field3070];
                    field3061[field3070++] = class225.field2869[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class23.field336.field2676;
                    int var122 = (class23.field336.field2666 >> 7) + class441.field6317;
                    int var123 = (class23.field336.field2677 >> 7) + class320.field4064;
                    field3061[field3070++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field3061[--field3070];
                    field3061[field3070++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field3061[--field3070];
                    field3061[field3070++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field3061[--field3070];
                    field3061[field3070++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field3061[field3070++] = class433.field6147 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field3070 -= 2;
                    int var127 = field3061[field3070];
                    int var128 = field3061[field3070 + 1];
                    field3061[field3070++] = class178.method1137(var127, var128, true, -105);
                    return;
                }
                if (arg0 == 3314) {
                    field3070 -= 2;
                    int var129 = field3061[field3070];
                    int var130 = field3061[field3070 + 1];
                    field3061[field3070++] = class361.method2074(var129, (byte) 9, true, var130);
                    return;
                }
                if (arg0 == 3315) {
                    field3070 -= 2;
                    int var131 = field3061[field3070];
                    int var132 = field3061[field3070 + 1];
                    field3061[field3070++] = class316.method1850(var132, true, -101, var131);
                    return;
                }
                if (arg0 == 3316) {
                    if (class322.field4086 >= 2) {
                        field3061[field3070++] = class322.field4086;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field3061[field3070++] = class306.field3903;
                    return;
                }
                if (arg0 == 3318) {
                    field3061[field3070++] = class64.field834.field355;
                    return;
                }
                if (arg0 == 3321) {
                    field3061[field3070++] = class354.field4554;
                    return;
                }
                if (arg0 == 3322) {
                    field3061[field3070++] = class426.field6059;
                    return;
                }
                if (arg0 == 3323) {
                    if (class290.field3701 >= 5 && class290.field3701 <= 9) {
                        field3061[field3070++] = 1;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class290.field3701 >= 5 && class290.field3701 <= 9) {
                        field3061[field3070++] = class290.field3701;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field3061[field3070++] = class115.field1550 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field3061[field3070++] = class23.field336.field2855;
                    return;
                }
                if (arg0 == 3327) {
                    field3061[field3070++] = class23.field336.field2823.field6332 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field3061[field3070++] = class122.field1641 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field3061[--field3070];
                    field3061[field3070++] = class199.method1253(false, var133, -9096);
                    return;
                }
                if (arg0 == 3331) {
                    field3070 -= 2;
                    int var134 = field3061[field3070];
                    int var135 = field3061[field3070 + 1];
                    field3061[field3070++] = class385.method2175(-104, var135, var134, false, false);
                    return;
                }
                if (arg0 == 3332) {
                    field3070 -= 2;
                    int var136 = field3061[field3070];
                    int var137 = field3061[field3070 + 1];
                    field3061[field3070++] = class385.method2175(-127, var137, var136, true, false);
                    return;
                }
                if (arg0 == 3333) {
                    field3061[field3070++] = class233.field2976;
                    return;
                }
                if (arg0 == 3335) {
                    field3061[field3070++] = class11.field177;
                    return;
                }
                if (arg0 == 3336) {
                    field3070 -= 4;
                    int var138 = field3061[field3070];
                    int var139 = field3061[field3070 + 1];
                    int var140 = field3061[field3070 + 2];
                    int var141 = field3061[field3070 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field3061[field3070++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field3061[field3070++] = class18.field276;
                    return;
                }
                if (arg0 == 3338) {
                    field3061[field3070++] = class21.method175(25212);
                    return;
                }
                if (arg0 == 3339) {
                    field3061[field3070++] = class177.field2329 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field3061[field3070++] = class534.field7855 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field3070 -= 2;
                    int var145 = field3061[field3070];
                    int var146 = field3061[field3070 + 1];
                    class299 var147 = class308.field3940.method1(var145, 16);
                    field3068[field3066++] = var147.method1765(var146, (byte) -108);
                    return;
                }
                if (arg0 == 3408) {
                    field3070 -= 4;
                    int var148 = field3061[field3070];
                    int var149 = field3061[field3070 + 1];
                    int var150 = field3061[field3070 + 2];
                    int var151 = field3061[field3070 + 3];
                    class299 var152 = class308.field3940.method1(var150, 16);
                    if (var152.field3847 == var148 && var152.field3851 == var149) {
                        if (var149 == 115) {
                            field3068[field3066++] = var152.method1765(var151, (byte) -108);
                            return;
                        }
                        field3061[field3070++] = var152.method1766(var151, (byte) 121);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field3070 -= 3;
                    int var153 = field3061[field3070];
                    int var154 = field3061[field3070 + 1];
                    int var155 = field3061[field3070 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class299 var156 = class308.field3940.method1(var154, 16);
                    if (var156.field3851 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field3061[field3070++] = var156.method1772(var155, (byte) 13) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field3061[--field3070];
                    String var158 = field3068[--field3066];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class299 var159 = class308.field3940.method1(var157, 16);
                    if (var159.field3851 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field3061[field3070++] = var159.method1767(false, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field3061[--field3070];
                    class299 var161 = class308.field3940.method1(var160, 16);
                    field3061[field3070++] = var161.field3848.method2025(-30075);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class208.field2694 == 0) {
                        field3061[field3070++] = -2;
                        return;
                    }
                    if (class208.field2694 == 1) {
                        field3061[field3070++] = -1;
                        return;
                    }
                    field3061[field3070++] = class280.field3555;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field3061[--field3070];
                    if (class208.field2694 == 2 && var162 < class280.field3555) {
                        field3068[field3066++] = class329.field4163[var162];
                        if (class106.field1341[var162] != null) {
                            field3068[field3066++] = class106.field1341[var162];
                            return;
                        }
                        field3068[field3066++] = "";
                        return;
                    }
                    field3068[field3066++] = "";
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field3061[--field3070];
                    if (class208.field2694 == 2 && var163 < class280.field3555) {
                        field3061[field3070++] = class401.field5710[var163];
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field3061[--field3070];
                    if (class208.field2694 == 2 && var164 < class280.field3555) {
                        field3061[field3070++] = class444.field6364[var164];
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field3068[--field3066];
                    int var166 = field3061[--field3070];
                    class33.method240((byte) 63, var166, var165);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field3068[--field3066];
                    class385.method2176(var167, -32017);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field3068[--field3066];
                    class250.method1513(var168, 32);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field3068[--field3066];
                    class507.method3043(var169, true, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field3068[--field3066];
                    class269.method1598(1, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field3068[--field3066];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field3061[field3070++] = class365.method2092(var171, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field3061[--field3070];
                    if (class208.field2694 == 2 && var172 < class280.field3555) {
                        field3068[field3066++] = class517.field7490[var172];
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class279.field3527 != null) {
                        field3068[field3066++] = class469.method2827(-1, class279.field3527);
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class279.field3527 != null) {
                        field3061[field3070++] = class339.field4255;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field3061[--field3070];
                    if (class279.field3527 != null && var173 < class339.field4255) {
                        field3068[field3066++] = class313.field3994[var173].field5000;
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field3061[--field3070];
                    if (class279.field3527 != null && var174 < class339.field4255) {
                        field3061[field3070++] = class313.field3994[var174].field5002;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field3061[--field3070];
                    if (class279.field3527 != null && var175 < class339.field4255) {
                        field3061[field3070++] = class313.field3994[var175].field5007;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field3061[field3070++] = class156.field1991;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field3068[--field3066];
                    class338.method1946((byte) 77, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field3061[field3070++] = class342.field4309;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field3068[--field3066];
                    class131.method919(var177, false);
                    return;
                }
                if (arg0 == 3620) {
                    class452.method2694((byte) 74);
                    return;
                }
                if (arg0 == 3621) {
                    if (class208.field2694 == 0) {
                        field3061[field3070++] = -1;
                        return;
                    }
                    field3061[field3070++] = class498.field7223;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field3061[--field3070];
                    if (class208.field2694 != 0 && var178 < class498.field7223) {
                        field3068[field3066++] = class385.field5063[var178];
                        if (class281.field3580[var178] != null) {
                            field3068[field3066++] = class281.field3580[var178];
                            return;
                        }
                        field3068[field3066++] = "";
                        return;
                    }
                    field3068[field3066++] = "";
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field3068[--field3066];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field3061[field3070++] = class530.method3144(-104, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field3061[--field3070];
                    if (class313.field3994 != null && var180 < class339.field4255 && class313.field3994[var180].field5005.equalsIgnoreCase(class23.field336.field2852)) {
                        field3061[field3070++] = 1;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class372.field4828 != null) {
                        field3068[field3066++] = class372.field4828;
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field3061[--field3070];
                    if (class279.field3527 != null && var181 < class339.field4255) {
                        field3068[field3066++] = class313.field3994[var181].field5010;
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field3061[--field3070];
                    if (class208.field2694 == 2 && var182 >= 0 && var182 < class280.field3555) {
                        field3061[field3070++] = class63.field824[var182] ? 1 : 0;
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field3068[--field3066];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field3061[field3070++] = class117.method843(var183, (byte) 79);
                    return;
                }
                if (arg0 == 3629) {
                    field3061[field3070++] = class122.field1632;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field3068[--field3066];
                    class507.method3043(var184, true, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field3061[--field3070];
                    field3061[field3070++] = class28.field395[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field3061[--field3070];
                    if (class279.field3527 != null && var186 < class339.field4255) {
                        field3068[field3066++] = class313.field3994[var186].field5005;
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field3061[--field3070];
                    if (class208.field2694 != 0 && var187 < class498.field7223) {
                        field3068[field3066++] = class113.field1520[var187];
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field3061[--field3070];
                    field3061[field3070++] = class352.field4518[var188].method1075(false);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field3061[--field3070];
                    field3061[field3070++] = class352.field4518[var189].field2112;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field3061[--field3070];
                    field3061[field3070++] = class352.field4518[var190].field2117;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field3061[--field3070];
                    field3061[field3070++] = class352.field4518[var191].field2119;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field3061[--field3070];
                    field3061[field3070++] = class352.field4518[var192].field2118;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field3061[--field3070];
                    field3061[field3070++] = class352.field4518[var193].field2113;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field3061[--field3070];
                    int var195 = class352.field4518[var194].method1074(true);
                    field3061[field3070++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field3061[--field3070];
                    int var197 = class352.field4518[var196].method1074(true);
                    field3061[field3070++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field3061[--field3070];
                    int var199 = class352.field4518[var198].method1074(true);
                    field3061[field3070++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field3061[--field3070];
                    int var201 = class352.field4518[var200].method1074(true);
                    field3061[field3070++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field3070 -= 2;
                    int var202 = field3061[field3070];
                    int var203 = field3061[field3070 + 1];
                    field3061[field3070++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field3070 -= 2;
                    int var204 = field3061[field3070];
                    int var205 = field3061[field3070 + 1];
                    field3061[field3070++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field3070 -= 2;
                    int var206 = field3061[field3070];
                    int var207 = field3061[field3070 + 1];
                    field3061[field3070++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field3070 -= 2;
                    int var208 = field3061[field3070];
                    int var209 = field3061[field3070 + 1];
                    field3061[field3070++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field3061[--field3070];
                    field3061[field3070++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field3061[--field3070];
                    field3061[field3070++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field3070 -= 5;
                    int var212 = field3061[field3070];
                    int var213 = field3061[field3070 + 1];
                    int var214 = field3061[field3070 + 2];
                    int var215 = field3061[field3070 + 3];
                    int var216 = field3061[field3070 + 4];
                    field3061[field3070++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field3070 -= 2;
                    long var217 = (long) field3061[field3070];
                    long var219 = (long) field3061[field3070 + 1];
                    field3061[field3070++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field3070 -= 2;
                    int var221 = field3061[field3070];
                    int var222 = field3061[field3070 + 1];
                    field3061[field3070++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field3070 -= 2;
                    int var223 = field3061[field3070];
                    int var224 = field3061[field3070 + 1];
                    field3061[field3070++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field3070 -= 2;
                    int var225 = field3061[field3070];
                    int var226 = field3061[field3070 + 1];
                    field3061[field3070++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field3070 -= 2;
                    int var227 = field3061[field3070];
                    int var228 = field3061[field3070 + 1];
                    field3061[field3070++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field3070 -= 2;
                    int var229 = field3061[field3070];
                    int var230 = field3061[field3070 + 1];
                    if (var229 == 0) {
                        field3061[field3070++] = 0;
                        return;
                    }
                    field3061[field3070++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field3070 -= 2;
                    int var231 = field3061[field3070];
                    int var232 = field3061[field3070 + 1];
                    if (var231 == 0) {
                        field3061[field3070++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field3061[field3070++] = Integer.MAX_VALUE;
                        return;
                    }
                    field3061[field3070++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field3070 -= 2;
                    int var233 = field3061[field3070];
                    int var234 = field3061[field3070 + 1];
                    field3061[field3070++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field3070 -= 2;
                    int var235 = field3061[field3070];
                    int var236 = field3061[field3070 + 1];
                    field3061[field3070++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field3070 -= 2;
                    int var237 = field3061[field3070];
                    int var238 = field3061[field3070 + 1];
                    field3061[field3070++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field3070 -= 2;
                    int var239 = field3061[field3070];
                    int var240 = field3061[field3070 + 1];
                    field3061[field3070++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field3070 -= 3;
                    long var241 = (long) field3061[field3070];
                    long var243 = (long) field3061[field3070 + 1];
                    long var245 = (long) field3061[field3070 + 2];
                    field3061[field3070++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field3068[--field3066];
                    int var248 = field3061[--field3070];
                    field3068[field3066++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field3066 -= 2;
                    String var249 = field3068[field3066];
                    String var250 = field3068[field3066 + 1];
                    field3068[field3066++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field3068[--field3066];
                    int var252 = field3061[--field3070];
                    field3068[field3066++] = var251 + class203.method1274(true, -29339, var252);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field3068[--field3066];
                    field3068[field3066++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field3068[field3066++] = method1436(field3061[--field3070]);
                    return;
                }
                if (arg0 == 4105) {
                    field3066 -= 2;
                    String var254 = field3068[field3066];
                    String var255 = field3068[field3066 + 1];
                    if (class23.field336.field2823 != null && class23.field336.field2823.field6332) {
                        field3068[field3066++] = var255;
                        return;
                    }
                    field3068[field3066++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field3061[--field3070];
                    field3068[field3066++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field3066 -= 2;
                    field3061[field3070++] = class176.method1130(class11.field177, field3068[field3066], 0, field3068[field3066 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field3068[--field3066];
                    field3070 -= 2;
                    int var258 = field3061[field3070];
                    int var259 = field3061[field3070 + 1];
                    class297 var260 = class21.method177(0, (byte) 100, class511.field7421, var259);
                    field3061[field3070++] = var260.method1746(var257, (byte) -105, var258, class6.field61);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field3068[--field3066];
                    field3070 -= 2;
                    int var262 = field3061[field3070];
                    int var263 = field3061[field3070 + 1];
                    class297 var264 = class21.method177(0, (byte) 100, class511.field7421, var263);
                    field3061[field3070++] = var264.method1755(var262, 0, var261, class6.field61);
                    return;
                }
                if (arg0 == 4110) {
                    field3066 -= 2;
                    String var265 = field3068[field3066];
                    String var266 = field3068[field3066 + 1];
                    if (field3061[--field3070] == 1) {
                        field3068[field3066++] = var265;
                        return;
                    }
                    field3068[field3066++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field3068[--field3066];
                    field3068[field3066++] = class163.method1051(var267, 21670);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field3068[--field3066];
                    int var269 = field3061[--field3070];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field3068[field3066++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field3061[--field3070];
                    field3061[field3070++] = class433.method2536((byte) -56, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field3061[--field3070];
                    field3061[field3070++] = class489.method2969((char) var271, -19880) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field3061[--field3070];
                    field3061[field3070++] = class364.method2088((char) var272, 14646) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field3061[--field3070];
                    field3061[field3070++] = class3.method14((byte) -117, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field3068[--field3066];
                    if (var274 != null) {
                        field3061[field3070++] = var274.length();
                        return;
                    }
                    field3061[field3070++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field3068[--field3066];
                    field3070 -= 2;
                    int var276 = field3061[field3070];
                    int var277 = field3061[field3070 + 1];
                    field3068[field3066++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field3068[--field3066];
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
                    field3068[field3066++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field3068[--field3066];
                    field3070 -= 2;
                    int var284 = field3061[field3070];
                    int var285 = field3061[field3070 + 1];
                    field3061[field3070++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field3066 -= 2;
                    String var286 = field3068[field3066];
                    String var287 = field3068[field3066 + 1];
                    int var288 = field3061[--field3070];
                    field3061[field3070++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field3061[--field3070];
                    field3061[field3070++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field3061[--field3070];
                    field3061[field3070++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field3061[--field3070] != 0;
                    int var292 = field3061[--field3070];
                    field3068[field3066++] = class144.method968((long) var292, class11.field177, 0, var291, false);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field3068[--field3066];
                    int var294 = field3061[--field3070];
                    class297 var295 = class21.method177(0, (byte) 100, class511.field7421, var294);
                    field3061[field3070++] = var295.method1751(false, var293, class6.field61);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field3061[--field3070];
                    field3068[field3066++] = class376.field4949.method624((byte) -125, var296).field140;
                    return;
                }
                if (arg0 == 4201) {
                    field3070 -= 2;
                    int var297 = field3061[field3070];
                    int var298 = field3061[field3070 + 1];
                    class9 var299 = class376.field4949.method624((byte) -126, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field137[var298 - 1] != null) {
                        field3068[field3066++] = var299.field137[var298 - 1];
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field3070 -= 2;
                    int var300 = field3061[field3070];
                    int var301 = field3061[field3070 + 1];
                    class9 var302 = class376.field4949.method624((byte) -112, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field101[var301 - 1] != null) {
                        field3068[field3066++] = var302.field101[var301 - 1];
                        return;
                    }
                    field3068[field3066++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field3061[--field3070];
                    field3061[field3070++] = class376.field4949.method624((byte) -117, var303).field119;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field3061[--field3070];
                    field3061[field3070++] = class376.field4949.method624((byte) -117, var304).field138 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field3061[--field3070];
                    class9 var306 = class376.field4949.method624((byte) -128, var305);
                    if (var306.field120 == -1 && var306.field130 >= 0) {
                        field3061[field3070++] = var306.field130;
                        return;
                    }
                    field3061[field3070++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field3061[--field3070];
                    class9 var308 = class376.field4949.method624((byte) -124, var307);
                    if (var308.field120 >= 0 && var308.field130 >= 0) {
                        field3061[field3070++] = var308.field130;
                        return;
                    }
                    field3061[field3070++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field3061[--field3070];
                    field3061[field3070++] = class376.field4949.method624((byte) -118, var309).field87 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field3070 -= 2;
                    int var310 = field3061[field3070];
                    int var311 = field3061[field3070 + 1];
                    class172 var312 = class199.field2592.method2579((byte) -52, var311);
                    if (var312.method1095((byte) -63)) {
                        field3068[field3066++] = class376.field4949.method624((byte) -125, var310).method66(var311, var312.field2192, true);
                        return;
                    }
                    field3061[field3070++] = class376.field4949.method624((byte) -113, var310).method65(true, var312.field2188, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field3070 -= 2;
                    int var313 = field3061[field3070];
                    int var314 = field3061[field3070 + 1] - 1;
                    class9 var315 = class376.field4949.method624((byte) -126, var313);
                    if (var315.field106 == var314) {
                        field3061[field3070++] = var315.field158;
                        return;
                    }
                    if (var315.field123 == var314) {
                        field3061[field3070++] = var315.field122;
                        return;
                    }
                    field3061[field3070++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field3068[--field3066];
                    int var317 = field3061[--field3070];
                    class297.method1756(var317 == 1, 0, var316);
                    field3061[field3070++] = class466.field6745;
                    return;
                }
                if (arg0 == 4211) {
                    if (class218.field2786 != null && class10.field164 < class466.field6745) {
                        field3061[field3070++] = class218.field2786[class10.field164++] & 0xFFFF;
                        return;
                    }
                    field3061[field3070++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class10.field164 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field3070 -= 2;
                    int var318 = field3061[field3070];
                    int var319 = field3061[field3070 + 1];
                    class172 var320 = class199.field2592.method2579((byte) -74, var319);
                    if (var320.method1095((byte) -63)) {
                        field3068[field3066++] = class390.field5244.method1327(var318, (byte) -127).method2897(21276, var319, var320.field2192);
                        return;
                    }
                    field3061[field3070++] = class390.field5244.method1327(var318, (byte) -127).method2910(92, var319, var320.field2188);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field3070 -= 2;
                    int var321 = field3061[field3070];
                    int var322 = field3061[field3070 + 1];
                    class172 var323 = class199.field2592.method2579((byte) -90, var322);
                    if (var323.method1095((byte) -63)) {
                        field3068[field3066++] = class315.field4017.method1958(-10091, var321).method777(var323.field2192, 91, var322);
                        return;
                    }
                    field3061[field3070++] = class315.field4017.method1958(-10091, var321).method767((byte) 111, var323.field2188, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field3070 -= 2;
                    int var324 = field3061[field3070];
                    int var325 = field3061[field3070 + 1];
                    class172 var326 = class199.field2592.method2579((byte) 109, var325);
                    if (var326.method1095((byte) -63)) {
                        field3068[field3066++] = class100.field1217.method1048(26, var324).method1349(var326.field2192, -124, var325);
                        return;
                    }
                    field3061[field3070++] = class100.field1217.method1048(26, var324).method1345(var325, var326.field2188, (byte) 105);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field3061[--field3070];
                class511 var328 = class327.field4134.method2573(var327, (byte) 14);
                if (var328.field7372 != null && var328.field7372.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field7384[0];
                    for (int var331 = 1; var331 < var328.field7372.length; var331++) {
                        if (var328.field7384[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field7384[var331];
                        }
                    }
                    field3061[field3070++] = var328.field7372[var329];
                    return;
                }
                field3061[field3070++] = var328.field7371;
                return;
            }
        } else {
            class523 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class310.method1810(field3061[--field3070], 1182823664);
            } else {
                var47 = arg1 ? field3056 : field3060;
            }
            if (arg0 == 1300) {
                int var48 = field3061[--field3070] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method3107(field3068[--field3066], var48, -76);
                    return;
                }
                field3066--;
                return;
            }
            if (arg0 == 1301) {
                field3070 -= 2;
                int var49 = field3061[field3070];
                int var50 = field3061[field3070 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field7569 = null;
                    return;
                }
                var47.field7569 = class202.method1268(var49, var50, 0);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field3061[--field3070];
                if (class506.field7287 != var51 && class186.field2423 != var51 && class474.field6872 != var51) {
                    return;
                }
                var47.field7669 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field7610 = field3061[--field3070];
                return;
            }
            if (arg0 == 1304) {
                var47.field7596 = field3061[--field3070];
                return;
            }
            if (arg0 == 1305) {
                var47.field7592 = field3068[--field3066];
                return;
            }
            if (arg0 == 1306) {
                var47.field7570 = field3068[--field3066];
                return;
            }
            if (arg0 == 1307) {
                var47.field7697 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field7613 = field3061[--field3070];
                var47.field7581 = field3061[--field3070];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field3061[--field3070];
                int var53 = field3061[--field3070];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method3120(var53 - 1, var52, true);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field7729 = field3068[--field3066];
                return;
            }
            if (arg0 == 1311) {
                var47.field7594 = field3061[--field3070];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field3070 -= 3;
                    var54 = field3061[field3070] - 1;
                    var55 = field3061[field3070 + 1];
                    var56 = field3061[field3070 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field3070 -= 2;
                    var54 = 10;
                    var55 = field3061[field3070];
                    var56 = field3061[field3070 + 1];
                }
                if (var47.field7577 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field7577 = new byte[11];
                    var47.field7646 = new byte[11];
                    var47.field7573 = new int[11];
                }
                var47.field7577[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field7655 = false;
                    for (int var57 = 0; var57 < var47.field7577.length; var57++) {
                        if (var47.field7577[var57] != 0) {
                            var47.field7655 = true;
                            break;
                        }
                    }
                } else {
                    var47.field7655 = true;
                }
                var47.field7646[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field7611 = field3061[--field3070];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 3608)
    private static final void method1435(int arg0) {
        class523 var1 = class310.method1810(arg0, 1182823664);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class523[] var3 = class110.field1488[var2];
        if (var3 == null) {
            class523[] var4 = class293.field3725[var2];
            int var5 = var4.length;
            var3 = class110.field1488[var2] = new class523[var5];
            class318.method1871(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class318.method1871(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)Ljava/lang/String;", line = 3646)
    private static final String method1436(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field3063.setTime(new Date(var1));
        int var3 = field3063.get(5);
        int var4 = field3063.get(2);
        int var5 = field3063.get(1);
        return var3 + "-" + field3078[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lpi;I)V", line = 3658)
    private static final void method1437(class346 arg0, int arg1) {
        field3070 = 0;
        field3066 = 0;
        int var2 = -1;
        int[] var3 = arg0.field4444;
        int[] var4 = arg0.field4448;
        byte var5 = -1;
        field3055 = 0;
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
                        method1434(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1447(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field3061[field3070++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field3061[field3070++] = class491.field7160.field6712[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class491.field7160.method2801((byte) 95, field3061[--field3070], var8);
                } else if (var43 == 3) {
                    field3068[field3066++] = arg0.field4442[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field3070 -= 2;
                    if (field3061[field3070 + 1] != field3061[field3070]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field3070 -= 2;
                    if (field3061[field3070 + 1] == field3061[field3070]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field3070 -= 2;
                    if (field3061[field3070] < field3061[field3070 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field3070 -= 2;
                    if (field3061[field3070] > field3061[field3070 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field3055 == 0) {
                        return;
                    }
                    class337 var9 = field3075[--field3055];
                    arg0 = var9.field4238;
                    var3 = arg0.field4444;
                    var4 = arg0.field4448;
                    var2 = var9.field4239;
                    field3062 = var9.field4235;
                    field3072 = var9.field4237;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field3061[field3070++] = class491.field7160.method377(-1994346078, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class491.field7160.method2805(var11, 0, field3061[--field3070]);
                } else if (var43 == 31) {
                    field3070 -= 2;
                    if (field3061[field3070] <= field3061[field3070 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field3070 -= 2;
                    if (field3061[field3070] >= field3061[field3070 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field3061[field3070++] = field3062[var4[var2]];
                } else if (var43 == 34) {
                    field3062[var4[var2]] = field3061[--field3070];
                } else if (var43 == 35) {
                    field3068[field3066++] = field3072[var4[var2]];
                } else if (var43 == 36) {
                    field3072[var4[var2]] = field3068[--field3066];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field3066 -= var12;
                    String var13 = class501.method3019(field3066, field3068, var12, 1);
                    field3068[field3066++] = var13;
                } else if (var43 == 38) {
                    field3070--;
                } else if (var43 == 39) {
                    field3066--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class346 var15 = class191.method1185(var14, -87);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field4437];
                    String[] var17 = new String[var15.field4438];
                    for (int var18 = 0; var18 < var15.field4434; var18++) {
                        var16[var18] = field3061[field3070 + var18 - var15.field4434];
                    }
                    for (int var19 = 0; var19 < var15.field4435; var19++) {
                        var17[var19] = field3068[field3066 + var19 - var15.field4435];
                    }
                    field3070 -= var15.field4434;
                    field3066 -= var15.field4435;
                    class337 var20 = new class337();
                    var20.field4238 = arg0;
                    var20.field4239 = var2;
                    var20.field4235 = field3062;
                    var20.field4237 = field3072;
                    if (field3055 >= field3075.length) {
                        throw new RuntimeException();
                    }
                    field3075[field3055++] = var20;
                    arg0 = var15;
                    var3 = var15.field4444;
                    var4 = var15.field4448;
                    var2 = -1;
                    field3062 = var16;
                    field3072 = var17;
                } else if (var43 == 42) {
                    field3061[field3070++] = class372.field4824[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class372.field4824[var21] = field3061[--field3070];
                    class361.method2071(var21, 1);
                    class40.field514 |= class341.field4300[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field3061[--field3070];
                    if (var24 >= 0 && var24 <= 5000) {
                        field3051[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field3065[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field3061[--field3070];
                    if (var28 < 0 || var28 >= field3051[var27]) {
                        throw new RuntimeException();
                    }
                    field3061[field3070++] = field3065[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field3070 -= 2;
                    int var30 = field3061[field3070];
                    if (var30 < 0 || var30 >= field3051[var29]) {
                        throw new RuntimeException();
                    }
                    field3065[var29][var30] = field3061[field3070 + 1];
                } else if (var43 == 47) {
                    String var31 = class125.field1668[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field3068[field3066++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class125.field1668[var32] = field3068[--field3066];
                    class530.method3148(var32, (byte) 86);
                } else if (var43 == 51) {
                    class352 var33 = arg0.field4443[var4[var2]];
                    class101 var34 = (class101) var33.method2022(-1, (long) field3061[--field3070]);
                    if (var34 != null) {
                        var2 += var34.field1222;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field4440 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field5043).append(" ");
                for (int var41 = field3055 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field3075[var41].field4238.field5043).append(" ");
                }
                var40.append("op: ").append(var5);
                class461.method2719(var42, var40.toString(), 1);
            } else {
                class445.method2622(true, "Clientscript error in: " + arg0.field4440);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field4440).append("\n");
                for (int var38 = field3055 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field3075[var38].field4238.field4440).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class461.method2719(var42, var37.toString(), 1);
                class306.method1794(var37.toString(), -1);
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V", line = 4092)
    public static final void method1438(int arg0) {
        if (arg0 == -1 || !class450.method2649(arg0, 21182)) {
            return;
        }
        class523[] var1 = class293.field3725[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class523 var3 = var1[var2];
            if (var3.field7661 != null) {
                class170 var4 = new class170();
                var4.field2179 = var3;
                var4.field2178 = var3.field7661;
                method1441(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(IZ)V", line = 4126)
    public static final void method1439(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "()V", line = 4131)
    public static void method1440() {
        field3062 = null;
        field3072 = null;
        field3051 = null;
        field3065 = null;
        field3061 = null;
        field3068 = null;
        field3075 = null;
        field3060 = null;
        field3056 = null;
        field3069 = null;
        field3063 = null;
        field3078 = null;
        field3076 = null;
        field3077 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lpd;I)V", line = 4148)
    private static final void method1441(class170 arg0, int arg1) {
        Object[] var2 = arg0.field2178;
        int var3 = (Integer) var2[0];
        class346 var4 = class191.method1185(var3, -56);
        if (var4 == null) {
            return;
        }
        field3062 = new int[var4.field4437];
        int var5 = 0;
        field3072 = new String[var4.field4438];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2175;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2177;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2179 == null ? -1 : arg0.field2179.field7723;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2174;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2179 == null ? -1 : arg0.field2179.field7562;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2180 == null ? -1 : arg0.field2180.field7723;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2180 == null ? -1 : arg0.field2180.field7562;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2181;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2171;
                }
                field3062[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2173;
                }
                field3072[var6++] = var9;
            }
        }
        field3079 = arg0.field2172;
        method1437(var4, arg1);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "()V", line = 4226)
    public static final void method1442() {
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(I)V", line = 4237)
    private static final void method1443(int arg0) {
        class523 var1 = class310.method1810(arg0, 1182823664);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class523[] var3 = class110.field1488[var2];
        if (var3 == null) {
            class523[] var4 = class293.field3725[var2];
            int var5 = var4.length;
            var3 = class110.field1488[var2] = new class523[var5];
            class318.method1871(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class318.method1871(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lpd;)V", line = 4277)
    public static final void method1444(class170 arg0) {
        method1441(arg0, 200000);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lcq;II)V", line = 4283)
    public static final void method1445(class328 arg0, int arg1, int arg2) {
        class346 var3 = class149.method987(arg0, (byte) 72, arg1, arg2);
        if (var3 == null) {
            return;
        }
        field3062 = new int[var3.field4437];
        field3072 = new String[var3.field4438];
        if (class502.field7248 == var3.field4447 || class126.field1675 == var3.field4447 || class34.field432 == var3.field4447) {
            int var4 = 0;
            int var5 = 0;
            if (class78.field1021 != null) {
                var4 = class78.field1021.field7623;
                var5 = class78.field1021.field7660;
            }
            field3062[0] = class204.field2664.method1333(7) - var4;
            field3062[1] = class204.field2664.method1337(69) - var5;
        }
        method1437(var3, 200000);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4310)
    private static final void method1446(String arg0, int arg1) {
        if (class322.field4086 == 0 && !(!class293.field3726 || class284.field3608) || class122.field1641) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class6.field58.method1936(-26539, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class6.field58.method1936(-26539, 0).length());
        } else if (var2.startsWith(class410.field5853.method1936(-26539, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class410.field5853.method1936(-26539, 0).length());
        } else if (var2.startsWith(class19.field279.method1936(-26539, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class19.field279.method1936(-26539, 0).length());
        } else if (var2.startsWith(class108.field1361.method1936(-26539, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class108.field1361.method1936(-26539, 0).length());
        } else if (var2.startsWith(class389.field5225.method1936(-26539, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class389.field5225.method1936(-26539, 0).length());
        } else if (var2.startsWith(class59.field774.method1936(-26539, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class59.field774.method1936(-26539, 0).length());
        } else if (var2.startsWith(class194.field2513.method1936(-26539, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class194.field2513.method1936(-26539, 0).length());
        } else if (var2.startsWith(class532.field7823.method1936(-26539, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class532.field7823.method1936(-26539, 0).length());
        } else if (var2.startsWith(class21.field307.method1936(-26539, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class21.field307.method1936(-26539, 0).length());
        } else if (var2.startsWith(class204.field2662.method1936(-26539, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class204.field2662.method1936(-26539, 0).length());
        } else if (var2.startsWith(class20.field288.method1936(-26539, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class20.field288.method1936(-26539, 0).length());
        } else if (var2.startsWith(class64.field831.method1936(-26539, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class64.field831.method1936(-26539, 0).length());
        } else if (class11.field177 != 0) {
            if (var2.startsWith(class6.field58.method1936(-26539, class11.field177))) {
                var3 = 0;
                arg0 = arg0.substring(class6.field58.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class410.field5853.method1936(-26539, class11.field177))) {
                var3 = 1;
                arg0 = arg0.substring(class410.field5853.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class19.field279.method1936(-26539, class11.field177))) {
                var3 = 2;
                arg0 = arg0.substring(class19.field279.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class108.field1361.method1936(-26539, class11.field177))) {
                var3 = 3;
                arg0 = arg0.substring(class108.field1361.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class389.field5225.method1936(-26539, class11.field177))) {
                var3 = 4;
                arg0 = arg0.substring(class389.field5225.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class59.field774.method1936(-26539, class11.field177))) {
                var3 = 5;
                arg0 = arg0.substring(class59.field774.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class194.field2513.method1936(-26539, class11.field177))) {
                var3 = 6;
                arg0 = arg0.substring(class194.field2513.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class532.field7823.method1936(-26539, class11.field177))) {
                var3 = 7;
                arg0 = arg0.substring(class532.field7823.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class21.field307.method1936(-26539, class11.field177))) {
                var3 = 8;
                arg0 = arg0.substring(class21.field307.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class204.field2662.method1936(-26539, class11.field177))) {
                var3 = 9;
                arg0 = arg0.substring(class204.field2662.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class20.field288.method1936(-26539, class11.field177))) {
                var3 = 10;
                arg0 = arg0.substring(class20.field288.method1936(-26539, class11.field177).length());
            } else if (var2.startsWith(class64.field831.method1936(-26539, class11.field177))) {
                var3 = 11;
                arg0 = arg0.substring(class64.field831.method1936(-26539, class11.field177).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class268.field3396.method1936(-26539, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class268.field3396.method1936(-26539, 0).length());
        } else if (var4.startsWith(class291.field3706.method1936(-26539, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class291.field3706.method1936(-26539, 0).length());
        } else if (var4.startsWith(class151.field1894.method1936(-26539, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class151.field1894.method1936(-26539, 0).length());
        } else if (var4.startsWith(class525.field7756.method1936(-26539, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class525.field7756.method1936(-26539, 0).length());
        } else if (var4.startsWith(class359.field4622.method1936(-26539, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class359.field4622.method1936(-26539, 0).length());
        } else if (class11.field177 != 0) {
            if (var4.startsWith(class268.field3396.method1936(-26539, class11.field177))) {
                var5 = 1;
                arg0 = arg0.substring(class268.field3396.method1936(-26539, class11.field177).length());
            } else if (var4.startsWith(class291.field3706.method1936(-26539, class11.field177))) {
                var5 = 2;
                arg0 = arg0.substring(class291.field3706.method1936(-26539, class11.field177).length());
            } else if (var4.startsWith(class151.field1894.method1936(-26539, class11.field177))) {
                var5 = 3;
                arg0 = arg0.substring(class151.field1894.method1936(-26539, class11.field177).length());
            } else if (var4.startsWith(class525.field7756.method1936(-26539, class11.field177))) {
                var5 = 4;
                arg0 = arg0.substring(class525.field7756.method1936(-26539, class11.field177).length());
            } else if (var4.startsWith(class359.field4622.method1936(-26539, class11.field177))) {
                var5 = 5;
                arg0 = arg0.substring(class359.field4622.method1936(-26539, class11.field177).length());
            }
        }
        field3073++;
        class282.method1669(class309.field3959, false);
        class40.field511.method2729(0, false);
        int var6 = class40.field511.field6631;
        if (arg1 == 5021) {
            class40.field511.method2729(1, false);
        } else if (arg1 == 5022) {
            class40.field511.method2729(2, false);
        } else {
            class40.field511.method2729(0, false);
        }
        class40.field511.method2729(var3, false);
        class40.field511.method2729(var5, false);
        class59.method547(class40.field511, arg0, (byte) -112);
        class40.field511.method2755(class40.field511.field6631 - var6, (byte) -78);
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(IZ)V", line = 4587)
    private static final void method1447(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field3061[field3070++] = class308.field3931;
                return;
            }
            if (arg0 == 5001) {
                field3070 -= 3;
                class308.field3931 = field3061[field3070];
                class177.field2334 = class353.method2026(69, field3061[field3070 + 1]);
                if (class177.field2334 == null) {
                    class177.field2334 = class141.field1828;
                }
                class430.field6107 = field3061[field3070 + 2];
                field3067++;
                class282.method1669(class98.field1191, false);
                class40.field511.method2729(class308.field3931, false);
                class40.field511.method2729(class177.field2334.field397, false);
                class40.field511.method2729(class430.field6107, false);
                return;
            }
            if (arg0 == 5002) {
                field3066 -= 2;
                String var2 = field3068[field3066];
                String var3 = field3068[field3066 + 1];
                field3070 -= 2;
                int var4 = field3061[field3070];
                int var5 = field3061[field3070 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field3059++;
                class282.method1669(class477.field6928, false);
                class40.field511.method2729(class463.method2733(-112, var2) + class463.method2733(-89, var3) + 2, false);
                class40.field511.method2769(var2, true);
                class40.field511.method2729(var4 - 1, false);
                class40.field511.method2729(var5, false);
                class40.field511.method2769(var3, true);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field3061[--field3070];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class374.field4839[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field3068[field3066++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field3061[--field3070];
                int var9 = -1;
                if (var8 < 100 && class374.field4839[var8] != null) {
                    var9 = class410.field5855[var8];
                }
                field3061[field3070++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class177.field2334 == null) {
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = class177.field2334.field397;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field3068[--field3066];
                method1446(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field3066 -= 2;
                String var11 = field3068[field3066];
                String var12 = field3068[field3066 + 1];
                if (class322.field4086 != 0 || (!class293.field3726 || class284.field3608) && !class122.field1641) {
                    field3071++;
                    class282.method1669(class144.field1847, false);
                    class40.field511.method2729(0, false);
                    int var13 = class40.field511.field6631;
                    class40.field511.method2769(var11, true);
                    class59.method547(class40.field511, var12, (byte) -96);
                    class40.field511.method2755(class40.field511.field6631 - var13, (byte) -124);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field3061[--field3070];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class111.field1501[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field3068[field3066++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field3061[--field3070];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class256.field3264[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field3068[field3066++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field3061[--field3070];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class117.field1581[var18];
                }
                field3061[field3070++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class23.field336 == null || class23.field336.field2813 == null) {
                    var20 = class493.field7171;
                } else {
                    var20 = class23.field336.method1355(true, 118);
                }
                field3068[field3066++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field3061[field3070++] = class430.field6107;
                return;
            }
            if (arg0 == 5017) {
                field3061[field3070++] = class428.field6074;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field3061[--field3070];
                int var22 = 0;
                if (var21 < 100 && class374.field4839[var21] != null) {
                    var22 = class26.field381[var21];
                }
                field3061[field3070++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field3061[--field3070];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class391.field5253[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field3068[field3066++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class23.field336 == null || class23.field336.field2813 == null) {
                    var25 = class493.field7171;
                } else {
                    var25 = class23.field336.method1363(true, false);
                }
                field3068[field3066++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field3061[--field3070];
                field3068[field3066++] = class238.field3045.method2929(false, var26).field2457;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field3061[--field3070];
                class188 var28 = class238.field3045.method2929(false, var27);
                if (var28.field2460 == null) {
                    field3061[field3070++] = 0;
                    return;
                }
                field3061[field3070++] = var28.field2460.length;
                return;
            }
            if (arg0 == 5052) {
                field3070 -= 2;
                int var29 = field3061[field3070];
                int var30 = field3061[field3070 + 1];
                class188 var31 = class238.field3045.method2929(false, var29);
                int var32 = var31.field2460[var30];
                field3061[field3070++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field3061[--field3070];
                class188 var34 = class238.field3045.method2929(false, var33);
                if (var34.field2452 == null) {
                    field3061[field3070++] = 0;
                    return;
                }
                field3061[field3070++] = var34.field2452.length;
                return;
            }
            if (arg0 == 5054) {
                field3070 -= 2;
                int var35 = field3061[field3070];
                int var36 = field3061[field3070 + 1];
                field3061[field3070++] = class238.field3045.method2929(false, var35).field2452[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field3061[--field3070];
                field3068[field3066++] = class176.field2307.method847(var37, 32768).method1558(-71);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field3061[--field3070];
                class261 var39 = class176.field2307.method847(var38, 32768);
                if (var39.field3296 == null) {
                    field3061[field3070++] = 0;
                    return;
                }
                field3061[field3070++] = var39.field3296.length;
                return;
            }
            if (arg0 == 5057) {
                field3070 -= 2;
                int var40 = field3061[field3070];
                int var41 = field3061[field3070 + 1];
                field3061[field3070++] = class176.field2307.method847(var40, 32768).field3296[var41];
                return;
            }
            if (arg0 == 5058) {
                field3069 = new class483();
                field3069.field7066 = field3061[--field3070];
                field3069.field7064 = class176.field2307.method847(field3069.field7066, 32768);
                field3069.field7063 = new int[field3069.field7064.method1561(47)];
                return;
            }
            if (arg0 == 5059) {
                field3053++;
                class282.method1669(class155.field1964, false);
                class40.field511.method2729(0, false);
                int var42 = class40.field511.field6631;
                class40.field511.method2729(0, false);
                class40.field511.method2759((byte) -93, field3069.field7066);
                field3069.field7064.method1566(class40.field511, field3069.field7063, -117);
                class40.field511.method2755(class40.field511.field6631 - var42, (byte) -66);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field3068[--field3066];
                field3057++;
                class282.method1669(class105.field1335, false);
                class40.field511.method2729(0, false);
                int var44 = class40.field511.field6631;
                class40.field511.method2769(var43, true);
                class40.field511.method2759((byte) -122, field3069.field7066);
                field3069.field7064.method1566(class40.field511, field3069.field7063, 126);
                class40.field511.method2755(class40.field511.field6631 - var44, (byte) -59);
                return;
            }
            if (arg0 == 5061) {
                field3053++;
                class282.method1669(class155.field1964, false);
                class40.field511.method2729(0, false);
                int var45 = class40.field511.field6631;
                class40.field511.method2729(1, false);
                class40.field511.method2759((byte) -48, field3069.field7066);
                field3069.field7064.method1566(class40.field511, field3069.field7063, -115);
                class40.field511.method2755(class40.field511.field6631 - var45, (byte) -98);
                return;
            }
            if (arg0 == 5062) {
                field3070 -= 2;
                int var46 = field3061[field3070];
                int var47 = field3061[field3070 + 1];
                field3061[field3070++] = class238.field3045.method2929(false, var46).field2451[var47];
                return;
            }
            if (arg0 == 5063) {
                field3070 -= 2;
                int var48 = field3061[field3070];
                int var49 = field3061[field3070 + 1];
                field3061[field3070++] = class238.field3045.method2929(false, var48).field2453[var49];
                return;
            }
            if (arg0 == 5064) {
                field3070 -= 2;
                int var50 = field3061[field3070];
                int var51 = field3061[field3070 + 1];
                if (var51 == -1) {
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = class238.field3045.method2929(false, var50).method1179((char) var51, (byte) 122);
                return;
            }
            if (arg0 == 5065) {
                field3070 -= 2;
                int var52 = field3061[field3070];
                int var53 = field3061[field3070 + 1];
                if (var53 == -1) {
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = class238.field3045.method2929(false, var52).method1176((char) var53, 106);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field3061[--field3070];
                field3061[field3070++] = class176.field2307.method847(var54, 32768).method1561(-118);
                return;
            }
            if (arg0 == 5067) {
                field3070 -= 2;
                int var55 = field3061[field3070];
                int var56 = field3061[field3070 + 1];
                int var57 = class176.field2307.method847(var55, 32768).method1556(0, var56).field389;
                field3061[field3070++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field3070 -= 2;
                int var58 = field3061[field3070];
                int var59 = field3061[field3070 + 1];
                field3069.field7063[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field3070 -= 2;
                int var60 = field3061[field3070];
                int var61 = field3061[field3070 + 1];
                field3069.field7063[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field3070 -= 3;
                int var62 = field3061[field3070];
                int var63 = field3061[field3070 + 1];
                int var64 = field3061[field3070 + 2];
                class261 var65 = class176.field2307.method847(var62, 32768);
                if (var65.method1556(0, var63).field389 != 0) {
                    throw new RuntimeException("bad command");
                }
                field3061[field3070++] = var65.method1554(var63, var64, -89);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field3068[--field3066];
                boolean var67 = field3061[--field3070] == 1;
                class448.method2630(var66, 31234, var67);
                field3061[field3070++] = class466.field6745;
                return;
            }
            if (arg0 == 5072) {
                if (class218.field2786 != null && class10.field164 < class466.field6745) {
                    field3061[field3070++] = class218.field2786[class10.field164++] & 0xFFFF;
                    return;
                }
                field3061[field3070++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class10.field164 = 0;
                return;
            }
            if (arg0 == 5074) {
                field3053++;
                class282.method1669(class155.field1964, false);
                class40.field511.method2729(0, false);
                int var68 = class40.field511.field6631;
                class40.field511.method2729(2, false);
                class40.field511.method2759((byte) -51, field3069.field7066);
                field3069.field7064.method1566(class40.field511, field3069.field7063, -124);
                class40.field511.method2755(class40.field511.field6631 - var68, (byte) -91);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class343.field4392.method834(false, 86)) {
                    field3061[field3070++] = 1;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class343.field4392.method834(false, 82)) {
                    field3061[field3070++] = 1;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class343.field4392.method834(false, 81)) {
                    field3061[field3070++] = 1;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class143.method963(field3061[--field3070], (byte) 36);
                return;
            }
            if (arg0 == 5201) {
                field3061[field3070++] = class379.method2148(1339);
                return;
            }
            if (arg0 == 5205) {
                class49.method504((byte) -22, -1, -1, field3061[--field3070], false);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field3061[--field3070];
                class159 var70 = class241.method1455(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = var70.field2005;
                return;
            }
            if (arg0 == 5207) {
                class159 var71 = class241.method1460(field3061[--field3070]);
                if (var71 != null && var71.field2007 != null) {
                    field3068[field3066++] = var71.field2007;
                    return;
                }
                field3068[field3066++] = "";
                return;
            }
            if (arg0 == 5208) {
                field3061[field3070++] = class20.field287;
                field3061[field3070++] = class374.field4837;
                return;
            }
            if (arg0 == 5209) {
                field3061[field3070++] = class241.field3112 + class175.field2277;
                field3061[field3070++] = class38.field496 + class241.field3119;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field3061[--field3070];
                class159 var73 = class241.method1460(var72);
                if (var73 == null) {
                    field3061[field3070++] = 0;
                    field3061[field3070++] = 0;
                    return;
                }
                field3061[field3070++] = var73.field2015 >> 14 & 0x3FFF;
                field3061[field3070++] = var73.field2015 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field3061[--field3070];
                class159 var75 = class241.method1460(var74);
                if (var75 == null) {
                    field3061[field3070++] = 0;
                    field3061[field3070++] = 0;
                    return;
                }
                field3061[field3070++] = var75.field2017 - var75.field2016;
                field3061[field3070++] = var75.field2006 - var75.field2019;
                return;
            }
            if (arg0 == 5212) {
                class160 var76 = class346.method1983(30);
                if (var76 == null) {
                    field3061[field3070++] = -1;
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = var76.field2035;
                int var77 = var76.field2034 << 28 | class241.field3112 + var76.field2043 << 14 | class241.field3119 + var76.field2036;
                field3061[field3070++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class160 var78 = class154.method1008((byte) -120);
                if (var78 == null) {
                    field3061[field3070++] = -1;
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = var78.field2035;
                int var79 = var78.field2034 << 28 | class241.field3112 + var78.field2043 << 14 | class241.field3119 + var78.field2036;
                field3061[field3070++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field3061[--field3070];
                class159 var81 = class137.method942(6);
                if (var81 != null) {
                    boolean var82 = var81.method1022(var80 & 0x3FFF, var80 >> 28 & 0x3, field3076, (byte) 57, var80 >> 14 & 0x3FFF);
                    if (var82) {
                        class427.method2504(34963, field3076[2], field3076[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field3070 -= 2;
                int var83 = field3061[field3070];
                int var84 = field3061[field3070 + 1];
                class230 var85 = class241.method1469(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class159 var87 = (class159) var85.method1399(110); var87 != null; var87 = (class159) var85.method1394((byte) 14)) {
                    if (var87.field2005 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field3061[field3070++] = 1;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field3061[--field3070];
                class159 var89 = class241.method1460(var88);
                if (var89 == null) {
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = var89.field2010;
                return;
            }
            if (arg0 == 5220) {
                field3061[field3070++] = class285.field3646 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field3061[--field3070];
                class427.method2504(34963, var90 & 0x3FFF, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class159 var91 = class137.method942(-128);
                if (var91 != null) {
                    boolean var92 = var91.method1024(class241.field3112 + class175.field2277, (byte) -88, field3076, class38.field496 + class241.field3119);
                    if (var92) {
                        field3061[field3070++] = field3076[1];
                        field3061[field3070++] = field3076[2];
                        return;
                    }
                    field3061[field3070++] = -1;
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = -1;
                field3061[field3070++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field3070 -= 2;
                int var93 = field3061[field3070];
                int var94 = field3061[field3070 + 1];
                class49.method504((byte) -22, var94 & 0x3FFF, var94 >> 14 & 0x3FFF, var93, false);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field3061[--field3070];
                class159 var96 = class137.method942(125);
                if (var96 != null) {
                    boolean var97 = var96.method1022(var95 & 0x3FFF, var95 >> 28 & 0x3, field3076, (byte) 125, var95 >> 14 & 0x3FFF);
                    if (var97) {
                        field3061[field3070++] = field3076[1];
                        field3061[field3070++] = field3076[2];
                        return;
                    }
                    field3061[field3070++] = -1;
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = -1;
                field3061[field3070++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field3061[--field3070];
                class159 var99 = class137.method942(99);
                if (var99 != null) {
                    boolean var100 = var99.method1024(var98 >> 14 & 0x3FFF, (byte) -88, field3076, var98 & 0x3FFF);
                    if (var100) {
                        field3061[field3070++] = field3076[1];
                        field3061[field3070++] = field3076[2];
                        return;
                    }
                    field3061[field3070++] = -1;
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = -1;
                field3061[field3070++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class202.method1273(field3061[--field3070], true);
                return;
            }
            if (arg0 == 5227) {
                field3070 -= 2;
                int var101 = field3061[field3070];
                int var102 = field3061[field3070 + 1];
                class49.method504((byte) -22, var102 & 0x3FFF, var102 >> 14 & 0x3FFF, var101, true);
                return;
            }
            if (arg0 == 5228) {
                class85.field1074 = field3061[--field3070] == 1;
                return;
            }
            if (arg0 == 5229) {
                field3061[field3070++] = class85.field1074 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field3061[--field3070];
                class165.method1070(true, var103);
                return;
            }
            if (arg0 == 5231) {
                field3070 -= 2;
                int var104 = field3061[field3070];
                boolean var105 = field3061[field3070 + 1] == 1;
                if (class469.field6810 != null) {
                    class383 var106 = class469.field6810.method2022(-1, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method2165(16225);
                        return;
                    }
                    if (var106 == null && var105) {
                        class383 var107 = new class383();
                        class469.field6810.method2019((byte) -38, var107, (long) var104);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field3061[--field3070];
                if (class469.field6810 != null) {
                    class383 var109 = class469.field6810.method2022(-1, (long) var108);
                    field3061[field3070++] = var109 == null ? 0 : 1;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field3070 -= 2;
                int var110 = field3061[field3070];
                boolean var111 = field3061[field3070 + 1] == 1;
                if (class472.field6843 != null) {
                    class383 var112 = class472.field6843.method2022(-1, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method2165(16225);
                        return;
                    }
                    if (var112 == null && var111) {
                        class383 var113 = new class383();
                        class472.field6843.method2019((byte) -68, var113, (long) var110);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field3061[--field3070];
                if (class472.field6843 != null) {
                    class383 var115 = class472.field6843.method2022(-1, (long) var114);
                    field3061[field3070++] = var115 == null ? 0 : 1;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field3061[field3070++] = class241.field3089 == null ? -1 : class241.field3089.field2005;
                return;
            }
            if (arg0 == 5236) {
                field3070 -= 2;
                int var116 = field3061[field3070];
                int var117 = field3061[field3070 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class348.method1999(var116, var118, -2, var119);
                if (var120 < 0) {
                    field3061[field3070++] = -1;
                    return;
                }
                field3061[field3070++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field3070 -= 2;
                int var121 = field3061[field3070];
                int var122 = field3061[field3070 + 1];
                class163.method1052(false, (byte) 99, var122, var121, 3);
                field3061[field3070++] = class24.field347 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class24.field347 != null) {
                    class163.method1052(false, (byte) 46, -1, -1, class407.field5817.field3635);
                }
                return;
            }
            if (arg0 == 5302) {
                class266[] var123 = class69.method612(27420);
                field3061[field3070++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field3061[--field3070];
                class266[] var125 = class69.method612(27420);
                field3061[field3070++] = var125[var124].field3356;
                field3061[field3070++] = var125[var124].field3352;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class407.field5817.field3643;
                int var127 = class407.field5817.field3644;
                int var128 = -1;
                class266[] var129 = class69.method612(27420);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class266 var131 = var129[var130];
                    if (var131.field3356 == var126 && var131.field3352 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field3061[field3070++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field3061[field3070++] = class191.method1184(false);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field3061[--field3070];
                if (var132 >= 1 && var132 <= 2) {
                    class163.method1052(false, (byte) 121, -1, -1, var132);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field3061[field3070++] = class407.field5817.field3635;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field3061[--field3070];
                if (var133 >= 1 && var133 <= 2) {
                    class407.field5817.field3635 = var133;
                    class407.field5817.method578((byte) 57, class219.field2794);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field3066 -= 2;
                String var134 = field3068[field3066];
                String var135 = field3068[field3066 + 1];
                int var136 = field3061[--field3070];
                field3074++;
                class282.method1669(class377.field4958, false);
                class40.field511.method2729(class463.method2733(-90, var134) + class463.method2733(-109, var135) + 1, false);
                class40.field511.method2769(var134, true);
                class40.field511.method2769(var135, true);
                class40.field511.method2729(var136, false);
                return;
            }
            if (arg0 == 5401) {
                field3070 -= 2;
                class534.field7854[field3061[field3070]] = (short) class467.method2818(18739, field3061[field3070 + 1]);
                class376.field4949.method625((byte) 113);
                class376.field4949.method619((byte) -59);
                class390.field5244.method1328((byte) -126);
                class68.method604(-9192);
                return;
            }
            if (arg0 == 5405) {
                field3070 -= 2;
                int var137 = field3061[field3070];
                int var138 = field3061[field3070 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class418.field5941[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field3070 -= 7;
                int var139 = field3061[field3070];
                int var140 = field3061[field3070 + 1] << 1;
                int var141 = field3061[field3070 + 2];
                int var142 = field3061[field3070 + 3];
                int var143 = field3061[field3070 + 4];
                int var144 = field3061[field3070 + 5];
                int var145 = field3061[field3070 + 6];
                if (var139 >= 0 && var139 < 2 && class418.field5941[var139] != null && var140 >= 0 && var140 < class418.field5941[var139].length) {
                    class418.field5941[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class418.field5941[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class418.field5941[field3061[--field3070]].length >> 1;
                field3061[field3070++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class24.field347 != null) {
                    class163.method1052(false, (byte) 121, -1, -1, class407.field5817.field3635);
                }
                if (class123.field1656 != null) {
                    class144.method966(122);
                    System.exit(0);
                    return;
                }
                String var147 = class244.field3159 == null ? class462.method2722(true) : class244.field3159;
                class90.method707(79, class219.field2794, class377.field4959 == 1, false, var147);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class313.field3993 != null) {
                    if (class313.field3993.field1627 == null) {
                        var148 = class298.method1763(class313.field3993.field1631, 1832341912);
                    } else {
                        var148 = (String) class313.field3993.field1627;
                    }
                }
                field3068[field3066++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field3061[field3070++] = class476.field6902 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class24.field347 != null) {
                    class163.method1052(false, (byte) 49, -1, -1, class407.field5817.field3635);
                }
                String var149 = field3068[--field3066];
                boolean var150 = field3061[--field3070] == 1;
                String var151 = class462.method2722(true) + var149;
                class90.method707(87, class219.field2794, class377.field4959 == 1, var150, var151);
                return;
            }
            if (arg0 == 5422) {
                field3066 -= 2;
                String var152 = field3068[field3066];
                String var153 = field3068[field3066 + 1];
                int var154 = field3061[--field3070];
                if (var152.length() > 0) {
                    if (class401.field5709 == null) {
                        class401.field5709 = new String[class155.field1970[class530.field7803.field2104]];
                    }
                    class401.field5709[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class168.field2160 == null) {
                        class168.field2160 = new String[class155.field1970[class530.field7803.field2104]];
                    }
                    class168.field2160[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field3068[--field3066]);
                return;
            }
            if (arg0 == 5424) {
                field3070 -= 11;
                class46.field562 = field3061[field3070];
                class98.field1193 = field3061[field3070 + 1];
                class165.field2106 = field3061[field3070 + 2];
                class48.field611 = field3061[field3070 + 3];
                class196.field2541 = field3061[field3070 + 4];
                class390.field5241 = field3061[field3070 + 5];
                class139.field1782 = field3061[field3070 + 6];
                class471.field6833 = field3061[field3070 + 7];
                class290.field3699 = field3061[field3070 + 8];
                class293.field3746 = field3061[field3070 + 9];
                class473.field6848 = field3061[field3070 + 10];
                class448.field6413.method486(false, class196.field2541);
                class448.field6413.method486(false, class390.field5241);
                class448.field6413.method486(false, class139.field1782);
                class448.field6413.method486(false, class471.field6833);
                class448.field6413.method486(false, class290.field3699);
                class441.field6315 = null;
                class46.field560 = null;
                class467.field6747 = null;
                class168.field2161 = null;
                class251.field3212 = null;
                class170.field2184 = null;
                class3.field34 = null;
                class483.field7061 = null;
                class163.field2075 = true;
                return;
            }
            if (arg0 == 5425) {
                class451.method2690(false);
                class163.field2075 = false;
                return;
            }
            if (arg0 == 5426) {
                field3070 -= 2;
                class298.field3838 = field3061[field3070];
                class421.field5976 = field3061[field3070 + 1];
                return;
            }
            if (arg0 == 5427) {
                field3070 -= 2;
                class501.field7238 = field3061[field3070 + 1];
                return;
            }
            if (arg0 == 5428) {
                field3070 -= 2;
                int var155 = field3061[field3070];
                int var156 = field3061[field3070 + 1];
                field3061[field3070++] = class227.method1379((byte) -10, var155, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class211.method1307(-31081, field3068[--field3066], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class114.method825("accountcreated", 13324, class219.field2794.field6891);
                    return;
                } catch (Throwable var277) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field3070 -= 4;
                int var157 = field3061[field3070];
                int var158 = field3061[field3070 + 1];
                int var159 = field3061[field3070 + 2];
                int var160 = field3061[field3070 + 3];
                class516.method3081((var157 >> 14 & 0x3FFF) - class441.field6317, var159, var160, (var157 & 0x3FFF) - class320.field4064, var158, 64, false);
                return;
            }
            if (arg0 == 5501) {
                field3070 -= 4;
                int var161 = field3061[field3070];
                int var162 = field3061[field3070 + 1];
                int var163 = field3061[field3070 + 2];
                int var164 = field3061[field3070 + 3];
                class113.method823(var164, var162, (var161 >> 14 & 0x3FFF) - class441.field6317, var163, (var161 & 0x3FFF) - class320.field4064, 0);
                return;
            }
            if (arg0 == 5502) {
                field3070 -= 6;
                int var165 = field3061[field3070];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class524.field7754 = var165;
                int var166 = field3061[field3070 + 1];
                if (var166 + 1 >= class418.field5941[class524.field7754].length >> 1) {
                    throw new RuntimeException();
                }
                class325.field4124 = var166;
                class204.field2665 = 0;
                class98.field1192 = field3061[field3070 + 2];
                class353.field4541 = field3061[field3070 + 3];
                int var167 = field3061[field3070 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class60.field784 = var167;
                int var168 = field3061[field3070 + 5];
                if (var168 + 1 >= class418.field5941[class60.field784].length >> 1) {
                    throw new RuntimeException();
                }
                class198.field2582 = var168;
                class142.field1835 = 3;
                return;
            }
            if (arg0 == 5503) {
                class349.method2007(1);
                return;
            }
            if (arg0 == 5504) {
                field3070 -= 2;
                class189.method1183(0, field3061[field3070], field3061[field3070 + 1], 2);
                return;
            }
            if (arg0 == 5505) {
                field3061[field3070++] = (int) class49.field629 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field3061[field3070++] = (int) class463.field6626 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class296.method1743(33985);
                return;
            }
            if (arg0 == 5508) {
                class521.method3095((byte) 55);
                return;
            }
            if (arg0 == 5509) {
                class186.method1171(58);
                return;
            }
            if (arg0 == 5510) {
                class379.method2154((byte) 105);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field3061[--field3070];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class441.field6317;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class452.field6526) {
                    var172 = class452.field6526;
                }
                int var173 = var171 - class320.field4064;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class440.field6307) {
                    var173 = class440.field6307;
                }
                class238.field3047 = (var172 << 7) + 64;
                class527.field7783 = (var173 << 7) + 64;
                class142.field1835 = 4;
                return;
            }
            if (arg0 == 5512) {
                class431.method2522(22876);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field3066 -= 2;
                String var174 = field3068[field3066];
                String var175 = field3068[field3066 + 1];
                int var176 = field3061[--field3070];
                if (class483.field7059 != 2) {
                    return;
                }
                if (class495.field7198 == 0 && class533.field7846 == 0) {
                    class493.field7171 = var174;
                    class361.field4657 = var175;
                    class233.field2976 = var176;
                    class284.method1677(-20429, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class153.method1004((byte) 103);
                return;
            }
            if (arg0 == 5602) {
                if (class495.field7198 == 0) {
                    class25.field361 = -2;
                    class320.field4062 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field3070 -= 4;
                if (class483.field7059 != 2) {
                    return;
                }
                if (class495.field7198 == 0 && class533.field7846 == 0) {
                    class145.method976(field3061[field3070 + 2], field3061[field3070 + 1], field3061[field3070 + 3], -126, field3061[field3070]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field3066--;
                if (class483.field7059 != 2) {
                    return;
                }
                if (class495.field7198 == 0 && class533.field7846 == 0) {
                    class428.method2507((byte) 123, class250.method1516(field3068[field3066], (byte) -111));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field3066 -= 3;
                field3070 -= 7;
                if (class483.field7059 != 2) {
                    return;
                }
                if (class495.field7198 == 0 && class533.field7846 == 0) {
                    class46.method450(field3068[field3066 + 2], false, class250.method1516(field3068[field3066], (byte) -88), field3061[field3070 + 2], -120, field3061[field3070 + 1], field3061[field3070 + 4] == 1, field3061[field3070 + 3], field3068[field3066 + 1], field3061[field3070 + 6] == 1, field3061[field3070 + 5] == 1, field3061[field3070]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class533.field7846 == 0) {
                    class45.field539 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field3061[field3070++] = class320.field4062;
                return;
            }
            if (arg0 == 5608) {
                field3061[field3070++] = class462.field6605;
                return;
            }
            if (arg0 == 5609) {
                field3061[field3070++] = class45.field539;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field3068[field3066++] = class528.field7787.length > var177 ? class469.method2827(-1, class528.field7787[var177]) : "";
                }
                class528.field7787 = null;
                return;
            }
            if (arg0 == 5611) {
                field3061[field3070++] = class50.field663;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field3061[--field3070];
                if (class483.field7059 != 6) {
                    return;
                }
                if (class495.field7198 == 0 && class533.field7846 == 0) {
                    if (class64.field835 != null) {
                        class64.field835.method2473(10228);
                        class64.field835 = null;
                    }
                    class233.field2976 = var178;
                    class284.method1677(-20429, 8);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field3061[field3070++] = class320.field4062;
                return;
            }
            if (arg0 == 5615) {
                field3066 -= 2;
                String var179 = field3068[field3066];
                String var180 = field3068[field3066 + 1];
                if (class483.field7059 != 2) {
                    return;
                }
                if (class495.field7198 == 0 && class533.field7846 == 0) {
                    if (class64.field835 != null) {
                        class64.field835.method2473(10228);
                        class64.field835 = null;
                    }
                    class493.field7171 = var179;
                    class361.field4657 = var180;
                    class284.method1677(-20429, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class461.method2721((byte) -76, false);
                return;
            }
            if (arg0 == 5617) {
                field3061[field3070++] = class25.field361;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field3061[--field3070];
                class200.method1260(var181, false, (byte) -119);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field3061[--field3070];
                class200.method1260(var182, true, (byte) -121);
                return;
            }
            if (arg0 == 5620) {
                class498.method3006((byte) 77);
                if (class139.field1796 != "" && class139.field1796 != "") {
                    field3061[field3070++] = 1;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field3066 -= 3;
                field3070 -= 7;
                if (class483.field7059 != 2) {
                    return;
                }
                if (class495.field7198 == 0 && class533.field7846 == 0) {
                    class46.method450(field3068[field3066 + 2], true, class250.method1516(field3068[field3066], (byte) -95), field3061[field3070 + 2], -117, field3061[field3070 + 1], field3061[field3070 + 4] == 1, field3061[field3070 + 3], field3068[field3066 + 1], field3061[field3070 + 6] == 1, field3061[field3070 + 5] == 1, field3061[field3070]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class121 var183 = class219.field2794.method2882("3", false, (byte) -59);
                while (var183.field1628 == 0) {
                    class199.method1251(1L, (byte) 112);
                }
                if (var183.field1628 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class210 var184 = (class210) var183.field1627;
                if (var184.method1302(0).exists()) {
                    class463 var185 = new class463(50);
                    try {
                        var184.method1301(1, var185.field6618, 50, 0);
                    } catch (IOException var279) {
                    }
                }
                try {
                    var184.method1303((byte) -66);
                    return;
                } catch (Exception var278) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field3061[--field3070];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class407.field5817.field3655 = var186;
                class384.method2171(-122);
                class407.field5817.method578((byte) 126, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6002) {
                class407.field5817.method581(0, field3061[--field3070] == 1);
                class384.method2171(-119);
                class211.method1310(true);
                class407.field5817.method578((byte) 96, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6003) {
                class407.field5817.field3622 = field3061[--field3070] == 1;
                class211.method1310(true);
                class407.field5817.method578((byte) 36, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6005) {
                class407.field5817.field3618 = field3061[--field3070] == 1;
                class384.method2171(-39);
                class407.field5817.method578((byte) 21, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6006) {
                class407.field5817.field3634 = field3061[--field3070] == 1;
                class33.field416.method346(!class407.field5817.field3634);
                class407.field5817.method578((byte) 21, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6007) {
                class407.field5817.field3639 = field3061[--field3070];
                class407.field5817.method578((byte) 114, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6008) {
                class407.field5817.field3652 = field3061[--field3070] == 1;
                class407.field5817.method578((byte) 69, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6009) {
                class407.field5817.field3617 = field3061[--field3070] == 1;
                class384.method2171(-23);
                class407.field5817.method578((byte) 41, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6010) {
                class407.field5817.field3616 = field3061[--field3070] == 1;
                class407.field5817.method578((byte) 104, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field3061[--field3070];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class407.field5817.method1683(127, class377.field4959, var187);
                class384.method2171(-29);
                class407.field5817.method578((byte) 120, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6012) {
                class407.field5817.method1679(class377.field4959, field3061[--field3070] == 1, (byte) -50);
                class237.method1426(1);
                class38.method340(-21936);
                class407.field5817.method578((byte) 80, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6014) {
                class407.field5817.field3623 = field3061[--field3070] == 1;
                class384.method2171(-83);
                class407.field5817.method578((byte) 115, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6015) {
                class407.field5817.field3636 = field3061[--field3070] == 1;
                class384.method2171(-53);
                class407.field5817.method578((byte) 31, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field3061[--field3070];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class407.field5817.field3621 = var188;
                class53.method525(119, class377.field4959);
                class407.field5817.method578((byte) 10, class219.field2794);
                return;
            }
            if (arg0 == 6017) {
                class407.field5817.field3620 = field3061[--field3070] == 1;
                class492.method2984((byte) -72);
                class407.field5817.method578((byte) 17, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field3061[--field3070];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class407.field5817.field3619 = var189;
                class407.field5817.method578((byte) 110, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field3061[--field3070];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class407.field5817.field3629 != var190) {
                    if (class407.field5817.field3629 == 0 && class387.field5085 != -1) {
                        class1.method3(class530.field7806, 74, 0, false, var190, class387.field5085);
                        class45.field538 = false;
                    } else if (var190 == 0) {
                        class515.method3077((byte) -53);
                        class45.field538 = false;
                    } else {
                        class328.method1914(var190, -19373);
                    }
                    class407.field5817.field3629 = var190;
                }
                class407.field5817.method578((byte) 109, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field3061[--field3070];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class407.field5817.field3630 = var191;
                class407.field5817.method578((byte) 118, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6021) {
                class407.field5817.field845 = field3061[--field3070] == 1;
                class211.method1310(true);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field3061[--field3070];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class105.field1333 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class410.method2436(57, var192);
                class407.field5817.method578((byte) 114, class219.field2794);
                class236.field3006 = false;
                field3061[field3070++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field3061[--field3070];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class407.field5817.field3626 = var194;
                class407.field5817.method578((byte) 55, class219.field2794);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field3061[--field3070];
                if (var195 < 0 || var195 > class496.method2999(true, class105.field1333)) {
                    var195 = 0;
                }
                class407.field5817.field3624 = var195;
                class407.field5817.method578((byte) 119, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field3061[--field3070];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class176.method1131(var196 == 1, -95);
                return;
            }
            if (arg0 == 6028) {
                class407.field5817.field3627 = field3061[--field3070] != 0;
                class407.field5817.method578((byte) 9, class219.field2794);
                return;
            }
            if (arg0 == 6029) {
                class407.field5817.field3639 = field3061[--field3070];
                class407.field5817.method578((byte) 97, class219.field2794);
                return;
            }
            if (arg0 == 6030) {
                class407.field5817.field3654 = field3061[--field3070] != 0;
                class407.field5817.method578((byte) 89, class219.field2794);
                class384.method2171(-20);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field3061[--field3070];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class53.method525(91, var197);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field3061[--field3070];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class407.field5817.field3656 = var198;
                class407.field5817.method578((byte) 26, class219.field2794);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field3061[--field3070];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class407.field5817.field3648 = var199;
                class407.field5817.method578((byte) 102, class219.field2794);
                return;
            }
            if (arg0 == 6034) {
                class407.field5817.field3625 = field3061[--field3070] == 1;
                class407.field5817.method578((byte) 115, class219.field2794);
                class237.method1426(1);
                class236.field3006 = false;
                return;
            }
            if (arg0 == 6035) {
                class407.field5817.field847 = field3061[--field3070] == 1;
                class384.method2171(-90);
                class211.method1310(true);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field3061[field3070++] = class407.field5817.field3655;
                return;
            }
            if (arg0 == 6102) {
                field3061[field3070++] = class407.field5817.method577(class377.field4959, (byte) 65) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field3061[field3070++] = class407.field5817.field3622 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field3061[field3070++] = class407.field5817.field3618 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field3061[field3070++] = class407.field5817.field3634 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field3061[field3070++] = class407.field5817.field3639;
                return;
            }
            if (arg0 == 6108) {
                field3061[field3070++] = class407.field5817.field3652 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field3061[field3070++] = class407.field5817.field3617 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field3061[field3070++] = class407.field5817.field3616 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field3061[field3070++] = class407.field5817.method1681(class377.field4959, -28198);
                return;
            }
            if (arg0 == 6112) {
                field3061[field3070++] = class407.field5817.method1684(-2, class377.field4959) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field3061[field3070++] = class407.field5817.field3623 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field3061[field3070++] = class407.field5817.field3636 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field3061[field3070++] = class407.field5817.field3621;
                return;
            }
            if (arg0 == 6117) {
                field3061[field3070++] = class407.field5817.field3620 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field3061[field3070++] = class407.field5817.field3619;
                return;
            }
            if (arg0 == 6119) {
                field3061[field3070++] = class407.field5817.field3629;
                return;
            }
            if (arg0 == 6120) {
                field3061[field3070++] = class407.field5817.field3630;
                return;
            }
            if (arg0 == 6121) {
                field3061[field3070++] = class33.field416.method356() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field3061[field3070++] = class451.method2689(-17524);
                return;
            }
            if (arg0 == 6124) {
                field3061[field3070++] = class407.field5817.field3626;
                return;
            }
            if (arg0 == 6125) {
                field3061[field3070++] = class407.field5817.field3624;
                return;
            }
            if (arg0 == 6126) {
                field3061[field3070++] = class33.field416.method293() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field3061[field3070++] = class407.field5817.field3640 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field3061[field3070++] = class407.field5817.field3627 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field3061[field3070++] = class407.field5817.field3639;
                return;
            }
            if (arg0 == 6130) {
                field3061[field3070++] = class407.field5817.field3654 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field3061[field3070++] = class377.field4959;
                return;
            }
            if (arg0 == 6132) {
                field3061[field3070++] = class407.field5817.field3656;
                return;
            }
            if (arg0 == 6133) {
                field3061[field3070++] = class476.field6902 == 1 || class476.field6902 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field3061[field3070++] = class496.method2999(true, class105.field1333);
                return;
            }
            if (arg0 == 6135) {
                field3061[field3070++] = class407.field5817.field3648;
                return;
            }
            if (arg0 == 6136) {
                field3061[field3070++] = class407.field5817.field3625 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var280) {
                }
                field3061[field3070++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field3070 -= 2;
                class24.field349 = (short) field3061[field3070];
                if (class24.field349 <= 0) {
                    class24.field349 = 256;
                }
                class282.field3586 = (short) field3061[field3070 + 1];
                if (class282.field3586 <= 0) {
                    class282.field3586 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field3070 -= 2;
                class63.field827 = (short) field3061[field3070];
                if (class63.field827 <= 0) {
                    class63.field827 = 256;
                }
                class470.field6819 = (short) field3061[field3070 + 1];
                if (class470.field6819 <= 0) {
                    class470.field6819 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field3070 -= 4;
                class362.field4667 = (short) field3061[field3070];
                if (class362.field4667 <= 0) {
                    class362.field4667 = 1;
                }
                class109.field1477 = (short) field3061[field3070 + 1];
                if (class109.field1477 <= 0) {
                    class109.field1477 = 32767;
                } else if (class109.field1477 < class362.field4667) {
                    class109.field1477 = class362.field4667;
                }
                class346.field4449 = (short) field3061[field3070 + 2];
                if (class346.field4449 <= 0) {
                    class346.field4449 = 1;
                }
                class453.field6538 = (short) field3061[field3070 + 3];
                if (class453.field6538 <= 0) {
                    class453.field6538 = 32767;
                    return;
                }
                if (class453.field6538 < class346.field4449) {
                    class453.field6538 = class346.field4449;
                }
                return;
            }
            if (arg0 == 6203) {
                class186.method1168(0, class46.field561.field7617, false, 0, (byte) -24, class46.field561.field7574);
                field3061[field3070++] = class191.field2486;
                field3061[field3070++] = class380.field5001;
                return;
            }
            if (arg0 == 6204) {
                field3061[field3070++] = class63.field827;
                field3061[field3070++] = class470.field6819;
                return;
            }
            if (arg0 == 6205) {
                field3061[field3070++] = class24.field349;
                field3061[field3070++] = class282.field3586;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field3061[field3070++] = (int) (class504.method3034((byte) -123) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field3061[field3070++] = (int) (class504.method3034((byte) -112) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field3070 -= 3;
                int var201 = field3061[field3070];
                int var202 = field3061[field3070 + 1];
                int var203 = field3061[field3070 + 2];
                field3063.clear();
                field3063.set(11, 12);
                field3063.set(var203, var202, var201);
                field3061[field3070++] = (int) (field3063.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field3063.clear();
                field3063.setTime(new Date(class504.method3034((byte) -99)));
                field3061[field3070++] = field3063.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var204 = field3061[--field3070];
                boolean var205 = true;
                if (var204 < 0) {
                    var205 = (var204 + 1) % 4 == 0;
                } else if (var204 < 1582) {
                    var205 = var204 % 4 == 0;
                } else if (var204 % 4 != 0) {
                    var205 = false;
                } else if (var204 % 100 != 0) {
                    var205 = true;
                } else if (var204 % 400 != 0) {
                    var205 = false;
                }
                field3061[field3070++] = var205 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field3061[field3070++] = class238.method1431(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field3061[field3070++] = class36.method258((byte) -108) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class483.field7059 == 6 && class495.field7198 == 0 && class533.field7846 == 0) {
                    if (class422.field5983) {
                        field3061[field3070++] = 0;
                        return;
                    }
                    if (class133.field1733 > class504.method3034((byte) -114) - 1000L) {
                        field3061[field3070++] = 1;
                        return;
                    }
                    class422.field5983 = true;
                    class282.method1669(class174.field2271, false);
                    class40.field511.method2777(class496.field7201, -11);
                    field3061[field3070++] = 0;
                    return;
                }
                field3061[field3070++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class254 var206 = class245.method1492((byte) 59);
                if (var206 != null) {
                    field3061[field3070++] = var206.field3236;
                    field3061[field3070++] = var206.field2702;
                    field3068[field3066++] = var206.field3238;
                    class20 var207 = var206.method1529(-18827);
                    field3061[field3070++] = var207.field289;
                    field3068[field3066++] = var207.field286;
                    field3061[field3070++] = var206.field2700;
                    field3061[field3070++] = var206.field3244;
                    field3068[field3066++] = var206.field3237;
                    return;
                }
                field3061[field3070++] = -1;
                field3061[field3070++] = 0;
                field3068[field3066++] = "";
                field3061[field3070++] = 0;
                field3068[field3066++] = "";
                field3061[field3070++] = 0;
                field3061[field3070++] = 0;
                field3068[field3066++] = "";
                return;
            }
            if (arg0 == 6502) {
                class254 var208 = class273.method1616(false);
                if (var208 != null) {
                    field3061[field3070++] = var208.field3236;
                    field3061[field3070++] = var208.field2702;
                    field3068[field3066++] = var208.field3238;
                    class20 var209 = var208.method1529(-18827);
                    field3061[field3070++] = var209.field289;
                    field3068[field3066++] = var209.field286;
                    field3061[field3070++] = var208.field2700;
                    field3061[field3070++] = var208.field3244;
                    field3068[field3066++] = var208.field3237;
                    return;
                }
                field3061[field3070++] = -1;
                field3061[field3070++] = 0;
                field3068[field3066++] = "";
                field3061[field3070++] = 0;
                field3068[field3066++] = "";
                field3061[field3070++] = 0;
                field3061[field3070++] = 0;
                field3068[field3066++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var210 = field3061[--field3070];
                String var211 = field3068[--field3066];
                if (class483.field7059 == 6 && class495.field7198 == 0 && class533.field7846 == 0) {
                    field3061[field3070++] = class152.method994((byte) -107, var210, var211) ? 1 : 0;
                    return;
                }
                field3061[field3070++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class407.field5817.field3650 = field3061[--field3070];
                class407.field5817.method578((byte) 30, class219.field2794);
                return;
            }
            if (arg0 == 6505) {
                field3061[field3070++] = class407.field5817.field3650;
                return;
            }
            if (arg0 == 6506) {
                int var212 = field3061[--field3070];
                class254 var213 = class534.method3161(var212, 16);
                if (var213 != null) {
                    field3061[field3070++] = var213.field2702;
                    field3068[field3066++] = var213.field3238;
                    class20 var214 = var213.method1529(-18827);
                    field3061[field3070++] = var214.field289;
                    field3068[field3066++] = var214.field286;
                    field3061[field3070++] = var213.field2700;
                    field3061[field3070++] = var213.field3244;
                    field3068[field3066++] = var213.field3237;
                    return;
                }
                field3061[field3070++] = -1;
                field3068[field3066++] = "";
                field3061[field3070++] = 0;
                field3068[field3066++] = "";
                field3061[field3070++] = 0;
                field3061[field3070++] = 0;
                field3068[field3066++] = "";
                return;
            }
            if (arg0 == 6507) {
                field3070 -= 4;
                int var215 = field3061[field3070];
                boolean var216 = field3061[field3070 + 1] == 1;
                int var217 = field3061[field3070 + 2];
                boolean var218 = field3061[field3070 + 3] == 1;
                class245.method1496(var217, var216, var215, false, var218);
                return;
            }
            if (arg0 == 6508) {
                class455.method2706(126);
                return;
            }
            if (arg0 == 6509) {
                if (class483.field7059 != 6) {
                    return;
                }
                class304.field3897 = field3061[--field3070] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class407.field5817.field3615 = field3061[--field3070] == 1;
                class407.field5817.method578((byte) 20, class219.field2794);
                return;
            }
            if (arg0 == 6601) {
                field3061[field3070++] = class407.field5817.field3615 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class438.field6289 == class411.field5865) {
            if (arg0 == 6700) {
                int var219 = class397.field5684.method2025(-30075);
                if (class277.field3510 != -1) {
                    var219++;
                }
                field3061[field3070++] = var219;
                return;
            }
            if (arg0 == 6701) {
                int var220 = field3061[--field3070];
                if (class277.field3510 != -1) {
                    if (var220 == 0) {
                        field3061[field3070++] = class277.field3510;
                        return;
                    }
                    var220--;
                }
                class175 var221 = (class175) class397.field5684.method2021(-35);
                while (var220-- > 0) {
                    var221 = (class175) class397.field5684.method2017(-80);
                }
                field3061[field3070++] = var221.field2279;
                return;
            }
            if (arg0 == 6702) {
                int var222 = field3061[--field3070];
                if (class293.field3725[var222] == null) {
                    field3068[field3066++] = "";
                    return;
                }
                String var223 = class293.field3725[var222][0].field7568;
                if (var223 == null) {
                    field3068[field3066++] = "";
                    return;
                }
                field3068[field3066++] = var223.substring(0, var223.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var224 = field3061[--field3070];
                if (class293.field3725[var224] == null) {
                    field3061[field3070++] = 0;
                    return;
                }
                field3061[field3070++] = class293.field3725[var224].length;
                return;
            }
            if (arg0 == 6704) {
                field3070 -= 2;
                int var225 = field3061[field3070];
                int var226 = field3061[field3070 + 1];
                if (class293.field3725[var225] == null) {
                    field3068[field3066++] = "";
                    return;
                }
                String var227 = class293.field3725[var225][var226].field7568;
                if (var227 == null) {
                    field3068[field3066++] = "";
                    return;
                }
                field3068[field3066++] = var227;
                return;
            }
            if (arg0 == 6705) {
                field3070 -= 2;
                int var228 = field3061[field3070];
                int var229 = field3061[field3070 + 1];
                if (class293.field3725[var228] == null) {
                    field3061[field3070++] = 0;
                    return;
                }
                field3061[field3070++] = class293.field3725[var228][var229].field7695;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field3070 -= 3;
                int var230 = field3061[field3070];
                int var231 = field3061[field3070 + 1];
                int var232 = field3061[field3070 + 2];
                class321.method1887(var230 << 16 | var231, "", var232, 1, 112);
                return;
            }
            if (arg0 == 6708) {
                field3070 -= 3;
                int var233 = field3061[field3070];
                int var234 = field3061[field3070 + 1];
                int var235 = field3061[field3070 + 2];
                class321.method1887(var233 << 16 | var234, "", var235, 2, 111);
                return;
            }
            if (arg0 == 6709) {
                field3070 -= 3;
                int var236 = field3061[field3070];
                int var237 = field3061[field3070 + 1];
                int var238 = field3061[field3070 + 2];
                class321.method1887(var236 << 16 | var237, "", var238, 3, 106);
                return;
            }
            if (arg0 == 6710) {
                field3070 -= 3;
                int var239 = field3061[field3070];
                int var240 = field3061[field3070 + 1];
                int var241 = field3061[field3070 + 2];
                class321.method1887(var239 << 16 | var240, "", var241, 4, 111);
                return;
            }
            if (arg0 == 6711) {
                field3070 -= 3;
                int var242 = field3061[field3070];
                int var243 = field3061[field3070 + 1];
                int var244 = field3061[field3070 + 2];
                class321.method1887(var242 << 16 | var243, "", var244, 5, 15);
                return;
            }
            if (arg0 == 6712) {
                field3070 -= 3;
                int var245 = field3061[field3070];
                int var246 = field3061[field3070 + 1];
                int var247 = field3061[field3070 + 2];
                class321.method1887(var245 << 16 | var246, "", var247, 6, 69);
                return;
            }
            if (arg0 == 6713) {
                field3070 -= 3;
                int var248 = field3061[field3070];
                int var249 = field3061[field3070 + 1];
                int var250 = field3061[field3070 + 2];
                class321.method1887(var248 << 16 | var249, "", var250, 7, 21);
                return;
            }
            if (arg0 == 6714) {
                field3070 -= 3;
                int var251 = field3061[field3070];
                int var252 = field3061[field3070 + 1];
                int var253 = field3061[field3070 + 2];
                class321.method1887(var251 << 16 | var252, "", var253, 8, 121);
                return;
            }
            if (arg0 == 6715) {
                field3070 -= 3;
                int var254 = field3061[field3070];
                int var255 = field3061[field3070 + 1];
                int var256 = field3061[field3070 + 2];
                class321.method1887(var254 << 16 | var255, "", var256, 9, 10);
                return;
            }
            if (arg0 == 6716) {
                field3070 -= 3;
                int var257 = field3061[field3070];
                int var258 = field3061[field3070 + 1];
                int var259 = field3061[field3070 + 2];
                class321.method1887(var257 << 16 | var258, "", var259, 10, 29);
                return;
            }
            if (arg0 == 6717) {
                field3070 -= 3;
                int var260 = field3061[field3070];
                int var261 = field3061[field3070 + 1];
                int var262 = field3061[field3070 + 2];
                class523 var263 = class202.method1268(var260 << 16 | var261, var262, 0);
                class379.method2156(true);
                class73 var264 = client.method1226(var263);
                class40.method380(var263, 0, var264.field937, var264.method644((byte) 51));
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var265 = field3061[--field3070];
                class36 var266 = class505.field7281.method1620(var265, 36);
                if (var266.field451 == null) {
                    field3068[field3066++] = "";
                    return;
                }
                field3068[field3066++] = var266.field451;
                return;
            }
            if (arg0 == 6801) {
                int var267 = field3061[--field3070];
                class36 var268 = class505.field7281.method1620(var267, 36);
                field3061[field3070++] = var268.field477;
                return;
            }
            if (arg0 == 6802) {
                int var269 = field3061[--field3070];
                class36 var270 = class505.field7281.method1620(var269, 36);
                field3061[field3070++] = var270.field481;
                return;
            }
            if (arg0 == 6803) {
                int var271 = field3061[--field3070];
                class36 var272 = class505.field7281.method1620(var271, 36);
                field3061[field3070++] = var272.field483;
                return;
            }
            if (arg0 == 6804) {
                field3070 -= 2;
                int var273 = field3061[field3070];
                int var274 = field3061[field3070 + 1];
                class172 var275 = class199.field2592.method2579((byte) 114, var274);
                if (var275.method1095((byte) -63)) {
                    field3068[field3066++] = class505.field7281.method1620(var273, 36).method264(var275.field2192, (byte) 16, var274);
                    return;
                }
                field3061[field3070++] = class505.field7281.method1620(var273, 36).method262(-5, var275.field2188, var274);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field3061[field3070++] = class293.field3726 && !class284.field3608 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field3061[field3070++] = class306.field3905;
                return;
            }
            if (arg0 == 6902) {
                field3061[field3070++] = class437.field6260;
                return;
            }
            if (arg0 == 6903) {
                field3061[field3070++] = class261.field3306;
                return;
            }
            if (arg0 == 6904) {
                field3061[field3070++] = class18.field263;
                return;
            }
            if (arg0 == 6905) {
                String var276 = "";
                if (class313.field3993 != null) {
                    if (class313.field3993.field1627 == null) {
                        var276 = class298.method1763(class313.field3993.field1631, 1832341912);
                    } else {
                        var276 = (String) class313.field3993.field1627;
                    }
                }
                field3068[field3066++] = var276;
                return;
            }
            if (arg0 == 6906) {
                field3061[field3070++] = class223.field2858;
                return;
            }
            if (arg0 == 6907) {
                field3061[field3070++] = class297.field3822;
                return;
            }
            if (arg0 == 6908) {
                field3061[field3070++] = class204.field2663;
                return;
            }
            if (arg0 == 6909) {
                field3061[field3070++] = class402.field5731 ? 1 : 0;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }
}
