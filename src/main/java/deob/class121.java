package deob;

@ObfuscatedName("dc")
public class class121 {

    @ObfuscatedName("dc.h")
    public static int field1986 = 0;

    @ObfuscatedName("dc.q")
    public static int field1979 = 0;

    @ObfuscatedName("dc.v")
    public static int field1981 = 0;

    @ObfuscatedName("dc.n")
    public static byte[][] field1982 = new byte[1000][];

    @ObfuscatedName("dc.f")
    public static byte[][] field1983 = new byte[250][];

    @ObfuscatedName("dc.g")
    public static byte[][] field1984 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.h(IB)[B")
    public static synchronized byte[] method2624(int arg0) {
        if (arg0 == 100 && field1986 > 0) {
            byte[] var1 = field1982[--field1986];
            field1982[field1986] = null;
            return var1;
        } else if (arg0 == 5000 && field1979 > 0) {
            byte[] var2 = field1983[--field1979];
            field1983[field1979] = null;
            return var2;
        } else if (arg0 == 30000 && field1981 > 0) {
            byte[] var3 = field1984[--field1981];
            field1984[field1981] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
