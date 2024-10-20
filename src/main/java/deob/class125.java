package deob;

@ObfuscatedName("dh")
public class class125 {

    @ObfuscatedName("dh.e")
    public static int field2070 = 0;

    @ObfuscatedName("dh.l")
    public static int field2066 = 0;

    @ObfuscatedName("dh.c")
    public static int field2067 = 0;

    @ObfuscatedName("dh.h")
    public static byte[][] field2068 = new byte[1000][];

    @ObfuscatedName("dh.r")
    public static byte[][] field2072 = new byte[250][];

    @ObfuscatedName("dh.a")
    public static byte[][] field2069 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.e(II)[B")
    public static synchronized byte[] method2702(int arg0) {
        if (arg0 == 100 && field2070 > 0) {
            byte[] var1 = field2068[--field2070];
            field2068[field2070] = null;
            return var1;
        } else if (arg0 == 5000 && field2066 > 0) {
            byte[] var2 = field2072[--field2066];
            field2072[field2066] = null;
            return var2;
        } else if (arg0 == 30000 && field2067 > 0) {
            byte[] var3 = field2069[--field2067];
            field2069[field2067] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
