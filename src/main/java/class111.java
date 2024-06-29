import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class111 {

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "[I")
    private static int[] field1623 = new int[5];

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "[Lfg;")
    private static class66[] field1625 = new class66[50];

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[[I")
    private static int[][] field1617 = new int[5][5000];

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    private static int field1633 = 0;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "[I")
    private static int[] field1635 = new int[1000];

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field1637 = new String[1000];

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1627 = Calendar.getInstance();

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "[I")
    private static int[] field1639 = new int[3];

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field1641 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "Lng;")
    public static class190 field1640 = new class190(4);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lka;")
    private static class275 field1619;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Lrg;")
    private static class383 field1629;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "Lrg;")
    private static class383 field1638;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[I")
    private static int[] field1626;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "[Ljava/lang/String;")
    private static String[] field1631;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
    public static final void method737(int arg0, int arg1, int arg2) {
        class84 var3 = class81.method580((byte) 122, arg1, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field1626 = new int[var3.field1289];
        field1631 = new String[var3.field1300];
        if (var3.field1298 == 15 || var3.field1298 == 17 || var3.field1298 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class245.field3389 != null) {
                var4 = class245.field3389.field5470;
                var5 = class245.field3389.field5428;
            }
            field1626[0] = class349.field4883 - var4;
            field1626[1] = class162.field2269 - var5;
        }
        method741(var3, 200000);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lkb;)V")
    public static final void method738(class410 arg0) {
        method740(arg0, 200000);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static final void method739(int arg0) {
        if (arg0 == -1 || !class77.method545(true, arg0)) {
            return;
        }
        class383[] var1 = class333.field4511[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class383 var3 = var1[var2];
            if (var3.field5462 != null) {
                class410 var4 = new class410();
                var4.field5946 = var3;
                var4.field5961 = var3.field5462;
                method740(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lkb;I)V")
    private static final void method740(class410 arg0, int arg1) {
        Object[] var2 = arg0.field5961;
        int var3 = (Integer) var2[0];
        class84 var4 = class417.method2662(var3, 0);
        if (var4 == null) {
            return;
        }
        field1626 = new int[var4.field1289];
        int var5 = 0;
        field1631 = new String[var4.field1300];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5949;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5959;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5946 == null ? -1 : arg0.field5946.field5507;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5958;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5946 == null ? -1 : arg0.field5946.field5545;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5954 == null ? -1 : arg0.field5954.field5507;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5954 == null ? -1 : arg0.field5954.field5545;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5953;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5957;
                }
                field1626[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5950;
                }
                field1631[var6++] = var9;
            }
        }
        method741(var4, arg1);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lvf;I)V")
    private static final void method741(class84 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field1296;
        int[] var6 = arg0.field1301;
        byte var7 = -1;
        field1633 = 0;
        try {
            int var8 = 0;
            label4457: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var619 = var5[var4];
                if (var619 < 100) {
                    if (var619 == 0) {
                        field1635[var2++] = var6[var4];
                        continue;
                    }
                    if (var619 == 1) {
                        int var9 = var6[var4];
                        field1635[var2++] = class447.field6439[var9];
                        continue;
                    }
                    if (var619 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class357.method2309(var10, true, field1635[var2]);
                        continue;
                    }
                    if (var619 == 3) {
                        field1637[var3++] = arg0.field1295[var4];
                        continue;
                    }
                    if (var619 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var619 == 7) {
                        var2 -= 2;
                        if (field1635[var2 + 1] != field1635[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var619 == 8) {
                        var2 -= 2;
                        if (field1635[var2 + 1] == field1635[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var619 == 9) {
                        var2 -= 2;
                        if (field1635[var2] < field1635[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var619 == 10) {
                        var2 -= 2;
                        if (field1635[var2] > field1635[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var619 == 21) {
                        if (field1633 == 0) {
                            return;
                        }
                        class66 var11 = field1625[--field1633];
                        arg0 = var11.field1036;
                        var5 = arg0.field1296;
                        var6 = arg0.field1301;
                        var4 = var11.field1042;
                        field1626 = var11.field1041;
                        field1631 = var11.field1034;
                        continue;
                    }
                    if (var619 == 25) {
                        int var12 = var6[var4];
                        field1635[var2++] = class315.method2012(21375, var12);
                        continue;
                    }
                    if (var619 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class270.method1660((byte) -121, field1635[var2], var13);
                        continue;
                    }
                    if (var619 == 31) {
                        var2 -= 2;
                        if (field1635[var2] <= field1635[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var619 == 32) {
                        var2 -= 2;
                        if (field1635[var2] >= field1635[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var619 == 33) {
                        field1635[var2++] = field1626[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var619 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field1626[var10001] = field1635[var2];
                        continue;
                    }
                    if (var619 == 35) {
                        field1637[var3++] = field1631[var6[var4]];
                        continue;
                    }
                    if (var619 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field1631[var10001] = field1637[var3];
                        continue;
                    }
                    if (var619 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class298.method1923(field1637, var14, var3, 110);
                        field1637[var3++] = var15;
                        continue;
                    }
                    if (var619 == 38) {
                        var2--;
                        continue;
                    }
                    if (var619 == 39) {
                        var3--;
                        continue;
                    }
                    if (var619 == 40) {
                        int var16 = var6[var4];
                        class84 var17 = class417.method2662(var16, 0);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field1289];
                        String[] var19 = new String[var17.field1300];
                        for (int var20 = 0; var20 < var17.field1292; var20++) {
                            var18[var20] = field1635[var2 + var20 - var17.field1292];
                        }
                        for (int var21 = 0; var21 < var17.field1288; var21++) {
                            var19[var21] = field1637[var3 + var21 - var17.field1288];
                        }
                        var2 -= var17.field1292;
                        var3 -= var17.field1288;
                        class66 var22 = new class66();
                        var22.field1036 = arg0;
                        var22.field1042 = var4;
                        var22.field1041 = field1626;
                        var22.field1034 = field1631;
                        if (field1633 >= field1625.length) {
                            throw new RuntimeException();
                        }
                        field1625[field1633++] = var22;
                        arg0 = var17;
                        var5 = var17.field1296;
                        var6 = var17.field1301;
                        var4 = -1;
                        field1626 = var18;
                        field1631 = var19;
                        continue;
                    }
                    if (var619 == 42) {
                        field1635[var2++] = class220.field2890[var6[var4]];
                        continue;
                    }
                    if (var619 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class220.field2890[var23] = field1635[var2];
                        class81.method577(-128, var23);
                        class27.field435 |= class137.field1958[var23];
                        continue;
                    }
                    if (var619 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field1635[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field1623[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4457;
                                }
                                field1617[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var619 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field1635[var2];
                        if (var30 >= 0 && var30 < field1623[var29]) {
                            field1635[var2++] = field1617[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var619 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field1635[var2];
                        if (var32 >= 0 && var32 < field1623[var31]) {
                            field1617[var31][var32] = field1635[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var619 == 47) {
                        String var33 = class97.field1505[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field1637[var3++] = var33;
                        continue;
                    }
                    if (var619 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class97.field1505[var34] = field1637[var3];
                        class163.method1086(var34, (byte) -96);
                        continue;
                    }
                    if (var619 == 51) {
                        class223 var35 = arg0.field1291[var6[var4]];
                        var2--;
                        class23 var36 = (class23) var35.method1412((byte) -54, (long) field1635[var2]);
                        if (var36 != null) {
                            var4 += var36.field316;
                        }
                        continue;
                    }
                }
                boolean var37;
                if (var6[var4] == 1) {
                    var37 = true;
                } else {
                    var37 = false;
                }
                if (var619 < 300) {
                    if (var619 == 100) {
                        var2 -= 3;
                        int var38 = field1635[var2];
                        int var39 = field1635[var2 + 1];
                        int var40 = field1635[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class383 var41 = class290.method1869((byte) 18, var38);
                        if (var41.field5465 == null) {
                            var41.field5465 = new class383[var40 + 1];
                        }
                        if (var41.field5465.length <= var40) {
                            class383[] var42 = new class383[var40 + 1];
                            for (int var43 = 0; var43 < var41.field5465.length; var43++) {
                                var42[var43] = var41.field5465[var43];
                            }
                            var41.field5465 = var42;
                        }
                        if (var40 > 0 && var41.field5465[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class383 var44 = new class383();
                        var44.field5488 = var39;
                        var44.field5538 = var44.field5507 = var41.field5507;
                        var44.field5545 = var40;
                        var44.field5589 = true;
                        var41.field5465[var40] = var44;
                        if (var37) {
                            field1638 = var44;
                        } else {
                            field1629 = var44;
                        }
                        class86.method596(14459, var41);
                        continue;
                    }
                    if (var619 == 101) {
                        class383 var45 = var37 ? field1638 : field1629;
                        if (var45.field5545 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class383 var46 = class290.method1869((byte) 97, var45.field5507);
                        var46.field5465[var45.field5545] = null;
                        class86.method596(14459, var46);
                        continue;
                    }
                    if (var619 == 102) {
                        var2--;
                        class383 var47 = class290.method1869((byte) 42, field1635[var2]);
                        var47.field5465 = null;
                        class86.method596(14459, var47);
                        continue;
                    }
                    if (var619 == 200) {
                        var2 -= 2;
                        int var48 = field1635[var2];
                        int var49 = field1635[var2 + 1];
                        class383 var50 = class315.method2010(var48, var49, -27590);
                        if (var50 != null && var49 != -1) {
                            field1635[var2++] = 1;
                            if (var37) {
                                field1638 = var50;
                            } else {
                                field1629 = var50;
                            }
                            continue;
                        }
                        field1635[var2++] = 0;
                        continue;
                    }
                    if (var619 == 201) {
                        var2--;
                        int var51 = field1635[var2];
                        class383 var52 = class290.method1869((byte) 22, var51);
                        if (var52 == null) {
                            field1635[var2++] = 0;
                        } else {
                            field1635[var2++] = 1;
                            if (var37) {
                                field1638 = var52;
                            } else {
                                field1629 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var619 < 500) {
                    if (var619 == 403) {
                        var2 -= 2;
                        int var53 = field1635[var2];
                        int var54 = field1635[var2 + 1];
                        for (int var55 = 0; var55 < class53.field782.length; var55++) {
                            if (class53.field782[var55] == var53) {
                                class307.field4211.field4965.method2633(false, var54, var55);
                                continue label4457;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class48.field744.length) {
                                continue label4457;
                            }
                            if (class48.field744[var56] == var53) {
                                class307.field4211.field4965.method2633(false, var54, var56);
                                continue label4457;
                            }
                            var56++;
                        }
                    }
                    if (var619 == 404) {
                        var2 -= 2;
                        int var57 = field1635[var2];
                        int var58 = field1635[var2 + 1];
                        class307.field4211.field4965.method2634(var58, 5397, var57);
                        continue;
                    }
                    if (var619 == 410) {
                        var2--;
                        boolean var59 = field1635[var2] != 0;
                        class307.field4211.field4965.method2642(var59, -21790);
                        continue;
                    }
                } else if (var619 >= 1000 && var619 < 1100 || var619 >= 2000 && var619 < 2100) {
                    class383 var60;
                    if (var619 >= 2000) {
                        var619 -= 1000;
                        var2--;
                        var60 = class290.method1869((byte) 41, field1635[var2]);
                    } else {
                        var60 = var37 ? field1638 : field1629;
                    }
                    if (var619 == 1000) {
                        var2 -= 4;
                        var60.field5439 = field1635[var2];
                        var60.field5581 = field1635[var2 + 1];
                        int var61 = field1635[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field1635[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field5546 = (byte) var61;
                        var60.field5471 = (byte) var62;
                        class86.method596(14459, var60);
                        class125.method834(0, var60);
                        if (var60.field5545 == -1) {
                            class398.method2571(true, var60.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1001) {
                        var2 -= 4;
                        var60.field5493 = field1635[var2];
                        var60.field5454 = field1635[var2 + 1];
                        var60.field5521 = 0;
                        var60.field5498 = 0;
                        int var63 = field1635[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field1635[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field5580 = (byte) var63;
                        var60.field5541 = (byte) var64;
                        class86.method596(14459, var60);
                        class125.method834(0, var60);
                        if (var60.field5488 == 0) {
                            class21.method140(-4492, false, var60);
                        }
                        continue;
                    }
                    if (var619 == 1003) {
                        var2--;
                        boolean var65 = field1635[var2] == 1;
                        if (var60.field5444 != var65) {
                            var60.field5444 = var65;
                            class86.method596(14459, var60);
                        }
                        if (var60.field5545 == -1) {
                            class261.method1609(var60.field5507, false);
                        }
                        continue;
                    }
                    if (var619 == 1004) {
                        var2 -= 2;
                        var60.field5438 = field1635[var2];
                        var60.field5597 = field1635[var2 + 1];
                        class86.method596(14459, var60);
                        class125.method834(0, var60);
                        if (var60.field5488 == 0) {
                            class21.method140(-4492, false, var60);
                        }
                        continue;
                    }
                    if (var619 == 1005) {
                        var2--;
                        var60.field5567 = field1635[var2] == 1;
                        continue;
                    }
                } else if (var619 >= 1100 && var619 < 1200 || var619 >= 2100 && var619 < 2200) {
                    class383 var66;
                    if (var619 >= 2000) {
                        var619 -= 1000;
                        var2--;
                        var66 = class290.method1869((byte) 98, field1635[var2]);
                    } else {
                        var66 = var37 ? field1638 : field1629;
                    }
                    if (var619 == 1100) {
                        var2 -= 2;
                        var66.field5511 = field1635[var2];
                        if (var66.field5511 > var66.field5433 - var66.field5431) {
                            var66.field5511 = var66.field5433 - var66.field5431;
                        }
                        if (var66.field5511 < 0) {
                            var66.field5511 = 0;
                        }
                        var66.field5434 = field1635[var2 + 1];
                        if (var66.field5434 > var66.field5590 - var66.field5491) {
                            var66.field5434 = var66.field5590 - var66.field5491;
                        }
                        if (var66.field5434 < 0) {
                            var66.field5434 = 0;
                        }
                        class86.method596(14459, var66);
                        if (var66.field5545 == -1) {
                            class158.method1061(var66.field5507, (byte) -117);
                        }
                        continue;
                    }
                    if (var619 == 1101) {
                        var2--;
                        var66.field5468 = field1635[var2];
                        class86.method596(14459, var66);
                        if (var66.field5545 == -1) {
                            class327.method2057(var66.field5507, -123);
                        }
                        continue;
                    }
                    if (var619 == 1102) {
                        var2--;
                        var66.field5526 = field1635[var2] == 1;
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1103) {
                        var2--;
                        var66.field5594 = field1635[var2];
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1104) {
                        var2--;
                        var66.field5453 = field1635[var2];
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1105) {
                        var2--;
                        int var67 = field1635[var2];
                        if (var66.field5423 != var67) {
                            var66.field5423 = var67;
                            class86.method596(14459, var66);
                        }
                        if (var66.field5545 == -1) {
                            class127.method846(124, var66.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1106) {
                        var2--;
                        var66.field5495 = field1635[var2];
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1107) {
                        var2--;
                        var66.field5608 = field1635[var2] == 1;
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1108) {
                        var66.field5457 = 1;
                        var2--;
                        var66.field5554 = field1635[var2];
                        class86.method596(14459, var66);
                        if (var66.field5545 == -1) {
                            class349.method2230(-5, var66.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1109) {
                        var2 -= 6;
                        var66.field5432 = field1635[var2];
                        var66.field5588 = field1635[var2 + 1];
                        var66.field5585 = field1635[var2 + 2];
                        var66.field5603 = field1635[var2 + 3];
                        var66.field5479 = field1635[var2 + 4];
                        var66.field5504 = field1635[var2 + 5];
                        class86.method596(14459, var66);
                        if (var66.field5545 == -1) {
                            class164.method1091(var66.field5507, 8);
                            class23.method155(-63, var66.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1110) {
                        var2--;
                        int var68 = field1635[var2];
                        if (var66.field5551 != var68) {
                            var66.field5551 = var68;
                            var66.field5426 = 0;
                            var66.field5544 = 1;
                            var66.field5446 = 0;
                            class86.method596(14459, var66);
                        }
                        if (var66.field5545 == -1) {
                            class15.method83(5, var66.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1111) {
                        var2--;
                        var66.field5497 = field1635[var2] == 1;
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1112) {
                        var3--;
                        String var69 = field1637[var3];
                        if (!var69.equals(var66.field5445)) {
                            var66.field5445 = var69;
                            class86.method596(14459, var66);
                        }
                        if (var66.field5545 == -1) {
                            class231.method1449(var66.field5507, (byte) 70);
                        }
                        continue;
                    }
                    if (var619 == 1113) {
                        var2--;
                        var66.field5562 = field1635[var2];
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1114) {
                        var2 -= 3;
                        var66.field5556 = field1635[var2];
                        var66.field5499 = field1635[var2 + 1];
                        var66.field5610 = field1635[var2 + 2];
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1115) {
                        var2--;
                        var66.field5476 = field1635[var2] == 1;
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1116) {
                        var2--;
                        var66.field5510 = field1635[var2];
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1117) {
                        var2--;
                        var66.field5520 = field1635[var2];
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1118) {
                        var2--;
                        var66.field5478 = field1635[var2] == 1;
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1119) {
                        var2--;
                        var66.field5577 = field1635[var2] == 1;
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1120) {
                        var2 -= 2;
                        var66.field5433 = field1635[var2];
                        var66.field5590 = field1635[var2 + 1];
                        class86.method596(14459, var66);
                        if (var66.field5488 == 0) {
                            class21.method140(-4492, false, var66);
                        }
                        continue;
                    }
                    if (var619 == 1121) {
                        var2 -= 2;
                        var66.field5542 = (short) field1635[var2];
                        var66.field5442 = (short) field1635[var2 + 1];
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1122) {
                        var2--;
                        var66.field5472 = field1635[var2] == 1;
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1123) {
                        var2--;
                        var66.field5504 = field1635[var2];
                        class86.method596(14459, var66);
                        if (var66.field5545 == -1) {
                            class164.method1091(var66.field5507, 8);
                        }
                        continue;
                    }
                    if (var619 == 1124) {
                        var2--;
                        int var70 = field1635[var2];
                        var66.field5441 = var70 == 1;
                        class86.method596(14459, var66);
                        continue;
                    }
                    if (var619 == 1125) {
                        var2 -= 2;
                        var66.field5469 = field1635[var2];
                        var66.field5463 = field1635[var2 + 1];
                        class86.method596(14459, var66);
                        continue;
                    }
                } else if (var619 >= 1200 && var619 < 1300 || var619 >= 2200 && var619 < 2300) {
                    class383 var71;
                    if (var619 >= 2000) {
                        var619 -= 1000;
                        var2--;
                        var71 = class290.method1869((byte) 65, field1635[var2]);
                    } else {
                        var71 = var37 ? field1638 : field1629;
                    }
                    class86.method596(14459, var71);
                    if (var619 == 1200 || var619 == 1205 || var619 == 1208 || var619 == 1209 || var619 == 1212 || var619 == 1213) {
                        var2 -= 2;
                        int var72 = field1635[var2];
                        int var73 = field1635[var2 + 1];
                        if (var71.field5545 == -1) {
                            class383.method2495(-108, var71.field5507);
                            class164.method1091(var71.field5507, 8);
                            class23.method155(-36, var71.field5507);
                        }
                        if (var72 == -1) {
                            var71.field5457 = 1;
                            var71.field5554 = -1;
                            var71.field5569 = -1;
                            continue;
                        }
                        var71.field5569 = var72;
                        var71.field5571 = var73;
                        if (var619 == 1208 || var619 == 1209) {
                            var71.field5466 = true;
                        } else {
                            var71.field5466 = false;
                        }
                        class389 var74 = class347.method2222(var72, 18682);
                        var71.field5585 = var74.field5656;
                        var71.field5603 = var74.field5724;
                        var71.field5479 = var74.field5653;
                        var71.field5432 = var74.field5660;
                        var71.field5588 = var74.field5682;
                        var71.field5504 = var74.field5714;
                        if (var619 == 1205 || var619 == 1209) {
                            var71.field5430 = 0;
                        } else if (var619 == 1212 || var619 == 1213) {
                            var71.field5430 = 1;
                        } else {
                            var71.field5430 = 2;
                        }
                        if (var71.field5521 > 0) {
                            var71.field5504 = var71.field5504 * 32 / var71.field5521;
                        } else if (var71.field5493 > 0) {
                            var71.field5504 = var71.field5504 * 32 / var71.field5493;
                        }
                        continue;
                    }
                    if (var619 == 1201) {
                        var71.field5457 = 2;
                        var2--;
                        var71.field5554 = field1635[var2];
                        if (var71.field5545 == -1) {
                            class349.method2230(-5, var71.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1202) {
                        var71.field5457 = 3;
                        var71.field5554 = -1;
                        if (var71.field5545 == -1) {
                            class349.method2230(-5, var71.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1203) {
                        var71.field5457 = 6;
                        var2--;
                        var71.field5554 = field1635[var2];
                        if (var71.field5545 == -1) {
                            class349.method2230(-5, var71.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1204) {
                        var71.field5457 = 5;
                        var2--;
                        var71.field5554 = field1635[var2];
                        if (var71.field5545 == -1) {
                            class349.method2230(-5, var71.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1206) {
                        var2 -= 4;
                        var71.field5503 = field1635[var2];
                        var71.field5524 = field1635[var2 + 1];
                        var71.field5540 = field1635[var2 + 2];
                        var71.field5485 = field1635[var2 + 3];
                        class86.method596(14459, var71);
                        continue;
                    }
                    if (var619 == 1207) {
                        var2 -= 2;
                        var71.field5601 = field1635[var2];
                        var71.field5486 = field1635[var2 + 1];
                        class86.method596(14459, var71);
                        continue;
                    }
                    if (var619 == 1210) {
                        var2 -= 4;
                        var71.field5554 = field1635[var2];
                        var71.field5437 = field1635[var2 + 1];
                        if (field1635[var2 + 2] == 1) {
                            var71.field5457 = 9;
                        } else {
                            var71.field5457 = 8;
                        }
                        if (field1635[var2 + 3] == 1) {
                            var71.field5466 = true;
                        } else {
                            var71.field5466 = false;
                        }
                        if (var71.field5545 == -1) {
                            class349.method2230(-5, var71.field5507);
                        }
                        continue;
                    }
                    if (var619 == 1211) {
                        var71.field5457 = 5;
                        var71.field5554 = 2047;
                        var71.field5437 = 0;
                        if (var71.field5545 == -1) {
                            class349.method2230(-5, var71.field5507);
                        }
                        continue;
                    }
                } else if (var619 >= 1300 && var619 < 1400 || var619 >= 2300 && var619 < 2400) {
                    class383 var75;
                    if (var619 >= 2000) {
                        var619 -= 1000;
                        var2--;
                        var75 = class290.method1869((byte) 55, field1635[var2]);
                    } else {
                        var75 = var37 ? field1638 : field1629;
                    }
                    if (var619 == 1300) {
                        var2--;
                        int var76 = field1635[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method2499(-26826, field1637[var3], var76);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var619 == 1301) {
                        var2 -= 2;
                        int var77 = field1635[var2];
                        int var78 = field1635[var2 + 1];
                        var75.field5508 = class315.method2010(var77, var78, -27590);
                        continue;
                    }
                    if (var619 == 1302) {
                        var2--;
                        var75.field5519 = field1635[var2] == 1;
                        continue;
                    }
                    if (var619 == 1303) {
                        var2--;
                        var75.field5576 = field1635[var2];
                        continue;
                    }
                    if (var619 == 1304) {
                        var2--;
                        var75.field5447 = field1635[var2];
                        continue;
                    }
                    if (var619 == 1305) {
                        var3--;
                        var75.field5583 = field1637[var3];
                        continue;
                    }
                    if (var619 == 1306) {
                        var3--;
                        var75.field5436 = field1637[var3];
                        continue;
                    }
                    if (var619 == 1307) {
                        var75.field5482 = null;
                        continue;
                    }
                    if (var619 == 1308) {
                        var2--;
                        var75.field5522 = field1635[var2];
                        var2--;
                        var75.field5533 = field1635[var2];
                        continue;
                    }
                    if (var619 == 1309) {
                        var2--;
                        int var79 = field1635[var2];
                        var2--;
                        int var80 = field1635[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method2511(var80 - 1, var79, 7641);
                        }
                        continue;
                    }
                    if (var619 == 1310) {
                        var3--;
                        var75.field5535 = field1637[var3];
                        continue;
                    }
                } else {
                    if (var619 >= 1400 && var619 < 1500 || var619 >= 2400 && var619 < 2500) {
                        class383 var81;
                        if (var619 >= 2000) {
                            var619 -= 1000;
                            var2--;
                            var81 = class290.method1869((byte) 88, field1635[var2]);
                        } else {
                            var81 = var37 ? field1638 : field1629;
                        }
                        var3--;
                        String var82 = field1637[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field1635[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field1635[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field1637[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field1635[var2]);
                            }
                        }
                        var2--;
                        int var87 = field1635[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var619 == 1400) {
                            var81.field5604 = var85;
                        } else if (var619 == 1401) {
                            var81.field5449 = var85;
                        } else if (var619 == 1402) {
                            var81.field5598 = var85;
                        } else if (var619 == 1403) {
                            var81.field5565 = var85;
                        } else if (var619 == 1404) {
                            var81.field5448 = var85;
                        } else if (var619 == 1405) {
                            var81.field5487 = var85;
                        } else if (var619 == 1406) {
                            var81.field5531 = var85;
                        } else if (var619 == 1407) {
                            var81.field5600 = var85;
                            var81.field5509 = var83;
                        } else if (var619 == 1408) {
                            var81.field5435 = var85;
                        } else if (var619 == 1409) {
                            var81.field5489 = var85;
                        } else if (var619 == 1410) {
                            var81.field5552 = var85;
                        } else if (var619 == 1411) {
                            var81.field5586 = var85;
                        } else if (var619 == 1412) {
                            var81.field5579 = var85;
                        } else if (var619 == 1414) {
                            var81.field5473 = var85;
                            var81.field5500 = var83;
                        } else if (var619 == 1415) {
                            var81.field5572 = var85;
                            var81.field5595 = var83;
                        } else if (var619 == 1416) {
                            var81.field5424 = var85;
                        } else if (var619 == 1417) {
                            var81.field5612 = var85;
                        } else if (var619 == 1418) {
                            var81.field5481 = var85;
                        } else if (var619 == 1419) {
                            var81.field5596 = var85;
                        } else if (var619 == 1420) {
                            var81.field5534 = var85;
                        } else if (var619 == 1421) {
                            var81.field5558 = var85;
                        } else if (var619 == 1422) {
                            var81.field5575 = var85;
                        } else if (var619 == 1423) {
                            var81.field5563 = var85;
                        } else if (var619 == 1424) {
                            var81.field5591 = var85;
                        } else if (var619 == 1425) {
                            var81.field5506 = var85;
                        } else if (var619 == 1426) {
                            var81.field5587 = var85;
                        } else if (var619 == 1427) {
                            var81.field5602 = var85;
                        } else if (var619 == 1428) {
                            var81.field5574 = var85;
                            var81.field5528 = var83;
                        } else if (var619 == 1429) {
                            var81.field5537 = var85;
                            var81.field5609 = var83;
                        }
                        var81.field5455 = true;
                        continue;
                    }
                    if (var619 < 1600) {
                        class383 var88 = var37 ? field1638 : field1629;
                        if (var619 == 1500) {
                            field1635[var2++] = var88.field5470;
                            continue;
                        }
                        if (var619 == 1501) {
                            field1635[var2++] = var88.field5428;
                            continue;
                        }
                        if (var619 == 1502) {
                            field1635[var2++] = var88.field5431;
                            continue;
                        }
                        if (var619 == 1503) {
                            field1635[var2++] = var88.field5491;
                            continue;
                        }
                        if (var619 == 1504) {
                            field1635[var2++] = var88.field5444 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 1505) {
                            field1635[var2++] = var88.field5538;
                            continue;
                        }
                    } else if (var619 < 1700) {
                        class383 var89 = var37 ? field1638 : field1629;
                        if (var619 == 1600) {
                            field1635[var2++] = var89.field5511;
                            continue;
                        }
                        if (var619 == 1601) {
                            field1635[var2++] = var89.field5434;
                            continue;
                        }
                        if (var619 == 1602) {
                            field1637[var3++] = var89.field5445;
                            continue;
                        }
                        if (var619 == 1603) {
                            field1635[var2++] = var89.field5433;
                            continue;
                        }
                        if (var619 == 1604) {
                            field1635[var2++] = var89.field5590;
                            continue;
                        }
                        if (var619 == 1605) {
                            field1635[var2++] = var89.field5504;
                            continue;
                        }
                        if (var619 == 1606) {
                            field1635[var2++] = var89.field5585;
                            continue;
                        }
                        if (var619 == 1607) {
                            field1635[var2++] = var89.field5479;
                            continue;
                        }
                        if (var619 == 1608) {
                            field1635[var2++] = var89.field5603;
                            continue;
                        }
                        if (var619 == 1609) {
                            field1635[var2++] = var89.field5594;
                            continue;
                        }
                        if (var619 == 1610) {
                            field1635[var2++] = var89.field5432;
                            continue;
                        }
                        if (var619 == 1611) {
                            field1635[var2++] = var89.field5588;
                            continue;
                        }
                        if (var619 == 1612) {
                            field1635[var2++] = var89.field5423;
                            continue;
                        }
                    } else if (var619 < 1800) {
                        class383 var90 = var37 ? field1638 : field1629;
                        if (var619 == 1700) {
                            field1635[var2++] = var90.field5569;
                            continue;
                        }
                        if (var619 == 1701) {
                            if (var90.field5569 == -1) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var90.field5571;
                            }
                            continue;
                        }
                        if (var619 == 1702) {
                            field1635[var2++] = var90.field5545;
                            continue;
                        }
                    } else if (var619 < 1900) {
                        class383 var91 = var37 ? field1638 : field1629;
                        if (var619 == 1800) {
                            field1635[var2++] = client.method1119(var91).method1642((byte) 28);
                            continue;
                        }
                        if (var619 == 1801) {
                            var2--;
                            int var92 = field1635[var2];
                            int var620 = var92 - 1;
                            if (var91.field5482 != null && var620 < var91.field5482.length && var91.field5482[var620] != null) {
                                field1637[var3++] = var91.field5482[var620];
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 1802) {
                            if (var91.field5583 == null) {
                                field1637[var3++] = "";
                            } else {
                                field1637[var3++] = var91.field5583;
                            }
                            continue;
                        }
                    } else if (var619 < 2600) {
                        var2--;
                        class383 var93 = class290.method1869((byte) 48, field1635[var2]);
                        if (var619 == 2500) {
                            field1635[var2++] = var93.field5470;
                            continue;
                        }
                        if (var619 == 2501) {
                            field1635[var2++] = var93.field5428;
                            continue;
                        }
                        if (var619 == 2502) {
                            field1635[var2++] = var93.field5431;
                            continue;
                        }
                        if (var619 == 2503) {
                            field1635[var2++] = var93.field5491;
                            continue;
                        }
                        if (var619 == 2504) {
                            field1635[var2++] = var93.field5444 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 2505) {
                            field1635[var2++] = var93.field5538;
                            continue;
                        }
                    } else if (var619 < 2700) {
                        var2--;
                        class383 var94 = class290.method1869((byte) 35, field1635[var2]);
                        if (var619 == 2600) {
                            field1635[var2++] = var94.field5511;
                            continue;
                        }
                        if (var619 == 2601) {
                            field1635[var2++] = var94.field5434;
                            continue;
                        }
                        if (var619 == 2602) {
                            field1637[var3++] = var94.field5445;
                            continue;
                        }
                        if (var619 == 2603) {
                            field1635[var2++] = var94.field5433;
                            continue;
                        }
                        if (var619 == 2604) {
                            field1635[var2++] = var94.field5590;
                            continue;
                        }
                        if (var619 == 2605) {
                            field1635[var2++] = var94.field5504;
                            continue;
                        }
                        if (var619 == 2606) {
                            field1635[var2++] = var94.field5585;
                            continue;
                        }
                        if (var619 == 2607) {
                            field1635[var2++] = var94.field5479;
                            continue;
                        }
                        if (var619 == 2608) {
                            field1635[var2++] = var94.field5603;
                            continue;
                        }
                        if (var619 == 2609) {
                            field1635[var2++] = var94.field5594;
                            continue;
                        }
                        if (var619 == 2610) {
                            field1635[var2++] = var94.field5432;
                            continue;
                        }
                        if (var619 == 2611) {
                            field1635[var2++] = var94.field5588;
                            continue;
                        }
                        if (var619 == 2612) {
                            field1635[var2++] = var94.field5423;
                            continue;
                        }
                    } else if (var619 < 2800) {
                        if (var619 == 2700) {
                            var2--;
                            class383 var95 = class290.method1869((byte) 74, field1635[var2]);
                            field1635[var2++] = var95.field5569;
                            continue;
                        }
                        if (var619 == 2701) {
                            var2--;
                            class383 var96 = class290.method1869((byte) 51, field1635[var2]);
                            if (var96.field5569 == -1) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var96.field5571;
                            }
                            continue;
                        }
                        if (var619 == 2702) {
                            var2--;
                            int var97 = field1635[var2];
                            class432 var98 = (class432) class271.field3700.method1412((byte) -54, (long) var97);
                            if (var98 == null) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = 1;
                            }
                            continue;
                        }
                        if (var619 == 2703) {
                            var2--;
                            class383 var99 = class290.method1869((byte) 28, field1635[var2]);
                            if (var99.field5465 == null) {
                                field1635[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field5465.length;
                            for (int var101 = 0; var101 < var99.field5465.length; var101++) {
                                if (var99.field5465[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field1635[var2++] = var100;
                            continue;
                        }
                        if (var619 == 2704 || var619 == 2705) {
                            var2 -= 2;
                            int var102 = field1635[var2];
                            int var103 = field1635[var2 + 1];
                            class432 var104 = (class432) class271.field3700.method1412((byte) -54, (long) var102);
                            if (var104 != null && var104.field6217 == var103) {
                                field1635[var2++] = 1;
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                    } else if (var619 < 2900) {
                        var2--;
                        class383 var105 = class290.method1869((byte) 7, field1635[var2]);
                        if (var619 == 2800) {
                            field1635[var2++] = client.method1119(var105).method1642((byte) 28);
                            continue;
                        }
                        if (var619 == 2801) {
                            var2--;
                            int var106 = field1635[var2];
                            int var621 = var106 - 1;
                            if (var105.field5482 != null && var621 < var105.field5482.length && var105.field5482[var621] != null) {
                                field1637[var3++] = var105.field5482[var621];
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 2802) {
                            if (var105.field5583 == null) {
                                field1637[var3++] = "";
                            } else {
                                field1637[var3++] = var105.field5583;
                            }
                            continue;
                        }
                    } else if (var619 < 3200) {
                        if (var619 == 3100) {
                            var3--;
                            String var107 = field1637[var3];
                            class141.method966((byte) 103, var107);
                            continue;
                        }
                        if (var619 == 3101) {
                            var2 -= 2;
                            class69.method474(121, class307.field4211, field1635[var2], field1635[var2 + 1]);
                            continue;
                        }
                        if (var619 == 3103) {
                            class315.method2008(0, true);
                            continue;
                        }
                        if (var619 == 3104) {
                            var3--;
                            String var108 = field1637[var3];
                            int var109 = 0;
                            if (class28.method224(-126, var108)) {
                                var109 = class160.method1062(false, var108);
                            }
                            field1632++;
                            class442.field6400.method158((byte) 7, 144);
                            class442.field6400.method2386(var109, 19324);
                            continue;
                        }
                        if (var619 == 3105) {
                            var3--;
                            String var110 = field1637[var3];
                            field1630++;
                            class442.field6400.method158((byte) 7, 126);
                            class442.field6400.method2396(var110.length() + 1, 12450);
                            class442.field6400.method2412(-90, var110);
                            continue;
                        }
                        if (var619 == 3106) {
                            var3--;
                            String var111 = field1637[var3];
                            field1620++;
                            class442.field6400.method158((byte) 7, 171);
                            class442.field6400.method2396(var111.length() + 1, 12450);
                            class442.field6400.method2412(-93, var111);
                            continue;
                        }
                        if (var619 == 3107) {
                            var2--;
                            int var112 = field1635[var2];
                            var3--;
                            String var113 = field1637[var3];
                            class307.method1954(var113, var112, 120);
                            continue;
                        }
                        if (var619 == 3108) {
                            var2 -= 3;
                            int var114 = field1635[var2];
                            int var115 = field1635[var2 + 1];
                            int var116 = field1635[var2 + 2];
                            class383 var117 = class290.method1869((byte) 8, var116);
                            class176.method1178(var117, 128, var115, var114);
                            continue;
                        }
                        if (var619 == 3109) {
                            var2 -= 2;
                            int var118 = field1635[var2];
                            int var119 = field1635[var2 + 1];
                            class383 var120 = var37 ? field1638 : field1629;
                            class176.method1178(var120, 128, var119, var118);
                            continue;
                        }
                        if (var619 == 3110) {
                            var2--;
                            int var121 = field1635[var2];
                            field1634++;
                            class442.field6400.method158((byte) 7, 211);
                            class442.field6400.method2416(22064, var121);
                            continue;
                        }
                        if (var619 == 3111) {
                            var2 -= 2;
                            int var122 = field1635[var2];
                            int var123 = field1635[var2 + 1];
                            class432 var124 = (class432) class271.field3700.method1412((byte) -54, (long) var122);
                            if (var124 != null) {
                                class54.method371(var124, true, var124.field6217 != var123, 0);
                            }
                            class383.method2508(var122, var123, 16383, true, 3);
                            continue;
                        }
                        if (var619 == 3112) {
                            var2--;
                            int var125 = field1635[var2];
                            class432 var126 = (class432) class271.field3700.method1412((byte) -54, (long) var125);
                            if (var126 != null && var126.field6219 == 3) {
                                class54.method371(var126, true, true, 0);
                            }
                            continue;
                        }
                    } else if (var619 < 3300) {
                        if (var619 == 3200) {
                            var2 -= 3;
                            class53.method358(255, field1635[var2], (byte) 43, field1635[var2 + 1], field1635[var2 + 2]);
                            continue;
                        }
                        if (var619 == 3201) {
                            var2--;
                            class9.method61(field1635[var2], (byte) -114, 255);
                            continue;
                        }
                        if (var619 == 3202) {
                            var2 -= 2;
                            class347.method2224(field1635[var2 + 1], 255, field1635[var2], 121);
                            continue;
                        }
                    } else if (var619 < 3400) {
                        if (var619 == 3300) {
                            field1635[var2++] = class35.field541;
                            continue;
                        }
                        if (var619 == 3301) {
                            var2 -= 2;
                            int var127 = field1635[var2];
                            int var128 = field1635[var2 + 1];
                            field1635[var2++] = class408.method2621(var127, var128, 97);
                            continue;
                        }
                        if (var619 == 3302) {
                            var2 -= 2;
                            int var129 = field1635[var2];
                            int var130 = field1635[var2 + 1];
                            field1635[var2++] = class344.method2203(var129, 2836, var130);
                            continue;
                        }
                        if (var619 == 3303) {
                            var2 -= 2;
                            int var131 = field1635[var2];
                            int var132 = field1635[var2 + 1];
                            field1635[var2++] = class407.method2612(54, var131, var132);
                            continue;
                        }
                        if (var619 == 3304) {
                            var2--;
                            int var133 = field1635[var2];
                            field1635[var2++] = class434.method2723(true, var133).field5076;
                            continue;
                        }
                        if (var619 == 3305) {
                            var2--;
                            int var134 = field1635[var2];
                            field1635[var2++] = class407.field5919[var134];
                            continue;
                        }
                        if (var619 == 3306) {
                            var2--;
                            int var135 = field1635[var2];
                            field1635[var2++] = class149.field2147[var135];
                            continue;
                        }
                        if (var619 == 3307) {
                            var2--;
                            int var136 = field1635[var2];
                            field1635[var2++] = class398.field5800[var136];
                            continue;
                        }
                        if (var619 == 3308) {
                            int var137 = class265.field3617;
                            int var138 = (class307.field4211.field6197 >> 7) + class449.field6509;
                            int var139 = (class307.field4211.field6192 >> 7) + class354.field4981;
                            field1635[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var619 == 3309) {
                            var2--;
                            int var140 = field1635[var2];
                            field1635[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var619 == 3310) {
                            var2--;
                            int var141 = field1635[var2];
                            field1635[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var619 == 3311) {
                            var2--;
                            int var142 = field1635[var2];
                            field1635[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var619 == 3312) {
                            field1635[var2++] = class293.field4055 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3313) {
                            var2 -= 2;
                            int var143 = field1635[var2] + 32768;
                            int var144 = field1635[var2 + 1];
                            field1635[var2++] = class408.method2621(var143, var144, 97);
                            continue;
                        }
                        if (var619 == 3314) {
                            var2 -= 2;
                            int var145 = field1635[var2] + 32768;
                            int var146 = field1635[var2 + 1];
                            field1635[var2++] = class344.method2203(var145, 2836, var146);
                            continue;
                        }
                        if (var619 == 3315) {
                            var2 -= 2;
                            int var147 = field1635[var2] + 32768;
                            int var148 = field1635[var2 + 1];
                            field1635[var2++] = class407.method2612(-126, var147, var148);
                            continue;
                        }
                        if (var619 == 3316) {
                            if (class204.field2771 >= 2) {
                                field1635[var2++] = class204.field2771;
                            } else {
                                field1635[var2++] = 0;
                            }
                            continue;
                        }
                        if (var619 == 3317) {
                            field1635[var2++] = class326.field4452;
                            continue;
                        }
                        if (var619 == 3318) {
                            field1635[var2++] = class393.field5755;
                            continue;
                        }
                        if (var619 == 3321) {
                            field1635[var2++] = class44.field675;
                            continue;
                        }
                        if (var619 == 3322) {
                            field1635[var2++] = class8.field126;
                            continue;
                        }
                        if (var619 == 3323) {
                            if (class46.field718 >= 5 && class46.field718 <= 9) {
                                field1635[var2++] = 1;
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 3324) {
                            if (class46.field718 >= 5 && class46.field718 <= 9) {
                                field1635[var2++] = class46.field718;
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 3325) {
                            field1635[var2++] = class266.field3633 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3326) {
                            field1635[var2++] = class307.field4211.field5000;
                            continue;
                        }
                        if (var619 == 3327) {
                            field1635[var2++] = class307.field4211.field4965.field5981 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3328) {
                            field1635[var2++] = class396.field5786 && !class192.field2665 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3329) {
                            field1635[var2++] = class190.field2645 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3330) {
                            var2--;
                            int var149 = field1635[var2];
                            field1635[var2++] = class142.method972(var149, (byte) -123);
                            continue;
                        }
                        if (var619 == 3331) {
                            var2 -= 2;
                            int var150 = field1635[var2];
                            int var151 = field1635[var2 + 1];
                            field1635[var2++] = class282.method1828(var150, 0, false, var151);
                            continue;
                        }
                        if (var619 == 3332) {
                            var2 -= 2;
                            int var152 = field1635[var2];
                            int var153 = field1635[var2 + 1];
                            field1635[var2++] = class282.method1828(var152, 0, true, var153);
                            continue;
                        }
                        if (var619 == 3333) {
                            field1635[var2++] = class401.field5853;
                            continue;
                        }
                        if (var619 == 3335) {
                            field1635[var2++] = class40.field608;
                            continue;
                        }
                        if (var619 == 3336) {
                            var2 -= 4;
                            int var154 = field1635[var2];
                            int var155 = field1635[var2 + 1];
                            int var156 = field1635[var2 + 2];
                            int var157 = field1635[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field1635[var2++] = var160;
                            continue;
                        }
                        if (var619 == 3337) {
                            field1635[var2++] = class237.field3231;
                            continue;
                        }
                        if (var619 == 3338) {
                            field1635[var2++] = class124.method828(-97);
                            continue;
                        }
                    } else if (var619 < 3500) {
                        if (var619 == 3400) {
                            var2 -= 2;
                            int var161 = field1635[var2];
                            int var162 = field1635[var2 + 1];
                            class315 var163 = class46.method322(var161, (byte) 108);
                            field1637[var3++] = var163.method2001(var162, true);
                            continue;
                        }
                        if (var619 == 3408) {
                            var2 -= 4;
                            int var164 = field1635[var2];
                            int var165 = field1635[var2 + 1];
                            int var166 = field1635[var2 + 2];
                            int var167 = field1635[var2 + 3];
                            class315 var168 = class46.method322(var166, (byte) 73);
                            if (var168.field4337 == var164 && var168.field4349 == var165) {
                                if (var165 == 115) {
                                    field1637[var3++] = var168.method2001(var167, true);
                                } else {
                                    field1635[var2++] = var168.method2007(var167, 220);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var619 == 3409) {
                            var2 -= 3;
                            int var169 = field1635[var2];
                            int var170 = field1635[var2 + 1];
                            int var171 = field1635[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class315 var172 = class46.method322(var170, (byte) 107);
                            if (var172.field4349 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field1635[var2++] = var172.method2006((byte) 122, var171) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3410) {
                            var2--;
                            int var173 = field1635[var2];
                            var3--;
                            String var174 = field1637[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class315 var175 = class46.method322(var173, (byte) 18);
                            if (var175.field4349 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field1635[var2++] = var175.method2009(var174, -1) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3411) {
                            var2--;
                            int var176 = field1635[var2];
                            class315 var177 = class46.method322(var176, (byte) 103);
                            field1635[var2++] = var177.field4347.method1417(110);
                            continue;
                        }
                    } else if (var619 < 3700) {
                        if (var619 == 3600) {
                            if (class257.field3508 == 0) {
                                field1635[var2++] = -2;
                            } else if (class257.field3508 == 1) {
                                field1635[var2++] = -1;
                            } else {
                                field1635[var2++] = class97.field1482;
                            }
                            continue;
                        }
                        if (var619 == 3601) {
                            var2--;
                            int var178 = field1635[var2];
                            if (class257.field3508 == 2 && var178 < class97.field1482) {
                                field1637[var3++] = class40.field609[var178];
                                if (class365.field5117[var178] == null) {
                                    field1637[var3++] = "";
                                } else {
                                    field1637[var3++] = class365.field5117[var178];
                                }
                                continue;
                            }
                            field1637[var3++] = "";
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 3602) {
                            var2--;
                            int var179 = field1635[var2];
                            if (class257.field3508 == 2 && var179 < class97.field1482) {
                                field1635[var2++] = class344.field4810[var179];
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 3603) {
                            var2--;
                            int var180 = field1635[var2];
                            if (class257.field3508 == 2 && var180 < class97.field1482) {
                                field1635[var2++] = class57.field821[var180];
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 3604) {
                            var3--;
                            String var181 = field1637[var3];
                            var2--;
                            int var182 = field1635[var2];
                            class231.method1450(0, var182, var181);
                            continue;
                        }
                        if (var619 == 3605) {
                            var3--;
                            String var183 = field1637[var3];
                            class89.method615(var183, (byte) -58);
                            continue;
                        }
                        if (var619 == 3606) {
                            var3--;
                            String var184 = field1637[var3];
                            class204.method1337(1, var184);
                            continue;
                        }
                        if (var619 == 3607) {
                            var3--;
                            String var185 = field1637[var3];
                            class194.method1289((byte) 118, var185, false);
                            continue;
                        }
                        if (var619 == 3608) {
                            var3--;
                            String var186 = field1637[var3];
                            class398.method2574(var186, -1);
                            continue;
                        }
                        if (var619 == 3609) {
                            var3--;
                            String var187 = field1637[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field1635[var2++] = class164.method1088(var187, 31048) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3610) {
                            var2--;
                            int var188 = field1635[var2];
                            if (class257.field3508 == 2 && var188 < class97.field1482) {
                                field1637[var3++] = class2.field17[var188];
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 3611) {
                            if (class62.field971 == null) {
                                field1637[var3++] = "";
                            } else {
                                field1637[var3++] = class25.method202(125, class62.field971);
                            }
                            continue;
                        }
                        if (var619 == 3612) {
                            if (class62.field971 == null) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = class381.field5402;
                            }
                            continue;
                        }
                        if (var619 == 3613) {
                            var2--;
                            int var189 = field1635[var2];
                            if (class62.field971 != null && var189 < class381.field5402) {
                                field1637[var3++] = class270.field3680[var189].field4465;
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 3614) {
                            var2--;
                            int var190 = field1635[var2];
                            if (class62.field971 != null && var190 < class381.field5402) {
                                field1635[var2++] = class270.field3680[var190].field4468;
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 3615) {
                            var2--;
                            int var191 = field1635[var2];
                            if (class62.field971 != null && var191 < class381.field5402) {
                                field1635[var2++] = class270.field3680[var191].field4466;
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 3616) {
                            field1635[var2++] = class354.field4995;
                            continue;
                        }
                        if (var619 == 3617) {
                            var3--;
                            String var192 = field1637[var3];
                            class401.method2588(4830, var192);
                            continue;
                        }
                        if (var619 == 3618) {
                            field1635[var2++] = class236.field3217;
                            continue;
                        }
                        if (var619 == 3619) {
                            var3--;
                            String var193 = field1637[var3];
                            class393.method2555(var193, 25);
                            continue;
                        }
                        if (var619 == 3620) {
                            class123.method824(-18391);
                            continue;
                        }
                        if (var619 == 3621) {
                            if (class257.field3508 == 0) {
                                field1635[var2++] = -1;
                            } else {
                                field1635[var2++] = class157.field2221;
                            }
                            continue;
                        }
                        if (var619 == 3622) {
                            var2--;
                            int var194 = field1635[var2];
                            if (class257.field3508 != 0 && var194 < class157.field2221) {
                                field1637[var3++] = class259.field3549[var194];
                                if (class20.field258[var194] == null) {
                                    field1637[var3++] = "";
                                } else {
                                    field1637[var3++] = class20.field258[var194];
                                }
                                continue;
                            }
                            field1637[var3++] = "";
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 3623) {
                            var3--;
                            String var195 = field1637[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field1635[var2++] = class364.method2339(var195, (byte) -51) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3624) {
                            var2--;
                            int var196 = field1635[var2];
                            if (class270.field3680 != null && var196 < class381.field5402 && class270.field3680[var196].field4464.equalsIgnoreCase(class307.field4211.field4994)) {
                                field1635[var2++] = 1;
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 3625) {
                            if (class142.field2024 == null) {
                                field1637[var3++] = "";
                            } else {
                                field1637[var3++] = class142.field2024;
                            }
                            continue;
                        }
                        if (var619 == 3626) {
                            var2--;
                            int var197 = field1635[var2];
                            if (class62.field971 != null && var197 < class381.field5402) {
                                field1637[var3++] = class270.field3680[var197].field4462;
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 3627) {
                            var2--;
                            int var198 = field1635[var2];
                            if (class257.field3508 == 2 && var198 >= 0 && var198 < class97.field1482) {
                                field1635[var2++] = class407.field5917[var198] ? 1 : 0;
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 3628) {
                            var3--;
                            String var199 = field1637[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field1635[var2++] = class163.method1080(var199, (byte) -67);
                            continue;
                        }
                        if (var619 == 3629) {
                            field1635[var2++] = class406.field5913;
                            continue;
                        }
                        if (var619 == 3630) {
                            var3--;
                            String var200 = field1637[var3];
                            class194.method1289((byte) 116, var200, true);
                            continue;
                        }
                        if (var619 == 3631) {
                            var2--;
                            int var201 = field1635[var2];
                            field1635[var2++] = class290.field4004[var201] ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3632) {
                            var2--;
                            int var202 = field1635[var2];
                            if (class62.field971 != null && var202 < class381.field5402) {
                                field1637[var3++] = class270.field3680[var202].field4464;
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 3633) {
                            var2--;
                            int var203 = field1635[var2];
                            if (class257.field3508 != 0 && var203 < class157.field2221) {
                                field1637[var3++] = class32.field501[var203];
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                    } else if (var619 < 4000) {
                        if (var619 == 3903) {
                            var2--;
                            int var204 = field1635[var2];
                            field1635[var2++] = class24.field338[var204].method93((byte) -64);
                            continue;
                        }
                        if (var619 == 3904) {
                            var2--;
                            int var205 = field1635[var2];
                            field1635[var2++] = class24.field338[var205].field194;
                            continue;
                        }
                        if (var619 == 3905) {
                            var2--;
                            int var206 = field1635[var2];
                            field1635[var2++] = class24.field338[var206].field193;
                            continue;
                        }
                        if (var619 == 3906) {
                            var2--;
                            int var207 = field1635[var2];
                            field1635[var2++] = class24.field338[var207].field191;
                            continue;
                        }
                        if (var619 == 3907) {
                            var2--;
                            int var208 = field1635[var2];
                            field1635[var2++] = class24.field338[var208].field204;
                            continue;
                        }
                        if (var619 == 3908) {
                            var2--;
                            int var209 = field1635[var2];
                            field1635[var2++] = class24.field338[var209].field201;
                            continue;
                        }
                        if (var619 == 3910) {
                            var2--;
                            int var210 = field1635[var2];
                            int var211 = class24.field338[var210].method92(45);
                            field1635[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3911) {
                            var2--;
                            int var212 = field1635[var2];
                            int var213 = class24.field338[var212].method92(69);
                            field1635[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3912) {
                            var2--;
                            int var214 = field1635[var2];
                            int var215 = class24.field338[var214].method92(101);
                            field1635[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 3913) {
                            var2--;
                            int var216 = field1635[var2];
                            int var217 = class24.field338[var216].method92(101);
                            field1635[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var619 < 4100) {
                        if (var619 == 4000) {
                            var2 -= 2;
                            int var218 = field1635[var2];
                            int var219 = field1635[var2 + 1];
                            field1635[var2++] = var218 + var219;
                            continue;
                        }
                        if (var619 == 4001) {
                            var2 -= 2;
                            int var220 = field1635[var2];
                            int var221 = field1635[var2 + 1];
                            field1635[var2++] = var220 - var221;
                            continue;
                        }
                        if (var619 == 4002) {
                            var2 -= 2;
                            int var222 = field1635[var2];
                            int var223 = field1635[var2 + 1];
                            field1635[var2++] = var222 * var223;
                            continue;
                        }
                        if (var619 == 4003) {
                            var2 -= 2;
                            int var224 = field1635[var2];
                            int var225 = field1635[var2 + 1];
                            field1635[var2++] = var224 / var225;
                            continue;
                        }
                        if (var619 == 4004) {
                            var2--;
                            int var226 = field1635[var2];
                            field1635[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var619 == 4005) {
                            var2--;
                            int var227 = field1635[var2];
                            field1635[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var619 == 4006) {
                            var2 -= 5;
                            int var228 = field1635[var2];
                            int var229 = field1635[var2 + 1];
                            int var230 = field1635[var2 + 2];
                            int var231 = field1635[var2 + 3];
                            int var232 = field1635[var2 + 4];
                            field1635[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var619 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field1635[var2];
                            long var235 = (long) field1635[var2 + 1];
                            field1635[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var619 == 4008) {
                            var2 -= 2;
                            int var237 = field1635[var2];
                            int var238 = field1635[var2 + 1];
                            field1635[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var619 == 4009) {
                            var2 -= 2;
                            int var239 = field1635[var2];
                            int var240 = field1635[var2 + 1];
                            field1635[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var619 == 4010) {
                            var2 -= 2;
                            int var241 = field1635[var2];
                            int var242 = field1635[var2 + 1];
                            field1635[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var619 == 4011) {
                            var2 -= 2;
                            int var243 = field1635[var2];
                            int var244 = field1635[var2 + 1];
                            field1635[var2++] = var243 % var244;
                            continue;
                        }
                        if (var619 == 4012) {
                            var2 -= 2;
                            int var245 = field1635[var2];
                            int var246 = field1635[var2 + 1];
                            if (var245 == 0) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var619 == 4013) {
                            var2 -= 2;
                            int var247 = field1635[var2];
                            int var248 = field1635[var2 + 1];
                            if (var247 == 0) {
                                field1635[var2++] = 0;
                            } else if (var248 == 0) {
                                field1635[var2++] = Integer.MAX_VALUE;
                            } else {
                                field1635[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var619 == 4014) {
                            var2 -= 2;
                            int var249 = field1635[var2];
                            int var250 = field1635[var2 + 1];
                            field1635[var2++] = var249 & var250;
                            continue;
                        }
                        if (var619 == 4015) {
                            var2 -= 2;
                            int var251 = field1635[var2];
                            int var252 = field1635[var2 + 1];
                            field1635[var2++] = var251 | var252;
                            continue;
                        }
                        if (var619 == 4016) {
                            var2 -= 2;
                            int var253 = field1635[var2];
                            int var254 = field1635[var2 + 1];
                            field1635[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var619 == 4017) {
                            var2 -= 2;
                            int var255 = field1635[var2];
                            int var256 = field1635[var2 + 1];
                            field1635[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var619 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field1635[var2];
                            long var259 = (long) field1635[var2 + 1];
                            long var261 = (long) field1635[var2 + 2];
                            field1635[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var619 < 4200) {
                        if (var619 == 4100) {
                            var3--;
                            String var263 = field1637[var3];
                            var2--;
                            int var264 = field1635[var2];
                            field1637[var3++] = var263 + var264;
                            continue;
                        }
                        if (var619 == 4101) {
                            var3 -= 2;
                            String var265 = field1637[var3];
                            String var266 = field1637[var3 + 1];
                            field1637[var3++] = var265 + var266;
                            continue;
                        }
                        if (var619 == 4102) {
                            var3--;
                            String var267 = field1637[var3];
                            var2--;
                            int var268 = field1635[var2];
                            field1637[var3++] = var267 + class312.method1976(true, var268, -17389);
                            continue;
                        }
                        if (var619 == 4103) {
                            var3--;
                            String var269 = field1637[var3];
                            field1637[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var619 == 4104) {
                            var2--;
                            int var270 = field1635[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field1627.setTime(new Date(var271));
                            int var273 = field1627.get(5);
                            int var274 = field1627.get(2);
                            int var275 = field1627.get(1);
                            field1637[var3++] = var273 + "-" + field1641[var274] + "-" + var275;
                            continue;
                        }
                        if (var619 == 4105) {
                            var3 -= 2;
                            String var276 = field1637[var3];
                            String var277 = field1637[var3 + 1];
                            if (class307.field4211.field4965 != null && class307.field4211.field4965.field5981) {
                                field1637[var3++] = var277;
                                continue;
                            }
                            field1637[var3++] = var276;
                            continue;
                        }
                        if (var619 == 4106) {
                            var2--;
                            int var278 = field1635[var2];
                            field1637[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var619 == 4107) {
                            var3 -= 2;
                            field1635[var2++] = class401.method2590(class40.field608, (byte) -84, field1637[var3 + 1], field1637[var3]);
                            continue;
                        }
                        if (var619 == 4108) {
                            var3--;
                            String var279 = field1637[var3];
                            var2 -= 2;
                            int var280 = field1635[var2];
                            int var281 = field1635[var2 + 1];
                            class65 var282 = class349.method2234(class435.field6251, var281, true, 0);
                            field1635[var2++] = var282.method443(class140.field1992, false, var280, var279);
                            continue;
                        }
                        if (var619 == 4109) {
                            var3--;
                            String var283 = field1637[var3];
                            var2 -= 2;
                            int var284 = field1635[var2];
                            int var285 = field1635[var2 + 1];
                            class65 var286 = class349.method2234(class435.field6251, var285, true, 0);
                            field1635[var2++] = var286.method441(class140.field1992, var284, var283, (byte) -45);
                            continue;
                        }
                        if (var619 == 4110) {
                            var3 -= 2;
                            String var287 = field1637[var3];
                            String var288 = field1637[var3 + 1];
                            var2--;
                            if (field1635[var2] == 1) {
                                field1637[var3++] = var287;
                            } else {
                                field1637[var3++] = var288;
                            }
                            continue;
                        }
                        if (var619 == 4111) {
                            var3--;
                            String var289 = field1637[var3];
                            field1637[var3++] = class378.method2472(var289, (byte) 106);
                            continue;
                        }
                        if (var619 == 4112) {
                            var3--;
                            String var290 = field1637[var3];
                            var2--;
                            int var291 = field1635[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field1637[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var619 == 4113) {
                            var2--;
                            int var292 = field1635[var2];
                            field1635[var2++] = class1.method3(false, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 4114) {
                            var2--;
                            int var293 = field1635[var2];
                            field1635[var2++] = class141.method963((char) var293, false) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 4115) {
                            var2--;
                            int var294 = field1635[var2];
                            field1635[var2++] = class287.method1858((char) var294, (byte) 107) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 4116) {
                            var2--;
                            int var295 = field1635[var2];
                            field1635[var2++] = class258.method1589((char) var295, -58) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 4117) {
                            var3--;
                            String var296 = field1637[var3];
                            if (var296 == null) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var619 == 4118) {
                            var3--;
                            String var297 = field1637[var3];
                            var2 -= 2;
                            int var298 = field1635[var2];
                            int var299 = field1635[var2 + 1];
                            field1637[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var619 == 4119) {
                            var3--;
                            String var300 = field1637[var3];
                            StringBuffer var301 = new StringBuffer(var300.length());
                            boolean var302 = false;
                            for (int var303 = 0; var303 < var300.length(); var303++) {
                                char var304 = var300.charAt(var303);
                                if (var304 == '<') {
                                    var302 = true;
                                } else if (var304 == '>') {
                                    var302 = false;
                                } else if (!var302) {
                                    var301.append(var304);
                                }
                            }
                            field1637[var3++] = var301.toString();
                            continue;
                        }
                        if (var619 == 4120) {
                            var3--;
                            String var305 = field1637[var3];
                            var2 -= 2;
                            int var306 = field1635[var2];
                            int var307 = field1635[var2 + 1];
                            field1635[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var619 == 4121) {
                            var3 -= 2;
                            String var308 = field1637[var3];
                            String var309 = field1637[var3 + 1];
                            var2--;
                            int var310 = field1635[var2];
                            field1635[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var619 == 4122) {
                            var2--;
                            int var311 = field1635[var2];
                            field1635[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var619 == 4123) {
                            var2--;
                            int var312 = field1635[var2];
                            field1635[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var619 == 4124) {
                            var2--;
                            boolean var313 = field1635[var2] != 0;
                            var2--;
                            int var314 = field1635[var2];
                            field1637[var3++] = class188.method1233(-11142, var313, (long) var314, 0, class40.field608);
                            continue;
                        }
                        if (var619 == 4125) {
                            var3--;
                            String var315 = field1637[var3];
                            var2--;
                            int var316 = field1635[var2];
                            class65 var317 = class349.method2234(class435.field6251, var316, true, 0);
                            field1635[var2++] = var317.method439(class140.field1992, var315, 8364);
                            continue;
                        }
                    } else if (var619 < 4300) {
                        if (var619 == 4200) {
                            var2--;
                            int var318 = field1635[var2];
                            field1637[var3++] = class347.method2222(var318, 18682).field5722;
                            continue;
                        }
                        if (var619 == 4201) {
                            var2 -= 2;
                            int var319 = field1635[var2];
                            int var320 = field1635[var2 + 1];
                            class389 var321 = class347.method2222(var319, 18682);
                            if (var320 >= 1 && var320 <= 5 && var321.field5720[var320 - 1] != null) {
                                field1637[var3++] = var321.field5720[var320 - 1];
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 4202) {
                            var2 -= 2;
                            int var322 = field1635[var2];
                            int var323 = field1635[var2 + 1];
                            class389 var324 = class347.method2222(var322, 18682);
                            if (var323 >= 1 && var323 <= 5 && var324.field5710[var323 - 1] != null) {
                                field1637[var3++] = var324.field5710[var323 - 1];
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 4203) {
                            var2--;
                            int var325 = field1635[var2];
                            field1635[var2++] = class347.method2222(var325, 18682).field5677;
                            continue;
                        }
                        if (var619 == 4204) {
                            var2--;
                            int var326 = field1635[var2];
                            field1635[var2++] = class347.method2222(var326, 18682).field5680 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 4205) {
                            var2--;
                            int var327 = field1635[var2];
                            class389 var328 = class347.method2222(var327, 18682);
                            if (var328.field5711 == -1 && var328.field5717 >= 0) {
                                field1635[var2++] = var328.field5717;
                                continue;
                            }
                            field1635[var2++] = var327;
                            continue;
                        }
                        if (var619 == 4206) {
                            var2--;
                            int var329 = field1635[var2];
                            class389 var330 = class347.method2222(var329, 18682);
                            if (var330.field5711 >= 0 && var330.field5717 >= 0) {
                                field1635[var2++] = var330.field5717;
                                continue;
                            }
                            field1635[var2++] = var329;
                            continue;
                        }
                        if (var619 == 4207) {
                            var2--;
                            int var331 = field1635[var2];
                            field1635[var2++] = class347.method2222(var331, 18682).field5662 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 4208) {
                            var2 -= 2;
                            int var332 = field1635[var2];
                            int var333 = field1635[var2 + 1];
                            class305 var334 = class313.method1983(-112, var333);
                            if (var334.method1944(-29253)) {
                                field1637[var3++] = class347.method2222(var332, 18682).method2542((byte) 113, var333, var334.field4193);
                            } else {
                                field1635[var2++] = class347.method2222(var332, 18682).method2544(28633, var333, var334.field4191);
                            }
                            continue;
                        }
                        if (var619 == 4209) {
                            var2 -= 2;
                            int var335 = field1635[var2];
                            int var336 = field1635[var2 + 1] - 1;
                            class389 var337 = class347.method2222(var335, 18682);
                            if (var337.field5666 == var336) {
                                field1635[var2++] = var337.field5715;
                            } else if (var337.field5713 == var336) {
                                field1635[var2++] = var337.field5674;
                            } else {
                                field1635[var2++] = -1;
                            }
                            continue;
                        }
                        if (var619 == 4210) {
                            var3--;
                            String var338 = field1637[var3];
                            var2--;
                            int var339 = field1635[var2];
                            class126.method841(-1, var338, var339 == 1);
                            field1635[var2++] = class222.field2981;
                            continue;
                        }
                        if (var619 == 4211) {
                            if (class434.field6239 != null && class298.field4125 < class222.field2981) {
                                field1635[var2++] = class434.field6239[class298.field4125++] & 0xFFFF;
                                continue;
                            }
                            field1635[var2++] = -1;
                            continue;
                        }
                        if (var619 == 4212) {
                            class298.field4125 = 0;
                            continue;
                        }
                    } else if (var619 < 4400) {
                        if (var619 == 4300) {
                            var2 -= 2;
                            int var340 = field1635[var2];
                            int var341 = field1635[var2 + 1];
                            class305 var342 = class313.method1983(-117, var341);
                            if (var342.method1944(-29253)) {
                                field1637[var3++] = class393.method2556(var340, 4).method1398(var342.field4193, -1, var341);
                            } else {
                                field1635[var2++] = class393.method2556(var340, 4).method1403(true, var341, var342.field4191);
                            }
                            continue;
                        }
                    } else if (var619 < 4500) {
                        if (var619 == 4400) {
                            var2 -= 2;
                            int var343 = field1635[var2];
                            int var344 = field1635[var2 + 1];
                            class305 var345 = class313.method1983(-118, var344);
                            if (var345.method1944(-29253)) {
                                field1637[var3++] = class310.method1961(var343, (byte) 35).method2371(var344, var345.field4193, 123);
                            } else {
                                field1635[var2++] = class310.method1961(var343, (byte) 35).method2364(var344, var345.field4191, true);
                            }
                            continue;
                        }
                    } else if (var619 < 4600) {
                        if (var619 == 4500) {
                            var2 -= 2;
                            int var346 = field1635[var2];
                            int var347 = field1635[var2 + 1];
                            class305 var348 = class313.method1983(-115, var347);
                            if (var348.method1944(-29253)) {
                                field1637[var3++] = class68.method467(24, var346).method2177(var348.field4193, var347, true);
                            } else {
                                field1635[var2++] = class68.method467(24, var346).method2175(var347, var348.field4191, (byte) -86);
                            }
                            continue;
                        }
                    } else if (var619 < 4700) {
                        if (var619 == 4600) {
                            var2--;
                            int var349 = field1635[var2];
                            class312 var350 = class310.method1964((byte) 119, var349);
                            if (var350.field4273 != null && var350.field4273.length > 0) {
                                int var351 = 0;
                                int var352 = var350.field4275[0];
                                for (int var353 = 1; var353 < var350.field4273.length; var353++) {
                                    if (var350.field4275[var353] > var352) {
                                        var351 = var353;
                                        var352 = var350.field4275[var353];
                                    }
                                }
                                field1635[var2++] = var350.field4273[var351];
                                continue;
                            }
                            field1635[var2++] = var350.field4293;
                            continue;
                        }
                    } else if (var619 < 5100) {
                        if (var619 == 5000) {
                            field1635[var2++] = class34.field536;
                            continue;
                        }
                        if (var619 == 5001) {
                            var2 -= 3;
                            class34.field536 = field1635[var2];
                            class15.field184 = field1635[var2 + 1];
                            class419.field6056 = field1635[var2 + 2];
                            field1628++;
                            class442.field6400.method158((byte) 7, 85);
                            class442.field6400.method2396(class34.field536, 12450);
                            class442.field6400.method2396(class15.field184, 12450);
                            class442.field6400.method2396(class419.field6056, 12450);
                            continue;
                        }
                        if (var619 == 5002) {
                            var3--;
                            String var354 = field1637[var3];
                            var2 -= 2;
                            int var355 = field1635[var2];
                            int var356 = field1635[var2 + 1];
                            field1636++;
                            class442.field6400.method158((byte) 7, 148);
                            class442.field6400.method2396(class322.method2036(var354, -128) + 2, 12450);
                            class442.field6400.method2412(-68, var354);
                            class442.field6400.method2396(var355 - 1, 12450);
                            class442.field6400.method2396(var356, 12450);
                            continue;
                        }
                        if (var619 == 5003) {
                            var2--;
                            int var357 = field1635[var2];
                            String var358 = null;
                            if (var357 < 100) {
                                var358 = class353.field4952[var357];
                            }
                            if (var358 == null) {
                                var358 = "";
                            }
                            field1637[var3++] = var358;
                            continue;
                        }
                        if (var619 == 5004) {
                            var2--;
                            int var359 = field1635[var2];
                            int var360 = -1;
                            if (var359 < 100 && class353.field4952[var359] != null) {
                                var360 = class386.field5627[var359];
                            }
                            field1635[var2++] = var360;
                            continue;
                        }
                        if (var619 == 5005) {
                            field1635[var2++] = class15.field184;
                            continue;
                        }
                        if (var619 == 5008) {
                            var3--;
                            String var361 = field1637[var3];
                            if (class204.field2771 == 0 && (class396.field5786 && !class192.field2665 || class190.field2645)) {
                                continue;
                            }
                            String var362 = var361.toLowerCase();
                            byte var363 = 0;
                            if (var362.startsWith(client.field2346)) {
                                var363 = 0;
                                var361 = var361.substring(client.field2346.length());
                            } else if (var362.startsWith(class424.field6096)) {
                                var363 = 1;
                                var361 = var361.substring(class424.field6096.length());
                            } else if (var362.startsWith(class247.field3417)) {
                                var363 = 2;
                                var361 = var361.substring(class247.field3417.length());
                            } else if (var362.startsWith(class336.field4538)) {
                                var363 = 3;
                                var361 = var361.substring(class336.field4538.length());
                            } else if (var362.startsWith(class213.field2844)) {
                                var363 = 4;
                                var361 = var361.substring(class213.field2844.length());
                            } else if (var362.startsWith(class298.field4132)) {
                                var363 = 5;
                                var361 = var361.substring(class298.field4132.length());
                            } else if (var362.startsWith(class162.field2278)) {
                                var363 = 6;
                                var361 = var361.substring(class162.field2278.length());
                            } else if (var362.startsWith(class3.field41)) {
                                var363 = 7;
                                var361 = var361.substring(class3.field41.length());
                            } else if (var362.startsWith(class339.field4739)) {
                                var363 = 8;
                                var361 = var361.substring(class339.field4739.length());
                            } else if (var362.startsWith(class118.field1692)) {
                                var363 = 9;
                                var361 = var361.substring(class118.field1692.length());
                            } else if (var362.startsWith(class450.field6559)) {
                                var363 = 10;
                                var361 = var361.substring(class450.field6559.length());
                            } else if (var362.startsWith(class30.field471)) {
                                var363 = 11;
                                var361 = var361.substring(class30.field471.length());
                            } else if (class40.field608 != 0) {
                                if (var362.startsWith(class252.field3472)) {
                                    var363 = 0;
                                    var361 = var361.substring(class252.field3472.length());
                                } else if (var362.startsWith(class64.field998)) {
                                    var363 = 1;
                                    var361 = var361.substring(class64.field998.length());
                                } else if (var362.startsWith(class366.field5125)) {
                                    var363 = 2;
                                    var361 = var361.substring(class366.field5125.length());
                                } else if (var362.startsWith(class390.field5739)) {
                                    var363 = 3;
                                    var361 = var361.substring(class390.field5739.length());
                                } else if (var362.startsWith(class258.field3532)) {
                                    var363 = 4;
                                    var361 = var361.substring(class258.field3532.length());
                                } else if (var362.startsWith(class54.field800)) {
                                    var363 = 5;
                                    var361 = var361.substring(class54.field800.length());
                                } else if (var362.startsWith(class107.field1585)) {
                                    var363 = 6;
                                    var361 = var361.substring(class107.field1585.length());
                                } else if (var362.startsWith(class401.field5852)) {
                                    var363 = 7;
                                    var361 = var361.substring(class401.field5852.length());
                                } else if (var362.startsWith(class60.field850)) {
                                    var363 = 8;
                                    var361 = var361.substring(class60.field850.length());
                                } else if (var362.startsWith(class435.field6249)) {
                                    var363 = 9;
                                    var361 = var361.substring(class435.field6249.length());
                                } else if (var362.startsWith(class84.field1294)) {
                                    var363 = 10;
                                    var361 = var361.substring(class84.field1294.length());
                                } else if (var362.startsWith(class276.field3742)) {
                                    var363 = 11;
                                    var361 = var361.substring(class276.field3742.length());
                                }
                            }
                            String var364 = var361.toLowerCase();
                            byte var365 = 0;
                            if (var364.startsWith(class124.field1737)) {
                                var365 = 1;
                                var361 = var361.substring(class124.field1737.length());
                            } else if (var364.startsWith(class15.field176)) {
                                var365 = 2;
                                var361 = var361.substring(class15.field176.length());
                            } else if (var364.startsWith(class182.field2555)) {
                                var365 = 3;
                                var361 = var361.substring(class182.field2555.length());
                            } else if (var364.startsWith(class165.field2356)) {
                                var365 = 4;
                                var361 = var361.substring(class165.field2356.length());
                            } else if (var364.startsWith(class321.field4398)) {
                                var365 = 5;
                                var361 = var361.substring(class321.field4398.length());
                            } else if (class40.field608 != 0) {
                                if (var364.startsWith(class45.field680)) {
                                    var365 = 1;
                                    var361 = var361.substring(class45.field680.length());
                                } else if (var364.startsWith(class406.field5903)) {
                                    var365 = 2;
                                    var361 = var361.substring(class406.field5903.length());
                                } else if (var364.startsWith(class20.field273)) {
                                    var365 = 3;
                                    var361 = var361.substring(class20.field273.length());
                                } else if (var364.startsWith(class357.field5036)) {
                                    var365 = 4;
                                    var361 = var361.substring(class357.field5036.length());
                                } else if (var364.startsWith(class398.field5826)) {
                                    var365 = 5;
                                    var361 = var361.substring(class398.field5826.length());
                                }
                            }
                            field1618++;
                            class442.field6400.method158((byte) 7, 212);
                            class442.field6400.method2396(0, 12450);
                            int var366 = class442.field6400.field5273;
                            class442.field6400.method2396(var363, 12450);
                            class442.field6400.method2396(var365, 12450);
                            class89.method611(var361, (byte) 85, class442.field6400);
                            class442.field6400.method2390(class442.field6400.field5273 - var366, 126);
                            continue;
                        }
                        if (var619 == 5009) {
                            var3 -= 2;
                            String var367 = field1637[var3];
                            String var368 = field1637[var3 + 1];
                            if (class204.field2771 != 0 || (!class396.field5786 || class192.field2665) && !class190.field2645) {
                                field1616++;
                                class442.field6400.method158((byte) 7, 229);
                                class442.field6400.method2396(0, 12450);
                                int var369 = class442.field6400.field5273;
                                class442.field6400.method2412(-92, var367);
                                class89.method611(var368, (byte) 114, class442.field6400);
                                class442.field6400.method2390(class442.field6400.field5273 - var369, 105);
                            }
                            continue;
                        }
                        if (var619 == 5010) {
                            var2--;
                            int var370 = field1635[var2];
                            String var371 = null;
                            if (var370 < 100) {
                                var371 = class235.field3195[var370];
                            }
                            if (var371 == null) {
                                var371 = "";
                            }
                            field1637[var3++] = var371;
                            continue;
                        }
                        if (var619 == 5011) {
                            var2--;
                            int var372 = field1635[var2];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = class261.field3567[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field1637[var3++] = var373;
                            continue;
                        }
                        if (var619 == 5012) {
                            var2--;
                            int var374 = field1635[var2];
                            int var375 = -1;
                            if (var374 < 100) {
                                var375 = class164.field2321[var374];
                            }
                            field1635[var2++] = var375;
                            continue;
                        }
                        if (var619 == 5015) {
                            String var376;
                            if (class307.field4211 == null || class307.field4211.field4974 == null) {
                                var376 = class152.field2155;
                            } else {
                                var376 = class307.field4211.method2291(true, (byte) 102);
                            }
                            field1637[var3++] = var376;
                            continue;
                        }
                        if (var619 == 5016) {
                            field1635[var2++] = class419.field6056;
                            continue;
                        }
                        if (var619 == 5017) {
                            field1635[var2++] = class155.field2194;
                            continue;
                        }
                        if (var619 == 5018) {
                            var2--;
                            int var377 = field1635[var2];
                            int var378 = 0;
                            if (var377 < 100 && class353.field4952[var377] != null) {
                                var378 = class386.field5627[var377];
                            }
                            field1635[var2++] = var378;
                            continue;
                        }
                        if (var619 == 5019) {
                            var2--;
                            int var379 = field1635[var2];
                            String var380 = null;
                            if (var379 < 100) {
                                var380 = class412.field5992[var379];
                            }
                            if (var380 == null) {
                                var380 = "";
                            }
                            field1637[var3++] = var380;
                            continue;
                        }
                        if (var619 == 5020) {
                            String var381;
                            if (class307.field4211 == null || class307.field4211.field4974 == null) {
                                var381 = class152.field2155;
                            } else {
                                var381 = class307.field4211.method2288(false, (byte) 43);
                            }
                            field1637[var3++] = var381;
                            continue;
                        }
                        if (var619 == 5050) {
                            var2--;
                            int var382 = field1635[var2];
                            field1637[var3++] = class296.method1885(var382, 8921).field3507;
                            continue;
                        }
                        if (var619 == 5051) {
                            var2--;
                            int var383 = field1635[var2];
                            class257 var384 = class296.method1885(var383, 8921);
                            if (var384.field3510 == null) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var384.field3510.length;
                            }
                            continue;
                        }
                        if (var619 == 5052) {
                            var2 -= 2;
                            int var385 = field1635[var2];
                            int var386 = field1635[var2 + 1];
                            class257 var387 = class296.method1885(var385, 8921);
                            int var388 = var387.field3510[var386];
                            field1635[var2++] = var388;
                            continue;
                        }
                        if (var619 == 5053) {
                            var2--;
                            int var389 = field1635[var2];
                            class257 var390 = class296.method1885(var389, 8921);
                            if (var390.field3497 == null) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var390.field3497.length;
                            }
                            continue;
                        }
                        if (var619 == 5054) {
                            var2 -= 2;
                            int var391 = field1635[var2];
                            int var392 = field1635[var2 + 1];
                            field1635[var2++] = class296.method1885(var391, 8921).field3497[var392];
                            continue;
                        }
                        if (var619 == 5055) {
                            var2--;
                            int var393 = field1635[var2];
                            field1637[var3++] = class411.method2632(var393, (byte) -5).method988(true);
                            continue;
                        }
                        if (var619 == 5056) {
                            var2--;
                            int var394 = field1635[var2];
                            class144 var395 = class411.method2632(var394, (byte) 17);
                            if (var395.field2085 == null) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var395.field2085.length;
                            }
                            continue;
                        }
                        if (var619 == 5057) {
                            var2 -= 2;
                            int var396 = field1635[var2];
                            int var397 = field1635[var2 + 1];
                            field1635[var2++] = class411.method2632(var396, (byte) -102).field2085[var397];
                            continue;
                        }
                        if (var619 == 5058) {
                            field1619 = new class275();
                            var2--;
                            field1619.field3736 = field1635[var2];
                            field1619.field3732 = class411.method2632(field1619.field3736, (byte) -116);
                            field1619.field3729 = new int[field1619.field3732.method994((byte) -82)];
                            continue;
                        }
                        if (var619 == 5059) {
                            field1622++;
                            class442.field6400.method158((byte) 7, 143);
                            class442.field6400.method2396(0, 12450);
                            int var398 = class442.field6400.field5273;
                            class442.field6400.method2396(0, 12450);
                            class442.field6400.method2416(22064, field1619.field3736);
                            field1619.field3732.method987(class442.field6400, field1619.field3729, 64);
                            class442.field6400.method2390(class442.field6400.field5273 - var398, 122);
                            continue;
                        }
                        if (var619 == 5060) {
                            var3--;
                            String var399 = field1637[var3];
                            field1621++;
                            class442.field6400.method158((byte) 7, 96);
                            class442.field6400.method2396(0, 12450);
                            int var400 = class442.field6400.field5273;
                            class442.field6400.method2412(-76, var399);
                            class442.field6400.method2416(22064, field1619.field3736);
                            field1619.field3732.method987(class442.field6400, field1619.field3729, 64);
                            class442.field6400.method2390(class442.field6400.field5273 - var400, 127);
                            continue;
                        }
                        if (var619 == 5061) {
                            field1622++;
                            class442.field6400.method158((byte) 7, 143);
                            class442.field6400.method2396(0, 12450);
                            int var401 = class442.field6400.field5273;
                            class442.field6400.method2396(1, 12450);
                            class442.field6400.method2416(22064, field1619.field3736);
                            field1619.field3732.method987(class442.field6400, field1619.field3729, 64);
                            class442.field6400.method2390(class442.field6400.field5273 - var401, 107);
                            continue;
                        }
                        if (var619 == 5062) {
                            var2 -= 2;
                            int var402 = field1635[var2];
                            int var403 = field1635[var2 + 1];
                            field1635[var2++] = class296.method1885(var402, 8921).field3505[var403];
                            continue;
                        }
                        if (var619 == 5063) {
                            var2 -= 2;
                            int var404 = field1635[var2];
                            int var405 = field1635[var2 + 1];
                            field1635[var2++] = class296.method1885(var404, 8921).field3511[var405];
                            continue;
                        }
                        if (var619 == 5064) {
                            var2 -= 2;
                            int var406 = field1635[var2];
                            int var407 = field1635[var2 + 1];
                            if (var407 == -1) {
                                field1635[var2++] = -1;
                            } else {
                                field1635[var2++] = class296.method1885(var406, 8921).method1572((char) var407, 101);
                            }
                            continue;
                        }
                        if (var619 == 5065) {
                            var2 -= 2;
                            int var408 = field1635[var2];
                            int var409 = field1635[var2 + 1];
                            if (var409 == -1) {
                                field1635[var2++] = -1;
                            } else {
                                field1635[var2++] = class296.method1885(var408, 8921).method1576((byte) 78, (char) var409);
                            }
                            continue;
                        }
                        if (var619 == 5066) {
                            var2--;
                            int var410 = field1635[var2];
                            field1635[var2++] = class411.method2632(var410, (byte) -127).method994((byte) -78);
                            continue;
                        }
                        if (var619 == 5067) {
                            var2 -= 2;
                            int var411 = field1635[var2];
                            int var412 = field1635[var2 + 1];
                            int var413 = class411.method2632(var411, (byte) 112).method984((byte) -119, var412);
                            field1635[var2++] = var413;
                            continue;
                        }
                        if (var619 == 5068) {
                            var2 -= 2;
                            int var414 = field1635[var2];
                            int var415 = field1635[var2 + 1];
                            field1619.field3729[var414] = var415;
                            continue;
                        }
                        if (var619 == 5069) {
                            var2 -= 2;
                            int var416 = field1635[var2];
                            int var417 = field1635[var2 + 1];
                            field1619.field3729[var416] = var417;
                            continue;
                        }
                        if (var619 == 5070) {
                            var2 -= 3;
                            int var418 = field1635[var2];
                            int var419 = field1635[var2 + 1];
                            int var420 = field1635[var2 + 2];
                            class144 var421 = class411.method2632(var418, (byte) -98);
                            if (var421.method984((byte) -119, var419) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field1635[var2++] = var421.method985(var420, var419, -20015);
                            continue;
                        }
                        if (var619 == 5071) {
                            var3--;
                            String var422 = field1637[var3];
                            var2--;
                            boolean var423 = field1635[var2] == 1;
                            class366.method2353(var423, (byte) -123, var422);
                            field1635[var2++] = class222.field2981;
                            continue;
                        }
                        if (var619 == 5072) {
                            if (class434.field6239 != null && class298.field4125 < class222.field2981) {
                                field1635[var2++] = class434.field6239[class298.field4125++] & 0xFFFF;
                                continue;
                            }
                            field1635[var2++] = -1;
                            continue;
                        }
                        if (var619 == 5073) {
                            class298.field4125 = 0;
                            continue;
                        }
                    } else if (var619 < 5200) {
                        if (var619 == 5100) {
                            if (class293.field4056[86]) {
                                field1635[var2++] = 1;
                            } else {
                                field1635[var2++] = 0;
                            }
                            continue;
                        }
                        if (var619 == 5101) {
                            if (class293.field4056[82]) {
                                field1635[var2++] = 1;
                            } else {
                                field1635[var2++] = 0;
                            }
                            continue;
                        }
                        if (var619 == 5102) {
                            if (class293.field4056[81]) {
                                field1635[var2++] = 1;
                            } else {
                                field1635[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var619 < 5300) {
                        if (var619 == 5200) {
                            var2--;
                            class197.method1317(field1635[var2], 29000);
                            continue;
                        }
                        if (var619 == 5201) {
                            field1635[var2++] = class71.method482(1506);
                            continue;
                        }
                        if (var619 == 5205) {
                            var2--;
                            class386.method2526(field1635[var2], -1, -1, false, 23503);
                            continue;
                        }
                        if (var619 == 5206) {
                            var2--;
                            int var424 = field1635[var2];
                            class125 var425 = class42.method301(var424 >> 14 & 0x3FFF, var424 & 0x3FFF);
                            if (var425 == null) {
                                field1635[var2++] = -1;
                            } else {
                                field1635[var2++] = var425.field1763;
                            }
                            continue;
                        }
                        if (var619 == 5207) {
                            var2--;
                            class125 var426 = class42.method291(field1635[var2]);
                            if (var426 != null && var426.field1758 != null) {
                                field1637[var3++] = var426.field1758;
                                continue;
                            }
                            field1637[var3++] = "";
                            continue;
                        }
                        if (var619 == 5208) {
                            field1635[var2++] = class209.field2815;
                            field1635[var2++] = class223.field3003;
                            continue;
                        }
                        if (var619 == 5209) {
                            field1635[var2++] = class42.field641 + class339.field4742;
                            field1635[var2++] = class448.field6472 + class42.field650;
                            continue;
                        }
                        if (var619 == 5210) {
                            var2--;
                            int var427 = field1635[var2];
                            class125 var428 = class42.method291(var427);
                            if (var428 == null) {
                                field1635[var2++] = 0;
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var428.field1764 >> 14 & 0x3FFF;
                                field1635[var2++] = var428.field1764 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var619 == 5211) {
                            var2--;
                            int var429 = field1635[var2];
                            class125 var430 = class42.method291(var429);
                            if (var430 == null) {
                                field1635[var2++] = 0;
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var430.field1756 - var430.field1749;
                                field1635[var2++] = var430.field1759 - var430.field1751;
                            }
                            continue;
                        }
                        if (var619 == 5212) {
                            class173 var431 = class406.method2607(-124);
                            if (var431 == null) {
                                field1635[var2++] = -1;
                                field1635[var2++] = -1;
                            } else {
                                field1635[var2++] = var431.field2464;
                                int var432 = var431.field2463 << 28 | class42.field641 + var431.field2457 << 14 | class42.field650 + var431.field2466;
                                field1635[var2++] = var432;
                            }
                            continue;
                        }
                        if (var619 == 5213) {
                            class173 var433 = class156.method1048(121);
                            if (var433 == null) {
                                field1635[var2++] = -1;
                                field1635[var2++] = -1;
                            } else {
                                field1635[var2++] = var433.field2464;
                                int var434 = var433.field2463 << 28 | class42.field641 + var433.field2457 << 14 | class42.field650 + var433.field2466;
                                field1635[var2++] = var434;
                            }
                            continue;
                        }
                        if (var619 == 5214) {
                            var2--;
                            int var435 = field1635[var2];
                            class125 var436 = class331.method2060((byte) -59);
                            if (var436 != null) {
                                boolean var437 = var436.method833(var435 >> 14 & 0x3FFF, field1639, var435 >> 28 & 0x3, false, var435 & 0x3FFF);
                                if (var437) {
                                    class66.method450(1023, field1639[1], field1639[2]);
                                }
                            }
                            continue;
                        }
                        if (var619 == 5215) {
                            var2 -= 2;
                            int var438 = field1635[var2];
                            int var439 = field1635[var2 + 1];
                            class244 var440 = class42.method290(var438 >> 14 & 0x3FFF, var438 & 0x3FFF);
                            boolean var441 = false;
                            for (class125 var442 = (class125) var440.method1527((byte) 84); var442 != null; var442 = (class125) var440.method1532(-11786)) {
                                if (var442.field1763 == var439) {
                                    var441 = true;
                                    break;
                                }
                            }
                            if (var441) {
                                field1635[var2++] = 1;
                            } else {
                                field1635[var2++] = 0;
                            }
                            continue;
                        }
                        if (var619 == 5218) {
                            var2--;
                            int var443 = field1635[var2];
                            class125 var444 = class42.method291(var443);
                            if (var444 == null) {
                                field1635[var2++] = -1;
                            } else {
                                field1635[var2++] = var444.field1752;
                            }
                            continue;
                        }
                        if (var619 == 5220) {
                            field1635[var2++] = class24.field320 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 5221) {
                            var2--;
                            int var445 = field1635[var2];
                            class66.method450(1023, var445 >> 14 & 0x3FFF, var445 & 0x3FFF);
                            continue;
                        }
                        if (var619 == 5222) {
                            class125 var446 = class331.method2060((byte) -59);
                            if (var446 == null) {
                                field1635[var2++] = -1;
                                field1635[var2++] = -1;
                            } else {
                                boolean var447 = var446.method838(-81, class42.field641 + class339.field4742, class448.field6472 + class42.field650, field1639);
                                if (var447) {
                                    field1635[var2++] = field1639[1];
                                    field1635[var2++] = field1639[2];
                                } else {
                                    field1635[var2++] = -1;
                                    field1635[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var619 == 5223) {
                            var2 -= 2;
                            int var448 = field1635[var2];
                            int var449 = field1635[var2 + 1];
                            class386.method2526(var448, var449 & 0x3FFF, var449 >> 14 & 0x3FFF, false, 23503);
                            continue;
                        }
                        if (var619 == 5224) {
                            var2--;
                            int var450 = field1635[var2];
                            class125 var451 = class331.method2060((byte) -59);
                            if (var451 == null) {
                                field1635[var2++] = -1;
                                field1635[var2++] = -1;
                            } else {
                                boolean var452 = var451.method833(var450 >> 14 & 0x3FFF, field1639, var450 >> 28 & 0x3, false, var450 & 0x3FFF);
                                if (var452) {
                                    field1635[var2++] = field1639[1];
                                    field1635[var2++] = field1639[2];
                                } else {
                                    field1635[var2++] = -1;
                                    field1635[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var619 == 5225) {
                            var2--;
                            int var453 = field1635[var2];
                            class125 var454 = class331.method2060((byte) -59);
                            if (var454 == null) {
                                field1635[var2++] = -1;
                                field1635[var2++] = -1;
                            } else {
                                boolean var455 = var454.method838(-89, var453 >> 14 & 0x3FFF, var453 & 0x3FFF, field1639);
                                if (var455) {
                                    field1635[var2++] = field1639[1];
                                    field1635[var2++] = field1639[2];
                                } else {
                                    field1635[var2++] = -1;
                                    field1635[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var619 == 5226) {
                            var2--;
                            class279.method1699(true, field1635[var2]);
                            continue;
                        }
                        if (var619 == 5227) {
                            var2 -= 2;
                            int var456 = field1635[var2];
                            int var457 = field1635[var2 + 1];
                            class386.method2526(var456, var457 & 0x3FFF, var457 >> 14 & 0x3FFF, true, 23503);
                            continue;
                        }
                        if (var619 == 5228) {
                            var2--;
                            class182.field2547 = field1635[var2] == 1;
                            continue;
                        }
                        if (var619 == 5229) {
                            field1635[var2++] = class182.field2547 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 5230) {
                            var2--;
                            int var458 = field1635[var2];
                            class258.method1587(var458, 100);
                            continue;
                        }
                        if (var619 == 5231) {
                            var2 -= 2;
                            int var459 = field1635[var2];
                            boolean var460 = field1635[var2 + 1] == 1;
                            if (class339.field4744 == null) {
                                continue;
                            }
                            class376 var461 = class339.field4744.method1412((byte) -54, (long) var459);
                            if (var461 != null && !var460) {
                                var461.method2459(198);
                                continue;
                            }
                            if (var461 == null && var460) {
                                class376 var462 = new class376();
                                class339.field4744.method1419((long) var459, 54, var462);
                            }
                            continue;
                        }
                        if (var619 == 5232) {
                            var2--;
                            int var463 = field1635[var2];
                            if (class339.field4744 == null) {
                                field1635[var2++] = 0;
                            } else {
                                class376 var464 = class339.field4744.method1412((byte) -54, (long) var463);
                                field1635[var2++] = var464 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var619 == 5233) {
                            var2 -= 2;
                            int var465 = field1635[var2];
                            boolean var466 = field1635[var2 + 1] == 1;
                            if (class216.field2866 == null) {
                                continue;
                            }
                            class376 var467 = class216.field2866.method1412((byte) -54, (long) var465);
                            if (var467 != null && !var466) {
                                var467.method2459(198);
                                continue;
                            }
                            if (var467 == null && var466) {
                                class376 var468 = new class376();
                                class216.field2866.method1419((long) var465, 62, var468);
                            }
                            continue;
                        }
                        if (var619 == 5234) {
                            var2--;
                            int var469 = field1635[var2];
                            if (class216.field2866 == null) {
                                field1635[var2++] = 0;
                            } else {
                                class376 var470 = class216.field2866.method1412((byte) -54, (long) var469);
                                field1635[var2++] = var470 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var619 == 5235) {
                            field1635[var2++] = class42.field618 == null ? -1 : class42.field618.field1763;
                            continue;
                        }
                    } else if (var619 < 5400) {
                        if (var619 == 5300) {
                            var2 -= 2;
                            int var471 = field1635[var2];
                            int var472 = field1635[var2 + 1];
                            class365.method2347(var471, -31718, false, 3, var472);
                            field1635[var2++] = class227.field3044 == null ? 0 : 1;
                            continue;
                        }
                        if (var619 == 5301) {
                            if (class227.field3044 != null) {
                                class365.method2347(-1, -31718, false, class152.field2153, -1);
                            }
                            continue;
                        }
                        if (var619 == 5302) {
                            class337[] var473 = class220.method1394(126);
                            field1635[var2++] = var473.length;
                            continue;
                        }
                        if (var619 == 5303) {
                            var2--;
                            int var474 = field1635[var2];
                            class337[] var475 = class220.method1394(127);
                            field1635[var2++] = var475[var474].field4597;
                            field1635[var2++] = var475[var474].field4591;
                            continue;
                        }
                        if (var619 == 5305) {
                            int var476 = class308.field4227;
                            int var477 = class29.field457;
                            int var478 = -1;
                            class337[] var479 = class220.method1394(125);
                            for (int var480 = 0; var480 < var479.length; var480++) {
                                class337 var481 = var479[var480];
                                if (var481.field4597 == var476 && var481.field4591 == var477) {
                                    var478 = var480;
                                    break;
                                }
                            }
                            field1635[var2++] = var478;
                            continue;
                        }
                        if (var619 == 5306) {
                            field1635[var2++] = class162.method1075(-45);
                            continue;
                        }
                        if (var619 == 5307) {
                            var2--;
                            int var482 = field1635[var2];
                            if (var482 >= 1 && var482 <= 2) {
                                class365.method2347(-1, -31718, false, var482, -1);
                            }
                            continue;
                        }
                        if (var619 == 5308) {
                            field1635[var2++] = class152.field2153;
                            continue;
                        }
                        if (var619 == 5309) {
                            var2--;
                            int var483 = field1635[var2];
                            if (var483 >= 1 && var483 <= 2) {
                                class152.field2153 = var483;
                                class29.method228(-79, class204.field2772);
                            }
                            continue;
                        }
                    } else if (var619 < 5500) {
                        if (var619 == 5400) {
                            var3 -= 2;
                            String var484 = field1637[var3];
                            String var485 = field1637[var3 + 1];
                            var2--;
                            int var486 = field1635[var2];
                            field1624++;
                            class442.field6400.method158((byte) 7, 83);
                            class442.field6400.method2396(class322.method2036(var484, 88) + class322.method2036(var485, -100) + 1, 12450);
                            class442.field6400.method2412(-68, var484);
                            class442.field6400.method2412(-104, var485);
                            class442.field6400.method2396(var486, 12450);
                            continue;
                        }
                        if (var619 == 5401) {
                            var2 -= 2;
                            class313.field4313[field1635[var2]] = (short) class155.method1045((byte) 43, field1635[var2 + 1]);
                            class113.method748(119);
                            class163.method1084(43);
                            class78.method560(32156);
                            class129.method865((byte) 127);
                            class210.method1362(17612);
                            continue;
                        }
                        if (var619 == 5405) {
                            var2 -= 2;
                            int var487 = field1635[var2];
                            int var488 = field1635[var2 + 1];
                            if (var487 >= 0 && var487 < 2) {
                                class86.field1325[var487] = new int[var488 << 1][4];
                            }
                            continue;
                        }
                        if (var619 == 5406) {
                            var2 -= 7;
                            int var489 = field1635[var2];
                            int var490 = field1635[var2 + 1] << 1;
                            int var491 = field1635[var2 + 2];
                            int var492 = field1635[var2 + 3];
                            int var493 = field1635[var2 + 4];
                            int var494 = field1635[var2 + 5];
                            int var495 = field1635[var2 + 6];
                            if (var489 >= 0 && var489 < 2 && class86.field1325[var489] != null && var490 >= 0 && var490 < class86.field1325[var489].length) {
                                class86.field1325[var489][var490] = new int[] { (var491 >> 14 & 0x3FFF) * 128, var492, (var491 & 0x3FFF) * 128, var495 };
                                class86.field1325[var489][var490 + 1] = new int[] { (var493 >> 14 & 0x3FFF) * 128, var494, (var493 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var619 == 5407) {
                            var2--;
                            int var496 = class86.field1325[field1635[var2]].length >> 1;
                            field1635[var2++] = var496;
                            continue;
                        }
                        if (var619 == 5411) {
                            if (class227.field3044 != null) {
                                class365.method2347(-1, -31718, false, class152.field2153, -1);
                            }
                            if (class393.field5746 == null) {
                                String var497 = class399.field5830 == null ? class97.method689(68) : class399.field5830;
                                class290.method1870(var497, class16.field205 == 1, (byte) -34, class204.field2772, false);
                            } else {
                                class412.method2637(0);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var619 == 5419) {
                            String var498 = "";
                            if (class236.field3213 != null) {
                                if (class236.field3213.field4070 == null) {
                                    var498 = class429.method2702(19464, class236.field3213.field4069);
                                } else {
                                    var498 = (String) class236.field3213.field4070;
                                }
                            }
                            field1637[var3++] = var498;
                            continue;
                        }
                        if (var619 == 5420) {
                            field1635[var2++] = class351.field4889 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 5421) {
                            if (class227.field3044 != null) {
                                class365.method2347(-1, -31718, false, class152.field2153, -1);
                            }
                            var3--;
                            String var499 = field1637[var3];
                            var2--;
                            boolean var500 = field1635[var2] == 1;
                            String var501 = class97.method689(-106) + var499;
                            class290.method1870(var501, class16.field205 == 1, (byte) -34, class204.field2772, var500);
                            continue;
                        }
                        if (var619 == 5422) {
                            var3 -= 2;
                            String var502 = field1637[var3];
                            String var503 = field1637[var3 + 1];
                            var2--;
                            int var504 = field1635[var2];
                            if (var502.length() > 0) {
                                if (class401.field5845 == null) {
                                    class401.field5845 = new String[class123.field1726[class180.field2521]];
                                }
                                class401.field5845[var504] = var502;
                            }
                            if (var503.length() > 0) {
                                if (class143.field2074 == null) {
                                    class143.field2074 = new String[class123.field1726[class180.field2521]];
                                }
                                class143.field2074[var504] = var503;
                            }
                            continue;
                        }
                        if (var619 == 5423) {
                            var3--;
                            System.out.println(field1637[var3]);
                            continue;
                        }
                        if (var619 == 5424) {
                            var2 -= 11;
                            class434.field6234 = field1635[var2];
                            class323.field4423 = field1635[var2 + 1];
                            class12.field155 = field1635[var2 + 2];
                            class168.field2395 = field1635[var2 + 3];
                            class79.field1222 = field1635[var2 + 4];
                            class257.field3503 = field1635[var2 + 5];
                            class217.field2875 = field1635[var2 + 6];
                            class448.field6460 = field1635[var2 + 7];
                            class410.field5955 = field1635[var2 + 8];
                            class279.field3776 = field1635[var2 + 9];
                            class189.field2627 = field1635[var2 + 10];
                            class353.field4943.method1898(class79.field1222, 125);
                            class353.field4943.method1898(class257.field3503, 124);
                            class353.field4943.method1898(class217.field2875, 125);
                            class353.field4943.method1898(class448.field6460, 123);
                            class353.field4943.method1898(class410.field5955, 127);
                            class240.field3337 = null;
                            class374.field5345 = null;
                            class58.field826 = null;
                            class181.field2539 = null;
                            class412.field5986 = null;
                            class167.field2394 = null;
                            class62.field973 = null;
                            class141.field2017 = null;
                            class235.field3198 = true;
                            continue;
                        }
                        if (var619 == 5425) {
                            class365.method2345(-127);
                            class235.field3198 = false;
                            continue;
                        }
                        if (var619 == 5426) {
                            var2 -= 2;
                            class89.field1363 = field1635[var2];
                            class3.field36 = field1635[var2 + 1];
                            continue;
                        }
                        if (var619 == 5427) {
                            var2 -= 2;
                            class243.field3355 = field1635[var2];
                            class71.field1097 = field1635[var2 + 1];
                            continue;
                        }
                        if (var619 == 5428) {
                            var2 -= 2;
                            int var505 = field1635[var2];
                            int var506 = field1635[var2 + 1];
                            field1635[var2++] = class89.method614((byte) -89, var506, var505) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 5429) {
                            var3--;
                            class160.method1064((byte) -60, false, field1637[var3]);
                            continue;
                        }
                    } else if (var619 < 5600) {
                        if (var619 == 5500) {
                            var2 -= 4;
                            int var507 = field1635[var2];
                            int var508 = field1635[var2 + 1];
                            int var509 = field1635[var2 + 2];
                            int var510 = field1635[var2 + 3];
                            client.method1106((var507 >> 14 & 0x3FFF) - class449.field6509, var508, 13412, false, (var507 & 0x3FFF) - class354.field4981, var510, var509);
                            continue;
                        }
                        if (var619 == 5501) {
                            var2 -= 4;
                            int var511 = field1635[var2];
                            int var512 = field1635[var2 + 1];
                            int var513 = field1635[var2 + 2];
                            int var514 = field1635[var2 + 3];
                            class272.method1672(var514, (var511 >> 14 & 0x3FFF) - class449.field6509, var512, var513, (var511 & 0x3FFF) - class354.field4981, (byte) 122);
                            continue;
                        }
                        if (var619 == 5502) {
                            var2 -= 6;
                            int var515 = field1635[var2];
                            if (var515 >= 2) {
                                throw new RuntimeException();
                            }
                            class6.field91 = var515;
                            int var516 = field1635[var2 + 1];
                            if (var516 + 1 >= class86.field1325[class6.field91].length >> 1) {
                                throw new RuntimeException();
                            }
                            class89.field1351 = var516;
                            class319.field4384 = 0;
                            class126.field1773 = field1635[var2 + 2];
                            class312.field4310 = field1635[var2 + 3];
                            int var517 = field1635[var2 + 4];
                            if (var517 >= 2) {
                                throw new RuntimeException();
                            }
                            class299.field4142 = var517;
                            int var518 = field1635[var2 + 5];
                            if (var518 + 1 >= class86.field1325[class299.field4142].length >> 1) {
                                throw new RuntimeException();
                            }
                            client.field2341 = var518;
                            class123.field1731 = 3;
                            continue;
                        }
                        if (var619 == 5503) {
                            class77.method551(-25874);
                            continue;
                        }
                        if (var619 == 5504) {
                            var2 -= 2;
                            class247.method1541(field1635[var2], field1635[var2 + 1], 0, -3);
                            continue;
                        }
                        if (var619 == 5505) {
                            field1635[var2++] = (int) class140.field2007 >> 3;
                            continue;
                        }
                        if (var619 == 5506) {
                            field1635[var2++] = (int) class6.field98 >> 3;
                            continue;
                        }
                        if (var619 == 5507) {
                            class127.method845(false);
                            continue;
                        }
                        if (var619 == 5508) {
                            class16.method91(112);
                            continue;
                        }
                        if (var619 == 5509) {
                            class451.method2819(false);
                            continue;
                        }
                        if (var619 == 5510) {
                            class67.method459(735);
                            continue;
                        }
                        if (var619 == 5511) {
                            var2--;
                            int var519 = field1635[var2];
                            int var520 = var519 >> 14 & 0x3FFF;
                            int var521 = var519 & 0x3FFF;
                            int var522 = var520 - class449.field6509;
                            if (var522 < 0) {
                                var522 = 0;
                            } else if (var522 >= class432.field6220) {
                                var522 = class432.field6220;
                            }
                            int var523 = var521 - class354.field4981;
                            if (var523 < 0) {
                                var523 = 0;
                            } else if (var523 >= class267.field3646) {
                                var523 = class267.field3646;
                            }
                            class164.field2311 = var522 * 128 + 64;
                            class120.field1714 = var523 * 128 + 64;
                            class123.field1731 = 4;
                            continue;
                        }
                        if (var619 == 5512) {
                            class298.method1922(false);
                            continue;
                        }
                    } else if (var619 < 5700) {
                        if (var619 == 5600) {
                            var3 -= 2;
                            String var524 = field1637[var3];
                            String var525 = field1637[var3 + 1];
                            var2--;
                            int var526 = field1635[var2];
                            if (class79.field1220 == 10 && class430.field6193 == 0 && class24.field323 == 0 && class282.field3867 == 0 && class194.field2697 == 0) {
                                class318.method2026(var526, var524, 0, var525);
                            }
                            continue;
                        }
                        if (var619 == 5601) {
                            class409.method2626(6);
                            continue;
                        }
                        if (var619 == 5602) {
                            if (class24.field323 == 0) {
                                class163.field2296 = -2;
                            }
                            continue;
                        }
                        if (var619 == 5603) {
                            var2 -= 4;
                            if (class79.field1220 == 10 && class430.field6193 == 0 && class24.field323 == 0 && class282.field3867 == 0 && class194.field2697 == 0) {
                                class68.method461(field1635[var2 + 1], field1635[var2], (byte) -74, field1635[var2 + 2], field1635[var2 + 3]);
                            }
                            continue;
                        }
                        if (var619 == 5604) {
                            var3--;
                            if (class79.field1220 == 10 && class430.field6193 == 0 && class24.field323 == 0 && class282.field3867 == 0 && class194.field2697 == 0) {
                                class262.method1611(class3.method17((byte) -93, field1637[var3]), 128);
                            }
                            continue;
                        }
                        if (var619 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class79.field1220 == 10 && class430.field6193 == 0 && class24.field323 == 0 && class282.field3867 == 0 && class194.field2697 == 0) {
                                class310.method1963(field1635[var2 + 6] == 1, -17576, field1635[var2 + 2], field1635[var2 + 1], field1635[var2 + 5] == 1, field1635[var2], field1635[var2 + 4] == 1, field1635[var2 + 3], field1637[var3 + 2], class3.method17((byte) -93, field1637[var3]), field1637[var3 + 1]);
                            }
                            continue;
                        }
                        if (var619 == 5606) {
                            if (class282.field3867 == 0) {
                                class165.field2352 = -2;
                            }
                            continue;
                        }
                        if (var619 == 5607) {
                            field1635[var2++] = class163.field2296;
                            continue;
                        }
                        if (var619 == 5608) {
                            field1635[var2++] = class286.field3937;
                            continue;
                        }
                        if (var619 == 5609) {
                            field1635[var2++] = class165.field2352;
                            continue;
                        }
                        if (var619 == 5610) {
                            for (int var527 = 0; var527 < 5; var527++) {
                                field1637[var3++] = class67.field1047.length > var527 ? class25.method202(74, class67.field1047[var527]) : "";
                            }
                            class67.field1047 = null;
                            continue;
                        }
                        if (var619 == 5611) {
                            field1635[var2++] = class411.field5966;
                            continue;
                        }
                    } else if (var619 < 6100) {
                        if (var619 == 6001) {
                            var2--;
                            int var528 = field1635[var2];
                            if (var528 < 1) {
                                var528 = 1;
                            }
                            if (var528 > 4) {
                                var528 = 4;
                            }
                            class326.field4453 = var528;
                            class26.method213(63);
                            class29.method228(-75, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6002) {
                            var2--;
                            class141.method962(97, field1635[var2] == 1);
                            class144.method989(-91);
                            class26.method213(-28);
                            class15.method89(-125);
                            class29.method228(-79, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6003) {
                            var2--;
                            class231.field3098 = field1635[var2] == 1;
                            class15.method89(-81);
                            class29.method228(-52, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6005) {
                            var2--;
                            class21.field280 = field1635[var2] == 1;
                            class26.method213(116);
                            class29.method228(-78, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6006) {
                            var2--;
                            class313.field4316 = field1635[var2] == 1;
                            class408.field5920.method1789(!class313.field4316);
                            class29.method228(-122, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6007) {
                            var2--;
                            class207.field2795 = field1635[var2];
                            class29.method228(-95, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6008) {
                            var2--;
                            class366.field5126 = field1635[var2] == 1;
                            class29.method228(-50, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6009) {
                            var2--;
                            class427.field6127 = field1635[var2] == 1;
                            class26.method213(-106);
                            class29.method228(-63, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6010) {
                            var2--;
                            class57.field813 = field1635[var2] == 1;
                            class29.method228(-53, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6011) {
                            var2--;
                            int var529 = field1635[var2];
                            if (var529 < 0 || var529 > 2) {
                                var529 = 0;
                            }
                            class410.field5956 = var529;
                            class26.method213(-20);
                            class29.method228(-110, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6012) {
                            var2--;
                            class412.field5977 = field1635[var2] == 1;
                            class1.method1((byte) 72);
                            class29.method228(-63, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6014) {
                            var2--;
                            class406.field5904 = field1635[var2] == 1;
                            class26.method213(92);
                            class29.method228(-66, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6015) {
                            var2--;
                            class72.field1114 = field1635[var2] == 1;
                            class26.method213(-118);
                            class29.method228(-128, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6016) {
                            var2--;
                            int var530 = field1635[var2];
                            if (var530 < 0 || var530 > 2) {
                                var530 = 0;
                            }
                            class67.field1056 = var530;
                            class23.method151(-76);
                            class29.method228(-99, class204.field2772);
                            continue;
                        }
                        if (var619 == 6017) {
                            var2--;
                            class267.field3639 = field1635[var2] == 1;
                            class61.method405(0);
                            class29.method228(-43, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6018) {
                            var2--;
                            int var531 = field1635[var2];
                            if (var531 < 0) {
                                var531 = 0;
                            }
                            if (var531 > 127) {
                                var531 = 127;
                            }
                            class396.field5788 = var531;
                            class29.method228(-42, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6019) {
                            var2--;
                            int var532 = field1635[var2];
                            if (var532 < 0) {
                                var532 = 0;
                            }
                            if (var532 > 255) {
                                var532 = 255;
                            }
                            if (class276.field3750 != var532) {
                                if (class276.field3750 == 0 && class261.field3569 != -1) {
                                    class108.method729(false, false, class331.field4488, class261.field3569, var532, 0);
                                    class1.field12 = false;
                                } else if (var532 == 0) {
                                    class21.method141((byte) 20);
                                    class1.field12 = false;
                                } else {
                                    class24.method166(false, var532);
                                }
                                class276.field3750 = var532;
                            }
                            class29.method228(-119, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6020) {
                            var2--;
                            int var533 = field1635[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 127) {
                                var533 = 127;
                            }
                            class406.field5895 = var533;
                            class29.method228(-58, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6021) {
                            var2--;
                            class22.field295 = field1635[var2] == 1;
                            class15.method89(-11);
                            continue;
                        }
                        if (var619 == 6023) {
                            var2--;
                            int var534 = field1635[var2];
                            boolean var535 = false;
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 2) {
                                var534 = 2;
                            }
                            if (class275.field3730 < 96) {
                                var534 = 0;
                                var535 = true;
                            }
                            class132.method901(-32190, var534);
                            class29.method228(-59, class204.field2772);
                            class249.field3451 = false;
                            field1635[var2++] = var535 ? 0 : 1;
                            continue;
                        }
                        if (var619 == 6024) {
                            var2--;
                            int var536 = field1635[var2];
                            if (var536 < 0 || var536 > 2) {
                                var536 = 0;
                            }
                            class410.field5960 = var536;
                            class29.method228(-93, class204.field2772);
                            continue;
                        }
                        if (var619 == 6025) {
                            var2--;
                            int var537 = field1635[var2];
                            if (var537 < 0 || var537 > 3) {
                                var537 = 0;
                            }
                            class129.field1800 = var537;
                            class29.method228(-82, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                        if (var619 == 6027) {
                            var2--;
                            int var538 = field1635[var2];
                            if (var538 < 0 || var538 > 1) {
                                var538 = 0;
                            }
                            class58.method388(var538 == 1, -117);
                            continue;
                        }
                        if (var619 == 6028) {
                            var2--;
                            class48.field732 = field1635[var2] != 0;
                            class29.method228(-70, class204.field2772);
                            continue;
                        }
                        if (var619 == 6029) {
                            var2--;
                            class207.field2795 = field1635[var2];
                            class29.method228(-98, class204.field2772);
                            continue;
                        }
                        if (var619 == 6030) {
                            var2--;
                            class10.field147 = field1635[var2] != 0;
                            class29.method228(-48, class204.field2772);
                            class26.method213(91);
                            continue;
                        }
                        if (var619 == 6031) {
                            var2--;
                            int var539 = field1635[var2];
                            if (var539 < 0 || var539 > 3) {
                                var539 = 2;
                            }
                            class99.method702(-17666, var539);
                            continue;
                        }
                        if (var619 == 6032) {
                            var2--;
                            int var540 = field1635[var2];
                            if (var540 < 0 || var540 > 3) {
                                var540 = 2;
                            }
                            class28.field448 = var540;
                            class29.method228(-112, class204.field2772);
                            class249.field3451 = false;
                            continue;
                        }
                    } else if (var619 < 6200) {
                        if (var619 == 6101) {
                            field1635[var2++] = class326.field4453;
                            continue;
                        }
                        if (var619 == 6102) {
                            field1635[var2++] = class67.method457(31862) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6103) {
                            field1635[var2++] = class231.field3098 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6105) {
                            field1635[var2++] = class21.field280 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6106) {
                            field1635[var2++] = class313.field4316 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6107) {
                            field1635[var2++] = class207.field2795;
                            continue;
                        }
                        if (var619 == 6108) {
                            field1635[var2++] = class366.field5126 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6109) {
                            field1635[var2++] = class427.field6127 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6110) {
                            field1635[var2++] = class57.field813 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6111) {
                            field1635[var2++] = class410.field5956;
                            continue;
                        }
                        if (var619 == 6112) {
                            field1635[var2++] = class412.field5977 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6114) {
                            field1635[var2++] = class406.field5904 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6115) {
                            field1635[var2++] = class72.field1114 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6116) {
                            field1635[var2++] = class67.field1056;
                            continue;
                        }
                        if (var619 == 6117) {
                            field1635[var2++] = class267.field3639 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6118) {
                            field1635[var2++] = class396.field5788;
                            continue;
                        }
                        if (var619 == 6119) {
                            field1635[var2++] = class276.field3750;
                            continue;
                        }
                        if (var619 == 6120) {
                            field1635[var2++] = class406.field5895;
                            continue;
                        }
                        if (var619 == 6121) {
                            field1635[var2++] = class408.field5920.method1729() ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6123) {
                            field1635[var2++] = class143.method974(-109);
                            continue;
                        }
                        if (var619 == 6124) {
                            field1635[var2++] = class410.field5960;
                            continue;
                        }
                        if (var619 == 6125) {
                            field1635[var2++] = class129.field1800;
                            continue;
                        }
                        if (var619 == 6126) {
                            field1635[var2++] = class408.field5920.method1723() ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6127) {
                            field1635[var2++] = class233.field3156 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6128) {
                            field1635[var2++] = class48.field732 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6129) {
                            field1635[var2++] = class207.field2795;
                            continue;
                        }
                        if (var619 == 6130) {
                            field1635[var2++] = class10.field147 ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6131) {
                            field1635[var2++] = class16.field205;
                            continue;
                        }
                        if (var619 == 6132) {
                            field1635[var2++] = class28.field448;
                            continue;
                        }
                        if (var619 == 6133) {
                            field1635[var2++] = class351.field4889 == 1 || class351.field4889 == 4 ? 1 : 0;
                            continue;
                        }
                    } else if (var619 < 6300) {
                        if (var619 == 6200) {
                            var2 -= 2;
                            class181.field2538 = (short) field1635[var2];
                            if (class181.field2538 <= 0) {
                                class181.field2538 = 256;
                            }
                            class223.field2995 = (short) field1635[var2 + 1];
                            if (class223.field2995 <= 0) {
                                class223.field2995 = 205;
                            }
                            continue;
                        }
                        if (var619 == 6201) {
                            var2 -= 2;
                            class21.field279 = (short) field1635[var2];
                            if (class21.field279 <= 0) {
                                class21.field279 = 256;
                            }
                            class216.field2868 = (short) field1635[var2 + 1];
                            if (class216.field2868 <= 0) {
                                class216.field2868 = 320;
                            }
                            continue;
                        }
                        if (var619 == 6202) {
                            var2 -= 4;
                            class105.field1576 = (short) field1635[var2];
                            if (class105.field1576 <= 0) {
                                class105.field1576 = 1;
                            }
                            class140.field2003 = (short) field1635[var2 + 1];
                            if (class140.field2003 <= 0) {
                                class140.field2003 = 32767;
                            } else if (class140.field2003 < class105.field1576) {
                                class140.field2003 = class105.field1576;
                            }
                            class401.field5850 = (short) field1635[var2 + 2];
                            if (class401.field5850 <= 0) {
                                class401.field5850 = 1;
                            }
                            class167.field2385 = (short) field1635[var2 + 3];
                            if (class167.field2385 <= 0) {
                                class167.field2385 = 32767;
                            } else if (class167.field2385 < class401.field5850) {
                                class167.field2385 = class401.field5850;
                            }
                            continue;
                        }
                        if (var619 == 6203) {
                            class170.method1145(class359.field5051.field5431, 0, false, 0, class359.field5051.field5491, 0);
                            field1635[var2++] = class9.field141;
                            field1635[var2++] = class16.field195;
                            continue;
                        }
                        if (var619 == 6204) {
                            field1635[var2++] = class21.field279;
                            field1635[var2++] = class216.field2868;
                            continue;
                        }
                        if (var619 == 6205) {
                            field1635[var2++] = class181.field2538;
                            field1635[var2++] = class223.field2995;
                            continue;
                        }
                    } else if (var619 < 6400) {
                        if (var619 == 6300) {
                            field1635[var2++] = (int) (class224.method1425(-26805) / 60000L);
                            continue;
                        }
                        if (var619 == 6301) {
                            field1635[var2++] = (int) (class224.method1425(-26805) / 86400000L) - 11745;
                            continue;
                        }
                        if (var619 == 6302) {
                            var2 -= 3;
                            int var541 = field1635[var2];
                            int var542 = field1635[var2 + 1];
                            int var543 = field1635[var2 + 2];
                            field1627.clear();
                            field1627.set(11, 12);
                            field1627.set(var543, var542, var541);
                            field1635[var2++] = (int) (field1627.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var619 == 6303) {
                            field1627.clear();
                            field1627.setTime(new Date(class224.method1425(-26805)));
                            field1635[var2++] = field1627.get(1);
                            continue;
                        }
                        if (var619 == 6304) {
                            var2--;
                            int var544 = field1635[var2];
                            boolean var545 = true;
                            if (var544 < 0) {
                                var545 = (var544 + 1) % 4 == 0;
                            } else if (var544 < 1582) {
                                var545 = var544 % 4 == 0;
                            } else if (var544 % 4 != 0) {
                                var545 = false;
                            } else if (var544 % 100 != 0) {
                                var545 = true;
                            } else if (var544 % 400 != 0) {
                                var545 = false;
                            }
                            field1635[var2++] = var545 ? 1 : 0;
                            continue;
                        }
                    } else if (var619 < 6500) {
                        if (var619 == 6405) {
                            field1635[var2++] = class153.method1033(0) ? 1 : 0;
                            continue;
                        }
                        if (var619 == 6406) {
                            field1635[var2++] = class23.method154(3459) ? 1 : 0;
                            continue;
                        }
                    } else if (var619 < 6600) {
                        if (var619 == 6500) {
                            if (class79.field1220 == 10 && class430.field6193 == 0 && class24.field323 == 0 && class282.field3867 == 0) {
                                field1635[var2++] = class227.method1436((byte) 33) == -1 ? 0 : 1;
                                continue;
                            }
                            field1635[var2++] = 1;
                            continue;
                        }
                        if (var619 == 6501) {
                            class31 var546 = class342.method2200((byte) -103);
                            if (var546 == null) {
                                field1635[var2++] = -1;
                                field1635[var2++] = 0;
                                field1637[var3++] = "";
                                field1635[var2++] = 0;
                                field1637[var3++] = "";
                                field1635[var2++] = 0;
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var546.field481;
                                field1635[var2++] = var546.field2516;
                                field1637[var3++] = var546.field475;
                                class250 var547 = var546.method239(false);
                                field1635[var2++] = var547.field3459;
                                field1637[var3++] = var547.field3461;
                                field1635[var2++] = var546.field2522;
                                field1635[var2++] = var546.field480;
                            }
                            continue;
                        }
                        if (var619 == 6502) {
                            class31 var548 = class179.method1189(-102);
                            if (var548 == null) {
                                field1635[var2++] = -1;
                                field1635[var2++] = 0;
                                field1637[var3++] = "";
                                field1635[var2++] = 0;
                                field1637[var3++] = "";
                                field1635[var2++] = 0;
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var548.field481;
                                field1635[var2++] = var548.field2516;
                                field1637[var3++] = var548.field475;
                                class250 var549 = var548.method239(false);
                                field1635[var2++] = var549.field3459;
                                field1637[var3++] = var549.field3461;
                                field1635[var2++] = var548.field2522;
                                field1635[var2++] = var548.field480;
                            }
                            continue;
                        }
                        if (var619 == 6503) {
                            var2--;
                            int var550 = field1635[var2];
                            if (class79.field1220 == 10 && class430.field6193 == 0 && class24.field323 == 0 && class282.field3867 == 0) {
                                field1635[var2++] = class72.method485((byte) 91, var550) ? 1 : 0;
                                continue;
                            }
                            field1635[var2++] = 0;
                            continue;
                        }
                        if (var619 == 6504) {
                            var2--;
                            class323.field4428 = field1635[var2];
                            class29.method228(-94, class204.field2772);
                            continue;
                        }
                        if (var619 == 6505) {
                            field1635[var2++] = class323.field4428;
                            continue;
                        }
                        if (var619 == 6506) {
                            var2--;
                            int var551 = field1635[var2];
                            class31 var552 = class430.method2708(var551, 1);
                            if (var552 == null) {
                                field1635[var2++] = -1;
                                field1637[var3++] = "";
                                field1635[var2++] = 0;
                                field1637[var3++] = "";
                                field1635[var2++] = 0;
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = var552.field2516;
                                field1637[var3++] = var552.field475;
                                class250 var553 = var552.method239(false);
                                field1635[var2++] = var553.field3459;
                                field1637[var3++] = var553.field3461;
                                field1635[var2++] = var552.field2522;
                                field1635[var2++] = var552.field480;
                            }
                            continue;
                        }
                        if (var619 == 6507) {
                            var2 -= 4;
                            int var554 = field1635[var2];
                            boolean var555 = field1635[var2 + 1] == 1;
                            int var556 = field1635[var2 + 2];
                            boolean var557 = field1635[var2 + 3] == 1;
                            class232.method1457(var554, var556, var557, var555, (byte) -38);
                            continue;
                        }
                        if (var619 == 6508) {
                            class378.method2470((byte) -126);
                            continue;
                        }
                        if (var619 == 6509) {
                            if (class79.field1220 == 10) {
                                var2--;
                                if (field1635[var2] == 1) {
                                    if (class77.field1210 == null) {
                                        class77.field1210 = new class70();
                                    }
                                } else if (class77.field1210 != null) {
                                    class77.field1210.method480(-124);
                                    class77.field1210 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var619 < 6700) {
                        if (var619 == 6600) {
                            var2--;
                            class188.field2609 = field1635[var2] == 1;
                            class29.method228(-125, class204.field2772);
                            continue;
                        }
                        if (var619 == 6601) {
                            field1635[var2++] = class188.field2609 ? 1 : 0;
                            continue;
                        }
                    } else if (var619 < 6800 && class62.field975 == 2) {
                        if (var619 == 6700) {
                            int var558 = class271.field3700.method1417(111);
                            if (class230.field3089 != -1) {
                                var558++;
                            }
                            field1635[var2++] = var558;
                            continue;
                        }
                        if (var619 == 6701) {
                            var2--;
                            int var559 = field1635[var2];
                            if (class230.field3089 != -1) {
                                if (var559 == 0) {
                                    field1635[var2++] = class230.field3089;
                                    continue;
                                }
                                var559--;
                            }
                            class432 var560 = (class432) class271.field3700.method1413(30381);
                            while (var559-- > 0) {
                                var560 = (class432) class271.field3700.method1420((byte) 120);
                            }
                            field1635[var2++] = var560.field6217;
                            continue;
                        }
                        if (var619 == 6702) {
                            var2--;
                            int var561 = field1635[var2];
                            if (class333.field4511[var561] == null) {
                                field1637[var3++] = "";
                            } else {
                                String var562 = class333.field4511[var561][0].field5525;
                                if (var562 == null) {
                                    field1637[var3++] = "";
                                } else {
                                    field1637[var3++] = var562.substring(0, var562.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var619 == 6703) {
                            var2--;
                            int var563 = field1635[var2];
                            if (class333.field4511[var563] == null) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = class333.field4511[var563].length;
                            }
                            continue;
                        }
                        if (var619 == 6704) {
                            var2 -= 2;
                            int var564 = field1635[var2];
                            int var565 = field1635[var2 + 1];
                            if (class333.field4511[var564] == null) {
                                field1637[var3++] = "";
                            } else {
                                String var566 = class333.field4511[var564][var565].field5525;
                                if (var566 == null) {
                                    field1637[var3++] = "";
                                } else {
                                    field1637[var3++] = var566;
                                }
                            }
                            continue;
                        }
                        if (var619 == 6705) {
                            var2 -= 2;
                            int var567 = field1635[var2];
                            int var568 = field1635[var2 + 1];
                            if (class333.field4511[var567] == null) {
                                field1635[var2++] = 0;
                            } else {
                                field1635[var2++] = class333.field4511[var567][var568].field5513;
                            }
                            continue;
                        }
                        if (var619 == 6706) {
                            continue;
                        }
                        if (var619 == 6707) {
                            var2 -= 3;
                            int var569 = field1635[var2];
                            int var570 = field1635[var2 + 1];
                            int var571 = field1635[var2 + 2];
                            class395.method2562(var571, var569 << 16 | var570, true, 1, "");
                            continue;
                        }
                        if (var619 == 6708) {
                            var2 -= 3;
                            int var572 = field1635[var2];
                            int var573 = field1635[var2 + 1];
                            int var574 = field1635[var2 + 2];
                            class395.method2562(var574, var572 << 16 | var573, true, 2, "");
                            continue;
                        }
                        if (var619 == 6709) {
                            var2 -= 3;
                            int var575 = field1635[var2];
                            int var576 = field1635[var2 + 1];
                            int var577 = field1635[var2 + 2];
                            class395.method2562(var577, var575 << 16 | var576, true, 3, "");
                            continue;
                        }
                        if (var619 == 6710) {
                            var2 -= 3;
                            int var578 = field1635[var2];
                            int var579 = field1635[var2 + 1];
                            int var580 = field1635[var2 + 2];
                            class395.method2562(var580, var578 << 16 | var579, true, 4, "");
                            continue;
                        }
                        if (var619 == 6711) {
                            var2 -= 3;
                            int var581 = field1635[var2];
                            int var582 = field1635[var2 + 1];
                            int var583 = field1635[var2 + 2];
                            class395.method2562(var583, var581 << 16 | var582, true, 5, "");
                            continue;
                        }
                        if (var619 == 6712) {
                            var2 -= 3;
                            int var584 = field1635[var2];
                            int var585 = field1635[var2 + 1];
                            int var586 = field1635[var2 + 2];
                            class395.method2562(var586, var584 << 16 | var585, true, 6, "");
                            continue;
                        }
                        if (var619 == 6713) {
                            var2 -= 3;
                            int var587 = field1635[var2];
                            int var588 = field1635[var2 + 1];
                            int var589 = field1635[var2 + 2];
                            class395.method2562(var589, var587 << 16 | var588, true, 7, "");
                            continue;
                        }
                        if (var619 == 6714) {
                            var2 -= 3;
                            int var590 = field1635[var2];
                            int var591 = field1635[var2 + 1];
                            int var592 = field1635[var2 + 2];
                            class395.method2562(var592, var590 << 16 | var591, true, 8, "");
                            continue;
                        }
                        if (var619 == 6715) {
                            var2 -= 3;
                            int var593 = field1635[var2];
                            int var594 = field1635[var2 + 1];
                            int var595 = field1635[var2 + 2];
                            class395.method2562(var595, var593 << 16 | var594, true, 9, "");
                            continue;
                        }
                        if (var619 == 6716) {
                            var2 -= 3;
                            int var596 = field1635[var2];
                            int var597 = field1635[var2 + 1];
                            int var598 = field1635[var2 + 2];
                            class395.method2562(var598, var596 << 16 | var597, true, 10, "");
                            continue;
                        }
                        if (var619 == 6717) {
                            var2 -= 3;
                            int var599 = field1635[var2];
                            int var600 = field1635[var2 + 1];
                            int var601 = field1635[var2 + 2];
                            class383 var602 = class315.method2010(var599 << 16 | var600, var601, -27590);
                            class378.method2471(63);
                            class265 var603 = client.method1119(var602);
                            class160.method1065(var599 << 16 | var600, var603.field3615, var602.field5522, var602.field5533, var601, 87, var603.method1642((byte) 28));
                            continue;
                        }
                    } else if (var619 < 6900) {
                        if (var619 == 6800) {
                            var2--;
                            int var604 = field1635[var2];
                            class46 var605 = class368.method2358(var604, 36);
                            if (var605.field711 == null) {
                                field1637[var3++] = "";
                            } else {
                                field1637[var3++] = var605.field711;
                            }
                            continue;
                        }
                        if (var619 == 6801) {
                            var2--;
                            int var606 = field1635[var2];
                            class46 var607 = class368.method2358(var606, 36);
                            field1635[var2++] = var607.field690;
                            continue;
                        }
                        if (var619 == 6802) {
                            var2--;
                            int var608 = field1635[var2];
                            class46 var609 = class368.method2358(var608, 36);
                            field1635[var2++] = var609.field708;
                            continue;
                        }
                        if (var619 == 6803) {
                            var2--;
                            int var610 = field1635[var2];
                            class46 var611 = class368.method2358(var610, 36);
                            field1635[var2++] = var611.field710;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var618) {
            if (arg0.field1297 == null) {
                StringBuffer var616 = new StringBuffer(30);
                var616.append("CS2: ").append(arg0.field5363).append(" ");
                for (int var617 = field1633 - 1; var617 >= 0; var617--) {
                    var616.append("v: ").append(field1625[var617].field1036.field5363).append(" ");
                }
                var616.append("op: ").append(var7);
                class184.method1214(124, var616.toString(), var618);
            } else {
                class141.method966((byte) 126, "Clientscript error in: " + arg0.field1297);
                StringBuffer var613 = new StringBuffer(30);
                var613.append("Clientscript error in: ").append(arg0.field1297).append("\n");
                for (int var614 = field1633 - 1; var614 >= 0; var614--) {
                    var613.append("via: ").append(field1625[var614].field1036.field1297).append("\n");
                }
                var613.append("Op: ").append(var7).append("\n");
                String var615 = var618.getMessage();
                if (var615 != null && var615.length() > 0) {
                    var613.append("Message: ").append(var615).append("\n");
                }
                class184.method1214(-112, var613.toString(), var618);
                class250.method1555(-124, var613.toString());
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
    public static void method742() {
        field1626 = null;
        field1631 = null;
        field1623 = null;
        field1617 = null;
        field1635 = null;
        field1637 = null;
        field1625 = null;
        field1629 = null;
        field1638 = null;
        field1619 = null;
        field1627 = null;
        field1641 = null;
        field1639 = null;
        field1640 = null;
    }
}
