import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class113 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
    public static int[] field1935 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "[Lid;")
    public static class149[] field1941 = null;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lid;")
    private static class149 field1940 = class60.method382("Loaded interfaces", (byte) 19);

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Lid;")
    public static class149 field1942 = field1940;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lal;")
    public static class230 field1936;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILal;)V")
    public static final void method791(int arg0, class230 arg1) {
        class90.field1607 = arg1;
        if (arg0 != 0) {
            method794(95);
        }
        field1939++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Z")
    public static final boolean method792(int arg0) {
        field1943++;
        return class76.field1375 == arg0 ? class189.field3382.method575((byte) 92) : true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method793(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg6 - arg1;
        if (arg2 != 97) {
            return;
        }
        int var10 = arg4 - arg5;
        int var11 = (arg3 - arg8 << 16) / var9;
        int var12 = (arg7 - arg0 << 16) / var10;
        field1938++;
        class65.method406(var12, 30079, 0, arg5, arg6, arg8, arg1, 0, arg4, var11, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static void method794(int arg0) {
        field1941 = null;
        field1942 = null;
        field1940 = null;
        if (arg0 > 44) {
            field1935 = null;
            field1936 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Laj;IB)I")
    public static final int method795(class47 arg0, int arg1, byte arg2) {
        field1934++;
        if (arg0.field793 == null || arg1 >= arg0.field793.length) {
            return -2;
        }
        int var3 = -110 / ((29 - arg2) / 46);
        try {
            int var4 = 0;
            int[] var5 = arg0.field793[arg1];
            byte var6 = 0;
            int var7 = 0;
            while (true) {
                int var8 = var5[var4++];
                int var9 = 0;
                byte var10 = 0;
                if (var8 == 0) {
                    return var7;
                }
                if (var8 == 15) {
                    var10 = 1;
                }
                if (var8 == 1) {
                    var9 = class176.field3226[var5[var4++]];
                }
                if (var8 == 16) {
                    var10 = 2;
                }
                if (var8 == 17) {
                    var10 = 3;
                }
                if (var8 == 2) {
                    var9 = class257.field4501[var5[var4++]];
                }
                if (var8 == 3) {
                    var9 = class206.field3703[var5[var4++]];
                }
                if (var8 == 4) {
                    int var11 = var5[var4++] << 16;
                    int var12 = var11 + var5[var4++];
                    class47 var13 = class251.method1741((byte) 110, var12);
                    int var14 = var5[var4++];
                    if (var14 != -1 && (!class226.method1516(var14, -28322).field4591 || class256.field4470)) {
                        for (int var15 = 0; var15 < var13.field797.length; var15++) {
                            if (var14 + 1 == var13.field797[var15]) {
                                var9 += var13.field786[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class115.field1953[var5[var4++]];
                }
                if (var8 == 6) {
                    var9 = class190.field3404[class257.field4501[var5[var4++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class115.field1953[var5[var4++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class77.field1449.field2231;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class150.field2740[var16]) {
                            var9 += class257.field4501[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var5[var4++] << 16;
                    int var18 = var17 + var5[var4++];
                    class47 var19 = class251.method1741((byte) 110, var18);
                    int var20 = var5[var4++];
                    if (var20 != -1 && (!class226.method1516(var20, -28322).field4591 || class256.field4470)) {
                        for (int var21 = 0; var21 < var19.field797.length; var21++) {
                            if (var20 + 1 == var19.field797[var21]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class32.field470;
                }
                if (var8 == 12) {
                    var9 = class279.field4986;
                }
                if (var8 == 13) {
                    int var22 = class115.field1953[var5[var4++]];
                    int var23 = var5[var4++];
                    var9 = (0x1 << var23 & var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var5[var4++];
                    var9 = class32.method192(22255, var24);
                }
                if (var8 == 18) {
                    var9 = (class77.field1449.field2347 >> 7) + class125.field2199;
                }
                if (var8 == 19) {
                    var9 = (class77.field1449.field2340 >> 7) + class115.field1969;
                }
                if (var8 == 20) {
                    var9 = var5[var4++];
                }
                if (var10 == 0) {
                    if (var6 == 0) {
                        var7 += var9;
                    }
                    if (var6 == 1) {
                        var7 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var7 /= var9;
                    }
                    if (var6 == 3) {
                        var7 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }
}
