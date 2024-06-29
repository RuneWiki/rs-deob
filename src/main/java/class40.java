import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class40 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lae;")
    private static class6 field880 = class64.method474(109, "Remove");

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field886 = 0;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Lae;")
    private static class6 field894 = class64.method474(115, "Please contact customer support)3");

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lae;")
    public static class6 field887 = field894;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lre;")
    public static class109 field896 = null;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lae;")
    private static class6 field895 = class64.method474(122, "Too many connections from your address)3");

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lae;")
    public static class6 field881 = field895;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lae;")
    public static class6 field892 = field880;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Lae;")
    public static class6 field898 = class64.method474(114, ": ");

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Le;")
    public static class30 field888 = new class30(4096);

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Lae;")
    private static class6 field900 = class64.method474(104, "Enter your username (V password)3");

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field903 = 0;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Lae;")
    public static class6 field902 = field900;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Lae;")
    public static class6 field901 = class64.method474(106, " weitere Optionen");

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Lde;")
    public static class26 field899;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Llb;")
    public static class69 field904;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZ)V", line = 5)
    public static final void method335(int arg0, int arg1, int arg2, boolean arg3) {
        class121 var4 = class75.method602(arg2, arg1, 0);
        field884++;
        if (var4 != null && var4.field2976 != null) {
            class76.method612(0, var4.field2976, null, 114, 0, var4, 0);
        }
        class117.field2783 = arg3;
        class59.field1302 = arg1;
        class70.field1562 = arg0;
        class70.field1561 = arg2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBI[B)I", line = 32)
    public static final int method336(int arg0, byte arg1, int arg2, byte[] arg3) {
        field883++;
        if (arg1 < 25) {
            field900 = null;
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class78.field1881[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBIIIII)V", line = 57)
    public static final void method337(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field890++;
        if (class21.method208(0, arg6)) {
            class52.method416(-1, 0, arg7, 0, arg4, -1, arg2, arg5, arg0, class35.field828[arg6], arg1, arg8);
            if (arg3 < 109) {
                field887 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V", line = 83)
    public static final void method338(int arg0, boolean arg1) {
        class123.field3027 = arg1;
        field889++;
        if (arg0 != -519790717) {
            field898 = null;
        }
        if (!class123.field3027) {
            int var2 = class85.field2051.method637(10670);
            int var3 = class85.field2051.method637(10670);
            int var4 = class85.field2051.method669((byte) 127);
            int var5 = class85.field2051.method624((byte) -98);
            int var6 = (class69.field1528 - class85.field2051.field1821) / 16;
            class20.field400 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class20.field400[var7][var14] = class85.field2051.method665(0);
                }
            }
            int var8 = class85.field2051.method654(-1);
            class130.field3144 = new int[var6];
            class108.field2598 = new int[var6];
            class12.field223 = new byte[var6][];
            class118.field2816 = new byte[var6][];
            boolean var9 = false;
            class22.field574 = new int[var6];
            int var10 = 0;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && (var8 / 8) == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class130.field3144[var10] = var13;
                        class22.field574[var10] = class21.field518.method158(class85.method731(new class6[] { class109.field2627, class114.method942((byte) 71, var11), class56.field1235, class114.method942((byte) 71, var12) }, arg0 + 519805286), (byte) 30);
                        class108.field2598[var10] = class21.field518.method158(class85.method731(new class6[] { class107.field2543, class114.method942((byte) 71, var11), class56.field1235, class114.method942((byte) 71, var12) }, 14569), (byte) 30);
                        var10++;
                    }
                }
            }
            class34.method308(var5, var8, (byte) -113, var4, var3, var2);
            return;
        }
        class85.field2051.method932(-18967);
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class85.field2051.method939(1, -13873);
                    if (var37 == 1) {
                        class51.field1137[var15][var35][var36] = class85.field2051.method939(26, -13873);
                    } else {
                        class51.field1137[var15][var35][var36] = -1;
                    }
                }
            }
        }
        class85.field2051.method934(arg0 ^ 0xE1049F82);
        int var16 = (class69.field1528 - class85.field2051.field1821) / 16;
        class20.field400 = new int[var16][4];
        for (int var17 = 0; var17 < var16; var17++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class20.field400[var17][var34] = class85.field2051.method647((byte) -72);
            }
        }
        int var18 = class85.field2051.method669((byte) 122);
        int var19 = class85.field2051.method637(arg0 + 519801387);
        int var20 = class85.field2051.method669((byte) 123);
        int var21 = class85.field2051.method637(arg0 + 519801387);
        int var22 = class85.field2051.method651((byte) 16);
        class22.field574 = new int[var16];
        class130.field3144 = new int[var16];
        class12.field223 = new byte[var16][];
        class108.field2598 = new int[var16];
        class118.field2816 = new byte[var16][];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class51.field1137[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 3 & 0x7FF;
                        int var29 = var27 >> 14 & 0x3FF;
                        int var30 = (var29 / 8 << 8) + var28 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class130.field3144[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class130.field3144[var23] = var30;
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class22.field574[var23] = class21.field518.method158(class85.method731(new class6[] { class109.field2627, class114.method942((byte) 71, var32), class56.field1235, class114.method942((byte) 71, var33) }, class2.method7(arg0, -519788694)), (byte) 30);
                            class108.field2598[var23] = class21.field518.method158(class85.method731(new class6[] { class107.field2543, class114.method942((byte) 71, var32), class56.field1235, class114.method942((byte) 71, var33) }, 14569), (byte) 30);
                            var23++;
                        }
                    }
                }
            }
        }
        class34.method308(var22, var21, (byte) -127, var20, var18, var19);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 308)
    public static final void method339(int arg0) {
        field885++;
        try {
            if (class77.field1803 == 0) {
                if (class67.field1491 != null) {
                    class67.field1491.method207(arg0 - 2148);
                    class67.field1491 = null;
                }
                class77.field1803 = 1;
                class107.field2561 = null;
                class121.field2997 = false;
                class24.field611 = 0;
            }
            if (class77.field1803 == 1) {
                if (class107.field2561 == null) {
                    class107.field2561 = class64.field1391.method283(class30.field720, arg0 + 14);
                }
                if (class107.field2561.field2686 == 2) {
                    throw new IOException();
                }
                if (class107.field2561.field2686 == 1) {
                    class67.field1491 = new class21((Socket) class107.field2561.field2687, class64.field1391);
                    class77.field1803 = 2;
                    class107.field2561 = null;
                }
            }
            if (class77.field1803 == 2) {
                long var1 = client.field482 = class102.field2390.method43((byte) -56);
                class111.field2660.field1821 = 0;
                class111.field2660.method641((byte) -28, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class111.field2660.method641((byte) -28, var3);
                class67.field1491.method211(-1, class111.field2660.field1858, 2, 0);
                class85.field2051.field1821 = 0;
                class77.field1803 = 3;
            }
            if (class77.field1803 == 3) {
                int var4 = class67.field1491.method209(arg0 - 82);
                if (var4 != 0) {
                    class18.method178(var4, 24);
                    return;
                }
                class77.field1803 = 4;
                class85.field2051.field1821 = 0;
            }
            if (class77.field1803 == 4) {
                if (class85.field2051.field1821 < 8) {
                    int var5 = class67.field1491.method210(0);
                    if (8 - class85.field2051.field1821 < var5) {
                        var5 = 8 - class85.field2051.field1821;
                    }
                    if (var5 > 0) {
                        class67.field1491.method206(var5, class85.field2051.field1858, class85.field2051.field1821, -22323);
                        class85.field2051.field1821 += var5;
                    }
                }
                if (class85.field2051.field1821 == 8) {
                    class85.field2051.field1821 = 0;
                    class61.field1341 = class85.field2051.method631(-124);
                    class77.field1803 = 5;
                }
            }
            if (class77.field1803 == 5) {
                class111.field2660.field1821 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class61.field1341 >> 32), (int) class61.field1341 };
                class111.field2660.method641((byte) -28, 10);
                class111.field2660.method644(var6[0], (byte) 38);
                class111.field2660.method644(var6[1], (byte) 38);
                class111.field2660.method644(var6[2], (byte) 38);
                class111.field2660.method644(var6[3], (byte) 38);
                class111.field2660.method644(class64.field1391.field760, (byte) 38);
                class111.field2660.method639(true, class102.field2390.method43((byte) -56));
                class111.field2660.method670((byte) 102, class102.field2399);
                class111.field2660.method664(class5.field55, class21.field492, -17694);
                class6.field128.field1821 = 0;
                if (class59.field1295 == 40) {
                    class6.field128.method641((byte) -28, 18);
                } else {
                    class6.field128.method641((byte) -28, 16);
                }
                class6.field128.method641((byte) -28, class111.field2660.field1821 + 61);
                class6.field128.method644(443, (byte) 38);
                class6.field128.method641((byte) -28, class82.field2017 ? 1 : 0);
                class6.field128.method644(class77.field1822.field285, (byte) 38);
                class6.field128.method644(class24.field605.field285, (byte) 38);
                class6.field128.method644(class137.field3325.field285, (byte) 38);
                class6.field128.method644(class68.field1507.field285, (byte) 38);
                class6.field128.method644(class68.field1499.field285, (byte) 38);
                class6.field128.method644(class21.field518.field285, (byte) 38);
                class6.field128.method644(class41.field913.field285, (byte) 38);
                class6.field128.method644(class82.field2020.field285, (byte) 38);
                class6.field128.method644(class47.field1074.field285, (byte) 38);
                class6.field128.method644(class121.field2930.field285, (byte) 38);
                class6.field128.method644(class133.field3248.field285, (byte) 38);
                class6.field128.method644(class62.field1368.field285, (byte) 38);
                class6.field128.method644(class57.field1249.field285, (byte) 38);
                class6.field128.method644(class108.field2577.field285, (byte) 38);
                class6.field128.method626(0, 91, class111.field2660.field1858, class111.field2660.field1821);
                class67.field1491.method211(-1, class6.field128.field1858, class6.field128.field1821, 0);
                class111.field2660.method933(var6, -30242);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class85.field2051.method933(var6, arg0 ^ 0x7628);
                class77.field1803 = 6;
            }
            if (class77.field1803 == 6 && class67.field1491.method210(arg0 + 10) > 0) {
                int var8 = class67.field1491.method209(arg0 ^ 0x79);
                if (var8 == 21 && class59.field1295 == 20) {
                    class77.field1803 = 7;
                } else if (var8 == 2) {
                    class77.field1803 = 9;
                } else if (var8 == 15 && class59.field1295 == 40) {
                    class92.method770((byte) 74);
                    return;
                } else if (var8 == 23 && class87.field2098 < 1) {
                    class87.field2098++;
                    class77.field1803 = 0;
                } else {
                    class18.method178(var8, 24);
                    return;
                }
            }
            if (class77.field1803 == 7 && class67.field1491.method210(0) > 0) {
                class63.field1371 = class67.field1491.method209(arg0 - 101) * 60 + 180;
                class77.field1803 = 8;
            }
            if (class77.field1803 == 8) {
                class24.field611 = 0;
                class67.method486(8845, class104.field2474, class85.method731(new class6[] { class114.method942((byte) 71, class63.field1371 / 60), class47.field1072 }, 14569), class30.field735);
                if (--class63.field1371 <= 0) {
                    class77.field1803 = 0;
                }
            } else {
                if (~class77.field1803 == arg0 && class67.field1491.method210(0) >= 8) {
                    class8.field175 = class67.field1491.method209(-99);
                    class69.field1544 = class67.field1491.method209(-114) == 1;
                    class136.field3308 = class67.field1491.method209(arg0 ^ 0x75);
                    class136.field3308 <<= 0x8;
                    class136.field3308 += class67.field1491.method209(-90);
                    class123.field3033 = class67.field1491.method209(-121);
                    class67.field1491.method206(1, class85.field2051.field1858, 0, arg0 ^ 0x573B);
                    class85.field2051.field1821 = 0;
                    class7.field162 = class85.field2051.method940(123);
                    class67.field1491.method206(2, class85.field2051.field1858, 0, -22323);
                    class85.field2051.field1821 = 0;
                    class69.field1528 = class85.field2051.method636(119);
                    class77.field1803 = 10;
                }
                if (class77.field1803 != 10) {
                    class24.field611++;
                    if (class24.field611 > 2000) {
                        if (class87.field2098 < 1) {
                            class77.field1803 = 0;
                            if (class42.field964 == class30.field720) {
                                class30.field720 = class116.field2755;
                            } else {
                                class30.field720 = class42.field964;
                            }
                            class87.field2098++;
                        } else {
                            class18.method178(-3, 24);
                        }
                    }
                } else if (class67.field1491.method210(0) >= class69.field1528) {
                    class85.field2051.field1821 = 0;
                    class67.field1491.method206(class69.field1528, class85.field2051.field1858, 0, -22323);
                    class76.method609((byte) 95);
                    class75.field1688 = -1;
                    method338(-519790717, false);
                    class7.field162 = -1;
                }
            }
        } catch (IOException var9) {
            if (class87.field2098 < 1) {
                class87.field2098++;
                class77.field1803 = 0;
                if (class42.field964 == class30.field720) {
                    class30.field720 = class116.field2755;
                } else {
                    class30.field720 = class42.field964;
                }
            } else {
                class18.method178(-2, arg0 ^ -18);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 616)
    public static void method340(int arg0) {
        field887 = null;
        field895 = null;
        field902 = null;
        field892 = null;
        if (arg0 != -7753) {
            field886 = 57;
        }
        field904 = null;
        field899 = null;
        field900 = null;
        field888 = null;
        field880 = null;
        field901 = null;
        field881 = null;
        field898 = null;
        field894 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Lkb;", line = 638)
    public static final class63 method341(int arg0, byte arg1) {
        if (arg1 >= -95) {
            field898 = null;
        }
        field891++;
        class63 var2 = (class63) class121.field2849.method128((byte) -123, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field2479.method160(30605, 14, arg0);
        class63 var4 = new class63();
        if (var3 != null) {
            var4.method460(new class77(var3), (byte) 122);
        }
        class121.field2849.method130(var4, (long) arg0, (byte) -102);
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 663)
    public static final void method342(byte arg0) {
        class65.field1419.method941(10);
        class82.field2016.method1036(0, 0);
        class121.field2861 = class29.method258(class121.field2861);
        field882++;
        int var1 = 15 / ((arg0 - 17) / 51);
    }
}
