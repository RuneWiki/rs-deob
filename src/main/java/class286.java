import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class286 {

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[S")
    public static short[] field5080 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field5076 = 0;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lc;")
    public static class106 field5078 = new class106(0, 0);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILid;)I")
    public static final int method1962(int arg0, class149 arg1) {
        if (arg0 != 18241) {
            field5081 = -110;
        }
        field5077++;
        return arg1.method1053((byte) -12) + 1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method1963(byte arg0) {
        field5078 = null;
        if (arg0 == -81) {
            field5080 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLmk;)Lmk;")
    public abstract class103 method1442(byte arg0, class103 arg1);
}
