import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jf")
public class class91 extends class71 {

    @OriginalMember(owner = "jf", name = "n", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "jf", name = "x", descriptor = "Llf;")
    private static class109 field1872 = class35.method275("Connection timed out)3", 2);

    @OriginalMember(owner = "jf", name = "s", descriptor = "Llf;")
    private static class109 field1867 = class35.method275("Attack", 2);

    @OriginalMember(owner = "jf", name = "C", descriptor = "Llf;")
    public static class109 field1877 = class35.method275("Lade Wordpack )2 ", 2);

    @OriginalMember(owner = "jf", name = "v", descriptor = "Llf;")
    public static class109 field1870 = field1872;

    @OriginalMember(owner = "jf", name = "J", descriptor = "[I")
    public static int[] field1883 = new int[32];

    @OriginalMember(owner = "jf", name = "B", descriptor = "Llf;")
    public static class109 field1876 = field1867;

    @OriginalMember(owner = "jf", name = "M", descriptor = "Llf;")
    public static class109 field1886 = class35.method275("Sie haben gerade eine andere Welt verlassen)3", 2);

    @OriginalMember(owner = "jf", name = "o", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "jf", name = "q", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "jf", name = "t", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "jf", name = "u", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "jf", name = "y", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "jf", name = "z", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "jf", name = "A", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "jf", name = "D", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "jf", name = "F", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "jf", name = "H", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "jf", name = "I", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "jf", name = "K", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "jf", name = "L", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "jf", name = "w", descriptor = "Li;")
    public class78 field1871;

    @OriginalMember(owner = "jf", name = "p", descriptor = "Ljb;")
    public class87 field1864;

    @OriginalMember(owner = "jf", name = "r", descriptor = "Ljb;")
    public class87 field1866;

    @OriginalMember(owner = "jf", name = "G", descriptor = "[I")
    public int[] field1880;

    @OriginalMember(owner = "jf", name = "a", descriptor = "(I)V")
    public final void method664(int arg0) {
        int var2 = this.field1865;
        field1868++;
        if (arg0 != 0) {
            return;
        }
        class78 var3 = this.field1871.method495(52);
        if (var3 == null) {
            this.field1880 = null;
            this.field1884 = 0;
            this.field1882 = 0;
            this.field1879 = 0;
            this.field1865 = -1;
        } else {
            this.field1884 = var3.field1534;
            this.field1882 = var3.field1548 * 128;
            this.field1880 = var3.field1545;
            this.field1879 = var3.field1514;
            this.field1865 = var3.field1557;
        }
        if (this.field1865 != var2 && this.field1866 != null) {
            class144.field2772.method1198(this.field1866);
            this.field1866 = null;
        }
    }

    @OriginalMember(owner = "jf", name = "a", descriptor = "(Ljava/awt/Color;ILlf;I)V")
    public static final void method665(Color arg0, int arg1, class109 arg2, int arg3) {
        try {
            Graphics var4 = class6.field88.getGraphics();
            if (class23.field512 == null) {
                class23.field512 = new Font("Helvetica", 1, 13);
                class27.field583 = class6.field88.getFontMetrics(class23.field512);
            }
            if (class80.field1589) {
                class80.field1589 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class137.field2647, class140.field2709);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class145.field2788 == null) {
                    class145.field2788 = class6.field88.createImage(304, 34);
                }
                Graphics var5 = class145.field2788.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, arg3 - arg1 * 3, 30);
                var5.setFont(class23.field512);
                var5.setColor(Color.white);
                arg2.method792((304 - arg2.method788(class27.field583, (byte) -110)) / 2, 22, 0, var5);
                var4.drawImage(class145.field2788, class137.field2647 / 2 - 152, class140.field2709 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class137.field2647 / 2 - 152;
                int var7 = class140.field2709 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 - -1, 301, 31);
                var4.fillRect(arg1 * 3 + var6 + 2, var7 + 2, 300 - arg1 * 3, 30);
                var4.setFont(class23.field512);
                var4.setColor(Color.white);
                arg2.method792((304 - arg2.method788(class27.field583, (byte) -121)) / 2 + var6, var7 + 22, 0, var4);
            }
        } catch (Exception var9) {
            class6.field88.repaint();
        }
        field1875++;
    }

    @OriginalMember(owner = "jf", name = "b", descriptor = "(Z)V")
    public static void method666(boolean arg0) {
        field1876 = null;
        field1867 = null;
        field1883 = null;
        field1886 = null;
        if (!arg0) {
            field1872 = null;
            field1877 = null;
            field1870 = null;
        }
    }

    @OriginalMember(owner = "jf", name = "c", descriptor = "(Z)V")
    public static final void method667(boolean arg0) {
        if (class199.field3800 != null) {
            class199.field3800.method915((byte) -121);
        }
        if (arg0) {
            field1886 = null;
        }
        field1869++;
    }
}
