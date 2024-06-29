import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class258 extends class222 {

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "Lsb;")
    public static class98 field4549 = class47.method368(" )2> <col=ffff00>", 0);

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
    public static int field4554 = 0;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static volatile int field4548 = 0;

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "Lsb;")
    public static class98 field4558 = class47.method368(")4", 0);

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field4557;
        if (arg0 <= 35) {
            return null;
        } else {
            int[] var3 = super.field3844.method22(0, arg1);
            if (super.field3844.field61) {
                int[] var4 = this.method1537((byte) 89, 0, arg1);
                for (int var5 = 0; class13.field253 > var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(II)I")
    public static final int method1774(int arg0, int arg1) {
        if (arg1 != 4096) {
            field4554 = -110;
        }
        ++field4556;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (super.field3834.field1486) {
            int[][] var4 = this.method1531(arg0, 0, arg1 + 122);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var4[1];
            int[] var9 = var3[0];
            int[] var10 = var4[2];
            for (int var11 = 0; ~class13.field253 < ~var11; ++var11) {
                var9[var11] = -var5[var11] + 4096;
                var6[var11] = -var8[var11] + 4096;
                var7[var11] = 4096 - var10[var11];
            }
        }
        ++field4552;
        if (arg1 != 1) {
            field4558 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field4555;
        if (arg1) {
            field4551 = -42;
        }
        if (~arg2 == -1) {
            super.field3842 = arg0.method1446(5350) == 1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class258() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLtg;)V")
    public static final void method1775(boolean arg0, class75 arg1) {
        ++field4553;
        class1.field13 = arg1.method564(class136.field2413, -14783);
        class106.field1902 = arg1.method564(class133.field2358, -14783);
        class221.field3810 = arg1.method564(class230.field3979, -14783);
        class246.field4333 = arg1.method564(class230.field3967, -14783);
        class41.field682 = arg1.method564(class181.field3119, -14783);
        class43.field705 = arg1.method564(class250.field4383, -14783);
        class229.field3944 = arg1.method564(class214.field3638, -14783);
        class28.field524 = arg1.method564(class146.field2564, -14783);
        class43.field730 = arg1.method564(class117.field2106, -14783);
        class134.field2364 = arg1.method564(class6.field90, -14783);
        class28.field515 = arg1.method564(class230.field3971, -14783);
        class121.field2224 = arg1.method564(class88.field1570, -14783);
        if (arg0) {
            class113.field2017 = arg1.method564(class53.field859, -14783);
            class75.field1326 = arg1.method564(class74.field1259, -14783);
            class161.field2914 = arg1.method564(class234.field4045, -14783);
            class169.field2990 = arg1.method564(class51.field834, -14783);
            arg1.method564(class248.field4359, -14783);
            class86.field1513 = arg1.method564(class227.field3914, -14783);
            class180.field3100 = arg1.method564(class199.field3417, -14783);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1776(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field4550;
        int var6 = class47.method369(2, arg3, class116.field2077, class215.field3666);
        int var7 = class47.method369(2, arg2, class116.field2077, class215.field3666);
        int var8 = class47.method369(2, arg5, class229.field3933, class106.field1899);
        if (arg4 != -123) {
            method1776(-49, 119, -75, -8, (byte) -120, -81);
        }
        int var9 = class47.method369(2, arg0, class229.field3933, class106.field1899);
        for (int var10 = var6; var7 >= var10; ++var10) {
            class37.method305(arg4 + 116, class43.field721[var10], var9, arg1, var8);
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V")
    public static void method1777(byte arg0) {
        field4558 = null;
        if (arg0 <= -125) {
            field4549 = null;
        }
    }
}
