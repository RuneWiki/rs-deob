import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class277 {

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Lfc;")
    private class262 field3694 = new class262(128);

    @OriginalMember(owner = "client!up", name = "l", descriptor = "Lfc;")
    public class262 field3700 = new class262(64);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lni;")
    public class522 field3689;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lni;")
    private class522 field3695;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Llga;")
    public static class712 field3692 = new class712(17, -1);

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field3698 = 100;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field3702 = -1;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZ)V")
    public final void method1646(int arg0, boolean arg1) {
        if (arg1) {
            field3698 = 20;
        }
        class262 var3 = this.field3694;
        synchronized (this.field3694) {
            this.field3694.method1569((byte) 62, arg0);
        }
        field3697++;
        class262 var4 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method1569((byte) 62, arg0);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Lbq;")
    public final class292 method1647(int arg0, int arg1) {
        field3696++;
        class262 var3 = this.field3694;
        class292 var4;
        synchronized (this.field3694) {
            var4 = (class292) this.field3694.method1571(-126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -89 % ((arg0 - 44) / 53);
        class522 var6 = this.field3695;
        byte[] var7;
        synchronized (this.field3695) {
            var7 = this.field3695.method2885(arg1, 36, false);
        }
        class292 var8 = new class292();
        var8.field3861 = arg1;
        var8.field3866 = this;
        if (var7 != null) {
            var8.method1742(new class611(var7), 5);
        }
        var8.method1743(-25798);
        class262 var9 = this.field3694;
        synchronized (this.field3694) {
            this.field3694.method1574((long) arg1, var8, (byte) -80);
            return var8;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public final void method1648(int arg0) {
        class262 var2 = this.field3694;
        synchronized (this.field3694) {
            this.field3694.method1563(84);
            if (arg0 != 0) {
                field3698 = 80;
            }
        }
        field3691++;
        class262 var3 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method1563(arg0 ^ 0x3D);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V")
    public final void method1649(int arg0, int arg1, int arg2) {
        field3701++;
        if (arg1 != -30502) {
            field3692 = null;
        }
        this.field3694 = new class262(arg2);
        this.field3700 = new class262(arg0);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
    public static final void method1650(byte arg0) {
        while (true) {
            if (class569.field8012.method2703(class488.field6682, 75) >= 15) {
                int var1 = class569.field8012.method2702((byte) -111, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    class706 var3 = (class706) class681.field9475.method2552((long) var1, -1);
                    if (var3 == null) {
                        class215 var4 = new class215();
                        var4.field817 = var1;
                        var3 = new class706(var4);
                        class681.field9475.method2558(var3, (long) var1, -1);
                        var2 = true;
                        class746.field10359[class12.field79++] = var3;
                    }
                    class215 var5 = var3.field9890;
                    class665.field9261[class84.field1169++] = var1;
                    var5.field863 = class558.field7854;
                    if (var5.field2589 != null && var5.field2589.method1639((byte) 65)) {
                        class638.method3586(var5, -16255);
                    }
                    var5.method1200(class51.field540.method4084(5, class569.field8012.method2702((byte) -64, 14)), 1);
                    int var6 = class569.field8012.method2702((byte) -67, 1);
                    int var7 = class569.field8012.method2702((byte) -24, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class569.field8012.method2702((byte) -34, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = class569.field8012.method2702((byte) -25, 2);
                    int var10 = class569.field8012.method2702((byte) -68, 1);
                    if (var10 == 1) {
                        class144.field1861[class488.field6690++] = var1;
                    }
                    int var11 = class569.field8012.method2702((byte) -70, 3) + 4 << 11 & 0x3EE3;
                    var5.method554((byte) 87, var5.field2589.field3619);
                    var5.field872 = var5.field2589.field3596 << 3;
                    if (var2) {
                        var5.method556(var11, true, 31);
                    }
                    var5.method1195(var5.method543(0), class653.field9086.field898[0] + var7, var6 == 1, (byte) -106, class653.field9086.field899[0] + var8, var9);
                    if (var5.field2589.method1639((byte) 24)) {
                        class333.method1978(null, null, var5.field898[0], 0, 3, var5.field899[0], var5.field2175, var5);
                    }
                    continue;
                }
            }
            if (arg0 < 112) {
                return;
            }
            field3690++;
            class569.field8012.method2699((byte) 120);
            return;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public static void method1651(int arg0) {
        if (arg0 == -8433) {
            field3692 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILsba;)V")
    public static final void method1652(int arg0, class218 arg1) {
        if (class266.field3520 == arg1.field2710) {
            class24.field186[arg1.field2697] = true;
        }
        field3693++;
        if (arg0 != 1) {
            method1651(91);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lrga;ILni;Lni;)V")
    public class277(class242 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field3689 = arg3;
        this.field3695 = arg2;
        this.field3695.method2901(0, 36);
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    public final void method1653(int arg0) {
        class262 var2 = this.field3694;
        synchronized (this.field3694) {
            if (arg0 != 36) {
                return;
            }
            this.field3694.method1575((byte) -118);
        }
        field3699++;
        class262 var3 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method1575((byte) 61);
        }
    }
}
