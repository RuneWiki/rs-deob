import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class661 extends class362 {

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    private int field9156 = 4096;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    private int field9155 = 0;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "Lvl;")
    public static class15 field9151 = new class15(52, 8);

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "[Lqj;")
    public static class537[] field9160 = new class537[300];

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "Z")
    public static boolean field9161 = false;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "Lmo;")
    public static class780 field9159 = new class780("", 15);

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Lgj;")
    public static class662 field9153;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(CI)Z")
    public static final boolean method3716(char arg0, int arg1) {
        ++field9154;
        if (arg1 <= 18) {
            return true;
        } else if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
        } else {
            return ~arg0 == -8365 || ~arg0 == -339 || ~arg0 == -8213 || ~arg0 == -340 || ~arg0 == -377;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field9152;
        if (arg0 != -2026769311) {
            return null;
        } else {
            int[] var3 = super.field4927.method808(arg0 + 2026769184, arg1);
            if (super.field4927.field1471) {
                int[] var4 = this.method2221(0, arg1, arg0 + 2026769307);
                for (int var5 = 0; ~class769.field10597 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~this.field9155 >= ~var6 && var6 <= this.field9156 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method154((class93) null, -80, -105);
        }
        ++field9158;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field9156 = arg0.method763(117);
            }
        } else {
            this.field9155 = arg0.method763(122);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class661() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    public static void method3717(int arg0) {
        field9160 = null;
        field9159 = null;
        field9153 = null;
        if (arg0 != 4096) {
            field9160 = null;
        }
        field9151 = null;
    }
}
