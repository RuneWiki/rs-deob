import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class27 extends class499 {

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "Z")
    public volatile boolean field456 = true;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Lub;")
    public static class18 field457 = new class18(8);

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Loc;")
    public static class135 field458;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Z")
    public boolean field454;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Z")
    public boolean field455;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)[B")
    public abstract byte[] method227(byte arg0);

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V")
    public static void method228(byte arg0) {
        if (arg0 == 88) {
            field457 = null;
            field458 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)I")
    public abstract int method229(byte arg0);
}
