import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class559 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field7738 = 0;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Lfca;")
    public static class74 field7745 = new class74("", 13);

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "[Lnv;")
    public static class353[] field7747 = new class353[14];

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "Z")
    public static boolean field7748 = false;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lej;")
    public static class104 field7746 = new class104(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field7744;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Llm;")
    public class425 field7742;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lpl;")
    public class559 field7736;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BZ)V")
    public static final void method3183(byte arg0, boolean arg1) {
        for (class421 var2 = (class421) class41.field806.method456((byte) -37); var2 != null; var2 = (class421) class41.field806.method460((byte) -85)) {
            if (var2.field5904 != null) {
                class204.field2869.method2731(var2.field5904);
                var2.field5904 = null;
            }
            if (var2.field5903 != null) {
                class204.field2869.method2731(var2.field5903);
                var2.field5903 = null;
            }
            var2.method1117(0);
        }
        if (arg0 <= 40) {
            return;
        }
        field7740++;
        if (!arg1) {
            return;
        }
        for (class421 var3 = (class421) class495.field6924.method456((byte) -123); var3 != null; var3 = (class421) class495.field6924.method460((byte) 115)) {
            if (var3.field5904 != null) {
                class204.field2869.method2731(var3.field5904);
                var3.field5904 = null;
            }
            var3.method1117(0);
        }
        for (class421 var4 = (class421) class480.field6765.method1248(-1); var4 != null; var4 = (class421) class480.field6765.method1245((byte) 95)) {
            if (var4.field5904 != null) {
                class204.field2869.method2731(var4.field5904);
                var4.field5904 = null;
            }
            var4.method1117(0);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public final void method3184(int arg0) {
        field7737++;
        if (~class171.field2472 <= arg0) {
            return;
        }
        this.field7744 = 0;
        this.field7736 = class207.field2907;
        this.field7742 = null;
        class171.field2472++;
        class207.field2907 = this;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
    public static final void method3185(int arg0, int arg1) {
        class71.field1182 = arg0;
        field7739++;
        class529.field7414.method3246(false);
        if (arg1 != 252) {
            method3188(-124, null, null, 101, null, true, null);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(CI)C")
    public static final char method3186(char arg0, int arg1) {
        if (arg1 != 228) {
            method3183((byte) -112, true);
        }
        field7743++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method3187(int arg0) {
        int var1 = 21 % ((-arg0 - 30) / 61);
        field7745 = null;
        field7746 = null;
        field7747 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;Ljava/awt/Color;ILjava/awt/Color;ZLjava/awt/Color;)V")
    public static final void method3188(int arg0, String arg1, Color arg2, int arg3, Color arg4, boolean arg5, Color arg6) {
        try {
            Graphics var7 = class166.field2390.getGraphics();
            if (class264.field3689 == null) {
                class264.field3689 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class387.field5196, class134.field2128);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (arg3 < 69) {
                    field7738 = 76;
                }
                if (class142.field2202 == null) {
                    class142.field2202 = class166.field2390.createImage(304, 34);
                }
                Graphics var8 = class142.field2202.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg4);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var8.setFont(class264.field3689);
                var8.setColor(arg2);
                var8.drawString(arg1, (304 - (arg1.length() * 6)) / 2, 22);
                var7.drawImage(class142.field2202, class387.field5196 / 2 - 152, class134.field2128 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class387.field5196 / 2 - 152;
                int var10 = class134.field2128 / 2 - 18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + (var9 + 2), var10 + 2, 300 - (arg0 * 3), 30);
                var7.setFont(class264.field3689);
                var7.setColor(arg2);
                var7.drawString(arg1, var9 + (304 - (arg1.length() * 6)) / 2, var10 + 22);
            }
            if (class595.field8613 != null) {
                var7.setFont(class264.field3689);
                var7.setColor(arg2);
                var7.drawString(class595.field8613, class387.field5196 / 2 - (class595.field8613.length() * 6 / 2), class134.field2128 / 2 + -26);
            }
        } catch (Exception var12) {
            class166.field2390.repaint();
        }
        field7741++;
    }
}
