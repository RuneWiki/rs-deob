import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class604 {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[I")
    private static int[] field8823 = new int[5];

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    private static int field8831 = 0;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[Ljava/lang/String;")
    private static String[] field8822 = new String[1000];

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    private static int field8832 = 0;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "[Let;")
    private static class517[] field8834 = new class517[50];

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    private static int field8837 = 0;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "[[I")
    private static int[][] field8824 = new int[5][5000];

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "[I")
    private static int[] field8841 = new int[1000];

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Ljava/util/Calendar;")
    private static Calendar field8839 = Calendar.getInstance();

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field8842 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "[I")
    private static int[] field8843 = new int[3];

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Lhp;")
    public static class277 field8844 = new class277(4);

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    private static int field8845 = 0;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lnd;")
    private static class473 field8819;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Lqf;")
    private static class593 field8826;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Lqf;")
    private static class593 field8829;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
    private static int[] field8817;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "[Ljava/lang/String;")
    private static String[] field8830;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()V")
    public static void method3505() {
        field8817 = null;
        field8830 = null;
        field8823 = null;
        field8824 = null;
        field8841 = null;
        field8822 = null;
        field8834 = null;
        field8829 = null;
        field8826 = null;
        field8819 = null;
        field8839 = null;
        field8842 = null;
        field8843 = null;
        field8844 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lhk;I)V")
    private static final void method3506(class86 arg0, int arg1) {
        Object[] var2 = arg0.field985;
        int var3 = (Integer) var2[0];
        class407 var4 = class349.method2226(27920, var3);
        if (var4 == null) {
            return;
        }
        field8817 = new int[var4.field6134];
        int var5 = 0;
        field8830 = new String[var4.field6130];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field980;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field978;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field976 == null ? -1 : arg0.field976.field8579;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field972;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field976 == null ? -1 : arg0.field976.field8593;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field983 == null ? -1 : arg0.field983.field8579;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field983 == null ? -1 : arg0.field983.field8593;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field977;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field979;
                }
                field8817[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field975;
                }
                field8830[var6++] = var9;
            }
        }
        field8845 = arg0.field973;
        method3515(var4, arg1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)V")
    private static final void method3507(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field8832 -= 3;
                int var2 = field8841[field8832];
                int var3 = field8841[field8832 + 1];
                int var4 = field8841[field8832 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class593 var5 = class259.method1728(40, var2);
                if (var5.field8512 == null) {
                    var5.field8512 = new class593[var4 + 1];
                }
                if (var5.field8512.length <= var4) {
                    class593[] var6 = new class593[var4 + 1];
                    for (int var7 = 0; var7 < var5.field8512.length; var7++) {
                        var6[var7] = var5.field8512[var7];
                    }
                    var5.field8512 = var6;
                }
                if (var4 > 0 && var5.field8512[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class593 var8 = new class593();
                var8.field8507 = var3;
                var8.field8533 = var8.field8579 = var5.field8579;
                var8.field8593 = var4;
                var5.field8512[var4] = var8;
                if (arg1) {
                    field8826 = var8;
                } else {
                    field8829 = var8;
                }
                class33.method187(var5, (byte) 113);
                return;
            }
            if (arg0 == 101) {
                class593 var9 = arg1 ? field8826 : field8829;
                if (var9.field8593 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class593 var10 = class259.method1728(40, var9.field8579);
                var10.field8512[var9.field8593] = null;
                class33.method187(var10, (byte) 115);
                return;
            }
            if (arg0 == 102) {
                class593 var11 = class259.method1728(40, field8841[--field8832]);
                var11.field8512 = null;
                class33.method187(var11, (byte) 119);
                return;
            }
            if (arg0 == 200) {
                field8832 -= 2;
                int var12 = field8841[field8832];
                int var13 = field8841[field8832 + 1];
                class593 var14 = class322.method2103(var13, false, var12);
                if (var14 != null && var13 != -1) {
                    field8841[field8832++] = 1;
                    if (arg1) {
                        field8826 = var14;
                        return;
                    }
                    field8829 = var14;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field8841[--field8832];
                class593 var16 = class259.method1728(40, var15);
                if (var16 != null) {
                    field8841[field8832++] = 1;
                    if (arg1) {
                        field8826 = var16;
                        return;
                    }
                    field8829 = var16;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field8841[--field8832];
                method3509(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field8841[--field8832];
                method3517(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field8832 -= 2;
                int var19 = field8841[field8832];
                int var20 = field8841[field8832 + 1];
                for (int var21 = 0; var21 < class400.field6064.length; var21++) {
                    if (class400.field6064[var21] == var19) {
                        class439.field6548.field9470.method1792(var20, 0, var21, class130.field1626);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class238.field3396.length; var22++) {
                    if (class238.field3396[var22] == var19) {
                        class439.field6548.field9470.method1792(var20, 0, var22, class130.field1626);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field8832 -= 2;
                int var23 = field8841[field8832];
                int var24 = field8841[field8832 + 1];
                class439.field6548.field9470.method1790(var23, true, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field8841[--field8832] != 0;
                class439.field6548.field9470.method1785(2527, var25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class593 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class259.method1728(40, field8841[--field8832]);
            } else {
                var26 = arg1 ? field8826 : field8829;
            }
            if (arg0 == 1000) {
                field8832 -= 4;
                var26.field8583 = field8841[field8832];
                var26.field8619 = field8841[field8832 + 1];
                int var27 = field8841[field8832 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field8841[field8832 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field8562 = (byte) var27;
                var26.field8582 = (byte) var28;
                class33.method187(var26, (byte) -104);
                class120.method746((byte) 9, var26);
                if (var26.field8593 == -1) {
                    class343.method2207(var26.field8579, 11);
                }
                return;
            }
            if (arg0 == 1001) {
                field8832 -= 4;
                var26.field8588 = field8841[field8832];
                var26.field8535 = field8841[field8832 + 1];
                var26.field8659 = 0;
                var26.field8519 = 0;
                int var29 = field8841[field8832 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field8841[field8832 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field8538 = (byte) var29;
                var26.field8644 = (byte) var30;
                class33.method187(var26, (byte) -65);
                class120.method746((byte) 9, var26);
                if (var26.field8507 == 0) {
                    class471.method2880(false, var26, 10);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field8841[--field8832] == 1;
                if (var26.field8561 != var31) {
                    var26.field8561 = var31;
                    class33.method187(var26, (byte) 98);
                }
                if (var26.field8593 == -1) {
                    class640.method3650(true, var26.field8579);
                }
                return;
            }
            if (arg0 == 1004) {
                field8832 -= 2;
                var26.field8597 = field8841[field8832];
                var26.field8639 = field8841[field8832 + 1];
                class33.method187(var26, (byte) -109);
                class120.method746((byte) 9, var26);
                if (var26.field8507 == 0) {
                    class471.method2880(false, var26, 10);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field8594 = field8841[--field8832] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class593 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class259.method1728(40, field8841[--field8832]);
            } else {
                var32 = arg1 ? field8826 : field8829;
            }
            if (arg0 == 1100) {
                field8832 -= 2;
                var32.field8598 = field8841[field8832];
                if (var32.field8598 > var32.field8626 - var32.field8570) {
                    var32.field8598 = var32.field8626 - var32.field8570;
                }
                if (var32.field8598 < 0) {
                    var32.field8598 = 0;
                }
                var32.field8662 = field8841[field8832 + 1];
                if (var32.field8662 > var32.field8549 - var32.field8518) {
                    var32.field8662 = var32.field8549 - var32.field8518;
                }
                if (var32.field8662 < 0) {
                    var32.field8662 = 0;
                }
                class33.method187(var32, (byte) -65);
                if (var32.field8593 == -1) {
                    class504.method3002(true, var32.field8579);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field8617 = field8841[--field8832];
                class33.method187(var32, (byte) 94);
                if (var32.field8593 == -1) {
                    class273.method1783(var32.field8579, (byte) 101);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field8608 = field8841[--field8832] == 1;
                class33.method187(var32, (byte) 106);
                return;
            }
            if (arg0 == 1103) {
                var32.field8621 = field8841[--field8832];
                class33.method187(var32, (byte) -127);
                return;
            }
            if (arg0 == 1104) {
                var32.field8602 = field8841[--field8832];
                class33.method187(var32, (byte) -82);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field8841[--field8832];
                if (var32.field8665 != var33) {
                    var32.field8665 = var33;
                    class33.method187(var32, (byte) -33);
                }
                if (var32.field8593 == -1) {
                    class35.method194(0, var32.field8579);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field8587 = field8841[--field8832];
                class33.method187(var32, (byte) -126);
                return;
            }
            if (arg0 == 1107) {
                var32.field8569 = field8841[--field8832] == 1;
                class33.method187(var32, (byte) 111);
                return;
            }
            if (arg0 == 1108) {
                var32.field8577 = 1;
                var32.field8555 = field8841[--field8832];
                class33.method187(var32, (byte) -88);
                if (var32.field8593 == -1) {
                    class535.method3121(1, var32.field8579);
                }
                return;
            }
            if (arg0 == 1109) {
                field8832 -= 6;
                var32.field8600 = field8841[field8832];
                var32.field8661 = field8841[field8832 + 1];
                var32.field8618 = field8841[field8832 + 2];
                var32.field8584 = field8841[field8832 + 3];
                var32.field8630 = field8841[field8832 + 4];
                var32.field8566 = field8841[field8832 + 5];
                class33.method187(var32, (byte) -107);
                if (var32.field8593 == -1) {
                    class296.method1985(var32.field8579, false);
                    class177.method1003(var32.field8579, (byte) -8);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field8841[--field8832];
                if (var32.field8558 != var34) {
                    var32.field8558 = var34;
                    var32.field8524 = 0;
                    var32.field8571 = 1;
                    var32.field8631 = 0;
                    class33.method187(var32, (byte) 120);
                }
                if (var32.field8593 == -1) {
                    class276.method1794(var32.field8579, -33);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field8634 = field8841[--field8832] == 1;
                class33.method187(var32, (byte) -39);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field8822[--field8837];
                if (!var35.equals(var32.field8548)) {
                    var32.field8548 = var35;
                    class33.method187(var32, (byte) 112);
                }
                if (var32.field8593 == -1) {
                    class430.method2682(var32.field8579, (byte) 15);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field8595 = field8841[--field8832];
                class33.method187(var32, (byte) 95);
                if (var32.field8593 == -1) {
                    class411.method2603(var32.field8579, (byte) 114);
                }
                return;
            }
            if (arg0 == 1114) {
                field8832 -= 3;
                var32.field8506 = field8841[field8832];
                var32.field8638 = field8841[field8832 + 1];
                var32.field8585 = field8841[field8832 + 2];
                class33.method187(var32, (byte) 113);
                return;
            }
            if (arg0 == 1115) {
                var32.field8545 = field8841[--field8832] == 1;
                class33.method187(var32, (byte) 119);
                return;
            }
            if (arg0 == 1116) {
                var32.field8578 = field8841[--field8832];
                class33.method187(var32, (byte) -115);
                return;
            }
            if (arg0 == 1117) {
                var32.field8599 = field8841[--field8832];
                class33.method187(var32, (byte) -72);
                return;
            }
            if (arg0 == 1118) {
                var32.field8667 = field8841[--field8832] == 1;
                class33.method187(var32, (byte) 112);
                return;
            }
            if (arg0 == 1119) {
                var32.field8670 = field8841[--field8832] == 1;
                class33.method187(var32, (byte) -74);
                return;
            }
            if (arg0 == 1120) {
                field8832 -= 2;
                var32.field8626 = field8841[field8832];
                var32.field8549 = field8841[field8832 + 1];
                class33.method187(var32, (byte) -86);
                if (var32.field8507 == 0) {
                    class471.method2880(false, var32, 10);
                }
                return;
            }
            if (arg0 == 1121) {
                field8832 -= 2;
                var32.field8521 = (short) field8841[field8832];
                var32.field8526 = (short) field8841[field8832 + 1];
                class33.method187(var32, (byte) 112);
                return;
            }
            if (arg0 == 1122) {
                var32.field8514 = field8841[--field8832] == 1;
                class33.method187(var32, (byte) -96);
                return;
            }
            if (arg0 == 1123) {
                var32.field8566 = field8841[--field8832];
                class33.method187(var32, (byte) 97);
                if (var32.field8593 == -1) {
                    class296.method1985(var32.field8579, false);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field8841[--field8832];
                var32.field8504 = var36 == 1;
                class33.method187(var32, (byte) -123);
                return;
            }
            if (arg0 == 1125) {
                field8832 -= 2;
                var32.field8522 = field8841[field8832];
                var32.field8671 = field8841[field8832 + 1];
                class33.method187(var32, (byte) 94);
                return;
            }
            if (arg0 == 1126) {
                var32.field8565 = field8841[--field8832];
                class33.method187(var32, (byte) 108);
                return;
            }
            if (arg0 == 1127) {
                field8832 -= 2;
                int var37 = field8841[field8832];
                int var38 = field8841[field8832 + 1];
                class403 var39 = class565.field8053.method3495(3, var37);
                if (var39.field6089 != var38) {
                    var32.method3460(var38, 16, var37);
                    return;
                }
                var32.method3454(-62, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field8841[--field8832];
                String var41 = field8822[--field8837];
                class403 var42 = class565.field8053.method3495(3, var40);
                if (!var42.field6091.equals(var41)) {
                    var32.method3459(var40, var41, -126);
                    return;
                }
                var32.method3454(-84, var40);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class593 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class259.method1728(40, field8841[--field8832]);
            } else {
                var43 = arg1 ? field8826 : field8829;
            }
            class33.method187(var43, (byte) -102);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field8832 -= 2;
                int var44 = field8841[field8832];
                int var45 = field8841[field8832 + 1];
                if (var43.field8593 == -1) {
                    class111.method686(114, var43.field8579);
                    class296.method1985(var43.field8579, false);
                    class177.method1003(var43.field8579, (byte) -8);
                }
                if (var44 == -1) {
                    var43.field8577 = 1;
                    var43.field8555 = -1;
                    var43.field8601 = -1;
                    return;
                }
                var43.field8601 = var44;
                var43.field8624 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field8531 = true;
                } else {
                    var43.field8531 = false;
                }
                class190 var46 = class622.field8999.method25(var44, -86);
                var43.field8618 = var46.field2344;
                var43.field8584 = var46.field2379;
                var43.field8630 = var46.field2405;
                var43.field8600 = var46.field2353;
                var43.field8661 = var46.field2416;
                var43.field8566 = var46.field2393;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field8527 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field8527 = 1;
                } else {
                    var43.field8527 = 2;
                }
                if (var43.field8659 > 0) {
                    var43.field8566 = var43.field8566 * 32 / var43.field8659;
                    return;
                }
                if (var43.field8588 > 0) {
                    var43.field8566 = var43.field8566 * 32 / var43.field8588;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field8577 = 2;
                var43.field8555 = field8841[--field8832];
                if (var43.field8593 == -1) {
                    class535.method3121(1, var43.field8579);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field8577 = 3;
                var43.field8555 = -1;
                if (var43.field8593 == -1) {
                    class535.method3121(1, var43.field8579);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field8577 = 6;
                var43.field8555 = field8841[--field8832];
                if (var43.field8593 == -1) {
                    class535.method3121(1, var43.field8579);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field8577 = 5;
                var43.field8555 = field8841[--field8832];
                if (var43.field8593 == -1) {
                    class535.method3121(1, var43.field8579);
                }
                return;
            }
            if (arg0 == 1206) {
                field8832 -= 4;
                var43.field8541 = field8841[field8832];
                var43.field8642 = field8841[field8832 + 1];
                var43.field8627 = field8841[field8832 + 2];
                var43.field8574 = field8841[field8832 + 3];
                class33.method187(var43, (byte) 96);
                return;
            }
            if (arg0 == 1207) {
                field8832 -= 2;
                var43.field8666 = field8841[field8832];
                var43.field8656 = field8841[field8832 + 1];
                class33.method187(var43, (byte) 97);
                return;
            }
            if (arg0 == 1210) {
                field8832 -= 4;
                var43.field8555 = field8841[field8832];
                var43.field8641 = field8841[field8832 + 1];
                if (field8841[field8832 + 2] == 1) {
                    var43.field8577 = 9;
                } else {
                    var43.field8577 = 8;
                }
                if (field8841[field8832 + 3] == 1) {
                    var43.field8531 = true;
                } else {
                    var43.field8531 = false;
                }
                if (var43.field8593 == -1) {
                    class535.method3121(1, var43.field8579);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field8577 = 5;
                var43.field8555 = class244.field3460;
                var43.field8641 = 0;
                if (var43.field8593 == -1) {
                    class535.method3121(1, var43.field8579);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class593 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class259.method1728(40, field8841[--field8832]);
            } else {
                var47 = arg1 ? field8826 : field8829;
            }
            if (arg0 == 1300) {
                int var48 = field8841[--field8832] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method3457(-321730393, var48, field8822[--field8837]);
                    return;
                }
                field8837--;
                return;
            }
            if (arg0 == 1301) {
                field8832 -= 2;
                int var49 = field8841[field8832];
                int var50 = field8841[field8832 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field8636 = null;
                    return;
                }
                var47.field8636 = class322.method2103(var50, false, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field8841[--field8832];
                if (class428.field6355 != var51 && class274.field3848 != var51 && class349.field5004 != var51) {
                    return;
                }
                var47.field8539 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field8663 = field8841[--field8832];
                return;
            }
            if (arg0 == 1304) {
                var47.field8648 = field8841[--field8832];
                return;
            }
            if (arg0 == 1305) {
                var47.field8563 = field8822[--field8837];
                return;
            }
            if (arg0 == 1306) {
                var47.field8589 = field8822[--field8837];
                return;
            }
            if (arg0 == 1307) {
                var47.field8542 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field8508 = field8841[--field8832];
                var47.field8568 = field8841[--field8832];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field8841[--field8832];
                int var53 = field8841[--field8832];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method3449(var53 - 1, false, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field8643 = field8822[--field8837];
                return;
            }
            if (arg0 == 1311) {
                var47.field8604 = field8841[--field8832];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field8832 -= 3;
                    var54 = field8841[field8832] - 1;
                    var55 = field8841[field8832 + 1];
                    var56 = field8841[field8832 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field8832 -= 2;
                    var54 = 10;
                    var55 = field8841[field8832];
                    var56 = field8841[field8832 + 1];
                }
                if (var47.field8590 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field8590 = new byte[11];
                    var47.field8575 = new byte[11];
                    var47.field8622 = new int[11];
                }
                var47.field8590[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field8553 = false;
                    for (int var57 = 0; var57 < var47.field8590.length; var57++) {
                        if (var47.field8590[var57] != 0) {
                            var47.field8553 = true;
                            break;
                        }
                    }
                } else {
                    var47.field8553 = true;
                }
                var47.field8575[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field8655 = field8841[--field8832];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class593 var58;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var58 = class259.method1728(40, field8841[--field8832]);
            } else {
                var58 = arg1 ? field8826 : field8829;
            }
            if (arg0 == 1499) {
                var58.method3455((byte) -120);
                return;
            }
            String var59 = field8822[--field8837];
            int[] var60 = null;
            if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                int var61 = field8841[--field8832];
                if (var61 > 0) {
                    var60 = new int[var61];
                    while (var61-- > 0) {
                        var60[var61] = field8841[--field8832];
                    }
                }
                var59 = var59.substring(0, var59.length() - 1);
            }
            Object[] var62 = new Object[var59.length() + 1];
            for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                if (var59.charAt(var63 - 1) == 's') {
                    var62[var63] = field8822[--field8837];
                } else {
                    var62[var63] = Integer.valueOf(field8841[--field8832]);
                }
            }
            int var64 = field8841[--field8832];
            if (var64 == -1) {
                var62 = null;
            } else {
                var62[0] = Integer.valueOf(var64);
            }
            if (arg0 == 1400) {
                var58.field8652 = var62;
            } else if (arg0 == 1401) {
                var58.field8528 = var62;
            } else if (arg0 == 1402) {
                var58.field8653 = var62;
            } else if (arg0 == 1403) {
                var58.field8664 = var62;
            } else if (arg0 == 1404) {
                var58.field8651 = var62;
            } else if (arg0 == 1405) {
                var58.field8647 = var62;
            } else if (arg0 == 1406) {
                var58.field8646 = var62;
            } else if (arg0 == 1407) {
                var58.field8564 = var62;
                var58.field8628 = var60;
            } else if (arg0 == 1408) {
                var58.field8517 = var62;
            } else if (arg0 == 1409) {
                var58.field8607 = var62;
            } else if (arg0 == 1410) {
                var58.field8560 = var62;
            } else if (arg0 == 1411) {
                var58.field8520 = var62;
            } else if (arg0 == 1412) {
                var58.field8649 = var62;
            } else if (arg0 == 1414) {
                var58.field8650 = var62;
                var58.field8529 = var60;
            } else if (arg0 == 1415) {
                var58.field8567 = var62;
                var58.field8523 = var60;
            } else if (arg0 == 1416) {
                var58.field8616 = var62;
            } else if (arg0 == 1417) {
                var58.field8552 = var62;
            } else if (arg0 == 1418) {
                var58.field8614 = var62;
            } else if (arg0 == 1419) {
                var58.field8510 = var62;
            } else if (arg0 == 1420) {
                var58.field8544 = var62;
            } else if (arg0 == 1421) {
                var58.field8559 = var62;
            } else if (arg0 == 1422) {
                var58.field8572 = var62;
            } else if (arg0 == 1423) {
                var58.field8557 = var62;
            } else if (arg0 == 1424) {
                var58.field8546 = var62;
            } else if (arg0 == 1425) {
                var58.field8660 = var62;
            } else if (arg0 == 1426) {
                var58.field8556 = var62;
            } else if (arg0 == 1427) {
                var58.field8505 = var62;
            } else if (arg0 == 1428) {
                var58.field8606 = var62;
                var58.field8547 = var60;
            } else if (arg0 == 1429) {
                var58.field8534 = var62;
                var58.field8657 = var60;
            } else if (arg0 == 1430) {
                var58.field8554 = var62;
            }
            var58.field8610 = true;
            return;
        } else if (arg0 < 1600) {
            class593 var65 = arg1 ? field8826 : field8829;
            if (arg0 == 1500) {
                field8841[field8832++] = var65.field8586;
                return;
            }
            if (arg0 == 1501) {
                field8841[field8832++] = var65.field8637;
                return;
            }
            if (arg0 == 1502) {
                field8841[field8832++] = var65.field8570;
                return;
            }
            if (arg0 == 1503) {
                field8841[field8832++] = var65.field8518;
                return;
            }
            if (arg0 == 1504) {
                field8841[field8832++] = var65.field8561 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field8841[field8832++] = var65.field8533;
                return;
            }
            if (arg0 == 1506) {
                class593 var66 = class443.method2769((byte) 63, var65);
                field8841[field8832++] = var66 == null ? -1 : var66.field8579;
                return;
            }
        } else if (arg0 < 1700) {
            class593 var67 = arg1 ? field8826 : field8829;
            if (arg0 == 1600) {
                field8841[field8832++] = var67.field8598;
                return;
            }
            if (arg0 == 1601) {
                field8841[field8832++] = var67.field8662;
                return;
            }
            if (arg0 == 1602) {
                field8822[field8837++] = var67.field8548;
                return;
            }
            if (arg0 == 1603) {
                field8841[field8832++] = var67.field8626;
                return;
            }
            if (arg0 == 1604) {
                field8841[field8832++] = var67.field8549;
                return;
            }
            if (arg0 == 1605) {
                field8841[field8832++] = var67.field8566;
                return;
            }
            if (arg0 == 1606) {
                field8841[field8832++] = var67.field8618;
                return;
            }
            if (arg0 == 1607) {
                field8841[field8832++] = var67.field8630;
                return;
            }
            if (arg0 == 1608) {
                field8841[field8832++] = var67.field8584;
                return;
            }
            if (arg0 == 1609) {
                field8841[field8832++] = var67.field8621;
                return;
            }
            if (arg0 == 1610) {
                field8841[field8832++] = var67.field8600;
                return;
            }
            if (arg0 == 1611) {
                field8841[field8832++] = var67.field8661;
                return;
            }
            if (arg0 == 1612) {
                field8841[field8832++] = var67.field8665;
                return;
            }
            if (arg0 == 1613) {
                int var68 = field8841[--field8832];
                class403 var69 = class565.field8053.method3495(3, var68);
                if (var69.method2569((byte) -95)) {
                    field8822[field8837++] = var67.method3467(var69.field6091, (byte) -100, var68);
                    return;
                }
                field8841[field8832++] = var67.method3463(var68, var69.field6089, false);
                return;
            }
            if (arg0 == 1614) {
                field8841[field8832++] = var67.field8587;
                return;
            }
        } else if (arg0 < 1800) {
            class593 var70 = arg1 ? field8826 : field8829;
            if (arg0 == 1700) {
                field8841[field8832++] = var70.field8601;
                return;
            }
            if (arg0 == 1701) {
                if (var70.field8601 != -1) {
                    field8841[field8832++] = var70.field8624;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field8841[field8832++] = var70.field8593;
                return;
            }
        } else if (arg0 < 1900) {
            class593 var71 = arg1 ? field8826 : field8829;
            if (arg0 == 1800) {
                field8841[field8832++] = client.method1682(var71).method1771((byte) 65);
                return;
            }
            if (arg0 == 1801) {
                int var72 = field8841[--field8832];
                int var342 = var72 - 1;
                if (var71.field8542 != null && var342 < var71.field8542.length && var71.field8542[var342] != null) {
                    field8822[field8837++] = var71.field8542[var342];
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var71.field8563 == null) {
                    field8822[field8837++] = "";
                    return;
                }
                field8822[field8837++] = var71.field8563;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class593 var340;
            if (arg0 >= 2000) {
                var340 = class259.method1728(40, field8841[--field8832]);
                arg0 -= 1000;
            } else {
                var340 = arg1 ? field8826 : field8829;
            }
            if (field8845 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var340.field8505 == null) {
                    return;
                }
                class86 var341 = new class86();
                var341.field976 = var340;
                var341.field985 = var340.field8505;
                var341.field973 = field8845 + 1;
                class463.field6892.method706(var341, true);
                return;
            }
        } else if (arg0 < 2600) {
            class593 var73 = class259.method1728(40, field8841[--field8832]);
            if (arg0 == 2500) {
                field8841[field8832++] = var73.field8586;
                return;
            }
            if (arg0 == 2501) {
                field8841[field8832++] = var73.field8637;
                return;
            }
            if (arg0 == 2502) {
                field8841[field8832++] = var73.field8570;
                return;
            }
            if (arg0 == 2503) {
                field8841[field8832++] = var73.field8518;
                return;
            }
            if (arg0 == 2504) {
                field8841[field8832++] = var73.field8561 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field8841[field8832++] = var73.field8533;
                return;
            }
            if (arg0 == 1506) {
                class593 var74 = class443.method2769((byte) 63, var73);
                field8841[field8832++] = var74 == null ? -1 : var74.field8579;
                return;
            }
        } else if (arg0 < 2700) {
            class593 var75 = class259.method1728(40, field8841[--field8832]);
            if (arg0 == 2600) {
                field8841[field8832++] = var75.field8598;
                return;
            }
            if (arg0 == 2601) {
                field8841[field8832++] = var75.field8662;
                return;
            }
            if (arg0 == 2602) {
                field8822[field8837++] = var75.field8548;
                return;
            }
            if (arg0 == 2603) {
                field8841[field8832++] = var75.field8626;
                return;
            }
            if (arg0 == 2604) {
                field8841[field8832++] = var75.field8549;
                return;
            }
            if (arg0 == 2605) {
                field8841[field8832++] = var75.field8566;
                return;
            }
            if (arg0 == 2606) {
                field8841[field8832++] = var75.field8618;
                return;
            }
            if (arg0 == 2607) {
                field8841[field8832++] = var75.field8630;
                return;
            }
            if (arg0 == 2608) {
                field8841[field8832++] = var75.field8584;
                return;
            }
            if (arg0 == 2609) {
                field8841[field8832++] = var75.field8621;
                return;
            }
            if (arg0 == 2610) {
                field8841[field8832++] = var75.field8600;
                return;
            }
            if (arg0 == 2611) {
                field8841[field8832++] = var75.field8661;
                return;
            }
            if (arg0 == 2612) {
                field8841[field8832++] = var75.field8665;
                return;
            }
            if (arg0 == 2613) {
                field8841[field8832++] = var75.field8587;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class593 var76 = class259.method1728(40, field8841[--field8832]);
                field8841[field8832++] = var76.field8601;
                return;
            }
            if (arg0 == 2701) {
                class593 var77 = class259.method1728(40, field8841[--field8832]);
                if (var77.field8601 != -1) {
                    field8841[field8832++] = var77.field8624;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var78 = field8841[--field8832];
                class563 var79 = (class563) class234.field3309.method524((byte) 112, (long) var78);
                if (var79 != null) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class593 var80 = class259.method1728(40, field8841[--field8832]);
                if (var80.field8512 == null) {
                    field8841[field8832++] = 0;
                    return;
                }
                int var81 = var80.field8512.length;
                for (int var82 = 0; var82 < var80.field8512.length; var82++) {
                    if (var80.field8512[var82] == null) {
                        var81 = var82;
                        break;
                    }
                }
                field8841[field8832++] = var81;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field8832 -= 2;
                int var83 = field8841[field8832];
                int var84 = field8841[field8832 + 1];
                class563 var85 = (class563) class234.field3309.method524((byte) 122, (long) var83);
                if (var85 != null && var85.field8022 == var84) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class593 var86 = class259.method1728(40, field8841[--field8832]);
            if (arg0 == 2800) {
                field8841[field8832++] = client.method1682(var86).method1771((byte) 124);
                return;
            }
            if (arg0 == 2801) {
                int var87 = field8841[--field8832];
                int var343 = var87 - 1;
                if (var86.field8542 != null && var343 < var86.field8542.length && var86.field8542[var343] != null) {
                    field8822[field8837++] = var86.field8542[var343];
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var86.field8563 == null) {
                    field8822[field8837++] = "";
                    return;
                }
                field8822[field8837++] = var86.field8563;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var88 = field8822[--field8837];
                class657.method3754(0, var88);
                return;
            }
            if (arg0 == 3101) {
                field8832 -= 2;
                class35.method196(-1961, field8841[field8832 + 1], field8841[field8832], class439.field6548);
                return;
            }
            if (arg0 == 3103) {
                class20.method125((byte) 99, true);
                return;
            }
            if (arg0 == 3104) {
                String var89 = field8822[--field8837];
                int var90 = 0;
                if (class162.method942(23050, var89)) {
                    var90 = class575.method3340((byte) -101, var89);
                }
                field8833++;
                class308.method2044(class567.field8145, -7434);
                class468.field6960.method1223(true, var90);
                return;
            }
            if (arg0 == 3105) {
                String var91 = field8822[--field8837];
                field8821++;
                class308.method2044(class248.field3515, -7434);
                class468.field6960.method1205((byte) -69, var91.length() + 1);
                class468.field6960.method1237(1049279824, var91);
                return;
            }
            if (arg0 == 3106) {
                String var92 = field8822[--field8837];
                field8820++;
                class308.method2044(class11.field91, -7434);
                class468.field6960.method1205((byte) -69, var92.length() + 1);
                class468.field6960.method1237(1049279824, var92);
                return;
            }
            if (arg0 == 3107) {
                int var93 = field8841[--field8832];
                String var94 = field8822[--field8837];
                class50.method278((byte) 89, var94, var93);
                return;
            }
            if (arg0 == 3108) {
                field8832 -= 3;
                int var95 = field8841[field8832];
                int var96 = field8841[field8832 + 1];
                int var97 = field8841[field8832 + 2];
                class593 var98 = class259.method1728(40, var97);
                class176.method998(var95, var96, (byte) 56, var98);
                return;
            }
            if (arg0 == 3109) {
                field8832 -= 2;
                int var99 = field8841[field8832];
                int var100 = field8841[field8832 + 1];
                class593 var101 = arg1 ? field8826 : field8829;
                class176.method998(var99, var100, (byte) -100, var101);
                return;
            }
            if (arg0 == 3110) {
                int var102 = field8841[--field8832];
                field8836++;
                class308.method2044(class486.field7103, -7434);
                class468.field6960.method1229(var102, 30364);
                return;
            }
            if (arg0 == 3111) {
                field8832 -= 2;
                int var103 = field8841[field8832];
                int var104 = field8841[field8832 + 1];
                class563 var105 = (class563) class234.field3309.method524((byte) 101, (long) var103);
                if (var105 != null) {
                    class292.method1885(true, var105.field8022 != var104, (byte) -72, var105);
                }
                class351.method2227(var104, 0, var103, 3, true);
                return;
            }
            if (arg0 == 3112) {
                field8832--;
                int var106 = field8841[field8832];
                class563 var107 = (class563) class234.field3309.method524((byte) 84, (long) var106);
                if (var107 != null && var107.field8021 == 3) {
                    class292.method1885(true, true, (byte) -72, var107);
                }
                return;
            }
            if (arg0 == 3113) {
                class234.method1513((byte) 116, field8822[--field8837]);
                return;
            }
            if (arg0 == 3114) {
                field8832 -= 2;
                int var108 = field8841[field8832];
                int var109 = field8841[field8832 + 1];
                String var110 = field8822[--field8837];
                class117.method726("", -1, var109, var110, "", var108, "");
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field8832 -= 3;
                class260.method1732(16, field8841[field8832 + 2], 255, field8841[field8832], field8841[field8832 + 1]);
                return;
            }
            if (arg0 == 3201) {
                class281.method1829(664011555, 255, 50, field8841[--field8832]);
                return;
            }
            if (arg0 == 3202) {
                field8832 -= 2;
                class184.method1077(field8841[field8832 + 1], field8841[field8832], (byte) -126, 255);
                return;
            }
            if (arg0 == 3203) {
                field8832 -= 4;
                class260.method1732(16, field8841[field8832 + 2], field8841[field8832 + 3], field8841[field8832], field8841[field8832 + 1]);
                return;
            }
            if (arg0 == 3204) {
                field8832 -= 3;
                class281.method1829(664011555, field8841[field8832 + 1], field8841[field8832 + 2], field8841[field8832]);
                return;
            }
            if (arg0 == 3205) {
                field8832 -= 3;
                class184.method1077(field8841[field8832 + 1], field8841[field8832], (byte) -126, field8841[field8832 + 2]);
                return;
            }
            if (arg0 == 3206) {
                field8832 -= 4;
                class173.method994(field8841[field8832 + 3], field8841[field8832], -9368, false, field8841[field8832 + 2], field8841[field8832 + 1]);
                return;
            }
            if (arg0 == 3207) {
                field8832 -= 4;
                class173.method994(field8841[field8832 + 3], field8841[field8832], -9368, true, field8841[field8832 + 2], field8841[field8832 + 1]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field8841[field8832++] = class287.field3982;
                return;
            }
            if (arg0 == 3301) {
                field8832 -= 2;
                int var111 = field8841[field8832];
                int var112 = field8841[field8832 + 1];
                field8841[field8832++] = class158.method914((byte) 107, false, var112, var111);
                return;
            }
            if (arg0 == 3302) {
                field8832 -= 2;
                int var113 = field8841[field8832];
                int var114 = field8841[field8832 + 1];
                field8841[field8832++] = class198.method1262(var114, var113, false, 0);
                return;
            }
            if (arg0 == 3303) {
                field8832 -= 2;
                int var115 = field8841[field8832];
                int var116 = field8841[field8832 + 1];
                field8841[field8832++] = class588.method3435(false, 0, var115, var116);
                return;
            }
            if (arg0 == 3304) {
                int var117 = field8841[--field8832];
                field8841[field8832++] = class81.field904.method3722(var117, 5).field4738;
                return;
            }
            if (arg0 == 3305) {
                int var118 = field8841[--field8832];
                field8841[field8832++] = class246.field3470[var118];
                return;
            }
            if (arg0 == 3306) {
                int var119 = field8841[--field8832];
                field8841[field8832++] = class208.field2791[var119];
                return;
            }
            if (arg0 == 3307) {
                int var120 = field8841[--field8832];
                field8841[field8832++] = class410.field6245[var120];
                return;
            }
            if (arg0 == 3308) {
                byte var121 = class439.field6548.field1757;
                int var122 = (class439.field6548.field1764 >> 9) + class287.field3980;
                int var123 = (class439.field6548.field1768 >> 9) + class250.field3549;
                field8841[field8832++] = (var121 << 28) + (var122 << 14) + var123;
                return;
            }
            if (arg0 == 3309) {
                int var124 = field8841[--field8832];
                field8841[field8832++] = var124 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var125 = field8841[--field8832];
                field8841[field8832++] = var125 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var126 = field8841[--field8832];
                field8841[field8832++] = var126 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field8841[field8832++] = class525.field7616 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field8832 -= 2;
                int var127 = field8841[field8832];
                int var128 = field8841[field8832 + 1];
                field8841[field8832++] = class158.method914((byte) 107, true, var128, var127);
                return;
            }
            if (arg0 == 3314) {
                field8832 -= 2;
                int var129 = field8841[field8832];
                int var130 = field8841[field8832 + 1];
                field8841[field8832++] = class198.method1262(var130, var129, true, 0);
                return;
            }
            if (arg0 == 3315) {
                field8832 -= 2;
                int var131 = field8841[field8832];
                int var132 = field8841[field8832 + 1];
                field8841[field8832++] = class588.method3435(true, 0, var131, var132);
                return;
            }
            if (arg0 == 3316) {
                if (class315.field4597 >= 2) {
                    field8841[field8832++] = class315.field4597;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field8841[field8832++] = class260.field3703;
                return;
            }
            if (arg0 == 3318) {
                field8841[field8832++] = class461.field6876.field1603;
                return;
            }
            if (arg0 == 3321) {
                field8841[field8832++] = class304.field4470;
                return;
            }
            if (arg0 == 3322) {
                field8841[field8832++] = class246.field3484;
                return;
            }
            if (arg0 == 3323) {
                if (class493.field7185 >= 5 && class493.field7185 <= 9) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class493.field7185 >= 5 && class493.field7185 <= 9) {
                    field8841[field8832++] = class493.field7185;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field8841[field8832++] = class114.field1429 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field8841[field8832++] = class439.field6548.field9462;
                return;
            }
            if (arg0 == 3327) {
                field8841[field8832++] = class439.field6548.field9470.field3836 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field8841[field8832++] = class647.field9366 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var133 = field8841[--field8832];
                field8841[field8832++] = class1.method4(false, (byte) -113, var133);
                return;
            }
            if (arg0 == 3331) {
                field8832 -= 2;
                int var134 = field8841[field8832];
                int var135 = field8841[field8832 + 1];
                field8841[field8832++] = class258.method1724(false, -94, false, var134, var135);
                return;
            }
            if (arg0 == 3332) {
                field8832 -= 2;
                int var136 = field8841[field8832];
                int var137 = field8841[field8832 + 1];
                field8841[field8832++] = class258.method1724(true, -108, false, var136, var137);
                return;
            }
            if (arg0 == 3333) {
                field8841[field8832++] = class414.field6279;
                return;
            }
            if (arg0 == 3335) {
                field8841[field8832++] = class35.field396;
                return;
            }
            if (arg0 == 3336) {
                field8832 -= 4;
                int var138 = field8841[field8832];
                int var139 = field8841[field8832 + 1];
                int var140 = field8841[field8832 + 2];
                int var141 = field8841[field8832 + 3];
                int var142 = (var139 << 14) + var138;
                int var143 = (var140 << 28) + var142;
                int var144 = var141 + var143;
                field8841[field8832++] = var144;
                return;
            }
            if (arg0 == 3337) {
                field8841[field8832++] = class448.field6686;
                return;
            }
            if (arg0 == 3338) {
                field8841[field8832++] = class333.method2165((byte) 46);
                return;
            }
            if (arg0 == 3339) {
                field8841[field8832++] = class162.field1991 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field8841[field8832++] = class44.field466 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field8841[field8832++] = class243.field3448 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field8841[field8832++] = class32.field369.method778(6);
                return;
            }
            if (arg0 == 3343) {
                field8841[field8832++] = class32.field369.method777((byte) -51);
                return;
            }
            if (arg0 == 3344) {
                field8822[field8837++] = class443.method2764(-105);
                return;
            }
            if (arg0 == 3345) {
                field8822[field8837++] = class162.method938(10);
                return;
            }
            if (arg0 == 3346) {
                field8841[field8832++] = class167.method964(-44);
                return;
            }
            if (arg0 == 3347) {
                field8841[field8832++] = class176.field2148;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field8832 -= 2;
                int var145 = field8841[field8832];
                int var146 = field8841[field8832 + 1];
                class242 var147 = class573.field8276.method3539(var145, (byte) -28);
                field8822[field8837++] = var147.method1618((byte) -94, var146);
                return;
            }
            if (arg0 == 3408) {
                field8832 -= 4;
                int var148 = field8841[field8832];
                int var149 = field8841[field8832 + 1];
                int var150 = field8841[field8832 + 2];
                int var151 = field8841[field8832 + 3];
                class242 var152 = class573.field8276.method3539(var150, (byte) -3);
                if (var152.field3433 == var148 && var152.field3418 == var149) {
                    if (var149 == 115) {
                        field8822[field8837++] = var152.method1618((byte) -91, var151);
                        return;
                    }
                    field8841[field8832++] = var152.method1617(87, var151);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field8832 -= 3;
                int var153 = field8841[field8832];
                int var154 = field8841[field8832 + 1];
                int var155 = field8841[field8832 + 2];
                if (var154 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class242 var156 = class573.field8276.method3539(var154, (byte) -89);
                if (var156.field3418 != var153) {
                    throw new RuntimeException("C3409-1");
                }
                field8841[field8832++] = var156.method1613((byte) 110, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var157 = field8841[--field8832];
                String var158 = field8822[--field8837];
                if (var157 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class242 var159 = class573.field8276.method3539(var157, (byte) -115);
                if (var159.field3418 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field8841[field8832++] = var159.method1616(var158, (byte) -84) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var160 = field8841[--field8832];
                class242 var161 = class573.field8276.method3539(var160, (byte) -111);
                field8841[field8832++] = var161.field3427.method521((byte) -77);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class24.field257 == 0) {
                    field8841[field8832++] = -2;
                    return;
                }
                if (class24.field257 == 1) {
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = class602.field8781;
                return;
            }
            if (arg0 == 3601) {
                int var162 = field8841[--field8832];
                if (class24.field257 == 2 && var162 < class602.field8781) {
                    field8822[field8837++] = class37.field408[var162];
                    if (class546.field7812[var162] != null) {
                        field8822[field8837++] = class546.field7812[var162];
                        return;
                    }
                    field8822[field8837++] = "";
                    return;
                }
                field8822[field8837++] = "";
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var163 = field8841[--field8832];
                if (class24.field257 == 2 && var163 < class602.field8781) {
                    field8841[field8832++] = class248.field3519[var163];
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var164 = field8841[--field8832];
                if (class24.field257 == 2 && var164 < class602.field8781) {
                    field8841[field8832++] = class356.field5075[var164];
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var165 = field8822[--field8837];
                int var166 = field8841[--field8832];
                class582.method3377(var165, var166, 1);
                return;
            }
            if (arg0 == 3605) {
                String var167 = field8822[--field8837];
                class656.method3751(var167, (byte) 104);
                return;
            }
            if (arg0 == 3606) {
                String var168 = field8822[--field8837];
                class216.method1424(var168, -1985375032);
                return;
            }
            if (arg0 == 3607) {
                String var169 = field8822[--field8837];
                class73.method486(var169, false, (byte) 121);
                return;
            }
            if (arg0 == 3608) {
                String var170 = field8822[--field8837];
                class454.method2803(var170, 17199);
                return;
            }
            if (arg0 == 3609) {
                String var171 = field8822[--field8837];
                if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                    var171 = var171.substring(7);
                }
                field8841[field8832++] = class256.method1712(111, var171) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var172 = field8841[--field8832];
                if (class24.field257 == 2 && var172 < class602.field8781) {
                    field8822[field8837++] = class32.field361[var172];
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class574.field8287 != null) {
                    field8822[field8837++] = class297.method1988(class574.field8287, (byte) -128);
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class574.field8287 != null) {
                    field8841[field8832++] = class294.field4252;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var173 = field8841[--field8832];
                if (class574.field8287 != null && var173 < class294.field4252) {
                    field8822[field8837++] = class538.field7747[var173].field7622;
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var174 = field8841[--field8832];
                if (class574.field8287 != null && var174 < class294.field4252) {
                    field8841[field8832++] = class538.field7747[var174].field7617;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var175 = field8841[--field8832];
                if (class574.field8287 != null && var175 < class294.field4252) {
                    field8841[field8832++] = class538.field7747[var175].field7619;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field8841[field8832++] = class402.field6071;
                return;
            }
            if (arg0 == 3617) {
                String var176 = field8822[--field8837];
                class488.method2934(-15981, var176);
                return;
            }
            if (arg0 == 3618) {
                field8841[field8832++] = class260.field3708;
                return;
            }
            if (arg0 == 3619) {
                String var177 = field8822[--field8837];
                class300.method1997(var177, (byte) -119);
                return;
            }
            if (arg0 == 3620) {
                class79.method512(true);
                return;
            }
            if (arg0 == 3621) {
                if (class24.field257 == 0) {
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = class245.field3464;
                return;
            }
            if (arg0 == 3622) {
                int var178 = field8841[--field8832];
                if (class24.field257 != 0 && var178 < class245.field3464) {
                    field8822[field8837++] = class601.field8772[var178];
                    if (class446.field6667[var178] != null) {
                        field8822[field8837++] = class446.field6667[var178];
                        return;
                    }
                    field8822[field8837++] = "";
                    return;
                }
                field8822[field8837++] = "";
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var179 = field8822[--field8837];
                if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                    var179 = var179.substring(7);
                }
                field8841[field8832++] = class194.method1187(-61, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var180 = field8841[--field8832];
                if (class538.field7747 != null && var180 < class294.field4252 && class538.field7747[var180].field7618.equalsIgnoreCase(class439.field6548.field9452)) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class81.field907 != null) {
                    field8822[field8837++] = class81.field907;
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var181 = field8841[--field8832];
                if (class574.field8287 != null && var181 < class294.field4252) {
                    field8822[field8837++] = class538.field7747[var181].field7621;
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var182 = field8841[--field8832];
                if (class24.field257 == 2 && var182 >= 0 && var182 < class602.field8781) {
                    field8841[field8832++] = class163.field1994[var182] ? 1 : 0;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var183 = field8822[--field8837];
                if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                    var183 = var183.substring(7);
                }
                field8841[field8832++] = class484.method2924(-108, var183);
                return;
            }
            if (arg0 == 3629) {
                field8841[field8832++] = class346.field4964;
                return;
            }
            if (arg0 == 3630) {
                String var184 = field8822[--field8837];
                class73.method486(var184, true, (byte) 85);
                return;
            }
            if (arg0 == 3631) {
                int var185 = field8841[--field8832];
                field8841[field8832++] = class135.field1688[var185] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var186 = field8841[--field8832];
                if (class574.field8287 != null && var186 < class294.field4252) {
                    field8822[field8837++] = class538.field7747[var186].field7618;
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var187 = field8841[--field8832];
                if (class24.field257 != 0 && var187 < class245.field3464) {
                    field8822[field8837++] = class104.field1250[var187];
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var188 = field8841[--field8832];
                field8841[field8832++] = class330.field4743[var188].method892((byte) -106);
                return;
            }
            if (arg0 == 3904) {
                int var189 = field8841[--field8832];
                field8841[field8832++] = class330.field4743[var189].field1856;
                return;
            }
            if (arg0 == 3905) {
                int var190 = field8841[--field8832];
                field8841[field8832++] = class330.field4743[var190].field1852;
                return;
            }
            if (arg0 == 3906) {
                int var191 = field8841[--field8832];
                field8841[field8832++] = class330.field4743[var191].field1855;
                return;
            }
            if (arg0 == 3907) {
                int var192 = field8841[--field8832];
                field8841[field8832++] = class330.field4743[var192].field1850;
                return;
            }
            if (arg0 == 3908) {
                int var193 = field8841[--field8832];
                field8841[field8832++] = class330.field4743[var193].field1853;
                return;
            }
            if (arg0 == 3910) {
                int var194 = field8841[--field8832];
                int var195 = class330.field4743[var194].method890(7);
                field8841[field8832++] = var195 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var196 = field8841[--field8832];
                int var197 = class330.field4743[var196].method890(7);
                field8841[field8832++] = var197 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var198 = field8841[--field8832];
                int var199 = class330.field4743[var198].method890(7);
                field8841[field8832++] = var199 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var200 = field8841[--field8832];
                int var201 = class330.field4743[var200].method890(7);
                field8841[field8832++] = var201 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field8832 -= 2;
                int var202 = field8841[field8832];
                int var203 = field8841[field8832 + 1];
                field8841[field8832++] = var202 + var203;
                return;
            }
            if (arg0 == 4001) {
                field8832 -= 2;
                int var204 = field8841[field8832];
                int var205 = field8841[field8832 + 1];
                field8841[field8832++] = var204 - var205;
                return;
            }
            if (arg0 == 4002) {
                field8832 -= 2;
                int var206 = field8841[field8832];
                int var207 = field8841[field8832 + 1];
                field8841[field8832++] = var206 * var207;
                return;
            }
            if (arg0 == 4003) {
                field8832 -= 2;
                int var208 = field8841[field8832];
                int var209 = field8841[field8832 + 1];
                field8841[field8832++] = var208 / var209;
                return;
            }
            if (arg0 == 4004) {
                int var210 = field8841[--field8832];
                field8841[field8832++] = (int) (Math.random() * (double) var210);
                return;
            }
            if (arg0 == 4005) {
                int var211 = field8841[--field8832];
                field8841[field8832++] = (int) (Math.random() * (double) (var211 + 1));
                return;
            }
            if (arg0 == 4006) {
                field8832 -= 5;
                int var212 = field8841[field8832];
                int var213 = field8841[field8832 + 1];
                int var214 = field8841[field8832 + 2];
                int var215 = field8841[field8832 + 3];
                int var216 = field8841[field8832 + 4];
                field8841[field8832++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                return;
            }
            if (arg0 == 4007) {
                field8832 -= 2;
                long var217 = (long) field8841[field8832];
                long var219 = (long) field8841[field8832 + 1];
                field8841[field8832++] = (int) (var217 * var219 / 100L + var217);
                return;
            }
            if (arg0 == 4008) {
                field8832 -= 2;
                int var221 = field8841[field8832];
                int var222 = field8841[field8832 + 1];
                field8841[field8832++] = var221 | 0x1 << var222;
                return;
            }
            if (arg0 == 4009) {
                field8832 -= 2;
                int var223 = field8841[field8832];
                int var224 = field8841[field8832 + 1];
                field8841[field8832++] = var223 & -(0x1 << var224) - 1;
                return;
            }
            if (arg0 == 4010) {
                field8832 -= 2;
                int var225 = field8841[field8832];
                int var226 = field8841[field8832 + 1];
                field8841[field8832++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field8832 -= 2;
                int var227 = field8841[field8832];
                int var228 = field8841[field8832 + 1];
                field8841[field8832++] = var227 % var228;
                return;
            }
            if (arg0 == 4012) {
                field8832 -= 2;
                int var229 = field8841[field8832];
                int var230 = field8841[field8832 + 1];
                if (var229 == 0) {
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = (int) Math.pow((double) var229, (double) var230);
                return;
            }
            if (arg0 == 4013) {
                field8832 -= 2;
                int var231 = field8841[field8832];
                int var232 = field8841[field8832 + 1];
                if (var231 == 0) {
                    field8841[field8832++] = 0;
                    return;
                }
                if (var232 == 0) {
                    field8841[field8832++] = Integer.MAX_VALUE;
                    return;
                }
                field8841[field8832++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                return;
            }
            if (arg0 == 4014) {
                field8832 -= 2;
                int var233 = field8841[field8832];
                int var234 = field8841[field8832 + 1];
                field8841[field8832++] = var233 & var234;
                return;
            }
            if (arg0 == 4015) {
                field8832 -= 2;
                int var235 = field8841[field8832];
                int var236 = field8841[field8832 + 1];
                field8841[field8832++] = var235 | var236;
                return;
            }
            if (arg0 == 4016) {
                field8832 -= 2;
                int var237 = field8841[field8832];
                int var238 = field8841[field8832 + 1];
                field8841[field8832++] = var237 < var238 ? var237 : var238;
                return;
            }
            if (arg0 == 4017) {
                field8832 -= 2;
                int var239 = field8841[field8832];
                int var240 = field8841[field8832 + 1];
                field8841[field8832++] = var239 > var240 ? var239 : var240;
                return;
            }
            if (arg0 == 4018) {
                field8832 -= 3;
                long var241 = (long) field8841[field8832];
                long var243 = (long) field8841[field8832 + 1];
                long var245 = (long) field8841[field8832 + 2];
                field8841[field8832++] = (int) (var241 * var245 / var243);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var247 = field8822[--field8837];
                int var248 = field8841[--field8832];
                field8822[field8837++] = var247 + var248;
                return;
            }
            if (arg0 == 4101) {
                field8837 -= 2;
                String var249 = field8822[field8837];
                String var250 = field8822[field8837 + 1];
                field8822[field8837++] = var249 + var250;
                return;
            }
            if (arg0 == 4102) {
                String var251 = field8822[--field8837];
                int var252 = field8841[--field8832];
                field8822[field8837++] = var251 + class104.method649(var252, 17288, true);
                return;
            }
            if (arg0 == 4103) {
                String var253 = field8822[--field8837];
                field8822[field8837++] = var253.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field8822[field8837++] = method3512(field8841[--field8832]);
                return;
            }
            if (arg0 == 4105) {
                field8837 -= 2;
                String var254 = field8822[field8837];
                String var255 = field8822[field8837 + 1];
                if (class439.field6548.field9470 != null && class439.field6548.field9470.field3836) {
                    field8822[field8837++] = var255;
                    return;
                }
                field8822[field8837++] = var254;
                return;
            }
            if (arg0 == 4106) {
                int var256 = field8841[--field8832];
                field8822[field8837++] = Integer.toString(var256);
                return;
            }
            if (arg0 == 4107) {
                field8837 -= 2;
                field8841[field8832++] = class82.method541(0, class35.field396, field8822[field8837 + 1], field8822[field8837]);
                return;
            }
            if (arg0 == 4108) {
                String var257 = field8822[--field8837];
                field8832 -= 2;
                int var258 = field8841[field8832];
                int var259 = field8841[field8832 + 1];
                class402 var260 = class644.method3663(class227.field3191, 89, 0, var259);
                field8841[field8832++] = var260.method2557(class603.field8816, var258, 0, var257);
                return;
            }
            if (arg0 == 4109) {
                String var261 = field8822[--field8837];
                field8832 -= 2;
                int var262 = field8841[field8832];
                int var263 = field8841[field8832 + 1];
                class402 var264 = class644.method3663(class227.field3191, 118, 0, var263);
                field8841[field8832++] = var264.method2559((byte) 127, class603.field8816, var261, var262);
                return;
            }
            if (arg0 == 4110) {
                field8837 -= 2;
                String var265 = field8822[field8837];
                String var266 = field8822[field8837 + 1];
                if (field8841[--field8832] == 1) {
                    field8822[field8837++] = var265;
                    return;
                }
                field8822[field8837++] = var266;
                return;
            }
            if (arg0 == 4111) {
                String var267 = field8822[--field8837];
                field8822[field8837++] = class220.method1435(828, var267);
                return;
            }
            if (arg0 == 4112) {
                String var268 = field8822[--field8837];
                int var269 = field8841[--field8832];
                if (var269 == -1) {
                    throw new RuntimeException("null char");
                }
                field8822[field8837++] = var268 + (char) var269;
                return;
            }
            if (arg0 == 4113) {
                int var270 = field8841[--field8832];
                field8841[field8832++] = class507.method3016((char) var270, true) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var271 = field8841[--field8832];
                field8841[field8832++] = class506.method3012((char) var271, true) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var272 = field8841[--field8832];
                field8841[field8832++] = class104.method648((char) var272, -501) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var273 = field8841[--field8832];
                field8841[field8832++] = class563.method3253((char) var273, (byte) 90) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var274 = field8822[--field8837];
                if (var274 != null) {
                    field8841[field8832++] = var274.length();
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var275 = field8822[--field8837];
                field8832 -= 2;
                int var276 = field8841[field8832];
                int var277 = field8841[field8832 + 1];
                field8822[field8837++] = var275.substring(var276, var277);
                return;
            }
            if (arg0 == 4119) {
                String var278 = field8822[--field8837];
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
                field8822[field8837++] = var279.toString();
                return;
            }
            if (arg0 == 4120) {
                String var283 = field8822[--field8837];
                field8832 -= 2;
                int var284 = field8841[field8832];
                int var285 = field8841[field8832 + 1];
                field8841[field8832++] = var283.indexOf(var284, var285);
                return;
            }
            if (arg0 == 4121) {
                field8837 -= 2;
                String var286 = field8822[field8837];
                String var287 = field8822[field8837 + 1];
                int var288 = field8841[--field8832];
                field8841[field8832++] = var286.indexOf(var287, var288);
                return;
            }
            if (arg0 == 4122) {
                int var289 = field8841[--field8832];
                field8841[field8832++] = Character.toLowerCase((char) var289);
                return;
            }
            if (arg0 == 4123) {
                int var290 = field8841[--field8832];
                field8841[field8832++] = Character.toUpperCase((char) var290);
                return;
            }
            if (arg0 == 4124) {
                boolean var291 = field8841[--field8832] != 0;
                int var292 = field8841[--field8832];
                field8822[field8837++] = class471.method2886(var291, (long) var292, class35.field396, (byte) -120, 0);
                return;
            }
            if (arg0 == 4125) {
                String var293 = field8822[--field8837];
                int var294 = field8841[--field8832];
                class402 var295 = class644.method3663(class227.field3191, 112, 0, var294);
                field8841[field8832++] = var295.method2560(var293, 1, class603.field8816);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var296 = field8841[--field8832];
                field8822[field8837++] = class622.field8999.method25(var296, -96).field2408;
                return;
            }
            if (arg0 == 4201) {
                field8832 -= 2;
                int var297 = field8841[field8832];
                int var298 = field8841[field8832 + 1];
                class190 var299 = class622.field8999.method25(var297, -72);
                if (var298 >= 1 && var298 <= 5 && var299.field2410[var298 - 1] != null) {
                    field8822[field8837++] = var299.field2410[var298 - 1];
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 4202) {
                field8832 -= 2;
                int var300 = field8841[field8832];
                int var301 = field8841[field8832 + 1];
                class190 var302 = class622.field8999.method25(var300, -45);
                if (var301 >= 1 && var301 <= 5 && var302.field2341[var301 - 1] != null) {
                    field8822[field8837++] = var302.field2341[var301 - 1];
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var303 = field8841[--field8832];
                field8841[field8832++] = class622.field8999.method25(var303, -33).field2351;
                return;
            }
            if (arg0 == 4204) {
                int var304 = field8841[--field8832];
                field8841[field8832++] = class622.field8999.method25(var304, -110).field2363 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var305 = field8841[--field8832];
                class190 var306 = class622.field8999.method25(var305, -94);
                if (var306.field2381 == -1 && var306.field2378 >= 0) {
                    field8841[field8832++] = var306.field2378;
                    return;
                }
                field8841[field8832++] = var305;
                return;
            }
            if (arg0 == 4206) {
                int var307 = field8841[--field8832];
                class190 var308 = class622.field8999.method25(var307, -42);
                if (var308.field2381 >= 0 && var308.field2378 >= 0) {
                    field8841[field8832++] = var308.field2378;
                    return;
                }
                field8841[field8832++] = var307;
                return;
            }
            if (arg0 == 4207) {
                int var309 = field8841[--field8832];
                field8841[field8832++] = class622.field8999.method25(var309, -31).field2337 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field8832 -= 2;
                int var310 = field8841[field8832];
                int var311 = field8841[field8832 + 1];
                class403 var312 = class565.field8053.method3495(3, var311);
                if (var312.method2569((byte) -95)) {
                    field8822[field8837++] = class622.field8999.method25(var310, -40).method1133(var312.field6091, var311, (byte) 92);
                    return;
                }
                field8841[field8832++] = class622.field8999.method25(var310, -50).method1143(var312.field6089, 668, var311);
                return;
            }
            if (arg0 == 4209) {
                field8832 -= 2;
                int var313 = field8841[field8832];
                int var314 = field8841[field8832 + 1] - 1;
                class190 var315 = class622.field8999.method25(var313, -70);
                if (var315.field2392 == var314) {
                    field8841[field8832++] = var315.field2347;
                    return;
                }
                if (var315.field2362 == var314) {
                    field8841[field8832++] = var315.field2369;
                    return;
                }
                field8841[field8832++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var316 = field8822[--field8837];
                int var317 = field8841[--field8832];
                class638.method3636(-81, var317 == 1, var316);
                field8841[field8832++] = class289.field3995;
                return;
            }
            if (arg0 == 4211) {
                if (class571.field8241 != null && class257.field3661 < class289.field3995) {
                    field8841[field8832++] = class571.field8241[class257.field3661++] & 0xFFFF;
                    return;
                }
                field8841[field8832++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class257.field3661 = 0;
                return;
            }
            if (arg0 == 4214) {
                String var318 = field8822[--field8837];
                field8832 -= 3;
                int var319 = field8841[field8832];
                int var320 = field8841[field8832 + 1];
                int var321 = field8841[field8832 + 2];
                class407.method2579(1549, var319 == 1, var320, var318, var321);
                field8841[field8832++] = class289.field3995;
                return;
            }
            if (arg0 == 4215) {
                field8837 -= 2;
                field8832 -= 2;
                String var322 = field8822[field8837];
                int var323 = field8841[field8832];
                int var324 = field8841[field8832 + 1];
                String var325 = field8822[field8837 + 1];
                class313.method2063(var323 == 1, var322, var324, (byte) 125, var325);
                field8841[field8832++] = class289.field3995;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field8832 -= 2;
                int var326 = field8841[field8832];
                int var327 = field8841[field8832 + 1];
                class403 var328 = class565.field8053.method3495(3, var327);
                if (var328.method2569((byte) -95)) {
                    field8822[field8837++] = class224.field3151.method1817(108, var326).method3286(-26891, var328.field6091, var327);
                    return;
                }
                field8841[field8832++] = class224.field3151.method1817(-97, var326).method3278(var327, var328.field6089, 107);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field8832 -= 2;
                int var329 = field8841[field8832];
                int var330 = field8841[field8832 + 1];
                class403 var331 = class565.field8053.method3495(3, var330);
                if (var331.method2569((byte) -95)) {
                    field8822[field8837++] = class575.field8301.method1499(-7532, var329).method2466(var330, var331.field6091, 0);
                    return;
                }
                field8841[field8832++] = class575.field8301.method1499(-7532, var329).method2461(-51, var331.field6089, var330);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field8832 -= 2;
                int var332 = field8841[field8832];
                int var333 = field8841[field8832 + 1];
                class403 var334 = class565.field8053.method3495(3, var333);
                if (var334.method2569((byte) -95)) {
                    field8822[field8837++] = class509.field7410.method725(26, var332).method55(var333, var334.field6091, 1);
                    return;
                }
                field8841[field8832++] = class509.field7410.method725(26, var332).method61(true, var333, var334.field6089);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var335 = field8841[--field8832];
            class154 var336 = class393.field6020.method35(-68, var335);
            if (var336.field1871 != null && var336.field1871.length > 0) {
                int var337 = 0;
                int var338 = var336.field1915[0];
                for (int var339 = 1; var339 < var336.field1871.length; var339++) {
                    if (var336.field1915[var339] > var338) {
                        var337 = var339;
                        var338 = var336.field1915[var339];
                    }
                }
                field8841[field8832++] = var336.field1871[var337];
                return;
            }
            field8841[field8832++] = var336.field1866;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method3508(int arg0) {
        if (arg0 == -1 || !class227.method1477(arg0, -1)) {
            return;
        }
        class593[] var1 = class297.field4403[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class593 var3 = var1[var2];
            if (var3.field8543 != null) {
                class86 var4 = new class86();
                var4.field976 = var3;
                var4.field985 = var3.field8543;
                method3506(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    private static final void method3509(int arg0) {
        class593 var1 = class259.method1728(40, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class593[] var3 = class114.field1431[var2];
        if (var3 == null) {
            class593[] var4 = class297.field4403[var2];
            int var5 = var4.length;
            var3 = class114.field1431[var2] = new class593[var5];
            class210.method1327(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class210.method1327(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IZ)V")
    private static final void method3510(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field8841[field8832++] = class176.field2147;
                return;
            }
            if (arg0 == 5001) {
                field8832 -= 3;
                class176.field2147 = field8841[field8832];
                class325.field4690 = class236.method1587(field8841[field8832 + 1], (byte) 105);
                if (class325.field4690 == null) {
                    class325.field4690 = class103.field1237;
                }
                class84.field956 = field8841[field8832 + 2];
                field8838++;
                class308.method2044(class367.field5555, -7434);
                class468.field6960.method1205((byte) -69, class176.field2147);
                class468.field6960.method1205((byte) -69, class325.field4690.field6063);
                class468.field6960.method1205((byte) -69, class84.field956);
                return;
            }
            if (arg0 == 5002) {
                field8837 -= 2;
                String var2 = field8822[field8837];
                String var3 = field8822[field8837 + 1];
                field8832 -= 2;
                int var4 = field8841[field8832];
                int var5 = field8841[field8832 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field8828++;
                class308.method2044(class27.field286, -7434);
                class468.field6960.method1205((byte) -69, class456.method2816(-75, var2) + class456.method2816(-126, var3) + 2);
                class468.field6960.method1237(1049279824, var2);
                class468.field6960.method1205((byte) -69, var4 - 1);
                class468.field6960.method1205((byte) -69, var5);
                class468.field6960.method1237(1049279824, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field8841[--field8832];
                class463 var7 = class24.method149(var6, 0);
                String var8 = "";
                if (var7 != null && var7.field6879 != null) {
                    var8 = var7.field6879;
                }
                field8822[field8837++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field8841[--field8832];
                class463 var10 = class24.method149(var9, 0);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field6883;
                }
                field8841[field8832++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class325.field4690 == null) {
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = class325.field4690.field6063;
                return;
            }
            if (arg0 == 5006) {
                int var12 = field8841[--field8832];
                class308.method2044(class322.field4662, -7434);
                class468.field6960.method1205((byte) -69, var12);
                return;
            }
            if (arg0 == 5008) {
                String var13 = field8822[--field8837];
                method3514(var13, arg0);
                return;
            }
            if (arg0 == 5009) {
                field8837 -= 2;
                String var14 = field8822[field8837];
                String var15 = field8822[field8837 + 1];
                if (class315.field4597 != 0 || (!class345.field4944 || class220.field3004) && !class647.field9366) {
                    field8827++;
                    class308.method2044(class285.field3939, -7434);
                    class468.field6960.method1205((byte) -69, 0);
                    int var16 = class468.field6960.field2610;
                    class468.field6960.method1237(1049279824, var14);
                    class251.method1653(var15, 125, class468.field6960);
                    class468.field6960.method1188(class468.field6960.field2610 - var16, -75);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var17 = field8841[--field8832];
                class463 var18 = class24.method149(var17, 0);
                String var19 = "";
                if (var18 != null && var18.field6884 != null) {
                    var19 = var18.field6884;
                }
                field8822[field8837++] = var19;
                return;
            }
            if (arg0 == 5011) {
                int var20 = field8841[--field8832];
                class463 var21 = class24.method149(var20, 0);
                String var22 = "";
                if (var21 != null && var21.field6894 != null) {
                    var22 = var21.field6894;
                }
                field8822[field8837++] = var22;
                return;
            }
            if (arg0 == 5012) {
                int var23 = field8841[--field8832];
                class463 var24 = class24.method149(var23, 0);
                int var25 = -1;
                if (var24 != null) {
                    var25 = var24.field6881;
                }
                field8841[field8832++] = var25;
                return;
            }
            if (arg0 == 5015) {
                String var26;
                if (class439.field6548 == null || class439.field6548.field9469 == null) {
                    var26 = class498.field7259;
                } else {
                    var26 = class439.field6548.method3744(91, true);
                }
                field8822[field8837++] = var26;
                return;
            }
            if (arg0 == 5016) {
                field8841[field8832++] = class84.field956;
                return;
            }
            if (arg0 == 5017) {
                field8841[field8832++] = class337.method2179(-107);
                return;
            }
            if (arg0 == 5018) {
                int var27 = field8841[--field8832];
                class463 var28 = class24.method149(var27, 0);
                int var29 = 0;
                if (var28 != null) {
                    var29 = var28.field6890;
                }
                field8841[field8832++] = var29;
                return;
            }
            if (arg0 == 5019) {
                int var30 = field8841[--field8832];
                class463 var31 = class24.method149(var30, 0);
                String var32 = "";
                if (var31 != null && var31.field6882 != null) {
                    var32 = var31.field6882;
                }
                field8822[field8837++] = var32;
                return;
            }
            if (arg0 == 5020) {
                String var33;
                if (class439.field6548 == null || class439.field6548.field9469 == null) {
                    var33 = class498.field7259;
                } else {
                    var33 = class439.field6548.method3743((byte) 101, false);
                }
                field8822[field8837++] = var33;
                return;
            }
            if (arg0 == 5023) {
                int var34 = field8841[--field8832];
                class463 var35 = class24.method149(var34, 0);
                int var36 = -1;
                if (var35 != null) {
                    var36 = var35.field6880;
                }
                field8841[field8832++] = var36;
                return;
            }
            if (arg0 == 5024) {
                int var37 = field8841[--field8832];
                class463 var38 = class24.method149(var37, 0);
                int var39 = -1;
                if (var38 != null) {
                    var39 = var38.field6887;
                }
                field8841[field8832++] = var39;
                return;
            }
            if (arg0 == 5025) {
                int var40 = field8841[--field8832];
                class463 var41 = class24.method149(var40, 0);
                String var42 = "";
                if (var41 != null && var41.field6885 != null) {
                    var42 = var41.field6885;
                }
                field8822[field8837++] = var42;
                return;
            }
            if (arg0 == 5050) {
                int var43 = field8841[--field8832];
                field8822[field8837++] = class166.field2040.method246(var43, -27016).field3674;
                return;
            }
            if (arg0 == 5051) {
                int var44 = field8841[--field8832];
                class258 var45 = class166.field2040.method246(var44, -27016);
                if (var45.field3668 == null) {
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = var45.field3668.length;
                return;
            }
            if (arg0 == 5052) {
                field8832 -= 2;
                int var46 = field8841[field8832];
                int var47 = field8841[field8832 + 1];
                class258 var48 = class166.field2040.method246(var46, -27016);
                int var49 = var48.field3668[var47];
                field8841[field8832++] = var49;
                return;
            }
            if (arg0 == 5053) {
                int var50 = field8841[--field8832];
                class258 var51 = class166.field2040.method246(var50, -27016);
                if (var51.field3675 == null) {
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = var51.field3675.length;
                return;
            }
            if (arg0 == 5054) {
                field8832 -= 2;
                int var52 = field8841[field8832];
                int var53 = field8841[field8832 + 1];
                field8841[field8832++] = class166.field2040.method246(var52, -27016).field3675[var53];
                return;
            }
            if (arg0 == 5055) {
                int var54 = field8841[--field8832];
                field8822[field8837++] = class498.field7255.method3401(-1, var54).method624(false);
                return;
            }
            if (arg0 == 5056) {
                int var55 = field8841[--field8832];
                class102 var56 = class498.field7255.method3401(-1, var55);
                if (var56.field1216 == null) {
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = var56.field1216.length;
                return;
            }
            if (arg0 == 5057) {
                field8832 -= 2;
                int var57 = field8841[field8832];
                int var58 = field8841[field8832 + 1];
                field8841[field8832++] = class498.field7255.method3401(-1, var57).field1216[var58];
                return;
            }
            if (arg0 == 5058) {
                field8819 = new class473();
                field8819.field7003 = field8841[--field8832];
                field8819.field7005 = class498.field7255.method3401(-1, field8819.field7003);
                field8819.field6999 = new int[field8819.field7005.method627(0)];
                return;
            }
            if (arg0 == 5059) {
                field8818++;
                class308.method2044(class544.field7777, -7434);
                class468.field6960.method1205((byte) -69, 0);
                int var59 = class468.field6960.field2610;
                class468.field6960.method1205((byte) -69, 0);
                class468.field6960.method1229(field8819.field7003, 30364);
                field8819.field7005.method629(field8819.field6999, class468.field6960, 0);
                class468.field6960.method1188(class468.field6960.field2610 - var59, -97);
                return;
            }
            if (arg0 == 5060) {
                String var60 = field8822[--field8837];
                field8835++;
                class308.method2044(class612.field8906, -7434);
                class468.field6960.method1205((byte) -69, 0);
                int var61 = class468.field6960.field2610;
                class468.field6960.method1237(1049279824, var60);
                class468.field6960.method1229(field8819.field7003, 30364);
                field8819.field7005.method629(field8819.field6999, class468.field6960, 0);
                class468.field6960.method1188(class468.field6960.field2610 - var61, -121);
                return;
            }
            if (arg0 == 5061) {
                field8818++;
                class308.method2044(class544.field7777, -7434);
                class468.field6960.method1205((byte) -69, 0);
                int var62 = class468.field6960.field2610;
                class468.field6960.method1205((byte) -69, 1);
                class468.field6960.method1229(field8819.field7003, 30364);
                field8819.field7005.method629(field8819.field6999, class468.field6960, 0);
                class468.field6960.method1188(class468.field6960.field2610 - var62, -101);
                return;
            }
            if (arg0 == 5062) {
                field8832 -= 2;
                int var63 = field8841[field8832];
                int var64 = field8841[field8832 + 1];
                field8841[field8832++] = class166.field2040.method246(var63, -27016).field3679[var64];
                return;
            }
            if (arg0 == 5063) {
                field8832 -= 2;
                int var65 = field8841[field8832];
                int var66 = field8841[field8832 + 1];
                field8841[field8832++] = class166.field2040.method246(var65, -27016).field3672[var66];
                return;
            }
            if (arg0 == 5064) {
                field8832 -= 2;
                int var67 = field8841[field8832];
                int var68 = field8841[field8832 + 1];
                if (var68 == -1) {
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = class166.field2040.method246(var67, -27016).method1721(-1, (char) var68);
                return;
            }
            if (arg0 == 5065) {
                field8832 -= 2;
                int var69 = field8841[field8832];
                int var70 = field8841[field8832 + 1];
                if (var70 == -1) {
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = class166.field2040.method246(var69, -27016).method1723((char) var70, 0);
                return;
            }
            if (arg0 == 5066) {
                int var71 = field8841[--field8832];
                field8841[field8832++] = class498.field7255.method3401(-1, var71).method627(0);
                return;
            }
            if (arg0 == 5067) {
                field8832 -= 2;
                int var72 = field8841[field8832];
                int var73 = field8841[field8832 + 1];
                int var74 = class498.field7255.method3401(-1, var72).method635(var73, -1).field3812;
                field8841[field8832++] = var74;
                return;
            }
            if (arg0 == 5068) {
                field8832 -= 2;
                int var75 = field8841[field8832];
                int var76 = field8841[field8832 + 1];
                field8819.field6999[var75] = var76;
                return;
            }
            if (arg0 == 5069) {
                field8832 -= 2;
                int var77 = field8841[field8832];
                int var78 = field8841[field8832 + 1];
                field8819.field6999[var77] = var78;
                return;
            }
            if (arg0 == 5070) {
                field8832 -= 3;
                int var79 = field8841[field8832];
                int var80 = field8841[field8832 + 1];
                int var81 = field8841[field8832 + 2];
                class102 var82 = class498.field7255.method3401(-1, var79);
                if (var82.method635(var80, -1).field3812 != 0) {
                    throw new RuntimeException("bad command");
                }
                field8841[field8832++] = var82.method638(var81, false, var80);
                return;
            }
            if (arg0 == 5071) {
                String var83 = field8822[--field8837];
                boolean var84 = field8841[--field8832] == 1;
                class435.method2715(var83, var84, -18633);
                field8841[field8832++] = class289.field3995;
                return;
            }
            if (arg0 == 5072) {
                if (class571.field8241 != null && class257.field3661 < class289.field3995) {
                    field8841[field8832++] = class571.field8241[class257.field3661++] & 0xFFFF;
                    return;
                }
                field8841[field8832++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class257.field3661 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class280.field3915.method284(65, 86)) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class280.field3915.method284(-119, 82)) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class280.field3915.method284(125, 81)) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class566.method3276(field8841[--field8832], 113);
                return;
            }
            if (arg0 == 5201) {
                field8841[field8832++] = class557.method3225(100);
                return;
            }
            if (arg0 == 5205) {
                class305.method2030(false, field8841[--field8832], -1, -1, (byte) 118);
                return;
            }
            if (arg0 == 5206) {
                int var85 = field8841[--field8832];
                class291 var86 = class182.method1053(var85 >> 14 & 0x3FFF, var85 & 0x3FFF);
                if (var86 == null) {
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = var86.field4025;
                return;
            }
            if (arg0 == 5207) {
                class291 var87 = class182.method1067(field8841[--field8832]);
                if (var87 != null && var87.field4019 != null) {
                    field8822[field8837++] = var87.field4019;
                    return;
                }
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 5208) {
                field8841[field8832++] = class547.field7834;
                field8841[field8832++] = class425.field6326;
                return;
            }
            if (arg0 == 5209) {
                field8841[field8832++] = class421.field6299 + class182.field2273;
                field8841[field8832++] = class75.field814 + class182.field2267;
                return;
            }
            if (arg0 == 5210) {
                int var88 = field8841[--field8832];
                class291 var89 = class182.method1067(var88);
                if (var89 == null) {
                    field8841[field8832++] = 0;
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = var89.field4022 >> 14 & 0x3FFF;
                field8841[field8832++] = var89.field4022 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var90 = field8841[--field8832];
                class291 var91 = class182.method1067(var90);
                if (var91 == null) {
                    field8841[field8832++] = 0;
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = var91.field4023 - var91.field4029;
                field8841[field8832++] = var91.field4018 - var91.field4028;
                return;
            }
            if (arg0 == 5212) {
                class480 var92 = class434.method2712(-27868);
                if (var92 == null) {
                    field8841[field8832++] = -1;
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = var92.field7060;
                int var93 = var92.field7054 << 28 | class182.field2273 + var92.field7059 << 14 | class182.field2267 + var92.field7057;
                field8841[field8832++] = var93;
                return;
            }
            if (arg0 == 5213) {
                class480 var94 = class302.method2012(80);
                if (var94 == null) {
                    field8841[field8832++] = -1;
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = var94.field7060;
                int var95 = var94.field7054 << 28 | class182.field2273 + var94.field7059 << 14 | class182.field2267 + var94.field7057;
                field8841[field8832++] = var95;
                return;
            }
            if (arg0 == 5214) {
                int var96 = field8841[--field8832];
                class291 var97 = class652.method3720(-33);
                if (var97 != null) {
                    boolean var98 = var97.method1883(var96 & 0x3FFF, var96 >> 28 & 0x3, 0, var96 >> 14 & 0x3FFF, field8843);
                    if (var98) {
                        class96.method602(field8843[1], 127, field8843[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field8832 -= 2;
                int var99 = field8841[field8832];
                int var100 = field8841[field8832 + 1];
                class248 var101 = class182.method1060(var99 >> 14 & 0x3FFF, var99 & 0x3FFF);
                boolean var102 = false;
                for (class291 var103 = (class291) var101.method1644((byte) -125); var103 != null; var103 = (class291) var101.method1642(0)) {
                    if (var103.field4025 == var100) {
                        var102 = true;
                        break;
                    }
                }
                if (var102) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var104 = field8841[--field8832];
                class291 var105 = class182.method1067(var104);
                if (var105 == null) {
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = var105.field4034;
                return;
            }
            if (arg0 == 5220) {
                field8841[field8832++] = class123.field1537 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var106 = field8841[--field8832];
                class96.method602(var106 >> 14 & 0x3FFF, -114, var106 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class291 var107 = class652.method3720(-33);
                if (var107 != null) {
                    boolean var108 = var107.method1881(class75.field814 + class182.field2267, field8843, class421.field6299 + class182.field2273, 12800);
                    if (var108) {
                        field8841[field8832++] = field8843[1];
                        field8841[field8832++] = field8843[2];
                        return;
                    }
                    field8841[field8832++] = -1;
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = -1;
                field8841[field8832++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field8832 -= 2;
                int var109 = field8841[field8832];
                int var110 = field8841[field8832 + 1];
                class305.method2030(false, var109, var110 >> 14 & 0x3FFF, var110 & 0x3FFF, (byte) 126);
                return;
            }
            if (arg0 == 5224) {
                int var111 = field8841[--field8832];
                class291 var112 = class652.method3720(-33);
                if (var112 != null) {
                    boolean var113 = var112.method1883(var111 & 0x3FFF, var111 >> 28 & 0x3, 0, var111 >> 14 & 0x3FFF, field8843);
                    if (var113) {
                        field8841[field8832++] = field8843[1];
                        field8841[field8832++] = field8843[2];
                        return;
                    }
                    field8841[field8832++] = -1;
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = -1;
                field8841[field8832++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var114 = field8841[--field8832];
                class291 var115 = class652.method3720(-33);
                if (var115 != null) {
                    boolean var116 = var115.method1881(var114 & 0x3FFF, field8843, var114 >> 14 & 0x3FFF, 12800);
                    if (var116) {
                        field8841[field8832++] = field8843[1];
                        field8841[field8832++] = field8843[2];
                        return;
                    }
                    field8841[field8832++] = -1;
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = -1;
                field8841[field8832++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class247.method1636(field8841[--field8832], 91);
                return;
            }
            if (arg0 == 5227) {
                field8832 -= 2;
                int var117 = field8841[field8832];
                int var118 = field8841[field8832 + 1];
                class305.method2030(true, var117, var118 >> 14 & 0x3FFF, var118 & 0x3FFF, (byte) 122);
                return;
            }
            if (arg0 == 5228) {
                class629.field9078 = field8841[--field8832] == 1;
                return;
            }
            if (arg0 == 5229) {
                field8841[field8832++] = class629.field9078 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var119 = field8841[--field8832];
                class150.method885(var119, (byte) 6);
                return;
            }
            if (arg0 == 5231) {
                field8832 -= 2;
                int var120 = field8841[field8832];
                boolean var121 = field8841[field8832 + 1] == 1;
                if (class326.field4700 != null) {
                    class324 var122 = class326.field4700.method524((byte) 111, (long) var120);
                    if (var122 != null && !var121) {
                        var122.method2108(true);
                        return;
                    }
                    if (var122 == null && var121) {
                        class324 var123 = new class324();
                        class326.field4700.method520((byte) -85, var123, (long) var120);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var124 = field8841[--field8832];
                if (class326.field4700 != null) {
                    class324 var125 = class326.field4700.method524((byte) 110, (long) var124);
                    field8841[field8832++] = var125 == null ? 0 : 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field8832 -= 2;
                int var126 = field8841[field8832];
                boolean var127 = field8841[field8832 + 1] == 1;
                if (class645.field9296 != null) {
                    class324 var128 = class645.field9296.method524((byte) 116, (long) var126);
                    if (var128 != null && !var127) {
                        var128.method2108(true);
                        return;
                    }
                    if (var128 == null && var127) {
                        class324 var129 = new class324();
                        class645.field9296.method520((byte) -89, var129, (long) var126);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var130 = field8841[--field8832];
                if (class645.field9296 != null) {
                    class324 var131 = class645.field9296.method524((byte) 115, (long) var130);
                    field8841[field8832++] = var131 == null ? 0 : 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field8841[field8832++] = class182.field2250 == null ? -1 : class182.field2250.field4025;
                return;
            }
            if (arg0 == 5236) {
                field8832 -= 2;
                int var132 = field8841[field8832];
                int var133 = field8841[field8832 + 1];
                int var134 = var133 >> 14 & 0x3FFF;
                int var135 = var133 & 0x3FFF;
                int var136 = class619.method3562(var134, false, var135, var132);
                if (var136 < 0) {
                    field8841[field8832++] = -1;
                    return;
                }
                field8841[field8832++] = var136;
                return;
            }
            if (arg0 == 5237) {
                class40.method216(false);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field8832 -= 2;
                int var137 = field8841[field8832];
                int var138 = field8841[field8832 + 1];
                class225.method1465(var137, 3, false, -102, var138);
                field8841[field8832++] = class375.field5714 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class375.field5714 != null) {
                    class225.method1465(-1, class595.field8694.field6543, false, -99, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class290[] var139 = class277.method1800(true);
                field8841[field8832++] = var139.length;
                return;
            }
            if (arg0 == 5303) {
                int var140 = field8841[--field8832];
                class290[] var141 = class277.method1800(true);
                field8841[field8832++] = var141[var140].field4011;
                field8841[field8832++] = var141[var140].field4013;
                return;
            }
            if (arg0 == 5305) {
                int var142 = class595.field8694.field6546;
                int var143 = class595.field8694.field6559;
                int var144 = -1;
                class290[] var145 = class277.method1800(true);
                for (int var146 = 0; var146 < var145.length; var146++) {
                    class290 var147 = var145[var146];
                    if (var147.field4011 == var142 && var147.field4013 == var143) {
                        var144 = var146;
                        break;
                    }
                }
                field8841[field8832++] = var144;
                return;
            }
            if (arg0 == 5306) {
                field8841[field8832++] = class562.method3250(-32068);
                return;
            }
            if (arg0 == 5307) {
                int var148 = field8841[--field8832];
                if (var148 >= 1 && var148 <= 2) {
                    class225.method1465(-1, var148, false, -22, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field8841[field8832++] = class595.field8694.field6543;
                return;
            }
            if (arg0 == 5309) {
                int var149 = field8841[--field8832];
                if (var149 >= 1 && var149 <= 2) {
                    class595.field8694.field6543 = var149;
                    class595.field8694.method2440(class20.field197, -116);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field8837 -= 2;
                String var150 = field8822[field8837];
                String var151 = field8822[field8837 + 1];
                int var152 = field8841[--field8832];
                field8825++;
                class308.method2044(class206.field2764, -7434);
                class468.field6960.method1205((byte) -69, class456.method2816(-91, var150) + class456.method2816(-80, var151) + 1);
                class468.field6960.method1237(1049279824, var150);
                class468.field6960.method1237(1049279824, var151);
                class468.field6960.method1205((byte) -69, var152);
                return;
            }
            if (arg0 == 5401) {
                field8832 -= 2;
                class591.field8489[field8841[field8832]] = (short) class639.method3645(field8841[field8832 + 1], (byte) -83);
                class622.field8999.method21(true);
                class622.field8999.method16(8860);
                class224.field3151.method1820(-15773);
                class410.method2598(86);
                return;
            }
            if (arg0 == 5405) {
                field8832 -= 2;
                int var153 = field8841[field8832];
                int var154 = field8841[field8832 + 1];
                if (var153 >= 0 && var153 < 2) {
                    class398.field6047[var153] = new int[var154 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field8832 -= 7;
                int var155 = field8841[field8832];
                int var156 = field8841[field8832 + 1] << 1;
                int var157 = field8841[field8832 + 2];
                int var158 = field8841[field8832 + 3];
                int var159 = field8841[field8832 + 4];
                int var160 = field8841[field8832 + 5];
                int var161 = field8841[field8832 + 6];
                if (var155 >= 0 && var155 < 2 && class398.field6047[var155] != null && var156 >= 0 && var156 < class398.field6047[var155].length) {
                    class398.field6047[var155][var156] = new int[] { (var157 >> 14 & 0x3FFF) << 9, var158 << 2, (var157 & 0x3FFF) << 9, var161 };
                    class398.field6047[var155][var156 + 1] = new int[] { (var159 >> 14 & 0x3FFF) << 9, var160 << 2, (var159 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var162 = class398.field6047[field8841[--field8832]].length >> 1;
                field8841[field8832++] = var162;
                return;
            }
            if (arg0 == 5411) {
                if (class375.field5714 != null) {
                    class225.method1465(-1, class595.field8694.field6543, false, -80, -1);
                }
                if (class114.field1430 != null) {
                    class110.method681((byte) 92);
                    System.exit(0);
                    return;
                }
                String var163 = class73.field782 == null ? class254.method1691(10000) : class73.field782;
                class434.method2714(class20.field197, class81.field908 == 1, false, 21545, var163);
                return;
            }
            if (arg0 == 5419) {
                String var164 = "";
                if (class406.field6123 != null) {
                    if (class406.field6123.field2140 == null) {
                        var164 = class18.method114(83, class406.field6123.field2141);
                    } else {
                        var164 = (String) class406.field6123.field2140;
                    }
                }
                field8822[field8837++] = var164;
                return;
            }
            if (arg0 == 5420) {
                field8841[field8832++] = class20.field197.field7804 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class375.field5714 != null) {
                    class225.method1465(-1, class595.field8694.field6543, false, -74, -1);
                }
                String var165 = field8822[--field8837];
                boolean var166 = field8841[--field8832] == 1;
                String var167 = class254.method1691(10000) + var165;
                class434.method2714(class20.field197, class81.field908 == 1, var166, 21545, var167);
                return;
            }
            if (arg0 == 5422) {
                field8837 -= 2;
                String var168 = field8822[field8837];
                String var169 = field8822[field8837 + 1];
                int var170 = field8841[--field8832];
                if (var168.length() > 0) {
                    if (class283.field3934 == null) {
                        class283.field3934 = new String[class274.field3846[class184.field2291.field1843]];
                    }
                    class283.field3934[var170] = var168;
                }
                if (var169.length() > 0) {
                    if (class643.field9268 == null) {
                        class643.field9268 = new String[class274.field3846[class184.field2291.field1843]];
                    }
                    class643.field9268[var170] = var169;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field8822[--field8837]);
                return;
            }
            if (arg0 == 5424) {
                field8832 -= 11;
                class32.field362 = field8841[field8832];
                class311.field4567 = field8841[field8832 + 1];
                class130.field1623 = field8841[field8832 + 2];
                class463.field6893 = field8841[field8832 + 3];
                class613.field8920 = field8841[field8832 + 4];
                class173.field2126 = field8841[field8832 + 5];
                class287.field3973 = field8841[field8832 + 6];
                class118.field1473 = field8841[field8832 + 7];
                class577.field8331 = field8841[field8832 + 8];
                class193.field2548 = field8841[field8832 + 9];
                class99.field1183 = field8841[field8832 + 10];
                class319.field4621.method1311(class613.field8920, (byte) -93);
                class319.field4621.method1311(class173.field2126, (byte) -93);
                class319.field4621.method1311(class287.field3973, (byte) -93);
                class319.field4621.method1311(class118.field1473, (byte) -93);
                class319.field4621.method1311(class577.field8331, (byte) -93);
                class498.field7253 = null;
                class259.field3690 = null;
                class287.field3978 = null;
                class511.field7468 = null;
                class75.field806 = null;
                class379.field5761 = null;
                class160.field1971 = null;
                class453.field6779 = null;
                class438.field6510 = true;
                return;
            }
            if (arg0 == 5425) {
                class26.method155(35633);
                class438.field6510 = false;
                return;
            }
            if (arg0 == 5426) {
                field8832 -= 2;
                class398.field6048 = field8841[field8832];
                class86.field986 = field8841[field8832 + 1];
                return;
            }
            if (arg0 == 5427) {
                field8832 -= 2;
                class501.field7291 = field8841[field8832 + 1];
                return;
            }
            if (arg0 == 5428) {
                field8832 -= 2;
                int var171 = field8841[field8832];
                int var172 = field8841[field8832 + 1];
                field8841[field8832++] = class311.method2057(var172, -1, var171) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class321.method2096(field8822[--field8837], 1, false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class314.method2067(-24319, "accountcreated", class635.field9135);
                    return;
                } catch (Throwable var299) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class314.method2067(-24319, "accountcreatestarted", class635.field9135);
                    return;
                } catch (Throwable var300) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field8832 -= 4;
                int var173 = field8841[field8832];
                int var174 = field8841[field8832 + 1];
                int var175 = field8841[field8832 + 2];
                int var176 = field8841[field8832 + 3];
                class472.method2896(false, (var173 & 0x3FFF) - class250.field3549, var174 << 2, (var173 >> 14 & 0x3FFF) - class287.field3980, var175, var176, 123);
                return;
            }
            if (arg0 == 5501) {
                field8832 -= 4;
                int var177 = field8841[field8832];
                int var178 = field8841[field8832 + 1];
                int var179 = field8841[field8832 + 2];
                int var180 = field8841[field8832 + 3];
                class200.method1272((var177 >> 14 & 0x3FFF) - class287.field3980, -75, var179, (var177 & 0x3FFF) - class250.field3549, var180, var178 << 2);
                return;
            }
            if (arg0 == 5502) {
                field8832 -= 6;
                int var181 = field8841[field8832];
                if (var181 >= 2) {
                    throw new RuntimeException();
                }
                class61.field701 = var181;
                int var182 = field8841[field8832 + 1];
                if (var182 + 1 >= class398.field6047[class61.field701].length >> 1) {
                    throw new RuntimeException();
                }
                class563.field8024 = var182;
                class39.field422 = 0;
                class562.field8020 = field8841[field8832 + 2];
                class614.field8931 = field8841[field8832 + 3];
                int var183 = field8841[field8832 + 4];
                if (var183 >= 2) {
                    throw new RuntimeException();
                }
                class74.field787 = var183;
                int var184 = field8841[field8832 + 5];
                if (var184 + 1 >= class398.field6047[class74.field787].length >> 1) {
                    throw new RuntimeException();
                }
                class259.field3693 = var184;
                class236.field3384 = 3;
                return;
            }
            if (arg0 == 5503) {
                class158.method913(5);
                return;
            }
            if (arg0 == 5504) {
                field8832 -= 2;
                class296.method1984(field8841[field8832], field8841[field8832 + 1], 60, 0);
                return;
            }
            if (arg0 == 5505) {
                field8841[field8832++] = (int) class639.field9187 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field8841[field8832++] = (int) class388.field5967 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class144.method864(-257);
                return;
            }
            if (arg0 == 5508) {
                class305.method2035(-5);
                return;
            }
            if (arg0 == 5509) {
                class260.method1733((byte) 65);
                return;
            }
            if (arg0 == 5510) {
                class474.method2904((byte) 54);
                return;
            }
            if (arg0 == 5511) {
                int var185 = field8841[--field8832];
                int var186 = var185 >> 14 & 0x3FFF;
                int var187 = var185 & 0x3FFF;
                int var188 = var186 - class287.field3980;
                if (var188 < 0) {
                    var188 = 0;
                } else if (var188 >= class90.field1032) {
                    var188 = class90.field1032;
                }
                int var189 = var187 - class250.field3549;
                if (var189 < 0) {
                    var189 = 0;
                } else if (var189 >= class30.field349) {
                    var189 = class30.field349;
                }
                class326.field4703 = (var188 << 9) + 256;
                class151.field1860 = (var189 << 9) + 256;
                class236.field3384 = 4;
                return;
            }
            if (arg0 == 5512) {
                class224.method1459((byte) 82);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field8837 -= 2;
                String var190 = field8822[field8837];
                String var191 = field8822[field8837 + 1];
                int var192 = field8841[--field8832];
                if (class133.field1673 != 2) {
                    return;
                }
                if (class306.field4499 == 0 && class360.field5099 == 0) {
                    class498.field7259 = var190;
                    class111.field1363 = var191;
                    class414.field6279 = var192;
                    class353.method2235(5, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class464.method2842((byte) 112);
                return;
            }
            if (arg0 == 5602) {
                if (class306.field4499 == 0) {
                    class511.field7473 = -2;
                    class123.field1539 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field8832 -= 4;
                if (class133.field1673 != 2) {
                    return;
                }
                if (class306.field4499 == 0 && class360.field5099 == 0) {
                    class362.method2315(field8841[field8832], field8841[field8832 + 3], field8841[field8832 + 2], field8841[field8832 + 1], 104);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field8837--;
                if (class133.field1673 != 2) {
                    return;
                }
                if (class306.field4499 == 0 && class360.field5099 == 0) {
                    class451.method2789(class573.method3335(field8822[field8837], 512), (byte) -125);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field8837 -= 2;
                if (class133.field1673 != 2) {
                    return;
                }
                if (class306.field4499 == 0 && class360.field5099 == 0) {
                    class441.method2744(false, field8822[field8837 + 1], true, class573.method3335(field8822[field8837], 512));
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class360.field5099 == 0) {
                    class523.field7601 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field8841[field8832++] = class123.field1539;
                return;
            }
            if (arg0 == 5608) {
                field8841[field8832++] = class347.field4966;
                return;
            }
            if (arg0 == 5609) {
                field8841[field8832++] = class523.field7601;
                return;
            }
            if (arg0 == 5610) {
                for (int var193 = 0; var193 < 5; var193++) {
                    field8822[field8837++] = class168.field2050.length > var193 ? class297.method1988(class168.field2050[var193], (byte) -128) : "";
                }
                class168.field2050 = null;
                return;
            }
            if (arg0 == 5611) {
                field8841[field8832++] = class301.field4428;
                return;
            }
            if (arg0 == 5612) {
                int var194 = field8841[--field8832];
                if (class133.field1673 != 6) {
                    return;
                }
                if (class306.field4499 == 0 && class360.field5099 == 0) {
                    if (class170.field2077 != null) {
                        class170.field2077.method1841(-18);
                        class170.field2077 = null;
                    }
                    class414.field6279 = var194;
                    class353.method2235(8, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field8841[field8832++] = class123.field1539;
                return;
            }
            if (arg0 == 5615) {
                field8837 -= 2;
                String var195 = field8822[field8837];
                String var196 = field8822[field8837 + 1];
                if (class133.field1673 != 2) {
                    return;
                }
                if (class306.field4499 == 0 && class360.field5099 == 0) {
                    if (class170.field2077 != null) {
                        class170.field2077.method1841(-76);
                        class170.field2077 = null;
                    }
                    class498.field7259 = var195;
                    class111.field1363 = var196;
                    class353.method2235(4, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class177.method1007((byte) -50, false);
                return;
            }
            if (arg0 == 5617) {
                field8841[field8832++] = class511.field7473;
                return;
            }
            if (arg0 == 5618) {
                int var197 = field8841[--field8832];
                class356.method2240(true, false, var197);
                return;
            }
            if (arg0 == 5619) {
                int var198 = field8841[--field8832];
                class356.method2240(true, true, var198);
                return;
            }
            if (arg0 == 5620) {
                class80.method525(1);
                if (class506.field7343 != "" && class506.field7343 != "") {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field8837 -= 2;
                if (class133.field1673 != 2) {
                    return;
                }
                if (class306.field4499 == 0 && class360.field5099 == 0) {
                    class441.method2744(true, field8822[field8837 + 1], true, class573.method3335(field8822[field8837], 512));
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class175 var199 = class20.field197.method3161(false, false, "3");
                while (var199.field2138 == 0) {
                    class646.method3696(1, 1L);
                }
                if (var199.field2138 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class393 var200 = (class393) var199.field2140;
                if (var200.method2530(false).exists()) {
                    class194 var201 = new class194(50);
                    try {
                        var200.method2529(50, var201.field2622, 0, true);
                    } catch (IOException var302) {
                    }
                }
                try {
                    var200.method2528((byte) 93);
                    return;
                } catch (Exception var301) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class19.field195 != null) {
                    field8841[field8832++] = 1;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var202 = field8841[--field8832];
                if (var202 < 1) {
                    var202 = 1;
                }
                if (var202 > 4) {
                    var202 = 4;
                }
                class595.field8694.field6551 = var202;
                class251.method1656(true);
                class595.field8694.method2440(class20.field197, -115);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6002) {
                class595.field8694.method2439(field8841[--field8832] == 1, -15);
                class251.method1656(true);
                class395.method2536(100);
                class595.field8694.method2440(class20.field197, -117);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6003) {
                class595.field8694.field6525 = field8841[--field8832] == 1;
                class395.method2536(75);
                class595.field8694.method2440(class20.field197, -112);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6005) {
                class595.field8694.field6549 = field8841[--field8832] == 1;
                class251.method1656(true);
                class595.field8694.method2440(class20.field197, -108);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6006) {
                class595.field8694.field6564 = field8841[--field8832] == 1;
                class413.field6264.method378(!class595.field8694.field6564);
                class595.field8694.method2440(class20.field197, -116);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6007) {
                class595.field8694.field6542 = field8841[--field8832];
                class595.field8694.method2440(class20.field197, -117);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6008) {
                class595.field8694.field6526 = field8841[--field8832] == 1;
                class595.field8694.method2440(class20.field197, -109);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6009) {
                class595.field8694.field6528 = field8841[--field8832] == 1;
                class251.method1656(true);
                class595.field8694.method2440(class20.field197, -110);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6010) {
                class595.field8694.field6561 = field8841[--field8832] == 1;
                class595.field8694.method2440(class20.field197, -119);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6011) {
                int var203 = field8841[--field8832];
                if (var203 < 0 || var203 > 2) {
                    var203 = 0;
                }
                class595.field8694.method2737(var203, (byte) -99, class81.field908);
                class251.method1656(true);
                class595.field8694.method2440(class20.field197, -120);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6012) {
                class595.field8694.method2738(field8841[--field8832] == 1, class81.field908, (byte) 117);
                class170.method982(17526);
                class329.method2148((byte) 108);
                class595.field8694.method2440(class20.field197, -123);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6014) {
                class595.field8694.field6556 = field8841[--field8832] == 1;
                class251.method1656(true);
                class595.field8694.method2440(class20.field197, -122);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6015) {
                class595.field8694.field6555 = field8841[--field8832] == 1;
                class251.method1656(true);
                class595.field8694.method2440(class20.field197, -120);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6016) {
                int var204 = field8841[--field8832];
                if (var204 < 0 || var204 > 2) {
                    var204 = 0;
                }
                class595.field8694.field6538 = var204;
                class418.method2644(class81.field908, (byte) 80);
                class595.field8694.method2440(class20.field197, -105);
                return;
            }
            if (arg0 == 6017) {
                class595.field8694.field6520 = field8841[--field8832] == 1;
                class215.method1415(587);
                class595.field8694.method2440(class20.field197, -107);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6018) {
                int var205 = field8841[--field8832];
                if (var205 < 0) {
                    var205 = 0;
                }
                if (var205 > 127) {
                    var205 = 127;
                }
                class595.field8694.field6532 = var205;
                class595.field8694.method2440(class20.field197, -107);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6019) {
                int var206 = field8841[--field8832];
                if (var206 < 0) {
                    var206 = 0;
                }
                if (var206 > 255) {
                    var206 = 255;
                }
                if (class595.field8694.field6562 != var206) {
                    if (class595.field8694.field6562 == 0 && class169.field2064 != -1) {
                        class254.method1692(class169.field2064, (byte) -60, class150.field1846, 0, false, var206);
                        class93.field1095 = false;
                    } else if (var206 == 0) {
                        class619.method3564(1);
                        class93.field1095 = false;
                    } else {
                        class577.method3352(var206, 73);
                    }
                    class595.field8694.field6562 = var206;
                }
                class595.field8694.method2440(class20.field197, -110);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6020) {
                int var207 = field8841[--field8832];
                if (var207 < 0) {
                    var207 = 0;
                }
                if (var207 > 127) {
                    var207 = 127;
                }
                class595.field8694.field6544 = var207;
                class595.field8694.method2440(class20.field197, -119);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6021) {
                class595.field8694.field5735 = field8841[--field8832] == 1;
                class395.method2536(92);
                return;
            }
            if (arg0 == 6023) {
                int var208 = field8841[--field8832];
                boolean var209 = false;
                if (var208 < 0) {
                    var208 = 0;
                }
                if (var208 > 2) {
                    var208 = 2;
                }
                if (class362.field5189 < 96) {
                    var208 = 0;
                    var209 = true;
                }
                class62.method441(var208, (byte) 2);
                class595.field8694.method2440(class20.field197, -125);
                class90.field1036 = false;
                field8841[field8832++] = var209 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var210 = field8841[--field8832];
                if (var210 < 0 || var210 > 2) {
                    var210 = 0;
                }
                class595.field8694.field6552 = var210;
                class595.field8694.method2440(class20.field197, -110);
                return;
            }
            if (arg0 == 6025) {
                int var211 = field8841[--field8832];
                if (var211 < 0 || var211 > class41.method222(true, class362.field5189)) {
                    var211 = 0;
                }
                class595.field8694.field6537 = var211;
                class595.field8694.method2440(class20.field197, -128);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6027) {
                int var212 = field8841[--field8832];
                if (var212 < 0 || var212 > 1) {
                    var212 = 0;
                }
                class101.method623(685, var212 == 1);
                return;
            }
            if (arg0 == 6028) {
                class595.field8694.field6522 = field8841[--field8832] != 0;
                class595.field8694.method2440(class20.field197, -113);
                return;
            }
            if (arg0 == 6029) {
                class595.field8694.field6542 = field8841[--field8832];
                class595.field8694.method2440(class20.field197, -119);
                return;
            }
            if (arg0 == 6030) {
                class595.field8694.field6535 = field8841[--field8832] != 0;
                class595.field8694.method2440(class20.field197, -123);
                class251.method1656(true);
                return;
            }
            if (arg0 == 6031) {
                int var213 = field8841[--field8832];
                if (var213 < 0 || var213 > 5) {
                    var213 = 2;
                }
                class418.method2644(var213, (byte) 80);
                return;
            }
            if (arg0 == 6032) {
                int var214 = field8841[--field8832];
                if (var214 < 0 || var214 > 5) {
                    var214 = 2;
                }
                class595.field8694.field6558 = var214;
                class595.field8694.method2440(class20.field197, -119);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6033) {
                int var215 = field8841[--field8832];
                if (var215 < 0 || var215 > 4) {
                    var215 = 2;
                }
                class595.field8694.field6557 = var215;
                class595.field8694.method2440(class20.field197, -105);
                return;
            }
            if (arg0 == 6034) {
                class595.field8694.field6539 = field8841[--field8832] == 1;
                class595.field8694.method2440(class20.field197, -106);
                class170.method982(17526);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6035) {
                class595.field8694.field5749 = field8841[--field8832] == 1;
                class251.method1656(true);
                class395.method2536(70);
                return;
            }
            if (arg0 == 6036) {
                int var216 = field8841[--field8832];
                if (var216 < 0 || var216 > 2) {
                    var216 = 0;
                }
                class595.field8694.method2432(var216, -32280);
                class595.field8694.method2440(class20.field197, -121);
                return;
            }
            if (arg0 == 6037) {
                int var217 = field8841[--field8832];
                if (var217 < 0) {
                    var217 = 0;
                }
                if (var217 > 127) {
                    var217 = 127;
                }
                class595.field8694.field6529 = var217;
                class595.field8694.method2440(class20.field197, -113);
                class90.field1036 = false;
                return;
            }
            if (arg0 == 6038) {
                int var218 = field8841[--field8832];
                if (var218 < 0) {
                    var218 = 0;
                }
                if (var218 > 255) {
                    var218 = 255;
                }
                if (class595.field8694.field6518 != var218 && class337.field4825 == class169.field2064) {
                    if (class595.field8694.field6518 == 0) {
                        class254.method1692(class169.field2064, (byte) -60, class150.field1846, 0, false, var218);
                        class93.field1095 = false;
                    } else if (var218 == 0) {
                        class619.method3564(1);
                        class93.field1095 = false;
                    } else {
                        class577.method3352(var218, 127);
                    }
                }
                class595.field8694.field6518 = var218;
                class595.field8694.method2440(class20.field197, -126);
                class90.field1036 = false;
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field8841[field8832++] = class595.field8694.field6551;
                return;
            }
            if (arg0 == 6102) {
                field8841[field8832++] = class595.field8694.method2428(1, class81.field908) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field8841[field8832++] = class595.field8694.field6525 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field8841[field8832++] = class595.field8694.field6549 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field8841[field8832++] = class595.field8694.field6564 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field8841[field8832++] = class595.field8694.field6542;
                return;
            }
            if (arg0 == 6108) {
                field8841[field8832++] = class595.field8694.field6526 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field8841[field8832++] = class595.field8694.field6528 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field8841[field8832++] = class595.field8694.field6561 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field8841[field8832++] = class595.field8694.method2735((byte) -128, class81.field908);
                return;
            }
            if (arg0 == 6112) {
                field8841[field8832++] = class595.field8694.method2732(class81.field908, (byte) -120) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field8841[field8832++] = class595.field8694.field6556 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field8841[field8832++] = class595.field8694.field6555 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field8841[field8832++] = class595.field8694.field6538;
                return;
            }
            if (arg0 == 6117) {
                field8841[field8832++] = class595.field8694.field6520 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field8841[field8832++] = class595.field8694.field6532;
                return;
            }
            if (arg0 == 6119) {
                field8841[field8832++] = class595.field8694.field6562;
                return;
            }
            if (arg0 == 6120) {
                field8841[field8832++] = class595.field8694.field6544;
                return;
            }
            if (arg0 == 6121) {
                field8841[field8832++] = class413.field6264.method398() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field8841[field8832++] = class229.method1481(-122);
                return;
            }
            if (arg0 == 6124) {
                field8841[field8832++] = class595.field8694.field6552;
                return;
            }
            if (arg0 == 6125) {
                field8841[field8832++] = class595.field8694.field6537;
                return;
            }
            if (arg0 == 6126) {
                field8841[field8832++] = class413.field6264.method331() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field8841[field8832++] = class595.field8694.field6523 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field8841[field8832++] = class595.field8694.field6522 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field8841[field8832++] = class595.field8694.field6542;
                return;
            }
            if (arg0 == 6130) {
                field8841[field8832++] = class595.field8694.field6535 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field8841[field8832++] = class81.field908;
                return;
            }
            if (arg0 == 6132) {
                field8841[field8832++] = class595.field8694.field6558;
                return;
            }
            if (arg0 == 6133) {
                field8841[field8832++] = class20.field197.field7804 && !class20.field197.field7802 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field8841[field8832++] = class41.method222(true, class362.field5189);
                return;
            }
            if (arg0 == 6135) {
                field8841[field8832++] = class595.field8694.field6557;
                return;
            }
            if (arg0 == 6136) {
                field8841[field8832++] = class595.field8694.field6539 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var219 = true;
                try {
                    var219 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var303) {
                }
                field8841[field8832++] = var219 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field8841[field8832++] = class45.method234(class81.field908, true, 200);
                return;
            }
            if (arg0 == 6139) {
                field8841[field8832++] = class595.field8694.method2427(107, class81.field908);
                return;
            }
            if (arg0 == 6140) {
                byte var220 = 0;
                if (class15.method99(class81.field908, -46) && class362.field5189 < 96) {
                    var220 = 1;
                }
                field8841[field8832++] = var220;
                return;
            }
            if (arg0 == 6141) {
                if (class362.field5189 < 96) {
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field8841[field8832++] = class595.field8694.field6529;
                return;
            }
            if (arg0 == 6143) {
                field8841[field8832++] = class595.field8694.field6518;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field8832 -= 2;
                class38.field415 = (short) field8841[field8832];
                if (class38.field415 <= 0) {
                    class38.field415 = 256;
                }
                class104.field1246 = (short) field8841[field8832 + 1];
                if (class104.field1246 <= 0) {
                    class104.field1246 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field8832 -= 2;
                class310.field4560 = (short) field8841[field8832];
                if (class310.field4560 <= 0) {
                    class310.field4560 = 256;
                }
                class635.field9133 = (short) field8841[field8832 + 1];
                if (class635.field9133 <= 0) {
                    class635.field9133 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field8832 -= 4;
                class100.field1194 = (short) field8841[field8832];
                if (class100.field1194 <= 0) {
                    class100.field1194 = 1;
                }
                class359.field5089 = (short) field8841[field8832 + 1];
                if (class359.field5089 <= 0) {
                    class359.field5089 = 32767;
                } else if (class359.field5089 < class100.field1194) {
                    class359.field5089 = class100.field1194;
                }
                class512.field7484 = (short) field8841[field8832 + 2];
                if (class512.field7484 <= 0) {
                    class512.field7484 = 1;
                }
                class323.field4671 = (short) field8841[field8832 + 3];
                if (class323.field4671 <= 0) {
                    class323.field4671 = 32767;
                    return;
                }
                if (class323.field4671 < class512.field7484) {
                    class323.field4671 = class512.field7484;
                }
                return;
            }
            if (arg0 == 6203) {
                class573.method3331(false, 0, class638.field9171.field8570, 0, class638.field9171.field8518, 31243);
                field8841[field8832++] = class455.field6797;
                field8841[field8832++] = class594.field8685;
                return;
            }
            if (arg0 == 6204) {
                field8841[field8832++] = class310.field4560;
                field8841[field8832++] = class635.field9133;
                return;
            }
            if (arg0 == 6205) {
                field8841[field8832++] = class38.field415;
                field8841[field8832++] = class104.field1246;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field8841[field8832++] = (int) (class84.method550((byte) -114) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field8841[field8832++] = (int) (class84.method550((byte) -102) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field8832 -= 3;
                int var221 = field8841[field8832];
                int var222 = field8841[field8832 + 1];
                int var223 = field8841[field8832 + 2];
                field8839.clear();
                field8839.set(11, 12);
                field8839.set(var223, var222, var221);
                int var224 = (int) (field8839.getTime().getTime() / 86400000L) - 11745;
                if (var223 < 1970) {
                    var224--;
                }
                field8841[field8832++] = var224;
                return;
            }
            if (arg0 == 6303) {
                field8839.clear();
                field8839.setTime(new Date(class84.method550((byte) -104)));
                field8841[field8832++] = field8839.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var225 = field8841[--field8832];
                boolean var226 = true;
                if (var225 < 0) {
                    var226 = (var225 + 1) % 4 == 0;
                } else if (var225 < 1582) {
                    var226 = var225 % 4 == 0;
                } else if (var225 % 4 != 0) {
                    var226 = false;
                } else if (var225 % 100 != 0) {
                    var226 = true;
                } else if (var225 % 400 != 0) {
                    var226 = false;
                }
                field8841[field8832++] = var226 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field8841[field8832++] = class315.method2071(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field8841[field8832++] = class436.method2721(-1) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class133.field1673 == 6 && class306.field4499 == 0 && class360.field5099 == 0) {
                    if (class206.field2767) {
                        field8841[field8832++] = 0;
                        return;
                    }
                    if (class467.field6934 > class84.method550((byte) -87) - 1000L) {
                        field8841[field8832++] = 1;
                        return;
                    }
                    class206.field2767 = true;
                    class308.method2044(class297.field4397, -7434);
                    class468.field6960.method1223(true, class450.field6725);
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class511 var227 = class351.method2230((byte) -29);
                if (var227 != null) {
                    field8841[field8832++] = var227.field7469;
                    field8841[field8832++] = var227.field6346;
                    field8822[field8837++] = var227.field7467;
                    class263 var228 = var227.method3041((byte) -104);
                    field8841[field8832++] = var228.field3740;
                    field8822[field8837++] = var228.field3735;
                    field8841[field8832++] = var227.field6347;
                    field8841[field8832++] = var227.field7475;
                    field8822[field8837++] = var227.field7471;
                    return;
                }
                field8841[field8832++] = -1;
                field8841[field8832++] = 0;
                field8822[field8837++] = "";
                field8841[field8832++] = 0;
                field8822[field8837++] = "";
                field8841[field8832++] = 0;
                field8841[field8832++] = 0;
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 6502) {
                class511 var229 = class301.method1999((byte) -128);
                if (var229 != null) {
                    field8841[field8832++] = var229.field7469;
                    field8841[field8832++] = var229.field6346;
                    field8822[field8837++] = var229.field7467;
                    class263 var230 = var229.method3041((byte) -85);
                    field8841[field8832++] = var230.field3740;
                    field8822[field8837++] = var230.field3735;
                    field8841[field8832++] = var229.field6347;
                    field8841[field8832++] = var229.field7475;
                    field8822[field8837++] = var229.field7471;
                    return;
                }
                field8841[field8832++] = -1;
                field8841[field8832++] = 0;
                field8822[field8837++] = "";
                field8841[field8832++] = 0;
                field8822[field8837++] = "";
                field8841[field8832++] = 0;
                field8841[field8832++] = 0;
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var231 = field8841[--field8832];
                String var232 = field8822[--field8837];
                if (class133.field1673 == 6 && class306.field4499 == 0 && class360.field5099 == 0) {
                    field8841[field8832++] = class371.method2391(false, var232, var231) ? 1 : 0;
                    return;
                }
                field8841[field8832++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class595.field8694.field6533 = field8841[--field8832];
                class595.field8694.method2440(class20.field197, -117);
                return;
            }
            if (arg0 == 6505) {
                field8841[field8832++] = class595.field8694.field6533;
                return;
            }
            if (arg0 == 6506) {
                int var233 = field8841[--field8832];
                class511 var234 = class18.method120(false, var233);
                if (var234 != null) {
                    field8841[field8832++] = var234.field6346;
                    field8822[field8837++] = var234.field7467;
                    class263 var235 = var234.method3041((byte) -120);
                    field8841[field8832++] = var235.field3740;
                    field8822[field8837++] = var235.field3735;
                    field8841[field8832++] = var234.field6347;
                    field8841[field8832++] = var234.field7475;
                    field8822[field8837++] = var234.field7471;
                    return;
                }
                field8841[field8832++] = -1;
                field8822[field8837++] = "";
                field8841[field8832++] = 0;
                field8822[field8837++] = "";
                field8841[field8832++] = 0;
                field8841[field8832++] = 0;
                field8822[field8837++] = "";
                return;
            }
            if (arg0 == 6507) {
                field8832 -= 4;
                int var236 = field8841[field8832];
                boolean var237 = field8841[field8832 + 1] == 1;
                int var238 = field8841[field8832 + 2];
                boolean var239 = field8841[field8832 + 3] == 1;
                class368.method2356(var236, var238, var239, (byte) 93, var237);
                return;
            }
            if (arg0 == 6508) {
                class566.method3281(-1931572125);
                return;
            }
            if (arg0 == 6509) {
                if (class133.field1673 != 6) {
                    return;
                }
                class402.field6085 = field8841[--field8832] == 1;
                return;
            }
            if (arg0 == 6510) {
                field8841[field8832++] = class82.field911;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class595.field8694.field6547 = field8841[--field8832] == 1;
                class595.field8694.method2440(class20.field197, -104);
                return;
            }
            if (arg0 == 6601) {
                field8841[field8832++] = class595.field8694.field6547 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class213.field2944 == class118.field1480) {
            if (arg0 == 6700) {
                int var240 = class234.field3309.method521((byte) -77);
                if (class518.field7542 != -1) {
                    var240++;
                }
                field8841[field8832++] = var240;
                return;
            }
            if (arg0 == 6701) {
                int var241 = field8841[--field8832];
                if (class518.field7542 != -1) {
                    if (var241 == 0) {
                        field8841[field8832++] = class518.field7542;
                        return;
                    }
                    var241--;
                }
                class563 var242 = (class563) class234.field3309.method523(-119);
                while (var241-- > 0) {
                    var242 = (class563) class234.field3309.method530(12714);
                }
                field8841[field8832++] = var242.field8022;
                return;
            }
            if (arg0 == 6702) {
                int var243 = field8841[--field8832];
                if (class297.field4403[var243] == null) {
                    field8822[field8837++] = "";
                    return;
                }
                String var244 = class297.field4403[var243][0].field8551;
                if (var244 == null) {
                    field8822[field8837++] = "";
                    return;
                }
                field8822[field8837++] = var244.substring(0, var244.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var245 = field8841[--field8832];
                if (class297.field4403[var245] == null) {
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = class297.field4403[var245].length;
                return;
            }
            if (arg0 == 6704) {
                field8832 -= 2;
                int var246 = field8841[field8832];
                int var247 = field8841[field8832 + 1];
                if (class297.field4403[var246] == null) {
                    field8822[field8837++] = "";
                    return;
                }
                String var248 = class297.field4403[var246][var247].field8551;
                if (var248 == null) {
                    field8822[field8837++] = "";
                    return;
                }
                field8822[field8837++] = var248;
                return;
            }
            if (arg0 == 6705) {
                field8832 -= 2;
                int var249 = field8841[field8832];
                int var250 = field8841[field8832 + 1];
                if (class297.field4403[var249] == null) {
                    field8841[field8832++] = 0;
                    return;
                }
                field8841[field8832++] = class297.field4403[var249][var250].field8532;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field8832 -= 3;
                int var251 = field8841[field8832];
                int var252 = field8841[field8832 + 1];
                int var253 = field8841[field8832 + 2];
                class471.method2887(var251 << 16 | var252, "", 1, var253, (byte) 127);
                return;
            }
            if (arg0 == 6708) {
                field8832 -= 3;
                int var254 = field8841[field8832];
                int var255 = field8841[field8832 + 1];
                int var256 = field8841[field8832 + 2];
                class471.method2887(var254 << 16 | var255, "", 2, var256, (byte) 125);
                return;
            }
            if (arg0 == 6709) {
                field8832 -= 3;
                int var257 = field8841[field8832];
                int var258 = field8841[field8832 + 1];
                int var259 = field8841[field8832 + 2];
                class471.method2887(var257 << 16 | var258, "", 3, var259, (byte) 127);
                return;
            }
            if (arg0 == 6710) {
                field8832 -= 3;
                int var260 = field8841[field8832];
                int var261 = field8841[field8832 + 1];
                int var262 = field8841[field8832 + 2];
                class471.method2887(var260 << 16 | var261, "", 4, var262, (byte) 125);
                return;
            }
            if (arg0 == 6711) {
                field8832 -= 3;
                int var263 = field8841[field8832];
                int var264 = field8841[field8832 + 1];
                int var265 = field8841[field8832 + 2];
                class471.method2887(var263 << 16 | var264, "", 5, var265, (byte) 126);
                return;
            }
            if (arg0 == 6712) {
                field8832 -= 3;
                int var266 = field8841[field8832];
                int var267 = field8841[field8832 + 1];
                int var268 = field8841[field8832 + 2];
                class471.method2887(var266 << 16 | var267, "", 6, var268, (byte) 125);
                return;
            }
            if (arg0 == 6713) {
                field8832 -= 3;
                int var269 = field8841[field8832];
                int var270 = field8841[field8832 + 1];
                int var271 = field8841[field8832 + 2];
                class471.method2887(var269 << 16 | var270, "", 7, var271, (byte) 127);
                return;
            }
            if (arg0 == 6714) {
                field8832 -= 3;
                int var272 = field8841[field8832];
                int var273 = field8841[field8832 + 1];
                int var274 = field8841[field8832 + 2];
                class471.method2887(var272 << 16 | var273, "", 8, var274, (byte) 126);
                return;
            }
            if (arg0 == 6715) {
                field8832 -= 3;
                int var275 = field8841[field8832];
                int var276 = field8841[field8832 + 1];
                int var277 = field8841[field8832 + 2];
                class471.method2887(var275 << 16 | var276, "", 9, var277, (byte) 126);
                return;
            }
            if (arg0 == 6716) {
                field8832 -= 3;
                int var278 = field8841[field8832];
                int var279 = field8841[field8832 + 1];
                int var280 = field8841[field8832 + 2];
                class471.method2887(var278 << 16 | var279, "", 10, var280, (byte) 127);
                return;
            }
            if (arg0 == 6717) {
                field8832 -= 3;
                int var281 = field8841[field8832];
                int var282 = field8841[field8832 + 1];
                int var283 = field8841[field8832 + 2];
                class593 var284 = class322.method2103(var283, false, var281 << 16 | var282);
                class650.method3713(true);
                class271 var285 = client.method1682(var284);
                class93.method589(var285.method1771((byte) 88), (byte) -27, var285.field3804, var284);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var286 = field8841[--field8832];
                class431 var287 = class59.field680.method1014(var286, 5187);
                if (var287.field6418 == null) {
                    field8822[field8837++] = "";
                    return;
                }
                field8822[field8837++] = var287.field6418;
                return;
            }
            if (arg0 == 6801) {
                int var288 = field8841[--field8832];
                class431 var289 = class59.field680.method1014(var288, 5187);
                field8841[field8832++] = var289.field6407;
                return;
            }
            if (arg0 == 6802) {
                int var290 = field8841[--field8832];
                class431 var291 = class59.field680.method1014(var290, 5187);
                field8841[field8832++] = var291.field6400;
                return;
            }
            if (arg0 == 6803) {
                int var292 = field8841[--field8832];
                class431 var293 = class59.field680.method1014(var292, 5187);
                field8841[field8832++] = var293.field6403;
                return;
            }
            if (arg0 == 6804) {
                field8832 -= 2;
                int var294 = field8841[field8832];
                int var295 = field8841[field8832 + 1];
                class403 var296 = class565.field8053.method3495(3, var295);
                if (var296.method2569((byte) -95)) {
                    field8822[field8837++] = class59.field680.method1014(var294, 5187).method2688(var296.field6091, var295, Integer.MIN_VALUE);
                    return;
                }
                field8841[field8832++] = class59.field680.method1014(var294, 5187).method2693(var295, var296.field6089, -87);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field8841[field8832++] = class345.field4944 && !class220.field3004 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field8841[field8832++] = class404.field6104;
                return;
            }
            if (arg0 == 6902) {
                field8841[field8832++] = class405.field6118;
                return;
            }
            if (arg0 == 6903) {
                field8841[field8832++] = class59.field683;
                return;
            }
            if (arg0 == 6904) {
                field8841[field8832++] = class140.field1730;
                return;
            }
            if (arg0 == 6905) {
                String var297 = "";
                if (class406.field6123 != null) {
                    if (class406.field6123.field2140 == null) {
                        var297 = class18.method114(123, class406.field6123.field2141);
                    } else {
                        var297 = (String) class406.field6123.field2140;
                    }
                }
                field8822[field8837++] = var297;
                return;
            }
            if (arg0 == 6906) {
                field8841[field8832++] = class139.field1718;
                return;
            }
            if (arg0 == 6907) {
                field8841[field8832++] = class513.field7487;
                return;
            }
            if (arg0 == 6908) {
                field8841[field8832++] = class657.field9495;
                return;
            }
            if (arg0 == 6909) {
                field8841[field8832++] = class260.field3702 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field8841[field8832++] = class403.field6101;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var298 = class595.field8694.method2434((byte) 79);
                field8841[field8832++] = class595.field8694.field5754 = class81.field908;
                field8841[field8832++] = var298;
                class251.method1656(true);
                return;
            }
            if (arg0 == 7001) {
                class595.field8694.method2423(4);
                class251.method1656(true);
                return;
            }
            if (arg0 == 7002) {
                class595.field8694.method2424(-103);
                class251.method1656(true);
                return;
            }
            if (arg0 == 7003) {
                class595.field8694.method2437((byte) 41);
                class251.method1656(true);
                return;
            }
            if (arg0 == 7004) {
                class595.field8694.method2430(57);
                class251.method1656(true);
                return;
            }
            if (arg0 == 7005) {
                class595.field8694.field6563 = 0;
                return;
            }
            if (arg0 == 7006) {
                if (class595.field8694.field5754 == 2) {
                    class595.field8694.field5755 = true;
                    return;
                }
                if (class595.field8694.field5754 == 1) {
                    class595.field8694.field5740 = true;
                    return;
                }
                if (class595.field8694.field5754 == 3) {
                    class595.field8694.field5739 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field8841[field8832++] = class595.field8694.field6563;
                return;
            }
            if (arg0 == 7008) {
                if (class81.field908 == 0 && class362.field5189 < 96) {
                    field8841[field8832++] = 2;
                    return;
                }
                field8841[field8832++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()V")
    public static final void method3511() {
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)Ljava/lang/String;")
    private static final String method3512(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field8839.setTime(new Date(var1));
        int var3 = field8839.get(5);
        int var4 = field8839.get(2);
        int var5 = field8839.get(1);
        return var3 + "-" + field8842[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lfj;II)V")
    public static final void method3513(class572 arg0, int arg1, int arg2) {
        class407 var3 = class355.method2237(arg0, -25775, arg2, arg1);
        if (var3 == null) {
            return;
        }
        field8817 = new int[var3.field6134];
        field8830 = new String[var3.field6130];
        if (class450.field6717 == var3.field6131 || class197.field2665 == var3.field6131 || class626.field9055 == var3.field6131) {
            int var4 = 0;
            int var5 = 0;
            if (class50.field537 != null) {
                var4 = class50.field537.field8586;
                var5 = class50.field537.field8637;
            }
            field8817[0] = class32.field369.method778(6) - var4;
            field8817[1] = class32.field369.method777((byte) 101) - var5;
        }
        method3515(var3, 200000);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method3514(String arg0, int arg1) {
        if (class315.field4597 == 0 && !(!class345.field4944 || class220.field3004) || class647.field9366) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class635.field9126.method2902(0, -20139))) {
            var3 = 0;
            arg0 = arg0.substring(class635.field9126.method2902(0, -20139).length());
        } else if (var2.startsWith(class624.field9006.method2902(0, -20139))) {
            var3 = 1;
            arg0 = arg0.substring(class624.field9006.method2902(0, -20139).length());
        } else if (var2.startsWith(class173.field2127.method2902(0, -20139))) {
            var3 = 2;
            arg0 = arg0.substring(class173.field2127.method2902(0, -20139).length());
        } else if (var2.startsWith(class139.field1711.method2902(0, -20139))) {
            var3 = 3;
            arg0 = arg0.substring(class139.field1711.method2902(0, -20139).length());
        } else if (var2.startsWith(class344.field4925.method2902(0, -20139))) {
            var3 = 4;
            arg0 = arg0.substring(class344.field4925.method2902(0, -20139).length());
        } else if (var2.startsWith(class444.field6641.method2902(0, -20139))) {
            var3 = 5;
            arg0 = arg0.substring(class444.field6641.method2902(0, -20139).length());
        } else if (var2.startsWith(class625.field9029.method2902(0, -20139))) {
            var3 = 6;
            arg0 = arg0.substring(class625.field9029.method2902(0, -20139).length());
        } else if (var2.startsWith(class518.field7539.method2902(0, -20139))) {
            var3 = 7;
            arg0 = arg0.substring(class518.field7539.method2902(0, -20139).length());
        } else if (var2.startsWith(class261.field3712.method2902(0, -20139))) {
            var3 = 8;
            arg0 = arg0.substring(class261.field3712.method2902(0, -20139).length());
        } else if (var2.startsWith(class44.field465.method2902(0, -20139))) {
            var3 = 9;
            arg0 = arg0.substring(class44.field465.method2902(0, -20139).length());
        } else if (var2.startsWith(class315.field4604.method2902(0, -20139))) {
            var3 = 10;
            arg0 = arg0.substring(class315.field4604.method2902(0, -20139).length());
        } else if (var2.startsWith(class226.field3178.method2902(0, -20139))) {
            var3 = 11;
            arg0 = arg0.substring(class226.field3178.method2902(0, -20139).length());
        } else if (class35.field396 != 0) {
            if (var2.startsWith(class635.field9126.method2902(class35.field396, -20139))) {
                var3 = 0;
                arg0 = arg0.substring(class635.field9126.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class624.field9006.method2902(class35.field396, -20139))) {
                var3 = 1;
                arg0 = arg0.substring(class624.field9006.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class173.field2127.method2902(class35.field396, -20139))) {
                var3 = 2;
                arg0 = arg0.substring(class173.field2127.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class139.field1711.method2902(class35.field396, -20139))) {
                var3 = 3;
                arg0 = arg0.substring(class139.field1711.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class344.field4925.method2902(class35.field396, -20139))) {
                var3 = 4;
                arg0 = arg0.substring(class344.field4925.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class444.field6641.method2902(class35.field396, -20139))) {
                var3 = 5;
                arg0 = arg0.substring(class444.field6641.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class625.field9029.method2902(class35.field396, -20139))) {
                var3 = 6;
                arg0 = arg0.substring(class625.field9029.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class518.field7539.method2902(class35.field396, -20139))) {
                var3 = 7;
                arg0 = arg0.substring(class518.field7539.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class261.field3712.method2902(class35.field396, -20139))) {
                var3 = 8;
                arg0 = arg0.substring(class261.field3712.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class44.field465.method2902(class35.field396, -20139))) {
                var3 = 9;
                arg0 = arg0.substring(class44.field465.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class315.field4604.method2902(class35.field396, -20139))) {
                var3 = 10;
                arg0 = arg0.substring(class315.field4604.method2902(class35.field396, -20139).length());
            } else if (var2.startsWith(class226.field3178.method2902(class35.field396, -20139))) {
                var3 = 11;
                arg0 = arg0.substring(class226.field3178.method2902(class35.field396, -20139).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class496.field7242.method2902(0, -20139))) {
            var5 = 1;
            arg0 = arg0.substring(class496.field7242.method2902(0, -20139).length());
        } else if (var4.startsWith(class41.field450.method2902(0, -20139))) {
            var5 = 2;
            arg0 = arg0.substring(class41.field450.method2902(0, -20139).length());
        } else if (var4.startsWith(class439.field6534.method2902(0, -20139))) {
            var5 = 3;
            arg0 = arg0.substring(class439.field6534.method2902(0, -20139).length());
        } else if (var4.startsWith(class566.field8137.method2902(0, -20139))) {
            var5 = 4;
            arg0 = arg0.substring(class566.field8137.method2902(0, -20139).length());
        } else if (var4.startsWith(class329.field4742.method2902(0, -20139))) {
            var5 = 5;
            arg0 = arg0.substring(class329.field4742.method2902(0, -20139).length());
        } else if (class35.field396 != 0) {
            if (var4.startsWith(class496.field7242.method2902(class35.field396, -20139))) {
                var5 = 1;
                arg0 = arg0.substring(class496.field7242.method2902(class35.field396, -20139).length());
            } else if (var4.startsWith(class41.field450.method2902(class35.field396, -20139))) {
                var5 = 2;
                arg0 = arg0.substring(class41.field450.method2902(class35.field396, -20139).length());
            } else if (var4.startsWith(class439.field6534.method2902(class35.field396, -20139))) {
                var5 = 3;
                arg0 = arg0.substring(class439.field6534.method2902(class35.field396, -20139).length());
            } else if (var4.startsWith(class566.field8137.method2902(class35.field396, -20139))) {
                var5 = 4;
                arg0 = arg0.substring(class566.field8137.method2902(class35.field396, -20139).length());
            } else if (var4.startsWith(class329.field4742.method2902(class35.field396, -20139))) {
                var5 = 5;
                arg0 = arg0.substring(class329.field4742.method2902(class35.field396, -20139).length());
            }
        }
        field8840++;
        class308.method2044(class299.field4414, -7434);
        class468.field6960.method1205((byte) -69, 0);
        int var6 = class468.field6960.field2610;
        class468.field6960.method1205((byte) -69, var3);
        class468.field6960.method1205((byte) -69, var5);
        class251.method1653(arg0, 119, class468.field6960);
        class468.field6960.method1188(class468.field6960.field2610 - var6, -123);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lka;I)V")
    private static final void method3515(class407 arg0, int arg1) {
        field8832 = 0;
        field8837 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6137;
        int[] var4 = arg0.field6129;
        byte var5 = -1;
        field8831 = 0;
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
                        method3507(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3510(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field8841[field8832++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field8841[field8832++] = class23.field243.field8040[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class23.field243.method3265((byte) 117, var8, field8841[--field8832]);
                } else if (var43 == 3) {
                    field8822[field8837++] = arg0.field6135[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field8832 -= 2;
                    if (field8841[field8832 + 1] != field8841[field8832]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field8832 -= 2;
                    if (field8841[field8832 + 1] == field8841[field8832]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field8832 -= 2;
                    if (field8841[field8832] < field8841[field8832 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field8832 -= 2;
                    if (field8841[field8832] > field8841[field8832 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field8831 == 0) {
                        return;
                    }
                    class517 var9 = field8834[--field8831];
                    arg0 = var9.field7527;
                    var3 = arg0.field6137;
                    var4 = arg0.field6129;
                    var2 = var9.field7530;
                    field8817 = var9.field7529;
                    field8830 = var9.field7522;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field8841[field8832++] = class23.field243.method3195(var10, true);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class23.field243.method3264(field8841[--field8832], (byte) -114, var11);
                } else if (var43 == 31) {
                    field8832 -= 2;
                    if (field8841[field8832] <= field8841[field8832 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field8832 -= 2;
                    if (field8841[field8832] >= field8841[field8832 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field8841[field8832++] = field8817[var4[var2]];
                } else if (var43 == 34) {
                    field8817[var4[var2]] = field8841[--field8832];
                } else if (var43 == 35) {
                    field8822[field8837++] = field8830[var4[var2]];
                } else if (var43 == 36) {
                    field8830[var4[var2]] = field8822[--field8837];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field8837 -= var12;
                    String var13 = class133.method819(114, var12, field8837, field8822);
                    field8822[field8837++] = var13;
                } else if (var43 == 38) {
                    field8832--;
                } else if (var43 == 39) {
                    field8837--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class407 var15 = class349.method2226(27920, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6134];
                    String[] var17 = new String[var15.field6130];
                    for (int var18 = 0; var18 < var15.field6142; var18++) {
                        var16[var18] = field8841[field8832 + var18 - var15.field6142];
                    }
                    for (int var19 = 0; var19 < var15.field6139; var19++) {
                        var17[var19] = field8822[field8837 + var19 - var15.field6139];
                    }
                    field8832 -= var15.field6142;
                    field8837 -= var15.field6139;
                    class517 var20 = new class517();
                    var20.field7527 = arg0;
                    var20.field7530 = var2;
                    var20.field7529 = field8817;
                    var20.field7522 = field8830;
                    if (field8831 >= field8834.length) {
                        throw new RuntimeException();
                    }
                    field8834[field8831++] = var20;
                    arg0 = var15;
                    var3 = var15.field6137;
                    var4 = var15.field6129;
                    var2 = -1;
                    field8817 = var16;
                    field8830 = var17;
                } else if (var43 == 42) {
                    field8841[field8832++] = class285.field3942[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class285.field3942[var21] = field8841[--field8832];
                    class194.method1225(-16806, var21);
                    class95.field1125 |= class144.field1760[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field8841[--field8832];
                    if (var24 >= 0 && var24 <= 5000) {
                        field8823[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field8824[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field8841[--field8832];
                    if (var28 < 0 || var28 >= field8823[var27]) {
                        throw new RuntimeException();
                    }
                    field8841[field8832++] = field8824[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field8832 -= 2;
                    int var30 = field8841[field8832];
                    if (var30 < 0 || var30 >= field8823[var29]) {
                        throw new RuntimeException();
                    }
                    field8824[var29][var30] = field8841[field8832 + 1];
                } else if (var43 == 47) {
                    String var31 = class603.field8815[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field8822[field8837++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class603.field8815[var32] = field8822[--field8837];
                    class554.method3201((byte) 57, var32);
                } else if (var43 == 51) {
                    class80 var33 = arg0.field6133[var4[var2]];
                    class388 var34 = (class388) var33.method524((byte) 104, (long) field8841[--field8832]);
                    if (var34 != null) {
                        var2 += var34.field5965;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field6143 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field4676).append(" ");
                for (int var41 = field8831 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field8834[var41].field7527.field4676).append(" ");
                }
                var40.append("op: ").append(var5);
                class630.method3607(7, var42, var40.toString());
            } else {
                class163.method945(true, "Clientscript error in: " + arg0.field6143, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6143).append("\n");
                for (int var38 = field8831 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field8834[var38].field7527.field6143).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class630.method3607(7, var42, var37.toString());
                class348.method2221(30742, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lhk;)V")
    public static final void method3516(class86 arg0) {
        method3506(arg0, 200000);
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    private static final void method3517(int arg0) {
        class593 var1 = class259.method1728(40, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class593[] var3 = class114.field1431[var2];
        if (var3 == null) {
            class593[] var4 = class297.field4403[var2];
            int var5 = var4.length;
            var3 = class114.field1431[var2] = new class593[var5];
            class210.method1327(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class210.method1327(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(IZ)V")
    public static final void method3518(int arg0, boolean arg1) {
    }
}
