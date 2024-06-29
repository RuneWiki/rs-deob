import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class448 implements class126 {

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public int field6140;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lpq;")
    public static class159 field6139;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "[I")
    public static int[] field6135;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "[Lxa;")
    public static class424[] field6138;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method2563(int arg0, boolean arg1) {
        class155.method1031(arg0 - 25);
        field6137++;
        if (!class90.method500((byte) 107, class476.field6436)) {
            return;
        }
        class462.field6305++;
        if (arg0 < ~class462.field6305 && !arg1) {
            return;
        }
        class462.field6305 = 0;
        if (!class367.field5274 && class80.field1014 != null) {
            class460.field6265++;
            class389.method2326((byte) 118, class270.field3681);
            try {
                class80.field1014.method969(class253.field3491.field1712, 0, arg0 ^ 0x2DAC, class253.field3491.field1745);
                class253.field3491.field1745 = 0;
            } catch (IOException var2) {
                class367.field5274 = true;
            }
        }
        class155.method1031(-82);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Ljv;", line = 36)
    public final class606 method472(byte arg0) {
        field6136++;
        return arg0 == -110 ? class106.field1273 : null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V", line = 49)
    public static void method2564(boolean arg0) {
        field6138 = null;
        field6135 = null;
        field6139 = null;
        if (!arg0) {
            method2563(-66, true);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V", line = 63)
    public class448(int arg0) {
        this.field6140 = arg0;
    }
}
