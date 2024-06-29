import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class100 extends Canvas {

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1919;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lob;")
    public static class129 field1909 = null;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Led;")
    public static class43 field1913 = class191.method1219("Lade Titelbild )2 ", false);

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Led;")
    private static class43 field1917 = class191.method1219("glow2:", false);

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Led;")
    public static class43 field1918 = field1917;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Led;")
    public static class43 field1921 = field1917;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Ln;")
    public static class118 field1915 = new class118();

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Led;")
    public static class43 field1922 = class191.method1219("Art", false);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1911;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static final void method619(boolean arg0) {
        field1910++;
        if (!arg0) {
            field1918 = null;
        }
        for (int var1 = 0; var1 < class115.field2241; var1++) {
            int var2 = class67.field1347[var1];
            class1 var3 = class12.field183[var2];
            int var4 = class38.field723.method538((byte) 111);
            if ((var4 & 0x4) != 0) {
                var4 += class38.field723.method538((byte) -71) << 8;
            }
            class144.method912((byte) -78, var2, var3, var4);
        }
    }

    @OriginalMember(owner = "client!l", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1919.paint(arg0);
        field1916++;
    }

    @OriginalMember(owner = "client!l", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1919.update(arg0);
        field1914++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lna;I)V")
    public static final void method620(class119 arg0, int arg1) {
        field1912++;
        if (arg0.field2322 == 0) {
            return;
        }
        if (arg0.field2380 != -1 && arg0.field2380 < 32768) {
            class77 var2 = class172.field3433[arg0.field2380];
            if (var2 != null) {
                int var3 = arg0.field2347 - var2.field2347;
                int var4 = arg0.field2328 - var2.field2328;
                if (var3 != 0 || var4 != 0) {
                    arg0.field2372 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2380 >= 32768) {
            int var5 = arg0.field2380 - 32768;
            if (class80.field1593 == var5) {
                var5 = 2047;
            }
            class1 var6 = class12.field183[var5];
            if (var6 != null) {
                int var7 = arg0.field2328 - var6.field2328;
                int var8 = arg0.field2347 - var6.field2347;
                if (var8 != 0 || var7 != 0) {
                    arg0.field2372 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2349 != 0 || arg0.field2339 != 0) && (arg0.field2377 == 0 || arg0.field2317 > 0)) {
            int var9 = arg0.field2347 - (arg0.field2349 - class170.field3393 - class170.field3393) * 64;
            int var10 = arg0.field2328 - (arg0.field2339 - class83.field1641 - class83.field1641) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field2372 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field2349 = 0;
            arg0.field2339 = 0;
        }
        int var11 = arg0.field2372 - arg0.field2352 & 0x7FF;
        if (~var11 == arg1) {
            arg0.field2331 = 0;
            return;
        }
        arg0.field2331++;
        if (var11 > 1024) {
            arg0.field2352 -= arg0.field2322;
            boolean var12 = true;
            if (arg0.field2322 > var11 || var11 > 2048 - arg0.field2322) {
                var12 = false;
                arg0.field2352 = arg0.field2372;
            }
            if (arg0.field2344 == arg0.field2326 && (arg0.field2331 > 25 || var12)) {
                if (arg0.field2371 == -1) {
                    arg0.field2344 = arg0.field2323;
                } else {
                    arg0.field2344 = arg0.field2371;
                }
            }
        } else {
            arg0.field2352 += arg0.field2322;
            boolean var13 = true;
            if (arg0.field2322 > var11 || 2048 - arg0.field2322 < var11) {
                var13 = false;
                arg0.field2352 = arg0.field2372;
            }
            if (arg0.field2344 == arg0.field2326 && (arg0.field2331 > 25 || var13)) {
                if (arg0.field2320 == -1) {
                    arg0.field2344 = arg0.field2323;
                } else {
                    arg0.field2344 = arg0.field2320;
                }
            }
        }
        arg0.field2352 &= 0x7FF;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class100(Component arg0) {
        this.field1919 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public static void method621(boolean arg0) {
        field1918 = null;
        if (!arg0) {
            method621(true);
        }
        field1921 = null;
        field1911 = null;
        field1922 = null;
        field1913 = null;
        field1915 = null;
        field1909 = null;
        field1917 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static final void method622(byte arg0) {
        field1920++;
        int var1 = class118.field2294.method952(class171.field3418);
        for (int var2 = 0; var2 < class41.field799; var2++) {
            int var6 = class118.field2294.method952(class170.method1080(-1, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class186.field3665 = true;
        if (arg0 > -93) {
            return;
        }
        class30.field574 = class41.field799 * 15 + 22;
        int var3 = class41.field799 * 15 + 21;
        var1 += 8;
        int var4 = class41.field814 - var1 / 2;
        int var5 = class187.field3673;
        if (var1 + var4 > 765) {
            var4 = 765 - var1;
        }
        if (var5 + var3 > 503) {
            var5 = 503 - var3;
        }
        class158.field3200 = var1;
        if (var5 < 0) {
            var5 = 0;
        }
        class125.field2474 = var5;
        if (var4 < 0) {
            var4 = 0;
        }
        class103.field1963 = var4;
    }
}
