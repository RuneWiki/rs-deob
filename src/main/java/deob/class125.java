package deob;

@ObfuscatedName("dv")
public class class125 {

    @ObfuscatedName("dv.i")
    public static int field2059 = 0;

    @ObfuscatedName("dv.h")
    public static int field2052 = 0;

    @ObfuscatedName("dv.e")
    public static int field2055 = 0;

    @ObfuscatedName("dv.g")
    public static byte[][] field2054 = new byte[1000][];

    @ObfuscatedName("dv.n")
    public static byte[][] field2053 = new byte[250][];

    @ObfuscatedName("dv.u")
    public static byte[][] field2056 = new byte[50][];

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.i(IB)[B")
    public static synchronized byte[] method2640(int arg0) {
        if (arg0 == 100 && field2059 > 0) {
            byte[] var1 = field2054[--field2059];
            field2054[field2059] = null;
            return var1;
        } else if (arg0 == 5000 && field2052 > 0) {
            byte[] var2 = field2053[--field2052];
            field2053[field2052] = null;
            return var2;
        } else if (arg0 == 30000 && field2055 > 0) {
            byte[] var3 = field2056[--field2055];
            field2056[field2055] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
