import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class183 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    private int field2514 = 0;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "J")
    private long field2533 = -1L;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "J")
    private long field2536 = -1L;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Ljn;")
    private class322 field2515;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "J")
    private long field2535;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "J")
    private long field2513;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "J")
    private long field2531;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "[B")
    private byte[] field2520;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[B")
    private byte[] field2525;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Z")
    public static boolean field2511 = false;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "J")
    private long field2522;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "Lla;")
    public static class423 field2534;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)J")
    public final long method1286(int arg0) {
        if (arg0 >= -75) {
            this.field2522 = -68L;
        }
        field2524++;
        return this.field2513;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZ[B)V")
    public final void method1287(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        field2526++;
        try {
            if (this.field2513 < this.field2531 + ((long) arg1)) {
                this.field2513 = this.field2531 + ((long) arg1);
            }
            if (this.field2536 != -1L && (this.field2531 < this.field2536 || (this.field2536 + ((long) this.field2514)) < this.field2531)) {
                this.method1297(-1);
            }
            if (this.field2536 != -1L && ((long) arg1 + this.field2531) > (this.field2536 + ((long) this.field2520.length))) {
                int var5 = (int) (this.field2536 + (long) this.field2520.length - this.field2531);
                class85.method683(arg3, arg0, this.field2520, (int) (this.field2531 - this.field2536), var5);
                arg1 -= var5;
                arg0 += var5;
                this.field2531 += var5;
                this.field2514 = this.field2520.length;
                this.method1297(-1);
            }
            if (arg1 > this.field2520.length) {
                if (this.field2531 != this.field2522) {
                    this.field2515.method1998(-858993460, this.field2531);
                    this.field2522 = this.field2531;
                }
                this.field2515.method2002(arg1, true, arg0, arg3);
                this.field2522 += arg1;
                if (this.field2522 > this.field2535) {
                    this.field2535 = this.field2522;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2531 >= this.field2533 && (long) this.field2517 + this.field2533 > this.field2531) {
                    var6 = this.field2531;
                } else if (this.field2531 <= this.field2533 && this.field2533 < (this.field2531 + ((long) arg1))) {
                    var6 = this.field2533;
                }
                if (this.field2531 + ((long) arg1) > this.field2533 && this.field2533 + ((long) this.field2517) >= (long) arg1 + this.field2531) {
                    var8 = (long) arg1 + this.field2531;
                } else if (this.field2531 < ((long) this.field2517 + this.field2533) && ((long) arg1 + this.field2531) >= ((long) this.field2517 + this.field2533)) {
                    var8 = (long) this.field2517 + this.field2533;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class85.method683(arg3, (int) ((long) arg0 + var6 - this.field2531), this.field2525, (int) (var6 - this.field2533), var10);
                }
                this.field2531 += arg1;
                return;
            }
            if (arg1 > 0) {
                if (this.field2536 == -1L) {
                    this.field2536 = this.field2531;
                }
                class85.method683(arg3, arg0, this.field2520, (int) (this.field2531 - this.field2536), arg1);
                this.field2531 += arg1;
                if ((this.field2531 - this.field2536) > ((long) this.field2514)) {
                    this.field2514 = (int) (this.field2531 - this.field2536);
                }
                return;
            }
        } catch (IOException var12) {
            this.field2522 = -1L;
            throw var12;
        }
        if (arg2) {
            method1292(115, -78, 57, -106);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([BI)V")
    public final void method1288(byte[] arg0, int arg1) throws IOException {
        this.method1300(arg0.length, arg1, -1, arg0);
        field2516++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
    public static final void method1289(int arg0, int arg1) {
        class704 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class339 var4 = class491.field7079[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class408.field5806; var5++) {
                    for (int var6 = 0; var6 < class439.field6264; var6++) {
                        var2 = var4.method53(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class639.field9095;
                            int var8 = var5 << class639.field9095;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class339 var10 = class491.field7079[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2087(118, var6, var5) - var10.method2087(110, var6, var5);
                                    int var12 = var4.method2087(49, var6 + 1, var5) - var10.method2087(60, var6 + 1, var5);
                                    int var13 = var4.method2087(53, var6 + 1, var5 + 1) - var10.method2087(124, var6 + 1, var5 + 1);
                                    int var14 = var4.method2087(68, var6, var5 + 1) - var10.method2087(110, var6, var5 + 1);
                                    var10.method51(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IJ)V")
    public final void method1290(int arg0, long arg1) throws IOException {
        if (arg0 < 126) {
            method1289(127, -72);
        }
        field2518++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1296((byte) -105));
        }
        this.field2531 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    private final void method1291(int arg0) throws IOException {
        this.field2517 = 0;
        field2512++;
        if (this.field2531 != this.field2522) {
            this.field2515.method1998(-858993460, this.field2531);
            this.field2522 = this.field2531;
        }
        this.field2533 = this.field2531;
        int var2 = -88 % ((-arg0 - 32) / 48);
        while (this.field2517 < this.field2525.length) {
            int var3 = this.field2525.length - this.field2517;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field2515.method2004(-20708, var3, this.field2517, this.field2525);
            if (var4 == -1) {
                break;
            }
            this.field2517 += var4;
            this.field2522 += var4;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)I")
    public static final int method1292(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            return 79;
        }
        field2530++;
        if (arg0 <= arg3) {
            return arg3 > arg2 ? arg2 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    public static void method1293(int arg0) {
        field2534 = null;
        if (arg0 != 1934) {
            method1295((byte) 83, 89);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public final void method1294(byte arg0) throws IOException {
        field2528++;
        this.method1297(-1);
        if (arg0 < -73) {
            this.field2515.method2000((byte) 33);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V")
    public static final void method1295(byte arg0, int arg1) {
        field2527++;
        if (arg0 != 0) {
            method1292(-106, 107, -51, -22);
        }
        class90.field1287 = arg1;
        class207.field3137.method2220(false);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method1296(byte arg0) {
        if (arg0 != -105) {
            this.field2535 = -52L;
        }
        field2521++;
        return this.field2515.method2001(arg0 - 23115);
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
    private final void method1297(int arg0) throws IOException {
        if (this.field2536 != -1L) {
            if (this.field2536 != this.field2522) {
                this.field2515.method1998(-858993460, this.field2536);
                this.field2522 = this.field2536;
            }
            this.field2515.method2002(this.field2514, true, 0, this.field2520);
            this.field2522 += this.field2514;
            if (this.field2522 > this.field2535) {
                this.field2535 = this.field2522;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2536 >= this.field2533 && this.field2536 < (this.field2533 + ((long) this.field2517))) {
                var2 = this.field2536;
            } else if (this.field2536 <= this.field2533 && this.field2533 < (long) this.field2514 + this.field2536) {
                var2 = this.field2533;
            }
            if ((long) this.field2514 + this.field2536 > this.field2533 && (this.field2536 + ((long) this.field2514)) <= (this.field2533 + ((long) this.field2517))) {
                var4 = (long) this.field2514 + this.field2536;
            } else if ((long) this.field2517 + this.field2533 > this.field2536 && ((long) this.field2517 + this.field2533) <= ((long) this.field2514 + this.field2536)) {
                var4 = this.field2533 + ((long) this.field2517);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class85.method683(this.field2520, (int) (var2 - this.field2536), this.field2525, (int) (var2 - this.field2533), var6);
            }
            this.field2536 = -1L;
            this.field2514 = 0;
        }
        field2529++;
        if (arg0 != -1) {
            this.method1286(-32);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
    public static final boolean method1298(boolean arg0, int arg1, String arg2, int arg3) {
        if (arg1 != 48) {
            method1292(-75, 65, -30, -128);
        }
        field2523++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)Lim;")
    public static final class624 method1299(byte arg0, int arg1) {
        if (arg0 < 75) {
            field2534 = null;
        }
        field2532++;
        class624 var2 = (class624) class398.field5694.method2216(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class548.field7958.method2600(0, 0, arg1);
        class624 var4 = new class624();
        if (var3 != null) {
            var4.method3605(new class479(var3), arg1, (byte) 117);
        }
        class398.field5694.method2213((byte) -16, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[B)V")
    public final void method1300(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2519++;
        try {
            if (arg3.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg3.length);
            }
            if ((long) arg2 != this.field2536 && this.field2536 <= this.field2531 && ((long) arg0 + this.field2531) <= (this.field2536 + ((long) this.field2514))) {
                class85.method683(this.field2520, (int) (this.field2531 - this.field2536), arg3, arg1, arg0);
                this.field2531 += arg0;
                return;
            }
            long var5 = this.field2531;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field2533 <= this.field2531 && this.field2531 < (long) this.field2517 + this.field2533) {
                int var9 = (int) ((long) this.field2517 + this.field2533 - this.field2531);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class85.method683(this.field2525, (int) (this.field2531 - this.field2533), arg3, arg1, var9);
                this.field2531 += var9;
                arg1 += var9;
                arg0 -= var9;
            }
            if (this.field2525.length < arg0) {
                this.field2515.method1998(-858993460, this.field2531);
                this.field2522 = this.field2531;
                while (arg0 > 0) {
                    int var10 = this.field2515.method2004(-20708, arg0, arg1, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2522 += var10;
                    this.field2531 += var10;
                    arg1 += var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                this.method1291(45);
                int var11 = arg0;
                if (this.field2517 < arg0) {
                    var11 = this.field2517;
                }
                class85.method683(this.field2525, 0, arg3, arg1, var11);
                this.field2531 += var11;
                arg1 += var11;
                arg0 -= var11;
            }
            if (this.field2536 != -1L) {
                if (this.field2536 > this.field2531 && arg0 > 0) {
                    int var12 = (int) (this.field2536 - this.field2531) + arg1;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (arg1 < var12) {
                        arg3[arg1++] = 0;
                        arg0--;
                        this.field2531++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2536 && this.field2536 < (long) var8 + var5) {
                    var13 = this.field2536;
                } else if (this.field2536 <= var5 && var5 < (long) this.field2514 + this.field2536) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field2536 + ((long) this.field2514) > var5 && ((long) this.field2514 + this.field2536) <= ((long) var8 + var5)) {
                    var15 = (long) this.field2514 + this.field2536;
                } else if (this.field2536 < ((long) var8 + var5) && (long) var8 + var5 <= (long) this.field2514 + this.field2536) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class85.method683(this.field2520, (int) (var13 - this.field2536), arg3, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field2531) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field2531));
                        this.field2531 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2522 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljn;II)V")
    public class183(class322 arg0, int arg1, int arg2) throws IOException {
        this.field2515 = arg0;
        this.field2513 = this.field2535 = arg0.method1996(-49);
        this.field2531 = 0L;
        this.field2520 = new byte[arg2];
        this.field2525 = new byte[arg1];
    }
}
