package deob;

import java.util.HashMap;

@ObfuscatedName("cz")
public class class100 {

    static {
        new HashMap();
    }

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.a([Lca;II)Lca;")
    public static class103 method111(class103[] arg0, int arg1) {
        class103[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class103 var4 = var2[var3];
            if (arg1 == var4.method487()) {
                return var4;
            }
        }
        return null;
    }
}
