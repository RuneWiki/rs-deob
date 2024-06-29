import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class232 extends class45 {

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    private int field3383 = 0;

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
    private int field3386 = 4096;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "[I")
    public static int[] field3384 = new int[25];

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
    public static int field3381 = 0;

    @OriginalMember(owner = "client!rq", name = "R", descriptor = "[I")
    public static int[] field3389 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!rq", name = "S", descriptor = "I")
    public static int field3390 = 999999;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!rq", name = "Q", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "Lf;")
    public static class529 field3382;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method49(int arg0, int arg1) {
        ++field3379;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (super.field833.field1888) {
            int[][] var4 = this.method437(0, arg1, -106);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class259.field3768 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 > ~this.field3383) {
                    var8[var11] = this.field3383;
                } else if (this.field3386 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field3386;
                }
                if (this.field3383 <= var13) {
                    if (~this.field3386 > ~var13) {
                        var9[var11] = this.field3386;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field3383;
                }
                if (~this.field3383 < ~var14) {
                    var10[var11] = this.field3383;
                } else if (this.field3386 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field3386;
                }
            }
        }
        if (arg0 != 8) {
            this.field3386 = -45;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "(B)V", line = 87)
    public static void method1529(byte arg0) {
        field3384 = null;
        if (arg0 <= -111) {
            field3389 = null;
            field3382 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(II)V", line = 102)
    public static final void method1530(int arg0, int arg1) {
        ++field3385;
        class55 var2 = class487.field7215;
        synchronized (class487.field7215) {
            class487.field7215.method493(false, arg1);
        }
        if (arg0 != 2) {
            field3384 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V", line = 162)
    public class232() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lcu;II)V", line = 119)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            this.field3383 = 25;
        }
        ++field3387;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field844 = arg0.method1063((byte) -78) == 1;
                }
            } else {
                this.field3386 = arg0.method1069((byte) -16);
            }
        } else {
            this.field3383 = arg0.method1069((byte) -93);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[I", line = 165)
    public final int[] method35(int arg0, int arg1) {
        ++field3388;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field854.field1928) {
                int[] var4 = this.method434(0, arg1, 123);
                for (int var5 = 0; ~var5 > ~class259.field3768; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 > ~this.field3383) {
                        var3[var5] = this.field3383;
                    } else if (var6 <= this.field3386) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field3386;
                    }
                }
            }
            return var3;
        }
    }
}
