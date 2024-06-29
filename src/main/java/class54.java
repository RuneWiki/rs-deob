import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class54 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[B")
    public byte[] field1360 = new byte[256];

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public int field1371 = 0;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "[[I")
    public int[][] field1378 = new int[6][258];

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[Z")
    public boolean[] field1369 = new boolean[256];

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[[I")
    public int[][] field1361 = new int[6][258];

    @OriginalMember(owner = "client!j", name = "G", descriptor = "[[B")
    public byte[][] field1392 = new byte[6][258];

    @OriginalMember(owner = "client!j", name = "D", descriptor = "[B")
    public byte[] field1389 = new byte[18002];

    @OriginalMember(owner = "client!j", name = "C", descriptor = "[I")
    public int[] field1388 = new int[16];

    @OriginalMember(owner = "client!j", name = "m", descriptor = "[I")
    public int[] field1372 = new int[256];

    @OriginalMember(owner = "client!j", name = "R", descriptor = "[[I")
    public int[][] field1403 = new int[6][258];

    @OriginalMember(owner = "client!j", name = "A", descriptor = "[B")
    public byte[] field1386 = new byte[18002];

    @OriginalMember(owner = "client!j", name = "T", descriptor = "[Z")
    public boolean[] field1405 = new boolean[16];

    @OriginalMember(owner = "client!j", name = "F", descriptor = "[B")
    public byte[] field1391 = new byte[4096];

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "[I")
    public int[] field1402 = new int[6];

    @OriginalMember(owner = "client!j", name = "o", descriptor = "[I")
    public int[] field1374 = new int[257];

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public int field1406 = 0;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field1380 = 255;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1366 = 0;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "Lv;")
    public static class122 field1395 = class55.method425(-75, "Geben Sie Ihren Benutzernamen und Passwort ein)3");

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Lv;")
    public static class122 field1399 = class55.method425(-79, "Ung\u001c1ltige Session)2ID)3");

    @OriginalMember(owner = "client!j", name = "S", descriptor = "Lv;")
    public static class122 field1404 = class55.method425(-115, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!j", name = "I", descriptor = "[I")
    public static int[] field1394 = new int[128];

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Ljb;")
    public static class56 field1383 = new class56(64);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "[[[B")
    public static byte[][][] field1408 = new byte[4][104][104];

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Lfc;")
    public static class34 field1409 = new class34();

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "[I")
    public static int[] field1412 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!j", name = "v", descriptor = "B")
    public byte field1381;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "Lrd;")
    public static class106 field1396;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "Lkb;")
    public static class62 field1397;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "Lmb;")
    public static class74 field1410;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1411;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
    public static boolean field1368;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[B")
    public byte[] field1367;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "[B")
    public byte[] field1393;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 25)
    public static void method414(int arg0) {
        field1397 = null;
        if (arg0 > -4) {
            method415(-76, null, -60);
        }
        field1409 = null;
        field1395 = null;
        field1383 = null;
        field1408 = null;
        field1411 = null;
        field1412 = null;
        field1394 = null;
        field1410 = null;
        field1399 = null;
        field1396 = null;
        field1404 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILmb;I)Z", line = 53)
    public static final boolean method415(int arg0, class74 arg1, int arg2) {
        field1385++;
        byte[] var3 = arg1.method619(arg0, 103);
        if (var3 == null) {
            return false;
        }
        class37.method328(var3, 4);
        if (arg2 != 300) {
            method417((byte) -22, -72, -120, null, -5);
        }
        return true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)I", line = 86)
    public static final int method416(int arg0, int arg1, byte arg2) {
        field1376++;
        int var3 = 114 / ((-arg2 - 4) / 39);
        if (arg1 > arg0) {
            int var4 = arg0;
            arg0 = arg1;
            arg1 = var4;
        }
        while (arg1 != 0) {
            int var5 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var5;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIILdb;I)V", line = 191)
    public static final void method417(byte arg0, int arg1, int arg2, class21 arg3, int arg4) {
        field1390++;
        if (class51.field1313 >= 400) {
            return;
        }
        if (arg3.field554 != null) {
            arg3 = arg3.method227((byte) 121);
        }
        if (arg3 == null || !arg3.field559) {
            return;
        }
        class122 var5 = arg3.field567;
        if (arg3.field545 != 0) {
            var5 = class59.method454(new class122[] { var5, class28.method271(class70.field1828.field1455, arg3.field545, false), class114.field2801, class64.field1659, class119.method914(arg3.field545, 10), class107.field2641 }, arg0 ^ 0xFFFFEB8F);
        }
        if (arg0 != -73) {
            return;
        }
        if (class122.field2990 == 1) {
            class67.field1725++;
            class108.method839(class100.field2505, arg4, 13, arg1, class59.method454(new class122[] { class61.field1568, class21.field583, var5 }, 5176), arg2, 38);
        } else if (class91.field2334 != 1) {
            class122[] var6 = arg3.field544;
            class32.field773++;
            if (class90.field2324) {
                var6 = class90.method720((byte) 117, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method938(-8186, class115.field2821)) {
                        class38.field999++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 19;
                        }
                        if (var7 == 1) {
                            var8 = 5;
                        }
                        if (var7 == 2) {
                            var8 = 48;
                        }
                        if (var7 == 3) {
                            var8 = 39;
                        }
                        if (var7 == 4) {
                            var8 = 3;
                        }
                        class108.method839(var6[var7], arg4, var8, arg1, class59.method454(new class122[] { class50.field1276, var5 }, arg0 ^ 0xFFFFEB8F), arg2, 98);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method938(-8186, class115.field2821)) {
                        class14.field363++;
                        int var10 = 0;
                        short var11 = 0;
                        if (class70.field1828.field1455 < arg3.field545) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 19;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 5;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 48;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 39;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 3;
                        }
                        class108.method839(var6[var9], arg4, var10, arg1, class59.method454(new class122[] { class50.field1276, var5 }, 5176), arg2, -2);
                    }
                }
            }
            class108.method839(class119.field2899, arg4, 1005, arg1, class59.method454(new class122[] { class50.field1276, var5 }, 5176), arg2, -121);
            return;
        } else if ((class32.field778 & 0x2) == 2) {
            class120.field2913++;
            class108.method839(class21.field557, arg4, 44, arg1, class59.method454(new class122[] { class70.field1825, class21.field583, var5 }, 5176), arg2, 2);
            return;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILv;Ljava/awt/Color;Z)V", line = 337)
    public static final void method418(int arg0, class122 arg1, Color arg2, boolean arg3) {
        field1363++;
        try {
            Graphics var4 = field1411.getGraphics();
            if (class23.field630 == null) {
                class23.field630 = new Font("Helvetica", 1, 13);
                class107.field2640 = field1411.getFontMetrics(class23.field630);
            }
            if (class81.field2121) {
                class81.field2121 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class49.field1254, class30.field767);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class32.field792 == null) {
                    class32.field792 = field1411.createImage(304, 34);
                }
                Graphics var5 = class32.field792.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class23.field630);
                var5.setColor(Color.white);
                if (!arg3) {
                    field1379 = 78;
                }
                arg1.method966((304 - arg1.method930(!arg3, class107.field2640)) / 2, 22, 0, var5);
                var4.drawImage(class32.field792, class49.field1254 / 2 - 152, class30.field767 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class49.field1254 / 2 - 152;
                int var7 = class30.field767 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class23.field630);
                var4.setColor(Color.white);
                arg1.method966((304 - arg1.method930(false, class107.field2640)) / 2 + var6, var7 - -22, 0, var4);
            }
        } catch (Exception var9) {
            field1411.repaint();
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lfe;B)Z", line = 400)
    public static final boolean method419(class36 arg0, byte arg1) {
        field1384++;
        int var2 = arg0.field932;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class122.field2927++;
            class4.field115++;
            class108.method839(class19.field516, 0, 36, 0, class59.method454(new class122[] { class89.field2270, class75.field2020[var2] }, 5176), 0, -127);
            class108.method839(class2.field65, 0, 37, 0, class59.method454(new class122[] { class89.field2270, class75.field2020[var2] }, arg1 ^ 0x144C), 0, 69);
            return true;
        }
        if (arg1 != 116) {
            field1380 = -42;
        }
        if (var2 >= 401 && var2 <= 500) {
            class93.field2395++;
            class108.method839(class19.field516, 0, 6, 0, class59.method454(new class122[] { class89.field2270, arg0.field901 }, 5176), 0, -128);
            return true;
        } else {
            return false;
        }
    }
}
