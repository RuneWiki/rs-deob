import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class118 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2758 = 0;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lrd;")
    public static class114 field2764 = class84.method656("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", (byte) 121);

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lrd;")
    public static class114 field2765 = class84.method656("Untersuchen", (byte) 116);

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lrd;")
    public static class114 field2762 = class84.method656(" x", (byte) 126);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lrd;")
    public static class114 field2770 = class84.method656("Lade Spiel)2Fenster )2 ", (byte) 124);

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lrd;")
    public static class114 field2763 = class84.method656("Abbrechen", (byte) 114);

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lrd;")
    public static class114 field2760 = class84.method656("leuchten1:", (byte) 120);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2757 = 0;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[I")
    public static int[] field2771 = new int[2048];

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
    public static int[] field2767 = new int[500];

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lmd;")
    public static class84 field2761 = new class84();

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lrd;")
    private static class114 field2776 = class84.method656("flash2:", (byte) 119);

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Lrd;")
    public static class114 field2777 = field2776;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lrd;")
    public static class114 field2774 = class84.method656("gelb:", (byte) 117);

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lva;")
    public static class135 field2775;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Ljd;")
    public static class66 field2773;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
    public static int[] field2769;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method915(int arg0) {
        if (arg0 != -1) {
            field2761 = null;
        }
        field2768++;
        class132.field3197 = new class101(32);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public abstract void method176(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public abstract void method181(byte arg0);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)Z")
    public static final boolean method916(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field2770 = null;
        }
        field2772++;
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method917(int arg0) {
        field2764 = null;
        field2761 = null;
        field2769 = null;
        field2773 = null;
        field2774 = null;
        field2776 = null;
        field2770 = null;
        field2767 = null;
        field2765 = null;
        field2777 = null;
        field2760 = null;
        if (arg0 == -8635) {
            field2771 = null;
            field2775 = null;
            field2763 = null;
            field2762 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public abstract void method169(int arg0);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method918(boolean arg0) {
        client.method150(class34.field671, 0);
        field2759++;
        if (class56.field1188 != -1) {
            client.method150(class56.field1188, 0);
        }
        class135.field3289 = 0;
        if (!arg0) {
            method917(87);
        }
        class143.field3402.method528(-1926);
        class26.field527 = class134.method1103(class26.field527);
        class59.method425();
        class144.method1147(0, 503, 765, 0, false, 0, class34.field671);
        if (class56.field1188 != -1) {
            class144.method1147(0, 503, 765, 0, false, 0, class56.field1188);
        }
        if (class116.field2714) {
            class24.method171(-7);
        } else {
            class67.method536(arg0);
            class117.method905(-24413);
        }
        try {
            Graphics var1 = class114.field2678.getGraphics();
            class143.field3402.method526(0, 0, 0, var1);
        } catch (Exception var2) {
            class114.field2678.repaint();
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    public static final void method919(int arg0) {
        field2766++;
        if (class26.field532 == 0) {
            return;
        }
        class45 var1 = class5.field54;
        int var2 = 0;
        if (class79.field1805 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class144.field3425[var3] != null) {
                int var4 = class28.field557[var3];
                class114 var5 = class28.field563[var3];
                byte var6 = 0;
                if (var5 != null && var5.method864(27, class50.field1035)) {
                    var5 = var5.method866(false, 5);
                    var6 = 1;
                }
                if (var5 != null && var5.method864(27, class79.field1788)) {
                    var5 = var5.method866(false, 5);
                    var6 = 2;
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class130.field3149 == 0 || class130.field3149 == 1 && class24.method175((byte) 32, var5))) {
                    int var7 = 329 - var2 * 13;
                    var2++;
                    byte var8 = 4;
                    var1.method333(class70.field1537, var8, var7, 0);
                    var1.method333(class70.field1537, var8, var7 - 1, 65535);
                    int var9 = var8 + var1.method326(class70.field1537);
                    int var10 = var9 + var1.method327(32);
                    if (var6 == 1) {
                        class109.field2528[0].method722(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class109.field2528[1].method722(var10, var7 - 12);
                        var10 += 14;
                    }
                    var1.method333(class101.method786((byte) 127, new class114[] { var5, class137.field3320, class144.field3425[var3] }), var10, var7, 0);
                    var1.method333(class101.method786((byte) 125, new class114[] { var5, class137.field3320, class144.field3425[var3] }), var10, var7 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class130.field3149 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method333(class144.field3425[var3], 4, var11, 0);
                    var1.method333(class144.field3425[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class130.field3149 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method333(class101.method786((byte) 127, new class114[] { class20.field366, class141.field3362, var5, class137.field3320, class144.field3425[var3] }), 4, var12, 0);
                    var2++;
                    var1.method333(class101.method786((byte) 125, new class114[] { class20.field366, class141.field3362, var5, class137.field3320, class144.field3425[var3] }), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0 != -12) {
            method919(9);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIB[B)V")
    public abstract void method178(boolean arg0, int arg1, byte arg2, byte[] arg3);

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
    public abstract void method172(int arg0);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public abstract void method167(int arg0, int arg1);
}
