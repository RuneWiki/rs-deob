package deob;

@ObfuscatedName("dq")
public class class113 {

    @ObfuscatedName("dq.o")
    public static int field1866 = 0;

    @ObfuscatedName("dq.l")
    public static int field1875 = 0;

    @ObfuscatedName("dq.g")
    public static int field1868 = 0;

    @ObfuscatedName("dq.u")
    public static byte[][] field1869 = new byte[1000][];

    @ObfuscatedName("dq.q")
    public static byte[][] field1867 = new byte[250][];

    @ObfuscatedName("dq.r")
    public static byte[][] field1871 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.o(II)[B")
    public static synchronized byte[] method2473(int arg0) {
        if (arg0 == 100 && field1866 > 0) {
            byte[] var1 = field1869[--field1866];
            field1869[field1866] = null;
            return var1;
        } else if (arg0 == 5000 && field1875 > 0) {
            byte[] var2 = field1867[--field1875];
            field1867[field1875] = null;
            return var2;
        } else if (arg0 == 30000 && field1868 > 0) {
            byte[] var3 = field1871[--field1868];
            field1871[field1868] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
