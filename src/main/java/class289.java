import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class289 {

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "J")
    private long field5071 = -1L;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "J")
    private long field5085 = -1L;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    private int field5089 = 0;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Lpe;")
    private class84 field5090;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "J")
    private long field5069;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "J")
    private long field5066;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[B")
    private byte[] field5065;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "[B")
    private byte[] field5086;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "J")
    private long field5082;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[[I")
    public static int[][] field5062 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field5068 = 0;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Llc;")
    public static class143 field5077 = class66.method374("titlebg", -1);

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Llc;")
    public static class143 field5076 = class66.method374(":duelfriend:", -1);

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "[[S")
    public static short[][] field5084 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    private int field5075;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "J")
    private long field5072;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lda;")
    public static class102 field5067;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    private final void method1922(byte arg0) throws IOException {
        this.field5075 = 0;
        if (this.field5082 != this.field5072) {
            this.field5090.method484(this.field5082, -96);
            this.field5072 = this.field5082;
        }
        this.field5071 = this.field5082;
        field5061++;
        if (arg0 >= -68) {
            method1932(-72, -63, -101, -109, (byte) 7, -23, 100, 123);
        }
        while (this.field5065.length > this.field5075) {
            int var2 = this.field5065.length - this.field5075;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5090.method480(this.field5075, this.field5065, 0, var2);
            if (var3 == -1) {
                break;
            }
            this.field5075 += var3;
            this.field5072 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
    public static final int method1923(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        field5063++;
        if (arg1 != -22843) {
            method1933(90);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZJ)V")
    public final void method1924(boolean arg0, long arg1) throws IOException {
        field5088++;
        if (!arg0) {
            this.field5075 = -91;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1928(false));
        }
        this.field5082 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[BIB)V")
    public final void method1925(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field5078++;
        try {
            if (arg1.length < (arg0 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field5085 != -1L && this.field5085 <= this.field5082 && (long) this.field5089 + this.field5085 >= (long) arg0 + this.field5082) {
                class275.method1813(this.field5086, (int) (this.field5082 - this.field5085), arg1, arg2, arg0);
                this.field5082 += (long) arg0;
                return;
            }
            long var5 = this.field5082;
            if (arg3 > -52) {
                field5068 = 99;
            }
            int var7 = arg0;
            int var8 = arg2;
            if (this.field5071 <= this.field5082 && this.field5082 < this.field5071 + ((long) this.field5075)) {
                int var9 = (int) (this.field5071 + (long) this.field5075 - this.field5082);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class275.method1813(this.field5065, (int) (this.field5082 - this.field5071), arg1, arg2, var9);
                this.field5082 += (long) var9;
                arg2 += var9;
            }
            if (this.field5065.length < arg0) {
                this.field5090.method484(this.field5082, -96);
                this.field5072 = this.field5082;
                while (arg0 > 0) {
                    int var11 = this.field5090.method480(arg2, arg1, 0, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    this.field5082 += (long) var11;
                    arg0 -= var11;
                    arg2 += var11;
                    this.field5072 += (long) var11;
                }
            } else if (arg0 > 0) {
                this.method1922((byte) -122);
                int var10 = arg0;
                if (arg0 > this.field5075) {
                    var10 = this.field5075;
                }
                arg0 -= var10;
                class275.method1813(this.field5065, 0, arg1, arg2, var10);
                arg2 += var10;
                this.field5082 += (long) var10;
            }
            if (this.field5085 != -1L) {
                if (this.field5085 > this.field5082 && arg0 > 0) {
                    int var12 = (int) (this.field5085 - this.field5082) + arg2;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (arg2 < var12) {
                        arg0--;
                        arg1[arg2++] = 0;
                        this.field5082++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (((long) this.field5089 + this.field5085) > var5 && var5 + ((long) var7) >= (long) this.field5089 + this.field5085) {
                    var15 = (long) this.field5089 + this.field5085;
                } else if (this.field5085 < var5 + ((long) var7) && var5 + ((long) var7) <= (long) this.field5089 + this.field5085) {
                    var15 = (long) var7 + var5;
                }
                if (this.field5085 >= var5 && this.field5085 < ((long) var7 + var5)) {
                    var13 = this.field5085;
                } else if (this.field5085 <= var5 && var5 < ((long) this.field5089 + this.field5085)) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class275.method1813(this.field5086, (int) (var13 - this.field5085), arg1, (int) (var13 - var5) + var8, var17);
                    if (this.field5082 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field5082));
                        this.field5082 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5072 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BB)V")
    public final void method1926(byte[] arg0, byte arg1) throws IOException {
        this.method1925(arg0.length, arg0, 0, (byte) -83);
        if (arg1 != -101) {
            this.method1928(true);
        }
        field5070++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([IIIII)V")
    public static final void method1927(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        arg2--;
        if (arg3 > -57) {
            return;
        }
        field5083++;
        int var11 = arg4 - 1;
        int var5 = var11 - 7;
        while (arg2 < var5) {
            int var6 = arg2 + 1;
            arg0[var6] = arg1;
            int var7 = var6 + 1;
            arg0[var7] = arg1;
            int var8 = var7 + 1;
            arg0[var8] = arg1;
            int var9 = var8 + 1;
            arg0[var9] = arg1;
            int var10 = var9 + 1;
            arg0[var10] = arg1;
            int var12 = var10 + 1;
            arg0[var12] = arg1;
            int var13 = var12 + 1;
            arg0[var13] = arg1;
            arg2 = var13 + 1;
            arg0[arg2] = arg1;
        }
        while (var11 > arg2) {
            arg2++;
            arg0[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method1928(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field5081++;
            return this.field5090.method481(99);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    private final void method1929(int arg0) throws IOException {
        if (this.field5085 != -1L) {
            long var2 = -1L;
            if (this.field5085 != this.field5072) {
                this.field5090.method484(this.field5085, -99);
                this.field5072 = this.field5085;
            }
            this.field5090.method479(this.field5089, 4867, this.field5086, 0);
            if (this.field5071 <= this.field5085 && (long) this.field5075 + this.field5071 > this.field5085) {
                var2 = this.field5085;
            } else if (this.field5071 >= this.field5085 && (long) this.field5089 + this.field5085 > this.field5071) {
                var2 = this.field5071;
            }
            this.field5072 += (long) this.field5089;
            if (this.field5069 < this.field5072) {
                this.field5069 = this.field5072;
            }
            long var4 = -1L;
            if (this.field5071 < this.field5085 + ((long) this.field5089) && ((long) this.field5089 + this.field5085) <= (this.field5071 + ((long) this.field5075))) {
                var4 = this.field5085 + ((long) this.field5089);
            } else if (((long) this.field5075 + this.field5071) > this.field5085 && (long) this.field5075 + this.field5071 <= (long) this.field5089 + this.field5085) {
                var4 = (long) this.field5075 + this.field5071;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class275.method1813(this.field5086, (int) (var2 - this.field5085), this.field5065, (int) (var2 - this.field5071), var6);
            }
            this.field5085 = -1L;
            this.field5089 = 0;
        }
        if (arg0 != 0) {
            method1927((int[]) null, 25, -76, -101, -19);
        }
        field5064++;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)V")
    public static void method1930(boolean arg0) {
        field5077 = null;
        if (!arg0) {
            method1923(82, -41);
        }
        field5084 = null;
        field5062 = null;
        field5067 = null;
        field5076 = null;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(Z)V")
    public final void method1931(boolean arg0) throws IOException {
        this.method1929(0);
        this.field5090.method482(-1);
        field5091++;
        if (arg0) {
            this.field5066 = 37L;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field5080++;
        if (arg4 >= -41) {
            field5077 = null;
        }
        int var8 = class83.method476(true, class188.field3398, arg7, class239.field4321);
        int var9 = class83.method476(true, class188.field3398, arg5, class239.field4321);
        int var10 = class83.method476(true, class31.field481, arg0, class9.field173);
        int var11 = class83.method476(true, class31.field481, arg2, class9.field173);
        int var12 = class83.method476(true, class188.field3398, arg1 + arg7, class239.field4321);
        int var13 = class83.method476(true, class188.field3398, arg5 - arg1, class239.field4321);
        for (int var14 = var8; var14 < var12; var14++) {
            method1927(class15.field268[var14], arg6, var10, -117, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            method1927(class15.field268[var15], arg6, var10, -122, var11);
        }
        int var16 = class83.method476(true, class31.field481, arg0 + arg1, class9.field173);
        int var17 = class83.method476(true, class31.field481, arg2 - arg1, class9.field173);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class15.field268[var18];
            method1927(var19, arg6, var10, -92, var16);
            method1927(var19, arg3, var16, -68, var17);
            method1927(var19, arg6, var17, -86, var11);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static final void method1933(int arg0) {
        if (arg0 == -22398) {
            class217.field3975.method824(-119);
            field5079++;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III[B)V")
    public final void method1934(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5087++;
        try {
            if ((long) arg1 + this.field5082 > this.field5066) {
                this.field5066 = (long) arg1 + this.field5082;
            }
            if (this.field5085 != -1L && (this.field5085 > this.field5082 || this.field5082 > ((long) this.field5089 + this.field5085))) {
                this.method1929(~arg0);
            }
            if ((long) arg0 != this.field5085 && (long) this.field5086.length + this.field5085 < (long) arg1 + this.field5082) {
                int var5 = (int) (this.field5085 + (long) this.field5086.length - this.field5082);
                class275.method1813(arg3, arg2, this.field5086, (int) (this.field5082 - this.field5085), var5);
                arg2 += var5;
                this.field5082 += (long) var5;
                arg1 -= var5;
                this.field5089 = this.field5086.length;
                this.method1929(0);
            }
            if (this.field5086.length < arg1) {
                if (this.field5082 != this.field5072) {
                    this.field5090.method484(this.field5082, arg0 - 105);
                    this.field5072 = this.field5082;
                }
                this.field5090.method479(arg1, 4867, arg3, arg2);
                this.field5072 += (long) arg1;
                if (this.field5072 > this.field5069) {
                    this.field5069 = this.field5072;
                }
                long var6 = -1L;
                if ((long) arg1 + this.field5082 > this.field5071 && ((long) arg1 + this.field5082) <= ((long) this.field5075 + this.field5071)) {
                    var6 = (long) arg1 + this.field5082;
                } else if (((long) this.field5075 + this.field5071) > this.field5082 && (long) this.field5075 + this.field5071 <= (long) arg1 + this.field5082) {
                    var6 = this.field5071 + ((long) this.field5075);
                }
                long var8 = -1L;
                if (this.field5071 <= this.field5082 && this.field5082 < ((long) this.field5075 + this.field5071)) {
                    var8 = this.field5082;
                } else if (this.field5071 >= this.field5082 && this.field5071 < (long) arg1 + this.field5082) {
                    var8 = this.field5071;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class275.method1813(arg3, (int) (var8 + (long) arg2 - this.field5082), this.field5065, (int) (var8 - this.field5071), var10);
                }
                this.field5082 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field5085 == -1L) {
                    this.field5085 = this.field5082;
                }
                class275.method1813(arg3, arg2, this.field5086, (int) (this.field5082 - this.field5085), arg1);
                this.field5082 += (long) arg1;
                if ((long) this.field5089 < this.field5082 - this.field5085) {
                    this.field5089 = (int) (this.field5082 - this.field5085);
                }
            }
        } catch (IOException var12) {
            this.field5072 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)J")
    public final long method1935(int arg0) {
        if (arg0 == -12158) {
            field5073++;
            return this.field5066;
        } else {
            return -21L;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lpe;II)V")
    public class289(class84 arg0, int arg1, int arg2) throws IOException {
        this.field5090 = arg0;
        this.field5066 = this.field5069 = arg0.method483(-1);
        this.field5065 = new byte[arg1];
        this.field5086 = new byte[arg2];
        this.field5082 = 0L;
    }
}
