import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class54 extends class207 {

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field1103 = -1;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Ljd;")
    private static class86 field1105 = class122.method868("Close", true);

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Ljd;")
    public static class86 field1098 = field1105;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "B")
    public byte field1104;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Ljd;")
    public class86 field1097;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Ljd;")
    public class86 field1101;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static void method400(int arg0) {
        field1098 = null;
        int var1 = 50 % ((-arg0 - 19) / 34);
        field1105 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLbc;)V")
    public static final void method401(byte arg0, class170 arg1) {
        field1108++;
        if (arg0 < 9) {
            return;
        }
        for (class14 var2 = (class14) class82.field1613.method1737((byte) 74); var2 != null; var2 = (class14) class82.field1613.method1740(-8843)) {
            if (var2.field433 == arg1) {
                if (var2.field420 != null) {
                    class2.field18.method366(var2.field420);
                    var2.field420 = null;
                }
                var2.method1477(1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    public static final void method402(int arg0) {
        field1107++;
        if (arg0 != -63207988) {
            method403(58, (byte) 17, -2, -3, -60, -69);
        }
        class195.field3502.method703((byte) 122);
        class165.field3088.method703((byte) 122);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBIIII)V")
    public static final void method403(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1100++;
        int var6 = arg3 - arg2;
        if (arg1 < 94) {
            method402(-87);
        }
        int var7 = arg5 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class220.method1552(arg2, (byte) -33, arg5, arg4, arg0);
            }
        } else if (var7 == 0) {
            class112.method791(arg2, arg4, arg3, arg0, 15599);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class49.field1044) {
                var10 = (class49.field1044 * var8 >> 12) + var9;
                var11 = class49.field1044;
            } else if (class129.field2473 < arg3) {
                var10 = (class129.field2473 * var8 >> 12) + var9;
                var11 = class129.field2473;
            } else {
                var11 = arg3;
                var10 = arg5;
            }
            int var12;
            int var13;
            if (class49.field1044 > arg2) {
                var12 = class49.field1044;
                var13 = (class49.field1044 * var8 >> 12) + var9;
            } else if (arg2 > class129.field2473) {
                var12 = class129.field2473;
                var13 = (class129.field2473 * var8 >> 12) + var9;
            } else {
                var12 = arg2;
                var13 = arg4;
            }
            if (class50.field1050 > var10) {
                var11 = (class50.field1050 - var9 << 12) / var8;
                var10 = class50.field1050;
            } else if (class56.field1143 < var10) {
                var11 = (class56.field1143 - var9 << 12) / var8;
                var10 = class56.field1143;
            }
            if (var13 < class50.field1050) {
                var13 = class50.field1050;
                var12 = (class50.field1050 - var9 << 12) / var8;
            } else if (class56.field1143 < var13) {
                var13 = class56.field1143;
                var12 = (class56.field1143 - var9 << 12) / var8;
            }
            class51.method388(arg0, var10, -23395, var12, var13, var11);
        }
    }
}
