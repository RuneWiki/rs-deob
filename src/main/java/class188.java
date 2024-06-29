import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class188 extends class7 {

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    private int field3636 = 1365;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "I")
    private int field3642 = 20;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    private int field3641 = 0;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    private int field3638 = 0;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    public static int field3637 = 0;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "[Lob;")
    public static class141[] field3640 = new class141[200];

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "Lob;")
    private static class141 field3643 = class175.method1195(40, "glow1:");

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "Lob;")
    public static class141 field3644 = field3643;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "Lob;")
    public static class141 field3645 = field3643;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    public static int field3648 = 0;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "[I")
    public static int[] field3647 = new int[2048];

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -48 % ((66 - arg1) / 57);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field3641 = arg2.method1007(84);
                    }
                } else {
                    this.field3638 = arg2.method1007(46);
                }
            } else {
                this.field3642 = arg2.method1007(123);
            }
        } else {
            this.field3636 = arg2.method1007(127);
        }
        ++field3646;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
    public static void method1250(boolean arg0) {
        if (arg0) {
            field3644 = null;
            field3640 = null;
            field3643 = null;
            field3647 = null;
            field3645 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class188() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            this.method31(41, -21, (class146) null);
        }
        ++field3639;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            for (int var4 = 0; ~var4 > ~class117.field2272; ++var4) {
                int var5 = (class15.field272[var4] << 12) / this.field3636 + this.field3638;
                int var6 = (class177.field3503[arg1] << 12) / this.field3636 - -this.field3641;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                int var13 = var6;
                while (var10 + var11 < 16384 && ~var12 > ~this.field3642) {
                    ++var12;
                    var13 = (var9 * var13 >> 12) * 2 + var8;
                    var9 = -var11 + var10 + var7;
                    var11 = var13 * var13 >> 12;
                    var10 = var9 * var9 >> 12;
                }
                var3[var4] = ~var12 <= ~(this.field3642 + -1) ? 0 : (var12 << 12) / this.field3642;
            }
        }
        return var3;
    }
}
