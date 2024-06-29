import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class155 extends class228 {

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    private int field2162;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
    public static int[] field2163 = new int[200];

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lmc;")
    public static class78 field2161 = new class78(32, 3);

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2170 = -1;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "B")
    public static byte field2169;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
    public static void method909(boolean arg0) {
        field2163 = null;
        if (!arg0) {
            field2161 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public final void method180(int arg0, int arg1, int arg2) {
        ++field2164;
        if (arg0 != 0) {
            method909(false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
    public final void method178(int arg0, int arg1, int arg2) {
        ++field2165;
        int var4 = this.field2168 * arg1 >> 12;
        int var5 = this.field2160 * arg1 >> 12;
        if (arg0 < 119) {
            method909(true);
        }
        int var6 = this.field2166 * arg2 >> 12;
        int var7 = this.field2162 * arg2 >> 12;
        class124.method762(var4, super.field3001, super.field2999, -275139932, var6, var5, var7, super.field3002);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V")
    public class155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2166 = arg1;
        this.field2168 = arg0;
        this.field2160 = arg2;
        this.field2162 = arg3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V")
    public final void method181(int arg0, byte arg1, int arg2) {
        ++field2167;
        int var4 = this.field2168 * arg2 >> 12;
        int var5 = this.field2160 * arg2 >> 12;
        int var6 = this.field2166 * arg0 >> 12;
        int var7 = this.field2162 * arg0 >> 12;
        if (arg1 != -103) {
            this.method178(44, -19, -26);
        }
        class451.method2653(var7, 0, var5, var4, var6, super.field3001);
    }
}
