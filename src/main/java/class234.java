import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class234 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lnh;")
    public class288 field3374 = new class288();

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Z")
    public static boolean field3375 = true;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lrc;")
    public static class9 field3376 = new class9(64);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lnh;")
    private class288 field3378;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lnh;I)V")
    public final void method1522(class288 arg0, int arg1) {
        if (arg0.field4482 != null) {
            arg0.method1935(119);
        }
        int var3 = 48 / ((arg1 - 43) / 59);
        arg0.field4482 = this.field3374.field4482;
        arg0.field4487 = this.field3374;
        arg0.field4482.field4487 = arg0;
        arg0.field4487.field4482 = arg0;
        field3371++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lnh;")
    public final class288 method1523(int arg0) {
        class288 var2 = this.field3378;
        field3369++;
        if (arg0 >= -49) {
            method1524(125);
        }
        if (this.field3374 == var2) {
            this.field3378 = null;
            return null;
        } else {
            this.field3378 = var2.field4487;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method1524(int arg0) {
        field3376 = null;
        if (arg0 != 40) {
            field3375 = false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Lnh;")
    public final class288 method1525(byte arg0) {
        class288 var2 = this.field3378;
        field3380++;
        if (arg0 >= -82) {
            return null;
        } else if (this.field3374 == var2) {
            this.field3378 = null;
            return null;
        } else {
            this.field3378 = var2.field4482;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Lnh;")
    public final class288 method1526(int arg0) {
        field3370++;
        if (arg0 != 16383) {
            this.field3374 = null;
        }
        class288 var2 = this.field3374.field4487;
        if (this.field3374 == var2) {
            return null;
        } else {
            var2.method1935(102);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lnh;I)V")
    public final void method1527(class288 arg0, int arg1) {
        field3377++;
        if (arg0.field4482 != null) {
            arg0.method1935(arg1 ^ 0x36);
        }
        arg0.field4482 = this.field3374;
        arg0.field4487 = this.field3374.field4487;
        arg0.field4482.field4487 = arg0;
        arg0.field4487.field4482 = arg0;
        if (arg1 != 73) {
            method1524(-26);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public final void method1528(boolean arg0) {
        field3372++;
        if (arg0) {
            this.field3374 = null;
        }
        while (true) {
            class288 var2 = this.field3374.field4487;
            if (this.field3374 == var2) {
                this.field3378 = null;
                return;
            }
            var2.method1935(103);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIILca;JLca;Lca;)V")
    public static final void method1529(int arg0, int arg1, int arg2, int arg3, class131 arg4, long arg5, class131 arg6, class131 arg7) {
        class157 var9 = new class157();
        var9.field2262 = arg4;
        var9.field2270 = arg1 * 128 + 64;
        var9.field2266 = arg2 * 128 + 64;
        var9.field2268 = arg3;
        var9.field2263 = arg5;
        var9.field2264 = arg6;
        var9.field2271 = arg7;
        int var10 = 0;
        class133 var11 = class6.field94[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1934; var12++) {
                class243 var13 = var11.field1930[var12];
                if ((var13.field3539 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3526.method227();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2269 = -var10;
        if (class6.field94[arg0][arg1][arg2] == null) {
            class6.field94[arg0][arg1][arg2] = new class133(arg0, arg1, arg2);
        }
        class6.field94[arg0][arg1][arg2].field1935 = var9;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public static final void method1530(int arg0) {
        field3381++;
        if (class173.field2480 == null) {
            return;
        }
        if (class116.field1613 < 10) {
            if (!class161.field2316.method1848((byte) 120, class173.field2480.field838)) {
                class116.field1613 = class292.field4619.method1845(arg0 ^ 0x2962531B, class173.field2480.field838) / 10;
                return;
            }
            class28.method171((byte) 127);
            class116.field1613 = 10;
        }
        if (class116.field1613 == 10) {
            class1.field1 = class173.field2480.field846 >> 6 << 6;
            class133.field1940 = (class173.field2480.field850 >> 6 << 6) - (class1.field1 - 64);
            class230.field3313 = class173.field2480.field826 >> 6 << 6;
            int var1 = -1;
            client.field4446 = (class173.field2480.field851 >> 6 << 6) + 64 - class230.field3313;
            int var2 = -1;
            int[] var3 = class173.field2480.method434((class177.field2507.field4553 >> 7) + class166.field2383, (class177.field2507.field4563 >> 7) + class110.field1473, -1, class199.field2833);
            if (var3 != null) {
                var1 = class1.field1 + class133.field1940 - var3[2] - 1;
                var2 = var3[1] - class230.field3313;
            }
            if (var2 >= 0 && client.field4446 > var2 && var1 >= 0 && var1 < class133.field1940) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                class261.field3800 = var4;
                int var5 = var1 + (int) (Math.random() * 10.0D) - 5;
                class271.field3963 = var5;
            } else if (class159.field2309 == -1 || class103.field1400 == -1) {
                int[] var7 = class173.field2480.method442(class173.field2480.field833 & 0x3FFF, (class173.field2480.field833 & 0xFFFF09E) >> 14, -13135);
                class261.field3800 = var7[1] - class230.field3313;
                class271.field3963 = class133.field1940 + class1.field1 - var7[2] - 1;
            } else {
                int[] var6 = class173.field2480.method442(class103.field1400, class159.field2309, arg0 - 694327445);
                class103.field1400 = -1;
                class159.field2309 = -1;
                if (var6 != null) {
                    class271.field3963 = class133.field1940 - (var6[2] + -class1.field1) - 1;
                    class261.field3800 = var6[1] - class230.field3313;
                }
            }
            if (class173.field2480.field829 == 37) {
                class35.field414 = 3.0F;
                class273.field4042 = 3.0F;
            } else if (class173.field2480.field829 == 50) {
                class35.field414 = 4.0F;
                class273.field4042 = 4.0F;
            } else if (class173.field2480.field829 == 75) {
                class35.field414 = 6.0F;
                class273.field4042 = 6.0F;
            } else if (class173.field2480.field829 == 100) {
                class35.field414 = 8.0F;
                class273.field4042 = 8.0F;
            } else if (class173.field2480.field829 == 200) {
                class35.field414 = 16.0F;
                class273.field4042 = 16.0F;
            } else {
                class35.field414 = 8.0F;
                class273.field4042 = 8.0F;
            }
            class199.method1281(-1);
            int var8 = client.field4446 >> 6;
            class52.field594 = new int[class198.field2822 + 1];
            int var9 = class133.field1940 >> 6;
            class141.field2031 = new byte[var8][var9][];
            class265.field3829 = new byte[var8][var9][];
            class105.field1428 = new int[var8][var9][];
            class104.field1413 = new int[var8][var9][];
            class178.field2533 = new byte[var8][var9][];
            int var10 = class254.field3668 >> 2 << 10;
            class248.field3612 = new byte[var8][var9][];
            class252.field3644 = new byte[var8][var9][];
            int var11 = class145.field2124 >> 1;
            class261.field3791 = new int[var8][var9][];
            class48.method296(var11, 127, var10);
            class116.field1613 = 20;
        } else if (class116.field1613 == 20) {
            class138.method904(-1, new class216(class161.field2316.method1871("underlay", class173.field2480.field838, 1)));
            class116.field1613 = 30;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else if (class116.field1613 == 30) {
            class241.method1566(new class216(class161.field2316.method1871("overlay", class173.field2480.field838, 1)), (byte) -90);
            class116.field1613 = 40;
            class66.method405(true);
        } else if (class116.field1613 == 40) {
            class249.method1605(arg0 - 694314415, new class216(class161.field2316.method1871("overlay2", class173.field2480.field838, 1)));
            class116.field1613 = 50;
            class66.method405(true);
        } else if (class116.field1613 == 50) {
            class209.method1332(125, new class216(class161.field2316.method1871("loc", class173.field2480.field838, arg0 ^ 0x29626547)));
            class116.field1613 = 60;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else if (class116.field1613 == 60) {
            if (class161.field2316.method1857((byte) 123, class173.field2480.field838 + "_labels")) {
                if (!class161.field2316.method1848((byte) 120, class173.field2480.field838 + "_labels")) {
                    return;
                }
                class200.field2840 = class22.method137((byte) 102, class173.field2480.field838 + "_labels", class161.field2316);
            } else {
                class200.field2840 = new class154(0);
            }
            class116.field1613 = 70;
            class66.method405(true);
        } else if (class116.field1613 == 70) {
            class59.field700 = new class262(11, true, class181.field2574);
            class116.field1613 = 73;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else if (class116.field1613 == 73) {
            class103.field1406 = new class262(12, true, class181.field2574);
            class116.field1613 = 76;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else if (class116.field1613 == 76) {
            class130.field1874 = new class262(14, true, class181.field2574);
            class116.field1613 = 79;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else if (class116.field1613 == 79) {
            class87.field1183 = new class262(17, true, class181.field2574);
            class116.field1613 = 82;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else if (class116.field1613 == 82) {
            class80.field952 = new class262(19, true, class181.field2574);
            class116.field1613 = 85;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else if (class116.field1613 == 85) {
            class238.field3439 = new class262(22, true, class181.field2574);
            class116.field1613 = 88;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else if (class116.field1613 == 88) {
            class24.field292 = new class262(26, true, class181.field2574);
            class116.field1613 = 91;
            class181.method1178((byte) -84, true);
            class66.method405(true);
        } else {
            if (arg0 != 694314310) {
                method1530(-56);
            }
            class220.field3117 = new class262(30, true, class181.field2574);
            class116.field1613 = 100;
            class181.method1178((byte) -84, true);
            class66.method405(true);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)Lnh;")
    public final class288 method1531(int arg0) {
        field3379++;
        class288 var2 = this.field3374.field4482;
        if (this.field3374 == var2) {
            this.field3378 = null;
            return null;
        } else if (arg0 == -696136762) {
            this.field3378 = var2.field4482;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)Lnh;")
    public final class288 method1532(int arg0) {
        class288 var2 = this.field3374.field4487;
        field3373++;
        if (this.field3374 == var2) {
            this.field3378 = null;
            return null;
        }
        this.field3378 = var2.field4487;
        if (arg0 >= -64) {
            this.method1532(12);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class234() {
        this.field3374.field4482 = this.field3374;
        this.field3374.field4487 = this.field3374;
    }
}
