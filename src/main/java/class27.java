import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class27 {

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "I")
    public static int field371 = 0;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "Lna;")
    public static class26 field372 = class30.method205((byte) 16, "Skirt Shop");

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "Lna;")
    public static class26 field376 = class30.method205((byte) 55, "b12_full");

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Lna;")
    public static class26 field374 = class30.method205((byte) 97, "Legende");

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "[Z")
    public static boolean[] field375 = new boolean[112];

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "I")
    public static int field378 = 500;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "[I")
    public static int[] field377;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Z)V", line = 27)
    public static void method192(boolean arg0) {
        field374 = null;
        field375 = null;
        field372 = null;
        field376 = null;
        if (!arg0) {
            field377 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(ILna;ILjava/awt/Color;)V", line = 44)
    public static final void method193(int arg0, class26 arg1, int arg2, Color arg3) {
        try {
            Graphics var4 = class33.field435.getGraphics();
            if (class31.field410 == null) {
                class31.field410 = new Font("Helvetica", 1, 13);
                class36.field471 = class33.field435.getFontMetrics(class31.field410);
            }
            if (mapview.field7) {
                mapview.field7 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class30.field405, class31.field413);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class39.field493 == null) {
                    class39.field493 = class33.field435.createImage(304, 34);
                }
                Graphics var5 = class39.field493.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, arg0);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class31.field410);
                var5.setColor(Color.white);
                arg1.method167(var5, 22, (304 - arg1.method188(false, class36.field471)) / 2, (byte) 100);
                var4.drawImage(class39.field493, class30.field405 / 2 - 152, class31.field413 / 2 - 18, null);
            } catch (Exception var10) {
                int var7 = class30.field405 / 2 - 152;
                int var8 = class31.field413 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg2 * 3 + var7 + 2, var8 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class31.field410);
                var4.setColor(Color.white);
                arg1.method167(var4, var8 + 22, var7 - -((-arg1.method188(false, class36.field471) + 304) / 2), (byte) 102);
            }
        } catch (Exception var11) {
            class33.field435.repaint();
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 129)
    public static final String method194(Throwable arg0, byte arg1) throws IOException {
        String var2;
        if (arg0 instanceof class39) {
            class39 var3 = (class39) arg0;
            var2 = var3.field492 + " | ";
            arg0 = var3.field500;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != -38) {
            return (String) null;
        }
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
}
