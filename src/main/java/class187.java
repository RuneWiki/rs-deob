import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class187 {

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "J")
    private long field3276 = -1L;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    private int field3288 = 0;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "J")
    private long field3285 = -1L;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Ldh;")
    private class119 field3277;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "J")
    private long field3278;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "J")
    private long field3290;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "[B")
    private byte[] field3284;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "[B")
    private byte[] field3289;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "J")
    private long field3283;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "[I")
    public static int[] field3280 = new int[128];

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field3281 = -1;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field3268 = 0;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lp;")
    private static class280 field3272 = class18.method140((byte) -118, " more options");

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lp;")
    public static class280 field3282 = field3272;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "[I")
    public static int[] field3294 = new int[256];

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "J")
    private long field3292;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public final void method1300(int arg0) throws IOException {
        field3291++;
        this.method1308((byte) 101);
        if (arg0 != 8) {
            field3268 = -20;
        }
        this.field3277.method849(-119);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method1301(boolean arg0) {
        field3271++;
        if (class264.field4663 == 5) {
            class264.field4663 = 6;
            if (!arg0) {
                method1301(true);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method1302(byte arg0) {
        if (arg0 >= -69) {
            field3281 = -26;
        }
        field3279++;
        return this.field3277.method852(0);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIII)V")
    public final void method1303(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3295++;
        try {
            if (arg0.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3285 != -1L && this.field3283 >= this.field3285 && this.field3285 + ((long) this.field3288) >= (long) arg1 + this.field3283) {
                class143.method989(this.field3289, (int) (this.field3283 - this.field3285), arg0, arg2, arg1);
                this.field3283 += (long) arg1;
                return;
            }
            long var5 = this.field3283;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field3283 >= this.field3276 && ((long) this.field3274 + this.field3276) > this.field3283) {
                int var9 = (int) ((long) this.field3274 - (this.field3283 - this.field3276));
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class143.method989(this.field3284, (int) (this.field3283 - this.field3276), arg0, arg2, var9);
                this.field3283 += (long) var9;
                arg2 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field3284.length) {
                this.field3277.method851(this.field3283, 94);
                this.field3292 = this.field3283;
                while (arg1 > 0) {
                    int var10 = this.field3277.method847(arg2, arg1, 0, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    this.field3283 += (long) var10;
                    this.field3292 += (long) var10;
                    arg1 -= var10;
                }
            } else if (arg1 > 0) {
                int var11 = arg1;
                this.method1311(200000000);
                if (this.field3274 < arg1) {
                    var11 = this.field3274;
                }
                arg1 -= var11;
                class143.method989(this.field3284, 0, arg0, arg2, var11);
                this.field3283 += (long) var11;
                arg2 += var11;
            }
            if (this.field3285 != -1L) {
                if (this.field3283 < this.field3285 && arg1 > 0) {
                    int var12 = (int) (this.field3285 - this.field3283) + arg2;
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg0[arg2++] = 0;
                        this.field3283++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field3285 >= var5 && this.field3285 < (var5 + ((long) var7))) {
                    var15 = this.field3285;
                } else if (var5 >= this.field3285 && ((long) this.field3288 + this.field3285) > var5) {
                    var15 = var5;
                }
                if (var5 < (long) this.field3288 + this.field3285 && ((long) this.field3288 + this.field3285) <= ((long) var7 + var5)) {
                    var13 = this.field3285 + ((long) this.field3288);
                } else if (((long) var7 + var5) > this.field3285 && ((long) this.field3288 + this.field3285) >= ((long) var7 + var5)) {
                    var13 = (long) var7 + var5;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class143.method989(this.field3289, (int) (var15 - this.field3285), arg0, (int) (var15 - var5) + var8, var17);
                    if (this.field3283 < var13) {
                        arg1 = (int) ((long) arg1 - (var13 - this.field3283));
                        this.field3283 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3292 = -1L;
            throw var19;
        }
        if (arg3 > ~arg1) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)J")
    public final long method1304(boolean arg0) {
        field3275++;
        return arg0 ? 10L : this.field3290;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BB)V")
    public final void method1305(byte[] arg0, byte arg1) throws IOException {
        field3286++;
        if (arg1 != -25) {
            this.field3285 = 47L;
        }
        this.method1303(arg0, arg0.length, 0, arg1 ^ 0x18);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIIB)V")
    public final void method1306(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field3293++;
        try {
            if (((long) arg2 + this.field3283) > this.field3290) {
                this.field3290 = this.field3283 + ((long) arg2);
            }
            if (this.field3285 != -1L && (this.field3285 > this.field3283 || (long) this.field3288 + this.field3285 < this.field3283)) {
                this.method1308((byte) 101);
            }
            if (arg3 != 81) {
                method1310(127);
            }
            if (this.field3285 != -1L && ((long) arg2 + this.field3283) > ((long) this.field3289.length + this.field3285)) {
                int var5 = (int) (this.field3285 + (long) this.field3289.length - this.field3283);
                class143.method989(arg0, arg1, this.field3289, (int) (this.field3283 - this.field3285), var5);
                arg2 -= var5;
                arg1 += var5;
                this.field3283 += (long) var5;
                this.field3288 = this.field3289.length;
                this.method1308((byte) 125);
            }
            if (arg2 > this.field3289.length) {
                long var6 = -1L;
                if (this.field3292 != this.field3283) {
                    this.field3277.method851(this.field3283, 47);
                    this.field3292 = this.field3283;
                }
                this.field3277.method848(arg2, arg1, true, arg0);
                if (this.field3283 >= this.field3276 && this.field3283 < (long) this.field3274 + this.field3276) {
                    var6 = this.field3283;
                } else if (this.field3283 <= this.field3276 && this.field3276 < ((long) arg2 + this.field3283)) {
                    var6 = this.field3276;
                }
                long var8 = -1L;
                this.field3292 += (long) arg2;
                if (this.field3292 > this.field3278) {
                    this.field3278 = this.field3292;
                }
                if ((long) arg2 + this.field3283 > this.field3276 && (this.field3283 + ((long) arg2)) <= ((long) this.field3274 + this.field3276)) {
                    var8 = (long) arg2 + this.field3283;
                } else if (this.field3283 < ((long) this.field3274 + this.field3276) && ((long) arg2 + this.field3283) >= ((long) this.field3274 + this.field3276)) {
                    var8 = this.field3276 + ((long) this.field3274);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class143.method989(arg0, (int) ((long) arg1 + var6 - this.field3283), this.field3284, (int) (var6 - this.field3276), var10);
                }
                this.field3283 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3285 == -1L) {
                    this.field3285 = this.field3283;
                }
                class143.method989(arg0, arg1, this.field3289, (int) (this.field3283 - this.field3285), arg2);
                this.field3283 += (long) arg2;
                if ((this.field3283 - this.field3285) > ((long) this.field3288)) {
                    this.field3288 = (int) (this.field3283 - this.field3285);
                }
            }
        } catch (IOException var12) {
            this.field3292 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IJ)V")
    public final void method1307(int arg0, long arg1) throws IOException {
        field3270++;
        if (arg0 <= 36) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1302((byte) -104));
        }
        this.field3283 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    private final void method1308(byte arg0) throws IOException {
        if (arg0 <= 72) {
            this.field3290 = 57L;
        }
        field3296++;
        if (this.field3285 == -1L) {
            return;
        }
        if (this.field3292 != this.field3285) {
            this.field3277.method851(this.field3285, 80);
            this.field3292 = this.field3285;
        }
        long var2 = -1L;
        this.field3277.method848(this.field3288, 0, true, this.field3289);
        if (this.field3285 >= this.field3276 && this.field3285 < (this.field3276 + ((long) this.field3274))) {
            var2 = this.field3285;
        } else if (this.field3276 >= this.field3285 && this.field3285 + ((long) this.field3288) > this.field3276) {
            var2 = this.field3276;
        }
        long var4 = -1L;
        if (this.field3276 < ((long) this.field3288 + this.field3285) && (long) this.field3288 + this.field3285 <= (long) this.field3274 + this.field3276) {
            var4 = (long) this.field3288 + this.field3285;
        } else if ((this.field3276 + ((long) this.field3274)) > this.field3285 && ((long) this.field3274 + this.field3276) <= ((long) this.field3288 + this.field3285)) {
            var4 = (long) this.field3274 + this.field3276;
        }
        this.field3292 += (long) this.field3288;
        if (this.field3278 < this.field3292) {
            this.field3278 = this.field3292;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class143.method989(this.field3289, (int) (var2 - this.field3285), this.field3284, (int) (var2 - this.field3276), var6);
        }
        this.field3288 = 0;
        this.field3285 = -1L;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Z)I")
    public static final int method1309(boolean arg0) {
        if (arg0) {
            return -41;
        } else {
            field3287++;
            return class56.field908;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static void method1310(int arg0) {
        field3282 = null;
        field3280 = null;
        field3272 = null;
        field3294 = null;
        if (arg0 != 21746) {
            method1309(true);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    private final void method1311(int arg0) throws IOException {
        this.field3274 = 0;
        field3273++;
        if (this.field3292 != this.field3283) {
            this.field3277.method851(this.field3283, arg0 - 199999943);
            this.field3292 = this.field3283;
        }
        if (arg0 != 200000000) {
            field3282 = null;
        }
        this.field3276 = this.field3283;
        while (this.field3284.length > this.field3274) {
            int var2 = this.field3284.length - this.field3274;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3277.method847(this.field3274, var2, arg0 - 200000000, this.field3284);
            if (var3 == -1) {
                break;
            }
            this.field3274 += var3;
            this.field3292 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ldh;II)V")
    public class187(class119 arg0, int arg1, int arg2) throws IOException {
        this.field3277 = arg0;
        this.field3290 = this.field3278 = arg0.method850(-19387);
        this.field3284 = new byte[arg1];
        this.field3289 = new byte[arg2];
        this.field3283 = 0L;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3294[var0] = var1;
        }
    }
}
