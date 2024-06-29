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

@OriginalClass("mapview!n")
public class class26 extends Canvas {

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field306;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Lba;")
    public static class4 field304 = class14.method105((byte) -115, "Brewery");

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "I")
    public static int field308 = 0;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "Lba;")
    public static class4 field309 = class14.method105((byte) -114, "Rare Trees");

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "Lba;")
    public static class4 field307 = class14.method105((byte) -79, "Key");

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "I")
    public static int field310 = 0;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "mapview!n", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 6)
    public final void paint(Graphics arg0) {
        this.field306.paint(arg0);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)[Lj;", line = 15)
    public static final class6[] method169(int arg0) {
        class6[] var1 = new class6[class5.field107];
        for (int var2 = 0; var2 < class5.field107; var2++) {
            class6 var3 = var1[var2] = new class6();
            var3.field121 = class5.field96;
            var3.field124 = class31.field392;
            var3.field120 = class23.field281[var2];
            var3.field123 = class24.field291[var2];
            var3.field119 = class5.field104[var2];
            var3.field122 = class29.field370[var2];
            var3.field118 = class22.field274;
            var3.field125 = class9.field149[var2];
        }
        class35.method224(-6063);
        int var4 = 74 / ((31 - arg0) / 51);
        return var1;
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)V", line = 59)
    public static void method170(int arg0) {
        field304 = null;
        field309 = null;
        if (arg0 != 12963) {
            field307 = null;
        }
        field307 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(I)V", line = 105)
    public static final void method171(int arg0) {
        class27 var1 = class35.field435;
        synchronized (class35.field435) {
            class20.field237 = class20.field226;
            class24.field294 = class20.field230;
            int var2 = -10 / ((arg0 + 31) / 40);
            class1.field68 = class28.field347;
            class13.field179 = class34.field431;
            class14.field190 = class5.field95;
            class3.field73 = class23.field283;
            class34.field431 = 0;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 131)
    public class26(Component arg0) {
        this.field306 = arg0;
    }

    @OriginalMember(owner = "mapview!n", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 145)
    public final void update(Graphics arg0) {
        this.field306.update(arg0);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 156)
    public static final String method172(int arg0, Throwable arg1) throws IOException {
        if (arg0 != 0) {
            method170(99);
        }
        String var3;
        if (arg1 instanceof class34) {
            class34 var2 = (class34) arg1;
            var3 = var2.field434 + " | ";
            arg1 = var2.field425;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }
}
