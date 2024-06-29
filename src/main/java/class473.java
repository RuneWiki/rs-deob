import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class473 {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "J")
    private long field6879 = -1L;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    private int field6885 = 0;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "J")
    private long field6884 = -1L;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Lkr;")
    private class536 field6893;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "J")
    private long field6890;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "J")
    private long field6874;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "[B")
    private byte[] field6889;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "J")
    private long field6886;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "[B")
    private byte[] field6892;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Lqv;")
    public static class316 field6894 = new class316(97, 8);

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field6895 = -1;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field6896 = -1;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    private int field6875;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "J")
    private long field6880;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)[Lvr;", line = 11)
    public static final class92[] method2801(boolean arg0) {
        if (arg0) {
            method2801(true);
        }
        field6878++;
        return new class92[] { class131.field2054, class425.field5999, class541.field7957, class42.field853, class406.field5769, class23.field326, class423.field5984, class393.field5583, class69.field1142, class465.field6764, class120.field1878, class340.field5029, class538.field7913, class445.field6347 };
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)J", line = 31)
    public final long method2802(byte arg0) {
        field6883++;
        int var2 = -30 / ((-arg0 - 44) / 51);
        return this.field6874;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 43)
    private final void method2803(int arg0) throws IOException {
        int var2 = 112 / ((-arg0 - 67) / 50);
        this.field6875 = 0;
        field6882++;
        if (this.field6886 != this.field6880) {
            this.field6893.method3162(true, this.field6886);
            this.field6880 = this.field6886;
        }
        this.field6884 = this.field6886;
        while (this.field6889.length > this.field6875) {
            int var3 = this.field6889.length - this.field6875;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field6893.method3161(this.field6889, var3, 120, this.field6875);
            if (var4 == -1) {
                break;
            }
            this.field6875 += var4;
            this.field6880 += var4;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 96)
    public static void method2804(int arg0) {
        if (arg0 != -1) {
            method2804(-123);
        }
        field6894 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI[B)V", line = 111)
    public final void method2805(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field6887++;
        try {
            if (((long) arg2 + this.field6886) > this.field6874) {
                this.field6874 = (long) arg2 + this.field6886;
            }
            if (this.field6879 != -1L && (this.field6886 < this.field6879 || ((long) this.field6885 + this.field6879) < this.field6886)) {
                this.method2810((byte) 79);
            }
            if (this.field6879 != -1L && ((long) arg2 + this.field6886) > ((long) this.field6892.length + this.field6879)) {
                int var5 = (int) ((long) this.field6892.length + this.field6879 - this.field6886);
                class282.method1818(arg3, arg0, this.field6892, (int) (this.field6886 - this.field6879), var5);
                arg2 -= var5;
                this.field6886 += var5;
                arg0 += var5;
                this.field6885 = this.field6892.length;
                this.method2810((byte) 79);
            }
            if (this.field6892.length < arg2) {
                if (this.field6886 != this.field6880) {
                    this.field6893.method3162(true, this.field6886);
                    this.field6880 = this.field6886;
                }
                this.field6893.method3163(arg3, arg2, arg0, 0);
                this.field6880 += arg2;
                if (this.field6880 > this.field6890) {
                    this.field6890 = this.field6880;
                }
                long var6 = -1L;
                if (this.field6886 >= this.field6884 && this.field6886 < ((long) this.field6875 + this.field6884)) {
                    var6 = this.field6886;
                } else if (this.field6886 <= this.field6884 && this.field6884 < this.field6886 + ((long) arg2)) {
                    var6 = this.field6884;
                }
                long var8 = -1L;
                if ((long) arg2 + this.field6886 > this.field6884 && (long) arg2 + this.field6886 <= (long) this.field6875 + this.field6884) {
                    var8 = (long) arg2 + this.field6886;
                } else if (((long) this.field6875 + this.field6884) > this.field6886 && (long) arg2 + this.field6886 >= this.field6884 - -((long) this.field6875)) {
                    var8 = (long) this.field6875 + this.field6884;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class282.method1818(arg3, (int) ((long) arg0 + var6 - this.field6886), this.field6889, (int) (var6 - this.field6884), var10);
                }
                this.field6886 += arg2;
            } else if (arg2 > 0) {
                if (this.field6879 == -1L) {
                    this.field6879 = this.field6886;
                }
                class282.method1818(arg3, arg0, this.field6892, (int) (this.field6886 - this.field6879), arg2);
                this.field6886 += arg2;
                if ((this.field6886 - this.field6879) > ((long) this.field6885)) {
                    this.field6885 = (int) (this.field6886 - this.field6879);
                }
            } else if (arg1 < 53) {
                this.field6885 = -64;
            }
        } catch (IOException var12) {
            this.field6880 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IJ)V", line = 234)
    public final void method2806(int arg0, long arg1) throws IOException {
        field6881++;
        if (arg0 != 17788) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2808(-1));
        }
        this.field6886 = arg1;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lkr;II)V", line = 557)
    public class473(class536 arg0, int arg1, int arg2) throws IOException {
        this.field6893 = arg0;
        this.field6874 = this.field6890 = arg0.method3160((byte) 74);
        this.field6889 = new byte[arg1];
        this.field6886 = 0L;
        this.field6892 = new byte[arg2];
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[BII)V", line = 255)
    public final void method2807(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6891++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field6879 != -1L && this.field6886 >= this.field6879 && ((long) this.field6885 + this.field6879) >= (this.field6886 + ((long) arg2))) {
                class282.method1818(this.field6892, (int) (this.field6886 - this.field6879), arg1, arg0, arg2);
                this.field6886 += arg2;
                return;
            }
            long var5 = this.field6886;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field6886 >= this.field6884 && (long) this.field6875 + this.field6884 > this.field6886) {
                int var9 = (int) (this.field6884 + (long) this.field6875 - this.field6886);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class282.method1818(this.field6889, (int) (this.field6886 - this.field6884), arg1, arg0, var9);
                this.field6886 += var9;
                arg0 += var9;
                arg2 -= var9;
            }
            if (this.field6889.length < arg2) {
                this.field6893.method3162(true, this.field6886);
                this.field6880 = this.field6886;
                while (arg2 > 0) {
                    int var10 = this.field6893.method3161(arg1, arg2, 118, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field6880 += var10;
                    this.field6886 += var10;
                    arg0 += var10;
                    arg2 -= var10;
                }
            } else if (arg2 > 0) {
                this.method2803(110);
                int var11 = arg2;
                if (this.field6875 < arg2) {
                    var11 = this.field6875;
                }
                class282.method1818(this.field6889, 0, arg1, arg0, var11);
                arg0 += var11;
                arg2 -= var11;
                this.field6886 += var11;
            }
            if (this.field6879 != -1L) {
                if (this.field6886 < this.field6879 && arg2 > 0) {
                    int var12 = (int) (this.field6879 - this.field6886) + arg0;
                    if ((arg0 + arg2) < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg2--;
                        arg1[arg0++] = 0;
                        this.field6886++;
                    }
                }
                long var13 = -1L;
                if (this.field6879 >= var5 && this.field6879 < (long) var8 + var5) {
                    var13 = this.field6879;
                } else if (var5 >= this.field6879 && var5 < ((long) this.field6885 + this.field6879)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field6885 + this.field6879 && (long) var8 + var5 >= this.field6879 - -((long) this.field6885)) {
                    var15 = this.field6879 + ((long) this.field6885);
                } else if ((long) var8 + var5 > this.field6879 && (this.field6879 + ((long) this.field6885)) >= (var5 + ((long) var8))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class282.method1818(this.field6892, (int) (var13 - this.field6879), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field6886) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field6886));
                        this.field6886 = var15;
                    }
                }
            }
            if (arg3 <= 95) {
                method2804(-78);
            }
        } catch (IOException var19) {
            this.field6880 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Ljava/io/File;", line = 441)
    private final File method2808(int arg0) {
        if (arg0 == -1) {
            field6876++;
            return this.field6893.method3164(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BB)V", line = 456)
    public final void method2809(byte[] arg0, byte arg1) throws IOException {
        this.method2807(0, arg0, arg0.length, 110);
        if (arg1 != 83) {
            this.field6874 = -44L;
        }
        field6888++;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 467)
    private final void method2810(byte arg0) throws IOException {
        if (arg0 != 79) {
            this.field6880 = -66L;
        }
        if (this.field6879 != -1L) {
            if (this.field6880 != this.field6879) {
                this.field6893.method3162(true, this.field6879);
                this.field6880 = this.field6879;
            }
            this.field6893.method3163(this.field6892, this.field6885, 0, arg0 ^ 0x4F);
            this.field6880 += this.field6885;
            if (this.field6880 > this.field6890) {
                this.field6890 = this.field6880;
            }
            long var2 = -1L;
            if (this.field6879 >= this.field6884 && this.field6879 < ((long) this.field6875 + this.field6884)) {
                var2 = this.field6879;
            } else if (this.field6884 >= this.field6879 && ((long) this.field6885 + this.field6879) > this.field6884) {
                var2 = this.field6884;
            }
            long var4 = -1L;
            if ((long) this.field6885 + this.field6879 > this.field6884 && (long) this.field6885 + this.field6879 <= (long) this.field6875 + this.field6884) {
                var4 = (long) this.field6885 + this.field6879;
            } else if ((long) this.field6875 + this.field6884 > this.field6879 && (long) this.field6875 + this.field6884 <= (long) this.field6885 + this.field6879) {
                var4 = (long) this.field6875 + this.field6884;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class282.method1818(this.field6892, (int) (var2 - this.field6879), this.field6889, (int) (var2 - this.field6884), var6);
            }
            this.field6885 = 0;
            this.field6879 = -1L;
        }
        field6877++;
    }
}
