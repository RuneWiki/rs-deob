import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class63 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    private int field884 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "J")
    private long field883 = -1L;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "J")
    private long field891 = -1L;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lan;")
    private class377 field889;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "J")
    private long field890;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "J")
    private long field887;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "J")
    private long field898;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[B")
    private byte[] field896;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[B")
    private byte[] field893;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "J")
    private long field897;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[[[I")
    public static int[][][] field900;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)Z", line = 3)
    public static final boolean method407(int arg0, int arg1, int arg2, int arg3) {
        if (class54.method374(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class447.method2814(var4 + 1, class88.field1226[arg0].method781(arg1, arg2) + arg3, var5 + 1) && class447.method2814(var4 + 128 - 1, class88.field1226[arg0].method781(arg1 + 1, arg2) + arg3, var5 + 1) && class447.method2814(var4 + 128 - 1, class88.field1226[arg0].method781(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class447.method2814(var4 + 1, class88.field1226[arg0].method781(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)V", line = 19)
    public final void method408(int arg0, long arg1) throws IOException {
        field894++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method413(26715));
        }
        this.field898 = arg1;
        if (arg0 != 0) {
            this.field887 = 8L;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lan;II)V", line = 559)
    public class63(class377 arg0, int arg1, int arg2) throws IOException {
        this.field889 = arg0;
        this.field887 = this.field890 = arg0.method2498(-116);
        this.field898 = 0L;
        this.field896 = new byte[arg2];
        this.field893 = new byte[arg1];
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 46)
    public static void method409(byte arg0) {
        if (arg0 < 119) {
            method409((byte) -65);
        }
        field900 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)V", line = 58)
    public final void method410(int arg0, byte[] arg1) throws IOException {
        if (arg0 != -1) {
            this.field889 = null;
        }
        this.method414(arg1, (byte) 95, 0, arg1.length);
        field892++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)J", line = 71)
    public final long method411(int arg0) {
        field885++;
        if (arg0 > -49) {
            this.method411(-49);
        }
        return this.field887;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V", line = 96)
    public static final void method412() {
        class256.method1620(1, class137.field1817);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Ljava/io/File;", line = 105)
    private final File method413(int arg0) {
        field886++;
        if (arg0 != 26715) {
            this.field896 = null;
        }
        return this.field889.method2502((byte) -114);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BBII)V", line = 118)
    public final void method414(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        int var5 = -31 / (arg1 / 43);
        field888++;
        try {
            if (arg0.length < (arg2 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field883 != -1L && this.field883 <= this.field898 && ((long) this.field884 + this.field883) >= ((long) arg3 + this.field898)) {
                class111.method770(this.field896, (int) (this.field898 - this.field883), arg0, arg2, arg3);
                this.field898 += (long) arg3;
                return;
            }
            long var6 = this.field898;
            int var8 = arg2;
            int var9 = arg3;
            if (this.field891 <= this.field898 && this.field898 < (long) this.field901 + this.field891) {
                int var10 = (int) (this.field891 + (long) this.field901 - this.field898);
                if (var10 > arg3) {
                    var10 = arg3;
                }
                class111.method770(this.field893, (int) (this.field898 - this.field891), arg0, arg2, var10);
                arg2 += var10;
                arg3 -= var10;
                this.field898 += (long) var10;
            }
            if (arg3 > this.field893.length) {
                this.field889.method2500(this.field898, -16156);
                this.field897 = this.field898;
                while (arg3 > 0) {
                    int var12 = this.field889.method2497(arg3, arg0, arg2, 0);
                    if (var12 == -1) {
                        break;
                    }
                    arg3 -= var12;
                    arg2 += var12;
                    this.field898 += (long) var12;
                    this.field897 += (long) var12;
                }
            } else if (arg3 > 0) {
                this.method416((byte) 69);
                int var11 = arg3;
                if (this.field901 < arg3) {
                    var11 = this.field901;
                }
                class111.method770(this.field893, 0, arg0, arg2, var11);
                arg2 += var11;
                arg3 -= var11;
                this.field898 += (long) var11;
            }
            if (this.field883 != -1L) {
                if (this.field883 > this.field898 && arg3 > 0) {
                    int var13 = (int) (this.field883 - this.field898) + arg2;
                    if (arg2 + arg3 < var13) {
                        var13 = arg2 + arg3;
                    }
                    while (arg2 < var13) {
                        arg0[arg2++] = 0;
                        arg3--;
                        this.field898++;
                    }
                }
                long var14 = -1L;
                if (this.field883 >= var6 && this.field883 < ((long) var9 + var6)) {
                    var14 = this.field883;
                } else if (this.field883 <= var6 && var6 < (long) this.field884 + this.field883) {
                    var14 = var6;
                }
                long var16 = -1L;
                if ((long) this.field884 + this.field883 > var6 && ((long) var9 + var6) >= ((long) this.field884 + this.field883)) {
                    var16 = (long) this.field884 + this.field883;
                } else if ((long) var9 + var6 > this.field883 && ((long) var9 + var6) <= ((long) this.field884 + this.field883)) {
                    var16 = var6 + ((long) var9);
                }
                if (var14 > -1L && var16 > var14) {
                    int var18 = (int) (var16 - var14);
                    class111.method770(this.field896, (int) (var14 - this.field883), arg0, (int) (var14 - var6) + var8, var18);
                    if (var16 > this.field898) {
                        arg3 = (int) ((long) arg3 - (var16 - this.field898));
                        this.field898 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field897 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)V", line = 306)
    public final void method415(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field895++;
        try {
            if (((long) arg1 + this.field898) > this.field887) {
                this.field887 = (long) arg1 + this.field898;
            }
            if (this.field883 != -1L && (this.field883 > this.field898 || this.field898 > ((long) this.field884 + this.field883))) {
                this.method417((byte) -92);
            }
            if (arg3 < 60) {
                this.method413(-58);
            }
            if (this.field883 != -1L && (long) this.field896.length + this.field883 < this.field898 - -((long) arg1)) {
                int var5 = (int) (-this.field898 - (-this.field883 - (long) this.field896.length));
                class111.method770(arg0, arg2, this.field896, (int) (this.field898 - this.field883), var5);
                arg1 -= var5;
                this.field898 += (long) var5;
                arg2 += var5;
                this.field884 = this.field896.length;
                this.method417((byte) -92);
            }
            if (this.field896.length < arg1) {
                if (this.field898 != this.field897) {
                    this.field889.method2500(this.field898, -16156);
                    this.field897 = this.field898;
                }
                this.field889.method2501(arg0, 1, arg2, arg1);
                this.field897 += (long) arg1;
                if (this.field890 < this.field897) {
                    this.field890 = this.field897;
                }
                long var6 = -1L;
                if (this.field898 >= this.field891 && this.field898 < ((long) this.field901 + this.field891)) {
                    var6 = this.field898;
                } else if (this.field898 <= this.field891 && this.field891 < ((long) arg1 + this.field898)) {
                    var6 = this.field891;
                }
                long var8 = -1L;
                if (((long) arg1 + this.field898) > this.field891 && ((long) this.field901 + this.field891) >= (this.field898 + ((long) arg1))) {
                    var8 = (long) arg1 + this.field898;
                } else if (((long) this.field901 + this.field891) > this.field898 && ((long) this.field901 + this.field891) <= ((long) arg1 + this.field898)) {
                    var8 = (long) this.field901 + this.field891;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class111.method770(arg0, (int) ((long) arg2 + var6 - this.field898), this.field893, (int) (var6 - this.field891), var10);
                }
                this.field898 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field883 == -1L) {
                    this.field883 = this.field898;
                }
                class111.method770(arg0, arg2, this.field896, (int) (this.field898 - this.field883), arg1);
                this.field898 += (long) arg1;
                if (((long) this.field884) < (this.field898 - this.field883)) {
                    this.field884 = (int) (this.field898 - this.field883);
                }
            }
        } catch (IOException var12) {
            this.field897 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 430)
    private final void method416(byte arg0) throws IOException {
        this.field901 = 0;
        field882++;
        if (this.field898 != this.field897) {
            this.field889.method2500(this.field898, -16156);
            this.field897 = this.field898;
        }
        if (arg0 <= 16) {
            method407(-31, -127, -14, -98);
        }
        this.field891 = this.field898;
        while (this.field893.length > this.field901) {
            int var2 = this.field893.length - this.field901;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field889.method2497(var2, this.field893, this.field901, 0);
            if (var3 == -1) {
                break;
            }
            this.field897 += (long) var3;
            this.field901 += var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V", line = 480)
    private final void method417(byte arg0) throws IOException {
        field899++;
        if (arg0 != -92 || this.field883 == -1L) {
            return;
        }
        if (this.field897 != this.field883) {
            this.field889.method2500(this.field883, -16156);
            this.field897 = this.field883;
        }
        this.field889.method2501(this.field896, 1, 0, this.field884);
        this.field897 += (long) this.field884;
        if (this.field890 < this.field897) {
            this.field890 = this.field897;
        }
        long var2 = -1L;
        if (this.field891 <= this.field883 && (long) this.field901 + this.field891 > this.field883) {
            var2 = this.field883;
        } else if (this.field883 <= this.field891 && this.field891 < ((long) this.field884 + this.field883)) {
            var2 = this.field891;
        }
        long var4 = -1L;
        if (this.field891 < ((long) this.field884 + this.field883) && ((long) this.field884 + this.field883) <= ((long) this.field901 + this.field891)) {
            var4 = (long) this.field884 + this.field883;
        } else if ((long) this.field901 + this.field891 > this.field883 && (this.field883 + ((long) this.field884)) >= ((long) this.field901 + this.field891)) {
            var4 = (long) this.field901 + this.field891;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class111.method770(this.field896, (int) (var2 - this.field883), this.field893, (int) (var2 - this.field891), var6);
        }
        this.field883 = -1L;
        this.field884 = 0;
    }
}
