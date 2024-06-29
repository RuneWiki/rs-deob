import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class82 {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[Lni;")
    public static class21[] field1139 = new class21[14];

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Z")
    public static boolean field1141 = false;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "J")
    public long field1142;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lge;")
    public static class137 field1146;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lli;")
    public class197 field1135;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lli;")
    public class197 field1136;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lli;")
    public class197 field1145;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lna;")
    public static class23 field1140;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static void method601(boolean arg0) {
        field1146 = null;
        field1139 = null;
        field1140 = null;
        if (!arg0) {
            method603((byte) -19, -10, (Color) null, (String) null, false);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)[Lol;")
    public static final class209[] method602(int arg0) {
        field1134++;
        if (arg0 != -28119) {
            return null;
        }
        class209[] var1 = new class209[class154.field2484];
        for (int var2 = 0; var2 < class154.field2484; var2++) {
            var1[var2] = new class68(class88.field1215, class64.field904, class70.field968[var2], class249.field3993[var2], class207.field3348[var2], class263.field4168[var2], class168.field2726[var2], class131.field2187);
        }
        class111.method804(0);
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BILjava/awt/Color;Ljava/lang/String;Z)V")
    public static final void method603(byte arg0, int arg1, Color arg2, String arg3, boolean arg4) {
        try {
            Graphics var5 = class38.field458.getGraphics();
            if (class189.field3021 == null) {
                class189.field3021 = new Font("Helvetica", 1, 13);
                class206.field3313 = class38.field458.getFontMetrics(class189.field3021);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class107.field1856, class97.field1469);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class6.field75 == null) {
                    class6.field75 = class38.field458.createImage(304, 34);
                }
                Graphics var6 = class6.field75.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                if (arg0 > 0) {
                    return;
                }
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class189.field3021);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class206.field3313.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class6.field75, class107.field1856 / 2 - 152, class97.field1469 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class97.field1469 / 2 - 18;
                int var8 = class107.field1856 / 2 - 152;
                var5.setColor(arg2);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var7 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class189.field3021);
                var5.setColor(Color.white);
                var5.drawString(arg3, var8 + ((304 - class206.field3313.stringWidth(arg3)) / 2), var7 - -22);
            }
            if (class33.field405 != null) {
                var5.setFont(class189.field3021);
                var5.setColor(Color.white);
                var5.drawString(class33.field405, class107.field1856 / 2 - class206.field3313.stringWidth(class33.field405) / 2, class97.field1469 / 2 + -26);
            }
        } catch (Exception var10) {
            class38.field458.repaint();
        }
        field1144++;
    }
}
