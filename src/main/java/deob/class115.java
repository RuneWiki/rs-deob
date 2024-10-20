package deob;

@ObfuscatedName("dw")
public class class115 {

    @ObfuscatedName("dw.e")
    public static int field1930 = 0;

    @ObfuscatedName("dw.i")
    public static int field1929 = 0;

    @ObfuscatedName("dw.k")
    public static int field1928 = 0;

    @ObfuscatedName("dw.q")
    public static byte[][] field1933 = new byte[1000][];

    @ObfuscatedName("dw.j")
    public static byte[][] field1931 = new byte[250][];

    @ObfuscatedName("dw.z")
    public static byte[][] field1932 = new byte[50][];

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.e(IB)[B")
    public static synchronized byte[] method2318(int arg0) {
        if (arg0 == 100 && field1930 > 0) {
            byte[] var1 = field1933[--field1930];
            field1933[field1930] = null;
            return var1;
        } else if (arg0 == 5000 && field1929 > 0) {
            byte[] var2 = field1931[--field1929];
            field1931[field1929] = null;
            return var2;
        } else if (arg0 == 30000 && field1928 > 0) {
            byte[] var3 = field1932[--field1928];
            field1932[field1928] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
