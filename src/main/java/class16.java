import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class16 extends class495 {

    @OriginalMember(owner = "client!tda", name = "B", descriptor = "I")
    public static int field127 = -1;

    @OriginalMember(owner = "client!tda", name = "E", descriptor = "I")
    public static int field130 = 0;

    @OriginalMember(owner = "client!tda", name = "D", descriptor = "I")
    public static int field129 = 1339;

    @OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
    public static int field135 = 0;

    @OriginalMember(owner = "client!tda", name = "C", descriptor = "F")
    public static float field128;

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!tda", name = "H", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!tda", name = "I", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "[[[B")
    public static byte[][][] field131;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method67(byte arg0, String arg1) {
        if (arg0 <= 105) {
            return true;
        } else {
            ++field133;
            if (arg1 == null) {
                return false;
            } else {
                for (int var2 = 0; var2 < class46.field482; ++var2) {
                    if (arg1.equalsIgnoreCase(class80.field832[var2])) {
                        return true;
                    }
                    if (arg1.equalsIgnoreCase(class157.field1756[var2])) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)V")
    public static void method68(int arg0) {
        field131 = null;
        if (arg0 != 0) {
            method69(-108);
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Ltf;Ltf;Ldt;)V")
    public class16(class701 arg0, class701 arg1, class225 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)V")
    public static final void method69(int arg0) {
        ++field132;
        if (arg0 == -18180) {
            class298.field3718 = new class616();
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIII)V")
    public final void method70(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field134;
        int var6 = super.field7167.method312();
        int var7 = ((class225) super.field8096).field2784 * class701.method3872(-12973) / 10 % var6;
        if (arg3 <= -125) {
            super.field7167.method3003(arg2 - var6 + var7, arg4, arg0 - (-var6 - -var7), arg1);
        }
    }
}
