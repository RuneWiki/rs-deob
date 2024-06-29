import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class345 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lbi;")
    public class483 field4357;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lria;")
    public static class288 field4361 = null;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lhu;")
    public static class134 field4358;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Z")
    public static final boolean method1976(int arg0, int arg1, int arg2) {
        field4360++;
        if (arg2 == 0) {
            return (arg0 & 0xC580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILcj;)V")
    public abstract void method36(int arg0, int arg1, class695 arg2);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Z")
    public abstract boolean method38(int arg0);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII)V")
    public abstract void method37(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public abstract void method41(byte arg0);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)V")
    public abstract void method40(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method1977(int arg0) {
        field4361 = null;
        field4358 = null;
        if (arg0 != 0) {
            method1977(-1);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lbi;)V")
    public class345(class483 arg0) {
        this.field4357 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZB)V")
    public abstract void method34(boolean arg0, byte arg1);
}
