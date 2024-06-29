import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class11 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[I")
    public static int[] field165 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lcr;")
    public static class189 field167 = new class189(128);

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[I")
    public static int[] field170 = new int[1000];

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field171 = 2;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
    public static int[] field169 = new int[2];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lak;")
    public static class219 field172;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method78(byte arg0) {
        field172 = null;
        field165 = null;
        if (arg0 <= 12) {
            method78((byte) -107);
        }
        field169 = null;
        field170 = null;
        field167 = null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)Z")
    public static final boolean method79(byte arg0) {
        field166++;
        int var1 = -53 % ((arg0 - 24) / 32);
        return class373.field5422 == 0 ? class265.field3845 : true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 - arg3) >= class87.field1227 && class299.field4382 >= arg3 + arg6 && arg5 - arg3 >= class379.field5521 && class125.field1751 >= (arg3 + arg5)) {
            class351.method2314(arg0, arg5, arg6, arg1, arg4, arg3, 0);
        } else {
            class162.method1004(arg1, arg3, 1150835649, arg4, arg0, arg5, arg6);
        }
        field168++;
        if (arg2 <= 54) {
            field167 = null;
        }
    }
}
