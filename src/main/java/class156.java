import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class156 extends class522 {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    private int field2132;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    private int field2133;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    private int field2136;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    private int field2137;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lhg;")
    public static class693 field2134 = new class693(2, 18);

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static void method1091(int arg0) {
        field2134 = null;
        if (arg0 != -941985236) {
            field2139 = 27;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public final void method1092(int arg0, int arg1, int arg2) {
        ++field2138;
        int var4 = this.field2136 * arg1 >> 12;
        if (arg2 != 2048) {
            method1091(-47);
        }
        int var5 = this.field2137 * arg1 >> 12;
        int var6 = this.field2133 * arg0 >> 12;
        int var7 = this.field2132 * arg0 >> 12;
        class411.method2302(super.field7318, 0, var4, super.field7312, super.field7313, var6, var7, var5);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
    public final void method1093(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.method1093(-92, -93, 84);
        }
        ++field2135;
        int var4 = this.field2136 * arg0 >> 12;
        int var5 = this.field2137 * arg0 >> 12;
        int var6 = this.field2133 * arg2 >> 12;
        int var7 = this.field2132 * arg2 >> 12;
        class427.method2448(var5, super.field7318, var6, (byte) 10, super.field7313, var4, var7);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V")
    public final void method1094(boolean arg0, int arg1, int arg2) {
        ++field2140;
        int var4 = this.field2136 * arg2 >> 12;
        if (!arg0) {
            int var5 = this.field2137 * arg2 >> 12;
            int var6 = this.field2133 * arg1 >> 12;
            int var7 = this.field2132 * arg1 >> 12;
            class431.method2467(super.field7312, var7, var4, var5, var6, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIII)V")
    public class156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2132 = arg3;
        this.field2133 = arg1;
        this.field2136 = arg0;
        this.field2137 = arg2;
    }
}
