package deob;

@ObfuscatedName("di")
public class class125 {

    @ObfuscatedName("di.k")
    public static int field2071 = 0;

    @ObfuscatedName("di.q")
    public static int field2064 = 0;

    @ObfuscatedName("di.f")
    public static int field2065 = 0;

    @ObfuscatedName("di.c")
    public static byte[][] field2066 = new byte[1000][];

    @ObfuscatedName("di.v")
    public static byte[][] field2063 = new byte[250][];

    @ObfuscatedName("di.j")
    public static byte[][] field2068 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.k(II)[B")
    public static synchronized byte[] method2657(int arg0) {
        if (arg0 == 100 && field2071 > 0) {
            byte[] var1 = field2066[--field2071];
            field2066[field2071] = null;
            return var1;
        } else if (arg0 == 5000 && field2064 > 0) {
            byte[] var2 = field2063[--field2064];
            field2063[field2064] = null;
            return var2;
        } else if (arg0 == 30000 && field2065 > 0) {
            byte[] var3 = field2068[--field2065];
            field2068[field2065] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
