import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class50 extends class130 {

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field602 = 3;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lai;")
    public static class77 field595;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZIZZ)Lnb;")
    public static final class95 method262(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        field600++;
        class69 var5 = null;
        int var6 = 13 % ((arg0 - 19) / 47);
        if (class150.field2402 != null) {
            var5 = new class69(arg2, class150.field2402, class30.field381[arg2], 1000000);
        }
        return new class95(var5, class147.field2317, arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method263(int arg0) {
        if (arg0 <= 89) {
            method263(-61);
        }
        field595 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field603++;
        if (arg6 != 3) {
            field602 = -32;
        }
        if (arg2 >= class188.field3296 && class95.field1388 >= arg5 && arg7 >= class93.field1361 && arg3 <= class23.field291) {
            class258.method1736(arg3, arg7, arg1, arg5, arg2, arg0, arg4, -5503);
        } else {
            class78.method489((byte) -21, arg2, arg5, arg4, arg1, arg7, arg0, arg3);
        }
    }
}
