import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class171 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Ljd;")
    public static class265 field2865 = new class265(4);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lsc;")
    public static class181 field2869 = class149.method967(255, "floorshadows");

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lsc;")
    public static class181 field2871 = class149.method967(255, "Versteckt");

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
    public static int[] field2870 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILaf;IJIIII)Z")
    public static final boolean method1131(int arg0, int arg1, int arg2, int arg3, class208 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class77.method534(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1132(byte arg0) {
        field2870 = null;
        field2865 = null;
        int var1 = 108 % ((arg0 + 58) / 33);
        field2871 = null;
        field2869 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIIB)V")
    public static final void method1133(int[] arg0, int arg1, int arg2, int arg3, byte arg4) {
        arg1--;
        field2867++;
        int var11 = arg3 - 1;
        int var5 = var11 - 7;
        if (arg4 <= 124) {
            field2869 = null;
        }
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg0[var6] = arg2;
            int var7 = var6 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var12 = var10 + 1;
            arg0[var12] = arg2;
            int var13 = var12 + 1;
            arg0[var13] = arg2;
            arg1 = var13 + 1;
            arg0[arg1] = arg2;
        }
        while (arg1 < var11) {
            arg1++;
            arg0[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILo;II)V")
    public static final void method1134(int arg0, int arg1, class175 arg2, int arg3, int arg4) {
        field2868++;
        if (class25.field439 >= 3) {
            class17.method153(arg1, arg3, 0, arg2.field2968, arg2.field3055);
        } else {
            ((class48) class143.field2326).method340(arg1, arg3, arg2.field3057, arg2.field3041, class143.field2326.field1757 / 2, class143.field2326.field1756 / 2, class214.field3682, 256, arg2.field2968, arg2.field3055);
        }
        class114.field1849[arg4] = true;
        if (arg0 != 32) {
            field2871 = null;
        }
    }
}
