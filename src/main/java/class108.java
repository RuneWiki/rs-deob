import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class108 {

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field1805 = 0;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "F")
    public static float field1796;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "J")
    public long field1798;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Lum;")
    public class108 field1800;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Lum;")
    public class108 field1802;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Ln;")
    public static class472 field1801;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Lgp;")
    public static class561 field1804;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V", line = 14)
    public final void method911(int arg0) {
        field1803++;
        if (arg0 == -52 && this.field1800 != null) {
            this.field1800.field1802 = this.field1802;
            this.field1802.field1800 = this.field1800;
            this.field1802 = null;
            this.field1800 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)Z", line = 35)
    public final boolean method912(boolean arg0) {
        if (arg0) {
            method913(96);
        }
        field1797++;
        return this.field1800 != null;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V", line = 50)
    public static void method913(int arg0) {
        field1804 = null;
        if (arg0 != 0) {
            field1804 = null;
        }
        field1801 = null;
    }
}
