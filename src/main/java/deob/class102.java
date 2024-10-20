package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

@ObfuscatedName("co")
public class class102 extends RuntimeException {

    @ObfuscatedName("co.h")
    public String field1678;

    @ObfuscatedName("co.r")
    public Throwable field1675;

    public class102(Throwable arg0, String arg1) {
        this.field1678 = arg1;
        this.field1675 = arg0;
    }

    @ObfuscatedName("ac.i(Ljava/lang/Throwable;Ljava/lang/String;)Lco;")
    public static class102 method909(Throwable arg0, String arg1) {
        class102 var2;
        if (arg0 instanceof class102) {
            var2 = (class102) arg0;
            var2.field1678 = var2.field1678 + ' ' + arg1;
        } else {
            var2 = new class102(arg0, arg1);
        }
        return var2;
    }

    @ObfuscatedName("ep.u(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method2496(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class102) {
            class102 var1 = (class102) arg0;
            var2 = var1.field1678 + " | ";
            arg0 = var1.field1675;
        } else {
            var2 = "";
        }
        StringWriter var3 = new StringWriter();
        PrintWriter var4 = new PrintWriter(var3);
        arg0.printStackTrace(var4);
        var4.close();
        String var5 = var3.toString();
        BufferedReader var6 = new BufferedReader(new StringReader(var5));
        String var7 = var6.readLine();
        while (true) {
            while (true) {
                String var8 = var6.readLine();
                if (var8 == null) {
                    return var2 + "| " + var7;
                }
                int var10 = var8.indexOf(40);
                int var11 = var8.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var8.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var8 = var8.substring(0, var10);
                }
                String var15 = var8.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }
}
