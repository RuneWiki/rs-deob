import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends Canvas {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field1324;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lsc;")
    public static class128 field1323 = class129.method1017(false, ": ");

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lsc;")
    public static class128 field1329 = class129.method1017(false, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "[Lae;")
    public static class6[] field1333 = new class6[256];

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lsc;")
    private static class128 field1326 = class129.method1017(false, "Unable to find ");

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lsc;")
    public static class128 field1337 = field1326;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[I")
    public static int[] field1338 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Z")
    public static boolean field1331;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[I")
    public static int[] field1332;

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class62(Component arg0) {
        this.field1324 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLsc;Lsc;Lsc;)V")
    public static final void method462(boolean arg0, class128 arg1, class128 arg2, class128 arg3) {
        field1334++;
        class132.field3079 = arg1;
        class132.field3043 = arg2;
        if (arg0) {
            class132.field3093 = arg3;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
    public static final int method463(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method464(18, false);
        }
        field1327++;
        class159 var3 = (class159) class46.field858.method969((long) arg1, -73);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var3.field3641.length) {
            return var3.field3641[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1328++;
        this.field1324.paint(arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)Z")
    public static final boolean method464(int arg0, boolean arg1) {
        if (arg1) {
            return false;
        } else {
            field1335++;
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method465(int arg0) {
        field1332 = null;
        field1333 = null;
        field1337 = null;
        field1323 = null;
        field1338 = null;
        if (arg0 != 256) {
            field1331 = true;
        }
        field1326 = null;
        field1329 = null;
    }

    @OriginalMember(owner = "client!j", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1322++;
        this.field1324.update(arg0);
    }
}
