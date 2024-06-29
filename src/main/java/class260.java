import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class260 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "J")
    private long field4562 = -1L;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "J")
    private long field4569 = -1L;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    private int field4570 = 0;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lne;")
    private class51 field4567;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "J")
    private long field4561;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "J")
    private long field4568;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "J")
    private long field4583;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "[B")
    private byte[] field4572;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[B")
    private byte[] field4564;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Llh;")
    public static class286 field4574 = class249.method1733(true);

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field4582 = 0;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "[Lid;")
    public static class149[] field4585 = new class149[5];

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[J")
    public static long[] field4584 = new long[500];

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field4581 = 0;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    private int field4576;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "J")
    private long field4559;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "[S")
    public static short[] field4579;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    private final void method1789(byte arg0) throws IOException {
        if (arg0 >= -118) {
            field4574 = null;
        }
        this.field4576 = 0;
        if (this.field4583 != this.field4559) {
            this.field4567.method338(0, this.field4583);
            this.field4559 = this.field4583;
        }
        this.field4562 = this.field4583;
        field4577++;
        while (this.field4576 < this.field4564.length) {
            int var2 = this.field4564.length - this.field4576;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4567.method335(var2, this.field4564, this.field4576, -1);
            if (var3 == -1) {
                break;
            }
            this.field4576 += var3;
            this.field4559 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[B)V")
    public final void method1790(int arg0, byte[] arg1) throws IOException {
        if (arg0 != 5) {
            this.field4583 = 71L;
        }
        field4566++;
        this.method1791(arg1.length, arg1, (byte) 101, 0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[BBI)V")
    public final void method1791(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field4563++;
        try {
            if (arg1.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field4569 != -1L && this.field4583 >= this.field4569 && (long) this.field4570 + this.field4569 >= (long) arg0 + this.field4583) {
                class209.method1428(this.field4572, (int) (this.field4583 - this.field4569), arg1, arg3, arg0);
                this.field4583 += (long) arg0;
                return;
            }
            int var5 = arg3;
            int var6 = 108 % ((36 - arg2) / 53);
            long var7 = this.field4583;
            int var9 = arg0;
            if (this.field4562 <= this.field4583 && this.field4583 < (this.field4562 + ((long) this.field4576))) {
                int var10 = (int) ((long) this.field4576 + this.field4562 - this.field4583);
                if (var10 > arg0) {
                    var10 = arg0;
                }
                class209.method1428(this.field4564, (int) (this.field4583 - this.field4562), arg1, arg3, var10);
                arg0 -= var10;
                this.field4583 += (long) var10;
                arg3 += var10;
            }
            if (this.field4564.length < arg0) {
                this.field4567.method338(0, this.field4583);
                this.field4559 = this.field4583;
                while (arg0 > 0) {
                    int var12 = this.field4567.method335(arg0, arg1, arg3, -1);
                    if (var12 == -1) {
                        break;
                    }
                    this.field4559 += (long) var12;
                    arg0 -= var12;
                    this.field4583 += (long) var12;
                    arg3 += var12;
                }
            } else if (arg0 > 0) {
                this.method1789((byte) -128);
                int var11 = arg0;
                if (arg0 > this.field4576) {
                    var11 = this.field4576;
                }
                class209.method1428(this.field4564, 0, arg1, arg3, var11);
                arg3 += var11;
                this.field4583 += (long) var11;
                arg0 -= var11;
            }
            if (this.field4569 != -1L) {
                if (this.field4569 > this.field4583 && arg0 > 0) {
                    int var13 = arg3 + ((int) (this.field4569 - this.field4583));
                    if (var13 > (arg0 + arg3)) {
                        var13 = arg0 + arg3;
                    }
                    while (var13 > arg3) {
                        arg0--;
                        arg1[arg3++] = 0;
                        this.field4583++;
                    }
                }
                long var14 = -1L;
                if (var7 < ((long) this.field4570 + this.field4569) && ((long) this.field4570 + this.field4569) <= ((long) var9 + var7)) {
                    var14 = (long) this.field4570 + this.field4569;
                } else if (((long) var9 + var7) > this.field4569 && (long) var9 + var7 <= (long) this.field4570 + this.field4569) {
                    var14 = (long) var9 + var7;
                }
                long var16 = -1L;
                if (this.field4569 >= var7 && this.field4569 < var7 + ((long) var9)) {
                    var16 = this.field4569;
                } else if (var7 >= this.field4569 && ((long) this.field4570 + this.field4569) > var7) {
                    var16 = var7;
                }
                if (var16 > -1L && var14 > var16) {
                    int var18 = (int) (var14 - var16);
                    class209.method1428(this.field4572, (int) (var16 - this.field4569), arg1, (int) (var16 - var7) + var5, var18);
                    if (this.field4583 < var14) {
                        arg0 = (int) ((long) arg0 - (var14 - this.field4583));
                        this.field4583 = var14;
                    }
                }
            }
        } catch (IOException var20) {
            this.field4559 = -1L;
            throw var20;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JI)V")
    public final void method1792(long arg0, int arg1) throws IOException {
        field4571++;
        if (arg1 >= -114) {
            field4579 = null;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1796(23431));
        }
        this.field4583 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)J")
    public final long method1793(int arg0) {
        field4580++;
        if (arg0 != 0) {
            method1797(84, -99, 74);
        }
        return this.field4568;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI[BI)V")
    public final void method1794(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4560++;
        try {
            if (arg0 != 50) {
                field4584 = null;
            }
            if (this.field4583 + ((long) arg3) > this.field4568) {
                this.field4568 = (long) arg3 + this.field4583;
            }
            if (this.field4569 != -1L && (this.field4583 < this.field4569 || this.field4583 > ((long) this.field4570 + this.field4569))) {
                this.method1798(-128);
            }
            if (this.field4569 != -1L && ((long) this.field4572.length + this.field4569) < (this.field4583 + ((long) arg3))) {
                int var5 = (int) (this.field4569 + (long) this.field4572.length - this.field4583);
                arg3 -= var5;
                class209.method1428(arg2, arg1, this.field4572, (int) (this.field4583 - this.field4569), var5);
                this.field4583 += (long) var5;
                this.field4570 = this.field4572.length;
                arg1 += var5;
                this.method1798(-87);
            }
            if (this.field4572.length < arg3) {
                long var6 = -1L;
                if (this.field4583 != this.field4559) {
                    this.field4567.method338(0, this.field4583);
                    this.field4559 = this.field4583;
                }
                this.field4567.method337(arg3, arg2, arg1, (byte) 125);
                if (this.field4562 <= this.field4583 && this.field4562 + ((long) this.field4576) > this.field4583) {
                    var6 = this.field4583;
                } else if (this.field4562 >= this.field4583 && this.field4562 < (long) arg3 + this.field4583) {
                    var6 = this.field4562;
                }
                this.field4559 += (long) arg3;
                if (this.field4561 < this.field4559) {
                    this.field4561 = this.field4559;
                }
                long var8 = -1L;
                if (this.field4562 < (long) arg3 + this.field4583 && ((long) arg3 + this.field4583) <= ((long) this.field4576 + this.field4562)) {
                    var8 = (long) arg3 + this.field4583;
                } else if (this.field4583 < (long) this.field4576 + this.field4562 && this.field4562 + ((long) this.field4576) <= (long) arg3 + this.field4583) {
                    var8 = (long) this.field4576 + this.field4562;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class209.method1428(arg2, (int) ((long) arg1 + var6 - this.field4583), this.field4564, (int) (var6 - this.field4562), var10);
                }
                this.field4583 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field4569 == -1L) {
                    this.field4569 = this.field4583;
                }
                class209.method1428(arg2, arg1, this.field4572, (int) (this.field4583 - this.field4569), arg3);
                this.field4583 += (long) arg3;
                if (this.field4583 - this.field4569 > (long) this.field4570) {
                    this.field4570 = (int) (this.field4583 - this.field4569);
                }
            }
        } catch (IOException var12) {
            this.field4559 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public final void method1795(int arg0) throws IOException {
        this.method1798(-125);
        this.field4567.method336(arg0 + 2274);
        field4573++;
        if (arg0 != -2275) {
            this.method1793(-30);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method1796(int arg0) {
        field4565++;
        if (arg0 != 23431) {
            field4579 = null;
        }
        return this.field4567.method340((byte) -94);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
    public static final void method1797(int arg0, int arg1, int arg2) {
        field4575++;
        class216 var3 = class139.method972(arg0, false, arg1);
        var3.method1459(true);
        var3.field3809 = arg2;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    private final void method1798(int arg0) throws IOException {
        field4578++;
        if (this.field4569 != -1L) {
            if (this.field4569 != this.field4559) {
                this.field4567.method338(0, this.field4569);
                this.field4559 = this.field4569;
            }
            this.field4567.method337(this.field4570, this.field4572, 0, (byte) 115);
            this.field4559 += (long) this.field4570;
            long var2 = -1L;
            if (this.field4561 < this.field4559) {
                this.field4561 = this.field4559;
            }
            long var4 = -1L;
            if (this.field4569 >= this.field4562 && this.field4569 < this.field4562 + ((long) this.field4576)) {
                var4 = this.field4569;
            } else if (this.field4562 >= this.field4569 && ((long) this.field4570 + this.field4569) > this.field4562) {
                var4 = this.field4562;
            }
            if (this.field4569 + ((long) this.field4570) > this.field4562 && (this.field4562 + ((long) this.field4576)) >= ((long) this.field4570 + this.field4569)) {
                var2 = (long) this.field4570 + this.field4569;
            } else if (this.field4569 < ((long) this.field4576 + this.field4562) && ((long) this.field4576 + this.field4562) <= ((long) this.field4570 + this.field4569)) {
                var2 = (long) this.field4576 + this.field4562;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class209.method1428(this.field4572, (int) (var4 - this.field4569), this.field4564, (int) (var4 - this.field4562), var6);
            }
            this.field4569 = -1L;
            this.field4570 = 0;
        }
        if (arg0 > -42) {
            this.method1796(52);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public static void method1799(byte arg0) {
        field4574 = null;
        field4585 = null;
        if (arg0 > -105) {
            method1799((byte) 115);
        }
        field4584 = null;
        field4579 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lne;II)V")
    public class260(class51 arg0, int arg1, int arg2) throws IOException {
        this.field4567 = arg0;
        this.field4568 = this.field4561 = arg0.method339(0);
        this.field4583 = 0L;
        this.field4572 = new byte[arg2];
        this.field4564 = new byte[arg1];
    }
}
