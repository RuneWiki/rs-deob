import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class254 {

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Z")
    public boolean field3664;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "[F")
    public static float[] field3660 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field3663 = 0;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lql;")
    public class628 field3658;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lql;")
    public class628 field3662;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Z")
    public boolean field3657;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 5)
    public final void method1633(int arg0) {
        if (this.field3662 != null) {
            this.field3662.method281((byte) 108);
        }
        if (arg0 != 0) {
            this.method1633(26);
        }
        field3665++;
        this.field3657 = false;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lmt;", line = 23)
    public static final class336 method1634(int arg0, int arg1) {
        field3659++;
        class336[] var2 = class301.method1841(122);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class336 var4 = var2[var3];
            if (var4.field4646 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 49)
    public static void method1635(int arg0) {
        field3660 = null;
        if (arg0 != 0) {
            field3660 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Z)V", line = 65)
    public class254(boolean arg0) {
        this.field3664 = arg0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)Z", line = 74)
    public final boolean method1636(byte arg0) {
        field3661++;
        if (arg0 == 101) {
            return this.field3657 && !this.field3664;
        } else {
            return false;
        }
    }
}
