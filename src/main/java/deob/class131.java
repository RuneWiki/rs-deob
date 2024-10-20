package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ee")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.f(Ldj;Ljava/lang/Object;I)V")
    public static void method3376(class125 arg0, Object arg1) {
        if (arg0.field1962 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1962.peekEvent() != null; var2++) {
            class116.method557(1L);
        }
        if (arg1 != null) {
            arg0.field1962.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
