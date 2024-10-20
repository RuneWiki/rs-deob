package deob;

@ObfuscatedName("dh")
public class class122 {

    @ObfuscatedName("dh.j")
    public static int field1981 = 0;

    @ObfuscatedName("dh.h")
    public static int field1980 = 0;

    @ObfuscatedName("dh.m")
    public static int field1987 = 0;

    @ObfuscatedName("dh.z")
    public static byte[][] field1983 = new byte[1000][];

    @ObfuscatedName("dh.x")
    public static byte[][] field1984 = new byte[250][];

    @ObfuscatedName("dh.e")
    public static byte[][] field1982 = new byte[50][];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.j(II)[B")
    public static synchronized byte[] method2591(int arg0) {
        if (arg0 == 100 && field1981 > 0) {
            byte[] var1 = field1983[--field1981];
            field1983[field1981] = null;
            return var1;
        } else if (arg0 == 5000 && field1980 > 0) {
            byte[] var2 = field1984[--field1980];
            field1984[field1980] = null;
            return var2;
        } else if (arg0 == 30000 && field1987 > 0) {
            byte[] var3 = field1982[--field1987];
            field1982[field1987] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
