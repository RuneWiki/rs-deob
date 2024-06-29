import java.awt.Frame;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class256 {

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "J")
    private long field3900 = -1L;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    private int field3901 = 0;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "J")
    private long field3903 = -1L;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "Lko;")
    private class333 field3908;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "J")
    private long field3898;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "J")
    private long field3893;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "[B")
    private byte[] field3894;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "J")
    private long field3905;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "[B")
    private byte[] field3910;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "[[I")
    public static int[][] field3899 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "Lbg;")
    public static class310 field3906 = new class310(30, 7);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    private int field3912;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "J")
    private long field3911;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIBIZII)V", line = 6)
    public static final void method1533(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var7 = -74 / ((arg2 + 63) / 49);
        class282.field4278 = arg5;
        field3914++;
        class223.field3440 = arg0;
        class110.field1893 = arg6;
        class161.field2530 = arg1;
        class34.field490 = arg3;
        if (arg4 && class110.field1893 >= 100) {
            class290.field4403 = class161.field2530 * 128 + 64;
            class243.field3655 = class282.field4278 * 128 + 64;
            class288.field4373 = class7.method38(class243.field3655, class362.field5339, class290.field4403, (byte) -54) - class223.field3440;
        }
        class408.field5928 = 2;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[BI)V", line = 34)
    public final void method1534(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3892++;
        try {
            if ((long) arg1 + this.field3905 > this.field3893) {
                this.field3893 = (long) arg1 + this.field3905;
            }
            if (arg0 == -15020) {
                if (this.field3900 != -1L && (this.field3905 < this.field3900 || this.field3905 > (this.field3900 + ((long) this.field3901)))) {
                    this.method1537(128);
                }
                if (this.field3900 != -1L && ((long) arg1 + this.field3905) > ((long) this.field3894.length + this.field3900)) {
                    int var5 = (int) ((long) this.field3894.length + this.field3900 - this.field3905);
                    class356.method2184(arg2, arg3, this.field3894, (int) (this.field3905 - this.field3900), var5);
                    arg3 += var5;
                    this.field3905 += var5;
                    arg1 -= var5;
                    this.field3901 = this.field3894.length;
                    this.method1537(128);
                }
                if (this.field3894.length < arg1) {
                    if (this.field3911 != this.field3905) {
                        this.field3908.method2070(this.field3905, 0);
                        this.field3911 = this.field3905;
                    }
                    this.field3908.method2067(arg1, 25525, arg2, arg3);
                    this.field3911 += arg1;
                    if (this.field3898 < this.field3911) {
                        this.field3898 = this.field3911;
                    }
                    long var6 = -1L;
                    if (this.field3905 >= this.field3903 && this.field3905 < (long) this.field3912 + this.field3903) {
                        var6 = this.field3905;
                    } else if (this.field3903 >= this.field3905 && this.field3905 + ((long) arg1) > this.field3903) {
                        var6 = this.field3903;
                    }
                    long var8 = -1L;
                    if (((long) arg1 + this.field3905) > this.field3903 && this.field3903 + ((long) this.field3912) >= this.field3905 - -((long) arg1)) {
                        var8 = this.field3905 + ((long) arg1);
                    } else if (((long) this.field3912 + this.field3903) > this.field3905 && (long) arg1 + this.field3905 >= (long) this.field3912 + this.field3903) {
                        var8 = (long) this.field3912 + this.field3903;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class356.method2184(arg2, (int) ((long) arg3 + var6 - this.field3905), this.field3910, (int) (var6 - this.field3903), var10);
                    }
                    this.field3905 += arg1;
                } else if (arg1 > 0) {
                    if (this.field3900 == -1L) {
                        this.field3900 = this.field3905;
                    }
                    class356.method2184(arg2, arg3, this.field3894, (int) (this.field3905 - this.field3900), arg1);
                    this.field3905 += arg1;
                    if ((long) this.field3901 < this.field3905 - this.field3900) {
                        this.field3901 = (int) (this.field3905 - this.field3900);
                    }
                }
            }
        } catch (IOException var12) {
            this.field3911 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIII)V", line = 160)
    public static final void method1535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3896++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = arg0;
        int var11 = arg6 - arg1;
        int var12 = arg7 - arg1;
        int var13 = arg6 * arg6;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class69.field1212[arg2];
        class78.method566(var39, arg5 - var11, arg3, -7, arg5 - arg6);
        class78.method566(var39, arg5 + var11, arg4, -7, arg5 - var11);
        class78.method566(var39, arg5 + arg6, arg3, -7, arg5 + var11);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var10;
                int var46 = arg5 - var10;
                class78.method566(class69.field1212[var41], var46, arg3, -7, var44);
                class78.method566(class69.field1212[var41], var45, arg4, -7, var46);
                class78.method566(class69.field1212[var41], var43, arg3, arg0 ^ 0xFFFFFFF9, var45);
                class78.method566(class69.field1212[var42], var46, arg3, -7, var44);
                class78.method566(class69.field1212[var42], var45, arg4, -7, var46);
                class78.method566(class69.field1212[var42], var43, arg3, -7, var45);
            } else {
                class78.method566(class69.field1212[var41], var43, arg3, -7, var44);
                class78.method566(class69.field1212[var42], var43, arg3, -7, var44);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)J", line = 325)
    public final long method1536(boolean arg0) {
        if (arg0) {
            this.method1544(81);
        }
        field3902++;
        return this.field3893;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 339)
    private final void method1537(int arg0) throws IOException {
        if (arg0 != 128) {
            method1545(89, 110, 121, 92, 75, null);
        }
        if (this.field3900 != -1L) {
            if (this.field3911 != this.field3900) {
                this.field3908.method2070(this.field3900, 0);
                this.field3911 = this.field3900;
            }
            this.field3908.method2067(this.field3901, arg0 ^ 0x6335, this.field3894, 0);
            this.field3911 += this.field3901;
            if (this.field3911 > this.field3898) {
                this.field3898 = this.field3911;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3900 >= this.field3903 && this.field3900 < (long) this.field3912 + this.field3903) {
                var2 = this.field3900;
            } else if (this.field3903 >= this.field3900 && (long) this.field3901 + this.field3900 > this.field3903) {
                var2 = this.field3903;
            }
            if (this.field3903 < ((long) this.field3901 + this.field3900) && ((long) this.field3901 + this.field3900) <= (this.field3903 + ((long) this.field3912))) {
                var4 = (long) this.field3901 + this.field3900;
            } else if (this.field3900 < ((long) this.field3912 + this.field3903) && (long) this.field3912 + this.field3903 <= (long) this.field3901 + this.field3900) {
                var4 = this.field3903 + ((long) this.field3912);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class356.method2184(this.field3894, (int) (var2 - this.field3900), this.field3910, (int) (var2 - this.field3903), var6);
            }
            this.field3900 = -1L;
            this.field3901 = 0;
        }
        field3897++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[B)V", line = 414)
    public final void method1538(int arg0, byte[] arg1) throws IOException {
        field3907++;
        this.method1542(arg1.length, arg0, arg1, true);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILvl;IILqq;I)V", line = 423)
    public static final void method1539(int arg0, int arg1, class11 arg2, int arg3, int arg4, class318 arg5, int arg6) {
        if (class460.field7088 < 100) {
            class150.method975(arg2, arg5, arg3 ^ 0x22F2);
        }
        field3904++;
        arg5.method1982(arg0, arg4, arg0 + arg6, arg1 + arg4);
        if (class460.field7088 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg0;
            arg5.method1971(arg0, arg4, arg6, arg1, -16777216, 0);
            int var9 = arg1 / 2 + arg4 - var7 - 18;
            arg5.method1918(var8 - 152, var9, 304, 34, class190.field3024[class63.field1047].getRGB(), 0);
            arg5.method1971(var8 - 150, var9 + 2, class460.field7088 * 3, 30, class208.field3259[class63.field1047].getRGB(), 0);
            class493.field7514.method2933(var8, var7 + var9, class197.field3110[class63.field1047].getRGB(), -1, 11252, class218.field3355.method2473(class406.field5898, -101));
            return;
        }
        int var10 = class466.field7158 - (int) ((float) arg6 / class492.field7480);
        int var11 = class264.field3989 + ((int) ((float) arg1 / class492.field7480));
        int var12 = (int) ((float) arg6 / class492.field7480) + class466.field7158;
        class305.field4632 = class466.field7158 - (int) ((float) arg6 / class492.field7480);
        if (arg3 != -8847) {
            return;
        }
        class60.field1022 = (int) ((float) (arg1 * 2) / class492.field7480);
        int var13 = class264.field3989 - ((int) ((float) arg1 / class492.field7480));
        class270.field4077 = (int) ((float) (arg6 * 2) / class492.field7480);
        class22.field277 = class264.field3989 - (int) ((float) arg1 / class492.field7480);
        class492.method2955(var10 + class492.field7497, class492.field7494 + var11, class492.field7497 + var12, class492.field7494 + var13, arg0, arg4, arg0 + arg6, arg1 + arg4 + 1);
        class492.method2972(arg5);
        class4 var14 = class492.method2969(arg5);
        class388.method2308(var14, 0, 430399648, 0, arg5);
        if (class273.field4150 > 0) {
            class102.field1822--;
            if (class102.field1822 == 0) {
                class102.field1822 = 20;
                class273.field4150--;
            }
        }
        if (!class359.field5320) {
            return;
        }
        int var15 = arg0 + arg6 - 5;
        int var16 = arg4 + arg1 - 8;
        class217.field3343.method2946(var15, 16776960, (byte) -127, "Fps:" + class49.field756, -1, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class217.field3343.method2946(var15, var19, (byte) -110, "Mem:" + var18 + "k", -1, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lko;II)V", line = 881)
    public class256(class333 arg0, int arg1, int arg2) throws IOException {
        this.field3908 = arg0;
        this.field3893 = this.field3898 = arg0.method2069((byte) -91);
        this.field3894 = new byte[arg2];
        this.field3905 = 0L;
        this.field3910 = new byte[arg1];
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(Z)V", line = 511)
    private final void method1540(boolean arg0) throws IOException {
        field3913++;
        this.field3912 = 0;
        if (arg0) {
            method1539(-61, -107, null, -56, -122, null, 62);
        }
        if (this.field3911 != this.field3905) {
            this.field3908.method2070(this.field3905, 0);
            this.field3911 = this.field3905;
        }
        this.field3903 = this.field3905;
        while (this.field3912 < this.field3910.length) {
            int var2 = this.field3910.length - this.field3912;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3908.method2065(this.field3910, this.field3912, var2, -1);
            if (var3 == -1) {
                break;
            }
            this.field3912 += var3;
            this.field3911 += var3;
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V", line = 555)
    public static void method1541(int arg0) {
        field3899 = null;
        field3906 = null;
        if (arg0 != -24617) {
            method1539(-106, 49, null, -122, -33, null, 112);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[BZ)V", line = 573)
    public final void method1542(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field3891++;
        try {
            if ((arg0 + arg1) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg2.length);
            }
            if (this.field3900 != -1L && this.field3900 <= this.field3905 && ((long) arg0 + this.field3905) <= (this.field3900 + ((long) this.field3901))) {
                class356.method2184(this.field3894, (int) (this.field3905 - this.field3900), arg2, arg1, arg0);
                this.field3905 += arg0;
                return;
            }
            long var5 = this.field3905;
            if (!arg3) {
                this.method1536(false);
            }
            int var7 = arg1;
            int var8 = arg0;
            if (this.field3903 <= this.field3905 && ((long) this.field3912 + this.field3903) > this.field3905) {
                int var9 = (int) (this.field3903 + (long) this.field3912 - this.field3905);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class356.method2184(this.field3910, (int) (this.field3905 - this.field3903), arg2, arg1, var9);
                arg0 -= var9;
                arg1 += var9;
                this.field3905 += var9;
            }
            if (arg0 > this.field3910.length) {
                this.field3908.method2070(this.field3905, 0);
                this.field3911 = this.field3905;
                while (arg0 > 0) {
                    int var10 = this.field3908.method2065(arg2, arg1, arg0, -1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3905 += var10;
                    this.field3911 += var10;
                    arg1 += var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                this.method1540(false);
                int var11 = arg0;
                if (arg0 > this.field3912) {
                    var11 = this.field3912;
                }
                class356.method2184(this.field3910, 0, arg2, arg1, var11);
                arg1 += var11;
                this.field3905 += var11;
                arg0 -= var11;
            }
            if (this.field3900 != -1L) {
                if (this.field3905 < this.field3900 && arg0 > 0) {
                    int var12 = (int) (this.field3900 - this.field3905) + arg1;
                    if (var12 > arg0 + arg1) {
                        var12 = arg1 + arg0;
                    }
                    while (arg1 < var12) {
                        arg0--;
                        arg2[arg1++] = 0;
                        this.field3905++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field3900 && (long) var8 + var5 > this.field3900) {
                    var13 = this.field3900;
                } else if (var5 >= this.field3900 && ((long) this.field3901 + this.field3900) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < this.field3900 + ((long) this.field3901) && ((long) var8 + var5) >= ((long) this.field3901 + this.field3900)) {
                    var15 = this.field3900 + ((long) this.field3901);
                } else if (this.field3900 < (var5 + ((long) var8)) && (var5 + ((long) var8)) <= ((long) this.field3901 + this.field3900)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class356.method2184(this.field3894, (int) (var13 - this.field3900), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field3905 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field3905));
                        this.field3905 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3911 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(JB)V", line = 767)
    public final void method1543(long arg0, byte arg1) throws IOException {
        field3915++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1544(-102));
        }
        int var4 = 99 % ((-arg1 - 20) / 37);
        this.field3905 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Ljava/io/File;", line = 799)
    private final File method1544(int arg0) {
        if (arg0 > -97) {
            method1545(-94, -57, 99, -4, 68, null);
        }
        field3895++;
        return this.field3908.method2068((byte) -106);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIILhf;)Ljava/awt/Frame;", line = 815)
    public static final Frame method1545(int arg0, int arg1, int arg2, int arg3, int arg4, class260 arg5) {
        field3909++;
        if (!arg5.method1561(-35)) {
            return null;
        }
        if (arg3 == 0) {
            class7[] var6 = class457.method2706((byte) 112, arg5);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field84 == arg2 && var6[var8].field78 == arg1 && (arg0 == 0 || var6[var8].field85 == arg0) && (!var7 || var6[var8].field90 > arg3)) {
                    arg3 = var6[var8].field90;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class180 var9 = arg5.method1582(arg2, arg3, (byte) -107, arg0, arg1);
        while (var9.field2802 == 0) {
            class414.method2437(10L, (byte) -122);
        }
        Frame var10 = (Frame) var9.field2803;
        if (var10 == null) {
            return null;
        } else if (var9.field2802 == arg4) {
            class274.method1671(arg5, var10, true);
            return null;
        } else {
            return var10;
        }
    }
}
