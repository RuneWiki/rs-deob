import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class279 implements class217 {

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "Lpl;")
    private class612 field3501;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lpl;")
    private class612 field3495;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Lnn;")
    private class230 field3500;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "Lwp;")
    public static class453 field3499 = new class453(111, 6);

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field3503 = 0;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "Lrga;")
    public static class280 field3505 = new class280(66, -1);

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "F")
    public static float field3502;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "Lbr;")
    public static class195 field3504;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Lla;")
    private class413 field3498;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
    public final void method395(boolean arg0, int arg1) {
        if (arg1 != 6621) {
            method1585(false);
        }
        if (arg0) {
            int var3 = this.field3500.field2881.method2206(class593.field8327, this.field3500.field2872, 2) + this.field3500.field2880;
            int var4 = this.field3500.field2873.method195(class316.field4060, this.field3500.field2879, -90) + this.field3500.field2875;
            this.field3498.method2185(this.field3500.field2876, this.field3500.field2866, null, this.field3500.field2872, this.field3500.field2870, this.field3500.field2868, this.field3500.field2871, arg1 - 6705, this.field3500.field2877, this.field3500.field2879, null, null, 0, 0, var4, var3);
        }
        field3496++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    public static void method1585(boolean arg0) {
        field3504 = null;
        field3499 = null;
        if (!arg0) {
            field3505 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z")
    public final boolean method392(byte arg0) {
        if (arg0 != 82) {
            this.method395(true, 41);
        }
        field3497++;
        boolean var2 = true;
        if (!this.field3495.method3368(1912, this.field3500.field2867)) {
            var2 = false;
        }
        if (!this.field3501.method3368(1912, this.field3500.field2867)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public final void method394(int arg0) {
        if (arg0 >= -41) {
            this.method394(113);
        }
        field3494++;
        class595 var2 = class280.method1588(this.field3501, this.field3500.field2867, (byte) 32);
        this.field3498 = class32.field452.method989(var2, class661.method3716(this.field3495, this.field3500.field2867), true);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Ldfa;")
    public static final class391 method1586(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        return var3 == null || var3.field1031 == null ? null : var3.field1031;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lpl;Lpl;Lnn;)V")
    public class279(class612 arg0, class612 arg1, class230 arg2) {
        this.field3501 = arg1;
        this.field3495 = arg0;
        this.field3500 = arg2;
    }
}
