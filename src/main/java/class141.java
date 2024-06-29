import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class141 {

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "J")
    private long field2330 = -1L;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "J")
    private long field2335 = -1L;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    private int field2336 = 0;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lff;")
    private class305 field2318;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "J")
    private long field2334;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "J")
    private long field2325;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[B")
    private byte[] field2326;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "J")
    private long field2316;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[B")
    private byte[] field2315;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2324 = "Select";

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Z")
    public static boolean field2337 = true;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field2339 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    private int field2332;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "J")
    private long field2312;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Laj;")
    public static class151 field2331;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    public static int[] field2321;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BBII)V")
    public final void method1041(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field2323++;
        try {
            if ((this.field2316 + ((long) arg2)) > this.field2325) {
                this.field2325 = (long) arg2 + this.field2316;
            }
            int var5 = -5 % ((arg1 - 49) / 35);
            if (this.field2335 != -1L && (this.field2335 > this.field2316 || (this.field2335 + ((long) this.field2336)) < this.field2316)) {
                this.method1049((byte) -34);
            }
            if (this.field2335 != -1L && ((long) this.field2315.length + this.field2335) < (this.field2316 + ((long) arg2))) {
                int var6 = (int) ((long) this.field2315.length + this.field2335 - this.field2316);
                class75.method537(arg0, arg3, this.field2315, (int) (this.field2316 - this.field2335), var6);
                arg3 += var6;
                this.field2316 += (long) var6;
                this.field2336 = this.field2315.length;
                this.method1049((byte) -109);
                arg2 -= var6;
            }
            if (arg2 > this.field2315.length) {
                if (this.field2316 != this.field2312) {
                    this.field2318.method2068(this.field2316, 16767);
                    this.field2312 = this.field2316;
                }
                long var7 = -1L;
                this.field2318.method2069(arg2, arg0, arg3, (byte) 41);
                if (this.field2316 >= this.field2330 && this.field2316 < ((long) this.field2332 + this.field2330)) {
                    var7 = this.field2316;
                } else if (this.field2316 <= this.field2330 && this.field2330 < ((long) arg2 + this.field2316)) {
                    var7 = this.field2330;
                }
                this.field2312 += (long) arg2;
                long var9 = -1L;
                if (this.field2312 > this.field2334) {
                    this.field2334 = this.field2312;
                }
                if (this.field2330 < (this.field2316 + ((long) arg2)) && (long) this.field2332 + this.field2330 >= (long) arg2 + this.field2316) {
                    var9 = (long) arg2 + this.field2316;
                } else if ((this.field2330 + ((long) this.field2332)) > this.field2316 && this.field2316 + ((long) arg2) >= (long) this.field2332 + this.field2330) {
                    var9 = (long) this.field2332 + this.field2330;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class75.method537(arg0, (int) ((long) arg3 + var7 - this.field2316), this.field2326, (int) (var7 - this.field2330), var11);
                }
                this.field2316 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2335 == -1L) {
                    this.field2335 = this.field2316;
                }
                class75.method537(arg0, arg3, this.field2315, (int) (this.field2316 - this.field2335), arg2);
                this.field2316 += (long) arg2;
                if (((long) this.field2336) < (this.field2316 - this.field2335)) {
                    this.field2336 = (int) (this.field2316 - this.field2335);
                }
            }
        } catch (IOException var13) {
            this.field2312 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(JZ)V")
    public final void method1042(long arg0, boolean arg1) throws IOException {
        field2329++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1046(128));
        } else if (arg1) {
            this.field2316 = arg0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method1043(boolean arg0) {
        field2324 = null;
        if (arg0) {
            field2321 = null;
            field2331 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)J")
    public final long method1044(int arg0) {
        int var2 = -90 / ((-arg0 - 19) / 56);
        field2341++;
        return this.field2325;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    private final void method1045(int arg0) throws IOException {
        field2320++;
        this.field2332 = 0;
        if (this.field2316 != this.field2312) {
            this.field2318.method2068(this.field2316, 16767);
            this.field2312 = this.field2316;
        }
        if (arg0 != 200000000) {
            this.method1046(-107);
        }
        this.field2330 = this.field2316;
        while (this.field2332 < this.field2326.length) {
            int var2 = this.field2326.length - this.field2332;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2318.method2067(this.field2332, var2, this.field2326, 0);
            if (var3 == -1) {
                break;
            }
            this.field2332 += var3;
            this.field2312 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method1046(int arg0) {
        field2319++;
        if (arg0 != 128) {
            this.method1046(-24);
        }
        return this.field2318.method2065((byte) 80);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILaj;)Lek;")
    public static final class250 method1047(int arg0, int arg1, class151 arg2) {
        if (arg0 != 0) {
            method1052(57);
        }
        field2333++;
        return class313.method2118(arg2, (byte) -83, arg1) ? class7.method47(false) : null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)V")
    public final void method1048(byte[] arg0, int arg1) throws IOException {
        this.method1051(arg0, arg0.length, -127, 0);
        field2314++;
        if (arg1 <= 90) {
            this.method1044(8);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    private final void method1049(byte arg0) throws IOException {
        field2327++;
        int var2 = -85 % ((arg0 - 42) / 39);
        if (this.field2335 == -1L) {
            return;
        }
        if (this.field2335 != this.field2312) {
            this.field2318.method2068(this.field2335, 16767);
            this.field2312 = this.field2335;
        }
        long var3 = -1L;
        this.field2318.method2069(this.field2336, this.field2315, 0, (byte) 41);
        this.field2312 += (long) this.field2336;
        if (this.field2334 < this.field2312) {
            this.field2334 = this.field2312;
        }
        long var5 = -1L;
        if (this.field2330 < ((long) this.field2336 + this.field2335) && ((long) this.field2336 + this.field2335) <= (this.field2330 + ((long) this.field2332))) {
            var3 = (long) this.field2336 + this.field2335;
        } else if ((long) this.field2332 + this.field2330 > this.field2335 && this.field2335 + ((long) this.field2336) >= (long) this.field2332 + this.field2330) {
            var3 = (long) this.field2332 + this.field2330;
        }
        if (this.field2335 >= this.field2330 && (long) this.field2332 + this.field2330 > this.field2335) {
            var5 = this.field2335;
        } else if (this.field2335 <= this.field2330 && ((long) this.field2336 + this.field2335) > this.field2330) {
            var5 = this.field2330;
        }
        if (var5 > -1L && var5 < var3) {
            int var7 = (int) (var3 - var5);
            class75.method537(this.field2315, (int) (var5 - this.field2335), this.field2326, (int) (var5 - this.field2330), var7);
        }
        this.field2335 = -1L;
        this.field2336 = 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZIII)V")
    public static final void method1050(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2322++;
        class312.field5028[0].method1650(arg3, arg0);
        class312.field5028[1].method1650(arg3, arg0 + arg4 - 16);
        int var6 = (arg4 - 32) * arg4 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg1 / (arg5 - arg4);
        class211.method1483(arg3, arg0 + 16, 16, arg4 - 32, class182.field2900);
        if (arg2) {
            return;
        }
        class211.method1483(arg3, arg0 + var7 + 16, 16, var6, class32.field530);
        class211.method1491(arg3, arg0 + var7 + 16, var6, class232.field3935);
        class211.method1491(arg3 + 1, arg0 + 16 + var7, var6, class232.field3935);
        class211.method1495(arg3, arg0 + var7 + 16, 16, class232.field3935);
        class211.method1495(arg3, arg0 + var7 + 17, 16, class232.field3935);
        class211.method1491(arg3 + 15, var7 + 16 + arg0, var6, class208.field3519);
        class211.method1491(arg3 + 14, arg0 + 17 + var7, var6 - 1, class208.field3519);
        class211.method1495(arg3, arg0 + var6 - (-var7 - 15), 16, class208.field3519);
        class211.method1495(arg3 + 1, arg0 + var7 - -14 - -var6, 15, class208.field3519);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BIII)V")
    public final void method1051(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2317++;
        try {
            if ((arg1 + arg3) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field2335 != -1L && this.field2335 <= this.field2316 && (this.field2335 + ((long) this.field2336)) >= ((long) arg1 + this.field2316)) {
                class75.method537(this.field2315, (int) (this.field2316 - this.field2335), arg0, arg3, arg1);
                this.field2316 += (long) arg1;
                return;
            }
            long var5 = this.field2316;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field2316 >= this.field2330 && ((long) this.field2332 + this.field2330) > this.field2316) {
                int var9 = (int) ((long) this.field2332 + this.field2330 - this.field2316);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class75.method537(this.field2326, (int) (this.field2316 - this.field2330), arg0, arg3, var9);
                arg3 += var9;
                arg1 -= var9;
                this.field2316 += (long) var9;
            }
            if (this.field2326.length < arg1) {
                this.field2318.method2068(this.field2316, 16767);
                this.field2312 = this.field2316;
                while (arg1 > 0) {
                    int var11 = this.field2318.method2067(arg3, arg1, arg0, 0);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 -= var11;
                    this.field2312 += (long) var11;
                    arg3 += var11;
                    this.field2316 += (long) var11;
                }
            } else if (arg1 > 0) {
                int var10 = arg1;
                this.method1045(200000000);
                if (arg1 > this.field2332) {
                    var10 = this.field2332;
                }
                class75.method537(this.field2326, 0, arg0, arg3, var10);
                arg3 += var10;
                arg1 -= var10;
                this.field2316 += (long) var10;
            }
            if (this.field2335 != -1L) {
                if (this.field2335 > this.field2316 && arg1 > 0) {
                    int var12 = (int) (this.field2335 - this.field2316) + arg3;
                    if (var12 > (arg1 + arg3)) {
                        var12 = arg3 + arg1;
                    }
                    while (var12 > arg3) {
                        arg0[arg3++] = 0;
                        arg1--;
                        this.field2316++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field2335 >= var5 && this.field2335 < var5 + ((long) var7)) {
                    var13 = this.field2335;
                } else if (var5 >= this.field2335 && var5 < ((long) this.field2336 + this.field2335)) {
                    var13 = var5;
                }
                if (((long) this.field2336 + this.field2335) > var5 && ((long) this.field2336 + this.field2335) <= ((long) var7 + var5)) {
                    var15 = (long) this.field2336 + this.field2335;
                } else if ((long) var7 + var5 > this.field2335 && this.field2335 + ((long) this.field2336) >= (long) var7 + var5) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class75.method537(this.field2315, (int) (var13 - this.field2335), arg0, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field2316) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field2316));
                        this.field2316 = var15;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2312 = -1L;
            throw var20;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
        int var19 = 118 / ((-arg2 - 19) / 33);
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)Z")
    public static final boolean method1052(int arg0) {
        if (arg0 != 4) {
            field2324 = null;
        }
        field2338++;
        return class101.field1608 == 0 ? class313.field5050.method750(-1) : true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)V")
    public static final void method1053(int arg0, byte arg1, int arg2) {
        if (class224.field3774 > 0) {
            class37.method231(class224.field3774, (byte) -97);
            class224.field3774 = 0;
        }
        short var3 = 256;
        if (arg1 != 28) {
            return;
        }
        int var4 = 0;
        field2313++;
        int var5 = class211.field3557 * arg0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class231.field3924[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class110.field1825[var4++];
                int var12 = class211.field3551[arg2 + (var5++)];
                if (var11 == 0) {
                    class130.field2154.field1516[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    int var14 = 238 - var11;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class123.field2084[var11];
                    class130.field2154.field1516[var6++] = class15.method84(var14 * class15.method84(16711935, var12) + class15.method84(16711935, var15) * var13, -16711936) + class15.method84(var13 * class15.method84(65280, var15) + (var14 * class15.method84(65280, var12)), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class130.field2154.field1516[var6++] = class211.field3551[var5++ + arg2];
            }
            var5 += class211.field3557 - 128;
        }
        class130.field2154.method660(arg2, arg0);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lff;II)V")
    public class141(class305 arg0, int arg1, int arg2) throws IOException {
        this.field2318 = arg0;
        this.field2325 = this.field2334 = arg0.method2066(false);
        this.field2326 = new byte[arg1];
        this.field2316 = 0L;
        this.field2315 = new byte[arg2];
    }
}
