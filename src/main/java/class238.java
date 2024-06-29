import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class238 extends class512 {

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    private int field4100 = 2048;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    private int field4107 = 4096;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    private int field4108 = 2048;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    private int field4111 = 0;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    private int field4112 = 8192;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    private int field4113 = 12288;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    private int field4106 = 0;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field4104 = 0;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "Llo;")
    public static class306 field4115 = new class306("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 4)
    public class238() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[I", line = 16)
    public final int[] method75(int arg0, byte arg1) {
        ++field4102;
        int[] var3 = super.field7494.method232(arg0, true);
        int var4 = 61 / ((arg1 - 43) / 48);
        if (super.field7494.field474) {
            int var5 = class412.field6233[arg0] + -2048;
            for (int var6 = 0; ~class402.field6113 < ~var6; ++var6) {
                int var7 = class276.field4540[var6] + -2048;
                int var8 = this.field4100 + var7;
                int var9 = var8 < -2048 ? var8 - -4096 : var8;
                int var10 = var9 <= 2048 ? var9 : var9 - 4096;
                int var11 = this.field4106 + var5;
                int var12 = ~var11 > 2047 ? var11 + 4096 : var11;
                int var13 = var12 <= 2048 ? var12 : var12 - 4096;
                int var14 = this.field4111 + var7;
                int var15 = ~var14 <= 2047 ? var14 : var14 + 4096;
                int var16 = ~var15 >= -2049 ? var15 : var15 - 4096;
                int var17 = var5 - -this.field4108;
                int var18 = var17 >= -2048 ? var17 : var17 - -4096;
                int var19 = var18 > 2048 ? var18 - 4096 : var18;
                var3[var6] = !this.method1635(var10, -1261499028, var13) && !this.method1633(var16, (byte) -9, var19) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V", line = 67)
    public static void method1631(int arg0) {
        if (arg0 != 13445) {
            field4104 = 89;
        }
        field4115 = null;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V", line = 82)
    public final void method74(int arg0) {
        ++field4101;
        if (arg0 != 12388) {
            this.method71(false, 40, (class23) null);
        }
        class187.method1265(arg0 + -12132);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIII)I", line = 97)
    public static final int method1632(int arg0, int arg1, int arg2, int arg3) {
        ++field4103;
        int var4 = arg3 / arg2;
        int var5 = arg2 + -1 & arg3;
        int var6 = arg1 / arg2;
        int var7 = arg1 & arg2 + -1;
        int var8 = class393.method2456(var6, true, var4);
        int var9 = class393.method2456(var6, true, var4 + 1);
        int var10 = class393.method2456(var6 - arg0, true, var4);
        int var11 = class393.method2456(var6 + 1, true, var4 + 1);
        int var12 = class357.method2288(arg2, (byte) 122, var5, var9, var8);
        int var13 = class357.method2288(arg2, (byte) -21, var5, var11, var10);
        return class357.method2288(arg2, (byte) -74, var7, var13, var12);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)Z", line = 130)
    private final boolean method1633(int arg0, byte arg1, int arg2) {
        ++field4110;
        int var4 = (arg0 + arg2) * this.field4113 >> 12;
        int var5 = class162.field2583[(1047946 & var4 * 255) >> 12];
        if (arg1 != -9) {
            this.method75(69, (byte) -27);
        }
        int var6 = (var5 << 12) / this.field4113;
        int var7 = (var6 << 12) / this.field4112;
        int var8 = this.field4107 * var7 >> 12;
        return ~var8 < ~(arg2 - arg0) && -var8 < -arg0 + arg2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLpl;)I", line = 149)
    public static final int method1634(byte arg0, class162 arg1) {
        ++field4109;
        String var2 = class209.method1367(arg1, (byte) 62);
        int[] var3 = null;
        if (class420.method2579(arg1.field2576, (byte) -47)) {
            var3 = class20.field218.method2221((int) arg1.field2578, -1).field1732;
        } else if (~arg1.field2585 == 0) {
            if (!class63.method416(arg1.field2576, true)) {
                if (class479.method2823(arg1.field2576, -30256)) {
                    Object var4 = null;
                    class39 var5;
                    if (~arg1.field2576 == -1012) {
                        var5 = class61.field928.method791((int) arg1.field2578, true);
                    } else {
                        var5 = class61.field928.method791((int) (arg1.field2578 >>> 32 & 2147483647L), true);
                    }
                    if (var5.field575 != null) {
                        var5 = var5.method296(-1008, class327.field5160);
                    }
                    if (var5 != null) {
                        var3 = var5.field632;
                    }
                }
            } else {
                class505 var6 = (class505) class147.field2396.method2516((long) ((int) arg1.field2578), -1);
                if (var6 != null) {
                    class265 var7 = var6.field7355;
                    class510 var8 = var7.field4430;
                    if (var8.field7448 != null) {
                        var8 = var8.method3000(1, class327.field5160);
                    }
                    if (var8 != null) {
                        var3 = var8.field7476;
                    }
                }
            }
        } else {
            var3 = class20.field218.method2221(arg1.field2585, -1).field1732;
        }
        if (var3 != null) {
            var2 = var2 + class367.method2331(-99, var3);
        }
        int var9 = -41 / ((arg0 - -34) / 46);
        int var10 = class84.field1467.method2078(-3789, var2, class315.field4961);
        if (arg1.field2577) {
            var10 += 4 + class387.field5966.method204();
        }
        return var10;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZILia;)V", line = 223)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field4105;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field4112 = arg2.method132(29);
                                }
                            } else {
                                this.field4107 = arg2.method132(42);
                            }
                        } else {
                            this.field4113 = arg2.method132(65);
                        }
                    } else {
                        this.field4108 = arg2.method132(45);
                    }
                } else {
                    this.field4111 = arg2.method132(47);
                }
            } else {
                this.field4106 = arg2.method132(107);
            }
        } else {
            this.field4100 = arg2.method132(29);
        }
        if (!arg0) {
            this.method74(100);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)Z", line = 298)
    private final boolean method1635(int arg0, int arg1, int arg2) {
        ++field4114;
        int var4 = (-arg0 + arg2) * this.field4113 >> 12;
        int var5 = class162.field2583[(1045025 & var4 * 255) >> 12];
        if (arg1 != -1261499028) {
            return false;
        } else {
            int var6 = (var5 << 12) / this.field4113;
            int var7 = (var6 << 12) / this.field4112;
            int var8 = this.field4107 * var7 >> 12;
            return ~var8 < ~(arg0 - -arg2) && ~(arg0 + arg2) < ~(-var8);
        }
    }
}
