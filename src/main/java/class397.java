import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class397 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lcq;")
    public static class72 field5390 = new class72("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field5392 = -1;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method2452(boolean arg0) {
        field5390 = null;
        if (!arg0) {
            field5392 = 36;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
    public static final int method2453(int arg0, int arg1) {
        if (arg0 == 100) {
            field5391++;
            return arg1 >>> 8;
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5389++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class363.field4937 - class229.field2945) * var8 / 100 + class229.field2945;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg7 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class363.field4927[var11] * -var10 >> 15;
            var15 = class363.field4917[var11] * var10 >> 15;
        }
        if (arg1 != -26713) {
            method2452(false);
        }
        if (var12 != 0) {
            var13 = class363.field4927[var12] * var15 >> 15;
            var15 = class363.field4917[var12] * var15 >> 15;
        }
        class178.field2081 = arg7;
        class80.field979 = arg0 - var15;
        class127.field1417 = 0;
        class287.field3784 = arg4 - var13;
        class51.field587 = arg3 - var14;
        class433.field5912 = arg5;
    }
}
