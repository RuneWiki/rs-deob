import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class23 extends class68 {

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Z")
    public static boolean field350 = false;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Lve;")
    public static class255 field355 = class87.method607(63, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field354 = 0;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Lrg;")
    public static class88 field352;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Z")
    public static boolean field353;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V", line = 4)
    public static void method126(byte arg0) {
        field355 = null;
        int var1 = 115 % ((50 - arg0) / 45);
        field352 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 33)
    public static final void method127(int arg0, Component arg1) {
        arg1.removeKeyListener(class60.field917);
        field356++;
        arg1.removeFocusListener(class60.field917);
        if (arg0 >= 54) {
            class82.field1333 = -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V", line = 46)
    public static final void method128(int arg0, byte arg1) {
        field349++;
        class53 var2 = class303.method2112(-1155040160, arg0, 1);
        int var3 = 72 % ((arg1 - 19) / 57);
        var2.method326(78);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZJ)V", line = 60)
    public static final void method129(boolean arg0, long arg1) {
        field351++;
        if (arg1 == 0L || !arg0) {
            return;
        }
        for (int var3 = 0; var3 < class29.field453; var3++) {
            if (class114.field1933[var3] == arg1) {
                class29.field453--;
                class102.field1720++;
                for (int var4 = var3; var4 < class29.field453; var4++) {
                    class114.field1933[var4] = class114.field1933[var4 + 1];
                    class184.field2969[var4] = class184.field2969[var4 + 1];
                }
                class251.field4224 = class251.field4240;
                class255.field4318.method1523(22260, 22);
                class255.field4318.method449(16711680, arg1);
                break;
            }
        }
    }
}
