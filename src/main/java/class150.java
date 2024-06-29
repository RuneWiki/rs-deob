import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class150 {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[[I")
    public static int[][] field2072 = new int[128][128];

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field2075 = 12;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Lwl;")
    public static class452 field2074 = new class452(3, 2);

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "[S")
    public static short[] field2077 = new short[] { 57, 49, 11, 5, 10, 18, 58, 15 };

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[I")
    public static int[] field2078 = new int[2];

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "F")
    public static float field2071;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
    public static int[] field2070;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZIIIZ)V")
    public static final void method933(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class402.field6007 = arg3;
        class413.field6136 = arg5;
        class328.field4927 = arg4;
        field2073++;
        if (arg2) {
            field2070 = null;
        }
        class341.field5105 = arg0;
        class438.field6452 = arg1;
        if (arg6 && class438.field6452 >= 100) {
            class196.field2967 = class341.field5105 * 128 + 64;
            class185.field2790 = class402.field6007 * 128 + 64;
            class127.field1626 = class437.method2686(class143.field1911, 0, class196.field2967, class185.field2790) - class413.field6136;
        }
        class80.field1054 = 2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static final void method934(int arg0) {
        class302.field4570.method1482((byte) 107);
        field2076++;
        if (arg0 != 10) {
            method935(-17);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static final void method935(int arg0) {
        field2069++;
        class19.field257 = new class358(8);
        class204.field3062 = 0;
        class336 var1 = (class336) class261.field3979.method2127(-1489721243);
        if (arg0 != 1970) {
            method934(78);
        }
        while (var1 != null) {
            var1.method2056();
            var1 = (class336) class261.field3979.method2126(-75);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static void method936(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2070 = null;
        field2078 = null;
        field2077 = null;
        field2072 = null;
        field2074 = null;
    }
}
