import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class146 extends class117 {

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static volatile int field2099 = 0;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2102 = new String[100];

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field2106 = -1;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field2103 = -1;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Lma;")
    public static class301 field2104;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "Z")
    public boolean field2110;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)I", line = 8)
    public final int method1038(byte arg0) {
        int var2 = 96 / ((arg0 + 18) / 61);
        field2100++;
        return 1;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)Z", line = 33)
    public final boolean method1039(int arg0) {
        if (arg0 != 100) {
            this.method78(-26, 124, -90, 32, 116);
        }
        field2105++;
        return false;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Z", line = 44)
    public final boolean method1040(int arg0) {
        field2101++;
        if (arg0 != -1) {
            this.method78(-114, 40, 121, 44, 53);
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()I", line = 57)
    public int method77() {
        field2108++;
        return 0;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Z", line = 79)
    public final boolean method1041(int arg0) {
        if (arg0 != -32197) {
            this.field2110 = false;
        }
        field2107++;
        return this.field2110;
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(I)V", line = 92)
    public static void method1042(int arg0) {
        field2104 = null;
        if (arg0 > 90) {
            field2102 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()Z")
    public abstract boolean method75();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
    public abstract void method78(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public abstract void method76(int arg0);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()Z")
    public abstract boolean method73();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public abstract void method79(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
    public abstract void method74();
}
