import jaclib.memory.Buffer;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class369 extends class146 implements class268 {

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "Lns;")
    private class408 field5150;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "[Llea;")
    public static class612[] field5148 = new class612[6];

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "[F")
    public static float[] field5153 = new float[2];

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "Ljava/awt/Font;")
    public static Font field5149;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V", line = 6)
    public final void method588(boolean arg0) {
        ++field5147;
        super.method588(arg0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V", line = 21)
    public final void method585(int arg0, byte arg1) {
        super.method585(this.field5150.field5665 * arg0, arg1);
        ++field5154;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V", line = 31)
    public static void method2174(int arg0) {
        field5153 = null;
        field5149 = null;
        if (arg0 != 34963) {
            method2174(36);
        }
        field5148 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Z", line = 47)
    public final boolean method586(int arg0) {
        ++field5155;
        if (arg0 != -17694) {
            this.field5150 = null;
        }
        return super.method1101(-66, super.field2318.field2037);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Llaa;Lns;Z)V", line = 58)
    public class369(class122 arg0, class408 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field5150 = arg1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 67)
    public final Buffer method587(int arg0, boolean arg1) {
        if (arg0 != 30907) {
            field5153 = null;
        }
        ++field5156;
        return super.method1103(super.field2318.field2037, (byte) -67, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lns;", line = 78)
    public final class408 method589(byte arg0) {
        ++field5152;
        return arg0 != 81 ? null : this.field5150;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)I", line = 91)
    public final int method590(int arg0) {
        if (arg0 != -1) {
            return 52;
        } else {
            ++field5151;
            return super.method590(-1);
        }
    }
}
