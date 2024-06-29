import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class24 extends class185 {

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "Z")
    public static boolean field290 = false;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "[J")
    public static long[] field289 = new long[100];

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field295 = 0;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Lik;")
    public static class267 field297 = new class267(4);

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)V")
    public static final void method150(boolean arg0) {
        class196.field2979.method1106(40, arg0);
        ++class46.field748;
        class196.field2979.method1568(class13.method75(0), (byte) 49);
        ++field292;
        class196.field2979.method1605(class77.field1245, (byte) 61);
        class196.field2979.method1605(class180.field2748, (byte) 38);
        class196.field2979.method1568(class154.field2318, (byte) 49);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class24() {
        this(4096);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            class193.method1212(var3, 0, class174.field2648, this.field288);
        }
        ++field285;
        if (arg1 < 70) {
            field289 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBIII)V")
    public static final void method151(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field294;
        int var5 = arg2;
        int var6 = 0;
        int var7 = class86.method565(class248.field3765, arg3 - -arg2, class163.field2505, 8142);
        int var8 = -arg2;
        int var9 = -1;
        int var10 = class86.method565(class248.field3765, arg3 - arg2, class163.field2505, 8142);
        class64.method429(class23.field284[arg0], var10, (byte) 87, arg4, var7);
        if (arg1 != 52) {
            field295 = 9;
        }
        while (var6 < var5) {
            var9 += 2;
            var8 += var9;
            if (var8 > 0) {
                --var5;
                int var11 = arg0 + var5;
                int var12 = -var5 + arg0;
                if (~class243.field3635 >= ~var11 && var12 <= class118.field1782) {
                    int var13 = class86.method565(class248.field3765, arg3 + var6, class163.field2505, 8142);
                    int var14 = class86.method565(class248.field3765, -var6 + arg3, class163.field2505, arg1 ^ 8186);
                    if (~var11 >= ~class118.field1782) {
                        class64.method429(class23.field284[var11], var14, (byte) 96, arg4, var13);
                    }
                    if (~var12 <= ~class243.field3635) {
                        class64.method429(class23.field284[var12], var14, (byte) 109, arg4, var13);
                    }
                }
                var8 -= var5 << 1;
            }
            ++var6;
            int var15 = arg0 + var6;
            int var16 = -var6 + arg0;
            if (~var15 <= ~class243.field3635 && var16 <= class118.field1782) {
                int var17 = class86.method565(class248.field3765, arg3 + var5, class163.field2505, arg1 + 8090);
                int var18 = class86.method565(class248.field3765, -var5 + arg3, class163.field2505, 8142);
                if (~var15 >= ~class118.field1782) {
                    class64.method429(class23.field284[var15], var18, (byte) 112, arg4, var17);
                }
                if (~class243.field3635 >= ~var16) {
                    class64.method429(class23.field284[var16], var18, (byte) 122, arg4, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
    public class24(int arg0) {
        super(0, true);
        this.field288 = 4096;
        this.field288 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    public static final void method152(int arg0, int arg1, int arg2) {
        ++field296;
        class187 var3 = class120.method762((byte) -115, 5, arg0);
        var3.method1167(-121);
        if (arg1 <= -27) {
            var3.field2844 = arg2;
        }
    }

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)V")
    public static void method153(int arg0) {
        field297 = null;
        if (arg0 == 0) {
            field289 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field287;
        if (arg2 != -6357) {
            field295 = 125;
        }
        if (arg0 == 0) {
            this.field288 = (arg1.method1593((byte) 27) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)[Lmc;")
    public static final class201[] method154(byte arg0) {
        ++field291;
        class201[] var1 = new class201[class215.field3224];
        int var2 = 0;
        if (arg0 != -1) {
            field295 = -101;
        }
        while (class215.field3224 > var2) {
            int var3 = class82.field1312[var2] * class220.field3315[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class10.field129[var2];
            for (int var6 = 0; var6 < var3; ++var6) {
                var4[var6] = class183.field2775[class94.method598(255, var5[var6])];
            }
            var1[var2] = new class201(class162.field2494, class256.field3915, class10.field139[var2], class273.field4104[var2], class220.field3315[var2], class82.field1312[var2], var4);
            ++var2;
        }
        class82.method537(0);
        return var1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Lnj;")
    public static final class144 method155(int arg0, byte arg1) {
        ++field298;
        class144 var2 = (class144) class20.field235.method122((long) arg0, (byte) -75);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class76.field1228.method1973(1, 11, arg0);
            class144 var4 = new class144();
            if (var3 != null) {
                var4.method884(new class248(var3), (byte) 125);
            }
            class20.field235.method119((long) arg0, var4, 0);
            if (arg1 != -33) {
                field295 = -83;
            }
            return var4;
        }
    }
}
