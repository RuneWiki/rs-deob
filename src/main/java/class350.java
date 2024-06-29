import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class350 extends class243 {

    @OriginalMember(owner = "client!ow", name = "J", descriptor = "Lfh;")
    public static class651 field4643;

    @OriginalMember(owner = "client!ow", name = "H", descriptor = "Lfh;")
    public static class651 field4641 = field4643 = new class651(false);

    @OriginalMember(owner = "client!ow", name = "D", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ow", name = "E", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ow", name = "F", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ow", name = "G", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ow", name = "I", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ow", name = "K", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)[[I", line = 9)
    public final int[][] method2(int arg0, int arg1) {
        if (arg0 > -76) {
            return null;
        } else {
            ++field4638;
            int[][] var3 = super.field3156.method3306(arg1, 0);
            if (super.field3156.field8335) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class687.field9628; ++var7) {
                    this.method2035(-2048, arg1, var7);
                    int[][] var8 = this.method1457(class684.field9521, 24431, 0);
                    var4[var7] = var8[0][class593.field8264];
                    var5[var7] = var8[1][class593.field8264];
                    var6[var7] = var8[2][class593.field8264];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)[I", line = 50)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 != 255) {
            return null;
        } else {
            ++field4637;
            int[] var3 = super.field3164.method3742((byte) 98, arg1);
            if (super.field3164.field9250) {
                for (int var4 = 0; ~var4 > ~class687.field9628; ++var4) {
                    this.method2035(-2048, arg1, var4);
                    int[] var5 = this.method1462(class684.field9521, 0, arg0 ^ 255);
                    var3[var4] = var5[class593.field8264];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILji;B)V", line = 84)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 > -92) {
            this.method5(-69, 63);
        }
        ++field4642;
        if (~arg0 == -1) {
            super.field3159 = ~arg1.method3428((byte) 14) == -2;
        }
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)V", line = 97)
    public static void method2033(int arg0) {
        field4643 = null;
        if (arg0 < 40) {
            method2033(-125);
        }
        field4641 = null;
    }

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "(B)I", line = 108)
    public static final int method2034(byte arg0) {
        ++field4644;
        return arg0 != -4 ? 72 : class494.field6729;
    }

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "(III)V", line = 119)
    private final void method2035(int arg0, int arg1, int arg2) {
        ++field4640;
        int var4 = class666.field9279[arg2];
        int var5 = class685.field9613[arg1];
        float var6 = (float) Math.atan2((double) (arg0 + var4), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class684.field9521 = arg1;
            class593.field8264 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class684.field9521 = arg2;
            class593.field8264 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class684.field9521 = arg2;
            class593.field8264 = -arg1 + class687.field9628;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class593.field8264 = arg2;
            class684.field9521 = -arg1 + class676.field9444;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class593.field8264 = -arg2 + class687.field9628;
            class684.field9521 = -arg1 + class676.field9444;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class593.field8264 = -arg1 + class687.field9628;
            class684.field9521 = -arg2 + class676.field9444;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class684.field9521 = class676.field9444 - arg2;
            class593.field8264 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class593.field8264 = -arg2 + class687.field9628;
            class684.field9521 = arg1;
        }
        class684.field9521 &= class625.field8744;
        class593.field8264 &= class28.field206;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V", line = 190)
    public class350() {
        super(1, false);
    }
}
