import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class282 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4334 = 0;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Z")
    public static boolean field4336;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 4)
    public static final String method1906(Throwable arg0, int arg1) throws IOException {
        field4337++;
        String var2;
        if ((arg0 instanceof class600)) {
            class600 var3 = (class600) arg0;
            var2 = var3.field8459 + " | ";
            arg0 = var3.field8460;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        if (arg1 != 0) {
            return null;
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }
}
