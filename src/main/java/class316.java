import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class316 {

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "Lmf;")
    private class382 field4683 = new class382(128);

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "Lpu;")
    private class522 field4678;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "[I")
    public static int[] field4676 = new int[5];

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "Lfv;")
    public static class106 field4681;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Lpu;")
    public static class522 field4675;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V", line = 7)
    public final void method1988(int arg0, int arg1) {
        field4684++;
        class382 var3 = this.field4683;
        synchronized (this.field4683) {
            if (arg1 != 20590) {
                field4681 = null;
            }
            this.field4683.method2290(false, arg0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIIIIII)V", line = 21)
    public static final void method1989(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 == arg7 && arg1 == arg3 && arg2 == arg9 && arg0 == arg5) {
            class394.method2435(arg4, arg2, (byte) -16, arg1, arg6, arg5);
        } else {
            int var10 = arg6;
            int var11 = arg1;
            int var12 = arg6 * 3;
            int var13 = arg1 * 3;
            int var14 = arg7 * 3;
            int var15 = arg3 * 3;
            int var16 = arg9 * 3;
            int var17 = arg0 * 3;
            int var18 = arg2 + var14 - var16 - arg6;
            int var19 = arg5 + var15 - var17 - arg1;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = arg6 + (var28 + var30 + var32 >> 12);
                int var35 = (var29 + var31 + var33 >> 12) + arg1;
                class394.method2435(arg4, var34, (byte) -16, var11, var10, var35);
                var10 = var34;
                var11 = var35;
            }
        }
        int var25 = 126 / ((44 - arg8) / 32);
        field4679++;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lqaa;I)V", line = 95)
    public static final void method1990(class26 arg0, int arg1) {
        field4677++;
        arg0.method3868(class163.field2332.method2979(arg1 - 30256), -318419336);
        arg0.method3868(class676.field9563.method2979(111), arg1 ^ 0xED0538EC);
        arg0.method3868(class94.field1498.method2979(96), -318419336);
        arg0.method3868(class695.field9786.method2979(123), -318419336);
        arg0.method3868(class199.field2813.method2979(114), arg1 ^ 0xED0538EC);
        arg0.method3868(class334.field4954.method2979(121), -318419336);
        arg0.method3868(class652.field9171.method2979(111), -318419336);
        arg0.method3868(class81.field1362.method2979(124), -318419336);
        if (arg1 != 30356) {
            method1989(-121, -96, 53, -34, 8, -64, 12, -89, 57, 6);
        }
        arg0.method3868(class703.field9909.method2979(101), -318419336);
        arg0.method3868(class309.field4580.method2979(115), -318419336);
        arg0.method3868(class580.field8170.method2979(99), -318419336);
        arg0.method3868(class540.field7559.method2979(arg1 - 30233), arg1 ^ 0xED0538EC);
        arg0.method3868(class518.field7311.method2979(116), -318419336);
        arg0.method3868(class81.field1363.method2979(arg1 - 30260), arg1 ^ 0xED0538EC);
        arg0.method3868(class424.field6162.method2979(127), -318419336);
        arg0.method3868(class102.field1606.method2979(121), -318419336);
        arg0.method3868(class656.field9196.method2979(arg1 ^ 0x76FF), arg1 - 318449692);
        arg0.method3868(class206.field2904.method2979(102), -318419336);
        arg0.method3868(class149.field2168.method2979(110), -318419336);
        arg0.method3868(class386.field5439.method2979(122), arg1 ^ 0xED0538EC);
        arg0.method3868(field4675.method2979(arg1 ^ 0x76E4), arg1 ^ 0xED0538EC);
        arg0.method3868(class264.field4005.method2979(arg1 - 30230), -318419336);
        arg0.method3868(class27.field395.method2979(106), -318419336);
        arg0.method3868(class75.field1310.method2979(99), arg1 - 318449692);
        arg0.method3868(class651.field9121.method2979(arg1 - 30236), arg1 - 318449692);
        arg0.method3868(class462.field6660.method2979(104), -318419336);
        arg0.method3868(class544.field7656.method2979(97), -318419336);
        arg0.method3868(class23.field318.method2979(125), -318419336);
        arg0.method3868(class656.field9201.method2979(arg1 ^ 0x76FF), -318419336);
        arg0.method3868(class677.field9579.method2979(106), -318419336);
        arg0.method3868(class563.field7933.method2979(115), -318419336);
        arg0.method3868(class231.field3600.method2979(112), -318419336);
        arg0.method3868(class141.method1021(arg1 - 30379), -318419336);
        arg0.method3868(class544.method3084((byte) 69), -318419336);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 139)
    public final void method1991(byte arg0) {
        field4680++;
        if (arg0 > 63) {
            class382 var2 = this.field4683;
            synchronized (this.field4683) {
                this.field4683.method2285((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V", line = 152)
    public static void method1992(byte arg0) {
        field4681 = null;
        field4675 = null;
        if (arg0 >= 61) {
            field4676 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)Lpi;", line = 166)
    public final class460 method1993(int arg0, boolean arg1) {
        field4672++;
        class382 var3 = this.field4683;
        class460 var4;
        synchronized (this.field4683) {
            var4 = (class460) this.field4683.method2287(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg1) {
            method1989(-125, 4, -106, 109, -103, 29, -101, -116, 94, 92);
        }
        class522 var5 = this.field4678;
        byte[] var6;
        synchronized (this.field4678) {
            var6 = this.field4678.method3007(1, arg0, 5);
        }
        class460 var7 = new class460();
        if (var6 != null) {
            var7.method2703(new class695(var6), -1);
        }
        class382 var8 = this.field4683;
        synchronized (this.field4683) {
            this.field4683.method2291(var7, (long) arg0, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 202)
    public final void method1994(int arg0) {
        class382 var2 = this.field4683;
        synchronized (this.field4683) {
            if (arg0 != -4097) {
                method1995(13, 84, 104);
            }
            this.field4683.method2279(0);
        }
        field4682++;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 240)
    public class316(class693 arg0, int arg1, class522 arg2) {
        this.field4678 = arg2;
        this.field4678.method2988(82, 1);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V", line = 226)
    public static final void method1995(int arg0, int arg1, int arg2) {
        field4674++;
        class191 var3 = class6.method38(15, -116, 0);
        var3.method1285((byte) -1);
        var3.field2754 = arg2;
        var3.field2760 = arg1;
        if (arg0 != 30005) {
            method1989(-93, 90, -75, 115, 8, 17, -87, -17, 17, 60);
        }
    }
}
