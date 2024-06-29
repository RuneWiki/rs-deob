import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class114 extends class97 {

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field2529 = 0;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lea;")
    public static class38 field2530 = class9.method46((byte) 126, "null");

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "[I")
    public static int[] field2533 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field2534 = 0;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2536 = 0;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(II)V")
    public class114(int arg0, int arg1) {
        this.field2532 = arg0;
        this.field2535 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method896(byte arg0) {
        field2530 = null;
        if (arg0 > -3) {
            method896((byte) 84);
        }
        field2533 = null;
    }
}
