import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class598 extends class442 {

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    private int field8525 = 0;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ldh;")
    public static class320 field8518 = new class320(81, 0);

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "D")
    public static double field8521;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Lcu;")
    public static class219 field8519;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
    public final void method12(boolean arg0, int arg1) {
        ++field8520;
        int var3 = super.field6418.field8257.method2395(class12.field92, (byte) -48, super.field6420.method501()) + super.field6418.field8255;
        int var4 = super.field6418.field8264.method1280(true, class181.field2143, super.field6420.method510()) - -super.field6418.field8258;
        super.field6420.method821((float) (var3 - -(super.field6420.method501() / 2)), (float) (var4 - -(super.field6420.method510() / 2)), 4096, this.field8525);
        this.field8525 += ((class657) super.field6418).field9396;
        int var5 = 73 / ((arg1 - -56) / 42);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public static void method3405(byte arg0) {
        field8519 = null;
        field8518 = null;
        if (arg0 < 72) {
            field8518 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
    public static final void method3406(byte arg0) {
        ++field8524;
        int var1 = 0;
        if (~class654.field9334.field9844.method900(3) == -2) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (class654.field9334.field9836.method466(-120) == 0) {
            var1 |= 64;
        }
        int var6 = 64 / ((62 - arg0) / 45);
        class510.method3012(var1, (byte) 111);
        class445.field6442.method3975(66, var1);
        class361.field4643.method903(var1, 24);
        class451.field6506.method138(var1, (byte) -120);
        class173.field2036.method1217(73, var1);
        class518.method3041((byte) 106, var1);
        class226.method1308(var1, (byte) -39);
        class668.method3797(var1, (byte) 54);
        class7.method28(var1, -55);
        class60.method461(-1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method3407(String arg0, boolean arg1) {
        ++field8522;
        int var2 = arg0.length();
        if (!arg1) {
            method3405((byte) -44);
        }
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3 = class628.method3601(arg0.charAt(var4), 1953684204) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Loh;Lsv;)V")
    public class598(class404 arg0, class657 arg1) {
        super(arg0, arg1);
    }
}
