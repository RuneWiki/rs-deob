package deob;

@ObfuscatedName("dm")
public class class122 {

    @ObfuscatedName("dm.f")
    public static int field2018 = 0;

    @ObfuscatedName("dm.u")
    public static int field2011 = 0;

    @ObfuscatedName("dm.x")
    public static int field2013 = 0;

    @ObfuscatedName("dm.b")
    public static byte[][] field2016 = new byte[1000][];

    @ObfuscatedName("dm.l")
    public static byte[][] field2009 = new byte[250][];

    @ObfuscatedName("dm.d")
    public static byte[][] field2014 = new byte[50][];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.f(II)[B")
    public static synchronized byte[] method2596(int arg0) {
        if (arg0 == 100 && field2018 > 0) {
            byte[] var1 = field2016[--field2018];
            field2016[field2018] = null;
            return var1;
        } else if (arg0 == 5000 && field2011 > 0) {
            byte[] var2 = field2009[--field2011];
            field2009[field2011] = null;
            return var2;
        } else if (arg0 == 30000 && field2013 > 0) {
            byte[] var3 = field2014[--field2013];
            field2014[field2013] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
