import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class608 extends class570 {

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    private int field8863;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    private int field8857;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    private int field8861;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    private int field8852;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field8859 = 0;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[I")
    public static int[] field8853 = new int[14];

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "F")
    public static float field8860;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lq;")
    public static class396 field8854;

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIII)V")
    public class608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field8863 = arg3;
        this.field8857 = arg2;
        this.field8861 = arg1;
        this.field8852 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)I")
    public static final int method3498(int arg0, byte arg1) {
        ++field8858;
        int var2 = 0;
        if (arg0 < 0 || ~arg0 <= -65537) {
            arg0 >>>= 16;
            var2 += 16;
        }
        int var3 = -93 / ((arg1 - 38) / 51);
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (~arg0 <= -17) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIB)V")
    public final void method279(int arg0, int arg1, byte arg2) {
        ++field8862;
        if (arg2 != 127) {
            this.field8863 = 77;
        }
        int var4 = this.field8852 * arg1 >> 12;
        int var5 = this.field8857 * arg1 >> 12;
        int var6 = this.field8861 * arg0 >> 12;
        int var7 = this.field8863 * arg0 >> 12;
        class292.method1948(var4, super.field8296, var7, super.field8298, var5, super.field8297, var6, (byte) 99);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public final void method280(int arg0, int arg1, int arg2) {
        ++field8855;
        int var4 = this.field8852 * arg0 >> 12;
        int var5 = this.field8857 * arg0 >> 12;
        int var6 = this.field8861 * arg2 >> 12;
        int var7 = this.field8863 * arg2 >> 12;
        class184.method1350(var5, arg1 + 65497, var6, var4, super.field8296, var7);
        if (arg1 != 38) {
            field8860 = -0.2866355F;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZI)V")
    public final void method282(int arg0, boolean arg1, int arg2) {
        ++field8856;
        int var4 = this.field8852 * arg0 >> 12;
        if (!arg1) {
            int var5 = this.field8857 * arg0 >> 12;
            int var6 = this.field8861 * arg2 >> 12;
            int var7 = this.field8863 * arg2 >> 12;
            class42.method564(super.field8298, super.field8297, var5, var6, 0, var4, var7);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method3499(int arg0) {
        int var1 = 4 % ((arg0 - 63) / 40);
        field8853 = null;
        field8854 = null;
    }
}
