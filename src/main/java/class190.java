import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class190 extends class172 {

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
    public static int field3619 = -1;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "Ls;")
    public static class163 field3622;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static final void method1212(byte arg0) {
        if (arg0 >= 6) {
            class134.field2518.method226((byte) -90);
            ++field3620;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lai;I)I")
    public static final int method1213(class10 arg0, int arg1) {
        ++field3621;
        if (class63.field1057 == 1) {
            return 7;
        } else if (arg0.method36((byte) 69, class64.field1074)) {
            return 1;
        } else if (arg0.method36((byte) 69, class115.field2197)) {
            return 1;
        } else if (arg0.method36((byte) 69, class163.field3126)) {
            return 2;
        } else if (arg0.method36((byte) 69, class21.field324)) {
            return 2;
        } else if (arg0.method36((byte) 69, class30.field470)) {
            return 3;
        } else if (arg0.method36((byte) 69, class122.field2339)) {
            return 4;
        } else if (arg0.method36((byte) 69, class128.field2424)) {
            return 4;
        } else if (arg0.method36((byte) 69, class189.field3609)) {
            return 5;
        } else if (arg0.method36((byte) 69, class75.field1302)) {
            return 6;
        } else {
            if (arg1 != 0) {
                method1212((byte) 33);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public static void method1214(byte arg0) {
        if (arg0 == -116) {
            field3622 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field3623;
        int[][] var3 = super.field2666.method956(arg0, -93);
        if (arg1) {
            return null;
        } else {
            if (super.field2666.field2664 && this.method1128(0)) {
                int[] var4 = var3[1];
                int[] var5 = var3[0];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field3328 * super.field3328;
                for (int var8 = 0; var8 < class133.field2499; ++var8) {
                    int var9 = super.field3325[var8 % super.field3327 + var7];
                    var6[var8] = class123.method861(var9, 255) << 4;
                    var4[var8] = class123.method861(var9 >> 4, 4080);
                    var5[var8] = class123.method861(4080, var9 >> 12);
                }
            }
            return var3;
        }
    }
}
