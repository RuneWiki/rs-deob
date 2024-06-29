import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class293 extends class29 {

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "Lph;")
    public static class229 field4787 = class266.method1858("Liste des serveurs charg-Be", 0);

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "Lph;")
    public static class229 field4791 = class266.method1858("http:)4)4", 0);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "[I")
    public static int[] field4788 = new int[500];

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public int field4792;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "Z")
    public static boolean field4783;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "[I")
    public static int[] field4793;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ld;IIIIIIZ)V", line = 13)
    public static final void method1991(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2572.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field2572[var9] - class244.field4035;
            int var11 = arg0.field2583[var9] - class129.field2111;
            int var12 = arg0.field2571[var9] - class255.field4266;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field2565 != null) {
                class158.field2576[var9] = var13;
                class158.field2575[var9] = var16;
                class158.field2568[var9] = var17;
            }
            class158.field2577[var9] = (var13 << 9) / var17 + class310.field5212;
            class158.field2578[var9] = (var16 << 9) / var17 + class310.field5211;
        }
        class310.field5200 = 0;
        int var19 = arg0.field2573.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field2573[var20];
            int var22 = arg0.field2567[var20];
            int var23 = arg0.field2562[var20];
            int var24 = class158.field2577[var21];
            int var25 = class158.field2577[var22];
            int var26 = class158.field2577[var23];
            int var27 = class158.field2578[var21];
            int var28 = class158.field2578[var22];
            int var29 = class158.field2578[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class198.field3304 && class211.method1490(class310.field5212 + class111.field1874, class7.field98 + class310.field5211, var27, var28, var29, var24, var25, var26)) {
                    class110.field1869 = arg5;
                    class24.field310 = arg6;
                }
                if (!class99.field1675 && !arg7) {
                    class310.field5198 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class310.field5204 || var25 > class310.field5204 || var26 > class310.field5204) {
                        class310.field5198 = true;
                    }
                    if (arg0.field2565 == null || arg0.field2565[var20] == -1) {
                        if (arg0.field2566[var20] != 12345678) {
                            class310.method2092(var27, var28, var29, var24, var25, var26, arg0.field2566[var20], arg0.field2569[var20], arg0.field2574[var20]);
                        }
                    } else if (!class215.field3547) {
                        int var30 = class310.field5207.method109(109, arg0.field2565[var20]);
                        class310.method2092(var27, var28, var29, var24, var25, var26, class298.method2007(var30, arg0.field2566[var20]), class298.method2007(var30, arg0.field2569[var20]), class298.method2007(var30, arg0.field2574[var20]));
                    } else if (arg0.field2563) {
                        class310.method2096(var27, var28, var29, var24, var25, var26, arg0.field2566[var20], arg0.field2569[var20], arg0.field2574[var20], class158.field2576[0], class158.field2576[1], class158.field2576[3], class158.field2575[0], class158.field2575[1], class158.field2575[3], class158.field2568[0], class158.field2568[1], class158.field2568[3], arg0.field2565[var20]);
                    } else {
                        class310.method2096(var27, var28, var29, var24, var25, var26, arg0.field2566[var20], arg0.field2569[var20], arg0.field2574[var20], class158.field2576[var21], class158.field2576[var22], class158.field2576[var23], class158.field2575[var21], class158.field2575[var22], class158.field2575[var23], class158.field2568[var21], class158.field2568[var22], class158.field2568[var23], arg0.field2565[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V", line = 137)
    public static final void method1992(int arg0) {
        class88.field1497.method40(8);
        int var1 = class88.field1497.method34(112, arg0);
        field4790++;
        if (var1 == 0) {
            return;
        }
        int var2 = class88.field1497.method34(arg0 + 19, 2);
        if (var2 == 0) {
            class105.field1782[class313.field5278++] = 2047;
        } else if (var2 == 1) {
            int var10 = class88.field1497.method34(-96, 3);
            class230.field3820.method2063(var10, false, 19522);
            int var11 = class88.field1497.method34(121, 1);
            if (var11 == 1) {
                class105.field1782[class313.field5278++] = 2047;
            }
        } else if (var2 == 2) {
            int var7 = class88.field1497.method34(arg0 - 124, 3);
            class230.field3820.method2063(var7, true, 19522);
            int var8 = class88.field1497.method34(-53, 3);
            class230.field3820.method2063(var8, true, 19522);
            int var9 = class88.field1497.method34(arg0 + 110, 1);
            if (var9 == 1) {
                class105.field1782[class313.field5278++] = 2047;
            }
        } else if (var2 == 3) {
            int var3 = class88.field1497.method34(arg0 ^ 0x6E, 7);
            int var4 = class88.field1497.method34(arg0 + 126, 1);
            if (var4 == 1) {
                class105.field1782[class313.field5278++] = 2047;
            }
            int var5 = class88.field1497.method34(113, 7);
            class298.field4849 = class88.field1497.method34(114, 2);
            int var6 = class88.field1497.method34(127, 1);
            class230.field3820.method1454(var3, (byte) -119, var6 == 1, var5);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIII)V", line = 217)
    public final void method1993(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4780++;
        if (arg0 != -28599) {
            return;
        }
        int var6 = this.field4782 << 3;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field4781 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method642(var6, var8, var7, var9, arg1, arg3);
    }

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)V", line = 236)
    public static void method1994(int arg0) {
        field4793 = null;
        field4791 = null;
        if (arg0 != 9) {
            method1994(-118);
        }
        field4787 = null;
        field4788 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
    public abstract void method647(int arg0, int arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public abstract void method652(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
    public abstract void method653(int arg0, int arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public abstract void method646(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method644(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V")
    public abstract void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
