import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class521 extends class567 {

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)Lkf;")
    public static final class212 method3007(int arg0, byte arg1) {
        field7332++;
        int var2 = -9 % ((arg1 + 36) / 33);
        return class320.field4334 && arg0 >= class74.field1186 && class560.field7763 >= arg0 ? class239.field3332[arg0 - class74.field1186] : null;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)Ljg;")
    public abstract class284 method478(byte arg0);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(FIIIII[FIIIF)V")
    public static final void method3008(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, int arg8, int arg9, float arg10) {
        int var11 = arg2 - arg8;
        int var12 = arg7 - arg5;
        int var13 = arg1 - arg4;
        field7331++;
        float var14 = arg6[2] * (float) var13 + arg6[0] * (float) var11 + arg6[1] * (float) var12;
        float var15 = arg6[5] * (float) var13 + arg6[3] * (float) var11 + arg6[4] * (float) var12;
        float var16 = arg6[8] * (float) var13 + arg6[7] * (float) var12 + arg6[6] * (float) var11;
        if (arg9 > -47) {
            return;
        }
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg10 + 0.5F;
        if (arg3 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg3 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg3 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class523.field7352 = var18;
        class586.field8382 = var17;
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)V")
    public static final void method3009(byte arg0) {
        class77.field1235++;
        class351.method2108(class335.field4462, -10511);
        field7333++;
        class479.field6754.method108((byte) -128, 0);
        int var1 = 23 % ((-arg0 - 46) / 56);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
    public static final boolean method3010(int arg0) {
        field7330++;
        return arg0 == 8 ? class58.field1054 : false;
    }

    static {
        new class104("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
