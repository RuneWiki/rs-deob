import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class204 extends class438 {

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    private int field2795;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    private int field2807;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    private int field2798;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "[I")
    public static int[] field2792 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field2796 = 0;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field2809 = 0;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "S")
    public static short field2812 = 32767;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "Z")
    public static boolean field2814 = false;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "F")
    public static float field2793;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    private int field2797;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    private int field2804;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    private int field2806;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    private int field2810;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "Lnq;")
    public static class268 field2813;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "[B")
    private byte[] field2791;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V", line = 4)
    public static void method1323(int arg0) {
        field2792 = null;
        if (arg0 == -17575) {
            field2813 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V", line = 18)
    public final void method1033(int arg0) {
        this.field2806 >>= arg0;
        this.field2811 = this.field2798;
        field2800++;
        if (this.field2806 < 0) {
            this.field2806 = 0;
        } else if (this.field2806 > 255) {
            this.field2806 = 255;
        }
        this.method1206(this.field2797++, (byte) this.field2806);
        this.field2806 = 0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBLkh;)Ljava/lang/String;", line = 37)
    public static final String method1324(int arg0, byte arg1, class11 arg2) {
        field2801++;
        try {
            if (arg1 > -53) {
                method1324(83, (byte) 3, (class11) null);
            }
            int var3 = arg2.method175(255);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field191 += class47.field660.method400((byte) 67, 0, arg2.field191, var4, var3, arg2.field230);
            return class286.method1868(var3, 0, (byte) 84, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V", line = 66)
    public void method1206(int arg0, byte arg1) {
        this.field2791[arg0] = arg1;
        field2816++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIII)Z", line = 77)
    public static final boolean method1325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2808++;
        int var6 = arg1;
        if (arg5 != -29394) {
            return false;
        }
        while (arg2 >= var6) {
            for (int var7 = arg3; var7 <= arg4; var7++) {
                if (class212.field2967[var6][var7] == arg0 && class2.field27[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(BI)Z", line = 122)
    public static final boolean method1326(byte arg0, int arg1) {
        field2815++;
        int var2 = 68 / ((arg0 + 38) / 48);
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 135)
    public static final void method1327(String arg0, byte arg1) {
        field2802++;
        if (arg0 == null) {
            return;
        }
        if (!(class272.field3777 < 100 || class349.field4802) || class272.field3777 >= 200) {
            class205.method1334(class76.field1092.method2763(25, class210.field2935), (byte) 92);
            return;
        }
        String var2 = class427.method2690(arg0, -23289);
        if (var2 == null) {
            return;
        }
        int var3 = 31 % ((-arg1 - 23) / 63);
        for (int var4 = 0; var4 < class272.field3777; var4++) {
            String var8 = class427.method2690(class288.field4045[var4], -23289);
            if (var8 != null && var8.equals(var2)) {
                class205.method1334(arg0 + class29.field484.method2763(-84, class210.field2935), (byte) 58);
                return;
            }
            if (class22.field398[var4] != null) {
                String var9 = class427.method2690(class22.field398[var4], -23289);
                if (var9 != null && var9.equals(var2)) {
                    class205.method1334(arg0 + class29.field484.method2763(-88, class210.field2935), (byte) 92);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class197.field2709; var5++) {
            String var6 = class427.method2690(class249.field3517[var5], -23289);
            if (var6 != null && var6.equals(var2)) {
                class205.method1334(class416.field5912.method2763(59, class210.field2935) + arg0 + class343.field4672.method2763(-85, class210.field2935), (byte) 47);
                return;
            }
            if (class245.field3464[var5] != null) {
                String var7 = class427.method2690(class245.field3464[var5], -23289);
                if (var7 != null && var7.equals(var2)) {
                    class205.method1334(class416.field5912.method2763(55, class210.field2935) + arg0 + class343.field4672.method2763(-85, class210.field2935), (byte) 127);
                    return;
                }
            }
        }
        if (class427.method2690(class412.field5841.field1922, -23289).equals(var2)) {
            class205.method1334(class394.field5644.method2763(50, class210.field2935), (byte) 122);
        } else {
            class46.field648.method1178(63, 245);
            class223.field3169++;
            class46.field648.method173(class273.method1782((byte) 25, arg0), 255);
            class46.field648.method160(arg0, false);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIFFF)V", line = 231)
    public class204(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2795 = (int) (arg6 * 4096.0F);
        this.field2807 = (int) (arg7 * 4096.0F);
        this.field2811 = this.field2798 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 243)
    public final void method1035(int arg0) {
        field2799++;
        this.field2797 = 0;
        if (arg0 != -416361076) {
            method1326((byte) 70, 106);
        }
        this.field2806 = 0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIB)Loo;", line = 257)
    public static final class374 method1328(int arg0, int arg1, int arg2, byte arg3) {
        field2794++;
        class125 var4 = class328.field4549[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class374 var5 = null;
        int var6 = -1;
        for (class123 var7 = var4.field1749; var7 != null; var7 = var7.field1711) {
            class447 var8 = var7.field1709;
            if (var8 instanceof class374) {
                class374 var9 = (class374) var8;
                int var10 = var9.method942(false) * 64 + 60 - 64;
                int var11 = var9.field6262 - var10 >> 7;
                int var12 = var9.field6266 - var10 >> 7;
                int var13 = var9.field6262 + var10 >> 7;
                int var14 = var9.field6266 + var10 >> 7;
                if (arg1 >= var11 && arg2 >= var12 && var13 >= arg1 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        if (arg3 != 35) {
            method1329(79, true, -13, -52, 39, -8, -68, -21, 38);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZIIIIIII)Z", line = 325)
    public static final boolean method1329(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2805++;
        if (arg1) {
            method1324(-35, (byte) 112, (class11) null);
        }
        if (arg6 < arg0 + arg7 && arg4 + arg6 > arg7) {
            return arg3 < arg2 + arg8 && arg8 < arg3 + arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V", line = 347)
    public final void method1036(int arg0, int arg1, int arg2) {
        field2803++;
        if (arg0 > -110) {
            return;
        }
        if (arg2 == 0) {
            this.field2804 = this.field2795 - (arg1 < 0 ? -arg1 : arg1);
            this.field2804 = this.field2804 * this.field2804 >> 12;
            this.field2810 = 4096;
            this.field2806 = this.field2804;
            return;
        }
        this.field2810 = this.field2807 * this.field2804 >> 12;
        this.field2804 = this.field2795 - (arg1 < 0 ? -arg1 : arg1);
        if (this.field2810 < 0) {
            this.field2810 = 0;
        } else if (this.field2810 > 4096) {
            this.field2810 = 4096;
        }
        this.field2804 = this.field2804 * this.field2804 >> 12;
        this.field2804 = this.field2810 * this.field2804 >> 12;
        this.field2806 += this.field2811 * this.field2804 >> 12;
        this.field2811 = this.field2811 * this.field2798 >> 12;
    }
}
