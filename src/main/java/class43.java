import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public abstract class class43 {

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "[I")
    public static int[] field592 = new int[8];

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "[I")
    public static int[] field587 = new int[16];

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "Z")
    public static boolean field590 = false;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "Ljava/lang/String;")
    public static String field594;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "[I")
    public static int[] field584;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method377(int arg0) {
        field595++;
        if (arg0 < 46) {
            this.method381((byte) 107);
        }
        return (this.field596 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([II[Ljava/lang/Object;)V", line = 24)
    public static final void method378(int[] arg0, int arg1, Object[] arg2) {
        int var3 = -123 % ((arg1 - 36) / 63);
        field588++;
        class364.method2193(0, arg0, -10055, arg2, arg0.length - 1);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)Z", line = 41)
    public final boolean method379(int arg0) {
        field589++;
        if (arg0 == 28149) {
            return (this.field596 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)Z", line = 52)
    public final boolean method380(int arg0) {
        field591++;
        if (arg0 != 8) {
            field584 = null;
        }
        return (this.field596 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)Z", line = 72)
    public final boolean method381(byte arg0) {
        int var2 = -83 % ((arg0 + 59) / 62);
        field585++;
        return (this.field596 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V", line = 88)
    public static void method382(int arg0) {
        field594 = null;
        field584 = null;
        if (arg0 != -1) {
            method378(null, 49, null);
        }
        field587 = null;
        field592 = null;
    }
}
