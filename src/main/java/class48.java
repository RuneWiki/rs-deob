import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class48 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Lhb;")
    public static class155 field802;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Ldk;")
    public static class251 field799;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I")
    public static final int method339(int arg0, int arg1) {
        field798++;
        return arg1 == 0 ? arg0 >>> 8 : -124;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public static final void method340(boolean arg0) {
        class161.field2561 = false;
        class55.field902 = 0;
        class109.field1738 = -1;
        field803++;
        class167.field2726 = 0;
        class162.field2612 = 1;
        if (!arg0) {
            method344(-122);
        }
        class311.field4973 = -3;
        class291.field4679 = 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIII)V")
    public static final void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg4; var6++) {
            class73.method494(arg5, class204.field3253[var6], 4028, arg0, arg2);
        }
        if (arg3 != 255) {
            method343((class251) null, (class251) null, (class217) null, 110, true);
        }
        field805++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZIII)V")
    public static final void method342(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= arg2) {
            class73.method494(arg4, class204.field3253[arg3], 4028, arg2, arg0);
        } else {
            class73.method494(arg4, class204.field3253[arg3], 4028, arg0, arg2);
        }
        field804++;
        if (arg1) {
            method340(true);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ldk;Ldk;Lph;IZ)V")
    public static final void method343(class251 arg0, class251 arg1, class217 arg2, int arg3, boolean arg4) {
        if (arg3 <= 81) {
            field799 = null;
        }
        field800++;
        class289.field4636 = arg4;
        class136.field2156 = arg1;
        class205.field3265 = arg0;
        int var5 = class205.field3265.method1671((byte) -23) - 1;
        class296.field4733 = class205.field3265.method1678((byte) 62, var5) + var5 * 256;
        class179.field2920 = new String[] { null, null, null, null, class176.field2882 };
        class149.field2329 = arg2;
        class265.field4270 = new String[] { null, null, class136.field2157, null, null };
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method344(int arg0) {
        field802 = null;
        field799 = null;
        if (arg0 < 55) {
            field802 = null;
        }
    }
}
