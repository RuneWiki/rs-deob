package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("db")
public class class129 {

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.i(Ldz;Ljava/lang/Object;I)V")
    public static void method29(class123 arg0, Object arg1) {
        if (arg0.field1933 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1933.peekEvent() != null; var2++) {
            class114.method743(1L);
        }
        if (arg1 != null) {
            arg0.field1933.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
