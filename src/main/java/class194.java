import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class194 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Lhg;")
    public static class647 field2289 = new class647(1);

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2290 = -1;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lgca;")
    public static class234 field2293;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[Lxa;")
    public static class468[] field2291;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIZII)V")
    public static final void method1142(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2292++;
        int var6 = arg0 - arg5;
        int var7 = arg4 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class231.method1397(arg1, arg2, arg5, arg0, (byte) -17);
            }
        } else if (var6 == 0) {
            class380.method2187(arg5, arg2, 468, arg4, arg1);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg5;
                int var10 = arg4;
                arg4 = arg0;
                arg5 = var9;
                arg0 = var10;
            }
            if (arg1 > arg4) {
                int var11 = arg1;
                arg1 = arg4;
                int var12 = arg5;
                arg4 = var11;
                arg5 = arg0;
                arg0 = var12;
            }
            if (arg3) {
                method1143(-10);
            }
            int var13 = arg5;
            int var14 = arg4 - arg1;
            int var15 = arg0 - arg5;
            int var16 = -(var14 >> 1);
            int var17 = arg0 <= arg5 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg1; var19 <= arg4; var19++) {
                    class30.field364[var19][var13] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg4; var18++) {
                    var16 += var15;
                    class30.field364[var13][var18] = arg2;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        if (arg0 != 1) {
            method1142(56, 93, -25, true, -23, -58);
        }
        field2291 = null;
        field2293 = null;
        field2289 = null;
    }
}
