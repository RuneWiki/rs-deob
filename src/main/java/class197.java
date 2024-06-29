import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class197 extends class265 {

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    private int field3173;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    private int field3156;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    private int field3152;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    private int field3159;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    private int field3162;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    private int field3171;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    private int field3153;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lwm;")
    public static class152 field3151 = class157.method1048(")2", 101);

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lwm;")
    private static class152 field3166 = class157.method1048("M", 96);

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "Lwm;")
    public static class152 field3169 = field3166;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Lwm;")
    public static class152 field3163 = field3166;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Lwm;")
    public static class152 field3172 = class157.method1048(")1a2)1m", 97);

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Lah;")
    public static class205 field3161;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)V", line = 12)
    public final void method248(byte arg0, int arg1, int arg2) {
        field3165++;
        int var4 = 76 % ((arg0 - 22) / 52);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 37)
    public class197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3173 = arg5;
        this.field3156 = arg6;
        this.field3152 = arg7;
        this.field3159 = arg4;
        this.field3162 = arg3;
        this.field3171 = arg2;
        this.field3153 = arg1;
        this.field3170 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 58)
    public static void method1312(byte arg0) {
        field3169 = null;
        if (arg0 < 8) {
            method1315(57, -75);
        }
        field3151 = null;
        field3172 = null;
        field3166 = null;
        field3163 = null;
        field3161 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lhi;I)V", line = 74)
    public static final void method1313(class291 arg0, int arg1) {
        field3168++;
        if (arg0.field4950.length - arg0.field4946 < 1) {
            return;
        }
        int var2 = arg0.method2011(-46);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field4950.length - arg0.field4946 < var3) {
            return;
        }
        class87.field1228 = arg0.method2011(arg1 + 5);
        if (class87.field1228 < 1) {
            class87.field1228 = 1;
        } else if (class87.field1228 > 4) {
            class87.field1228 = 4;
        }
        class154.method1030(arg0.method2011(arg1 + 3) == 1, arg1 ^ 0xC);
        class289.field4906 = arg0.method2011(-67) == 1;
        class199.field3209 = arg0.method2011(-22) == 1;
        class205.field3352 = arg0.method2011(-113) == 1;
        class211.field3427 = arg0.method2011(arg1 + 47) == 1;
        class15.field209 = arg0.method2011(-113) == 1;
        class92.field1307 = arg0.method2011(-45) == 1;
        class33.field539 = arg0.method2011(-57) == 1;
        class239.field3919 = arg0.method2011(-118);
        if (arg1 != -97) {
            field3166 = (class152) null;
        }
        if (class239.field3919 > 2) {
            class239.field3919 = 2;
        }
        if (var2 >= 2) {
            class81.field1131 = arg0.method2011(arg1 - 3) == 1;
        } else {
            class81.field1131 = arg0.method2011(-82) == 1;
            arg0.method2011(-80);
        }
        class100.field1454 = arg0.method2011(-22) == 1;
        class236.field3870 = arg0.method2011(-105) == 1;
        class140.field2135 = arg0.method2011(-110);
        if (class140.field2135 > 2) {
            class140.field2135 = 2;
        }
        class225.field3657 = class140.field2135;
        class28.field484 = arg0.method2011(arg1 ^ 0x4F) == 1;
        class224.field3637 = arg0.method2011(arg1 ^ 0x27);
        if (class224.field3637 > 127) {
            class224.field3637 = 127;
        }
        class6.field93 = arg0.method2011(-81);
        class72.field1048 = arg0.method2011(arg1 ^ 0x3);
        if (class72.field1048 > 127) {
            class72.field1048 = 127;
        }
        if (var2 >= 1) {
            class15.field211 = arg0.method2021((byte) 74);
            class179.field2848 = arg0.method2021((byte) 74);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method2011(-82);
        }
        if (var2 >= 4) {
            int var4 = arg0.method2011(-91);
            if (class6.field96 < 96) {
                var4 = 0;
            }
            class47.method324(var4);
        }
        if (var2 >= 5) {
            class243.field4023 = arg0.method1969((byte) -16);
        }
        if (var2 >= 6) {
            class167.field2632 = arg0.method2011(arg1 ^ 0x3D);
        }
        if (var2 >= 7) {
            class20.field270 = arg0.method2011(-109) == 1;
        }
        if (var2 >= 8) {
            class259.field4438 = arg0.method2011(-61) == 1;
        }
        if (var2 >= 9) {
            class253.field4386 = arg0.method2011(-43);
        }
        if (var2 >= 10) {
            class40.field651 = arg0.method2011(-54) != 0;
        }
        if (var2 >= 11) {
            class169.field2651 = arg0.method2011(-128) != 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILwm;)I", line = 234)
    public static final int method1314(int arg0, class152 arg1) {
        field3164++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class199.field3206; var2++) {
            if (arg1.method995(-73, class176.field2838[var2])) {
                return var2;
            }
        }
        if (arg0 != -1) {
            field3167 = 25;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V", line = 260)
    public final void method243(int arg0, int arg1, int arg2) {
        if (arg2 > -113) {
            this.field3156 = 104;
        }
        field3155++;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V", line = 281)
    public final void method247(int arg0, int arg1, int arg2) {
        field3150++;
        int var4 = this.field3170 * arg1 >> 12;
        int var5 = this.field3153 * arg0 >> 12;
        int var6 = this.field3171 * arg1 >> 12;
        int var7 = this.field3162 * arg0 >> 12;
        int var8 = this.field3173 * arg0 >> 12;
        int var9 = this.field3159 * arg1 >> 12;
        int var10 = this.field3156 * arg1 >> 12;
        int var11 = this.field3152 * arg0 >> 12;
        class311.method2152(var9, var7, var11, var6, -101, var8, var4, var5, this.field4472, var10);
        if (arg2 < 86) {
            this.field3153 = -100;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Z", line = 310)
    public static final boolean method1315(int arg0, int arg1) {
        field3157++;
        if (arg0 != 71) {
            return true;
        } else if (class132.field2005[arg1]) {
            return true;
        } else if (class23.field408.method1363(arg1, (byte) 93)) {
            int var2 = class23.field408.method1375(arg1, 0);
            if (var2 == 0) {
                class132.field2005[arg1] = true;
                return true;
            }
            if (class215.field3501[arg1] == null) {
                class215.field3501[arg1] = new class127[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class215.field3501[arg1][var3] == null) {
                    byte[] var4 = class23.field408.method1381(arg1, var3, arg0 - 71);
                    if (var4 != null) {
                        class127 var5 = class215.field3501[arg1][var3] = new class127();
                        var5.field1868 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method808(new class291(var4), (byte) -37);
                        } else {
                            var5.method803(arg0 - 71, new class291(var4));
                        }
                    }
                }
            }
            class132.field2005[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
