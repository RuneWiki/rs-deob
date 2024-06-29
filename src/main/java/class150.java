import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class150 {

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Luf;")
    public static class310 field2113 = new class310(10, 8);

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
    public static final void method949(boolean arg0) {
        if (!arg0) {
            field2114 = -107;
        }
        field2111++;
        if (class38.field513 != null) {
            return;
        }
        Container var1;
        if (class140.field1993 == null) {
            var1 = class282.field3804.field5516;
        } else {
            var1 = class140.field1993;
        }
        class166.field2345 = var1.getSize().width;
        class282.field3808 = var1.getSize().height;
        if (class140.field1993 == var1) {
            Insets var2 = class140.field1993.getInsets();
            class166.field2345 -= var2.left + var2.right;
            class282.field3808 -= var2.top + var2.bottom;
        }
        if (class448.method2641((byte) 72) == 1) {
            class426.field6240 = 0;
            class351.field4795 = class260.field3581;
            class200.field2856 = (class166.field2345 - class95.field1311) / 2;
            class177.field2513 = class95.field1311;
        } else if (class463.field6730 < 96 && class278.field3761 == 0) {
            int var3 = class166.field2345 <= 1024 ? class166.field2345 : 1024;
            class177.field2513 = var3;
            class200.field2856 = (class166.field2345 - var3) / 2;
            int var4 = class282.field3808 > 768 ? 768 : class282.field3808;
            class351.field4795 = var4;
            class426.field6240 = 0;
        } else {
            class177.field2513 = class166.field2345;
            class200.field2856 = 0;
            class426.field6240 = 0;
            class351.field4795 = class282.field3808;
        }
        if (class528.field7773 != class175.field2498) {
            boolean var10000;
            if (class177.field2513 < 1024 && class351.field4795 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class474.field6924.setSize(class177.field2513, class351.field4795);
        if (class418.field6109 != null) {
            class418.field6109.method538(class474.field6924);
        }
        if (class140.field1993 == var1) {
            Insets var5 = class140.field1993.getInsets();
            class474.field6924.setLocation(class200.field2856 + var5.left, var5.top - -class426.field6240);
        } else {
            class474.field6924.setLocation(class200.field2856, class426.field6240);
        }
        if (class319.field4419 != -1) {
            class302.method1720(true, 66);
        }
        class275.method1564(false);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public static void method950(int arg0) {
        field2113 = null;
        if (arg0 != 6) {
            method952((byte) -24, null);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ZLjava/awt/Color;IZ)V")
    public static final void method951(Color arg0, Color arg1, String arg2, boolean arg3, Color arg4, int arg5, boolean arg6) {
        try {
            Graphics var7 = class474.field6924.getGraphics();
            if (class8.field80 == null) {
                class8.field80 = new Font("Helvetica", 1, 13);
            }
            if (arg6) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class177.field2513, class351.field4795);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class40.field542 == null) {
                    class40.field542 = class474.field6924.createImage(304, 34);
                }
                Graphics var8 = class40.field542.getGraphics();
                var8.setColor(arg0);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg1);
                var8.fillRect(2, 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                if (!arg3) {
                    method953(96);
                }
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg5 * 3 + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class8.field80);
                var8.setColor(arg4);
                var8.drawString(arg2, (304 - (arg2.length() * 6)) / 2, 22);
                var7.drawImage(class40.field542, class177.field2513 / 2 - 152, class351.field4795 / 2 - 18, null);
            } catch (Exception var11) {
                int var9 = class177.field2513 / 2 - 152;
                int var10 = class351.field4795 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var9 + 2, var10 + 2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg5 * 3 + var9 + 2, var10 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class8.field80);
                var7.setColor(arg4);
                var7.drawString(arg2, var9 + ((304 - arg2.length() * 6) / 2), var10 + 22);
            }
            if (class49.field679 != null) {
                var7.setFont(class8.field80);
                var7.setColor(arg4);
                var7.drawString(class49.field679, class177.field2513 / 2 - (class49.field679.length() * 6 / 2), class351.field4795 / 2 + -26);
            }
        } catch (Exception var12) {
            class474.field6924.repaint();
        }
        field2116++;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLss;)V")
    public static final void method952(byte arg0, class295 arg1) {
        field2115++;
        if (class54.field754 == arg1.field3958) {
            class451.field6504[arg1.field3956] = true;
        }
        int var2 = -24 / ((arg0 - 48) / 50);
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
    public static final void method953(int arg0) {
        class164.method1023(113, class437.field6374.field4266, 22050, 2);
        field2112++;
        class241.field3335 = new class362();
        class241.field3335.method2031(9, -53, 128);
        class476.field6960 = class320.method1810(class282.field3804, 0, class474.field6924, 0, 22050);
        class476.field6960.method1991(-27890, class241.field3335);
        class63.method395((byte) 127, class528.field7767, class241.field3335, class266.field3645, class63.field872);
        class254.field3531 = class320.method1810(class282.field3804, 0, class474.field6924, 1, arg0);
        class189.field2623 = new class147();
        class254.field3531.method1991(-27890, class189.field2623);
        class184.field2579 = new class371(22050, class12.field141);
        class289.field3886 = class252.field3511.method1396("scape main", (byte) 71);
    }

    static {
        new class83("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
    }
}
