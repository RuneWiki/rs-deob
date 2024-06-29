import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class452 {

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public int field6691;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    private int field6697;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field6685 = -1;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field6683 = 1;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[[[J")
    public static long[][][] field6688;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILec;Liq;)V")
    public static final void method2802(int arg0, class96 arg1, class134 arg2) {
        class151.field2081 = arg2;
        field6695++;
        class145.field1930 = arg1;
        if (arg0 != 5) {
            method2804(70, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)I")
    public final int method2803(boolean arg0) {
        field6694++;
        if (!arg0) {
            method2806((byte) 30, -73);
        }
        return this.field6697;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)V")
    public static final void method2804(int arg0, byte arg1) {
        field6687++;
        class32 var2 = class136.method854(9, (byte) 96, arg0);
        var2.method192(-17451);
        if (arg1 >= -67) {
            method2809((class228) null, (class227) null, 23, (class261) null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method2805(int arg0) {
        if (arg0 != 32767) {
            field6683 = 84;
        }
        field6688 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
    public static final void method2806(byte arg0, int arg1) {
        field6689++;
        int var2 = 22 / ((arg0 + 20) / 51);
        class265.field4045.method1481(3, arg1);
    }

    @OriginalMember(owner = "client!wl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6690++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;Lsc;I)Lbl;")
    public static final class211 method2807(int arg0, String arg1, class239 arg2, int arg3) {
        field6692++;
        if (arg3 == 0) {
            return arg2.method1458(arg1, true);
        }
        int var4 = -37 % ((13 - arg0) / 47);
        if (arg3 == 1) {
            try {
                class232.method1403("openjs", new Object[] { (new URL(arg2.field3583.getCodeBase(), arg1)).toString() }, arg2.field3583, (byte) 126);
                class211 var5 = new class211();
                var5.field3172 = 1;
                return var5;
            } catch (Throwable var11) {
                class211 var6 = new class211();
                var6.field3172 = 2;
                return var6;
            }
        } else if (arg3 == 2) {
            try {
                arg2.field3583.getAppletContext().showDocument(new URL(arg2.field3583.getCodeBase(), arg1), "_blank");
                class211 var7 = new class211();
                var7.field3172 = 1;
                return var7;
            } catch (Exception var12) {
                class211 var8 = new class211();
                var8.field3172 = 2;
                return var8;
            }
        } else if (arg3 == 3) {
            try {
                class232.method1404(arg2.field3583, 61, "loggedout");
            } catch (Throwable var14) {
            }
            try {
                arg2.field3583.getAppletContext().showDocument(new URL(arg2.field3583.getCodeBase(), arg1), "_top");
                class211 var9 = new class211();
                var9.field3172 = 1;
                return var9;
            } catch (Exception var13) {
                class211 var10 = new class211();
                var10.field3172 = 2;
                return var10;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Los;")
    public static final class341 method2808(int arg0) {
        if (arg0 > -64) {
            method2808(-37);
        }
        field6693++;
        return class223.field3379;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lfc;Ldh;ILdr;)V")
    public static final void method2809(class228 arg0, class227 arg1, int arg2, class261 arg3) {
        field6684++;
        class234 var4 = arg0.method1386(arg3, 116);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1227();
        if (var4.method1229() > var5) {
            var5 = var4.method1229();
        }
        byte var6 = 10;
        int var7 = arg1.field3441;
        int var8 = arg1.field3439;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field3489 != null) {
            var9 = class148.field2044.method1698((int[]) null, (class234[]) null, (byte) 96, arg0.field3489, class362.field5332);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class362.field5332[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class167.field2393.method1796(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class167.field2393.method1795() + class167.field2393.method1799() / 2;
        }
        int var15 = arg1.field3441 + (var5 / 2);
        int var16 = arg1.field3439;
        if (arg2 != 16333) {
            field6683 = 11;
        }
        if ((class223.field3410 + var5) > var7) {
            var7 = class223.field3410;
            var15 = class223.field3410 + var6 - (-(var5 / 2) - (var10 / 2) - 5);
        } else if (var7 > class223.field3412 - var5) {
            var7 = class223.field3412 - var5;
            var15 = class223.field3412 - (var5 / 2) - var6 - (var10 / 2) - 5;
        }
        if (class223.field3398 + var5 > var8) {
            var16 = class223.field3398 + var6 + (var5 / 2);
            var8 = class223.field3398;
        } else if ((class223.field3393 - var5) < var8) {
            var8 = class223.field3393 - var5;
            var16 = class223.field3393 - (var5 / 2) - var6 - var11;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg1.field3441), (double) (var8 - arg1.field3439)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method1414((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field3489 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var16 + (class167.field2393.method1795() * var9) + 3;
            var20 = var18 + var10 + 10;
            if (arg0.field3492 != 0) {
                arg3.method1615(var20 - var18, arg0.field3492, var21 - var16, var18, var16, (byte) -119);
            }
            if (arg0.field3444 != 0) {
                arg3.method1621(var21 - var16, var18, arg0.field3444, var16, -17638, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class362.field5332[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class167.field2393.method1798(arg3, var23, var15, var16, arg0.field3464, true);
                var16 += class167.field2393.method1795();
            }
        }
        if (arg0.field3454 == -1 && arg0.field3489 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class245 var25 = new class245(arg1);
        var25.field3672 = var8 + var24;
        var25.field3677 = var20;
        var25.field3674 = var18;
        var25.field3667 = var7 - var24;
        var25.field3671 = var19;
        var25.field3675 = var7 + var24;
        var25.field3678 = var8 - var24;
        var25.field3673 = var21;
        class298.field4502.method2504(arg2 - 16291, var25);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(II)V")
    public class452(int arg0, int arg1) {
        this.field6691 = arg1;
        this.field6697 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
    public static final void method2810(int arg0) {
        field6696++;
        class403.method2540(-28);
        class3.method21(125);
        class437.method2680(true);
        class391.method2411(-1);
        class195.method1165(-68);
        class186.field2796.method1105((byte) -62);
        class116.method700(true);
        class186.method1134(-17470);
        class357.method2143(0);
        class66.method448((byte) -87);
        if (arg0 < 28) {
            field6685 = -71;
        }
        class359.method2168(-4540);
        class128.method758(true);
        class32.method189(10663);
        class184.method1123((byte) 121);
        class172.method1063((byte) -81);
        class150.method934(10);
        class451.method2779(74);
        class281.method1733(true);
        class387.method2391((byte) -122);
        class90.method589(1);
        class66.method450((byte) 62);
        class162.method981(4);
        class165.method992(2198);
        class245.field3665.method1482((byte) 108);
        class458.field6784.method1482((byte) -74);
        class296.field4486.method1482((byte) 77);
        class294.field4479.method1482((byte) 117);
        class384.field5614.method1482((byte) 29);
    }
}
