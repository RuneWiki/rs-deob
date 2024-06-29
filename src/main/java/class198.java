import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class198 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[Z")
    public static boolean[] field3944 = new boolean[112];

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lo;")
    public static class134 field3946;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    public static int[] field3943;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([Ldd;I)[Ldd;")
    public static final class35[] method1300(class35[] arg0, int arg1) {
        field3939++;
        class35[] var2 = new class35[5];
        for (int var3 = arg1; var3 < 5; var3++) {
            var2[var3] = class63.method529(new class35[] { class3.method19(var3, -29578), class95.field2085 }, (byte) 59);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class63.method529(new class35[] { var2[var3], arg0[var3] }, (byte) 78);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        field3943 = null;
        if (arg0 == 3) {
            field3944 = null;
            field3946 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class198() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lva;)V")
    public class198(class198 arg0) {
        this.field3940 = arg0.field3940;
        this.field3942 = arg0.field3942;
        this.field3945 = arg0.field3945;
        this.field3941 = arg0.field3941;
    }
}
