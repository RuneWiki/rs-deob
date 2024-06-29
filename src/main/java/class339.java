import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class339 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lra;")
    public static class57 field5014;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
    public static final void method2179(boolean arg0, int arg1) {
        if (!arg0) {
            class251.field3396.method2054(-110, arg1);
            field5010++;
            class97.field1094.method2054(84, arg1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(ZI)V")
    public static final void method2180(boolean arg0, int arg1) {
        class300.field4272.method2054(85, arg1);
        if (arg0) {
            field5014 = null;
        }
        field5013++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZ)I")
    public static final int method2181(int arg0, int arg1, boolean arg2) {
        field5009++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            if (!arg2) {
                field5014 = null;
            }
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILjava/awt/Canvas;Lbm;)Len;")
    public static final class174 method2182(int arg0, int arg1, Canvas arg2, class60 arg3) {
        if (arg1 != -1) {
            method2183(-41);
        }
        field5011++;
        return new class154(arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method2183(int arg0) {
        field5008++;
        class388.field5690.method2052(0);
        if (arg0 != 1136568300) {
            field5014 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static void method2184(int arg0) {
        field5014 = null;
        if (arg0 != 799756972) {
            field5014 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5012++;
        int var6 = arg0 - arg4;
        if (arg5 != 1055745068) {
            field5014 = null;
        }
        int var7 = arg3 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class228.method1465(arg2, arg4, arg3, arg1, 12685);
            }
        } else if (var7 == 0) {
            class279.method1764((byte) 100, arg4, arg1, arg0, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg4 < class143.field2029) {
                var10 = var9 + (class143.field2029 * var8 >> 12);
                var11 = class143.field2029;
            } else if (class128.field1785 < arg4) {
                var11 = class128.field1785;
                var10 = var9 + (class128.field1785 * var8 >> 12);
            } else {
                var11 = arg4;
                var10 = arg2;
            }
            int var12;
            int var13;
            if (arg0 < class143.field2029) {
                var12 = class143.field2029;
                var13 = var9 + (class143.field2029 * var8 >> 12);
            } else if (class128.field1785 < arg0) {
                var12 = class128.field1785;
                var13 = var9 + (class128.field1785 * var8 >> 12);
            } else {
                var13 = arg3;
                var12 = arg0;
            }
            if (class20.field209 > var10) {
                var11 = (class20.field209 - var9 << 12) / var8;
                var10 = class20.field209;
            } else if (class407.field5914 < var10) {
                var11 = (class407.field5914 - var9 << 12) / var8;
                var10 = class407.field5914;
            }
            if (class20.field209 > var13) {
                var13 = class20.field209;
                var12 = (class20.field209 - var9 << 12) / var8;
            } else if (var13 > class407.field5914) {
                var12 = (class407.field5914 - var9 << 12) / var8;
                var13 = class407.field5914;
            }
            class20.method138(-96, var11, var12, var10, var13, arg1);
        }
    }
}
