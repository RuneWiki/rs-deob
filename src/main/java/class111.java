import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class111 extends class287 {

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "[I")
    public int[] field1547 = new int[] { -1 };

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "[I")
    public int[] field1552 = new int[] { 0 };

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Lpe;")
    public static class277 field1544 = new class277(5000);

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "[[[Lsm;")
    public static class124[][][] field1546;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lug;I)I", line = 9)
    public static final int method791(class253 arg0, int arg1) {
        field1551++;
        int var2 = 0;
        if (arg1 != 20636) {
            method795(false);
        }
        if (arg0.method1837(90, class42.field572)) {
            var2++;
        }
        if (arg0.method1837(95, class318.field5030)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/lang/String;ZLjava/awt/Color;I)V", line = 34)
    public static final void method792(int arg0, String arg1, boolean arg2, Color arg3, int arg4) {
        try {
            Graphics var5 = class116.field1615.getGraphics();
            if (class261.field4097 == null) {
                class261.field4097 = new Font("Helvetica", 1, 13);
                class57.field786 = class116.field1615.getFontMetrics(class261.field4097);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class127.field1841, class95.field1258);
            }
            if (arg0 <= 37) {
                method793(105);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class36.field517 == null) {
                    class36.field517 = class116.field1615.createImage(304, 34);
                }
                Graphics var6 = class36.field517.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class261.field4097);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - class57.field786.stringWidth(arg1)) / 2, 22);
                var5.drawImage(class36.field517, class127.field1841 / 2 - 152, class95.field1258 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class127.field1841 / 2 - 152;
                int var9 = class95.field1258 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var8 + 2, var9 + 2, 300 - (arg4 * 3), 30);
                var5.setFont(class261.field4097);
                var5.setColor(Color.white);
                var5.drawString(arg1, var8 + ((304 - class57.field786.stringWidth(arg1)) / 2), var9 - -22);
            }
            if (class96.field1270 != null) {
                var5.setFont(class261.field4097);
                var5.setColor(Color.white);
                var5.drawString(class96.field1270, class127.field1841 / 2 - class57.field786.stringWidth(class96.field1270) / 2, class95.field1258 / 2 + -26);
            }
        } catch (Exception var12) {
            class116.field1615.repaint();
        }
        field1548++;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 110)
    public static final void method793(int arg0) {
        for (class166 var1 = (class166) class81.field1109.method22((byte) 124); var1 != null; var1 = (class166) class81.field1109.method26((byte) -124)) {
            if (var1.field2722) {
                var1.method1246(false);
            }
        }
        if (arg0 < 114) {
            field1546 = (class124[][][]) ((class124[][][]) null);
        }
        for (class166 var2 = (class166) class284.field4394.method22((byte) 120); var2 != null; var2 = (class166) class284.field4394.method26((byte) -128)) {
            if (var2.field2722) {
                var2.method1246(false);
            }
        }
        field1545++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)I", line = 141)
    public static final int method794(int arg0, int arg1, byte arg2) {
        field1549++;
        class111 var3 = (class111) class267.field4161.method2168((long) arg1, (byte) -120);
        if (arg2 != 29) {
            field1550 = -120;
        }
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field1547.length) {
            return var3.field1547[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 172)
    public static void method795(boolean arg0) {
        field1546 = (class124[][][]) null;
        if (arg0) {
            field1544 = (class277) null;
        }
        field1544 = null;
    }
}
