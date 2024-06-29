import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class190 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lfi;")
    public static class388 field2832 = new class388(2);

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2834 = -1;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 3)
    public static final String method1325(Throwable arg0, boolean arg1) throws IOException {
        field2829++;
        String var2;
        if ((arg0 instanceof class289)) {
            class289 var3 = (class289) arg0;
            arg0 = var3.field4114;
            var2 = var3.field4115 + " | ";
        } else {
            var2 = "";
        }
        if (!arg1) {
            return null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
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

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 76)
    public static void method1326(int arg0) {
        field2832 = null;
        if (arg0 != -1) {
            field2833 = -66;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 89)
    public static final void method1327(int arg0, int arg1) {
        if (arg0 <= 18) {
            field2835 = -124;
        }
        field2831++;
        class54 var2 = class442.method2651(arg1, 7, -13208);
        var2.method476((byte) -44);
    }
}
