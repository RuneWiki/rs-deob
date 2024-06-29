import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class202 extends class134 {

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "Ljava/lang/Object;")
    private Object field3058;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field3050 = 0;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "[Lha;")
    public static class31[] field3052 = new class31[4];

    @OriginalMember(owner = "client!t", name = "S", descriptor = "Ldb;")
    public static class17 field3051 = new class17(16);

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field3059 = new String[100];

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(I)V")
    public static final void method1287(int arg0) {
        if (arg0 != 0) {
            method1290(-11, 67, 101);
        }
        class250.field3799.method1775(27147);
        field3053++;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method821(int arg0) {
        field3054++;
        int var2 = 96 % ((arg0 + 61) / 35);
        return this.field3058;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)Z")
    public final boolean method820(int arg0) {
        field3055++;
        return arg0 == -91 ? false : false;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1288(String arg0, int arg1) {
        field3057++;
        int var2 = class183.method1138(arg1 - 130, arg0);
        if (arg1 != 4) {
            field3050 = -89;
        }
        return var2 == -1 ? "" : class265.method1761("<br>", (byte) -117, class293.field4610.field2750[var2], " ");
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(B)V")
    public static void method1289(byte arg0) {
        int var1 = 34 / ((arg0 - 17) / 37);
        field3059 = null;
        field3052 = null;
        field3051 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    public static final void method1290(int arg0, int arg1, int arg2) {
        if (arg1 != -13070) {
            field3052 = null;
        }
        field3056++;
        class187 var3 = class120.method762((byte) 32, 7, arg2);
        var3.method1167(arg1 ^ 0x3379);
        var3.field2844 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class202(Object arg0) {
        this.field3058 = arg0;
    }
}
