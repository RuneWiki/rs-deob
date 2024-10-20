package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("by")
public class class111 {

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.j(Lbv;Ljava/lang/Object;B)V")
    public static void method858(class110 arg0, Object arg1) {
        if (arg0.field1763 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1763.peekEvent() != null; var2++) {
            class30.method1166(1L);
        }
        if (arg1 != null) {
            arg0.field1763.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
