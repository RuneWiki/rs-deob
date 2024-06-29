import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class84 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Z")
    public static boolean field1593 = true;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1599 = 2;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1602 = 0;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1600 = -1;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lhh;")
    private static class163 field1601 = class137.method1065("Loading fonts )2 ", 17);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lhh;")
    public static class163 field1595 = field1601;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method673(byte arg0) {
        field1595 = null;
        if (arg0 <= 110) {
            field1600 = -124;
        }
        field1601 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public static final void method674(int arg0, int arg1) {
        field1592++;
        if (arg1 <= -88) {
            class193.field3522.method112(arg0, 121);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)[Lrh;")
    public static final class242[] method675(byte arg0) {
        class242[] var1 = new class242[field1594];
        field1597++;
        if (arg0 >= -62) {
            method673((byte) -110);
        }
        for (int var2 = 0; var2 < field1594; var2++) {
            var1[var2] = new class242(class107.field2043, class2.field36, class65.field1107[var2], class180.field3267[var2], class256.field4478[var2], class257.field4505[var2], class223.field4070[var2], class111.field2097);
        }
        class67.method463(124);
        return var1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)V")
    public static final void method676(byte arg0, int arg1, int arg2) {
        class213.field3881[arg1] = arg2;
        if (arg0 >= -55) {
            field1599 = -97;
        }
        field1603++;
        class127 var3 = (class127) class169.field3093.method1743((long) arg1, false);
        if (var3 == null) {
            class127 var4 = new class127(4611686018427387905L);
            class169.field3093.method1741(var4, false, (long) arg1);
        } else if (var3.field2468 != 4611686018427387905L) {
            var3.field2468 = class7.method55(0) + 500L | 0x4000000000000000L;
        }
    }
}
