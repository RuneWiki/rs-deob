import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class144 {

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "J")
    private long field2593 = -1L;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    private int field2589 = 0;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "J")
    private long field2612 = -1L;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lmg;")
    private class121 field2604;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "J")
    private long field2606;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "J")
    private long field2599;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "J")
    private long field2600;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "[B")
    private byte[] field2613;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "[B")
    private byte[] field2608;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "[[S")
    public static short[][] field2607 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Ltg;")
    public static class184 field2598 = class135.method812("Bitte entfernen Sie ", 3);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    private int field2596;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "J")
    private long field2594;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method881(int arg0) {
        if (arg0 != 3673) {
            field2598 = null;
        }
        field2598 = null;
        field2607 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[Lgf;[BIIII)V")
    public static final void method882(int arg0, class65[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field2611++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg4 + var12 > 0 && arg4 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg1[var7].field1234[arg4 + var12][arg5 + var13] = class10.method61(arg1[var7].field1234[arg4 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class97 var8 = new class97(arg2);
        if (arg3 <= 125) {
            return;
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class85.method504(0, arg6, arg0, var10 + arg4, (byte) -38, var11 + arg5, var8, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
    public final void method883(byte arg0, long arg1) throws IOException {
        if (arg0 != -11) {
            this.method890((byte) -56);
        }
        field2595++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method890((byte) -121));
        }
        this.field2600 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[Ltg;)Ltg;")
    public static final class184 method884(int arg0, class184[] arg1) {
        field2614++;
        if (arg0 != 0) {
            method882(43, null, null, 102, -70, 25, -6);
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class206.method1304(arg1, arg1.length, -22629, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z[B)V")
    public final void method885(boolean arg0, byte[] arg1) throws IOException {
        field2597++;
        this.method887(arg0, arg1.length, arg1, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public final void method886(byte arg0) throws IOException {
        field2592++;
        if (arg0 == 59) {
            this.method892(71);
            this.field2604.method733(0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI[BI)V")
    public final void method887(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2590++;
        try {
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field2593 != -1L && this.field2600 >= this.field2593 && this.field2593 + (long) this.field2589 >= (long) arg1 + this.field2600) {
                class93.method539(this.field2608, (int) (this.field2600 - this.field2593), arg2, arg3, arg1);
                this.field2600 += arg1;
                return;
            }
            long var5 = this.field2600;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field2612 <= this.field2600 && (long) this.field2596 + this.field2612 > this.field2600) {
                int var9 = (int) ((long) this.field2596 + this.field2612 - this.field2600);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class93.method539(this.field2613, (int) (this.field2600 - this.field2612), arg2, arg3, var9);
                this.field2600 += var9;
                arg1 -= var9;
                arg3 += var9;
            }
            if (arg1 > this.field2613.length) {
                this.field2604.method732(this.field2600, -95);
                this.field2594 = this.field2600;
                while (arg1 > 0) {
                    int var10 = this.field2604.method728(arg3, arg2, (byte) 6, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2594 += var10;
                    this.field2600 += var10;
                    arg1 -= var10;
                    arg3 += var10;
                }
            } else if (arg1 > 0) {
                this.method893(-27314);
                int var11 = arg1;
                if (arg1 > this.field2596) {
                    var11 = this.field2596;
                }
                class93.method539(this.field2613, 0, arg2, arg3, var11);
                arg3 += var11;
                this.field2600 += var11;
                arg1 -= var11;
            }
            if (this.field2593 != -1L) {
                if (this.field2600 < this.field2593 && arg1 > 0) {
                    int var12 = (int) (this.field2593 - this.field2600) + arg3;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1--;
                        arg2[arg3++] = 0;
                        this.field2600++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2593 && this.field2593 < var5 + (long) var8) {
                    var13 = this.field2593;
                } else if (var5 >= this.field2593 && var5 < (long) this.field2589 + this.field2593) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field2593 + (long) this.field2589 > var5 && (long) this.field2589 + this.field2593 <= (long) var8 + var5) {
                    var15 = (long) this.field2589 + this.field2593;
                } else if (var5 + (long) var8 > this.field2593 && (long) this.field2589 + this.field2593 >= (long) var8 + var5) {
                    var15 = var5 + (long) var8;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class93.method539(this.field2608, (int) (var13 - this.field2593), arg2, var7 + (int) (var13 - var5), var17);
                    if (var15 > this.field2600) {
                        arg1 = (int) ((long) arg1 + this.field2600 - var15);
                        this.field2600 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2594 = -1L;
            throw var19;
        }
        if (arg0) {
            method881(55);
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static final void method888(byte arg0) {
        field2602++;
        if (arg0 <= 8) {
            method884(-87, null);
        }
        if (class46.field866 != null) {
            class38 var1 = class46.field866;
            synchronized (class46.field866) {
                class46.field866 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI[B)V")
    public final void method889(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field2605++;
        try {
            int var5 = -43 % ((25 - arg1) / 41);
            if (this.field2599 < (long) arg2 + this.field2600) {
                this.field2599 = this.field2600 + (long) arg2;
            }
            if (this.field2593 != -1L && (this.field2593 > this.field2600 || this.field2600 > this.field2593 + (long) this.field2589)) {
                this.method892(-104);
            }
            if (this.field2593 != -1L && this.field2593 + (long) this.field2608.length < this.field2600 - -((long) arg2)) {
                int var6 = (int) ((long) this.field2608.length + this.field2593 - this.field2600);
                arg2 -= var6;
                class93.method539(arg3, arg0, this.field2608, (int) (this.field2600 - this.field2593), var6);
                this.field2600 += var6;
                arg0 += var6;
                this.field2589 = this.field2608.length;
                this.method892(72);
            }
            if (arg2 > this.field2608.length) {
                if (this.field2600 != this.field2594) {
                    this.field2604.method732(this.field2600, -62);
                    this.field2594 = this.field2600;
                }
                long var7 = -1L;
                this.field2604.method730(arg3, arg0, arg2, (byte) -61);
                long var9 = -1L;
                if ((long) arg2 + this.field2600 > this.field2612 && (long) arg2 + this.field2600 <= this.field2612 - -((long) this.field2596)) {
                    var7 = this.field2600 + (long) arg2;
                } else if ((long) this.field2596 + this.field2612 > this.field2600 && (long) arg2 + this.field2600 >= (long) this.field2596 + this.field2612) {
                    var7 = (long) this.field2596 + this.field2612;
                }
                if (this.field2600 >= this.field2612 && this.field2600 < (long) this.field2596 + this.field2612) {
                    var9 = this.field2600;
                } else if (this.field2600 <= this.field2612 && this.field2612 < this.field2600 + (long) arg2) {
                    var9 = this.field2612;
                }
                this.field2594 += arg2;
                if (this.field2606 < this.field2594) {
                    this.field2606 = this.field2594;
                }
                if (var9 > -1L && var9 < var7) {
                    int var11 = (int) (var7 - var9);
                    class93.method539(arg3, (int) ((long) arg0 + var9 - this.field2600), this.field2613, (int) (var9 - this.field2612), var11);
                }
                this.field2600 += arg2;
            } else if (arg2 > 0) {
                if (this.field2593 == -1L) {
                    this.field2593 = this.field2600;
                }
                class93.method539(arg3, arg0, this.field2608, (int) (this.field2600 - this.field2593), arg2);
                this.field2600 += arg2;
                if ((long) this.field2589 < this.field2600 - this.field2593) {
                    this.field2589 = (int) (this.field2600 - this.field2593);
                }
            }
        } catch (IOException var13) {
            this.field2594 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)Ljava/io/File;")
    private final File method890(byte arg0) {
        if (arg0 != -121) {
            this.field2606 = 117L;
        }
        field2603++;
        return this.field2604.method731(1);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)J")
    public final long method891(boolean arg0) {
        field2609++;
        if (arg0) {
            method888((byte) 94);
        }
        return this.field2599;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    private final void method892(int arg0) throws IOException {
        field2591++;
        int var2 = -31 / ((-arg0 - 58) / 35);
        if (this.field2593 == -1L) {
            return;
        }
        if (this.field2594 != this.field2593) {
            this.field2604.method732(this.field2593, -125);
            this.field2594 = this.field2593;
        }
        long var3 = -1L;
        long var5 = -1L;
        this.field2604.method730(this.field2608, 0, this.field2589, (byte) -61);
        this.field2594 += this.field2589;
        if (this.field2612 <= this.field2593 && this.field2593 < this.field2612 + (long) this.field2596) {
            var5 = this.field2593;
        } else if (this.field2593 <= this.field2612 && this.field2612 < (long) this.field2589 + this.field2593) {
            var5 = this.field2612;
        }
        if (this.field2593 + (long) this.field2589 > this.field2612 && this.field2612 + (long) this.field2596 >= (long) this.field2589 + this.field2593) {
            var3 = this.field2593 + (long) this.field2589;
        } else if (this.field2612 + (long) this.field2596 > this.field2593 && (long) this.field2596 + this.field2612 <= (long) this.field2589 + this.field2593) {
            var3 = (long) this.field2596 + this.field2612;
        }
        if (this.field2606 < this.field2594) {
            this.field2606 = this.field2594;
        }
        if (var5 > -1L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class93.method539(this.field2608, (int) (var5 - this.field2593), this.field2613, (int) (var5 - this.field2612), var7);
        }
        this.field2589 = 0;
        this.field2593 = -1L;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    private final void method893(int arg0) throws IOException {
        if (arg0 != -27314) {
            return;
        }
        this.field2596 = 0;
        if (this.field2600 != this.field2594) {
            this.field2604.method732(this.field2600, -90);
            this.field2594 = this.field2600;
        }
        field2610++;
        this.field2612 = this.field2600;
        while (this.field2613.length > this.field2596) {
            int var2 = this.field2604.method728(this.field2596, this.field2613, (byte) 6, this.field2613.length - this.field2596);
            if (var2 == -1) {
                break;
            }
            this.field2596 += var2;
            this.field2594 += var2;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lmg;II)V")
    public class144(class121 arg0, int arg1, int arg2) throws IOException {
        this.field2604 = arg0;
        this.field2599 = this.field2606 = arg0.method729(false);
        this.field2600 = 0L;
        this.field2613 = new byte[arg1];
        this.field2608 = new byte[arg2];
    }
}
