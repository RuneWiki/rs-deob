package deob;

@ObfuscatedName("dt")
public class class125 {

    @ObfuscatedName("dt.f")
    public static int field2066 = 0;

    @ObfuscatedName("dt.e")
    public static int field2063 = 0;

    @ObfuscatedName("dt.n")
    public static int field2064 = 0;

    @ObfuscatedName("dt.t")
    public static byte[][] field2062 = new byte[1000][];

    @ObfuscatedName("dt.v")
    public static byte[][] field2069 = new byte[250][];

    @ObfuscatedName("dt.b")
    public static byte[][] field2067 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.f(II)[B")
    public static synchronized byte[] method2629(int arg0) {
        if (arg0 == 100 && field2066 > 0) {
            byte[] var1 = field2062[--field2066];
            field2062[field2066] = null;
            return var1;
        } else if (arg0 == 5000 && field2063 > 0) {
            byte[] var2 = field2069[--field2063];
            field2069[field2063] = null;
            return var2;
        } else if (arg0 == 30000 && field2064 > 0) {
            byte[] var3 = field2067[--field2064];
            field2067[field2064] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
