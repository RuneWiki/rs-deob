import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class27 {

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "J")
    private long field445 = -1L;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "J")
    private long field439 = -1L;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    private int field452 = 0;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lrl;")
    private class291 field456;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "J")
    private long field459;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "J")
    private long field451;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[B")
    private byte[] field453;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "J")
    private long field446;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[B")
    private byte[] field448;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lma;")
    public static class5 field431 = class12.method119("(Z", (byte) 87);

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lma;")
    private static class5 field442 = class12.method119("Loading config )2 ", (byte) 59);

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lma;")
    public static class5 field443 = field442;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lma;")
    public static class5 field444 = class12.method119(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 68);

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lma;")
    public static class5 field449 = class12.method119("weiss:", (byte) 94);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "J")
    private long field435;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lje;")
    public static class158 field447;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lni;")
    public static class202 field432;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 4)
    public static void method191(int arg0) {
        field444 = null;
        field432 = null;
        field447 = null;
        field449 = null;
        field443 = null;
        if (arg0 == 255) {
            field442 = null;
            field431 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLma;ILma;)V", line = 21)
    public static final void method192(boolean arg0, class5 arg1, int arg2, class5 arg3) {
        class74.field1169 = false;
        class250.field4144 = arg3;
        class250.field4148 = arg1;
        field458++;
        if (!arg0) {
            return;
        }
        class65.field1023 = arg2;
        class141.field2075 = 0;
        if (class250.field4144.method62(class250.field4145, -23269) || class250.field4148.method62(class250.field4145, -23269)) {
            class236.field3896 = 0;
            class85.field1291 = 3;
        } else {
            class106.field1577 = 0;
            class85.field1291 = -3;
            class236.field3896 = 1;
            class146.field2119 = 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Ljava/io/File;", line = 48)
    private final File method193(int arg0) {
        if (arg0 == 12591) {
            field438++;
            return this.field456.method1964(0);
        } else {
            return (File) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V", line = 60)
    public final void method194(int arg0) throws IOException {
        if (arg0 == 10252) {
            this.method195(-3);
            field433++;
            this.field456.method1966(1);
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V", line = 105)
    private final void method195(int arg0) throws IOException {
        field457++;
        if (this.field445 != -1L) {
            if (this.field445 != this.field435) {
                this.field456.method1963(this.field445, arg0 + 4);
                this.field435 = this.field445;
            }
            this.field456.method1965(-1, 0, this.field452, this.field448);
            this.field435 += (long) this.field452;
            long var2 = -1L;
            long var4 = -1L;
            if (this.field439 < (long) this.field452 + this.field445 && this.field439 + ((long) this.field454) >= (long) this.field452 + this.field445) {
                var4 = (long) this.field452 + this.field445;
            } else if (((long) this.field454 + this.field439) > this.field445 && this.field439 + ((long) this.field454) <= (long) this.field452 + this.field445) {
                var4 = (long) this.field454 + this.field439;
            }
            if (this.field459 < this.field435) {
                this.field459 = this.field435;
            }
            if (this.field445 >= this.field439 && ((long) this.field454 + this.field439) > this.field445) {
                var2 = this.field445;
            } else if (this.field445 <= this.field439 && this.field439 < ((long) this.field452 + this.field445)) {
                var2 = this.field439;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class42.method296(this.field448, (int) (var2 - this.field445), this.field453, (int) (var2 - this.field439), var6);
            }
            this.field445 = -1L;
            this.field452 = 0;
        }
        if (arg0 != -3) {
            field442 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lrl;II)V", line = 459)
    public class27(class291 arg0, int arg1, int arg2) throws IOException {
        this.field456 = arg0;
        this.field451 = this.field459 = arg0.method1967(-128);
        this.field453 = new byte[arg1];
        this.field446 = 0L;
        this.field448 = new byte[arg2];
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B)V", line = 202)
    public final void method196(int arg0, byte[] arg1) throws IOException {
        this.method201(0, 21, arg1, arg1.length);
        if (arg0 != -16607) {
            field447 = (class158) null;
        }
        field450++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([BIII)V", line = 213)
    public final void method197(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 != -1) {
            this.field439 = -81L;
        }
        field430++;
        try {
            if (this.field451 < ((long) arg2 + this.field446)) {
                this.field451 = this.field446 + ((long) arg2);
            }
            if (this.field445 != -1L && (this.field445 > this.field446 || this.field445 + ((long) this.field452) < this.field446)) {
                this.method195(-3);
            }
            if (this.field445 != -1L && (long) arg2 + this.field446 > (long) this.field448.length + this.field445) {
                int var5 = (int) ((long) this.field448.length - (this.field446 - this.field445));
                arg2 -= var5;
                class42.method296(arg0, arg1, this.field448, (int) (this.field446 - this.field445), var5);
                this.field446 += (long) var5;
                this.field452 = this.field448.length;
                this.method195(-3);
                arg1 += var5;
            }
            if (this.field448.length < arg2) {
                long var6 = -1L;
                if (this.field446 != this.field435) {
                    this.field456.method1963(this.field446, arg3 + 2);
                    this.field435 = this.field446;
                }
                this.field456.method1965(arg3 ^ 0x0, arg1, arg2, arg0);
                if (this.field439 <= this.field446 && (this.field439 + ((long) this.field454)) > this.field446) {
                    var6 = this.field446;
                } else if (this.field446 <= this.field439 && this.field439 < (long) arg2 + this.field446) {
                    var6 = this.field439;
                }
                this.field435 += (long) arg2;
                if (this.field435 > this.field459) {
                    this.field459 = this.field435;
                }
                long var8 = -1L;
                if (this.field439 < this.field446 + ((long) arg2) && (long) arg2 + this.field446 <= this.field439 - -((long) this.field454)) {
                    var8 = (long) arg2 + this.field446;
                } else if (this.field446 < ((long) this.field454 + this.field439) && ((long) this.field454 + this.field439) <= (this.field446 + ((long) arg2))) {
                    var8 = (long) this.field454 + this.field439;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class42.method296(arg0, (int) ((long) arg1 + var6 - this.field446), this.field453, (int) (var6 - this.field439), var10);
                }
                this.field446 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field445 == -1L) {
                    this.field445 = this.field446;
                }
                class42.method296(arg0, arg1, this.field448, (int) (this.field446 - this.field445), arg2);
                this.field446 += (long) arg2;
                if (this.field446 - this.field445 > (long) this.field452) {
                    this.field452 = (int) (this.field446 - this.field445);
                }
            }
        } catch (IOException var12) {
            this.field435 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BJ)V", line = 339)
    public final void method198(byte arg0, long arg1) throws IOException {
        field440++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method193(12591));
        }
        int var4 = -81 / ((arg0 + 26) / 55);
        this.field446 = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 372)
    private final void method199(boolean arg0) throws IOException {
        this.field454 = 0;
        if (this.field446 != this.field435) {
            this.field456.method1963(this.field446, 1);
            this.field435 = this.field446;
        }
        this.field439 = this.field446;
        if (!arg0) {
            this.method193(-51);
        }
        while (this.field454 < this.field453.length) {
            int var2 = this.field453.length - this.field454;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field456.method1962((byte) -100, var2, this.field454, this.field453);
            if (var3 == -1) {
                break;
            }
            this.field454 += var3;
            this.field435 += (long) var3;
        }
        field436++;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)J", line = 419)
    public final long method200(int arg0) {
        if (arg0 == 10440) {
            field434++;
            return this.field451;
        } else {
            return 11L;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[BI)V", line = 478)
    public final void method201(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field441++;
        try {
            if (arg2.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg2.length);
            }
            int var5 = -99 % ((-arg1 - 19) / 38);
            if (this.field445 != -1L && this.field445 <= this.field446 && (this.field445 + ((long) this.field452)) >= ((long) arg3 + this.field446)) {
                class42.method296(this.field448, (int) (this.field446 - this.field445), arg2, arg0, arg3);
                this.field446 += (long) arg3;
                return;
            }
            long var6 = this.field446;
            int var8 = arg3;
            int var9 = arg0;
            if (this.field446 >= this.field439 && (long) this.field454 + this.field439 > this.field446) {
                int var10 = (int) ((long) this.field454 + this.field439 - this.field446);
                if (arg3 < var10) {
                    var10 = arg3;
                }
                arg3 -= var10;
                class42.method296(this.field453, (int) (this.field446 - this.field439), arg2, arg0, var10);
                arg0 += var10;
                this.field446 += (long) var10;
            }
            if (this.field453.length < arg3) {
                this.field456.method1963(this.field446, 1);
                this.field435 = this.field446;
                while (arg3 > 0) {
                    int var12 = this.field456.method1962((byte) -92, arg3, arg0, arg2);
                    if (var12 == -1) {
                        break;
                    }
                    arg0 += var12;
                    this.field446 += (long) var12;
                    arg3 -= var12;
                    this.field435 += (long) var12;
                }
            } else if (arg3 > 0) {
                this.method199(true);
                int var11 = arg3;
                if (this.field454 < arg3) {
                    var11 = this.field454;
                }
                class42.method296(this.field453, 0, arg2, arg0, var11);
                this.field446 += (long) var11;
                arg0 += var11;
                arg3 -= var11;
            }
            if (this.field445 != -1L) {
                if (this.field445 > this.field446 && arg3 > 0) {
                    int var13 = (int) (this.field445 - this.field446) + arg0;
                    if (var13 > arg0 + arg3) {
                        var13 = arg0 + arg3;
                    }
                    while (arg0 < var13) {
                        arg3--;
                        arg2[arg0++] = 0;
                        this.field446++;
                    }
                }
                long var14 = -1L;
                if (var6 < (long) this.field452 + this.field445 && (long) this.field452 + this.field445 <= (long) var8 + var6) {
                    var14 = (long) this.field452 + this.field445;
                } else if ((var6 + ((long) var8)) > this.field445 && (long) this.field452 + this.field445 >= (long) var8 + var6) {
                    var14 = (long) var8 + var6;
                }
                long var16 = -1L;
                if (var6 <= this.field445 && this.field445 < (long) var8 + var6) {
                    var16 = this.field445;
                } else if (var6 >= this.field445 && var6 < ((long) this.field452 + this.field445)) {
                    var16 = var6;
                }
                if (var16 > -1L && var16 < var14) {
                    int var18 = (int) (var14 - var16);
                    class42.method296(this.field448, (int) (var16 - this.field445), arg2, (int) (var16 - var6) + var9, var18);
                    if (this.field446 < var14) {
                        arg3 = (int) ((long) arg3 - (var14 - this.field446));
                        this.field446 = var14;
                    }
                }
            }
        } catch (IOException var20) {
            this.field435 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }
}
