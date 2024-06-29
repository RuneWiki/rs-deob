import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class268 implements class20 {

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "Lnha;")
    public class686 field4133;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "Ljn;")
    public class322 field4141;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "Ltm;")
    public static class334 field4137 = new class334(106, 5);

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "Ltm;")
    public static class334 field4140 = new class334(98, 20);

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "[I")
    public static int[] field4143;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)Lvj;", line = 5)
    public class26 method117(int arg0) {
        field4135++;
        if (arg0 != 1) {
            field4140 = null;
        }
        return class540.field7709;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)I", line = 18)
    public static final int method1777(int arg0, int arg1, int arg2) {
        if (arg0 != 60) {
            field4143 = null;
        }
        field4136++;
        int var3 = class476.method2894(arg2 + 45365, 26567, arg1 + 91923, 4) - (-(class476.method2894(arg2 + 10294, 26567, arg1 + 37821, 2) + -128 >> 1) + -(class476.method2894(arg2, 26567, arg1, 1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V", line = 48)
    public static void method1778(int arg0) {
        field4140 = null;
        field4143 = null;
        field4137 = null;
        if (arg0 != -128) {
            field4137 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)I", line = 60)
    public static final int method1779(byte arg0) {
        field4139++;
        if (arg0 != 55) {
            field4140 = null;
        }
        return class400.field5929++;
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(ILnha;Ljn;II)V", line = 78)
    public class268(int arg0, class686 arg1, class322 arg2, int arg3, int arg4) {
        this.field4138 = arg0;
        this.field4134 = arg3;
        this.field4142 = arg4;
        this.field4133 = arg1;
        this.field4141 = arg2;
    }
}
