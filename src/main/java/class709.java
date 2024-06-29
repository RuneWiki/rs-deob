import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class709 {

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "[Lvv;")
    private static class326[] field9974 = new class326[50];

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "[I")
    private static int[] field9972 = new int[1000];

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field9986 = new String[1000];

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    private static int field9970 = 0;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "[[I")
    private static int[][] field9985 = new int[5][5000];

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    private static int field9983 = 0;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    private static int field9987 = 0;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "[I")
    private static int[] field9968 = new int[5];

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Ljava/util/Calendar;")
    private static Calendar field9967 = Calendar.getInstance();

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "[I")
    private static int[] field9993 = new int[3];

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field9994 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "Ljt;")
    public static class106 field9992 = new class106(4);

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
    private static int field9995 = 0;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field9975;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "Lsca;")
    private static class46 field9988;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "Lsca;")
    private static class46 field9989;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "Lvga;")
    private static class86 field9991;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "[I")
    private static int[] field9981;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "[Ljava/lang/String;")
    private static String[] field9969;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)V")
    private static final void method4024(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field9987 -= 3;
                int var2 = field9972[field9987];
                int var3 = field9972[field9987 + 1];
                int var4 = field9972[field9987 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class46 var5 = class405.method2580(var2, 85);
                if (var5.field621 == null) {
                    var5.field621 = new class46[var4 + 1];
                }
                if (var5.field621.length <= var4) {
                    class46[] var6 = new class46[var4 + 1];
                    for (int var7 = 0; var7 < var5.field621.length; var7++) {
                        var6[var7] = var5.field621[var7];
                    }
                    var5.field621 = var6;
                }
                if (var4 > 0 && var5.field621[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class46 var8 = new class46();
                var8.field577 = var3;
                var8.field557 = var8.field610 = var5.field610;
                var8.field603 = var4;
                var5.field621[var4] = var8;
                if (arg1) {
                    field9988 = var8;
                } else {
                    field9989 = var8;
                }
                class673.method3850(var5, (byte) -86);
                return;
            }
            if (arg0 == 101) {
                class46 var9 = arg1 ? field9988 : field9989;
                if (var9.field603 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class46 var10 = class405.method2580(var9.field610, -44);
                var10.field621[var9.field603] = null;
                class673.method3850(var10, (byte) 118);
                return;
            }
            if (arg0 == 102) {
                class46 var11 = class405.method2580(field9972[--field9987], 87);
                var11.field621 = null;
                class673.method3850(var11, (byte) 124);
                return;
            }
            if (arg0 == 200) {
                field9987 -= 2;
                int var12 = field9972[field9987];
                int var13 = field9972[field9987 + 1];
                class46 var14 = class700.method3972(var12, var13, true);
                if (var14 != null && var13 != -1) {
                    field9972[field9987++] = 1;
                    if (arg1) {
                        field9988 = var14;
                        return;
                    }
                    field9989 = var14;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field9972[--field9987];
                class46 var16 = class405.method2580(var15, -85);
                if (var16 != null) {
                    field9972[field9987++] = 1;
                    if (arg1) {
                        field9988 = var16;
                        return;
                    }
                    field9989 = var16;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field9972[--field9987];
                method4026(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field9972[--field9987];
                method4038(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field9987 -= 2;
                int var19 = field9972[field9987];
                int var20 = field9972[field9987 + 1];
                if (class130.field1749.field9495 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class571.field8080.length; var21++) {
                    if (class571.field8080[var21] == var19) {
                        class130.field1749.field9495.method2487(var20, 0, class582.field8291, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class566.field8047.length; var22++) {
                    if (class566.field8047[var22] == var19) {
                        class130.field1749.field9495.method2487(var20, 0, class582.field8291, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field9987 -= 2;
                int var23 = field9972[field9987];
                int var24 = field9972[field9987 + 1];
                if (class130.field1749.field9495 == null) {
                    return;
                }
                class130.field1749.field9495.method2483(var24, true, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field9972[--field9987] != 0;
                if (class130.field1749.field9495 == null) {
                    return;
                }
                class130.field1749.field9495.method2482(var25, 87);
                return;
            }
            if (arg0 == 411) {
                field9987 -= 2;
                int var26 = field9972[field9987];
                int var27 = field9972[field9987 + 1];
                if (class130.field1749.field9495 == null) {
                    return;
                }
                class130.field1749.field9495.method2480(var26, class336.field4876, var27, 17322);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class46 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class405.method2580(field9972[--field9987], -106);
            } else {
                var28 = arg1 ? field9988 : field9989;
            }
            if (arg0 == 1000) {
                field9987 -= 4;
                var28.field681 = field9972[field9987];
                var28.field642 = field9972[field9987 + 1];
                int var29 = field9972[field9987 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field9972[field9987 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field625 = (byte) var29;
                var28.field637 = (byte) var30;
                class673.method3850(var28, (byte) -89);
                class435.method2700(121, var28);
                if (var28.field603 == -1) {
                    class415.method2627(11, var28.field610);
                }
                return;
            }
            if (arg0 == 1001) {
                field9987 -= 4;
                var28.field665 = field9972[field9987];
                var28.field658 = field9972[field9987 + 1];
                var28.field659 = 0;
                var28.field531 = 0;
                int var31 = field9972[field9987 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field9972[field9987 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field565 = (byte) var31;
                var28.field571 = (byte) var32;
                class673.method3850(var28, (byte) 88);
                class435.method2700(100, var28);
                if (var28.field577 == 0) {
                    class256.method1679(var28, 0, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field9972[--field9987] == 1;
                if (var28.field682 != var33) {
                    var28.field682 = var33;
                    class673.method3850(var28, (byte) -98);
                }
                if (var28.field603 == -1) {
                    class650.method3776(var28.field610, (byte) -114);
                }
                return;
            }
            if (arg0 == 1004) {
                field9987 -= 2;
                var28.field640 = field9972[field9987];
                var28.field533 = field9972[field9987 + 1];
                class673.method3850(var28, (byte) -50);
                class435.method2700(117, var28);
                if (var28.field577 == 0) {
                    class256.method1679(var28, 0, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field641 = field9972[--field9987] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class46 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class405.method2580(field9972[--field9987], -64);
            } else {
                var34 = arg1 ? field9988 : field9989;
            }
            if (arg0 == 1100) {
                field9987 -= 2;
                var34.field527 = field9972[field9987];
                if (var34.field527 > var34.field569 - var34.field549) {
                    var34.field527 = var34.field569 - var34.field549;
                }
                if (var34.field527 < 0) {
                    var34.field527 = 0;
                }
                var34.field554 = field9972[field9987 + 1];
                if (var34.field554 > var34.field573 - var34.field574) {
                    var34.field554 = var34.field573 - var34.field574;
                }
                if (var34.field554 < 0) {
                    var34.field554 = 0;
                }
                class673.method3850(var34, (byte) 99);
                if (var34.field603 == -1) {
                    class22.method119(var34.field610, (byte) -113);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field592 = field9972[--field9987];
                class673.method3850(var34, (byte) 107);
                if (var34.field603 == -1) {
                    class673.method3851((byte) 45, var34.field610);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field555 = field9972[--field9987] == 1;
                class673.method3850(var34, (byte) -68);
                return;
            }
            if (arg0 == 1103) {
                var34.field652 = field9972[--field9987];
                class673.method3850(var34, (byte) -115);
                return;
            }
            if (arg0 == 1104) {
                var34.field518 = field9972[--field9987];
                class673.method3850(var34, (byte) -106);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field9972[--field9987];
                if (var34.field633 != var35) {
                    var34.field633 = var35;
                    class673.method3850(var34, (byte) -108);
                }
                if (var34.field603 == -1) {
                    class483.method2889(-5727, var34.field610);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field589 = field9972[--field9987];
                class673.method3850(var34, (byte) -32);
                return;
            }
            if (arg0 == 1107) {
                var34.field623 = field9972[--field9987] == 1;
                class673.method3850(var34, (byte) 82);
                return;
            }
            if (arg0 == 1108) {
                var34.field585 = 1;
                var34.field679 = field9972[--field9987];
                class673.method3850(var34, (byte) 117);
                if (var34.field603 == -1) {
                    class515.method3040(-2, var34.field610);
                }
                return;
            }
            if (arg0 == 1109) {
                field9987 -= 6;
                var34.field680 = field9972[field9987];
                var34.field620 = field9972[field9987 + 1];
                var34.field629 = field9972[field9987 + 2];
                var34.field523 = field9972[field9987 + 3];
                var34.field528 = field9972[field9987 + 4];
                var34.field686 = field9972[field9987 + 5];
                class673.method3850(var34, (byte) 114);
                if (var34.field603 == -1) {
                    class479.method2885(9816, var34.field610);
                    class81.method655((byte) -62, var34.field610);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field9972[--field9987];
                if (var34.field544 != var36) {
                    var34.field544 = var36;
                    var34.field619 = 0;
                    var34.field522 = 1;
                    var34.field607 = 0;
                    class288 var37 = var34.field544 == -1 ? null : class742.field10404.method2663(0, var34.field544);
                    if (var37 != null) {
                        class103.method790(-25839, var37, var34.field619);
                    }
                    class673.method3850(var34, (byte) -90);
                }
                if (var34.field603 == -1) {
                    class575.method3336(var34.field610, (byte) -30);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field650 = field9972[--field9987] == 1;
                class673.method3850(var34, (byte) 112);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field9986[--field9970];
                if (!var38.equals(var34.field654)) {
                    var34.field654 = var38;
                    class673.method3850(var34, (byte) 78);
                }
                if (var34.field603 == -1) {
                    class263.method1695(23108, var34.field610);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field671 = field9972[--field9987];
                class673.method3850(var34, (byte) -71);
                if (var34.field603 == -1) {
                    class274.method1742(var34.field610, (byte) 108);
                }
                return;
            }
            if (arg0 == 1114) {
                field9987 -= 3;
                var34.field651 = field9972[field9987];
                var34.field548 = field9972[field9987 + 1];
                var34.field613 = field9972[field9987 + 2];
                class673.method3850(var34, (byte) 87);
                return;
            }
            if (arg0 == 1115) {
                var34.field634 = field9972[--field9987] == 1;
                class673.method3850(var34, (byte) -35);
                return;
            }
            if (arg0 == 1116) {
                var34.field683 = field9972[--field9987];
                class673.method3850(var34, (byte) -78);
                return;
            }
            if (arg0 == 1117) {
                var34.field628 = field9972[--field9987];
                class673.method3850(var34, (byte) 111);
                return;
            }
            if (arg0 == 1118) {
                var34.field514 = field9972[--field9987] == 1;
                class673.method3850(var34, (byte) 114);
                return;
            }
            if (arg0 == 1119) {
                var34.field516 = field9972[--field9987] == 1;
                class673.method3850(var34, (byte) -44);
                return;
            }
            if (arg0 == 1120) {
                field9987 -= 2;
                var34.field569 = field9972[field9987];
                var34.field573 = field9972[field9987 + 1];
                class673.method3850(var34, (byte) 77);
                if (var34.field577 == 0) {
                    class256.method1679(var34, 0, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field617 = field9972[--field9987] == 1;
                class673.method3850(var34, (byte) 114);
                return;
            }
            if (arg0 == 1123) {
                var34.field686 = field9972[--field9987];
                class673.method3850(var34, (byte) -106);
                if (var34.field603 == -1) {
                    class479.method2885(9816, var34.field610);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field9972[--field9987];
                var34.field664 = var39 == 1;
                class673.method3850(var34, (byte) 100);
                return;
            }
            if (arg0 == 1125) {
                field9987 -= 2;
                var34.field594 = field9972[field9987];
                var34.field596 = field9972[field9987 + 1];
                class673.method3850(var34, (byte) 120);
                return;
            }
            if (arg0 == 1126) {
                var34.field582 = field9972[--field9987];
                class673.method3850(var34, (byte) -116);
                return;
            }
            if (arg0 == 1127) {
                field9987 -= 2;
                int var40 = field9972[field9987];
                int var41 = field9972[field9987 + 1];
                class323 var42 = class153.field2479.method1653(var40, (byte) -119);
                if (var42.field4610 != var41) {
                    var34.method344(var40, var41, (byte) 97);
                    return;
                }
                var34.method352(var40, 13720);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field9972[--field9987];
                String var44 = field9986[--field9970];
                class323 var45 = class153.field2479.method1653(var43, (byte) -119);
                if (!var45.field4612.equals(var44)) {
                    var34.method351(var43, var44, (byte) 98);
                    return;
                }
                var34.method352(var43, 13720);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field9972[--field9987];
                if (var34.field577 != 5 && arg0 == 1129 || var34.field577 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field520 != var46) {
                    var34.field520 = var46;
                    class673.method3850(var34, (byte) -21);
                }
                if (var34.field603 == -1) {
                    class632.method3640(79, var34.field610);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class46 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class405.method2580(field9972[--field9987], 122);
            } else {
                var47 = arg1 ? field9988 : field9989;
            }
            class673.method3850(var47, (byte) 107);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field9987 -= 2;
                int var48 = field9972[field9987];
                int var49 = field9972[field9987 + 1];
                if (var47.field603 == -1) {
                    class382.method2461(-113, var47.field610);
                    class479.method2885(9816, var47.field610);
                    class81.method655((byte) -62, var47.field610);
                }
                if (var48 == -1) {
                    var47.field585 = 1;
                    var47.field679 = -1;
                    var47.field687 = -1;
                    return;
                }
                var47.field687 = var48;
                var47.field562 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field534 = true;
                } else {
                    var47.field534 = false;
                }
                class578 var50 = class336.field4876.method2079(var48, (byte) -49);
                var47.field629 = var50.field8221;
                var47.field523 = var50.field8170;
                var47.field528 = var50.field8182;
                var47.field680 = var50.field8179;
                var47.field620 = var50.field8172;
                var47.field686 = var50.field8207;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field537 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field537 = 1;
                } else {
                    var47.field537 = 2;
                }
                if (var47.field659 > 0) {
                    var47.field686 = var47.field686 * 32 / var47.field659;
                    return;
                }
                if (var47.field665 > 0) {
                    var47.field686 = var47.field686 * 32 / var47.field665;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field585 = 2;
                var47.field679 = field9972[--field9987];
                if (var47.field603 == -1) {
                    class515.method3040(-2, var47.field610);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field585 = 3;
                var47.field679 = -1;
                if (var47.field603 == -1) {
                    class515.method3040(-2, var47.field610);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field585 = 6;
                var47.field679 = field9972[--field9987];
                if (var47.field603 == -1) {
                    class515.method3040(-2, var47.field610);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field585 = 5;
                var47.field679 = field9972[--field9987];
                if (var47.field603 == -1) {
                    class515.method3040(-2, var47.field610);
                }
                return;
            }
            if (arg0 == 1206) {
                field9987 -= 4;
                var47.field559 = field9972[field9987];
                var47.field635 = field9972[field9987 + 1];
                var47.field546 = field9972[field9987 + 2];
                var47.field674 = field9972[field9987 + 3];
                class673.method3850(var47, (byte) 114);
                return;
            }
            if (arg0 == 1207) {
                field9987 -= 2;
                var47.field578 = field9972[field9987];
                var47.field675 = field9972[field9987 + 1];
                class673.method3850(var47, (byte) -27);
                return;
            }
            if (arg0 == 1210) {
                field9987 -= 4;
                var47.field679 = field9972[field9987];
                var47.field529 = field9972[field9987 + 1];
                if (field9972[field9987 + 2] == 1) {
                    var47.field585 = 9;
                } else {
                    var47.field585 = 8;
                }
                if (field9972[field9987 + 3] == 1) {
                    var47.field534 = true;
                } else {
                    var47.field534 = false;
                }
                if (var47.field603 == -1) {
                    class515.method3040(-2, var47.field610);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field585 = 5;
                var47.field679 = class701.field9775;
                var47.field529 = 0;
                if (var47.field603 == -1) {
                    class515.method3040(-2, var47.field610);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class46 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class405.method2580(field9972[--field9987], -114);
                } else {
                    var62 = arg1 ? field9988 : field9989;
                }
                if (arg0 == 1499) {
                    var62.method336(768);
                    return;
                }
                String var63 = field9986[--field9970];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field9972[--field9987];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field9972[--field9987];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field9986[--field9970];
                    } else {
                        var66[var67] = Integer.valueOf(field9972[--field9987]);
                    }
                }
                int var68 = field9972[--field9987];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field648 = var66;
                } else if (arg0 == 1401) {
                    var62.field524 = var66;
                } else if (arg0 == 1402) {
                    var62.field600 = var66;
                } else if (arg0 == 1403) {
                    var62.field662 = var66;
                } else if (arg0 == 1404) {
                    var62.field689 = var66;
                } else if (arg0 == 1405) {
                    var62.field624 = var66;
                } else if (arg0 == 1406) {
                    var62.field661 = var66;
                } else if (arg0 == 1407) {
                    var62.field570 = var66;
                    var62.field673 = var64;
                } else if (arg0 == 1408) {
                    var62.field688 = var66;
                } else if (arg0 == 1409) {
                    var62.field608 = var66;
                } else if (arg0 == 1410) {
                    var62.field615 = var66;
                } else if (arg0 == 1411) {
                    var62.field622 = var66;
                } else if (arg0 == 1412) {
                    var62.field542 = var66;
                } else if (arg0 == 1414) {
                    var62.field576 = var66;
                    var62.field587 = var64;
                } else if (arg0 == 1415) {
                    var62.field515 = var66;
                    var62.field547 = var64;
                } else if (arg0 == 1416) {
                    var62.field588 = var66;
                } else if (arg0 == 1417) {
                    var62.field626 = var66;
                } else if (arg0 == 1418) {
                    var62.field532 = var66;
                } else if (arg0 == 1419) {
                    var62.field561 = var66;
                } else if (arg0 == 1420) {
                    var62.field525 = var66;
                } else if (arg0 == 1421) {
                    var62.field618 = var66;
                } else if (arg0 == 1422) {
                    var62.field586 = var66;
                } else if (arg0 == 1423) {
                    var62.field646 = var66;
                } else if (arg0 == 1424) {
                    var62.field543 = var66;
                } else if (arg0 == 1425) {
                    var62.field647 = var66;
                } else if (arg0 == 1426) {
                    var62.field551 = var66;
                } else if (arg0 == 1427) {
                    var62.field668 = var66;
                } else if (arg0 == 1428) {
                    var62.field563 = var66;
                    var62.field545 = var64;
                } else if (arg0 == 1429) {
                    var62.field636 = var66;
                    var62.field584 = var64;
                } else if (arg0 == 1430) {
                    var62.field656 = var66;
                }
                var62.field602 = true;
                return;
            }
            if (arg0 < 1600) {
                class46 var69 = arg1 ? field9988 : field9989;
                if (arg0 == 1500) {
                    field9972[field9987++] = var69.field669;
                    return;
                }
                if (arg0 == 1501) {
                    field9972[field9987++] = var69.field643;
                    return;
                }
                if (arg0 == 1502) {
                    field9972[field9987++] = var69.field549;
                    return;
                }
                if (arg0 == 1503) {
                    field9972[field9987++] = var69.field574;
                    return;
                }
                if (arg0 == 1504) {
                    field9972[field9987++] = var69.field682 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field9972[field9987++] = var69.field557;
                    return;
                }
                if (arg0 == 1506) {
                    class46 var70 = class178.method1261(114, var69);
                    field9972[field9987++] = var70 == null ? -1 : var70.field610;
                    return;
                }
            } else if (arg0 < 1700) {
                class46 var71 = arg1 ? field9988 : field9989;
                if (arg0 == 1600) {
                    field9972[field9987++] = var71.field527;
                    return;
                }
                if (arg0 == 1601) {
                    field9972[field9987++] = var71.field554;
                    return;
                }
                if (arg0 == 1602) {
                    field9986[field9970++] = var71.field654;
                    return;
                }
                if (arg0 == 1603) {
                    field9972[field9987++] = var71.field569;
                    return;
                }
                if (arg0 == 1604) {
                    field9972[field9987++] = var71.field573;
                    return;
                }
                if (arg0 == 1605) {
                    field9972[field9987++] = var71.field686;
                    return;
                }
                if (arg0 == 1606) {
                    field9972[field9987++] = var71.field629;
                    return;
                }
                if (arg0 == 1607) {
                    field9972[field9987++] = var71.field528;
                    return;
                }
                if (arg0 == 1608) {
                    field9972[field9987++] = var71.field523;
                    return;
                }
                if (arg0 == 1609) {
                    field9972[field9987++] = var71.field652;
                    return;
                }
                if (arg0 == 1610) {
                    field9972[field9987++] = var71.field680;
                    return;
                }
                if (arg0 == 1611) {
                    field9972[field9987++] = var71.field620;
                    return;
                }
                if (arg0 == 1612) {
                    field9972[field9987++] = var71.field633;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field9972[--field9987];
                    class323 var73 = class153.field2479.method1653(var72, (byte) -119);
                    if (var73.method2055(6)) {
                        field9986[field9970++] = var71.method349(var72, (byte) -52, var73.field4612);
                        return;
                    }
                    field9972[field9987++] = var71.method342(var73.field4610, (byte) -68, var72);
                    return;
                }
                if (arg0 == 1614) {
                    field9972[field9987++] = var71.field589;
                    return;
                }
                if (arg0 == 2614) {
                    field9972[field9987++] = var71.field585 == 1 ? var71.field679 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class46 var74 = arg1 ? field9988 : field9989;
                if (arg0 == 1700) {
                    field9972[field9987++] = var74.field687;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field687 != -1) {
                        field9972[field9987++] = var74.field562;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field9972[field9987++] = var74.field603;
                    return;
                }
            } else if (arg0 < 1900) {
                class46 var75 = arg1 ? field9988 : field9989;
                if (arg0 == 1800) {
                    field9972[field9987++] = client.method1886(var75).method1555(10061);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field9972[--field9987];
                    int var357 = var76 - 1;
                    if (var75.field611 != null && var357 < var75.field611.length && var75.field611[var357] != null) {
                        field9986[field9970++] = var75.field611[var357];
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field612 == null) {
                        field9986[field9970++] = "";
                        return;
                    }
                    field9986[field9970++] = var75.field612;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class46 var355;
                if (arg0 >= 2000) {
                    var355 = class405.method2580(field9972[--field9987], 95);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field9988 : field9989;
                }
                if (field9995 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field668 == null) {
                        return;
                    }
                    class177 var356 = new class177();
                    var356.field2743 = var355;
                    var356.field2737 = var355.field668;
                    var356.field2744 = field9995 + 1;
                    class150.field2337.method1203(var356, (byte) -42);
                    return;
                }
            } else if (arg0 < 2600) {
                class46 var77 = class405.method2580(field9972[--field9987], 110);
                if (arg0 == 2500) {
                    field9972[field9987++] = var77.field669;
                    return;
                }
                if (arg0 == 2501) {
                    field9972[field9987++] = var77.field643;
                    return;
                }
                if (arg0 == 2502) {
                    field9972[field9987++] = var77.field549;
                    return;
                }
                if (arg0 == 2503) {
                    field9972[field9987++] = var77.field574;
                    return;
                }
                if (arg0 == 2504) {
                    field9972[field9987++] = var77.field682 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field9972[field9987++] = var77.field557;
                    return;
                }
                if (arg0 == 1506) {
                    class46 var78 = class178.method1261(87, var77);
                    field9972[field9987++] = var78 == null ? -1 : var78.field610;
                    return;
                }
            } else if (arg0 < 2700) {
                class46 var79 = class405.method2580(field9972[--field9987], -54);
                if (arg0 == 2600) {
                    field9972[field9987++] = var79.field527;
                    return;
                }
                if (arg0 == 2601) {
                    field9972[field9987++] = var79.field554;
                    return;
                }
                if (arg0 == 2602) {
                    field9986[field9970++] = var79.field654;
                    return;
                }
                if (arg0 == 2603) {
                    field9972[field9987++] = var79.field569;
                    return;
                }
                if (arg0 == 2604) {
                    field9972[field9987++] = var79.field573;
                    return;
                }
                if (arg0 == 2605) {
                    field9972[field9987++] = var79.field686;
                    return;
                }
                if (arg0 == 2606) {
                    field9972[field9987++] = var79.field629;
                    return;
                }
                if (arg0 == 2607) {
                    field9972[field9987++] = var79.field528;
                    return;
                }
                if (arg0 == 2608) {
                    field9972[field9987++] = var79.field523;
                    return;
                }
                if (arg0 == 2609) {
                    field9972[field9987++] = var79.field652;
                    return;
                }
                if (arg0 == 2610) {
                    field9972[field9987++] = var79.field680;
                    return;
                }
                if (arg0 == 2611) {
                    field9972[field9987++] = var79.field620;
                    return;
                }
                if (arg0 == 2612) {
                    field9972[field9987++] = var79.field633;
                    return;
                }
                if (arg0 == 2613) {
                    field9972[field9987++] = var79.field589;
                    return;
                }
                if (arg0 == 2614) {
                    field9972[field9987++] = var79.field585 == 1 ? var79.field679 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class46 var80 = class405.method2580(field9972[--field9987], -65);
                    field9972[field9987++] = var80.field687;
                    return;
                }
                if (arg0 == 2701) {
                    class46 var81 = class405.method2580(field9972[--field9987], 76);
                    if (var81.field687 != -1) {
                        field9972[field9987++] = var81.field562;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field9972[--field9987];
                    class421 var83 = (class421) class291.field4168.method2287((long) var82, (byte) -117);
                    if (var83 != null) {
                        field9972[field9987++] = 1;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class46 var84 = class405.method2580(field9972[--field9987], 92);
                    if (var84.field621 == null) {
                        field9972[field9987++] = 0;
                        return;
                    }
                    int var85 = var84.field621.length;
                    for (int var86 = 0; var86 < var84.field621.length; var86++) {
                        if (var84.field621[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field9972[field9987++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field9987 -= 2;
                    int var87 = field9972[field9987];
                    int var88 = field9972[field9987 + 1];
                    class421 var89 = (class421) class291.field4168.method2287((long) var87, (byte) -117);
                    if (var89 != null && var89.field6282 == var88) {
                        field9972[field9987++] = 1;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class46 var90 = class405.method2580(field9972[--field9987], 67);
                if (arg0 == 2800) {
                    field9972[field9987++] = client.method1886(var90).method1555(10061);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field9972[--field9987];
                    int var358 = var91 - 1;
                    if (var90.field611 != null && var358 < var90.field611.length && var90.field611[var358] != null) {
                        field9986[field9970++] = var90.field611[var358];
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field612 == null) {
                        field9986[field9970++] = "";
                        return;
                    }
                    field9986[field9970++] = var90.field612;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field9986[--field9970];
                    class276.method1750(0, var92);
                    return;
                }
                if (arg0 == 3101) {
                    field9987 -= 2;
                    class497.method2960((byte) -5, class130.field1749, field9972[field9987], field9972[field9987 + 1]);
                    return;
                }
                if (arg0 == 3103) {
                    class589.method3402(true, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field9986[--field9970];
                    int var94 = 0;
                    if (class95.method746(var93, 10)) {
                        var94 = class763.method4236((byte) 37, var93);
                    }
                    field9990++;
                    class468 var95 = class93.method734(class29.field284, class510.field7261, 8174);
                    var95.field6839.method3695(var94, 255);
                    class120.method872((byte) 54, var95);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field9986[--field9970];
                    field9979++;
                    class468 var97 = class93.method734(class29.field284, class51.field744, 8174);
                    var97.field6839.method3730(112, var96.length() + 1);
                    var97.field6839.method3692(127, var96);
                    class120.method872((byte) 41, var97);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field9986[--field9970];
                    field9971++;
                    class468 var99 = class93.method734(class29.field284, class434.field6461, 8174);
                    var99.field6839.method3730(119, var98.length() + 1);
                    var99.field6839.method3692(124, var98);
                    class120.method872((byte) -102, var99);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field9972[--field9987];
                    String var101 = field9986[--field9970];
                    class293.method1863(-122, var101, var100);
                    return;
                }
                if (arg0 == 3108) {
                    field9987 -= 3;
                    int var102 = field9972[field9987];
                    int var103 = field9972[field9987 + 1];
                    int var104 = field9972[field9987 + 2];
                    class46 var105 = class405.method2580(var104, 64);
                    class15.method94(var105, var103, false, var102);
                    return;
                }
                if (arg0 == 3109) {
                    field9987 -= 2;
                    int var106 = field9972[field9987];
                    int var107 = field9972[field9987 + 1];
                    class46 var108 = arg1 ? field9988 : field9989;
                    class15.method94(var108, var107, false, var106);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field9972[--field9987];
                    field9975++;
                    class468 var110 = class93.method734(class29.field284, class144.field1893, 8174);
                    var110.field6839.method3702(var109, (byte) -106);
                    class120.method872((byte) 69, var110);
                    return;
                }
                if (arg0 == 3111) {
                    field9987 -= 2;
                    int var111 = field9972[field9987];
                    int var112 = field9972[field9987 + 1];
                    class421 var113 = (class421) class291.field4168.method2287((long) var111, (byte) -117);
                    if (var113 != null) {
                        class327.method2074(true, false, var113, var113.field6282 != var112);
                    }
                    class320.method2024(3, true, 0, var111, var112);
                    return;
                }
                if (arg0 == 3112) {
                    field9987--;
                    int var114 = field9972[field9987];
                    class421 var115 = (class421) class291.field4168.method2287((long) var114, (byte) -117);
                    if (var115 != null && var115.field6285 == 3) {
                        class327.method2074(true, false, var115, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class582.method3378(field9986[--field9970], 0);
                    return;
                }
                if (arg0 == 3114) {
                    field9987 -= 2;
                    int var116 = field9972[field9987];
                    int var117 = field9972[field9987 + 1];
                    String var118 = field9986[--field9970];
                    class25.method125(var117, "", 0, var118, var116, "", "");
                    return;
                }
                if (arg0 == 3115) {
                    field9987 -= 11;
                    class651[] var119 = class43.method300(false);
                    class713[] var120 = class478.method2882(-113);
                    class727.method4100(field9972[field9987 + 8], var119[field9972[field9987]], field9972[field9987 + 6], field9972[field9987 + 2], field9972[field9987 + 5], field9972[field9987 + 10], -26233, field9972[field9987 + 7], field9972[field9987 + 3], var120[field9972[field9987 + 1]], field9972[field9987 + 4], field9972[field9987 + 9]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field9987 -= 3;
                    class258.method1683(256, 255, field9972[field9987], (byte) -55, field9972[field9987 + 1], field9972[field9987 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class12.method83(255, field9972[--field9987], 50, (byte) 118);
                    return;
                }
                if (arg0 == 3202) {
                    field9987 -= 2;
                    class261.method1691(-43, field9972[field9987 + 1], 255, field9972[field9987]);
                    return;
                }
                if (arg0 == 3203) {
                    field9987 -= 4;
                    class258.method1683(256, field9972[field9987 + 3], field9972[field9987], (byte) -36, field9972[field9987 + 1], field9972[field9987 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field9987 -= 3;
                    class12.method83(field9972[field9987 + 1], field9972[field9987], field9972[field9987 + 2], (byte) 112);
                    return;
                }
                if (arg0 == 3205) {
                    field9987 -= 3;
                    class261.method1691(104, field9972[field9987 + 1], field9972[field9987 + 2], field9972[field9987]);
                    return;
                }
                if (arg0 == 3206) {
                    field9987 -= 4;
                    class176.method1258(50, 256, false, field9972[field9987 + 2], field9972[field9987], field9972[field9987 + 3], field9972[field9987 + 1]);
                    return;
                }
                if (arg0 == 3207) {
                    field9987 -= 4;
                    class176.method1258(50, 256, true, field9972[field9987 + 2], field9972[field9987], field9972[field9987 + 3], field9972[field9987 + 1]);
                    return;
                }
                if (arg0 == 3208) {
                    field9987 -= 5;
                    class258.method1683(field9972[field9987 + 4], field9972[field9987 + 3], field9972[field9987], (byte) -108, field9972[field9987 + 1], field9972[field9987 + 2]);
                    return;
                }
                if (arg0 == 3209) {
                    field9987 -= 5;
                    class176.method1258(50, field9972[field9987 + 4], false, field9972[field9987 + 2], field9972[field9987], field9972[field9987 + 3], field9972[field9987 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field9972[field9987++] = class357.field5189;
                    return;
                }
                if (arg0 == 3301) {
                    field9987 -= 2;
                    int var121 = field9972[field9987];
                    int var122 = field9972[field9987 + 1];
                    field9972[field9987++] = class68.method599(var121, var122, false, (byte) -118);
                    return;
                }
                if (arg0 == 3302) {
                    field9987 -= 2;
                    int var123 = field9972[field9987];
                    int var124 = field9972[field9987 + 1];
                    field9972[field9987++] = class302.method1907(var123, var124, -28889, false);
                    return;
                }
                if (arg0 == 3303) {
                    field9987 -= 2;
                    int var125 = field9972[field9987];
                    int var126 = field9972[field9987 + 1];
                    field9972[field9987++] = class141.method985(var125, false, false, var126);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field9972[--field9987];
                    field9972[field9987++] = class603.field8536.method137(5, var127).field3206;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field9972[--field9987];
                    field9972[field9987++] = class91.field1276[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field9972[--field9987];
                    field9972[field9987++] = class547.field7812[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field9972[--field9987];
                    field9972[field9987++] = class225.field3309[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class130.field1749.field8429;
                    int var132 = (class130.field1749.field8423 >> 9) + class361.field5224;
                    int var133 = (class130.field1749.field8428 >> 9) + class582.field8288;
                    field9972[field9987++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field9972[--field9987];
                    field9972[field9987++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field9972[--field9987];
                    field9972[field9987++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field9972[--field9987];
                    field9972[field9987++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field9972[field9987++] = class691.field9553 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field9987 -= 2;
                    int var137 = field9972[field9987];
                    int var138 = field9972[field9987 + 1];
                    field9972[field9987++] = class68.method599(var137, var138, true, (byte) -100);
                    return;
                }
                if (arg0 == 3314) {
                    field9987 -= 2;
                    int var139 = field9972[field9987];
                    int var140 = field9972[field9987 + 1];
                    field9972[field9987++] = class302.method1907(var139, var140, -28889, true);
                    return;
                }
                if (arg0 == 3315) {
                    field9987 -= 2;
                    int var141 = field9972[field9987];
                    int var142 = field9972[field9987 + 1];
                    field9972[field9987++] = class141.method985(var141, true, false, var142);
                    return;
                }
                if (arg0 == 3316) {
                    if (class245.field3569 >= 2) {
                        field9972[field9987++] = class245.field3569;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field9972[field9987++] = class677.field9415;
                    return;
                }
                if (arg0 == 3318) {
                    field9972[field9987++] = class528.field7513.field8131;
                    return;
                }
                if (arg0 == 3321) {
                    field9972[field9987++] = class132.field1782;
                    return;
                }
                if (arg0 == 3322) {
                    field9972[field9987++] = class276.field3920;
                    return;
                }
                if (arg0 == 3323) {
                    if (class593.field8418 >= 5 && class593.field8418 <= 9) {
                        field9972[field9987++] = 1;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class593.field8418 >= 5 && class593.field8418 <= 9) {
                        field9972[field9987++] = class593.field8418;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field9972[field9987++] = class71.field1005 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field9972[field9987++] = class130.field1749.field9524;
                    return;
                }
                if (arg0 == 3327) {
                    field9972[field9987++] = class130.field1749.field9495 != null && class130.field1749.field9495.field5821 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field9972[field9987++] = class394.field5929 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field9972[--field9987];
                    field9972[field9987++] = class432.method2686(false, var143, 1);
                    return;
                }
                if (arg0 == 3331) {
                    field9987 -= 2;
                    int var144 = field9972[field9987];
                    int var145 = field9972[field9987 + 1];
                    field9972[field9987++] = class498.method2965(var145, false, false, 0, var144);
                    return;
                }
                if (arg0 == 3332) {
                    field9987 -= 2;
                    int var146 = field9972[field9987];
                    int var147 = field9972[field9987 + 1];
                    field9972[field9987++] = class498.method2965(var147, true, false, 0, var146);
                    return;
                }
                if (arg0 == 3333) {
                    field9972[field9987++] = class92.field1284;
                    return;
                }
                if (arg0 == 3335) {
                    field9972[field9987++] = class650.field9160;
                    return;
                }
                if (arg0 == 3336) {
                    field9987 -= 4;
                    int var148 = field9972[field9987];
                    int var149 = field9972[field9987 + 1];
                    int var150 = field9972[field9987 + 2];
                    int var151 = field9972[field9987 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field9972[field9987++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field9972[field9987++] = class299.field4243;
                    return;
                }
                if (arg0 == 3338) {
                    field9972[field9987++] = class341.method2171((byte) -52);
                    return;
                }
                if (arg0 == 3339) {
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field9972[field9987++] = class201.field3018 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field9972[field9987++] = class221.field3257 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field9972[field9987++] = class632.field8840.method2697(4212);
                    return;
                }
                if (arg0 == 3343) {
                    field9972[field9987++] = class632.field8840.method2698(0);
                    return;
                }
                if (arg0 == 3344) {
                    field9986[field9970++] = class195.method1352((byte) 86);
                    return;
                }
                if (arg0 == 3345) {
                    field9986[field9970++] = class8.method54((byte) -49);
                    return;
                }
                if (arg0 == 3346) {
                    field9972[field9987++] = class51.method375(1);
                    return;
                }
                if (arg0 == 3347) {
                    field9972[field9987++] = class724.field10105;
                    return;
                }
                if (arg0 == 3349) {
                    field9972[field9987++] = class130.field1749.field6110.method752((byte) 118) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field9987 -= 2;
                    int var155 = field9972[field9987];
                    int var156 = field9972[field9987 + 1];
                    class110 var157 = class448.field6624.method743(var155, true);
                    field9986[field9970++] = var157.method824((byte) -128, var156);
                    return;
                }
                if (arg0 == 3408) {
                    field9987 -= 4;
                    int var158 = field9972[field9987];
                    int var159 = field9972[field9987 + 1];
                    int var160 = field9972[field9987 + 2];
                    int var161 = field9972[field9987 + 3];
                    class110 var162 = class448.field6624.method743(var160, true);
                    if (var162.field1527 == var158 && var162.field1532 == var159) {
                        if (var159 == 115) {
                            field9986[field9970++] = var162.method824((byte) -127, var161);
                            return;
                        }
                        field9972[field9987++] = var162.method832(false, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1 " + var160 + "-" + var161);
                }
                if (arg0 == 3409) {
                    field9987 -= 3;
                    int var163 = field9972[field9987];
                    int var164 = field9972[field9987 + 1];
                    int var165 = field9972[field9987 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class110 var166 = class448.field6624.method743(var164, true);
                    if (var166.field1532 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field9972[field9987++] = var166.method829(var165, -87) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field9972[--field9987];
                    String var168 = field9986[--field9970];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class110 var169 = class448.field6624.method743(var167, true);
                    if (var169.field1532 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field9972[field9987++] = var169.method827(var168, -21008) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field9972[--field9987];
                    class110 var171 = class448.field6624.method743(var170, true);
                    field9972[field9987++] = var171.field1534.method2281(false);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class230.field3379 == 0) {
                        field9972[field9987++] = -2;
                        return;
                    }
                    if (class230.field3379 == 1) {
                        field9972[field9987++] = -1;
                        return;
                    }
                    field9972[field9987++] = class690.field9544;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field9972[--field9987];
                    if (class230.field3379 == 2 && var172 < class690.field9544) {
                        field9986[field9970++] = class133.field1790[var172];
                        if (class71.field1003[var172] != null) {
                            field9986[field9970++] = class71.field1003[var172];
                            return;
                        }
                        field9986[field9970++] = "";
                        return;
                    }
                    field9986[field9970++] = "";
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field9972[--field9987];
                    if (class230.field3379 == 2 && var173 < class690.field9544) {
                        field9972[field9987++] = class686.field9486[var173];
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field9972[--field9987];
                    if (class230.field3379 == 2 && var174 < class690.field9544) {
                        field9972[field9987++] = class693.field9576[var174];
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field9986[--field9970];
                    int var176 = field9972[--field9987];
                    class224.method1516(106, var176, var175);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field9986[--field9970];
                    class157.method1161(122, var177);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field9986[--field9970];
                    class437.method2704(var178, true);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field9986[--field9970];
                    class227.method1528(var179, false, (byte) 118);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field9986[--field9970];
                    class48.method355(var180, (byte) 23);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field9986[--field9970];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field9972[field9987++] = class238.method1579(-4695, var181) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field9972[--field9987];
                    if (class230.field3379 == 2 && var182 < class690.field9544) {
                        field9986[field9970++] = class12.field172[var182];
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class470.field6856 != null) {
                        field9986[field9970++] = class430.method2681((byte) -36, class470.field6856);
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class470.field6856 != null) {
                        field9972[field9987++] = class377.field5712;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field9972[--field9987];
                    if (class470.field6856 != null && var183 < class377.field5712) {
                        field9986[field9970++] = class467.field6838[var183].field5121;
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field9972[--field9987];
                    if (class470.field6856 != null && var184 < class377.field5712) {
                        field9972[field9987++] = class467.field6838[var184].field5119;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field9972[--field9987];
                    if (class470.field6856 != null && var185 < class377.field5712) {
                        field9972[field9987++] = class467.field6838[var185].field5117;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field9972[field9987++] = class325.field4647;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field9986[--field9970];
                    class430.method2677(var186, true);
                    return;
                }
                if (arg0 == 3618) {
                    field9972[field9987++] = class168.field2644;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field9986[--field9970];
                    class413.method2621(-1, var187);
                    return;
                }
                if (arg0 == 3620) {
                    class135.method952(82);
                    return;
                }
                if (arg0 == 3621) {
                    if (class230.field3379 == 0) {
                        field9972[field9987++] = -1;
                        return;
                    }
                    field9972[field9987++] = class569.field8065;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field9972[--field9987];
                    if (class230.field3379 != 0 && var188 < class569.field8065) {
                        field9986[field9970++] = class254.field3654[var188];
                        if (class331.field4764[var188] != null) {
                            field9986[field9970++] = class331.field4764[var188];
                            return;
                        }
                        field9986[field9970++] = "";
                        return;
                    }
                    field9986[field9970++] = "";
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field9986[--field9970];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field9972[field9987++] = class89.method720(-27006, var189) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field9972[--field9987];
                    if (class467.field6838 != null && var190 < class377.field5712 && class467.field6838[var190].field5120.equalsIgnoreCase(class130.field1749.field9513)) {
                        field9972[field9987++] = 1;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class249.field3611 != null) {
                        field9986[field9970++] = class249.field3611;
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field9972[--field9987];
                    if (class470.field6856 != null && var191 < class377.field5712) {
                        field9986[field9970++] = class467.field6838[var191].field5116;
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field9972[--field9987];
                    if (class230.field3379 == 2 && var192 >= 0 && var192 < class690.field9544) {
                        field9972[field9987++] = class581.field8258[var192] ? 1 : 0;
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field9986[--field9970];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field9972[field9987++] = class692.method3929(false, var193);
                    return;
                }
                if (arg0 == 3629) {
                    field9972[field9987++] = class582.field8279;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field9986[--field9970];
                    class227.method1528(var194, true, (byte) 117);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field9972[--field9987];
                    field9972[field9987++] = class489.field6991[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field9972[--field9987];
                    if (class470.field6856 != null && var196 < class377.field5712) {
                        field9986[field9970++] = class467.field6838[var196].field5120;
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field9972[--field9987];
                    if (class230.field3379 != 0 && var197 < class569.field8065) {
                        field9986[field9970++] = class458.field6753[var197];
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field9972[--field9987];
                    field9972[field9987++] = class661.field9248[var198].method3760(1);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field9972[--field9987];
                    field9972[field9987++] = class661.field9248[var199].field9107;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field9972[--field9987];
                    field9972[field9987++] = class661.field9248[var200].field9112;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field9972[--field9987];
                    field9972[field9987++] = class661.field9248[var201].field9113;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field9972[--field9987];
                    field9972[field9987++] = class661.field9248[var202].field9106;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field9972[--field9987];
                    field9972[field9987++] = class661.field9248[var203].field9110;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field9972[--field9987];
                    int var205 = class661.field9248[var204].method3759(7);
                    field9972[field9987++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field9972[--field9987];
                    int var207 = class661.field9248[var206].method3759(7);
                    field9972[field9987++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field9972[--field9987];
                    int var209 = class661.field9248[var208].method3759(7);
                    field9972[field9987++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field9972[--field9987];
                    int var211 = class661.field9248[var210].method3759(7);
                    field9972[field9987++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field9987 -= 2;
                    int var212 = field9972[field9987];
                    int var213 = field9972[field9987 + 1];
                    field9972[field9987++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field9987 -= 2;
                    int var214 = field9972[field9987];
                    int var215 = field9972[field9987 + 1];
                    field9972[field9987++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field9987 -= 2;
                    int var216 = field9972[field9987];
                    int var217 = field9972[field9987 + 1];
                    field9972[field9987++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field9987 -= 2;
                    int var218 = field9972[field9987];
                    int var219 = field9972[field9987 + 1];
                    field9972[field9987++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field9972[--field9987];
                    field9972[field9987++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field9972[--field9987];
                    field9972[field9987++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field9987 -= 5;
                    int var222 = field9972[field9987];
                    int var223 = field9972[field9987 + 1];
                    int var224 = field9972[field9987 + 2];
                    int var225 = field9972[field9987 + 3];
                    int var226 = field9972[field9987 + 4];
                    field9972[field9987++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field9987 -= 2;
                    long var227 = (long) field9972[field9987];
                    long var229 = (long) field9972[field9987 + 1];
                    field9972[field9987++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field9987 -= 2;
                    int var231 = field9972[field9987];
                    int var232 = field9972[field9987 + 1];
                    field9972[field9987++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field9987 -= 2;
                    int var233 = field9972[field9987];
                    int var234 = field9972[field9987 + 1];
                    field9972[field9987++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field9987 -= 2;
                    int var235 = field9972[field9987];
                    int var236 = field9972[field9987 + 1];
                    field9972[field9987++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field9987 -= 2;
                    int var237 = field9972[field9987];
                    int var238 = field9972[field9987 + 1];
                    field9972[field9987++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field9987 -= 2;
                    int var239 = field9972[field9987];
                    int var240 = field9972[field9987 + 1];
                    if (var239 == 0) {
                        field9972[field9987++] = 0;
                        return;
                    }
                    field9972[field9987++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field9987 -= 2;
                    int var241 = field9972[field9987];
                    int var242 = field9972[field9987 + 1];
                    if (var241 == 0) {
                        field9972[field9987++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field9972[field9987++] = Integer.MAX_VALUE;
                        return;
                    }
                    field9972[field9987++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field9987 -= 2;
                    int var243 = field9972[field9987];
                    int var244 = field9972[field9987 + 1];
                    field9972[field9987++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field9987 -= 2;
                    int var245 = field9972[field9987];
                    int var246 = field9972[field9987 + 1];
                    field9972[field9987++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field9987 -= 2;
                    int var247 = field9972[field9987];
                    int var248 = field9972[field9987 + 1];
                    field9972[field9987++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field9987 -= 2;
                    int var249 = field9972[field9987];
                    int var250 = field9972[field9987 + 1];
                    field9972[field9987++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field9987 -= 3;
                    long var251 = (long) field9972[field9987];
                    long var253 = (long) field9972[field9987 + 1];
                    long var255 = (long) field9972[field9987 + 2];
                    field9972[field9987++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field9987 -= 2;
                    int var257 = field9972[field9987];
                    int var258 = field9972[field9987 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field9972[field9987++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field9972[field9987++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field9986[--field9970];
                    int var262 = field9972[--field9987];
                    field9986[field9970++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field9970 -= 2;
                    String var263 = field9986[field9970];
                    String var264 = field9986[field9970 + 1];
                    field9986[field9970++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field9986[--field9970];
                    int var266 = field9972[--field9987];
                    field9986[field9970++] = var265 + class343.method2177(0, true, var266);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field9986[--field9970];
                    field9986[field9970++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field9986[field9970++] = method4035(field9972[--field9987]);
                    return;
                }
                if (arg0 == 4105) {
                    field9970 -= 2;
                    String var268 = field9986[field9970];
                    String var269 = field9986[field9970 + 1];
                    if (class130.field1749.field9495 != null && class130.field1749.field9495.field5821) {
                        field9986[field9970++] = var269;
                        return;
                    }
                    field9986[field9970++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field9972[--field9987];
                    field9986[field9970++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field9970 -= 2;
                    field9972[field9987++] = class457.method2796(field9986[field9970], class650.field9160, -1, field9986[field9970 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field9986[--field9970];
                    field9987 -= 2;
                    int var272 = field9972[field9987];
                    int var273 = field9972[field9987 + 1];
                    class66 var274 = class649.method3771(0, class338.field4915, var273, 6);
                    field9972[field9987++] = var274.method592(var272, (byte) -118, class391.field5894, var271);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field9986[--field9970];
                    field9987 -= 2;
                    int var276 = field9972[field9987];
                    int var277 = field9972[field9987 + 1];
                    class66 var278 = class649.method3771(0, class338.field4915, var277, 6);
                    field9972[field9987++] = var278.method583(var276, class391.field5894, 0, var275);
                    return;
                }
                if (arg0 == 4110) {
                    field9970 -= 2;
                    String var279 = field9986[field9970];
                    String var280 = field9986[field9970 + 1];
                    if (field9972[--field9987] == 1) {
                        field9986[field9970++] = var279;
                        return;
                    }
                    field9986[field9970++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field9986[--field9970];
                    field9986[field9970++] = class452.method2772(var281, 3);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field9986[--field9970];
                    int var283 = field9972[--field9987];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field9986[field9970++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field9972[--field9987];
                    field9972[field9987++] = method4031((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field9972[--field9987];
                    field9972[field9987++] = class571.method3307((char) var285, 90) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field9972[--field9987];
                    field9972[field9987++] = class424.method2655((char) var286, 4) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field9972[--field9987];
                    field9972[field9987++] = class706.method4014((char) var287, 108) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field9986[--field9970];
                    if (var288 != null) {
                        field9972[field9987++] = var288.length();
                        return;
                    }
                    field9972[field9987++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field9986[--field9970];
                    field9987 -= 2;
                    int var290 = field9972[field9987];
                    int var291 = field9972[field9987 + 1];
                    field9986[field9970++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field9986[--field9970];
                    StringBuffer var293 = new StringBuffer(var292.length());
                    boolean var294 = false;
                    for (int var295 = 0; var295 < var292.length(); var295++) {
                        char var296 = var292.charAt(var295);
                        if (var296 == '<') {
                            var294 = true;
                        } else if (var296 == '>') {
                            var294 = false;
                        } else if (!var294) {
                            var293.append(var296);
                        }
                    }
                    field9986[field9970++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field9986[--field9970];
                    field9987 -= 2;
                    int var298 = field9972[field9987];
                    int var299 = field9972[field9987 + 1];
                    field9972[field9987++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field9970 -= 2;
                    String var300 = field9986[field9970];
                    String var301 = field9986[field9970 + 1];
                    int var302 = field9972[--field9987];
                    field9972[field9987++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field9972[--field9987];
                    field9972[field9987++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field9972[--field9987];
                    field9972[field9987++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field9972[--field9987] != 0;
                    int var306 = field9972[--field9987];
                    field9986[field9970++] = class230.method1543((long) var306, (byte) 96, 0, class650.field9160, var305);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field9986[--field9970];
                    int var308 = field9972[--field9987];
                    class66 var309 = class649.method3771(0, class338.field4915, var308, 6);
                    field9972[field9987++] = var309.method589(var307, 169, class391.field5894);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field9972[--field9987];
                    field9986[field9970++] = class336.field4876.method2079(var310, (byte) -63).field8231;
                    return;
                }
                if (arg0 == 4201) {
                    field9987 -= 2;
                    int var311 = field9972[field9987];
                    int var312 = field9972[field9987 + 1];
                    class578 var313 = class336.field4876.method2079(var311, (byte) -48);
                    if (var312 >= 1 && var312 <= 5 && var313.field8194[var312 - 1] != null) {
                        field9986[field9970++] = var313.field8194[var312 - 1];
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field9987 -= 2;
                    int var314 = field9972[field9987];
                    int var315 = field9972[field9987 + 1];
                    class578 var316 = class336.field4876.method2079(var314, (byte) 92);
                    if (var315 >= 1 && var315 <= 5 && var316.field8215[var315 - 1] != null) {
                        field9986[field9970++] = var316.field8215[var315 - 1];
                        return;
                    }
                    field9986[field9970++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field9972[--field9987];
                    field9972[field9987++] = class336.field4876.method2079(var317, (byte) 107).field8159;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field9972[--field9987];
                    field9972[field9987++] = class336.field4876.method2079(var318, (byte) -102).field8158 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field9972[--field9987];
                    class578 var320 = class336.field4876.method2079(var319, (byte) -83);
                    if (var320.field8226 == -1 && var320.field8189 >= 0) {
                        field9972[field9987++] = var320.field8189;
                        return;
                    }
                    field9972[field9987++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field9972[--field9987];
                    class578 var322 = class336.field4876.method2079(var321, (byte) -44);
                    if (var322.field8226 >= 0 && var322.field8189 >= 0) {
                        field9972[field9987++] = var322.field8189;
                        return;
                    }
                    field9972[field9987++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field9972[--field9987];
                    field9972[field9987++] = class336.field4876.method2079(var323, (byte) -50).field8238 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field9987 -= 2;
                    int var324 = field9972[field9987];
                    int var325 = field9972[field9987 + 1];
                    class323 var326 = class153.field2479.method1653(var325, (byte) -119);
                    if (var326.method2055(6)) {
                        field9986[field9970++] = class336.field4876.method2079(var324, (byte) 110).method3360(var326.field4612, (byte) 97, var325);
                        return;
                    }
                    field9972[field9987++] = class336.field4876.method2079(var324, (byte) -110).method3353(var326.field4610, var325, 0);
                    return;
                }
                if (arg0 == 4209) {
                    field9987 -= 2;
                    int var327 = field9972[field9987];
                    int var328 = field9972[field9987 + 1] - 1;
                    class578 var329 = class336.field4876.method2079(var327, (byte) 95);
                    if (var329.field8197 == var328) {
                        field9972[field9987++] = var329.field8193;
                        return;
                    }
                    if (var329.field8187 == var328) {
                        field9972[field9987++] = var329.field8223;
                        return;
                    }
                    field9972[field9987++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field9986[--field9970];
                    int var331 = field9972[--field9987];
                    class223.method1502((byte) -53, var331 == 1, var330);
                    field9972[field9987++] = class109.field1518;
                    return;
                }
                if (arg0 == 4211) {
                    if (class355.field5164 != null && class671.field9361 < class109.field1518) {
                        field9972[field9987++] = class355.field5164[class671.field9361++] & 0xFFFF;
                        return;
                    }
                    field9972[field9987++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class671.field9361 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field9972[--field9987];
                    field9972[field9987++] = class336.field4876.method2079(var332, (byte) 95).field8174;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field9986[--field9970];
                    field9987 -= 3;
                    int var334 = field9972[field9987];
                    int var335 = field9972[field9987 + 1];
                    int var336 = field9972[field9987 + 2];
                    class196.method1367(var334 == 1, var335, 0, var336, var333);
                    field9972[field9987++] = class109.field1518;
                    return;
                }
                if (arg0 == 4215) {
                    field9970 -= 2;
                    field9987 -= 2;
                    String var337 = field9986[field9970];
                    int var338 = field9972[field9987];
                    int var339 = field9972[field9987 + 1];
                    String var340 = field9986[field9970 + 1];
                    class157.method1157(117, var339, var338 == 1, var337, var340);
                    field9972[field9987++] = class109.field1518;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field9987 -= 2;
                    int var341 = field9972[field9987];
                    int var342 = field9972[field9987 + 1];
                    class323 var343 = class153.field2479.method1653(var342, (byte) -119);
                    if (var343.method2055(6)) {
                        field9986[field9970++] = class74.field1032.method3327(var341, false).method2197(var343.field4612, var342, -1);
                        return;
                    }
                    field9972[field9987++] = class74.field1032.method3327(var341, false).method2194((byte) 93, var342, var343.field4610);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field9987 -= 2;
                    int var344 = field9972[field9987];
                    int var345 = field9972[field9987 + 1];
                    class323 var346 = class153.field2479.method1653(var345, (byte) -119);
                    if (var346.method2055(6)) {
                        field9986[field9970++] = class239.field3470.method388(var344, 100).method1433(57, var346.field4612, var345);
                        return;
                    }
                    field9972[field9987++] = class239.field3470.method388(var344, 100).method1434(var346.field4610, var345, -89);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field9987 -= 2;
                    int var347 = field9972[field9987];
                    int var348 = field9972[field9987 + 1];
                    class323 var349 = class153.field2479.method1653(var348, (byte) -119);
                    if (var349.method2055(6)) {
                        field9986[field9970++] = class209.field3066.method3484(var347, false).method4072(var349.field4612, var348, (byte) 88);
                        return;
                    }
                    field9972[field9987++] = class209.field3066.method3484(var347, false).method4077(var348, var349.field4610, (byte) -27);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field9972[--field9987];
                class264 var351 = class95.field1354.method2828(false, var350);
                if (var351.field3755 != null && var351.field3755.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field3731[0];
                    for (int var354 = 1; var354 < var351.field3755.length; var354++) {
                        if (var351.field3731[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field3731[var354];
                        }
                    }
                    field9972[field9987++] = var351.field3755[var352];
                    return;
                }
                field9972[field9987++] = var351.field3766;
                return;
            }
        } else {
            class46 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class405.method2580(field9972[--field9987], 106);
            } else {
                var51 = arg1 ? field9988 : field9989;
            }
            if (arg0 == 1300) {
                int var52 = field9972[--field9987] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method334(-17, field9986[--field9970], var52);
                    return;
                }
                field9970--;
                return;
            }
            if (arg0 == 1301) {
                field9987 -= 2;
                int var53 = field9972[field9987];
                int var54 = field9972[field9987 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field593 = null;
                    return;
                }
                var51.field593 = class700.method3972(var53, var54, true);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field9972[--field9987];
                if (class689.field9508 != var55 && class596.field8445 != var55 && class173.field2686 != var55) {
                    return;
                }
                var51.field553 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field535 = field9972[--field9987];
                return;
            }
            if (arg0 == 1304) {
                var51.field597 = field9972[--field9987];
                return;
            }
            if (arg0 == 1305) {
                var51.field612 = field9986[--field9970];
                return;
            }
            if (arg0 == 1306) {
                var51.field517 = field9986[--field9970];
                return;
            }
            if (arg0 == 1307) {
                var51.field611 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field657 = field9972[--field9987];
                var51.field667 = field9972[--field9987];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field9972[--field9987];
                int var57 = field9972[--field9987];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method353(var56, 67, var57 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field645 = field9986[--field9970];
                return;
            }
            if (arg0 == 1311) {
                var51.field564 = field9972[--field9987];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field9987 -= 3;
                    var58 = field9972[field9987] - 1;
                    var59 = field9972[field9987 + 1];
                    var60 = field9972[field9987 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field9987 -= 2;
                    var58 = 10;
                    var59 = field9972[field9987];
                    var60 = field9972[field9987 + 1];
                }
                if (var51.field660 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field660 = new byte[11];
                    var51.field684 = new byte[11];
                    var51.field632 = new int[11];
                }
                var51.field660[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field572 = false;
                    for (int var61 = 0; var61 < var51.field660.length; var61++) {
                        if (var51.field660[var61] != 0) {
                            var51.field572 = true;
                            break;
                        }
                    }
                } else {
                    var51.field572 = true;
                }
                var51.field684[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field653 = field9972[--field9987];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ldca;)V")
    public static final void method4025(class177 arg0) {
        method4028(arg0, 200000);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    private static final void method4026(int arg0) {
        class46 var1 = class405.method2580(arg0, 64);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class46[] var3 = class365.field5282[var2];
        if (var3 == null) {
            class46[] var4 = class86.field1229[var2];
            int var5 = var4.length;
            var3 = class365.field5282[var2] = new class46[var5];
            class319.method2017(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class319.method2017(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(IZ)V")
    private static final void method4027(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field9972[field9987++] = class587.field8318;
                return;
            }
            if (arg0 == 5001) {
                field9987 -= 3;
                class587.field8318 = field9972[field9987];
                class66.field941 = class83.method663((byte) -50, field9972[field9987 + 1]);
                if (class66.field941 == null) {
                    class66.field941 = class296.field4207;
                }
                class327.field4665 = field9972[field9987 + 2];
                field9977++;
                class468 var2 = class93.method734(class29.field284, class657.field9202, 8174);
                var2.field6839.method3730(103, class587.field8318);
                var2.field6839.method3730(120, class66.field941.field6167);
                var2.field6839.method3730(101, class327.field4665);
                class120.method872((byte) 102, var2);
                return;
            }
            if (arg0 == 5002) {
                field9970 -= 2;
                String var3 = field9986[field9970];
                String var4 = field9986[field9970 + 1];
                field9987 -= 2;
                int var5 = field9972[field9987];
                int var6 = field9972[field9987 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field9980++;
                class468 var7 = class93.method734(class29.field284, class451.field6667, 8174);
                var7.field6839.method3730(109, class574.method3322(var3, 16383) + class574.method3322(var4, 16383) + 2);
                var7.field6839.method3692(120, var3);
                var7.field6839.method3730(109, var5 - 1);
                var7.field6839.method3730(126, var6);
                var7.field6839.method3692(126, var4);
                class120.method872((byte) -70, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field9972[--field9987];
                class710 var9 = class309.method1955((byte) 125, var8);
                String var10 = "";
                if (var9 != null && var9.field10002 != null) {
                    var10 = var9.field10002;
                }
                field9986[field9970++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field9972[--field9987];
                class710 var12 = class309.method1955((byte) 126, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field9996;
                }
                field9972[field9987++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class66.field941 == null) {
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = class66.field941.field6167;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field9972[--field9987];
                class468 var15 = class93.method734(class29.field284, class254.field3652, 8174);
                var15.field6839.method3730(126, var14);
                class120.method872((byte) 54, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field9986[--field9970];
                method4030(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field9970 -= 2;
                String var17 = field9986[field9970];
                String var18 = field9986[field9970 + 1];
                if (class245.field3569 != 0 || (!class185.field2825 || class83.field1166) && !class394.field5929) {
                    field9982++;
                    class468 var19 = class93.method734(class29.field284, class25.field257, 8174);
                    var19.field6839.method3730(111, 0);
                    int var20 = var19.field6839.field9084;
                    var19.field6839.method3692(122, var17);
                    class356.method2229(var18, var19.field6839, true);
                    var19.field6839.method3746(var19.field6839.field9084 - var20, 87);
                    class120.method872((byte) 103, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field9972[--field9987];
                class710 var22 = class309.method1955((byte) 124, var21);
                String var23 = "";
                if (var22 != null && var22.field9998 != null) {
                    var23 = var22.field9998;
                }
                field9986[field9970++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field9972[--field9987];
                class710 var25 = class309.method1955((byte) 124, var24);
                String var26 = "";
                if (var25 != null && var25.field10005 != null) {
                    var26 = var25.field10005;
                }
                field9986[field9970++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field9972[--field9987];
                class710 var28 = class309.method1955((byte) 124, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field9997;
                }
                field9972[field9987++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class130.field1749 == null || class130.field1749.field9522 == null) {
                    var30 = "";
                } else {
                    var30 = class130.field1749.method3917((byte) 101, true);
                }
                field9986[field9970++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field9972[field9987++] = class327.field4665;
                return;
            }
            if (arg0 == 5017) {
                field9972[field9987++] = class246.method1638(-22952);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field9972[--field9987];
                class710 var32 = class309.method1955((byte) 126, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field10006;
                }
                field9972[field9987++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field9972[--field9987];
                class710 var35 = class309.method1955((byte) 125, var34);
                String var36 = "";
                if (var35 != null && var35.field10007 != null) {
                    var36 = var35.field10007;
                }
                field9986[field9970++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class130.field1749 == null || class130.field1749.field9522 == null) {
                    var37 = "";
                } else {
                    var37 = class130.field1749.method3916((byte) -109, false);
                }
                field9986[field9970++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field9972[--field9987];
                class710 var39 = class309.method1955((byte) 126, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field10008;
                }
                field9972[field9987++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field9972[--field9987];
                class710 var42 = class309.method1955((byte) 126, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field10000;
                }
                field9972[field9987++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field9972[--field9987];
                class710 var45 = class309.method1955((byte) 127, var44);
                String var46 = "";
                if (var45 != null && var45.field10001 != null) {
                    var46 = var45.field10001;
                }
                field9986[field9970++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field9972[--field9987];
                field9986[field9970++] = class33.field334.method887(var47, 56).field7941;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field9972[--field9987];
                class557 var49 = class33.field334.method887(var48, -97);
                if (var49.field7947 == null) {
                    field9972[field9987++] = 0;
                    return;
                }
                field9972[field9987++] = var49.field7947.length;
                return;
            }
            if (arg0 == 5052) {
                field9987 -= 2;
                int var50 = field9972[field9987];
                int var51 = field9972[field9987 + 1];
                class557 var52 = class33.field334.method887(var50, 75);
                int var53 = var52.field7947[var51];
                field9972[field9987++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field9972[--field9987];
                class557 var55 = class33.field334.method887(var54, 46);
                if (var55.field7950 == null) {
                    field9972[field9987++] = 0;
                    return;
                }
                field9972[field9987++] = var55.field7950.length;
                return;
            }
            if (arg0 == 5054) {
                field9987 -= 2;
                int var56 = field9972[field9987];
                int var57 = field9972[field9987 + 1];
                field9972[field9987++] = class33.field334.method887(var56, -128).field7950[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field9972[--field9987];
                field9986[field9970++] = class31.field325.method1720(var58, 1).method3237((byte) 109);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field9972[--field9987];
                class554 var60 = class31.field325.method1720(var59, 1);
                if (var60.field7906 == null) {
                    field9972[field9987++] = 0;
                    return;
                }
                field9972[field9987++] = var60.field7906.length;
                return;
            }
            if (arg0 == 5057) {
                field9987 -= 2;
                int var61 = field9972[field9987];
                int var62 = field9972[field9987 + 1];
                field9972[field9987++] = class31.field325.method1720(var61, 1).field7906[var62];
                return;
            }
            if (arg0 == 5058) {
                field9991 = new class86();
                field9991.field1227 = field9972[--field9987];
                field9991.field1230 = class31.field325.method1720(field9991.field1227, 1);
                field9991.field1225 = new int[field9991.field1230.method3235(6359)];
                return;
            }
            if (arg0 == 5059) {
                field9976++;
                class468 var63 = class93.method734(class29.field284, class645.field9048, 8174);
                var63.field6839.method3730(115, 0);
                int var64 = var63.field6839.field9084;
                var63.field6839.method3730(121, 0);
                var63.field6839.method3702(field9991.field1227, (byte) -127);
                field9991.field1230.method3232(var63.field6839, 88, field9991.field1225);
                var63.field6839.method3746(var63.field6839.field9084 - var64, 107);
                class120.method872((byte) -79, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field9986[--field9970];
                field9973++;
                class468 var66 = class93.method734(class29.field284, class656.field9194, 8174);
                var66.field6839.method3730(113, 0);
                int var67 = var66.field6839.field9084;
                var66.field6839.method3692(119, var65);
                var66.field6839.method3702(field9991.field1227, (byte) -117);
                field9991.field1230.method3232(var66.field6839, 103, field9991.field1225);
                var66.field6839.method3746(var66.field6839.field9084 - var67, 105);
                class120.method872((byte) -93, var66);
                return;
            }
            if (arg0 == 5061) {
                field9976++;
                class468 var68 = class93.method734(class29.field284, class645.field9048, 8174);
                var68.field6839.method3730(111, 0);
                int var69 = var68.field6839.field9084;
                var68.field6839.method3730(127, 1);
                var68.field6839.method3702(field9991.field1227, (byte) -118);
                field9991.field1230.method3232(var68.field6839, 120, field9991.field1225);
                var68.field6839.method3746(var68.field6839.field9084 - var69, -87);
                class120.method872((byte) 85, var68);
                return;
            }
            if (arg0 == 5062) {
                field9987 -= 2;
                int var70 = field9972[field9987];
                int var71 = field9972[field9987 + 1];
                field9972[field9987++] = class33.field334.method887(var70, 88).field7944[var71];
                return;
            }
            if (arg0 == 5063) {
                field9987 -= 2;
                int var72 = field9972[field9987];
                int var73 = field9972[field9987 + 1];
                field9972[field9987++] = class33.field334.method887(var72, 113).field7951[var73];
                return;
            }
            if (arg0 == 5064) {
                field9987 -= 2;
                int var74 = field9972[field9987];
                int var75 = field9972[field9987 + 1];
                if (var75 == -1) {
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = class33.field334.method887(var74, 49).method3244(-3, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field9987 -= 2;
                int var76 = field9972[field9987];
                int var77 = field9972[field9987 + 1];
                if (var77 == -1) {
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = class33.field334.method887(var76, -120).method3245((char) var77, -4845);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field9972[--field9987];
                field9972[field9987++] = class31.field325.method1720(var78, 1).method3235(6359);
                return;
            }
            if (arg0 == 5067) {
                field9987 -= 2;
                int var79 = field9972[field9987];
                int var80 = field9972[field9987 + 1];
                int var81 = class31.field325.method1720(var79, 1).method3233(85, var80).field3412;
                field9972[field9987++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field9987 -= 2;
                int var82 = field9972[field9987];
                int var83 = field9972[field9987 + 1];
                field9991.field1225[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field9987 -= 2;
                int var84 = field9972[field9987];
                int var85 = field9972[field9987 + 1];
                field9991.field1225[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field9987 -= 3;
                int var86 = field9972[field9987];
                int var87 = field9972[field9987 + 1];
                int var88 = field9972[field9987 + 2];
                class554 var89 = class31.field325.method1720(var86, 1);
                if (var89.method3233(81, var87).field3412 != 0) {
                    throw new RuntimeException("bad command");
                }
                field9972[field9987++] = var89.method3231(0, var87, var88);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field9986[--field9970];
                boolean var91 = field9972[--field9987] == 1;
                class279.method1781(var91, -2, var90);
                field9972[field9987++] = class109.field1518;
                return;
            }
            if (arg0 == 5072) {
                if (class355.field5164 != null && class671.field9361 < class109.field1518) {
                    field9972[field9987++] = class355.field5164[class671.field9361++] & 0xFFFF;
                    return;
                }
                field9972[field9987++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class671.field9361 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class35.field371.method2474(86, (byte) 126)) {
                    field9972[field9987++] = 1;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class35.field371.method2474(82, (byte) 119)) {
                    field9972[field9987++] = 1;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class35.field371.method2474(81, (byte) 127)) {
                    field9972[field9987++] = 1;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class94.method744(true, field9972[--field9987]);
                return;
            }
            if (arg0 == 5201) {
                field9972[field9987++] = class630.method3634(false);
                return;
            }
            if (arg0 == 5205) {
                class653.method3782(-1, -126, field9972[--field9987], false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field9972[--field9987];
                class120 var93 = class84.method681(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = var93.field1641;
                return;
            }
            if (arg0 == 5207) {
                class120 var94 = class84.method672(field9972[--field9987]);
                if (var94 != null && var94.field1634 != null) {
                    field9986[field9970++] = var94.field1634;
                    return;
                }
                field9986[field9970++] = "";
                return;
            }
            if (arg0 == 5208) {
                field9972[field9987++] = class678.field9432;
                field9972[field9987++] = class751.field10497;
                return;
            }
            if (arg0 == 5209) {
                field9972[field9987++] = class84.field1201 + class633.field8862;
                field9972[field9987++] = client.field4272 + class84.field1190;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field9972[--field9987];
                class120 var96 = class84.method672(var95);
                if (var96 == null) {
                    field9972[field9987++] = 0;
                    field9972[field9987++] = 0;
                    return;
                }
                field9972[field9987++] = var96.field1652 >> 14 & 0x3FFF;
                field9972[field9987++] = var96.field1652 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field9972[--field9987];
                class120 var98 = class84.method672(var97);
                if (var98 == null) {
                    field9972[field9987++] = 0;
                    field9972[field9987++] = 0;
                    return;
                }
                field9972[field9987++] = var98.field1645 - var98.field1649;
                field9972[field9987++] = var98.field1640 - var98.field1644;
                return;
            }
            if (arg0 == 5212) {
                class622 var99 = class146.method1017((byte) 114);
                if (var99 == null) {
                    field9972[field9987++] = -1;
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = var99.field8729;
                int var100 = var99.field8725 << 28 | class84.field1201 + var99.field8732 << 14 | class84.field1190 + var99.field8735;
                field9972[field9987++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class622 var101 = class642.method3680(78);
                if (var101 == null) {
                    field9972[field9987++] = -1;
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = var101.field8729;
                int var102 = var101.field8725 << 28 | class84.field1201 + var101.field8732 << 14 | class84.field1190 + var101.field8735;
                field9972[field9987++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field9972[--field9987];
                class120 var104 = class566.method3297(-118);
                if (var104 != null) {
                    boolean var105 = var104.method873(var103 >> 28 & 0x3, -57, var103 & 0x3FFF, var103 >> 14 & 0x3FFF, field9993);
                    if (var105) {
                        class762.method4232(field9993[2], field9993[1], (byte) 125);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field9987 -= 2;
                int var106 = field9972[field9987];
                int var107 = field9972[field9987 + 1];
                class603 var108 = class84.method689(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class120 var110 = (class120) var108.method3508(-2); var110 != null; var110 = (class120) var108.method3507(-73)) {
                    if (var110.field1641 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field9972[field9987++] = 1;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field9972[--field9987];
                class120 var112 = class84.method672(var111);
                if (var112 == null) {
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = var112.field1646;
                return;
            }
            if (arg0 == 5220) {
                field9972[field9987++] = class735.field10311 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field9972[--field9987];
                class762.method4232(var113 & 0x3FFF, var113 >> 14 & 0x3FFF, (byte) 122);
                return;
            }
            if (arg0 == 5222) {
                class120 var114 = class566.method3297(-101);
                if (var114 != null) {
                    boolean var115 = var114.method871(class84.field1201 + class633.field8862, client.field4272 + class84.field1190, (byte) 45, field9993);
                    if (var115) {
                        field9972[field9987++] = field9993[1];
                        field9972[field9987++] = field9993[2];
                        return;
                    }
                    field9972[field9987++] = -1;
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = -1;
                field9972[field9987++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field9987 -= 2;
                int var116 = field9972[field9987];
                int var117 = field9972[field9987 + 1];
                class653.method3782(var117 & 0x3FFF, -85, var116, false, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field9972[--field9987];
                class120 var119 = class566.method3297(-120);
                if (var119 != null) {
                    boolean var120 = var119.method873(var118 >> 28 & 0x3, -106, var118 & 0x3FFF, var118 >> 14 & 0x3FFF, field9993);
                    if (var120) {
                        field9972[field9987++] = field9993[1];
                        field9972[field9987++] = field9993[2];
                        return;
                    }
                    field9972[field9987++] = -1;
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = -1;
                field9972[field9987++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field9972[--field9987];
                class120 var122 = class566.method3297(-109);
                if (var122 != null) {
                    boolean var123 = var122.method871(var121 >> 14 & 0x3FFF, var121 & 0x3FFF, (byte) 45, field9993);
                    if (var123) {
                        field9972[field9987++] = field9993[1];
                        field9972[field9987++] = field9993[2];
                        return;
                    }
                    field9972[field9987++] = -1;
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = -1;
                field9972[field9987++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class461.method2814(field9972[--field9987], -99);
                return;
            }
            if (arg0 == 5227) {
                field9987 -= 2;
                int var124 = field9972[field9987];
                int var125 = field9972[field9987 + 1];
                class653.method3782(var125 & 0x3FFF, -89, var124, true, var125 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class575.field8135 = field9972[--field9987] == 1;
                return;
            }
            if (arg0 == 5229) {
                field9972[field9987++] = class575.field8135 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field9972[--field9987];
                class618.method3561(var126, 3);
                return;
            }
            if (arg0 == 5231) {
                field9987 -= 2;
                int var127 = field9972[field9987];
                boolean var128 = field9972[field9987 + 1] == 1;
                if (class382.field5761 != null) {
                    class184 var129 = class382.field5761.method2287((long) var127, (byte) -117);
                    if (var129 != null && !var128) {
                        var129.method1304((byte) 7);
                        return;
                    }
                    if (var129 == null && var128) {
                        class184 var130 = new class184();
                        class382.field5761.method2278((byte) -126, (long) var127, var130);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field9972[--field9987];
                if (class382.field5761 != null) {
                    class184 var132 = class382.field5761.method2287((long) var131, (byte) -117);
                    field9972[field9987++] = var132 == null ? 0 : 1;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field9987 -= 2;
                int var133 = field9972[field9987];
                boolean var134 = field9972[field9987 + 1] == 1;
                if (class391.field5887 != null) {
                    class184 var135 = class391.field5887.method2287((long) var133, (byte) -117);
                    if (var135 != null && !var134) {
                        var135.method1304((byte) 7);
                        return;
                    }
                    if (var135 == null && var134) {
                        class184 var136 = new class184();
                        class391.field5887.method2278((byte) -37, (long) var133, var136);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field9972[--field9987];
                if (class391.field5887 != null) {
                    class184 var138 = class391.field5887.method2287((long) var137, (byte) -117);
                    field9972[field9987++] = var138 == null ? 0 : 1;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field9972[field9987++] = class84.field1177 == null ? -1 : class84.field1177.field1641;
                return;
            }
            if (arg0 == 5236) {
                field9987 -= 2;
                int var139 = field9972[field9987];
                int var140 = field9972[field9987 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class254.method1671(var141, (byte) -87, var142, var139);
                if (var143 < 0) {
                    field9972[field9987++] = -1;
                    return;
                }
                field9972[field9987++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class565.method3291(14607);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field9987 -= 2;
                int var144 = field9972[field9987];
                int var145 = field9972[field9987 + 1];
                class417.method2633(false, var144, 3, var145, 4);
                field9972[field9987++] = class183.field2801 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class183.field2801 != null) {
                    class417.method2633(false, -1, class63.field916.field10172.method953(17503), -1, 4);
                }
                return;
            }
            if (arg0 == 5302) {
                class141[] var146 = class310.method1961(false);
                field9972[field9987++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field9972[--field9987];
                class141[] var148 = class310.method1961(false);
                field9972[field9987++] = var148[var147].field1860;
                field9972[field9987++] = var148[var147].field1861;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class185.field2824;
                int var150 = class701.field9754;
                int var151 = -1;
                class141[] var152 = class310.method1961(false);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class141 var154 = var152[var153];
                    if (var154.field1860 == var149 && var154.field1861 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field9972[field9987++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field9972[field9987++] = class756.method4219((byte) 8);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field9972[--field9987];
                if (var155 >= 1 && var155 <= 2) {
                    class417.method2633(false, -1, var155, -1, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field9972[field9987++] = class63.field916.field10172.method953(17503);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field9972[--field9987];
                if (var156 >= 1 && var156 <= 2) {
                    class63.field916.method4111(83, var156, class63.field916.field10172);
                    class63.field916.method4111(93, var156, class63.field916.field10180);
                    class585.method3384(-119);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field9970 -= 2;
                String var157 = field9986[field9970];
                String var158 = field9986[field9970 + 1];
                int var159 = field9972[--field9987];
                field9978++;
                class468 var160 = class93.method734(class29.field284, class218.field3210, 8174);
                var160.field6839.method3730(109, class574.method3322(var157, 16383) + class574.method3322(var158, 16383) + 1);
                var160.field6839.method3692(120, var157);
                var160.field6839.method3692(123, var158);
                var160.field6839.method3730(106, var159);
                class120.method872((byte) -67, var160);
                return;
            }
            if (arg0 == 5401) {
                field9987 -= 2;
                class751.field10499[field9972[field9987]] = (short) class353.method2215(true, field9972[field9987 + 1]);
                class336.field4876.method2083(-119);
                class336.field4876.method2080(0);
                class74.field1032.method3323(true);
                class459.method2805(32);
                return;
            }
            if (arg0 == 5405) {
                field9987 -= 2;
                int var161 = field9972[field9987];
                int var162 = field9972[field9987 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class381.field5752[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field9987 -= 7;
                int var163 = field9972[field9987];
                int var164 = field9972[field9987 + 1] << 1;
                int var165 = field9972[field9987 + 2];
                int var166 = field9972[field9987 + 3];
                int var167 = field9972[field9987 + 4];
                int var168 = field9972[field9987 + 5];
                int var169 = field9972[field9987 + 6];
                if (var163 >= 0 && var163 < 2 && class381.field5752[var163] != null && var164 >= 0 && var164 < class381.field5752[var163].length) {
                    class381.field5752[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class381.field5752[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class381.field5752[field9972[--field9987]].length >> 1;
                field9972[field9987++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class183.field2801 != null) {
                    class417.method2633(false, -1, class63.field916.field10172.method953(17503), -1, 4);
                }
                if (class169.field2648 != null) {
                    class88.method708(false);
                    System.exit(0);
                    return;
                }
                String var171 = class79.field1108 == null ? class242.method1611(-16470) : class79.field1108;
                class425.method2658(class179.field2759, false, (byte) -16, class63.field916.field10200.method3848(17503) == 1, var171);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class638.field8956 != null) {
                    if (class638.field8956.field2990 == null) {
                        var172 = class98.method757(-92, class638.field8956.field2987);
                    } else {
                        var172 = (String) class638.field8956.field2990;
                    }
                }
                field9986[field9970++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field9972[field9987++] = class179.field2759.field10019 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class183.field2801 != null) {
                    class417.method2633(false, -1, class63.field916.field10172.method953(17503), -1, 4);
                }
                String var173 = field9986[--field9970];
                boolean var174 = field9972[--field9987] == 1;
                String var175 = class242.method1611(-16470) + var173;
                class425.method2658(class179.field2759, var174, (byte) -16, class63.field916.field10200.method3848(17503) == 1, var175);
                return;
            }
            if (arg0 == 5422) {
                field9970 -= 2;
                String var176 = field9986[field9970];
                String var177 = field9986[field9970 + 1];
                int var178 = field9972[--field9987];
                if (var176.length() > 0) {
                    if (class74.field1031 == null) {
                        class74.field1031 = new String[class710.field10009[class199.field2993.field6820]];
                    }
                    class74.field1031[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class194.field2945 == null) {
                        class194.field2945 = new String[class710.field10009[class199.field2993.field6820]];
                    }
                    class194.field2945[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field9986[--field9970]);
                return;
            }
            if (arg0 == 5424) {
                field9987 -= 11;
                class189.field2863 = field9972[field9987];
                class531.field7572 = field9972[field9987 + 1];
                class290.field4153 = field9972[field9987 + 2];
                class149.field2332 = field9972[field9987 + 3];
                class659.field9230 = field9972[field9987 + 4];
                class725.field10113 = field9972[field9987 + 5];
                class706.field9944 = field9972[field9987 + 6];
                class342.field4970 = field9972[field9987 + 7];
                class328.field4672 = field9972[field9987 + 8];
                class346.field4999 = field9972[field9987 + 9];
                class433.field6447 = field9972[field9987 + 10];
                class640.field8990.method208(class659.field9230, (byte) 70);
                class640.field8990.method208(class725.field10113, (byte) 70);
                class640.field8990.method208(class706.field9944, (byte) 70);
                class640.field8990.method208(class342.field4970, (byte) 70);
                class640.field8990.method208(class328.field4672, (byte) 70);
                class421.field6279 = null;
                class222.field3265 = null;
                class304.field4312 = null;
                class597.field8461 = null;
                class273.field3883 = null;
                class337.field4914 = null;
                class750.field10491 = null;
                class182.field2800 = null;
                class332.field4768 = true;
                return;
            }
            if (arg0 == 5425) {
                class189.method1317((byte) 58);
                class332.field4768 = false;
                return;
            }
            if (arg0 == 5426) {
                field9987 -= 2;
                class734.field10270 = field9972[field9987];
                class164.field2593 = field9972[field9987 + 1];
                return;
            }
            if (arg0 == 5427) {
                field9987 -= 2;
                class481.field6964 = field9972[field9987 + 1];
                return;
            }
            if (arg0 == 5428) {
                field9987 -= 2;
                int var179 = field9972[field9987];
                int var180 = field9972[field9987 + 1];
                field9972[field9987++] = class561.method3278(-1004, var180, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class284.method1822(false, false, 29061, field9986[--field9970]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class121.method877(class466.field6830, "accountcreated", -22421);
                    return;
                } catch (Throwable var324) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class121.method877(class466.field6830, "accountcreatestarted", -22421);
                    return;
                } catch (Throwable var325) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class365.field5271 != null) {
                    Transferable var182 = class365.field5271.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var326) {
                        }
                    }
                }
                field9986[field9970++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class266.field3802 = field9972[--field9987];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field9987 -= 4;
                int var183 = field9972[field9987];
                int var184 = field9972[field9987 + 1];
                int var185 = field9972[field9987 + 2];
                int var186 = field9972[field9987 + 3];
                class750.method4184((var183 & 0x3FFF) - class582.field8288, (var183 >> 14 & 0x3FFF) - class361.field5224, var184 << 2, var186, (byte) -116, false, var185);
                return;
            }
            if (arg0 == 5501) {
                field9987 -= 4;
                int var187 = field9972[field9987];
                int var188 = field9972[field9987 + 1];
                int var189 = field9972[field9987 + 2];
                int var190 = field9972[field9987 + 3];
                class185.method1305(var190, true, (var187 & 0x3FFF) - class582.field8288, var189, var188 << 2, (var187 >> 14 & 0x3FFF) - class361.field5224);
                return;
            }
            if (arg0 == 5502) {
                field9987 -= 6;
                int var191 = field9972[field9987];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class520.field7451 = var191;
                int var192 = field9972[field9987 + 1];
                if (var192 + 1 >= class381.field5752[class520.field7451].length >> 1) {
                    throw new RuntimeException();
                }
                class379.field5734 = var192;
                class479.field6953 = 0;
                class310.field4395 = field9972[field9987 + 2];
                class730.field10231 = field9972[field9987 + 3];
                int var193 = field9972[field9987 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class70.field988 = var193;
                int var194 = field9972[field9987 + 5];
                if (var194 + 1 >= class381.field5752[class70.field988].length >> 1) {
                    throw new RuntimeException();
                }
                class466.field6832 = var194;
                class264.field3784 = 3;
                class67.field967 = -1;
                class656.field9191 = -1;
                return;
            }
            if (arg0 == 5503) {
                class80.method650(-87);
                return;
            }
            if (arg0 == 5504) {
                field9987 -= 2;
                class502.method2985((byte) 76, field9972[field9987 + 1], field9972[field9987], 0);
                return;
            }
            if (arg0 == 5505) {
                field9972[field9987++] = (int) class418.field6261 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field9972[field9987++] = (int) class255.field3659 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class357.method2231(1);
                return;
            }
            if (arg0 == 5508) {
                class251.method1652(32015);
                return;
            }
            if (arg0 == 5509) {
                class414.method2624(1);
                return;
            }
            if (arg0 == 5510) {
                class46.method333(0);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field9972[--field9987];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class361.field5224;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class194.field2946) {
                    var198 = class194.field2946;
                }
                int var199 = var197 - class582.field8288;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class255.field3656) {
                    var199 = class255.field3656;
                }
                class189.field2869 = (var198 << 9) + 256;
                class537.field7685 = (var199 << 9) + 256;
                class264.field3784 = 4;
                class67.field967 = -1;
                class656.field9191 = -1;
                return;
            }
            if (arg0 == 5512) {
                class717.method4070((byte) -115);
                return;
            }
            if (arg0 == 5514) {
                class188.field2856 = field9972[--field9987];
                return;
            }
            if (arg0 == 5516) {
                field9972[field9987++] = class188.field2856;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field9972[--field9987];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class361.field5224;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class194.field2946) {
                        var203 = class194.field2946;
                    }
                    int var204 = var202 - class582.field8288;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class255.field3656) {
                        var204 = class255.field3656;
                    }
                    class656.field9191 = (var203 << 9) + 256;
                    class67.field967 = (var204 << 9) + 256;
                    return;
                }
                class656.field9191 = -1;
                class67.field967 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field9970 -= 2;
                String var205 = field9986[field9970];
                String var206 = field9986[field9970 + 1];
                int var207 = field9972[--field9987];
                if (var205.length() > 320) {
                    return;
                }
                if (class87.field1246 != 3) {
                    return;
                }
                if (class233.field3400 == 0 && class661.field9245 == 0) {
                    class100.field1424 = var205;
                    class273.field3888 = var206;
                    class92.field1284 = var207;
                    class49.method363(6, -59);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class232.method1549(619);
                return;
            }
            if (arg0 == 5602) {
                if (class233.field3400 == 0) {
                    class739.field10367 = -2;
                    class209.field3057 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field9970--;
                if (class87.field1246 != 3) {
                    return;
                }
                if (class233.field3400 == 0 && class661.field9245 == 0) {
                    class456.method2794(field9986[field9970], (byte) 108);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field9970 -= 2;
                field9987 -= 2;
                if (class87.field1246 != 3) {
                    return;
                }
                if (class233.field3400 == 0 && class661.field9245 == 0) {
                    class188.method1313(false, field9972[field9987 + 1] == 1, field9986[field9970 + 1], field9972[field9987], field9986[field9970]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class661.field9245 == 0) {
                    class313.field4434 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field9972[field9987++] = class209.field3057;
                return;
            }
            if (arg0 == 5608) {
                field9972[field9987++] = class284.field4038;
                return;
            }
            if (arg0 == 5609) {
                field9972[field9987++] = class313.field4434;
                return;
            }
            if (arg0 == 5611) {
                field9972[field9987++] = class194.field2941;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field9972[--field9987];
                if (class87.field1246 != 7) {
                    return;
                }
                if (class233.field3400 == 0 && class661.field9245 == 0) {
                    if (class533.field7668 != null) {
                        class533.field7668.method850(2);
                        class533.field7668 = null;
                    }
                    class92.field1284 = var208;
                    class49.method363(9, -32);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field9972[field9987++] = class209.field3057;
                return;
            }
            if (arg0 == 5615) {
                field9970 -= 2;
                String var209 = field9986[field9970];
                String var210 = field9986[field9970 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class87.field1246 != 3) {
                    return;
                }
                if (class233.field3400 == 0 && class661.field9245 == 0) {
                    if (class533.field7668 != null) {
                        class533.field7668.method850(2);
                        class533.field7668 = null;
                    }
                    class100.field1424 = var209;
                    class273.field3888 = var210;
                    class49.method363(5, 109);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class109.method812(false, (byte) -21);
                return;
            }
            if (arg0 == 5617) {
                field9972[field9987++] = class739.field10367;
                return;
            }
            if (arg0 == 5618) {
                field9987--;
                return;
            }
            if (arg0 == 5619) {
                field9987--;
                return;
            }
            if (arg0 == 5620) {
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field9970 -= 2;
                field9987 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class72.field1015 != null) {
                    field9972[field9987++] = 1;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field9972[field9987++] = (int) (class293.field4177 >> 32);
                field9972[field9987++] = (int) (class293.field4177 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field9972[field9987++] = class8.field108 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class8.field108 = true;
                class461.method2813(true);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field9972[--field9987];
                class63.field916.method4111(93, var211, class63.field916.field10190);
                class63.method563(-11);
                class585.method3384(-88);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field9972[--field9987] == 1;
                class63.field916.method4111(82, var212 ? 1 : 0, class63.field916.field10182);
                class63.field916.method4111(108, var212 ? 1 : 0, class63.field916.field10204);
                class63.method563(-11);
                class603.method3502(120);
                class585.method3384(27);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field9972[--field9987] == 1;
                class63.field916.method4111(82, var213 ? 2 : 1, class63.field916.field10199);
                class63.field916.method4111(120, var213 ? 2 : 1, class63.field916.field10203);
                class603.method3502(110);
                class585.method3384(21);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6005) {
                class63.field916.method4111(112, field9972[--field9987] == 1 ? 1 : 0, class63.field916.field10193);
                class63.method563(-11);
                class585.method3384(-80);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6007) {
                class63.field916.method4111(82, field9972[--field9987], class63.field916.field10165);
                class585.method3384(120);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6008) {
                class63.field916.method4111(124, field9972[--field9987] == 1 ? 1 : 0, class63.field916.field10170);
                class585.method3384(39);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6010) {
                class63.field916.method4111(89, field9972[--field9987] == 1 ? 1 : 0, class63.field916.field10205);
                class585.method3384(125);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6011) {
                class63.field916.method4111(122, field9972[--field9987], class63.field916.field10185);
                class63.method563(-11);
                class585.method3384(13);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6012) {
                class63.field916.method4111(107, field9972[--field9987] == 1 ? 1 : 0, class63.field916.field10175);
                class438.method2708(false);
                class608.method3528(1);
                class585.method3384(-109);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6014) {
                class63.field916.method4111(64, field9972[--field9987] == 1 ? 2 : 0, class63.field916.field10166);
                class63.method563(-11);
                class585.method3384(72);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6015) {
                class63.field916.method4111(113, field9972[--field9987] == 1 ? 1 : 0, class63.field916.field10209);
                class63.method563(-11);
                class585.method3384(73);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6016) {
                class63.field916.method4111(85, field9972[--field9987], class63.field916.field10183);
                class134.method950(0, class63.field916.field10200.method3848(17503), false);
                class585.method3384(-119);
                return;
            }
            if (arg0 == 6017) {
                class63.field916.method4111(108, field9972[--field9987] == 1 ? 1 : 0, class63.field916.field10173);
                class412.method2617(-2);
                class585.method3384(23);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6018) {
                class63.field916.method4111(84, field9972[--field9987], class63.field916.field10189);
                class585.method3384(-123);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field9972[--field9987];
                int var215 = class63.field916.field10184.method2268(17503);
                if (var214 != var215) {
                    if (class239.method1585(class87.field1246, (byte) 119)) {
                        if (var215 == 0 && class9.field142 != -1) {
                            class187.method1308(var214, class299.field4244, 0, false, class9.field142, 0);
                            class718.method4079((byte) -86);
                            class202.field3022 = false;
                        } else if (var214 == 0) {
                            class54.method379((byte) -90);
                            class202.field3022 = false;
                        } else {
                            class183.method1298(0, var214);
                        }
                    }
                    class63.field916.method4111(81, var214, class63.field916.field10184);
                    class585.method3384(77);
                    class349.field5105 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class63.field916.method4111(92, field9972[--field9987], class63.field916.field10211);
                class585.method3384(47);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class63.field916.field10199.method3093(17503);
                class63.field916.method4111(106, field9972[--field9987] == 1 ? 0 : var216, class63.field916.field10203);
                class603.method3502(118);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field9972[--field9987];
                class63.field916.method4111(103, var217, class63.field916.field10174);
                class585.method3384(-117);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6024) {
                class63.field916.method4111(66, field9972[--field9987], class63.field916.field10196);
                class585.method3384(51);
                return;
            }
            if (arg0 == 6025) {
                class63.field916.method4111(103, field9972[--field9987], class63.field916.field10198);
                class585.method3384(64);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field9972[--field9987];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class429.method2674(var218 == 1, -23542);
                return;
            }
            if (arg0 == 6028) {
                class63.field916.method4111(67, field9972[--field9987] == 0 ? 0 : 1, class63.field916.field10163);
                class585.method3384(-125);
                return;
            }
            if (arg0 == 6029) {
                class63.field916.method4111(82, field9972[--field9987], class63.field916.field10165);
                class585.method3384(93);
                return;
            }
            if (arg0 == 6030) {
                class63.field916.method4111(88, field9972[--field9987] == 0 ? 0 : 1, class63.field916.field10207);
                class585.method3384(-118);
                class63.method563(-11);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field9972[--field9987];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class134.method950(0, var219, false);
                return;
            }
            if (arg0 == 6032) {
                field9987 -= 2;
                int var220 = field9972[field9987];
                boolean var221 = field9972[field9987 + 1] == 1;
                class63.field916.method4111(100, var220, class63.field916.field10177);
                if (!var221) {
                    class63.field916.method4111(75, 0, class63.field916.field10176);
                }
                class585.method3384(52);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6033) {
                class63.field916.method4111(124, field9972[--field9987], class63.field916.field10188);
                class585.method3384(-90);
                return;
            }
            if (arg0 == 6034) {
                class63.field916.method4111(68, field9972[--field9987] == 1 ? 1 : 0, class63.field916.field10162);
                class585.method3384(-66);
                class438.method2708(false);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class63.field916.field10182.method368(17503);
                class63.field916.method4111(81, field9972[--field9987] == 1 ? 1 : var222, class63.field916.field10204);
                class63.method563(-11);
                class603.method3502(89);
                return;
            }
            if (arg0 == 6036) {
                class63.field916.method4111(69, field9972[--field9987], class63.field916.field10160);
                class585.method3384(98);
                class424.field6300 = true;
                return;
            }
            if (arg0 == 6037) {
                class63.field916.method4111(94, field9972[--field9987], class63.field916.field10210);
                class585.method3384(61);
                class349.field5105 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field9972[--field9987];
                int var224 = class63.field916.field10164.method2268(17503);
                if (var223 != var224 && class9.field142 == class444.field6604) {
                    if (!class239.method1585(class87.field1246, (byte) 95)) {
                        if (var224 == 0) {
                            class187.method1308(var223, class299.field4244, 0, false, class9.field142, 0);
                            class718.method4079((byte) -86);
                            class202.field3022 = false;
                        } else if (var223 == 0) {
                            class54.method379((byte) -90);
                            class202.field3022 = false;
                        } else {
                            class183.method1298(0, var223);
                        }
                    }
                    class63.field916.method4111(116, var223, class63.field916.field10164);
                    class585.method3384(79);
                    class349.field5105 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field9972[--field9987];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class63.field916.field10171.method1226(17503)) {
                    class63.field916.method4111(89, var225, class63.field916.field10171);
                    class585.method3384(-70);
                    class349.field5105 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field9972[--field9987];
                if (var226 != class63.field916.field10194.method1327(17503)) {
                    class63.field916.method4111(122, var226, class63.field916.field10194);
                    class585.method3384(34);
                    class349.field5105 = false;
                    class56.method392(-1);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field9972[field9987++] = class63.field916.field10190.method1967(17503);
                return;
            }
            if (arg0 == 6102) {
                field9972[field9987++] = class63.field916.field10182.method368(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field9972[field9987++] = class63.field916.field10199.method3093(17503) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field9972[field9987++] = class63.field916.field10193.method2446(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field9972[field9987++] = class63.field916.field10165.method2588(17503);
                return;
            }
            if (arg0 == 6108) {
                field9972[field9987++] = class63.field916.field10170.method3053(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field9972[field9987++] = class63.field916.field10205.method3892(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field9972[field9987++] = class63.field916.field10185.method2160(17503);
                return;
            }
            if (arg0 == 6112) {
                field9972[field9987++] = class63.field916.field10175.method1990(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field9972[field9987++] = class63.field916.field10166.method4091(17503) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field9972[field9987++] = class63.field916.field10209.method3083(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field9972[field9987++] = class63.field916.field10183.method1426(17503);
                return;
            }
            if (arg0 == 6117) {
                field9972[field9987++] = class63.field916.field10173.method307(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field9972[field9987++] = class63.field916.field10189.method2268(17503);
                return;
            }
            if (arg0 == 6119) {
                field9972[field9987++] = class63.field916.field10184.method2268(17503);
                return;
            }
            if (arg0 == 6120) {
                field9972[field9987++] = class63.field916.field10211.method2268(17503);
                return;
            }
            if (arg0 == 6123) {
                field9972[field9987++] = class535.method3138(119);
                return;
            }
            if (arg0 == 6124) {
                field9972[field9987++] = class63.field916.field10196.method1426(17503);
                return;
            }
            if (arg0 == 6125) {
                field9972[field9987++] = class63.field916.field10198.method2966(17503);
                return;
            }
            if (arg0 == 6127) {
                field9972[field9987++] = class63.field916.field10201.method2846(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field9972[field9987++] = class63.field916.field10163.method2181(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field9972[field9987++] = class63.field916.field10165.method2588(17503);
                return;
            }
            if (arg0 == 6130) {
                field9972[field9987++] = class63.field916.field10207.method3961(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field9972[field9987++] = class63.field916.field10200.method3848(17503);
                return;
            }
            if (arg0 == 6132) {
                field9972[field9987++] = class63.field916.field10177.method3848(17503);
                return;
            }
            if (arg0 == 6133) {
                field9972[field9987++] = class179.field2759.field10019 && !class179.field2759.field10022 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field9972[field9987++] = class63.field916.field10188.method2650(17503);
                return;
            }
            if (arg0 == 6136) {
                field9972[field9987++] = class63.field916.field10162.method4009(17503) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field9972[field9987++] = class59.method410(class63.field916.field10200.method3848(17503), (byte) 109, 200);
                return;
            }
            if (arg0 == 6139) {
                field9972[field9987++] = class63.field916.field10160.method4217(17503);
                return;
            }
            if (arg0 == 6142) {
                field9972[field9987++] = class63.field916.field10210.method2268(17503);
                return;
            }
            if (arg0 == 6143) {
                field9972[field9987++] = class63.field916.field10164.method2268(17503);
                return;
            }
            if (arg0 == 6144) {
                field9972[field9987++] = class691.field9556 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field9972[field9987++] = class63.field916.field10171.method1226(17503);
                return;
            }
            if (arg0 == 6146) {
                field9972[field9987++] = class63.field916.field10194.method1327(17503);
                return;
            }
            if (arg0 == 6147) {
                field9972[field9987++] = class259.field3702.field7533 < 512 || class691.field9556 || class394.field5926 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field9972[field9987++] = class163.field2583 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field9987 -= 2;
                class57.field797 = (short) field9972[field9987];
                if (class57.field797 <= 0) {
                    class57.field797 = 256;
                }
                class697.field9613 = (short) field9972[field9987 + 1];
                if (class697.field9613 <= 0) {
                    class697.field9613 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field9987 -= 2;
                class180.field2772 = (short) field9972[field9987];
                if (class180.field2772 <= 0) {
                    class180.field2772 = 256;
                }
                class349.field5106 = (short) field9972[field9987 + 1];
                if (class349.field5106 <= 0) {
                    class349.field5106 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field9987 -= 4;
                class647.field9116 = (short) field9972[field9987];
                if (class647.field9116 <= 0) {
                    class647.field9116 = 1;
                }
                class333.field4781 = (short) field9972[field9987 + 1];
                if (class333.field4781 <= 0) {
                    class333.field4781 = 32767;
                } else if (class333.field4781 < class647.field9116) {
                    class333.field4781 = class647.field9116;
                }
                class554.field7908 = (short) field9972[field9987 + 2];
                if (class554.field7908 <= 0) {
                    class554.field7908 = 1;
                }
                class87.field1247 = (short) field9972[field9987 + 3];
                if (class87.field1247 <= 0) {
                    class87.field1247 = 32767;
                    return;
                }
                if (class87.field1247 < class554.field7908) {
                    class87.field1247 = class554.field7908;
                }
                return;
            }
            if (arg0 == 6203) {
                class444.method2753(class171.field2663.field574, 0, false, class171.field2663.field549, 0, 2514);
                field9972[field9987++] = class622.field8734;
                field9972[field9987++] = class548.field7826;
                return;
            }
            if (arg0 == 6204) {
                field9972[field9987++] = class180.field2772;
                field9972[field9987++] = class349.field5106;
                return;
            }
            if (arg0 == 6205) {
                field9972[field9987++] = class57.field797;
                field9972[field9987++] = class697.field9613;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field9972[field9987++] = (int) (class524.method3075(18) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field9972[field9987++] = (int) (class524.method3075(18) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field9987 -= 3;
                int var227 = field9972[field9987];
                int var228 = field9972[field9987 + 1];
                int var229 = field9972[field9987 + 2];
                field9967.clear();
                field9967.set(11, 12);
                field9967.set(var229, var228, var227);
                int var230 = (int) (field9967.getTime().getTime() / 86400000L) - 11745;
                if (var229 < 1970) {
                    var230--;
                }
                field9972[field9987++] = var230;
                return;
            }
            if (arg0 == 6303) {
                field9967.clear();
                field9967.setTime(new Date(class524.method3075(18)));
                field9972[field9987++] = field9967.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var231 = field9972[--field9987];
                boolean var232 = true;
                if (var231 < 0) {
                    var232 = (var231 + 1) % 4 == 0;
                } else if (var231 < 1582) {
                    var232 = var231 % 4 == 0;
                } else if (var231 % 4 != 0) {
                    var232 = false;
                } else if (var231 % 100 != 0) {
                    var232 = true;
                } else if (var231 % 400 != 0) {
                    var232 = false;
                }
                field9972[field9987++] = var232 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field9972[field9987++] = class195.method1355((byte) 108) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field9972[field9987++] = class153.method1131(2) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class87.field1246 == 7 && class233.field3400 == 0 && class661.field9245 == 0) {
                    if (class265.field3788) {
                        field9972[field9987++] = 0;
                        return;
                    }
                    if (class452.field6680 > class524.method3075(18) - 1000L) {
                        field9972[field9987++] = 1;
                        return;
                    }
                    class265.field3788 = true;
                    class468 var233 = class93.method734(class29.field284, class116.field1599, 8174);
                    var233.field6839.method3695(class4.field54, 255);
                    class120.method872((byte) 99, var233);
                    field9972[field9987++] = 0;
                    return;
                }
                field9972[field9987++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class218 var234 = class348.method2198(-14291);
                if (var234 != null) {
                    field9972[field9987++] = var234.field3212;
                    field9972[field9987++] = var234.field10496;
                    field9986[field9970++] = var234.field3208;
                    class300 var235 = var234.method1463(-1);
                    field9972[field9987++] = var235.field4252;
                    field9986[field9970++] = var235.field4251;
                    field9972[field9987++] = var234.field10500;
                    field9972[field9987++] = var234.field3209;
                    field9986[field9970++] = var234.field3214;
                    return;
                }
                field9972[field9987++] = -1;
                field9972[field9987++] = 0;
                field9986[field9970++] = "";
                field9972[field9987++] = 0;
                field9986[field9970++] = "";
                field9972[field9987++] = 0;
                field9972[field9987++] = 0;
                field9986[field9970++] = "";
                return;
            }
            if (arg0 == 6502) {
                class218 var236 = class510.method3022(96);
                if (var236 != null) {
                    field9972[field9987++] = var236.field3212;
                    field9972[field9987++] = var236.field10496;
                    field9986[field9970++] = var236.field3208;
                    class300 var237 = var236.method1463(-1);
                    field9972[field9987++] = var237.field4252;
                    field9986[field9970++] = var237.field4251;
                    field9972[field9987++] = var236.field10500;
                    field9972[field9987++] = var236.field3209;
                    field9986[field9970++] = var236.field3214;
                    return;
                }
                field9972[field9987++] = -1;
                field9972[field9987++] = 0;
                field9986[field9970++] = "";
                field9972[field9987++] = 0;
                field9986[field9970++] = "";
                field9972[field9987++] = 0;
                field9972[field9987++] = 0;
                field9986[field9970++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var238 = field9972[--field9987];
                String var239 = field9986[--field9970];
                if (class87.field1246 == 7 && class233.field3400 == 0 && class661.field9245 == 0) {
                    field9972[field9987++] = class660.method3806(var238, -26276, var239) ? 1 : 0;
                    return;
                }
                field9972[field9987++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var240 = field9972[--field9987];
                class218 var241 = class438.method2710((byte) 114, var240);
                if (var241 != null) {
                    field9972[field9987++] = var241.field10496;
                    field9986[field9970++] = var241.field3208;
                    class300 var242 = var241.method1463(-1);
                    field9972[field9987++] = var242.field4252;
                    field9986[field9970++] = var242.field4251;
                    field9972[field9987++] = var241.field10500;
                    field9972[field9987++] = var241.field3209;
                    field9986[field9970++] = var241.field3214;
                    return;
                }
                field9972[field9987++] = -1;
                field9986[field9970++] = "";
                field9972[field9987++] = 0;
                field9986[field9970++] = "";
                field9972[field9987++] = 0;
                field9972[field9987++] = 0;
                field9986[field9970++] = "";
                return;
            }
            if (arg0 == 6507) {
                field9987 -= 4;
                int var243 = field9972[field9987];
                boolean var244 = field9972[field9987 + 1] == 1;
                int var245 = field9972[field9987 + 2];
                boolean var246 = field9972[field9987 + 3] == 1;
                class375.method2427(var244, false, var243, var246, var245);
                return;
            }
            if (arg0 == 6508) {
                class690.method3925(-105);
                return;
            }
            if (arg0 == 6509) {
                if (class87.field1246 != 7) {
                    return;
                }
                class95.field1355 = field9972[--field9987] == 1;
                return;
            }
            if (arg0 == 6510) {
                field9972[field9987++] = class612.field8655;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class686.field9488 == class230.field3378) {
                if (arg0 == 6700) {
                    int var247 = class291.field4168.method2281(false);
                    if (class87.field1249 != -1) {
                        var247++;
                    }
                    field9972[field9987++] = var247;
                    return;
                }
                if (arg0 == 6701) {
                    int var248 = field9972[--field9987];
                    if (class87.field1249 != -1) {
                        if (var248 == 0) {
                            field9972[field9987++] = class87.field1249;
                            return;
                        }
                        var248--;
                    }
                    class421 var249 = (class421) class291.field4168.method2283(false);
                    while (var248-- > 0) {
                        var249 = (class421) class291.field4168.method2282((byte) 59);
                    }
                    field9972[field9987++] = var249.field6282;
                    return;
                }
                if (arg0 == 6702) {
                    int var250 = field9972[--field9987];
                    if (class86.field1229[var250] == null) {
                        field9986[field9970++] = "";
                        return;
                    }
                    String var251 = class86.field1229[var250][0].field560;
                    if (var251 == null) {
                        field9986[field9970++] = "";
                        return;
                    }
                    field9986[field9970++] = var251.substring(0, var251.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var252 = field9972[--field9987];
                    if (class86.field1229[var252] == null) {
                        field9972[field9987++] = 0;
                        return;
                    }
                    field9972[field9987++] = class86.field1229[var252].length;
                    return;
                }
                if (arg0 == 6704) {
                    field9987 -= 2;
                    int var253 = field9972[field9987];
                    int var254 = field9972[field9987 + 1];
                    if (class86.field1229[var253] == null) {
                        field9986[field9970++] = "";
                        return;
                    }
                    String var255 = class86.field1229[var253][var254].field560;
                    if (var255 == null) {
                        field9986[field9970++] = "";
                        return;
                    }
                    field9986[field9970++] = var255;
                    return;
                }
                if (arg0 == 6705) {
                    field9987 -= 2;
                    int var256 = field9972[field9987];
                    int var257 = field9972[field9987 + 1];
                    if (class86.field1229[var256] == null) {
                        field9972[field9987++] = 0;
                        return;
                    }
                    field9972[field9987++] = class86.field1229[var256][var257].field540;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field9987 -= 3;
                    int var258 = field9972[field9987];
                    int var259 = field9972[field9987 + 1];
                    int var260 = field9972[field9987 + 2];
                    class607.method3525(var258 << 16 | var259, "", var260, (byte) -58, 1);
                    return;
                }
                if (arg0 == 6708) {
                    field9987 -= 3;
                    int var261 = field9972[field9987];
                    int var262 = field9972[field9987 + 1];
                    int var263 = field9972[field9987 + 2];
                    class607.method3525(var261 << 16 | var262, "", var263, (byte) -58, 2);
                    return;
                }
                if (arg0 == 6709) {
                    field9987 -= 3;
                    int var264 = field9972[field9987];
                    int var265 = field9972[field9987 + 1];
                    int var266 = field9972[field9987 + 2];
                    class607.method3525(var264 << 16 | var265, "", var266, (byte) -58, 3);
                    return;
                }
                if (arg0 == 6710) {
                    field9987 -= 3;
                    int var267 = field9972[field9987];
                    int var268 = field9972[field9987 + 1];
                    int var269 = field9972[field9987 + 2];
                    class607.method3525(var267 << 16 | var268, "", var269, (byte) -58, 4);
                    return;
                }
                if (arg0 == 6711) {
                    field9987 -= 3;
                    int var270 = field9972[field9987];
                    int var271 = field9972[field9987 + 1];
                    int var272 = field9972[field9987 + 2];
                    class607.method3525(var270 << 16 | var271, "", var272, (byte) -58, 5);
                    return;
                }
                if (arg0 == 6712) {
                    field9987 -= 3;
                    int var273 = field9972[field9987];
                    int var274 = field9972[field9987 + 1];
                    int var275 = field9972[field9987 + 2];
                    class607.method3525(var273 << 16 | var274, "", var275, (byte) -58, 6);
                    return;
                }
                if (arg0 == 6713) {
                    field9987 -= 3;
                    int var276 = field9972[field9987];
                    int var277 = field9972[field9987 + 1];
                    int var278 = field9972[field9987 + 2];
                    class607.method3525(var276 << 16 | var277, "", var278, (byte) -58, 7);
                    return;
                }
                if (arg0 == 6714) {
                    field9987 -= 3;
                    int var279 = field9972[field9987];
                    int var280 = field9972[field9987 + 1];
                    int var281 = field9972[field9987 + 2];
                    class607.method3525(var279 << 16 | var280, "", var281, (byte) -58, 8);
                    return;
                }
                if (arg0 == 6715) {
                    field9987 -= 3;
                    int var282 = field9972[field9987];
                    int var283 = field9972[field9987 + 1];
                    int var284 = field9972[field9987 + 2];
                    class607.method3525(var282 << 16 | var283, "", var284, (byte) -58, 9);
                    return;
                }
                if (arg0 == 6716) {
                    field9987 -= 3;
                    int var285 = field9972[field9987];
                    int var286 = field9972[field9987 + 1];
                    int var287 = field9972[field9987 + 2];
                    class607.method3525(var285 << 16 | var286, "", var287, (byte) -58, 10);
                    return;
                }
                if (arg0 == 6717) {
                    field9987 -= 3;
                    int var288 = field9972[field9987];
                    int var289 = field9972[field9987 + 1];
                    int var290 = field9972[field9987 + 2];
                    class46 var291 = class700.method3972(var288 << 16 | var289, var290, true);
                    class148.method1087(-34848);
                    class233 var292 = client.method1886(var291);
                    class754.method4204(var292.method1555(10061), var291, 5131, var292.field3396);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var293 = field9972[--field9987];
                    class519 var294 = class637.field8949.method864(-36, var293);
                    if (var294.field7424 == null) {
                        field9986[field9970++] = "";
                        return;
                    }
                    field9986[field9970++] = var294.field7424;
                    return;
                }
                if (arg0 == 6801) {
                    int var295 = field9972[--field9987];
                    class519 var296 = class637.field8949.method864(83, var295);
                    field9972[field9987++] = var296.field7439;
                    return;
                }
                if (arg0 == 6802) {
                    int var297 = field9972[--field9987];
                    class519 var298 = class637.field8949.method864(-71, var297);
                    field9972[field9987++] = var298.field7448;
                    return;
                }
                if (arg0 == 6803) {
                    int var299 = field9972[--field9987];
                    class519 var300 = class637.field8949.method864(-28, var299);
                    field9972[field9987++] = var300.field7412;
                    return;
                }
                if (arg0 == 6804) {
                    field9987 -= 2;
                    int var301 = field9972[field9987];
                    int var302 = field9972[field9987 + 1];
                    class323 var303 = class153.field2479.method1653(var302, (byte) -119);
                    if (var303.method2055(6)) {
                        field9986[field9970++] = class637.field8949.method864(-87, var301).method3066(var302, var303.field4612, -109);
                        return;
                    }
                    field9972[field9987++] = class637.field8949.method864(69, var301).method3059(false, var303.field4610, var302);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field9972[field9987++] = class185.field2825 && !class83.field1166 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field9972[field9987++] = class533.field7664;
                    return;
                }
                if (arg0 == 6902) {
                    field9972[field9987++] = class657.field9199;
                    return;
                }
                if (arg0 == 6903) {
                    field9972[field9987++] = class63.field918;
                    return;
                }
                if (arg0 == 6904) {
                    field9972[field9987++] = class706.field9940;
                    return;
                }
                if (arg0 == 6905) {
                    String var304 = "";
                    if (class638.field8956 != null) {
                        if (class638.field8956.field2990 == null) {
                            var304 = class98.method757(-111, class638.field8956.field2987);
                        } else {
                            var304 = (String) class638.field8956.field2990;
                        }
                    }
                    field9986[field9970++] = var304;
                    return;
                }
                if (arg0 == 6906) {
                    field9972[field9987++] = class601.field8508;
                    return;
                }
                if (arg0 == 6907) {
                    field9972[field9987++] = class186.field2843;
                    return;
                }
                if (arg0 == 6908) {
                    field9972[field9987++] = class397.field5948;
                    return;
                }
                if (arg0 == 6909) {
                    field9972[field9987++] = class290.field4152 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field9972[field9987++] = class43.field463;
                    return;
                }
                if (arg0 == 6911) {
                    field9972[field9987++] = class289.field4137;
                    return;
                }
                if (arg0 == 6912) {
                    field9972[field9987++] = class92.field1285;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var305 = class661.method3809((byte) 127);
                    field9972[field9987++] = class315.field4462 = class63.field916.field10200.method3848(17503);
                    field9972[field9987++] = var305;
                    class63.method563(-11);
                    class585.method3384(53);
                    class349.field5105 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class647.method3761(-28280);
                    class63.method563(-11);
                    class585.method3384(-81);
                    class349.field5105 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class505.method2999(0);
                    class63.method563(-11);
                    class585.method3384(59);
                    class349.field5105 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class242.method1608(0);
                    class63.method563(-11);
                    class585.method3384(-80);
                    class349.field5105 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class645.method3699(true, false);
                    class63.method563(-11);
                    class585.method3384(35);
                    class349.field5105 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class63.field916.method4111(64, 0, class63.field916.field10176);
                    class585.method3384(113);
                    class349.field5105 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class315.field4462 == 2) {
                        class243.field3558 = true;
                        return;
                    }
                    if (class315.field4462 == 1) {
                        class261.field3710 = true;
                        return;
                    }
                    if (class315.field4462 == 3) {
                        class345.field4990 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field9972[field9987++] = class63.field916.field10176.method2991(17503);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field9987 -= 2;
                    int var306 = field9972[field9987];
                    int var307 = field9972[field9987 + 1];
                    if (var306 != -1) {
                        if (var307 > 255) {
                            var307 = 255;
                        } else if (var307 < 0) {
                            var307 = 0;
                        }
                        class537.method3154(var307, -8070, false, var306);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var308 = field9972[--field9987];
                    if (var308 != -1) {
                        class755.method4212(false, var308);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var309 = field9972[--field9987];
                    if (var309 != -1) {
                        class340.method2166(false, var309);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field9972[field9987++] = class154.method1150((byte) 102, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field9972[field9987++] = class63.field916.field10193.method2445(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field9972[field9987++] = class63.field916.field10205.method3893(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field9972[field9987++] = class63.field916.field10185.method2159(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field9972[field9987++] = class63.field916.field10166.method4094(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field9972[field9987++] = class63.field916.field10196.method1421(2) && class736.field10316.method518() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field9972[field9987++] = class63.field916.field10174.method3024(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field9972[field9987++] = class63.field916.field10198.method2964(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field9972[field9987++] = class63.field916.field10201.method2845(2) && class736.field10316.method512() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field9972[field9987++] = class63.field916.field10207.method3959(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field9972[field9987++] = class63.field916.field10162.method4012(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field9972[field9987++] = class63.field916.field10160.method4222(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field9972[field9987++] = class63.field916.field10209.method3082(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field9972[field9987++] = class63.field916.field10194.method1329(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field9972[field9987++] = class63.field916.field10177.method3844(2) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var310 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10193.method306(31401, var310);
                    return;
                }
                if (arg0 == 7302) {
                    int var311 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10205.method306(31401, var311);
                    return;
                }
                if (arg0 == 7303) {
                    int var312 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10185.method306(31401, var312);
                    return;
                }
                if (arg0 == 7304) {
                    int var313 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10166.method306(31401, var313);
                    return;
                }
                if (arg0 == 7305) {
                    int var314 = field9972[--field9987];
                    if (!class736.field10316.method518()) {
                        field9972[field9987++] = 3;
                        return;
                    }
                    field9972[field9987++] = class63.field916.field10196.method306(31401, var314);
                    return;
                }
                if (arg0 == 7306) {
                    int var315 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10174.method306(31401, var315);
                    return;
                }
                if (arg0 == 7307) {
                    int var316 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10198.method306(31401, var316);
                    return;
                }
                if (arg0 == 7308) {
                    int var317 = field9972[--field9987];
                    if (!class736.field10316.method512()) {
                        field9972[field9987++] = 3;
                        return;
                    }
                    field9972[field9987++] = class63.field916.field10201.method306(31401, var317);
                    return;
                }
                if (arg0 == 7309) {
                    int var318 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10207.method306(31401, var318);
                    return;
                }
                if (arg0 == 7310) {
                    int var319 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10162.method306(31401, var319);
                    return;
                }
                if (arg0 == 7311) {
                    int var320 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10160.method306(31401, var320);
                    return;
                }
                if (arg0 == 7312) {
                    int var321 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10209.method306(31401, var321);
                    return;
                }
                if (arg0 == 7313) {
                    int var322 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10194.method306(31401, var322);
                    return;
                }
                if (arg0 == 7314) {
                    int var323 = field9972[--field9987];
                    field9972[field9987++] = class63.field916.field10177.method306(31401, var323);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ldca;I)V")
    private static final void method4028(class177 arg0, int arg1) {
        Object[] var2 = arg0.field2737;
        int var3 = (Integer) var2[0];
        class193 var4 = class305.method1930(120, var3);
        if (var4 == null) {
            return;
        }
        field9981 = new int[var4.field2919];
        int var5 = 0;
        field9969 = new String[var4.field2926];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2741;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2734;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2743 == null ? -1 : arg0.field2743.field610;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2735;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2743 == null ? -1 : arg0.field2743.field603;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2745 == null ? -1 : arg0.field2745.field610;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2745 == null ? -1 : arg0.field2745.field603;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2740;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2739;
                }
                field9981[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2751;
                }
                field9969[var6++] = var9;
            }
        }
        field9995 = arg0.field2744;
        method4034(var4, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "()V")
    public static void method4029() {
        field9981 = null;
        field9969 = null;
        field9968 = null;
        field9985 = null;
        field9972 = null;
        field9986 = null;
        field9974 = null;
        field9989 = null;
        field9988 = null;
        field9991 = null;
        field9967 = null;
        field9994 = null;
        field9993 = null;
        field9992 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method4030(String arg0, int arg1) {
        if (class245.field3569 == 0 && !(!class185.field2825 || class83.field1166) || class394.field5929) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class430.field6417.method2679(0, 88))) {
            var3 = 0;
            arg0 = arg0.substring(class430.field6417.method2679(0, 124).length());
        } else if (var2.startsWith(class430.field6418.method2679(0, 93))) {
            var3 = 1;
            arg0 = arg0.substring(class430.field6418.method2679(0, -106).length());
        } else if (var2.startsWith(class430.field6419.method2679(0, 94))) {
            var3 = 2;
            arg0 = arg0.substring(class430.field6419.method2679(0, -67).length());
        } else if (var2.startsWith(class430.field6420.method2679(0, 97))) {
            var3 = 3;
            arg0 = arg0.substring(class430.field6420.method2679(0, 118).length());
        } else if (var2.startsWith(class430.field6421.method2679(0, 125))) {
            var3 = 4;
            arg0 = arg0.substring(class430.field6421.method2679(0, 87).length());
        } else if (var2.startsWith(class430.field6422.method2679(0, -70))) {
            var3 = 5;
            arg0 = arg0.substring(class430.field6422.method2679(0, -80).length());
        } else if (var2.startsWith(class430.field6423.method2679(0, -47))) {
            var3 = 6;
            arg0 = arg0.substring(class430.field6423.method2679(0, 106).length());
        } else if (var2.startsWith(class430.field6424.method2679(0, 120))) {
            var3 = 7;
            arg0 = arg0.substring(class430.field6424.method2679(0, -68).length());
        } else if (var2.startsWith(class430.field6425.method2679(0, 125))) {
            var3 = 8;
            arg0 = arg0.substring(class430.field6425.method2679(0, 93).length());
        } else if (var2.startsWith(class430.field6426.method2679(0, 127))) {
            var3 = 9;
            arg0 = arg0.substring(class430.field6426.method2679(0, -75).length());
        } else if (var2.startsWith(class430.field6427.method2679(0, -71))) {
            var3 = 10;
            arg0 = arg0.substring(class430.field6427.method2679(0, 95).length());
        } else if (var2.startsWith(class430.field6428.method2679(0, -90))) {
            var3 = 11;
            arg0 = arg0.substring(class430.field6428.method2679(0, 114).length());
        } else if (class650.field9160 != 0) {
            if (var2.startsWith(class430.field6417.method2679(class650.field9160, 109))) {
                var3 = 0;
                arg0 = arg0.substring(class430.field6417.method2679(class650.field9160, -59).length());
            } else if (var2.startsWith(class430.field6418.method2679(class650.field9160, -81))) {
                var3 = 1;
                arg0 = arg0.substring(class430.field6418.method2679(class650.field9160, 100).length());
            } else if (var2.startsWith(class430.field6419.method2679(class650.field9160, -81))) {
                var3 = 2;
                arg0 = arg0.substring(class430.field6419.method2679(class650.field9160, 120).length());
            } else if (var2.startsWith(class430.field6420.method2679(class650.field9160, -111))) {
                var3 = 3;
                arg0 = arg0.substring(class430.field6420.method2679(class650.field9160, 120).length());
            } else if (var2.startsWith(class430.field6421.method2679(class650.field9160, -110))) {
                var3 = 4;
                arg0 = arg0.substring(class430.field6421.method2679(class650.field9160, -47).length());
            } else if (var2.startsWith(class430.field6422.method2679(class650.field9160, 92))) {
                var3 = 5;
                arg0 = arg0.substring(class430.field6422.method2679(class650.field9160, -116).length());
            } else if (var2.startsWith(class430.field6423.method2679(class650.field9160, 95))) {
                var3 = 6;
                arg0 = arg0.substring(class430.field6423.method2679(class650.field9160, 107).length());
            } else if (var2.startsWith(class430.field6424.method2679(class650.field9160, -70))) {
                var3 = 7;
                arg0 = arg0.substring(class430.field6424.method2679(class650.field9160, -92).length());
            } else if (var2.startsWith(class430.field6425.method2679(class650.field9160, 117))) {
                var3 = 8;
                arg0 = arg0.substring(class430.field6425.method2679(class650.field9160, -87).length());
            } else if (var2.startsWith(class430.field6426.method2679(class650.field9160, 103))) {
                var3 = 9;
                arg0 = arg0.substring(class430.field6426.method2679(class650.field9160, -67).length());
            } else if (var2.startsWith(class430.field6427.method2679(class650.field9160, 91))) {
                var3 = 10;
                arg0 = arg0.substring(class430.field6427.method2679(class650.field9160, -106).length());
            } else if (var2.startsWith(class430.field6428.method2679(class650.field9160, 113))) {
                var3 = 11;
                arg0 = arg0.substring(class430.field6428.method2679(class650.field9160, -72).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class430.field6429.method2679(0, -110))) {
            var5 = 1;
            arg0 = arg0.substring(class430.field6429.method2679(0, -89).length());
        } else if (var4.startsWith(class430.field6430.method2679(0, -64))) {
            var5 = 2;
            arg0 = arg0.substring(class430.field6430.method2679(0, 117).length());
        } else if (var4.startsWith(class430.field6431.method2679(0, -70))) {
            var5 = 3;
            arg0 = arg0.substring(class430.field6431.method2679(0, 118).length());
        } else if (var4.startsWith(class430.field6432.method2679(0, 88))) {
            var5 = 4;
            arg0 = arg0.substring(class430.field6432.method2679(0, -55).length());
        } else if (var4.startsWith(class430.field6433.method2679(0, 121))) {
            var5 = 5;
            arg0 = arg0.substring(class430.field6433.method2679(0, -100).length());
        } else if (class650.field9160 != 0) {
            if (var4.startsWith(class430.field6429.method2679(class650.field9160, -53))) {
                var5 = 1;
                arg0 = arg0.substring(class430.field6429.method2679(class650.field9160, -78).length());
            } else if (var4.startsWith(class430.field6430.method2679(class650.field9160, 115))) {
                var5 = 2;
                arg0 = arg0.substring(class430.field6430.method2679(class650.field9160, 83).length());
            } else if (var4.startsWith(class430.field6431.method2679(class650.field9160, -87))) {
                var5 = 3;
                arg0 = arg0.substring(class430.field6431.method2679(class650.field9160, -77).length());
            } else if (var4.startsWith(class430.field6432.method2679(class650.field9160, 115))) {
                var5 = 4;
                arg0 = arg0.substring(class430.field6432.method2679(class650.field9160, 91).length());
            } else if (var4.startsWith(class430.field6433.method2679(class650.field9160, -69))) {
                var5 = 5;
                arg0 = arg0.substring(class430.field6433.method2679(class650.field9160, -112).length());
            }
        }
        field9984++;
        class468 var6 = class93.method734(class29.field284, class523.field7472, 8174);
        var6.field6839.method3730(114, 0);
        int var7 = var6.field6839.field9084;
        var6.field6839.method3730(116, var3);
        var6.field6839.method3730(102, var5);
        class356.method2229(arg0, var6.field6839, true);
        var6.field6839.method3746(var6.field6839.field9084 - var7, 117);
        class120.method872((byte) 71, var6);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(C)I")
    private static final int method4031(char arg0) {
        return class341.method2169(arg0, false) ? 1 : 0;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Loi;II)V")
    public static final void method4032(class73 arg0, int arg1, int arg2) {
        class193 var3 = class479.method2884(arg0, arg1, arg2, 1);
        if (var3 == null) {
            return;
        }
        field9981 = new int[var3.field2919];
        field9969 = new String[var3.field2926];
        if (class63.field915 == var3.field2930 || class257.field3688 == var3.field2930 || class589.field8347 == var3.field2930) {
            int var4 = 0;
            int var5 = 0;
            if (class55.field769 != null) {
                var4 = class55.field769.field669;
                var5 = class55.field769.field643;
            }
            field9981[0] = class632.field8840.method2697(4212) - var4;
            field9981[1] = class632.field8840.method2698(0) - var5;
        }
        method4034(var3, 200000);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "()V")
    public static final void method4033() {
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lru;I)V")
    private static final void method4034(class193 arg0, int arg1) {
        field9987 = 0;
        field9970 = 0;
        int var2 = -1;
        int[] var3 = arg0.field2920;
        int[] var4 = arg0.field2924;
        byte var5 = -1;
        field9983 = 0;
        try {
            int var6 = 0;
            label270: while (true) {
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
                        method4024(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method4027(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field9972[field9987++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field9972[field9987++] = class83.field1160.field6176[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class83.field1160.method2614(field9972[--field9987], -25068, var8);
                } else if (var43 == 3) {
                    field9986[field9970++] = arg0.field2918[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field9987 -= 2;
                    if (field9972[field9987 + 1] != field9972[field9987]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field9987 -= 2;
                    if (field9972[field9987 + 1] == field9972[field9987]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field9987 -= 2;
                    if (field9972[field9987] < field9972[field9987 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field9987 -= 2;
                    if (field9972[field9987] > field9972[field9987 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field9983 == 0) {
                        return;
                    }
                    class326 var9 = field9974[--field9983];
                    arg0 = var9.field4653;
                    var3 = arg0.field2920;
                    var4 = arg0.field2924;
                    var2 = var9.field4660;
                    field9981 = var9.field4652;
                    field9969 = var9.field4651;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field9972[field9987++] = class83.field1160.method2605(false, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class83.field1160.method2607(var11, 8, field9972[--field9987]);
                } else if (var43 == 31) {
                    field9987 -= 2;
                    if (field9972[field9987] <= field9972[field9987 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field9987 -= 2;
                    if (field9972[field9987] >= field9972[field9987 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field9972[field9987++] = field9981[var4[var2]];
                } else if (var43 == 34) {
                    field9981[var4[var2]] = field9972[--field9987];
                } else if (var43 == 35) {
                    field9986[field9970++] = field9969[var4[var2]];
                } else if (var43 == 36) {
                    field9969[var4[var2]] = field9986[--field9970];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field9970 -= var12;
                    String var13 = class490.method2930(118, field9986, var12, field9970);
                    field9986[field9970++] = var13;
                } else if (var43 == 38) {
                    field9987--;
                } else if (var43 == 39) {
                    field9970--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class193 var15 = class305.method1930(120, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field2919];
                    String[] var17 = new String[var15.field2926];
                    for (int var18 = 0; var18 < var15.field2922; var18++) {
                        var16[var18] = field9972[field9987 + var18 - var15.field2922];
                    }
                    for (int var19 = 0; var19 < var15.field2927; var19++) {
                        var17[var19] = field9986[field9970 + var19 - var15.field2927];
                    }
                    field9987 -= var15.field2922;
                    field9970 -= var15.field2927;
                    class326 var20 = new class326();
                    var20.field4653 = arg0;
                    var20.field4660 = var2;
                    var20.field4652 = field9981;
                    var20.field4651 = field9969;
                    if (field9983 >= field9974.length) {
                        throw new RuntimeException();
                    }
                    field9974[field9983++] = var20;
                    arg0 = var15;
                    var3 = var15.field2920;
                    var4 = var15.field2924;
                    var2 = -1;
                    field9981 = var16;
                    field9969 = var17;
                } else if (var43 == 42) {
                    field9972[field9987++] = class461.field6799[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class461.field6799[var21] = field9972[--field9987];
                    class505.method2993(var21, 0);
                    class479.field6948 |= class521.field7460[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field9972[--field9987];
                    if (var24 >= 0 && var24 <= 5000) {
                        field9968[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label270;
                            }
                            field9985[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field9972[--field9987];
                    if (var28 < 0 || var28 >= field9968[var27]) {
                        throw new RuntimeException();
                    }
                    field9972[field9987++] = field9985[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field9987 -= 2;
                    int var30 = field9972[field9987];
                    if (var30 < 0 || var30 >= field9968[var29]) {
                        throw new RuntimeException();
                    }
                    field9985[var29][var30] = field9972[field9987 + 1];
                } else if (var43 == 47) {
                    String var31 = class413.field6210[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field9986[field9970++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class413.field6210[var32] = field9986[--field9970];
                    class408.method2598(var32, -102);
                } else if (var43 == 51) {
                    class372 var33 = arg0.field2921[var4[var2]];
                    class317 var34 = (class317) var33.method2287((long) field9972[--field9987], (byte) -117);
                    if (var34 != null) {
                        var2 += var34.field4518;
                    }
                } else if (var43 == 86) {
                    if (field9972[--field9987] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 87 && field9972[--field9987] == 0) {
                    var2 += var4[var2];
                }
            }
        } catch (Exception var42) {
            if (arg0.field2928 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field2810).append(" ");
                for (int var41 = field9983 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field9974[var41].field4653.field2810).append(" ");
                }
                var40.append("op: ").append(var5);
                class326.method2072(-3753, var42, var40.toString());
            } else {
                class618.method3559("Clientscript error in: " + arg0.field2928, false, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field2928).append("\n");
                for (int var38 = field9983 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field9974[var38].field4653.field2928).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class326.method2072(-3753, var42, var37.toString());
                class533.method3136(117, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method4035(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field9967.setTime(new Date(var1));
        int var3 = field9967.get(5);
        int var4 = field9967.get(2);
        int var5 = field9967.get(1);
        return var3 + "-" + field9994[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(IZ)V")
    public static final void method4036(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
    public static final void method4037(int arg0) {
        if (arg0 == -1 || !class245.method1632(816183856, arg0)) {
            return;
        }
        class46[] var1 = class86.field1229[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class46 var3 = var1[var2];
            if (var3.field676 != null) {
                class177 var4 = new class177();
                var4.field2743 = var3;
                var4.field2737 = var3.field676;
                method4028(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V")
    private static final void method4038(int arg0) {
        class46 var1 = class405.method2580(arg0, -44);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class46[] var3 = class365.field5282[var2];
        if (var3 == null) {
            class46[] var4 = class86.field1229[var2];
            int var5 = var4.length;
            var3 = class365.field5282[var2] = new class46[var5];
            class319.method2017(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class319.method2017(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }
}
