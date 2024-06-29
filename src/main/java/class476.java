import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class476 {

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Z")
    public boolean field6563 = false;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Llga;")
    private class663 field6557 = new class663(64);

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "Llga;")
    public class663 field6564 = new class663(500);

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Llga;")
    public class663 field6565 = new class663(30);

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Llga;")
    public class663 field6566 = new class663(50);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lsea;")
    public class648 field6546;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Lsea;")
    private class648 field6548;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Z")
    public boolean field6550;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public int field6567;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public final void method2682(int arg0) {
        class663 var2 = this.field6557;
        synchronized (this.field6557) {
            this.field6557.method3755(19713);
        }
        field6547++;
        class663 var3 = this.field6564;
        synchronized (this.field6564) {
            if (arg0 != 50) {
                this.method2683(-16, true);
            }
            this.field6564.method3755(arg0 ^ 0x4D33);
        }
        class663 var4 = this.field6565;
        synchronized (this.field6565) {
            this.field6565.method3755(19713);
        }
        class663 var5 = this.field6566;
        synchronized (this.field6566) {
            this.field6566.method3755(19713);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
    public final void method2683(int arg0, boolean arg1) {
        field6560++;
        if (this.field6563 != arg1 && arg0 == 50) {
            this.field6563 = arg1;
            this.method2689(0);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)V")
    public final void method2684(byte arg0, int arg1) {
        field6559++;
        this.field6567 = arg1;
        class663 var3 = this.field6564;
        synchronized (this.field6564) {
            this.field6564.method3749(7648);
            if (arg0 > -31) {
                this.method2683(94, false);
            }
        }
        class663 var4 = this.field6565;
        synchronized (this.field6565) {
            this.field6565.method3749(7648);
        }
        class663 var5 = this.field6566;
        synchronized (this.field6566) {
            this.field6566.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Ljs;")
    public final class301 method2685(int arg0, int arg1) {
        field6558++;
        class663 var3 = this.field6557;
        class301 var4;
        synchronized (this.field6557) {
            var4 = (class301) this.field6557.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field6548;
        byte[] var6;
        synchronized (this.field6548) {
            var6 = this.field6548.method3654(-15615, class392.method2295(-1785779800, arg0), class267.method1628(arg0, (byte) 61));
            if (arg1 > -50) {
                this.method2683(119, true);
            }
        }
        class301 var7 = new class301();
        var7.field4102 = this;
        var7.field4131 = arg0;
        if (var6 != null) {
            var7.method1832(new class501(var6), 14644);
        }
        var7.method1824(true);
        if (!this.field6550 && var7.field4097) {
            var7.field4179 = null;
            var7.field4120 = null;
        }
        if (var7.field4105) {
            var7.field4175 = false;
            var7.field4169 = 0;
        }
        class663 var8 = this.field6557;
        synchronized (this.field6557) {
            this.field6557.method3748((long) arg0, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(IZ)V")
    public final void method2686(int arg0, boolean arg1) {
        field6562++;
        if (arg1 == this.field6550) {
            return;
        }
        this.field6550 = arg1;
        if (arg0 != 30) {
            this.field6567 = 123;
        }
        this.method2689(arg0 - 30);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V")
    public final void method2687(int arg0, int arg1) {
        this.field6557 = new class663(arg0);
        field6549++;
        if (arg1 != 1) {
            field6555 = -49;
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(II)V")
    public final void method2688(int arg0, int arg1) {
        class663 var3 = this.field6557;
        synchronized (this.field6557) {
            this.field6557.method3754(arg0, true);
        }
        field6556++;
        if (arg1 != 64) {
            this.field6563 = false;
        }
        class663 var4 = this.field6564;
        synchronized (this.field6564) {
            this.field6564.method3754(arg0, true);
        }
        class663 var5 = this.field6565;
        synchronized (this.field6565) {
            this.field6565.method3754(arg0, true);
        }
        class663 var6 = this.field6566;
        synchronized (this.field6566) {
            this.field6566.method3754(arg0, true);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public final void method2689(int arg0) {
        class663 var2 = this.field6557;
        synchronized (this.field6557) {
            this.field6557.method3749(7648);
        }
        field6554++;
        class663 var3 = this.field6564;
        synchronized (this.field6564) {
            this.field6564.method3749(7648);
        }
        class663 var4 = this.field6565;
        synchronized (this.field6565) {
            this.field6565.method3749(7648);
        }
        class663 var5 = this.field6566;
        synchronized (this.field6566) {
            if (arg0 != 0) {
                this.field6546 = null;
            }
            this.field6566.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lr;B)V")
    public static final void method2690(class166 arg0, byte arg1) {
        if (class287.field3951) {
            class647.method3618(0, arg0);
        } else {
            class561.method3136(1, arg0);
        }
        if (arg1 > -109) {
            field6551 = -72;
        }
        field6561++;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lci;IZLsea;Lsea;)V")
    public class476(class414 arg0, int arg1, boolean arg2, class648 arg3, class648 arg4) {
        this.field6546 = arg4;
        this.field6548 = arg3;
        this.field6550 = arg2;
        if (this.field6548 != null) {
            int var6 = this.field6548.method3649((byte) 112) - 1;
            this.field6548.method3653(var6, true);
        }
    }
}
