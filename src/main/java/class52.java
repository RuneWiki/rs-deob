import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class52 extends class286 {

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    private int field703 = 1;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    private int field706 = 1;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    public static int field709 = 5063219;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "Z")
    public static boolean field707 = false;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lfe;ZI)V", line = 16)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field703 = arg0.method1535((byte) 108);
        } else if (arg2 == 1) {
            this.field706 = arg0.method1535((byte) 112);
        } else if (arg2 == 2) {
            this.field4876 = arg0.method1535((byte) 124) == 1;
        }
        if (arg1) {
            this.field703 = -115;
        }
        field705++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)[[I", line = 56)
    public final int[][] method16(int arg0, byte arg1) {
        if (arg1 != -19) {
            return (int[][]) ((int[][]) null);
        }
        field708++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int var4 = this.field706 + this.field706 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field703 + this.field703 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg0 - this.field706; var9 <= this.field706 + arg0; var9++) {
                int[][] var10 = this.method1964(var9 & class126.field2100, 0, false);
                int[][] var11 = new int[3][class27.field410];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field703; var18 <= this.field703; var18++) {
                    int var19 = class284.field4857 & var18;
                    var14 += var17[var19];
                    var12 += var16[var19];
                    var13 += var15[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class27.field410 > var23) {
                    var20[var23] = var8 * var13 >> 16;
                    var21[var23] = var8 * var12 >> 16;
                    var22[var23] = var8 * var14 >> 16;
                    int var24 = class284.field4857 & var23 - this.field703;
                    int var25 = var12 - var16[var24];
                    var23++;
                    int var26 = var14 - var17[var24];
                    int var27 = var13 - var15[var24];
                    int var28 = class284.field4857 & var23 + this.field703;
                    var13 = var15[var28] + var27;
                    var14 = var17[var28] + var26;
                    var12 = var16[var28] + var25;
                }
                var6[this.field706 + var9 - arg0] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[2];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class27.field410; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var6[var36];
                    var33 += var37[0][var32];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var31[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 189)
    public class52() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I", line = 197)
    public final int[] method14(int arg0, int arg1) {
        field704++;
        if (arg0 > -52) {
            field709 = 85;
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int var4 = this.field706 + this.field706 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field703 + this.field703 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field706; var9 <= this.field706 + arg1; var9++) {
                int[] var10 = this.method1963(class126.field2100 & var9, 0, -1);
                int var11 = 0;
                for (int var12 = -this.field703; var12 <= this.field703; var12++) {
                    var11 += var10[var12 & class284.field4857];
                }
                int[] var13 = new int[class27.field410];
                int var14 = 0;
                while (class27.field410 > var14) {
                    var13[var14] = var8 * var11 >> 16;
                    int var15 = var11 - var10[var14 - this.field703 & class284.field4857];
                    var14++;
                    var11 = var10[var14 + this.field703 & class284.field4857] + var15;
                }
                var7[this.field706 + var9 - arg1] = var13;
            }
            for (int var16 = 0; var16 < class27.field410; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 296)
    public static final byte[] method334(boolean arg0, int arg1, Object arg2) {
        field702++;
        if (arg2 == null) {
            return null;
        } else if ((arg2 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg2);
            return arg0 ? class67.method426(var4, true) : var4;
        } else if ((arg2 instanceof class175)) {
            class175 var3 = (class175) arg2;
            return var3.method1157((byte) 108);
        } else if (arg1 == 2799) {
            throw new IllegalArgumentException();
        } else {
            return (byte[]) null;
        }
    }
}
