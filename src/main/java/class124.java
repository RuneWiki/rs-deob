import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class124 extends class159 {

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "[Lgd;")
    public static class154[] field1860 = new class154[4];

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "Ltb;")
    public class183 field1857;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Lad;")
    public class197 field1858;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Lcn;")
    public class237 field1847;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lpc;")
    public class321 field1832;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILbb;Lpl;)V", line = 7)
    public static final void method800(int arg0, class148 arg1, class312 arg2) {
        class239 var3 = arg2.method2180(-68);
        field1861++;
        if (var3 == null) {
            return;
        }
        int var4 = var3.field2915;
        if (var3.field2913 > var3.field2915) {
            var4 = var3.field2913;
        }
        int var5 = arg1.field2389;
        int var6 = -82 % ((29 - arg0) / 35);
        int var7 = 0;
        int var8 = arg1.field2379;
        int var9 = 0;
        int var10 = 0;
        if (arg2.field5104 != null) {
            var7 = class302.field4967.method1212(arg2.field5104, (int[]) null, class4.field50);
            for (int var11 = 0; var11 < var7; var11++) {
                String var12 = class4.field50[var11];
                if ((var7 - 1) > var11) {
                    var12 = var12.substring(0, var12.length() - 4);
                }
                int var13 = class196.field3015.method1237(var12);
                if (var13 > var9) {
                    var9 = var13;
                }
            }
            var10 = class196.field3015.method1238() * (var7 - 1) + (class196.field3015.method1234() / 2);
        }
        int var14 = arg1.field2389;
        if (class88.field1279 + var4 > var5) {
            var14 = class88.field1279 + var4 + 5 - (-(var4 / 2) - var9 / 2);
            var5 = class88.field1279 + var4;
        } else if (class88.field1270 - var4 < var5) {
            var14 = class88.field1270 - (var9 / 2) - var4 - var4 / 2 - 5;
            var5 = class88.field1270 - var4;
        }
        int var15 = arg1.field2379 - (var10 / 2);
        if (var8 < (class88.field1273 + var4)) {
            var8 = class88.field1273 + var4;
            var15 = var4 / 2 + (class88.field1273 + var4) + class196.field3015.method1238();
        } else if (var8 > class88.field1278 - var4) {
            var15 = class88.field1278 - var4 - var10 - (var4 / 2);
            var8 = class88.field1278 - var4;
        }
        int var16 = var4 >> 1;
        int var17 = (int) (Math.atan2((double) (var5 - arg1.field2389), (double) (var8 - arg1.field2379)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var3.method1675(var3.field2917 << 3, var3.field2909 << 3, (var5 << 4) + var16, (var8 << 4) + var16, var17, 4096);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field5104 != null) {
            var19 = var15 - class196.field3015.method1234() - 3;
            var20 = class196.field3015.method1238() * var7 + var19;
            var18 = var14 - (var9 / 2) - 5;
            var21 = var18 + var9 + 10;
            if (arg2.field5070 != 0) {
                class317.method2270(var18, var19, var21 - var18, -var19 + var20, arg2.field5070, arg2.field5070 >>> 24);
            }
            if (arg2.field5084 != 0) {
                class317.method2286(var18, var19, var21 - var18, -var19 + var20, arg2.field5084, arg2.field5084 >>> 24);
            }
            for (int var22 = 0; var22 < var7; var22++) {
                String var23 = class4.field50[var22];
                if (var7 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class196.field3015.method1242(var23, var14, var15, arg2.field5087, true);
                var15 += class196.field3015.method1238();
            }
        }
        if ((var5 - var16) >= class305.field4988 || var5 + var16 <= class305.field4988 || (var8 - var16) >= class130.field1982 || class130.field1982 >= var8 + var16 && var18 >= class305.field4988 || var21 <= class305.field4988 || var19 >= class130.field1982 || var20 <= class130.field1982) {
            return;
        }
        if (arg2.field5090[4] != null) {
            class322.method2309(arg2.field5075, 0, (short) 1001, false, -1, arg2.field5090[4], 0, (long) arg1.field2378);
        }
        if (arg2.field5090[3] != null) {
            class322.method2309(arg2.field5075, 0, (short) 1008, false, -1, arg2.field5090[3], 0, (long) arg1.field2378);
        }
        if (arg2.field5090[2] != null) {
            class322.method2309(arg2.field5075, 0, (short) 1005, false, -1, arg2.field5090[2], 0, (long) arg1.field2378);
        }
        if (arg2.field5090[1] != null) {
            class322.method2309(arg2.field5075, 0, (short) 1012, false, -1, arg2.field5090[1], 0, (long) arg1.field2378);
        }
        if (arg2.field5090[0] != null) {
            class322.method2309(arg2.field5075, 0, (short) 1009, false, -1, arg2.field5090[0], 0, (long) arg1.field2378);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZIII)V", line = 160)
    public static final void method801(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class262.field4131 = 0L;
        field1835++;
        int var5 = class84.method552(arg2);
        boolean var6 = false;
        if (arg4 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (var5 > 0 == arg4 <= 0) {
            var6 = true;
        }
        if (class274.field4518.startsWith("mac") && arg4 > 0) {
            arg1 = true;
        }
        if (arg1 && arg4 > 0) {
            var6 = true;
        }
        class52.method380(arg3, var5, 98, var6, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 192)
    public final void method802(int arg0) {
        this.field1857 = null;
        if (arg0 <= 36) {
            this.field1858 = (class197) null;
        }
        field1862++;
        this.field1832 = null;
        this.field1858 = null;
        this.field1847 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I", line = 211)
    public static final int method803(boolean arg0) {
        field1852++;
        if (class2.field12) {
            return 0;
        }
        if (arg0) {
            method803(false);
        }
        if (class261.method1836(0)) {
            return class153.field2486 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 230)
    public static void method804(int arg0) {
        field1860 = null;
        if (arg0 != 4) {
            method805(-85, -68, 94, -52, (byte) 28, 13);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIBI)V", line = 240)
    public static final void method805(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1831++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = var8 << 1;
        int var10 = arg1 * arg1;
        int var11 = arg1 << 1;
        int var12 = var10 << 1;
        int var13 = var10 - ((var11 - 1) * var9);
        int var14 = var8 << 2;
        int var15 = (1 - var11) * var8 + var12;
        int var16 = var10 << 2;
        int var17 = ((var6 << 1) + 3) * var12;
        if (arg4 >= -77) {
            field1860 = (class154[]) null;
        }
        int var18 = ((arg1 << 1) - 3) * var9;
        int var19 = (arg1 - 1) * var14;
        if (class33.field505 <= arg5 && arg5 <= class278.field4586) {
            int var20 = class34.method288(3, arg2 + arg3, class341.field5494, class196.field3001);
            int var21 = class34.method288(3, arg2 - arg3, class341.field5494, class196.field3001);
            class270.method1906(arg0, var20, var21, class306.field4998[arg5], 118);
        }
        int var22 = (var6 + 1) * var16;
        while (var7 > 0) {
            var7--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var15 += var17;
                    var17 += var16;
                    var6++;
                    var13 += var22;
                    var22 += var16;
                }
            }
            if (var13 < 0) {
                var13 += var22;
                var22 += var16;
                var6++;
                var15 += var17;
                var17 += var16;
            }
            int var23 = arg5 - var7;
            var15 += -var19;
            var13 += -var18;
            var18 -= var14;
            int var24 = arg5 + var7;
            if (class33.field505 <= var24 && var23 <= class278.field4586) {
                int var25 = class34.method288(3, arg2 + var6, class341.field5494, class196.field3001);
                int var26 = class34.method288(3, arg2 - var6, class341.field5494, class196.field3001);
                if (var23 >= class33.field505) {
                    class270.method1906(arg0, var25, var26, class306.field4998[var23], 116);
                }
                if (var24 <= class278.field4586) {
                    class270.method1906(arg0, var25, var26, class306.field4998[var24], 127);
                }
            }
            var19 -= var14;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(ZI)Laa;", line = 368)
    public static final class224 method806(boolean arg0, int arg1) {
        class224 var2 = (class224) class180.field2792.method652((long) arg1, false);
        field1850++;
        if (!arg0) {
            return (class224) null;
        } else if (var2 == null) {
            byte[] var3 = class278.field4589.method1504(arg1, arg0, 0);
            class224 var4 = new class224();
            if (var3 != null) {
                var4.method1528(new class313(var3), -1);
            }
            var4.method1530(-127);
            class180.field2792.method642(var4, (long) arg1, -126);
            return var4;
        } else {
            return var2;
        }
    }
}
