import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class423 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "J")
    private long field6074 = -1L;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    private int field6090 = 0;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "J")
    private long field6085 = -1L;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Ljc;")
    private class253 field6075;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "J")
    private long field6092;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
    private long field6079;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "J")
    private long field6089;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[B")
    private byte[] field6071;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[B")
    private byte[] field6069;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
    public static boolean field6070 = true;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[Lhi;")
    public static class114[] field6076 = new class114[50];

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6091 = "Loading title screen - ";

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    private int field6077;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "J")
    private long field6083;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B[BII)V", line = 6)
    public final void method2665(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6072++;
        try {
            if (this.field6079 < ((long) arg3 + this.field6089)) {
                this.field6079 = (long) arg3 + this.field6089;
            }
            if (this.field6085 != -1L && (this.field6085 > this.field6089 || (long) this.field6090 + this.field6085 < this.field6089)) {
                this.method2673(-1);
            }
            int var5 = -66 / ((arg0 - 38) / 45);
            if (this.field6085 != -1L && ((long) arg3 + this.field6089) > ((long) this.field6069.length + this.field6085)) {
                int var6 = (int) (-this.field6089 - (-this.field6085 - (long) this.field6069.length));
                class150.method1025(arg1, arg2, this.field6069, (int) (this.field6089 - this.field6085), var6);
                arg2 += var6;
                this.field6089 += (long) var6;
                arg3 -= var6;
                this.field6090 = this.field6069.length;
                this.method2673(-1);
            }
            if (this.field6069.length < arg3) {
                if (this.field6089 != this.field6083) {
                    this.field6075.method1563(0, this.field6089);
                    this.field6083 = this.field6089;
                }
                this.field6075.method1560(arg2, arg3, arg1, (byte) 64);
                this.field6083 += (long) arg3;
                if (this.field6092 < this.field6083) {
                    this.field6092 = this.field6083;
                }
                long var7 = -1L;
                if (this.field6089 >= this.field6074 && ((long) this.field6077 + this.field6074) > this.field6089) {
                    var7 = this.field6089;
                } else if (this.field6074 >= this.field6089 && ((long) arg3 + this.field6089) > this.field6074) {
                    var7 = this.field6074;
                }
                long var9 = -1L;
                if ((long) arg3 + this.field6089 > this.field6074 && (long) this.field6077 + this.field6074 >= (long) arg3 + this.field6089) {
                    var9 = this.field6089 + ((long) arg3);
                } else if (this.field6089 < (this.field6074 + ((long) this.field6077)) && ((long) arg3 + this.field6089) >= ((long) this.field6077 + this.field6074)) {
                    var9 = this.field6074 + ((long) this.field6077);
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class150.method1025(arg1, (int) (var7 + (long) arg2 - this.field6089), this.field6071, (int) (var7 - this.field6074), var11);
                }
                this.field6089 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field6085 == -1L) {
                    this.field6085 = this.field6089;
                }
                class150.method1025(arg1, arg2, this.field6069, (int) (this.field6089 - this.field6085), arg3);
                this.field6089 += (long) arg3;
                if ((long) this.field6090 < this.field6089 - this.field6085) {
                    this.field6090 = (int) (this.field6089 - this.field6085);
                }
            }
        } catch (IOException var13) {
            this.field6083 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V", line = 134)
    public final void method2666(long arg0, int arg1) throws IOException {
        field6093++;
        if (arg0 < (long) arg1) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2669((byte) 61));
        }
        this.field6089 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BIII)V", line = 153)
    public final void method2667(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6086++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg0.length);
            }
            if (this.field6085 != -1L && this.field6089 >= this.field6085 && (long) arg2 + this.field6089 <= (long) this.field6090 + this.field6085) {
                class150.method1025(this.field6069, (int) (this.field6089 - this.field6085), arg0, arg3, arg2);
                this.field6089 += (long) arg2;
                return;
            }
            long var5 = this.field6089;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field6089 >= this.field6074 && this.field6089 < ((long) this.field6077 + this.field6074)) {
                int var9 = (int) (this.field6074 + (long) this.field6077 - this.field6089);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class150.method1025(this.field6071, (int) (this.field6089 - this.field6074), arg0, arg3, var9);
                arg2 -= var9;
                arg3 += var9;
                this.field6089 += (long) var9;
            }
            if (arg2 > this.field6071.length) {
                this.field6075.method1563(0, this.field6089);
                this.field6083 = this.field6089;
                while (arg2 > 0) {
                    int var11 = this.field6075.method1561(arg0, arg3, 120, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field6083 += (long) var11;
                    this.field6089 += (long) var11;
                    arg2 -= var11;
                    arg3 += var11;
                }
            } else if (arg2 > 0) {
                this.method2672((byte) 16);
                int var10 = arg2;
                if (arg2 > this.field6077) {
                    var10 = this.field6077;
                }
                class150.method1025(this.field6071, 0, arg0, arg3, var10);
                this.field6089 += (long) var10;
                arg2 -= var10;
                arg3 += var10;
            }
            if ((long) arg1 != this.field6085) {
                if (this.field6085 > this.field6089 && arg2 > 0) {
                    int var12 = (int) (this.field6085 - this.field6089) + arg3;
                    if (var12 > arg3 + arg2) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2--;
                        arg0[arg3++] = 0;
                        this.field6089++;
                    }
                }
                long var13 = -1L;
                if (this.field6085 >= var5 && this.field6085 < ((long) var8 + var5)) {
                    var13 = this.field6085;
                } else if (this.field6085 <= var5 && var5 < ((long) this.field6090 + this.field6085)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field6085 + ((long) this.field6090) > var5 && ((long) this.field6090 + this.field6085) <= ((long) var8 + var5)) {
                    var15 = (long) this.field6090 + this.field6085;
                } else if (this.field6085 < (var5 + ((long) var8)) && (long) this.field6090 + this.field6085 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class150.method1025(this.field6069, (int) (var13 - this.field6085), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field6089 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field6089));
                        this.field6089 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6083 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)J", line = 337)
    public final long method2668(int arg0) {
        if (arg0 == -6452) {
            field6078++;
            return this.field6079;
        } else {
            return -31L;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Ljava/io/File;", line = 354)
    private final File method2669(byte arg0) {
        field6080++;
        if (arg0 < 26) {
            method2671(-72, true, 27);
        }
        return this.field6075.method1558(false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BI)V", line = 366)
    public final void method2670(byte[] arg0, int arg1) throws IOException {
        field6084++;
        this.method2667(arg0, -1, arg0.length, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZI)B", line = 374)
    public static final byte method2671(int arg0, boolean arg1, int arg2) {
        field6082++;
        if (!arg1) {
            field6091 = null;
        }
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljc;II)V", line = 564)
    public class423(class253 arg0, int arg1, int arg2) throws IOException {
        this.field6075 = arg0;
        this.field6079 = this.field6092 = arg0.method1559(-6067);
        this.field6089 = 0L;
        this.field6071 = new byte[arg1];
        this.field6069 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V", line = 412)
    private final void method2672(byte arg0) throws IOException {
        this.field6077 = 0;
        field6088++;
        if (this.field6089 != this.field6083) {
            this.field6075.method1563(0, this.field6089);
            this.field6083 = this.field6089;
        }
        this.field6074 = this.field6089;
        while (this.field6071.length > this.field6077) {
            int var2 = this.field6071.length - this.field6077;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6075.method1561(this.field6071, this.field6077, 39, var2);
            if (var3 == -1) {
                break;
            }
            this.field6083 += (long) var3;
            this.field6077 += var3;
        }
        int var4 = 96 % ((arg0 + 53) / 46);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 456)
    private final void method2673(int arg0) throws IOException {
        field6081++;
        if ((long) arg0 == this.field6085) {
            return;
        }
        if (this.field6085 != this.field6083) {
            this.field6075.method1563(~arg0, this.field6085);
            this.field6083 = this.field6085;
        }
        this.field6075.method1560(0, this.field6090, this.field6069, (byte) 72);
        this.field6083 += (long) this.field6090;
        if (this.field6083 > this.field6092) {
            this.field6092 = this.field6083;
        }
        long var2 = -1L;
        if (this.field6074 <= this.field6085 && this.field6085 < (long) this.field6077 + this.field6074) {
            var2 = this.field6085;
        } else if (this.field6074 >= this.field6085 && this.field6074 < ((long) this.field6090 + this.field6085)) {
            var2 = this.field6074;
        }
        long var4 = -1L;
        if (this.field6074 < ((long) this.field6090 + this.field6085) && (long) this.field6077 + this.field6074 >= (long) this.field6090 + this.field6085) {
            var4 = (long) this.field6090 + this.field6085;
        } else if (this.field6085 < ((long) this.field6077 + this.field6074) && this.field6074 + ((long) this.field6077) <= (long) this.field6090 + this.field6085) {
            var4 = (long) this.field6077 + this.field6074;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class150.method1025(this.field6069, (int) (var2 - this.field6085), this.field6071, (int) (var2 - this.field6074), var6);
        }
        this.field6090 = 0;
        this.field6085 = -1L;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V", line = 531)
    public static void method2674(byte arg0) {
        field6091 = null;
        if (arg0 != -48) {
            field6070 = true;
        }
        field6076 = null;
    }
}
