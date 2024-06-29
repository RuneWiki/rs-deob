import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class443 extends class529 {

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    private int field6210 = -1;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "[[S")
    private static short[][] field6205 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field6200 = 0;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "[[S")
    private static short[][] field6203 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "[[S")
    private static short[][] field6204 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "[[[S")
    public static short[][][] field6199 = new short[][][] { field6205, field6204, field6203 };

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    private int field6211;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    private int field6214;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "[I")
    private int[] field6206;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V", line = 9)
    public static void method2605(int arg0) {
        field6203 = null;
        field6199 = null;
        field6204 = null;
        if (arg0 > 94) {
            field6205 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 22)
    public final int method2606(int arg0) {
        ++field6215;
        return arg0 != 29543 ? -87 : this.field6210;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V", line = 33)
    public final void method2607(int arg0, int arg1, int arg2) {
        ++field6207;
        super.method2607(arg0, arg1, arg2);
        if (~this.field6210 <= -1 && class224.field2961 != null) {
            int var4 = !class224.field2961.method389(9559, this.field6210).field1159 ? 128 : 64;
            this.field6206 = class224.field2961.method395(false, 1.0F, var4, this.field6210, -11288, var4);
            this.field6211 = var4;
            this.field6214 = var4;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V", line = 51)
    public final void method2608(byte arg0) {
        super.method2608((byte) -53);
        if (arg0 >= -20) {
            this.method2607(71, -37, -104);
        }
        ++field6208;
        this.field6206 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBLtn;)V", line = 67)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field6201;
        if (arg1 <= 45) {
            this.field6210 = -46;
        }
        if (arg0 == 0) {
            this.field6210 = arg2.method1107(false);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIZIII)V", line = 85)
    public static final void method2609(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class700.field9879 = arg4;
        ++field6212;
        class236.field3044 = arg2;
        class273.field3456 = arg5;
        class666.field9118 = arg0;
        class543.field7643 = arg1;
        class376.field5267 = arg6;
        if (!arg3) {
            field6205 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)V", line = 102)
    public static final void method2610(byte arg0) {
        if (arg0 > -22) {
            field6202 = -39;
        }
        ++field6209;
        class533.field7487.method776((byte) 94);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 127)
    public class443() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[[I", line = 133)
    public final int[][] method592(int arg0, int arg1) {
        ++field6198;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (arg1 != 2) {
            this.method2607(-71, -91, 18);
        }
        if (super.field7450.field5165) {
            int var4 = (~class424.field6042 != ~this.field6211 ? this.field6211 * arg0 / class424.field6042 : arg0) * this.field6214;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class304.field3909 != this.field6214) {
                for (int var8 = 0; var8 < class304.field3909; ++var8) {
                    int var9 = this.field6214 * var8 / class304.field3909;
                    int var10 = this.field6206[var4 - -var9];
                    var7[var8] = class272.method1629(var10 << 4, 4080);
                    var6[var8] = class272.method1629(var10 >> 4, 4080);
                    var5[var8] = class272.method1629(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class304.field3909; ++var11) {
                    int var12 = this.field6206[var4++];
                    var7[var11] = class272.method1629(4080, var12 << 4);
                    var6[var11] = class272.method1629(var12, 65280) >> 4;
                    var5[var11] = class272.method1629(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(III)Z", line = 197)
    public static final boolean method2611(int arg0, int arg1, int arg2) {
        ++field6213;
        if (arg0 != -6177) {
            return true;
        } else {
            return class441.method2599(arg1, arg2, (byte) 98) | (arg2 & 458752) != 0 || class506.method2928(arg2, arg1, 16);
        }
    }
}
