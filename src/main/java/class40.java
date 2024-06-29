import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class40 extends class80 {

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "[I")
    public static int[] field570 = new int[13];

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(Z)V")
    public static void method250(boolean arg0) {
        field570 = null;
        if (arg0) {
            field570 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(II)Z")
    public static final boolean method251(int arg0, int arg1) {
        ++field567;
        if (arg1 != -7010) {
            method250(false);
        }
        if (arg0 != 57 && arg0 != 10 && ~arg0 != -17 && ~arg0 != -60 && arg0 != 15) {
            return arg0 == 47 || ~arg0 == -1009;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field569;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            field570 = null;
        }
        if (super.field1601.field124) {
            class394.method2451(var3, 0, class137.field2308, class44.field795[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class40() {
        super(0, true);
    }
}
