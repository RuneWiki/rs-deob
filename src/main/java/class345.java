import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class345 {

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5352 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field5353 = -1;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lih;")
    public static class143 field5355;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V", line = 7)
    public static final void method2387(int arg0, int[] arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 != -24834) {
            method2388(113, 108);
        }
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg0; var9 < arg3; var9++) {
                if (arg1[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method2387(arg0, arg1, arg2 ^ 0x0, var6 - 1, arg4);
            method2387(var6 + 1, arg1, -24834, arg3, arg4);
        }
        field5354++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Ljava/lang/String;", line = 60)
    public static final String method2388(int arg0, int arg1) {
        field5351++;
        String var2 = Integer.toString(arg1);
        if (arg0 != -1) {
            field5355 = (class143) null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class147.field2410 + " (" + var2 + ")</col>";
        } else if (var2.length() <= 6) {
            return " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class334.field5129 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 90)
    public static void method2389(boolean arg0) {
        field5355 = null;
        if (!arg0) {
            method2389(true);
        }
        field5352 = null;
    }
}
