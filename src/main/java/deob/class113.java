package deob;

@ObfuscatedName("dw")
public class class113 {

    @ObfuscatedName("dw.p")
    public static int field1943 = 0;

    @ObfuscatedName("dw.j")
    public static int field1941 = 0;

    @ObfuscatedName("dw.w")
    public static int field1938 = 0;

    @ObfuscatedName("dw.h")
    public static byte[][] field1939 = new byte[1000][];

    @ObfuscatedName("dw.v")
    public static byte[][] field1940 = new byte[250][];

    @ObfuscatedName("dw.k")
    public static byte[][] field1937 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.p(II)[B")
    public static synchronized byte[] method2246(int arg0) {
        if (arg0 == 100 && field1943 > 0) {
            byte[] var1 = field1939[--field1943];
            field1939[field1943] = null;
            return var1;
        } else if (arg0 == 5000 && field1941 > 0) {
            byte[] var2 = field1940[--field1941];
            field1940[field1941] = null;
            return var2;
        } else if (arg0 == 30000 && field1938 > 0) {
            byte[] var3 = field1937[--field1938];
            field1937[field1938] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
