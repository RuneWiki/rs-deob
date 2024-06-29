import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class569 {

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    private int field7469 = 0;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "J")
    private long field7476 = -1L;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "J")
    private long field7488 = -1L;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "Lcr;")
    private class574 field7474;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "J")
    private long field7483;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "J")
    private long field7478;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "[B")
    private byte[] field7484;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "J")
    private long field7486;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "[B")
    private byte[] field7480;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field7487 = -1;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Laea;")
    public static class50 field7475 = new class50();

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    private int field7471;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "J")
    private long field7489;

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "Lqha;")
    public static class104 field7492;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method3134(int arg0) {
        if (arg0 == 1) {
            field7490++;
            return this.field7474.method3158(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
    private final void method3135(int arg0) throws IOException {
        field7481++;
        this.field7471 = 0;
        if (this.field7489 != this.field7486) {
            this.field7474.method3163(this.field7486, (byte) 103);
            this.field7489 = this.field7486;
        }
        this.field7476 = this.field7486;
        if (arg0 != -17212) {
            this.field7469 = -123;
        }
        while (this.field7480.length > this.field7471) {
            int var2 = this.field7480.length - this.field7471;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7474.method3156(this.field7471, var2, (byte) 120, this.field7480);
            if (var3 == -1) {
                break;
            }
            this.field7471 += var3;
            this.field7489 += var3;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public static void method3136(byte arg0) {
        field7492 = null;
        field7475 = null;
        if (arg0 != 94) {
            field7492 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
    private final void method3137(byte arg0) throws IOException {
        field7485++;
        if (this.field7488 != -1L) {
            if (this.field7489 != this.field7488) {
                this.field7474.method3163(this.field7488, (byte) 103);
                this.field7489 = this.field7488;
            }
            this.field7474.method3161(3874, 0, this.field7469, this.field7484);
            this.field7489 += this.field7469;
            if (this.field7489 > this.field7483) {
                this.field7483 = this.field7489;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field7476 <= this.field7488 && this.field7488 < (long) this.field7471 + this.field7476) {
                var2 = this.field7488;
            } else if (this.field7488 <= this.field7476 && this.field7476 < (this.field7488 + ((long) this.field7469))) {
                var2 = this.field7476;
            }
            if ((long) this.field7469 + this.field7488 > this.field7476 && (long) this.field7469 + this.field7488 <= (long) this.field7471 + this.field7476) {
                var4 = (long) this.field7469 + this.field7488;
            } else if ((this.field7476 + ((long) this.field7471)) > this.field7488 && this.field7488 + ((long) this.field7469) >= (long) this.field7471 + this.field7476) {
                var4 = (long) this.field7471 + this.field7476;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class335.method2020(this.field7484, (int) (var2 - this.field7488), this.field7480, (int) (var2 - this.field7476), var6);
            }
            this.field7488 = -1L;
            this.field7469 = 0;
        }
        if (arg0 <= 125) {
            this.method3140(104);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BJ)V")
    public final void method3138(byte arg0, long arg1) throws IOException {
        field7473++;
        if (arg0 != -66) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3134(1));
        }
        this.field7486 = arg1;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI[BI)V")
    public final void method3139(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7472++;
        if (arg0) {
            this.field7480 = null;
        }
        try {
            if ((this.field7486 + ((long) arg1)) > this.field7478) {
                this.field7478 = (long) arg1 + this.field7486;
            }
            if (this.field7488 != -1L && (this.field7488 > this.field7486 || this.field7486 > (long) this.field7469 + this.field7488)) {
                this.method3137((byte) 126);
            }
            if (this.field7488 != -1L && (long) arg1 + this.field7486 > (long) this.field7484.length + this.field7488) {
                int var5 = (int) ((long) this.field7484.length + this.field7488 - this.field7486);
                class335.method2020(arg2, arg3, this.field7484, (int) (this.field7486 - this.field7488), var5);
                arg1 -= var5;
                arg3 += var5;
                this.field7486 += var5;
                this.field7469 = this.field7484.length;
                this.method3137((byte) 126);
            }
            if (this.field7484.length < arg1) {
                if (this.field7489 != this.field7486) {
                    this.field7474.method3163(this.field7486, (byte) 103);
                    this.field7489 = this.field7486;
                }
                this.field7474.method3161(3874, arg3, arg1, arg2);
                this.field7489 += arg1;
                if (this.field7489 > this.field7483) {
                    this.field7483 = this.field7489;
                }
                long var6 = -1L;
                if (this.field7476 <= this.field7486 && (long) this.field7471 + this.field7476 > this.field7486) {
                    var6 = this.field7486;
                } else if (this.field7486 <= this.field7476 && this.field7476 < (this.field7486 + ((long) arg1))) {
                    var6 = this.field7476;
                }
                long var8 = -1L;
                if (this.field7476 < this.field7486 + ((long) arg1) && ((long) arg1 + this.field7486) <= ((long) this.field7471 + this.field7476)) {
                    var8 = this.field7486 + ((long) arg1);
                } else if ((long) this.field7471 + this.field7476 > this.field7486 && ((long) this.field7471 + this.field7476) <= (this.field7486 + ((long) arg1))) {
                    var8 = this.field7476 + ((long) this.field7471);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class335.method2020(arg2, (int) ((long) arg3 + var6 - this.field7486), this.field7480, (int) (var6 - this.field7476), var10);
                }
                this.field7486 += arg1;
            } else if (arg1 > 0) {
                if (this.field7488 == -1L) {
                    this.field7488 = this.field7486;
                }
                class335.method2020(arg2, arg3, this.field7484, (int) (this.field7486 - this.field7488), arg1);
                this.field7486 += arg1;
                if ((long) this.field7469 < this.field7486 - this.field7488) {
                    this.field7469 = (int) (this.field7486 - this.field7488);
                }
            }
        } catch (IOException var12) {
            this.field7489 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)J")
    public final long method3140(int arg0) {
        if (arg0 != 0) {
            this.method3140(-21);
        }
        field7477++;
        return this.field7478;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I[BIZ)V")
    public final void method3141(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if (arg3) {
            return;
        }
        field7470++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field7488 != -1L && this.field7488 <= this.field7486 && ((long) this.field7469 + this.field7488) >= ((long) arg0 + this.field7486)) {
                class335.method2020(this.field7484, (int) (this.field7486 - this.field7488), arg1, arg2, arg0);
                this.field7486 += arg0;
                return;
            }
            long var5 = this.field7486;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field7486 >= this.field7476 && this.field7486 < (long) this.field7471 + this.field7476) {
                int var9 = (int) (this.field7476 + (long) this.field7471 - this.field7486);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class335.method2020(this.field7480, (int) (this.field7486 - this.field7476), arg1, arg2, var9);
                this.field7486 += var9;
                arg0 -= var9;
                arg2 += var9;
            }
            if (arg0 > this.field7480.length) {
                this.field7474.method3163(this.field7486, (byte) 103);
                this.field7489 = this.field7486;
                while (arg0 > 0) {
                    int var10 = this.field7474.method3156(arg2, arg0, (byte) 120, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 -= var10;
                    arg2 += var10;
                    this.field7489 += var10;
                    this.field7486 += var10;
                }
            } else if (arg0 > 0) {
                this.method3135(-17212);
                int var11 = arg0;
                if (this.field7471 < arg0) {
                    var11 = this.field7471;
                }
                class335.method2020(this.field7480, 0, arg1, arg2, var11);
                this.field7486 += var11;
                arg2 += var11;
                arg0 -= var11;
            }
            if (this.field7488 != -1L) {
                if (this.field7486 < this.field7488 && arg0 > 0) {
                    int var12 = arg2 + ((int) (this.field7488 - this.field7486));
                    if (var12 > (arg2 + arg0)) {
                        var12 = arg0 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1[arg2++] = 0;
                        arg0--;
                        this.field7486++;
                    }
                }
                long var13 = -1L;
                if (this.field7488 >= var5 && (long) var8 + var5 > this.field7488) {
                    var13 = this.field7488;
                } else if (var5 >= this.field7488 && (long) this.field7469 + this.field7488 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < ((long) this.field7469 + this.field7488) && (long) this.field7469 + this.field7488 <= (long) var8 + var5) {
                    var15 = (long) this.field7469 + this.field7488;
                } else if ((long) var8 + var5 > this.field7488 && ((long) this.field7469 + this.field7488) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class335.method2020(this.field7484, (int) (var13 - this.field7488), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field7486) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field7486));
                        this.field7486 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field7489 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z[B)V")
    public final void method3142(boolean arg0, byte[] arg1) throws IOException {
        this.method3141(arg1.length, arg1, 0, arg0);
        field7482++;
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V")
    public final void method3143(int arg0) throws IOException {
        field7479++;
        int var2 = 32 % ((-arg0 - 43) / 55);
        this.method3137((byte) 127);
        this.field7474.method3157(-123);
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lcr;II)V")
    public class569(class574 arg0, int arg1, int arg2) throws IOException {
        this.field7474 = arg0;
        this.field7478 = this.field7483 = arg0.method3155(0);
        this.field7484 = new byte[arg2];
        this.field7486 = 0L;
        this.field7480 = new byte[arg1];
    }
}
