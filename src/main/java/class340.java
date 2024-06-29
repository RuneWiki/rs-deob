import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class340 {

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "Lpja;")
    private class43 field4586 = new class43(64);

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "Lpja;")
    public class43 field4593 = new class43(64);

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "Lgj;")
    public class662 field4589;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "Lgj;")
    private class662 field4585;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "[I")
    public static int[] field4591;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method2115(int arg0, byte arg1, int arg2) {
        this.field4586 = new class43(arg2);
        field4588++;
        this.field4593 = new class43(arg0);
        if (arg1 != 23) {
            field4584 = -122;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZI)V", line = 16)
    public final void method2116(boolean arg0, int arg1) {
        field4590++;
        class43 var3 = this.field4586;
        synchronized (this.field4586) {
            this.field4586.method265(arg1, -104);
        }
        class43 var4 = this.field4593;
        synchronized (this.field4593) {
            if (!arg0) {
                this.field4593.method265(arg1, -90);
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIZ)I", line = 35)
    public static final int method2117(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 <= 50) {
            method2120(36);
        }
        field4587++;
        class539 var4 = class210.method1479(arg3, -121, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var4.field7323.length) {
            return var4.field7323[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V", line = 57)
    public final void method2118(int arg0) {
        field4583++;
        class43 var2 = this.field4586;
        synchronized (this.field4586) {
            this.field4586.method273(-60);
            if (arg0 != 34) {
                this.field4589 = null;
            }
        }
        class43 var3 = this.field4593;
        synchronized (this.field4593) {
            this.field4593.method273(126);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IB)Lie;", line = 78)
    public final class6 method2119(int arg0, byte arg1) {
        field4592++;
        class43 var3 = this.field4586;
        class6 var4;
        synchronized (this.field4586) {
            var4 = (class6) this.field4586.method266((byte) -124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field4585;
        byte[] var6;
        synchronized (this.field4585) {
            var6 = this.field4585.method3732(arg0, 8906, 34);
        }
        class6 var7 = new class6();
        if (arg1 != 33) {
            this.method2118(-42);
        }
        var7.field113 = this;
        if (var6 != null) {
            var7.method45(new class93(var6), (byte) 82);
        }
        class43 var8 = this.field4586;
        synchronized (this.field4586) {
            this.field4586.method270(var7, (long) arg0, arg1 - 155);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V", line = 113)
    public static void method2120(int arg0) {
        if (arg0 <= 14) {
            method2120(-54);
        }
        field4591 = null;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lim;ILgj;Lgj;)V", line = 153)
    public class340(class598 arg0, int arg1, class662 arg2, class662 arg3) {
        this.field4589 = arg3;
        this.field4585 = arg2;
        this.field4585.method3730((byte) 13, 34);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V", line = 131)
    public final void method2121(byte arg0) {
        field4582++;
        class43 var2 = this.field4586;
        synchronized (this.field4586) {
            this.field4586.method272(20);
        }
        class43 var3 = this.field4593;
        synchronized (this.field4593) {
            this.field4593.method272(20);
            if (arg0 <= 126) {
                field4584 = -94;
            }
        }
    }
}
