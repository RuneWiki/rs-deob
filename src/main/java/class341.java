import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class341 implements Runnable {

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lvm;")
    private class589 field4717 = new class589();

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field4726 = 0;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Z")
    private boolean field4725 = false;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field4724;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[Lfe;")
    public static class490[] field4709 = new class490[32];

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lmo;")
    public static class638 field4715 = new class638();

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lcc;")
    public static class624 field4716;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final void method2085(int arg0) {
        field4720++;
        if (arg0 < 113) {
            return;
        }
        this.field4725 = true;
        class589 var2 = this.field4717;
        synchronized (this.field4717) {
            this.field4717.notifyAll();
        }
        try {
            this.field4724.join();
        } catch (InterruptedException var3) {
        }
        this.field4724 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BLcw;BI)Llj;")
    public final class523 method2086(byte[] arg0, class157 arg1, byte arg2, int arg3) {
        field4711++;
        class523 var5 = new class523();
        var5.field3179 = false;
        var5.field7476 = 2;
        var5.field7478 = arg1;
        var5.field7480 = arg0;
        var5.field7109 = arg3;
        if (arg2 != -37) {
            method2091(-1, 88, 24, (byte) -63);
        }
        this.method2087(var5, 69);
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Llj;I)V")
    private final void method2087(class523 arg0, int arg1) {
        field4714++;
        class589 var3 = this.field4717;
        synchronized (this.field4717) {
            this.field4717.method3500(arg0, false);
            this.field4726++;
            this.field4717.notifyAll();
            if (arg1 < 44) {
                field4712 = 56;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static void method2088(int arg0) {
        field4716 = null;
        if (arg0 < -33) {
            field4715 = null;
            field4709 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lcw;II)Llj;")
    public final class523 method2089(class157 arg0, int arg1, int arg2) {
        field4713++;
        class523 var4 = new class523();
        var4.field7476 = arg2;
        class589 var5 = this.field4717;
        synchronized (this.field4717) {
            class523 var6 = (class523) this.field4717.method3505(-31);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field7109 && var6.field7478 == arg0 && var6.field7476 == 2) {
                    var4.field3178 = false;
                    var4.field7480 = var6.field7480;
                    return var4;
                }
                var6 = (class523) this.field4717.method3501((byte) 33);
            }
        }
        var4.field7480 = arg0.method1133(-68, arg1);
        var4.field3178 = false;
        var4.field3179 = true;
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V")
    public static final void method2090(int arg0, boolean arg1) {
        class427.field5745 = arg0;
        field4719++;
        class470.field6631 = 0;
        class82.method630(true);
        class115.method827(15141, arg1);
        class246.method1557(-1);
        boolean var2 = false;
        for (int var3 = 0; var3 < class470.field6631; var3++) {
            int var5 = class471.field6662[var3];
            class505 var6 = (class505) class510.field7260.method2799((long) var5, true);
            class571 var7 = var6.field7148;
            if (class446.field6245 && class402.method2365(var5, ~arg0)) {
                class157.method1128((byte) -116);
            }
            if (class617.field9123 != var7.field1897) {
                if (var7.field8405.method650(128)) {
                    class396.method2353(var7, 1840068472);
                }
                var7.method3405(null, 44);
                var6.method2457(-8422);
                var2 = true;
            }
        }
        if (var2) {
            class599.field8840 = class510.field7260.method2803(arg0);
            class510.field7260.method2804(false, class57.field718);
        }
        if (class333.field4615 != class632.field9278.field2177) {
            throw new RuntimeException("gnp1 pos:" + class632.field9278.field2177 + " psize:" + class333.field4615);
        }
        for (int var4 = 0; var4 < class527.field7717; var4++) {
            if (class510.field7260.method2799((long) class634.field9290[var4], true) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class527.field7717);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIB)V")
    public static final void method2091(int arg0, int arg1, int arg2, byte arg3) {
        if (arg0 == 1007) {
            class98.method755(class197.field2905, arg2, arg1);
        } else if (arg0 == 1008) {
            class98.method755(class6.field56, arg2, arg1);
        } else if (arg0 == 1010) {
            class98.method755(class457.field6455, arg2, arg1);
        } else if (arg0 == 1003) {
            class98.method755(class170.field2653, arg2, arg1);
        } else if (arg0 == 1004) {
            class98.method755(class39.field469, arg2, arg1);
        }
        if (arg3 != 52) {
            method2090(-12, true);
        }
        field4722++;
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field4725) {
            class589 var1 = this.field4717;
            class523 var2;
            synchronized (this.field4717) {
                var2 = (class523) this.field4717.method3506(0);
                if (var2 == null) {
                    try {
                        this.field4717.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4726--;
            }
            try {
                if (var2.field7476 == 2) {
                    var2.field7478.method1130((int) var2.field7109, var2.field7480.length, var2.field7480, 16035);
                } else if (var2.field7476 == 3) {
                    var2.field7480 = var2.field7478.method1133(-124, (int) var2.field7109);
                }
            } catch (Exception var6) {
                class378.method2255(var6, null, 89);
            }
            var2.field3178 = false;
        }
        field4721++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method2092(int arg0, int arg1, byte arg2) {
        field4723++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else {
            int var4 = -16 % ((6 - arg2) / 40);
            if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILcw;B)Llj;")
    public final class523 method2093(int arg0, class157 arg1, byte arg2) {
        field4710++;
        class523 var4 = new class523();
        var4.field3179 = false;
        var4.field7109 = arg0;
        var4.field7478 = arg1;
        var4.field7476 = 3;
        if (arg2 <= 109) {
            this.method2093(94, null, (byte) -11);
        }
        this.method2087(var4, 72);
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Llp;)V")
    public class341(class331 arg0) {
        class21 var2 = arg0.method2004(1406, 5, this);
        while (var2.field202 == 0) {
            class236.method1513(true, 10L);
        }
        if (var2.field202 == 2) {
            throw new RuntimeException();
        }
        this.field4724 = (Thread) var2.field201;
    }
}
