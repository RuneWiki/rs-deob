import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class129 extends class481 {

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field1710;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "Lkg;")
    public static class179 field1705 = new class179(6, 7);

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "Ldq;")
    public static class493 field1709 = new class493(47, 5);

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "[I")
    public static int[] field1712 = new int[2];

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)V", line = 4)
    public static void method908(byte arg0) {
        field1705 = null;
        field1709 = null;
        if (arg0 > 72) {
            field1712 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 18)
    public final Object method909(int arg0) {
        if (arg0 == 0) {
            field1711++;
            return this.field1710;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)Z", line = 32)
    public final boolean method910(byte arg0) {
        if (arg0 != 71) {
            field1705 = null;
        }
        field1713++;
        return false;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIIIIII)V", line = 46)
    public static final void method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1708++;
        if (arg4 == arg9 && arg3 == arg7 && arg0 == arg5 && arg1 == arg2) {
            class53.method526(false, arg7, arg2, arg9, arg0, arg8);
        } else {
            int var10 = arg9;
            int var11 = arg7;
            int var12 = arg9 * 3;
            int var13 = arg7 * 3;
            int var14 = arg4 * 3;
            int var15 = arg3 * 3;
            int var16 = arg5 * 3;
            int var17 = arg1 * 3;
            int var18 = var14 + arg0 - arg9 - var16;
            int var19 = arg2 + var15 - var17 - arg7;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 - var15 - (var15 - var13);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg9;
                int var34 = (var28 + var30 + var32 >> 12) + arg7;
                class53.method526(false, var11, var34, var10, var33, arg8);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg6 < 108) {
            field1712 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lhf;Ljava/lang/Object;I)V", line = 121)
    public class129(class272 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1710 = arg1;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V", line = 136)
    public static final void method912(byte arg0) {
        int var1 = 0;
        if (arg0 != -63) {
            return;
        }
        while (var1 < class189.field2475) {
            class212 var2 = class466.field6728[var1];
            if (var2.field2732 == 2) {
                if (var2.field2720 == null) {
                    var2.field2727 = Integer.MIN_VALUE;
                } else {
                    class113.field1506.method2532(var2.field2720);
                }
            }
            var1++;
        }
        field1706++;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)Z", line = 166)
    public static final boolean method913(int arg0, int arg1, int arg2) {
        if (arg0 != 3754) {
            field1709 = null;
        }
        field1707++;
        return (arg1 & 0x800) != 0;
    }
}
