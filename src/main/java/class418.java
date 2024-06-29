import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class418 extends class748 {

    @OriginalMember(owner = "client!du", name = "H", descriptor = "I")
    public static int field5806 = 0;

    @OriginalMember(owner = "client!du", name = "I", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V", line = 3)
    public class418() {
        super(0, true);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)[I", line = 13)
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method25(-121, 34);
        }
        field5807++;
        return class237.field3298;
    }
}
