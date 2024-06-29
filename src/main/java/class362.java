import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class362 {

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "Lde;")
    private class534 field4674 = new class534(64);

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Lde;")
    public class534 field4677 = new class534(60);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "Lnd;")
    private class547 field4666;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "Lnd;")
    public class547 field4672;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Lcv;")
    public static class570 field4669;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V")
    public final void method2088(boolean arg0, int arg1) {
        this.field4679 = arg1;
        field4673++;
        class534 var3 = this.field4677;
        synchronized (this.field4677) {
            this.field4677.method3065(true);
        }
        if (arg0) {
            method2096(-19);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)Z")
    public static final boolean method2089(int arg0, int arg1, int arg2) {
        field4675++;
        if (arg0 <= 36) {
            field4669 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)V")
    public final void method2090(int arg0, byte arg1) {
        field4667++;
        class534 var3 = this.field4674;
        synchronized (this.field4674) {
            if (arg1 != 39) {
                return;
            }
            this.field4674.method3070(arg0, arg1 + 88);
        }
        class534 var4 = this.field4677;
        synchronized (this.field4677) {
            this.field4677.method3070(arg0, 121);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public final void method2091(byte arg0) {
        field4676++;
        class534 var2 = this.field4674;
        synchronized (this.field4674) {
            this.field4674.method3065(true);
        }
        class534 var3 = this.field4677;
        synchronized (this.field4677) {
            int var4 = 108 / ((arg0 + 30) / 45);
            this.field4677.method3065(true);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static void method2092(int arg0) {
        field4669 = null;
        if (arg0 >= -101) {
            method2096(-87);
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public final void method2093(int arg0) {
        field4678++;
        class534 var2 = this.field4674;
        synchronized (this.field4674) {
            this.field4674.method3064(false);
        }
        class534 var3 = this.field4677;
        synchronized (this.field4677) {
            if (arg0 < -97) {
                this.field4677.method3064(false);
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Z")
    public static final boolean method2094(int arg0, int arg1) {
        if (arg1 != -13) {
            field4669 = null;
        }
        field4670++;
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(IB)Luq;")
    public final class164 method2095(int arg0, byte arg1) {
        field4671++;
        class534 var3 = this.field4674;
        class164 var4;
        synchronized (this.field4674) {
            var4 = (class164) this.field4674.method3079((long) arg0, 0);
        }
        int var5 = 37 % ((arg1 + 68) / 52);
        if (var4 != null) {
            return var4;
        }
        class547 var6 = this.field4666;
        byte[] var7;
        synchronized (this.field4666) {
            var7 = this.field4666.method3153(class394.method2220((byte) 88, arg0), 0, class443.method2510(arg0, (byte) -103));
        }
        class164 var8 = new class164();
        var8.field2273 = this;
        var8.field2293 = arg0;
        if (var7 != null) {
            var8.method1148(new class461(var7), 0);
        }
        class534 var9 = this.field4674;
        synchronized (this.field4674) {
            this.field4674.method3077((byte) 126, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)Lbh;")
    public static final class37 method2096(int arg0) {
        if (arg0 != 0) {
            method2089(-75, 98, 91);
        }
        field4668++;
        class37 var1 = (class37) class236.field3083.method118(arg0 ^ 0xFFFF88A7);
        if (var1 != null) {
            var1.method1175(arg0 ^ 0xFFFFFFFE);
            var1.method3615(88);
            return var1;
        }
        class37 var2;
        do {
            var2 = (class37) class605.field8409.method118(-30553);
            if (var2 == null) {
                return null;
            }
            if (var2.method234(false) > class446.method2525(arg0 + 500)) {
                return null;
            }
            var2.method1175(-2);
            var2.method3615(16);
        } while ((Long.MIN_VALUE & var2.field8924) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lal;ILnd;Lnd;)V")
    public class362(class102 arg0, int arg1, class547 arg2, class547 arg3) {
        this.field4666 = arg2;
        this.field4672 = arg3;
        int var5 = this.field4666.method3155((byte) -78) - 1;
        this.field4666.method3178((byte) 64, var5);
    }
}
