import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class227 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lsf;")
    public static class108 field3982 = class140.method973(255, "Okay");

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
    public static int[] field3984 = new int[5];

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lsf;")
    public static class108 field3983 = class140.method973(255, "Annuler");

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3986 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lik;")
    public static class262 field3985;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lik;Z)V", line = 7)
    public static final void method1531(class262 arg0, boolean arg1) {
        field3981++;
        if (!arg1) {
            method1532((byte) -53);
        }
        class172.field3141 = arg0;
        class185.field3393 = class172.field3141.method1876(16, (byte) -119);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 19)
    public static void method1532(byte arg0) {
        field3982 = null;
        field3983 = null;
        field3985 = null;
        if (arg0 < 74) {
            field3982 = (class108) null;
        }
        field3984 = null;
    }
}
