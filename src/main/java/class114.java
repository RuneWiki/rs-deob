import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class114 {

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "[I")
    public static int[] field1601 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public static int field1602 = -1;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "Llu;")
    public static class610 field1604 = new class610(2, -1);

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "Lrm;")
    public static class349 field1605;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "Lra;")
    public static class92 field1608;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "[Lsa;")
    public static class176[] field1609;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILvn;I)V", line = 4)
    public static final void method823(int arg0, class261 arg1, int arg2) {
        if (class423.field5717) {
            arg0 = 0;
            class423.field5717 = false;
        }
        field1606++;
        if (arg2 != -1) {
            field1604 = null;
        }
        if (class583.field8568 != null && class583.field8568.method1660((byte) 91, arg1)) {
            return;
        }
        class583.field8568 = arg1;
        class378.field5212 = class598.method3538(true);
        class465.field6534 = arg0;
        class585.field8596 = arg0;
        if (class585.field8596 == 0) {
            class115.method830(7);
            return;
        }
        class11.field107 = class630.field9259;
        class216.field3176 = class584.field8576;
        class484.field6900 = class168.field2630;
        class227.field3314 = class644.field9377;
        class306.field4206 = class149.field2211;
        class387.field5318 = class451.field6369;
        class403.field5516 = class198.field2924;
        class234.field3385 = class138.field1966;
        class113.field1593 = class115.field1625;
        class253.field3655 = class377.field5205;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V", line = 44)
    public static void method824(byte arg0) {
        field1609 = null;
        field1601 = null;
        field1608 = null;
        field1605 = null;
        if (arg0 != -110) {
            method825(-71, 98, -56, -61, 57);
        }
        field1604 = null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIII)V", line = 78)
    public static final void method825(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1603++;
        if (arg4 != 2) {
            field1610 = 10;
        }
        class221 var5 = class65.method413(4, arg3, (byte) 123);
        var5.method1426((byte) 76);
        var5.field3220 = arg2;
        var5.field3208 = arg1;
        var5.field3214 = arg0;
    }
}
