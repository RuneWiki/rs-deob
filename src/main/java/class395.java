import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class395 extends class667 {

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    private int field5532 = 0;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    private int field5527 = 1;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    private int field5525 = 0;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field5535 = 0;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field5534 = 0;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "Lqca;")
    public static class115 field5531 = new class115(9, 0, 4, 1);

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "Lwq;")
    public static class166 field5536;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 6)
    public static final boolean method2450(String arg0, int arg1) {
        if (arg1 != 10) {
            method2454(88);
        }
        ++field5529;
        return class245.method1630(true, arg0, 10, true);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)[I", line = 17)
    public final int[] method117(byte arg0, int arg1) {
        ++field5530;
        if (arg0 > -87) {
            method2453((class113) null, false);
        }
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int var4 = class385.field5384[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class77.field1455; ++var6) {
                int var7 = class20.field261[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field5525 == -1) {
                    var9 = (-var4 + var7) * this.field5527;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field5527 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field5532 != 0) {
                    if (~this.field5532 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class491.field7002[(4088 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)Ljava/lang/String;", line = 87)
    public static final String method2451(byte arg0) {
        ++field5528;
        String var1 = "www";
        if (class322.field4582 == class118.field1857) {
            var1 = "www-wtrc";
        } else if (class23.field296 == class118.field1857) {
            var1 = "www-wtqa";
        } else if (class315.field4464 == class118.field1857) {
            var1 = "www-wtwip";
        }
        int var2 = -116 / ((-21 - arg0) / 33);
        String var3 = "";
        if (class611.field8844 != null) {
            var3 = "/p=" + class611.field8844;
        }
        return "http://" + var1 + "." + class649.field9170.field2573 + ".com/l=" + class744.field10426 + "/a=" + class66.field1197 + var3 + "/";
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 139)
    public class395() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V", line = 128)
    public final void method121(boolean arg0) {
        class458.method2798(true);
        if (arg0) {
            this.field5527 = 83;
        }
        ++field5524;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lud;II)V", line = 144)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            method2454(105);
        }
        ++field5526;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field5527 = arg0.method273(255);
                }
            } else {
                this.field5532 = arg0.method273(255);
            }
        } else {
            this.field5525 = arg0.method273(255);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(JJ)J", line = 187)
    public static long method2452(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lbba;Z)V", line = 196)
    public static final void method2453(class113 arg0, boolean arg1) {
        for (int var2 = arg0.field1814; var2 <= arg0.field1818; ++var2) {
            for (int var3 = arg0.field1820; var3 <= arg0.field1810; ++var3) {
                class416 var4 = class390.field5454[arg0.field649][var2][var3];
                if (var4 != null) {
                    class217 var5 = var4.field5844;
                    class217 var6 = null;
                    while (var5 != null) {
                        if (var5.field3090 == arg0) {
                            if (var6 != null) {
                                var6.field3091 = var5.field3091;
                            } else {
                                var4.field5844 = var5.field3091;
                            }
                            var5.method1511((byte) -60);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field3091;
                    }
                }
            }
        }
        if (!arg1) {
            class260.method1768(arg0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 242)
    public static void method2454(int arg0) {
        field5531 = null;
        field5536 = null;
        if (arg0 > -97) {
            field5536 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIIIZILeq;)V", line = 256)
    public static final void method2455(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class209 arg6) {
        class241.field3390 = arg1;
        class577.field8167 = arg6;
        class432.field6038 = null;
        class382.field5353 = arg2;
        class107.field1766 = arg5;
        class463.field6664 = arg3;
        class731.field10231 = 1;
        ++field5533;
        if (arg0 <= -82) {
            class407.field5673 = arg4;
        }
    }
}
