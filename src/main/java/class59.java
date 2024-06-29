import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class59 extends class146 {

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field1020 = 0;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1021 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lue;")
    public static class209 field1013;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V")
    public static final void method457(byte arg0, int arg1) {
        if (arg0 < 120) {
            method459(-11);
        }
        class23 var2 = class91.method694(arg1, 4, 125);
        field1015++;
        var2.method183(-81);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V")
    public static final void method458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= 17) {
            field1021 = null;
        }
        if (class32.field540 <= arg2 && class61.field1034 >= arg1 && arg3 >= class108.field1650 && class154.field2509 >= arg0) {
            class48.method416(arg5, arg3, arg2, true, arg1, arg0);
        } else {
            class3.method16(arg1, 0, arg0, arg2, arg3, arg5);
        }
        field1017++;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(II)V")
    public class59(int arg0, int arg1) {
        this.field1016 = arg1;
        this.field1014 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method459(int arg0) {
        int var1 = -30 / ((12 - arg0) / 54);
        field1013 = null;
        field1021 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZIZILjava/lang/String;IZIJLjava/lang/String;)V")
    public static final void method460(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, String arg5, int arg6, boolean arg7, int arg8, long arg9, String arg10) {
        field1018++;
        if (arg4 != 22439) {
            field1020 = 89;
        }
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class136 var14 = new class136(128);
        var14.method966((byte) 101, 10);
        var14.method971(arg4 - 18647, (arg3 ? 4 : 0) | (arg1 ? 1 : 0) | (arg7 ? 2 : 0));
        var14.method967((byte) -8, arg9);
        var14.method1029(var12[0], 15430);
        var14.method1028(14630, arg10);
        var14.method1029(var12[1], arg4 - 7009);
        var14.method971(arg4 - 18647, class252.field4019);
        var14.method966((byte) 44, arg0);
        var14.method966((byte) 54, arg6);
        var14.method1029(var12[2], 15430);
        var14.method971(3792, arg8);
        var14.method971(3792, arg2);
        var14.method1029(var12[3], 15430);
        var14.method985(class145.field2387, (byte) -105, class189.field3103);
        class136 var15 = new class136(350);
        var15.method1028(14630, arg5);
        int var16 = 8 - (class65.method499(89, arg5) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method966((byte) 86, (int) (Math.random() * 255.0D));
        }
        var15.method990(var12, 89);
        class87.field1405.field2231 = 0;
        class87.field1405.method966((byte) 101, 22);
        class87.field1405.method971(3792, var14.field2231 + var15.field2231 + 2);
        class87.field1405.method971(3792, 538);
        class87.field1405.method965(0, var14.field2263, var14.field2231, -105);
        class87.field1405.method965(0, var15.field2263, var15.field2231, 89);
        class69.field1167 = 1;
        class97.field1504 = 0;
        class130.field2157 = 0;
        class285.field4532 = -3;
    }
}
