package deob;

@ObfuscatedName("dy")
public class class125 {

    @ObfuscatedName("dy.x")
    public static int field2068 = 0;

    @ObfuscatedName("dy.r")
    public static int field2063 = 0;

    @ObfuscatedName("dy.j")
    public static int field2064 = 0;

    @ObfuscatedName("dy.z")
    public static byte[][] field2065 = new byte[1000][];

    @ObfuscatedName("dy.i")
    public static byte[][] field2066 = new byte[250][];

    @ObfuscatedName("dy.b")
    public static byte[][] field2067 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.x(II)[B")
    public static synchronized byte[] method2664(int arg0) {
        if (arg0 == 100 && field2068 > 0) {
            byte[] var1 = field2065[--field2068];
            field2065[field2068] = null;
            return var1;
        } else if (arg0 == 5000 && field2063 > 0) {
            byte[] var2 = field2066[--field2063];
            field2066[field2063] = null;
            return var2;
        } else if (arg0 == 30000 && field2064 > 0) {
            byte[] var3 = field2067[--field2064];
            field2067[field2064] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
