import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class40 extends class472 {

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Lhi;")
    public static class45 field590 = new class45(7, 3);

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "Lrb;")
    public static class283 field599 = new class283(74, -1);

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field602 = 0;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "Lrb;")
    public static class283 field601;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "Ldk;")
    public static class421 field597;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V", line = 6)
    public static void method278(int arg0) {
        field590 = null;
        field599 = null;
        if (arg0 != -9208) {
            method278(-112);
        }
        field597 = null;
        field601 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method279(int arg0, int arg1, int arg2) {
        field596++;
        class103 var3 = class452.field6629.method603((byte) 93, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (arg1 != 4) {
            field602 = -120;
        }
        return var3.method800(arg0, (byte) -98);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIIII)V", line = 40)
    public static final void method280(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 - arg4 >= class519.field7633 && arg3 + arg4 <= class375.field5387 && class23.field320 <= arg1 - arg4 && (arg1 + arg4) <= class233.field3241) {
            class443.method2611((byte) 76, arg2, arg1, arg3, arg4);
        } else {
            class504.method2991(arg4, arg3, arg1, arg2, 116);
        }
        field595++;
        if (arg0) {
            method279(76, -128, 116);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z", line = 57)
    public static final boolean method281(byte arg0) {
        field598++;
        if (arg0 >= -64) {
            field599 = null;
        }
        return class87.field1418 == 0 ? class443.field6380.method1040(94) : true;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIB)V", line = 72)
    public static final void method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 > -75) {
            return;
        }
        field591++;
        if (arg0 == arg4) {
            class61.method414(arg1, arg4, arg2, arg3, false, arg5, arg6);
        } else if (arg2 - arg4 >= class519.field7633 && class375.field5387 >= (arg2 + arg4) && class23.field320 <= arg1 - arg0 && (arg0 + arg1) <= class233.field3241) {
            class340.method2066(arg5, arg0, arg6, arg3, arg4, arg1, arg2, 11714);
        } else {
            class403.method2381(arg5, (byte) -35, arg4, arg0, arg2, arg3, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ldk;Ldk;ILdk;Lbr;)Z", line = 108)
    public static final boolean method283(class421 arg0, class421 arg1, int arg2, class421 arg3, class146 arg4) {
        class443.field6380 = arg4;
        class488.field7069 = arg1;
        if (arg2 != -9286) {
            method283(null, null, -58, null, null);
        }
        field594++;
        class133.field2027 = arg3;
        class349.field5062 = arg0;
        return true;
    }
}
