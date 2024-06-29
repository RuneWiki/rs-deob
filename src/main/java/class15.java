import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class15 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    private int field269 = 0;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "J")
    private long field281 = -1L;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "J")
    private long field272 = -1L;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Lkd;")
    private class113 field294;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "J")
    private long field285;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "J")
    private long field278;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[B")
    private byte[] field279;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "[B")
    private byte[] field293;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "J")
    private long field284;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Ldj;")
    private static class44 field271 = class89.method650(255, "Players");

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Ldj;")
    public static class44 field276 = field271;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Ldj;")
    public static class44 field268 = class89.method650(255, "(Udns");

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Ldj;")
    private static class44 field280 = class89.method650(255, "scroll:");

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Ldj;")
    public static class44 field270 = field280;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Ldj;")
    public static class44 field291 = field280;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "J")
    private long field295;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    public static final void method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field290++;
        if (class70.field1337 <= arg3 && class70.field1321 >= arg3) {
            int var5 = class201.method1296(class14.field267, -125, arg0, class57.field1068);
            int var6 = class201.method1296(class14.field267, -125, arg2, class57.field1068);
            class5.method34(arg3, arg1, 9154, var5, var6);
        }
        if (arg4 > -106) {
            method126(76, 46, 55, -63, -94);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([Lvc;II)V")
    public static final void method127(class223[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class223 var4 = arg0[var3];
            if (var4 != null && var4.field4170 == arg2 && (!var4.field4118 || !class54.method391(var4, (byte) -63))) {
                if (var4.field4076 == 0) {
                    if (!var4.field4118 && class54.method391(var4, (byte) -63) && class226.field4253 != var4) {
                        continue;
                    }
                    method127(arg0, 118, var4.field4040);
                    if (var4.field4169 != null) {
                        method127(var4.field4169, 116, var4.field4040);
                    }
                    class104 var5 = (class104) class129.field2294.method828((long) var4.field4040, (byte) -40);
                    if (var5 != null) {
                        class1.method4(-124, var5.field1893);
                    }
                }
                if (var4.field4076 == 6) {
                    if (var4.field4105 != -1 || var4.field4146 != -1) {
                        boolean var6 = class20.method155(0, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4146;
                        } else {
                            var7 = var4.field4105;
                        }
                        if (var7 != -1) {
                            class204 var8 = class94.method672(var7, 80);
                            if (var8 != null) {
                                var4.field4096 += class102.field1855;
                                while (var4.field4096 > var8.field3648[var4.field4044]) {
                                    var4.field4096 -= var8.field3648[var4.field4044];
                                    var4.field4044++;
                                    if (var4.field4044 >= var8.field3658.length) {
                                        var4.field4044 -= var8.field3659;
                                        if (var4.field4044 < 0 || var8.field3658.length <= var4.field4044) {
                                            var4.field4044 = 0;
                                        }
                                    }
                                    class225.method1457(75, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4115 != 0 && !var4.field4118) {
                        int var9 = var4.field4115 >> 16;
                        int var10 = class102.field1855 * var9;
                        int var11 = var4.field4115 << 16 >> 16;
                        var4.field4036 = var4.field4036 + var10 & 0x7FF;
                        int var12 = class102.field1855 * var11;
                        var4.field4081 = var4.field4081 + var12 & 0x7FF;
                        class225.method1457(-113, var4);
                    }
                }
            }
        }
        if (arg1 < 112) {
            method126(120, -41, -44, -104, 124);
        }
        field282++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    private final void method128(int arg0) throws IOException {
        if (arg0 >= -19) {
            method126(55, 19, -33, -34, 77);
        }
        field274++;
        this.field287 = 0;
        if (this.field295 != this.field284) {
            this.field294.method798(this.field284, (byte) -102);
            this.field295 = this.field284;
        }
        this.field272 = this.field284;
        while (this.field287 < this.field293.length) {
            int var2 = this.field293.length - this.field287;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field294.method793(var2, this.field293, 1, this.field287);
            if (var3 == -1) {
                break;
            }
            this.field295 += var3;
            this.field287 += var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lwh;")
    public static final class238 method129(int arg0, int arg1) {
        field283++;
        if (arg0 < 0) {
            return null;
        }
        class238 var2 = (class238) class52.field930.method1178((long) arg1, 14176);
        if (var2 != null) {
            return var2;
        }
        class238 var3 = class169.method1076(false, (byte) -127, class218.field3956, arg1, class130.field2328);
        if (var3 != null) {
            class52.field930.method1183((byte) 99, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JB)V")
    public final void method130(long arg0, byte arg1) throws IOException {
        field288++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method135(2));
        } else if (arg1 == 89) {
            this.field284 = arg0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    private final void method131(byte arg0) throws IOException {
        if (this.field281 != -1L) {
            long var2 = -1L;
            long var4 = -1L;
            if (this.field295 != this.field281) {
                this.field294.method798(this.field281, (byte) -102);
                this.field295 = this.field281;
            }
            this.field294.method794((byte) 25, this.field279, 0, this.field269);
            if (this.field272 < (long) this.field269 + this.field281 && this.field281 + (long) this.field269 <= (long) this.field287 + this.field272) {
                var2 = (long) this.field269 + this.field281;
            } else if (this.field281 < (long) this.field287 + this.field272 && this.field272 + (long) this.field287 <= this.field281 - -((long) this.field269)) {
                var2 = this.field272 + (long) this.field287;
            }
            this.field295 += this.field269;
            if (this.field281 >= this.field272 && this.field281 < (long) this.field287 + this.field272) {
                var4 = this.field281;
            } else if (this.field272 >= this.field281 && (long) this.field269 + this.field281 > this.field272) {
                var4 = this.field272;
            }
            if (this.field295 > this.field285) {
                this.field285 = this.field295;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class18.method146(this.field279, (int) (var4 - this.field281), this.field293, (int) (var4 - this.field272), var6);
            }
            this.field281 = -1L;
            this.field269 = 0;
        }
        field292++;
        if (arg0 > -19) {
            method129(42, 112);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method132(boolean arg0) {
        field270 = null;
        if (arg0) {
            method127(null, -27, 45);
        }
        field268 = null;
        field280 = null;
        field271 = null;
        field276 = null;
        field291 = null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
    public final void method133(boolean arg0) throws IOException {
        this.method131((byte) -79);
        this.field294.method797(-116);
        field273++;
        if (arg0) {
            method129(-100, -62);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[B)V")
    public final void method134(int arg0, byte[] arg1) throws IOException {
        this.method138(0, arg1.length, arg1, 0);
        if (arg0 <= 115) {
            method126(107, -39, -80, -77, 4);
        }
        field289++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method135(int arg0) {
        field286++;
        return arg0 == 2 ? this.field294.method796(122) : null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[BB)V")
    public final void method136(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field296++;
        try {
            if (arg3 != 88) {
                this.method135(-100);
            }
            if (this.field278 < (long) arg0 + this.field284) {
                this.field278 = (long) arg0 + this.field284;
            }
            if (this.field281 != -1L && (this.field281 > this.field284 || this.field281 + (long) this.field269 < this.field284)) {
                this.method131((byte) -41);
            }
            if (this.field281 != -1L && (long) arg0 + this.field284 > (long) this.field279.length + this.field281) {
                int var5 = (int) (this.field281 + (long) this.field279.length - this.field284);
                class18.method146(arg2, arg1, this.field279, (int) (this.field284 - this.field281), var5);
                arg1 += var5;
                this.field284 += var5;
                this.field269 = this.field279.length;
                this.method131((byte) -82);
                arg0 -= var5;
            }
            if (this.field279.length < arg0) {
                if (this.field295 != this.field284) {
                    this.field294.method798(this.field284, (byte) -102);
                    this.field295 = this.field284;
                }
                this.field294.method794((byte) 25, arg2, arg1, arg0);
                this.field295 += arg0;
                long var6 = -1L;
                long var8 = -1L;
                if (this.field272 <= this.field284 && this.field272 + (long) this.field287 > this.field284) {
                    var6 = this.field284;
                } else if (this.field272 >= this.field284 && this.field272 < this.field284 + (long) arg0) {
                    var6 = this.field272;
                }
                if (this.field295 > this.field285) {
                    this.field285 = this.field295;
                }
                if ((long) arg0 + this.field284 > this.field272 && this.field284 + (long) arg0 <= (long) this.field287 + this.field272) {
                    var8 = (long) arg0 + this.field284;
                } else if (this.field284 < (long) this.field287 + this.field272 && (long) this.field287 + this.field272 <= this.field284 - -((long) arg0)) {
                    var8 = this.field272 + (long) this.field287;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class18.method146(arg2, (int) ((long) arg1 + var6 - this.field284), this.field293, (int) (var6 - this.field272), var10);
                }
                this.field284 += arg0;
            } else if (arg0 > 0) {
                if (this.field281 == -1L) {
                    this.field281 = this.field284;
                }
                class18.method146(arg2, arg1, this.field279, (int) (this.field284 - this.field281), arg0);
                this.field284 += arg0;
                if (this.field284 - this.field281 > (long) this.field269) {
                    this.field269 = (int) (this.field284 - this.field281);
                }
            }
        } catch (IOException var12) {
            this.field295 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)J")
    public final long method137(byte arg0) {
        field275++;
        return arg0 == -58 ? this.field278 : -41L;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lkd;II)V")
    public class15(class113 arg0, int arg1, int arg2) throws IOException {
        this.field294 = arg0;
        this.field278 = this.field285 = arg0.method795(11204);
        this.field279 = new byte[arg2];
        this.field293 = new byte[arg1];
        this.field284 = 0L;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[BI)V")
    public final void method138(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field277++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (arg3 != 0) {
                method129(-54, 112);
            }
            if (this.field281 != -1L && this.field284 >= this.field281 && this.field284 + (long) arg1 <= (long) this.field269 + this.field281) {
                class18.method146(this.field279, (int) (this.field284 - this.field281), arg2, arg0, arg1);
                this.field284 += arg1;
                return;
            }
            long var5 = this.field284;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field284 >= this.field272 && (long) this.field287 + this.field272 > this.field284) {
                int var9 = (int) ((long) this.field287 + this.field272 - this.field284);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class18.method146(this.field293, (int) (this.field284 - this.field272), arg2, arg0, var9);
                this.field284 += var9;
                arg0 += var9;
                arg1 -= var9;
            }
            if (this.field293.length < arg1) {
                this.field294.method798(this.field284, (byte) -102);
                this.field295 = this.field284;
                while (arg1 > 0) {
                    int var10 = this.field294.method793(arg1, arg2, arg3 + 1, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field295 += var10;
                    arg1 -= var10;
                    arg0 += var10;
                    this.field284 += var10;
                }
            } else if (arg1 > 0) {
                this.method128(arg3 - 109);
                int var11 = arg1;
                if (this.field287 < arg1) {
                    var11 = this.field287;
                }
                arg1 -= var11;
                class18.method146(this.field293, 0, arg2, arg0, var11);
                arg0 += var11;
                this.field284 += var11;
            }
            if (this.field281 != -1L) {
                if (this.field281 > this.field284 && arg1 > 0) {
                    int var12 = (int) (this.field281 - this.field284) + arg0;
                    if (arg0 + arg1 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (var12 > arg0) {
                        arg1--;
                        arg2[arg0++] = 0;
                        this.field284++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field281 && var5 + (long) var8 > this.field281) {
                    var13 = this.field281;
                } else if (var5 >= this.field281 && (long) this.field269 + this.field281 > var5) {
                    var13 = var5;
                }
                if (this.field281 + (long) this.field269 > var5 && (long) var8 + var5 >= this.field281 - -((long) this.field269)) {
                    var15 = (long) this.field269 + this.field281;
                } else if ((long) var8 + var5 > this.field281 && (long) var8 + var5 <= (long) this.field269 + this.field281) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class18.method146(this.field279, (int) (var13 - this.field281), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field284 < var15) {
                        arg1 = (int) ((long) arg1 + this.field284 - var15);
                        this.field284 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field295 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }
}
