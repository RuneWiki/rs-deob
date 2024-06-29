import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class313 {

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public int field4057 = 64;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public int field4060 = 1;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public int field4063 = 2;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public int field4059 = -1;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "Z")
    public boolean field4062 = false;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "Z")
    public boolean field4058 = false;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
    public int field4065 = 64;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "Lra;")
    public static class361 field4061 = new class361(65, 3);

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "[I")
    public static int[] field4067 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "I")
    public static int field4068 = 1401;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lfd;II)V")
    public final void method1827(class418 arg0, int arg1, int arg2) {
        if (arg2 != 8) {
            return;
        }
        while (true) {
            int var4 = arg0.method2396(95);
            if (var4 == 0) {
                field4056++;
                return;
            }
            this.method1830((byte) -127, arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)[Luaa;")
    public static final class405[] method1828(int arg0) {
        if (arg0 == 4) {
            field4066++;
            return new class405[] { class17.field187, class152.field1945, class60.field821 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
    public static void method1829(byte arg0) {
        field4061 = null;
        field4067 = null;
        if (arg0 != 112) {
            field4061 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BIILfd;)V")
    private final void method1830(byte arg0, int arg1, int arg2, class418 arg3) {
        if (arg0 > -40) {
            method1828(-46);
        }
        field4064++;
        if (arg2 == 1) {
            this.field4059 = arg3.method2393(-30727);
            if (this.field4059 == 65535) {
                this.field4059 = -1;
            }
        } else if (arg2 == 2) {
            this.field4057 = arg3.method2393(-30727) + 1;
            this.field4065 = arg3.method2393(-30727) + 1;
        } else if (arg2 == 3) {
            arg3.method2387((byte) 107);
        } else if (arg2 == 4) {
            this.field4063 = arg3.method2396(-111);
        } else if (arg2 == 5) {
            this.field4060 = arg3.method2396(-111);
            return;
        } else if (arg2 == 6) {
            this.field4058 = true;
            return;
        } else if (arg2 == 7) {
            this.field4062 = true;
            return;
        }
    }
}
