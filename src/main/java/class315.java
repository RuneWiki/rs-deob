import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class315 implements Runnable {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lhv;")
    private class474 field4098 = new class474();

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Z")
    private boolean field4104 = false;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field4103 = 0;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field4105;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljo;")
    public static class303 field4096;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lqn;II)Lwh;")
    public final class134 method1777(class59 arg0, int arg1, int arg2) {
        field4099++;
        class134 var4 = new class134();
        var4.field1508 = 1;
        class474 var5 = this.field4098;
        synchronized (this.field4098) {
            if (arg2 <= 97) {
                method1779(null, false, -55);
            }
            class134 var6 = (class134) this.field4098.method2769(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field4676 && var6.field1512 == arg0 && var6.field1508 == 2) {
                    var4.field8252 = false;
                    var4.field1513 = var6.field1513;
                    return var4;
                }
                var6 = (class134) this.field4098.method2763(-23638);
            }
        }
        var4.field1513 = arg0.method399(arg1, (byte) 102);
        var4.field8250 = true;
        var4.field8252 = false;
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method1778(byte arg0) {
        field4093++;
        this.field4104 = true;
        class474 var2 = this.field4098;
        synchronized (this.field4098) {
            this.field4098.notifyAll();
        }
        try {
            this.field4105.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != -2) {
            method1781(true);
        }
        this.field4105 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpi;ZI)V")
    public static final void method1779(class455 arg0, boolean arg1, int arg2) {
        field4101++;
        if (class145.field1625 >= 400) {
            return;
        }
        if (class377.field4914 != arg0) {
            String var9;
            if (arg0.field6337 == 0) {
                boolean var3 = true;
                if (class377.field4914.field6323 != -1 && arg0.field6323 != -1) {
                    int var4 = class377.field4914.field6322 <= arg0.field6322 ? arg0.field6322 : class377.field4914.field6322;
                    int var5 = arg0.field6323 <= class377.field4914.field6323 ? arg0.field6323 : class377.field4914.field6323;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class377.field4914.field6322 - arg0.field6322;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class343.field4453 == class220.field2668 ? class221.field2749.method1296(class226.field2899, (byte) 100) : class221.field2747.method1296(class226.field2899, (byte) -109);
                if (arg0.field6322 >= arg0.field6308) {
                    var9 = arg0.method2582(true, 0) + (var3 ? class176.method1026(class377.field4914.field6322, arg0.field6322, (byte) 118) : "<col=ffffff>") + " (" + var8 + arg0.field6322 + ")";
                } else {
                    var9 = arg0.method2582(true, 0) + (var3 ? class176.method1026(class377.field4914.field6322, arg0.field6322, (byte) -35) : "<col=ffffff>") + " (" + var8 + arg0.field6322 + "+" + (arg0.field6308 - arg0.field6322) + ")";
                }
            } else if (arg0.field6337 == -1) {
                var9 = arg0.method2582(true, 0);
            } else {
                var9 = arg0.method2582(true, 0) + " (" + class221.field2748.method1296(class226.field2899, (byte) -99) + arg0.field6337 + ")";
            }
            if (class477.field6938 && !arg1 && (class406.field5414 & 0x8) != 0) {
                class316.field4110++;
                class459.method2618(false, 500, -1, class182.field2231 + " -> <col=ffffff>" + var9, 0, true, 0, (long) arg0.field3784, class419.field5567, 4, class122.field1376);
            }
            if (arg1) {
                class459.method2618(true, 500, 0, "", 0, false, 0, 0L, "<col=cccccc>" + var9, -1, -1);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class535.field7650[var10] != null) {
                        short var13 = 0;
                        if (class393.field5239 == class220.field2668 && class535.field7650[var10].equalsIgnoreCase(class221.field2742.method1296(class226.field2899, (byte) -96))) {
                            if (arg0.field6322 > class377.field4914.field6322) {
                                var13 = 2000;
                            }
                            if (class377.field4914.field6340 != 0 && arg0.field6340 != 0) {
                                if (class377.field4914.field6340 == arg0.field6340) {
                                    var13 = 2000;
                                } else {
                                    var13 = 0;
                                }
                            }
                        } else if (class359.field4708[var10]) {
                            var13 = 2000;
                        }
                        short var14 = (short) (class308.field4006[var10] + var13);
                        int var15 = class181.field2220[var10] == -1 ? class421.field5604 : class181.field2220[var10];
                        class459.method2618(false, 500, -1, "<col=ffffff>" + var9, 0, true, 0, (long) arg0.field3784, class535.field7650[var10], var14, var15);
                        class136.field1554++;
                    }
                }
            }
            if (!arg1) {
                for (class208 var11 = (class208) class530.field7597.method3174((byte) 49); var11 != null; var11 = (class208) class530.field7597.method3168(false)) {
                    if (var11.field2527 == 9) {
                        var11.field2525 = "<col=ffffff>" + var9;
                        break;
                    }
                }
            }
            int var12 = 82 / ((arg2 - 71) / 46);
        } else if (class477.field6938 && (class406.field5414 & 0x10) != 0) {
            class459.method2618(false, 500, -1, class182.field2231 + " -> <col=ffffff>" + class221.field2756.method1296(class226.field2899, (byte) 86), 0, true, 0, 0L, class419.field5567, 49, class122.field1376);
            class255.field3255++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
    public final void run() {
        field4100++;
        while (!this.field4104) {
            class474 var1 = this.field4098;
            class134 var2;
            synchronized (this.field4098) {
                var2 = (class134) this.field4098.method2766((byte) 82);
                if (var2 == null) {
                    try {
                        this.field4098.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4103--;
            }
            try {
                if (var2.field1508 == 2) {
                    var2.field1512.method396(var2.field1513.length, (int) var2.field4676, var2.field1513, 0);
                } else if (var2.field1508 == 3) {
                    var2.field1513 = var2.field1512.method399((int) var2.field4676, (byte) 104);
                }
            } catch (Exception var6) {
                class150.method824(15, var6, null);
            }
            var2.field8252 = false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lqn;IB)Lwh;")
    public final class134 method1780(class59 arg0, int arg1, byte arg2) {
        field4106++;
        class134 var4 = new class134();
        var4.field1508 = 3;
        var4.field8250 = false;
        int var5 = -58 % ((arg2 - 28) / 47);
        var4.field1512 = arg0;
        var4.field4676 = arg1;
        this.method1786(var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static final void method1781(boolean arg0) {
        for (class282 var1 = (class282) class144.field1618.method3174((byte) 49); var1 != null; var1 = (class282) class144.field1618.method3168(false)) {
            if (var1.field3579) {
                var1.method1613(true);
            }
        }
        field4097++;
        if (!arg0) {
            field4096 = null;
        }
        for (class282 var2 = (class282) class390.field5211.method3174((byte) 49); var2 != null; var2 = (class282) class390.field5211.method3168(false)) {
            if (var2.field3579) {
                var2.method1613(true);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[BLqn;I)Lwh;")
    public final class134 method1782(byte arg0, byte[] arg1, class59 arg2, int arg3) {
        field4095++;
        class134 var5 = new class134();
        var5.field1512 = arg2;
        var5.field8250 = false;
        var5.field4676 = arg3;
        if (arg0 == 8) {
            var5.field1508 = 2;
            var5.field1513 = arg1;
            this.method1786(var5, 0);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method1783(byte arg0) {
        if (arg0 == -87) {
            field4096 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
    public static final boolean method1784(int arg0, int arg1) {
        field4102++;
        if (class485.field7070[arg0]) {
            return true;
        } else if (class238.field3009.method1730((byte) 124, arg0)) {
            if (arg1 != 4269) {
                method1781(false);
            }
            int var2 = class238.field3009.method1727(-77, arg0);
            if (var2 == 0) {
                class485.field7070[arg0] = true;
                return true;
            }
            if (class271.field3434[arg0] == null) {
                class271.field3434[arg0] = new class382[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class271.field3434[arg0][var3] == null) {
                    byte[] var4 = class238.field3009.method1719(var3, arg0, 4);
                    if (var4 != null) {
                        class382 var5 = class271.field3434[arg0][var3] = new class382();
                        var5.field5055 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2103(new class452(var4), (byte) -106);
                    }
                }
            }
            class485.field7070[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILiaa;)V")
    public static final void method1785(int arg0, class452 arg1) {
        field4107++;
        byte[] var2 = new byte[24];
        if (class566.field8020 != null) {
            try {
                class566.field8020.method2985(0L, -124);
                class566.field8020.method2983(var2, arg0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2514(24, var2, -27824, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lpe;)V")
    public class315(class556 arg0) {
        class199 var2 = arg0.method3138(this, -125, 5);
        while (var2.field2437 == 0) {
            class370.method2025(-1, 10L);
        }
        if (var2.field2437 == 2) {
            throw new RuntimeException();
        }
        this.field4105 = (Thread) var2.field2434;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lwh;I)V")
    private final void method1786(class134 arg0, int arg1) {
        class474 var3 = this.field4098;
        synchronized (this.field4098) {
            this.field4098.method2765(arg1, arg0);
            this.field4103++;
            this.field4098.notifyAll();
        }
        field4094++;
    }
}
