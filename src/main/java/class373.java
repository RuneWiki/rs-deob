import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class373 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "La;")
    public static class420 field5289;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method2235(int arg0) {
        field5286++;
        if (class478.field6764 == arg0 || class478.field6764 == 28) {
            class73.method498(true, class106.field1525 >> 10, class436.field5982 >> 10, 5000);
        } else if (class2.field21.field6765 >= 0 && (class200.field2875 * 128) > class2.field21.field6765 && class2.field21.field6746 >= 0 && (class422.field5811 * 128) > class2.field21.field6746) {
            class73.method498(true, class2.field21.field1140[0] >> 3, class2.field21.field1144[0] >> 3, 5000);
        } else {
            class73.method498(true, class422.field5811 >> 4, class200.field2875 >> 4, 5000);
        }
        class85.method587((byte) 111);
        class349.method2093((byte) -102);
        class389.method2310(0);
        class115.method725(1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B[B)V")
    public abstract void method2145(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)[B")
    public abstract byte[] method2146(byte arg0);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLkm;Lbc;)V")
    public static final void method2236(byte arg0, class487 arg1, class187 arg2) {
        field5287++;
        if (class379.field5359 == null) {
            return;
        }
        if (class430.field5926 < 10) {
            if (!class379.field5356.method2052(class379.field5359.field2876, -114)) {
                class430.field5926 = class183.field2667.method2049(class379.field5359.field2876, 0) / 10;
                return;
            }
            class245.method1529(-122);
            class430.field5926 = 10;
        }
        if (class430.field5926 == 10) {
            class379.field5393 = class379.field5359.field2863 >> 6 << 6;
            class379.field5379 = class379.field5359.field2858 >> 6 << 6;
            class379.field5389 = (class379.field5359.field2859 >> 6 << 6) + 64 - class379.field5393;
            class379.field5384 = (class379.field5359.field2868 >> 6 << 6) + 64 - class379.field5379;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class379.field5359.method1270((class2.field21.field6746 >> 7) + class325.field4472, var3, 104, class2.field21.field6766, (class2.field21.field6765 >> 7) + class153.field2204)) {
                var5 = var3[2] - class379.field5379;
                var4 = var3[1] - class379.field5393;
            }
            if (!class120.field1684 && var4 >= 0 && var4 < class379.field5389 && var5 >= 0 && var5 < class379.field5384) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class192.field2753 = var7;
                class417.field5743 = var6;
            } else if (class250.field3515 == -1 || class63.field968 == -1) {
                class379.field5359.method1272((class379.field5359.field2857 & 0xFFFD7EB) >> 14, -87, class379.field5359.field2857 & 0x3FFF, var3);
                class417.field5743 = var3[2] - class379.field5379;
                class192.field2753 = var3[1] - class379.field5393;
            } else {
                class379.field5359.method1272(class250.field3515, -87, class63.field968, var3);
                class63.field968 = -1;
                class250.field3515 = -1;
                if (var3 != null) {
                    class417.field5743 = var3[2] - class379.field5379;
                    class192.field2753 = var3[1] - class379.field5393;
                }
                class120.field1684 = false;
            }
            if (class379.field5359.field2870 == 37) {
                class379.field5372 = 3.0F;
                class379.field5365 = 3.0F;
            } else if (class379.field5359.field2870 == 50) {
                class379.field5372 = 4.0F;
                class379.field5365 = 4.0F;
            } else if (class379.field5359.field2870 == 75) {
                class379.field5372 = 6.0F;
                class379.field5365 = 6.0F;
            } else if (class379.field5359.field2870 == 100) {
                class379.field5372 = 8.0F;
                class379.field5365 = 8.0F;
            } else if (class379.field5359.field2870 == 200) {
                class379.field5372 = 16.0F;
                class379.field5365 = 16.0F;
            } else {
                class379.field5372 = 8.0F;
                class379.field5365 = 8.0F;
            }
            class379.field5370 = (int) class379.field5372 >> 1;
            class379.field5368 = class370.method2222(111, class379.field5370);
            class330.method1970(8142);
            class379.method2272();
            class52.field863 = new class249();
            class379.field5364 += (int) (Math.random() * 5.0D) - 2;
            if (class379.field5364 < -8) {
                class379.field5364 = -8;
            }
            class379.field5367 += (int) (Math.random() * 5.0D) - 2;
            if (class379.field5364 > 8) {
                class379.field5364 = 8;
            }
            if (class379.field5367 < -16) {
                class379.field5367 = -16;
            }
            if (class379.field5367 > 16) {
                class379.field5367 = 16;
            }
            class379.method2265(arg2, class379.field5364 >> 2 << 10, class379.field5367 >> 1);
            class379.field5358.method90(64, 1024, 256);
            class379.field5362.method378(-22928, 256, 256);
            class379.field5355.method2076(4096, 26748);
            class147.field2084.method407(256, (byte) 12);
            class430.field5926 = 20;
        } else if (class430.field5926 == 20) {
            class127.method770(-2592, true);
            class379.method2275(arg1, class379.field5364, class379.field5367);
            class430.field5926 = 60;
            class127.method770(-2592, true);
            class334.method1986(8776);
        } else if (class430.field5926 == 60) {
            if (class379.field5356.method2056(class379.field5359.field2876 + "_staticelements", true)) {
                if (!class379.field5356.method2052(class379.field5359.field2876 + "_staticelements", -121)) {
                    return;
                }
                class379.field5369 = class314.method1895(-72, class379.field5356, class319.field4371, class379.field5359.field2876 + "_staticelements");
            } else {
                class379.field5369 = new class107(0);
            }
            class379.method2268();
            class430.field5926 = 70;
            class127.method770(-2592, true);
            class334.method1986(8776);
        } else if (class430.field5926 == 70) {
            class407.field5639 = new class141(arg1, 11, true, class138.field1965);
            class430.field5926 = 73;
            class127.method770(-2592, true);
            class334.method1986(8776);
        } else if (class430.field5926 == 73) {
            class138.field1959 = new class141(arg1, 12, true, class138.field1965);
            class430.field5926 = 76;
            class127.method770(-2592, true);
            class334.method1986(8776);
        } else if (class430.field5926 == 76) {
            class137.field1948 = new class141(arg1, 14, true, class138.field1965);
            class430.field5926 = 79;
            class127.method770(-2592, true);
            class334.method1986(8776);
        } else if (class430.field5926 == 79) {
            class265.field3697 = new class141(arg1, 17, true, class138.field1965);
            class430.field5926 = 82;
            class127.method770(-2592, true);
            class334.method1986(8776);
        } else if (class430.field5926 == 82) {
            class242.field3428 = new class141(arg1, 19, true, class138.field1965);
            class430.field5926 = 85;
            class127.method770(-2592, true);
            class334.method1986(8776);
        } else if (class430.field5926 == 85) {
            class50.field846 = new class141(arg1, 22, true, class138.field1965);
            class430.field5926 = 88;
            class127.method770(-2592, true);
            class334.method1986(8776);
        } else if (arg0 > 98) {
            if (class430.field5926 == 88) {
                class9.field186 = new class141(arg1, 26, true, class138.field1965);
                class430.field5926 = 91;
                class127.method770(-2592, true);
                class334.method1986(8776);
            } else {
                class272.field3778 = new class141(arg1, 30, true, class138.field1965);
                class430.field5926 = 100;
                class127.method770(-2592, true);
                class334.method1986(8776);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lpf;BI)V")
    public static final void method2237(class133 arg0, byte arg1, int arg2) {
        field5288++;
        class148.field2095 = false;
        class318.field4331 = 0;
        class346.method2067(arg0, false);
        class129.method786((byte) 93, arg0);
        if (class148.field2095) {
            System.out.println("---endgpp---");
        }
        if (arg0.field5830 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field5830 + " psize:" + arg2);
        } else if (arg1 != 20) {
            method2237((class133) null, (byte) -48, -112);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method2238(int arg0) {
        field5289 = null;
        if (arg0 != -18603) {
            field5289 = null;
        }
    }

    static {
        new class112("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        new class112("Use", "Benutzen", "Utiliser", "Usar");
    }
}
