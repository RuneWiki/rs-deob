import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class331 {

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    private int field5018 = 0;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "J")
    private long field5025 = -1L;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "J")
    private long field5030 = -1L;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Lhl;")
    private class371 field5021;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "J")
    private long field5029;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "J")
    private long field5022;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "J")
    private long field5020;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "[B")
    private byte[] field5027;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "[B")
    private byte[] field5017;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "[[S")
    public static short[][] field5016 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!so", name = "v", descriptor = "Ls;")
    public static class186 field5032 = new class186(54, 8);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    private int field5028;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "J")
    private long field5023;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II[BB)V", line = 4)
    public final void method2087(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field5012++;
        try {
            if (arg0 + arg1 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (arg3 >= -32) {
                return;
            }
            if (this.field5025 != -1L && this.field5025 <= this.field5020 && (this.field5025 + ((long) this.field5018)) >= ((long) arg1 + this.field5020)) {
                class394.method2448(this.field5027, (int) (this.field5020 - this.field5025), arg2, arg0, arg1);
                this.field5020 += arg1;
                return;
            }
            long var5 = this.field5020;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field5020 >= this.field5030 && this.field5020 < ((long) this.field5028 + this.field5030)) {
                int var9 = (int) ((long) this.field5028 + this.field5030 - this.field5020);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class394.method2448(this.field5017, (int) (this.field5020 - this.field5030), arg2, arg0, var9);
                arg0 += var9;
                this.field5020 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field5017.length) {
                this.field5021.method2277(this.field5020, (byte) 36);
                this.field5023 = this.field5020;
                while (arg1 > 0) {
                    int var10 = this.field5021.method2279(arg0, arg2, -1, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 -= var10;
                    arg0 += var10;
                    this.field5020 += var10;
                    this.field5023 += var10;
                }
            } else if (arg1 > 0) {
                this.method2096(true);
                int var11 = arg1;
                if (arg1 > this.field5028) {
                    var11 = this.field5028;
                }
                class394.method2448(this.field5017, 0, arg2, arg0, var11);
                arg1 -= var11;
                this.field5020 += var11;
                arg0 += var11;
            }
            if (this.field5025 != -1L) {
                if (this.field5025 > this.field5020 && arg1 > 0) {
                    int var12 = (int) (this.field5025 - this.field5020) + arg0;
                    if ((arg0 + arg1) < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (var12 > arg0) {
                        arg2[arg0++] = 0;
                        arg1--;
                        this.field5020++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field5025 >= var5 && this.field5025 < var5 + ((long) var8)) {
                    var13 = this.field5025;
                } else if (var5 >= this.field5025 && (long) this.field5018 + this.field5025 > var5) {
                    var13 = var5;
                }
                if ((long) this.field5018 + this.field5025 > var5 && (long) this.field5018 + this.field5025 <= (long) var8 + var5) {
                    var15 = (long) this.field5018 + this.field5025;
                } else if ((long) var8 + var5 > this.field5025 && (long) var8 + var5 <= (long) this.field5018 + this.field5025) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class394.method2448(this.field5027, (int) (var13 - this.field5025), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field5020 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field5020));
                        this.field5020 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5023 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([BIII)V", line = 192)
    public final void method2088(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5013++;
        try {
            if (this.field5022 < ((long) arg1 + this.field5020)) {
                this.field5022 = (long) arg1 + this.field5020;
            }
            if (arg2 != -25627) {
                this.method2090((byte) 70);
            }
            if (this.field5025 != -1L && (this.field5020 < this.field5025 || this.field5020 > ((long) this.field5018 + this.field5025))) {
                this.method2094((byte) -117);
            }
            if (this.field5025 != -1L && (long) this.field5027.length + this.field5025 < this.field5020 - -((long) arg1)) {
                int var5 = (int) (this.field5025 + (long) this.field5027.length - this.field5020);
                class394.method2448(arg0, arg3, this.field5027, (int) (this.field5020 - this.field5025), var5);
                this.field5020 += var5;
                arg1 -= var5;
                arg3 += var5;
                this.field5018 = this.field5027.length;
                this.method2094((byte) -117);
            }
            if (this.field5027.length < arg1) {
                if (this.field5023 != this.field5020) {
                    this.field5021.method2277(this.field5020, (byte) -127);
                    this.field5023 = this.field5020;
                }
                this.field5021.method2281(arg0, arg3, arg1, arg2 + 25627);
                this.field5023 += arg1;
                if (this.field5023 > this.field5029) {
                    this.field5029 = this.field5023;
                }
                long var6 = -1L;
                if (this.field5020 >= this.field5030 && this.field5020 < this.field5030 + ((long) this.field5028)) {
                    var6 = this.field5020;
                } else if (this.field5020 <= this.field5030 && this.field5030 < (long) arg1 + this.field5020) {
                    var6 = this.field5030;
                }
                long var8 = -1L;
                if (this.field5030 < (long) arg1 + this.field5020 && (long) arg1 + this.field5020 <= this.field5030 - -((long) this.field5028)) {
                    var8 = (long) arg1 + this.field5020;
                } else if (this.field5030 + ((long) this.field5028) > this.field5020 && (this.field5030 + ((long) this.field5028)) <= ((long) arg1 + this.field5020)) {
                    var8 = (long) this.field5028 + this.field5030;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class394.method2448(arg0, (int) ((long) arg3 + var6 - this.field5020), this.field5017, (int) (var6 - this.field5030), var10);
                }
                this.field5020 += arg1;
            } else if (arg1 > 0) {
                if (this.field5025 == -1L) {
                    this.field5025 = this.field5020;
                }
                class394.method2448(arg0, arg3, this.field5027, (int) (this.field5020 - this.field5025), arg1);
                this.field5020 += arg1;
                if ((this.field5020 - this.field5025) > ((long) this.field5018)) {
                    this.field5018 = (int) (this.field5020 - this.field5025);
                }
            }
        } catch (IOException var12) {
            this.field5023 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB[B)I", line = 314)
    public static final int method2089(int arg0, byte arg1, byte[] arg2) {
        if (arg1 == 52) {
            field5015++;
            return class1.method13(0, arg2, arg0, arg1 ^ 0xFFFFFFBF);
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Ljava/io/File;", line = 336)
    private final File method2090(byte arg0) {
        if (arg0 != -47) {
            method2092((byte) 67);
        }
        field5011++;
        return this.field5021.method2280((byte) 13);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)J", line = 347)
    public final long method2091(int arg0) {
        if (arg0 <= 115) {
            this.field5025 = 116L;
        }
        field5024++;
        return this.field5022;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V", line = 365)
    public static void method2092(byte arg0) {
        field5016 = null;
        if (arg0 > 55) {
            field5032 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IJ)V", line = 378)
    public final void method2093(int arg0, long arg1) throws IOException {
        field5014++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2090((byte) -47));
        }
        if (arg0 != -1006) {
            this.field5029 = -46L;
        }
        this.field5020 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lhl;II)V", line = 557)
    public class331(class371 arg0, int arg1, int arg2) throws IOException {
        this.field5021 = arg0;
        this.field5022 = this.field5029 = arg0.method2278(false);
        this.field5020 = 0L;
        this.field5027 = new byte[arg2];
        this.field5017 = new byte[arg1];
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(B)V", line = 398)
    private final void method2094(byte arg0) throws IOException {
        field5019++;
        if (arg0 != -117) {
            this.method2091(6);
        }
        if (this.field5025 == -1L) {
            return;
        }
        if (this.field5025 != this.field5023) {
            this.field5021.method2277(this.field5025, (byte) 101);
            this.field5023 = this.field5025;
        }
        this.field5021.method2281(this.field5027, 0, this.field5018, 0);
        this.field5023 += this.field5018;
        if (this.field5023 > this.field5029) {
            this.field5029 = this.field5023;
        }
        long var2 = -1L;
        if (this.field5030 <= this.field5025 && (long) this.field5028 + this.field5030 > this.field5025) {
            var2 = this.field5025;
        } else if (this.field5025 <= this.field5030 && (long) this.field5018 + this.field5025 > this.field5030) {
            var2 = this.field5030;
        }
        long var4 = -1L;
        if (((long) this.field5018 + this.field5025) > this.field5030 && ((long) this.field5028 + this.field5030) >= ((long) this.field5018 + this.field5025)) {
            var4 = this.field5025 + ((long) this.field5018);
        } else if ((this.field5030 + ((long) this.field5028)) > this.field5025 && (long) this.field5018 + this.field5025 >= (long) this.field5028 + this.field5030) {
            var4 = (long) this.field5028 + this.field5030;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class394.method2448(this.field5027, (int) (var2 - this.field5025), this.field5017, (int) (var2 - this.field5030), var6);
        }
        this.field5025 = -1L;
        this.field5018 = 0;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B[B)V", line = 482)
    public final void method2095(byte arg0, byte[] arg1) throws IOException {
        if (arg0 >= 82) {
            this.method2087(0, arg1.length, arg1, (byte) -35);
            field5026++;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V", line = 506)
    private final void method2096(boolean arg0) throws IOException {
        if (!arg0) {
            field5016 = null;
        }
        field5031++;
        this.field5028 = 0;
        if (this.field5023 != this.field5020) {
            this.field5021.method2277(this.field5020, (byte) -118);
            this.field5023 = this.field5020;
        }
        this.field5030 = this.field5020;
        while (this.field5017.length > this.field5028) {
            int var2 = this.field5017.length - this.field5028;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5021.method2279(this.field5028, this.field5017, -1, var2);
            if (var3 == -1) {
                break;
            }
            this.field5028 += var3;
            this.field5023 += var3;
        }
    }
}
