import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class776 extends class325 {

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field10672;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public static int field10673;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field10674;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public static int field10675;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field10674;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            for (int var4 = 0; class261.field3874 > var4; ++var4) {
                this.method4299(var4, arg1, 1);
                int[] var5 = this.method2062(class683.field9619, 0, (byte) 33);
                var3[var4] = var5[class307.field4447];
            }
        }
        if (arg0 < 21) {
            this.method100((byte) -36, -91);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            super.field4738 = arg0.method2398(-1372747256) == 1;
        }
        if (arg2 < -41) {
            ++field10675;
        }
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(III)V")
    private final void method4299(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            ++field10672;
            int var4 = class556.field7498[arg0];
            int var5 = class621.field8370[arg1];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class307.field4447 = arg0;
                class683.field9619 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class307.field4447 = arg1;
                class683.field9619 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class683.field9619 = arg0;
                class307.field4447 = -arg1 + class261.field3874;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class683.field9619 = class657.field9077 - arg1;
                class307.field4447 = arg0;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class683.field9619 = class657.field9077 - arg1;
                class307.field4447 = -arg0 + class261.field3874;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class307.field4447 = -arg1 + class261.field3874;
                class683.field9619 = -arg0 + class657.field9077;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class307.field4447 = arg1;
                class683.field9619 = -arg0 + class657.field9077;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class307.field4447 = class261.field3874 - arg0;
                class683.field9619 = arg1;
            }
            class307.field4447 &= class625.field8423;
            class683.field9619 &= class566.field7574;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)[[I")
    public final int[][] method360(int arg0, byte arg1) {
        if (arg1 != -9) {
            return null;
        } else {
            ++field10673;
            int[][] var3 = super.field4733.method1251((byte) 119, arg0);
            if (super.field4733.field2369) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class261.field3874; ++var7) {
                    this.method4299(var7, arg0, arg1 ^ -10);
                    int[][] var8 = this.method2063(0, 1, class683.field9619);
                    var4[var7] = var8[0][class307.field4447];
                    var5[var7] = var8[1][class307.field4447];
                    var6[var7] = var8[2][class307.field4447];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
    public class776() {
        super(1, false);
    }
}
