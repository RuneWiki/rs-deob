import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class107 extends class525 {

    @OriginalMember(owner = "client!as", name = "F", descriptor = "Lmq;")
    public class359 field1615;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "[[I")
    public static int[][] field1611 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!as", name = "B", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!as", name = "E", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public static void method782(boolean arg0) {
        if (arg0) {
            field1611 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIFII[FFI)V")
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float[] arg8, float arg9, int arg10) {
        int var11 = arg2 - arg3;
        int var12 = arg10 - arg7;
        int var13 = arg1 - arg6;
        field1614++;
        float var14 = arg8[2] * (float) var13 + arg8[0] * (float) var11 + arg8[1] * (float) var12;
        if (arg0 != -13031) {
            field1611 = null;
        }
        float var15 = arg8[5] * (float) var13 + arg8[3] * (float) var11 + arg8[4] * (float) var12;
        float var16 = arg8[8] * (float) var13 + arg8[6] * (float) var11 + arg8[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg9 != 1.0F) {
            var17 = arg9 * var17;
        }
        float var18 = var15 + arg5 + 0.5F;
        if (arg4 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg4 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg4 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class355.field5171 = var17;
        class470.field6824 = var18;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(Z)V")
    public static final void method784(boolean arg0) {
        field1616++;
        class241 var1 = (class241) class518.field7503.method863(-1);
        if (!arg0) {
            field1612 = -7;
        }
        while (var1 != null) {
            class492 var2 = var1.field3612;
            if (var2.field7113 < class24.field349) {
                var1.method421(22071);
                var2.method2886(true);
            } else if (class24.field349 >= var2.field7107) {
                if (var2.field7096 > 0) {
                    class193 var3 = (class193) class390.field5539.method2284(true, (long) (var2.field7096 - 1));
                    if (var3 != null) {
                        class279 var4 = var3.field2805;
                        if (var4.field6961 >= 0 && (class69.field1139 * 128) > var4.field6961 && var4.field6965 >= 0 && class255.field3763 * 128 > var4.field6965) {
                            var2.method2890(var4.field6965, (byte) -127, class224.method1515(var4.field6961, var4.field6965, var2.field6956, -631749433) - var2.field7120, var4.field6961, class24.field349);
                        }
                    }
                }
                if (var2.field7096 < 0) {
                    int var5 = -var2.field7096 - 1;
                    class510 var6;
                    if (class497.field7188 == var5) {
                        var6 = class364.field5293;
                    } else {
                        var6 = class494.field7143[var5];
                    }
                    if (var6 != null && var6.field6961 >= 0 && var6.field6961 < class69.field1139 * 128 && var6.field6965 >= 0 && class255.field3763 * 128 > var6.field6965) {
                        var2.method2890(var6.field6965, (byte) -121, class224.method1515(var6.field6961, var6.field6965, var2.field6956, -631749433) - var2.field7120, var6.field6961, class24.field349);
                    }
                }
                var2.method2887((byte) -115, class163.field2465);
                class501.method2930(var2, true);
            }
            var1 = (class241) class518.field7503.method865(-1);
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lmq;)V")
    public class107(class359 arg0) {
        this.field1615 = arg0;
    }
}
