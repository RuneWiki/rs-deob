import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class202 implements Runnable {

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lha;")
    private class194 field3503 = new class194();

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Z")
    private boolean field3508 = false;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public int field3509 = 0;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field3510;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lf;")
    public static class121 field3492 = new class121(5000);

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field3498 = 0;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Loh;")
    private static class258 field3497 = class153.method1046("green:", 92);

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Loh;")
    public static class258 field3494 = field3497;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "Loh;")
    public static class258 field3499 = field3497;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[[[I")
    public static int[][][] field3502;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 4)
    public final void method1338(byte arg0) {
        this.field3508 = true;
        field3495++;
        class194 var2 = this.field3503;
        synchronized (this.field3503) {
            this.field3503.notifyAll();
        }
        try {
            if (arg0 < 82) {
                this.run();
            }
            this.field3510.join();
        } catch (InterruptedException var5) {
        }
        this.field3510 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lhh;II)Ltg;", line = 33)
    public final class155 method1339(class80 arg0, int arg1, int arg2) {
        field3506++;
        class155 var4 = new class155();
        var4.field2656 = 1;
        class194 var5 = this.field3503;
        synchronized (this.field3503) {
            class155 var6 = (class155) this.field3503.method1308((byte) -100);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field3397 && var6.field2650 == arg0 && var6.field2656 == 2) {
                    var4.field2648 = var6.field2648;
                    var4.field4208 = false;
                    return var4;
                }
                var6 = (class155) this.field3503.method1309((byte) -121);
            }
        }
        var4.field2648 = arg0.method576(arg1, arg2);
        var4.field4219 = true;
        var4.field4208 = false;
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 70)
    public static void method1340(boolean arg0) {
        field3499 = null;
        field3494 = null;
        field3492 = null;
        field3497 = null;
        field3502 = (int[][][]) null;
        if (!arg0) {
            method1344(-58, false, 56);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIII[Led;II[BIII)V", line = 85)
    public static final void method1341(boolean arg0, int arg1, int arg2, int arg3, class245[] arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        class235 var11 = new class235(arg7);
        field3496++;
        int var12 = -1;
        if (arg10 != 7) {
            return;
        }
        while (true) {
            int var13 = var11.method1600(32767);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1613((byte) 109);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var11.method1589(67);
                int var19 = (var14 & 0xFDE) >> 6;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg9 == var17 && arg1 <= var19 && var19 < arg1 + 8 && arg8 <= var16 && var16 < (arg8 + 8)) {
                    class101 var22 = class123.method898(arg10 - 942, var12);
                    int var23 = class185.method1252(var16 & 0x7, 25919, var22.field1839, var19 & 0x7, var22.field1790, arg5, var21) + arg3;
                    int var24 = class252.method1712(arg5, var21, var22.field1790, var16 & 0x7, var19 & 0x7, var22.field1839, (byte) 41) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class245 var25 = null;
                        if (!arg0) {
                            int var26 = arg2;
                            if ((class94.field1653[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg4[var26];
                            }
                        }
                        class284.method1995(var25, var20, var23, arg5 + var21 & 0x3, var12, arg2, arg0, var24, arg2, !arg0, (byte) -126);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILgb;Lgb;)V", line = 166)
    public static final void method1342(int arg0, class213 arg1, class213 arg2) {
        class71.field1232 = arg2;
        field3504++;
        class256.field4388 = arg1;
        if (arg0 != -4136990) {
            method1340(false);
        }
    }

    @OriginalMember(owner = "client!sk", name = "run", descriptor = "()V", line = 179)
    public final void run() {
        field3507++;
        while (!this.field3508) {
            class194 var1 = this.field3503;
            class155 var2;
            synchronized (this.field3503) {
                var2 = (class155) this.field3503.method1304(10);
                if (var2 == null) {
                    try {
                        this.field3503.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3509--;
            }
            try {
                if (var2.field2656 == 2) {
                    var2.field2650.method577(var2.field2648, 123, (int) var2.field3397, var2.field2648.length);
                } else if (var2.field2656 == 3) {
                    var2.field2648 = var2.field2650.method576(2, (int) var2.field3397);
                }
            } catch (Exception var6) {
                class107.method796(var6, (byte) 104, (String) null);
            }
            var2.field4208 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLhh;I)Ltg;", line = 230)
    public final class155 method1343(byte arg0, class80 arg1, int arg2) {
        field3491++;
        if (arg0 != 2) {
            this.method1338((byte) -3);
        }
        class155 var4 = new class155();
        var4.field2650 = arg1;
        var4.field3397 = (long) arg2;
        var4.field2656 = 3;
        var4.field4219 = false;
        this.method1345(arg0 ^ 0xA, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZI)Z", line = 253)
    public static final boolean method1344(int arg0, boolean arg1, int arg2) {
        field3493++;
        if (!arg1) {
            method1341(false, -116, 14, -54, (class245[]) null, -103, 14, (byte[]) null, 17, -82, -79);
        }
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILtg;)V", line = 267)
    private final void method1345(int arg0, class155 arg1) {
        class194 var3 = this.field3503;
        synchronized (this.field3503) {
            this.field3503.method1305(arg1, arg0 ^ arg0);
            this.field3509++;
            this.field3503.notifyAll();
        }
        field3500++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lhh;IB[B)Ltg;", line = 279)
    public final class155 method1346(class80 arg0, int arg1, byte arg2, byte[] arg3) {
        field3505++;
        class155 var5 = new class155();
        var5.field3397 = (long) arg1;
        var5.field4219 = false;
        var5.field2656 = 2;
        if (arg2 <= 16) {
            field3494 = (class258) null;
        }
        var5.field2648 = arg3;
        var5.field2650 = arg0;
        this.method1345(8, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 343)
    public class202() {
        class116 var1 = class297.field5086.method2070(5, this, -102);
        while (var1.field2067 == 0) {
            class237.method1628((byte) -88, 10L);
        }
        if (var1.field2067 == 2) {
            throw new RuntimeException();
        }
        this.field3510 = (Thread) var1.field2063;
    }
}
