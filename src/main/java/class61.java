import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 {

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "J")
    private long field1546 = -1L;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "J")
    private long field1551 = -1L;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private int field1553 = 0;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lpf;")
    private class110 field1548;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "J")
    private long field1559;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "J")
    private long field1535;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "J")
    private long field1552;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "[B")
    private byte[] field1545;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[B")
    private byte[] field1544;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Z")
    public static boolean field1556 = false;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Llf;")
    public static class82 field1543 = new class82(64);

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "Laf;")
    public static class7 field1557 = new class7(4096);

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "Lm;")
    public static class83 field1561 = new class83();

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "[I")
    public static int[] field1562 = new int[50];

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Lic;")
    public static class59 field1563 = class59.method433(0, ":chalreq:");

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "J")
    private long field1538;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "[Lt;")
    public static class132[] field1564;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
    public final void method502(byte[] arg0, int arg1) throws IOException {
        if (arg1 >= -64) {
            this.method505(103);
        }
        field1555++;
        this.method510(0, arg0.length, -88, arg0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIII)I")
    public static final int method503(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        field1539++;
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        int var4 = (arg3 / 4 << 10) - (-(arg1 / 32 << 7) - (arg2 / 2));
        return arg0 ? -94 : var4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILjava/awt/Component;ILje;)Ldb;")
    public static final class24 method504(int arg0, int arg1, Component arg2, int arg3, class67 arg4) {
        field1547++;
        if (~class25.field626 == arg0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class24 var5 = (class24) Class.forName("ta").getDeclaredConstructor().newInstance();
                var5.field580 = new int[(class25.field632 ? 2 : 1) * 256];
                var5.field601 = arg3;
                var5.method164(arg2);
                var5.field603 = (-1024 & arg3) + 1024;
                if (var5.field603 > 16384) {
                    var5.field603 = 16384;
                }
                var5.method162(var5.field603);
                if (class159.field3648 > 0 && class32.field851 == null) {
                    class32.field851 = new class95();
                    class32.field851.field2422 = arg4;
                    arg4.method543(class32.field851, class159.field3648, 0);
                }
                if (class32.field851 != null) {
                    if (class32.field851.field2414[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class32.field851.field2414[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class58 var6 = new class58(arg4, arg1);
                    var6.field601 = arg3;
                    var6.field580 = new int[(class25.field632 ? 2 : 1) * 256];
                    var6.method164(arg2);
                    var6.field603 = 16384;
                    var6.method162(var6.field603);
                    if (class159.field3648 > 0 && class32.field851 == null) {
                        class32.field851 = new class95();
                        class32.field851.field2422 = arg4;
                        arg4.method543(class32.field851, class159.field3648, arg0 + 1);
                    }
                    if (class32.field851 != null) {
                        if (class32.field851.field2414[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class32.field851.field2414[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class24();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)J")
    public final long method505(int arg0) {
        field1542++;
        if (arg0 != -21343) {
            this.method512(-46);
        }
        return this.field1535;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method506(int arg0) {
        field1561 = null;
        field1543 = null;
        field1562 = null;
        field1563 = null;
        if (arg0 != 1) {
            field1557 = null;
        }
        field1557 = null;
        field1564 = null;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public final void method507(int arg0) throws IOException {
        field1537++;
        this.method513(false);
        int var2 = 111 % ((-arg0 - 14) / 49);
        this.field1548.method858(-109);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    private final void method508(byte arg0) throws IOException {
        this.field1549 = 0;
        if (arg0 > -31) {
            return;
        }
        if (this.field1552 != this.field1538) {
            this.field1548.method861(this.field1552, (byte) 127);
            this.field1538 = this.field1552;
        }
        this.field1551 = this.field1552;
        while (this.field1549 < this.field1545.length) {
            int var2 = this.field1548.method862(this.field1549, (byte) -70, this.field1545.length - this.field1549, this.field1545);
            if (var2 == -1) {
                break;
            }
            this.field1538 += var2;
            this.field1549 += var2;
        }
        field1550++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III[B)V")
    public final void method509(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1541++;
        try {
            if (arg2 >= -20) {
                field1557 = null;
            }
            if (this.field1535 < (long) arg0 + this.field1552) {
                this.field1535 = (long) arg0 + this.field1552;
            }
            if (this.field1546 != -1L && (this.field1552 < this.field1546 || (long) this.field1553 + this.field1546 < this.field1552)) {
                this.method513(false);
            }
            if (this.field1546 != -1L && (long) this.field1544.length + this.field1546 < (long) arg0 + this.field1552) {
                int var5 = (int) (this.field1546 + (long) this.field1544.length - this.field1552);
                arg0 -= var5;
                class105.method818(arg3, arg1, this.field1544, (int) (this.field1552 - this.field1546), var5);
                this.field1552 += var5;
                this.field1553 = this.field1544.length;
                arg1 += var5;
                this.method513(false);
            }
            if (this.field1544.length < arg0) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1552 != this.field1538) {
                    this.field1548.method861(this.field1552, (byte) 124);
                    this.field1538 = this.field1552;
                }
                this.field1548.method860(arg3, (byte) 64, arg0, arg1);
                if (this.field1551 <= this.field1552 && (long) this.field1549 + this.field1551 > this.field1552) {
                    var6 = this.field1552;
                } else if (this.field1552 <= this.field1551 && this.field1551 < (long) arg0 + this.field1552) {
                    var6 = this.field1551;
                }
                if (this.field1551 < this.field1552 + (long) arg0 && this.field1551 + (long) this.field1549 >= (long) arg0 + this.field1552) {
                    var8 = (long) arg0 + this.field1552;
                } else if (this.field1552 < (long) this.field1549 + this.field1551 && (long) arg0 + this.field1552 >= (long) this.field1549 + this.field1551) {
                    var8 = this.field1551 + (long) this.field1549;
                }
                this.field1538 += arg0;
                if (this.field1538 > this.field1559) {
                    this.field1559 = this.field1538;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class105.method818(arg3, (int) (var6 + (long) arg1 - this.field1552), this.field1545, (int) (var6 - this.field1551), var10);
                }
                this.field1552 += arg0;
            } else if (arg0 > 0) {
                if (this.field1546 == -1L) {
                    this.field1546 = this.field1552;
                }
                class105.method818(arg3, arg1, this.field1544, (int) (this.field1552 - this.field1546), arg0);
                this.field1552 += arg0;
                if ((long) this.field1553 < this.field1552 - this.field1546) {
                    this.field1553 = (int) (this.field1552 - this.field1546);
                }
            }
        } catch (IOException var12) {
            this.field1538 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III[B)V")
    public final void method510(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1554++;
        try {
            if (arg0 + arg1 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (this.field1546 != -1L && this.field1552 >= this.field1546 && (long) this.field1553 + this.field1546 >= this.field1552 - -((long) arg1)) {
                class105.method818(this.field1544, (int) (this.field1552 - this.field1546), arg3, arg0, arg1);
                this.field1552 += arg1;
                return;
            }
            long var5 = this.field1552;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field1551 <= this.field1552 && this.field1552 < (long) this.field1549 + this.field1551) {
                int var9 = (int) (this.field1551 + (long) this.field1549 - this.field1552);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class105.method818(this.field1545, (int) (this.field1552 - this.field1551), arg3, arg0, var9);
                this.field1552 += var9;
                arg0 += var9;
            }
            if (arg1 > this.field1545.length) {
                this.field1548.method861(this.field1552, (byte) 125);
                this.field1538 = this.field1552;
                while (arg1 > 0) {
                    int var10 = this.field1548.method862(arg0, (byte) -70, arg1, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1552 += var10;
                    this.field1538 += var10;
                    arg1 -= var10;
                    arg0 += var10;
                }
            } else if (arg1 > 0) {
                this.method508((byte) -90);
                int var11 = arg1;
                if (this.field1549 < arg1) {
                    var11 = this.field1549;
                }
                class105.method818(this.field1545, 0, arg3, arg0, var11);
                arg0 += var11;
                this.field1552 += var11;
                arg1 -= var11;
            }
            if (this.field1546 != -1L) {
                if (this.field1552 < this.field1546 && arg1 > 0) {
                    int var12 = (int) (this.field1546 - this.field1552) + arg0;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg1--;
                        arg3[arg0++] = 0;
                        this.field1552++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field1546 && this.field1546 < var5 + (long) var7) {
                    var13 = this.field1546;
                } else if (this.field1546 <= var5 && var5 < (long) this.field1553 + this.field1546) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field1546 + (long) this.field1553 > var5 && (long) var7 + var5 >= (long) this.field1553 + this.field1546) {
                    var15 = (long) this.field1553 + this.field1546;
                } else if (this.field1546 < (long) var7 + var5 && (long) this.field1553 + this.field1546 >= (long) var7 + var5) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class105.method818(this.field1544, (int) (var13 - this.field1546), arg3, var8 + (int) (var13 - var5), var17);
                    if (this.field1552 < var15) {
                        arg1 = (int) ((long) arg1 + this.field1552 - var15);
                        this.field1552 = var15;
                    }
                }
            }
            if (arg2 > -66) {
                this.method505(-117);
            }
        } catch (IOException var19) {
            this.field1538 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)V")
    public final void method511(int arg0, long arg1) throws IOException {
        if (arg0 != -24756) {
            this.field1553 = 80;
        }
        field1536++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method512(arg0 + 24806));
        }
        this.field1552 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method512(int arg0) {
        if (arg0 != 50) {
            field1565 = -109;
        }
        field1558++;
        return this.field1548.method863(90);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    private final void method513(boolean arg0) throws IOException {
        if (arg0) {
            this.field1535 = -57L;
        }
        if (this.field1546 != -1L) {
            if (this.field1546 != this.field1538) {
                this.field1548.method861(this.field1546, (byte) 122);
                this.field1538 = this.field1546;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field1548.method860(this.field1544, (byte) 56, this.field1553, 0);
            if (this.field1551 < (long) this.field1553 + this.field1546 && (long) this.field1549 + this.field1551 >= (long) this.field1553 + this.field1546) {
                var4 = (long) this.field1553 + this.field1546;
            } else if ((long) this.field1549 + this.field1551 > this.field1546 && this.field1546 + (long) this.field1553 >= (long) this.field1549 + this.field1551) {
                var4 = this.field1551 + (long) this.field1549;
            }
            if (this.field1551 <= this.field1546 && this.field1551 + (long) this.field1549 > this.field1546) {
                var2 = this.field1546;
            } else if (this.field1551 >= this.field1546 && this.field1551 < this.field1546 + (long) this.field1553) {
                var2 = this.field1551;
            }
            this.field1538 += this.field1553;
            if (this.field1538 > this.field1559) {
                this.field1559 = this.field1538;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class105.method818(this.field1544, (int) (var2 - this.field1546), this.field1545, (int) (var2 - this.field1551), var6);
            }
            this.field1553 = 0;
            this.field1546 = -1L;
        }
        field1560++;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lpf;II)V")
    public class61(class110 arg0, int arg1, int arg2) throws IOException {
        this.field1548 = arg0;
        this.field1535 = this.field1559 = arg0.method859(21528);
        this.field1552 = 0L;
        this.field1545 = new byte[arg1];
        this.field1544 = new byte[arg2];
    }
}
