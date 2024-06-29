import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class294 {

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Lqe;")
    public static class469 field4195 = new class469(89, 5);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILvs;Lao;I)V", line = 10)
    public static final void method1865(int arg0, class593 arg1, class288 arg2, int arg3) {
        field4196++;
        if (class107.field1497 >= 50 || arg2 == null || arg2.field4090 == null || arg0 >= arg2.field4090.length || arg2.field4090[arg0] == null) {
            return;
        }
        int var4 = arg2.field4090[arg0][0];
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        if (arg2.field4090[arg0].length > 1) {
            int var7 = (int) ((double) arg2.field4090[arg0].length * Math.random());
            if (var7 > 0) {
                var5 = arg2.field4090[arg0][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg2.field4092 != null && arg2.field4093 != null) {
            var9 = arg2.field4092[arg0] + (int) (Math.random() * (double) (arg2.field4093[arg0] - arg2.field4092[arg0]));
        }
        int var10 = arg2.field4105 == null ? 255 : arg2.field4105[arg0];
        if (var8 == 0) {
            if (class130.field1749 == arg1) {
                if (arg2.field4091) {
                    class176.method1258(50, var9, false, 0, var5, var10, var6);
                    return;
                }
                class258.method1683(var9, var10, var5, (byte) -11, var6, 0);
            }
        } else if (class63.field916.field10211.method2268(17503) != 0 && arg3 < -13) {
            int var11 = arg1.field8423 - 256 >> 9;
            int var12 = arg1.field8428 - 256 >> 9;
            int var13 = class130.field1749 == arg1 ? 0 : (arg1.field8429 << 24) + (var11 << 16) + (var12 << 8) + var8;
            class282.field4007[class107.field1497++] = new class247((byte) (arg2.field4091 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg1);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lca;B)V", line = 83)
    public static final void method1866(class306 arg0, byte arg1) {
        field4194++;
        arg0.field4329 = false;
        if (arg0.field4328 != null) {
            arg0.field4328.field1468 = 0;
        }
        for (class306 var2 = arg0.method1485(); var2 != null; var2 = arg0.method1488()) {
            method1866(var2, (byte) 30);
        }
        if (arg1 <= 21) {
            method1866(null, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 121)
    public static void method1867(int arg0) {
        if (arg0 < 0) {
            field4195 = null;
        }
    }
}
