import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class353 extends class349 {

    @OriginalMember(owner = "client!oca", name = "K", descriptor = "I")
    private int field5154 = 3072;

    @OriginalMember(owner = "client!oca", name = "Q", descriptor = "I")
    private int field5160 = 1024;

    @OriginalMember(owner = "client!oca", name = "O", descriptor = "I")
    private int field5158 = 2048;

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
    public static int field5149 = 2;

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field5147 = new String[100];

    @OriginalMember(owner = "client!oca", name = "P", descriptor = "I")
    public static int field5159 = 0;

    @OriginalMember(owner = "client!oca", name = "R", descriptor = "I")
    public static int field5161 = 0;

    @OriginalMember(owner = "client!oca", name = "N", descriptor = "F")
    public static float field5157;

    @OriginalMember(owner = "client!oca", name = "B", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!oca", name = "F", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!oca", name = "I", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!oca", name = "J", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!oca", name = "L", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!oca", name = "M", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)[[I", line = 6)
    public final int[][] method9(int arg0, byte arg1) {
        ++field5146;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = 104 / ((-32 - arg1) / 47);
        if (super.field5103.field5314) {
            int[][] var5 = this.method2180(0, 125, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class39.field497; ++var12) {
                var9[var12] = this.field5160 - -(var6[var12] * this.field5158 >> 12);
                var10[var12] = (var7[var12] * this.field5158 >> 12) + this.field5160;
                var11[var12] = this.field5160 - -(var8[var12] * this.field5158 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "([BII)[B", line = 52)
    public static final byte[] method2202(byte[] arg0, int arg1, int arg2) {
        ++field5152;
        byte[] var3 = new byte[arg1];
        if (arg2 >= -26) {
            method2204(false);
        }
        class657.method3639(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V", line = 67)
    public class353() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(BI)[I", line = 70)
    public final int[] method13(byte arg0, int arg1) {
        ++field5148;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[] var4 = this.method2181(0, -1090477337, arg1);
            for (int var5 = 0; class39.field497 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field5158 >> 12) + this.field5160;
            }
        }
        int var6 = -60 / ((arg0 - 56) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(BI)V", line = 103)
    public static final void method2203(byte arg0, int arg1) {
        ++field5153;
        class351.field5122 = arg1;
        class522.field7230 = -1;
        class522.field7230 = -1;
        if (arg0 >= -28) {
            field5147 = null;
        }
        class511.method2892(-1);
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V", line = 126)
    public final void method11(byte arg0) {
        ++field5155;
        if (arg0 < -51) {
            this.field5158 = -this.field5160 + this.field5154;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V", line = 144)
    public static void method2204(boolean arg0) {
        if (!arg0) {
            field5157 = -0.2976981F;
        }
        field5147 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILoa;II)V", line = 156)
    public static final void method2205(int arg0, class689 arg1, int arg2, int arg3) {
        class606.field8280 = arg1;
        ++field5156;
        class390.field5608 = new class208[arg0][arg3];
        if (class623.field8469 != null) {
            class59.field835 = class428.method2464(class623.field8469[0], 0, class623.field8469[5], class623.field8469[2], class623.field8469[1], class623.field8469[3], class623.field8469[4]);
        }
        class237.field3084 = new class208();
        if (arg2 != 1626015052) {
            method2205(-2, (class689) null, -48, 92);
        }
        class195.method1244(false);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILdga;)V", line = 175)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field5100 = arg2.method957((byte) -69) == 1;
                }
            } else {
                this.field5154 = arg2.method922((byte) -122);
            }
        } else {
            this.field5160 = arg2.method922((byte) -125);
        }
        if (arg0 != 4095) {
            field5159 = -33;
        }
        ++field5150;
    }
}
