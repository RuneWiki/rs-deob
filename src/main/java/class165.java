import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class165 extends class213 {

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Lhb;")
    public static class72 field3186 = new class72(0, 0);

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "[B")
    public static byte[] field3197 = new byte[520];

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field3199 = 0;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field3202 = 127;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "Lob;")
    public static class141 field3203 = class175.method1195(40, "Null");

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Lob;")
    public static class141 field3205 = class175.method1195(40, "<br>(X");

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "Lob;")
    public static class141 field3206 = class175.method1195(40, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field3208 = 0;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Ltd;")
    public class193 field3185;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "Ltd;")
    public class193 field3192;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "Lfc;")
    public class54 field3189;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "Li;")
    public static class80 field3198;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lja;")
    public static class90 field3200;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "[I")
    public int[] field3180;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "[I")
    public static int[] field3190;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[BII[Lhi;)V")
    public static final void method1139(int arg0, byte[] arg1, int arg2, int arg3, class79[] arg4) {
        field3184++;
        class146 var5 = new class146(arg1);
        int var6 = -1;
        while (true) {
            int var7 = var5.method1005(-87);
            if (var7 == 0) {
                if (arg0 != -15497) {
                    field3186 = null;
                    return;
                }
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method1010(-2);
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method991(255);
                int var14 = var13 >> 2;
                int var15 = var11 + arg2;
                int var16 = var13 & 0x3;
                int var17 = arg3 + var10;
                if (var15 > 0 && var17 > 0 && var15 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((class164.field3177[1][var15][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class79 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    class7.method43(var16, var15, (byte) 70, var6, var12, class8.field128, var17, var12, var14, true, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
    public final void method1140(int arg0) {
        field3187++;
        int var2 = this.field3183;
        class54 var3 = this.field3189.method372((byte) -3);
        if (arg0 != 0) {
            method1141(9, 2, 0, 48, 116, 17, 54, 20, 82, -53, -36, -60, 19, -23, -76, -79, 107, 108, -58, 108);
        }
        if (var3 == null) {
            this.field3180 = null;
            this.field3191 = 0;
            this.field3183 = -1;
            this.field3195 = 0;
            this.field3188 = 0;
        } else {
            this.field3188 = var3.field1059;
            this.field3183 = var3.field1074;
            this.field3195 = var3.field1068;
            this.field3180 = var3.field1054;
            this.field3191 = var3.field1064 * 128;
        }
        if (this.field3183 != var2 && this.field3185 != null) {
            class201.field3798.method1327(this.field3185);
            this.field3185 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class76 var20 = new class76(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class131.field2506[var21][arg1][arg2] == null) {
                    class131.field2506[var21][arg1][arg2] = new class153(var21, arg1, arg2);
                }
            }
            class131.field2506[arg0][arg1][arg2].field2939 = var20;
        } else if (arg3 == 1) {
            class76 var22 = new class76(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class131.field2506[var23][arg1][arg2] == null) {
                    class131.field2506[var23][arg1][arg2] = new class153(var23, arg1, arg2);
                }
            }
            class131.field2506[arg0][arg1][arg2].field2939 = var22;
        } else {
            class101 var24 = new class101(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class131.field2506[var25][arg1][arg2] == null) {
                    class131.field2506[var25][arg1][arg2] = new class153(var25, arg1, arg2);
                }
            }
            class131.field2506[arg0][arg1][arg2].field2932 = var24;
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    public static void method1142(int arg0) {
        field3206 = null;
        field3190 = null;
        field3198 = null;
        field3205 = null;
        field3200 = null;
        field3197 = null;
        if (arg0 < -99) {
            field3186 = null;
            field3203 = null;
        }
    }
}
