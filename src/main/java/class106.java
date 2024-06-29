import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lhb;")
    private class51 field2535 = new class51();

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lic;")
    public static class59 field2533 = class59.method433(0, "Welt");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2526 = 0;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lic;")
    private static class59 field2528 = class59.method433(0, "Connecting to update server");

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lic;")
    private static class59 field2529 = class59.method433(0, "wave:");

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lic;")
    public static class59 field2540 = class59.method433(0, "");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[Z")
    public static boolean[] field2524 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lic;")
    public static class59 field2534 = class59.method433(0, "mod_icons");

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2541 = 0;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lic;")
    public static class59 field2523 = field2529;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Lic;")
    private static class59 field2547 = class59.method433(0, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field2549 = 500;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lic;")
    public static class59 field2521 = field2547;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lic;")
    public static class59 field2532 = field2528;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lic;")
    public static class59 field2530 = field2529;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Lic;")
    public static class59 field2542 = class59.method433(0, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static final void method819(boolean arg0) {
        field2545++;
        if (!arg0) {
            method822(55);
        }
        try {
            if (class125.field2849 == 1) {
                int var1 = class49.field1245.method481((byte) 125);
                if (var1 > 0 && class49.field1245.method465((byte) -76)) {
                    int var2 = var1 - class41.field1047;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class49.field1245.method463(var2, (byte) 116);
                } else {
                    class49.field1245.method499(75);
                    class49.field1245.method477(3);
                    class9.field180 = null;
                    if (class76.field1861 == null) {
                        class125.field2849 = 0;
                    } else {
                        class125.field2849 = 2;
                    }
                    class131.field2940 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class49.field1245.method499(64);
            class131.field2940 = null;
            class125.field2849 = 0;
            class76.field1861 = null;
            class9.field180 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lic;B)V")
    public static final void method820(class59 arg0, byte arg1) {
        field2536++;
        if (arg1 >= -32) {
            method822(124);
        }
        if (class9.field193 >= 2) {
            if (arg0.method423(class36.field951, -61)) {
                System.gc();
            }
            if (arg0.method423(class24.field581, -61)) {
                class114.method922((byte) 127);
            }
            if (arg0.method423(class77.field1888, -61)) {
                class1.field11 = true;
            }
            if (arg0.method423(class68.field1700, -61)) {
                class1.field11 = false;
            }
            if (arg0.method423(class139.field3110, -61)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class108.field2616[var2].field1829[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method423(class3.field60, -61) && class96.field2432 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method443((byte) 34, class118.field2744)) {
                class89.field2247 = arg0.method452(-805469788, 12).method429(37).method440(10);
                class127.method972(class46.method358(new class59[] { class16.field307, class46.method361(class89.field2247, 80) }, (byte) -75), null, 0, 26018);
            }
            if (arg0.method423(class70.field1773, -61)) {
                class35.field925 = true;
            }
        }
        class125.field2842.method1072(217, -1);
        class60.field1479++;
        class125.field2842.method1205(arg0.method437((byte) 52) - 1, 8584);
        class125.field2842.method1187(106, arg0.method452(-805469788, 2));
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZIBI)Lic;")
    public static final class59 method821(boolean arg0, int arg1, byte arg2, int arg3) {
        field2538++;
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        int var4 = 1;
        for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg3;
            arg1 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class59 var9 = new class59();
        var9.field1418 = var6;
        if (arg2 != 98) {
            method820(null, (byte) 28);
        }
        var9.field1448 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method822(int arg0) {
        field2532 = null;
        field2530 = null;
        field2524 = null;
        field2542 = null;
        field2534 = null;
        field2547 = null;
        field2540 = null;
        field2521 = null;
        field2523 = null;
        field2528 = null;
        field2533 = null;
        field2529 = null;
        if (arg0 != 2047) {
            field2528 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lhb;")
    public final class51 method823(byte arg0) {
        class51 var2 = this.field2535.field1268;
        field2543++;
        if (this.field2535 == var2) {
            return null;
        } else if (arg0 == 119) {
            var2.method387((byte) -109);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Lhb;")
    public final class51 method824(boolean arg0) {
        field2550++;
        class51 var2 = this.field2535.field1268;
        if (this.field2535 == var2) {
            return null;
        } else {
            if (arg0) {
                this.method824(true);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(Z)V")
    public static final void method825(boolean arg0) {
        class151.field3283.method676((byte) -112);
        if (!arg0) {
            method827(-17, (byte) -2);
        }
        class94.field2407.method676((byte) -101);
        field2522++;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static final void method826(int arg0) {
        for (int var1 = 0; var1 < class103.field2510; var1++) {
            int var2 = class53.field1309[var1];
            class90 var3 = class47.field1210[var2];
            if (var3 != null) {
                class21.method118(var3, 1218, var3.field2276.field2817);
            }
        }
        if (arg0 != 18618) {
            method830(127, 11, 7, -37, -21, 40, -84);
        }
        field2527++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Z")
    public static final boolean method827(int arg0, byte arg1) {
        field2525++;
        if (arg1 > -120) {
            field2547 = null;
        }
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lhb;I)V")
    public final void method828(class51 arg0, int arg1) {
        field2537++;
        if (arg0.field1266 != null) {
            arg0.method387((byte) -74);
        }
        arg0.field1266 = this.field2535;
        arg0.field1268 = this.field2535.field1268;
        arg0.field1266.field1268 = arg0;
        int var3 = -7 % ((-arg1 - 8) / 48);
        arg0.field1268.field1266 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILhb;)V")
    public final void method829(int arg0, class51 arg1) {
        if (arg0 != -1) {
            return;
        }
        if (arg1.field1266 != null) {
            arg1.method387((byte) -94);
        }
        arg1.field1266 = this.field2535.field1266;
        arg1.field1268 = this.field2535;
        arg1.field1266.field1268 = arg1;
        arg1.field1268.field1266 = arg1;
        field2546++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2548++;
        int var7 = 2048 - arg0 & 0x7FF;
        int var8 = 2048 - arg1 & 0x7FF;
        if (arg4 != -104) {
            method826(-20);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5;
        if (var7 != 0) {
            int var12 = class11.field249[var7];
            int var13 = class11.field244[var7];
            int var14 = var10 * var12 - arg5 * var13 >> 16;
            var11 = var10 * var13 + arg5 * var12 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class11.field244[var8];
            int var16 = class11.field249[var8];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class26.field672 = arg0;
        client.field495 = arg1;
        class15.field295 = arg6 - var11;
        class51.field1271 = arg2 - var9;
        class134.field2989 = arg3 - var10;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public static final void method831(int arg0) {
        field2539++;
        class134.field2964.method676((byte) -125);
        if (arg0 != 500) {
            method822(114);
        }
        class52.field1287.method676((byte) -110);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class106() {
        this.field2535.field1266 = this.field2535;
        this.field2535.field1268 = this.field2535;
    }
}
