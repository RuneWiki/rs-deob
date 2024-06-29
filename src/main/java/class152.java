import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class152 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2456 = 10;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "[Lse;")
    public static class10[] field2461 = new class10[14];

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2464 = new String[500];

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2462 = "slide:";

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field2459;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[I")
    public int[] field2463;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZIILjava/awt/Graphics;I)V")
    public abstract void method422(int arg0, boolean arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method427(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field2461 = null;
        if (arg0 != 0) {
            field2456 = 29;
        }
        field2464 = null;
        field2462 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method1028(int arg0) {
        class63.method508(this.field2463, this.field2454, this.field2466);
        if (arg0 > -13) {
            method1029(-42, -64, (class173) null);
        }
        field2460++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public abstract void method428(Component arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILpl;)V")
    public static final void method1029(int arg0, int arg1, class173 arg2) {
        Object[] var3 = arg2.field2798;
        field2455++;
        int var4 = (Integer) var3[0];
        class297 var5 = class218.method1448(0, var4);
        if (var5 == null) {
            return;
        }
        class49.field633 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = var5.field4689;
        byte var9 = -1;
        int var10 = -1;
        int[] var11 = var5.field4703;
        try {
            if (arg1 < 31) {
                field2461 = null;
            }
            int var12 = 0;
            class3.field35 = new String[var5.field4700];
            class268.field4349 = new int[var5.field4688];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field2789;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field2785;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field2796 == null ? -1 : arg2.field2796.field1659;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field2788;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field2796 == null ? -1 : arg2.field2796.field1680;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field2804 == null ? -1 : arg2.field2804.field1659;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field2804 == null ? -1 : arg2.field2804.field1680;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field2797;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field2787;
                    }
                    class268.field4349[var13++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg2.field2793;
                    }
                    class3.field35[var12++] = var16;
                }
            }
            int var17 = 0;
            label4027: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var517 = var11[var10];
                if (var517 < 100) {
                    if (var517 == 0) {
                        class62.field875[var6++] = var8[var10];
                        continue;
                    }
                    if (var517 == 1) {
                        int var18 = var8[var10];
                        class62.field875[var6++] = class214.field3454[var18];
                        continue;
                    }
                    if (var517 == 2) {
                        int var19 = var8[var10];
                        var6--;
                        class236.method1553(class62.field875[var6], (byte) 3, var19);
                        continue;
                    }
                    if (var517 == 3) {
                        class281.field4489[var7++] = var5.field4696[var10];
                        continue;
                    }
                    if (var517 == 6) {
                        var10 += var8[var10];
                        continue;
                    }
                    if (var517 == 7) {
                        var6 -= 2;
                        if (class62.field875[var6 + 1] != class62.field875[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var517 == 8) {
                        var6 -= 2;
                        if (class62.field875[var6 + 1] == class62.field875[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var517 == 9) {
                        var6 -= 2;
                        if (class62.field875[var6 + 1] > class62.field875[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var517 == 10) {
                        var6 -= 2;
                        if (class62.field875[var6] > class62.field875[var6 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var517 == 21) {
                        if (class49.field633 == 0) {
                            return;
                        }
                        class198 var20 = class186.field2987[--class49.field633];
                        var5 = var20.field3185;
                        class3.field35 = var20.field3190;
                        var11 = var5.field4703;
                        var10 = var20.field3184;
                        class268.field4349 = var20.field3192;
                        var8 = var5.field4689;
                        continue;
                    }
                    if (var517 == 25) {
                        int var21 = var8[var10];
                        class62.field875[var6++] = class293.method1963((byte) -61, var21);
                        continue;
                    }
                    if (var517 == 27) {
                        int var22 = var8[var10];
                        var6--;
                        class297.method1984((byte) 98, var22, class62.field875[var6]);
                        continue;
                    }
                    if (var517 == 31) {
                        var6 -= 2;
                        if (class62.field875[var6] <= class62.field875[var6 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var517 == 32) {
                        var6 -= 2;
                        if (class62.field875[var6] >= class62.field875[var6 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var517 == 33) {
                        class62.field875[var6++] = class268.field4349[var8[var10]];
                        continue;
                    }
                    int var10001;
                    if (var517 == 34) {
                        var10001 = var8[var10];
                        var6--;
                        class268.field4349[var10001] = class62.field875[var6];
                        continue;
                    }
                    if (var517 == 35) {
                        class281.field4489[var7++] = class3.field35[var8[var10]];
                        continue;
                    }
                    if (var517 == 36) {
                        var10001 = var8[var10];
                        var7--;
                        class3.field35[var10001] = class281.field4489[var7];
                        continue;
                    }
                    if (var517 == 37) {
                        int var23 = var8[var10];
                        var7 -= var23;
                        String var24 = class194.method1307(var23, class281.field4489, (byte) 70, var7);
                        class281.field4489[var7++] = var24;
                        continue;
                    }
                    if (var517 == 38) {
                        var6--;
                        continue;
                    }
                    if (var517 == 39) {
                        var7--;
                        continue;
                    }
                    if (var517 == 40) {
                        int var25 = var8[var10];
                        class297 var26 = class218.method1448(0, var25);
                        int[] var27 = new int[var26.field4688];
                        String[] var28 = new String[var26.field4700];
                        for (int var29 = 0; var29 < var26.field4701; var29++) {
                            var27[var29] = class62.field875[var6 + var29 - var26.field4701];
                        }
                        for (int var30 = 0; var30 < var26.field4707; var30++) {
                            var28[var30] = class281.field4489[var7 + var30 - var26.field4707];
                        }
                        var7 -= var26.field4707;
                        var6 -= var26.field4701;
                        class198 var31 = new class198();
                        var31.field3185 = var5;
                        var31.field3192 = class268.field4349;
                        var31.field3190 = class3.field35;
                        var31.field3184 = var10;
                        if (class49.field633 >= class186.field2987.length) {
                            throw new RuntimeException();
                        }
                        var10 = -1;
                        class186.field2987[class49.field633++] = var31;
                        var5 = var26;
                        var8 = var26.field4689;
                        class3.field35 = var28;
                        var11 = var26.field4703;
                        class268.field4349 = var27;
                        continue;
                    }
                    if (var517 == 42) {
                        class62.field875[var6++] = class189.field3028[var8[var10]];
                        continue;
                    }
                    if (var517 == 43) {
                        int var32 = var8[var10];
                        var6--;
                        class189.field3028[var32] = class62.field875[var6];
                        class44.method343(var32, 16);
                        continue;
                    }
                    if (var517 == 44) {
                        int var33 = var8[var10] >> 16;
                        int var34 = var8[var10] & 0xFFFF;
                        var6--;
                        int var35 = class62.field875[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            class117.field1986[var33] = var35;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label4027;
                                }
                                class49.field679[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 45) {
                        int var38 = var8[var10];
                        var6--;
                        int var39 = class62.field875[var6];
                        if (var39 >= 0 && var39 < class117.field1986[var38]) {
                            class62.field875[var6++] = class49.field679[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 46) {
                        var6 -= 2;
                        int var40 = var8[var10];
                        int var41 = class62.field875[var6];
                        if (var41 >= 0 && var41 < class117.field1986[var40]) {
                            class49.field679[var40][var41] = class62.field875[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 47) {
                        String var42 = class111.field1923[var8[var10]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class281.field4489[var7++] = var42;
                        continue;
                    }
                    if (var517 == 48) {
                        int var43 = var8[var10];
                        var7--;
                        class111.field1923[var43] = class281.field4489[var7];
                        class30.method210(var43, 95);
                        continue;
                    }
                    if (var517 == 51) {
                        class61 var44 = var5.field4705[var8[var10]];
                        var6--;
                        class119 var45 = (class119) var44.method457((long) class62.field875[var6], (byte) -115);
                        if (var45 != null) {
                            var10 += var45.field2011;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var8[var10] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var517 < 300) {
                    if (var517 == 100) {
                        var6 -= 3;
                        int var47 = class62.field875[var6];
                        int var48 = class62.field875[var6 + 1];
                        int var49 = class62.field875[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class103 var50 = class168.method1180(8931, var47);
                        if (var50.field1624 == null) {
                            var50.field1624 = new class103[var49 + 1];
                        }
                        if (var50.field1624.length <= var49) {
                            class103[] var51 = new class103[var49 + 1];
                            for (int var52 = 0; var52 < var50.field1624.length; var52++) {
                                var51[var52] = var50.field1624[var52];
                            }
                            var50.field1624 = var51;
                        }
                        if (var49 > 0 && var50.field1624[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class103 var53 = new class103();
                        var53.field1602 = var53.field1659 = var50.field1659;
                        var53.field1680 = var49;
                        var53.field1603 = true;
                        var53.field1655 = var48;
                        var50.field1624[var49] = var53;
                        if (var46) {
                            class247.field3976 = var53;
                        } else {
                            class157.field2509 = var53;
                        }
                        class45.method346((byte) 127, var50);
                        continue;
                    }
                    if (var517 == 101) {
                        class103 var54 = var46 ? class247.field3976 : class157.field2509;
                        if (var54.field1680 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class103 var55 = class168.method1180(8931, var54.field1659);
                        var55.field1624[var54.field1680] = null;
                        class45.method346((byte) 118, var55);
                        continue;
                    }
                    if (var517 == 102) {
                        var6--;
                        class103 var56 = class168.method1180(8931, class62.field875[var6]);
                        var56.field1624 = null;
                        class45.method346((byte) 79, var56);
                        continue;
                    }
                    if (var517 == 200) {
                        var6 -= 2;
                        int var57 = class62.field875[var6];
                        int var58 = class62.field875[var6 + 1];
                        class103 var59 = class122.method859(var58, (byte) -115, var57);
                        if (var59 != null && var58 != -1) {
                            class62.field875[var6++] = 1;
                            if (var46) {
                                class247.field3976 = var59;
                            } else {
                                class157.field2509 = var59;
                            }
                            continue;
                        }
                        class62.field875[var6++] = 0;
                        continue;
                    }
                    if (var517 == 201) {
                        var6--;
                        int var60 = class62.field875[var6];
                        class103 var61 = class168.method1180(8931, var60);
                        if (var61 == null) {
                            class62.field875[var6++] = 0;
                        } else {
                            class62.field875[var6++] = 1;
                            if (var46) {
                                class247.field3976 = var61;
                            } else {
                                class157.field2509 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var517 < 500) {
                    if (var517 == 403) {
                        var6 -= 2;
                        int var505 = class62.field875[var6];
                        int var506 = class62.field875[var6 + 1];
                        for (int var507 = 0; var507 < class5.field61.length; var507++) {
                            if (class5.field61[var507] == var505) {
                                class197.field3179.field3746.method680(var506, 1073741823, var507);
                                continue label4027;
                            }
                        }
                        int var508 = 0;
                        while (true) {
                            if (var508 >= class95.field1439.length) {
                                continue label4027;
                            }
                            if (class95.field1439[var508] == var505) {
                                class197.field3179.field3746.method680(var506, 1073741823, var508);
                                continue label4027;
                            }
                            var508++;
                        }
                    }
                    if (var517 == 404) {
                        var6 -= 2;
                        int var509 = class62.field875[var6 + 1];
                        int var510 = class62.field875[var6];
                        class197.field3179.field3746.method673(var509, 0, var510);
                        continue;
                    }
                    if (var517 == 410) {
                        var6--;
                        boolean var511 = class62.field875[var6] != 0;
                        class197.field3179.field3746.method681(var511, 8360);
                        continue;
                    }
                } else if (!(var517 < 1000 || var517 >= 1100) || !(var517 < 2000 || var517 >= 2100)) {
                    class103 var499;
                    if (var517 >= 2000) {
                        var6--;
                        var499 = class168.method1180(8931, class62.field875[var6]);
                        var517 -= 1000;
                    } else {
                        var499 = var46 ? class247.field3976 : class157.field2509;
                    }
                    if (var517 == 1000) {
                        var6 -= 4;
                        var499.field1640 = class62.field875[var6];
                        var499.field1681 = class62.field875[var6 + 1];
                        int var500 = class62.field875[var6 + 3];
                        if (var500 < 0) {
                            var500 = 0;
                        } else if (var500 > 5) {
                            var500 = 5;
                        }
                        int var501 = class62.field875[var6 + 2];
                        var499.field1720 = (byte) var500;
                        if (var501 < 0) {
                            var501 = 0;
                        } else if (var501 > 5) {
                            var501 = 5;
                        }
                        var499.field1660 = (byte) var501;
                        class45.method346((byte) 91, var499);
                        class173.method1204(var499, 1);
                        if (var499.field1680 == -1) {
                            class263.method1728(-125, var499.field1659);
                        }
                        continue;
                    }
                    if (var517 == 1001) {
                        var6 -= 4;
                        var499.field1597 = class62.field875[var6];
                        var499.field1626 = class62.field875[var6 + 1];
                        var499.field1690 = 0;
                        var499.field1615 = 0;
                        int var502 = class62.field875[var6 + 2];
                        int var503 = class62.field875[var6 + 3];
                        if (var502 < 0) {
                            var502 = 0;
                        } else if (var502 > 4) {
                            var502 = 4;
                        }
                        if (var503 < 0) {
                            var503 = 0;
                        } else if (var503 > 4) {
                            var503 = 4;
                        }
                        var499.field1584 = (byte) var503;
                        var499.field1644 = (byte) var502;
                        class45.method346((byte) 53, var499);
                        class173.method1204(var499, 1);
                        if (var499.field1655 == 0) {
                            class88.method624(false, (byte) 114, var499);
                        }
                        continue;
                    }
                    if (var517 == 1003) {
                        var6--;
                        boolean var504 = class62.field875[var6] == 1;
                        if (var504 != var499.field1684) {
                            var499.field1684 = var504;
                            class45.method346((byte) 47, var499);
                        }
                        if (var499.field1680 == -1) {
                            class225.method1486((byte) 126, var499.field1659);
                        }
                        continue;
                    }
                    if (var517 == 1004) {
                        var6 -= 2;
                        var499.field1652 = class62.field875[var6];
                        var499.field1673 = class62.field875[var6 + 1];
                        class45.method346((byte) 66, var499);
                        class173.method1204(var499, 1);
                        if (var499.field1655 == 0) {
                            class88.method624(false, (byte) 105, var499);
                        }
                        continue;
                    }
                    if (var517 == 1005) {
                        var6--;
                        var499.field1651 = class62.field875[var6] == 1;
                        continue;
                    }
                } else if (!(var517 < 1100 || var517 >= 1200) || !(var517 < 2100 || var517 >= 2200)) {
                    class103 var495;
                    if (var517 >= 2000) {
                        var517 -= 1000;
                        var6--;
                        var495 = class168.method1180(8931, class62.field875[var6]);
                    } else {
                        var495 = var46 ? class247.field3976 : class157.field2509;
                    }
                    if (var517 == 1100) {
                        var6 -= 2;
                        var495.field1590 = class62.field875[var6];
                        if (var495.field1721 - var495.field1691 < var495.field1590) {
                            var495.field1590 = var495.field1721 - var495.field1691;
                        }
                        if (var495.field1590 < 0) {
                            var495.field1590 = 0;
                        }
                        var495.field1639 = class62.field875[var6 + 1];
                        if (var495.field1639 > (var495.field1561 - var495.field1693)) {
                            var495.field1639 = var495.field1561 - var495.field1693;
                        }
                        if (var495.field1639 < 0) {
                            var495.field1639 = 0;
                        }
                        class45.method346((byte) 94, var495);
                        if (var495.field1680 == -1) {
                            class131.method910(var495.field1659, true);
                        }
                        continue;
                    }
                    if (var517 == 1101) {
                        var6--;
                        var495.field1713 = class62.field875[var6];
                        class45.method346((byte) 85, var495);
                        if (var495.field1680 == -1) {
                            class262.method1719(var495.field1659, (byte) 86);
                        }
                        continue;
                    }
                    if (var517 == 1102) {
                        var6--;
                        var495.field1663 = class62.field875[var6] == 1;
                        class45.method346((byte) 95, var495);
                        continue;
                    }
                    if (var517 == 1103) {
                        var6--;
                        var495.field1658 = class62.field875[var6];
                        class45.method346((byte) 25, var495);
                        continue;
                    }
                    if (var517 == 1104) {
                        var6--;
                        var495.field1637 = class62.field875[var6];
                        class45.method346((byte) 109, var495);
                        continue;
                    }
                    if (var517 == 1105) {
                        var6--;
                        var495.field1698 = class62.field875[var6];
                        class45.method346((byte) 116, var495);
                        continue;
                    }
                    if (var517 == 1106) {
                        var6--;
                        var495.field1623 = class62.field875[var6];
                        class45.method346((byte) 46, var495);
                        continue;
                    }
                    if (var517 == 1107) {
                        var6--;
                        var495.field1583 = class62.field875[var6] == 1;
                        class45.method346((byte) 77, var495);
                        continue;
                    }
                    if (var517 == 1108) {
                        var495.field1631 = 1;
                        var6--;
                        var495.field1724 = class62.field875[var6];
                        class45.method346((byte) 46, var495);
                        if (var495.field1680 == -1) {
                            class22.method152(var495.field1659, 5);
                        }
                        continue;
                    }
                    if (var517 == 1109) {
                        var6 -= 6;
                        var495.field1699 = class62.field875[var6];
                        var495.field1563 = class62.field875[var6 + 1];
                        var495.field1683 = class62.field875[var6 + 2];
                        var495.field1605 = class62.field875[var6 + 3];
                        var495.field1579 = class62.field875[var6 + 4];
                        var495.field1598 = class62.field875[var6 + 5];
                        class45.method346((byte) 48, var495);
                        if (var495.field1680 == -1) {
                            class151.method1024(var495.field1659, 8);
                            class86.method611(var495.field1659, -26321);
                        }
                        continue;
                    }
                    if (var517 == 1110) {
                        var6--;
                        int var496 = class62.field875[var6];
                        if (var495.field1632 != var496) {
                            var495.field1633 = 0;
                            var495.field1712 = 1;
                            var495.field1594 = 0;
                            var495.field1632 = var496;
                            class45.method346((byte) 68, var495);
                        }
                        if (var495.field1680 == -1) {
                            class278.method1860(var495.field1659, (byte) -125);
                        }
                        continue;
                    }
                    if (var517 == 1111) {
                        var6--;
                        var495.field1661 = class62.field875[var6] == 1;
                        class45.method346((byte) 105, var495);
                        continue;
                    }
                    if (var517 == 1112) {
                        var7--;
                        String var497 = class281.field4489[var7];
                        if (!var497.equals(var495.field1585)) {
                            var495.field1585 = var497;
                            class45.method346((byte) 41, var495);
                        }
                        if (var495.field1680 == -1) {
                            class98.method700(var495.field1659, 123);
                        }
                        continue;
                    }
                    if (var517 == 1113) {
                        var6--;
                        var495.field1593 = class62.field875[var6];
                        class45.method346((byte) 98, var495);
                        continue;
                    }
                    if (var517 == 1114) {
                        var6 -= 3;
                        var495.field1641 = class62.field875[var6];
                        var495.field1676 = class62.field875[var6 + 1];
                        var495.field1551 = class62.field875[var6 + 2];
                        class45.method346((byte) 51, var495);
                        continue;
                    }
                    if (var517 == 1115) {
                        var6--;
                        var495.field1722 = class62.field875[var6] == 1;
                        class45.method346((byte) 76, var495);
                        continue;
                    }
                    if (var517 == 1116) {
                        var6--;
                        var495.field1671 = class62.field875[var6];
                        class45.method346((byte) 87, var495);
                        continue;
                    }
                    if (var517 == 1117) {
                        var6--;
                        var495.field1714 = class62.field875[var6];
                        class45.method346((byte) 58, var495);
                        continue;
                    }
                    if (var517 == 1118) {
                        var6--;
                        var495.field1558 = class62.field875[var6] == 1;
                        class45.method346((byte) 61, var495);
                        continue;
                    }
                    if (var517 == 1119) {
                        var6--;
                        var495.field1694 = class62.field875[var6] == 1;
                        class45.method346((byte) 39, var495);
                        continue;
                    }
                    if (var517 == 1120) {
                        var6 -= 2;
                        var495.field1721 = class62.field875[var6];
                        var495.field1561 = class62.field875[var6 + 1];
                        class45.method346((byte) 102, var495);
                        if (var495.field1655 == 0) {
                            class88.method624(false, (byte) 116, var495);
                        }
                        continue;
                    }
                    if (var517 == 1121) {
                        class45.method346((byte) 46, var495);
                        var6 -= 2;
                        continue;
                    }
                    if (var517 == 1122) {
                        var6--;
                        var495.field1572 = class62.field875[var6] == 1;
                        class45.method346((byte) 123, var495);
                        continue;
                    }
                    if (var517 == 1123) {
                        var6--;
                        var495.field1598 = class62.field875[var6];
                        class45.method346((byte) 92, var495);
                        if (var495.field1680 == -1) {
                            class151.method1024(var495.field1659, 8);
                        }
                        continue;
                    }
                    if (var517 == 1124) {
                        var6--;
                        int var498 = class62.field875[var6];
                        var495.field1678 = var498 == 1;
                        class45.method346((byte) 84, var495);
                        continue;
                    }
                } else if (var517 >= 1200 && var517 < 1300 || var517 >= 2200 && var517 < 2300) {
                    class103 var62;
                    if (var517 >= 2000) {
                        var6--;
                        var62 = class168.method1180(8931, class62.field875[var6]);
                        var517 -= 1000;
                    } else {
                        var62 = var46 ? class247.field3976 : class157.field2509;
                    }
                    class45.method346((byte) 107, var62);
                    if (var517 == 1200 || var517 == 1205 || var517 == 1208 || var517 == 1209) {
                        var6 -= 2;
                        int var63 = class62.field875[var6];
                        int var64 = class62.field875[var6 + 1];
                        if (var62.field1680 == -1) {
                            class186.method1271(var62.field1659, 9);
                            class151.method1024(var62.field1659, 8);
                            class86.method611(var62.field1659, -26321);
                        }
                        if (var63 == -1) {
                            var62.field1576 = -1;
                            var62.field1631 = 1;
                            var62.field1724 = -1;
                        } else {
                            var62.field1657 = var64;
                            var62.field1576 = var63;
                            if (var517 == 1208 || var517 == 1209) {
                                var62.field1606 = true;
                            } else {
                                var62.field1606 = false;
                            }
                            class208 var65 = class64.method514(var63, 0);
                            var62.field1563 = var65.field3408;
                            var62.field1579 = var65.field3429;
                            var62.field1598 = var65.field3397;
                            if (var62.field1690 > 0) {
                                var62.field1598 = var62.field1598 * 32 / var62.field1690;
                            } else if (var62.field1597 > 0) {
                                var62.field1598 = var62.field1598 * 32 / var62.field1597;
                            }
                            if (var517 == 1205) {
                                var62.field1557 = false;
                            } else {
                                var62.field1557 = true;
                            }
                            var62.field1605 = var65.field3380;
                            var62.field1683 = var65.field3389;
                            var62.field1699 = var65.field3403;
                        }
                        continue;
                    }
                    if (var517 == 1201) {
                        var62.field1631 = 2;
                        var6--;
                        var62.field1724 = class62.field875[var6];
                        if (var62.field1680 == -1) {
                            class22.method152(var62.field1659, -126);
                        }
                        continue;
                    }
                    if (var517 == 1202) {
                        var62.field1631 = 3;
                        var62.field1724 = class197.field3179.field3746.method683(125);
                        if (var62.field1680 == -1) {
                            class22.method152(var62.field1659, 118);
                        }
                        continue;
                    }
                    if (var517 == 1203) {
                        var62.field1631 = 6;
                        var6--;
                        var62.field1724 = class62.field875[var6];
                        if (var62.field1680 == -1) {
                            class22.method152(var62.field1659, 6);
                        }
                        continue;
                    }
                    if (var517 == 1204) {
                        var62.field1631 = 5;
                        var6--;
                        var62.field1724 = class62.field875[var6];
                        if (var62.field1680 == -1) {
                            class22.method152(var62.field1659, -47);
                        }
                        continue;
                    }
                    if (var517 == 1206) {
                        var6 -= 4;
                        var62.field1643 = class62.field875[var6];
                        var62.field1587 = class62.field875[var6 + 1];
                        var62.field1687 = class62.field875[var6 + 2];
                        var62.field1692 = class62.field875[var6 + 3];
                        class45.method346((byte) 26, var62);
                        continue;
                    }
                    if (var517 == 1207) {
                        var6 -= 2;
                        var62.field1705 = class62.field875[var6];
                        var62.field1649 = class62.field875[var6 + 1];
                        class45.method346((byte) 93, var62);
                        continue;
                    }
                } else if (var517 >= 1300 && var517 < 1400 || var517 >= 2300 && var517 < 2400) {
                    class103 var489;
                    if (var517 < 2000) {
                        var489 = var46 ? class247.field3976 : class157.field2509;
                    } else {
                        var517 -= 1000;
                        var6--;
                        var489 = class168.method1180(8931, class62.field875[var6]);
                    }
                    if (var517 == 1300) {
                        var6--;
                        int var490 = class62.field875[var6] - 1;
                        if (var490 >= 0 && var490 <= 9) {
                            var7--;
                            var489.method730(100, var490, class281.field4489[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var517 == 1301) {
                        var6 -= 2;
                        int var491 = class62.field875[var6];
                        int var492 = class62.field875[var6 + 1];
                        var489.field1567 = class122.method859(var492, (byte) -7, var491);
                        continue;
                    }
                    if (var517 == 1302) {
                        var6--;
                        var489.field1571 = class62.field875[var6] == 1;
                        continue;
                    }
                    if (var517 == 1303) {
                        var6--;
                        var489.field1715 = class62.field875[var6];
                        continue;
                    }
                    if (var517 == 1304) {
                        var6--;
                        var489.field1702 = class62.field875[var6];
                        continue;
                    }
                    if (var517 == 1305) {
                        var7--;
                        var489.field1717 = class281.field4489[var7];
                        continue;
                    }
                    if (var517 == 1306) {
                        var7--;
                        var489.field1599 = class281.field4489[var7];
                        continue;
                    }
                    if (var517 == 1307) {
                        var489.field1573 = null;
                        continue;
                    }
                    if (var517 == 1308) {
                        var6--;
                        var489.field1723 = class62.field875[var6];
                        var6--;
                        var489.field1562 = class62.field875[var6];
                        continue;
                    }
                    if (var517 == 1309) {
                        var6--;
                        int var493 = class62.field875[var6];
                        var6--;
                        int var494 = class62.field875[var6];
                        if (var494 >= 1 && var494 <= 10) {
                            var489.method725(var494 - 1, var493, (byte) -115);
                        }
                        continue;
                    }
                    if (var517 == 1310) {
                        var7--;
                        var489.field1608 = class281.field4489[var7];
                        continue;
                    }
                } else {
                    if (var517 >= 1400 && var517 < 1500 || var517 >= 2400 && var517 < 2500) {
                        class103 var66;
                        if (var517 >= 2000) {
                            var517 -= 1000;
                            var6--;
                            var66 = class168.method1180(8931, class62.field875[var6]);
                        } else {
                            var66 = var46 ? class247.field3976 : class157.field2509;
                        }
                        int[] var67 = null;
                        var7--;
                        String var68 = class281.field4489[var7];
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var6--;
                            int var69 = class62.field875[var6];
                            if (var69 > 0) {
                                var67 = new int[var69];
                                while (var69-- > 0) {
                                    var6--;
                                    var67[var69] = class62.field875[var6];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var70 = new Object[var68.length() + 1];
                        for (int var71 = var70.length - 1; var71 >= 1; var71--) {
                            if (var68.charAt(var71 - 1) == 's') {
                                var7--;
                                var70[var71] = class281.field4489[var7];
                            } else {
                                var6--;
                                var70[var71] = Integer.valueOf(class62.field875[var6]);
                            }
                        }
                        var6--;
                        int var72 = class62.field875[var6];
                        if (var72 == -1) {
                            var70 = null;
                        } else {
                            var70[0] = Integer.valueOf(var72);
                        }
                        if (var517 == 1400) {
                            var66.field1646 = var70;
                        } else if (var517 == 1401) {
                            var66.field1650 = var70;
                        } else if (var517 == 1402) {
                            var66.field1636 = var70;
                        } else if (var517 == 1403) {
                            var66.field1589 = var70;
                        } else if (var517 == 1404) {
                            var66.field1574 = var70;
                        } else if (var517 == 1405) {
                            var66.field1556 = var70;
                        } else if (var517 == 1406) {
                            var66.field1621 = var70;
                        } else if (var517 == 1407) {
                            var66.field1578 = var67;
                            var66.field1630 = var70;
                        } else if (var517 == 1408) {
                            var66.field1620 = var70;
                        } else if (var517 == 1409) {
                            var66.field1570 = var70;
                        } else if (var517 == 1410) {
                            var66.field1548 = var70;
                        } else if (var517 == 1411) {
                            var66.field1685 = var70;
                        } else if (var517 == 1412) {
                            var66.field1656 = var70;
                        } else if (var517 == 1414) {
                            var66.field1575 = var67;
                            var66.field1653 = var70;
                        } else if (var517 == 1415) {
                            var66.field1560 = var67;
                            var66.field1704 = var70;
                        } else if (var517 == 1416) {
                            var66.field1614 = var70;
                        } else if (var517 == 1417) {
                            var66.field1607 = var70;
                        } else if (var517 == 1418) {
                            var66.field1611 = var70;
                        } else if (var517 == 1419) {
                            var66.field1682 = var70;
                        } else if (var517 == 1420) {
                            var66.field1628 = var70;
                        } else if (var517 == 1421) {
                            var66.field1550 = var70;
                        } else if (var517 == 1422) {
                            var66.field1642 = var70;
                        } else if (var517 == 1423) {
                            var66.field1697 = var70;
                        } else if (var517 == 1424) {
                            var66.field1577 = var70;
                        } else if (var517 == 1425) {
                            var66.field1648 = var70;
                        } else if (var517 == 1426) {
                            var66.field1609 = var70;
                        } else if (var517 == 1427) {
                            var66.field1586 = var70;
                        } else if (var517 == 1428) {
                            var66.field1706 = var67;
                            var66.field1629 = var70;
                        } else if (var517 == 1429) {
                            var66.field1638 = var70;
                            var66.field1581 = var67;
                        }
                        var66.field1568 = true;
                        continue;
                    }
                    if (var517 < 1600) {
                        class103 var488 = var46 ? class247.field3976 : class157.field2509;
                        if (var517 == 1500) {
                            class62.field875[var6++] = var488.field1679;
                            continue;
                        }
                        if (var517 == 1501) {
                            class62.field875[var6++] = var488.field1707;
                            continue;
                        }
                        if (var517 == 1502) {
                            class62.field875[var6++] = var488.field1691;
                            continue;
                        }
                        if (var517 == 1503) {
                            class62.field875[var6++] = var488.field1693;
                            continue;
                        }
                        if (var517 == 1504) {
                            class62.field875[var6++] = var488.field1684 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 1505) {
                            class62.field875[var6++] = var488.field1602;
                            continue;
                        }
                    } else if (var517 < 1700) {
                        class103 var73 = var46 ? class247.field3976 : class157.field2509;
                        if (var517 == 1600) {
                            class62.field875[var6++] = var73.field1590;
                            continue;
                        }
                        if (var517 == 1601) {
                            class62.field875[var6++] = var73.field1639;
                            continue;
                        }
                        if (var517 == 1602) {
                            class281.field4489[var7++] = var73.field1585;
                            continue;
                        }
                        if (var517 == 1603) {
                            class62.field875[var6++] = var73.field1721;
                            continue;
                        }
                        if (var517 == 1604) {
                            class62.field875[var6++] = var73.field1561;
                            continue;
                        }
                        if (var517 == 1605) {
                            class62.field875[var6++] = var73.field1598;
                            continue;
                        }
                        if (var517 == 1606) {
                            class62.field875[var6++] = var73.field1683;
                            continue;
                        }
                        if (var517 == 1607) {
                            class62.field875[var6++] = var73.field1579;
                            continue;
                        }
                        if (var517 == 1608) {
                            class62.field875[var6++] = var73.field1605;
                            continue;
                        }
                        if (var517 == 1609) {
                            class62.field875[var6++] = var73.field1658;
                            continue;
                        }
                        if (var517 == 1610) {
                            class62.field875[var6++] = var73.field1699;
                            continue;
                        }
                        if (var517 == 1611) {
                            class62.field875[var6++] = var73.field1563;
                            continue;
                        }
                        if (var517 == 1612) {
                            class62.field875[var6++] = var73.field1698;
                            continue;
                        }
                    } else if (var517 < 1800) {
                        class103 var487 = var46 ? class247.field3976 : class157.field2509;
                        if (var517 == 1700) {
                            class62.field875[var6++] = var487.field1576;
                            continue;
                        }
                        if (var517 == 1701) {
                            if (var487.field1576 == -1) {
                                class62.field875[var6++] = 0;
                            } else {
                                class62.field875[var6++] = var487.field1657;
                            }
                            continue;
                        }
                        if (var517 == 1702) {
                            class62.field875[var6++] = var487.field1680;
                            continue;
                        }
                    } else if (var517 < 1900) {
                        class103 var485 = var46 ? class247.field3976 : class157.field2509;
                        if (var517 == 1800) {
                            class62.field875[var6++] = client.method1511(var485).method204((byte) -18);
                            continue;
                        }
                        if (var517 == 1801) {
                            var6--;
                            int var486 = class62.field875[var6];
                            int var519 = var486 - 1;
                            if (var485.field1573 != null && var519 < var485.field1573.length && var485.field1573[var519] != null) {
                                class281.field4489[var7++] = var485.field1573[var519];
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 1802) {
                            if (var485.field1717 == null) {
                                class281.field4489[var7++] = "";
                            } else {
                                class281.field4489[var7++] = var485.field1717;
                            }
                            continue;
                        }
                    } else if (var517 < 2600) {
                        var6--;
                        class103 var74 = class168.method1180(8931, class62.field875[var6]);
                        if (var517 == 2500) {
                            class62.field875[var6++] = var74.field1679;
                            continue;
                        }
                        if (var517 == 2501) {
                            class62.field875[var6++] = var74.field1707;
                            continue;
                        }
                        if (var517 == 2502) {
                            class62.field875[var6++] = var74.field1691;
                            continue;
                        }
                        if (var517 == 2503) {
                            class62.field875[var6++] = var74.field1693;
                            continue;
                        }
                        if (var517 == 2504) {
                            class62.field875[var6++] = var74.field1684 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 2505) {
                            class62.field875[var6++] = var74.field1602;
                            continue;
                        }
                    } else if (var517 < 2700) {
                        var6--;
                        class103 var484 = class168.method1180(8931, class62.field875[var6]);
                        if (var517 == 2600) {
                            class62.field875[var6++] = var484.field1590;
                            continue;
                        }
                        if (var517 == 2601) {
                            class62.field875[var6++] = var484.field1639;
                            continue;
                        }
                        if (var517 == 2602) {
                            class281.field4489[var7++] = var484.field1585;
                            continue;
                        }
                        if (var517 == 2603) {
                            class62.field875[var6++] = var484.field1721;
                            continue;
                        }
                        if (var517 == 2604) {
                            class62.field875[var6++] = var484.field1561;
                            continue;
                        }
                        if (var517 == 2605) {
                            class62.field875[var6++] = var484.field1598;
                            continue;
                        }
                        if (var517 == 2606) {
                            class62.field875[var6++] = var484.field1683;
                            continue;
                        }
                        if (var517 == 2607) {
                            class62.field875[var6++] = var484.field1579;
                            continue;
                        }
                        if (var517 == 2608) {
                            class62.field875[var6++] = var484.field1605;
                            continue;
                        }
                        if (var517 == 2609) {
                            class62.field875[var6++] = var484.field1658;
                            continue;
                        }
                        if (var517 == 2610) {
                            class62.field875[var6++] = var484.field1699;
                            continue;
                        }
                        if (var517 == 2611) {
                            class62.field875[var6++] = var484.field1563;
                            continue;
                        }
                        if (var517 == 2612) {
                            class62.field875[var6++] = var484.field1698;
                            continue;
                        }
                    } else if (var517 < 2800) {
                        if (var517 == 2700) {
                            var6--;
                            class103 var474 = class168.method1180(8931, class62.field875[var6]);
                            class62.field875[var6++] = var474.field1576;
                            continue;
                        }
                        if (var517 == 2701) {
                            var6--;
                            class103 var475 = class168.method1180(8931, class62.field875[var6]);
                            if (var475.field1576 == -1) {
                                class62.field875[var6++] = 0;
                            } else {
                                class62.field875[var6++] = var475.field1657;
                            }
                            continue;
                        }
                        if (var517 == 2702) {
                            var6--;
                            int var476 = class62.field875[var6];
                            class128 var477 = (class128) class294.field4656.method457((long) var476, (byte) -115);
                            if (var477 == null) {
                                class62.field875[var6++] = 0;
                            } else {
                                class62.field875[var6++] = 1;
                            }
                            continue;
                        }
                        if (var517 == 2703) {
                            var6--;
                            class103 var478 = class168.method1180(8931, class62.field875[var6]);
                            if (var478.field1624 == null) {
                                class62.field875[var6++] = 0;
                                continue;
                            }
                            int var479 = var478.field1624.length;
                            for (int var480 = 0; var480 < var478.field1624.length; var480++) {
                                if (var478.field1624[var480] == null) {
                                    var479 = var480;
                                    break;
                                }
                            }
                            class62.field875[var6++] = var479;
                            continue;
                        }
                        if (var517 == 2704 || var517 == 2705) {
                            var6 -= 2;
                            int var481 = class62.field875[var6];
                            int var482 = class62.field875[var6 + 1];
                            class128 var483 = (class128) class294.field4656.method457((long) var481, (byte) -115);
                            if (var483 != null && var483.field2135 == var482) {
                                class62.field875[var6++] = 1;
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                    } else if (var517 < 2900) {
                        var6--;
                        class103 var75 = class168.method1180(8931, class62.field875[var6]);
                        if (var517 == 2800) {
                            class62.field875[var6++] = client.method1511(var75).method204((byte) -18);
                            continue;
                        }
                        if (var517 == 2801) {
                            var6--;
                            int var76 = class62.field875[var6];
                            int var518 = var76 - 1;
                            if (var75.field1573 != null && var75.field1573.length > var518 && var75.field1573[var518] != null) {
                                class281.field4489[var7++] = var75.field1573[var518];
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 2802) {
                            if (var75.field1717 == null) {
                                class281.field4489[var7++] = "";
                            } else {
                                class281.field4489[var7++] = var75.field1717;
                            }
                            continue;
                        }
                    } else if (var517 < 3200) {
                        if (var517 == 3100) {
                            var7--;
                            String var459 = class281.field4489[var7];
                            class297.method1986(0, "", true, var459);
                            continue;
                        }
                        if (var517 == 3101) {
                            var6 -= 2;
                            class125.method865(class62.field875[var6], class197.field3179, class62.field875[var6 + 1], (byte) -6);
                            continue;
                        }
                        if (var517 == 3103) {
                            class223.method1482(-127);
                            continue;
                        }
                        if (var517 == 3104) {
                            class203.field3262++;
                            int var460 = 0;
                            var7--;
                            String var461 = class281.field4489[var7];
                            if (class57.method439((byte) 63, var461)) {
                                var460 = class278.method1863(3934, var461);
                            }
                            class83.field1148.method1238(132, -136478397);
                            class83.field1148.method1789((byte) -38, var460);
                            continue;
                        }
                        if (var517 == 3105) {
                            class214.field3449++;
                            var7--;
                            String var462 = class281.field4489[var7];
                            class83.field1148.method1238(248, -136478397);
                            class83.field1148.method1762(class238.method1570(var462, (byte) 126), (byte) -127);
                            continue;
                        }
                        if (var517 == 3106) {
                            class155.field2489++;
                            var7--;
                            String var463 = class281.field4489[var7];
                            class83.field1148.method1238(222, -136478397);
                            class83.field1148.method1757(var463.length() + 1, (byte) -119);
                            class83.field1148.method1770(var463, (byte) 109);
                            continue;
                        }
                        if (var517 == 3107) {
                            var7--;
                            String var464 = class281.field4489[var7];
                            var6--;
                            int var465 = class62.field875[var6];
                            class129.method894(var465, false, var464);
                            continue;
                        }
                        if (var517 == 3108) {
                            var6 -= 3;
                            int var466 = class62.field875[var6 + 2];
                            int var467 = class62.field875[var6];
                            int var468 = class62.field875[var6 + 1];
                            class103 var469 = class168.method1180(8931, var466);
                            class122.method852(-37, var469, var467, var468);
                            continue;
                        }
                        if (var517 == 3109) {
                            var6 -= 2;
                            int var470 = class62.field875[var6];
                            int var471 = class62.field875[var6 + 1];
                            class103 var472 = var46 ? class247.field3976 : class157.field2509;
                            class122.method852(114, var472, var470, var471);
                            continue;
                        }
                        if (var517 == 3110) {
                            class259.field4125++;
                            var6--;
                            int var473 = class62.field875[var6];
                            class83.field1148.method1238(59, -136478397);
                            class83.field1148.method1761(var473, 4334);
                            continue;
                        }
                    } else if (var517 < 3300) {
                        if (var517 == 3200) {
                            var6 -= 3;
                            class222.method1473(0, class62.field875[var6 + 2], class62.field875[var6 + 1], 255, class62.field875[var6]);
                            continue;
                        }
                        if (var517 == 3201) {
                            var6--;
                            class70.method549(255, class62.field875[var6], (byte) 87);
                            continue;
                        }
                        if (var517 == 3202) {
                            var6 -= 2;
                            class80.method596(255, 16491, class62.field875[var6], class62.field875[var6 + 1]);
                            continue;
                        }
                    } else if (var517 < 3400) {
                        if (var517 == 3300) {
                            class62.field875[var6++] = class9.field141;
                            continue;
                        }
                        if (var517 == 3301) {
                            var6 -= 2;
                            int var77 = class62.field875[var6];
                            int var78 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class218.method1454(var78, var77, -102);
                            continue;
                        }
                        if (var517 == 3302) {
                            var6 -= 2;
                            int var79 = class62.field875[var6];
                            int var80 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class275.method1856(var79, true, var80);
                            continue;
                        }
                        if (var517 == 3303) {
                            var6 -= 2;
                            int var81 = class62.field875[var6];
                            int var82 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class270.method1822(var81, var82, 92);
                            continue;
                        }
                        if (var517 == 3304) {
                            var6--;
                            int var83 = class62.field875[var6];
                            class62.field875[var6++] = class248.method1643((byte) 127, var83).field898;
                            continue;
                        }
                        if (var517 == 3305) {
                            var6--;
                            int var84 = class62.field875[var6];
                            class62.field875[var6++] = class242.field3886[var84];
                            continue;
                        }
                        if (var517 == 3306) {
                            var6--;
                            int var85 = class62.field875[var6];
                            class62.field875[var6++] = class52.field735[var85];
                            continue;
                        }
                        if (var517 == 3307) {
                            var6--;
                            int var86 = class62.field875[var6];
                            class62.field875[var6++] = class281.field4492[var86];
                            continue;
                        }
                        if (var517 == 3308) {
                            int var87 = (class197.field3179.field614 >> 7) + class296.field4685;
                            int var88 = class28.field336;
                            int var89 = (class197.field3179.field613 >> 7) + class93.field1321;
                            class62.field875[var6++] = (var87 << 14) + (var88 << 28) + var89;
                            continue;
                        }
                        if (var517 == 3309) {
                            var6--;
                            int var90 = class62.field875[var6];
                            class62.field875[var6++] = class204.method1369(var90, 268425920) >> 14;
                            continue;
                        }
                        if (var517 == 3310) {
                            var6--;
                            int var91 = class62.field875[var6];
                            class62.field875[var6++] = var91 >> 28;
                            continue;
                        }
                        if (var517 == 3311) {
                            var6--;
                            int var92 = class62.field875[var6];
                            class62.field875[var6++] = class204.method1369(16383, var92);
                            continue;
                        }
                        if (var517 == 3312) {
                            class62.field875[var6++] = class294.field4662 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3313) {
                            var6 -= 2;
                            int var93 = class62.field875[var6 + 1];
                            int var94 = class62.field875[var6] + 32768;
                            class62.field875[var6++] = class218.method1454(var93, var94, -90);
                            continue;
                        }
                        if (var517 == 3314) {
                            var6 -= 2;
                            int var95 = class62.field875[var6] + 32768;
                            int var96 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class275.method1856(var95, true, var96);
                            continue;
                        }
                        if (var517 == 3315) {
                            var6 -= 2;
                            int var97 = class62.field875[var6] + 32768;
                            int var98 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class270.method1822(var97, var98, -48);
                            continue;
                        }
                        if (var517 == 3316) {
                            if (class151.field2420 >= 2) {
                                class62.field875[var6++] = class151.field2420;
                            } else {
                                class62.field875[var6++] = 0;
                            }
                            continue;
                        }
                        if (var517 == 3317) {
                            class62.field875[var6++] = class42.field504;
                            continue;
                        }
                        if (var517 == 3318) {
                            class62.field875[var6++] = class125.field2088;
                            continue;
                        }
                        if (var517 == 3321) {
                            class62.field875[var6++] = class297.field4708;
                            continue;
                        }
                        if (var517 == 3322) {
                            class62.field875[var6++] = class72.field982;
                            continue;
                        }
                        if (var517 == 3323) {
                            if (class110.field1905 >= 5 && class110.field1905 <= 9) {
                                class62.field875[var6++] = 1;
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3324) {
                            if (class110.field1905 >= 5 && class110.field1905 <= 9) {
                                class62.field875[var6++] = class110.field1905;
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3325) {
                            class62.field875[var6++] = class222.field3539 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3326) {
                            class62.field875[var6++] = class197.field3179.field3760;
                            continue;
                        }
                        if (var517 == 3327) {
                            class62.field875[var6++] = class197.field3179.field3746.field1432 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3328) {
                            class62.field875[var6++] = class25.field311 && !class202.field3246 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3329) {
                            class62.field875[var6++] = class124.field2063 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3330) {
                            var6--;
                            int var99 = class62.field875[var6];
                            class62.field875[var6++] = class179.method1245((byte) -117, var99);
                            continue;
                        }
                        if (var517 == 3331) {
                            var6 -= 2;
                            int var100 = class62.field875[var6];
                            int var101 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class179.method1244(var101, false, (byte) 86, var100);
                            continue;
                        }
                        if (var517 == 3332) {
                            var6 -= 2;
                            int var102 = class62.field875[var6];
                            int var103 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class179.method1244(var103, true, (byte) 104, var102);
                            continue;
                        }
                        if (var517 == 3333) {
                            class62.field875[var6++] = class86.field1177;
                            continue;
                        }
                        if (var517 == 3335) {
                            class62.field875[var6++] = class261.field4147;
                            continue;
                        }
                        if (var517 == 3336) {
                            var6 -= 4;
                            int var104 = class62.field875[var6];
                            int var105 = class62.field875[var6 + 1];
                            int var106 = (var105 << 14) + var104;
                            int var107 = class62.field875[var6 + 2];
                            int var108 = class62.field875[var6 + 3];
                            int var109 = (var107 << 28) + var106;
                            int var110 = var108 + var109;
                            class62.field875[var6++] = var110;
                            continue;
                        }
                        if (var517 == 3337) {
                            class62.field875[var6++] = class286.field4561;
                            continue;
                        }
                    } else if (var517 < 3500) {
                        if (var517 == 3400) {
                            var6 -= 2;
                            int var111 = class62.field875[var6];
                            int var112 = class62.field875[var6 + 1];
                            class127 var113 = class265.method1792(var111, 255);
                            class281.field4489[var7++] = var113.method885(var112, (byte) 126);
                            continue;
                        }
                        if (var517 == 3408) {
                            var6 -= 4;
                            int var114 = class62.field875[var6];
                            int var115 = class62.field875[var6 + 1];
                            int var116 = class62.field875[var6 + 2];
                            int var117 = class62.field875[var6 + 3];
                            class127 var118 = class265.method1792(var116, 255);
                            if (var118.field2116 == var114 && var118.field2125 == var115) {
                                if (var115 == 115) {
                                    class281.field4489[var7++] = var118.method885(var117, (byte) 126);
                                } else {
                                    class62.field875[var6++] = var118.method882(var117, (byte) 54);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var517 == 3409) {
                            var6 -= 3;
                            int var119 = class62.field875[var6];
                            int var120 = class62.field875[var6 + 2];
                            int var121 = class62.field875[var6 + 1];
                            if (var121 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class127 var122 = class265.method1792(var121, 255);
                            if (var122.field2125 != var119) {
                                throw new RuntimeException("C3409-1");
                            }
                            class62.field875[var6++] = var122.method881(true, var120) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3410) {
                            var6--;
                            int var123 = class62.field875[var6];
                            var7--;
                            String var124 = class281.field4489[var7];
                            if (var123 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class127 var125 = class265.method1792(var123, 255);
                            if (var125.field2125 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class62.field875[var6++] = var125.method887(55, var124) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3411) {
                            var6--;
                            int var126 = class62.field875[var6];
                            class127 var127 = class265.method1792(var126, 255);
                            class62.field875[var6++] = var127.field2112.method463((byte) 60);
                            continue;
                        }
                    } else if (var517 < 3700) {
                        if (var517 == 3600) {
                            if (class96.field1446 == 0) {
                                class62.field875[var6++] = -2;
                            } else if (class96.field1446 == 1) {
                                class62.field875[var6++] = -1;
                            } else {
                                class62.field875[var6++] = class264.field4224;
                            }
                            continue;
                        }
                        if (var517 == 3601) {
                            var6--;
                            int var128 = class62.field875[var6];
                            if (class96.field1446 == 2 && class264.field4224 > var128) {
                                class281.field4489[var7++] = class28.field338[var128];
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 3602) {
                            var6--;
                            int var129 = class62.field875[var6];
                            if (class96.field1446 == 2 && var129 < class264.field4224) {
                                class62.field875[var6++] = class151.field2430[var129];
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3603) {
                            var6--;
                            int var130 = class62.field875[var6];
                            if (class96.field1446 == 2 && var130 < class264.field4224) {
                                class62.field875[var6++] = class171.field2758[var130];
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3604) {
                            var6--;
                            int var131 = class62.field875[var6];
                            var7--;
                            String var132 = class281.field4489[var7];
                            class115.method823(var132, (byte) -103, var131);
                            continue;
                        }
                        if (var517 == 3605) {
                            var7--;
                            String var133 = class281.field4489[var7];
                            class74.method563(0, class238.method1570(var133, (byte) 92));
                            continue;
                        }
                        if (var517 == 3606) {
                            var7--;
                            String var134 = class281.field4489[var7];
                            class94.method666(false, class238.method1570(var134, (byte) 114));
                            continue;
                        }
                        if (var517 == 3607) {
                            var7--;
                            String var135 = class281.field4489[var7];
                            class237.method1563(false, (byte) 119, class238.method1570(var135, (byte) 121));
                            continue;
                        }
                        if (var517 == 3608) {
                            var7--;
                            String var136 = class281.field4489[var7];
                            class25.method175(-12664, class238.method1570(var136, (byte) 93));
                            continue;
                        }
                        if (var517 == 3609) {
                            var7--;
                            String var137 = class281.field4489[var7];
                            if (var137.startsWith("<img=0>") || var137.startsWith("<img=1>")) {
                                var137 = var137.substring(7);
                            }
                            class62.field875[var6++] = class75.method569((byte) -44, var137) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3610) {
                            var6--;
                            int var138 = class62.field875[var6];
                            if (class96.field1446 == 2 && class264.field4224 > var138) {
                                class281.field4489[var7++] = class160.field2598[var138];
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 3611) {
                            if (class183.field2925 == null) {
                                class281.field4489[var7++] = "";
                            } else {
                                class281.field4489[var7++] = class243.method1598(class183.field2925, -30311);
                            }
                            continue;
                        }
                        if (var517 == 3612) {
                            if (class183.field2925 == null) {
                                class62.field875[var6++] = 0;
                            } else {
                                class62.field875[var6++] = class178.field2889;
                            }
                            continue;
                        }
                        if (var517 == 3613) {
                            var6--;
                            int var139 = class62.field875[var6];
                            if (class183.field2925 != null && class178.field2889 > var139) {
                                class281.field4489[var7++] = class243.method1598(class69.field961[var139].field317, -30311);
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 3614) {
                            var6--;
                            int var140 = class62.field875[var6];
                            if (class183.field2925 != null && class178.field2889 > var140) {
                                class62.field875[var6++] = class69.field961[var140].field321;
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3615) {
                            var6--;
                            int var141 = class62.field875[var6];
                            if (class183.field2925 != null && var141 < class178.field2889) {
                                class62.field875[var6++] = class69.field961[var141].field318;
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3616) {
                            class62.field875[var6++] = class188.field3009;
                            continue;
                        }
                        if (var517 == 3617) {
                            var7--;
                            String var142 = class281.field4489[var7];
                            class246.method1624(var142, 0);
                            continue;
                        }
                        if (var517 == 3618) {
                            class62.field875[var6++] = class207.field3347;
                            continue;
                        }
                        if (var517 == 3619) {
                            var7--;
                            String var143 = class281.field4489[var7];
                            class147.method1008(class238.method1570(var143, (byte) 97), -68);
                            continue;
                        }
                        if (var517 == 3620) {
                            class69.method543(true);
                            continue;
                        }
                        if (var517 == 3621) {
                            if (class96.field1446 == 0) {
                                class62.field875[var6++] = -1;
                            } else {
                                class62.field875[var6++] = class33.field399;
                            }
                            continue;
                        }
                        if (var517 == 3622) {
                            var6--;
                            int var144 = class62.field875[var6];
                            if (class96.field1446 != 0 && var144 < class33.field399) {
                                class281.field4489[var7++] = class94.method659(class140.field2301[var144], (byte) -103);
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 3623) {
                            var7--;
                            String var145 = class281.field4489[var7];
                            if (var145.startsWith("<img=0>") || var145.startsWith("<img=1>")) {
                                var145 = var145.substring(7);
                            }
                            class62.field875[var6++] = class105.method777(-126, var145) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3624) {
                            var6--;
                            int var146 = class62.field875[var6];
                            if (class69.field961 != null && class178.field2889 > var146 && class69.field961[var146].field317.equalsIgnoreCase(class197.field3179.field3735)) {
                                class62.field875[var6++] = 1;
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3625) {
                            if (class166.field2706 == null) {
                                class281.field4489[var7++] = "";
                            } else {
                                class281.field4489[var7++] = class243.method1598(class166.field2706, -30311);
                            }
                            continue;
                        }
                        if (var517 == 3626) {
                            var6--;
                            int var147 = class62.field875[var6];
                            if (class183.field2925 != null && var147 < class178.field2889) {
                                class281.field4489[var7++] = class69.field961[var147].field323;
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 3627) {
                            var6--;
                            int var148 = class62.field875[var6];
                            if (class96.field1446 == 2 && var148 >= 0 && class264.field4224 > var148) {
                                class62.field875[var6++] = class127.field2133[var148] ? 1 : 0;
                                continue;
                            }
                            class62.field875[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3628) {
                            var7--;
                            String var149 = class281.field4489[var7];
                            if (var149.startsWith("<img=0>") || var149.startsWith("<img=1>")) {
                                var149 = var149.substring(7);
                            }
                            class62.field875[var6++] = class172.method1201((byte) -75, var149);
                            continue;
                        }
                        if (var517 == 3629) {
                            class62.field875[var6++] = class73.field1003;
                            continue;
                        }
                        if (var517 == 3630) {
                            var7--;
                            String var150 = class281.field4489[var7];
                            class237.method1563(true, (byte) 120, class238.method1570(var150, (byte) 121));
                            continue;
                        }
                        if (var517 == 3631) {
                            var6--;
                            int var151 = class62.field875[var6];
                            class62.field875[var6++] = class225.field3570[var151] ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4000) {
                        if (var517 == 3903) {
                            var6--;
                            int var152 = class62.field875[var6];
                            class62.field875[var6++] = class154.field2486[var152].method701(-128);
                            continue;
                        }
                        if (var517 == 3904) {
                            var6--;
                            int var153 = class62.field875[var6];
                            class62.field875[var6++] = class154.field2486[var153].field1477;
                            continue;
                        }
                        if (var517 == 3905) {
                            var6--;
                            int var154 = class62.field875[var6];
                            class62.field875[var6++] = class154.field2486[var154].field1483;
                            continue;
                        }
                        if (var517 == 3906) {
                            var6--;
                            int var155 = class62.field875[var6];
                            class62.field875[var6++] = class154.field2486[var155].field1471;
                            continue;
                        }
                        if (var517 == 3907) {
                            var6--;
                            int var156 = class62.field875[var6];
                            class62.field875[var6++] = class154.field2486[var156].field1470;
                            continue;
                        }
                        if (var517 == 3908) {
                            var6--;
                            int var157 = class62.field875[var6];
                            class62.field875[var6++] = class154.field2486[var157].field1480;
                            continue;
                        }
                        if (var517 == 3910) {
                            var6--;
                            int var158 = class62.field875[var6];
                            int var159 = class154.field2486[var158].method699(-1);
                            class62.field875[var6++] = var159 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3911) {
                            var6--;
                            int var160 = class62.field875[var6];
                            int var161 = class154.field2486[var160].method699(-1);
                            class62.field875[var6++] = var161 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3912) {
                            var6--;
                            int var162 = class62.field875[var6];
                            int var163 = class154.field2486[var162].method699(-1);
                            class62.field875[var6++] = var163 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3913) {
                            var6--;
                            int var164 = class62.field875[var6];
                            int var165 = class154.field2486[var164].method699(-1);
                            class62.field875[var6++] = var165 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4100) {
                        if (var517 == 4000) {
                            var6 -= 2;
                            int var414 = class62.field875[var6];
                            int var415 = class62.field875[var6 + 1];
                            class62.field875[var6++] = var414 + var415;
                            continue;
                        }
                        if (var517 == 4001) {
                            var6 -= 2;
                            int var416 = class62.field875[var6];
                            int var417 = class62.field875[var6 + 1];
                            class62.field875[var6++] = var416 - var417;
                            continue;
                        }
                        if (var517 == 4002) {
                            var6 -= 2;
                            int var418 = class62.field875[var6 + 1];
                            int var419 = class62.field875[var6];
                            class62.field875[var6++] = var418 * var419;
                            continue;
                        }
                        if (var517 == 4003) {
                            var6 -= 2;
                            int var420 = class62.field875[var6];
                            int var421 = class62.field875[var6 + 1];
                            class62.field875[var6++] = var420 / var421;
                            continue;
                        }
                        if (var517 == 4004) {
                            var6--;
                            int var422 = class62.field875[var6];
                            class62.field875[var6++] = (int) (Math.random() * (double) var422);
                            continue;
                        }
                        if (var517 == 4005) {
                            var6--;
                            int var423 = class62.field875[var6];
                            class62.field875[var6++] = (int) (Math.random() * (double) (var423 + 1));
                            continue;
                        }
                        if (var517 == 4006) {
                            var6 -= 5;
                            int var424 = class62.field875[var6];
                            int var425 = class62.field875[var6 + 1];
                            int var426 = class62.field875[var6 + 3];
                            int var427 = class62.field875[var6 + 4];
                            int var428 = class62.field875[var6 + 2];
                            class62.field875[var6++] = (var425 - var424) * (var427 - var428) / (var426 - var428) + var424;
                            continue;
                        }
                        if (var517 == 4007) {
                            var6 -= 2;
                            long var429 = (long) class62.field875[var6];
                            long var431 = (long) class62.field875[var6 + 1];
                            class62.field875[var6++] = (int) (var429 * var431 / 100L + var429);
                            continue;
                        }
                        if (var517 == 4008) {
                            var6 -= 2;
                            int var433 = class62.field875[var6];
                            int var434 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class45.method348(var433, 0x1 << var434);
                            continue;
                        }
                        if (var517 == 4009) {
                            var6 -= 2;
                            int var435 = class62.field875[var6];
                            int var436 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class204.method1369(var435, -(0x1 << var436) - 1);
                            continue;
                        }
                        if (var517 == 4010) {
                            var6 -= 2;
                            int var437 = class62.field875[var6];
                            int var438 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class204.method1369(var437, 0x1 << var438) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var517 == 4011) {
                            var6 -= 2;
                            int var439 = class62.field875[var6];
                            int var440 = class62.field875[var6 + 1];
                            class62.field875[var6++] = var439 % var440;
                            continue;
                        }
                        if (var517 == 4012) {
                            var6 -= 2;
                            int var441 = class62.field875[var6 + 1];
                            int var442 = class62.field875[var6];
                            if (var442 == 0) {
                                class62.field875[var6++] = 0;
                            } else {
                                class62.field875[var6++] = (int) Math.pow((double) var442, (double) var441);
                            }
                            continue;
                        }
                        if (var517 == 4013) {
                            var6 -= 2;
                            int var443 = class62.field875[var6];
                            int var444 = class62.field875[var6 + 1];
                            if (var443 == 0) {
                                class62.field875[var6++] = 0;
                            } else if (var444 == 0) {
                                class62.field875[var6++] = Integer.MAX_VALUE;
                            } else {
                                class62.field875[var6++] = (int) Math.pow((double) var443, 1.0D / (double) var444);
                            }
                            continue;
                        }
                        if (var517 == 4014) {
                            var6 -= 2;
                            int var445 = class62.field875[var6];
                            int var446 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class204.method1369(var445, var446);
                            continue;
                        }
                        if (var517 == 4015) {
                            var6 -= 2;
                            int var447 = class62.field875[var6 + 1];
                            int var448 = class62.field875[var6];
                            class62.field875[var6++] = class45.method348(var448, var447);
                            continue;
                        }
                        if (var517 == 4016) {
                            var6 -= 2;
                            int var449 = class62.field875[var6];
                            int var450 = class62.field875[var6 + 1];
                            class62.field875[var6++] = var449 < var450 ? var449 : var450;
                            continue;
                        }
                        if (var517 == 4017) {
                            var6 -= 2;
                            int var451 = class62.field875[var6 + 1];
                            int var452 = class62.field875[var6];
                            class62.field875[var6++] = var451 >= var452 ? var451 : var452;
                            continue;
                        }
                        if (var517 == 4018) {
                            var6 -= 3;
                            long var453 = (long) class62.field875[var6 + 1];
                            long var455 = (long) class62.field875[var6 + 2];
                            long var457 = (long) class62.field875[var6];
                            class62.field875[var6++] = (int) (var455 * var457 / var453);
                            continue;
                        }
                    } else if (var517 < 4200) {
                        if (var517 == 4100) {
                            var7--;
                            String var364 = class281.field4489[var7];
                            var6--;
                            int var365 = class62.field875[var6];
                            class281.field4489[var7++] = var364 + var365;
                            continue;
                        }
                        if (var517 == 4101) {
                            var7 -= 2;
                            String var366 = class281.field4489[var7];
                            String var367 = class281.field4489[var7 + 1];
                            class281.field4489[var7++] = var366 + var367;
                            continue;
                        }
                        if (var517 == 4102) {
                            var7--;
                            String var368 = class281.field4489[var7];
                            var6--;
                            int var369 = class62.field875[var6];
                            class281.field4489[var7++] = var368 + class52.method409(true, 10, var369);
                            continue;
                        }
                        if (var517 == 4103) {
                            var7--;
                            String var370 = class281.field4489[var7];
                            class281.field4489[var7++] = var370.toLowerCase();
                            continue;
                        }
                        if (var517 == 4104) {
                            var6--;
                            int var371 = class62.field875[var6];
                            long var372 = (long) var371 * 86400000L + 1014768000000L;
                            class223.field3545.setTime(new Date(var372));
                            int var374 = class223.field3545.get(5);
                            int var375 = class223.field3545.get(2);
                            int var376 = class223.field3545.get(1);
                            class281.field4489[var7++] = var374 + "-" + class261.field4144[var375] + "-" + var376;
                            continue;
                        }
                        if (var517 == 4105) {
                            var7 -= 2;
                            String var377 = class281.field4489[var7];
                            String var378 = class281.field4489[var7 + 1];
                            if (class197.field3179.field3746 != null && class197.field3179.field3746.field1432) {
                                class281.field4489[var7++] = var378;
                                continue;
                            }
                            class281.field4489[var7++] = var377;
                            continue;
                        }
                        if (var517 == 4106) {
                            var6--;
                            int var379 = class62.field875[var6];
                            class281.field4489[var7++] = Integer.toString(var379);
                            continue;
                        }
                        if (var517 == 4107) {
                            var7 -= 2;
                            class62.field875[var6++] = class129.method897(class250.method1652(class281.field4489[var7 + 1], class281.field4489[var7], 27403, class261.field4147), -1);
                            continue;
                        }
                        if (var517 == 4108) {
                            var6 -= 2;
                            int var380 = class62.field875[var6 + 1];
                            int var381 = class62.field875[var6];
                            var7--;
                            String var382 = class281.field4489[var7];
                            class62.field875[var6++] = class239.method1576((byte) 69, var380).method1134(var382, var381);
                            continue;
                        }
                        if (var517 == 4109) {
                            var6 -= 2;
                            var7--;
                            String var383 = class281.field4489[var7];
                            int var384 = class62.field875[var6];
                            int var385 = class62.field875[var6 + 1];
                            class62.field875[var6++] = class239.method1576((byte) -55, var385).method1143(var383, var384);
                            continue;
                        }
                        if (var517 == 4110) {
                            var7 -= 2;
                            String var386 = class281.field4489[var7 + 1];
                            String var387 = class281.field4489[var7];
                            var6--;
                            if (class62.field875[var6] == 1) {
                                class281.field4489[var7++] = var387;
                            } else {
                                class281.field4489[var7++] = var386;
                            }
                            continue;
                        }
                        if (var517 == 4111) {
                            var7--;
                            String var388 = class281.field4489[var7];
                            class281.field4489[var7++] = class163.method1138(var388);
                            continue;
                        }
                        if (var517 == 4112) {
                            var6--;
                            int var389 = class62.field875[var6];
                            var7--;
                            String var390 = class281.field4489[var7];
                            if (var389 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class281.field4489[var7++] = var390 + (char) var389;
                            continue;
                        }
                        if (var517 == 4113) {
                            var6--;
                            int var391 = class62.field875[var6];
                            class62.field875[var6++] = class46.method359((char) var391, true) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4114) {
                            var6--;
                            int var392 = class62.field875[var6];
                            class62.field875[var6++] = class206.method1385(22882, (char) var392) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4115) {
                            var6--;
                            int var393 = class62.field875[var6];
                            class62.field875[var6++] = class75.method573(255, (char) var393) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4116) {
                            var6--;
                            int var394 = class62.field875[var6];
                            class62.field875[var6++] = class111.method806(-58, (char) var394) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4117) {
                            var7--;
                            String var395 = class281.field4489[var7];
                            if (var395 == null) {
                                class62.field875[var6++] = 0;
                            } else {
                                class62.field875[var6++] = var395.length();
                            }
                            continue;
                        }
                        if (var517 == 4118) {
                            var6 -= 2;
                            var7--;
                            String var396 = class281.field4489[var7];
                            int var397 = class62.field875[var6];
                            int var398 = class62.field875[var6 + 1];
                            class281.field4489[var7++] = var396.substring(var397, var398);
                            continue;
                        }
                        if (var517 == 4119) {
                            var7--;
                            String var399 = class281.field4489[var7];
                            boolean var400 = false;
                            StringBuffer var401 = new StringBuffer(var399.length());
                            for (int var402 = 0; var402 < var399.length(); var402++) {
                                char var403 = var399.charAt(var402);
                                if (var403 == '<') {
                                    var400 = true;
                                } else if (var403 == '>') {
                                    var400 = false;
                                } else if (!var400) {
                                    var401.append(var403);
                                }
                            }
                            class281.field4489[var7++] = var401.toString();
                            continue;
                        }
                        if (var517 == 4120) {
                            var6 -= 2;
                            int var404 = class62.field875[var6];
                            var7--;
                            String var405 = class281.field4489[var7];
                            int var406 = class62.field875[var6 + 1];
                            class62.field875[var6++] = var405.indexOf(var404, var406);
                            continue;
                        }
                        if (var517 == 4121) {
                            var7 -= 2;
                            String var407 = class281.field4489[var7];
                            String var408 = class281.field4489[var7 + 1];
                            var6--;
                            int var409 = class62.field875[var6];
                            class62.field875[var6++] = var407.indexOf(var408, var409);
                            continue;
                        }
                        if (var517 == 4122) {
                            var6--;
                            int var410 = class62.field875[var6];
                            class62.field875[var6++] = Character.toLowerCase((char) var410);
                            continue;
                        }
                        if (var517 == 4123) {
                            var6--;
                            int var411 = class62.field875[var6];
                            class62.field875[var6++] = Character.toUpperCase((char) var411);
                            continue;
                        }
                        if (var517 == 4124) {
                            var6--;
                            boolean var412 = class62.field875[var6] != 0;
                            var6--;
                            int var413 = class62.field875[var6];
                            class281.field4489[var7++] = class215.method1438(0, (long) var413, var412, 10, class261.field4147);
                            continue;
                        }
                    } else if (var517 < 4300) {
                        if (var517 == 4200) {
                            var6--;
                            int var345 = class62.field875[var6];
                            class281.field4489[var7++] = class64.method514(var345, 0).field3358;
                            continue;
                        }
                        if (var517 == 4201) {
                            var6 -= 2;
                            int var346 = class62.field875[var6];
                            int var347 = class62.field875[var6 + 1];
                            class208 var348 = class64.method514(var346, 0);
                            if (var347 >= 1 && var347 <= 5 && var348.field3353[var347 - 1] != null) {
                                class281.field4489[var7++] = var348.field3353[var347 - 1];
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 4202) {
                            var6 -= 2;
                            int var349 = class62.field875[var6];
                            int var350 = class62.field875[var6 + 1];
                            class208 var351 = class64.method514(var349, 0);
                            if (var350 >= 1 && var350 <= 5 && var351.field3387[var350 - 1] != null) {
                                class281.field4489[var7++] = var351.field3387[var350 - 1];
                                continue;
                            }
                            class281.field4489[var7++] = "";
                            continue;
                        }
                        if (var517 == 4203) {
                            var6--;
                            int var352 = class62.field875[var6];
                            class62.field875[var6++] = class64.method514(var352, 0).field3405;
                            continue;
                        }
                        if (var517 == 4204) {
                            var6--;
                            int var353 = class62.field875[var6];
                            class62.field875[var6++] = class64.method514(var353, 0).field3360 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4205) {
                            var6--;
                            int var354 = class62.field875[var6];
                            class208 var355 = class64.method514(var354, 0);
                            if (var355.field3370 == -1 && var355.field3367 >= 0) {
                                class62.field875[var6++] = var355.field3367;
                                continue;
                            }
                            class62.field875[var6++] = var354;
                            continue;
                        }
                        if (var517 == 4206) {
                            var6--;
                            int var356 = class62.field875[var6];
                            class208 var357 = class64.method514(var356, 0);
                            if (var357.field3370 >= 0 && var357.field3367 >= 0) {
                                class62.field875[var6++] = var357.field3367;
                                continue;
                            }
                            class62.field875[var6++] = var356;
                            continue;
                        }
                        if (var517 == 4207) {
                            var6--;
                            int var358 = class62.field875[var6];
                            class62.field875[var6++] = class64.method514(var358, 0).field3391 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4208) {
                            var6 -= 2;
                            int var359 = class62.field875[var6];
                            int var360 = class62.field875[var6 + 1];
                            class19 var361 = class18.method129(11, var360);
                            if (var361.method133(27144)) {
                                class281.field4489[var7++] = class64.method514(var359, 0).method1404(var361.field227, -76, var360);
                            } else {
                                class62.field875[var6++] = class64.method514(var359, 0).method1406(var361.field222, var360, false);
                            }
                            continue;
                        }
                        if (var517 == 4210) {
                            var6--;
                            int var362 = class62.field875[var6];
                            var7--;
                            String var363 = class281.field4489[var7];
                            class88.method619(7722, var363, var362 == 1);
                            class62.field875[var6++] = class183.field2931;
                            continue;
                        }
                        if (var517 == 4211) {
                            if (class197.field3177 != null && class278.field4459 < class183.field2931) {
                                class62.field875[var6++] = class204.method1369(class197.field3177[class278.field4459++], 65535);
                                continue;
                            }
                            class62.field875[var6++] = -1;
                            continue;
                        }
                        if (var517 == 4212) {
                            class278.field4459 = 0;
                            continue;
                        }
                    } else if (var517 < 4400) {
                        if (var517 == 4300) {
                            var6 -= 2;
                            int var166 = class62.field875[var6];
                            int var167 = class62.field875[var6 + 1];
                            class19 var168 = class18.method129(11, var167);
                            if (var168.method133(27144)) {
                                class281.field4489[var7++] = class104.method741((byte) -71, var166).method1795(125, var168.field227, var167);
                            } else {
                                class62.field875[var6++] = class104.method741((byte) -118, var166).method1797(var168.field222, var167, 9456);
                            }
                            continue;
                        }
                    } else if (var517 >= 4500) {
                        if (var517 < 4600) {
                            if (var517 == 4500) {
                                var6 -= 2;
                                int var169 = class62.field875[var6 + 1];
                                int var170 = class62.field875[var6];
                                class19 var171 = class18.method129(11, var169);
                                if (var171.method133(27144)) {
                                    class281.field4489[var7++] = class227.method1496(var170, true).method1939(true, var171.field227, var169);
                                } else {
                                    class62.field875[var6++] = class227.method1496(var170, true).method1934(0, var171.field222, var169);
                                }
                                continue;
                            }
                        } else if (var517 < 5100) {
                            if (var517 == 5000) {
                                class62.field875[var6++] = class71.field979;
                                continue;
                            }
                            if (var517 == 5001) {
                                var6 -= 3;
                                class71.field979 = class62.field875[var6];
                                class66.field943++;
                                class94.field1331 = class62.field875[var6 + 1];
                                class44.field531 = class62.field875[var6 + 2];
                                class83.field1148.method1238(182, -136478397);
                                class83.field1148.method1757(class71.field979, (byte) -123);
                                class83.field1148.method1757(class94.field1331, (byte) -54);
                                class83.field1148.method1757(class44.field531, (byte) 115);
                                continue;
                            }
                            if (var517 == 5002) {
                                class124.field2068++;
                                var6 -= 2;
                                var7--;
                                String var277 = class281.field4489[var7];
                                int var278 = class62.field875[var6];
                                int var279 = class62.field875[var6 + 1];
                                class83.field1148.method1238(228, -136478397);
                                class83.field1148.method1762(class238.method1570(var277, (byte) 82), (byte) 74);
                                class83.field1148.method1757(var278 - 1, (byte) -4);
                                class83.field1148.method1757(var279, (byte) 123);
                                continue;
                            }
                            if (var517 == 5003) {
                                var6--;
                                int var280 = class62.field875[var6];
                                String var281 = null;
                                if (var280 < 100) {
                                    var281 = class138.field2293[var280];
                                }
                                if (var281 == null) {
                                    var281 = "";
                                }
                                class281.field4489[var7++] = var281;
                                continue;
                            }
                            if (var517 == 5004) {
                                int var282 = -1;
                                var6--;
                                int var283 = class62.field875[var6];
                                if (var283 < 100 && class138.field2293[var283] != null) {
                                    var282 = class201.field3232[var283];
                                }
                                class62.field875[var6++] = var282;
                                continue;
                            }
                            if (var517 == 5005) {
                                class62.field875[var6++] = class94.field1331;
                                continue;
                            }
                            if (var517 == 5008) {
                                var7--;
                                String var284 = class281.field4489[var7];
                                if (var284.startsWith("::")) {
                                    class29.method203(var284, (byte) 93);
                                    continue;
                                }
                                if (class151.field2420 == 0 && (class25.field311 && !class202.field3246 || class124.field2063)) {
                                    continue;
                                }
                                class80.field1104++;
                                byte var285 = 0;
                                byte var286 = 0;
                                String var287 = var284.toLowerCase();
                                if (var287.startsWith(class3.field48)) {
                                    var285 = 0;
                                    var284 = var284.substring(class3.field48.length());
                                } else if (var287.startsWith(class228.field3627)) {
                                    var285 = 1;
                                    var284 = var284.substring(class228.field3627.length());
                                } else if (var287.startsWith(class257.field4103)) {
                                    var285 = 2;
                                    var284 = var284.substring(class257.field4103.length());
                                } else if (var287.startsWith(class274.field4427)) {
                                    var285 = 3;
                                    var284 = var284.substring(class274.field4427.length());
                                } else if (var287.startsWith(class105.field1782)) {
                                    var285 = 4;
                                    var284 = var284.substring(class105.field1782.length());
                                } else if (var287.startsWith(class54.field757)) {
                                    var284 = var284.substring(class54.field757.length());
                                    var285 = 5;
                                } else if (var287.startsWith(class134.field2253)) {
                                    var284 = var284.substring(class134.field2253.length());
                                    var285 = 6;
                                } else if (var287.startsWith(class99.field1512)) {
                                    var284 = var284.substring(class99.field1512.length());
                                    var285 = 7;
                                } else if (var287.startsWith(class183.field2924)) {
                                    var284 = var284.substring(class183.field2924.length());
                                    var285 = 8;
                                } else if (var287.startsWith(class146.field2356)) {
                                    var285 = 9;
                                    var284 = var284.substring(class146.field2356.length());
                                } else if (var287.startsWith(class87.field1185)) {
                                    var285 = 10;
                                    var284 = var284.substring(class87.field1185.length());
                                } else if (var287.startsWith(class42.field502)) {
                                    var285 = 11;
                                    var284 = var284.substring(class42.field502.length());
                                } else if (class261.field4147 != 0) {
                                    if (var287.startsWith(class224.field3558)) {
                                        var285 = 0;
                                        var284 = var284.substring(class224.field3558.length());
                                    } else if (var287.startsWith(client.field3614)) {
                                        var285 = 1;
                                        var284 = var284.substring(client.field3614.length());
                                    } else if (var287.startsWith(class12.field167)) {
                                        var284 = var284.substring(class12.field167.length());
                                        var285 = 2;
                                    } else if (var287.startsWith(class102.field1540)) {
                                        var284 = var284.substring(class102.field1540.length());
                                        var285 = 3;
                                    } else if (var287.startsWith(class78.field1070)) {
                                        var284 = var284.substring(class78.field1070.length());
                                        var285 = 4;
                                    } else if (var287.startsWith(class185.field2977)) {
                                        var285 = 5;
                                        var284 = var284.substring(class185.field2977.length());
                                    } else if (var287.startsWith(class26.field314)) {
                                        var285 = 6;
                                        var284 = var284.substring(class26.field314.length());
                                    } else if (var287.startsWith(class243.field3893)) {
                                        var285 = 7;
                                        var284 = var284.substring(class243.field3893.length());
                                    } else if (var287.startsWith(class256.field4099)) {
                                        var285 = 8;
                                        var284 = var284.substring(class256.field4099.length());
                                    } else if (var287.startsWith(class183.field2929)) {
                                        var284 = var284.substring(class183.field2929.length());
                                        var285 = 9;
                                    } else if (var287.startsWith(class293.field4648)) {
                                        var285 = 10;
                                        var284 = var284.substring(class293.field4648.length());
                                    } else if (var287.startsWith(class16.field197)) {
                                        var285 = 11;
                                        var284 = var284.substring(class16.field197.length());
                                    }
                                }
                                String var288 = var284.toLowerCase();
                                if (var288.startsWith(class257.field4112)) {
                                    var284 = var284.substring(class257.field4112.length());
                                    var286 = 1;
                                } else if (var288.startsWith(class102.field1544)) {
                                    var286 = 2;
                                    var284 = var284.substring(class102.field1544.length());
                                } else if (var288.startsWith(class227.field3596)) {
                                    var284 = var284.substring(class227.field3596.length());
                                    var286 = 3;
                                } else if (var288.startsWith(class224.field3557)) {
                                    var286 = 4;
                                    var284 = var284.substring(class224.field3557.length());
                                } else if (var288.startsWith(class257.field4107)) {
                                    var286 = 5;
                                    var284 = var284.substring(class257.field4107.length());
                                } else if (class261.field4147 != 0) {
                                    if (var288.startsWith(class125.field2099)) {
                                        var284 = var284.substring(class125.field2099.length());
                                        var286 = 1;
                                    } else if (var288.startsWith(class184.field2936)) {
                                        var286 = 2;
                                        var284 = var284.substring(class184.field2936.length());
                                    } else if (var288.startsWith(class146.field2359)) {
                                        var284 = var284.substring(class146.field2359.length());
                                        var286 = 3;
                                    } else if (var288.startsWith(class205.field3278)) {
                                        var284 = var284.substring(class205.field3278.length());
                                        var286 = 4;
                                    } else if (var288.startsWith(field2462)) {
                                        var284 = var284.substring(field2462.length());
                                        var286 = 5;
                                    }
                                }
                                class83.field1148.method1238(159, -136478397);
                                class83.field1148.method1757(0, (byte) 110);
                                int var289 = class83.field1148.field4195;
                                class83.field1148.method1757(var285, (byte) -94);
                                class83.field1148.method1757(var286, (byte) 123);
                                class169.method1188(class83.field1148, (byte) -80, var284);
                                class83.field1148.method1775(118, class83.field1148.field4195 - var289);
                                continue;
                            }
                            if (var517 == 5009) {
                                var7 -= 2;
                                String var290 = class281.field4489[var7];
                                String var291 = class281.field4489[var7 + 1];
                                if (class151.field2420 != 0 || (!class25.field311 || class202.field3246) && !class124.field2063) {
                                    class289.field4616++;
                                    class83.field1148.method1238(218, -136478397);
                                    class83.field1148.method1757(0, (byte) -26);
                                    int var292 = class83.field1148.field4195;
                                    class83.field1148.method1762(class238.method1570(var290, (byte) 115), (byte) 35);
                                    class169.method1188(class83.field1148, (byte) -80, var291);
                                    class83.field1148.method1775(-127, class83.field1148.field4195 - var292);
                                }
                                continue;
                            }
                            if (var517 == 5010) {
                                var6--;
                                int var293 = class62.field875[var6];
                                String var294 = null;
                                if (var293 < 100) {
                                    var294 = class157.field2522[var293];
                                }
                                if (var294 == null) {
                                    var294 = "";
                                }
                                class281.field4489[var7++] = var294;
                                continue;
                            }
                            if (var517 == 5011) {
                                var6--;
                                int var295 = class62.field875[var6];
                                String var296 = null;
                                if (var295 < 100) {
                                    var296 = class168.field2736[var295];
                                }
                                if (var296 == null) {
                                    var296 = "";
                                }
                                class281.field4489[var7++] = var296;
                                continue;
                            }
                            if (var517 == 5012) {
                                var6--;
                                int var297 = class62.field875[var6];
                                int var298 = -1;
                                if (var297 < 100) {
                                    var298 = class151.field2436[var297];
                                }
                                class62.field875[var6++] = var298;
                                continue;
                            }
                            if (var517 == 5015) {
                                String var299;
                                if (class197.field3179 == null || class197.field3179.field3735 == null) {
                                    var299 = class227.field3595;
                                } else {
                                    var299 = class197.field3179.method1552((byte) -128);
                                }
                                class281.field4489[var7++] = var299;
                                continue;
                            }
                            if (var517 == 5016) {
                                class62.field875[var6++] = class44.field531;
                                continue;
                            }
                            if (var517 == 5017) {
                                class62.field875[var6++] = class94.field1398;
                                continue;
                            }
                            if (var517 == 5050) {
                                var6--;
                                int var300 = class62.field875[var6];
                                class281.field4489[var7++] = class57.method437(var300, 14908).field4533;
                                continue;
                            }
                            if (var517 == 5051) {
                                var6--;
                                int var301 = class62.field875[var6];
                                class284 var302 = class57.method437(var301, 14908);
                                if (var302.field4539 == null) {
                                    class62.field875[var6++] = 0;
                                } else {
                                    class62.field875[var6++] = var302.field4539.length;
                                }
                                continue;
                            }
                            if (var517 == 5052) {
                                var6 -= 2;
                                int var303 = class62.field875[var6];
                                int var304 = class62.field875[var6 + 1];
                                class284 var305 = class57.method437(var303, 14908);
                                int var306 = var305.field4539[var304];
                                class62.field875[var6++] = var306;
                                continue;
                            }
                            if (var517 == 5053) {
                                var6--;
                                int var307 = class62.field875[var6];
                                class284 var308 = class57.method437(var307, 14908);
                                if (var308.field4538 == null) {
                                    class62.field875[var6++] = 0;
                                } else {
                                    class62.field875[var6++] = var308.field4538.length;
                                }
                                continue;
                            }
                            if (var517 == 5054) {
                                var6 -= 2;
                                int var309 = class62.field875[var6];
                                int var310 = class62.field875[var6 + 1];
                                class62.field875[var6++] = class57.method437(var309, 14908).field4538[var310];
                                continue;
                            }
                            if (var517 == 5055) {
                                var6--;
                                int var311 = class62.field875[var6];
                                class281.field4489[var7++] = class266.method1805((byte) -72, var311).method1615(1);
                                continue;
                            }
                            if (var517 == 5056) {
                                var6--;
                                int var312 = class62.field875[var6];
                                class245 var313 = class266.method1805((byte) -39, var312);
                                if (var313.field3934 == null) {
                                    class62.field875[var6++] = 0;
                                } else {
                                    class62.field875[var6++] = var313.field3934.length;
                                }
                                continue;
                            }
                            if (var517 == 5057) {
                                var6 -= 2;
                                int var314 = class62.field875[var6];
                                int var315 = class62.field875[var6 + 1];
                                class62.field875[var6++] = class266.method1805((byte) -65, var314).field3934[var315];
                                continue;
                            }
                            if (var517 == 5058) {
                                class45.field536 = new class174();
                                var6--;
                                class45.field536.field2810 = class62.field875[var6];
                                class45.field536.field2806 = class266.method1805((byte) -96, class45.field536.field2810);
                                class45.field536.field2809 = new int[class45.field536.field2806.method1609(0)];
                                continue;
                            }
                            if (var517 == 5059) {
                                class83.field1148.method1238(251, -136478397);
                                class239.field3821++;
                                class83.field1148.method1757(0, (byte) -108);
                                int var316 = class83.field1148.field4195;
                                class83.field1148.method1757(0, (byte) -48);
                                class83.field1148.method1761(class45.field536.field2810, 4334);
                                class45.field536.field2806.method1612(class45.field536.field2809, -90, class83.field1148);
                                class83.field1148.method1775(-78, class83.field1148.field4195 - var316);
                                continue;
                            }
                            if (var517 == 5060) {
                                class74.field1006++;
                                var7--;
                                String var317 = class281.field4489[var7];
                                class83.field1148.method1238(168, -136478397);
                                class83.field1148.method1757(0, (byte) -1);
                                int var318 = class83.field1148.field4195;
                                class83.field1148.method1762(class238.method1570(var317, (byte) 119), (byte) 55);
                                class83.field1148.method1761(class45.field536.field2810, 4334);
                                class45.field536.field2806.method1612(class45.field536.field2809, -28, class83.field1148);
                                class83.field1148.method1775(93, class83.field1148.field4195 - var318);
                                continue;
                            }
                            if (var517 == 5061) {
                                class83.field1148.method1238(251, -136478397);
                                class239.field3821++;
                                class83.field1148.method1757(0, (byte) 113);
                                int var319 = class83.field1148.field4195;
                                class83.field1148.method1757(1, (byte) 115);
                                class83.field1148.method1761(class45.field536.field2810, 4334);
                                class45.field536.field2806.method1612(class45.field536.field2809, -18, class83.field1148);
                                class83.field1148.method1775(-113, class83.field1148.field4195 - var319);
                                continue;
                            }
                            if (var517 == 5062) {
                                var6 -= 2;
                                int var320 = class62.field875[var6];
                                int var321 = class62.field875[var6 + 1];
                                class62.field875[var6++] = class57.method437(var320, 14908).field4529[var321];
                                continue;
                            }
                            if (var517 == 5063) {
                                var6 -= 2;
                                int var322 = class62.field875[var6];
                                int var323 = class62.field875[var6 + 1];
                                class62.field875[var6++] = class57.method437(var322, 14908).field4532[var323];
                                continue;
                            }
                            if (var517 == 5064) {
                                var6 -= 2;
                                int var324 = class62.field875[var6 + 1];
                                int var325 = class62.field875[var6];
                                if (var324 == -1) {
                                    class62.field875[var6++] = -1;
                                } else {
                                    class62.field875[var6++] = class57.method437(var325, 14908).method1905((char) var324, (byte) 54);
                                }
                                continue;
                            }
                            if (var517 == 5065) {
                                var6 -= 2;
                                int var326 = class62.field875[var6];
                                int var327 = class62.field875[var6 + 1];
                                if (var327 == -1) {
                                    class62.field875[var6++] = -1;
                                } else {
                                    class62.field875[var6++] = class57.method437(var326, 14908).method1908((char) var327, 3);
                                }
                                continue;
                            }
                            if (var517 == 5066) {
                                var6--;
                                int var328 = class62.field875[var6];
                                class62.field875[var6++] = class266.method1805((byte) -43, var328).method1609(0);
                                continue;
                            }
                            if (var517 == 5067) {
                                var6 -= 2;
                                int var329 = class62.field875[var6];
                                int var330 = class62.field875[var6 + 1];
                                int var331 = class266.method1805((byte) -61, var329).method1619(var330, 13);
                                class62.field875[var6++] = var331;
                                continue;
                            }
                            if (var517 == 5068) {
                                var6 -= 2;
                                int var332 = class62.field875[var6];
                                int var333 = class62.field875[var6 + 1];
                                class45.field536.field2809[var332] = var333;
                                continue;
                            }
                            if (var517 == 5069) {
                                var6 -= 2;
                                int var334 = class62.field875[var6];
                                int var335 = class62.field875[var6 + 1];
                                class45.field536.field2809[var334] = var335;
                                continue;
                            }
                            if (var517 == 5070) {
                                var6 -= 3;
                                int var336 = class62.field875[var6 + 1];
                                int var337 = class62.field875[var6];
                                int var338 = class62.field875[var6 + 2];
                                class245 var339 = class266.method1805((byte) -33, var337);
                                if (var339.method1619(var336, -90) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class62.field875[var6++] = var339.method1614((byte) 54, var338, var336);
                                continue;
                            }
                            if (var517 == 5071) {
                                var6--;
                                boolean var340 = class62.field875[var6] == 1;
                                var7--;
                                String var341 = class281.field4489[var7];
                                class98.method697(var340, (byte) 36, var341);
                                class62.field875[var6++] = class183.field2931;
                                continue;
                            }
                            if (var517 == 5072) {
                                if (class197.field3177 != null && class278.field4459 < class183.field2931) {
                                    class62.field875[var6++] = class204.method1369(class197.field3177[class278.field4459++], 65535);
                                    continue;
                                }
                                class62.field875[var6++] = -1;
                                continue;
                            }
                            if (var517 == 5073) {
                                class278.field4459 = 0;
                                continue;
                            }
                        } else if (var517 < 5200) {
                            if (var517 == 5100) {
                                if (class247.field3975[86]) {
                                    class62.field875[var6++] = 1;
                                } else {
                                    class62.field875[var6++] = 0;
                                }
                                continue;
                            }
                            if (var517 == 5101) {
                                if (class247.field3975[82]) {
                                    class62.field875[var6++] = 1;
                                } else {
                                    class62.field875[var6++] = 0;
                                }
                                continue;
                            }
                            if (var517 == 5102) {
                                if (class247.field3975[81]) {
                                    class62.field875[var6++] = 1;
                                } else {
                                    class62.field875[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var517 < 5300) {
                            if (var517 == 5200) {
                                var6--;
                                class160.method1101(class62.field875[var6], 74);
                                continue;
                            }
                            if (var517 == 5201) {
                                class62.field875[var6++] = class280.method1871((byte) 126);
                                continue;
                            }
                            if (var517 == 5202) {
                                var6--;
                                class117.method831((byte) 103, class62.field875[var6]);
                                continue;
                            }
                            if (var517 == 5203) {
                                var7--;
                                class57.method438(-1863210852, class281.field4489[var7]);
                                continue;
                            }
                            if (var517 == 5204) {
                                class281.field4489[var7 - 1] = class297.method1982(class281.field4489[var7 - 1], -30273);
                                continue;
                            }
                            if (var517 == 5205) {
                                var6--;
                                class227.method1495(-1, -1, 127, class62.field875[var6]);
                                continue;
                            }
                            if (var517 == 5206) {
                                var6--;
                                int var172 = class62.field875[var6];
                                class125 var173 = class256.method1685(var172 >> 14 & 0x3FFF, var172 & 0x3FFF, false);
                                if (var173 == null) {
                                    class62.field875[var6++] = -1;
                                } else {
                                    class62.field875[var6++] = var173.field2093;
                                }
                                continue;
                            }
                            if (var517 == 5207) {
                                var6--;
                                class125 var174 = class166.method1159(-120, class62.field875[var6]);
                                if (var174 != null && var174.field2084 != null) {
                                    class281.field4489[var7++] = var174.field2084;
                                    continue;
                                }
                                class281.field4489[var7++] = "";
                                continue;
                            }
                            if (var517 == 5208) {
                                class62.field875[var6++] = class224.field3560;
                                class62.field875[var6++] = class194.field3131;
                                continue;
                            }
                            if (var517 == 5209) {
                                class62.field875[var6++] = class122.field2048 + class129.field2149;
                                class62.field875[var6++] = class225.field3569 + class73.field1002 - (class266.field4320 + 1);
                                continue;
                            }
                            if (var517 == 5210) {
                                var6--;
                                int var175 = class62.field875[var6];
                                class125 var176 = class166.method1159(-122, var175);
                                if (var176 == null) {
                                    class62.field875[var6++] = 0;
                                    class62.field875[var6++] = 0;
                                } else {
                                    class62.field875[var6++] = class204.method1369(268425885, var176.field2076) >> 14;
                                    class62.field875[var6++] = class204.method1369(var176.field2076, 16383);
                                }
                                continue;
                            }
                            if (var517 == 5211) {
                                var6--;
                                int var177 = class62.field875[var6];
                                class125 var178 = class166.method1159(-125, var177);
                                if (var178 == null) {
                                    class62.field875[var6++] = 0;
                                    class62.field875[var6++] = 0;
                                } else {
                                    class62.field875[var6++] = var178.field2091 - var178.field2089;
                                    class62.field875[var6++] = var178.field2102 - var178.field2097;
                                }
                                continue;
                            }
                            if (var517 == 5212) {
                                int var179 = class202.method1357(101);
                                int var180 = 0;
                                String var181;
                                if (var179 == -1) {
                                    var181 = "";
                                } else {
                                    var181 = class225.field3572.field1083[var179];
                                    var180 = class225.field3572.method592(260, var179);
                                }
                                String var182 = class247.method1630(" ", (byte) 105, "<br>", var181);
                                class281.field4489[var7++] = var182;
                                class62.field875[var6++] = var180;
                                continue;
                            }
                            if (var517 == 5213) {
                                int var183 = class271.method1829(-1);
                                int var184 = 0;
                                String var185;
                                if (var183 == -1) {
                                    var185 = "";
                                } else {
                                    var185 = class225.field3572.field1083[var183];
                                    var184 = class225.field3572.method592(260, var183);
                                }
                                String var186 = class247.method1630(" ", (byte) 90, "<br>", var185);
                                class281.field4489[var7++] = var186;
                                class62.field875[var6++] = var184;
                                continue;
                            }
                            if (var517 == 5214) {
                                var6--;
                                int var187 = class62.field875[var6];
                                class125 var188 = class161.method1108(0);
                                if (var188 != null) {
                                    int[] var189 = var188.method871(-8251, var187 >> 28 & 0x3, var187 & 0x3FFF, var187 >> 14 & 0x3FFF);
                                    if (var189 != null) {
                                        class62.method478(-1, var189[2], var189[1]);
                                    }
                                }
                                continue;
                            }
                            if (var517 == 5215) {
                                var6 -= 2;
                                int var190 = class62.field875[var6];
                                int var191 = class62.field875[var6 + 1];
                                class247 var192 = class109.method794((byte) 109, var190 & 0x3FFF, var190 >> 14 & 0x3FFF);
                                boolean var193 = false;
                                for (class125 var194 = (class125) var192.method1635(-27); var194 != null; var194 = (class125) var192.method1636((byte) -103)) {
                                    if (var194.field2093 == var191) {
                                        var193 = true;
                                        break;
                                    }
                                }
                                if (var193) {
                                    class62.field875[var6++] = 1;
                                } else {
                                    class62.field875[var6++] = 0;
                                }
                                continue;
                            }
                            if (var517 == 5216) {
                                var6--;
                                int var195 = class62.field875[var6];
                                class198.method1334(32768, var195);
                                continue;
                            }
                            if (var517 == 5217) {
                                var6--;
                                int var196 = class62.field875[var6];
                                if (class119.method841(-1, var196)) {
                                    class62.field875[var6++] = 1;
                                } else {
                                    class62.field875[var6++] = 0;
                                }
                                continue;
                            }
                            if (var517 == 5218) {
                                var6--;
                                int var197 = class62.field875[var6];
                                class125 var198 = class166.method1159(-113, var197);
                                if (var198 == null) {
                                    class62.field875[var6++] = -1;
                                } else {
                                    class62.field875[var6++] = var198.field2081;
                                }
                                continue;
                            }
                            if (var517 == 5219) {
                                var7--;
                                class214.method1435((byte) 110, class281.field4489[var7]);
                                continue;
                            }
                            if (var517 == 5220) {
                                class62.field875[var6++] = class238.field3807 == 100 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 5221) {
                                var6--;
                                int var199 = class62.field875[var6];
                                class62.method478(-1, var199 & 0x3FFF, var199 >> 14 & 0x3FFF);
                                continue;
                            }
                            if (var517 == 5222) {
                                class125 var200 = class161.method1108(0);
                                if (var200 == null) {
                                    class62.field875[var6++] = -1;
                                    class62.field875[var6++] = -1;
                                } else {
                                    int[] var201 = var200.method873(class225.field3569 + class73.field1002 - class266.field4320 - 1, class129.field2149 + class122.field2048, 79);
                                    if (var201 == null) {
                                        class62.field875[var6++] = -1;
                                        class62.field875[var6++] = -1;
                                    } else {
                                        class62.field875[var6++] = var201[1];
                                        class62.field875[var6++] = var201[2];
                                    }
                                }
                                continue;
                            }
                            if (var517 == 5223) {
                                var6 -= 2;
                                int var202 = class62.field875[var6];
                                int var203 = class62.field875[var6 + 1];
                                class227.method1495(var203 & 0x3FFF, var203 >> 14 & 0x3FFF, 122, var202);
                                continue;
                            }
                            if (var517 == 5224) {
                                var6--;
                                int var204 = class62.field875[var6];
                                class125 var205 = class161.method1108(0);
                                if (var205 == null) {
                                    class62.field875[var6++] = -1;
                                    class62.field875[var6++] = -1;
                                } else {
                                    int[] var206 = var205.method871(-8251, var204 >> 28 & 0x3, var204 & 0x3FFF, var204 >> 14 & 0x3FFF);
                                    if (var206 == null) {
                                        class62.field875[var6++] = -1;
                                        class62.field875[var6++] = -1;
                                    } else {
                                        class62.field875[var6++] = var206[1];
                                        class62.field875[var6++] = var206[2];
                                    }
                                }
                                continue;
                            }
                            if (var517 == 5225) {
                                var6--;
                                int var207 = class62.field875[var6];
                                class125 var208 = class161.method1108(0);
                                if (var208 == null) {
                                    class62.field875[var6++] = -1;
                                    class62.field875[var6++] = -1;
                                } else {
                                    int[] var209 = var208.method873(var207 & 0x3FFF, var207 >> 14 & 0x3FFF, 8);
                                    if (var209 == null) {
                                        class62.field875[var6++] = -1;
                                        class62.field875[var6++] = -1;
                                    } else {
                                        class62.field875[var6++] = var209[1];
                                        class62.field875[var6++] = var209[2];
                                    }
                                }
                                continue;
                            }
                        } else if (var517 < 5400) {
                            if (var517 == 5300) {
                                var6 -= 2;
                                class62.field875[var6++] = 0;
                                continue;
                            }
                            if (var517 == 5301) {
                                continue;
                            }
                            if (var517 == 5302) {
                                class62.field875[var6++] = 0;
                                continue;
                            }
                            if (var517 == 5303) {
                                var6--;
                                class62.field875[var6++] = 0;
                                class62.field875[var6++] = 0;
                                continue;
                            }
                            if (var517 == 5305) {
                                byte var274 = -1;
                                class62.field875[var6++] = var274;
                                continue;
                            }
                            if (var517 == 5306) {
                                class62.field875[var6++] = class195.method1321(true);
                                continue;
                            }
                            if (var517 == 5307) {
                                var6--;
                                int var275 = class62.field875[var6];
                                if (var275 < 0 || var275 > 2) {
                                    var275 = 0;
                                }
                                class8.method50((byte) -60, -1, -1, false, var275);
                                continue;
                            }
                            if (var517 == 5308) {
                                class62.field875[var6++] = class207.field3332;
                                continue;
                            }
                            if (var517 == 5309) {
                                var6--;
                                int var276 = class62.field875[var6];
                                if (var276 < 0 || var276 > 2) {
                                    var276 = 0;
                                }
                                class207.field3332 = var276;
                                class101.method712(111, class250.field4006);
                                continue;
                            }
                        } else if (var517 < 5500) {
                            if (var517 == 5400) {
                                class254.field4059++;
                                var7 -= 2;
                                String var210 = class281.field4489[var7 + 1];
                                var6--;
                                int var211 = class62.field875[var6];
                                String var212 = class281.field4489[var7];
                                class83.field1148.method1238(178, -136478397);
                                class83.field1148.method1757(class157.method1060(var212, -4850) + class157.method1060(var210, -4850) + 1, (byte) 4);
                                class83.field1148.method1770(var212, (byte) 110);
                                class83.field1148.method1770(var210, (byte) 111);
                                class83.field1148.method1757(var211, (byte) 107);
                                continue;
                            }
                            if (var517 == 5401) {
                                var6 -= 2;
                                class281.field4502[class62.field875[var6]] = (short) class218.method1447(class62.field875[var6 + 1], -5641);
                                class208.method1413((byte) -13);
                                class287.method1922(-126);
                                class175.method1215(105);
                                class258.method1696((byte) 100);
                                class28.method190(2048);
                                continue;
                            }
                            if (var517 == 5405) {
                                var6 -= 2;
                                int var213 = class62.field875[var6];
                                int var214 = class62.field875[var6 + 1];
                                if (var213 >= 0 && var213 < 2) {
                                    class73.field1004[var213] = new int[var214 << 1][4];
                                }
                                continue;
                            }
                            if (var517 == 5406) {
                                var6 -= 7;
                                int var215 = class62.field875[var6 + 2];
                                int var216 = class62.field875[var6 + 1] << 1;
                                int var217 = class62.field875[var6];
                                int var218 = class62.field875[var6 + 4];
                                int var219 = class62.field875[var6 + 3];
                                int var220 = class62.field875[var6 + 5];
                                int var221 = class62.field875[var6 + 6];
                                if (var217 >= 0 && var217 < 2 && class73.field1004[var217] != null && var216 >= 0 && var216 < class73.field1004[var217].length) {
                                    class73.field1004[var217][var216] = new int[] { (class204.method1369(268429901, var215) >> 14) * 128, var219, class204.method1369(var215, 16383) * 128, var221 };
                                    class73.field1004[var217][var216 + 1] = new int[] { (class204.method1369(268421047, var218) >> 14) * 128, var220, class204.method1369(16383, var218) * 128 };
                                }
                                continue;
                            }
                            if (var517 == 5407) {
                                var6--;
                                int var222 = class73.field1004[class62.field875[var6]].length >> 1;
                                class62.field875[var6++] = var222;
                                continue;
                            }
                            if (var517 == 5411) {
                                if (class284.field4537 == null) {
                                    class263.method1726(class117.method833((byte) -77), false, -17137);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var517 == 5419) {
                                String var223 = "";
                                if (class184.field2953 != null) {
                                    if (class184.field2953.field2266 == null) {
                                        var223 = class238.method1564(81, class184.field2953.field2270);
                                    } else {
                                        var223 = (String) class184.field2953.field2266;
                                    }
                                }
                                class281.field4489[var7++] = var223;
                                continue;
                            }
                            if (var517 == 5420) {
                                class62.field875[var6++] = class255.field4071 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 5421) {
                                var6--;
                                boolean var224 = class62.field875[var6] == 1;
                                var7--;
                                String var225 = class281.field4489[var7];
                                String var226 = class117.method833((byte) -77) + var225;
                                if (class284.field4537 != null || var224 && class255.field4071 != 3 && class255.field4084.startsWith("win") && !class274.field4421) {
                                    class70.field966 = var224;
                                    class133.field2206 = var226;
                                    class82.field1146 = class250.field4006.method1674(0, var226);
                                    continue;
                                }
                                class263.method1726(var226, var224, -17137);
                                continue;
                            }
                            if (var517 == 5422) {
                                var7 -= 2;
                                String var227 = class281.field4489[var7];
                                String var228 = class281.field4489[var7 + 1];
                                var6--;
                                int var229 = class62.field875[var6];
                                if (var227.length() > 0) {
                                    if (class39.field476 == null) {
                                        class39.field476 = new String[class246.field3950[class189.field3026]];
                                    }
                                    class39.field476[var229] = var227;
                                }
                                if (var228.length() > 0) {
                                    if (class92.field1311 == null) {
                                        class92.field1311 = new String[class246.field3950[class189.field3026]];
                                    }
                                    class92.field1311[var229] = var228;
                                }
                                continue;
                            }
                            if (var517 == 5423) {
                                var7--;
                                System.out.println(class281.field4489[var7]);
                                continue;
                            }
                            if (var517 == 5424) {
                                var6 -= 11;
                                class74.field1012 = class62.field875[var6];
                                class62.field867 = class62.field875[var6 + 1];
                                class247.field3972 = class62.field875[var6 + 2];
                                class64.field901 = class62.field875[var6 + 3];
                                class130.field2180 = class62.field875[var6 + 4];
                                class33.field409 = class62.field875[var6 + 5];
                                class49.field624 = class62.field875[var6 + 6];
                                class20.field234 = class62.field875[var6 + 7];
                                class129.field2167 = class62.field875[var6 + 8];
                                class267.field4335 = class62.field875[var6 + 9];
                                class86.field1178 = class62.field875[var6 + 10];
                                class169.field2739.method935((byte) 31, class130.field2180);
                                class169.field2739.method935((byte) 31, class33.field409);
                                class169.field2739.method935((byte) 31, class49.field624);
                                class169.field2739.method935((byte) 31, class20.field234);
                                class169.field2739.method935((byte) 31, class129.field2167);
                                class41.field482 = true;
                                continue;
                            }
                            if (var517 == 5425) {
                                class113.method811(104);
                                class41.field482 = false;
                                continue;
                            }
                            if (var517 == 5426) {
                                var6--;
                                class224.field3559 = class62.field875[var6];
                                continue;
                            }
                            if (var517 == 5427) {
                                var6 -= 2;
                                class38.field466 = class62.field875[var6];
                                class227.field3593 = class62.field875[var6 + 1];
                                continue;
                            }
                            if (var517 == 5428) {
                                var6 -= 2;
                                int var230 = class62.field875[var6];
                                int var231 = class62.field875[var6 + 1];
                                class62.field875[var6++] = class34.method236((byte) -122, var231, var230) ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 5600) {
                            if (var517 == 5500) {
                                var6 -= 4;
                                int var262 = class62.field875[var6];
                                int var263 = class62.field875[var6 + 3];
                                int var264 = class62.field875[var6 + 2];
                                int var265 = class62.field875[var6 + 1];
                                class233.method1540(false, (var262 >> 14 & 0x3FFF) - class296.field4685, var265, (var262 & 0x3FFF) - class93.field1321, (byte) 123, var264, var263);
                                continue;
                            }
                            if (var517 == 5501) {
                                var6 -= 4;
                                int var266 = class62.field875[var6 + 1];
                                int var267 = class62.field875[var6 + 2];
                                int var268 = class62.field875[var6];
                                int var269 = class62.field875[var6 + 3];
                                class209.method1421((var268 & 0x3FFF) - class93.field1321, var269, var266, -75, ((var268 & 0xFFFE871) >> 14) - class296.field4685, var267);
                                continue;
                            }
                            if (var517 == 5502) {
                                var6 -= 6;
                                int var270 = class62.field875[var6];
                                if (var270 >= 2) {
                                    throw new RuntimeException();
                                }
                                class61.field837 = var270;
                                int var271 = class62.field875[var6 + 1];
                                if (var271 + 1 >= class73.field1004[class61.field837].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class289.field4622 = var271;
                                class148.field2384 = 0;
                                class138.field2279 = class62.field875[var6 + 2];
                                class6.field77 = class62.field875[var6 + 3];
                                int var272 = class62.field875[var6 + 4];
                                if (var272 >= 2) {
                                    throw new RuntimeException();
                                }
                                class248.field3984 = var272;
                                int var273 = class62.field875[var6 + 5];
                                if ((class73.field1004[class248.field3984].length >> 1) <= (var273 + 1)) {
                                    throw new RuntimeException();
                                }
                                class175.field2821 = var273;
                                class92.field1316 = 3;
                                continue;
                            }
                            if (var517 == 5503) {
                                class240.method1583((byte) 119);
                                continue;
                            }
                            if (var517 == 5504) {
                                var6 -= 2;
                                class133.method911(-87, class62.field875[var6], class62.field875[var6 + 1]);
                                continue;
                            }
                            if (var517 == 5505) {
                                class62.field875[var6++] = (int) client.field3605;
                                continue;
                            }
                            if (var517 == 5506) {
                                class62.field875[var6++] = (int) class121.field2039;
                                continue;
                            }
                            if (var517 == 5507) {
                                class162.method1109(16249);
                                continue;
                            }
                            if (var517 == 5508) {
                                class280.method1872(-16);
                                continue;
                            }
                            if (var517 == 5509) {
                                class134.method920(-13992);
                                continue;
                            }
                            if (var517 == 5510) {
                                class102.method716(-115);
                                continue;
                            }
                            if (var517 == 5512) {
                                class249.method1646(0);
                                continue;
                            }
                        } else if (var517 < 5700) {
                            if (var517 == 5600) {
                                var7 -= 2;
                                String var232 = class281.field4489[var7];
                                var6--;
                                int var233 = class62.field875[var6];
                                String var234 = class281.field4489[var7 + 1];
                                if (class21.field249 == 10 && class95.field1440 == 0 && class274.field4425 == 0 && class95.field1429 == 0 && class266.field4315 == 0) {
                                    class191.method1298(var234, var232, var233, 2124055404);
                                }
                                continue;
                            }
                            if (var517 == 5601) {
                                class106.method782(false);
                                continue;
                            }
                            if (var517 == 5602) {
                                if (class274.field4425 == 0) {
                                    class157.field2523 = -2;
                                }
                                continue;
                            }
                            if (var517 == 5603) {
                                var6 -= 4;
                                if (class21.field249 == 10 && class95.field1440 == 0 && class274.field4425 == 0 && class95.field1429 == 0 && class266.field4315 == 0) {
                                    class159.method1099(class62.field875[var6 + 2], class62.field875[var6 + 1], 0, class62.field875[var6], class62.field875[var6 + 3]);
                                }
                                continue;
                            }
                            if (var517 == 5604) {
                                var7--;
                                if (class21.field249 == 10 && class95.field1440 == 0 && class274.field4425 == 0 && class95.field1429 == 0 && class266.field4315 == 0) {
                                    class196.method1327(class238.method1570(class281.field4489[var7], (byte) 113), 7971);
                                }
                                continue;
                            }
                            if (var517 == 5605) {
                                var6 -= 7;
                                var7 -= 3;
                                if (class21.field249 == 10 && class95.field1440 == 0 && class274.field4425 == 0 && class95.field1429 == 0 && class266.field4315 == 0) {
                                    class110.method798(class62.field875[var6 + 5] == 1, class62.field875[var6 + 3], class62.field875[var6], class62.field875[var6 + 1], class281.field4489[var7 + 2], class62.field875[var6 + 4] == 1, class281.field4489[var7 + 1], 14, class238.method1570(class281.field4489[var7], (byte) 88), class62.field875[var6 + 2], class62.field875[var6 + 6] == 1);
                                }
                                continue;
                            }
                            if (var517 == 5606) {
                                if (class95.field1429 == 0) {
                                    class104.field1736 = -2;
                                }
                                continue;
                            }
                            if (var517 == 5607) {
                                class62.field875[var6++] = class157.field2523;
                                continue;
                            }
                            if (var517 == 5608) {
                                class62.field875[var6++] = class7.field88;
                                continue;
                            }
                            if (var517 == 5609) {
                                class62.field875[var6++] = class104.field1736;
                                continue;
                            }
                            if (var517 == 5610) {
                                for (int var235 = 0; var235 < 5; var235++) {
                                    class281.field4489[var7++] = class227.field3586.length <= var235 ? "" : class243.method1598(class227.field3586[var235], -30311);
                                }
                                class227.field3586 = null;
                                continue;
                            }
                            if (var517 == 5611) {
                                class62.field875[var6++] = class200.field3229;
                                continue;
                            }
                        } else if (var517 < 6100) {
                            if (var517 == 6001) {
                                var6--;
                                int var253 = class62.field875[var6];
                                if (var253 < 1) {
                                    var253 = 1;
                                }
                                if (var253 > 4) {
                                    var253 = 4;
                                }
                                class257.field4109 = var253;
                                if (class257.field4109 == 1) {
                                    class145.method993(0.9F);
                                }
                                if (class257.field4109 == 2) {
                                    class145.method993(0.8F);
                                }
                                if (class257.field4109 == 3) {
                                    class145.method993(0.7F);
                                }
                                if (class257.field4109 == 4) {
                                    class145.method993(0.6F);
                                }
                                class287.method1922(-124);
                                class101.method712(51, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6002) {
                                var6--;
                                class101.method713(class62.field875[var6] == 1, -21793);
                                class94.method663(111);
                                class102.method714(-11);
                                class58.method446(19956);
                                class101.method712(108, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6003) {
                                var6--;
                                class38.field468 = class62.field875[var6] == 1;
                                class58.method446(19956);
                                class101.method712(48, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6005) {
                                var6--;
                                class205.field3279 = class62.field875[var6] == 1;
                                class102.method714(-11);
                                class101.method712(114, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6006) {
                                var6--;
                                class168.field2735 = class62.field875[var6] == 1;
                                ((class185) class145.field2350).method1264((byte) 55, !class168.field2735);
                                class101.method712(119, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6007) {
                                var6--;
                                class183.field2928 = class62.field875[var6] == 1;
                                class101.method712(63, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6008) {
                                var6--;
                                class96.field1442 = class62.field875[var6] == 1;
                                class101.method712(102, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6009) {
                                var6--;
                                class9.field138 = class62.field875[var6] == 1;
                                class101.method712(20, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6010) {
                                var6--;
                                class22.field270 = class62.field875[var6] == 1;
                                class101.method712(15, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6011) {
                                var6--;
                                int var254 = class62.field875[var6];
                                if (var254 < 0 || var254 > 2) {
                                    var254 = 0;
                                }
                                class96.field1454 = var254;
                                class101.method712(24, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6012) {
                                var6--;
                                class28.field339 = class62.field875[var6] == 1;
                                if (class257.field4109 == 1) {
                                    class145.method993(0.9F);
                                }
                                if (class257.field4109 == 2) {
                                    class145.method993(0.8F);
                                }
                                if (class257.field4109 == 3) {
                                    class145.method993(0.7F);
                                }
                                if (class257.field4109 == 4) {
                                    class145.method993(0.6F);
                                }
                                class102.method714(-11);
                                class101.method712(43, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6014) {
                                var6--;
                                class133.field2207 = class62.field875[var6] == 1;
                                class101.method712(111, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6015) {
                                var6--;
                                class235.field3744 = class62.field875[var6] == 1;
                                class101.method712(120, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6016) {
                                var6--;
                                int var255 = class62.field875[var6];
                                if (var255 < 0 || var255 > 2) {
                                    var255 = 0;
                                }
                                class108.field1877 = var255;
                                continue;
                            }
                            if (var517 == 6017) {
                                var6--;
                                class195.field3161 = class62.field875[var6] == 1;
                                class78.method585(71);
                                class101.method712(55, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6018) {
                                var6--;
                                int var256 = class62.field875[var6];
                                if (var256 < 0) {
                                    var256 = 0;
                                }
                                if (var256 > 127) {
                                    var256 = 127;
                                }
                                class153.field2469 = var256;
                                class101.method712(28, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6019) {
                                var6--;
                                int var257 = class62.field875[var6];
                                if (var257 < 0) {
                                    var257 = 0;
                                }
                                if (var257 > 255) {
                                    var257 = 255;
                                }
                                if (class92.field1319 != var257) {
                                    if (class92.field1319 == 0 && class88.field1212 != -1) {
                                        class284.method1903(0, var257, 35, class198.field3188, false, class88.field1212);
                                        class82.field1141 = false;
                                    } else if (var257 == 0) {
                                        class222.method1471((byte) -109);
                                        class82.field1141 = false;
                                    } else {
                                        class177.method1221(var257, 109);
                                    }
                                    class92.field1319 = var257;
                                }
                                class101.method712(85, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6020) {
                                var6--;
                                int var258 = class62.field875[var6];
                                if (var258 < 0) {
                                    var258 = 0;
                                }
                                if (var258 > 127) {
                                    var258 = 127;
                                }
                                class45.field548 = var258;
                                class101.method712(28, class250.field4006);
                                class185.field2968 = false;
                                continue;
                            }
                            if (var517 == 6021) {
                                var6--;
                                class239.field3828 = class62.field875[var6] == 1;
                                class58.method446(19956);
                                continue;
                            }
                            if (var517 == 6023) {
                                var6--;
                                int var259 = class62.field875[var6];
                                boolean var260 = false;
                                if (var259 < 0) {
                                    var259 = 0;
                                }
                                if (var259 > 2) {
                                    var259 = 2;
                                }
                                if (class30.field370 < 96) {
                                    var259 = 0;
                                    var260 = true;
                                }
                                class4.method31(var259);
                                class101.method712(116, class250.field4006);
                                class185.field2968 = false;
                                class62.field875[var6++] = var260 ? 0 : 1;
                                continue;
                            }
                            if (var517 == 6024) {
                                var6--;
                                int var261 = class62.field875[var6];
                                if (var261 < 0 || var261 > 2) {
                                    var261 = 0;
                                }
                                class239.field3819 = var261;
                                class101.method712(71, class250.field4006);
                                continue;
                            }
                            if (var517 == 6027) {
                                var6--;
                                continue;
                            }
                            if (var517 == 6028) {
                                var6--;
                                class94.field1376 = class62.field875[var6] != 0;
                                class101.method712(123, class250.field4006);
                                continue;
                            }
                        } else if (var517 < 6200) {
                            if (var517 == 6101) {
                                class62.field875[var6++] = class257.field4109;
                                continue;
                            }
                            if (var517 == 6102) {
                                class62.field875[var6++] = class200.method1349(false) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6103) {
                                class62.field875[var6++] = class38.field468 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6105) {
                                class62.field875[var6++] = class205.field3279 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6106) {
                                class62.field875[var6++] = class168.field2735 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6107) {
                                class62.field875[var6++] = class183.field2928 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6108) {
                                class62.field875[var6++] = class96.field1442 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6109) {
                                class62.field875[var6++] = class9.field138 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6110) {
                                class62.field875[var6++] = class22.field270 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6111) {
                                class62.field875[var6++] = class96.field1454;
                                continue;
                            }
                            if (var517 == 6112) {
                                class62.field875[var6++] = class28.field339 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6114) {
                                class62.field875[var6++] = class133.field2207 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6115) {
                                class62.field875[var6++] = class235.field3744 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6116) {
                                class62.field875[var6++] = class108.field1877;
                                continue;
                            }
                            if (var517 == 6117) {
                                class62.field875[var6++] = class195.field3161 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6118) {
                                class62.field875[var6++] = class153.field2469;
                                continue;
                            }
                            if (var517 == 6119) {
                                class62.field875[var6++] = class92.field1319;
                                continue;
                            }
                            if (var517 == 6120) {
                                class62.field875[var6++] = class45.field548;
                                continue;
                            }
                            if (var517 == 6121) {
                                class62.field875[var6++] = 0;
                                continue;
                            }
                            if (var517 == 6123) {
                                class62.field875[var6++] = class4.method29();
                                continue;
                            }
                            if (var517 == 6124) {
                                class62.field875[var6++] = class239.field3819;
                                continue;
                            }
                            if (var517 == 6126) {
                                class62.field875[var6++] = 0;
                                continue;
                            }
                            if (var517 == 6127) {
                                class62.field875[var6++] = class79.field1093 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6128) {
                                class62.field875[var6++] = class94.field1376 ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 6300) {
                            if (var517 == 6200) {
                                var6 -= 2;
                                class17.field199 = (short) class62.field875[var6];
                                if (class17.field199 <= 0) {
                                    class17.field199 = 256;
                                }
                                class268.field4352 = (short) class62.field875[var6 + 1];
                                if (class268.field4352 <= 0) {
                                    class268.field4352 = 205;
                                }
                                continue;
                            }
                            if (var517 == 6201) {
                                var6 -= 2;
                                class131.field2188 = (short) class62.field875[var6];
                                if (class131.field2188 <= 0) {
                                    class131.field2188 = 256;
                                }
                                class127.field2134 = (short) class62.field875[var6 + 1];
                                if (class127.field2134 <= 0) {
                                    class127.field2134 = 320;
                                }
                                continue;
                            }
                            if (var517 == 6202) {
                                var6 -= 4;
                                class272.field4389 = (short) class62.field875[var6];
                                if (class272.field4389 <= 0) {
                                    class272.field4389 = 1;
                                }
                                class217.field3476 = (short) class62.field875[var6 + 1];
                                if (class217.field3476 <= 0) {
                                    class217.field3476 = 32767;
                                } else if (class217.field3476 < class272.field4389) {
                                    class217.field3476 = class272.field4389;
                                }
                                class143.field2310 = (short) class62.field875[var6 + 2];
                                if (class143.field2310 <= 0) {
                                    class143.field2310 = 1;
                                }
                                class130.field2176 = (short) class62.field875[var6 + 3];
                                if (class130.field2176 <= 0) {
                                    class130.field2176 = 32767;
                                } else if (class143.field2310 > class130.field2176) {
                                    class130.field2176 = class143.field2310;
                                }
                                continue;
                            }
                            if (var517 == 6203) {
                                class283.method1902(0, class191.field3056.field1693, class191.field3056.field1691, 0, false, (byte) 123);
                                class62.field875[var6++] = class273.field4413;
                                class62.field875[var6++] = class171.field2755;
                                continue;
                            }
                            if (var517 == 6204) {
                                class62.field875[var6++] = class131.field2188;
                                class62.field875[var6++] = class127.field2134;
                                continue;
                            }
                            if (var517 == 6205) {
                                class62.field875[var6++] = class17.field199;
                                class62.field875[var6++] = class268.field4352;
                                continue;
                            }
                        } else if (var517 < 6400) {
                            if (var517 == 6300) {
                                class62.field875[var6++] = (int) (class182.method1253(20215) / 60000L);
                                continue;
                            }
                            if (var517 == 6301) {
                                class62.field875[var6++] = (int) (class182.method1253(20215) / 86400000L) - 11745;
                                continue;
                            }
                            if (var517 == 6302) {
                                var6 -= 3;
                                int var248 = class62.field875[var6];
                                int var249 = class62.field875[var6 + 2];
                                int var250 = class62.field875[var6 + 1];
                                class223.field3545.clear();
                                class223.field3545.set(11, 12);
                                class223.field3545.set(var249, var250, var248);
                                class62.field875[var6++] = (int) (class223.field3545.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var517 == 6303) {
                                class223.field3545.clear();
                                class223.field3545.setTime(new Date(class182.method1253(20215)));
                                class62.field875[var6++] = class223.field3545.get(1);
                                continue;
                            }
                            if (var517 == 6304) {
                                var6--;
                                int var251 = class62.field875[var6];
                                boolean var252 = true;
                                if (var251 < 0) {
                                    var252 = (var251 + 1) % 4 == 0;
                                } else if (var251 < 1582) {
                                    var252 = (var251 % 4) == 0;
                                } else if ((var251 % 4) != 0) {
                                    var252 = false;
                                } else if (var251 % 100 != 0) {
                                    var252 = true;
                                } else if ((var251 % 400) != 0) {
                                    var252 = false;
                                }
                                class62.field875[var6++] = var252 ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 6500) {
                            if (var517 == 6405) {
                                class62.field875[var6++] = class177.method1223(114) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6406) {
                                class62.field875[var6++] = class199.method1340(-122) ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 6600) {
                            if (var517 == 6500) {
                                if (class21.field249 == 10 && class95.field1440 == 0 && class274.field4425 == 0 && class95.field1429 == 0) {
                                    class62.field875[var6++] = class295.method1970((byte) 112) == -1 ? 0 : 1;
                                    continue;
                                }
                                class62.field875[var6++] = 1;
                                continue;
                            }
                            if (var517 == 6501) {
                                class219 var236 = class175.method1210((byte) -122);
                                if (var236 == null) {
                                    class62.field875[var6++] = -1;
                                    class62.field875[var6++] = 0;
                                    class281.field4489[var7++] = "";
                                    class62.field875[var6++] = 0;
                                    class281.field4489[var7++] = "";
                                    class62.field875[var6++] = 0;
                                } else {
                                    class62.field875[var6++] = var236.field3508;
                                    class62.field875[var6++] = var236.field2634;
                                    class281.field4489[var7++] = var236.field3509;
                                    class220 var237 = var236.method1457(false);
                                    class62.field875[var6++] = var237.field3514;
                                    class281.field4489[var7++] = var237.field3516;
                                    class62.field875[var6++] = var236.field2629;
                                }
                                continue;
                            }
                            if (var517 == 6502) {
                                class219 var238 = class12.method69(false);
                                if (var238 == null) {
                                    class62.field875[var6++] = -1;
                                    class62.field875[var6++] = 0;
                                    class281.field4489[var7++] = "";
                                    class62.field875[var6++] = 0;
                                    class281.field4489[var7++] = "";
                                    class62.field875[var6++] = 0;
                                } else {
                                    class62.field875[var6++] = var238.field3508;
                                    class62.field875[var6++] = var238.field2634;
                                    class281.field4489[var7++] = var238.field3509;
                                    class220 var239 = var238.method1457(false);
                                    class62.field875[var6++] = var239.field3514;
                                    class281.field4489[var7++] = var239.field3516;
                                    class62.field875[var6++] = var238.field2629;
                                }
                                continue;
                            }
                            if (var517 == 6503) {
                                var6--;
                                int var240 = class62.field875[var6];
                                if (class21.field249 == 10 && class95.field1440 == 0 && class274.field4425 == 0 && class95.field1429 == 0) {
                                    class62.field875[var6++] = class270.method1821(var240, true) ? 1 : 0;
                                    continue;
                                }
                                class62.field875[var6++] = 0;
                                continue;
                            }
                            if (var517 == 6504) {
                                var6--;
                                class71.field981 = class62.field875[var6];
                                class101.method712(66, class250.field4006);
                                continue;
                            }
                            if (var517 == 6505) {
                                class62.field875[var6++] = class71.field981;
                                continue;
                            }
                            if (var517 == 6506) {
                                var6--;
                                int var241 = class62.field875[var6];
                                class219 var242 = class268.method1817(var241, -105);
                                if (var242 == null) {
                                    class62.field875[var6++] = -1;
                                    class281.field4489[var7++] = "";
                                    class62.field875[var6++] = 0;
                                    class281.field4489[var7++] = "";
                                    class62.field875[var6++] = 0;
                                } else {
                                    class62.field875[var6++] = var242.field2634;
                                    class281.field4489[var7++] = var242.field3509;
                                    class220 var243 = var242.method1457(false);
                                    class62.field875[var6++] = var243.field3514;
                                    class281.field4489[var7++] = var243.field3516;
                                    class62.field875[var6++] = var242.field2629;
                                }
                                continue;
                            }
                            if (var517 == 6507) {
                                var6 -= 4;
                                int var244 = class62.field875[var6];
                                boolean var245 = class62.field875[var6 + 1] == 1;
                                int var246 = class62.field875[var6 + 2];
                                boolean var247 = class62.field875[var6 + 3] == 1;
                                class9.method52(var246, var245, var244, 0, var247);
                                continue;
                            }
                        } else if (var517 < 6700) {
                            if (var517 == 6600) {
                                var6--;
                                class107.field1867 = class62.field875[var6] == 1;
                                class101.method712(19, class250.field4006);
                                continue;
                            }
                            if (var517 == 6601) {
                                class62.field875[var6++] = class107.field1867 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var517 == 4400) {
                        var6 -= 2;
                        int var342 = class62.field875[var6 + 1];
                        int var343 = class62.field875[var6];
                        class19 var344 = class18.method129(11, var342);
                        if (var344.method133(27144)) {
                            class281.field4489[var7++] = class119.method842(121, var343).method657(var344.field227, var342, 529853962);
                        } else {
                            class62.field875[var6++] = class119.method842(-14, var343).method660((byte) 1, var342, var344.field222);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var516) {
            if (var5.field4692 == null) {
                if (class92.field1312 != 0) {
                    class297.method1986(0, "", true, "Clientscript error - check log for details");
                }
                class272.method1837("CS2 - scr:" + var5.field962 + " op:" + var9, 1, var516);
            } else {
                StringBuffer var513 = new StringBuffer(30);
                var513.append("%0a - in: ").append(var5.field4692);
                for (int var514 = class49.field633 - 1; var514 >= 0; var514--) {
                    var513.append("%0a - via: ").append(class186.field2987[var514].field3185.field4692);
                }
                if (var9 == 40) {
                    int var515 = var8[var10];
                    var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                }
                if (class92.field1312 != 0) {
                    class297.method1986(0, "", true, "Clientscript error in: " + var5.field4692);
                }
                class272.method1837("CS2 - scr:" + var5.field962 + " op:" + var9 + var513.toString(), 1, var516);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
    public static final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class63.method494(arg1, arg0, arg1 + arg2, arg0 + arg3);
        class63.method507(arg1, arg0, arg2, arg3, 0);
        field2465++;
        if (class238.field3807 < 100) {
            return;
        }
        if (class208.field3383 == null || class208.field3383.field4383 != arg2 || class208.field3383.field4372 != arg3) {
            class43 var5 = new class43(arg2, arg3);
            class63.method508(var5.field510, arg2, arg3);
            class196.method1325(arg2, 0, 0, arg3, 0, class225.field3569, 0, class183.field2927, 0);
            class208.field3383 = var5;
            class217.field3478.method1028(arg4 - 58);
        }
        class208.field3383.method166(arg1, arg0);
        if (arg4 != -43) {
            return;
        }
        int var6 = class224.field3560 * arg2 / class183.field2927;
        int var7 = class16.field196 * arg2 / class183.field2927 + arg1;
        int var8 = class194.field3131 * arg3 / class225.field3569;
        int var9 = arg0 + (class44.field533 * arg3 / class225.field3569);
        int var10 = 16711680;
        if (class189.field3026 == 1) {
            var10 = 16777215;
        }
        class63.method504(var7, var9, var6, var8, var10, 128);
        class63.method510(var7, var9, var6, var8, var10);
        if (class11.field156 <= 0) {
            return;
        }
        int var11;
        if (class129.field2165 <= 10) {
            var11 = class129.field2165 * 25;
        } else {
            var11 = 500 - (class129.field2165 * 25);
        }
        for (class22 var12 = (class22) class295.field4666.method365(3); var12 != null; var12 = (class22) class295.field4666.method372((byte) 7)) {
            if (class144.field2330 == var12.field275) {
                int var13 = var12.field278 * arg2 / class183.field2927 + arg1;
                int var14 = var12.field273 * arg3 / class225.field3569 + arg0;
                class63.method504(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lhi;I)V")
    public static final void method1031(class264 arg0, int arg1) {
        field2457++;
        if (arg1 != 21806) {
            return;
        }
        for (int var2 = 0; var2 < class82.field1143; var2++) {
            int var3 = arg0.method1729(false);
            int var4 = arg0.method1777(-83);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class238.field3803[var3] != null) {
                class238.field3803[var3].field2629 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        if (class128.field2139 > 0) {
            class128.field2139--;
        }
        if (class42.field504 > 1) {
            class61.field844 = class64.field906;
            class42.field504--;
        }
        field2458++;
        if (class203.field3268) {
            class203.field3268 = false;
            class79.method589(true);
            return;
        }
        for (int var1 = 0; var1 < 100 && class160.method1102((byte) 77); var1++) {
        }
        if (class21.field249 != 30) {
            return;
        }
        class110.method799(class83.field1148, 0, 60);
        Object var2 = class62.field861.field2067;
        synchronized (class62.field861.field2067) {
            if (!class253.field4051) {
                class62.field861.field2072 = 0;
            } else if (class58.field815 != 0 || class62.field861.field2072 >= 40) {
                class83.field1148.method1238(130, -136478397);
                class100.field1518++;
                class83.field1148.method1757(0, (byte) 110);
                int var3 = 0;
                int var4 = class83.field1148.field4195;
                for (int var5 = 0; class62.field861.field2072 > var5 && (class83.field1148.field4195 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class62.field861.field2073[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class62.field861.field2074[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class62.field861.field2073[var5] == -1 && class62.field861.field2074[var5] == -1) {
                        var6 = -1;
                        var7 = true;
                        var8 = -1;
                    }
                    if (class201.field3233 != var8 || class235.field3759 != var6) {
                        int var9 = var6 - class235.field3759;
                        class235.field3759 = var6;
                        int var10 = var8 - class201.field3233;
                        class201.field3233 = var8;
                        if (class124.field2066 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class83.field1148.method1761((class124.field2066 << 12) + var9 + (var10 << 6), 4334);
                            class124.field2066 = 0;
                        } else if (class124.field2066 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class83.field1148.method1757(class124.field2066 + 128, (byte) 109);
                            var10 += 128;
                            var9 += 128;
                            class83.field1148.method1761((var10 << 8) + var9, 4334);
                            class124.field2066 = 0;
                        } else if (class124.field2066 < 32) {
                            class83.field1148.method1757(class124.field2066 + 192, (byte) 116);
                            if (var7) {
                                class83.field1148.method1789((byte) -38, Integer.MIN_VALUE);
                            } else {
                                class83.field1148.method1789((byte) -38, var8 | var6 << 16);
                            }
                            class124.field2066 = 0;
                        } else {
                            class83.field1148.method1761(class124.field2066 + 57344, 4334);
                            if (var7) {
                                class83.field1148.method1789((byte) -38, Integer.MIN_VALUE);
                            } else {
                                class83.field1148.method1789((byte) -38, var6 << 16 | var8);
                            }
                            class124.field2066 = 0;
                        }
                    } else if (class124.field2066 < 2047) {
                        class124.field2066++;
                    }
                }
                class83.field1148.method1775(74, class83.field1148.field4195 - var4);
                if (class62.field861.field2072 <= var3) {
                    class62.field861.field2072 = 0;
                } else {
                    class62.field861.field2072 -= var3;
                    for (int var11 = 0; var11 < class62.field861.field2072; var11++) {
                        class62.field861.field2074[var11] = class62.field861.field2074[var3 + var11];
                        class62.field861.field2073[var11] = class62.field861.field2073[var3 + var11];
                    }
                }
            }
        }
        if (class58.field815 != 0) {
            long var12 = (class271.field4378 - class71.field972) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class71.field972 = class271.field4378;
            class253.field4049++;
            byte var14 = 0;
            if (class58.field815 == 2) {
                var14 = 1;
            }
            int var15 = class266.field4319;
            int var16 = (int) var12;
            int var17 = class232.field3696;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            class83.field1148.method1238(191, -136478397);
            class83.field1148.method1761(var16 | var14 << 15, 4334);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class83.field1148.method1737(-1234590152, var17 << 16 | var15);
        }
        if (class52.field732 > 0) {
            class52.field732--;
        }
        if (class196.field3163 && class52.field732 <= 0) {
            class52.field732 = 20;
            class48.field587++;
            class196.field3163 = false;
            class83.field1148.method1238(240, -136478397);
            class83.field1148.method1769(128, (int) client.field3605);
            class83.field1148.method1769(128, (int) class121.field2039);
        }
        if (class257.field4113 && !class149.field2398) {
            class12.field161++;
            class149.field2398 = true;
            class83.field1148.method1238(160, -136478397);
            class83.field1148.method1757(1, (byte) 111);
        }
        if (!class257.field4113 && class149.field2398) {
            class149.field2398 = false;
            class83.field1148.method1238(160, -136478397);
            class83.field1148.method1757(0, (byte) 121);
            class12.field161++;
        }
        if (!class185.field2968) {
            class262.field4154++;
            class83.field1148.method1238(101, -136478397);
            class83.field1148.method1763(class70.method550((byte) -95), -9697);
            class185.field2968 = true;
        }
        if (class263.field4160) {
            class263.field4160 = false;
        } else {
            class130.field2175 /= 2.0F;
        }
        if (class25.field309) {
            class25.field309 = false;
        } else {
            class120.field2027 /= 2.0F;
        }
        class3.method23((byte) 122);
        if (class21.field249 != 30) {
            return;
        }
        class134.method922(true);
        class170.method1192((byte) 126);
        class179.method1242((byte) -51);
        class189.field3025++;
        if (class189.field3025 > 750) {
            class79.method589(true);
            return;
        }
        class166.method1158(-128);
        class111.method802((byte) 102);
        class279.method1866(-1);
        if (class219.field3506 != null) {
            class277.method1859((byte) -61);
        }
        for (int var18 = class83.method606(true, true); var18 != -1; var18 = class83.method606(false, true)) {
            class233.method1542(var18, (byte) 117);
            class189.field3017[class204.method1369(class217.field3479++, 31)] = var18;
        }
        for (class283 var19 = class245.method1617(18); var19 != null; var19 = class245.method1617(18)) {
            int var20 = var19.method1898(2);
            int var21 = var19.method1897((byte) 35);
            if (var20 == 1) {
                class189.field3028[var21] = var19.field4528;
                class5.field56[class204.method1369(class188.field3012++, 31)] = var21;
            } else if (var20 == 2) {
                class111.field1923[var21] = var19.field4510;
                class275.field4438[class204.method1369(class58.field811++, 31)] = var21;
            } else if (var20 == 3) {
                class103 var22 = class168.method1180(8931, var21);
                if (!var19.field4510.equals(var22.field1585)) {
                    var22.field1585 = var19.field4510;
                    class45.method346((byte) 31, var22);
                }
            } else if (var20 == 4) {
                class103 var23 = class168.method1180(8931, var21);
                int var24 = var19.field4528;
                int var25 = var19.field4523;
                int var26 = var19.field4527;
                if (var23.field1631 != var24 || var23.field1724 != var26 || var23.field1669 != var25) {
                    var23.field1669 = var25;
                    var23.field1724 = var26;
                    var23.field1631 = var24;
                    class45.method346((byte) 81, var23);
                }
            } else if (var20 == 5) {
                class103 var42 = class168.method1180(8931, var21);
                if (var19.field4528 != var42.field1632 || var19.field4528 == -1) {
                    var42.field1594 = 0;
                    var42.field1633 = 0;
                    var42.field1632 = var19.field4528;
                    var42.field1712 = 1;
                    class45.method346((byte) 36, var42);
                }
            } else if (var20 == 6) {
                int var36 = var19.field4528;
                int var37 = (var36 & 0x7D40) >> 10;
                int var38 = (var36 & 0x3E8) >> 5;
                int var39 = var36 & 0x1F;
                int var40 = (var39 << 3) + (var37 << 19) + (var38 << 11);
                class103 var41 = class168.method1180(8931, var21);
                if (var41.field1713 != var40) {
                    var41.field1713 = var40;
                    class45.method346((byte) 38, var41);
                }
            } else if (var20 == 7) {
                class103 var27 = class168.method1180(8931, var21);
                boolean var28 = var19.field4528 == 1;
                if (var27.field1684 != var28) {
                    var27.field1684 = var28;
                    class45.method346((byte) 100, var27);
                }
            } else if (var20 == 8) {
                class103 var35 = class168.method1180(8931, var21);
                if (var19.field4528 != var35.field1683 || var19.field4527 != var35.field1605 || var19.field4523 != var35.field1598) {
                    var35.field1683 = var19.field4528;
                    var35.field1605 = var19.field4527;
                    var35.field1598 = var19.field4523;
                    if (var35.field1576 != -1) {
                        if (var35.field1690 > 0) {
                            var35.field1598 = var35.field1598 * 32 / var35.field1690;
                        } else if (var35.field1597 > 0) {
                            var35.field1598 = var35.field1598 * 32 / var35.field1597;
                        }
                    }
                    class45.method346((byte) 59, var35);
                }
            } else if (var20 == 9) {
                class103 var29 = class168.method1180(8931, var21);
                if (var19.field4528 != var29.field1576 || var19.field4527 != var29.field1657) {
                    var29.field1576 = var19.field4528;
                    var29.field1657 = var19.field4527;
                    class45.method346((byte) 116, var29);
                }
            } else if (var20 == 10) {
                class103 var34 = class168.method1180(8931, var21);
                if (var19.field4528 != var34.field1699 || var19.field4527 != var34.field1563 || var19.field4523 != var34.field1579) {
                    var34.field1563 = var19.field4527;
                    var34.field1699 = var19.field4528;
                    var34.field1579 = var19.field4523;
                    class45.method346((byte) 77, var34);
                }
            } else if (var20 == 11) {
                class103 var33 = class168.method1180(8931, var21);
                var33.field1660 = 0;
                var33.field1720 = 0;
                var33.field1679 = var33.field1640 = var19.field4528;
                var33.field1707 = var33.field1681 = var19.field4527;
                class45.method346((byte) 98, var33);
            } else if (var20 == 12) {
                class103 var30 = class168.method1180(8931, var21);
                int var31 = var19.field4528;
                if (var30 != null && var30.field1655 == 0) {
                    if (var31 > (var30.field1561 - var30.field1693)) {
                        var31 = var30.field1561 - var30.field1693;
                    }
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    if (var30.field1639 != var31) {
                        var30.field1639 = var31;
                        class45.method346((byte) 39, var30);
                    }
                }
            } else if (var20 == 13) {
                class103 var32 = class168.method1180(8931, var21);
                var32.field1549 = var19.field4528;
            }
        }
        class221.field3524++;
        if (class9.field142 != 0) {
            class153.field2480 += 20;
            if (class153.field2480 >= 400) {
                class9.field142 = 0;
            }
        }
        if (class109.field1882 != null) {
            class296.field4681++;
            if (class296.field4681 >= 15) {
                class45.method346((byte) 97, class109.field1882);
                class109.field1882 = null;
            }
        }
        if (class258.field4114 != null) {
            class45.method346((byte) 42, class258.field4114);
            if (class109.field1893 > class92.field1308 + 5 || class109.field1893 < class92.field1308 - 5 || (class160.field2602 + 5) < class250.field4000 || class160.field2602 - 5 > class250.field4000) {
                class251.field4024 = true;
            }
            class147.field2382++;
            if (class205.field3293 == 0) {
                if (class251.field4024 && class147.field2382 >= 5) {
                    if (class258.field4114 == class230.field3654 && class269.field4360 != class205.field3291) {
                        class229.field3639++;
                        byte var43 = 0;
                        class103 var44 = class258.field4114;
                        if (class249.field3992 == 1 && var44.field1716 == 206) {
                            var43 = 1;
                        }
                        if (var44.field1547[class269.field4360] <= 0) {
                            var43 = 0;
                        }
                        if (client.method1511(var44).method200(101)) {
                            int var45 = class205.field3291;
                            int var46 = class269.field4360;
                            var44.field1547[var46] = var44.field1547[var45];
                            var44.field1592[var46] = var44.field1592[var45];
                            var44.field1547[var45] = -1;
                            var44.field1592[var45] = 0;
                        } else if (var43 == 1) {
                            int var47 = class205.field3291;
                            int var48 = class269.field4360;
                            while (var47 != var48) {
                                if (var48 < var47) {
                                    var44.method722(0, var47 - 1, var47);
                                    var47--;
                                } else if (var47 < var48) {
                                    var44.method722(0, var47 + 1, var47);
                                    var47++;
                                }
                            }
                        } else {
                            var44.method722(0, class269.field4360, class205.field3291);
                        }
                        class83.field1148.method1238(47, -136478397);
                        class83.field1148.method1789((byte) -38, class258.field4114.field1659);
                        class83.field1148.method1769(128, class269.field4360);
                        class83.field1148.method1757(var43, (byte) -57);
                        class83.field1148.method1772((byte) -29, class205.field3291);
                    }
                } else if ((class224.field3556 == 1 || class140.method960(class202.field3248 - 1, (byte) -102)) && class202.field3248 > 2) {
                    class26.method183(0);
                } else if (class202.field3248 > 0) {
                    class129.method896(16);
                }
                class296.field4681 = 10;
                class58.field815 = 0;
                class258.field4114 = null;
            }
        }
        class103 var49 = class268.field4348;
        class268.field4348 = null;
        class33.field396 = null;
        int var50 = -44 / ((48 - arg0) / 46);
        class189.field3020 = false;
        class44.field524 = false;
        class295.field4670 = 0;
        class103 var51 = class228.field3634;
        class228.field3634 = null;
        while (class257.method1690(127) && class295.field4670 < 128) {
            class186.field3000[class295.field4670] = class170.field2752;
            class138.field2290[class295.field4670] = class155.field2496;
            class295.field4670++;
        }
        class219.field3506 = null;
        if (class113.field1944 != -1) {
            class112.method807(0, 0, class113.field1944, -93, 0, class97.field1469, 0, class107.field1856);
        }
        class64.field906++;
        while (true) {
            class173 var52;
            class103 var53;
            class103 var54;
            do {
                var52 = (class173) class8.field114.method367(5);
                if (var52 == null) {
                    while (true) {
                        class173 var55;
                        class103 var56;
                        class103 var57;
                        do {
                            var55 = (class173) class127.field2122.method367(5);
                            if (var55 == null) {
                                while (true) {
                                    class173 var58;
                                    class103 var59;
                                    class103 var60;
                                    do {
                                        var58 = (class173) class136.field2259.method367(5);
                                        if (var58 == null) {
                                            if (class219.field3506 == null) {
                                                class244.field3905 = 0;
                                            }
                                            if (class238.field3815 != null) {
                                                class225.method1489((byte) 66);
                                            }
                                            if (class151.field2420 > 0 && class247.field3975[82] && class247.field3975[81] && class203.field3269 != 0) {
                                                int var61 = class28.field336 - class203.field3269;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class217.method1444(104, class197.field3179.field692[0] + class93.field1321, class296.field4685 - -class197.field3179.field610[0], var61);
                                            }
                                            if (class151.field2420 > 0 && class247.field3975[82] && class247.field3975[81]) {
                                                if (class74.field1015 != -1) {
                                                    class217.method1444(45, class93.field1321 + class8.field124, class74.field1015 + class296.field4685, class28.field336);
                                                }
                                                class174.field2808 = 0;
                                                class216.field3467 = 0;
                                            } else if (class216.field3467 == 2) {
                                                if (class74.field1015 != -1) {
                                                    class83.field1148.method1238(206, -136478397);
                                                    class77.field1063++;
                                                    class83.field1148.method1769(128, class221.field3526);
                                                    class83.field1148.method1772((byte) -29, class74.field1015 + class296.field4685);
                                                    class83.field1148.method1761(class93.field1321 + class8.field124, 4334);
                                                    class83.field1148.method1737(-1234590152, class254.field4063);
                                                    class153.field2480 = 0;
                                                    class9.field142 = 1;
                                                    class71.field973 = class266.field4319;
                                                    class8.field125 = class232.field3696;
                                                }
                                                class216.field3467 = 0;
                                            } else if (class174.field2808 == 2) {
                                                if (class74.field1015 != -1) {
                                                    class121.field2041++;
                                                    class83.field1148.method1238(29, -136478397);
                                                    class83.field1148.method1772((byte) -29, class93.field1321 + class8.field124);
                                                    class83.field1148.method1761(class74.field1015 + class296.field4685, 4334);
                                                    class71.field973 = class266.field4319;
                                                    class153.field2480 = 0;
                                                    class8.field125 = class232.field3696;
                                                    class9.field142 = 1;
                                                }
                                                class174.field2808 = 0;
                                            } else if (class74.field1015 != -1 && class216.field3467 == 0 && class174.field2808 == 0) {
                                                class142.method965(5, (class74.field1015 << 1) - (class197.field3179.method385((byte) 76) - 1) >> 1, (class8.field124 << 1) - (class197.field3179.method385((byte) 110) - 1) >> 1, 0);
                                                class9.field142 = 1;
                                                class153.field2480 = 0;
                                                class8.field125 = class232.field3696;
                                                class71.field973 = class266.field4319;
                                            }
                                            class74.field1015 = -1;
                                            class236.method1557(75);
                                            if (class268.field4348 != var49) {
                                                if (var49 != null) {
                                                    class45.method346((byte) 115, var49);
                                                }
                                                if (class268.field4348 != null) {
                                                    class45.method346((byte) 47, class268.field4348);
                                                }
                                            }
                                            if (class228.field3634 != var51 && class260.field4133 == class179.field2898) {
                                                if (var51 != null) {
                                                    class45.method346((byte) 50, var51);
                                                }
                                                if (class228.field3634 != null) {
                                                    class45.method346((byte) 56, class228.field3634);
                                                }
                                            }
                                            if (class228.field3634 == null) {
                                                if (class260.field4133 > 0) {
                                                    class260.field4133--;
                                                }
                                            } else if (class179.field2898 > class260.field4133) {
                                                class260.field4133++;
                                                if (class260.field4133 == class179.field2898) {
                                                    class45.method346((byte) 88, class228.field3634);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class196.field3162[var62]++;
                                            }
                                            int var63 = class262.method1721(21);
                                            int var64 = class112.method808(0);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class128.field2139 = 250;
                                                class21.method144((byte) -112, 14500);
                                                class83.field1148.method1238(120, -136478397);
                                                class38.field464++;
                                            }
                                            if (class82.field1146 != null && class82.field1146.field2271 == 1) {
                                                if (class82.field1146.field2266 != null) {
                                                    class263.method1726(class133.field2206, class70.field966, -17137);
                                                }
                                                class70.field966 = false;
                                                class133.field2206 = null;
                                                class82.field1146 = null;
                                            }
                                            class149.field2397++;
                                            class148.field2391++;
                                            class256.field4095++;
                                            if (class256.field4095 > 500) {
                                                class256.field4095 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x4) == 4) {
                                                    class115.field1979 += class97.field1468;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class232.field3694 += class148.field2390;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class3.field43 += class271.field4373;
                                                }
                                            }
                                            if (class232.field3694 < -55) {
                                                class148.field2390 = 2;
                                            }
                                            if (class3.field43 < -50) {
                                                class271.field4373 = 2;
                                            }
                                            if (class148.field2391 > 500) {
                                                class148.field2391 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class77.field1050 += class225.field3561;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class93.field1330 += class49.field675;
                                                }
                                            }
                                            if (class115.field1979 < -40) {
                                                class97.field1468 = 1;
                                            }
                                            if (class77.field1050 < -20) {
                                                class225.field3561 = 1;
                                            }
                                            if (class115.field1979 > 40) {
                                                class97.field1468 = -1;
                                            }
                                            if (class232.field3694 > 55) {
                                                class148.field2390 = -2;
                                            }
                                            if (class93.field1330 < -60) {
                                                class49.field675 = 2;
                                            }
                                            if (class93.field1330 > 60) {
                                                class49.field675 = -2;
                                            }
                                            if (class77.field1050 > 10) {
                                                class225.field3561 = -1;
                                            }
                                            if (class3.field43 > 50) {
                                                class271.field4373 = -2;
                                            }
                                            if (class149.field2397 > 50) {
                                                class83.field1148.method1238(84, -136478397);
                                                class42.field500++;
                                            }
                                            if (class88.field1213) {
                                                class149.method1012(8);
                                                class88.field1213 = false;
                                            }
                                            try {
                                                if (class149.field2395 != null && class83.field1148.field4195 > 0) {
                                                    class149.field2395.method1272(class83.field1148.field4195, 0, class83.field1148.field4198, -76);
                                                    class83.field1148.field4195 = 0;
                                                    class149.field2397 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var67) {
                                                class79.method589(true);
                                                return;
                                            }
                                        }
                                        var59 = var58.field2796;
                                        if (var59.field1680 < 0) {
                                            break;
                                        }
                                        var60 = class168.method1180(8931, var59.field1602);
                                    } while (var60 == null || var60.field1624 == null || var59.field1680 >= var60.field1624.length || var60.field1624[var59.field1680] != var59);
                                    class223.method1480(8170, var58);
                                }
                            }
                            var56 = var55.field2796;
                            if (var56.field1680 < 0) {
                                break;
                            }
                            var57 = class168.method1180(8931, var56.field1602);
                        } while (var57 == null || var57.field1624 == null || var57.field1624.length <= var56.field1680 || var57.field1624[var56.field1680] != var56);
                        class223.method1480(8170, var55);
                    }
                }
                var53 = var52.field2796;
                if (var53.field1680 < 0) {
                    break;
                }
                var54 = class168.method1180(8931, var53.field1602);
            } while (var54 == null || var54.field1624 == null || var53.field1680 >= var54.field1624.length || var54.field1624[var53.field1680] != var53);
            class223.method1480(8170, var52);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    protected class152() {
    }
}
