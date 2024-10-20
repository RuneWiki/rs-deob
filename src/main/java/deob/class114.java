package deob;

@ObfuscatedName("dc")
public class class114 {

    @ObfuscatedName("dc.p")
    public static int field1936 = 0;

    @ObfuscatedName("dc.e")
    public static int field1937 = 0;

    @ObfuscatedName("dc.a")
    public static int field1938 = 0;

    @ObfuscatedName("dc.h")
    public static byte[][] field1939 = new byte[1000][];

    @ObfuscatedName("dc.y")
    public static byte[][] field1940 = new byte[250][];

    @ObfuscatedName("dc.j")
    public static byte[][] field1941 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.p(IB)[B")
    public static synchronized byte[] method2337(int arg0) {
        if (arg0 == 100 && field1936 > 0) {
            byte[] var1 = field1939[--field1936];
            field1939[field1936] = null;
            return var1;
        } else if (arg0 == 5000 && field1937 > 0) {
            byte[] var2 = field1940[--field1937];
            field1940[field1937] = null;
            return var2;
        } else if (arg0 == 30000 && field1938 > 0) {
            byte[] var3 = field1941[--field1938];
            field1941[field1938] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
