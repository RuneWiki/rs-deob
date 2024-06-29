import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class315 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4600 = "Loaded update list";

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field4605 = 0;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
    public static int[] field4602 = new int[4096];

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[I")
    public static int[] field4608 = new int[100];

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Z")
    public static boolean field4609 = false;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Lcr;")
    public static class189 field4603 = new class189(4);

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[I")
    public static int[] field4610 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Llm;")
    public static class347 field4604;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[[Lqs;")
    public static class438[][] field4611;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 7)
    public static void method2129(int arg0) {
        field4610 = null;
        field4608 = null;
        field4603 = null;
        field4600 = null;
        field4611 = null;
        field4602 = null;
        if (arg0 > -98) {
            field4604 = null;
        }
        field4604 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZI)I", line = 23)
    public static final int method2130(int arg0, boolean arg1, int arg2) {
        field4601++;
        if (!arg1) {
            field4610 = null;
        }
        int var3 = class171.method1056(arg0 - 1, (byte) -7, arg2 - 1) + class171.method1056(arg0 + 1, (byte) -7, arg2 - 1) + class171.method1056(arg0 + -1, (byte) -7, arg2 + 1) + class171.method1056(arg0 + 1, (byte) -7, arg2 + 1);
        int var4 = class171.method1056(arg0 - 1, (byte) -7, arg2) + class171.method1056(arg0 + 1, (byte) -7, arg2) - (-class171.method1056(arg0, (byte) -7, arg2 + -1) + -class171.method1056(arg0, (byte) -7, arg2 + 1));
        int var5 = class171.method1056(arg0, (byte) -7, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V", line = 84)
    public static final void method2131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 > -35) {
            field4608 = null;
        }
        if (arg4 >= class87.field1227 && arg1 <= class299.field4382 && class379.field5521 <= arg0 && class125.field1751 >= arg2) {
            class399.method2573(arg0, (byte) -46, arg4, arg1, arg5, arg2);
        } else {
            class44.method317(-7209, arg1, arg5, arg4, arg2, arg0);
        }
        field4606++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIII)V", line = 106)
    public static final void method2132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4607++;
        if (arg4 == arg5) {
            class11.method80(arg7, arg1, 99, arg5, arg3, arg0, arg2);
            return;
        }
        if (arg6 != 57) {
            field4603 = null;
        }
        if (arg2 - arg5 >= class87.field1227 && arg2 + arg5 <= class299.field4382 && class379.field5521 <= (arg0 - arg4) && arg0 + arg4 <= class125.field1751) {
            class146.method931(arg2, arg4, arg5, arg3, arg1, arg7, arg0, arg6 ^ 0xE8323998);
        } else {
            class70.method476(arg3, arg5, 28170, arg7, arg1, arg2, arg0, arg4);
        }
    }
}
