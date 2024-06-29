import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class289 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lfh;")
    public static class140 field4183;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lvk;")
    public static class188 field4188;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lib;")
    public static class98 field4182;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILfh;Lfh;)V", line = 5)
    public static final void method1980(int arg0, class140 arg1, class140 arg2) {
        field4184++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class360.field5629 = arg2;
        int var4 = (int) (Math.random() * 41.0D) - 20;
        class310.field4559 = arg1;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        class360.field5629.method1088(34, 1);
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class238.field3443 = var4 + var5;
        class331.field4841 = var3 + var4;
        if (arg0 != -8) {
            method1988(-79, -77L);
        }
        class273.field3916 = var4 + var6;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 31)
    public static void method1981(int arg0) {
        if (arg0 != 1) {
            method1984(33, 116, -90, -67);
        }
        field4182 = null;
        field4188 = null;
        field4183 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 44)
    public static final void method1982(int arg0, byte arg1, String arg2) {
        if (arg1 < 40) {
            field4182 = (class98) null;
        }
        field4181++;
        String var3 = class296.method2028(class122.method878(arg2, -8251), true);
        boolean var4 = false;
        for (int var5 = 0; var5 < class112.field1441; var5++) {
            class239 var6 = class311.field4574[class288.field4157[var5]];
            if (var6 != null && var6.field3475 != null && var6.field3475.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg0 == 1) {
                    class314.field4612++;
                    class251.field3681.method1309(23, 212);
                    class251.field3681.method2081(-2076007248, class288.field4157[var5]);
                    class251.field3681.method2078(0, -42);
                } else if (arg0 == 4) {
                    class251.field3681.method1309(23, 105);
                    class251.field3681.method2098(-60, class288.field4157[var5]);
                    class13.field144++;
                    class251.field3681.method2048(0, 88);
                } else if (arg0 == 5) {
                    class251.field3681.method1309(23, 96);
                    class251.field3681.method2078(0, 82);
                    class177.field2434++;
                    class251.field3681.method2098(-26, class288.field4157[var5]);
                } else if (arg0 == 6) {
                    class271.field3891++;
                    class251.field3681.method1309(23, 77);
                    class251.field3681.method2080(255, class288.field4157[var5]);
                    class251.field3681.method2053(118, 0);
                } else if (arg0 == 7) {
                    class251.field3681.method1309(23, 52);
                    class331.field4916++;
                    class251.field3681.method2098(-80, class288.field4157[var5]);
                    class251.field3681.method2048(0, 71);
                }
                break;
            }
        }
        if (!var4) {
            class88.method641("", 0, false, class291.field4219 + var3);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 129)
    public static final void method1983(byte arg0) {
        int var1 = 118 / ((35 - arg0) / 50);
        for (int var2 = 0; var2 < class257.field3747; var2++) {
            int var3 = class305.field4455[var2];
            class169 var4 = class251.field3688[var3];
            if (var4 != null) {
                class130.method1000(-29399, var4.field2345.field2224, var4);
            }
        }
        field4190++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I", line = 155)
    public static final int method1984(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            field4183 = (class140) null;
        }
        field4180++;
        return arg1 >= arg0 ? (arg1 > arg3 ? arg3 : arg1) : arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZ)V", line = 166)
    public static final void method1985(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class66.field847 = arg1;
        class300.field4413 = arg2;
        class255.field3728 = arg3;
        class217.field3069 = new class119[arg0][class66.field847][class300.field4413];
        class185.field2517 = new int[arg0][class66.field847 + 1][class300.field4413 + 1];
        if (class47.field623) {
            class133.field1810 = new class70[4][];
        }
        if (arg4) {
            class300.field4410 = new class119[1][class66.field847][class300.field4413];
            class143.field1992 = new int[class66.field847][class300.field4413];
            class161.field2296 = new int[1][class66.field847 + 1][class300.field4413 + 1];
            if (class47.field623) {
                class7.field66 = new class70[1][];
            }
        } else {
            class300.field4410 = (class119[][][]) null;
            class143.field1992 = (int[][]) null;
            class161.field2296 = (int[][][]) null;
            class7.field66 = (class70[][]) null;
        }
        class85.method621(false);
        class260.field3773 = new class232[500];
        class353.field5505 = 0;
        class291.field4236 = new class232[500];
        class204.field2833 = 0;
        class71.field935 = new int[arg0][class66.field847 + 1][class300.field4413 + 1];
        class75.field987 = new class294[5000];
        class20.field229 = 0;
        class279.field3978 = new class294[100];
        class15.field170 = new boolean[class255.field3728 + class255.field3728 + 1][class255.field3728 + class255.field3728 + 1];
        class283.field4030 = new boolean[class255.field3728 + class255.field3728 + 2][class255.field3728 + class255.field3728 + 2];
        class9.field100 = new byte[arg0][class66.field847][class300.field4413];
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 210)
    public static final void method1986(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class214.field3024[var1] = false;
        }
        class160.field2270 = -1;
        client.field1631 = 5;
        class270.field3881 = 0;
        field4187++;
        if (arg0) {
            class264.field3840 = 0;
            class297.field4315 = -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIFIIZB)[I", line = 235)
    public static final int[] method1987(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6, byte arg7) {
        int[] var8 = new int[arg4];
        field4189++;
        if (arg7 != -24) {
            return (int[]) null;
        }
        class214 var9 = new class214();
        var9.field3022 = (int) (arg3 * 4096.0F);
        var9.field3033 = arg1;
        var9.field3030 = arg6;
        var9.field3036 = arg0;
        var9.field3023 = arg2;
        var9.field3029 = arg5;
        var9.method189((byte) -17);
        class271.method1849(arg4, 1, false);
        var9.method1565(var8, 0, arg7 ^ 0xFFFFFFB5);
        return var8;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)V", line = 266)
    public static final void method1988(int arg0, long arg1) {
        field4186++;
        class251.field3681.field4351 = 0;
        class251.field3681.method2048(21, arg0 - 19453);
        class251.field3681.method2049(-19780, arg1);
        if (arg0 != 19536) {
            method1984(-67, -6, -68, 36);
        }
        class210.field2970 = -3;
        class226.field3251 = 0;
        class145.field2025 = 0;
        class318.field4688 = 1;
    }
}
