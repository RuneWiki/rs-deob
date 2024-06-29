import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 extends class314 implements class41 {

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "Lqp;")
    public class469 field316;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "Z")
    private boolean field317;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field328;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ir", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field329;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)I")
    public final int method178(boolean arg0) {
        ++field312;
        if (!arg0) {
            this.method191(-65);
        }
        return this.field316.field6782;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILya;)Lt;")
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        if (arg1 <= 72) {
            this.field317 = false;
        }
        ++field319;
        return this.field316.method2828(arg0, arg2, false, -122, false, 0, 0);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
    public final void method180(byte arg0) {
        if (arg0 == -2) {
            ++field324;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZLya;)Llo;")
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field313;
        class474 var3 = this.field316.method2828(2048, arg1, arg0, -87, false, super.field4014, super.field4007);
        if (var3 == null) {
            return null;
        } else {
            class123 var4 = arg1.method369();
            var4.method229(super.field4007, super.field4009, super.field4014);
            class531 var5 = null;
            if (this.field317) {
                var5 = class119.method850(1, 52);
            }
            if (this.field316.field6801 != null) {
                class517 var6 = this.field316.field6801.method594();
                arg1.method366(var3, var6, var4, var5 == null ? null : var5.field7810[0], 0);
            } else {
                var3.method415(var4, var5 != null ? var5.field7810[0] : null, 0);
            }
            int var7 = super.field4007 >> 7;
            int var8 = super.field4014 >> 7;
            this.field316.method2833(var8, var7, var3, var7, 4, var8, true, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)Z")
    public final boolean method182(int arg0) {
        if (arg0 != -2286) {
            this.field317 = true;
        }
        ++field321;
        return this.field316.method2830((byte) 46);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lih;B)V")
    public static final void method183(class495 arg0, byte arg1) {
        ++field314;
        if (class125.field1664 != null) {
            if (arg1 > 54) {
                class41 var2 = null;
                if (~arg0.field7182 == -1) {
                    var2 = (class41) class20.method173(arg0.field7192, arg0.field7193, arg0.field7186);
                }
                if (arg0.field7182 == 1) {
                    var2 = (class41) class140.method952(arg0.field7192, arg0.field7193, arg0.field7186);
                }
                if (arg0.field7182 == 2) {
                    var2 = (class41) class212.method1314(arg0.field7192, arg0.field7193, arg0.field7186, field329 != null ? field329 : (field329 = method195("fw")));
                }
                if (~arg0.field7182 == -4) {
                    var2 = (class41) class238.method1430(arg0.field7192, arg0.field7193, arg0.field7186);
                }
                if (var2 != null) {
                    arg0.field7188 = var2.method187(21067);
                    arg0.field7197 = var2.method189(32725);
                    arg0.field7184 = var2.method178(true);
                } else {
                    arg0.field7184 = 0;
                    arg0.field7188 = -1;
                    arg0.field7197 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILya;)V")
    public final void method184(int arg0, class38 arg1) {
        if (arg0 != -5534) {
            this.field317 = false;
        }
        ++field323;
        this.field316.method2836(arg1, (byte) 112);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(ILya;)V")
    public final void method185(int arg0, class38 arg1) {
        if (arg0 != 15397) {
            this.method187(113);
        }
        this.field316.method2831(arg1, -3);
        ++field328;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field327;
        class474 var5 = this.field316.method2828(131072, arg1, false, -41, false, super.field4014, super.field4007);
        if (arg0 <= 66) {
            return true;
        } else if (var5 == null) {
            return false;
        } else {
            class123 var6 = arg1.method369();
            var6.method229(super.field4007, super.field4009, super.field4014);
            return var5.method412(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I")
    public final int method187(int arg0) {
        if (arg0 != 21067) {
            return 24;
        } else {
            ++field322;
            return this.field316.field6799;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lya;Lho;IIIIIZIII)V")
    public class22(class38 arg0, class102 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class208.method1289(6267, arg9, arg8));
        this.field316 = new class469(arg0, arg1, arg8, arg9, arg2, arg3, super.field4007, super.field4014, arg7, arg10);
        this.field317 = ~arg1.field1305 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI)Z")
    public static final boolean method188(int arg0, byte arg1, int arg2) {
        ++field318;
        int var3 = 120 / ((arg1 - -40) / 60);
        return (arg2 & 540800) != 0;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)I")
    public final int method189(int arg0) {
        if (arg0 != 32725) {
            this.field317 = false;
        }
        ++field320;
        return this.field316.field6796;
    }

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V")
    public static final void method190(int arg0) {
        class343.field4392.method836(true);
        ++field310;
        class204.field2664.method1343((byte) 85);
        if (class339.field4259 != null) {
            class339.field4259.method30(class8.field71, 15);
        }
        class349.field4492.method2563((byte) 115);
        class8.field71.setBackground(Color.black);
        if (arg0 != 0) {
            method190(100);
        }
        class405.field5799 = -1;
        class343.field4392 = class198.method1249(4096, class8.field71);
        class204.field2664 = class248.method1505(class8.field71, (byte) -42, true);
        if (class339.field4259 != null) {
            class339.field4259.method29(class8.field71, 3587);
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field325;
        if (arg0 != 27223) {
            this.field316 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lya;I)V")
    public final void method192(class38 arg0, int arg1) {
        ++field311;
        class474 var3 = this.field316.method2828(262144, arg0, true, -123, true, super.field4014, super.field4007);
        if (var3 != null) {
            int var4 = super.field4007 >> 7;
            int var5 = super.field4014 >> 7;
            this.field316.method2833(var5, var4, var3, var4, arg1 + 3, var5, false, arg0);
        }
        if (arg1 != 1) {
            this.method180((byte) 76);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lgg;IZIIILya;)V")
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = -126 / ((27 - arg5) / 40);
        ++field326;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)Z")
    public final boolean method194(byte arg0) {
        ++field315;
        if (arg0 >= -72) {
            this.field317 = false;
        }
        return false;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method195(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
