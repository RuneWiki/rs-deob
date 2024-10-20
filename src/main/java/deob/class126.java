package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("dz")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.z(Ldu;Ljava/lang/Object;I)V")
    public static void method534(class120 arg0, Object arg1) {
        if (arg0.field1921 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1921.peekEvent() != null; var2++) {
            class111.method1306(1L);
        }
        if (arg1 != null) {
            arg0.field1921.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
