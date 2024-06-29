import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class539 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lmf;")
    private class382 field7538 = new class382(64);

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lmf;")
    public class382 field7549 = new class382(64);

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lpu;")
    public class522 field7544;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lpu;")
    private class522 field7546;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lff;")
    public static class9 field7542 = new class9(6, 0, 4, 2);

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lff;")
    public static class9 field7550 = new class9(1, 2, 2, 0);

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[I")
    public static int[] field7552 = new int[2];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lfg;")
    public static class113 field7553;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Z")
    public static boolean field7551;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static void method3060(boolean arg0) {
        field7550 = null;
        if (!arg0) {
            field7553 = null;
            field7552 = null;
            field7542 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
    public final void method3061(boolean arg0) {
        field7548++;
        class382 var2 = this.field7538;
        synchronized (this.field7538) {
            this.field7538.method2279(0);
        }
        if (!arg0) {
            class382 var3 = this.field7549;
            synchronized (this.field7549) {
                this.field7549.method2279(0);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
    private final void method3062(int arg0, boolean arg1) {
        class382 var3 = this.field7538;
        synchronized (this.field7538) {
            this.field7538.method2290(arg1, arg0);
        }
        field7543++;
        class382 var4 = this.field7549;
        synchronized (this.field7549) {
            this.field7549.method2290(false, arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B[B)V")
    public static final void method3063(byte arg0, byte[] arg1) {
        if (arg0 < 10) {
            method3063((byte) 72, null);
        }
        field7547++;
        class695 var2 = new class695(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method3826(false);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class46.field720 = new int[6];
                    var4[0] = var2.method3847((byte) 118);
                    var4[1] = var2.method3847((byte) 118);
                    var4[2] = var2.method3847((byte) 118);
                    var4[3] = var2.method3847((byte) 118);
                    var4[4] = var2.method3847((byte) 118);
                    var4[5] = var2.method3847((byte) 118);
                } else if (var3 == 4) {
                    int var5 = var2.method3826(false);
                    class608.field8557 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class608.field8557[var6] = var2.method3847((byte) 118);
                        if (class608.field8557[var6] == 65535) {
                            class608.field8557[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method3826(false);
                    class453.field6511 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class453.field6511[var8] = var2.method3847((byte) 118);
                        if (class453.field6511[var8] == 65535) {
                            class453.field6511[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lraa;")
    public final class563 method3064(byte arg0, int arg1) {
        field7537++;
        class382 var3 = this.field7538;
        class563 var4;
        synchronized (this.field7538) {
            var4 = (class563) this.field7538.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field7546;
        byte[] var6;
        synchronized (this.field7546) {
            var6 = this.field7546.method3007(34, arg1, 5);
        }
        class563 var7 = new class563();
        var7.field7925 = this;
        if (var6 != null) {
            var7.method3219(-57, new class695(var6));
        }
        int var8 = 118 % ((70 - arg0) / 43);
        class382 var9 = this.field7538;
        synchronized (this.field7538) {
            this.field7538.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public final void method3065(byte arg0) {
        class382 var2 = this.field7538;
        synchronized (this.field7538) {
            this.field7538.method2285((byte) -106);
        }
        field7545++;
        class382 var3 = this.field7549;
        synchronized (this.field7549) {
            this.field7549.method2285((byte) -112);
            int var4 = -9 / ((arg0 - 77) / 34);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static final void method3066(byte arg0) {
        class52.field1041.method2585(5, (byte) 63);
        field7540++;
        class483.field6869.method1988(5, 20590);
        class145.field2120.method1850(-64, 5);
        class101.field1572.method2622((byte) -88, 5);
        class393.field5824.method368(5, (byte) 62);
        class41.field682.method2221(5, (byte) -100);
        class188.field2708.method2139(5, 64);
        class86.field1411.method1473(5, -53);
        class31.field493.method587((byte) 17, 5);
        class692.field9733.method3142(5, 25486);
        class339.field4991.method646(5, 127);
        class255.field3916.method814(true, 5);
        class27.field401.method3062(5, false);
        class329.field4869.method3549(5, 1000);
        class325.field4802.method867(5, (byte) 113);
        class226.field3182.method3128(5, -117);
        class177.field2526.method2475(5, (byte) 123);
        class472.field6748.method1808(5, (byte) 88);
        class287.field4278.method1335((byte) -60, 5);
        if (arg0 < 64) {
            return;
        }
        class61.field1165.method2962(5, (byte) -107);
        class377.method2267(5, false);
        class127.method955(9358, 50);
        class598.method3382((byte) 65, 50);
        class417.method2513(0, 5);
        class177.method1201(-123, 5);
        class197.field2805.method2290(false, 5);
        class524.field7402.method2290(false, 5);
        class591.field8282.method2290(false, 5);
        class657.field9227.method2290(false, 5);
        class220.field3091.method2290(false, 5);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZB)V")
    public static final void method3067(boolean arg0, byte arg1) {
        field7541++;
        if (arg1 != -65) {
            return;
        }
        if (arg0) {
            if (class100.field1556 != -1) {
                class178.method1212(2, class100.field1556);
            }
            for (class320 var2 = (class320) class654.field9178.method1407(115); var2 != null; var2 = (class320) class654.field9178.method1413(true)) {
                if (!var2.method3675(true)) {
                    var2 = (class320) class654.field9178.method1407(-128);
                    if (var2 == null) {
                        break;
                    }
                }
                class224.method1484(false, true, true, var2);
            }
            class100.field1556 = -1;
            class654.field9178 = new class213(8);
            class53.method582((byte) 106);
            class100.field1556 = class319.field4701;
            class433.method2580((byte) -17, false);
            class158.method1100(113);
            class220.method1451(class100.field1556);
        }
        class315.field4671 = true;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public final void method3068(int arg0, int arg1, int arg2) {
        field7539++;
        if (arg0 == 34) {
            this.field7538 = new class382(arg1);
            this.field7549 = new class382(arg2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lkr;ILpu;Lpu;)V")
    public class539(class693 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field7544 = arg3;
        this.field7546 = arg2;
        this.field7546.method2988(-60, 34);
    }
}
