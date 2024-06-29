import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class45 extends class107 {

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "[J")
    public static long[] field617 = new long[32];

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "[S")
    public static short[] field620 = new short[] { 44, 19, 48, 47, 9, 23, 2, 18 };

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "Ljd;")
    public static class139 field621;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIBII)V")
    public static final void method327(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field619++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg1 * arg1;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        if (arg0 >= class221.field2942 && class205.field2784 >= arg0) {
            int var21 = class309.method1706(class425.field5751, arg1 + arg2, 6798, class136.field1985);
            int var22 = class309.method1706(class425.field5751, arg2 - arg1, 6798, class136.field1985);
            class330.method1834(var21, class102.field1472[arg0], arg5, var22, 25084);
        }
        if (arg3 > -112) {
            field620 = null;
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (var24 >= class221.field2942 && class205.field2784 >= var23) {
                int var25 = class309.method1706(class425.field5751, arg2 + var6, 6798, class136.field1985);
                int var26 = class309.method1706(class425.field5751, arg2 - var6, 6798, class136.field1985);
                if (class221.field2942 <= var23) {
                    class330.method1834(var25, class102.field1472[var23], arg5, var26, 25084);
                }
                if (var24 <= class205.field2784) {
                    class330.method1834(var25, class102.field1472[var24], arg5, var26, 25084);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public static void method328(byte arg0) {
        field620 = null;
        field621 = null;
        if (arg0 < 34) {
            field617 = null;
        }
        field617 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lci;BLr;)V")
    public static final void method329(class287 arg0, byte arg1, class110 arg2) {
        int var3 = -11 / ((arg1 + 56) / 44);
        field623++;
        class245.field3257 = arg0;
        class119.field1740 = arg2;
    }
}
