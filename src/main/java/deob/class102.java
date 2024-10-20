package deob;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfuscatedName("cx")
public class class102 extends RuntimeException {

    @ObfuscatedName("cx.h")
    public String field1647;

    @ObfuscatedName("cx.w")
    public Throwable field1648;

    public class102(Throwable arg0, String arg1) {
        this.field1647 = arg1;
        this.field1648 = arg0;
    }

    @ObfuscatedName("ab.n(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method755(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                Throwable var3 = arg1;
                String var5;
                if (arg1 instanceof class102) {
                    class102 var4 = (class102) arg1;
                    var5 = var4.field1647 + " | ";
                    var3 = var4.field1648;
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
            if (Statics.field1644 == null) {
                return;
            }
            URL var26 = new URL(Statics.field1644.getCodeBase(), "clienterror.ws?c=" + Statics.field1651 + "&u=" + Statics.field1645 + "&v1=" + Statics.field1673 + "&v2=" + Statics.field1668 + "&e=" + var25);
            DataInputStream var27 = new DataInputStream(var26.openStream());
            var27.read();
            var27.close();
        } catch (Exception var29) {
        }
    }

    @ObfuscatedName("gx.d(Ljava/lang/Throwable;Ljava/lang/String;)Lcx;")
    public static class102 method3229(Throwable arg0, String arg1) {
        class102 var2;
        if (arg0 instanceof class102) {
            var2 = (class102) arg0;
            var2.field1647 = var2.field1647 + ' ' + arg1;
        } else {
            var2 = new class102(arg0, arg1);
        }
        return var2;
    }
}
