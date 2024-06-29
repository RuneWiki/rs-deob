import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class class538 {

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "[S")
    public static short[] field7524 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "Lan;")
    public static class21 field7523;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "Lle;")
    public static class257 field7520;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIBII)V")
    public static final void method3087(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field7525++;
        if (arg3 >= class326.field4387 && class596.field8621 >= arg5 && arg1 >= class264.field3687 && arg2 <= class591.field8435) {
            if (arg0 == 1) {
                class474.method2749(true, arg5, arg3, arg6, arg2, arg1);
            } else {
                class517.method2983(116, arg5, arg3, arg2, arg6, arg0, arg1);
            }
        } else if (arg0 == 1) {
            class576.method3282(arg5, arg6, arg2, arg1, arg3, arg4 - 162);
        } else {
            class596.method3523(arg3, arg2, arg6, arg0, arg1, (byte) -99, arg5);
        }
        if (arg4 != 62) {
            field7524 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static final void method3088(int arg0) {
        class494.field6919.method1295(((float) class491.field6875.field3350 * 0.1F + 0.7F) * class173.field2493);
        field7521++;
        if (arg0 < 27) {
            field7520 = null;
        }
        class494.field6919.method1298(class45.field871, class561.field7776, class151.field2296, (float) (class563.field7806 << 0), (float) (class628.field9195 << 0), (float) (class385.field5153 << 0));
        class494.field6919.method1277(class597.field8632);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public static void method3089(byte arg0) {
        field7524 = null;
        field7520 = null;
        field7523 = null;
        if (arg0 <= 48) {
            field7523 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BIIII)V")
    public static final void method3090(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7522++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        class266.method1742(26844, class182.field2580[arg2], arg3 + arg4, arg1, arg3 - arg4);
        if (arg0 > -46) {
            method3090((byte) -24, 60, 64, 82, 80);
        }
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class182.field2580[arg2 + var6];
                int[] var10 = class182.field2580[arg2 - var6];
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class266.method1742(26844, var9, var11, arg1, var12);
                class266.method1742(26844, var10, var11, arg1, var12);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class182.field2580[arg2 + var5];
            int[] var16 = class182.field2580[arg2 - var5];
            class266.method1742(26844, var15, var13, arg1, var14);
            class266.method1742(26844, var16, var13, arg1, var14);
        }
    }
}
