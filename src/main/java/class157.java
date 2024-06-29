import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class157 extends class546 {

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "Z")
    private boolean field2693 = false;

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
    public static int field2688 = 0;

    @OriginalMember(owner = "client!tca", name = "s", descriptor = "[[Z")
    public static boolean[][] field2686 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!tca", name = "y", descriptor = "I")
    public static int field2692 = -1;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!tca", name = "A", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!tca", name = "B", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "Lclient;")
    public static client field2684;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "Z")
    public static boolean field2681;

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lrr;)V")
    public class157(class332 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)V")
    public final void method793(int arg0, boolean arg1) {
        super.field7937.method2275(class406.field6268, -12, class646.field9074);
        if (arg0 >= -39) {
            field2685 = -123;
        }
        ++field2694;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(III)V")
    public final void method785(int arg0, int arg1, int arg2) {
        ++field2689;
        if (arg0 != 8) {
            field2685 = -4;
        }
    }

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "(I)V")
    public final void method783(int arg0) {
        if (!this.field2693) {
            super.field7937.method2304(class622.field8779, 0, arg0 + -382);
        } else {
            super.field7937.method2244(1, -106);
            super.field7937.method163(true, class328.field5090);
            super.field7937.method2275(class646.field9074, 110, class646.field9074);
            super.field7937.method2287((byte) -112, 2, class471.field6974);
            super.field7937.method2304(class622.field8779, 0, -114);
            super.field7937.method2263((byte) 117);
            super.field7937.method2271((class152) null, 5180);
            super.field7937.method2244(0, -101);
            this.field2693 = false;
        }
        ++field2690;
        if (arg0 == 255) {
            super.field7937.method2275(class646.field9074, arg0 ^ 150, class646.field9074);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZLwq;)V")
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        ++field2691;
        super.field7937.method2271(arg2, 5180);
        if (!arg1) {
            super.field7937.method2280(2, arg0);
        }
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(III)Z")
    public static final boolean method1298(int arg0, int arg1, int arg2) {
        if (arg0 > -5) {
            method1298(-24, -17, -14);
        }
        ++field2695;
        return (class311.method2134(arg1, (byte) 124, arg2) | (arg2 & 8192) != 0 | class49.method570(arg1, -6924, arg2)) & class494.method3013(true, arg1, arg2);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Z")
    public final boolean method787(byte arg0) {
        if (arg0 != -109) {
            this.method787((byte) 81);
        }
        ++field2683;
        return true;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZI)V")
    public final void method788(boolean arg0, int arg1) {
        ++field2682;
        class270 var3 = super.field7937.method2249(arg1 ^ -105);
        if (var3 != null && arg0) {
            super.field7937.method2244(1, -121);
            super.field7937.method2271(var3, 5180);
            super.field7937.method163(true, class304.field4782);
            super.field7937.method2244(1, -97);
            super.field7937.method2275(class406.field6268, -120, class51.field681);
            super.field7937.method185(class692.field9702, 2, false, true, (byte) 106);
            super.field7937.method2304(class24.field409, 0, -112);
            class498 var4 = super.field7937.method2282((byte) -25);
            var4.method3033((byte) -103, super.field7937.method2233(-1));
            super.field7937.method2291(class163.field2748, 24813);
            super.field7937.method2244(0, -97);
            this.field2693 = true;
        } else {
            super.field7937.method2304(class24.field409, 0, -111);
        }
        if (arg1 != 0) {
            this.method788(true, -50);
        }
    }

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "(I)V")
    public static void method1299(int arg0) {
        field2686 = null;
        if (arg0 != 1) {
            method1299(-89);
        }
        field2684 = null;
    }
}
