package deob;

@ObfuscatedName("dv")
public class class121 {

    @ObfuscatedName("dv.a")
    public static int field1997 = 0;

    @ObfuscatedName("dv.r")
    public static int field1996 = 0;

    @ObfuscatedName("dv.f")
    public static int field1991 = 0;

    @ObfuscatedName("dv.s")
    public static byte[][] field1992 = new byte[1000][];

    @ObfuscatedName("dv.y")
    public static byte[][] field1993 = new byte[250][];

    @ObfuscatedName("dv.e")
    public static byte[][] field1994 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.a(II)[B")
    public static synchronized byte[] method2578(int arg0) {
        if (arg0 == 100 && field1997 > 0) {
            byte[] var1 = field1992[--field1997];
            field1992[field1997] = null;
            return var1;
        } else if (arg0 == 5000 && field1996 > 0) {
            byte[] var2 = field1993[--field1996];
            field1993[field1996] = null;
            return var2;
        } else if (arg0 == 30000 && field1991 > 0) {
            byte[] var3 = field1994[--field1991];
            field1994[field1991] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
