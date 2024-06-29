import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class217 extends class274 {

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "Ljava/awt/Frame;")
    public static Frame field3043;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "[B")
    private byte[] field3044;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIII)[B", line = 6)
    public final byte[] method1336(int arg0, int arg1, int arg2, int arg3) {
        field3045++;
        this.field3044 = new byte[arg1 * arg2 * arg3 * 2];
        this.method1930(arg1, arg2, 200, arg3);
        if (arg0 < 10) {
            method1339(true);
        }
        return this.field3044;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 19)
    public class217() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILts;)Z", line = 22)
    public static final boolean method1337(int arg0, class356 arg1) {
        if (arg0 != -128) {
            method1337(78, null);
        }
        field3046++;
        if (class231.field3231 == arg1.field5192) {
            class70.field1029 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZB)V", line = 44)
    public static final void method1338(boolean arg0, byte arg1) {
        field3047++;
        while (class234.field3288.method2223(class359.field5330, (byte) 121) >= 15) {
            int var2 = class234.field3288.method2229(15, -1);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class504.field7697[var2] == null) {
                class504.field7697[var2] = new class139();
                var3 = true;
                class504.field7697[var2].field4262 = var2;
            }
            class139 var4 = class504.field7697[var2];
            class263.field3749[class339.field4942++] = var2;
            var4.field4243 = class263.field3748;
            if (var4.field1825 != null && var4.field1825.method1662(arg1 + 77)) {
                class286.method1733(var4, 44);
            }
            int var5 = class234.field3288.method2229(1, -1);
            int var6 = class234.field3288.method2229(2, arg1 + 76);
            int var7;
            if (arg0) {
                var7 = class234.field3288.method2229(8, -1);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class234.field3288.method2229(5, -1);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            var4.method876(0, class508.field7744.method565(27114, class234.field3288.method2229(14, -1)));
            int var8 = class234.field3288.method2229(1, -1);
            if (var8 == 1) {
                class93.field1257[class389.field5771++] = var2;
            }
            int var9;
            if (arg0) {
                var9 = class234.field3288.method2229(8, -1);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = class234.field3288.method2229(5, -1);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = (class234.field3288.method2229(3, -1) + 4 & 0x4A800007) << 11;
            var4.method1769(var4.field1825.field3806, 0);
            var4.field4226 = var4.field1825.field3789 << 3;
            if (var4.field4226 == 0) {
                var4.method1771(-13670, 0);
            } else if (var3) {
                var4.method1771(arg1 - 13593, var10);
            }
            var4.method881(class415.field6145.field4279[0] + var7, var6, var5 == 1, class415.field6145.field4282[0] + var9, var4.method1773(-57), (byte) 90);
            if (var4.field1825.method1662(0)) {
                class204.method1256(var4.field2956, 0, null, var4, true, var4.field4279[0], null, var4.field4282[0]);
            }
        }
        class234.field3288.method2227(arg1 ^ 0xFFFFFFBB);
        if (arg1 != -77) {
            method1339(true);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V", line = 154)
    public static void method1339(boolean arg0) {
        if (!arg0) {
            method1339(true);
        }
        field3043 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)V", line = 164)
    public final void method1340(int arg0, int arg1, byte arg2) {
        field3048++;
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var5 = arg0 * 2;
        if (arg1 != 29447) {
            method1339(true);
        }
        this.field3044[var5++] = var4;
        this.field3044[var5] = var4;
    }
}
