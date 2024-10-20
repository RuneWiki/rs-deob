package deob;

@ObfuscatedName("dv")
public class class109 {

    @ObfuscatedName("dv.t")
    public static int field1845 = 0;

    @ObfuscatedName("dv.o")
    public static int field1838 = 0;

    @ObfuscatedName("dv.i")
    public static int field1839 = 0;

    @ObfuscatedName("dv.p")
    public static byte[][] field1840 = new byte[1000][];

    @ObfuscatedName("dv.c")
    public static byte[][] field1837 = new byte[250][];

    @ObfuscatedName("dv.y")
    public static byte[][] field1844 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.t(II)[B")
    public static synchronized byte[] method2332(int arg0) {
        if (arg0 == 100 && field1845 > 0) {
            byte[] var1 = field1840[--field1845];
            field1840[field1845] = null;
            return var1;
        } else if (arg0 == 5000 && field1838 > 0) {
            byte[] var2 = field1837[--field1838];
            field1837[field1838] = null;
            return var2;
        } else if (arg0 == 30000 && field1839 > 0) {
            byte[] var3 = field1844[--field1839];
            field1844[field1839] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
