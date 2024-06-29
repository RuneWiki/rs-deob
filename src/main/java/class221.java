import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class221 extends class298 {

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field3084 = 0;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "[Llf;")
    private class366[] field3082;

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 6)
    public class221() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([[II)V", line = 9)
    private final void method1230(int[][] arg0, int arg1) {
        if (arg1 != 9719) {
            field3084 = 61;
        }
        ++field3080;
        int var3 = class158.field1877;
        int var4 = class388.field5561;
        class360.method2197(arg0, arg1 + -37683);
        class289.method1825(class208.field2886, class474.field6656, (byte) 106, 0, 0);
        if (this.field3082 != null) {
            for (int var5 = 0; ~this.field3082.length < ~var5; ++var5) {
                class366 var6 = this.field3082[var5];
                int var7 = var6.field5242;
                int var8 = var6.field5241;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method374(false, var4, var3);
                    }
                } else if (var8 < 0) {
                    var6.method375((byte) 87, var3, var4);
                } else {
                    var6.method370(var3, var4, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)[I", line = 61)
    public final int[] method13(int arg0, boolean arg1) {
        ++field3085;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            this.method1230(super.field4443.method2876(0), 9719);
        }
        return !arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[[I", line = 87)
    public final int[][] method157(int arg0, int arg1) {
        ++field3083;
        if (arg0 != -24032) {
            field3084 = -32;
        }
        int[][] var3 = super.field4454.method1638((byte) -107, arg1);
        if (super.field4454.field3886) {
            int var4 = class158.field1877;
            int var5 = class388.field5561;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4454.method1641(true);
            this.method1230(var6, arg0 ^ -30761);
            for (int var8 = 0; class388.field5561 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class158.field1877; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class444.method2618(var15 << 4, 4080);
                    var12[var14] = class444.method2618(var15 >> 4, 4080);
                    var11[var14] = class444.method2618(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILvt;)V", line = 149)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg1 == 0) {
            this.field3082 = new class366[arg2.method895((byte) -108)];
            for (int var4 = 0; ~var4 > ~this.field3082.length; ++var4) {
                int var5 = arg2.method895((byte) -125);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field3082[var4] = class438.method2603(arg2, (byte) -73);
                            }
                        } else {
                            this.field3082[var4] = class486.method2874(2, arg2);
                        }
                    } else {
                        this.field3082[var4] = class93.method461(49, arg2);
                    }
                } else {
                    this.field3082[var4] = class208.method1153(-23758, arg2);
                }
            }
        } else if (~arg1 == -2) {
            super.field4449 = arg2.method895((byte) -93) == 1;
        }
        if (arg0 > -44) {
            field3084 = -21;
        }
        ++field3081;
    }
}
