import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class166 extends class109 {

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[S")
    public short[] field3353;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "[Lai;")
    public class10[] field3349;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "[B")
    public byte[] field3368;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "[Lrd;")
    public class165[] field3352;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "[B")
    public byte[] field3359;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "[B")
    public byte[] field3360;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
    private int[] field3348;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Ldd;")
    public static class35 field3351 = class180.method1196((byte) -12, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field3354 = 0;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Z")
    public static boolean field3355 = false;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field3350 = -1;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3362 = new CRC32();

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIII)I")
    public static final int method1092(int arg0, int arg1, int arg2, int arg3) {
        field3347++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (arg2 == var4) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLgi;)V")
    public static final void method1093(byte arg0, class69 arg1) {
        field3356++;
        if (arg1.field1638 == 0) {
            return;
        }
        if (arg1.field1636 != -1 && arg1.field1636 < 32768) {
            class19 var2 = class204.field4058[arg1.field1636];
            if (var2 != null) {
                int var3 = arg1.field1664 - var2.field1664;
                int var4 = arg1.field1676 - var2.field1676;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1613 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1636 >= 32768) {
            int var5 = arg1.field1636 - 32768;
            if (client.field614 == var5) {
                var5 = 2047;
            }
            class102 var6 = class51.field1154[var5];
            if (var6 != null) {
                int var7 = arg1.field1664 - var6.field1664;
                int var8 = arg1.field1676 - var6.field1676;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1613 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1655 != 0 || arg1.field1623 != 0) && (arg1.field1648 == 0 || arg1.field1617 > 0)) {
            int var9 = arg1.field1664 - (arg1.field1655 - class172.field3444 - class172.field3444) * 64;
            int var10 = arg1.field1676 - (arg1.field1623 - class67.field1552 - class67.field1552) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field1613 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1655 = 0;
            arg1.field1623 = 0;
        }
        if (arg0 < 121) {
            method1100(null, null, null, null, 79);
        }
        int var11 = arg1.field1613 - arg1.field1618 & 0x7FF;
        if (var11 == 0) {
            arg1.field1611 = 0;
            return;
        }
        arg1.field1611++;
        if (var11 <= 1024) {
            arg1.field1618 += arg1.field1638;
            boolean var12 = true;
            if (var11 < arg1.field1638 || var11 > 2048 - arg1.field1638) {
                arg1.field1618 = arg1.field1613;
                var12 = false;
            }
            if (arg1.field1658 == arg1.field1645 && (arg1.field1611 > 25 || var12)) {
                if (arg1.field1635 == -1) {
                    arg1.field1658 = arg1.field1607;
                } else {
                    arg1.field1658 = arg1.field1635;
                }
            }
        } else {
            arg1.field1618 -= arg1.field1638;
            boolean var13 = true;
            if (var11 < arg1.field1638 || var11 > 2048 - arg1.field1638) {
                arg1.field1618 = arg1.field1613;
                var13 = false;
            }
            if (arg1.field1658 == arg1.field1645 && (arg1.field1611 > 25 || var13)) {
                if (arg1.field1619 == -1) {
                    arg1.field1658 = arg1.field1607;
                } else {
                    arg1.field1658 = arg1.field1619;
                }
            }
        }
        arg1.field1618 &= 0x7FF;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public static final void method1094(int arg0, int arg1) {
        class201.field4024 = -1;
        class114.field2540 = -1;
        class28.field580 = arg1;
        class56.field1392 = arg0;
        class54.field1204 = 1;
        class127.field2757 = null;
        class193.field3870 = false;
        field3358++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([I[BILqf;)Z")
    public final boolean method1095(int[] arg0, byte[] arg1, int arg2, class158 arg3) {
        boolean var5 = true;
        if (arg2 < 119) {
            field3364 = -72;
        }
        class10 var6 = null;
        field3346++;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field3348[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method1053((byte) 118, arg0, var9 >> 2);
                        } else {
                            var6 = arg3.method1054(0, arg0, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3349[var8] = var6;
                        this.field3348[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public final void method1096(int arg0) {
        this.field3348 = null;
        field3361++;
        if (arg0 != 128) {
            field3351 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public static void method1097(int arg0) {
        if (arg0 != 73) {
            method1097(-25);
        }
        field3362 = null;
        field3351 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JB)V")
    public static final void method1098(long arg0, byte arg1) {
        field3363++;
        if (arg0 == 0L) {
            return;
        }
        if (class25.field505 >= 100 && class17.field337 != 1 || class25.field505 >= 200) {
            class190.method1252(class20.field387, 0, class191.field3840, 0);
            return;
        }
        class35 var3 = class49.method436(arg0, false).method346(arg1 ^ 0x29);
        for (int var4 = 0; var4 < class25.field505; var4++) {
            if (class167.field3373[var4] == arg0) {
                class190.method1252(class20.field387, 0, class63.method529(new class35[] { var3, class97.field2153 }, (byte) 79), 0);
                return;
            }
        }
        int var5 = 0;
        if (arg1 != 77) {
            field3369 = -110;
        }
        while (class136.field2912 > var5) {
            if (class5.field82[var5] == arg0) {
                class190.method1252(class20.field387, 0, class63.method529(new class35[] { class17.field346, var3, class43.field935 }, (byte) 101), 0);
                return;
            }
            var5++;
        }
        if (var3.method332(18732, class71.field1704.field2254)) {
            class190.method1252(class20.field387, 0, class200.field3997, 0);
            return;
        }
        class98.field2162++;
        class39.field871[class25.field505] = var3;
        class167.field3373[class25.field505] = arg0;
        class181.field3691[class25.field505] = 0;
        class67.field1567[class25.field505] = class20.field387;
        class44.field957[class25.field505] = 0;
        class25.field505++;
        class100.field2208 = class13.field232;
        class1.field11.method659(38, true);
        class1.field11.method239((byte) 87, arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lae;ZLae;)V")
    public static final void method1099(class6 arg0, boolean arg1, class6 arg2) {
        field3366++;
        if (class107.field2388) {
            class68.method554(arg0, 3, arg2);
            return;
        }
        if (class2.field27 == 0 || class2.field27 == 5) {
            byte var3 = 20;
            arg0.method1326(class37.field829, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class140.method959(230, var4, 304, 34, 9179409);
            class140.method959(231, var4 + 1, 302, 32, 0);
            class140.method970(232, var4 + 2, class176.field3595 * 3, 30, 9179409);
            class140.method970(class176.field3595 * 3 + 232, var4 + 2, 300 - class176.field3595 * 3, 30, 0);
            arg0.method1326(class134.field2852, 382, 276 - var3, 16777215, -1);
        }
        if (class2.field27 == 20) {
            class206.field4110.method162(382 - class206.field4110.field358 / 2, 271 - class206.field4110.field356 / 2);
            short var5 = 211;
            arg0.method1326(class134.field2858, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method1326(class134.field2855, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method1326(class134.field2873, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method1322(class63.method529(new class35[] { class100.field2199, class199.method1309(class134.field2849) }, (byte) 64), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method1322(class63.method529(new class35[] { class58.field1463, class134.field2867.method356((byte) 87) }, (byte) 72), 274, var28, 16777215, 0);
            int var30 = var28 + 15;
        }
        if (class2.field27 == 10) {
            class206.field4110.method162(202, 171);
            if (class67.field1582 == 0) {
                short var15 = 251;
                arg0.method1326(class54.field1234, 382, var15, 16776960, 0);
                short var16 = 302;
                int var35 = var15 + 30;
                short var17 = 291;
                class91.field2024.method162(var16 - 73, var17 + -20);
                arg0.method1313(class30.field605, var16 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                class91.field2024.method162(var18 - 73, var17 + -20);
                arg0.method1313(class191.field3851, var18 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class67.field1582 == 2) {
                short var6 = 211;
                arg0.method1326(class134.field2858, 382, var6, 16776960, 0);
                short var7 = 302;
                int var27 = var6 + 15;
                arg0.method1326(class134.field2855, 382, var27, 16776960, 0);
                int var29 = var27 + 15;
                arg0.method1326(class134.field2873, 382, var29, 16776960, 0);
                boolean var8;
                if (class141.field2989 == 0 && class89.field1988 % 40 < 20 && class48.field1056) {
                    var8 = true;
                } else {
                    var8 = false;
                }
                short var9 = 321;
                var27 = var29 + 15;
                var27 += 10;
                arg0.method1322(class63.method529(new class35[] { class100.field2199, class199.method1309(class134.field2849), var8 ? class97.field2144 : class134.field2864 }, (byte) 111), 272, var27, 16777215, 0);
                boolean var10;
                if (class141.field2989 == 1 && class89.field1988 % 40 < 20 && class48.field1056) {
                    var10 = true;
                } else {
                    var10 = false;
                }
                var27 += 15;
                arg0.method1322(class63.method529(new class35[] { class58.field1463, class134.field2867.method356((byte) 99), var10 ? class97.field2144 : class134.field2864 }, (byte) 111), 274, var27, 16777215, 0);
                class91.field2024.method162(var7 - 73, var9 + -20);
                var27 += 15;
                arg0.method1326(class186.field3798, var7, var9 + 5, 16777215, 0);
                short var11 = 462;
                class91.field2024.method162(var11 - 73, var9 + -20);
                arg0.method1326(class147.field3102, var11, var9 + 5, 16777215, 0);
            } else if (class67.field1582 == 3) {
                short var12 = 236;
                short var13 = 382;
                short var14 = 321;
                arg0.method1326(class35.field778, 382, 211, 16776960, 0);
                arg0.method1326(class38.field836, 382, var12, 16777215, 0);
                int var31 = var12 + 15;
                arg0.method1326(class200.field4015, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                arg0.method1326(class34.field703, 382, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg0.method1326(class74.field1761, 382, var33, 16777215, 0);
                int var34 = var33 + 15;
                class91.field2024.method162(var13 - 73, var14 - 20);
                arg0.method1326(class147.field3102, var13, var14 + 5, 16777215, 0);
            }
        }
        if (class64.field1539 != 1) {
            if (class49.field1075 > 0) {
                class159.method1060(class49.field1075, -5003);
                class49.field1075 = 0;
            }
            class128.method894(true);
        }
        class205.field4074[class49.field1078 ? 1 : 0].method162(725, 463);
        if (class2.field27 > 5 && class178.field3648 != 2 && class106.field2373 == 0) {
            if (class35.field707 == null) {
                class35.field707 = class155.method1041(11110, class110.field2425, class78.field1815, 0);
            }
            if (class35.field707 != null) {
                byte var19 = 5;
                short var20 = 463;
                class35.field707.method162(var19, var20);
                byte var21 = 100;
                byte var22 = 35;
                arg0.method1326(class63.method529(new class35[] { class143.field3007, class124.field2719, class3.method19(class101.field2230, -29578) }, (byte) 97), var21 / 2 + var19, var22 / 2 + var20 + -2, 16777215, 0);
                if (class51.field1151 == null) {
                    arg2.method1326(class209.field4143, var21 / 2 + var19, var22 / 2 + var20 + 12, 16777215, 0);
                } else {
                    arg2.method1326(class42.field928, var21 / 2 + var19, var22 / 2 - -12 + var20, 16777215, 0);
                }
            }
        }
        if (arg1) {
            field3355 = true;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lag;Ldd;Ldd;Lag;I)Lae;")
    public static final class6 method1100(class8 arg0, class35 arg1, class35 arg2, class8 arg3, int arg4) {
        int var5 = arg3.method37(arg2, (byte) -62);
        if (arg4 == -31426) {
            int var6 = arg3.method51(var5, arg1, (byte) -65);
            field3365++;
            return class32.method313(false, arg3, var6, var5, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class166() {
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
    public class166(byte[] arg0) {
        this.field3353 = new short[128];
        this.field3349 = new class10[128];
        this.field3368 = new byte[128];
        this.field3352 = new class165[128];
        this.field3359 = new byte[128];
        this.field3360 = new byte[128];
        int var2 = 0;
        this.field3348 = new int[128];
        class26 var3 = new class26(arg0);
        while (var3.field529[var3.field527 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method225((byte) -116);
        }
        var2++;
        var3.field527++;
        int var6 = var3.field527;
        int var7 = 0;
        var3.field527 += var2;
        while (var3.field529[var3.field527 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method225((byte) -110);
        }
        var7++;
        var3.field527++;
        int var10 = var3.field527;
        int var11 = 0;
        var3.field527 += var7;
        while (var3.field529[var3.field527 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method225((byte) -121);
        }
        var11++;
        var3.field527++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method221(-107);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class165[] var19 = new class165[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class165 var103 = var19[var20] = new class165();
            int var104 = var3.method221(-123);
            if (var104 > 0) {
                var103.field3328 = new byte[var104 * 2];
            }
            int var105 = var3.method221(-90);
            if (var105 > 0) {
                var103.field3324 = new byte[var105 * 2 + 2];
                var103.field3324[1] = 64;
            }
        }
        int var21 = var3.method221(-94);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method221(-87);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var3.field529[var3.field527 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method225((byte) -125);
        }
        var25++;
        int var28 = 0;
        var3.field527++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method221(-88);
            this.field3353[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method221(-108);
            this.field3353[var31] = (short) (this.field3353[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var34 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var34++];
                }
                var33 = var3.method242(-113);
            }
            var32--;
            this.field3353[var35] = (short) (this.field3353[var35] + class208.method1372(var33 - 1 << 14, 32768));
            this.field3348[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3348[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field529[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                this.field3359[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3348[var43] != 0) {
                if (var41 == 0) {
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                    var42 = var3.field529[var10++] + 16 << 2;
                }
                this.field3368[var43] = (byte) var42;
                var41--;
            }
        }
        class165 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3348[var47] != 0) {
                if (var45 == 0) {
                    var44 = var19[var14[var46]];
                    if (var12.length > var46) {
                        var45 = var12[var46++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field3352[var47] = var44;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var48) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field3348[var51] > 0) {
                    var50 = var3.method221(-114) + 1;
                }
            }
            var49--;
            this.field3360[var51] = (byte) var50;
        }
        this.field3357 = var3.method221(-77) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class165 var100 = var19[var52];
            if (var100.field3328 != null) {
                for (int var101 = 1; var101 < var100.field3328.length; var101 += 2) {
                    var100.field3328[var101] = var3.method225((byte) -118);
                }
            }
            if (var100.field3324 != null) {
                for (int var102 = 3; var102 < var100.field3324.length - 2; var102 += 2) {
                    var100.field3324[var102] = var3.method225((byte) -125);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method225((byte) -115);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method225((byte) -109);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class165 var97 = var19[var55];
            if (var97.field3324 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3324.length; var99 += 2) {
                    var98 = var3.method221(-107) + var98 + 1;
                    var97.field3324[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class165 var94 = var19[var56];
            if (var94.field3328 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3328.length; var96 += 2) {
                    var95 = var3.method221(-128) + var95 + 1;
                    var94.field3328[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method221(-101);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var3.method221(-115) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3360[var61] = (byte) (this.field3360[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                var62 += 2;
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class161.method1073(0, var67, var66 - var59);
                    var67 += var65 - var60;
                    this.field3360[var68] = (byte) (this.field3360[var68] * var69 + 32 >> 6);
                }
                var60 = var65;
                var59 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field3360[var64] = (byte) (this.field3360[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var3.method221(-108);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var3.method221(-76) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3368[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3368[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                var75 += 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class161.method1073(0, var81, var79 - var72);
                    var81 += var80 - var73;
                    int var84 = (this.field3368[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3368[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field3368[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3368[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3331 = var3.method221(-101);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class165 var93 = var19[var87];
            if (var93.field3328 != null) {
                var93.field3345 = var3.method221(-118);
            }
            if (var93.field3324 != null) {
                var93.field3339 = var3.method221(-78);
            }
            if (var93.field3331 > 0) {
                var93.field3323 = var3.method221(-122);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3338 = var3.method221(-125);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class165 var92 = var19[var89];
            if (var92.field3338 > 0) {
                var92.field3341 = var3.method221(-102);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class165 var91 = var19[var90];
            if (var91.field3341 > 0) {
                var91.field3336 = var3.method221(-122);
            }
        }
    }
}
