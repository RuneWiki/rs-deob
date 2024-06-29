import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class87 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lub;")
    public static class227 field1502 = class257.method1749(" steht bereits auf Ihrer Freunde)2Liste(Q", 17263);

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1508 = 0;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lub;")
    public static class227 field1509 = class257.method1749("::noclip", 17263);

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[B")
    public static byte[] field1506 = new byte[32896];

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[I")
    public static int[] field1511;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lub;")
    public static class227 field1514;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lub;")
    private static class227 field1513;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lub;")
    public static class227 field1512;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Ln;")
    public static class138 field1505;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lnh;")
    public static class57 field1510;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[B")
    public static final byte[] method520(int arg0, int arg1) {
        field1503++;
        if (arg0 != 255) {
            field1513 = null;
        }
        class148 var2 = (class148) class138.field2364.method1037(99, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class210.method1342(-105, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class148(var3);
            class138.field2364.method1032(arg0 ^ 0xFFFFFC29, var2, (long) arg1);
        }
        return var2.field2583;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method521(byte arg0) {
        field1512 = null;
        field1502 = null;
        if (arg0 <= 43) {
            return;
        }
        field1511 = null;
        field1506 = null;
        field1509 = null;
        field1510 = null;
        field1505 = null;
        field1514 = null;
        field1513 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method522(int arg0) {
        if (arg0 < 22) {
            field1512 = null;
        }
        if (class128.field2260 == null || class43.field716 == null) {
            class43.field716 = new int[256];
            class128.field2260 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class128.field2260[var1] = (int) (Math.sin(var2) * 4096.0D);
                class43.field716[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1504++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Led;B)V")
    public static final void method523(class96 arg0, byte arg1) {
        field1507++;
        class11.method54(28674);
        int var2 = 95 / ((61 - arg1) / 39);
        if (class116.field2129 != null) {
            return;
        }
        if (!class153.field2662) {
            class181.method1158(-125);
        } else if (class50.field885 == 1) {
            int var3 = class25.field425 / 5;
            int var4 = class51.field890 + var3 + 140;
            if (var4 <= class232.field4043 && class232.field4043 <= var4 + 14 && class50.field884 + 4 <= class81.field1403 && class50.field884 + 18 >= class81.field1403) {
                class2.method3(-2450, 0, 0);
                return;
            }
            if (var4 + 15 <= class232.field4043 && class232.field4043 <= var4 + 80 && class81.field1403 >= (class50.field884 + 4) && (class50.field884 + 18) >= class81.field1403) {
                class2.method3(-2450, 1, 0);
                return;
            }
            int var5 = class51.field890 - (-var3 - 250);
            if (class232.field4043 >= var5 && var5 + 14 >= class232.field4043 && class81.field1403 >= (class50.field884 + 4) && (class50.field884 + 18) >= class81.field1403) {
                class2.method3(-2450, 0, 1);
                return;
            }
            if ((var5 + 15) <= class232.field4043 && class232.field4043 <= (var5 + 80) && class81.field1403 >= class50.field884 + 4 && class50.field884 + 18 >= class81.field1403) {
                class2.method3(-2450, 1, 1);
                return;
            }
            int var6 = class51.field890 + var3 + 360;
            if (class232.field4043 >= var6 && (var6 + 14) >= class232.field4043 && class81.field1403 >= class50.field884 + 4 && (class50.field884 + 18) >= class81.field1403) {
                class2.method3(-2450, 0, 2);
                return;
            }
            if ((var6 + 15) <= class232.field4043 && (var6 + 80) >= class232.field4043 && (class50.field884 + 4) <= class81.field1403 && class81.field1403 <= class50.field884 + 18) {
                class2.method3(-2450, 1, 2);
                return;
            }
            int var7 = var3 + class51.field890 + 470;
            if (var7 <= class232.field4043 && var7 + 14 >= class232.field4043 && class81.field1403 >= (class50.field884 + 4) && class81.field1403 <= (class50.field884 + 18)) {
                class2.method3(-2450, 0, 3);
                return;
            }
            if ((var7 + 15) <= class232.field4043 && var7 + 80 >= class232.field4043 && class50.field884 + 4 <= class81.field1403 && class50.field884 + 18 >= class81.field1403) {
                class2.method3(-2450, 1, 3);
                return;
            }
            if (class218.field3671 != -1) {
                class139 var8 = class182.field3104[class218.field3671];
                if (var8.field2408 == class58.field1072) {
                    byte[] var9 = class76.method445((byte) -107, new class227[] { var8.field2412, class123.field2212 }).method1502((byte) 44);
                    class123.field2218 = new String(var9, 0, var9.length);
                    class131.field2286 = var8.field2409;
                    if (class169.field2832 != 0) {
                        class104.field1822 = class131.field2286 + 50000;
                        class177.field2945 = class131.field2286 + 40000;
                        class9.field168 = class177.field2945;
                    }
                    if (class221.field3755 != null) {
                        class221.field3755.field1860 = true;
                        class198.method1268(100, class221.field3755);
                    }
                    return;
                }
                class227 var10 = class200.field3441;
                if (class169.field2832 != 0) {
                    var10 = class76.method445((byte) 30, new class227[] { class248.field4314, class204.method1303(var8.field2409 + 7000, 1) });
                }
                class227 var11 = class76.method445((byte) -75, new class227[] { class258.field4509, var8.field2412, class123.field2212, var10, class221.field3754, class204.method1303(class214.field3612, 1), client.field1428, class204.method1303(class64.field1172, 1), class13.field250, class204.method1303(0, 1), class59.field1084, class204.method1303(class192.field3274, 1), class218.field3660, class204.method1303(class171.field2856, 1) });
                try {
                    arg0.getAppletContext().showDocument(var11.method1523(0), "_self");
                    return;
                } catch (Exception var12) {
                    return;
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1506[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1511 = new int[2];
        field1515 = 0;
        field1514 = class257.method1749("Benutzen", 17263);
        field1513 = class257.method1749("Loading wordpack )2 ", 17263);
        field1512 = field1513;
    }
}
