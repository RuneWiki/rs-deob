import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class259 {

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lpr;")
    public static class407 field3299 = new class407(97, 3);

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "[Ljaa;")
    public static class561[] field3301 = new class561[50];

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "Ldv;")
    public static class601 field3300;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class110.field1270[arg0][var8][var14] == -class419.field5577) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class8.field70) + 1;
            int var10 = (arg3 << class8.field70) + 2;
            int var11 = class628.field8912[arg0].method253(arg1, arg3) + arg5;
            if (!class436.method2407(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class8.field70) - 1;
            if (!class436.method2407(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class8.field70) - 1;
            if (!class436.method2407(var9, var11, var13)) {
                return false;
            } else if (class436.method2407(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class601.method3362(arg0, arg1, arg3)) {
            int var6 = arg1 << class8.field70;
            int var7 = arg3 << class8.field70;
            return class436.method2407(var6 + 1, class628.field8912[arg0].method253(arg1, arg3) + arg5, var7 + 1) && class436.method2407(class463.field6445 + var6 - 1, class628.field8912[arg0].method253(arg1 + 1, arg3) + arg5, var7 + 1) && class436.method2407(class463.field6445 + var6 - 1, class628.field8912[arg0].method253(arg1 + 1, arg3 + 1) + arg5, class463.field6445 + var7 - 1) && class436.method2407(var6 + 1, class628.field8912[arg0].method253(arg1, arg3 + 1) + arg5, class463.field6445 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBLam;IIIZ)V")
    public static final void method1473(int arg0, byte arg1, class576 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3297++;
        if (class479.field7037 >= 50 || arg2 == null || arg2.field8231 == null || arg2.field8231.length <= arg5 || arg2.field8231[arg5] == null) {
            return;
        }
        int var7 = arg2.field8231[arg5][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF1) >> 5;
        if (arg2.field8231[arg5].length > 1) {
            int var10 = (int) (Math.random() * (double) arg2.field8231[arg5].length);
            if (var10 > 0) {
                var8 = arg2.field8231[arg5][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg6) {
                if (!arg2.field8213) {
                    class373.method2047(var9, var8, (byte) -12, 255, 0);
                    return;
                }
                class58.method392(var9, 0, 255, false, var8, arg1 - 1);
            }
        } else if (class601.field8530.field2877 != 0) {
            if (arg1 != 1) {
                field3301 = null;
            }
            int var12 = arg0 - 256 >> 9;
            int var13 = arg3 - 256 >> 9;
            field3301[class479.field7037++] = new class561((byte) (arg2.field8213 ? 2 : 1), var8, var9, 0, 255, (arg4 << 24) - (-(var12 << 16) - (var13 << 8) - var11));
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
    public static void method1474(int arg0) {
        field3301 = null;
        if (arg0 != -1381) {
            field3300 = null;
        }
        field3299 = null;
        field3300 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lbv;Loa;Lhk;Z)V")
    public static final void method1475(class276 arg0, class635 arg1, class89 arg2, boolean arg3) {
        field3298++;
        class458 var4 = arg2.method554(arg1, (byte) -38);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method415();
        if (arg3) {
            field3300 = null;
        }
        if (var4.method417() > var5) {
            var5 = var4.method417();
        }
        byte var6 = 10;
        int var7 = arg0.field3485;
        int var8 = arg0.field3482;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field943 != null) {
            var9 = class651.field9317.method3621(arg2.field943, null, 1, class571.field8106, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class571.field8106[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class61.field630.method2318(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class61.field630.method2314() * var9 + (class61.field630.method2315() / 2);
        }
        int var15 = arg0.field3485 + (var5 / 2);
        if ((class637.field9028 + var5) > var7) {
            var7 = class637.field9028;
            var15 = var10 / 2 + (var5 / 2 + (class637.field9028 + var6) + 5);
        } else if (var7 > (class637.field9048 - var5)) {
            var7 = class637.field9048 - var5;
            var15 = class637.field9048 - (var10 / 2) - var6 - var5 / 2 - 5;
        }
        int var16 = arg0.field3482;
        if (class637.field9038 + var5 > var8) {
            var8 = class637.field9038;
            var16 = var5 / 2 + class637.field9038 + var6;
        } else if (var8 > class637.field9035 - var5) {
            var16 = class637.field9035 - (var5 / 2) - var11 - var6;
            var8 = class637.field9035 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field3485), (double) (var8 - arg0.field3482)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2609((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field943 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = class61.field630.method2314() * var9 + (var16 + 3);
            var20 = var18 + var10 + 10;
            if (arg2.field961 != 0) {
                arg1.method3552(var21 - var16, -var18 + var20, 7, arg2.field961, var16, var18);
            }
            if (arg2.field979 != 0) {
                arg1.method3556(var16, (byte) 62, arg2.field979, var20 - var18, var18, var21 - var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class571.field8106[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class61.field630.method2319(arg1, var23, var15, var16, arg2.field952, true);
                var16 += class61.field630.method2314();
            }
        }
        if (arg2.field970 == -1 && arg2.field943 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class433 var25 = new class433(arg0);
        var25.field5712 = var18;
        var25.field5707 = var7 - var24;
        var25.field5701 = var7 + var24;
        var25.field5709 = var19;
        var25.field5703 = var8 + var24;
        var25.field5700 = var21;
        var25.field5698 = var20;
        var25.field5704 = var8 - var24;
        class504.field7252.method3164(var25, 256);
    }
}
