package deob;

@ObfuscatedName("dh")
public class class114 {

    @ObfuscatedName("dh.f")
    public static int field1912 = 0;

    @ObfuscatedName("dh.t")
    public static int field1911 = 0;

    @ObfuscatedName("dh.n")
    public static int field1915 = 0;

    @ObfuscatedName("dh.e")
    public static byte[][] field1913 = new byte[1000][];

    @ObfuscatedName("dh.l")
    public static byte[][] field1922 = new byte[250][];

    @ObfuscatedName("dh.d")
    public static byte[][] field1916 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.f(IS)[B")
    public static synchronized byte[] method2310(int arg0) {
        if (arg0 == 100 && field1912 > 0) {
            byte[] var1 = field1913[--field1912];
            field1913[field1912] = null;
            return var1;
        } else if (arg0 == 5000 && field1911 > 0) {
            byte[] var2 = field1922[--field1911];
            field1922[field1911] = null;
            return var2;
        } else if (arg0 == 30000 && field1915 > 0) {
            byte[] var3 = field1916[--field1915];
            field1916[field1915] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
