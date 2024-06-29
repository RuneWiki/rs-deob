import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class787 {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
    public int field10833;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "[I")
    public static int[] field10836 = new int[14];

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    public static int field10834;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field10835;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field10837;

    @OriginalMember(owner = "client!sw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10835++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
    public static void method4350(boolean arg0) {
        if (arg0) {
            method4350(false);
        }
        field10836 = null;
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(I)V")
    public class787(int arg0) {
        this.field10833 = arg0;
    }
}
