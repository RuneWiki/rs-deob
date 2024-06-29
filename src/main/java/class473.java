import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class473 extends class65 implements class62 {

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lcb;")
    public static class631 field6861 = new class631(20, 8);

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "C")
    public char field6867;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public int field6862;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public int field6864;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field6869;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "J")
    public long field6866;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I", line = 3)
    public final int method614(byte arg0) {
        field6860++;
        if (arg0 != -37) {
            this.method612(-1);
        }
        return this.field6869;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I", line = 15)
    public final int method612(int arg0) {
        if (arg0 == 92) {
            field6859++;
            return this.field6862;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)C", line = 33)
    public final char method611(int arg0) {
        field6865++;
        if (arg0 != 7692) {
            this.field6866 = -105L;
        }
        return this.field6867;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)I", line = 46)
    public final int method613(int arg0) {
        field6863++;
        if (arg0 >= -91) {
            this.method610(true);
        }
        return this.field6864;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V", line = 58)
    public static void method2879(boolean arg0) {
        field6861 = null;
        if (!arg0) {
            field6861 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)J", line = 71)
    public final long method610(boolean arg0) {
        if (!arg0) {
            this.field6864 = 11;
        }
        field6868++;
        return this.field6866;
    }
}
