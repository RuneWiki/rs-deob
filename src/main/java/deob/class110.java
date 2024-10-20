package deob;

@ObfuscatedName("dv")
public class class110 {

    @ObfuscatedName("dv.x")
    public static int field1860 = 0;

    @ObfuscatedName("dv.v")
    public static int field1855 = 0;

    @ObfuscatedName("dv.m")
    public static int field1850 = 0;

    @ObfuscatedName("dv.e")
    public static byte[][] field1854 = new byte[1000][];

    @ObfuscatedName("dv.h")
    public static byte[][] field1849 = new byte[250][];

    @ObfuscatedName("dv.p")
    public static byte[][] field1853 = new byte[50][];

    public class110() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.x(II)[B")
    public static synchronized byte[] method2361(int arg0) {
        if (arg0 == 100 && field1860 > 0) {
            byte[] var1 = field1854[--field1860];
            field1854[field1860] = null;
            return var1;
        } else if (arg0 == 5000 && field1855 > 0) {
            byte[] var2 = field1849[--field1855];
            field1849[field1855] = null;
            return var2;
        } else if (arg0 == 30000 && field1850 > 0) {
            byte[] var3 = field1853[--field1850];
            field1853[field1850] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
