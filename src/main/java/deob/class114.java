package deob;

@ObfuscatedName("da")
public class class114 {

    @ObfuscatedName("da.l")
    public static int field1907 = 0;

    @ObfuscatedName("da.b")
    public static int field1906 = 0;

    @ObfuscatedName("da.o")
    public static int field1913 = 0;

    @ObfuscatedName("da.w")
    public static byte[][] field1908 = new byte[1000][];

    @ObfuscatedName("da.r")
    public static byte[][] field1909 = new byte[250][];

    @ObfuscatedName("da.k")
    public static byte[][] field1910 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.l(II)[B")
    public static synchronized byte[] method2299(int arg0) {
        if (arg0 == 100 && field1907 > 0) {
            byte[] var1 = field1908[--field1907];
            field1908[field1907] = null;
            return var1;
        } else if (arg0 == 5000 && field1906 > 0) {
            byte[] var2 = field1909[--field1906];
            field1909[field1906] = null;
            return var2;
        } else if (arg0 == 30000 && field1913 > 0) {
            byte[] var3 = field1910[--field1913];
            field1910[field1913] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
