import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class137 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[Lwe;")
    public static class15[] field2260 = new class15[32768];

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2262 = 0;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[I")
    public static int[] field2263 = new int[200];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public static int[] field2258;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method962(byte arg0) {
        field2260 = null;
        if (arg0 < 100) {
            field2262 = 71;
        }
        field2258 = null;
        field2263 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
    public static final void method963(byte arg0) {
        if (arg0 <= 63) {
            field2263 = null;
        }
        field2256++;
        class135.field2223.method472((byte) -63);
        class278.field4388.method472((byte) -63);
        class108.field1777.method472((byte) -63);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method964(byte arg0, Throwable arg1) throws IOException {
        field2257++;
        if (arg0 != -76) {
            field2263 = null;
        }
        String var3;
        if (arg1 instanceof class210) {
            class210 var2 = (class210) arg1;
            arg1 = var2.field3429;
            var3 = var2.field3430 + " | ";
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
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
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
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }
}
