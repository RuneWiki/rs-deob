import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class110 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
    public static volatile boolean field2780 = true;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
    public static int[] field2793 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2790 = 0;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lmc;")
    public static class75 field2795 = class30.method234(true, "backbase2");

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lmc;")
    public static class75 field2797 = class30.method234(true, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lmc;")
    public static class75 field2796 = class30.method234(true, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[Lba;")
    public static class8[] field2783 = new class8[4];

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lmc;")
    private static class75 field2791 = class30.method234(true, "Existing user");

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Z")
    public static boolean field2798 = false;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lmc;")
    public static class75 field2800 = class30.method234(true, "Mitteilung");

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lmc;")
    public static class75 field2786 = field2791;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lrc;")
    public static class105 field2792;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lnc;")
    public static class81 field2784;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[[B")
    public static byte[][] field2785;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILfc;III)V", line = 21)
    public static final void method897(int arg0, class34 arg1, int arg2, int arg3, int arg4) {
        field2799++;
        if (class100.field2585 >= 400) {
            return;
        }
        if (arg1.field814 != null) {
            arg1 = arg1.method272((byte) -90);
        }
        if (arg1 == null || !arg1.field777) {
            return;
        }
        if (arg2 >= -124) {
            method899(-108);
        }
        class75 var5 = arg1.field772;
        if (arg1.field766 != 0) {
            var5 = class69.method586(new class75[] { var5, class31.method243(arg1.field766, (byte) 92, class52.field1315.field2980), class16.field316, class99.field2564, class45.method345(22978, arg1.field766), class99.field2519 }, (byte) 64);
        }
        if (class42.field1013 == 1) {
            class70.field1785++;
            class85.method703(arg0, -89, class69.method586(new class75[] { class64.field1688, class72.field1820, var5 }, (byte) 22), class82.field2041, arg3, 45, arg4);
        } else if (class17.field332 != 1) {
            class75[] var6 = arg1.field811;
            if (class127.field3106) {
                var6 = class86.method717(var6, (byte) -119);
            }
            class85.field2088++;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method634(class52.field1289, 1)) {
                        class55.field1414++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 16;
                        }
                        if (var7 == 1) {
                            var8 = 4;
                        }
                        if (var7 == 2) {
                            var8 = 24;
                        }
                        if (var7 == 3) {
                            var8 = 29;
                        }
                        if (var7 == 4) {
                            var8 = 37;
                        }
                        class85.method703(arg0, -114, class69.method586(new class75[] { class119.field2934, var5 }, (byte) 79), var6[var7], arg3, var8, arg4);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method634(class52.field1289, 1)) {
                        class35.field831++;
                        short var10 = 0;
                        int var11 = 0;
                        if (class52.field1315.field2980 < arg1.field766) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = var10 + 16;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 4;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 24;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 29;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 37;
                        }
                        class85.method703(arg0, 107, class69.method586(new class75[] { class119.field2934, var5 }, (byte) 115), var6[var9], arg3, var11, arg4);
                    }
                }
            }
            class85.method703(arg0, -120, class69.method586(new class75[] { class119.field2934, var5 }, (byte) 76), class90.field2213, arg3, 1005, arg4);
            return;
        } else if ((class99.field2561 & 0x2) == 2) {
            class84.field2064++;
            class85.method703(arg0, 87, class69.method586(new class75[] { class86.field2126, class72.field1820, var5 }, (byte) 105), class100.field2596, arg3, 20, arg4);
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Laa;", line = 167)
    public static final class2 method898(int arg0) {
        if (arg0 >= -40) {
            return null;
        }
        class2 var1 = new class2();
        var1.field36 = class130.field3170;
        field2794++;
        var1.field35 = class55.field1395;
        var1.field33 = class47.field1154[0];
        var1.field30 = class43.field1031[0];
        var1.field34 = class100.field2592[0];
        var1.field31 = class36.field880[0];
        byte[] var2 = class118.field2924[0];
        int var3 = var1.field34 * var1.field31;
        var1.field32 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field32[var4] = class85.field2109[class56.method456(255, var2[var4])];
        }
        class41.method317(7);
        return var1;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 214)
    public static final void method899(int arg0) {
        if (arg0 != 2000) {
            return;
        }
        class26.field523 = 0;
        field2801++;
        int var1 = (class52.field1315.field1233 >> 7) + class62.field1618;
        int var2 = (class52.field1315.field1242 >> 7) + class55.field1367;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class26.field523 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class26.field523 = 1;
        }
        if (class26.field523 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class26.field523 = 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 254)
    public static final void method900(int arg0) {
        class82.method689(false, 0);
        class109.field2773 = 0;
        field2781++;
        boolean var1 = true;
        for (int var2 = 0; var2 < field2785.length; var2++) {
            if (class15.field267[var2] != -1 && field2785[var2] == null) {
                field2785[var2] = class40.field967.method436(0, 5, class15.field267[var2]);
                if (field2785[var2] == null) {
                    class109.field2773++;
                    var1 = false;
                }
            }
            if (class56.field1429[var2] != -1 && class12.field232[var2] == null) {
                class12.field232[var2] = class40.field967.method447(0, true, class43.field1020[var2], class56.field1429[var2]);
                if (class12.field232[var2] == null) {
                    var1 = false;
                    class109.field2773++;
                }
            }
        }
        if (!var1) {
            class56.field1427 = 1;
            return;
        }
        boolean var3 = true;
        class97.field2443 = 0;
        for (int var4 = 0; var4 < field2785.length; var4++) {
            byte[] var56 = class12.field232[var4];
            if (var56 != null) {
                int var57 = (class27.field561[var4] & 0xFF) * 64 - class55.field1367;
                int var58 = (class27.field561[var4] >> 8) * 64 - class62.field1618;
                if (class122.field3007) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class28.method180(var56, arg0 ^ 0x667, var57, var58);
            }
        }
        if (!var3) {
            class56.field1427 = 2;
            return;
        }
        if (class56.field1427 != 0) {
            class26.method173(true, class50.field1278, 105, class7.field96);
        }
        class82.method691(arg0 ^ 0x741);
        class107.field2679.method232();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            field2783[var5].method40(-97);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class74.field1836[var6][var54][var55] = 0;
                }
            }
        }
        class94.method803(88);
        int var7 = field2785.length;
        class71.method600(10721);
        class82.method689(true, 0);
        if (!class122.field3007) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class27.field561[var8] >> 8) * 64 - class62.field1618;
                byte[] var18 = field2785[var8];
                int var19 = (class27.field561[var8] & 0xFF) * 64 - class55.field1367;
                if (var18 != null) {
                    class50.method391(var17, class3.field51 * 8 - 48, var19, (class108.field2739 - 6) * 8, 111, var18, field2783);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class27.field561[var9] >> 8) * 64 - class62.field1618;
                int var15 = (class27.field561[var9] & 0xFF) * 64 - class55.field1367;
                byte[] var16 = field2785[var9];
                if (var16 == null && class108.field2739 < 800) {
                    class111.method902(var15, 103, 64, 64, var14);
                }
            }
            class82.method689(true, 0);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class12.field232[var10];
                if (var11 != null) {
                    int var12 = (class27.field561[var10] >> 8) * 64 - class62.field1618;
                    int var13 = (class27.field561[var10] & 0xFF) * 64 - class55.field1367;
                    class114.method919(var13, var12, var11, field2783, (byte) -83, class107.field2679);
                }
            }
        }
        if (class122.field3007) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class43.field1034[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 1 & 0x3;
                            int var40 = var36 >> 14 & 0x3FF;
                            int var41 = var36 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class27.field561.length; var43++) {
                                if (class27.field561[var43] == var42 && field2785[var43] != null) {
                                    class58.method465(var34 * 8, var38, true, var35 * 8, (var41 & 0x7) * 8, (var40 & 0x7) * 8, var20, var39, field2785[var43], field2783);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class84.method696(31, var20, var35 * 8, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class43.field1034[0][var21][var32];
                    if (var33 == -1) {
                        class111.method902(var32 * 8, arg0 + 1932, 8, 8, var21 * 8);
                    }
                }
            }
            class82.method689(true, 0);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class43.field1034[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class27.field561.length; var31++) {
                                if (class27.field561[var31] == var30 && class12.field232[var31] != null) {
                                    class25.method169(class12.field232[var31], var22, var26, (var29 & 0x7) * 8, var27, field2783, class107.field2679, var24 * 8, (var28 & 0x7) * 8, var23 * 8, -1);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class82.method689(true, arg0 + 1829);
        if (arg0 != -1829) {
            return;
        }
        class82.method691(-125);
        class97.method816((byte) 113, field2783, class107.field2679);
        class82.method689(true, 0);
        int var44 = class92.field2280;
        if (class99.field2510 < var44) {
            var44 = class99.field2510;
        }
        if (var44 < class99.field2510 - 1) {
            int var45 = class99.field2510 - 1;
        }
        if (class92.field2270) {
            class107.field2679.method194(class92.field2280);
        } else {
            class107.field2679.method194(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class109.method896(-105, var53, var46);
            }
        }
        class86.method720(arg0 + 1856);
        class45.field1094.method553((byte) 119);
        if (class21.field421 != null) {
            class26.field525++;
            class118.field2923.method707(-125, 98);
            class118.field2923.method526(1057001181, (byte) 7);
        }
        if (!class122.field3007) {
            int var47 = (class3.field51 - 6) / 8;
            int var48 = (class3.field51 + 6) / 8;
            int var49 = (class108.field2739 - 6) / 8;
            int var50 = (class108.field2739 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var48 < var51 || var49 > var52 || var50 < var52) {
                        class40.field967.method432(class69.method586(new class75[] { class82.field2044, class45.method345(arg0 ^ 0xFFFFA119, var51), class32.field731, class45.method345(arg0 ^ 0xFFFFA119, var52) }, (byte) 28), (byte) -94);
                        class40.field967.method432(class69.method586(new class75[] { class56.field1420, class45.method345(22978, var51), class32.field731, class45.method345(22978, var52) }, (byte) 28), (byte) -4);
                    }
                }
            }
        }
        if (class52.field1320 == -1) {
            class17.method121(30, -9411);
        } else {
            class17.method121(35, -9411);
        }
        class69.method587((byte) -55);
        class118.field2923.method707(arg0 + 1902, 99);
        class55.method431(true);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 710)
    public static void method901(boolean arg0) {
        field2800 = null;
        field2797 = null;
        if (arg0) {
            field2795 = null;
        }
        field2792 = null;
        field2791 = null;
        field2785 = null;
        field2784 = null;
        field2796 = null;
        field2795 = null;
        field2793 = null;
        field2786 = null;
        field2783 = null;
    }
}
