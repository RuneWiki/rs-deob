import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class287 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lcf;")
    public static class93 field5134 = class147.method1066("Regarder dans cette direction", -48);

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lcf;")
    public static class93 field5135 = class147.method1066("Module texte charg-B", -48);

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lnh;")
    public static class54 field5139 = new class54(64);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Ltg;")
    public static class181 field5136;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIBII)V")
    public static final void method1966(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5132++;
        int var6 = arg1 - arg5;
        int var7 = arg2 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class216.method1519(arg5, arg2, arg4, arg0, true);
            }
        } else if (var7 == 0) {
            class143.method1038(arg5, arg4, arg1, false, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg5;
                arg5 = arg0;
                arg0 = var9;
                int var10 = arg1;
                arg1 = arg2;
                arg2 = var10;
            }
            if (arg1 < arg5) {
                int var11 = arg0;
                int var12 = arg5;
                arg0 = arg2;
                arg2 = var11;
                arg5 = arg1;
                arg1 = var12;
            }
            if (arg3 > -81) {
                field5139 = null;
            }
            int var13 = arg0;
            int var14 = arg1 - arg5;
            int var15 = arg2 - arg0;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg2 > arg0 ? 1 : -1;
            if (var8) {
                for (int var18 = arg5; var18 <= arg1; var18++) {
                    var16 += var15;
                    class76.field1406[var18][var13] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg1; var19++) {
                    var16 += var15;
                    class76.field1406[var13][var19] = arg4;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static final void method1967(int arg0) {
        if (class71.field1287 < 0) {
            class14.field168 = -1;
            class89.field1591 = -1;
            class71.field1287 = 0;
        }
        field5138++;
        if (class71.field1287 > class148.field2599) {
            class14.field168 = -1;
            class89.field1591 = -1;
            class71.field1287 = class148.field2599;
        }
        if (arg0 < 46) {
            field5136 = null;
        }
        if (class154.field2700 < 0) {
            class14.field168 = -1;
            class154.field2700 = 0;
            class89.field1591 = -1;
        }
        if (class183.field3373 < class154.field2700) {
            class14.field168 = -1;
            class89.field1591 = -1;
            class154.field2700 = class183.field3373;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lcf;IILjava/awt/Color;Z)V")
    public static final void method1968(class93 arg0, int arg1, int arg2, Color arg3, boolean arg4) {
        field5133++;
        try {
            Graphics var5 = class190.field3481.getGraphics();
            if (class33.field528 == null) {
                class33.field528 = new Font("Helvetica", 1, 13);
                class4.field57 = class190.field3481.getFontMetrics(class33.field528);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class150.field2629, class169.field2968);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class238.field4261 == null) {
                    class238.field4261 = class190.field3481.createImage(304, 34);
                }
                Graphics var6 = class238.field4261.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg1 * arg2) + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class33.field528);
                var6.setColor(Color.white);
                arg0.method673(0, var6, 22, (304 - arg0.method670(arg1 + 106, class4.field57)) / 2);
                var5.drawImage(class238.field4261, class150.field2629 / 2 - 152, class169.field2968 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class169.field2968 / 2 - 18;
                int var8 = class150.field2629 / 2 - 152;
                var5.setColor(arg3);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(arg2 * 3 + var8 + 2, var7 + 2, 300 - arg2 * 3, 30);
                var5.setFont(class33.field528);
                var5.setColor(Color.white);
                arg0.method673(0, var5, var7 + 22, var8 + (-arg0.method670(118, class4.field57) + 304) / 2);
            }
            if (class245.field4414 != null) {
                var5.setFont(class33.field528);
                var5.setColor(Color.white);
                class245.field4414.method673(arg1 ^ 0x3, var5, class169.field2968 / 2 - 26, class150.field2629 / 2 - class245.field4414.method670(103, class4.field57) / 2);
            }
        } catch (Exception var10) {
            class190.field3481.repaint();
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public static void method1969(int arg0) {
        if (arg0 != 25073) {
            field5135 = null;
        }
        field5135 = null;
        field5139 = null;
        field5134 = null;
        field5136 = null;
    }
}
