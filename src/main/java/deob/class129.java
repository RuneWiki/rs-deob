package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("dt")
public class class129 {

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.e(Ldb;Ljava/lang/Object;I)V")
    public static void method745(class123 arg0, Object arg1) {
        if (arg0.field1946 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1946.peekEvent() != null; var2++) {
            class114.method658(1L);
        }
        if (arg1 != null) {
            arg0.field1946.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
