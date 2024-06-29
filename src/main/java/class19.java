import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class19 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lpd;")
    public static class94 field511 = class28.method249(-95, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lpd;")
    public static class94 field507 = class28.method249(-69, "Versteckt");

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lpd;")
    public static class94 field518 = class28.method249(-49, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field506 = -1;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lpd;")
    public static class94 field508 = class28.method249(28, "Verbindung mit Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
    public static int[] field514 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lpd;")
    public static class94 field512 = class28.method249(-81, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lpd;")
    public static class94 field523 = class28.method249(29, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lpd;")
    private static class94 field525 = class28.method249(-50, " has logged out)3");

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lpd;")
    public static class94 field521 = class28.method249(-123, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lpd;")
    public static class94 field513 = class28.method249(-51, "Chat panel redrawn");

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lpd;")
    public static class94 field526 = null;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lpd;")
    public static class94 field510 = field525;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Lpd;")
    public static class94 field527 = class28.method249(25, "::hiddenbuttontest");

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 4)
    public static final void method145(byte arg0) {
        while (true) {
            if (class99.field2502.method322(8, class95.field2443) >= 27) {
                int var1 = class99.field2502.method319(15, 8);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class28.field803[var1] == null) {
                        var2 = true;
                        class28.field803[var1] = new class80();
                    }
                    class80 var3 = class28.field803[var1];
                    class95.field2442[class115.field2906++] = var1;
                    var3.field163 = class26.field699;
                    int var4 = class33.field920[class99.field2502.method319(3, arg0)];
                    if (var2) {
                        var3.field187 = var4;
                    }
                    int var5 = class99.field2502.method319(5, arg0);
                    var3.field2037 = class40.method301(class99.field2502.method319(13, 8), (byte) 16);
                    int var6 = class99.field2502.method319(1, 8);
                    int var7 = class99.field2502.method319(1, 8);
                    if (var7 == 1) {
                        class81.field2060[class66.field1613++] = var1;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var8 = class99.field2502.method319(5, 8);
                    var3.field209 = var3.field2037.field2867;
                    var3.field229 = var3.field2037.field2856;
                    var3.field193 = var3.field2037.field2847;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field201 = var3.field2037.field2883;
                    var3.field158 = var3.field2037.field2889;
                    var3.field160 = var3.field2037.field2882;
                    var3.field221 = var3.field2037.field2857;
                    var3.field207 = var3.field2037.field2854;
                    var3.field179 = var3.field2037.field2869;
                    if (var3.field221 == 0) {
                        var3.field187 = 0;
                    }
                    var3.method46(var6 == 1, class80.field2044.field219[0] + var8, 0, class80.field2044.field165[0] + var5);
                    continue;
                }
            }
            if (arg0 != 8) {
                field518 = null;
            }
            field517++;
            class99.field2502.method327(7);
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 83)
    public static void method146(int arg0) {
        field511 = null;
        field512 = null;
        field518 = null;
        if (arg0 != 15) {
            return;
        }
        field507 = null;
        field526 = null;
        field525 = null;
        field510 = null;
        field521 = null;
        field527 = null;
        field508 = null;
        field513 = null;
        field523 = null;
        field514 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V", line = 141)
    public static final void method147(byte arg0) {
        class25.field691 = 0;
        class95.field2443 = 0;
        class107.field2670.field3047 = 0;
        class99.field2502.field3047 = 0;
        class62.field1516 = false;
        class12.field312 = 0;
        class13.field320 = -1;
        class97.field2478 = 0;
        class14.field355 = 0;
        class90.field2335 = -1;
        field509++;
        class90.field2336 = -1;
        class76.field1841 = 0;
        class90.field2338 = -1;
        for (int var1 = 0; var1 < class85.field2138.length; var1++) {
            if (class85.field2138[var1] != null) {
                class85.field2138[var1].field205 = -1;
            }
        }
        if (arg0 != -18) {
            method149(true);
        }
        for (int var2 = 0; var2 < class28.field803.length; var2++) {
            if (class28.field803[var2] != null) {
                class28.field803[var2].field205 = -1;
            }
        }
        class6.method37(arg0 ^ 0xFFFFFF91);
        class1.method6(false, 30);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)I", line = 188)
    public static final int method148(int arg0, int arg1, byte arg2) {
        long var3 = (long) ((arg0 << 16) + arg1);
        int var5 = 121 % ((arg2 - 71) / 49);
        field519++;
        return class27.field708 != null && class27.field708.field3345 == var3 ? class119.field2971.field3047 * 99 / (class119.field2971.field3074.length - class27.field708.field140) + 1 : 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 226)
    public static final void method149(boolean arg0) {
        try {
            Graphics var1 = class128.field3218.getGraphics();
            if (arg0) {
                return;
            }
            class92.field2360.method498(205, 553, (byte) -12, var1);
        } catch (Exception var2) {
            class128.field3218.repaint();
        }
        field515++;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V", line = 260)
    public static final void method150(byte arg0) {
        field516++;
        if (arg0 == -30 && class62.field1518 != null) {
            class62.field1518.method490();
            class62.field1518 = null;
        }
    }
}
