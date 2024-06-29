import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class244 extends class577 {

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "Lcp;")
    public class754 field3625;

    @OriginalMember(owner = "client!dia", name = "u", descriptor = "Z")
    public boolean field3634;

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!dia", name = "t", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "Lgj;")
    public static class660 field3627;

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "Z")
    public boolean field3626;

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "Z")
    public boolean field3630;

    @OriginalMember(owner = "client!dia", name = "s", descriptor = "Z")
    public boolean field3632;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(B)V")
    public static void method1620(byte arg0) {
        if (arg0 <= 125) {
            field3627 = null;
        }
        field3627 = null;
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "(B)Z")
    public static final boolean method1621(byte arg0) {
        field3633++;
        if (arg0 < 29) {
            return false;
        }
        if (class685.field9515) {
            try {
                if ((Boolean) class323.method2083(-10217, "showingVideoAd", class319.field4527)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(ILcp;IZ)V")
    public class244(int arg0, class754 arg1, int arg2, boolean arg3) {
        this.field3625 = arg1;
        this.field3634 = arg3;
        this.field3629 = arg2;
        this.field3628 = arg0;
    }
}
