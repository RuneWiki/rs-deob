import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class152 {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "S")
    public static short field2500 = 320;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Ltl;")
    private static class59 field2502 = class85.method639("Connecting to update server", 9588);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Ltl;")
    public static class59 field2497 = field2502;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lj;")
    public static class138 field2501 = new class138(16);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 5)
    public static void method1092(int arg0) {
        field2497 = null;
        field2501 = null;
        if (arg0 > -115) {
            method1094(-92, (class170) null);
        }
        field2502 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 18)
    public static final String method1093(byte arg0, Throwable arg1) throws IOException {
        field2503++;
        String var3;
        if (arg1 instanceof class16) {
            class16 var2 = (class16) arg1;
            arg1 = var2.field203;
            var3 = var2.field210 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        if (arg0 >= -122) {
            return (String) null;
        }
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

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILs;)Leg;", line = 112)
    public static final class167 method1094(int arg0, class170 arg1) {
        if (arg0 > -25) {
            return (class167) null;
        } else {
            field2499++;
            return new class167(arg1.method1210(-128), arg1.method1210(-80), arg1.method1210(-99), arg1.method1210(-102), arg1.method1208((byte) -91), arg1.method1208((byte) -92), arg1.method1221(93));
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public abstract void method805(int arg0);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
    public abstract int method804(int arg0, int arg1, int arg2);
}
