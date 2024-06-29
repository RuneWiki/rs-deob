import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class201 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lrf;")
    private static class163 field3971 = class53.method392(-65, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    public static int[] field3970 = new int[128];

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lrf;")
    private static class163 field3973 = class53.method392(61, "Loading)3)3)3");

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lrf;")
    public static class163 field3972 = field3971;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lrf;")
    public static class163 field3974 = field3973;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
    public static int[] field3976 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lfc;")
    public static class54 field3975 = new class54(5);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1320(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field3970 = null;
        field3973 = null;
        field3974 = null;
        field3971 = null;
        field3972 = null;
        field3976 = null;
        field3975 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    public static final void method1321(int arg0, int arg1) {
        field3969++;
        if (arg1 == -1 || !class136.field2815[arg1]) {
            return;
        }
        class158.field3232.method1232(arg1, (byte) 83);
        if (class84.field1798[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class84.field1798[arg1].length; var3++) {
            if (class84.field1798[arg1][var3] != null) {
                if (class84.field1798[arg1][var3].field1755 == 2) {
                    var2 = false;
                } else {
                    class84.field1798[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class84.field1798[arg1] = null;
        }
        class136.field2815[arg1] = false;
        if (arg0 <= 80) {
            field3976 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public static final void method1322(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2357 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLu;ZLu;)V")
    public static final void method1323(byte arg0, class184 arg1, boolean arg2, class184 arg3) {
        class184.field3671 = arg2;
        field3967++;
        class92.field2006 = arg3;
        class81.field1645 = arg1;
        if (arg0 != 50) {
            method1324((byte) -124);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
    public static final int method1324(byte arg0) {
        if (arg0 <= 104) {
            return 13;
        } else {
            field3968++;
            int var1 = class175.method1186(class86.field1882, class60.field1227, class90.field1939, 1);
            return var1 - class33.field644 >= 800 || (class21.field372[class60.field1227][class86.field1882 >> 7][class90.field1939 >> 7] & 0x4) == 0 ? 3 : class60.field1227;
        }
    }
}
