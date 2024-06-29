import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class405 extends class472 {

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "[Z")
    public static boolean[] field5988 = new boolean[200];

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "Lpn;")
    public static class49 field5983 = new class49(70, 18);

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!hu", name = "O", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!hu", name = "R", descriptor = "Lum;")
    public static class83 field5996;

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "Ljava/lang/String;")
    public String field5992;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "[C")
    public char[] field5985;

    @OriginalMember(owner = "client!hu", name = "P", descriptor = "[C")
    public char[] field5994;

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "[I")
    public int[] field5979;

    @OriginalMember(owner = "client!hu", name = "M", descriptor = "[I")
    public int[] field5991;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "[[B")
    public static byte[][] field5981;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V", line = 6)
    public final void method2546(int arg0) {
        if (this.field5979 != null) {
            for (int var2 = 0; var2 < this.field5979.length; var2++) {
                this.field5979[var2] = class19.method118(this.field5979[var2], 32768);
            }
        }
        field5986++;
        if (this.field5991 != null) {
            for (int var3 = 0; var3 < this.field5991.length; var3++) {
                this.field5991[var3] = class19.method118(this.field5991[var3], 32768);
            }
        }
        if (arg0 != 304) {
            method2549((byte) 89, null, 44, null, null, null, true);
        }
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)V", line = 36)
    public static void method2547(byte arg0) {
        field5988 = null;
        field5983 = null;
        field5981 = null;
        if (arg0 != 90) {
            field5983 = null;
        }
        field5996 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII)V", line = 53)
    public static final void method2548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class103 var7 = (class103) class470.field6904.method1076((byte) 74); var7 != null; var7 = (class103) class470.field6904.method1077(-1)) {
            if (var7.field1598 <= class446.field6625) {
                var7.method2069(-11);
            } else {
                class125.method927((var7.field1590 << 7) + 64, var7.field1587, arg0 >> 1, arg2, arg6 >> 1, var7.field1589 * 2, -54, arg1, (var7.field1595 << 7) + 64);
                class441.field6573.method2047(arg3 + class370.field5458[0], var7.field1600, class370.field5458[1] + arg5, var7.field1599 | 0xFF000000, -1, 0);
            }
        }
        if (arg4 <= 66) {
            method2547((byte) -99);
        }
        field5993++;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLjava/awt/Color;ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Z)V", line = 84)
    public static final void method2549(byte arg0, Color arg1, int arg2, String arg3, Color arg4, Color arg5, boolean arg6) {
        field5987++;
        try {
            Graphics var7 = class342.field5114.getGraphics();
            if (class443.field6591 == null) {
                class443.field6591 = new Font("Helvetica", 1, 13);
            }
            if (arg6) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class169.field2570, class360.field5313);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class124.field1855 == null) {
                    class124.field1855 = class342.field5114.createImage(304, 34);
                }
                Graphics var8 = class124.field1855.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg1);
                var8.fillRect(2, 2, arg2 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg2 * 3 + 2, 2, 300 - (arg2 * 3), 30);
                var8.setFont(class443.field6591);
                var8.setColor(arg4);
                var8.drawString(arg3, (304 - (arg3.length() * 6)) / 2, 22);
                var7.drawImage(class124.field1855, class169.field2570 / 2 - 152, class360.field5313 / 2 - 18, null);
            } catch (Exception var12) {
                int var9 = class169.field2570 / 2 - 152;
                int var10 = class360.field5313 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var9 + 2, var10 + 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg2 * 3 + (var9 + 2), var10 + 2, 300 - arg2 * 3, 30);
                var7.setFont(class443.field6591);
                var7.setColor(arg4);
                var7.drawString(arg3, var9 + ((304 - (arg3.length() * 6)) / 2), var10 + 22);
            }
            int var11 = 36 / (-arg0 / 61);
            if (class234.field3516 != null) {
                var7.setFont(class443.field6591);
                var7.setColor(arg4);
                var7.drawString(class234.field3516, class169.field2570 / 2 - class234.field3516.length() * 6 / 2, class360.field5313 / 2 + -26);
            }
        } catch (Exception var13) {
            class342.field5114.repaint();
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZI)V", line = 164)
    public static final void method2550(boolean arg0, int arg1) {
        if (class541.field7922 != null) {
            class541.field7922.method2155(false);
            class541.field7922 = null;
        }
        field5995++;
        class114.field1750 = 0;
        class64.method433(-73);
        class351.method2252();
        for (int var2 = 0; var2 < 4; var2++) {
            class463.field6857[var2].method2568((byte) -123);
        }
        class20.method126(false, -74);
        System.gc();
        class93.method792(2, 0);
        class326.field4938 = false;
        class235.field3548 = -1;
        class297.method1977(false, true);
        class23.field273 = 0;
        class422.field6201 = 0;
        class339.field5086 = 0;
        class91.field1475 = 0;
        class76.field1286 = 0;
        class50.field769 = 0;
        for (int var3 = 0; var3 < class292.field4519.length; var3++) {
            class292.field4519[var3] = null;
        }
        class80.method707(50);
        int var4 = 0;
        int var5 = 17 % ((-arg1 - 12) / 46);
        while (var4 < 2048) {
            class530.field7747[var4] = null;
            var4++;
        }
        class231.field3482 = 0;
        class366.field5398.method360(-27);
        class412.field6081 = 0;
        class249.field3827.method360(-117);
        class432.method2686(2);
        class422.field6196 = 0;
        class288.field4476.method2341((byte) -35);
        class384.method2448(93);
        class390.method2465(8031);
        class202.field3124 = 0L;
        class524.field7690 = null;
        if (arg0) {
            class376.method2400(11, (byte) 107);
            return;
        }
        class376.method2400(2, (byte) 107);
        try {
            class220.method1510(102, "loggedout", class122.field1844.field1062);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(CB)I", line = 242)
    public final int method2551(char arg0, byte arg1) {
        field5990++;
        if (this.field5979 == null) {
            return -1;
        }
        if (arg1 != 21) {
            this.method2554(117, null, -121);
        }
        for (int var3 = 0; var3 < this.field5979.length; var3++) {
            if (this.field5994[var3] == arg0) {
                return this.field5979[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILfh;)V", line = 268)
    public final void method2552(int arg0, class194 arg1) {
        while (true) {
            int var3 = arg1.method1337((byte) 9);
            if (var3 == 0) {
                if (arg0 != -6203) {
                    this.method2553((byte) 92, '\u001e');
                }
                field5982++;
                return;
            }
            this.method2554(115, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BC)I", line = 300)
    public final int method2553(byte arg0, char arg1) {
        field5989++;
        if (this.field5991 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5991.length; var3++) {
            if (this.field5985[var3] == arg1) {
                return this.field5991[var3];
            }
        }
        return arg0 == 85 ? -1 : 126;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILfh;I)V", line = 326)
    private final void method2554(int arg0, class194 arg1, int arg2) {
        field5980++;
        if (arg2 == 1) {
            this.field5992 = arg1.method1347(-88);
        } else if (arg2 == 2) {
            int var7 = arg1.method1337((byte) -126);
            this.field5985 = new char[var7];
            this.field5991 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5991[var8] = arg1.method1396(-112);
                byte var9 = arg1.method1398(26);
                this.field5985[var8] = var9 == 0 ? 0 : class515.method3052((byte) -89, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1337((byte) -124);
            this.field5979 = new int[var4];
            this.field5994 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5979[var5] = arg1.method1396(-83);
                byte var6 = arg1.method1398(124);
                this.field5994[var5] = var6 == 0 ? 0 : class515.method3052((byte) -106, var6);
            }
        }
        if (arg0 < 100) {
            this.field5985 = null;
        }
    }
}
