package deob;

import java.util.HashMap;

@ObfuscatedName("cp")
public class class100 {

    static {
        new HashMap();
    }

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.c([Lcv;II)Lcv;")
    public static class102 method70(class102[] arg0, int arg1) {
        class102[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class102 var4 = var2[var3];
            if (arg1 == var4.method462()) {
                return var4;
            }
        }
        return null;
    }
}
