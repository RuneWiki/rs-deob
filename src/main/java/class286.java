import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class286 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[[I")
    public static int[][] field4334 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field4336 = 0;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[[B")
    public static byte[][] field4337;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1846(int arg0, int arg1) {
        field4338++;
        class211 var2 = class452.method2749(7, arg0 - 519, arg1);
        if (arg0 == 504) {
            var2.method1460(true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V", line = 23)
    public static final void method1847(int arg0, int arg1, int arg2) {
        class138 var3 = client.field3311[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2115 != null) {
            var3.field2115 = null;
        }
        if (var3.field2106 != null) {
            var3.field2106 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 43)
    public static void method1848(int arg0) {
        field4337 = null;
        if (arg0 != 0) {
            field4334 = null;
        }
        field4334 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLul;)V", line = 55)
    public static final void method1849(boolean arg0, class406 arg1) {
        field4335++;
        class299.field4546 = arg1.method2537("p11_full", 72);
        class309.field4661 = arg1.method2537("p12_full", 73);
        class460.field6695 = arg1.method2537("b12_full", 84);
        class284.field4315 = arg1.method2537("hitmarks", 72);
        class260.field3982 = arg1.method2537("hitbar_default", -116);
        class60.field722 = arg1.method2537("timerbar_default", -61);
        class138.field2120 = arg1.method2537("headicons_pk", 89);
        class24.field300 = arg1.method2537("headicons_prayer", 107);
        class454.field6614 = arg1.method2537("hint_headicons", 83);
        class88.field1265 = arg1.method2537("hint_mapmarkers", 86);
        class106.field1497 = arg1.method2537("mapflag", -107);
        class367.field5399 = arg1.method2537("cross", 111);
        class156.field2318 = arg1.method2537("mapdots", 106);
        class22.field274 = arg1.method2537("scrollbar", -105);
        class239.field3827 = arg1.method2537("name_icons", 92);
        class345.field5099 = arg1.method2537("floorshadows", 101);
        if (arg0) {
            class289.field4362 = arg1.method2537("compass", 81);
            class270.field4132 = arg1.method2537("otherlevel", -128);
            class291.field4402 = arg1.method2537("hint_mapedge", 80);
        }
    }
}
