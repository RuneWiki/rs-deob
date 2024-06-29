import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class125 {

    @OriginalMember(owner = "client!w", name = "o", descriptor = "J")
    private long field2698 = -1L;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "J")
    private long field2712 = -1L;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    private int field2716 = 0;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Lqb;")
    private class97 field2707;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "J")
    private long field2697;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "J")
    private long field2691;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "[B")
    private byte[] field2689;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[B")
    private byte[] field2686;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "J")
    private long field2687;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2684 = 0;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2690 = -1;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field2696 = 0;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field2703 = 0;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2685 = 2301979;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[Z")
    public static boolean[] field2706 = new boolean[112];

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field2714 = -1;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "J")
    private long field2688;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Z")
    public static boolean field2701;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[I")
    public static int[] field2708;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[I")
    public static int[] field2709;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BIIZ)V")
    public final void method917(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field2699++;
        try {
            if (arg0.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2712 != -1L && this.field2712 <= this.field2687 && this.field2687 + (long) arg2 <= (long) this.field2716 + this.field2712) {
                class48.method316(this.field2689, (int) (this.field2687 - this.field2712), arg0, arg1, arg2);
                this.field2687 += arg2;
                return;
            }
            int var5 = arg1;
            long var6 = this.field2687;
            if (!arg3) {
                method921((byte) 55);
            }
            int var8 = arg2;
            if (this.field2687 >= this.field2698 && (long) this.field2715 + this.field2698 > this.field2687) {
                int var9 = (int) (this.field2698 + (long) this.field2715 - this.field2687);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class48.method316(this.field2686, (int) (this.field2687 - this.field2698), arg0, arg1, var9);
                arg2 -= var9;
                arg1 += var9;
                this.field2687 += var9;
            }
            if (this.field2686.length < arg2) {
                this.field2707.method738(true, this.field2687);
                this.field2688 = this.field2687;
                while (arg2 > 0) {
                    int var10 = this.field2707.method734(1, arg1, arg0, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 -= var10;
                    this.field2688 += var10;
                    this.field2687 += var10;
                    arg1 += var10;
                }
            } else if (arg2 > 0) {
                this.method918(-101);
                int var11 = arg2;
                if (this.field2715 < arg2) {
                    var11 = this.field2715;
                }
                arg2 -= var11;
                class48.method316(this.field2686, 0, arg0, arg1, var11);
                arg1 += var11;
                this.field2687 += var11;
            }
            if (this.field2712 != -1L) {
                if (this.field2687 < this.field2712 && arg2 > 0) {
                    int var12 = (int) (this.field2712 - this.field2687) + arg1;
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2687++;
                    }
                }
                long var13 = -1L;
                if (var6 <= this.field2712 && this.field2712 < (long) var8 + var6) {
                    var13 = this.field2712;
                } else if (var6 >= this.field2712 && var6 < (long) this.field2716 + this.field2712) {
                    var13 = var6;
                }
                long var15 = -1L;
                if (var6 < (long) this.field2716 + this.field2712 && (long) this.field2716 + this.field2712 <= (long) var8 + var6) {
                    var15 = (long) this.field2716 + this.field2712;
                } else if (this.field2712 < (long) var8 + var6 && this.field2712 + (long) this.field2716 >= (long) var8 + var6) {
                    var15 = var6 + (long) var8;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class48.method316(this.field2689, (int) (var13 - this.field2712), arg0, var5 + (int) (var13 - var6), var17);
                    if (var15 > this.field2687) {
                        arg2 = (int) ((long) arg2 + this.field2687 - var15);
                        this.field2687 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2688 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    private final void method918(int arg0) throws IOException {
        field2700++;
        this.field2715 = 0;
        if (this.field2688 != this.field2687) {
            this.field2707.method738(true, this.field2687);
            this.field2688 = this.field2687;
        }
        this.field2698 = this.field2687;
        if (arg0 >= -31) {
            field2690 = 97;
        }
        while (this.field2686.length > this.field2715) {
            int var2 = this.field2707.method734(1, this.field2715, this.field2686, this.field2686.length - this.field2715);
            if (var2 == -1) {
                break;
            }
            this.field2688 += var2;
            this.field2715 += var2;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2708 = null;
        field2706 = null;
        field2709 = null;
        if (arg0 != 0) {
            method921((byte) 96);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public final void method920(int arg0) throws IOException {
        this.method922((byte) 58);
        int var2 = 127 / ((-arg0 - 78) / 32);
        field2713++;
        this.field2707.method735(0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
    public static final int method921(byte arg0) {
        field2711++;
        int var1 = class53.method341(0, class55.field1164, class108.field2395, class71.field1588);
        if (var1 - class70.field1561 >= 800 || (class43.field856[class71.field1588][class55.field1164 >> 7][class108.field2395 >> 7] & 0x4) == 0) {
            return arg0 >= -72 ? -73 : 3;
        } else {
            return class71.field1588;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    private final void method922(byte arg0) throws IOException {
        if (this.field2712 != -1L) {
            if (this.field2712 != this.field2688) {
                this.field2707.method738(true, this.field2712);
                this.field2688 = this.field2712;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field2707.method737(this.field2689, this.field2716, 0, (byte) -11);
            if ((long) this.field2716 + this.field2712 > this.field2698 && this.field2698 + (long) this.field2715 >= (long) this.field2716 + this.field2712) {
                var2 = (long) this.field2716 + this.field2712;
            } else if ((long) this.field2715 + this.field2698 > this.field2712 && (long) this.field2716 + this.field2712 >= (long) this.field2715 + this.field2698) {
                var2 = (long) this.field2715 + this.field2698;
            }
            if (this.field2712 >= this.field2698 && (long) this.field2715 + this.field2698 > this.field2712) {
                var4 = this.field2712;
            } else if (this.field2698 >= this.field2712 && this.field2698 < (long) this.field2716 + this.field2712) {
                var4 = this.field2698;
            }
            this.field2688 += this.field2716;
            if (this.field2688 > this.field2697) {
                this.field2697 = this.field2688;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class48.method316(this.field2689, (int) (var4 - this.field2712), this.field2686, (int) (var4 - this.field2698), var6);
            }
            this.field2716 = 0;
            this.field2712 = -1L;
        }
        field2710++;
        if (arg0 < 52) {
            this.method924(38);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BJ)V")
    public final void method923(byte arg0, long arg1) {
        int var4 = -43 % ((arg0 + 6) / 61);
        field2695++;
        if (arg1 >= 0L) {
            this.field2687 = arg1;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)J")
    public final long method924(int arg0) {
        if (arg0 != -5655) {
            this.field2715 = 6;
        }
        field2692++;
        return this.field2691;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[BIZ)V")
    public final void method925(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if (!arg3) {
            this.field2715 = 28;
        }
        field2702++;
        try {
            if ((long) arg0 + this.field2687 > this.field2691) {
                this.field2691 = (long) arg0 + this.field2687;
            }
            if (this.field2712 != -1L && (this.field2712 > this.field2687 || this.field2687 > (long) this.field2716 + this.field2712)) {
                this.method922((byte) 116);
            }
            if (this.field2712 != -1L && (long) arg0 + this.field2687 > (long) this.field2689.length + this.field2712) {
                int var5 = (int) ((long) this.field2689.length + this.field2712 - this.field2687);
                class48.method316(arg1, arg2, this.field2689, (int) (this.field2687 - this.field2712), var5);
                this.field2687 += var5;
                arg2 += var5;
                arg0 -= var5;
                this.field2716 = this.field2689.length;
                this.method922((byte) 74);
            }
            if (arg0 > this.field2689.length) {
                if (this.field2688 != this.field2687) {
                    this.field2707.method738(true, this.field2687);
                    this.field2688 = this.field2687;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field2707.method737(arg1, arg0, arg2, (byte) -11);
                if (this.field2698 < (long) arg0 + this.field2687 && (long) arg0 + this.field2687 <= this.field2698 - -((long) this.field2715)) {
                    var8 = (long) arg0 + this.field2687;
                } else if (this.field2687 < (long) this.field2715 + this.field2698 && (long) this.field2715 + this.field2698 <= this.field2687 - -((long) arg0)) {
                    var8 = this.field2698 + (long) this.field2715;
                }
                if (this.field2698 <= this.field2687 && this.field2687 < (long) this.field2715 + this.field2698) {
                    var6 = this.field2687;
                } else if (this.field2698 >= this.field2687 && this.field2687 + (long) arg0 > this.field2698) {
                    var6 = this.field2698;
                }
                this.field2688 += arg0;
                if (this.field2688 > this.field2697) {
                    this.field2697 = this.field2688;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class48.method316(arg1, (int) ((long) arg2 + var6 - this.field2687), this.field2686, (int) (var6 - this.field2698), var10);
                }
                this.field2687 += arg0;
            } else if (arg0 > 0) {
                if (this.field2712 == -1L) {
                    this.field2712 = this.field2687;
                }
                class48.method316(arg1, arg2, this.field2689, (int) (this.field2687 - this.field2712), arg0);
                this.field2687 += arg0;
                if (this.field2687 - this.field2712 > (long) this.field2716) {
                    this.field2716 = (int) (this.field2687 - this.field2712);
                }
            }
        } catch (IOException var12) {
            this.field2688 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lqb;II)V")
    public class125(class97 arg0, int arg1, int arg2) throws IOException {
        this.field2707 = arg0;
        this.field2691 = this.field2697 = arg0.method736(-1);
        this.field2689 = new byte[arg2];
        this.field2686 = new byte[arg1];
        this.field2687 = 0L;
    }
}
