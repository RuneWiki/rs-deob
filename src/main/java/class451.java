import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class451 extends class477 {

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field6151 = 0;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Lwfa;")
    public static class54 field6153;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[Z")
    public static boolean[] field6154;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 12)
    public static void method2570(int arg0) {
        field6154 = null;
        if (arg0 != -1) {
            method2571(null, -47);
        }
        field6153 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 24)
    public static final void method2571(String arg0, int arg1) {
        field6152++;
        if (class603.field8242 == null) {
            class193.method1234((byte) 88);
        }
        String[] var2 = class105.method562(arg0, '\n', true);
        if (arg1 <= 75) {
            method2571(null, 16);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class541.field7402; var4 > 0; var4--) {
                class603.field8242[var4] = class603.field8242[var4 - 1];
            }
            class603.field8242[0] = var2[var3];
            if (class541.field7402 < (class603.field8242.length - 1)) {
                if (class443.field6117 > 0) {
                    class443.field6117++;
                }
                class541.field7402++;
            }
        }
    }
}
