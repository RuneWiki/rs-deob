import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class119 {

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    private int field2176 = 0;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "J")
    private long field2177 = -1L;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "J")
    private long field2180 = -1L;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Lfg;")
    private class63 field2164;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "J")
    private long field2165;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "J")
    private long field2154;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "[B")
    private byte[] field2171;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "J")
    private long field2166;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "[B")
    private byte[] field2172;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Li;")
    public static class88 field2158 = class208.method1425(105, "scape main");

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Li;")
    public static class88 field2156 = class208.method1425(105, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Li;")
    public static class88 field2167 = class208.method1425(105, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Li;")
    public static class88 field2173 = class208.method1425(105, ")2");

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field2174 = 127;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[I")
    public static int[] field2169 = new int[2000];

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "J")
    private long field2178;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BIII)V")
    public final void method808(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2184++;
        try {
            if (this.field2154 < (long) arg1 + this.field2166) {
                this.field2154 = (long) arg1 + this.field2166;
            }
            if (this.field2180 != -1L && (this.field2180 > this.field2166 || this.field2166 > (long) this.field2176 + this.field2180)) {
                this.method809(-1);
            }
            if (this.field2180 != -1L && (long) this.field2172.length + this.field2180 < this.field2166 - -((long) arg1)) {
                int var5 = (int) (this.field2180 + (long) this.field2172.length - this.field2166);
                arg1 -= var5;
                class124.method838(arg0, arg2, this.field2172, (int) (this.field2166 - this.field2180), var5);
                this.field2166 += var5;
                this.field2176 = this.field2172.length;
                arg2 += var5;
                this.method809(-1);
            }
            if (this.field2172.length < arg1) {
                if (this.field2178 != this.field2166) {
                    this.field2164.method444(1, this.field2166);
                    this.field2178 = this.field2166;
                }
                this.field2164.method443(arg2, (byte) -66, arg1, arg0);
                this.field2178 += arg1;
                if (this.field2178 > this.field2165) {
                    this.field2165 = this.field2178;
                }
                long var6 = -1L;
                if (this.field2177 <= this.field2166 && (long) this.field2159 + this.field2177 > this.field2166) {
                    var6 = this.field2166;
                } else if (this.field2177 >= this.field2166 && (long) arg1 + this.field2166 > this.field2177) {
                    var6 = this.field2177;
                }
                long var8 = -1L;
                if ((long) arg1 + this.field2166 > this.field2177 && (long) arg1 + this.field2166 <= (long) this.field2159 + this.field2177) {
                    var8 = (long) arg1 + this.field2166;
                } else if ((long) this.field2159 + this.field2177 > this.field2166 && (long) this.field2159 + this.field2177 <= (long) arg1 + this.field2166) {
                    var8 = (long) this.field2159 + this.field2177;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class124.method838(arg0, (int) ((long) arg2 + var6 - this.field2166), this.field2171, (int) (var6 - this.field2177), var10);
                }
                this.field2166 += arg1;
                return;
            }
            if (arg1 > 0) {
                if (this.field2180 == -1L) {
                    this.field2180 = this.field2166;
                }
                class124.method838(arg0, arg2, this.field2172, (int) (this.field2166 - this.field2180), arg1);
                this.field2166 += arg1;
                if ((long) this.field2176 < this.field2166 - this.field2180) {
                    this.field2176 = (int) (this.field2166 - this.field2180);
                }
                return;
            }
        } catch (IOException var12) {
            this.field2178 = -1L;
            throw var12;
        }
        if (arg3 != -6668) {
            this.field2178 = -14L;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    private final void method809(int arg0) throws IOException {
        field2181++;
        if ((long) arg0 == this.field2180) {
            return;
        }
        if (this.field2180 != this.field2178) {
            this.field2164.method444(1, this.field2180);
            this.field2178 = this.field2180;
        }
        this.field2164.method443(0, (byte) -1, this.field2176, this.field2172);
        long var2 = -1L;
        this.field2178 += this.field2176;
        if (this.field2177 <= this.field2180 && this.field2180 < (long) this.field2159 + this.field2177) {
            var2 = this.field2180;
        } else if (this.field2177 >= this.field2180 && this.field2177 < (long) this.field2176 + this.field2180) {
            var2 = this.field2177;
        }
        if (this.field2178 > this.field2165) {
            this.field2165 = this.field2178;
        }
        long var4 = -1L;
        if (this.field2177 < this.field2180 + (long) this.field2176 && this.field2180 + (long) this.field2176 <= this.field2177 - -((long) this.field2159)) {
            var4 = this.field2180 + (long) this.field2176;
        } else if (this.field2180 < (long) this.field2159 + this.field2177 && (long) this.field2159 + this.field2177 <= (long) this.field2176 + this.field2180) {
            var4 = (long) this.field2159 + this.field2177;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class124.method838(this.field2172, (int) (var2 - this.field2180), this.field2171, (int) (var2 - this.field2177), var6);
        }
        this.field2176 = 0;
        this.field2180 = -1L;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)J")
    public final long method810(int arg0) {
        field2160++;
        if (arg0 <= 51) {
            method816(95, (byte) -2, null);
        }
        return this.field2154;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    private final void method811(int arg0) throws IOException {
        this.field2159 = 0;
        if (this.field2178 != this.field2166) {
            this.field2164.method444(1, this.field2166);
            this.field2178 = this.field2166;
        }
        field2162++;
        this.field2177 = this.field2166;
        while (this.field2159 < this.field2171.length) {
            int var2 = this.field2171.length - this.field2159;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2164.method448((byte) -62, this.field2159, var2, this.field2171);
            if (var3 == -1) {
                break;
            }
            this.field2178 += var3;
            this.field2159 += var3;
        }
        int var4 = 89 / ((arg0 + 57) / 61);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[B)V")
    public final void method812(int arg0, byte[] arg1) throws IOException {
        field2175++;
        this.method818(arg1, (byte) 58, 0, arg1.length);
        if (arg0 != -16777216) {
            this.method810(22);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method813(byte arg0) {
        field2156 = null;
        field2158 = null;
        field2167 = null;
        field2173 = null;
        if (arg0 == -119) {
            field2169 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method814(int arg0, Random arg1, int arg2) {
        field2179++;
        if (arg2 != 54210528) {
            method813((byte) -128);
        }
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class149.method1019(arg0, 0)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class160.method1082(var4, arg0, arg2 ^ 0xFCC4D079);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method815(byte arg0) {
        int var2 = 31 % ((arg0 + 57) / 47);
        field2163++;
        return this.field2164.method445((byte) 56);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLbj;)V")
    public static final void method816(int arg0, byte arg1, class22 arg2) {
        field2155++;
        if (class79.field1427 == null) {
            class188.method1314(null, 255, 255, arg1, -439631408, 0, true);
            class10.field141[arg0] = arg2;
        } else {
            class79.field1427.field831 = arg0 * 8 + 5;
            int var3 = class79.field1427.method323((byte) -54);
            int var4 = class79.field1427.method323((byte) -67);
            arg2.method109(var3, arg1 + 55, var4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIIIII)V")
    public static final void method817(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class52 var6 = class29.field489[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class95 var7 = var6.field947;
        if (var7 != null) {
            int var8 = var7.field1773;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class56 var10 = var6.field964;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1065;
        int var12 = var10.field1066;
        int var13 = var10.field1061;
        int var14 = var10.field1067;
        int[] var15 = class225.field4234[var11];
        int[] var16 = class16.field248[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BBII)V")
    public final void method818(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field2170++;
        try {
            if (arg2 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field2180 != -1L && this.field2166 >= this.field2180 && (long) arg3 + this.field2166 <= this.field2180 - -((long) this.field2176)) {
                class124.method838(this.field2172, (int) (this.field2166 - this.field2180), arg0, arg2, arg3);
                this.field2166 += arg3;
                return;
            }
            long var5 = this.field2166;
            int var7 = -38 % ((arg1 + 45) / 63);
            int var8 = arg2;
            int var9 = arg3;
            if (this.field2166 >= this.field2177 && this.field2177 + (long) this.field2159 > this.field2166) {
                int var10 = (int) ((long) this.field2159 + this.field2177 - this.field2166);
                if (var10 > arg3) {
                    var10 = arg3;
                }
                arg3 -= var10;
                class124.method838(this.field2171, (int) (this.field2166 - this.field2177), arg0, arg2, var10);
                this.field2166 += var10;
                arg2 += var10;
            }
            if (arg3 > this.field2171.length) {
                this.field2164.method444(1, this.field2166);
                this.field2178 = this.field2166;
                while (arg3 > 0) {
                    int var12 = this.field2164.method448((byte) -62, arg2, arg3, arg0);
                    if (var12 == -1) {
                        break;
                    }
                    arg2 += var12;
                    this.field2166 += var12;
                    arg3 -= var12;
                    this.field2178 += var12;
                }
            } else if (arg3 > 0) {
                this.method811(-126);
                int var11 = arg3;
                if (arg3 > this.field2159) {
                    var11 = this.field2159;
                }
                arg3 -= var11;
                class124.method838(this.field2171, 0, arg0, arg2, var11);
                arg2 += var11;
                this.field2166 += var11;
            }
            if (this.field2180 != -1L) {
                if (this.field2180 > this.field2166 && arg3 > 0) {
                    int var13 = (int) (this.field2180 - this.field2166) + arg2;
                    if (arg2 + arg3 < var13) {
                        var13 = arg2 + arg3;
                    }
                    while (var13 > arg2) {
                        arg0[arg2++] = 0;
                        arg3--;
                        this.field2166++;
                    }
                }
                long var14 = -1L;
                if (this.field2180 >= var5 && (long) var9 + var5 > this.field2180) {
                    var14 = this.field2180;
                } else if (var5 >= this.field2180 && var5 < this.field2180 + (long) this.field2176) {
                    var14 = var5;
                }
                long var16 = -1L;
                if (this.field2180 + (long) this.field2176 > var5 && this.field2180 + (long) this.field2176 <= (long) var9 + var5) {
                    var16 = this.field2180 + (long) this.field2176;
                } else if ((long) var9 + var5 > this.field2180 && (long) var9 + var5 <= (long) this.field2176 + this.field2180) {
                    var16 = (long) var9 + var5;
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class124.method838(this.field2172, (int) (var14 - this.field2180), arg0, (int) (var14 - var5) + var8, var18);
                    if (this.field2166 < var16) {
                        arg3 = (int) ((long) arg3 + this.field2166 - var16);
                        this.field2166 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2178 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
    public final void method819(int arg0) throws IOException {
        this.method809(-1);
        field2182++;
        this.field2164.method446(0);
        if (arg0 != -32103) {
            this.method815((byte) -69);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BJ)V")
    public final void method820(byte arg0, long arg1) throws IOException {
        field2168++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method815((byte) 123));
        } else if (arg0 > 76) {
            this.field2166 = arg1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lfg;II)V")
    public class119(class63 arg0, int arg1, int arg2) throws IOException {
        this.field2164 = arg0;
        this.field2154 = this.field2165 = arg0.method447((byte) 125);
        this.field2171 = new byte[arg1];
        this.field2166 = 0L;
        this.field2172 = new byte[arg2];
    }
}
