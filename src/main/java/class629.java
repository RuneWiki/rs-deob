import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class629 {

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public int field8914;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Ldr;")
    public static class629 field8915 = new class629(1);

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Ldr;")
    public static class629 field8916 = new class629(2);

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "Ldr;")
    public static class629 field8917 = new class629(4);

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Ldr;")
    public static class629 field8918 = new class629(1);

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Ldr;")
    public static class629 field8919 = new class629(2);

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Ldr;")
    public static class629 field8920 = new class629(4);

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "Ldr;")
    public static class629 field8921 = new class629(2);

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "Ldr;")
    public static class629 field8922 = new class629(4);

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "[I")
    public static int[] field8923 = new int[4];

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "F")
    public static float field8925;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "Lgga;")
    public static class513 field8924;

    @OriginalMember(owner = "client!dr", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field8913++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 17)
    public static final void method3593(byte arg0) {
        if (arg0 >= -89) {
            field8920 = null;
        }
        class632.field8944.method2881((byte) -46);
        field8912++;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(I)V", line = 29)
    private class629(int arg0) {
        this.field8914 = arg0;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V", line = 41)
    public static void method3594(byte arg0) {
        field8916 = null;
        field8919 = null;
        field8921 = null;
        field8920 = null;
        field8915 = null;
        field8918 = null;
        field8923 = null;
        field8917 = null;
        field8924 = null;
        if (arg0 > -108) {
            field8921 = null;
        }
        field8922 = null;
    }
}
