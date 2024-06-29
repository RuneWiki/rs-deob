import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class753 {

    @OriginalMember(owner = "client!co", name = "c", descriptor = "Lbt;")
    public static class437 field10262 = new class437(9, -1);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field10260;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field10263;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field10264;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method4087(int arg0) {
        if (arg0 <= 75) {
            method4087(112);
        }
        field10262 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)V")
    public static final void method4088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class29.field255 = arg0;
        class285.field3668 = arg2;
        class650.field8287 = arg1;
        class240.field3277 = arg4;
        class552.field6974 = arg3;
        field10263++;
        int var6 = -40 % ((arg5 + 11) / 32);
        if (class552.field6974 >= 100) {
            int var7 = class285.field3668 * 512 + 256;
            int var8 = class650.field8287 * 512 + 256;
            int var9 = class512.method2831(class309.field3877, (byte) -117, var7, var8) - class240.field3277;
            int var10 = var7 - class97.field1309;
            int var11 = var9 - class439.field5770;
            int var12 = var8 - class148.field1890;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + (var12 * var12)));
            class463.field6022 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class232.field3122 = (int) (Math.atan2((double) var10, (double) var12) * -2607.5945876176133D) & 0x3FFF;
            if (class463.field6022 < 1024) {
                class463.field6022 = 1024;
            }
            class511.field6521 = 0;
            if (class463.field6022 > 3072) {
                class463.field6022 = 3072;
            }
        }
        class507.field6476 = 2;
        class525.field6679 = -1;
        class524.field6672 = -1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)I")
    public static final int method4089(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg1 != 7) {
            method4088(107, -62, -40, -42, 109, -97);
        }
        field10261++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }
}
