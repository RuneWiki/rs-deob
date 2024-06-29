import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class167 extends class130 {

    @OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
    public byte[] field3221;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[Lbb;")
    public class13[] field3208;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "[S")
    public short[] field3223;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[B")
    public byte[] field3205;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[Lvc;")
    public class192[] field3207;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "[I")
    private int[] field3220;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "[B")
    public byte[] field3212;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[B")
    public static byte[] field3206 = new byte[520];

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Lsd;")
    public static class166 field3214 = class135.method935("Weiter", 0);

    @OriginalMember(owner = "client!se", name = "C", descriptor = "Lsd;")
    private static class166 field3216 = class135.method935("Loaded title screen", 0);

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lsd;")
    public static class166 field3217 = field3216;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "[I")
    public static int[] field3219 = new int[1000];

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
    public static final void method1162(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < class98.field1880; var2++) {
            class154 var3 = class124.field2434[class58.field1186[var2]];
            int var4 = (class58.field1186[var2] << 14) + 536870912;
            if (var3 != null && var3.method885(arg0 ^ 0xFFFFE629) && var3.field2958.field1572 == arg1 && var3.field2958.method634((byte) -99)) {
                int var5 = var3.field3513 >> 7;
                int var6 = var3.field3526 >> 7;
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    if (var3.field3490 == 1 && (var3.field3526 & 0x7F) == 64 && (var3.field3513 & 0x7F) == 64) {
                        if (class160.field3070[var6][var5] == class112.field2194) {
                            continue;
                        }
                        class160.field3070[var6][var5] = class112.field2194;
                    }
                    if (!var3.field2958.field1565) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class131.field2556.method590(class165.field3130, var3.field3526, var3.field3513, class119.method864((var3.field3490 - 1) * 64 + var3.field3526, var3.field3513 - (-(var3.field3490 * 64) + 64), class165.field3130, true), (var3.field3490 - 1) * 64 + 60, var3, var3.field3488, var4, var3.field3534);
                }
            }
        }
        field3210++;
        if (arg0 != -6612) {
            field3224 = -77;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([ILwa;[BB)Z")
    public final boolean method1163(int[] arg0, class199 arg1, byte[] arg2, byte arg3) {
        field3211++;
        boolean var5 = true;
        int var6 = 0;
        class13 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var10 = this.field3220[var8];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg1.method1310(arg0, var10 >> 2, true);
                        } else {
                            var7 = arg1.method1314(arg0, (byte) 60, var10 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3208[var8] = var7;
                        this.field3220[var8] = 0;
                    }
                }
            }
        }
        int var9 = 63 / ((arg3 - 27) / 51);
        return var5;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([Lsd;I)[Lsd;")
    public static final class166[] method1164(class166[] arg0, int arg1) {
        if (arg1 != 5) {
            field3217 = null;
        }
        field3215++;
        class166[] var2 = new class166[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class22.method148(new class166[] { class174.method1192(false, var3), class117.field2257 }, 0);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class22.method148(new class166[] { var2[var3], arg0[var3] }, arg1 - 5);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
    public static void method1165(int arg0) {
        field3219 = null;
        if (arg0 != -19712) {
            method1165(-13);
        }
        field3206 = null;
        field3217 = null;
        field3214 = null;
        field3216 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILp;)V")
    public static final void method1166(int arg0, class135 arg1) {
        field3209++;
        if (class117.field2265) {
            class57.method488(false, arg1);
            return;
        }
        if (class2.field18 == 1 && class69.field1409 >= 715 && class57.field1174 >= 453) {
            class120.field2355 = !class120.field2355;
            if (class120.field2355) {
                class28.method203(1);
            } else {
                class93.method724(class12.field225, class11.field213, false, class199.field3939, 103, 255);
            }
        }
        if (client.field520 == 5) {
            return;
        }
        class46.field821++;
        if (arg0 > -107) {
            method1164(null, -15);
        }
        if (client.field520 != 10) {
            return;
        }
        if (class196.field3877 != 2 && class116.field2246 == 0) {
            if (class2.field18 == 1) {
                short var2 = 463;
                byte var3 = 5;
                byte var4 = 100;
                byte var5 = 35;
                if (class69.field1409 >= var3 && var3 + var4 >= class69.field1409 && var2 <= class57.field1174 && var2 + var5 >= class57.field1174) {
                    class19.method117(-1);
                    return;
                }
            }
            if (class86.field1706 != null) {
                class19.method117(-1);
            }
        }
        int var6 = class69.field1409;
        int var7 = class2.field18;
        int var8 = class57.field1174;
        if (class172.field3299 == 0) {
            short var9 = 302;
            boolean var10 = false;
            short var11 = 291;
            if (var7 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var8 >= var11 - 20 && var11 + 20 >= var8) {
                class153.field2954 = 0;
                class172.field3299 = 3;
            }
            if (class102.field2015 != 0) {
                while (class10.method60(-1)) {
                    if (class77.field1586 == 84) {
                        var10 = true;
                        break;
                    }
                }
            }
            short var12 = 462;
            if (var10 || var7 == 1 && var12 - 75 <= var6 && var12 + 75 >= var6 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                class153.field2954 = 0;
                class12.field228 = class102.field1976;
                class12.field231 = class102.field1978;
                class12.field222 = class25.field458;
                class172.field3299 = 2;
            }
        } else if (class172.field3299 == 2) {
            short var13 = 231;
            int var21 = var13 + 30;
            if (var7 == 1 && var8 >= var21 - 15 && var8 < var21) {
                class153.field2954 = 0;
            }
            var21 += 15;
            if (var7 == 1 && var8 >= var21 - 15 && var21 > var8) {
                class153.field2954 = 1;
            }
            short var14 = 302;
            var21 += 15;
            short var15 = 321;
            if (var7 == 1 && var6 >= var14 - 75 && var14 + 75 >= var6 && var15 - 20 <= var8 && var15 + 20 >= var8) {
                class12.field235 = class12.field235.method1160(90).method1159(-74);
                if (class12.field235.method1143(true) == 0) {
                    class174.method1193(class175.field3322, class102.field1993, (byte) -102, class102.field1960);
                } else if (class12.field236.method1143(true) == 0) {
                    class174.method1193(class184.field3494, class102.field1973, (byte) -107, class102.field2008);
                } else {
                    class174.method1193(class14.field257, class102.field1964, (byte) 115, class102.field1963);
                    class88.method695((byte) -125, 20);
                }
            } else {
                short var16 = 462;
                if (var7 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var15 - 20 <= var8 && var15 + 20 >= var8) {
                    class12.field235 = class12.field225;
                    class172.field3299 = 0;
                    class12.field236 = class12.field225;
                }
                while (true) {
                    boolean var17;
                    label243: do {
                        while (class10.method60(-1)) {
                            var17 = false;
                            for (int var18 = 0; var18 < class29.field527.method1143(true); var18++) {
                                if (class34.field644 == class29.field527.method1152(-98, var18)) {
                                    var17 = true;
                                    break;
                                }
                            }
                            if (class153.field2954 != 0) {
                                continue label243;
                            }
                            if (class77.field1586 == 85 && class12.field235.method1143(true) > 0) {
                                class12.field235 = class12.field235.method1121(10876, class12.field235.method1143(true) - 1, 0);
                            }
                            if (class77.field1586 == 84 || class77.field1586 == 80) {
                                class153.field2954 = 1;
                            }
                            if (var17 && class12.field235.method1143(true) < 12) {
                                class12.field235 = class12.field235.method1140(class34.field644, (byte) -78);
                            }
                        }
                        return;
                    } while (class153.field2954 != 1);
                    if (class77.field1586 == 85 && class12.field236.method1143(true) > 0) {
                        class12.field236 = class12.field236.method1121(10876, class12.field236.method1143(true) - 1, 0);
                    }
                    if (class77.field1586 == 84 || class77.field1586 == 80) {
                        class153.field2954 = 0;
                    }
                    if (class102.field2015 != 0 && class77.field1586 == 84) {
                        class12.field235 = class12.field235.method1160(90).method1159(-115);
                        if (class12.field235.method1143(true) == 0) {
                            class174.method1193(class175.field3322, class102.field1993, (byte) 115, class102.field1960);
                            return;
                        }
                        if (class12.field236.method1143(true) == 0) {
                            class174.method1193(class184.field3494, class102.field1973, (byte) 120, class102.field2008);
                            return;
                        }
                        class174.method1193(class14.field257, class102.field1964, (byte) -118, class102.field1963);
                        class88.method695((byte) -125, 20);
                        return;
                    }
                    if (var17 && class12.field236.method1143(true) < 20) {
                        class12.field236 = class12.field236.method1140(class34.field644, (byte) 111);
                    }
                }
            }
        } else if (class172.field3299 == 3) {
            short var19 = 382;
            short var20 = 321;
            if (var7 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var8 >= var20 - 20 && var8 <= var20 + 20) {
                class172.field3299 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public final void method1167(int arg0) {
        field3213++;
        if (arg0 == 0) {
            this.field3220 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class167() {
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
    public class167(byte[] arg0) {
        this.field3221 = new byte[128];
        this.field3208 = new class13[128];
        int var2 = 0;
        this.field3223 = new short[128];
        this.field3205 = new byte[128];
        this.field3207 = new class192[128];
        this.field3220 = new int[128];
        this.field3212 = new byte[128];
        class53 var3 = new class53(arg0);
        while (var3.field988[var3.field1000 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method388(-29381);
        }
        var3.field1000++;
        var2++;
        int var6 = var3.field1000;
        var3.field1000 += var2;
        int var7;
        for (var7 = 0; var3.field988[var3.field1000 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method388(-29381);
        }
        int var10 = 0;
        var7++;
        var3.field1000++;
        int var11 = var3.field1000;
        var3.field1000 += var7;
        while (var3.field988[var3.field1000 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method388(-29381);
        }
        var3.field1000++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method400(255);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var10;
        }
        class192[] var19 = new class192[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class192 var103 = var19[var20] = new class192();
            int var104 = var3.method400(255);
            if (var104 > 0) {
                var103.field3649 = new byte[var104 * 2];
            }
            int var105 = var3.method400(255);
            if (var105 > 0) {
                var103.field3653 = new byte[var105 * 2 + 2];
                var103.field3653[1] = 64;
            }
        }
        int var21 = var3.method400(255);
        int var22 = 0;
        byte[] var23 = var21 > 0 ? new byte[var21 * 2] : null;
        int var24 = var3.method400(255);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        while (var3.field988[var3.field1000 + var22] != 0) {
            var22++;
        }
        byte[] var26 = new byte[var22];
        for (int var27 = 0; var27 < var22; var27++) {
            var26[var27] = var3.method388(-29381);
        }
        var22++;
        var3.field1000++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method400(255);
            this.field3223[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method400(255);
            this.field3223[var31] = (short) (this.field3223[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var3.method397(128);
            }
            var32--;
            this.field3223[var35] = (short) (this.field3223[var35] + (class22.method151(var34 - 1, 2) << 14));
            this.field3220[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3220[var39] != 0) {
                if (var36 == 0) {
                    if (var38 < var4.length) {
                        var36 = var4[var38++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var3.field988[var6++] - 1;
                }
                var36--;
                this.field3205[var39] = (byte) var37;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3220[var43] != 0) {
                if (var40 == 0) {
                    var42 = var3.field988[var11++] + 16 << 2;
                    if (var8.length <= var41) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                }
                var40--;
                this.field3212[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class192 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3220[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field3207[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var49 >= var26.length) {
                    var50 = -1;
                } else {
                    var50 = var26[var49++];
                }
                if (this.field3220[var51] > 0) {
                    var48 = var3.method400(255) + 1;
                }
            }
            this.field3221[var51] = (byte) var48;
            var50--;
        }
        this.field3222 = var3.method400(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class192 var100 = var19[var52];
            if (var100.field3649 != null) {
                for (int var101 = 1; var101 < var100.field3649.length; var101 += 2) {
                    var100.field3649[var101] = var3.method388(-29381);
                }
            }
            if (var100.field3653 != null) {
                for (int var102 = 3; var102 < var100.field3653.length - 2; var102 += 2) {
                    var100.field3653[var102] = var3.method388(-29381);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method388(-29381);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method388(-29381);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class192 var97 = var19[var55];
            if (var97.field3653 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3653.length; var99 += 2) {
                    var98 += var3.method400(255) + 1;
                    var97.field3653[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class192 var94 = var19[var56];
            if (var94.field3649 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3649.length; var96 += 2) {
                    var95 += var3.method400(255) + 1;
                    var94.field3649[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method400(255);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var57 + var3.method400(255) + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[1];
            byte var60 = var23[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field3221[var61] = (byte) (this.field3221[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var23.length) {
                byte var65 = var23[var62 + 1];
                byte var66 = var23[var62];
                int var67 = (var66 - var60) * var59 + (var66 - var60) / 2;
                var62 += 2;
                for (int var68 = var60; var68 < var66; var68++) {
                    int var69 = class166.method1158(var66 - var60, var67, 31818);
                    var67 += var65 - var59;
                    this.field3221[var68] = (byte) (this.field3221[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var60; var63 < 128; var63++) {
                this.field3221[var63] = (byte) (this.field3221[var63] * var59 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method400(255);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var3.method400(255) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3212[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3212[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                var75 += 2;
                int var81 = (var80 - var72) / 2 + (var80 - var72) * var73;
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = class166.method1158(var80 - var72, var81, 31818);
                    int var84 = (this.field3212[var82] & 0xFF) + var83;
                    var81 += var79 - var73;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3212[var82] = (byte) var84;
                }
                var73 = var79;
                var72 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field3212[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3212[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3640 = var3.method400(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class192 var93 = var19[var87];
            if (var93.field3649 != null) {
                var93.field3648 = var3.method400(255);
            }
            if (var93.field3653 != null) {
                var93.field3646 = var3.method400(255);
            }
            if (var93.field3640 > 0) {
                var93.field3638 = var3.method400(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3651 = var3.method400(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class192 var92 = var19[var89];
            if (var92.field3651 > 0) {
                var92.field3650 = var3.method400(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class192 var91 = var19[var90];
            if (var91.field3650 > 0) {
                var91.field3639 = var3.method400(255);
            }
        }
    }
}
