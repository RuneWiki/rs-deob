import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class209 extends class263 {

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    private int field3011 = 0;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    private int field3016 = 1;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    private int field3013 = 0;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "Z")
    public static boolean field3010 = false;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field3019 = 0;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)[I", line = 7)
    public final int[] method33(int arg0, byte arg1) {
        ++field3017;
        if (arg1 <= 40) {
            this.field3013 = 52;
        }
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int var4 = class170.field2509[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class367.field5597; ++var6) {
                int var7 = class379.field5711[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field3011 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field3016 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field3016;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field3013 != 0) {
                    if (~this.field3013 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class498.field7386[(var12 & 4087) >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 78)
    public class209() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([J[Ljava/lang/Object;III)V", line = 87)
    public static final void method1354(long[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        ++field3018;
        if (~arg4 > ~arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; ~var11 > ~arg3; ++var11) {
                if (~arg0[var11] > ~(var7 - -((long) (var11 & var10)))) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var9;
            method1354(arg0, arg1, -54, var6 + -1, arg4);
            method1354(arg0, arg1, -107, arg3, var6 + 1);
        }
        if (arg2 >= -39) {
            field3019 = 95;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLgk;)V", line = 149)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field3015;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 3) {
                    this.field3016 = arg2.method2765(126);
                }
            } else {
                this.field3013 = arg2.method2765(94);
            }
        } else {
            this.field3011 = arg2.method2765(113);
        }
        if (!arg1) {
            this.method748((byte) -8);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V", line = 192)
    public final void method748(byte arg0) {
        class200.method1326(84);
        if (arg0 == 110) {
            ++field3012;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lvi;BIIB)V", line = 203)
    public static final void method1355(class480 arg0, byte arg1, int arg2, int arg3, byte arg4) {
        ++field3014;
        int var5 = arg0.field6065[0];
        int var6 = arg0.field6068[0];
        if (~var5 <= -1 && var5 < class50.field640 && var6 >= 0 && class448.field6611 > var6) {
            if (arg2 >= 0 && arg2 < class50.field640 && arg3 >= 0 && ~class448.field6611 < ~arg3) {
                int var7 = class282.method1758(arg0.method2419((byte) 112), var5, class476.field7013, 0, arg3, class25.field373, -4, true, 0, 0, class151.field2300[arg0.field7686], var6, 127, 0, arg2);
                if (var7 >= 1) {
                    int var8 = 58 % ((arg4 - -40) / 41);
                    if (~var7 >= -4) {
                        for (int var9 = 0; var9 < var7 + -1; ++var9) {
                            arg0.method2861(class476.field7013[var9], 0, arg1, class25.field373[var9]);
                        }
                    }
                }
            }
        }
    }
}
