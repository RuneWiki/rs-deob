package deob;

@ObfuscatedName("dy")
public class class114 {

    @ObfuscatedName("dy.p")
    public static int field1934 = 0;

    @ObfuscatedName("dy.i")
    public static int field1930 = 0;

    @ObfuscatedName("dy.o")
    public static int field1931 = 0;

    @ObfuscatedName("dy.n")
    public static byte[][] field1932 = new byte[1000][];

    @ObfuscatedName("dy.l")
    public static byte[][] field1933 = new byte[250][];

    @ObfuscatedName("dy.v")
    public static byte[][] field1929 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.p(II)[B")
    public static synchronized byte[] method2343(int arg0) {
        if (arg0 == 100 && field1934 > 0) {
            byte[] var1 = field1932[--field1934];
            field1932[field1934] = null;
            return var1;
        } else if (arg0 == 5000 && field1930 > 0) {
            byte[] var2 = field1933[--field1930];
            field1933[field1930] = null;
            return var2;
        } else if (arg0 == 30000 && field1931 > 0) {
            byte[] var3 = field1929[--field1931];
            field1929[field1931] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
