import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class226 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    private int[] field3721;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[[B")
    public static byte[][] field3724 = new byte[50][];

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lvl;")
    public static class164 field3723 = new class164(8);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "F")
    public static float field3726;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[Llb;")
    public static class341[] field3725;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 4)
    public static void method1702(int arg0) {
        field3724 = (byte[][]) null;
        field3725 = null;
        field3723 = null;
        if (arg0 < 122) {
            field3725 = (class341[]) null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I", line = 18)
    public final int method1703(int arg0, int arg1) {
        field3718++;
        int var3 = (this.field3721.length >> 1) - 1;
        int var4 = var3 & arg1;
        if (arg0 != 0) {
            this.method1703(-99, -17);
        }
        while (true) {
            int var5 = this.field3721[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3721[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZIILkc;II)Z", line = 46)
    public static final boolean method1704(int arg0, boolean arg1, int arg2, int arg3, class29 arg4, int arg5, int arg6) {
        class261 var7 = class86.method691(-109, arg4.field363);
        field3722++;
        if (var7.field4388 == -1) {
            return true;
        }
        int var8;
        if (arg4.field401) {
            int var9 = arg4.field378 + arg3;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class341 var10 = var7.method1989(var8, (byte) -9, arg4.field336);
        if (var10 == null) {
            return false;
        }
        int var11 = arg4.field342;
        int var12 = arg4.field414;
        if (arg1) {
            field3726 = 0.9495933F;
        }
        if ((var8 & 0x1) == 1) {
            var12 = arg4.field342;
            var11 = arg4.field414;
        }
        int var13 = var10.field4644;
        int var14 = var10.field4642;
        if (var7.field4404) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field4390 == 0) {
            var10.method2404(arg2 * 4 + 48, (104 - (arg0 + var11)) * 4 + 48, var14, var13);
        } else {
            var10.method2401(arg2 * 4 + 48, (-var11 + 104 - arg0) * 4 + 48, var14, var13, var7.field4390);
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B[I[J)V", line = 106)
    public static final void method1705(byte arg0, int[] arg1, long[] arg2) {
        field3720++;
        if (arg0 >= 26) {
            class314.method2219(arg1, 0, arg2.length - 1, 125, arg2);
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "([I)V", line = 122)
    public class226(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3721 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3721[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3721[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3721[var5 + var5] = arg0[var4];
            this.field3721[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIII)V", line = 167)
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3719++;
        int var10 = -118 / ((arg7 + 56) / 46);
        if (class74.field1269 <= arg5 && arg5 <= class355.field5640 && arg6 >= class74.field1269 && arg6 <= class355.field5640 && class74.field1269 <= arg4 && class355.field5640 >= arg4 && arg3 >= class74.field1269 && class355.field5640 >= arg3 && arg1 >= class296.field4758 && arg1 <= class273.field4522 && class296.field4758 <= arg9 && class273.field4522 >= arg9 && class296.field4758 <= arg0 && class273.field4522 >= arg0 && arg2 >= class296.field4758 && arg2 <= class273.field4522) {
            class316.method2239(124, arg6, arg3, arg2, arg0, arg5, arg9, arg8, arg4, arg1);
        } else {
            class87.method699(arg0, arg5, -52, arg6, arg3, arg4, arg2, arg9, arg1, arg8);
        }
    }
}
