import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class123 {

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    private int field2479 = 32;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "J")
    private long field2490 = class168.method1118(1);

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[Lag;")
    private class8[] field2491 = new class8[8];

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Z")
    private boolean field2494 = true;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    private int field2500 = 0;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    private int field2493 = 0;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "J")
    private long field2501 = 0L;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    private int field2504 = 0;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "J")
    private long field2502 = 0L;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "[Lag;")
    private class8[] field2507 = new class8[8];

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    private int field2506 = 0;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "[I")
    public static int[] field2476 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Ljd;")
    public static class92 field2487 = class202.method1325((byte) 90, "weiss:");

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Ljd;")
    private static class92 field2480 = class202.method1325((byte) 90, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Ljd;")
    public static class92 field2475 = field2480;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Ljd;")
    public static class92 field2482 = class202.method1325((byte) 90, "");

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    private int field2495;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public int field2496;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public int field2497;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "Lnh;")
    public static class133 field2492;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lfd;")
    public static class55 field2485;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Lag;")
    private class8 field2483;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
    public int[] field2478;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "[I")
    public static int[] field2503;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
    public void method561() {
        field2486++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([II)V")
    private final void method818(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class76.field1583) {
            var3 = arg1 << 1;
        }
        class11.method74(arg0, 0, var3);
        this.field2506 -= arg1;
        if (this.field2483 != null && this.field2506 <= 0) {
            this.field2506 += class175.field3378 >> 4;
            class209.method1362(this.field2483, 16041);
            this.method821(this.field2483, (byte) 113, this.field2483.method53());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class8 var10 = null;
                        class8 var11 = this.field2491[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class85 var12 = var11.field320;
                                if (var12 == null || var12.field1693 <= var8) {
                                    var11.field321 = true;
                                    int var13 = var11.method54();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1693 += var13;
                                    }
                                    if (var4 >= this.field2479) {
                                        break label107;
                                    }
                                    class8 var14 = var11.method57();
                                    if (var14 != null) {
                                        int var15 = var11.field319;
                                        while (var14 != null) {
                                            this.method821(var14, (byte) 122, var15 * var14.method53() >> 8);
                                            var14 = var11.method51();
                                        }
                                    }
                                    class8 var16 = var11.field318;
                                    var11.field318 = null;
                                    if (var10 == null) {
                                        this.field2491[var7] = var16;
                                    } else {
                                        var10.field318 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2507[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field318;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class8 var18 = this.field2491[var17];
                this.field2491[var17] = this.field2507[var17] = null;
                while (var18 != null) {
                    class8 var19 = var18.field318;
                    var18.field318 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2506 < 0) {
            this.field2506 = 0;
        }
        if (this.field2483 != null) {
            this.field2483.method52(arg0, 0, arg1);
        }
        this.field2490 = class168.method1118(1);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILag;)V")
    public final synchronized void method819(int arg0, class8 arg1) {
        int var3 = 19 % ((arg0 + 10) / 49);
        field2498++;
        this.field2483 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final synchronized void method820(int arg0) {
        this.field2494 = true;
        try {
            this.method555();
            if (arg0 != 23620) {
                this.field2483 = null;
            }
        } catch (Exception var2) {
            this.method561();
            this.field2502 = class168.method1118(1) + 2000L;
        }
        field2508++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lag;BI)V")
    private final void method821(class8 arg0, byte arg1, int arg2) {
        field2484++;
        if (arg1 <= 101) {
            return;
        }
        int var4 = arg2 >> 5;
        class8 var5 = this.field2507[var4];
        if (var5 == null) {
            this.field2491[var4] = arg0;
        } else {
            var5.field318 = arg0;
        }
        this.field2507[var4] = arg0;
        arg0.field319 = arg2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public final synchronized void method822(boolean arg0) {
        if (class175.field3385 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class175.field3385.field1770[var3] == this) {
                    class175.field3385.field1770[var3] = null;
                }
                if (class175.field3385.field1770[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class175.field3385.field1765 = true;
                while (class175.field3385.field1764) {
                    class58.method357(-24534, 50L);
                }
                class175.field3385 = null;
            }
        }
        if (arg0) {
            this.method561();
        }
        this.method561();
        this.field2478 = null;
        field2477++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public void method559(int arg0) throws Exception {
        field2472++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
    public static void method823(boolean arg0) {
        field2476 = null;
        field2503 = null;
        field2475 = null;
        field2487 = null;
        field2485 = null;
        field2482 = null;
        field2480 = null;
        if (!arg0) {
            field2485 = null;
        }
        field2492 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method557(Component arg0) throws Exception {
        field2488++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()V")
    public void method560() throws Exception {
        field2473++;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "()V")
    public void method555() throws Exception {
        field2470++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
    public static final int method824(byte arg0) {
        field2469++;
        int var1 = 84 % ((arg0 - 24) / 59);
        return class101.field2074++;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public final synchronized void method825(int arg0) {
        field2474++;
        if (this.field2478 == null) {
            return;
        }
        long var2 = class168.method1118(1);
        try {
            if (this.field2502 != 0L) {
                if (var2 < this.field2502) {
                    return;
                }
                this.method559(this.field2496);
                this.field2502 = 0L;
                this.field2494 = true;
            }
            int var4 = this.method558();
            int var5 = this.field2497 + this.field2495;
            if (this.field2500 - var4 > this.field2504) {
                this.field2504 = this.field2500 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2496 < var5 + 256) {
                var4 = 0;
                this.field2496 += 1024;
                if (this.field2496 > 16384) {
                    this.field2496 = 16384;
                }
                this.method561();
                this.method559(this.field2496);
                this.field2494 = true;
                if (var5 + 256 > this.field2496) {
                    var5 = this.field2496 - 256;
                    this.field2495 = var5 - this.field2497;
                }
            }
            while (var5 > var4) {
                this.method818(this.field2478, 256);
                this.method560();
                var4 += 256;
            }
            if (var2 > this.field2501) {
                if (this.field2494) {
                    this.field2494 = false;
                } else if (this.field2504 == 0 && this.field2493 == 0) {
                    this.method561();
                    this.field2502 = var2 + 2000L;
                    return;
                } else {
                    this.field2495 = Math.min(this.field2493, this.field2504);
                    this.field2493 = this.field2504;
                }
                this.field2501 = var2 + 2000L;
                this.field2504 = 0;
            }
            this.field2500 = var4;
        } catch (Exception var7) {
            this.method561();
            this.field2502 = var2 + 2000L;
        }
        if (arg0 != 4) {
            this.field2491 = null;
        }
        try {
            if (var2 > this.field2490 + 500000L) {
                var2 = this.field2490;
            }
            while (var2 > this.field2490 + 5000L) {
                this.method828(256, arg0 - 2828);
                this.field2490 += 256000 / class175.field3378;
            }
        } catch (Exception var6) {
            this.field2490 = var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
    public final void method826(int arg0) {
        this.field2494 = true;
        if (arg0 != 16384) {
            this.field2497 = 34;
        }
        field2489++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lnh;III)Lrf;")
    public static final class167 method827(class133 arg0, int arg1, int arg2, int arg3) {
        field2481++;
        if (class157.method1016(arg0, arg1, arg2 ^ 0xFFFFF783, arg3)) {
            if (arg2 != 2090) {
                field2492 = null;
            }
            return class140.method933(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "()I")
    public int method558() throws Exception {
        field2499++;
        return this.field2496;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
    private final void method828(int arg0, int arg1) {
        this.field2506 -= arg0;
        if (this.field2506 < 0) {
            this.field2506 = 0;
        }
        field2505++;
        if (arg1 != -2824) {
            this.method821(null, (byte) -106, -87);
        }
        if (this.field2483 != null) {
            this.field2483.method56(arg0);
        }
    }
}
