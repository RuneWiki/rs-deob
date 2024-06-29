import java.awt.Component;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lad;")
    private static class5 field346 = class88.method674("level)2", -101);

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lad;")
    private static class5 field360 = class88.method674("No reply from loginserver)3", 53);

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lad;")
    public static class5 field357 = class88.method674("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3", -101);

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Lad;")
    private static class5 field367 = class88.method674("wishes to trade with you)3", 98);

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[[[B")
    public static byte[][][] field371 = new byte[4][104][104];

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "Lad;")
    public static class5 field374 = class88.method674("@gr2@", 127);

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field348 = 0;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lad;")
    public static class5 field351 = class88.method674("Willkommen auf RuneScape", 122);

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Lad;")
    public static class5 field366 = field346;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "Lad;")
    public static class5 field376 = field367;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lad;")
    public static class5 field358 = class88.method674("::noclip", -82);

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
    public static boolean field370 = false;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Lad;")
    public static class5 field375 = field360;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Z")
    public static boolean field378 = false;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Lad;")
    public static class5 field377 = class88.method674("Nehmen", 16);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "J")
    public long field363;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Lrd;")
    public static class106 field369;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lsb;")
    public static class110 field359;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lsb;")
    public static class110 field361;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lub;")
    public static class122 field355;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lbe;")
    public class12 field349;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "Lbe;")
    public class12 field372;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field353;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Z", line = 11)
    public final boolean method110(boolean arg0) {
        field352++;
        if (arg0) {
            return true;
        } else {
            return this.field349 != null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Z", line = 38)
    public static final boolean method111(int arg0) {
        field347++;
        int var1 = -54 / ((-arg0 - 84) / 37);
        return class8.field275 != null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/awt/Component;II)Lsb;", line = 52)
    public static final class110 method112(byte arg0, Component arg1, int arg2, int arg3) {
        field356++;
        try {
            Class var4 = Class.forName("f");
            if (arg0 != -50) {
                method115(null, true);
            }
            class110 var5 = (class110) var4.getDeclaredConstructor().newInstance();
            var5.method254(arg3, true, arg2, arg1);
            return var5;
        } catch (Throwable var7) {
            class83 var6 = new class83();
            var6.method254(arg3, true, arg2, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 77)
    public static void method113(byte arg0) {
        field360 = null;
        field367 = null;
        field359 = null;
        field366 = null;
        field377 = null;
        field376 = null;
        field355 = null;
        field369 = null;
        if (arg0 != -102) {
            return;
        }
        field361 = null;
        field351 = null;
        field346 = null;
        field375 = null;
        field353 = null;
        field358 = null;
        field357 = null;
        field374 = null;
        field371 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 105)
    public final void method114(int arg0) {
        field368++;
        if (this.field349 == null) {
            return;
        }
        this.field349.field372 = this.field372;
        if (arg0 == -3789) {
            this.field372.field349 = this.field349;
            this.field349 = null;
            this.field372 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 135)
    public static final void method115(Component arg0, boolean arg1) {
        arg0.addMouseListener(class116.field2860);
        arg0.addMouseMotionListener(class116.field2860);
        field365++;
        arg0.addFocusListener(class116.field2860);
        if (!arg1) {
            method113((byte) -82);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 165)
    public static final void method116(int arg0) {
        field350++;
        while (class36.field907.method206(arg0 - 22886, class75.field1804) >= 11) {
            int var1 = class36.field907.method207((byte) 80, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class7.field251[var1] == null) {
                class7.field251[var1] = new class112();
                if (class87.field2051[var1] != null) {
                    class7.field251[var1].method894(class87.field2051[var1], 18722);
                }
                var2 = true;
            }
            class105.field2577[field348++] = var1;
            class112 var3 = class7.field251[var1];
            var3.field113 = class69.field1636;
            int var4 = class36.field907.method207((byte) 80, 1);
            int var5 = class36.field907.method207((byte) 80, 5);
            int var6 = class109.field2744[class36.field907.method207((byte) 80, 3)];
            if (var2) {
                var3.field51 = var6;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class36.field907.method207((byte) 80, 5);
            int var8 = class36.field907.method207((byte) 80, 1);
            if (var8 == 1) {
                class13.field380[class109.field2727++] = var1;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method24(class82.field1932.field49[0] + var7, (byte) -65, var4 == 1, class82.field1932.field89[0] + var5);
        }
        class36.field907.method212(true);
        if (arg0 != 22894) {
            field351 = null;
        }
    }
}
