import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class222 {

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "J")
    private long field3013 = -1L;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "J")
    private long field3018 = -1L;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    private int field3031 = 0;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "Lvm;")
    private class80 field3029;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "J")
    private long field3012;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "J")
    private long field3024;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "[B")
    private byte[] field3011;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "J")
    private long field3020;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "[B")
    private byte[] field3017;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    private int field3027;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "J")
    private long field3019;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
    private final void method1438(byte arg0) throws IOException {
        field3022++;
        this.field3027 = 0;
        if (this.field3020 != this.field3019) {
            this.field3029.method506((byte) 89, this.field3020);
            this.field3019 = this.field3020;
        }
        this.field3018 = this.field3020;
        while (this.field3011.length > this.field3027) {
            int var2 = this.field3011.length - this.field3027;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3029.method499(var2, this.field3011, this.field3027, true);
            if (var3 == -1) {
                break;
            }
            this.field3027 += var3;
            this.field3019 += var3;
        }
        int var4 = -58 / ((arg0 - 57) / 56);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([BB)V")
    public final void method1439(byte[] arg0, byte arg1) throws IOException {
        this.method1440(arg0, -95, arg0.length, 0);
        field3014++;
        if (arg1 != 56) {
            this.field3019 = 15L;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([BIII)V")
    public final void method1440(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3030++;
        try {
            if (arg1 > -93) {
                this.field3011 = null;
            }
            if ((arg2 + arg3) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field3013 != -1L && this.field3020 >= this.field3013 && (long) arg2 + this.field3020 <= (long) this.field3031 + this.field3013) {
                class642.method3480(this.field3017, (int) (this.field3020 - this.field3013), arg0, arg3, arg2);
                this.field3020 += arg2;
                return;
            }
            long var5 = this.field3020;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field3020 >= this.field3018 && this.field3020 < ((long) this.field3027 + this.field3018)) {
                int var9 = (int) (this.field3018 - (this.field3020 - (long) this.field3027));
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class642.method3480(this.field3011, (int) (this.field3020 - this.field3018), arg0, arg3, var9);
                arg3 += var9;
                arg2 -= var9;
                this.field3020 += var9;
            }
            if (arg2 > this.field3011.length) {
                this.field3029.method506((byte) -112, this.field3020);
                this.field3019 = this.field3020;
                while (arg2 > 0) {
                    int var11 = this.field3029.method499(arg2, arg0, arg3, true);
                    if (var11 == -1) {
                        break;
                    }
                    this.field3020 += var11;
                    this.field3019 += var11;
                    arg2 -= var11;
                    arg3 += var11;
                }
            } else if (arg2 > 0) {
                this.method1438((byte) 120);
                int var10 = arg2;
                if (this.field3027 < arg2) {
                    var10 = this.field3027;
                }
                class642.method3480(this.field3011, 0, arg0, arg3, var10);
                arg2 -= var10;
                arg3 += var10;
                this.field3020 += var10;
            }
            if (this.field3013 != -1L) {
                if (this.field3013 > this.field3020 && arg2 > 0) {
                    int var12 = (int) (this.field3013 - this.field3020) + arg3;
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2--;
                        arg0[arg3++] = 0;
                        this.field3020++;
                    }
                }
                long var13 = -1L;
                if (this.field3013 >= var5 && this.field3013 < (long) var8 + var5) {
                    var13 = this.field3013;
                } else if (this.field3013 <= var5 && (long) this.field3031 + this.field3013 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field3031 + this.field3013 && (long) this.field3031 + this.field3013 <= (long) var8 + var5) {
                    var15 = (long) this.field3031 + this.field3013;
                } else if (((long) var8 + var5) > this.field3013 && ((long) var8 + var5) <= (this.field3013 + ((long) this.field3031))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class642.method3480(this.field3017, (int) (var13 - this.field3013), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field3020) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field3020));
                        this.field3020 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3019 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public final void method1441(int arg0) throws IOException {
        this.method1446(true);
        field3016++;
        this.field3029.method503((byte) 61);
        if (arg0 != -1) {
            this.field3011 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(JZ)V")
    public final void method1442(long arg0, boolean arg1) throws IOException {
        field3015++;
        if (arg1) {
            this.field3020 = 43L;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1444(853));
        }
        this.field3020 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[BI)V")
    public final void method1443(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3021++;
        try {
            if (((long) arg3 + this.field3020) > this.field3024) {
                this.field3024 = (long) arg3 + this.field3020;
            }
            if (this.field3013 != -1L && (this.field3020 < this.field3013 || this.field3020 > ((long) this.field3031 + this.field3013))) {
                this.method1446(true);
            }
            if (this.field3013 != -1L && ((long) this.field3017.length + this.field3013) < ((long) arg3 + this.field3020)) {
                int var5 = (int) (this.field3013 + (long) this.field3017.length - this.field3020);
                class642.method3480(arg2, arg0, this.field3017, (int) (this.field3020 - this.field3013), var5);
                arg3 -= var5;
                this.field3020 += var5;
                arg0 += var5;
                this.field3031 = this.field3017.length;
                this.method1446(true);
            }
            if (arg3 > this.field3017.length) {
                if (this.field3020 != this.field3019) {
                    this.field3029.method506((byte) 74, this.field3020);
                    this.field3019 = this.field3020;
                }
                this.field3029.method500(arg2, arg3, (byte) 0, arg0);
                this.field3019 += arg3;
                if (this.field3019 > this.field3012) {
                    this.field3012 = this.field3019;
                }
                long var6 = -1L;
                if (this.field3020 >= this.field3018 && (long) this.field3027 + this.field3018 > this.field3020) {
                    var6 = this.field3020;
                } else if (this.field3020 <= this.field3018 && ((long) arg3 + this.field3020) > this.field3018) {
                    var6 = this.field3018;
                }
                long var8 = -1L;
                if ((long) arg3 + this.field3020 > this.field3018 && this.field3020 + ((long) arg3) <= (long) this.field3027 + this.field3018) {
                    var8 = this.field3020 + ((long) arg3);
                } else if (this.field3020 < ((long) this.field3027 + this.field3018) && ((long) arg3 + this.field3020) >= (this.field3018 + ((long) this.field3027))) {
                    var8 = this.field3018 + ((long) this.field3027);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class642.method3480(arg2, (int) ((long) arg0 + var6 - this.field3020), this.field3011, (int) (var6 - this.field3018), var10);
                }
                this.field3020 += arg3;
            } else if (arg1 == 16711680 && arg3 > 0) {
                if (this.field3013 == -1L) {
                    this.field3013 = this.field3020;
                }
                class642.method3480(arg2, arg0, this.field3017, (int) (this.field3020 - this.field3013), arg3);
                this.field3020 += arg3;
                if (this.field3020 - this.field3013 > (long) this.field3031) {
                    this.field3031 = (int) (this.field3020 - this.field3013);
                }
            }
        } catch (IOException var12) {
            this.field3019 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1444(int arg0) {
        if (arg0 != 853) {
            this.method1447(false);
        }
        field3023++;
        return this.field3029.method502(-105);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)I")
    public static final int method1445(byte arg0, int arg1) {
        if (arg0 <= 9) {
            return 56;
        } else {
            field3026++;
            return arg1 == 16711935 ? -1 : class561.method3037(arg1, 127);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
    private final void method1446(boolean arg0) throws IOException {
        field3032++;
        if (!arg0) {
            method1445((byte) 122, 126);
        }
        if (this.field3013 == -1L) {
            return;
        }
        if (this.field3019 != this.field3013) {
            this.field3029.method506((byte) 74, this.field3013);
            this.field3019 = this.field3013;
        }
        this.field3029.method500(this.field3017, this.field3031, (byte) 0, 0);
        this.field3019 += this.field3031;
        if (this.field3012 < this.field3019) {
            this.field3012 = this.field3019;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field3013 >= this.field3018 && this.field3013 < this.field3018 + ((long) this.field3027)) {
            var2 = this.field3013;
        } else if (this.field3018 >= this.field3013 && this.field3018 < ((long) this.field3031 + this.field3013)) {
            var2 = this.field3018;
        }
        if (((long) this.field3031 + this.field3013) > this.field3018 && ((long) this.field3031 + this.field3013) <= (this.field3018 + ((long) this.field3027))) {
            var4 = (long) this.field3031 + this.field3013;
        } else if ((long) this.field3027 + this.field3018 > this.field3013 && (long) this.field3027 + this.field3018 <= this.field3013 - -((long) this.field3031)) {
            var4 = (long) this.field3027 + this.field3018;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class642.method3480(this.field3017, (int) (var2 - this.field3013), this.field3011, (int) (var2 - this.field3018), var6);
        }
        this.field3013 = -1L;
        this.field3031 = 0;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)J")
    public final long method1447(boolean arg0) {
        if (!arg0) {
            this.method1447(false);
        }
        field3028++;
        return this.field3024;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lvm;II)V")
    public class222(class80 arg0, int arg1, int arg2) throws IOException {
        this.field3029 = arg0;
        this.field3024 = this.field3012 = arg0.method497((byte) 107);
        this.field3011 = new byte[arg1];
        this.field3020 = 0L;
        this.field3017 = new byte[arg2];
    }
}
