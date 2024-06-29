import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class311 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "F")
    public static float field4472;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 11)
    public static final int method2005(String arg0, int arg1) {
        if (arg1 != -1) {
            method2005(null, -19);
        }
        field4474++;
        if (!class407.field5733.field10576) {
            return -1;
        } else if (class722.field9959.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class253.method1692((byte) -120, arg0);
            if (var2 == null) {
                return -1;
            }
            String var3 = class648.field9060 + var2;
            if (!class457.field6388.method1846((byte) -101, "", var3)) {
                return -1;
            } else if (class457.field6388.method1837((byte) -99, var3)) {
                byte[] var4 = class457.field6388.method1861(true, var3, "");
                Object var5 = null;
                File var6;
                try {
                    var6 = class272.method1772(-16819, var2);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class313.method2016(~arg1, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class407.field5733.method4238(-110, var6, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class785.method4305(var6, arg0, 68);
                return 100;
            } else {
                return class457.field6388.method1868(0, var3);
            }
        }
    }
}
