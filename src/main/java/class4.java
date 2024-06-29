import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "La;")
    public static class1 field43 = class3.method36("Requesting", -92);

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "I")
    public static int field44 = -1;

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "La;")
    public static class1 field46 = class3.method36("Overview", -125);

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Ll;")
    public static class21 field41;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 14)
    public static final void method39(int arg0) {
        if (arg0 != ~class17.field146.toLowerCase().indexOf("microsoft")) {
            class8.field87[222] = 59;
            class8.field87[221] = 43;
            class8.field87[186] = 57;
            class8.field87[220] = 74;
            class8.field87[189] = 26;
            class8.field87[223] = 28;
            class8.field87[191] = 73;
            class8.field87[219] = 42;
            class8.field87[187] = 27;
            class8.field87[190] = 72;
            class8.field87[188] = 71;
            class8.field87[192] = 58;
            return;
        }
        class8.field87[91] = 42;
        class8.field87[93] = 43;
        class8.field87[47] = 73;
        class8.field87[61] = 27;
        class8.field87[46] = 72;
        if (class17.field149 == null) {
            class8.field87[192] = 58;
            class8.field87[222] = 59;
        } else {
            class8.field87[222] = 58;
            class8.field87[192] = 28;
            class8.field87[520] = 59;
        }
        class8.field87[44] = 71;
        class8.field87[45] = 26;
        class8.field87[59] = 57;
        class8.field87[92] = 74;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)B", line = 65)
    public static final byte method40(byte arg0) {
        if (arg0 != -7) {
            field43 = null;
        }
        return class24.field230 == null ? 0 : class24.field230[class5.field47];
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(B)V", line = 94)
    public static void method41(byte arg0) {
        field46 = null;
        if (arg0 > 23) {
            field41 = null;
            field43 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 108)
    public static final String method42(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class6) {
            class6 var2 = (class6) arg1;
            arg1 = var2.field59;
            var3 = var2.field64 + " | ";
        } else {
            var3 = "";
        }
        if (arg0 != 71) {
            return (String) null;
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
