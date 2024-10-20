package deob;

@ObfuscatedName("dv")
public class class125 {

    @ObfuscatedName("dv.m")
    public static int field2056 = 0;

    @ObfuscatedName("dv.w")
    public static int field2054 = 0;

    @ObfuscatedName("dv.e")
    public static int field2060 = 0;

    @ObfuscatedName("dv.o")
    public static byte[][] field2059 = new byte[1000][];

    @ObfuscatedName("dv.g")
    public static byte[][] field2057 = new byte[250][];

    @ObfuscatedName("dv.l")
    public static byte[][] field2058 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.m(II)[B")
    public static synchronized byte[] method2635(int arg0) {
        if (arg0 == 100 && field2056 > 0) {
            byte[] var1 = field2059[--field2056];
            field2059[field2056] = null;
            return var1;
        } else if (arg0 == 5000 && field2054 > 0) {
            byte[] var2 = field2057[--field2054];
            field2057[field2054] = null;
            return var2;
        } else if (arg0 == 30000 && field2060 > 0) {
            byte[] var3 = field2058[--field2060];
            field2058[field2060] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
