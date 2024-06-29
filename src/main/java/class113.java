import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class113 extends class60 {

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1626 = 0;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1623 = 0;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field1622 = 0;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1627 = "Face here";

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Z")
    public static boolean field1624 = true;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Leh;")
    public static class137 field1630;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Leh;")
    public static class137 field1631;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method743(byte arg0) {
        field1630 = null;
        field1631 = null;
        field1627 = null;
        if (arg0 != 116) {
            method744(70, -56, -14, 84, -34, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIB)V")
    public static final void method744(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class288.field4590[0].method915(arg4, arg3);
        int var6 = (arg1 - 32) * arg1 / arg0;
        field1628++;
        int var7 = -24 / ((arg5 + 36) / 37);
        class288.field4590[1].method915(arg4, arg3 + arg1 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var8 = (arg1 - var6 - 32) * arg2 / (arg0 - arg1);
        class217.method1526(arg4, arg3 + 16, 16, arg1 - 32, class275.field4396);
        class217.method1526(arg4, arg3 - (-var8 - 16), 16, var6, class111.field1591);
        class217.method1539(arg4, var8 + arg3 + 16, var6, class237.field3916);
        class217.method1539(arg4 + 1, var8 + 16 + arg3, var6, class237.field3916);
        class217.method1530(arg4, arg3 + var8 + 16, 16, class237.field3916);
        class217.method1530(arg4, var8 + arg3 + 17, 16, class237.field3916);
        class217.method1539(arg4 + 15, arg3 + var8 + 16, var6, class70.field863);
        class217.method1539(arg4 + 14, arg3 - (-17 - var8), var6 - 1, class70.field863);
        class217.method1530(arg4, arg3 + 15 - (-var8 - var6), 16, class70.field863);
        class217.method1530(arg4 + 1, var6 + 14 + arg3 - -var8, 15, class70.field863);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static final void method745(int arg0) {
        class289.field4604 = null;
        class271.field4336 = null;
        class34.field434 = null;
        if (arg0 <= 48) {
            return;
        }
        class107.field1441 = null;
        class161.field2569 = null;
        class143.field2260 = null;
        class180.field2867 = null;
        class128.field2060 = null;
        class186.field2967 = null;
        class230.field3747 = null;
        class50.field646 = null;
        class35.field449 = null;
        field1625++;
    }
}
