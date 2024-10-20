package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("dp")
public class class109 {

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.i(Lcm;Ljava/lang/Object;I)V")
    public static void method1902(class104 arg0, Object arg1) {
        if (arg0.field1660 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1660.peekEvent() != null; var2++) {
            class162.method150(1L);
        }
        if (arg1 != null) {
            arg0.field1660.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
