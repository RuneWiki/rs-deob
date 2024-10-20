package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("k")
public class class10 {

    @ObfuscatedName("k.p")
    public static final BigInteger field155 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("k.h")
    public static final BigInteger field162 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.e(I)J")
    public static long method1060() {
        try {
            URL var0 = new URL(Statics.method624("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class120 var4 = new class120(new byte[1000]);
            do {
                int var5 = var3.read(var4.field1981, var4.field1977, 1000 - var4.field1977);
                if (var5 == -1) {
                    var4.field1977 = 0;
                    return var4.method2361();
                }
                var4.field1977 += var5;
            } while (var4.field1977 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }
}
