package deob;

@ObfuscatedName("dq")
public class class112 {

    @ObfuscatedName("dq.a")
    public static int field1874 = 0;

    @ObfuscatedName("dq.v")
    public static int field1868 = 0;

    @ObfuscatedName("dq.i")
    public static int field1870 = 0;

    @ObfuscatedName("dq.b")
    public static byte[][] field1871 = new byte[1000][];

    @ObfuscatedName("dq.l")
    public static byte[][] field1872 = new byte[250][];

    @ObfuscatedName("dq.m")
    public static byte[][] field1873 = new byte[50][];

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.a(II)[B")
    public static synchronized byte[] method2360(int arg0) {
        if (arg0 == 100 && field1874 > 0) {
            byte[] var1 = field1871[--field1874];
            field1871[field1874] = null;
            return var1;
        } else if (arg0 == 5000 && field1868 > 0) {
            byte[] var2 = field1872[--field1868];
            field1872[field1868] = null;
            return var2;
        } else if (arg0 == 30000 && field1870 > 0) {
            byte[] var3 = field1873[--field1870];
            field1873[field1870] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
