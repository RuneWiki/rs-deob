import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class327 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BIIILqa;I)V")
    public static final void method2017(byte arg0, int arg1, int arg2, int arg3, class162 arg4, int arg5) {
        arg4.method1098(arg2, arg5, arg2 + arg3, arg1 + arg5);
        field4652++;
        arg4.method1087(arg5, arg2, 116, arg1, -16777216, arg3);
        if (class482.field7062 < 100) {
            return;
        }
        float var6 = (float) class460.field6830 / (float) class460.field6815;
        int var7 = arg3;
        int var8 = arg1;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg1 / var6);
        }
        int var9 = (arg3 - var7) / 2 + arg2;
        int var10 = (arg1 - var8) / 2 + arg5;
        if (class411.field6175 == null || class411.field6175.method108() != arg3 || arg1 != class411.field6175.method103()) {
            class460.method2758(class460.field6818, class460.field6830 + class460.field6825, class460.field6818 + class460.field6815, class460.field6825, var9, var10, var7 + var9, var8 + var10);
            class460.method2760(arg4);
            class411.field6175 = arg4.method1067(var9, var10, var7, var8, false);
        }
        class411.field6175.method3121(var9, var10);
        int var11 = class39.field574 * var7 / class460.field6815;
        int var12 = class219.field3205 * var8 / class460.field6830;
        if (arg0 != 57) {
            method2017((byte) -85, 19, 70, 29, null, -22);
        }
        int var13 = class31.field339 * var7 / class460.field6815 + var9;
        int var14 = var10 + var8 - (class382.field5789 * var8 / class460.field6830) - var12;
        int var15 = -1996554240;
        if (class359.field5513 == class183.field2707) {
            var15 = -1996488705;
        }
        arg4.method1036(var13, var14, var11, var12, var15, 1);
        arg4.method1104(var13, var14, var11, var12, var15, 0);
        if (class259.field3816 <= 0) {
            return;
        }
        int var16;
        if (class116.field1759 > 50) {
            var16 = (100 - class116.field1759) * 5;
        } else {
            var16 = class116.field1759 * 5;
        }
        for (class355 var17 = (class355) class460.field6814.method816(121); var17 != null; var17 = (class355) class460.field6814.method812(arg0 + 61)) {
            class158 var18 = class460.field6804.method539(var17.field5459, (byte) 60);
            if (class23.method150(var18, (byte) 117)) {
                if (class497.field7333 == var17.field5459) {
                    int var19 = var17.field5465 * var7 / class460.field6815 + var9;
                    int var20 = (class460.field6830 - var17.field5458) * var8 / class460.field6830 + var10;
                    arg4.method1087(var20 - 2, var19 + -2, 118, 4, var16 << 24 | 0xFFFF00, 4);
                } else if (class101.field1467 != -1 && class101.field1467 == var18.field2319) {
                    int var21 = var17.field5465 * var7 / class460.field6815 + var9;
                    int var22 = (class460.field6830 - var17.field5458) * var8 / class460.field6830 + var10;
                    arg4.method1087(var22 - 2, var21 + -2, 126, 4, var16 << 24 | 0xFFFF00, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4653++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(II)V")
    public class327(int arg0, int arg1) {
    }
}
