import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class284 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field4469 = -1;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4468 = "green:";

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Z")
    public static boolean field4471 = false;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static volatile int field4476 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lqk;")
    public class219 field4472;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lub;")
    public static class92 field4466;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[I")
    public int[] field4473;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field4477;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4478++;
        if (arg3 < 128 || arg0 < 128 || arg3 > 13056 || arg0 > 13056) {
            class182.field2869 = -1;
            class106.field1663 = -1;
            return;
        }
        int var8 = class254.method1721(-580808345, class130.field1941, arg0, arg3) - arg7;
        int var9 = var8 - class250.field4007;
        int var10 = arg0 - class118.field1787;
        int var11 = arg3 - class226.field3616;
        int var12 = class224.field3601[class8.field128];
        int var13 = class224.field3597[class8.field128];
        int var14 = class224.field3601[class82.field1244];
        if (arg5 != 0) {
            method1914(120, -91, 66, -15, -52, -81, -41, -70);
        }
        int var15 = class224.field3597[class82.field1244];
        int var16 = var10 * var14 + var11 * var15 >> 16;
        int var17 = var10 * var15 - (var11 * var14) >> 16;
        int var19 = var9 * var13 - (var12 * var17) >> 16;
        int var20 = var9 * var12 + var13 * var17 >> 16;
        if (var20 < 50) {
            class106.field1663 = -1;
            class182.field2869 = -1;
        } else {
            class182.field2869 = (var19 << 9) / var20 + arg6;
            class106.field1663 = (var16 << 9) / var20 + arg4;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1915(String arg0, int arg1) {
        field4467++;
        for (int var2 = 0; var2 < class83.field1250.length; var2++) {
            if (class83.field1250[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return arg1 == 50 ? -1 : -36;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method1916(byte arg0) {
        field4466 = null;
        if (arg0 != 88) {
            field4471 = false;
        }
        field4468 = null;
    }
}
