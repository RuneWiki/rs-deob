import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class176 {

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lgg;")
    public static class63 field3617 = class116.method911(43, "M");

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lgg;")
    private static class63 field3615 = class116.method911(43, "Members only world");

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lgg;")
    public static class63 field3620 = class116.method911(43, "::");

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[Lkh;")
    public static class98[] field3618 = new class98[100];

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lgg;")
    public static class63 field3623 = field3615;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lch;")
    public static class29 field3610 = new class29(64);

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "J")
    public long field3612;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lmc;")
    public static class111 field3622;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lte;")
    public class176 field3611;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lte;")
    public class176 field3619;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1169(int arg0, Component arg1) {
        arg1.removeKeyListener(class45.field1066);
        field3614++;
        arg1.removeFocusListener(class45.field1066);
        class85.field2020 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
    public final boolean method1170(boolean arg0) {
        if (arg0) {
            field3620 = null;
        }
        field3621++;
        return this.field3619 != null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public static void method1171(boolean arg0) {
        field3610 = null;
        field3617 = null;
        field3615 = null;
        field3623 = null;
        field3618 = null;
        field3622 = null;
        if (arg0) {
            field3617 = null;
        }
        field3620 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public final void method1172(int arg0) {
        field3613++;
        if (this.field3619 == null) {
            return;
        }
        if (arg0 >= -6) {
            method1171(false);
        }
        this.field3619.field3611 = this.field3611;
        this.field3611.field3619 = this.field3619;
        this.field3611 = null;
        this.field3619 = null;
    }
}
