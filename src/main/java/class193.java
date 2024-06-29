import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class193 extends class359 {

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lfi;")
    public static class331 field2629 = new class331(5);

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Ljf;")
    public static class119 field2632 = null;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
    public static int[] field2635 = new int[50];

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2641 = "Loading textures - ";

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "J")
    public static long field2642 = -1L;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Ljf;")
    public static class119 field2639;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
    public static int[] field2634;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
    public static int[] field2638;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static void method1231(byte arg0) {
        field2632 = null;
        field2638 = null;
        field2641 = null;
        field2629 = null;
        field2639 = null;
        field2635 = null;
        if (arg0 <= -125) {
            field2634 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILam;)V")
    public static final void method1232(int arg0, class378 arg1) {
        field2630++;
        class167 var2 = null;
        try {
            class241 var3 = arg1.method2398((byte) -91);
            while (var3.field3268 == 0) {
                class278.method1757(1L, arg0 ^ 0x6CE3);
            }
            if (arg0 != 27875) {
                return;
            }
            if (var3.field3268 == 1) {
                var2 = (class167) var3.field3270;
                class211 var4 = class353.method2246(0);
                var2.method1103(arg0 ^ 0xFFFF931C, var4.field2888, 0, var4.field2867);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1107((byte) -127);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIII)V")
    public static final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class81 var5 = (class81) class310.field4420.method1124(-1); var5 != null; var5 = (class81) class310.field4420.method1119(false)) {
            class379.method2407(arg2, arg1, arg0, var5, 2, arg4);
        }
        field2636++;
        int var6 = 51 % ((-arg3 - 39) / 46);
        for (class81 var7 = (class81) class182.field2495.method1124(-1); var7 != null; var7 = (class81) class182.field2495.method1119(false)) {
            byte var12 = 1;
            class270 var13 = var7.field914.method2697((byte) 93);
            if (var7.field914.field6335) {
                var12 = 0;
            } else if (var7.field914.field6265 == var13.field3798 || var7.field914.field6265 == var13.field3815 || var7.field914.field6265 == var13.field3835 || var7.field914.field6265 == var13.field3822) {
                var12 = 2;
            } else if (var7.field914.field6265 == var13.field3824 || var7.field914.field6265 == var13.field3811 || var7.field914.field6265 == var13.field3804 || var7.field914.field6265 == var13.field3800) {
                var12 = 3;
            }
            if (var7.field922 != var12) {
                int var14 = class311.method1953(var7.field914, 0);
                if (var7.field915 != var14) {
                    if (var7.field909 != null) {
                        class135.field1884.method2807(var7.field909);
                        var7.field909 = null;
                    }
                    var7.field915 = var14;
                }
                var7.field922 = var12;
            }
            var7.field911 = var7.field914.field1304;
            var7.field918 = var7.field914.field1304 + var7.field914.method786((byte) 70) * 64;
            var7.field902 = var7.field914.field1311;
            var7.field904 = var7.field914.field1311 + (var7.field914.method786((byte) 70) * 64);
            class379.method2407(arg2, arg1, arg0, var7, 2, arg4);
        }
        for (class81 var8 = (class81) class201.field2777.method1212(-28); var8 != null; var8 = (class81) class201.field2777.method1207(false)) {
            byte var9 = 1;
            class270 var10 = var8.field912.method2697((byte) 93);
            if (var8.field912.field6335) {
                var9 = 0;
            } else if (var8.field912.field6265 == var10.field3798 || var8.field912.field6265 == var10.field3815 || var8.field912.field6265 == var10.field3835 || var8.field912.field6265 == var10.field3822) {
                var9 = 2;
            } else if (var8.field912.field6265 == var10.field3824 || var8.field912.field6265 == var10.field3811 || var8.field912.field6265 == var10.field3804 || var8.field912.field6265 == var10.field3800) {
                var9 = 3;
            }
            if (var8.field922 != var9) {
                int var11 = class291.method1858((byte) 109, var8.field912);
                if (var8.field915 != var11) {
                    if (var8.field909 != null) {
                        class135.field1884.method2807(var8.field909);
                        var8.field909 = null;
                    }
                    var8.field915 = var11;
                }
                var8.field922 = var9;
            }
            var8.field911 = var8.field912.field1304;
            var8.field918 = var8.field912.field1304 + (var8.field912.method786((byte) 70) * 64);
            var8.field902 = var8.field912.field1311;
            var8.field904 = var8.field912.field1311 + (var8.field912.method786((byte) 70) * 64);
            class379.method2407(arg2, arg1, arg0, var8, 2, arg4);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILbo;IIII)V")
    public static final void method1234(int arg0, int arg1, class433 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 80) {
            method1235((byte) -114, -16, 88);
        }
        field2637++;
        class55.method321(arg6, arg2.field1311, arg0, arg5, arg2.field1304, 0, arg4, arg3, (byte) 101);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)I")
    public static final int method1235(byte arg0, int arg1, int arg2) {
        if (arg0 != 122) {
            method1235((byte) 71, 14, -6);
        }
        field2633++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class193() {
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
    public static final void method1236(int arg0, boolean arg1) {
        if (arg1 && class106.field1202 != null) {
            class269.field3787 = class106.field1202.field1051;
        } else {
            class269.field3787 = -1;
        }
        field2640++;
        class38.field390 = null;
        class173.field2404 = 0;
        class106.field1202 = null;
        class188.field2550 = null;
        class106.method576();
        class106.field1208.method1116((byte) -125);
        class130.field1801 = null;
        class157.field2232 = null;
        class417.field5985 = null;
        class148.field2078 = null;
        if (arg0 != 4079) {
            return;
        }
        class366.field5351 = null;
        class342.field5027 = -1;
        class237.field3225 = -1;
        class382.field5613 = null;
        class45.field550 = null;
        class81.field924 = null;
        class393.field5747 = null;
        class106.field1210 = null;
        class108.method597(14958);
        class95.field1067 = null;
        class57.method337(128, (byte) 109, 64);
        class204.method1302(64, 64, (byte) 53);
        class133.method795(64, (byte) 29);
        class54.method314(64, 0);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    public class193(int arg0) {
        this.field2631 = arg0;
    }
}
