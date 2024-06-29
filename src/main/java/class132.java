import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class132 extends class79 {

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "Lwl;")
    public class280 field1910 = new class280();

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Lqc;")
    public class521 field1915 = new class521();

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Ljb;")
    private class340 field1901;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "Lwv;")
    public static class26 field1908 = new class26("LOCAL", 4);

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field1913 = 0;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "()Lgm;")
    public final class79 method92() {
        field1903++;
        class71 var1;
        do {
            var1 = (class71) this.field1910.method1668(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1087 == null);
        return var1.field1087;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lrv;IB)V")
    private final void method933(class71 arg0, int arg1, byte arg2) {
        if ((this.field1901.field4439[arg0.field1069] & 0x4) != 0 && arg0.field1053 < 0) {
            int var4 = this.field1901.field4485[arg0.field1069] / class296.field3877;
            int var5 = (var4 + 1048575 - arg0.field1068) / var4;
            arg0.field1068 = arg0.field1068 + (arg1 * var4) & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field1901.field4447[arg0.field1069] == 0) {
                    arg0.field1087 = class7.method66(arg0.field1073, arg0.field1087.method82(), arg0.field1087.method93(), arg0.field1087.method65());
                } else {
                    arg0.field1087 = class7.method66(arg0.field1073, arg0.field1087.method82(), 0, arg0.field1087.method65());
                    this.field1901.method1966(arg0, arg0.field1071.field3362[arg0.field1059] < 0, true);
                }
                if (arg0.field1071.field3362[arg0.field1059] < 0) {
                    arg0.field1087.method85(-1);
                }
                arg1 = arg0.field1068 / var4;
            }
        }
        field1907++;
        arg0.field1087.method71(arg1);
        if (arg2 > -116) {
            method936(106, 30, -122, -94, -63, false, -60, 32);
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public static void method934(int arg0) {
        field1908 = null;
        if (arg0 != 2634) {
            method936(68, -89, -109, -101, 41, false, -106, 123);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([III)V")
    public final void method80(int[] arg0, int arg1, int arg2) {
        field1914++;
        this.field1915.method80(arg0, arg1, arg2);
        for (class71 var4 = (class71) this.field1910.method1672((byte) -92); var4 != null; var4 = (class71) this.field1910.method1668(-1)) {
            if (!this.field1901.method1965(var4, 127)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1080) {
                        this.method935(var5 + var6, 105, var5, var4, arg0, var6);
                        var4.field1080 -= var6;
                        break;
                    }
                    this.method935(var5 + var6, 127, var5, var4, arg0, var4.field1080);
                    var5 += var4.field1080;
                    var6 -= var4.field1080;
                } while (!this.field1901.method1961(arg0, (byte) -127, var6, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILrv;[II)V")
    private final void method935(int arg0, int arg1, int arg2, class71 arg3, int[] arg4, int arg5) {
        if (arg1 < 103) {
            return;
        }
        field1905++;
        if ((this.field1901.field4439[arg3.field1069] & 0x4) != 0 && arg3.field1053 < 0) {
            int var7 = this.field1901.field4485[arg3.field1069] / class296.field3877;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1068) / var7;
                if (arg5 < var8) {
                    arg3.field1068 += arg5 * var7;
                    break;
                }
                arg3.field1087.method80(arg4, arg2, var8);
                arg3.field1068 += var7 * var8 - 1048576;
                arg5 -= var8;
                arg2 += var8;
                int var9 = class296.field3877 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class7 var11 = arg3.field1087;
                if (this.field1901.field4447[arg3.field1069] == 0) {
                    arg3.field1087 = class7.method66(arg3.field1073, var11.method82(), var11.method93(), var11.method65());
                } else {
                    arg3.field1087 = class7.method66(arg3.field1073, var11.method82(), 0, var11.method65());
                    this.field1901.method1966(arg3, arg3.field1071.field3362[arg3.field1059] < 0, true);
                    arg3.field1087.method64(var9, var11.method93());
                }
                if (arg3.field1071.field3362[arg3.field1059] < 0) {
                    arg3.field1087.method85(-1);
                }
                var11.method74(var9);
                var11.method80(arg4, arg2, arg0 - arg2);
                if (var11.method68()) {
                    this.field1915.method3069(var11);
                }
            }
        }
        arg3.field1087.method80(arg4, arg2, arg5);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "()Lgm;")
    public final class79 method89() {
        field1902++;
        class71 var1 = (class71) this.field1910.method1672((byte) -104);
        if (var1 == null) {
            return null;
        } else if (var1.field1087 == null) {
            return this.method92();
        } else {
            return var1.field1087;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method71(int arg0) {
        this.field1915.method71(arg0);
        field1912++;
        for (class71 var2 = (class71) this.field1910.method1672((byte) -110); var2 != null; var2 = (class71) this.field1910.method1668(-1)) {
            if (!this.field1901.method1965(var2, 127)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1080) {
                        this.method933(var2, var3, (byte) -124);
                        var2.field1080 -= var3;
                        break;
                    }
                    this.method933(var2, var2.field1080, (byte) -120);
                    var3 -= var2.field1080;
                } while (!this.field1901.method1961(null, (byte) -127, var3, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()I")
    public final int method83() {
        field1904++;
        return 0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1906++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg6 - arg7;
        int var12 = arg2 - arg7;
        int var13 = arg6 * arg6;
        int var14 = arg2 * arg2;
        if (!arg5) {
            field1911 = -65;
        }
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (arg1 >= class353.field4777 && class300.field3971 >= arg1) {
            int[] var38 = class457.field6299[arg1];
            int var39 = class99.method710(arg0 - arg6, (byte) -29, class71.field1077, class308.field4055);
            int var40 = class99.method710(arg0 + arg6, (byte) -29, class71.field1077, class308.field4055);
            int var41 = class99.method710(arg0 - var11, (byte) -29, class71.field1077, class308.field4055);
            int var42 = class99.method710(arg0 + var11, (byte) -29, class71.field1077, class308.field4055);
            class427.method2465(var38, var41, var39, -7, arg3);
            class427.method2465(var38, var42, var41, -7, arg4);
            class427.method2465(var38, var40, var42, -7, arg3);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var34 -= var29;
                var43 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (var46 >= class353.field4777 && var45 <= class300.field3971) {
                int var47 = class99.method710(arg0 + var8, (byte) -29, class71.field1077, class308.field4055);
                int var48 = class99.method710(arg0 - var8, (byte) -29, class71.field1077, class308.field4055);
                if (var44) {
                    int var49 = class99.method710(arg0 + var10, (byte) -29, class71.field1077, class308.field4055);
                    int var50 = class99.method710(arg0 - var10, (byte) -29, class71.field1077, class308.field4055);
                    if (class353.field4777 <= var45) {
                        int[] var51 = class457.field6299[var45];
                        class427.method2465(var51, var50, var48, -7, arg3);
                        class427.method2465(var51, var49, var50, -7, arg4);
                        class427.method2465(var51, var47, var49, -7, arg3);
                    }
                    if (var46 <= class300.field3971) {
                        int[] var52 = class457.field6299[var46];
                        class427.method2465(var52, var50, var48, -7, arg3);
                        class427.method2465(var52, var49, var50, -7, arg4);
                        class427.method2465(var52, var47, var49, -7, arg3);
                    }
                } else {
                    if (var45 >= class353.field4777) {
                        class427.method2465(class457.field6299[var45], var47, var48, -7, arg3);
                    }
                    if (class300.field3971 >= var46) {
                        class427.method2465(class457.field6299[var46], var47, var48, -7, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljb;)V")
    public class132(class340 arg0) {
        this.field1901 = arg0;
    }
}
