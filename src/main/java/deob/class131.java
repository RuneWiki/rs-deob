package deob;

@ObfuscatedName("eg")
public class class131 {

    @ObfuscatedName("eg.d")
    public static int field1965 = 0;

    @ObfuscatedName("eg.c")
    public static int field1967 = 0;

    @ObfuscatedName("eg.n")
    public static int field1966 = 0;

    @ObfuscatedName("eg.q")
    public static byte[][] field1968 = new byte[1000][];

    @ObfuscatedName("eg.t")
    public static byte[][] field1964 = new byte[250][];

    @ObfuscatedName("eg.p")
    public static byte[][] field1969 = new byte[50][];

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.d(II)[B")
    public static synchronized byte[] method2449(int arg0) {
        if (arg0 == 100 && field1965 > 0) {
            byte[] var1 = field1968[--field1965];
            field1968[field1965] = null;
            return var1;
        } else if (arg0 == 5000 && field1967 > 0) {
            byte[] var2 = field1964[--field1967];
            field1964[field1967] = null;
            return var2;
        } else if (arg0 == 30000 && field1966 > 0) {
            byte[] var3 = field1969[--field1966];
            field1969[field1966] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
