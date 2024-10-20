package deob;

@ObfuscatedName("dq")
public class class109 {

    @ObfuscatedName("dq.g")
    public static int field1852 = 0;

    @ObfuscatedName("dq.v")
    public static int field1844 = 0;

    @ObfuscatedName("dq.z")
    public static int field1845 = 0;

    @ObfuscatedName("dq.h")
    public static byte[][] field1846 = new byte[1000][];

    @ObfuscatedName("dq.k")
    public static byte[][] field1847 = new byte[250][];

    @ObfuscatedName("dq.l")
    public static byte[][] field1853 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.g(IB)[B")
    public static synchronized byte[] method2343(int arg0) {
        if (arg0 == 100 && field1852 > 0) {
            byte[] var1 = field1846[--field1852];
            field1846[field1852] = null;
            return var1;
        } else if (arg0 == 5000 && field1844 > 0) {
            byte[] var2 = field1847[--field1844];
            field1847[field1844] = null;
            return var2;
        } else if (arg0 == 30000 && field1845 > 0) {
            byte[] var3 = field1853[--field1845];
            field1853[field1845] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
