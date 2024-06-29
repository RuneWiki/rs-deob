import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class221 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "J")
    private long field3526 = -1L;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    private int field3523 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "J")
    private long field3534 = -1L;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Lan;")
    private class322 field3545;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "J")
    private long field3528;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "J")
    private long field3540;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[B")
    private byte[] field3529;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "J")
    private long field3546;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "[B")
    private byte[] field3541;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3544 = null;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lik;")
    public static class259 field3539 = new class259(64);

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lea;")
    public static class204 field3547 = new class204();

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    private int field3527;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "J")
    private long field3549;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[Lai;")
    public static class126[] field3525;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 17)
    private final void method1596(int arg0) throws IOException {
        this.field3527 = 0;
        field3524++;
        if (this.field3549 != this.field3546) {
            this.field3545.method2203(this.field3546, (byte) -43);
            this.field3549 = this.field3546;
        }
        this.field3534 = this.field3546;
        if (arg0 != 12341) {
            method1598(59, -29, -62, (byte) 12, 89);
        }
        while (this.field3541.length > this.field3527) {
            int var2 = this.field3541.length - this.field3527;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3545.method2199(this.field3541, var2, true, this.field3527);
            if (var3 == -1) {
                break;
            }
            this.field3527 += var3;
            this.field3549 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 64)
    public final void method1597(int arg0) throws IOException {
        int var2 = -14 / ((arg0 - 87) / 37);
        field3530++;
        this.method1605(true);
        this.field3545.method2200(1);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIBI)V", line = 74)
    public static final void method1598(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class195.field3108 = arg1;
        class319.field4965 = arg2;
        int var5 = -83 % ((arg3 + 26) / 57);
        field3537++;
        class116.field1888 = arg0;
        class188.field2995 = arg4;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lan;II)V", line = 599)
    public class221(class322 arg0, int arg1, int arg2) throws IOException {
        this.field3545 = arg0;
        this.field3540 = this.field3528 = arg0.method2201((byte) -125);
        this.field3529 = new byte[arg2];
        this.field3546 = 0L;
        this.field3541 = new byte[arg1];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Ljava/io/File;", line = 94)
    private final File method1599(byte arg0) {
        field3543++;
        return arg0 == -65 ? this.field3545.method2198(false) : (File) null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 105)
    public static final void method1600(byte arg0) {
        if (arg0 != 29) {
            method1600((byte) -103);
        }
        field3538++;
        class175.field2750.method1832((byte) -121);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)J", line = 118)
    public final long method1601(byte arg0) {
        field3548++;
        if (arg0 != 68) {
            method1600((byte) 77);
        }
        return this.field3540;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BII)V", line = 138)
    public final void method1602(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3536++;
        try {
            if ((arg2 + arg0) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 - (arg1.length - arg0));
            }
            if (this.field3526 != -1L && this.field3546 >= this.field3526 && (long) arg0 + this.field3546 <= (long) this.field3523 + this.field3526) {
                class271.method1959(this.field3529, (int) (this.field3546 - this.field3526), arg1, arg2, arg0);
                this.field3546 += (long) arg0;
                return;
            }
            long var5 = this.field3546;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field3534 <= this.field3546 && this.field3546 < this.field3534 + ((long) this.field3527)) {
                int var9 = (int) ((long) this.field3527 + this.field3534 - this.field3546);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class271.method1959(this.field3541, (int) (this.field3546 - this.field3534), arg1, arg2, var9);
                this.field3546 += (long) var9;
                arg2 += var9;
            }
            if (this.field3541.length < arg0) {
                this.field3545.method2203(this.field3546, (byte) -32);
                this.field3549 = this.field3546;
                while (arg0 > 0) {
                    int var11 = this.field3545.method2199(arg1, arg0, true, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 -= var11;
                    arg2 += var11;
                    this.field3546 += (long) var11;
                    this.field3549 += (long) var11;
                }
            } else if (arg0 > 0) {
                this.method1596(12341);
                int var10 = arg0;
                if (arg0 > this.field3527) {
                    var10 = this.field3527;
                }
                arg0 -= var10;
                class271.method1959(this.field3541, 0, arg1, arg2, var10);
                this.field3546 += (long) var10;
                arg2 += var10;
            }
            if (this.field3526 != -1L) {
                if (this.field3526 > this.field3546 && arg0 > 0) {
                    int var12 = (int) (this.field3526 - this.field3546) + arg2;
                    if (var12 > arg2 + arg0) {
                        var12 = arg2 + arg0;
                    }
                    while (arg2 < var12) {
                        arg1[arg2++] = 0;
                        this.field3546++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (this.field3526 >= var5 && (long) var8 + var5 > this.field3526) {
                    var13 = this.field3526;
                } else if (var5 >= this.field3526 && (this.field3526 + ((long) this.field3523)) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field3526 + ((long) this.field3523) > var5 && (long) this.field3523 + this.field3526 <= (long) var8 + var5) {
                    var15 = (long) this.field3523 + this.field3526;
                } else if (this.field3526 < (long) var8 + var5 && ((long) var8 + var5) <= ((long) this.field3523 + this.field3526)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class271.method1959(this.field3529, (int) (var13 - this.field3526), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field3546) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field3546));
                        this.field3546 = var15;
                    }
                }
            }
            if (arg3 >= -92) {
                method1604(63);
            }
        } catch (IOException var19) {
            this.field3549 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BJ)V", line = 325)
    public final void method1603(byte arg0, long arg1) throws IOException {
        field3532++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1599((byte) -65));
        }
        this.field3546 = arg1;
        int var4 = -56 % ((arg0 + 11) / 50);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 339)
    public static void method1604(int arg0) {
        field3525 = null;
        field3547 = null;
        field3539 = null;
        field3544 = null;
        if (arg0 > -29) {
            field3539 = (class259) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 352)
    private final void method1605(boolean arg0) throws IOException {
        if (!arg0) {
            return;
        }
        if (this.field3526 != -1L) {
            if (this.field3549 != this.field3526) {
                this.field3545.method2203(this.field3526, (byte) -32);
                this.field3549 = this.field3526;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field3545.method2202(1, 0, this.field3523, this.field3529);
            this.field3549 += (long) this.field3523;
            if (this.field3534 <= this.field3526 && this.field3526 < (long) this.field3527 + this.field3534) {
                var2 = this.field3526;
            } else if (this.field3534 >= this.field3526 && (long) this.field3523 + this.field3526 > this.field3534) {
                var2 = this.field3534;
            }
            if ((long) this.field3523 + this.field3526 > this.field3534 && (long) this.field3527 + this.field3534 >= (long) this.field3523 + this.field3526) {
                var4 = (long) this.field3523 + this.field3526;
            } else if (this.field3526 < (this.field3534 + ((long) this.field3527)) && (this.field3534 + ((long) this.field3527)) <= ((long) this.field3523 + this.field3526)) {
                var4 = (long) this.field3527 + this.field3534;
            }
            if (this.field3528 < this.field3549) {
                this.field3528 = this.field3549;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class271.method1959(this.field3529, (int) (var2 - this.field3526), this.field3541, (int) (var2 - this.field3534), var6);
            }
            this.field3523 = 0;
            this.field3526 = -1L;
        }
        field3533++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I[BII)V", line = 433)
    public final void method1606(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3542++;
        try {
            if (this.field3540 < (this.field3546 + ((long) arg2))) {
                this.field3540 = (long) arg2 + this.field3546;
            }
            if (this.field3526 != -1L && (this.field3546 < this.field3526 || this.field3546 > this.field3526 + ((long) this.field3523))) {
                this.method1605(true);
            }
            if (this.field3526 != -1L && (long) this.field3529.length + this.field3526 < (long) arg2 + this.field3546) {
                int var5 = (int) (this.field3526 + (long) this.field3529.length - this.field3546);
                class271.method1959(arg1, arg0, this.field3529, (int) (this.field3546 - this.field3526), var5);
                arg2 -= var5;
                arg0 += var5;
                this.field3546 += (long) var5;
                this.field3523 = this.field3529.length;
                this.method1605(true);
            }
            int var6 = -72 / ((arg3 + 43) / 57);
            if (arg2 > this.field3529.length) {
                if (this.field3549 != this.field3546) {
                    this.field3545.method2203(this.field3546, (byte) 124);
                    this.field3549 = this.field3546;
                }
                this.field3545.method2202(1, arg0, arg2, arg1);
                this.field3549 += (long) arg2;
                if (this.field3528 < this.field3549) {
                    this.field3528 = this.field3549;
                }
                long var7 = -1L;
                long var9 = -1L;
                if (this.field3546 >= this.field3534 && ((long) this.field3527 + this.field3534) > this.field3546) {
                    var7 = this.field3546;
                } else if (this.field3534 >= this.field3546 && this.field3534 < ((long) arg2 + this.field3546)) {
                    var7 = this.field3534;
                }
                if ((long) arg2 + this.field3546 > this.field3534 && ((long) arg2 + this.field3546) <= ((long) this.field3527 + this.field3534)) {
                    var9 = this.field3546 + ((long) arg2);
                } else if (((long) this.field3527 + this.field3534) > this.field3546 && ((long) this.field3527 + this.field3534) <= (this.field3546 + ((long) arg2))) {
                    var9 = (long) this.field3527 + this.field3534;
                }
                if (var7 > -1L && var7 < var9) {
                    int var11 = (int) (var9 - var7);
                    class271.method1959(arg1, (int) ((long) arg0 + var7 - this.field3546), this.field3541, (int) (var7 - this.field3534), var11);
                }
                this.field3546 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3526 == -1L) {
                    this.field3526 = this.field3546;
                }
                class271.method1959(arg1, arg0, this.field3529, (int) (this.field3546 - this.field3526), arg2);
                this.field3546 += (long) arg2;
                if (((long) this.field3523) < (this.field3546 - this.field3526)) {
                    this.field3523 = (int) (this.field3546 - this.field3526);
                }
            }
        } catch (IOException var13) {
            this.field3549 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BI)V", line = 560)
    public final void method1607(byte[] arg0, int arg1) throws IOException {
        if (arg1 != -26075) {
            this.method1601((byte) -27);
        }
        this.method1602(arg0.length, arg0, 0, -93);
        field3531++;
    }
}
