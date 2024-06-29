import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class603 extends class205 {

    @OriginalMember(owner = "client!sw", name = "E", descriptor = "I")
    public static int field8533 = 0;

    @OriginalMember(owner = "client!sw", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field8536 = new String[100];

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "Ltm;")
    public static class334 field8524 = new class334(72, -1);

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    public int field8526;

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!sw", name = "C", descriptor = "I")
    public int field8531;

    @OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
    public int field8532;

    @OriginalMember(owner = "client!sw", name = "F", descriptor = "I")
    public int field8534;

    @OriginalMember(owner = "client!sw", name = "J", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "Lew;")
    public class685 field8529;

    @OriginalMember(owner = "client!sw", name = "H", descriptor = "Ljava/lang/String;")
    public String field8535;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "[I")
    public int[] field8525;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "[I")
    public int[] field8528;

    @OriginalMember(owner = "client!sw", name = "K", descriptor = "[I")
    public static int[] field8538;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "[Lpl;")
    public class616[] field8523;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field8527;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIBI)Z")
    public static final boolean method3456(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 < 24) {
            field8533 = -14;
        }
        field8537++;
        for (int var6 = arg3; var6 <= arg0; var6++) {
            for (int var7 = arg5; var7 <= arg1; var7++) {
                if (class639.field8976[var6][var7] == arg2 && class140.field2196[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V")
    public static void method3457(int arg0) {
        field8538 = null;
        field8536 = null;
        if (arg0 != 12818) {
            field8524 = null;
        }
        field8524 = null;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)V")
    public static final void method3458(int arg0, byte arg1) {
        field8530++;
        class118 var2 = class86.method755(true, 3, arg0);
        if (arg1 < -4) {
            var2.method936(0);
        }
    }
}
