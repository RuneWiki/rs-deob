import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class219 extends class330 {

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "Ldaa;")
    public static class453 field2999 = new class453();

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIILoe;ILada;IIB)V")
    public static final void method1354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class15 arg6, int arg7, class267 arg8, int arg9, int arg10, byte arg11) {
        class315.field4518 = null;
        class154.field2013 = null;
        class728.field10065 = arg4;
        class692.field9664 = arg10;
        class121.field1612 = arg3;
        class537.field7424 = arg2;
        class685.field9571 = null;
        class235.field3534 = arg5;
        class476.field6608 = arg7;
        class774.field10659 = arg6;
        class746.field10284 = arg1;
        class269.field3893 = arg9;
        class18.field112 = arg8;
        ++field2996;
        class744.field10272 = arg0;
        class529.method3148(0);
        if (arg11 >= -43) {
            method1354(117, -22, -118, 14, 63, 89, (class15) null, -29, (class267) null, -121, 41, (byte) 12);
        }
        class301.field4373 = true;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field2997;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            method1354(-30, 51, -128, 103, 112, -88, (class15) null, 99, (class267) null, 41, -3, (byte) 4);
        }
        if (super.field4630.field5704) {
            int[][] var4 = this.method2082(arg0, 0, 126);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class80.field901; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBLns;)V")
    public static final void method1355(int arg0, byte arg1, class654 arg2) {
        ++field2998;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field9183 <= class533.field7336) {
            if (~arg2.field9206 <= ~class533.field7336) {
                class221.method1357(-9774, arg2);
            } else {
                class24.method104(-4710, arg2, false);
                var4 = class742.field10221;
                var3 = class612.field8621;
            }
        } else {
            class361.method2272((byte) -72, arg2);
        }
        if (arg2.field3470 < 512 || ~arg2.field3460 > -513 || ~((class741.field10208 + -1) * 512) >= ~arg2.field3470 || (class525.field7224 + -1) * 512 <= arg2.field3460) {
            arg2.field9150 = -1;
            arg2.field9206 = 0;
            var3 = -1;
            var4 = 0;
            arg2.field9183 = 0;
            arg2.field9173 = null;
            arg2.field3470 = arg2.field9219[0] * 512 - -(arg2.method3744(1) * 256);
            arg2.field3460 = arg2.field9214[0] * 512 + arg2.method3744(1) * 256;
            arg2.method3747(0);
            for (int var5 = 0; ~arg2.field9154.length < ~var5; ++var5) {
                arg2.field9154[var5].field111 = -1;
            }
        }
        if (class724.field10031 == arg2 && (~arg2.field3470 > -6145 || ~arg2.field3460 > -6145 || ~arg2.field3470 <= ~(class741.field10208 * 512 - 6144) || arg2.field3460 >= class525.field7224 * 512 + -6144)) {
            var4 = 0;
            var3 = -1;
            arg2.field9206 = 0;
            arg2.field9150 = -1;
            arg2.field9183 = 0;
            arg2.field9173 = null;
            arg2.field3470 = arg2.field9219[0] * 512 + 256 * arg2.method3744(1);
            arg2.field3460 = arg2.field9214[0] * 512 + arg2.method3744(1) * 256;
            arg2.method3747(0);
            for (int var6 = 0; arg2.field9154.length > var6; ++var6) {
                arg2.field9154[var6].field111 = -1;
            }
        }
        if (arg1 < 42) {
            method1354(20, 121, 89, 74, -10, 59, (class15) null, 40, (class267) null, 29, -122, (byte) 124);
        }
        int var7 = class568.method3343(arg2, false);
        class564.method3334(arg2, -1);
        class58.method478(var3, var7, var4, -127, arg2);
        class439.method2633(var3, arg2, 0);
        class641.method3686((byte) -101, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(B)V")
    public static void method1356(byte arg0) {
        if (arg0 == 114) {
            field2999 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
    public class219() {
        super(1, true);
    }
}
