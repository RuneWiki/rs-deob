import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class406 extends IOException {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lrga;")
    public static class280 field5081 = new class280(52, 4);

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Z")
    public static boolean field5082 = false;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "F")
    public static float field5079;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZIIII)V")
    public static final void method2160(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field5080++;
        long var6 = (long) (arg5 | (arg1 ? Integer.MIN_VALUE : 0));
        class492 var8 = (class492) class422.field5307.method399(-32748, var6);
        int var9 = -101 % (arg0 / 47);
        if (var8 == null) {
            var8 = new class492();
            class422.field5307.method402(var8, (byte) -72, var6);
        }
        if (arg3 >= var8.field6496.length) {
            int[] var10 = new int[arg3 + 1];
            int[] var11 = new int[arg3 + 1];
            for (int var12 = 0; var12 < var8.field6496.length; var12++) {
                var10[var12] = var8.field6496[var12];
                var11[var12] = var8.field6495[var12];
            }
            for (int var13 = var8.field6496.length; var13 < arg3; var13++) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var8.field6496 = var10;
            var8.field6495 = var11;
        }
        var8.field6496[arg3] = arg2;
        var8.field6495[arg3] = arg4;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class406(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
    public static void method2161(boolean arg0) {
        field5081 = null;
        if (arg0) {
            method2161(false);
        }
    }
}
