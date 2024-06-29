import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class245 {

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    private int field4408 = 0;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "J")
    private long field4406 = -1L;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "J")
    private long field4422 = -1L;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "Lfg;")
    private class12 field4423;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "J")
    private long field4401;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "J")
    private long field4404;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "[B")
    private byte[] field4410;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "J")
    private long field4421;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "[B")
    private byte[] field4396;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field4398 = 0;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static volatile int field4402 = -1;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "Lcf;")
    public static class93 field4414 = null;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4419 = 0;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field4425 = 0;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    private int field4413;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "J")
    private long field4409;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([BIII)V")
    public final void method1660(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4416++;
        try {
            if (arg1 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (arg2 < 77) {
                field4419 = -3;
            }
            if (this.field4422 != -1L && this.field4422 <= this.field4421 && ((long) this.field4408 + this.field4422) >= (this.field4421 + ((long) arg3))) {
                class107.method770(this.field4410, (int) (this.field4421 - this.field4422), arg0, arg1, arg3);
                this.field4421 += (long) arg3;
                return;
            }
            int var5 = arg3;
            long var6 = this.field4421;
            int var8 = arg1;
            if (this.field4421 >= this.field4406 && (long) this.field4413 + this.field4406 > this.field4421) {
                int var9 = (int) ((long) this.field4413 + this.field4406 - this.field4421);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class107.method770(this.field4396, (int) (this.field4421 - this.field4406), arg0, arg1, var9);
                arg1 += var9;
                this.field4421 += (long) var9;
                arg3 -= var9;
            }
            if (this.field4396.length < arg3) {
                this.field4423.method54(true, this.field4421);
                this.field4409 = this.field4421;
                while (arg3 > 0) {
                    int var10 = this.field4423.method49(arg1, false, arg0, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field4421 += (long) var10;
                    arg1 += var10;
                    this.field4409 += (long) var10;
                }
            } else if (arg3 > 0) {
                this.method1664((byte) 126);
                int var11 = arg3;
                if (arg3 > this.field4413) {
                    var11 = this.field4413;
                }
                arg3 -= var11;
                class107.method770(this.field4396, 0, arg0, arg1, var11);
                this.field4421 += (long) var11;
                arg1 += var11;
            }
            if (this.field4422 != -1L) {
                if (this.field4421 < this.field4422 && arg3 > 0) {
                    int var12 = (int) (this.field4422 - this.field4421) + arg1;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg0[arg1++] = 0;
                        this.field4421++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var6 < ((long) this.field4408 + this.field4422) && ((long) var5 + var6) >= ((long) this.field4408 + this.field4422)) {
                    var13 = this.field4422 + ((long) this.field4408);
                } else if (((long) var5 + var6) > this.field4422 && ((long) this.field4408 + this.field4422) >= ((long) var5 + var6)) {
                    var13 = var6 + ((long) var5);
                }
                if (var6 <= this.field4422 && (long) var5 + var6 > this.field4422) {
                    var15 = this.field4422;
                } else if (this.field4422 <= var6 && ((long) this.field4408 + this.field4422) > var6) {
                    var15 = var6;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class107.method770(this.field4410, (int) (var15 - this.field4422), arg0, (int) (var15 - var6) + var8, var17);
                    if (var13 > this.field4421) {
                        arg3 = (int) ((long) arg3 - (var13 - this.field4421));
                        this.field4421 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4409 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V")
    public static final void method1661(boolean arg0, int arg1) {
        if (!arg0) {
            method1669(97, 35, 89, (byte) 49, 7);
        }
        field4417++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class47.method265((byte) -77);
        } else if (arg1 == 2) {
            class124.method913((byte) -107);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    public final void method1662(boolean arg0) throws IOException {
        field4403++;
        this.method1670(-1);
        this.field4423.method52(-7802);
        if (arg0) {
            method1661(false, 86);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BJ)Lcf;")
    public static final class93 method1663(byte arg0, long arg1) {
        class80.field1491.setTime(new Date(arg1));
        field4407++;
        int var3 = class80.field1491.get(7);
        int var4 = class80.field1491.get(5);
        int var5 = class80.field1491.get(2);
        int var6 = class80.field1491.get(1);
        if (arg0 != 55) {
            field4414 = null;
        }
        int var7 = class80.field1491.get(11);
        int var8 = class80.field1491.get(12);
        int var9 = class80.field1491.get(13);
        return class130.method949((byte) -77, new class93[] { class181.field3322[var3 - 1], class200.field3625, class148.method1067(arg0 ^ 0xFFFFE4AE, var4 / 10), class148.method1067(arg0 ^ 0xFFFFE4AE, var4 % 10), class152.field2672, class234.field4176[var5], class152.field2672, class148.method1067(arg0 - 7070, var6), class200.field3636, class148.method1067(-7015, var7 / 10), class148.method1067(-7015, var7 % 10), class256.field4624, class148.method1067(-7015, var8 / 10), class148.method1067(arg0 ^ 0xFFFFE4AE, var8 % 10), class256.field4624, class148.method1067(-7015, var9 / 10), class148.method1067(arg0 ^ 0xFFFFE4AE, var9 % 10), class185.field3401 });
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    private final void method1664(byte arg0) throws IOException {
        field4411++;
        if (arg0 < 122) {
            this.field4421 = 107L;
        }
        this.field4413 = 0;
        if (this.field4421 != this.field4409) {
            this.field4423.method54(true, this.field4421);
            this.field4409 = this.field4421;
        }
        this.field4406 = this.field4421;
        while (this.field4413 < this.field4396.length) {
            int var2 = this.field4396.length - this.field4413;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4423.method49(this.field4413, false, this.field4396, var2);
            if (var3 == -1) {
                break;
            }
            this.field4413 += var3;
            this.field4409 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method1665(int arg0) {
        field4405++;
        if (arg0 != 10) {
            method1668((byte) -2, -19L);
        }
        return this.field4423.method51((byte) 60);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)J")
    public final long method1666(boolean arg0) {
        if (arg0) {
            method1667((byte) 17);
        }
        field4397++;
        return this.field4404;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    public static void method1667(byte arg0) {
        field4414 = null;
        if (arg0 <= 53) {
            field4419 = 46;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(BJ)Lcf;")
    public static final class93 method1668(byte arg0, long arg1) {
        field4420++;
        if (arg0 > -48) {
            method1668((byte) -94, 98L);
        }
        return class150.method1080(arg1, 10, 126, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIBI)V")
    public static final void method1669(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 109) {
            field4402 = -116;
        }
        field4418++;
        class212 var5 = class123.method905(-1205364448, 8, arg1);
        var5.method1493(13);
        var5.field3892 = arg4;
        var5.field3889 = arg0;
        var5.field3883 = arg2;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
    private final void method1670(int arg0) throws IOException {
        field4400++;
        if ((long) arg0 == this.field4422) {
            return;
        }
        if (this.field4422 != this.field4409) {
            this.field4423.method54(true, this.field4422);
            this.field4409 = this.field4422;
        }
        this.field4423.method53(this.field4408, true, 0, this.field4410);
        long var2 = -1L;
        this.field4409 += (long) this.field4408;
        long var4 = -1L;
        if (this.field4422 >= this.field4406 && (long) this.field4413 + this.field4406 > this.field4422) {
            var2 = this.field4422;
        } else if (this.field4406 >= this.field4422 && ((long) this.field4408 + this.field4422) > this.field4406) {
            var2 = this.field4406;
        }
        if (this.field4406 < (long) this.field4408 + this.field4422 && (this.field4422 + ((long) this.field4408)) <= (this.field4406 + ((long) this.field4413))) {
            var4 = (long) this.field4408 + this.field4422;
        } else if (this.field4422 < ((long) this.field4413 + this.field4406) && (long) this.field4413 + this.field4406 <= (long) this.field4408 + this.field4422) {
            var4 = (long) this.field4413 + this.field4406;
        }
        if (this.field4401 < this.field4409) {
            this.field4401 = this.field4409;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class107.method770(this.field4410, (int) (var2 - this.field4422), this.field4396, (int) (var2 - this.field4406), var6);
        }
        this.field4422 = -1L;
        this.field4408 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JI)V")
    public final void method1671(long arg0, int arg1) throws IOException {
        field4399++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1665(10));
        }
        this.field4421 = arg0;
        if (arg1 != 4441) {
            this.field4401 = 33L;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z[BII)V")
    public final void method1672(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (!arg0) {
            return;
        }
        field4424++;
        try {
            if (((long) arg3 + this.field4421) > this.field4404) {
                this.field4404 = (long) arg3 + this.field4421;
            }
            if (this.field4422 != -1L && (this.field4422 > this.field4421 || this.field4421 > ((long) this.field4408 + this.field4422))) {
                this.method1670(-1);
            }
            if (this.field4422 != -1L && (long) arg3 + this.field4421 > (long) this.field4410.length + this.field4422) {
                int var5 = (int) (this.field4422 + (long) this.field4410.length - this.field4421);
                arg3 -= var5;
                class107.method770(arg1, arg2, this.field4410, (int) (this.field4421 - this.field4422), var5);
                arg2 += var5;
                this.field4421 += (long) var5;
                this.field4408 = this.field4410.length;
                this.method1670(-1);
            }
            if (arg3 > this.field4410.length) {
                long var6 = -1L;
                if (this.field4421 != this.field4409) {
                    this.field4423.method54(true, this.field4421);
                    this.field4409 = this.field4421;
                }
                this.field4423.method53(arg3, true, arg2, arg1);
                long var8 = -1L;
                this.field4409 += (long) arg3;
                if (this.field4409 > this.field4401) {
                    this.field4401 = this.field4409;
                }
                if (this.field4421 >= this.field4406 && this.field4421 < ((long) this.field4413 + this.field4406)) {
                    var6 = this.field4421;
                } else if (this.field4421 <= this.field4406 && (long) arg3 + this.field4421 > this.field4406) {
                    var6 = this.field4406;
                }
                if (this.field4406 < ((long) arg3 + this.field4421) && ((long) arg3 + this.field4421) <= ((long) this.field4413 + this.field4406)) {
                    var8 = this.field4421 + ((long) arg3);
                } else if (((long) this.field4413 + this.field4406) > this.field4421 && (long) arg3 + this.field4421 >= (long) this.field4413 + this.field4406) {
                    var8 = (long) this.field4413 + this.field4406;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class107.method770(arg1, (int) ((long) arg2 + var6 - this.field4421), this.field4396, (int) (var6 - this.field4406), var10);
                }
                this.field4421 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field4422 == -1L) {
                    this.field4422 = this.field4421;
                }
                class107.method770(arg1, arg2, this.field4410, (int) (this.field4421 - this.field4422), arg3);
                this.field4421 += (long) arg3;
                if ((long) this.field4408 < this.field4421 - this.field4422) {
                    this.field4408 = (int) (this.field4421 - this.field4422);
                }
            }
        } catch (IOException var12) {
            this.field4409 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([BI)V")
    public final void method1673(byte[] arg0, int arg1) throws IOException {
        this.method1660(arg0, 0, 99, arg0.length);
        field4412++;
        if (arg1 < 117) {
            method1661(true, -86);
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lfg;II)V")
    public class245(class12 arg0, int arg1, int arg2) throws IOException {
        this.field4423 = arg0;
        this.field4404 = this.field4401 = arg0.method50(true);
        this.field4410 = new byte[arg2];
        this.field4421 = 0L;
        this.field4396 = new byte[arg1];
    }
}
