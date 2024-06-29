import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class223 {

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Z")
    public boolean field3849 = true;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field3850 = 20;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "J")
    public static long field3856 = -1L;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "C")
    private char field3855;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field3853;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lqs;")
    public static class496 field3851;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Ljava/lang/String;")
    public String field3848;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLia;)V", line = 3)
    public final void method1536(boolean arg0, class23 arg1) {
        field3854++;
        while (true) {
            int var3 = arg1.method126((byte) -91);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.field3855 = '<';
                    return;
                }
            }
            this.method1538(arg1, -5, var3);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method1537(int arg0) {
        field3847++;
        if (arg0 != -3685) {
            this.method1537(121);
        }
        return this.field3855 == 's';
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lia;II)V", line = 41)
    private final void method1538(class23 arg0, int arg1, int arg2) {
        if (arg1 != -5) {
            this.field3848 = null;
        }
        if (arg2 == 1) {
            this.field3855 = class260.method1745(arg0.method167(-2), 255);
        } else if (arg2 == 2) {
            this.field3853 = arg0.method143(-3230);
        } else if (arg2 == 4) {
            this.field3849 = false;
        } else if (arg2 == 5) {
            this.field3848 = arg0.method156((byte) -91);
        }
        field3857++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 70)
    public static final void method1539(int arg0, int arg1) {
        field3852++;
        class266 var2 = class308.method1961(true, arg0, 16);
        if (arg1 <= -10) {
            var2.method1778(17991);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 90)
    public static void method1540(byte arg0) {
        field3851 = null;
        if (arg0 != 23) {
            method1539(28, -6);
        }
    }
}
