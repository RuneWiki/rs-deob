import java.awt.Component;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class180 extends class188 {

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2698 = " is already on your friend list.";

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2710 = "Loaded fonts";

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lqb;")
    public static class117 field2697;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lnj;")
    public class252 field2718;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Lpa;")
    public static class2 field2702;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Lrc;")
    public class359 field2709;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "Lfn;")
    public class37 field2724;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Ltc;")
    public class48 field2693;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[I")
    public static int[] field2694;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 9)
    public static final void method1240(String arg0, int arg1, boolean arg2) {
        field2708++;
        if (arg1 < 30) {
            return;
        }
        if (!arg2) {
            try {
                class198.method1380((byte) 97, "loggedout", class156.field2451.field254);
            } catch (Throwable var9) {
            }
            try {
                class323.field5141.getAppletContext().showDocument(new URL(class323.field5141.getCodeBase(), arg0), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class272.field4317 && class189.field2844) {
            try {
                class198.method1378(new Object[] { (new URL(class323.field5141.getCodeBase(), arg0)).toString() }, class156.field2451.field254, "openjs", 17806);
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class323.field5141.getAppletContext().showDocument(new URL(class323.field5141.getCodeBase(), arg0), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V", line = 66)
    public final void method1241(byte arg0) {
        this.field2709 = null;
        this.field2718 = null;
        this.field2693 = null;
        field2706++;
        if (arg0 != 36) {
            method1240((String) null, -47, false);
        }
        this.field2724 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIJ)Z", line = 94)
    public static final boolean method1242(int arg0, int arg1, int arg2, long arg3) {
        class196 var5 = class194.field2947[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2999 != null && var5.field2999.field1702 == arg3) {
            return true;
        } else if (var5.field2994 != null && var5.field2994.field627 == arg3) {
            return true;
        } else if (var5.field3003 != null && var5.field3003.field5699 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2979; var6++) {
                if (var5.field2998[var6].field502 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V", line = 123)
    public static void method1243(byte arg0) {
        if (arg0 != 57) {
            return;
        }
        field2694 = null;
        field2710 = null;
        field2702 = null;
        field2697 = null;
        field2698 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 137)
    public static final void method1244(int arg0, Component arg1) {
        field2703++;
        arg1.removeKeyListener(class188.field2839);
        arg1.removeFocusListener(class188.field2839);
        class205.field3106 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V", line = 152)
    public static final void method1245(int arg0, int arg1, int arg2) {
        field2707++;
        class279 var3 = class147.method1085(arg0, -19443, 13);
        if (arg1 != 512) {
            field2694 = (int[]) null;
        }
        var3.method1989(0);
        var3.field4388 = arg2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZI)V", line = 165)
    public static final void method1246(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        field2716++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (class272.field4317) {
            int var6 = arg1 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class12.field120 + ((class92.field1205 - class12.field120) * var6 / 100);
            if (var7 < class325.field5213) {
                var7 = class325.field5213;
            } else if (var7 > class293.field4610) {
                var7 = class293.field4610;
            }
            int var8 = arg1 * var7 * 512 / (arg3 * 334);
            if (var8 < class38.field428) {
                short var12 = class38.field428;
                var7 = arg3 * var12 * 334 / (arg1 * 512);
                if (var7 > class293.field4610) {
                    var7 = class293.field4610;
                    int var13 = var7 * 512 * arg1 / (var12 * 334);
                    int var14 = (arg3 - var13) / 2;
                    if (arg4) {
                        class239.method1656();
                        class239.method1659(arg5, arg0, var14, arg1, 0);
                        class239.method1659(arg3 + arg5 - var14, arg0, var14, arg1, 0);
                    }
                    arg5 += var14;
                    arg3 -= var14 * 2;
                }
            } else if (class215.field3259 < var8) {
                short var9 = class215.field3259;
                var7 = arg3 * var9 * 334 / (arg1 * 512);
                if (class325.field5213 > var7) {
                    var7 = class325.field5213;
                    int var10 = var9 * 334 * arg3 / (var7 * 512);
                    int var11 = (arg1 - var10) / 2;
                    if (arg4) {
                        class239.method1656();
                        class239.method1659(arg5, arg0, arg3, var11, 0);
                        class239.method1659(arg5, arg0 - (var11 - arg1), arg3, var11, 0);
                    }
                    arg0 += var11;
                    arg1 -= var11 * 2;
                }
            }
            class182.field2739 = arg1 * var7 / 334;
        }
        class161.field2475 = (short) arg1;
        int var15 = 16 / ((-arg2 - 69) / 55);
        class351.field5604 = arg5;
        class357.field5664 = arg0;
        class227.field3432 = (short) arg3;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 273)
    public static final void method1247(int arg0) {
        class255.field4033.method378(0);
        if (arg0 == 1) {
            field2720++;
            class252.field3999.method378(0);
            class135.field2027.method378(0);
        }
    }
}
