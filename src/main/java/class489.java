import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class489 extends class573 {

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    public static int field7003 = 0;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "[Llea;")
    private class570[] field6997;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field6999;
        int[] var3 = super.field8321.method3164(arg0, -117);
        if (arg1 != 1) {
            this.method619(-86, -42);
        }
        if (super.field8321.field7825) {
            this.method2946(super.field8321.method3163(-127), -98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class489() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([[II)V")
    private final void method2946(int[][] arg0, int arg1) {
        ++field7002;
        int var3 = class540.field7555;
        int var4 = 62 % ((-22 - arg1) / 52);
        int var5 = class419.field6037;
        class130.method1099(arg0, -7);
        class167.method1271(0, class591.field8492, 0, 0, class189.field3019);
        if (this.field6997 != null) {
            for (int var6 = 0; var6 < this.field6997.length; ++var6) {
                class570 var7 = this.field6997[var6];
                int var8 = var7.field8296;
                int var9 = var7.field8298;
                if (~var8 <= -1) {
                    if (var9 >= 0) {
                        var7.method279(var5, var3, (byte) 127);
                    } else {
                        var7.method280(var3, 38, var5);
                    }
                } else if (~var9 <= -1) {
                    var7.method282(var3, false, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field6997 = new class570[arg0.method732(-559537960)];
            for (int var4 = 0; ~var4 > ~this.field6997.length; ++var4) {
                int var5 = arg0.method732(arg2 + -559537963);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field6997[var4] = class605.method3484(27865, arg0);
                            }
                        } else {
                            this.field6997[var4] = class189.method1382(arg0, 592062180);
                        }
                    } else {
                        this.field6997[var4] = class426.method2591(-1, arg0);
                    }
                } else {
                    this.field6997[var4] = class505.method3000(arg2 + 188, arg0);
                }
            }
        } else if (arg1 == 1) {
            super.field8334 = ~arg0.method732(-559537960) == -2;
        }
        if (arg2 != 3) {
            this.method442(-102, 109);
        }
        ++field7000;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field6998;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (arg0 > -116) {
            field7003 = 90;
        }
        if (super.field8320.field3295) {
            int var4 = class540.field7555;
            int var5 = class419.field6037;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field8320.method1502(-98);
            this.method2946(var6, 56);
            for (int var8 = 0; ~class419.field6037 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class540.field7555; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class481.method2919(4080, var15 << 4);
                    var12[var14] = class481.method2919(var15, 65280) >> 4;
                    var11[var14] = class481.method2919(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }
}
