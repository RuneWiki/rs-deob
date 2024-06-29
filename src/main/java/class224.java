import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class224 extends class249 {

    @OriginalMember(owner = "client!re", name = "s", descriptor = "[S")
    public static short[] field3806 = new short[] { 39, 16, 7, 19, 23, 37, 47, 36 };

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Lmb;")
    private static class96 field3814 = class243.method1708("slide:", (byte) 99);

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lmb;")
    public static class96 field3802 = field3814;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lmb;")
    public static class96 field3807 = field3814;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Luc;")
    public static class11 field3808 = new class11(30);

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Lac;")
    public static class198 field3815 = new class198();

    @OriginalMember(owner = "client!re", name = "C", descriptor = "S")
    public static short field3816 = 1;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Lmb;")
    public static class96 field3818 = class243.method1708("rot:", (byte) 114);

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Luc;")
    public static class11 field3817 = new class11(260);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public static final void method1529(byte arg0) {
        class9.field165++;
        field3810++;
        int var1 = -12 / ((arg0 - 94) / 32);
        class140.field2505.method1012((byte) -128, 217);
        class140.field2505.method1652(class159.method1157(-1), (byte) 41);
        class140.field2505.method1632(true, class232.field3979);
        class140.field2505.method1632(true, class168.field2954);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIBLff;)Z")
    public static final boolean method1530(int arg0, int arg1, byte arg2, class3 arg3) {
        field3813++;
        byte[] var4 = arg3.method23(arg0, 103, arg1);
        if (var4 == null) {
            return false;
        } else {
            int var5 = 126 / ((arg2 - 42) / 49);
            class153.method1117((byte) -94, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1531(int arg0) {
        field3808 = null;
        field3814 = null;
        field3815 = null;
        field3818 = null;
        field3802 = null;
        field3817 = null;
        int var1 = -26 / ((-arg0 - 12) / 59);
        field3807 = null;
        field3806 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
    public static final void method1532(int arg0, boolean arg1) {
        if (arg0 == 37) {
            class180.field3097 = 3.0F;
        } else if (arg0 == 50) {
            class180.field3097 = 4.0F;
        } else if (arg0 == 75) {
            class180.field3097 = 6.0F;
        } else {
            class180.field3097 = 8.0F;
        }
        field3804++;
        class27.field455 = -1;
        if (arg1) {
            class27.field455 = -1;
        }
    }
}
