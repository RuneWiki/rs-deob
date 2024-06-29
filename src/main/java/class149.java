import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class149 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lfc;")
    private static class39 field3702 = class90.method774("Connection lost", -105);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lfc;")
    public static class39 field3706 = class90.method774(":  ", -85);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lfc;")
    public static class39 field3703 = field3702;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lfc;")
    public static class39 field3708 = class90.method774("VOLL", -110);

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lfc;")
    public static class39 field3707 = class90.method774("::fpson", -114);

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lqc;")
    public static class114 field3705 = new class114(512);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lfc;")
    public static class39 field3709 = class90.method774("weiss:", -123);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Loc;")
    public static class100 field3701;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 12)
    public static void method1192(int arg0) {
        if (arg0 > -103) {
            return;
        }
        field3708 = null;
        field3705 = null;
        field3702 = null;
        field3709 = null;
        field3701 = null;
        field3703 = null;
        field3707 = null;
        field3706 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public abstract void method351(byte arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
    public abstract int method352(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public abstract void method349(int arg0);
}
