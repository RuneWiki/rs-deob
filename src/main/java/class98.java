import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class98 extends Canvas {

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field2378;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lwb;")
    private static class130 field2360 = class26.method212("Loaded fonts", -32376);

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lwb;")
    public static class130 field2365 = class26.method212(" weitere Optionen", -32376);

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2368 = 127;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2372 = 0;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lwb;")
    private static class130 field2362 = class26.method212("On", -32376);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lwb;")
    public static class130 field2361 = field2362;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "J")
    public static volatile long field2379 = 0L;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lwb;")
    public static class130 field2371 = class26.method212("scrollbar", -32376);

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lwb;")
    public static class130 field2373 = field2360;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lwb;")
    public static class130 field2366 = class26.method212("Bitte versuchen Sie es in ", -32376);

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Lqd;")
    public static class100 field2375;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Z")
    public static boolean field2374;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "[I")
    public static int[] field2376;

    @OriginalMember(owner = "client!qb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void update(Graphics arg0) {
        field2370++;
        this.field2378.update(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIBI)I", line = 27)
    public static final int method732(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg0;
            arg0 = var7;
        }
        if (arg5 != -113) {
            method734(false, null);
        }
        int var8 = arg1 & 0x3;
        field2364++;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 1 + 7 - arg6 - arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 61)
    public final void paint(Graphics arg0) {
        this.field2378.paint(arg0);
        field2377++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 98)
    public static void method733(byte arg0) {
        field2375 = null;
        field2371 = null;
        field2360 = null;
        field2361 = null;
        field2373 = null;
        if (arg0 >= -11) {
            field2366 = null;
        }
        field2365 = null;
        field2366 = null;
        field2362 = null;
        field2376 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 138)
    public class98(Component arg0) {
        this.field2378 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z[B)[B", line = 146)
    public static final byte[] method734(boolean arg0, byte[] arg1) {
        field2369++;
        if (!arg0) {
            return null;
        }
        class36 var2 = new class36(arg1);
        int var3 = var2.method365((byte) -122);
        int var4 = var2.method361((byte) 122);
        if (var4 < 0 || class90.field2183 != 0 && class90.field2183 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method328(var4, var8, 0, (byte) -127);
            return var8;
        } else {
            int var5 = var2.method361((byte) 54);
            if (var5 < 0 || class90.field2183 != 0 && class90.field2183 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class74.method575(var6, var5, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var9) {
                }
            }
            return var6;
        }
    }
}
