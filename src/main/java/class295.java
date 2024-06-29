import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class295 extends class46 {

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "[I")
    public static int[] field4559 = new int[4096];

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "J")
    public static long field4560;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "[I")
    public static int[] field4566;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "Lah;")
    public static class126 field4565;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "Ll;")
    public static class133 field4561;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "Ldb;")
    public static class43 field4568;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILib;)V", line = 4)
    public static final void method2006(int arg0, class313 arg1) {
        field4567++;
        class239 var2 = (class239) class272.field4223.method636(-1);
        if (arg0 != -23156) {
            method2008((byte) 9);
        }
        while (var2 != null) {
            if (var2.field3811 == arg1) {
                if (var2.field3806 != null) {
                    class98.field1560.method1864(var2.field3806);
                    var2.field3806 = null;
                }
                var2.method403(1);
                return;
            }
            var2 = (class239) class272.field4223.method638(58);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)V", line = 37)
    public static final void method2007(byte arg0, int arg1) {
        if (arg0 < 17) {
            return;
        }
        if (arg1 == 37) {
            class229.field3637 = 3.0F;
        } else if (arg1 == 50) {
            class229.field3637 = 4.0F;
        } else if (arg1 == 75) {
            class229.field3637 = 6.0F;
        } else if (arg1 == 100) {
            class229.field3637 = 8.0F;
        } else if (arg1 == 200) {
            class229.field3637 = 16.0F;
        }
        field4563++;
        class273.field4228 = -1;
        class273.field4228 = -1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 69)
    public static void method2008(byte arg0) {
        field4565 = null;
        int var1 = -81 / ((arg0 + 87) / 35);
        field4568 = null;
        field4566 = null;
        field4559 = null;
        field4561 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I", line = 87)
    public static final int method2009(int arg0, int arg1, int arg2) {
        field4557++;
        int var3 = arg0 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return arg1 == 256 ? (var5 & 0x7FA41F4) >> 19 : 51;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4559[var0] = class160.method1094((byte) 121, var0);
        }
        field4560 = 0L;
        field4564 = 0;
        field4566 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILwj;BILtb;I)V", line = 121)
    public static final void method2010(int arg0, int arg1, class270 arg2, byte arg3, int arg4, class220 arg5, int arg6) {
        field4558++;
        if (arg2 == null) {
            return;
        }
        int var7 = (int) class259.field4063 + class345.field5354 & 0x7FF;
        int var8 = arg0 * arg0 + arg1 * arg1;
        if (arg3 != 22) {
            method2010(-65, 93, (class270) null, (byte) 5, 44, (class220) null, -49);
        }
        int var9 = Math.max(arg5.field3526 / 2, arg5.field3458 / 2) + 10;
        if ((var9 * var9) < var8) {
            return;
        }
        int var10 = class15.field204[var7];
        int var11 = class15.field216[var7];
        int var12 = var10 * 256 / (class254.field3995 + 256);
        int var13 = var11 * 256 / (class254.field3995 + 256);
        int var14 = arg1 * var13 - (arg0 * var12) >> 16;
        int var15 = arg0 * var13 + arg1 * var12 >> 16;
        if (class94.field1516) {
            ((class86) arg2).method622(arg5.field3526 / 2 + arg6 + var15 - (arg2.field4211 / 2), arg5.field3458 / 2 + -var14 + arg4 + -(arg2.field4201 / 2), (class86) arg5.method1551(arg3 ^ 0x14, false));
        } else {
            ((class249) arg2).method1712(arg5.field3526 / 2 + var15 + arg6 - arg2.field4211 / 2, arg5.field3458 / 2 + arg4 + -var14 + -(arg2.field4201 / 2), arg5.field3486, arg5.field3420);
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 158)
    public class295() {
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(I)V", line = 162)
    public class295(int arg0) {
        this.field4562 = arg0;
    }
}
