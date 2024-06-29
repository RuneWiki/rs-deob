import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class56 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lam;")
    public static class286 field895 = new class286(0, 0);

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
    public static int[] field897 = new int[16384];

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    public static int[] field898 = new int[16384];

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
    public static int[] field899 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)Lgn;")
    public static final class170 method439(int arg0, boolean arg1) {
        field894++;
        class170 var2 = (class170) class275.field4135.method2228(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class156.field2362.method1355(arg0, -12607, 1);
        } else {
            var3 = class22.field329.method1355(arg0 & 0x7FFF, -12607, 1);
        }
        class170 var4 = new class170();
        if (!arg1) {
            return null;
        }
        if (var3 != null) {
            var4.method1302(-1, new class37(var3));
        }
        if (arg0 >= 32768) {
            var4.method1295(32768);
        }
        class275.field4135.method2226((long) arg0, var4, (byte) -108);
        return var4;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method440(int arg0) {
        if (arg0 == 0) {
            field898 = null;
            field895 = null;
            field897 = null;
            field899 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ldp;Ldp;I)V")
    public static final void method441(class174 arg0, class174 arg1, int arg2) {
        field896++;
        class90.field1435 = arg0;
        class397.field5848 = arg1;
        class303.field4421 = class397.field5848.method1333(arg2, 3);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z")
    public static final boolean method442(int arg0) {
        field900++;
        if (class373.field5302) {
            try {
                if ((Boolean) class412.method2587(class188.field2783.field2639, -113, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == 0;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field897[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field898[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }
}
