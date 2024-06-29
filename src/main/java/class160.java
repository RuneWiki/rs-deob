import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class160 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2608 = 0;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Z")
    public static boolean field2612 = false;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2607;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 20)
    public static void method1141(int arg0) {
        field2607 = null;
        if (arg0 <= 74) {
            field2612 = false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILme;)Lee;", line = 67)
    public static final class207 method1142(int arg0, int arg1, class295 arg2) {
        byte[] var3 = arg2.method2037((byte) 67, arg0);
        if (arg1 != -18161) {
            method1142(-97, 11, (class295) null);
        }
        field2610++;
        return var3 == null ? null : new class207(var3);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Z", line = 83)
    public static final boolean method1143(byte arg0) {
        field2606++;
        if (arg0 > -33) {
            method1141(55);
        }
        return class212.field3471 == 0 ? class84.field1316.method1580(2624) : true;
    }
}
