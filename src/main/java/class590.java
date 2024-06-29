import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class590 {

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field8219 = 0;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "S")
    public static short field8217 = 256;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "[[B")
    public static byte[][] field8213;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method3275(int arg0, byte arg1, int arg2) {
        field8218++;
        if (arg1 != -104) {
            method3281(71, -68, 111);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZI)Z", line = 14)
    public static final boolean method3276(boolean arg0, int arg1) {
        field8216++;
        boolean var2 = class630.field8790.method308();
        if (arg1 != 1) {
            field8213 = null;
        }
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class630.field8790.method327();
        } else if (!class630.field8790.method297()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class274.field3872.field882 = arg0;
            class274.field3872.method2439(-2, class503.field6878);
            return true;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 55)
    public static final void method3277(int arg0) {
        field8221++;
        class239.field3442.method1997(1);
        int var1 = -24 / ((32 - arg0) / 35);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IB)I", line = 65)
    public static final int method3278(int arg0, byte arg1) {
        field8223++;
        if (arg1 != -97) {
            method3279(-101, 13, null);
        }
        return arg0 == 16711935 ? -1 : class549.method3016((byte) 34, arg0);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILfaa;)Ljava/lang/String;", line = 89)
    public static final String method3279(int arg0, int arg1, class140 arg2) {
        if (arg1 != 2048) {
            field8213 = null;
        }
        field8222++;
        if (!client.method1655(arg2).method2847((byte) -37, arg0) && arg2.field1957 == null) {
            return null;
        } else if (arg2.field2031 == null || arg0 >= arg2.field2031.length || arg2.field2031[arg0] == null || arg2.field2031[arg0].trim().length() == 0) {
            return class203.field2973 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field2031[arg0];
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZIII)Lsba;", line = 114)
    public static final class198 method3280(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field8220++;
        class198 var5 = new class198();
        var5.field2924 = arg2;
        var5.field2922 = arg3;
        class368.field5262.method2063((long) arg0, 1, var5);
        class671.method3711(arg3, (byte) -100);
        if (arg4 <= 92) {
            return null;
        }
        class140 var6 = class266.method1626(arg0, 116);
        if (var6 != null) {
            class432.method2481(var6, 117);
        }
        if (class88.field1195 != null) {
            class432.method2481(class88.field1195, 79);
            class88.field1195 = null;
        }
        class488.method2745(14811);
        if (var6 != null) {
            class316.method1936(var6, !arg1, (byte) -72);
        }
        if (!arg1) {
            class523.method2894(arg3);
        }
        if (!arg1 && class677.field9551 != -1) {
            class589.method3274(class677.field9551, 1, (byte) 112);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V", line = 155)
    public static final void method3281(int arg0, int arg1, int arg2) {
        field8215++;
        class679 var3 = class669.method3708(arg2, 0, 1403048928);
        var3.method3748(true);
        var3.field9573 = arg0;
        var3.field9574 = arg1;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 169)
    public static void method3282(int arg0) {
        field8213 = null;
        int var1 = -36 % ((26 - arg0) / 49);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BIIII)V", line = 189)
    public static final void method3283(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field8214++;
        for (class572 var5 = (class572) class240.field3451.method1270((byte) -25); var5 != null; var5 = (class572) class240.field3451.method1282(0)) {
            class256.method1571(true, arg3, arg4, var5, arg1, arg2);
        }
        for (class572 var6 = (class572) class572.field7692.method1270((byte) -25); var6 != null; var6 = (class572) class572.field7692.method1282(0)) {
            byte var11 = 1;
            class308 var12 = var6.field7690.method2636((byte) 83);
            if (var6.field7690.field6428) {
                var11 = 0;
            } else if (var6.field7690.field6464 == var12.field4602 || var6.field7690.field6464 == var12.field4586 || var6.field7690.field6464 == var12.field4575 || var6.field7690.field6464 == var12.field4565) {
                var11 = 2;
            } else if (var6.field7690.field6464 == var12.field4583 || var6.field7690.field6464 == var12.field4564 || var6.field7690.field6464 == var12.field4594 || var6.field7690.field6464 == var12.field4578) {
                var11 = 3;
            }
            if (var6.field7699 != var11) {
                int var13 = class449.method2578(false, var6.field7690);
                class161 var14 = var6.field7690.field3245;
                if (var14.field2409 != null) {
                    var14 = var14.method1114(class195.field2888, 0);
                }
                if (var14 == null || var13 == -1) {
                    var6.field7688 = -1;
                    var6.field7707 = false;
                } else if (var6.field7688 != var13 || var14.field2454 != var6.field7707) {
                    if (var6.field7702 != null) {
                        class135.field1907.method3309(var6.field7702);
                        var6.field7702 = null;
                    }
                    var6.field7703 = null;
                    var6.field7687 = null;
                    var6.field7688 = var13;
                    var6.field7707 = var14.field2454;
                }
                var6.field7699 = var11;
            }
            var6.field7691 = var6.field7690.field509;
            var6.field7693 = var6.field7690.field509 + (var6.field7690.method1722((byte) -127) << 8);
            var6.field7701 = var6.field7690.field514;
            var6.field7685 = var6.field7690.field514 + (var6.field7690.method1722((byte) -126) << 8);
            class256.method1571(true, arg3, arg4, var6, arg1, arg2);
        }
        if (arg0 != -94) {
            method3280(120, false, 41, -119, 118);
        }
        for (class572 var7 = (class572) class231.field3288.method2066(false); var7 != null; var7 = (class572) class231.field3288.method2062(-19704)) {
            byte var8 = 1;
            class308 var9 = var7.field7706.method2636((byte) 125);
            if (var7.field7706.field6428) {
                var8 = 0;
            } else if (var7.field7706.field6464 == var9.field4602 || var7.field7706.field6464 == var9.field4586 || var7.field7706.field6464 == var9.field4575 || var7.field7706.field6464 == var9.field4565) {
                var8 = 2;
            } else if (var7.field7706.field6464 == var9.field4583 || var7.field7706.field6464 == var9.field4564 || var7.field7706.field6464 == var9.field4594 || var7.field7706.field6464 == var9.field4578) {
                var8 = 3;
            }
            if (var7.field7699 != var8) {
                int var10 = class442.method2537(0, var7.field7706);
                if (var7.field7688 != var10 || var7.field7706.field3950 != var7.field7707) {
                    if (var7.field7702 != null) {
                        class135.field1907.method3309(var7.field7702);
                        var7.field7702 = null;
                    }
                    var7.field7707 = var7.field7706.field3950;
                    var7.field7687 = null;
                    var7.field7703 = null;
                    var7.field7688 = var10;
                }
                var7.field7699 = var8;
            }
            var7.field7691 = var7.field7706.field509;
            var7.field7693 = var7.field7706.field509 + (var7.field7706.method1722((byte) -122) << 8);
            var7.field7701 = var7.field7706.field514;
            var7.field7685 = var7.field7706.field514 + (var7.field7706.method1722((byte) -122) << 8);
            class256.method1571(true, arg3, arg4, var7, arg1, arg2);
        }
    }
}
