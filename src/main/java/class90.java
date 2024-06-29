import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class90 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    private int field2047 = 0;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "J")
    private long field2073 = -1L;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "J")
    private long field2083 = -1L;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lda;")
    private class23 field2085;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "J")
    private long field2069;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "J")
    private long field2086;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[B")
    private byte[] field2053;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "[B")
    private byte[] field2071;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "J")
    private long field2055;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lja;")
    public static class59 field2050 = new class59(4096);

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lkc;")
    public static class67 field2063 = class19.method144("Texturen geladen)3", 98);

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Z")
    public static boolean field2066 = false;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Lkc;")
    public static class67 field2070 = class19.method144("Mitteilung", 69);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lkc;")
    public static class67 field2065 = class19.method144("Ignorieren", 116);

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Lkc;")
    public static class67 field2068 = null;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Lkc;")
    public static class67 field2074 = class19.method144("backvmid2", 94);

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field2076 = 0;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Lkc;")
    public static class67 field2081 = class19.method144("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 126);

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "Lkc;")
    private static class67 field2082 = class19.method144("Login server offline)3", 101);

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Lkc;")
    public static class67 field2072 = field2082;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lkc;")
    public static class67 field2064 = class19.method144("Hierhin gehen", 94);

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2084 = 0;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "J")
    private long field2079;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I", line = 5)
    public static int method693(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI[BI)V", line = 21)
    public final void method694(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2049++;
        try {
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field2073 != -1L && this.field2055 >= this.field2073 && (long) arg3 + this.field2055 <= (long) this.field2047 + this.field2073) {
                class43.method371(this.field2053, (int) (this.field2055 - this.field2073), arg2, arg1, arg3);
                this.field2055 += arg3;
                return;
            }
            int var5 = arg1;
            int var6 = arg3;
            if (arg0 < 102) {
                return;
            }
            long var7 = this.field2055;
            if (this.field2055 >= this.field2083 && (long) this.field2051 + this.field2083 > this.field2055) {
                int var9 = (int) ((long) this.field2051 + this.field2083 - this.field2055);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class43.method371(this.field2071, (int) (this.field2055 - this.field2083), arg2, arg1, var9);
                this.field2055 += var9;
                arg3 -= var9;
                arg1 += var9;
            }
            if (this.field2071.length < arg3) {
                this.field2085.method182(this.field2055, -23331);
                this.field2079 = this.field2055;
                while (arg3 > 0) {
                    int var11 = this.field2085.method181(arg3, (byte) 113, arg2, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2079 += var11;
                    arg3 -= var11;
                    arg1 += var11;
                    this.field2055 += var11;
                }
            } else if (arg3 > 0) {
                this.method705((byte) 34);
                int var10 = arg3;
                if (this.field2051 < arg3) {
                    var10 = this.field2051;
                }
                arg3 -= var10;
                class43.method371(this.field2071, 0, arg2, arg1, var10);
                arg1 += var10;
                this.field2055 += var10;
            }
            if (this.field2073 != -1L) {
                if (this.field2073 > this.field2055 && arg3 > 0) {
                    int var12 = (int) (this.field2073 - this.field2055) + arg1;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg2[arg1++] = 0;
                        this.field2055++;
                    }
                }
                long var13 = -1L;
                if (var7 <= this.field2073 && this.field2073 < (long) var6 + var7) {
                    var13 = this.field2073;
                } else if (var7 >= this.field2073 && (long) this.field2047 + this.field2073 > var7) {
                    var13 = var7;
                }
                long var15 = -1L;
                if (var7 < (long) this.field2047 + this.field2073 && var7 + (long) var6 >= (long) this.field2047 + this.field2073) {
                    var15 = (long) this.field2047 + this.field2073;
                } else if (var7 + (long) var6 > this.field2073 && var7 + (long) var6 <= (long) this.field2047 + this.field2073) {
                    var15 = var7 + (long) var6;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class43.method371(this.field2053, (int) (var13 - this.field2073), arg2, (int) (var13 - var7) + var5, var17);
                    if (var15 > this.field2055) {
                        arg3 = (int) ((long) arg3 + this.field2055 - var15);
                        this.field2055 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2079 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIBII)V", line = 202)
    public static final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field2067++;
        if (class42.method365(89, arg0)) {
            if (arg6 != -84) {
                field2065 = null;
            }
            class34.method291(arg1, 0, arg6 + 129, arg7, arg5, 0, class54.field1305[arg0], arg2, -1, arg4, arg3, arg8);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZ)Lkc;", line = 218)
    public static final class67 method696(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field2078++;
        int var4 = arg0 / arg1;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg1;
        }
        int var6 = var5;
        if (arg0 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg0 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg0 /= arg1;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        if (arg2 >= -96) {
            method706(-120);
        }
        class67 var9 = new class67();
        var9.field1572 = var6;
        var9.field1597 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)J", line = 288)
    public final long method697(int arg0) {
        if (arg0 <= 65) {
            this.method697(96);
        }
        field2056++;
        return this.field2086;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 301)
    public final void method698(int arg0) throws IOException {
        this.method702(true);
        this.field2085.method179(4220);
        field2054++;
        if (arg0 != 4) {
            method695(-110, 105, 81, -12, 125, 28, (byte) -41, -78, 113);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)Lkc;", line = 315)
    public static final class67 method699(int arg0, int arg1) {
        field2075++;
        return arg1 <= 60 ? null : class63.method479(new class67[] { class71.method586(103, arg0 >> 24 & 0xFF), class108.field2460, class71.method586(103, arg0 >> 16 & 0xFF), class108.field2460, class71.method586(103, arg0 >> 8 & 0xFF), class108.field2460, class71.method586(103, arg0 & 0xFF) }, 0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)V", line = 326)
    public final void method700(int arg0, long arg1) {
        field2061++;
        if (arg1 >= (long) arg0) {
            this.field2055 = arg1;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 341)
    public static final void method701(boolean arg0) {
        try {
            if (arg0) {
                method701(false);
            }
            Graphics var1 = class129.field3020.getGraphics();
            class24.field511.method162(-1, 4, var1, 4);
        } catch (Exception var2) {
            class129.field3020.repaint();
        }
        field2060++;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V", line = 358)
    private final void method702(boolean arg0) throws IOException {
        if (!arg0) {
            this.field2079 = 95L;
        }
        if (this.field2073 != -1L) {
            long var2 = -1L;
            if (this.field2079 != this.field2073) {
                this.field2085.method182(this.field2073, -23331);
                this.field2079 = this.field2073;
            }
            long var4 = -1L;
            this.field2085.method183(false, this.field2053, 0, this.field2047);
            if (this.field2083 <= this.field2073 && (long) this.field2051 + this.field2083 > this.field2073) {
                var2 = this.field2073;
            } else if (this.field2083 >= this.field2073 && (long) this.field2047 + this.field2073 > this.field2083) {
                var2 = this.field2083;
            }
            this.field2079 += this.field2047;
            if (this.field2079 > this.field2069) {
                this.field2069 = this.field2079;
            }
            if ((long) this.field2047 + this.field2073 > this.field2083 && this.field2073 + (long) this.field2047 <= (long) this.field2051 + this.field2083) {
                var4 = this.field2073 + (long) this.field2047;
            } else if (this.field2073 < (long) this.field2051 + this.field2083 && this.field2073 + (long) this.field2047 >= (long) this.field2051 + this.field2083) {
                var4 = (long) this.field2051 + this.field2083;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class43.method371(this.field2053, (int) (var2 - this.field2073), this.field2071, (int) (var2 - this.field2083), var6);
            }
            this.field2073 = -1L;
            this.field2047 = 0;
        }
        field2057++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB[B)V", line = 443)
    public final void method703(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field2052++;
        try {
            if (this.field2086 < (long) arg0 + this.field2055) {
                this.field2086 = (long) arg0 + this.field2055;
            }
            if (this.field2073 != -1L && (this.field2055 < this.field2073 || this.field2073 + (long) this.field2047 < this.field2055)) {
                this.method702(true);
            }
            if (this.field2073 != -1L && (long) this.field2053.length + this.field2073 < (long) arg0 + this.field2055) {
                int var5 = (int) (this.field2073 + (long) this.field2053.length - this.field2055);
                class43.method371(arg3, arg1, this.field2053, (int) (this.field2055 - this.field2073), var5);
                arg0 -= var5;
                this.field2055 += var5;
                arg1 += var5;
                this.field2047 = this.field2053.length;
                this.method702(true);
            }
            int var6 = 5 / ((1 - arg2) / 32);
            if (arg0 > this.field2053.length) {
                if (this.field2079 != this.field2055) {
                    this.field2085.method182(this.field2055, -23331);
                    this.field2079 = this.field2055;
                }
                this.field2085.method183(false, arg3, arg1, arg0);
                this.field2079 += arg0;
                if (this.field2079 > this.field2069) {
                    this.field2069 = this.field2079;
                }
                long var7 = -1L;
                long var9 = -1L;
                if (this.field2083 <= this.field2055 && this.field2055 < (long) this.field2051 + this.field2083) {
                    var7 = this.field2055;
                } else if (this.field2083 >= this.field2055 && this.field2055 + (long) arg0 > this.field2083) {
                    var7 = this.field2083;
                }
                if ((long) arg0 + this.field2055 > this.field2083 && (long) arg0 + this.field2055 <= (long) this.field2051 + this.field2083) {
                    var9 = (long) arg0 + this.field2055;
                } else if (this.field2055 < (long) this.field2051 + this.field2083 && this.field2083 + (long) this.field2051 <= (long) arg0 + this.field2055) {
                    var9 = (long) this.field2051 + this.field2083;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class43.method371(arg3, (int) ((long) arg1 + var7 - this.field2055), this.field2071, (int) (var7 - this.field2083), var11);
                }
                this.field2055 += arg0;
            } else if (arg0 > 0) {
                if (this.field2073 == -1L) {
                    this.field2073 = this.field2055;
                }
                class43.method371(arg3, arg1, this.field2053, (int) (this.field2055 - this.field2073), arg0);
                this.field2055 += arg0;
                if (this.field2055 - this.field2073 > (long) this.field2047) {
                    this.field2047 = (int) (this.field2055 - this.field2073);
                }
            }
        } catch (IOException var13) {
            this.field2079 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V", line = 565)
    public static final void method704(boolean arg0, int arg1) {
        class10.method88(arg0);
        field2077++;
        int var2 = class46.method383(16, arg1).field2752;
        if (var2 == 0) {
            return;
        }
        if (arg0) {
            field2081 = null;
        }
        int var3 = class5.field109[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class105.method801(0.9D);
                ((class117) class105.field2362).method931(0.9D, (byte) 79);
            }
            if (var3 == 2) {
                class105.method801(0.8D);
                ((class117) class105.field2362).method931(0.8D, (byte) 85);
            }
            if (var3 == 3) {
                class105.method801(0.7D);
                ((class117) class105.field2362).method931(0.7D, (byte) 97);
            }
            if (var3 == 4) {
                class105.method801(0.6D);
                ((class117) class105.field2362).method931(0.6D, (byte) 124);
            }
            class33.method276(-11005);
            class130.field3045 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class96.field2169 != var4) {
                if (class96.field2169 == 0 && class29.field616 != -1) {
                    class135.method1049(126, 0, class133.field3173, class29.field616, 0, false, var4);
                    class141.field3393 = 0;
                } else if (var4 == 0) {
                    class135.method1041(0);
                    class141.field3393 = 0;
                } else {
                    class55.method438((byte) -73, var4);
                }
                class96.field2169 = var4;
            }
        }
        if (var2 == 6) {
            class100.field2233 = var3;
        }
        if (var2 == 9) {
            class121.field2854 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class54.field1298 = 127;
            }
            if (var3 == 1) {
                class54.field1298 = 96;
            }
            if (var3 == 2) {
                class54.field1298 = 64;
            }
            if (var3 == 3) {
                class54.field1298 = 32;
            }
            if (var3 == 4) {
                class54.field1298 = 0;
            }
        }
        if (var2 == 8) {
            class138.field3304 = true;
            class50.field1253 = var3;
        }
        if (var2 == 5) {
            class121.field2839 = var3;
        }
        if (var2 != 4) {
            return;
        }
        if (var3 == 0) {
            class65.field1531 = 127;
        }
        if (var3 == 1) {
            class65.field1531 = 96;
        }
        if (var3 == 2) {
            class65.field1531 = 64;
        }
        if (var3 == 3) {
            class65.field1531 = 32;
        }
        if (var3 == 4) {
            class65.field1531 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lda;II)V", line = 881)
    public class90(class23 arg0, int arg1, int arg2) throws IOException {
        this.field2085 = arg0;
        this.field2086 = this.field2069 = arg0.method184((byte) -117);
        this.field2053 = new byte[arg2];
        this.field2071 = new byte[arg1];
        this.field2055 = 0L;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 743)
    private final void method705(byte arg0) throws IOException {
        field2059++;
        int var2 = -52 / ((arg0 + 23) / 49);
        this.field2051 = 0;
        if (this.field2079 != this.field2055) {
            this.field2085.method182(this.field2055, -23331);
            this.field2079 = this.field2055;
        }
        this.field2083 = this.field2055;
        while (this.field2051 < this.field2071.length) {
            int var3 = this.field2085.method181(this.field2071.length - this.field2051, (byte) 113, this.field2071, this.field2051);
            if (var3 == -1) {
                break;
            }
            this.field2079 += var3;
            this.field2051 += var3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 795)
    public static void method706(int arg0) {
        field2068 = null;
        field2082 = null;
        field2064 = null;
        if (arg0 != -16777216) {
            return;
        }
        field2074 = null;
        field2050 = null;
        field2081 = null;
        field2070 = null;
        field2063 = null;
        field2072 = null;
        field2065 = null;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V", line = 850)
    public static final void method707(int arg0) {
        if (arg0 != -1) {
            field2063 = null;
        }
        if (class98.field2213 != null) {
            class98.field2213.method751(-2);
        }
        field2058++;
    }
}
