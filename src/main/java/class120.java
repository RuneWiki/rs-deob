import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class120 extends Canvas {

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field2191;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field2184 = 10;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lub;")
    private static class227 field2183 = class257.method1749("You can(Wt add yourself to your own ignore list)3", 17263);

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lub;")
    public static class227 field2187 = class257.method1749("::fpsoff", 17263);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lub;")
    public static class227 field2179 = field2183;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "[I")
    public static int[] field2188 = new int[4096];

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "[I")
    public static int[] field2190 = new int[5];

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lub;")
    private static class227 field2182 = class257.method1749("Loading)3)3)3", 17263);

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lub;")
    private static class227 field2193 = class257.method1749("Loading interfaces )2 ", 17263);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lub;")
    public static class227 field2181 = field2193;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lub;")
    public static class227 field2194 = field2182;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lub;")
    private static class227 field2185 = class257.method1749("Loaded config", 17263);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lub;")
    public static class227 field2178 = field2185;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ee", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2186++;
        this.field2191.paint(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILqa;)V")
    public static final void method751(int arg0, class225 arg1) {
        class238 var2 = (class238) class223.field3790.method1298(-117, arg1.field3819.method1485(122));
        field2189++;
        if (arg0 > -68) {
            field2187 = null;
        }
        if (var2 == null) {
            return;
        }
        if (var2.field4129 != null) {
            class94.field1627.method479(var2.field4129);
            var2.field4129 = null;
        }
        var2.method369(127);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method752(byte arg0) {
        field2193 = null;
        field2188 = null;
        field2187 = null;
        field2178 = null;
        field2190 = null;
        field2179 = null;
        field2194 = null;
        if (arg0 < 19) {
            field2193 = null;
        }
        field2183 = null;
        field2185 = null;
        field2182 = null;
        field2181 = null;
    }

    @OriginalMember(owner = "client!ee", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2180++;
        this.field2191.update(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lnh;BI)V")
    public static final void method753(class57 arg0, byte arg1, int arg2) {
        field2192++;
        if (arg1 != -53) {
            field2194 = null;
        }
        if (class214.field3619 == null) {
            class104.method638(255, (byte) 0, 255, 1941235504, (class57) null, 0, true);
            class182.field3117[arg2] = arg0;
        } else {
            class214.field3619.field3879 = arg2 * 8 + 5;
            int var3 = class214.field3619.method1478(-32053);
            int var4 = class214.field3619.method1478(-32053);
            arg0.method346((byte) 0, var4, var3);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class120(Component arg0) {
        this.field2191 = arg0;
    }
}
