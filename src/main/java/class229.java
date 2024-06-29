import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class229 extends class415 {

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3807 = null;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "[I")
    public static int[] field3811 = new int[32];

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "[I")
    public static int[] field3812 = new int[3];

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "Lnj;")
    public static class317 field3804 = new class317();

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(Z)V")
    public static void method1641(boolean arg0) {
        if (!arg0) {
            method1641(false);
        }
        field3807 = null;
        field3811 = null;
        field3812 = null;
        field3804 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B[B)Z")
    public static final boolean method1642(byte arg0, byte[] arg1) {
        ++field3810;
        class208 var2 = new class208(arg1);
        int var3 = var2.method1445(arg0 + -64);
        if (var3 != 2) {
            return false;
        } else {
            boolean var4 = var2.method1445(arg0 + -50) == 1;
            if (var4) {
                class491.method3011(var2, -98);
            }
            class457.method2867(var2, arg0 + -45);
            if (arg0 != -63) {
                method1642((byte) -34, (byte[]) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)I")
    public static int method1643(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIF)V")
    public class229(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZF)V")
    public final void method207(boolean arg0, float arg1) {
        if (arg0) {
            method1641(true);
        }
        ++field3805;
        super.field6283 = arg1;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)V")
    public final void method213(int arg0, int arg1, int arg2, int arg3) {
        super.field6295 = arg2;
        super.field6288 = arg3;
        if (arg0 != -14174) {
            this.method213(66, -40, -57, -63);
        }
        super.field6282 = arg1;
        ++field3808;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lza;B)V")
    public static final void method1644(class497 arg0, byte arg1) {
        arg0.method1307(0, 0, class489.field7400, 350);
        ++field3806;
        arg0.method1260(0, 0, class489.field7400, 350, class9.field99 << 24 | 3351159, 1);
        int var2 = 350 / class484.field7358;
        if (~class274.field4352 < -1) {
            int var3 = 342 - class484.field7358;
            int var4 = var2 * var3 / (var2 - (-class274.field4352 - -1));
            int var5 = 4;
            if (~class274.field4352 < -2) {
                var5 += (class274.field4352 + -1 + -class294.field4642) * (-var4 + var3) / (class274.field4352 + -1);
            }
            arg0.method1260(class489.field7400 + -16, var5, 12, var4, class9.field99 << 24 | 3351159, 2);
            for (int var6 = class294.field4642; ~var6 > ~(class294.field4642 + var2) && ~class274.field4352 < ~var6; ++var6) {
                String[] var7 = class506.method3074((byte) 122, class390.field5937[var6], '\b');
                int var8 = (class489.field7400 + -8 + -16) / var7.length;
                for (int var9 = 0; ~var9 > ~var7.length; ++var9) {
                    int var10 = var8 * var9 + 8;
                    arg0.method1307(var10, 0, var10 + -8 + var8, 350);
                    class128.field1741.method2009(-1, -16777216, var7[var9], var10, false, 348 - (class240.field3902 - (-((-class294.field4642 + var6) * class484.field7358) + -class378.field5807.field5295)));
                }
            }
        }
        arg0.method1307(0, 0, class489.field7400, 350);
        arg0.method3046(-class240.field3902 + 350, -1, 0, 2, class489.field7400);
        if (arg1 == 109) {
            class289.field4571.method2009(-1, -16777216, "--> " + class55.field827, 10, false, 350 - class306.field4807.field5295 + -1);
            int var11 = -1;
            if (class88.field1278 % 30 > 15) {
                var11 = 16777215;
            }
            arg0.method3036(12, 10 + class306.field4807.method2252("--> " + class55.field827.substring(0, class243.field3948), 0), var11, (byte) 63, -class306.field4807.field5295 + -11 + 350);
        }
    }
}
