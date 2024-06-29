import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class336 extends class220 {

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    public static int field4964 = 104;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "[Lkj;")
    public static class236[] field4958 = new class236[14];

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ol", name = "Z", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class336() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)Z")
    public static final boolean method2227(int arg0, int arg1, int arg2) {
        field4965++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class404 var3 = class165.method1020(arg0, arg1 ^ 0xFFFFA74C);
        if (arg1 == 22693) {
            if (arg2 >= 5 && arg2 <= 8) {
                arg2 = 4;
            }
            return var3.method2619(arg2, (byte) 40);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lqj;ILqj;)V")
    public static final void method2228(class238 arg0, int arg1, class238 arg2) {
        field4963++;
        class311.field4453 = arg0;
        class158.field2077 = arg2;
        class311.field4453.method1476(34, (byte) -72);
        if (arg1 != -21443) {
            method2231((byte) -40, 7);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lqj;ILqj;Lfj;)V")
    public static final void method2229(class238 arg0, int arg1, class238 arg2, class399 arg3) {
        class295.field4254 = arg3;
        field4957++;
        class280.field4119 = arg2;
        class189.field2576 = arg0;
        if (class280.field4119 != null) {
            class94.field1300 = class280.field4119.method1476(1, (byte) -72);
        }
        if (arg1 == 1 && class189.field2576 != null) {
            class329.field4732 = class189.field2576.method1476(1, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(B)V")
    public static void method2230(byte arg0) {
        if (arg0 < 4) {
            method2233(-44, -19);
        }
        field4958 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)V")
    public static final void method2231(byte arg0, int arg1) {
        int var2 = 107 / ((-arg0 - 62) / 60);
        field4967++;
        if (class126.method864((byte) -92, arg1)) {
            class35.method290(-1, 0, class119.field1607[arg1]);
        }
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
    public static final void method2232(int arg0) {
        if (arg0 > -26) {
            method2233(58, -85);
        }
        class70.field967 = -1;
        field4962++;
        class169.field2214 = 0;
        class82.field1154 = -1;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(II)V")
    public static final void method2233(int arg0, int arg1) {
        class169.field2222 = arg1;
        class291.field4211 = arg0;
        class115.field1564 = -1;
        field4959++;
        class363.method2383(arg0 ^ 0xFFFFFF83);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 == -11543) {
            field4966++;
            return class160.field2096;
        } else {
            return null;
        }
    }
}
