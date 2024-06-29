import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class421 extends class40 {

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    private int field6021 = 0;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    private int field6024 = 4096;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field6020 = 0;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "[I")
    public static int[] field6026 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Ltj;")
    public static class108 field6022;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILlf;)V", line = 4)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field6025;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field550 = arg2.method837(true) == 1;
                }
            } else {
                this.field6024 = arg2.method798(false);
            }
        } else {
            this.field6021 = arg2.method798(false);
        }
        if (arg1 <= 79) {
            method2645(true, 98);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 49)
    public class421() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V", line = 59)
    public static void method2644(boolean arg0) {
        if (arg0) {
            field6022 = null;
            field6026 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I", line = 73)
    public final int[][] method112(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method43(44, 122, (class130) null);
        }
        ++field6023;
        int[][] var3 = super.field555.method2070(arg0 + -1, arg1);
        if (super.field555.field4489) {
            int[][] var4 = this.method261(0, 28552, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class410.field5886; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field6021 <= var12) {
                    if (~this.field6024 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field6024;
                    }
                } else {
                    var8[var11] = this.field6021;
                }
                if (~this.field6021 < ~var13) {
                    var9[var11] = this.field6021;
                } else if (~this.field6024 <= ~var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field6024;
                }
                if (var14 < this.field6021) {
                    var10[var11] = this.field6021;
                } else if (this.field6024 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field6024;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)I", line = 155)
    public static final int method2645(boolean arg0, int arg1) {
        ++field6019;
        if (arg0) {
            field6020 = -50;
        }
        return arg1 & 1023;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)[I", line = 169)
    public final int[] method44(byte arg0, int arg1) {
        ++field6027;
        if (arg0 >= -20) {
            return null;
        } else {
            int[] var3 = super.field551.method185(65280, arg1);
            if (super.field551.field441) {
                int[] var4 = this.method266((byte) -116, arg1, 0);
                for (int var5 = 0; var5 < class410.field5886; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 <= ~this.field6021) {
                        if (var6 > this.field6024) {
                            var3[var5] = this.field6024;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field6021;
                    }
                }
            }
            return var3;
        }
    }
}
