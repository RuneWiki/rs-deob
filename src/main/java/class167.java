import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class167 {

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field2477 = Boolean.FALSE;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public static void method1162(int arg0) {
        if (arg0 != 0) {
            method1165(null, 2, -12);
        }
        field2477 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIILkh;Lkh;IZII)V")
    public static final void method1163(int arg0, int arg1, int arg2, int arg3, class400 arg4, class400 arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field2472++;
        int var10 = arg5.method2121(9);
        if (arg7 || var10 == -1) {
            return;
        }
        Object var11 = null;
        class127 var12 = (class127) class145.field2185.method2288((long) var10, 0);
        if (var12 == null) {
            class319[] var13 = class319.method1995(class142.field2146, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class407.field6147.method98(var13[0], true);
            class145.field2185.method2290((long) var10, var12, 113);
        }
        class426.method2528(arg1, arg6, -80, arg9 >> 1, arg4.field7681, 0, arg4.method2419((byte) 126) * 64, arg4.field7686, arg8 >> 1, arg4.field7671);
        int var14 = arg3 + class142.field2140[0] - 18;
        int var15 = class142.field2140[1] + arg0 - 16 - 54;
        int var16 = arg2 / 4 * 18 + var14;
        int var17 = arg2 % 4 * 18 + var15;
        var12.method936(var16, var17);
        if (arg4 == arg5) {
            class407.field6147.method123(var17 - 1, arg7, -256, 18, 18, var16 - 1);
        }
        class245 var18 = class132.method973((byte) -8);
        var18.field3395 = var16;
        var18.field3389 = var17 + 16;
        var18.field3392 = arg5;
        var18.field3388 = var17;
        var18.field3386 = var16 + 16;
        class410.field6199.method3094(-2713, var18);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;BC)[Ljava/lang/String;")
    public static final String[] method1164(String arg0, byte arg1, char arg2) {
        field2474++;
        int var3 = class364.method2176(arg2, arg0, true);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 73) {
            method1162(-43);
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "([BII)[B")
    public static final byte[] method1165(byte[] arg0, int arg1, int arg2) {
        field2475++;
        if (arg2 != -1379618463) {
            field2477 = null;
        }
        byte[] var3 = new byte[arg1];
        class442.method2590(arg0, 0, var3, 0, arg1);
        return var3;
    }
}
