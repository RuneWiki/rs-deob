import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class100 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1709 = 0;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Loa;")
    public static class99 field1712 = class221.method1463(2844, " (X");

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[I")
    public static int[] field1715 = new int[1000];

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Loa;")
    public static class99 field1714 = class221.method1463(2844, "Hierhin gehen");

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1718 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lbj;")
    public static class155 field1716;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    public static final void method708(int arg0, int arg1) {
        field1713++;
        class179.field3123 = arg0 / arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I")
    public static final int method709(byte arg0) {
        field1710++;
        if (class127.field2206 == null) {
            return -1;
        }
        int var1 = -85 / ((29 - arg0) / 46);
        while (class127.field2206.field1524 > class107.field1907) {
            if (class127.field2206.method601(class107.field1907, 0)) {
                return class107.field1907++;
            }
            class107.field1907++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BIIIIII)I")
    public static final int method710(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        int var8 = arg2 & 0x3;
        field1717++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 - (arg5 - 7) - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            if (arg0 != 116) {
                method712((byte) -81);
            }
            return arg4;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IJ)V")
    public static final void method711(int arg0, long arg1) {
        field1711++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == (long) arg0) {
            class167.method1134(6, arg1 - 1L);
            class167.method1134(arg0 + 6, 1L);
        } else {
            class167.method1134(6, arg1);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
    public static void method712(byte arg0) {
        field1716 = null;
        if (arg0 == -72) {
            field1714 = null;
            field1712 = null;
            field1715 = null;
        }
    }
}
