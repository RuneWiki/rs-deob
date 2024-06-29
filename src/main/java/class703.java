import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class703 extends class65 {

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lgaa;")
    public static class68 field9941;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V", line = 15)
    public static void method3910(int arg0) {
        field9941 = null;
        if (arg0 > -50) {
            field9941 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I")
    public abstract int method3022(int arg0);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)I")
    public abstract int method3023(int arg0);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)I")
    public abstract int method3017(byte arg0);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)J")
    public abstract long method3024(boolean arg0);

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)I")
    public abstract int method3020(int arg0);
}
