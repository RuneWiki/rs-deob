import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "J")
    private long field448 = -1L;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    private int field455 = 0;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "J")
    private long field475 = -1L;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lbc;")
    private class11 field462;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "J")
    private long field446;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "J")
    private long field445;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "J")
    private long field476;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "[B")
    private byte[] field451;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "[B")
    private byte[] field463;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lfc;")
    private static class39 field465 = class90.method774("Click to switch", -128);

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lfc;")
    public static class39 field467 = class90.method774("<col=80ff00>", -126);

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
    public static int[] field464 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lfc;")
    public static class39 field458 = class90.method774("Bitte geben Sie Ihr Passwort ein)3", -97);

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lfc;")
    public static class39 field453 = class90.method774("Freund hinzuf-Ugen", -104);

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lfc;")
    public static class39 field460 = field465;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Lfc;")
    public static class39 field472 = class90.method774("(Y ", -94);

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lfc;")
    public static class39 field478 = class90.method774("title)3jpg", -81);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "J")
    private long field449;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Loc;")
    public static class100 field471;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Llf;")
    public static class82 field450;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Llf;")
    public static class82 field457;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lnb;")
    public static class92 field454;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "[I")
    public static int[] field461;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "[I")
    public static int[] field469;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 8)
    public final void method197(boolean arg0) throws IOException {
        this.method200((byte) 127);
        this.field462.method145(-1);
        field456++;
        if (!arg0) {
            field467 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI[B)V", line = 29)
    public final void method198(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field452++;
        try {
            if (arg3.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (arg1 != 0) {
                this.method204(100);
            }
            if (this.field475 != -1L && this.field475 <= this.field476 && (long) this.field455 + this.field475 >= (long) arg0 + this.field476) {
                class41.method497(this.field463, (int) (this.field476 - this.field475), arg3, arg2, arg0);
                this.field476 += arg0;
                return;
            }
            long var5 = this.field476;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field476 >= this.field448 && (long) this.field447 + this.field448 > this.field476) {
                int var9 = (int) (this.field448 + (long) this.field447 - this.field476);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class41.method497(this.field451, (int) (this.field476 - this.field448), arg3, arg2, var9);
                arg2 += var9;
                this.field476 += var9;
            }
            if (this.field451.length < arg0) {
                this.field462.method143(-4437, this.field476);
                this.field449 = this.field476;
                while (arg0 > 0) {
                    int var10 = this.field462.method144(arg0, arg2, arg1 - 24325, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field476 += var10;
                    arg0 -= var10;
                    this.field449 += var10;
                    arg2 += var10;
                }
            } else if (arg0 > 0) {
                this.method201(arg1 ^ 0xFFFFFF84);
                int var11 = arg0;
                if (arg0 > this.field447) {
                    var11 = this.field447;
                }
                class41.method497(this.field451, 0, arg3, arg2, var11);
                arg0 -= var11;
                arg2 += var11;
                this.field476 += var11;
            }
            if (this.field475 != -1L) {
                if (this.field476 < this.field475 && arg0 > 0) {
                    int var12 = arg2 + (int) (this.field475 - this.field476);
                    if (arg2 + arg0 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg2) {
                        arg0--;
                        arg3[arg2++] = 0;
                        this.field476++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field475 && var5 + (long) var7 > this.field475) {
                    var13 = this.field475;
                } else if (var5 >= this.field475 && var5 < (long) this.field455 + this.field475) {
                    var13 = var5;
                }
                if (var5 < (long) this.field455 + this.field475 && (long) this.field455 + this.field475 <= var5 - -((long) var7)) {
                    var15 = (long) this.field455 + this.field475;
                } else if (this.field475 < (long) var7 + var5 && (long) this.field455 + this.field475 >= (long) var7 + var5) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class41.method497(this.field463, (int) (var13 - this.field475), arg3, (int) (var13 - var5) + var8, var17);
                    if (this.field476 < var15) {
                        arg0 = (int) ((long) arg0 + this.field476 - var15);
                        this.field476 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field449 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lbc;II)V", line = 653)
    public class16(class11 arg0, int arg1, int arg2) throws IOException {
        this.field462 = arg0;
        this.field445 = this.field446 = arg0.method147(false);
        this.field476 = 0L;
        this.field451 = new byte[arg1];
        this.field463 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILma;III)V", line = 225)
    public static final void method199(int arg0, class84 arg1, int arg2, int arg3, int arg4) {
        field457.method691(-44);
        class26.field750.method1155(0, 0);
        field474++;
        arg1.method720(class60.field1472, 55, 28, 16777215, 0);
        if (arg4 == 0) {
            arg1.method720(class93.field2185, 55, 41, 65280, 0);
        }
        if (arg4 == 1) {
            arg1.method720(class132.field3329, 55, 41, 16776960, 0);
        }
        if (arg4 == 2) {
            arg1.method720(class136.field3402, 55, 41, 16711680, 0);
        }
        if (arg4 == 3) {
            arg1.method720(class68.field1625, 55, 41, 65535, 0);
        }
        arg1.method720(class112.field2929, 184, 28, 16777215, 0);
        if (arg3 == 0) {
            arg1.method720(class93.field2185, 184, 41, 65280, 0);
        }
        if (arg3 == 1) {
            arg1.method720(class132.field3329, 184, 41, 16776960, 0);
        }
        if (arg3 == 2) {
            arg1.method720(class136.field3402, 184, 41, 16711680, 0);
        }
        arg1.method720(class116.field3031, 324, 28, 16777215, 0);
        if (arg0 == 0) {
            arg1.method720(class93.field2185, 324, 41, 65280, 0);
        }
        if (arg0 == 1) {
            arg1.method720(class132.field3329, 324, 41, 16776960, 0);
        }
        if (arg0 == 2) {
            arg1.method720(class136.field3402, 324, 41, 16711680, 0);
        }
        arg1.method699(class3.field89, 417, 17, 85, 25, 16777215, 0, 1, 1, 0);
        try {
            if (arg2 == -565239136) {
                Graphics var5 = class140.field3523.getGraphics();
                field457.method129(var5, 0, 453, (byte) -128);
            }
        } catch (Exception var6) {
            class140.field3523.repaint();
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 296)
    private final void method200(byte arg0) throws IOException {
        field473++;
        if (this.field475 != -1L) {
            if (this.field475 != this.field449) {
                this.field462.method143(-4437, this.field475);
                this.field449 = this.field475;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field462.method148(this.field455, 0, -26455, this.field463);
            if (this.field448 < (long) this.field455 + this.field475 && (long) this.field447 + this.field448 >= this.field475 - -((long) this.field455)) {
                var4 = this.field475 + (long) this.field455;
            } else if (this.field475 < this.field448 + (long) this.field447 && (long) this.field455 + this.field475 >= (long) this.field447 + this.field448) {
                var4 = (long) this.field447 + this.field448;
            }
            if (this.field448 <= this.field475 && this.field475 < this.field448 + (long) this.field447) {
                var2 = this.field475;
            } else if (this.field475 <= this.field448 && this.field448 < (long) this.field455 + this.field475) {
                var2 = this.field448;
            }
            this.field449 += this.field455;
            if (this.field446 < this.field449) {
                this.field446 = this.field449;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class41.method497(this.field463, (int) (var2 - this.field475), this.field451, (int) (var2 - this.field448), var6);
            }
            this.field475 = -1L;
            this.field455 = 0;
        }
        if (arg0 <= 71) {
            this.method204(-118);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 370)
    private final void method201(int arg0) throws IOException {
        field459++;
        this.field447 = 0;
        if (this.field476 != this.field449) {
            this.field462.method143(-4437, this.field476);
            this.field449 = this.field476;
        }
        if (arg0 > -122) {
            method199(100, null, 92, -28, 0);
        }
        this.field448 = this.field476;
        while (this.field447 < this.field451.length) {
            int var2 = this.field462.method144(this.field451.length - this.field447, this.field447, -24325, this.field451);
            if (var2 == -1) {
                break;
            }
            this.field447 += var2;
            this.field449 += var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BBII)V", line = 423)
    public final void method202(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field468++;
        try {
            int var5 = 40 / ((-arg1 - 13) / 61);
            if (this.field445 < (long) arg2 + this.field476) {
                this.field445 = (long) arg2 + this.field476;
            }
            if (this.field475 != -1L && (this.field476 < this.field475 || (long) this.field455 + this.field475 < this.field476)) {
                this.method200((byte) 110);
            }
            if (this.field475 != -1L && this.field475 + (long) this.field463.length < (long) arg2 + this.field476) {
                int var6 = (int) (this.field475 + (long) this.field463.length - this.field476);
                arg2 -= var6;
                class41.method497(arg0, arg3, this.field463, (int) (this.field476 - this.field475), var6);
                arg3 += var6;
                this.field476 += var6;
                this.field455 = this.field463.length;
                this.method200((byte) 93);
            }
            if (this.field463.length < arg2) {
                if (this.field476 != this.field449) {
                    this.field462.method143(-4437, this.field476);
                    this.field449 = this.field476;
                }
                this.field462.method148(arg2, arg3, -26455, arg0);
                this.field449 += arg2;
                if (this.field449 > this.field446) {
                    this.field446 = this.field449;
                }
                long var7 = -1L;
                if (this.field476 >= this.field448 && this.field476 < (long) this.field447 + this.field448) {
                    var7 = this.field476;
                } else if (this.field476 <= this.field448 && this.field476 + (long) arg2 > this.field448) {
                    var7 = this.field448;
                }
                long var9 = -1L;
                if (this.field476 + (long) arg2 > this.field448 && (long) this.field447 + this.field448 >= (long) arg2 + this.field476) {
                    var9 = this.field476 + (long) arg2;
                } else if (this.field476 < this.field448 + (long) this.field447 && this.field476 + (long) arg2 >= (long) this.field447 + this.field448) {
                    var9 = this.field448 + (long) this.field447;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class41.method497(arg0, (int) ((long) arg3 + var7 - this.field476), this.field451, (int) (var7 - this.field448), var11);
                }
                this.field476 += arg2;
            } else if (arg2 > 0) {
                if (this.field475 == -1L) {
                    this.field475 = this.field476;
                }
                class41.method497(arg0, arg3, this.field463, (int) (this.field476 - this.field475), arg2);
                this.field476 += arg2;
                if (this.field476 - this.field475 > (long) this.field455) {
                    this.field455 = (int) (this.field476 - this.field475);
                }
            }
        } catch (IOException var13) {
            this.field449 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 561)
    public static void method203(byte arg0) {
        field454 = null;
        field457 = null;
        field478 = null;
        field465 = null;
        field461 = null;
        field472 = null;
        field467 = null;
        field469 = null;
        field458 = null;
        field471 = null;
        field450 = null;
        field464 = null;
        if (arg0 <= 52) {
            method199(-15, null, -16, -76, 13);
        }
        field460 = null;
        field453 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)J", line = 600)
    public final long method204(int arg0) {
        if (arg0 == -1) {
            field470++;
            return this.field445;
        } else {
            return 83L;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BJ)V", line = 617)
    public final void method205(byte arg0, long arg1) {
        int var4 = 61 % ((1 - arg0) / 33);
        field466++;
        if (arg1 >= 0L) {
            this.field476 = arg1;
        }
    }
}
