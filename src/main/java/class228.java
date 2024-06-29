import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class228 {

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!tk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3188++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIII)V")
    public class228(int arg0, int arg1, int arg2, int arg3) {
        this.field3190 = arg2;
        this.field3186 = arg3;
        this.field3187 = arg1;
        this.field3192 = arg0;
    }
}
