import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class259 {

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Ljf;")
    public static class229 field4509 = class212.method1457((byte) 109, "headicons_pk");

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "[[S")
    public static short[][] field4512 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lek;")
    public static class185 field4506;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1841(byte arg0) {
        class100.field1762 = 0;
        class267.field4575 = 0;
        field4505++;
        class288.method2009(-76);
        class35.method311(-91);
        class136.method932(20333);
        int var1 = 118 % ((52 - arg0) / 56);
        class102.method683(-944426104);
        for (int var2 = 0; var2 < class267.field4575; var2++) {
            int var3 = class274.field4698[var2];
            if (class199.field3475 != class192.field3334[var3].field1962) {
                if (class192.field3334[var3].field640 > 0) {
                    class280.method1963(class192.field3334[var3], (byte) 84);
                }
                class192.field3334[var3] = null;
            }
        }
        if (class51.field902 != class171.field2972.field195) {
            throw new RuntimeException("gpp1 pos:" + class171.field2972.field195 + " psize:" + class51.field902);
        }
        for (int var4 = 0; var4 < class132.field2323; var4++) {
            if (class192.field3334[class90.field1652[var4]] == null) {
                throw new RuntimeException("gpp2 pos:" + var4 + " size:" + class132.field2323);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[II[IB)V", line = 58)
    public static final void method1842(int arg0, int[] arg1, int arg2, int[] arg3, byte arg4) {
        field4504++;
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if ((var7 + (var9 & 0x1)) < arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method1842(arg0, arg1, var6 - 1, arg3, (byte) -27);
            method1842(var6 + 1, arg1, arg2, arg3, (byte) -27);
        }
        if (arg4 != -27) {
            field4512 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZIIII)Lkb;", line = 117)
    public static final class35 method1843(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0) {
            field4509 = (class229) null;
        }
        field4507++;
        int var7 = (arg5 << 19) + (arg4 << 17) + (arg1 ? 65536 : 0) + arg3;
        long var8 = (long) arg2 * 3147483667L + (long) var7 * 3849834839L;
        class35 var10 = (class35) class277.field4760.method229(var8, -14);
        if (var10 != null) {
            return var10;
        }
        class227.field3898 = false;
        class35 var11 = class269.method1896(arg3, (byte) -14, arg1, arg4, arg2, arg5, false, false);
        if (var11 != null && !class227.field3898) {
            class277.field4760.method227(-25077, var11, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)I", line = 147)
    public static final int method1844(int arg0, boolean arg1) {
        double var2 = (double) ((arg0 & 0xFF4676) >> 16) / 256.0D;
        field4508++;
        if (arg1) {
            field4509 = (class229) null;
        }
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var6 > var2) {
            var8 = var6;
        }
        double var10 = 0.0D;
        double var12 = 0.0D;
        double var14 = var2;
        if (var6 < var2) {
            var14 = var6;
        }
        if (var14 > var4) {
            var14 = var4;
        }
        if (var4 > var8) {
            var8 = var4;
        }
        double var16 = (var8 + var14) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var8 != var14) {
            if (var16 < 0.5D) {
                var12 = (var8 - var14) / (var8 + var14);
            }
            if (var2 == var8) {
                var10 = (var6 - var4) / (var8 - var14);
            } else if (var6 == var8) {
                var10 = (var4 - var2) / (var8 - var14) + 2.0D;
            } else if (var4 == var8) {
                var10 = (var2 - var6) / (var8 - var14) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var12 = (var8 - var14) / (2.0D - var8 - var14);
            }
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var10 / 6.0D;
        int var21 = (int) (var12 * 256.0D);
        int var22 = (int) (var19 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 2 << 10) + (var21 >> 5 << 7) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V", line = 255)
    public static final void method1845() {
        if (class320.field5411 != null) {
            for (int var0 = 0; var0 < class320.field5411.length; var0++) {
                for (int var1 = 0; var1 < class170.field2971; var1++) {
                    for (int var2 = 0; var2 < class10.field119; var2++) {
                        class320.field5411[var0][var1][var2] = null;
                    }
                }
            }
        }
        class1.field1 = (class37[][]) null;
        if (class74.field1401 != null) {
            for (int var3 = 0; var3 < class74.field1401.length; var3++) {
                for (int var4 = 0; var4 < class170.field2971; var4++) {
                    for (int var5 = 0; var5 < class10.field119; var5++) {
                        class74.field1401[var3][var4][var5] = null;
                    }
                }
            }
        }
        class321.field5431 = (class37[][]) null;
        class312.field5247 = 0;
        if (class278.field4773 != null) {
            for (int var6 = 0; var6 < class312.field5247; var6++) {
                class278.field4773[var6] = null;
            }
        }
        if (class115.field2072 != null) {
            for (int var7 = 0; var7 < class303.field5153; var7++) {
                class115.field2072[var7] = null;
            }
            class303.field5153 = 0;
        }
        if (class318.field5372 != null) {
            for (int var8 = 0; var8 < class318.field5372.length; var8++) {
                class318.field5372[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 364)
    public static final int method1846(KeyEvent arg0, byte arg1) {
        field4511++;
        int var2 = arg0.getKeyChar();
        if (arg1 != 43) {
            field4512 = (short[][]) ((short[][]) null);
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lek;Lek;IBI)Lbm;", line = 392)
    public static final class138 method1847(class185 arg0, class185 arg1, int arg2, byte arg3, int arg4) {
        field4510++;
        int var5 = -81 % ((arg3 + 40) / 55);
        return class208.method1444(arg2, -28236, arg4, arg1) ? class44.method381(arg0.method1275(arg2, arg4, -5211), 3) : null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 406)
    public static void method1848(int arg0) {
        field4506 = null;
        field4512 = (short[][]) null;
        if (arg0 < 91) {
            method1848(-82);
        }
        field4509 = null;
    }
}
