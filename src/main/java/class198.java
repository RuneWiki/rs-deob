import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class198 extends class317 {

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field3095;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "Lpu;")
    public static class179 field3096 = new class179("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public static void method1408(byte arg0) {
        if (arg0 < -23) {
            field3096 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)Z")
    public static final boolean method1409(int arg0, byte arg1) {
        field3097++;
        if (arg1 <= 29) {
            method1409(69, (byte) -80);
        }
        return arg0 == 0 || arg0 == 1;
    }

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "(I)Z")
    public final boolean method1410(int arg0) {
        field3094++;
        if (arg0 != 8816) {
            this.field3095 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lbg;Ljava/lang/Object;I)V")
    public class198(class278 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3095 = arg1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1411(boolean arg0) {
        if (!arg0) {
            method1409(112, (byte) 73);
        }
        field3093++;
        return this.field3095;
    }
}
