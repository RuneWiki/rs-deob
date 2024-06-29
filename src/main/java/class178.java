import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class178 {

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Z")
    public boolean field2715 = true;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Llu;")
    public static class610 field2714 = new class610(5, 8);

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "C")
    private char field2717;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Ljava/lang/String;")
    public String field2722;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lgw;II)V")
    private final void method1252(class148 arg0, int arg1, int arg2) {
        if (arg1 != 5) {
            return;
        }
        field2721++;
        if (arg2 == 1) {
            this.field2717 = class387.method2305((byte) -120, arg0.method1062(arg1 ^ 0xFFFFAD39));
        } else if (arg2 == 2) {
            this.field2720 = arg0.method1026(-917302120);
        } else if (arg2 == 4) {
            this.field2715 = false;
        } else if (arg2 == 5) {
            this.field2722 = arg0.method1023(-29153);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method1253(int arg0) {
        field2714 = null;
        if (arg0 != 8) {
            method1253(-32);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lgw;I)V")
    public final void method1254(class148 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                field2719++;
                if (arg1 != 5) {
                    method1255(1);
                    return;
                }
                return;
            }
            this.method1252(arg0, 5, var3);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static final void method1255(int arg0) {
        field2712++;
        if (class313.field4317 == 6) {
            class313.field4317 = 7;
            if (arg0 != 5) {
                field2714 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1256(int arg0, String arg1) {
        field2716++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class304.field4180; var2++) {
            if (arg1.equalsIgnoreCase(class538.field8010[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class541.field8119.field5138);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Z")
    public final boolean method1257(byte arg0) {
        if (arg0 >= -99) {
            method1253(70);
        }
        field2718++;
        return this.field2717 == 's';
    }
}
