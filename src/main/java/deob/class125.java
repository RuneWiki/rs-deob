package deob;

@ObfuscatedName("dc")
public class class125 {

    @ObfuscatedName("dc.s")
    public static int field2050 = 0;

    @ObfuscatedName("dc.z")
    public static int field2051 = 0;

    @ObfuscatedName("dc.t")
    public static int field2040 = 0;

    @ObfuscatedName("dc.y")
    public static byte[][] field2041 = new byte[1000][];

    @ObfuscatedName("dc.p")
    public static byte[][] field2042 = new byte[250][];

    @ObfuscatedName("dc.g")
    public static byte[][] field2047 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.s(II)[B")
    public static synchronized byte[] method2622(int arg0) {
        if (arg0 == 100 && field2050 > 0) {
            byte[] var1 = field2041[--field2050];
            field2041[field2050] = null;
            return var1;
        } else if (arg0 == 5000 && field2051 > 0) {
            byte[] var2 = field2042[--field2051];
            field2042[field2051] = null;
            return var2;
        } else if (arg0 == 30000 && field2040 > 0) {
            byte[] var3 = field2047[--field2040];
            field2047[field2040] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
