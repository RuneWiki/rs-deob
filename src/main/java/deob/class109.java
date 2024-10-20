package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("di")
public class class109 {

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.o(Lcz;Ljava/lang/Object;B)V")
    public static void method593(class104 arg0, Object arg1) {
        if (arg0.field1670 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1670.peekEvent() != null; var2++) {
            class162.method238(1L);
        }
        if (arg1 != null) {
            arg0.field1670.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
