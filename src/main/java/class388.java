import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class388 extends class139 {

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    private int field5507 = 0;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    private int field5510 = 4096;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "Lus;")
    public static class1 field5505 = new class1(56, -2);

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "[I")
    public static int[] field5512 = new int[14];

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field5510 = arg0.method1729(65280);
            }
        } else {
            this.field5507 = arg0.method1729(65280);
        }
        ++field5509;
        if (arg1 != -45) {
            field5505 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
    public static void method2333(int arg0) {
        field5505 = null;
        if (arg0 != 0) {
            field5505 = null;
        }
        field5512 = null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class388() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
    public static final int method2334(int arg0, int arg1, int arg2, int arg3) {
        ++field5508;
        if ((class413.field5813[arg1][arg3][arg0] & 8) != 0) {
            return 0;
        } else {
            return ~arg1 < arg2 && ~(class413.field5813[1][arg3][arg0] & 2) != -1 ? arg1 + -1 : arg1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field5506;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int[] var4 = this.method879((byte) -29, arg0, 0);
            for (int var5 = 0; ~class356.field5147 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field5507 <= var6 && ~this.field5510 <= ~var6 ? 4096 : 0;
            }
        }
        if (arg1 != 27782) {
            this.field5510 = 83;
        }
        return var3;
    }
}
