import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "J")
    public long field28 = 0L;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lsk;")
    public class114 field31;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Ljc;")
    public static class246 field20;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lmi;")
    public static final class266 method5(byte arg0) {
        class140.field2053 = 0;
        if (arg0 < 121) {
            method10((Component) null, 59);
        }
        field18++;
        return class265.method1765((byte) -92);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method6(int arg0) {
        field24++;
        if (arg0 != -1004) {
            field19 = 112;
        }
        if (class251.field3814 != null || class276.field4158 != null) {
            return;
        }
        int var1 = class246.field3676;
        if (!class218.field3275) {
            if (var1 == 1 && class218.field3278 > 0) {
                short var2 = class84.field1339[class218.field3278 - 1];
                if (var2 == 29 || var2 == 26 || var2 == 38 || var2 == 14 || var2 == 58 || var2 == 25 || var2 == 45 || var2 == 22 || var2 == 47 || var2 == 49 || var2 == 1 || var2 == 1003) {
                    int var3 = class71.field1135[class218.field3278 - 1];
                    int var4 = class58.field916[class218.field3278 - 1];
                    class289 var5 = class89.method574((byte) -15, var4);
                    class268 var6 = client.method972(var5);
                    if (var6.method1799(-7933) || var6.method1798(-4800)) {
                        class89.field1400 = 0;
                        class175.field2662 = false;
                        if (class251.field3814 != null) {
                            class295.method1980(class251.field3814, 0);
                        }
                        class251.field3814 = class89.method574((byte) -15, var4);
                        class147.field2140 = class188.field2872;
                        class53.field869 = var3;
                        class133.field1947 = class205.field3076;
                        class295.method1980(class251.field3814, 0);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class158.field2417 == 1 && class218.field3278 > 2 || class16.method116(29960, class218.field3278 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class218.field3278 > 0 || class176.field2691 == 1) {
                class295.method1977((byte) -123);
            }
            if (var1 == 1 && class218.field3278 > 0 || class176.field2691 == 2) {
                class61.method408(126);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class91.field1438;
            int var8 = class203.field3065;
            if (var7 < class213.field3190 - 10 || var7 > class283.field4239 + class213.field3190 + 10 || class236.field3558 - 10 > var8 || var8 > class32.field470 + class236.field3558 + 10) {
                class218.field3275 = false;
                class8.method40(0, class213.field3190, class283.field4239, class32.field470, class236.field3558);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class236.field3558;
        int var10 = class213.field3190;
        int var11 = class283.field4239;
        int var12 = class205.field3076;
        int var13 = class188.field2872;
        int var14 = -1;
        for (int var15 = 0; var15 < class218.field3278; var15++) {
            if (class141.field2060) {
                int var16 = (class218.field3278 - var15 - 1) * 15 + var9 + 33;
                if (var12 > var10 && var10 + var11 > var12 && var13 > (var16 - 13) && var16 + 3 > var13) {
                    var14 = var15;
                }
            } else {
                int var17 = (class218.field3278 - var15 - 1) * 15 + var9 + 31;
                if (var12 > var10 && var12 < var10 + var11 && (var17 - 13) < var13 && var17 + 3 > var13) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            class252.method1654(81, var14);
        }
        class218.field3275 = false;
        class8.method40(arg0 ^ 0xFFFFFC14, class213.field3190, class283.field4239, class32.field470, class236.field3558);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILge;I)V")
    public static final void method7(int arg0, int arg1, int arg2, class72 arg3, int arg4) {
        field30++;
        if (class218.field3278 >= 400) {
            return;
        }
        if (arg3.field1196 != null) {
            arg3 = arg3.method487(-1);
        }
        if (arg0 != 10) {
            method7(-49, -112, -71, (class72) null, 18);
        }
        if (arg3 == null || !arg3.field1204) {
            return;
        }
        String var5 = arg3.field1174;
        if (arg3.field1144 != 0) {
            String var6 = class166.field2554 == 1 ? class127.field1910 : class183.field2770;
            var5 = var5 + class276.method1828((byte) 42, arg3.field1144, class165.field2537.field1647) + " (" + var6 + arg3.field1144 + ")";
        }
        if (class114.field1738 == 1) {
            class180.field2738++;
            client.method957(class84.field1337, arg1, (short) 17, 0, (long) arg4, arg2, class251.field3817, class241.field3624 + " -> <col=ffff00>" + var5);
        } else if (class153.field2305) {
            class144 var7 = class233.field3510 == -1 ? null : class24.method155(class233.field3510, (byte) -33);
            if ((class206.field3092 & 0x2) != 0) {
                if (var7 == null || arg3.method484(class233.field3510, var7.field2107, 16384) != var7.field2107) {
                    client.method957(class289.field4390, arg1, (short) 20, 0, (long) arg4, arg2, class48.field770, class210.field3163 + " -> <col=ffff00>" + var5);
                    class154.field2326++;
                }
                return;
            }
        } else {
            class171.field2597++;
            String[] var8 = arg3.field1186;
            if (class71.field1131) {
                var8 = class10.method46(false, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class166.field2554 != 0 || !var8[var9].equalsIgnoreCase(class54.field883))) {
                        class242.field3629++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 34;
                        }
                        if (var9 == 1) {
                            var10 = 23;
                        }
                        if (var9 == 2) {
                            var10 = 12;
                        }
                        if (var9 == 3) {
                            var10 = 7;
                        }
                        int var11 = -1;
                        if (arg3.field1182 == var9) {
                            var11 = arg3.field1206;
                        }
                        if (var9 == 4) {
                            var10 = 2;
                        }
                        if (arg3.field1146 == var9) {
                            var11 = arg3.field1163;
                        }
                        client.method957(var11, arg1, var10, 0, (long) arg4, arg2, var8[var9], "<col=ffff00>" + var5);
                    }
                }
            }
            if (class166.field2554 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class54.field883)) {
                        short var13 = 0;
                        if (var12 == 0) {
                            var13 = 34;
                        }
                        short var14 = 0;
                        if (var12 == 1) {
                            var13 = 23;
                        }
                        class120.field1815++;
                        if (var12 == 2) {
                            var13 = 12;
                        }
                        if (var12 == 3) {
                            var13 = 7;
                        }
                        if (arg3.field1144 > class165.field2537.field1647) {
                            var14 = 2000;
                        }
                        if (var12 == 4) {
                            var13 = 2;
                        }
                        if (var13 != 0) {
                            var13 += var14;
                        }
                        client.method957(arg3.field1156, arg1, var13, 0, (long) arg4, arg2, var8[var12], "<col=ffff00>" + var5);
                    }
                }
            }
            client.method957(class116.field1766, arg1, (short) 1001, arg0 ^ 0xA, (long) arg4, arg2, class67.field1068, "<col=ffff00>" + var5);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field20 = null;
        if (arg0 > -112) {
            field20 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method9(String arg0, int arg1) {
        field29++;
        byte var2 = 2;
        int var3 = arg0.length();
        if (arg1 != 1207) {
            return null;
        }
        char[] var4 = new char[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg0.charAt(var5);
            if (var2 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var2 == 2 || Character.isUpperCase(var6)) {
                var6 = class66.method446(181, var6);
            }
            if (Character.isLetter(var6)) {
                var2 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var2 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method10(Component arg0, int arg1) {
        arg0.addMouseListener(class44.field704);
        arg0.addMouseMotionListener(class44.field704);
        if (arg1 != -1) {
            method7(-78, -1, -69, (class72) null, -27);
        }
        arg0.addFocusListener(class44.field704);
        field32++;
    }
}
