import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class194 implements Runnable {

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    private int field2521 = 0;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    private int field2535 = 0;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field2522;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "[B")
    private byte[] field2526;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field2524;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "[[I")
    public static int[][] field2534 = new int[6][];

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "Lnj;")
    public static class415 field2533 = new class415(28, 8);

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "Lra;")
    public static class361 field2536 = new class361(92, -2);

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Lbc;")
    public static class9 field2537 = new class9(16);

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field2525;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[B)I")
    public final int method1277(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2529++;
        if (arg1 < ~arg0 || arg2 < 0 || arg0 + arg2 > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field2521 > this.field2535) {
                var6 = this.field2535 + this.field2528 - this.field2521;
            } else {
                var6 = this.field2535 - this.field2521;
            }
            if (var6 < arg0) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field2525 != null) {
                throw new IOException(this.field2525.toString());
            }
            if (this.field2521 + arg0 <= this.field2528) {
                class443.method2514(this.field2526, this.field2521, arg3, arg2, arg0);
            } else {
                int var7 = this.field2528 - this.field2521;
                class443.method2514(this.field2526, this.field2521, arg3, arg2, var7);
                class443.method2514(this.field2526, 0, arg3, arg2 + var7, -var7 + arg0);
            }
            this.field2521 = (this.field2521 + arg0) % this.field2528;
            this.notifyAll();
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIBIIIIILwca;III)Z")
    public static final boolean method1278(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class36 arg8, int arg9, int arg10, int arg11) {
        field2531++;
        int var12 = arg3;
        int var13 = arg0;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -45 % ((-arg2 - 8) / 35);
        int var17 = arg3 - var14;
        class366.field4724[var14][var15] = 99;
        int var18 = arg0 - var15;
        class649.field9041[var14][var15] = 0;
        byte var19 = 0;
        class191.field2440[var19] = arg3;
        int var20 = 0;
        int var36 = var19 + 1;
        class181.field2231[var19] = arg0;
        int[][] var21 = arg8.field530;
        while (true) {
            label282: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var27;
                do {
                    do {
                        do {
                            label259: do {
                                if (var36 == var20) {
                                    class289.field3734 = var13;
                                    class354.field4560 = var12;
                                    return false;
                                }
                                var12 = class191.field2440[var20];
                                var13 = class181.field2231[var20];
                                var22 = var12 - var17;
                                var23 = var13 - var18;
                                var20 = var20 + 1 & 0xFFF;
                                var24 = var12 - arg8.field523;
                                var25 = var13 - arg8.field519;
                                if (arg4 == -4) {
                                    if (arg5 == var12 && arg10 == var13) {
                                        class289.field3734 = var13;
                                        class354.field4560 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -3) {
                                    if (class663.method3632(var13, (byte) 117, arg9, arg9, var12, arg11, arg5, arg6, arg10)) {
                                        class289.field3734 = var13;
                                        class354.field4560 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -2) {
                                    if (arg8.method298(115, arg5, arg6, arg9, var12, var13, arg10, arg1, arg11, arg9)) {
                                        class289.field3734 = var13;
                                        class354.field4560 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -1) {
                                    if (arg8.method291(0, arg5, arg11, var13, arg6, arg10, var12, arg1, arg9)) {
                                        class354.field4560 = var12;
                                        class289.field3734 = var13;
                                        return true;
                                    }
                                } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                                    if (arg8.method295(arg5, (byte) 106, arg9, arg4, arg7, arg10, var12, var13)) {
                                        class289.field3734 = var13;
                                        class354.field4560 = var12;
                                        return true;
                                    }
                                } else if (arg8.method293(var13, arg9, arg10, arg5, arg7, arg4, var12, (byte) 97)) {
                                    class354.field4560 = var12;
                                    class289.field3734 = var13;
                                    return true;
                                }
                                var27 = class649.field9041[var22][var23] + 1;
                                if (var22 > 0 && class366.field4724[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x43A40000) == 0 && (var21[var24 - 1][arg9 + var25 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg9 - 1)) {
                                            class191.field2440[var36] = var12 - 1;
                                            class181.field2231[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class366.field4724[var22 - 1][var23] = 2;
                                            class649.field9041[var22 - 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if ((128 - arg9) > var22 && class366.field4724[var22 + 1][var23] == 0 && (var21[var24 + arg9][var25] & 0x60E40000) == 0 && (var21[var24 + arg9][arg9 + var25 - 1] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg9 - 1) {
                                            class191.field2440[var36] = var12 + 1;
                                            class181.field2231[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class366.field4724[var22 + 1][var23] = 8;
                                            class649.field9041[var22 + 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + arg9][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var23 > 0 && class366.field4724[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x43A40000) == 0 && (var21[arg9 + var24 - 1][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg9 - 1) {
                                            class191.field2440[var36] = var12;
                                            class181.field2231[var36] = var13 - 1;
                                            class366.field4724[var22][var23 - 1] = 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class649.field9041[var22][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var23 < 128 - arg9 && class366.field4724[var22][var23 + 1] == 0 && (var21[var24][arg9 + var25] & 0x4E240000) == 0 && (var21[arg9 + var24 - 1][arg9 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var31) {
                                            class191.field2440[var36] = var12;
                                            class181.field2231[var36] = var13 + 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class366.field4724[var22][var23 + 1] = 4;
                                            class649.field9041[var22][var23 + 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var31][var25 + arg9] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 > 0 && var23 > 0 && class366.field4724[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg9) {
                                            class191.field2440[var36] = var12 - 1;
                                            class181.field2231[var36] = var13 - 1;
                                            class366.field4724[var22 - 1][var23 - 1] = 3;
                                            var36 = var36 + 1 & 0xFFF;
                                            class649.field9041[var22 - 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var32 + var25 - 1] & 0x4FA40000) != 0 || (var21[var24 + var32 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if ((128 - arg9) > var22 && var23 > 0 && class366.field4724[var22 + 1][var23 - 1] == 0 && (var21[arg9 + var24][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (arg9 <= var33) {
                                            class191.field2440[var36] = var12 + 1;
                                            class181.field2231[var36] = var13 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class366.field4724[var22 + 1][var23 - 1] = 9;
                                            class649.field9041[var22 + 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[arg9 + var24][var25 + var33 - 1] & 0x78E40000) != 0 || (var21[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var22 > 0 && 128 - arg9 > var23 && class366.field4724[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][arg9 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg9; var34++) {
                                        if ((var21[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var21[var24 + var34 - 1][var25 + arg9] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class191.field2440[var36] = var12 - 1;
                                    class181.field2231[var36] = var13 + 1;
                                    class366.field4724[var22 - 1][var23 + 1] = 6;
                                    var36 = var36 + 1 & 0xFFF;
                                    class649.field9041[var22 - 1][var23 + 1] = var27;
                                }
                            } while (var22 >= (128 - arg9));
                        } while (var23 >= (128 - arg9));
                    } while (class366.field4724[var22 + 1][var23 + 1] != 0);
                } while ((var21[arg9 + var24][arg9 + var25] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg9; var35++) {
                    if ((var21[var24 + var35][arg9 + var25] & 0x7E240000) != 0 || (var21[arg9 + var24][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class191.field2440[var36] = var12 + 1;
                class181.field2231[var36] = var13 + 1;
                class366.field4724[var22 + 1][var23 + 1] = 12;
                var36 = var36 + 1 & 0xFFF;
                class649.field9041[var22 + 1][var23 + 1] = var27;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method1279(byte arg0) {
        synchronized (this) {
            if (this.field2525 == null) {
                this.field2525 = new IOException("");
            }
            this.notifyAll();
        }
        field2532++;
        try {
            this.field2524.join();
            if (arg0 < 33) {
                field2538 = 5;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)Z")
    public final boolean method1280(byte arg0, int arg1) throws IOException {
        field2530++;
        if (arg1 <= 0 || this.field2528 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg0 > -65) {
                return false;
            }
            int var5;
            if (this.field2535 < this.field2521) {
                var5 = this.field2535 + this.field2528 - this.field2521;
            } else {
                var5 = this.field2535 - this.field2521;
            }
            if (arg1 <= var5) {
                return true;
            } else if (this.field2525 == null) {
                return false;
            } else {
                throw new IOException(this.field2525.toString());
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "run", descriptor = "()V")
    public final void run() {
        field2520++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2525 != null) {
                        return;
                    }
                    if (this.field2521 == 0) {
                        var2 = this.field2528 - this.field2535 - 1;
                    } else if (this.field2535 > this.field2521) {
                        var2 = this.field2528 - this.field2535;
                    } else {
                        var2 = this.field2521 - this.field2535 - 1;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field2522.read(this.field2526, this.field2535, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2525 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2535 = (this.field2535 + var3) % this.field2528;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
    public static void method1281(byte arg0) {
        field2533 = null;
        if (arg0 > 12) {
            field2537 = null;
            field2534 = null;
            field2536 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
    public final void method1282(byte arg0) {
        field2523++;
        this.field2522 = new class487();
        if (arg0 > -30) {
            this.field2524 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class194(InputStream arg0, int arg1) {
        this.field2522 = arg0;
        this.field2528 = arg1 + 1;
        this.field2526 = new byte[this.field2528];
        this.field2524 = new Thread(this);
        this.field2524.setDaemon(true);
        this.field2524.start();
    }
}
