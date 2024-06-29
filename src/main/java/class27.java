import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 implements class82 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Ldg;")
    public static class376 field392 = new class376(42, 3);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Ldg;")
    public static class376 field393 = new class376(50, -1);

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
    public static int[] field396 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Ldg;")
    public static class376 field397 = new class376(61, 2);

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lpu;")
    public static class522 field395;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lpf;")
    public static class539 field401;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lit;")
    public static class598 field400;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Z")
    public static boolean field399;

    @OriginalMember(owner = "client!uc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field398++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method323(byte arg0) {
        field393 = null;
        field400 = null;
        field401 = null;
        field396 = null;
        field397 = null;
        field395 = null;
        field392 = null;
        int var1 = 91 % ((arg0 + 71) / 52);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class27(String arg0, int arg1) {
        this.field394 = arg1;
    }
}
