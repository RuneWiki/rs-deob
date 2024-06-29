import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class375 {

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public int field5608;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[Lrr;")
    public static class233[] field5606 = new class233[30];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Luh;")
    public static class108 field5607;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method2275(byte arg0) {
        if (arg0 != 120) {
            field5607 = null;
        }
        field5606 = null;
        field5607 = null;
    }

    @OriginalMember(owner = "client!si", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5603++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V")
    public class375(int arg0, int arg1) {
        this.field5608 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)V")
    public static final void method2276(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 != 30) {
                field5607 = null;
            }
        } catch (InterruptedException var3) {
        }
        field5605++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Luj;")
    public static final class248 method2277(int arg0) {
        field5602++;
        return arg0 == 30 ? class249.field3567 : null;
    }
}
