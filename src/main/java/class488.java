import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class488 {

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "[I")
    public static int[] field7132 = new int[6];

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field7136 = -1;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field7138 = 0;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZZZ)V")
    public static final void method2946(boolean arg0, boolean arg1, boolean arg2) {
        field7130++;
        if (arg1) {
            class455.field6767++;
            class108.method852((byte) 76);
        }
        if (arg0) {
            class383.field5639++;
            class326.method2143(120);
        }
        if (arg2) {
            method2947(null, null, 3);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/Object;Lgt;I)V")
    public static final void method2947(Object arg0, class66 arg1, int arg2) {
        field7131++;
        if (arg1.field1058 == null) {
            return;
        }
        int var3 = 0;
        if (arg2 < 64) {
            method2948(false, 105, (byte) 61, -58, 96);
        }
        while (var3 < 50 && arg1.field1058.peekEvent() != null) {
            class468.method2848(1L, (byte) 95);
            var3++;
        }
        if (arg0 != null) {
            arg1.field1058.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZIBII)V")
    public static final void method2948(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7135++;
        int var5 = -31 / ((-arg2 - 51) / 36);
        if (class108.field1631 == 0) {
            class20.method126(false, -80);
        } else {
            class12.field134 = class108.field1631;
            class155.method1127(0, -43);
        }
        class533.field7786 = arg0;
        class425.field6339 = arg4;
        class251.field4087 = arg3;
        class362.method2300(arg1);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public static void method2949(int arg0) {
        if (arg0 >= -50) {
            method2948(true, -51, (byte) -24, -110, 107);
        }
        field7132 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)V")
    public static final void method2950(byte arg0, int arg1) {
        field7137++;
        class188 var2 = class10.method48((byte) 91, 3, arg1);
        var2.method1306(-23128);
        if (arg0 > -10) {
            field7136 = 21;
        }
    }
}
