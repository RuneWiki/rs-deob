import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class50 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lcq;")
    public static class273 field783 = new class273(11, 0, 1, 2);

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Lmm;")
    public class50 field780;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lmm;")
    public class50 field781;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)I", line = 9)
    public static final int method299(int arg0, int arg1) {
        if (arg0 != 127) {
            method301(true);
        }
        field784++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 24)
    public final void method300(byte arg0) {
        field782++;
        if (arg0 != 61) {
            method299(-76, -29);
        }
        if (this.field781 != null) {
            this.field781.field780 = this.field780;
            this.field780.field781 = this.field781;
            this.field780 = null;
            this.field781 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 47)
    public static void method301(boolean arg0) {
        if (arg0) {
            method301(true);
        }
        field783 = null;
    }
}
