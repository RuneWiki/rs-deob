package deob;

@ObfuscatedName("dz")
public class class122 {

    @ObfuscatedName("dz.b")
    public static int field1997 = 0;

    @ObfuscatedName("dz.g")
    public static int field1991 = 0;

    @ObfuscatedName("dz.j")
    public static int field1992 = 0;

    @ObfuscatedName("dz.d")
    public static byte[][] field1993 = new byte[1000][];

    @ObfuscatedName("dz.x")
    public static byte[][] field1996 = new byte[250][];

    @ObfuscatedName("dz.y")
    public static byte[][] field1995 = new byte[50][];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.b(IB)[B")
    public static synchronized byte[] method2607(int arg0) {
        if (arg0 == 100 && field1997 > 0) {
            byte[] var1 = field1993[--field1997];
            field1993[field1997] = null;
            return var1;
        } else if (arg0 == 5000 && field1991 > 0) {
            byte[] var2 = field1996[--field1991];
            field1996[field1991] = null;
            return var2;
        } else if (arg0 == 30000 && field1992 > 0) {
            byte[] var3 = field1995[--field1992];
            field1995[field1992] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
