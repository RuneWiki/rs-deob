import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class183 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public int field2435 = -1;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field2437 = -1;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "[I")
    private int[] field2443 = null;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public int field2445 = 0;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public int field2441 = -1;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public int field2438 = -1;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public int field2444 = -1;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public int field2442 = -1;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public int field2449 = 0;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public int field2457 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public int field2433 = -1;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public int field2440 = 0;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public int field2456 = -1;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "[I")
    private int[] field2451 = null;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public int field2436 = -1;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public int field2467 = -1;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public int field2469 = -1;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field2446 = -1;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public int field2450 = -1;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public int field2461 = -1;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public int field2459 = 0;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public int field2460 = -1;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public int field2472 = 0;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public int field2465 = -1;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public int field2471 = -1;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public int field2464 = 0;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public int field2448 = -1;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public int field2447 = -1;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public int field2470 = -1;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "Z")
    public boolean field2462 = true;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public int field2476 = 0;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public int field2439 = -1;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public int field2473 = -1;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public int field2458 = -1;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public int field2453 = 0;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    private int field2478 = 0;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public int field2474 = -1;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public int field2477 = 0;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "[S")
    public static short[] field2466 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[I")
    public int[] field2455;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "[[I")
    public int[][] field2463;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I", line = 3)
    public final int method1126(byte arg0) {
        if (arg0 != -24) {
            return -60;
        }
        field2452++;
        if (this.field2456 != -1) {
            return this.field2456;
        } else if (this.field2451 == null) {
            return -1;
        } else {
            int var2 = (int) ((double) this.field2478 * Math.random());
            int var3;
            for (var3 = 0; var2 >= this.field2443[var3]; var3++) {
                var2 -= this.field2443[var3];
            }
            return this.field2451[var3];
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lil;II)V", line = 70)
    private final void method1127(class265 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2456 = arg0.method1685(8104);
            this.field2447 = arg0.method1685(8104);
            if (this.field2456 == 65535) {
                this.field2456 = -1;
            }
            if (this.field2447 == 65535) {
                this.field2447 = -1;
            }
        } else if (arg2 == 2) {
            this.field2458 = arg0.method1685(8104);
        } else if (arg2 == 3) {
            this.field2471 = arg0.method1685(8104);
        } else if (arg2 == 4) {
            this.field2470 = arg0.method1685(8104);
        } else if (arg2 == 5) {
            this.field2461 = arg0.method1685(8104);
        } else if (arg2 == 6) {
            this.field2460 = arg0.method1685(8104);
        } else if (arg2 == 7) {
            this.field2444 = arg0.method1685(8104);
        } else if (arg2 == 8) {
            this.field2469 = arg0.method1685(8104);
        } else if (arg2 == 9) {
            this.field2441 = arg0.method1685(8104);
        } else if (arg2 == 26) {
            this.field2457 = (short) (arg0.method1697(arg1 ^ 0xFFC7) * 4);
            this.field2459 = (short) (arg0.method1697(-15) * 4);
        } else if (arg2 == 27) {
            if (this.field2463 == null) {
                this.field2463 = new int[12][];
            }
            int var4 = arg0.method1697(-83);
            this.field2463[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field2463[var4][var5] = arg0.method1698(arg1 + 1625620480);
            }
        } else if (arg2 == 28) {
            this.field2455 = new int[12];
            for (int var6 = 0; var6 < 12; var6++) {
                this.field2455[var6] = arg0.method1697(118);
                if (this.field2455[var6] == 255) {
                    this.field2455[var6] = -1;
                }
            }
        } else if (arg2 == 29) {
            this.field2476 = arg0.method1697(127);
        } else if (arg2 == 30) {
            this.field2464 = arg0.method1685(arg1 + 73640);
        } else if (arg2 == 31) {
            this.field2472 = arg0.method1697(-112);
        } else if (arg2 == 32) {
            this.field2445 = arg0.method1685(8104);
        } else if (arg2 == 33) {
            this.field2440 = arg0.method1698(arg1 + 1625620480);
        } else if (arg2 == 34) {
            this.field2477 = arg0.method1697(92);
        } else if (arg2 == 35) {
            this.field2453 = arg0.method1685(arg1 + 73640);
        } else if (arg2 == 36) {
            this.field2449 = arg0.method1698(arg1 + 1625620480);
        } else if (arg2 == 37) {
            this.field2435 = arg0.method1697(-20);
        } else if (arg2 == 38) {
            this.field2442 = arg0.method1685(arg1 ^ 0xFFFF1FA8);
        } else if (arg2 == 39) {
            this.field2438 = arg0.method1685(8104);
        } else if (arg2 == 40) {
            this.field2433 = arg0.method1685(8104);
        } else if (arg2 == 41) {
            this.field2437 = arg0.method1685(8104);
        } else if (arg2 == 42) {
            this.field2465 = arg0.method1685(8104);
        } else if (arg2 == 43) {
            arg0.method1685(8104);
        } else if (arg2 == 44) {
            this.field2439 = arg0.method1685(arg1 ^ 0xFFFF1FA8);
        } else if (arg2 == 45) {
            this.field2448 = arg0.method1685(arg1 + 73640);
        } else if (arg2 == 46) {
            this.field2467 = arg0.method1685(arg1 + 73640);
        } else if (arg2 == 47) {
            this.field2450 = arg0.method1685(8104);
        } else if (arg2 == 48) {
            this.field2473 = arg0.method1685(8104);
        } else if (arg2 == 49) {
            this.field2436 = arg0.method1685(8104);
        } else if (arg2 == 50) {
            this.field2474 = arg0.method1685(8104);
        } else if (arg2 == 51) {
            this.field2446 = arg0.method1685(8104);
        } else if (arg2 == 52) {
            int var7 = arg0.method1697(arg1 ^ 0xFFB3);
            this.field2443 = new int[var7];
            this.field2451 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2451[var8] = arg0.method1685(8104);
                int var9 = arg0.method1697(-62);
                this.field2443[var8] = var9;
                this.field2478 += var9;
            }
        } else if (arg2 == 53) {
            this.field2462 = false;
        }
        field2434++;
        if (arg1 != -65536) {
            method1128((byte) 113);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V", line = 294)
    public static void method1128(byte arg0) {
        field2466 = null;
        if (arg0 <= 99) {
            field2466 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z", line = 356)
    public final boolean method1129(int arg0, int arg1) {
        field2454++;
        if (arg0 == -1) {
            return false;
        } else if (this.field2456 == arg0) {
            return true;
        } else {
            if (this.field2451 != null) {
                for (int var3 = 0; var3 < this.field2451.length; var3++) {
                    if (this.field2451[var3] == arg0) {
                        return true;
                    }
                }
            }
            return arg1 != -28;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 394)
    public final void method1130(int arg0) {
        if (arg0 == 0) {
            field2468++;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILil;)V", line = 407)
    public final void method1131(int arg0, class265 arg1) {
        while (true) {
            int var3 = arg1.method1697(-48);
            if (var3 == 0) {
                field2475++;
                if (arg0 < 123) {
                    this.field2438 = -54;
                    return;
                }
                return;
            }
            this.method1127(arg1, -65536, var3);
        }
    }
}
