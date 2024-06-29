import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public abstract class class24 {

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "[J")
    public static long[] field202 = new long[32];

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "[[B")
    public static byte[][] field203 = new byte[50][];

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "Lt;")
    public static class31 field211 = class14.method84(127, "floorcol)3dat");

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "Lt;")
    public static class31 field205 = class14.method84(112, "Please wait)3)3)3 Loading maps");

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lt;")
    public static class31 field206 = class14.method84(123, "Hair Dressers");

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field207;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "[I")
    public static int[] field208;

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "[I")
    public int[] field210;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Lt;Lt;Lca;B)Lf;", line = 48)
    public static final class10 method134(class31 arg0, class31 arg1, class6 arg2, byte arg3) {
        if (arg3 < 63) {
            return (class10) null;
        } else {
            int var4 = arg2.method32(arg0, true);
            int var5 = arg2.method36(var4, false, arg1);
            return mapview.method161(var5, 7, arg2, var4);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 65)
    public static final String method135(Throwable arg0, boolean arg1) throws IOException {
        String var3;
        if (arg0 instanceof class20) {
            class20 var2 = (class20) arg0;
            arg0 = var2.field173;
            var3 = var2.field171 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (!arg1) {
                        field211 = null;
                    }
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V", line = 137)
    public final void method136(int arg0) {
        if (arg0 != 5654) {
            method137(-64);
        }
        class8.method46(this.field210, this.field212, this.field209);
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)V", line = 147)
    public static void method137(int arg0) {
        field208 = null;
        int var1 = 75 / ((arg0 + 32) / 62);
        field211 = null;
        field205 = null;
        field202 = null;
        field203 = null;
        field206 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "()V", line = 174)
    protected class24() {
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method76(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method78(int arg0, Graphics arg1, int arg2, int arg3);
}
