import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class456 extends class134 {

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "Z")
    public boolean field6535;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public int field6537;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public int field6544;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "Lih;")
    public class698 field6543;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Ldh;")
    public static class320 field6536 = new class320(75, 3);

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "[I")
    public static int[] field6542 = new int[14];

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "B")
    public static byte field6539;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Z")
    public boolean field6534;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "Z")
    public boolean field6538;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "Z")
    public boolean field6541;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
    public static final int method2795(byte arg0) {
        field6540++;
        if (class3.field27 == 1) {
            return class2.field9;
        } else {
            int var1 = 90 % ((-arg0 - 42) / 61);
            return class627.field9011;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBIII)V")
    public static final void method2796(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field6533++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg4 * arg4;
        if (arg2 != 92) {
            field6542 = null;
        }
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        if (class224.field2571 <= arg5 && class578.field8182 >= arg5) {
            int var21 = class211.method1255(class338.field4355, arg1 + arg4, false, class744.field10385);
            int var22 = class211.method1255(class338.field4355, arg1 - arg4, false, class744.field10385);
            class223.method1297(class408.field5585[arg5], -7, var22, arg3, var21);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var24 >= class224.field2571 && var23 <= class578.field8182) {
                int var25 = class211.method1255(class338.field4355, arg1 + var6, false, class744.field10385);
                int var26 = class211.method1255(class338.field4355, arg1 - var6, false, class744.field10385);
                if (var23 >= class224.field2571) {
                    class223.method1297(class408.field5585[var23], -7, var26, arg3, var25);
                }
                if (class578.field8182 >= var24) {
                    class223.method1297(class408.field5585[var24], -7, var26, arg3, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V")
    public static void method2797(byte arg0) {
        if (arg0 != 43) {
            field6536 = null;
        }
        field6542 = null;
        field6536 = null;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILih;IZ)V")
    public class456(int arg0, class698 arg1, int arg2, boolean arg3) {
        this.field6535 = arg3;
        this.field6537 = arg2;
        this.field6544 = arg0;
        this.field6543 = arg1;
    }
}
