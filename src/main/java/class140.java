import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 {

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    private int field3283 = 0;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "J")
    private long field3280 = -1L;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "J")
    private long field3285 = -1L;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lpe;")
    private class109 field3271;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "J")
    private long field3286;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "J")
    private long field3274;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "J")
    private long field3262;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[B")
    private byte[] field3279;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[B")
    private byte[] field3267;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lsc;")
    public static class128 field3268 = class129.method1017(false, "m");

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[Lua;")
    public static class140[] field3270 = new class140[16];

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lsc;")
    private static class128 field3273 = class129.method1017(false, "Attack");

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lsc;")
    public static class128 field3276 = class129.method1017(false, " <col=ffffff>");

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "[Ltd;")
    public static class136[] field3284 = new class136[4];

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lsc;")
    public static class128 field3277 = field3273;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lsc;")
    private static class128 field3272 = class129.method1017(false, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Lsc;")
    public static class128 field3282 = field3272;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    private int field3290;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "J")
    private long field3269;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lsf;")
    public static class131 field3260;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1145(int arg0) {
        field3273 = null;
        field3277 = null;
        field3272 = null;
        field3260 = null;
        if (arg0 != 21700) {
            method1145(122);
        }
        field3276 = null;
        field3270 = null;
        field3282 = null;
        field3284 = null;
        field3268 = null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public final void method1146(int arg0) throws IOException {
        this.method1148((byte) -127);
        if (arg0 != -1) {
            this.method1152(81);
        }
        field3288++;
        this.field3271.method844(0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III[B)V")
    public final void method1147(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != -15468) {
            method1145(74);
        }
        field3275++;
        try {
            if (this.field3274 < this.field3262 + (long) arg2) {
                this.field3274 = this.field3262 + (long) arg2;
            }
            if (this.field3280 != -1L && (this.field3262 < this.field3280 || this.field3262 > this.field3280 + (long) this.field3283)) {
                this.method1148((byte) -126);
            }
            if (this.field3280 != -1L && (long) this.field3267.length + this.field3280 < (long) arg2 + this.field3262) {
                int var5 = (int) ((long) this.field3267.length + this.field3280 - this.field3262);
                arg2 -= var5;
                class101.method768(arg3, arg1, this.field3267, (int) (this.field3262 - this.field3280), var5);
                this.field3262 += var5;
                arg1 += var5;
                this.field3283 = this.field3267.length;
                this.method1148((byte) -126);
            }
            if (arg2 > this.field3267.length) {
                if (this.field3269 != this.field3262) {
                    this.field3271.method846(this.field3262, 12791);
                    this.field3269 = this.field3262;
                }
                this.field3271.method847(arg3, arg2, false, arg1);
                this.field3269 += arg2;
                if (this.field3269 > this.field3286) {
                    this.field3286 = this.field3269;
                }
                long var6 = -1L;
                if (this.field3285 <= this.field3262 && this.field3262 < (long) this.field3290 + this.field3285) {
                    var6 = this.field3262;
                } else if (this.field3262 <= this.field3285 && (long) arg2 + this.field3262 > this.field3285) {
                    var6 = this.field3285;
                }
                long var8 = -1L;
                if ((long) arg2 + this.field3262 > this.field3285 && (long) this.field3290 + this.field3285 >= this.field3262 - -((long) arg2)) {
                    var8 = (long) arg2 + this.field3262;
                } else if ((long) this.field3290 + this.field3285 > this.field3262 && this.field3262 + (long) arg2 >= this.field3285 - -((long) this.field3290)) {
                    var8 = (long) this.field3290 + this.field3285;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class101.method768(arg3, (int) ((long) arg1 + var6 - this.field3262), this.field3279, (int) (var6 - this.field3285), var10);
                }
                this.field3262 += arg2;
            } else if (arg2 > 0) {
                if (this.field3280 == -1L) {
                    this.field3280 = this.field3262;
                }
                class101.method768(arg3, arg1, this.field3267, (int) (this.field3262 - this.field3280), arg2);
                this.field3262 += arg2;
                if ((long) this.field3283 < this.field3262 - this.field3280) {
                    this.field3283 = (int) (this.field3262 - this.field3280);
                }
            }
        } catch (IOException var12) {
            this.field3269 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    private final void method1148(byte arg0) throws IOException {
        if (this.field3280 != -1L) {
            if (this.field3280 != this.field3269) {
                this.field3271.method846(this.field3280, 12791);
                this.field3269 = this.field3280;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field3271.method847(this.field3267, this.field3283, false, 0);
            this.field3269 += this.field3283;
            if (this.field3286 < this.field3269) {
                this.field3286 = this.field3269;
            }
            if (this.field3285 < this.field3280 + (long) this.field3283 && (long) this.field3283 + this.field3280 <= (long) this.field3290 + this.field3285) {
                var4 = this.field3280 + (long) this.field3283;
            } else if (this.field3280 < (long) this.field3290 + this.field3285 && (long) this.field3290 + this.field3285 <= (long) this.field3283 + this.field3280) {
                var4 = this.field3285 + (long) this.field3290;
            }
            if (this.field3285 <= this.field3280 && this.field3280 < (long) this.field3290 + this.field3285) {
                var2 = this.field3280;
            } else if (this.field3285 >= this.field3280 && (long) this.field3283 + this.field3280 > this.field3285) {
                var2 = this.field3285;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class101.method768(this.field3267, (int) (var2 - this.field3280), this.field3279, (int) (var2 - this.field3285), var6);
            }
            this.field3283 = 0;
            this.field3280 = -1L;
        }
        field3263++;
        if (arg0 > -124) {
            field3260 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BZ)V")
    public final void method1149(byte[] arg0, boolean arg1) throws IOException {
        field3261++;
        if (!arg1) {
            field3272 = null;
        }
        this.method1153(arg0, arg0.length, 0, 22974);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method1150(int arg0) {
        if (arg0 == 4) {
            field3289++;
            return this.field3271.method845((byte) -106);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    private final void method1151(int arg0) throws IOException {
        this.field3290 = 0;
        field3278++;
        if (arg0 <= 15) {
            field3270 = null;
        }
        if (this.field3269 != this.field3262) {
            this.field3271.method846(this.field3262, 12791);
            this.field3269 = this.field3262;
        }
        this.field3285 = this.field3262;
        while (this.field3279.length > this.field3290) {
            int var2 = this.field3271.method848((byte) -26, this.field3279, this.field3279.length - this.field3290, this.field3290);
            if (var2 == -1) {
                break;
            }
            this.field3290 += var2;
            this.field3269 += var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)J")
    public final long method1152(int arg0) {
        field3281++;
        if (arg0 <= 76) {
            field3276 = null;
        }
        return this.field3274;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BIII)V")
    public final void method1153(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3287++;
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3280 != -1L && this.field3262 >= this.field3280 && (long) arg1 + this.field3262 <= (long) this.field3283 + this.field3280) {
                class101.method768(this.field3267, (int) (this.field3262 - this.field3280), arg0, arg2, arg1);
                this.field3262 += arg1;
                return;
            }
            long var5 = this.field3262;
            if (arg3 != 22974) {
                field3264 = -7;
            }
            int var7 = arg2;
            int var8 = arg1;
            if (this.field3285 <= this.field3262 && (long) this.field3290 + this.field3285 > this.field3262) {
                int var9 = (int) (this.field3285 + (long) this.field3290 - this.field3262);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class101.method768(this.field3279, (int) (this.field3262 - this.field3285), arg0, arg2, var9);
                arg2 += var9;
                this.field3262 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field3279.length) {
                this.field3271.method846(this.field3262, arg3 ^ 0x6849);
                this.field3269 = this.field3262;
                while (arg1 > 0) {
                    int var11 = this.field3271.method848((byte) -26, arg0, arg1, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 -= var11;
                    arg2 += var11;
                    this.field3269 += var11;
                    this.field3262 += var11;
                }
            } else if (arg1 > 0) {
                this.method1151(84);
                int var10 = arg1;
                if (arg1 > this.field3290) {
                    var10 = this.field3290;
                }
                class101.method768(this.field3279, 0, arg0, arg2, var10);
                arg1 -= var10;
                this.field3262 += var10;
                arg2 += var10;
            }
            if (this.field3280 != -1L) {
                if (this.field3280 > this.field3262 && arg1 > 0) {
                    int var12 = arg2 + (int) (this.field3280 - this.field3262);
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (arg2 < var12) {
                        arg0[arg2++] = 0;
                        arg1--;
                        this.field3262++;
                    }
                }
                long var13 = -1L;
                if (this.field3280 >= var5 && (long) var8 + var5 > this.field3280) {
                    var13 = this.field3280;
                } else if (this.field3280 <= var5 && this.field3280 + (long) this.field3283 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field3283 + this.field3280 > var5 && (long) var8 + var5 >= (long) this.field3283 + this.field3280) {
                    var15 = (long) this.field3283 + this.field3280;
                } else if (var5 + (long) var8 > this.field3280 && (long) this.field3283 + this.field3280 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class101.method768(this.field3267, (int) (var13 - this.field3280), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field3262 < var15) {
                        arg1 = (int) ((long) arg1 + this.field3262 - var15);
                        this.field3262 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3269 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JZ)V")
    public final void method1154(long arg0, boolean arg1) throws IOException {
        field3266++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1150(4));
        }
        this.field3262 = arg0;
        if (arg1) {
            this.field3274 = -29L;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lpe;II)V")
    public class140(class109 arg0, int arg1, int arg2) throws IOException {
        this.field3271 = arg0;
        this.field3274 = this.field3286 = arg0.method843((byte) -112);
        this.field3262 = 0L;
        this.field3279 = new byte[arg1];
        this.field3267 = new byte[arg2];
    }
}
