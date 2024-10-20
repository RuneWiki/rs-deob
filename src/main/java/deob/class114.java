package deob;

@ObfuscatedName("dm")
public class class114 {

    @ObfuscatedName("dm.t")
    public static int field1951 = 0;

    @ObfuscatedName("dm.l")
    public static int field1950 = 0;

    @ObfuscatedName("dm.c")
    public static int field1954 = 0;

    @ObfuscatedName("dm.d")
    public static byte[][] field1952 = new byte[1000][];

    @ObfuscatedName("dm.b")
    public static byte[][] field1953 = new byte[250][];

    @ObfuscatedName("dm.i")
    public static byte[][] field1949 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.t(II)[B")
    public static synchronized byte[] method2309(int arg0) {
        if (arg0 == 100 && field1951 > 0) {
            byte[] var1 = field1952[--field1951];
            field1952[field1951] = null;
            return var1;
        } else if (arg0 == 5000 && field1950 > 0) {
            byte[] var2 = field1953[--field1950];
            field1953[field1950] = null;
            return var2;
        } else if (arg0 == 30000 && field1954 > 0) {
            byte[] var3 = field1949[--field1954];
            field1949[field1954] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
