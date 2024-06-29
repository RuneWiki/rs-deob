import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public abstract class class249 {

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field3862 = 0;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3866 = "wave:";

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lpj;")
    public static class284 field3864 = new class284();

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Z")
    public static boolean field3869 = true;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Lhl;")
    public static class139 field3868 = new class139(64);

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "C")
    public static char field3867;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field3858;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[I")
    public int[] field3861;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public abstract void method694(int arg0, byte arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lr;IB)V")
    public static final void method1701(class43 arg0, int arg1, byte arg2) {
        field3859++;
        Object[] var3 = arg0.field767;
        int var4 = (Integer) var3[0];
        class147 var5 = class96.method723((byte) -42, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        class177.field2593 = 0;
        int var8 = -1;
        int[] var9 = var5.field2139;
        byte var10 = -1;
        if (arg2 != -59) {
            return;
        }
        int[] var11 = var5.field2134;
        try {
            class135.field1980 = new String[var5.field2135];
            int var12 = 0;
            class250.field3877 = new int[var5.field2137];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field757;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field762;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field750 == null ? -1 : arg0.field750.field4683;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field765;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field750 == null ? -1 : arg0.field750.field4528;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field756 == null ? -1 : arg0.field756.field4683;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field756 == null ? -1 : arg0.field756.field4528;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field759;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field752;
                    }
                    class250.field3877[var12++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg0.field766;
                    }
                    class135.field1980[var13++] = var16;
                }
            }
            int var17 = 0;
            label4023: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var517 = var9[var8];
                int var10001;
                if (var517 < 100) {
                    if (var517 == 0) {
                        class185.field2698[var6++] = var11[var8];
                        continue;
                    }
                    if (var517 == 1) {
                        int var18 = var11[var8];
                        class185.field2698[var6++] = class166.field2447[var18];
                        continue;
                    }
                    if (var517 == 2) {
                        int var19 = var11[var8];
                        var6--;
                        class295.method1943(class185.field2698[var6], var19, (byte) 103);
                        continue;
                    }
                    if (var517 == 3) {
                        class169.field2489[var7++] = var5.field2127[var8];
                        continue;
                    }
                    if (var517 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var517 == 7) {
                        var6 -= 2;
                        if (class185.field2698[var6 + 1] != class185.field2698[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 8) {
                        var6 -= 2;
                        if (class185.field2698[var6 + 1] == class185.field2698[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 9) {
                        var6 -= 2;
                        if (class185.field2698[var6] < class185.field2698[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 10) {
                        var6 -= 2;
                        if (class185.field2698[var6 + 1] < class185.field2698[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 21) {
                        if (class177.field2593 == 0) {
                            return;
                        }
                        class125 var20 = class194.field2930[--class177.field2593];
                        var5 = var20.field1852;
                        var9 = var5.field2139;
                        class250.field3877 = var20.field1843;
                        class135.field1980 = var20.field1849;
                        var8 = var20.field1851;
                        var11 = var5.field2134;
                        continue;
                    }
                    if (var517 == 25) {
                        int var21 = var11[var8];
                        class185.field2698[var6++] = class121.method856(16853, var21);
                        continue;
                    }
                    if (var517 == 27) {
                        int var22 = var11[var8];
                        var6--;
                        class37.method292(class185.field2698[var6], (byte) 73, var22);
                        continue;
                    }
                    if (var517 == 31) {
                        var6 -= 2;
                        if (class185.field2698[var6 + 1] >= class185.field2698[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 32) {
                        var6 -= 2;
                        if (class185.field2698[var6] >= class185.field2698[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 33) {
                        class185.field2698[var6++] = class250.field3877[var11[var8]];
                        continue;
                    }
                    if (var517 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class250.field3877[var10001] = class185.field2698[var6];
                        continue;
                    }
                    if (var517 == 35) {
                        class169.field2489[var7++] = class135.field1980[var11[var8]];
                        continue;
                    }
                    if (var517 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class135.field1980[var10001] = class169.field2489[var7];
                        continue;
                    }
                    if (var517 == 37) {
                        int var23 = var11[var8];
                        var7 -= var23;
                        String var24 = class216.method1454(class169.field2489, (byte) 55, var7, var23);
                        class169.field2489[var7++] = var24;
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
                        int var25 = var11[var8];
                        class147 var26 = class96.method723((byte) -42, var25);
                        int[] var27 = new int[var26.field2137];
                        String[] var28 = new String[var26.field2135];
                        for (int var29 = 0; var29 < var26.field2129; var29++) {
                            var27[var29] = class185.field2698[var6 + var29 - var26.field2129];
                        }
                        for (int var30 = 0; var30 < var26.field2131; var30++) {
                            var28[var30] = class169.field2489[var7 + var30 - var26.field2131];
                        }
                        var7 -= var26.field2131;
                        var6 -= var26.field2129;
                        class125 var31 = new class125();
                        var31.field1843 = class250.field3877;
                        var31.field1849 = class135.field1980;
                        var31.field1851 = var8;
                        var31.field1852 = var5;
                        if (class177.field2593 >= class194.field2930.length) {
                            throw new RuntimeException();
                        }
                        class194.field2930[class177.field2593++] = var31;
                        class135.field1980 = var28;
                        var8 = -1;
                        class250.field3877 = var27;
                        var5 = var26;
                        var11 = var26.field2134;
                        var9 = var26.field2139;
                        continue;
                    }
                    if (var517 == 42) {
                        class185.field2698[var6++] = class117.field1759[var11[var8]];
                        continue;
                    }
                    if (var517 == 43) {
                        int var32 = var11[var8];
                        var6--;
                        class117.field1759[var32] = class185.field2698[var6];
                        class64.method522(var32, -25131);
                        continue;
                    }
                    if (var517 == 44) {
                        int var33 = var11[var8] >> 16;
                        int var34 = var11[var8] & 0xFFFF;
                        var6--;
                        int var35 = class185.field2698[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class195.field2940[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label4023;
                                }
                                class111.field1682[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 45) {
                        int var38 = var11[var8];
                        var6--;
                        int var39 = class185.field2698[var6];
                        if (var39 >= 0 && class195.field2940[var38] > var39) {
                            class185.field2698[var6++] = class111.field1682[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 46) {
                        int var40 = var11[var8];
                        var6 -= 2;
                        int var41 = class185.field2698[var6];
                        if (var41 >= 0 && var41 < class195.field2940[var40]) {
                            class111.field1682[var40][var41] = class185.field2698[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 47) {
                        String var42 = class130.field1922[var11[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class169.field2489[var7++] = var42;
                        continue;
                    }
                    if (var517 == 48) {
                        int var43 = var11[var8];
                        var7--;
                        class130.field1922[var43] = class169.field2489[var7];
                        class138.method937(var43, (byte) -24);
                        continue;
                    }
                    if (var517 == 51) {
                        class39 var44 = var5.field2125[var11[var8]];
                        var6--;
                        class135 var45 = (class135) var44.method306((long) class185.field2698[var6], arg2 ^ 0xFFFFC09D);
                        if (var45 != null) {
                            var8 += var45.field1975;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var517 < 300) {
                    if (var517 == 100) {
                        var6 -= 3;
                        int var47 = class185.field2698[var6];
                        int var48 = class185.field2698[var6 + 1];
                        int var49 = class185.field2698[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class297 var50 = class151.method1023(-30464, var47);
                        if (var50.field4646 == null) {
                            var50.field4646 = new class297[var49 + 1];
                        }
                        if (var50.field4646.length <= var49) {
                            class297[] var51 = new class297[var49 + 1];
                            for (int var52 = 0; var52 < var50.field4646.length; var52++) {
                                var51[var52] = var50.field4646[var52];
                            }
                            var50.field4646 = var51;
                        }
                        if (var49 > 0 && var50.field4646[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class297 var53 = new class297();
                        var53.field4542 = var53.field4683 = var50.field4683;
                        var53.field4528 = var49;
                        var53.field4647 = true;
                        var53.field4553 = var48;
                        var50.field4646[var49] = var53;
                        if (var46) {
                            class87.field1324 = var53;
                        } else {
                            class248.field3854 = var53;
                        }
                        class297.method1979((byte) -74, var50);
                        continue;
                    }
                    if (var517 == 101) {
                        class297 var54 = var46 ? class87.field1324 : class248.field3854;
                        if (var54.field4528 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class297 var55 = class151.method1023(arg2 ^ 0x76C5, var54.field4683);
                        var55.field4646[var54.field4528] = null;
                        class297.method1979((byte) -97, var55);
                        continue;
                    }
                    if (var517 == 102) {
                        var6--;
                        class297 var56 = class151.method1023(-30464, class185.field2698[var6]);
                        var56.field4646 = null;
                        class297.method1979((byte) -76, var56);
                        continue;
                    }
                    if (var517 == 200) {
                        var6 -= 2;
                        int var57 = class185.field2698[var6 + 1];
                        int var58 = class185.field2698[var6];
                        class297 var59 = class237.method1617(var57, (byte) 63, var58);
                        if (var59 != null && var57 != -1) {
                            class185.field2698[var6++] = 1;
                            if (var46) {
                                class87.field1324 = var59;
                            } else {
                                class248.field3854 = var59;
                            }
                            continue;
                        }
                        class185.field2698[var6++] = 0;
                        continue;
                    }
                    if (var517 == 201) {
                        var6--;
                        int var60 = class185.field2698[var6];
                        class297 var61 = class151.method1023(-30464, var60);
                        if (var61 == null) {
                            class185.field2698[var6++] = 0;
                        } else {
                            class185.field2698[var6++] = 1;
                            if (var46) {
                                class87.field1324 = var61;
                            } else {
                                class248.field3854 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var517 < 500) {
                    if (var517 == 403) {
                        var6 -= 2;
                        int var62 = class185.field2698[var6 + 1];
                        int var63 = class185.field2698[var6];
                        for (int var64 = 0; var64 < class265.field4140.length; var64++) {
                            if (class265.field4140[var64] == var63) {
                                class185.field2687.field3487.method1768((byte) -106, var64, var62);
                                continue label4023;
                            }
                        }
                        int var65 = 0;
                        while (true) {
                            if (var65 >= client.field720.length) {
                                continue label4023;
                            }
                            if (client.field720[var65] == var63) {
                                class185.field2687.field3487.method1768((byte) -128, var65, var62);
                                continue label4023;
                            }
                            var65++;
                        }
                    }
                    if (var517 == 404) {
                        var6 -= 2;
                        int var66 = class185.field2698[var6];
                        int var67 = class185.field2698[var6 + 1];
                        class185.field2687.field3487.method1764(var66, var67, -14);
                        continue;
                    }
                    if (var517 == 410) {
                        var6--;
                        boolean var68 = class185.field2698[var6] != 0;
                        class185.field2687.field3487.method1767(var68, (byte) -70);
                        continue;
                    }
                } else if (!(var517 < 1000 || var517 >= 1100) || !(var517 < 2000 || var517 >= 2100)) {
                    class297 var506;
                    if (var517 < 2000) {
                        var506 = var46 ? class87.field1324 : class248.field3854;
                    } else {
                        var6--;
                        var506 = class151.method1023(-30464, class185.field2698[var6]);
                        var517 -= 1000;
                    }
                    if (var517 == 1000) {
                        var6 -= 4;
                        var506.field4551 = class185.field2698[var6];
                        var506.field4564 = class185.field2698[var6 + 1];
                        int var507 = class185.field2698[var6 + 2];
                        if (var507 < 0) {
                            var507 = 0;
                        } else if (var507 > 5) {
                            var507 = 5;
                        }
                        int var508 = class185.field2698[var6 + 3];
                        if (var508 < 0) {
                            var508 = 0;
                        } else if (var508 > 5) {
                            var508 = 5;
                        }
                        var506.field4606 = (byte) var507;
                        var506.field4579 = (byte) var508;
                        class297.method1979((byte) -127, var506);
                        class218.method1464(arg2 + 58, var506);
                        if (var506.field4528 == -1) {
                            class103.method750(true, var506.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1001) {
                        var6 -= 4;
                        var506.field4686 = class185.field2698[var6];
                        var506.field4530 = class185.field2698[var6 + 1];
                        var506.field4536 = 0;
                        var506.field4560 = 0;
                        int var509 = class185.field2698[var6 + 2];
                        int var510 = class185.field2698[var6 + 3];
                        if (var510 < 0) {
                            var510 = 0;
                        } else if (var510 > 4) {
                            var510 = 4;
                        }
                        if (var509 < 0) {
                            var509 = 0;
                        } else if (var509 > 4) {
                            var509 = 4;
                        }
                        var506.field4540 = (byte) var509;
                        var506.field4650 = (byte) var510;
                        class297.method1979((byte) -96, var506);
                        class218.method1464(-1, var506);
                        if (var506.field4553 == 0) {
                            class128.method886(78, var506, false);
                        }
                        continue;
                    }
                    if (var517 == 1003) {
                        var6--;
                        boolean var511 = class185.field2698[var6] == 1;
                        if (var511 != var506.field4662) {
                            var506.field4662 = var511;
                            class297.method1979((byte) -50, var506);
                        }
                        if (var506.field4528 == -1) {
                            class131.method897(var506.field4683, -98);
                        }
                        continue;
                    }
                    if (var517 == 1004) {
                        var6 -= 2;
                        var506.field4599 = class185.field2698[var6];
                        var506.field4619 = class185.field2698[var6 + 1];
                        class297.method1979((byte) -115, var506);
                        class218.method1464(-1, var506);
                        if (var506.field4553 == 0) {
                            class128.method886(78, var506, false);
                        }
                        continue;
                    }
                    if (var517 == 1005) {
                        var6--;
                        var506.field4538 = class185.field2698[var6] == 1;
                        continue;
                    }
                } else if (var517 >= 1100 && var517 < 1200 || var517 >= 2100 && var517 < 2200) {
                    class297 var69;
                    if (var517 < 2000) {
                        var69 = var46 ? class87.field1324 : class248.field3854;
                    } else {
                        var6--;
                        var69 = class151.method1023(-30464, class185.field2698[var6]);
                        var517 -= 1000;
                    }
                    if (var517 == 1100) {
                        var6 -= 2;
                        var69.field4656 = class185.field2698[var6];
                        if ((var69.field4555 - var69.field4627) < var69.field4656) {
                            var69.field4656 = var69.field4555 - var69.field4627;
                        }
                        if (var69.field4656 < 0) {
                            var69.field4656 = 0;
                        }
                        var69.field4594 = class185.field2698[var6 + 1];
                        if (var69.field4675 - var69.field4531 < var69.field4594) {
                            var69.field4594 = var69.field4675 - var69.field4531;
                        }
                        if (var69.field4594 < 0) {
                            var69.field4594 = 0;
                        }
                        class297.method1979((byte) -103, var69);
                        if (var69.field4528 == -1) {
                            class44.method354(103, var69.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1101) {
                        var6--;
                        var69.field4522 = class185.field2698[var6];
                        class297.method1979((byte) -58, var69);
                        if (var69.field4528 == -1) {
                            class216.method1456(var69.field4683, (byte) 117);
                        }
                        continue;
                    }
                    if (var517 == 1102) {
                        var6--;
                        var69.field4574 = class185.field2698[var6] == 1;
                        class297.method1979((byte) -51, var69);
                        continue;
                    }
                    if (var517 == 1103) {
                        var6--;
                        var69.field4537 = class185.field2698[var6];
                        class297.method1979((byte) -121, var69);
                        continue;
                    }
                    if (var517 == 1104) {
                        var6--;
                        var69.field4524 = class185.field2698[var6];
                        class297.method1979((byte) -79, var69);
                        continue;
                    }
                    if (var517 == 1105) {
                        var6--;
                        var69.field4658 = class185.field2698[var6];
                        class297.method1979((byte) -115, var69);
                        continue;
                    }
                    if (var517 == 1106) {
                        var6--;
                        var69.field4699 = class185.field2698[var6];
                        class297.method1979((byte) -126, var69);
                        continue;
                    }
                    if (var517 == 1107) {
                        var6--;
                        var69.field4697 = class185.field2698[var6] == 1;
                        class297.method1979((byte) -54, var69);
                        continue;
                    }
                    if (var517 == 1108) {
                        var69.field4584 = 1;
                        var6--;
                        var69.field4604 = class185.field2698[var6];
                        class297.method1979((byte) -81, var69);
                        if (var69.field4528 == -1) {
                            class19.method134((byte) 120, var69.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1109) {
                        var6 -= 6;
                        var69.field4601 = class185.field2698[var6];
                        var69.field4668 = class185.field2698[var6 + 1];
                        var69.field4622 = class185.field2698[var6 + 2];
                        var69.field4691 = class185.field2698[var6 + 3];
                        var69.field4597 = class185.field2698[var6 + 4];
                        var69.field4624 = class185.field2698[var6 + 5];
                        class297.method1979((byte) -97, var69);
                        if (var69.field4528 == -1) {
                            class87.method663(15, var69.field4683);
                            class130.method894(arg2 ^ 0xFFFFFFCF, var69.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1110) {
                        var6--;
                        int var70 = class185.field2698[var6];
                        if (var69.field4613 != var70) {
                            var69.field4527 = 1;
                            var69.field4546 = 0;
                            var69.field4613 = var70;
                            var69.field4701 = 0;
                            class297.method1979((byte) -113, var69);
                        }
                        if (var69.field4528 == -1) {
                            class246.method1683(5, var69.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1111) {
                        var6--;
                        var69.field4618 = class185.field2698[var6] == 1;
                        class297.method1979((byte) -84, var69);
                        continue;
                    }
                    if (var517 == 1112) {
                        var7--;
                        String var71 = class169.field2489[var7];
                        if (!var71.equals(var69.field4581)) {
                            var69.field4581 = var71;
                            class297.method1979((byte) -57, var69);
                        }
                        if (var69.field4528 == -1) {
                            class212.method1402(var69.field4683, (byte) -124);
                        }
                        continue;
                    }
                    if (var517 == 1113) {
                        var6--;
                        var69.field4632 = class185.field2698[var6];
                        class297.method1979((byte) -89, var69);
                        continue;
                    }
                    if (var517 == 1114) {
                        var6 -= 3;
                        var69.field4677 = class185.field2698[var6];
                        var69.field4612 = class185.field2698[var6 + 1];
                        var69.field4577 = class185.field2698[var6 + 2];
                        class297.method1979((byte) -124, var69);
                        continue;
                    }
                    if (var517 == 1115) {
                        var6--;
                        var69.field4644 = class185.field2698[var6] == 1;
                        class297.method1979((byte) -71, var69);
                        continue;
                    }
                    if (var517 == 1116) {
                        var6--;
                        var69.field4615 = class185.field2698[var6];
                        class297.method1979((byte) -100, var69);
                        continue;
                    }
                    if (var517 == 1117) {
                        var6--;
                        var69.field4593 = class185.field2698[var6];
                        class297.method1979((byte) -123, var69);
                        continue;
                    }
                    if (var517 == 1118) {
                        var6--;
                        var69.field4563 = class185.field2698[var6] == 1;
                        class297.method1979((byte) -63, var69);
                        continue;
                    }
                    if (var517 == 1119) {
                        var6--;
                        var69.field4532 = class185.field2698[var6] == 1;
                        class297.method1979((byte) -90, var69);
                        continue;
                    }
                    if (var517 == 1120) {
                        var6 -= 2;
                        var69.field4555 = class185.field2698[var6];
                        var69.field4675 = class185.field2698[var6 + 1];
                        class297.method1979((byte) -106, var69);
                        if (var69.field4553 == 0) {
                            class128.method886(95, var69, false);
                        }
                        continue;
                    }
                    if (var517 == 1121) {
                        class297.method1979((byte) -85, var69);
                        var6 -= 2;
                        continue;
                    }
                    if (var517 == 1122) {
                        var6--;
                        var69.field4687 = class185.field2698[var6] == 1;
                        class297.method1979((byte) -105, var69);
                        continue;
                    }
                    if (var517 == 1123) {
                        var6--;
                        var69.field4624 = class185.field2698[var6];
                        class297.method1979((byte) -85, var69);
                        if (var69.field4528 == -1) {
                            class87.method663(15, var69.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1124) {
                        var6--;
                        int var72 = class185.field2698[var6];
                        var69.field4670 = var72 == 1;
                        class297.method1979((byte) -85, var69);
                        continue;
                    }
                } else if (var517 >= 1200 && var517 < 1300 || var517 >= 2200 && var517 < 2300) {
                    class297 var502;
                    if (var517 < 2000) {
                        var502 = var46 ? class87.field1324 : class248.field3854;
                    } else {
                        var517 -= 1000;
                        var6--;
                        var502 = class151.method1023(-30464, class185.field2698[var6]);
                    }
                    class297.method1979((byte) -120, var502);
                    if (var517 == 1200 || var517 == 1205 || var517 == 1208 || var517 == 1209) {
                        var6 -= 2;
                        int var503 = class185.field2698[var6];
                        int var504 = class185.field2698[var6 + 1];
                        if (var502.field4528 == -1) {
                            class121.method857(false, var502.field4683);
                            class87.method663(15, var502.field4683);
                            class130.method894(10, var502.field4683);
                        }
                        if (var503 == -1) {
                            var502.field4608 = -1;
                            var502.field4584 = 1;
                            var502.field4604 = -1;
                            continue;
                        }
                        var502.field4614 = var504;
                        var502.field4608 = var503;
                        if (var517 == 1208 || var517 == 1209) {
                            var502.field4625 = true;
                        } else {
                            var502.field4625 = false;
                        }
                        class15 var505 = class140.method951((byte) -94, var503);
                        var502.field4624 = var505.field217;
                        var502.field4601 = var505.field275;
                        var502.field4668 = var505.field240;
                        var502.field4622 = var505.field218;
                        var502.field4597 = var505.field225;
                        if (var502.field4560 > 0) {
                            var502.field4624 = var502.field4624 * 32 / var502.field4560;
                        } else if (var502.field4686 > 0) {
                            var502.field4624 = var502.field4624 * 32 / var502.field4686;
                        }
                        if (var517 == 1205) {
                            var502.field4586 = false;
                        } else {
                            var502.field4586 = true;
                        }
                        var502.field4691 = var505.field256;
                        continue;
                    }
                    if (var517 == 1201) {
                        var502.field4584 = 2;
                        var6--;
                        var502.field4604 = class185.field2698[var6];
                        if (var502.field4528 == -1) {
                            class19.method134((byte) 82, var502.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1202) {
                        var502.field4584 = 3;
                        var502.field4604 = class185.field2687.field3487.method1765(28);
                        if (var502.field4528 == -1) {
                            class19.method134((byte) 113, var502.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1203) {
                        var502.field4584 = 6;
                        var6--;
                        var502.field4604 = class185.field2698[var6];
                        if (var502.field4528 == -1) {
                            class19.method134((byte) 86, var502.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1204) {
                        var502.field4584 = 5;
                        var6--;
                        var502.field4604 = class185.field2698[var6];
                        if (var502.field4528 == -1) {
                            class19.method134((byte) 99, var502.field4683);
                        }
                        continue;
                    }
                    if (var517 == 1206) {
                        var6 -= 4;
                        var502.field4547 = class185.field2698[var6];
                        var502.field4641 = class185.field2698[var6 + 1];
                        var502.field4631 = class185.field2698[var6 + 2];
                        var502.field4598 = class185.field2698[var6 + 3];
                        class297.method1979((byte) -118, var502);
                        continue;
                    }
                    if (var517 == 1207) {
                        var6 -= 2;
                        var502.field4592 = class185.field2698[var6];
                        var502.field4570 = class185.field2698[var6 + 1];
                        class297.method1979((byte) -107, var502);
                        continue;
                    }
                } else if ((var517 < 1300 || var517 >= 1400) && (var517 < 2300 || var517 >= 2400)) {
                    if (var517 >= 1400 && var517 < 1500 || var517 >= 2400 && var517 < 2500) {
                        class297 var489;
                        if (var517 < 2000) {
                            var489 = var46 ? class87.field1324 : class248.field3854;
                        } else {
                            var517 -= 1000;
                            var6--;
                            var489 = class151.method1023(-30464, class185.field2698[var6]);
                        }
                        var7--;
                        String var490 = class169.field2489[var7];
                        int[] var491 = null;
                        if (var490.length() > 0 && var490.charAt(var490.length() - 1) == 'Y') {
                            var6--;
                            int var492 = class185.field2698[var6];
                            if (var492 > 0) {
                                var491 = new int[var492];
                                while (var492-- > 0) {
                                    var6--;
                                    var491[var492] = class185.field2698[var6];
                                }
                            }
                            var490 = var490.substring(0, var490.length() - 1);
                        }
                        Object[] var493 = new Object[var490.length() + 1];
                        for (int var494 = var493.length - 1; var494 >= 1; var494--) {
                            if (var490.charAt(var494 - 1) == 's') {
                                var7--;
                                var493[var494] = class169.field2489[var7];
                            } else {
                                var6--;
                                var493[var494] = Integer.valueOf(class185.field2698[var6]);
                            }
                        }
                        var6--;
                        int var495 = class185.field2698[var6];
                        if (var495 == -1) {
                            var493 = null;
                        } else {
                            var493[0] = Integer.valueOf(var495);
                        }
                        if (var517 == 1400) {
                            var489.field4649 = var493;
                        } else if (var517 == 1401) {
                            var489.field4535 = var493;
                        } else if (var517 == 1402) {
                            var489.field4558 = var493;
                        } else if (var517 == 1403) {
                            var489.field4693 = var493;
                        } else if (var517 == 1404) {
                            var489.field4607 = var493;
                        } else if (var517 == 1405) {
                            var489.field4667 = var493;
                        } else if (var517 == 1406) {
                            var489.field4673 = var493;
                        } else if (var517 == 1407) {
                            var489.field4603 = var491;
                            var489.field4655 = var493;
                        } else if (var517 == 1408) {
                            var489.field4566 = var493;
                        } else if (var517 == 1409) {
                            var489.field4685 = var493;
                        } else if (var517 == 1410) {
                            var489.field4690 = var493;
                        } else if (var517 == 1411) {
                            var489.field4698 = var493;
                        } else if (var517 == 1412) {
                            var489.field4559 = var493;
                        } else if (var517 == 1414) {
                            var489.field4692 = var491;
                            var489.field4678 = var493;
                        } else if (var517 == 1415) {
                            var489.field4610 = var493;
                            var489.field4543 = var491;
                        } else if (var517 == 1416) {
                            var489.field4672 = var493;
                        } else if (var517 == 1417) {
                            var489.field4589 = var493;
                        } else if (var517 == 1418) {
                            var489.field4582 = var493;
                        } else if (var517 == 1419) {
                            var489.field4533 = var493;
                        } else if (var517 == 1420) {
                            var489.field4635 = var493;
                        } else if (var517 == 1421) {
                            var489.field4634 = var493;
                        } else if (var517 == 1422) {
                            var489.field4684 = var493;
                        } else if (var517 == 1423) {
                            var489.field4674 = var493;
                        } else if (var517 == 1424) {
                            var489.field4648 = var493;
                        } else if (var517 == 1425) {
                            var489.field4545 = var493;
                        } else if (var517 == 1426) {
                            var489.field4585 = var493;
                        } else if (var517 == 1427) {
                            var489.field4679 = var493;
                        } else if (var517 == 1428) {
                            var489.field4643 = var493;
                            var489.field4552 = var491;
                        } else if (var517 == 1429) {
                            var489.field4568 = var493;
                            var489.field4549 = var491;
                        }
                        var489.field4694 = true;
                        continue;
                    }
                    if (var517 < 1600) {
                        class297 var488 = var46 ? class87.field1324 : class248.field3854;
                        if (var517 == 1500) {
                            class185.field2698[var6++] = var488.field4700;
                            continue;
                        }
                        if (var517 == 1501) {
                            class185.field2698[var6++] = var488.field4578;
                            continue;
                        }
                        if (var517 == 1502) {
                            class185.field2698[var6++] = var488.field4627;
                            continue;
                        }
                        if (var517 == 1503) {
                            class185.field2698[var6++] = var488.field4531;
                            continue;
                        }
                        if (var517 == 1504) {
                            class185.field2698[var6++] = var488.field4662 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 1505) {
                            class185.field2698[var6++] = var488.field4542;
                            continue;
                        }
                    } else if (var517 < 1700) {
                        class297 var73 = var46 ? class87.field1324 : class248.field3854;
                        if (var517 == 1600) {
                            class185.field2698[var6++] = var73.field4656;
                            continue;
                        }
                        if (var517 == 1601) {
                            class185.field2698[var6++] = var73.field4594;
                            continue;
                        }
                        if (var517 == 1602) {
                            class169.field2489[var7++] = var73.field4581;
                            continue;
                        }
                        if (var517 == 1603) {
                            class185.field2698[var6++] = var73.field4555;
                            continue;
                        }
                        if (var517 == 1604) {
                            class185.field2698[var6++] = var73.field4675;
                            continue;
                        }
                        if (var517 == 1605) {
                            class185.field2698[var6++] = var73.field4624;
                            continue;
                        }
                        if (var517 == 1606) {
                            class185.field2698[var6++] = var73.field4622;
                            continue;
                        }
                        if (var517 == 1607) {
                            class185.field2698[var6++] = var73.field4597;
                            continue;
                        }
                        if (var517 == 1608) {
                            class185.field2698[var6++] = var73.field4691;
                            continue;
                        }
                        if (var517 == 1609) {
                            class185.field2698[var6++] = var73.field4537;
                            continue;
                        }
                        if (var517 == 1610) {
                            class185.field2698[var6++] = var73.field4601;
                            continue;
                        }
                        if (var517 == 1611) {
                            class185.field2698[var6++] = var73.field4668;
                            continue;
                        }
                        if (var517 == 1612) {
                            class185.field2698[var6++] = var73.field4658;
                            continue;
                        }
                    } else if (var517 < 1800) {
                        class297 var487 = var46 ? class87.field1324 : class248.field3854;
                        if (var517 == 1700) {
                            class185.field2698[var6++] = var487.field4608;
                            continue;
                        }
                        if (var517 == 1701) {
                            if (var487.field4608 == -1) {
                                class185.field2698[var6++] = 0;
                            } else {
                                class185.field2698[var6++] = var487.field4614;
                            }
                            continue;
                        }
                        if (var517 == 1702) {
                            class185.field2698[var6++] = var487.field4528;
                            continue;
                        }
                    } else if (var517 < 1900) {
                        class297 var485 = var46 ? class87.field1324 : class248.field3854;
                        if (var517 == 1800) {
                            class185.field2698[var6++] = client.method333(var485).method1961(class226.method1551(arg2, -58));
                            continue;
                        }
                        if (var517 == 1801) {
                            var6--;
                            int var486 = class185.field2698[var6];
                            int var519 = var486 - 1;
                            if (var485.field4609 != null && var519 < var485.field4609.length && var485.field4609[var519] != null) {
                                class169.field2489[var7++] = var485.field4609[var519];
                                continue;
                            }
                            class169.field2489[var7++] = "";
                            continue;
                        }
                        if (var517 == 1802) {
                            if (var485.field4628 == null) {
                                class169.field2489[var7++] = "";
                            } else {
                                class169.field2489[var7++] = var485.field4628;
                            }
                            continue;
                        }
                    } else if (var517 < 2600) {
                        var6--;
                        class297 var74 = class151.method1023(-30464, class185.field2698[var6]);
                        if (var517 == 2500) {
                            class185.field2698[var6++] = var74.field4700;
                            continue;
                        }
                        if (var517 == 2501) {
                            class185.field2698[var6++] = var74.field4578;
                            continue;
                        }
                        if (var517 == 2502) {
                            class185.field2698[var6++] = var74.field4627;
                            continue;
                        }
                        if (var517 == 2503) {
                            class185.field2698[var6++] = var74.field4531;
                            continue;
                        }
                        if (var517 == 2504) {
                            class185.field2698[var6++] = var74.field4662 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 2505) {
                            class185.field2698[var6++] = var74.field4542;
                            continue;
                        }
                    } else {
                        int var10000;
                        if (var517 < 2700) {
                            var10000 = arg2 - 30405;
                            var6--;
                            class297 var75 = class151.method1023(var10000, class185.field2698[var6]);
                            if (var517 == 2600) {
                                class185.field2698[var6++] = var75.field4656;
                                continue;
                            }
                            if (var517 == 2601) {
                                class185.field2698[var6++] = var75.field4594;
                                continue;
                            }
                            if (var517 == 2602) {
                                class169.field2489[var7++] = var75.field4581;
                                continue;
                            }
                            if (var517 == 2603) {
                                class185.field2698[var6++] = var75.field4555;
                                continue;
                            }
                            if (var517 == 2604) {
                                class185.field2698[var6++] = var75.field4675;
                                continue;
                            }
                            if (var517 == 2605) {
                                class185.field2698[var6++] = var75.field4624;
                                continue;
                            }
                            if (var517 == 2606) {
                                class185.field2698[var6++] = var75.field4622;
                                continue;
                            }
                            if (var517 == 2607) {
                                class185.field2698[var6++] = var75.field4597;
                                continue;
                            }
                            if (var517 == 2608) {
                                class185.field2698[var6++] = var75.field4691;
                                continue;
                            }
                            if (var517 == 2609) {
                                class185.field2698[var6++] = var75.field4537;
                                continue;
                            }
                            if (var517 == 2610) {
                                class185.field2698[var6++] = var75.field4601;
                                continue;
                            }
                            if (var517 == 2611) {
                                class185.field2698[var6++] = var75.field4668;
                                continue;
                            }
                            if (var517 == 2612) {
                                class185.field2698[var6++] = var75.field4658;
                                continue;
                            }
                        } else if (var517 < 2800) {
                            if (var517 == 2700) {
                                var10000 = arg2 ^ 0x76C5;
                                var6--;
                                class297 var475 = class151.method1023(var10000, class185.field2698[var6]);
                                class185.field2698[var6++] = var475.field4608;
                                continue;
                            }
                            if (var517 == 2701) {
                                var6--;
                                class297 var476 = class151.method1023(-30464, class185.field2698[var6]);
                                if (var476.field4608 == -1) {
                                    class185.field2698[var6++] = 0;
                                } else {
                                    class185.field2698[var6++] = var476.field4614;
                                }
                                continue;
                            }
                            if (var517 == 2702) {
                                var6--;
                                int var477 = class185.field2698[var6];
                                class123 var478 = (class123) class124.field1833.method306((long) var477, 16216);
                                if (var478 == null) {
                                    class185.field2698[var6++] = 0;
                                } else {
                                    class185.field2698[var6++] = 1;
                                }
                                continue;
                            }
                            if (var517 == 2703) {
                                var6--;
                                class297 var479 = class151.method1023(-30464, class185.field2698[var6]);
                                if (var479.field4646 == null) {
                                    class185.field2698[var6++] = 0;
                                    continue;
                                }
                                int var480 = var479.field4646.length;
                                for (int var481 = 0; var481 < var479.field4646.length; var481++) {
                                    if (var479.field4646[var481] == null) {
                                        var480 = var481;
                                        break;
                                    }
                                }
                                class185.field2698[var6++] = var480;
                                continue;
                            }
                            if (var517 == 2704 || var517 == 2705) {
                                var6 -= 2;
                                int var482 = class185.field2698[var6 + 1];
                                int var483 = class185.field2698[var6];
                                class123 var484 = (class123) class124.field1833.method306((long) var483, 16216);
                                if (var484 != null && var484.field1823 == var482) {
                                    class185.field2698[var6++] = 1;
                                } else {
                                    class185.field2698[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var517 < 2900) {
                            var10000 = arg2 - 30405;
                            var6--;
                            class297 var473 = class151.method1023(var10000, class185.field2698[var6]);
                            if (var517 == 2800) {
                                class185.field2698[var6++] = client.method333(var473).method1961(3);
                                continue;
                            }
                            if (var517 == 2801) {
                                var6--;
                                int var474 = class185.field2698[var6];
                                int var518 = var474 - 1;
                                if (var473.field4609 != null && var518 < var473.field4609.length && var473.field4609[var518] != null) {
                                    class169.field2489[var7++] = var473.field4609[var518];
                                    continue;
                                }
                                class169.field2489[var7++] = "";
                                continue;
                            }
                            if (var517 == 2802) {
                                if (var473.field4628 == null) {
                                    class169.field2489[var7++] = "";
                                } else {
                                    class169.field2489[var7++] = var473.field4628;
                                }
                                continue;
                            }
                        } else if (var517 < 3200) {
                            if (var517 == 3100) {
                                var7--;
                                String var76 = class169.field2489[var7];
                                class260.method1759(0, "", arg2 + 187, var76);
                                continue;
                            }
                            if (var517 == 3101) {
                                var6 -= 2;
                                class133.method914(40, class185.field2687, class185.field2698[var6 + 1], class185.field2698[var6]);
                                continue;
                            }
                            if (var517 == 3103) {
                                class64.method520((byte) 16);
                                continue;
                            }
                            if (var517 == 3104) {
                                class266.field4150++;
                                int var77 = 0;
                                var7--;
                                String var78 = class169.field2489[var7];
                                if (class69.method549((byte) -3, var78)) {
                                    var77 = class213.method1439(var78, 10);
                                }
                                class59.field964.method1540(142, (byte) -2);
                                class59.field964.method453((byte) 124, var77);
                                continue;
                            }
                            if (var517 == 3105) {
                                class211.field3174++;
                                var7--;
                                String var79 = class169.field2489[var7];
                                class59.field964.method1540(201, (byte) -2);
                                class59.field964.method440(class37.method286(25077, var79), -89);
                                continue;
                            }
                            if (var517 == 3106) {
                                class137.field1993++;
                                var7--;
                                String var80 = class169.field2489[var7];
                                class59.field964.method1540(159, (byte) -2);
                                class59.field964.method437(true, var80.length() + 1);
                                class59.field964.method396(var80, false);
                                continue;
                            }
                            if (var517 == 3107) {
                                var6--;
                                int var81 = class185.field2698[var6];
                                var7--;
                                String var82 = class169.field2489[var7];
                                class251.method1713(var82, var81, false);
                                continue;
                            }
                            if (var517 == 3108) {
                                var6 -= 3;
                                int var83 = class185.field2698[var6 + 1];
                                int var84 = class185.field2698[var6];
                                int var85 = class185.field2698[var6 + 2];
                                class297 var86 = class151.method1023(-30464, var85);
                                class177.method1168(var84, -109, var83, var86);
                                continue;
                            }
                            if (var517 == 3109) {
                                var6 -= 2;
                                int var87 = class185.field2698[var6];
                                class297 var88 = var46 ? class87.field1324 : class248.field3854;
                                int var89 = class185.field2698[var6 + 1];
                                class177.method1168(var87, arg2 ^ 0x61, var89, var88);
                                continue;
                            }
                            if (var517 == 3110) {
                                class69.field1144++;
                                var6--;
                                int var90 = class185.field2698[var6];
                                class59.field964.method1540(56, (byte) -2);
                                class59.field964.method428(var90, (byte) 46);
                                continue;
                            }
                        } else if (var517 < 3300) {
                            if (var517 == 3200) {
                                var6 -= 3;
                                class44.method355(class185.field2698[var6], class185.field2698[var6 + 1], (byte) 127, class185.field2698[var6 + 2], 255);
                                continue;
                            }
                            if (var517 == 3201) {
                                var6--;
                                class6.method55(1787537640, class185.field2698[var6], 255);
                                continue;
                            }
                            if (var517 == 3202) {
                                var6 -= 2;
                                class86.method657(class185.field2698[var6 + 1], -91, 255, class185.field2698[var6]);
                                continue;
                            }
                        } else if (var517 < 3400) {
                            if (var517 == 3300) {
                                class185.field2698[var6++] = class120.field1794;
                                continue;
                            }
                            if (var517 == 3301) {
                                var6 -= 2;
                                int var439 = class185.field2698[var6];
                                int var440 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class162.method1095(var439, class226.method1551(arg2, -84), var440);
                                continue;
                            }
                            if (var517 == 3302) {
                                var6 -= 2;
                                int var441 = class185.field2698[var6 + 1];
                                int var442 = class185.field2698[var6];
                                class185.field2698[var6++] = class265.method1797(var442, -20755, var441);
                                continue;
                            }
                            if (var517 == 3303) {
                                var6 -= 2;
                                int var443 = class185.field2698[var6 + 1];
                                int var444 = class185.field2698[var6];
                                class185.field2698[var6++] = class97.method725(var443, var444, 0);
                                continue;
                            }
                            if (var517 == 3304) {
                                var6--;
                                int var445 = class185.field2698[var6];
                                class185.field2698[var6++] = class75.method600(false, var445).field4380;
                                continue;
                            }
                            if (var517 == 3305) {
                                var6--;
                                int var446 = class185.field2698[var6];
                                class185.field2698[var6++] = class259.field3967[var446];
                                continue;
                            }
                            if (var517 == 3306) {
                                var6--;
                                int var447 = class185.field2698[var6];
                                class185.field2698[var6++] = class202.field3053[var447];
                                continue;
                            }
                            if (var517 == 3307) {
                                var6--;
                                int var448 = class185.field2698[var6];
                                class185.field2698[var6++] = class102.field1502[var448];
                                continue;
                            }
                            if (var517 == 3308) {
                                int var449 = class260.field3986;
                                int var450 = (class185.field2687.field425 >> 7) + class90.field1367;
                                int var451 = (class185.field2687.field455 >> 7) + class188.field2774;
                                class185.field2698[var6++] = (var449 << 28) + (var450 << 14) + var451;
                                continue;
                            }
                            if (var517 == 3309) {
                                var6--;
                                int var452 = class185.field2698[var6];
                                class185.field2698[var6++] = class131.method904(var452, 268428711) >> 14;
                                continue;
                            }
                            if (var517 == 3310) {
                                var6--;
                                int var453 = class185.field2698[var6];
                                class185.field2698[var6++] = var453 >> 28;
                                continue;
                            }
                            if (var517 == 3311) {
                                var6--;
                                int var454 = class185.field2698[var6];
                                class185.field2698[var6++] = class131.method904(var454, 16383);
                                continue;
                            }
                            if (var517 == 3312) {
                                class185.field2698[var6++] = class244.field3781 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3313) {
                                var6 -= 2;
                                int var455 = class185.field2698[var6] + 32768;
                                int var456 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class162.method1095(var455, 47, var456);
                                continue;
                            }
                            if (var517 == 3314) {
                                var6 -= 2;
                                int var457 = class185.field2698[var6] + 32768;
                                int var458 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class265.method1797(var457, -20755, var458);
                                continue;
                            }
                            if (var517 == 3315) {
                                var6 -= 2;
                                int var459 = class185.field2698[var6] + 32768;
                                int var460 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class97.method725(var460, var459, 0);
                                continue;
                            }
                            if (var517 == 3316) {
                                if (class149.field2165 < 2) {
                                    class185.field2698[var6++] = 0;
                                } else {
                                    class185.field2698[var6++] = class149.field2165;
                                }
                                continue;
                            }
                            if (var517 == 3317) {
                                class185.field2698[var6++] = class8.field101;
                                continue;
                            }
                            if (var517 == 3318) {
                                class185.field2698[var6++] = class258.field3964;
                                continue;
                            }
                            if (var517 == 3321) {
                                class185.field2698[var6++] = class283.field4327;
                                continue;
                            }
                            if (var517 == 3322) {
                                class185.field2698[var6++] = class201.field3027;
                                continue;
                            }
                            if (var517 == 3323) {
                                if (class175.field2570 >= 5 && class175.field2570 <= 9) {
                                    class185.field2698[var6++] = 1;
                                    continue;
                                }
                                class185.field2698[var6++] = 0;
                                continue;
                            }
                            if (var517 == 3324) {
                                if (class175.field2570 >= 5 && class175.field2570 <= 9) {
                                    class185.field2698[var6++] = class175.field2570;
                                    continue;
                                }
                                class185.field2698[var6++] = 0;
                                continue;
                            }
                            if (var517 == 3325) {
                                class185.field2698[var6++] = class29.field536 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3326) {
                                class185.field2698[var6++] = class185.field2687.field3485;
                                continue;
                            }
                            if (var517 == 3327) {
                                class185.field2698[var6++] = class185.field2687.field3487.field4022 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3328) {
                                class185.field2698[var6++] = class180.field2623 && !class275.field4238 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3329) {
                                class185.field2698[var6++] = class199.field2991 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3330) {
                                var6--;
                                int var461 = class185.field2698[var6];
                                class185.field2698[var6++] = class157.method1062(var461, 0);
                                continue;
                            }
                            if (var517 == 3331) {
                                var6 -= 2;
                                int var462 = class185.field2698[var6 + 1];
                                int var463 = class185.field2698[var6];
                                class185.field2698[var6++] = class159.method1077(-110, false, var463, var462);
                                continue;
                            }
                            if (var517 == 3332) {
                                var6 -= 2;
                                int var464 = class185.field2698[var6];
                                int var465 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class159.method1077(-119, true, var464, var465);
                                continue;
                            }
                            if (var517 == 3333) {
                                class185.field2698[var6++] = class201.field3038;
                                continue;
                            }
                            if (var517 == 3335) {
                                class185.field2698[var6++] = class24.field394;
                                continue;
                            }
                            if (var517 == 3336) {
                                var6 -= 4;
                                int var466 = class185.field2698[var6 + 1];
                                int var467 = class185.field2698[var6];
                                int var468 = (var466 << 14) + var467;
                                int var469 = class185.field2698[var6 + 2];
                                int var470 = class185.field2698[var6 + 3];
                                int var471 = (var469 << 28) + var468;
                                int var472 = var470 + var471;
                                class185.field2698[var6++] = var472;
                                continue;
                            }
                            if (var517 == 3337) {
                                class185.field2698[var6++] = class246.field3826;
                                continue;
                            }
                        } else if (var517 < 3500) {
                            if (var517 == 3400) {
                                var6 -= 2;
                                int var91 = class185.field2698[var6 + 1];
                                int var92 = class185.field2698[var6];
                                class186 var93 = class122.method862((byte) 117, var92);
                                class169.field2489[var7++] = var93.method1220(var91, class226.method1551(arg2, -10840));
                                continue;
                            }
                            if (var517 == 3408) {
                                var6 -= 4;
                                int var94 = class185.field2698[var6 + 1];
                                int var95 = class185.field2698[var6 + 2];
                                int var96 = class185.field2698[var6];
                                int var97 = class185.field2698[var6 + 3];
                                class186 var98 = class122.method862((byte) 82, var95);
                                if (var98.field2717 == var96 && var98.field2715 == var94) {
                                    if (var94 == 115) {
                                        class169.field2489[var7++] = var98.method1220(var97, 10861);
                                    } else {
                                        class185.field2698[var6++] = var98.method1216(var97, 500);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var517 == 3409) {
                                var6 -= 3;
                                int var99 = class185.field2698[var6];
                                int var100 = class185.field2698[var6 + 1];
                                int var101 = class185.field2698[var6 + 2];
                                if (var100 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class186 var102 = class122.method862((byte) 89, var100);
                                if (var102.field2715 != var99) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class185.field2698[var6++] = var102.method1222(arg2 + 59, var101) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3410) {
                                var6--;
                                int var103 = class185.field2698[var6];
                                var7--;
                                String var104 = class169.field2489[var7];
                                if (var103 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class186 var105 = class122.method862((byte) 121, var103);
                                if (var105.field2715 != 's') {
                                    throw new RuntimeException("C3410-1");
                                }
                                class185.field2698[var6++] = var105.method1213((byte) 125, var104) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3411) {
                                var6--;
                                int var106 = class185.field2698[var6];
                                class186 var107 = class122.method862((byte) 85, var106);
                                class185.field2698[var6++] = var107.field2709.method313(91);
                                continue;
                            }
                        } else if (var517 < 3700) {
                            if (var517 == 3600) {
                                if (class239.field3711 == 0) {
                                    class185.field2698[var6++] = -2;
                                } else if (class239.field3711 == 1) {
                                    class185.field2698[var6++] = -1;
                                } else {
                                    class185.field2698[var6++] = class3.field36;
                                }
                                continue;
                            }
                            if (var517 == 3601) {
                                var6--;
                                int var108 = class185.field2698[var6];
                                if (class239.field3711 == 2 && class3.field36 > var108) {
                                    class169.field2489[var7++] = class22.field368[var108];
                                    continue;
                                }
                                class169.field2489[var7++] = "";
                                continue;
                            }
                            if (var517 == 3602) {
                                var6--;
                                int var109 = class185.field2698[var6];
                                if (class239.field3711 == 2 && var109 < class3.field36) {
                                    class185.field2698[var6++] = class117.field1762[var109];
                                    continue;
                                }
                                class185.field2698[var6++] = 0;
                                continue;
                            }
                            if (var517 == 3603) {
                                var6--;
                                int var110 = class185.field2698[var6];
                                if (class239.field3711 == 2 && var110 < class3.field36) {
                                    class185.field2698[var6++] = class140.field2028[var110];
                                    continue;
                                }
                                class185.field2698[var6++] = 0;
                                continue;
                            }
                            if (var517 == 3604) {
                                var7--;
                                String var111 = class169.field2489[var7];
                                var6--;
                                int var112 = class185.field2698[var6];
                                class236.method1594(-16891, var112, var111);
                                continue;
                            }
                            if (var517 == 3605) {
                                var7--;
                                String var113 = class169.field2489[var7];
                                class96.method722(class37.method286(arg2 ^ 0xFFFF9E30, var113), 25378);
                                continue;
                            }
                            if (var517 == 3606) {
                                var7--;
                                String var114 = class169.field2489[var7];
                                class191.method1278(class37.method286(25077, var114), false);
                                continue;
                            }
                            if (var517 == 3607) {
                                var7--;
                                String var115 = class169.field2489[var7];
                                class181.method1194((byte) 109, class37.method286(25077, var115), false);
                                continue;
                            }
                            if (var517 == 3608) {
                                var7--;
                                String var116 = class169.field2489[var7];
                                class214.method1444(class37.method286(25077, var116), -55);
                                continue;
                            }
                            if (var517 == 3609) {
                                var7--;
                                String var117 = class169.field2489[var7];
                                if (var117.startsWith("<img=0>") || var117.startsWith("<img=1>")) {
                                    var117 = var117.substring(7);
                                }
                                class185.field2698[var6++] = class280.method1859(var117, true) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3610) {
                                var6--;
                                int var118 = class185.field2698[var6];
                                if (class239.field3711 == 2 && var118 < class3.field36) {
                                    class169.field2489[var7++] = class209.field3130[var118];
                                    continue;
                                }
                                class169.field2489[var7++] = "";
                                continue;
                            }
                            if (var517 == 3611) {
                                if (class51.field838 == null) {
                                    class169.field2489[var7++] = "";
                                } else {
                                    class169.field2489[var7++] = class186.method1211(arg2 + 62, class51.field838);
                                }
                                continue;
                            }
                            if (var517 == 3612) {
                                if (class51.field838 == null) {
                                    class185.field2698[var6++] = 0;
                                } else {
                                    class185.field2698[var6++] = class212.field3256;
                                }
                                continue;
                            }
                            if (var517 == 3613) {
                                var6--;
                                int var119 = class185.field2698[var6];
                                if (class51.field838 != null && class212.field3256 > var119) {
                                    class169.field2489[var7++] = class186.method1211(3, class182.field2646[var119].field2328);
                                    continue;
                                }
                                class169.field2489[var7++] = "";
                                continue;
                            }
                            if (var517 == 3614) {
                                var6--;
                                int var120 = class185.field2698[var6];
                                if (class51.field838 != null && class212.field3256 > var120) {
                                    class185.field2698[var6++] = class182.field2646[var120].field2321;
                                    continue;
                                }
                                class185.field2698[var6++] = 0;
                                continue;
                            }
                            if (var517 == 3615) {
                                var6--;
                                int var121 = class185.field2698[var6];
                                if (class51.field838 != null && var121 < class212.field3256) {
                                    class185.field2698[var6++] = class182.field2646[var121].field2320;
                                    continue;
                                }
                                class185.field2698[var6++] = 0;
                                continue;
                            }
                            if (var517 == 3616) {
                                class185.field2698[var6++] = class34.field606;
                                continue;
                            }
                            if (var517 == 3617) {
                                var7--;
                                String var122 = class169.field2489[var7];
                                class231.method1571((byte) -128, var122);
                                continue;
                            }
                            if (var517 == 3618) {
                                class185.field2698[var6++] = class150.field2172;
                                continue;
                            }
                            if (var517 == 3619) {
                                var7--;
                                String var123 = class169.field2489[var7];
                                class59.method483(class37.method286(arg2 + 25136, var123), false);
                                continue;
                            }
                            if (var517 == 3620) {
                                class261.method1760(1);
                                continue;
                            }
                            if (var517 == 3621) {
                                if (class239.field3711 == 0) {
                                    class185.field2698[var6++] = -1;
                                } else {
                                    class185.field2698[var6++] = class206.field3090;
                                }
                                continue;
                            }
                            if (var517 == 3622) {
                                var6--;
                                int var124 = class185.field2698[var6];
                                if (class239.field3711 != 0 && class206.field3090 > var124) {
                                    class169.field2489[var7++] = class37.method287(class51.field831[var124], (byte) 125);
                                    continue;
                                }
                                class169.field2489[var7++] = "";
                                continue;
                            }
                            if (var517 == 3623) {
                                var7--;
                                String var125 = class169.field2489[var7];
                                if (var125.startsWith("<img=0>") || var125.startsWith("<img=1>")) {
                                    var125 = var125.substring(7);
                                }
                                class185.field2698[var6++] = class165.method1126(var125, -72) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3624) {
                                var6--;
                                int var126 = class185.field2698[var6];
                                if (class182.field2646 != null && var126 < class212.field3256 && class182.field2646[var126].field2328.equalsIgnoreCase(class185.field2687.field3488)) {
                                    class185.field2698[var6++] = 1;
                                    continue;
                                }
                                class185.field2698[var6++] = 0;
                                continue;
                            }
                            if (var517 == 3625) {
                                if (class275.field4262 == null) {
                                    class169.field2489[var7++] = "";
                                } else {
                                    class169.field2489[var7++] = class186.method1211(3, class275.field4262);
                                }
                                continue;
                            }
                            if (var517 == 3626) {
                                var6--;
                                int var127 = class185.field2698[var6];
                                if (class51.field838 != null && var127 < class212.field3256) {
                                    class169.field2489[var7++] = class182.field2646[var127].field2329;
                                    continue;
                                }
                                class169.field2489[var7++] = "";
                                continue;
                            }
                            if (var517 == 3627) {
                                var6--;
                                int var128 = class185.field2698[var6];
                                if (class239.field3711 == 2 && var128 >= 0 && class3.field36 > var128) {
                                    class185.field2698[var6++] = class180.field2622[var128] ? 1 : 0;
                                    continue;
                                }
                                class185.field2698[var6++] = 0;
                                continue;
                            }
                            if (var517 == 3628) {
                                var7--;
                                String var129 = class169.field2489[var7];
                                if (var129.startsWith("<img=0>") || var129.startsWith("<img=1>")) {
                                    var129 = var129.substring(7);
                                }
                                class185.field2698[var6++] = class16.method119(var129, -1);
                                continue;
                            }
                            if (var517 == 3629) {
                                class185.field2698[var6++] = class269.field4188;
                                continue;
                            }
                            if (var517 == 3630) {
                                var7--;
                                String var130 = class169.field2489[var7];
                                class181.method1194((byte) 109, class37.method286(25077, var130), true);
                                continue;
                            }
                            if (var517 == 3631) {
                                var6--;
                                int var131 = class185.field2698[var6];
                                class185.field2698[var6++] = class164.field2392[var131] ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 4000) {
                            if (var517 == 3903) {
                                var6--;
                                int var132 = class185.field2698[var6];
                                class185.field2698[var6++] = class264.field4133[var132].method1803((byte) 86);
                                continue;
                            }
                            if (var517 == 3904) {
                                var6--;
                                int var133 = class185.field2698[var6];
                                class185.field2698[var6++] = class264.field4133[var133].field4158;
                                continue;
                            }
                            if (var517 == 3905) {
                                var6--;
                                int var134 = class185.field2698[var6];
                                class185.field2698[var6++] = class264.field4133[var134].field4164;
                                continue;
                            }
                            if (var517 == 3906) {
                                var6--;
                                int var135 = class185.field2698[var6];
                                class185.field2698[var6++] = class264.field4133[var135].field4157;
                                continue;
                            }
                            if (var517 == 3907) {
                                var6--;
                                int var136 = class185.field2698[var6];
                                class185.field2698[var6++] = class264.field4133[var136].field4166;
                                continue;
                            }
                            if (var517 == 3908) {
                                var6--;
                                int var137 = class185.field2698[var6];
                                class185.field2698[var6++] = class264.field4133[var137].field4167;
                                continue;
                            }
                            if (var517 == 3910) {
                                var6--;
                                int var138 = class185.field2698[var6];
                                int var139 = class264.field4133[var138].method1804((byte) 66);
                                class185.field2698[var6++] = var139 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3911) {
                                var6--;
                                int var140 = class185.field2698[var6];
                                int var141 = class264.field4133[var140].method1804((byte) 86);
                                class185.field2698[var6++] = var141 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3912) {
                                var6--;
                                int var142 = class185.field2698[var6];
                                int var143 = class264.field4133[var142].method1804((byte) 80);
                                class185.field2698[var6++] = var143 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 3913) {
                                var6--;
                                int var144 = class185.field2698[var6];
                                int var145 = class264.field4133[var144].method1804((byte) 114);
                                class185.field2698[var6++] = var145 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 4100) {
                            if (var517 == 4000) {
                                var6 -= 2;
                                int var146 = class185.field2698[var6];
                                int var147 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = var146 + var147;
                                continue;
                            }
                            if (var517 == 4001) {
                                var6 -= 2;
                                int var148 = class185.field2698[var6];
                                int var149 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = var148 - var149;
                                continue;
                            }
                            if (var517 == 4002) {
                                var6 -= 2;
                                int var150 = class185.field2698[var6 + 1];
                                int var151 = class185.field2698[var6];
                                class185.field2698[var6++] = var150 * var151;
                                continue;
                            }
                            if (var517 == 4003) {
                                var6 -= 2;
                                int var152 = class185.field2698[var6 + 1];
                                int var153 = class185.field2698[var6];
                                class185.field2698[var6++] = var153 / var152;
                                continue;
                            }
                            if (var517 == 4004) {
                                var6--;
                                int var154 = class185.field2698[var6];
                                class185.field2698[var6++] = (int) (Math.random() * (double) var154);
                                continue;
                            }
                            if (var517 == 4005) {
                                var6--;
                                int var155 = class185.field2698[var6];
                                class185.field2698[var6++] = (int) ((double) (var155 + 1) * Math.random());
                                continue;
                            }
                            if (var517 == 4006) {
                                var6 -= 5;
                                int var156 = class185.field2698[var6];
                                int var157 = class185.field2698[var6 + 1];
                                int var158 = class185.field2698[var6 + 2];
                                int var159 = class185.field2698[var6 + 3];
                                int var160 = class185.field2698[var6 + 4];
                                class185.field2698[var6++] = (var157 - var156) * (var160 - var158) / (var159 - var158) + var156;
                                continue;
                            }
                            if (var517 == 4007) {
                                var6 -= 2;
                                long var161 = (long) class185.field2698[var6 + 1];
                                long var163 = (long) class185.field2698[var6];
                                class185.field2698[var6++] = (int) (var161 * var163 / 100L + var163);
                                continue;
                            }
                            if (var517 == 4008) {
                                var6 -= 2;
                                int var165 = class185.field2698[var6];
                                int var166 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class186.method1215(var165, 0x1 << var166);
                                continue;
                            }
                            if (var517 == 4009) {
                                var6 -= 2;
                                int var167 = class185.field2698[var6];
                                int var168 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class131.method904(-(0x1 << var168) - 1, var167);
                                continue;
                            }
                            if (var517 == 4010) {
                                var6 -= 2;
                                int var169 = class185.field2698[var6];
                                int var170 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class131.method904(var169, 0x1 << var170) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var517 == 4011) {
                                var6 -= 2;
                                int var171 = class185.field2698[var6];
                                int var172 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = var171 % var172;
                                continue;
                            }
                            if (var517 == 4012) {
                                var6 -= 2;
                                int var173 = class185.field2698[var6];
                                int var174 = class185.field2698[var6 + 1];
                                if (var173 == 0) {
                                    class185.field2698[var6++] = 0;
                                } else {
                                    class185.field2698[var6++] = (int) Math.pow((double) var173, (double) var174);
                                }
                                continue;
                            }
                            if (var517 == 4013) {
                                var6 -= 2;
                                int var175 = class185.field2698[var6];
                                int var176 = class185.field2698[var6 + 1];
                                if (var175 == 0) {
                                    class185.field2698[var6++] = 0;
                                } else if (var176 == 0) {
                                    class185.field2698[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class185.field2698[var6++] = (int) Math.pow((double) var175, 1.0D / (double) var176);
                                }
                                continue;
                            }
                            if (var517 == 4014) {
                                var6 -= 2;
                                int var177 = class185.field2698[var6];
                                int var178 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class131.method904(var178, var177);
                                continue;
                            }
                            if (var517 == 4015) {
                                var6 -= 2;
                                int var179 = class185.field2698[var6 + 1];
                                int var180 = class185.field2698[var6];
                                class185.field2698[var6++] = class186.method1215(var180, var179);
                                continue;
                            }
                            if (var517 == 4016) {
                                var6 -= 2;
                                int var181 = class185.field2698[var6];
                                int var182 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = var182 > var181 ? var181 : var182;
                                continue;
                            }
                            if (var517 == 4017) {
                                var6 -= 2;
                                int var183 = class185.field2698[var6 + 1];
                                int var184 = class185.field2698[var6];
                                class185.field2698[var6++] = var183 < var184 ? var184 : var183;
                                continue;
                            }
                            if (var517 == 4018) {
                                var6 -= 3;
                                long var185 = (long) class185.field2698[var6];
                                long var187 = (long) class185.field2698[var6 + 2];
                                long var189 = (long) class185.field2698[var6 + 1];
                                class185.field2698[var6++] = (int) (var185 * var187 / var189);
                                continue;
                            }
                        } else if (var517 < 4200) {
                            if (var517 == 4100) {
                                var6--;
                                int var191 = class185.field2698[var6];
                                var7--;
                                String var192 = class169.field2489[var7];
                                class169.field2489[var7++] = var192 + var191;
                                continue;
                            }
                            if (var517 == 4101) {
                                var7 -= 2;
                                String var193 = class169.field2489[var7 + 1];
                                String var194 = class169.field2489[var7];
                                class169.field2489[var7++] = var194 + var193;
                                continue;
                            }
                            if (var517 == 4102) {
                                var7--;
                                String var195 = class169.field2489[var7];
                                var6--;
                                int var196 = class185.field2698[var6];
                                class169.field2489[var7++] = var195 + class105.method767(false, true, var196);
                                continue;
                            }
                            if (var517 == 4103) {
                                var7--;
                                String var197 = class169.field2489[var7];
                                class169.field2489[var7++] = var197.toLowerCase();
                                continue;
                            }
                            if (var517 == 4104) {
                                var6--;
                                int var198 = class185.field2698[var6];
                                long var199 = ((long) var198 + 11745L) * 86400000L;
                                class19.field334.setTime(new Date(var199));
                                int var201 = class19.field334.get(5);
                                int var202 = class19.field334.get(2);
                                int var203 = class19.field334.get(1);
                                class169.field2489[var7++] = var201 + "-" + class180.field2621[var202] + "-" + var203;
                                continue;
                            }
                            if (var517 == 4105) {
                                var7 -= 2;
                                String var204 = class169.field2489[var7 + 1];
                                String var205 = class169.field2489[var7];
                                if (class185.field2687.field3487 != null && class185.field2687.field3487.field4022) {
                                    class169.field2489[var7++] = var204;
                                    continue;
                                }
                                class169.field2489[var7++] = var205;
                                continue;
                            }
                            if (var517 == 4106) {
                                var6--;
                                int var206 = class185.field2698[var6];
                                class169.field2489[var7++] = Integer.toString(var206);
                                continue;
                            }
                            if (var517 == 4107) {
                                var7 -= 2;
                                class185.field2698[var6++] = class134.method923(class226.method1551(arg2, -80), class266.method1798(0, class169.field2489[var7 + 1], class24.field394, class169.field2489[var7]));
                                continue;
                            }
                            if (var517 == 4108) {
                                var6 -= 2;
                                var7--;
                                String var207 = class169.field2489[var7];
                                int var208 = class185.field2698[var6 + 1];
                                int var209 = class185.field2698[var6];
                                class185.field2698[var6++] = class22.method156(var208, (byte) 61).method1284(var207, var209);
                                continue;
                            }
                            if (var517 == 4109) {
                                var7--;
                                String var210 = class169.field2489[var7];
                                var6 -= 2;
                                int var211 = class185.field2698[var6];
                                int var212 = class185.field2698[var6 + 1];
                                class185.field2698[var6++] = class22.method156(var212, (byte) 99).method1290(var210, var211);
                                continue;
                            }
                            if (var517 == 4110) {
                                var7 -= 2;
                                String var213 = class169.field2489[var7 + 1];
                                String var214 = class169.field2489[var7];
                                var6--;
                                if (class185.field2698[var6] == 1) {
                                    class169.field2489[var7++] = var214;
                                } else {
                                    class169.field2489[var7++] = var213;
                                }
                                continue;
                            }
                            if (var517 == 4111) {
                                var7--;
                                String var215 = class169.field2489[var7];
                                class169.field2489[var7++] = class192.method1297(var215);
                                continue;
                            }
                            if (var517 == 4112) {
                                var7--;
                                String var216 = class169.field2489[var7];
                                var6--;
                                int var217 = class185.field2698[var6];
                                if (var217 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class169.field2489[var7++] = var216 + (char) var217;
                                continue;
                            }
                            if (var517 == 4113) {
                                var6--;
                                int var218 = class185.field2698[var6];
                                class185.field2698[var6++] = class43.method350((char) var218, -97) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 4114) {
                                var6--;
                                int var219 = class185.field2698[var6];
                                class185.field2698[var6++] = class163.method1102(-4855, (char) var219) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 4115) {
                                var6--;
                                int var220 = class185.field2698[var6];
                                class185.field2698[var6++] = class270.method1818((char) var220, false) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 4116) {
                                var6--;
                                int var221 = class185.field2698[var6];
                                class185.field2698[var6++] = class105.method771(false, (char) var221) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 4117) {
                                var7--;
                                String var222 = class169.field2489[var7];
                                if (var222 == null) {
                                    class185.field2698[var6++] = 0;
                                } else {
                                    class185.field2698[var6++] = var222.length();
                                }
                                continue;
                            }
                            if (var517 == 4118) {
                                var6 -= 2;
                                var7--;
                                String var223 = class169.field2489[var7];
                                int var224 = class185.field2698[var6];
                                int var225 = class185.field2698[var6 + 1];
                                class169.field2489[var7++] = var223.substring(var224, var225);
                                continue;
                            }
                            if (var517 == 4119) {
                                var7--;
                                String var226 = class169.field2489[var7];
                                StringBuffer var227 = new StringBuffer(var226.length());
                                boolean var228 = false;
                                for (int var229 = 0; var229 < var226.length(); var229++) {
                                    char var230 = var226.charAt(var229);
                                    if (var230 == '<') {
                                        var228 = true;
                                    } else if (var230 == '>') {
                                        var228 = false;
                                    } else if (!var228) {
                                        var227.append(var230);
                                    }
                                }
                                class169.field2489[var7++] = var227.toString();
                                continue;
                            }
                            if (var517 == 4120) {
                                var7--;
                                String var231 = class169.field2489[var7];
                                var6 -= 2;
                                int var232 = class185.field2698[var6 + 1];
                                int var233 = class185.field2698[var6];
                                class185.field2698[var6++] = var231.indexOf(var233, var232);
                                continue;
                            }
                            if (var517 == 4121) {
                                var7 -= 2;
                                String var234 = class169.field2489[var7 + 1];
                                var6--;
                                int var235 = class185.field2698[var6];
                                String var236 = class169.field2489[var7];
                                class185.field2698[var6++] = var236.indexOf(var234, var235);
                                continue;
                            }
                            if (var517 == 4122) {
                                var6--;
                                int var237 = class185.field2698[var6];
                                class185.field2698[var6++] = Character.toLowerCase((char) var237);
                                continue;
                            }
                            if (var517 == 4123) {
                                var6--;
                                int var238 = class185.field2698[var6];
                                class185.field2698[var6++] = Character.toUpperCase((char) var238);
                                continue;
                            }
                            if (var517 == 4124) {
                                var6--;
                                boolean var239 = class185.field2698[var6] != 0;
                                var6--;
                                int var240 = class185.field2698[var6];
                                class169.field2489[var7++] = class124.method871(class24.field394, var239, (long) var240, 0, -113);
                                continue;
                            }
                        } else if (var517 < 4300) {
                            if (var517 == 4200) {
                                var6--;
                                int var420 = class185.field2698[var6];
                                class169.field2489[var7++] = class140.method951((byte) -94, var420).field265;
                                continue;
                            }
                            if (var517 == 4201) {
                                var6 -= 2;
                                int var421 = class185.field2698[var6 + 1];
                                int var422 = class185.field2698[var6];
                                class15 var423 = class140.method951((byte) -94, var422);
                                if (var421 >= 1 && var421 <= 5 && var423.field279[var421 - 1] != null) {
                                    class169.field2489[var7++] = var423.field279[var421 - 1];
                                    continue;
                                }
                                class169.field2489[var7++] = "";
                                continue;
                            }
                            if (var517 == 4202) {
                                var6 -= 2;
                                int var424 = class185.field2698[var6];
                                int var425 = class185.field2698[var6 + 1];
                                class15 var426 = class140.method951((byte) -94, var424);
                                if (var425 >= 1 && var425 <= 5 && var426.field248[var425 - 1] != null) {
                                    class169.field2489[var7++] = var426.field248[var425 - 1];
                                    continue;
                                }
                                class169.field2489[var7++] = "";
                                continue;
                            }
                            if (var517 == 4203) {
                                var6--;
                                int var427 = class185.field2698[var6];
                                class185.field2698[var6++] = class140.method951((byte) -94, var427).field278;
                                continue;
                            }
                            if (var517 == 4204) {
                                var6--;
                                int var428 = class185.field2698[var6];
                                class185.field2698[var6++] = class140.method951((byte) -94, var428).field267 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 4205) {
                                var6--;
                                int var429 = class185.field2698[var6];
                                class15 var430 = class140.method951((byte) -94, var429);
                                if (var430.field271 == -1 && var430.field220 >= 0) {
                                    class185.field2698[var6++] = var430.field220;
                                    continue;
                                }
                                class185.field2698[var6++] = var429;
                                continue;
                            }
                            if (var517 == 4206) {
                                var6--;
                                int var431 = class185.field2698[var6];
                                class15 var432 = class140.method951((byte) -94, var431);
                                if (var432.field271 >= 0 && var432.field220 >= 0) {
                                    class185.field2698[var6++] = var432.field220;
                                    continue;
                                }
                                class185.field2698[var6++] = var431;
                                continue;
                            }
                            if (var517 == 4207) {
                                var6--;
                                int var433 = class185.field2698[var6];
                                class185.field2698[var6++] = class140.method951((byte) -94, var433).field286 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 4208) {
                                var6 -= 2;
                                int var434 = class185.field2698[var6 + 1];
                                int var435 = class185.field2698[var6];
                                class260 var436 = class77.method612(var434, 11);
                                if (var436.method1756(115)) {
                                    class169.field2489[var7++] = class140.method951((byte) -94, var435).method105(var434, (byte) -103, var436.field4001);
                                } else {
                                    class185.field2698[var6++] = class140.method951((byte) -94, var435).method104(true, var436.field3997, var434);
                                }
                                continue;
                            }
                            if (var517 == 4210) {
                                var7--;
                                String var437 = class169.field2489[var7];
                                var6--;
                                int var438 = class185.field2698[var6];
                                class194.method1310(var437, (byte) -114, var438 == 1);
                                class185.field2698[var6++] = class181.field2637;
                                continue;
                            }
                            if (var517 == 4211) {
                                if (class91.field1383 != null && class181.field2637 > class97.field1432) {
                                    class185.field2698[var6++] = class131.method904(65535, class91.field1383[class97.field1432++]);
                                    continue;
                                }
                                class185.field2698[var6++] = -1;
                                continue;
                            }
                            if (var517 == 4212) {
                                class97.field1432 = 0;
                                continue;
                            }
                        } else if (var517 >= 4400) {
                            if (var517 >= 4500) {
                                if (var517 >= 4600) {
                                    if (var517 < 5100) {
                                        if (var517 == 5000) {
                                            class185.field2698[var6++] = class208.field3114;
                                            continue;
                                        }
                                        if (var517 == 5001) {
                                            class141.field2031++;
                                            var6 -= 3;
                                            class208.field3114 = class185.field2698[var6];
                                            class182.field2645 = class185.field2698[var6 + 1];
                                            class278.field4291 = class185.field2698[var6 + 2];
                                            class59.field964.method1540(204, (byte) -2);
                                            class59.field964.method437(true, class208.field3114);
                                            class59.field964.method437(true, class182.field2645);
                                            class59.field964.method437(true, class278.field4291);
                                            continue;
                                        }
                                        if (var517 == 5002) {
                                            var6 -= 2;
                                            class37.field648++;
                                            var7--;
                                            String var346 = class169.field2489[var7];
                                            int var347 = class185.field2698[var6];
                                            int var348 = class185.field2698[var6 + 1];
                                            class59.field964.method1540(91, (byte) -2);
                                            class59.field964.method440(class37.method286(25077, var346), -103);
                                            class59.field964.method437(true, var347 - 1);
                                            class59.field964.method437(true, var348);
                                            continue;
                                        }
                                        if (var517 == 5003) {
                                            String var349 = null;
                                            var6--;
                                            int var350 = class185.field2698[var6];
                                            if (var350 < 100) {
                                                var349 = class155.field2264[var350];
                                            }
                                            if (var349 == null) {
                                                var349 = "";
                                            }
                                            class169.field2489[var7++] = var349;
                                            continue;
                                        }
                                        if (var517 == 5004) {
                                            int var351 = -1;
                                            var6--;
                                            int var352 = class185.field2698[var6];
                                            if (var352 < 100 && class155.field2264[var352] != null) {
                                                var351 = class196.field2962[var352];
                                            }
                                            class185.field2698[var6++] = var351;
                                            continue;
                                        }
                                        if (var517 == 5005) {
                                            class185.field2698[var6++] = class182.field2645;
                                            continue;
                                        }
                                        if (var517 == 5008) {
                                            var7--;
                                            String var353 = class169.field2489[var7];
                                            if (var353.startsWith("::")) {
                                                class277.method1844((byte) -39, var353);
                                                continue;
                                            }
                                            if (class149.field2165 == 0 && (class180.field2623 && !class275.field4238 || class199.field2991)) {
                                                continue;
                                            }
                                            class197.field2974++;
                                            byte var354 = 0;
                                            byte var355 = 0;
                                            String var356 = var353.toLowerCase();
                                            if (var356.startsWith(class64.field1069)) {
                                                var353 = var353.substring(class64.field1069.length());
                                                var354 = 0;
                                            } else if (var356.startsWith(class165.field2432)) {
                                                var354 = 1;
                                                var353 = var353.substring(class165.field2432.length());
                                            } else if (var356.startsWith(class73.field1180)) {
                                                var354 = 2;
                                                var353 = var353.substring(class73.field1180.length());
                                            } else if (var356.startsWith(class280.field4298)) {
                                                var354 = 3;
                                                var353 = var353.substring(class280.field4298.length());
                                            } else if (var356.startsWith(class51.field829)) {
                                                var354 = 4;
                                                var353 = var353.substring(class51.field829.length());
                                            } else if (var356.startsWith(class10.field138)) {
                                                var354 = 5;
                                                var353 = var353.substring(class10.field138.length());
                                            } else if (var356.startsWith(class140.field2024)) {
                                                var353 = var353.substring(class140.field2024.length());
                                                var354 = 6;
                                            } else if (var356.startsWith(class155.field2268)) {
                                                var353 = var353.substring(class155.field2268.length());
                                                var354 = 7;
                                            } else if (var356.startsWith(class206.field3088)) {
                                                var354 = 8;
                                                var353 = var353.substring(class206.field3088.length());
                                            } else if (var356.startsWith(class172.field2516)) {
                                                var354 = 9;
                                                var353 = var353.substring(class172.field2516.length());
                                            } else if (var356.startsWith(class244.field3787)) {
                                                var353 = var353.substring(class244.field3787.length());
                                                var354 = 10;
                                            } else if (var356.startsWith(class142.field2057)) {
                                                var353 = var353.substring(class142.field2057.length());
                                                var354 = 11;
                                            } else if (class24.field394 != 0) {
                                                if (var356.startsWith(class189.field2844)) {
                                                    var353 = var353.substring(class189.field2844.length());
                                                    var354 = 0;
                                                } else if (var356.startsWith(class175.field2569)) {
                                                    var353 = var353.substring(class175.field2569.length());
                                                    var354 = 1;
                                                } else if (var356.startsWith(class12.field185)) {
                                                    var354 = 2;
                                                    var353 = var353.substring(class12.field185.length());
                                                } else if (var356.startsWith(class160.field2327)) {
                                                    var353 = var353.substring(class160.field2327.length());
                                                    var354 = 3;
                                                } else if (var356.startsWith(class168.field2473)) {
                                                    var354 = 4;
                                                    var353 = var353.substring(class168.field2473.length());
                                                } else if (var356.startsWith(class64.field1073)) {
                                                    var354 = 5;
                                                    var353 = var353.substring(class64.field1073.length());
                                                } else if (var356.startsWith(class16.field296)) {
                                                    var353 = var353.substring(class16.field296.length());
                                                    var354 = 6;
                                                } else if (var356.startsWith(class115.field1752)) {
                                                    var354 = 7;
                                                    var353 = var353.substring(class115.field1752.length());
                                                } else if (var356.startsWith(class91.field1380)) {
                                                    var354 = 8;
                                                    var353 = var353.substring(class91.field1380.length());
                                                } else if (var356.startsWith(class51.field827)) {
                                                    var354 = 9;
                                                    var353 = var353.substring(class51.field827.length());
                                                } else if (var356.startsWith(class171.field2514)) {
                                                    var354 = 10;
                                                    var353 = var353.substring(class171.field2514.length());
                                                } else if (var356.startsWith(class182.field2650)) {
                                                    var354 = 11;
                                                    var353 = var353.substring(class182.field2650.length());
                                                }
                                            }
                                            String var357 = var353.toLowerCase();
                                            if (var357.startsWith(class237.field3677)) {
                                                var353 = var353.substring(class237.field3677.length());
                                                var355 = 1;
                                            } else if (var357.startsWith(class134.field1965)) {
                                                var353 = var353.substring(class134.field1965.length());
                                                var355 = 2;
                                            } else if (var357.startsWith(class226.field3525)) {
                                                var355 = 3;
                                                var353 = var353.substring(class226.field3525.length());
                                            } else if (var357.startsWith(class128.field1888)) {
                                                var353 = var353.substring(class128.field1888.length());
                                                var355 = 4;
                                            } else if (var357.startsWith(class1.field15)) {
                                                var355 = 5;
                                                var353 = var353.substring(class1.field15.length());
                                            } else if (class24.field394 != 0) {
                                                if (var357.startsWith(field3866)) {
                                                    var355 = 1;
                                                    var353 = var353.substring(field3866.length());
                                                } else if (var357.startsWith(class90.field1372)) {
                                                    var355 = 2;
                                                    var353 = var353.substring(class90.field1372.length());
                                                } else if (var357.startsWith(class69.field1146)) {
                                                    var355 = 3;
                                                    var353 = var353.substring(class69.field1146.length());
                                                } else if (var357.startsWith(class7.field91)) {
                                                    var353 = var353.substring(class7.field91.length());
                                                    var355 = 4;
                                                } else if (var357.startsWith(class7.field88)) {
                                                    var355 = 5;
                                                    var353 = var353.substring(class7.field88.length());
                                                }
                                            }
                                            class59.field964.method1540(70, (byte) -2);
                                            class59.field964.method437(true, 0);
                                            int var358 = class59.field964.field887;
                                            class59.field964.method437(true, var354);
                                            class59.field964.method437(true, var355);
                                            class130.method896(true, var353, class59.field964);
                                            class59.field964.method413(class59.field964.field887 - var358, 16660);
                                            continue;
                                        }
                                        if (var517 == 5009) {
                                            var7 -= 2;
                                            String var359 = class169.field2489[var7 + 1];
                                            String var360 = class169.field2489[var7];
                                            if (class149.field2165 != 0 || (!class180.field2623 || class275.field4238) && !class199.field2991) {
                                                class227.field3541++;
                                                class59.field964.method1540(245, (byte) -2);
                                                class59.field964.method437(true, 0);
                                                int var361 = class59.field964.field887;
                                                class59.field964.method440(class37.method286(25077, var360), -61);
                                                class130.method896(true, var359, class59.field964);
                                                class59.field964.method413(class59.field964.field887 - var361, 16660);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5010) {
                                            var6--;
                                            int var362 = class185.field2698[var6];
                                            String var363 = null;
                                            if (var362 < 100) {
                                                var363 = class212.field3253[var362];
                                            }
                                            if (var363 == null) {
                                                var363 = "";
                                            }
                                            class169.field2489[var7++] = var363;
                                            continue;
                                        }
                                        if (var517 == 5011) {
                                            String var364 = null;
                                            var6--;
                                            int var365 = class185.field2698[var6];
                                            if (var365 < 100) {
                                                var364 = class114.field1743[var365];
                                            }
                                            if (var364 == null) {
                                                var364 = "";
                                            }
                                            class169.field2489[var7++] = var364;
                                            continue;
                                        }
                                        if (var517 == 5012) {
                                            var6--;
                                            int var366 = class185.field2698[var6];
                                            int var367 = -1;
                                            if (var366 < 100) {
                                                var367 = class220.field3424[var366];
                                            }
                                            class185.field2698[var6++] = var367;
                                            continue;
                                        }
                                        if (var517 == 5015) {
                                            String var368;
                                            if (class185.field2687 == null || class185.field2687.field3488 == null) {
                                                var368 = class184.field2667;
                                            } else {
                                                var368 = class185.field2687.method1534(-121);
                                            }
                                            class169.field2489[var7++] = var368;
                                            continue;
                                        }
                                        if (var517 == 5016) {
                                            class185.field2698[var6++] = class278.field4291;
                                            continue;
                                        }
                                        if (var517 == 5017) {
                                            class185.field2698[var6++] = class208.field3123;
                                            continue;
                                        }
                                        if (var517 == 5050) {
                                            var6--;
                                            int var369 = class185.field2698[var6];
                                            class169.field2489[var7++] = class114.method818((byte) -78, var369).field2999;
                                            continue;
                                        }
                                        if (var517 == 5051) {
                                            var6--;
                                            int var370 = class185.field2698[var6];
                                            class199 var371 = class114.method818((byte) -78, var370);
                                            if (var371.field2998 == null) {
                                                class185.field2698[var6++] = 0;
                                            } else {
                                                class185.field2698[var6++] = var371.field2998.length;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5052) {
                                            var6 -= 2;
                                            int var372 = class185.field2698[var6];
                                            int var373 = class185.field2698[var6 + 1];
                                            class199 var374 = class114.method818((byte) -78, var372);
                                            int var375 = var374.field2998[var373];
                                            class185.field2698[var6++] = var375;
                                            continue;
                                        }
                                        if (var517 == 5053) {
                                            var6--;
                                            int var376 = class185.field2698[var6];
                                            class199 var377 = class114.method818((byte) -78, var376);
                                            if (var377.field2987 == null) {
                                                class185.field2698[var6++] = 0;
                                            } else {
                                                class185.field2698[var6++] = var377.field2987.length;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5054) {
                                            var6 -= 2;
                                            int var378 = class185.field2698[var6];
                                            int var379 = class185.field2698[var6 + 1];
                                            class185.field2698[var6++] = class114.method818((byte) -78, var378).field2987[var379];
                                            continue;
                                        }
                                        if (var517 == 5055) {
                                            var6--;
                                            int var380 = class185.field2698[var6];
                                            class169.field2489[var7++] = class69.method544(class226.method1551(arg2, -60), var380).method1676((byte) -93);
                                            continue;
                                        }
                                        if (var517 == 5056) {
                                            var6--;
                                            int var381 = class185.field2698[var6];
                                            class245 var382 = class69.method544(1, var381);
                                            if (var382.field3803 == null) {
                                                class185.field2698[var6++] = 0;
                                            } else {
                                                class185.field2698[var6++] = var382.field3803.length;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5057) {
                                            var6 -= 2;
                                            int var383 = class185.field2698[var6 + 1];
                                            int var384 = class185.field2698[var6];
                                            class185.field2698[var6++] = class69.method544(class226.method1551(arg2, -60), var384).field3803[var383];
                                            continue;
                                        }
                                        if (var517 == 5058) {
                                            class196.field2959 = new class138();
                                            var6--;
                                            class196.field2959.field2000 = class185.field2698[var6];
                                            class196.field2959.field2004 = class69.method544(1, class196.field2959.field2000);
                                            class196.field2959.field2002 = new int[class196.field2959.field2004.method1681(0)];
                                            continue;
                                        }
                                        if (var517 == 5059) {
                                            class59.field964.method1540(172, (byte) -2);
                                            class66.field1090++;
                                            class59.field964.method437(true, 0);
                                            int var385 = class59.field964.field887;
                                            class59.field964.method437(true, 0);
                                            class59.field964.method428(class196.field2959.field2000, (byte) 46);
                                            class196.field2959.field2004.method1678(class196.field2959.field2002, class59.field964, 0);
                                            class59.field964.method413(class59.field964.field887 - var385, 16660);
                                            continue;
                                        }
                                        if (var517 == 5060) {
                                            class97.field1439++;
                                            var7--;
                                            String var386 = class169.field2489[var7];
                                            class59.field964.method1540(64, (byte) -2);
                                            class59.field964.method437(true, 0);
                                            int var387 = class59.field964.field887;
                                            class59.field964.method440(class37.method286(25077, var386), arg2 ^ 0x2);
                                            class59.field964.method428(class196.field2959.field2000, (byte) 46);
                                            class196.field2959.field2004.method1678(class196.field2959.field2002, class59.field964, 0);
                                            class59.field964.method413(class59.field964.field887 - var387, 16660);
                                            continue;
                                        }
                                        if (var517 == 5061) {
                                            class59.field964.method1540(172, (byte) -2);
                                            class59.field964.method437(true, 0);
                                            int var388 = class59.field964.field887;
                                            class59.field964.method437(true, 1);
                                            class59.field964.method428(class196.field2959.field2000, (byte) 46);
                                            class196.field2959.field2004.method1678(class196.field2959.field2002, class59.field964, 0);
                                            class59.field964.method413(class59.field964.field887 - var388, 16660);
                                            class66.field1090++;
                                            continue;
                                        }
                                        if (var517 == 5062) {
                                            var6 -= 2;
                                            int var389 = class185.field2698[var6 + 1];
                                            int var390 = class185.field2698[var6];
                                            class185.field2698[var6++] = class114.method818((byte) -78, var390).field2995[var389];
                                            continue;
                                        }
                                        if (var517 == 5063) {
                                            var6 -= 2;
                                            int var391 = class185.field2698[var6];
                                            int var392 = class185.field2698[var6 + 1];
                                            class185.field2698[var6++] = class114.method818((byte) -78, var391).field2988[var392];
                                            continue;
                                        }
                                        if (var517 == 5064) {
                                            var6 -= 2;
                                            int var393 = class185.field2698[var6 + 1];
                                            int var394 = class185.field2698[var6];
                                            if (var393 == -1) {
                                                class185.field2698[var6++] = -1;
                                            } else {
                                                class185.field2698[var6++] = class114.method818((byte) -78, var394).method1330((byte) -126, (char) var393);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5065) {
                                            var6 -= 2;
                                            int var395 = class185.field2698[var6 + 1];
                                            int var396 = class185.field2698[var6];
                                            if (var395 == -1) {
                                                class185.field2698[var6++] = -1;
                                            } else {
                                                class185.field2698[var6++] = class114.method818((byte) -78, var396).method1332(0, (char) var395);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5066) {
                                            var6--;
                                            int var397 = class185.field2698[var6];
                                            class185.field2698[var6++] = class69.method544(1, var397).method1681(0);
                                            continue;
                                        }
                                        if (var517 == 5067) {
                                            var6 -= 2;
                                            int var398 = class185.field2698[var6];
                                            int var399 = class185.field2698[var6 + 1];
                                            int var400 = class69.method544(1, var398).method1682(88, var399);
                                            class185.field2698[var6++] = var400;
                                            continue;
                                        }
                                        if (var517 == 5068) {
                                            var6 -= 2;
                                            int var401 = class185.field2698[var6];
                                            int var402 = class185.field2698[var6 + 1];
                                            class196.field2959.field2002[var401] = var402;
                                            continue;
                                        }
                                        if (var517 == 5069) {
                                            var6 -= 2;
                                            int var403 = class185.field2698[var6];
                                            int var404 = class185.field2698[var6 + 1];
                                            class196.field2959.field2002[var403] = var404;
                                            continue;
                                        }
                                        if (var517 == 5070) {
                                            var6 -= 3;
                                            int var405 = class185.field2698[var6];
                                            int var406 = class185.field2698[var6 + 2];
                                            int var407 = class185.field2698[var6 + 1];
                                            class245 var408 = class69.method544(1, var405);
                                            if (var408.method1682(-54, var407) != 0) {
                                                throw new RuntimeException("bad command");
                                            }
                                            class185.field2698[var6++] = var408.method1675(var407, var406, -128);
                                            continue;
                                        }
                                        if (var517 == 5071) {
                                            var6--;
                                            boolean var409 = class185.field2698[var6] == 1;
                                            var7--;
                                            String var410 = class169.field2489[var7];
                                            class82.method640(118, var409, var410);
                                            class185.field2698[var6++] = class181.field2637;
                                            continue;
                                        }
                                        if (var517 == 5072) {
                                            if (class91.field1383 != null && class97.field1432 < class181.field2637) {
                                                class185.field2698[var6++] = class131.method904(65535, class91.field1383[class97.field1432++]);
                                                continue;
                                            }
                                            class185.field2698[var6++] = -1;
                                            continue;
                                        }
                                        if (var517 == 5073) {
                                            class97.field1432 = 0;
                                            continue;
                                        }
                                    } else if (var517 < 5200) {
                                        if (var517 == 5100) {
                                            if (class293.field4451[86]) {
                                                class185.field2698[var6++] = 1;
                                            } else {
                                                class185.field2698[var6++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5101) {
                                            if (class293.field4451[82]) {
                                                class185.field2698[var6++] = 1;
                                            } else {
                                                class185.field2698[var6++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5102) {
                                            if (class293.field4451[81]) {
                                                class185.field2698[var6++] = 1;
                                            } else {
                                                class185.field2698[var6++] = 0;
                                            }
                                            continue;
                                        }
                                    } else if (var517 < 5300) {
                                        if (var517 == 5200) {
                                            var6--;
                                            class39.method314(-101, class185.field2698[var6]);
                                            continue;
                                        }
                                        if (var517 == 5201) {
                                            class185.field2698[var6++] = class250.method1706(false);
                                            continue;
                                        }
                                        if (var517 == 5202) {
                                            var6--;
                                            class244.method1662(-28029, class185.field2698[var6]);
                                            continue;
                                        }
                                        if (var517 == 5203) {
                                            var7--;
                                            class133.method916((byte) -38, class169.field2489[var7]);
                                            continue;
                                        }
                                        if (var517 == 5204) {
                                            class169.field2489[var7 - 1] = class295.method1944(class169.field2489[var7 - 1], (byte) -112);
                                            continue;
                                        }
                                        if (var517 == 5205) {
                                            var6--;
                                            class67.method536(-1, 0, -1, class185.field2698[var6]);
                                            continue;
                                        }
                                        if (var517 == 5206) {
                                            var6--;
                                            int var241 = class185.field2698[var6];
                                            class283 var242 = class196.method1321(var241 & 0x3FFF, -501, var241 >> 14 & 0x3FFF);
                                            if (var242 == null) {
                                                class185.field2698[var6++] = -1;
                                            } else {
                                                class185.field2698[var6++] = var242.field4331;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5207) {
                                            var6--;
                                            class283 var243 = class186.method1214(class185.field2698[var6], 5);
                                            if (var243 != null && var243.field4343 != null) {
                                                class169.field2489[var7++] = var243.field4343;
                                                continue;
                                            }
                                            class169.field2489[var7++] = "";
                                            continue;
                                        }
                                        if (var517 == 5208) {
                                            class185.field2698[var6++] = class151.field2202;
                                            class185.field2698[var6++] = class222.field3463;
                                            continue;
                                        }
                                        if (var517 == 5209) {
                                            class185.field2698[var6++] = class220.field3433 + class141.field2029;
                                            class185.field2698[var6++] = class235.field3619 + class67.field1114 - class12.field171 - 1;
                                            continue;
                                        }
                                        if (var517 == 5210) {
                                            var6--;
                                            int var244 = class185.field2698[var6];
                                            class283 var245 = class186.method1214(var244, arg2 + 64);
                                            if (var245 == null) {
                                                class185.field2698[var6++] = 0;
                                                class185.field2698[var6++] = 0;
                                            } else {
                                                class185.field2698[var6++] = class131.method904(var245.field4345 >> 14, 16383);
                                                class185.field2698[var6++] = class131.method904(var245.field4345, 16383);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5211) {
                                            var6--;
                                            int var246 = class185.field2698[var6];
                                            class283 var247 = class186.method1214(var246, 5);
                                            if (var247 == null) {
                                                class185.field2698[var6++] = 0;
                                                class185.field2698[var6++] = 0;
                                            } else {
                                                class185.field2698[var6++] = var247.field4338 - var247.field4329;
                                                class185.field2698[var6++] = var247.field4337 - var247.field4326;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5212) {
                                            int var248 = class237.method1619((byte) -126);
                                            int var249 = 0;
                                            String var250;
                                            if (var248 == -1) {
                                                var250 = "";
                                            } else {
                                                var250 = class154.field2251.field3731[var248];
                                                var249 = class154.field2251.method1642(var248, (byte) -31);
                                            }
                                            String var251 = class162.method1093((byte) -112, " ", "<br>", var250);
                                            class169.field2489[var7++] = var251;
                                            class185.field2698[var6++] = var249;
                                            continue;
                                        }
                                        if (var517 == 5213) {
                                            int var252 = class75.method603(15051);
                                            int var253 = 0;
                                            String var254;
                                            if (var252 == -1) {
                                                var254 = "";
                                            } else {
                                                var254 = class154.field2251.field3731[var252];
                                                var253 = class154.field2251.method1642(var252, (byte) -31);
                                            }
                                            String var255 = class162.method1093((byte) -112, " ", "<br>", var254);
                                            class169.field2489[var7++] = var255;
                                            class185.field2698[var6++] = var253;
                                            continue;
                                        }
                                        if (var517 == 5214) {
                                            var6--;
                                            int var256 = class185.field2698[var6];
                                            class283 var257 = class3.method40(0);
                                            if (var257 != null) {
                                                int[] var258 = var257.method1872((byte) -73, var256 >> 14 & 0x3FFF, var256 >> 28 & 0x3, var256 & 0x3FFF);
                                                if (var258 != null) {
                                                    class145.method996(var258[1], 32160, var258[2]);
                                                }
                                            }
                                            continue;
                                        }
                                        if (var517 == 5215) {
                                            var6 -= 2;
                                            int var259 = class185.field2698[var6];
                                            int var260 = class185.field2698[var6 + 1];
                                            class195 var261 = class160.method1082(var259 >> 14 & 0x3FFF, var259 & 0x3FFF, (byte) 37);
                                            boolean var262 = false;
                                            for (class283 var263 = (class283) var261.method1318((byte) -117); var263 != null; var263 = (class283) var261.method1317(-3668)) {
                                                if (var263.field4331 == var260) {
                                                    var262 = true;
                                                    break;
                                                }
                                            }
                                            if (var262) {
                                                class185.field2698[var6++] = 1;
                                            } else {
                                                class185.field2698[var6++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5216) {
                                            var6--;
                                            int var264 = class185.field2698[var6];
                                            class15.method101(var264, (byte) 9);
                                            continue;
                                        }
                                        if (var517 == 5217) {
                                            var6--;
                                            int var265 = class185.field2698[var6];
                                            if (class5.method51(var265, (byte) 88)) {
                                                class185.field2698[var6++] = 1;
                                            } else {
                                                class185.field2698[var6++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5218) {
                                            var6--;
                                            int var266 = class185.field2698[var6];
                                            class283 var267 = class186.method1214(var266, 5);
                                            if (var267 == null) {
                                                class185.field2698[var6++] = -1;
                                            } else {
                                                class185.field2698[var6++] = var267.field4341;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5219) {
                                            var7--;
                                            class266.method1801(class169.field2489[var7], (byte) -37);
                                            continue;
                                        }
                                        if (var517 == 5220) {
                                            class185.field2698[var6++] = class130.field1903 == 100 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 5221) {
                                            var6--;
                                            int var268 = class185.field2698[var6];
                                            class145.method996((var268 & 0xFFFEEA1) >> 14, arg2 ^ 0xFFFF8265, var268 & 0x3FFF);
                                            continue;
                                        }
                                        if (var517 == 5222) {
                                            class283 var269 = class3.method40(0);
                                            if (var269 == null) {
                                                class185.field2698[var6++] = -1;
                                                class185.field2698[var6++] = -1;
                                            } else {
                                                int[] var270 = var269.method1875((byte) -108, class235.field3619 + class67.field1114 - class12.field171 - 1, class220.field3433 + class141.field2029);
                                                if (var270 == null) {
                                                    class185.field2698[var6++] = -1;
                                                    class185.field2698[var6++] = -1;
                                                } else {
                                                    class185.field2698[var6++] = var270[1];
                                                    class185.field2698[var6++] = var270[2];
                                                }
                                            }
                                            continue;
                                        }
                                        if (var517 == 5223) {
                                            var6 -= 2;
                                            int var271 = class185.field2698[var6];
                                            int var272 = class185.field2698[var6 + 1];
                                            class67.method536(var272 >> 14 & 0x3FFF, 0, var272 & 0x3FFF, var271);
                                            continue;
                                        }
                                        if (var517 == 5224) {
                                            var6--;
                                            int var273 = class185.field2698[var6];
                                            class283 var274 = class3.method40(0);
                                            if (var274 == null) {
                                                class185.field2698[var6++] = -1;
                                                class185.field2698[var6++] = -1;
                                            } else {
                                                int[] var275 = var274.method1872((byte) 81, var273 >> 14 & 0x3FFF, (var273 & 0x31C83EBE) >> 28, var273 & 0x3FFF);
                                                if (var275 == null) {
                                                    class185.field2698[var6++] = -1;
                                                    class185.field2698[var6++] = -1;
                                                } else {
                                                    class185.field2698[var6++] = var275[1];
                                                    class185.field2698[var6++] = var275[2];
                                                }
                                            }
                                            continue;
                                        }
                                        if (var517 == 5225) {
                                            var6--;
                                            int var276 = class185.field2698[var6];
                                            class283 var277 = class3.method40(0);
                                            if (var277 == null) {
                                                class185.field2698[var6++] = -1;
                                                class185.field2698[var6++] = -1;
                                            } else {
                                                int[] var278 = var277.method1875((byte) -91, var276 & 0x3FFF, var276 >> 14 & 0x3FFF);
                                                if (var278 == null) {
                                                    class185.field2698[var6++] = -1;
                                                    class185.field2698[var6++] = -1;
                                                } else {
                                                    class185.field2698[var6++] = var278[1];
                                                    class185.field2698[var6++] = var278[2];
                                                }
                                            }
                                            continue;
                                        }
                                    } else if (var517 < 5400) {
                                        if (var517 == 5300) {
                                            var6 -= 2;
                                            class185.field2698[var6++] = 0;
                                            continue;
                                        }
                                        if (var517 == 5301) {
                                            continue;
                                        }
                                        if (var517 == 5302) {
                                            class185.field2698[var6++] = 0;
                                            continue;
                                        }
                                        if (var517 == 5303) {
                                            var6--;
                                            class185.field2698[var6++] = 0;
                                            class185.field2698[var6++] = 0;
                                            continue;
                                        }
                                        if (var517 == 5305) {
                                            byte var279 = -1;
                                            class185.field2698[var6++] = var279;
                                            continue;
                                        }
                                        if (var517 == 5306) {
                                            class185.field2698[var6++] = class227.method1552(false);
                                            continue;
                                        }
                                        if (var517 == 5307) {
                                            var6--;
                                            int var280 = class185.field2698[var6];
                                            if (var280 < 0 || var280 > 2) {
                                                var280 = 0;
                                            }
                                            class297.method1978(var280, false, -18786, -1, -1);
                                            continue;
                                        }
                                        if (var517 == 5308) {
                                            class185.field2698[var6++] = class124.field1840;
                                            continue;
                                        }
                                        if (var517 == 5309) {
                                            var6--;
                                            int var281 = class185.field2698[var6];
                                            if (var281 < 0 || var281 > 2) {
                                                var281 = 0;
                                            }
                                            class124.field1840 = var281;
                                            class58.method479(class217.field3338, -230);
                                            continue;
                                        }
                                    } else if (var517 < 5500) {
                                        if (var517 == 5400) {
                                            class11.field168++;
                                            var7 -= 2;
                                            String var324 = class169.field2489[var7 + 1];
                                            String var325 = class169.field2489[var7];
                                            var6--;
                                            int var326 = class185.field2698[var6];
                                            class59.field964.method1540(101, (byte) -2);
                                            class59.field964.method437(true, class69.method550(var325, 18986) + class69.method550(var324, arg2 ^ 0xFFFFB5EF) + 1);
                                            class59.field964.method396(var325, false);
                                            class59.field964.method396(var324, false);
                                            class59.field964.method437(true, var326);
                                            continue;
                                        }
                                        if (var517 == 5401) {
                                            var6 -= 2;
                                            class91.field1378[class185.field2698[var6]] = (short) class81.method630(class185.field2698[var6 + 1], class226.method1551(arg2, 495735490));
                                            class262.method1779(-103);
                                            class47.method372(~arg2);
                                            class202.method1341(41);
                                            class129.method891((byte) -119);
                                            class205.method1357(arg2 ^ 0xFFFFFFC4);
                                            continue;
                                        }
                                        if (var517 == 5405) {
                                            var6 -= 2;
                                            int var327 = class185.field2698[var6 + 1];
                                            int var328 = class185.field2698[var6];
                                            if (var328 >= 0 && var328 < 2) {
                                                class240.field3735[var328] = new int[var327 << 1][4];
                                            }
                                            continue;
                                        }
                                        if (var517 == 5406) {
                                            var6 -= 7;
                                            int var329 = class185.field2698[var6 + 3];
                                            int var330 = class185.field2698[var6 + 1] << 1;
                                            int var331 = class185.field2698[var6 + 6];
                                            int var332 = class185.field2698[var6 + 4];
                                            int var333 = class185.field2698[var6 + 5];
                                            int var334 = class185.field2698[var6 + 2];
                                            int var335 = class185.field2698[var6];
                                            if (var335 >= 0 && var335 < 2 && class240.field3735[var335] != null && var330 >= 0 && class240.field3735[var335].length > var330) {
                                                class240.field3735[var335][var330] = new int[] { class131.method904(var334 >> 14, 16383) * 128, var329, class131.method904(var334, 16383) * 128, var331 };
                                                class240.field3735[var335][var330 + 1] = new int[] { class131.method904(16383, var332 >> 14) * 128, var333, class131.method904(var332, 16383) * 128 };
                                            }
                                            continue;
                                        }
                                        if (var517 == 5407) {
                                            var6--;
                                            int var336 = class240.field3735[class185.field2698[var6]].length >> 1;
                                            class185.field2698[var6++] = var336;
                                            continue;
                                        }
                                        if (var517 == 5411) {
                                            if (class167.field2459 == null) {
                                                class262.method1777(true, false, class213.method1437(0));
                                            } else {
                                                System.exit(0);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5419) {
                                            String var337 = "";
                                            if (class232.field3593 != null) {
                                                if (class232.field3593.field709 == null) {
                                                    var337 = class283.method1878(671258456, class232.field3593.field710);
                                                } else {
                                                    var337 = (String) class232.field3593.field709;
                                                }
                                            }
                                            class169.field2489[var7++] = var337;
                                            continue;
                                        }
                                        if (var517 == 5420) {
                                            class185.field2698[var6++] = class26.field514 == 3 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 5421) {
                                            var7--;
                                            String var338 = class169.field2489[var7];
                                            var6--;
                                            boolean var339 = class185.field2698[var6] == 1;
                                            String var340 = class213.method1437(0) + var338;
                                            if (class167.field2459 == null && (!var339 || class26.field514 == 3 || !class26.field512.startsWith("win") || class256.field3942)) {
                                                class262.method1777(true, var339, var340);
                                                continue;
                                            }
                                            class165.field2419 = var340;
                                            class153.field2239 = var339;
                                            class42.field743 = class217.field3338.method180((byte) 43, var340);
                                            continue;
                                        }
                                        if (var517 == 5422) {
                                            var7 -= 2;
                                            String var341 = class169.field2489[var7 + 1];
                                            var6--;
                                            int var342 = class185.field2698[var6];
                                            String var343 = class169.field2489[var7];
                                            if (var343.length() > 0) {
                                                if (class154.field2253 == null) {
                                                    class154.field2253 = new String[class1.field14[class246.field3836]];
                                                }
                                                class154.field2253[var342] = var343;
                                            }
                                            if (var341.length() > 0) {
                                                if (class269.field4202 == null) {
                                                    class269.field4202 = new String[class1.field14[class246.field3836]];
                                                }
                                                class269.field4202[var342] = var341;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5423) {
                                            var7--;
                                            System.out.println(class169.field2489[var7]);
                                            continue;
                                        }
                                        if (var517 == 5424) {
                                            var6 -= 11;
                                            class112.field1711 = class185.field2698[var6];
                                            class168.field2468 = class185.field2698[var6 + 1];
                                            class22.field364 = class185.field2698[var6 + 2];
                                            class75.field1197 = class185.field2698[var6 + 3];
                                            class251.field3888 = class185.field2698[var6 + 4];
                                            class185.field2705 = class185.field2698[var6 + 5];
                                            class90.field1366 = class185.field2698[var6 + 6];
                                            class103.field1503 = class185.field2698[var6 + 7];
                                            class281.field4317 = class185.field2698[var6 + 8];
                                            class174.field2552 = class185.field2698[var6 + 9];
                                            class285.field4376 = class185.field2698[var6 + 10];
                                            class36.field637.method1629(class251.field3888, arg2 ^ 0xFFFFFFC5);
                                            class36.field637.method1629(class185.field2705, 0);
                                            class36.field637.method1629(class90.field1366, 0);
                                            class36.field637.method1629(class103.field1503, 0);
                                            class36.field637.method1629(class281.field4317, arg2 + 59);
                                            class197.field2979 = true;
                                            continue;
                                        }
                                        if (var517 == 5425) {
                                            class248.method1698(-122);
                                            class197.field2979 = false;
                                            continue;
                                        }
                                        if (var517 == 5426) {
                                            var6--;
                                            class240.field3725 = class185.field2698[var6];
                                            continue;
                                        }
                                        if (var517 == 5427) {
                                            var6 -= 2;
                                            class166.field2454 = class185.field2698[var6];
                                            class152.field2223 = class185.field2698[var6 + 1];
                                            continue;
                                        }
                                        if (var517 == 5428) {
                                            var6 -= 2;
                                            int var344 = class185.field2698[var6 + 1];
                                            int var345 = class185.field2698[var6];
                                            class185.field2698[var6++] = class198.method1326(var344, 19581, var345) ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var517 < 5600) {
                                        if (var517 == 5500) {
                                            var6 -= 4;
                                            int var282 = class185.field2698[var6];
                                            int var283 = class185.field2698[var6 + 1];
                                            int var284 = class185.field2698[var6 + 2];
                                            int var285 = class185.field2698[var6 + 3];
                                            class124.method874(var283, ((var282 & 0xFFFF2A8) >> 14) - class90.field1367, var284, (byte) 82, var285, false, (var282 & 0x3FFF) - class188.field2774);
                                            continue;
                                        }
                                        if (var517 == 5501) {
                                            var6 -= 4;
                                            int var286 = class185.field2698[var6 + 1];
                                            int var287 = class185.field2698[var6];
                                            int var288 = class185.field2698[var6 + 2];
                                            int var289 = class185.field2698[var6 + 3];
                                            class61.method504(var288, var286, var289, (var287 & 0x3FFF) - class188.field2774, arg2 + -44, (var287 >> 14 & 0x3FFF) - class90.field1367);
                                            continue;
                                        }
                                        if (var517 == 5502) {
                                            var6 -= 6;
                                            int var290 = class185.field2698[var6];
                                            if (var290 >= 2) {
                                                throw new RuntimeException();
                                            }
                                            class27.field527 = var290;
                                            int var291 = class185.field2698[var6 + 1];
                                            if ((class240.field3735[class27.field527].length >> 1) <= (var291 + 1)) {
                                                throw new RuntimeException();
                                            }
                                            class260.field3991 = 0;
                                            class217.field3337 = var291;
                                            class277.field4267 = class185.field2698[var6 + 2];
                                            class146.field2124 = class185.field2698[var6 + 3];
                                            int var292 = class185.field2698[var6 + 4];
                                            if (var292 >= 2) {
                                                throw new RuntimeException();
                                            }
                                            class172.field2518 = var292;
                                            int var293 = class185.field2698[var6 + 5];
                                            if ((var293 + 1) >= (class240.field3735[class172.field2518].length >> 1)) {
                                                throw new RuntimeException();
                                            }
                                            class216.field3317 = var293;
                                            class133.field1954 = 3;
                                            continue;
                                        }
                                        if (var517 == 5503) {
                                            class30.method210(true);
                                            continue;
                                        }
                                        if (var517 == 5504) {
                                            var6 -= 2;
                                            class137.method932(class185.field2698[var6], class185.field2698[var6 + 1], arg2 + 56);
                                            continue;
                                        }
                                        if (var517 == 5505) {
                                            class185.field2698[var6++] = (int) class281.field4313;
                                            continue;
                                        }
                                        if (var517 == 5506) {
                                            class185.field2698[var6++] = (int) class89.field1349;
                                            continue;
                                        }
                                        if (var517 == 5507) {
                                            class277.method1848(125);
                                            continue;
                                        }
                                        if (var517 == 5508) {
                                            class102.method747(arg2 ^ 0xFFFFFFA6);
                                            continue;
                                        }
                                        if (var517 == 5509) {
                                            class7.method60(8);
                                            continue;
                                        }
                                        if (var517 == 5510) {
                                            class39.method312(20717);
                                            continue;
                                        }
                                        if (var517 == 5512) {
                                            class297.method1973(-1);
                                            continue;
                                        }
                                    } else if (var517 < 5700) {
                                        if (var517 == 5600) {
                                            var7 -= 2;
                                            String var320 = class169.field2489[var7];
                                            String var321 = class169.field2489[var7 + 1];
                                            var6--;
                                            int var322 = class185.field2698[var6];
                                            if (class42.field742 == 10 && class234.field3605 == 0 && class73.field1190 == 0 && class256.field3944 == 0 && class261.field4019 == 0) {
                                                class109.method790(var321, var320, var322, arg2 ^ 0xFFFFFFC5);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5601) {
                                            class42.method343((byte) 25);
                                            continue;
                                        }
                                        if (var517 == 5602) {
                                            if (class73.field1190 == 0) {
                                                class147.field2132 = -2;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5603) {
                                            var6 -= 4;
                                            if (class42.field742 == 10 && class234.field3605 == 0 && class73.field1190 == 0 && class256.field3944 == 0 && class261.field4019 == 0) {
                                                class210.method1382(class185.field2698[var6 + 3], class185.field2698[var6], class185.field2698[var6 + 2], 0, class185.field2698[var6 + 1]);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5604) {
                                            var7--;
                                            if (class42.field742 == 10 && class234.field3605 == 0 && class73.field1190 == 0 && class256.field3944 == 0 && class261.field4019 == 0) {
                                                class218.method1468(class37.method286(arg2 ^ 0xFFFF9E30, class169.field2489[var7]), arg2 ^ 0xFFFFFF45);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5605) {
                                            var6 -= 7;
                                            var7 -= 3;
                                            if (class42.field742 == 10 && class234.field3605 == 0 && class73.field1190 == 0 && class256.field3944 == 0 && class261.field4019 == 0) {
                                                class146.method999(class185.field2698[var6 + 5] == 1, class185.field2698[var6 + 1], class185.field2698[var6 + 6] == 1, class169.field2489[var7 + 2], class169.field2489[var7 + 1], -9233, ~class185.field2698[var6 + 4] == -2, class185.field2698[var6 + 3], class185.field2698[var6 + 2], class37.method286(arg2 + 25136, class169.field2489[var7]), class185.field2698[var6]);
                                            }
                                            continue;
                                        }
                                        if (var517 == 5606) {
                                            if (class256.field3944 == 0) {
                                                class164.field2398 = -2;
                                            }
                                            continue;
                                        }
                                        if (var517 == 5607) {
                                            class185.field2698[var6++] = class147.field2132;
                                            continue;
                                        }
                                        if (var517 == 5608) {
                                            class185.field2698[var6++] = class39.field693;
                                            continue;
                                        }
                                        if (var517 == 5609) {
                                            class185.field2698[var6++] = class164.field2398;
                                            continue;
                                        }
                                        if (var517 == 5610) {
                                            for (int var323 = 0; var323 < 5; var323++) {
                                                class169.field2489[var7++] = class168.field2475.length <= var323 ? "" : class186.method1211(3, class168.field2475[var323]);
                                            }
                                            class168.field2475 = null;
                                            continue;
                                        }
                                        if (var517 == 5611) {
                                            class185.field2698[var6++] = class152.field2225;
                                            continue;
                                        }
                                    } else if (var517 < 6100) {
                                        if (var517 == 6001) {
                                            var6--;
                                            int var294 = class185.field2698[var6];
                                            if (var294 < 1) {
                                                var294 = 1;
                                            }
                                            if (var294 > 4) {
                                                var294 = 4;
                                            }
                                            class176.field2585 = var294;
                                            if (class176.field2585 == 1) {
                                                class119.method852(0.9F);
                                            }
                                            if (class176.field2585 == 2) {
                                                class119.method852(0.8F);
                                            }
                                            if (class176.field2585 == 3) {
                                                class119.method852(0.7F);
                                            }
                                            if (class176.field2585 == 4) {
                                                class119.method852(0.6F);
                                            }
                                            class47.method372(33);
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6002) {
                                            var6--;
                                            class206.method1362((byte) -102, class185.field2698[var6] == 1);
                                            class159.method1076((byte) 92);
                                            class284.method1893((byte) -102);
                                            class267.method1809(29835);
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6003) {
                                            var6--;
                                            class244.field3785 = class185.field2698[var6] == 1;
                                            class267.method1809(29835);
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6005) {
                                            var6--;
                                            class127.field1867 = class185.field2698[var6] == 1;
                                            class284.method1893((byte) -105);
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6006) {
                                            var6--;
                                            field3869 = class185.field2698[var6] == 1;
                                            ((class275) class119.field1790).method1839(arg2 - 67, !field3869);
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6007) {
                                            var6--;
                                            class126.field1856 = class185.field2698[var6] == 1;
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6008) {
                                            var6--;
                                            class10.field145 = class185.field2698[var6] == 1;
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6009) {
                                            var6--;
                                            class17.field312 = class185.field2698[var6] == 1;
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6010) {
                                            var6--;
                                            class134.field1967 = class185.field2698[var6] == 1;
                                            class58.method479(class217.field3338, arg2 ^ 0xDF);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6011) {
                                            var6--;
                                            int var295 = class185.field2698[var6];
                                            if (var295 < 0 || var295 > 2) {
                                                var295 = 0;
                                            }
                                            class233.field3602 = var295;
                                            class58.method479(class217.field3338, arg2 - 171);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6012) {
                                            var6--;
                                            class54.field879 = class185.field2698[var6] == 1;
                                            if (class176.field2585 == 1) {
                                                class119.method852(0.9F);
                                            }
                                            if (class176.field2585 == 2) {
                                                class119.method852(0.8F);
                                            }
                                            if (class176.field2585 == 3) {
                                                class119.method852(0.7F);
                                            }
                                            if (class176.field2585 == 4) {
                                                class119.method852(0.6F);
                                            }
                                            class284.method1893((byte) -119);
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6014) {
                                            var6--;
                                            class109.field1628 = class185.field2698[var6] == 1;
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6015) {
                                            var6--;
                                            class241.field3755 = class185.field2698[var6] == 1;
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6016) {
                                            var6--;
                                            int var296 = class185.field2698[var6];
                                            if (var296 < 0 || var296 > 2) {
                                                var296 = 0;
                                            }
                                            client.field715 = var296;
                                            continue;
                                        }
                                        if (var517 == 6017) {
                                            var6--;
                                            class25.field431 = class185.field2698[var6] == 1;
                                            class66.method531((byte) 105);
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6018) {
                                            var6--;
                                            int var297 = class185.field2698[var6];
                                            if (var297 < 0) {
                                                var297 = 0;
                                            }
                                            if (var297 > 127) {
                                                var297 = 127;
                                            }
                                            class112.field1719 = var297;
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6019) {
                                            var6--;
                                            int var298 = class185.field2698[var6];
                                            if (var298 < 0) {
                                                var298 = 0;
                                            }
                                            if (var298 > 255) {
                                                var298 = 255;
                                            }
                                            if (class188.field2789 != var298) {
                                                if (class188.field2789 == 0 && class175.field2558 != -1) {
                                                    class67.method534((byte) -123, var298, false, class220.field3404, 0, class175.field2558);
                                                    class233.field3601 = false;
                                                } else if (var298 == 0) {
                                                    class258.method1737((byte) 109);
                                                    class233.field3601 = false;
                                                } else {
                                                    class237.method1631(-1, var298);
                                                }
                                                class188.field2789 = var298;
                                            }
                                            class58.method479(class217.field3338, arg2 ^ 0xDF);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6020) {
                                            var6--;
                                            int var299 = class185.field2698[var6];
                                            if (var299 < 0) {
                                                var299 = 0;
                                            }
                                            if (var299 > 127) {
                                                var299 = 127;
                                            }
                                            class194.field2934 = var299;
                                            class58.method479(class217.field3338, arg2 ^ 0xDF);
                                            class107.field1574 = false;
                                            continue;
                                        }
                                        if (var517 == 6021) {
                                            var6--;
                                            class148.field2146 = class185.field2698[var6] == 1;
                                            class267.method1809(29835);
                                            continue;
                                        }
                                        if (var517 == 6023) {
                                            boolean var300 = false;
                                            var6--;
                                            int var301 = class185.field2698[var6];
                                            if (var301 < 0) {
                                                var301 = 0;
                                            }
                                            if (var301 > 2) {
                                                var301 = 2;
                                            }
                                            if (class155.field2270 < 96) {
                                                var301 = 0;
                                                var300 = true;
                                            }
                                            class31.method214(var301);
                                            class58.method479(class217.field3338, -230);
                                            class107.field1574 = false;
                                            class185.field2698[var6++] = var300 ? 0 : 1;
                                            continue;
                                        }
                                        if (var517 == 6024) {
                                            var6--;
                                            int var302 = class185.field2698[var6];
                                            if (var302 < 0 || var302 > 2) {
                                                var302 = 0;
                                            }
                                            class162.field2350 = var302;
                                            class58.method479(class217.field3338, -230);
                                            continue;
                                        }
                                        if (var517 == 6027) {
                                            var6--;
                                            continue;
                                        }
                                        if (var517 == 6028) {
                                            var6--;
                                            class23.field376 = class185.field2698[var6] != 0;
                                            class58.method479(class217.field3338, arg2 ^ 0xDF);
                                            continue;
                                        }
                                    } else if (var517 < 6200) {
                                        if (var517 == 6101) {
                                            class185.field2698[var6++] = class176.field2585;
                                            continue;
                                        }
                                        if (var517 == 6102) {
                                            class185.field2698[var6++] = class101.method741(-6425) ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6103) {
                                            class185.field2698[var6++] = class244.field3785 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6105) {
                                            class185.field2698[var6++] = class127.field1867 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6106) {
                                            class185.field2698[var6++] = field3869 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6107) {
                                            class185.field2698[var6++] = class126.field1856 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6108) {
                                            class185.field2698[var6++] = class10.field145 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6109) {
                                            class185.field2698[var6++] = class17.field312 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6110) {
                                            class185.field2698[var6++] = class134.field1967 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6111) {
                                            class185.field2698[var6++] = class233.field3602;
                                            continue;
                                        }
                                        if (var517 == 6112) {
                                            class185.field2698[var6++] = class54.field879 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6114) {
                                            class185.field2698[var6++] = class109.field1628 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6115) {
                                            class185.field2698[var6++] = class241.field3755 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6116) {
                                            class185.field2698[var6++] = client.field715;
                                            continue;
                                        }
                                        if (var517 == 6117) {
                                            class185.field2698[var6++] = class25.field431 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6118) {
                                            class185.field2698[var6++] = class112.field1719;
                                            continue;
                                        }
                                        if (var517 == 6119) {
                                            class185.field2698[var6++] = class188.field2789;
                                            continue;
                                        }
                                        if (var517 == 6120) {
                                            class185.field2698[var6++] = class194.field2934;
                                            continue;
                                        }
                                        if (var517 == 6121) {
                                            class185.field2698[var6++] = 0;
                                            continue;
                                        }
                                        if (var517 == 6123) {
                                            class185.field2698[var6++] = class31.method212();
                                            continue;
                                        }
                                        if (var517 == 6124) {
                                            class185.field2698[var6++] = class162.field2350;
                                            continue;
                                        }
                                        if (var517 == 6126) {
                                            class185.field2698[var6++] = 0;
                                            continue;
                                        }
                                        if (var517 == 6127) {
                                            class185.field2698[var6++] = class131.field1939 ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6128) {
                                            class185.field2698[var6++] = class23.field376 ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var517 < 6300) {
                                        if (var517 == 6200) {
                                            var6 -= 2;
                                            class196.field2958 = (short) class185.field2698[var6];
                                            if (class196.field2958 <= 0) {
                                                class196.field2958 = 256;
                                            }
                                            class185.field2685 = (short) class185.field2698[var6 + 1];
                                            if (class185.field2685 <= 0) {
                                                class185.field2685 = 205;
                                            }
                                            continue;
                                        }
                                        if (var517 == 6201) {
                                            var6 -= 2;
                                            class149.field2161 = (short) class185.field2698[var6];
                                            if (class149.field2161 <= 0) {
                                                class149.field2161 = 256;
                                            }
                                            class92.field1387 = (short) class185.field2698[var6 + 1];
                                            if (class92.field1387 <= 0) {
                                                class92.field1387 = 320;
                                            }
                                            continue;
                                        }
                                        if (var517 == 6202) {
                                            var6 -= 4;
                                            class266.field4152 = (short) class185.field2698[var6];
                                            if (class266.field4152 <= 0) {
                                                class266.field4152 = 1;
                                            }
                                            class62.field1035 = (short) class185.field2698[var6 + 1];
                                            if (class62.field1035 <= 0) {
                                                class62.field1035 = 32767;
                                            } else if (class62.field1035 < class266.field4152) {
                                                class62.field1035 = class266.field4152;
                                            }
                                            class9.field118 = (short) class185.field2698[var6 + 2];
                                            if (class9.field118 <= 0) {
                                                class9.field118 = 1;
                                            }
                                            class110.field1666 = (short) class185.field2698[var6 + 3];
                                            if (class110.field1666 <= 0) {
                                                class110.field1666 = 32767;
                                            } else if (class9.field118 > class110.field1666) {
                                                class110.field1666 = class9.field118;
                                            }
                                            continue;
                                        }
                                        if (var517 == 6203) {
                                            class224.method1532(0, false, class174.field2550.field4531, 0, class174.field2550.field4627, 0);
                                            class185.field2698[var6++] = class227.field3544;
                                            class185.field2698[var6++] = class1.field25;
                                            continue;
                                        }
                                        if (var517 == 6204) {
                                            class185.field2698[var6++] = class149.field2161;
                                            class185.field2698[var6++] = class92.field1387;
                                            continue;
                                        }
                                        if (var517 == 6205) {
                                            class185.field2698[var6++] = class196.field2958;
                                            class185.field2698[var6++] = class185.field2685;
                                            continue;
                                        }
                                    } else if (var517 < 6400) {
                                        if (var517 == 6300) {
                                            class185.field2698[var6++] = (int) (class257.method1736(arg2 + 14420) / 60000L);
                                            continue;
                                        }
                                        if (var517 == 6301) {
                                            class185.field2698[var6++] = (int) (class257.method1736(14361) / 86400000L) - 11745;
                                            continue;
                                        }
                                        if (var517 == 6302) {
                                            var6 -= 3;
                                            int var315 = class185.field2698[var6];
                                            int var316 = class185.field2698[var6 + 1];
                                            int var317 = class185.field2698[var6 + 2];
                                            class19.field334.clear();
                                            class19.field334.set(11, 12);
                                            class19.field334.set(var317, var316, var315);
                                            class185.field2698[var6++] = (int) (class19.field334.getTime().getTime() / 86400000L) - 11745;
                                            continue;
                                        }
                                        if (var517 == 6303) {
                                            class19.field334.clear();
                                            class19.field334.setTime(new Date(class257.method1736(14361)));
                                            class185.field2698[var6++] = class19.field334.get(1);
                                            continue;
                                        }
                                        if (var517 == 6304) {
                                            var6--;
                                            int var318 = class185.field2698[var6];
                                            boolean var319 = true;
                                            if (var318 < 0) {
                                                var319 = ((var318 + 1) % 4) == 0;
                                            } else if (var318 < 1582) {
                                                var319 = (var318 % 4) == 0;
                                            } else if ((var318 % 4) != 0) {
                                                var319 = false;
                                            } else if (var318 % 100 != 0) {
                                                var319 = true;
                                            } else if ((var318 % 400) != 0) {
                                                var319 = false;
                                            }
                                            class185.field2698[var6++] = var319 ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var517 < 6500) {
                                        if (var517 == 6405) {
                                            class185.field2698[var6++] = class109.method789(-20332) ? 1 : 0;
                                            continue;
                                        }
                                        if (var517 == 6406) {
                                            class185.field2698[var6++] = class14.method94(true) ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var517 < 6600) {
                                        if (var517 == 6500) {
                                            if (class42.field742 == 10 && class234.field3605 == 0 && class73.field1190 == 0 && class256.field3944 == 0) {
                                                class185.field2698[var6++] = class76.method607(arg2 + 142) == -1 ? 0 : 1;
                                                continue;
                                            }
                                            class185.field2698[var6++] = 1;
                                            continue;
                                        }
                                        if (var517 == 6501) {
                                            class293 var303 = class152.method1036((byte) -117);
                                            if (var303 == null) {
                                                class185.field2698[var6++] = -1;
                                                class185.field2698[var6++] = 0;
                                                class169.field2489[var7++] = "";
                                                class185.field2698[var6++] = 0;
                                                class169.field2489[var7++] = "";
                                                class185.field2698[var6++] = 0;
                                            } else {
                                                class185.field2698[var6++] = var303.field4444;
                                                class185.field2698[var6++] = var303.field2276;
                                                class169.field2489[var7++] = var303.field4446;
                                                class247 var304 = var303.method1933(29290);
                                                class185.field2698[var6++] = var304.field3846;
                                                class169.field2489[var7++] = var304.field3840;
                                                class185.field2698[var6++] = var303.field2275;
                                            }
                                            continue;
                                        }
                                        if (var517 == 6502) {
                                            class293 var305 = class245.method1673(arg2 ^ 0xFFFFFFC5);
                                            if (var305 == null) {
                                                class185.field2698[var6++] = -1;
                                                class185.field2698[var6++] = 0;
                                                class169.field2489[var7++] = "";
                                                class185.field2698[var6++] = 0;
                                                class169.field2489[var7++] = "";
                                                class185.field2698[var6++] = 0;
                                            } else {
                                                class185.field2698[var6++] = var305.field4444;
                                                class185.field2698[var6++] = var305.field2276;
                                                class169.field2489[var7++] = var305.field4446;
                                                class247 var306 = var305.method1933(29290);
                                                class185.field2698[var6++] = var306.field3846;
                                                class169.field2489[var7++] = var306.field3840;
                                                class185.field2698[var6++] = var305.field2275;
                                            }
                                            continue;
                                        }
                                        if (var517 == 6503) {
                                            var6--;
                                            int var307 = class185.field2698[var6];
                                            if (class42.field742 == 10 && class234.field3605 == 0 && class73.field1190 == 0 && class256.field3944 == 0) {
                                                class185.field2698[var6++] = class267.method1808(var307, false) ? 1 : 0;
                                                continue;
                                            }
                                            class185.field2698[var6++] = 0;
                                            continue;
                                        }
                                        if (var517 == 6504) {
                                            var6--;
                                            class142.field2039 = class185.field2698[var6];
                                            class58.method479(class217.field3338, -230);
                                            continue;
                                        }
                                        if (var517 == 6505) {
                                            class185.field2698[var6++] = class142.field2039;
                                            continue;
                                        }
                                        if (var517 == 6506) {
                                            var6--;
                                            int var308 = class185.field2698[var6];
                                            class293 var309 = class149.method1013(var308, true);
                                            if (var309 == null) {
                                                class185.field2698[var6++] = -1;
                                                class169.field2489[var7++] = "";
                                                class185.field2698[var6++] = 0;
                                                class169.field2489[var7++] = "";
                                                class185.field2698[var6++] = 0;
                                            } else {
                                                class185.field2698[var6++] = var309.field2276;
                                                class169.field2489[var7++] = var309.field4446;
                                                class247 var310 = var309.method1933(29290);
                                                class185.field2698[var6++] = var310.field3846;
                                                class169.field2489[var7++] = var310.field3840;
                                                class185.field2698[var6++] = var309.field2275;
                                            }
                                            continue;
                                        }
                                        if (var517 == 6507) {
                                            var6 -= 4;
                                            int var311 = class185.field2698[var6];
                                            boolean var312 = class185.field2698[var6 + 1] == 1;
                                            int var313 = class185.field2698[var6 + 2];
                                            boolean var314 = class185.field2698[var6 + 3] == 1;
                                            class214.method1443(var314, 1, var313, var312, var311);
                                            continue;
                                        }
                                    } else if (var517 < 6700) {
                                        if (var517 == 6600) {
                                            var6--;
                                            class117.field1767 = class185.field2698[var6] == 1;
                                            class58.method479(class217.field3338, arg2 ^ 0xDF);
                                            continue;
                                        }
                                        if (var517 == 6601) {
                                            class185.field2698[var6++] = class117.field1767 ? 1 : 0;
                                            continue;
                                        }
                                    }
                                } else if (var517 == 4500) {
                                    var6 -= 2;
                                    int var411 = class185.field2698[var6 + 1];
                                    int var412 = class185.field2698[var6];
                                    class260 var413 = class77.method612(var411, 11);
                                    if (var413.method1756(115)) {
                                        class169.field2489[var7++] = class85.method654((byte) 35, var412).method925(113, var411, var413.field4001);
                                    } else {
                                        class185.field2698[var6++] = class85.method654((byte) 35, var412).method919(var413.field3997, var411, (byte) 126);
                                    }
                                    continue;
                                }
                            } else if (var517 == 4400) {
                                var6 -= 2;
                                int var414 = class185.field2698[var6 + 1];
                                int var415 = class185.field2698[var6];
                                class260 var416 = class77.method612(var414, 11);
                                if (var416.method1756(115)) {
                                    class169.field2489[var7++] = class3.method42(class226.method1551(arg2, 67), var415).method1242(var416.field4001, var414, -125);
                                } else {
                                    class185.field2698[var6++] = class3.method42(class226.method1551(arg2, 28), var415).method1246(-89, var414, var416.field3997);
                                }
                                continue;
                            }
                        } else if (var517 == 4300) {
                            var6 -= 2;
                            int var417 = class185.field2698[var6];
                            int var418 = class185.field2698[var6 + 1];
                            class260 var419 = class77.method612(var418, 11);
                            if (var419.method1756(115)) {
                                class169.field2489[var7++] = class114.method820((byte) -62, var417).method1266(var419.field4001, var418, (byte) 101);
                            } else {
                                class185.field2698[var6++] = class114.method820((byte) -62, var417).method1259(false, var418, var419.field3997);
                            }
                            continue;
                        }
                    }
                } else {
                    class297 var496;
                    if (var517 >= 2000) {
                        var517 -= 1000;
                        var6--;
                        var496 = class151.method1023(-30464, class185.field2698[var6]);
                    } else {
                        var496 = var46 ? class87.field1324 : class248.field3854;
                    }
                    if (var517 == 1300) {
                        var6--;
                        int var497 = class185.field2698[var6] - 1;
                        if (var497 >= 0 && var497 <= 9) {
                            var10001 = arg2 + 59;
                            var7--;
                            var496.method1977(var10001, class169.field2489[var7], var497);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var517 == 1301) {
                        var6 -= 2;
                        int var498 = class185.field2698[var6];
                        int var499 = class185.field2698[var6 + 1];
                        var496.field4664 = class237.method1617(var499, (byte) 63, var498);
                        continue;
                    }
                    if (var517 == 1302) {
                        var6--;
                        var496.field4591 = class185.field2698[var6] == 1;
                        continue;
                    }
                    if (var517 == 1303) {
                        var6--;
                        var496.field4681 = class185.field2698[var6];
                        continue;
                    }
                    if (var517 == 1304) {
                        var6--;
                        var496.field4534 = class185.field2698[var6];
                        continue;
                    }
                    if (var517 == 1305) {
                        var7--;
                        var496.field4628 = class169.field2489[var7];
                        continue;
                    }
                    if (var517 == 1306) {
                        var7--;
                        var496.field4539 = class169.field2489[var7];
                        continue;
                    }
                    if (var517 == 1307) {
                        var496.field4609 = null;
                        continue;
                    }
                    if (var517 == 1308) {
                        var6--;
                        var496.field4611 = class185.field2698[var6];
                        var6--;
                        var496.field4630 = class185.field2698[var6];
                        continue;
                    }
                    if (var517 == 1309) {
                        var6--;
                        int var500 = class185.field2698[var6];
                        var6--;
                        int var501 = class185.field2698[var6];
                        if (var501 >= 1 && var501 <= 10) {
                            var496.method1986((byte) 102, var501 - 1, var500);
                        }
                        continue;
                    }
                    if (var517 == 1310) {
                        var7--;
                        var496.field4548 = class169.field2489[var7];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var516) {
            if (var5.field2130 == null) {
                if (class146.field2119 != 0) {
                    class260.method1759(0, "", 128, "Clientscript error - check log for details");
                }
                class121.method860((byte) 53, "CS2 - scr:" + var5.field2628 + " op:" + var10, var516);
            } else {
                StringBuffer var513 = new StringBuffer(30);
                var513.append("%0a - in: ").append(var5.field2130);
                for (int var514 = class177.field2593 - 1; var514 >= 0; var514--) {
                    var513.append("%0a - via: ").append(class194.field2930[var514].field1852.field2130);
                }
                if (var10 == 40) {
                    int var515 = var11[var8];
                    var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                }
                if (class146.field2119 != 0) {
                    class260.method1759(0, "", 128, "Clientscript error in: " + var5.field2130);
                }
                class121.method860((byte) 30, "CS2 - scr:" + var5.field2628 + " op:" + var10 + var513.toString(), var516);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public abstract void method696(int arg0, int arg1, Graphics arg2, boolean arg3);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3865++;
        if (arg4 != 18602) {
            field3867 = (char) 65481;
        }
        if (arg7 < 128 || arg1 < 128 || arg7 > 13056 || arg1 > 13056) {
            class125.field1845 = -1;
            class224.field3479 = -1;
            return;
        }
        int var8 = class268.method1810(class260.field3986, arg7, (byte) 118, arg1) - arg2;
        int var9 = arg1 - class209.field3127;
        int var10 = class119.field1774[class254.field3919];
        int var11 = var8 - class157.field2292;
        int var12 = arg7 - class90.field1377;
        int var13 = class119.field1776[class254.field3919];
        int var14 = class119.field1774[class205.field3074];
        int var15 = class119.field1776[class205.field3074];
        int var16 = var9 * var14 + var12 * var15 >> 16;
        int var17 = var9 * var15 - (var12 * var14) >> 16;
        int var19 = var11 * var13 - (var10 * var17) >> 16;
        int var20 = var10 * var11 + (var13 * var17) >> 16;
        if (var20 >= 50) {
            class125.field1845 = (var19 << 9) / var20 + arg5;
            class224.field3479 = (var16 << 9) / var20 + arg0;
        } else {
            class125.field1845 = -1;
            class224.field3479 = -1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final void method1703(int arg0) {
        class72.method557(this.field3861, this.field3863, this.field3856);
        field3860++;
        if (arg0 != 5061) {
            field3866 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method1704(byte arg0) {
        field3866 = null;
        if (arg0 != -81) {
            method1701((class43) null, -99, (byte) 41);
        }
        field3868 = null;
        field3864 = null;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    protected class249() {
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public abstract void method695(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5);
}
