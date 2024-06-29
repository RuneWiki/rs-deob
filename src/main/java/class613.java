import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class613 extends class505 {

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public int field8779 = -1;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "[I")
    public static int[] field8782 = new int[1];

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public int field8776;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "Ljava/lang/String;")
    public String field8777;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "Ljava/lang/String;")
    public String field8780;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIZII)V")
    public static final void method3465(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field8778;
        if (arg2 || class443.field6420 != arg4 || ~class316.field4372 != ~arg3 || ~class416.field5926 != ~class132.field2149 && !class525.field7713.method3471(class76.field1182, arg0)) {
            class443.field6420 = arg4;
            class316.field4372 = arg3;
            class132.field2149 = class416.field5926;
            if (class525.field7713.method3471(class76.field1182, arg0)) {
                class132.field2149 = 0;
            }
            class595.method3408((byte) 91, arg1);
            class194.method1361(class637.field9048, (byte) -12, true, class399.field5763, class335.field4670, class343.field4761.method2059(class238.field3511, true));
            int var5 = class143.field2474;
            class143.field2474 = (-(class430.field6136 >> 4) + class443.field6420) * 8;
            int var6 = class63.field917;
            class63.field917 = (-(class580.field8504 >> 4) + class316.field4372) * 8;
            class491.field7055 = class161.method1221(class443.field6420 * 8, class316.field4372 * 8);
            class189.field2961 = null;
            int var7 = -var5 + class143.field2474;
            int var8 = -var6 + class63.field917;
            if (~arg1 != -12) {
                class310.field4304 = 0;
                boolean var9 = false;
                int var10 = (class430.field6136 + -1) * 512;
                int var11 = (class580.field8504 + -1) * 512;
                for (int var12 = 0; ~var12 > ~class392.field5702; ++var12) {
                    class6 var13 = class82.field1259[var12];
                    if (var13 != null) {
                        class88 var14 = var13.field49;
                        var14.field3154 -= var8 * 512;
                        var14.field3155 -= var7 * 512;
                        if (var14.field3155 >= 0 && ~var14.field3155 >= ~var10 && var14.field3154 >= 0 && var14.field3154 <= var11) {
                            boolean var15 = true;
                            for (int var16 = 0; ~var16 > -11; ++var16) {
                                var14.field2454[var16] -= var7;
                                var14.field2459[var16] -= var8;
                                if (var14.field2454[var16] < 0 || ~var14.field2454[var16] <= ~class430.field6136 || ~var14.field2459[var16] > -1 || ~var14.field2459[var16] <= ~class580.field8504) {
                                    var15 = false;
                                }
                            }
                            if (!var15) {
                                var14.method661(!arg0, (class528) null);
                                var13.method2549((byte) -116);
                                var9 = true;
                            } else {
                                class253.field3667[class310.field4304++] = var14.field2427;
                            }
                        } else {
                            var14.method661(true, (class528) null);
                            var9 = true;
                            var13.method2549((byte) 28);
                        }
                    }
                }
                if (var9) {
                    class392.field5702 = class314.field4359.method2813((byte) -91);
                    class314.field4359.method2817((byte) 118, class82.field1259);
                }
            } else {
                for (int var17 = 0; ~class392.field5702 < ~var17; ++var17) {
                    class6 var30 = class82.field1259[var17];
                    if (var30 != null) {
                        class88 var31 = var30.field49;
                        for (int var32 = 0; var32 < 10; ++var32) {
                            var31.field2454[var32] -= var7;
                            var31.field2459[var32] -= var8;
                        }
                        var31.field3154 -= var8 * 512;
                        var31.field3155 -= var7 * 512;
                    }
                }
            }
            for (int var18 = 0; var18 < 2048; ++var18) {
                class270 var28 = class76.field1186[var18];
                if (var28 != null) {
                    for (int var29 = 0; ~var29 > -11; ++var29) {
                        var28.field2454[var29] -= var7;
                        var28.field2459[var29] -= var8;
                    }
                    var28.field3155 -= var7 * 512;
                    var28.field3154 -= var8 * 512;
                }
            }
            class258[] var19 = class481.field6873;
            for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                class258 var27 = var19[var20];
                if (var27 != null) {
                    var27.field3704 -= var8 * 512;
                    var27.field3698 -= var7 * 512;
                }
            }
            for (class131 var21 = (class131) class221.field3303.method3905(-123); var21 != null; var21 = (class131) class221.field3303.method3899(0)) {
                var21.field2128 -= var7;
                var21.field2140 -= var8;
                if (~class121.field1983 != -5 && (~var21.field2128 > -1 || var21.field2140 < 0 || ~var21.field2128 <= ~class430.field6136 || var21.field2140 >= class580.field8504)) {
                    var21.method2549((byte) -60);
                }
            }
            if (~class121.field1983 != -5) {
                for (class430 var22 = (class430) class480.field6870.method2815(0); var22 != null; var22 = (class430) class480.field6870.method2814(4)) {
                    int var23 = (int) (var22.field6265 & 16383L);
                    int var24 = -class143.field2474 + var23;
                    int var25 = (int) (16383L & var22.field6265 >> 14);
                    int var26 = var25 - class63.field917;
                    if (var24 < 0 || var26 < 0 || var24 >= class430.field6136 || class580.field8504 <= var26) {
                        var22.method2549((byte) -126);
                    }
                }
            }
            if (~class400.field5777 != -1) {
                class202.field3126 -= var8;
                class400.field5777 -= var7;
            }
            class216.method1462(8);
            if (~arg1 == -12) {
                if (class40.field544 != 4) {
                    class40.field544 = 1;
                    class76.field1181 = -1;
                    class294.field4104 = -1;
                } else {
                    class386.field5659 -= var7 * 512;
                    class392.field5704 -= var8 * 512;
                    class606.field8728 -= var7 * 512;
                    class108.field1761 -= var8 * 512;
                }
            } else {
                class88.field1318 -= var7;
                class522.field7694 -= var8;
                class168.field2750 -= var7;
                class551.field8078 -= var7 * 512;
                class322.field4478 -= var8 * 512;
                class498.field7412 -= var8;
                if (Math.abs(var7) > class430.field6136 || ~Math.abs(var8) < ~class580.field8504) {
                    class403.method2433(-57);
                }
            }
            class50.method404(12690);
            class541.method3183((byte) 49);
            class396.field5740.method3896(3);
            if (!arg0) {
                class557.field8142.method3896(3);
                class539.field7921.method3311(-78);
                class151.method1149(2409);
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
    public static void method3466(byte arg0) {
        if (arg0 != -64) {
            method3465(true, 27, true, -57, -16);
        }
        field8782 = null;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)Lmg;")
    public final class221 method3467(boolean arg0) {
        if (!arg0) {
            this.method3467(false);
        }
        ++field8781;
        return class390.field5685[super.field7511];
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(JJ)J")
    public static long method3468(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
