import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class45 extends class286 {

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "[J")
    public static long[] field612 = new long[32];

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "Lbe;")
    private static class283 field614 = class153.method941(125, "Select a world");

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "Lbe;")
    public static class283 field611 = field614;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "[Lbe;")
    public static class283[] field609;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V", line = 4)
    public static final void method265(int arg0, int arg1) {
        class34.field502.method1637(true, arg0);
        field613++;
        if (arg1 != 0) {
            field609 = (class283[]) null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 15)
    public class45() {
        this(4096);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V", line = 23)
    private class45(int arg0) {
        super(0, true);
        this.field610 = 4096;
        this.field610 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I", line = 33)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 >= -52) {
            method266((byte) -6);
        }
        field616++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            class136.method849(var3, 0, class27.field410, this.field610);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lfe;ZI)V", line = 83)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method265(1, -68);
        }
        if (arg2 == 0) {
            this.field610 = (arg0.method1535((byte) 124) << 12) / 255;
        }
        field617++;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V", line = 109)
    public static void method266(byte arg0) {
        field612 = null;
        if (arg0 <= 47) {
            field609 = (class283[]) null;
        }
        field614 = null;
        field611 = null;
        field609 = null;
    }
}
