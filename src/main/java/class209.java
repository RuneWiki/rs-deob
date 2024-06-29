import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class209 extends class83 {

    @OriginalMember(owner = "client!h", name = "s", descriptor = "[B")
    public byte[] field3545;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Luh;")
    public static class224 field3543 = class239.method1576(-19602);

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lvh;")
    public static class108 field3541;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field3543 = null;
        if (arg0 < 104) {
            field3544 = 57;
        }
        field3541 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lme;")
    public static final class39 method1405(int arg0, int arg1) {
        if (arg1 == 26915) {
            field3542++;
            return (class39) client.field4546.method779(arg1 - 26824, (long) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V")
    public class209(byte[] arg0) {
        this.field3545 = arg0;
    }
}
