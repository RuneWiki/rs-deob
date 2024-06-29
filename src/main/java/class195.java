import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class195 {

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "Lhs;")
    public static class304 field2295 = new class304();

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "F")
    public static float field2301;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "Lpfa;")
    public static class275 field2300;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIII[B)V", line = 10)
    public static final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg4 != 1917) {
            return;
        }
        field2296++;
        if (arg1 >= arg2) {
            return;
        }
        int var6 = arg1 + arg3;
        int var7 = arg2 - arg1 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg2 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V", line = 42)
    public static void method1145(int arg0) {
        field2295 = null;
        field2300 = null;
        if (arg0 != 26436) {
            method1144(-108, -52, -120, -93, -51, null);
        }
    }

    @OriginalMember(owner = "client!dga", name = "toString", descriptor = "()Ljava/lang/String;", line = 53)
    public final String toString() {
        field2297++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V", line = 62)
    public static final void method1146(byte arg0) {
        field2298++;
        if (arg0 >= -74) {
            return;
        }
        for (int var1 = 0; var1 < class367.field4732.length; var1++) {
            for (int var2 = 0; var2 < class367.field4732[var1].length; var2++) {
                class367.field4732[var1][var2] = class593.field7959;
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Loa;IZIII)V", line = 89)
    public static final void method1147(class650 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        arg0.method403(arg5, arg1, arg4 + arg5, arg1 + arg3);
        if (arg2) {
            method1147(null, -114, true, -81, 20, -61);
        }
        field2299++;
        arg0.method3630((byte) 70, arg4, arg1, arg5, -16777216, arg3);
        if (class394.field5023 < 100) {
            return;
        }
        float var6 = (float) class604.field8137 / (float) class604.field8123;
        int var7 = arg4;
        int var8 = arg3;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = (arg4 - var7) / 2 + arg5;
        int var10 = (arg3 - var8) / 2 + arg1;
        if (class532.field6729 == null || arg4 != class532.field6729.method1556() || arg3 != class532.field6729.method1544()) {
            class604.method3354(class604.field8128, class604.field8140 + class604.field8137, class604.field8128 + class604.field8123, class604.field8140, var9, var10, var7 + var9, var8 + var10);
            class604.method3337(arg0);
            class532.field6729 = arg0.method433(var9, var10, var7, var8, false);
        }
        class532.field6729.method2556(var9, var10);
        int var11 = class116.field1447 * var7 / class604.field8123;
        int var12 = class250.field3231 * var8 / class604.field8137;
        int var13 = class400.field5075 * var7 / class604.field8123 + var9;
        int var14 = var10 + var8 - (class375.field4830 * var8 / class604.field8137) - var12;
        int var15 = -1996554240;
        if (class341.field4353 == class237.field3061) {
            var15 = -1996488705;
        }
        arg0.method475(var13, var14, var11, var12, var15, 1);
        arg0.method435(var13, var14, var11, var12, var15, 0);
        if (class647.field8756 <= 0) {
            return;
        }
        int var16;
        if (class671.field9179 > 50) {
            var16 = 500 - class671.field9179 * 5;
        } else {
            var16 = class671.field9179 * 5;
        }
        for (class79 var17 = (class79) class604.field8112.method1909(true); var17 != null; var17 = (class79) class604.field8112.method1916((byte) 79)) {
            class663 var18 = class604.field8104.method93(var17.field1034, (byte) 96);
            if (class151.method939(0, var18)) {
                if (class103.field1324 == var17.field1034) {
                    int var21 = var17.field1025 * var7 / class604.field8123 + var9;
                    int var22 = (class604.field8137 - var17.field1031) * var8 / class604.field8137 + var10;
                    arg0.method3630((byte) 28, 4, var22 - 2, var21 + -2, var16 << 24 | 0xFFFF00, 4);
                } else if (class537.field6770 != -1 && class537.field6770 == var18.field8986) {
                    int var19 = var17.field1025 * var7 / class604.field8123 + var9;
                    int var20 = (class604.field8137 - var17.field1031) * var8 / class604.field8137 + var10;
                    arg0.method3630((byte) -95, 4, var20 - 2, var19 - 2, var16 << 24 | 0xFFFF00, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIII[BI[B)V", line = 182)
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, byte[] arg8) {
        if (arg3 != -1996488705) {
            field2301 = -0.24817777F;
        }
        field2294++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg8[var10001] = (byte) (arg8[var10001] - arg6[arg0++]);
                int var14 = arg4++;
                arg8[var14] = (byte) (arg8[var14] - arg6[arg0++]);
                int var15 = arg4++;
                arg8[var15] = (byte) (arg8[var15] - arg6[arg0++]);
                int var16 = arg4++;
                arg8[var16] = (byte) (arg8[var16] - arg6[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg8[var10001] = (byte) (arg8[var10001] - arg6[arg0++]);
            }
            arg4 += arg2;
            arg0 += arg7;
        }
    }
}
