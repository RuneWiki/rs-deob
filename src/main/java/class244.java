import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class244 {

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public int field4256 = -1;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lvf;")
    public static class265 field4262 = class87.method582(-46, "Veuillez commencer par supprimer ");

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lvf;")
    public static class265 field4260 = class87.method582(-46, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field4252;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)V")
    public static final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4257++;
        if (arg2 < 103) {
            method1621(107, 31, -24, 18, 123, -107);
        }
        if (arg5 > class205.field3681 || class81.field1521 > arg0) {
            return;
        }
        boolean var6;
        if (class107.field1890 > arg4) {
            var6 = false;
            arg4 = class107.field1890;
        } else if (class79.field1510 < arg4) {
            arg4 = class79.field1510;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class107.field1890 > arg1) {
            var7 = false;
            arg1 = class107.field1890;
        } else if (class79.field1510 < arg1) {
            var7 = false;
            arg1 = class79.field1510;
        } else {
            var7 = true;
        }
        if (arg5 < class81.field1521) {
            arg5 = class81.field1521;
        } else {
            class203.method1394(class44.field973[arg5++], arg1, arg4, -7249, arg3);
        }
        if (class205.field3681 < arg0) {
            arg0 = class205.field3681;
        } else {
            class203.method1394(class44.field973[arg0--], arg1, arg4, -7249, arg3);
        }
        if (var7 && var6) {
            for (int var8 = arg5; var8 <= arg0; var8++) {
                int[] var9 = class44.field973[var8];
                var9[arg1] = var9[arg4] = arg3;
            }
            return;
        }
        if (var7) {
            for (int var10 = arg5; var10 <= arg0; var10++) {
                class44.field973[var10][arg1] = arg3;
            }
            return;
        }
        if (var6) {
            for (int var11 = arg5; var11 <= arg0; var11++) {
                class44.field973[var11][arg4] = arg3;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method1622(int arg0) {
        field4260 = null;
        if (arg0 != -1) {
            field4260 = null;
        }
        field4262 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBIIII)V")
    public static final void method1623(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = arg3;
        field4263++;
        int var8 = arg5 * arg5;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = arg3 << 1;
        int var12 = (1 - var11) * var8 + var10;
        int var13 = var8 << 2;
        int var14 = var8 << 1;
        if (arg1 < 45) {
            field4260 = null;
        }
        int var15 = var9 - ((var11 - 1) * var14);
        int var16 = var9 << 2;
        int var17 = ((arg3 << 1) - 3) * var14;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = (var6 + 1) * var16;
        if (arg0 >= class81.field1521 && arg0 <= class205.field3681) {
            int var20 = class219.method1507(class79.field1510, class107.field1890, arg4 + arg5, 0);
            int var21 = class219.method1507(class79.field1510, class107.field1890, arg4 - arg5, 0);
            class203.method1394(class44.field973[arg0], var21, var20, -7249, arg2);
        }
        int var22 = (arg3 - 1) * var13;
        while (var7 > 0) {
            var7--;
            int var23 = arg0 - var7;
            if (var12 < 0) {
                while (var12 < 0) {
                    var12 += var18;
                    var15 += var19;
                    var18 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var15 < 0) {
                var12 += var18;
                var6++;
                var18 += var16;
                var15 += var19;
                var19 += var16;
            }
            var15 += -var17;
            int var24 = arg0 + var7;
            var12 += -var22;
            var22 -= var13;
            var17 -= var13;
            if (var24 >= class81.field1521 && var23 <= class205.field3681) {
                int var25 = class219.method1507(class79.field1510, class107.field1890, arg4 + var6, 0);
                int var26 = class219.method1507(class79.field1510, class107.field1890, arg4 - var6, 0);
                if (class81.field1521 <= var23) {
                    class203.method1394(class44.field973[var23], var26, var25, -7249, arg2);
                }
                if (var24 <= class205.field3681) {
                    class203.method1394(class44.field973[var24], var26, var25, -7249, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILfl;II)Lvj;")
    public static final class88 method1624(int arg0, class192 arg1, int arg2, int arg3) {
        if (arg0 == -10506) {
            field4268++;
            return class28.method239(50, arg1, arg3, arg2) ? class104.method698((byte) 42) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lba;II)V")
    public static final void method1625(class140 arg0, int arg1, int arg2) {
        if (arg0.field2549 > class93.field1655) {
            class206.method1414(arg0, false);
        } else if (class93.field1655 > arg0.field2554) {
            class232.method1566(arg0, (byte) 126);
        } else {
            class182.method1218(106, arg0);
        }
        field4258++;
        if (arg0.field2600 < 128 || arg0.field2564 < 128 || arg0.field2600 >= 13184 || arg0.field2564 >= 13184) {
            arg0.field2554 = 0;
            arg0.field2570 = -1;
            arg0.field2585 = -1;
            arg0.field2549 = 0;
            arg0.field2600 = arg0.field2536[0] * 128 + arg0.method822(2) * 64;
            arg0.field2564 = arg0.field2575[0] * 128 + arg0.method822(2) * 64;
            arg0.method964(0);
        }
        if (arg1 != -11777) {
            method1626(false);
        }
        if (class214.field3827 == arg0 && (arg0.field2600 < 1536 || arg0.field2564 < 1536 || arg0.field2600 >= 11776 || arg0.field2564 >= 11776)) {
            arg0.field2554 = 0;
            arg0.field2570 = -1;
            arg0.field2549 = 0;
            arg0.field2585 = -1;
            arg0.field2600 = arg0.field2536[0] * 128 + (arg0.method822(arg1 ^ 0xFFFFD1FD) * 64);
            arg0.field2564 = arg0.field2575[0] * 128 + arg0.method822(2) * 64;
            arg0.method964(0);
        }
        class183.method1232(arg0, 124);
        class282.method1917((byte) -119, arg0);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method1626(boolean arg0) {
        field4259++;
        int var1 = class130.field2335;
        if (arg0) {
            return;
        }
        int var2 = class182.field3227;
        int var3 = class172.field3103;
        int var4 = class279.field4926;
        if (class38.field867 == null || class140.field2605 == null) {
            if (class243.field4236.method1330(class58.field1187, (byte) -111) && class243.field4236.method1330(class189.field3398, (byte) -7)) {
                class38.field867 = method1624(-10506, class243.field4236, 0, class58.field1187);
                class140.field2605 = method1624(-10506, class243.field4236, 0, class189.field3398);
            } else {
                class35.method301(var1, var2, var4, 20, class203.field3636, 256 - class281.field4955);
            }
        }
        if (class38.field867 != null && class140.field2605 != null) {
            int var5 = var4 / class38.field867.field1896;
            for (int var6 = 0; var6 < var5; var6++) {
                class38.field867.method585(class38.field867.field1896 * var6 + var1, var2);
            }
            class140.field2605.method585(var1, var2);
            class140.field2605.method607(var4 + var1 - class140.field2605.field1896, var2);
        }
        class205.field3692.method763(class103.field1833, var1 + 3, var2 + 14, class51.field1073, -1);
        class35.method301(var1, var2 + 20, var4, var3 - 20, class203.field3636, 256 - class281.field4955);
        int var7 = class268.field4722;
        int var8 = class79.field1497;
        for (int var9 = 0; var9 < class120.field2129; var9++) {
            int var17 = (class120.field2129 - var9 - 1) * 15 + var2 + 35;
            if (var1 < var8 && (var1 + var4) > var8 && var17 - 13 < var7 && var17 + 3 > var7) {
                class35.method301(var1, var17 - 13, var4, 16, class96.field1697, 256 - class1.field25);
            }
        }
        if ((class184.field3293 == null || class43.field949 == null || class217.field3915 == null) && class243.field4236.method1330(class50.field1060, (byte) -97) && class243.field4236.method1330(class61.field1218, (byte) -128) && class243.field4236.method1330(class260.field4489, (byte) -116)) {
            class184.field3293 = method1624(-10506, class243.field4236, 0, class50.field1060);
            class43.field949 = method1624(-10506, class243.field4236, 0, class61.field1218);
            class217.field3915 = method1624(-10506, class243.field4236, 0, class260.field4489);
        }
        if (class184.field3293 != null && class43.field949 != null && class217.field3915 != null) {
            int var10 = var4 / class184.field3293.field1896;
            for (int var11 = 0; var11 < var10; var11++) {
                class184.field3293.method585(var1 + (class184.field3293.field1896 * var11), var2 + var3 + -class184.field3293.field1904);
            }
            int var12 = (var3 - 20) / class43.field949.field1904;
            for (int var13 = 0; var13 < var12; var13++) {
                class43.field949.method585(var1, class43.field949.field1904 * var13 + var2 + 20);
                class43.field949.method607(var1 + var4 - class43.field949.field1896, class43.field949.field1904 * var13 + var2 + 20);
            }
            class217.field3915.method585(var1, var3 + var2 - class217.field3915.field1904);
            class217.field3915.method607(var1 - (class217.field3915.field1896 - var4), -class217.field3915.field1904 + var2 + var3);
        }
        for (int var14 = 0; var14 < class120.field2129; var14++) {
            int var15 = (class120.field2129 - var14 - 1) * 15 + var2 + 35;
            int var16 = class51.field1073;
            if (var1 < var8 && (var1 + var4) > var8 && var7 > var15 - 13 && var7 < (var15 + 3)) {
                var16 = class51.field1068;
            }
            class205.field3692.method763(class118.method798(var14, 1927674668), var1 + 3, var15, var16, 0);
        }
        class139.method961(class172.field3103, class182.field3227, class279.field4926, 6467, class130.field2335);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILng;)V")
    public static final void method1627(int arg0, class135 arg1) {
        field4255++;
        int var2 = arg1.method947(27126);
        class55.field1131 = new class230[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class55.field1131[var3] = new class230();
            class55.field1131[var3].field4067 = arg1.method947(27126);
            class55.field1131[var3].field4063 = arg1.method932(48);
        }
        class182.field3233 = arg1.method947(27126);
        class179.field3187 = arg1.method947(27126);
        class16.field464 = arg1.method947(27126);
        class252.field4331 = new class229[class179.field3187 + 1 - class182.field3233];
        for (int var4 = 0; var4 < class16.field464; var4++) {
            int var6 = arg1.method947(27126);
            class229 var7 = class252.field4331[var6] = new class229();
            var7.field1836 = arg1.method920((byte) 62);
            var7.field1835 = arg1.method949(3933);
            var7.field4055 = class182.field3233 + var6;
            var7.field4054 = arg1.method932(115);
            var7.field4047 = arg1.method932(98);
        }
        int var5 = 80 / ((arg0 - 55) / 39);
        class183.field3254 = arg1.method949(3933);
        class76.field1465 = true;
    }
}
