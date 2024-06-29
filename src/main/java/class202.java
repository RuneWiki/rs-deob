import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class202 extends Canvas {

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field3994;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    public static int[] field3986 = new int[500];

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lcd;")
    public static class23 field3985 = class54.method414("Ung-Ultiger Benutzername", -1);

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lcd;")
    private static class23 field3987 = class54.method414("glow3:", -1);

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lcd;")
    public static class23 field3990 = field3987;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lcd;")
    private static class23 field3988 = class54.method414("Username: ", -1);

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lcd;")
    public static class23 field3998 = class54.method414("<col=ffffff>", -1);

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lcd;")
    public static class23 field4000 = class54.method414("Benutzen Sie die (WPasswort -=ndern(W Option", -1);

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lcd;")
    public static class23 field3989 = field3987;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lcd;")
    public static class23 field3991 = field3988;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lcf;")
    public static class25 field3984 = new class25();

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lea;")
    public static class38 field3995;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[Lea;")
    public static class38[] field3993;

    @OriginalMember(owner = "client!we", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3994.update(arg0);
        field3992++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BI)I")
    public static final int method1325(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 54) {
            method1325(-109, null, -80);
        }
        field3999++;
        return class15.method81(0, arg1, arg0, 2);
    }

    @OriginalMember(owner = "client!we", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3983++;
        this.field3994.paint(arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLcd;I)V")
    public static final void method1326(byte arg0, class23 arg1, int arg2) {
        class23 var3 = arg1.method167(-119).method164(-12065);
        int var4 = 46 / ((arg0 - 25) / 43);
        boolean var5 = false;
        for (int var6 = 0; var6 < class57.field1348; var6++) {
            class57 var7 = class95.field2007[class69.field1622[var6]];
            if (var7 != null && var7.field1345 != null && var7.field1345.method146(126, var3)) {
                class186.method1147(0, (byte) 107, false, 0, class134.field2790.field219[0], 1, var7.field219[0], 0, 1, 2, var7.field230[0], class134.field2790.field230[0]);
                if (arg2 == 1) {
                    class9.field173++;
                    class159.field3190.method631(242, -1);
                    class159.field3190.method1215((byte) -114, class69.field1622[var6]);
                } else if (arg2 == 4) {
                    class159.field3190.method631(210, -1);
                    class60.field1395++;
                    class159.field3190.method1215((byte) -116, class69.field1622[var6]);
                } else if (arg2 == 6) {
                    class54.field1280++;
                    class159.field3190.method631(54, -1);
                    class159.field3190.method1221(true, class69.field1622[var6]);
                } else if (arg2 == 7) {
                    class159.field3190.method631(77, -1);
                    class145.field2963++;
                    class159.field3190.method1215((byte) -123, class69.field1622[var6]);
                }
                var5 = true;
                break;
            }
        }
        field3997++;
        if (!var5) {
            class107.method701(10945, class66.field1566, 0, class3.method14(true, new class23[] { class51.field1225, var3 }));
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class202(Component arg0) {
        this.field3994 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1327(boolean arg0) {
        field3986 = null;
        field3995 = null;
        field3987 = null;
        field3998 = null;
        field3990 = null;
        field3985 = null;
        field3991 = null;
        field4000 = null;
        field3984 = null;
        if (!arg0) {
            field3986 = null;
        }
        field3988 = null;
        field3993 = null;
        field3989 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lua;")
    public static final class180 method1328(Throwable arg0, String arg1) {
        field3996++;
        class180 var2;
        if (arg0 instanceof class180) {
            var2 = (class180) arg0;
            var2.field3565 = var2.field3565 + ' ' + arg1;
        } else {
            var2 = new class180(arg0, arg1);
        }
        return var2;
    }
}
