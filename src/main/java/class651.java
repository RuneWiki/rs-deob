import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class651 extends class430 {

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public int field9344;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public int field9343;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "[[[B")
    public static byte[][][] field9345;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z")
    public static final boolean method3749(int arg0) {
        if (arg0 < 18) {
            return true;
        } else {
            field9346++;
            return class94.field1354;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
    public static void method3750(int arg0) {
        int var1 = -88 % ((arg0 + 67) / 33);
        field9345 = null;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(II)V")
    public class651(int arg0, int arg1) {
        this.field9344 = arg1;
        this.field9343 = arg0;
    }
}
