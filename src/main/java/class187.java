import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class187 extends class130 {

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field2706 = -1;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "[Lok;")
    public static class61[] field2702 = new class61[14];

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
    public static boolean field2712 = false;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Lrk;")
    public static class427 field2705;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lrk;")
    public static class427 field2707;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Ljava/lang/String;")
    public String field2700;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Ljava/lang/String;")
    public String field2713;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method1353(boolean arg0, int arg1) {
        if (arg1 == 5) {
            ++field2710;
            if (arg0 == !class153.field2334) {
                class153.field2334 = arg0;
                class445.method2755(false);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)Lmb;", line = 20)
    public final class260 method1354(byte arg0) {
        if (arg0 <= 22) {
            method1357(86, 41, 100);
        }
        ++field2703;
        return class368.field5052[super.field1856];
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V", line = 32)
    public static void method1355(int arg0) {
        field2707 = null;
        int var1 = 123 / ((arg0 - 64) / 53);
        field2705 = null;
        field2702 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrk;Lrk;B)V", line = 57)
    public static final void method1356(class427 arg0, class427 arg1, byte arg2) {
        ++field2711;
        class218.field3033 = arg1;
        class288.field3856 = arg0;
        if (arg2 < 72) {
            method1353(true, -11);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I", line = 80)
    public static final int method1357(int arg0, int arg1, int arg2) {
        if (arg2 >= -115) {
            field2707 = null;
        }
        ++field2709;
        return arg0 != 4 && arg0 != 5 ? 256 : class113.field1600[arg1 & 3];
    }
}
