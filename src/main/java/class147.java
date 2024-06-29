import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class147 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lcf;")
    public static class93 field2583 = method1066(" autres options", -48);

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lcf;")
    private static class93 field2589 = method1066("glow3:", -48);

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lcf;")
    public static class93 field2585 = field2589;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lcf;")
    private static class93 field2592 = method1066("Loading textures )2 ", -48);

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lcf;")
    public static class93 field2591 = field2592;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lcf;")
    public static class93 field2588 = method1066("M", -48);

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Lcf;")
    public static class93 field2595 = method1066("Lade Titelbild )2 ", -48);

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lcf;")
    public static class93 field2594 = field2589;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field2593 = 100;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method1064(int arg0) {
        field2592 = null;
        field2588 = null;
        field2591 = null;
        field2595 = null;
        field2585 = null;
        field2589 = null;
        field2594 = null;
        if (arg0 != 2047) {
            method1064(-27);
        }
        field2583 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2586++;
        int var8 = 2048 - arg2 & 0x7FF;
        if (arg7 != -1761035408) {
            field2584 = -99;
        }
        int var9 = 0;
        int var10 = 2048 - arg0 & 0x7FF;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class179.field3155[var8];
            var11 = -arg4 * var13 >> 16;
            int var14 = class179.field3158[var8];
            var12 = arg4 * var14 >> 16;
        }
        if (var10 != 0) {
            int var15 = class179.field3155[var10];
            var9 = var12 * var15 >> 16;
            int var16 = class179.field3158[var10];
            var12 = var12 * var16 >> 16;
        }
        class233.field4155 = arg0;
        class165.field2919 = arg1 - var12;
        class198.field3602 = arg2;
        class77.field1442 = arg6 - var11;
        class166.field2925 = arg3 - var9;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)Lcf;")
    public static final class93 method1066(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field2590++;
        int var3 = var2.length;
        int var4 = 0;
        class93 var5 = new class93();
        var5.field1683 = new byte[var3];
        if (arg1 != -48) {
            field2591 = null;
        }
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field1683[var5.field1629++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field1683[var5.field1629++] = (byte) var6;
            }
        }
        var5.method660(arg1 ^ 0xFFFFFFEA);
        return var5.method669(-4480);
    }
}
