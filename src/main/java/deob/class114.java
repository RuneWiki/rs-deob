package deob;

@ObfuscatedName("dx")
public class class114 {

    @ObfuscatedName("dx.b")
    public static int field1947 = 0;

    @ObfuscatedName("dx.c")
    public static int field1949 = 0;

    @ObfuscatedName("dx.j")
    public static int field1944 = 0;

    @ObfuscatedName("dx.i")
    public static byte[][] field1943 = new byte[1000][];

    @ObfuscatedName("dx.k")
    public static byte[][] field1942 = new byte[250][];

    @ObfuscatedName("dx.q")
    public static byte[][] field1946 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.b(IB)[B")
    public static synchronized byte[] method2264(int arg0) {
        if (arg0 == 100 && field1947 > 0) {
            byte[] var1 = field1943[--field1947];
            field1943[field1947] = null;
            return var1;
        } else if (arg0 == 5000 && field1949 > 0) {
            byte[] var2 = field1942[--field1949];
            field1942[field1949] = null;
            return var2;
        } else if (arg0 == 30000 && field1944 > 0) {
            byte[] var3 = field1946[--field1944];
            field1946[field1944] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
