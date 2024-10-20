package deob;

import java.util.HashMap;

@ObfuscatedName("co")
public class class100 {

    static {
        new HashMap();
    }

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.b([Lcg;IS)Lcg;")
    public static class103 method1330(class103[] arg0, int arg1) {
        class103[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class103 var4 = var2[var3];
            if (arg1 == var4.method446()) {
                return var4;
            }
        }
        return null;
    }
}
