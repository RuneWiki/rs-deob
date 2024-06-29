import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class318 extends class170 {

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lij;")
    public static class316 field4328;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Ljava/lang/String;")
    public String field4329;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "[I")
    public int[] field4325;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "[I")
    public int[] field4337;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "[Ltn;")
    public class109[] field4326;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field4333;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V", line = 9)
    public static void method1943(byte arg0) {
        if (arg0 != -14) {
            field4328 = null;
        }
        field4328 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILjava/awt/Canvas;Lgf;)Lea;", line = 25)
    public static final class58 method1944(int arg0, int arg1, Canvas arg2, class202 arg3) {
        if (arg1 <= 111) {
            return null;
        } else {
            field4334++;
            return new class27(arg2, arg3, arg0);
        }
    }
}
