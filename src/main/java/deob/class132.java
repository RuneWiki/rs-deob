package deob;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfuscatedName("ez")
public class class132 extends RuntimeException {

    @ObfuscatedName("ez.e")
    public String field2063;

    @ObfuscatedName("ez.a")
    public Throwable field2065;

    public class132(Throwable arg0, String arg1) {
        this.field2063 = arg1;
        this.field2065 = arg0;
    }

    @ObfuscatedName("f.z(Ljava/lang/String;Ljava/lang/Throwable;S)V")
    public static void method508(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                Throwable var3 = arg1;
                String var5;
                if (arg1 instanceof class132) {
                    class132 var4 = (class132) arg1;
                    var5 = var4.field2063 + " | ";
                    var3 = var4.field2065;
                } else {
                    var5 = "";
                }
                StringWriter var6 = new StringWriter();
                PrintWriter var7 = new PrintWriter(var6);
                var3.printStackTrace(var7);
                var7.close();
                String var8 = var6.toString();
                BufferedReader var9 = new BufferedReader(new StringReader(var8));
                String var10 = var9.readLine();
                while (true) {
                    String var11 = var9.readLine();
                    if (var11 == null) {
                        String var20 = var5 + "| " + var10;
                        var2 = var20;
                        break;
                    }
                    int var12 = var11.indexOf(40);
                    int var13 = var11.indexOf(41, var12 + 1);
                    if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                            String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                            var5 = var5 + var16 + ' ';
                            continue;
                        }
                        var11 = var11.substring(0, var12);
                    }
                    String var17 = var11.trim();
                    String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                    String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                    var5 = var5 + var19 + ' ';
                }
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var22 = var2.replace(':', '.');
            String var23 = var22.replace('@', '_');
            String var24 = var23.replace('&', '_');
            String var25 = var24.replace('#', '_');
            if (Statics.field2064 == null) {
                return;
            }
            URL var26 = new URL(Statics.field2064.getCodeBase(), "clienterror.ws?c=" + Statics.field2066 + "&u=" + Statics.field2062 + "&v1=" + Statics.field1925 + "&v2=" + Statics.field1918 + "&e=" + var25);
            DataInputStream var27 = new DataInputStream(var26.openStream());
            var27.read();
            var27.close();
        } catch (Exception var29) {
        }
    }

    @ObfuscatedName("a.n(Ljava/lang/Throwable;Ljava/lang/String;)Lez;")
    public static class132 method105(Throwable arg0, String arg1) {
        class132 var2;
        if (arg0 instanceof class132) {
            var2 = (class132) arg0;
            var2.field2063 = var2.field2063 + ' ' + arg1;
        } else {
            var2 = new class132(arg0, arg1);
        }
        return var2;
    }
}
