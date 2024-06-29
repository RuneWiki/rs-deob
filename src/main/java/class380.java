import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class380 {

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lqk;")
    public static class148 field5352 = new class148(64, 6);

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "[I")
    public static int[] field5356 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field5355 = 0;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Z")
    public static boolean field5357 = true;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 3)
    public static void method2333(int arg0) {
        field5356 = null;
        if (arg0 != 500) {
            field5356 = null;
        }
        field5352 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field5358++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 39)
    public class380(String arg0, int arg1) {
        this.field5354 = arg1;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lda;)V", line = 62)
    public static final void method2334(class400 arg0) {
        class369.field4718 = arg0;
    }
}
