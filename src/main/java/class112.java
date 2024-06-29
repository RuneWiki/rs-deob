import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class112 implements class381 {

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "[I")
    public static int[] field1422 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "Lwf;")
    public static class79 field1419 = new class79(32, 15);

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "F")
    public static float field1420;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "[[Ldt;")
    public static class145[][] field1421;

    @OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1424++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class112(String arg0, int arg1) {
        this.field1423 = arg1;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method714(boolean arg0) {
        if (!arg0) {
            method714(false);
        }
        field1422 = null;
        field1421 = null;
        field1419 = null;
    }
}
