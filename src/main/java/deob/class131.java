package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("el")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.e(Ldy;Ljava/lang/Object;I)V")
    public static void method1381(class125 arg0, Object arg1) {
        if (arg0.field1942 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1942.peekEvent() != null; var2++) {
            class116.method7(1L);
        }
        if (arg1 != null) {
            arg0.field1942.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
