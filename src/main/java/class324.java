import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class324 extends class456 {

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4860 = "";

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "Lat;")
    public static class412 field4865 = new class412();

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field4869 = 0;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "Lvt;")
    public static class260 field4867;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "[[I")
    public static int[][] field4870;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ltq;Lhm;IIIII)V")
    public static final void method1995(class63 arg0, class352 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; ++var12) {
            if (class344.field5192 != var12) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < class412.field5957) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < class315.field4743 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class337 var15 = class170.field2427[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class479.field6745[var12].method199(var13, var14) + class479.field6745[var12].method199(var13 + 1, var14) + class479.field6745[var12].method199(var13, var14 + 1) + class479.field6745[var12].method199(var13 + 1, var14 + 1)) / 4 - (class479.field6745[arg2].method199(arg3, arg4) + class479.field6745[arg2].method199(arg3 + 1, arg4) + class479.field6745[arg2].method199(arg3, arg4 + 1) + class479.field6745[arg2].method199(arg3 + 1, arg4 + 1)) / 4;
                                    class100 var17 = var15.field5044;
                                    class100 var18 = var15.field5047;
                                    if (var17 != null && var17.method253(-85)) {
                                        arg1.method245((byte) -79, var7, arg0, var17, var16, (var14 - arg4) * class75.field1055 + (1 - arg6) * class47.field683, (var13 - arg3) * class75.field1055 + (1 - arg5) * class47.field683);
                                    }
                                    if (var18 != null && var18.method253(-60)) {
                                        arg1.method245((byte) -91, var7, arg0, var18, var16, (var14 - arg4) * class75.field1055 + (1 - arg6) * class47.field683, (var13 - arg3) * class75.field1055 + (1 - arg5) * class47.field683);
                                    }
                                    for (class448 var19 = var15.field5054; var19 != null; var19 = var19.field6340) {
                                        class305 var20 = var19.field6343;
                                        if (var20 != null && var20.method253(-117) && (var20.field4542 == var13 || var8 == var13) && (var20.field4547 == var14 || var10 == var14)) {
                                            int var21 = var20.field4541 - var20.field4542 + 1;
                                            int var22 = var20.field4552 - var20.field4547 + 1;
                                            arg1.method245((byte) -55, var7, arg0, var20, var16, (var20.field4547 - arg4) * class75.field1055 + (var22 - arg6) * class47.field683, (var20.field4542 - arg3) * class75.field1055 + (var21 - arg5) * class47.field683);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var8;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
    public static final void method1996(int arg0) {
        ++field4866;
        if (arg0 != 1) {
            field4860 = null;
        }
        for (class198 var1 = (class198) class428.field6108.method2456(32101); var1 != null; var1 = (class198) class428.field6108.method2461(301)) {
            if (~var1.field2983 < -1) {
                --var1.field2983;
            }
            if (~var1.field2983 == -1) {
                if (var1.field2994 < 0 || class15.method141(var1.field2994, false, var1.field2980)) {
                    class2.method12(var1.field2974, var1.field2994, var1.field2976, var1.field2986, var1.field2988, var1.field2978, 20576, -1, var1.field2980);
                    var1.method283(arg0 + 1);
                }
            } else {
                if (var1.field2987 > 0) {
                    --var1.field2987;
                }
                if (var1.field2987 == 0 && ~var1.field2986 <= -2 && ~var1.field2974 <= -2 && var1.field2986 <= class379.field5642 + -2 && ~var1.field2974 >= ~(class456.field6477 + -2) && (~var1.field2989 > -1 || class15.method141(var1.field2989, false, var1.field2977))) {
                    class2.method12(var1.field2974, var1.field2989, var1.field2991, var1.field2986, var1.field2988, var1.field2978, 20576, -1, var1.field2977);
                    var1.field2987 = -1;
                    if (~var1.field2994 == ~var1.field2989 && var1.field2994 == -1) {
                        var1.method283(arg0 + 1);
                    } else if (var1.field2994 == var1.field2989 && var1.field2991 == var1.field2976 && var1.field2980 == var1.field2977) {
                        var1.method283(2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
    public static final void method1997(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class111.field1568 != null) {
            class111.field1568[arg0][arg1] = -16777216 | arg2;
        }
        if (class318.field4780 != null) {
            class318.field4780[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class314.field4724 != null) {
            class314.field4724[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)I")
    private final int method1998(int arg0, int arg1, int arg2) {
        if (arg0 != -69062271) {
            return -89;
        } else {
            ++field4862;
            int var4 = arg2 * 57 + arg1;
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)I")
    public static final int method1999(int arg0, int arg1, int arg2) {
        ++field4863;
        if (arg2 == -1) {
            return 12345678;
        } else {
            int var3 = (127 & arg2) * arg0 >> 7;
            if (arg1 != 0) {
                method2001((class446) null, -101);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (65408 & arg2) - -var3;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIII)I")
    public static final int method2000(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4864;
        int var5 = arg2 & 15;
        if (arg3 < 64) {
            method2002(-36);
        }
        int var6 = ~var5 <= -9 ? arg1 : arg0;
        int var7 = var5 >= 4 ? (~var5 != -13 && ~var5 != -15 ? arg4 : arg0) : arg1;
        return ((2 & var5) != 0 ? -var7 : var7) + ((var5 & 1) != 0 ? -var6 : var6);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lre;I)Lcm;")
    public static final class406 method2001(class446 arg0, int arg1) {
        ++field4861;
        if (arg1 < 49) {
            method2002(-74);
        }
        return new class406(arg0.method2634(-126), arg0.method2634(-71), arg0.method2634(116), arg0.method2634(13), arg0.method2613(-25778), arg0.method2628(49152));
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        if (arg0 != -1) {
            method2002(3);
        }
        ++field4868;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int var4 = class14.field206[arg1];
            for (int var5 = 0; ~var5 > ~class156.field2169; ++var5) {
                var3[var5] = this.method1998(-69062271, class288.field4397[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V")
    public static void method2002(int arg0) {
        field4865 = null;
        if (arg0 < 73) {
            field4870 = null;
        }
        field4860 = null;
        field4870 = null;
        field4867 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class324() {
        super(0, true);
    }
}
