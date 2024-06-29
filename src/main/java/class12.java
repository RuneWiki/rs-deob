import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class12 {

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "J")
    public static volatile long field98 = 0L;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Lw;")
    public static class38 field97 = class35.method219("download", true);

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "Z")
    public static boolean field100 = false;

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Lw;")
    public static class38 field101 = class35.method219("Fishing Spot", true);

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Lw;")
    public static class38 field102 = class35.method219("-5bersicht", true);

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "Lw;")
    public static class38 field104 = class35.method219("Helmet Shop", true);

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Lw;")
    public static class38 field99 = class35.method219("Estate Agent", true);

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "Lw;")
    public static class38 field103 = class35.method219("Next page", true);

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "[B")
    public static byte[] field105;

    @OriginalMember(owner = "mapview!h", name = "k", descriptor = "[B")
    public static byte[] field107;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)V", line = 27)
    public static void method51(boolean arg0) {
        field102 = null;
        field107 = null;
        field99 = null;
        field97 = null;
        field105 = null;
        if (arg0) {
            method51(true);
        }
        field101 = null;
        field104 = null;
        field103 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ILw;Ljava/awt/Color;I)V", line = 111)
    public static final void method52(int arg0, class38 arg1, Color arg2, int arg3) {
        try {
            Graphics var4 = class31.field397.getGraphics();
            if (class16.field151 == null) {
                class16.field151 = new Font("Helvetica", 1, 13);
                class18.field185 = class31.field397.getFontMetrics(class16.field151);
            }
            if (class32.field417) {
                class32.field417 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, field106, class16.field153);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                int var5 = 73 / ((arg0 + 15) / 56);
                if (class25.field354 == null) {
                    class25.field354 = class31.field397.createImage(304, 34);
                }
                Graphics var6 = class25.field354.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var6.setFont(class16.field151);
                var6.setColor(Color.white);
                arg1.method253((304 - arg1.method243(class18.field185, 1)) / 2, var6, 22, 0);
                var4.drawImage(class25.field354, field106 / 2 - 152, class16.field153 / 2 + -18, null);
            } catch (Exception var11) {
                int var8 = field106 / 2 - 152;
                int var9 = class16.field153 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var8 + 2, var9 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class16.field151);
                var4.setColor(Color.white);
                arg1.method253(var8 + (304 - arg1.method243(class18.field185, 1)) / 2, var4, var9 + 22, 36);
            }
        } catch (Exception var12) {
            class31.field397.repaint();
        }
    }
}
