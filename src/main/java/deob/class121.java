package deob;

@ObfuscatedName("dq")
public class class121 {

    @ObfuscatedName("dq.d")
    public static int field1981 = 0;

    @ObfuscatedName("dq.p")
    public static int field1975 = 0;

    @ObfuscatedName("dq.v")
    public static int field1977 = 0;

    @ObfuscatedName("dq.l")
    public static byte[][] field1978 = new byte[1000][];

    @ObfuscatedName("dq.y")
    public static byte[][] field1979 = new byte[250][];

    @ObfuscatedName("dq.w")
    public static byte[][] field1984 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.d(II)[B")
    public static synchronized byte[] method2609(int arg0) {
        if (arg0 == 100 && field1981 > 0) {
            byte[] var1 = field1978[--field1981];
            field1978[field1981] = null;
            return var1;
        } else if (arg0 == 5000 && field1975 > 0) {
            byte[] var2 = field1979[--field1975];
            field1979[field1975] = null;
            return var2;
        } else if (arg0 == 30000 && field1977 > 0) {
            byte[] var3 = field1984[--field1977];
            field1984[field1977] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
