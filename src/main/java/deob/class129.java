package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("dg")
public class class129 {

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.g(Ldl;Ljava/lang/Object;S)V")
    public static void method1625(class123 arg0, Object arg1) {
        if (arg0.field1961 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1961.peekEvent() != null; var2++) {
            class114.method2962(1L);
        }
        if (arg1 != null) {
            arg0.field1961.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
