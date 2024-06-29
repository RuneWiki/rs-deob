import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lva;")
    private class145 field429 = new class145();

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Ltd;")
    public static class136 field420 = class145.method1172(")1p", 45);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ltd;")
    private static class136 field417 = class145.method1172("Loaded interfaces", 45);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Ltd;")
    public static class136 field432 = class145.method1172("Anmelde)2Zeitlimit -Uberschritten)3", 45);

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[B")
    public static byte[] field427 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ltd;")
    public static class136 field418 = field417;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lw;")
    public static class150 field423;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Leb;")
    public static class31 field419;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lva;")
    public final class145 method154(int arg0) {
        if (arg0 < 24) {
            field417 = null;
        }
        field434++;
        class145 var2 = this.field429.field3349;
        if (this.field429 == var2) {
            return null;
        } else {
            var2.method1171(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method155(int arg0) {
        if (arg0 < 104) {
            method158(87);
        }
        if (field419 != null) {
            field419.method258(88);
        }
        if (class71.field1506 != null) {
            class71.field1506.method258(86);
        }
        field421++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILva;)V")
    public final void method156(int arg0, class145 arg1) {
        field424++;
        if (arg1.field3342 != null) {
            arg1.method1171(true);
        }
        arg1.field3342 = this.field429.field3342;
        if (arg0 != -30773) {
            field423 = null;
        }
        arg1.field3349 = this.field429;
        arg1.field3342.field3349 = arg1;
        arg1.field3349.field3342 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
    public static final void method157(boolean arg0, int arg1) {
        class154.field3529 = arg0;
        if (arg1 != 6) {
            field423 = null;
        }
        field426++;
        if (!class154.field3529) {
            int var2 = class4.field70.method1020(false);
            int var3 = class4.field70.method1011(16);
            int var4 = (class11.field179 - class4.field70.field2995) / 16;
            class65.field1397 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class65.field1397[var5][var14] = class4.field70.method987(-85);
                }
            }
            int var6 = class4.field70.method1007(6119);
            int var7 = class4.field70.method1019((byte) -51);
            int var8 = class4.field70.method1004((byte) -92);
            class101.field2426 = new int[var4];
            boolean var9 = false;
            class88.field2091 = new byte[var4][];
            if ((var6 / 8 == 48 || var6 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var6 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            class54.field1197 = new byte[var4][];
            class108.field2564 = new int[var4];
            class56.field1277 = new int[var4];
            int var10 = 0;
            for (int var11 = (var6 - 6) / 8; var11 <= (var6 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class108.field2564[var10] = var13;
                        class56.field1277[var10] = class122.field2844.method645(class79.method570(0, new class136[] { class13.field264, class19.method140(var11, -126), class112.field2606, class19.method140(var12, -89) }), true);
                        class101.field2426[var10] = class122.field2844.method645(class79.method570(0, new class136[] { class136.field3195, class19.method140(var11, -86), class112.field2606, class19.method140(var12, -95) }), true);
                        var10++;
                    }
                }
            }
            class26.method229(var6, var2, var3, var8, var7, arg1 ^ 0x7);
            return;
        }
        int var15 = class4.field70.method1004((byte) -126);
        int var16 = class4.field70.method1020(false);
        int var17 = class4.field70.method1011(107);
        int var18 = class4.field70.method1004((byte) -125);
        class4.field70.method875((byte) 37);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class4.field70.method877(false, 1);
                    if (var37 == 1) {
                        class73.field1538[var19][var35][var36] = class4.field70.method877(false, 26);
                    } else {
                        class73.field1538[var19][var35][var36] = -1;
                    }
                }
            }
        }
        class4.field70.method865(27176);
        int var20 = (class11.field179 - class4.field70.field2995) / 16;
        class65.field1397 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class65.field1397[var21][var34] = class4.field70.method999(0);
            }
        }
        int var22 = class4.field70.method1020(false);
        class56.field1277 = new int[var20];
        class108.field2564 = new int[var20];
        class88.field2091 = new byte[var20][];
        class101.field2426 = new int[var20];
        class54.field1197 = new byte[var20][];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class73.field1538[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 3 & 0x7FF;
                        int var29 = var27 >> 14 & 0x3FF;
                        int var30 = (var29 / 8 << 8) + (var28 / 8);
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class108.field2564[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class108.field2564[var23] = var30;
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class56.field1277[var23] = class122.field2844.method645(class79.method570(arg1 - 6, new class136[] { class13.field264, class19.method140(var32, -116), class112.field2606, class19.method140(var33, -77) }), true);
                            class101.field2426[var23] = class122.field2844.method645(class79.method570(0, new class136[] { class136.field3195, class19.method140(var32, -87), class112.field2606, class19.method140(var33, class19.method146(arg1, -113)) }), true);
                            var23++;
                        }
                    }
                }
            }
        }
        class26.method229(var16, var18, var17, var22, var15, 1);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public static void method158(int arg0) {
        field432 = null;
        field419 = null;
        field417 = null;
        field420 = null;
        field418 = null;
        if (arg0 != 103) {
            method159(null, 120, -71, -24);
        }
        field427 = null;
        field423 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BIII)Z")
    public static final boolean method159(byte[] arg0, int arg1, int arg2, int arg3) {
        field416++;
        if (arg1 > -97) {
            method161((byte) 30);
        }
        class127 var4 = new class127(arg0);
        boolean var5 = true;
        int var6 = -1;
        label74: while (true) {
            int var7 = var4.method1027(false);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class128 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method1027(false);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var4.method1011(31);
                                    }
                                    int var10 = var4.method1027(false);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var4.method1011(65) >> 2;
                                    var14 = arg2 + var12;
                                    var15 = arg3 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class142.method1154(var6, -127);
                } while (var13 == 22 && class65.field1399 && var16.field3037 == 0 && var16.field3026 != 1 && !var16.field3028);
                if (!var16.method1049(-8747)) {
                    var5 = false;
                    class113.field2622++;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Lva;")
    public final class145 method160(int arg0) {
        if (arg0 > -53) {
            method157(true, 60);
        }
        class145 var2 = this.field429.field3349;
        field431++;
        return this.field429 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method161(byte arg0) {
        field428++;
        int var1 = class80.field1892 * 128 + 64;
        int var2 = class155.field3602 * 128 + 64;
        int var3 = class65.method486(class62.field1331, (byte) -42, var2, var1) - class145.field3340;
        if (class9.field168 < var1) {
            class9.field168 += (var1 - class9.field168) * class11.field180 / 1000 + class11.field193;
            if (var1 < class9.field168) {
                class9.field168 = var1;
            }
        }
        if (var3 > class28.field621) {
            class28.field621 += (var3 - class28.field621) * class11.field180 / 1000 + class11.field193;
            if (class28.field621 > var3) {
                class28.field621 = var3;
            }
        }
        if (var1 < class9.field168) {
            class9.field168 -= (class9.field168 - var1) * class11.field180 / 1000 + class11.field193;
            if (var1 > class9.field168) {
                class9.field168 = var1;
            }
        }
        if (class100.field2409 < var2) {
            class100.field2409 += class11.field193 + (var2 - class100.field2409) * class11.field180 / 1000;
            if (var2 < class100.field2409) {
                class100.field2409 = var2;
            }
        }
        if (class100.field2409 > var2) {
            class100.field2409 -= (class100.field2409 - var2) * class11.field180 / 1000 + class11.field193;
            if (class100.field2409 < var2) {
                class100.field2409 = var2;
            }
        }
        if (class28.field621 > var3) {
            class28.field621 -= (class28.field621 - var3) * class11.field180 / 1000 + class11.field193;
            if (var3 > class28.field621) {
                class28.field621 = var3;
            }
        }
        int var4 = class79.field1820 * 128 + 64;
        int var5 = class63.field1358 * 128 + 64;
        int var6 = class65.method486(class62.field1331, (byte) -42, var4, var5) - class8.field147;
        int var7 = var6 - class28.field621;
        if (arg0 != 84) {
            return;
        }
        int var8 = var5 - class9.field168;
        int var9 = var4 - class100.field2409;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class12.field228) {
            class12.field228 += (var11 - class12.field228) * class63.field1346 / 1000 + class43.field975;
            if (class12.field228 > var11) {
                class12.field228 = var11;
            }
        }
        int var13 = var12 - class83.field1976;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < class12.field228) {
            class12.field228 -= class43.field975 + (class12.field228 - var11) * class63.field1346 / 1000;
            if (var11 > class12.field228) {
                class12.field228 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class83.field1976 += class43.field975 + class63.field1346 * var13 / 1000;
            class83.field1976 &= 0x7FF;
        }
        if (var13 < 0) {
            class83.field1976 -= -var13 * class63.field1346 / 1000 + class43.field975;
            class83.field1976 &= 0x7FF;
        }
        int var14 = var12 - class83.field1976;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class83.field1976 = var12;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)I")
    public static final int method162(byte arg0) {
        field422++;
        int var1 = 117 / ((arg0 + 48) / 33);
        return class74.field1682++;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(ILva;)V")
    public final void method163(int arg0, class145 arg1) {
        if (arg1.field3342 != null) {
            arg1.method1171(true);
        }
        arg1.field3342 = this.field429;
        if (arg0 != -25373) {
            method161((byte) 109);
        }
        arg1.field3349 = this.field429.field3349;
        field430++;
        arg1.field3342.field3349 = arg1;
        arg1.field3349.field3342 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILwe;)V")
    public static final void method164(int arg0, class155 arg1) {
        arg1.field3584 = false;
        if (arg1.field3594 != -1) {
            class116 var2 = class29.method252(true, arg1.field3594);
            if (var2 == null || var2.field2676 == null) {
                arg1.field3594 = -1;
            } else {
                arg1.field3593++;
                if (arg1.field3543 < var2.field2676.length && var2.field2650[arg1.field3543] < arg1.field3593) {
                    arg1.field3593 = 1;
                    arg1.field3543++;
                    class155.method1213(arg1.field3543, arg1.field3580, arg0 + 129, arg1.field3578, var2);
                }
                if (var2.field2676.length <= arg1.field3543) {
                    arg1.field3543 = 0;
                    arg1.field3593 = 0;
                    class155.method1213(arg1.field3543, arg1.field3580, 128, arg1.field3578, var2);
                }
            }
        }
        field433++;
        if (arg1.field3579 != -1 && class44.field1013 >= arg1.field3607) {
            if (arg1.field3551 < 0) {
                arg1.field3551 = 0;
            }
            int var3 = class151.method1191(arg1.field3579, arg0 + 14).field639;
            if (var3 == -1) {
                arg1.field3579 = -1;
            } else {
                class116 var4 = class29.method252(true, var3);
                if (var4 == null || var4.field2676 == null) {
                    arg1.field3579 = -1;
                } else {
                    arg1.field3590++;
                    if (var4.field2676.length > arg1.field3551 && var4.field2650[arg1.field3551] < arg1.field3590) {
                        arg1.field3590 = 1;
                        arg1.field3551++;
                        class155.method1213(arg1.field3551, arg1.field3580, arg0 ^ 0xFFFFFF7F, arg1.field3578, var4);
                    }
                    if (var4.field2676.length <= arg1.field3551 && (arg1.field3551 < 0 || arg1.field3551 >= var4.field2676.length)) {
                        arg1.field3579 = -1;
                    }
                }
            }
        }
        if (arg1.field3585 != arg0 && arg1.field3598 <= 1) {
            class116 var5 = class29.method252(true, arg1.field3585);
            if (var5.field2660 == 1 && arg1.field3536 > 0 && class44.field1013 >= arg1.field3576 && class44.field1013 > arg1.field3539) {
                arg1.field3598 = 1;
                return;
            }
        }
        if (arg1.field3585 != -1 && arg1.field3598 == 0) {
            class116 var6 = class29.method252(true, arg1.field3585);
            if (var6 == null || var6.field2676 == null) {
                arg1.field3585 = -1;
            } else {
                arg1.field3588++;
                if (arg1.field3546 < var6.field2676.length && var6.field2650[arg1.field3546] < arg1.field3588) {
                    arg1.field3546++;
                    arg1.field3588 = 1;
                    class155.method1213(arg1.field3546, arg1.field3580, 128, arg1.field3578, var6);
                }
                if (arg1.field3546 >= var6.field2676.length) {
                    arg1.field3591++;
                    arg1.field3546 -= var6.field2646;
                    if (var6.field2663 <= arg1.field3591) {
                        arg1.field3585 = -1;
                    } else if (arg1.field3546 >= 0 && var6.field2676.length > arg1.field3546) {
                        class155.method1213(arg1.field3546, arg1.field3580, 128, arg1.field3578, var6);
                    } else {
                        arg1.field3585 = -1;
                    }
                }
                arg1.field3584 = var6.field2655;
            }
        }
        if (arg1.field3598 > 0) {
            arg1.field3598--;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class21() {
        this.field429.field3349 = this.field429;
        this.field429.field3342 = this.field429;
    }
}
