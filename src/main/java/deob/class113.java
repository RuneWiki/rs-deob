package deob;

@ObfuscatedName("dg")
public class class113 {

    @ObfuscatedName("dg.u")
    public static int field1911 = 0;

    @ObfuscatedName("dg.k")
    public static int field1907 = 0;

    @ObfuscatedName("dg.x")
    public static int field1906 = 0;

    @ObfuscatedName("dg.m")
    public static byte[][] field1908 = new byte[1000][];

    @ObfuscatedName("dg.n")
    public static byte[][] field1910 = new byte[250][];

    @ObfuscatedName("dg.q")
    public static byte[][] field1909 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.u(II)[B")
    public static synchronized byte[] method2313(int arg0) {
        if (arg0 == 100 && field1911 > 0) {
            byte[] var1 = field1908[--field1911];
            field1908[field1911] = null;
            return var1;
        } else if (arg0 == 5000 && field1907 > 0) {
            byte[] var2 = field1910[--field1907];
            field1910[field1907] = null;
            return var2;
        } else if (arg0 == 30000 && field1906 > 0) {
            byte[] var3 = field1909[--field1906];
            field1909[field1906] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
