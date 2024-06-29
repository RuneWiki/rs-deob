import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public abstract class class356 {

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field5115 = -1;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field5112 = 0;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "Lfc;")
    public static class209 field5114;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)V", line = 13)
    public static void method2177(byte arg0) {
        if (arg0 == -50) {
            field5114 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)Z", line = 42)
    public final boolean method2178(int arg0) {
        if (arg0 != 0) {
            field5113 = -72;
        }
        field5116++;
        return this.method834((byte) 127) || this.method841(false) || this.method843(116);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public abstract void method845(byte arg0);

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)V")
    public abstract void method836(byte arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Loc;")
    public abstract class100 method833(int arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Z")
    public abstract boolean method841(boolean arg0);

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)Z")
    public abstract boolean method834(byte arg0);

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
    public abstract int method837(int arg0);

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
    public abstract int method838(int arg0);

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)Z")
    public abstract boolean method843(int arg0);
}
