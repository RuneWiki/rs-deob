import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class391 extends class232 {

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
    private boolean field5557 = false;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field5549 = 0;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "[Ljc;")
    public static class461[] field5552 = null;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "[[I")
    public static int[][] field5550 = new int[6][];

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Lrk;")
    public static class35 field5554;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
    public final void method573(byte arg0) {
        if (arg0 <= 77) {
            field5554 = null;
        }
        if (this.field5557) {
            super.field3368.method1140((byte) -39, 1);
            super.field3368.method1065(-13455, class607.field8551);
            super.field3368.method1136((byte) -108, class174.field2460, class174.field2460);
            super.field3368.method1056(32, class490.field6966, 2);
            super.field3368.method1157(1, 0, class412.field5814);
            super.field3368.method1048(true);
            super.field3368.method1104(true, (class749) null);
            super.field3368.method1140((byte) -58, 0);
            this.field5557 = false;
        } else {
            super.field3368.method1157(1, 0, class412.field5814);
        }
        ++field5561;
        super.field3368.method1136((byte) -101, class174.field2460, class174.field2460);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lwk;)V")
    public class391(class151 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZB)V")
    public final void method568(boolean arg0, byte arg1) {
        if (arg1 != -126) {
            method2390(-77);
        }
        ++field5558;
        class320 var3 = super.field3368.method1046(-97);
        if (var3 != null && arg0) {
            super.field3368.method1140((byte) -116, 1);
            super.field3368.method1104(true, var3);
            super.field3368.method1065(arg1 ^ 13555, class219.field3128);
            super.field3368.method1140((byte) -18, 1);
            super.field3368.method1136((byte) -114, class468.field6696, class438.field6278);
            super.field3368.method1057(2, false, class490.field6967, true, (byte) 115);
            super.field3368.method1157(1, 0, class492.field6991);
            class468 var4 = super.field3368.method1043(false);
            var4.method2774(super.field3368.method1038((byte) -73), 0);
            super.field3368.method1073(class144.field1840, 25216);
            super.field3368.method1140((byte) -30, 0);
            this.field5557 = true;
        } else {
            super.field3368.method1157(arg1 + 127, 0, class492.field6991);
        }
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
    public static final void method2389(int arg0) {
        ++field5556;
        for (int var1 = 0; var1 < 5; ++var1) {
            class259.field3641[var1] = false;
        }
        class777.field10720 = 0;
        class672.field9412 = class118.field1478;
        class763.field10510 = 5;
        class277.field3867 = class655.field9241;
        class179.field2718 = class673.field9441;
        class141.field1822 = -1;
        class367.field5290 = 0;
        int var2 = -16 / ((arg0 - 58) / 37);
        class277.field3864 = class359.field5216;
        class180.field2733 = class689.field9757;
        class645.field9087 = -1;
        class180.field2732 = -1;
        class406.field5746 = -1;
        class303.field4542 = class277.field3866;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILdr;I)V")
    public final void method570(int arg0, class749 arg1, int arg2) {
        if (arg0 != 2305) {
            field5550 = null;
        }
        super.field3368.method1104(true, arg1);
        ++field5553;
        super.field3368.method1088((byte) -31, arg2);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
    public final void method569(int arg0, int arg1, int arg2) {
        ++field5555;
        int var4 = -104 / ((arg0 - 48) / 51);
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        ++field5559;
        return arg0 == -30998;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)[Lrh;")
    public static final class275[] method2390(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field5551;
            return new class275[] { class459.field6571, class614.field8671, class305.field4563, class206.field3022, class201.field2949, class777.field10724, class791.field10852, class60.field824, class477.field6781, class610.field8617, class238.field3429, class655.field9242, class701.field9897, class654.field9227 };
        }
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
    public static void method2391(int arg0) {
        field5550 = null;
        field5554 = null;
        field5552 = null;
        if (arg0 != 0) {
            field5552 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V")
    public final void method572(boolean arg0, int arg1) {
        if (arg1 < 21) {
            this.field5557 = false;
        }
        ++field5560;
        super.field3368.method1136((byte) -105, class174.field2460, class438.field6278);
    }
}
