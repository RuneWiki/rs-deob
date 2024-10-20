package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bh")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.v(Lbc;Ljava/lang/Object;I)V")
    public static void method1078(class130 arg0, Object arg1) {
        if (arg0.field1940 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1940.peekEvent() != null; var2++) {
            class134.method1468(1L);
        }
        if (arg1 != null) {
            arg0.field1940.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
