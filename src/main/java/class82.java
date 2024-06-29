import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class82 {

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1542 = 0;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1537 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Ldg;")
    public static class276 field1538 = new class276(4);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[I")
    public static int[] field1550 = new int[128];

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lvf;")
    public static class265 field1551 = class87.method582(-46, "settings");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1549;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
    public static final void method562(int arg0, int arg1, int arg2, int arg3) {
        field1541++;
        class178 var4 = class188.method1282(arg0, 11, 261360480);
        var4.method1162(true);
        var4.field3172 = arg2;
        if (arg3 == 0) {
            var4.field3170 = arg1;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method563(byte arg0) {
        field1538 = null;
        field1549 = null;
        field1550 = null;
        field1551 = null;
        if (arg0 != -12) {
            field1551 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Lvj;")
    public final class88 method564(int arg0) {
        class88 var2 = (class88) class231.field4086.method1887(120, (long) this.field1546);
        field1540++;
        if (arg0 != 28756) {
            field1549 = null;
        }
        if (var2 != null) {
            return var2;
        }
        class88 var3 = class244.method1624(-10506, class221.field3963, 0, this.field1546);
        if (var3 != null) {
            class231.field4086.method1892(var3, (long) this.field1546, (byte) 122);
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZILng;)V")
    private final void method565(int arg0, boolean arg1, int arg2, class135 arg3) {
        if (arg0 == 1) {
            this.field1546 = arg3.method927(127);
        } else if (arg0 == 2) {
            this.field1545 = arg3.method920((byte) 73);
            this.field1539 = arg3.method920((byte) 68);
        }
        field1548++;
        if (arg1) {
            method566(-109);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static final void method566(int arg0) {
        if (arg0 >= 72) {
            class23.field679.method1893(-67);
            field1544++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBLng;)V")
    public final void method567(int arg0, byte arg1, class135 arg2) {
        if (arg1 > -119) {
            return;
        }
        while (true) {
            int var4 = arg2.method920((byte) 115);
            if (var4 == 0) {
                field1543++;
                return;
            }
            this.method565(var4, false, arg0, arg2);
        }
    }
}
