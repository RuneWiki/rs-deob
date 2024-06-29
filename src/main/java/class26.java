import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 {

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    private int field679 = 0;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "J")
    private long field668 = -1L;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "J")
    private long field695 = -1L;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Lpc;")
    private class107 field678;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "J")
    private long field669;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "J")
    private long field684;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "[B")
    private byte[] field674;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[B")
    private byte[] field699;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "J")
    private long field676;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lod;")
    public static class101 field661 = class46.method335(-86, "sl_stars");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[Z")
    public static boolean[] field659 = new boolean[8];

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lod;")
    public static class101 field672 = class46.method335(113, "");

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lod;")
    public static class101 field675 = class46.method335(-96, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lod;")
    public static class101 field667 = field672;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field680 = -1;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Lod;")
    public static class101 field683 = class46.method335(84, "jolt");

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lod;")
    private static class101 field666 = class46.method335(-54, "FULL");

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lod;")
    public static class101 field663 = class46.method335(63, "Art");

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field681 = 0;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "Lod;")
    public static class101 field687 = class46.method335(98, " <col=ffffff>");

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "Lod;")
    private static class101 field686 = class46.method335(-101, "Examine");

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lod;")
    public static class101 field670 = field666;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Lod;")
    public static class101 field694 = field686;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "J")
    private long field664;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Lsa;")
    public static class126 field698;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method206(byte arg0) {
        field698 = null;
        field667 = null;
        if (arg0 >= -60) {
            field663 = null;
        }
        field672 = null;
        field687 = null;
        field686 = null;
        field663 = null;
        field670 = null;
        field666 = null;
        field683 = null;
        field661 = null;
        field694 = null;
        field675 = null;
        field659 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB[BI)V")
    public final void method207(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field662++;
        try {
            if ((long) arg0 + this.field676 > this.field684) {
                this.field684 = (long) arg0 + this.field676;
            }
            if (arg1 == -96) {
                if (this.field668 != -1L && (this.field676 < this.field668 || (long) this.field679 + this.field668 < this.field676)) {
                    this.method211((byte) -122);
                }
                if (this.field668 != -1L && (long) arg0 + this.field676 > (long) this.field699.length + this.field668) {
                    int var5 = (int) (this.field668 + (long) this.field699.length - this.field676);
                    class60.method417(arg2, arg3, this.field699, (int) (this.field676 - this.field668), var5);
                    arg3 += var5;
                    arg0 -= var5;
                    this.field676 += var5;
                    this.field679 = this.field699.length;
                    this.method211((byte) -113);
                }
                if (arg0 > this.field699.length) {
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field676 != this.field664) {
                        this.field678.method767(115, this.field676);
                        this.field664 = this.field676;
                    }
                    this.field678.method766((byte) 107, arg3, arg2, arg0);
                    this.field664 += arg0;
                    if ((long) arg0 + this.field676 > this.field695 && (long) arg0 + this.field676 <= (long) this.field673 + this.field695) {
                        var8 = (long) arg0 + this.field676;
                    } else if (this.field676 < this.field695 + (long) this.field673 && (long) arg0 + this.field676 >= this.field695 - -((long) this.field673)) {
                        var8 = this.field695 + (long) this.field673;
                    }
                    if (this.field664 > this.field669) {
                        this.field669 = this.field664;
                    }
                    if (this.field676 >= this.field695 && this.field676 < (long) this.field673 + this.field695) {
                        var6 = this.field676;
                    } else if (this.field695 >= this.field676 && (long) arg0 + this.field676 > this.field695) {
                        var6 = this.field695;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class60.method417(arg2, (int) ((long) arg3 + var6 - this.field676), this.field674, (int) (var6 - this.field695), var10);
                    }
                    this.field676 += arg0;
                } else if (arg0 > 0) {
                    if (this.field668 == -1L) {
                        this.field668 = this.field676;
                    }
                    class60.method417(arg2, arg3, this.field699, (int) (this.field676 - this.field668), arg0);
                    this.field676 += arg0;
                    if (this.field676 - this.field668 > (long) this.field679) {
                        this.field679 = (int) (this.field676 - this.field668);
                    }
                }
            }
        } catch (IOException var12) {
            this.field664 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
    public static final void method208(byte arg0, int arg1) {
        int var2 = -28 / ((arg0 - 10) / 35);
        field693++;
        if (arg1 == -1 || !class67.field1501[arg1]) {
            return;
        }
        class35.field892.method124(20, arg1);
        if (class100.field2161[arg1] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class100.field2161[arg1].length; var4++) {
            if (class100.field2161[arg1][var4] != null) {
                if (class100.field2161[arg1][var4].field2782 == 2) {
                    var3 = false;
                } else {
                    class100.field2161[arg1][var4] = null;
                }
            }
        }
        if (var3) {
            class100.field2161[arg1] = null;
        }
        class67.field1501[arg1] = false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[Lod;)[Lod;")
    public static final class101[] method209(int arg0, class101[] arg1) {
        field660++;
        class101[] var2 = new class101[5];
        int var3 = 0;
        if (arg0 != -8940) {
            return null;
        }
        while (var3 < 5) {
            var2[var3] = class15.method101(-59, new class101[] { class82.method592(false, var3), class106.field2293 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class15.method101(92, new class101[] { var2[var3], arg1[var3] });
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)J")
    public final long method210(int arg0) {
        field696++;
        return arg0 >= -47 ? 126L : this.field684;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    private final void method211(byte arg0) throws IOException {
        field697++;
        if (arg0 > -107) {
            method208((byte) -34, 127);
        }
        if (this.field668 == -1L) {
            return;
        }
        if (this.field668 != this.field664) {
            this.field678.method767(90, this.field668);
            this.field664 = this.field668;
        }
        this.field678.method766((byte) 101, 0, this.field699, this.field679);
        this.field664 += this.field679;
        long var2 = -1L;
        if (this.field668 >= this.field695 && this.field668 < this.field695 + (long) this.field673) {
            var2 = this.field668;
        } else if (this.field668 <= this.field695 && this.field695 < (long) this.field679 + this.field668) {
            var2 = this.field695;
        }
        if (this.field664 > this.field669) {
            this.field669 = this.field664;
        }
        long var4 = -1L;
        if (this.field695 < (long) this.field679 + this.field668 && (long) this.field679 + this.field668 <= (long) this.field673 + this.field695) {
            var4 = (long) this.field679 + this.field668;
        } else if (this.field668 < (long) this.field673 + this.field695 && (long) this.field673 + this.field695 <= (long) this.field679 + this.field668) {
            var4 = this.field695 + (long) this.field673;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class60.method417(this.field699, (int) (var2 - this.field668), this.field674, (int) (var2 - this.field695), var6);
        }
        this.field679 = 0;
        this.field668 = -1L;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public final void method212(byte arg0) throws IOException {
        this.method211((byte) -113);
        if (arg0 > -50) {
            method208((byte) 28, 92);
        }
        this.field678.method769((byte) -107);
        field682++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
    public final void method213(long arg0, int arg1) throws IOException {
        field691++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method215((byte) 76));
        }
        this.field676 = arg0;
        if (arg1 != -1829) {
            field680 = 51;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BIII)V")
    public final void method214(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field671++;
        try {
            if (arg0.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field668 != -1L && this.field676 >= this.field668 && this.field676 + (long) arg3 <= this.field668 - -((long) this.field679)) {
                class60.method417(this.field699, (int) (this.field676 - this.field668), arg0, arg1, arg3);
                this.field676 += arg3;
                return;
            }
            long var5 = this.field676;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field676 >= this.field695 && (long) this.field673 + this.field695 > this.field676) {
                int var9 = (int) ((long) this.field673 + this.field695 - this.field676);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class60.method417(this.field674, (int) (this.field676 - this.field695), arg0, arg1, var9);
                this.field676 += var9;
                arg1 += var9;
            }
            if (this.field674.length < arg3) {
                this.field678.method767(arg2 + 63, this.field676);
                this.field664 = this.field676;
                while (arg3 > 0) {
                    int var10 = this.field678.method768(arg0, (byte) 72, arg3, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    arg1 += var10;
                    this.field664 += var10;
                    this.field676 += var10;
                }
            } else if (arg3 > 0) {
                this.method217(-94);
                int var11 = arg3;
                if (arg3 > this.field673) {
                    var11 = this.field673;
                }
                arg3 -= var11;
                class60.method417(this.field674, 0, arg0, arg1, var11);
                this.field676 += var11;
                arg1 += var11;
            }
            if (this.field668 != -1L) {
                if (this.field668 > this.field676 && arg3 > 0) {
                    int var12 = (int) (this.field668 - this.field676) + arg1;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg3--;
                        arg0[arg1++] = 0;
                        this.field676++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if ((long) this.field679 + this.field668 > var5 && var5 + (long) var8 >= this.field668 - -((long) this.field679)) {
                    var15 = (long) this.field679 + this.field668;
                } else if (this.field668 < (long) var8 + var5 && (long) var8 + var5 <= (long) this.field679 + this.field668) {
                    var15 = (long) var8 + var5;
                }
                if (this.field668 >= var5 && this.field668 < (long) var8 + var5) {
                    var13 = this.field668;
                } else if (var5 >= this.field668 && this.field668 + (long) this.field679 > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class60.method417(this.field699, (int) (var13 - this.field668), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field676) {
                        arg3 = (int) ((long) arg3 + this.field676 - var15);
                        this.field676 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field664 = -1L;
            throw var19;
        }
        if (~arg3 < arg2) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)Ljava/io/File;")
    private final File method215(byte arg0) {
        if (arg0 < 63) {
            return null;
        } else {
            field688++;
            return this.field678.method771(true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)V")
    public final void method216(byte[] arg0, byte arg1) throws IOException {
        if (arg1 == -71) {
            this.method214(arg0, 0, -1, arg0.length);
            field689++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    private final void method217(int arg0) throws IOException {
        this.field673 = 0;
        if (this.field676 != this.field664) {
            this.field678.method767(94, this.field676);
            this.field664 = this.field676;
        }
        if (arg0 > -77) {
            return;
        }
        this.field695 = this.field676;
        field685++;
        while (this.field673 < this.field674.length) {
            int var2 = this.field678.method768(this.field674, (byte) 92, this.field674.length - this.field673, this.field673);
            if (var2 == -1) {
                break;
            }
            this.field673 += var2;
            this.field664 += var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lpc;II)V")
    public class26(class107 arg0, int arg1, int arg2) throws IOException {
        this.field678 = arg0;
        this.field684 = this.field669 = arg0.method770((byte) 111);
        this.field674 = new byte[arg1];
        this.field699 = new byte[arg2];
        this.field676 = 0L;
    }
}
