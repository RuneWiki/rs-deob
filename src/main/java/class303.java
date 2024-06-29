import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class303 implements Runnable {

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "Loa;")
    private class157 field4518 = new class157();

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public int field4520 = 0;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Z")
    private boolean field4521 = false;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field4519;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "S")
    public static short field4508 = 320;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "S")
    public static short field4513 = 1;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field4512 = -1;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field4506 = 0;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Lsh;")
    public static class472 field4511 = new class472(25, -1);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 3)
    public final void method1885(byte arg0) {
        this.field4521 = true;
        field4507++;
        class157 var2 = this.field4518;
        synchronized (this.field4518) {
            this.field4518.notifyAll();
        }
        try {
            if (arg0 <= 59) {
                return;
            }
            this.field4519.join();
        } catch (InterruptedException var3) {
        }
        this.field4519 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILje;Lje;)V", line = 24)
    public static final void method1886(int arg0, class178 arg1, class178 arg2) {
        field4505++;
        class351.field5357++;
        class378.method2320(class100.field1421, (byte) 119);
        if (arg0 != -3) {
            method1893((class63) null, 18, -6, (class315) null, -35, 126, -20, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 55, (byte) 104, -123, -89, false);
        }
        class230.field3390.method2596((byte) 107, arg1.field2631);
        class230.field3390.method2593(-86, arg2.field2605);
        class230.field3390.method2624((byte) -3, arg2.field2534);
        class230.field3390.method2580(0, arg1.field2534);
        class230.field3390.method2596((byte) -35, arg2.field2631);
        class230.field3390.method2580(0, arg1.field2605);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method1887(boolean arg0) {
        if (arg0) {
            class170.field2427 = class475.field6650;
            class479.field6745 = class55.field765;
        } else {
            class170.field2427 = class138.field1990;
            class479.field6745 = class483.field6781;
        }
        class344.field5192 = class170.field2427.length;
    }

    @OriginalMember(owner = "client!wo", name = "run", descriptor = "()V", line = 60)
    public final void run() {
        while (!this.field4521) {
            class157 var1 = this.field4518;
            class14 var2;
            synchronized (this.field4518) {
                var2 = (class14) this.field4518.method1069((byte) 89);
                if (var2 == null) {
                    try {
                        this.field4518.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field4520--;
            }
            try {
                if (var2.field202 == 2) {
                    var2.field204.method1882((int) var2.field1255, var2.field205, false, var2.field205.length);
                } else if (var2.field202 == 3) {
                    var2.field205 = var2.field204.method1879(false, (int) var2.field1255);
                }
            } catch (Exception var7) {
                class416.method2475(false, var7, (String) null);
            }
            var2.field5386 = false;
        }
        field4504++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILwt;)V", line = 104)
    private final void method1888(int arg0, class14 arg1) {
        field4516++;
        class157 var3 = this.field4518;
        synchronized (this.field4518) {
            this.field4518.method1075((byte) -82, arg1);
            this.field4520++;
            this.field4518.notifyAll();
            if (arg0 >= -85) {
                this.field4519 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[BLce;I)Lwt;", line = 120)
    public final class14 method1889(int arg0, byte[] arg1, class302 arg2, int arg3) {
        field4509++;
        class14 var5 = new class14();
        var5.field5387 = false;
        var5.field202 = 2;
        var5.field204 = arg2;
        var5.field205 = arg1;
        var5.field1255 = (long) arg3;
        int var6 = 3 % ((arg0 - 71) / 42);
        this.method1888(-99, var5);
        return var5;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lce;II)Lwt;", line = 139)
    public final class14 method1890(class302 arg0, int arg1, int arg2) {
        field4515++;
        class14 var4 = new class14();
        var4.field5387 = false;
        var4.field204 = arg0;
        if (arg1 != 0) {
            this.method1892(-69, (class302) null, 91);
        }
        var4.field202 = 3;
        var4.field1255 = (long) arg2;
        this.method1888(-118, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)V", line = 170)
    public static void method1891(boolean arg0) {
        field4511 = null;
        if (!arg0) {
            field4511 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILce;I)Lwt;", line = 180)
    public final class14 method1892(int arg0, class302 arg1, int arg2) {
        field4514++;
        class14 var4 = new class14();
        var4.field202 = 1;
        class157 var5 = this.field4518;
        synchronized (this.field4518) {
            if (arg2 != 1) {
                this.method1885((byte) -34);
            }
            class14 var6 = (class14) this.field4518.method1070((byte) -38);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field1255 && var6.field204 == arg1 && var6.field202 == 2) {
                    var4.field205 = var6.field205;
                    var4.field5386 = false;
                    return var4;
                }
                var6 = (class14) this.field4518.method1073(118);
            }
        }
        var4.field205 = arg1.method1879(false, arg0);
        var4.field5387 = true;
        var4.field5386 = false;
        return var4;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ltq;IILmu;III[[[B[I[I[I[I[IIBIIZ)V", line = 230)
    public static final void method1893(class63 arg0, int arg1, int arg2, class315 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class432.field6150 = arg0;
        class492.field6919 = arg1;
        class163.field2269 = arg3;
        class252.field3628 = class432.field6150.method524() > 0;
        class307.field4577 = arg4 >> class426.field6091;
        class386.field5702 = arg6 >> class426.field6091;
        class100.field1420 = arg4;
        class208.field3132 = arg6;
        class400.field5855 = arg5;
        class473.field6635 = class307.field4577 - class281.field4243;
        if (class473.field6635 < 0) {
            class145.field2049 = -class473.field6635;
            class473.field6635 = 0;
        } else {
            class145.field2049 = 0;
        }
        class314.field4723 = class386.field5702 - class281.field4243;
        if (class314.field4723 < 0) {
            class27.field360 = -class314.field4723;
            class314.field4723 = 0;
        } else {
            class27.field360 = 0;
        }
        class121.field1671 = class307.field4577 + class281.field4243;
        if (class121.field1671 > class412.field5957) {
            class121.field1671 = class412.field5957;
        }
        class385.field5698 = class386.field5702 + class281.field4243;
        if (class385.field5698 > class315.field4743) {
            class385.field5698 = class315.field4743;
        }
        for (int var18 = 0; var18 < class281.field4243 + class281.field4243 + 2; var18++) {
            for (int var23 = 0; var23 < class281.field4243 + class281.field4243 + 2; var23++) {
                int var24 = class307.field4577 + var18 - class281.field4243;
                int var25 = class386.field5702 + var23 - class281.field4243;
                if (var24 >= 0 && var25 >= 0 && var24 < class412.field5957 && var25 < class315.field4743) {
                    int var26 = var24 << class426.field6091;
                    int var27 = var25 << class426.field6091;
                    int var28 = class483.field6781[class483.field6781.length - 1].method199(var24, var25) - 1000;
                    int var29 = class55.field765 == null ? class483.field6781[0].method199(var24, var25) + class75.field1055 : class55.field765[0].method199(var24, var25) + class75.field1055;
                    class10.field155[var18][var23] = class432.field6150.method567(var26, var28, var27, var26, var29, var27);
                } else {
                    class10.field155[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class281.field4243 + class281.field4243 + 1; var19++) {
            for (int var22 = 0; var22 < class281.field4243 + class281.field4243 + 1; var22++) {
                class206.field3116[var19][var22] = class10.field155[var19][var22] || class10.field155[var19 + 1][var22] || class10.field155[var19][var22 + 1] || class10.field155[var19 + 1][var22 + 1];
            }
        }
        class351.field5355 = arg8;
        class456.field6482 = arg9;
        class144.field2043 = arg10;
        class422.field6047 = arg11;
        class65.field902 = arg12;
        class255.method1686();
        class423.method2497((byte) 98);
        for (class123 var20 = (class123) class453.field6428.method1594(16); var20 != null; var20 = (class123) class453.field6428.method1596(true)) {
            var20.method1847(true);
            class123.method864(var20, (byte) -98);
        }
        if (class252.field3628) {
            for (int var21 = 0; var21 < class363.field5511; var21++) {
                class78.field1108[var21].method1424(arg1, (byte) 71, arg17);
            }
        }
        if (arg2 > 1) {
            class432.field6150.method532(0);
            if (class44.field632 == null || class44.field632 instanceof class8) {
                class44.field632 = new class390();
            }
        } else if (class44.field632 == null || class44.field632 instanceof class390) {
            class44.field632 = new class8();
        }
        class44.field632.method98(20923, arg2);
        class44.field632.method93(102);
        if (class475.field6650 != null) {
            method1887(true);
            class44.field632.method99(22, (byte) 102);
            class227.method1476(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class44.field632.method93(75);
            class44.field632.method99(23, (byte) 94);
            method1887(false);
        }
        class227.method1476(arg2, arg7, arg13, arg14, arg15, arg16);
        class44.field632.method93(116);
        class44.field632.method89((byte) -127);
        class44.field632.method93(113);
        if (arg2 > 1) {
            class432.field6150.method564(0);
        }
        class432.field6150.method542(0, (class233[]) null);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)I", line = 385)
    public static final int method1894(int arg0, int arg1, int arg2) {
        field4517++;
        if (arg2 == -887217953) {
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg1 - var3;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lng;)V", line = 409)
    public class303(class153 arg0) {
        class397 var2 = arg0.method1040(2, 5, this);
        while (var2.field5822 == 0) {
            class325.method2005(true, 10L);
        }
        if (var2.field5822 == 2) {
            throw new RuntimeException();
        }
        this.field4519 = (Thread) var2.field5823;
    }
}
