import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class119 extends class477 {

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "Lsr;")
    public class665 field1527;

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "Lpq;")
    public static class159 field1528;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "Ljl;")
    public static class38 field1526;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)V")
    public static void method725(boolean arg0) {
        if (!arg0) {
            field1528 = null;
            field1526 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V")
    public static final void method726(int arg0, int arg1) {
        class451 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class176 var4 = class249.field3345[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class334.field4887; var5++) {
                    for (int var6 = 0; var6 < class149.field1872; var6++) {
                        var2 = var4.method147(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class428.field5949;
                            int var8 = var5 << class428.field5949;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class176 var10 = class249.field3345[var9];
                                if (var10 != null) {
                                    int var11 = var4.method150(var6, var5) - var10.method150(var6, var5);
                                    int var12 = var4.method150(var6 + 1, var5) - var10.method150(var6 + 1, var5);
                                    int var13 = var4.method150(var6 + 1, var5 + 1) - var10.method150(var6 + 1, var5 + 1);
                                    int var14 = var4.method150(var6, var5 + 1) - var10.method150(var6, var5 + 1);
                                    var10.method152(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Loa;IILq;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method727(class689 arg0, int arg1, int arg2, class111 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class277.field3750 = arg0;
        class120.field1541 = arg1;
        class579.field8002 = arg3;
        class334.field4896 = class277.field3750.method1962() > 0;
        class297.field3975 = arg4 >> class428.field5949;
        class274.field3710 = arg6 >> class428.field5949;
        class294.field3946 = arg4;
        class99.field1212 = arg6;
        class377.field5415 = arg5;
        class502.field6784 = class297.field3975 - class351.field5123;
        if (class502.field6784 < 0) {
            class171.field2144 = -class502.field6784;
            class502.field6784 = 0;
        } else {
            class171.field2144 = 0;
        }
        class552.field7557 = class274.field3710 - class351.field5123;
        if (class552.field7557 < 0) {
            class680.field9671 = -class552.field7557;
            class552.field7557 = 0;
        } else {
            class680.field9671 = 0;
        }
        class368.field5298 = class351.field5123 + class297.field3975;
        if (class368.field5298 > class149.field1872) {
            class368.field5298 = class149.field1872;
        }
        class542.field7444 = class351.field5123 + class274.field3710;
        if (class542.field7444 > class334.field4887) {
            class542.field7444 = class334.field4887;
        }
        for (int var18 = 0; var18 < class351.field5123 + class351.field5123 + 2; var18++) {
            for (int var23 = 0; var23 < class351.field5123 + class351.field5123 + 2; var23++) {
                int var24 = class297.field3975 + var18 - class351.field5123;
                int var25 = class274.field3710 + var23 - class351.field5123;
                if (var24 >= 0 && var25 >= 0 && var24 < class149.field1872 && var25 < class334.field4887) {
                    int var26 = var24 << class428.field5949;
                    int var27 = var25 << class428.field5949;
                    int var28 = class249.field3345[class249.field3345.length - 1].method150(var24, var25) - (0x3E8 << class428.field5949 - 7);
                    int var29 = class185.field2270 == null ? class249.field3345[0].method150(var24, var25) + class33.field327 : class185.field2270[0].method150(var24, var25) + class33.field327;
                    class32.field307[var18][var23] = class277.field3750.method1932(var26, var28, var27, var26, var29, var27);
                } else {
                    class32.field307[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class351.field5123 + class351.field5123 + 1; var19++) {
            for (int var22 = 0; var22 < class351.field5123 + class351.field5123 + 1; var22++) {
                class554.field7580[var19][var22] = class32.field307[var19][var22] || class32.field307[var19 + 1][var22] || class32.field307[var19][var22 + 1] || class32.field307[var19 + 1][var22 + 1];
            }
        }
        class396.field5662 = arg8;
        class477.field6451 = arg9;
        class304.field4089 = arg10;
        class120.field1553 = arg11;
        class547.field7484 = arg12;
        class169.method1125();
        class70.method419((byte) 51, class277.field3750);
        for (class95 var20 = (class95) class34.field332.method2224((byte) -112); var20 != null; var20 = (class95) class34.field332.method2222((byte) -77)) {
            var20.method2357(3553);
            class256.method1615((byte) 111, var20);
        }
        if (class334.field4896) {
            for (int var21 = 0; var21 < class334.field4895; var21++) {
                class660.field9370[var21].method757(arg1, arg17, (byte) -111);
            }
        }
        if (arg2 > 1) {
            class277.field3750.method1794(0);
            if (class297.field3973 == null || class297.field3973 instanceof class109) {
                class297.field3973 = new class674();
            }
        } else if (class297.field3973 == null || class297.field3973 instanceof class674) {
            class297.field3973 = new class109();
        }
        class297.field3973.method517(false, arg2);
        class297.field3973.method510(true);
        if (class644.field9128 != null) {
            class669.method3708(true);
            class297.field3973.method509(false, 22);
            class664.method3682(arg2, null, 0, (byte) 0, arg15, arg16);
            class297.field3973.method510(true);
            class297.field3973.method509(false, 23);
            class669.method3708(false);
        }
        class664.method3682(arg2, arg7, arg13, arg14, arg15, arg16);
        class297.field3973.method510(true);
        class297.field3973.method515(-30473);
        class297.field3973.method510(true);
        if (arg2 > 1) {
            class277.field3750.method1797(0);
        }
        class277.field3750.method2016(0, null);
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lsr;)V")
    public class119(class665 arg0) {
        this.field1527 = arg0;
    }
}
