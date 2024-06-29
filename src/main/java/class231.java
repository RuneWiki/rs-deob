import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class231 extends class115 {

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "I")
    private int field3133 = 0;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "I")
    private int field3136 = 0;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
    private int field3131 = 20;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
    private int field3134 = 1365;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "[I")
    public static int[] field3129 = new int[] { 0, 0, 0, 3, 0, 0, 10, 0, 6, 1, 8, -2, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 7, 0, 8, -1, 0, -1, 8, 6, 0, 0, 0, -2, -2, 0, 0, 0, 8, 0, 4, 0, 7, 0, 9, 0, 0, 0, 6, 1, 0, 0, 0, 0, 8, 0, 3, 0, 0, 0, 0, -1, 2, 6, 8, 5, 0, 0, 8, 8, 3, 0, 0, 0, -2, -2, 17, 0, 0, 0, 3, 12, -1, 0, 7, -1, 0, 0, 0, 0, 3, 1, 0, 0, 10, 0, 6, -1, 0, 2, 0, 2, 10, -1, 0, 0, 8, 0, 0, 4, 0, 12, 0, 12, 3, -1, 0, 12, 0, 0, 0, -2, 0, 0, -2, 0, 2, -1, 0, 0, 0, 6, 20, 0, 0, 0, 0, -1, 0, 4, 0, 0, 6, 6, 0, -1, -1, 2, 0, 1, 11, 0, -2, 0, 0, 0, 0, 0, -1, 0, -1, 7, 0, 0, 14, 0, -2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, -2, 0, 6, 0, 0, 0, 0, 2, 0, 0, 0, 6, 0, -1, 15, 0, 0, -1, 0, 0, 0, 0, 0, 5, 8, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 14, 0, 0, 0, -1, 0, 2, -2, 0, 3, 0, 0, 15, -2, 0, 0, 0, 0, 0, 28, 10, -1, 12, 1 };

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V", line = 3)
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)Z", line = 16)
    public static final boolean method1474(int arg0) {
        ++field3132;
        if (arg0 != -1) {
            field3128 = -15;
        }
        return ~class433.field6324 < -1;
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(B)V", line = 31)
    public static void method1475(byte arg0) {
        if (arg0 != 111) {
            method1476((byte) 37, 56);
        }
        field3129 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)V", line = 50)
    public static final void method1476(byte arg0, int arg1) {
        ++field3138;
        class237.field3225 = -1;
        class221.field3025 = arg1;
        int var2 = 116 / ((arg0 - -2) / 59);
        class342.field5027 = -1;
        class157.method1032(-6600);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)[I", line = 73)
    public final int[] method57(int arg0, int arg1) {
        if (arg1 != 0) {
            method1475((byte) 107);
        }
        ++field3130;
        int[] var3 = super.field1340.method14(104, arg0);
        if (super.field1340.field35) {
            for (int var4 = 0; ~var4 > ~class218.field2979; ++var4) {
                int var5 = (class43.field530[var4] << 12) / this.field3134 + this.field3136;
                int var6 = (class193.field2634[arg0] << 12) / this.field3134 + this.field3133;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field3131 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var7 + var11;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field3131 + -1 > var13 ? (var13 << 12) / this.field3131 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLbk;I)V", line = 131)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field3137;
        if (arg0 <= 83) {
            field3127 = 29;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field3133 = arg1.method1355(32136);
                    }
                } else {
                    this.field3136 = arg1.method1355(32136);
                }
            } else {
                this.field3131 = arg1.method1355(32136);
            }
        } else {
            this.field3134 = arg1.method1355(32136);
        }
    }
}
