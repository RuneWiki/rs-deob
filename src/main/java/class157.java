import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class157 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Z")
    public static boolean field2494 = false;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2493 = 0;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2496 = 0;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2498 = "scroll:";

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[[[Lw;")
    public static class272[][][] field2500;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLjava/awt/Frame;Loj;)V", line = 19)
    public static final void method1180(boolean arg0, Frame arg1, class325 arg2) {
        while (true) {
            class21 var3 = arg2.method2231(arg1, 1);
            while (var3.field387 == 0) {
                class279.method1991(100, 10L);
            }
            if (var3.field387 == 1) {
                arg1.setVisible(arg0);
                field2497++;
                arg1.dispose();
                return;
            }
            class279.method1991(100, 100L);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Leh;", line = 45)
    public static final class169 method1181(int arg0) {
        field2495++;
        return arg0 <= 126 ? (class169) null : class81.field1222;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 59)
    public static final void method1182(int arg0) {
        field2499++;
        if (arg0 != -9764) {
            return;
        }
        for (class254 var1 = (class254) class67.field1071.method1490(arg0 ^ 0xFFFFD914); var1 != null; var1 = (class254) class67.field1071.method1487((byte) 117)) {
            if (var1.field3922) {
                var1.method1806(0);
            }
        }
        for (class254 var2 = (class254) class139.field2216.method1490(200); var2 != null; var2 = (class254) class139.field2216.method1487((byte) 117)) {
            if (var2.field3922) {
                var2.method1806(0);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 93)
    public static void method1183(int arg0) {
        field2498 = null;
        if (arg0 != 1) {
            method1181(-85);
        }
        field2500 = (class272[][][]) null;
    }
}
