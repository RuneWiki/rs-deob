import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class590 {

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    private int field8368 = 0;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "J")
    private long field8357 = -1L;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "J")
    private long field8359 = -1L;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "Lkda;")
    private class390 field8372;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "J")
    private long field8375;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "J")
    private long field8374;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "[B")
    private byte[] field8362;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "[B")
    private byte[] field8361;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "J")
    private long field8363;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "Z")
    public static boolean field8364 = false;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "[Lki;")
    public static class710[] field8371 = new class710[100];

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    private int field8373;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "J")
    private long field8366;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)J")
    public final long method3408(int arg0) {
        field8369++;
        return arg0 == -1 ? this.field8374 : 25L;
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
    private final void method3409(int arg0) throws IOException {
        field8358++;
        if (this.field8359 != -1L) {
            if (this.field8366 != this.field8359) {
                this.field8372.method2501(121, this.field8359);
                this.field8366 = this.field8359;
            }
            this.field8372.method2507(this.field8362, (byte) 115, 0, this.field8368);
            this.field8366 += this.field8368;
            if (this.field8366 > this.field8375) {
                this.field8375 = this.field8366;
            }
            long var2 = -1L;
            if (this.field8357 <= this.field8359 && ((long) this.field8373 + this.field8357) > this.field8359) {
                var2 = this.field8359;
            } else if (this.field8359 <= this.field8357 && ((long) this.field8368 + this.field8359) > this.field8357) {
                var2 = this.field8357;
            }
            long var4 = -1L;
            if ((long) this.field8368 + this.field8359 > this.field8357 && (long) this.field8368 + this.field8359 <= (long) this.field8373 + this.field8357) {
                var4 = this.field8359 + ((long) this.field8368);
            } else if (this.field8359 < ((long) this.field8373 + this.field8357) && ((long) this.field8368 + this.field8359) >= ((long) this.field8373 + this.field8357)) {
                var4 = (long) this.field8373 + this.field8357;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class319.method2022(this.field8362, (int) (var2 - this.field8359), this.field8361, (int) (var2 - this.field8357), var6);
            }
            this.field8368 = 0;
            this.field8359 = -1L;
        }
        if (arg0 != 0) {
            method3415((byte) -57);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(III[B)V")
    public final void method3410(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field8365++;
        try {
            if (this.field8363 + ((long) arg0) > this.field8374) {
                this.field8374 = this.field8363 + ((long) arg0);
            }
            if (this.field8359 != -1L && (this.field8359 > this.field8363 || this.field8363 > this.field8359 + ((long) this.field8368))) {
                this.method3409(0);
            }
            if ((long) arg1 != this.field8359 && (long) arg0 + this.field8363 > (long) this.field8362.length + this.field8359) {
                int var5 = (int) ((long) this.field8362.length - (this.field8363 - this.field8359));
                class319.method2022(arg3, arg2, this.field8362, (int) (this.field8363 - this.field8359), var5);
                this.field8363 += var5;
                arg0 -= var5;
                arg2 += var5;
                this.field8368 = this.field8362.length;
                this.method3409(0);
            }
            if (arg0 > this.field8362.length) {
                if (this.field8366 != this.field8363) {
                    this.field8372.method2501(110, this.field8363);
                    this.field8366 = this.field8363;
                }
                this.field8372.method2507(arg3, (byte) 102, arg2, arg0);
                this.field8366 += arg0;
                if (this.field8375 < this.field8366) {
                    this.field8375 = this.field8366;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field8363 >= this.field8357 && ((long) this.field8373 + this.field8357) > this.field8363) {
                    var6 = this.field8363;
                } else if (this.field8363 <= this.field8357 && (long) arg0 + this.field8363 > this.field8357) {
                    var6 = this.field8357;
                }
                if (this.field8357 < ((long) arg0 + this.field8363) && ((long) this.field8373 + this.field8357) >= (this.field8363 + ((long) arg0))) {
                    var8 = this.field8363 + ((long) arg0);
                } else if (this.field8363 < ((long) this.field8373 + this.field8357) && ((long) this.field8373 + this.field8357) <= (this.field8363 + ((long) arg0))) {
                    var8 = this.field8357 + ((long) this.field8373);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class319.method2022(arg3, (int) ((long) arg2 + var6 - this.field8363), this.field8361, (int) (var6 - this.field8357), var10);
                }
                this.field8363 += arg0;
            } else if (arg0 > 0) {
                if (this.field8359 == -1L) {
                    this.field8359 = this.field8363;
                }
                class319.method2022(arg3, arg2, this.field8362, (int) (this.field8363 - this.field8359), arg0);
                this.field8363 += arg0;
                if ((long) this.field8368 < this.field8363 - this.field8359) {
                    this.field8368 = (int) (this.field8363 - this.field8359);
                }
            }
        } catch (IOException var12) {
            this.field8366 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "([BIIIIB)V")
    public static final void method3411(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 51) {
            field8364 = false;
        }
        field8360++;
        if (arg1 >= arg4) {
            return;
        }
        int var6 = arg4 - arg1 >> 2;
        int var7 = arg1 + arg3;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg4 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method3412(byte arg0) {
        field8379++;
        return arg0 == 67 ? this.field8372.method2506(-31270) : null;
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V")
    public final void method3413(int arg0) throws IOException {
        field8367++;
        if (arg0 < -43) {
            this.method3409(0);
            this.field8372.method2504(-61);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "([BB)V")
    public final void method3414(byte[] arg0, byte arg1) throws IOException {
        field8376++;
        if (arg1 == 37) {
            this.method3418(0, arg0, arg0.length, 117);
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)V")
    public static void method3415(byte arg0) {
        if (arg0 > -98) {
            field8371 = null;
        }
        field8371 = null;
    }

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V")
    private final void method3416(int arg0) throws IOException {
        int var2 = -128 / ((40 - arg0) / 46);
        this.field8373 = 0;
        field8377++;
        if (this.field8366 != this.field8363) {
            this.field8372.method2501(-110, this.field8363);
            this.field8366 = this.field8363;
        }
        this.field8357 = this.field8363;
        while (this.field8361.length > this.field8373) {
            int var3 = this.field8361.length - this.field8373;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field8372.method2500(this.field8361, this.field8373, (byte) 103, var3);
            if (var4 == -1) {
                break;
            }
            this.field8373 += var4;
            this.field8366 += var4;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IJ)V")
    public final void method3417(int arg0, long arg1) throws IOException {
        field8370++;
        int var4 = -64 % ((63 - arg0) / 44);
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3412((byte) 67));
        }
        this.field8363 = arg1;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[BII)V")
    public final void method3418(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field8378++;
        try {
            if ((arg0 + arg2) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field8359 != -1L && this.field8359 <= this.field8363 && this.field8363 + ((long) arg2) <= (long) this.field8368 + this.field8359) {
                class319.method2022(this.field8362, (int) (this.field8363 - this.field8359), arg1, arg0, arg2);
                this.field8363 += arg2;
                return;
            }
            if (arg3 <= 85) {
                this.field8361 = null;
            }
            long var5 = this.field8363;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field8357 <= this.field8363 && this.field8363 < this.field8357 + ((long) this.field8373)) {
                int var9 = (int) ((long) this.field8373 + this.field8357 - this.field8363);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class319.method2022(this.field8361, (int) (this.field8363 - this.field8357), arg1, arg0, var9);
                arg2 -= var9;
                arg0 += var9;
                this.field8363 += var9;
            }
            if (arg2 > this.field8361.length) {
                this.field8372.method2501(126, this.field8363);
                this.field8366 = this.field8363;
                while (arg2 > 0) {
                    int var11 = this.field8372.method2500(arg1, arg0, (byte) 103, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    arg0 += var11;
                    this.field8366 += var11;
                    this.field8363 += var11;
                }
            } else if (arg2 > 0) {
                this.method3416(98);
                int var10 = arg2;
                if (arg2 > this.field8373) {
                    var10 = this.field8373;
                }
                class319.method2022(this.field8361, 0, arg1, arg0, var10);
                arg0 += var10;
                this.field8363 += var10;
                arg2 -= var10;
            }
            if (this.field8359 != -1L) {
                if (this.field8363 < this.field8359 && arg2 > 0) {
                    int var12 = (int) (this.field8359 - this.field8363) + arg0;
                    if (arg0 + arg2 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        arg2--;
                        this.field8363++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field8359 >= var5 && ((long) var8 + var5) > this.field8359) {
                    var13 = this.field8359;
                } else if (this.field8359 <= var5 && ((long) this.field8368 + this.field8359) > var5) {
                    var13 = var5;
                }
                if (var5 < (this.field8359 + ((long) this.field8368)) && ((long) this.field8368 + this.field8359) <= (var5 + ((long) var8))) {
                    var15 = (long) this.field8368 + this.field8359;
                } else if (this.field8359 < ((long) var8 + var5) && ((long) var8 + var5) <= (this.field8359 + ((long) this.field8368))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class319.method2022(this.field8362, (int) (var13 - this.field8359), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field8363 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field8363));
                        this.field8363 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field8366 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lkda;II)V")
    public class590(class390 arg0, int arg1, int arg2) throws IOException {
        this.field8372 = arg0;
        this.field8374 = this.field8375 = arg0.method2505((byte) 93);
        this.field8362 = new byte[arg2];
        this.field8361 = new byte[arg1];
        this.field8363 = 0L;
    }
}
