package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("ev")
public class class132 extends RuntimeException {

    @ObfuscatedName("ev.g")
    public String field2046;

    @ObfuscatedName("ev.r")
    public Throwable field2047;

    public class132(Throwable arg0, String arg1) {
        this.field2046 = arg1;
        this.field2047 = arg0;
    }

    @ObfuscatedName("d.m(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method130(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = Statics.method999(arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var3 = var2.replace(':', '.');
            String var4 = var3.replace('@', '_');
            String var5 = var4.replace('&', '_');
            String var6 = var5.replace('#', '_');
            if (Statics.field2052 == null) {
                return;
            }
            URL var7 = new URL(Statics.field2052.getCodeBase(), "clienterror.ws?c=" + Statics.field2045 + "&u=" + Statics.field2048 + "&v1=" + Statics.field1901 + "&v2=" + Statics.field1900 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("dl.k(Ljava/lang/Throwable;Ljava/lang/String;)Lev;")
    public static class132 method2464(Throwable arg0, String arg1) {
        class132 var2;
        if (arg0 instanceof class132) {
            var2 = (class132) arg0;
            var2.field2046 = var2.field2046 + ' ' + arg1;
        } else {
            var2 = new class132(arg0, arg1);
        }
        return var2;
    }
}
