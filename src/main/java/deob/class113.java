package deob;

@ObfuscatedName("dm")
public class class113 {

    @ObfuscatedName("dm.e")
    public static int field1853 = 0;

    @ObfuscatedName("dm.a")
    public static int field1843 = 0;

    @ObfuscatedName("dm.l")
    public static int field1844 = 0;

    @ObfuscatedName("dm.c")
    public static byte[][] field1852 = new byte[1000][];

    @ObfuscatedName("dm.u")
    public static byte[][] field1846 = new byte[250][];

    @ObfuscatedName("dm.w")
    public static byte[][] field1847 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.e(IB)[B")
    public static synchronized byte[] method2435(int arg0) {
        if (arg0 == 100 && field1853 > 0) {
            byte[] var1 = field1852[--field1853];
            field1852[field1853] = null;
            return var1;
        } else if (arg0 == 5000 && field1843 > 0) {
            byte[] var2 = field1846[--field1843];
            field1846[field1843] = null;
            return var2;
        } else if (arg0 == 30000 && field1844 > 0) {
            byte[] var3 = field1847[--field1844];
            field1847[field1844] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
