import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class188 {

    @OriginalMember(owner = "client!je", name = "v", descriptor = "J")
    private long field3043 = -1L;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    private int field3023 = 0;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "J")
    private long field3048 = -1L;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Llg;")
    private class13 field3041;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "J")
    private long field3025;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "J")
    private long field3049;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "J")
    private long field3038;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[B")
    private byte[] field3040;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[B")
    private byte[] field3033;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Z")
    public static boolean field3022 = true;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Z")
    public static boolean field3039 = true;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "[I")
    public static int[] field3045 = new int[2048];

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[I")
    public static int[] field3047 = new int[100];

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    private int field3031;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "J")
    private long field3034;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lhb;")
    public static final class222 method1394(int arg0, int arg1) {
        field3026++;
        int var2 = 31 / ((arg1 + 82) / 32);
        return (class222) class149.field2425.method1034((long) arg0, (byte) 21);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)J")
    public final long method1395(int arg0) {
        if (arg0 <= 4) {
            this.field3048 = 21L;
        }
        field3028++;
        return this.field3049;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z[B)V")
    public final void method1396(boolean arg0, byte[] arg1) throws IOException {
        field3035++;
        this.method1406(arg1.length, 0, (byte) -126, arg1);
        if (arg0) {
            this.field3025 = -45L;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static void method1397(int arg0) {
        if (arg0 == -3) {
            field3045 = null;
            field3047 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method1398(byte arg0) {
        if (arg0 <= 85) {
            field3047 = null;
        }
        class152.field2505 = null;
        class19.field214 = null;
        class101.field1476 = null;
        class217.field3457 = null;
        class201.field3220 = null;
        field3042++;
        class272.field4377 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    private final void method1399(byte arg0) throws IOException {
        if (arg0 != 123) {
            return;
        }
        field3046++;
        if (this.field3043 == -1L) {
            return;
        }
        long var2 = -1L;
        if (this.field3043 != this.field3034) {
            this.field3041.method103(this.field3043, (byte) 123);
            this.field3034 = this.field3043;
        }
        this.field3041.method101(this.field3023, 0, (byte) 124, this.field3033);
        if (this.field3043 >= this.field3048 && (long) this.field3031 + this.field3048 > this.field3043) {
            var2 = this.field3043;
        } else if (this.field3048 >= this.field3043 && this.field3048 < ((long) this.field3023 + this.field3043)) {
            var2 = this.field3048;
        }
        this.field3034 += (long) this.field3023;
        if (this.field3034 > this.field3025) {
            this.field3025 = this.field3034;
        }
        long var4 = -1L;
        if (this.field3048 < (this.field3043 + ((long) this.field3023)) && ((long) this.field3023 + this.field3043) <= (this.field3048 + ((long) this.field3031))) {
            var4 = (long) this.field3023 + this.field3043;
        } else if (this.field3043 < (this.field3048 + ((long) this.field3031)) && (this.field3043 + ((long) this.field3023)) >= ((long) this.field3031 + this.field3048)) {
            var4 = this.field3048 + ((long) this.field3031);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class158.method1177(this.field3033, (int) (var2 - this.field3043), this.field3040, (int) (var2 - this.field3048), var6);
        }
        this.field3023 = 0;
        this.field3043 = -1L;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    private final void method1400(int arg0) throws IOException {
        this.field3031 = 0;
        if (arg0 < 27) {
            method1398((byte) -55);
        }
        if (this.field3038 != this.field3034) {
            this.field3041.method103(this.field3038, (byte) 123);
            this.field3034 = this.field3038;
        }
        this.field3048 = this.field3038;
        field3029++;
        while (this.field3040.length > this.field3031) {
            int var2 = this.field3040.length - this.field3031;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3041.method99(this.field3040, 1, var2, this.field3031);
            if (var3 == -1) {
                break;
            }
            this.field3034 += (long) var3;
            this.field3031 += var3;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1401(int arg0, int arg1) {
        field3050++;
        if (arg0 != 2) {
            field3045 = null;
        }
        return class243.field3927[arg1].length() <= 0 ? class226.field3632[arg1] : class226.field3632[arg1] + class180.field2900 + class243.field3927[arg1];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JB)V")
    public final void method1402(long arg0, byte arg1) throws IOException {
        if (arg1 != -12) {
            method1398((byte) -30);
        }
        field3037++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1404((byte) 117));
        }
        this.field3038 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILsl;IIILvk;ILbe;)V")
    public static final void method1403(int arg0, class18 arg1, int arg2, int arg3, int arg4, class36 arg5, int arg6, class29 arg7) {
        class23 var8 = new class23();
        var8.field248 = arg6 * 128;
        var8.field269 = arg3;
        if (arg4 < 126) {
            return;
        }
        var8.field252 = arg2 * 128;
        if (arg5 != null) {
            var8.field254 = arg5;
            var8.field250 = arg5.field474;
            var8.field268 = arg5.field448 * 128;
            var8.field275 = arg5.field488;
            var8.field258 = arg5.field469;
            var8.field271 = arg5.field523;
            var8.field249 = arg5.field514;
            int var10 = arg5.field501;
            int var11 = arg5.field487;
            if (arg0 == 1 || arg0 == 3) {
                var11 = arg5.field501;
                var10 = arg5.field487;
            }
            var8.field247 = (arg6 + var11) * 128;
            var8.field266 = (arg2 + var10) * 128;
            if (arg5.field471 != null) {
                var8.field272 = true;
                var8.method169(false);
            }
            if (var8.field250 != null) {
                var8.field256 = (int) ((double) (var8.field271 - var8.field275) * Math.random()) + var8.field275;
            }
            class297.field4694.method1385(var8, true);
        } else if (arg1 != null) {
            class245 var9 = arg1.field205;
            var8.field253 = arg1;
            if (var9.field3972 != null) {
                var8.field272 = true;
                var9 = var9.method1758(true);
            }
            if (var9 != null) {
                var8.field266 = (var9.field3997 + arg2) * 128;
                var8.field247 = (var9.field3997 + arg6) * 128;
                var8.field249 = class287.method1954(arg1, -1);
                var8.field268 = var9.field4020 * 128;
                var8.field258 = var9.field3996;
            }
            class178.field2877.method1385(var8, true);
        } else if (arg7 != null) {
            var8.field270 = arg7;
            var8.field247 = (arg6 + arg7.method205(116)) * 128;
            var8.field266 = (arg2 + arg7.method205(75)) * 128;
            var8.field249 = class122.method889((byte) -34, arg7);
            var8.field268 = arg7.field353 * 128;
            var8.field258 = arg7.field334;
            class288.field4566.method1032(false, var8, class193.method1431(arg7.field344, false));
        }
        field3036++;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)Ljava/io/File;")
    private final File method1404(byte arg0) {
        field3032++;
        int var2 = -23 % ((arg0 - 26) / 60);
        return this.field3041.method104((byte) -115);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1405(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3044++;
        int var8 = arg7;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg7 * arg7;
        int var12 = arg2 - arg1;
        int var13 = arg2 * arg2;
        int var14 = arg7 - arg1;
        int var15 = var14 * var14;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = var11 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        if (arg0 >= -36) {
            method1397(-42);
        }
        int var21 = var14 << 1;
        int var22 = arg7 << 1;
        int var23 = var11 - ((var22 - 1) * var17);
        int var24 = (1 - var21) * var16 + var19;
        int var25 = (1 - var22) * var13 + var18;
        int var26 = var15 - (var21 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var16 << 2;
        int var29 = var11 << 2;
        int var30 = var15 << 2;
        int var31 = var18 * 3;
        int var32 = (var22 - 3) * var17;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = var29;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int[] var38 = class240.field3831[arg6];
        class177.method1330(var38, arg3 - arg2, arg5, 32232, arg3 - var12);
        int var39 = (var14 - 1) * var28;
        class177.method1330(var38, arg3 - var12, arg4, 32232, arg3 + var12);
        class177.method1330(var38, arg3 + var12, arg5, 32232, arg2 + arg3);
        while (var8 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var23 += var35;
                    var35 += var29;
                    var9++;
                    var25 += var31;
                    var31 += var29;
                }
            }
            boolean var40 = var8 <= var14;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var24 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var24 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var24 += -var39;
                var39 -= var28;
                var26 += -var34;
                var34 -= var28;
            }
            var8--;
            int var41 = arg6 - var8;
            if (var23 < 0) {
                var25 += var31;
                var31 += var29;
                var9++;
                var23 += var35;
                var35 += var29;
            }
            int var42 = arg6 + var8;
            var23 += -var32;
            var32 -= var27;
            var25 += -var36;
            int var43 = arg3 - var9;
            int var44 = arg3 + var9;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class177.method1330(class240.field3831[var41], var43, arg5, 32232, var46);
                class177.method1330(class240.field3831[var41], var46, arg4, 32232, var45);
                class177.method1330(class240.field3831[var41], var45, arg5, 32232, var44);
                class177.method1330(class240.field3831[var42], var43, arg5, 32232, var46);
                class177.method1330(class240.field3831[var42], var46, arg4, 32232, var45);
                class177.method1330(class240.field3831[var42], var45, arg5, 32232, var44);
            } else {
                class177.method1330(class240.field3831[var41], var43, arg5, 32232, var44);
                class177.method1330(class240.field3831[var42], var43, arg5, 32232, var44);
            }
            var36 -= var27;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB[B)V")
    public final void method1406(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field3027++;
        try {
            if (arg3.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg3.length);
            }
            if (this.field3043 != -1L && this.field3038 >= this.field3043 && ((long) arg0 + this.field3038) <= ((long) this.field3023 + this.field3043)) {
                class158.method1177(this.field3033, (int) (this.field3038 - this.field3043), arg3, arg1, arg0);
                this.field3038 += (long) arg0;
                return;
            }
            int var5 = 13 % ((arg2 + 72) / 50);
            long var6 = this.field3038;
            int var8 = arg0;
            int var9 = arg1;
            if (this.field3048 <= this.field3038 && (long) this.field3031 + this.field3048 > this.field3038) {
                int var10 = (int) (this.field3048 + (long) this.field3031 - this.field3038);
                if (var10 > arg0) {
                    var10 = arg0;
                }
                arg0 -= var10;
                class158.method1177(this.field3040, (int) (this.field3038 - this.field3048), arg3, arg1, var10);
                this.field3038 += (long) var10;
                arg1 += var10;
            }
            if (this.field3040.length < arg0) {
                this.field3041.method103(this.field3038, (byte) 123);
                this.field3034 = this.field3038;
                while (arg0 > 0) {
                    int var12 = this.field3041.method99(arg3, 1, arg0, arg1);
                    if (var12 == -1) {
                        break;
                    }
                    arg1 += var12;
                    this.field3038 += (long) var12;
                    arg0 -= var12;
                    this.field3034 += (long) var12;
                }
            } else if (arg0 > 0) {
                int var11 = arg0;
                this.method1400(99);
                if (this.field3031 < arg0) {
                    var11 = this.field3031;
                }
                class158.method1177(this.field3040, 0, arg3, arg1, var11);
                arg0 -= var11;
                this.field3038 += (long) var11;
                arg1 += var11;
            }
            if (this.field3043 != -1L) {
                if (this.field3038 < this.field3043 && arg0 > 0) {
                    int var13 = (int) (this.field3043 - this.field3038) + arg1;
                    if ((arg0 + arg1) < var13) {
                        var13 = arg0 + arg1;
                    }
                    while (arg1 < var13) {
                        arg3[arg1++] = 0;
                        arg0--;
                        this.field3038++;
                    }
                }
                long var14 = -1L;
                if (this.field3043 >= var6 && (long) var8 + var6 > this.field3043) {
                    var14 = this.field3043;
                } else if (var6 >= this.field3043 && var6 < (long) this.field3023 + this.field3043) {
                    var14 = var6;
                }
                long var16 = -1L;
                if ((long) this.field3023 + this.field3043 > var6 && (long) this.field3023 + this.field3043 <= (long) var8 + var6) {
                    var16 = this.field3043 + ((long) this.field3023);
                } else if (var6 + ((long) var8) > this.field3043 && (long) this.field3023 + this.field3043 >= var6 - -((long) var8)) {
                    var16 = (long) var8 + var6;
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class158.method1177(this.field3033, (int) (var14 - this.field3043), arg3, var9 + ((int) (var14 - var6)), var18);
                    if (var16 > this.field3038) {
                        arg0 = (int) ((long) arg0 - (var16 - this.field3038));
                        this.field3038 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field3034 = -1L;
            throw var20;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI[BI)V")
    public final void method1407(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3030++;
        try {
            if (arg0 != 104) {
                method1397(73);
            }
            if (this.field3049 < ((long) arg1 + this.field3038)) {
                this.field3049 = this.field3038 + ((long) arg1);
            }
            if (this.field3043 != -1L && (this.field3043 > this.field3038 || this.field3038 > this.field3043 + ((long) this.field3023))) {
                this.method1399((byte) 123);
            }
            if (this.field3043 != -1L && (this.field3043 + ((long) this.field3033.length)) < ((long) arg1 + this.field3038)) {
                int var5 = (int) (this.field3043 + (long) this.field3033.length - this.field3038);
                class158.method1177(arg2, arg3, this.field3033, (int) (this.field3038 - this.field3043), var5);
                arg1 -= var5;
                this.field3038 += (long) var5;
                this.field3023 = this.field3033.length;
                arg3 += var5;
                this.method1399((byte) 123);
            }
            if (this.field3033.length < arg1) {
                long var6 = -1L;
                if (this.field3038 != this.field3034) {
                    this.field3041.method103(this.field3038, (byte) 123);
                    this.field3034 = this.field3038;
                }
                this.field3041.method101(arg1, arg3, (byte) 126, arg2);
                if (this.field3038 >= this.field3048 && this.field3038 < (long) this.field3031 + this.field3048) {
                    var6 = this.field3038;
                } else if (this.field3048 >= this.field3038 && this.field3048 < ((long) arg1 + this.field3038)) {
                    var6 = this.field3048;
                }
                long var8 = -1L;
                this.field3034 += (long) arg1;
                if (this.field3048 < this.field3038 + ((long) arg1) && ((long) arg1 + this.field3038) <= ((long) this.field3031 + this.field3048)) {
                    var8 = (long) arg1 + this.field3038;
                } else if (this.field3038 < (long) this.field3031 + this.field3048 && ((long) this.field3031 + this.field3048) <= ((long) arg1 + this.field3038)) {
                    var8 = (long) this.field3031 + this.field3048;
                }
                if (this.field3034 > this.field3025) {
                    this.field3025 = this.field3034;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class158.method1177(arg2, (int) ((long) arg3 + var6 - this.field3038), this.field3040, (int) (var6 - this.field3048), var10);
                }
                this.field3038 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field3043 == -1L) {
                    this.field3043 = this.field3038;
                }
                class158.method1177(arg2, arg3, this.field3033, (int) (this.field3038 - this.field3043), arg1);
                this.field3038 += (long) arg1;
                if ((long) this.field3023 < this.field3038 - this.field3043) {
                    this.field3023 = (int) (this.field3038 - this.field3043);
                }
            }
        } catch (IOException var12) {
            this.field3034 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Llg;II)V")
    public class188(class13 arg0, int arg1, int arg2) throws IOException {
        this.field3041 = arg0;
        this.field3049 = this.field3025 = arg0.method102(15070);
        this.field3038 = 0L;
        this.field3040 = new byte[arg1];
        this.field3033 = new byte[arg2];
    }
}
