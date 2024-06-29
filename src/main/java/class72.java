import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[[S")
    public static short[][] field1412 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "F")
    public static float field1417;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lqg;")
    public static class239 field1420;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method628(boolean arg0) {
        field1422++;
        int var1 = 0;
        if (arg0) {
            field1420 = (class239) null;
        }
        while (var1 < class174.field3139) {
            int var2 = class45.field945[var1];
            class102 var3 = class122.field2196[var2];
            int var4 = class287.field5106.method483(-113);
            if ((var4 & 0x80) != 0) {
                var4 += class287.field5106.method483(-102) << 8;
            }
            if ((var4 & 0x1) != 0) {
                var3.field42 = class287.field5106.method467((byte) -16);
                var3.field36 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field43 = class287.field5106.method491(-1268);
                var3.field58 = class287.field5106.method468(28214);
            }
            if ((var4 & 0x10) != 0) {
                var3.field62 = class287.field5106.method466(255);
                if (var3.field62 == 65535) {
                    var3.field62 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class287.field5106.method483(-110);
                int var6 = class287.field5106.method483(-105);
                var3.method12(-15, class8.field279, var5, var6);
                var3.field21 = class8.field279 + 300;
                var3.field48 = class287.field5106.method488((byte) 116);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field1921.method998(28284)) {
                    class323.method2272(-107, var3);
                }
                var3.method862((byte) 72, class150.method1198(class287.field5106.method468(28214), 120));
                var3.method1(0, var3.field1921.field2266);
                var3.field23 = var3.field1921.field2294;
                if (var3.field1921.method998(28284)) {
                    class311.method2212(var3.field11[0], (byte) -82, (class239) null, class287.field5134, 0, var3.field34[0], var3, (class264) null);
                }
            }
            if ((var4 & 0x200) != 0) {
                int var7 = class287.field5106.method477(-1);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class287.field5106.method466(255);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var9[var11] = class287.field5106.method483(-103);
                    var10[var11] = class287.field5106.method491(-1268);
                }
                class80.method662(var10, var8, var3, var9, -41);
            }
            if ((var4 & 0x2) != 0) {
                int var13 = class287.field5106.method466(255);
                boolean var14 = true;
                int var15 = class287.field5106.method453(1);
                if (var13 == 65535) {
                    var13 = -1;
                }
                if (var13 != -1 && var3.field81 != -1 && class131.method1033((byte) -82, class103.method874(var13, -601).field3755).field3321 < class131.method1033((byte) -82, class103.method874(var3.field81, -601).field3755).field3321) {
                    var14 = false;
                }
                if (var14) {
                    var3.field75 = class8.field279 + (var15 & 0xFFFF);
                    var3.field102 = 0;
                    var3.field2 = 1;
                    var3.field7 = var15 >> 16;
                    var3.field5 = 0;
                    if (class8.field279 < var3.field75) {
                        var3.field5 = -1;
                    }
                    var3.field81 = var13;
                    if (var3.field81 != -1 && class8.field279 == var3.field75) {
                        int var16 = class103.method874(var3.field81, -601).field3755;
                        if (var16 != -1) {
                            class182 var17 = class131.method1033((byte) -82, var16);
                            if (var17 != null && var17.field3341 != null) {
                                class194.method1460(false, var3.field86, 0, var17, var3.field79, (byte) 98);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                int var18 = class287.field5106.method466(255);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class287.field5106.method470((byte) -7);
                class38.method341(var3, var18, var19, (byte) 12);
            }
            if ((var4 & 0x8) != 0) {
                int var20 = class287.field5106.method483(-126);
                int var21 = class287.field5106.method477(-1);
                var3.method12(-82, class8.field279, var20, var21);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIZIII)V", line = 229)
    public static final void method629(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1413++;
        if (class64.field1312 == arg5 && class274.field4875 == arg4 && class179.field3245 == arg0 || class221.method1617((byte) 29)) {
            return;
        }
        class179.field3245 = arg0;
        class274.field4875 = arg4;
        class64.field1312 = arg5;
        if (class221.method1617((byte) 29)) {
            class179.field3245 = 0;
        }
        if (arg3) {
            class172.method1343(28, arg2 - 812);
        } else {
            class172.method1343(25, -29401);
        }
        class321.method2258(class200.field3575, true, (byte) -118);
        int var7 = class12.field396;
        class12.field396 = arg4 * 8 - 48;
        int var8 = class112.field2058;
        class112.field2058 = (arg5 - 6) * 8;
        class172.field3103 = class248.method1775(false, class274.field4875 * 8, class64.field1312 * 8);
        int var9 = class12.field396 - var7;
        int var10 = class12.field396;
        class310.field5503 = null;
        int var11 = class112.field2058 - var8;
        int var12 = class112.field2058;
        if (arg3) {
            class26.field626 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class102 var17 = class122.field2196[var16];
                if (var17 != null) {
                    var17.field86 -= var11 * 128;
                    var17.field79 -= var9 * 128;
                    if (var17.field86 >= 0 && var17.field86 <= 13184 && var17.field79 >= 0 && var17.field79 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field11[var18] -= var11;
                            var17.field34[var18] -= var9;
                        }
                        class200.field3579[class26.field626++] = var16;
                    } else {
                        class122.field2196[var16].method862((byte) 72, (class125) null);
                        class122.field2196[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class102 var14 = class122.field2196[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field11[var15] -= var11;
                        var14.field34[var15] -= var9;
                    }
                    var14.field79 -= var9 * 128;
                    var14.field86 -= var11 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class239 var20 = class96.field1780[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field11[var21] -= var11;
                    var20.field34[var21] -= var9;
                }
                var20.field79 -= var9 * 128;
                var20.field86 -= var11 * 128;
            }
        }
        class287.field5134 = arg0;
        field1420.method1722((byte) -32, arg1, arg6, false);
        byte var22 = 0;
        byte var23 = 104;
        byte var24 = 1;
        if (var11 < 0) {
            var23 = -1;
            var24 = -1;
            var22 = 103;
        }
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        if (var9 < 0) {
            var27 = -1;
            var25 = 103;
            var26 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var25; var29 != var26; var29 += var27) {
                int var30 = var9 + var29;
                int var31 = var11 + var28;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104) {
                        class276.field4890[var32][var28][var29] = class276.field4890[var32][var31][var30];
                    } else {
                        class276.field4890[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class261 var33 = (class261) class268.field4806.method2248(arg2 ^ 0xFFFF9024); var33 != null; var33 = (class261) class268.field4806.method2240(1138)) {
            var33.field4646 -= var11;
            var33.field4644 -= var9;
            if (var33.field4646 < 0 || var33.field4644 < 0 || var33.field4646 >= 104 || var33.field4644 >= 104) {
                var33.method2221(true);
            }
        }
        if (class100.field1882 != 0) {
            class100.field1882 -= var11;
            field1415 -= var9;
        }
        class260.field4620 = 0;
        if (arg3) {
            class214.field3758 -= var9;
            class92.field1747 -= var9 * 128;
            class322.field5632 -= var11;
            class86.field1651 -= var9;
            class113.field2083 -= var11;
            class21.field589 -= var11 * 128;
        } else {
            class122.field2191 = 1;
        }
        if (class97.field1824 && arg3 && (Math.abs(var11) > 104 || Math.abs(var9) > 104)) {
            class29.method266(arg2 ^ 0xFFFF9012);
        }
        class123.field2230 = -1;
        class107.field1996.method2243(120);
        class32.field727.method2243(94);
        if (arg2 != -28589) {
            field1417 = -0.62592566F;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)I", line = 473)
    public static final int method630(int arg0, byte arg1) {
        int var2 = 98 / ((7 - arg1) / 58);
        field1418++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)Lud;", line = 515)
    public static final class279 method631(long arg0, int arg1) {
        field1419++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            if (arg1 != 5702) {
                return (class279) null;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class29.field680[(int) (var7 - (arg0 * 37L))];
            }
            class279 var9 = new class279();
            var9.field4935 = var6;
            var9.field4967 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V", line = 569)
    public static final void method632(int arg0, int arg1) {
        field1421++;
        class104 var2 = class293.method2085(11, arg0, false);
        var2.method875(12466);
        if (arg1 != 18529) {
            field1416 = -18;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Z", line = 620)
    public static final boolean method633(int arg0) {
        field1414++;
        if (arg0 != -1) {
            return false;
        }
        if (class304.field5396) {
            try {
                class271.field4831.method1983(class110.field2022.field5418, 7308);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 655)
    public static void method634(byte arg0) {
        field1420 = null;
        field1412 = (short[][]) null;
        if (arg0 >= -90) {
            field1412 = (short[][]) ((short[][]) null);
        }
    }
}
