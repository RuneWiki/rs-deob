import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class140 {

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field2466 = 0;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "Lhga;")
    public static class158 field2467 = new class158();

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "Lr;")
    public static class167 field2463;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIZ)I")
    public static final int method1139(int arg0, int arg1, int arg2, boolean arg3) {
        field2464++;
        if (!arg3) {
            return 56;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public static void method1140(int arg0) {
        field2467 = null;
        field2463 = null;
        if (arg0 != 31331) {
            field2463 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lmu;I)V")
    public static final void method1141(class275 arg0, int arg1) {
        field2468++;
        class604.field8753.method1229(arg0, (byte) 120);
        arg0.field4104 = arg0.field4103.field1393;
        arg0.field4103.field1393 = 0;
        class42.field1083 += arg0.field4104;
        if (arg1 != 19321) {
            field2467 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IBZI)I")
    public static final int method1142(int arg0, byte arg1, boolean arg2, int arg3) {
        field2465++;
        class430 var4 = class605.method3470((byte) -77, arg2, arg3);
        if (arg1 < 3) {
            field2467 = null;
        }
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var4.field6215.length) {
            return var4.field6215[arg0];
        } else {
            return -1;
        }
    }
}
