import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class439 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field6365 = 12;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "[I")
    public static int[] field6368 = new int[5];

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field6369 = 0;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
    public static final int method2746(byte arg0) {
        if (arg0 != 92) {
            return -113;
        }
        field6370++;
        class51 var1 = class431.field6263;
        synchronized (class431.field6263) {
            return class431.field6263.method371(0);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public static void method2747(byte arg0) {
        field6368 = null;
        if (arg0 != -104) {
            field6369 = -41;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lir;ILir;)V")
    public static final void method2748(class185 arg0, int arg1, class185 arg2) {
        class421.field6117 = arg0;
        field6364++;
        class338.field4988 = arg2;
        if (arg1 != 92) {
            field6368 = null;
        }
    }
}
