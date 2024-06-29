import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class167 extends class175 {

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    private int field2832 = 32768;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "[S")
    public static short[] field2833 = new short[256];

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Lij;")
    public static class50 field2828 = class78.method578(122, " <col=00ff80>");

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field2834 = 0;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Lkh;")
    public static class247 field2825 = new class247();

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class167() {
        super(3, false);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lda;Lda;B)V")
    public static final void method1149(class22 arg0, class22 arg1, byte arg2) {
        ++field2830;
        class224.field3770 = arg1;
        if (arg2 != -86) {
            field2828 = null;
        }
        class15.field339 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIII)V")
    public static final void method1150(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class155.method1090(class177.field2963[arg2], arg0 - arg4, arg3, 160, arg0 + arg4);
        ++field2831;
        int var5 = -112 % ((-32 - arg1) / 60);
        int var6 = 0;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = arg4;
        while (var6 < var9) {
            ++var6;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                --var9;
                int[] var10 = class177.field2963[arg2 + var9];
                var7 -= var9 << 1;
                int[] var11 = class177.field2963[-var9 + arg2];
                int var12 = arg0 + var6;
                int var13 = -var6 + arg0;
                class155.method1090(var10, var13, arg3, 160, var12);
                class155.method1090(var11, var13, arg3, 160, var12);
            }
            int var14 = arg0 + var9;
            int var15 = arg0 - var9;
            int[] var16 = class177.field2963[arg2 + var6];
            int[] var17 = class177.field2963[arg2 - var6];
            class155.method1090(var16, var15, arg3, 160, var14);
            class155.method1090(var17, var15, arg3, 160, var14);
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        class160.method1128((byte) -98);
        if (arg0 != 0) {
            method1150(-21, (byte) -105, 23, 119, -78);
        }
        ++field2827;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (!arg0) {
            field2833 = null;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field2925 = ~arg2.method1487(255) == -2;
            }
        } else {
            this.field2832 = arg2.method1441(-61) << 4;
        }
        ++field2826;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field2824;
        if (arg1 != -27746) {
            method1149((class22) null, (class22) null, (byte) -50);
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int[] var4 = this.method1210(1, arg0, arg1 ^ -11529);
            int[] var5 = this.method1210(2, arg0, 16745);
            for (int var6 = 0; class211.field3514 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field2832 >> 12;
                int var9 = class247.field4305[var7] * var8 >> 12;
                int var10 = class108.field1928 & (var9 >> 12) + arg0;
                int var11 = class241.field4151[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + var6 & class161.field2765;
                int[] var13 = this.method1210(0, var10, 16745);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
    public static void method1151(int arg0) {
        field2828 = null;
        field2833 = null;
        field2825 = null;
        if (arg0 != 18665) {
            field2828 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILda;ZLda;)V")
    public static final void method1152(int arg0, class22 arg1, boolean arg2, class22 arg3) {
        class194.field3214 = arg2;
        ++field2823;
        if (arg0 != 170691052) {
            method1152(79, (class22) null, false, (class22) null);
        }
        class59.field1058 = arg3;
        class127.field2221 = arg1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        int[][] var3 = super.field2920.method117(arg0, (byte) -41);
        if (super.field2920.field356) {
            int[] var4 = this.method1210(1, arg0, 16745);
            int[] var5 = this.method1210(2, arg0, 16745);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; ~var9 > ~class211.field3514; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field2832 >> 12;
                int var12 = class247.field4305[var10] * var11 >> 12;
                int var13 = class241.field4151[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + var9 & class161.field2765;
                int var15 = arg0 - -(var12 >> 12) & class108.field1928;
                int[][] var16 = this.method1206(0, var15, (byte) 24);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        ++field2829;
        if (arg1 != -20740) {
            this.method39(false, -119, (class217) null);
        }
        return var3;
    }
}
