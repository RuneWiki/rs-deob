import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class153 extends class128 {

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "Lq;")
    public class218 field2125;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field2127 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "Llh;")
    public static class58 field2128 = new class58();

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "[I")
    public static int[] field2131 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "Lnh;")
    public static class305 field2130;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public static void method958(int arg0) {
        if (arg0 == 0) {
            field2128 = null;
            field2131 = null;
            field2130 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lq;)V")
    public class153(class218 arg0) {
        this.field2125 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILjava/lang/String;ILim;ILgh;II)V")
    public static final void method959(int arg0, int arg1, int arg2, String arg3, int arg4, class178 arg5, int arg6, class33 arg7, int arg8, int arg9) {
        field2129++;
        int var10;
        if (class12.field203 == 4) {
            var10 = (int) class123.field1743 & 0x7FF;
        } else {
            var10 = (int) class123.field1743 + class179.field2712 & 0x7FF;
        }
        int var11 = arg4 * arg4 + arg6 * arg6;
        int var12 = Math.max(arg5.field2529 / 2, arg5.field2571 / 2) + 10;
        if ((var12 * var12) < var11) {
            return;
        }
        int var13 = class118.field1690[var10];
        int var14 = class118.field1697[var10];
        if (~class12.field203 != arg8) {
            var14 = var14 * 256 / (class42.field627 + 256);
            var13 = var13 * 256 / (class42.field627 + 256);
        }
        int var15 = arg6 * var13 - (arg4 * var14) >> 16;
        int var16 = arg7.method224(arg3, 100);
        int var17 = arg4 * var13 + arg6 * var14 >> 16;
        int var18 = var17 - var16 / 2;
        int var19 = arg7.method228(arg3, 100, 0);
        if (var18 >= -arg5.field2529 && var18 <= arg5.field2529 && (-arg5.field2571) <= var15 && var15 <= arg5.field2571) {
            class266.method1745(arg5.field2528, arg5.field2631);
            arg7.method214(arg3, arg0 + var18 + (arg5.field2529 / 2), arg5.field2571 / 2 + arg2 + -arg1 + -var15 + -var19, var16, 50, arg9, 0, 256, 1, 0, 0);
            class266.method1726();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLga;IILfa;)V")
    public static final void method960(byte arg0, class149 arg1, int arg2, int arg3, class238 arg4) {
        field2126++;
        if (arg1.field2052 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg1.field2052.length];
            for (int var7 = 0; var7 < (var6.length / 2); var7++) {
                int var13 = arg4.field3691 - arg1.field2052[var7 * 2 + 1];
                int var14 = arg1.field2052[var7 * 2] + arg4.field3689;
                int var15 = var6[var7 * 2] = class97.field1419 + ((var14 - class97.field1423) * (class97.field1421 - class97.field1419) / (class97.field1422 - class97.field1423));
                int var16 = var6[var7 * 2 + 1] = class97.field1412 + ((class97.field1420 - class97.field1412) * (var13 - class97.field1410) / (class97.field1414 - class97.field1410));
                if (class97.field1419 < var15 && var15 < class97.field1421 && var16 > class97.field1412 && class97.field1420 > var16) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class237.method1554(var6, arg1.field2055, arg1.field2055 >>> 24);
            for (int var8 = 0; var8 < (var6.length / 2 - 1); var8++) {
                class266.method1749(var6[var8 * 2], var6[var8 * 2 + 1], var6[var8 * 2 + 2], var6[(var8 + 1) * 2 + 1], arg1.field2027, arg1.field2027 >>> 24);
            }
            class266.method1749(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg1.field2027, arg1.field2027 >>> 24);
        } else if (arg4.field3684) {
            return;
        }
        class187 var9 = new class187(arg4);
        class74 var10 = null;
        if (arg1.field2072 != -1) {
            if (arg4.field3695 && arg1.field2045 != -1) {
                var10 = (class74) arg1.method932((byte) 35, true, true);
            } else {
                var10 = (class74) arg1.method932((byte) 28, false, true);
            }
            if (var10 != null) {
                if (class307.field4931 > 0 && (class14.field227 != -1 && class14.field227 == arg4.field3688 || class109.field1554 != -1 && class109.field1554 == arg1.field2059)) {
                    int var11;
                    if (class34.field520 <= 50) {
                        var11 = class34.field520 * 3;
                    } else {
                        var11 = (100 - class34.field520) * 3;
                    }
                    class266.method1739(arg4.field3687, arg4.field3686, var10.field4566 / 2 + 7, 16776960, var11);
                    class266.method1739(arg4.field3687, arg4.field3686, var10.field4566 / 2 + 5, 16776960, var11);
                    class266.method1739(arg4.field3687, arg4.field3686, var10.field4566 / 2 + 3, 16776960, var11);
                    class266.method1739(arg4.field3687, arg4.field3686, var10.field4566 / 2 + 1, 16776960, var11);
                    class266.method1739(arg4.field3687, arg4.field3686, var10.field4566 / 2, 16776960, var11);
                }
                var10.method487(arg4.field3687 - (var10.field4566 >> 1), -(var10.field4557 >> 1) + arg4.field3686);
                var9.field2831 = arg4.field3686 + arg2 - (var10.field4557 >> 1);
                var9.field2840 = arg3 + arg4.field3687 - (var10.field4566 >> 1);
                var9.field2833 = arg4.field3686 + arg2 + (var10.field4557 >> 1);
                var9.field2834 = (var10.field4566 >> 1) + arg3 + arg4.field3687;
            }
        }
        if (arg1.field2068 != null) {
            if (var10 == null) {
                class294.method1976(arg1, arg3, 8741, true, 0, arg4, arg2, var9);
            } else {
                class294.method1976(arg1, arg3, 8741, false, (var10.field4557 >> 1) + 5, arg4, arg2, var9);
            }
        }
        int var12 = -36 % ((4 - arg0) / 53);
        if (var9.method1184(class249.field3891, -17820, class17.field304) && arg1.field2037 != null) {
            if (arg1.field2037[4] != null) {
                class82.method518(-1, (short) 1012, arg1.field2037[4], arg1.field2063, 0, arg1.field2059, (long) arg4.field3688, (byte) 72);
            }
            if (arg1.field2037[3] != null) {
                class82.method518(-1, (short) 1007, arg1.field2037[3], arg1.field2063, 0, arg1.field2059, (long) arg4.field3688, (byte) 77);
            }
            if (arg1.field2037[2] != null) {
                class82.method518(-1, (short) 1010, arg1.field2037[2], arg1.field2063, 0, arg1.field2059, (long) arg4.field3688, (byte) 120);
            }
            if (arg1.field2037[1] != null) {
                class82.method518(-1, (short) 1006, arg1.field2037[1], arg1.field2063, 0, arg1.field2059, (long) arg4.field3688, (byte) 111);
            }
            if (arg1.field2037[0] != null) {
                class82.method518(-1, (short) 1004, arg1.field2037[0], arg1.field2063, 0, arg1.field2059, (long) arg4.field3688, (byte) 111);
            }
        }
        class116.field1675.method370((byte) -22, var9);
    }
}
