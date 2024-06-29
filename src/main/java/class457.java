import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class457 extends class386 {

    @OriginalMember(owner = "client!mw", name = "J", descriptor = "Z")
    private boolean field6452 = true;

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "Z")
    private boolean field6445 = true;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "[I")
    public static int[] field6446 = new int[3];

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!mw", name = "G", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!mw", name = "H", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!mw", name = "K", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V", line = 3)
    public class457() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "(I)V", line = 7)
    public static void method2713(int arg0) {
        if (arg0 == 0) {
            field6446 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZLun;Ljava/lang/String;)I", line = 21)
    public static final int method2714(boolean arg0, class389 arg1, String arg2) {
        ++field6448;
        int var3 = arg1.field5195;
        if (!arg0) {
            field6446 = null;
        }
        byte[] var4 = class451.method2673(arg2, (byte) -60);
        arg1.method2264(var4.length, (byte) 125);
        arg1.field5195 += class263.field3622.method2731((byte) -60, 0, var4, var4.length, arg1.field5205, arg1.field5195);
        return -var3 + arg1.field5195;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)[I", line = 53)
    public final int[] method359(int arg0, int arg1) {
        ++field6447;
        int var3 = 104 % ((13 - arg1) / 40);
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int[] var5 = this.method2212((byte) 93, this.field6445 ? -arg0 + class206.field2474 : arg0, 0);
            if (!this.field6452) {
                class252.method1544(var5, 0, var4, 0, class599.field8643);
            } else {
                for (int var6 = 0; ~class599.field8643 < ~var6; ++var6) {
                    var4[var6] = var5[-var6 + class276.field3782];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(II)[[I", line = 90)
    public final int[][] method645(int arg0, int arg1) {
        ++field6453;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (arg1 != 3) {
            method2715((byte) 124, (String) null, true, (class668) null);
        }
        if (super.field5148.field2041) {
            int[][] var4 = this.method2211(!this.field6445 ? arg0 : -arg0 + class206.field2474, 0, -103);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field6452) {
                for (int var11 = 0; ~var11 > ~class599.field8643; ++var11) {
                    var8[var11] = var5[-var11 + class276.field3782];
                    var9[var11] = var6[-var11 + class276.field3782];
                    var10[var11] = var7[-var11 + class276.field3782];
                }
            } else {
                for (int var12 = 0; ~class599.field8643 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLjava/lang/String;ZLjn;)Ldba;", line = 156)
    public static final class79 method2715(byte arg0, String arg1, boolean arg2, class668 arg3) {
        ++field6451;
        if (arg0 != 101) {
            method2714(true, (class389) null, (String) null);
        }
        int var4 = arg3.method3804((byte) 115, arg1);
        if (~var4 == 0) {
            return new class79(0);
        } else {
            int[] var5 = arg3.method3808(100, var4);
            class79 var6 = new class79(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var6.field1154 > var7) {
                    class389 var9 = new class389(arg3.method3800(var5[var8++], var4, (byte) -92));
                    int var10 = var9.method2255(255);
                    int var11 = var9.method2260(-112);
                    int var12 = var9.method2229(arg0 + 154);
                    if (!arg2 && var12 == 1) {
                        --var6.field1154;
                    } else {
                        var6.field1156[var7] = var10;
                        var6.field1157[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBLun;)V", line = 202)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field6449;
        if (arg1 > 111) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field5145 = arg2.method2229(255) == 1;
                    }
                } else {
                    this.field6445 = arg2.method2229(255) == 1;
                }
            } else {
                this.field6452 = arg2.method2229(255) == 1;
            }
        }
    }
}
