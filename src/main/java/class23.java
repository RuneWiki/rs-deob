import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class23 extends Canvas {

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field236;

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "Lua;")
    public static class41 field242 = class16.method86("map", true);

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "I")
    public static volatile int field239 = -1;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "J")
    public static volatile long field234 = 0L;

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "Lua;")
    public static class41 field240 = class16.method86("Key", true);

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Lua;")
    public static class41 field241 = class16.method86("Saw Mill", true);

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Lua;")
    public static class41 field238 = class16.method86("Axe Shop", true);

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "I")
    public static volatile int field235 = 0;

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "Lua;")
    public static class41 field244 = class16.method86("u_pass", true);

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "Lua;")
    public static class41 field248 = class16.method86("mapfunction", true);

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "Lo;")
    public static class28 field243;

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "Lua;")
    public static class41 field246;

    @OriginalMember(owner = "mapview!la", name = "n", descriptor = "[B")
    public static byte[] field247;

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "[I")
    public static int[] field245;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 4)
    public static final void method124(int arg0, Component arg1) {
        arg1.addMouseListener(class19.field156);
        arg1.addMouseMotionListener(class19.field156);
        arg1.addFocusListener(class19.field156);
        if (arg0 != 31893) {
            field235 = 4;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)I", line = 32)
    public static final int method125(int arg0) {
        if (arg0 != 0) {
            field248 = null;
        }
        return class20.field177 == null ? 0 : class20.field177[class42.field514];
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I[B)[B", line = 51)
    public static final byte[] method126(int arg0, byte[] arg1) {
        class19 var2 = new class19(arg1);
        if (arg0 != -2) {
            field238 = null;
        }
        int var3 = var2.method100(arg0 ^ 0x76);
        int var4 = var2.method105(80);
        if (var4 < 0 || class36.field453 != 0 && var4 > class36.field453) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method97(0, (byte) 87, var4, var7);
            return var7;
        } else {
            int var5 = var2.method105(arg0 ^ 0xFFFFFF99);
            if (var5 < 0 || class36.field453 != 0 && var5 > class36.field453) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class24.method135(var6, var5, arg1, var4, 9);
            } else {
                class25.field256.method82(var6, (byte) 115, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 107)
    public final void update(Graphics arg0) {
        this.field236.update(arg0);
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(I)V", line = 114)
    public static void method127(int arg0) {
        field238 = null;
        field243 = null;
        field246 = null;
        field241 = null;
        field242 = null;
        field240 = null;
        if (arg0 > -22) {
            method125(-120);
        }
        field248 = null;
        field247 = null;
        field244 = null;
        field245 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 144)
    public final void paint(Graphics arg0) {
        this.field236.paint(arg0);
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 179)
    public class23(Component arg0) {
        this.field236 = arg0;
    }
}
