import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class79 extends class261 {

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    private int field1288 = 4096;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    private int field1286 = 0;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field1284 = -1;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field1279 = 0;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field1287 = 0;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "Z")
    public static boolean field1289 = false;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field1291 = 3;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrg;B)I", line = 10)
    public static final int method546(class88 arg0, byte arg1) {
        int var2 = 0;
        field1278++;
        if (arg0.method634(-19044, class256.field4372)) {
            var2++;
        }
        if (arg1 >= -82) {
            method548(true);
        }
        if (arg0.method634(-19044, class308.field5249)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ltl;IIIIILud;)V", line = 34)
    public static final void method547(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class269 arg6) {
        field1281++;
        if (arg6 == null) {
            return;
        }
        int var7 = class76.field1253 + class206.field3541 & 0x7FF;
        int var8 = arg1 * arg1 + arg2 * arg2;
        int var9 = Math.max(arg0.field3294 / 2, arg0.field3253 / 2) + 10;
        if (var8 > var9 * var9) {
            return;
        }
        int var10 = class283.field4877[var7];
        if (arg4 != -1) {
            return;
        }
        int var11 = var10 * 256 / (class304.field5198 + 256);
        int var12 = class283.field4870[var7];
        int var13 = var12 * 256 / (class304.field5198 + 256);
        int var14 = arg1 * var13 + arg2 * var11 >> 16;
        int var15 = arg2 * var13 - (arg1 * var11) >> 16;
        if (class281.field4827) {
            ((class98) arg6).method772(arg5 + (arg0.field3294 / 2) + var14 - (arg6.field4634 / 2), arg0.field3253 / 2 + -var15 + -(arg6.field4622 / 2) + arg3, (class98) arg0.method1409((byte) -117, false));
        } else {
            ((class83) arg6).method584(arg5 + var14 - ((arg6.field4634 / 2) - (arg0.field3294 / 2)), arg0.field3253 / 2 + arg3 + -var15 - arg6.field4622 / 2, arg0.field3297, arg0.field3263);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)I", line = 80)
    public static final int method548(boolean arg0) {
        field1290++;
        if (arg0) {
            method546((class88) null, (byte) -41);
        }
        return class265.field4491;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIZ)V", line = 96)
    public static final void method549(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1280++;
        class152 var5 = (class152) class95.field1622.method1471((byte) 12);
        if (!arg4) {
            return;
        }
        while (var5 != null) {
            class203.method1473(arg1, arg0, arg3, arg2, (byte) 126, var5);
            var5 = (class152) class95.field1622.method1475((byte) 83);
        }
        for (class152 var6 = (class152) class166.field2792.method1471((byte) 63); var6 != null; var6 = (class152) class166.field2792.method1475((byte) 83)) {
            byte var7 = 1;
            if (var6.field2576.field5114 == var6.field2576.field5113) {
                var7 = 0;
            } else if (var6.field2576.field5145 == var6.field2576.field5114) {
                var7 = 2;
            }
            if (var6.field2589 != var7) {
                int var8 = class196.method1407(var6.field2576, (byte) 115);
                if (var6.field2569 != var8) {
                    if (var6.field2567 != null) {
                        class230.field3813.method1481(var6.field2567);
                        var6.field2567 = null;
                    }
                    var6.field2569 = var8;
                }
                var6.field2589 = var7;
            }
            var6.field2579 = var6.field2576.field5130;
            var6.field2565 = var6.field2576.field5130 + (var6.field2576.method1680(-102) * 64);
            var6.field2577 = var6.field2576.field5173;
            var6.field2566 = var6.field2576.field5173 + (var6.field2576.method1680(-117) * 64);
            class203.method1473(arg1, arg0, arg3, arg2, (byte) -30, var6);
        }
        for (class152 var9 = (class152) class187.field3022.method288((byte) -42); var9 != null; var9 = (class152) class187.field3022.method289(62)) {
            byte var10 = 1;
            if (var9.field2572.field5114 == var9.field2572.field5113) {
                var10 = 0;
            } else if (var9.field2572.field5145 == var9.field2572.field5114) {
                var10 = 2;
            }
            if (var9.field2589 != var10) {
                int var11 = class314.method2164(var9.field2572, arg4);
                if (var9.field2569 != var11) {
                    if (var9.field2567 != null) {
                        class230.field3813.method1481(var9.field2567);
                        var9.field2567 = null;
                    }
                    var9.field2569 = var11;
                }
                var9.field2589 = var10;
            }
            var9.field2579 = var9.field2572.field5130;
            var9.field2565 = var9.field2572.field5130 + var9.field2572.method1680(-103) * 64;
            var9.field2577 = var9.field2572.field5173;
            var9.field2566 = var9.field2572.field5173 + var9.field2572.method1680(-117) * 64;
            class203.method1473(arg1, arg0, arg3, arg2, (byte) -52, var9);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lpb;BI)V", line = 215)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field1286 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field1288 = arg0.method423(255);
        }
        if (arg1 > -115) {
            method549(81, -47, -39, -61, false);
        }
        field1285++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)[I", line = 249)
    public final int[] method21(byte arg0, int arg1) {
        field1282++;
        int[] var3 = this.field4425.method906(arg1, 8251);
        int var4 = 44 % ((-arg0 - 49) / 33);
        if (this.field4425.field2043) {
            int[] var5 = this.method1822(0, 105, arg1);
            for (int var6 = 0; var6 < class92.field1576; var6++) {
                int var7 = var5[var6];
                var3[var6] = var7 >= this.field1286 && var7 <= this.field1288 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 287)
    public class79() {
        super(1, true);
    }
}
