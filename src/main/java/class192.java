import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class192 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[Ljava/lang/String;")
    private static String[] field3229 = new String[1000];

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "[Lrk;")
    private static class25[] field3230 = new class25[50];

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "[I")
    private static int[] field3247 = new int[1000];

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    private static int field3235 = 0;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    private static int field3236 = 0;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "[[I")
    private static int[][] field3246 = new int[5][5000];

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    private static int field3237 = 0;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "[I")
    private static int[] field3245 = new int[5];

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Ljava/util/Calendar;")
    private static Calendar field3233 = Calendar.getInstance();

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "[I")
    private static int[] field3254 = new int[3];

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field3256 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "Lkh;")
    public static class13 field3255 = new class13(4);

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    private static int field3257 = 0;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Luq;")
    private static class114 field3234;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "Luq;")
    private static class114 field3252;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "Lcv;")
    private static class402 field3251;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "[I")
    private static int[] field3249;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "[Ljava/lang/String;")
    private static String[] field3242;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1343(String arg0, int arg1) {
        if (class417.field6224 == 0 && !(!class363.field5366 || class382.field5751) || class412.field6177) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class272.field4163.method1635(0, (byte) -22))) {
            var3 = 0;
            arg0 = arg0.substring(class272.field4163.method1635(0, (byte) 122).length());
        } else if (var2.startsWith(class515.field7499.method1635(0, (byte) 120))) {
            var3 = 1;
            arg0 = arg0.substring(class515.field7499.method1635(0, (byte) -58).length());
        } else if (var2.startsWith(class66.field855.method1635(0, (byte) -106))) {
            var3 = 2;
            arg0 = arg0.substring(class66.field855.method1635(0, (byte) 120).length());
        } else if (var2.startsWith(class319.field4809.method1635(0, (byte) 122))) {
            var3 = 3;
            arg0 = arg0.substring(class319.field4809.method1635(0, (byte) 118).length());
        } else if (var2.startsWith(class532.field7802.method1635(0, (byte) 120))) {
            var3 = 4;
            arg0 = arg0.substring(class532.field7802.method1635(0, (byte) 127).length());
        } else if (var2.startsWith(class61.field724.method1635(0, (byte) -118))) {
            var3 = 5;
            arg0 = arg0.substring(class61.field724.method1635(0, (byte) -113).length());
        } else if (var2.startsWith(class293.field4451.method1635(0, (byte) -106))) {
            var3 = 6;
            arg0 = arg0.substring(class293.field4451.method1635(0, (byte) 123).length());
        } else if (var2.startsWith(class23.field278.method1635(0, (byte) -43))) {
            var3 = 7;
            arg0 = arg0.substring(class23.field278.method1635(0, (byte) -81).length());
        } else if (var2.startsWith(class91.field1299.method1635(0, (byte) -62))) {
            var3 = 8;
            arg0 = arg0.substring(class91.field1299.method1635(0, (byte) -23).length());
        } else if (var2.startsWith(class5.field58.method1635(0, (byte) 119))) {
            var3 = 9;
            arg0 = arg0.substring(class5.field58.method1635(0, (byte) 124).length());
        } else if (var2.startsWith(class525.field7678.method1635(0, (byte) 121))) {
            var3 = 10;
            arg0 = arg0.substring(class525.field7678.method1635(0, (byte) 120).length());
        } else if (var2.startsWith(class22.field273.method1635(0, (byte) 10))) {
            var3 = 11;
            arg0 = arg0.substring(class22.field273.method1635(0, (byte) -73).length());
        } else if (class224.field3673 != 0) {
            if (var2.startsWith(class272.field4163.method1635(class224.field3673, (byte) 121))) {
                var3 = 0;
                arg0 = arg0.substring(class272.field4163.method1635(class224.field3673, (byte) -99).length());
            } else if (var2.startsWith(class515.field7499.method1635(class224.field3673, (byte) 124))) {
                var3 = 1;
                arg0 = arg0.substring(class515.field7499.method1635(class224.field3673, (byte) 9).length());
            } else if (var2.startsWith(class66.field855.method1635(class224.field3673, (byte) 122))) {
                var3 = 2;
                arg0 = arg0.substring(class66.field855.method1635(class224.field3673, (byte) 117).length());
            } else if (var2.startsWith(class319.field4809.method1635(class224.field3673, (byte) 126))) {
                var3 = 3;
                arg0 = arg0.substring(class319.field4809.method1635(class224.field3673, (byte) 42).length());
            } else if (var2.startsWith(class532.field7802.method1635(class224.field3673, (byte) -25))) {
                var3 = 4;
                arg0 = arg0.substring(class532.field7802.method1635(class224.field3673, (byte) -105).length());
            } else if (var2.startsWith(class61.field724.method1635(class224.field3673, (byte) 117))) {
                var3 = 5;
                arg0 = arg0.substring(class61.field724.method1635(class224.field3673, (byte) 122).length());
            } else if (var2.startsWith(class293.field4451.method1635(class224.field3673, (byte) 122))) {
                var3 = 6;
                arg0 = arg0.substring(class293.field4451.method1635(class224.field3673, (byte) 127).length());
            } else if (var2.startsWith(class23.field278.method1635(class224.field3673, (byte) -19))) {
                var3 = 7;
                arg0 = arg0.substring(class23.field278.method1635(class224.field3673, (byte) 124).length());
            } else if (var2.startsWith(class91.field1299.method1635(class224.field3673, (byte) 120))) {
                var3 = 8;
                arg0 = arg0.substring(class91.field1299.method1635(class224.field3673, (byte) 120).length());
            } else if (var2.startsWith(class5.field58.method1635(class224.field3673, (byte) -13))) {
                var3 = 9;
                arg0 = arg0.substring(class5.field58.method1635(class224.field3673, (byte) 2).length());
            } else if (var2.startsWith(class525.field7678.method1635(class224.field3673, (byte) 121))) {
                var3 = 10;
                arg0 = arg0.substring(class525.field7678.method1635(class224.field3673, (byte) -77).length());
            } else if (var2.startsWith(class22.field273.method1635(class224.field3673, (byte) -125))) {
                var3 = 11;
                arg0 = arg0.substring(class22.field273.method1635(class224.field3673, (byte) 122).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class327.field4929.method1635(0, (byte) -49))) {
            var5 = 1;
            arg0 = arg0.substring(class327.field4929.method1635(0, (byte) 123).length());
        } else if (var4.startsWith(class515.field7498.method1635(0, (byte) 119))) {
            var5 = 2;
            arg0 = arg0.substring(class515.field7498.method1635(0, (byte) 118).length());
        } else if (var4.startsWith(class89.field1277.method1635(0, (byte) 39))) {
            var5 = 3;
            arg0 = arg0.substring(class89.field1277.method1635(0, (byte) -14).length());
        } else if (var4.startsWith(class66.field854.method1635(0, (byte) 118))) {
            var5 = 4;
            arg0 = arg0.substring(class66.field854.method1635(0, (byte) 119).length());
        } else if (var4.startsWith(class514.field7468.method1635(0, (byte) 117))) {
            var5 = 5;
            arg0 = arg0.substring(class514.field7468.method1635(0, (byte) 127).length());
        } else if (class224.field3673 != 0) {
            if (var4.startsWith(class327.field4929.method1635(class224.field3673, (byte) 123))) {
                var5 = 1;
                arg0 = arg0.substring(class327.field4929.method1635(class224.field3673, (byte) 123).length());
            } else if (var4.startsWith(class515.field7498.method1635(class224.field3673, (byte) 126))) {
                var5 = 2;
                arg0 = arg0.substring(class515.field7498.method1635(class224.field3673, (byte) 119).length());
            } else if (var4.startsWith(class89.field1277.method1635(class224.field3673, (byte) 119))) {
                var5 = 3;
                arg0 = arg0.substring(class89.field1277.method1635(class224.field3673, (byte) -18).length());
            } else if (var4.startsWith(class66.field854.method1635(class224.field3673, (byte) -106))) {
                var5 = 4;
                arg0 = arg0.substring(class66.field854.method1635(class224.field3673, (byte) -51).length());
            } else if (var4.startsWith(class514.field7468.method1635(class224.field3673, (byte) 119))) {
                var5 = 5;
                arg0 = arg0.substring(class514.field7468.method1635(class224.field3673, (byte) 25).length());
            }
        }
        field3238++;
        class74.method640(-29627, class515.field7488);
        class71.field1020.method1545(0, -115);
        int var6 = class71.field1020.field3556;
        if (arg1 == 5021) {
            class71.field1020.method1545(1, -126);
        } else if (arg1 == 5022) {
            class71.field1020.method1545(2, -97);
        } else {
            class71.field1020.method1545(0, -111);
        }
        class71.field1020.method1545(var3, -117);
        class71.field1020.method1545(var5, -38);
        class296.method1926(class71.field1020, (byte) 104, arg0);
        class71.field1020.method1513(class71.field1020.field3556 - var6, (byte) 107);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
    private static final void method1344(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field3235 -= 3;
                int var2 = field3247[field3235];
                int var3 = field3247[field3235 + 1];
                int var4 = field3247[field3235 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class114 var5 = class475.method2864(true, var2);
                if (var5.field1660 == null) {
                    var5.field1660 = new class114[var4 + 1];
                }
                if (var5.field1660.length <= var4) {
                    class114[] var6 = new class114[var4 + 1];
                    for (int var7 = 0; var7 < var5.field1660.length; var7++) {
                        var6[var7] = var5.field1660[var7];
                    }
                    var5.field1660 = var6;
                }
                if (var4 > 0 && var5.field1660[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class114 var8 = new class114();
                var8.field1585 = var3;
                var8.field1700 = var8.field1644 = var5.field1644;
                var8.field1630 = var4;
                var5.field1660[var4] = var8;
                if (arg1) {
                    field3252 = var8;
                } else {
                    field3234 = var8;
                }
                class262.method1747(20556, var5);
                return;
            }
            if (arg0 == 101) {
                class114 var9 = arg1 ? field3252 : field3234;
                if (var9.field1630 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class114 var10 = class475.method2864(true, var9.field1644);
                var10.field1660[var9.field1630] = null;
                class262.method1747(20556, var10);
                return;
            }
            if (arg0 == 102) {
                class114 var11 = class475.method2864(true, field3247[--field3235]);
                var11.field1660 = null;
                class262.method1747(20556, var11);
                return;
            }
            if (arg0 == 200) {
                field3235 -= 2;
                int var12 = field3247[field3235];
                int var13 = field3247[field3235 + 1];
                class114 var14 = class181.method1210(var13, -2, var12);
                if (var14 != null && var13 != -1) {
                    field3247[field3235++] = 1;
                    if (arg1) {
                        field3252 = var14;
                        return;
                    }
                    field3234 = var14;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field3247[--field3235];
                class114 var16 = class475.method2864(true, var15);
                if (var16 != null) {
                    field3247[field3235++] = 1;
                    if (arg1) {
                        field3252 = var16;
                        return;
                    }
                    field3234 = var16;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field3247[--field3235];
                method1350(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field3247[--field3235];
                method1353(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field3235 -= 2;
                int var19 = field3247[field3235];
                int var20 = field3247[field3235 + 1];
                for (int var21 = 0; var21 < class510.field7461.length; var21++) {
                    if (class510.field7461[var21] == var19) {
                        class398.field5947.field2667.method2961(var20, -21379, var21, class436.field6440);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class270.field4130.length; var22++) {
                    if (class270.field4130[var22] == var19) {
                        class398.field5947.field2667.method2961(var20, -21379, var22, class436.field6440);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field3235 -= 2;
                int var23 = field3247[field3235];
                int var24 = field3247[field3235 + 1];
                class398.field5947.field2667.method2954((byte) 43, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field3247[--field3235] != 0;
                class398.field5947.field2667.method2957(var25, (byte) 114);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class114 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class475.method2864(true, field3247[--field3235]);
            } else {
                var26 = arg1 ? field3252 : field3234;
            }
            if (arg0 == 1000) {
                field3235 -= 4;
                var26.field1593 = field3247[field3235];
                var26.field1611 = field3247[field3235 + 1];
                int var27 = field3247[field3235 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field3247[field3235 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field1625 = (byte) var27;
                var26.field1704 = (byte) var28;
                class262.method1747(20556, var26);
                class133.method974(var26, 126);
                if (var26.field1630 == -1) {
                    class372.method2332(var26.field1644, 102);
                }
                return;
            }
            if (arg0 == 1001) {
                field3235 -= 4;
                var26.field1641 = field3247[field3235];
                var26.field1643 = field3247[field3235 + 1];
                var26.field1631 = 0;
                var26.field1581 = 0;
                int var29 = field3247[field3235 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field3247[field3235 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field1675 = (byte) var29;
                var26.field1740 = (byte) var30;
                class262.method1747(20556, var26);
                class133.method974(var26, 125);
                if (var26.field1585 == 0) {
                    class216.method1499((byte) -71, false, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field3247[--field3235] == 1;
                if (var26.field1610 != var31) {
                    var26.field1610 = var31;
                    class262.method1747(20556, var26);
                }
                if (var26.field1630 == -1) {
                    class286.method1846(504, var26.field1644);
                }
                return;
            }
            if (arg0 == 1004) {
                field3235 -= 2;
                var26.field1597 = field3247[field3235];
                var26.field1639 = field3247[field3235 + 1];
                class262.method1747(20556, var26);
                class133.method974(var26, 127);
                if (var26.field1585 == 0) {
                    class216.method1499((byte) 82, false, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field1654 = field3247[--field3235] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class114 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class475.method2864(true, field3247[--field3235]);
            } else {
                var32 = arg1 ? field3252 : field3234;
            }
            if (arg0 == 1100) {
                field3235 -= 2;
                var32.field1628 = field3247[field3235];
                if (var32.field1628 > var32.field1594 - var32.field1642) {
                    var32.field1628 = var32.field1594 - var32.field1642;
                }
                if (var32.field1628 < 0) {
                    var32.field1628 = 0;
                }
                var32.field1735 = field3247[field3235 + 1];
                if (var32.field1735 > var32.field1709 - var32.field1627) {
                    var32.field1735 = var32.field1709 - var32.field1627;
                }
                if (var32.field1735 < 0) {
                    var32.field1735 = 0;
                }
                class262.method1747(20556, var32);
                if (var32.field1630 == -1) {
                    class268.method1777(2080, var32.field1644);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field1715 = field3247[--field3235];
                class262.method1747(20556, var32);
                if (var32.field1630 == -1) {
                    class157.method1084(var32.field1644, 6);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field1584 = field3247[--field3235] == 1;
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field1614 = field3247[--field3235];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field1579 = field3247[--field3235];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field3247[--field3235];
                if (var32.field1624 != var33) {
                    var32.field1624 = var33;
                    class262.method1747(20556, var32);
                }
                if (var32.field1630 == -1) {
                    class153.method1050((byte) 62, var32.field1644);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field1728 = field3247[--field3235];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field1688 = field3247[--field3235] == 1;
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field1681 = 1;
                var32.field1732 = field3247[--field3235];
                class262.method1747(20556, var32);
                if (var32.field1630 == -1) {
                    class71.method628(-22474, var32.field1644);
                }
                return;
            }
            if (arg0 == 1109) {
                field3235 -= 6;
                var32.field1686 = field3247[field3235];
                var32.field1666 = field3247[field3235 + 1];
                var32.field1702 = field3247[field3235 + 2];
                var32.field1674 = field3247[field3235 + 3];
                var32.field1657 = field3247[field3235 + 4];
                var32.field1673 = field3247[field3235 + 5];
                class262.method1747(20556, var32);
                if (var32.field1630 == -1) {
                    class156.method1068(8, var32.field1644);
                    class361.method2267((byte) 120, var32.field1644);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field3247[--field3235];
                if (var32.field1661 != var34) {
                    var32.field1661 = var34;
                    var32.field1699 = 0;
                    var32.field1693 = 1;
                    var32.field1695 = 0;
                    class262.method1747(20556, var32);
                }
                if (var32.field1630 == -1) {
                    class388.method2426(var32.field1644, 5);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field1640 = field3247[--field3235] == 1;
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field3229[--field3237];
                if (!var35.equals(var32.field1652)) {
                    var32.field1652 = var35;
                    class262.method1747(20556, var32);
                }
                if (var32.field1630 == -1) {
                    class215.method1485(var32.field1644, (byte) 99);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field1730 = field3247[--field3235];
                class262.method1747(20556, var32);
                if (var32.field1630 == -1) {
                    class488.method2909((byte) 5, var32.field1644);
                }
                return;
            }
            if (arg0 == 1114) {
                field3235 -= 3;
                var32.field1698 = field3247[field3235];
                var32.field1706 = field3247[field3235 + 1];
                var32.field1601 = field3247[field3235 + 2];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field1632 = field3247[--field3235] == 1;
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field1697 = field3247[--field3235];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field1664 = field3247[--field3235];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field1684 = field3247[--field3235] == 1;
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field1736 = field3247[--field3235] == 1;
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1120) {
                field3235 -= 2;
                var32.field1594 = field3247[field3235];
                var32.field1709 = field3247[field3235 + 1];
                class262.method1747(20556, var32);
                if (var32.field1585 == 0) {
                    class216.method1499((byte) -78, false, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field3235 -= 2;
                var32.field1733 = (short) field3247[field3235];
                var32.field1626 = (short) field3247[field3235 + 1];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field1622 = field3247[--field3235] == 1;
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field1673 = field3247[--field3235];
                class262.method1747(20556, var32);
                if (var32.field1630 == -1) {
                    class156.method1068(8, var32.field1644);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field3247[--field3235];
                var32.field1578 = var36 == 1;
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1125) {
                field3235 -= 2;
                var32.field1649 = field3247[field3235];
                var32.field1589 = field3247[field3235 + 1];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field1608 = field3247[--field3235];
                class262.method1747(20556, var32);
                return;
            }
            if (arg0 == 1127) {
                field3235 -= 2;
                int var37 = field3247[field3235];
                int var38 = field3247[field3235 + 1];
                class260 var39 = class474.field6839.method3057(var37, (byte) 120);
                if (var39.field3981 != var38) {
                    var32.method867(-121, var37, var38);
                    return;
                }
                var32.method854(-72, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field3247[--field3235];
                String var41 = field3229[--field3237];
                class260 var42 = class474.field6839.method3057(var40, (byte) 114);
                if (!var42.field3990.equals(var41)) {
                    var32.method861(var41, var40, -128);
                    return;
                }
                var32.method854(-97, var40);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class114 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class475.method2864(true, field3247[--field3235]);
            } else {
                var43 = arg1 ? field3252 : field3234;
            }
            class262.method1747(20556, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field3235 -= 2;
                int var44 = field3247[field3235];
                int var45 = field3247[field3235 + 1];
                if (var43.field1630 == -1) {
                    class167.method1122(var43.field1644, 9);
                    class156.method1068(8, var43.field1644);
                    class361.method2267((byte) -116, var43.field1644);
                }
                if (var44 == -1) {
                    var43.field1681 = 1;
                    var43.field1732 = -1;
                    var43.field1670 = -1;
                    return;
                }
                var43.field1670 = var44;
                var43.field1621 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field1723 = true;
                } else {
                    var43.field1723 = false;
                }
                class532 var46 = class390.field5847.method467((byte) -101, var44);
                var43.field1702 = var46.field7796;
                var43.field1674 = var46.field7827;
                var43.field1657 = var46.field7780;
                var43.field1686 = var46.field7794;
                var43.field1666 = var46.field7788;
                var43.field1673 = var46.field7787;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field1613 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field1613 = 1;
                } else {
                    var43.field1613 = 2;
                }
                if (var43.field1631 > 0) {
                    var43.field1673 = var43.field1673 * 32 / var43.field1631;
                    return;
                }
                if (var43.field1641 > 0) {
                    var43.field1673 = var43.field1673 * 32 / var43.field1641;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field1681 = 2;
                var43.field1732 = field3247[--field3235];
                if (var43.field1630 == -1) {
                    class71.method628(-22474, var43.field1644);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field1681 = 3;
                var43.field1732 = -1;
                if (var43.field1630 == -1) {
                    class71.method628(-22474, var43.field1644);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field1681 = 6;
                var43.field1732 = field3247[--field3235];
                if (var43.field1630 == -1) {
                    class71.method628(-22474, var43.field1644);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field1681 = 5;
                var43.field1732 = field3247[--field3235];
                if (var43.field1630 == -1) {
                    class71.method628(-22474, var43.field1644);
                }
                return;
            }
            if (arg0 == 1206) {
                field3235 -= 4;
                var43.field1667 = field3247[field3235];
                var43.field1650 = field3247[field3235 + 1];
                var43.field1720 = field3247[field3235 + 2];
                var43.field1659 = field3247[field3235 + 3];
                class262.method1747(20556, var43);
                return;
            }
            if (arg0 == 1207) {
                field3235 -= 2;
                var43.field1727 = field3247[field3235];
                var43.field1638 = field3247[field3235 + 1];
                class262.method1747(20556, var43);
                return;
            }
            if (arg0 == 1210) {
                field3235 -= 4;
                var43.field1732 = field3247[field3235];
                var43.field1741 = field3247[field3235 + 1];
                if (field3247[field3235 + 2] == 1) {
                    var43.field1681 = 9;
                } else {
                    var43.field1681 = 8;
                }
                if (field3247[field3235 + 3] == 1) {
                    var43.field1723 = true;
                } else {
                    var43.field1723 = false;
                }
                if (var43.field1630 == -1) {
                    class71.method628(-22474, var43.field1644);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field1681 = 5;
                var43.field1732 = class261.field4008;
                var43.field1741 = 0;
                if (var43.field1630 == -1) {
                    class71.method628(-22474, var43.field1644);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class114 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class475.method2864(true, field3247[--field3235]);
                } else {
                    var58 = arg1 ? field3252 : field3234;
                }
                String var59 = field3229[--field3237];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field3247[--field3235];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field3247[--field3235];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field3229[--field3237];
                    } else {
                        var62[var63] = Integer.valueOf(field3247[--field3235]);
                    }
                }
                int var64 = field3247[--field3235];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field1722 = var62;
                } else if (arg0 == 1401) {
                    var58.field1609 = var62;
                } else if (arg0 == 1402) {
                    var58.field1645 = var62;
                } else if (arg0 == 1403) {
                    var58.field1576 = var62;
                } else if (arg0 == 1404) {
                    var58.field1729 = var62;
                } else if (arg0 == 1405) {
                    var58.field1711 = var62;
                } else if (arg0 == 1406) {
                    var58.field1683 = var62;
                } else if (arg0 == 1407) {
                    var58.field1694 = var62;
                    var58.field1653 = var60;
                } else if (arg0 == 1408) {
                    var58.field1629 = var62;
                } else if (arg0 == 1409) {
                    var58.field1678 = var62;
                } else if (arg0 == 1410) {
                    var58.field1724 = var62;
                } else if (arg0 == 1411) {
                    var58.field1634 = var62;
                } else if (arg0 == 1412) {
                    var58.field1679 = var62;
                } else if (arg0 == 1414) {
                    var58.field1596 = var62;
                    var58.field1712 = var60;
                } else if (arg0 == 1415) {
                    var58.field1687 = var62;
                    var58.field1606 = var60;
                } else if (arg0 == 1416) {
                    var58.field1619 = var62;
                } else if (arg0 == 1417) {
                    var58.field1669 = var62;
                } else if (arg0 == 1418) {
                    var58.field1713 = var62;
                } else if (arg0 == 1419) {
                    var58.field1618 = var62;
                } else if (arg0 == 1420) {
                    var58.field1725 = var62;
                } else if (arg0 == 1421) {
                    var58.field1668 = var62;
                } else if (arg0 == 1422) {
                    var58.field1676 = var62;
                } else if (arg0 == 1423) {
                    var58.field1616 = var62;
                } else if (arg0 == 1424) {
                    var58.field1663 = var62;
                } else if (arg0 == 1425) {
                    var58.field1705 = var62;
                } else if (arg0 == 1426) {
                    var58.field1742 = var62;
                } else if (arg0 == 1427) {
                    var58.field1580 = var62;
                } else if (arg0 == 1428) {
                    var58.field1595 = var62;
                    var58.field1737 = var60;
                } else if (arg0 == 1429) {
                    var58.field1665 = var62;
                    var58.field1731 = var60;
                } else if (arg0 == 1430) {
                    var58.field1620 = var62;
                }
                var58.field1603 = true;
                return;
            }
            if (arg0 < 1600) {
                class114 var65 = arg1 ? field3252 : field3234;
                if (arg0 == 1500) {
                    field3247[field3235++] = var65.field1646;
                    return;
                }
                if (arg0 == 1501) {
                    field3247[field3235++] = var65.field1701;
                    return;
                }
                if (arg0 == 1502) {
                    field3247[field3235++] = var65.field1642;
                    return;
                }
                if (arg0 == 1503) {
                    field3247[field3235++] = var65.field1627;
                    return;
                }
                if (arg0 == 1504) {
                    field3247[field3235++] = var65.field1610 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field3247[field3235++] = var65.field1700;
                    return;
                }
                if (arg0 == 1506) {
                    class114 var66 = class277.method1822((byte) 117, var65);
                    field3247[field3235++] = var66 == null ? -1 : var66.field1644;
                    return;
                }
            } else if (arg0 < 1700) {
                class114 var67 = arg1 ? field3252 : field3234;
                if (arg0 == 1600) {
                    field3247[field3235++] = var67.field1628;
                    return;
                }
                if (arg0 == 1601) {
                    field3247[field3235++] = var67.field1735;
                    return;
                }
                if (arg0 == 1602) {
                    field3229[field3237++] = var67.field1652;
                    return;
                }
                if (arg0 == 1603) {
                    field3247[field3235++] = var67.field1594;
                    return;
                }
                if (arg0 == 1604) {
                    field3247[field3235++] = var67.field1709;
                    return;
                }
                if (arg0 == 1605) {
                    field3247[field3235++] = var67.field1673;
                    return;
                }
                if (arg0 == 1606) {
                    field3247[field3235++] = var67.field1702;
                    return;
                }
                if (arg0 == 1607) {
                    field3247[field3235++] = var67.field1657;
                    return;
                }
                if (arg0 == 1608) {
                    field3247[field3235++] = var67.field1674;
                    return;
                }
                if (arg0 == 1609) {
                    field3247[field3235++] = var67.field1614;
                    return;
                }
                if (arg0 == 1610) {
                    field3247[field3235++] = var67.field1686;
                    return;
                }
                if (arg0 == 1611) {
                    field3247[field3235++] = var67.field1666;
                    return;
                }
                if (arg0 == 1612) {
                    field3247[field3235++] = var67.field1624;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field3247[--field3235];
                    class260 var69 = class474.field6839.method3057(var68, (byte) 109);
                    if (var69.method1738(-72)) {
                        field3229[field3237++] = var67.method856(var69.field3990, (byte) 111, var68);
                    } else {
                        field3247[field3235++] = var67.method869(var69.field3981, var68, (byte) 124);
                    }
                }
            } else if (arg0 < 1800) {
                class114 var70 = arg1 ? field3252 : field3234;
                if (arg0 == 1700) {
                    field3247[field3235++] = var70.field1670;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field1670 != -1) {
                        field3247[field3235++] = var70.field1621;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field3247[field3235++] = var70.field1630;
                    return;
                }
            } else if (arg0 < 1900) {
                class114 var71 = arg1 ? field3252 : field3234;
                if (arg0 == 1800) {
                    field3247[field3235++] = client.method1387(var71).method2410(-16758);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field3247[--field3235];
                    int var334 = var72 - 1;
                    if (var71.field1647 != null && var334 < var71.field1647.length && var71.field1647[var334] != null) {
                        field3229[field3237++] = var71.field1647[var334];
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field1600 == null) {
                        field3229[field3237++] = "";
                        return;
                    }
                    field3229[field3237++] = var71.field1600;
                    return;
                }
            } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
                class114 var332;
                if (arg0 >= 2000) {
                    var332 = class475.method2864(true, field3247[--field3235]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field3252 : field3234;
                }
                if (field3257 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field1580 == null) {
                        return;
                    }
                    class405 var333 = new class405();
                    var333.field6004 = var332;
                    var333.field6008 = var332.field1580;
                    var333.field6002 = field3257 + 1;
                    class186.field2821.method994(var333, -3610);
                    return;
                }
            } else if (arg0 < 2600) {
                class114 var73 = class475.method2864(true, field3247[--field3235]);
                if (arg0 == 2500) {
                    field3247[field3235++] = var73.field1646;
                    return;
                }
                if (arg0 == 2501) {
                    field3247[field3235++] = var73.field1701;
                    return;
                }
                if (arg0 == 2502) {
                    field3247[field3235++] = var73.field1642;
                    return;
                }
                if (arg0 == 2503) {
                    field3247[field3235++] = var73.field1627;
                    return;
                }
                if (arg0 == 2504) {
                    field3247[field3235++] = var73.field1610 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field3247[field3235++] = var73.field1700;
                    return;
                }
                if (arg0 == 1506) {
                    class114 var74 = class277.method1822((byte) 108, var73);
                    field3247[field3235++] = var74 == null ? -1 : var74.field1644;
                    return;
                }
            } else if (arg0 < 2700) {
                class114 var75 = class475.method2864(true, field3247[--field3235]);
                if (arg0 == 2600) {
                    field3247[field3235++] = var75.field1628;
                    return;
                }
                if (arg0 == 2601) {
                    field3247[field3235++] = var75.field1735;
                    return;
                }
                if (arg0 == 2602) {
                    field3229[field3237++] = var75.field1652;
                    return;
                }
                if (arg0 == 2603) {
                    field3247[field3235++] = var75.field1594;
                    return;
                }
                if (arg0 == 2604) {
                    field3247[field3235++] = var75.field1709;
                    return;
                }
                if (arg0 == 2605) {
                    field3247[field3235++] = var75.field1673;
                    return;
                }
                if (arg0 == 2606) {
                    field3247[field3235++] = var75.field1702;
                    return;
                }
                if (arg0 == 2607) {
                    field3247[field3235++] = var75.field1657;
                    return;
                }
                if (arg0 == 2608) {
                    field3247[field3235++] = var75.field1674;
                    return;
                }
                if (arg0 == 2609) {
                    field3247[field3235++] = var75.field1614;
                    return;
                }
                if (arg0 == 2610) {
                    field3247[field3235++] = var75.field1686;
                    return;
                }
                if (arg0 == 2611) {
                    field3247[field3235++] = var75.field1666;
                    return;
                }
                if (arg0 == 2612) {
                    field3247[field3235++] = var75.field1624;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class114 var76 = class475.method2864(true, field3247[--field3235]);
                    field3247[field3235++] = var76.field1670;
                    return;
                }
                if (arg0 == 2701) {
                    class114 var77 = class475.method2864(true, field3247[--field3235]);
                    if (var77.field1670 != -1) {
                        field3247[field3235++] = var77.field1621;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field3247[--field3235];
                    class293 var79 = (class293) class70.field993.method2585((byte) 114, (long) var78);
                    if (var79 != null) {
                        field3247[field3235++] = 1;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class114 var80 = class475.method2864(true, field3247[--field3235]);
                    if (var80.field1660 == null) {
                        field3247[field3235++] = 0;
                        return;
                    }
                    int var81 = var80.field1660.length;
                    for (int var82 = 0; var82 < var80.field1660.length; var82++) {
                        if (var80.field1660[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field3247[field3235++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field3235 -= 2;
                    int var83 = field3247[field3235];
                    int var84 = field3247[field3235 + 1];
                    class293 var85 = (class293) class70.field993.method2585((byte) 114, (long) var83);
                    if (var85 != null && var85.field4454 == var84) {
                        field3247[field3235++] = 1;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class114 var86 = class475.method2864(true, field3247[--field3235]);
                if (arg0 == 2800) {
                    field3247[field3235++] = client.method1387(var86).method2410(-16758);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field3247[--field3235];
                    int var335 = var87 - 1;
                    if (var86.field1647 != null && var335 < var86.field1647.length && var86.field1647[var335] != null) {
                        field3229[field3237++] = var86.field1647[var335];
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field1600 == null) {
                        field3229[field3237++] = "";
                        return;
                    }
                    field3229[field3237++] = var86.field1600;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field3229[--field3237];
                    class358.method2249(0, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field3235 -= 2;
                    class403.method2521(-69, class398.field5947, field3247[field3235 + 1], field3247[field3235]);
                    return;
                }
                if (arg0 == 3103) {
                    class207.method1436(true, (byte) -112);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field3229[--field3237];
                    int var90 = 0;
                    if (class4.method13(-19, var89)) {
                        var90 = class64.method555((byte) 124, var89);
                    }
                    field3253++;
                    class74.method640(-29627, class71.field1027);
                    class71.field1020.method1566(true, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field3229[--field3237];
                    field3232++;
                    class74.method640(-29627, class211.field3443);
                    class71.field1020.method1545(var91.length() + 1, -99);
                    class71.field1020.method1534(var91, false);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field3229[--field3237];
                    field3231++;
                    class74.method640(-29627, class358.field5309);
                    class71.field1020.method1545(var92.length() + 1, -47);
                    class71.field1020.method1534(var92, false);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field3247[--field3235];
                    String var94 = field3229[--field3237];
                    class1.method1(0, var94, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field3235 -= 3;
                    int var95 = field3247[field3235];
                    int var96 = field3247[field3235 + 1];
                    int var97 = field3247[field3235 + 2];
                    class114 var98 = class475.method2864(true, var97);
                    class194.method1360(var96, var98, var95, (byte) -111);
                    return;
                }
                if (arg0 == 3109) {
                    field3235 -= 2;
                    int var99 = field3247[field3235];
                    int var100 = field3247[field3235 + 1];
                    class114 var101 = arg1 ? field3252 : field3234;
                    class194.method1360(var100, var101, var99, (byte) -87);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field3247[--field3235];
                    field3241++;
                    class74.method640(-29627, class102.field1473);
                    class71.field1020.method1542(var102, -2756);
                    return;
                }
                if (arg0 == 3111) {
                    field3235 -= 2;
                    int var103 = field3247[field3235];
                    int var104 = field3247[field3235 + 1];
                    class293 var105 = (class293) class70.field993.method2585((byte) 114, (long) var103);
                    if (var105 != null) {
                        class218.method1568(true, -126, var105.field4454 != var104, var105);
                    }
                    class508.method3030(var104, 3, true, -123, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field3235--;
                    int var106 = field3247[field3235];
                    class293 var107 = (class293) class70.field993.method2585((byte) 114, (long) var106);
                    if (var107 != null && var107.field4453 == 3) {
                        class218.method1568(true, -127, true, var107);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class95.method761((byte) -71, field3229[--field3237]);
                    return;
                }
                if (arg0 == 3114) {
                    field3235 -= 2;
                    int var108 = field3247[field3235];
                    int var109 = field3247[field3235 + 1];
                    String var110 = field3229[--field3237];
                    class475.method2854(var110, var109, "", -127, "", var108);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field3235 -= 3;
                    class103.method816(field3247[field3235 + 2], field3247[field3235 + 1], field3247[field3235], 255, (byte) -46);
                    return;
                }
                if (arg0 == 3201) {
                    class388.method2422(255, -127, 50, field3247[--field3235]);
                    return;
                }
                if (arg0 == 3202) {
                    field3235 -= 2;
                    class457.method2773(255, field3247[field3235 + 1], field3247[field3235], 0);
                    return;
                }
                if (arg0 == 3203) {
                    field3235 -= 4;
                    class103.method816(field3247[field3235 + 2], field3247[field3235 + 1], field3247[field3235], field3247[field3235 + 3], (byte) -46);
                    return;
                }
                if (arg0 == 3204) {
                    field3235 -= 3;
                    class388.method2422(field3247[field3235 + 1], -126, field3247[field3235 + 2], field3247[field3235]);
                    return;
                }
                if (arg0 == 3205) {
                    field3235 -= 3;
                    class457.method2773(field3247[field3235 + 2], field3247[field3235 + 1], field3247[field3235], 0);
                    return;
                }
                if (arg0 == 3206) {
                    field3235 -= 4;
                    class351.method2182(126, field3247[field3235 + 1], field3247[field3235], field3247[field3235 + 2], field3247[field3235 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field3247[field3235++] = class475.field6854;
                    return;
                }
                if (arg0 == 3301) {
                    field3235 -= 2;
                    int var111 = field3247[field3235];
                    int var112 = field3247[field3235 + 1];
                    field3247[field3235++] = class55.method513(var111, false, var112, -1);
                    return;
                }
                if (arg0 == 3302) {
                    field3235 -= 2;
                    int var113 = field3247[field3235];
                    int var114 = field3247[field3235 + 1];
                    field3247[field3235++] = class124.method921(-11059, var114, var113, false);
                    return;
                }
                if (arg0 == 3303) {
                    field3235 -= 2;
                    int var115 = field3247[field3235];
                    int var116 = field3247[field3235 + 1];
                    field3247[field3235++] = class506.method3017(false, var116, -11948, var115);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field3247[--field3235];
                    field3247[field3235++] = class135.field2067.method900(var117, 1).field5821;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field3247[--field3235];
                    field3247[field3235++] = class134.field2047[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field3247[--field3235];
                    field3247[field3235++] = class422.field6293[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field3247[--field3235];
                    field3247[field3235++] = class523.field7653[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class398.field5947.field5826;
                    int var122 = (class398.field5947.field5837 >> 7) + class390.field5842;
                    int var123 = (class398.field5947.field5833 >> 7) + class176.field2613;
                    field3247[field3235++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field3247[--field3235];
                    field3247[field3235++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field3247[--field3235];
                    field3247[field3235++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field3247[--field3235];
                    field3247[field3235++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field3247[field3235++] = class531.field7753 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field3235 -= 2;
                    int var127 = field3247[field3235];
                    int var128 = field3247[field3235 + 1];
                    field3247[field3235++] = class55.method513(var127, true, var128, -1);
                    return;
                }
                if (arg0 == 3314) {
                    field3235 -= 2;
                    int var129 = field3247[field3235];
                    int var130 = field3247[field3235 + 1];
                    field3247[field3235++] = class124.method921(-11059, var130, var129, true);
                    return;
                }
                if (arg0 == 3315) {
                    field3235 -= 2;
                    int var131 = field3247[field3235];
                    int var132 = field3247[field3235 + 1];
                    field3247[field3235++] = class506.method3017(true, var132, -11948, var131);
                    return;
                }
                if (arg0 == 3316) {
                    if (class417.field6224 >= 2) {
                        field3247[field3235++] = class417.field6224;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field3247[field3235++] = class350.field5176;
                    return;
                }
                if (arg0 == 3318) {
                    field3247[field3235++] = class283.field4310.field6307;
                    return;
                }
                if (arg0 == 3321) {
                    field3247[field3235++] = class403.field5984;
                    return;
                }
                if (arg0 == 3322) {
                    field3247[field3235++] = class220.field3611;
                    return;
                }
                if (arg0 == 3323) {
                    if (class277.field4220 >= 5 && class277.field4220 <= 9) {
                        field3247[field3235++] = 1;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class277.field4220 >= 5 && class277.field4220 <= 9) {
                        field3247[field3235++] = class277.field4220;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field3247[field3235++] = class88.field1252 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field3247[field3235++] = class398.field5947.field2636;
                    return;
                }
                if (arg0 == 3327) {
                    field3247[field3235++] = class398.field5947.field2667.field7166 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field3247[field3235++] = class412.field6177 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field3247[--field3235];
                    field3247[field3235++] = class18.method150(false, var133, -111);
                    return;
                }
                if (arg0 == 3331) {
                    field3235 -= 2;
                    int var134 = field3247[field3235];
                    int var135 = field3247[field3235 + 1];
                    field3247[field3235++] = class48.method483(var134, false, (byte) -41, false, var135);
                    return;
                }
                if (arg0 == 3332) {
                    field3235 -= 2;
                    int var136 = field3247[field3235];
                    int var137 = field3247[field3235 + 1];
                    field3247[field3235++] = class48.method483(var136, true, (byte) -41, false, var137);
                    return;
                }
                if (arg0 == 3333) {
                    field3247[field3235++] = class36.field436;
                    return;
                }
                if (arg0 == 3335) {
                    field3247[field3235++] = class224.field3673;
                    return;
                }
                if (arg0 == 3336) {
                    field3235 -= 4;
                    int var138 = field3247[field3235];
                    int var139 = field3247[field3235 + 1];
                    int var140 = field3247[field3235 + 2];
                    int var141 = field3247[field3235 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field3247[field3235++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field3247[field3235++] = class341.field5067;
                    return;
                }
                if (arg0 == 3338) {
                    field3247[field3235++] = class96.method783((byte) 99);
                    return;
                }
                if (arg0 == 3339) {
                    field3247[field3235++] = class158.field2388 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field3247[field3235++] = class190.field3215 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field3235 -= 2;
                    int var145 = field3247[field3235];
                    int var146 = field3247[field3235 + 1];
                    class98 var147 = class267.field4087.method2013(24, var145);
                    field3229[field3237++] = var147.method800(70, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field3235 -= 4;
                    int var148 = field3247[field3235];
                    int var149 = field3247[field3235 + 1];
                    int var150 = field3247[field3235 + 2];
                    int var151 = field3247[field3235 + 3];
                    class98 var152 = class267.field4087.method2013(24, var150);
                    if (var152.field1400 == var148 && var152.field1402 == var149) {
                        if (var149 == 115) {
                            field3229[field3237++] = var152.method800(67, var151);
                            return;
                        }
                        field3247[field3235++] = var152.method795(var151, -77);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field3235 -= 3;
                    int var153 = field3247[field3235];
                    int var154 = field3247[field3235 + 1];
                    int var155 = field3247[field3235 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class98 var156 = class267.field4087.method2013(24, var154);
                    if (var156.field1402 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field3247[field3235++] = var156.method796(var155, (byte) -14) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field3247[--field3235];
                    String var158 = field3229[--field3237];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class98 var159 = class267.field4087.method2013(24, var157);
                    if (var159.field1402 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field3247[field3235++] = var159.method799((byte) 89, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field3247[--field3235];
                    class98 var161 = class267.field4087.method2013(24, var160);
                    field3247[field3235++] = var161.field1404.method2593(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class32.field374 == 0) {
                        field3247[field3235++] = -2;
                        return;
                    }
                    if (class32.field374 == 1) {
                        field3247[field3235++] = -1;
                        return;
                    }
                    field3247[field3235++] = class64.field785;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field3247[--field3235];
                    if (class32.field374 == 2 && var162 < class64.field785) {
                        field3229[field3237++] = class221.field3622[var162];
                        if (class501.field7207[var162] != null) {
                            field3229[field3237++] = class501.field7207[var162];
                            return;
                        }
                        field3229[field3237++] = "";
                        return;
                    }
                    field3229[field3237++] = "";
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field3247[--field3235];
                    if (class32.field374 == 2 && var163 < class64.field785) {
                        field3247[field3235++] = class240.field3837[var163];
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field3247[--field3235];
                    if (class32.field374 == 2 && var164 < class64.field785) {
                        field3247[field3235++] = class46.field598[var164];
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field3229[--field3237];
                    int var166 = field3247[--field3235];
                    class114.method864(-87, var165, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field3229[--field3237];
                    class385.method2409(var167, -92);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field3229[--field3237];
                    class433.method2686((byte) -103, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field3229[--field3237];
                    class267.method1775(var169, false, 28619);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field3229[--field3237];
                    class531.method3145(var170, 96);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field3229[--field3237];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field3247[field3235++] = class208.method1445(124, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field3247[--field3235];
                    if (class32.field374 == 2 && var172 < class64.field785) {
                        field3229[field3237++] = class465.field6734[var172];
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class25.field315 != null) {
                        field3229[field3237++] = class501.method2981(class25.field315, true);
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class25.field315 != null) {
                        field3247[field3235++] = class505.field7375;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field3247[--field3235];
                    if (class25.field315 != null && var173 < class505.field7375) {
                        field3229[field3237++] = class285.field4333[var173].field7754;
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field3247[--field3235];
                    if (class25.field315 != null && var174 < class505.field7375) {
                        field3247[field3235++] = class285.field4333[var174].field7756;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field3247[--field3235];
                    if (class25.field315 != null && var175 < class505.field7375) {
                        field3247[field3235++] = class285.field4333[var175].field7750;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field3247[field3235++] = class338.field5041;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field3229[--field3237];
                    class228.method1616(var176, (byte) -78);
                    return;
                }
                if (arg0 == 3618) {
                    field3247[field3235++] = class179.field2700;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field3229[--field3237];
                    class98.method798(var177, 115);
                    return;
                }
                if (arg0 == 3620) {
                    class168.method1129(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class32.field374 == 0) {
                        field3247[field3235++] = -1;
                        return;
                    }
                    field3247[field3235++] = class327.field4923;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field3247[--field3235];
                    if (class32.field374 != 0 && var178 < class327.field4923) {
                        field3229[field3237++] = class257.field3933[var178];
                        if (class210.field3435[var178] != null) {
                            field3229[field3237++] = class210.field3435[var178];
                            return;
                        }
                        field3229[field3237++] = "";
                        return;
                    }
                    field3229[field3237++] = "";
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field3229[--field3237];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field3247[field3235++] = class59.method525(var179, -32071) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field3247[--field3235];
                    if (class285.field4333 != null && var180 < class505.field7375 && class285.field4333[var180].field7755.equalsIgnoreCase(class398.field5947.field2660)) {
                        field3247[field3235++] = 1;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class200.field3327 != null) {
                        field3229[field3237++] = class200.field3327;
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field3247[--field3235];
                    if (class25.field315 != null && var181 < class505.field7375) {
                        field3229[field3237++] = class285.field4333[var181].field7758;
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field3247[--field3235];
                    if (class32.field374 == 2 && var182 >= 0 && var182 < class64.field785) {
                        field3247[field3235++] = class135.field2055[var182] ? 1 : 0;
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field3229[--field3237];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field3247[field3235++] = class233.method1633(2760, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field3247[field3235++] = class529.field7733;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field3229[--field3237];
                    class267.method1775(var184, true, 28619);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field3247[--field3235];
                    field3247[field3235++] = class426.field6348[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field3247[--field3235];
                    if (class25.field315 != null && var186 < class505.field7375) {
                        field3229[field3237++] = class285.field4333[var186].field7755;
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field3247[--field3235];
                    if (class32.field374 != 0 && var187 < class327.field4923) {
                        field3229[field3237++] = class93.field1318[var187];
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field3247[--field3235];
                    field3247[field3235++] = class329.field4948[var188].method2870((byte) 77);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field3247[--field3235];
                    field3247[field3235++] = class329.field4948[var189].field6869;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field3247[--field3235];
                    field3247[field3235++] = class329.field4948[var190].field6874;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field3247[--field3235];
                    field3247[field3235++] = class329.field4948[var191].field6876;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field3247[--field3235];
                    field3247[field3235++] = class329.field4948[var192].field6871;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field3247[--field3235];
                    field3247[field3235++] = class329.field4948[var193].field6875;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field3247[--field3235];
                    int var195 = class329.field4948[var194].method2867(false);
                    field3247[field3235++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field3247[--field3235];
                    int var197 = class329.field4948[var196].method2867(false);
                    field3247[field3235++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field3247[--field3235];
                    int var199 = class329.field4948[var198].method2867(false);
                    field3247[field3235++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field3247[--field3235];
                    int var201 = class329.field4948[var200].method2867(false);
                    field3247[field3235++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field3235 -= 2;
                    int var202 = field3247[field3235];
                    int var203 = field3247[field3235 + 1];
                    field3247[field3235++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field3235 -= 2;
                    int var204 = field3247[field3235];
                    int var205 = field3247[field3235 + 1];
                    field3247[field3235++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field3235 -= 2;
                    int var206 = field3247[field3235];
                    int var207 = field3247[field3235 + 1];
                    field3247[field3235++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field3235 -= 2;
                    int var208 = field3247[field3235];
                    int var209 = field3247[field3235 + 1];
                    field3247[field3235++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field3247[--field3235];
                    field3247[field3235++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field3247[--field3235];
                    field3247[field3235++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field3235 -= 5;
                    int var212 = field3247[field3235];
                    int var213 = field3247[field3235 + 1];
                    int var214 = field3247[field3235 + 2];
                    int var215 = field3247[field3235 + 3];
                    int var216 = field3247[field3235 + 4];
                    field3247[field3235++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field3235 -= 2;
                    long var217 = (long) field3247[field3235];
                    long var219 = (long) field3247[field3235 + 1];
                    field3247[field3235++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field3235 -= 2;
                    int var221 = field3247[field3235];
                    int var222 = field3247[field3235 + 1];
                    field3247[field3235++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field3235 -= 2;
                    int var223 = field3247[field3235];
                    int var224 = field3247[field3235 + 1];
                    field3247[field3235++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field3235 -= 2;
                    int var225 = field3247[field3235];
                    int var226 = field3247[field3235 + 1];
                    field3247[field3235++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field3235 -= 2;
                    int var227 = field3247[field3235];
                    int var228 = field3247[field3235 + 1];
                    field3247[field3235++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field3235 -= 2;
                    int var229 = field3247[field3235];
                    int var230 = field3247[field3235 + 1];
                    if (var229 == 0) {
                        field3247[field3235++] = 0;
                        return;
                    }
                    field3247[field3235++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field3235 -= 2;
                    int var231 = field3247[field3235];
                    int var232 = field3247[field3235 + 1];
                    if (var231 == 0) {
                        field3247[field3235++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field3247[field3235++] = Integer.MAX_VALUE;
                        return;
                    }
                    field3247[field3235++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field3235 -= 2;
                    int var233 = field3247[field3235];
                    int var234 = field3247[field3235 + 1];
                    field3247[field3235++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field3235 -= 2;
                    int var235 = field3247[field3235];
                    int var236 = field3247[field3235 + 1];
                    field3247[field3235++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field3235 -= 2;
                    int var237 = field3247[field3235];
                    int var238 = field3247[field3235 + 1];
                    field3247[field3235++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field3235 -= 2;
                    int var239 = field3247[field3235];
                    int var240 = field3247[field3235 + 1];
                    field3247[field3235++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field3235 -= 3;
                    long var241 = (long) field3247[field3235];
                    long var243 = (long) field3247[field3235 + 1];
                    long var245 = (long) field3247[field3235 + 2];
                    field3247[field3235++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field3229[--field3237];
                    int var248 = field3247[--field3235];
                    field3229[field3237++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field3237 -= 2;
                    String var249 = field3229[field3237];
                    String var250 = field3229[field3237 + 1];
                    field3229[field3237++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field3229[--field3237];
                    int var252 = field3247[--field3235];
                    field3229[field3237++] = var251 + class401.method2513(true, 0, var252);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field3229[--field3237];
                    field3229[field3237++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field3229[field3237++] = method1348(field3247[--field3235]);
                    return;
                }
                if (arg0 == 4105) {
                    field3237 -= 2;
                    String var254 = field3229[field3237];
                    String var255 = field3229[field3237 + 1];
                    if (class398.field5947.field2667 != null && class398.field5947.field2667.field7166) {
                        field3229[field3237++] = var255;
                        return;
                    }
                    field3229[field3237++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field3247[--field3235];
                    field3229[field3237++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field3237 -= 2;
                    field3247[field3235++] = class313.method1995(class224.field3673, field3229[field3237 + 1], field3229[field3237], true);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field3229[--field3237];
                    field3235 -= 2;
                    int var258 = field3247[field3235];
                    int var259 = field3247[field3235 + 1];
                    class348 var260 = class33.method230(21108, var259, class152.field2264, 0);
                    field3247[field3235++] = var260.method2166(var258, class141.field2146, var257, (byte) 126);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field3229[--field3237];
                    field3235 -= 2;
                    int var262 = field3247[field3235];
                    int var263 = field3247[field3235 + 1];
                    class348 var264 = class33.method230(21108, var263, class152.field2264, 0);
                    field3247[field3235++] = var264.method2172((byte) 126, var262, class141.field2146, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field3237 -= 2;
                    String var265 = field3229[field3237];
                    String var266 = field3229[field3237 + 1];
                    if (field3247[--field3235] == 1) {
                        field3229[field3237++] = var265;
                        return;
                    }
                    field3229[field3237++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field3229[--field3237];
                    field3229[field3237++] = class169.method1133(var267, 67);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field3229[--field3237];
                    int var269 = field3247[--field3235];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field3229[field3237++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field3247[--field3235];
                    field3247[field3235++] = class428.method2670(-87, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field3247[--field3235];
                    field3247[field3235++] = class3.method9((char) var271, 48) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field3247[--field3235];
                    field3247[field3235++] = class255.method1704((char) var272, (byte) 15) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field3247[--field3235];
                    field3247[field3235++] = class42.method398((char) var273, (byte) 36) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field3229[--field3237];
                    if (var274 != null) {
                        field3247[field3235++] = var274.length();
                        return;
                    }
                    field3247[field3235++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field3229[--field3237];
                    field3235 -= 2;
                    int var276 = field3247[field3235];
                    int var277 = field3247[field3235 + 1];
                    field3229[field3237++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field3229[--field3237];
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
                    field3229[field3237++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field3229[--field3237];
                    field3235 -= 2;
                    int var284 = field3247[field3235];
                    int var285 = field3247[field3235 + 1];
                    field3247[field3235++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field3237 -= 2;
                    String var286 = field3229[field3237];
                    String var287 = field3229[field3237 + 1];
                    int var288 = field3247[--field3235];
                    field3247[field3235++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field3247[--field3235];
                    field3247[field3235++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field3247[--field3235];
                    field3247[field3235++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field3247[--field3235] != 0;
                    int var292 = field3247[--field3235];
                    field3229[field3237++] = class402.method2518(var291, class224.field3673, (long) var292, -128, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field3229[--field3237];
                    int var294 = field3247[--field3235];
                    class348 var295 = class33.method230(21108, var294, class152.field2264, 0);
                    field3247[field3235++] = var295.method2170(var293, class141.field2146, -71);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field3247[--field3235];
                    field3229[field3237++] = class390.field5847.method467((byte) -101, var296).field7806;
                    return;
                }
                if (arg0 == 4201) {
                    field3235 -= 2;
                    int var297 = field3247[field3235];
                    int var298 = field3247[field3235 + 1];
                    class532 var299 = class390.field5847.method467((byte) -101, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field7767[var298 - 1] != null) {
                        field3229[field3237++] = var299.field7767[var298 - 1];
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field3235 -= 2;
                    int var300 = field3247[field3235];
                    int var301 = field3247[field3235 + 1];
                    class532 var302 = class390.field5847.method467((byte) -101, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field7783[var301 - 1] != null) {
                        field3229[field3237++] = var302.field7783[var301 - 1];
                        return;
                    }
                    field3229[field3237++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field3247[--field3235];
                    field3247[field3235++] = class390.field5847.method467((byte) -101, var303).field7818;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field3247[--field3235];
                    field3247[field3235++] = class390.field5847.method467((byte) -101, var304).field7812 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field3247[--field3235];
                    class532 var306 = class390.field5847.method467((byte) -101, var305);
                    if (var306.field7833 == -1 && var306.field7764 >= 0) {
                        field3247[field3235++] = var306.field7764;
                        return;
                    }
                    field3247[field3235++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field3247[--field3235];
                    class532 var308 = class390.field5847.method467((byte) -101, var307);
                    if (var308.field7833 >= 0 && var308.field7764 >= 0) {
                        field3247[field3235++] = var308.field7764;
                        return;
                    }
                    field3247[field3235++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field3247[--field3235];
                    field3247[field3235++] = class390.field5847.method467((byte) -101, var309).field7807 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field3235 -= 2;
                    int var310 = field3247[field3235];
                    int var311 = field3247[field3235 + 1];
                    class260 var312 = class474.field6839.method3057(var311, (byte) 106);
                    if (var312.method1738(-125)) {
                        field3229[field3237++] = class390.field5847.method467((byte) -101, var310).method3158(false, var312.field3990, var311);
                        return;
                    }
                    field3247[field3235++] = class390.field5847.method467((byte) -101, var310).method3152(-1591469952, var311, var312.field3981);
                    return;
                }
                if (arg0 == 4209) {
                    field3235 -= 2;
                    int var313 = field3247[field3235];
                    int var314 = field3247[field3235 + 1] - 1;
                    class532 var315 = class390.field5847.method467((byte) -101, var313);
                    if (var315.field7817 == var314) {
                        field3247[field3235++] = var315.field7813;
                        return;
                    }
                    if (var315.field7809 == var314) {
                        field3247[field3235++] = var315.field7803;
                        return;
                    }
                    field3247[field3235++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field3229[--field3237];
                    int var317 = field3247[--field3235];
                    class52.method503(true, var316, var317 == 1);
                    field3247[field3235++] = class316.field4778;
                    return;
                }
                if (arg0 == 4211) {
                    if (class419.field6258 != null && class19.field248 < class316.field4778) {
                        field3247[field3235++] = class419.field6258[class19.field248++] & 0xFFFF;
                        return;
                    }
                    field3247[field3235++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class19.field248 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field3235 -= 2;
                    int var318 = field3247[field3235];
                    int var319 = field3247[field3235 + 1];
                    class260 var320 = class474.field6839.method3057(var319, (byte) 54);
                    if (var320.method1738(-85)) {
                        field3229[field3237++] = class175.field2605.method2782(var318, (byte) -87).method263(var320.field3990, (byte) 116, var319);
                        return;
                    }
                    field3247[field3235++] = class175.field2605.method2782(var318, (byte) -87).method255((byte) -106, var320.field3981, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field3235 -= 2;
                    int var321 = field3247[field3235];
                    int var322 = field3247[field3235 + 1];
                    class260 var323 = class474.field6839.method3057(var322, (byte) 117);
                    if (var323.method1738(-102)) {
                        field3229[field3237++] = class510.field7458.method2973(-127, var321).method601(var323.field3990, var322, (byte) -20);
                        return;
                    }
                    field3247[field3235++] = class510.field7458.method2973(-125, var321).method603((byte) -118, var323.field3981, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field3235 -= 2;
                    int var324 = field3247[field3235];
                    int var325 = field3247[field3235 + 1];
                    class260 var326 = class474.field6839.method3057(var325, (byte) 96);
                    if (var326.method1738(-128)) {
                        field3229[field3237++] = class280.field4227.method3019(-19524, var324).method3094((byte) -28, var325, var326.field3990);
                        return;
                    }
                    field3247[field3235++] = class280.field4227.method3019(-19524, var324).method3099(120, var326.field3981, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field3247[--field3235];
                class376 var328 = class138.field2094.method2808(var327, 18334);
                if (var328.field5639 != null && var328.field5639.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field5655[0];
                    for (int var331 = 1; var331 < var328.field5639.length; var331++) {
                        if (var328.field5655[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field5655[var331];
                        }
                    }
                    field3247[field3235++] = var328.field5639[var329];
                    return;
                }
                field3247[field3235++] = var328.field5680;
                return;
            }
        } else {
            class114 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class475.method2864(true, field3247[--field3235]);
            } else {
                var47 = arg1 ? field3252 : field3234;
            }
            if (arg0 == 1300) {
                int var48 = field3247[--field3235] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method859(field3229[--field3237], (byte) 38, var48);
                    return;
                }
                field3237--;
                return;
            }
            if (arg0 == 1301) {
                field3235 -= 2;
                int var49 = field3247[field3235];
                int var50 = field3247[field3235 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field1582 = null;
                    return;
                }
                var47.field1582 = class181.method1210(var50, -2, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field3247[--field3235];
                if (class338.field5022 != var51 && class46.field594 != var51 && class188.field3001 != var51) {
                    return;
                }
                var47.field1623 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field1637 = field3247[--field3235];
                return;
            }
            if (arg0 == 1304) {
                var47.field1677 = field3247[--field3235];
                return;
            }
            if (arg0 == 1305) {
                var47.field1600 = field3229[--field3237];
                return;
            }
            if (arg0 == 1306) {
                var47.field1583 = field3229[--field3237];
                return;
            }
            if (arg0 == 1307) {
                var47.field1647 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field1718 = field3247[--field3235];
                var47.field1598 = field3247[--field3235];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field3247[--field3235];
                int var53 = field3247[--field3235];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method858(var52, true, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field1738 = field3229[--field3237];
                return;
            }
            if (arg0 == 1311) {
                var47.field1689 = field3247[--field3235];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field3235 -= 3;
                    var54 = field3247[field3235] - 1;
                    var55 = field3247[field3235 + 1];
                    var56 = field3247[field3235 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field3235 -= 2;
                    var54 = 10;
                    var55 = field3247[field3235];
                    var56 = field3247[field3235 + 1];
                }
                if (var47.field1707 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field1707 = new byte[11];
                    var47.field1685 = new byte[11];
                    var47.field1682 = new int[11];
                }
                var47.field1707[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field1588 = false;
                    for (int var57 = 0; var57 < var47.field1707.length; var57++) {
                        if (var47.field1707[var57] != 0) {
                            var47.field1588 = true;
                            break;
                        }
                    }
                } else {
                    var47.field1588 = true;
                }
                var47.field1685[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field1591 = field3247[--field3235];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lqd;II)V")
    public static final void method1345(class315 arg0, int arg1, int arg2) {
        class457 var3 = class325.method2069(arg1, arg0, 1131661840, arg2);
        if (var3 == null) {
            return;
        }
        field3249 = new int[var3.field6654];
        field3242 = new String[var3.field6645];
        if (class322.field4830 == var3.field6649 || class295.field4502 == var3.field6649 || class38.field514 == var3.field6649) {
            int var4 = 0;
            int var5 = 0;
            if (class401.field5962 != null) {
                var4 = class401.field5962.field1646;
                var5 = class401.field5962.field1701;
            }
            field3249[0] = class184.field2800.method542(false) - var4;
            field3249[1] = class184.field2800.method543(true) - var5;
        }
        method1349(var3, 200000);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IZ)V")
    private static final void method1346(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field3247[field3235++] = class320.field4817;
                return;
            }
            if (arg0 == 5001) {
                field3235 -= 3;
                class320.field4817 = field3247[field3235];
                class59.field707 = class183.method1213(field3247[field3235 + 1], -119);
                if (class59.field707 == null) {
                    class59.field707 = class444.field6524;
                }
                class289.field4355 = field3247[field3235 + 2];
                field3243++;
                class74.method640(-29627, class78.field1134);
                class71.field1020.method1545(class320.field4817, -84);
                class71.field1020.method1545(class59.field707.field4654, -93);
                class71.field1020.method1545(class289.field4355, -89);
                return;
            }
            if (arg0 == 5002) {
                field3237 -= 2;
                String var2 = field3229[field3237];
                String var3 = field3229[field3237 + 1];
                field3235 -= 2;
                int var4 = field3247[field3235];
                int var5 = field3247[field3235 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field3240++;
                class74.method640(-29627, class75.field1072);
                class71.field1020.method1545(class4.method10(var2, 99) + class4.method10(var3, 85) + 2, -58);
                class71.field1020.method1534(var2, false);
                class71.field1020.method1545(var4 - 1, -93);
                class71.field1020.method1545(var5, -107);
                class71.field1020.method1534(var3, false);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field3247[--field3235];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class308.field4641[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field3229[field3237++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field3247[--field3235];
                int var9 = -1;
                if (var8 < 100 && class308.field4641[var8] != null) {
                    var9 = class473.field6827[var8];
                }
                field3247[field3235++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class59.field707 == null) {
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = class59.field707.field4654;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field3229[--field3237];
                method1343(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field3237 -= 2;
                String var11 = field3229[field3237];
                String var12 = field3229[field3237 + 1];
                if (class417.field6224 != 0 || (!class363.field5366 || class382.field5751) && !class412.field6177) {
                    field3244++;
                    class74.method640(-29627, class450.field6581);
                    class71.field1020.method1545(0, -127);
                    int var13 = class71.field1020.field3556;
                    class71.field1020.method1534(var11, false);
                    class296.method1926(class71.field1020, (byte) -70, var12);
                    class71.field1020.method1513(class71.field1020.field3556 - var13, (byte) 107);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field3247[--field3235];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class428.field6365[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field3229[field3237++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field3247[--field3235];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class494.field7133[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field3229[field3237++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field3247[--field3235];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class13.field189[var18];
                }
                field3247[field3235++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class398.field5947 == null || class398.field5947.field2642 == null) {
                    var20 = class97.field1393;
                } else {
                    var20 = class398.field5947.method1185(true, (byte) -125);
                }
                field3229[field3237++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field3247[field3235++] = class289.field4355;
                return;
            }
            if (arg0 == 5017) {
                field3247[field3235++] = class108.field1509;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field3247[--field3235];
                int var22 = 0;
                if (var21 < 100 && class308.field4641[var21] != null) {
                    var22 = class456.field6639[var21];
                }
                field3247[field3235++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field3247[--field3235];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class268.field4102[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field3229[field3237++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class398.field5947 == null || class398.field5947.field2642 == null) {
                    var25 = class97.field1393;
                } else {
                    var25 = class398.field5947.method1190(0, false);
                }
                field3229[field3237++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field3247[--field3235];
                field3229[field3237++] = class516.field7501.method2325((byte) -127, var26).field5696;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field3247[--field3235];
                class378 var28 = class516.field7501.method2325((byte) -128, var27);
                if (var28.field5703 == null) {
                    field3247[field3235++] = 0;
                    return;
                }
                field3247[field3235++] = var28.field5703.length;
                return;
            }
            if (arg0 == 5052) {
                field3235 -= 2;
                int var29 = field3247[field3235];
                int var30 = field3247[field3235 + 1];
                class378 var31 = class516.field7501.method2325((byte) -128, var29);
                int var32 = var31.field5703[var30];
                field3247[field3235++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field3247[--field3235];
                class378 var34 = class516.field7501.method2325((byte) -127, var33);
                if (var34.field5708 == null) {
                    field3247[field3235++] = 0;
                    return;
                }
                field3247[field3235++] = var34.field5708.length;
                return;
            }
            if (arg0 == 5054) {
                field3235 -= 2;
                int var35 = field3247[field3235];
                int var36 = field3247[field3235 + 1];
                field3247[field3235++] = class516.field7501.method2325((byte) -128, var35).field5708[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field3247[--field3235];
                field3229[field3237++] = class507.field7412.method963(var37, (byte) 87).method1819(1);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field3247[--field3235];
                class276 var39 = class507.field7412.method963(var38, (byte) 87);
                if (var39.field4207 == null) {
                    field3247[field3235++] = 0;
                    return;
                }
                field3247[field3235++] = var39.field4207.length;
                return;
            }
            if (arg0 == 5057) {
                field3235 -= 2;
                int var40 = field3247[field3235];
                int var41 = field3247[field3235 + 1];
                field3247[field3235++] = class507.field7412.method963(var40, (byte) 87).field4207[var41];
                return;
            }
            if (arg0 == 5058) {
                field3251 = new class402();
                field3251.field5973 = field3247[--field3235];
                field3251.field5968 = class507.field7412.method963(field3251.field5973, (byte) 87);
                field3251.field5972 = new int[field3251.field5968.method1813(-112)];
                return;
            }
            if (arg0 == 5059) {
                field3250++;
                class74.method640(-29627, class149.field2241);
                class71.field1020.method1545(0, -79);
                int var42 = class71.field1020.field3556;
                class71.field1020.method1545(0, -74);
                class71.field1020.method1542(field3251.field5973, -2756);
                field3251.field5968.method1821(true, field3251.field5972, class71.field1020);
                class71.field1020.method1513(class71.field1020.field3556 - var42, (byte) 107);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field3229[--field3237];
                field3239++;
                class74.method640(-29627, class446.field6539);
                class71.field1020.method1545(0, -42);
                int var44 = class71.field1020.field3556;
                class71.field1020.method1534(var43, false);
                class71.field1020.method1542(field3251.field5973, -2756);
                field3251.field5968.method1821(true, field3251.field5972, class71.field1020);
                class71.field1020.method1513(class71.field1020.field3556 - var44, (byte) 107);
                return;
            }
            if (arg0 == 5061) {
                field3250++;
                class74.method640(-29627, class149.field2241);
                class71.field1020.method1545(0, -107);
                int var45 = class71.field1020.field3556;
                class71.field1020.method1545(1, -64);
                class71.field1020.method1542(field3251.field5973, -2756);
                field3251.field5968.method1821(true, field3251.field5972, class71.field1020);
                class71.field1020.method1513(class71.field1020.field3556 - var45, (byte) 107);
                return;
            }
            if (arg0 == 5062) {
                field3235 -= 2;
                int var46 = field3247[field3235];
                int var47 = field3247[field3235 + 1];
                field3247[field3235++] = class516.field7501.method2325((byte) -123, var46).field5699[var47];
                return;
            }
            if (arg0 == 5063) {
                field3235 -= 2;
                int var48 = field3247[field3235];
                int var49 = field3247[field3235 + 1];
                field3247[field3235++] = class516.field7501.method2325((byte) -127, var48).field5698[var49];
                return;
            }
            if (arg0 == 5064) {
                field3235 -= 2;
                int var50 = field3247[field3235];
                int var51 = field3247[field3235 + 1];
                if (var51 == -1) {
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = class516.field7501.method2325((byte) -126, var50).method2372((char) var51, 108);
                return;
            }
            if (arg0 == 5065) {
                field3235 -= 2;
                int var52 = field3247[field3235];
                int var53 = field3247[field3235 + 1];
                if (var53 == -1) {
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = class516.field7501.method2325((byte) -127, var52).method2374((char) var53, 0);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field3247[--field3235];
                field3247[field3235++] = class507.field7412.method963(var54, (byte) 87).method1813(-83);
                return;
            }
            if (arg0 == 5067) {
                field3235 -= 2;
                int var55 = field3247[field3235];
                int var56 = field3247[field3235 + 1];
                int var57 = class507.field7412.method963(var55, (byte) 87).method1814((byte) -16, var56).field840;
                field3247[field3235++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field3235 -= 2;
                int var58 = field3247[field3235];
                int var59 = field3247[field3235 + 1];
                field3251.field5972[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field3235 -= 2;
                int var60 = field3247[field3235];
                int var61 = field3247[field3235 + 1];
                field3251.field5972[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field3235 -= 3;
                int var62 = field3247[field3235];
                int var63 = field3247[field3235 + 1];
                int var64 = field3247[field3235 + 2];
                class276 var65 = class507.field7412.method963(var62, (byte) 87);
                if (var65.method1814((byte) -16, var63).field840 != 0) {
                    throw new RuntimeException("bad command");
                }
                field3247[field3235++] = var65.method1817(-33, var64, var63);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field3229[--field3237];
                boolean var67 = field3247[--field3235] == 1;
                class350.method2177(var67, 0, var66);
                field3247[field3235++] = class316.field4778;
                return;
            }
            if (arg0 == 5072) {
                if (class419.field6258 != null && class19.field248 < class316.field4778) {
                    field3247[field3235++] = class419.field6258[class19.field248++] & 0xFFFF;
                    return;
                }
                field3247[field3235++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class19.field248 = 0;
                return;
            }
            if (arg0 == 5074) {
                field3250++;
                class74.method640(-29627, class149.field2241);
                class71.field1020.method1545(0, -68);
                int var68 = class71.field1020.field3556;
                class71.field1020.method1545(2, -70);
                class71.field1020.method1542(field3251.field5973, -2756);
                field3251.field5968.method1821(true, field3251.field5972, class71.field1020);
                class71.field1020.method1513(class71.field1020.field3556 - var68, (byte) 107);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class101.field1456.method1045(86, (byte) -63)) {
                    field3247[field3235++] = 1;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class101.field1456.method1045(82, (byte) -37)) {
                    field3247[field3235++] = 1;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class101.field1456.method1045(81, (byte) 117)) {
                    field3247[field3235++] = 1;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class32.method227(3, field3247[--field3235]);
                return;
            }
            if (arg0 == 5201) {
                field3247[field3235++] = class270.method1786(9093);
                return;
            }
            if (arg0 == 5205) {
                class219.method1577(field3247[--field3235], false, 104, -1, -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field3247[--field3235];
                class48 var70 = class7.method45(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = var70.field611;
                return;
            }
            if (arg0 == 5207) {
                class48 var71 = class7.method56(field3247[--field3235]);
                if (var71 != null && var71.field608 != null) {
                    field3229[field3237++] = var71.field608;
                    return;
                }
                field3229[field3237++] = "";
                return;
            }
            if (arg0 == 5208) {
                field3247[field3235++] = class523.field7654;
                field3247[field3235++] = class346.field5123;
                return;
            }
            if (arg0 == 5209) {
                field3247[field3235++] = class7.field106 + class136.field2074;
                field3247[field3235++] = class7.field103 + class319.field4810;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field3247[--field3235];
                class48 var73 = class7.method56(var72);
                if (var73 == null) {
                    field3247[field3235++] = 0;
                    field3247[field3235++] = 0;
                    return;
                }
                field3247[field3235++] = var73.field607 >> 14 & 0x3FFF;
                field3247[field3235++] = var73.field607 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field3247[--field3235];
                class48 var75 = class7.method56(var74);
                if (var75 == null) {
                    field3247[field3235++] = 0;
                    field3247[field3235++] = 0;
                    return;
                }
                field3247[field3235++] = var75.field617 - var75.field621;
                field3247[field3235++] = var75.field622 - var75.field604;
                return;
            }
            if (arg0 == 5212) {
                class523 var76 = class425.method2652(0);
                if (var76 == null) {
                    field3247[field3235++] = -1;
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = var76.field7645;
                int var77 = var76.field7649 << 28 | class7.field106 + var76.field7643 << 14 | class7.field103 + var76.field7647;
                field3247[field3235++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class523 var78 = class363.method2274((byte) -88);
                if (var78 == null) {
                    field3247[field3235++] = -1;
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = var78.field7645;
                int var79 = var78.field7649 << 28 | class7.field106 + var78.field7643 << 14 | class7.field103 + var78.field7647;
                field3247[field3235++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field3247[--field3235];
                class48 var81 = class333.method2103((byte) 108);
                if (var81 != null) {
                    boolean var82 = var81.method480(var80 >> 28 & 0x3, 16542, field3254, var80 & 0x3FFF, var80 >> 14 & 0x3FFF);
                    if (var82) {
                        class272.method1796(field3254[1], field3254[2], 9524);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field3235 -= 2;
                int var83 = field3247[field3235];
                int var84 = field3247[field3235 + 1];
                class143 var85 = class7.method43(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class48 var87 = (class48) var85.method1024((byte) 95); var87 != null; var87 = (class48) var85.method1022(-3)) {
                    if (var87.field611 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field3247[field3235++] = 1;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field3247[--field3235];
                class48 var89 = class7.method56(var88);
                if (var89 == null) {
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = var89.field605;
                return;
            }
            if (arg0 == 5220) {
                field3247[field3235++] = class172.field2549 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field3247[--field3235];
                class272.method1796(var90 >> 14 & 0x3FFF, var90 & 0x3FFF, 9524);
                return;
            }
            if (arg0 == 5222) {
                class48 var91 = class333.method2103((byte) 33);
                if (var91 != null) {
                    boolean var92 = var91.method482(field3254, class7.field103 + class319.field4810, class7.field106 + class136.field2074, true);
                    if (var92) {
                        field3247[field3235++] = field3254[1];
                        field3247[field3235++] = field3254[2];
                        return;
                    }
                    field3247[field3235++] = -1;
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = -1;
                field3247[field3235++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field3235 -= 2;
                int var93 = field3247[field3235];
                int var94 = field3247[field3235 + 1];
                class219.method1577(var93, false, 49, var94 >> 14 & 0x3FFF, var94 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field3247[--field3235];
                class48 var96 = class333.method2103((byte) 34);
                if (var96 != null) {
                    boolean var97 = var96.method480(var95 >> 28 & 0x3, 16542, field3254, var95 & 0x3FFF, var95 >> 14 & 0x3FFF);
                    if (var97) {
                        field3247[field3235++] = field3254[1];
                        field3247[field3235++] = field3254[2];
                        return;
                    }
                    field3247[field3235++] = -1;
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = -1;
                field3247[field3235++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field3247[--field3235];
                class48 var99 = class333.method2103((byte) 19);
                if (var99 != null) {
                    boolean var100 = var99.method482(field3254, var98 & 0x3FFF, var98 >> 14 & 0x3FFF, true);
                    if (var100) {
                        field3247[field3235++] = field3254[1];
                        field3247[field3235++] = field3254[2];
                        return;
                    }
                    field3247[field3235++] = -1;
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = -1;
                field3247[field3235++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class258.method1722((byte) -32, field3247[--field3235]);
                return;
            }
            if (arg0 == 5227) {
                field3235 -= 2;
                int var101 = field3247[field3235];
                int var102 = field3247[field3235 + 1];
                class219.method1577(var101, true, 107, var102 >> 14 & 0x3FFF, var102 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class95.field1368 = field3247[--field3235] == 1;
                return;
            }
            if (arg0 == 5229) {
                field3247[field3235++] = class95.field1368 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field3247[--field3235];
                class227.method1615(var103, -1);
                return;
            }
            if (arg0 == 5231) {
                field3235 -= 2;
                int var104 = field3247[field3235];
                boolean var105 = field3247[field3235 + 1] == 1;
                if (class490.field7042 != null) {
                    class431 var106 = class490.field7042.method2585((byte) 114, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method2677(-22491);
                        return;
                    }
                    if (var106 == null && var105) {
                        class431 var107 = new class431();
                        class490.field7042.method2591((long) var104, var107, (byte) -110);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field3247[--field3235];
                if (class490.field7042 != null) {
                    class431 var109 = class490.field7042.method2585((byte) 114, (long) var108);
                    field3247[field3235++] = var109 == null ? 0 : 1;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field3235 -= 2;
                int var110 = field3247[field3235];
                boolean var111 = field3247[field3235 + 1] == 1;
                if (class327.field4919 != null) {
                    class431 var112 = class327.field4919.method2585((byte) 114, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method2677(-22491);
                        return;
                    }
                    if (var112 == null && var111) {
                        class431 var113 = new class431();
                        class327.field4919.method2591((long) var110, var113, (byte) -116);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field3247[--field3235];
                if (class327.field4919 != null) {
                    class431 var115 = class327.field4919.method2585((byte) 114, (long) var114);
                    field3247[field3235++] = var115 == null ? 0 : 1;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field3247[field3235++] = class7.field80 == null ? -1 : class7.field80.field611;
                return;
            }
            if (arg0 == 5236) {
                field3235 -= 2;
                int var116 = field3247[field3235];
                int var117 = field3247[field3235 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class240.method1654(var118, -20665, var116, var119);
                if (var120 < 0) {
                    field3247[field3235++] = -1;
                    return;
                }
                field3247[field3235++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field3235 -= 2;
                int var121 = field3247[field3235];
                int var122 = field3247[field3235 + 1];
                class328.method2083(3, var122, var121, false, (byte) 70);
                field3247[field3235++] = class168.field2489 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class168.field2489 != null) {
                    class328.method2083(class193.field3258.field7214, -1, -1, false, (byte) 119);
                }
                return;
            }
            if (arg0 == 5302) {
                class224[] var123 = class52.method500((byte) -71);
                field3247[field3235++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field3247[--field3235];
                class224[] var125 = class52.method500((byte) -67);
                field3247[field3235++] = var125[var124].field3666;
                field3247[field3235++] = var125[var124].field3668;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class193.field3258.field7223;
                int var127 = class193.field3258.field7231;
                int var128 = -1;
                class224[] var129 = class52.method500((byte) -70);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class224 var131 = var129[var130];
                    if (var131.field3666 == var126 && var131.field3668 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field3247[field3235++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field3247[field3235++] = class32.method223((byte) 122);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field3247[--field3235];
                if (var132 >= 1 && var132 <= 2) {
                    class328.method2083(var132, -1, -1, false, (byte) -127);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field3247[field3235++] = class193.field3258.field7214;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field3247[--field3235];
                if (var133 >= 1 && var133 <= 2) {
                    class193.field3258.field7214 = var133;
                    class193.field3258.method933((byte) 78, class360.field5349);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field3237 -= 2;
                String var134 = field3229[field3237];
                String var135 = field3229[field3237 + 1];
                int var136 = field3247[--field3235];
                field3248++;
                class74.method640(-29627, class425.field6338);
                class71.field1020.method1545(class4.method10(var134, 126) + class4.method10(var135, 81) + 1, -49);
                class71.field1020.method1534(var134, false);
                class71.field1020.method1534(var135, false);
                class71.field1020.method1545(var136, -68);
                return;
            }
            if (arg0 == 5401) {
                field3235 -= 2;
                class106.field1495[field3247[field3235]] = (short) class305.method1956(true, field3247[field3235 + 1]);
                class390.field5847.method462(57);
                class390.field5847.method459(106);
                class175.field2605.method2786((byte) 110);
                class152.method1044((byte) -125);
                return;
            }
            if (arg0 == 5405) {
                field3235 -= 2;
                int var137 = field3247[field3235];
                int var138 = field3247[field3235 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class380.field5737[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field3235 -= 7;
                int var139 = field3247[field3235];
                int var140 = field3247[field3235 + 1] << 1;
                int var141 = field3247[field3235 + 2];
                int var142 = field3247[field3235 + 3];
                int var143 = field3247[field3235 + 4];
                int var144 = field3247[field3235 + 5];
                int var145 = field3247[field3235 + 6];
                if (var139 >= 0 && var139 < 2 && class380.field5737[var139] != null && var140 >= 0 && var140 < class380.field5737[var139].length) {
                    class380.field5737[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class380.field5737[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class380.field5737[field3247[--field3235]].length >> 1;
                field3247[field3235++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class168.field2489 != null) {
                    class328.method2083(class193.field3258.field7214, -1, -1, false, (byte) 59);
                }
                if (class281.field4281 != null) {
                    class160.method1094(-41);
                    System.exit(0);
                    return;
                }
                String var147 = class259.field3977 == null ? class259.method1736(-7264) : class259.field3977;
                class136.method990(class96.field1384 == 1, class360.field5349, false, var147, false);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class514.field7471 != null) {
                    if (class514.field7471.field6569 == null) {
                        var148 = class329.method2085((byte) -122, class514.field7471.field6565);
                    } else {
                        var148 = (String) class514.field7471.field6569;
                    }
                }
                field3229[field3237++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field3247[field3235++] = class352.field5196 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class168.field2489 != null) {
                    class328.method2083(class193.field3258.field7214, -1, -1, false, (byte) -128);
                }
                String var149 = field3229[--field3237];
                boolean var150 = field3247[--field3235] == 1;
                String var151 = class259.method1736(-7264) + var149;
                class136.method990(class96.field1384 == 1, class360.field5349, var150, var151, false);
                return;
            }
            if (arg0 == 5422) {
                field3237 -= 2;
                String var152 = field3229[field3237];
                String var153 = field3229[field3237 + 1];
                int var154 = field3247[--field3235];
                if (var152.length() > 0) {
                    if (class276.field4208 == null) {
                        class276.field4208 = new String[class137.field2093[class312.field4691.field6918]];
                    }
                    class276.field4208[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class469.field6776 == null) {
                        class469.field6776 = new String[class137.field2093[class312.field4691.field6918]];
                    }
                    class469.field6776[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field3229[--field3237]);
                return;
            }
            if (arg0 == 5424) {
                field3235 -= 11;
                class469.field6773 = field3247[field3235];
                class155.field2313 = field3247[field3235 + 1];
                class157.field2375 = field3247[field3235 + 2];
                class495.field7138 = field3247[field3235 + 3];
                class430.field6377 = field3247[field3235 + 4];
                class280.field4248 = field3247[field3235 + 5];
                class142.field2167 = field3247[field3235 + 6];
                class268.field4100 = field3247[field3235 + 7];
                class215.field3495 = field3247[field3235 + 8];
                class213.field3482 = field3247[field3235 + 9];
                class186.field2814 = field3247[field3235 + 10];
                class176.field2627.method2556((byte) 21, class430.field6377);
                class176.field2627.method2556((byte) 21, class280.field4248);
                class176.field2627.method2556((byte) 21, class142.field2167);
                class176.field2627.method2556((byte) 21, class268.field4100);
                class176.field2627.method2556((byte) 21, class215.field3495);
                class459.field6687 = null;
                class46.field601 = null;
                class142.field2181 = null;
                class124.field1846 = null;
                class380.field5734 = null;
                class528.field7701 = null;
                class40.field534 = null;
                class100.field1429 = null;
                class432.field6402 = true;
                return;
            }
            if (arg0 == 5425) {
                class52.method499(18328);
                class432.field6402 = false;
                return;
            }
            if (arg0 == 5426) {
                field3235 -= 2;
                class23.field284 = field3247[field3235];
                class273.field4187 = field3247[field3235 + 1];
                return;
            }
            if (arg0 == 5427) {
                field3235 -= 2;
                class319.field4812 = field3247[field3235 + 1];
                return;
            }
            if (arg0 == 5428) {
                field3235 -= 2;
                int var155 = field3247[field3235];
                int var156 = field3247[field3235 + 1];
                field3247[field3235++] = class145.method1028(true, var156, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class447.method2742(false, field3229[--field3237], 3825);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class513.method3040("accountcreated", class360.field5349.field5199, 1360);
                    return;
                } catch (Throwable var277) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field3235 -= 4;
                int var157 = field3247[field3235];
                int var158 = field3247[field3235 + 1];
                int var159 = field3247[field3235 + 2];
                int var160 = field3247[field3235 + 3];
                class19.method158(var158, (var157 & 0x3FFF) - class176.field2613, var159, -116, var160, (var157 >> 14 & 0x3FFF) - class390.field5842, false);
                return;
            }
            if (arg0 == 5501) {
                field3235 -= 4;
                int var161 = field3247[field3235];
                int var162 = field3247[field3235 + 1];
                int var163 = field3247[field3235 + 2];
                int var164 = field3247[field3235 + 3];
                class39.method375((var161 >> 14 & 0x3FFF) - class390.field5842, var162, true, (var161 & 0x3FFF) - class176.field2613, var163, var164);
                return;
            }
            if (arg0 == 5502) {
                field3235 -= 6;
                int var165 = field3247[field3235];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class360.field5346 = var165;
                int var166 = field3247[field3235 + 1];
                if (var166 + 1 >= class380.field5737[class360.field5346].length >> 1) {
                    throw new RuntimeException();
                }
                class321.field4822 = var166;
                class64.field787 = 0;
                class240.field3833 = field3247[field3235 + 2];
                class377.field5694 = field3247[field3235 + 3];
                int var167 = field3247[field3235 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class368.field5409 = var167;
                int var168 = field3247[field3235 + 5];
                if (var168 + 1 >= class380.field5737[class368.field5409].length >> 1) {
                    throw new RuntimeException();
                }
                class471.field6812 = var168;
                class176.field2611 = 3;
                return;
            }
            if (arg0 == 5503) {
                class474.method2853((byte) 30);
                return;
            }
            if (arg0 == 5504) {
                field3235 -= 2;
                class237.method1643(field3247[field3235], 0, 2, field3247[field3235 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field3247[field3235++] = (int) class181.field2711 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field3247[field3235++] = (int) class473.field6830 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class225.method1602((byte) -51);
                return;
            }
            if (arg0 == 5508) {
                class405.method2531(31555);
                return;
            }
            if (arg0 == 5509) {
                class13.method96((byte) 38);
                return;
            }
            if (arg0 == 5510) {
                class232.method1629((byte) 53);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field3247[--field3235];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class390.field5842;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class69.field976) {
                    var172 = class69.field976;
                }
                int var173 = var171 - class176.field2613;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class285.field4328) {
                    var173 = class285.field4328;
                }
                class222.field3637 = (var172 << 7) + 64;
                class476.field6868 = (var173 << 7) + 64;
                class176.field2611 = 4;
                return;
            }
            if (arg0 == 5512) {
                class509.method3032(true);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field3237 -= 2;
                String var174 = field3229[field3237];
                String var175 = field3229[field3237 + 1];
                int var176 = field3247[--field3235];
                if (class429.field6373 != 2) {
                    return;
                }
                if (class500.field7185 == 0 && class197.field3291 == 0) {
                    class97.field1393 = var174;
                    class124.field1847 = var175;
                    class36.field436 = var176;
                    class74.method643(5, (byte) -33);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class147.method1036((byte) 109);
                return;
            }
            if (arg0 == 5602) {
                if (class500.field7185 == 0) {
                    class446.field6542 = -2;
                    class281.field4282 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field3235 -= 4;
                if (class429.field6373 != 2) {
                    return;
                }
                if (class500.field7185 == 0 && class197.field3291 == 0) {
                    class509.method3034(field3247[field3235 + 3], field3247[field3235 + 2], field3247[field3235], 1054, field3247[field3235 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field3237--;
                if (class429.field6373 != 2) {
                    return;
                }
                if (class500.field7185 == 0 && class197.field3291 == 0) {
                    class422.method2631(class257.method1712(field3229[field3237], (byte) -8), -15901);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field3237 -= 3;
                field3235 -= 7;
                if (class429.field6373 != 2) {
                    return;
                }
                if (class500.field7185 == 0 && class197.field3291 == 0) {
                    class102.method813(field3247[field3235 + 2], field3229[field3237 + 1], field3229[field3237 + 2], field3247[field3235 + 3], field3247[field3235 + 5] == 1, field3247[field3235], field3247[field3235 + 1], class257.method1712(field3229[field3237], (byte) -8), field3247[field3235 + 4] == 1, 19487, false, field3247[field3235 + 6] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class197.field3291 == 0) {
                    class182.field2723 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field3247[field3235++] = class281.field4282;
                return;
            }
            if (arg0 == 5608) {
                field3247[field3235++] = class452.field6604;
                return;
            }
            if (arg0 == 5609) {
                field3247[field3235++] = class182.field2723;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field3229[field3237++] = class339.field5051.length > var177 ? class501.method2981(class339.field5051[var177], true) : "";
                }
                class339.field5051 = null;
                return;
            }
            if (arg0 == 5611) {
                field3247[field3235++] = class118.field1793;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field3247[--field3235];
                if (class429.field6373 != 6) {
                    return;
                }
                if (class500.field7185 == 0 && class197.field3291 == 0) {
                    if (class162.field2413 != null) {
                        class162.field2413.method1966(122);
                        class162.field2413 = null;
                    }
                    class36.field436 = var178;
                    class74.method643(8, (byte) -106);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field3247[field3235++] = class281.field4282;
                return;
            }
            if (arg0 == 5615) {
                field3237 -= 2;
                String var179 = field3229[field3237];
                String var180 = field3229[field3237 + 1];
                if (class429.field6373 != 2) {
                    return;
                }
                if (class500.field7185 == 0 && class197.field3291 == 0) {
                    if (class162.field2413 != null) {
                        class162.field2413.method1966(127);
                        class162.field2413 = null;
                    }
                    class97.field1393 = var179;
                    class124.field1847 = var180;
                    class74.method643(4, (byte) -118);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class417.method2613(false, -52);
                return;
            }
            if (arg0 == 5617) {
                field3247[field3235++] = class446.field6542;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field3247[--field3235];
                class64.method552(false, var181, 8191);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field3247[--field3235];
                class64.method552(true, var182, 8191);
                return;
            }
            if (arg0 == 5620) {
                class179.method1198((byte) 95);
                if (class121.field1829 != "" && class121.field1829 != "") {
                    field3247[field3235++] = 1;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field3237 -= 3;
                field3235 -= 7;
                if (class429.field6373 != 2) {
                    return;
                }
                if (class500.field7185 == 0 && class197.field3291 == 0) {
                    class102.method813(field3247[field3235 + 2], field3229[field3237 + 1], field3229[field3237 + 2], field3247[field3235 + 3], field3247[field3235 + 5] == 1, field3247[field3235], field3247[field3235 + 1], class257.method1712(field3229[field3237], (byte) -8), field3247[field3235 + 4] == 1, 19487, true, field3247[field3235 + 6] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class449 var183 = class360.field5349.method2194("3", false, 0);
                while (var183.field6570 == 0) {
                    class434.method2690(10, 1L);
                }
                if (var183.field6570 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class51 var184 = (class51) var183.field6569;
                if (var184.method493(123).exists()) {
                    class217 var185 = new class217(50);
                    try {
                        var184.method494(50, -126, var185.field3572, 0);
                    } catch (IOException var279) {
                    }
                }
                try {
                    var184.method496(-32307);
                    return;
                } catch (Exception var278) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field3247[--field3235];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class193.field3258.field7253 = var186;
                class505.method3010(-96);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6002) {
                class193.field3258.method943(field3247[--field3235] == 1, false);
                class505.method3010(-73);
                class211.method1465(true);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6003) {
                class193.field3258.field7242 = field3247[--field3235] == 1;
                class211.method1465(true);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6005) {
                class193.field3258.field7224 = field3247[--field3235] == 1;
                class505.method3010(-113);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6006) {
                class193.field3258.field7216 = field3247[--field3235] == 1;
                class377.field5692.method289(!class193.field3258.field7216);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6007) {
                class193.field3258.field7219 = field3247[--field3235];
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6008) {
                class193.field3258.field7215 = field3247[--field3235] == 1;
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6009) {
                class193.field3258.field7220 = field3247[--field3235] == 1;
                class505.method3010(-60);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6010) {
                class193.field3258.field7241 = field3247[--field3235] == 1;
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field3247[--field3235];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class193.field3258.method2982(class96.field1384, (byte) 99, var187);
                class505.method3010(-62);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6012) {
                class193.field3258.method2983(-49, field3247[--field3235] == 1, class96.field1384);
                class191.method1342(113);
                class245.method1666(0);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6014) {
                class193.field3258.field7245 = field3247[--field3235] == 1;
                class505.method3010(-106);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6015) {
                class193.field3258.field7237 = field3247[--field3235] == 1;
                class505.method3010(-72);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field3247[--field3235];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class193.field3258.field7248 = var188;
                class185.method1229((byte) -52, class96.field1384);
                class193.field3258.method933((byte) 78, class360.field5349);
                return;
            }
            if (arg0 == 6017) {
                class193.field3258.field7246 = field3247[--field3235] == 1;
                class36.method246(116);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field3247[--field3235];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class193.field3258.field7251 = var189;
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field3247[--field3235];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class193.field3258.field7249 != var190) {
                    if (class193.field3258.field7249 == 0 && class491.field7055 != -1) {
                        class519.method3084(class313.field4720, -20096, false, 0, var190, class491.field7055);
                        class459.field6673 = false;
                    } else if (var190 == 0) {
                        class314.method2011((byte) -54);
                        class459.field6673 = false;
                    } else {
                        class373.method2336(var190, (byte) -3);
                    }
                    class193.field3258.field7249 = var190;
                }
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field3247[--field3235];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class193.field3258.field7218 = var191;
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6021) {
                class193.field3258.field1869 = field3247[--field3235] == 1;
                class211.method1465(true);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field3247[--field3235];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class494.field7129 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class24.method178(var192, 111);
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                field3247[field3235++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field3247[--field3235];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class193.field3258.field7217 = var194;
                class193.field3258.method933((byte) 78, class360.field5349);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field3247[--field3235];
                if (var195 < 0 || var195 > class271.method1795(class494.field7129, 3)) {
                    var195 = 0;
                }
                class193.field3258.field7235 = var195;
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field3247[--field3235];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class224.method1597(var196 == 1, 95);
                return;
            }
            if (arg0 == 6028) {
                class193.field3258.field7250 = field3247[--field3235] != 0;
                class193.field3258.method933((byte) 78, class360.field5349);
                return;
            }
            if (arg0 == 6029) {
                class193.field3258.field7219 = field3247[--field3235];
                class193.field3258.method933((byte) 78, class360.field5349);
                return;
            }
            if (arg0 == 6030) {
                class193.field3258.field7227 = field3247[--field3235] != 0;
                class193.field3258.method933((byte) 78, class360.field5349);
                class505.method3010(-66);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field3247[--field3235];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class185.method1229((byte) -90, var197);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field3247[--field3235];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class193.field3258.field7230 = var198;
                class193.field3258.method933((byte) 78, class360.field5349);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field3247[--field3235];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class193.field3258.field7243 = var199;
                class193.field3258.method933((byte) 78, class360.field5349);
                return;
            }
            if (arg0 == 6034) {
                class193.field3258.field7226 = field3247[--field3235] == 1;
                class193.field3258.method933((byte) 78, class360.field5349);
                class191.method1342(104);
                class360.field5348 = false;
                return;
            }
            if (arg0 == 6035) {
                class193.field3258.field1877 = field3247[--field3235] == 1;
                class505.method3010(-71);
                class211.method1465(true);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field3247[field3235++] = class193.field3258.field7253;
                return;
            }
            if (arg0 == 6102) {
                field3247[field3235++] = class193.field3258.method942(class96.field1384, 5800) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field3247[field3235++] = class193.field3258.field7242 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field3247[field3235++] = class193.field3258.field7224 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field3247[field3235++] = class193.field3258.field7216 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field3247[field3235++] = class193.field3258.field7219;
                return;
            }
            if (arg0 == 6108) {
                field3247[field3235++] = class193.field3258.field7215 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field3247[field3235++] = class193.field3258.field7220 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field3247[field3235++] = class193.field3258.field7241 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field3247[field3235++] = class193.field3258.method2986(28721, class96.field1384);
                return;
            }
            if (arg0 == 6112) {
                field3247[field3235++] = class193.field3258.method2987(false, class96.field1384) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field3247[field3235++] = class193.field3258.field7245 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field3247[field3235++] = class193.field3258.field7237 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field3247[field3235++] = class193.field3258.field7248;
                return;
            }
            if (arg0 == 6117) {
                field3247[field3235++] = class193.field3258.field7246 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field3247[field3235++] = class193.field3258.field7251;
                return;
            }
            if (arg0 == 6119) {
                field3247[field3235++] = class193.field3258.field7249;
                return;
            }
            if (arg0 == 6120) {
                field3247[field3235++] = class193.field3258.field7218;
                return;
            }
            if (arg0 == 6121) {
                field3247[field3235++] = class377.field5692.method295() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field3247[field3235++] = class384.method2399((byte) -102);
                return;
            }
            if (arg0 == 6124) {
                field3247[field3235++] = class193.field3258.field7217;
                return;
            }
            if (arg0 == 6125) {
                field3247[field3235++] = class193.field3258.field7235;
                return;
            }
            if (arg0 == 6126) {
                field3247[field3235++] = class377.field5692.method355() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field3247[field3235++] = class193.field3258.field7228 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field3247[field3235++] = class193.field3258.field7250 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field3247[field3235++] = class193.field3258.field7219;
                return;
            }
            if (arg0 == 6130) {
                field3247[field3235++] = class193.field3258.field7227 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field3247[field3235++] = class96.field1384;
                return;
            }
            if (arg0 == 6132) {
                field3247[field3235++] = class193.field3258.field7230;
                return;
            }
            if (arg0 == 6133) {
                field3247[field3235++] = class352.field5196 == 1 || class352.field5196 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field3247[field3235++] = class271.method1795(class494.field7129, 3);
                return;
            }
            if (arg0 == 6135) {
                field3247[field3235++] = class193.field3258.field7243;
                return;
            }
            if (arg0 == 6136) {
                field3247[field3235++] = class193.field3258.field7226 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var280) {
                }
                field3247[field3235++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field3235 -= 2;
                class387.field5815 = (short) field3247[field3235];
                if (class387.field5815 <= 0) {
                    class387.field5815 = 256;
                }
                class255.field3913 = (short) field3247[field3235 + 1];
                if (class255.field3913 <= 0) {
                    class255.field3913 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field3235 -= 2;
                class528.field7697 = (short) field3247[field3235];
                if (class528.field7697 <= 0) {
                    class528.field7697 = 256;
                }
                class68.field887 = (short) field3247[field3235 + 1];
                if (class68.field887 <= 0) {
                    class68.field887 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field3235 -= 4;
                class374.field5587 = (short) field3247[field3235];
                if (class374.field5587 <= 0) {
                    class374.field5587 = 1;
                }
                class102.field1475 = (short) field3247[field3235 + 1];
                if (class102.field1475 <= 0) {
                    class102.field1475 = 32767;
                } else if (class102.field1475 < class374.field5587) {
                    class102.field1475 = class374.field5587;
                }
                class283.field4305 = (short) field3247[field3235 + 2];
                if (class283.field4305 <= 0) {
                    class283.field4305 = 1;
                }
                class135.field2066 = (short) field3247[field3235 + 3];
                if (class135.field2066 <= 0) {
                    class135.field2066 = 32767;
                    return;
                }
                if (class135.field2066 < class283.field4305) {
                    class135.field2066 = class283.field4305;
                }
                return;
            }
            if (arg0 == 6203) {
                class491.method2918(0, false, class474.field6836.field1642, (byte) -94, 0, class474.field6836.field1627);
                field3247[field3235++] = class336.field5003;
                field3247[field3235++] = class272.field4164;
                return;
            }
            if (arg0 == 6204) {
                field3247[field3235++] = class528.field7697;
                field3247[field3235++] = class68.field887;
                return;
            }
            if (arg0 == 6205) {
                field3247[field3235++] = class387.field5815;
                field3247[field3235++] = class255.field3913;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field3247[field3235++] = (int) (class493.method2937(-99) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field3247[field3235++] = (int) (class493.method2937(-108) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field3235 -= 3;
                int var201 = field3247[field3235];
                int var202 = field3247[field3235 + 1];
                int var203 = field3247[field3235 + 2];
                field3233.clear();
                field3233.set(11, 12);
                field3233.set(var203, var202, var201);
                field3247[field3235++] = (int) (field3233.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field3233.clear();
                field3233.setTime(new Date(class493.method2937(-62)));
                field3247[field3235++] = field3233.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var204 = field3247[--field3235];
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
                field3247[field3235++] = var205 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field3247[field3235++] = class374.method2353(65535) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field3247[field3235++] = class133.method973(0) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class429.field6373 == 6 && class500.field7185 == 0 && class197.field3291 == 0) {
                    if (class327.field4926) {
                        field3247[field3235++] = 0;
                        return;
                    }
                    if (class5.field48 > class493.method2937(-66) - 1000L) {
                        field3247[field3235++] = 1;
                        return;
                    }
                    class327.field4926 = true;
                    class74.method640(-29627, class156.field2342);
                    class71.field1020.method1566(true, class93.field1317);
                    field3247[field3235++] = 0;
                    return;
                }
                field3247[field3235++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class445 var206 = class334.method2114(true);
                if (var206 != null) {
                    field3247[field3235++] = var206.field6531;
                    field3247[field3235++] = var206.field4339;
                    field3229[field3237++] = var206.field6532;
                    class89 var207 = var206.method2733(-1);
                    field3247[field3235++] = var207.field1271;
                    field3229[field3237++] = var207.field1272;
                    field3247[field3235++] = var206.field4343;
                    field3247[field3235++] = var206.field6537;
                    field3229[field3237++] = var206.field6535;
                    return;
                }
                field3247[field3235++] = -1;
                field3247[field3235++] = 0;
                field3229[field3237++] = "";
                field3247[field3235++] = 0;
                field3229[field3237++] = "";
                field3247[field3235++] = 0;
                field3247[field3235++] = 0;
                field3229[field3237++] = "";
                return;
            }
            if (arg0 == 6502) {
                class445 var208 = class183.method1218(-127);
                if (var208 != null) {
                    field3247[field3235++] = var208.field6531;
                    field3247[field3235++] = var208.field4339;
                    field3229[field3237++] = var208.field6532;
                    class89 var209 = var208.method2733(-1);
                    field3247[field3235++] = var209.field1271;
                    field3229[field3237++] = var209.field1272;
                    field3247[field3235++] = var208.field4343;
                    field3247[field3235++] = var208.field6537;
                    field3229[field3237++] = var208.field6535;
                    return;
                }
                field3247[field3235++] = -1;
                field3247[field3235++] = 0;
                field3229[field3237++] = "";
                field3247[field3235++] = 0;
                field3229[field3237++] = "";
                field3247[field3235++] = 0;
                field3247[field3235++] = 0;
                field3229[field3237++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var210 = field3247[--field3235];
                String var211 = field3229[--field3237];
                if (class429.field6373 == 6 && class500.field7185 == 0 && class197.field3291 == 0) {
                    field3247[field3235++] = class145.method1030(-1008, var211, var210) ? 1 : 0;
                    return;
                }
                field3247[field3235++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class193.field3258.field7234 = field3247[--field3235];
                class193.field3258.method933((byte) 78, class360.field5349);
                return;
            }
            if (arg0 == 6505) {
                field3247[field3235++] = class193.field3258.field7234;
                return;
            }
            if (arg0 == 6506) {
                int var212 = field3247[--field3235];
                class445 var213 = class160.method1093((byte) -106, var212);
                if (var213 != null) {
                    field3247[field3235++] = var213.field4339;
                    field3229[field3237++] = var213.field6532;
                    class89 var214 = var213.method2733(-1);
                    field3247[field3235++] = var214.field1271;
                    field3229[field3237++] = var214.field1272;
                    field3247[field3235++] = var213.field4343;
                    field3247[field3235++] = var213.field6537;
                    field3229[field3237++] = var213.field6535;
                    return;
                }
                field3247[field3235++] = -1;
                field3229[field3237++] = "";
                field3247[field3235++] = 0;
                field3229[field3237++] = "";
                field3247[field3235++] = 0;
                field3247[field3235++] = 0;
                field3229[field3237++] = "";
                return;
            }
            if (arg0 == 6507) {
                field3235 -= 4;
                int var215 = field3247[field3235];
                boolean var216 = field3247[field3235 + 1] == 1;
                int var217 = field3247[field3235 + 2];
                boolean var218 = field3247[field3235 + 3] == 1;
                class341.method2146(var216, var218, var217, var215, 10316);
                return;
            }
            if (arg0 == 6508) {
                class310.method1983((byte) -128);
                return;
            }
            if (arg0 == 6509) {
                if (class429.field6373 != 6) {
                    return;
                }
                class450.field6572 = field3247[--field3235] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class193.field3258.field7239 = field3247[--field3235] == 1;
                class193.field3258.method933((byte) 78, class360.field5349);
                return;
            }
            if (arg0 == 6601) {
                field3247[field3235++] = class193.field3258.field7239 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class68.field873 == class146.field2227) {
            if (arg0 == 6700) {
                int var219 = class70.field993.method2593(0);
                if (class155.field2310 != -1) {
                    var219++;
                }
                field3247[field3235++] = var219;
                return;
            }
            if (arg0 == 6701) {
                int var220 = field3247[--field3235];
                if (class155.field2310 != -1) {
                    if (var220 == 0) {
                        field3247[field3235++] = class155.field2310;
                        return;
                    }
                    var220--;
                }
                class293 var221 = (class293) class70.field993.method2592(120);
                while (var220-- > 0) {
                    var221 = (class293) class70.field993.method2589(-1);
                }
                field3247[field3235++] = var221.field4454;
                return;
            }
            if (arg0 == 6702) {
                int var222 = field3247[--field3235];
                if (class200.field3326[var222] == null) {
                    field3229[field3237++] = "";
                    return;
                }
                String var223 = class200.field3326[var222][0].field1721;
                if (var223 == null) {
                    field3229[field3237++] = "";
                    return;
                }
                field3229[field3237++] = var223.substring(0, var223.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var224 = field3247[--field3235];
                if (class200.field3326[var224] == null) {
                    field3247[field3235++] = 0;
                    return;
                }
                field3247[field3235++] = class200.field3326[var224].length;
                return;
            }
            if (arg0 == 6704) {
                field3235 -= 2;
                int var225 = field3247[field3235];
                int var226 = field3247[field3235 + 1];
                if (class200.field3326[var225] == null) {
                    field3229[field3237++] = "";
                    return;
                }
                String var227 = class200.field3326[var225][var226].field1721;
                if (var227 == null) {
                    field3229[field3237++] = "";
                    return;
                }
                field3229[field3237++] = var227;
                return;
            }
            if (arg0 == 6705) {
                field3235 -= 2;
                int var228 = field3247[field3235];
                int var229 = field3247[field3235 + 1];
                if (class200.field3326[var228] == null) {
                    field3247[field3235++] = 0;
                    return;
                }
                field3247[field3235++] = class200.field3326[var228][var229].field1633;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field3235 -= 3;
                int var230 = field3247[field3235];
                int var231 = field3247[field3235 + 1];
                int var232 = field3247[field3235 + 2];
                class385.method2405(var230 << 16 | var231, "", (byte) -31, var232, 1);
                return;
            }
            if (arg0 == 6708) {
                field3235 -= 3;
                int var233 = field3247[field3235];
                int var234 = field3247[field3235 + 1];
                int var235 = field3247[field3235 + 2];
                class385.method2405(var233 << 16 | var234, "", (byte) -31, var235, 2);
                return;
            }
            if (arg0 == 6709) {
                field3235 -= 3;
                int var236 = field3247[field3235];
                int var237 = field3247[field3235 + 1];
                int var238 = field3247[field3235 + 2];
                class385.method2405(var236 << 16 | var237, "", (byte) -31, var238, 3);
                return;
            }
            if (arg0 == 6710) {
                field3235 -= 3;
                int var239 = field3247[field3235];
                int var240 = field3247[field3235 + 1];
                int var241 = field3247[field3235 + 2];
                class385.method2405(var239 << 16 | var240, "", (byte) -31, var241, 4);
                return;
            }
            if (arg0 == 6711) {
                field3235 -= 3;
                int var242 = field3247[field3235];
                int var243 = field3247[field3235 + 1];
                int var244 = field3247[field3235 + 2];
                class385.method2405(var242 << 16 | var243, "", (byte) -31, var244, 5);
                return;
            }
            if (arg0 == 6712) {
                field3235 -= 3;
                int var245 = field3247[field3235];
                int var246 = field3247[field3235 + 1];
                int var247 = field3247[field3235 + 2];
                class385.method2405(var245 << 16 | var246, "", (byte) -31, var247, 6);
                return;
            }
            if (arg0 == 6713) {
                field3235 -= 3;
                int var248 = field3247[field3235];
                int var249 = field3247[field3235 + 1];
                int var250 = field3247[field3235 + 2];
                class385.method2405(var248 << 16 | var249, "", (byte) -31, var250, 7);
                return;
            }
            if (arg0 == 6714) {
                field3235 -= 3;
                int var251 = field3247[field3235];
                int var252 = field3247[field3235 + 1];
                int var253 = field3247[field3235 + 2];
                class385.method2405(var251 << 16 | var252, "", (byte) -31, var253, 8);
                return;
            }
            if (arg0 == 6715) {
                field3235 -= 3;
                int var254 = field3247[field3235];
                int var255 = field3247[field3235 + 1];
                int var256 = field3247[field3235 + 2];
                class385.method2405(var254 << 16 | var255, "", (byte) -31, var256, 9);
                return;
            }
            if (arg0 == 6716) {
                field3235 -= 3;
                int var257 = field3247[field3235];
                int var258 = field3247[field3235 + 1];
                int var259 = field3247[field3235 + 2];
                class385.method2405(var257 << 16 | var258, "", (byte) -31, var259, 10);
                return;
            }
            if (arg0 == 6717) {
                field3235 -= 3;
                int var260 = field3247[field3235];
                int var261 = field3247[field3235 + 1];
                int var262 = field3247[field3235 + 2];
                class114 var263 = class181.method1210(var262, -2, var260 << 16 | var261);
                class329.method2090(-1);
                class386 var264 = client.method1387(var263);
                class520.method3101(var263, var264.field5802, -86, var264.method2410(-16758));
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var265 = field3247[--field3235];
                class519 var266 = class107.field1502.method3071(-122, var265);
                if (var266.field7576 == null) {
                    field3229[field3237++] = "";
                    return;
                }
                field3229[field3237++] = var266.field7576;
                return;
            }
            if (arg0 == 6801) {
                int var267 = field3247[--field3235];
                class519 var268 = class107.field1502.method3071(-126, var267);
                field3247[field3235++] = var268.field7581;
                return;
            }
            if (arg0 == 6802) {
                int var269 = field3247[--field3235];
                class519 var270 = class107.field1502.method3071(-106, var269);
                field3247[field3235++] = var270.field7599;
                return;
            }
            if (arg0 == 6803) {
                int var271 = field3247[--field3235];
                class519 var272 = class107.field1502.method3071(-123, var271);
                field3247[field3235++] = var272.field7562;
                return;
            }
            if (arg0 == 6804) {
                field3235 -= 2;
                int var273 = field3247[field3235];
                int var274 = field3247[field3235 + 1];
                class260 var275 = class474.field6839.method3057(var274, (byte) 115);
                if (var275.method1738(-82)) {
                    field3229[field3237++] = class107.field1502.method3071(-120, var273).method3078(var274, (byte) 77, var275.field3990);
                    return;
                }
                field3247[field3235++] = class107.field1502.method3071(-116, var273).method3079(-14299, var274, var275.field3981);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field3247[field3235++] = class363.field5366 && !class382.field5751 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field3247[field3235++] = class480.field6914;
                return;
            }
            if (arg0 == 6902) {
                field3247[field3235++] = class298.field4535;
                return;
            }
            if (arg0 == 6903) {
                field3247[field3235++] = class238.field3821;
                return;
            }
            if (arg0 == 6904) {
                field3247[field3235++] = class371.field5532;
                return;
            }
            if (arg0 == 6905) {
                String var276 = "";
                if (class514.field7471 != null) {
                    if (class514.field7471.field6569 == null) {
                        var276 = class329.method2085((byte) -122, class514.field7471.field6565);
                    } else {
                        var276 = (String) class514.field7471.field6569;
                    }
                }
                field3229[field3237++] = var276;
                return;
            }
            if (arg0 == 6906) {
                field3247[field3235++] = class157.field2378;
                return;
            }
            if (arg0 == 6907) {
                field3247[field3235++] = class393.field5872;
                return;
            }
            if (arg0 == 6908) {
                field3247[field3235++] = class237.field3809;
                return;
            }
            if (arg0 == 6909) {
                field3247[field3235++] = class4.field31 ? 1 : 0;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
    public static void method1347() {
        field3249 = null;
        field3242 = null;
        field3245 = null;
        field3246 = null;
        field3247 = null;
        field3229 = null;
        field3230 = null;
        field3234 = null;
        field3252 = null;
        field3251 = null;
        field3233 = null;
        field3256 = null;
        field3254 = null;
        field3255 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method1348(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field3233.setTime(new Date(var1));
        int var3 = field3233.get(5);
        int var4 = field3233.get(2);
        int var5 = field3233.get(1);
        return var3 + "-" + field3256[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lrg;I)V")
    private static final void method1349(class457 arg0, int arg1) {
        field3235 = 0;
        field3237 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6651;
        int[] var4 = arg0.field6647;
        byte var5 = -1;
        field3236 = 0;
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
                        method1344(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1346(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field3247[field3235++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field3247[field3235++] = class195.field3271.field5029[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class195.field3271.method2130(field3247[--field3235], var8, (byte) -55);
                } else if (var43 == 3) {
                    field3229[field3237++] = arg0.field6648[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field3235 -= 2;
                    if (field3247[field3235 + 1] != field3247[field3235]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field3235 -= 2;
                    if (field3247[field3235 + 1] == field3247[field3235]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field3235 -= 2;
                    if (field3247[field3235] < field3247[field3235 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field3235 -= 2;
                    if (field3247[field3235] > field3247[field3235 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field3236 == 0) {
                        return;
                    }
                    class25 var9 = field3230[--field3236];
                    arg0 = var9.field312;
                    var3 = arg0.field6651;
                    var4 = arg0.field6647;
                    var2 = var9.field309;
                    field3249 = var9.field308;
                    field3242 = var9.field310;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field3247[field3235++] = class195.field3271.method925(var10, false);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class195.field3271.method2133(field3247[--field3235], 0, var11);
                } else if (var43 == 31) {
                    field3235 -= 2;
                    if (field3247[field3235] <= field3247[field3235 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field3235 -= 2;
                    if (field3247[field3235] >= field3247[field3235 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field3247[field3235++] = field3249[var4[var2]];
                } else if (var43 == 34) {
                    field3249[var4[var2]] = field3247[--field3235];
                } else if (var43 == 35) {
                    field3229[field3237++] = field3242[var4[var2]];
                } else if (var43 == 36) {
                    field3242[var4[var2]] = field3229[--field3237];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field3237 -= var12;
                    String var13 = class374.method2349(field3229, field3237, false, var12);
                    field3229[field3237++] = var13;
                } else if (var43 == 38) {
                    field3235--;
                } else if (var43 == 39) {
                    field3237--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class457 var15 = class531.method3144(var14, 0);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6654];
                    String[] var17 = new String[var15.field6645];
                    for (int var18 = 0; var18 < var15.field6658; var18++) {
                        var16[var18] = field3247[field3235 + var18 - var15.field6658];
                    }
                    for (int var19 = 0; var19 < var15.field6657; var19++) {
                        var17[var19] = field3229[field3237 + var19 - var15.field6657];
                    }
                    field3235 -= var15.field6658;
                    field3237 -= var15.field6657;
                    class25 var20 = new class25();
                    var20.field312 = arg0;
                    var20.field309 = var2;
                    var20.field308 = field3249;
                    var20.field310 = field3242;
                    if (field3236 >= field3230.length) {
                        throw new RuntimeException();
                    }
                    field3230[field3236++] = var20;
                    arg0 = var15;
                    var3 = var15.field6651;
                    var4 = var15.field6647;
                    var2 = -1;
                    field3249 = var16;
                    field3242 = var17;
                } else if (var43 == 42) {
                    field3247[field3235++] = class505.field7385[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class505.field7385[var21] = field3247[--field3235];
                    class419.method2622(var21, -10037);
                    class73.field1045 |= class256.field3922[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field3247[--field3235];
                    if (var24 >= 0 && var24 <= 5000) {
                        field3245[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field3246[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field3247[--field3235];
                    if (var28 < 0 || var28 >= field3245[var27]) {
                        throw new RuntimeException();
                    }
                    field3247[field3235++] = field3246[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field3235 -= 2;
                    int var30 = field3247[field3235];
                    if (var30 < 0 || var30 >= field3245[var29]) {
                        throw new RuntimeException();
                    }
                    field3246[var29][var30] = field3247[field3235 + 1];
                } else if (var43 == 47) {
                    String var31 = class521.field7625[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field3229[field3237++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class521.field7625[var32] = field3229[--field3237];
                    class519.method3080(var32, (byte) -38);
                } else if (var43 == 51) {
                    class412 var33 = arg0.field6650[var4[var2]];
                    class308 var34 = (class308) var33.method2585((byte) 114, (long) field3247[--field3235]);
                    if (var34 != null) {
                        var2 += var34.field4638;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field6652 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6388).append(" ");
                for (int var41 = field3236 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field3230[var41].field312.field6388).append(" ");
                }
                var40.append("op: ").append(var5);
                class88.method727(var42, 114, var40.toString());
            } else {
                class358.method2249(0, "Clientscript error in: " + arg0.field6652);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6652).append("\n");
                for (int var38 = field3236 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field3230[var38].field312.field6652).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class88.method727(var42, -124, var37.toString());
                class6.method33((byte) 15, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    private static final void method1350(int arg0) {
        class114 var1 = class475.method2864(true, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class114[] var3 = class283.field4301[var2];
        if (var3 == null) {
            class114[] var4 = class200.field3326[var2];
            int var5 = var4.length;
            var3 = class283.field4301[var2] = new class114[var5];
            class414.method2599(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class414.method2599(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()V")
    public static final void method1351() {
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public static final void method1352(int arg0) {
        if (arg0 == -1 || !class184.method1223((byte) -66, arg0)) {
            return;
        }
        class114[] var1 = class200.field3326[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class114 var3 = var1[var2];
            if (var3.field1599 != null) {
                class405 var4 = new class405();
                var4.field6004 = var3;
                var4.field6008 = var3.field1599;
                method1354(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)V")
    private static final void method1353(int arg0) {
        class114 var1 = class475.method2864(true, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class114[] var3 = class283.field4301[var2];
        if (var3 == null) {
            class114[] var4 = class200.field3326[var2];
            int var5 = var4.length;
            var3 = class283.field4301[var2] = new class114[var5];
            class414.method2599(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class414.method2599(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lim;I)V")
    private static final void method1354(class405 arg0, int arg1) {
        Object[] var2 = arg0.field6008;
        int var3 = (Integer) var2[0];
        class457 var4 = class531.method3144(var3, 0);
        if (var4 == null) {
            return;
        }
        field3249 = new int[var4.field6654];
        int var5 = 0;
        field3242 = new String[var4.field6645];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5994;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field6007;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field6004 == null ? -1 : arg0.field6004.field1644;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field6000;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field6004 == null ? -1 : arg0.field6004.field1630;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5996 == null ? -1 : arg0.field5996.field1644;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5996 == null ? -1 : arg0.field5996.field1630;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field6003;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5999;
                }
                field3249[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5997;
                }
                field3242[var6++] = var9;
            }
        }
        field3257 = arg0.field6002;
        method1349(var4, arg1);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(IZ)V")
    public static final void method1355(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lim;)V")
    public static final void method1356(class405 arg0) {
        method1354(arg0, 200000);
    }
}
