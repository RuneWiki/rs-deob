import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class450 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2716(int arg0) {
        if (arg0 != 26) {
            return;
        }
        field6640++;
        for (class32 var1 = (class32) class96.field1395.method1970(arg0 + 38); var1 != null; var1 = (class32) class96.field1395.method1960(24)) {
            if (class123.method791(var1.field485, -47)) {
                class346.method2206(-7445, var1);
            }
        }
        if (class12.field201 == 1) {
            class455.field6680 = false;
            class244.method1627(class455.field6686, class439.field6536, class148.field2128, class107.field1519, (byte) -31);
            return;
        }
        class244.method1627(class455.field6686, class439.field6536, class148.field2128, class107.field1519, (byte) -31);
        int var2 = class472.field6901.method45(class167.field2428.method2335((byte) -100, class288.field4292), (byte) -95);
        for (class32 var3 = (class32) class96.field1395.method1970(64); var3 != null; var3 = (class32) class96.field1395.method1960(24)) {
            int var4 = class66.method441(var3, (byte) -117);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class455.field6686 = var2 + 8;
        class148.field2128 = (class207.field2923 ? 26 : 22) + class12.field201 * 16;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V", line = 56)
    public static final void method2717(int arg0, byte arg1) {
        field6637++;
        class377 var2 = class99.method672(arg0, false, 1);
        int var3 = 65 % ((27 - arg1) / 34);
        var2.method2339(-11688);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V", line = 68)
    public static final void method2718(int arg0, int arg1, int arg2, int arg3) {
        field6639++;
        if (arg3 != -1011) {
            method2716(-67);
        }
        if (arg0 == 1012) {
            class291.method1882(class85.field1167, arg1, arg2);
        } else if (arg0 == 1011) {
            class291.method1882(class362.field5617, arg1, arg2);
        } else if (arg0 == 1001) {
            class291.method1882(class158.field2300, arg1, arg2);
            return;
        } else if (arg0 == 1010) {
            class291.method1882(class142.field2060, arg1, arg2);
            return;
        } else if (arg0 == 1002) {
            class291.method1882(class29.field457, arg1, arg2);
            return;
        }
    }
}
