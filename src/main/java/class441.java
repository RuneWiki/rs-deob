import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class441 {

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "J")
    private long field6378 = -1L;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    private int field6382 = 0;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "J")
    private long field6379 = -1L;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "Lwc;")
    private class355 field6392;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "J")
    private long field6390;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "J")
    private long field6387;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "[B")
    private byte[] field6373;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "[B")
    private byte[] field6383;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "J")
    private long field6381;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    private int field6393;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "J")
    private long field6375;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(FFFFIFLba;IIII)[B", line = 4)
    public static final byte[] method2573(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, class108 arg6, int arg7, int arg8, int arg9, int arg10) {
        field6376++;
        byte[] var11 = new byte[arg8 * arg10 * arg4];
        if (arg7 == 18911) {
            class218.method1470(arg6, 0, var11, arg4, arg9, arg2, 117, arg3, arg1, arg10, arg5, arg0, arg8);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II[BI)V", line = 21)
    public final void method2574(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6384++;
        try {
            if (arg0 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (this.field6378 != -1L && this.field6381 >= this.field6378 && ((long) this.field6382 + this.field6378) >= ((long) arg0 + this.field6381)) {
                class553.method3242(this.field6373, (int) (this.field6381 - this.field6378), arg2, arg3, arg0);
                this.field6381 += arg0;
                return;
            }
            long var5 = this.field6381;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field6379 <= this.field6381 && this.field6381 < (long) this.field6393 + this.field6379) {
                int var9 = (int) (this.field6379 + (long) this.field6393 - this.field6381);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class553.method3242(this.field6383, (int) (this.field6381 - this.field6379), arg2, arg3, var9);
                arg3 += var9;
                this.field6381 += var9;
                arg0 -= var9;
            }
            if (this.field6383.length < arg0) {
                this.field6392.method2147(this.field6381, (byte) 113);
                this.field6375 = this.field6381;
                while (arg0 > 0) {
                    int var11 = this.field6392.method2146(arg0, arg1 - 4782, arg2, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 -= var11;
                    this.field6381 += var11;
                    arg3 += var11;
                    this.field6375 += var11;
                }
            } else if (arg0 > 0) {
                this.method2581(arg1 ^ 0x12AD);
                int var10 = arg0;
                if (arg0 > this.field6393) {
                    var10 = this.field6393;
                }
                class553.method3242(this.field6383, 0, arg2, arg3, var10);
                arg0 -= var10;
                arg3 += var10;
                this.field6381 += var10;
            }
            if (this.field6378 != -1L) {
                if (this.field6378 > this.field6381 && arg0 > 0) {
                    int var12 = (int) (this.field6378 - this.field6381) + arg3;
                    if (arg3 + arg0 < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg0--;
                        arg2[arg3++] = 0;
                        this.field6381++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field6378 && this.field6378 < var5 + ((long) var8)) {
                    var13 = this.field6378;
                } else if (var5 >= this.field6378 && var5 < (long) this.field6382 + this.field6378) {
                    var13 = var5;
                }
                if (((long) this.field6382 + this.field6378) > var5 && (this.field6378 + ((long) this.field6382)) <= ((long) var8 + var5)) {
                    var15 = this.field6378 + ((long) this.field6382);
                } else if (this.field6378 < ((long) var8 + var5) && ((long) var8 + var5) <= ((long) this.field6382 + this.field6378)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class553.method3242(this.field6373, (int) (var13 - this.field6378), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field6381 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field6381));
                        this.field6381 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6375 = -1L;
            throw var19;
        }
        if (arg1 != 4781) {
            method2573(1.2172782F, -0.14147677F, -1.1992657F, -0.96458083F, -89, 0.7031264F, null, -55, 122, -28, 24);
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 204)
    public final void method2575(byte arg0) throws IOException {
        field6389++;
        this.method2582(arg0 + 255);
        if (arg0 != 0) {
            this.field6390 = 15L;
        }
        this.field6392.method2152(false);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[BBI)V", line = 217)
    public final void method2576(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field6388++;
        if (arg2 < 33) {
            this.method2580(false);
        }
        try {
            if (this.field6387 < ((long) arg0 + this.field6381)) {
                this.field6387 = this.field6381 + ((long) arg0);
            }
            if (this.field6378 != -1L && (this.field6378 > this.field6381 || this.field6381 > this.field6378 + ((long) this.field6382))) {
                this.method2582(255);
            }
            if (this.field6378 != -1L && (this.field6378 + ((long) this.field6373.length)) < (this.field6381 + ((long) arg0))) {
                int var5 = (int) ((long) this.field6373.length - (this.field6381 - this.field6378));
                class553.method3242(arg1, arg3, this.field6373, (int) (this.field6381 - this.field6378), var5);
                arg0 -= var5;
                this.field6381 += var5;
                arg3 += var5;
                this.field6382 = this.field6373.length;
                this.method2582(255);
            }
            if (this.field6373.length < arg0) {
                if (this.field6381 != this.field6375) {
                    this.field6392.method2147(this.field6381, (byte) -114);
                    this.field6375 = this.field6381;
                }
                this.field6392.method2149(arg1, arg0, arg3, 1);
                this.field6375 += arg0;
                if (this.field6375 > this.field6390) {
                    this.field6390 = this.field6375;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field6379 <= this.field6381 && ((long) this.field6393 + this.field6379) > this.field6381) {
                    var6 = this.field6381;
                } else if (this.field6379 >= this.field6381 && this.field6379 < (long) arg0 + this.field6381) {
                    var6 = this.field6379;
                }
                if ((long) arg0 + this.field6381 > this.field6379 && (long) arg0 + this.field6381 <= this.field6379 - -((long) this.field6393)) {
                    var8 = (long) arg0 + this.field6381;
                } else if ((long) this.field6393 + this.field6379 > this.field6381 && (long) arg0 + this.field6381 >= (long) this.field6393 + this.field6379) {
                    var8 = (long) this.field6393 + this.field6379;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class553.method3242(arg1, (int) ((long) arg3 + var6 - this.field6381), this.field6383, (int) (var6 - this.field6379), var10);
                }
                this.field6381 += arg0;
            } else if (arg0 > 0) {
                if (this.field6378 == -1L) {
                    this.field6378 = this.field6381;
                }
                class553.method3242(arg1, arg3, this.field6373, (int) (this.field6381 - this.field6378), arg0);
                this.field6381 += arg0;
                if ((this.field6381 - this.field6378) > ((long) this.field6382)) {
                    this.field6382 = (int) (this.field6381 - this.field6378);
                }
            }
        } catch (IOException var12) {
            this.field6375 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[B)V", line = 346)
    public final void method2577(int arg0, byte[] arg1) throws IOException {
        field6386++;
        if (arg0 != 30437) {
            this.field6392 = null;
        }
        this.method2574(arg1.length, 4781, arg1, 0);
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lwc;II)V", line = 547)
    public class441(class355 arg0, int arg1, int arg2) throws IOException {
        this.field6392 = arg0;
        this.field6387 = this.field6390 = arg0.method2144(122);
        this.field6373 = new byte[arg2];
        this.field6383 = new byte[arg1];
        this.field6381 = 0L;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Ljava/io/File;", line = 363)
    private final File method2578(int arg0) {
        field6385++;
        if (arg0 != 7895) {
            this.field6373 = null;
        }
        return this.field6392.method2150(16384);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IJ)V", line = 374)
    public final void method2579(int arg0, long arg1) throws IOException {
        field6380++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2578(7895));
        }
        this.field6381 = arg1;
        if (arg0 >= -15) {
            this.method2578(-101);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)J", line = 407)
    public final long method2580(boolean arg0) {
        field6374++;
        if (arg0) {
            this.method2580(false);
        }
        return this.field6387;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 421)
    private final void method2581(int arg0) throws IOException {
        this.field6393 = arg0;
        field6377++;
        if (this.field6381 != this.field6375) {
            this.field6392.method2147(this.field6381, (byte) -65);
            this.field6375 = this.field6381;
        }
        this.field6379 = this.field6381;
        while (this.field6383.length > this.field6393) {
            int var2 = this.field6383.length - this.field6393;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6392.method2146(var2, ~arg0, this.field6383, this.field6393);
            if (var3 == -1) {
                break;
            }
            this.field6375 += var3;
            this.field6393 += var3;
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V", line = 465)
    private final void method2582(int arg0) throws IOException {
        if (this.field6378 != -1L) {
            if (this.field6378 != this.field6375) {
                this.field6392.method2147(this.field6378, (byte) 118);
                this.field6375 = this.field6378;
            }
            this.field6392.method2149(this.field6373, this.field6382, 0, 1);
            this.field6375 += this.field6382;
            if (this.field6390 < this.field6375) {
                this.field6390 = this.field6375;
            }
            long var2 = -1L;
            if (this.field6378 >= this.field6379 && this.field6378 < ((long) this.field6393 + this.field6379)) {
                var2 = this.field6378;
            } else if (this.field6379 >= this.field6378 && this.field6379 < (long) this.field6382 + this.field6378) {
                var2 = this.field6379;
            }
            long var4 = -1L;
            if (this.field6379 < this.field6378 + ((long) this.field6382) && (this.field6378 + ((long) this.field6382)) <= ((long) this.field6393 + this.field6379)) {
                var4 = (long) this.field6382 + this.field6378;
            } else if ((long) this.field6393 + this.field6379 > this.field6378 && ((long) this.field6382 + this.field6378) >= (this.field6379 + ((long) this.field6393))) {
                var4 = this.field6379 + ((long) this.field6393);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class553.method3242(this.field6373, (int) (var2 - this.field6378), this.field6383, (int) (var2 - this.field6379), var6);
            }
            this.field6378 = -1L;
            this.field6382 = 0;
        }
        if (arg0 == 255) {
            field6391++;
        }
    }
}
