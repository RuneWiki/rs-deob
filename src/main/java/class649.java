import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class649 extends class557 {

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    private int field8750 = -1;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
    public static int field8756 = 0;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "B")
    private byte field8757;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "[I")
    public static int[] field8753;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIII)V")
    public static final void method3604(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class291.field4156 && class233.field3099 >= arg3) {
            int var5 = class269.method1790(arg1, class45.field472, class297.field4199, 13094);
            int var6 = class269.method1790(arg2, class45.field472, class297.field4199, 13094);
            class129.method914(var5, arg3, arg4, 60, var6);
        }
        field8754++;
        if (arg0 >= -103) {
            method3605(-109);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public static void method3605(int arg0) {
        if (arg0 == 0) {
            field8753 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILha;)Leb;")
    public static final class651 method3606(int arg0, int arg1, class66 arg2) {
        field8751++;
        class14 var3 = class222.method1419(arg1, arg2, true, true);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 10) {
                field8753 = null;
            }
            return var3.field141;
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)I")
    public static final int method3607(int arg0) {
        field8749++;
        if (arg0 != -1) {
            field8756 = 114;
        }
        return class534.field7403;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLdt;)V")
    public final void method30(byte arg0, class254 arg1) {
        field8755++;
        this.field8750 = arg1.method1728((byte) 16);
        this.field8757 = arg1.method1737(true);
        if (arg0 != 110) {
            method3607(44);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ltn;I)V")
    public final void method32(class95 arg0, int arg1) {
        if (arg1 != -29265) {
            method3604(87, 1, 97, 12, 59);
        }
        arg0.method737(this.field8757, this.field8750, 0);
        field8752++;
    }
}
