import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class482 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
    public static int[] field6800 = new int[2048];

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field6802;

    static {
        new class112((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2830(byte arg0) {
        field6801++;
        if (arg0 >= -64) {
            field6800 = null;
        }
        if (class146.field2070 != null) {
            class20.field350 = 1;
        }
        if (class228.field3215 && class194.field2757.method531(81, 126) && class161.field2310 > 2) {
            if (class146.field2070 == null) {
                class24.method210((class106) class250.field3514.field3504.field2609.field2609, (byte) 81);
            } else {
                class132.field1859 = (class106) class250.field3514.field3504.field2609.field2609;
            }
        } else if (class146.field2070 == null) {
            class24.method210((class106) class250.field3514.field3504.field2609, (byte) -95);
        } else {
            class132.field1859 = (class106) class250.field3514.field3504.field2609;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 37)
    public static final void method2831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6802++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg5 < 64) {
            method2831(-23, -48, 110, 116, -119, 106);
        }
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        if (class53.field874 <= arg3 && class8.field174 >= arg3) {
            int var21 = class229.method1443(class299.field4121, arg1 + arg4, class248.field3487, (byte) -68);
            int var22 = class229.method1443(class299.field4121, arg4 - arg1, class248.field3487, (byte) -68);
            class80.method554(class2.field16[arg3], 104, arg0, var21, var22);
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
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var24 >= class53.field874 && class8.field174 >= var23) {
                int var25 = class229.method1443(class299.field4121, arg4 + var6, class248.field3487, (byte) -68);
                int var26 = class229.method1443(class299.field4121, arg4 - var6, class248.field3487, (byte) -68);
                if (class53.field874 <= var23) {
                    class80.method554(class2.field16[var23], 97, arg0, var25, var26);
                }
                if (var24 <= class8.field174) {
                    class80.method554(class2.field16[var24], 96, arg0, var25, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 136)
    public static void method2832(boolean arg0) {
        if (!arg0) {
            field6800 = null;
        }
    }
}
