import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class27 extends class216 {

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    private int field373 = -32768;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "Z")
    private boolean field377 = true;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    private int field375 = -1;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    private int field381 = 0;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "Lcl;")
    private class32 field374 = null;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    private int field380 = -1;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "Z")
    private boolean field384 = false;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    private int field382 = 0;

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
    private int field407 = 0;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!mn", name = "W", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "Lwa;")
    private class312 field386;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "Lph;")
    public static class229 field394 = class266.method1858("runes", 0);

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "Lph;")
    public static class229 field395 = class266.method1858(":duelfriend:", 0);

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "[B")
    public static byte[] field399 = new byte[32896];

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "[J")
    public static long[] field409;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!mn", name = "V", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!mn", name = "X", descriptor = "Lbn;")
    private class194 field414;

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "Lvf;")
    public static class33 field408;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "Lsi;")
    public static class66 field398;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "[I")
    public static int[] field387;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "[[B")
    public static byte[][] field404;

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIIIIZLrk;)V", line = 559)
    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class216 arg8) {
        this.field405 = arg3;
        this.field410 = arg2;
        this.field413 = arg5;
        this.field385 = arg1;
        this.field392 = arg4;
        this.field379 = arg0;
        if (class99.field1675 && arg8 != null) {
            if ((arg8 instanceof class27)) {
                ((class27) arg8).method180((byte) 86);
            } else {
                class83 var10 = class260.method1807(false, this.field379);
                if (var10.field1373 != null) {
                    var10 = var10.method613((byte) -108);
                }
                if (var10 != null) {
                    class105.method802(this.field410, 0, 1548233894, this.field385, this.field392, this.field413, this.field405, var10, 0);
                }
            }
        }
        if (arg6 != -1) {
            this.field386 = class53.method362((byte) -56, arg6);
            this.field402 = class319.field5393 - 1;
            this.field403 = 0;
            if (this.field386.field5229 == 0 && arg8 != null && arg8 instanceof class27) {
                class27 var11 = (class27) arg8;
                if (this.field386 == var11.field386) {
                    this.field402 = var11.field402;
                    this.field403 = var11.field403;
                    return;
                }
            }
            if (arg7 && this.field386.field5228 != -1) {
                this.field403 = (int) ((double) this.field386.field5226.length * Math.random());
                this.field402 -= (int) (Math.random() * (double) this.field386.field5236[this.field403]);
            }
        }
        if (class99.field1675 && arg8 != null) {
            this.method189(127, true);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)V", line = 14)
    private final void method179(int arg0, byte arg1, int arg2) {
        if (this.field386 != null) {
            int var4 = class319.field5393 - this.field402;
            if (var4 > 100 && this.field386.field5228 > 0) {
                int var5 = this.field386.field5226.length - this.field386.field5228;
                while (this.field403 < var5 && var4 > this.field386.field5236[this.field403]) {
                    var4 -= this.field386.field5236[this.field403];
                    this.field403++;
                }
                if (this.field403 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field386.field5226.length; var7++) {
                        var6 += this.field386.field5236[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field386.field5236[this.field403]) {
                            break label62;
                        }
                        class176.method1265(56, false, this.field403, arg2, this.field386, arg0);
                        var4 -= this.field386.field5236[this.field403];
                        this.field403++;
                    } while (this.field386.field5226.length > this.field403);
                    this.field403 -= this.field386.field5228;
                } while (this.field403 >= 0 && this.field403 < this.field386.field5226.length);
                this.field386 = null;
            }
            this.field402 = class319.field5393 - var4;
        }
        field393++;
        if (arg1 > -13) {
            this.method186(-28);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 77)
    public final void method180(byte arg0) {
        if (this.field374 != null) {
            class137.method975(this.field374, this.field382, this.field381, this.field407);
        }
        this.field374 = null;
        field411++;
        this.field380 = -1;
        this.field375 = -1;
        if (arg0 <= 65) {
            this.field384 = true;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLpi;)V", line = 98)
    public static final void method181(boolean arg0, class218 arg1) {
        long var2 = 0L;
        field383++;
        if (arg1.field3579 == 0) {
            var2 = class321.method2178(arg1.field3577, arg1.field3575, arg1.field3588);
        }
        if (arg1.field3579 == 1) {
            var2 = class287.method1971(arg1.field3577, arg1.field3575, arg1.field3588);
        }
        int var4 = -1;
        if (arg1.field3579 == 2) {
            var2 = class281.method1937(arg1.field3577, arg1.field3575, arg1.field3588);
        }
        if (!arg0) {
            field394 = (class229) null;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg1.field3579 == 3) {
            var2 = class146.method1072(arg1.field3577, arg1.field3575, arg1.field3588);
        }
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7C9C6) >> 14;
            var6 = (int) var2 >> 20 & 0x3;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg1.field3576 = var6;
        arg1.field3590 = var4;
        arg1.field3584 = var5;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()I", line = 138)
    public final int method182() {
        field388++;
        return this.field373;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V", line = 168)
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field396++;
        class216 var6 = null;
        if (class99.field1675) {
            var6 = this.method189(103, true);
        } else {
            this.method179(arg3, (byte) -55, arg4);
        }
        if (!this.field384) {
            if (var6 == null) {
                var6 = this.method186(1);
            }
            if (var6 == null) {
                return;
            }
            this.method190(-1, var6);
        }
        if (this.field414 != null) {
            this.field414.method1370(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B[BII)Lph;", line = 207)
    public static final class229 method184(byte arg0, byte[] arg1, int arg2, int arg3) {
        field376++;
        class229 var4 = new class229();
        var4.field3785 = 0;
        if (arg0 <= 31) {
            return (class229) null;
        }
        var4.field3772 = new byte[arg2];
        for (int var5 = arg3; var5 < (arg2 + arg3); var5++) {
            if (arg1[var5] != 0) {
                var4.field3772[var4.field3785++] = arg1[var5];
            }
        }
        return var4;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field399[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field406 = 2301979;
        field409 = new long[500];
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIIJILbn;)V", line = 250)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10) {
        field389++;
        class216 var13 = this.method186(1);
        if (var13 != null) {
            this.method190(-1, var13);
            var13.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field414);
        }
    }

    @OriginalMember(owner = "client!mn", name = "finalize", descriptor = "()V", line = 272)
    protected final void finalize() {
        field397++;
        if (this.field414 != null) {
            this.field414.method1375();
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lrk;", line = 285)
    private final class216 method186(int arg0) {
        field412++;
        if (arg0 != 1) {
            this.field386 = (class312) null;
        }
        return this.method189(111, false);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 299)
    public static void method187(int arg0) {
        field404 = (byte[][]) null;
        field398 = null;
        field387 = null;
        field395 = null;
        field409 = null;
        field408 = null;
        int var1 = -19 % ((-arg0 - 61) / 53);
        field399 = null;
        field394 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V", line = 317)
    public static final void method188(byte arg0) {
        field401++;
        if (arg0 <= -79) {
            class157.field2555 = new class227();
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)Lrk;", line = 353)
    private final class216 method189(int arg0, boolean arg1) {
        field390++;
        boolean var3 = class192.field3174 != class103.field1753;
        class83 var4 = class260.method1807(false, this.field379);
        if (var4.field1373 != null) {
            var4 = var4.method613((byte) -119);
        }
        if (var4 == null) {
            if (class99.field1675 && !var3) {
                this.method180((byte) 77);
            }
            return null;
        }
        int var5 = this.field410 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field1434;
            var7 = var4.field1424;
        } else {
            var6 = var4.field1424;
            var7 = var4.field1434;
        }
        int var8 = (var7 + 1 >> 1) + this.field392;
        int var9 = (var7 >> 1) + this.field392;
        int var10 = (var6 >> 1) + this.field413;
        int var11 = (var6 + 1 >> 1) + this.field413;
        this.method179(var9 * 128, (byte) -26, var10 * 128);
        boolean var12 = !var3 && var4.field1388 && (this.field375 != var4.field1421 || this.field403 != this.field380 && class157.field2559 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class192.field3174[this.field405];
        int var14 = var13[var8][var11] + var13[var9][var11] + var13[var8][var10] + var13[var9][var10] >> 2;
        int var15 = (this.field392 << 7) + (var7 << 6);
        if (arg0 <= 93) {
            this.method186(123);
        }
        int var16 = (this.field413 << 7) + (var6 << 6);
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class103.field1753[0];
        } else if (this.field405 < 3) {
            var17 = class192.field3174[this.field405 + 1];
        }
        if (class99.field1675 && var12) {
            class137.method975(this.field374, this.field382, this.field381, this.field407);
        }
        boolean var18 = this.field374 == null;
        class58 var19;
        if (this.field386 == null) {
            var19 = var4.method618((byte) -104, var15, var17, var12, var13, var14, this.field385, this.field410, false, var16, var18 ? class300.field4873 : this.field374);
        } else {
            var19 = var4.method608(this.field385, var17, var14, var12, this.field410, var18 ? class300.field4873 : this.field374, false, this.field386, var15, var13, var16, this.field403);
        }
        if (var19 == null) {
            return null;
        }
        if (class99.field1675 && var12) {
            int var20 = 0;
            if (var18) {
                class300.field4873 = var19.field821;
            }
            if (this.field405 != 0) {
                int[][] var21 = class192.field3174[0];
                var20 = var14 - (var21[var9][var10] + var21[var8][var10] + (var21[var9][var11] - -var21[var8][var11]) >> 2);
            }
            class32 var22 = var19.field821;
            if (this.field377 && class137.method980(var22, var15, var20, var16)) {
                this.field377 = false;
            }
            if (!this.field377) {
                class137.method977(var22, var15, var20, var16);
                this.field407 = var16;
                this.field381 = var20;
                if (var18) {
                    class300.field4873 = null;
                }
                this.field382 = var15;
                this.field374 = var22;
            }
            this.field380 = this.field403;
            this.field375 = var4.field1421;
        }
        return var19.field826;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILrk;)V", line = 493)
    private final void method190(int arg0, class216 arg1) {
        field400++;
        if (class99.field1675) {
            class322 var3 = (class322) arg1;
            if ((this.field414 == null || this.field414.field3197) && (var3.field5464 != null || var3.field5476 != null)) {
                class83 var4 = class260.method1807(false, this.field379);
                if (var4.field1373 != null) {
                    var4 = var4.method613((byte) -82);
                }
                if (var4 != null) {
                    this.field414 = new class194(class319.field5393, var4.field1434, var4.field1424);
                }
            }
            if (this.field414 != null) {
                this.field414.method1372(var3.field5464, var3.field5476, false, var3.field5448, var3.field5461, var3.field5459);
            }
        } else {
            class246 var5 = (class246) arg1;
            if ((this.field414 == null || this.field414.field3197) && (var5.field4083 != null || var5.field4064 != null)) {
                class83 var6 = class260.method1807(false, this.field379);
                if (var6.field1373 != null) {
                    var6 = var6.method613((byte) -104);
                }
                if (var6 != null) {
                    this.field414 = new class194(class319.field5393, var6.field1434, var6.field1424);
                }
            }
            if (this.field414 != null) {
                this.field414.method1372(var5.field4083, var5.field4064, false, var5.field4072, var5.field4080, var5.field4068);
            }
        }
        if (arg0 != -1) {
            field406 = 95;
        }
        this.field384 = true;
    }
}
