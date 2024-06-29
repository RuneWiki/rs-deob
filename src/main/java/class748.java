import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class748 {

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "J")
    private long field10453 = -1L;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "J")
    private long field10466 = -1L;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    private int field10462 = 0;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Ldq;")
    private class700 field10456;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "J")
    private long field10458;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "J")
    private long field10467;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "[B")
    private byte[] field10468;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "J")
    private long field10450;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "[B")
    private byte[] field10452;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field10447;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    private int field10449;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field10455;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field10459;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field10460;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field10461;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field10464;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "J")
    private long field10454;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "Lnd;")
    public static class547 field10463;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Lwo;")
    public static class746 field10451;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    private final void method4160(byte arg0) throws IOException {
        if (arg0 < 48) {
            this.field10458 = 96L;
        }
        field10464++;
        if (this.field10466 == -1L) {
            return;
        }
        if (this.field10466 != this.field10454) {
            this.field10456.method3940(this.field10466, false);
            this.field10454 = this.field10466;
        }
        this.field10456.method3937(-14430, 0, this.field10462, this.field10452);
        this.field10454 += this.field10462;
        if (this.field10454 > this.field10458) {
            this.field10458 = this.field10454;
        }
        long var2 = -1L;
        if (this.field10466 >= this.field10453 && ((long) this.field10449 + this.field10453) > this.field10466) {
            var2 = this.field10466;
        } else if (this.field10466 <= this.field10453 && this.field10453 < ((long) this.field10462 + this.field10466)) {
            var2 = this.field10453;
        }
        long var4 = -1L;
        if (this.field10453 < this.field10466 + ((long) this.field10462) && ((long) this.field10462 + this.field10466) <= ((long) this.field10449 + this.field10453)) {
            var4 = (long) this.field10462 + this.field10466;
        } else if ((this.field10453 + ((long) this.field10449)) > this.field10466 && (this.field10453 + ((long) this.field10449)) <= ((long) this.field10462 + this.field10466)) {
            var4 = this.field10453 + ((long) this.field10449);
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class135.method999(this.field10452, (int) (var2 - this.field10466), this.field10468, (int) (var2 - this.field10453), var6);
        }
        this.field10466 = -1L;
        this.field10462 = 0;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[BII)V")
    public final void method4161(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field10460++;
        try {
            if (this.field10467 < this.field10450 + ((long) arg3)) {
                this.field10467 = (long) arg3 + this.field10450;
            }
            if (this.field10466 != -1L && (this.field10466 > this.field10450 || this.field10450 > (this.field10466 + ((long) this.field10462)))) {
                this.method4160((byte) 58);
            }
            if (this.field10466 != -1L && ((long) this.field10452.length + this.field10466) < ((long) arg3 + this.field10450)) {
                int var5 = (int) ((long) this.field10452.length + this.field10466 - this.field10450);
                class135.method999(arg1, arg0, this.field10452, (int) (this.field10450 - this.field10466), var5);
                arg0 += var5;
                arg3 -= var5;
                this.field10450 += var5;
                this.field10462 = this.field10452.length;
                this.method4160((byte) 58);
            }
            if (arg3 > this.field10452.length) {
                if (this.field10454 != this.field10450) {
                    this.field10456.method3940(this.field10450, false);
                    this.field10454 = this.field10450;
                }
                this.field10456.method3937(-14430, arg0, arg3, arg1);
                this.field10454 += arg3;
                if (this.field10458 < this.field10454) {
                    this.field10458 = this.field10454;
                }
                long var6 = -1L;
                if (this.field10450 >= this.field10453 && this.field10450 < (long) this.field10449 + this.field10453) {
                    var6 = this.field10450;
                } else if (this.field10453 >= this.field10450 && this.field10453 < (long) arg3 + this.field10450) {
                    var6 = this.field10453;
                }
                long var8 = -1L;
                if (this.field10453 < ((long) arg3 + this.field10450) && (this.field10450 + ((long) arg3)) <= ((long) this.field10449 + this.field10453)) {
                    var8 = (long) arg3 + this.field10450;
                } else if (this.field10450 < this.field10453 + ((long) this.field10449) && (long) this.field10449 + this.field10453 <= (long) arg3 + this.field10450) {
                    var8 = (long) this.field10449 + this.field10453;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class135.method999(arg1, (int) ((long) arg0 + var6 - this.field10450), this.field10468, (int) (var6 - this.field10453), var10);
                }
                this.field10450 += arg3;
                return;
            }
            if (arg3 > 0) {
                if (this.field10466 == -1L) {
                    this.field10466 = this.field10450;
                }
                class135.method999(arg1, arg0, this.field10452, (int) (this.field10450 - this.field10466), arg3);
                this.field10450 += arg3;
                if ((long) this.field10462 < this.field10450 - this.field10466) {
                    this.field10462 = (int) (this.field10450 - this.field10466);
                }
                return;
            }
        } catch (IOException var12) {
            this.field10454 = -1L;
            throw var12;
        }
        if (arg2 != 22609) {
            this.method4165(122);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
    public static void method4162(byte arg0) {
        field10451 = null;
        int var1 = 107 / ((arg0 - 69) / 50);
        field10463 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(JI)V")
    public final void method4163(long arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            return;
        }
        field10457++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4166(arg1 - 106));
        }
        this.field10450 = arg0;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V")
    private final void method4164(byte arg0) throws IOException {
        this.field10449 = 0;
        field10459++;
        if (this.field10454 != this.field10450) {
            this.field10456.method3940(this.field10450, false);
            this.field10454 = this.field10450;
        }
        if (arg0 <= 65) {
            return;
        }
        this.field10453 = this.field10450;
        while (this.field10449 < this.field10468.length) {
            int var2 = this.field10468.length - this.field10449;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field10456.method3938(false, this.field10468, this.field10449, var2);
            if (var3 == -1) {
                break;
            }
            this.field10454 += var3;
            this.field10449 += var3;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)J")
    public final long method4165(int arg0) {
        if (arg0 != 0) {
            this.field10449 = 92;
        }
        field10447++;
        return this.field10467;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method4166(int arg0) {
        if (arg0 >= -39) {
            this.field10462 = -83;
        }
        field10465++;
        return this.field10456.method3935(-97);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[B)V")
    public final void method4167(int arg0, byte[] arg1) throws IOException {
        if (arg0 >= 29) {
            field10455++;
            this.method4169(0, arg1.length, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)V")
    public final void method4168(byte arg0) throws IOException {
        field10461++;
        this.method4160((byte) 51);
        if (arg0 == -122) {
            this.field10456.method3941(true);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[BI)V")
    public final void method4169(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field10448++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg2.length);
            }
            if (this.field10466 != -1L && this.field10450 >= this.field10466 && ((long) arg1 + this.field10450) <= (this.field10466 + ((long) this.field10462))) {
                class135.method999(this.field10452, (int) (this.field10450 - this.field10466), arg2, arg0, arg1);
                this.field10450 += arg1;
                return;
            }
            long var5 = this.field10450;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field10450 >= this.field10453 && this.field10450 < ((long) this.field10449 + this.field10453)) {
                int var9 = (int) (this.field10453 + (long) this.field10449 - this.field10450);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class135.method999(this.field10468, (int) (this.field10450 - this.field10453), arg2, arg0, var9);
                this.field10450 += var9;
                arg0 += var9;
                arg1 -= var9;
            }
            if (this.field10468.length < arg1) {
                this.field10456.method3940(this.field10450, false);
                this.field10454 = this.field10450;
                while (arg1 > 0) {
                    int var10 = this.field10456.method3938(false, arg2, arg0, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 -= var10;
                    this.field10454 += var10;
                    this.field10450 += var10;
                    arg0 += var10;
                }
            } else if (arg1 > 0) {
                this.method4164((byte) 103);
                int var11 = arg1;
                if (this.field10449 < arg1) {
                    var11 = this.field10449;
                }
                class135.method999(this.field10468, 0, arg2, arg0, var11);
                this.field10450 += var11;
                arg0 += var11;
                arg1 -= var11;
            }
            if (this.field10466 != -1L) {
                if (this.field10450 < this.field10466 && arg1 > 0) {
                    int var12 = (int) (this.field10466 - this.field10450) + arg0;
                    if ((arg0 + arg1) < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg2[arg0++] = 0;
                        arg1--;
                        this.field10450++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field10466 && this.field10466 < (long) var8 + var5) {
                    var13 = this.field10466;
                } else if (this.field10466 <= var5 && var5 < (long) this.field10462 + this.field10466) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (this.field10466 + ((long) this.field10462)) && (this.field10466 + ((long) this.field10462)) <= ((long) var8 + var5)) {
                    var15 = this.field10466 + ((long) this.field10462);
                } else if ((long) var8 + var5 > this.field10466 && ((long) this.field10462 + this.field10466) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class135.method999(this.field10452, (int) (var13 - this.field10466), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field10450) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field10450));
                        this.field10450 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field10454 = -1L;
            throw var19;
        }
        if (arg3 > ~arg1) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ldq;II)V")
    public class748(class700 arg0, int arg1, int arg2) throws IOException {
        this.field10456 = arg0;
        this.field10467 = this.field10458 = arg0.method3939((byte) 111);
        this.field10468 = new byte[arg1];
        this.field10450 = 0L;
        this.field10452 = new byte[arg2];
    }
}
