import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public abstract class class470 {

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lht;")
    public static class582 field6437 = new class582(11, 4);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "Lwu;")
    public static class376 field6438;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method2648(int arg0) {
        if (arg0 != -1) {
            field6438 = null;
        }
        field6437 = null;
        field6438 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZIIBII)V")
    public static final void method2649(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field6436++;
        if (arg3 != -107) {
            return;
        }
        long var6 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg4);
        class287 var8 = (class287) class78.field953.method2135(var6, (byte) 31);
        if (var8 == null) {
            var8 = new class287();
            class78.field953.method2143(arg3 + 106, var8, var6);
        }
        if (var8.field4061.length <= arg1) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field4061.length; var11++) {
                var9[var11] = var8.field4061[var11];
                var10[var11] = var8.field4063[var11];
            }
            for (int var12 = var8.field4061.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field4061 = var9;
            var8.field4063 = var10;
        }
        var8.field4061[arg1] = arg5;
        var8.field4063[arg1] = arg2;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z")
    public static final boolean method2650(byte arg0) {
        field6439++;
        if (class358.field4998) {
            try {
                class124.method987("showVideoAd", -8364, class514.field6818);
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = -42 % ((82 - arg0) / 34);
        return false;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "([FIFBIFIIFFI)V")
    public abstract void method2651(float[] arg0, int arg1, float arg2, byte arg3, int arg4, float arg5, int arg6, int arg7, float arg8, float arg9, int arg10);
}
