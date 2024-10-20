package deob;

@ObfuscatedName("dg")
public class class121 {

    @ObfuscatedName("dg.z")
    public static int field1995 = 0;

    @ObfuscatedName("dg.q")
    public static int field1993 = 0;

    @ObfuscatedName("dg.k")
    public static int field1997 = 0;

    @ObfuscatedName("dg.f")
    public static byte[][] field1992 = new byte[1000][];

    @ObfuscatedName("dg.d")
    public static byte[][] field1996 = new byte[250][];

    @ObfuscatedName("dg.l")
    public static byte[][] field1994 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.z(II)[B")
    public static synchronized byte[] method2539(int arg0) {
        if (arg0 == 100 && field1995 > 0) {
            byte[] var1 = field1992[--field1995];
            field1992[field1995] = null;
            return var1;
        } else if (arg0 == 5000 && field1993 > 0) {
            byte[] var2 = field1996[--field1993];
            field1996[field1993] = null;
            return var2;
        } else if (arg0 == 30000 && field1997 > 0) {
            byte[] var3 = field1994[--field1997];
            field1994[field1997] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
