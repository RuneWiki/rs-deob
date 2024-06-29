import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class367 {

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field5287 = 1;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
    public static boolean field5288 = false;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field5286;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Ljava/lang/String;")
    public String field5285;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III[IIIIZ)Z")
    public static final boolean method2281(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg6 < 0) {
            arg6 = 0;
        }
        if (!arg7) {
            method2282(20);
        }
        if (arg1 > class286.field4384) {
            arg1 = class286.field4384;
        }
        field5289++;
        if (arg1 <= arg6) {
            return true;
        }
        int var8 = arg4 * arg6 + arg2;
        int var9 = arg1 - arg6 >> 2;
        int var10 = arg6 + arg0 - 1;
        int var10000;
        if (class572.field8104 == 1) {
            class683.field9698 += var9;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var11 = arg1 - arg6 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return true;
                        }
                        var10++;
                        if (var8 < arg3[var10]) {
                            arg3[var10] = var8;
                        }
                        var8 += arg4;
                    }
                }
                var10000 = ~var8;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    arg3[var10] = var8;
                }
                int var12 = arg4 + var8;
                var10++;
                if (arg3[var10] > var12) {
                    arg3[var10] = var12;
                }
                int var13 = arg4 + var12;
                var10000 = ~var13;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    arg3[var10] = var13;
                }
                int var14 = arg4 + var13;
                var10++;
                if (arg3[var10] > var14) {
                    arg3[var10] = var14;
                }
                var8 = arg4 + var14;
            }
        } else {
            int var15 = var8 - 38400;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var16 = arg1 - arg6 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg3[var10] > var15) {
                            return false;
                        }
                        var15 += arg4;
                    }
                }
                var10000 = ~var15;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    return false;
                }
                int var17 = arg4 + var15;
                var10++;
                if (arg3[var10] > var17) {
                    return false;
                }
                int var18 = arg4 + var17;
                var10++;
                if (arg3[var10] > var18) {
                    return false;
                }
                int var19 = arg4 + var18;
                var10++;
                if (arg3[var10] > var19) {
                    return false;
                }
                var15 = arg4 + var19;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method2282(int arg0) {
        if (arg0 == -31530) {
            field5286 = null;
        }
    }
}
