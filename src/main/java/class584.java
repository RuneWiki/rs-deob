import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class584 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
    public static boolean field7922 = false;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "F")
    public static float field7923;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)J", line = 4)
    public static final synchronized long method3191(int arg0) {
        field7926++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 1) {
            method3191(60);
        }
        if (var1 < class530.field6877) {
            class123.field1592 += class530.field6877 - var1;
        }
        class530.field6877 = var1;
        return var1 + class123.field1592;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 27)
    public static final void method3192(int arg0) {
        class230.field3069.method2846(true);
        field7925++;
        int var1 = class230.field3069.method2845(8, 8);
        if (arg0 != -19295) {
            return;
        }
        if (var1 < class248.field3351) {
            for (int var2 = var1; var2 < class248.field3351; var2++) {
                class27.field405[class662.field9210++] = class40.field558[var2];
            }
        }
        if (var1 > class248.field3351) {
            throw new RuntimeException("gnpov1");
        }
        class248.field3351 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class40.field558[var3];
            class532 var5 = ((class234) class505.field6640.method39((long) var4, 31750)).field3131;
            int var6 = class230.field3069.method2845(1, arg0 ^ 0xFFFFB4A9);
            if (var6 == 0) {
                class40.field558[class248.field3351++] = var4;
                var5.field2994 = class424.field5503;
            } else {
                int var7 = class230.field3069.method2845(2, 8);
                if (var7 == 0) {
                    class40.field558[class248.field3351++] = var4;
                    var5.field2994 = class424.field5503;
                    class604.field8188[class642.field8933++] = var4;
                } else if (var7 == 1) {
                    class40.field558[class248.field3351++] = var4;
                    var5.field2994 = class424.field5503;
                    int var8 = class230.field3069.method2845(3, 8);
                    var5.method2827(-12647, var8, 1);
                    int var9 = class230.field3069.method2845(1, 8);
                    if (var9 == 1) {
                        class604.field8188[class642.field8933++] = var4;
                    }
                } else if (var7 == 2) {
                    class40.field558[class248.field3351++] = var4;
                    var5.field2994 = class424.field5503;
                    if (class230.field3069.method2845(1, 8) == 1) {
                        int var11 = class230.field3069.method2845(3, 8);
                        var5.method2827(-12647, var11, 2);
                        int var12 = class230.field3069.method2845(3, 8);
                        var5.method2827(-12647, var12, 2);
                    } else {
                        int var10 = class230.field3069.method2845(3, arg0 ^ 0xFFFFB4A9);
                        var5.method2827(-12647, var10, 0);
                    }
                    int var13 = class230.field3069.method2845(1, arg0 ^ 0xFFFFB4A9);
                    if (var13 == 1) {
                        class604.field8188[class642.field8933++] = var4;
                    }
                } else if (var7 == 3) {
                    class27.field405[class662.field9210++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII[BI)V", line = 145)
    public static final void method3193(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg2 != -9723) {
            field7922 = true;
        }
        field7924++;
        if (arg3 <= arg1) {
            return;
        }
        int var6 = arg3 - arg1 >> 2;
        int var7 = arg1 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var7++] = 1;
                }
            }
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
        }
    }
}
