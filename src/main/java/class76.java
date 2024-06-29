import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field1696 = 0;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[I")
    public static int[] field1700 = new int[500];

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Llc;")
    public static class69 field1697 = class69.method470((byte) -115, "(U1");

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Llc;")
    public static class69 field1710 = class69.method470((byte) -113, "m");

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Llc;")
    public static class69 field1714 = class69.method470((byte) -110, " from your friend list first");

    @OriginalMember(owner = "client!md", name = "r", descriptor = "J")
    public static long field1712 = 0L;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
    public static int[] field1701;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "[[[B")
    public static byte[][][] field1711;

    @OriginalMember(owner = "client!md", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1699++;
        if (class69.field1526 != null) {
            class122.field2640 = 0;
            class50.field1093 = arg0.getX();
            class78.field1753 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!md", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1698++;
        if (class69.field1526 != null) {
            class122.field2640 = 0;
            class50.field1093 = -1;
            class78.field1753 = -1;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method535(boolean arg0) {
        if (arg0) {
            field1714 = null;
        }
        class36.field720.method606(-2);
        class43.field850 = class117.method848(class43.field850);
        field1707++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)I")
    public static final int method536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 81) {
            field1696 = -26;
        }
        field1706++;
        int var5 = 65536 - class117.field2514[arg1 * 1024 / arg3] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static final void method537(byte arg0) {
        field1713++;
        class76 var1 = class69.field1526;
        synchronized (class69.field1526) {
            class81.field1834 = class57.field1204;
            class101.field2193 = class50.field1093;
            class74.field1666 = class78.field1753;
            class62.field1278 = class123.field2681;
            class127.field2733 = class96.field2122;
            class19.field417 = class89.field1937;
            class79.field1793 = class4.field76;
            class123.field2681 = 0;
        }
        int var2 = 66 / ((-arg0 - 38) / 59);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method538(int arg0) {
        field1700 = null;
        field1711 = null;
        field1697 = null;
        if (arg0 >= 41) {
            field1710 = null;
            field1701 = null;
            field1714 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1715++;
        if (class69.field1526 != null) {
            class122.field2640 = 0;
            class57.field1204 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLcb;)V")
    public static final void method539(byte arg0, class15 arg1) {
        field1709++;
        short var2 = 256;
        for (int var3 = 0; var3 < class4.field91.length; var3++) {
            class4.field91[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class4.field91[var16] = (int) (Math.random() * 256.0D);
        }
        int var5 = 0;
        if (arg0 != -120) {
            method539((byte) 76, null);
        }
        while (var5 < 20) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class92.field2007[var15] = (class4.field91[var15 - 128] + class4.field91[var15 - 1] + class4.field91[var15 - -1] + class4.field91[var15 - -128]) / 4;
                }
            }
            int[] var13 = class4.field91;
            class4.field91 = class92.field2007;
            class92.field2007 = var13;
            var5++;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field280; var7++) {
            for (int var8 = 0; var8 < arg1.field275; var8++) {
                if (arg1.field273[var6++] != 0) {
                    int var9 = arg1.field276 + var7 + 16;
                    int var10 = arg1.field274 + var8 + 16;
                    int var11 = (var9 << 7) + var10;
                    class4.field91[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class69.field1526 != null) {
            class122.field2640 = 0;
            class96.field2122 = arg0.getX();
            class89.field1937 = arg0.getY();
            class4.field76 = System.currentTimeMillis();
            if (arg0.isMetaDown()) {
                class123.field2681 = 2;
                class57.field1204 = 2;
            } else {
                class123.field2681 = 1;
                class57.field1204 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1695++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Llc;")
    public static final class69 method540(int arg0, int arg1) {
        field1702++;
        if (class50.field1084 + 10 < arg1) {
            return class70.field1567;
        }
        Calendar var2 = Calendar.getInstance();
        long var3 = ((long) arg1 + 11745L) * 86400000L;
        if (arg0 != 6746) {
            return null;
        }
        var2.setTime(new Date(var3));
        int var5 = var2.get(5);
        int var6 = var2.get(2);
        int var7 = var2.get(1);
        class69[] var8 = new class69[] { class103.field2226, class61.field1257, class110.field2415, class123.field2677, class60.field1240, class107.field2331, class35.field698, class122.field2668, class94.field2108, class93.field2048, class49.field995, class39.field770 };
        return class46.method305(20025, new class69[] { class106.method791(var5, (byte) -122), class4.field83, var8[var6], class4.field83, class106.method791(var7, (byte) -102) });
    }

    @OriginalMember(owner = "client!md", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1705++;
    }

    @OriginalMember(owner = "client!md", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class69.field1526 != null) {
            class122.field2640 = 0;
            class50.field1093 = arg0.getX();
            class78.field1753 = arg0.getY();
        }
        field1703++;
    }

    @OriginalMember(owner = "client!md", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class69.field1526 != null) {
            class122.field2640 = 0;
            class50.field1093 = arg0.getX();
            class78.field1753 = arg0.getY();
        }
        field1708++;
    }
}
