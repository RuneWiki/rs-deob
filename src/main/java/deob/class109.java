package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("do")
public class class109 {

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.d(Lch;Ljava/lang/Object;B)V")
    public static void method2728(class104 arg0, Object arg1) {
        if (arg0.field1665 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1665.peekEvent() != null; var2++) {
            class138.method15(1L);
        }
        if (arg1 != null) {
            arg0.field1665.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
