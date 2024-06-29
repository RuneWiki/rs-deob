import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class300 extends class210 {

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    private int field4829;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    private int field4826;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    private int field4816;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4823 = " is already on your ignore list.";

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field4822 = 2;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Lcc;")
    public static class222 field4828;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "[I")
    public static int[] field4824;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "[[[B")
    public static byte[][][] field4820;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)V")
    public final void method502(int arg0, byte arg1, int arg2) {
        ++field4825;
        int var4 = this.field4816 * arg2 >> 12;
        int var5 = this.field4829 * arg2 >> 12;
        int var6 = this.field4826 * arg0 >> 12;
        int var7 = this.field4818 * arg0 >> 12;
        class22.method191(var4, var5, var7, var6, super.field3241, 0);
        if (arg1 < 72) {
            method2011((String) null, false);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
    public final void method504(int arg0, int arg1, int arg2) {
        ++field4831;
        if (arg2 < -8) {
            int var4 = this.field4829 * arg1 >> 12;
            int var5 = this.field4816 * arg1 >> 12;
            int var6 = this.field4826 * arg0 >> 12;
            int var7 = this.field4818 * arg0 >> 12;
            class143.method1044(var7, var6, var4, super.field3247, 268427922, super.field3242, var5, super.field3241);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/awt/Color;Ljava/lang/String;ZZ)V")
    public static final void method2008(int arg0, Color arg1, String arg2, boolean arg3, boolean arg4) {
        if (!arg4) {
            field4824 = null;
        }
        ++field4817;
        try {
            Graphics var5 = class105.field1651.getGraphics();
            if (class85.field1263 == null) {
                class85.field1263 = new Font("Helvetica", 1, 13);
                class42.field698 = class105.field1651.getFontMetrics(class85.field1263);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class179.field2816, class163.field2449);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class174.field2687 == null) {
                    class174.field2687 = class105.field1651.createImage(304, 34);
                }
                Graphics var6 = class174.field2687.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class85.field1263);
                var6.setColor(Color.white);
                var6.drawString(arg2, (-class42.field698.stringWidth(arg2) + 304) / 2, 22);
                var5.drawImage(class174.field2687, class179.field2816 / 2 + -152, class163.field2449 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class179.field2816 / 2 + -152;
                int var8 = class163.field2449 / 2 + -18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 - -2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 - -1, var8 - -1, 301, 31);
                var5.fillRect(arg0 * 3 + var7 + 2, var8 + 2, -(arg0 * 3) + 300, 30);
                var5.setFont(class85.field1263);
                var5.setColor(Color.white);
                var5.drawString(arg2, var7 + (-class42.field698.stringWidth(arg2) + 304) / 2, var8 + 22);
            }
            if (class95.field1545 != null) {
                var5.setFont(class85.field1263);
                var5.setColor(Color.white);
                var5.drawString(class95.field1545, class179.field2816 / 2 - class42.field698.stringWidth(class95.field1545) / 2, class163.field2449 / 2 + -26);
            }
        } catch (Exception var10) {
            class105.field1651.repaint();
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(III)V")
    public static final void method2009(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class57.field900; ++var3) {
            for (int var4 = 0; var4 < class235.field3716; ++var4) {
                for (int var5 = 0; var5 < class291.field4515; ++var5) {
                    class22 var6 = class149.field2210[var3][var4][var5];
                    if (var6 != null) {
                        class163 var7 = var6.field375;
                        if (var7 != null && var7.field2456.method465()) {
                            class53.method454(var7.field2456, var3, var4, var5, 1, 1);
                            if (var7.field2459 != null && var7.field2459.method465()) {
                                class53.method454(var7.field2459, var3, var4, var5, 1, 1);
                                var7.field2456.method462(var7.field2459, 0, 0, 0, false);
                                var7.field2459 = var7.field2459.method461(arg0, arg1, arg2);
                            }
                            var7.field2456 = var7.field2456.method461(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field371; ++var8) {
                            class19 var10 = var6.field355[var8];
                            if (var10 != null && var10.field266.method465()) {
                                class53.method454(var10.field266, var3, var4, var5, var10.field261 - var10.field255 + 1, var10.field260 - var10.field258 + 1);
                                var10.field266 = var10.field266.method461(arg0, arg1, arg2);
                            }
                        }
                        class106 var9 = var6.field377;
                        if (var9 != null && var9.field1664.method465()) {
                            class114.method843(var9.field1664, var3, var4, var5);
                            var9.field1664 = var9.field1664.method461(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method2010(byte arg0) {
        field4820 = null;
        if (arg0 < -49) {
            field4828 = null;
            field4823 = null;
            field4824 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2011(String arg0, boolean arg1) {
        ++field4819;
        class253.field4038 = arg0;
        if (class123.field1863.field63 != null) {
            try {
                String var2 = class123.field1863.field63.getParameter("cookieprefix");
                String var3 = class123.field1863.field63.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (~arg0.length() != -1) {
                    var5 = var4 + "; Expires=" + class94.method736(94608000000L + class242.method1650(48), -118) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                class289.method1927(-15656, "document.cookie=\"" + var5 + "\"", class123.field1863.field63);
            } catch (Throwable var6) {
            }
            if (arg1) {
                method2011((String) null, false);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIBII)V")
    public static final void method2012(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field4832;
        int var7 = class47.method396(class112.field1727, arg0, 48, class278.field4410);
        int var8 = class47.method396(class112.field1727, arg1, -127, class278.field4410);
        int var9 = class47.method396(class184.field2914, arg5, -89, class2.field42);
        int var10 = class47.method396(class184.field2914, arg3, -98, class2.field42);
        int var11 = class47.method396(class112.field1727, arg0 + arg2, arg4 + 23, class278.field4410);
        int var12 = class47.method396(class112.field1727, -arg2 + arg1, 121, class278.field4410);
        for (int var13 = var7; var13 < var11; ++var13) {
            class173.method1240((byte) -71, var10, class55.field872[var13], arg6, var9);
        }
        for (int var14 = var8; ~var14 < ~var12; --var14) {
            class173.method1240((byte) -98, var10, class55.field872[var14], arg6, var9);
        }
        int var15 = class47.method396(class184.field2914, arg5 - -arg2, 73, class2.field42);
        int var16 = class47.method396(class184.field2914, -arg2 + arg3, 124, class2.field42);
        if (arg4 == 25) {
            for (int var17 = var11; var17 <= var12; ++var17) {
                int[] var18 = class55.field872[var17];
                class173.method1240((byte) -120, var15, var18, arg6, var9);
                class173.method1240((byte) -117, var10, var18, arg6, var16);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILub;Lub;I)Lfa;")
    public static final class267 method2013(int arg0, int arg1, class92 arg2, class92 arg3, int arg4) {
        ++field4830;
        if (!class246.method1668(arg0, arg3, arg4, -1)) {
            return null;
        } else {
            return arg1 <= 100 ? null : class85.method649(arg2.method721((byte) -117, arg4, arg0), false);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIII)V")
    public class300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4818 = arg1;
        this.field4829 = arg0;
        this.field4826 = arg3;
        this.field4816 = arg2;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        ++field4821;
        if (arg1 != -20) {
            method2014((byte) 71, (class92) null);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLub;)V")
    public static final void method2014(byte arg0, class92 arg1) {
        ++field4827;
        if (arg0 == -110) {
            class2.field45 = arg1;
        }
    }
}
