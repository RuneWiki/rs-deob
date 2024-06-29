import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class108 extends class259 {

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Z")
    public static boolean field1829 = false;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lmh;")
    public static class263 field1827;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBILrl;)V")
    public static final void method829(int arg0, int arg1, int arg2, byte arg3, int arg4, class301 arg5) {
        field1831++;
        if (arg5.field4861 == -1 && arg5.field4876 == null) {
            return;
        }
        int var6 = class171.field2582 * arg5.field4860 >> 8;
        int var7 = 0;
        if (arg5.field4866 < arg4) {
            var7 += arg4 - arg5.field4866;
        } else if (arg5.field4859 > arg4) {
            var7 += arg5.field4859 - arg4;
        }
        if (arg5.field4871 < arg0) {
            var7 += arg0 - arg5.field4871;
        } else if (arg0 < arg5.field4874) {
            var7 += arg5.field4874 - arg0;
        }
        if (arg5.field4873 == 0 || arg5.field4873 < var7 - 64 || class171.field2582 == 0 || arg5.field4869 != arg1) {
            if (arg5.field4854 != null) {
                class241.field3543.method1248(arg5.field4854);
                arg5.field4854 = null;
            }
            if (arg5.field4852 != null) {
                class241.field3543.method1248(arg5.field4852);
                arg5.field4852 = null;
            }
            return;
        }
        if (arg3 > -110) {
            method829(81, 51, -72, (byte) 123, -45, (class301) null);
        }
        var7 -= 64;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = (arg5.field4873 - var7) * var6 / arg5.field4873;
        if (arg5.field4854 != null) {
            arg5.field4854.method1294(var8);
        } else if (arg5.field4861 >= 0) {
            class178 var9 = class178.method1266(class222.field3255, arg5.field4861, 0);
            if (var9 != null) {
                class105 var10 = var9.method1264().method818(class264.field4236);
                class184 var11 = class184.method1308(var10, 100, var8);
                var11.method1320(-1);
                class241.field3543.method1249(var11);
                arg5.field4854 = var11;
            }
        }
        if (arg5.field4852 != null) {
            arg5.field4852.method1294(var8);
            if (!arg5.field4852.method1780(26)) {
                arg5.field4852 = null;
            }
        } else if (arg5.field4876 != null && (arg5.field4863 -= arg2) <= 0) {
            int var12 = (int) (Math.random() * (double) arg5.field4876.length);
            class178 var13 = class178.method1266(class222.field3255, arg5.field4876[var12], 0);
            if (var13 != null) {
                class105 var14 = var13.method1264().method818(class264.field4236);
                class184 var15 = class184.method1308(var14, 100, var8);
                var15.method1320(0);
                class241.field3543.method1249(var15);
                arg5.field4863 = (int) ((double) (arg5.field4879 - arg5.field4872) * Math.random()) + arg5.field4872;
                arg5.field4852 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
    public static void method830(int arg0) {
        field1827 = null;
        if (arg0 != 0) {
            field1830 = 26;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class108() {
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
    public class108(int arg0) {
        this.field1828 = arg0;
    }
}
