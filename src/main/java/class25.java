import java.awt.Component;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class25 extends class30 {

    @OriginalMember(owner = "mapview!ma", name = "m", descriptor = "Ld;")
    public static class7 field236 = class37.method242("Platebody Shop", 1333943984);

    @OriginalMember(owner = "mapview!ma", name = "t", descriptor = "Ld;")
    public static class7 field243 = class37.method242("Dairy Churn", 1333943984);

    @OriginalMember(owner = "mapview!ma", name = "r", descriptor = "Ld;")
    public static class7 field241 = class37.method242("Next page", 1333943984);

    @OriginalMember(owner = "mapview!ma", name = "v", descriptor = "I")
    public static volatile int field245 = 0;

    @OriginalMember(owner = "mapview!ma", name = "w", descriptor = "Ld;")
    public static class7 field246 = class37.method242("Please wait)3)3)3 Rendering Map", 1333943984);

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "Ld;")
    public static class7 field235 = class37.method242("Rare Trees", 1333943984);

    @OriginalMember(owner = "mapview!ma", name = "q", descriptor = "Z")
    public static boolean field240 = false;

    @OriginalMember(owner = "mapview!ma", name = "u", descriptor = "Ld;")
    public static class7 field244 = class37.method242("Mace Shop", 1333943984);

    @OriginalMember(owner = "mapview!ma", name = "n", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "mapview!ma", name = "x", descriptor = "Lc;")
    public static class5 field247;

    @OriginalMember(owner = "mapview!ma", name = "o", descriptor = "Ld;")
    public class7 field238;

    @OriginalMember(owner = "mapview!ma", name = "p", descriptor = "Ljava/awt/Font;")
    public static Font field239;

    @OriginalMember(owner = "mapview!ma", name = "s", descriptor = "[I")
    public static int[] field242;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V", line = 18)
    public static void method161(byte arg0) {
        field247 = null;
        field236 = null;
        field242 = null;
        if (arg0 != 34) {
            return;
        }
        field244 = null;
        field241 = null;
        field246 = null;
        field243 = null;
        field239 = null;
        field235 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ljava/awt/Component;III)Lka;", line = 67)
    public static final class21 method162(Component arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg3 < 115) {
                return (class21) null;
            } else {
                Class var4 = Class.forName("o");
                class21 var5 = (class21) var4.getDeclaredConstructor().newInstance();
                var5.method114(arg2, arg1, (byte) -23, arg0);
                return var5;
            }
        } catch (Throwable var8) {
            class16 var7 = new class16();
            var7.method114(arg2, arg1, (byte) 112, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(B)I", line = 115)
    public static final int method163(byte arg0) {
        int var1 = 111 % ((arg0 + 16) / 48);
        if (class35.field488 == null) {
            return 0;
        } else if (class35.field488.field461 == null) {
            return class28.field415[class35.field488.field469 & 0xFF];
        } else {
            return class28.field415[class35.field488.field461[class16.field166] & 0xFF];
        }
    }
}
