import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class18 {

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[[I")
    public static int[][] field361 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field358;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[[[B")
    public static byte[][][] field363;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 6)
    public static final void method135(int arg0) {
        int var1 = -31 / ((arg0 + 25) / 57);
        field357++;
        Container var2;
        if (field358 != null) {
            var2 = field358;
        } else if (class144.field2418 == null) {
            var2 = class232.field3876.field2162;
        } else {
            var2 = class144.field2418;
        }
        class72.field1173 = var2.getSize().width;
        class248.field4170 = var2.getSize().height;
        if (class144.field2418 == var2) {
            Insets var3 = class144.field2418.getInsets();
            class72.field1173 -= var3.left + var3.right;
            class248.field4170 -= var3.top + var3.bottom;
        }
        if (class157.method1228(1) < 2) {
            class63.field1091 = (class72.field1173 - 765) / 2;
            class56.field997 = 503;
            class148.field2518 = 765;
            class310.field5284 = 0;
        } else {
            class310.field5284 = 0;
            class148.field2518 = class72.field1173;
            class63.field1091 = 0;
            class56.field997 = class248.field4170;
        }
        if (class271.field4640) {
            class271.method1970(class148.field2518, class56.field997);
        }
        class75.field1228.setSize(class148.field2518, class56.field997);
        if (class144.field2418 == var2) {
            Insets var4 = class144.field2418.getInsets();
            class75.field1228.setLocation(class63.field1091 + var4.left, var4.top - -class310.field5284);
        } else {
            class75.field1228.setLocation(class63.field1091, class310.field5284);
        }
        if (class236.field3943 != -1) {
            class76.method555(true, 0);
        }
        class206.method1561(true);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 72)
    public static void method136(int arg0) {
        field363 = (byte[][][]) null;
        if (arg0 != 128) {
            field361 = (int[][]) ((int[][]) null);
        }
        field361 = (int[][]) null;
        field358 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ)V", line = 88)
    public static final void method137(boolean arg0, boolean arg1) {
        field359++;
        if (!arg0) {
            method137(false, true);
        }
        if (arg1 != class292.field4966) {
            class292.field4966 = arg1;
            class184.method1446(-126);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)Lok;", line = 105)
    public static final class146 method138(int arg0) {
        field360++;
        class146 var1 = class294.field4986;
        class146 var2 = class161.field2740;
        if (class22.field408 != 0) {
            var1 = class4.field32;
        }
        if (arg0 >= -8) {
            return (class146) null;
        } else {
            if (class139.field2318 != null) {
                var2 = class112.method758(-100, new class146[] { class313.field5351, class139.field2318 });
            }
            return class112.method758(-94, new class146[] { class187.field3117, var1, class63.field1087, class82.method585(14744, class14.field263), class165.field2797, class82.method585(14744, class92.field1468), var2, class145.field2422 });
        }
    }
}
