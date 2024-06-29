import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class449 extends class194 {

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    private int field6271 = 32768;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field6274 = 1;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "[I")
    public static int[] field6282 = new int[5];

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "Lwo;")
    public static class285 field6281;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method2779(int arg0, int arg1) {
        ++field6272;
        if (arg1 != -4260) {
            method2782(94, (byte) -50, -97);
        }
        if (~arg0 > -100001) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            return ~arg0 > -10000001 ? "<col=ffffff>" + arg0 / 1000 + class390.field5324.method434(class67.field802, -8192) + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class376.field5091.method434(class67.field802, -8192) + "</col>";
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2780(int arg0, int arg1, int arg2, int arg3) {
        if (!class361.method2272(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class423.method2593(var4 + 1, class304.field4096[arg0].method1050(arg1, arg2) + arg3, var5 + 1) && class423.method2593(var4 + 128 - 1, class304.field4096[arg0].method1050(arg1 + 1, arg2) + arg3, var5 + 1) && class423.method2593(var4 + 128 - 1, class304.field4096[arg0].method1050(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class423.method2593(var4 + 1, class304.field4096[arg0].method1050(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field6279;
        int[][] var3 = super.field2283.method1667(arg1, -115);
        if (super.field2283.field3451) {
            int[] var4 = this.method1203(1, 67, arg1);
            int[] var5 = this.method1203(2, 63, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class138.field1579 > var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1044510) >> 12;
                int var11 = var5[var9] * this.field6271 >> 12;
                int var12 = class296.field3949[var10] * var11 >> 12;
                int var13 = class298.field3977[var10] * var11 >> 12;
                int var14 = class442.field6113 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg1 & class210.field2551;
                int[][] var16 = this.method1200(60, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 != -730) {
            this.field6271 = 43;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = -118 % ((arg1 - 52) / 61);
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2278 = arg2.method1563(-128) == 1;
            }
        } else {
            this.field6271 = arg2.method1587((byte) -102) << 4;
        }
        ++field6278;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
    public static void method2781(boolean arg0) {
        field6281 = null;
        field6282 = null;
        if (arg0) {
            field6274 = -96;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class449() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field6276;
        int var3 = -44 / ((57 - arg1) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(1, 126, arg0);
            int[] var6 = this.method1203(2, 81, arg0);
            for (int var7 = 0; ~class138.field1579 < ~var7; ++var7) {
                int var8 = var5[var7] >> 4 & 255;
                int var9 = var6[var7] * this.field6271 >> 12;
                int var10 = class296.field3949[var8] * var9 >> 12;
                int var11 = class298.field3977[var8] * var9 >> 12;
                int var12 = class442.field6113 & (var10 >> 12) + var7;
                int var13 = arg0 - -(var11 >> 12) & class210.field2551;
                int[] var14 = this.method1203(0, 57, var13);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2782(int arg0, byte arg1, int arg2) {
        ++field6280;
        if (~(2 & class222.field2770[1][arg0][arg2]) != -1) {
            return true;
        } else {
            if (arg1 != -7) {
                field6281 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public final void method280(int arg0) {
        class141.method911(-7448);
        int var2 = 12 / ((28 - arg0) / 63);
        ++field6283;
    }
}
