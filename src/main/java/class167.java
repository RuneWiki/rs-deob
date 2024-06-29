import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class167 {

    @OriginalMember(owner = "client!os", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2421 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!os", name = "f", descriptor = "Lrc;")
    public static class108 field2426 = new class108(8, 1);

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method1215(int arg0, int arg1) {
        class218.field3162 = true;
        field2422++;
        class162.field2361 = arg0 + arg1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZ)V", line = 21)
    public static final void method1216(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field2425++;
            class334 var3 = class352.method2172(arg0, 7, 16711935);
            var3.method2104(0);
            var3.field4648 = arg1;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 35)
    public static void method1217(boolean arg0) {
        field2426 = null;
        if (!arg0) {
            field2426 = null;
        }
        field2421 = null;
    }
}
