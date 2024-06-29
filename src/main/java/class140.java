import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class140 {

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    private int field2504 = 32;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "J")
    private long field2507 = class201.method1419(5);

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    private int field2524 = 0;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    private int field2526 = 0;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    private int field2527 = 0;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "[Lck;")
    private class208[] field2525 = new class208[8];

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "J")
    private long field2523 = 0L;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    private int field2529 = 0;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "J")
    private long field2528 = 0L;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "Z")
    private boolean field2531 = true;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "[Lck;")
    private class208[] field2530 = new class208[8];

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2501 = 50;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[Leb;")
    public static class230[] field2492 = new class230[field2501];

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "[J")
    public static long[] field2508 = new long[200];

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "[I")
    public static int[] field2503 = new int[field2501];

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "[I")
    public static int[] field2512 = new int[field2501];

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
    public static int[] field2489 = new int[field2501];

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[I")
    public static int[] field2499 = new int[field2501];

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "[I")
    public static int[] field2515 = new int[field2501];

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "[I")
    public static int[] field2513 = new int[field2501];

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "[I")
    public static int[] field2518 = new int[field2501];

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    private int field2520;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lck;")
    private class208 field2497;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
    public int[] field2493;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public void method688() throws Exception {
        field2495++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public final synchronized void method1071(byte arg0) {
        if (arg0 <= 87) {
            this.field2528 = -117L;
        }
        this.field2531 = true;
        field2498++;
        try {
            this.method687();
        } catch (Exception var2) {
            this.method686();
            this.field2528 = class201.method1419(5) + 2000L;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method1072(int arg0) {
        this.field2531 = true;
        field2500++;
        if (arg0 >= -120) {
            this.field2523 = -78L;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
    public void method686() {
        field2509++;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final synchronized void method1073(int arg0) {
        field2491++;
        if (this.field2493 == null) {
            return;
        }
        long var2 = class201.method1419(5);
        try {
            if (this.field2528 != 0L) {
                if (var2 < this.field2528) {
                    return;
                }
                this.method685(this.field2521);
                this.field2531 = true;
                this.field2528 = 0L;
            }
            int var4 = this.method690();
            int var5 = this.field2522 + this.field2520;
            if (this.field2527 < (this.field2526 - var4)) {
                this.field2527 = this.field2526 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field2521) {
                this.field2521 += 1024;
                if (this.field2521 > 16384) {
                    this.field2521 = 16384;
                }
                var4 = 0;
                this.method686();
                this.method685(this.field2521);
                if (var5 + 256 > this.field2521) {
                    var5 = this.field2521 - 256;
                    this.field2520 = var5 - this.field2522;
                }
                this.field2531 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1080(this.field2493, 256);
                this.method688();
            }
            if (this.field2523 < var2) {
                if (this.field2531) {
                    this.field2531 = false;
                } else if (this.field2527 == 0 && this.field2529 == 0) {
                    this.method686();
                    this.field2528 = var2 + 2000L;
                    return;
                } else {
                    this.field2520 = Math.min(this.field2529, this.field2527);
                    this.field2529 = this.field2527;
                }
                this.field2523 = var2 + 2000L;
                this.field2527 = 0;
            }
            this.field2526 = var4;
            int var6 = 62 / ((arg0 - 77) / 34);
        } catch (Exception var8) {
            this.method686();
            this.field2528 = var2 + 2000L;
        }
        try {
            if (this.field2507 + 500000L < var2) {
                var2 = this.field2507;
            }
            while ((this.field2507 + 5000L) < var2) {
                this.method1077(103, 256);
                this.field2507 += (long) (256000 / class55.field1011);
            }
        } catch (Exception var7) {
            this.field2507 = var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBLck;)V")
    private final void method1074(int arg0, byte arg1, class208 arg2) {
        field2494++;
        int var4 = arg0 >> 5;
        class208 var5 = this.field2530[var4];
        if (var5 == null) {
            this.field2525[var4] = arg2;
        } else {
            var5.field3645 = arg2;
        }
        this.field2530[var4] = arg2;
        if (arg1 >= 116) {
            arg2.field3644 = arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lob;IB)V")
    public static final void method1075(class128 arg0, int arg1, byte arg2) {
        if (class259.field4584 < arg0.field2238) {
            class17.method214(-21555, arg0);
        } else if (arg0.field2275 < class259.field4584) {
            class207.method1451(false, arg0);
        } else {
            class40.method354(3, arg0);
        }
        if (arg2 > -68) {
            return;
        }
        if (arg0.field2274 < 128 || arg0.field2300 < 128 || arg0.field2274 >= 13184 || arg0.field2300 >= 13184) {
            arg0.field2303 = -1;
            arg0.field2279 = -1;
            arg0.field2275 = 0;
            arg0.field2238 = 0;
            arg0.field2274 = arg0.field2296[0] * 128 + arg0.method1005(0) * 64;
            arg0.field2300 = arg0.field2253[0] * 128 + (arg0.method1005(0) * 64);
            arg0.method1003((byte) -116);
        }
        if (class56.field1033 == arg0 && (arg0.field2274 < 1536 || arg0.field2300 < 1536 || arg0.field2274 >= 11776 || arg0.field2300 >= 11776)) {
            arg0.field2303 = -1;
            arg0.field2238 = 0;
            arg0.field2275 = 0;
            arg0.field2279 = -1;
            arg0.field2274 = arg0.field2296[0] * 128 + (arg0.method1005(0) * 64);
            arg0.field2300 = arg0.field2253[0] * 128 + arg0.method1005(0) * 64;
            arg0.method1003((byte) -112);
        }
        class37.method331(arg0, true);
        field2506++;
        class189.method1348((byte) -36, arg0);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public void method685(int arg0) throws Exception {
        field2490++;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
    public static void method1076(int arg0) {
        int var1 = 111 % ((arg0 - 14) / 46);
        field2489 = null;
        field2503 = null;
        field2512 = null;
        field2518 = null;
        field2513 = null;
        field2515 = null;
        field2499 = null;
        field2492 = null;
        field2508 = null;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
    public void method687() throws Exception {
        field2519++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    private final void method1077(int arg0, int arg1) {
        this.field2524 -= arg1;
        field2517++;
        if (arg0 <= 101) {
            return;
        }
        if (this.field2524 < 0) {
            this.field2524 = 0;
        }
        if (this.field2497 != null) {
            this.field2497.method464(arg1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method689(Component arg0) throws Exception {
        field2516++;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
    public final synchronized void method1078(int arg0) {
        field2511++;
        int var2 = 122 / ((arg0 + 15) / 33);
        if (class131.field2352 != null) {
            boolean var3 = true;
            for (int var4 = 0; var4 < 2; var4++) {
                if (class131.field2352.field843[var4] == this) {
                    class131.field2352.field843[var4] = null;
                }
                if (class131.field2352.field843[var4] != null) {
                    var3 = false;
                }
            }
            if (var3) {
                class131.field2352.field852 = true;
                while (class131.field2352.field845) {
                    class52.method417((byte) -115, 50L);
                }
                class131.field2352 = null;
            }
        }
        this.method686();
        this.field2493 = null;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()I")
    public int method690() throws Exception {
        field2496++;
        return this.field2521;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lck;I)V")
    public final synchronized void method1079(class208 arg0, int arg1) {
        int var3 = -5 / ((arg1 - 3) / 52);
        this.field2497 = arg0;
        field2514++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([II)V")
    private final void method1080(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class157.field2804) {
            var3 = arg1 << 1;
        }
        class43.method378(arg0, 0, var3);
        this.field2524 -= arg1;
        if (this.field2497 != null && this.field2524 <= 0) {
            this.field2524 += class55.field1011 >> 4;
            class170.method1255(false, this.field2497);
            this.method1074(this.field2497.method553(), (byte) 125, this.field2497);
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
                        class208 var10 = null;
                        class208 var11 = this.field2525[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class220 var12 = var11.field3647;
                                if (var12 == null || var12.field3778 <= var8) {
                                    var11.field3646 = true;
                                    int var13 = var11.method457();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3778 += var13;
                                    }
                                    if (var4 >= this.field2504) {
                                        break label107;
                                    }
                                    class208 var14 = var11.method437();
                                    if (var14 != null) {
                                        int var15 = var11.field3644;
                                        while (var14 != null) {
                                            this.method1074(var15 * var14.method553() >> 8, (byte) 125, var14);
                                            var14 = var11.method454();
                                        }
                                    }
                                    class208 var16 = var11.field3645;
                                    var11.field3645 = null;
                                    if (var10 == null) {
                                        this.field2525[var7] = var16;
                                    } else {
                                        var10.field3645 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2530[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3645;
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
                class208 var18 = this.field2525[var17];
                this.field2525[var17] = this.field2530[var17] = null;
                while (var18 != null) {
                    class208 var19 = var18.field3645;
                    var18.field3645 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2524 < 0) {
            this.field2524 = 0;
        }
        if (this.field2497 != null) {
            this.field2497.method441(arg0, 0, arg1);
        }
        this.field2507 = class201.method1419(5);
    }
}
