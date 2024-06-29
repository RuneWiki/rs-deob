import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class470 extends class96 {

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "Lpi;")
    public static class340 field6872 = new class340(11, -1);

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field6876 = 0;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "Z")
    public static boolean field6878 = false;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "[[[Ltg;")
    public static class510[][][] field6877;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILmv;)I", line = 5)
    public static final int method2822(int arg0, class518 arg1) {
        ++field6875;
        int var2 = arg1.field7665;
        if (arg0 < 10) {
            return 109;
        } else {
            class371 var3 = arg1.method2347((byte) -121);
            if (!arg1.field5196) {
                if (~arg1.field5174 != ~var3.field4808 && arg1.field5174 != var3.field4813 && ~arg1.field5174 != ~var3.field4783 && arg1.field5174 != var3.field4807) {
                    if (~arg1.field5174 == ~var3.field4816 || ~arg1.field5174 == ~var3.field4790 || ~arg1.field5174 == ~var3.field4792 || arg1.field5174 == var3.field4785) {
                        var2 = arg1.field7626;
                    }
                } else {
                    var2 = arg1.field7659;
                }
            } else {
                var2 = arg1.field7648;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BI)[B", line = 32)
    public static final byte[] method2823(byte[] arg0, int arg1) {
        if (arg1 != -1) {
            field6877 = null;
        }
        ++field6873;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class526.method3113(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)[I", line = 50)
    public final int[] method37(int arg0, int arg1) {
        ++field6874;
        if (arg1 != 255) {
            field6877 = null;
        }
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            class526.method3111(var3, 0, class269.field3403, class74.field933[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 76)
    public class470() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V", line = 86)
    public static void method2824(boolean arg0) {
        if (!arg0) {
            field6872 = null;
        }
        field6877 = null;
        field6872 = null;
    }
}
