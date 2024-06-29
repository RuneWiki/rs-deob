import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class183 extends class259 {

    @OriginalMember(owner = "client!of", name = "P", descriptor = "[I")
    private int[] field2657;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "[I")
    private int[] field2663;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "Lje;")
    private class34 field2659;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "Lje;")
    private class34 field2662;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "Lje;")
    private class34 field2664;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "[Lje;")
    private class34[] field2658;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lpk;ILpk;)V")
    public static final void method1197(class237 arg0, int arg1, class237 arg2) {
        field2665++;
        class150.field2179 = arg2;
        if (arg1 == 21057) {
            class27.field522 = arg0;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lpk;BIZLb;ID)Lwh;")
    public final class289 method1198(class237 arg0, byte arg1, int arg2, boolean arg3, class80 arg4, int arg5, double arg6) {
        class90.method684(arg6, 255);
        class64.field1072 = arg0;
        class59.field974 = arg4;
        class7.method63(arg2, 32, arg5);
        field2661++;
        if (arg1 > -100) {
            this.field2664 = null;
        }
        class289 var9 = new class289(arg2, arg5);
        for (int var10 = 0; var10 < this.field2658.length; var10++) {
            this.field2658[var10].method229(arg5, false, arg2);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg3) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2662.field604) {
                int[] var14 = this.field2662.method43(119, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2662.method52((byte) -3, var12);
                var16 = var18[2];
                var15 = var18[0];
                var17 = var18[1];
            }
            for (int var19 = 0; var19 != arg2; var19++) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var17[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class61.field1002[var20];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class61.field1002[var21];
                int var24 = var16[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class61.field1002[var24];
                var9.field4397[var11++] = (var22 << 16) + (var23 << 8) + var25;
                if (arg3) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2658.length; var13++) {
            this.field2658[var13].method217(0);
        }
        return var9;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lb;BDIIZLpk;)Ldi;")
    public final class187 method1199(class80 arg0, byte arg1, double arg2, int arg3, int arg4, boolean arg5, class237 arg6) {
        field2660++;
        if (arg1 <= 60) {
            this.field2657 = null;
        }
        class90.method684(arg2, 255);
        class59.field974 = arg0;
        class64.field1072 = arg6;
        class7.method63(arg4, 32, arg3);
        class187 var9 = new class187(arg4, arg3);
        for (int var10 = 0; var10 < this.field2658.length; var10++) {
            this.field2658[var10].method229(arg3, false, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg5) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2662.field604) {
                int[] var14 = this.field2662.method43(86, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2662.method52((byte) 95, var12);
                var17 = var18[0];
                var16 = var18[2];
                var15 = var18[1];
            }
            int[] var19;
            if (this.field2664.field604) {
                var19 = this.field2664.method43(115, var12);
            } else {
                var19 = this.field2664.method52((byte) 58, var12)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                int var23 = class61.field1002[var21];
                int var24 = var16[var20] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class61.field1002[var22];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class61.field1002[var24];
                int var27;
                if (var23 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field4397[var11++] = (var23 << 16) + (var27 << 24) + (var25 << 8) + var26;
                if (arg5) {
                    var11 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2658.length; var13++) {
            this.field2658[var13].method217(0);
        }
        return var9;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lb;ZZIIIDLpk;)[I")
    public final int[] method1200(class80 arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, double arg6, class237 arg7) {
        class90.method684(arg6, 255);
        field2655++;
        class59.field974 = arg0;
        class64.field1072 = arg7;
        int[] var10 = new int[arg3 * arg5];
        class7.method63(arg5, 32, arg3);
        for (int var11 = 0; var11 < this.field2658.length; var11++) {
            this.field2658[var11].method229(arg3, false, arg5);
        }
        int var12;
        int var13;
        byte var14;
        if (arg1) {
            var12 = arg5 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var14 = 1;
            var13 = arg5;
        }
        if (arg4 != -1839) {
            this.field2662 = null;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2662.field604) {
                int[] var18 = this.field2662.method43(arg4 ^ 0xFFFFF8B6, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field2662.method52((byte) -128, var16);
                var20 = var22[2];
                var19 = var22[1];
                var21 = var22[0];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var20[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class61.field1002[var24];
                int var27 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class61.field1002[var25];
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class61.field1002[var27];
                var10[var15++] = (var26 << 16) + (var29 << 8) + var28;
                if (arg2) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2658.length; var17++) {
            this.field2658[var17].method217(arg4 + 1839);
        }
        return var10;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILkc;Z)V")
    public static final void method1201(int arg0, class25 arg1, boolean arg2) {
        field2656++;
        if (class120.field1794 < arg1.field495) {
            class29.method206(38, arg1);
        } else if (class120.field1794 <= arg1.field442) {
            class36.method281(arg1, 88);
        } else {
            class85.method651(-1, arg1);
        }
        if (arg1.field425 < 128 || arg1.field455 < 128 || arg1.field425 >= 13184 || arg1.field455 >= 13184) {
            arg1.field495 = 0;
            arg1.field483 = -1;
            arg1.field491 = -1;
            arg1.field442 = 0;
            arg1.field425 = arg1.field449[0] * 128 + arg1.method168(-98) * 64;
            arg1.field455 = arg1.field493[0] * 128 + arg1.method168(-111) * 64;
            arg1.method171(15);
        }
        if (class185.field2687 == arg1 && (arg1.field425 < 1536 || arg1.field455 < 1536 || arg1.field425 >= 11776 || arg1.field455 >= 11776)) {
            arg1.field495 = 0;
            arg1.field442 = 0;
            arg1.field483 = -1;
            arg1.field491 = -1;
            arg1.field425 = arg1.field449[0] * 128 + (arg1.method168(-81) * 64);
            arg1.field455 = arg1.field493[0] * 128 + arg1.method168(-109) * 64;
            arg1.method171(15);
        }
        class209.method1377(arg1, -126);
        class210.method1379(arg2, arg1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILpk;)I")
    public static final int method1202(int arg0, class237 arg1) {
        field2654++;
        int var2 = 0;
        if (arg1.method1629(class45.field780, 0)) {
            var2++;
        }
        if (arg1.method1629(class122.field1812, 0)) {
            var2++;
        }
        if (arg1.method1629(class155.field2261, 0)) {
            var2++;
        }
        if (arg1.method1629(class42.field739, 0)) {
            var2++;
        }
        if (arg1.method1629(class215.field3305, 0)) {
            var2++;
        }
        if (arg1.method1629(class51.field833, 0)) {
            var2++;
        }
        if (arg1.method1629(class3.field46, 0)) {
            var2++;
        }
        if (arg1.method1629(class245.field3798, 0)) {
            var2++;
        }
        if (arg1.method1629(class105.field1549, 0)) {
            var2++;
        }
        if (arg1.method1629(class206.field3092, 0)) {
            var2++;
        }
        if (arg1.method1629(class55.field929, 0)) {
            var2++;
        }
        if (arg1.method1629(class224.field3511, 0)) {
            var2++;
        }
        if (arg1.method1629(class12.field177, 0)) {
            var2++;
        }
        if (arg1.method1629(class260.field3984, 0)) {
            var2++;
        }
        if (arg1.method1629(class134.field1964, 0)) {
            var2++;
        }
        return arg0 >= -117 ? -57 : var2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLb;Lpk;)Z")
    public final boolean method1203(byte arg0, class80 arg1, class237 arg2) {
        field2653++;
        if (arg0 != 89) {
            this.field2664 = null;
        }
        if (class178.field2606 > 0) {
            for (int var4 = 0; var4 < this.field2657.length; var4++) {
                if (!arg2.method1609(false, class178.field2606, this.field2657[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2657.length; var5++) {
                if (!arg2.method1629(this.field2657[var5], 0)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2663.length; var6++) {
            if (!arg1.method488(0, this.field2663[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class183() {
        this.field2657 = new int[0];
        this.field2663 = new int[0];
        this.field2659 = new class42(0);
        this.field2659.field614 = 1;
        this.field2662 = new class42();
        this.field2662.field614 = 1;
        this.field2664 = new class42();
        this.field2664.field614 = 1;
        this.field2658 = new class34[] { this.field2662, this.field2664, this.field2659 };
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lca;)V")
    public class183(class54 arg0) {
        int var2 = 0;
        int var3 = arg0.method407(255);
        this.field2658 = new class34[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class34 var16 = class151.method1027((byte) -127, arg0);
            if (var16.method220(false) >= 0) {
                var2++;
            }
            if (var16.method233(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field612.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method407(255);
            }
            this.field2658[var6] = var16;
        }
        this.field2657 = new int[var2];
        this.field2663 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class34 var11 = this.field2658[var9];
            int var12 = var11.field612.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field612[var13] = this.field2658[var5[var9][var13]];
            }
            int var14 = var11.method220(false);
            int var15 = var11.method233(-1);
            if (var14 > 0) {
                this.field2657[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2663[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field2662 = this.field2658[arg0.method407(255)];
        this.field2664 = this.field2658[arg0.method407(255)];
        this.field2659 = this.field2658[arg0.method407(255)];
    }
}
