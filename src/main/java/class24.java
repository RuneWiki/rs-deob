import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 {

    @OriginalMember(owner = "client!db", name = "w", descriptor = "J")
    private long field567 = -1L;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    private int field577 = 0;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "J")
    private long field573 = -1L;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Lce;")
    private class20 field571;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "J")
    private long field572;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "J")
    private long field575;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "[B")
    private byte[] field574;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[B")
    private byte[] field569;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "J")
    private long field546;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "[I")
    public static int[] field564 = new int[2048];

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Ltd;")
    public static class136 field556 = class145.method1172("Willkommen auf RuneScape", 45);

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Ltd;")
    private static class136 field562 = class145.method1172("cyan:", 45);

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Ltd;")
    public static class136 field547 = field562;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Ltd;")
    private static class136 field566 = class145.method1172("Please wait)3)3)3", 45);

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Ltd;")
    public static class136 field554 = field566;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Ltd;")
    public static class136 field557 = field562;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Ltd;")
    public static class136 field578 = class145.method1172("mapfunction", 45);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "J")
    private long field553;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lbe;")
    public static class13 field555;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[I")
    public static int[] field570;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[Lnb;")
    public static class92[] field551;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    private final void method212(boolean arg0) throws IOException {
        field559++;
        if (this.field573 != -1L) {
            if (this.field573 != this.field553) {
                this.field571.method150(11506, this.field573);
                this.field553 = this.field573;
            }
            this.field571.method153(!arg0, this.field577, 0, this.field574);
            this.field553 += this.field577;
            if (this.field572 < this.field553) {
                this.field572 = this.field553;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field573 >= this.field567 && this.field567 + (long) this.field550 > this.field573) {
                var2 = this.field573;
            } else if (this.field567 >= this.field573 && (long) this.field577 + this.field573 > this.field567) {
                var2 = this.field567;
            }
            if ((long) this.field577 + this.field573 > this.field567 && (long) this.field577 + this.field573 <= (long) this.field550 + this.field567) {
                var4 = this.field573 + (long) this.field577;
            } else if (this.field573 < (long) this.field550 + this.field567 && (long) this.field550 + this.field567 <= this.field573 - -((long) this.field577)) {
                var4 = (long) this.field550 + this.field567;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class138.method1132(this.field574, (int) (var2 - this.field573), this.field569, (int) (var2 - this.field567), var6);
            }
            this.field577 = 0;
            this.field573 = -1L;
        }
        if (arg0) {
            method215(-39, 91, 1, 47, 80, -15, 66, -36, -42, -53);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lbb;IZIII)V")
    public static final void method213(class10 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field561++;
        if (arg0 == null) {
            return;
        }
        int var6 = class151.field3467 + class141.field3269 & 0x7FF;
        if (arg2) {
            method215(-18, -6, 109, 15, -31, -95, -41, 83, -8, -119);
        }
        int var7 = arg3 * arg3 + arg4 * arg4;
        if (var7 > 6400) {
            return;
        }
        int var8 = class103.field2456[var6];
        int var9 = var8 * 256 / (class109.field2572 + 256);
        int var10 = class103.field2452[var6];
        int var11 = var10 * 256 / (class109.field2572 + 256);
        int var12 = arg3 * var11 - arg4 * var9 >> 16;
        int var13 = arg3 * var9 + arg4 * var11 >> 16;
        if (var7 <= 2500) {
            arg0.method46(arg1 + var13 + 94 + 4 - arg0.field170 / 2, arg5 + 83 + -(arg0.field173 / 2) + -var12 + -4);
        } else {
            arg0.method50(class35.field806, var13 + arg1 + 94 + 4 - arg0.field170 / 2, -var12 - arg0.field173 / 2 + -4 + arg5 + 83);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public static final void method214(boolean arg0) {
        field563++;
        int var1 = 0;
        if (!arg0) {
            field562 = null;
        }
        while (var1 < class139.field3224) {
            int var10002 = class19.field383[var1]--;
            if (class19.field383[var1] >= -10) {
                label79: {
                    class117 var3 = class153.field3498[var1];
                    if (var3 == null) {
                        var3 = class117.method925(class147.field3413, class11.field191[var1], 0);
                        if (var3 == null) {
                            break label79;
                        }
                        class19.field383[var1] += var3.method923();
                        class153.field3498[var1] = var3;
                    }
                    if (class19.field383[var1] < 0) {
                        label82: {
                            int var4;
                            if (class93.field2182[var1] == 0) {
                                var4 = class69.field1442;
                            } else {
                                int var5 = (class93.field2182[var1] & 0xFF) * 128;
                                int var6 = class93.field2182[var1] >> 16 & 0xFF;
                                int var7 = var6 * 128 + 64 - field555.field3580;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = class93.field2182[var1] >> 8 & 0xFF;
                                int var9 = var8 * 128 + 64 - field555.field3578;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var5 < var10) {
                                    class19.field383[var1] = -100;
                                    break label82;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class83.field1968 / var5;
                            }
                            if (var4 > 0) {
                                class48 var11 = var3.method926().method408(class88.field2080);
                                class46 var12 = class46.method374(var11, 100, var4);
                                var12.method385(class139.field3230[var1] - 1);
                                class55.field1228.method788(var12);
                            }
                            class19.field383[var1] = -100;
                        }
                    }
                }
            } else {
                class139.field3224--;
                for (int var2 = var1; var2 < class139.field3224; var2++) {
                    class11.field191[var2] = class11.field191[var2 + 1];
                    class153.field3498[var2] = class153.field3498[var2 + 1];
                    class139.field3230[var2] = class139.field3230[var2 + 1];
                    class19.field383[var2] = class19.field383[var2 + 1];
                    class93.field2182[var2] = class93.field2182[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class47.field1078 && !class11.method72(0)) {
            if (class147.field3400 != 0 && class110.field2582 != -1) {
                class120.method937(class110.field2582, false, class147.field3400, class39.field921, 0, 1);
            }
            class47.field1078 = false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field565++;
        class16 var10 = (class16) class41.field958.method512(arg8);
        class16 var11 = null;
        while (var10 != null) {
            if (var10.field325 == arg2 && var10.field328 == arg7 && var10.field315 == arg1 && var10.field324 == arg5) {
                var11 = var10;
                break;
            }
            var10 = (class16) class41.field958.method520((byte) 113);
        }
        if (var11 == null) {
            var11 = new class16();
            var11.field328 = arg7;
            var11.field315 = arg1;
            var11.field325 = arg2;
            var11.field324 = arg5;
            class136.method1096(30370, var11);
            class41.field958.method509(arg8 + 1, var11);
        }
        var11.field312 = arg4;
        var11.field323 = arg3;
        var11.field320 = arg9;
        var11.field317 = arg0;
        var11.field318 = arg6;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[BI)V")
    public final void method216(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field579++;
        try {
            if (this.field575 < (long) arg1 + this.field546) {
                this.field575 = (long) arg1 + this.field546;
            }
            if (this.field573 != -1L && (this.field546 < this.field573 || this.field546 > (long) this.field577 + this.field573)) {
                this.method212(false);
            }
            if (this.field573 != -1L && (long) arg1 + this.field546 > (long) this.field574.length + this.field573) {
                int var5 = (int) ((long) this.field574.length + this.field573 - this.field546);
                arg1 -= var5;
                class138.method1132(arg2, arg0, this.field574, (int) (this.field546 - this.field573), var5);
                this.field546 += var5;
                arg0 += var5;
                this.field577 = this.field574.length;
                this.method212(false);
            }
            if (arg3 != 0) {
                field578 = null;
            }
            if (this.field574.length < arg1) {
                if (this.field553 != this.field546) {
                    this.field571.method150(11506, this.field546);
                    this.field553 = this.field546;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field571.method153(true, arg1, arg0, arg2);
                if (this.field567 <= this.field546 && (long) this.field550 + this.field567 > this.field546) {
                    var6 = this.field546;
                } else if (this.field567 >= this.field546 && this.field567 < (long) arg1 + this.field546) {
                    var6 = this.field567;
                }
                if ((long) arg1 + this.field546 > this.field567 && (long) this.field550 + this.field567 >= (long) arg1 + this.field546) {
                    var8 = (long) arg1 + this.field546;
                } else if (this.field546 < (long) this.field550 + this.field567 && (long) this.field550 + this.field567 <= (long) arg1 + this.field546) {
                    var8 = (long) this.field550 + this.field567;
                }
                this.field553 += arg1;
                if (this.field553 > this.field572) {
                    this.field572 = this.field553;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class138.method1132(arg2, (int) ((long) arg0 + var6 - this.field546), this.field569, (int) (var6 - this.field567), var10);
                }
                this.field546 += arg1;
            } else if (arg1 > 0) {
                if (this.field573 == -1L) {
                    this.field573 = this.field546;
                }
                class138.method1132(arg2, arg0, this.field574, (int) (this.field546 - this.field573), arg1);
                this.field546 += arg1;
                if ((long) this.field577 < this.field546 - this.field573) {
                    this.field577 = (int) (this.field546 - this.field573);
                }
            }
        } catch (IOException var12) {
            this.field553 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I")
    public static final int method217(int arg0, int arg1, int arg2) {
        int var3 = arg0 >>> 31;
        field568++;
        return arg2 == 0 ? (arg0 + var3) / arg1 - var3 : -40;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method218(int arg0) throws IOException {
        this.method212(false);
        if (arg0 == 0) {
            this.field571.method151(-9962);
            field560++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)J")
    public final long method219(byte arg0) {
        field548++;
        if (arg0 != -50) {
            this.method221(-79L, (byte) -119);
        }
        return this.field575;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BIIB)V")
    public final void method220(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field558++;
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field573 != -1L && this.field573 <= this.field546 && (long) arg2 + this.field546 <= (long) this.field577 + this.field573) {
                class138.method1132(this.field574, (int) (this.field546 - this.field573), arg0, arg1, arg2);
                this.field546 += arg2;
                return;
            }
            long var5 = this.field546;
            if (arg3 > -16) {
                this.field572 = -10L;
            }
            int var7 = arg1;
            int var8 = arg2;
            if (this.field546 >= this.field567 && this.field546 < (long) this.field550 + this.field567) {
                int var9 = (int) ((long) this.field550 + this.field567 - this.field546);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class138.method1132(this.field569, (int) (this.field546 - this.field567), arg0, arg1, var9);
                arg1 += var9;
                arg2 -= var9;
                this.field546 += var9;
            }
            if (arg2 > this.field569.length) {
                this.field571.method150(11506, this.field546);
                this.field553 = this.field546;
                while (arg2 > 0) {
                    int var11 = this.field571.method148(arg0, -128, arg2, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field546 += var11;
                    this.field553 += var11;
                    arg2 -= var11;
                    arg1 += var11;
                }
            } else if (arg2 > 0) {
                this.method223(0);
                int var10 = arg2;
                if (this.field550 < arg2) {
                    var10 = this.field550;
                }
                class138.method1132(this.field569, 0, arg0, arg1, var10);
                this.field546 += var10;
                arg1 += var10;
                arg2 -= var10;
            }
            if (this.field573 != -1L) {
                if (this.field546 < this.field573 && arg2 > 0) {
                    int var12 = arg1 + (int) (this.field573 - this.field546);
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (arg1 < var12) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field546++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field573 && this.field573 < (long) var8 + var5) {
                    var13 = this.field573;
                } else if (this.field573 <= var5 && (long) this.field577 + this.field573 > var5) {
                    var13 = var5;
                }
                if (var5 < (long) this.field577 + this.field573 && (long) this.field577 + this.field573 <= (long) var8 + var5) {
                    var15 = (long) this.field577 + this.field573;
                } else if (this.field573 < (long) var8 + var5 && this.field573 + (long) this.field577 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class138.method1132(this.field574, (int) (var13 - this.field573), arg0, var7 + (int) (var13 - var5), var17);
                    if (var15 > this.field546) {
                        arg2 = (int) ((long) arg2 + this.field546 - var15);
                        this.field546 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field553 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JB)V")
    public final void method221(long arg0, byte arg1) {
        field549++;
        if (arg0 >= 0L) {
            this.field546 = arg0;
            if (arg1 >= -9) {
                field578 = null;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(Z)V")
    public static void method222(boolean arg0) {
        if (arg0) {
            field547 = null;
        }
        field554 = null;
        field557 = null;
        field551 = null;
        field566 = null;
        field570 = null;
        field555 = null;
        field556 = null;
        field578 = null;
        field562 = null;
        field547 = null;
        field564 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    private final void method223(int arg0) throws IOException {
        field545++;
        this.field550 = arg0;
        if (this.field553 != this.field546) {
            this.field571.method150(11506, this.field546);
            this.field553 = this.field546;
        }
        this.field567 = this.field546;
        while (this.field550 < this.field569.length) {
            int var2 = this.field571.method148(this.field569, -83, this.field569.length - this.field550, this.field550);
            if (var2 == -1) {
                break;
            }
            this.field550 += var2;
            this.field553 += var2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field552++;
        if (class91.method688(arg2, (byte) -128)) {
            class39.field906 = null;
            if (arg4 == 0) {
                class129.method1057(arg4 + 1005, arg5, -1, class94.field2201[arg2], arg3, arg1, arg6, arg8, arg0, arg7);
                if (class39.field906 != null) {
                    class129.method1057(arg4 ^ 0x3ED, arg5, -1412584499, class39.field906, arg3, arg1, arg6, arg8, class107.field2517, class132.field3117);
                    class39.field906 = null;
                }
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class154.field3511[var9] = true;
            }
        } else {
            class154.field3511[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BILmd;I)[Lnb;")
    public static final class92[] method225(byte arg0, int arg1, class87 arg2, int arg3) {
        field576++;
        if (class78.method565(arg2, arg1, arg0 ^ 0x3C, arg3)) {
            return arg0 == -67 ? class41.method347(-60) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lce;II)V")
    public class24(class20 arg0, int arg1, int arg2) throws IOException {
        this.field571 = arg0;
        this.field575 = this.field572 = arg0.method152(-1);
        this.field574 = new byte[arg2];
        this.field569 = new byte[arg1];
        this.field546 = 0L;
    }
}
