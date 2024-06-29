import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class427 extends class175 {

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    private int field6212 = 3216;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "[I")
    private int[] field6206 = new int[3];

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    private int field6213 = 4096;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    private int field6215 = 3216;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "[[I")
    public static int[][] field6209 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.method2577(-68);
        if (arg0 != -8) {
            this.method47(true, 116);
        }
        ++field6214;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field6205;
        if (arg2) {
            method2576(true);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field6212 = arg1.method1728((byte) 11);
                }
            } else {
                this.field6215 = arg1.method1728((byte) 111);
            }
        } else {
            this.field6213 = arg1.method1728((byte) 72);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field6208;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            return null;
        } else {
            if (super.field2310.field169) {
                int var4 = class328.field4668 * this.field6213 >> 12;
                int[] var5 = this.method1202(arg1 + -1 & class698.field9254, -1150480797, 0);
                int[] var6 = this.method1202(arg1, -1150480797, 0);
                int[] var7 = this.method1202(arg1 - -1 & class698.field9254, -1150480797, 0);
                for (int var8 = 0; class598.field8136 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class412.field5896] + -var6[class412.field5896 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = class559.field7667[((var12 + 1) * var12 >> 1) + var11] & 255;
                    int var14 = var10 * var13 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field6206[2] * var16 >> 12;
                    int var18 = this.field6206[0] * var14 >> 12;
                    int var19 = this.field6206[1] * var15 >> 12;
                    var3[var8] = var18 - -var19 + var17;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6210;
        if (~arg1 == ~arg4) {
            class625.method3458(arg7, (byte) 109, arg5, arg4, arg2, arg0, arg6);
        } else {
            if (arg3 > -26) {
                field6209 = null;
            }
            if (~class297.field4199 >= ~(arg5 - arg4) && ~class45.field472 <= ~(arg5 - -arg4) && ~class291.field4156 >= ~(-arg1 + arg7) && arg1 + arg7 <= class233.field3099) {
                class701.method3826(arg0, arg2, arg6, arg1, arg7, (byte) -71, arg5, arg4);
            } else {
                class131.method930(arg4, 11483, arg1, arg0, arg6, arg2, arg5, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
    public static void method2576(boolean arg0) {
        if (!arg0) {
            field6209 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    private final void method2577(int arg0) {
        ++field6207;
        double var2 = Math.cos((double) ((float) this.field6212 / 4096.0F));
        this.field6206[0] = (int) (var2 * Math.sin((double) ((float) this.field6215 / 4096.0F)) * 4096.0D);
        this.field6206[1] = (int) (4096.0D * Math.cos((double) ((float) this.field6215 / 4096.0F)) * var2);
        this.field6206[2] = (int) (4096.0D * Math.sin((double) ((float) this.field6212 / 4096.0F)));
        int var4 = this.field6206[0] * this.field6206[0] >> 12;
        int var5 = this.field6206[1] * this.field6206[1] >> 12;
        int var6 = this.field6206[2] * this.field6206[2] >> 12;
        if (arg0 <= -15) {
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 - -var6 >> 12)));
            if (~var7 != -1) {
                this.field6206[1] = (this.field6206[1] << 12) / var7;
                this.field6206[2] = (this.field6206[2] << 12) / var7;
                this.field6206[0] = (this.field6206[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class427() {
        super(1, true);
    }
}
