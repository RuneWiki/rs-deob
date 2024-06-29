import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class166 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lmw;")
    public static class517 field2198 = new class517(49, 7);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lda;")
    public static class67 field2202;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method1137(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (var1 < 100) {
            class753.field10199[var1] = true;
            var1++;
        }
        field2199++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method1138(byte arg0) {
        if (arg0 == 5) {
            field2202 = null;
            field2198 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Luq;IIIBJZ)V")
    public static final void method1139(class172 arg0, int arg1, int arg2, int arg3, byte arg4, long arg5, boolean arg6) {
        class612.method3401(0, arg0, arg1, arg5, arg6, arg3, arg2, (byte) -124);
        field2203++;
        int var8 = -44 / ((70 - arg4) / 46);
    }

    @OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2200++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
    public class166(int arg0) {
        this.field2201 = arg0;
    }
}
