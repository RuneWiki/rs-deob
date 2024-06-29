import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class61 {

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public int field766 = -1;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[[S")
    public static short[][] field767 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Ljava/lang/String;")
    public static String field770 = "flash2:";

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Ljl;")
    public class20 field761;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[I")
    public int[] field768;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field763;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIBI)I", line = 14)
    public static final int method448(int arg0, int arg1, byte arg2, int arg3) {
        field771++;
        if ((class9.field101[arg1][arg3][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class9.field101[1][arg3][arg0] & 0x2) == 0) {
            int var4 = 70 % ((arg2 - 52) / 39);
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 37)
    public static final String method449(boolean arg0) {
        field764++;
        if (!arg0) {
            method451((byte) -26);
        }
        String var1;
        if (class339.field5304 == 1 && class66.field853 < 2) {
            var1 = class160.field2293 + class91.field1156 + class99.field1301 + " ->";
        } else if (class276.field3954 && class66.field853 < 2) {
            var1 = class351.field5485 + class91.field1156 + class339.field5277 + " ->";
        } else if (class226.field3257 && class143.field1991[81] && class66.field853 > 2) {
            var1 = class28.method184((byte) 98, class66.field853 - 2);
        } else {
            var1 = class28.method184((byte) 95, class66.field853 - 1);
        }
        if (class66.field853 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class66.field853 - 2) + class106.field1379;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILfg;Lho;)V", line = 69)
    public static final void method450(int arg0, class352 arg1, class287 arg2) {
        class153 var3 = arg2.method1966((byte) -120);
        field762++;
        if (var3 == null) {
            return;
        }
        int var4 = var3.field2024;
        if (var3.field2029 > var3.field2024) {
            var4 = var3.field2029;
        }
        int var5 = arg1.field5501;
        int var6 = arg1.field5497;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (arg2.field4136 != null) {
            var7 = class327.field4771.method1919(arg2.field4136, (int[]) null, class356.field5571);
            for (int var10 = 0; var10 < var7; var10++) {
                String var11 = class356.field5571[var10];
                if ((var7 - 1) > var10) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class288.field4163.method2015(var11);
                if (var8 < var12) {
                    var8 = var12;
                }
            }
            var9 = (var7 - 1) * class288.field4163.method2021() + class288.field4163.method2017() / 2;
        }
        int var13 = arg1.field5501;
        if ((class38.field475 + var4) > var5) {
            var5 = class38.field475 + var4;
            var13 = var8 / 2 + var4 / 2 + class38.field475 + var4 + 5;
        } else if (class38.field476 - var4 < var5) {
            var13 = class38.field476 - var4 / 2 - var4 - var8 / 2 - 5;
            var5 = class38.field476 - var4;
        }
        int var14 = arg1.field5497 - var9 / 2;
        if (var6 < class38.field472 + var4) {
            var6 = class38.field472 + var4;
            var14 = var4 / 2 + var4 + (class38.field472 - -class288.field4163.method2021());
        } else if ((class38.field479 - var4) < var6) {
            var14 = class38.field479 - var4 - (var4 / 2 + var9);
            var6 = class38.field479 - var4;
        }
        int var15 = -2;
        int var16 = -2;
        int var17 = var4 >> 1;
        int var18 = -2;
        if (arg0 != 10) {
            return;
        }
        int var19 = (int) (Math.atan2((double) (var5 - arg1.field5501), (double) (var6 - arg1.field5497)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        int var20 = -2;
        var3.method1179(var3.field2028 << 3, var3.field2026 << 3, (var5 << 4) + var17, (var6 << 4) + var17, var19, 4096);
        if (arg2.field4136 != null) {
            var16 = var14 - class288.field4163.method2017() - 3;
            var15 = var13 - (var8 / 2) - 5;
            var20 = var7 * class288.field4163.method2021() + var16;
            var18 = var15 + var8 + 10;
            if (arg2.field4125 != 0) {
                class37.method239(var15, var16, var18 - var15, -var16 + var20, arg2.field4125, arg2.field4125 >>> 24);
            }
            if (arg2.field4134 != 0) {
                class37.method247(var15, var16, var18 - var15, -var16 + var20, arg2.field4134, arg2.field4134 >>> 24);
            }
            for (int var21 = 0; var21 < var7; var21++) {
                String var22 = class356.field5571[var21];
                if (var21 < var7 - 1) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class288.field4163.method2019(var22, var13, var14, arg2.field4142, true);
                var14 += class288.field4163.method2021();
            }
        }
        if (class105.field1361 <= var5 - var17 || var5 + var17 <= class105.field1361 || class80.field1028 <= (var6 - var17) || class80.field1028 >= var6 + var17 && class105.field1361 <= var15 || var18 <= class105.field1361 || var16 >= class80.field1028 || class80.field1028 >= var20) {
            return;
        }
        if (arg2.field4132[4] != null) {
            class148.method1140((long) arg1.field5493, 0, 0, arg2.field4130, arg2.field4132[4], (short) 1011, -1, (byte) -68);
        }
        if (arg2.field4132[3] != null) {
            class148.method1140((long) arg1.field5493, 0, 0, arg2.field4130, arg2.field4132[3], (short) 1003, -1, (byte) -116);
        }
        if (arg2.field4132[2] != null) {
            class148.method1140((long) arg1.field5493, 0, 0, arg2.field4130, arg2.field4132[2], (short) 1008, -1, (byte) -97);
        }
        if (arg2.field4132[1] != null) {
            class148.method1140((long) arg1.field5493, 0, 0, arg2.field4130, arg2.field4132[1], (short) 1002, -1, (byte) -65);
        }
        if (arg2.field4132[0] != null) {
            class148.method1140((long) arg1.field5493, 0, 0, arg2.field4130, arg2.field4132[0], (short) 1012, -1, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 228)
    public static void method451(byte arg0) {
        field767 = (short[][]) null;
        int var1 = -113 / ((-arg0 - 22) / 46);
        field770 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)I", line = 239)
    public static final int method452(int arg0, int arg1, int arg2, int arg3) {
        field769++;
        int var4 = arg2 / arg3;
        if (arg1 != 0) {
            method450(-91, (class352) null, (class287) null);
        }
        int var5 = arg3 - 1 & arg2;
        int var6 = arg0 / arg3;
        int var7 = arg3 - 1 & arg0;
        int var8 = class135.method1027((byte) -75, var6, var4);
        int var9 = class135.method1027((byte) -67, var6, var4 + 1);
        int var10 = class135.method1027((byte) -71, var6 + 1, var4);
        int var11 = class135.method1027((byte) -72, var6 + 1, var4 + 1);
        int var12 = class161.method1229(arg3, var9, var8, var5, true);
        int var13 = class161.method1229(arg3, var11, var10, var5, true);
        return class161.method1229(arg3, var13, var12, var7, true);
    }
}
