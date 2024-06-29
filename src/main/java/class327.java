import jaggl.memory.NativeBuffer;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class327 extends class306 implements class243 {

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    private int field5071;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "Lik;")
    public static class138 field5067;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Lhh;")
    public static class84 field5068;

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lqg;ILjaggl/memory/NativeBuffer;)V", line = 4)
    public class327(class321 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field5071 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I", line = 14)
    public final int method1566(int arg0) {
        if (arg0 != 16999) {
            field5067 = null;
        }
        ++field5062;
        return this.field5071;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([BIII)V", line = 25)
    public final void method1567(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method1929(arg0, arg1);
        if (arg3 == 9813) {
            ++field5070;
            this.field5071 = arg2;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)J", line = 37)
    public final long method1565(byte arg0) {
        if (arg0 != -88) {
            this.field5071 = 3;
        }
        ++field5064;
        return super.field4378.method2647();
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V", line = 49)
    public static final void method2140(int arg0, int arg1) {
        ++field5072;
        class434 var2 = class483.method2888(arg1, -108, 2);
        var2.method2628(arg0 + -28673);
        if (arg0 != 28758) {
            method2141((byte) -85);
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V", line = 62)
    public static void method2141(byte arg0) {
        if (arg0 > 116) {
            field5067 = null;
            field5068 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)I", line = 76)
    public final int method1568(int arg0) {
        int var2 = 39 % ((arg0 - -42) / 59);
        ++field5069;
        return 0;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLhh;)V", line = 87)
    public static final void method2142(boolean arg0, class84 arg1) {
        class101.field1615 = arg1.method677(-1, "p11_full");
        ++field5066;
        if (!arg0) {
            class490.field7147 = arg1.method677(-1, "p12_full");
            class147.field2169 = arg1.method677(-1, "b12_full");
            class170.field2553 = arg1.method677(-1, "hitmarks");
            class281.field4021 = arg1.method677(-1, "hitbar_default");
            class127.field1929 = arg1.method677(-1, "timerbar_default");
            class398.field5854 = arg1.method677(-1, "headicons_pk");
            class474.field6988 = arg1.method677(-1, "headicons_prayer");
            class11.field176 = arg1.method677(-1, "hint_headicons");
            class274.field3961 = arg1.method677(-1, "hint_mapmarkers");
            class265.field3829 = arg1.method677(-1, "mapflag");
            class439.field6405 = arg1.method677(-1, "cross");
            class220.field3169 = arg1.method677(-1, "mapdots");
            class277.field3995 = arg1.method677(-1, "scrollbar");
            class292.field4179 = arg1.method677(-1, "name_icons");
            class91.field1502 = arg1.method677(-1, "floorshadows");
            class182.field2746 = arg1.method677(-1, "compass");
            class160.field2430 = arg1.method677(-1, "otherlevel");
            class17.field259 = arg1.method677(-1, "hint_mapedge");
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZIIZI)V", line = 121)
    public static final void method2143(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field5065;
        if (class320.field4577 != null && (arg2 != 3 || ~class397.field5830.field132 != ~arg5 || class397.field5830.field127 != arg0)) {
            class36.method288((byte) 111, class320.field4577, class112.field1785);
            class320.field4577 = null;
        }
        if (arg2 == 3 && class320.field4577 == null) {
            class320.field4577 = class326.method2122(class112.field1785, 0, arg0, arg5, 0, (byte) 107);
            if (class320.field4577 != null) {
                class397.field5830.field132 = arg5;
                class397.field5830.field127 = arg0;
                class397.field5830.method1299((byte) 108, class112.field1785);
            }
        }
        if (arg2 == 3 && class320.field4577 == null) {
            method2143(-1, true, class397.field5830.field124, arg3, false, -1);
        } else {
            Container var6;
            if (class320.field4577 != null) {
                class183.field2752 = arg0;
                class382.field5683 = arg5;
                var6 = class320.field4577;
            } else if (class409.field6029 != null) {
                Insets var7 = class409.field6029.getInsets();
                int var10001 = -var7.right;
                class382.field5683 = class409.field6029.getSize().width + var10001 + -var7.left;
                class183.field2752 = class409.field6029.getSize().height + -var7.bottom + -var7.top;
                var6 = class409.field6029;
            } else {
                var6 = class112.field1785.field4458;
                class382.field5683 = var6.getSize().width;
                class183.field2752 = var6.getSize().height;
            }
            if (arg2 == 1) {
                class79.field1315 = (-class7.field107 + class382.field5683) / 2;
                class381.field5677 = 0;
                class112.field1780 = class7.field107;
                class477.field7003 = class353.field5345;
            } else if (~class445.field6538 > -97 && ~class399.field5865 == -1) {
                int var8 = ~class382.field5683 >= -1025 ? class382.field5683 : 1024;
                class79.field1315 = (-var8 + class382.field5683) / 2;
                class112.field1780 = var8;
                int var9 = ~class183.field2752 < -769 ? 768 : class183.field2752;
                class381.field5677 = 0;
                class477.field7003 = var9;
            } else {
                class381.field5677 = 0;
                class112.field1780 = class382.field5683;
                class477.field7003 = class183.field2752;
                class79.field1315 = 0;
            }
            if (class502.field7371 != class108.field1683) {
                boolean var10000;
                if (~class112.field1780 > -1025 && class477.field7003 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (!arg1) {
                class31.field503.setSize(class112.field1780, class477.field7003);
                class394.field5821.method533(class31.field503);
                if (class409.field6029 == var6) {
                    Insets var10 = class409.field6029.getInsets();
                    class31.field503.setLocation(class79.field1315 + var10.left, class381.field5677 + var10.top);
                } else {
                    class31.field503.setLocation(class79.field1315, class381.field5677);
                }
            } else {
                class382.method2418(65535);
            }
            if (~arg2 <= -3) {
                class396.field5828 = true;
            } else {
                class396.field5828 = false;
            }
            if (~class341.field5207 != 0) {
                class31.method256(44, true);
            }
            if (class138.field2091 != null && (class17.field266 == 30 || class17.field266 == 25)) {
                class450.method2712(-56);
            }
            for (int var11 = 0; ~var11 > -101; ++var11) {
                class165.field2473[var11] = true;
            }
            if (arg4) {
                method2143(-64, false, -33, -6, true, -16);
            }
            class245.field3532 = true;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lqg;I[BI)V", line = 270)
    public class327(class321 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5071 = arg1;
    }
}
