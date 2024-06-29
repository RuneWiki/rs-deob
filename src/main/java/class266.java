import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class266 extends class121 {

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBIII)V")
    public static final void method1646(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4053++;
        if (arg2 > -126) {
            method1647((class170) null, -105, -106);
        }
        if (arg0 > class204.field3060 || class189.field2831 > arg4) {
            return;
        }
        boolean var6;
        if (class192.field2917 > arg3) {
            var6 = false;
            arg3 = class192.field2917;
        } else if (class39.field497 >= arg3) {
            var6 = true;
        } else {
            var6 = false;
            arg3 = class39.field497;
        }
        boolean var7;
        if (class192.field2917 > arg1) {
            arg1 = class192.field2917;
            var7 = false;
        } else if (arg1 > class39.field497) {
            arg1 = class39.field497;
            var7 = false;
        } else {
            var7 = true;
        }
        if (class189.field2831 > arg0) {
            arg0 = class189.field2831;
        } else {
            class379.method2285(125, class292.field4448[arg0++], arg1, arg5, arg3);
        }
        if (class204.field3060 < arg4) {
            arg4 = class204.field3060;
        } else {
            class379.method2285(127, class292.field4448[arg4--], arg1, arg5, arg3);
        }
        if (var6 && var7) {
            for (int var8 = arg0; var8 <= arg4; var8++) {
                int[] var9 = class292.field4448[var8];
                var9[arg3] = var9[arg1] = arg5;
            }
        } else if (var6) {
            for (int var11 = arg0; var11 <= arg4; var11++) {
                class292.field4448[var11][arg3] = arg5;
            }
        } else if (var7) {
            for (int var10 = arg0; var10 <= arg4; var10++) {
                class292.field4448[var10][arg1] = arg5;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lfh;II)I")
    public static final int method1647(class170 arg0, int arg1, int arg2) {
        if (arg1 != 31368) {
            return 114;
        }
        field4055++;
        if (!client.method2796(arg0).method1904(arg2, 36) && arg0.field2547 == null) {
            return -1;
        } else if (arg0.field2567 == null || arg0.field2567.length <= arg2) {
            return -1;
        } else {
            return arg0.field2567[arg2];
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
    public static final void method1648(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4054++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class198.method1192(class192.field2917, class39.field497, arg0 + arg2, -3);
        int var10 = class198.method1192(class192.field2917, class39.field497, arg0 - arg2, arg1 ^ 0xFFFFE456);
        class379.method2285(126, class292.field4448[arg3], var9, arg4, var10);
        if (arg1 != 7083) {
            return;
        }
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class189.field2831 <= var12 && class204.field3060 >= var11) {
                    int var13 = class198.method1192(class192.field2917, class39.field497, arg0 + var5, -3);
                    int var14 = class198.method1192(class192.field2917, class39.field497, arg0 - var5, arg1 ^ 0xFFFFE456);
                    if (var12 <= class204.field3060) {
                        class379.method2285(124, class292.field4448[var12], var13, arg4, var14);
                    }
                    if (class189.field2831 <= var11) {
                        class379.method2285(127, class292.field4448[var11], var13, arg4, var14);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class189.field2831 <= var16 && class204.field3060 >= var15) {
                int var17 = class198.method1192(class192.field2917, class39.field497, arg0 + var6, -3);
                int var18 = class198.method1192(class192.field2917, class39.field497, arg0 - var6, -3);
                if (class204.field3060 >= var16) {
                    class379.method2285(124, class292.field4448[var16], var17, arg4, var18);
                }
                if (var15 >= class189.field2831) {
                    class379.method2285(124, class292.field4448[var15], var17, arg4, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILa;La;)V")
    public static final void method1649(int arg0, int arg1, int arg2, class233 arg3, class233 arg4) {
        class13 var5 = class230.method1395(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field167 = arg3;
            var5.field163 = arg4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILef;)V")
    public static final void method1650(int arg0, class385 arg1) {
        for (int var2 = 0; var2 < class51.field658; var2++) {
            int var4 = arg1.method2372(true);
            int var5 = arg1.method2323(-106);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class299.field4519[var4] != null) {
                class299.field4519[var4].field5120 = var5;
            }
        }
        int var3 = 113 % ((-arg0 - 4) / 38);
        field4052++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBLdr;Lsf;)V")
    public static final void method1651(int arg0, int arg1, byte arg2, class261 arg3, class398 arg4) {
        class298.field4502.method2512((byte) 4);
        field4051++;
        if (arg2 != -29) {
            method1646(120, -124, (byte) 102, 44, 23, -1);
        }
        if (class14.field175) {
            return;
        }
        for (class227 var5 = (class227) arg4.method2514((byte) 61); var5 != null; var5 = (class227) arg4.method2511(-118)) {
            class228 var6 = class20.method125(var5.field3437, arg2 + 65);
            if (class126.method744(var6, (byte) 84)) {
                boolean var7 = class88.method584(-19168, arg3, var6, arg0, arg1, var5);
                if (var7) {
                    class452.method2809(var6, var5, 16333, arg3);
                }
            }
        }
    }
}
