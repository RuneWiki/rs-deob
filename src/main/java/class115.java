import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class115 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "J")
    private long field2315 = -1L;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    private int field2328 = 0;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "J")
    private long field2337 = -1L;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lkh;")
    private class106 field2338;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "J")
    private long field2329;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "J")
    private long field2326;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[B")
    private byte[] field2330;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "J")
    private long field2334;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "[B")
    private byte[] field2336;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Z")
    public static boolean field2331 = false;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ljd;")
    public static class92 field2316 = class202.method1325((byte) 90, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Z")
    public static boolean field2339 = false;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lbg;")
    public static class18 field2323 = new class18();

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "Ljd;")
    public static class92 field2341 = class202.method1325((byte) 90, "::errortest");

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field2342 = -1;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "Ljd;")
    public static class92 field2345 = class202.method1325((byte) 90, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "J")
    private long field2324;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "La;")
    public static class1 field2319;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIII)V")
    public final void method770(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2322++;
        try {
            int var5 = -23 / ((arg2 - 15) / 45);
            if ((long) arg1 + this.field2334 > this.field2326) {
                this.field2326 = (long) arg1 + this.field2334;
            }
            if (this.field2315 != -1L && (this.field2334 < this.field2315 || this.field2334 > (long) this.field2328 + this.field2315)) {
                this.method771(-1);
            }
            if (this.field2315 != -1L && (long) arg1 + this.field2334 > (long) this.field2330.length + this.field2315) {
                int var6 = (int) (this.field2315 + (long) this.field2330.length - this.field2334);
                class11.method75(arg0, arg3, this.field2330, (int) (this.field2334 - this.field2315), var6);
                arg1 -= var6;
                arg3 += var6;
                this.field2334 += var6;
                this.field2328 = this.field2330.length;
                this.method771(-1);
            }
            if (this.field2330.length < arg1) {
                if (this.field2334 != this.field2324) {
                    this.field2338.method722(1, this.field2334);
                    this.field2324 = this.field2334;
                }
                this.field2338.method727((byte) 114, arg3, arg1, arg0);
                long var7 = -1L;
                if (this.field2337 <= this.field2334 && (long) this.field2321 + this.field2337 > this.field2334) {
                    var7 = this.field2334;
                } else if (this.field2334 <= this.field2337 && (long) arg1 + this.field2334 > this.field2337) {
                    var7 = this.field2337;
                }
                this.field2324 += arg1;
                if (this.field2329 < this.field2324) {
                    this.field2329 = this.field2324;
                }
                long var9 = -1L;
                if ((long) arg1 + this.field2334 > this.field2337 && (long) this.field2321 + this.field2337 >= (long) arg1 + this.field2334) {
                    var9 = this.field2334 + (long) arg1;
                } else if (this.field2334 < (long) this.field2321 + this.field2337 && (long) this.field2321 + this.field2337 <= (long) arg1 + this.field2334) {
                    var9 = (long) this.field2321 + this.field2337;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class11.method75(arg0, (int) ((long) arg3 + var7 - this.field2334), this.field2336, (int) (var7 - this.field2337), var11);
                }
                this.field2334 += arg1;
            } else if (arg1 > 0) {
                if (this.field2315 == -1L) {
                    this.field2315 = this.field2334;
                }
                class11.method75(arg0, arg3, this.field2330, (int) (this.field2334 - this.field2315), arg1);
                this.field2334 += arg1;
                if ((long) this.field2328 < this.field2334 - this.field2315) {
                    this.field2328 = (int) (this.field2334 - this.field2315);
                }
            }
        } catch (IOException var13) {
            this.field2324 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    private final void method771(int arg0) throws IOException {
        if ((long) arg0 != this.field2315) {
            if (this.field2324 != this.field2315) {
                this.field2338.method722(1, this.field2315);
                this.field2324 = this.field2315;
            }
            this.field2338.method727((byte) 114, 0, this.field2328, this.field2330);
            long var2 = -1L;
            long var4 = -1L;
            this.field2324 += this.field2328;
            if (this.field2337 < (long) this.field2328 + this.field2315 && this.field2315 + (long) this.field2328 <= this.field2337 - -((long) this.field2321)) {
                var2 = (long) this.field2328 + this.field2315;
            } else if ((long) this.field2321 + this.field2337 > this.field2315 && (long) this.field2321 + this.field2337 <= this.field2315 - -((long) this.field2328)) {
                var2 = this.field2337 + (long) this.field2321;
            }
            if (this.field2315 >= this.field2337 && (long) this.field2321 + this.field2337 > this.field2315) {
                var4 = this.field2315;
            } else if (this.field2337 >= this.field2315 && (long) this.field2328 + this.field2315 > this.field2337) {
                var4 = this.field2337;
            }
            if (this.field2329 < this.field2324) {
                this.field2329 = this.field2324;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class11.method75(this.field2330, (int) (var4 - this.field2315), this.field2336, (int) (var4 - this.field2337), var6);
            }
            this.field2328 = 0;
            this.field2315 = -1L;
        }
        field2318++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)J")
    public final long method772(byte arg0) {
        field2313++;
        if (arg0 >= -48) {
            field2343 = -56;
        }
        return this.field2326;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    private final void method773(int arg0) throws IOException {
        this.field2321 = 0;
        if (this.field2334 != this.field2324) {
            this.field2338.method722(1, this.field2334);
            this.field2324 = this.field2334;
        }
        this.field2337 = this.field2334;
        if (arg0 < 104) {
            method780(-58, -28, -57, -23, 41);
        }
        while (this.field2321 < this.field2336.length) {
            int var2 = this.field2336.length - this.field2321;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2338.method726(this.field2321, var2, this.field2336, (byte) -101);
            if (var3 == -1) {
                break;
            }
            this.field2324 += var3;
            this.field2321 += var3;
        }
        field2332++;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "([BIII)V")
    public final void method774(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2335++;
        try {
            if (arg2 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (arg1 < 70) {
                method781(-22, -9);
            }
            if (this.field2315 != -1L && this.field2315 <= this.field2334 && (long) this.field2328 + this.field2315 >= (long) arg3 + this.field2334) {
                class11.method75(this.field2330, (int) (this.field2334 - this.field2315), arg0, arg2, arg3);
                this.field2334 += arg3;
                return;
            }
            long var5 = this.field2334;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field2334 >= this.field2337 && this.field2337 + (long) this.field2321 > this.field2334) {
                int var9 = (int) ((long) this.field2321 + this.field2337 - this.field2334);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class11.method75(this.field2336, (int) (this.field2334 - this.field2337), arg0, arg2, var9);
                this.field2334 += var9;
                arg2 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field2336.length) {
                this.field2338.method722(1, this.field2334);
                this.field2324 = this.field2334;
                while (arg3 > 0) {
                    int var11 = this.field2338.method726(arg2, arg3, arg0, (byte) -46);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 -= var11;
                    this.field2334 += var11;
                    arg2 += var11;
                    this.field2324 += var11;
                }
            } else if (arg3 > 0) {
                this.method773(114);
                int var10 = arg3;
                if (arg3 > this.field2321) {
                    var10 = this.field2321;
                }
                class11.method75(this.field2336, 0, arg0, arg2, var10);
                arg3 -= var10;
                this.field2334 += var10;
                arg2 += var10;
            }
            if (this.field2315 != -1L) {
                if (this.field2315 > this.field2334 && arg3 > 0) {
                    int var12 = (int) (this.field2315 - this.field2334) + arg2;
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (arg2 < var12) {
                        arg3--;
                        arg0[arg2++] = 0;
                        this.field2334++;
                    }
                }
                long var13 = -1L;
                if (var5 < this.field2315 + (long) this.field2328 && (long) this.field2328 + this.field2315 <= var5 - -((long) var7)) {
                    var13 = (long) this.field2328 + this.field2315;
                } else if ((long) var7 + var5 > this.field2315 && (long) this.field2328 + this.field2315 >= (long) var7 + var5) {
                    var13 = (long) var7 + var5;
                }
                long var15 = -1L;
                if (var5 <= this.field2315 && (long) var7 + var5 > this.field2315) {
                    var15 = this.field2315;
                } else if (this.field2315 <= var5 && (long) this.field2328 + this.field2315 > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class11.method75(this.field2330, (int) (var15 - this.field2315), arg0, var8 + (int) (var15 - var5), var17);
                    if (this.field2334 < var13) {
                        arg3 = (int) ((long) arg3 + this.field2334 - var13);
                        this.field2334 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2324 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method775(int arg0) {
        field2317++;
        if (arg0 != 0) {
            field2319 = null;
        }
        return this.field2338.method724((byte) -127);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BI)V")
    public final void method776(byte[] arg0, int arg1) throws IOException {
        field2314++;
        this.method774(arg0, 123, 0, arg0.length);
        if (arg1 > -102) {
            field2342 = -101;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public final void method777(int arg0) throws IOException {
        field2320++;
        if (arg0 > 118) {
            this.method771(-1);
            this.field2338.method725((byte) 50);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IJ)V")
    public final void method778(int arg0, long arg1) throws IOException {
        field2333++;
        int var4 = -17 % ((-arg0 - 73) / 36);
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method775(0));
        }
        this.field2334 = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public static void method779(int arg0) {
        field2345 = null;
        field2319 = null;
        if (arg0 != -16561) {
            method782((byte) 46, -125, 8);
        }
        field2341 = null;
        field2316 = null;
        field2323 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)V")
    public static final void method780(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 39 % ((50 - arg3) / 62);
        for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    client.field691[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        class125.field2538[0][var7][var6] = class125.field2538[0][var7 - 1][var6];
                    }
                    if (arg1 + arg4 == var7 && var7 < 103) {
                        class125.field2538[0][var7][var6] = class125.field2538[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        class125.field2538[0][var7][var6] = class125.field2538[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class125.field2538[0][var7][var6] = class125.field2538[0][var7][var6 + 1];
                    }
                }
            }
        }
        field2327++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method781(int arg0, int arg1) {
        field2325++;
        class116 var2 = (class116) class29.field637.method216(-120, (long) arg1);
        if (var2 != null && arg0 == -1) {
            for (int var3 = 0; var3 < var2.field2356.length; var3++) {
                var2.field2356[var3] = -1;
                var2.field2347[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)I")
    public static final int method782(byte arg0, int arg1, int arg2) {
        field2340++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 < 67) {
            field2341 = null;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lkh;II)V")
    public class115(class106 arg0, int arg1, int arg2) throws IOException {
        this.field2338 = arg0;
        this.field2326 = this.field2329 = arg0.method723((byte) 13);
        this.field2330 = new byte[arg2];
        this.field2334 = 0L;
        this.field2336 = new byte[arg1];
    }
}
