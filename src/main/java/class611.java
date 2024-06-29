import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class611 extends class667 {

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    private int field8834 = 20;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    private int field8837 = 0;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    private int field8835 = 0;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    private int field8840 = 1365;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field8839 = 0;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field8842 = 0;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Lpu;")
    public static class559 field8836 = new class559(0, 3);

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Ljava/lang/String;")
    public static String field8844 = null;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "Lee;")
    public static class673 field8843 = new class673("LOCAL", 4);

    @OriginalMember(owner = "client!te", name = "N", descriptor = "Liga;")
    public static class454 field8845 = new class454(2);

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 166)
    public class611() {
        super(0, true);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[I", line = 11)
    public final int[] method117(byte arg0, int arg1) {
        ++field8841;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 > -87) {
            return null;
        } else {
            if (super.field9355.field3728) {
                for (int var4 = 0; ~var4 > ~class77.field1455; ++var4) {
                    int var5 = (class20.field261[var4] << 12) / this.field8840 - -this.field8835;
                    int var6 = (class385.field5384[arg1] << 12) / this.field8840 - -this.field8837;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13;
                    for (var13 = 0; var11 + var12 < 16384 && ~this.field8834 < ~var13; ++var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var7 + var11;
                        var12 = var10 * var10 >> 12;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = var13 >= this.field8834 + -1 ? 0 : (var13 << 12) / this.field8834;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lud;II)V", line = 72)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field8837 = arg0.method253(-13900);
                    }
                } else {
                    this.field8835 = arg0.method253(-13900);
                }
            } else {
                this.field8834 = arg0.method253(-13900);
            }
        } else {
            this.field8840 = arg0.method253(-13900);
        }
        if (arg1 == 3) {
            ++field8833;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lud;IZ)Ljava/lang/String;", line = 123)
    public static final String method3520(class35 arg0, int arg1, boolean arg2) {
        ++field8838;
        try {
            int var3 = arg0.method232((byte) 45);
            if (~arg1 > ~var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field469 += class377.field5263.method1327(-1, 0, arg0.field483, arg0.field469, var4, var3);
            String var5 = class268.method1791(0, var4, var3, 0);
            return arg2 ? null : var5;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V", line = 176)
    public static void method3521(byte arg0) {
        field8844 = null;
        if (arg0 == -103) {
            field8843 = null;
            field8845 = null;
            field8836 = null;
        }
    }
}
