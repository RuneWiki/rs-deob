import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class241 extends class115 {

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "[Ldg;")
    public class206[] field4198;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field4191 = 0;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field4193 = 0;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "Z")
    public static boolean field4190 = false;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "[I")
    public static int[] field4194 = new int[128];

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1604(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 126 % ((51 - arg0) / 57);
        field4187++;
        int var9 = class23.method111(arg1, class161.field2718, class46.field817, 0);
        int var10 = class23.method111(arg5, class161.field2718, class46.field817, 0);
        int var11 = class23.method111(arg6, class125.field2234, class19.field331, 0);
        int var12 = class23.method111(arg3, class125.field2234, class19.field331, 0);
        int var13 = class23.method111(arg1 + arg7, class161.field2718, class46.field817, 0);
        int var14 = class23.method111(arg5 - arg7, class161.field2718, class46.field817, 0);
        for (int var15 = var9; var15 < var13; var15++) {
            class246.method1644(arg4, class59.field1094[var15], var12, var11, 1);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class246.method1644(arg4, class59.field1094[var16], var12, var11, 1);
        }
        int var17 = class23.method111(arg6 + arg7, class125.field2234, class19.field331, 0);
        int var18 = class23.method111(arg3 - arg7, class125.field2234, class19.field331, 0);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class59.field1094[var19];
            class246.method1644(arg4, var20, var17, var11, 1);
            class246.method1644(arg2, var20, var18, var17, 1);
            class246.method1644(arg4, var20, var12, var18, 1);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z")
    public final boolean method1605(int arg0, int arg1) {
        field4195++;
        if (arg1 <= 109) {
            field4194 = null;
        }
        return this.field4198[arg0].field3503;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(BI)I")
    public static final int method1606(byte arg0, int arg1) {
        field4188++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return arg0 == 114 ? var2 * var4 >> 12 : 71;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 31) {
            return;
        }
        field4192++;
        if (class125.field2234 <= arg5 && arg0 <= class19.field331 && arg4 >= class161.field2718 && class46.field817 >= arg1) {
            class162.method998(arg5, arg3, arg0, arg4, -3, arg1);
        } else {
            class21.method105(arg3, arg5, arg4, arg0, arg1, 7);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method1608(int arg0) {
        field4194 = null;
        if (arg0 != 10668) {
            method1609(24, 99, 94);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
    public static final void method1609(int arg0, int arg1, int arg2) {
        class198 var3 = class80.field1389[class64.field1171][arg0][arg1];
        field4196++;
        if (var3 == null) {
            class28.method144(class64.field1171, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class67 var5 = null;
        for (class67 var6 = (class67) var3.method1277(arg2 + 18); var6 != null; var6 = (class67) var3.method1271(250)) {
            class178 var13 = class133.method815(var6.field1205.field3472, (byte) -70);
            int var14 = var13.field3025;
            if (var13.field3049 == 1) {
                var14 = (var6.field1205.field3470 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class28.method144(class64.field1171, arg0, arg1);
            return;
        }
        class203 var7 = null;
        var3.method1275(-18157, var5);
        class67 var8 = (class67) var3.method1277(87);
        class203 var9 = null;
        while (var8 != null) {
            class203 var12 = var8.field1205;
            if (var5.field1205.field3472 != var12.field3472) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field3472 != var12.field3472 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class67) var3.method1271(250);
        }
        long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class109.method678(class64.field1171, arg0, arg1, class193.method1227(arg0 * 128 + arg2, true, class64.field1171, arg1 * 128 + 64), var5.field1205, var10, var7, var9);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ln;Ln;IZ)V")
    public class241(class138 arg0, class138 arg1, int arg2, boolean arg3) {
        class198 var5 = new class198();
        int var6 = arg0.method875(-2, arg2);
        this.field4198 = new class206[var6];
        int[] var7 = arg0.method881(arg2, -62);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method884(var7[var8], -117, arg2);
            class70 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class70 var12 = (class70) var5.method1277(85); var12 != null; var12 = (class70) var5.method1271(250)) {
                if (var12.field1238 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method865(var11, 0, (byte) 44);
                } else {
                    var13 = arg1.method865(0, var11, (byte) 44);
                }
                var10 = new class70(var11, var13);
                var5.method1272(5664, var10);
            }
            this.field4198[var7[var8]] = new class206(var9, var10);
        }
    }
}
