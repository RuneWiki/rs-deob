package deob;

@ObfuscatedName("dc")
public class class110 {

    @ObfuscatedName("dc.f")
    public static int field1864 = 0;

    @ObfuscatedName("dc.k")
    public static int field1860 = 0;

    @ObfuscatedName("dc.y")
    public static int field1862 = 0;

    @ObfuscatedName("dc.e")
    public static byte[][] field1863 = new byte[1000][];

    @ObfuscatedName("dc.r")
    public static byte[][] field1861 = new byte[250][];

    @ObfuscatedName("dc.a")
    public static byte[][] field1865 = new byte[50][];

    public class110() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.f(IB)[B")
    public static synchronized byte[] method2389(int arg0) {
        if (arg0 == 100 && field1864 > 0) {
            byte[] var1 = field1863[--field1864];
            field1863[field1864] = null;
            return var1;
        } else if (arg0 == 5000 && field1860 > 0) {
            byte[] var2 = field1861[--field1860];
            field1861[field1860] = null;
            return var2;
        } else if (arg0 == 30000 && field1862 > 0) {
            byte[] var3 = field1865[--field1862];
            field1865[field1862] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
