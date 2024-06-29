import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class94 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[I")
    private static int[] field1668 = new int[1000];

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    private static int field1678 = 0;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[Lfj;")
    private static class449[] field1669 = new class449[50];

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    private static int field1682 = 0;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[[I")
    private static int[][] field1674 = new int[5][5000];

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
    private static int[] field1676 = new int[5];

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    private static int field1681 = 0;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "[Ljava/lang/String;")
    private static String[] field1686 = new String[1000];

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1692 = Calendar.getInstance();

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "[I")
    private static int[] field1693 = new int[3];

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field1694 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "Lrp;")
    public static class288 field1695 = new class288(4);

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    private static int field1696 = 0;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Ltq;")
    private static class427 field1673;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Ltq;")
    private static class427 field1679;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "Llr;")
    private static class508 field1687;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "[I")
    private static int[] field1684;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[Ljava/lang/String;")
    private static String[] field1672;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method694(String arg0, int arg1) {
        if (class193.field3052 == 0 && !(!class396.field5784 || class32.field419) || class75.field1352) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class231.field3510.method2473(0, -100))) {
            var3 = 0;
            arg0 = arg0.substring(class231.field3510.method2473(0, -104).length());
        } else if (var2.startsWith(class119.field1970.method2473(0, -127))) {
            var3 = 1;
            arg0 = arg0.substring(class119.field1970.method2473(0, -88).length());
        } else if (var2.startsWith(class120.field1987.method2473(0, -105))) {
            var3 = 2;
            arg0 = arg0.substring(class120.field1987.method2473(0, -118).length());
        } else if (var2.startsWith(class290.field4401.method2473(0, -126))) {
            var3 = 3;
            arg0 = arg0.substring(class290.field4401.method2473(0, -81).length());
        } else if (var2.startsWith(class388.field5612.method2473(0, -107))) {
            var3 = 4;
            arg0 = arg0.substring(class388.field5612.method2473(0, -97).length());
        } else if (var2.startsWith(class442.field6655.method2473(0, -121))) {
            var3 = 5;
            arg0 = arg0.substring(class442.field6655.method2473(0, -121).length());
        } else if (var2.startsWith(class287.field4351.method2473(0, -94))) {
            var3 = 6;
            arg0 = arg0.substring(class287.field4351.method2473(0, -124).length());
        } else if (var2.startsWith(class103.field1827.method2473(0, -81))) {
            var3 = 7;
            arg0 = arg0.substring(class103.field1827.method2473(0, -90).length());
        } else if (var2.startsWith(class27.field349.method2473(0, -81))) {
            var3 = 8;
            arg0 = arg0.substring(class27.field349.method2473(0, -91).length());
        } else if (var2.startsWith(class378.field5513.method2473(0, -125))) {
            var3 = 9;
            arg0 = arg0.substring(class378.field5513.method2473(0, -93).length());
        } else if (var2.startsWith(class446.field6865.method2473(0, -74))) {
            var3 = 10;
            arg0 = arg0.substring(class446.field6865.method2473(0, -79).length());
        } else if (var2.startsWith(class349.field5146.method2473(0, -120))) {
            var3 = 11;
            arg0 = arg0.substring(class349.field5146.method2473(0, -114).length());
        } else if (class406.field5898 != 0) {
            if (var2.startsWith(class231.field3510.method2473(class406.field5898, -95))) {
                var3 = 0;
                arg0 = arg0.substring(class231.field3510.method2473(class406.field5898, -126).length());
            } else if (var2.startsWith(class119.field1970.method2473(class406.field5898, -111))) {
                var3 = 1;
                arg0 = arg0.substring(class119.field1970.method2473(class406.field5898, -127).length());
            } else if (var2.startsWith(class120.field1987.method2473(class406.field5898, -97))) {
                var3 = 2;
                arg0 = arg0.substring(class120.field1987.method2473(class406.field5898, -74).length());
            } else if (var2.startsWith(class290.field4401.method2473(class406.field5898, -82))) {
                var3 = 3;
                arg0 = arg0.substring(class290.field4401.method2473(class406.field5898, -89).length());
            } else if (var2.startsWith(class388.field5612.method2473(class406.field5898, -123))) {
                var3 = 4;
                arg0 = arg0.substring(class388.field5612.method2473(class406.field5898, -98).length());
            } else if (var2.startsWith(class442.field6655.method2473(class406.field5898, -75))) {
                var3 = 5;
                arg0 = arg0.substring(class442.field6655.method2473(class406.field5898, -85).length());
            } else if (var2.startsWith(class287.field4351.method2473(class406.field5898, -97))) {
                var3 = 6;
                arg0 = arg0.substring(class287.field4351.method2473(class406.field5898, -111).length());
            } else if (var2.startsWith(class103.field1827.method2473(class406.field5898, -81))) {
                var3 = 7;
                arg0 = arg0.substring(class103.field1827.method2473(class406.field5898, -118).length());
            } else if (var2.startsWith(class27.field349.method2473(class406.field5898, -102))) {
                var3 = 8;
                arg0 = arg0.substring(class27.field349.method2473(class406.field5898, -106).length());
            } else if (var2.startsWith(class378.field5513.method2473(class406.field5898, -102))) {
                var3 = 9;
                arg0 = arg0.substring(class378.field5513.method2473(class406.field5898, -81).length());
            } else if (var2.startsWith(class446.field6865.method2473(class406.field5898, -114))) {
                var3 = 10;
                arg0 = arg0.substring(class446.field6865.method2473(class406.field5898, -84).length());
            } else if (var2.startsWith(class349.field5146.method2473(class406.field5898, -92))) {
                var3 = 11;
                arg0 = arg0.substring(class349.field5146.method2473(class406.field5898, -110).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class265.field4010.method2473(0, -91))) {
            var5 = 1;
            arg0 = arg0.substring(class265.field4010.method2473(0, -80).length());
        } else if (var4.startsWith(class52.field796.method2473(0, -126))) {
            var5 = 2;
            arg0 = arg0.substring(class52.field796.method2473(0, -124).length());
        } else if (var4.startsWith(class102.field1819.method2473(0, -93))) {
            var5 = 3;
            arg0 = arg0.substring(class102.field1819.method2473(0, -115).length());
        } else if (var4.startsWith(class190.field3035.method2473(0, -78))) {
            var5 = 4;
            arg0 = arg0.substring(class190.field3035.method2473(0, -112).length());
        } else if (var4.startsWith(class435.field6373.method2473(0, -94))) {
            var5 = 5;
            arg0 = arg0.substring(class435.field6373.method2473(0, -113).length());
        } else if (class406.field5898 != 0) {
            if (var4.startsWith(class265.field4010.method2473(class406.field5898, -99))) {
                var5 = 1;
                arg0 = arg0.substring(class265.field4010.method2473(class406.field5898, -126).length());
            } else if (var4.startsWith(class52.field796.method2473(class406.field5898, -127))) {
                var5 = 2;
                arg0 = arg0.substring(class52.field796.method2473(class406.field5898, -107).length());
            } else if (var4.startsWith(class102.field1819.method2473(class406.field5898, -99))) {
                var5 = 3;
                arg0 = arg0.substring(class102.field1819.method2473(class406.field5898, -116).length());
            } else if (var4.startsWith(class190.field3035.method2473(class406.field5898, -74))) {
                var5 = 4;
                arg0 = arg0.substring(class190.field3035.method2473(class406.field5898, -77).length());
            } else if (var4.startsWith(class435.field6373.method2473(class406.field5898, -87))) {
                var5 = 5;
                arg0 = arg0.substring(class435.field6373.method2473(class406.field5898, -124).length());
            }
        }
        field1688++;
        class400.method2379((byte) -75, class56.field911);
        class230.field3508.method221(-1, 0);
        int var6 = class230.field3508.field585;
        if (arg1 == 5021) {
            class230.field3508.method221(-1, 1);
        } else if (arg1 == 5022) {
            class230.field3508.method221(-1, 2);
        } else {
            class230.field3508.method221(-1, 0);
        }
        class230.field3508.method221(-1, var3);
        class230.field3508.method221(-1, var5);
        class30.method157(-77, class230.field3508, arg0);
        class230.field3508.method264(10807, class230.field3508.field585 - var6);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    private static final void method695(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field1681 -= 3;
                int var2 = field1668[field1681];
                int var3 = field1668[field1681 + 1];
                int var4 = field1668[field1681 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class427 var5 = class413.method2435(160291920, var2);
                if (var5.field6193 == null) {
                    var5.field6193 = new class427[var4 + 1];
                }
                if (var5.field6193.length <= var4) {
                    class427[] var6 = new class427[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6193.length; var7++) {
                        var6[var7] = var5.field6193[var7];
                    }
                    var5.field6193 = var6;
                }
                if (var4 > 0 && var5.field6193[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class427 var8 = new class427();
                var8.field6197 = var3;
                var8.field6253 = var8.field6157 = var5.field6157;
                var8.field6265 = var4;
                var5.field6193[var4] = var8;
                if (arg1) {
                    field1679 = var8;
                } else {
                    field1673 = var8;
                }
                class288.method1754(var5, 0);
                return;
            }
            if (arg0 == 101) {
                class427 var9 = arg1 ? field1679 : field1673;
                if (var9.field6265 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class427 var10 = class413.method2435(160291920, var9.field6157);
                var10.field6193[var9.field6265] = null;
                class288.method1754(var10, 0);
                return;
            }
            if (arg0 == 102) {
                class427 var11 = class413.method2435(160291920, field1668[--field1681]);
                var11.field6193 = null;
                class288.method1754(var11, 0);
                return;
            }
            if (arg0 == 200) {
                field1681 -= 2;
                int var12 = field1668[field1681];
                int var13 = field1668[field1681 + 1];
                class427 var14 = class59.method419(var13, 12782, var12);
                if (var14 != null && var13 != -1) {
                    field1668[field1681++] = 1;
                    if (arg1) {
                        field1679 = var14;
                        return;
                    }
                    field1673 = var14;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1668[--field1681];
                class427 var16 = class413.method2435(160291920, var15);
                if (var16 != null) {
                    field1668[field1681++] = 1;
                    if (arg1) {
                        field1679 = var16;
                        return;
                    }
                    field1673 = var16;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1668[--field1681];
                method697(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1668[--field1681];
                method696(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field1681 -= 2;
                int var19 = field1668[field1681];
                int var20 = field1668[field1681 + 1];
                for (int var21 = 0; var21 < class33.field454.length; var21++) {
                    if (class33.field454[var21] == var19) {
                        class286.field4329.field696.method2008(var20, var21, class56.field933, Integer.MIN_VALUE);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class457.field7007.length; var22++) {
                    if (class457.field7007[var22] == var19) {
                        class286.field4329.field696.method2008(var20, var22, class56.field933, Integer.MIN_VALUE);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field1681 -= 2;
                int var23 = field1668[field1681];
                int var24 = field1668[field1681 + 1];
                class286.field4329.field696.method2009(var24, 16384, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1668[--field1681] != 0;
                class286.field4329.field696.method2003(Integer.MIN_VALUE, var25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class427 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class413.method2435(160291920, field1668[--field1681]);
            } else {
                var26 = arg1 ? field1679 : field1673;
            }
            if (arg0 == 1000) {
                field1681 -= 4;
                var26.field6207 = field1668[field1681];
                var26.field6263 = field1668[field1681 + 1];
                int var27 = field1668[field1681 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field1668[field1681 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field6205 = (byte) var27;
                var26.field6215 = (byte) var28;
                class288.method1754(var26, 0);
                class255.method1532(var26, -8);
                if (var26.field6265 == -1) {
                    class74.method552(11, var26.field6157);
                }
                return;
            }
            if (arg0 == 1001) {
                field1681 -= 4;
                var26.field6216 = field1668[field1681];
                var26.field6160 = field1668[field1681 + 1];
                var26.field6125 = 0;
                var26.field6133 = 0;
                int var29 = field1668[field1681 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field1668[field1681 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field6260 = (byte) var29;
                var26.field6188 = (byte) var30;
                class288.method1754(var26, 0);
                class255.method1532(var26, -8);
                if (var26.field6197 == 0) {
                    class82.method590(var26, false, true);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field1668[--field1681] == 1;
                if (var26.field6141 != var31) {
                    var26.field6141 = var31;
                    class288.method1754(var26, 0);
                }
                if (var26.field6265 == -1) {
                    class181.method1127(var26.field6157, (byte) 114);
                }
                return;
            }
            if (arg0 == 1004) {
                field1681 -= 2;
                var26.field6276 = field1668[field1681];
                var26.field6200 = field1668[field1681 + 1];
                class288.method1754(var26, 0);
                class255.method1532(var26, -8);
                if (var26.field6197 == 0) {
                    class82.method590(var26, false, true);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field6131 = field1668[--field1681] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class427 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class413.method2435(160291920, field1668[--field1681]);
            } else {
                var32 = arg1 ? field1679 : field1673;
            }
            if (arg0 == 1100) {
                field1681 -= 2;
                var32.field6277 = field1668[field1681];
                if (var32.field6277 > var32.field6164 - var32.field6175) {
                    var32.field6277 = var32.field6164 - var32.field6175;
                }
                if (var32.field6277 < 0) {
                    var32.field6277 = 0;
                }
                var32.field6179 = field1668[field1681 + 1];
                if (var32.field6179 > var32.field6184 - var32.field6126) {
                    var32.field6179 = var32.field6184 - var32.field6126;
                }
                if (var32.field6179 < 0) {
                    var32.field6179 = 0;
                }
                class288.method1754(var32, 0);
                if (var32.field6265 == -1) {
                    class289.method1766((byte) -103, var32.field6157);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field6166 = field1668[--field1681];
                class288.method1754(var32, 0);
                if (var32.field6265 == -1) {
                    class343.method2110(var32.field6157, (byte) 76);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field6138 = field1668[--field1681] == 1;
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1103) {
                var32.field6135 = field1668[--field1681];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1104) {
                var32.field6258 = field1668[--field1681];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field1668[--field1681];
                if (var32.field6211 != var33) {
                    var32.field6211 = var33;
                    class288.method1754(var32, 0);
                }
                if (var32.field6265 == -1) {
                    class233.method1402(false, var32.field6157);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field6206 = field1668[--field1681];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1107) {
                var32.field6154 = field1668[--field1681] == 1;
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1108) {
                var32.field6195 = 1;
                var32.field6161 = field1668[--field1681];
                class288.method1754(var32, 0);
                if (var32.field6265 == -1) {
                    class52.method363(false, var32.field6157);
                }
                return;
            }
            if (arg0 == 1109) {
                field1681 -= 6;
                var32.field6278 = field1668[field1681];
                var32.field6223 = field1668[field1681 + 1];
                var32.field6214 = field1668[field1681 + 2];
                var32.field6201 = field1668[field1681 + 3];
                var32.field6264 = field1668[field1681 + 4];
                var32.field6221 = field1668[field1681 + 5];
                class288.method1754(var32, 0);
                if (var32.field6265 == -1) {
                    class69.method478(var32.field6157, (byte) -47);
                    class246.method1486(false, var32.field6157);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field1668[--field1681];
                if (var32.field6275 != var34) {
                    var32.field6275 = var34;
                    var32.field6217 = 0;
                    var32.field6235 = 1;
                    var32.field6290 = 0;
                    class288.method1754(var32, 0);
                }
                if (var32.field6265 == -1) {
                    class461.method2753(true, var32.field6157);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field6269 = field1668[--field1681] == 1;
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field1686[--field1678];
                if (!var35.equals(var32.field6230)) {
                    var32.field6230 = var35;
                    class288.method1754(var32, 0);
                }
                if (var32.field6265 == -1) {
                    class284.method1730((byte) -57, var32.field6157);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field6247 = field1668[--field1681];
                class288.method1754(var32, 0);
                if (var32.field6265 == -1) {
                    class203.method1257(27602, var32.field6157);
                }
                return;
            }
            if (arg0 == 1114) {
                field1681 -= 3;
                var32.field6162 = field1668[field1681];
                var32.field6202 = field1668[field1681 + 1];
                var32.field6225 = field1668[field1681 + 2];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1115) {
                var32.field6249 = field1668[--field1681] == 1;
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1116) {
                var32.field6255 = field1668[--field1681];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1117) {
                var32.field6151 = field1668[--field1681];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1118) {
                var32.field6261 = field1668[--field1681] == 1;
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1119) {
                var32.field6257 = field1668[--field1681] == 1;
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1120) {
                field1681 -= 2;
                var32.field6164 = field1668[field1681];
                var32.field6184 = field1668[field1681 + 1];
                class288.method1754(var32, 0);
                if (var32.field6197 == 0) {
                    class82.method590(var32, false, true);
                }
                return;
            }
            if (arg0 == 1121) {
                field1681 -= 2;
                var32.field6291 = (short) field1668[field1681];
                var32.field6266 = (short) field1668[field1681 + 1];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1122) {
                var32.field6185 = field1668[--field1681] == 1;
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1123) {
                var32.field6221 = field1668[--field1681];
                class288.method1754(var32, 0);
                if (var32.field6265 == -1) {
                    class69.method478(var32.field6157, (byte) -107);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field1668[--field1681];
                var32.field6236 = var36 == 1;
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1125) {
                field1681 -= 2;
                var32.field6170 = field1668[field1681];
                var32.field6203 = field1668[field1681 + 1];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1126) {
                var32.field6192 = field1668[--field1681];
                class288.method1754(var32, 0);
                return;
            }
            if (arg0 == 1127) {
                field1681 -= 2;
                int var37 = field1668[field1681];
                int var38 = field1668[field1681 + 1];
                class85 var39 = class76.field1364.method1267((byte) 41, var37);
                if (var39.field1423 != var38) {
                    var32.method2510(var37, 124, var38);
                    return;
                }
                var32.method2506(var37, (byte) -126);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field1668[--field1681];
                String var41 = field1686[--field1678];
                class85 var42 = class76.field1364.method1267((byte) 41, var40);
                if (!var42.field1436.equals(var41)) {
                    var32.method2517(var40, var41, 25309);
                    return;
                }
                var32.method2506(var40, (byte) -125);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class427 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class413.method2435(160291920, field1668[--field1681]);
            } else {
                var43 = arg1 ? field1679 : field1673;
            }
            class288.method1754(var43, 0);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field1681 -= 2;
                int var44 = field1668[field1681];
                int var45 = field1668[field1681 + 1];
                if (var43.field6265 == -1) {
                    class269.method1634(var43.field6157, false);
                    class69.method478(var43.field6157, (byte) -67);
                    class246.method1486(false, var43.field6157);
                }
                if (var44 == -1) {
                    var43.field6195 = 1;
                    var43.field6161 = -1;
                    var43.field6274 = -1;
                    return;
                }
                var43.field6274 = var44;
                var43.field6228 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field6149 = true;
                } else {
                    var43.field6149 = false;
                }
                class182 var46 = class288.field4362.method3030((byte) 109, var44);
                var43.field6214 = var46.field2903;
                var43.field6201 = var46.field2905;
                var43.field6264 = var46.field2894;
                var43.field6278 = var46.field2827;
                var43.field6223 = var46.field2867;
                var43.field6221 = var46.field2871;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field6243 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field6243 = 1;
                } else {
                    var43.field6243 = 2;
                }
                if (var43.field6125 > 0) {
                    var43.field6221 = var43.field6221 * 32 / var43.field6125;
                    return;
                }
                if (var43.field6216 > 0) {
                    var43.field6221 = var43.field6221 * 32 / var43.field6216;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field6195 = 2;
                var43.field6161 = field1668[--field1681];
                if (var43.field6265 == -1) {
                    class52.method363(false, var43.field6157);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field6195 = 3;
                var43.field6161 = -1;
                if (var43.field6265 == -1) {
                    class52.method363(false, var43.field6157);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field6195 = 6;
                var43.field6161 = field1668[--field1681];
                if (var43.field6265 == -1) {
                    class52.method363(false, var43.field6157);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field6195 = 5;
                var43.field6161 = field1668[--field1681];
                if (var43.field6265 == -1) {
                    class52.method363(false, var43.field6157);
                }
                return;
            }
            if (arg0 == 1206) {
                field1681 -= 4;
                var43.field6127 = field1668[field1681];
                var43.field6171 = field1668[field1681 + 1];
                var43.field6165 = field1668[field1681 + 2];
                var43.field6234 = field1668[field1681 + 3];
                class288.method1754(var43, 0);
                return;
            }
            if (arg0 == 1207) {
                field1681 -= 2;
                var43.field6176 = field1668[field1681];
                var43.field6180 = field1668[field1681 + 1];
                class288.method1754(var43, 0);
                return;
            }
            if (arg0 == 1210) {
                field1681 -= 4;
                var43.field6161 = field1668[field1681];
                var43.field6134 = field1668[field1681 + 1];
                if (field1668[field1681 + 2] == 1) {
                    var43.field6195 = 9;
                } else {
                    var43.field6195 = 8;
                }
                if (field1668[field1681 + 3] == 1) {
                    var43.field6149 = true;
                } else {
                    var43.field6149 = false;
                }
                if (var43.field6265 == -1) {
                    class52.method363(false, var43.field6157);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field6195 = 5;
                var43.field6161 = class507.field7667;
                var43.field6134 = 0;
                if (var43.field6265 == -1) {
                    class52.method363(false, var43.field6157);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class427 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class413.method2435(160291920, field1668[--field1681]);
                } else {
                    var58 = arg1 ? field1679 : field1673;
                }
                String var59 = field1686[--field1678];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field1668[--field1681];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field1668[--field1681];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field1686[--field1678];
                    } else {
                        var62[var63] = Integer.valueOf(field1668[--field1681]);
                    }
                }
                int var64 = field1668[--field1681];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field6173 = var62;
                } else if (arg0 == 1401) {
                    var58.field6224 = var62;
                } else if (arg0 == 1402) {
                    var58.field6238 = var62;
                } else if (arg0 == 1403) {
                    var58.field6273 = var62;
                } else if (arg0 == 1404) {
                    var58.field6137 = var62;
                } else if (arg0 == 1405) {
                    var58.field6183 = var62;
                } else if (arg0 == 1406) {
                    var58.field6198 = var62;
                } else if (arg0 == 1407) {
                    var58.field6270 = var62;
                    var58.field6189 = var60;
                } else if (arg0 == 1408) {
                    var58.field6139 = var62;
                } else if (arg0 == 1409) {
                    var58.field6226 = var62;
                } else if (arg0 == 1410) {
                    var58.field6231 = var62;
                } else if (arg0 == 1411) {
                    var58.field6252 = var62;
                } else if (arg0 == 1412) {
                    var58.field6208 = var62;
                } else if (arg0 == 1414) {
                    var58.field6251 = var62;
                    var58.field6210 = var60;
                } else if (arg0 == 1415) {
                    var58.field6233 = var62;
                    var58.field6182 = var60;
                } else if (arg0 == 1416) {
                    var58.field6218 = var62;
                } else if (arg0 == 1417) {
                    var58.field6285 = var62;
                } else if (arg0 == 1418) {
                    var58.field6172 = var62;
                } else if (arg0 == 1419) {
                    var58.field6144 = var62;
                } else if (arg0 == 1420) {
                    var58.field6174 = var62;
                } else if (arg0 == 1421) {
                    var58.field6196 = var62;
                } else if (arg0 == 1422) {
                    var58.field6284 = var62;
                } else if (arg0 == 1423) {
                    var58.field6283 = var62;
                } else if (arg0 == 1424) {
                    var58.field6279 = var62;
                } else if (arg0 == 1425) {
                    var58.field6272 = var62;
                } else if (arg0 == 1426) {
                    var58.field6222 = var62;
                } else if (arg0 == 1427) {
                    var58.field6288 = var62;
                } else if (arg0 == 1428) {
                    var58.field6190 = var62;
                    var58.field6209 = var60;
                } else if (arg0 == 1429) {
                    var58.field6241 = var62;
                    var58.field6132 = var60;
                } else if (arg0 == 1430) {
                    var58.field6147 = var62;
                }
                var58.field6156 = true;
                return;
            }
            if (arg0 < 1600) {
                class427 var65 = arg1 ? field1679 : field1673;
                if (arg0 == 1500) {
                    field1668[field1681++] = var65.field6262;
                    return;
                }
                if (arg0 == 1501) {
                    field1668[field1681++] = var65.field6259;
                    return;
                }
                if (arg0 == 1502) {
                    field1668[field1681++] = var65.field6175;
                    return;
                }
                if (arg0 == 1503) {
                    field1668[field1681++] = var65.field6126;
                    return;
                }
                if (arg0 == 1504) {
                    field1668[field1681++] = var65.field6141 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field1668[field1681++] = var65.field6253;
                    return;
                }
                if (arg0 == 1506) {
                    class427 var66 = class188.method1164(var65, (byte) 125);
                    field1668[field1681++] = var66 == null ? -1 : var66.field6157;
                    return;
                }
            } else if (arg0 < 1700) {
                class427 var67 = arg1 ? field1679 : field1673;
                if (arg0 == 1600) {
                    field1668[field1681++] = var67.field6277;
                    return;
                }
                if (arg0 == 1601) {
                    field1668[field1681++] = var67.field6179;
                    return;
                }
                if (arg0 == 1602) {
                    field1686[field1678++] = var67.field6230;
                    return;
                }
                if (arg0 == 1603) {
                    field1668[field1681++] = var67.field6164;
                    return;
                }
                if (arg0 == 1604) {
                    field1668[field1681++] = var67.field6184;
                    return;
                }
                if (arg0 == 1605) {
                    field1668[field1681++] = var67.field6221;
                    return;
                }
                if (arg0 == 1606) {
                    field1668[field1681++] = var67.field6214;
                    return;
                }
                if (arg0 == 1607) {
                    field1668[field1681++] = var67.field6264;
                    return;
                }
                if (arg0 == 1608) {
                    field1668[field1681++] = var67.field6201;
                    return;
                }
                if (arg0 == 1609) {
                    field1668[field1681++] = var67.field6135;
                    return;
                }
                if (arg0 == 1610) {
                    field1668[field1681++] = var67.field6278;
                    return;
                }
                if (arg0 == 1611) {
                    field1668[field1681++] = var67.field6223;
                    return;
                }
                if (arg0 == 1612) {
                    field1668[field1681++] = var67.field6211;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field1668[--field1681];
                    class85 var69 = class76.field1364.method1267((byte) 41, var68);
                    if (var69.method602((byte) 78)) {
                        field1686[field1678++] = var67.method2505(var68, var69.field1436, -107);
                    } else {
                        field1668[field1681++] = var67.method2511(var69.field1423, var68, -27154);
                    }
                }
            } else if (arg0 < 1800) {
                class427 var70 = arg1 ? field1679 : field1673;
                if (arg0 == 1700) {
                    field1668[field1681++] = var70.field6274;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field6274 != -1) {
                        field1668[field1681++] = var70.field6228;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field1668[field1681++] = var70.field6265;
                    return;
                }
            } else if (arg0 < 1900) {
                class427 var71 = arg1 ? field1679 : field1673;
                if (arg0 == 1800) {
                    field1668[field1681++] = client.method1176(var71).method376(1);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field1668[--field1681];
                    int var334 = var72 - 1;
                    if (var71.field6129 != null && var334 < var71.field6129.length && var71.field6129[var334] != null) {
                        field1686[field1678++] = var71.field6129[var334];
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field6136 == null) {
                        field1686[field1678++] = "";
                        return;
                    }
                    field1686[field1678++] = var71.field6136;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class427 var332;
                if (arg0 >= 2000) {
                    var332 = class413.method2435(160291920, field1668[--field1681]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field1679 : field1673;
                }
                if (field1696 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field6288 == null) {
                        return;
                    }
                    class298 var333 = new class298();
                    var333.field4517 = var332;
                    var333.field4520 = var332.field6288;
                    var333.field4516 = field1696 + 1;
                    class144.field2339.method4(1, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class427 var73 = class413.method2435(160291920, field1668[--field1681]);
                if (arg0 == 2500) {
                    field1668[field1681++] = var73.field6262;
                    return;
                }
                if (arg0 == 2501) {
                    field1668[field1681++] = var73.field6259;
                    return;
                }
                if (arg0 == 2502) {
                    field1668[field1681++] = var73.field6175;
                    return;
                }
                if (arg0 == 2503) {
                    field1668[field1681++] = var73.field6126;
                    return;
                }
                if (arg0 == 2504) {
                    field1668[field1681++] = var73.field6141 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field1668[field1681++] = var73.field6253;
                    return;
                }
                if (arg0 == 1506) {
                    class427 var74 = class188.method1164(var73, (byte) 123);
                    field1668[field1681++] = var74 == null ? -1 : var74.field6157;
                    return;
                }
            } else if (arg0 < 2700) {
                class427 var75 = class413.method2435(160291920, field1668[--field1681]);
                if (arg0 == 2600) {
                    field1668[field1681++] = var75.field6277;
                    return;
                }
                if (arg0 == 2601) {
                    field1668[field1681++] = var75.field6179;
                    return;
                }
                if (arg0 == 2602) {
                    field1686[field1678++] = var75.field6230;
                    return;
                }
                if (arg0 == 2603) {
                    field1668[field1681++] = var75.field6164;
                    return;
                }
                if (arg0 == 2604) {
                    field1668[field1681++] = var75.field6184;
                    return;
                }
                if (arg0 == 2605) {
                    field1668[field1681++] = var75.field6221;
                    return;
                }
                if (arg0 == 2606) {
                    field1668[field1681++] = var75.field6214;
                    return;
                }
                if (arg0 == 2607) {
                    field1668[field1681++] = var75.field6264;
                    return;
                }
                if (arg0 == 2608) {
                    field1668[field1681++] = var75.field6201;
                    return;
                }
                if (arg0 == 2609) {
                    field1668[field1681++] = var75.field6135;
                    return;
                }
                if (arg0 == 2610) {
                    field1668[field1681++] = var75.field6278;
                    return;
                }
                if (arg0 == 2611) {
                    field1668[field1681++] = var75.field6223;
                    return;
                }
                if (arg0 == 2612) {
                    field1668[field1681++] = var75.field6211;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class427 var76 = class413.method2435(160291920, field1668[--field1681]);
                    field1668[field1681++] = var76.field6274;
                    return;
                }
                if (arg0 == 2701) {
                    class427 var77 = class413.method2435(160291920, field1668[--field1681]);
                    if (var77.field6274 == -1) {
                        field1668[field1681++] = 0;
                        return;
                    } else {
                        field1668[field1681++] = var77.field6228;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field1668[--field1681];
                    class394 var79 = (class394) class245.field3741.method2409(false, (long) var78);
                    if (var79 != null) {
                        field1668[field1681++] = 1;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class427 var80 = class413.method2435(160291920, field1668[--field1681]);
                    if (var80.field6193 == null) {
                        field1668[field1681++] = 0;
                        return;
                    }
                    int var81 = var80.field6193.length;
                    for (int var82 = 0; var82 < var80.field6193.length; var82++) {
                        if (var80.field6193[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field1668[field1681++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field1681 -= 2;
                    int var83 = field1668[field1681];
                    int var84 = field1668[field1681 + 1];
                    class394 var85 = (class394) class245.field3741.method2409(false, (long) var83);
                    if (var85 != null && var85.field5750 == var84) {
                        field1668[field1681++] = 1;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class427 var86 = class413.method2435(160291920, field1668[--field1681]);
                if (arg0 == 2800) {
                    field1668[field1681++] = client.method1176(var86).method376(1);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field1668[--field1681];
                    int var335 = var87 - 1;
                    if (var86.field6129 != null && var335 < var86.field6129.length && var86.field6129[var335] != null) {
                        field1686[field1678++] = var86.field6129[var335];
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field6136 == null) {
                        field1686[field1678++] = "";
                        return;
                    }
                    field1686[field1678++] = var86.field6136;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field1686[--field1678];
                    class499.method3000((byte) -48, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field1681 -= 2;
                    class137.method920(-127, class286.field4329, field1668[field1681], field1668[field1681 + 1]);
                    return;
                }
                if (arg0 == 3103) {
                    class246.method1488(true, (byte) 45);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field1686[--field1678];
                    int var90 = 0;
                    if (class174.method1090((byte) -117, var89)) {
                        var90 = class218.method1335(var89, 10);
                    }
                    field1690++;
                    class400.method2379((byte) -75, class436.field6427);
                    class230.field3508.method253(-97, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field1686[--field1678];
                    field1675++;
                    class400.method2379((byte) -75, class177.field2773);
                    class230.field3508.method221(-1, var91.length() + 1);
                    class230.field3508.method240(var91, 121);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field1686[--field1678];
                    field1691++;
                    class400.method2379((byte) -75, class182.field2841);
                    class230.field3508.method221(-1, var92.length() + 1);
                    class230.field3508.method240(var92, 124);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field1668[--field1681];
                    String var94 = field1686[--field1678];
                    class211.method1301(var94, -32, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field1681 -= 3;
                    int var95 = field1668[field1681];
                    int var96 = field1668[field1681 + 1];
                    int var97 = field1668[field1681 + 2];
                    class427 var98 = class413.method2435(160291920, var97);
                    class429.method2523((byte) -44, var95, var98, var96);
                    return;
                }
                if (arg0 == 3109) {
                    field1681 -= 2;
                    int var99 = field1668[field1681];
                    int var100 = field1668[field1681 + 1];
                    class427 var101 = arg1 ? field1679 : field1673;
                    class429.method2523((byte) -44, var99, var101, var100);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field1668[--field1681];
                    field1677++;
                    class400.method2379((byte) -75, class196.field3097);
                    class230.field3508.method246((byte) -111, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field1681 -= 2;
                    int var103 = field1668[field1681];
                    int var104 = field1668[field1681 + 1];
                    class394 var105 = (class394) class245.field3741.method2409(false, (long) var103);
                    if (var105 != null) {
                        class217.method1332(true, var105.field5750 != var104, var105, -10879);
                    }
                    class317.method1885(var103, var104, -2406, 3, true);
                    return;
                }
                if (arg0 == 3112) {
                    field1681--;
                    int var106 = field1668[field1681];
                    class394 var107 = (class394) class245.field3741.method2409(false, (long) var106);
                    if (var107 != null && var107.field5753 == 3) {
                        class217.method1332(true, true, var107, -10879);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class134.method887(-92, field1686[--field1678]);
                    return;
                }
                if (arg0 == 3114) {
                    field1681 -= 2;
                    int var108 = field1668[field1681];
                    int var109 = field1668[field1681 + 1];
                    String var110 = field1686[--field1678];
                    class150.method976(var110, var108, "", var109, "", (byte) -113);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field1681 -= 3;
                    class487.method2927((byte) -89, field1668[field1681], field1668[field1681 + 2], 255, field1668[field1681 + 1]);
                    return;
                }
                if (arg0 == 3201) {
                    class228.method1374(15, 255, field1668[--field1681], 50);
                    return;
                }
                if (arg0 == 3202) {
                    field1681 -= 2;
                    class41.method285(field1668[field1681 + 1], field1668[field1681], -5417, 255);
                    return;
                }
                if (arg0 == 3203) {
                    field1681 -= 4;
                    class487.method2927((byte) -48, field1668[field1681], field1668[field1681 + 2], field1668[field1681 + 3], field1668[field1681 + 1]);
                    return;
                }
                if (arg0 == 3204) {
                    field1681 -= 3;
                    class228.method1374(15, field1668[field1681 + 1], field1668[field1681], field1668[field1681 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field1681 -= 3;
                    class41.method285(field1668[field1681 + 1], field1668[field1681], -5417, field1668[field1681 + 2]);
                    return;
                }
                if (arg0 == 3206) {
                    field1681 -= 4;
                    class368.method2233(field1668[field1681], field1668[field1681 + 2], field1668[field1681 + 1], false, field1668[field1681 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field1668[field1681++] = class369.field5424;
                    return;
                }
                if (arg0 == 3301) {
                    field1681 -= 2;
                    int var111 = field1668[field1681];
                    int var112 = field1668[field1681 + 1];
                    field1668[field1681++] = class199.method1237(-120, var111, var112, false);
                    return;
                }
                if (arg0 == 3302) {
                    field1681 -= 2;
                    int var113 = field1668[field1681];
                    int var114 = field1668[field1681 + 1];
                    field1668[field1681++] = class29.method151(var113, var114, 0, false);
                    return;
                }
                if (arg0 == 3303) {
                    field1681 -= 2;
                    int var115 = field1668[field1681];
                    int var116 = field1668[field1681 + 1];
                    field1668[field1681++] = class480.method2903(var116, var115, false, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field1668[--field1681];
                    field1668[field1681++] = class331.field4952.method755(var117, (byte) -93).field5736;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field1668[--field1681];
                    field1668[field1681++] = class232.field3528[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field1668[--field1681];
                    field1668[field1681++] = class222.field3433[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field1668[--field1681];
                    field1668[field1681++] = class47.field712[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class286.field4329.field3217;
                    int var122 = (class286.field4329.field3218 >> 7) + class381.field5550;
                    int var123 = (class286.field4329.field3222 >> 7) + class320.field4827;
                    field1668[field1681++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field1668[--field1681];
                    field1668[field1681++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field1668[--field1681];
                    field1668[field1681++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field1668[--field1681];
                    field1668[field1681++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field1668[field1681++] = class73.field1313 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field1681 -= 2;
                    int var127 = field1668[field1681];
                    int var128 = field1668[field1681 + 1];
                    field1668[field1681++] = class199.method1237(-38, var127, var128, true);
                    return;
                }
                if (arg0 == 3314) {
                    field1681 -= 2;
                    int var129 = field1668[field1681];
                    int var130 = field1668[field1681 + 1];
                    field1668[field1681++] = class29.method151(var129, var130, 0, true);
                    return;
                }
                if (arg0 == 3315) {
                    field1681 -= 2;
                    int var131 = field1668[field1681];
                    int var132 = field1668[field1681 + 1];
                    field1668[field1681++] = class480.method2903(var132, var131, false, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class193.field3052 >= 2) {
                        field1668[field1681++] = class193.field3052;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field1668[field1681++] = class65.field1067;
                    return;
                }
                if (arg0 == 3318) {
                    field1668[field1681++] = class167.field2593;
                    return;
                }
                if (arg0 == 3321) {
                    field1668[field1681++] = class284.field4304;
                    return;
                }
                if (arg0 == 3322) {
                    field1668[field1681++] = class396.field5770;
                    return;
                }
                if (arg0 == 3323) {
                    if (class177.field2775 >= 5 && class177.field2775 <= 9) {
                        field1668[field1681++] = 1;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class177.field2775 >= 5 && class177.field2775 <= 9) {
                        field1668[field1681++] = class177.field2775;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field1668[field1681++] = class137.field2256 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field1668[field1681++] = class286.field4329.field672;
                    return;
                }
                if (arg0 == 3327) {
                    field1668[field1681++] = class286.field4329.field696.field4813 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field1668[field1681++] = class396.field5784 && !class32.field419 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field1668[field1681++] = class75.field1352 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field1668[--field1681];
                    field1668[field1681++] = class134.method880(false, 119, var133);
                    return;
                }
                if (arg0 == 3331) {
                    field1681 -= 2;
                    int var134 = field1668[field1681];
                    int var135 = field1668[field1681 + 1];
                    field1668[field1681++] = class78.method568(false, var135, (byte) 120, false, var134);
                    return;
                }
                if (arg0 == 3332) {
                    field1681 -= 2;
                    int var136 = field1668[field1681];
                    int var137 = field1668[field1681 + 1];
                    field1668[field1681++] = class78.method568(false, var137, (byte) 120, true, var136);
                    return;
                }
                if (arg0 == 3333) {
                    field1668[field1681++] = class243.field3656;
                    return;
                }
                if (arg0 == 3335) {
                    field1668[field1681++] = class406.field5898;
                    return;
                }
                if (arg0 == 3336) {
                    field1681 -= 4;
                    int var138 = field1668[field1681];
                    int var139 = field1668[field1681 + 1];
                    int var140 = field1668[field1681 + 2];
                    int var141 = field1668[field1681 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field1668[field1681++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field1668[field1681++] = class90.field1620;
                    return;
                }
                if (arg0 == 3338) {
                    field1668[field1681++] = class131.method873(false);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field1681 -= 2;
                    int var145 = field1668[field1681];
                    int var146 = field1668[field1681 + 1];
                    class324 var147 = class295.field4480.method2563((byte) 120, var145);
                    field1686[field1678++] = var147.method2024(var146, 17769);
                    return;
                }
                if (arg0 == 3408) {
                    field1681 -= 4;
                    int var148 = field1668[field1681];
                    int var149 = field1668[field1681 + 1];
                    int var150 = field1668[field1681 + 2];
                    int var151 = field1668[field1681 + 3];
                    class324 var152 = class295.field4480.method2563((byte) 63, var150);
                    if (var152.field4851 == var148 && var152.field4861 == var149) {
                        if (var149 == 115) {
                            field1686[field1678++] = var152.method2024(var151, 17769);
                            return;
                        }
                        field1668[field1681++] = var152.method2019(var151, (byte) 113);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field1681 -= 3;
                    int var153 = field1668[field1681];
                    int var154 = field1668[field1681 + 1];
                    int var155 = field1668[field1681 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class324 var156 = class295.field4480.method2563((byte) 68, var154);
                    if (var156.field4861 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field1668[field1681++] = var156.method2023(66, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field1668[--field1681];
                    String var158 = field1686[--field1678];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class324 var159 = class295.field4480.method2563((byte) 107, var157);
                    if (var159.field4861 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field1668[field1681++] = var159.method2027(var158, 54) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field1668[--field1681];
                    class324 var161 = class295.field4480.method2563((byte) 35, var160);
                    field1668[field1681++] = var161.field4862.method2411(true);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class448.field6905 == 0) {
                        field1668[field1681++] = -2;
                        return;
                    }
                    if (class448.field6905 == 1) {
                        field1668[field1681++] = -1;
                        return;
                    }
                    field1668[field1681++] = class7.field79;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field1668[--field1681];
                    if (class448.field6905 == 2 && var162 < class7.field79) {
                        field1686[field1678++] = class51.field767[var162];
                        if (class472.field7212[var162] != null) {
                            field1686[field1678++] = class472.field7212[var162];
                            return;
                        }
                        field1686[field1678++] = "";
                        return;
                    }
                    field1686[field1678++] = "";
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field1668[--field1681];
                    if (class448.field6905 == 2 && var163 < class7.field79) {
                        field1668[field1681++] = class366.field5375[var163];
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field1668[--field1681];
                    if (class448.field6905 == 2 && var164 < class7.field79) {
                        field1668[field1681++] = class478.field7308[var164];
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field1686[--field1678];
                    int var166 = field1668[--field1681];
                    class32.method178(var166, -21224, var165);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field1686[--field1678];
                    class169.method1064(var167, (byte) 92);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field1686[--field1678];
                    class111.method800(var168, 1);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field1686[--field1678];
                    class268.method1630(100, var169, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field1686[--field1678];
                    class54.method378(var170, 127);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field1686[--field1678];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field1668[field1681++] = class347.method2117(0, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field1668[--field1681];
                    if (class448.field6905 == 2 && var172 < class7.field79) {
                        field1686[field1678++] = class296.field4497[var172];
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class184.field2928 != null) {
                        field1686[field1678++] = class415.method2443(class184.field2928, 6);
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class184.field2928 != null) {
                        field1668[field1681++] = class233.field3530;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field1668[--field1681];
                    if (class184.field2928 != null && var173 < class233.field3530) {
                        field1686[field1678++] = class17.field236[var173].field2058;
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field1668[--field1681];
                    if (class184.field2928 != null && var174 < class233.field3530) {
                        field1668[field1681++] = class17.field236[var174].field2060;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field1668[--field1681];
                    if (class184.field2928 != null && var175 < class233.field3530) {
                        field1668[field1681++] = class17.field236[var175].field2059;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field1668[field1681++] = class261.field3964;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field1686[--field1678];
                    class16.method86(var176, 54);
                    return;
                }
                if (arg0 == 3618) {
                    field1668[field1681++] = class271.field4103;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field1686[--field1678];
                    class56.method399((byte) 73, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class257.method1547(-69);
                    return;
                }
                if (arg0 == 3621) {
                    if (class448.field6905 == 0) {
                        field1668[field1681++] = -1;
                        return;
                    }
                    field1668[field1681++] = class170.field2651;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field1668[--field1681];
                    if (class448.field6905 != 0 && var178 < class170.field2651) {
                        field1686[field1678++] = class107.field1868[var178];
                        if (class178.field2791[var178] != null) {
                            field1686[field1678++] = class178.field2791[var178];
                            return;
                        }
                        field1686[field1678++] = "";
                        return;
                    }
                    field1686[field1678++] = "";
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field1686[--field1678];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field1668[field1681++] = class237.method1423(var179, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field1668[--field1681];
                    if (class17.field236 != null && var180 < class233.field3530 && class17.field236[var180].field2064.equalsIgnoreCase(class286.field4329.field685)) {
                        field1668[field1681++] = 1;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class227.field3484 != null) {
                        field1686[field1678++] = class227.field3484;
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field1668[--field1681];
                    if (class184.field2928 != null && var181 < class233.field3530) {
                        field1686[field1678++] = class17.field236[var181].field2069;
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field1668[--field1681];
                    if (class448.field6905 == 2 && var182 >= 0 && var182 < class7.field79) {
                        field1668[field1681++] = class147.field2388[var182] ? 1 : 0;
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field1686[--field1678];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field1668[field1681++] = class272.method1647((byte) -52, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field1668[field1681++] = class111.field1903;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field1686[--field1678];
                    class268.method1630(100, var184, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field1668[--field1681];
                    field1668[field1681++] = class298.field4528[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field1668[--field1681];
                    if (class184.field2928 != null && var186 < class233.field3530) {
                        field1686[field1678++] = class17.field236[var186].field2064;
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field1668[--field1681];
                    if (class448.field6905 != 0 && var187 < class170.field2651) {
                        field1686[field1678++] = class373.field5453[var187];
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field1668[--field1681];
                    field1668[field1681++] = class297.field4510[var188].method2030(13);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field1668[--field1681];
                    field1668[field1681++] = class297.field4510[var189].field4871;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field1668[--field1681];
                    field1668[field1681++] = class297.field4510[var190].field4876;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field1668[--field1681];
                    field1668[field1681++] = class297.field4510[var191].field4873;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field1668[--field1681];
                    field1668[field1681++] = class297.field4510[var192].field4875;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field1668[--field1681];
                    field1668[field1681++] = class297.field4510[var193].field4877;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field1668[--field1681];
                    int var195 = class297.field4510[var194].method2032((byte) -54);
                    field1668[field1681++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field1668[--field1681];
                    int var197 = class297.field4510[var196].method2032((byte) -61);
                    field1668[field1681++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field1668[--field1681];
                    int var199 = class297.field4510[var198].method2032((byte) -44);
                    field1668[field1681++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field1668[--field1681];
                    int var201 = class297.field4510[var200].method2032((byte) 112);
                    field1668[field1681++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field1681 -= 2;
                    int var202 = field1668[field1681];
                    int var203 = field1668[field1681 + 1];
                    field1668[field1681++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field1681 -= 2;
                    int var204 = field1668[field1681];
                    int var205 = field1668[field1681 + 1];
                    field1668[field1681++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field1681 -= 2;
                    int var206 = field1668[field1681];
                    int var207 = field1668[field1681 + 1];
                    field1668[field1681++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field1681 -= 2;
                    int var208 = field1668[field1681];
                    int var209 = field1668[field1681 + 1];
                    field1668[field1681++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field1668[--field1681];
                    field1668[field1681++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field1668[--field1681];
                    field1668[field1681++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field1681 -= 5;
                    int var212 = field1668[field1681];
                    int var213 = field1668[field1681 + 1];
                    int var214 = field1668[field1681 + 2];
                    int var215 = field1668[field1681 + 3];
                    int var216 = field1668[field1681 + 4];
                    field1668[field1681++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field1681 -= 2;
                    long var217 = (long) field1668[field1681];
                    long var219 = (long) field1668[field1681 + 1];
                    field1668[field1681++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field1681 -= 2;
                    int var221 = field1668[field1681];
                    int var222 = field1668[field1681 + 1];
                    field1668[field1681++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field1681 -= 2;
                    int var223 = field1668[field1681];
                    int var224 = field1668[field1681 + 1];
                    field1668[field1681++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field1681 -= 2;
                    int var225 = field1668[field1681];
                    int var226 = field1668[field1681 + 1];
                    field1668[field1681++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field1681 -= 2;
                    int var227 = field1668[field1681];
                    int var228 = field1668[field1681 + 1];
                    field1668[field1681++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field1681 -= 2;
                    int var229 = field1668[field1681];
                    int var230 = field1668[field1681 + 1];
                    if (var229 == 0) {
                        field1668[field1681++] = 0;
                        return;
                    }
                    field1668[field1681++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field1681 -= 2;
                    int var231 = field1668[field1681];
                    int var232 = field1668[field1681 + 1];
                    if (var231 == 0) {
                        field1668[field1681++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field1668[field1681++] = Integer.MAX_VALUE;
                        return;
                    }
                    field1668[field1681++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field1681 -= 2;
                    int var233 = field1668[field1681];
                    int var234 = field1668[field1681 + 1];
                    field1668[field1681++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field1681 -= 2;
                    int var235 = field1668[field1681];
                    int var236 = field1668[field1681 + 1];
                    field1668[field1681++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field1681 -= 2;
                    int var237 = field1668[field1681];
                    int var238 = field1668[field1681 + 1];
                    field1668[field1681++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field1681 -= 2;
                    int var239 = field1668[field1681];
                    int var240 = field1668[field1681 + 1];
                    field1668[field1681++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field1681 -= 3;
                    long var241 = (long) field1668[field1681];
                    long var243 = (long) field1668[field1681 + 1];
                    long var245 = (long) field1668[field1681 + 2];
                    field1668[field1681++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field1686[--field1678];
                    int var248 = field1668[--field1681];
                    field1686[field1678++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field1678 -= 2;
                    String var249 = field1686[field1678];
                    String var250 = field1686[field1678 + 1];
                    field1686[field1678++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field1686[--field1678];
                    int var252 = field1668[--field1681];
                    field1686[field1678++] = var251 + class56.method405(true, (byte) 65, var252);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field1686[--field1678];
                    field1686[field1678++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field1686[field1678++] = method699(field1668[--field1681]);
                    return;
                }
                if (arg0 == 4105) {
                    field1678 -= 2;
                    String var254 = field1686[field1678];
                    String var255 = field1686[field1678 + 1];
                    if (class286.field4329.field696 != null && class286.field4329.field696.field4813) {
                        field1686[field1678++] = var255;
                        return;
                    }
                    field1686[field1678++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field1668[--field1681];
                    field1686[field1678++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field1678 -= 2;
                    field1668[field1681++] = class213.method1311(field1686[field1678 + 1], class406.field5898, field1686[field1678], 0);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field1686[--field1678];
                    field1681 -= 2;
                    int var258 = field1668[field1681];
                    int var259 = field1668[field1681 + 1];
                    class396 var260 = class206.method1265(class123.field2027, var259, 0, 88);
                    field1668[field1681++] = var260.method2351(class480.field7336, var258, (byte) 113, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field1686[--field1678];
                    field1681 -= 2;
                    int var262 = field1668[field1681];
                    int var263 = field1668[field1681 + 1];
                    class396 var264 = class206.method1265(class123.field2027, var263, 0, 39);
                    field1668[field1681++] = var264.method2346(true, class480.field7336, var261, var262);
                    return;
                }
                if (arg0 == 4110) {
                    field1678 -= 2;
                    String var265 = field1686[field1678];
                    String var266 = field1686[field1678 + 1];
                    if (field1668[--field1681] == 1) {
                        field1686[field1678++] = var265;
                        return;
                    }
                    field1686[field1678++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field1686[--field1678];
                    field1686[field1678++] = class435.method2540(var267, 0);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field1686[--field1678];
                    int var269 = field1668[--field1681];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field1686[field1678++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field1668[--field1681];
                    field1668[field1681++] = class72.method532((char) var270, (byte) 94) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field1668[--field1681];
                    field1668[field1681++] = class127.method866((char) var271, (byte) -49) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field1668[--field1681];
                    field1668[field1681++] = class214.method1313((char) var272, -30321) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field1668[--field1681];
                    field1668[field1681++] = class452.method2699(-11706, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field1686[--field1678];
                    if (var274 != null) {
                        field1668[field1681++] = var274.length();
                        return;
                    }
                    field1668[field1681++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field1686[--field1678];
                    field1681 -= 2;
                    int var276 = field1668[field1681];
                    int var277 = field1668[field1681 + 1];
                    field1686[field1678++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field1686[--field1678];
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
                    field1686[field1678++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field1686[--field1678];
                    field1681 -= 2;
                    int var284 = field1668[field1681];
                    int var285 = field1668[field1681 + 1];
                    field1668[field1681++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field1678 -= 2;
                    String var286 = field1686[field1678];
                    String var287 = field1686[field1678 + 1];
                    int var288 = field1668[--field1681];
                    field1668[field1681++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field1668[--field1681];
                    field1668[field1681++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field1668[--field1681];
                    field1668[field1681++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field1668[--field1681] != 0;
                    int var292 = field1668[--field1681];
                    field1686[field1678++] = class347.method2116((long) var292, (byte) 124, class406.field5898, var291, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field1686[--field1678];
                    int var294 = field1668[--field1681];
                    class396 var295 = class206.method1265(class123.field2027, var294, 0, 50);
                    field1668[field1681++] = var295.method2357(-111, class480.field7336, var293);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field1668[--field1681];
                    field1686[field1678++] = class288.field4362.method3030((byte) 108, var296).field2829;
                    return;
                }
                if (arg0 == 4201) {
                    field1681 -= 2;
                    int var297 = field1668[field1681];
                    int var298 = field1668[field1681 + 1];
                    class182 var299 = class288.field4362.method3030((byte) 100, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field2876[var298 - 1] != null) {
                        field1686[field1678++] = var299.field2876[var298 - 1];
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field1681 -= 2;
                    int var300 = field1668[field1681];
                    int var301 = field1668[field1681 + 1];
                    class182 var302 = class288.field4362.method3030((byte) 94, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field2880[var301 - 1] != null) {
                        field1686[field1678++] = var302.field2880[var301 - 1];
                        return;
                    }
                    field1686[field1678++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field1668[--field1681];
                    field1668[field1681++] = class288.field4362.method3030((byte) 78, var303).field2833;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field1668[--field1681];
                    field1668[field1681++] = class288.field4362.method3030((byte) 110, var304).field2886 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field1668[--field1681];
                    class182 var306 = class288.field4362.method3030((byte) 74, var305);
                    if (var306.field2856 == -1 && var306.field2859 >= 0) {
                        field1668[field1681++] = var306.field2859;
                        return;
                    }
                    field1668[field1681++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field1668[--field1681];
                    class182 var308 = class288.field4362.method3030((byte) 77, var307);
                    if (var308.field2856 >= 0 && var308.field2859 >= 0) {
                        field1668[field1681++] = var308.field2859;
                        return;
                    }
                    field1668[field1681++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field1668[--field1681];
                    field1668[field1681++] = class288.field4362.method3030((byte) 97, var309).field2860 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field1681 -= 2;
                    int var310 = field1668[field1681];
                    int var311 = field1668[field1681 + 1];
                    class85 var312 = class76.field1364.method1267((byte) 41, var311);
                    if (var312.method602((byte) 113)) {
                        field1686[field1678++] = class288.field4362.method3030((byte) 120, var310).method1135(var311, var312.field1436, -1);
                        return;
                    }
                    field1668[field1681++] = class288.field4362.method3030((byte) 114, var310).method1136(12604, var311, var312.field1423);
                    return;
                }
                if (arg0 == 4209) {
                    field1681 -= 2;
                    int var313 = field1668[field1681];
                    int var314 = field1668[field1681 + 1] - 1;
                    class182 var315 = class288.field4362.method3030((byte) 50, var313);
                    if (var315.field2838 == var314) {
                        field1668[field1681++] = var315.field2852;
                        return;
                    }
                    if (var315.field2863 == var314) {
                        field1668[field1681++] = var315.field2892;
                        return;
                    }
                    field1668[field1681++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field1686[--field1678];
                    int var317 = field1668[--field1681];
                    class274.method1669(var316, var317 == 1, 0);
                    field1668[field1681++] = class507.field7657;
                    return;
                }
                if (arg0 == 4211) {
                    if (class78.field1390 != null && class310.field4676 < class507.field7657) {
                        field1668[field1681++] = class78.field1390[class310.field4676++] & 0xFFFF;
                        return;
                    }
                    field1668[field1681++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class310.field4676 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field1681 -= 2;
                    int var318 = field1668[field1681];
                    int var319 = field1668[field1681 + 1];
                    class85 var320 = class76.field1364.method1267((byte) 41, var319);
                    if (var320.method602((byte) 70)) {
                        field1686[field1678++] = class433.field6358.method2688(var318, -8333).method1476(var320.field1436, var319, 0);
                        return;
                    }
                    field1668[field1681++] = class433.field6358.method2688(var318, -8333).method1480((byte) -109, var319, var320.field1423);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field1681 -= 2;
                    int var321 = field1668[field1681];
                    int var322 = field1668[field1681 + 1];
                    class85 var323 = class76.field1364.method1267((byte) 41, var322);
                    if (var323.method602((byte) 71)) {
                        field1686[field1678++] = class128.field2070.method916((byte) -15, var321).method390(var322, var323.field1436, 107);
                        return;
                    }
                    field1668[field1681++] = class128.field2070.method916((byte) -15, var321).method398(var322, true, var323.field1423);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field1681 -= 2;
                    int var324 = field1668[field1681];
                    int var325 = field1668[field1681 + 1];
                    class85 var326 = class76.field1364.method1267((byte) 41, var325);
                    if (var326.method602((byte) 81)) {
                        field1686[field1678++] = class318.field4791.method1659(var324, false).method430(var325, (byte) 78, var326.field1436);
                        return;
                    }
                    field1668[field1681++] = class318.field4791.method1659(var324, false).method437(113, var325, var326.field1423);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field1668[--field1681];
                class14 var328 = class511.field7740.method1405(var327, -124);
                if (var328.field178 != null && var328.field178.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field181[0];
                    for (int var331 = 1; var331 < var328.field178.length; var331++) {
                        if (var328.field181[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field181[var331];
                        }
                    }
                    field1668[field1681++] = var328.field178[var329];
                    return;
                }
                field1668[field1681++] = var328.field180;
                return;
            }
        } else {
            class427 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class413.method2435(160291920, field1668[--field1681]);
            } else {
                var47 = arg1 ? field1679 : field1673;
            }
            if (arg0 == 1300) {
                int var48 = field1668[--field1681] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2509(var48, (byte) 0, field1686[--field1678]);
                    return;
                }
                field1678--;
                return;
            }
            if (arg0 == 1301) {
                field1681 -= 2;
                int var49 = field1668[field1681];
                int var50 = field1668[field1681 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field6220 = null;
                    return;
                }
                var47.field6220 = class59.method419(var50, 12782, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field1668[--field1681];
                if (class267.field4035 != var51 && class313.field4739 != var51 && class408.field5931 != var51) {
                    return;
                }
                var47.field6194 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field6248 = field1668[--field1681];
                return;
            }
            if (arg0 == 1304) {
                var47.field6239 = field1668[--field1681];
                return;
            }
            if (arg0 == 1305) {
                var47.field6136 = field1686[--field1678];
                return;
            }
            if (arg0 == 1306) {
                var47.field6167 = field1686[--field1678];
                return;
            }
            if (arg0 == 1307) {
                var47.field6129 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field6143 = field1668[--field1681];
                var47.field6219 = field1668[--field1681];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field1668[--field1681];
                int var53 = field1668[--field1681];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2519((byte) -91, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field6250 = field1686[--field1678];
                return;
            }
            if (arg0 == 1311) {
                var47.field6128 = field1668[--field1681];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field1681 -= 3;
                    var54 = field1668[field1681] - 1;
                    var55 = field1668[field1681 + 1];
                    var56 = field1668[field1681 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field1681 -= 2;
                    var54 = 10;
                    var55 = field1668[field1681];
                    var56 = field1668[field1681 + 1];
                }
                if (var47.field6256 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field6256 = new byte[11];
                    var47.field6168 = new byte[11];
                    var47.field6280 = new int[11];
                }
                var47.field6256[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field6199 = false;
                    for (int var57 = 0; var57 < var47.field6256.length; var57++) {
                        if (var47.field6256[var57] != 0) {
                            var47.field6199 = true;
                            break;
                        }
                    }
                } else {
                    var47.field6199 = true;
                }
                var47.field6168[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field6227 = field1668[--field1681];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    private static final void method696(int arg0) {
        class427 var1 = class413.method2435(160291920, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class427[] var3 = class332.field4972[var2];
        if (var3 == null) {
            class427[] var4 = class409.field5933[var2];
            int var5 = var4.length;
            var3 = class332.field4972[var2] = new class427[var5];
            class356.method2183(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class356.method2183(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    private static final void method697(int arg0) {
        class427 var1 = class413.method2435(160291920, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class427[] var3 = class332.field4972[var2];
        if (var3 == null) {
            class427[] var4 = class409.field5933[var2];
            int var5 = var4.length;
            var3 = class332.field4972[var2] = new class427[var5];
            class356.method2183(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class356.method2183(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqd;I)V")
    private static final void method698(class298 arg0, int arg1) {
        Object[] var2 = arg0.field4520;
        int var3 = (Integer) var2[0];
        class195 var4 = class490.method2949(var3, 22635);
        if (var4 == null) {
            return;
        }
        field1684 = new int[var4.field3082];
        int var5 = 0;
        field1672 = new String[var4.field3073];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4527;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4519;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4517 == null ? -1 : arg0.field4517.field6157;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4524;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4517 == null ? -1 : arg0.field4517.field6265;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4514 == null ? -1 : arg0.field4514.field6157;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4514 == null ? -1 : arg0.field4514.field6265;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4518;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4526;
                }
                field1684[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4513;
                }
                field1672[var6++] = var9;
            }
        }
        field1696 = arg0.field4516;
        method700(var4, arg1);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)Ljava/lang/String;")
    private static final String method699(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field1692.setTime(new Date(var1));
        int var3 = field1692.get(5);
        int var4 = field1692.get(2);
        int var5 = field1692.get(1);
        return var3 + "-" + field1694[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lwt;I)V")
    private static final void method700(class195 arg0, int arg1) {
        field1681 = 0;
        field1678 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3078;
        int[] var4 = arg0.field3074;
        byte var5 = -1;
        field1682 = 0;
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
                        method695(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method707(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field1668[field1681++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field1668[field1681++] = class273.field4144.field4015[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class273.field4144.method1617(field1668[--field1681], true, var8);
                } else if (var43 == 3) {
                    field1686[field1678++] = arg0.field3079[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field1681 -= 2;
                    if (field1668[field1681 + 1] != field1668[field1681]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field1681 -= 2;
                    if (field1668[field1681 + 1] == field1668[field1681]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field1681 -= 2;
                    if (field1668[field1681] < field1668[field1681 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field1681 -= 2;
                    if (field1668[field1681] > field1668[field1681 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field1682 == 0) {
                        return;
                    }
                    class449 var9 = field1669[--field1682];
                    arg0 = var9.field6915;
                    var3 = arg0.field3078;
                    var4 = arg0.field3074;
                    var2 = var9.field6917;
                    field1684 = var9.field6914;
                    field1672 = var9.field6919;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field1668[field1681++] = class273.field4144.method1618(-64, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class273.field4144.method1619(var11, 88, field1668[--field1681]);
                } else if (var43 == 31) {
                    field1681 -= 2;
                    if (field1668[field1681] <= field1668[field1681 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field1681 -= 2;
                    if (field1668[field1681] >= field1668[field1681 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field1668[field1681++] = field1684[var4[var2]];
                } else if (var43 == 34) {
                    field1684[var4[var2]] = field1668[--field1681];
                } else if (var43 == 35) {
                    field1686[field1678++] = field1672[var4[var2]];
                } else if (var43 == 36) {
                    field1672[var4[var2]] = field1686[--field1678];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field1678 -= var12;
                    String var13 = class263.method1599(var12, field1678, field1686, (byte) 122);
                    field1686[field1678++] = var13;
                } else if (var43 == 38) {
                    field1681--;
                } else if (var43 == 39) {
                    field1678--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class195 var15 = class490.method2949(var14, 22635);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3082];
                    String[] var17 = new String[var15.field3073];
                    for (int var18 = 0; var18 < var15.field3083; var18++) {
                        var16[var18] = field1668[field1681 + var18 - var15.field3083];
                    }
                    for (int var19 = 0; var19 < var15.field3081; var19++) {
                        var17[var19] = field1686[field1678 + var19 - var15.field3081];
                    }
                    field1681 -= var15.field3083;
                    field1678 -= var15.field3081;
                    class449 var20 = new class449();
                    var20.field6915 = arg0;
                    var20.field6917 = var2;
                    var20.field6914 = field1684;
                    var20.field6919 = field1672;
                    if (field1682 >= field1669.length) {
                        throw new RuntimeException();
                    }
                    field1669[field1682++] = var20;
                    arg0 = var15;
                    var3 = var15.field3078;
                    var4 = var15.field3074;
                    var2 = -1;
                    field1684 = var16;
                    field1672 = var17;
                } else if (var43 == 42) {
                    field1668[field1681++] = class482.field7367[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class482.field7367[var21] = field1668[--field1681];
                    class30.method158(var21, 45);
                    class96.field1742 |= class418.field6024[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field1668[--field1681];
                    if (var24 >= 0 && var24 <= 5000) {
                        field1676[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field1674[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field1668[--field1681];
                    if (var28 < 0 || var28 >= field1676[var27]) {
                        throw new RuntimeException();
                    }
                    field1668[field1681++] = field1674[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field1681 -= 2;
                    int var30 = field1668[field1681];
                    if (var30 < 0 || var30 >= field1676[var29]) {
                        throw new RuntimeException();
                    }
                    field1674[var29][var30] = field1668[field1681 + 1];
                } else if (var43 == 47) {
                    String var31 = class329.field4938[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field1686[field1678++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class329.field4938[var32] = field1686[--field1678];
                    class109.method787((byte) -74, var32);
                } else if (var43 == 51) {
                    class407 var33 = arg0.field3080[var4[var2]];
                    class361 var34 = (class361) var33.method2409(false, (long) field1668[--field1681]);
                    if (var34 != null) {
                        var2 += var34.field5334;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3088 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field2798).append(" ");
                for (int var41 = field1682 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field1669[var41].field6915.field2798).append(" ");
                }
                var40.append("op: ").append(var5);
                class32.method177(var42, (byte) -121, var40.toString());
            } else {
                class499.method3000((byte) -48, "Clientscript error in: " + arg0.field3088);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3088).append("\n");
                for (int var38 = field1682 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field1669[var38].field6915.field3088).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class32.method177(var42, (byte) -114, var37.toString());
                class404.method2396(var37.toString(), 10);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Loq;II)V")
    public static final void method701(class231 arg0, int arg1, int arg2) {
        class195 var3 = class25.method133((byte) 122, arg1, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field1684 = new int[var3.field3082];
        field1672 = new String[var3.field3073];
        if (class237.field3580 == var3.field3084 || class176.field2749 == var3.field3084 || class449.field6916 == var3.field3084) {
            int var4 = 0;
            int var5 = 0;
            if (class450.field6928 != null) {
                var4 = class450.field6928.field6262;
                var5 = class450.field6928.field6259;
            }
            field1684[0] = class251.field3835.method1686(25478) - var4;
            field1684[1] = class251.field3835.method1690(8) - var5;
        }
        method700(var3, 200000);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IZ)V")
    public static final void method702(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public static final void method703(int arg0) {
        if (arg0 == -1 || !class376.method2264((byte) -123, arg0)) {
            return;
        }
        class427[] var1 = class409.field5933[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class427 var3 = var1[var2];
            if (var3.field6177 != null) {
                class298 var4 = new class298();
                var4.field4517 = var3;
                var4.field4520 = var3.field6177;
                method698(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqd;)V")
    public static final void method704(class298 arg0) {
        method698(arg0, 200000);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
    public static final void method705() {
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()V")
    public static void method706() {
        field1684 = null;
        field1672 = null;
        field1676 = null;
        field1674 = null;
        field1668 = null;
        field1686 = null;
        field1669 = null;
        field1673 = null;
        field1679 = null;
        field1687 = null;
        field1692 = null;
        field1694 = null;
        field1693 = null;
        field1695 = null;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(IZ)V")
    private static final void method707(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1668[field1681++] = class341.field5095;
                return;
            }
            if (arg0 == 5001) {
                field1681 -= 3;
                class341.field5095 = field1668[field1681];
                class247.field3800 = class196.method1221(2, field1668[field1681 + 1]);
                if (class247.field3800 == null) {
                    class247.field3800 = class410.field5950;
                }
                class15.field211 = field1668[field1681 + 2];
                field1670++;
                class400.method2379((byte) -75, class241.field3632);
                class230.field3508.method221(-1, class341.field5095);
                class230.field3508.method221(-1, class247.field3800.field3517);
                class230.field3508.method221(-1, class15.field211);
                return;
            }
            if (arg0 == 5002) {
                field1678 -= 2;
                String var2 = field1686[field1678];
                String var3 = field1686[field1678 + 1];
                field1681 -= 2;
                int var4 = field1668[field1681];
                int var5 = field1668[field1681 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field1671++;
                class400.method2379((byte) -75, class77.field1374);
                class230.field3508.method221(-1, class220.method1343(var2, (byte) -82) + class220.method1343(var3, (byte) -82) + 2);
                class230.field3508.method240(var2, 124);
                class230.field3508.method221(-1, var4 - 1);
                class230.field3508.method221(-1, var5);
                class230.field3508.method240(var3, 123);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field1668[--field1681];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class475.field7246[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field1686[field1678++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field1668[--field1681];
                int var9 = -1;
                if (var8 < 100 && class475.field7246[var8] != null) {
                    var9 = class37.field502[var8];
                }
                field1668[field1681++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class247.field3800 == null) {
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = class247.field3800.field3517;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var68 = field1686[--field1678];
                method694(var68, arg0);
                return;
            }
            if (arg0 == 5009) {
                field1678 -= 2;
                String var10 = field1686[field1678];
                String var11 = field1686[field1678 + 1];
                if (class193.field3052 != 0 || (!class396.field5784 || class32.field419) && !class75.field1352) {
                    field1689++;
                    class400.method2379((byte) -75, class39.field525);
                    class230.field3508.method221(-1, 0);
                    int var12 = class230.field3508.field585;
                    class230.field3508.method240(var10, 124);
                    class30.method157(111, class230.field3508, var11);
                    class230.field3508.method264(10807, class230.field3508.field585 - var12);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var13 = field1668[--field1681];
                String var14 = null;
                if (var13 < 100) {
                    var14 = class255.field3887[var13];
                }
                if (var14 == null) {
                    var14 = "";
                }
                field1686[field1678++] = var14;
                return;
            }
            if (arg0 == 5011) {
                int var15 = field1668[--field1681];
                String var16 = null;
                if (var15 < 100) {
                    var16 = class128.field2067[var15];
                }
                if (var16 == null) {
                    var16 = "";
                }
                field1686[field1678++] = var16;
                return;
            }
            if (arg0 == 5012) {
                int var17 = field1668[--field1681];
                int var18 = -1;
                if (var17 < 100) {
                    var18 = class508.field7688[var17];
                }
                field1668[field1681++] = var18;
                return;
            }
            if (arg0 == 5015) {
                String var19;
                if (class286.field4329 == null || class286.field4329.field713 == null) {
                    var19 = class358.field5303;
                } else {
                    var19 = class286.field4329.method327(115, true);
                }
                field1686[field1678++] = var19;
                return;
            }
            if (arg0 == 5016) {
                field1668[field1681++] = class15.field211;
                return;
            }
            if (arg0 == 5017) {
                field1668[field1681++] = class34.field489;
                return;
            }
            if (arg0 == 5018) {
                int var20 = field1668[--field1681];
                int var21 = 0;
                if (var20 < 100 && class475.field7246[var20] != null) {
                    var21 = class37.field502[var20];
                }
                field1668[field1681++] = var21;
                return;
            }
            if (arg0 == 5019) {
                int var22 = field1668[--field1681];
                String var23 = null;
                if (var22 < 100) {
                    var23 = class224.field3452[var22];
                }
                if (var23 == null) {
                    var23 = "";
                }
                field1686[field1678++] = var23;
                return;
            }
            if (arg0 == 5020) {
                String var24;
                if (class286.field4329 == null || class286.field4329.field713 == null) {
                    var24 = class358.field5303;
                } else {
                    var24 = class286.field4329.method335(false, 123);
                }
                field1686[field1678++] = var24;
                return;
            }
            if (arg0 == 5050) {
                int var25 = field1668[--field1681];
                field1686[field1678++] = class419.field6031.method2444(var25, (byte) 5).field3651;
                return;
            }
            if (arg0 == 5051) {
                int var26 = field1668[--field1681];
                class243 var27 = class419.field6031.method2444(var26, (byte) 13);
                if (var27.field3646 == null) {
                    field1668[field1681++] = 0;
                    return;
                }
                field1668[field1681++] = var27.field3646.length;
                return;
            }
            if (arg0 == 5052) {
                field1681 -= 2;
                int var28 = field1668[field1681];
                int var29 = field1668[field1681 + 1];
                class243 var30 = class419.field6031.method2444(var28, (byte) 33);
                int var31 = var30.field3646[var29];
                field1668[field1681++] = var31;
                return;
            }
            if (arg0 == 5053) {
                int var32 = field1668[--field1681];
                class243 var33 = class419.field6031.method2444(var32, (byte) -122);
                if (var33.field3644 == null) {
                    field1668[field1681++] = 0;
                    return;
                }
                field1668[field1681++] = var33.field3644.length;
                return;
            }
            if (arg0 == 5054) {
                field1681 -= 2;
                int var34 = field1668[field1681];
                int var35 = field1668[field1681 + 1];
                field1668[field1681++] = class419.field6031.method2444(var34, (byte) -116).field3644[var35];
                return;
            }
            if (arg0 == 5055) {
                int var36 = field1668[--field1681];
                field1686[field1678++] = class47.field721.method1063(0, var36).method2839((byte) 110);
                return;
            }
            if (arg0 == 5056) {
                int var37 = field1668[--field1681];
                class472 var38 = class47.field721.method1063(0, var37);
                if (var38.field7223 == null) {
                    field1668[field1681++] = 0;
                    return;
                }
                field1668[field1681++] = var38.field7223.length;
                return;
            }
            if (arg0 == 5057) {
                field1681 -= 2;
                int var39 = field1668[field1681];
                int var40 = field1668[field1681 + 1];
                field1668[field1681++] = class47.field721.method1063(0, var39).field7223[var40];
                return;
            }
            if (arg0 == 5058) {
                field1687 = new class508();
                field1687.field7682 = field1668[--field1681];
                field1687.field7680 = class47.field721.method1063(0, field1687.field7682);
                field1687.field7683 = new int[field1687.field7680.method2838(4117)];
                return;
            }
            if (arg0 == 5059) {
                field1685++;
                class400.method2379((byte) -75, class205.field3215);
                class230.field3508.method221(-1, 0);
                int var41 = class230.field3508.field585;
                class230.field3508.method221(-1, 0);
                class230.field3508.method246((byte) -88, field1687.field7682);
                field1687.field7680.method2845(field1687.field7683, class230.field3508, (byte) -121);
                class230.field3508.method264(10807, class230.field3508.field585 - var41);
                return;
            }
            if (arg0 == 5060) {
                String var42 = field1686[--field1678];
                field1683++;
                class400.method2379((byte) -75, class15.field220);
                class230.field3508.method221(-1, 0);
                int var43 = class230.field3508.field585;
                class230.field3508.method240(var42, 126);
                class230.field3508.method246((byte) -59, field1687.field7682);
                field1687.field7680.method2845(field1687.field7683, class230.field3508, (byte) -36);
                class230.field3508.method264(10807, class230.field3508.field585 - var43);
                return;
            }
            if (arg0 == 5061) {
                field1685++;
                class400.method2379((byte) -75, class205.field3215);
                class230.field3508.method221(-1, 0);
                int var44 = class230.field3508.field585;
                class230.field3508.method221(-1, 1);
                class230.field3508.method246((byte) -57, field1687.field7682);
                field1687.field7680.method2845(field1687.field7683, class230.field3508, (byte) -48);
                class230.field3508.method264(10807, class230.field3508.field585 - var44);
                return;
            }
            if (arg0 == 5062) {
                field1681 -= 2;
                int var45 = field1668[field1681];
                int var46 = field1668[field1681 + 1];
                field1668[field1681++] = class419.field6031.method2444(var45, (byte) -123).field3645[var46];
                return;
            }
            if (arg0 == 5063) {
                field1681 -= 2;
                int var47 = field1668[field1681];
                int var48 = field1668[field1681 + 1];
                field1668[field1681++] = class419.field6031.method2444(var47, (byte) 26).field3648[var48];
                return;
            }
            if (arg0 == 5064) {
                field1681 -= 2;
                int var49 = field1668[field1681];
                int var50 = field1668[field1681 + 1];
                if (var50 == -1) {
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = class419.field6031.method2444(var49, (byte) -119).method1455((char) var50, true);
                return;
            }
            if (arg0 == 5065) {
                field1681 -= 2;
                int var51 = field1668[field1681];
                int var52 = field1668[field1681 + 1];
                if (var52 == -1) {
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = class419.field6031.method2444(var51, (byte) -115).method1458((char) var52, 29849);
                return;
            }
            if (arg0 == 5066) {
                int var53 = field1668[--field1681];
                field1668[field1681++] = class47.field721.method1063(0, var53).method2838(4117);
                return;
            }
            if (arg0 == 5067) {
                field1681 -= 2;
                int var54 = field1668[field1681];
                int var55 = field1668[field1681 + 1];
                int var56 = class47.field721.method1063(0, var54).method2846(var55, (byte) -114).field2085;
                field1668[field1681++] = var56;
                return;
            }
            if (arg0 == 5068) {
                field1681 -= 2;
                int var57 = field1668[field1681];
                int var58 = field1668[field1681 + 1];
                field1687.field7683[var57] = var58;
                return;
            }
            if (arg0 == 5069) {
                field1681 -= 2;
                int var59 = field1668[field1681];
                int var60 = field1668[field1681 + 1];
                field1687.field7683[var59] = var60;
                return;
            }
            if (arg0 == 5070) {
                field1681 -= 3;
                int var61 = field1668[field1681];
                int var62 = field1668[field1681 + 1];
                int var63 = field1668[field1681 + 2];
                class472 var64 = class47.field721.method1063(0, var61);
                if (var64.method2846(var62, (byte) 36).field2085 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1668[field1681++] = var64.method2843(-15682, var63, var62);
                return;
            }
            if (arg0 == 5071) {
                String var65 = field1686[--field1678];
                boolean var66 = field1668[--field1681] == 1;
                class214.method1312(var66, var65, (byte) -52);
                field1668[field1681++] = class507.field7657;
                return;
            }
            if (arg0 == 5072) {
                if (class78.field1390 != null && class310.field4676 < class507.field7657) {
                    field1668[field1681++] = class78.field1390[class310.field4676++] & 0xFFFF;
                    return;
                }
                field1668[field1681++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class310.field4676 = 0;
                return;
            }
            if (arg0 == 5074) {
                field1685++;
                class400.method2379((byte) -75, class205.field3215);
                class230.field3508.method221(-1, 0);
                int var67 = class230.field3508.field585;
                class230.field3508.method221(-1, 2);
                class230.field3508.method246((byte) -92, field1687.field7682);
                field1687.field7680.method2845(field1687.field7683, class230.field3508, (byte) -119);
                class230.field3508.method264(10807, class230.field3508.field585 - var67);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class308.field4662.method1650(86, 27365)) {
                    field1668[field1681++] = 1;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class308.field4662.method1650(82, 27365)) {
                    field1668[field1681++] = 1;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class308.field4662.method1650(81, 27365)) {
                    field1668[field1681++] = 1;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class480.method2899(field1668[--field1681], 75);
                return;
            }
            if (arg0 == 5201) {
                field1668[field1681++] = class418.method2453(0);
                return;
            }
            if (arg0 == 5205) {
                class65.method450(field1668[--field1681], false, -1, 81, -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field1668[--field1681];
                class72 var70 = class492.method2967(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = var70.field1272;
                return;
            }
            if (arg0 == 5207) {
                class72 var71 = class492.method2958(field1668[--field1681]);
                if (var71 != null && var71.field1269 != null) {
                    field1686[field1678++] = var71.field1269;
                    return;
                }
                field1686[field1678++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1668[field1681++] = class270.field4077;
                field1668[field1681++] = class60.field1022;
                return;
            }
            if (arg0 == 5209) {
                field1668[field1681++] = class492.field7497 + class466.field7158;
                field1668[field1681++] = class492.field7494 + class264.field3989;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field1668[--field1681];
                class72 var73 = class492.method2958(var72);
                if (var73 == null) {
                    field1668[field1681++] = 0;
                    field1668[field1681++] = 0;
                    return;
                }
                field1668[field1681++] = var73.field1286 >> 14 & 0x3FFF;
                field1668[field1681++] = var73.field1286 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field1668[--field1681];
                class72 var75 = class492.method2958(var74);
                if (var75 == null) {
                    field1668[field1681++] = 0;
                    field1668[field1681++] = 0;
                    return;
                }
                field1668[field1681++] = var75.field1284 - var75.field1276;
                field1668[field1681++] = var75.field1270 - var75.field1285;
                return;
            }
            if (arg0 == 5212) {
                class334 var76 = class157.method1006(true);
                if (var76 == null) {
                    field1668[field1681++] = -1;
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = var76.field4985;
                int var77 = var76.field4982 << 28 | class492.field7497 + var76.field4980 << 14 | class492.field7494 + var76.field4989;
                field1668[field1681++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class334 var78 = class113.method809(5722);
                if (var78 == null) {
                    field1668[field1681++] = -1;
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = var78.field4985;
                int var79 = var78.field4982 << 28 | class492.field7497 + var78.field4980 << 14 | class492.field7494 + var78.field4989;
                field1668[field1681++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field1668[--field1681];
                class72 var81 = class407.method2408((byte) -70);
                if (var81 != null) {
                    boolean var82 = var81.method530(var80 >> 14 & 0x3FFF, (byte) -17, var80 & 0x3FFF, field1693, var80 >> 28 & 0x3);
                    if (var82) {
                        class402.method2387(field1693[1], field1693[2], -112);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field1681 -= 2;
                int var83 = field1668[field1681];
                int var84 = field1668[field1681 + 1];
                class375 var85 = class492.method2954(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class72 var87 = (class72) var85.method2260((byte) 126); var87 != null; var87 = (class72) var85.method2258(0)) {
                    if (var87.field1272 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field1668[field1681++] = 1;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field1668[--field1681];
                class72 var89 = class492.method2958(var88);
                if (var89 == null) {
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = var89.field1288;
                return;
            }
            if (arg0 == 5220) {
                field1668[field1681++] = class460.field7088 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field1668[--field1681];
                class402.method2387(var90 >> 14 & 0x3FFF, var90 & 0x3FFF, -113);
                return;
            }
            if (arg0 == 5222) {
                class72 var91 = class407.method2408((byte) -107);
                if (var91 != null) {
                    boolean var92 = var91.method535(1, field1693, class492.field7494 + class264.field3989, class492.field7497 + class466.field7158);
                    if (var92) {
                        field1668[field1681++] = field1693[1];
                        field1668[field1681++] = field1693[2];
                        return;
                    }
                    field1668[field1681++] = -1;
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = -1;
                field1668[field1681++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field1681 -= 2;
                int var93 = field1668[field1681];
                int var94 = field1668[field1681 + 1];
                class65.method450(var93, false, var94 & 0x3FFF, 48, var94 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field1668[--field1681];
                class72 var96 = class407.method2408((byte) -91);
                if (var96 != null) {
                    boolean var97 = var96.method530(var95 >> 14 & 0x3FFF, (byte) -93, var95 & 0x3FFF, field1693, var95 >> 28 & 0x3);
                    if (var97) {
                        field1668[field1681++] = field1693[1];
                        field1668[field1681++] = field1693[2];
                        return;
                    }
                    field1668[field1681++] = -1;
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = -1;
                field1668[field1681++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field1668[--field1681];
                class72 var99 = class407.method2408((byte) -101);
                if (var99 != null) {
                    boolean var100 = var99.method535(1, field1693, var98 & 0x3FFF, var98 >> 14 & 0x3FFF);
                    if (var100) {
                        field1668[field1681++] = field1693[1];
                        field1668[field1681++] = field1693[2];
                        return;
                    }
                    field1668[field1681++] = -1;
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = -1;
                field1668[field1681++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class177.method1114(127, field1668[--field1681]);
                return;
            }
            if (arg0 == 5227) {
                field1681 -= 2;
                int var101 = field1668[field1681];
                int var102 = field1668[field1681 + 1];
                class65.method450(var101, true, var102 & 0x3FFF, 122, var102 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class222.field3429 = field1668[--field1681] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1668[field1681++] = class222.field3429 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field1668[--field1681];
                class227.method1369(true, var103);
                return;
            }
            if (arg0 == 5231) {
                field1681 -= 2;
                int var104 = field1668[field1681];
                boolean var105 = field1668[field1681 + 1] == 1;
                if (class265.field4019 != null) {
                    class179 var106 = class265.field4019.method2409(false, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method1121(false);
                        return;
                    }
                    if (var106 == null && var105) {
                        class179 var107 = new class179();
                        class265.field4019.method2413((long) var104, -1, var107);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field1668[--field1681];
                if (class265.field4019 != null) {
                    class179 var109 = class265.field4019.method2409(false, (long) var108);
                    field1668[field1681++] = var109 == null ? 0 : 1;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field1681 -= 2;
                int var110 = field1668[field1681];
                boolean var111 = field1668[field1681 + 1] == 1;
                if (class74.field1321 != null) {
                    class179 var112 = class74.field1321.method2409(false, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method1121(false);
                        return;
                    }
                    if (var112 == null && var111) {
                        class179 var113 = new class179();
                        class74.field1321.method2413((long) var110, -1, var113);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field1668[--field1681];
                if (class74.field1321 != null) {
                    class179 var115 = class74.field1321.method2409(false, (long) var114);
                    field1668[field1681++] = var115 == null ? 0 : 1;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1668[field1681++] = class492.field7467 == null ? -1 : class492.field7467.field1272;
                return;
            }
            if (arg0 == 5236) {
                field1681 -= 2;
                int var116 = field1668[field1681];
                int var117 = field1668[field1681 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class334.method2074(var118, (byte) -125, var116, var119);
                if (var120 < 0) {
                    field1668[field1681++] = -1;
                    return;
                }
                field1668[field1681++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field1681 -= 2;
                int var121 = field1668[field1681];
                int var122 = field1668[field1681 + 1];
                class423.method2477(false, -4, 3, var121, var122);
                field1668[field1681++] = class201.field3190 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class201.field3190 != null) {
                    class423.method2477(false, -4, class463.field7116.field2946, -1, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class7[] var123 = class383.method2296(37);
                field1668[field1681++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field1668[--field1681];
                class7[] var125 = class383.method2296(30);
                field1668[field1681++] = var125[var124].field84;
                field1668[field1681++] = var125[var124].field78;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class463.field7116.field2954;
                int var127 = class463.field7116.field2949;
                int var128 = -1;
                class7[] var129 = class383.method2296(103);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class7 var131 = var129[var130];
                    if (var131.field84 == var126 && var131.field78 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field1668[field1681++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field1668[field1681++] = class331.method2058(-5576);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field1668[--field1681];
                if (var132 >= 1 && var132 <= 2) {
                    class423.method2477(false, -4, var132, -1, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1668[field1681++] = class463.field7116.field2946;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field1668[--field1681];
                if (var133 >= 1 && var133 <= 2) {
                    class463.field7116.field2946 = var133;
                    class463.field7116.method80(class7.field86, (byte) 59);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field1678 -= 2;
                String var134 = field1686[field1678];
                String var135 = field1686[field1678 + 1];
                int var136 = field1668[--field1681];
                field1680++;
                class400.method2379((byte) -75, class369.field5431);
                class230.field3508.method221(-1, class220.method1343(var134, (byte) -82) + class220.method1343(var135, (byte) -82) + 1);
                class230.field3508.method240(var134, 121);
                class230.field3508.method240(var135, 122);
                class230.field3508.method221(-1, var136);
                return;
            }
            if (arg0 == 5401) {
                field1681 -= 2;
                class449.field6920[field1668[field1681]] = (short) class400.method2380(0, field1668[field1681 + 1]);
                class288.field4362.method3025(1);
                class288.field4362.method3029(1064);
                class433.field6358.method2696(-1);
                class119.method831(0);
                return;
            }
            if (arg0 == 5405) {
                field1681 -= 2;
                int var137 = field1668[field1681];
                int var138 = field1668[field1681 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class452.field6956[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field1681 -= 7;
                int var139 = field1668[field1681];
                int var140 = field1668[field1681 + 1] << 1;
                int var141 = field1668[field1681 + 2];
                int var142 = field1668[field1681 + 3];
                int var143 = field1668[field1681 + 4];
                int var144 = field1668[field1681 + 5];
                int var145 = field1668[field1681 + 6];
                if (var139 >= 0 && var139 < 2 && class452.field6956[var139] != null && var140 >= 0 && var140 < class452.field6956[var139].length) {
                    class452.field6956[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class452.field6956[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class452.field6956[field1668[--field1681]].length >> 1;
                field1668[field1681++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class201.field3190 != null) {
                    class423.method2477(false, -4, class463.field7116.field2946, -1, -1);
                }
                if (class174.field2726 != null) {
                    class350.method2131((byte) -125);
                    System.exit(0);
                    return;
                }
                String var147 = class413.field5986 == null ? class374.method2250(2) : class413.field5986;
                class189.method1197(class7.field86, false, class30.field395 == 1, var147, 2);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class226.field3462 != null) {
                    if (class226.field3462.field2803 == null) {
                        var148 = class6.method33((byte) 54, class226.field3462.field2805);
                    } else {
                        var148 = (String) class226.field3462.field2803;
                    }
                }
                field1686[field1678++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field1668[field1681++] = class260.field3942 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class201.field3190 != null) {
                    class423.method2477(false, -4, class463.field7116.field2946, -1, -1);
                }
                String var149 = field1686[--field1678];
                boolean var150 = field1668[--field1681] == 1;
                String var151 = class374.method2250(2) + var149;
                class189.method1197(class7.field86, var150, class30.field395 == 1, var151, 2);
                return;
            }
            if (arg0 == 5422) {
                field1678 -= 2;
                String var152 = field1686[field1678];
                String var153 = field1686[field1678 + 1];
                int var154 = field1668[--field1681];
                if (var152.length() > 0) {
                    if (class12.field142 == null) {
                        class12.field142 = new String[class336.field5044[class298.field4512.field7456]];
                    }
                    class12.field142[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class212.field3287 == null) {
                        class212.field3287 = new String[class336.field5044[class298.field4512.field7456]];
                    }
                    class212.field3287[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field1686[--field1678]);
                return;
            }
            if (arg0 == 5424) {
                field1681 -= 11;
                class282.field4271 = field1668[field1681];
                class116.field1959 = field1668[field1681 + 1];
                class87.field1524 = field1668[field1681 + 2];
                class501.field7590 = field1668[field1681 + 3];
                class480.field7320 = field1668[field1681 + 4];
                class55.field862 = field1668[field1681 + 5];
                class483.field7378 = field1668[field1681 + 6];
                class261.field3963 = field1668[field1681 + 7];
                class431.field6349 = field1668[field1681 + 8];
                class397.field5786 = field1668[field1681 + 9];
                class505.field7631 = field1668[field1681 + 10];
                class472.field7225.method2729(class480.field7320, -9055);
                class472.field7225.method2729(class55.field862, -9055);
                class472.field7225.method2729(class483.field7378, -9055);
                class472.field7225.method2729(class261.field3963, -9055);
                class472.field7225.method2729(class431.field6349, -9055);
                class341.field5097 = null;
                class486.field7406 = null;
                class142.field2313 = null;
                class47.field722 = null;
                class21.field274 = null;
                class405.field5890 = null;
                class501.field7592 = null;
                class473.field7232 = null;
                class504.field7624 = true;
                return;
            }
            if (arg0 == 5425) {
                class511.method3058((byte) 38);
                class504.field7624 = false;
                return;
            }
            if (arg0 == 5426) {
                field1681 -= 2;
                class392.field5740 = field1668[field1681];
                class76.field1372 = field1668[field1681 + 1];
                return;
            }
            if (arg0 == 5427) {
                field1681 -= 2;
                class286.field4324 = field1668[field1681 + 1];
                return;
            }
            if (arg0 == 5428) {
                field1681 -= 2;
                int var155 = field1668[field1681];
                int var156 = field1668[field1681 + 1];
                field1668[field1681++] = class232.method1393(var155, var156, -1008) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class37.method206(field1686[--field1678], (byte) -28, false);
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field1681 -= 4;
                int var157 = field1668[field1681];
                int var158 = field1668[field1681 + 1];
                int var159 = field1668[field1681 + 2];
                int var160 = field1668[field1681 + 3];
                class256.method1533(var158, (var157 & 0x3FFF) - class320.field4827, (byte) -121, var159, false, (var157 >> 14 & 0x3FFF) - class381.field5550, var160);
                return;
            }
            if (arg0 == 5501) {
                field1681 -= 4;
                int var161 = field1668[field1681];
                int var162 = field1668[field1681 + 1];
                int var163 = field1668[field1681 + 2];
                int var164 = field1668[field1681 + 3];
                class327.method2037(var163, var162, var164, (var161 >> 14 & 0x3FFF) - class381.field5550, 0, (var161 & 0x3FFF) - class320.field4827);
                return;
            }
            if (arg0 == 5502) {
                field1681 -= 6;
                int var165 = field1668[field1681];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class463.field7114 = var165;
                int var166 = field1668[field1681 + 1];
                if (var166 + 1 >= class452.field6956[class463.field7114].length >> 1) {
                    throw new RuntimeException();
                }
                class1.field5 = var166;
                class33.field455 = 0;
                class119.field1971 = field1668[field1681 + 2];
                class30.field394 = field1668[field1681 + 3];
                int var167 = field1668[field1681 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class369.field5413 = var167;
                int var168 = field1668[field1681 + 5];
                if (var168 + 1 >= class452.field6956[class369.field5413].length >> 1) {
                    throw new RuntimeException();
                }
                class332.field4970 = var168;
                class408.field5928 = 3;
                return;
            }
            if (arg0 == 5503) {
                class119.method833(-1);
                return;
            }
            if (arg0 == 5504) {
                field1681 -= 2;
                class25.method131(0, (byte) 76, field1668[field1681], field1668[field1681 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field1668[field1681++] = (int) class376.field5483 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1668[field1681++] = (int) class23.field289 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class213.method1308(9201);
                return;
            }
            if (arg0 == 5508) {
                class313.method1872((byte) -7);
                return;
            }
            if (arg0 == 5509) {
                class467.method2828(true);
                return;
            }
            if (arg0 == 5510) {
                class176.method1103((byte) -69);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field1668[--field1681];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class381.field5550;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class150.field2422) {
                    var172 = class150.field2422;
                }
                int var173 = var171 - class320.field4827;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class21.field272) {
                    var173 = class21.field272;
                }
                class158.field2488 = (var172 << 7) + 64;
                class493.field7515 = (var173 << 7) + 64;
                class408.field5928 = 4;
                return;
            }
            if (arg0 == 5512) {
                class231.method1388((byte) 119);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field1678 -= 2;
                String var174 = field1686[field1678];
                String var175 = field1686[field1678 + 1];
                int var176 = field1668[--field1681];
                if (client.field2992 != 10) {
                    return;
                }
                if (class41.field601 == 0 && class490.field7451 == 0 && class74.field1320 == 0 && class297.field4509 == 0) {
                    class334.method2071(-128, var174, var176, var175);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class491.method2953((byte) -80);
                return;
            }
            if (arg0 == 5602) {
                if (class490.field7451 == 0) {
                    class211.field3282 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field1681 -= 4;
                if (client.field2992 != 10) {
                    return;
                }
                if (class41.field601 == 0 && class490.field7451 == 0 && class74.field1320 == 0 && class297.field4509 == 0) {
                    class309.method1853(field1668[field1681], field1668[field1681 + 1], field1668[field1681 + 3], false, field1668[field1681 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field1678--;
                if (client.field2992 != 10) {
                    return;
                }
                if (class41.field601 == 0 && class490.field7451 == 0 && class74.field1320 == 0 && class297.field4509 == 0) {
                    class405.method2401(class212.method1305(false, field1686[field1678]), 8747);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field1678 -= 3;
                field1681 -= 7;
                if (client.field2992 != 10) {
                    return;
                }
                if (class41.field601 == 0 && class490.field7451 == 0 && class74.field1320 == 0 && class297.field4509 == 0) {
                    class424.method2493(field1668[field1681 + 2], field1668[field1681], class212.method1305(false, field1686[field1678]), field1668[field1681 + 3], 34, field1668[field1681 + 1], field1668[field1681 + 6] == 1, field1686[field1678 + 1], field1668[field1681 + 5] == 1, field1686[field1678 + 2], field1668[field1681 + 4] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class74.field1320 == 0) {
                    class407.field5909 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1668[field1681++] = class211.field3282;
                return;
            }
            if (arg0 == 5608) {
                field1668[field1681++] = class32.field417;
                return;
            }
            if (arg0 == 5609) {
                field1668[field1681++] = class407.field5909;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field1686[field1678++] = class10.field138.length > var177 ? class415.method2443(class10.field138[var177], 6) : "";
                }
                class10.field138 = null;
                return;
            }
            if (arg0 == 5611) {
                field1668[field1681++] = class120.field2000;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field1668[--field1681];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class463.field7116.field2968 = var178;
                class73.method543((byte) -5);
                class463.field7116.method80(class7.field86, (byte) 112);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6002) {
                class463.field7116.method77(field1668[--field1681] == 1, (byte) 117);
                class73.method543((byte) -5);
                class473.method2847((byte) 0);
                class463.field7116.method80(class7.field86, (byte) -53);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6003) {
                class463.field7116.field2963 = field1668[--field1681] == 1;
                class473.method2847((byte) 0);
                class463.field7116.method80(class7.field86, (byte) -98);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6005) {
                class463.field7116.field2944 = field1668[--field1681] == 1;
                class73.method543((byte) -5);
                class463.field7116.method80(class7.field86, (byte) 45);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6006) {
                class463.field7116.field2962 = field1668[--field1681] == 1;
                class345.field5116.method1892(!class463.field7116.field2962);
                class463.field7116.method80(class7.field86, (byte) 125);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6007) {
                class463.field7116.field2942 = field1668[--field1681];
                class463.field7116.method80(class7.field86, (byte) -55);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6008) {
                class463.field7116.field2964 = field1668[--field1681] == 1;
                class463.field7116.method80(class7.field86, (byte) 81);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6009) {
                class463.field7116.field2948 = field1668[--field1681] == 1;
                class73.method543((byte) -5);
                class463.field7116.method80(class7.field86, (byte) 72);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6010) {
                class463.field7116.field2953 = field1668[--field1681] == 1;
                class463.field7116.method80(class7.field86, (byte) -128);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field1668[--field1681];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class73.method543((byte) -5);
                class463.field7116.field2974 = var179;
                class463.field7116.method80(class7.field86, (byte) 73);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6012) {
                class463.field7116.field2972 = field1668[--field1681] == 1;
                class200.method1245(0);
                class216.method1330(true);
                class463.field7116.method80(class7.field86, (byte) -66);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6014) {
                class463.field7116.field2943 = field1668[--field1681] == 1;
                class73.method543((byte) -5);
                class463.field7116.method80(class7.field86, (byte) 81);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6015) {
                class463.field7116.field2947 = field1668[--field1681] == 1;
                class73.method543((byte) -5);
                class463.field7116.method80(class7.field86, (byte) 109);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field1668[--field1681];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class463.field7116.field2970 = var180;
                class421.method2461((byte) -28, class30.field395);
                class463.field7116.method80(class7.field86, (byte) -117);
                return;
            }
            if (arg0 == 6017) {
                class463.field7116.field2957 = field1668[--field1681] == 1;
                class299.method1805((byte) 93);
                class463.field7116.method80(class7.field86, (byte) 80);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field1668[--field1681];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class463.field7116.field2941 = var181;
                class463.field7116.method80(class7.field86, (byte) -125);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field1668[--field1681];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class463.field7116.field2960 != var182) {
                    if (class463.field7116.field2960 == 0 && class338.field5058 != -1) {
                        class88.method657(class471.field7207, var182, 0, (byte) 90, false, class338.field5058);
                        class127.field2053 = false;
                    } else if (var182 == 0) {
                        class284.method1738(-35);
                        class127.field2053 = false;
                    } else {
                        class508.method3040(-28375, var182);
                    }
                    class463.field7116.field2960 = var182;
                }
                class463.field7116.method80(class7.field86, (byte) 68);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field1668[--field1681];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class463.field7116.field2952 = var183;
                class463.field7116.method80(class7.field86, (byte) -47);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6021) {
                class463.field7116.field208 = field1668[--field1681] == 1;
                class473.method2847((byte) 0);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field1668[--field1681];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class322.field4841 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class7.method39(0, var184);
                class463.field7116.method80(class7.field86, (byte) 51);
                class388.field5623 = false;
                field1668[field1681++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field1668[--field1681];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class463.field7116.field2959 = var186;
                class463.field7116.method80(class7.field86, (byte) 82);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field1668[--field1681];
                if (var187 < 0 || var187 > class91.method680(class322.field4841, true)) {
                    var187 = 0;
                }
                class463.field7116.field2971 = var187;
                class463.field7116.method80(class7.field86, (byte) 75);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field1668[--field1681];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class328.method2040(var188 == 1, -1);
                return;
            }
            if (arg0 == 6028) {
                class463.field7116.field2951 = field1668[--field1681] != 0;
                class463.field7116.method80(class7.field86, (byte) 80);
                return;
            }
            if (arg0 == 6029) {
                class463.field7116.field2942 = field1668[--field1681];
                class463.field7116.method80(class7.field86, (byte) -46);
                return;
            }
            if (arg0 == 6030) {
                class463.field7116.field2950 = field1668[--field1681] != 0;
                class463.field7116.method80(class7.field86, (byte) 62);
                class73.method543((byte) -5);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field1668[--field1681];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class421.method2461((byte) -28, var189);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field1668[--field1681];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class463.field7116.field2945 = var190;
                class463.field7116.method80(class7.field86, (byte) 109);
                class388.field5623 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field1668[--field1681];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class463.field7116.field2940 = var191;
                class463.field7116.method80(class7.field86, (byte) 118);
                return;
            }
            if (arg0 == 6035) {
                class463.field7116.field213 = field1668[--field1681] == 1;
                class73.method543((byte) -5);
                class473.method2847((byte) 0);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1668[field1681++] = class463.field7116.field2968;
                return;
            }
            if (arg0 == 6102) {
                field1668[field1681++] = class463.field7116.method78(0, class30.field395) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1668[field1681++] = class463.field7116.field2963 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1668[field1681++] = class463.field7116.field2944 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field1668[field1681++] = class463.field7116.field2962 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1668[field1681++] = class463.field7116.field2942;
                return;
            }
            if (arg0 == 6108) {
                field1668[field1681++] = class463.field7116.field2964 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field1668[field1681++] = class463.field7116.field2948 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1668[field1681++] = class463.field7116.field2953 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1668[field1681++] = class463.field7116.field2974;
                return;
            }
            if (arg0 == 6112) {
                field1668[field1681++] = class463.field7116.field2972 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1668[field1681++] = class463.field7116.field2943 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1668[field1681++] = class463.field7116.field2947 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1668[field1681++] = class463.field7116.field2970;
                return;
            }
            if (arg0 == 6117) {
                field1668[field1681++] = class463.field7116.field2957 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1668[field1681++] = class463.field7116.field2941;
                return;
            }
            if (arg0 == 6119) {
                field1668[field1681++] = class463.field7116.field2960;
                return;
            }
            if (arg0 == 6120) {
                field1668[field1681++] = class463.field7116.field2952;
                return;
            }
            if (arg0 == 6121) {
                field1668[field1681++] = class345.field5116.method1903() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field1668[field1681++] = class22.method114(-123);
                return;
            }
            if (arg0 == 6124) {
                field1668[field1681++] = class463.field7116.field2959;
                return;
            }
            if (arg0 == 6125) {
                field1668[field1681++] = class463.field7116.field2971;
                return;
            }
            if (arg0 == 6126) {
                field1668[field1681++] = class345.field5116.method1949() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field1668[field1681++] = class463.field7116.field2955 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1668[field1681++] = class463.field7116.field2951 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1668[field1681++] = class463.field7116.field2942;
                return;
            }
            if (arg0 == 6130) {
                field1668[field1681++] = class463.field7116.field2950 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1668[field1681++] = class30.field395;
                return;
            }
            if (arg0 == 6132) {
                field1668[field1681++] = class463.field7116.field2945;
                return;
            }
            if (arg0 == 6133) {
                field1668[field1681++] = class260.field3942 == 1 || class260.field3942 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field1668[field1681++] = class91.method680(class322.field4841, true);
                return;
            }
            if (arg0 == 6135) {
                field1668[field1681++] = class463.field7116.field2940;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field1681 -= 2;
                class157.field2475 = (short) field1668[field1681];
                if (class157.field2475 <= 0) {
                    class157.field2475 = 256;
                }
                class456.field7001 = (short) field1668[field1681 + 1];
                if (class456.field7001 <= 0) {
                    class456.field7001 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field1681 -= 2;
                class350.field5156 = (short) field1668[field1681];
                if (class350.field5156 <= 0) {
                    class350.field5156 = 256;
                }
                class420.field6037 = (short) field1668[field1681 + 1];
                if (class420.field6037 <= 0) {
                    class420.field6037 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field1681 -= 4;
                class375.field5472 = (short) field1668[field1681];
                if (class375.field5472 <= 0) {
                    class375.field5472 = 1;
                }
                class112.field1904 = (short) field1668[field1681 + 1];
                if (class112.field1904 <= 0) {
                    class112.field1904 = 32767;
                } else if (class112.field1904 < class375.field5472) {
                    class112.field1904 = class375.field5472;
                }
                class302.field4542 = (short) field1668[field1681 + 2];
                if (class302.field4542 <= 0) {
                    class302.field4542 = 1;
                }
                class463.field7115 = (short) field1668[field1681 + 3];
                if (class463.field7115 <= 0) {
                    class463.field7115 = 32767;
                    return;
                }
                if (class463.field7115 < class302.field4542) {
                    class463.field7115 = class302.field4542;
                }
                return;
            }
            if (arg0 == 6203) {
                class244.method1467(false, class427.field6181.field6175, 11746, 0, 0, class427.field6181.field6126);
                field1668[field1681++] = class384.field5590;
                field1668[field1681++] = class100.field1815;
                return;
            }
            if (arg0 == 6204) {
                field1668[field1681++] = class350.field5156;
                field1668[field1681++] = class420.field6037;
                return;
            }
            if (arg0 == 6205) {
                field1668[field1681++] = class157.field2475;
                field1668[field1681++] = class456.field7001;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1668[field1681++] = (int) (class344.method2111((byte) -106) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1668[field1681++] = (int) (class344.method2111((byte) -44) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field1681 -= 3;
                int var192 = field1668[field1681];
                int var193 = field1668[field1681 + 1];
                int var194 = field1668[field1681 + 2];
                field1692.clear();
                field1692.set(11, 12);
                field1692.set(var194, var193, var192);
                field1668[field1681++] = (int) (field1692.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field1692.clear();
                field1692.setTime(new Date(class344.method2111((byte) -30)));
                field1668[field1681++] = field1692.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var195 = field1668[--field1681];
                boolean var196 = true;
                if (var195 < 0) {
                    var196 = (var195 + 1) % 4 == 0;
                } else if (var195 < 1582) {
                    var196 = var195 % 4 == 0;
                } else if (var195 % 4 != 0) {
                    var196 = false;
                } else if (var195 % 100 != 0) {
                    var196 = true;
                } else if (var195 % 400 != 0) {
                    var196 = false;
                }
                field1668[field1681++] = var196 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1668[field1681++] = class329.method2048(29709) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1668[field1681++] = class62.method434((byte) 11) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (client.field2992 == 10 && class41.field601 == 0 && class490.field7451 == 0 && class74.field1320 == 0) {
                    field1668[field1681++] = class511.method3056(99) == -1 ? 0 : 1;
                    return;
                }
                field1668[field1681++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class471 var197 = class206.method1266((byte) -104);
                if (var197 != null) {
                    field1668[field1681++] = var197.field7208;
                    field1668[field1681++] = var197.field4916;
                    field1686[field1678++] = var197.field7210;
                    class308 var198 = var197.method2835(127);
                    field1668[field1681++] = var198.field4660;
                    field1686[field1678++] = var198.field4663;
                    field1668[field1681++] = var197.field4914;
                    field1668[field1681++] = var197.field7209;
                    return;
                }
                field1668[field1681++] = -1;
                field1668[field1681++] = 0;
                field1686[field1678++] = "";
                field1668[field1681++] = 0;
                field1686[field1678++] = "";
                field1668[field1681++] = 0;
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class471 var199 = class273.method1661((byte) -75);
                if (var199 != null) {
                    field1668[field1681++] = var199.field7208;
                    field1668[field1681++] = var199.field4916;
                    field1686[field1678++] = var199.field7210;
                    class308 var200 = var199.method2835(110);
                    field1668[field1681++] = var200.field4660;
                    field1686[field1678++] = var200.field4663;
                    field1668[field1681++] = var199.field4914;
                    field1668[field1681++] = var199.field7209;
                    return;
                }
                field1668[field1681++] = -1;
                field1668[field1681++] = 0;
                field1686[field1678++] = "";
                field1668[field1681++] = 0;
                field1686[field1678++] = "";
                field1668[field1681++] = 0;
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var201 = field1668[--field1681];
                if (client.field2992 == 10 && class41.field601 == 0 && class490.field7451 == 0 && class74.field1320 == 0) {
                    field1668[field1681++] = class194.method1210((byte) -84, var201) ? 1 : 0;
                    return;
                }
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class463.field7116.field2966 = field1668[--field1681];
                class463.field7116.method80(class7.field86, (byte) 106);
                return;
            }
            if (arg0 == 6505) {
                field1668[field1681++] = class463.field7116.field2966;
                return;
            }
            if (arg0 == 6506) {
                int var202 = field1668[--field1681];
                class471 var203 = class96.method714(var202, 0);
                if (var203 != null) {
                    field1668[field1681++] = var203.field4916;
                    field1686[field1678++] = var203.field7210;
                    class308 var204 = var203.method2835(126);
                    field1668[field1681++] = var204.field4660;
                    field1686[field1678++] = var204.field4663;
                    field1668[field1681++] = var203.field4914;
                    field1668[field1681++] = var203.field7209;
                    return;
                }
                field1668[field1681++] = -1;
                field1686[field1678++] = "";
                field1668[field1681++] = 0;
                field1686[field1678++] = "";
                field1668[field1681++] = 0;
                field1668[field1681++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field1681 -= 4;
                int var205 = field1668[field1681];
                boolean var206 = field1668[field1681 + 1] == 1;
                int var207 = field1668[field1681 + 2];
                boolean var208 = field1668[field1681 + 3] == 1;
                class159.method1020(var208, var205, var206, var207, false);
                return;
            }
            if (arg0 == 6508) {
                class101.method756((byte) 97);
                return;
            }
            if (arg0 == 6509) {
                if (client.field2992 != 10) {
                    return;
                }
                class304.field4622 = field1668[--field1681] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class463.field7116.field2961 = field1668[--field1681] == 1;
                class463.field7116.method80(class7.field86, (byte) -107);
                return;
            }
            if (arg0 == 6601) {
                field1668[field1681++] = class463.field7116.field2961 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class295.field4485 == class169.field2626) {
            if (arg0 == 6700) {
                int var209 = class245.field3741.method2411(true);
                if (class375.field5475 != -1) {
                    var209++;
                }
                field1668[field1681++] = var209;
                return;
            }
            if (arg0 == 6701) {
                int var210 = field1668[--field1681];
                if (class375.field5475 != -1) {
                    if (var210 == 0) {
                        field1668[field1681++] = class375.field5475;
                        return;
                    }
                    var210--;
                }
                class394 var211 = (class394) class245.field3741.method2415((byte) 52);
                while (var210-- > 0) {
                    var211 = (class394) class245.field3741.method2416((byte) -120);
                }
                field1668[field1681++] = var211.field5750;
                return;
            }
            if (arg0 == 6702) {
                int var212 = field1668[--field1681];
                if (class409.field5933[var212] == null) {
                    field1686[field1678++] = "";
                    return;
                }
                String var213 = class409.field5933[var212][0].field6148;
                if (var213 == null) {
                    field1686[field1678++] = "";
                    return;
                }
                field1686[field1678++] = var213.substring(0, var213.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var214 = field1668[--field1681];
                if (class409.field5933[var214] == null) {
                    field1668[field1681++] = 0;
                    return;
                }
                field1668[field1681++] = class409.field5933[var214].length;
                return;
            }
            if (arg0 == 6704) {
                field1681 -= 2;
                int var215 = field1668[field1681];
                int var216 = field1668[field1681 + 1];
                if (class409.field5933[var215] == null) {
                    field1686[field1678++] = "";
                    return;
                }
                String var217 = class409.field5933[var215][var216].field6148;
                if (var217 == null) {
                    field1686[field1678++] = "";
                    return;
                }
                field1686[field1678++] = var217;
                return;
            }
            if (arg0 == 6705) {
                field1681 -= 2;
                int var218 = field1668[field1681];
                int var219 = field1668[field1681 + 1];
                if (class409.field5933[var218] == null) {
                    field1668[field1681++] = 0;
                    return;
                }
                field1668[field1681++] = class409.field5933[var218][var219].field6268;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field1681 -= 3;
                int var220 = field1668[field1681];
                int var221 = field1668[field1681 + 1];
                int var222 = field1668[field1681 + 2];
                class377.method2271(var222, var220 << 16 | var221, -78, "", 1);
                return;
            }
            if (arg0 == 6708) {
                field1681 -= 3;
                int var223 = field1668[field1681];
                int var224 = field1668[field1681 + 1];
                int var225 = field1668[field1681 + 2];
                class377.method2271(var225, var223 << 16 | var224, -86, "", 2);
                return;
            }
            if (arg0 == 6709) {
                field1681 -= 3;
                int var226 = field1668[field1681];
                int var227 = field1668[field1681 + 1];
                int var228 = field1668[field1681 + 2];
                class377.method2271(var228, var226 << 16 | var227, -93, "", 3);
                return;
            }
            if (arg0 == 6710) {
                field1681 -= 3;
                int var229 = field1668[field1681];
                int var230 = field1668[field1681 + 1];
                int var231 = field1668[field1681 + 2];
                class377.method2271(var231, var229 << 16 | var230, -72, "", 4);
                return;
            }
            if (arg0 == 6711) {
                field1681 -= 3;
                int var232 = field1668[field1681];
                int var233 = field1668[field1681 + 1];
                int var234 = field1668[field1681 + 2];
                class377.method2271(var234, var232 << 16 | var233, -97, "", 5);
                return;
            }
            if (arg0 == 6712) {
                field1681 -= 3;
                int var235 = field1668[field1681];
                int var236 = field1668[field1681 + 1];
                int var237 = field1668[field1681 + 2];
                class377.method2271(var237, var235 << 16 | var236, -19, "", 6);
                return;
            }
            if (arg0 == 6713) {
                field1681 -= 3;
                int var238 = field1668[field1681];
                int var239 = field1668[field1681 + 1];
                int var240 = field1668[field1681 + 2];
                class377.method2271(var240, var238 << 16 | var239, 113, "", 7);
                return;
            }
            if (arg0 == 6714) {
                field1681 -= 3;
                int var241 = field1668[field1681];
                int var242 = field1668[field1681 + 1];
                int var243 = field1668[field1681 + 2];
                class377.method2271(var243, var241 << 16 | var242, -73, "", 8);
                return;
            }
            if (arg0 == 6715) {
                field1681 -= 3;
                int var244 = field1668[field1681];
                int var245 = field1668[field1681 + 1];
                int var246 = field1668[field1681 + 2];
                class377.method2271(var246, var244 << 16 | var245, -44, "", 9);
                return;
            }
            if (arg0 == 6716) {
                field1681 -= 3;
                int var247 = field1668[field1681];
                int var248 = field1668[field1681 + 1];
                int var249 = field1668[field1681 + 2];
                class377.method2271(var249, var247 << 16 | var248, -111, "", 10);
                return;
            }
            if (arg0 == 6717) {
                field1681 -= 3;
                int var250 = field1668[field1681];
                int var251 = field1668[field1681 + 1];
                int var252 = field1668[field1681 + 2];
                class427 var253 = class59.method419(var252, 12782, var250 << 16 | var251);
                class62.method432(false);
                class54 var254 = client.method1176(var253);
                class316.method1884((byte) 72, var254.field817, var253, var254.method376(1));
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var255 = field1668[--field1681];
                class173 var256 = class22.field281.method1840((byte) 61, var255);
                if (var256.field2702 == null) {
                    field1686[field1678++] = "";
                    return;
                }
                field1686[field1678++] = var256.field2702;
                return;
            }
            if (arg0 == 6801) {
                int var257 = field1668[--field1681];
                class173 var258 = class22.field281.method1840((byte) 119, var257);
                field1668[field1681++] = var258.field2689;
                return;
            }
            if (arg0 == 6802) {
                int var259 = field1668[--field1681];
                class173 var260 = class22.field281.method1840((byte) 122, var259);
                field1668[field1681++] = var260.field2701;
                return;
            }
            if (arg0 == 6803) {
                int var261 = field1668[--field1681];
                class173 var262 = class22.field281.method1840((byte) 41, var261);
                field1668[field1681++] = var262.field2684;
                return;
            }
            if (arg0 == 6804) {
                field1681 -= 2;
                int var263 = field1668[field1681];
                int var264 = field1668[field1681 + 1];
                class85 var265 = class76.field1364.method1267((byte) 41, var264);
                if (var265.method602((byte) 89)) {
                    field1686[field1678++] = class22.field281.method1840((byte) 62, var263).method1080(var264, 119, var265.field1436);
                    return;
                }
                field1668[field1681++] = class22.field281.method1840((byte) 116, var263).method1087(var264, var265.field1423, true);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
