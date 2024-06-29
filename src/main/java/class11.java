import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field308 = 0;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lhe;")
    private static class54 field307 = class6.method58("Loading config )2 ", false);

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lhe;")
    private static class54 field317 = class6.method58("glow2:", false);

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lhe;")
    public static class54 field312 = field317;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lhe;")
    public static class54 field321 = field307;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
    public static int[] field311 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lhe;")
    private static class54 field320 = class6.method58("Loaded interfaces", false);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lhe;")
    public static class54 field305 = field320;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lhe;")
    public static class54 field313 = field317;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lhe;")
    private static class54 field309 = class6.method58("Please enter your username)3", false);

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lhe;")
    public static class54 field316 = field309;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method83(int arg0) {
        class43 var1 = (class43) class120.field2789.method979(-122);
        field310++;
        while (var1 != null) {
            if (var1.field1103 == -1) {
                var1.field1101 = 0;
                class53.method375(var1, 18278);
            } else {
                var1.method48(-315);
            }
            var1 = (class43) class120.field2789.method983(arg0 + 40176);
        }
        if (arg0 != -21691) {
            method85(-32);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
    public static final boolean method84(int arg0, int arg1) {
        field314++;
        if (arg0 > -120) {
            return false;
        } else {
            return (arg1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static final void method85(int arg0) {
        for (int var1 = arg0; var1 < class74.field1823; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class141.field3227[var1];
            }
            class22 var3 = class48.field1148[var2];
            if (var3 != null) {
                client.method177(1, arg0 + 5, var3);
            }
        }
        field319++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[BI)I")
    public static final int method86(int arg0, byte[] arg1, int arg2) {
        field318++;
        return arg0 == -968 ? class103.method808((byte) -120, arg1, 0, arg2) : -105;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lhe;Ljava/awt/Color;ZI)V")
    public static final void method87(class54 arg0, Color arg1, boolean arg2, int arg3) {
        field324++;
        try {
            Graphics var4 = class70.field1753.getGraphics();
            if (class85.field2118 == null) {
                class85.field2118 = new Font("Helvetica", 1, 13);
                class12.field336 = class70.field1753.getFontMetrics(class85.field2118);
            }
            if (class27.field716) {
                class27.field716 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class115.field2726, class111.field2666);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class131.field2967 == null) {
                    class131.field2967 = class70.field1753.createImage(304, 34);
                }
                Graphics var5 = class131.field2967.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                if (!arg2) {
                    var5.setColor(Color.black);
                    var5.drawRect(1, 1, 301, 31);
                    var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                    var5.setFont(class85.field2118);
                    var5.setColor(Color.white);
                    arg0.method396((304 - arg0.method401(59, class12.field336)) / 2, (byte) -100, 22, var5);
                    var4.drawImage(class131.field2967, class115.field2726 / 2 - 152, class111.field2666 / 2 + -18, null);
                }
            } catch (Exception var8) {
                int var6 = class115.field2726 / 2 - 152;
                int var7 = class111.field2666 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 - -1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class85.field2118);
                var4.setColor(Color.white);
                arg0.method396((304 - arg0.method401(59, class12.field336)) / 2 + var6, (byte) -121, var7 + 22, var4);
            }
        } catch (Exception var9) {
            class70.field1753.repaint();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lef;Z)V")
    public static final void method88(class35 arg0, boolean arg1) {
        class1.field8 = arg0;
        field322++;
        if (arg1) {
            method84(32, -56);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static void method89(int arg0) {
        field309 = null;
        field317 = null;
        field313 = null;
        field307 = null;
        field312 = null;
        field305 = null;
        field316 = null;
        field311 = null;
        field321 = null;
        field320 = null;
        if (arg0 != 3) {
            field316 = null;
        }
    }
}
