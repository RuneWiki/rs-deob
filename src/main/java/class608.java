import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class608 extends class646 {

    @OriginalMember(owner = "client!gr", name = "N", descriptor = "I")
    public static int field8740 = 1337;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!gr", name = "P", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!gr", name = "R", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!gr", name = "S", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "Lf;")
    public static class257 field8738;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "Lvo;")
    public static class345 field8739;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "Lwv;")
    public static class705 field8737;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "[Llga;")
    private class17[] field8735;

    @OriginalMember(owner = "client!gr", name = "Q", descriptor = "[[[Lko;")
    public static class293[][][] field8743;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field8741;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            this.method3455(super.field9156.method2192(true), 10432);
        }
        if (arg1 != -120) {
            field8740 = 58;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 <= 7) {
            field8743 = null;
        }
        ++field8745;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field9160 = arg0.method2705(-65) == 1;
                return;
            }
        } else {
            this.field8735 = new class17[arg0.method2705(-52)];
            for (int var4 = 0; ~this.field8735.length < ~var4; ++var4) {
                int var5 = arg0.method2705(-72);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field8735[var4] = class314.method1901((byte) 124, arg0);
                            }
                        } else {
                            this.field8735[var4] = class323.method1929(102, arg0);
                        }
                    } else {
                        this.field8735[var4] = class638.method3595(arg0, 50);
                    }
                } else {
                    this.field8735[var4] = class629.method3557(-91, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([[II)V")
    private final void method3455(int[][] arg0, int arg1) {
        if (arg1 == 10432) {
            ++field8744;
            int var3 = class89.field1330;
            int var4 = class236.field3492;
            class81.method622(arg0, -129);
            class655.method3700(0, class453.field6525, class156.field2572, 1, 0);
            if (this.field8735 != null) {
                for (int var5 = 0; ~var5 > ~this.field8735.length; ++var5) {
                    class17 var6 = this.field8735[var5];
                    int var7 = var6.field262;
                    int var8 = var6.field259;
                    if (var7 < 0) {
                        if (~var8 <= -1) {
                            var6.method64(var3, var4, true);
                        }
                    } else if (~var8 <= -1) {
                        var6.method65(var4, -1, var3);
                    } else {
                        var6.method66(-1, var3, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public static void method3456(byte arg0) {
        field8739 = null;
        field8743 = null;
        field8738 = null;
        field8737 = null;
        if (arg0 != -42) {
            method3456((byte) -125);
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
    public class608() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[[I")
    public final int[][] method298(int arg0, int arg1) {
        ++field8736;
        int[][] var3 = super.field9164.method1002(43, arg1);
        if (arg0 != -12424) {
            field8739 = null;
        }
        if (super.field9164.field2082) {
            int var4 = class89.field1330;
            int var5 = class236.field3492;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field9164.method1007(3870);
            this.method3455(var6, 10432);
            for (int var8 = 0; class236.field3492 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class89.field1330; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class248.method1593(var15, 255) << 4;
                    var12[var14] = class248.method1593(4080, var15 >> 4);
                    var11[var14] = class248.method1593(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
