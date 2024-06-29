import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class317 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4950 = 0;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[I")
    public static int[] field4951 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[I")
    public static int[] field4952 = new int[] { 3, 2, -1, 0, 0, 0, 3, 0, 2, 0, 0, 7, 1, 8, 0, 0, 0, 0, 3, 0, -2, 0, 0, 0, 0, 12, 0, -2, 8, 0, 0, 10, 0, 2, 0, 6, 0, 15, 0, 0, 0, 0, 0, 4, 11, 0, 10, 3, 0, 0, -1, 0, 0, -1, -2, 0, 0, 0, 6, 0, 3, 0, 0, 0, 3, 5, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, 20, 17, 0, 0, 0, 0, 6, 5, 0, -1, 0, 0, 0, 7, 0, 3, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 14, -1, 0, 4, 0, 8, -2, 0, 28, 3, 8, 8, -1, 6, -1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 12, 0, 5, 0, 0, -1, 0, 8, 0, 0, 0, 1, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 0, 0, 0, 6, 0, -1, 10, 0, 8, 0, 10, 8, 2, 0, -2, -1, 0, 6, 9, 0, 2, -1, 0, 0, 0, 0, 2, 0, 0, 0, 6, 0, 7, 12, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 7, 0, 0, -1, 4, -2, 1, 0, 0, 0, 5, 6, 0, 6, 0, 0, 8, 0, -2, 0, 0, -2, 0, 1, -1, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 12, 0, -1, 0, 0, 0, 0, 0, 0, 0, 6 };

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4955 = " ";

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Ll;")
    public static class133 field4954;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lclient;")
    public static client field4958;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V", line = 8)
    public static final void method2154(int arg0, int arg1) {
        class60.field979 = 20;
        class32.field464 = 3;
        if (arg1 == 0) {
            class254.field3996 = arg0;
            field4953++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjava/lang/String;)I", line = 35)
    public static final int method2155(byte arg0, String arg1) {
        int var2 = -57 / ((arg0 + 70) / 53);
        field4957++;
        if (arg1 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class225.field3579; var3++) {
            if (arg1.equalsIgnoreCase(class51.field828[var3])) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V", line = 64)
    public static final void method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 + arg0;
        field4956++;
        int var8 = arg0 + arg4;
        int var9 = arg2 - arg0;
        int var10 = arg6 - arg0;
        for (int var11 = arg5; var11 < var7; var11++) {
            class272.method1876(class34.field525[var11], arg6, arg4, arg1, (byte) -41);
        }
        if (arg3 != 0) {
            field4954 = (class133) null;
        }
        for (int var12 = arg2; var12 > var9; var12--) {
            class272.method1876(class34.field525[var12], arg6, arg4, arg1, (byte) -25);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class34.field525[var13];
            class272.method1876(var14, var8, arg4, arg1, (byte) -47);
            class272.method1876(var14, arg6, var10, arg1, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 117)
    public static void method2157(int arg0) {
        field4958 = null;
        field4952 = null;
        if (arg0 == 2) {
            field4955 = null;
            field4954 = null;
            field4951 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[II[Ljava/lang/Object;B)V", line = 132)
    public static final void method2158(int arg0, int[] arg1, int arg2, Object[] arg3, byte arg4) {
        field4959++;
        if (arg4 != -97) {
            method2155((byte) 14, (String) null);
        }
        if (arg0 <= arg2) {
            return;
        }
        int var5 = (arg0 + arg2) / 2;
        int var6 = arg2;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var7;
        Object var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg2; var9 < arg0; var9++) {
            if (((var9 & 0x1) + var7) > arg1[var9]) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                Object var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg1[arg0] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var8;
        method2158(var6 - 1, arg1, arg2, arg3, (byte) -97);
        method2158(arg0, arg1, var6 + 1, arg3, (byte) -97);
    }
}
