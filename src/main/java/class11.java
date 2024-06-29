import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 extends Canvas {

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field158;

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "Lt;")
    public static class35 field156 = class3.method28(false, "Quest Start");

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "Lt;")
    public static class35 field157 = class3.method28(false, "Crafting Shop");

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "Lt;")
    public static class35 field159 = class3.method28(false, "Loading ");

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "I")
    public static int field160 = -1;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "[[Lca;")
    public static class6[][] field155;

    @OriginalMember(owner = "mapview!f", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 6)
    public final void paint(Graphics arg0) {
        this.field158.paint(arg0);
    }

    @OriginalMember(owner = "mapview!f", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 15)
    public final void update(Graphics arg0) {
        this.field158.update(arg0);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I)V", line = 25)
    public static void method78(int arg0) {
        field159 = null;
        field156 = null;
        if (arg0 > 63) {
            field155 = null;
            field157 = null;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Lpa;III)[Ll;", line = 58)
    public static final class22[] method79(class31 arg0, int arg1, int arg2, int arg3) {
        if (class33.method195(arg1, arg3, -120, arg0)) {
            if (arg2 != -29243) {
                field159 = null;
            }
            return class15.method92((byte) -43);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ljava/lang/String;B)Lt;", line = 79)
    public static final class35 method80(String arg0, byte arg1) {
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class35 var4 = new class35();
        var4.field433 = var2;
        var4.field434 = 0;
        if (arg1 != -19) {
            return (class35) null;
        }
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field434++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 109)
    public class11(Component arg0) {
        this.field158 = arg0;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Z)I", line = 118)
    public static final int method81(boolean arg0) {
        if (arg0) {
            return class19.field215 == null ? 0 : class19.field215[class31.field392];
        } else {
            return -9;
        }
    }
}
