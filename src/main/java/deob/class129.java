package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("dm")
public class class129 {

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.b(Ldi;Ljava/lang/Object;I)V")
    public static void method2577(class123 arg0, Object arg1) {
        if (arg0.field1941 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1941.peekEvent() != null; var2++) {
            class114.method2914(1L);
        }
        if (arg1 != null) {
            arg0.field1941.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
