import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class263 {

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    private int field3265 = 0;

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "J")
    private long field3280 = -1L;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "J")
    private long field3276 = -1L;

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "Lww;")
    private class729 field3277;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "J")
    private long field3262;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "J")
    private long field3271;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "[B")
    private byte[] field3266;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "[B")
    private byte[] field3261;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "J")
    private long field3272;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "Ldh;")
    public static class320 field3267 = new class320(116, 2);

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "[I")
    public static int[] field3282 = new int[14];

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    private int field3269;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!oca", name = "x", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "J")
    private long field3279;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V", line = 11)
    public static void method1581(boolean arg0) {
        if (!arg0) {
            field3267 = null;
        }
        field3282 = null;
        field3267 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Ljava/io/File;", line = 23)
    private final File method1582(int arg0) {
        if (arg0 < 122) {
            return null;
        } else {
            field3278++;
            return this.field3277.method4068((byte) -100);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(JI)V", line = 34)
    public final void method1583(long arg0, int arg1) throws IOException {
        field3273++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1582(124));
        }
        if (arg1 != 255) {
            this.field3265 = -39;
        }
        this.field3272 = arg0;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V", line = 51)
    private final void method1584(int arg0) throws IOException {
        if (arg0 > -117) {
            field3267 = null;
        }
        if (this.field3276 != -1L) {
            if (this.field3279 != this.field3276) {
                this.field3277.method4065(this.field3276, (byte) 123);
                this.field3279 = this.field3276;
            }
            this.field3277.method4064(0, this.field3265, this.field3266, 115);
            this.field3279 += this.field3265;
            if (this.field3262 < this.field3279) {
                this.field3262 = this.field3279;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3280 <= this.field3276 && (this.field3280 + ((long) this.field3269)) > this.field3276) {
                var2 = this.field3276;
            } else if (this.field3276 <= this.field3280 && ((long) this.field3265 + this.field3276) > this.field3280) {
                var2 = this.field3280;
            }
            if (this.field3276 + ((long) this.field3265) > this.field3280 && (long) this.field3265 + this.field3276 <= this.field3280 - -((long) this.field3269)) {
                var4 = (long) this.field3265 + this.field3276;
            } else if ((long) this.field3269 + this.field3280 > this.field3276 && ((long) this.field3265 + this.field3276) >= ((long) this.field3269 + this.field3280)) {
                var4 = (long) this.field3269 + this.field3280;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class143.method894(this.field3266, (int) (var2 - this.field3276), this.field3261, (int) (var2 - this.field3280), var6);
            }
            this.field3276 = -1L;
            this.field3265 = 0;
        }
        field3275++;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lww;II)V", line = 651)
    public class263(class729 arg0, int arg1, int arg2) throws IOException {
        this.field3277 = arg0;
        this.field3271 = this.field3262 = arg0.method4059((byte) 88);
        this.field3266 = new byte[arg2];
        this.field3261 = new byte[arg1];
        this.field3272 = 0L;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 129)
    public static final void method1585(boolean arg0, String arg1, int arg2) {
        String var3 = arg1.toLowerCase();
        field3284++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class3.field18.field10190 : class3.field18.field10186);
        for (int var8 = var6; var8 < var7; var8++) {
            class343 var12 = class3.field18.method4058(var8, (byte) 82);
            if (var12.field4445 && var12.method2040(-116).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class406.field5552 = null;
                    class605.field8607 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var5; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var5++] = (short) var8;
            }
        }
        class605.field8607 = var5;
        int var9 = 116 % ((29 - arg2) / 61);
        class406.field5552 = var4;
        class707.field9972 = 0;
        String[] var10 = new String[class605.field8607];
        for (int var11 = 0; var11 < class605.field8607; var11++) {
            var10[var11] = class3.field18.method4058(var4[var11], (byte) 82).method2040(-124);
        }
        class503.method2986((byte) -103, class406.field5552, var10);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I[B)V", line = 204)
    public final void method1586(int arg0, byte[] arg1) throws IOException {
        this.method1590(0, arg1, arg1.length, -1109);
        int var3 = -16 / ((arg0 - 28) / 63);
        field3264++;
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)J", line = 222)
    public final long method1587(int arg0) {
        if (arg0 >= -125) {
            this.field3280 = 32L;
        }
        field3281++;
        return this.field3271;
    }

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)V", line = 242)
    private final void method1588(int arg0) throws IOException {
        field3270++;
        this.field3269 = 0;
        if (this.field3279 != this.field3272) {
            this.field3277.method4065(this.field3272, (byte) 119);
            this.field3279 = this.field3272;
        }
        this.field3280 = this.field3272;
        while (this.field3269 < this.field3261.length) {
            int var2 = this.field3261.length - this.field3269;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3277.method4066(this.field3261, this.field3269, (byte) 125, var2);
            if (var3 == -1) {
                break;
            }
            this.field3269 += var3;
            this.field3279 += var3;
        }
        if (arg0 != 255) {
            method1581(true);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(II[BZ)I", line = 288)
    public static final int method1589(int arg0, int arg1, byte[] arg2, boolean arg3) {
        field3283++;
        if (!arg3) {
            field3267 = null;
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = class43.field482[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I[BII)V", line = 314)
    public final void method1590(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3263++;
        try {
            if (arg1.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (arg3 != -1109) {
                this.field3271 = 114L;
            }
            if (this.field3276 != -1L && this.field3276 <= this.field3272 && (long) this.field3265 + this.field3276 >= (long) arg2 + this.field3272) {
                class143.method894(this.field3266, (int) (this.field3272 - this.field3276), arg1, arg0, arg2);
                this.field3272 += arg2;
                return;
            }
            long var5 = this.field3272;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field3280 <= this.field3272 && this.field3272 < ((long) this.field3269 + this.field3280)) {
                int var9 = (int) (this.field3280 + (long) this.field3269 - this.field3272);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class143.method894(this.field3261, (int) (this.field3272 - this.field3280), arg1, arg0, var9);
                this.field3272 += var9;
                arg2 -= var9;
                arg0 += var9;
            }
            if (arg2 > this.field3261.length) {
                this.field3277.method4065(this.field3272, (byte) -56);
                this.field3279 = this.field3272;
                while (arg2 > 0) {
                    int var10 = this.field3277.method4066(arg1, arg0, (byte) 125, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    arg2 -= var10;
                    this.field3272 += var10;
                    this.field3279 += var10;
                }
            } else if (arg2 > 0) {
                this.method1588(255);
                int var11 = arg2;
                if (arg2 > this.field3269) {
                    var11 = this.field3269;
                }
                class143.method894(this.field3261, 0, arg1, arg0, var11);
                this.field3272 += var11;
                arg0 += var11;
                arg2 -= var11;
            }
            if (this.field3276 != -1L) {
                if (this.field3272 < this.field3276 && arg2 > 0) {
                    int var12 = (int) (this.field3276 - this.field3272) + arg0;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg0) {
                        arg2--;
                        arg1[arg0++] = 0;
                        this.field3272++;
                    }
                }
                long var13 = -1L;
                if (this.field3276 >= var5 && (var5 + ((long) var8)) > this.field3276) {
                    var13 = this.field3276;
                } else if (var5 >= this.field3276 && (this.field3276 + ((long) this.field3265)) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field3265 + this.field3276) > var5 && (this.field3276 + ((long) this.field3265)) <= ((long) var8 + var5)) {
                    var15 = (long) this.field3265 + this.field3276;
                } else if ((long) var8 + var5 > this.field3276 && (long) this.field3265 + this.field3276 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class143.method894(this.field3266, (int) (var13 - this.field3276), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field3272 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field3272));
                        this.field3272 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3279 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)V", line = 502)
    public final void method1591(int arg0) throws IOException {
        field3274++;
        this.method1584(-124);
        if (arg0 >= -39) {
            method1585(false, null, 107);
        }
        this.field3277.method4060((byte) 120);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(II[BI)V", line = 522)
    public final void method1592(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3268++;
        try {
            if (((long) arg1 + this.field3272) > this.field3271) {
                this.field3271 = (long) arg1 + this.field3272;
            }
            if (this.field3276 != -1L && (this.field3272 < this.field3276 || this.field3276 + ((long) this.field3265) < this.field3272)) {
                this.method1584(-123);
            }
            if (arg3 < 0) {
                if (this.field3276 != -1L && (this.field3272 + ((long) arg1)) > ((long) this.field3266.length + this.field3276)) {
                    int var5 = (int) (this.field3276 + (long) this.field3266.length - this.field3272);
                    class143.method894(arg2, arg0, this.field3266, (int) (this.field3272 - this.field3276), var5);
                    arg0 += var5;
                    this.field3272 += var5;
                    arg1 -= var5;
                    this.field3265 = this.field3266.length;
                    this.method1584(-123);
                }
                if (arg1 > this.field3266.length) {
                    if (this.field3279 != this.field3272) {
                        this.field3277.method4065(this.field3272, (byte) 100);
                        this.field3279 = this.field3272;
                    }
                    this.field3277.method4064(arg0, arg1, arg2, 112);
                    this.field3279 += arg1;
                    if (this.field3279 > this.field3262) {
                        this.field3262 = this.field3279;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field3272 >= this.field3280 && this.field3272 < ((long) this.field3269 + this.field3280)) {
                        var6 = this.field3272;
                    } else if (this.field3272 <= this.field3280 && this.field3280 < ((long) arg1 + this.field3272)) {
                        var6 = this.field3280;
                    }
                    if (this.field3272 + ((long) arg1) > this.field3280 && (long) this.field3269 + this.field3280 >= (long) arg1 + this.field3272) {
                        var8 = (long) arg1 + this.field3272;
                    } else if (this.field3272 < (long) this.field3269 + this.field3280 && (this.field3272 + ((long) arg1)) >= (this.field3280 + ((long) this.field3269))) {
                        var8 = (long) this.field3269 + this.field3280;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class143.method894(arg2, (int) ((long) arg0 + var6 - this.field3272), this.field3261, (int) (var6 - this.field3280), var10);
                    }
                    this.field3272 += arg1;
                } else if (arg1 > 0) {
                    if (this.field3276 == -1L) {
                        this.field3276 = this.field3272;
                    }
                    class143.method894(arg2, arg0, this.field3266, (int) (this.field3272 - this.field3276), arg1);
                    this.field3272 += arg1;
                    if ((long) this.field3265 < this.field3272 - this.field3276) {
                        this.field3265 = (int) (this.field3272 - this.field3276);
                    }
                }
            }
        } catch (IOException var12) {
            this.field3279 = -1L;
            throw var12;
        }
    }
}
