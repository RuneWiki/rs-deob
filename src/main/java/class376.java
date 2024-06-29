import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class376 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Ldd;")
    public static class680 field5262;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lac;")
    public static class712[] field5268;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[[Z")
    public static boolean[][] field5266;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method2278(int arg0, String arg1) {
        if (arg0 != -5) {
            method2282(-86, -72, 122, null, 122, 46, true, null);
        }
        field5271++;
        return class368.field5201.containsKey(arg1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public abstract void method1975(int arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILeq;IZ)Lmba;")
    public static final class77 method2279(int arg0, int arg1, class357 arg2, int arg3, boolean arg4) {
        field5265++;
        if (arg4) {
            method2284((byte) 49, null);
        }
        if (!arg2.field5082 && (!class487.method2850((byte) -61, arg3) || !class487.method2850((byte) -107, arg0))) {
            return arg2.field5017 ? new class77(arg2, 34037, arg1, arg3, arg0) : new class77(arg2, arg1, arg3, arg0, class353.method2103(43, arg3), class353.method2103(89, arg0));
        } else {
            return new class77(arg2, 3553, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public abstract void method1972(int arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III[I)V")
    public abstract void method1977(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    public abstract void method1963(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III[I)V")
    public abstract void method1974(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method2280(byte arg0) {
        if (arg0 > -69) {
            method2282(-12, 116, 119, null, 117, -21, true, null);
        }
        field5268 = null;
        field5266 = null;
        field5262 = null;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public abstract void method1964(int arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()Lwc;")
    public abstract class376 method1965();

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III[I)V")
    public abstract void method1971(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIFIF[FIII[FBIIF)V")
    public static final void method2281(int arg0, int arg1, float arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, int arg8, float[] arg9, byte arg10, int arg11, int arg12, float arg13) {
        int var14 = arg12 - arg7;
        field5263++;
        int var15 = arg11 - arg1;
        int var16 = arg6 - arg8;
        float var17 = arg9[2] * (float) var15 + arg9[0] * (float) var14 + arg9[1] * (float) var16;
        int var18 = -125 % ((32 - arg10) / 42);
        float var19 = arg9[5] * (float) var15 + arg9[3] * (float) var14 + arg9[4] * (float) var16;
        float var20 = arg9[8] * (float) var15 + arg9[7] * (float) var16 + arg9[6] * (float) var14;
        float var21;
        float var22;
        if (arg3 == 0) {
            var21 = arg2 + var17 + 0.5F;
            var22 = arg4 + 0.5F - var20;
        } else if (arg3 == 1) {
            var21 = arg2 + var17 + 0.5F;
            var22 = arg4 + var20 + 0.5F;
        } else if (arg3 == 2) {
            var22 = arg13 + 0.5F - var19;
            var21 = arg2 + 0.5F - var17;
        } else if (arg3 == 3) {
            var22 = arg13 + 0.5F - var19;
            var21 = arg2 + var17 + 0.5F;
        } else if (arg3 == 4) {
            var22 = arg13 + 0.5F - var19;
            var21 = arg4 + var20 + 0.5F;
        } else {
            var22 = arg13 + 0.5F - var19;
            var21 = arg4 + 0.5F - var20;
        }
        if (arg0 == 1) {
            float var24 = var21;
            var21 = -var22;
            var22 = var24;
        } else if (arg0 == 2) {
            var22 = -var22;
            var21 = -var21;
        } else if (arg0 == 3) {
            float var23 = var21;
            var21 = var22;
            var22 = -var23;
        }
        arg5[0] = var21;
        arg5[1] = var22;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public abstract void method1967(int arg0);

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public abstract void method1959(int arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILha;IIZLjava/lang/String;)V")
    public static final void method2282(int arg0, int arg1, int arg2, class454 arg3, int arg4, int arg5, boolean arg6, String arg7) {
        field5264++;
        if (class572.field7983 == null || class1.field5 == null) {
            if (class645.field8897.method3827(class572.field7991, (byte) 126) && class645.field8897.method3827(class477.field6806, (byte) 78)) {
                class572.field7983 = arg3.method60(class196.method1231(class645.field8897, class572.field7991, 0), true);
                class196 var8 = class196.method1231(class645.field8897, class477.field6806, 0);
                class1.field5 = arg3.method60(var8, true);
                var8.method1226();
                class499.field7048 = arg3.method60(var8, true);
            } else {
                arg3.method167(arg4, arg5, arg1, arg2, 255 - class28.field458 << 24 | class276.field3494, 1);
            }
        }
        if (class572.field7983 != null && class1.field5 != null) {
            int var9 = (arg1 - (class1.field5.method1895() * 2)) / class572.field7983.method1895();
            for (int var10 = 0; var10 < var9; var10++) {
                class572.field7983.method3929(class1.field5.method1895() + arg4 + var10 * class572.field7983.method1895(), arg5);
            }
            class1.field5.method3929(arg4, arg5);
            class499.field7048.method3929(arg1 + arg4 - class499.field7048.method1895(), arg5);
        }
        class100.field1234.method2505(class210.field2694 | 0xFF000000, -1, arg7, arg4 + 3, arg5 + 14, 255);
        if (arg6) {
            field5262 = null;
        }
        arg3.method167(arg4, arg2 + arg5, arg1, arg0 - arg2, -class28.field458 + 255 << 24 | class276.field3494, 1);
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    public abstract void method1976(int arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([I)V")
    public abstract void method1968(int[] arg0);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)Z")
    public static final boolean method2283(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field5268 = null;
        }
        field5269++;
        return (arg1 & 0x40000) != 0 | class117.method788(arg1, arg0 ^ 0xFFFFA300, arg2) || class34.method315(arg2, arg1, (byte) -47);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)V")
    public abstract void method1973(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwc;)V")
    public abstract void method1961(class376 arg0);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
    public abstract void method1962();

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2284(byte arg0, String arg1) {
        field5270++;
        if (arg0 != -10) {
            method2280((byte) -89);
        }
        String var2 = class81.method578(arg0 ^ 0xFFFFFFD3, class331.method1947(arg1, (byte) 56));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
