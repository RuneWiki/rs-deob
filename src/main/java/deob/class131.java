package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ec")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.c(Ldw;Ljava/lang/Object;I)V")
    public static void method2723(class125 arg0, Object arg1) {
        if (arg0.field1944 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1944.peekEvent() != null; var2++) {
            class116.method2713(1L);
        }
        if (arg1 != null) {
            arg0.field1944.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
