import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class269 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[I")
    public static int[] field4752 = new int[2500];

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "S")
    public static short field4754 = 1;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lhi;")
    public static class250 field4756;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
    public static int[] field4758;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Lli;")
    public static final class185 method1824(byte arg0, int arg1) {
        field4751++;
        int var2 = 48 / ((84 - arg0) / 35);
        return class107.field1922[arg1].method1311((byte) 49) > 0 ? class87.method567(-11039, new class185[] { class37.field587[arg1], class224.field4107, class107.field1922[arg1] }) : class37.field587[arg1];
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method1825(byte arg0) {
        if (arg0 != 10) {
            field4756 = null;
        }
        field4756 = null;
        field4758 = null;
        field4752 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4753++;
        if (arg3 != -103) {
            field4756 = null;
        }
        if (arg0 < 1 || arg4 < 1 || arg0 > 102 || arg4 > 102) {
            return;
        }
        if (!class17.method125(112) && (class239.field4262[0][arg0][arg4] & 0x2) == 0) {
            int var8 = arg6;
            if ((class239.field4262[arg6][arg0][arg4] & 0x8) != 0) {
                var8 = 0;
            }
            if (class111.field2009 != var8) {
                return;
            }
        }
        int var9 = arg6;
        if (arg6 < 3 && (class239.field4262[1][arg0][arg4] & 0x2) == 2) {
            var9 = arg6 + 1;
        }
        class158.method1124(arg4, arg0, class165.field3090[arg6], 108, var9, arg6, arg1);
        if (arg7 < 0) {
            return;
        }
        boolean var10 = class32.field533;
        class32.field533 = true;
        class254.method1720(arg6, arg0, false, (byte) 17, var9, arg7, false, arg5, arg2, class165.field3090[arg6], arg4);
        class32.field533 = var10;
        return;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static final void method1827(byte arg0) {
        field4755++;
        if (arg0 >= -82) {
            field4752 = null;
        }
        class211.field3842 = null;
        class174.field3182 = null;
        class258.field4591 = null;
        class145.field2766 = null;
        class249.field4418 = null;
        class55.field940 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lca;")
    public static final class81 method1828(int arg0, int arg1) {
        field4759++;
        class81 var2 = (class81) class249.field4413.method82(121, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class264.field4684.method1688(arg0 - 2, class50.method315((byte) 98, arg1), class155.method1103(arg1, true));
        class81 var4 = new class81();
        if (arg0 != 2) {
            return null;
        }
        var4.field1454 = arg1;
        if (var3 != null) {
            var4.method529((byte) 104, new class118(var3));
        }
        var4.method524((byte) 111);
        class249.field4413.method84(108, (long) arg1, var4);
        return var4;
    }
}
