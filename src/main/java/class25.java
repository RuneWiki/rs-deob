import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class25 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lok;")
    public static class146 field438 = class235.method1724(-12908, "blinken3:");

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lok;")
    public static class146 field446 = class235.method1724(-12908, ":trade:");

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[I")
    public static int[] field444 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lok;")
    public static class146 field442 = class235.method1724(-12908, "cross");

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field437 = -1;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "[I")
    public static int[] field447;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "[Lan;")
    public static class315[] field448;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 4)
    public static void method167(boolean arg0) {
        if (!arg0) {
            field439 = -100;
        }
        field448 = null;
        field442 = null;
        field446 = null;
        field438 = null;
        field447 = null;
        field444 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lwe;B)Lci;", line = 21)
    public static final class194 method168(class47 arg0, byte arg1) {
        field440++;
        int var2 = 57 % ((arg1 - 21) / 44);
        class194 var3 = new class194(arg0.method337(-1), arg0.method337(-1), arg0.method379(-2), arg0.method379(-2), arg0.method373((byte) 36), arg0.method368(43) == 1, arg0.method368(65));
        int var4 = arg0.method368(-121);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field3220.method1258(0, new class138(arg0.method379(-2), arg0.method379(-2), arg0.method379(-2), arg0.method379(-2)));
        }
        var3.method1499((byte) 121);
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 53)
    public static final void method169(byte arg0, Component arg1) {
        if (arg0 == 102) {
            arg1.removeKeyListener(class157.field2648);
            field441++;
            arg1.removeFocusListener(class157.field2648);
            class185.field3093 = -1;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V", line = 84)
    public static final void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            method169((byte) 103, (Component) null);
        }
        if (arg2 < arg4) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class81.field1297[var5][arg0] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class81.field1297[var6][arg0] = arg1;
            }
        }
        field445++;
    }
}
