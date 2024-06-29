import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lgd;")
    public static class40 field271 = class14.method90(false, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lgd;")
    private static class40 field270 = class14.method90(false, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field273 = 0;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lgd;")
    public static class40 field284 = class14.method90(false, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lgd;")
    public static class40 field283 = field270;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lgd;")
    private static class40 field288 = class14.method90(false, "Connecting to update server");

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[[B")
    public static byte[][] field281 = new byte[250][];

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lgd;")
    public static class40 field287 = field288;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lba;")
    public static class7 field286 = new class7(64);

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field291 = 0;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Lgd;")
    public static class40 field293 = class14.method90(false, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lba;")
    public static class7 field292 = new class7(500);

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Lgd;")
    private static class40 field296 = class14.method90(false, "glow2:");

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lgd;")
    public static class40 field295 = field296;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field297 = 5063219;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lrb;")
    public static class103 field290;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Laa;")
    public class1 field274;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Laa;")
    public class1 field275;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Laa;")
    public class1 field282;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZBII[B)V", line = 8)
    public static final void method58(boolean arg0, byte arg1, int arg2, int arg3, byte[] arg4) {
        field279++;
        if (class114.field2744 == null) {
            return;
        }
        if (arg1 != -115) {
            field273 = -89;
        }
        if (class21.field491 >= 0) {
            class103.field2474 = arg2;
            if (class21.field491 == 0) {
                field291 = 1;
            } else {
                int var5 = class126.method1005(class21.field491, -126);
                int var6 = var5 - class5.field156;
                field291 = (var6 + 3600) / arg2;
                if (field291 < 1) {
                    field291 = 1;
                }
            }
            class50.field1280 = arg4;
            class30.field693 = arg0;
            class112.field2688 = arg3;
        } else if (field291 == 0) {
            class49.method383(arg4, 20, arg0, arg3);
        } else {
            class50.field1280 = arg4;
            class30.field693 = arg0;
            class112.field2688 = arg3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 59)
    public static void method59(int arg0) {
        field270 = null;
        field271 = null;
        field288 = null;
        field283 = null;
        field286 = null;
        field293 = null;
        field290 = null;
        field296 = null;
        field292 = null;
        field287 = null;
        field281 = null;
        if (arg0 != 12269) {
            field286 = null;
        }
        field284 = null;
        field295 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 84)
    public static final void method60(byte arg0) {
        try {
            if (arg0 != -13) {
                return;
            }
            Graphics var1 = class30.field761.getGraphics();
            class100.field2374.method465(arg0 ^ 0x79, 205, var1, 553);
        } catch (Exception var2) {
            class30.field761.repaint();
        }
        field294++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I", line = 110)
    public static final int method61(int arg0, int arg1, int arg2) {
        field277++;
        class133 var3 = (class133) class10.field259.method142((long) arg0, 23056);
        if (var3 == null) {
            return -1;
        } else {
            if (arg1 != 8476) {
                field287 = null;
            }
            return arg2 >= 0 && arg2 < var3.field3241.length ? var3.field3241[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIZ)Lgd;", line = 156)
    public static final class40 method62(int arg0, int arg1, boolean arg2) {
        if (arg1 != 10) {
            method62(47, -12, false);
        }
        field285++;
        return class133.method1045(arg2, arg0, (byte) 58, 10);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lgd;", line = 178)
    public static final class40 method63(int arg0, int arg1) {
        field276++;
        int var2 = -55 / ((23 - arg0) / 33);
        return client.method114(true, new class40[] { class21.method121(23444, arg1 >> 24 & 0xFF), class51.field1300, class21.method121(23444, arg1 >> 16 & 0xFF), class51.field1300, class21.method121(23444, arg1 >> 8 & 0xFF), class51.field1300, class21.method121(23444, arg1 & 0xFF) });
    }
}
