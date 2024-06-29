import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class422 {

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field5818 = -1;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Lht;")
    public static class582 field5816 = new class582(7, 7);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "Lue;")
    public static class234 field5819;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public static void method2447(byte arg0) {
        if (arg0 > 73) {
            field5819 = null;
            field5816 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIILjava/awt/Canvas;)Lrha;")
    public static final class223 method2448(int arg0, int arg1, int arg2, Canvas arg3) {
        field5815++;
        try {
            Class var4 = Class.forName("ir");
            if (arg0 == 7) {
                class223 var5 = (class223) var4.getDeclaredConstructor().newInstance();
                var5.method245(arg3, arg1, arg2, arg0 - 5);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class541 var6 = new class541();
            var6.method245(arg3, arg1, arg2, 2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
    public static final void method2449(int arg0, int arg1) {
        field5817++;
        class432.field5949 = arg0;
        class663.field8853 = -1;
        class663.field8853 = arg1;
        class229.method1457((byte) -7);
    }
}
