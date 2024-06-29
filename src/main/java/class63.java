import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class63 {

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lwb;")
    private class129 field1664 = new class129();

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Lb;")
    private class7 field1680 = new class7();

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lmb;")
    private class74 field1678;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
    public static int[] field1666 = new int[99];

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
    public static int[] field1668;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lmc;")
    private static class75 field1667;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Z")
    public static boolean field1673;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lmc;")
    public static class75 field1669;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[I")
    public static int[] field1670;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lmc;")
    private static class75 field1674;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lmc;")
    public static class75 field1672;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
    public static boolean field1671;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "[[[B")
    public static byte[][][] field1676;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "[[[I")
    public static int[][][] field1675;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1666[var1] = var0 / 4;
        }
        field1668 = new int[] { 1, 0, -1, 0 };
        field1667 = class30.method234(true, " more options");
        field1673 = true;
        field1669 = field1667;
        field1670 = new int[100];
        field1674 = class30.method234(true, "flash1:");
        field1672 = field1674;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)I", line = 4)
    public static final int method550(int arg0, boolean arg1) {
        field1662++;
        class111 var2 = class43.method327((byte) 24, arg0);
        int var3 = var2.field2817;
        int var4 = var2.field2812;
        if (arg1) {
            field1675 = null;
        }
        int var5 = var2.field2807;
        int var6 = class43.field1024[var4 - var5];
        return class62.field1613[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)I", line = 25)
    public static final int method551(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field1659++;
        if (arg2 == var4) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 48)
    public static void method552(int arg0) {
        field1674 = null;
        field1667 = null;
        if (arg0 >= -48) {
            return;
        }
        field1672 = null;
        field1670 = null;
        field1675 = null;
        field1666 = null;
        field1676 = null;
        field1668 = null;
        field1669 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 70)
    public final void method553(byte arg0) {
        field1656++;
        while (true) {
            class129 var2 = this.field1680.method34(127);
            if (var2 == null) {
                this.field1679 = this.field1677;
                int var3 = 75 / ((69 - arg0) / 38);
                return;
            }
            var2.method589(true);
            var2.method1010(-22056);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILmc;Ljava/awt/Color;)V", line = 93)
    public static final void method554(int arg0, int arg1, class75 arg2, Color arg3) {
        try {
            Graphics var4 = class108.field2738.getGraphics();
            if (class23.field440 == null) {
                class23.field440 = new Font("Helvetica", 1, 13);
                class85.field2107 = class108.field2738.getFontMetrics(class23.field440);
            }
            if (class110.field2780) {
                class110.field2780 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class17.field344, class119.field2935);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                int var5 = 105 / ((arg1 + 53) / 57);
                if (class101.field2614 == null) {
                    class101.field2614 = class108.field2738.createImage(304, 34);
                }
                Graphics var6 = class101.field2614.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class23.field440);
                var6.setColor(Color.white);
                arg2.method651(var6, (304 - arg2.method657(0, class85.field2107)) / 2, 22, 5038);
                var4.drawImage(class101.field2614, class17.field344 / 2 - 152, class119.field2935 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class17.field344 / 2 - 152;
                int var8 = class119.field2935 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class23.field440);
                var4.setColor(Color.white);
                arg2.method651(var4, (304 - arg2.method657(0, class85.field2107)) / 2 + var7, var8 - -22, 5038);
            }
        } catch (Exception var10) {
            class108.field2738.repaint();
        }
        field1661++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(JB)V", line = 157)
    public final void method555(long arg0, byte arg1) {
        if (arg1 != -26) {
            return;
        }
        field1665++;
        class129 var4 = (class129) this.field1678.method614(arg1 - 43, arg0);
        if (var4 != null) {
            var4.method589(true);
            var4.method1010(-22056);
            this.field1679++;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BJ)V", line = 213)
    public static final void method556(byte arg0, long arg1) {
        field1660++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 != -127) {
            field1671 = false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 231)
    public static final void method557(int arg0, Component arg1) {
        field1657++;
        arg1.removeMouseListener(class90.field2208);
        arg1.removeMouseMotionListener(class90.field2208);
        if (arg0 != 21889) {
            method556((byte) 0, -11L);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(JLwb;I)V", line = 245)
    public final void method558(long arg0, class129 arg1, int arg2) {
        field1663++;
        if (this.field1679 == 0) {
            class129 var5 = this.field1680.method34(126);
            var5.method589(true);
            var5.method1010(-22056);
            if (this.field1664 == var5) {
                class129 var6 = this.field1680.method34(127);
                var6.method589(true);
                var6.method1010(-22056);
            }
        } else {
            this.field1679--;
        }
        if (arg2 != 304) {
            method556((byte) -2, 118L);
        }
        this.field1678.method613(-1, arg0, arg1);
        this.field1680.method36(arg1, 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(JI)Lwb;", line = 278)
    public final class129 method559(long arg0, int arg1) {
        field1658++;
        int var4 = -84 / ((arg1 + 58) / 55);
        class129 var5 = (class129) this.field1678.method614(-124, arg0);
        if (var5 != null) {
            this.field1680.method36(var5, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V", line = 362)
    public class63(int arg0) {
        this.field1677 = arg0;
        this.field1679 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1678 = new class74(var2);
    }
}
