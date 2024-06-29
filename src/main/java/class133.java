import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class133 implements Runnable {

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "Lwd;")
    private class179 field1705 = new class179();

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public int field1708 = 0;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "Z")
    private boolean field1710 = false;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field1709;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1698 = new String[100];

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "[S")
    public static short[] field1706;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public static void method893(byte arg0) {
        int var1 = -14 / ((75 - arg0) / 42);
        field1706 = null;
        field1698 = null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)I")
    public static final int method894(int arg0, int arg1) {
        field1696++;
        if (arg1 != -4850) {
            field1698 = null;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lnda;I)V")
    private final void method895(class738 arg0, int arg1) {
        field1697++;
        class179 var3 = this.field1705;
        synchronized (this.field1705) {
            this.field1705.method1139((byte) -84, arg0);
            this.field1708++;
            this.field1705.notifyAll();
            if (arg1 != 3) {
                this.method899(119, -35, null);
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBLpn;)Lnda;")
    public final class738 method896(int arg0, byte arg1, class327 arg2) {
        field1703++;
        class738 var4 = new class738();
        var4.field10172 = arg2;
        var4.field10174 = 3;
        var4.field581 = arg0;
        var4.field8954 = false;
        this.method895(var4, 3);
        if (arg1 < 43) {
            field1698 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILpn;[B)Lnda;")
    public final class738 method897(int arg0, int arg1, class327 arg2, byte[] arg3) {
        field1704++;
        class738 var5 = new class738();
        var5.field10172 = arg2;
        var5.field10173 = arg3;
        var5.field581 = arg0;
        var5.field10174 = arg1;
        var5.field8954 = false;
        this.method895(var5, 3);
        return var5;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIII)V")
    public static final void method898(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class627.field8783 = arg0;
        int var5 = -69 % ((arg2 + 43) / 56);
        class727.field10060 = arg4;
        field1702++;
        class177.field2236 = arg1;
        class474.field6576 = arg3;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILpn;)Lnda;")
    public final class738 method899(int arg0, int arg1, class327 arg2) {
        field1699++;
        if (arg0 != -32084) {
            this.run();
        }
        class738 var4 = new class738();
        var4.field10174 = 1;
        class179 var5 = this.field1705;
        synchronized (this.field1705) {
            class738 var6 = (class738) this.field1705.method1140(-127);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field581 && var6.field10172 == arg2 && var6.field10174 == 2) {
                    var4.field8952 = false;
                    var4.field10173 = var6.field10173;
                    return var4;
                }
                var6 = (class738) this.field1705.method1138(120);
            }
        }
        var4.field10173 = arg2.method2067(true, arg1);
        var4.field8954 = true;
        var4.field8952 = false;
        return var4;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "([Lsha;IZ)V")
    public static final void method900(class115[] arg0, int arg1, boolean arg2) {
        field1701++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class115 var4 = arg0[var3];
            if (var4 != null && var4.field1436 == arg1 && !client.method788(var4)) {
                if (var4.field1564 == 0) {
                    method900(arg0, var4.field1446, arg2);
                    if (var4.field1394 != null) {
                        method900(var4.field1394, var4.field1446, arg2);
                    }
                    class610 var5 = (class610) class278.field3993.method3669(false, (long) var4.field1446);
                    if (var5 != null) {
                        class539.method3204(0, var5.field8600);
                    }
                }
                if (var4.field1564 == 6 && var4.field1411 != -1) {
                    class73 var6 = class571.field8029.method3695(var4.field1411, (byte) -117);
                    if (var6 != null) {
                        var4.field1390 += class510.field6925;
                        int var7 = var4.field1392;
                        while (var6.field817[var4.field1392] < var4.field1390) {
                            var4.field1390 -= var6.field817[var4.field1392];
                            var4.field1392++;
                            if (var6.field816.length <= var4.field1392) {
                                var4.field1392 -= var6.field805;
                                if (var4.field1392 < 0 || var4.field1392 >= var6.field816.length) {
                                    var4.field1392 = 0;
                                }
                            }
                            var4.field1554 = var4.field1392 + 1;
                            if (var4.field1554 >= var6.field816.length) {
                                var4.field1554 -= var6.field805;
                                if (var4.field1554 < 0 || var6.field816.length <= var4.field1554) {
                                    var4.field1554 = -1;
                                }
                            }
                            class43.method336(-1, var4);
                        }
                        if (var4.field1392 != var7) {
                            class704.method3976(var4.field1392, var6, 1);
                        }
                    }
                }
            }
        }
        if (arg2) {
            method894(-65, -66);
        }
    }

    @OriginalMember(owner = "client!eda", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1710) {
            class179 var1 = this.field1705;
            class738 var2;
            synchronized (this.field1705) {
                var2 = (class738) this.field1705.method1137((byte) 46);
                if (var2 == null) {
                    try {
                        this.field1705.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field1708--;
            }
            try {
                if (var2.field10174 == 2) {
                    var2.field10172.method2064(var2.field10173, -105, (int) var2.field581, var2.field10173.length);
                } else if (var2.field10174 == 3) {
                    var2.field10173 = var2.field10172.method2067(true, (int) var2.field581);
                }
            } catch (Exception var7) {
                class502.method2937(var7, (byte) -119, null);
            }
            var2.field8952 = false;
        }
        field1700++;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V")
    public final void method901(byte arg0) {
        field1707++;
        if (arg0 > -67) {
            field1706 = null;
        }
        this.field1710 = true;
        class179 var2 = this.field1705;
        synchronized (this.field1705) {
            this.field1705.notifyAll();
        }
        try {
            this.field1709.join();
        } catch (InterruptedException var3) {
        }
        this.field1709 = null;
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lvt;)V")
    public class133(class768 arg0) {
        class344 var2 = arg0.method4236(this, 5, 0);
        while (var2.field4970 == 0) {
            class730.method4066((byte) -45, 10L);
        }
        if (var2.field4970 == 2) {
            throw new RuntimeException();
        }
        this.field1709 = (Thread) var2.field4975;
    }
}
