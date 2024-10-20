package deob;

@ObfuscatedName("dw")
public class class109 {

    @ObfuscatedName("dw.j")
    public static int field1861 = 0;

    @ObfuscatedName("dw.z")
    public static int field1854 = 0;

    @ObfuscatedName("dw.y")
    public static int field1856 = 0;

    @ObfuscatedName("dw.h")
    public static byte[][] field1857 = new byte[1000][];

    @ObfuscatedName("dw.r")
    public static byte[][] field1858 = new byte[250][];

    @ObfuscatedName("dw.e")
    public static byte[][] field1855 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.j(II)[B")
    public static synchronized byte[] method2362(int arg0) {
        if (arg0 == 100 && field1861 > 0) {
            byte[] var1 = field1857[--field1861];
            field1857[field1861] = null;
            return var1;
        } else if (arg0 == 5000 && field1854 > 0) {
            byte[] var2 = field1858[--field1854];
            field1858[field1854] = null;
            return var2;
        } else if (arg0 == 30000 && field1856 > 0) {
            byte[] var3 = field1855[--field1856];
            field1855[field1856] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
