import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class185 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "B")
    private byte field2972;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "B")
    public byte field2981;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
    public int[] field2977;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
    public int[] field2986;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    public int[] field2973;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "S")
    public short field2979;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "S")
    public short field2969;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "S")
    public short field2978;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "S")
    private short field2974;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[S")
    public short[] field2983;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[S")
    public short[] field2976;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[S")
    public short[] field2982;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lqfa;")
    public static class85 field2975 = new class85(111, -2);

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "[Li;")
    public static class37[] field2987;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JI)V")
    public static final void method1354(long arg0, int arg1) {
        field2985++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % (long) arg1) == 0L) {
            class249.method1675(false, arg0 - 1L);
            class249.method1675(false, 1L);
        } else {
            class249.method1675(false, arg0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILsb;Lrh;)Lmu;")
    public static final class275 method1355(int arg0, class266 arg1, class244 arg2) {
        field2980++;
        class275 var3 = class426.method2590((byte) 78);
        var3.field4108 = arg1;
        var3.field4102 = arg1.field3944;
        if (var3.field4102 == -1) {
            var3.field4103 = new class641(260);
        } else if (var3.field4102 == -2) {
            var3.field4103 = new class641(10000);
        } else if (var3.field4102 <= 18) {
            var3.field4103 = new class641(20);
        } else if (var3.field4102 > 98) {
            var3.field4103 = new class641(260);
        } else {
            var3.field4103 = new class641(100);
        }
        var3.field4103.method3652(-96799165, arg2);
        var3.field4103.method3654(arg0 - 108, var3.field4108.method1739((byte) -103));
        var3.field4104 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field2987 = null;
        field2975 = null;
        if (arg0 != -1) {
            field2975 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Loe;Lr;II)V")
    public static final void method1357(class185 arg0, class167 arg1, int arg2, int arg3) {
        field2970++;
        if (class413.field5995 != null && arg2 <= arg0.field2972) {
            for (int var4 = 0; var4 < class413.field5995.length; var4++) {
                if (class413.field5995[var4] != -1000000 && (arg0.field2977[0] <= class413.field5995[var4] || arg0.field2977[1] <= class413.field5995[var4] || class413.field5995[var4] >= arg0.field2977[2] || class413.field5995[var4] >= arg0.field2977[3]) && (arg0.field2973[0] <= class149.field2559[var4] || class149.field2559[var4] >= arg0.field2973[1] || class149.field2559[var4] >= arg0.field2973[2] || class149.field2559[var4] >= arg0.field2973[3]) && (arg0.field2973[0] >= class532.field7459[var4] || arg0.field2973[1] >= class532.field7459[var4] || arg0.field2973[2] >= class532.field7459[var4] || class532.field7459[var4] <= arg0.field2973[3]) && (arg0.field2986[0] <= class706.field9938[var4] || class706.field9938[var4] >= arg0.field2986[1] || arg0.field2986[2] <= class706.field9938[var4] || class706.field9938[var4] >= arg0.field2986[3]) && (arg0.field2986[0] >= class689.field9740[var4] || arg0.field2986[1] >= class689.field9740[var4] || arg0.field2986[2] >= class689.field9740[var4] || class689.field9740[var4] <= arg0.field2986[3])) {
                    return;
                }
            }
        }
        if (arg0.field2981 == 1) {
            int var5 = class643.field9239 + arg0.field2979 - class547.field7768;
            if (var5 >= 0 && var5 <= (class643.field9239 + class643.field9239)) {
                int var6 = arg0.field2978 + class643.field9239 - class318.field4685;
                if (var6 < 0) {
                    var6 = 0;
                } else if ((class643.field9239 + class643.field9239) < var6) {
                    return;
                }
                int var7 = class643.field9239 + arg0.field2974 - class318.field4685;
                if (class643.field9239 + class643.field9239 < var7) {
                    var7 = class643.field9239 + class643.field9239;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class224.field3361[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class316.field4656 - arg0.field2973[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class413.field5975) && class157.method1216((byte) 123, 0, arg0) && class157.method1216((byte) 123, 1, arg0) && class157.method1216((byte) 123, 2, arg0) && class157.method1216((byte) 123, 3, arg0)) {
                        class177.field2890[class389.field5685++] = arg0;
                    }
                }
            }
        } else if (arg0.field2981 == 2) {
            int var10 = arg0.field2978 + class643.field9239 - class318.field4685;
            if (var10 >= 0 && var10 <= (class643.field9239 + class643.field9239)) {
                int var11 = arg0.field2979 + class643.field9239 - class547.field7768;
                if (var11 < 0) {
                    var11 = 0;
                } else if (class643.field9239 + class643.field9239 < var11) {
                    return;
                }
                int var12 = arg0.field2969 - (class547.field7768 - class643.field9239);
                if ((class643.field9239 + class643.field9239) < var12) {
                    var12 = class643.field9239 + class643.field9239;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class224.field3361[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class398.field5801 - arg0.field2986[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class413.field5975 > var14) && class157.method1216((byte) 123, 0, arg0) && class157.method1216((byte) 123, 1, arg0) && class157.method1216((byte) 123, 2, arg0) && class157.method1216((byte) 123, 3, arg0)) {
                        class177.field2890[class389.field5685++] = arg0;
                    }
                }
            }
        } else if (arg0.field2981 == 16 || arg0.field2981 == 8) {
            int var23 = class643.field9239 + arg0.field2979 - class547.field7768;
            if (var23 >= 0 && (class643.field9239 + class643.field9239) >= var23) {
                int var24 = arg0.field2978 - (class318.field4685 - class643.field9239);
                if (var24 >= 0 && (class643.field9239 + class643.field9239) >= var24 && class224.field3361[var23][var24]) {
                    float var25 = (float) (class316.field4656 - arg0.field2973[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class398.field5801 - arg0.field2986[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!(var25 < (float) class413.field5975) || !((float) class413.field5975 > var26) && class157.method1216((byte) 123, 0, arg0) && class157.method1216((byte) 123, 1, arg0) && class157.method1216((byte) 123, 2, arg0) && class157.method1216((byte) 123, 3, arg0)) {
                        class177.field2890[class389.field5685++] = arg0;
                    }
                }
            }
        } else {
            if (arg3 <= 66) {
                field2975 = null;
            }
            if (arg0.field2981 == 4) {
                float var15 = (float) (arg0.field2977[0] - class413.field5990);
                if (!((float) class536.field7510 >= var15)) {
                    int var16 = arg0.field2978 + class643.field9239 - class318.field4685;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if ((class643.field9239 + class643.field9239) < var16) {
                        return;
                    }
                    int var17 = class643.field9239 + arg0.field2974 - class318.field4685;
                    if (var17 > class643.field9239 + class643.field9239) {
                        var17 = class643.field9239 + class643.field9239;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = arg0.field2979 + class643.field9239 - class547.field7768;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > class643.field9239 + class643.field9239) {
                        return;
                    }
                    int var19 = arg0.field2969 + class643.field9239 - class547.field7768;
                    if ((class643.field9239 + class643.field9239) < var19) {
                        var19 = class643.field9239 + class643.field9239;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label296: for (int var21 = var18; var21 <= var19; var21++) {
                        for (int var22 = var16; var22 <= var17; var22++) {
                            if (class224.field3361[var21][var22]) {
                                var20 = true;
                                break label296;
                            }
                        }
                    }
                    if (var20 && class157.method1216((byte) 123, 0, arg0) && class157.method1216((byte) 123, 1, arg0) && class157.method1216((byte) 123, 2, arg0) && class157.method1216((byte) 123, 3, arg0)) {
                        class177.field2890[class389.field5685++] = arg0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBII[BI)Z")
    public static final boolean method1358(int arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field2971++;
        int var7 = arg4 % arg6;
        if (arg2 < 90) {
            return true;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg1 - (1 - arg6)) / arg6);
        int var10 = -((arg4 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg3] == 0) {
                    return true;
                }
                arg3 += arg6;
            }
            int var13 = arg3 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2972 = (byte) arg1;
        this.field2981 = (byte) arg0;
        this.field2977 = new int[4];
        this.field2986 = new int[4];
        this.field2973 = new int[4];
        this.field2973[1] = arg3;
        this.field2973[2] = arg4;
        this.field2973[3] = arg5;
        this.field2973[0] = arg2;
        this.field2977[1] = arg7;
        this.field2977[0] = arg6;
        this.field2977[3] = arg9;
        this.field2977[2] = arg8;
        this.field2979 = (short) (arg2 >> class30.field940);
        this.field2986[0] = arg10;
        this.field2986[2] = arg12;
        this.field2986[3] = arg13;
        this.field2986[1] = arg11;
        this.field2969 = (short) (arg4 >> class30.field940);
        this.field2978 = (short) (arg10 >> class30.field940);
        this.field2974 = (short) (arg12 >> class30.field940);
        this.field2983 = new short[4];
        this.field2976 = new short[4];
        this.field2982 = new short[4];
    }
}
