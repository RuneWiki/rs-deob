import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public abstract class class17 {

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Lua;")
    public static class41 field147 = class16.method86("Short)2cut", true);

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "Lua;")
    public static class41 field144 = class16.method86("Windmill", true);

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "[Z")
    public static boolean[] field148 = new boolean[112];

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "Lua;")
    public static class41 field149 = class16.method86("Apothecary", true);

    @OriginalMember(owner = "mapview!ia", name = "i", descriptor = "Lua;")
    public static class41 field152 = class16.method86("Please wait)3)3)3 Rendering Map", true);

    @OriginalMember(owner = "mapview!ia", name = "k", descriptor = "I")
    public static int field154 = 0;

    @OriginalMember(owner = "mapview!ia", name = "j", descriptor = "Lua;")
    public static class41 field153 = class16.method86("underlay)3dat", true);

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "Lga;")
    public static class13 field145 = new class13();

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "[B")
    public static byte[] field146;

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "[I")
    public static int[] field150;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 14)
    public static void method87(byte arg0) {
        field146 = null;
        field150 = null;
        field148 = null;
        field145 = null;
        field153 = null;
        if (arg0 == -59) {
            field152 = null;
            field144 = null;
            field149 = null;
            field147 = null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 36)
    public static final void method88(Component arg0, int arg1) {
        arg0.removeMouseListener(class19.field156);
        arg0.removeMouseMotionListener(class19.field156);
        int var2 = 59 / ((-arg1 - 17) / 47);
        arg0.removeFocusListener(class19.field156);
        class19.field163 = 0;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(II[Lua;I)V", line = 95)
    public static final void method90(int arg0, int arg1, class41[] arg2, int arg3) {
        if (arg1 == 1) {
            arg2[0].method242(1);
        } else {
            class43.method252(arg1, arg3, arg2, arg0).method242(arg0 + 1);
        }
        if (arg0 != 0) {
            field149 = null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ZII)I")
    public abstract int method89(boolean arg0, int arg1, int arg2);
}
