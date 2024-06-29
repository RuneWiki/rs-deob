import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class232 extends class171 {

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Llc;")
    public static class160 field3870 = new class160();

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field3875 = 0;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field3877 = 0;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Lok;")
    public static class146 field3879 = class235.method1724(-12908, "details");

    @OriginalMember(owner = "client!of", name = "A", descriptor = "[I")
    public static int[] field3878 = new int[2];

    @OriginalMember(owner = "client!of", name = "D", descriptor = "Lok;")
    public static class146 field3881 = class235.method1724(-12908, ")1");

    @OriginalMember(owner = "client!of", name = "E", descriptor = "[[[I")
    public static int[][][] field3882 = new int[2][][];

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "J")
    public long field3874;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Lml;")
    public static class129 field3876;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lof;")
    public class232 field3869;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lof;")
    public class232 field3871;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V", line = 5)
    public static void method1701(int arg0) {
        field3882 = (int[][][]) null;
        field3878 = null;
        if (arg0 == 25446) {
            field3881 = null;
            field3870 = null;
            field3879 = null;
            field3876 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V", line = 22)
    public static final void method1702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3872++;
        int var6 = arg4 - arg0;
        int var7 = arg2 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class226.method1670(arg1, (byte) 97, arg2, arg0, arg3);
            }
        } else if (var7 == 0) {
            class298.method2111(arg1, arg4, arg0, (byte) -126, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class151.field2564 > arg4) {
                var10 = (class151.field2564 * var8 >> 12) + var9;
                var11 = class151.field2564;
            } else if (arg4 > class126.field2058) {
                var10 = var9 + (class126.field2058 * var8 >> 12);
                var11 = class126.field2058;
            } else {
                var11 = arg4;
                var10 = arg2;
            }
            int var12;
            int var13;
            if (class151.field2564 > arg0) {
                var12 = (class151.field2564 * var8 >> 12) + var9;
                var13 = class151.field2564;
            } else if (class126.field2058 >= arg0) {
                var12 = arg3;
                var13 = arg0;
            } else {
                var12 = var9 + (class126.field2058 * var8 >> 12);
                var13 = class126.field2058;
            }
            if (class123.field2008 > var12) {
                var12 = class123.field2008;
                var13 = (class123.field2008 - var9 << 12) / var8;
            } else if (class318.field5394 < var12) {
                var13 = (class318.field5394 - var9 << 12) / var8;
                var12 = class318.field5394;
            }
            if (var10 < class123.field2008) {
                var11 = (class123.field2008 - var9 << 12) / var8;
                var10 = class123.field2008;
            } else if (var10 > class318.field5394) {
                var11 = (class318.field5394 - var9 << 12) / var8;
                var10 = class318.field5394;
            }
            class295.method2102(var11, arg1, var13, var12, 79, var10);
            if (arg5 >= -119) {
                field3881 = (class146) null;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 143)
    public final void method1703(byte arg0) {
        int var2 = -42 / ((arg0 - 27) / 42);
        field3868++;
        if (this.field3869 != null) {
            this.field3869.field3871 = this.field3871;
            this.field3871.field3869 = this.field3869;
            this.field3869 = null;
            this.field3871 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V", line = 163)
    public static final void method1704(byte arg0) {
        field3873++;
        if (arg0 == 39) {
            class177.field3000.method793((byte) -49);
        }
    }
}
