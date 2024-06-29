import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class412 {

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "J")
    private long field5948 = -1L;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    private int field5949 = 0;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "J")
    private long field5957 = -1L;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lle;")
    private class167 field5942;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "J")
    private long field5952;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "J")
    private long field5946;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[B")
    private byte[] field5945;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "[B")
    private byte[] field5959;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "J")
    private long field5947;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Lfi;")
    public static class331 field5955 = new class331(200);

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "[S")
    public static short[] field5961 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field5960 = "glow2:";

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    private int field5939;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "J")
    private long field5944;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JI)V")
    public final void method2579(long arg0, int arg1) throws IOException {
        field5950++;
        if (arg1 != 14653) {
            return;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2582(-120));
        }
        this.field5947 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[BII)V")
    public final void method2580(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5958++;
        try {
            if (arg2 != 0) {
                method2583(false, 108);
            }
            if (((long) arg0 + this.field5947) > this.field5946) {
                this.field5946 = (long) arg0 + this.field5947;
            }
            if (this.field5948 != -1L && (this.field5948 > this.field5947 || this.field5947 > (long) this.field5949 + this.field5948)) {
                this.method2585(arg2 + 4);
            }
            if (this.field5948 != -1L && this.field5947 + ((long) arg0) > this.field5948 - -((long) this.field5945.length)) {
                int var5 = (int) (-this.field5947 - (-this.field5948 - (long) this.field5945.length));
                class408.method2571(arg1, arg3, this.field5945, (int) (this.field5947 - this.field5948), var5);
                this.field5947 += (long) var5;
                arg3 += var5;
                arg0 -= var5;
                this.field5949 = this.field5945.length;
                this.method2585(4);
            }
            if (this.field5945.length < arg0) {
                if (this.field5947 != this.field5944) {
                    this.field5942.method1104(this.field5947, -1);
                    this.field5944 = this.field5947;
                }
                this.field5942.method1103(-1, arg0, arg3, arg1);
                this.field5944 += (long) arg0;
                if (this.field5952 < this.field5944) {
                    this.field5952 = this.field5944;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field5957 <= this.field5947 && this.field5947 < this.field5957 + ((long) this.field5939)) {
                    var6 = this.field5947;
                } else if (this.field5957 >= this.field5947 && this.field5957 < this.field5947 + ((long) arg0)) {
                    var6 = this.field5957;
                }
                if (((long) arg0 + this.field5947) > this.field5957 && ((long) this.field5939 + this.field5957) >= ((long) arg0 + this.field5947)) {
                    var8 = (long) arg0 + this.field5947;
                } else if (this.field5947 < (long) this.field5939 + this.field5957 && ((long) arg0 + this.field5947) >= ((long) this.field5939 + this.field5957)) {
                    var8 = (long) this.field5939 + this.field5957;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class408.method2571(arg1, (int) ((long) arg3 + var6 - this.field5947), this.field5959, (int) (var6 - this.field5957), var10);
                }
                this.field5947 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field5948 == -1L) {
                    this.field5948 = this.field5947;
                }
                class408.method2571(arg1, arg3, this.field5945, (int) (this.field5947 - this.field5948), arg0);
                this.field5947 += (long) arg0;
                if (((long) this.field5949) < (this.field5947 - this.field5948)) {
                    this.field5949 = (int) (this.field5947 - this.field5948);
                }
            }
        } catch (IOException var12) {
            this.field5944 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)J")
    public final long method2581(boolean arg0) {
        if (arg0) {
            field5961 = null;
        }
        field5953++;
        return this.field5946;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method2582(int arg0) {
        field5941++;
        return arg0 >= -63 ? null : this.field5942.method1105(true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public static final void method2583(boolean arg0, int arg1) {
        field5956++;
        class110.field1277 = arg1;
        class331 var2 = class140.field1983;
        synchronized (class140.field1983) {
            class140.field1983.method2043(-105);
            if (arg0) {
                method2588(43);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([BIII)V")
    public final void method2584(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5940++;
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
            }
            if ((long) arg3 != this.field5948 && this.field5947 >= this.field5948 && ((long) arg1 + this.field5947) <= ((long) this.field5949 + this.field5948)) {
                class408.method2571(this.field5945, (int) (this.field5947 - this.field5948), arg0, arg2, arg1);
                this.field5947 += (long) arg1;
                return;
            }
            long var5 = this.field5947;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field5947 >= this.field5957 && this.field5947 < (long) this.field5939 + this.field5957) {
                int var9 = (int) ((long) this.field5939 + this.field5957 - this.field5947);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class408.method2571(this.field5959, (int) (this.field5947 - this.field5957), arg0, arg2, var9);
                arg2 += var9;
                arg1 -= var9;
                this.field5947 += (long) var9;
            }
            if (arg1 > this.field5959.length) {
                this.field5942.method1104(this.field5947, -1);
                this.field5944 = this.field5947;
                while (arg1 > 0) {
                    int var11 = this.field5942.method1108(arg0, (byte) -51, arg2, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field5947 += (long) var11;
                    this.field5944 += (long) var11;
                    arg1 -= var11;
                    arg2 += var11;
                }
            } else if (arg1 > 0) {
                this.method2586((byte) 8);
                int var10 = arg1;
                if (this.field5939 < arg1) {
                    var10 = this.field5939;
                }
                class408.method2571(this.field5959, 0, arg0, arg2, var10);
                this.field5947 += (long) var10;
                arg2 += var10;
                arg1 -= var10;
            }
            if (this.field5948 != -1L) {
                if (this.field5947 < this.field5948 && arg1 > 0) {
                    int var12 = arg2 + ((int) (this.field5948 - this.field5947));
                    if (var12 > (arg1 + arg2)) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg2) {
                        arg0[arg2++] = 0;
                        arg1--;
                        this.field5947++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field5948 >= var5 && (var5 + ((long) var8)) > this.field5948) {
                    var13 = this.field5948;
                } else if (this.field5948 <= var5 && var5 < (this.field5948 + ((long) this.field5949))) {
                    var13 = var5;
                }
                if (var5 < (long) this.field5949 + this.field5948 && ((long) var8 + var5) >= ((long) this.field5949 + this.field5948)) {
                    var15 = (long) this.field5949 + this.field5948;
                } else if (this.field5948 < (long) var8 + var5 && var5 + ((long) var8) <= (long) this.field5949 + this.field5948) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class408.method2571(this.field5945, (int) (var13 - this.field5948), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field5947 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field5947));
                        this.field5947 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5944 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    private final void method2585(int arg0) throws IOException {
        field5954++;
        if (this.field5948 != -1L) {
            if (this.field5948 != this.field5944) {
                this.field5942.method1104(this.field5948, arg0 - 5);
                this.field5944 = this.field5948;
            }
            this.field5942.method1103(-1, this.field5949, 0, this.field5945);
            this.field5944 += (long) this.field5949;
            if (this.field5944 > this.field5952) {
                this.field5952 = this.field5944;
            }
            long var2 = -1L;
            if (this.field5957 <= this.field5948 && this.field5948 < this.field5957 + ((long) this.field5939)) {
                var2 = this.field5948;
            } else if (this.field5948 <= this.field5957 && ((long) this.field5949 + this.field5948) > this.field5957) {
                var2 = this.field5957;
            }
            long var4 = -1L;
            if (this.field5957 < ((long) this.field5949 + this.field5948) && ((long) this.field5939 + this.field5957) >= ((long) this.field5949 + this.field5948)) {
                var4 = (long) this.field5949 + this.field5948;
            } else if (this.field5948 < (long) this.field5939 + this.field5957 && ((long) this.field5939 + this.field5957) <= (this.field5948 + ((long) this.field5949))) {
                var4 = this.field5957 + ((long) this.field5939);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class408.method2571(this.field5945, (int) (var2 - this.field5948), this.field5959, (int) (var2 - this.field5957), var6);
            }
            this.field5949 = 0;
            this.field5948 = -1L;
        }
        if (arg0 != 4) {
            this.field5952 = -11L;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    private final void method2586(byte arg0) throws IOException {
        field5951++;
        this.field5939 = 0;
        if (this.field5947 != this.field5944) {
            this.field5942.method1104(this.field5947, -1);
            this.field5944 = this.field5947;
        }
        this.field5957 = this.field5947;
        while (this.field5959.length > this.field5939) {
            int var2 = this.field5959.length - this.field5939;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5942.method1108(this.field5959, (byte) -51, this.field5939, var2);
            if (var3 == -1) {
                break;
            }
            this.field5944 += (long) var3;
            this.field5939 += var3;
        }
        if (arg0 <= 6) {
            this.method2582(-5);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B[B)V")
    public final void method2587(byte arg0, byte[] arg1) throws IOException {
        int var3 = -67 % ((32 - arg0) / 37);
        this.method2584(arg1, arg1.length, 0, -1);
        field5943++;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static void method2588(int arg0) {
        field5955 = null;
        if (arg0 != -1) {
            field5961 = null;
        }
        field5960 = null;
        field5961 = null;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lle;II)V")
    public class412(class167 arg0, int arg1, int arg2) throws IOException {
        this.field5942 = arg0;
        this.field5946 = this.field5952 = arg0.method1106(0);
        this.field5945 = new byte[arg2];
        this.field5959 = new byte[arg1];
        this.field5947 = 0L;
    }
}
