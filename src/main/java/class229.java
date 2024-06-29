import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class229 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
    public abstract int method1527(int arg0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BII)V")
    public static final void method1528(byte arg0, int arg1, int arg2) {
        if (arg0 >= 97) {
            field3648++;
            class41 var3 = class221.method1492((byte) -42, arg1, 6);
            var3.method301(8792);
            var3.field584 = arg2;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1529(Component arg0, byte arg1);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1530(Component arg0, int arg1);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public static final void method1531(int arg0, int arg1) {
        field3649++;
        class167.field2612.method1897(true, arg0);
        if (arg1 > 0) {
            class171.field2676.method1897(true, arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
    public static final void method1532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class293.field4621 = class85.field1431 * arg2 / arg3;
        field3646++;
        class4.field27 = -1;
        class201.field3148 = class191.field2970 * arg4 / arg1;
        class250.field4038 = arg0;
        class56.method427(arg0 ^ 0xFFFFFF98);
    }
}
