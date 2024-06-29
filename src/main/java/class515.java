import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class515 {

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "J")
    private long field7476 = -1L;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "J")
    private long field7477 = -1L;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    private int field7483 = 0;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "Lsh;")
    private class51 field7487;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "J")
    private long field7478;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "J")
    private long field7479;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "[B")
    private byte[] field7495;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "J")
    private long field7490;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "[B")
    private byte[] field7485;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Lob;")
    public static class521 field7488 = new class521(62, -1);

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "Lks;")
    public static class305 field7496 = new class305();

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "Lqu;")
    public static class65 field7497 = new class65(8, 0, 4, 1);

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "Lak;")
    public static class234 field7498 = new class234("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "Lak;")
    public static class234 field7499 = new class234("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    private int field7475;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "J")
    private long field7484;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)J", line = 16)
    public final long method3046(byte arg0) {
        if (arg0 == 120) {
            field7491++;
            return this.field7479;
        } else {
            return -94L;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 34)
    private final void method3047(int arg0) throws IOException {
        if (arg0 != -1) {
            method3049(21);
        }
        field7486++;
        if (this.field7477 == -1L) {
            return;
        }
        if (this.field7484 != this.field7477) {
            this.field7487.method495(0, this.field7477);
            this.field7484 = this.field7477;
        }
        this.field7487.method494(this.field7483, arg0 ^ 0x7D, this.field7495, 0);
        this.field7484 += this.field7483;
        if (this.field7484 > this.field7478) {
            this.field7478 = this.field7484;
        }
        long var2 = -1L;
        if (this.field7476 <= this.field7477 && (long) this.field7475 + this.field7476 > this.field7477) {
            var2 = this.field7477;
        } else if (this.field7477 <= this.field7476 && (this.field7477 + ((long) this.field7483)) > this.field7476) {
            var2 = this.field7476;
        }
        long var4 = -1L;
        if ((long) this.field7483 + this.field7477 > this.field7476 && ((long) this.field7475 + this.field7476) >= (this.field7477 + ((long) this.field7483))) {
            var4 = (long) this.field7483 + this.field7477;
        } else if (((long) this.field7475 + this.field7476) > this.field7477 && this.field7476 + ((long) this.field7475) <= (long) this.field7483 + this.field7477) {
            var4 = this.field7476 + ((long) this.field7475);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class414.method2598(this.field7495, (int) (var2 - this.field7477), this.field7485, (int) (var2 - this.field7476), var6);
        }
        this.field7483 = 0;
        this.field7477 = -1L;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Ljava/io/File;", line = 114)
    private final File method3048(int arg0) {
        if (arg0 != 1) {
            method3049(-19);
        }
        field7482++;
        return this.field7487.method493(-29);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 125)
    public static void method3049(int arg0) {
        field7496 = null;
        field7497 = null;
        field7488 = null;
        field7499 = null;
        field7498 = null;
        if (arg0 != 0) {
            field7488 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II[BI)V", line = 141)
    public final void method3050(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7480++;
        try {
            if (arg2.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg2.length);
            }
            if (this.field7477 != -1L && this.field7477 <= this.field7490 && this.field7477 + ((long) this.field7483) >= (long) arg3 + this.field7490) {
                class414.method2598(this.field7495, (int) (this.field7490 - this.field7477), arg2, arg1, arg3);
                this.field7490 += arg3;
                return;
            }
            long var5 = this.field7490;
            int var7 = arg1;
            if (arg0 != 0) {
                this.field7475 = -125;
            }
            int var8 = arg3;
            if (this.field7476 <= this.field7490 && (long) this.field7475 + this.field7476 > this.field7490) {
                int var9 = (int) ((long) this.field7475 + this.field7476 - this.field7490);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class414.method2598(this.field7485, (int) (this.field7490 - this.field7476), arg2, arg1, var9);
                arg3 -= var9;
                this.field7490 += var9;
                arg1 += var9;
            }
            if (this.field7485.length < arg3) {
                this.field7487.method495(0, this.field7490);
                this.field7484 = this.field7490;
                while (arg3 > 0) {
                    int var10 = this.field7487.method491(arg1, -1, arg2, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field7484 += var10;
                    arg1 += var10;
                    this.field7490 += var10;
                }
            } else if (arg3 > 0) {
                this.method3053(arg0 + 200000000);
                int var11 = arg3;
                if (arg3 > this.field7475) {
                    var11 = this.field7475;
                }
                class414.method2598(this.field7485, 0, arg2, arg1, var11);
                this.field7490 += var11;
                arg1 += var11;
                arg3 -= var11;
            }
            if (this.field7477 != -1L) {
                if (this.field7477 > this.field7490 && arg3 > 0) {
                    int var12 = (int) (this.field7477 - this.field7490) + arg1;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg3--;
                        arg2[arg1++] = 0;
                        this.field7490++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field7477 >= var5 && this.field7477 < ((long) var8 + var5)) {
                    var13 = this.field7477;
                } else if (var5 >= this.field7477 && var5 < (long) this.field7483 + this.field7477) {
                    var13 = var5;
                }
                if (var5 < ((long) this.field7483 + this.field7477) && (long) this.field7483 + this.field7477 <= (long) var8 + var5) {
                    var15 = (long) this.field7483 + this.field7477;
                } else if ((long) var8 + var5 > this.field7477 && (long) this.field7483 + this.field7477 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class414.method2598(this.field7495, (int) (var13 - this.field7477), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field7490) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field7490));
                        this.field7490 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field7484 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[BIB)V", line = 331)
    public final void method3051(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != -72) {
            this.method3048(69);
        }
        field7481++;
        try {
            if (((long) arg2 + this.field7490) > this.field7479) {
                this.field7479 = this.field7490 + ((long) arg2);
            }
            if (this.field7477 != -1L && (this.field7477 > this.field7490 || this.field7490 > ((long) this.field7483 + this.field7477))) {
                this.method3047(-1);
            }
            if (this.field7477 != -1L && (long) arg2 + this.field7490 > (long) this.field7495.length + this.field7477) {
                int var5 = (int) (this.field7477 + (long) this.field7495.length - this.field7490);
                class414.method2598(arg1, arg0, this.field7495, (int) (this.field7490 - this.field7477), var5);
                arg0 += var5;
                arg2 -= var5;
                this.field7490 += var5;
                this.field7483 = this.field7495.length;
                this.method3047(arg3 + 71);
            }
            if (this.field7495.length < arg2) {
                if (this.field7490 != this.field7484) {
                    this.field7487.method495(0, this.field7490);
                    this.field7484 = this.field7490;
                }
                this.field7487.method494(arg2, arg3 ^ 0x38, arg1, arg0);
                this.field7484 += arg2;
                if (this.field7478 < this.field7484) {
                    this.field7478 = this.field7484;
                }
                long var6 = -1L;
                if (this.field7490 >= this.field7476 && ((long) this.field7475 + this.field7476) > this.field7490) {
                    var6 = this.field7490;
                } else if (this.field7490 <= this.field7476 && (this.field7490 + ((long) arg2)) > this.field7476) {
                    var6 = this.field7476;
                }
                long var8 = -1L;
                if (this.field7476 < (long) arg2 + this.field7490 && ((long) arg2 + this.field7490) <= ((long) this.field7475 + this.field7476)) {
                    var8 = (long) arg2 + this.field7490;
                } else if ((this.field7476 + ((long) this.field7475)) > this.field7490 && (long) arg2 + this.field7490 >= this.field7476 - -((long) this.field7475)) {
                    var8 = this.field7476 + ((long) this.field7475);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class414.method2598(arg1, (int) (var6 + (long) arg0 - this.field7490), this.field7485, (int) (var6 - this.field7476), var10);
                }
                this.field7490 += arg2;
            } else if (arg2 > 0) {
                if (this.field7477 == -1L) {
                    this.field7477 = this.field7490;
                }
                class414.method2598(arg1, arg0, this.field7495, (int) (this.field7490 - this.field7477), arg2);
                this.field7490 += arg2;
                if (this.field7490 - this.field7477 > (long) this.field7483) {
                    this.field7483 = (int) (this.field7490 - this.field7477);
                }
            }
        } catch (IOException var12) {
            this.field7484 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IJ)V", line = 452)
    public final void method3052(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            this.method3046((byte) 50);
        }
        field7489++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3048(1));
        }
        this.field7490 = arg1;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lsh;II)V", line = 540)
    public class515(class51 arg0, int arg1, int arg2) throws IOException {
        this.field7487 = arg0;
        this.field7479 = this.field7478 = arg0.method492((byte) -35);
        this.field7495 = new byte[arg2];
        this.field7490 = 0L;
        this.field7485 = new byte[arg1];
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V", line = 480)
    private final void method3053(int arg0) throws IOException {
        this.field7475 = 0;
        field7493++;
        if (arg0 != 200000000) {
            this.field7490 = -44L;
        }
        if (this.field7490 != this.field7484) {
            this.field7487.method495(0, this.field7490);
            this.field7484 = this.field7490;
        }
        this.field7476 = this.field7490;
        while (this.field7475 < this.field7485.length) {
            int var2 = this.field7485.length - this.field7475;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7487.method491(this.field7475, -1, this.field7485, var2);
            if (var3 == -1) {
                break;
            }
            this.field7484 += var3;
            this.field7475 += var3;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([BI)V", line = 528)
    public final void method3054(byte[] arg0, int arg1) throws IOException {
        this.method3050(0, arg1, arg0, arg0.length);
        field7494++;
    }
}
