package deob;

import java.util.HashMap;

@ObfuscatedName("cr")
public class class100 {

    static {
        new HashMap();
    }

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.g([Lcb;II)Lcb;")
    public static class102 method1742(class102[] arg0, int arg1) {
        class102[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class102 var4 = var2[var3];
            if (arg1 == var4.method457()) {
                return var4;
            }
        }
        return null;
    }
}
