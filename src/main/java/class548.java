import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class548 extends class540 {

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public int field7730;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "[I")
    public int[] field7729;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "[I")
    public int[] field7731;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "[I")
    public int[] field7732;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "[Lrb;")
    public class370[] field7728;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[Lrb;")
    public class370[] field7733;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "[[[B")
    public byte[][][] field7735;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method3184(int arg0) {
        if (arg0 >= -91) {
            return false;
        } else {
            class92.field1197++;
            class650.field9155 = true;
            field7734++;
            return true;
        }
    }
}
