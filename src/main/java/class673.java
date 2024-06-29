import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class673 extends class330 {

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field9443 = -1;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field9448 = 0;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field9451 = 1405;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field9452 = 0;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "[Lcs;")
    private class632[] field9447;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)[I", line = 3)
    public final int[] method464(int arg0, boolean arg1) {
        ++field9450;
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field4630.method2475(arg0, 30011);
            if (super.field4630.field5704) {
                this.method3838((byte) 99, super.field4630.method2481(-86));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[[I", line = 27)
    public final int[][] method537(int arg0, int arg1) {
        ++field9449;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (arg0 != 0) {
            field9451 = 1;
        }
        if (super.field4621.field3510) {
            int var4 = class80.field901;
            int var5 = class291.field4285;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4621.method1598(true);
            this.method3838((byte) 113, var6);
            for (int var8 = 0; ~class291.field4285 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class80.field901; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class407.method2490(4080, var15 << 4);
                    var12[var14] = class407.method2490(var15, 65280) >> 4;
                    var11[var14] = class407.method2490(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lsja;Lsja;I)V", line = 93)
    public static final void method3836(class69 arg0, class69 arg1, int arg2) {
        int var3 = 23 % ((arg2 - -18) / 43);
        ++field9453;
        if (arg1.field760 != null) {
            arg1.method527(-11229);
        }
        arg1.field760 = arg0.field760;
        arg1.field767 = arg0;
        arg1.field760.field767 = arg1;
        arg1.field767.field760 = arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLjava/lang/String;)V", line = 111)
    public static final void method3837(byte arg0, String arg1) {
        ++field9444;
        System.out.println("Error: " + class615.method3548((byte) 22, arg1, "%0a", "\n"));
        if (arg0 > -44) {
            field9448 = -43;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 126)
    public class673() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B[[I)V", line = 130)
    private final void method3838(byte arg0, int[][] arg1) {
        ++field9445;
        int var3 = class80.field901;
        int var4 = class291.field4285;
        class453.method2732(arg1, (byte) 76);
        class133.method898(class639.field8988, 0, -128, class385.field5505, 0);
        if (arg0 <= 86) {
            field9451 = 46;
        }
        if (this.field9447 != null) {
            for (int var5 = 0; ~var5 > ~this.field9447.length; ++var5) {
                class632 var6 = this.field9447[var5];
                int var7 = var6.field8835;
                int var8 = var6.field8836;
                if (var7 < 0) {
                    if (~var8 <= -1) {
                        var6.method1994(var3, (byte) 116, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method1992((byte) 103, var4, var3);
                } else {
                    var6.method1993(var3, var4, (byte) -111);
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lgga;IB)V", line = 194)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = -55 % ((-41 - arg2) / 42);
        ++field9446;
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4636 = arg0.method3013(-125) == 1;
                return;
            }
        } else {
            this.field9447 = new class632[arg0.method3013(-98)];
            for (int var5 = 0; var5 < this.field9447.length; ++var5) {
                int var6 = arg0.method3013(65);
                if (var6 != 0) {
                    if (~var6 != -2) {
                        if (~var6 != -3) {
                            if (~var6 == -4) {
                                this.field9447[var5] = class230.method1530(arg0, 1);
                            }
                        } else {
                            this.field9447[var5] = class453.method2729(arg0, true);
                        }
                    } else {
                        this.field9447[var5] = class107.method764(-99, arg0);
                    }
                } else {
                    this.field9447[var5] = class244.method1632(arg0, 65);
                }
            }
        }
    }
}
