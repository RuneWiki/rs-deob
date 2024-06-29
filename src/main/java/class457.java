import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class457 extends class270 {

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "[B")
    public byte[] field6379;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "Z")
    public static boolean field6383 = false;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "J")
    public static volatile long field6384 = 0L;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "Ljo;")
    public static class303 field6380;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 5)
    public static void method2606(int arg0) {
        if (arg0 == 0) {
            field6380 = null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILe;ZLjava/awt/Canvas;)Loa;", line = 19)
    public static final class635 method2607(int arg0, class486 arg1, boolean arg2, Canvas arg3) {
        if (arg0 == 11763) {
            field6382++;
            return arg2 ? new class397(arg3, arg1) : new class524(arg3, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "([B)V", line = 33)
    public class457(byte[] arg0) {
        this.field6379 = arg0;
    }
}
