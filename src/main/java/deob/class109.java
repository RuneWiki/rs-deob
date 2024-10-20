package deob;

@ObfuscatedName("dq")
public class class109 {

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.t(Lbh;S)V")
    public static void method723(class62 arg0) {
        Statics.field1507 = arg0;
    }

    @ObfuscatedName("cf.n(Lec;Ljava/lang/String;I)I")
    public static int method1202(class135 arg0, String arg1) {
        int var2 = arg0.field1722;
        byte[] var3 = class84.method159(arg1);
        arg0.method1569(var3.length);
        arg0.field1722 += Statics.field1507.method778(var3, 0, var3.length, arg0.field1723, arg0.field1722);
        return arg0.field1722 - var2;
    }
}
