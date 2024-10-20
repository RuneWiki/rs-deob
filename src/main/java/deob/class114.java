package deob;

@ObfuscatedName("dc")
public class class114 {

    @ObfuscatedName("dc.i")
    public static int field1940 = 0;

    @ObfuscatedName("dc.w")
    public static int field1938 = 0;

    @ObfuscatedName("dc.f")
    public static int field1939 = 0;

    @ObfuscatedName("dc.e")
    public static byte[][] field1945 = new byte[1000][];

    @ObfuscatedName("dc.t")
    public static byte[][] field1941 = new byte[250][];

    @ObfuscatedName("dc.d")
    public static byte[][] field1942 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.i(IB)[B")
    public static synchronized byte[] method2319(int arg0) {
        if (arg0 == 100 && field1940 > 0) {
            byte[] var1 = field1945[--field1940];
            field1945[field1940] = null;
            return var1;
        } else if (arg0 == 5000 && field1938 > 0) {
            byte[] var2 = field1941[--field1938];
            field1941[field1938] = null;
            return var2;
        } else if (arg0 == 30000 && field1939 > 0) {
            byte[] var3 = field1942[--field1939];
            field1942[field1939] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
