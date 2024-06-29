import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class39 extends class377 {

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "Lew;")
    public static class683 field669 = new class683();

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "[I")
    public static int[] field671 = new int[128];

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field673;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Ltd;")
    private class515 field668;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "[I")
    public static int[] field675;

    static {
        for (int var0 = 0; ~field671.length < ~var0; ++var0) {
            field671[var0] = -1;
        }
        for (int var1 = 65; ~var1 >= -91; ++var1) {
            field671[var1] = var1 + -65;
        }
        for (int var2 = 97; var2 <= 122; ++var2) {
            field671[var2] = var2 + -97 - -26;
        }
        for (int var3 = 48; ~var3 >= -58; ++var3) {
            field671[var3] = var3 + 52 + -48;
        }
        field671[42] = field671[43] = 62;
        field671[45] = field671[47] = 63;
        field673 = new Rectangle[100];
        for (int var4 = 0; var4 < 100; ++var4) {
            field673[var4] = new Rectangle();
        }
        field674 = -1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIII)V", line = 6)
    public final void method413(boolean arg0, int arg1, int arg2, int arg3) {
        ++field667;
        class211.field3164.method305(arg1 + arg3, arg2, super.field5449.field5617 - -4, super.field5449.field5613 + 2, ((class536) super.field5449).field7791, 0);
        class211.field3164.method305(arg1 + -1, arg2 + 1, super.field5449.field5617 + 2, super.field5449.field5613, 0, 0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 15)
    public final void method414(byte arg0) {
        if (arg0 < 126) {
            this.method413(false, -50, 112, -61);
        }
        super.method414((byte) 127);
        ++field670;
        this.field668 = class181.method1279(super.field5452, 0, ((class536) super.field5449).field7795);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V", line = 27)
    public static void method415(boolean arg0) {
        field669 = null;
        field671 = null;
        field675 = null;
        field673 = null;
        if (arg0) {
            field673 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIIIII)V", line = 40)
    public static final void method416(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field665;
        if (class214.field3211 != null && (arg2 != 3 || ~class142.field1927 != ~arg5 || ~class744.field10392 != ~arg4)) {
            class702.method3948(class345.field4749, 0, class214.field3211);
            class214.field3211 = null;
        }
        if (arg2 == 3 && class214.field3211 == null) {
            class214.field3211 = class381.method2359((byte) 118, 0, 0, arg4, class345.field4749, arg5);
            if (class214.field3211 != null) {
                class142.field1927 = arg5;
                class744.field10392 = arg4;
                class23.method102((byte) -74);
            }
        }
        if (arg2 == 3 && class214.field3211 == null) {
            method416(true, arg1, class243.field3580.field7993.method2653(false), -26, -1, -1);
        } else {
            Container var6;
            if (class214.field3211 == null) {
                if (class696.field9834 == null) {
                    if (class486.field6999 == null) {
                        var6 = class181.field2502;
                    } else {
                        var6 = class486.field6999;
                    }
                    class291.field4016 = var6.getSize().width;
                    class443.field6318 = var6.getSize().height;
                } else {
                    Insets var7 = class696.field9834.getInsets();
                    int var10001 = -var7.right;
                    class291.field4016 = class696.field9834.getSize().width + var10001 + -var7.left;
                    class443.field6318 = class696.field9834.getSize().height + -var7.bottom + -var7.top;
                    var6 = class696.field9834;
                }
            } else {
                var6 = class214.field3211;
                class443.field6318 = arg4;
                class291.field4016 = arg5;
            }
            if (arg2 == 1) {
                class26.field232 = 0;
                class658.field9423 = (-class758.field10546 + class291.field4016) / 2;
                class68.field1042 = class758.field10546;
                class565.field8187 = class544.field7915;
            } else {
                class132.method931(-124);
            }
            if (class536.field7793 != class25.field223) {
                boolean var10000;
                if (~class68.field1042 > -1025 && ~class565.field8187 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (!arg0) {
                class95.field1383.setSize(class68.field1042, class565.field8187);
                if (class416.field5919) {
                    class90.method703(class95.field1383, -6993);
                } else {
                    class211.field3164.method314(class95.field1383, class68.field1042, class565.field8187);
                }
                if (class696.field9834 != var6) {
                    class95.field1383.setLocation(class658.field9423, class26.field232);
                } else {
                    Insets var8 = class696.field9834.getInsets();
                    class95.field1383.setLocation(class658.field9423 + var8.left, class26.field232 + var8.top);
                }
            } else {
                class569.method3389(-54);
            }
            if (arg3 != -26) {
                method416(false, 4, -44, 67, -96, -96);
            }
            if (arg2 < 2) {
                class708.field9958 = false;
            } else {
                class708.field9958 = true;
            }
            if (~class346.field4771 != 0) {
                class196.method1380(-114, true);
            }
            if (class325.field4415 != null && class25.method106(class369.field5392, 89)) {
                class496.method3021(-102);
            }
            for (int var9 = 0; var9 < 100; ++var9) {
                class108.field1545[var9] = true;
            }
            class123.field1699 = true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIZ)V", line = 169)
    public final void method417(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field664;
        int var5 = this.method2339((byte) 6) * super.field5449.field5617 / 10000;
        int[] var6 = new int[4];
        class211.field3164.method358(var6);
        class211.field3164.method297(arg2, arg0 + 2, arg2 + var5, super.field5449.field5613 + arg0);
        this.field668.method3135(arg2, arg0 - -2, super.field5449.field5617, super.field5449.field5613);
        class211.field3164.method297(var6[0], var6[1], var6[2], var6[3]);
        if (arg1 >= -69) {
            method419(true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Z", line = 191)
    public final boolean method418(boolean arg0) {
        ++field666;
        return !super.method418(arg0) ? false : super.field5452.method2609(0, ((class536) super.field5449).field7795);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lla;Lla;Lbh;)V", line = 204)
    public class39(class423 arg0, class423 arg1, class536 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V", line = 212)
    public static final void method419(boolean arg0) {
        if (!arg0) {
            method416(false, 124, 51, 52, -12, 35);
        }
        for (int var1 = 0; ~var1 > ~class279.field3914; ++var1) {
            class105 var2 = class585.field8346[var1];
            if (var2.field1477 == 3) {
                if (var2.field1485 != null) {
                    class593.field8429.method3652(var2.field1485);
                } else {
                    var2.field1475 = Integer.MIN_VALUE;
                }
            }
        }
        ++field663;
    }
}
