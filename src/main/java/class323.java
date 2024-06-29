import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class323 {

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "J")
    private long field4346 = -1L;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "J")
    private long field4353 = -1L;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    private int field4352 = 0;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "Lvr;")
    private class116 field4344;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "J")
    private long field4355;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "J")
    private long field4347;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "[B")
    private byte[] field4348;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "J")
    private long field4343;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "[B")
    private byte[] field4345;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "Ldv;")
    public static class566 field4359 = new class566(6, 0);

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "[I")
    public static int[] field4360 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "F")
    public static float field4361 = 1.0F;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    private int field4340;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "J")
    private long field4357;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)J")
    public final long method1999(byte arg0) {
        if (arg0 != 1) {
            this.method1999((byte) 115);
        }
        field4358++;
        return this.field4347;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    private final void method2000(int arg0) throws IOException {
        field4339++;
        this.field4340 = 0;
        int var2 = -98 / ((-arg0 - 87) / 34);
        if (this.field4357 != this.field4343) {
            this.field4344.method822(this.field4343, -27095);
            this.field4357 = this.field4343;
        }
        this.field4353 = this.field4343;
        while (this.field4340 < this.field4348.length) {
            int var3 = this.field4348.length - this.field4340;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field4344.method819(this.field4348, -7, var3, this.field4340);
            if (var4 == -1) {
                break;
            }
            this.field4340 += var4;
            this.field4357 += var4;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method2001(byte arg0) {
        field4342++;
        int var2 = -66 % ((-arg0 - 20) / 32);
        return this.field4344.method820(-1);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "([BIIZ)V")
    public final void method2002(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field4356++;
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4346 != -1L && this.field4343 >= this.field4346 && ((long) arg1 + this.field4343) <= ((long) this.field4352 + this.field4346)) {
                class416.method2498(this.field4345, (int) (this.field4343 - this.field4346), arg0, arg2, arg1);
                this.field4343 += arg1;
                return;
            }
            long var5 = this.field4343;
            int var7 = arg2;
            if (arg3) {
                this.field4340 = 66;
            }
            int var8 = arg1;
            if (this.field4343 >= this.field4353 && this.field4343 < (long) this.field4340 + this.field4353) {
                int var9 = (int) (-this.field4343 - (-this.field4353 - (long) this.field4340));
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class416.method2498(this.field4348, (int) (this.field4343 - this.field4353), arg0, arg2, var9);
                arg1 -= var9;
                arg2 += var9;
                this.field4343 += var9;
            }
            if (arg1 > this.field4348.length) {
                this.field4344.method822(this.field4343, -27095);
                this.field4357 = this.field4343;
                while (arg1 > 0) {
                    int var10 = this.field4344.method819(arg0, -110, arg1, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field4357 += var10;
                    arg1 -= var10;
                    this.field4343 += var10;
                    arg2 += var10;
                }
            } else if (arg1 > 0) {
                this.method2000(47);
                int var11 = arg1;
                if (arg1 > this.field4340) {
                    var11 = this.field4340;
                }
                class416.method2498(this.field4348, 0, arg0, arg2, var11);
                arg2 += var11;
                arg1 -= var11;
                this.field4343 += var11;
            }
            if (this.field4346 != -1L) {
                if (this.field4346 > this.field4343 && arg1 > 0) {
                    int var12 = arg2 + ((int) (this.field4346 - this.field4343));
                    if (var12 > (arg1 + arg2)) {
                        var12 = arg2 + arg1;
                    }
                    while (var12 > arg2) {
                        arg1--;
                        arg0[arg2++] = 0;
                        this.field4343++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field4346 >= var5 && this.field4346 < (var5 + ((long) var8))) {
                    var13 = this.field4346;
                } else if (this.field4346 <= var5 && var5 < ((long) this.field4352 + this.field4346)) {
                    var13 = var5;
                }
                if (var5 < (this.field4346 + ((long) this.field4352)) && ((long) var8 + var5) >= (this.field4346 + ((long) this.field4352))) {
                    var15 = (long) this.field4352 + this.field4346;
                } else if (this.field4346 < ((long) var8 + var5) && (long) this.field4352 + this.field4346 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class416.method2498(this.field4345, (int) (var13 - this.field4346), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field4343) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field4343));
                        this.field4343 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4357 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V")
    private final void method2003(byte arg0) throws IOException {
        int var2 = 106 % ((-arg0 - 89) / 33);
        field4350++;
        if (this.field4346 == -1L) {
            return;
        }
        if (this.field4357 != this.field4346) {
            this.field4344.method822(this.field4346, -27095);
            this.field4357 = this.field4346;
        }
        this.field4344.method818(this.field4352, (byte) -116, this.field4345, 0);
        this.field4357 += this.field4352;
        if (this.field4355 < this.field4357) {
            this.field4355 = this.field4357;
        }
        long var3 = -1L;
        long var5 = -1L;
        if (this.field4353 <= this.field4346 && ((long) this.field4340 + this.field4353) > this.field4346) {
            var3 = this.field4346;
        } else if (this.field4346 <= this.field4353 && this.field4353 < (this.field4346 + ((long) this.field4352))) {
            var3 = this.field4353;
        }
        if (((long) this.field4352 + this.field4346) > this.field4353 && ((long) this.field4340 + this.field4353) >= ((long) this.field4352 + this.field4346)) {
            var5 = this.field4346 + ((long) this.field4352);
        } else if (this.field4346 < (this.field4353 + ((long) this.field4340)) && ((long) this.field4352 + this.field4346) >= (this.field4353 + ((long) this.field4340))) {
            var5 = (long) this.field4340 + this.field4353;
        }
        if (var3 > -1L && var3 < var5) {
            int var7 = (int) (var5 - var3);
            class416.method2498(this.field4345, (int) (var3 - this.field4346), this.field4348, (int) (var3 - this.field4353), var7);
        }
        this.field4352 = 0;
        this.field4346 = -1L;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I[B)V")
    public final void method2004(int arg0, byte[] arg1) throws IOException {
        if (arg0 == 10852) {
            field4354++;
            this.method2002(arg1, arg1.length, 0, false);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IJ)V")
    public final void method2005(int arg0, long arg1) throws IOException {
        field4341++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2001((byte) 35));
        }
        this.field4343 = arg1;
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(B)V")
    public static void method2006(byte arg0) {
        field4360 = null;
        field4359 = null;
        if (arg0 <= 109) {
            method2006((byte) -2);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z[BII)V")
    public final void method2007(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0) {
            this.field4347 = 116L;
        }
        field4351++;
        try {
            if (this.field4347 < (long) arg2 + this.field4343) {
                this.field4347 = (long) arg2 + this.field4343;
            }
            if (this.field4346 != -1L && (this.field4343 < this.field4346 || this.field4343 > (this.field4346 + ((long) this.field4352)))) {
                this.method2003((byte) 82);
            }
            if (this.field4346 != -1L && (long) this.field4345.length + this.field4346 < this.field4343 - -((long) arg2)) {
                int var5 = (int) ((long) this.field4345.length + this.field4346 - this.field4343);
                class416.method2498(arg1, arg3, this.field4345, (int) (this.field4343 - this.field4346), var5);
                arg3 += var5;
                arg2 -= var5;
                this.field4343 += var5;
                this.field4352 = this.field4345.length;
                this.method2003((byte) 90);
            }
            if (this.field4345.length < arg2) {
                if (this.field4357 != this.field4343) {
                    this.field4344.method822(this.field4343, -27095);
                    this.field4357 = this.field4343;
                }
                this.field4344.method818(arg2, (byte) -126, arg1, arg3);
                this.field4357 += arg2;
                if (this.field4355 < this.field4357) {
                    this.field4355 = this.field4357;
                }
                long var6 = -1L;
                if (this.field4353 <= this.field4343 && (this.field4353 + ((long) this.field4340)) > this.field4343) {
                    var6 = this.field4343;
                } else if (this.field4343 <= this.field4353 && (long) arg2 + this.field4343 > this.field4353) {
                    var6 = this.field4353;
                }
                long var8 = -1L;
                if (this.field4353 < (long) arg2 + this.field4343 && (long) this.field4340 + this.field4353 >= (long) arg2 + this.field4343) {
                    var8 = (long) arg2 + this.field4343;
                } else if (this.field4343 < ((long) this.field4340 + this.field4353) && (long) arg2 + this.field4343 >= (long) this.field4340 + this.field4353) {
                    var8 = (long) this.field4340 + this.field4353;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class416.method2498(arg1, (int) ((long) arg3 + var6 - this.field4343), this.field4348, (int) (var6 - this.field4353), var10);
                }
                this.field4343 += arg2;
            } else if (arg2 > 0) {
                if (this.field4346 == -1L) {
                    this.field4346 = this.field4343;
                }
                class416.method2498(arg1, arg3, this.field4345, (int) (this.field4343 - this.field4346), arg2);
                this.field4343 += arg2;
                if ((this.field4343 - this.field4346) > ((long) this.field4352)) {
                    this.field4352 = (int) (this.field4343 - this.field4346);
                }
            }
        } catch (IOException var12) {
            this.field4357 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lvr;II)V")
    public class323(class116 arg0, int arg1, int arg2) throws IOException {
        this.field4344 = arg0;
        this.field4347 = this.field4355 = arg0.method817(-2826);
        this.field4348 = new byte[arg1];
        this.field4343 = 0L;
        this.field4345 = new byte[arg2];
    }
}
