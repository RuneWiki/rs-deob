import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class339 extends class212 {

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "[I")
    public static int[] field4768 = new int[3];

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "[I")
    public static int[] field4767 = new int[32];

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "Lmu;")
    public static class303 field4764 = new class303(46, -1);

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!vu", name = "v", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!vu", name = "w", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!vu", name = "y", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!vu", name = "A", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!vu", name = "x", descriptor = "[Lga;")
    public static class404[] field4772;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        ++field4771;
        return arg0 != 20014 ? -81 : 1;
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)Z")
    public final boolean method2139(int arg0) {
        ++field4769;
        if (arg0 < 85) {
            method2143(11, 68);
        }
        return !super.field3004.method2061(-104);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 8 && ~arg6 != -17) {
            class384 var7 = class649.field8928[arg5][arg0][arg3];
            if (var7 == null) {
                var7 = new class384(arg5);
            }
            if (~arg6 != -2) {
                if (~arg6 == -3) {
                    var7.field5569 = (short) arg2;
                    var7.field5568 = (short) arg1;
                }
            } else {
                var7.field5572 = (short) arg1;
                var7.field5580 = (short) arg2;
            }
            if (class216.field3139) {
                class227.method1598(false);
            }
        } else if (arg6 != 8) {
            int var8 = (arg0 << class130.field2185) + class1.field3;
            int var9 = -class1.field3 + var8;
            int var10 = arg3 << class130.field2185;
            int var11 = class1.field3 + var10;
            int var12 = class465.field6517[arg5].method1851((byte) -86, arg3, arg0 + 1);
            int var13 = class465.field6517[arg5].method1851((byte) -86, arg3 + 1, arg0);
            class49.field1042[class331.field4631++] = new class546(arg6, arg5, var8, var9, var9, var8, var12, var13, -arg2 + var13, var12 - arg2, var10, var11, var11, var10);
        } else {
            int var14 = arg0 << class130.field2185;
            int var15 = class1.field3 + var14;
            int var16 = arg3 << class130.field2185;
            int var17 = class1.field3 + var16;
            int var18 = class465.field6517[arg5].method1851((byte) -86, arg3, arg0);
            int var19 = class465.field6517[arg5].method1851((byte) -86, arg3 + 1, arg0 - -1);
            class49.field1042[class331.field4631++] = new class546(arg6, arg5, var14, var15, var15, var14, var18, var19, -arg2 + var19, -arg2 + var18, var16, var17, var17, var16);
        }
        if (arg4 != -1) {
            method2141(31, (String) null, 115, (String) null);
        }
        ++field4773;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
    public static final int method2141(int arg0, String arg1, int arg2, String arg3) {
        ++field4766;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (~var4 < ~(-var8 + var6) || -var9 + var7 < var5) {
            if (-var8 + var6 >= var4) {
                return -1;
            }
            if (~(-var9 + var7) <= ~var5) {
                return 1;
            }
            char var22;
            if (var8 != 0) {
                var22 = var8;
                boolean var23 = false;
            } else {
                var22 = arg3.charAt(var6++);
            }
            char var24;
            if (var9 != 0) {
                var24 = var9;
                boolean var25 = false;
            } else {
                var24 = arg1.charAt(var7++);
            }
            var8 = class557.method3200(var22, (byte) -39);
            var9 = class557.method3200(var24, (byte) -127);
            char var26 = class507.method2981(var22, arg2, 105);
            char var27 = class507.method2981(var24, arg2, 105);
            if (~var26 != ~var27 && ~Character.toUpperCase(var26) != ~Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (~var28 != ~var29) {
                    return class536.method3088(arg2, 30316, var28) + -class536.method3088(arg2, arg0 ^ 21932, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (arg2 != 2) {
                var16 = var11;
                var17 = var11;
            } else {
                var16 = var5 - 1 + -var11;
                var17 = var4 - (1 - -var11);
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (~var18 != ~var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class536.method3088(arg2, 30316, var20) + -class536.method3088(arg2, 30316, var21);
                }
            }
        }
        if (arg0 != 9152) {
            method2140(-67, 60, -16, -117, -17, -84, 39);
        }
        int var12 = -var5 + var4;
        if (~var12 != -1) {
            return var12;
        } else {
            for (int var13 = 0; var10 > var13; ++var13) {
                char var14 = arg3.charAt(var13);
                char var15 = arg1.charAt(var13);
                if (var14 != var15) {
                    return class536.method3088(arg2, 30316, var14) - class536.method3088(arg2, 30316, var15);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        super.field3006 = arg1;
        ++field4765;
        int var3 = -103 % ((arg0 - 82) / 35);
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            return 91;
        } else {
            ++field4770;
            return super.field3004.method2061(arg0 ^ -76) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Ldh;)V")
    public class339(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (super.field3004.method2061(-112)) {
            super.field3006 = 0;
        }
        ++field4763;
        if (arg0) {
            field4772 = null;
        }
        if (~super.field3006 != -2 && super.field3006 != 0) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(ILdh;)V")
    public class339(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "(I)I")
    public final int method2142(int arg0) {
        if (arg0 != -32350) {
            field4768 = null;
        }
        ++field4774;
        return super.field3006;
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(II)Z")
    public static final boolean method2143(int arg0, int arg1) {
        ++field4775;
        if (arg0 != 8806) {
            method2143(-86, 33);
        }
        if (arg1 != 3 && arg1 != 4 && ~arg1 != -10 && ~arg1 != -60 && arg1 != 1007) {
            return arg1 == 2 || ~arg1 == -1002;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static void method2144(byte arg0) {
        field4772 = null;
        field4768 = null;
        int var1 = 41 % ((arg0 - -32) / 32);
        field4767 = null;
        field4764 = null;
    }
}
