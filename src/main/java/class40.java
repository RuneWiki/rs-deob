import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class40 extends class132 {

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "[I")
    public static int[] field881 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "Lvd;")
    public static class222 field886 = class212.method1357("Bitte benutzen Sie eine andere Welt)3", 10731);

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Lvd;")
    public class222 field878;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "Lab;")
    public static class3 field884;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "[Lvd;")
    public class222[] field879;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public static void method315(int arg0) {
        field886 = null;
        if (arg0 == 0) {
            field884 = null;
            field881 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lba;I)Lvd;")
    public static final class222 method316(class13 arg0, int arg1) {
        field882++;
        if (class153.method981(true, class221.method1405(arg0, (byte) -93)) == 0) {
            return null;
        } else if (arg0.field371 == null || arg0.field371.method1407((byte) -122).method1444(-41) == 0) {
            return class168.field3211 ? class7.field108 : null;
        } else {
            if (arg1 != 17438) {
                method316(null, -66);
            }
            return arg0.field371;
        }
    }
}
