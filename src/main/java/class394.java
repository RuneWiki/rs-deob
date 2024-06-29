import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class394 extends class438 {

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field5901;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Loo;")
    public static class31 field5906 = new class31("LIVE", 0);

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Z")
    public static boolean field5908;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "[I")
    public static int[] field5907;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2365(int arg0) {
        field5905++;
        if (arg0 != 0) {
            field5906 = null;
        }
        return this.field5901;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
    public static final void method2366(int arg0) {
        field5904++;
        class415 var1 = null;
        try {
            class533 var2 = class25.field375.method825(arg0 - 13773, "3", false);
            if (arg0 != 13773) {
                return;
            }
            while (var2.field7848 == 0) {
                class389.method2332(arg0 ^ 0xFFFFCA5B, 1L);
            }
            if (var2.field7848 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class415) var2.field7849;
            byte[] var3 = new byte[(int) var1.method2484(87)];
            if (var3.length == 0) {
                class489.field7291 = "";
                class269.field4001 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2488(var4, var3, 0, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class468 var6 = new class468(var3);
                int var7 = var6.method2765(arg0 - 13656);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field6830 = var7 + 1;
                if (!var6.method2762(255)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field6830 = 1;
                int var8 = var6.method2765(120);
                if (var8 != 0) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class269.field4001 = var6.method2776((byte) -104);
                class489.field7291 = var6.method2776((byte) -86);
            }
        } catch (Exception var10) {
            class269.field4001 = "";
            class489.field7291 = "";
        }
        try {
            if (var1 != null) {
                var1.method2485(arg0 ^ 0x35A2);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLvd;IIII)Lwq;")
    public static final class283 method2367(byte arg0, class258 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -89) {
            return null;
        }
        field5902++;
        if (!arg1.field3845 && (!class384.method2305(arg0 ^ 0xFFFFFFA6, arg5) || !class384.method2305(arg0 + 90, arg2))) {
            return arg1.field3744 ? new class283(arg1, 34037, arg4, arg3, arg5, arg2, true) : new class283(arg1, arg4, arg3, arg5, arg2, class143.method1039(8, arg5), class143.method1039(8, arg2), true);
        } else {
            return new class283(arg1, 3553, arg4, arg3, arg5, arg2, true);
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)Z")
    public final boolean method2368(int arg0) {
        if (arg0 <= 120) {
            field5906 = null;
        }
        field5903++;
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V")
    public static void method2369(byte arg0) {
        if (arg0 >= -61) {
            field5907 = null;
        }
        field5906 = null;
        field5907 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lrb;Ljava/lang/Object;I)V")
    public class394(class284 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5901 = arg1;
    }
}
