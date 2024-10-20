package deob;

@ObfuscatedName("dl")
public class class115 {

    @ObfuscatedName("dl.i")
    public static int field1936 = 0;

    @ObfuscatedName("dl.b")
    public static int field1935 = 0;

    @ObfuscatedName("dl.r")
    public static int field1938 = 0;

    @ObfuscatedName("dl.l")
    public static byte[][] field1937 = new byte[1000][];

    @ObfuscatedName("dl.s")
    public static byte[][] field1934 = new byte[250][];

    @ObfuscatedName("dl.d")
    public static byte[][] field1939 = new byte[50][];

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.i(IB)[B")
    public static synchronized byte[] method2326(int arg0) {
        if (arg0 == 100 && field1936 > 0) {
            byte[] var1 = field1937[--field1936];
            field1937[field1936] = null;
            return var1;
        } else if (arg0 == 5000 && field1935 > 0) {
            byte[] var2 = field1934[--field1935];
            field1934[field1935] = null;
            return var2;
        } else if (arg0 == 30000 && field1938 > 0) {
            byte[] var3 = field1939[--field1938];
            field1939[field1938] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
