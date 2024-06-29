import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class119 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    private int field2654 = 0;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "J")
    private long field2668 = -1L;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "J")
    private long field2667 = -1L;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lka;")
    private class70 field2661;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "J")
    private long field2657;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "J")
    private long field2675;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[B")
    private byte[] field2660;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "J")
    private long field2659;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[B")
    private byte[] field2655;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Loa;")
    public static class98 field2663 = class38.method349(255, "scrollen:");

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Loa;")
    public static class98 field2671 = class38.method349(255, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Z")
    public static boolean field2676 = true;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lja;")
    public static class63 field2656 = new class63();

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Loa;")
    private static class98 field2683 = class38.method349(255, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Loa;")
    public static class98 field2685 = class38.method349(255, "Ausw-=hlen");

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "Loa;")
    public static class98 field2678 = class38.method349(255, "@gr1@");

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Loa;")
    public static class98 field2681 = field2683;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Loa;")
    private static class98 field2686 = class38.method349(255, "glow1:");

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Loa;")
    public static class98 field2679 = field2686;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Loa;")
    public static class98 field2687 = class38.method349(255, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Loa;")
    public static class98 field2684 = field2686;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    private int field2666;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "J")
    private long field2665;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[Z")
    public static boolean[] field2682;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BIZ)V")
    public final void method944(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if (!arg3) {
            this.method949(-111L, true);
        }
        field2673++;
        try {
            if (this.field2675 < this.field2659 + (long) arg0) {
                this.field2675 = (long) arg0 + this.field2659;
            }
            if (this.field2668 != -1L && (this.field2668 > this.field2659 || (long) this.field2654 + this.field2668 < this.field2659)) {
                this.method950(-1);
            }
            if (this.field2668 != -1L && this.field2659 + (long) arg0 > (long) this.field2655.length + this.field2668) {
                int var5 = (int) ((long) this.field2655.length + this.field2668 - this.field2659);
                class9.method108(arg1, arg2, this.field2655, (int) (this.field2659 - this.field2668), var5);
                arg2 += var5;
                this.field2659 += var5;
                arg0 -= var5;
                this.field2654 = this.field2655.length;
                this.method950(-1);
            }
            if (this.field2655.length < arg0) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2665 != this.field2659) {
                    this.field2661.method556((byte) 64, this.field2659);
                    this.field2665 = this.field2659;
                }
                this.field2661.method558(arg2, arg0, arg1, (byte) -128);
                if ((long) arg0 + this.field2659 > this.field2667 && (long) this.field2666 + this.field2667 >= (long) arg0 + this.field2659) {
                    var8 = (long) arg0 + this.field2659;
                } else if (this.field2659 < this.field2667 + (long) this.field2666 && (long) arg0 + this.field2659 >= (long) this.field2666 + this.field2667) {
                    var8 = (long) this.field2666 + this.field2667;
                }
                this.field2665 += arg0;
                if (this.field2667 <= this.field2659 && this.field2659 < (long) this.field2666 + this.field2667) {
                    var6 = this.field2659;
                } else if (this.field2667 >= this.field2659 && this.field2659 + (long) arg0 > this.field2667) {
                    var6 = this.field2667;
                }
                if (this.field2665 > this.field2657) {
                    this.field2657 = this.field2665;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class9.method108(arg1, (int) ((long) arg2 + var6 - this.field2659), this.field2660, (int) (var6 - this.field2667), var10);
                }
                this.field2659 += arg0;
            } else if (arg0 > 0) {
                if (this.field2668 == -1L) {
                    this.field2668 = this.field2659;
                }
                class9.method108(arg1, arg2, this.field2655, (int) (this.field2659 - this.field2668), arg0);
                this.field2659 += arg0;
                if (this.field2659 - this.field2668 > (long) this.field2654) {
                    this.field2654 = (int) (this.field2659 - this.field2668);
                }
            }
        } catch (IOException var12) {
            this.field2665 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)J")
    public final long method945(byte arg0) {
        field2677++;
        if (arg0 != 61) {
            this.method949(107L, false);
        }
        return this.field2675;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public final void method946(int arg0) throws IOException {
        this.method950(-1);
        this.field2661.method560(118);
        field2674++;
        if (arg0 != 0) {
            this.method949(-42L, true);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    private final void method947(int arg0) throws IOException {
        field2670++;
        this.field2666 = 0;
        if (arg0 != 15778) {
            this.method945((byte) -27);
        }
        if (this.field2665 != this.field2659) {
            this.field2661.method556((byte) 64, this.field2659);
            this.field2665 = this.field2659;
        }
        this.field2667 = this.field2659;
        while (this.field2666 < this.field2660.length) {
            int var2 = this.field2661.method557(this.field2660, this.field2660.length - this.field2666, this.field2666, (byte) 90);
            if (var2 == -1) {
                break;
            }
            this.field2665 += var2;
            this.field2666 += var2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2686 = null;
        field2685 = null;
        int var1 = -122 / ((48 - arg0) / 57);
        field2656 = null;
        field2663 = null;
        field2671 = null;
        field2682 = null;
        field2679 = null;
        field2683 = null;
        field2681 = null;
        field2678 = null;
        field2684 = null;
        field2687 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JZ)V")
    public final void method949(long arg0, boolean arg1) {
        field2664++;
        if (arg0 >= 0L) {
            this.field2659 = arg0;
            if (arg1) {
                field2687 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    private final void method950(int arg0) throws IOException {
        if (arg0 != -1) {
            return;
        }
        field2658++;
        if (this.field2668 == -1L) {
            return;
        }
        if (this.field2668 != this.field2665) {
            this.field2661.method556((byte) 64, this.field2668);
            this.field2665 = this.field2668;
        }
        this.field2661.method558(0, this.field2654, this.field2655, (byte) -127);
        this.field2665 += this.field2654;
        if (this.field2657 < this.field2665) {
            this.field2657 = this.field2665;
        }
        long var2 = -1L;
        if (this.field2667 <= this.field2668 && (long) this.field2666 + this.field2667 > this.field2668) {
            var2 = this.field2668;
        } else if (this.field2668 <= this.field2667 && this.field2667 < (long) this.field2654 + this.field2668) {
            var2 = this.field2667;
        }
        long var4 = -1L;
        if (this.field2667 < this.field2668 + (long) this.field2654 && (long) this.field2654 + this.field2668 <= this.field2667 - -((long) this.field2666)) {
            var4 = this.field2668 + (long) this.field2654;
        } else if ((long) this.field2666 + this.field2667 > this.field2668 && this.field2668 + (long) this.field2654 >= this.field2667 - -((long) this.field2666)) {
            var4 = (long) this.field2666 + this.field2667;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class9.method108(this.field2655, (int) (var2 - this.field2668), this.field2660, (int) (var2 - this.field2667), var6);
        }
        this.field2654 = 0;
        this.field2668 = -1L;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([BIZI)V")
    public final void method951(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        field2672++;
        try {
            if (arg1 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg0.length);
            }
            if (arg2) {
                this.field2660 = null;
            }
            if (this.field2668 != -1L && this.field2668 <= this.field2659 && (long) this.field2654 + this.field2668 >= (long) arg1 + this.field2659) {
                class9.method108(this.field2655, (int) (this.field2659 - this.field2668), arg0, arg3, arg1);
                this.field2659 += arg1;
                return;
            }
            long var5 = this.field2659;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field2667 <= this.field2659 && (long) this.field2666 + this.field2667 > this.field2659) {
                int var9 = (int) ((long) this.field2666 + this.field2667 - this.field2659);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class9.method108(this.field2660, (int) (this.field2659 - this.field2667), arg0, arg3, var9);
                this.field2659 += var9;
                arg3 += var9;
            }
            if (arg1 > this.field2660.length) {
                this.field2661.method556((byte) 64, this.field2659);
                this.field2665 = this.field2659;
                while (arg1 > 0) {
                    int var10 = this.field2661.method557(arg0, arg1, arg3, (byte) 123);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2665 += var10;
                    this.field2659 += var10;
                    arg3 += var10;
                    arg1 -= var10;
                }
            } else if (arg1 > 0) {
                this.method947(15778);
                int var11 = arg1;
                if (arg1 > this.field2666) {
                    var11 = this.field2666;
                }
                arg1 -= var11;
                class9.method108(this.field2660, 0, arg0, arg3, var11);
                this.field2659 += var11;
                arg3 += var11;
            }
            if (this.field2668 != -1L) {
                if (this.field2668 > this.field2659 && arg1 > 0) {
                    int var12 = (int) (this.field2668 - this.field2659) + arg3;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1--;
                        arg0[arg3++] = 0;
                        this.field2659++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if ((long) this.field2654 + this.field2668 > var5 && (long) this.field2654 + this.field2668 <= var5 - -((long) var7)) {
                    var13 = this.field2668 + (long) this.field2654;
                } else if (this.field2668 < var5 + (long) var7 && this.field2668 + (long) this.field2654 >= var5 - -((long) var7)) {
                    var13 = (long) var7 + var5;
                }
                if (this.field2668 >= var5 && this.field2668 < (long) var7 + var5) {
                    var15 = this.field2668;
                } else if (var5 >= this.field2668 && (long) this.field2654 + this.field2668 > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class9.method108(this.field2655, (int) (var15 - this.field2668), arg0, (int) (var15 - var5) + var8, var17);
                    if (this.field2659 < var13) {
                        arg1 = (int) ((long) arg1 + this.field2659 - var13);
                        this.field2659 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2665 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lka;II)V")
    public class119(class70 arg0, int arg1, int arg2) throws IOException {
        this.field2661 = arg0;
        this.field2675 = this.field2657 = arg0.method561((byte) 107);
        this.field2660 = new byte[arg1];
        this.field2659 = 0L;
        this.field2655 = new byte[arg2];
    }
}
