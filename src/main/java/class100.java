import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class100 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lsb;")
    public static class98 field1754 = class47.method368("null", 0);

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[I")
    public static int[] field1757 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field1761 = -1;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lsb;")
    private static class98 field1756 = class47.method368(" has logged out)3", 0);

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lsb;")
    public static class98 field1760 = field1756;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lvb;")
    public class61 field1755;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "[I")
    public int[] field1759;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method758(byte arg0) {
        field1760 = null;
        field1756 = null;
        int var1 = 82 / ((-arg0 - 52) / 51);
        field1757 = null;
        field1754 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
    public static final int method759(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method760(Throwable arg0, int arg1) throws IOException {
        field1762++;
        String var2;
        if ((arg0 instanceof class64)) {
            class64 var3 = (class64) arg0;
            var2 = var3.field1045 + " | ";
            arg0 = var3.field1050;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 < 53) {
            return null;
        }
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
