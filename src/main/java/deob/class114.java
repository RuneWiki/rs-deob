package deob;

@ObfuscatedName("dz")
public class class114 {

    @ObfuscatedName("dz.i")
    public static int field1936 = 0;

    @ObfuscatedName("dz.v")
    public static int field1935 = 0;

    @ObfuscatedName("dz.m")
    public static int field1934 = 0;

    @ObfuscatedName("dz.j")
    public static byte[][] field1941 = new byte[1000][];

    @ObfuscatedName("dz.o")
    public static byte[][] field1938 = new byte[250][];

    @ObfuscatedName("dz.l")
    public static byte[][] field1939 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.i(IB)[B")
    public static synchronized byte[] method2343(int arg0) {
        if (arg0 == 100 && field1936 > 0) {
            byte[] var1 = field1941[--field1936];
            field1941[field1936] = null;
            return var1;
        } else if (arg0 == 5000 && field1935 > 0) {
            byte[] var2 = field1938[--field1935];
            field1938[field1935] = null;
            return var2;
        } else if (arg0 == 30000 && field1934 > 0) {
            byte[] var3 = field1939[--field1934];
            field1939[field1934] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
