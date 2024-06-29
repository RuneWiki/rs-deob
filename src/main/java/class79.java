import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class79 {

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1027 = -60;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Leh;")
    public static class246 field1030 = new class246(28, 10);

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 6)
    public static void method599(int arg0) {
        field1030 = null;
        if (arg0 <= 3) {
            field1030 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIII)V", line = 21)
    public static final void method600(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -11) {
            method602(59, true, 114);
        }
        if (arg4 >= class303.field4422 && arg4 <= class353.field5062) {
            int var5 = class539.method3173(arg0, (byte) 44, class392.field5514, class518.field7624);
            int var6 = class539.method3173(arg2, (byte) 76, class392.field5514, class518.field7624);
            class220.method1362(var6, arg3, 2, var5, arg4);
        }
        field1031++;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIII)Z", line = 39)
    public static final boolean method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class520.field7650[arg0][var8][var14] == -class479.field6683) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class493.field6970) + 1;
            int var10 = (arg3 << class493.field6970) + 2;
            int var11 = class330.field4818[arg0].method10(arg1, arg3) + arg5;
            if (!class395.method2299(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class493.field6970) - 1;
            if (!class395.method2299(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class493.field6970) - 1;
            if (!class395.method2299(var9, var11, var13)) {
                return false;
            } else if (class395.method2299(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class422.method2503(arg0, arg1, arg3)) {
            int var6 = arg1 << class493.field6970;
            int var7 = arg3 << class493.field6970;
            return class395.method2299(var6 + 1, class330.field4818[arg0].method10(arg1, arg3) + arg5, var7 + 1) && class395.method2299(class169.field2463 + var6 - 1, class330.field4818[arg0].method10(arg1 + 1, arg3) + arg5, var7 + 1) && class395.method2299(class169.field2463 + var6 - 1, class330.field4818[arg0].method10(arg1 + 1, arg3 + 1) + arg5, class169.field2463 + var7 - 1) && class395.method2299(var6 + 1, class330.field4818[arg0].method10(arg1, arg3 + 1) + arg5, class169.field2463 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZI)I", line = 99)
    public static final int method602(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1032 = 118;
        }
        field1028++;
        return arg2 == 4 || arg2 == 5 ? class408.field5765[arg0 & 0x3] : 256;
    }
}
