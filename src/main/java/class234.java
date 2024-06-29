import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class234 extends class546 {

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "[F")
    private float[] field3703 = new float[4];

    @OriginalMember(owner = "client!fga", name = "A", descriptor = "Lsm;")
    private class259 field3715;

    @OriginalMember(owner = "client!fga", name = "H", descriptor = "Lsm;")
    private class259 field3722;

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "Lsm;")
    private class259 field3714;

    @OriginalMember(owner = "client!fga", name = "D", descriptor = "Lsm;")
    private class259 field3718;

    @OriginalMember(owner = "client!fga", name = "I", descriptor = "Lmca;")
    private class29 field3723;

    @OriginalMember(owner = "client!fga", name = "F", descriptor = "Z")
    private boolean field3720;

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3704 = null;

    @OriginalMember(owner = "client!fga", name = "v", descriptor = "Lvg;")
    public static class49 field3710 = new class49(10);

    @OriginalMember(owner = "client!fga", name = "y", descriptor = "I")
    public static int field3713 = 0;

    @OriginalMember(owner = "client!fga", name = "K", descriptor = "[F")
    public static float[] field3725 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!fga", name = "s", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!fga", name = "t", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!fga", name = "u", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!fga", name = "x", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!fga", name = "B", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!fga", name = "C", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!fga", name = "G", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!fga", name = "L", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "Z")
    private boolean field3706;

    @OriginalMember(owner = "client!fga", name = "w", descriptor = "Z")
    private boolean field3711;

    @OriginalMember(owner = "client!fga", name = "E", descriptor = "[Lf;")
    public static class702[] field3719;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZLwq;)V")
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        ++field3712;
        if (arg1) {
            method1697(14);
        }
        super.field7937.method2271(arg2, 5180);
        super.field7937.method2280(2, arg0);
    }

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "(I)V")
    public final void method783(int arg0) {
        ++field3717;
        super.field7937.method2244(1, -102);
        super.field7937.method2271((class152) null, arg0 ^ 5315);
        super.field7937.method2275(class646.field9074, arg0 ^ -223, class646.field9074);
        super.field7937.method2287((byte) -104, 0, class622.field8779);
        super.field7937.method2287((byte) -84, 2, class471.field6974);
        super.field7937.method2304(class622.field8779, 0, -120);
        if (arg0 != 255) {
            this.field3714 = null;
        }
        super.field7937.method2244(0, -70);
        if (this.field3706) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3706 = false;
        }
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
    public final void method791(int arg0) {
        ++field3726;
        int var2 = super.field7937.method2272(arg0 ^ -3);
        class498 var3 = super.field7937.method2298(-112);
        if (this.field3711) {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field3722.field4144 : this.field3718.field4144);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field3715.field4144 : this.field3714.field4144);
        }
        OpenGL.glEnable(34336);
        this.field3706 = true;
        var3.method3025(0.0F, 0.0F, (float) var2, this.field3703, (byte) -48, (float) arg0);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3703[0], this.field3703[1], this.field3703[2], this.field3703[3]);
        this.method795(15759);
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
    public final void method795(int arg0) {
        if (arg0 == 15759) {
            ++field3705;
            if (this.field3706) {
                int var2 = super.field7937.method315();
                int var3 = super.field7937.method322();
                float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
                float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7937.method2281(false), (float) super.field7937.method2246(0) / 255.0F);
                super.field7937.method2244(1, arg0 + -15843);
                super.field7937.method2290(10359, super.field7937.method2268(-257));
                super.field7937.method2244(0, -124);
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "(I)V")
    public static void method1695(int arg0) {
        field3704 = null;
        if (arg0 != -1) {
            method1696(true, -88, 63, -28, -97);
        }
        field3725 = null;
        field3710 = null;
        field3719 = null;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZIIII)V")
    public static final void method1696(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3721;
        if (arg0 || ~class456.field6843 != ~arg4 || ~class48.field641 != ~arg2 || class70.field887 != class423.field6439 && !class17.field282.method2089(class497.field7259, arg1 + -9086)) {
            class70.field887 = class423.field6439;
            class48.field641 = arg2;
            class456.field6843 = arg4;
            if (class17.field282.method2089(class497.field7259, -1)) {
                class70.field887 = 0;
            }
            class68.method715(arg3, (byte) -102);
            class420.method2683(class573.field8183, arg1 ^ -22550, class122.field1984.method1091(class135.field2206, 1), class627.field8857, class125.field2057, true);
            if (arg1 != 9085) {
                method1696(true, 42, 87, -62, 8);
            }
            int var5 = class612.field8702;
            int var6 = class626.field8855;
            class612.field8702 = (-(class275.field4426 >> 4) + class456.field6843) * 8;
            class626.field8855 = (-(class417.field6374 >> 4) + class48.field641) * 8;
            class501.field7344 = class378.method2479(class456.field6843 * 8, class48.field641 * 8);
            class26.field417 = null;
            int var7 = -var5 + class612.field8702;
            int var8 = -var6 + class626.field8855;
            if (~arg3 != -12) {
                boolean var9 = false;
                class283.field4523 = 0;
                int var10 = (class275.field4426 + -1) * 512;
                int var11 = (class417.field6374 - 1) * 512;
                for (int var12 = 0; var12 < class289.field4581; ++var12) {
                    class348 var13 = class613.field8707[var12];
                    if (var13 != null) {
                        class589 var14 = var13.field5577;
                        var14.field9705 -= var8 * 512;
                        var14.field9696 -= var7 * 512;
                        if (~var14.field9696 <= -1 && var10 >= var14.field9696 && ~var14.field9705 <= -1 && var11 >= var14.field9705) {
                            boolean var15 = true;
                            for (int var16 = 0; var16 < 10; ++var16) {
                                var14.field4264[var16] -= var7;
                                var14.field4265[var16] -= var8;
                                if (~var14.field4264[var16] > -1 || ~var14.field4264[var16] <= ~class275.field4426 || var14.field4265[var16] < 0 || ~class417.field6374 >= ~var14.field4265[var16]) {
                                    var15 = false;
                                }
                            }
                            if (var15) {
                                class102.field1690[class283.field4523++] = var14.field4197;
                            } else {
                                var14.method3442((byte) -25, (class705) null);
                                var13.method707((byte) -91);
                                var9 = true;
                            }
                        } else {
                            var14.method3442((byte) -84, (class705) null);
                            var9 = true;
                            var13.method707((byte) -15);
                        }
                    }
                }
                if (var9) {
                    class289.field4581 = class592.field8395.method1555(0);
                    class592.field8395.method1563(class613.field8707, 1);
                }
            } else {
                for (int var17 = 0; ~class289.field4581 < ~var17; ++var17) {
                    class348 var30 = class613.field8707[var17];
                    if (var30 != null) {
                        class589 var31 = var30.field5577;
                        for (int var32 = 0; var32 < 10; ++var32) {
                            var31.field4264[var32] -= var7;
                            var31.field4265[var32] -= var8;
                        }
                        var31.field9705 -= var8 * 512;
                        var31.field9696 -= var7 * 512;
                    }
                }
            }
            for (int var18 = 0; var18 < 2048; ++var18) {
                class304 var28 = class597.field8465[var18];
                if (var28 != null) {
                    for (int var29 = 0; ~var29 > -11; ++var29) {
                        var28.field4264[var29] -= var7;
                        var28.field4265[var29] -= var8;
                    }
                    var28.field9705 -= var8 * 512;
                    var28.field9696 -= var7 * 512;
                }
            }
            class515[] var19 = class472.field6987;
            for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                class515 var27 = var19[var20];
                if (var27 != null) {
                    var27.field7488 -= var8 * 512;
                    var27.field7492 -= var7 * 512;
                }
            }
            for (class640 var21 = (class640) class580.field8270.method3465((byte) 109); var21 != null; var21 = (class640) class580.field8270.method3469(arg1 ^ 9085)) {
                var21.field8975 -= var7;
                var21.field8980 -= var8;
                if (~class265.field4319 != -5 && (~var21.field8975 > -1 || ~var21.field8980 > -1 || class275.field4426 <= var21.field8975 || ~class417.field6374 >= ~var21.field8980)) {
                    var21.method707((byte) -46);
                }
            }
            if (~class265.field4319 != -5) {
                for (class138 var22 = (class138) class290.field4590.method1556(101); var22 != null; var22 = (class138) class290.field4590.method1559(104)) {
                    int var23 = (int) (var22.field844 & 16383L);
                    int var24 = -class612.field8702 + var23;
                    int var25 = (int) (16383L & var22.field844 >> 14);
                    int var26 = var25 - class626.field8855;
                    if (~var24 > -1 || var26 < 0 || ~class275.field4426 >= ~var24 || class417.field6374 <= var26) {
                        var22.method707((byte) -122);
                    }
                }
            }
            if (class43.field599 != 0) {
                class43.field599 -= var7;
                class473.field7005 -= var8;
            }
            class118.method1063((byte) 10);
            if (arg3 == 11) {
                if (class126.field2062 != 4) {
                    class126.field2062 = 1;
                    class81.field1005 = -1;
                    class664.field9243 = -1;
                } else {
                    class686.field9621 -= var7 * 512;
                    class473.field7001 -= var8 * 512;
                    class204.field3333 -= var8 * 512;
                    class664.field9238 -= var7 * 512;
                }
            } else {
                class31.field455 -= var8;
                class412.field6318 -= var8 * 512;
                class640.field8986 -= var8;
                class675.field9521 -= var7 * 512;
                class177.field2910 -= var7;
                class101.field1681 -= var7;
                if (Math.abs(var7) > class275.field4426 || ~Math.abs(var8) < ~class417.field6374) {
                    class338.method2317(-112);
                }
            }
            class611.method3561((byte) 0);
            class145.method1234(-24329);
            class597.field8462.method3474(22090);
            class463.field6919.method3474(arg1 + 13005);
            class677.field9525.method2749(-19473);
            class628.method3662(0);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)V")
    public final void method793(int arg0, boolean arg1) {
        ++field3724;
        if (arg0 > -39) {
            method1697(47);
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lbea;Lri;)V")
    public class234(class205 arg0, class97 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field3445) {
            this.field3715 = class44.method533(arg0, arg1.method923("gl", -25124, "uw_ground_unlit"), 23148, 34336);
            this.field3722 = class44.method533(arg0, arg1.method923("gl", -25124, "uw_ground_lit"), 23148, 34336);
            this.field3714 = class44.method533(arg0, arg1.method923("gl", -25124, "uw_model_unlit"), 23148, 34336);
            this.field3718 = class44.method533(arg0, arg1.method923("gl", -25124, "uw_model_lit"), 23148, 34336);
            if (this.field3715 != null & this.field3722 != null & this.field3714 != null & this.field3718 != null) {
                this.field3723 = super.field7937.method2243(new int[] { 0, -1 }, 2, false, 1, (byte) -20);
                this.field3723.method364(false, false, (byte) -88);
                this.field3720 = true;
            } else {
                this.field3720 = false;
            }
        } else {
            this.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)Z")
    public final boolean method787(byte arg0) {
        ++field3707;
        if (arg0 != -109) {
            this.method795(64);
        }
        return this.field3720;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZI)V")
    public final void method788(boolean arg0, int arg1) {
        this.field3711 = arg0;
        ++field3702;
        super.field7937.method2244(1, arg1 ^ -73);
        super.field7937.method2271(this.field3723, arg1 ^ 5180);
        super.field7937.method2275(class406.field6268, 120, class51.field681);
        super.field7937.method2287((byte) -76, 0, class471.field6974);
        super.field7937.method185(class622.field8779, 2, false, true, (byte) 106);
        super.field7937.method2304(class692.field9702, arg1, arg1 + -117);
        super.field7937.method2244(0, arg1 + -86);
        this.method791(-1);
    }

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "(I)V")
    public static final void method1697(int arg0) {
        if (arg0 != -21944) {
            field3710 = null;
        }
        ++class641.field8992;
        ++field3708;
        class165 var1 = class271.method1917(class420.field6424, (byte) -79, class85.field1048);
        var1.field2776.method25(true, class413.field6347);
        class642.method3726(-684096285, var1);
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(III)V")
    public final void method785(int arg0, int arg1, int arg2) {
        if (arg0 == 8) {
            ++field3716;
        }
    }
}
