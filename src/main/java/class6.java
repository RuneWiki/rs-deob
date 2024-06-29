import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "J")
    private long field91 = -1L;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "J")
    private long field96 = -1L;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    private int field105 = 0;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lst;")
    private class302 field98;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "J")
    private long field100;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "J")
    private long field97;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "J")
    private long field88;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[B")
    private byte[] field90;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "[B")
    private byte[] field108;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field95 = -1;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Leh;")
    public static class246 field106 = new class246(82, 7);

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Lkn;")
    public static class530 field107 = new class530("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "J")
    private long field111;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    private final void method37(int arg0) throws IOException {
        if (arg0 != -27292) {
            this.field96 = 33L;
        }
        if (this.field91 != -1L) {
            if (this.field91 != this.field111) {
                this.field98.method1841(this.field91, (byte) -99);
                this.field111 = this.field91;
            }
            this.field98.method1845((byte) -104, 0, this.field105, this.field90);
            this.field111 += this.field105;
            if (this.field111 > this.field100) {
                this.field100 = this.field111;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field91 >= this.field96 && this.field91 < this.field96 + ((long) this.field92)) {
                var2 = this.field91;
            } else if (this.field91 <= this.field96 && this.field96 < (long) this.field105 + this.field91) {
                var2 = this.field96;
            }
            if ((long) this.field105 + this.field91 > this.field96 && (long) this.field92 + this.field96 >= (long) this.field105 + this.field91) {
                var4 = (long) this.field105 + this.field91;
            } else if ((long) this.field92 + this.field96 > this.field91 && (this.field91 + ((long) this.field105)) >= ((long) this.field92 + this.field96)) {
                var4 = this.field96 + ((long) this.field92);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class182.method1135(this.field90, (int) (var2 - this.field91), this.field108, (int) (var2 - this.field96), var6);
            }
            this.field91 = -1L;
            this.field105 = 0;
        }
        field104++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI[BI)V")
    public final void method38(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field102++;
        try {
            if (arg1 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field91 != -1L && this.field91 <= this.field88 && (long) arg3 + this.field88 <= (long) this.field105 + this.field91) {
                class182.method1135(this.field90, (int) (this.field88 - this.field91), arg2, arg1, arg3);
                this.field88 += arg3;
                return;
            }
            long var5 = this.field88;
            int var7 = arg1;
            if (arg0 > -40) {
                this.field88 = 25L;
            }
            int var8 = arg3;
            if (this.field96 <= this.field88 && this.field88 < ((long) this.field92 + this.field96)) {
                int var9 = (int) (this.field96 + (long) this.field92 - this.field88);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class182.method1135(this.field108, (int) (this.field88 - this.field96), arg2, arg1, var9);
                arg3 -= var9;
                arg1 += var9;
                this.field88 += var9;
            }
            if (arg3 > this.field108.length) {
                this.field98.method1841(this.field88, (byte) -99);
                this.field111 = this.field88;
                while (arg3 > 0) {
                    int var10 = this.field98.method1842(arg1, (byte) 39, arg2, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field111 += var10;
                    this.field88 += var10;
                    arg1 += var10;
                }
            } else if (arg3 > 0) {
                this.method41((byte) -100);
                int var11 = arg3;
                if (arg3 > this.field92) {
                    var11 = this.field92;
                }
                class182.method1135(this.field108, 0, arg2, arg1, var11);
                arg1 += var11;
                this.field88 += var11;
                arg3 -= var11;
            }
            if (this.field91 != -1L) {
                if (this.field88 < this.field91 && arg3 > 0) {
                    int var12 = (int) (this.field91 - this.field88) + arg1;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg2[arg1++] = 0;
                        this.field88++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field91 && ((long) var8 + var5) > this.field91) {
                    var13 = this.field91;
                } else if (this.field91 <= var5 && (this.field91 + ((long) this.field105)) > var5) {
                    var13 = var5;
                }
                if (((long) this.field105 + this.field91) > var5 && (this.field91 + ((long) this.field105)) <= ((long) var8 + var5)) {
                    var15 = this.field91 + ((long) this.field105);
                } else if (this.field91 < ((long) var8 + var5) && (long) this.field105 + this.field91 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class182.method1135(this.field90, (int) (var13 - this.field91), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field88) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field88));
                        this.field88 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field111 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[BI)V")
    public final void method39(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field89++;
        try {
            if (this.field97 < ((long) arg0 + this.field88)) {
                this.field97 = this.field88 + ((long) arg0);
            }
            if (this.field91 != -1L && (this.field88 < this.field91 || ((long) this.field105 + this.field91) < this.field88)) {
                this.method37(-27292);
            }
            if ((long) arg3 != this.field91 && (long) this.field90.length + this.field91 < (long) arg0 + this.field88) {
                int var5 = (int) (this.field91 + (long) this.field90.length - this.field88);
                class182.method1135(arg2, arg1, this.field90, (int) (this.field88 - this.field91), var5);
                this.field88 += var5;
                arg0 -= var5;
                arg1 += var5;
                this.field105 = this.field90.length;
                this.method37(-27292);
            }
            if (arg0 > this.field90.length) {
                if (this.field88 != this.field111) {
                    this.field98.method1841(this.field88, (byte) -99);
                    this.field111 = this.field88;
                }
                this.field98.method1845((byte) -125, arg1, arg0, arg2);
                this.field111 += arg0;
                if (this.field100 < this.field111) {
                    this.field100 = this.field111;
                }
                long var6 = -1L;
                if (this.field96 <= this.field88 && ((long) this.field92 + this.field96) > this.field88) {
                    var6 = this.field88;
                } else if (this.field96 >= this.field88 && ((long) arg0 + this.field88) > this.field96) {
                    var6 = this.field96;
                }
                long var8 = -1L;
                if (((long) arg0 + this.field88) > this.field96 && ((long) arg0 + this.field88) <= ((long) this.field92 + this.field96)) {
                    var8 = (long) arg0 + this.field88;
                } else if (((long) this.field92 + this.field96) > this.field88 && this.field96 + ((long) this.field92) <= this.field88 - -((long) arg0)) {
                    var8 = this.field96 + ((long) this.field92);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class182.method1135(arg2, (int) ((long) arg1 + var6 - this.field88), this.field108, (int) (var6 - this.field96), var10);
                }
                this.field88 += arg0;
            } else if (arg0 > 0) {
                if (this.field91 == -1L) {
                    this.field91 = this.field88;
                }
                class182.method1135(arg2, arg1, this.field90, (int) (this.field88 - this.field91), arg0);
                this.field88 += arg0;
                if (((long) this.field105) < (this.field88 - this.field91)) {
                    this.field105 = (int) (this.field88 - this.field91);
                }
            }
        } catch (IOException var12) {
            this.field111 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method40(byte arg0) {
        if (arg0 > -7) {
            return null;
        } else {
            field110++;
            return this.field98.method1846((byte) 91);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    private final void method41(byte arg0) throws IOException {
        this.field92 = 0;
        int var2 = -88 / ((-arg0 - 37) / 60);
        field103++;
        if (this.field88 != this.field111) {
            this.field98.method1841(this.field88, (byte) -99);
            this.field111 = this.field88;
        }
        this.field96 = this.field88;
        while (this.field92 < this.field108.length) {
            int var3 = this.field108.length - this.field92;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field98.method1842(this.field92, (byte) 39, this.field108, var3);
            if (var4 == -1) {
                break;
            }
            this.field92 += var4;
            this.field111 += var4;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method42(int arg0) {
        field107 = null;
        field106 = null;
        if (arg0 != 0) {
            field106 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
    public final void method43(byte[] arg0, int arg1) throws IOException {
        field94++;
        this.method38((byte) -46, 0, arg0, arg0.length);
        int var3 = 10 / ((54 - arg1) / 35);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)V")
    public final void method44(long arg0, int arg1) throws IOException {
        field93++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method40((byte) -123));
        }
        this.field88 = arg0;
        if (arg1 != -30985) {
            this.field100 = 12L;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)J")
    public final long method45(byte arg0) {
        int var2 = -92 / ((-arg0 - 8) / 38);
        field101++;
        return this.field97;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lst;II)V")
    public class6(class302 arg0, int arg1, int arg2) throws IOException {
        this.field98 = arg0;
        this.field97 = this.field100 = arg0.method1843(82);
        this.field88 = 0L;
        this.field90 = new byte[arg2];
        this.field108 = new byte[arg1];
    }
}
