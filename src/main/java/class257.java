import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class257 extends class398 {

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "Z")
    public static boolean field3768 = false;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method99(int arg0, int arg1) {
        ++field3765;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (arg1 != 2) {
            this.method208((class228) null, 56, 121);
        }
        if (super.field5933.field4847) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class140.field1922 > var7; ++var7) {
                this.method1789(-19343, arg0, var7);
                int[][] var8 = this.method2561(class449.field6579, (byte) -67, 0);
                var4[var7] = var8[0][class281.field4097];
                var5[var7] = var8[1][class281.field4097];
                var6[var7] = var8[2][class281.field4097];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lnj;II)V", line = 46)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            super.field5931 = arg0.method1348(-94) == 1;
        }
        ++field3766;
        if (arg2 != -13132) {
            field3768 = false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(III)V", line = 61)
    private final void method1789(int arg0, int arg1, int arg2) {
        ++field3767;
        int var4 = class375.field5448[arg2];
        int var5 = class84.field1206[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class449.field6579 = arg1;
            class281.field4097 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class449.field6579 = arg2;
            class281.field4097 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class281.field4097 = -arg1 + class140.field1922;
            class449.field6579 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class449.field6579 = class329.field4798 - arg1;
            class281.field4097 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class281.field4097 = -arg2 + class140.field1922;
            class449.field6579 = -arg1 + class329.field4798;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class281.field4097 = class140.field1922 - arg1;
            class449.field6579 = -arg2 + class329.field4798;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class281.field4097 = arg1;
            class449.field6579 = -arg2 + class329.field4798;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class449.field6579 = arg1;
            class281.field4097 = -arg2 + class140.field1922;
        }
        class281.field4097 &= class242.field3233;
        class449.field6579 &= class411.field6070;
        if (arg0 != -19343) {
            field3768 = true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 141)
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I", line = 146)
    public final int[] method95(int arg0, int arg1) {
        ++field3769;
        int[] var3 = super.field5927.method305(arg0, (byte) 99);
        if (arg1 != 0) {
            field3768 = true;
        }
        if (super.field5927.field591) {
            for (int var4 = 0; class140.field1922 > var4; ++var4) {
                this.method1789(-19343, arg0, var4);
                int[] var5 = this.method2558(0, 29295, class449.field6579);
                var3[var4] = var5[class281.field4097];
            }
        }
        return var3;
    }
}
