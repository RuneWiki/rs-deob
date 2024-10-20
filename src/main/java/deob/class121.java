package deob;

@ObfuscatedName("do")
public class class121 {

    @ObfuscatedName("do.k")
    public static int field1971 = 0;

    @ObfuscatedName("do.h")
    public static int field1965 = 0;

    @ObfuscatedName("do.o")
    public static int field1966 = 0;

    @ObfuscatedName("do.z")
    public static byte[][] field1968 = new byte[1000][];

    @ObfuscatedName("do.c")
    public static byte[][] field1967 = new byte[250][];

    @ObfuscatedName("do.d")
    public static byte[][] field1969 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.k(II)[B")
    public static synchronized byte[] method2560(int arg0) {
        if (arg0 == 100 && field1971 > 0) {
            byte[] var1 = field1968[--field1971];
            field1968[field1971] = null;
            return var1;
        } else if (arg0 == 5000 && field1965 > 0) {
            byte[] var2 = field1967[--field1965];
            field1967[field1965] = null;
            return var2;
        } else if (arg0 == 30000 && field1966 > 0) {
            byte[] var3 = field1969[--field1966];
            field1969[field1966] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
