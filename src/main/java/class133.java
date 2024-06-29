import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class133 {

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    private int field3265 = 0;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "J")
    private long field3263 = -1L;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "J")
    private long field3266 = -1L;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Lq;")
    private class96 field3273;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "J")
    private long field3274;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "J")
    private long field3272;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[B")
    private byte[] field3262;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[B")
    private byte[] field3253;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "J")
    private long field3248;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    public static int[] field3258 = new int[1000];

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "La;")
    public static class1 field3261 = class113.method934(-11538, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Z")
    public static boolean field3271 = false;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "La;")
    public static class1 field3250 = class113.method934(-11538, "p12_full");

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
    public static volatile boolean field3245 = false;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field3277 = 10;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "La;")
    private static class1 field3275 = class113.method934(-11538, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field3256 = -1;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "La;")
    public static class1 field3255 = field3275;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "La;")
    public static class1 field3279 = class113.method934(-11538, "gleiten:");

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "La;")
    private static class1 field3260 = class113.method934(-11538, "Create a free account");

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "La;")
    public static class1 field3280 = class113.method934(-11538, "(U3");

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "La;")
    public static class1 field3268 = field3260;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lcb;")
    public static class15 field3252 = new class15(20);

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Lcb;")
    public static class15 field3281 = new class15(50);

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "[J")
    public static long[] field3284 = new long[32];

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "La;")
    public static class1 field3283 = class113.method934(-11538, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "La;")
    public static class1 field3282 = class113.method934(-11538, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "J")
    private long field3270;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lbd;")
    public static class11 field3247;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[I")
    public static int[] field3249;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJ)V", line = 9)
    public final void method1044(int arg0, long arg1) {
        field3257++;
        if (arg0 == 0 && arg1 >= 0L) {
            this.field3248 = arg1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)J", line = 27)
    public final long method1045(int arg0) {
        if (arg0 == 0) {
            field3251++;
            return this.field3272;
        } else {
            return -105L;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[B)V", line = 55)
    public final void method1046(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3276++;
        try {
            if (arg1 != -16777216) {
                method1047(false, 109, -94, null);
            }
            if ((long) arg2 + this.field3248 > this.field3272) {
                this.field3272 = (long) arg2 + this.field3248;
            }
            if (this.field3263 != -1L && (this.field3248 < this.field3263 || this.field3248 > (long) this.field3265 + this.field3263)) {
                this.method1052(-1);
            }
            if (this.field3263 != -1L && (long) arg2 + this.field3248 > (long) this.field3262.length + this.field3263) {
                int var5 = (int) (this.field3263 + (long) this.field3262.length - this.field3248);
                arg2 -= var5;
                class33.method393(arg3, arg0, this.field3262, (int) (this.field3248 - this.field3263), var5);
                this.field3248 += var5;
                this.field3265 = this.field3262.length;
                arg0 += var5;
                this.method1052(-1);
            }
            if (this.field3262.length < arg2) {
                if (this.field3270 != this.field3248) {
                    this.field3273.method833(true, this.field3248);
                    this.field3270 = this.field3248;
                }
                this.field3273.method835(arg3, arg0, arg2, false);
                this.field3270 += arg2;
                if (this.field3270 > this.field3274) {
                    this.field3274 = this.field3270;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3248 >= this.field3266 && this.field3248 < (long) this.field3259 + this.field3266) {
                    var8 = this.field3248;
                } else if (this.field3266 >= this.field3248 && this.field3266 < this.field3248 + (long) arg2) {
                    var8 = this.field3266;
                }
                if (this.field3266 < this.field3248 + (long) arg2 && (long) arg2 + this.field3248 <= this.field3266 - -((long) this.field3259)) {
                    var6 = (long) arg2 + this.field3248;
                } else if ((long) this.field3259 + this.field3266 > this.field3248 && (long) this.field3259 + this.field3266 <= (long) arg2 + this.field3248) {
                    var6 = (long) this.field3259 + this.field3266;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class33.method393(arg3, (int) (var8 + (long) arg0 - this.field3248), this.field3253, (int) (var8 - this.field3266), var10);
                }
                this.field3248 += arg2;
            } else if (arg2 > 0) {
                if (this.field3263 == -1L) {
                    this.field3263 = this.field3248;
                }
                class33.method393(arg3, arg0, this.field3262, (int) (this.field3248 - this.field3263), arg2);
                this.field3248 += arg2;
                if ((long) this.field3265 < this.field3248 - this.field3263) {
                    this.field3265 = (int) (this.field3248 - this.field3263);
                }
            }
        } catch (IOException var12) {
            this.field3270 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII[B)I", line = 177)
    public static final int method1047(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field3254++;
        int var4 = -1;
        if (arg0) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                var4 = class107.field2701[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        } else {
            return 39;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI[B)V", line = 208)
    public final void method1048(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field3269++;
        try {
            if (arg0 + arg2 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field3263 != -1L && this.field3248 >= this.field3263 && (long) arg2 + this.field3248 <= (long) this.field3265 + this.field3263) {
                class33.method393(this.field3262, (int) (this.field3248 - this.field3263), arg3, arg0, arg2);
                this.field3248 += arg2;
                return;
            }
            int var5 = arg2;
            long var6 = this.field3248;
            int var8 = arg0;
            if (this.field3266 <= this.field3248 && (long) this.field3259 + this.field3266 > this.field3248) {
                int var9 = (int) (this.field3266 + (long) this.field3259 - this.field3248);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class33.method393(this.field3253, (int) (this.field3248 - this.field3266), arg3, arg0, var9);
                arg0 += var9;
                this.field3248 += var9;
                arg2 -= var9;
            }
            if (arg2 > this.field3253.length) {
                this.field3273.method833(true, this.field3248);
                this.field3270 = this.field3248;
                while (arg2 > 0) {
                    int var11 = this.field3273.method837(arg0, arg2, arg3, -120);
                    if (var11 == -1) {
                        break;
                    }
                    this.field3248 += var11;
                    this.field3270 += var11;
                    arg0 += var11;
                    arg2 -= var11;
                }
            } else if (arg2 > 0) {
                int var10 = arg2;
                this.method1051((byte) 50);
                if (arg2 > this.field3259) {
                    var10 = this.field3259;
                }
                class33.method393(this.field3253, 0, arg3, arg0, var10);
                this.field3248 += var10;
                arg0 += var10;
                arg2 -= var10;
            }
            if (this.field3263 != -1L) {
                if (this.field3248 < this.field3263 && arg2 > 0) {
                    int var12 = (int) (this.field3263 - this.field3248) + arg0;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg2--;
                        arg3[arg0++] = 0;
                        this.field3248++;
                    }
                }
                long var13 = -1L;
                if (this.field3263 + (long) this.field3265 > var6 && (long) var5 + var6 >= (long) this.field3265 + this.field3263) {
                    var13 = (long) this.field3265 + this.field3263;
                } else if (var6 + (long) var5 > this.field3263 && (long) this.field3265 + this.field3263 >= var6 - -((long) var5)) {
                    var13 = (long) var5 + var6;
                }
                long var15 = -1L;
                if (var6 <= this.field3263 && (long) var5 + var6 > this.field3263) {
                    var15 = this.field3263;
                } else if (this.field3263 <= var6 && this.field3263 + (long) this.field3265 > var6) {
                    var15 = var6;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class33.method393(this.field3262, (int) (var15 - this.field3263), arg3, (int) (var15 - var6) + var8, var17);
                    if (this.field3248 < var13) {
                        arg2 = (int) ((long) arg2 + this.field3248 - var13);
                        this.field3248 = var13;
                    }
                }
            }
            if (arg1 >= -8) {
                this.method1045(34);
            }
        } catch (IOException var19) {
            this.field3270 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 402)
    public final void method1049(int arg0) throws IOException {
        field3244++;
        if (arg0 == 841617512) {
            this.method1052(arg0 ^ 0xCDD5EF97);
            this.field3273.method834(arg0 - 841617511);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 416)
    public static void method1050(boolean arg0) {
        field3249 = null;
        field3268 = null;
        field3284 = null;
        field3282 = null;
        field3250 = null;
        field3283 = null;
        if (arg0) {
            field3260 = null;
        }
        field3252 = null;
        field3261 = null;
        field3275 = null;
        field3280 = null;
        field3281 = null;
        field3258 = null;
        field3260 = null;
        field3255 = null;
        field3279 = null;
        field3247 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 452)
    private final void method1051(byte arg0) throws IOException {
        field3278++;
        if (arg0 != 50) {
            return;
        }
        this.field3259 = 0;
        if (this.field3270 != this.field3248) {
            this.field3273.method833(true, this.field3248);
            this.field3270 = this.field3248;
        }
        this.field3266 = this.field3248;
        while (this.field3253.length > this.field3259) {
            int var2 = this.field3273.method837(this.field3259, this.field3253.length - this.field3259, this.field3253, -110);
            if (var2 == -1) {
                break;
            }
            this.field3270 += var2;
            this.field3259 += var2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lq;II)V", line = 613)
    public class133(class96 arg0, int arg1, int arg2) throws IOException {
        this.field3273 = arg0;
        this.field3272 = this.field3274 = arg0.method836(87);
        this.field3262 = new byte[arg2];
        this.field3253 = new byte[arg1];
        this.field3248 = 0L;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 521)
    private final void method1052(int arg0) throws IOException {
        field3267++;
        if (arg0 != -1 || this.field3263 == -1L) {
            return;
        }
        if (this.field3270 != this.field3263) {
            this.field3273.method833(true, this.field3263);
            this.field3270 = this.field3263;
        }
        this.field3273.method835(this.field3262, 0, this.field3265, false);
        this.field3270 += this.field3265;
        if (this.field3274 < this.field3270) {
            this.field3274 = this.field3270;
        }
        long var2 = -1L;
        if (this.field3266 <= this.field3263 && this.field3263 < this.field3266 + (long) this.field3259) {
            var2 = this.field3263;
        } else if (this.field3263 <= this.field3266 && (long) this.field3265 + this.field3263 > this.field3266) {
            var2 = this.field3266;
        }
        long var4 = -1L;
        if ((long) this.field3265 + this.field3263 > this.field3266 && (long) this.field3259 + this.field3266 >= this.field3263 - -((long) this.field3265)) {
            var4 = (long) this.field3265 + this.field3263;
        } else if ((long) this.field3259 + this.field3266 > this.field3263 && (long) this.field3265 + this.field3263 >= this.field3266 - -((long) this.field3259)) {
            var4 = (long) this.field3259 + this.field3266;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class33.method393(this.field3262, (int) (var2 - this.field3263), this.field3253, (int) (var2 - this.field3266), var6);
        }
        this.field3265 = 0;
        this.field3263 = -1L;
    }
}
