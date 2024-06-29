import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class229 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field3153 = 0;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Luc;")
    public static class51 field3152 = new class51(128);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method1491(byte arg0) {
        field3152 = null;
        if (arg0 > -3) {
            method1493(-84, -122);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method1492(int arg0) {
        field3150++;
        if (class78.field1088 != null) {
            class78.field1088.method2534(false);
        }
        if (class261.field3836 != null) {
            class261.field3836.method2534(false);
        }
        class410.method2592(false, 2, class338.field4993, 22050);
        class78.field1088 = class440.method2750(class63.field948, 0, 22050, arg0 ^ 0x5C37, class422.field6138);
        class78.field1088.method2539(class235.field3280, (byte) 71);
        class261.field3836 = class440.method2750(class63.field948, 1, 2048, 29054, class422.field6138);
        if (arg0 == 11593) {
            class261.field3836.method2539(class40.field602, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Ldr;")
    public static final class266 method1493(int arg0, int arg1) {
        field3151++;
        class266 var2 = (class266) class123.field1589.method378((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -6801) {
            method1492(-80);
        }
        byte[] var3 = class129.field1698.method1235(30, false, arg0);
        class266 var4 = new class266();
        if (var3 != null) {
            var4.method1779(new class341(var3), arg0, 39);
        }
        class123.field1589.method367((long) arg0, var4, true);
        return var4;
    }
}
