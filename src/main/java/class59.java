import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class class59 {

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Lri;")
    public static class73 field883 = null;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Lrm;")
    public static class281 field887 = null;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lml;")
    public static final class263 method351(Component arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            field887 = null;
        }
        field889++;
        return new class511(arg0, arg2);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Z")
    public final boolean method352(int arg0) {
        field881++;
        if (arg0 != -7813) {
            method351(null, true, false);
        }
        return (this.field880 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)Z")
    public final boolean method353(int arg0) {
        field885++;
        if (arg0 < 3) {
            return true;
        } else {
            return (this.field880 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
    public final boolean method354(int arg0) {
        if (arg0 != -1) {
            field883 = null;
        }
        field886++;
        return (this.field880 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static void method355(byte arg0) {
        field883 = null;
        field887 = null;
        if (arg0 > -72) {
            field887 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Z")
    public final boolean method356(byte arg0) {
        field884++;
        if (arg0 >= -69) {
            method351(null, false, true);
        }
        return (this.field880 & 0x4) != 0;
    }
}
