import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class105 {

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Ldf;")
    public static class51 field1733 = class46.method233("Fps:", 100);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "J")
    public long field1741;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lkb;")
    public class49 field1731;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lkb;")
    public class49 field1735;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lkb;")
    public class49 field1739;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[[B")
    public static byte[][] field1732;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZLdf;Ljava/awt/Color;I)V")
    public static final void method752(byte arg0, boolean arg1, class51 arg2, Color arg3, int arg4) {
        try {
            Graphics var5 = class31.field452.getGraphics();
            if (class161.field2642 == null) {
                class161.field2642 = new Font("Helvetica", 1, 13);
                class3.field25 = class31.field452.getFontMetrics(class161.field2642);
            }
            if (arg0 != 27) {
                field1733 = null;
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class95.field1578, class76.field1230);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class45.field718 == null) {
                    class45.field718 = class31.field452.createImage(304, 34);
                }
                Graphics var6 = class45.field718.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class161.field2642);
                var6.setColor(Color.white);
                arg2.method309((304 - arg2.method318(class3.field25, (byte) -123)) / 2, var6, 22, -97);
                var5.drawImage(class45.field718, class95.field1578 / 2 - 152, class76.field1230 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class76.field1230 / 2 - 18;
                int var8 = class95.field1578 / 2 - 152;
                var5.setColor(arg3);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 - -2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var8 + 2, var7 + 2, 300 - arg4 * 3, 30);
                var5.setFont(class161.field2642);
                var5.setColor(Color.white);
                arg2.method309((304 - arg2.method318(class3.field25, (byte) -126)) / 2 + var8, var5, var7 + 22, -97);
            }
            if (class74.field1177 != null) {
                var5.setFont(class161.field2642);
                var5.setColor(Color.white);
                class74.field1177.method309(class95.field1578 / 2 - class74.field1177.method318(class3.field25, (byte) -119) / 2, var5, class76.field1230 / 2 - 26, -97);
            }
        } catch (Exception var10) {
            class31.field452.repaint();
        }
        field1728++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1733 = null;
        if (arg0 >= -54) {
            method753(-102);
        }
        field1732 = null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)[Lg;")
    public static final class254[] method754(int arg0) {
        field1727++;
        class254[] var1 = new class254[class190.field3183];
        if (arg0 != 30) {
            method754(27);
        }
        for (int var2 = 0; var2 < class190.field3183; var2++) {
            byte[] var3 = class67.field1100[var2];
            int var4 = class221.field3837[var2] * class106.field1751[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class139.field2327[class191.method1366(var3[var6], 255)];
            }
            var1[var2] = new class254(class13.field194, class122.field2078, class96.field1591[var2], class125.field2123[var2], class221.field3837[var2], class106.field1751[var2], var5);
        }
        class111.method804((byte) -14);
        return var1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)V")
    public static final void method755(boolean arg0, int arg1) {
        class234.field4104 = arg0;
        class47.field745 = !class34.method170(arg1 ^ 0x172);
        field1738++;
        if (arg1 != 303) {
            field1732 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZJ)Ldf;")
    public static final class51 method756(boolean arg0, long arg1) {
        if (arg0) {
            return null;
        } else {
            field1734++;
            return class211.method1443(arg1, false, 10, -4833);
        }
    }
}
