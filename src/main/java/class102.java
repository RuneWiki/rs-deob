import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "J")
    private long field2528 = -1L;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    private int field2530 = 0;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "J")
    private long field2551 = -1L;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lic;")
    private class59 field2537;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "J")
    private long field2527;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "J")
    private long field2550;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "J")
    private long field2532;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[B")
    private byte[] field2535;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[B")
    private byte[] field2534;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lkd;")
    public static class73 field2531 = class126.method1070((byte) -66, "backtop1");

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2529 = 0;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lkd;")
    private static class73 field2539 = class126.method1070((byte) -66, "World");

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lkd;")
    public static class73 field2543 = class126.method1070((byte) -66, "welle2:");

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lkd;")
    public static class73 field2545 = class126.method1070((byte) -66, "lila:");

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Lkd;")
    public static class73 field2548 = class126.method1070((byte) -66, "sl_stars");

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lkd;")
    public static class73 field2541 = class126.method1070((byte) -66, ":tradereq:");

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "Lkd;")
    public static class73 field2555 = field2539;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "[I")
    public static int[] field2549 = new int[200];

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "[J")
    public static long[] field2558 = new long[100];

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lkd;")
    public static class73 field2544 = field2539;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    private int field2552;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "J")
    private long field2553;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lad;")
    public static class5 field2536;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BILq;)Lpf;")
    public static final class110 method816(byte arg0, int arg1, class111 arg2) {
        field2560++;
        int var3 = 17 / ((-arg0 - 61) / 56);
        byte[] var4 = arg2.method888(arg1, 124);
        return var4 == null ? null : new class110(var4);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIB[B)V")
    public final void method817(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field2540++;
        try {
            if (arg3.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (this.field2551 != -1L && this.field2551 <= this.field2532 && this.field2532 + (long) arg1 <= (long) this.field2530 + this.field2551) {
                class128.method1077(this.field2534, (int) (this.field2532 - this.field2551), arg3, arg0, arg1);
                this.field2532 += arg1;
                return;
            }
            long var5 = this.field2532;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field2532 >= this.field2528 && this.field2532 < (long) this.field2552 + this.field2528) {
                int var9 = (int) (this.field2528 + (long) this.field2552 - this.field2532);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class128.method1077(this.field2535, (int) (this.field2532 - this.field2528), arg3, arg0, var9);
                this.field2532 += var9;
                arg0 += var9;
            }
            int var10 = -111 % ((43 - arg2) / 40);
            if (this.field2535.length < arg1) {
                this.field2537.method499(this.field2532, (byte) -113);
                this.field2553 = this.field2532;
                while (arg1 > 0) {
                    int var11 = this.field2537.method500(arg0, arg1, arg3, -10);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2532 += var11;
                    this.field2553 += var11;
                    arg0 += var11;
                    arg1 -= var11;
                }
            } else if (arg1 > 0) {
                this.method825(true);
                int var12 = arg1;
                if (arg1 > this.field2552) {
                    var12 = this.field2552;
                }
                class128.method1077(this.field2535, 0, arg3, arg0, var12);
                this.field2532 += var12;
                arg0 += var12;
                arg1 -= var12;
            }
            if (this.field2551 != -1L) {
                if (this.field2532 < this.field2551 && arg1 > 0) {
                    int var13 = (int) (this.field2551 - this.field2532) + arg0;
                    if (var13 > arg0 + arg1) {
                        var13 = arg0 + arg1;
                    }
                    while (var13 > arg0) {
                        arg3[arg0++] = 0;
                        this.field2532++;
                        arg1--;
                    }
                }
                long var14 = -1L;
                if (this.field2551 >= var5 && (long) var8 + var5 > this.field2551) {
                    var14 = this.field2551;
                } else if (var5 >= this.field2551 && (long) this.field2530 + this.field2551 > var5) {
                    var14 = var5;
                }
                long var16 = -1L;
                if ((long) this.field2530 + this.field2551 > var5 && this.field2551 + (long) this.field2530 <= (long) var8 + var5) {
                    var16 = (long) this.field2530 + this.field2551;
                } else if (this.field2551 < (long) var8 + var5 && var5 + (long) var8 <= (long) this.field2530 + this.field2551) {
                    var16 = (long) var8 + var5;
                }
                if (var14 > -1L && var16 > var14) {
                    int var18 = (int) (var16 - var14);
                    class128.method1077(this.field2534, (int) (var14 - this.field2551), arg3, var7 + (int) (var14 - var5), var18);
                    if (var16 > this.field2532) {
                        arg1 = (int) ((long) arg1 + this.field2532 - var16);
                        this.field2532 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2553 = -1L;
            throw var20;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)J")
    public final long method818(int arg0) {
        field2547++;
        if (arg0 <= 31) {
            method822((byte) -97);
        }
        return this.field2550;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final void method819(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field2553 = 8L;
        }
        this.method824((byte) 48);
        field2554++;
        this.field2537.method497(-37);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILq;ZLgd;Lq;)V")
    public static final void method820(int arg0, class111 arg1, boolean arg2, class46 arg3, class111 arg4) {
        class92.field2370 = arg1;
        class77.field1972 = arg2;
        class58.field1550 = arg4;
        field2546++;
        class137.field3425 = class58.field1550.method889(arg0 ^ 0xFFFFFFF5, arg0);
        class82.field2070 = arg3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JZ)V")
    public final void method821(long arg0, boolean arg1) {
        field2556++;
        if (arg1) {
            this.method818(4);
        }
        if (arg0 >= 0L) {
            this.field2532 = arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method822(byte arg0) {
        field2548 = null;
        field2558 = null;
        field2531 = null;
        field2536 = null;
        field2545 = null;
        field2543 = null;
        if (arg0 != 114) {
            field2531 = null;
        }
        field2541 = null;
        field2549 = null;
        field2544 = null;
        field2539 = null;
        field2555 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI[BI)V")
    public final void method823(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2559++;
        try {
            if ((long) arg1 + this.field2532 > this.field2550) {
                this.field2550 = (long) arg1 + this.field2532;
            }
            int var5 = 7 / ((arg0 - 31) / 58);
            if (this.field2551 != -1L && (this.field2532 < this.field2551 || (long) this.field2530 + this.field2551 < this.field2532)) {
                this.method824((byte) 48);
            }
            if (this.field2551 != -1L && (long) this.field2534.length + this.field2551 < (long) arg1 + this.field2532) {
                int var6 = (int) ((long) this.field2534.length + this.field2551 - this.field2532);
                class128.method1077(arg2, arg3, this.field2534, (int) (this.field2532 - this.field2551), var6);
                this.field2532 += var6;
                arg3 += var6;
                this.field2530 = this.field2534.length;
                arg1 -= var6;
                this.method824((byte) 48);
            }
            if (this.field2534.length < arg1) {
                if (this.field2553 != this.field2532) {
                    this.field2537.method499(this.field2532, (byte) -113);
                    this.field2553 = this.field2532;
                }
                this.field2537.method501(arg2, arg3, 15924, arg1);
                long var7 = -1L;
                long var9 = -1L;
                if (this.field2532 >= this.field2528 && (long) this.field2552 + this.field2528 > this.field2532) {
                    var7 = this.field2532;
                } else if (this.field2528 >= this.field2532 && this.field2532 + (long) arg1 > this.field2528) {
                    var7 = this.field2528;
                }
                this.field2553 += arg1;
                if (this.field2553 > this.field2527) {
                    this.field2527 = this.field2553;
                }
                if (this.field2528 < (long) arg1 + this.field2532 && (long) arg1 + this.field2532 <= (long) this.field2552 + this.field2528) {
                    var9 = (long) arg1 + this.field2532;
                } else if ((long) this.field2552 + this.field2528 > this.field2532 && this.field2528 + (long) this.field2552 <= (long) arg1 + this.field2532) {
                    var9 = (long) this.field2552 + this.field2528;
                }
                if (var7 > -1L && var7 < var9) {
                    int var11 = (int) (var9 - var7);
                    class128.method1077(arg2, (int) ((long) arg3 + var7 - this.field2532), this.field2535, (int) (var7 - this.field2528), var11);
                }
                this.field2532 += arg1;
            } else if (arg1 > 0) {
                if (this.field2551 == -1L) {
                    this.field2551 = this.field2532;
                }
                class128.method1077(arg2, arg3, this.field2534, (int) (this.field2532 - this.field2551), arg1);
                this.field2532 += arg1;
                if (this.field2532 - this.field2551 > (long) this.field2530) {
                    this.field2530 = (int) (this.field2532 - this.field2551);
                }
            }
        } catch (IOException var13) {
            this.field2553 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lic;II)V")
    public class102(class59 arg0, int arg1, int arg2) throws IOException {
        this.field2537 = arg0;
        this.field2550 = this.field2527 = arg0.method502(91);
        this.field2532 = 0L;
        this.field2535 = new byte[arg1];
        this.field2534 = new byte[arg2];
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    private final void method824(byte arg0) throws IOException {
        if (this.field2551 != -1L) {
            if (this.field2553 != this.field2551) {
                this.field2537.method499(this.field2551, (byte) -113);
                this.field2553 = this.field2551;
            }
            this.field2537.method501(this.field2534, 0, 15924, this.field2530);
            this.field2553 += this.field2530;
            if (this.field2553 > this.field2527) {
                this.field2527 = this.field2553;
            }
            long var2 = -1L;
            if (this.field2528 <= this.field2551 && this.field2551 < (long) this.field2552 + this.field2528) {
                var2 = this.field2551;
            } else if (this.field2528 >= this.field2551 && this.field2528 < (long) this.field2530 + this.field2551) {
                var2 = this.field2528;
            }
            long var4 = -1L;
            if (this.field2528 < this.field2551 + (long) this.field2530 && this.field2528 + (long) this.field2552 >= this.field2551 - -((long) this.field2530)) {
                var4 = (long) this.field2530 + this.field2551;
            } else if (this.field2551 < (long) this.field2552 + this.field2528 && (long) this.field2530 + this.field2551 >= this.field2528 - -((long) this.field2552)) {
                var4 = (long) this.field2552 + this.field2528;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class128.method1077(this.field2534, (int) (var2 - this.field2551), this.field2535, (int) (var2 - this.field2528), var6);
            }
            this.field2530 = 0;
            this.field2551 = -1L;
        }
        field2542++;
        if (arg0 != 48) {
            this.field2534 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    private final void method825(boolean arg0) throws IOException {
        this.field2552 = 0;
        field2538++;
        if (this.field2553 != this.field2532) {
            this.field2537.method499(this.field2532, (byte) -113);
            this.field2553 = this.field2532;
        }
        this.field2528 = this.field2532;
        while (this.field2552 < this.field2535.length) {
            int var2 = this.field2537.method500(this.field2552, this.field2535.length - this.field2552, this.field2535, -98);
            if (var2 == -1) {
                break;
            }
            this.field2553 += var2;
            this.field2552 += var2;
        }
        if (!arg0) {
            method816((byte) 100, 60, null);
        }
    }
}
