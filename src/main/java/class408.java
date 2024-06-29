import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class408 {

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public int field6146 = 1;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Lcda;")
    public static class149 field6151 = new class149("stellardawn", 1);

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "C")
    public char field6150;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZLjava/lang/String;Lkea;Z)Lfaa;", line = 4)
    public static final class136 method2581(boolean arg0, String arg1, class203 arg2, boolean arg3) {
        field6145++;
        int var4 = arg2.method1283((byte) -104, arg1);
        if (var4 == -1) {
            return new class136(0);
        }
        int[] var5 = arg2.method1285(var4, 118);
        if (arg0) {
            return null;
        }
        class136 var6 = new class136(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field1695) {
                class194 var9 = new class194(arg2.method1286(var5[var8++], var4, (byte) -49));
                int var10 = var9.method1178(-230315992);
                int var11 = var9.method1220(121);
                int var12 = var9.method1177(255);
                if (!arg3 && var12 == 1) {
                    var6.field1695--;
                } else {
                    var6.field1693[var7] = var10;
                    var6.field1694[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 50)
    public static void method2582(byte arg0) {
        field6151 = null;
        if (arg0 != -95) {
            method2584(81, -64, 90, -31);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lrt;II)V", line = 61)
    private final void method2583(class194 arg0, int arg1, int arg2) {
        field6148++;
        if (arg1 == 1) {
            this.field6150 = class247.method1635(16, arg0.method1213((byte) 91));
        } else if (arg1 == 2) {
            this.field6146 = 0;
        }
        if (arg2 != -3) {
            method2582((byte) -16);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)I", line = 82)
    public static final int method2584(int arg0, int arg1, int arg2, int arg3) {
        field6149++;
        if (arg1 > -77) {
            method2582((byte) 84);
        }
        if ((class443.field6617[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class443.field6617[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[BII)[B", line = 101)
    public static final byte[] method2585(int arg0, byte[] arg1, int arg2, int arg3) {
        field6147++;
        if (arg3 <= 49) {
            return null;
        }
        byte[] var4;
        if (arg2 > 0) {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg1[arg2 + var5];
            }
        } else {
            var4 = arg1;
        }
        class626 var6 = new class626();
        var6.method3593(true);
        var6.method3590((long) (arg0 * 8), 0, var4);
        byte[] var7 = new byte[64];
        var6.method3596(var7, (byte) -121, 0);
        return var7;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILrt;)V", line = 135)
    public final void method2586(int arg0, class194 arg1) {
        field6144++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                return;
            }
            this.method2583(arg1, var3, arg0 - 2);
        }
    }
}
