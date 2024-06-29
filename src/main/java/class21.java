import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class21 extends class325 {

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Ljava/lang/String;")
    public static String field238 = "Loading...";

    @OriginalMember(owner = "client!i", name = "N", descriptor = "Ljava/lang/String;")
    public static String field243 = "Loading interfaces - ";

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "C")
    private char field246;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "Ljava/lang/String;")
    public String field240;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field237++;
        if (class234.field3569 <= arg2 - arg3 && class322.field4965 >= (arg2 + arg3) && (arg4 - arg3) >= class212.field3261 && (arg3 + arg4) <= class182.field2888) {
            class260.method1832(arg4, arg2, arg6, (byte) 118, arg5, arg3, arg0);
        } else {
            class180.method1346(arg6, arg3, arg5, arg0, arg4, (byte) 94, arg2);
        }
        if (arg1 != -1578491071) {
            field238 = (String) null;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Z", line = 23)
    public final boolean method166(int arg0) {
        if (arg0 > -125) {
            method165(64, -82, -62, 102, 29, 69, -21);
        }
        field236++;
        return this.field246 == 's';
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILwm;)V", line = 34)
    public final void method167(int arg0, class254 arg1) {
        if (arg0 != -1099860570) {
            return;
        }
        field242++;
        while (true) {
            int var3 = arg1.method1774((byte) 75);
            if (var3 == 0) {
                return;
            }
            this.method168(var3, arg1, arg0 ^ 0xBE7175FC);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILwm;I)V", line = 58)
    private final void method168(int arg0, class254 arg1, int arg2) {
        if (arg0 == 1) {
            this.field246 = class338.method2359(arg1.method1733(2023893896), 3213);
        } else if (arg0 == 2) {
            this.field239 = arg1.method1741(-32769);
        } else if (arg0 == 5) {
            this.field240 = arg1.method1778(1258);
        }
        if (arg2 > 65) {
            field244++;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIIILqh;III)V", line = 82)
    public static final void method169(byte arg0, int arg1, int arg2, int arg3, int arg4, class32 arg5, int arg6, int arg7, int arg8) {
        field245++;
        int var9 = arg7 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg5.field416;
            var11 = arg5.field413;
        } else {
            var10 = arg5.field413;
            var11 = arg5.field416;
        }
        int var12;
        int var13;
        if (arg8 + var10 > 104) {
            var12 = arg8;
            var13 = arg8 + 1;
        } else {
            var13 = (var10 + 1 >> 1) + arg8;
            var12 = (var10 >> 1) + arg8;
        }
        int var14;
        int var15;
        if (arg1 + var11 > 104) {
            var14 = arg1 + 1;
            var15 = arg1;
        } else {
            var14 = (var11 + 1 >> 1) + arg1;
            var15 = (var11 >> 1) + arg1;
        }
        int var16 = (arg1 << 7) + (var11 << 6);
        int[][] var17 = class203.field3111[arg3];
        int var18 = (arg8 << 7) + (var10 << 6);
        int var19 = var17[var14][var12] + var17[var15][var13] + var17[var15][var12] + var17[var14][var13] >> 2;
        int var20 = 0;
        if (arg3 != 0) {
            int[][] var21 = class203.field3111[0];
            var20 = var19 - (var21[var15][var12] + var21[var15][var13] + var21[var14][var12] + var21[var14][var13] >> 2);
        }
        if (arg0 != 30) {
            return;
        }
        int[][] var22 = (int[][]) null;
        if (arg3 < 3) {
            var22 = class203.field3111[arg3 + 1];
        }
        class214 var23 = arg5.method257((class42) null, var22, arg4, var18, false, 63, var19, true, arg7, var17, var16);
        class125.method937(var23.field3289, var16 - arg2, var20, var18 - arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIZ)V", line = 162)
    public static final void method170(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class75.field1091 = arg1;
        class115.field1818 = arg2;
        class341.field5290 = arg3;
        class263.field4062 = new class79[arg0][class75.field1091][class115.field1818];
        class79.field1151 = new int[arg0][class75.field1091 + 1][class115.field1818 + 1];
        if (class73.field1058) {
            class319.field4929 = new class58[4][];
        }
        if (arg4) {
            class67.field967 = new class79[1][class75.field1091][class115.field1818];
            class78.field1137 = new int[class75.field1091][class115.field1818];
            class71.field1024 = new int[1][class75.field1091 + 1][class115.field1818 + 1];
            if (class73.field1058) {
                class134.field2034 = new class58[1][];
            }
        } else {
            class67.field967 = (class79[][][]) null;
            class78.field1137 = (int[][]) null;
            class71.field1024 = (int[][][]) null;
            class134.field2034 = (class58[][]) null;
        }
        class8.method81(false);
        class262.field4047 = new class339[500];
        class298.field4582 = 0;
        class51.field687 = new class339[500];
        class101.field1463 = 0;
        class96.field1378 = new int[arg0][class75.field1091 + 1][class115.field1818 + 1];
        class192.field2994 = new class228[5000];
        class31.field370 = 0;
        class146.field2226 = new class228[100];
        class278.field4320 = new boolean[class341.field5290 + class341.field5290 + 1][class341.field5290 + class341.field5290 + 1];
        class300.field4626 = new boolean[class341.field5290 + class341.field5290 + 2][class341.field5290 + class341.field5290 + 2];
        class78.field1142 = new byte[arg0][class75.field1091][class115.field1818];
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 219)
    public static final void method171(int arg0, int arg1) {
        class130 var2 = (class130) class29.field355.method1716(-1, (long) arg1);
        field241++;
        if (var2 == null) {
            return;
        }
        if (arg0 != 1) {
            method172((byte) 70);
        }
        for (int var3 = 0; var3 < var2.field1995.length; var3++) {
            var2.field1995[var3] = -1;
            var2.field1998[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V", line = 243)
    public static void method172(byte arg0) {
        field238 = null;
        int var1 = 11 % ((arg0 - 61) / 37);
        field243 = null;
    }
}
