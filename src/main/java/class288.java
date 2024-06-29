import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class288 {

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    private int field5067 = 0;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "J")
    private long field5084 = -1L;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "J")
    private long field5087 = -1L;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lud;")
    private class15 field5074;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "J")
    private long field5071;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "J")
    private long field5079;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "J")
    private long field5070;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[B")
    private byte[] field5077;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "[B")
    private byte[] field5075;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Leg;")
    public static class37 field5073 = class174.method1167("hint_mapmarkers", 98);

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field5088 = 1;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field5082 = 0;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field5090 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    private int field5068;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "J")
    private long field5091;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    public static int[] field5062;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[Lrk;")
    public static class14[] field5080;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "[[B")
    public static byte[][] field5089;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method1923(int arg0) {
        if (arg0 != -2814) {
            this.field5067 = 81;
        }
        field5064++;
        return this.field5074.method114((byte) -110);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JB)V")
    public final void method1924(long arg0, byte arg1) throws IOException {
        field5066++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1923(arg1 - 2743));
        }
        if (arg1 != -71) {
            field5089 = null;
        }
        this.field5070 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public final void method1925(boolean arg0) throws IOException {
        if (arg0) {
            this.method1923(0);
        }
        field5078++;
        this.method1932(-1);
        this.field5074.method116(10388);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[B)V")
    public final void method1926(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5086++;
        try {
            if ((this.field5070 + ((long) arg1)) > this.field5079) {
                this.field5079 = (long) arg1 + this.field5070;
            }
            if (this.field5087 != -1L && (this.field5087 > this.field5070 || ((long) this.field5067 + this.field5087) < this.field5070)) {
                this.method1932(-1);
            }
            if (this.field5087 != -1L && (long) arg1 + this.field5070 > (long) this.field5075.length + this.field5087) {
                int var5 = (int) (this.field5087 + (long) this.field5075.length - this.field5070);
                arg1 -= var5;
                class54.method355(arg3, arg2, this.field5075, (int) (this.field5070 - this.field5087), var5);
                this.field5070 += (long) var5;
                this.field5067 = this.field5075.length;
                this.method1932(-1);
                arg2 += var5;
            }
            if (this.field5075.length < arg1) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field5091 != this.field5070) {
                    this.field5074.method112((byte) -87, this.field5070);
                    this.field5091 = this.field5070;
                }
                this.field5074.method113(arg3, (byte) 126, arg2, arg1);
                if (this.field5070 >= this.field5084 && ((long) this.field5068 + this.field5084) > this.field5070) {
                    var6 = this.field5070;
                } else if (this.field5084 >= this.field5070 && this.field5084 < ((long) arg1 + this.field5070)) {
                    var6 = this.field5084;
                }
                if (((long) arg1 + this.field5070) > this.field5084 && (this.field5070 + ((long) arg1)) <= (this.field5084 + ((long) this.field5068))) {
                    var8 = (long) arg1 + this.field5070;
                } else if ((long) this.field5068 + this.field5084 > this.field5070 && ((long) arg1 + this.field5070) >= (this.field5084 + ((long) this.field5068))) {
                    var8 = (long) this.field5068 + this.field5084;
                }
                this.field5091 += (long) arg1;
                if (this.field5091 > this.field5071) {
                    this.field5071 = this.field5091;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class54.method355(arg3, (int) ((long) arg2 + var6 - this.field5070), this.field5077, (int) (var6 - this.field5084), var10);
                }
                this.field5070 += (long) arg1;
            } else if (arg0 > ~arg1) {
                if (this.field5087 == -1L) {
                    this.field5087 = this.field5070;
                }
                class54.method355(arg3, arg2, this.field5075, (int) (this.field5070 - this.field5087), arg1);
                this.field5070 += (long) arg1;
                if (((long) this.field5067) < (this.field5070 - this.field5087)) {
                    this.field5067 = (int) (this.field5070 - this.field5087);
                }
            }
        } catch (IOException var12) {
            this.field5091 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field5080 = null;
        field5062 = null;
        if (arg0 == 1) {
            field5073 = null;
            field5089 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    private final void method1928(int arg0) throws IOException {
        this.field5068 = arg0;
        field5083++;
        if (this.field5091 != this.field5070) {
            this.field5074.method112((byte) 123, this.field5070);
            this.field5091 = this.field5070;
        }
        this.field5084 = this.field5070;
        while (this.field5068 < this.field5077.length) {
            int var2 = this.field5077.length - this.field5068;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5074.method111(-75, var2, this.field5068, this.field5077);
            if (var3 == -1) {
                break;
            }
            this.field5068 += var3;
            this.field5091 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIB)V")
    public static final void method1929(int arg0, int arg1, int arg2, byte arg3) {
        field5063++;
        class274 var4 = class166.method1116(4, arg2, true);
        var4.method1835(-77);
        if (arg3 != -82) {
            method1927(-71);
        }
        var4.field4802 = arg1;
        var4.field4824 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BIII)V")
    public final void method1930(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5081++;
        try {
            if ((arg1 + arg3) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (arg2 != -2408) {
                return;
            }
            if (this.field5087 != -1L && this.field5070 >= this.field5087 && ((long) this.field5067 + this.field5087) >= (this.field5070 + ((long) arg1))) {
                class54.method355(this.field5075, (int) (this.field5070 - this.field5087), arg0, arg3, arg1);
                this.field5070 += (long) arg1;
                return;
            }
            long var5 = this.field5070;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field5084 <= this.field5070 && ((long) this.field5068 + this.field5084) > this.field5070) {
                int var9 = (int) (-this.field5070 - (-this.field5084 - (long) this.field5068));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class54.method355(this.field5077, (int) (this.field5070 - this.field5084), arg0, arg3, var9);
                arg3 += var9;
                arg1 -= var9;
                this.field5070 += (long) var9;
            }
            if (this.field5077.length < arg1) {
                this.field5074.method112((byte) -41, this.field5070);
                this.field5091 = this.field5070;
                while (arg1 > 0) {
                    int var10 = this.field5074.method111(-94, arg1, arg3, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 -= var10;
                    this.field5091 += (long) var10;
                    this.field5070 += (long) var10;
                    arg3 += var10;
                }
            } else if (arg1 > 0) {
                this.method1928(0);
                int var11 = arg1;
                if (arg1 > this.field5068) {
                    var11 = this.field5068;
                }
                class54.method355(this.field5077, 0, arg0, arg3, var11);
                arg1 -= var11;
                this.field5070 += (long) var11;
                arg3 += var11;
            }
            if (this.field5087 != -1L) {
                if (this.field5070 < this.field5087 && arg1 > 0) {
                    int var12 = (int) (this.field5087 - this.field5070) + arg3;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg0[arg3++] = 0;
                        this.field5070++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if (this.field5087 >= var5 && (long) var8 + var5 > this.field5087) {
                    var13 = this.field5087;
                } else if (var5 >= this.field5087 && var5 < (this.field5087 + ((long) this.field5067))) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field5067 + this.field5087) > var5 && (long) var8 + var5 >= this.field5087 - -((long) this.field5067)) {
                    var15 = this.field5087 + ((long) this.field5067);
                } else if (this.field5087 < (long) var8 + var5 && ((long) var8 + var5) <= (this.field5087 + ((long) this.field5067))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class54.method355(this.field5075, (int) (var13 - this.field5087), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field5070) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field5070));
                        this.field5070 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5091 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIII)I")
    public static final int method1931(byte arg0, int arg1, int arg2, int arg3) {
        field5072++;
        int var4 = arg1 & 0x3;
        if (arg0 != -95) {
            method1931((byte) -104, -78, -20, 59);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    private final void method1932(int arg0) throws IOException {
        field5076++;
        if ((long) arg0 == this.field5087) {
            return;
        }
        long var2 = -1L;
        if (this.field5091 != this.field5087) {
            this.field5074.method112((byte) 122, this.field5087);
            this.field5091 = this.field5087;
        }
        this.field5074.method113(this.field5075, (byte) 104, 0, this.field5067);
        long var4 = -1L;
        this.field5091 += (long) this.field5067;
        if (this.field5091 > this.field5071) {
            this.field5071 = this.field5091;
        }
        if (((long) this.field5067 + this.field5087) > this.field5084 && (long) this.field5067 + this.field5087 <= (long) this.field5068 + this.field5084) {
            var4 = (long) this.field5067 + this.field5087;
        } else if (((long) this.field5068 + this.field5084) > this.field5087 && ((long) this.field5068 + this.field5084) <= ((long) this.field5067 + this.field5087)) {
            var4 = (long) this.field5068 + this.field5084;
        }
        if (this.field5084 <= this.field5087 && this.field5087 < (long) this.field5068 + this.field5084) {
            var2 = this.field5087;
        } else if (this.field5084 >= this.field5087 && this.field5084 < (this.field5087 + ((long) this.field5067))) {
            var2 = this.field5084;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class54.method355(this.field5075, (int) (var2 - this.field5087), this.field5077, (int) (var2 - this.field5084), var6);
        }
        this.field5087 = -1L;
        this.field5067 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)J")
    public final long method1933(int arg0) {
        if (arg0 != 0) {
            field5090 = -114;
        }
        field5065++;
        return this.field5079;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[B)V")
    public final void method1934(int arg0, byte[] arg1) throws IOException {
        this.method1930(arg1, arg1.length, -2408, 0);
        field5085++;
        int var3 = -59 % ((arg0 + 16) / 37);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lud;II)V")
    public class288(class15 arg0, int arg1, int arg2) throws IOException {
        this.field5074 = arg0;
        this.field5079 = this.field5071 = arg0.method115((byte) 127);
        this.field5070 = 0L;
        this.field5077 = new byte[arg1];
        this.field5075 = new byte[arg2];
    }
}
