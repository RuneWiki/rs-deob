package deob;

@ObfuscatedName("dc")
public class class114 {

    @ObfuscatedName("dc.a")
    public static int field1911 = 0;

    @ObfuscatedName("dc.r")
    public static int field1909 = 0;

    @ObfuscatedName("dc.u")
    public static int field1910 = 0;

    @ObfuscatedName("dc.t")
    public static byte[][] field1919 = new byte[1000][];

    @ObfuscatedName("dc.k")
    public static byte[][] field1912 = new byte[250][];

    @ObfuscatedName("dc.x")
    public static byte[][] field1913 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.a(II)[B")
    public static synchronized byte[] method2250(int arg0) {
        if (arg0 == 100 && field1911 > 0) {
            byte[] var1 = field1919[--field1911];
            field1919[field1911] = null;
            return var1;
        } else if (arg0 == 5000 && field1909 > 0) {
            byte[] var2 = field1912[--field1909];
            field1912[field1909] = null;
            return var2;
        } else if (arg0 == 30000 && field1910 > 0) {
            byte[] var3 = field1913[--field1910];
            field1913[field1910] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
