import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class332 {

    @OriginalMember(owner = "client!ofa", name = "q", descriptor = "J")
    private long field4484 = -1L;

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "J")
    private long field4480 = -1L;

    @OriginalMember(owner = "client!ofa", name = "v", descriptor = "I")
    private int field4489 = 0;

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "Lvl;")
    private class13 field4478;

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "J")
    private long field4476;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "J")
    private long field4473;

    @OriginalMember(owner = "client!ofa", name = "t", descriptor = "J")
    private long field4487;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "[B")
    private byte[] field4469;

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "[B")
    private byte[] field4477;

    @OriginalMember(owner = "client!ofa", name = "r", descriptor = "Lkba;")
    public static class108 field4485 = new class108();

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ofa", name = "l", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ofa", name = "s", descriptor = "I")
    private int field4486;

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "J")
    private long field4471;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "([BI)V", line = 3)
    public final void method1962(byte[] arg0, int arg1) throws IOException {
        this.method1969(arg1, arg0, arg1 - 12913, arg0.length);
        field4488++;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V", line = 11)
    public final void method1963(byte arg0) throws IOException {
        this.method1965(-1);
        field4483++;
        this.field4478.method51(true);
        if (arg0 >= -28) {
            this.field4471 = -117L;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)Ljava/io/File;", line = 24)
    private final File method1964(byte arg0) {
        if (arg0 > -121) {
            this.method1967(true);
        }
        field4475++;
        return this.field4478.method47((byte) 3);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V", line = 35)
    private final void method1965(int arg0) throws IOException {
        if ((long) arg0 != this.field4480) {
            if (this.field4480 != this.field4471) {
                this.field4478.method48((byte) 97, this.field4480);
                this.field4471 = this.field4480;
            }
            this.field4478.method53(this.field4477, 4657, 0, this.field4489);
            this.field4471 += this.field4489;
            if (this.field4471 > this.field4476) {
                this.field4476 = this.field4471;
            }
            long var2 = -1L;
            if (this.field4484 <= this.field4480 && this.field4480 < (long) this.field4486 + this.field4484) {
                var2 = this.field4480;
            } else if (this.field4480 <= this.field4484 && this.field4484 < ((long) this.field4489 + this.field4480)) {
                var2 = this.field4484;
            }
            long var4 = -1L;
            if (((long) this.field4489 + this.field4480) > this.field4484 && (long) this.field4489 + this.field4480 <= (long) this.field4486 + this.field4484) {
                var4 = (long) this.field4489 + this.field4480;
            } else if (this.field4480 < ((long) this.field4486 + this.field4484) && ((long) this.field4489 + this.field4480) >= ((long) this.field4486 + this.field4484)) {
                var4 = (long) this.field4486 + this.field4484;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class373.method2194(this.field4477, (int) (var2 - this.field4480), this.field4469, (int) (var2 - this.field4484), var6);
            }
            this.field4489 = 0;
            this.field4480 = -1L;
        }
        field4479++;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(JI)V", line = 114)
    public final void method1966(long arg0, int arg1) throws IOException {
        field4481++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1964((byte) -127));
        }
        this.field4487 = arg0;
        if (arg1 != 0) {
            this.field4480 = 78L;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)J", line = 133)
    public final long method1967(boolean arg0) {
        field4472++;
        if (!arg0) {
            method1971(true);
        }
        return this.field4473;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)V", line = 150)
    public static final void method1968(int arg0, int arg1, int arg2) {
        field4468++;
        class252 var3 = class150.method916(arg0, -113, arg1);
        var3.method1502((byte) -103);
        var3.field3251 = arg2;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I[BII)V", line = 168)
    public final void method1969(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4470++;
        try {
            if (arg1.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (arg2 != -12913) {
                return;
            }
            if (this.field4480 != -1L && this.field4480 <= this.field4487 && ((long) arg3 + this.field4487) <= (this.field4480 + ((long) this.field4489))) {
                class373.method2194(this.field4477, (int) (this.field4487 - this.field4480), arg1, arg0, arg3);
                this.field4487 += arg3;
                return;
            }
            long var5 = this.field4487;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field4487 >= this.field4484 && ((long) this.field4486 + this.field4484) > this.field4487) {
                int var9 = (int) ((long) this.field4486 + this.field4484 - this.field4487);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class373.method2194(this.field4469, (int) (this.field4487 - this.field4484), arg1, arg0, var9);
                arg0 += var9;
                this.field4487 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field4469.length) {
                this.field4478.method48((byte) -121, this.field4487);
                this.field4471 = this.field4487;
                while (arg3 > 0) {
                    int var11 = this.field4478.method50(arg3, (byte) -26, arg0, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 += var11;
                    this.field4471 += var11;
                    arg3 -= var11;
                    this.field4487 += var11;
                }
            } else if (arg3 > 0) {
                this.method1970((byte) 113);
                int var10 = arg3;
                if (this.field4486 < arg3) {
                    var10 = this.field4486;
                }
                class373.method2194(this.field4469, 0, arg1, arg0, var10);
                arg0 += var10;
                arg3 -= var10;
                this.field4487 += var10;
            }
            if (this.field4480 != -1L) {
                if (this.field4487 < this.field4480 && arg3 > 0) {
                    int var12 = (int) (this.field4480 - this.field4487) + arg0;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        arg3--;
                        this.field4487++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field4480 && (long) var8 + var5 > this.field4480) {
                    var13 = this.field4480;
                } else if (var5 >= this.field4480 && var5 < (long) this.field4489 + this.field4480) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field4489 + this.field4480 && (long) this.field4489 + this.field4480 <= (long) var8 + var5) {
                    var15 = this.field4480 + ((long) this.field4489);
                } else if (((long) var8 + var5) > this.field4480 && (var5 + ((long) var8)) <= ((long) this.field4489 + this.field4480)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class373.method2194(this.field4477, (int) (var13 - this.field4480), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field4487) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field4487));
                        this.field4487 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4471 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(B)V", line = 349)
    private final void method1970(byte arg0) throws IOException {
        field4482++;
        this.field4486 = 0;
        if (this.field4487 != this.field4471) {
            this.field4478.method48((byte) -74, this.field4487);
            this.field4471 = this.field4487;
        }
        this.field4484 = this.field4487;
        if (arg0 != 113) {
            this.method1964((byte) 120);
        }
        while (this.field4486 < this.field4469.length) {
            int var2 = this.field4469.length - this.field4486;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4478.method50(var2, (byte) -26, this.field4486, this.field4469);
            if (var3 == -1) {
                break;
            }
            this.field4471 += var3;
            this.field4486 += var3;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(Z)V", line = 394)
    public static void method1971(boolean arg0) {
        if (arg0) {
            field4485 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III[B)V", line = 409)
    public final void method1972(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4474++;
        try {
            if (((long) arg0 + this.field4487) > this.field4473) {
                this.field4473 = this.field4487 + ((long) arg0);
            }
            if (this.field4480 != -1L && (this.field4487 < this.field4480 || this.field4487 > ((long) this.field4489 + this.field4480))) {
                this.method1965(-1);
            }
            if ((long) arg2 != this.field4480 && ((long) this.field4477.length + this.field4480) < ((long) arg0 + this.field4487)) {
                int var5 = (int) ((long) this.field4477.length - (this.field4487 - this.field4480));
                class373.method2194(arg3, arg1, this.field4477, (int) (this.field4487 - this.field4480), var5);
                this.field4487 += var5;
                arg1 += var5;
                arg0 -= var5;
                this.field4489 = this.field4477.length;
                this.method1965(-1);
            }
            if (arg0 > this.field4477.length) {
                if (this.field4487 != this.field4471) {
                    this.field4478.method48((byte) -23, this.field4487);
                    this.field4471 = this.field4487;
                }
                this.field4478.method53(arg3, arg2 + 4658, arg1, arg0);
                this.field4471 += arg0;
                if (this.field4476 < this.field4471) {
                    this.field4476 = this.field4471;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field4484 <= this.field4487 && this.field4484 + ((long) this.field4486) > this.field4487) {
                    var6 = this.field4487;
                } else if (this.field4484 >= this.field4487 && (long) arg0 + this.field4487 > this.field4484) {
                    var6 = this.field4484;
                }
                if (this.field4484 < this.field4487 + ((long) arg0) && ((long) this.field4486 + this.field4484) >= ((long) arg0 + this.field4487)) {
                    var8 = (long) arg0 + this.field4487;
                } else if (this.field4487 < (long) this.field4486 + this.field4484 && ((long) this.field4486 + this.field4484) <= ((long) arg0 + this.field4487)) {
                    var8 = this.field4484 + ((long) this.field4486);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class373.method2194(arg3, (int) (var6 + (long) arg1 - this.field4487), this.field4469, (int) (var6 - this.field4484), var10);
                }
                this.field4487 += arg0;
            } else if (arg0 > 0) {
                if (this.field4480 == -1L) {
                    this.field4480 = this.field4487;
                }
                class373.method2194(arg3, arg1, this.field4477, (int) (this.field4487 - this.field4480), arg0);
                this.field4487 += arg0;
                if (((long) this.field4489) < (this.field4487 - this.field4480)) {
                    this.field4489 = (int) (this.field4487 - this.field4480);
                }
            }
        } catch (IOException var12) {
            this.field4471 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lvl;II)V", line = 551)
    public class332(class13 arg0, int arg1, int arg2) throws IOException {
        this.field4478 = arg0;
        this.field4473 = this.field4476 = arg0.method49((byte) -65);
        this.field4487 = 0L;
        this.field4469 = new byte[arg1];
        this.field4477 = new byte[arg2];
    }
}
