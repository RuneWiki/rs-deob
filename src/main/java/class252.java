import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class252 {

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "J")
    private long field4447 = -1L;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "J")
    private long field4459 = -1L;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    private int field4464 = 0;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Lhe;")
    private class191 field4448;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "J")
    private long field4467;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "J")
    private long field4449;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "J")
    private long field4454;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "[B")
    private byte[] field4470;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[B")
    private byte[] field4469;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field4463 = 0;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field4456 = 0;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "[I")
    public static int[] field4460 = new int[32];

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lqj;")
    private static class196 field4446 = class80.method502("Prepared sound engine", -48);

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "Lqj;")
    public static class196 field4471 = field4446;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lqj;")
    public static class196 field4452 = class80.method502(" GMT", -48);

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field4451 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "J")
    private long field4457;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method1698(boolean arg0) {
        field4471 = null;
        field4446 = null;
        field4460 = null;
        if (!arg0) {
            method1708(-62, null);
        }
        field4452 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([BZII)V")
    public final void method1699(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field4458++;
        try {
            if (this.field4449 < (long) arg2 + this.field4454) {
                this.field4449 = (long) arg2 + this.field4454;
            }
            if (this.field4447 != -1L && (this.field4454 < this.field4447 || (long) this.field4464 + this.field4447 < this.field4454)) {
                this.method1709(true);
            }
            if (this.field4447 != -1L && (long) arg2 + this.field4454 > (long) this.field4470.length + this.field4447) {
                int var5 = (int) (this.field4447 + (long) this.field4470.length - this.field4454);
                arg2 -= var5;
                class37.method185(arg0, arg3, this.field4470, (int) (this.field4454 - this.field4447), var5);
                this.field4454 += var5;
                arg3 += var5;
                this.field4464 = this.field4470.length;
                this.method1709(true);
            }
            if (arg2 > this.field4470.length) {
                long var6 = -1L;
                if (this.field4457 != this.field4454) {
                    this.field4448.method1264(-115, this.field4454);
                    this.field4457 = this.field4454;
                }
                this.field4448.method1267(arg3, arg2, arg0, -120);
                this.field4457 += arg2;
                if (this.field4459 < (long) arg2 + this.field4454 && (long) arg2 + this.field4454 <= (long) this.field4445 + this.field4459) {
                    var6 = (long) arg2 + this.field4454;
                } else if ((long) this.field4445 + this.field4459 > this.field4454 && (long) arg2 + this.field4454 >= (long) this.field4445 + this.field4459) {
                    var6 = (long) this.field4445 + this.field4459;
                }
                if (this.field4467 < this.field4457) {
                    this.field4467 = this.field4457;
                }
                long var8 = -1L;
                if (this.field4454 >= this.field4459 && (long) this.field4445 + this.field4459 > this.field4454) {
                    var8 = this.field4454;
                } else if (this.field4459 >= this.field4454 && this.field4459 < (long) arg2 + this.field4454) {
                    var8 = this.field4459;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class37.method185(arg0, (int) ((long) arg3 + var8 - this.field4454), this.field4469, (int) (var8 - this.field4459), var10);
                }
                this.field4454 += arg2;
                return;
            }
            if (arg2 > 0) {
                if (this.field4447 == -1L) {
                    this.field4447 = this.field4454;
                }
                class37.method185(arg0, arg3, this.field4470, (int) (this.field4454 - this.field4447), arg2);
                this.field4454 += arg2;
                if (this.field4454 - this.field4447 > (long) this.field4464) {
                    this.field4464 = (int) (this.field4454 - this.field4447);
                }
                return;
            }
        } catch (IOException var12) {
            this.field4457 = -1L;
            throw var12;
        }
        if (!arg1) {
            this.method1701((byte) -84);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg7 && arg2 == arg6 && arg4 == arg9 && arg0 == arg1) {
            class212.method1469(arg5, -1, arg2, arg0, arg3, arg4);
        } else {
            int var10 = arg3;
            int var11 = arg2;
            int var12 = arg3 * 3;
            int var13 = arg2 * 3;
            int var14 = arg9 * 3;
            int var15 = arg7 * 3;
            int var16 = arg6 * 3;
            int var17 = arg1 * 3;
            int var18 = arg4 + var15 - arg3 - var14;
            int var19 = var12 + var14 - var15 - var15;
            int var20 = arg0 + var16 - var17 - arg2;
            int var21 = var17 + var13 - var16 - var16;
            int var22 = var15 - var12;
            int var23 = var16 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var26;
                int var29 = var19 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg2 + (var28 + var30 + var32 >> 12);
                int var34 = arg3 + (var27 + var29 + var31 >> 12);
                class212.method1469(arg5, -1, var11, var33, var10, var34);
                var10 = var34;
                var11 = var33;
            }
        }
        if (arg8 <= 31) {
            method1698(true);
        }
        field4453++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method1701(byte arg0) {
        field4466++;
        return arg0 == 1 ? this.field4448.method1262(arg0 + 31401) : null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[BI)V")
    public final void method1702(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4473++;
        try {
            if (arg1 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field4447 != -1L && this.field4454 >= this.field4447 && (long) arg1 + this.field4454 <= (long) this.field4464 + this.field4447) {
                class37.method185(this.field4470, (int) (this.field4454 - this.field4447), arg2, arg3, arg1);
                this.field4454 += arg1;
                return;
            }
            long var5 = this.field4454;
            int var7 = arg3;
            if (arg0 != 0) {
                this.field4459 = 103L;
            }
            int var8 = arg1;
            if (this.field4459 <= this.field4454 && this.field4454 < this.field4459 + (long) this.field4445) {
                int var9 = (int) (this.field4459 + (long) this.field4445 - this.field4454);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class37.method185(this.field4469, (int) (this.field4454 - this.field4459), arg2, arg3, var9);
                arg3 += var9;
                arg1 -= var9;
                this.field4454 += var9;
            }
            if (this.field4469.length < arg1) {
                this.field4448.method1264(-117, this.field4454);
                this.field4457 = this.field4454;
                while (arg1 > 0) {
                    int var11 = this.field4448.method1265(arg3, arg1, arg2, 121);
                    if (var11 == -1) {
                        break;
                    }
                    this.field4454 += var11;
                    arg3 += var11;
                    arg1 -= var11;
                    this.field4457 += var11;
                }
            } else if (arg1 > 0) {
                this.method1706(-1);
                int var10 = arg1;
                if (arg1 > this.field4445) {
                    var10 = this.field4445;
                }
                arg1 -= var10;
                class37.method185(this.field4469, 0, arg2, arg3, var10);
                arg3 += var10;
                this.field4454 += var10;
            }
            if (this.field4447 != -1L) {
                if (this.field4454 < this.field4447 && arg1 > 0) {
                    int var12 = (int) (this.field4447 - this.field4454) + arg3;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1--;
                        arg2[arg3++] = 0;
                        this.field4454++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field4447 >= var5 && (long) var8 + var5 > this.field4447) {
                    var13 = this.field4447;
                } else if (var5 >= this.field4447 && (long) this.field4464 + this.field4447 > var5) {
                    var13 = var5;
                }
                if (this.field4447 + (long) this.field4464 > var5 && (long) this.field4464 + this.field4447 <= (long) var8 + var5) {
                    var15 = this.field4447 + (long) this.field4464;
                } else if ((long) var8 + var5 > this.field4447 && this.field4447 + (long) this.field4464 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class37.method185(this.field4470, (int) (var13 - this.field4447), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field4454 < var15) {
                        arg1 = (int) ((long) arg1 + this.field4454 - var15);
                        this.field4454 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4457 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)J")
    public final long method1703(int arg0) {
        field4450++;
        if (arg0 >= -114) {
            this.field4459 = -45L;
        }
        return this.field4449;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BJ)V")
    public final void method1704(byte arg0, long arg1) throws IOException {
        if (arg0 <= 108) {
            this.method1701((byte) -71);
        }
        field4465++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1701((byte) 1));
        }
        this.field4454 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([BB)V")
    public final void method1705(byte[] arg0, byte arg1) throws IOException {
        this.method1702(0, arg0.length, arg0, 0);
        field4462++;
        if (arg1 >= -35) {
            this.method1701((byte) -113);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    private final void method1706(int arg0) throws IOException {
        if (arg0 != -1) {
            method1708(-109, null);
        }
        this.field4445 = 0;
        if (this.field4457 != this.field4454) {
            this.field4448.method1264(-126, this.field4454);
            this.field4457 = this.field4454;
        }
        field4472++;
        this.field4459 = this.field4454;
        while (this.field4445 < this.field4469.length) {
            int var2 = this.field4469.length - this.field4445;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4448.method1265(this.field4445, var2, this.field4469, arg0 ^ 0xFFFFFF80);
            if (var3 == -1) {
                break;
            }
            this.field4457 += var3;
            this.field4445 += var3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public final void method1707(int arg0) throws IOException {
        field4468++;
        this.method1709(true);
        this.field4448.method1263(115);
        if (arg0 != 0) {
            field4461 = 124;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILp;)Lph;")
    public static final class62 method1708(int arg0, class56 arg1) {
        field4455++;
        if (arg0 >= -83) {
            method1698(true);
        }
        return new class62(arg1.method338((byte) 123), arg1.method338((byte) 118), arg1.method338((byte) 113), arg1.method338((byte) 101), arg1.method328(-1974), arg1.method328(-1974), arg1.method367(1));
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    private final void method1709(boolean arg0) throws IOException {
        if (this.field4447 != -1L) {
            if (this.field4457 != this.field4447) {
                this.field4448.method1264(-125, this.field4447);
                this.field4457 = this.field4447;
            }
            this.field4448.method1267(0, this.field4464, this.field4470, -121);
            this.field4457 += this.field4464;
            if (this.field4457 > this.field4467) {
                this.field4467 = this.field4457;
            }
            long var2 = -1L;
            if (this.field4447 >= this.field4459 && this.field4447 < (long) this.field4445 + this.field4459) {
                var2 = this.field4447;
            } else if (this.field4459 >= this.field4447 && (long) this.field4464 + this.field4447 > this.field4459) {
                var2 = this.field4459;
            }
            long var4 = -1L;
            if (this.field4459 < (long) this.field4464 + this.field4447 && (long) this.field4445 + this.field4459 >= (long) this.field4464 + this.field4447) {
                var4 = (long) this.field4464 + this.field4447;
            } else if ((long) this.field4445 + this.field4459 > this.field4447 && (long) this.field4464 + this.field4447 >= this.field4459 - -((long) this.field4445)) {
                var4 = (long) this.field4445 + this.field4459;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class37.method185(this.field4470, (int) (var2 - this.field4447), this.field4469, (int) (var2 - this.field4459), var6);
            }
            this.field4447 = -1L;
            this.field4464 = 0;
        }
        field4444++;
        if (!arg0) {
            this.method1701((byte) -54);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lhe;II)V")
    public class252(class191 arg0, int arg1, int arg2) throws IOException {
        this.field4448 = arg0;
        this.field4449 = this.field4467 = arg0.method1266(true);
        this.field4454 = 0L;
        this.field4470 = new byte[arg2];
        this.field4469 = new byte[arg1];
    }
}
