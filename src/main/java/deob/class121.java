package deob;

@ObfuscatedName("dq")
public class class121 {

    @ObfuscatedName("dq.c")
    public static int field1971 = 0;

    @ObfuscatedName("dq.h")
    public static int field1970 = 0;

    @ObfuscatedName("dq.k")
    public static int field1966 = 0;

    @ObfuscatedName("dq.t")
    public static byte[][] field1973 = new byte[1000][];

    @ObfuscatedName("dq.g")
    public static byte[][] field1968 = new byte[250][];

    @ObfuscatedName("dq.o")
    public static byte[][] field1969 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.c(IS)[B")
    public static synchronized byte[] method2522(int arg0) {
        if (arg0 == 100 && field1971 > 0) {
            byte[] var1 = field1973[--field1971];
            field1973[field1971] = null;
            return var1;
        } else if (arg0 == 5000 && field1970 > 0) {
            byte[] var2 = field1968[--field1970];
            field1968[field1970] = null;
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
