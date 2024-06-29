import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 implements class6 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lk;")
    private class69 field22 = new class69();

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    private int field36 = 0;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    private int field41 = 128;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "D")
    private double field37 = 1.0D;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lmd;")
    private class87 field38;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[Ltb;")
    private class134[] field27;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Ltd;")
    public static class136 field24 = class145.method1172("logo", 45);

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lk;")
    public static class69 field26 = new class69();

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Ltd;")
    public static class136 field43 = class145.method1172("Cabbage", 45);

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Ltd;")
    private static class136 field44 = class145.method1172("Location", 45);

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "Ltd;")
    public static class136 field47 = field44;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "B")
    public static byte field46;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[Lnb;")
    public static class92[] field45;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Z")
    public final boolean method6(int arg0, boolean arg1) {
        field40++;
        if (!arg1) {
            this.method16((byte) -29, -46);
        }
        return this.field41 == 64;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)I")
    public final int method7(int arg0, byte arg1) {
        field33++;
        if (arg1 != 120) {
            this.method7(-91, (byte) 27);
        }
        return this.field27[arg0] == null ? 0 : this.field27[arg0].field3150;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field47 = null;
        int var1 = -105 % ((arg0 + 10) / 60);
        field24 = null;
        field43 = null;
        field26 = null;
        field44 = null;
        field45 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
    public static final void method9(int arg0, int arg1, int arg2) {
        field28++;
        class62 var3 = class131.method1067(false, arg1);
        int var4 = var3.field1330;
        if (arg0 >= -49) {
            return;
        }
        int var5 = var3.field1325;
        int var6 = var3.field1332;
        int var7 = class76.field1712[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class18.field371[var4] = method13(class154.method1207(~var8, class18.field371[var4]), class154.method1207(arg2 << var5, var8));
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method10(int arg0, Component arg1) {
        if (arg0 <= 122) {
            field47 = null;
        }
        arg1.removeKeyListener(class79.field1808);
        arg1.removeFocusListener(class79.field1808);
        field42++;
        class78.field1798 = -1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(DB)V")
    public final void method11(double arg0, byte arg1) {
        this.field37 = arg0;
        if (arg1 < 107) {
            field26 = null;
        }
        field32++;
        this.method18(false);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z")
    public static final boolean method12(boolean arg0) {
        field21++;
        if (class133.field3140 == null) {
            return false;
        }
        try {
            int var1 = class133.field3140.method142((byte) 102);
            if (var1 == 0) {
                return false;
            }
            if (class49.field1094 == -1) {
                var1--;
                class133.field3140.method136(47, class4.field70.field2960, 0, 1);
                class4.field70.field2995 = 0;
                class49.field1094 = class4.field70.method874(255);
                class11.field179 = class87.field2040[class49.field1094];
            }
            if (class11.field179 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class133.field3140.method136(98, class4.field70.field2960, 0, 1);
                class11.field179 = class4.field70.field2960[0] & 0xFF;
            }
            if (class11.field179 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class133.field3140.method136(49, class4.field70.field2960, 0, 2);
                var1 -= 2;
                class4.field70.field2995 = 0;
                class11.field179 = class4.field70.method1020(!arg0);
            }
            if (class11.field179 > var1) {
                return false;
            }
            class4.field70.field2995 = 0;
            class133.field3140.method136(113, class4.field70.field2960, 0, class11.field179);
            class3.field48 = 0;
            class101.field2425 = class127.field2958;
            class127.field2958 = class9.field163;
            class9.field163 = class49.field1094;
            if (class49.field1094 == 221) {
                class136 var2 = class4.field70.method1010(-14330);
                Object[] var3 = new Object[var2.method1119(-10511) + 1];
                for (int var4 = var2.method1119(-10511) - 1; var4 >= 0; var4--) {
                    if (var2.method1094(false, var4) == 115) {
                        var3[var4 + 1] = class4.field70.method1010(-14330);
                    } else {
                        var3[var4 + 1] = Integer.valueOf(class4.field70.method986(-109));
                    }
                }
                var3[0] = Integer.valueOf(class4.field70.method986(-72));
                class139 var5 = new class139();
                var5.field3244 = var3;
                class96.method734(-9063, var5);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 6) {
                int var6 = class4.field70.method1018(4);
                int var7 = class4.field70.method1020(!arg0);
                class52.field1177[var7] = var6;
                if (class18.field371[var7] != var6) {
                    class18.field371[var7] = var6;
                    class77.method560(var7, (byte) -52);
                }
                class155.field3562[class154.method1207(class18.field370++, 31)] = var7;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 141) {
                for (int var8 = 0; var8 < class154.field3518.length; var8++) {
                    if (class154.field3518[var8] != null) {
                        class154.field3518[var8].field3585 = -1;
                    }
                }
                for (int var9 = 0; var9 < class122.field2846.length; var9++) {
                    if (class122.field2846[var9] != null) {
                        class122.field2846[var9].field3585 = -1;
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 165) {
                class74.field1585 = class44.field1013;
                long var10 = class4.field70.method1014(false);
                if (var10 == 0L) {
                    class75.field1694 = 0;
                    class49.field1094 = -1;
                    class61.field1314 = null;
                    class141.field3279 = null;
                    return true;
                }
                class61.field1314 = class11.method74(-8261, var10);
                field46 = class4.field70.method996(4);
                int var12 = class4.field70.method1011(125);
                if (var12 == 255) {
                    class49.field1094 = -1;
                    return true;
                }
                class3[] var13 = new class3[100];
                class75.field1694 = var12;
                for (int var14 = 0; var14 < class75.field1694; var14++) {
                    var13[var14] = new class3();
                    var13[var14].field2090 = class4.field70.method1014(!arg0);
                    var13[var14].field57 = class11.method74(-8261, var13[var14].field2090);
                    var13[var14].field61 = class4.field70.method1020(!arg0);
                    var13[var14].field58 = class4.field70.method996(4);
                    if (class120.field2747 == var13[var14].field2090) {
                        class106.field2511 = var13[var14].field58;
                    }
                }
                boolean var15 = false;
                int var16 = class75.field1694;
                while (var16 > 0) {
                    boolean var17 = true;
                    var16--;
                    for (int var18 = 0; var18 < var16; var18++) {
                        if (var13[var18].field57.method1125(255, var13[var18 + 1].field57) > 0) {
                            var17 = false;
                            class3 var19 = var13[var18];
                            var13[var18] = var13[var18 + 1];
                            var13[var18 + 1] = var19;
                        }
                    }
                    if (var17) {
                        break;
                    }
                }
                class49.field1094 = -1;
                class141.field3279 = var13;
                return true;
            }
            if (class49.field1094 == 121) {
                class147.field3416 = class4.field70.method1011(34);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 25) {
                long var20 = class4.field70.method1014(false);
                int var22 = class4.field70.method1020(!arg0);
                int var23 = class4.field70.method1011(127);
                class136 var24 = class11.method74(-8261, var20).method1102(-1);
                for (int var25 = 0; var25 < class1.field14; var25++) {
                    if (class11.field196[var25] == var20) {
                        if (class61.field1297[var25] != var22) {
                            class61.field1297[var25] = var22;
                            if (var22 > 0) {
                                class27.method236((byte) -38, class79.method570(0, new class136[] { var24, class3.field65 }), 5, class37.field871);
                            }
                            if (var22 == 0) {
                                class27.method236((byte) -38, class79.method570(0, new class136[] { var24, class105.field2484 }), 5, class37.field871);
                            }
                        }
                        class40.field939[var25] = var23;
                        var24 = null;
                        break;
                    }
                }
                if (var24 != null && class1.field14 < 200) {
                    class11.field196[class1.field14] = var20;
                    class89.field2103[class1.field14] = var24;
                    class61.field1297[class1.field14] = var22;
                    class40.field939[class1.field14] = var23;
                    class1.field14++;
                }
                class154.field3522 = class67.field1423;
                boolean var26 = false;
                int var27 = class1.field14;
                while (var27 > 0) {
                    boolean var28 = true;
                    var27--;
                    for (int var29 = 0; var29 < var27; var29++) {
                        if (class61.field1297[var29] != class44.field1011 && class61.field1297[var29 + 1] == class44.field1011 || class61.field1297[var29] == 0 && class61.field1297[var29 + 1] != 0) {
                            var28 = false;
                            int var30 = class61.field1297[var29];
                            class61.field1297[var29] = class61.field1297[var29 + 1];
                            class61.field1297[var29 + 1] = var30;
                            class136 var31 = class89.field2103[var29];
                            class89.field2103[var29] = class89.field2103[var29 + 1];
                            class89.field2103[var29 + 1] = var31;
                            long var32 = class11.field196[var29];
                            class11.field196[var29] = class11.field196[var29 + 1];
                            class11.field196[var29 + 1] = var32;
                            int var34 = class40.field939[var29];
                            class40.field939[var29] = class40.field939[var29 + 1];
                            class40.field939[var29 + 1] = var34;
                        }
                    }
                    if (var28) {
                        break;
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 60) {
                int var35 = class4.field70.method1020(false);
                if (var35 == 65535) {
                    var35 = -1;
                }
                int var36 = class4.field70.method999(0);
                int var37 = class4.field70.method1018(4);
                class74 var38 = class12.method82(var36, (byte) 108);
                if (var38.field1616) {
                    var38.field1680 = var37;
                    var38.field1582 = var35;
                    class121 var39 = class63.method472(var35, (byte) 116);
                    var38.field1580 = var39.field2767;
                    var38.field1591 = var39.field2802;
                    var38.field1632 = var39.field2798;
                    var38.field1648 = var39.field2803;
                    var38.field1609 = var39.field2772;
                    if (var38.field1545 > 0) {
                        var38.field1648 = var38.field1648 * 32 / var38.field1545;
                    }
                    var38.field1555 = var39.field2796;
                    class145.method1173(var38, -4008);
                } else if (var35 == -1) {
                    class49.field1094 = -1;
                    var38.field1679 = 0;
                    return true;
                } else {
                    class121 var40 = class63.method472(var35, (byte) 120);
                    var38.field1679 = 4;
                    var38.field1580 = var40.field2767;
                    var38.field1594 = var35;
                    var38.field1648 = var40.field2803 * 100 / var37;
                    var38.field1591 = var40.field2802;
                    class145.method1173(var38, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 151) {
                class118.field2683 = class4.field70.method1011(52);
                class120.field2733 = class4.field70.method994((byte) 118);
                for (int var41 = class118.field2683; var41 < class118.field2683 + 8; var41++) {
                    for (int var42 = class120.field2733; var42 < class120.field2733 + 8; var42++) {
                        if (class93.field2197[class62.field1331][var41][var42] != null) {
                            class93.field2197[class62.field1331][var41][var42] = null;
                            class4.method25(6012, var41, var42);
                        }
                    }
                }
                for (class16 var43 = (class16) class41.field958.method512(0); var43 != null; var43 = (class16) class41.field958.method520((byte) 119)) {
                    if (var43.field328 >= class118.field2683 && class118.field2683 + 8 > var43.field328 && class120.field2733 <= var43.field315 && class120.field2733 + 8 > var43.field315 && class62.field1331 == var43.field325) {
                        var43.field320 = 0;
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 243) {
                class153.field3494 = class4.field70.method1011(78);
                if (class153.field3494 == 1) {
                    class93.field2191 = class4.field70.method1020(!arg0);
                }
                if (class153.field3494 >= 2 && class153.field3494 <= 6) {
                    if (class153.field3494 == 2) {
                        class93.field2172 = 64;
                        class110.field2603 = 64;
                    }
                    if (class153.field3494 == 3) {
                        class93.field2172 = 0;
                        class110.field2603 = 64;
                    }
                    if (class153.field3494 == 4) {
                        class110.field2603 = 64;
                        class93.field2172 = 128;
                    }
                    if (class153.field3494 == 5) {
                        class110.field2603 = 0;
                        class93.field2172 = 64;
                    }
                    if (class153.field3494 == 6) {
                        class110.field2603 = 128;
                        class93.field2172 = 64;
                    }
                    class153.field3494 = 2;
                    class52.field1172 = class4.field70.method1020(false);
                    class81.field1938 = class4.field70.method1020(false);
                    class132.field3119 = class4.field70.method1011(110);
                }
                if (class153.field3494 == 10) {
                    class77.field1743 = class4.field70.method1020(!arg0);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 101) {
                class21.method157(true, 6);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 48) {
                class120.field2733 = class4.field70.method1034(-93);
                class118.field2683 = class4.field70.method1011(16);
                while (class11.field179 > class4.field70.field2995) {
                    class49.field1094 = class4.field70.method1011(69);
                    class16.method115(128);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 86) {
                class140.method1137(25663);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 211) {
                class18.field369 = 0;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 119) {
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 26) {
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 88) {
                class151.field3470 = true;
                class63.field1358 = class4.field70.method1011(21);
                class79.field1820 = class4.field70.method1011(87);
                class8.field147 = class4.field70.method1020(!arg0);
                class43.field975 = class4.field70.method1011(111);
                class63.field1346 = class4.field70.method1011(91);
                if (class63.field1346 >= 100) {
                    int var44 = class79.field1820 * 128 + 64;
                    int var45 = class63.field1358 * 128 + 64;
                    int var46 = class65.method486(class62.field1331, (byte) -42, var44, var45) - class8.field147;
                    int var47 = var44 - class100.field2409;
                    int var48 = var45 - class9.field168;
                    int var49 = var46 - class28.field621;
                    int var50 = (int) Math.sqrt((double) (var47 * var47 + var48 * var48));
                    class12.field228 = (int) (Math.atan2((double) var49, (double) var50) * 325.949D) & 0x7FF;
                    class83.field1976 = (int) (-325.949D * Math.atan2((double) var48, (double) var47)) & 0x7FF;
                    if (class12.field228 < 128) {
                        class12.field228 = 128;
                    }
                    if (class12.field228 > 383) {
                        class12.field228 = 383;
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 173) {
                class116.field2645 = class4.field70.method1011(81);
                class154.field3522 = class67.field1423;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 134) {
                class151.field3470 = true;
                class80.field1892 = class4.field70.method1011(85);
                class155.field3602 = class4.field70.method1011(45);
                class145.field3340 = class4.field70.method1020(!arg0);
                class11.field193 = class4.field70.method1011(17);
                class11.field180 = class4.field70.method1011(52);
                if (class11.field180 >= 100) {
                    class100.field2409 = class155.field3602 * 128 + 64;
                    class9.field168 = class80.field1892 * 128 + 64;
                    class28.field621 = class65.method486(class62.field1331, (byte) -42, class100.field2409, class9.field168) - class145.field3340;
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 157) {
                long var51 = class4.field70.method1014(false);
                int var53 = class4.field70.method1020(false);
                byte var54 = class4.field70.method996(4);
                boolean var55 = false;
                if ((Long.MIN_VALUE & var51) != 0L) {
                    var55 = true;
                }
                if (var55) {
                    if (class75.field1694 == 0) {
                        class49.field1094 = -1;
                        return true;
                    }
                    long var56 = var51 & Long.MAX_VALUE;
                    boolean var58 = false;
                    int var59;
                    for (var59 = 0; var59 < class75.field1694 && (class141.field3279[var59].field2090 != var56 || class141.field3279[var59].field61 != var53); var59++) {
                    }
                    if (class75.field1694 > var59) {
                        while (class75.field1694 - 1 > var59) {
                            class141.field3279[var59] = class141.field3279[var59 + 1];
                            var59++;
                        }
                        class141.field3279[class75.field1694] = null;
                        class75.field1694--;
                    }
                } else {
                    class3 var60 = new class3();
                    var60.field2090 = var51;
                    var60.field57 = class11.method74(-8261, var60.field2090);
                    var60.field58 = var54;
                    var60.field61 = var53;
                    int var61;
                    for (var61 = class75.field1694 - 1; var61 >= 0; var61--) {
                        int var62 = class141.field3279[var61].field57.method1125(255, var60.field57);
                        if (var62 == 0) {
                            class141.field3279[var61].field61 = var53;
                            class141.field3279[var61].field58 = var54;
                            class49.field1094 = -1;
                            if (class120.field2747 == var51) {
                                class106.field2511 = var54;
                            }
                            return true;
                        }
                        if (var62 < 0) {
                            break;
                        }
                    }
                    if (class141.field3279.length <= class75.field1694) {
                        class49.field1094 = -1;
                        return true;
                    }
                    for (int var63 = class75.field1694 - 1; var63 > var61; var63--) {
                        class141.field3279[var63 + 1] = class141.field3279[var63];
                    }
                    if (class75.field1694 == 0) {
                        class141.field3279 = new class3[100];
                    }
                    class141.field3279[var61 + 1] = var60;
                    if (class120.field2747 == var51) {
                        class106.field2511 = var54;
                    }
                    class75.field1694++;
                }
                class74.field1585 = class44.field1013;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 63) {
                int var64 = class4.field70.method1019((byte) -95);
                int var65 = class4.field70.method986(69);
                class74 var66 = class12.method82(var65, (byte) 108);
                if (var66 != null && var66.field1690 == 0) {
                    if (var66.field1638 - var66.field1686 < var64) {
                        var64 = var66.field1638 - var66.field1686;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    }
                    if (var66.field1646 != var64) {
                        var66.field1646 = var64;
                        class145.method1173(var66, -4008);
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 124) {
                int var67 = class4.field70.method986(47);
                class118 var68 = (class118) class18.field363.method109(110, (long) var67);
                if (var68 != null) {
                    class87.method646(var68, true, (byte) 32);
                }
                if (class107.field2523 != null) {
                    class145.method1173(class107.field2523, -4008);
                    class107.field2523 = null;
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 21) {
                int var69 = class4.field70.method1007(6119);
                int var70 = class4.field70.method999(0);
                class74 var71 = class12.method82(var70, (byte) 108);
                if (var71.field1679 != 1 || var71.field1594 != var69) {
                    var71.field1594 = var69;
                    var71.field1679 = 1;
                    class145.method1173(var71, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 90) {
                class142.method1153(arg0);
                class49.field1094 = -1;
                return false;
            }
            if (class49.field1094 == 127 || class49.field1094 == 193 || class49.field1094 == 33 || class49.field1094 == 16 || class49.field1094 == 222 || class49.field1094 == 241 || class49.field1094 == 67 || class49.field1094 == 96 || class49.field1094 == 72 || class49.field1094 == 41 || class49.field1094 == 122) {
                class16.method115(128);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 180) {
                class21.method157(false, 6);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 188) {
                long var72 = class4.field70.method1014(false);
                class136 var74 = class95.method717(class62.method470(-3119, class4.field70).method1110(121));
                class27.method236((byte) -38, var74, 6, class11.method74(-8261, var72).method1102(-1));
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 220) {
                int var75 = class4.field70.method999(0);
                boolean var76 = class4.field70.method994((byte) 119) == 1;
                class74 var77 = class12.method82(var75, (byte) 108);
                if (var76 != var77.field1633) {
                    var77.field1633 = var76;
                    class145.method1173(var77, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 0) {
                int var78 = class4.field70.method992(-24514);
                int var79 = class4.field70.method1020(false);
                int var80 = class4.field70.method986(-95);
                class118 var81 = (class118) class18.field363.method109(109, (long) var80);
                if (var81 != null) {
                    class87.method646(var81, var81.field2693 != var79, (byte) 32);
                }
                class27.method237(var79, var78, (byte) 119, var80);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 64) {
                int var82 = class4.field70.method987(-98);
                class21.field423 = class44.field1010.method186(5, var82);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 115) {
                class4.field70.method1004((byte) -109);
                class4.field70.method1019((byte) -89);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 40) {
                int var83 = class4.field70.method1011(41);
                int var84 = class4.field70.method1011(71);
                int var85 = class4.field70.method1011(95);
                int var86 = class4.field70.method1011(19);
                class106.field2503[var83] = true;
                class116.field2674[var83] = var84;
                class38.field891[var83] = var85;
                class119.field2702[var83] = var86;
                class90.field2138[var83] = 0;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 113) {
                for (int var87 = 0; var87 < class18.field371.length; var87++) {
                    if (class52.field1177[var87] != class18.field371[var87]) {
                        class18.field371[var87] = class52.field1177[var87];
                        class77.method560(var87, (byte) -52);
                        class155.field3562[class154.method1207(class18.field370++, 31)] = var87;
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 185) {
                class4.field70.method1011(126);
                class4.field70.method1004((byte) -111);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 118) {
                class133.method1077(-25724);
                class71.field1494 = class4.field70.method1028((byte) -66);
                class49.field1094 = -1;
                class81.field1918 = class67.field1423;
                return true;
            }
            if (class49.field1094 == 120) {
                class136 var88 = class4.field70.method1010(-14330);
                if (var88.method1112(class146.field3377, 32526)) {
                    boolean var89 = false;
                    class136 var90 = var88.method1105(0, (byte) -7, var88.method1100(class141.field3271, 0));
                    long var91 = var90.method1117(-103);
                    for (int var93 = 0; var93 < class89.field2104; var93++) {
                        if (class43.field988[var93] == var91) {
                            var89 = true;
                            break;
                        }
                    }
                    if (!var89 && class64.field1370 == 0) {
                        class27.method236((byte) -38, class90.field2139, 4, var90);
                    }
                } else if (var88.method1112(class61.field1312, 32526)) {
                    class136 var94 = var88.method1105(0, (byte) -7, var88.method1100(class141.field3271, 0));
                    long var95 = var94.method1117(72);
                    boolean var97 = false;
                    for (int var98 = 0; var98 < class89.field2104; var98++) {
                        if (class43.field988[var98] == var95) {
                            var97 = true;
                            break;
                        }
                    }
                    if (!var97 && class64.field1370 == 0) {
                        class27.method236((byte) -38, class56.field1275, 8, var94);
                    }
                } else if (var88.method1112(class35.field813, 32526)) {
                    class136 var99 = var88.method1105(0, (byte) -7, var88.method1100(class141.field3271, 0));
                    boolean var100 = false;
                    long var101 = var99.method1117(-110);
                    for (int var103 = 0; var103 < class89.field2104; var103++) {
                        if (class43.field988[var103] == var101) {
                            var100 = true;
                            break;
                        }
                    }
                    if (!var100 && class64.field1370 == 0) {
                        class136 var104 = var88.method1105(var88.method1100(class141.field3271, 0) + 1, (byte) -7, var88.method1119(-10511) - 9);
                        class27.method236((byte) -38, var104, 8, var99);
                    }
                } else {
                    class27.method236((byte) -38, var88, 0, class37.field871);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 80) {
                int var105 = class4.field70.method1034(-54);
                int var106 = class4.field70.method1011(46);
                int var107 = class4.field70.method992(-24514);
                class62.field1331 = var107 >> 1;
                class24.field555.method1209(var106, 128, (var107 & 0x1) == 1, var105);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 201) {
                class133.method1077(-25724);
                int var108 = class4.field70.method994((byte) 126);
                int var109 = class4.field70.method1018(4);
                int var110 = class4.field70.method1011(84);
                class73.field1520[var110] = var109;
                class19.field393[var110] = var108;
                class143.field3321[var110] = 1;
                for (int var111 = 0; var111 < 98; var111++) {
                    if (class71.field1503[var111] <= var109) {
                        class143.field3321[var110] = var111 + 2;
                    }
                }
                class7.field133[class154.method1207(client.field456++, 31)] = var110;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 224) {
                class4.field70.method1019((byte) -121);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 34) {
                class4.field70.method1028((byte) 126);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 126) {
                class133.method1077(-25724);
                class80.field1840 = class4.field70.method1011(59);
                class49.field1094 = -1;
                class81.field1918 = class67.field1423;
                return true;
            }
            if (class49.field1094 == 19) {
                class4.field70.method1004((byte) -96);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 239) {
                class136 var112 = class4.field70.method1010(-14330);
                int var113 = class4.field70.method994((byte) 120);
                int var114 = class4.field70.method992(-24514);
                if (var114 >= 1 && var114 <= 5) {
                    if (var112.method1092(1853, class104.field2475)) {
                        var112 = null;
                    }
                    class4.field87[var114 - 1] = var112;
                    class19.field386[var114 - 1] = var113 == 0;
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 232) {
                class87.method649((byte) 126);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 136) {
                class146.field3365 = class4.field70.method1011(122);
                class128.field3086 = class4.field70.method1011(36);
                class59.field1287 = class4.field70.method1011(38);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 31) {
                long var115 = class4.field70.method1014(false);
                class4.field70.method996(4);
                long var117 = class4.field70.method1014(false);
                long var119 = (long) class4.field70.method1020(!arg0);
                long var121 = (long) class4.field70.method1022(26);
                boolean var123 = false;
                long var124 = (var119 << 32) + var121;
                int var126 = class4.field70.method1011(127);
                for (int var127 = 0; var127 < 100; var127++) {
                    if (class63.field1351[var127] == var124) {
                        var123 = true;
                        break;
                    }
                }
                if (var126 <= 1) {
                    for (int var128 = 0; var128 < class89.field2104; var128++) {
                        if (class43.field988[var128] == var115) {
                            var123 = true;
                            break;
                        }
                    }
                }
                if (!var123 && class64.field1370 == 0) {
                    class63.field1351[class5.field105] = var124;
                    class5.field105 = (class5.field105 + 1) % 100;
                    class136 var129 = class95.method717(class62.method470(-3119, class4.field70).method1110(-77));
                    if (var126 == 2 || var126 == 3) {
                        class28.method243(class11.method74(-8261, var117), var129, 9, false, class79.method570(0, new class136[] { class142.field3299, class11.method74(-8261, var115).method1102(-1) }));
                    } else if (var126 == 1) {
                        class28.method243(class11.method74(-8261, var117), var129, 9, false, class79.method570(0, new class136[] { class19.field399, class11.method74(-8261, var115).method1102(-1) }));
                    } else {
                        class28.method243(class11.method74(-8261, var117), var129, 9, false, class11.method74(-8261, var115).method1102(-1));
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 235) {
                class4.field70.method1004((byte) -118);
                class4.field70.method1007(6119);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 28) {
                int var130 = class4.field70.method1007(6119);
                int var131 = class4.field70.method987(-107);
                int var132 = var130 >> 10 & 0x1F;
                int var133 = var130 >> 5 & 0x1F;
                int var134 = var130 & 0x1F;
                int var135 = (var133 << 11) + (var132 << 19) + (var134 << 3);
                class74 var136 = class12.method82(var131, (byte) 108);
                if (var136.field1664 != var135) {
                    var136.field1664 = var135;
                    class145.method1173(var136, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 228) {
                class136 var137 = class4.field70.method1010(-14330);
                int var138 = class4.field70.method987(-94);
                class74 var139 = class12.method82(var138, (byte) 108);
                if (!var137.method1114(0, var139.field1666)) {
                    var139.field1666 = var137;
                    class145.method1173(var139, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 202) {
                int var140 = class4.field70.method986(98);
                class74 var141 = class12.method82(var140, (byte) 108);
                var141.field1679 = 3;
                var141.field1594 = class24.field555.field258.method808((byte) -49);
                class145.method1173(var141, -4008);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 102) {
                int var142 = class4.field70.method1020(false);
                int var143 = class4.field70.method987(-88);
                if (var142 == 65535) {
                    var142 = -1;
                }
                int var144 = class4.field70.method1018(4);
                int var145 = class4.field70.method1020(false);
                if (var145 == 65535) {
                    var145 = -1;
                }
                for (int var146 = var142; var146 <= var145; var146++) {
                    long var147 = ((long) var144 << 32) + ((long) var146);
                    class88 var149 = class113.field2617.method109(74, var147);
                    if (var149 != null) {
                        var149.method674(32);
                    }
                    class113.field2617.method112(new class85(var143), (byte) 3, var147);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 198) {
                class4.field70.method1010(-14330);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 191) {
                class151.field3470 = false;
                for (int var150 = 0; var150 < 5; var150++) {
                    class106.field2503[var150] = false;
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 190) {
                class118.field2683 = class4.field70.method1011(114);
                class120.field2733 = class4.field70.method1034(-85);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 209) {
                int var151 = class4.field70.method1019((byte) -18);
                if (var151 == 65535) {
                    var151 = -1;
                }
                class129.method1062(var151, -8030);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 131) {
                int var152 = class4.field70.method1022(76);
                int var153 = class4.field70.method1004((byte) -104);
                if (var153 == 65535) {
                    var153 = -1;
                }
                class59.method453(var153, var152, true);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 22) {
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 192) {
                class19.field398 = class4.field70.method1007(6119) * 30;
                class81.field1918 = class67.field1423;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 160) {
                class4.field70.method995(2701);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 155) {
                int var154 = class4.field70.method986(62);
                int var155 = class4.field70.method1020(false);
                class74 var156;
                if (var154 >= 0) {
                    var156 = class12.method82(var154, (byte) 108);
                } else {
                    var156 = null;
                }
                if (var154 < -70000) {
                    var155 += 32768;
                }
                while (class4.field70.field2995 < class11.field179) {
                    int var157 = class4.field70.method1027(false);
                    int var158 = class4.field70.method1020(!arg0);
                    int var159 = 0;
                    if (var158 != 0) {
                        var159 = class4.field70.method1011(72);
                        if (var159 == 255) {
                            var159 = class4.field70.method986(47);
                        }
                    }
                    if (var156 != null && var157 >= 0 && var157 < var156.field1552.length) {
                        var156.field1552[var157] = var158;
                        var156.field1595[var157] = var159;
                    }
                    class135.method1089(var155, var159, (byte) 119, var158 - 1, var157);
                }
                if (var156 != null) {
                    class145.method1173(var156, -4008);
                }
                class133.method1077(-25724);
                class3.field52[class154.method1207(31, class107.field2528++)] = class154.method1207(var155, 32767);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 10) {
                int var160 = class4.field70.method1004((byte) -91);
                int var161 = class4.field70.method1019((byte) -22);
                int var162 = class4.field70.method1018(4);
                class74 var163 = class12.method82(var162, (byte) 108);
                class49.field1094 = -1;
                var163.field1575 = (var160 << 16) + var161;
                return true;
            }
            if (class49.field1094 == 18) {
                int var164 = class4.field70.method986(70);
                int var165 = class4.field70.method1020(!arg0);
                class74 var166;
                if (var164 < 0) {
                    var166 = null;
                } else {
                    var166 = class12.method82(var164, (byte) 108);
                }
                if (var166 != null) {
                    for (int var167 = 0; var167 < var166.field1552.length; var167++) {
                        var166.field1552[var167] = 0;
                        var166.field1595[var167] = 0;
                    }
                }
                if (var164 < -70000) {
                    var165 += 32768;
                }
                class70.method525(var165, arg0);
                int var168 = class4.field70.method1020(false);
                for (int var169 = 0; var169 < var168; var169++) {
                    int var170 = class4.field70.method1034(-58);
                    if (var170 == 255) {
                        var170 = class4.field70.method999(0);
                    }
                    int var171 = class4.field70.method1004((byte) -98);
                    if (var166 != null && var166.field1552.length > var169) {
                        var166.field1552[var169] = var171;
                        var166.field1595[var169] = var170;
                    }
                    class135.method1089(var165, var170, (byte) 118, var171 - 1, var169);
                }
                if (var166 != null) {
                    class145.method1173(var166, -4008);
                }
                class133.method1077(-25724);
                class3.field52[class154.method1207(class107.field2528++, 31)] = class154.method1207(var165, 32767);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 75) {
                class4.field70.method1011(61);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 9) {
                if (class55.field1233 != -1) {
                    class99.method801(class55.field1233, 0, 128);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 14) {
                class4.field70.method1004((byte) -105);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 106) {
                int var172 = class4.field70.method1020(false);
                int var173 = class4.field70.method1020(false);
                int var174 = class4.field70.method999(0);
                int var175 = class4.field70.method1019((byte) -29);
                class74 var176 = class12.method82(var174, (byte) 108);
                if (var176.field1580 != var175 || var176.field1591 != var173 || var176.field1648 != var172) {
                    var176.field1580 = var175;
                    var176.field1648 = var172;
                    var176.field1591 = var173;
                    class145.method1173(var176, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 206) {
                int var177 = class4.field70.method1020(false);
                int var178 = class4.field70.method1011(79);
                int var179 = class4.field70.method1020(false);
                class19.method141(var179, var177, (byte) 111, var178);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 183) {
                int var180 = class4.field70.method987(-84);
                class74 var181 = class12.method82(var180, (byte) 108);
                for (int var182 = 0; var182 < var181.field1552.length; var182++) {
                    var181.field1552[var182] = -1;
                    var181.field1552[var182] = 0;
                }
                class145.method1173(var181, -4008);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 61) {
                class4.field70.method992(-24514);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 39) {
                int var183 = class4.field70.method1018(4);
                int var184 = class4.field70.method1019((byte) -25);
                class74 var185 = class12.method82(var183, (byte) 108);
                if (var185.field1679 != 2 || var185.field1594 != var184) {
                    var185.field1594 = var184;
                    var185.field1679 = 2;
                    class145.method1173(var185, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 214) {
                class89.field2104 = class11.field179 / 8;
                for (int var186 = 0; var186 < class89.field2104; var186++) {
                    class43.field988[var186] = class4.field70.method1014(false);
                }
                class154.field3522 = class67.field1423;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 159) {
                int var187 = class4.field70.method987(-57);
                int var188 = class4.field70.method1012(-1215504024);
                class74 var189 = class12.method82(var187, (byte) 108);
                if (var189.field1675 != var188 || var188 == -1) {
                    var189.field1634 = 0;
                    var189.field1626 = 0;
                    var189.field1675 = var188;
                    class145.method1173(var189, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 93) {
                class74.method544(4, class4.field70, class44.field1010, class11.field179);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 244) {
                for (int var190 = 0; var190 < class93.field2196; var190++) {
                    class65 var191 = class15.method106((byte) -93, var190);
                    if (var191 != null && var191.field1403 == 0) {
                        class52.field1177[var190] = 0;
                        class18.field371[var190] = 0;
                    }
                }
                class133.method1077(-25724);
                class18.field370 += 32;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 74) {
                int var192 = class4.field70.method995(2701);
                int var193 = class4.field70.method999(0);
                int var194 = class4.field70.method1039(-32768);
                class74 var195 = class12.method82(var193, (byte) 108);
                int var196 = var195.field1565 + var194;
                int var197 = var195.field1613 + var192;
                if (var195.field1619 != var196 || var195.field1610 != var197) {
                    var195.field1610 = var197;
                    var195.field1619 = var196;
                    class145.method1173(var195, -4008);
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 204) {
                long var198 = class4.field70.method1014(false);
                long var200 = (long) class4.field70.method1020(false);
                long var202 = (long) class4.field70.method1022(-96);
                long var204 = (var200 << 32) + var202;
                int var206 = class4.field70.method1011(46);
                boolean var207 = false;
                for (int var208 = 0; var208 < 100; var208++) {
                    if (class63.field1351[var208] == var204) {
                        var207 = true;
                        break;
                    }
                }
                if (var206 <= 1) {
                    for (int var209 = 0; var209 < class89.field2104; var209++) {
                        if (class43.field988[var209] == var198) {
                            var207 = true;
                            break;
                        }
                    }
                }
                if (!var207 && class64.field1370 == 0) {
                    class63.field1351[class5.field105] = var204;
                    class5.field105 = (class5.field105 + 1) % 100;
                    class136 var210 = class95.method717(class62.method470(-3119, class4.field70).method1110(30));
                    if (var206 == 2 || var206 == 3) {
                        class27.method236((byte) -38, var210, 7, class79.method570(0, new class136[] { class142.field3299, class11.method74(-8261, var198).method1102(-1) }));
                    } else if (var206 == 1) {
                        class27.method236((byte) -38, var210, 7, class79.method570(0, new class136[] { class19.field399, class11.method74(-8261, var198).method1102(-1) }));
                    } else {
                        class27.method236((byte) -38, var210, 3, class11.method74(-8261, var198).method1102(-1));
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 7) {
                class4.field70.method1004((byte) -126);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 128) {
                int var211 = class4.field70.method1004((byte) -81);
                class152.method1196(var211, 117);
                class3.field52[class154.method1207(31, class107.field2528++)] = class154.method1207(32767, var211);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 89) {
                byte var212 = class4.field70.method1036(106);
                int var213 = class4.field70.method1019((byte) -35);
                class52.field1177[var213] = var212;
                if (class18.field371[var213] != var212) {
                    class18.field371[var213] = var212;
                    class77.method560(var213, (byte) -52);
                }
                class155.field3562[class154.method1207(31, class18.field370++)] = var213;
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 103) {
                class4.field70.method1034(-95);
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 176) {
                int var214 = class11.field179 + class4.field70.field2995;
                int var215 = class4.field70.method1020(false);
                if (class55.field1233 != var215) {
                    class55.field1233 = var215;
                    class133.method1078(class55.field1233, 0);
                    class44.method357(class55.field1233, (byte) -121);
                    for (int var216 = 0; var216 < 100; var216++) {
                        class154.field3511[var216] = true;
                    }
                }
                while (class4.field70.field2995 < var214) {
                    int var217 = class4.field70.method986(67);
                    int var218 = class4.field70.method1020(!arg0);
                    int var219 = class4.field70.method1011(38);
                    class118 var220 = (class118) class18.field363.method109(40, (long) var217);
                    if (var220 != null && var220.field2693 != var218) {
                        class87.method646(var220, true, (byte) 32);
                        var220 = null;
                    }
                    if (var220 == null) {
                        var220 = class27.method237(var218, var219, (byte) 122, var217);
                    }
                    var220.field2691 = true;
                }
                for (class118 var221 = (class118) class18.field363.method107((byte) -124); var221 != null; var221 = (class118) class18.field363.method104(81)) {
                    if (var221.field2691) {
                        var221.field2691 = false;
                    } else {
                        class87.method646(var221, true, (byte) 32);
                    }
                }
                class49.field1094 = -1;
                return true;
            }
            if (class49.field1094 == 226) {
                int var222 = class4.field70.method1004((byte) -114);
                class55.field1233 = var222;
                class133.method1078(var222, 0);
                class44.method357(class55.field1233, (byte) -96);
                for (int var223 = 0; var223 < 100; var223++) {
                    class154.field3511[var223] = true;
                }
                class49.field1094 = -1;
                return true;
            }
            class53.method433(null, !arg0, "T1 - " + class49.field1094 + "," + class127.field2958 + "," + class101.field2425 + " - " + class11.field179);
            class142.method1153(arg0);
        } catch (IOException var227) {
            class125.method963(-95);
        } catch (Exception var228) {
            String var225 = "T2 - " + class49.field1094 + "," + class127.field2958 + "," + class101.field2425 + " - " + class11.field179 + "," + (class24.field555.field3560[0] + class91.field2145) + "," + (class24.field555.field3581[0] + class52.field1176) + " - ";
            for (int var226 = 0; var226 < class11.field179 && var226 < 50; var226++) {
                var225 = var225 + class4.field70.field2960[var226] + ",";
            }
            class53.method433(var228, false, var225);
            class142.method1153(arg0);
        }
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    public static int method13(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Z")
    public final boolean method14(byte arg0, int arg1) {
        if (arg0 >= -7) {
            method12(false);
        }
        field31++;
        return this.field27[arg1].field3145;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
    public final void method15(int arg0, int arg1) {
        if (arg1 != -28552) {
            this.field36 = -75;
        }
        for (int var3 = 0; var3 < this.field27.length; var3++) {
            class134 var4 = this.field27[var3];
            if (var4 != null && var4.field3152 != 0 && var4.field3151) {
                var4.method1086(arg0);
                var4.field3151 = false;
            }
        }
        field39++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(BI)[I")
    public final int[] method16(byte arg0, int arg1) {
        field30++;
        class134 var3 = this.field27[arg1];
        if (arg0 != -118) {
            return null;
        }
        if (var3 != null) {
            if (var3.field3144 != null) {
                this.field22.method513(var3, 118);
                var3.field3151 = true;
                return var3.field3144;
            }
            boolean var4 = var3.method1085(this.field37, this.field41, this.field38);
            if (var4) {
                if (this.field36 == 0) {
                    class134 var5 = (class134) this.field22.method519(-5);
                    var5.method1083();
                } else {
                    this.field36--;
                }
                this.field22.method513(var3, 57);
                var3.field3151 = true;
                return var3.field3144;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/Object;Ld;I)V")
    public static final void method17(Object arg0, class22 arg1, int arg2) {
        field25++;
        if (arg1.field475 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field475.peekEvent() != null; var3++) {
            class9.method42(~arg2, 1L);
        }
        if (arg2 != -1) {
            method12(false);
        }
        if (arg0 != null) {
            arg1.field475.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lmd;Lmd;IDI)V")
    public class2(class87 arg0, class87 arg1, int arg2, double arg3, int arg4) {
        this.field35 = arg2;
        this.field38 = arg1;
        this.field41 = arg4;
        this.field36 = this.field35;
        this.field37 = arg3;
        int[] var7 = arg0.method651(0, -2);
        int var8 = var7.length;
        this.field27 = new class134[arg0.method666(0, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method669(var7[var9], 0, -86));
            this.field27[var7[var9]] = new class134(var10);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public final void method18(boolean arg0) {
        field34++;
        int var2 = 0;
        if (arg0) {
            return;
        }
        while (this.field27.length > var2) {
            if (this.field27[var2] != null) {
                this.field27[var2].method1083();
            }
            var2++;
        }
        this.field22 = new class69();
        this.field36 = this.field35;
    }
}
