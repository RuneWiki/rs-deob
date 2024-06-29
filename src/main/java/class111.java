import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class111 {

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "J")
    private long field2630 = -1L;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    private int field2628 = 0;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "J")
    private long field2657 = -1L;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lhe;")
    private class54 field2646;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "J")
    private long field2631;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "J")
    private long field2626;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "[B")
    private byte[] field2654;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "J")
    private long field2643;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[B")
    private byte[] field2635;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lvc;")
    public static class137 field2633 = class45.method325("null", -46);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lvc;")
    public static class137 field2634 = class45.method325("Benutzen Sie bitte eine andere Welt)3", -46);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lvc;")
    private static class137 field2640 = class45.method325("wave2:", -46);

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lvc;")
    public static class137 field2644 = null;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Lvc;")
    private static class137 field2655 = class45.method325("This world is running a closed Beta)3", -46);

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lvc;")
    public static class137 field2638 = field2655;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Lvc;")
    public static class137 field2658 = field2640;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    private int field2650;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "J")
    public static long field2636;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "J")
    private long field2648;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lme;")
    public static class85 field2645;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BBII)V")
    public final void method855(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field2629++;
        if (arg1 != -56) {
            field2633 = null;
        }
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field2657 != -1L && this.field2657 <= this.field2643 && (long) this.field2628 + this.field2657 >= (long) arg2 + this.field2643) {
                class130.method962(this.field2654, (int) (this.field2643 - this.field2657), arg0, arg3, arg2);
                this.field2643 += arg2;
                return;
            }
            long var5 = this.field2643;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field2630 <= this.field2643 && this.field2630 + (long) this.field2650 > this.field2643) {
                int var9 = (int) ((long) this.field2650 + this.field2630 - this.field2643);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class130.method962(this.field2635, (int) (this.field2643 - this.field2630), arg0, arg3, var9);
                arg2 -= var9;
                arg3 += var9;
                this.field2643 += var9;
            }
            if (arg2 > this.field2635.length) {
                this.field2646.method381((byte) -44, this.field2643);
                this.field2648 = this.field2643;
                while (arg2 > 0) {
                    int var11 = this.field2646.method383(arg2, arg0, 0, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    this.field2643 += var11;
                    this.field2648 += var11;
                    arg3 += var11;
                }
            } else if (arg2 > 0) {
                this.method862(-128);
                int var10 = arg2;
                if (this.field2650 < arg2) {
                    var10 = this.field2650;
                }
                class130.method962(this.field2635, 0, arg0, arg3, var10);
                this.field2643 += var10;
                arg3 += var10;
                arg2 -= var10;
            }
            if (this.field2657 != -1L) {
                if (this.field2657 > this.field2643 && arg2 > 0) {
                    int var12 = (int) (this.field2657 - this.field2643) + arg3;
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2--;
                        arg0[arg3++] = 0;
                        this.field2643++;
                    }
                }
                long var13 = -1L;
                if (this.field2657 >= var5 && (long) var7 + var5 > this.field2657) {
                    var13 = this.field2657;
                } else if (this.field2657 <= var5 && (long) this.field2628 + this.field2657 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field2657 + (long) this.field2628 > var5 && (long) this.field2628 + this.field2657 <= (long) var7 + var5) {
                    var15 = (long) this.field2628 + this.field2657;
                } else if ((long) var7 + var5 > this.field2657 && (long) var7 + var5 <= (long) this.field2628 + this.field2657) {
                    var15 = var5 + (long) var7;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class130.method962(this.field2654, (int) (var13 - this.field2657), arg0, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field2643) {
                        arg2 = (int) ((long) arg2 + this.field2643 - var15);
                        this.field2643 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2648 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)J")
    public final long method856(int arg0) {
        field2641++;
        return arg0 == -1 ? this.field2626 : 25L;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IJ)V")
    public final void method857(int arg0, long arg1) {
        field2652++;
        if (arg0 == 20823 && arg1 >= 0L) {
            this.field2643 = arg1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lme;B)Lme;")
    public static final class85 method858(class85 arg0, byte arg1) {
        field2632++;
        int var2 = class46.method336(false, class28.method218(14485, arg0));
        if (arg1 >= -69) {
            return null;
        } else if (var2 == 0) {
            return null;
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                arg0 = class142.method1093(256, arg0.field1945);
                if (arg0 == null) {
                    return null;
                }
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public final void method859(int arg0) throws IOException {
        this.method864((byte) -127);
        field2642++;
        if (arg0 != -2131) {
            this.method856(47);
        }
        this.field2646.method380((byte) -50);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[BI)V")
    public final void method860(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2627++;
        try {
            if (this.field2626 < this.field2643 + (long) arg0) {
                this.field2626 = (long) arg0 + this.field2643;
            }
            if (this.field2657 != -1L && (this.field2657 > this.field2643 || this.field2643 > this.field2657 + (long) this.field2628)) {
                this.method864((byte) -117);
            }
            if (arg3 != -996872008) {
                method863(95, -73, 86, null);
            }
            if (this.field2657 != -1L && (long) arg0 + this.field2643 > (long) this.field2654.length + this.field2657) {
                int var5 = (int) (this.field2657 + (long) this.field2654.length - this.field2643);
                class130.method962(arg2, arg1, this.field2654, (int) (this.field2643 - this.field2657), var5);
                this.field2643 += var5;
                arg1 += var5;
                arg0 -= var5;
                this.field2628 = this.field2654.length;
                this.method864((byte) -112);
            }
            if (this.field2654.length < arg0) {
                long var6 = -1L;
                if (this.field2648 != this.field2643) {
                    this.field2646.method381((byte) -44, this.field2643);
                    this.field2648 = this.field2643;
                }
                this.field2646.method378(arg0, arg2, arg1, -1);
                long var8 = -1L;
                this.field2648 += arg0;
                if (this.field2631 < this.field2648) {
                    this.field2631 = this.field2648;
                }
                if ((long) arg0 + this.field2643 > this.field2630 && this.field2643 + (long) arg0 <= (long) this.field2650 + this.field2630) {
                    var8 = (long) arg0 + this.field2643;
                } else if ((long) this.field2650 + this.field2630 > this.field2643 && (long) this.field2650 + this.field2630 <= (long) arg0 + this.field2643) {
                    var8 = (long) this.field2650 + this.field2630;
                }
                if (this.field2643 >= this.field2630 && (long) this.field2650 + this.field2630 > this.field2643) {
                    var6 = this.field2643;
                } else if (this.field2643 <= this.field2630 && this.field2643 + (long) arg0 > this.field2630) {
                    var6 = this.field2630;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class130.method962(arg2, (int) ((long) arg1 + var6 - this.field2643), this.field2635, (int) (var6 - this.field2630), var10);
                }
                this.field2643 += arg0;
            } else if (arg0 > 0) {
                if (this.field2657 == -1L) {
                    this.field2657 = this.field2643;
                }
                class130.method962(arg2, arg1, this.field2654, (int) (this.field2643 - this.field2657), arg0);
                this.field2643 += arg0;
                if ((long) this.field2628 < this.field2643 - this.field2657) {
                    this.field2628 = (int) (this.field2643 - this.field2657);
                }
            }
        } catch (IOException var12) {
            this.field2648 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lnb;B)V")
    public static final void method861(class88 arg0, byte arg1) {
        field2653++;
        class25.field597 = arg0;
        if (arg1 != -107) {
            field2638 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    private final void method862(int arg0) throws IOException {
        this.field2650 = 0;
        if (this.field2648 != this.field2643) {
            this.field2646.method381((byte) -44, this.field2643);
            this.field2648 = this.field2643;
        }
        this.field2630 = this.field2643;
        while (this.field2650 < this.field2635.length) {
            int var2 = this.field2646.method383(this.field2635.length - this.field2650, this.field2635, 0, this.field2650);
            if (var2 == -1) {
                break;
            }
            this.field2648 += var2;
            this.field2650 += var2;
        }
        if (arg0 <= -89) {
            field2656++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILnb;)Lia;")
    public static final class57 method863(int arg0, int arg1, int arg2, class88 arg3) {
        if (arg1 != -30605) {
            method863(1, 101, 25, null);
        }
        field2649++;
        return class8.method55(arg3, arg0, -74, arg2) ? class106.method770(true) : null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    private final void method864(byte arg0) throws IOException {
        field2659++;
        if (arg0 > -109) {
            method866((byte) -126, -3, -89, 53);
        }
        if (this.field2657 == -1L) {
            return;
        }
        if (this.field2657 != this.field2648) {
            this.field2646.method381((byte) -44, this.field2657);
            this.field2648 = this.field2657;
        }
        long var2 = -1L;
        long var4 = -1L;
        this.field2646.method378(this.field2628, this.field2654, 0, -1);
        if (this.field2630 < this.field2657 + (long) this.field2628 && (long) this.field2628 + this.field2657 <= this.field2630 - -((long) this.field2650)) {
            var2 = this.field2657 + (long) this.field2628;
        } else if (this.field2657 < (long) this.field2650 + this.field2630 && (long) this.field2650 + this.field2630 <= (long) this.field2628 + this.field2657) {
            var2 = this.field2630 + (long) this.field2650;
        }
        this.field2648 += this.field2628;
        if (this.field2657 >= this.field2630 && this.field2657 < (long) this.field2650 + this.field2630) {
            var4 = this.field2657;
        } else if (this.field2657 <= this.field2630 && this.field2630 < (long) this.field2628 + this.field2657) {
            var4 = this.field2630;
        }
        if (this.field2631 < this.field2648) {
            this.field2631 = this.field2648;
        }
        if (var4 > -1L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class130.method962(this.field2654, (int) (var4 - this.field2657), this.field2635, (int) (var4 - this.field2630), var6);
        }
        this.field2657 = -1L;
        this.field2628 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static void method865(int arg0) {
        field2655 = null;
        field2644 = null;
        field2640 = null;
        field2634 = null;
        field2638 = null;
        if (arg0 != -1) {
            method861(null, (byte) -28);
        }
        field2633 = null;
        field2645 = null;
        field2658 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIII)I")
    public static final int method866(byte arg0, int arg1, int arg2, int arg3) {
        field2637++;
        if (arg0 != -22) {
            field2640 = null;
        }
        if ((class70.field1490[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class70.field1490[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lhe;II)V")
    public class111(class54 arg0, int arg1, int arg2) throws IOException {
        this.field2646 = arg0;
        this.field2626 = this.field2631 = arg0.method379((byte) 44);
        this.field2654 = new byte[arg2];
        this.field2643 = 0L;
        this.field2635 = new byte[arg1];
    }
}
