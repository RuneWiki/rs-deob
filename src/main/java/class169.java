import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class169 extends class264 {

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    private int field2976 = 4;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    private int field2977 = 4;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "Lcf;")
    public static class93 field2972 = class147.method1066("document)3cookie=(R", -48);

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "[Lcf;")
    public static class93[] field2982 = null;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "Lcf;")
    public static class93 field2983 = class147.method1066("mapfunction", -48);

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Lhg;")
    public static class177 field2969;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "Llh;")
    public static class286 field2967;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "[I")
    public static int[] field2974;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
    public static final void method1216(int arg0) {
        ++field2981;
        class282.field5069 = new class25(arg0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field2975;
        int[] var3 = super.field4716.method532((byte) 76, arg0);
        if (arg1 > -83) {
            field2982 = null;
        }
        if (super.field4716.field1424) {
            int var4 = class67.field1231 / this.field2977;
            int var5 = class176.field3060 / this.field2976;
            int[] var6;
            if (var4 <= 0) {
                var6 = this.method1767(0, 0, 21654);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method1767(0, class67.field1231 * var7 / var4, 21654);
            }
            for (int var8 = 0; var8 < class176.field3060; ++var8) {
                if (~var5 < -1) {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class176.field3060 * var9 / var5];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class241 var13 = new class241();
        var13.field4352 = arg10;
        var13.field4344 = arg0;
        ++field2971;
        if (arg2 != -12953) {
            field2967 = null;
        }
        var13.field4358 = arg5;
        var13.field4354 = arg7;
        var13.field4356 = arg3;
        var13.field4343 = arg6;
        var13.field4346 = arg11;
        var13.field4350 = arg12;
        var13.field4357 = arg8;
        var13.field4355 = arg4;
        var13.field4351 = arg9;
        var13.field4353 = arg1;
        class118.field2095.method1152((byte) -5, var13);
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
    public static final void method1218(byte arg0) {
        ++field2979;
        class45.field733.method294(0);
        if (arg0 != -110) {
            field2982 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V")
    public static void method1219(byte arg0) {
        field2967 = null;
        field2969 = null;
        field2972 = null;
        field2982 = null;
        field2974 = null;
        field2983 = null;
        if (arg0 != -126) {
            method1216(-90);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field2970;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field2977 = arg2.method1907(16832);
            }
        } else {
            this.field2976 = arg2.method1907(16832);
        }
        if (arg0 <= 11) {
            field2983 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        ++field2980;
        if (arg1) {
            method1220((class158[]) null, (class177) null, (byte) -4);
        }
        int[][] var3 = super.field4705.method1089(arg0, 65);
        if (super.field4705.field2670) {
            int var4 = class176.field3060 / this.field2976;
            int var5 = class67.field1231 / this.field2977;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1773(-115, 0, class67.field1231 * var6 / var5);
            } else {
                var7 = this.method1773(-118, 0, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var3[1];
            int[] var11 = var7[2];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class176.field3060 < ~var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class176.field3060 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var12[var14] = var9[var16];
                var10[var14] = var8[var16];
                var13[var14] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lnf;Lhg;B)V")
    public static final void method1220(class158[] arg0, class177 arg1, byte arg2) {
        ++field2973;
        class9.field130 = arg1;
        class4.field45 = arg0;
        class112.field1917 = new boolean[class4.field45.length];
        class85.field1538.method1153((byte) -6);
        int var3 = -122 % ((52 - arg2) / 52);
        int var4 = class9.field130.method1277(class159.field2805, (byte) 74);
        int[] var5 = class9.field130.method1260(var4, 0);
        for (int var6 = 0; var6 < var5.length; ++var6) {
            class85.field1538.method1152((byte) -5, class6.method25(-82, new class280(class9.field130.method1271(var4, -2154, var5[var6]))));
        }
    }
}
