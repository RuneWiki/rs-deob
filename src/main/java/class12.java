import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class12 {

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[Lbm;")
    public static class131[] field127 = new class131[32768];

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field126 = 1;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "[S")
    public static short[] field129 = new short[256];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lwe;")
    public class87 field130;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[I")
    public int[] field128;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method59(int arg0) {
        field129 = null;
        int var1 = -77 % ((arg0 + 70) / 37);
        field127 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V")
    public static final void method60(int arg0, byte arg1) {
        if (arg1 < 15) {
            field127 = null;
        }
        field124++;
        class50.field837.method1262(arg0, 2736);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIII)V")
    public static final void method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg2;
        field123++;
        int var7 = arg0 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class238.method1610(arg2, arg0, arg3, arg4, -93);
            }
        } else if (var7 == 0) {
            class126.method879(-111, arg5, arg2, arg3, arg4);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (class82.field1374 > arg2) {
                var10 = class82.field1374;
                var11 = var9 + (class82.field1374 * var8 >> 12);
            } else if (arg2 <= class259.field4188) {
                var10 = arg2;
                var11 = arg3;
            } else {
                var10 = class259.field4188;
                var11 = var9 + (class259.field4188 * var8 >> 12);
            }
            if (class85.field1409 > var11) {
                var11 = class85.field1409;
                var10 = (class85.field1409 - var9 << 12) / var8;
            } else if (class234.field3774 < var11) {
                var11 = class234.field3774;
                var10 = (class234.field3774 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class82.field1374 > arg5) {
                var12 = class82.field1374;
                var13 = (class82.field1374 * var8 >> 12) + var9;
            } else if (arg5 > class259.field4188) {
                var12 = class259.field4188;
                var13 = (class259.field4188 * var8 >> 12) + var9;
            } else {
                var12 = arg5;
                var13 = arg0;
            }
            int var14 = -55 / ((arg1 + 19) / 57);
            if (var13 < class85.field1409) {
                var12 = (class85.field1409 - var9 << 12) / var8;
                var13 = class85.field1409;
            } else if (class234.field3774 < var13) {
                var12 = (class234.field3774 - var9 << 12) / var8;
                var13 = class234.field3774;
            }
            class137.method963(var12, var13, var10, var11, arg4, -20685);
        }
    }
}
