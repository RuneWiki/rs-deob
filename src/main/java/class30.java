import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class30 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field420 = -1;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lvq;")
    public static class24 field421 = null;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    public static int[] field423 = new int[13];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 8)
    public static void method304(boolean arg0) {
        if (arg0) {
            field420 = -126;
        }
        field421 = null;
        field423 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I")
    public abstract int method301(int arg0, int arg1);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public abstract void method302(byte arg0);

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)J")
    public abstract long method303(byte arg0);
}
