import java.awt.Component;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public abstract class class20 {

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "Lea;")
    public static class10 field210 = class3.method8("Loading", 125);

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "Lea;")
    public static class10 field211 = class3.method8("Loom", 104);

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "[[B")
    public static byte[][] field215 = new byte[250][];

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "Lea;")
    public static class10 field216 = class3.method8(" )2 ", -117);

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "Lea;")
    public static class10 field213 = class3.method8("Requesting", -6);

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "Lea;")
    public static class10 field218 = class3.method8("Slayer Master", -113);

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "I")
    public static int field212 = 50;

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field217;

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "[[[I")
    public static int[][][] field214;

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)V", line = 22)
    public static void method136(int arg0) {
        if (arg0 != 127) {
            return;
        }
        field217 = null;
        field213 = null;
        field214 = null;
        field215 = null;
        field211 = null;
        field210 = null;
        field216 = null;
        field218 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 46)
    public static final void method137(Component arg0, int arg1) {
        arg0.removeKeyListener(class8.field61);
        arg0.removeFocusListener(class8.field61);
        mapview.field371 = arg1;
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(I)Z", line = 57)
    public static final boolean method139(int arg0) {
        class1 var1 = class8.field61;
        synchronized (class8.field61) {
            if (class21.field224 == class16.field181) {
                return false;
            }
            class13.field143 = class18.field191[class16.field181];
            class8.field64 = class18.field193[class16.field181];
            class16.field181 = class16.field181 + 1 & 0x7F;
            int var2 = 5 / ((-arg0 - 12) / 52);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(II)I", line = 88)
    public static final int method140(int arg0, int arg1) {
        if (arg0 < 91) {
            return 1;
        } else {
            if (arg1 >= 65 && arg1 <= 90) {
                arg1 += 32;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 114)
    public static final String method141(int arg0, Throwable arg1) throws IOException {
        if (arg0 != 0) {
            field212 = -101;
        }
        String var2;
        if (arg1 instanceof class32) {
            class32 var3 = (class32) arg1;
            arg1 = var3.field439;
            var2 = var3.field440 + " | ";
        } else {
            var2 = "";
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

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)[B")
    public abstract byte[] method135(int arg0);

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B[B)V")
    public abstract void method138(byte arg0, byte[] arg1);
}
