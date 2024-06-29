import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 extends Canvas {

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field1676;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[Lpc;")
    public static class103[] field1673 = new class103[32768];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lmb;")
    public static class84 field1670 = class79.method672(true, "");

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lmb;")
    public static class84 field1681 = class79.method672(true, "Privater Chat");

    @OriginalMember(owner = "client!k", name = "h", descriptor = "[[B")
    public static byte[][] field1677 = new byte[50][];

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[J")
    public static long[] field1672 = new long[32];

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lsa;")
    public static class119 field1682 = new class119(64);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field1687 = -1;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lmb;")
    private static class84 field1686 = class79.method672(true, "Remove");

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lmb;")
    public static class84 field1683 = class79.method672(true, "mod_icons");

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Lmb;")
    public static class84 field1693 = class79.method672(true, ":duelreq:");

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Lmb;")
    public static class84 field1690 = field1686;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "J")
    public static long field1695 = 0L;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field1684 = 0;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field1694 = 500;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1691 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lsd;")
    public static class122 field1685;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Lsd;")
    public static class122 field1688;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lv;")
    public static class136 field1689;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Lmc;")
    public static class85 field1692;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method607(int arg0, Throwable arg1) throws IOException {
        field1671++;
        String var2;
        if (arg1 instanceof class63) {
            class63 var3 = (class63) arg1;
            var2 = var3.field1554 + " | ";
            arg1 = var3.field1560;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 <= 25) {
            return null;
        }
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Lsc;")
    public static final class121 method608(int arg0) {
        field1674++;
        class121 var1 = new class121();
        var1.field2900 = class107.field2599[0];
        var1.field2904 = class133.field3162[0];
        var1.field2897 = class80.field1991;
        var1.field2898 = class125.field3032[0];
        if (arg0 < 13) {
            field1685 = null;
        }
        var1.field2902 = class11.field181;
        var1.field2903 = client.field459[0];
        var1.field2899 = class134.field3213[0];
        var1.field2901 = class58.field1452;
        class115.method944(-74);
        return var1;
    }

    @OriginalMember(owner = "client!k", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1679++;
        this.field1676.update(arg0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static void method609(boolean arg0) {
        field1682 = null;
        field1677 = null;
        if (!arg0) {
            return;
        }
        field1681 = null;
        field1685 = null;
        field1692 = null;
        field1683 = null;
        field1673 = null;
        field1686 = null;
        field1688 = null;
        field1689 = null;
        field1672 = null;
        field1693 = null;
        field1670 = null;
        field1690 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class69(Component arg0) {
        this.field1676 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1676.paint(arg0);
        field1678++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method610(int arg0, String arg1) throws ClassNotFoundException {
        field1675++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg0 != -16) {
                method608(-54);
            }
            if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLu;)V")
    public static final void method611(boolean arg0, class130 arg1) {
        if (arg1.field3125 != null) {
            arg1.field3125.field1643 = 0;
        }
        field1680++;
        arg1.field3127 = false;
        for (class130 var2 = arg1.method300(); var2 != null; var2 = arg1.method307()) {
            method611(true, var2);
        }
        if (!arg0) {
            field1684 = -96;
        }
    }
}
