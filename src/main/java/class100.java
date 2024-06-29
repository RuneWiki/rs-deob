import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class100 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field1739 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lwa;")
    public static class238 field1737;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public abstract void method660(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method661(boolean arg0) {
        field1737 = null;
        if (!arg0) {
            method661(true);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public abstract void method662(int arg0, int arg1);
}
