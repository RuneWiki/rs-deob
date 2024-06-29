import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class265 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Ltl;")
    private static class59 field4578 = class85.method639("wishes to trade with you)3", 9588);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field4577 = 0;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Ltl;")
    public static class59 field4579 = field4578;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Ltl;")
    public static class59 field4581 = class85.method639("M", 9588);

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Ltl;")
    public static class59 field4582 = class85.method639("<br>", 9588);

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4576 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Lqg;", line = 4)
    public static final class129 method1834(byte arg0, int arg1) {
        field4575++;
        if (arg0 != -39) {
            return (class129) null;
        }
        class129 var2 = (class129) class161.field2617.method1483((byte) -74, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class308.field5224.method2042(class279.method1954(-537128537, arg1), class60.method504(arg1, -87), (byte) -128);
        class129 var4 = new class129();
        if (var3 != null) {
            var4.method950(new class170(var3), arg0 - 14821);
        }
        var4.method947(false);
        class161.field2617.method1488((long) arg1, var4, arg0 + 25877);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 35)
    public static final void method1835(boolean arg0) {
        if (arg0) {
            class120.field2010 = class212.field3465;
            class97.field1558 = class4.field57;
            class45.field725 = class221.field3587;
        } else {
            class120.field2010 = class64.field990;
            class97.field1558 = class239.field3993;
            class45.field725 = class213.field3485;
        }
        class105.field1732 = class120.field2010.length;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 61)
    public static void method1836(int arg0) {
        field4578 = null;
        if (arg0 < 45) {
            method1835(false);
        }
        field4582 = null;
        field4581 = null;
        field4579 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIZ)I", line = 85)
    public static final int method1837(int arg0, int arg1, int arg2, boolean arg3) {
        field4580++;
        int var4 = arg1 & 0x3;
        if (arg3) {
            method1837(-39, -35, 16, true);
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Ltl;", line = 127)
    public static final class59 method1838(int arg0, int arg1) {
        if (arg0 >= -97) {
            field4578 = (class59) null;
        }
        field4574++;
        if (arg1 < 100000) {
            return class233.method1630(new class59[] { class121.field2012, class81.method619((byte) -84, arg1), class243.field4065 }, -2883);
        } else if (arg1 < 10000000) {
            return class233.method1630(new class59[] { class288.field4955, class81.method619((byte) -86, arg1 / 1000), class140.field2330, class243.field4065 }, -2883);
        } else {
            return class233.method1630(new class59[] { class266.field4596, class81.method619((byte) -84, arg1 / 1000000), class116.field1920, class243.field4065 }, -2883);
        }
    }
}
