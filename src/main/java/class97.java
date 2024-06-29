import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class97 extends class601 {

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "Z")
    private boolean field1195 = true;

    @OriginalMember(owner = "client!ps", name = "R", descriptor = "Z")
    private boolean field1208 = true;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "[[S")
    private static short[][] field1196 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "[[S")
    private static short[][] field1203 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "[[S")
    private static short[][] field1206 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "[[[S")
    public static short[][][] field1199 = new short[][][] { field1206, field1196, field1203 };

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "[I")
    public static int[] field1197;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V", line = 101)
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)[I", line = 12)
    public final int[] method5(byte arg0, int arg1) {
        ++field1201;
        if (arg0 != -40) {
            method723((byte) -75);
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int[] var4 = this.method3266((byte) 64, this.field1195 ? -arg1 + class112.field1855 : arg1, 0);
            if (this.field1208) {
                for (int var5 = 0; ~class171.field2624 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class445.field6116];
                }
            } else {
                class335.method2016(var4, 0, var3, 0, class171.field2624);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lee;BI)V", line = 51)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field7897 = ~arg0.method3821((byte) -106) == -2;
                }
            } else {
                this.field1195 = ~arg0.method3821((byte) 92) == -2;
            }
        } else {
            this.field1208 = ~arg0.method3821((byte) 111) == -2;
        }
        if (arg1 != -61) {
            field1206 = null;
        }
        ++field1205;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V", line = 105)
    public static void method723(byte arg0) {
        field1197 = null;
        if (arg0 >= -93) {
            field1196 = null;
        }
        field1203 = null;
        field1196 = null;
        field1199 = null;
        field1206 = null;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(IZ)[[I", line = 119)
    public final int[][] method7(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field1200;
            int[][] var3 = super.field7890.method3963(1, arg0);
            if (super.field7890.field9769) {
                int[][] var4 = this.method3268(!this.field1195 ? arg0 : -arg0 + class112.field1855, 0, 65535);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field1208) {
                    for (int var11 = 0; var11 < class171.field2624; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; var12 < class171.field2624; ++var12) {
                        var8[var12] = var5[-var12 + class445.field6116];
                        var9[var12] = var6[-var12 + class445.field6116];
                        var10[var12] = var7[-var12 + class445.field6116];
                    }
                }
            }
            return var3;
        }
    }
}
