import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "w", descriptor = "J")
    private long field41 = -1L;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    private int field20 = 0;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "J")
    private long field43 = -1L;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Lph;")
    private class315 field31;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "J")
    private long field28;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "J")
    private long field40;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[B")
    private byte[] field21;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "J")
    private long field33;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[B")
    private byte[] field27;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
    public static boolean field26 = false;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Ltl;")
    public static class59 field32 = class85.method639("Lade Benutzeroberfl-=che )2 ", 9588);

    @OriginalMember(owner = "client!el", name = "r", descriptor = "Ltl;")
    public static class59 field36 = class85.method639("leuchten2:", 9588);

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Lma;")
    public static class263 field42 = null;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "J")
    private long field35;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[BI)V", line = 12)
    public final void method15(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field22++;
        if (arg1 != 916062416) {
            this.method23(28);
        }
        try {
            if (this.field40 < (this.field33 + ((long) arg3))) {
                this.field40 = (long) arg3 + this.field33;
            }
            if (this.field43 != -1L && (this.field33 < this.field43 || this.field33 > ((long) this.field20 + this.field43))) {
                this.method16(false);
            }
            if (this.field43 != -1L && (long) this.field21.length + this.field43 < (long) arg3 + this.field33) {
                int var5 = (int) ((long) this.field21.length + this.field43 - this.field33);
                class63.method520(arg2, arg0, this.field21, (int) (this.field33 - this.field43), var5);
                arg0 += var5;
                this.field33 += (long) var5;
                arg3 -= var5;
                this.field20 = this.field21.length;
                this.method16(false);
            }
            if (arg3 > this.field21.length) {
                if (this.field35 != this.field33) {
                    this.field31.method2168(this.field33, (byte) 92);
                    this.field35 = this.field33;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field31.method2170((byte) 127, arg0, arg3, arg2);
                if (this.field41 <= this.field33 && ((long) this.field39 + this.field41) > this.field33) {
                    var8 = this.field33;
                } else if (this.field41 >= this.field33 && this.field41 < (long) arg3 + this.field33) {
                    var8 = this.field41;
                }
                this.field35 += (long) arg3;
                if (((long) arg3 + this.field33) > this.field41 && ((long) arg3 + this.field33) <= ((long) this.field39 + this.field41)) {
                    var6 = this.field33 + ((long) arg3);
                } else if (((long) this.field39 + this.field41) > this.field33 && ((long) arg3 + this.field33) >= ((long) this.field39 + this.field41)) {
                    var6 = this.field41 + ((long) this.field39);
                }
                if (this.field28 < this.field35) {
                    this.field28 = this.field35;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class63.method520(arg2, (int) ((long) arg0 + var8 - this.field33), this.field27, (int) (var8 - this.field41), var10);
                }
                this.field33 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field43 == -1L) {
                    this.field43 = this.field33;
                }
                class63.method520(arg2, arg0, this.field21, (int) (this.field33 - this.field43), arg3);
                this.field33 += (long) arg3;
                if (((long) this.field20) < (this.field33 - this.field43)) {
                    this.field20 = (int) (this.field33 - this.field43);
                }
            }
        } catch (IOException var12) {
            this.field35 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 137)
    private final void method16(boolean arg0) throws IOException {
        if (this.field43 != -1L) {
            if (this.field43 != this.field35) {
                this.field31.method2168(this.field43, (byte) 98);
                this.field35 = this.field43;
            }
            this.field31.method2170((byte) 116, 0, this.field20, this.field21);
            this.field35 += (long) this.field20;
            long var2 = -1L;
            if (this.field28 < this.field35) {
                this.field28 = this.field35;
            }
            if (this.field43 >= this.field41 && this.field43 < (long) this.field39 + this.field41) {
                var2 = this.field43;
            } else if (this.field41 >= this.field43 && this.field41 < ((long) this.field20 + this.field43)) {
                var2 = this.field41;
            }
            long var4 = -1L;
            if (((long) this.field20 + this.field43) > this.field41 && (this.field43 + ((long) this.field20)) <= (this.field41 + ((long) this.field39))) {
                var4 = (long) this.field20 + this.field43;
            } else if (this.field43 < (long) this.field39 + this.field41 && (long) this.field20 + this.field43 >= (long) this.field39 + this.field41) {
                var4 = (long) this.field39 + this.field41;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class63.method520(this.field21, (int) (var2 - this.field43), this.field27, (int) (var2 - this.field41), var6);
            }
            this.field43 = -1L;
            this.field20 = 0;
        }
        if (!arg0) {
            field30++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 229)
    public final void method17(int arg0) throws IOException {
        this.method16(false);
        if (arg0 != -1) {
            this.method23(109);
        }
        field25++;
        this.field31.method2169((byte) 70);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[BII)V", line = 242)
    public final void method18(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field29++;
        try {
            if ((arg0 + arg2) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 - (arg1.length - arg2));
            }
            if (this.field43 != -1L && this.field33 >= this.field43 && (this.field33 + ((long) arg2)) <= ((long) this.field20 + this.field43)) {
                class63.method520(this.field21, (int) (this.field33 - this.field43), arg1, arg0, arg2);
                this.field33 += (long) arg2;
                return;
            }
            long var5 = this.field33;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field33 >= this.field41 && this.field33 < ((long) this.field39 + this.field41)) {
                int var9 = (int) (this.field41 + (long) this.field39 - this.field33);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class63.method520(this.field27, (int) (this.field33 - this.field41), arg1, arg0, var9);
                arg0 += var9;
                this.field33 += (long) var9;
                arg2 -= var9;
            }
            if (this.field27.length < arg2) {
                this.field31.method2168(this.field33, (byte) 118);
                this.field35 = this.field33;
                while (arg2 > 0) {
                    int var11 = this.field31.method2172(arg2, arg0, false, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    this.field33 += (long) var11;
                    this.field35 += (long) var11;
                    arg0 += var11;
                }
            } else if (arg2 > 0) {
                this.method20(true);
                int var10 = arg2;
                if (arg2 > this.field39) {
                    var10 = this.field39;
                }
                arg2 -= var10;
                class63.method520(this.field27, 0, arg1, arg0, var10);
                this.field33 += (long) var10;
                arg0 += var10;
            }
            if (this.field43 != -1L) {
                if (this.field33 < this.field43 && arg2 > 0) {
                    int var12 = arg0 + ((int) (this.field43 - this.field33));
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg0) {
                        arg1[arg0++] = 0;
                        this.field33++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                if (this.field43 >= var5 && ((long) var7 + var5) > this.field43) {
                    var13 = this.field43;
                } else if (var5 >= this.field43 && this.field43 + ((long) this.field20) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field20 + this.field43) > var5 && (long) var7 + var5 >= (long) this.field20 + this.field43) {
                    var15 = (long) this.field20 + this.field43;
                } else if ((long) var7 + var5 > this.field43 && (long) var7 + var5 <= (long) this.field20 + this.field43) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class63.method520(this.field21, (int) (var13 - this.field43), arg1, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field33) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field33));
                        this.field33 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field35 = -1L;
            throw var19;
        }
        if (arg3 > ~arg2) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)J", line = 436)
    public final long method19(int arg0) {
        field37++;
        int var2 = 44 % ((-arg0 - 32) / 53);
        return this.field40;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)V", line = 448)
    private final void method20(boolean arg0) throws IOException {
        if (!arg0) {
            field36 = (class59) null;
        }
        field23++;
        this.field39 = 0;
        if (this.field35 != this.field33) {
            this.field31.method2168(this.field33, (byte) 124);
            this.field35 = this.field33;
        }
        this.field41 = this.field33;
        while (this.field27.length > this.field39) {
            int var2 = this.field27.length - this.field39;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field31.method2172(var2, this.field39, false, this.field27);
            if (var3 == -1) {
                break;
            }
            this.field39 += var3;
            this.field35 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 489)
    public static void method21(byte arg0) {
        field36 = null;
        field32 = null;
        field42 = null;
        if (arg0 != 1) {
            method21((byte) 26);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BJ)V", line = 504)
    public final void method22(byte arg0, long arg1) throws IOException {
        field34++;
        if (arg0 > -27) {
            this.field31 = (class315) null;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method23(-126));
        }
        this.field33 = arg1;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)Ljava/io/File;", line = 534)
    private final File method23(int arg0) {
        if (arg0 >= -113) {
            method21((byte) -100);
        }
        field38++;
        return this.field31.method2167((byte) 103);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([BI)V", line = 545)
    public final void method24(byte[] arg0, int arg1) throws IOException {
        if (arg1 >= -3) {
            field32 = (class59) null;
        }
        field19++;
        this.method18(0, arg0, arg0.length, -1);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lph;II)V", line = 576)
    public class3(class315 arg0, int arg1, int arg2) throws IOException {
        this.field31 = arg0;
        this.field40 = this.field28 = arg0.method2171(0);
        this.field21 = new byte[arg2];
        this.field33 = 0L;
        this.field27 = new byte[arg1];
    }
}
