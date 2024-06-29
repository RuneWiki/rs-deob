import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class420 {

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public int field5821;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public int field5814;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public int field5823;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public int field5816;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "B")
    public byte field5830;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public int field5812;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field5815;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "Lnfa;")
    public class745 field5828;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "[I")
    public static int[] field5826 = new int[1];

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field5831 = -1;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "Lud;")
    public class101 field5825;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Lda;")
    public static class443 field5827;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Lgb;")
    public class520 field5818;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Lrw;")
    public class543 field5813;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Lws;")
    public class557 field5817;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "Lw;")
    public static class675 field5820;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    public static void method2479(boolean arg0) {
        field5820 = null;
        field5827 = null;
        if (arg0) {
            method2480(-67);
        }
        field5826 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
    public static final boolean method2480(int arg0) {
        if (arg0 == 13753) {
            field5822++;
            return class27.method224(arg0 - 13650, "jaclib") ? class27.method224(89, "hw3d") : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Z")
    public final boolean method2481(byte arg0) {
        if (arg0 != 2) {
            method2480(-126);
        }
        field5824++;
        return this.field5830 == 2 || this.field5830 == 3;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(BIIIIIILnfa;)V")
    public class420(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class745 arg7) {
        this.field5821 = arg6;
        this.field5814 = arg3;
        this.field5823 = arg2;
        this.field5816 = arg5;
        this.field5830 = arg0;
        this.field5812 = arg4;
        this.field5815 = arg1;
        this.field5828 = arg7;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V")
    public static final void method2482(byte arg0) {
        int var1 = -21 % ((arg0 - 38) / 59);
        for (int var2 = 0; var2 < 5; var2++) {
            class81.field1203[var2] = false;
        }
        field5829++;
        class783.field10725 = 1;
        field5831 = -1;
        class313.field4422 = 0;
        class401.field5533 = -1;
        class743.field10323 = -1;
        class44.field581 = -1;
        class235.field3407 = 0;
    }
}
