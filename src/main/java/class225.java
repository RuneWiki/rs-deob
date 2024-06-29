import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class225 extends class125 {

    @OriginalMember(owner = "client!me", name = "B", descriptor = "[B")
    public byte[] field3909;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Loa;")
    private static class99 field3904 = class221.method1463(2844, "Connection lost)3");

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field3906 = 0;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "J")
    public static long field3911 = 0L;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Loa;")
    public static class99 field3907 = field3904;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
    public static final void method1484(boolean arg0) {
        field3910++;
        class24 var1 = class205.field3552;
        synchronized (class205.field3552) {
            class51.field849 = class185.field3282;
            class108.field1957++;
            class172.field3054 = class221.field3846;
            class38.field656 = class159.field2827;
            if (arg0) {
                field3906 = 104;
            }
            class21.field243 = class17.field180;
            class11.field97 = class56.field927;
            class122.field2133 = class224.field3899;
            class247.field4249 = class153.field2682;
            class17.field180 = 0;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method1485(int arg0) {
        if (class125.field2204 != null) {
            class125.field2204.method1368(true);
        }
        if (class226.field3917 != null) {
            class226.field3917.method1368(true);
        }
        if (arg0 != 0) {
            method1485(-72);
        }
        field3908++;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(Z)V")
    public static void method1486(boolean arg0) {
        if (!arg0) {
            field3904 = null;
            field3907 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
    public class225(byte[] arg0) {
        this.field3909 = arg0;
    }
}
