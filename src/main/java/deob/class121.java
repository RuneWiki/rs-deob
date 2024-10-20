package deob;

@ObfuscatedName("dn")
public class class121 {

    @ObfuscatedName("dn.h")
    public static int field1999 = 0;

    @ObfuscatedName("dn.m")
    public static int field1998 = 0;

    @ObfuscatedName("dn.i")
    public static int field2006 = 0;

    @ObfuscatedName("dn.q")
    public static byte[][] field2000 = new byte[1000][];

    @ObfuscatedName("dn.p")
    public static byte[][] field2001 = new byte[250][];

    @ObfuscatedName("dn.c")
    public static byte[][] field2002 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.h(IB)[B")
    public static synchronized byte[] method2560(int arg0) {
        if (arg0 == 100 && field1999 > 0) {
            byte[] var1 = field2000[--field1999];
            field2000[field1999] = null;
            return var1;
        } else if (arg0 == 5000 && field1998 > 0) {
            byte[] var2 = field2001[--field1998];
            field2001[field1998] = null;
            return var2;
        } else if (arg0 == 30000 && field2006 > 0) {
            byte[] var3 = field2002[--field2006];
            field2002[field2006] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
