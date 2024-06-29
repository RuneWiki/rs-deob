import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class179 extends class42 {

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lci;")
    public static class320 field2653;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method1246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg6 != 82) {
            field2653 = null;
        }
        field2655++;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg5;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg1;
        } else {
            return 1 + 7 - arg4 - arg5;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method1247(int arg0) {
        if (arg0 != 29684) {
            method1248(46, 97);
        }
        field2653 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
    public static final void method1248(int arg0, int arg1) {
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field2652++;
        if (arg0 >= -59) {
            method1248(-64, 8);
        }
        class248.field3711 = arg1;
        class193.field2810 = new class115[class457.field6638[class248.field3711] + 1];
        class519.field7522 = 0;
        class465.field6753 = 0;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
    public class179(int arg0, int arg1) {
        this.field2654 = arg0;
        this.field2656 = arg1;
    }
}
