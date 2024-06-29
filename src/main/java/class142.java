import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class142 {

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "J")
    private long field2653 = -1L;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "J")
    private long field2650 = -1L;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    private int field2667 = 0;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lib;")
    private class150 field2661;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "J")
    private long field2645;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "J")
    private long field2673;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[B")
    private byte[] field2648;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[B")
    private byte[] field2649;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "J")
    private long field2674;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lhj;")
    public static class69 field2647 = class181.method1318("Gegenstand f-Ur Mitglieder", (byte) -110);

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
    public static int[] field2664 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lhj;")
    private static class69 field2656 = class181.method1318("glow3:", (byte) -120);

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Lhj;")
    public static class69 field2668 = class181.method1318("huffman", (byte) -113);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lhj;")
    public static class69 field2654 = field2656;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lhj;")
    public static class69 field2657 = field2656;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    private int field2658;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "J")
    private long field2665;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[Lej;")
    public static class48[] field2651;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
    public static final void method1084(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class21.field296 < 100) {
            class17.method104(11);
        }
        class15.method89(arg1, arg3, arg1 + arg4, arg2 + arg3);
        field2663++;
        if (class21.field296 < 100) {
            byte var5 = 20;
            int var6 = arg2 / 2 + arg3 - var5 - 18;
            int var7 = arg4 / 2 + arg1;
            class15.method77(arg1, arg3, arg4, arg2, 0);
            class15.method82(var7 - 152, var6, 304, 34, 9179409);
            class15.method82(var7 - 151, var6 - -1, 302, 32, 0);
            class15.method77(var7 - 150, var6 + 2, class21.field296 * 3, 30, 9179409);
            class15.method77(class21.field296 * 3 + var7 - 150, var6 + 2, 300 - class21.field296 * 3, 30, 0);
            class26.field378.method1598(class27.field389, var7, var6 + var5, 16777215, -1);
            return;
        }
        int var8 = class135.field2528 - ((int) ((float) arg4 / class93.field1741));
        class239.field4391 = (int) ((float) (arg2 * 2) / class93.field1741);
        class76.field1484 = class102.field1905 - ((int) ((float) arg2 / class93.field1741));
        class149.field2775 = (int) ((float) (arg4 * 2) / class93.field1741);
        int var9 = class102.field1905 - (int) ((float) arg2 / class93.field1741);
        int var10 = class135.field2528 + ((int) ((float) arg4 / class93.field1741));
        class141.field2644 = class135.field2528 - ((int) ((float) arg4 / class93.field1741));
        if (arg0 < 108) {
            field2654 = null;
        }
        int var11 = (int) ((float) arg2 / class93.field1741) + class102.field1905;
        class94.method686((byte) 86, var8, arg1, var11, arg3 + arg2, var9, arg3, var10, arg1 + arg4);
        class90.method642(var8, arg3, var11, var9, arg1 + arg4, (byte) -120, var10, arg1, arg2 + arg3);
        class80.method571(67, arg3, var8, var11, var9, var10, arg1, arg1 + arg4, arg2 + arg3);
        if (class118.field2243 > 0) {
            class118.field2243--;
        }
        if (!class90.field1702) {
            return;
        }
        int var12 = arg2 + arg3 - 8;
        int var13 = arg4 + arg1 - 5;
        class155.field2897.method1613(class9.method42(-80, new class69[] { class131.field2437, class98.method727(-229, class211.field3839) }), var13, var12, 16776960, -1);
        int var17 = var12 - 15;
        int var14 = 16776960;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class155.field2897.method1613(class9.method42(-117, new class69[] { class259.field4644, class98.method727(-229, var16), class146.field2697 }), var13, var17, var14, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public final void method1085(byte arg0) throws IOException {
        field2652++;
        this.method1088(-29729);
        int var2 = 94 % ((arg0 - 2) / 43);
        this.field2661.method1129(1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILnc;II)Lqb;")
    public static final class56 method1086(int arg0, class83 arg1, int arg2, int arg3) {
        field2669++;
        return class244.method1735(arg1, arg0 ^ arg0, arg3, arg2) ? class164.method1219(arg0 ^ 0xFFFFFF88) : null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)J")
    public final long method1087(byte arg0) {
        field2662++;
        int var2 = 76 / ((-arg0 - 76) / 37);
        return this.field2673;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    private final void method1088(int arg0) throws IOException {
        if (arg0 != -29729) {
            this.field2658 = -45;
        }
        field2659++;
        if (this.field2653 == -1L) {
            return;
        }
        if (this.field2665 != this.field2653) {
            this.field2661.method1127(this.field2653, 13455);
            this.field2665 = this.field2653;
        }
        this.field2661.method1124(0, 113, this.field2649, this.field2667);
        long var2 = -1L;
        long var4 = -1L;
        if (this.field2650 < (long) this.field2667 + this.field2653 && (long) this.field2658 + this.field2650 >= (long) this.field2667 + this.field2653) {
            var2 = (long) this.field2667 + this.field2653;
        } else if ((long) this.field2658 + this.field2650 > this.field2653 && (long) this.field2667 + this.field2653 >= (long) this.field2658 + this.field2650) {
            var2 = (long) this.field2658 + this.field2650;
        }
        if (this.field2653 >= this.field2650 && this.field2653 < ((long) this.field2658 + this.field2650)) {
            var4 = this.field2653;
        } else if (this.field2653 <= this.field2650 && this.field2650 < ((long) this.field2667 + this.field2653)) {
            var4 = this.field2650;
        }
        this.field2665 += (long) this.field2667;
        if (this.field2645 < this.field2665) {
            this.field2645 = this.field2665;
        }
        if (var4 > -1L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class1.method4(this.field2649, (int) (var4 - this.field2653), this.field2648, (int) (var4 - this.field2650), var6);
        }
        this.field2653 = -1L;
        this.field2667 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1089(int arg0) {
        int var2 = -7 / ((-arg0 - 46) / 62);
        field2670++;
        return this.field2661.method1125((byte) -32);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZJ)V")
    public final void method1090(boolean arg0, long arg1) throws IOException {
        field2671++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1089(-124));
        }
        this.field2674 = arg1;
        if (!arg0) {
            field2657 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([BZ)V")
    public final void method1091(byte[] arg0, boolean arg1) throws IOException {
        field2672++;
        this.method1092(arg0, 0, 122, arg0.length);
        if (!arg1) {
            method1086(-88, (class83) null, -75, 71);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([BIII)V")
    public final void method1092(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2646++;
        try {
            if (arg0.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field2653 != -1L && this.field2674 >= this.field2653 && this.field2674 + ((long) arg3) <= (long) this.field2667 + this.field2653) {
                class1.method4(this.field2649, (int) (this.field2674 - this.field2653), arg0, arg1, arg3);
                this.field2674 += (long) arg3;
                return;
            }
            long var5 = this.field2674;
            int var7 = arg1;
            if (arg2 <= 79) {
                return;
            }
            int var8 = arg3;
            if (this.field2650 <= this.field2674 && (long) this.field2658 + this.field2650 > this.field2674) {
                int var9 = (int) (this.field2650 + (long) this.field2658 - this.field2674);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class1.method4(this.field2648, (int) (this.field2674 - this.field2650), arg0, arg1, var9);
                this.field2674 += (long) var9;
                arg1 += var9;
                arg3 -= var9;
            }
            if (this.field2648.length < arg3) {
                this.field2661.method1127(this.field2674, 13455);
                this.field2665 = this.field2674;
                while (arg3 > 0) {
                    int var11 = this.field2661.method1128(arg1, arg0, -1, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2674 += (long) var11;
                    arg1 += var11;
                    arg3 -= var11;
                    this.field2665 += (long) var11;
                }
            } else if (arg3 > 0) {
                this.method1096(124);
                int var10 = arg3;
                if (arg3 > this.field2658) {
                    var10 = this.field2658;
                }
                class1.method4(this.field2648, 0, arg0, arg1, var10);
                this.field2674 += (long) var10;
                arg1 += var10;
                arg3 -= var10;
            }
            if (this.field2653 != -1L) {
                if (this.field2653 > this.field2674 && arg3 > 0) {
                    int var12 = (int) (this.field2653 - this.field2674) + arg1;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg0[arg1++] = 0;
                        this.field2674++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < ((long) this.field2667 + this.field2653) && this.field2653 + ((long) this.field2667) <= (long) var8 + var5) {
                    var15 = (long) this.field2667 + this.field2653;
                } else if (this.field2653 < (long) var8 + var5 && ((long) var8 + var5) <= ((long) this.field2667 + this.field2653)) {
                    var15 = (long) var8 + var5;
                }
                if (var5 <= this.field2653 && this.field2653 < ((long) var8 + var5)) {
                    var13 = this.field2653;
                } else if (var5 >= this.field2653 && (long) this.field2667 + this.field2653 > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class1.method4(this.field2649, (int) (var13 - this.field2653), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (this.field2674 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2674));
                        this.field2674 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2665 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILd;)V")
    public static final void method1093(int arg0, class225 arg1) {
        arg1.method1598(class44.field635, class66.field1278 / 2, class20.field287 / 2 - 26, 16777215, -1);
        field2655++;
        int var2 = class20.field287 / 2 - 18;
        class15.method82(class66.field1278 / 2 - 152, var2, 304, 34, arg0);
        class15.method82(class66.field1278 / 2 - 151, var2 - -1, 302, 32, 0);
        class15.method77(class66.field1278 / 2 - 150, var2 + 2, class207.field3773 * 3, 30, 9179409);
        class15.method77(class66.field1278 / 2 + (class207.field3773 * 3) - 150, var2 + 2, 300 - class207.field3773 * 3, 30, 0);
        arg1.method1598(class227.field4144, class66.field1278 / 2, class20.field287 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI[BI)V")
    public final void method1094(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2666++;
        try {
            if ((long) arg3 + this.field2674 > this.field2673) {
                this.field2673 = (long) arg3 + this.field2674;
            }
            int var5 = 5 % ((arg0 + 33) / 38);
            if (this.field2653 != -1L && (this.field2653 > this.field2674 || this.field2674 > this.field2653 + ((long) this.field2667))) {
                this.method1088(-29729);
            }
            if (this.field2653 != -1L && ((long) arg3 + this.field2674) > ((long) this.field2649.length + this.field2653)) {
                int var6 = (int) ((long) this.field2649.length + this.field2653 - this.field2674);
                arg3 -= var6;
                class1.method4(arg2, arg1, this.field2649, (int) (this.field2674 - this.field2653), var6);
                this.field2674 += (long) var6;
                this.field2667 = this.field2649.length;
                arg1 += var6;
                this.method1088(-29729);
            }
            if (this.field2649.length < arg3) {
                long var7 = -1L;
                long var9 = -1L;
                if (this.field2674 != this.field2665) {
                    this.field2661.method1127(this.field2674, 13455);
                    this.field2665 = this.field2674;
                }
                this.field2661.method1124(arg1, -17, arg2, arg3);
                this.field2665 += (long) arg3;
                if (((long) arg3 + this.field2674) > this.field2650 && (long) this.field2658 + this.field2650 >= this.field2674 - -((long) arg3)) {
                    var7 = (long) arg3 + this.field2674;
                } else if ((long) this.field2658 + this.field2650 > this.field2674 && (long) this.field2658 + this.field2650 <= this.field2674 - -((long) arg3)) {
                    var7 = (long) this.field2658 + this.field2650;
                }
                if (this.field2665 > this.field2645) {
                    this.field2645 = this.field2665;
                }
                if (this.field2674 >= this.field2650 && this.field2650 + ((long) this.field2658) > this.field2674) {
                    var9 = this.field2674;
                } else if (this.field2650 >= this.field2674 && ((long) arg3 + this.field2674) > this.field2650) {
                    var9 = this.field2650;
                }
                if (var9 > -1L && var7 > var9) {
                    int var11 = (int) (var7 - var9);
                    class1.method4(arg2, (int) (var9 + (long) arg1 - this.field2674), this.field2648, (int) (var9 - this.field2650), var11);
                }
                this.field2674 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field2653 == -1L) {
                    this.field2653 = this.field2674;
                }
                class1.method4(arg2, arg1, this.field2649, (int) (this.field2674 - this.field2653), arg3);
                this.field2674 += (long) arg3;
                if ((long) this.field2667 < this.field2674 - this.field2653) {
                    this.field2667 = (int) (this.field2674 - this.field2653);
                }
            }
        } catch (IOException var13) {
            this.field2665 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static void method1095(int arg0) {
        field2654 = null;
        field2647 = null;
        field2664 = null;
        field2656 = null;
        field2668 = null;
        field2657 = null;
        field2651 = null;
        if (arg0 != 9179409) {
            method1093(4, (class225) null);
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    private final void method1096(int arg0) throws IOException {
        this.field2658 = 0;
        if (this.field2674 != this.field2665) {
            this.field2661.method1127(this.field2674, 13455);
            this.field2665 = this.field2674;
        }
        this.field2650 = this.field2674;
        field2660++;
        while (this.field2648.length > this.field2658) {
            int var2 = this.field2648.length - this.field2658;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2661.method1128(this.field2658, this.field2648, -1, var2);
            if (var3 == -1) {
                break;
            }
            this.field2665 += (long) var3;
            this.field2658 += var3;
        }
        if (arg0 <= 9) {
            this.method1089(16);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lib;II)V")
    public class142(class150 arg0, int arg1, int arg2) throws IOException {
        this.field2661 = arg0;
        this.field2673 = this.field2645 = arg0.method1126(15);
        this.field2648 = new byte[arg1];
        this.field2649 = new byte[arg2];
        this.field2674 = 0L;
    }
}
