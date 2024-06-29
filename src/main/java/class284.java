import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class284 {

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field4886 = -2;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lfg;")
    public static class203 field4884 = new class203();

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[Z")
    public static boolean[] field4889 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field4892 = 128;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lve;")
    public static class255 field4888 = class87.method607(56, ")1u1)1m");

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lve;")
    public static class255 field4891 = class87.method607(71, ")2");

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field4890 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLt;)V", line = 9)
    public static final void method2019(byte arg0, class242 arg1) {
        field4882++;
        if (arg0 > -22) {
            field4888 = (class255) null;
        }
        class152 var2 = (class152) class187.field3022.method280(arg1.field4068.method1764((byte) 102), 29153);
        if (var2 == null) {
            return;
        }
        if (var2.field2567 != null) {
            class230.field3813.method1481(var2.field2567);
            var2.field2567 = null;
        }
        var2.method1502((byte) -82);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 36)
    public static void method2020(int arg0) {
        field4884 = null;
        if (arg0 == 0) {
            field4891 = null;
            field4888 = null;
            field4889 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lve;B)V", line = 54)
    public static final void method2021(class255 arg0, byte arg1) {
        int var2 = 110 / ((67 - arg1) / 52);
        field4883++;
        for (class91 var3 = (class91) field4884.method1471((byte) -87); var3 != null; var3 = (class91) field4884.method1475((byte) 83)) {
            if (var3.field1568.method1752(true, arg0)) {
                class253.field4277 = var3;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[B)[B", line = 85)
    public static final byte[] method2022(int arg0, byte[] arg1) {
        field4887++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class36.method216(arg1, arg0, var3, 0, var2);
        return var3;
    }
}
