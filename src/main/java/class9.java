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

@OriginalClass("mapview!ea")
public class class9 extends Canvas {

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field142;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Lt;")
    public static class31 field141 = class11.method64(-45, "labels)3dat");

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Lt;")
    public static class31 field140 = class11.method64(115, "details)3dat");

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Lt;")
    public static class31 field143 = class11.method64(-59, "Magic Shop");

    @OriginalMember(owner = "mapview!ea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 11)
    public final void paint(Graphics arg0) {
        this.field142.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ea", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 22)
    public final void update(Graphics arg0) {
        this.field142.update(arg0);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 35)
    public static final String method61(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class4) {
            class4 var2 = (class4) arg1;
            var3 = var2.field107 + " | ";
            arg1 = var2.field110;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg0 <= 123) {
            field141 = null;
        }
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

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)V", line = 105)
    public static void method62(byte arg0) {
        if (arg0 == -49) {
            field140 = null;
            field143 = null;
            field141 = null;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 121)
    public class9(Component arg0) {
        this.field142 = arg0;
    }
}
