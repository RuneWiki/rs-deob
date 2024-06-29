import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class27 extends class137 {

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Lhh;")
    private static class163 field420 = class137.method1065("Unable to find ", 17);

    @OriginalMember(owner = "client!di", name = "w", descriptor = "Lhh;")
    public static class163 field424 = class137.method1065("<col=00ffff>", 17);

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field418 = -1;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Lhh;")
    public static class163 field423 = class137.method1065("0(U", 17);

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field419 = -1;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Lhh;")
    public static class163 field422 = field420;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "B")
    public byte field416;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Lhh;")
    public class163 field421;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "Lhh;")
    public class163 field425;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public static void method169(int arg0) {
        field422 = null;
        field420 = null;
        field423 = null;
        field424 = null;
        if (arg0 != 41) {
            field423 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method170(Throwable arg0, int arg1) throws IOException {
        field415++;
        String var3;
        if (arg0 instanceof class162) {
            class162 var2 = (class162) arg0;
            var3 = var2.field2963 + " | ";
            arg0 = var2.field2962;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 >= -58) {
            field418 = -66;
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
}
