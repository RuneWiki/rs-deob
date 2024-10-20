package deob;

@ObfuscatedName("dy")
public class class125 {

    @ObfuscatedName("dy.a")
    public static int field2082 = 0;

    @ObfuscatedName("dy.d")
    public static int field2079 = 0;

    @ObfuscatedName("dy.v")
    public static int field2081 = 0;

    @ObfuscatedName("dy.r")
    public static byte[][] field2080 = new byte[1000][];

    @ObfuscatedName("dy.z")
    public static byte[][] field2085 = new byte[250][];

    @ObfuscatedName("dy.t")
    public static byte[][] field2084 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.a(IS)[B")
    public static synchronized byte[] method2645(int arg0) {
        if (arg0 == 100 && field2082 > 0) {
            byte[] var1 = field2080[--field2082];
            field2080[field2082] = null;
            return var1;
        } else if (arg0 == 5000 && field2079 > 0) {
            byte[] var2 = field2085[--field2079];
            field2085[field2079] = null;
            return var2;
        } else if (arg0 == 30000 && field2081 > 0) {
            byte[] var3 = field2084[--field2081];
            field2084[field2081] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
