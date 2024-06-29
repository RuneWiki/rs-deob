import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 implements Runnable {

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Lko;")
    private class348 field449 = new class348();

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field451 = new Thread(this);

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "Lao;")
    public static class188 field448 = new class188(18, 7);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Lhh;")
    public static class84 field454;

    @OriginalMember(owner = "client!wv", name = "run", descriptor = "()V")
    public final void run() {
        field452++;
        while (true) {
            class348 var1 = this.field449;
            class323 var3;
            synchronized (this.field449) {
                class439 var2;
                for (var2 = this.field449.method2254(-8); var2 == null; var2 = this.field449.method2254(-8)) {
                    try {
                        this.field449.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class323)) {
                    return;
                }
                var3 = (class323) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4958).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4956 = var5;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lti;I)V")
    public static final void method212(class303 arg0, int arg1) {
        field455++;
        int var2 = 0;
        if (arg1 != 3) {
            method212(null, -114);
        }
        while (var2 < class14.field240) {
            int var3 = arg0.method1891(false);
            int var4 = arg0.method1868(0);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class403.field5924[var3] != null) {
                class403.field5924[var3].field7819 = var4;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
    public final void method213(boolean arg0) {
        field446++;
        if (this.field451 == null) {
            return;
        }
        if (!arg0) {
            this.field451 = null;
        }
        this.method215(new class439(), arg0);
        try {
            this.field451.join();
        } catch (InterruptedException var2) {
        }
        this.field451 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static void method214(byte arg0) {
        field454 = null;
        if (arg0 != 92) {
            method212(null, -83);
        }
        field448 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Loo;Z)V")
    private final void method215(class439 arg0, boolean arg1) {
        field453++;
        class348 var3 = this.field449;
        synchronized (this.field449) {
            if (!arg1) {
                this.run();
            }
            this.field449.method2270(0, arg0);
            this.field449.notify();
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
    public class26() {
        this.field451.setDaemon(true);
        this.field451.start();
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;I)Lbg;")
    public final class323 method216(String arg0, int arg1) {
        if (arg1 != 915) {
            return null;
        }
        field450++;
        if (this.field451 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class323 var3 = new class323(arg0);
            this.method215(var3, true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIZIIIIILoe;II)Z")
    public static final boolean method217(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class133 arg9, int arg10, int arg11) {
        field447++;
        int var12 = arg4;
        int var13 = arg10;
        byte var14 = 64;
        byte var15 = 64;
        if (arg3) {
            method217(-101, -123, 8, false, 43, -1, 117, -13, -84, null, 77, 21);
        }
        int var16 = arg4 - var14;
        class54.field800[var14][var15] = 99;
        int var17 = arg10 - var15;
        class466.field6859[var14][var15] = 0;
        byte var18 = 0;
        class127.field1935[var18] = arg4;
        int var19 = 0;
        int var35 = var18 + 1;
        class185.field2760[var18] = arg10;
        int[][] var20 = arg9.field2047;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class407.field5985 = var13;
                                    class366.field5490 = var12;
                                    return false;
                                }
                                var13 = class185.field2760[var19];
                                var12 = class127.field1935[var19];
                                var21 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var12 - var16;
                                var23 = var12 - arg9.field2050;
                                var24 = var13 - arg9.field2052;
                                if (arg11 == -4) {
                                    if (arg7 == var12 && arg1 == var13) {
                                        class366.field5490 = var12;
                                        class407.field5985 = var13;
                                        return true;
                                    }
                                } else if (arg11 == -3) {
                                    if (class310.method1945(arg2, arg7, arg1, (byte) -73, arg0, var13, var12, arg8, arg2)) {
                                        class407.field5985 = var13;
                                        class366.field5490 = var12;
                                        return true;
                                    }
                                } else if (arg11 == -2) {
                                    if (arg9.method972(arg1, arg2, 126, arg8, arg7, arg0, var12, var13, arg5, arg2)) {
                                        class407.field5985 = var13;
                                        class366.field5490 = var12;
                                        return true;
                                    }
                                } else if (arg11 == -1) {
                                    if (arg9.method974(arg8, arg2, arg5, arg7, arg0, var13, 2, var12, arg1)) {
                                        class366.field5490 = var12;
                                        class407.field5985 = var13;
                                        return true;
                                    }
                                } else if (arg11 == 0 || arg11 == 1 || arg11 == 2 || arg11 == 3 || arg11 == 9) {
                                    if (arg9.method979(var12, arg2, arg7, 0, arg6, arg11, var13, arg1)) {
                                        class366.field5490 = var12;
                                        class407.field5985 = var13;
                                        return true;
                                    }
                                } else if (arg9.method971(arg6, var12, arg11, arg7, arg2, 0, arg1, var13)) {
                                    class407.field5985 = var13;
                                    class366.field5490 = var12;
                                    return true;
                                }
                                var26 = class466.field6859[var22][var21] + 1;
                                if (var22 > 0 && class54.field800[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg2 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var27) {
                                            class127.field1935[var35] = var12 - 1;
                                            class185.field2760[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class54.field800[var22 - 1][var21] = 2;
                                            class466.field6859[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < (128 - arg2) && class54.field800[var22 + 1][var21] == 0 && (var20[var23 + arg2][var24] & 0x60E40000) == 0 && (var20[arg2 + var23][arg2 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg2 - 1)) {
                                            class127.field1935[var35] = var12 + 1;
                                            class185.field2760[var35] = var13;
                                            class54.field800[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class466.field6859[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg2][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class54.field800[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 - (1 - arg2)][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg2 - 1) {
                                            class127.field1935[var35] = var12;
                                            class185.field2760[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class54.field800[var22][var21 - 1] = 1;
                                            class466.field6859[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg2) > var21 && class54.field800[var22][var21 + 1] == 0 && (var20[var23][arg2 + var24] & 0x4E240000) == 0 && (var20[arg2 + var23 - 1][var24 + arg2] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var30) {
                                            class127.field1935[var35] = var12;
                                            class185.field2760[var35] = var13 + 1;
                                            class54.field800[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class466.field6859[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg2 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class54.field800[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg2 <= var31) {
                                            class127.field1935[var35] = var12 - 1;
                                            class185.field2760[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class54.field800[var22 - 1][var21 - 1] = 3;
                                            class466.field6859[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg2 > var22 && var21 > 0 && class54.field800[var22 + 1][var21 - 1] == 0 && (var20[arg2 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg2) {
                                            class127.field1935[var35] = var12 + 1;
                                            class185.field2760[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class54.field800[var22 + 1][var21 - 1] = 9;
                                            class466.field6859[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg2 && class54.field800[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg2 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg2 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class127.field1935[var35] = var12 - 1;
                                    class185.field2760[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class54.field800[var22 - 1][var21 + 1] = 6;
                                    class466.field6859[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg2));
                        } while (var21 >= 128 - arg2);
                    } while (class54.field800[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg2 + var23][var24 + arg2] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var20[var23 + var34][arg2 + var24] & 0x7E240000) != 0 || (var20[var23 + arg2][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class127.field1935[var35] = var12 + 1;
                class185.field2760[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class54.field800[var22 + 1][var21 + 1] = 12;
                class466.field6859[var22 + 1][var21 + 1] = var26;
            }
        }
    }
}
