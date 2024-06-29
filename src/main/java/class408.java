import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class408 extends class609 {

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "F")
    public static float field5961;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "F")
    public static float field5963;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public int field5956;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public int field5957;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public int field5960;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public int field5962;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "Lvq;")
    public class425 field5959;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIILkg;Lkg;)V")
    public static final void method2467(int arg0, int arg1, int arg2, class244 arg3, class244 arg4) {
        class40 var5 = class151.method1065(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field658 = arg3;
        var5.field669 = arg4;
        int var6 = class499.field7071 == class296.field4340 ? 1 : 0;
        if (!arg3.method1181(-1)) {
            class471.field6741[var6][class127.field1896[var6]++] = arg3;
        } else if (arg3.method1184(-98)) {
            class232.field3618[var6][class59.field1130[var6]++] = arg3;
        } else {
            class496.field7034[var6][class313.field4626[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method1181(-1)) {
            if (arg4.method1184(-124)) {
                class232.field3618[var6][class59.field1130[var6]++] = arg4;
                return;
            }
            class496.field7034[var6][class313.field4626[var6]++] = arg4;
            return;
        }
        class471.field6741[var6][class127.field1896[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static final void method2468(int arg0) {
        field5964++;
        class596.method3370(117);
        if (arg0 <= 125) {
            method2468(71);
        }
        class263.method1730(-1);
    }
}
