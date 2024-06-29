import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class276 {

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    private int field4340 = 0;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "J")
    private long field4343 = -1L;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "J")
    private long field4347 = -1L;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lec;")
    private class24 field4342;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "J")
    private long field4355;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "J")
    private long field4346;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "J")
    private long field4351;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[B")
    private byte[] field4344;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[B")
    private byte[] field4341;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "F")
    public static float field4334 = 0.0F;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static volatile int field4331 = 0;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Ljl;")
    public static class253 field4349 = new class253();

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "S")
    public static short field4353 = 320;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
    public static int[] field4352 = new int[128];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    private int field4336;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "J")
    private long field4338;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Luf;")
    public static class176 field4354;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[Lkd;")
    public static class209[] field4356;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    private final void method1849(int arg0) throws IOException {
        field4345++;
        this.field4336 = 0;
        if (this.field4351 != this.field4338) {
            this.field4342.method195(this.field4351, 325);
            this.field4338 = this.field4351;
        }
        if (arg0 != 200000000) {
            method1850(-59);
        }
        this.field4347 = this.field4351;
        while (this.field4336 < this.field4344.length) {
            int var2 = this.field4344.length - this.field4336;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4342.method197(this.field4336, this.field4344, -1, var2);
            if (var3 == -1) {
                break;
            }
            this.field4336 += var3;
            this.field4338 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static void method1850(int arg0) {
        if (arg0 >= 68) {
            field4356 = null;
            field4349 = null;
            field4352 = null;
            field4354 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    private final void method1851(boolean arg0) throws IOException {
        if (this.field4343 != -1L) {
            if (this.field4343 != this.field4338) {
                this.field4342.method195(this.field4343, 325);
                this.field4338 = this.field4343;
            }
            this.field4342.method196(this.field4341, (byte) 79, this.field4340, 0);
            long var2 = -1L;
            long var4 = -1L;
            this.field4338 += (long) this.field4340;
            if (((long) this.field4340 + this.field4343) > this.field4347 && (long) this.field4340 + this.field4343 <= (long) this.field4336 + this.field4347) {
                var2 = (long) this.field4340 + this.field4343;
            } else if ((long) this.field4336 + this.field4347 > this.field4343 && ((long) this.field4336 + this.field4347) <= ((long) this.field4340 + this.field4343)) {
                var2 = this.field4347 + ((long) this.field4336);
            }
            if (this.field4347 <= this.field4343 && (this.field4347 + ((long) this.field4336)) > this.field4343) {
                var4 = this.field4343;
            } else if (this.field4347 >= this.field4343 && this.field4343 + ((long) this.field4340) > this.field4347) {
                var4 = this.field4347;
            }
            if (this.field4338 > this.field4355) {
                this.field4355 = this.field4338;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class236.method1588(this.field4341, (int) (var4 - this.field4343), this.field4344, (int) (var4 - this.field4347), var6);
            }
            this.field4343 = -1L;
            this.field4340 = 0;
        }
        if (arg0) {
            this.method1853(106);
        }
        field4337++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB[B)V")
    public final void method1852(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field4333++;
        try {
            if (arg3.length < (arg1 + arg0)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (arg2 > -77) {
                this.method1854(42);
            }
            if (this.field4343 != -1L && this.field4343 <= this.field4351 && (long) this.field4340 + this.field4343 >= (long) arg0 + this.field4351) {
                class236.method1588(this.field4341, (int) (this.field4351 - this.field4343), arg3, arg1, arg0);
                this.field4351 += (long) arg0;
                return;
            }
            long var5 = this.field4351;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field4351 >= this.field4347 && this.field4351 < ((long) this.field4336 + this.field4347)) {
                int var9 = (int) (this.field4347 + (long) this.field4336 - this.field4351);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class236.method1588(this.field4344, (int) (this.field4351 - this.field4347), arg3, arg1, var9);
                this.field4351 += (long) var9;
                arg1 += var9;
            }
            if (arg0 > this.field4344.length) {
                this.field4342.method195(this.field4351, 325);
                this.field4338 = this.field4351;
                while (arg0 > 0) {
                    int var10 = this.field4342.method197(arg1, arg3, -1, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 += var10;
                    this.field4338 += (long) var10;
                    arg0 -= var10;
                    this.field4351 += (long) var10;
                }
            } else if (arg0 > 0) {
                this.method1849(200000000);
                int var11 = arg0;
                if (arg0 > this.field4336) {
                    var11 = this.field4336;
                }
                arg0 -= var11;
                class236.method1588(this.field4344, 0, arg3, arg1, var11);
                this.field4351 += (long) var11;
                arg1 += var11;
            }
            if (this.field4343 != -1L) {
                if (this.field4343 > this.field4351 && arg0 > 0) {
                    int var12 = (int) (this.field4343 - this.field4351) + arg1;
                    if (arg0 + arg1 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (arg1 < var12) {
                        arg0--;
                        arg3[arg1++] = 0;
                        this.field4351++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field4343 && (var5 + ((long) var8)) > this.field4343) {
                    var13 = this.field4343;
                } else if (var5 >= this.field4343 && var5 < (this.field4343 + ((long) this.field4340))) {
                    var13 = var5;
                }
                if (var5 < ((long) this.field4340 + this.field4343) && (long) var8 + var5 >= (long) this.field4340 + this.field4343) {
                    var15 = (long) this.field4340 + this.field4343;
                } else if (this.field4343 < (long) var8 + var5 && (long) var8 + var5 <= (long) this.field4340 + this.field4343) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class236.method1588(this.field4341, (int) (var13 - this.field4343), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field4351 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field4351));
                        this.field4351 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4338 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)J")
    public final long method1853(int arg0) {
        if (arg0 != 0) {
            method1850(69);
        }
        field4350++;
        return this.field4346;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method1854(int arg0) {
        field4335++;
        if (arg0 != -5095) {
            this.method1853(-118);
        }
        return this.field4342.method198(118);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIII)V")
    public final void method1855(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4339++;
        try {
            if (this.field4346 < ((long) arg1 + this.field4351)) {
                this.field4346 = (long) arg1 + this.field4351;
            }
            if (this.field4343 != -1L && (this.field4343 > this.field4351 || this.field4351 > (this.field4343 + ((long) this.field4340)))) {
                this.method1851(false);
            }
            if (this.field4343 != -1L && this.field4351 + ((long) arg1) > (long) this.field4341.length + this.field4343) {
                int var5 = (int) ((long) this.field4341.length + this.field4343 - this.field4351);
                arg1 -= var5;
                class236.method1588(arg0, arg3, this.field4341, (int) (this.field4351 - this.field4343), var5);
                arg3 += var5;
                this.field4351 += (long) var5;
                this.field4340 = this.field4341.length;
                this.method1851(false);
            }
            if (arg1 > this.field4341.length) {
                if (this.field4351 != this.field4338) {
                    this.field4342.method195(this.field4351, 325);
                    this.field4338 = this.field4351;
                }
                long var6 = -1L;
                this.field4342.method196(arg0, (byte) -66, arg1, arg3);
                if (this.field4351 >= this.field4347 && (long) this.field4336 + this.field4347 > this.field4351) {
                    var6 = this.field4351;
                } else if (this.field4347 >= this.field4351 && this.field4351 + ((long) arg1) > this.field4347) {
                    var6 = this.field4347;
                }
                this.field4338 += (long) arg1;
                if (this.field4355 < this.field4338) {
                    this.field4355 = this.field4338;
                }
                long var8 = -1L;
                if (this.field4347 < (long) arg1 + this.field4351 && ((long) this.field4336 + this.field4347) >= ((long) arg1 + this.field4351)) {
                    var8 = (long) arg1 + this.field4351;
                } else if (((long) this.field4336 + this.field4347) > this.field4351 && this.field4351 + ((long) arg1) >= this.field4347 - -((long) this.field4336)) {
                    var8 = (long) this.field4336 + this.field4347;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class236.method1588(arg0, (int) ((long) arg3 - (this.field4351 - var6)), this.field4344, (int) (var6 - this.field4347), var10);
                }
                this.field4351 += (long) arg1;
                return;
            }
            if (arg1 > 0) {
                if (this.field4343 == -1L) {
                    this.field4343 = this.field4351;
                }
                class236.method1588(arg0, arg3, this.field4341, (int) (this.field4351 - this.field4343), arg1);
                this.field4351 += (long) arg1;
                if (this.field4351 - this.field4343 > (long) this.field4340) {
                    this.field4340 = (int) (this.field4351 - this.field4343);
                }
                return;
            }
        } catch (IOException var13) {
            this.field4338 = -1L;
            throw var13;
        }
        int var12 = -36 % ((53 - arg2) / 47);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[B)V")
    public final void method1856(int arg0, byte[] arg1) throws IOException {
        field4348++;
        if (arg0 > 28) {
            this.method1852(arg1.length, 0, (byte) -99, arg1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJ)V")
    public final void method1857(int arg0, long arg1) throws IOException {
        if (arg0 > -16) {
            field4349 = null;
        }
        field4332++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1854(-5095));
        }
        this.field4351 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lec;II)V")
    public class276(class24 arg0, int arg1, int arg2) throws IOException {
        this.field4342 = arg0;
        this.field4346 = this.field4355 = arg0.method194(-103);
        this.field4351 = 0L;
        this.field4344 = new byte[arg1];
        this.field4341 = new byte[arg2];
    }
}
