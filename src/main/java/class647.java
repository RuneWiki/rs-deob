import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class647 extends class222 {

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    private int field8999;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    private int field9002;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    private int field8997;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    private int field9000;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "[I")
    public static int[] field9005 = new int[500];

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lni;")
    public static class522 field9003;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    private static final void method3644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~arg3 <= ~class122.field1604 && ~class165.field2070 <= ~arg1 && ~arg7 <= ~class759.field10576 && class29.field238 >= arg5) {
            class627.method3541(arg4, arg6, arg1, arg3, false, arg7, arg5, arg2);
        } else {
            class184.method1039(arg4, arg5, arg3, arg6, arg1, -18907, arg7, arg2);
        }
        if (arg0 == 1701353708) {
            ++field9006;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 27)
    public static void method3645(byte arg0) {
        field9003 = null;
        if (arg0 != 72) {
            method3645((byte) 50);
        }
        field9005 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V", line = 38)
    public final void method1268(int arg0, int arg1, int arg2) {
        int var4 = -52 / ((-3 - arg0) / 32);
        ++field8998;
        int var5 = this.field9000 * arg1 >> 12;
        int var6 = this.field8997 * arg1 >> 12;
        int var7 = this.field9002 * arg2 >> 12;
        int var8 = this.field8999 * arg2 >> 12;
        class222.method1267(super.field2872, var8, -80, var6, var5, var7);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BII)V", line = 56)
    public final void method1269(byte arg0, int arg1, int arg2) {
        int var4 = 49 / ((arg0 - 50) / 38);
        ++field9004;
        int var5 = this.field9000 * arg2 >> 12;
        int var6 = this.field8997 * arg2 >> 12;
        int var7 = this.field9002 * arg1 >> 12;
        int var8 = this.field8999 * arg1 >> 12;
        class111.method748(super.field2868, var6, (byte) -51, super.field2871, var5, var7, var8);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V", line = 74)
    public final void method1264(int arg0, int arg1, int arg2) {
        ++field9001;
        int var4 = this.field9000 * arg0 >> 12;
        if (arg2 == -5515) {
            int var5 = this.field8997 * arg0 >> 12;
            int var6 = this.field9002 * arg1 >> 12;
            int var7 = this.field8999 * arg1 >> 12;
            method3644(1701353708, var5, super.field2872, var4, super.field2868, var7, super.field2871, var6);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIII)V", line = 99)
    public class647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field8999 = arg3;
        this.field9002 = arg1;
        this.field8997 = arg2;
        this.field9000 = arg0;
    }
}
