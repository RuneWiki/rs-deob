import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class53 {

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Z")
    public boolean field951 = true;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
    public static int[] field948 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lhj;")
    public static class69 field953 = class181.method1318("blinken2:", (byte) -128);

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lhj;")
    private static class69 field956 = class181.method1318("Ok", (byte) -119);

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lhj;")
    public static class69 field955 = field956;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Ltk;")
    public static class50 field952;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lqb;")
    public static class56 field946;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lnc;")
    public static class83 field943;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static final void method310(int arg0) {
        field945++;
        int var1 = arg0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class223.method1586(var1, -53, var2, true, var3, class158.field2935)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public static final void method311(int arg0, int arg1, int arg2) {
        int var3 = 69 % ((arg2 - 22) / 62);
        class135 var4 = class8.method38((byte) 109, 1, arg1);
        field942++;
        var4.method1011((byte) 122);
        var4.field2539 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method312(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field957++;
        int var8 = arg5;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5 - arg3;
        int var12 = arg4 - arg3;
        int var13 = arg5 * arg5;
        int var14 = var12 * var12;
        int var15 = arg4 * arg4;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var15 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = arg5 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var21) * var15 + var17;
        int var24 = (1 - var22) * var14 + var19;
        int var25 = var13 - ((var21 - 1) * var18);
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var15 << 2;
        int var28 = var14 << 2;
        int var29 = var13 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var22 - 3) * var20;
        if (arg2 >= -119) {
            field943 = null;
        }
        int var33 = var30;
        int var34 = var29;
        int var35 = (arg5 - 1) * var27;
        int var36 = (var21 - 3) * var18;
        int var37 = var19 * 3;
        int[] var38 = class186.field3402[arg0];
        class99.method740(arg7, var38, -1162793114, arg6 - var12, -arg4 + arg6);
        int var39 = (var11 - 1) * var28;
        class99.method740(arg1, var38, -1162793114, arg6 + var12, -var12 + arg6);
        class99.method740(arg7, var38, -1162793114, arg4 + arg6, arg6 + var12);
        while (var8 > 0) {
            boolean var40 = var11 >= var8;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var37;
                        var37 += var30;
                        var26 += var33;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var33;
                    var24 += var37;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var32;
                var24 += -var39;
                var32 -= var28;
                var39 -= var28;
            }
            var8--;
            int var41 = arg0 - var8;
            if (var23 < 0) {
                while (var23 < 0) {
                    var9++;
                    var23 += var31;
                    var25 += var34;
                    var34 += var29;
                    var31 += var29;
                }
            }
            if (var25 < 0) {
                var23 += var31;
                var9++;
                var25 += var34;
                var34 += var29;
                var31 += var29;
            }
            var25 += -var36;
            var36 -= var27;
            int var42 = arg0 + var8;
            var23 += -var35;
            var35 -= var27;
            int var43 = arg6 - var9;
            int var44 = arg6 + var9;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class99.method740(arg7, class186.field3402[var41], -1162793114, var46, var43);
                class99.method740(arg1, class186.field3402[var41], -1162793114, var45, var46);
                class99.method740(arg7, class186.field3402[var41], -1162793114, var44, var45);
                class99.method740(arg7, class186.field3402[var42], -1162793114, var46, var43);
                class99.method740(arg1, class186.field3402[var42], -1162793114, var45, var46);
                class99.method740(arg7, class186.field3402[var42], -1162793114, var44, var45);
            } else {
                class99.method740(arg7, class186.field3402[var41], -1162793114, var44, var43);
                class99.method740(arg7, class186.field3402[var42], -1162793114, var44, var43);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Lkc;")
    public static final class264 method313(byte arg0) {
        field954++;
        int var1 = class69.field1350[0] * class113.field2167[0];
        int var2 = 29 / ((82 - arg0) / 34);
        byte[] var3 = class157.field2919[0];
        class264 var6;
        if (class270.field4788[0]) {
            byte[] var7 = class45.field645[0];
            int[] var8 = new int[var1];
            for (int var9 = 0; var9 < var1; var9++) {
                var8[var9] = class230.method1644(class69.method443(255, var7[var9]) << 24, class50.field841[class69.method443(255, var3[var9])]);
            }
            var6 = new class77(class229.field4196, field941, class138.field2585[0], class88.field1682[0], class69.field1350[0], class113.field2167[0], var8);
        } else {
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class50.field841[class69.method443(255, var3[var5])];
            }
            var6 = new class264(class229.field4196, field941, class138.field2585[0], class88.field1682[0], class69.field1350[0], class113.field2167[0], var4);
        }
        class229.method1636((byte) 42);
        return var6;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZLth;)V")
    public static final void method314(int arg0, int arg1, boolean arg2, class108 arg3) {
        field940++;
        if (arg2) {
            return;
        }
        if (arg3.field4010 == arg1 && arg1 != -1) {
            class159 var4 = class211.method1521(-50, arg1);
            int var5 = var4.field2963;
            if (var5 == 1) {
                arg3.field3995 = 0;
                arg3.field4006 = arg0;
                arg3.field4022 = 0;
                arg3.field3993 = 0;
                class248.method1748(arg3.field4005, arg3.field3985, var4, -23, arg3.field4022, class156.field2904 == arg3);
            }
            if (var5 == 2) {
                arg3.field3995 = 0;
                return;
            }
        } else if (arg1 == -1 || arg3.field4010 == -1 || class211.method1521(-114, arg1).field2954 >= class211.method1521(-107, arg3.field4010).field2954) {
            arg3.field4009 = arg3.field4021;
            arg3.field4010 = arg1;
            arg3.field3995 = 0;
            arg3.field3993 = 0;
            arg3.field4022 = 0;
            arg3.field4006 = arg0;
            if (arg3.field4010 != -1) {
                class248.method1748(arg3.field4005, arg3.field3985, class211.method1521(-120, arg3.field4010), -104, arg3.field4022, class156.field2904 == arg3);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field944 = arg5;
        this.field949 = arg1;
        this.field951 = arg6;
        this.field939 = arg3;
        this.field938 = arg4;
        this.field937 = arg0;
        this.field947 = arg2;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public static void method315(byte arg0) {
        field946 = null;
        field943 = null;
        field952 = null;
        field948 = null;
        field956 = null;
        field953 = null;
        if (arg0 != 20) {
            method315((byte) -9);
        }
        field955 = null;
    }
}
