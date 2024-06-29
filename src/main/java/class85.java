import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class85 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[Lmi;")
    public static class139[] field1640 = new class139[6];

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lqe;")
    public static class179 field1641 = class206.method1380("Verbinde mit Server)3)3)3", (byte) 100);

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lqe;")
    public static class179 field1642 = class206.method1380("leuchten3:", (byte) -127);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
    public static int[] field1643;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method150(int arg0, Component arg1);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
    public abstract int method149(int arg0);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method148(Component arg0, int arg1);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI)Z")
    public static final boolean method574(boolean arg0, int arg1) {
        field1639++;
        if (!arg0) {
            method575(null, -92, 16, -4);
        }
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lrb;III)V")
    public static final void method575(class186 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class39.field834) {
            class197 var4 = class229.field4232[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3681 != null && var4.field3681.field1028.method1261()) {
                arg0.method1259(var4.field3681.field1028, 128, 0, 0, true);
            }
        }
        if (arg3 < class39.field834) {
            class197 var5 = class229.field4232[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3681 != null && var5.field3681.field1028.method1261()) {
                arg0.method1259(var5.field3681.field1028, 0, 0, 128, true);
            }
        }
        if (arg2 < class39.field834 && arg3 < class33.field719) {
            class197 var6 = class229.field4232[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3681 != null && var6.field3681.field1028.method1261()) {
                arg0.method1259(var6.field3681.field1028, 128, 0, 128, true);
            }
        }
        if (arg2 < class39.field834 && arg3 > 0) {
            class197 var7 = class229.field4232[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3681 != null && var7.field3681.field1028.method1261()) {
                arg0.method1259(var7.field3681.field1028, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public static void method576(boolean arg0) {
        field1641 = null;
        if (arg0) {
            field1642 = null;
            field1643 = null;
            field1640 = null;
        }
    }
}
