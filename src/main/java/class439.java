import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class439 {

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "J")
    private long field5946 = -1L;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    private int field5956 = 0;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "J")
    private long field5958 = -1L;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Lfi;")
    private class583 field5943;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "J")
    private long field5945;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "J")
    private long field5957;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "J")
    private long field5954;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "[B")
    private byte[] field5948;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "[B")
    private byte[] field5955;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    private int field5961;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "J")
    private long field5959;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "[Lgs;")
    public static class49[] field5949;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 3)
    public final void method2549(byte arg0) throws IOException {
        field5944++;
        this.method2550(true);
        if (arg0 == 76) {
            this.field5943.method3349(-4013);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V", line = 15)
    private final void method2550(boolean arg0) throws IOException {
        if (this.field5946 != -1L) {
            if (this.field5959 != this.field5946) {
                this.field5943.method3350(false, this.field5946);
                this.field5959 = this.field5946;
            }
            this.field5943.method3348(0, this.field5955, this.field5956, 1);
            this.field5959 += this.field5956;
            if (this.field5945 < this.field5959) {
                this.field5945 = this.field5959;
            }
            long var2 = -1L;
            if (this.field5958 <= this.field5946 && this.field5946 < this.field5958 + ((long) this.field5961)) {
                var2 = this.field5946;
            } else if (this.field5946 <= this.field5958 && this.field5958 < ((long) this.field5956 + this.field5946)) {
                var2 = this.field5958;
            }
            long var4 = -1L;
            if (this.field5958 < (long) this.field5956 + this.field5946 && (this.field5946 + ((long) this.field5956)) <= ((long) this.field5961 + this.field5958)) {
                var4 = this.field5946 + ((long) this.field5956);
            } else if (((long) this.field5961 + this.field5958) > this.field5946 && (long) this.field5961 + this.field5958 <= (long) this.field5956 + this.field5946) {
                var4 = (long) this.field5961 + this.field5958;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class275.method1771(this.field5955, (int) (var2 - this.field5946), this.field5948, (int) (var2 - this.field5958), var6);
            }
            this.field5946 = -1L;
            this.field5956 = 0;
        }
        field5963++;
        if (!arg0) {
            this.field5948 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([BZ)V", line = 89)
    public final void method2551(byte[] arg0, boolean arg1) throws IOException {
        if (!arg1) {
            this.method2556(67);
        }
        this.method2554(0, arg0, arg0.length, 0);
        field5960++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[BI)V", line = 103)
    public final void method2552(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5962++;
        try {
            if (this.field5957 < ((long) arg1 + this.field5954)) {
                this.field5957 = (long) arg1 + this.field5954;
            }
            if ((long) arg3 != this.field5946 && (this.field5954 < this.field5946 || (this.field5946 + ((long) this.field5956)) < this.field5954)) {
                this.method2550(true);
            }
            if (this.field5946 != -1L && (long) this.field5955.length + this.field5946 < (long) arg1 + this.field5954) {
                int var5 = (int) ((long) this.field5955.length - (this.field5954 - this.field5946));
                class275.method1771(arg2, arg0, this.field5955, (int) (this.field5954 - this.field5946), var5);
                this.field5954 += var5;
                arg1 -= var5;
                arg0 += var5;
                this.field5956 = this.field5955.length;
                this.method2550(true);
            }
            if (arg1 > this.field5955.length) {
                if (this.field5959 != this.field5954) {
                    this.field5943.method3350(false, this.field5954);
                    this.field5959 = this.field5954;
                }
                this.field5943.method3348(arg0, arg2, arg1, 1);
                this.field5959 += arg1;
                if (this.field5959 > this.field5945) {
                    this.field5945 = this.field5959;
                }
                long var6 = -1L;
                if (this.field5954 >= this.field5958 && this.field5958 + ((long) this.field5961) > this.field5954) {
                    var6 = this.field5954;
                } else if (this.field5954 <= this.field5958 && this.field5958 < (long) arg1 + this.field5954) {
                    var6 = this.field5958;
                }
                long var8 = -1L;
                if ((long) arg1 + this.field5954 > this.field5958 && (long) this.field5961 + this.field5958 >= (long) arg1 + this.field5954) {
                    var8 = this.field5954 + ((long) arg1);
                } else if (this.field5954 < (long) this.field5961 + this.field5958 && ((long) this.field5961 + this.field5958) <= ((long) arg1 + this.field5954)) {
                    var8 = (long) this.field5961 + this.field5958;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class275.method1771(arg2, (int) (var6 + (long) arg0 - this.field5954), this.field5948, (int) (var6 - this.field5958), var10);
                }
                this.field5954 += arg1;
            } else if (arg1 > 0) {
                if (this.field5946 == -1L) {
                    this.field5946 = this.field5954;
                }
                class275.method1771(arg2, arg0, this.field5955, (int) (this.field5954 - this.field5946), arg1);
                this.field5954 += arg1;
                if ((this.field5954 - this.field5946) > ((long) this.field5956)) {
                    this.field5956 = (int) (this.field5954 - this.field5946);
                }
            }
        } catch (IOException var12) {
            this.field5959 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IJ)V", line = 231)
    public final void method2553(int arg0, long arg1) throws IOException {
        field5964++;
        if (arg0 != -1) {
            this.field5946 = -87L;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2560(true));
        }
        this.field5954 = arg1;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I[BII)V", line = 247)
    public final void method2554(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5951++;
        try {
            if (arg1.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field5946 != -1L && this.field5946 <= this.field5954 && ((long) this.field5956 + this.field5946) >= (this.field5954 + ((long) arg2))) {
                class275.method1771(this.field5955, (int) (this.field5954 - this.field5946), arg1, arg0, arg2);
                this.field5954 += arg2;
                return;
            }
            long var5 = this.field5954;
            int var7 = arg0;
            int var8 = arg2;
            if (arg3 != 0) {
                this.field5955 = null;
            }
            if (this.field5958 <= this.field5954 && ((long) this.field5961 + this.field5958) > this.field5954) {
                int var9 = (int) ((long) this.field5961 + this.field5958 - this.field5954);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class275.method1771(this.field5948, (int) (this.field5954 - this.field5958), arg1, arg0, var9);
                arg2 -= var9;
                this.field5954 += var9;
                arg0 += var9;
            }
            if (this.field5948.length < arg2) {
                this.field5943.method3350(false, this.field5954);
                this.field5959 = this.field5954;
                while (arg2 > 0) {
                    int var11 = this.field5943.method3351((byte) -123, arg1, arg2, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    this.field5959 += var11;
                    arg0 += var11;
                    this.field5954 += var11;
                    arg2 -= var11;
                }
            } else if (arg2 > 0) {
                this.method2559(~arg3);
                int var10 = arg2;
                if (this.field5961 < arg2) {
                    var10 = this.field5961;
                }
                class275.method1771(this.field5948, 0, arg1, arg0, var10);
                arg0 += var10;
                arg2 -= var10;
                this.field5954 += var10;
            }
            if (this.field5946 != -1L) {
                if (this.field5946 > this.field5954 && arg2 > 0) {
                    int var12 = (int) (this.field5946 - this.field5954) + arg0;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        arg2--;
                        this.field5954++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field5946 >= var5 && this.field5946 < var5 + ((long) var8)) {
                    var13 = this.field5946;
                } else if (var5 >= this.field5946 && (long) this.field5956 + this.field5946 > var5) {
                    var13 = var5;
                }
                if (var5 < (long) this.field5956 + this.field5946 && ((long) var8 + var5) >= ((long) this.field5956 + this.field5946)) {
                    var15 = this.field5946 + ((long) this.field5956);
                } else if (((long) var8 + var5) > this.field5946 && (long) var8 + var5 <= (long) this.field5956 + this.field5946) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class275.method1771(this.field5955, (int) (var13 - this.field5946), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field5954) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field5954));
                        this.field5954 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5959 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V", line = 438)
    public static void method2555(byte arg0) {
        field5949 = null;
        if (arg0 > -56) {
            field5965 = -72;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)J", line = 449)
    public final long method2556(int arg0) {
        field5952++;
        return arg0 >= -17 ? 33L : this.field5957;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(JJ)J", line = 466)
    public static long method2557(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Z", line = 476)
    public static final boolean method2558(int arg0, int arg1, int arg2) {
        field5947++;
        if (arg1 != -1) {
            method2555((byte) 82);
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lfi;II)V", line = 564)
    public class439(class583 arg0, int arg1, int arg2) throws IOException {
        this.field5943 = arg0;
        this.field5957 = this.field5945 = arg0.method3347(0);
        this.field5954 = 0L;
        this.field5948 = new byte[arg1];
        this.field5955 = new byte[arg2];
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V", line = 491)
    private final void method2559(int arg0) throws IOException {
        field5953++;
        if (arg0 != -1) {
            this.field5961 = 96;
        }
        this.field5961 = 0;
        if (this.field5959 != this.field5954) {
            this.field5943.method3350(false, this.field5954);
            this.field5959 = this.field5954;
        }
        this.field5958 = this.field5954;
        while (this.field5948.length > this.field5961) {
            int var2 = this.field5948.length - this.field5961;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5943.method3351((byte) -122, this.field5948, var2, this.field5961);
            if (var3 == -1) {
                break;
            }
            this.field5959 += var3;
            this.field5961 += var3;
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)Ljava/io/File;", line = 549)
    private final File method2560(boolean arg0) {
        if (!arg0) {
            this.method2560(false);
        }
        field5950++;
        return this.field5943.method3346(0);
    }
}
