import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class86 extends class354 {

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Luf;")
    public static class310 field1182 = new class310(77, -2);

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "F")
    public static float field1190 = 1.0F;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Luf;")
    public static class310 field1189 = new class310(12, 6);

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lvh;")
    public static class240 field1188;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "[I")
    public static int[] field1191;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILuo;)I", line = 11)
    public static final int method602(int arg0, class405 arg1) {
        field1187++;
        class336 var2 = arg1.field5623;
        if (var2.field4612 != null) {
            var2 = var2.method1860(class453.field6623, (byte) -38);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != -1) {
            field1191 = null;
        }
        int var3 = var2.field4626;
        class21 var4 = arg1.method165((byte) -115);
        if (arg1.field317) {
            var3 = var2.field4581;
        } else if (arg1.field328 == var4.field257 || arg1.field328 == var4.field236 || arg1.field328 == var4.field232 || arg1.field328 == var4.field260) {
            var3 = var2.field4592;
        } else if (arg1.field328 == var4.field259 || arg1.field328 == var4.field263 || arg1.field328 == var4.field225 || arg1.field328 == var4.field222) {
            var3 = var2.field4572;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIILir;ILir;III)V", line = 48)
    public static final void method603(int arg0, int arg1, int arg2, int arg3, class22 arg4, int arg5, class22 arg6, int arg7, int arg8, int arg9) {
        field1184++;
        int var10 = arg4.method162((byte) 88);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class529 var12 = (class529) class183.field2559.method56((long) var10, 59);
        if (var12 == null) {
            class531[] var13 = class531.method3129(class192.field2735, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class418.field6109.method482(var13[0], true);
            class183.field2559.method73((long) var10, var12, 26425);
        }
        class239.method1384(arg1 >> 1, arg6.method167(-1) * 64, (byte) 22, 0, arg3, arg6.field464, arg5 >> 1, arg6.field461, arg6.field466, arg2);
        int var14 = class172.field2457[0] + arg8 - 18;
        int var15 = arg7 / 4 * 18 + var14;
        int var16 = arg0 + class172.field2457[1] - 16 - 54;
        int var17 = arg7 % 4 * 18 + var16;
        var12.method3111(var15, var17);
        if (arg4 == arg6) {
            class418.field6109.method1003(-256, 18, 1, var15 - 1, var17 + -1, 18);
        }
        class430 var18 = class506.method2971(arg9 - 6585);
        var18.field6262 = arg4;
        var18.field6263 = var17;
        if (arg9 == 6487) {
            var18.field6272 = var15;
            var18.field6264 = var17 + 16;
            var18.field6271 = var15 + 16;
            class428.field6257.method2310(var18, arg9 ^ 0xFFFFB380);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLtf;II)V", line = 116)
    public static final void method604(byte arg0, class192 arg1, int arg2, int arg3) {
        if (arg1.field271 == arg3 && arg3 != -1) {
            class467 var4 = class275.field3740.method1484(0, arg3);
            int var5 = var4.field6826;
            if (var5 == 1) {
                arg1.field273 = 0;
                arg1.field335 = 0;
                arg1.field325 = arg2;
                arg1.field342 = 1;
                arg1.field345 = 0;
                class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var4, arg1.field273, 126, arg1.field464);
            }
            if (var5 == 2) {
                arg1.field345 = 0;
            }
        } else if (arg3 == -1 || arg1.field271 == -1 || class275.field3740.method1484(0, arg3).field6810 >= class275.field3740.method1484(0, arg1.field271).field6810) {
            arg1.field363 = arg1.field368;
            arg1.field345 = 0;
            arg1.field335 = 0;
            arg1.field271 = arg3;
            arg1.field342 = 1;
            arg1.field273 = 0;
            arg1.field325 = arg2;
            if (arg1.field271 != -1) {
                class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, class275.field3740.method1484(0, arg1.field271), arg1.field273, -6, arg1.field464);
            }
        }
        field1183++;
        if (arg0 <= 46) {
            method603(-90, 107, -52, -7, null, 85, null, 107, 32, -127);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILa;I)V", line = 166)
    public static final void method605(int arg0, class436 arg1, int arg2) {
        if (arg0 != 18) {
            field1182 = null;
        }
        class424.field6189 = false;
        class282.field3806 = 0;
        field1186++;
        class300.method1717(arg1, (byte) 110);
        class222.method1303(32768, arg1);
        if (class424.field6189) {
            System.out.println("---endgpp---");
        }
        if (arg1.field5069 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field5069 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 186)
    public static void method606(boolean arg0) {
        field1188 = null;
        field1189 = null;
        field1182 = null;
        if (!arg0) {
            field1191 = null;
        }
    }
}
