import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class58 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lmg;")
    private class530 field827;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field828 = -1;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Luj;")
    private class476 field826;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lmg;I)V", line = 4)
    public final void method377(class530 arg0, int arg1) {
        if (arg1 > 104) {
            field829++;
            this.field827 = arg0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Luj;", line = 19)
    public final class476 method378(int arg0) {
        if (arg0 <= 119) {
            this.method379((byte) -126);
        }
        field831++;
        class476 var2 = this.field826;
        if (this.field827.field7789 == var2) {
            this.field826 = null;
            return null;
        } else {
            this.field826 = var2.field6884;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 40)
    public class58() {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Luj;", line = 48)
    public final class476 method379(byte arg0) {
        if (arg0 >= -126) {
            return null;
        }
        field825++;
        class476 var2 = this.field827.field7789.field6884;
        if (this.field827.field7789 == var2) {
            this.field826 = null;
            return null;
        } else {
            this.field826 = var2.field6884;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lmg;)V", line = 72)
    public class58(class530 arg0) {
        this.field827 = arg0;
    }
}
