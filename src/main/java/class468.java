import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class468 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field6575 = -2;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Z")
    public static boolean field6577 = false;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Z")
    public static boolean field6578 = false;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "[I")
    public static int[] field6581 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field6579 = 0;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lsd;")
    public static class74 field6576 = new class74(59, -2);

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "B")
    public static byte field6580;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2741(boolean arg0) {
        if (!arg0) {
            field6577 = false;
        }
        field6581 = null;
        field6576 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)V", line = 43)
    public static final void method2742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= class328.field4729 && class357.field5123 <= arg1) {
            boolean var6;
            if (class75.field912 > arg2) {
                var6 = false;
                arg2 = class75.field912;
            } else if (class453.field6396 < arg2) {
                var6 = false;
                arg2 = class453.field6396;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg3 < class75.field912) {
                arg3 = class75.field912;
                var7 = false;
            } else if (class453.field6396 >= arg3) {
                var7 = true;
            } else {
                var7 = false;
                arg3 = class453.field6396;
            }
            if (class357.field5123 > arg5) {
                arg5 = class357.field5123;
            } else {
                class270.method1633(class240.field3303[arg5++], arg3, arg4, arg2, arg0 ^ 0xB1);
            }
            if (arg1 <= class328.field4729) {
                class270.method1633(class240.field3303[arg1--], arg3, arg4, arg2, 90);
            } else {
                arg1 = class328.field4729;
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg1; var8++) {
                    int[] var9 = class240.field3303[var8];
                    var9[arg2] = var9[arg3] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg1; var11++) {
                    class240.field3303[var11][arg2] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg1; var10++) {
                    class240.field3303[var10][arg3] = arg4;
                }
            }
        }
        if (arg0 != 205) {
            method2742(-43, 64, -21, -20, 106, 7);
        }
        field6582++;
    }
}
