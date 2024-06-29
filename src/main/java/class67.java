import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public int field1516 = 0;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public int field1527 = 0;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[B")
    public byte[] field1531 = new byte[4096];

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[Z")
    public boolean[] field1515 = new boolean[16];

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[B")
    public byte[] field1526 = new byte[256];

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[[I")
    public int[][] field1536 = new int[6][258];

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[B")
    public byte[] field1528 = new byte[18002];

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[I")
    public int[] field1537 = new int[257];

    @OriginalMember(owner = "client!je", name = "n", descriptor = "[[I")
    public int[][] field1525 = new int[6][258];

    @OriginalMember(owner = "client!je", name = "M", descriptor = "[I")
    public int[] field1549 = new int[256];

    @OriginalMember(owner = "client!je", name = "C", descriptor = "[Z")
    public boolean[] field1540 = new boolean[256];

    @OriginalMember(owner = "client!je", name = "I", descriptor = "[[I")
    public int[][] field1545 = new int[6][258];

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
    public int[] field1519 = new int[6];

    @OriginalMember(owner = "client!je", name = "N", descriptor = "[B")
    public byte[] field1550 = new byte[18002];

    @OriginalMember(owner = "client!je", name = "B", descriptor = "[I")
    public int[] field1539 = new int[16];

    @OriginalMember(owner = "client!je", name = "K", descriptor = "[[B")
    public byte[][] field1547 = new byte[6][258];

    @OriginalMember(owner = "client!je", name = "G", descriptor = "Lr;")
    public static class118 field1543 = class153.method1136(115, "");

    @OriginalMember(owner = "client!je", name = "D", descriptor = "[[[I")
    public static int[][][] field1541 = new int[4][13][13];

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lge;")
    public static class47 field1518 = new class47(100);

    @OriginalMember(owner = "client!je", name = "T", descriptor = "Le;")
    public static class29 field1556 = null;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "[Z")
    public static boolean[] field1555 = new boolean[100];

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Lr;")
    public static class118 field1554 = class153.method1136(93, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
    public static int[] field1553 = new int[128];

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field1557 = 0;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "B")
    public byte field1524;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "J")
    public static long field1551;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "Lff;")
    public static class42 field1563;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "Lgf;")
    public static class48 field1562;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "Z")
    public static boolean field1558;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[B")
    public byte[] field1512;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "[B")
    public byte[] field1546;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "[Lvd;")
    public static class150[] field1560;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method574(int arg0) {
        field1530++;
        if (arg0 > -39) {
            method577((byte) -73);
        }
        for (class10 var1 = (class10) class132.field3011.method889(-30); var1 != null; var1 = (class10) class132.field3011.method884(true)) {
            if (var1.field244 != null) {
                class94.field2239.method765(var1.field244);
                var1.field244 = null;
            }
            if (var1.field231 != null) {
                class94.field2239.method765(var1.field231);
                var1.field231 = null;
            }
        }
        class132.field3011.method888(19014);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIILke;)V")
    public static final void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class74 arg7) {
        if (arg6 != 100) {
            field1553 = null;
        }
        field1532++;
        if (class2.field40) {
            class137.field3094 = 32;
        } else {
            class137.field3094 = 0;
        }
        class2.field40 = false;
        if (class9.field197 != 0) {
            if (arg5 <= arg1 && arg5 + 16 > arg1 && arg3 >= arg0 && arg3 < arg0 + 16) {
                arg7.field1789 -= 4;
                class26.method232((byte) 98, arg7);
            } else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg0 + arg4 - 16 <= arg3 && arg3 < arg0 + arg4) {
                arg7.field1789 += 4;
                class26.method232((byte) 60, arg7);
            } else if (arg1 >= arg5 - class137.field3094 && arg5 + class137.field3094 + 16 > arg1 && arg3 >= arg0 + 16 && arg3 < arg0 + arg4 - 16) {
                int var8 = (arg4 - 32) * arg4 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - var8 - 32;
                int var10 = arg3 - arg0 - var8 / 2 - 16;
                arg7.field1789 = (arg2 - arg4) * var10 / var9;
                class26.method232((byte) 117, arg7);
                class2.field40 = true;
            }
        }
        if (class101.field2315 == 0) {
            return;
        }
        int var11 = arg7.field1779;
        if (arg5 - var11 <= arg1 && arg3 >= arg0 && arg5 + 16 > arg1 && arg0 + arg4 >= arg3) {
            arg7.field1789 += class101.field2315 * 45;
            class26.method232((byte) 60, arg7);
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Color;IILr;)V")
    public static final void method576(Color arg0, int arg1, int arg2, class118 arg3) {
        field1523++;
        try {
            Graphics var4 = class4.field70.getGraphics();
            if (class124.field2836 == null) {
                class124.field2836 = new Font("Helvetica", 1, 13);
                class94.field2237 = class4.field70.getFontMetrics(class124.field2836);
            }
            if (class65.field1491) {
                class65.field1491 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class4.field64, class82.field1981);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class34.field856 == null) {
                    class34.field856 = class4.field70.createImage(304, 34);
                }
                Graphics var5 = class34.field856.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                if (arg2 == -28994) {
                    var5.fillRect(2, 2, arg1 * 3, 30);
                    var5.setColor(Color.black);
                    var5.drawRect(1, 1, 301, 31);
                    var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                    var5.setFont(class124.field2836);
                    var5.setColor(Color.white);
                    arg3.method940((304 - arg3.method924(75, class94.field2237)) / 2, var5, (byte) 121, 22);
                    var4.drawImage(class34.field856, class4.field64 / 2 - 152, class82.field1981 / 2 - 18, null);
                }
            } catch (Exception var8) {
                int var6 = class4.field64 / 2 - 152;
                int var7 = class82.field1981 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg1 * 3 + var6 + 2, var7 - -2, 300 - arg1 * 3, 30);
                var4.setFont(class124.field2836);
                var4.setColor(Color.white);
                arg3.method940((304 - arg3.method924(73, class94.field2237)) / 2 + var6, var4, (byte) 127, var7 + 22);
            }
        } catch (Exception var9) {
            class4.field70.repaint();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method577(byte arg0) {
        field1553 = null;
        field1563 = null;
        field1560 = null;
        if (arg0 != -108) {
            field1554 = null;
        }
        field1554 = null;
        field1541 = null;
        field1518 = null;
        field1562 = null;
        field1555 = null;
        field1543 = null;
    }
}
