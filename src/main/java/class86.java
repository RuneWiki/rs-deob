import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class86 {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1919 = 0;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lgd;")
    public static class40 field1928 = class14.method90(false, " )2> ");

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lgd;")
    public static class40 field1917 = class14.method90(false, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Lgd;")
    private static class40 field1930 = class14.method90(false, "Welcome to RuneScape");

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lgd;")
    public static class40 field1918 = class14.method90(false, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lgd;")
    private static class40 field1927 = class14.method90(false, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lgd;")
    public static class40 field1913 = field1927;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lgd;")
    public static class40 field1923 = field1930;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lgd;")
    private static class40 field1920 = class14.method90(false, "scroll:");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lgd;")
    public static class40 field1914 = field1920;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "[I")
    public static int[] field1931 = new int[2000];

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lrc;")
    public static class104 field1922 = new class104(new byte[5000]);

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public static int field1935 = -1;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lrb;")
    public static class103 field1910;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Lje;")
    public static class59 field1933;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Loc;")
    public static class86 field1915;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field1911;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[I")
    public int[] field1925;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Lmb;", line = 6)
    public static final class73 method560(int arg0) {
        field1921++;
        class73 var1 = new class73();
        var1.field1708 = class99.field2355;
        var1.field1710 = class16.field424;
        var1.field1707 = class122.field2860[0];
        var1.field1709 = class120.field2842[0];
        var1.field1706 = class134.field3271[0];
        var1.field1712 = class30.field754[arg0];
        var1.field1705 = class96.field2229;
        var1.field1711 = class129.field3086[0];
        class107.method825(arg0 ^ 0xFFFFCC3A);
        return var1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 36)
    public final void method561(byte arg0) {
        if (arg0 != -74) {
            this.method561((byte) -96);
        }
        field1924++;
        class27.method170(this.field1925, this.field1926, this.field1929);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lre;", line = 47)
    public static final class107 method562(int arg0, byte arg1) {
        field1932++;
        class107 var2 = (class107) class23.field533.method39(-6, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class136.field3333.method731(0, arg0, (byte) -107);
        if (var3 == null) {
            return null;
        }
        class107 var4 = new class107();
        int var5 = 0;
        if (arg1 <= 121) {
            field1930 = null;
        }
        class104 var6 = new class104(var3);
        var6.field2563 = var6.field2554.length - 12;
        int var7 = var6.method774(-29404);
        var4.field2602 = var6.method797(-7916);
        var4.field2613 = var6.method797(-7916);
        var4.field2616 = var6.method797(-7916);
        var4.field2607 = var6.method797(-7916);
        var4.field2620 = new class40[var7];
        var4.field2609 = new int[var7];
        var6.field2563 = 0;
        var4.field2597 = new int[var7];
        while (var6.field2554.length - 12 > var6.field2563) {
            int var8 = var6.method797(-7916);
            if (var8 == 3) {
                var4.field2620[var5] = var6.method765(13101);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field2597[var5] = var6.method798((byte) -117);
            } else {
                var4.field2597[var5] = var6.method774(-29404);
            }
            var4.field2609[var5++] = var8;
        }
        class23.field533.method38(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfa;II)V", line = 107)
    public static final void method563(class31 arg0, int arg1, int arg2) {
        field1916++;
        class83.method552((byte) 57, arg0.field792, arg1, arg0.field838);
        if (arg2 != 0) {
            field1915 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 126)
    public static void method564(int arg0) {
        field1917 = null;
        field1933 = null;
        field1915 = null;
        field1928 = null;
        field1930 = null;
        field1918 = null;
        field1927 = null;
        field1931 = null;
        field1910 = null;
        field1914 = null;
        field1923 = null;
        field1913 = null;
        if (arg0 >= -24) {
            method563(null, 81, 20);
        }
        field1920 = null;
        field1922 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lrb;ILgd;Lgd;)Lmb;", line = 170)
    public static final class73 method565(class103 arg0, int arg1, class40 arg2, class40 arg3) {
        int var4 = arg0.method749(arg3, 1);
        field1909++;
        if (arg1 != 0) {
            method564(43);
        }
        int var5 = arg0.method740(var4, false, arg2);
        return class77.method517(var5, var4, arg0, -1);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 200)
    protected class86() {
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZB)V", line = 213)
    public static final void method566(boolean arg0, byte arg1) {
        if (arg1 <= 77) {
            return;
        }
        field1912++;
        class41.field1021++;
        if (class41.field1021 < 50 && !arg0) {
            return;
        }
        class41.field1021 = 0;
        if (class65.field1601 || class110.field2684 == null) {
            return;
        }
        class55.field1442++;
        class92.field2094.method290((byte) 0, 215);
        try {
            class110.field2684.method1086(0, class92.field2094.field2554, class92.field2094.field2563, (byte) 126);
            class92.field2094.field2563 = 0;
        } catch (IOException var2) {
            class65.field1601 = true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public abstract void method468(int arg0, int arg1, Component arg2, byte arg3);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method465(int arg0, int arg1, Graphics arg2, int arg3);
}
