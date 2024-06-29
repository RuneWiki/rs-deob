import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 {

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "J")
    private long field96 = -1L;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "J")
    private long field99 = -1L;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field115 = 0;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lo;")
    private class235 field94;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "J")
    private long field112;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "J")
    private long field102;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[B")
    private byte[] field107;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[B")
    private byte[] field97;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "J")
    private long field120;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Leb;")
    public static class230 field100 = class68.method589(0, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Leb;")
    public static class230 field98 = class68.method589(0, "null");

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Leb;")
    public static class230 field101 = class68.method589(0, "blaugr-Un:");

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Leb;")
    public static class230 field90 = class68.method589(0, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field92 = -1;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field114 = 0;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "[Lfk;")
    public static class14[] field108 = new class14[2048];

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[I")
    public static int[] field89 = new int[5];

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lik;")
    public static class248 field91 = new class248();

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Leb;")
    private static class230 field122 = class68.method589(0, "Loaded fonts");

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "Leb;")
    public static class230 field123 = field122;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "J")
    private long field88;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "[I")
    public static int[] field124;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)J")
    public final long method64(byte arg0) {
        field109++;
        if (arg0 != 102) {
            field114 = 48;
        }
        return this.field102;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    private final void method65(byte arg0) throws IOException {
        if (arg0 != -35) {
            return;
        }
        this.field104 = 0;
        field110++;
        if (this.field88 != this.field120) {
            this.field94.method1658(-10803, this.field120);
            this.field88 = this.field120;
        }
        this.field96 = this.field120;
        while (this.field104 < this.field97.length) {
            int var2 = this.field97.length - this.field104;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field94.method1656(var2, -31517, this.field104, this.field97);
            if (var3 == -1) {
                break;
            }
            this.field88 += (long) var3;
            this.field104 += var3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public final void method66(int arg0) throws IOException {
        this.method68(-30625);
        field105++;
        int var2 = -112 % ((arg0 + 16) / 53);
        this.field94.method1654(43);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIB)Lka;")
    public static final class245 method67(int arg0, int arg1, byte arg2) {
        field93++;
        class245 var3 = class155.method1183(arg1, 17);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field4318 == null || var3.field4318.length <= arg0) {
            return null;
        } else if (arg2 == -69) {
            return var3.field4318[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    private final void method68(int arg0) throws IOException {
        if (this.field99 != -1L) {
            if (this.field99 != this.field88) {
                this.field94.method1658(-10803, this.field99);
                this.field88 = this.field99;
            }
            long var2 = -1L;
            this.field94.method1657(28825, this.field115, 0, this.field107);
            if (this.field99 >= this.field96 && this.field96 + ((long) this.field104) > this.field99) {
                var2 = this.field99;
            } else if (this.field96 >= this.field99 && (long) this.field115 + this.field99 > this.field96) {
                var2 = this.field96;
            }
            this.field88 += (long) this.field115;
            long var4 = -1L;
            if (this.field88 > this.field112) {
                this.field112 = this.field88;
            }
            if (((long) this.field115 + this.field99) > this.field96 && (this.field99 + ((long) this.field115)) <= ((long) this.field104 + this.field96)) {
                var4 = (long) this.field115 + this.field99;
            } else if (this.field96 + ((long) this.field104) > this.field99 && (long) this.field104 + this.field96 <= (long) this.field115 + this.field99) {
                var4 = (long) this.field104 + this.field96;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class43.method376(this.field107, (int) (var2 - this.field99), this.field97, (int) (var2 - this.field96), var6);
            }
            this.field115 = 0;
            this.field99 = -1L;
        }
        field121++;
        if (arg0 != -30625) {
            method76(-117, -126);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JI)V")
    public final void method69(long arg0, int arg1) throws IOException {
        if (arg1 != -1) {
            return;
        }
        field106++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method74((byte) 63));
        }
        this.field120 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static void method70(int arg0) {
        field122 = null;
        field123 = null;
        field101 = null;
        field98 = null;
        field108 = null;
        field89 = null;
        field91 = null;
        field90 = null;
        field124 = null;
        if (arg0 < -111) {
            field100 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B[B)V")
    public final void method71(byte arg0, byte[] arg1) throws IOException {
        if (arg0 < 56) {
            field89 = null;
        }
        this.method73(arg1.length, -12312, arg1, 0);
        field95++;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public static final void method72(int arg0) {
        if (arg0 < -25) {
            class210.field3663.method462(-14333);
            class173.field3058 = 1;
            class141.field2533 = null;
            field113++;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[BI)V")
    public final void method73(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field118++;
        try {
            if ((arg0 + arg3) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg2.length);
            }
            if (this.field99 != -1L && this.field99 <= this.field120 && ((long) arg0 + this.field120) <= (this.field99 + ((long) this.field115))) {
                class43.method376(this.field107, (int) (this.field120 - this.field99), arg2, arg3, arg0);
                this.field120 += (long) arg0;
                return;
            }
            int var5 = arg3;
            long var6 = this.field120;
            int var8 = arg0;
            if (this.field120 >= this.field96 && ((long) this.field104 + this.field96) > this.field120) {
                int var9 = (int) ((long) this.field104 + this.field96 - this.field120);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class43.method376(this.field97, (int) (this.field120 - this.field96), arg2, arg3, var9);
                this.field120 += (long) var9;
                arg0 -= var9;
                arg3 += var9;
            }
            if (arg0 > this.field97.length) {
                this.field94.method1658(-10803, this.field120);
                this.field88 = this.field120;
                while (arg0 > 0) {
                    int var11 = this.field94.method1656(arg0, -31517, arg3, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field88 += (long) var11;
                    arg3 += var11;
                    arg0 -= var11;
                    this.field120 += (long) var11;
                }
            } else if (arg0 > 0) {
                this.method65((byte) -35);
                int var10 = arg0;
                if (this.field104 < arg0) {
                    var10 = this.field104;
                }
                arg0 -= var10;
                class43.method376(this.field97, 0, arg2, arg3, var10);
                arg3 += var10;
                this.field120 += (long) var10;
            }
            if (this.field99 != -1L) {
                if (this.field99 > this.field120 && arg0 > 0) {
                    int var12 = (int) (this.field99 - this.field120) + arg3;
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0--;
                        arg2[arg3++] = 0;
                        this.field120++;
                    }
                }
                long var13 = -1L;
                if (((long) this.field115 + this.field99) > var6 && ((long) var8 + var6) >= ((long) this.field115 + this.field99)) {
                    var13 = (long) this.field115 + this.field99;
                } else if (this.field99 < (long) var8 + var6 && var6 + ((long) var8) <= (long) this.field115 + this.field99) {
                    var13 = var6 + ((long) var8);
                }
                long var15 = -1L;
                if (this.field99 >= var6 && this.field99 < ((long) var8 + var6)) {
                    var15 = this.field99;
                } else if (var6 >= this.field99 && var6 < ((long) this.field115 + this.field99)) {
                    var15 = var6;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class43.method376(this.field107, (int) (var15 - this.field99), arg2, (int) (var15 - var6) + var5, var17);
                    if (this.field120 < var13) {
                        arg0 = (int) ((long) arg0 - (var13 - this.field120));
                        this.field120 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field88 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        } else if (arg1 != -12312) {
            method76(123, 30);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)Ljava/io/File;")
    private final File method74(byte arg0) {
        field111++;
        int var2 = -100 % ((-arg0 - 52) / 38);
        return this.field94.method1659(-17195);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II[BI)V")
    public final void method75(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field103++;
        try {
            if (this.field102 < ((long) arg0 + this.field120)) {
                this.field102 = (long) arg0 + this.field120;
            }
            if (this.field99 != -1L && (this.field120 < this.field99 || ((long) this.field115 + this.field99) < this.field120)) {
                this.method68(-30625);
            }
            if (this.field99 != -1L && this.field120 + ((long) arg0) > (long) this.field107.length + this.field99) {
                int var5 = (int) (this.field99 + (long) this.field107.length - this.field120);
                arg0 -= var5;
                class43.method376(arg2, arg3, this.field107, (int) (this.field120 - this.field99), var5);
                arg3 += var5;
                this.field120 += (long) var5;
                this.field115 = this.field107.length;
                this.method68(-30625);
            }
            if (arg1 != 25733) {
                method70(-99);
            }
            if (arg0 > this.field107.length) {
                if (this.field88 != this.field120) {
                    this.field94.method1658(-10803, this.field120);
                    this.field88 = this.field120;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field94.method1657(arg1 + 3092, arg0, arg3, arg2);
                if (this.field96 <= this.field120 && ((long) this.field104 + this.field96) > this.field120) {
                    var6 = this.field120;
                } else if (this.field96 >= this.field120 && this.field96 < (this.field120 + ((long) arg0))) {
                    var6 = this.field96;
                }
                if (((long) arg0 + this.field120) > this.field96 && ((long) arg0 + this.field120) <= (this.field96 + ((long) this.field104))) {
                    var8 = this.field120 + ((long) arg0);
                } else if (this.field120 < ((long) this.field104 + this.field96) && ((long) arg0 + this.field120) >= (this.field96 + ((long) this.field104))) {
                    var8 = (long) this.field104 + this.field96;
                }
                this.field88 += (long) arg0;
                if (this.field112 < this.field88) {
                    this.field112 = this.field88;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class43.method376(arg2, (int) ((long) arg3 + var6 - this.field120), this.field97, (int) (var6 - this.field96), var10);
                }
                this.field120 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field99 == -1L) {
                    this.field99 = this.field120;
                }
                class43.method376(arg2, arg3, this.field107, (int) (this.field120 - this.field99), arg0);
                this.field120 += (long) arg0;
                if (this.field120 - this.field99 > (long) this.field115) {
                    this.field115 = (int) (this.field120 - this.field99);
                }
            }
        } catch (IOException var12) {
            this.field88 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public static final void method76(int arg0, int arg1) {
        class205.field3613.method1121(0, arg0);
        client.field2720.method1121(0, arg0);
        field116++;
        class142.field2560.method1121(arg1 ^ arg1, arg0);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lo;II)V")
    public class7(class235 arg0, int arg1, int arg2) throws IOException {
        this.field94 = arg0;
        this.field102 = this.field112 = arg0.method1655(26852);
        this.field107 = new byte[arg2];
        this.field97 = new byte[arg1];
        this.field120 = 0L;
    }
}
