import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class265 extends class68 {

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Z")
    public static boolean field3975 = false;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field3976 = -1;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "[I")
    public static int[] field3972 = new int[128];

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field3979 = 0;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "Lhc;")
    public static class235 field3974;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "[I")
    public static int[] field3973;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "[Laa;")
    public static class173[] field3978;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(B)V")
    public static void method1734(byte arg0) {
        field3978 = null;
        field3972 = null;
        if (arg0 <= 29) {
            field3974 = null;
        }
        field3973 = null;
        field3974 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIBII)I")
    public static final int method1735(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3981++;
        if ((arg1 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg0;
            arg0 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg5;
        } else if (var8 == 2) {
            return 8 - arg6 - arg2;
        } else if (arg4 >= -46) {
            return -73;
        } else {
            return 1 + 7 - arg0 - arg5;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        field3977++;
        return arg1 > -118 ? null : class215.field3231;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIII)V")
    public static final void method1736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 8) {
            method1734((byte) -93);
        }
        field3980++;
        if (arg3 >= class93.field1294 && class296.field4668 >= arg1 && class273.field4228 <= arg4 && class127.field1782 >= arg5) {
            class172.method1129(arg1, arg0, arg4, (byte) 57, arg3, arg5);
        } else {
            class199.method1271(arg0, arg4, arg5, arg1, -2, arg3);
        }
    }
}
