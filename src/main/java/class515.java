import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class515 {

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Lng;")
    private class226 field7520 = new class226(64);

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lic;")
    private class491 field7521;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
    public static int[] field7517 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[I")
    public static int[] field7519 = new int[2];

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Ltv;")
    public static class391 field7515;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lco;")
    public final class76 method3035(int arg0, int arg1) {
        field7516++;
        class226 var3 = this.field7520;
        class76 var4;
        synchronized (this.field7520) {
            var4 = (class76) this.field7520.method1536((long) arg0, arg1 + 1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7521.method2945(class461.method2776(arg0, 2077002250), class410.method2471(arg0, arg1 ^ 0xFFFFFC00), true);
        class76 var6 = new class76();
        if (var5 != null) {
            var6.method430(false, new class209(var5));
        }
        class226 var7 = this.field7520;
        synchronized (this.field7520) {
            if (arg1 != -1) {
                method3040(-85);
            }
            this.field7520.method1542(var6, (byte) 112, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V")
    public final void method3036(int arg0, byte arg1) {
        field7524++;
        class226 var3 = this.field7520;
        synchronized (this.field7520) {
            this.field7520.method1540(0);
            this.field7520 = new class226(arg0);
            int var4 = 5 % ((-arg1 - 70) / 55);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public final void method3037(int arg0) {
        class226 var2 = this.field7520;
        synchronized (this.field7520) {
            this.field7520.method1539(-84);
        }
        if (arg0 != 2) {
            this.method3037(91);
        }
        field7523++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public final void method3038(byte arg0) {
        field7525++;
        class226 var2 = this.field7520;
        synchronized (this.field7520) {
            this.field7520.method1540(0);
            if (arg0 < 103) {
                this.method3037(50);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)V")
    public final void method3039(int arg0, byte arg1) {
        field7522++;
        class226 var3 = this.field7520;
        synchronized (this.field7520) {
            this.field7520.method1534(0, arg0);
            if (arg1 < 124) {
                field7518 = 95;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static void method3040(int arg0) {
        if (arg0 != 160) {
            field7518 = 33;
        }
        field7517 = null;
        field7515 = null;
        field7519 = null;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lai;ILic;)V")
    public class515(class423 arg0, int arg1, class491 arg2) {
        this.field7521 = arg2;
        if (this.field7521 != null) {
            int var4 = this.field7521.method2943((byte) -33) - 1;
            this.field7521.method2942(false, var4);
        }
    }
}
