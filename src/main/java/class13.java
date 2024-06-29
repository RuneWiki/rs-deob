import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class13 {

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "J")
    private long field226 = -1L;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    private int field224 = 0;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "J")
    private long field233 = -1L;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lec;")
    private class42 field221;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "J")
    private long field213;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "J")
    private long field209;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "[B")
    private byte[] field232;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "J")
    private long field212;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[B")
    private byte[] field211;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lkb;")
    public static class93 field207 = class76.method390("AUS", 0);

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Lkb;")
    private static class93 field227 = class76.method390(" from your friend list first)3", 0);

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lkb;")
    public static class93 field217 = field227;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lkb;")
    private static class93 field228 = class76.method390("Your ignore list is full)3 Max of 100 users)3", 0);

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lkb;")
    public static class93 field219 = field228;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lkb;")
    public static class93 field205 = class76.method390("Stufe)2", 0);

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lnb;")
    public static class120 field214 = new class120(30);

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Z")
    public static boolean field236 = false;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Lkb;")
    public static class93 field237 = class76.method390("Sprites geladen)3", 0);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "J")
    private long field218;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BI)V")
    public final void method64(byte[] arg0, int arg1) throws IOException {
        int var3 = -13 % ((arg1 + 1) / 48);
        this.method71(0, arg0, 7888, arg0.length);
        field238++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method65(int arg0) throws IOException {
        this.method74(arg0);
        this.field221.method228((byte) 45);
        field210++;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)J")
    public final long method66(int arg0) {
        field225++;
        int var2 = 48 % ((-arg0 - 56) / 38);
        return this.field209;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method67(int arg0) {
        field234++;
        if (arg0 > -12) {
            this.field226 = 37L;
        }
        return this.field221.method225(1369);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZI[B)V")
    public final void method68(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field235++;
        if (arg1) {
            this.field218 = -99L;
        }
        try {
            if (this.field209 < (long) arg0 + this.field212) {
                this.field209 = (long) arg0 + this.field212;
            }
            if (this.field226 != -1L && (this.field212 < this.field226 || (long) this.field224 + this.field226 < this.field212)) {
                this.method74(-1);
            }
            if (this.field226 != -1L && (long) arg0 + this.field212 > (long) this.field211.length + this.field226) {
                int var5 = (int) ((long) this.field211.length + this.field226 - this.field212);
                class90.method475(arg3, arg2, this.field211, (int) (this.field212 - this.field226), var5);
                arg0 -= var5;
                arg2 += var5;
                this.field212 += var5;
                this.field224 = this.field211.length;
                this.method74(-1);
            }
            if (arg0 > this.field211.length) {
                if (this.field218 != this.field212) {
                    this.field221.method224(this.field212, -1);
                    this.field218 = this.field212;
                }
                this.field221.method229((byte) 33, arg2, arg0, arg3);
                this.field218 += arg0;
                if (this.field218 > this.field213) {
                    this.field213 = this.field218;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field233 < this.field212 + (long) arg0 && this.field233 + (long) this.field223 >= (long) arg0 + this.field212) {
                    var6 = (long) arg0 + this.field212;
                } else if ((long) this.field223 + this.field233 > this.field212 && (long) arg0 + this.field212 >= this.field233 - -((long) this.field223)) {
                    var6 = (long) this.field223 + this.field233;
                }
                if (this.field212 >= this.field233 && (long) this.field223 + this.field233 > this.field212) {
                    var8 = this.field212;
                } else if (this.field233 >= this.field212 && (long) arg0 + this.field212 > this.field233) {
                    var8 = this.field233;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class90.method475(arg3, (int) ((long) arg2 + var8 - this.field212), this.field232, (int) (var8 - this.field233), var10);
                }
                this.field212 += arg0;
            } else if (arg0 > 0) {
                if (this.field226 == -1L) {
                    this.field226 = this.field212;
                }
                class90.method475(arg3, arg2, this.field211, (int) (this.field212 - this.field226), arg0);
                this.field212 += arg0;
                if (this.field212 - this.field226 > (long) this.field224) {
                    this.field224 = (int) (this.field212 - this.field226);
                }
            }
        } catch (IOException var12) {
            this.field218 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILkb;III)V")
    public static final void method69(int arg0, class93 arg1, int arg2, int arg3, int arg4) {
        field215++;
        class65 var5 = class113.method621(arg2, arg0, -1);
        if (var5 == null) {
            return;
        }
        if (var5.field1079 != null) {
            class104 var6 = new class104();
            var6.field1909 = arg4;
            var6.field1924 = var5.field1079;
            var6.field1920 = arg1;
            var6.field1919 = var5;
            class82.method421(var6, false);
        }
        boolean var7 = true;
        if (var5.field1056 > 0) {
            var7 = class40.method215(1, var5);
        }
        if (!var7 || !class177.method1171(-218, arg4 - 1, class178.method1173(var5, 126))) {
            return;
        }
        if (arg4 == 1) {
            class151.field2908.method47(27, 8);
            class151.field2908.method1051(true, arg0);
            class80.field1426++;
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg4 == 2) {
            class151.field2908.method47(55, 8);
            class36.field591++;
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg4 == 3) {
            class71.field1307++;
            class151.field2908.method47(236, 8);
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg4 == 4) {
            class200.field3888++;
            class151.field2908.method47(134, 8);
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg3 > -24) {
            return;
        }
        if (arg4 == 5) {
            class151.field2908.method47(173, 8);
            class76.field1365++;
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg4 == 6) {
            class151.field2908.method47(61, 8);
            class158.field3167++;
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg4 == 7) {
            class108.field1959++;
            class151.field2908.method47(79, 8);
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg4 == 8) {
            class151.field2908.method47(215, 8);
            class69.field1273++;
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg4 == 9) {
            class26.field417++;
            class151.field2908.method47(246, 8);
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
        if (arg4 == 10) {
            class12.field200++;
            class151.field2908.method47(5, 8);
            class151.field2908.method1051(true, arg0);
            class151.field2908.method1061(arg2, 12184);
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public static final void method70(int arg0) {
        while (true) {
            if (class59.field942.method46((byte) -116, class157.field3109) >= 27) {
                int var1 = class59.field942.method42(15, -56);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class143.field2791[var1] == null) {
                        var2 = true;
                        class143.field2791[var1] = new class76();
                    }
                    class76 var3 = class143.field2791[var1];
                    class49.field794[class195.field3788++] = var1;
                    var3.field2073 = class21.field338;
                    int var4 = class59.field942.method42(1, arg0 ^ 0x6772);
                    int var5 = class59.field942.method42(5, arg0 ^ 0x674C);
                    int var6 = class59.field942.method42(5, -112);
                    int var7 = class59.field942.method42(1, -49);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    if (var7 == 1) {
                        class14.field243[class124.field2313++] = var1;
                    }
                    int var8 = class23.field353[class59.field942.method42(3, -73)];
                    if (var2) {
                        var3.field2071 = var3.field2075 = var8;
                    }
                    var3.field1364 = class200.method1313(class59.field942.method42(14, -117), 9);
                    var3.field2044 = var3.field1364.field3777;
                    var3.field2031 = var3.field1364.field3798;
                    var3.field2029 = var3.field1364.field3807;
                    var3.field2046 = var3.field1364.field3806;
                    var3.field2076 = var3.field1364.field3803;
                    var3.field2047 = var3.field1364.field3786;
                    var3.field2014 = var3.field1364.field3794;
                    if (var3.field2014 == 0) {
                        var3.field2075 = 0;
                    }
                    var3.field2015 = var3.field1364.field3812;
                    var3.field2048 = var3.field1364.field3789;
                    var3.method609(var4 == 1, (byte) 126, class106.field1940.field2064[0] + var5, class106.field1940.field2038[0] - -var6);
                    continue;
                }
            }
            class59.field942.method45((byte) 111);
            if (arg0 != -26411) {
                method75((byte) 80);
            }
            field208++;
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BII)V")
    public final void method71(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field239++;
        try {
            if (arg1.length < arg0 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (this.field226 != -1L && this.field226 <= this.field212 && (long) this.field224 + this.field226 >= (long) arg3 + this.field212) {
                class90.method475(this.field211, (int) (this.field212 - this.field226), arg1, arg0, arg3);
                this.field212 += arg3;
                return;
            }
            long var5 = this.field212;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field233 <= this.field212 && (long) this.field223 + this.field233 > this.field212) {
                int var9 = (int) (this.field233 + (long) this.field223 - this.field212);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class90.method475(this.field232, (int) (this.field212 - this.field233), arg1, arg0, var9);
                this.field212 += var9;
                arg0 += var9;
            }
            if (this.field232.length < arg3) {
                this.field221.method224(this.field212, -1);
                this.field218 = this.field212;
                while (arg3 > 0) {
                    int var11 = this.field221.method226(arg1, arg3, 16278, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    this.field212 += var11;
                    arg3 -= var11;
                    this.field218 += var11;
                    arg0 += var11;
                }
            } else if (arg3 > 0) {
                this.method72(arg2 ^ 0x1ED0);
                int var10 = arg3;
                if (this.field223 < arg3) {
                    var10 = this.field223;
                }
                arg3 -= var10;
                class90.method475(this.field232, 0, arg1, arg0, var10);
                arg0 += var10;
                this.field212 += var10;
            }
            if (this.field226 != -1L) {
                if (this.field212 < this.field226 && arg3 > 0) {
                    int var12 = (int) (this.field226 - this.field212) + arg0;
                    if (arg0 + arg3 < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        this.field212++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if ((long) this.field224 + this.field226 > var5 && (long) var8 + var5 >= (long) this.field224 + this.field226) {
                    var15 = this.field226 + (long) this.field224;
                } else if ((long) var8 + var5 > this.field226 && (long) var8 + var5 <= (long) this.field224 + this.field226) {
                    var15 = (long) var8 + var5;
                }
                if (this.field226 >= var5 && (long) var8 + var5 > this.field226) {
                    var13 = this.field226;
                } else if (var5 >= this.field226 && this.field226 + (long) this.field224 > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class90.method475(this.field211, (int) (var13 - this.field226), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field212) {
                        arg3 = (int) ((long) arg3 + this.field212 - var15);
                        this.field212 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field218 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        } else if (arg2 != 7888) {
            method73(-50, 39, -56, -103);
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    private final void method72(int arg0) throws IOException {
        field220++;
        this.field223 = arg0;
        if (this.field218 != this.field212) {
            this.field221.method224(this.field212, -1);
            this.field218 = this.field212;
        }
        this.field233 = this.field212;
        while (this.field232.length > this.field223) {
            int var2 = this.field221.method226(this.field232, this.field232.length - this.field223, arg0 ^ 0x3F96, this.field223);
            if (var2 == -1) {
                break;
            }
            this.field218 += var2;
            this.field223 += var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3) {
        if (class69.field1277 != 0 && arg0 != 0 && class101.field1863 < 50) {
            class140.field2720[class101.field1863] = arg3;
            class59.field947[class101.field1863] = arg0;
            class103.field1890[class101.field1863] = arg2;
            class166.field3318[class101.field1863] = null;
            class73.field1330[class101.field1863] = 0;
            class101.field1863++;
        }
        field230++;
        if (arg1 != 1) {
            method69(95, null, 80, 11, 102);
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
    private final void method74(int arg0) throws IOException {
        field231++;
        if ((long) arg0 == this.field226) {
            return;
        }
        if (this.field226 != this.field218) {
            this.field221.method224(this.field226, -1);
            this.field218 = this.field226;
        }
        this.field221.method229((byte) 83, 0, this.field224, this.field211);
        this.field218 += this.field224;
        if (this.field213 < this.field218) {
            this.field213 = this.field218;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field233 < this.field226 + (long) this.field224 && (long) this.field223 + this.field233 >= this.field226 - -((long) this.field224)) {
            var2 = (long) this.field224 + this.field226;
        } else if (this.field226 < this.field233 + (long) this.field223 && this.field226 + (long) this.field224 >= (long) this.field223 + this.field233) {
            var2 = (long) this.field223 + this.field233;
        }
        if (this.field233 <= this.field226 && this.field226 < (long) this.field223 + this.field233) {
            var4 = this.field226;
        } else if (this.field233 >= this.field226 && (long) this.field224 + this.field226 > this.field233) {
            var4 = this.field233;
        }
        if (var4 > -1L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class90.method475(this.field211, (int) (var4 - this.field226), this.field232, (int) (var4 - this.field233), var6);
        }
        this.field226 = -1L;
        this.field224 = 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method75(byte arg0) {
        field217 = null;
        field207 = null;
        field214 = null;
        field205 = null;
        field219 = null;
        field227 = null;
        field228 = null;
        if (arg0 != -25) {
            field237 = null;
        }
        field237 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JB)V")
    public final void method76(long arg0, byte arg1) throws IOException {
        field229++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method67(-101));
        }
        if (arg1 <= 21) {
            field207 = null;
        }
        this.field212 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lec;II)V")
    public class13(class42 arg0, int arg1, int arg2) throws IOException {
        this.field221 = arg0;
        this.field209 = this.field213 = arg0.method227(0);
        this.field232 = new byte[arg1];
        this.field212 = 0L;
        this.field211 = new byte[arg2];
    }
}
