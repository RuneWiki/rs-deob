package deob;

@ObfuscatedName("dy")
public class class122 {

    @ObfuscatedName("dy.s")
    public static int field2016 = 0;

    @ObfuscatedName("dy.j")
    public static int field2013 = 0;

    @ObfuscatedName("dy.p")
    public static int field2014 = 0;

    @ObfuscatedName("dy.x")
    public static byte[][] field2015 = new byte[1000][];

    @ObfuscatedName("dy.d")
    public static byte[][] field2012 = new byte[250][];

    @ObfuscatedName("dy.u")
    public static byte[][] field2018 = new byte[50][];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.s(IS)[B")
    public static synchronized byte[] method2576(int arg0) {
        if (arg0 == 100 && field2016 > 0) {
            byte[] var1 = field2015[--field2016];
            field2015[field2016] = null;
            return var1;
        } else if (arg0 == 5000 && field2013 > 0) {
            byte[] var2 = field2012[--field2013];
            field2012[field2013] = null;
            return var2;
        } else if (arg0 == 30000 && field2014 > 0) {
            byte[] var3 = field2018[--field2014];
            field2018[field2014] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
