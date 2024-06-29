import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class183 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Z")
    public static boolean field3214 = false;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[[I")
    public static int[][] field3216 = new int[104][104];

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1252(int arg0, Throwable arg1) throws IOException {
        field3217++;
        if (arg0 != 0) {
            field3214 = false;
        }
        String var3;
        if (arg1 instanceof class160) {
            class160 var2 = (class160) arg1;
            var3 = var2.field2730 + " | ";
            arg1 = var2.field2734;
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

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1253(byte arg0) {
        if (arg0 == 94) {
            field3216 = null;
        }
    }
}
