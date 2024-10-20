package deob;

@ObfuscatedName("df")
public class class125 {

    @ObfuscatedName("df.l")
    public static int field2066 = 0;

    @ObfuscatedName("df.g")
    public static int field2060 = 0;

    @ObfuscatedName("df.r")
    public static int field2062 = 0;

    @ObfuscatedName("df.e")
    public static byte[][] field2059 = new byte[1000][];

    @ObfuscatedName("df.h")
    public static byte[][] field2063 = new byte[250][];

    @ObfuscatedName("df.s")
    public static byte[][] field2064 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.l(II)[B")
    public static synchronized byte[] method2751(int arg0) {
        if (arg0 == 100 && field2066 > 0) {
            byte[] var1 = field2059[--field2066];
            field2059[field2066] = null;
            return var1;
        } else if (arg0 == 5000 && field2060 > 0) {
            byte[] var2 = field2063[--field2060];
            field2063[field2060] = null;
            return var2;
        } else if (arg0 == 30000 && field2062 > 0) {
            byte[] var3 = field2064[--field2062];
            field2064[field2062] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
