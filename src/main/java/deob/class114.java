package deob;

@ObfuscatedName("dy")
public class class114 {

    @ObfuscatedName("dy.j")
    public static int field1918 = 0;

    @ObfuscatedName("dy.r")
    public static int field1913 = 0;

    @ObfuscatedName("dy.v")
    public static int field1914 = 0;

    @ObfuscatedName("dy.p")
    public static byte[][] field1915 = new byte[1000][];

    @ObfuscatedName("dy.e")
    public static byte[][] field1917 = new byte[250][];

    @ObfuscatedName("dy.d")
    public static byte[][] field1912 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.j(IB)[B")
    public static synchronized byte[] method2310(int arg0) {
        if (arg0 == 100 && field1918 > 0) {
            byte[] var1 = field1915[--field1918];
            field1915[field1918] = null;
            return var1;
        } else if (arg0 == 5000 && field1913 > 0) {
            byte[] var2 = field1917[--field1913];
            field1917[field1913] = null;
            return var2;
        } else if (arg0 == 30000 && field1914 > 0) {
            byte[] var3 = field1912[--field1914];
            field1912[field1914] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
