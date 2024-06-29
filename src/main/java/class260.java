import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class260 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3642 = 0;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3645 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lnq;")
    public static class268 field3643;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IC)Z", line = 6)
    public static final boolean method1706(int arg0, char arg1) {
        field3639++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return (char) arg0 == arg1 || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIZ)V", line = 34)
    public static final void method1707(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3641++;
        class390.method2471(arg1, 0, class198.field2753.length - 1, arg0, arg3, 2, arg4);
        if (arg2 <= -66) {
            class253.field3560 = null;
            class333.field4589 = 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V", line = 48)
    public static final void method1708(byte arg0, int arg1) {
        field3644++;
        class239 var2 = class436.method2740(12, arg1, -323285792);
        var2.method1628(14478);
        if (arg0 < 118) {
            field3645 = -35;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILoo;I)V", line = 61)
    public static final void method1709(int arg0, class374 arg1, int arg2) {
        field3640++;
        if (arg2 >= -43) {
            return;
        }
        int var3 = -1;
        int var4 = 0;
        if (class276.field3837 < arg1.field5293) {
            class17.method245(arg1, 25481);
        } else if (arg1.field5265 < class276.field3837) {
            class203.method1320(false, arg1, true);
            var4 = class240.field3415;
            var3 = class442.field6207;
        } else {
            class167.method1116(64, arg1);
        }
        if (arg1.field6262 < 128 || arg1.field6266 < 128 || arg1.field6262 >= (class211.field2954 * 128 - 128) || arg1.field6266 >= class290.field4061 * 128 - 128) {
            arg1.field5293 = 0;
            arg1.field5265 = 0;
            arg1.field5264 = -1;
            arg1.field5300 = -1;
            arg1.field6262 = arg1.field5326[0] * 128 + arg1.method942(false) * 64;
            arg1.field6266 = arg1.field5332[0] * 128 + arg1.method942(false) * 64;
            arg1.method2394(0);
        }
        if (class412.field5841 == arg1 && (arg1.field6262 < 1536 || arg1.field6266 < 1536 || arg1.field6262 >= (class211.field2954 - 12) * 128 || arg1.field6266 >= (class290.field4061 * 128 - 1536))) {
            arg1.field5264 = -1;
            arg1.field5293 = 0;
            arg1.field5300 = -1;
            arg1.field5265 = 0;
            arg1.field6262 = arg1.field5326[0] * 128 + (arg1.method942(false) * 64);
            arg1.field6266 = arg1.field5332[0] * 128 + (arg1.method942(false) * 64);
            arg1.method2394(0);
        }
        int var5 = class39.method368(true, arg1);
        class107.method758(var4, arg1, var3, var5, 1);
        class245.method1659(-19579, arg1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 119)
    public static void method1710(boolean arg0) {
        field3643 = null;
        if (!arg0) {
            method1707(true, 55, 109, 7, false);
        }
    }
}
