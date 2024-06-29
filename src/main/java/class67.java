import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class67 extends class199 {

    @OriginalMember(owner = "client!dn", name = "X", descriptor = "I")
    private int field859 = 20;

    @OriginalMember(owner = "client!dn", name = "V", descriptor = "I")
    private int field857 = 0;

    @OriginalMember(owner = "client!dn", name = "Y", descriptor = "I")
    private int field860 = 1365;

    @OriginalMember(owner = "client!dn", name = "db", descriptor = "I")
    private int field865 = 0;

    @OriginalMember(owner = "client!dn", name = "Z", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!dn", name = "eb", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "Z")
    public static boolean field856 = true;

    @OriginalMember(owner = "client!dn", name = "S", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!dn", name = "W", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!dn", name = "bb", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!dn", name = "cb", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!dn", name = "fb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!dn", name = "gb", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!dn", name = "hb", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!dn", name = "ab", descriptor = "Lwg;")
    public static class310 field862;

    @OriginalMember(owner = "client!dn", name = "T", descriptor = "[Luj;")
    public static class158[] field855;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZIZLqk;IIIZ)Luj;", line = 9)
    public static final class158 method483(int arg0, boolean arg1, int arg2, boolean arg3, class125 arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field868++;
        class362 var9 = class172.method1265(arg7, (byte) -4);
        if (arg2 > 1 && var9.field5719 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field5683[var11] <= arg2 && var9.field5683[var11] != 0) {
                    var10 = var9.field5719[var11];
                }
            }
            if (var10 != -1) {
                var9 = class172.method1265(var10, (byte) 33);
            }
        }
        class332 var12 = var9.method2528(arg4, 23);
        if (var12 == null) {
            return null;
        }
        class11 var13 = null;
        if (var9.field5700 != -1) {
            var13 = (class11) method483(1, false, 10, true, arg4, -93, 0, var9.field5714, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field5687 != -1) {
            var13 = (class11) method483(arg0, false, arg2, false, arg4, -101, arg6, var9.field5672, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class37.field452;
        int var15 = class37.field449;
        int[] var16 = new int[4];
        int var17 = class37.field454;
        class37.method249(var16);
        class11 var18 = new class11(36, 32);
        class37.method250(var18.field124, 36, 32);
        class350.method2444();
        class350.method2439(16, 16);
        class350.field5465 = false;
        int var19 = var9.field5660;
        if (arg3) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class350.field5474[var9.field5691] * var19 >> 16;
        int var21 = 83 % ((-arg5 - 34) / 35);
        int var22 = class350.field5476[var9.field5691] * var19 >> 16;
        var12.method579(0, var9.field5708, var9.field5667, var9.field5691, var9.field5670, var22 + var9.field5712 - var12.method583() / 2, var9.field5712 + var20, -1L);
        if (arg0 >= 1) {
            var18.method80(1);
            if (arg0 >= 2) {
                var18.method80(16777215);
            }
            class37.method250(var18.field124, 36, 32);
        }
        if (arg6 != 0) {
            var18.method73(arg6);
        }
        if (var9.field5700 != -1) {
            var13.method85(0, 0);
        } else if (var9.field5687 != -1) {
            class37.method250(var13.field124, 36, 32);
            var18.method85(0, 0);
            var18 = var13;
        }
        if (arg1 && (var9.field5685 == 1 || arg2 != 1) && arg2 != -1) {
            class159.field2265.method1900(class143.method1119(-41, arg2), 0, 9, 16776960, 1);
        }
        class37.method250(var14, var17, var15);
        class37.method252(var16);
        class350.method2444();
        class350.field5465 = true;
        return class47.field623 && !arg8 ? new class361(var18) : var18;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V", line = 137)
    public static final void method484(int arg0, int arg1) {
        field858++;
        if (!class139.field1917) {
            arg0 = -1;
        }
        if (class92.field1203 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class204 var2 = class268.method1833(-106, arg0);
            class11 var3 = var2.method1487((byte) -76);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class157.field2216.method510((byte) -79, new Point(var2.field2842, var2.field2832), var3.field2255, var3.method75(), var3.field2244, class26.field307);
                class92.field1203 = arg0;
            }
        }
        if (arg0 == -1 && class92.field1203 != -1) {
            class157.field2216.method510((byte) 127, new Point(), -1, (int[]) null, -1, class26.field307);
            class92.field1203 = -1;
        }
        int var4 = 115 / ((arg1 + 13) / 52);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 180)
    public class67() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 188)
    public static final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class156 var13 = new class156();
        var13.field2156 = arg6;
        var13.field2161 = arg3;
        var13.field2172 = arg11;
        var13.field2175 = arg12;
        var13.field2162 = arg4;
        var13.field2173 = arg5;
        var13.field2168 = arg8;
        if (arg7 < 70) {
            return;
        }
        var13.field2157 = arg0;
        var13.field2163 = arg2;
        var13.field2155 = arg10;
        var13.field2154 = arg1;
        var13.field2167 = arg9;
        field854++;
        class137.field1874.method415((byte) -112, var13);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLfd;I)V", line = 234)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field860 = arg1.method2083((byte) -74);
        } else if (arg2 == 1) {
            this.field859 = arg1.method2083((byte) -84);
        } else if (arg2 == 2) {
            this.field865 = arg1.method2083((byte) -110);
        } else if (arg2 == 3) {
            this.field857 = arg1.method2083((byte) -121);
        }
        if (arg0 == -43) {
            field864++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V", line = 275)
    public static final void method486(int arg0) {
        class57.method429();
        class84.field1081 = new class18[arg0];
        class84.field1081[1] = new class267();
        class84.field1081[2] = new class155();
        class84.field1081[3] = new class111();
        field867++;
        class84.field1081[4] = new class228();
        class84.field1081[5] = new class336();
        class84.field1081[6] = new class53();
        class84.field1081[7] = new class273();
    }

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "(I)V", line = 294)
    public static void method487(int arg0) {
        field862 = null;
        if (arg0 != 0) {
            field862 = (class310) null;
        }
        field855 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[I", line = 321)
    public final int[] method190(int arg0, int arg1) {
        int[] var3 = this.field2802.method2502(arg1, -55);
        if (arg0 != -1735) {
            field856 = true;
        }
        field863++;
        if (this.field2802.field5637) {
            for (int var4 = 0; var4 < class95.field1235; var4++) {
                int var5 = (class82.field1062[var4] << 12) / this.field860 + this.field865;
                int var6 = (class274.field3919[arg1] << 12) / this.field860 + this.field857;
                int var7 = var6;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5;
                int var11 = 0;
                int var12 = var5 * var5 >> 12;
                int var13 = var6 * var6 >> 12;
                while ((var12 + var13) < 16384 && var11 < this.field859) {
                    var11++;
                    var8 = (var8 * var9 >> 12) * 2 + var7;
                    var9 = var10 + var12 - var13;
                    var13 = var8 * var8 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = var11 >= (this.field859 - 1) ? 0 : (var11 << 12) / this.field859;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([IIIIII)V", line = 376)
    public static final void method488(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class119 var6 = class345.field5367[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class104 var7 = var6.field1550;
        if (var7 != null) {
            int var8 = var7.field1346;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class244 var10 = var6.field1567;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3541;
        int var12 = var10.field3547;
        int var13 = var10.field3557;
        int var14 = var10.field3545;
        int[] var15 = class253.field3700[var11];
        int[] var16 = class27.field318[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)V", line = 470)
    public static final void method489(int arg0, int arg1) {
        class317.field4671 = -1;
        class233.field3338 = arg1;
        if (arg0 != 5) {
            method488((int[]) null, 7, 90, 60, -66, -47);
        }
        class229.field3287 = null;
        class194.field2673 = 1;
        class314.field4639 = -1;
        field869++;
        class29.field330 = false;
        class172.field2384 = 0;
    }
}
