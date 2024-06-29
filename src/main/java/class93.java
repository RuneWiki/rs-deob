import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class93 extends class206 {

    @OriginalMember(owner = "client!p", name = "t", descriptor = "[I")
    public static int[] field1515 = new int[50];

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[F")
    public static float[] field1513 = new float[4];

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field1516 = -1;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 4)
    public static final void method723(int arg0, int arg1) {
        class213.field3623.method1199(arg0, 121);
        field1511++;
        class210.field3591.method1199(arg0, 126);
        if (arg1 >= -82) {
            method723(-9, 39);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLcb;)V", line = 24)
    public static final void method724(boolean arg0, class267 arg1) {
        field1512++;
        class111.field1899 = arg1;
        if (arg0) {
            method723(-87, 28);
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V", line = 37)
    public static final void method725(int arg0) {
        field1517++;
        if (arg0 <= 102) {
            method723(-50, -70);
        }
        int var1 = 0;
        int[] var2 = new int[class259.field4343];
        for (int var3 = 0; var3 < class259.field4343; var3++) {
            class278 var4 = class199.method1475(var3, (byte) -81);
            if (var4.field4826 >= 0 || var4.field4785 >= 0) {
                var2[var1++] = var3;
            }
        }
        class11.field140 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class11.field140[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIIIZ)V", line = 72)
    public static final void method726(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1514++;
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class43.field712 + ((class169.field2850 - class43.field712) * var6 / 100);
        if (var7 < class12.field159) {
            var7 = class12.field159;
        } else if (var7 > class59.field991) {
            var7 = class59.field991;
        }
        int var8 = arg2 * var7 * 512 / (arg4 * 334);
        if (arg1 < 38) {
            field1515 = (int[]) null;
        }
        if (class3.field32 > var8) {
            short var12 = class3.field32;
            var7 = arg4 * 334 * var12 / (arg2 * 512);
            if (class59.field991 < var7) {
                var7 = class59.field991;
                int var13 = var7 * 512 * arg2 / (var12 * 334);
                int var14 = (arg4 - var13) / 2;
                if (arg5) {
                    class222.method1633();
                    class222.method1632(arg0, arg3, var14, arg2, 0);
                    class222.method1632(arg0 + arg4 - var14, arg3, var14, arg2, 0);
                }
                arg4 -= var14 * 2;
                arg0 += var14;
            }
        } else if (var8 > class149.field2564) {
            short var9 = class149.field2564;
            var7 = arg4 * var9 * 334 / (arg2 * 512);
            if (var7 < class12.field159) {
                var7 = class12.field159;
                int var10 = arg4 * var9 * 334 / (var7 * 512);
                int var11 = (arg2 - var10) / 2;
                if (arg5) {
                    class222.method1633();
                    class222.method1632(arg0, arg3, arg4, var11, 0);
                    class222.method1632(arg0, arg2 + arg3 - var11, arg4, var11, 0);
                }
                arg2 -= var11 * 2;
                arg3 += var11;
            }
        }
        class302.field5163 = arg2 * var7 / 334;
        class161.field2735 = (short) arg2;
        class157.field2689 = arg0;
        class104.field1760 = (short) arg4;
        class157.field2699 = arg3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 165)
    public static void method727(byte arg0) {
        if (arg0 <= 113) {
            method723(76, -32);
        }
        field1513 = null;
        field1515 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)I", line = 183)
    public static int method728(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
