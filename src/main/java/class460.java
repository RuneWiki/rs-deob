import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class460 extends class62 {

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    private int field6506 = 0;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    private int field6512 = 4096;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    public static int field6507 = 0;

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "Lclient;")
    public static client field6511;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)[I", line = 4)
    public final int[] method13(int arg0, int arg1) {
        ++field6504;
        if (arg1 != 656024161) {
            this.field6506 = 28;
        }
        int[] var3 = super.field774.method3086(arg0, arg1 + -656024163);
        if (super.field774.field7499) {
            int[] var4 = this.method408(arg0, 0, (byte) -69);
            for (int var5 = 0; var5 < class438.field5847; ++var5) {
                int var6 = var4[var5];
                if (~this.field6506 >= ~var6) {
                    if (var6 <= this.field6512) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field6512;
                    }
                } else {
                    var3[var5] = this.field6506;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lmt;I)Z", line = 47)
    public static final boolean method2785(class336 arg0, int arg1) {
        if (arg1 != 252645135) {
            method2787(-3);
        }
        ++field6509;
        return class239.field3438 == arg0 || class369.field5091 == arg0 || class29.field333 == arg0 || class549.field8195 == arg0;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)Z", line = 60)
    public static final boolean method2786(int arg0, int arg1, int arg2) {
        if (arg0 >= -72) {
            method2787(-5);
        }
        ++field6503;
        return (256 & arg2) != 0;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V", line = 73)
    public class460() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "(I)V", line = 76)
    public static void method2787(int arg0) {
        field6511 = null;
        if (arg0 != -11930) {
            method2786(27, 73, -36);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lgw;II)V", line = 86)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        super.field788 = arg0.method1032((byte) -33) == 1;
                    }
                } else {
                    this.field6512 = arg0.method1045(true);
                }
            } else {
                this.field6506 = arg0.method1045(true);
            }
            ++field6505;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB)[[I", line = 129)
    public final int[][] method409(int arg0, byte arg1) {
        ++field6510;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[][] var4 = this.method407(0, (byte) 41, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class438.field5847; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field6506 > var12) {
                    var8[var11] = this.field6506;
                } else if (~this.field6512 > ~var12) {
                    var8[var11] = this.field6512;
                } else {
                    var8[var11] = var12;
                }
                if (var13 >= this.field6506) {
                    if (~this.field6512 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field6512;
                    }
                } else {
                    var9[var11] = this.field6506;
                }
                if (~this.field6506 >= ~var14) {
                    if (~var14 >= ~this.field6512) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field6512;
                    }
                } else {
                    var10[var11] = this.field6506;
                }
            }
        }
        if (arg1 > -20) {
            method2785((class336) null, -66);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(BI)I", line = 217)
    public static final int method2788(byte arg0, int arg1) {
        int var2 = (1431655765 & arg1 >>> 1) + (1431655765 & arg1);
        int var3 = 85 % ((-17 - arg0) / 55);
        ++field6508;
        int var4 = ((-858993458 & var2) >>> 2) + (var2 & 858993459);
        int var5 = (var4 >>> 4) + var4 & 252645135;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return 255 & var7;
    }
}
