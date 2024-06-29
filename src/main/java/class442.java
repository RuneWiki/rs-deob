import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class442 extends class393 {

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Ljava/lang/String;")
    public String field6451;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field6455 = 0;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field6460 = 0;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field6463 = 0;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lqj;")
    public static class238 field6453;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
    public static int[] field6459;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public static void method2790(int arg0) {
        field6453 = null;
        if (arg0 != 0) {
            method2791(95, 95, 81);
        }
        field6459 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
    public static final void method2791(int arg0, int arg1, int arg2) {
        field6456++;
        class256 var3 = class363.method2385(12, arg0, (byte) 1);
        var3.method1614(0);
        if (arg2 <= 37) {
            method2790(44);
        }
        var3.field3756 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
    public static final void method2792(int arg0, int arg1) {
        field6457++;
        class52.field762.method215(0, arg1);
        class220.field3136.method215(arg0 ^ arg0, arg1);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lil;II)V")
    public static final void method2793(class265 arg0, int arg1, int arg2) {
        if (class228.field3220 != null) {
            try {
                class228.field3220.method408(arg2 - 20164, 0L);
                class228.field3220.method415(arg0.field3879, 24, arg1, 79);
            } catch (Exception var3) {
            }
        }
        field6461++;
        if (arg2 != 20164) {
            field6455 = 77;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class442() {
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class442(String arg0) {
        this.field6451 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lud;I)[Ldk;")
    public static final class432[] method2794(class2 arg0, int arg1) {
        field6452++;
        if (!arg0.method15(1774773648)) {
            return new class432[0];
        }
        class296 var2 = arg0.method31(14);
        while (var2.field4259 == 0) {
            class404.method2628(-50, 10L);
        }
        if (var2.field4259 == 2) {
            return new class432[0];
        }
        int[] var3 = (int[]) var2.field4262;
        class432[] var4 = new class432[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class432 var6 = new class432();
            var4[var5] = var6;
            var6.field6371 = var3[var5 << 2];
            var6.field6374 = var3[(var5 << 2) + 1];
            var6.field6376 = var3[(var5 << 2) + 2];
            var6.field6372 = var3[(var5 << 2) + 3];
        }
        if (arg1 != -31353) {
            field6459 = null;
        }
        return var4;
    }
}
