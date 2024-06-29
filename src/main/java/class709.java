import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class class709 extends class626 {

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "Lqe;")
    public static class465 field9911 = new class465(5, -1);

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "Z")
    public static boolean field9913 = false;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)I")
    public abstract int method2004(int arg0);

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
    public abstract int method2007(int arg0);

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)V")
    public static void method3963(int arg0) {
        field9911 = null;
        int var1 = -52 % ((-arg0 - 27) / 57);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)Z")
    public static final boolean method3964(int arg0, int arg1, int arg2) {
        field9910++;
        if (arg2 <= 62) {
            field9913 = false;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "(I)I")
    public abstract int method2003(int arg0);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lkk;B)V")
    public static final void method3965(class188 arg0, byte arg1) {
        class377.field5263 = arg0;
        if (arg1 > -101) {
            method3964(38, 81, -94);
        }
        field9912++;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)I")
    public abstract int method2002(byte arg0);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)J")
    public abstract long method2006(boolean arg0);
}
