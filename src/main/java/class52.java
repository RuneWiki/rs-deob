import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 extends class99 {

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "Lpd;")
    public static class94 field1293 = class28.method249(122, "title)3jpg");

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "Lpd;")
    public static class94 field1295 = class28.method249(57, "Welt");

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "Z")
    public static boolean field1294 = false;

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "I")
    public static int field1303 = 0;

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "Lld;")
    public static class70 field1304 = new class70();

    @OriginalMember(owner = "client!id", name = "tb", descriptor = "Lpd;")
    private static class94 field1308 = class28.method249(33, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!id", name = "wb", descriptor = "[I")
    public static int[] field1311 = new int[50];

    @OriginalMember(owner = "client!id", name = "ub", descriptor = "Lpd;")
    public static class94 field1309 = class28.method249(-77, "backright1");

    @OriginalMember(owner = "client!id", name = "vb", descriptor = "Lpd;")
    public static class94 field1310 = field1308;

    @OriginalMember(owner = "client!id", name = "xb", descriptor = "Lpd;")
    private static class94 field1312 = class28.method249(120, "Add friend");

    @OriginalMember(owner = "client!id", name = "sb", descriptor = "Lpd;")
    public static class94 field1307 = field1312;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!id", name = "yb", descriptor = "J")
    public static long field1313;

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "Lla;")
    public static class66 field1305;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Luc;II)V", line = 8)
    private final void method406(class122 arg0, int arg1, int arg2) {
        if (arg1 < 123) {
            return;
        }
        field1300++;
        if (arg2 == 1) {
            this.field1292 = arg0.method938((byte) -96);
            this.field1297 = arg0.method943(-1025);
            this.field1296 = arg0.method943(-1025);
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(Z)V", line = 36)
    public static void method407(boolean arg0) {
        field1304 = null;
        field1309 = null;
        field1305 = null;
        field1295 = null;
        field1312 = null;
        field1293 = null;
        field1311 = null;
        field1307 = null;
        if (arg0) {
            field1308 = null;
            field1310 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Luc;I)V", line = 59)
    public final void method408(class122 arg0, int arg1) {
        field1299++;
        while (true) {
            int var3 = arg0.method943(-1025);
            if (var3 == 0) {
                if (arg1 == 90) {
                    return;
                } else {
                    method412(-43, (byte) -85);
                    return;
                }
            }
            this.method406(arg0, 125, var3);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BZ)V", line = 82)
    public static final void method409(byte arg0, boolean arg1) {
        field1302++;
        class77.field1898++;
        if (class77.field1898 < 50 && !arg1 || arg0 >= -90) {
            return;
        }
        class77.field1898 = 0;
        if (class67.field1651 || class1.field47 == null) {
            return;
        }
        class107.field2670.method326(225, -105);
        class74.field1819++;
        try {
            class1.field47.method639(class107.field2670.field3074, 1885, class107.field2670.field3047, 0);
            class107.field2670.field3047 = 0;
        } catch (IOException var2) {
            class67.field1651 = true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 111)
    public static final void method410(int arg0, Component arg1) {
        if (arg0 != 92) {
            method410(-54, null);
        }
        field1301++;
        arg1.addMouseListener(class81.field2076);
        arg1.addMouseMotionListener(class81.field2076);
        arg1.addFocusListener(class81.field2076);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILc;Lc;)V", line = 135)
    public static final void method411(int arg0, class16 arg1, class16 arg2) {
        field1291++;
        class86.field2187.method496(55);
        if (arg0 != 100) {
            return;
        }
        if (class115.field2922 == 0 || class115.field2922 == 5) {
            byte var3 = 20;
            arg1.method120(class120.field3012, 180, 74 - var3, 16777215);
            int var4 = 82 - var3;
            class130.method1032(28, var4, 304, 34, 9179409);
            class130.method1032(29, var4 + 1, 302, 32, 0);
            class130.method1028(30, var4 + 2, class46.field1141 * 3, 30, 9179409);
            class130.method1028(class46.field1141 * 3 + 30, var4 + 2, 300 - class46.field1141 * 3, 30, 0);
            arg1.method120(client.field503, 180, 105 - var3, 16777215);
        }
        if (class115.field2922 == 20) {
            class110.field2695.method33(0, 0);
            byte var5 = 40;
            arg1.method116(client.field484, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg1.method116(client.field492, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg1.method116(client.field485, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg1.method103(class4.method20(new class94[] { class99.field2521, client.field499 }, true), 90, var22, 16777215, true);
            int var23 = var22 + 15;
            arg1.method103(class4.method20(new class94[] { class17.field429, client.field491.method704(102) }, true), 92, var23, 16777215, true);
            int var24 = var23 + 15;
        }
        if (class115.field2922 == 10) {
            class110.field2695.method33(0, 0);
            if (class37.field969 == 0) {
                byte var13 = 80;
                arg1.method116(class6.field121, 180, var13, 16776960, true);
                int var35 = var13 + 30;
                byte var14 = 100;
                byte var15 = 120;
                class113.field2891.method33(var14 - 73, var15 + -20);
                arg1.method121(class50.field1239, var14 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class113.field2891.method33(var16 - 73, var15 + -20);
                arg1.method121(class70.field1708, var16 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class37.field969 == 2) {
                byte var6 = 100;
                byte var7 = 40;
                short var8 = 150;
                arg1.method116(client.field484, 180, var7, 16776960, true);
                int var25 = var7 + 15;
                arg1.method116(client.field492, 180, var25, 16776960, true);
                int var26 = var25 + 15;
                arg1.method116(client.field485, 180, var26, 16776960, true);
                int var27 = var26 + 15;
                int var28 = var27 + 10;
                arg1.method103(class4.method20(new class94[] { class99.field2521, client.field499, class26.field699 % 40 < 20 & class72.field1755 == 0 ? class101.field2553 : client.field473 }, true), 90, var28, 16777215, true);
                int var29 = var28 + 15;
                arg1.method103(class4.method20(new class94[] { class17.field429, client.field491.method704(102), class26.field699 % 40 < 20 & class72.field1755 == 1 ? class101.field2553 : client.field473 }, true), 92, var29, 16777215, true);
                int var30 = var29 + 15;
                class113.field2891.method33(var6 - 73, var8 + -20);
                arg1.method116(class136.field3338, var6, var8 + 5, 16777215, true);
                short var9 = 260;
                class113.field2891.method33(var9 - 73, var8 + -20);
                arg1.method116(class94.field2430, var9, var8 + 5, 16777215, true);
            } else if (class37.field969 == 3) {
                arg1.method116(class111.field2808, 180, 40, 16776960, true);
                byte var10 = 65;
                short var11 = 180;
                arg1.method116(class87.field2215, 180, var10, 16777215, true);
                int var31 = var10 + 15;
                arg1.method116(class66.field1617, 180, var31, 16777215, true);
                int var32 = var31 + 15;
                short var12 = 150;
                arg1.method116(class7.field130, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg1.method116(class30.field859, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                class113.field2891.method33(var11 - 73, var12 + -20);
                arg1.method116(class94.field2430, var11, var12 + 5, 16777215, true);
            }
        }
        class27.method243((byte) -13);
        try {
            Graphics var17 = class128.field3218.getGraphics();
            class86.field2187.method498(171, 202, (byte) -12, var17);
            class9.field241.method498(0, 0, (byte) -12, var17);
            class73.field1790.method498(0, 637, (byte) -12, var17);
            if (class9.field249) {
                class9.field249 = false;
                class69.field1671.method498(0, 128, (byte) -12, var17);
                class1.field22.method498(371, 202, (byte) -12, var17);
                class128.field3213.method498(265, 0, (byte) -12, var17);
                class40.field1024.method498(265, 562, (byte) -12, var17);
                class98.field2483.method498(171, 128, (byte) -12, var17);
                class134.field3304.method498(171, 562, (byte) -12, var17);
            }
        } catch (Exception var18) {
            class128.field3218.repaint();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V", line = 272)
    public static final void method412(int arg0, byte arg1) {
        if (arg1 != -22) {
            method410(-94, null);
        }
        field1298++;
        class79.method586(arg0, (byte) -86);
    }
}
