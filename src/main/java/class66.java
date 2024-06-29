import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class66 implements class155 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Z")
    private boolean field1061 = false;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    private int field1057 = 50;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lu;")
    private class111 field1072;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lu;")
    private class111 field1054;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lbg;")
    private class217 field1058;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "[S")
    private short[] field1074;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "[B")
    private byte[] field1089;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[Z")
    private boolean[] field1090;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[B")
    private byte[] field1062;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "[Z")
    private boolean[] field1083;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "[Z")
    private boolean[] field1088;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[B")
    private byte[] field1086;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[Z")
    private boolean[] field1059;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
    private byte[] field1067;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[Z")
    private boolean[] field1056;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Z")
    public static boolean field1075 = true;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field1080 = 0;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Ldf;")
    public static class51 field1081 = class46.method233(" x ", 100);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[Lfi;")
    public static class103[] field1055 = new class103[2048];

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Lvh;")
    public static class252 field1085 = new class252();

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "[S")
    public static short[] field1068;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)V")
    public final void method455(int arg0, int arg1) {
        if (arg1 != 255) {
            return;
        }
        for (class41 var3 = (class41) this.field1058.method1487(true); var3 != null; var3 = (class41) this.field1058.method1496(false)) {
            if (var3.field653) {
                var3.method208((byte) -107, arg0);
                var3.field653 = false;
            }
        }
        field1078++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)[Lcg;")
    public static final class156[] method456(int arg0) {
        class156[] var1 = new class156[class190.field3183];
        field1066++;
        for (int var2 = arg0; var2 < class190.field3183; var2++) {
            var1[var2] = new class158(class13.field194, class122.field2078, class96.field1591[var2], class125.field2123[var2], class221.field3837[var2], class106.field1751[var2], class67.field1100[var2], class139.field2327);
        }
        class111.method804((byte) -14);
        return var1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static final void method457(int arg0) {
        field1082++;
        boolean var1 = true;
        class119.method858(true, false);
        class75.field1198 = 0;
        for (int var2 = 0; var2 < class105.field1732.length; var2++) {
            if (class9.field95[var2] != -1 && class105.field1732[var2] == null) {
                class105.field1732[var2] = class143.field2392.method828(class9.field95[var2], (byte) 122, 0);
                if (class105.field1732[var2] == null) {
                    var1 = false;
                    class75.field1198++;
                }
            }
            if (class181.field2989[var2] != -1 && class257.field4498[var2] == null) {
                class257.field4498[var2] = class143.field2392.method824(class181.field2989[var2], class120.field1992[var2], false, 0);
                if (class257.field4498[var2] == null) {
                    var1 = false;
                    class75.field1198++;
                }
            }
            if (class39.field612 != null && class234.field4071[var2] == null && class39.field612[var2] != -1) {
                class234.field4071[var2] = class143.field2392.method824(class39.field612[var2], class120.field1992[var2], false, 0);
                if (class234.field4071[var2] == null) {
                    class75.field1198++;
                    var1 = false;
                }
            }
        }
        if (class14.field217 == null || !class95.field1565.method819(class20.method104(-121, new class51[] { class14.field217.field44, class212.field3535 }), 0)) {
            class175.field2864 = null;
        } else if (class95.field1565.method805(class20.method104(7, new class51[] { class14.field217.field44, class212.field3535 }), 31514)) {
            class175.field2864 = class32.method163(class20.method104(-97, new class51[] { class14.field217.field44, class212.field3535 }), class95.field1565, (byte) 102);
        } else {
            class75.field1198++;
            var1 = false;
        }
        if (!var1) {
            class142.field2377 = 1;
            return;
        }
        boolean var3 = true;
        class185.field3056 = 0;
        for (int var4 = 0; var4 < class105.field1732.length; var4++) {
            byte[] var19 = class257.field4498[var4];
            if (var19 != null) {
                int var20 = (class101.field1681[var4] >> 8) * 64 - class11.field160;
                int var21 = (class101.field1681[var4] & 0xFF) * 64 - class241.field4179;
                if (class100.field1657) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class93.method702(var19, -125, var20, var21);
            }
        }
        if (!var3) {
            class142.field2377 = 2;
            return;
        }
        if (class142.field2377 != 0) {
            class164.method1155(class20.method104(122, new class51[] { class156.field2569, class12.field185 }), true, 6);
        }
        if (arg0 >= -41) {
            field1069 = 32;
        }
        class190.method1361(205);
        class75.method540((byte) 109);
        class174.method1221();
        for (int var5 = 0; var5 < 4; var5++) {
            class159.field2605[var5].method1192(16777215);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class160.field2626[var6][var17][var18] = 0;
                }
            }
        }
        class189.method1355(20302, false);
        class190.method1361(205);
        System.gc();
        class119.method858(true, true);
        class48.method247(false, -18493);
        if (!class100.field1657) {
            class223.method1541(false, 16335);
            class119.method858(true, true);
            class265.method1799(false, (byte) -90);
            if (class234.field4071 != null) {
                class109.method794(0);
            }
        }
        if (class100.field1657) {
            class134.method981(false, 42);
            class119.method858(true, true);
            class236.method1636(-88, false);
        }
        class75.method540((byte) 109);
        class119.method858(true, true);
        class255.method1742((byte) -32, false, class159.field2605);
        class119.method858(true, true);
        int var7 = class62.field1010;
        if (class257.field4496 < var7) {
            var7 = class257.field4496;
        }
        if (var7 < (class257.field4496 - 1)) {
            int var8 = class257.field4496 - 1;
        }
        if (class34.method170(107)) {
            class160.method1136(0);
        } else {
            class160.method1136(class62.field1010);
        }
        class213.method1469(6);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class51.method272(var9, var16, -28686);
            }
        }
        class75.method534((byte) -28);
        class190.method1361(205);
        class1.method2(-18384);
        class75.method540((byte) 109);
        if (class131.field2193 != null && class204.field3415 != null && class195.field3249 == 25) {
            class239.field4157++;
            class95.field1575.method424((byte) 99, 28);
            class95.field1575.method870(1057001181, (byte) 12);
        }
        if (!class100.field1657) {
            int var10 = (class147.field2470 - 6) / 8;
            int var11 = (class147.field2470 + 6) / 8;
            int var12 = (class70.field1129 - 6) / 8;
            int var13 = (class70.field1129 + 6) / 8;
            for (int var14 = var10 - 1; var14 <= var11 + 1; var14++) {
                for (int var15 = var12 - 1; var15 <= var13 + 1; var15++) {
                    if (var14 < var10 || var11 < var14 || var12 > var15 || var15 > var13) {
                        class143.field2392.method806(class20.method104(-123, new class51[] { class203.field3395, class51.method311(var14, 10), class159.field2607, class51.method311(var15, 10) }), 0);
                        class143.field2392.method806(class20.method104(-106, new class51[] { class171.field2804, class51.method311(var14, 10), class159.field2607, class51.method311(var15, 10) }), 0);
                    }
                }
            }
        }
        if (class195.field3249 == 28) {
            class100.method734(true, 10);
        } else {
            class100.method734(true, 30);
            if (class204.field3415 != null) {
                class95.field1575.method424((byte) 73, 179);
            }
        }
        class190.method1361(205);
        class14.method76((byte) -36);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public final void method458(boolean arg0) {
        if (arg0) {
            this.method463(-40, false);
        }
        this.field1058.method1495(114);
        field1077++;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(II)Lsd;")
    private final class41 method459(int arg0, int arg1) {
        class41 var3 = (class41) this.field1058.method1491((long) arg1, (byte) 95);
        field1060++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1072.method828(arg1, (byte) 110, arg0);
        if (var4 == null) {
            return null;
        } else {
            class121 var5 = new class121(var4);
            class41 var6 = new class41(var5);
            this.field1058.method1492(false, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    public final int method460(int arg0, int arg1) {
        field1071++;
        if (arg0 != -1765) {
            this.field1059 = null;
        }
        return this.field1074[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)Z")
    public final boolean method461(int arg0, int arg1) {
        if (arg0 == -1) {
            field1063++;
            class41 var3 = this.method459(0, arg1);
            return var3 == null ? false : var3.method214((byte) 49, this.field1054, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)Z")
    public final boolean method462(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method460(76, 43);
        }
        field1064++;
        return this.field1083[arg1];
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
    public final void method463(int arg0, boolean arg1) {
        field1070++;
        if (arg0 >= 86) {
            this.field1061 = arg1;
            this.method458(false);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FZI)[I")
    public final int[] method464(float arg0, boolean arg1, int arg2) {
        field1084++;
        class41 var4 = this.method459(0, arg2);
        if (var4 == null) {
            return null;
        } else {
            var4.field653 = arg1;
            return var4.method212(this.field1054, this.field1061 || this.field1056[arg2], arg0, this, -1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Llb;Z)V")
    public static final void method465(class121 arg0, boolean arg1) {
        field1065++;
        int var2 = class182.field3005 >> 1;
        int var3 = class177.field2892 >> 2 << 10;
        if (arg1) {
            method465((class121) null, false);
        }
        byte[][] var4 = new byte[class5.field38][class85.field1433];
        while (arg0.field2014.length > arg0.field2026) {
            int var33 = 0;
            int var34 = 0;
            boolean var35 = false;
            if (arg0.method897(-32) == 1) {
                var35 = true;
                var33 = arg0.method897(-81);
                var34 = arg0.method897(-115);
            }
            int var36 = arg0.method897(-62);
            int var37 = arg0.method897(-46);
            int var38 = var36 * 64 - class107.field1764;
            int var39 = class46.field736 + class85.field1433 - (var37 * 64) - 1;
            if (var38 >= 0 && var39 - 63 >= 0 && var38 + 63 < class5.field38 && class85.field1433 > var39) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var35 || var33 * 8 <= var40 && var40 < var33 * 8 + 8 && var34 * 8 <= var42 && var42 < var34 * 8 + 8) {
                            var41[var39 - var42] = arg0.method912((byte) -90);
                        }
                    }
                }
            } else if (var35) {
                arg0.field2026 += 64;
            } else {
                arg0.field2026 += 4096;
            }
        }
        int var5 = class85.field1433;
        int[] var6 = new int[var5];
        int var7 = class5.field38;
        int[] var8 = new int[var5];
        int[] var9 = new int[var5];
        int[] var10 = new int[var5];
        int[] var11 = new int[var5];
        for (int var12 = -5; var12 < var7; var12++) {
            for (int var13 = 0; var13 < var5; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var7) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class140 var29 = class218.method1501(var28 - 1, (byte) -44);
                        var6[var13] += var29.field2353;
                        var8[var13] += var29.field2358;
                        var9[var13] += var29.field2360;
                        var10[var13] += var29.field2354;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class140 var32 = class218.method1501(var31 - 1, (byte) -30);
                        var6[var13] -= var32.field2353;
                        var8[var13] -= var32.field2358;
                        var9[var13] -= var32.field2360;
                        var10[var13] -= var32.field2354;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class45.field716[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var5; var20++) {
                    int var21 = var20 + 5;
                    if (var21 < var5) {
                        var14 += var6[var21];
                        var16 += var8[var21];
                        var17 += var9[var21];
                        var19 += var11[var21];
                        var18 += var10[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var17 -= var9[var22];
                        var16 -= var8[var22];
                        var18 -= var10[var22];
                        var14 -= var6[var22];
                        var19 -= var11[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class39.method193(var17 / var19, var16 / var19, var14 * 256 / var18, (byte) 53);
                        if (var4[var12][var20] != 0) {
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 + var3 & 0xFC00) + (var24 & 0x380) + var25;
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            var23[(class191.method1366(63, var20) << 6) + class191.method1366(var12, 63)] = class73.field1161[class29.method147(var26, 96, true)];
                        } else if (var23 != null) {
                            var23[(class191.method1366(63, var20) << 6) + class191.method1366(63, var12)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)[I")
    public final int[] method466(int arg0, int arg1) {
        field1087++;
        class41 var3 = this.method459(0, arg1);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -25 % ((32 - arg0) / 61);
            return var3.method213(this, this.field1061 || this.field1056[arg1], (byte) 67, this.field1054);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)Z")
    public final boolean method467(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method459(71, -82);
        }
        field1079++;
        return this.field1061 || this.field1056[arg1];
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public static void method468(int arg0) {
        field1085 = null;
        if (arg0 > -73) {
            field1055 = null;
        }
        field1055 = null;
        field1068 = null;
        field1081 = null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lu;Lu;Lu;IZ)V")
    public class66(class111 arg0, class111 arg1, class111 arg2, int arg3, boolean arg4) {
        this.field1072 = arg0;
        this.field1057 = arg3;
        this.field1061 = arg4;
        this.field1054 = arg2;
        this.field1058 = new class217(this.field1057);
        class121 var6 = new class121(arg1.method828(0, (byte) 92, 0));
        int var7 = var6.method876(false);
        this.field1074 = new short[var7];
        this.field1089 = new byte[var7];
        this.field1090 = new boolean[var7];
        this.field1062 = new byte[var7];
        this.field1083 = new boolean[var7];
        this.field1088 = new boolean[var7];
        this.field1086 = new byte[var7];
        this.field1059 = new boolean[var7];
        this.field1067 = new byte[var7];
        this.field1056 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1088[var8] = var6.method897(120) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1088[var9]) {
                this.field1090[var9] = var6.method897(-51) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1088[var10]) {
                this.field1083[var10] = var6.method897(111) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1088[var11]) {
                this.field1056[var11] = var6.method897(127) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1088[var12]) {
                this.field1059[var12] = var6.method897(-109) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1088[var13]) {
                this.field1067[var13] = var6.method912((byte) -90);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1088[var14]) {
                this.field1086[var14] = var6.method912((byte) -90);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1088[var15]) {
                this.field1062[var15] = var6.method912((byte) -90);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1088[var16]) {
                this.field1089[var16] = var6.method912((byte) -90);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1088[var17]) {
                this.field1074[var17] = (short) var6.method876(false);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)Z")
    public final boolean method469(int arg0, int arg1) {
        if (arg1 == 64) {
            field1076++;
            return this.field1090[arg0];
        } else {
            return false;
        }
    }
}
