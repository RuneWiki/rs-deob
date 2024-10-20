package deob;

@ObfuscatedName("dt")
public class class106 {

    @ObfuscatedName("dt.z")
    public static int field1835 = 0;

    @ObfuscatedName("dt.n")
    public static int field1830 = 0;

    @ObfuscatedName("dt.u")
    public static int field1828 = 0;

    @ObfuscatedName("dt.t")
    public static byte[][] field1834 = new byte[1000][];

    @ObfuscatedName("dt.e")
    public static byte[][] field1826 = new byte[250][];

    @ObfuscatedName("dt.a")
    public static byte[][] field1831 = new byte[50][];

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.z(II)[B")
    public static synchronized byte[] method2363(int arg0) {
        if (arg0 == 100 && field1835 > 0) {
            byte[] var1 = field1834[--field1835];
            field1834[field1835] = null;
            return var1;
        } else if (arg0 == 5000 && field1830 > 0) {
            byte[] var2 = field1826[--field1830];
            field1826[field1830] = null;
            return var2;
        } else if (arg0 == 30000 && field1828 > 0) {
            byte[] var3 = field1831[--field1828];
            field1831[field1828] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
