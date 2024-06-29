import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class98 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
    public static int[] field1794 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Li;")
    public static class88 field1798 = class208.method1425(105, "headicons_pk");

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lp;")
    public static class163 field1801;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lbj;")
    public static class22 field1795;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method685(int arg0) {
        field1795 = null;
        if (arg0 >= 20) {
            field1798 = null;
            field1801 = null;
            field1794 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZZZ)Lbj;")
    public static final class22 method686(byte arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field1800++;
        int var5 = -89 % ((arg0 + 40) / 39);
        class222 var6 = null;
        if (class18.field299 != null) {
            var6 = new class222(arg1, class18.field299, class246.field4506[arg1], 1000000);
        }
        return new class22(var6, class167.field3225, arg1, arg4, arg3, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILi;SJLi;I)V")
    public static final void method687(int arg0, int arg1, class88 arg2, short arg3, long arg4, class88 arg5, int arg6) {
        field1796++;
        if (arg0 != 9746) {
            method686((byte) -103, 49, false, false, true);
        }
        if (class108.field1960 || class203.field3864 >= 500) {
            return;
        }
        class66.field1191[class203.field3864] = arg2;
        class201.field3838[class203.field3864] = arg5;
        class53.field994[class203.field3864] = arg3;
        class74.field1352[class203.field3864] = arg4;
        class165.field3178[class203.field3864] = arg1;
        class217.field4062[class203.field3864] = arg6;
        class203.field3864++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLnb;)V")
    public static final void method688(byte arg0, class144 arg1) {
        if (arg0 == 104) {
            class179.field3567 = arg1;
            field1802++;
        }
    }
}
