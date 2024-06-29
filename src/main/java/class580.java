import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class580 extends class415 {

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field7339 = 0;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lwm;")
    public static class30 field7337;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method3107(int arg0, int arg1, int arg2, int arg3) {
        field7336++;
        if (class575.field7313 == arg1 && class203.field2814 == arg3 && class746.field10200 == arg2) {
            return;
        }
        class746.field10200 = arg2;
        class575.field7313 = arg1;
        class689.field8852 = true;
        class203.field2814 = arg3;
        double var4 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class64.field842 = var10;
        class313.field3900 = 0.0D;
        class585.field7402 = -var10 * var12;
        class633.field8026 = var8 * var12;
        class252.field3436 = var14;
        class329.field4027 = var8;
        class733.field9684 = -var8 * var14;
        class215.field2934 = var12;
        class595.field7565 = var10 * var14;
        if (arg0 < 40) {
            field7339 = 23;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 67)
    public static final void method3108(int arg0) {
        for (int var1 = 0; var1 < class303.field3823; var1++) {
            class327 var2 = class718.field9426[var1];
            if (var2.field4011 == 3) {
                if (var2.field4014 == null) {
                    var2.field4012 = Integer.MIN_VALUE;
                } else {
                    class1.field10.method30(var2.field4014);
                }
            }
        }
        if (arg0 != Integer.MIN_VALUE) {
            field7341 = -29;
        }
        field7340++;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 96)
    public static void method3109(int arg0) {
        if (arg0 == 14178) {
            field7337 = null;
        }
    }
}
