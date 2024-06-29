import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class295 extends class324 {

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "[I")
    public static int[] field4383 = new int[14];

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method1979(int arg0) {
        field4383 = null;
        if (arg0 != 0) {
            method1979(36);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Loa;IZLlq;ILgh;ILlm;)V")
    public static final void method1980(class605 arg0, int arg1, boolean arg2, class480 arg3, int arg4, class476 arg5, int arg6, class431 arg7) {
        if (arg2) {
            field4387 = -47;
        }
        field4384++;
        int var8 = arg3.field7056 - arg1 / 2 - 5;
        int var9 = arg4 + 2;
        if (arg7.field6416 != 0) {
            arg0.method3524(arg1 + 10, var9, (byte) 92, arg7.field6416, (arg4 + arg5.method2913() * arg6 - var9) + 1, var8);
        }
        if (arg7.field6411 != 0) {
            arg0.method3523(!arg2, arg5.method2913() * arg6 + arg4 + 1 - var9, var9, arg1 + 10, arg7.field6411, var8);
        }
        int var10 = arg7.field6392;
        if (arg3.field7055 && arg7.field6426 != -1) {
            var10 = arg7.field6426;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            String var12 = class484.field7095[var11];
            if (var11 < arg6 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg5.method2910(arg0, var12, arg3.field7056, arg4, var10, true);
            arg4 += arg5.method2913();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1981(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 != -1053) {
            return null;
        }
        field4386++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class297.field4400) {
            try {
                class67 var3 = (class67) Class.forName("sk").getDeclaredConstructor().newInstance();
                var3.method460(3256, arg1);
                return var3;
            } catch (Throwable var4) {
                class297.field4400 = true;
            }
        }
        return arg2 ? class558.method3236(0, arg1) : arg1;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(II)V")
    public class295(int arg0, int arg1) {
        this.field4385 = arg1;
        this.field4388 = arg0;
    }
}
