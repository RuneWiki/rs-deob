import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class458 extends class747 {

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    private int field6361 = 1;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    private int field6362 = 1;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    private int field6364 = 204;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ldc;II)V", line = 5)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 == 11608) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field6364 = arg0.method482(-772591672);
                    }
                } else {
                    this.field6361 = arg0.method505((byte) -119);
                }
            } else {
                this.field6362 = arg0.method505((byte) -119);
            }
            ++field6365;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I", line = 50)
    public final int[] method182(int arg0, int arg1) {
        ++field6358;
        if (arg1 >= -89) {
            this.field6361 = 3;
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            for (int var4 = 0; ~class73.field1095 < ~var4; ++var4) {
                int var5 = class639.field8571[var4];
                int var6 = class515.field7103[arg0];
                int var7 = this.field6362 * var5 >> 12;
                int var8 = this.field6361 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6362) * this.field6362;
                int var10 = var6 % (4096 / this.field6361) * this.field6361;
                if (var10 < this.field6364) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field6364) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field6364 > var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 223)
    public class458() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lha;I)V", line = 144)
    public static final void method2796(class548 arg0, int arg1) {
        ++field6360;
        if (arg1 == 25665) {
            int var2 = 0;
            int var3 = 0;
            if (class222.field3009) {
                var2 = class580.method3374(24188);
                var3 = class721.method4038(true);
            }
            arg0.method1544(var2, var3, class118.field1561 + var2, var3 + 350);
            arg0.method1412(var2, var3, class118.field1561, 350, class140.field1995 << 24 | 3351159, 1);
            class483.method2944(class118.field1561 + var2, var3 + 350, var2, var3, -1);
            int var4 = 350 / class688.field9576;
            if (~class537.field7437 < -1) {
                int var5 = -class688.field9576 + 346 - 4;
                int var6 = var4 * var5 / (class537.field7437 + -1 + var4);
                int var7 = 4;
                if (class537.field7437 > 1) {
                    var7 += (class537.field7437 - class489.field6846 + -1) * (-var6 + var5) / (class537.field7437 - 1);
                }
                arg0.method1412(class118.field1561 + -16 + var2, var3 + var7, 12, var6, class140.field1995 << 24 | 3351159, 2);
                for (int var8 = class489.field6846; ~(class489.field6846 + var4) < ~var8 && class537.field7437 > var8; ++var8) {
                    String[] var9 = class494.method2992('\b', class297.field4232[var8], arg1 ^ 25664);
                    int var10 = (class118.field1561 + -16 + -8) / var9.length;
                    for (int var11 = 0; ~var11 > ~var9.length; ++var11) {
                        int var12 = var10 * var11 + 8;
                        arg0.method1544(var2 + var12, var3, var10 + -8 + var2 + var12, var3 - -350);
                        class272.field3950.method2505(var2 + var12, -100, -16777216, class533.method3164(var9[var11], arg1 + -25666), -1, var3 - ((-class489.field6846 + var8) * class688.field9576 + (2 - -class524.field7280.field2464)) + 350 + -class720.field10025);
                    }
                }
            }
            class1.field14.method2506(var2 - -class118.field1561 + -25, -1, -85, var3 + 350 - 20, "Build: 641", -16777216);
            arg0.method1544(var2, var3, class118.field1561 + var2, var3 + 350);
            arg0.method3243(var2, (byte) -27, var3 + 350 + -class720.field10025, -1, class118.field1561);
            class758.field10575.method2505(var2 + 10, arg1 ^ -25614, -16777216, "--> " + class533.method3164(class445.field6173, -1), -1, var3 - -350 + -class535.field7417.field2464 + -1);
            if (class121.field1585) {
                int var13 = -1;
                if (~(class483.field6741 % 30) < -16) {
                    var13 = 16777215;
                }
                arg0.method3254(12, var13, -class535.field7417.field2464 + -11 + 350 + var3, var2 - (-10 - class535.field7417.method1133(96, "--> " + class533.method3164(class445.field6173, -1).substring(0, class507.field7045))), false);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIZIIIII)V", line = 229)
    public static final void method2797(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6359;
        class6 var8 = null;
        for (class6 var9 = (class6) class755.field10409.method3618(-55); var9 != null; var9 = (class6) class755.field10409.method3619(0)) {
            if (var9.field50 == arg6 && ~var9.field53 == ~arg7 && ~var9.field41 == ~arg1 && ~var9.field47 == ~arg5) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class6();
            var8.field41 = arg1;
            var8.field53 = arg7;
            var8.field47 = arg5;
            var8.field50 = arg6;
            if (~arg7 <= -1 && arg1 >= 0 && arg7 < class277.field4036 && ~arg1 > ~class667.field9202) {
                class449.method2732(-1389, var8);
            }
            class755.field10409.method3610(9289, var8);
        }
        var8.field56 = false;
        var8.field51 = arg0;
        var8.field49 = arg4;
        var8.field46 = arg3;
        var8.field42 = arg2;
    }
}
