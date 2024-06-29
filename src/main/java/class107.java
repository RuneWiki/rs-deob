import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class107 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1633 = -1;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    public static boolean field1630 = false;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1631 = "Loading title screen - ";

    @OriginalMember(owner = "client!je", name = "i", descriptor = "[[I")
    public static int[][] field1637 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIILci;IJ)Z")
    public static final boolean method796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class60 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class155.method1120(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
    public static final int method797(int arg0, int arg1) {
        field1634++;
        int var2 = 92 % ((80 - arg0) / 33);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JZISILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method798(long arg0, boolean arg1, int arg2, short arg3, int arg4, String arg5, String arg6, int arg7) {
        field1635++;
        if (arg1 || class198.field3226 || class42.field776 >= 500) {
            return;
        }
        class47.field840[class42.field776] = arg6;
        class217.field3488[class42.field776] = arg5;
        class251.field3993[class42.field776] = arg2 == -1 ? class96.field1494 : arg2;
        class94.field1468[class42.field776] = arg3;
        class110.field1703[class42.field776] = arg0;
        class223.field3559[class42.field776] = arg7;
        class15.field231[class42.field776] = arg4;
        class42.field776++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method799(byte arg0) {
        field1631 = null;
        if (arg0 >= 80) {
            field1637 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)I")
    public static final int method800(byte arg0) {
        field1636++;
        class9.field126 = 0;
        if (arg0 < 125) {
            method800((byte) -23);
        }
        return class8.method47(false);
    }
}
