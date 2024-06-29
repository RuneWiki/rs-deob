import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class91 extends class601 {

    @OriginalMember(owner = "client!in", name = "K", descriptor = "[I")
    public static int[] field1104 = new int[25];

    @OriginalMember(owner = "client!in", name = "G", descriptor = "Ldu;")
    public static class360 field1100 = new class360(16);

    @OriginalMember(owner = "client!in", name = "L", descriptor = "Lcga;")
    public static class485 field1105 = new class485();

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "[Ldf;")
    private class405[] field1102;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B[[I)V")
    private final void method688(byte arg0, int[][] arg1) {
        ++field1098;
        int var3 = class171.field2624;
        int var4 = class671.field9149;
        if (arg0 <= 97) {
            field1100 = null;
        }
        class284.method1755(4, arg1);
        class492.method2788(false, 0, 0, class445.field6116, class112.field1855);
        if (this.field1102 != null) {
            for (int var5 = 0; var5 < this.field1102.length; ++var5) {
                class405 var6 = this.field1102[var5];
                int var7 = var6.field5642;
                int var8 = var6.field5641;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method1405(87, var4, var3);
                    }
                } else if (var8 < 0) {
                    var6.method1404(var3, (byte) -72, var4);
                } else {
                    var6.method1403(var3, 2, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static void method689(byte arg0) {
        if (arg0 <= -110) {
            field1105 = null;
            field1104 = null;
            field1100 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field1102 = new class405[arg0.method3821((byte) -69)];
            for (int var4 = 0; this.field1102.length > var4; ++var4) {
                int var5 = arg0.method3821((byte) 107);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field1102[var4] = class352.method2107(-126, arg0);
                            }
                        } else {
                            this.field1102[var4] = class58.method388((byte) -100, arg0);
                        }
                    } else {
                        this.field1102[var4] = class331.method1997(arg0, -124);
                    }
                } else {
                    this.field1102[var4] = class232.method1471(126, arg0);
                }
            }
        } else if (arg2 == 1) {
            super.field7897 = arg0.method3821((byte) -81) == 1;
        }
        if (arg1 != -61) {
            method689((byte) -61);
        }
        ++field1096;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IZ)[[I")
    public final int[][] method7(int arg0, boolean arg1) {
        ++field1101;
        if (!arg1) {
            field1097 = 76;
        }
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int var4 = class171.field2624;
            int var5 = class671.field9149;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field7890.method3960(-23295);
            this.method688((byte) 114, var6);
            for (int var8 = 0; class671.field9149 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class171.field2624 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class48.method346(var15 << 4, 4080);
                    var12[var14] = class48.method346(4080, var15 >> 4);
                    var11[var14] = class48.method346(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[BB)[B")
    public static final byte[] method690(int arg0, byte[] arg1, byte arg2) {
        int var3 = -126 / ((-11 - arg2) / 39);
        ++field1103;
        byte[] var4 = new byte[arg0];
        class335.method2020(arg1, 0, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field1099;
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            this.method688((byte) 106, super.field7902.method383((byte) -105));
        }
        if (arg0 != -40) {
            field1104 = null;
        }
        return var3;
    }
}
