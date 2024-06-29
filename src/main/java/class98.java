import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class98 {

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "J")
    private long field2531 = -1L;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    private int field2550 = 0;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "J")
    private long field2545 = -1L;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lsa;")
    private class107 field2547;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "J")
    private long field2540;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "J")
    private long field2537;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[B")
    private byte[] field2539;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "[B")
    private byte[] field2553;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "J")
    private long field2548;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lke;")
    public static class65 field2524 = class1.method17(" )2> @cya@", -112);

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lke;")
    public static class65 field2546 = class1.method17(" hat sich eingeloggt)3", -126);

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lke;")
    private static class65 field2532 = class1.method17("Enter name of player to add to list", -121);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lke;")
    public static class65 field2526 = field2532;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lke;")
    private static class65 field2534 = class1.method17("Add ignore", -114);

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lke;")
    public static class65 field2543 = field2534;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lqd;")
    public static class100 field2530 = new class100(260);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    private int field2538;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "J")
    private long field2544;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lca;")
    public static class13 field2541;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Lf;")
    public static class34 field2551;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BII)V", line = 3)
    public final void method819(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2525++;
        try {
            if (arg0 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (this.field2545 != -1L && this.field2545 <= this.field2548 && (long) arg3 + this.field2548 <= (long) this.field2550 + this.field2545) {
                class68.method572(this.field2539, (int) (this.field2548 - this.field2545), arg1, arg0, arg3);
                this.field2548 += arg3;
                return;
            }
            long var5 = this.field2548;
            int var7 = arg3;
            int var8 = arg0;
            int var9 = -59 / ((arg2 - 50) / 44);
            if (this.field2548 >= this.field2531 && (long) this.field2538 + this.field2531 > this.field2548) {
                int var10 = (int) (this.field2531 + (long) this.field2538 - this.field2548);
                if (var10 > arg3) {
                    var10 = arg3;
                }
                arg3 -= var10;
                class68.method572(this.field2553, (int) (this.field2548 - this.field2531), arg1, arg0, var10);
                this.field2548 += var10;
                arg0 += var10;
            }
            if (arg3 > this.field2553.length) {
                this.field2547.method880((byte) 109, this.field2548);
                this.field2544 = this.field2548;
                while (arg3 > 0) {
                    int var12 = this.field2547.method878(arg1, arg0, (byte) 114, arg3);
                    if (var12 == -1) {
                        break;
                    }
                    arg0 += var12;
                    arg3 -= var12;
                    this.field2544 += var12;
                    this.field2548 += var12;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method823(-1);
                if (arg3 > this.field2538) {
                    var11 = this.field2538;
                }
                class68.method572(this.field2553, 0, arg1, arg0, var11);
                this.field2548 += var11;
                arg3 -= var11;
                arg0 += var11;
            }
            if (this.field2545 != -1L) {
                if (this.field2548 < this.field2545 && arg3 > 0) {
                    int var13 = (int) (this.field2545 - this.field2548) + arg0;
                    if (arg0 + arg3 < var13) {
                        var13 = arg0 + arg3;
                    }
                    while (arg0 < var13) {
                        arg1[arg0++] = 0;
                        arg3--;
                        this.field2548++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (this.field2545 >= var5 && this.field2545 < (long) var7 + var5) {
                    var16 = this.field2545;
                } else if (this.field2545 <= var5 && var5 < (long) this.field2550 + this.field2545) {
                    var16 = var5;
                }
                if (this.field2545 + (long) this.field2550 > var5 && (long) this.field2550 + this.field2545 <= (long) var7 + var5) {
                    var14 = this.field2545 + (long) this.field2550;
                } else if (var5 + (long) var7 > this.field2545 && this.field2545 + (long) this.field2550 >= (long) var7 + var5) {
                    var14 = (long) var7 + var5;
                }
                if (var16 > -1L && var14 > var16) {
                    int var18 = (int) (var14 - var16);
                    class68.method572(this.field2539, (int) (var16 - this.field2545), arg1, (int) (var16 - var5) + var8, var18);
                    if (var14 > this.field2548) {
                        arg3 = (int) ((long) arg3 + this.field2548 - var14);
                        this.field2548 = var14;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2544 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 197)
    public final void method820(byte arg0) throws IOException {
        this.method824((byte) 89);
        this.field2547.method877(true);
        if (arg0 == -82) {
            field2527++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J", line = 210)
    public final long method821(int arg0) {
        field2542++;
        if (arg0 < 101) {
            this.method826(20L, (byte) 101);
        }
        return this.field2537;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 230)
    public static void method822(int arg0) {
        field2530 = null;
        field2543 = null;
        if (arg0 > -106) {
            return;
        }
        field2526 = null;
        field2551 = null;
        field2524 = null;
        field2546 = null;
        field2541 = null;
        field2534 = null;
        field2532 = null;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V", line = 249)
    private final void method823(int arg0) throws IOException {
        field2552++;
        if (arg0 != -1) {
            this.method821(-46);
        }
        this.field2538 = 0;
        if (this.field2548 != this.field2544) {
            this.field2547.method880((byte) -94, this.field2548);
            this.field2544 = this.field2548;
        }
        this.field2531 = this.field2548;
        while (this.field2538 < this.field2553.length) {
            int var2 = this.field2547.method878(this.field2553, this.field2538, (byte) 61, this.field2553.length - this.field2538);
            if (var2 == -1) {
                break;
            }
            this.field2538 += var2;
            this.field2544 += var2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 304)
    private final void method824(byte arg0) throws IOException {
        int var2 = -33 / ((33 - arg0) / 51);
        field2536++;
        if (this.field2545 == -1L) {
            return;
        }
        if (this.field2545 != this.field2544) {
            this.field2547.method880((byte) -121, this.field2545);
            this.field2544 = this.field2545;
        }
        this.field2547.method881(0, 32397, this.field2539, this.field2550);
        long var3 = -1L;
        if ((long) this.field2550 + this.field2545 > this.field2531 && (long) this.field2538 + this.field2531 >= (long) this.field2550 + this.field2545) {
            var3 = (long) this.field2550 + this.field2545;
        } else if ((long) this.field2538 + this.field2531 > this.field2545 && (long) this.field2550 + this.field2545 >= (long) this.field2538 + this.field2531) {
            var3 = this.field2531 + (long) this.field2538;
        }
        long var5 = -1L;
        if (this.field2531 <= this.field2545 && this.field2545 < (long) this.field2538 + this.field2531) {
            var5 = this.field2545;
        } else if (this.field2545 <= this.field2531 && (long) this.field2550 + this.field2545 > this.field2531) {
            var5 = this.field2531;
        }
        this.field2544 += this.field2550;
        if (this.field2544 > this.field2540) {
            this.field2540 = this.field2544;
        }
        if (var5 > -1L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class68.method572(this.field2539, (int) (var5 - this.field2545), this.field2553, (int) (var5 - this.field2531), var7);
        }
        this.field2550 = 0;
        this.field2545 = -1L;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lsa;II)V", line = 587)
    public class98(class107 arg0, int arg1, int arg2) throws IOException {
        this.field2547 = arg0;
        this.field2537 = this.field2540 = arg0.method876(true);
        this.field2539 = new byte[arg2];
        this.field2553 = new byte[arg1];
        this.field2548 = 0L;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjd;II)[Lkb;", line = 400)
    public static final class61[] method825(int arg0, class58 arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            method822(-75);
        }
        field2529++;
        return class97.method811(4, arg3, arg1, arg0) ? client.method140((byte) -104) : null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)V", line = 434)
    public final void method826(long arg0, byte arg1) {
        if (arg1 != 43) {
            this.method826(10L, (byte) -124);
        }
        field2535++;
        if (arg0 >= 0L) {
            this.field2548 = arg0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BI)V", line = 462)
    public final void method827(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2549++;
        try {
            int var5 = 7 % ((arg3 - 60) / 58);
            if (this.field2548 + (long) arg0 > this.field2537) {
                this.field2537 = (long) arg0 + this.field2548;
            }
            if (this.field2545 != -1L && (this.field2545 > this.field2548 || this.field2548 > (long) this.field2550 + this.field2545)) {
                this.method824((byte) -69);
            }
            if (this.field2545 != -1L && (long) arg0 + this.field2548 > (long) this.field2539.length + this.field2545) {
                int var6 = (int) ((long) this.field2539.length + this.field2545 - this.field2548);
                class68.method572(arg2, arg1, this.field2539, (int) (this.field2548 - this.field2545), var6);
                arg1 += var6;
                this.field2548 += var6;
                arg0 -= var6;
                this.field2550 = this.field2539.length;
                this.method824((byte) 98);
            }
            if (arg0 > this.field2539.length) {
                long var7 = -1L;
                long var9 = -1L;
                if (this.field2548 != this.field2544) {
                    this.field2547.method880((byte) -79, this.field2548);
                    this.field2544 = this.field2548;
                }
                this.field2547.method881(arg1, 32397, arg2, arg0);
                this.field2544 += arg0;
                if (this.field2544 > this.field2540) {
                    this.field2540 = this.field2544;
                }
                if (this.field2531 <= this.field2548 && this.field2548 < (long) this.field2538 + this.field2531) {
                    var7 = this.field2548;
                } else if (this.field2531 >= this.field2548 && this.field2531 < (long) arg0 + this.field2548) {
                    var7 = this.field2531;
                }
                if (this.field2531 < (long) arg0 + this.field2548 && (long) this.field2538 + this.field2531 >= (long) arg0 + this.field2548) {
                    var9 = this.field2548 + (long) arg0;
                } else if ((long) this.field2538 + this.field2531 > this.field2548 && (long) arg0 + this.field2548 >= (long) this.field2538 + this.field2531) {
                    var9 = (long) this.field2538 + this.field2531;
                }
                if (var7 > -1L && var7 < var9) {
                    int var11 = (int) (var9 - var7);
                    class68.method572(arg2, (int) ((long) arg1 + var7 - this.field2548), this.field2553, (int) (var7 - this.field2531), var11);
                }
                this.field2548 += arg0;
            } else if (arg0 > 0) {
                if (this.field2545 == -1L) {
                    this.field2545 = this.field2548;
                }
                class68.method572(arg2, arg1, this.field2539, (int) (this.field2548 - this.field2545), arg0);
                this.field2548 += arg0;
                if ((long) this.field2550 < this.field2548 - this.field2545) {
                    this.field2550 = (int) (this.field2548 - this.field2545);
                }
            }
        } catch (IOException var13) {
            this.field2544 = -1L;
            throw var13;
        }
    }
}
