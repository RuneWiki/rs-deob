import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class119 extends class165 implements class174 {

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Z")
    private boolean field1684 = false;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    private int field1691 = 50;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "Lbc;")
    private class282 field1689;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Lbc;")
    private class282 field1694;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Lef;")
    private class241 field1685;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "Lef;")
    private class241 field1692;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1697 = " from your ignore list first.";

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field1702 = 0;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Lbh;")
    public static class234 field1704 = new class234();

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Lpg;")
    public static class187 field1680;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Lbc;")
    public static class282 field1690;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIF)[I")
    public final int[] method765(int arg0, int arg1, float arg2) {
        class218 var4 = this.method778(arg1, false);
        field1686++;
        if (arg0 >= -89) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            var4.field3088 = true;
            return var4.method1420(this, this.field1689, arg2, this.field1684 || this.method419(arg1, -208).field1279);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILwe;)Ljava/lang/String;")
    public static final String method766(int arg0, class82 arg1) {
        field1698++;
        if (arg0 == client.method1920(arg1).method1159(false)) {
            return null;
        } else if (arg1.field1137 == null || arg1.field1137.trim().length() == 0) {
            return class296.field4679 ? "Hidden-use" : null;
        } else {
            return arg1.field1137;
        }
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(II)Lvf;")
    public final class30 method767(int arg0, int arg1) {
        field1682++;
        if (arg0 != 142) {
            field1690 = null;
        }
        class218 var3 = this.method778(arg1, false);
        return var3 == null ? null : var3.field3086;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method768(byte arg0) {
        field1690 = null;
        field1697 = null;
        field1704 = null;
        field1680 = null;
        if (arg0 > -58) {
            field1702 = -122;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIFI)Lpg;")
    public final class187 method769(int arg0, boolean arg1, int arg2, float arg3, int arg4) {
        class218 var6 = this.method778(arg0, false);
        field1688++;
        if (var6 == null || !var6.method1421(this, this.field1689)) {
            return null;
        } else if (arg4 == 5783) {
            return arg1 ? var6.field3086.method182(false, (double) arg3, -82, this.field1689, this, arg2, arg2) : var6.field3086.method187(this, arg2, arg2, this.field1689, arg4 ^ 0x16B4, (double) arg3, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)Z")
    public final boolean method770(boolean arg0, int arg1) {
        field1687++;
        if (this.field1684 || this.method419(arg1, -208).field1279) {
            return true;
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)Z")
    public final boolean method771(int arg0, int arg1) {
        if (arg1 < 46) {
            this.method767(55, -106);
        }
        field1696++;
        return !this.method419(arg0, -208).field1273;
    }

    @OriginalMember(owner = "client!th", name = "i", descriptor = "(II)V")
    public final void method772(int arg0, int arg1) {
        field1701++;
        for (class218 var3 = (class218) this.field1685.method1573((byte) -78); var3 != null; var3 = (class218) this.field1685.method1565(8)) {
            if (var3.field3088) {
                var3.method1419(arg0);
                var3.field3088 = false;
            }
        }
        if (arg1 != -4172) {
            method773(-36, -16);
        }
    }

    @OriginalMember(owner = "client!th", name = "j", descriptor = "(II)V")
    public static final void method773(int arg0, int arg1) {
        field1681++;
        if (arg0 > arg1) {
            return;
        }
        int var2 = class271.field3978[arg1];
        int var3 = class240.field3485[arg1];
        int var4 = class190.field2749[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class6.field72[arg1];
        long var6 = class6.field72[arg1];
        if (var4 == 29) {
            class94.field1259.method592(192, false);
            class63.field737++;
            class94.field1259.method1410(var2, (byte) -124);
            class82 var8 = class182.method1187((byte) -41, var2);
            if (var8.field1037 != null && var8.field1037[0][0] == 5) {
                int var9 = var8.field1037[0][1];
                if (class164.field2358[var9] != var8.field1002[0]) {
                    class164.field2358[var9] = var8.field1002[0];
                    class60.method372((byte) -114, var9);
                }
            }
        }
        if (var4 == 44) {
            class54 var10 = class20.field244[var5];
            if (var10 != null) {
                class231.field3325++;
                field1702 = class190.field2736;
                class285.field4413 = class76.field905;
                class73.field880 = 2;
                class97.field1298 = 0;
                class94.field1259.method592(236, false);
                class94.field1259.method1383((byte) 85, var5);
                class94.field1259.method1370((byte) -71, class260.field3784[82] ? 1 : 0);
            }
        }
        if (var4 == 41) {
            class63.field737++;
            class94.field1259.method592(192, false);
            class94.field1259.method1410(var2, (byte) -125);
            class82 var11 = class182.method1187((byte) -41, var2);
            if (var11.field1037 != null && var11.field1037[0][0] == 5) {
                int var12 = var11.field1037[0][1];
                class164.field2358[var12] = 1 - class164.field2358[var12];
                class60.method372((byte) -114, var12);
            }
        }
        if (var4 == 14) {
            class97.field1298 = 0;
            field1702 = class190.field2736;
            class285.field4413 = class76.field905;
            class1.field4++;
            class73.field880 = 2;
            class94.field1259.method592(92, false);
            class94.field1259.method1387(var2 + class166.field2383, 4);
            class94.field1259.method1376(Integer.MAX_VALUE & (int) (var6 >>> 32), 30);
            class94.field1259.method1364(class110.field1473 + var3, 1024);
            class94.field1259.method1370((byte) -78, class260.field3784[82] ? 1 : 0);
        }
        if (var4 == 32) {
            class97.field1298 = 0;
            class79.field936++;
            class73.field880 = 2;
            field1702 = class190.field2736;
            class285.field4413 = class76.field905;
            class94.field1259.method592(49, false);
            class94.field1259.method1387(class166.field2383 + var2, 4);
            class94.field1259.method1364(var3 + class110.field1473, 1024);
            class94.field1259.method1359(arg0, class260.field3784[82] ? 1 : 0);
            class94.field1259.method1387(Integer.MAX_VALUE & (int) (var6 >>> 32), 4);
        }
        if (var4 == 43) {
            class243.field3541++;
            class94.field1259.method592(30, false);
            class94.field1259.method1410(var2, (byte) -126);
            class94.field1259.method1364(var3, 1024);
            class94.field1259.method1364(var5, arg0 ^ 0x400);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 5) {
            class285.field4413 = class76.field905;
            field1702 = class190.field2736;
            class238.field3420++;
            class97.field1298 = 0;
            class73.field880 = 2;
            class94.field1259.method592(220, false);
            class94.field1259.method1364(class110.field1473 + var3, 1024);
            class94.field1259.method1403(-120, class260.field3784[82] ? 1 : 0);
            class94.field1259.method1364(var5, 1024);
            class94.field1259.method1376(class166.field2383 + var2, arg0 ^ 0x6B);
        }
        if (var4 == 4) {
            class54 var13 = class20.field244[var5];
            if (var13 != null) {
                class73.field880 = 2;
                field1702 = class190.field2736;
                class285.field4413 = class76.field905;
                class97.field1298 = 0;
                class226.field3192++;
                class94.field1259.method592(133, false);
                class94.field1259.method1370((byte) -98, class260.field3784[82] ? 1 : 0);
                class94.field1259.method1376(var5, 118);
            }
        }
        if (var4 == 33) {
            class54.method328(false);
            class82 var14 = class182.method1187((byte) -41, var2);
            class270.field3947 = var3;
            class130.field1885 = var2;
            class37.field427 = var5;
            class196.field2790 = 1;
            class255.method1632(arg0 ^ 0xFF0000, var14);
            class107.field1444 = "<col=ff9040>" + class36.method224(var5, 123).field3235 + "<col=ffffff>";
            if (class107.field1444 == null) {
                class107.field1444 = "null";
            }
            return;
        }
        if (var4 == 6) {
            boolean var15 = true;
            class82 var16 = class182.method1187((byte) -41, var2);
            if (var16.field1136 > 0) {
                var15 = class169.method1110(var16, -2976);
            }
            if (var15) {
                class94.field1259.method592(192, false);
                class94.field1259.method1410(var2, (byte) -124);
                class63.field737++;
            }
        }
        if (var4 == 25) {
            class169.field2430++;
            class94.field1259.method592(252, false);
            class94.field1259.method1361(var2, (byte) 20);
            class94.field1259.method1364(class270.field3947, 1024);
            class94.field1259.method1376(class37.field427, -126);
            class94.field1259.method1364(var3, 1024);
            class94.field1259.method1368(class130.field1885, -1204862360);
            class94.field1259.method1387(var5, 4);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 20) {
            class240 var17 = class253.field3656[var5];
            if (var17 != null) {
                class6.field84++;
                class97.field1298 = 0;
                class285.field4413 = class76.field905;
                field1702 = class190.field2736;
                class73.field880 = 2;
                class94.field1259.method592(234, false);
                class94.field1259.method1383((byte) 115, var5);
                class94.field1259.method1373(class260.field3784[82] ? 1 : 0, -13985);
            }
        }
        if (var4 == 37) {
            class73.field880 = 2;
            field1702 = class190.field2736;
            class97.field1298 = 0;
            class285.field4413 = class76.field905;
            class252.field3650++;
            class94.field1259.method592(130, false);
            class94.field1259.method1373(class260.field3784[82] ? 1 : 0, arg0 ^ 0xFFFFC95F);
            class94.field1259.method1364(var5, 1024);
            class94.field1259.method1383((byte) -89, class110.field1473 + var3);
            class94.field1259.method1387(class166.field2383 + var2, arg0 + 4);
        }
        if (var4 == 51) {
            class240 var18 = class253.field3656[var5];
            if (var18 != null) {
                class285.field4413 = class76.field905;
                class87.field1177++;
                class73.field880 = 2;
                field1702 = class190.field2736;
                class97.field1298 = 0;
                class94.field1259.method592(169, false);
                class94.field1259.method1376(var5, -108);
                class94.field1259.method1370((byte) -73, class260.field3784[82] ? 1 : 0);
            }
        }
        if (var4 == 1) {
            class285.field4413 = class76.field905;
            class279.field4229++;
            class73.field880 = 2;
            field1702 = class190.field2736;
            class97.field1298 = 0;
            class94.field1259.method592(201, false);
            class94.field1259.method1364(class166.field2383 + var2, 1024);
            class94.field1259.method1383((byte) -32, var3 + class110.field1473);
            class94.field1259.method1376(var5, -20);
            class94.field1259.method1370((byte) -113, class260.field3784[82] ? 1 : 0);
        }
        if (var4 == 7) {
            class240 var19 = class253.field3656[var5];
            if (var19 != null) {
                class73.field880 = 2;
                field1702 = class190.field2736;
                class285.field4413 = class76.field905;
                class283.field4320++;
                class97.field1298 = 0;
                class94.field1259.method592(61, false);
                class94.field1259.method1359(0, class260.field3784[82] ? 1 : 0);
                class94.field1259.method1364(var5, 1024);
            }
        }
        if (var4 == 15) {
            class94.field1259.method592(106, false);
            class94.field1259.method1387(var3, 4);
            class94.field1259.method1410(var2, (byte) -125);
            class95.field1269++;
            class94.field1259.method1376(var5, 41);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 57) {
            class240 var20 = class253.field3656[var5];
            if (var20 != null) {
                field1702 = class190.field2736;
                class97.field1298 = 0;
                class285.field4413 = class76.field905;
                class73.field880 = 2;
                class94.field1259.method592(230, false);
                class255.field3680++;
                class94.field1259.method1364(var5, 1024);
                class94.field1259.method1403(-102, class260.field3784[82] ? 1 : 0);
            }
        }
        if (var4 == 19) {
            if (var5 == 0) {
                class182.field2617 = 1;
                class150.method988(class199.field2833, var3, var2);
            } else if (class88.field1192 > 0 && class260.field3784[82] && class260.field3784[81]) {
                class87.method512(-107, class110.field1473 + var3, class199.field2833, class166.field2383 + var2);
            } else {
                class189.field2706++;
                class94.field1259.method592(94, false);
                class94.field1259.method1376(class110.field1473 + var3, -108);
                class94.field1259.method1364(class166.field2383 + var2, arg0 + 1024);
            }
        }
        if (var4 == 28) {
            class217.field3077++;
            field1702 = class190.field2736;
            class285.field4413 = class76.field905;
            class73.field880 = 2;
            class97.field1298 = 0;
            class94.field1259.method592(163, false);
            class94.field1259.method1383((byte) 104, class166.field2383 + var2);
            class94.field1259.method1364(var5, 1024);
            class94.field1259.method1376(class110.field1473 + var3, arg0 + -122);
            class94.field1259.method1403(-103, class260.field3784[82] ? 1 : 0);
        }
        if (var4 == 17 && class165.field2365 == null) {
            class214.method1346(69, var3, var2);
            class165.field2365 = class112.method694(var3, false, var2);
            class255.method1632(arg0 ^ 0xFF0000, class165.field2365);
        }
        if (var4 == 46) {
            class240 var21 = class253.field3656[var5];
            if (var21 != null) {
                class97.field1298 = 0;
                field1702 = class190.field2736;
                class68.field799++;
                class73.field880 = 2;
                class285.field4413 = class76.field905;
                class94.field1259.method592(249, false);
                class94.field1259.method1387(var5, 4);
                class94.field1259.method1359(0, class260.field3784[82] ? 1 : 0);
            }
        }
        if (var4 == 49) {
            class285.field4374++;
            class97.field1298 = 0;
            field1702 = class190.field2736;
            class285.field4413 = class76.field905;
            class73.field880 = 2;
            class94.field1259.method592(251, false);
            class94.field1259.method1383((byte) 85, class276.field4192);
            class94.field1259.method1404((byte) 32, class287.field4469);
            class94.field1259.method1364(class110.field1473 + var3, 1024);
            class94.field1259.method1376((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 ^ 0x1);
            class94.field1259.method1370((byte) -96, class260.field3784[82] ? 1 : 0);
            class94.field1259.method1364(var2 + class166.field2383, 1024);
        }
        if (var4 == 10) {
            if (var5 == 0) {
                class38.field454 = 1;
                class150.method988(class199.field2833, var3, var2);
            } else if (var5 == 1) {
                class94.field1259.method592(142, false);
                class127.field1823++;
                class94.field1259.method1376(class110.field1473 + var3, arg0 + 106);
                class94.field1259.method1376(class166.field2383 + var2, 89);
                class94.field1259.method1376(class276.field4192, -125);
                class94.field1259.method1368(class287.field4469, -1204862360);
            }
        }
        if (var4 == 18) {
            class54 var22 = class20.field244[var5];
            if (var22 != null) {
                class285.field4413 = class76.field905;
                class97.field1298 = 0;
                class40.field474++;
                field1702 = class190.field2736;
                class73.field880 = 2;
                class94.field1259.method592(100, false);
                class94.field1259.method1359(0, class260.field3784[82] ? 1 : 0);
                class94.field1259.method1376(class270.field3947, -9);
                class94.field1259.method1364(class37.field427, 1024);
                class94.field1259.method1410(class130.field1885, (byte) 117);
                class94.field1259.method1383((byte) 101, var5);
            }
        }
        if (var4 == 2) {
            class94.field1259.method592(59, false);
            class274.field4082++;
            class94.field1259.method1364(var3, 1024);
            class94.field1259.method1361(var2, (byte) 20);
            class94.field1259.method1387(var5, 4);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 48) {
            class54 var23 = class20.field244[var5];
            if (var23 != null) {
                field1702 = class190.field2736;
                class284.field4359++;
                class97.field1298 = 0;
                class73.field880 = 2;
                class285.field4413 = class76.field905;
                class94.field1259.method592(126, false);
                class94.field1259.method1383((byte) -85, var5);
                class94.field1259.method1373(class260.field3784[82] ? 1 : 0, arg0 - 13985);
            }
        }
        if (var4 == 42) {
            class54 var24 = class20.field244[var5];
            if (var24 != null) {
                class97.field1298 = 0;
                class202.field2857++;
                class73.field880 = 2;
                field1702 = class190.field2736;
                class285.field4413 = class76.field905;
                class94.field1259.method592(47, false);
                class94.field1259.method1387(var5, 4);
                class94.field1259.method1373(class260.field3784[82] ? 1 : 0, -13985);
            }
        }
        if (var4 == 1004) {
            class82 var25 = class182.method1187((byte) -41, var2);
            if (var25 == null || var25.field1066[var3] < 100000) {
                class120.field1708++;
                class94.field1259.method592(138, false);
                class94.field1259.method1364(var5, 1024);
            } else {
                class225.method1455(var25.field1066[var3] + " x " + class36.method224(var5, 96).field3235, -121, "", 0);
            }
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 24) {
            if (var5 == 0) {
                class150.method988(class199.field2833, var3, var2);
            } else if (var5 == 1) {
                if (class88.field1192 > 0 && class260.field3784[82] && class260.field3784[81]) {
                    class87.method512(arg0 + 50, class110.field1473 - -var3, class199.field2833, class166.field2383 + var2);
                } else {
                    class230.method1505(false, var3, var2, 1);
                    class94.field1259.method1373(class248.field3611, -13985);
                    class94.field1259.method1373(class276.field4205, -13985);
                    class94.field1259.method1387((int) class274.field4085, 4);
                    class94.field1259.method1373(57, arg0 - 13985);
                    class94.field1259.method1373(class139.field2016, arg0 ^ 0xFFFFC95F);
                    class94.field1259.method1373(class15.field187, -13985);
                    class94.field1259.method1373(89, -13985);
                    class94.field1259.method1387(class177.field2507.field4563, 4);
                    class94.field1259.method1387(class177.field2507.field4553, 4);
                    class94.field1259.method1373(class284.field4360, -13985);
                    class94.field1259.method1373(63, -13985);
                }
            }
        }
        if (var4 == 50) {
            class103.field1403++;
            class94.field1259.method592(82, false);
            class94.field1259.method1387(var3, 4);
            class94.field1259.method1383((byte) -26, var5);
            class94.field1259.method1368(var2, -1204862360);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 30) {
            class94.field1259.method592(244, false);
            class219.field3104++;
            class94.field1259.method1410(var2, (byte) -126);
            class94.field1259.method1387(var5, 4);
            class94.field1259.method1383((byte) -39, var3);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 1006) {
            class285.field4413 = class76.field905;
            field1702 = class190.field2736;
            class73.field880 = 2;
            class97.field1298 = 0;
            class120.field1708++;
            class94.field1259.method592(138, false);
            class94.field1259.method1364(var5, 1024);
        }
        if (var4 == 26) {
            class240 var26 = class253.field3656[var5];
            if (var26 != null) {
                field1702 = class190.field2736;
                class228.field3218++;
                class73.field880 = 2;
                class97.field1298 = 0;
                class285.field4413 = class76.field905;
                class94.field1259.method592(213, false);
                class94.field1259.method1403(-124, class260.field3784[82] ? 1 : 0);
                class94.field1259.method1364(class37.field427, arg0 ^ 0x400);
                class94.field1259.method1404((byte) 63, class130.field1885);
                class94.field1259.method1383((byte) 116, class270.field3947);
                class94.field1259.method1383((byte) -41, var5);
            }
        }
        if (var4 == 12) {
            class94.field1259.method592(215, false);
            class94.field1259.method1383((byte) -87, var3);
            class94.field1259.method1368(var2, -1204862360);
            class135.field1969++;
            class94.field1259.method1387(var5, 4);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 1007) {
            class54.field630++;
            class97.field1298 = 0;
            field1702 = class190.field2736;
            class285.field4413 = class76.field905;
            class73.field880 = 2;
            class94.field1259.method592(19, false);
            class94.field1259.method1376(Integer.MAX_VALUE & (int) (var6 >>> 32), arg0 + 24);
            class94.field1259.method1376(var3 + class110.field1473, 82);
            class94.field1259.method1376(class166.field2383 + var2, -6);
            class94.field1259.method1403(-120, class260.field3784[82] ? 1 : 0);
        }
        if (var4 == 59) {
            class240 var27 = class253.field3656[var5];
            if (var27 != null) {
                class285.field4413 = class76.field905;
                field1702 = class190.field2736;
                class108.field1458++;
                class97.field1298 = 0;
                class73.field880 = 2;
                class94.field1259.method592(227, false);
                class94.field1259.method1373(class260.field3784[82] ? 1 : 0, arg0 - 13985);
                class94.field1259.method1364(class276.field4192, 1024);
                class94.field1259.method1368(class287.field4469, arg0 ^ 0xB82F4268);
                class94.field1259.method1376(var5, -4);
            }
        }
        if (var4 == 8) {
            class142.method922((byte) 114);
        }
        if (var4 == 40) {
            class240 var28 = class253.field3656[var5];
            if (var28 != null) {
                class285.field4413 = class76.field905;
                class246.field3575++;
                class97.field1298 = 0;
                class73.field880 = 2;
                field1702 = class190.field2736;
                class94.field1259.method592(255, false);
                class94.field1259.method1373(class260.field3784[82] ? 1 : 0, -13985);
                class94.field1259.method1383((byte) -49, var5);
            }
        }
        if (var4 == 1003) {
            class285.field4413 = class76.field905;
            class176.field2505++;
            class97.field1298 = 0;
            field1702 = class190.field2736;
            class73.field880 = 2;
            class94.field1259.method592(203, false);
            class94.field1259.method1364(var5, 1024);
        }
        if (var4 == 45) {
            class220.field3116++;
            class94.field1259.method592(34, false);
            class94.field1259.method1364(var3, 1024);
            class94.field1259.method1364(var5, 1024);
            class94.field1259.method1368(var2, -1204862360);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 1005) {
            class73.field880 = 2;
            class97.field1298 = 0;
            field1702 = class190.field2736;
            class285.field4413 = class76.field905;
            class54 var29 = class20.field244[var5];
            if (var29 != null) {
                class267 var30 = var29.field636;
                if (var30.field3884 != null) {
                    var30 = var30.method1707(-1);
                }
                if (var30 != null) {
                    class196.field2793++;
                    class94.field1259.method592(90, false);
                    class94.field1259.method1383((byte) -81, var30.field3890);
                }
            }
        }
        if (var4 == 23) {
            class240 var31 = class253.field3656[var5];
            if (var31 != null) {
                field1702 = class190.field2736;
                class209.field2947++;
                class285.field4413 = class76.field905;
                class97.field1298 = 0;
                class73.field880 = 2;
                class94.field1259.method592(139, false);
                class94.field1259.method1403(-111, class260.field3784[82] ? 1 : 0);
                class94.field1259.method1364(var5, arg0 + 1024);
            }
        }
        if (var4 == 38) {
            class199.field2826++;
            class73.field880 = 2;
            field1702 = class190.field2736;
            class97.field1298 = 0;
            class285.field4413 = class76.field905;
            class94.field1259.method592(166, false);
            class94.field1259.method1373(class260.field3784[82] ? 1 : 0, arg0 - 13985);
            class94.field1259.method1383((byte) 121, var3 + class110.field1473);
            class94.field1259.method1364(var5, arg0 + 1024);
            class94.field1259.method1364(class166.field2383 + var2, 1024);
        }
        if (var4 == 13) {
            class54 var32 = class20.field244[var5];
            if (var32 != null) {
                field1702 = class190.field2736;
                class73.field880 = 2;
                class97.field1298 = 0;
                class285.field4413 = class76.field905;
                class94.field1259.method592(37, false);
                class94.field1259.method1376(class276.field4192, -118);
                class94.field1259.method1403(-105, class260.field3784[82] ? 1 : 0);
                class289.field4496++;
                class94.field1259.method1368(class287.field4469, -1204862360);
                class94.field1259.method1364(var5, 1024);
            }
        }
        if (var4 == 9) {
            class73.field880 = 2;
            class97.field1298 = 0;
            class285.field4413 = class76.field905;
            field1702 = class190.field2736;
            class166.field2386++;
            class94.field1259.method592(107, false);
            class94.field1259.method1370((byte) -52, class260.field3784[82] ? 1 : 0);
            class94.field1259.method1383((byte) -119, class166.field2383 + var2);
            class94.field1259.method1387(Integer.MAX_VALUE & (int) (var6 >>> 32), 4);
            class94.field1259.method1376(var3 + class110.field1473, 122);
        }
        if (var4 == 22) {
            class73.field880 = 2;
            class97.field1298 = 0;
            field1702 = class190.field2736;
            class285.field4413 = class76.field905;
            class288.field4483++;
            class94.field1259.method592(127, false);
            class94.field1259.method1383((byte) 108, var3 + class110.field1473);
            class94.field1259.method1364(class37.field427, 1024);
            class94.field1259.method1383((byte) 124, class166.field2383 + var2);
            class94.field1259.method1387(class270.field3947, 4);
            class94.field1259.method1410(class130.field1885, (byte) -24);
            class94.field1259.method1387(Integer.MAX_VALUE & (int) (var6 >>> 32), 4);
            class94.field1259.method1359(0, class260.field3784[82] ? 1 : 0);
        }
        if (var4 == 35) {
            class82 var33 = class112.method694(var3, false, var2);
            if (var33 != null) {
                class54.method328(false);
                class178 var34 = client.method1920(var33);
                class202.method1299(113, var2, var33.field1077, var34.method1159(false), var3, var34.field2527, var33.field1015);
                class196.field2790 = 0;
                class133.field1945 = method766(0, var33);
                if (class133.field1945 == null) {
                    class133.field1945 = "Null";
                }
                if (var33.field1126) {
                    class48.field560 = var33.field1021 + "<col=ffffff>";
                    return;
                }
                class48.field560 = "<col=00ff00>" + var33.field975 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 34) {
            class145.field2107++;
            class94.field1259.method592(243, false);
            class94.field1259.method1387(var3, 4);
            class94.field1259.method1404((byte) 63, var2);
            class94.field1259.method1383((byte) -65, var5);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 31 || var4 == 1001) {
            class45.method284(var2, var3, class240.field3482[arg1], true, var5);
        }
        if (var4 == 11) {
            class285.field4413 = class76.field905;
            field1702 = class190.field2736;
            class196.field2799++;
            class97.field1298 = 0;
            class73.field880 = 2;
            class94.field1259.method592(33, false);
            class94.field1259.method1364(class37.field427, arg0 + 1024);
            class94.field1259.method1376(var2 + class166.field2383, arg0 ^ 0xFFFFFF83);
            class94.field1259.method1387(var3 + class110.field1473, 4);
            class94.field1259.method1376(var5, -117);
            class94.field1259.method1404((byte) 76, class130.field1885);
            class94.field1259.method1403(-99, class260.field3784[82] ? 1 : 0);
            class94.field1259.method1376(class270.field3947, -111);
        }
        if (var4 == 21) {
            class54 var35 = class20.field244[var5];
            if (var35 != null) {
                class285.field4413 = class76.field905;
                class117.field1650++;
                class97.field1298 = 0;
                field1702 = class190.field2736;
                class73.field880 = 2;
                class94.field1259.method592(140, false);
                class94.field1259.method1359(arg0, class260.field3784[82] ? 1 : 0);
                class94.field1259.method1376(var5, -113);
            }
        }
        if (var4 == 36) {
            class240 var36 = class253.field3656[var5];
            if (var36 != null) {
                class285.field4413 = class76.field905;
                field1702 = class190.field2736;
                class1.field7++;
                class73.field880 = 2;
                class97.field1298 = 0;
                class94.field1259.method592(111, false);
                class94.field1259.method1376(var5, 55);
                class94.field1259.method1403(-125, class260.field3784[82] ? 1 : 0);
            }
        }
        if (var4 == 16) {
            class175.field2486++;
            class94.field1259.method592(44, false);
            class94.field1259.method1383((byte) -46, class276.field4192);
            class94.field1259.method1376(var3, 107);
            class94.field1259.method1364(var5, 1024);
            class94.field1259.method1404((byte) 16, var2);
            class94.field1259.method1404((byte) 64, class287.field4469);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 47) {
            class73.field880 = 2;
            field1702 = class190.field2736;
            class189.field2716++;
            class285.field4413 = class76.field905;
            class97.field1298 = 0;
            class94.field1259.method592(190, false);
            class94.field1259.method1359(0, class260.field3784[82] ? 1 : 0);
            class94.field1259.method1383((byte) 119, class276.field4192);
            class94.field1259.method1383((byte) -84, var2 + class166.field2383);
            class94.field1259.method1376(var5, 69);
            class94.field1259.method1383((byte) 109, class110.field1473 + var3);
            class94.field1259.method1410(class287.field4469, (byte) 90);
        }
        if (var4 == 60) {
            class59.field702++;
            class94.field1259.method592(160, false);
            class94.field1259.method1364(var3, 1024);
            class94.field1259.method1368(class287.field4469, -1204862360);
            class94.field1259.method1404((byte) 79, var2);
            class94.field1259.method1376(class276.field4192, arg0 ^ 0x12);
        }
        if (var4 == 58) {
            class94.field1259.method592(219, false);
            class94.field1259.method1361(var2, (byte) 20);
            class94.field1259.method1364(var3, 1024);
            class94.field1259.method1364(var5, 1024);
            class272.field3988++;
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (var4 == 3) {
            field1702 = class190.field2736;
            class97.field1298 = 0;
            class285.field4413 = class76.field905;
            class141.field2030++;
            class73.field880 = 2;
            class94.field1259.method592(187, false);
            class94.field1259.method1387(class110.field1473 + var3, 4);
            class94.field1259.method1403(-118, class260.field3784[82] ? 1 : 0);
            class94.field1259.method1383((byte) -37, class166.field2383 + var2);
            class94.field1259.method1376(Integer.MAX_VALUE & (int) (var6 >>> 32), 68);
        }
        if (var4 == 39) {
            class94.field1259.method592(129, false);
            class257.field3737++;
            class94.field1259.method1364(var3, 1024);
            class94.field1259.method1404((byte) 94, var2);
            class94.field1259.method1383((byte) 126, var5);
            class152.field2200 = 0;
            class202.field2863 = class182.method1187((byte) -41, var2);
            class4.field60 = var3;
        }
        if (class196.field2790 != 0) {
            class196.field2790 = 0;
            class255.method1632(arg0 + 16711680, class182.method1187((byte) -41, class130.field1885));
        }
        if (class267.field3857) {
            class54.method328(false);
        }
        if (class202.field2863 != null && class152.field2200 == 0) {
            class255.method1632(arg0 + 16711680, class202.field2863);
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(II)Z")
    public final boolean method774(int arg0, int arg1) {
        field1693++;
        if (arg1 > -45) {
            field1680 = null;
        }
        return this.method419(arg0, -208).field1276;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public final void method775(byte arg0) {
        if (arg0 > -29) {
            return;
        }
        field1683++;
        this.field1685.method1572(8);
        if (this.field1692 != null) {
            this.field1692.method1572(8);
        }
        class218.field3090 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)I")
    public final int method776(byte arg0, int arg1) {
        field1699++;
        if (arg0 != 11) {
            field1697 = null;
        }
        return this.method419(arg1, -208).field1272 & 0xFFFF;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(ZI)I")
    public static final int method777(boolean arg0, int arg1) {
        if (arg1 != 0) {
            return 122;
        }
        field1695++;
        long var2 = class86.method509(false);
        for (class277 var4 = arg0 ? (class277) class26.field313.method1890((byte) 104) : (class277) class26.field313.method1889(false); var4 != null; var4 = (class277) class26.field313.method1889(false)) {
            if ((var4.field4206 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4206 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4489;
                    class164.field2358[var5] = class19.field224[var5];
                    var4.method1935(arg1 ^ 0x7C);
                    return var5;
                }
                var4.method1935(123);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)Lii;")
    private final class218 method778(int arg0, boolean arg1) {
        class218 var3 = (class218) this.field1685.method1567((long) arg0, 8);
        field1700++;
        if (arg1) {
            method768((byte) -17);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1694.method1861(0, arg0, 1);
        if (var4 == null) {
            return null;
        } else {
            class218 var5 = new class218(new class216(var4));
            this.field1685.method1568((byte) -74, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILca;Lca;IIJ)V")
    public static final void method779(int arg0, int arg1, int arg2, int arg3, class131 arg4, class131 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class118 var10 = new class118();
        var10.field1662 = arg8;
        var10.field1670 = arg1 * 128 + 64;
        var10.field1661 = arg2 * 128 + 64;
        var10.field1673 = arg3;
        var10.field1672 = arg4;
        var10.field1659 = arg5;
        var10.field1664 = arg6;
        var10.field1677 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class6.field94[var11][arg1][arg2] == null) {
                class6.field94[var11][arg1][arg2] = new class133(var11, arg1, arg2);
            }
        }
        class6.field94[arg0][arg1][arg2].field1927 = var10;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IZ)V")
    public final void method780(int arg0, boolean arg1) {
        this.field1684 = arg1;
        if (arg0 != 19592) {
            field1704 = null;
        }
        field1703++;
        this.method775((byte) -50);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lbc;Lbc;Lbc;IZ)V")
    public class119(class282 arg0, class282 arg1, class282 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field1691 = arg3;
        this.field1689 = arg2;
        this.field1694 = arg0;
        this.field1684 = arg4;
        this.field1685 = new class241(this.field1691);
        this.field1692 = null;
    }
}
