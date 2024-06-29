import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class421 {

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "J")
    private long field5939 = -1L;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    private int field5945 = 0;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "J")
    private long field5938 = -1L;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Lsga;")
    private class68 field5937;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "J")
    private long field5946;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "J")
    private long field5947;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[B")
    private byte[] field5932;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "J")
    private long field5940;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "[B")
    private byte[] field5943;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field5926 = -1;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[I")
    public static int[] field5933 = new int[2];

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "F")
    public static float field5930;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    private int field5948;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "J")
    private long field5931;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB[BI)V")
    public final void method2578(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field5935++;
        try {
            if (this.field5947 < this.field5940 + ((long) arg0)) {
                this.field5947 = (long) arg0 + this.field5940;
            }
            if (this.field5938 != -1L && (this.field5940 < this.field5938 || this.field5940 > ((long) this.field5945 + this.field5938))) {
                this.method2585((byte) -125);
            }
            if (this.field5938 != -1L && (long) this.field5932.length + this.field5938 < (long) arg0 + this.field5940) {
                int var5 = (int) ((long) this.field5932.length + this.field5938 - this.field5940);
                class255.method1690(arg2, arg3, this.field5932, (int) (this.field5940 - this.field5938), var5);
                arg0 -= var5;
                this.field5940 += var5;
                arg3 += var5;
                this.field5945 = this.field5932.length;
                this.method2585((byte) -125);
            }
            if (arg0 > this.field5932.length) {
                if (this.field5940 != this.field5931) {
                    this.field5937.method560(-114, this.field5940);
                    this.field5931 = this.field5940;
                }
                this.field5937.method567(arg3, arg0, arg2, true);
                this.field5931 += arg0;
                if (this.field5946 < this.field5931) {
                    this.field5946 = this.field5931;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field5940 >= this.field5939 && this.field5939 + ((long) this.field5948) > this.field5940) {
                    var6 = this.field5940;
                } else if (this.field5940 <= this.field5939 && (long) arg0 + this.field5940 > this.field5939) {
                    var6 = this.field5939;
                }
                if (this.field5939 < ((long) arg0 + this.field5940) && ((long) this.field5948 + this.field5939) >= (this.field5940 + ((long) arg0))) {
                    var8 = (long) arg0 + this.field5940;
                } else if (this.field5940 < ((long) this.field5948 + this.field5939) && (long) this.field5948 + this.field5939 <= (long) arg0 + this.field5940) {
                    var8 = (long) this.field5948 + this.field5939;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class255.method1690(arg2, (int) ((long) arg3 + var6 - this.field5940), this.field5943, (int) (var6 - this.field5939), var10);
                }
                this.field5940 += arg0;
                return;
            }
            if (arg0 > 0) {
                if (this.field5938 == -1L) {
                    this.field5938 = this.field5940;
                }
                class255.method1690(arg2, arg3, this.field5932, (int) (this.field5940 - this.field5938), arg0);
                this.field5940 += arg0;
                if ((this.field5940 - this.field5938) > ((long) this.field5945)) {
                    this.field5945 = (int) (this.field5940 - this.field5938);
                }
                return;
            }
        } catch (IOException var12) {
            this.field5931 = -1L;
            throw var12;
        }
        if (arg1 <= 58) {
            field5926 = 0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)J")
    public final long method2579(int arg0) {
        field5941++;
        return arg0 >= -15 ? 0L : this.field5947;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method2580(byte arg0) {
        if (arg0 != -121) {
            field5926 = 111;
        }
        field5933 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(JZ)V")
    public final void method2581(long arg0, boolean arg1) throws IOException {
        field5929++;
        if (!arg1) {
            return;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2587(1432962400));
        }
        this.field5940 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B[B)V")
    public final void method2582(byte arg0, byte[] arg1) throws IOException {
        this.method2584(0, arg1, arg1.length, (byte) -78);
        if (arg0 != 25) {
            method2580((byte) -53);
        }
        field5927++;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    private final void method2583(byte arg0) throws IOException {
        this.field5948 = 0;
        field5942++;
        if (this.field5940 != this.field5931) {
            this.field5937.method560(-86, this.field5940);
            this.field5931 = this.field5940;
        }
        this.field5939 = this.field5940;
        if (arg0 <= 51) {
            this.method2587(70);
        }
        while (this.field5943.length > this.field5948) {
            int var2 = this.field5943.length - this.field5948;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5937.method565(this.field5948, (byte) -65, var2, this.field5943);
            if (var3 == -1) {
                break;
            }
            this.field5931 += var3;
            this.field5948 += var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[BIB)V")
    public final void method2584(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field5936++;
        try {
            if (arg1.length < (arg0 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg1.length);
            }
            if (this.field5938 != -1L && this.field5938 <= this.field5940 && ((long) arg2 + this.field5940) <= ((long) this.field5945 + this.field5938)) {
                class255.method1690(this.field5932, (int) (this.field5940 - this.field5938), arg1, arg0, arg2);
                this.field5940 += arg2;
                return;
            }
            long var5 = this.field5940;
            if (arg3 != -78) {
                return;
            }
            int var7 = arg0;
            int var8 = arg2;
            if (this.field5940 >= this.field5939 && (long) this.field5948 + this.field5939 > this.field5940) {
                int var9 = (int) (this.field5939 - (this.field5940 - (long) this.field5948));
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class255.method1690(this.field5943, (int) (this.field5940 - this.field5939), arg1, arg0, var9);
                arg2 -= var9;
                arg0 += var9;
                this.field5940 += var9;
            }
            if (this.field5943.length < arg2) {
                this.field5937.method560(-86, this.field5940);
                this.field5931 = this.field5940;
                while (arg2 > 0) {
                    int var10 = this.field5937.method565(arg0, (byte) -108, arg2, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    arg2 -= var10;
                    this.field5931 += var10;
                    this.field5940 += var10;
                }
            } else if (arg2 > 0) {
                this.method2583((byte) 126);
                int var11 = arg2;
                if (this.field5948 < arg2) {
                    var11 = this.field5948;
                }
                class255.method1690(this.field5943, 0, arg1, arg0, var11);
                arg0 += var11;
                this.field5940 += var11;
                arg2 -= var11;
            }
            if (this.field5938 != -1L) {
                if (this.field5940 < this.field5938 && arg2 > 0) {
                    int var12 = (int) (this.field5938 - this.field5940) + arg0;
                    if ((arg0 + arg2) < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg0) {
                        arg2--;
                        arg1[arg0++] = 0;
                        this.field5940++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field5938 && ((long) var8 + var5) > this.field5938) {
                    var13 = this.field5938;
                } else if (var5 >= this.field5938 && (long) this.field5945 + this.field5938 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field5945 + this.field5938) > var5 && ((long) var8 + var5) >= ((long) this.field5945 + this.field5938)) {
                    var15 = this.field5938 + ((long) this.field5945);
                } else if (var5 + ((long) var8) > this.field5938 && var5 + ((long) var8) <= this.field5938 - -((long) this.field5945)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class255.method1690(this.field5932, (int) (var13 - this.field5938), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field5940 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field5940));
                        this.field5940 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5931 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    private final void method2585(byte arg0) throws IOException {
        field5944++;
        if (this.field5938 != -1L) {
            if (this.field5938 != this.field5931) {
                this.field5937.method560(-103, this.field5938);
                this.field5931 = this.field5938;
            }
            this.field5937.method567(0, this.field5945, this.field5932, true);
            this.field5931 += this.field5945;
            if (this.field5931 > this.field5946) {
                this.field5946 = this.field5931;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field5939 <= this.field5938 && ((long) this.field5948 + this.field5939) > this.field5938) {
                var2 = this.field5938;
            } else if (this.field5938 <= this.field5939 && (long) this.field5945 + this.field5938 > this.field5939) {
                var2 = this.field5939;
            }
            if (this.field5939 < (long) this.field5945 + this.field5938 && (long) this.field5945 + this.field5938 <= (long) this.field5948 + this.field5939) {
                var4 = (long) this.field5945 + this.field5938;
            } else if ((long) this.field5948 + this.field5939 > this.field5938 && ((long) this.field5948 + this.field5939) <= ((long) this.field5945 + this.field5938)) {
                var4 = (long) this.field5948 + this.field5939;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class255.method1690(this.field5932, (int) (var2 - this.field5938), this.field5943, (int) (var2 - this.field5939), var6);
            }
            this.field5945 = 0;
            this.field5938 = -1L;
        }
        int var7 = 51 / ((-arg0 - 57) / 52);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public final void method2586(boolean arg0) throws IOException {
        if (arg0) {
            this.method2585((byte) 16);
            field5934++;
            this.field5937.method562(124);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method2587(int arg0) {
        field5928++;
        if (arg0 != 1432962400) {
            this.field5931 = 58L;
        }
        return this.field5937.method566((byte) 112);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lsga;II)V")
    public class421(class68 arg0, int arg1, int arg2) throws IOException {
        this.field5937 = arg0;
        this.field5947 = this.field5946 = arg0.method561((byte) 69);
        this.field5932 = new byte[arg2];
        this.field5940 = 0L;
        this.field5943 = new byte[arg1];
    }
}
