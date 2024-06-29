import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class261 extends class254 {

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Z")
    public static volatile boolean field3939 = true;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "[I")
    public static int[] field3938 = new int[14];

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field3936 = -1;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field3943 = 50;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)I")
    public static final int method1743(int arg0, int arg1) {
        if (arg1 != -1) {
            field3943 = -50;
        }
        field3937++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static void method1744(int arg0) {
        if (arg0 >= -64) {
            method1743(79, -103);
        }
        field3938 = null;
    }
}
