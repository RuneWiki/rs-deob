import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class179 extends class248 {

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    private int field2804 = -1;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Z")
    private boolean field2809 = false;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    private int field2796 = 0;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    private int field2822 = 0;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Z")
    public boolean field2805 = false;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    private int field2812 = -32768;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    private int field2817;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lqk;")
    private class57 field2797;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2800 = "Use";

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Lal;")
    public static class307 field2810;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Lom;")
    private class65 field2823;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "[Ljb;")
    public static class27[] field2824;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZZIILrb;Lrb;)I")
    public static final int method1265(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, class210 arg5, class210 arg6) {
        if (arg2) {
            field2801 = -16;
        }
        field2795++;
        int var7 = class263.method1846(arg5, arg0, arg3, (byte) 111, arg6);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class263.method1846(arg5, arg1, arg4, (byte) 127, arg6);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIII)V")
    public static final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2802++;
        if (arg2 >= class115.field1678 && arg2 <= class60.field882) {
            int var5 = class196.method1369(class187.field2938, arg0, true, class56.field816);
            int var6 = class196.method1369(class187.field2938, arg1, true, class56.field816);
            class8.method47(var6, arg3, arg2, (byte) -109, var5);
        }
        if (arg4 != 3) {
            field2800 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
    public final int method4() {
        field2808++;
        return this.field2812;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1267(int arg0, int[] arg1) {
        field2825++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        if (arg0 == -3119) {
            class103.method692(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Lqj;")
    public static final class240 method1268(int arg0, int arg1) {
        field2811++;
        class240 var2 = (class240) class23.field291.method1517((long) arg0, (byte) 117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class180.field2828.method501(-2, arg0, arg1);
        class240 var4 = new class240();
        if (var3 != null) {
            var4.method1694(-92, arg0, new class170(var3));
        }
        class23.field291.method1518(var4, (long) arg0, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
    public final void method1269(byte arg0, int arg1) {
        field2813++;
        if (this.field2805) {
            return;
        }
        this.field2796 += arg1;
        int var3 = -90 % ((arg0 + 39) / 59);
        while (this.field2796 > this.field2797.field828[this.field2822]) {
            this.field2796 -= this.field2797.field828[this.field2822];
            this.field2822++;
            if (this.field2797.field850.length <= this.field2822) {
                this.field2805 = true;
                break;
            }
        }
        if (!this.field2805) {
            class173.method1240(this.field2799, this.field2806, -9160, false, this.field2797, this.field2822);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)I")
    public static final int method1270(byte arg0, int arg1) {
        field2821++;
        return arg0 == 90 ? arg1 & 0x3FF : 121;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIILfe;)V")
    public static final void method1271(int arg0, boolean arg1, int arg2, int arg3, class231 arg4) {
        field2816++;
        int var5 = arg4.field3730;
        if (arg0 != 31582) {
            method1267(-72, (int[]) null);
        }
        if (arg4.field3591 == 0) {
            arg4.field3730 = arg4.field3603;
        } else if (arg4.field3591 == 1) {
            arg4.field3730 = arg3 - arg4.field3603;
        } else if (arg4.field3591 == 2) {
            arg4.field3730 = arg4.field3603 * arg3 >> 14;
        } else if (arg4.field3591 == 3) {
            if (arg4.field3620 == 2) {
                arg4.field3730 = (arg4.field3603 - 1) * arg4.field3699 + arg4.field3603 * 32;
            } else if (arg4.field3620 == 7) {
                arg4.field3730 = (arg4.field3603 - 1) * arg4.field3699 + arg4.field3603 * 115;
            }
        }
        int var6 = arg4.field3686;
        if (arg4.field3693 == 0) {
            arg4.field3686 = arg4.field3592;
        } else if (arg4.field3693 == 1) {
            arg4.field3686 = arg2 - arg4.field3592;
        } else if (arg4.field3693 == 2) {
            arg4.field3686 = arg4.field3592 * arg2 >> 14;
        } else if (arg4.field3693 == 3) {
            if (arg4.field3620 == 2) {
                arg4.field3686 = (arg4.field3592 - 1) * arg4.field3714 + arg4.field3592 * 32;
            } else if (arg4.field3620 == 7) {
                arg4.field3686 = arg4.field3592 * 12 + ((arg4.field3592 - 1) * arg4.field3714);
            }
        }
        if (arg4.field3591 == 4) {
            arg4.field3730 = arg4.field3686 * arg4.field3664 / arg4.field3655;
        }
        if (arg4.field3693 == 4) {
            arg4.field3686 = arg4.field3730 * arg4.field3655 / arg4.field3664;
        }
        if (class107.field1563 && (client.method1698(arg4).field367 != 0 || arg4.field3620 == 0)) {
            if (arg4.field3686 < 5 && arg4.field3730 < 5) {
                arg4.field3730 = 5;
                arg4.field3686 = 5;
            } else {
                if (arg4.field3686 <= 0) {
                    arg4.field3686 = 5;
                }
                if (arg4.field3730 <= 0) {
                    arg4.field3730 = 5;
                }
            }
        }
        if (arg4.field3563 == 1337) {
            class41.field500 = arg4;
        }
        if (arg1 && arg4.field3709 != null && arg4.field3730 != var5 || arg4.field3686 != var6) {
            class122 var7 = new class122();
            var7.field1752 = arg4;
            var7.field1755 = arg4.field3709;
            class84.field1294.method1540(var7, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static final void method1272(byte arg0) {
        field2814++;
        class104.field1515 = 0;
        int var1 = (class214.field3347.field3915 >> 7) + class113.field1653;
        int var2 = (class214.field3347.field3920 >> 7) + class5.field77;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class104.field1515 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class104.field1515 = 1;
        }
        if (class104.field1515 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class104.field1515 = 0;
        }
        if (arg0 != 27) {
            method1270((byte) -25, -45);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIIJILom;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field2803++;
        class208 var13 = this.method1275(54);
        if (var13 != null) {
            this.method1273(var13, 123);
            var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2823);
            this.field2812 = var13.method4();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lli;I)V")
    private final void method1273(class208 arg0, int arg1) {
        field2807++;
        class51 var3 = (class51) arg0;
        if ((this.field2823 == null || this.field2823.field933) && (var3.field653 != null || var3.field665 != null)) {
            this.field2823 = new class65(class311.field4996, 1, 1);
        }
        if (this.field2823 != null) {
            this.field2823.method427(var3.field653, var3.field665, false, var3.field647, var3.field649, var3.field673);
        }
        if (arg1 > 107) {
            this.field2809 = true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2820++;
        if (!this.field2809) {
            class208 var6 = this.method1275(53);
            if (var6 == null) {
                return;
            }
            this.method1273(var6, 109);
        }
        if (this.field2823 != null) {
            this.field2823.method416(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method1274(int arg0) {
        field2810 = null;
        field2800 = null;
        if (arg0 < -24) {
            field2824 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Lli;")
    private final class208 method1275(int arg0) {
        if (arg0 < 1) {
            return null;
        }
        field2815++;
        class214 var2 = class92.method629(this.field2817, 12288);
        class208 var3;
        if (this.field2805) {
            var3 = var2.method1500(0, -1, -1, (byte) -83);
        } else {
            var3 = var2.method1500(this.field2796, this.field2822, this.field2804, (byte) -100);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIIII)V")
    public class179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2806 = arg3;
        this.field2819 = arg4;
        this.field2818 = arg1;
        this.field2798 = arg5 + arg6;
        this.field2817 = arg0;
        this.field2799 = arg2;
        int var8 = class92.method629(this.field2817, 12288).field3338;
        if (var8 == -1) {
            this.field2805 = true;
        } else {
            this.field2805 = false;
            this.field2797 = class174.method1241(-126, var8);
        }
        if (this.field2798 == arg6) {
            class173.method1240(this.field2799, this.field2806, -9160, false, this.field2797, this.field2822);
        }
    }
}
