import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class141 {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Lpca;")
    private class714 field2031 = new class714(64);

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lfp;")
    private class323 field2027;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lfp;")
    private class323 field2025;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[I")
    public static int[] field2026 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lbg;")
    public static class464 field2028 = new class464();

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "F")
    public static float field2030;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Leaa;", line = 3)
    public final class500 method988(int arg0, byte arg1) {
        field2029++;
        class500 var3 = (class500) this.field2031.method4022((long) arg0, (byte) 107);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field2025.method2100(arg0, (byte) 112, 0);
        } else {
            var4 = this.field2027.method2100(arg0 & 0x7FFF, (byte) 112, 0);
        }
        if (arg1 != 71) {
            return null;
        }
        class500 var5 = new class500();
        if (var4 != null) {
            var5.method2977(new class675(var4), 94);
        }
        if (arg0 >= 32768) {
            var5.method2974((byte) 101);
        }
        this.field2031.method4018((byte) 124, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 45)
    public static void method989(int arg0) {
        if (arg0 == 2) {
            field2028 = null;
            field2026 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(ILfp;Lfp;)V", line = 82)
    public class141(int arg0, class323 arg1, class323 arg2) {
        this.field2027 = arg2;
        this.field2025 = arg1;
        if (this.field2025 != null) {
            this.field2025.method2084(0, 0);
        }
        if (this.field2027 != null) {
            this.field2027.method2084(0, 0);
        }
    }
}
