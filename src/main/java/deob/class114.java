package deob;

@ObfuscatedName("dr")
public class class114 {

    @ObfuscatedName("dr.c")
    public static int field1943 = 0;

    @ObfuscatedName("dr.q")
    public static int field1949 = 0;

    @ObfuscatedName("dr.y")
    public static int field1941 = 0;

    @ObfuscatedName("dr.v")
    public static byte[][] field1942 = new byte[1000][];

    @ObfuscatedName("dr.g")
    public static byte[][] field1944 = new byte[250][];

    @ObfuscatedName("dr.x")
    public static byte[][] field1945 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.c(II)[B")
    public static synchronized byte[] method2197(int arg0) {
        if (arg0 == 100 && field1943 > 0) {
            byte[] var1 = field1942[--field1943];
            field1942[field1943] = null;
            return var1;
        } else if (arg0 == 5000 && field1949 > 0) {
            byte[] var2 = field1944[--field1949];
            field1944[field1949] = null;
            return var2;
        } else if (arg0 == 30000 && field1941 > 0) {
            byte[] var3 = field1945[--field1941];
            field1945[field1941] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
