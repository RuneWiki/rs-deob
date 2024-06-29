import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class152 {

    @OriginalMember(owner = "client!o", name = "g", descriptor = "J")
    private long field2738 = -1L;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "J")
    private long field2757 = -1L;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    private int field2739 = 0;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lpg;")
    private class170 field2736;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "J")
    private long field2746;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "J")
    private long field2751;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "J")
    private long field2761;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[B")
    private byte[] field2737;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "[B")
    private byte[] field2760;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lqe;")
    private static class179 field2741 = class206.method1380("The server is being updated)3", (byte) -127);

    @OriginalMember(owner = "client!o", name = "l", descriptor = "[Lqe;")
    public static class179[] field2743 = new class179[200];

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lqe;")
    private static class179 field2744 = class206.method1380("Ok", (byte) -128);

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lqe;")
    public static class179 field2747 = field2744;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Lqe;")
    public static class179 field2756 = field2741;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Lqe;")
    private static class179 field2762 = class206.method1380("This computers address has been blocked", (byte) -128);

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lqe;")
    public static class179 field2754 = field2762;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "[I")
    public static int[] field2758 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    private int field2748;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "J")
    private long field2755;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Leh;")
    public static class52 field2763;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public final void method967(boolean arg0) throws IOException {
        if (!arg0) {
            this.method974((byte) 27);
            field2733++;
            this.field2736.method1079((byte) -54);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public static final void method968() {
        for (int var0 = 0; var0 < class73.field1434; var0++) {
            class167 var1 = class177.field3217[var0];
            class234.method1522(var1);
            class177.field3217[var0] = null;
        }
        class73.field1434 = 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)J")
    public final long method969(byte arg0) {
        if (arg0 <= 44) {
            return -113L;
        } else {
            field2752++;
            return this.field2751;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2732++;
        if (arg7 != -64830388) {
            return;
        }
        if (arg5 == arg6 && arg3 == arg8 && arg0 == arg4 && arg2 == arg9) {
            class50.method333(arg5, 118, arg4, arg3, arg1, arg2);
            return;
        }
        int var10 = arg5;
        int var11 = arg5 * 3;
        int var12 = arg3;
        int var13 = arg3 * 3;
        int var14 = arg0 * 3;
        int var15 = arg9 * 3;
        int var16 = arg6 * 3;
        int var17 = arg8 * 3;
        int var18 = var16 + arg4 - arg5 - var14;
        int var19 = arg2 + var17 - arg3 - var15;
        int var20 = var14 + var11 - var16 - var16;
        int var21 = var15 + var13 - var17 - var17;
        int var22 = var16 - var11;
        int var23 = var17 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg5;
            int var34 = (var28 + var30 + var32 >> 12) + arg3;
            class50.method333(var10, 125, var33, var12, arg1, var34);
            var12 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method971(int arg0) {
        field2742++;
        return arg0 >= -28 ? null : this.field2736.method1080(true);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BB)V")
    public final void method972(byte[] arg0, byte arg1) throws IOException {
        this.method973(arg0.length, 0, (byte) 97, arg0);
        field2734++;
        int var3 = -91 % ((-arg1 - 89) / 37);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB[B)V")
    public final void method973(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field2740++;
        try {
            if (arg3.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg3.length);
            }
            if (arg2 != 97) {
                field2754 = null;
            }
            if (this.field2757 != -1L && this.field2757 <= this.field2761 && (long) arg0 + this.field2761 <= (long) this.field2739 + this.field2757) {
                class154.method989(this.field2737, (int) (this.field2761 - this.field2757), arg3, arg1, arg0);
                this.field2761 += arg0;
                return;
            }
            long var5 = this.field2761;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field2738 <= this.field2761 && this.field2761 < (long) this.field2748 + this.field2738) {
                int var9 = (int) ((long) this.field2748 + this.field2738 - this.field2761);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class154.method989(this.field2760, (int) (this.field2761 - this.field2738), arg3, arg1, var9);
                this.field2761 += var9;
                arg1 += var9;
            }
            if (this.field2760.length < arg0) {
                this.field2736.method1081(this.field2761, arg2 ^ 0x1F);
                this.field2755 = this.field2761;
                while (arg0 > 0) {
                    int var11 = this.field2736.method1078(arg0, arg1, 22705, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2755 += var11;
                    this.field2761 += var11;
                    arg1 += var11;
                    arg0 -= var11;
                }
            } else if (arg0 > 0) {
                this.method975((byte) 116);
                int var10 = arg0;
                if (arg0 > this.field2748) {
                    var10 = this.field2748;
                }
                class154.method989(this.field2760, 0, arg3, arg1, var10);
                arg1 += var10;
                arg0 -= var10;
                this.field2761 += var10;
            }
            if (this.field2757 != -1L) {
                if (this.field2761 < this.field2757 && arg0 > 0) {
                    int var12 = (int) (this.field2757 - this.field2761) + arg1;
                    if (var12 > arg0 + arg1) {
                        var12 = arg1 + arg0;
                    }
                    while (arg1 < var12) {
                        arg3[arg1++] = 0;
                        this.field2761++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field2757 >= var5 && this.field2757 < (long) var8 + var5) {
                    var13 = this.field2757;
                } else if (var5 >= this.field2757 && (long) this.field2739 + this.field2757 > var5) {
                    var13 = var5;
                }
                if (var5 < (long) this.field2739 + this.field2757 && (long) this.field2739 + this.field2757 <= var5 - -((long) var8)) {
                    var15 = (long) this.field2739 + this.field2757;
                } else if ((long) var8 + var5 > this.field2757 && (long) this.field2739 + this.field2757 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class154.method989(this.field2737, (int) (var13 - this.field2757), arg3, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field2761) {
                        arg0 = (int) ((long) arg0 + this.field2761 - var15);
                        this.field2761 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2755 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    private final void method974(byte arg0) throws IOException {
        if (arg0 <= 6) {
            return;
        }
        field2750++;
        if (this.field2757 == -1L) {
            return;
        }
        if (this.field2757 != this.field2755) {
            this.field2736.method1081(this.field2757, 101);
            this.field2755 = this.field2757;
        }
        long var2 = -1L;
        this.field2736.method1077(this.field2739, this.field2737, 0, (byte) -70);
        this.field2755 += this.field2739;
        if (this.field2738 <= this.field2757 && this.field2757 < this.field2738 + (long) this.field2748) {
            var2 = this.field2757;
        } else if (this.field2738 >= this.field2757 && (long) this.field2739 + this.field2757 > this.field2738) {
            var2 = this.field2738;
        }
        if (this.field2746 < this.field2755) {
            this.field2746 = this.field2755;
        }
        long var4 = -1L;
        if ((long) this.field2739 + this.field2757 > this.field2738 && this.field2738 + (long) this.field2748 >= this.field2757 - -((long) this.field2739)) {
            var4 = (long) this.field2739 + this.field2757;
        } else if (this.field2738 + (long) this.field2748 > this.field2757 && (long) this.field2748 + this.field2738 <= (long) this.field2739 + this.field2757) {
            var4 = (long) this.field2748 + this.field2738;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class154.method989(this.field2737, (int) (var2 - this.field2757), this.field2760, (int) (var2 - this.field2738), var6);
        }
        this.field2757 = -1L;
        this.field2739 = 0;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    private final void method975(byte arg0) throws IOException {
        this.field2748 = 0;
        if (this.field2761 != this.field2755) {
            this.field2736.method1081(this.field2761, 110);
            this.field2755 = this.field2761;
        }
        this.field2738 = this.field2761;
        while (this.field2748 < this.field2760.length) {
            int var2 = this.field2760.length - this.field2748;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2736.method1078(var2, this.field2748, 22705, this.field2760);
            if (var3 == -1) {
                break;
            }
            this.field2755 += var3;
            this.field2748 += var3;
        }
        field2745++;
        if (arg0 < 11) {
            field2763 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)Z")
    public static final boolean method976(boolean arg0, int arg1) {
        field2753++;
        if (class236.field4346[arg1]) {
            return true;
        } else if (class227.field4202.method357(95, arg1)) {
            if (!arg0) {
                field2756 = null;
            }
            int var2 = class227.field4202.method336((byte) -123, arg1);
            if (var2 == 0) {
                class236.field4346[arg1] = true;
                return true;
            }
            if (class199.field3710[arg1] == null) {
                class199.field3710[arg1] = new class6[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class199.field3710[arg1][var3] == null) {
                    byte[] var4 = class227.field4202.method342(var3, arg1, (byte) 99);
                    if (var4 != null) {
                        class199.field3710[arg1][var3] = new class6();
                        class199.field3710[arg1][var3].field173 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class199.field3710[arg1][var3].method42(new class185(var4), 123);
                        } else {
                            class199.field3710[arg1][var3].method45(new class185(var4), (byte) 57);
                        }
                    }
                }
            }
            class236.field4346[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z[BII)V")
    public final void method977(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2759++;
        if (arg0) {
            field2758 = null;
        }
        try {
            if (this.field2761 + (long) arg3 > this.field2751) {
                this.field2751 = (long) arg3 + this.field2761;
            }
            if (this.field2757 != -1L && (this.field2761 < this.field2757 || this.field2757 + (long) this.field2739 < this.field2761)) {
                this.method974((byte) 81);
            }
            if (this.field2757 != -1L && (long) this.field2737.length + this.field2757 < (long) arg3 + this.field2761) {
                int var5 = (int) (this.field2757 + (long) this.field2737.length - this.field2761);
                arg3 -= var5;
                class154.method989(arg1, arg2, this.field2737, (int) (this.field2761 - this.field2757), var5);
                arg2 += var5;
                this.field2761 += var5;
                this.field2739 = this.field2737.length;
                this.method974((byte) 119);
            }
            if (arg3 > this.field2737.length) {
                long var6 = -1L;
                if (this.field2761 != this.field2755) {
                    this.field2736.method1081(this.field2761, 88);
                    this.field2755 = this.field2761;
                }
                long var8 = -1L;
                this.field2736.method1077(arg3, arg1, arg2, (byte) -61);
                if ((long) arg3 + this.field2761 > this.field2738 && (long) arg3 + this.field2761 <= (long) this.field2748 + this.field2738) {
                    var8 = (long) arg3 + this.field2761;
                } else if (this.field2761 < (long) this.field2748 + this.field2738 && this.field2738 + (long) this.field2748 <= (long) arg3 + this.field2761) {
                    var8 = (long) this.field2748 + this.field2738;
                }
                this.field2755 += arg3;
                if (this.field2761 >= this.field2738 && (long) this.field2748 + this.field2738 > this.field2761) {
                    var6 = this.field2761;
                } else if (this.field2761 <= this.field2738 && this.field2761 + (long) arg3 > this.field2738) {
                    var6 = this.field2738;
                }
                if (this.field2755 > this.field2746) {
                    this.field2746 = this.field2755;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class154.method989(arg1, (int) ((long) arg2 + var6 - this.field2761), this.field2760, (int) (var6 - this.field2738), var10);
                }
                this.field2761 += arg3;
            } else if (arg3 > 0) {
                if (this.field2757 == -1L) {
                    this.field2757 = this.field2761;
                }
                class154.method989(arg1, arg2, this.field2737, (int) (this.field2761 - this.field2757), arg3);
                this.field2761 += arg3;
                if ((long) this.field2739 < this.field2761 - this.field2757) {
                    this.field2739 = (int) (this.field2761 - this.field2757);
                }
            }
        } catch (IOException var12) {
            this.field2755 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method978(int arg0) {
        field2747 = null;
        field2756 = null;
        field2741 = null;
        field2762 = null;
        field2763 = null;
        field2758 = null;
        field2754 = null;
        field2743 = null;
        if (arg0 != -1) {
            method978(11);
        }
        field2744 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lqf;")
    public static final class180 method979(byte arg0, int arg1) {
        field2749++;
        class180 var2 = (class180) class180.field3309.method1299((byte) -124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 15) {
            field2762 = null;
        }
        byte[] var3 = class8.field243.method342(class64.method419(-4, arg1), class195.method1310((byte) 107, arg1), (byte) 99);
        class180 var4 = new class180();
        var4.field3324 = arg1;
        if (var3 != null) {
            var4.method1176(112, new class185(var3));
        }
        var4.method1174((byte) -75);
        class180.field3309.method1303(var4, (long) arg1, (byte) 68);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)V")
    public final void method980(byte arg0, long arg1) throws IOException {
        field2735++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method971(arg0 - 165));
        }
        this.field2761 = arg1;
        if (arg0 != 90) {
            field2763 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lpg;II)V")
    public class152(class170 arg0, int arg1, int arg2) throws IOException {
        this.field2736 = arg0;
        this.field2751 = this.field2746 = arg0.method1082(84);
        this.field2761 = 0L;
        this.field2737 = new byte[arg2];
        this.field2760 = new byte[arg1];
    }
}
