import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class604 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "F")
    public static float field8709 = 1.0F;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
    public static boolean field8712 = false;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILpa;Lqa;BIILmc;II)V")
    public static final void method3557(int arg0, class310 arg1, class207 arg2, byte arg3, int arg4, int arg5, class114 arg6, int arg7, int arg8) {
        field8710++;
        class463 var9 = class163.field2366.method2136(arg3 - 45, arg8);
        if (var9 != null && var9.field6537 && var9.method2709(class189.field2681, (byte) -110)) {
            if (var9.field6517 != null) {
                int[] var10 = new int[var9.field6517.length];
                for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                    int var13;
                    if (class107.field1653 == 4) {
                        var13 = (int) class1.field13 & 0x3FFF;
                    } else {
                        var13 = (int) class1.field13 + class2.field27 & 0x3FFF;
                    }
                    int var14 = class1.field2[var13];
                    int var15 = class1.field7[var13];
                    if (class107.field1653 != 4) {
                        var15 = var15 * 256 / (class353.field4779 + 256);
                        var14 = var14 * 256 / (class353.field4779 + 256);
                    }
                    var10[var11 * 2] = arg6.field1853 / 2 + (arg7 + ((var9.field6517[var11 * 2] * 4 + arg0) * var15 + (var9.field6517[var11 * 2 + 1] * 4 + arg5) * var14 >> 15));
                    var10[var11 * 2 + 1] = arg6.field1769 / 2 + arg4 - ((var9.field6517[var11 * 2 + 1] * 4 + arg5) * var15 - (var9.field6517[var11 * 2] * 4 + arg0) * var14 >> 15);
                }
                class290.method1864(arg2, var10, var9.field6510, arg6.field1885, arg6.field1834);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg2.method1266(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 3], var9.field6529, 1, arg1, arg7, arg4);
                }
                arg2.method1266(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field6529, 1, arg1, arg7, arg4);
            }
            class52 var16 = null;
            if (var9.field6512 != -1) {
                var16 = var9.method2700(14, false, arg2);
                if (var16 != null) {
                    class401.method2397(arg7, arg0, arg1, arg5, var16, arg6, arg4, 2);
                }
            }
            if (var9.field6531 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method422();
                }
                class91 var18 = class503.field6998;
                class483 var19 = class451.field6372;
                if (var9.field6538 == 1) {
                    var19 = class208.field2944;
                    var18 = class206.field2905;
                }
                if (var9.field6538 == 2) {
                    var18 = class515.field7246;
                    var19 = class40.field798;
                }
                class326.method2014(var9.field6505, var9.field6531, var19, arg7, arg4, arg5, var17, arg6, var18, (byte) -43, arg0, arg1);
            }
        }
        if (arg3 != -44) {
            method3557(48, null, null, (byte) -100, -122, 77, null, 106, 45);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
    public static final boolean method3558(int arg0, int arg1) {
        if (arg0 != 3) {
            method3557(-79, null, null, (byte) -69, 66, -38, null, 55, -95);
        }
        field8711++;
        return arg1 == 6 || arg1 == 7 || arg1 == 8;
    }
}
