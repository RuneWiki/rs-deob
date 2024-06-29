import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class74 extends class62 {

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public int field1648 = 2;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public int field1654 = -1;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public int field1656 = -1;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
    public int field1661 = 99;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public int field1660 = -1;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
    public int field1665 = 5;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public int field1657 = -1;

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "Z")
    public boolean field1669 = false;

    @OriginalMember(owner = "client!mb", name = "xb", descriptor = "I")
    public int field1673 = -1;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
    public static int field1666 = 0;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "Z")
    public static boolean field1667 = false;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    public static int field1663 = 0;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "Llc;")
    public static class69 field1651 = class69.method470((byte) -106, "backvmid3");

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lfe;")
    public static class36 field1649 = new class36(64);

    @OriginalMember(owner = "client!mb", name = "yb", descriptor = "Llc;")
    public static class69 field1674 = class69.method470((byte) -104, " with @whi@");

    @OriginalMember(owner = "client!mb", name = "Bb", descriptor = "I")
    public static int field1677 = 0;

    @OriginalMember(owner = "client!mb", name = "zb", descriptor = "[[I")
    public static int[][] field1675 = new int[104][104];

    @OriginalMember(owner = "client!mb", name = "Cb", descriptor = "Llc;")
    public static class69 field1678 = class69.method470((byte) -107, "Welcome to RuneScape");

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!mb", name = "ub", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!mb", name = "wb", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!mb", name = "Ab", descriptor = "Lua;")
    public static class116 field1676;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "[I")
    public int[] field1646;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "[I")
    public int[] field1658;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "[I")
    private int[] field1659;

    @OriginalMember(owner = "client!mb", name = "vb", descriptor = "[I")
    private int[] field1671;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static final void method517(byte arg0) {
        class63.method399(false, -23907);
        field1644++;
        class64.field1350 = 0;
        boolean var1 = true;
        if (arg0 != -83) {
            return;
        }
        for (int var2 = 0; var2 < class67.field1419.length; var2++) {
            if (class68.field1485[var2] != -1 && class67.field1419[var2] == null) {
                class67.field1419[var2] = class106.field2301.method394(class68.field1485[var2], 0, (byte) -46);
                if (class67.field1419[var2] == null) {
                    class64.field1350++;
                    var1 = false;
                }
            }
            if (class93.field2029[var2] != -1 && class19.field416[var2] == null) {
                class19.field416[var2] = class106.field2301.method383(class93.field2029[var2], -10590, 0, class27.field587[var2]);
                if (class19.field416[var2] == null) {
                    class64.field1350++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class78.field1774 = 1;
            return;
        }
        boolean var3 = true;
        class114.field2470 = 0;
        for (int var4 = 0; var4 < class67.field1419.length; var4++) {
            byte[] var56 = class19.field416[var4];
            if (var56 != null) {
                int var57 = (class18.field377[var4] >> 8) * 64 - class33.field648;
                int var58 = (class18.field377[var4] & 0xFF) * 64 - class60.field1234;
                if (class72.field1602) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class56.method353(var57, (byte) -82, var56, var58);
            }
        }
        if (!var3) {
            class78.field1774 = 2;
            return;
        }
        if (class78.field1774 != 0) {
            class72.method512(true, class50.field1092, class3.field62, true);
        }
        class64.method408(93);
        class120.field2562.method970();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class91.field1997[var5].method902(-5148);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class43.field856[var6][var54][var55] = 0;
                }
            }
        }
        class63.method384(true);
        int var7 = class67.field1419.length;
        class63.method399(true, -23907);
        if (!class72.field1602) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class18.field377[var8] >> 8) * 64 - class33.field648;
                int var18 = (class18.field377[var8] & 0xFF) * 64 - class60.field1234;
                byte[] var19 = class67.field1419[var8];
                if (var19 != null) {
                    class75.method532(var18, arg0 ^ 0xFFFFFFD3, var19, class91.field1997, (class90.field1955 - 6) * 8, (class125.field2694 - 6) * 8, var17);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                byte[] var14 = class67.field1419[var9];
                int var15 = (class18.field377[var9] >> 8) * 64 - class33.field648;
                int var16 = (class18.field377[var9] & 0xFF) * 64 - class60.field1234;
                if (var14 == null && class90.field1955 < 800) {
                    class17.method99(64, 64, var15, var16, (byte) -125);
                }
            }
            class63.method399(true, -23907);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class19.field416[var10];
                if (var11 != null) {
                    int var12 = (class18.field377[var10] >> 8) * 64 - class33.field648;
                    int var13 = (class18.field377[var10] & 0xFF) * 64 - class60.field1234;
                    class23.method153(class120.field2562, (byte) 64, var13, var12, class91.field1997, var11);
                }
            }
        }
        if (class72.field1602) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class71.field1594[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class18.field377.length; var43++) {
                                if (class18.field377[var43] == var42 && class67.field1419[var43] != null) {
                                    class49.method317(var39, 0, var34 * 8, var35 * 8, class91.field1997, (var41 & 0x7) * 8, (var40 & 0x7) * 8, var38, class67.field1419[var43], var20);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class6.method33(var20, (byte) -117, var35 * 8, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class71.field1594[0][var21][var32];
                    if (var33 == -1) {
                        class17.method99(8, 8, var21 * 8, var32 * 8, (byte) -127);
                    }
                }
            }
            class63.method399(true, -23907);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class71.field1594[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 14 & 0x3FF;
                            int var28 = var25 >> 1 & 0x3;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var27 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < class18.field377.length; var31++) {
                                if (class18.field377[var31] == var30 && class19.field416[var31] != null) {
                                    class30.method192(class19.field416[var31], var23 * 8, var26, var24 * 8, var28, (byte) 104, class91.field1997, (var29 & 0x7) * 8, var22, (var27 & 0x7) * 8, class120.field2562);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class63.method399(true, arg0 ^ 0x5D30);
        class64.method408(94);
        class26.method172((byte) -122, class120.field2562, class91.field1997);
        class63.method399(true, -23907);
        int var44 = class90.field1971;
        if (class71.field1588 < var44) {
            var44 = class71.field1588;
        }
        if (var44 < class71.field1588 - 1) {
            int var45 = class71.field1588 - 1;
        }
        if (class13.field264) {
            class120.field2562.method964(class90.field1971);
        } else {
            class120.field2562.method964(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class80.method570(var53, 16537, var46);
            }
        }
        class46.method308(0);
        class6.field110.method220((byte) -116);
        if (class47.field982 != null) {
            class60.field1223++;
            class26.field557.method178(-5, 153);
            class26.field557.method704(1057001181, (byte) 117);
        }
        if (!class72.field1602) {
            int var47 = (class125.field2694 - 6) / 8;
            int var48 = (class125.field2694 + 6) / 8;
            int var49 = (class90.field1955 + 6) / 8;
            int var50 = (class90.field1955 - 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var49 + 1; var52++) {
                    if (var51 < var47 || var48 < var51 || var50 > var52 || var52 > var49) {
                        class106.field2301.method398((byte) -35, class46.method305(20025, new class69[] { class76.field1710, class106.method791(var51, (byte) -77), class26.field567, class106.method791(var52, (byte) -62) }));
                        class106.field2301.method398((byte) -113, class46.method305(20025, new class69[] { class53.field1143, class106.method791(var51, (byte) -91), class26.field567, class106.method791(var52, (byte) -49) }));
                    }
                }
            }
        }
        if (class22.field469 == -1) {
            class89.method626(30, (byte) 112);
        } else {
            class89.method626(35, (byte) 112);
        }
        class25.method168(arg0 + 1107);
        class26.field557.method178(-5, 91);
        class78.method559((byte) -126);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIILhb;)Lhb;")
    public final class44 method518(int arg0, int arg1, int arg2, class44 arg3) {
        field1653++;
        if (arg2 > -78) {
            return null;
        }
        int var5 = this.field1646[arg1];
        class49 var6 = class89.method627((byte) 21, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method265(true);
        }
        class44 var8 = arg3.method265(!var6.method319(var7, -102));
        int var9 = arg0 & 0x3;
        if (var9 == 1) {
            var8.method266();
        } else if (var9 == 2) {
            var8.method271();
        } else if (var9 == 3) {
            var8.method264();
        }
        var8.method276(var6, var7);
        if (var9 == 1) {
            var8.method264();
        } else if (var9 == 2) {
            var8.method271();
        } else if (var9 == 3) {
            var8.method266();
        }
        return var8;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    public static final void method519(int arg0) {
        if (arg0 != -28405) {
            method519(36);
        }
        field1647++;
        if (class128.field2748 == 0) {
            class120.field2562 = new class129(4, 104, 104, class22.field451);
            for (int var1 = 0; var1 < 4; var1++) {
                class91.field1997[var1] = new class122(104, 104);
            }
            class121.field2612 = new class20(512, 512);
            class128.field2748 = 20;
            class24.field504 = 5;
            class93.field2046 = class90.field1973;
        } else if (class128.field2748 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class117.field2527[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class129.method980(var2, 500, 800, 512, 334);
            class24.field504 = 10;
            class128.field2748 = 25;
            class93.field2046 = class19.field418;
        } else {
            try {
                if (class128.field2748 == 25) {
                    if (class27.field568 != null && class104.field2278 != null && class104.field2278.method924(-5655) < 60000L) {
                        class54.field1154 = new class57[5];
                        for (int var7 = 0; var7 < 5; var7++) {
                            class54.field1154[var7] = new class57(var7 + 1, class27.field568, class82.field1850[var7], 500000);
                        }
                        class46.field972 = new class57[12];
                        for (int var8 = 0; var8 < 12; var8++) {
                            class46.field972[var8] = new class57(var8, class104.field2278, class36.field735[var8], 500000);
                        }
                        class93.field2046 = class70.field1548;
                        class39.field758 = 0;
                        class24.field504 = 15;
                        class128.field2748 = 26;
                        return;
                    }
                    class128.field2748 = 30;
                    class24.field504 = 15;
                    class93.field2046 = class122.field2642;
                    return;
                }
                if (class128.field2748 == 26) {
                    while (class39.field758 < 65535) {
                        class47.method313(class54.field1154[1], class39.field758++, class46.field972[7], -123);
                        if ((class39.field758 & 0xFF) == 0) {
                            class93.field2046 = class46.method305(arg0 ^ 0xFFFFDF32, new class69[] { client.field392, class106.method791(class39.field758 * 100 / 65536, (byte) -89), class123.field2676 });
                            class24.field504 = 15;
                            return;
                        }
                    }
                    class128.field2748 = 27;
                    class24.field504 = 15;
                    class93.field2046 = class19.field420;
                    class39.field758 = 0;
                    return;
                }
                if (class128.field2748 == 27) {
                    while (class39.field758 < 65535) {
                        class47.method313(class54.field1154[3], class39.field758++, class46.field972[6], -116);
                        if ((class39.field758 & 0xFF) == 0) {
                            class93.field2046 = class46.method305(20025, new class69[] { class50.field1055, class106.method791(class39.field758 * 100 / 65536, (byte) -80), class123.field2676 });
                            class24.field504 = 15;
                            return;
                        }
                    }
                    class24.field504 = 15;
                    class39.field758 = 0;
                    class93.field2046 = class43.field859;
                    class128.field2748 = 28;
                    return;
                }
                if (class128.field2748 == 28) {
                    while (class39.field758 < 65535) {
                        class47.method313(class54.field1154[4], class39.field758++, class46.field972[5], -120);
                        if ((class39.field758 & 0xFF) == 0) {
                            class93.field2046 = class46.method305(20025, new class69[] { class71.field1574, class106.method791(class39.field758 * 100 / 65536, (byte) -77), class123.field2676 });
                            class24.field504 = 15;
                            return;
                        }
                    }
                    class24.field504 = 15;
                    class93.field2046 = class67.field1407;
                    class128.field2748 = 30;
                    return;
                }
            } catch (Exception var35) {
                if (class128.field2748 < 30) {
                    class128.field2748 = 30;
                }
            }
            if (class128.field2748 == 30) {
                class106.field2303 = class68.method454(false, 0, arg0 + 6190, true);
                class77.field1728 = class68.method454(false, 1, -22215, true);
                class94.field2065 = class68.method454(true, 2, arg0 ^ 0x3832, false);
                class42.field840 = class68.method454(false, 3, arg0 ^ 0x3832, true);
                class68.field1452 = class68.method454(false, 4, -22215, true);
                class106.field2301 = class68.method454(true, 5, -22215, true);
                class27.field570 = class68.method454(true, 6, -22215, true);
                class81.field1833 = class68.method454(false, 7, -22215, true);
                class16.field315 = class68.method454(false, 8, -22215, true);
                class67.field1421 = class68.method454(false, 9, -22215, true);
                class46.field958 = class68.method454(false, 10, arg0 ^ 0x3832, true);
                class35.field693 = class68.method454(false, 11, arg0 ^ 0x3832, true);
                class24.field504 = 20;
                class93.field2046 = class53.field1145;
                class92.method646(null, class93.field2046, 2, class24.field504);
                class128.field2748 = 40;
            } else if (class128.field2748 == 40) {
                byte var9 = 0;
                int var10 = var9 + class106.field2303.method93(-23740) * 5 / 100;
                int var11 = var10 + class77.field1728.method93(-23740) * 5 / 100;
                int var12 = var11 + class94.field2065.method93(-23740) * 5 / 100;
                int var13 = var12 + class42.field840.method93(-23740) * 5 / 100;
                int var14 = var13 + class68.field1452.method93(arg0 + 4665) * 5 / 100;
                int var15 = var14 + class106.field2301.method93(-23740) * 5 / 100;
                int var16 = var15 + class27.field570.method93(-23740) * 5 / 100;
                int var17 = var16 + class81.field1833.method93(-23740) * 45 / 100;
                int var18 = var17 + class16.field315.method93(-23740) * 5 / 100;
                int var19 = var18 + class67.field1421.method93(-23740) * 5 / 100;
                int var20 = var19 + class46.field958.method93(arg0 ^ 0x324F) * 5 / 100;
                int var21 = var20 + class35.field693.method93(-23740) * 5 / 100;
                if (var21 == 100) {
                    class94.field2065.method94(true, arg0 + 38570);
                    class106.field2303.method94(false, 10165);
                    class77.field1728.method94(false, 10165);
                    class42.field840.method94(false, 10165);
                    class68.field1452.method94(false, 10165);
                    class106.field2301.method94(false, arg0 + 38570);
                    class81.field1833.method94(false, 10165);
                    class16.field315.method94(false, 10165);
                    class67.field1421.method94(false, 10165);
                    class46.field958.method94(false, 10165);
                    class35.field693.method94(false, 10165);
                    class93.field2046 = class87.field1922;
                    class24.field504 = 30;
                    class128.field2748 = 45;
                } else {
                    class93.field2046 = class46.method305(arg0 ^ 0xFFFFDF32, new class69[] { class107.field2340, class106.method791(var21, (byte) -94), class123.field2676 });
                    class24.field504 = 30;
                }
            } else if (class128.field2748 == 45) {
                class51.method336(0, (byte) 118, class64.field1358);
                class57.field1203 = class104.method781(16547, class64.field1358, class83.method597((byte) -51));
                class54.field1147 = new class90(22050, class35.field710);
                class24.field504 = 35;
                class93.field2046 = class50.field1049;
                class128.field2748 = 50;
            } else if (class128.field2748 == 50) {
                int var22 = 0;
                if (class36.field733 == null) {
                    class36.field733 = class98.method743((byte) -62, class16.field315, class49.field992, class40.field794);
                } else {
                    var22++;
                }
                if (class119.field2552 == null) {
                    class119.field2552 = class98.method743((byte) -66, class16.field315, class49.field992, class127.field2742);
                } else {
                    var22++;
                }
                if (class82.field1861 == null) {
                    class82.field1861 = class98.method743((byte) -119, class16.field315, class49.field992, class73.field1631);
                } else {
                    var22++;
                }
                if (class104.field2281 == null) {
                    class104.field2281 = class98.method743((byte) -99, class16.field315, class49.field992, class93.field2035);
                } else {
                    var22++;
                }
                if (var22 < 4) {
                    class93.field2046 = class46.method305(20025, new class69[] { class22.field458, class106.method791(var22 * 100 / 4, (byte) -125), class123.field2676 });
                    class24.field504 = 40;
                } else {
                    class93.field2046 = class87.field1924;
                    class128.field2748 = 60;
                    class24.field504 = 40;
                    class16.field299 = new class45[] { class36.field733, class119.field2552, class82.field1861, class104.field2281 };
                }
            } else if (class128.field2748 == 60) {
                int var23 = class56.method350(class46.field958, class16.field315, -124);
                int var24 = class22.method141(arg0 + 28381);
                if (var24 > var23) {
                    class93.field2046 = class46.method305(arg0 + 48430, new class69[] { class30.field633, class106.method791(var23 * 100 / var24, (byte) -120), class123.field2676 });
                    class24.field504 = 50;
                } else {
                    class93.field2046 = class35.field705;
                    class24.field504 = 50;
                    class89.method626(5, (byte) 112);
                    class128.field2748 = 70;
                }
            } else if (class128.field2748 == 70) {
                if (class94.field2065.method396(0)) {
                    class81.method587(class94.field2065, (byte) -53);
                    class112.method825((byte) -55, class94.field2065);
                    class108.method808(3, class81.field1833, class94.field2065);
                    class69.method488(class13.field264, class81.field1833, (byte) 29, class94.field2065);
                    class110.method818(class81.field1833, -1, class94.field2065);
                    class81.method586(class94.field2065, class81.field1833, 146, class75.field1685);
                    class56.method352((byte) -110, class94.field2065, class106.field2303, class77.field1728);
                    class27.method182(class94.field2065, class81.field1833, -5);
                    class127.method934(class94.field2065, (byte) 101);
                    class18.method103((byte) -68, class94.field2065);
                    class85.method604(class42.field840, class16.field315, 3, class81.field1833);
                    class24.field504 = 60;
                    class93.field2046 = class106.field2309;
                    class128.field2748 = 80;
                } else {
                    class93.field2046 = class46.method305(20025, new class69[] { class85.field1904, class106.method791(class94.field2065.method88((byte) 44), (byte) -83), class123.field2676 });
                    class24.field504 = 60;
                }
            } else if (class128.field2748 == 80) {
                int var25 = 0;
                if (class22.field463 == null) {
                    class22.field463 = class56.method349(class16.field315, (byte) 38, class56.field1181, class49.field992);
                } else {
                    var25++;
                }
                if (class46.field961 == null) {
                    class46.field961 = class56.method349(class16.field315, (byte) 38, class16.field304, class49.field992);
                } else {
                    var25++;
                }
                if (class64.field1339 == null) {
                    class64.field1339 = class63.method393(class49.field992, true, class11.field235, class16.field315);
                } else {
                    var25++;
                }
                if (class55.field1165 == null) {
                    class55.field1165 = class108.method803(class16.field315, class49.field992, -1, class78.field1775);
                } else {
                    var25++;
                }
                if (class16.field314 == null) {
                    class16.field314 = class108.method803(class16.field315, class49.field992, -1, class16.field300);
                } else {
                    var25++;
                }
                if (class53.field1139 == null) {
                    class53.field1139 = class108.method803(class16.field315, class49.field992, -1, class72.field1618);
                } else {
                    var25++;
                }
                if (class69.field1537 == null) {
                    class69.field1537 = class108.method803(class16.field315, class49.field992, -1, class64.field1353);
                } else {
                    var25++;
                }
                if (class49.field1010 == null) {
                    class49.field1010 = class108.method803(class16.field315, class49.field992, -1, class23.field474);
                } else {
                    var25++;
                }
                if (class49.field994 == null) {
                    class49.field994 = class56.method349(class16.field315, (byte) 38, class94.field2087, class49.field992);
                } else {
                    var25++;
                }
                if (class93.field2019 == null) {
                    class93.field2019 = class108.method803(class16.field315, class49.field992, -1, class87.field1925);
                } else {
                    var25++;
                }
                if (class10.field201 == null) {
                    class10.field201 = class108.method803(class16.field315, class49.field992, -1, class50.field1069);
                } else {
                    var25++;
                }
                if (class13.field265 == null) {
                    class13.field265 = class108.method803(class16.field315, class49.field992, arg0 ^ 0x6EF4, class67.field1416);
                } else {
                    var25++;
                }
                if (class122.field2670 == null) {
                    class122.field2670 = class63.method393(class49.field992, true, class122.field2639, class16.field315);
                } else {
                    var25++;
                }
                if (class69.field1540 == null) {
                    class69.field1540 = class63.method393(class49.field992, true, class80.field1827, class16.field315);
                } else {
                    var25++;
                }
                if (var25 < 14) {
                    class93.field2046 = class46.method305(20025, new class69[] { class94.field2112, class106.method791(var25 * 100 / 14, (byte) -108), class123.field2676 });
                    class24.field504 = 70;
                } else {
                    int var26 = (int) (Math.random() * 21.0D) - 10;
                    class46.field961.method134();
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    int var28 = (int) (Math.random() * 21.0D) - 10;
                    int var29 = (int) (Math.random() * 41.0D) - 20;
                    for (int var30 = 0; var30 < class55.field1165.length; var30++) {
                        class55.field1165[var30].method129(var28 + var29, var26 + var29, var27 + var29);
                    }
                    class64.field1339[0].method83(var28 + var29, var26 + var29, var27 + var29);
                    class128.field2748 = 85;
                    class24.field504 = 70;
                    class93.field2046 = class110.field2420;
                }
            } else if (class128.field2748 == 85) {
                int var31 = class92.method648(false, class16.field315);
                int var32 = class77.method550(4);
                if (var31 < var32) {
                    class93.field2046 = class46.method305(20025, new class69[] { class70.field1560, class106.method791(var31 * 100 / var32, (byte) -91), class123.field2676 });
                    class24.field504 = 80;
                } else {
                    class93.field2046 = class62.field1280;
                    class24.field504 = 80;
                    class128.field2748 = 90;
                }
            } else if (class128.field2748 == 90) {
                if (class67.field1421.method396(0)) {
                    class91 var33 = new class91(class67.field1421, class16.field315, 20, 0.8D, class13.field264 ? 64 : 128);
                    class117.method843(var33);
                    class117.method846(0.8D);
                    class93.field2046 = class30.field613;
                    class128.field2748 = 110;
                    class24.field504 = 90;
                } else {
                    class93.field2046 = class46.method305(20025, new class69[] { class17.field336, class106.method791(class67.field1421.method88((byte) -101), (byte) -41), class123.field2676 });
                    class24.field504 = 90;
                }
            } else if (class128.field2748 == 110) {
                client.field385 = new class96();
                class64.field1358.method751(10, client.field385, 114);
                class24.field504 = 94;
                class128.field2748 = 120;
                class93.field2046 = class112.field2436;
            } else if (class128.field2748 == 120) {
                if (class46.field958.method386(class47.field984, -128, class49.field992)) {
                    class87 var34 = new class87(class46.field958.method389(class49.field992, class47.field984, (byte) 49));
                    class71.method507(-119, var34);
                    class24.field504 = 96;
                    class93.field2046 = class66.field1378;
                    class128.field2748 = 130;
                } else {
                    class93.field2046 = class69.field1518;
                    class24.field504 = 96;
                }
            } else if (class128.field2748 == 130) {
                if (class42.field840.method396(arg0 ^ 0xFFFF910B)) {
                    class128.field2748 = 140;
                    class24.field504 = 100;
                    class93.field2046 = class39.field776;
                } else {
                    class93.field2046 = class46.method305(arg0 ^ 0xFFFFDF32, new class69[] { class49.field1011, class106.method791(class42.field840.method88((byte) 115), (byte) -45), class123.field2676 });
                    class24.field504 = 100;
                }
            } else if (class128.field2748 == 140) {
                class89.method626(10, (byte) 112);
                class96.field2133 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lhb;II)Lhb;")
    public final class44 method520(class44 arg0, int arg1, int arg2) {
        field1645++;
        int var4 = this.field1646[arg2];
        class49 var5 = class89.method627((byte) 21, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method265(true);
        }
        int var7 = arg1;
        class49 var8 = null;
        if (this.field1671 != null && this.field1671.length > arg2) {
            int var9 = this.field1671[arg2];
            var8 = class89.method627((byte) 21, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class44 var11 = arg0.method265(!var5.method319(var6, arg1 - 69));
            var11.method276(var5, var6);
            return var11;
        } else {
            class44 var10 = arg0.method265(!var5.method319(var6, -100) & !var8.method319(var7, -122));
            var10.method276(var5, var6);
            var10.method276(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILpd;)V")
    public final void method521(int arg0, class94 arg1) {
        while (true) {
            int var3 = arg1.method703((byte) 82);
            if (var3 == 0) {
                if (arg0 != -27870) {
                    this.field1656 = -105;
                }
                field1670++;
                return;
            }
            this.method528(arg0 + 27859, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lhb;IB)Lhb;")
    public final class44 method522(class44 arg0, int arg1, byte arg2) {
        if (arg2 != 118) {
            this.field1669 = false;
        }
        field1652++;
        int var4 = this.field1646[arg1];
        class49 var5 = class89.method627((byte) 21, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method269(true);
        } else {
            class44 var7 = arg0.method269(!var5.method319(var6, arg2 - 241));
            var7.method276(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
    public static void method523(int arg0) {
        field1649 = null;
        field1676 = null;
        field1674 = null;
        field1678 = null;
        field1651 = null;
        field1675 = null;
        if (arg0 >= 0) {
            field1666 = -29;
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static final void method524(int arg0) {
        class3.field22.method175(20375);
        int var1 = class3.field22.method181(1, 8);
        field1664++;
        if (var1 == 0) {
            return;
        }
        int var2 = class3.field22.method181(2, arg0 ^ 0xFFFF99C5);
        if (var2 == 0) {
            class108.field2410[class77.field1746++] = 2047;
        } else if (var2 == 1) {
            int var3 = class3.field22.method181(3, arg0 ^ 0xFFFF99C5);
            class46.field974.method324(false, var3, (byte) 43);
            int var4 = class3.field22.method181(1, 8);
            if (var4 == 1) {
                class108.field2410[class77.field1746++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class3.field22.method181(3, arg0 + 26171);
            class46.field974.method324(true, var5, (byte) 110);
            int var6 = class3.field22.method181(3, 8);
            class46.field974.method324(true, var6, (byte) -117);
            int var7 = class3.field22.method181(1, arg0 + 26171);
            if (var7 == 1) {
                class108.field2410[class77.field1746++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class3.field22.method181(7, 8);
            class71.field1588 = class3.field22.method181(2, 8);
            int var9 = class3.field22.method181(1, 8);
            if (var9 == 1) {
                class108.field2410[class77.field1746++] = 2047;
            }
            int var10 = class3.field22.method181(1, 8);
            int var11 = class3.field22.method181(7, 8);
            class46.field974.method335(var10 == 1, true, var8, var11);
        } else if (arg0 != -26163) {
            field1655 = 31;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLhb;)Lhb;")
    public final class44 method525(int arg0, boolean arg1, class44 arg2) {
        int var4 = this.field1646[arg0];
        if (arg1) {
            field1663 = 31;
        }
        field1672++;
        class49 var5 = class89.method627((byte) 21, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method265(true);
        } else {
            class44 var7 = arg2.method265(!var5.method319(var6, -76));
            var7.method276(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lmb;ILhb;IB)Lhb;")
    public final class44 method526(class74 arg0, int arg1, class44 arg2, int arg3, byte arg4) {
        field1662++;
        if (arg4 != -12) {
            return null;
        }
        int var6 = this.field1646[arg3];
        class49 var7 = class89.method627((byte) 21, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method525(arg1, false, arg2);
        }
        int var9 = arg0.field1646[arg1];
        class49 var10 = class89.method627((byte) 21, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class44 var12 = arg2.method265(!var7.method319(var8, arg4 - 115));
            var12.method276(var7, var8);
            return var12;
        } else {
            class44 var13 = arg2.method265(!var7.method319(var8, -100) & !var10.method319(var11, -109));
            var13.method261(var7, var8, var10, var11, this.field1659);
            return var13;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
    public final void method527(byte arg0) {
        field1650++;
        if (this.field1673 == -1) {
            if (this.field1659 == null) {
                this.field1673 = 0;
            } else {
                this.field1673 = 2;
            }
        }
        if (this.field1660 == -1) {
            if (this.field1659 == null) {
                this.field1660 = 0;
            } else {
                this.field1660 = 2;
            }
        }
        if (arg0 > -83) {
            this.field1661 = -32;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILpd;)V")
    private final void method528(int arg0, int arg1, class94 arg2) {
        if (arg0 != -11) {
            this.method520(null, 67, 20);
        }
        field1668++;
        if (arg1 == 1) {
            int var4 = arg2.method703((byte) 105);
            this.field1658 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1658[var5] = arg2.method665(8666);
            }
            this.field1646 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1646[var6] = arg2.method665(8666);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1646[var7] = (arg2.method665(8666) << 16) + this.field1646[var7];
            }
        } else if (arg1 == 2) {
            this.field1656 = arg2.method665(8666);
        } else if (arg1 == 3) {
            int var11 = arg2.method703((byte) -94);
            this.field1659 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1659[var12] = arg2.method703((byte) -101);
            }
            this.field1659[var11] = 9999999;
        } else if (arg1 == 4) {
            this.field1669 = true;
        } else if (arg1 == 5) {
            this.field1665 = arg2.method703((byte) 81);
        } else if (arg1 == 6) {
            this.field1654 = arg2.method665(8666);
        } else if (arg1 == 7) {
            this.field1657 = arg2.method665(arg0 ^ 0xFFFFDE2F);
        } else if (arg1 == 8) {
            this.field1661 = arg2.method703((byte) 77);
        } else if (arg1 == 9) {
            this.field1660 = arg2.method703((byte) 96);
        } else if (arg1 == 10) {
            this.field1673 = arg2.method703((byte) 122);
        } else if (arg1 == 11) {
            this.field1648 = arg2.method703((byte) -84);
            return;
        } else if (arg1 == 12) {
            int var8 = arg2.method703((byte) 92);
            this.field1671 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1671[var9] = arg2.method665(8666);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field1671[var10] += arg2.method665(8666) << 16;
            }
            return;
        }
    }
}
