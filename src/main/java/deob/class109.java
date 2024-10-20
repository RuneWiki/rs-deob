package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("dj")
public class class109 {

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gi.f(Lcd;Ljava/lang/Object;I)V")
    public static void method3196(class104 arg0, Object arg1) {
        if (arg0.field1697 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1697.peekEvent() != null; var2++) {
            class162.method2141(1L);
        }
        if (arg1 != null) {
            arg0.field1697.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
