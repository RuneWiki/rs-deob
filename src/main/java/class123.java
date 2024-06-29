import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class123 {

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "[I")
    private static int[] field1697 = new int[5];

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "[Lkc;")
    private static class435[] field1696 = new class435[50];

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "[[I")
    private static int[][] field1700 = new int[5][5000];

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field1710 = new String[1000];

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    private static int field1705 = 0;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "[I")
    private static int[] field1715 = new int[1000];

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1714 = Calendar.getInstance();

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "[I")
    private static int[] field1719 = new int[3];

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field1717 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "Lcr;")
    public static class189 field1718 = new class189(4);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Lps;")
    private static class394 field1702;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "Lps;")
    private static class394 field1709;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "Llj;")
    private static class41 field1712;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "[I")
    private static int[] field1711;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "[Ljava/lang/String;")
    private static String[] field1706;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "()V")
    public static void method780() {
        field1711 = null;
        field1706 = null;
        field1697 = null;
        field1700 = null;
        field1715 = null;
        field1710 = null;
        field1696 = null;
        field1709 = null;
        field1702 = null;
        field1712 = null;
        field1714 = null;
        field1717 = null;
        field1719 = null;
        field1718 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lep;I)V")
    private static final void method781(class145 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field1996;
        int[] var6 = arg0.field1995;
        byte var7 = -1;
        field1705 = 0;
        try {
            int var8 = 0;
            label4416: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var609 = var5[var4];
                if (var609 < 100) {
                    if (var609 == 0) {
                        field1715[var2++] = var6[var4];
                        continue;
                    }
                    if (var609 == 1) {
                        int var9 = var6[var4];
                        field1715[var2++] = class191.field2561[var9];
                        continue;
                    }
                    if (var609 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class171.method1063(field1715[var2], var10, (byte) 95);
                        continue;
                    }
                    if (var609 == 3) {
                        field1710[var3++] = arg0.field1993[var4];
                        continue;
                    }
                    if (var609 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var609 == 7) {
                        var2 -= 2;
                        if (field1715[var2 + 1] != field1715[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 8) {
                        var2 -= 2;
                        if (field1715[var2 + 1] == field1715[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 9) {
                        var2 -= 2;
                        if (field1715[var2] < field1715[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 10) {
                        var2 -= 2;
                        if (field1715[var2] > field1715[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 21) {
                        if (field1705 == 0) {
                            return;
                        }
                        class435 var11 = field1696[--field1705];
                        arg0 = var11.field6391;
                        var5 = arg0.field1996;
                        var6 = arg0.field1995;
                        var4 = var11.field6392;
                        field1711 = var11.field6393;
                        field1706 = var11.field6394;
                        continue;
                    }
                    if (var609 == 25) {
                        int var12 = var6[var4];
                        field1715[var2++] = class317.method2138(65536, var12);
                        continue;
                    }
                    if (var609 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class162.method1008(-114, field1715[var2], var13);
                        continue;
                    }
                    if (var609 == 31) {
                        var2 -= 2;
                        if (field1715[var2] <= field1715[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 32) {
                        var2 -= 2;
                        if (field1715[var2] >= field1715[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 33) {
                        field1715[var2++] = field1711[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var609 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field1711[var10001] = field1715[var2];
                        continue;
                    }
                    if (var609 == 35) {
                        field1710[var3++] = field1706[var6[var4]];
                        continue;
                    }
                    if (var609 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field1706[var10001] = field1710[var3];
                        continue;
                    }
                    if (var609 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class38.method274(field1710, var14, -1, var3);
                        field1710[var3++] = var15;
                        continue;
                    }
                    if (var609 == 38) {
                        var2--;
                        continue;
                    }
                    if (var609 == 39) {
                        var3--;
                        continue;
                    }
                    if (var609 == 40) {
                        int var16 = var6[var4];
                        class145 var17 = class390.method2509(0, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field1986];
                        String[] var19 = new String[var17.field1994];
                        for (int var20 = 0; var20 < var17.field1991; var20++) {
                            var18[var20] = field1715[var2 + var20 - var17.field1991];
                        }
                        for (int var21 = 0; var21 < var17.field1987; var21++) {
                            var19[var21] = field1710[var3 + var21 - var17.field1987];
                        }
                        var2 -= var17.field1991;
                        var3 -= var17.field1987;
                        class435 var22 = new class435();
                        var22.field6391 = arg0;
                        var22.field6392 = var4;
                        var22.field6393 = field1711;
                        var22.field6394 = field1706;
                        if (field1705 >= field1696.length) {
                            throw new RuntimeException();
                        }
                        field1696[field1705++] = var22;
                        arg0 = var17;
                        var5 = var17.field1996;
                        var6 = var17.field1995;
                        var4 = -1;
                        field1711 = var18;
                        field1706 = var19;
                        continue;
                    }
                    if (var609 == 42) {
                        field1715[var2++] = class43.field594[var6[var4]];
                        continue;
                    }
                    if (var609 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class43.field594[var23] = field1715[var2];
                        class92.method644(1, var23);
                        class257.field3768 |= class63.field842[var23];
                        continue;
                    }
                    if (var609 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field1715[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field1697[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4416;
                                }
                                field1700[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var609 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field1715[var2];
                        if (var30 >= 0 && var30 < field1697[var29]) {
                            field1715[var2++] = field1700[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var609 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field1715[var2];
                        if (var32 >= 0 && var32 < field1697[var31]) {
                            field1700[var31][var32] = field1715[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var609 == 47) {
                        String var33 = class283.field4125[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field1710[var3++] = var33;
                        continue;
                    }
                    if (var609 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class283.field4125[var34] = field1710[var3];
                        class84.method607(false, var34);
                        continue;
                    }
                    if (var609 == 51) {
                        class56 var35 = arg0.field1989[var6[var4]];
                        var2--;
                        class279 var36 = (class279) var35.method384((long) field1715[var2], true);
                        if (var36 != null) {
                            var4 += var36.field4054;
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
                if (var609 < 300) {
                    if (var609 == 100) {
                        var2 -= 3;
                        int var38 = field1715[var2];
                        int var39 = field1715[var2 + 1];
                        int var40 = field1715[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class394 var41 = class196.method1168((byte) -123, var38);
                        if (var41.field5820 == null) {
                            var41.field5820 = new class394[var40 + 1];
                        }
                        if (var41.field5820.length <= var40) {
                            class394[] var42 = new class394[var40 + 1];
                            for (int var43 = 0; var43 < var41.field5820.length; var43++) {
                                var42[var43] = var41.field5820[var43];
                            }
                            var41.field5820 = var42;
                        }
                        if (var40 > 0 && var41.field5820[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class394 var44 = new class394();
                        var44.field5671 = var39;
                        var44.field5639 = var44.field5698 = var41.field5698;
                        var44.field5649 = var40;
                        var44.field5790 = true;
                        var41.field5820[var40] = var44;
                        if (var37) {
                            field1702 = var44;
                        } else {
                            field1709 = var44;
                        }
                        class407.method2621(var41, 15);
                        continue;
                    }
                    if (var609 == 101) {
                        class394 var45 = var37 ? field1702 : field1709;
                        if (var45.field5649 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class394 var46 = class196.method1168((byte) -91, var45.field5698);
                        var46.field5820[var45.field5649] = null;
                        class407.method2621(var46, 15);
                        continue;
                    }
                    if (var609 == 102) {
                        var2--;
                        class394 var47 = class196.method1168((byte) -114, field1715[var2]);
                        var47.field5820 = null;
                        class407.method2621(var47, 15);
                        continue;
                    }
                    if (var609 == 200) {
                        var2 -= 2;
                        int var48 = field1715[var2];
                        int var49 = field1715[var2 + 1];
                        class394 var50 = class388.method2492((byte) 72, var49, var48);
                        if (var50 != null && var49 != -1) {
                            field1715[var2++] = 1;
                            if (var37) {
                                field1702 = var50;
                            } else {
                                field1709 = var50;
                            }
                            continue;
                        }
                        field1715[var2++] = 0;
                        continue;
                    }
                    if (var609 == 201) {
                        var2--;
                        int var51 = field1715[var2];
                        class394 var52 = class196.method1168((byte) -86, var51);
                        if (var52 == null) {
                            field1715[var2++] = 0;
                        } else {
                            field1715[var2++] = 1;
                            if (var37) {
                                field1702 = var52;
                            } else {
                                field1709 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var609 < 500) {
                    if (var609 == 403) {
                        var2 -= 2;
                        int var53 = field1715[var2];
                        int var54 = field1715[var2 + 1];
                        for (int var55 = 0; var55 < class395.field5838.length; var55++) {
                            if (class395.field5838[var55] == var53) {
                                class227.field2988.field341.method2030(101, var54, var55);
                                continue label4416;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class45.field638.length) {
                                continue label4416;
                            }
                            if (class45.field638[var56] == var53) {
                                class227.field2988.field341.method2030(-79, var54, var56);
                                continue label4416;
                            }
                            var56++;
                        }
                    }
                    if (var609 == 404) {
                        var2 -= 2;
                        int var57 = field1715[var2];
                        int var58 = field1715[var2 + 1];
                        class227.field2988.field341.method2032(var57, var58, (byte) -74);
                        continue;
                    }
                    if (var609 == 410) {
                        var2--;
                        boolean var59 = field1715[var2] != 0;
                        class227.field2988.field341.method2028(512, var59);
                        continue;
                    }
                } else if (!(var609 < 1000 || var609 >= 1100) || !(var609 < 2000 || var609 >= 2100)) {
                    class394 var60;
                    if (var609 >= 2000) {
                        var609 -= 1000;
                        var2--;
                        var60 = class196.method1168((byte) -87, field1715[var2]);
                    } else {
                        var60 = var37 ? field1702 : field1709;
                    }
                    if (var609 == 1000) {
                        var2 -= 4;
                        var60.field5712 = field1715[var2];
                        var60.field5696 = field1715[var2 + 1];
                        int var61 = field1715[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field1715[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field5753 = (byte) var61;
                        var60.field5793 = (byte) var62;
                        class407.method2621(var60, 15);
                        class110.method724(var60, 83);
                        if (var60.field5649 == -1) {
                            class310.method2109(var60.field5698, (byte) -117);
                        }
                        continue;
                    }
                    if (var609 == 1001) {
                        var2 -= 4;
                        var60.field5813 = field1715[var2];
                        var60.field5670 = field1715[var2 + 1];
                        var60.field5644 = 0;
                        var60.field5782 = 0;
                        int var63 = field1715[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field1715[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field5725 = (byte) var63;
                        var60.field5719 = (byte) var64;
                        class407.method2621(var60, 15);
                        class110.method724(var60, 46);
                        if (var60.field5671 == 0) {
                            class235.method1409(var60, false, (byte) -110);
                        }
                        continue;
                    }
                    if (var609 == 1003) {
                        var2--;
                        boolean var65 = field1715[var2] == 1;
                        if (var60.field5798 != var65) {
                            var60.field5798 = var65;
                            class407.method2621(var60, 15);
                        }
                        if (var60.field5649 == -1) {
                            class386.method2483(7, var60.field5698);
                        }
                        continue;
                    }
                    if (var609 == 1004) {
                        var2 -= 2;
                        var60.field5655 = field1715[var2];
                        var60.field5740 = field1715[var2 + 1];
                        class407.method2621(var60, 15);
                        class110.method724(var60, 103);
                        if (var60.field5671 == 0) {
                            class235.method1409(var60, false, (byte) -110);
                        }
                        continue;
                    }
                    if (var609 == 1005) {
                        var2--;
                        var60.field5718 = field1715[var2] == 1;
                        continue;
                    }
                } else if (var609 >= 1100 && var609 < 1200 || var609 >= 2100 && var609 < 2200) {
                    class394 var66;
                    if (var609 >= 2000) {
                        var609 -= 1000;
                        var2--;
                        var66 = class196.method1168((byte) -102, field1715[var2]);
                    } else {
                        var66 = var37 ? field1702 : field1709;
                    }
                    if (var609 == 1100) {
                        var2 -= 2;
                        var66.field5742 = field1715[var2];
                        if (var66.field5742 > var66.field5657 - var66.field5773) {
                            var66.field5742 = var66.field5657 - var66.field5773;
                        }
                        if (var66.field5742 < 0) {
                            var66.field5742 = 0;
                        }
                        var66.field5764 = field1715[var2 + 1];
                        if (var66.field5764 > var66.field5771 - var66.field5672) {
                            var66.field5764 = var66.field5771 - var66.field5672;
                        }
                        if (var66.field5764 < 0) {
                            var66.field5764 = 0;
                        }
                        class407.method2621(var66, 15);
                        if (var66.field5649 == -1) {
                            class8.method67(var66.field5698, -52);
                        }
                        continue;
                    }
                    if (var609 == 1101) {
                        var2--;
                        var66.field5699 = field1715[var2];
                        class407.method2621(var66, 15);
                        if (var66.field5649 == -1) {
                            class126.method800(var66.field5698, 123);
                        }
                        continue;
                    }
                    if (var609 == 1102) {
                        var2--;
                        var66.field5755 = field1715[var2] == 1;
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1103) {
                        var2--;
                        var66.field5705 = field1715[var2];
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1104) {
                        var2--;
                        var66.field5762 = field1715[var2];
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1105) {
                        var2--;
                        int var67 = field1715[var2];
                        if (var66.field5693 != var67) {
                            var66.field5693 = var67;
                            class407.method2621(var66, 15);
                        }
                        if (var66.field5649 == -1) {
                            class134.method842(var66.field5698, -25113);
                        }
                        continue;
                    }
                    if (var609 == 1106) {
                        var2--;
                        var66.field5676 = field1715[var2];
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1107) {
                        var2--;
                        var66.field5722 = field1715[var2] == 1;
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1108) {
                        var66.field5749 = 1;
                        var2--;
                        var66.field5756 = field1715[var2];
                        class407.method2621(var66, 15);
                        if (var66.field5649 == -1) {
                            class233.method1393((byte) -116, var66.field5698);
                        }
                        continue;
                    }
                    if (var609 == 1109) {
                        var2 -= 6;
                        var66.field5732 = field1715[var2];
                        var66.field5720 = field1715[var2 + 1];
                        var66.field5666 = field1715[var2 + 2];
                        var66.field5795 = field1715[var2 + 3];
                        var66.field5694 = field1715[var2 + 4];
                        var66.field5659 = field1715[var2 + 5];
                        class407.method2621(var66, 15);
                        if (var66.field5649 == -1) {
                            class165.method1016(81, var66.field5698);
                            class191.method1151(var66.field5698, 0);
                        }
                        continue;
                    }
                    if (var609 == 1110) {
                        var2--;
                        int var68 = field1715[var2];
                        if (var66.field5643 != var68) {
                            var66.field5643 = var68;
                            var66.field5727 = 0;
                            var66.field5703 = 1;
                            var66.field5645 = 0;
                            class407.method2621(var66, 15);
                        }
                        if (var66.field5649 == -1) {
                            class8.method64(var66.field5698, (byte) 79);
                        }
                        continue;
                    }
                    if (var609 == 1111) {
                        var2--;
                        var66.field5638 = field1715[var2] == 1;
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1112) {
                        var3--;
                        String var69 = field1710[var3];
                        if (!var69.equals(var66.field5775)) {
                            var66.field5775 = var69;
                            class407.method2621(var66, 15);
                        }
                        if (var66.field5649 == -1) {
                            class148.method940(var66.field5698, true);
                        }
                        continue;
                    }
                    if (var609 == 1113) {
                        var2--;
                        var66.field5766 = field1715[var2];
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1114) {
                        var2 -= 3;
                        var66.field5800 = field1715[var2];
                        var66.field5690 = field1715[var2 + 1];
                        var66.field5770 = field1715[var2 + 2];
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1115) {
                        var2--;
                        var66.field5658 = field1715[var2] == 1;
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1116) {
                        var2--;
                        var66.field5733 = field1715[var2];
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1117) {
                        var2--;
                        var66.field5737 = field1715[var2];
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1118) {
                        var2--;
                        var66.field5692 = field1715[var2] == 1;
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1119) {
                        var2--;
                        var66.field5713 = field1715[var2] == 1;
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1120) {
                        var2 -= 2;
                        var66.field5657 = field1715[var2];
                        var66.field5771 = field1715[var2 + 1];
                        class407.method2621(var66, 15);
                        if (var66.field5671 == 0) {
                            class235.method1409(var66, false, (byte) -110);
                        }
                        continue;
                    }
                    if (var609 == 1121) {
                        var2 -= 2;
                        var66.field5731 = (short) field1715[var2];
                        var66.field5680 = (short) field1715[var2 + 1];
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1122) {
                        var2--;
                        var66.field5799 = field1715[var2] == 1;
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1123) {
                        var2--;
                        var66.field5659 = field1715[var2];
                        class407.method2621(var66, 15);
                        if (var66.field5649 == -1) {
                            class165.method1016(125, var66.field5698);
                        }
                        continue;
                    }
                    if (var609 == 1124) {
                        var2--;
                        int var70 = field1715[var2];
                        var66.field5728 = var70 == 1;
                        class407.method2621(var66, 15);
                        continue;
                    }
                    if (var609 == 1125) {
                        var2 -= 2;
                        var66.field5704 = field1715[var2];
                        var66.field5715 = field1715[var2 + 1];
                        class407.method2621(var66, 15);
                        continue;
                    }
                } else if (!(var609 < 1200 || var609 >= 1300) || !(var609 < 2200 || var609 >= 2300)) {
                    class394 var71;
                    if (var609 >= 2000) {
                        var609 -= 1000;
                        var2--;
                        var71 = class196.method1168((byte) -101, field1715[var2]);
                    } else {
                        var71 = var37 ? field1702 : field1709;
                    }
                    class407.method2621(var71, 15);
                    if (var609 == 1200 || var609 == 1205 || var609 == 1208 || var609 == 1209 || var609 == 1212 || var609 == 1213) {
                        var2 -= 2;
                        int var72 = field1715[var2];
                        int var73 = field1715[var2 + 1];
                        if (var71.field5649 == -1) {
                            class422.method2698(var71.field5698, -28239);
                            class165.method1016(115, var71.field5698);
                            class191.method1151(var71.field5698, 0);
                        }
                        if (var72 == -1) {
                            var71.field5749 = 1;
                            var71.field5756 = -1;
                            var71.field5650 = -1;
                            continue;
                        }
                        var71.field5650 = var72;
                        var71.field5810 = var73;
                        if (var609 == 1208 || var609 == 1209) {
                            var71.field5735 = true;
                        } else {
                            var71.field5735 = false;
                        }
                        class83 var74 = class9.method74(var72, (byte) 125);
                        var71.field5666 = var74.field1155;
                        var71.field5795 = var74.field1125;
                        var71.field5694 = var74.field1131;
                        var71.field5732 = var74.field1146;
                        var71.field5720 = var74.field1198;
                        var71.field5659 = var74.field1170;
                        if (var609 == 1205 || var609 == 1209) {
                            var71.field5640 = 0;
                        } else if (var609 == 1212 || var609 == 1213) {
                            var71.field5640 = 1;
                        } else {
                            var71.field5640 = 2;
                        }
                        if (var71.field5644 > 0) {
                            var71.field5659 = var71.field5659 * 32 / var71.field5644;
                        } else if (var71.field5813 > 0) {
                            var71.field5659 = var71.field5659 * 32 / var71.field5813;
                        }
                        continue;
                    }
                    if (var609 == 1201) {
                        var71.field5749 = 2;
                        var2--;
                        var71.field5756 = field1715[var2];
                        if (var71.field5649 == -1) {
                            class233.method1393((byte) -126, var71.field5698);
                        }
                        continue;
                    }
                    if (var609 == 1202) {
                        var71.field5749 = 3;
                        var71.field5756 = -1;
                        if (var71.field5649 == -1) {
                            class233.method1393((byte) -117, var71.field5698);
                        }
                        continue;
                    }
                    if (var609 == 1203) {
                        var71.field5749 = 6;
                        var2--;
                        var71.field5756 = field1715[var2];
                        if (var71.field5649 == -1) {
                            class233.method1393((byte) -123, var71.field5698);
                        }
                        continue;
                    }
                    if (var609 == 1204) {
                        var71.field5749 = 5;
                        var2--;
                        var71.field5756 = field1715[var2];
                        if (var71.field5649 == -1) {
                            class233.method1393((byte) -115, var71.field5698);
                        }
                        continue;
                    }
                    if (var609 == 1206) {
                        var2 -= 4;
                        var71.field5723 = field1715[var2];
                        var71.field5809 = field1715[var2 + 1];
                        var71.field5651 = field1715[var2 + 2];
                        var71.field5816 = field1715[var2 + 3];
                        class407.method2621(var71, 15);
                        continue;
                    }
                    if (var609 == 1207) {
                        var2 -= 2;
                        var71.field5783 = field1715[var2];
                        var71.field5817 = field1715[var2 + 1];
                        class407.method2621(var71, 15);
                        continue;
                    }
                    if (var609 == 1210) {
                        var2 -= 4;
                        var71.field5756 = field1715[var2];
                        var71.field5683 = field1715[var2 + 1];
                        if (field1715[var2 + 2] == 1) {
                            var71.field5749 = 9;
                        } else {
                            var71.field5749 = 8;
                        }
                        if (field1715[var2 + 3] == 1) {
                            var71.field5735 = true;
                        } else {
                            var71.field5735 = false;
                        }
                        if (var71.field5649 == -1) {
                            class233.method1393((byte) -118, var71.field5698);
                        }
                        continue;
                    }
                    if (var609 == 1211) {
                        var71.field5749 = 5;
                        var71.field5756 = 2047;
                        var71.field5683 = 0;
                        if (var71.field5649 == -1) {
                            class233.method1393((byte) -123, var71.field5698);
                        }
                        continue;
                    }
                } else if (var609 >= 1300 && var609 < 1400 || var609 >= 2300 && var609 < 2400) {
                    class394 var75;
                    if (var609 >= 2000) {
                        var609 -= 1000;
                        var2--;
                        var75 = class196.method1168((byte) -114, field1715[var2]);
                    } else {
                        var75 = var37 ? field1702 : field1709;
                    }
                    if (var609 == 1300) {
                        var2--;
                        int var76 = field1715[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method2527(56, var76, field1710[var3]);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var609 == 1301) {
                        var2 -= 2;
                        int var77 = field1715[var2];
                        int var78 = field1715[var2 + 1];
                        var75.field5667 = class388.method2492((byte) 41, var78, var77);
                        continue;
                    }
                    if (var609 == 1302) {
                        var2--;
                        var75.field5819 = field1715[var2] == 1;
                        continue;
                    }
                    if (var609 == 1303) {
                        var2--;
                        var75.field5765 = field1715[var2];
                        continue;
                    }
                    if (var609 == 1304) {
                        var2--;
                        var75.field5807 = field1715[var2];
                        continue;
                    }
                    if (var609 == 1305) {
                        var3--;
                        var75.field5687 = field1710[var3];
                        continue;
                    }
                    if (var609 == 1306) {
                        var3--;
                        var75.field5700 = field1710[var3];
                        continue;
                    }
                    if (var609 == 1307) {
                        var75.field5669 = null;
                        continue;
                    }
                    if (var609 == 1308) {
                        var2--;
                        var75.field5716 = field1715[var2];
                        var2--;
                        var75.field5748 = field1715[var2];
                        continue;
                    }
                    if (var609 == 1309) {
                        var2--;
                        int var79 = field1715[var2];
                        var2--;
                        int var80 = field1715[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method2532((byte) -122, var80 - 1, var79);
                        }
                        continue;
                    }
                    if (var609 == 1310) {
                        var3--;
                        var75.field5681 = field1710[var3];
                        continue;
                    }
                } else {
                    if (var609 >= 1400 && var609 < 1500 || var609 >= 2400 && var609 < 2500) {
                        class394 var81;
                        if (var609 >= 2000) {
                            var609 -= 1000;
                            var2--;
                            var81 = class196.method1168((byte) -117, field1715[var2]);
                        } else {
                            var81 = var37 ? field1702 : field1709;
                        }
                        var3--;
                        String var82 = field1710[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field1715[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field1715[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field1710[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field1715[var2]);
                            }
                        }
                        var2--;
                        int var87 = field1715[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var609 == 1400) {
                            var81.field5678 = var85;
                        } else if (var609 == 1401) {
                            var81.field5697 = var85;
                        } else if (var609 == 1402) {
                            var81.field5801 = var85;
                        } else if (var609 == 1403) {
                            var81.field5787 = var85;
                        } else if (var609 == 1404) {
                            var81.field5791 = var85;
                        } else if (var609 == 1405) {
                            var81.field5661 = var85;
                        } else if (var609 == 1406) {
                            var81.field5746 = var85;
                        } else if (var609 == 1407) {
                            var81.field5714 = var85;
                            var81.field5648 = var83;
                        } else if (var609 == 1408) {
                            var81.field5786 = var85;
                        } else if (var609 == 1409) {
                            var81.field5760 = var85;
                        } else if (var609 == 1410) {
                            var81.field5747 = var85;
                        } else if (var609 == 1411) {
                            var81.field5664 = var85;
                        } else if (var609 == 1412) {
                            var81.field5686 = var85;
                        } else if (var609 == 1414) {
                            var81.field5695 = var85;
                            var81.field5652 = var83;
                        } else if (var609 == 1415) {
                            var81.field5734 = var85;
                            var81.field5780 = var83;
                        } else if (var609 == 1416) {
                            var81.field5642 = var85;
                        } else if (var609 == 1417) {
                            var81.field5781 = var85;
                        } else if (var609 == 1418) {
                            var81.field5768 = var85;
                        } else if (var609 == 1419) {
                            var81.field5738 = var85;
                        } else if (var609 == 1420) {
                            var81.field5814 = var85;
                        } else if (var609 == 1421) {
                            var81.field5815 = var85;
                        } else if (var609 == 1422) {
                            var81.field5684 = var85;
                        } else if (var609 == 1423) {
                            var81.field5730 = var85;
                        } else if (var609 == 1424) {
                            var81.field5736 = var85;
                        } else if (var609 == 1425) {
                            var81.field5677 = var85;
                        } else if (var609 == 1426) {
                            var81.field5792 = var85;
                        } else if (var609 == 1427) {
                            var81.field5818 = var85;
                        } else if (var609 == 1428) {
                            var81.field5778 = var85;
                            var81.field5656 = var83;
                        } else if (var609 == 1429) {
                            var81.field5743 = var85;
                            var81.field5797 = var83;
                        }
                        var81.field5772 = true;
                        continue;
                    }
                    if (var609 < 1600) {
                        class394 var88 = var37 ? field1702 : field1709;
                        if (var609 == 1500) {
                            field1715[var2++] = var88.field5821;
                            continue;
                        }
                        if (var609 == 1501) {
                            field1715[var2++] = var88.field5779;
                            continue;
                        }
                        if (var609 == 1502) {
                            field1715[var2++] = var88.field5773;
                            continue;
                        }
                        if (var609 == 1503) {
                            field1715[var2++] = var88.field5672;
                            continue;
                        }
                        if (var609 == 1504) {
                            field1715[var2++] = var88.field5798 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 1505) {
                            field1715[var2++] = var88.field5639;
                            continue;
                        }
                    } else if (var609 < 1700) {
                        class394 var89 = var37 ? field1702 : field1709;
                        if (var609 == 1600) {
                            field1715[var2++] = var89.field5742;
                            continue;
                        }
                        if (var609 == 1601) {
                            field1715[var2++] = var89.field5764;
                            continue;
                        }
                        if (var609 == 1602) {
                            field1710[var3++] = var89.field5775;
                            continue;
                        }
                        if (var609 == 1603) {
                            field1715[var2++] = var89.field5657;
                            continue;
                        }
                        if (var609 == 1604) {
                            field1715[var2++] = var89.field5771;
                            continue;
                        }
                        if (var609 == 1605) {
                            field1715[var2++] = var89.field5659;
                            continue;
                        }
                        if (var609 == 1606) {
                            field1715[var2++] = var89.field5666;
                            continue;
                        }
                        if (var609 == 1607) {
                            field1715[var2++] = var89.field5694;
                            continue;
                        }
                        if (var609 == 1608) {
                            field1715[var2++] = var89.field5795;
                            continue;
                        }
                        if (var609 == 1609) {
                            field1715[var2++] = var89.field5705;
                            continue;
                        }
                        if (var609 == 1610) {
                            field1715[var2++] = var89.field5732;
                            continue;
                        }
                        if (var609 == 1611) {
                            field1715[var2++] = var89.field5720;
                            continue;
                        }
                        if (var609 == 1612) {
                            field1715[var2++] = var89.field5693;
                            continue;
                        }
                    } else if (var609 < 1800) {
                        class394 var90 = var37 ? field1702 : field1709;
                        if (var609 == 1700) {
                            field1715[var2++] = var90.field5650;
                            continue;
                        }
                        if (var609 == 1701) {
                            if (var90.field5650 == -1) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var90.field5810;
                            }
                            continue;
                        }
                        if (var609 == 1702) {
                            field1715[var2++] = var90.field5649;
                            continue;
                        }
                    } else if (var609 < 1900) {
                        class394 var91 = var37 ? field1702 : field1709;
                        if (var609 == 1800) {
                            field1715[var2++] = client.method1544(var91).method2066((byte) -123);
                            continue;
                        }
                        if (var609 == 1801) {
                            var2--;
                            int var92 = field1715[var2];
                            int var610 = var92 - 1;
                            if (var91.field5669 != null && var610 < var91.field5669.length && var91.field5669[var610] != null) {
                                field1710[var3++] = var91.field5669[var610];
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 1802) {
                            if (var91.field5687 == null) {
                                field1710[var3++] = "";
                            } else {
                                field1710[var3++] = var91.field5687;
                            }
                            continue;
                        }
                    } else if (var609 < 2600) {
                        var2--;
                        class394 var93 = class196.method1168((byte) -88, field1715[var2]);
                        if (var609 == 2500) {
                            field1715[var2++] = var93.field5821;
                            continue;
                        }
                        if (var609 == 2501) {
                            field1715[var2++] = var93.field5779;
                            continue;
                        }
                        if (var609 == 2502) {
                            field1715[var2++] = var93.field5773;
                            continue;
                        }
                        if (var609 == 2503) {
                            field1715[var2++] = var93.field5672;
                            continue;
                        }
                        if (var609 == 2504) {
                            field1715[var2++] = var93.field5798 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 2505) {
                            field1715[var2++] = var93.field5639;
                            continue;
                        }
                    } else if (var609 < 2700) {
                        var2--;
                        class394 var94 = class196.method1168((byte) -86, field1715[var2]);
                        if (var609 == 2600) {
                            field1715[var2++] = var94.field5742;
                            continue;
                        }
                        if (var609 == 2601) {
                            field1715[var2++] = var94.field5764;
                            continue;
                        }
                        if (var609 == 2602) {
                            field1710[var3++] = var94.field5775;
                            continue;
                        }
                        if (var609 == 2603) {
                            field1715[var2++] = var94.field5657;
                            continue;
                        }
                        if (var609 == 2604) {
                            field1715[var2++] = var94.field5771;
                            continue;
                        }
                        if (var609 == 2605) {
                            field1715[var2++] = var94.field5659;
                            continue;
                        }
                        if (var609 == 2606) {
                            field1715[var2++] = var94.field5666;
                            continue;
                        }
                        if (var609 == 2607) {
                            field1715[var2++] = var94.field5694;
                            continue;
                        }
                        if (var609 == 2608) {
                            field1715[var2++] = var94.field5795;
                            continue;
                        }
                        if (var609 == 2609) {
                            field1715[var2++] = var94.field5705;
                            continue;
                        }
                        if (var609 == 2610) {
                            field1715[var2++] = var94.field5732;
                            continue;
                        }
                        if (var609 == 2611) {
                            field1715[var2++] = var94.field5720;
                            continue;
                        }
                        if (var609 == 2612) {
                            field1715[var2++] = var94.field5693;
                            continue;
                        }
                    } else if (var609 < 2800) {
                        if (var609 == 2700) {
                            var2--;
                            class394 var95 = class196.method1168((byte) -107, field1715[var2]);
                            field1715[var2++] = var95.field5650;
                            continue;
                        }
                        if (var609 == 2701) {
                            var2--;
                            class394 var96 = class196.method1168((byte) -123, field1715[var2]);
                            if (var96.field5650 == -1) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var96.field5810;
                            }
                            continue;
                        }
                        if (var609 == 2702) {
                            var2--;
                            int var97 = field1715[var2];
                            class169 var98 = (class169) class99.field1377.method384((long) var97, true);
                            if (var98 == null) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = 1;
                            }
                            continue;
                        }
                        if (var609 == 2703) {
                            var2--;
                            class394 var99 = class196.method1168((byte) -94, field1715[var2]);
                            if (var99.field5820 == null) {
                                field1715[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field5820.length;
                            for (int var101 = 0; var101 < var99.field5820.length; var101++) {
                                if (var99.field5820[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field1715[var2++] = var100;
                            continue;
                        }
                        if (var609 == 2704 || var609 == 2705) {
                            var2 -= 2;
                            int var102 = field1715[var2];
                            int var103 = field1715[var2 + 1];
                            class169 var104 = (class169) class99.field1377.method384((long) var102, true);
                            if (var104 != null && var104.field2275 == var103) {
                                field1715[var2++] = 1;
                            } else {
                                field1715[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var609 < 2900) {
                        var2--;
                        class394 var105 = class196.method1168((byte) -110, field1715[var2]);
                        if (var609 == 2800) {
                            field1715[var2++] = client.method1544(var105).method2066((byte) -122);
                            continue;
                        }
                        if (var609 == 2801) {
                            var2--;
                            int var106 = field1715[var2];
                            int var611 = var106 - 1;
                            if (var105.field5669 != null && var611 < var105.field5669.length && var105.field5669[var611] != null) {
                                field1710[var3++] = var105.field5669[var611];
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 2802) {
                            if (var105.field5687 == null) {
                                field1710[var3++] = "";
                            } else {
                                field1710[var3++] = var105.field5687;
                            }
                            continue;
                        }
                    } else if (var609 < 3200) {
                        if (var609 == 3100) {
                            var3--;
                            String var107 = field1710[var3];
                            class197.method1175(0, var107);
                            continue;
                        }
                        if (var609 == 3101) {
                            var2 -= 2;
                            class295.method2017(class227.field2988, field1715[var2], 32768, field1715[var2 + 1]);
                            continue;
                        }
                        if (var609 == 3103) {
                            class230.method1383((byte) -58, true);
                            continue;
                        }
                        if (var609 == 3104) {
                            var3--;
                            String var108 = field1710[var3];
                            int var109 = 0;
                            if (class43.method311(70, var108)) {
                                var109 = class351.method2312(-1035, var108);
                            }
                            field1707++;
                            class185.field2507.method5(-6445, 64);
                            class185.field2507.method1330(var109, -95);
                            continue;
                        }
                        if (var609 == 3105) {
                            var3--;
                            String var110 = field1710[var3];
                            field1698++;
                            class185.field2507.method5(-6445, 212);
                            class185.field2507.method1346(var110.length() + 1, 32767);
                            class185.field2507.method1380(65280, var110);
                            continue;
                        }
                        if (var609 == 3106) {
                            var3--;
                            String var111 = field1710[var3];
                            field1708++;
                            class185.field2507.method5(-6445, 194);
                            class185.field2507.method1346(var111.length() + 1, 32767);
                            class185.field2507.method1380(65280, var111);
                            continue;
                        }
                        if (var609 == 3107) {
                            var2--;
                            int var112 = field1715[var2];
                            var3--;
                            String var113 = field1710[var3];
                            class163.method1011(var112, var113, 7);
                            continue;
                        }
                        if (var609 == 3108) {
                            var2 -= 3;
                            int var114 = field1715[var2];
                            int var115 = field1715[var2 + 1];
                            int var116 = field1715[var2 + 2];
                            class394 var117 = class196.method1168((byte) -86, var116);
                            class333.method2200(var117, 872, var115, var114);
                            continue;
                        }
                        if (var609 == 3109) {
                            var2 -= 2;
                            int var118 = field1715[var2];
                            int var119 = field1715[var2 + 1];
                            class394 var120 = var37 ? field1702 : field1709;
                            class333.method2200(var120, 872, var119, var118);
                            continue;
                        }
                        if (var609 == 3110) {
                            var2--;
                            int var121 = field1715[var2];
                            field1694++;
                            class185.field2507.method5(-6445, 222);
                            class185.field2507.method1326(var121, -124);
                            continue;
                        }
                        if (var609 == 3111) {
                            var2 -= 2;
                            int var122 = field1715[var2];
                            int var123 = field1715[var2 + 1];
                            class169 var124 = (class169) class99.field1377.method384((long) var122, true);
                            if (var124 != null) {
                                class271.method1864(true, true, var124.field2275 != var123, var124);
                            }
                            class124.method791(3, var123, true, false, var122);
                            continue;
                        }
                        if (var609 == 3112) {
                            var2--;
                            int var125 = field1715[var2];
                            class169 var126 = (class169) class99.field1377.method384((long) var125, true);
                            if (var126 != null && var126.field2276 == 3) {
                                class271.method1864(true, true, true, var126);
                            }
                            continue;
                        }
                    } else if (var609 < 3300) {
                        if (var609 == 3200) {
                            var2 -= 3;
                            class403.method2603((byte) -126, field1715[var2 + 2], field1715[var2], field1715[var2 + 1], 255);
                            continue;
                        }
                        if (var609 == 3201) {
                            var2--;
                            class312.method2112(255, (byte) -21, field1715[var2]);
                            continue;
                        }
                        if (var609 == 3202) {
                            var2 -= 2;
                            class254.method1553(255, field1715[var2 + 1], false, field1715[var2]);
                            continue;
                        }
                    } else if (var609 < 3400) {
                        if (var609 == 3300) {
                            field1715[var2++] = class28.field418;
                            continue;
                        }
                        if (var609 == 3301) {
                            var2 -= 2;
                            int var127 = field1715[var2];
                            int var128 = field1715[var2 + 1];
                            field1715[var2++] = class407.method2624(var128, -3007, var127);
                            continue;
                        }
                        if (var609 == 3302) {
                            var2 -= 2;
                            int var129 = field1715[var2];
                            int var130 = field1715[var2 + 1];
                            field1715[var2++] = class375.method2428(var130, (byte) -125, var129);
                            continue;
                        }
                        if (var609 == 3303) {
                            var2 -= 2;
                            int var131 = field1715[var2];
                            int var132 = field1715[var2 + 1];
                            field1715[var2++] = class31.method210(var132, var131, true);
                            continue;
                        }
                        if (var609 == 3304) {
                            var2--;
                            int var133 = field1715[var2];
                            field1715[var2++] = class310.method2110(var133, -111).field6289;
                            continue;
                        }
                        if (var609 == 3305) {
                            var2--;
                            int var134 = field1715[var2];
                            field1715[var2++] = class75.field1074[var134];
                            continue;
                        }
                        if (var609 == 3306) {
                            var2--;
                            int var135 = field1715[var2];
                            field1715[var2++] = class16.field219[var135];
                            continue;
                        }
                        if (var609 == 3307) {
                            var2--;
                            int var136 = field1715[var2];
                            field1715[var2++] = class138.field1906[var136];
                            continue;
                        }
                        if (var609 == 3308) {
                            int var137 = class227.field2981;
                            int var138 = (class227.field2988.field740 >> 7) + class7.field138;
                            int var139 = (class227.field2988.field734 >> 7) + class200.field2660;
                            field1715[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var609 == 3309) {
                            var2--;
                            int var140 = field1715[var2];
                            field1715[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var609 == 3310) {
                            var2--;
                            int var141 = field1715[var2];
                            field1715[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var609 == 3311) {
                            var2--;
                            int var142 = field1715[var2];
                            field1715[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var609 == 3312) {
                            field1715[var2++] = class390.field5614 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3313) {
                            var2 -= 2;
                            int var143 = field1715[var2] + 32768;
                            int var144 = field1715[var2 + 1];
                            field1715[var2++] = class407.method2624(var144, -3007, var143);
                            continue;
                        }
                        if (var609 == 3314) {
                            var2 -= 2;
                            int var145 = field1715[var2] + 32768;
                            int var146 = field1715[var2 + 1];
                            field1715[var2++] = class375.method2428(var146, (byte) 72, var145);
                            continue;
                        }
                        if (var609 == 3315) {
                            var2 -= 2;
                            int var147 = field1715[var2] + 32768;
                            int var148 = field1715[var2 + 1];
                            field1715[var2++] = class31.method210(var148, var147, true);
                            continue;
                        }
                        if (var609 == 3316) {
                            if (class185.field2510 >= 2) {
                                field1715[var2++] = class185.field2510;
                            } else {
                                field1715[var2++] = 0;
                            }
                            continue;
                        }
                        if (var609 == 3317) {
                            field1715[var2++] = class363.field5237;
                            continue;
                        }
                        if (var609 == 3318) {
                            field1715[var2++] = class43.field616;
                            continue;
                        }
                        if (var609 == 3321) {
                            field1715[var2++] = class131.field1808;
                            continue;
                        }
                        if (var609 == 3322) {
                            field1715[var2++] = class115.field1610;
                            continue;
                        }
                        if (var609 == 3323) {
                            if (class181.field2403 >= 5 && class181.field2403 <= 9) {
                                field1715[var2++] = 1;
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3324) {
                            if (class181.field2403 >= 5 && class181.field2403 <= 9) {
                                field1715[var2++] = class181.field2403;
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3325) {
                            field1715[var2++] = class317.field4638 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3326) {
                            field1715[var2++] = class227.field2988.field343;
                            continue;
                        }
                        if (var609 == 3327) {
                            field1715[var2++] = class227.field2988.field341.field4256 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3328) {
                            field1715[var2++] = class375.field5459 && !class69.field898 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3329) {
                            field1715[var2++] = class234.field3122 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3330) {
                            var2--;
                            int var149 = field1715[var2];
                            field1715[var2++] = class105.method709(20225, var149);
                            continue;
                        }
                        if (var609 == 3331) {
                            var2 -= 2;
                            int var150 = field1715[var2];
                            int var151 = field1715[var2 + 1];
                            field1715[var2++] = class143.method914(false, var150, -105, var151);
                            continue;
                        }
                        if (var609 == 3332) {
                            var2 -= 2;
                            int var152 = field1715[var2];
                            int var153 = field1715[var2 + 1];
                            field1715[var2++] = class143.method914(true, var152, -106, var153);
                            continue;
                        }
                        if (var609 == 3333) {
                            field1715[var2++] = class193.field2585;
                            continue;
                        }
                        if (var609 == 3335) {
                            field1715[var2++] = class177.field2337;
                            continue;
                        }
                        if (var609 == 3336) {
                            var2 -= 4;
                            int var154 = field1715[var2];
                            int var155 = field1715[var2 + 1];
                            int var156 = field1715[var2 + 2];
                            int var157 = field1715[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field1715[var2++] = var160;
                            continue;
                        }
                        if (var609 == 3337) {
                            field1715[var2++] = class223.field2944;
                            continue;
                        }
                        if (var609 == 3338) {
                            field1715[var2++] = class131.method826((byte) 119);
                            continue;
                        }
                    } else if (var609 < 3500) {
                        if (var609 == 3400) {
                            var2 -= 2;
                            int var161 = field1715[var2];
                            int var162 = field1715[var2 + 1];
                            class277 var163 = class418.method2675((byte) 69, var161);
                            field1710[var3++] = var163.method1912(-105, var162);
                            continue;
                        }
                        if (var609 == 3408) {
                            var2 -= 4;
                            int var164 = field1715[var2];
                            int var165 = field1715[var2 + 1];
                            int var166 = field1715[var2 + 2];
                            int var167 = field1715[var2 + 3];
                            class277 var168 = class418.method2675((byte) 123, var166);
                            if (var168.field4005 == var164 && var168.field4021 == var165) {
                                if (var165 == 115) {
                                    field1710[var3++] = var168.method1912(-23, var167);
                                } else {
                                    field1715[var2++] = var168.method1906(var167, 4);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var609 == 3409) {
                            var2 -= 3;
                            int var169 = field1715[var2];
                            int var170 = field1715[var2 + 1];
                            int var171 = field1715[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class277 var172 = class418.method2675((byte) 93, var170);
                            if (var172.field4021 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field1715[var2++] = var172.method1916(-101, var171) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3410) {
                            var2--;
                            int var173 = field1715[var2];
                            var3--;
                            String var174 = field1710[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class277 var175 = class418.method2675((byte) -106, var173);
                            if (var175.field4021 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field1715[var2++] = var175.method1907((byte) 105, var174) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3411) {
                            var2--;
                            int var176 = field1715[var2];
                            class277 var177 = class418.method2675((byte) -41, var176);
                            field1715[var2++] = var177.field4013.method383(0);
                            continue;
                        }
                    } else if (var609 < 3700) {
                        if (var609 == 3600) {
                            if (class237.field3182 == 0) {
                                field1715[var2++] = -2;
                            } else if (class237.field3182 == 1) {
                                field1715[var2++] = -1;
                            } else {
                                field1715[var2++] = class167.field2254;
                            }
                            continue;
                        }
                        if (var609 == 3601) {
                            var2--;
                            int var178 = field1715[var2];
                            if (class237.field3182 == 2 && var178 < class167.field2254) {
                                field1710[var3++] = class272.field3943[var178];
                                if (class148.field2037[var178] == null) {
                                    field1710[var3++] = "";
                                } else {
                                    field1710[var3++] = class148.field2037[var178];
                                }
                                continue;
                            }
                            field1710[var3++] = "";
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 3602) {
                            var2--;
                            int var179 = field1715[var2];
                            if (class237.field3182 == 2 && var179 < class167.field2254) {
                                field1715[var2++] = class324.field4759[var179];
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3603) {
                            var2--;
                            int var180 = field1715[var2];
                            if (class237.field3182 == 2 && var180 < class167.field2254) {
                                field1715[var2++] = class356.field5156[var180];
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3604) {
                            var3--;
                            String var181 = field1710[var3];
                            var2--;
                            int var182 = field1715[var2];
                            class343.method2239(var182, 168, var181);
                            continue;
                        }
                        if (var609 == 3605) {
                            var3--;
                            String var183 = field1710[var3];
                            class267.method1825(var183, 21130);
                            continue;
                        }
                        if (var609 == 3606) {
                            var3--;
                            String var184 = field1710[var3];
                            class376.method2443(-99, var184);
                            continue;
                        }
                        if (var609 == 3607) {
                            var3--;
                            String var185 = field1710[var3];
                            class207.method1223(var185, false, 11754);
                            continue;
                        }
                        if (var609 == 3608) {
                            var3--;
                            String var186 = field1710[var3];
                            class388.method2498((byte) 64, var186);
                            continue;
                        }
                        if (var609 == 3609) {
                            var3--;
                            String var187 = field1710[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field1715[var2++] = class262.method1804(98, var187) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3610) {
                            var2--;
                            int var188 = field1715[var2];
                            if (class237.field3182 == 2 && var188 < class167.field2254) {
                                field1710[var3++] = class368.field5312[var188];
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 3611) {
                            if (class193.field2588 == null) {
                                field1710[var3++] = "";
                            } else {
                                field1710[var3++] = class296.method2023(true, class193.field2588);
                            }
                            continue;
                        }
                        if (var609 == 3612) {
                            if (class193.field2588 == null) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = class207.field2785;
                            }
                            continue;
                        }
                        if (var609 == 3613) {
                            var2--;
                            int var189 = field1715[var2];
                            if (class193.field2588 != null && var189 < class207.field2785) {
                                field1710[var3++] = class195.field2617[var189].field6222;
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 3614) {
                            var2--;
                            int var190 = field1715[var2];
                            if (class193.field2588 != null && var190 < class207.field2785) {
                                field1715[var2++] = class195.field2617[var190].field6224;
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3615) {
                            var2--;
                            int var191 = field1715[var2];
                            if (class193.field2588 != null && var191 < class207.field2785) {
                                field1715[var2++] = class195.field2617[var191].field6228;
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3616) {
                            field1715[var2++] = class363.field5236;
                            continue;
                        }
                        if (var609 == 3617) {
                            var3--;
                            String var192 = field1710[var3];
                            class339.method2220(var192, -1);
                            continue;
                        }
                        if (var609 == 3618) {
                            field1715[var2++] = class110.field1558;
                            continue;
                        }
                        if (var609 == 3619) {
                            var3--;
                            String var193 = field1710[var3];
                            class35.method237(69, var193);
                            continue;
                        }
                        if (var609 == 3620) {
                            class393.method2515(110);
                            continue;
                        }
                        if (var609 == 3621) {
                            if (class237.field3182 == 0) {
                                field1715[var2++] = -1;
                            } else {
                                field1715[var2++] = class318.field4649;
                            }
                            continue;
                        }
                        if (var609 == 3622) {
                            var2--;
                            int var194 = field1715[var2];
                            if (class237.field3182 != 0 && var194 < class318.field4649) {
                                field1710[var3++] = class212.field2840[var194];
                                if (class307.field4520[var194] == null) {
                                    field1710[var3++] = "";
                                } else {
                                    field1710[var3++] = class307.field4520[var194];
                                }
                                continue;
                            }
                            field1710[var3++] = "";
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 3623) {
                            var3--;
                            String var195 = field1710[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field1715[var2++] = class48.method344((byte) -104, var195) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3624) {
                            var2--;
                            int var196 = field1715[var2];
                            if (class195.field2617 != null && var196 < class207.field2785 && class195.field2617[var196].field6219.equalsIgnoreCase(class227.field2988.field340)) {
                                field1715[var2++] = 1;
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3625) {
                            if (class399.field5959 == null) {
                                field1710[var3++] = "";
                            } else {
                                field1710[var3++] = class399.field5959;
                            }
                            continue;
                        }
                        if (var609 == 3626) {
                            var2--;
                            int var197 = field1715[var2];
                            if (class193.field2588 != null && var197 < class207.field2785) {
                                field1710[var3++] = class195.field2617[var197].field6229;
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 3627) {
                            var2--;
                            int var198 = field1715[var2];
                            if (class237.field3182 == 2 && var198 >= 0 && var198 < class167.field2254) {
                                field1715[var2++] = class110.field1551[var198] ? 1 : 0;
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3628) {
                            var3--;
                            String var199 = field1710[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field1715[var2++] = class143.method908(var199, (byte) 87);
                            continue;
                        }
                        if (var609 == 3629) {
                            field1715[var2++] = class419.field6197;
                            continue;
                        }
                        if (var609 == 3630) {
                            var3--;
                            String var200 = field1710[var3];
                            class207.method1223(var200, true, 11754);
                            continue;
                        }
                        if (var609 == 3631) {
                            var2--;
                            int var201 = field1715[var2];
                            field1715[var2++] = class235.field3128[var201] ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3632) {
                            var2--;
                            int var202 = field1715[var2];
                            if (class193.field2588 != null && var202 < class207.field2785) {
                                field1710[var3++] = class195.field2617[var202].field6219;
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 3633) {
                            var2--;
                            int var203 = field1715[var2];
                            if (class237.field3182 != 0 && var203 < class318.field4649) {
                                field1710[var3++] = class295.field4233[var203];
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                    } else if (var609 < 4000) {
                        if (var609 == 3903) {
                            var2--;
                            int var204 = field1715[var2];
                            field1715[var2++] = class282.field4101[var204].method1183(8);
                            continue;
                        }
                        if (var609 == 3904) {
                            var2--;
                            int var205 = field1715[var2];
                            field1715[var2++] = class282.field4101[var205].field2646;
                            continue;
                        }
                        if (var609 == 3905) {
                            var2--;
                            int var206 = field1715[var2];
                            field1715[var2++] = class282.field4101[var206].field2642;
                            continue;
                        }
                        if (var609 == 3906) {
                            var2--;
                            int var207 = field1715[var2];
                            field1715[var2++] = class282.field4101[var207].field2651;
                            continue;
                        }
                        if (var609 == 3907) {
                            var2--;
                            int var208 = field1715[var2];
                            field1715[var2++] = class282.field4101[var208].field2645;
                            continue;
                        }
                        if (var609 == 3908) {
                            var2--;
                            int var209 = field1715[var2];
                            field1715[var2++] = class282.field4101[var209].field2648;
                            continue;
                        }
                        if (var609 == 3910) {
                            var2--;
                            int var210 = field1715[var2];
                            int var211 = class282.field4101[var210].method1185(-128);
                            field1715[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3911) {
                            var2--;
                            int var212 = field1715[var2];
                            int var213 = class282.field4101[var212].method1185(-121);
                            field1715[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3912) {
                            var2--;
                            int var214 = field1715[var2];
                            int var215 = class282.field4101[var214].method1185(-126);
                            field1715[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3913) {
                            var2--;
                            int var216 = field1715[var2];
                            int var217 = class282.field4101[var216].method1185(-60);
                            field1715[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 4100) {
                        if (var609 == 4000) {
                            var2 -= 2;
                            int var218 = field1715[var2];
                            int var219 = field1715[var2 + 1];
                            field1715[var2++] = var218 + var219;
                            continue;
                        }
                        if (var609 == 4001) {
                            var2 -= 2;
                            int var220 = field1715[var2];
                            int var221 = field1715[var2 + 1];
                            field1715[var2++] = var220 - var221;
                            continue;
                        }
                        if (var609 == 4002) {
                            var2 -= 2;
                            int var222 = field1715[var2];
                            int var223 = field1715[var2 + 1];
                            field1715[var2++] = var222 * var223;
                            continue;
                        }
                        if (var609 == 4003) {
                            var2 -= 2;
                            int var224 = field1715[var2];
                            int var225 = field1715[var2 + 1];
                            field1715[var2++] = var224 / var225;
                            continue;
                        }
                        if (var609 == 4004) {
                            var2--;
                            int var226 = field1715[var2];
                            field1715[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var609 == 4005) {
                            var2--;
                            int var227 = field1715[var2];
                            field1715[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var609 == 4006) {
                            var2 -= 5;
                            int var228 = field1715[var2];
                            int var229 = field1715[var2 + 1];
                            int var230 = field1715[var2 + 2];
                            int var231 = field1715[var2 + 3];
                            int var232 = field1715[var2 + 4];
                            field1715[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var609 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field1715[var2];
                            long var235 = (long) field1715[var2 + 1];
                            field1715[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var609 == 4008) {
                            var2 -= 2;
                            int var237 = field1715[var2];
                            int var238 = field1715[var2 + 1];
                            field1715[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var609 == 4009) {
                            var2 -= 2;
                            int var239 = field1715[var2];
                            int var240 = field1715[var2 + 1];
                            field1715[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var609 == 4010) {
                            var2 -= 2;
                            int var241 = field1715[var2];
                            int var242 = field1715[var2 + 1];
                            field1715[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var609 == 4011) {
                            var2 -= 2;
                            int var243 = field1715[var2];
                            int var244 = field1715[var2 + 1];
                            field1715[var2++] = var243 % var244;
                            continue;
                        }
                        if (var609 == 4012) {
                            var2 -= 2;
                            int var245 = field1715[var2];
                            int var246 = field1715[var2 + 1];
                            if (var245 == 0) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var609 == 4013) {
                            var2 -= 2;
                            int var247 = field1715[var2];
                            int var248 = field1715[var2 + 1];
                            if (var247 == 0) {
                                field1715[var2++] = 0;
                            } else if (var248 == 0) {
                                field1715[var2++] = Integer.MAX_VALUE;
                            } else {
                                field1715[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var609 == 4014) {
                            var2 -= 2;
                            int var249 = field1715[var2];
                            int var250 = field1715[var2 + 1];
                            field1715[var2++] = var249 & var250;
                            continue;
                        }
                        if (var609 == 4015) {
                            var2 -= 2;
                            int var251 = field1715[var2];
                            int var252 = field1715[var2 + 1];
                            field1715[var2++] = var251 | var252;
                            continue;
                        }
                        if (var609 == 4016) {
                            var2 -= 2;
                            int var253 = field1715[var2];
                            int var254 = field1715[var2 + 1];
                            field1715[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var609 == 4017) {
                            var2 -= 2;
                            int var255 = field1715[var2];
                            int var256 = field1715[var2 + 1];
                            field1715[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var609 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field1715[var2];
                            long var259 = (long) field1715[var2 + 1];
                            long var261 = (long) field1715[var2 + 2];
                            field1715[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var609 < 4200) {
                        if (var609 == 4100) {
                            var3--;
                            String var263 = field1710[var3];
                            var2--;
                            int var264 = field1715[var2];
                            field1710[var3++] = var263 + var264;
                            continue;
                        }
                        if (var609 == 4101) {
                            var3 -= 2;
                            String var265 = field1710[var3];
                            String var266 = field1710[var3 + 1];
                            field1710[var3++] = var265 + var266;
                            continue;
                        }
                        if (var609 == 4102) {
                            var3--;
                            String var267 = field1710[var3];
                            var2--;
                            int var268 = field1715[var2];
                            field1710[var3++] = var267 + class324.method2175(var268, true, -309658874);
                            continue;
                        }
                        if (var609 == 4103) {
                            var3--;
                            String var269 = field1710[var3];
                            field1710[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var609 == 4104) {
                            var2--;
                            int var270 = field1715[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field1714.setTime(new Date(var271));
                            int var273 = field1714.get(5);
                            int var274 = field1714.get(2);
                            int var275 = field1714.get(1);
                            field1710[var3++] = var273 + "-" + field1717[var274] + "-" + var275;
                            continue;
                        }
                        if (var609 == 4105) {
                            var3 -= 2;
                            String var276 = field1710[var3];
                            String var277 = field1710[var3 + 1];
                            if (class227.field2988.field341 != null && class227.field2988.field341.field4256) {
                                field1710[var3++] = var277;
                                continue;
                            }
                            field1710[var3++] = var276;
                            continue;
                        }
                        if (var609 == 4106) {
                            var2--;
                            int var278 = field1715[var2];
                            field1710[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var609 == 4107) {
                            var3 -= 2;
                            field1715[var2++] = class205.method1215(field1710[var3 + 1], 1, field1710[var3], class177.field2337);
                            continue;
                        }
                        if (var609 == 4108) {
                            var3--;
                            String var279 = field1710[var3];
                            var2 -= 2;
                            int var280 = field1715[var2];
                            int var281 = field1715[var2 + 1];
                            class313 var282 = class271.method1868(105, var281, 0, class291.field4169);
                            field1715[var2++] = var282.method2122(var280, class270.field3931, var279, (byte) -46);
                            continue;
                        }
                        if (var609 == 4109) {
                            var3--;
                            String var283 = field1710[var3];
                            var2 -= 2;
                            int var284 = field1715[var2];
                            int var285 = field1715[var2 + 1];
                            class313 var286 = class271.method1868(122, var285, 0, class291.field4169);
                            field1715[var2++] = var286.method2117(var284, var283, class270.field3931, 119);
                            continue;
                        }
                        if (var609 == 4110) {
                            var3 -= 2;
                            String var287 = field1710[var3];
                            String var288 = field1710[var3 + 1];
                            var2--;
                            if (field1715[var2] == 1) {
                                field1710[var3++] = var287;
                            } else {
                                field1710[var3++] = var288;
                            }
                            continue;
                        }
                        if (var609 == 4111) {
                            var3--;
                            String var289 = field1710[var3];
                            field1710[var3++] = class430.method2725(var289, (byte) -107);
                            continue;
                        }
                        if (var609 == 4112) {
                            var3--;
                            String var290 = field1710[var3];
                            var2--;
                            int var291 = field1715[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field1710[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var609 == 4113) {
                            var2--;
                            int var292 = field1715[var2];
                            field1715[var2++] = class146.method929((char) var292, (byte) -97) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4114) {
                            var2--;
                            int var293 = field1715[var2];
                            field1715[var2++] = class28.method194((char) var293, -49) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4115) {
                            var2--;
                            int var294 = field1715[var2];
                            field1715[var2++] = class16.method100(65, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4116) {
                            var2--;
                            int var295 = field1715[var2];
                            field1715[var2++] = class319.method2151(118, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4117) {
                            var3--;
                            String var296 = field1710[var3];
                            if (var296 == null) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var609 == 4118) {
                            var3--;
                            String var297 = field1710[var3];
                            var2 -= 2;
                            int var298 = field1715[var2];
                            int var299 = field1715[var2 + 1];
                            field1710[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var609 == 4119) {
                            var3--;
                            String var300 = field1710[var3];
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
                            field1710[var3++] = var301.toString();
                            continue;
                        }
                        if (var609 == 4120) {
                            var3--;
                            String var305 = field1710[var3];
                            var2 -= 2;
                            int var306 = field1715[var2];
                            int var307 = field1715[var2 + 1];
                            field1715[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var609 == 4121) {
                            var3 -= 2;
                            String var308 = field1710[var3];
                            String var309 = field1710[var3 + 1];
                            var2--;
                            int var310 = field1715[var2];
                            field1715[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var609 == 4122) {
                            var2--;
                            int var311 = field1715[var2];
                            field1715[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var609 == 4123) {
                            var2--;
                            int var312 = field1715[var2];
                            field1715[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var609 == 4124) {
                            var2--;
                            boolean var313 = field1715[var2] != 0;
                            var2--;
                            int var314 = field1715[var2];
                            field1710[var3++] = class237.method1418(class177.field2337, true, var313, 0, (long) var314);
                            continue;
                        }
                    } else if (var609 < 4300) {
                        if (var609 == 4200) {
                            var2--;
                            int var315 = field1715[var2];
                            field1710[var3++] = class9.method74(var315, (byte) 69).field1193;
                            continue;
                        }
                        if (var609 == 4201) {
                            var2 -= 2;
                            int var316 = field1715[var2];
                            int var317 = field1715[var2 + 1];
                            class83 var318 = class9.method74(var316, (byte) 126);
                            if (var317 >= 1 && var317 <= 5 && var318.field1182[var317 - 1] != null) {
                                field1710[var3++] = var318.field1182[var317 - 1];
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 4202) {
                            var2 -= 2;
                            int var319 = field1715[var2];
                            int var320 = field1715[var2 + 1];
                            class83 var321 = class9.method74(var319, (byte) 103);
                            if (var320 >= 1 && var320 <= 5 && var321.field1150[var320 - 1] != null) {
                                field1710[var3++] = var321.field1150[var320 - 1];
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 4203) {
                            var2--;
                            int var322 = field1715[var2];
                            field1715[var2++] = class9.method74(var322, (byte) -36).field1191;
                            continue;
                        }
                        if (var609 == 4204) {
                            var2--;
                            int var323 = field1715[var2];
                            field1715[var2++] = class9.method74(var323, (byte) 125).field1148 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4205) {
                            var2--;
                            int var324 = field1715[var2];
                            class83 var325 = class9.method74(var324, (byte) 81);
                            if (var325.field1144 == -1 && var325.field1161 >= 0) {
                                field1715[var2++] = var325.field1161;
                                continue;
                            }
                            field1715[var2++] = var324;
                            continue;
                        }
                        if (var609 == 4206) {
                            var2--;
                            int var326 = field1715[var2];
                            class83 var327 = class9.method74(var326, (byte) -89);
                            if (var327.field1144 >= 0 && var327.field1161 >= 0) {
                                field1715[var2++] = var327.field1161;
                                continue;
                            }
                            field1715[var2++] = var326;
                            continue;
                        }
                        if (var609 == 4207) {
                            var2--;
                            int var328 = field1715[var2];
                            field1715[var2++] = class9.method74(var328, (byte) 117).field1166 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4208) {
                            var2 -= 2;
                            int var329 = field1715[var2];
                            int var330 = field1715[var2 + 1];
                            class99 var331 = class98.method666(var330, false);
                            if (var331.method677((byte) 69)) {
                                field1710[var3++] = class9.method74(var329, (byte) 71).method581(var330, var331.field1376, -115);
                            } else {
                                field1715[var2++] = class9.method74(var329, (byte) -99).method600(var331.field1380, var330, -25103);
                            }
                            continue;
                        }
                        if (var609 == 4210) {
                            var3--;
                            String var332 = field1710[var3];
                            var2--;
                            int var333 = field1715[var2];
                            class130.method824(-118, var333 == 1, var332);
                            field1715[var2++] = class149.field2041;
                            continue;
                        }
                        if (var609 == 4211) {
                            if (class410.field6054 != null && class299.field4373 < class149.field2041) {
                                field1715[var2++] = class410.field6054[class299.field4373++] & 0xFFFF;
                                continue;
                            }
                            field1715[var2++] = -1;
                            continue;
                        }
                        if (var609 == 4212) {
                            class299.field4373 = 0;
                            continue;
                        }
                    } else if (var609 < 4400) {
                        if (var609 == 4300) {
                            var2 -= 2;
                            int var334 = field1715[var2];
                            int var335 = field1715[var2 + 1];
                            class99 var336 = class98.method666(var335, false);
                            if (var336.method677((byte) 69)) {
                                field1710[var3++] = class119.method771((byte) 117, var334).method1509(var336.field1376, var335, (byte) 114);
                            } else {
                                field1715[var2++] = class119.method771((byte) 93, var334).method1504(var335, -1, var336.field1380);
                            }
                            continue;
                        }
                    } else if (var609 < 4500) {
                        if (var609 == 4400) {
                            var2 -= 2;
                            int var337 = field1715[var2];
                            int var338 = field1715[var2 + 1];
                            class99 var339 = class98.method666(var338, false);
                            if (var339.method677((byte) 69)) {
                                field1710[var3++] = class329.method2190((byte) 63, var337).method695(var339.field1376, var338, true);
                            } else {
                                field1715[var2++] = class329.method2190((byte) 63, var337).method704(var339.field1380, var338, 2);
                            }
                            continue;
                        }
                    } else if (var609 < 4600) {
                        if (var609 == 4500) {
                            var2 -= 2;
                            int var340 = field1715[var2];
                            int var341 = field1715[var2 + 1];
                            class99 var342 = class98.method666(var341, false);
                            if (var342.method677((byte) 69)) {
                                field1710[var3++] = class220.method1287((byte) -126, var340).method2198(111, var342.field1376, var341);
                            } else {
                                field1715[var2++] = class220.method1287((byte) -126, var340).method2202(0, var342.field1380, var341);
                            }
                            continue;
                        }
                    } else if (var609 < 4700) {
                        if (var609 == 4600) {
                            var2--;
                            int var343 = field1715[var2];
                            field1715[var2++] = class354.method2329(var343, -115).field5872;
                            continue;
                        }
                    } else if (var609 < 5100) {
                        if (var609 == 5000) {
                            field1715[var2++] = class112.field1577;
                            continue;
                        }
                        if (var609 == 5001) {
                            var2 -= 3;
                            class112.field1577 = field1715[var2];
                            class41.field575 = field1715[var2 + 1];
                            class130.field1797 = field1715[var2 + 2];
                            field1699++;
                            class185.field2507.method5(-6445, 145);
                            class185.field2507.method1346(class112.field1577, 32767);
                            class185.field2507.method1346(class41.field575, 32767);
                            class185.field2507.method1346(class130.field1797, 32767);
                            continue;
                        }
                        if (var609 == 5002) {
                            var3--;
                            String var344 = field1710[var3];
                            var2 -= 2;
                            int var345 = field1715[var2];
                            int var346 = field1715[var2 + 1];
                            field1704++;
                            class185.field2507.method5(-6445, 187);
                            class185.field2507.method1346(class125.method795(113, var344) + 2, 32767);
                            class185.field2507.method1380(65280, var344);
                            class185.field2507.method1346(var345 - 1, 32767);
                            class185.field2507.method1346(var346, 32767);
                            continue;
                        }
                        if (var609 == 5003) {
                            var2--;
                            int var347 = field1715[var2];
                            String var348 = null;
                            if (var347 < 100) {
                                var348 = class317.field4634[var347];
                            }
                            if (var348 == null) {
                                var348 = "";
                            }
                            field1710[var3++] = var348;
                            continue;
                        }
                        if (var609 == 5004) {
                            var2--;
                            int var349 = field1715[var2];
                            int var350 = -1;
                            if (var349 < 100 && class317.field4634[var349] != null) {
                                var350 = class372.field5410[var349];
                            }
                            field1715[var2++] = var350;
                            continue;
                        }
                        if (var609 == 5005) {
                            field1715[var2++] = class41.field575;
                            continue;
                        }
                        if (var609 == 5008) {
                            var3--;
                            String var351 = field1710[var3];
                            if (class185.field2510 == 0 && (class375.field5459 && !class69.field898 || class234.field3122)) {
                                continue;
                            }
                            String var352 = var351.toLowerCase();
                            byte var353 = 0;
                            if (var352.startsWith(class63.field843)) {
                                var353 = 0;
                                var351 = var351.substring(class63.field843.length());
                            } else if (var352.startsWith(class294.field4224)) {
                                var353 = 1;
                                var351 = var351.substring(class294.field4224.length());
                            } else if (var352.startsWith(class229.field3070)) {
                                var353 = 2;
                                var351 = var351.substring(class229.field3070.length());
                            } else if (var352.startsWith(class188.field2531)) {
                                var353 = 3;
                                var351 = var351.substring(class188.field2531.length());
                            } else if (var352.startsWith(class55.field739)) {
                                var353 = 4;
                                var351 = var351.substring(class55.field739.length());
                            } else if (var352.startsWith(class83.field1169)) {
                                var353 = 5;
                                var351 = var351.substring(class83.field1169.length());
                            } else if (var352.startsWith(class31.field440)) {
                                var353 = 6;
                                var351 = var351.substring(class31.field440.length());
                            } else if (var352.startsWith(class373.field5423)) {
                                var353 = 7;
                                var351 = var351.substring(class373.field5423.length());
                            } else if (var352.startsWith(class1.field1)) {
                                var353 = 8;
                                var351 = var351.substring(class1.field1.length());
                            } else if (var352.startsWith(class424.field6259)) {
                                var353 = 9;
                                var351 = var351.substring(class424.field6259.length());
                            } else if (var352.startsWith(class15.field218)) {
                                var353 = 10;
                                var351 = var351.substring(class15.field218.length());
                            } else if (var352.startsWith(class106.field1527)) {
                                var353 = 11;
                                var351 = var351.substring(class106.field1527.length());
                            } else if (class177.field2337 != 0) {
                                if (var352.startsWith(class184.field2490)) {
                                    var353 = 0;
                                    var351 = var351.substring(class184.field2490.length());
                                } else if (var352.startsWith(class234.field3127)) {
                                    var353 = 1;
                                    var351 = var351.substring(class234.field3127.length());
                                } else if (var352.startsWith(class163.field2186)) {
                                    var353 = 2;
                                    var351 = var351.substring(class163.field2186.length());
                                } else if (var352.startsWith(class92.field1295)) {
                                    var353 = 3;
                                    var351 = var351.substring(class92.field1295.length());
                                } else if (var352.startsWith(class72.field1045)) {
                                    var353 = 4;
                                    var351 = var351.substring(class72.field1045.length());
                                } else if (var352.startsWith(class182.field2456)) {
                                    var353 = 5;
                                    var351 = var351.substring(class182.field2456.length());
                                } else if (var352.startsWith(class174.field2325)) {
                                    var353 = 6;
                                    var351 = var351.substring(class174.field2325.length());
                                } else if (var352.startsWith(class83.field1201)) {
                                    var353 = 7;
                                    var351 = var351.substring(class83.field1201.length());
                                } else if (var352.startsWith(class104.field1515)) {
                                    var353 = 8;
                                    var351 = var351.substring(class104.field1515.length());
                                } else if (var352.startsWith(class431.field6337)) {
                                    var353 = 9;
                                    var351 = var351.substring(class431.field6337.length());
                                } else if (var352.startsWith(class153.field2075)) {
                                    var353 = 10;
                                    var351 = var351.substring(class153.field2075.length());
                                } else if (var352.startsWith(class228.field3032)) {
                                    var353 = 11;
                                    var351 = var351.substring(class228.field3032.length());
                                }
                            }
                            String var354 = var351.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class335.field4837)) {
                                var355 = 1;
                                var351 = var351.substring(class335.field4837.length());
                            } else if (var354.startsWith(class419.field6206)) {
                                var355 = 2;
                                var351 = var351.substring(class419.field6206.length());
                            } else if (var354.startsWith(class426.field6283)) {
                                var355 = 3;
                                var351 = var351.substring(class426.field6283.length());
                            } else if (var354.startsWith(class354.field5119)) {
                                var355 = 4;
                                var351 = var351.substring(class354.field5119.length());
                            } else if (var354.startsWith(class379.field5505)) {
                                var355 = 5;
                                var351 = var351.substring(class379.field5505.length());
                            } else if (class177.field2337 != 0) {
                                if (var354.startsWith(class147.field2014)) {
                                    var355 = 1;
                                    var351 = var351.substring(class147.field2014.length());
                                } else if (var354.startsWith(class223.field2942)) {
                                    var355 = 2;
                                    var351 = var351.substring(class223.field2942.length());
                                } else if (var354.startsWith(class400.field5968)) {
                                    var355 = 3;
                                    var351 = var351.substring(class400.field5968.length());
                                } else if (var354.startsWith(class363.field5244)) {
                                    var355 = 4;
                                    var351 = var351.substring(class363.field5244.length());
                                } else if (var354.startsWith(class194.field2599)) {
                                    var355 = 5;
                                    var351 = var351.substring(class194.field2599.length());
                                }
                            }
                            field1703++;
                            class185.field2507.method5(-6445, 162);
                            class185.field2507.method1346(0, 32767);
                            int var356 = class185.field2507.field3029;
                            class185.field2507.method1346(var353, 32767);
                            class185.field2507.method1346(var355, 32767);
                            class41.method298((byte) 125, class185.field2507, var351);
                            class185.field2507.method1378(class185.field2507.field3029 - var356, -1378);
                            continue;
                        }
                        if (var609 == 5009) {
                            var3 -= 2;
                            String var357 = field1710[var3];
                            String var358 = field1710[var3 + 1];
                            if (class185.field2510 != 0 || (!class375.field5459 || class69.field898) && !class234.field3122) {
                                field1701++;
                                class185.field2507.method5(-6445, 88);
                                class185.field2507.method1346(0, 32767);
                                int var359 = class185.field2507.field3029;
                                class185.field2507.method1380(65280, var357);
                                class41.method298((byte) 126, class185.field2507, var358);
                                class185.field2507.method1378(class185.field2507.field3029 - var359, -1378);
                            }
                            continue;
                        }
                        if (var609 == 5010) {
                            var2--;
                            int var360 = field1715[var2];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = class130.field1796[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field1710[var3++] = var361;
                            continue;
                        }
                        if (var609 == 5011) {
                            var2--;
                            int var362 = field1715[var2];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = class211.field2803[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field1710[var3++] = var363;
                            continue;
                        }
                        if (var609 == 5012) {
                            var2--;
                            int var364 = field1715[var2];
                            int var365 = -1;
                            if (var364 < 100) {
                                var365 = class315.field4608[var364];
                            }
                            field1715[var2++] = var365;
                            continue;
                        }
                        if (var609 == 5015) {
                            String var366;
                            if (class227.field2988 == null || class227.field2988.field361 == null) {
                                var366 = class34.field475;
                            } else {
                                var366 = class227.field2988.method175(17881, true);
                            }
                            field1710[var3++] = var366;
                            continue;
                        }
                        if (var609 == 5016) {
                            field1715[var2++] = class130.field1797;
                            continue;
                        }
                        if (var609 == 5017) {
                            field1715[var2++] = class201.field2701;
                            continue;
                        }
                        if (var609 == 5018) {
                            var2--;
                            int var367 = field1715[var2];
                            int var368 = 0;
                            if (var367 < 100 && class317.field4634[var367] != null) {
                                var368 = class372.field5410[var367];
                            }
                            field1715[var2++] = var368;
                            continue;
                        }
                        if (var609 == 5019) {
                            var2--;
                            int var369 = field1715[var2];
                            String var370 = null;
                            if (var369 < 100) {
                                var370 = class178.field2352[var369];
                            }
                            if (var370 == null) {
                                var370 = "";
                            }
                            field1710[var3++] = var370;
                            continue;
                        }
                        if (var609 == 5020) {
                            String var371;
                            if (class227.field2988 == null || class227.field2988.field361 == null) {
                                var371 = class34.field475;
                            } else {
                                var371 = class227.field2988.method164(51, false);
                            }
                            field1710[var3++] = var371;
                            continue;
                        }
                        if (var609 == 5050) {
                            var2--;
                            int var372 = field1715[var2];
                            field1710[var3++] = class283.method1951((byte) 54, var372).field4234;
                            continue;
                        }
                        if (var609 == 5051) {
                            var2--;
                            int var373 = field1715[var2];
                            class295 var374 = class283.method1951((byte) 54, var373);
                            if (var374.field4232 == null) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var374.field4232.length;
                            }
                            continue;
                        }
                        if (var609 == 5052) {
                            var2 -= 2;
                            int var375 = field1715[var2];
                            int var376 = field1715[var2 + 1];
                            class295 var377 = class283.method1951((byte) 54, var375);
                            int var378 = var377.field4232[var376];
                            field1715[var2++] = var378;
                            continue;
                        }
                        if (var609 == 5053) {
                            var2--;
                            int var379 = field1715[var2];
                            class295 var380 = class283.method1951((byte) 54, var379);
                            if (var380.field4236 == null) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var380.field4236.length;
                            }
                            continue;
                        }
                        if (var609 == 5054) {
                            var2 -= 2;
                            int var381 = field1715[var2];
                            int var382 = field1715[var2 + 1];
                            field1715[var2++] = class283.method1951((byte) 54, var381).field4236[var382];
                            continue;
                        }
                        if (var609 == 5055) {
                            var2--;
                            int var383 = field1715[var2];
                            field1710[var3++] = class418.method2678(var383, 14317).method2463(-128);
                            continue;
                        }
                        if (var609 == 5056) {
                            var2--;
                            int var384 = field1715[var2];
                            class379 var385 = class418.method2678(var384, 14317);
                            if (var385.field5516 == null) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var385.field5516.length;
                            }
                            continue;
                        }
                        if (var609 == 5057) {
                            var2 -= 2;
                            int var386 = field1715[var2];
                            int var387 = field1715[var2 + 1];
                            field1715[var2++] = class418.method2678(var386, 14317).field5516[var387];
                            continue;
                        }
                        if (var609 == 5058) {
                            field1712 = new class41();
                            var2--;
                            field1712.field574 = field1715[var2];
                            field1712.field569 = class418.method2678(field1712.field574, 14317);
                            field1712.field572 = new int[field1712.field569.method2456(108)];
                            continue;
                        }
                        if (var609 == 5059) {
                            field1713++;
                            class185.field2507.method5(-6445, 92);
                            class185.field2507.method1346(0, 32767);
                            int var388 = class185.field2507.field3029;
                            class185.field2507.method1346(0, 32767);
                            class185.field2507.method1326(field1712.field574, 124);
                            field1712.field569.method2461(field1712.field572, (byte) 90, class185.field2507);
                            class185.field2507.method1378(class185.field2507.field3029 - var388, -1378);
                            continue;
                        }
                        if (var609 == 5060) {
                            var3--;
                            String var389 = field1710[var3];
                            field1695++;
                            class185.field2507.method5(-6445, 242);
                            class185.field2507.method1346(0, 32767);
                            int var390 = class185.field2507.field3029;
                            class185.field2507.method1380(65280, var389);
                            class185.field2507.method1326(field1712.field574, 37);
                            field1712.field569.method2461(field1712.field572, (byte) 89, class185.field2507);
                            class185.field2507.method1378(class185.field2507.field3029 - var390, -1378);
                            continue;
                        }
                        if (var609 == 5061) {
                            field1713++;
                            class185.field2507.method5(-6445, 92);
                            class185.field2507.method1346(0, 32767);
                            int var391 = class185.field2507.field3029;
                            class185.field2507.method1346(1, 32767);
                            class185.field2507.method1326(field1712.field574, 71);
                            field1712.field569.method2461(field1712.field572, (byte) 84, class185.field2507);
                            class185.field2507.method1378(class185.field2507.field3029 - var391, -1378);
                            continue;
                        }
                        if (var609 == 5062) {
                            var2 -= 2;
                            int var392 = field1715[var2];
                            int var393 = field1715[var2 + 1];
                            field1715[var2++] = class283.method1951((byte) 54, var392).field4237[var393];
                            continue;
                        }
                        if (var609 == 5063) {
                            var2 -= 2;
                            int var394 = field1715[var2];
                            int var395 = field1715[var2 + 1];
                            field1715[var2++] = class283.method1951((byte) 54, var394).field4225[var395];
                            continue;
                        }
                        if (var609 == 5064) {
                            var2 -= 2;
                            int var396 = field1715[var2];
                            int var397 = field1715[var2 + 1];
                            if (var397 == -1) {
                                field1715[var2++] = -1;
                            } else {
                                field1715[var2++] = class283.method1951((byte) 54, var396).method2018((char) var397, true);
                            }
                            continue;
                        }
                        if (var609 == 5065) {
                            var2 -= 2;
                            int var398 = field1715[var2];
                            int var399 = field1715[var2 + 1];
                            if (var399 == -1) {
                                field1715[var2++] = -1;
                            } else {
                                field1715[var2++] = class283.method1951((byte) 54, var398).method2020((char) var399, 21517);
                            }
                            continue;
                        }
                        if (var609 == 5066) {
                            var2--;
                            int var400 = field1715[var2];
                            field1715[var2++] = class418.method2678(var400, 14317).method2456(102);
                            continue;
                        }
                        if (var609 == 5067) {
                            var2 -= 2;
                            int var401 = field1715[var2];
                            int var402 = field1715[var2 + 1];
                            int var403 = class418.method2678(var401, 14317).method2454(-7200, var402);
                            field1715[var2++] = var403;
                            continue;
                        }
                        if (var609 == 5068) {
                            var2 -= 2;
                            int var404 = field1715[var2];
                            int var405 = field1715[var2 + 1];
                            field1712.field572[var404] = var405;
                            continue;
                        }
                        if (var609 == 5069) {
                            var2 -= 2;
                            int var406 = field1715[var2];
                            int var407 = field1715[var2 + 1];
                            field1712.field572[var406] = var407;
                            continue;
                        }
                        if (var609 == 5070) {
                            var2 -= 3;
                            int var408 = field1715[var2];
                            int var409 = field1715[var2 + 1];
                            int var410 = field1715[var2 + 2];
                            class379 var411 = class418.method2678(var408, 14317);
                            if (var411.method2454(-7200, var409) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field1715[var2++] = var411.method2460(var409, true, var410);
                            continue;
                        }
                        if (var609 == 5071) {
                            var3--;
                            String var412 = field1710[var3];
                            var2--;
                            boolean var413 = field1715[var2] == 1;
                            class139.method897(22, var413, var412);
                            field1715[var2++] = class149.field2041;
                            continue;
                        }
                        if (var609 == 5072) {
                            if (class410.field6054 != null && class299.field4373 < class149.field2041) {
                                field1715[var2++] = class410.field6054[class299.field4373++] & 0xFFFF;
                                continue;
                            }
                            field1715[var2++] = -1;
                            continue;
                        }
                        if (var609 == 5073) {
                            class299.field4373 = 0;
                            continue;
                        }
                    } else if (var609 < 5200) {
                        if (var609 == 5100) {
                            if (class30.field437[86]) {
                                field1715[var2++] = 1;
                            } else {
                                field1715[var2++] = 0;
                            }
                            continue;
                        }
                        if (var609 == 5101) {
                            if (class30.field437[82]) {
                                field1715[var2++] = 1;
                            } else {
                                field1715[var2++] = 0;
                            }
                            continue;
                        }
                        if (var609 == 5102) {
                            if (class30.field437[81]) {
                                field1715[var2++] = 1;
                            } else {
                                field1715[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var609 < 5300) {
                        if (var609 == 5200) {
                            var2--;
                            class134.method844((byte) 80, field1715[var2]);
                            continue;
                        }
                        if (var609 == 5201) {
                            field1715[var2++] = class277.method1909(15149);
                            continue;
                        }
                        if (var609 == 5205) {
                            var2--;
                            class71.method525(103, false, -1, -1, field1715[var2]);
                            continue;
                        }
                        if (var609 == 5206) {
                            var2--;
                            int var414 = field1715[var2];
                            class252 var415 = class293.method2000(var414 >> 14 & 0x3FFF, var414 & 0x3FFF);
                            if (var415 == null) {
                                field1715[var2++] = -1;
                            } else {
                                field1715[var2++] = var415.field3463;
                            }
                            continue;
                        }
                        if (var609 == 5207) {
                            var2--;
                            class252 var416 = class293.method2006(field1715[var2]);
                            if (var416 != null && var416.field3468 != null) {
                                field1710[var3++] = var416.field3468;
                                continue;
                            }
                            field1710[var3++] = "";
                            continue;
                        }
                        if (var609 == 5208) {
                            field1715[var2++] = class90.field1278;
                            field1715[var2++] = class405.field6017;
                            continue;
                        }
                        if (var609 == 5209) {
                            field1715[var2++] = class44.field624 + class293.field4205;
                            field1715[var2++] = class373.field5426 + class293.field4197;
                            continue;
                        }
                        if (var609 == 5210) {
                            var2--;
                            int var417 = field1715[var2];
                            class252 var418 = class293.method2006(var417);
                            if (var418 == null) {
                                field1715[var2++] = 0;
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var418.field3462 >> 14 & 0x3FFF;
                                field1715[var2++] = var418.field3462 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var609 == 5211) {
                            var2--;
                            int var419 = field1715[var2];
                            class252 var420 = class293.method2006(var419);
                            if (var420 == null) {
                                field1715[var2++] = 0;
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var420.field3455 - var420.field3454;
                                field1715[var2++] = var420.field3450 - var420.field3453;
                            }
                            continue;
                        }
                        if (var609 == 5212) {
                            class246 var421 = class404.method2605((byte) 86);
                            if (var421 == null) {
                                field1715[var2++] = -1;
                                field1715[var2++] = -1;
                            } else {
                                field1715[var2++] = var421.field3323;
                                int var422 = var421.field3322 << 28 | class293.field4205 + var421.field3317 << 14 | class293.field4197 + var421.field3327;
                                field1715[var2++] = var422;
                            }
                            continue;
                        }
                        if (var609 == 5213) {
                            class246 var423 = class23.method151((byte) -112);
                            if (var423 == null) {
                                field1715[var2++] = -1;
                                field1715[var2++] = -1;
                            } else {
                                field1715[var2++] = var423.field3323;
                                int var424 = var423.field3322 << 28 | class293.field4205 + var423.field3317 << 14 | class293.field4197 + var423.field3327;
                                field1715[var2++] = var424;
                            }
                            continue;
                        }
                        if (var609 == 5214) {
                            var2--;
                            int var425 = field1715[var2];
                            class252 var426 = class236.method1415((byte) -69);
                            if (var426 != null) {
                                boolean var427 = var426.method1526(var425 >> 14 & 0x3FFF, var425 >> 28 & 0x3, false, var425 & 0x3FFF, field1719);
                                if (var427) {
                                    class199.method1181(field1719[1], 1, field1719[2]);
                                }
                            }
                            continue;
                        }
                        if (var609 == 5215) {
                            var2 -= 2;
                            int var428 = field1715[var2];
                            int var429 = field1715[var2 + 1];
                            class346 var430 = class293.method2003(var428 >> 14 & 0x3FFF, var428 & 0x3FFF);
                            boolean var431 = false;
                            for (class252 var432 = (class252) var430.method2250(1580); var432 != null; var432 = (class252) var430.method2244(0)) {
                                if (var432.field3463 == var429) {
                                    var431 = true;
                                    break;
                                }
                            }
                            if (var431) {
                                field1715[var2++] = 1;
                            } else {
                                field1715[var2++] = 0;
                            }
                            continue;
                        }
                        if (var609 == 5218) {
                            var2--;
                            int var433 = field1715[var2];
                            class252 var434 = class293.method2006(var433);
                            if (var434 == null) {
                                field1715[var2++] = -1;
                            } else {
                                field1715[var2++] = var434.field3459;
                            }
                            continue;
                        }
                        if (var609 == 5220) {
                            field1715[var2++] = class180.field2383 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 5221) {
                            var2--;
                            int var435 = field1715[var2];
                            class199.method1181(var435 >> 14 & 0x3FFF, 1, var435 & 0x3FFF);
                            continue;
                        }
                        if (var609 == 5222) {
                            class252 var436 = class236.method1415((byte) -69);
                            if (var436 == null) {
                                field1715[var2++] = -1;
                                field1715[var2++] = -1;
                            } else {
                                boolean var437 = var436.method1521(field1719, class44.field624 + class293.field4205, class373.field5426 + class293.field4197, (byte) -63);
                                if (var437) {
                                    field1715[var2++] = field1719[1];
                                    field1715[var2++] = field1719[2];
                                } else {
                                    field1715[var2++] = -1;
                                    field1715[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var609 == 5223) {
                            var2 -= 2;
                            int var438 = field1715[var2];
                            int var439 = field1715[var2 + 1];
                            class71.method525(86, false, var439 & 0x3FFF, var439 >> 14 & 0x3FFF, var438);
                            continue;
                        }
                        if (var609 == 5224) {
                            var2--;
                            int var440 = field1715[var2];
                            class252 var441 = class236.method1415((byte) -69);
                            if (var441 == null) {
                                field1715[var2++] = -1;
                                field1715[var2++] = -1;
                            } else {
                                boolean var442 = var441.method1526(var440 >> 14 & 0x3FFF, var440 >> 28 & 0x3, false, var440 & 0x3FFF, field1719);
                                if (var442) {
                                    field1715[var2++] = field1719[1];
                                    field1715[var2++] = field1719[2];
                                } else {
                                    field1715[var2++] = -1;
                                    field1715[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var609 == 5225) {
                            var2--;
                            int var443 = field1715[var2];
                            class252 var444 = class236.method1415((byte) -69);
                            if (var444 == null) {
                                field1715[var2++] = -1;
                                field1715[var2++] = -1;
                            } else {
                                boolean var445 = var444.method1521(field1719, var443 >> 14 & 0x3FFF, var443 & 0x3FFF, (byte) -63);
                                if (var445) {
                                    field1715[var2++] = field1719[1];
                                    field1715[var2++] = field1719[2];
                                } else {
                                    field1715[var2++] = -1;
                                    field1715[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var609 == 5226) {
                            var2--;
                            class317.method2141(field1715[var2], (byte) -4);
                            continue;
                        }
                        if (var609 == 5227) {
                            var2 -= 2;
                            int var446 = field1715[var2];
                            int var447 = field1715[var2 + 1];
                            class71.method525(77, true, var447 & 0x3FFF, var447 >> 14 & 0x3FFF, var446);
                            continue;
                        }
                        if (var609 == 5228) {
                            var2--;
                            class69.field886 = field1715[var2] == 1;
                            continue;
                        }
                        if (var609 == 5229) {
                            field1715[var2++] = class69.field886 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 5230) {
                            var2--;
                            int var448 = field1715[var2];
                            class69.method462(4096, var448);
                            continue;
                        }
                        if (var609 == 5231) {
                            var2 -= 2;
                            int var449 = field1715[var2];
                            boolean var450 = field1715[var2 + 1] == 1;
                            if (class90.field1262 == null) {
                                continue;
                            }
                            class45 var451 = class90.field1262.method384((long) var449, true);
                            if (var451 != null && !var450) {
                                var451.method322(11);
                                continue;
                            }
                            if (var451 == null && var450) {
                                class45 var452 = new class45();
                                class90.field1262.method381(true, var452, (long) var449);
                            }
                            continue;
                        }
                        if (var609 == 5232) {
                            var2--;
                            int var453 = field1715[var2];
                            if (class90.field1262 == null) {
                                field1715[var2++] = 0;
                            } else {
                                class45 var454 = class90.field1262.method384((long) var453, true);
                                field1715[var2++] = var454 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var609 == 5233) {
                            var2 -= 2;
                            int var455 = field1715[var2];
                            boolean var456 = field1715[var2 + 1] == 1;
                            if (class156.field2114 == null) {
                                continue;
                            }
                            class45 var457 = class156.field2114.method384((long) var455, true);
                            if (var457 != null && !var456) {
                                var457.method322(11);
                                continue;
                            }
                            if (var457 == null && var456) {
                                class45 var458 = new class45();
                                class156.field2114.method381(true, var458, (long) var455);
                            }
                            continue;
                        }
                        if (var609 == 5234) {
                            var2--;
                            int var459 = field1715[var2];
                            if (class156.field2114 == null) {
                                field1715[var2++] = 0;
                            } else {
                                class45 var460 = class156.field2114.method384((long) var459, true);
                                field1715[var2++] = var460 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var609 == 5235) {
                            field1715[var2++] = class293.field4174 == null ? -1 : class293.field4174.field3463;
                            continue;
                        }
                    } else if (var609 < 5400) {
                        if (var609 == 5300) {
                            var2 -= 2;
                            int var461 = field1715[var2];
                            int var462 = field1715[var2 + 1];
                            class147.method933(3, false, var461, 1, var462);
                            field1715[var2++] = class103.field1428 == null ? 0 : 1;
                            continue;
                        }
                        if (var609 == 5301) {
                            if (class103.field1428 != null) {
                                class147.method933(class11.field171, false, -1, 1, -1);
                            }
                            continue;
                        }
                        if (var609 == 5302) {
                            class309[] var463 = class225.method1306((byte) -107);
                            field1715[var2++] = var463.length;
                            continue;
                        }
                        if (var609 == 5303) {
                            var2--;
                            int var464 = field1715[var2];
                            class309[] var465 = class225.method1306((byte) -103);
                            field1715[var2++] = var465[var464].field4549;
                            field1715[var2++] = var465[var464].field4554;
                            continue;
                        }
                        if (var609 == 5305) {
                            int var466 = class406.field6030;
                            int var467 = class122.field1692;
                            int var468 = -1;
                            class309[] var469 = class225.method1306((byte) -122);
                            for (int var470 = 0; var470 < var469.length; var470++) {
                                class309 var471 = var469[var470];
                                if (var471.field4549 == var466 && var471.field4554 == var467) {
                                    var468 = var470;
                                    break;
                                }
                            }
                            field1715[var2++] = var468;
                            continue;
                        }
                        if (var609 == 5306) {
                            field1715[var2++] = class215.method1266(2);
                            continue;
                        }
                        if (var609 == 5307) {
                            var2--;
                            int var472 = field1715[var2];
                            if (var472 >= 1 && var472 <= 2) {
                                class147.method933(var472, false, -1, 1, -1);
                            }
                            continue;
                        }
                        if (var609 == 5308) {
                            field1715[var2++] = class11.field171;
                            continue;
                        }
                        if (var609 == 5309) {
                            var2--;
                            int var473 = field1715[var2];
                            if (var473 >= 1 && var473 <= 2) {
                                class11.field171 = var473;
                                class253.method1547(23912, class76.field1085);
                            }
                            continue;
                        }
                    } else if (var609 < 5500) {
                        if (var609 == 5400) {
                            var3 -= 2;
                            String var474 = field1710[var3];
                            String var475 = field1710[var3 + 1];
                            var2--;
                            int var476 = field1715[var2];
                            field1716++;
                            class185.field2507.method5(-6445, 124);
                            class185.field2507.method1346(class125.method795(-54, var474) + class125.method795(-65, var475) + 1, 32767);
                            class185.field2507.method1380(65280, var474);
                            class185.field2507.method1380(65280, var475);
                            class185.field2507.method1346(var476, 32767);
                            continue;
                        }
                        if (var609 == 5401) {
                            var2 -= 2;
                            class294.field4219[field1715[var2]] = (short) class424.method2702(false, field1715[var2 + 1]);
                            class86.method611(127);
                            class398.method2562(true);
                            class400.method2579((byte) -98);
                            class143.method912(27294);
                            class145.method927(0);
                            continue;
                        }
                        if (var609 == 5405) {
                            var2 -= 2;
                            int var477 = field1715[var2];
                            int var478 = field1715[var2 + 1];
                            if (var477 >= 0 && var477 < 2) {
                                class164.field2214[var477] = new int[var478 << 1][4];
                            }
                            continue;
                        }
                        if (var609 == 5406) {
                            var2 -= 7;
                            int var479 = field1715[var2];
                            int var480 = field1715[var2 + 1] << 1;
                            int var481 = field1715[var2 + 2];
                            int var482 = field1715[var2 + 3];
                            int var483 = field1715[var2 + 4];
                            int var484 = field1715[var2 + 5];
                            int var485 = field1715[var2 + 6];
                            if (var479 >= 0 && var479 < 2 && class164.field2214[var479] != null && var480 >= 0 && var480 < class164.field2214[var479].length) {
                                class164.field2214[var479][var480] = new int[] { (var481 >> 14 & 0x3FFF) * 128, var482, (var481 & 0x3FFF) * 128, var485 };
                                class164.field2214[var479][var480 + 1] = new int[] { (var483 >> 14 & 0x3FFF) * 128, var484, (var483 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var609 == 5407) {
                            var2--;
                            int var486 = class164.field2214[field1715[var2]].length >> 1;
                            field1715[var2++] = var486;
                            continue;
                        }
                        if (var609 == 5411) {
                            if (class103.field1428 != null) {
                                class147.method933(class11.field171, false, -1, 1, -1);
                            }
                            if (class374.field5447 == null) {
                                String var487 = class182.field2431 == null ? class148.method936((byte) -110) : class182.field2431;
                                class302.method2065(class76.field1085, class373.field5422 == 1, var487, false, (byte) -124);
                            } else {
                                class278.method1917(false);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var609 == 5419) {
                            String var488 = "";
                            if (class307.field4514 != null) {
                                if (class307.field4514.field6309 == null) {
                                    var488 = class223.method1294(6738, class307.field4514.field6307);
                                } else {
                                    var488 = (String) class307.field4514.field6309;
                                }
                            }
                            field1710[var3++] = var488;
                            continue;
                        }
                        if (var609 == 5420) {
                            field1715[var2++] = class36.field511 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 5421) {
                            if (class103.field1428 != null) {
                                class147.method933(class11.field171, false, -1, 1, -1);
                            }
                            var3--;
                            String var489 = field1710[var3];
                            var2--;
                            boolean var490 = field1715[var2] == 1;
                            String var491 = class148.method936((byte) -110) + var489;
                            class302.method2065(class76.field1085, class373.field5422 == 1, var491, var490, (byte) -124);
                            continue;
                        }
                        if (var609 == 5422) {
                            var3 -= 2;
                            String var492 = field1710[var3];
                            String var493 = field1710[var3 + 1];
                            var2--;
                            int var494 = field1715[var2];
                            if (var492.length() > 0) {
                                if (class400.field5965 == null) {
                                    class400.field5965 = new String[class26.field365[class71.field1017]];
                                }
                                class400.field5965[var494] = var492;
                            }
                            if (var493.length() > 0) {
                                if (class44.field617 == null) {
                                    class44.field617 = new String[class26.field365[class71.field1017]];
                                }
                                class44.field617[var494] = var493;
                            }
                            continue;
                        }
                        if (var609 == 5423) {
                            var3--;
                            System.out.println(field1710[var3]);
                            continue;
                        }
                        if (var609 == 5424) {
                            var2 -= 11;
                            class413.field6083 = field1715[var2];
                            class105.field1526 = field1715[var2 + 1];
                            class237.field3170 = field1715[var2 + 2];
                            class338.field4882 = field1715[var2 + 3];
                            class167.field2257 = field1715[var2 + 4];
                            class181.field2399 = field1715[var2 + 5];
                            class328.field4779 = field1715[var2 + 6];
                            class75.field1068 = field1715[var2 + 7];
                            class397.field5913 = field1715[var2 + 8];
                            class260.field3790 = field1715[var2 + 9];
                            class129.field1786 = field1715[var2 + 10];
                            class362.field5227.method2257(true, class167.field2257);
                            class362.field5227.method2257(true, class181.field2399);
                            class362.field5227.method2257(true, class328.field4779);
                            class362.field5227.method2257(true, class75.field1068);
                            class362.field5227.method2257(true, class397.field5913);
                            class61.field802 = null;
                            class169.field2269 = null;
                            class447.field6559 = null;
                            class422.field6218 = null;
                            class300.field4397 = null;
                            class115.field1606 = null;
                            class313.field4582 = null;
                            class229.field3066 = null;
                            class282.field4109 = true;
                            continue;
                        }
                        if (var609 == 5425) {
                            class276.method1900((byte) -100);
                            class282.field4109 = false;
                            continue;
                        }
                        if (var609 == 5426) {
                            var2 -= 2;
                            class139.field1909 = field1715[var2];
                            class195.field2610 = field1715[var2 + 1];
                            continue;
                        }
                        if (var609 == 5427) {
                            var2 -= 2;
                            class317.field4628 = field1715[var2];
                            class284.field4129 = field1715[var2 + 1];
                            continue;
                        }
                        if (var609 == 5428) {
                            var2 -= 2;
                            int var495 = field1715[var2];
                            int var496 = field1715[var2 + 1];
                            field1715[var2++] = class119.method769(77, var495, var496) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 5429) {
                            var3--;
                            class324.method2178(field1710[var3], (byte) -27, false);
                            continue;
                        }
                    } else if (var609 < 5600) {
                        if (var609 == 5500) {
                            var2 -= 4;
                            int var497 = field1715[var2];
                            int var498 = field1715[var2 + 1];
                            int var499 = field1715[var2 + 2];
                            int var500 = field1715[var2 + 3];
                            class430.method2724(var499, false, (var497 & 0x3FFF) - class200.field2660, var500, (byte) 101, var498, (var497 >> 14 & 0x3FFF) - class7.field138);
                            continue;
                        }
                        if (var609 == 5501) {
                            var2 -= 4;
                            int var501 = field1715[var2];
                            int var502 = field1715[var2 + 1];
                            int var503 = field1715[var2 + 2];
                            int var504 = field1715[var2 + 3];
                            class180.method1101(var502, var503, (var501 >> 14 & 0x3FFF) - class7.field138, 1024, (var501 & 0x3FFF) - class200.field2660, var504);
                            continue;
                        }
                        if (var609 == 5502) {
                            var2 -= 6;
                            int var505 = field1715[var2];
                            if (var505 >= 2) {
                                throw new RuntimeException();
                            }
                            class367.field5302 = var505;
                            int var506 = field1715[var2 + 1];
                            if (var506 + 1 >= class164.field2214[class367.field5302].length >> 1) {
                                throw new RuntimeException();
                            }
                            class247.field3330 = var506;
                            class444.field6508 = 0;
                            class163.field2189 = field1715[var2 + 2];
                            class110.field1566 = field1715[var2 + 3];
                            int var507 = field1715[var2 + 4];
                            if (var507 >= 2) {
                                throw new RuntimeException();
                            }
                            class253.field3491 = var507;
                            int var508 = field1715[var2 + 5];
                            if (var508 + 1 >= class164.field2214[class253.field3491].length >> 1) {
                                throw new RuntimeException();
                            }
                            class302.field4450 = var508;
                            class346.field4979 = 3;
                            continue;
                        }
                        if (var609 == 5503) {
                            class272.method1873(true);
                            continue;
                        }
                        if (var609 == 5504) {
                            var2 -= 2;
                            class35.method236(true, field1715[var2 + 1], 0, field1715[var2]);
                            continue;
                        }
                        if (var609 == 5505) {
                            field1715[var2++] = (int) class317.field4647 >> 3;
                            continue;
                        }
                        if (var609 == 5506) {
                            field1715[var2++] = (int) class396.field5847 >> 3;
                            continue;
                        }
                        if (var609 == 5507) {
                            class244.method1466(-125);
                            continue;
                        }
                        if (var609 == 5508) {
                            class135.method849((byte) -116);
                            continue;
                        }
                        if (var609 == 5509) {
                            class185.method1126(15);
                            continue;
                        }
                        if (var609 == 5510) {
                            class426.method2708(119);
                            continue;
                        }
                        if (var609 == 5511) {
                            var2--;
                            int var509 = field1715[var2];
                            int var510 = var509 >> 14 & 0x3FFF;
                            int var511 = var509 & 0x3FFF;
                            int var512 = var510 - class7.field138;
                            if (var512 < 0) {
                                var512 = 0;
                            } else if (var512 >= class192.field2574) {
                                var512 = class192.field2574;
                            }
                            int var513 = var511 - class200.field2660;
                            if (var513 < 0) {
                                var513 = 0;
                            } else if (var513 >= class364.field5262) {
                                var513 = class364.field5262;
                            }
                            class363.field5238 = var512 * 128 + 64;
                            class122.field1687 = var513 * 128 + 64;
                            class346.field4979 = 4;
                            continue;
                        }
                        if (var609 == 5512) {
                            class192.method1158(6122);
                            continue;
                        }
                    } else if (var609 < 5700) {
                        if (var609 == 5600) {
                            var3 -= 2;
                            String var514 = field1710[var3];
                            String var515 = field1710[var3 + 1];
                            var2--;
                            int var516 = field1715[var2];
                            if (class70.field932 == 10 && class281.field4096 == 0 && class188.field2532 == 0 && class163.field2190 == 0 && class220.field2907 == 0) {
                                class166.method1021(var516, var514, var515, -122);
                            }
                            continue;
                        }
                        if (var609 == 5601) {
                            class250.method1519(-76);
                            continue;
                        }
                        if (var609 == 5602) {
                            if (class188.field2532 == 0) {
                                class102.field1416 = -2;
                            }
                            continue;
                        }
                        if (var609 == 5603) {
                            var2 -= 4;
                            if (class70.field932 == 10 && class281.field4096 == 0 && class188.field2532 == 0 && class163.field2190 == 0 && class220.field2907 == 0) {
                                class309.method2101(field1715[var2 + 2], 20, field1715[var2 + 3], field1715[var2], field1715[var2 + 1]);
                            }
                            continue;
                        }
                        if (var609 == 5604) {
                            var3--;
                            if (class70.field932 == 10 && class281.field4096 == 0 && class188.field2532 == 0 && class163.field2190 == 0 && class220.field2907 == 0) {
                                class422.method2695((byte) 25, class126.method802((byte) -80, field1710[var3]));
                            }
                            continue;
                        }
                        if (var609 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class70.field932 == 10 && class281.field4096 == 0 && class188.field2532 == 0 && class163.field2190 == 0 && class220.field2907 == 0) {
                                class200.method1188(field1710[var3 + 1], field1715[var2 + 3], class126.method802((byte) 115, field1710[var3]), field1715[var2], 118, field1710[var3 + 2], field1715[var2 + 2], field1715[var2 + 4] == 1, field1715[var2 + 6] == 1, field1715[var2 + 5] == 1, field1715[var2 + 1]);
                            }
                            continue;
                        }
                        if (var609 == 5606) {
                            if (class163.field2190 == 0) {
                                class214.field2856 = -2;
                            }
                            continue;
                        }
                        if (var609 == 5607) {
                            field1715[var2++] = class102.field1416;
                            continue;
                        }
                        if (var609 == 5608) {
                            field1715[var2++] = class324.field4751;
                            continue;
                        }
                        if (var609 == 5609) {
                            field1715[var2++] = class214.field2856;
                            continue;
                        }
                        if (var609 == 5610) {
                            for (int var517 = 0; var517 < 5; var517++) {
                                field1710[var3++] = class247.field3332.length > var517 ? class296.method2023(true, class247.field3332[var517]) : "";
                            }
                            class247.field3332 = null;
                            continue;
                        }
                        if (var609 == 5611) {
                            field1715[var2++] = class178.field2362;
                            continue;
                        }
                    } else if (var609 < 6100) {
                        if (var609 == 6001) {
                            var2--;
                            int var518 = field1715[var2];
                            if (var518 < 1) {
                                var518 = 1;
                            }
                            if (var518 > 4) {
                                var518 = 4;
                            }
                            class416.field6106 = var518;
                            class400.method2578(-124);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6002) {
                            var2--;
                            class44.method316(field1715[var2] == 1, true);
                            class147.method934(-127);
                            class400.method2578(-117);
                            class43.method313(115);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6003) {
                            var2--;
                            class93.field1342 = field1715[var2] == 1;
                            class43.method313(127);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6005) {
                            var2--;
                            class42.field584 = field1715[var2] == 1;
                            class400.method2578(-128);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6006) {
                            var2--;
                            class411.field6069 = field1715[var2] == 1;
                            class61.field807.method1698(!class411.field6069);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6007) {
                            var2--;
                            class416.field6114 = field1715[var2];
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6008) {
                            var2--;
                            class166.field2240 = field1715[var2] == 1;
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6009) {
                            var2--;
                            class431.field6338 = field1715[var2] == 1;
                            class400.method2578(-107);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6010) {
                            var2--;
                            class120.field1678 = field1715[var2] == 1;
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6011) {
                            var2--;
                            int var519 = field1715[var2];
                            if (var519 < 0 || var519 > 2) {
                                var519 = 0;
                            }
                            class423.field6238 = var519;
                            class400.method2578(-112);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6012) {
                            var2--;
                            class211.field2801 = field1715[var2] == 1;
                            class1.method8(-11);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6014) {
                            var2--;
                            class213.field2853 = field1715[var2] == 1;
                            class400.method2578(-118);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6015) {
                            var2--;
                            class339.field4891 = field1715[var2] == 1;
                            class400.method2578(-124);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6016) {
                            var2--;
                            int var520 = field1715[var2];
                            if (var520 < 0 || var520 > 2) {
                                var520 = 0;
                            }
                            class115.field1611 = var520;
                            class83.method598(0);
                            class253.method1547(23912, class76.field1085);
                            continue;
                        }
                        if (var609 == 6017) {
                            var2--;
                            class299.field4384 = field1715[var2] == 1;
                            class7.method58(-27826);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6018) {
                            var2--;
                            int var521 = field1715[var2];
                            if (var521 < 0) {
                                var521 = 0;
                            }
                            if (var521 > 127) {
                                var521 = 127;
                            }
                            class359.field5186 = var521;
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6019) {
                            var2--;
                            int var522 = field1715[var2];
                            if (var522 < 0) {
                                var522 = 0;
                            }
                            if (var522 > 255) {
                                var522 = 255;
                            }
                            if (class400.field5969 != var522) {
                                if (class400.field5969 == 0 && class196.field2626 != -1) {
                                    class25.method178(class196.field2626, 0, false, var522, false, class385.field5583);
                                    class7.field123 = false;
                                } else if (var522 == 0) {
                                    class32.method214(true);
                                    class7.field123 = false;
                                } else {
                                    class354.method2327(var522, -14375);
                                }
                                class400.field5969 = var522;
                            }
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6020) {
                            var2--;
                            int var523 = field1715[var2];
                            if (var523 < 0) {
                                var523 = 0;
                            }
                            if (var523 > 127) {
                                var523 = 127;
                            }
                            class156.field2123 = var523;
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6021) {
                            var2--;
                            class320.field4689 = field1715[var2] == 1;
                            class43.method313(119);
                            continue;
                        }
                        if (var609 == 6023) {
                            var2--;
                            int var524 = field1715[var2];
                            boolean var525 = false;
                            if (var524 < 0) {
                                var524 = 0;
                            }
                            if (var524 > 2) {
                                var524 = 2;
                            }
                            if (class134.field1867 < 96) {
                                var524 = 0;
                                var525 = true;
                            }
                            class377.method2448(var524, (byte) -2);
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            field1715[var2++] = var525 ? 0 : 1;
                            continue;
                        }
                        if (var609 == 6024) {
                            var2--;
                            int var526 = field1715[var2];
                            if (var526 < 0 || var526 > 2) {
                                var526 = 0;
                            }
                            class286.field4145 = var526;
                            class253.method1547(23912, class76.field1085);
                            continue;
                        }
                        if (var609 == 6025) {
                            var2--;
                            int var527 = field1715[var2];
                            if (var527 < 0 || var527 > 3) {
                                var527 = 0;
                            }
                            class365.field5288 = var527;
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                        if (var609 == 6027) {
                            var2--;
                            int var528 = field1715[var2];
                            if (var528 < 0 || var528 > 1) {
                                var528 = 0;
                            }
                            class42.method300((byte) -21, var528 == 1);
                            continue;
                        }
                        if (var609 == 6028) {
                            var2--;
                            class434.field6387 = field1715[var2] != 0;
                            class253.method1547(23912, class76.field1085);
                            continue;
                        }
                        if (var609 == 6029) {
                            var2--;
                            class416.field6114 = field1715[var2];
                            class253.method1547(23912, class76.field1085);
                            continue;
                        }
                        if (var609 == 6030) {
                            var2--;
                            class275.field3984 = field1715[var2] != 0;
                            class253.method1547(23912, class76.field1085);
                            class400.method2578(-118);
                            continue;
                        }
                        if (var609 == 6031) {
                            var2--;
                            int var529 = field1715[var2];
                            if (var529 < 0 || var529 > 3) {
                                var529 = 2;
                            }
                            class283.method1953(var529, (byte) -22);
                            continue;
                        }
                        if (var609 == 6032) {
                            var2--;
                            int var530 = field1715[var2];
                            if (var530 < 0 || var530 > 3) {
                                var530 = 2;
                            }
                            class196.field2622 = var530;
                            class253.method1547(23912, class76.field1085);
                            class68.field874 = false;
                            continue;
                        }
                    } else if (var609 < 6200) {
                        if (var609 == 6101) {
                            field1715[var2++] = class416.field6106;
                            continue;
                        }
                        if (var609 == 6102) {
                            field1715[var2++] = class11.method79((byte) 115) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6103) {
                            field1715[var2++] = class93.field1342 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6105) {
                            field1715[var2++] = class42.field584 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6106) {
                            field1715[var2++] = class411.field6069 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6107) {
                            field1715[var2++] = class416.field6114;
                            continue;
                        }
                        if (var609 == 6108) {
                            field1715[var2++] = class166.field2240 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6109) {
                            field1715[var2++] = class431.field6338 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6110) {
                            field1715[var2++] = class120.field1678 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6111) {
                            field1715[var2++] = class423.field6238;
                            continue;
                        }
                        if (var609 == 6112) {
                            field1715[var2++] = class211.field2801 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6114) {
                            field1715[var2++] = class213.field2853 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6115) {
                            field1715[var2++] = class339.field4891 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6116) {
                            field1715[var2++] = class115.field1611;
                            continue;
                        }
                        if (var609 == 6117) {
                            field1715[var2++] = class299.field4384 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6118) {
                            field1715[var2++] = class359.field5186;
                            continue;
                        }
                        if (var609 == 6119) {
                            field1715[var2++] = class400.field5969;
                            continue;
                        }
                        if (var609 == 6120) {
                            field1715[var2++] = class156.field2123;
                            continue;
                        }
                        if (var609 == 6121) {
                            field1715[var2++] = class61.field807.method1640() ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6123) {
                            field1715[var2++] = class248.method1498((byte) 23);
                            continue;
                        }
                        if (var609 == 6124) {
                            field1715[var2++] = class286.field4145;
                            continue;
                        }
                        if (var609 == 6125) {
                            field1715[var2++] = class365.field5288;
                            continue;
                        }
                        if (var609 == 6126) {
                            field1715[var2++] = class61.field807.method1730() ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6127) {
                            field1715[var2++] = class324.field4753 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6128) {
                            field1715[var2++] = class434.field6387 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6129) {
                            field1715[var2++] = class416.field6114;
                            continue;
                        }
                        if (var609 == 6130) {
                            field1715[var2++] = class275.field3984 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6131) {
                            field1715[var2++] = class373.field5422;
                            continue;
                        }
                        if (var609 == 6132) {
                            field1715[var2++] = class196.field2622;
                            continue;
                        }
                        if (var609 == 6133) {
                            field1715[var2++] = class36.field511 == 1 || class36.field511 == 4 ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 6300) {
                        if (var609 == 6200) {
                            var2 -= 2;
                            class103.field1420 = (short) field1715[var2];
                            if (class103.field1420 <= 0) {
                                class103.field1420 = 256;
                            }
                            class354.field5125 = (short) field1715[var2 + 1];
                            if (class354.field5125 <= 0) {
                                class354.field5125 = 205;
                            }
                            continue;
                        }
                        if (var609 == 6201) {
                            var2 -= 2;
                            class143.field1956 = (short) field1715[var2];
                            if (class143.field1956 <= 0) {
                                class143.field1956 = 256;
                            }
                            class219.field2904 = (short) field1715[var2 + 1];
                            if (class219.field2904 <= 0) {
                                class219.field2904 = 320;
                            }
                            continue;
                        }
                        if (var609 == 6202) {
                            var2 -= 4;
                            class397.field5907 = (short) field1715[var2];
                            if (class397.field5907 <= 0) {
                                class397.field5907 = 1;
                            }
                            class140.field1919 = (short) field1715[var2 + 1];
                            if (class140.field1919 <= 0) {
                                class140.field1919 = 32767;
                            } else if (class140.field1919 < class397.field5907) {
                                class140.field1919 = class397.field5907;
                            }
                            class242.field3232 = (short) field1715[var2 + 2];
                            if (class242.field3232 <= 0) {
                                class242.field3232 = 1;
                            }
                            class226.field2971 = (short) field1715[var2 + 3];
                            if (class226.field2971 <= 0) {
                                class226.field2971 = 32767;
                            } else if (class226.field2971 < class242.field3232) {
                                class226.field2971 = class242.field3232;
                            }
                            continue;
                        }
                        if (var609 == 6203) {
                            class365.method2384(class393.field5624.field5773, (byte) -105, false, 0, class393.field5624.field5672, 0);
                            field1715[var2++] = class72.field1037;
                            field1715[var2++] = class281.field4098;
                            continue;
                        }
                        if (var609 == 6204) {
                            field1715[var2++] = class143.field1956;
                            field1715[var2++] = class219.field2904;
                            continue;
                        }
                        if (var609 == 6205) {
                            field1715[var2++] = class103.field1420;
                            field1715[var2++] = class354.field5125;
                            continue;
                        }
                    } else if (var609 < 6400) {
                        if (var609 == 6300) {
                            field1715[var2++] = (int) (class114.method735(124) / 60000L);
                            continue;
                        }
                        if (var609 == 6301) {
                            field1715[var2++] = (int) (class114.method735(97) / 86400000L) - 11745;
                            continue;
                        }
                        if (var609 == 6302) {
                            var2 -= 3;
                            int var531 = field1715[var2];
                            int var532 = field1715[var2 + 1];
                            int var533 = field1715[var2 + 2];
                            field1714.clear();
                            field1714.set(11, 12);
                            field1714.set(var533, var532, var531);
                            field1715[var2++] = (int) (field1714.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var609 == 6303) {
                            field1714.clear();
                            field1714.setTime(new Date(class114.method735(109)));
                            field1715[var2++] = field1714.get(1);
                            continue;
                        }
                        if (var609 == 6304) {
                            var2--;
                            int var534 = field1715[var2];
                            boolean var535 = true;
                            if (var534 < 0) {
                                var535 = (var534 + 1) % 4 == 0;
                            } else if (var534 < 1582) {
                                var535 = var534 % 4 == 0;
                            } else if (var534 % 4 != 0) {
                                var535 = false;
                            } else if (var534 % 100 != 0) {
                                var535 = true;
                            } else if (var534 % 400 != 0) {
                                var535 = false;
                            }
                            field1715[var2++] = var535 ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 6500) {
                        if (var609 == 6405) {
                            field1715[var2++] = class445.method2807((byte) 105) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6406) {
                            field1715[var2++] = class192.method1157(-120) ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 6600) {
                        if (var609 == 6500) {
                            if (class70.field932 == 10 && class281.field4096 == 0 && class188.field2532 == 0 && class163.field2190 == 0) {
                                field1715[var2++] = class71.method519(-1) == -1 ? 0 : 1;
                                continue;
                            }
                            field1715[var2++] = 1;
                            continue;
                        }
                        if (var609 == 6501) {
                            class92 var536 = class306.method2089(36);
                            if (var536 == null) {
                                field1715[var2++] = -1;
                                field1715[var2++] = 0;
                                field1710[var3++] = "";
                                field1715[var2++] = 0;
                                field1710[var3++] = "";
                                field1715[var2++] = 0;
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var536.field1300;
                                field1715[var2++] = var536.field1243;
                                field1710[var3++] = var536.field1302;
                                class393 var537 = var536.method645(-25881);
                                field1715[var2++] = var537.field5622;
                                field1710[var3++] = var537.field5625;
                                field1715[var2++] = var536.field1242;
                                field1715[var2++] = var536.field1305;
                            }
                            continue;
                        }
                        if (var609 == 6502) {
                            class92 var538 = class431.method2733(-1);
                            if (var538 == null) {
                                field1715[var2++] = -1;
                                field1715[var2++] = 0;
                                field1710[var3++] = "";
                                field1715[var2++] = 0;
                                field1710[var3++] = "";
                                field1715[var2++] = 0;
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var538.field1300;
                                field1715[var2++] = var538.field1243;
                                field1710[var3++] = var538.field1302;
                                class393 var539 = var538.method645(-25881);
                                field1715[var2++] = var539.field5622;
                                field1710[var3++] = var539.field5625;
                                field1715[var2++] = var538.field1242;
                                field1715[var2++] = var538.field1305;
                            }
                            continue;
                        }
                        if (var609 == 6503) {
                            var2--;
                            int var540 = field1715[var2];
                            if (class70.field932 == 10 && class281.field4096 == 0 && class188.field2532 == 0 && class163.field2190 == 0) {
                                field1715[var2++] = class237.method1428(var540, true) ? 1 : 0;
                                continue;
                            }
                            field1715[var2++] = 0;
                            continue;
                        }
                        if (var609 == 6504) {
                            var2--;
                            class71.field1022 = field1715[var2];
                            class253.method1547(23912, class76.field1085);
                            continue;
                        }
                        if (var609 == 6505) {
                            field1715[var2++] = class71.field1022;
                            continue;
                        }
                        if (var609 == 6506) {
                            var2--;
                            int var541 = field1715[var2];
                            class92 var542 = class282.method1943(var541, -3490);
                            if (var542 == null) {
                                field1715[var2++] = -1;
                                field1710[var3++] = "";
                                field1715[var2++] = 0;
                                field1710[var3++] = "";
                                field1715[var2++] = 0;
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = var542.field1243;
                                field1710[var3++] = var542.field1302;
                                class393 var543 = var542.method645(-25881);
                                field1715[var2++] = var543.field5622;
                                field1710[var3++] = var543.field5625;
                                field1715[var2++] = var542.field1242;
                                field1715[var2++] = var542.field1305;
                            }
                            continue;
                        }
                        if (var609 == 6507) {
                            var2 -= 4;
                            int var544 = field1715[var2];
                            boolean var545 = field1715[var2 + 1] == 1;
                            int var546 = field1715[var2 + 2];
                            boolean var547 = field1715[var2 + 3] == 1;
                            class145.method923(var545, var547, false, var546, var544);
                            continue;
                        }
                        if (var609 == 6508) {
                            class182.method1115(false);
                            continue;
                        }
                        if (var609 == 6509) {
                            if (class70.field932 == 10) {
                                var2--;
                                if (field1715[var2] == 1) {
                                    if (class130.field1795 == null) {
                                        class130.field1795 = new class57();
                                    }
                                } else if (class130.field1795 != null) {
                                    class130.field1795.method395((byte) -89);
                                    class130.field1795 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var609 < 6700) {
                        if (var609 == 6600) {
                            var2--;
                            class184.field2496 = field1715[var2] == 1;
                            class253.method1547(23912, class76.field1085);
                            continue;
                        }
                        if (var609 == 6601) {
                            field1715[var2++] = class184.field2496 ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 6800 && class63.field846 == 2) {
                        if (var609 == 6700) {
                            int var548 = class99.field1377.method383(0);
                            if (class329.field4790 != -1) {
                                var548++;
                            }
                            field1715[var2++] = var548;
                            continue;
                        }
                        if (var609 == 6701) {
                            var2--;
                            int var549 = field1715[var2];
                            if (class329.field4790 != -1) {
                                if (var549 == 0) {
                                    field1715[var2++] = class329.field4790;
                                    continue;
                                }
                                var549--;
                            }
                            class169 var550 = (class169) class99.field1377.method389(0);
                            while (var549-- > 0) {
                                var550 = (class169) class99.field1377.method388(0);
                            }
                            field1715[var2++] = var550.field2275;
                            continue;
                        }
                        if (var609 == 6702) {
                            var2--;
                            int var551 = field1715[var2];
                            if (class365.field5292[var551] == null) {
                                field1710[var3++] = "";
                            } else {
                                String var552 = class365.field5292[var551][0].field5685;
                                if (var552 == null) {
                                    field1710[var3++] = "";
                                } else {
                                    field1710[var3++] = var552.substring(0, var552.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var609 == 6703) {
                            var2--;
                            int var553 = field1715[var2];
                            if (class365.field5292[var553] == null) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = class365.field5292[var553].length;
                            }
                            continue;
                        }
                        if (var609 == 6704) {
                            var2 -= 2;
                            int var554 = field1715[var2];
                            int var555 = field1715[var2 + 1];
                            if (class365.field5292[var554] == null) {
                                field1710[var3++] = "";
                            } else {
                                String var556 = class365.field5292[var554][var555].field5685;
                                if (var556 == null) {
                                    field1710[var3++] = "";
                                } else {
                                    field1710[var3++] = var556;
                                }
                            }
                            continue;
                        }
                        if (var609 == 6705) {
                            var2 -= 2;
                            int var557 = field1715[var2];
                            int var558 = field1715[var2 + 1];
                            if (class365.field5292[var557] == null) {
                                field1715[var2++] = 0;
                            } else {
                                field1715[var2++] = class365.field5292[var557][var558].field5634;
                            }
                            continue;
                        }
                        if (var609 == 6706) {
                            continue;
                        }
                        if (var609 == 6707) {
                            var2 -= 3;
                            int var559 = field1715[var2];
                            int var560 = field1715[var2 + 1];
                            int var561 = field1715[var2 + 2];
                            class403.method2601(var561, var559 << 16 | var560, 1, "", (byte) 116);
                            continue;
                        }
                        if (var609 == 6708) {
                            var2 -= 3;
                            int var562 = field1715[var2];
                            int var563 = field1715[var2 + 1];
                            int var564 = field1715[var2 + 2];
                            class403.method2601(var564, var562 << 16 | var563, 2, "", (byte) 101);
                            continue;
                        }
                        if (var609 == 6709) {
                            var2 -= 3;
                            int var565 = field1715[var2];
                            int var566 = field1715[var2 + 1];
                            int var567 = field1715[var2 + 2];
                            class403.method2601(var567, var565 << 16 | var566, 3, "", (byte) 96);
                            continue;
                        }
                        if (var609 == 6710) {
                            var2 -= 3;
                            int var568 = field1715[var2];
                            int var569 = field1715[var2 + 1];
                            int var570 = field1715[var2 + 2];
                            class403.method2601(var570, var568 << 16 | var569, 4, "", (byte) 92);
                            continue;
                        }
                        if (var609 == 6711) {
                            var2 -= 3;
                            int var571 = field1715[var2];
                            int var572 = field1715[var2 + 1];
                            int var573 = field1715[var2 + 2];
                            class403.method2601(var573, var571 << 16 | var572, 5, "", (byte) 106);
                            continue;
                        }
                        if (var609 == 6712) {
                            var2 -= 3;
                            int var574 = field1715[var2];
                            int var575 = field1715[var2 + 1];
                            int var576 = field1715[var2 + 2];
                            class403.method2601(var576, var574 << 16 | var575, 6, "", (byte) 98);
                            continue;
                        }
                        if (var609 == 6713) {
                            var2 -= 3;
                            int var577 = field1715[var2];
                            int var578 = field1715[var2 + 1];
                            int var579 = field1715[var2 + 2];
                            class403.method2601(var579, var577 << 16 | var578, 7, "", (byte) 99);
                            continue;
                        }
                        if (var609 == 6714) {
                            var2 -= 3;
                            int var580 = field1715[var2];
                            int var581 = field1715[var2 + 1];
                            int var582 = field1715[var2 + 2];
                            class403.method2601(var582, var580 << 16 | var581, 8, "", (byte) 115);
                            continue;
                        }
                        if (var609 == 6715) {
                            var2 -= 3;
                            int var583 = field1715[var2];
                            int var584 = field1715[var2 + 1];
                            int var585 = field1715[var2 + 2];
                            class403.method2601(var585, var583 << 16 | var584, 9, "", (byte) 113);
                            continue;
                        }
                        if (var609 == 6716) {
                            var2 -= 3;
                            int var586 = field1715[var2];
                            int var587 = field1715[var2 + 1];
                            int var588 = field1715[var2 + 2];
                            class403.method2601(var588, var586 << 16 | var587, 10, "", (byte) 127);
                            continue;
                        }
                        if (var609 == 6717) {
                            var2 -= 3;
                            int var589 = field1715[var2];
                            int var590 = field1715[var2 + 1];
                            int var591 = field1715[var2 + 2];
                            class394 var592 = class388.method2492((byte) -126, var591, var589 << 16 | var590);
                            class151.method946(-86);
                            class304 var593 = client.method1544(var592);
                            class213.method1264(var593.method2066((byte) -126), true, var591, var592.field5748, var592.field5716, var589 << 16 | var590, var593.field4474);
                            continue;
                        }
                    } else if (var609 < 6900) {
                        if (var609 == 6800) {
                            var2--;
                            int var594 = field1715[var2];
                            class7 var595 = class99.method674(36, var594);
                            if (var595.field113 == null) {
                                field1710[var3++] = "";
                            } else {
                                field1710[var3++] = var595.field113;
                            }
                            continue;
                        }
                        if (var609 == 6801) {
                            var2--;
                            int var596 = field1715[var2];
                            class7 var597 = class99.method674(36, var596);
                            field1715[var2++] = var597.field98;
                            continue;
                        }
                        if (var609 == 6802) {
                            var2--;
                            int var598 = field1715[var2];
                            class7 var599 = class99.method674(36, var598);
                            field1715[var2++] = var599.field129;
                            continue;
                        }
                        if (var609 == 6803) {
                            var2--;
                            int var600 = field1715[var2];
                            class7 var601 = class99.method674(36, var600);
                            field1715[var2++] = var601.field100;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var608) {
            if (arg0.field1981 == null) {
                StringBuffer var606 = new StringBuffer(30);
                var606.append("CS2: ").append(arg0.field640).append(" ");
                for (int var607 = field1705 - 1; var607 >= 0; var607--) {
                    var606.append("v: ").append(field1696[var607].field6391.field640).append(" ");
                }
                var606.append("op: ").append(var7);
                class248.method1494(var606.toString(), 78, var608);
            } else {
                class197.method1175(0, "Clientscript error in: " + arg0.field1981);
                StringBuffer var603 = new StringBuffer(30);
                var603.append("Clientscript error in: ").append(arg0.field1981).append("\n");
                for (int var604 = field1705 - 1; var604 >= 0; var604--) {
                    var603.append("via: ").append(field1696[var604].field6391.field1981).append("\n");
                }
                var603.append("Op: ").append(var7).append("\n");
                String var605 = var608.getMessage();
                if (var605 != null && var605.length() > 0) {
                    var603.append("Message: ").append(var605).append("\n");
                }
                class248.method1494(var603.toString(), -117, var608);
                class386.method2484(var603.toString(), true);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
    public static final void method782(int arg0, int arg1, int arg2) {
        class145 var3 = class321.method2161((byte) 37, arg2, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field1711 = new int[var3.field1986];
        field1706 = new String[var3.field1994];
        if (var3.field1985 == 15 || var3.field1985 == 17 || var3.field1985 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class259.field3785 != null) {
                var4 = class259.field3785.field5821;
                var5 = class259.field3785.field5779;
            }
            field1711[0] = class124.field1728 - var4;
            field1711[1] = class323.field4747 - var5;
        }
        method781(var3, 200000);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lco;)V")
    public static final void method783(class192 arg0) {
        method785(arg0, 200000);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static final void method784(int arg0) {
        if (arg0 == -1 || !class395.method2537((byte) -121, arg0)) {
            return;
        }
        class394[] var1 = class365.field5292[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class394 var3 = var1[var2];
            if (var3.field5688 != null) {
                class192 var4 = new class192();
                var4.field2566 = var3;
                var4.field2578 = var3.field5688;
                method785(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lco;I)V")
    private static final void method785(class192 arg0, int arg1) {
        Object[] var2 = arg0.field2578;
        int var3 = (Integer) var2[0];
        class145 var4 = class390.method2509(0, var3);
        if (var4 == null) {
            return;
        }
        field1711 = new int[var4.field1986];
        int var5 = 0;
        field1706 = new String[var4.field1994];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2583;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2568;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2566 == null ? -1 : arg0.field2566.field5698;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2576;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2566 == null ? -1 : arg0.field2566.field5649;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2565 == null ? -1 : arg0.field2565.field5698;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2565 == null ? -1 : arg0.field2565.field5649;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2581;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2569;
                }
                field1711[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2582;
                }
                field1706[var6++] = var9;
            }
        }
        method781(var4, arg1);
    }
}
