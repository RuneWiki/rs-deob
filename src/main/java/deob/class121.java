package deob;

@ObfuscatedName("ds")
public class class121 {

    @ObfuscatedName("ds.m")
    public static int field1966 = 0;

    @ObfuscatedName("ds.l")
    public static int field1961 = 0;

    @ObfuscatedName("ds.y")
    public static int field1963 = 0;

    @ObfuscatedName("ds.u")
    public static byte[][] field1962 = new byte[1000][];

    @ObfuscatedName("ds.k")
    public static byte[][] field1964 = new byte[250][];

    @ObfuscatedName("ds.j")
    public static byte[][] field1965 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.m(IB)[B")
    public static synchronized byte[] method2626(int arg0) {
        if (arg0 == 100 && field1966 > 0) {
            byte[] var1 = field1962[--field1966];
            field1962[field1966] = null;
            return var1;
        } else if (arg0 == 5000 && field1961 > 0) {
            byte[] var2 = field1964[--field1961];
            field1964[field1961] = null;
            return var2;
        } else if (arg0 == 30000 && field1963 > 0) {
            byte[] var3 = field1965[--field1963];
            field1965[field1963] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
