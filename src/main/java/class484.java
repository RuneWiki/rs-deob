import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class484 extends class601 {

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "Z")
    private boolean field6241 = true;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "Z")
    private boolean field6243 = true;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "Lsa;")
    public static class216 field6245 = new class216();

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field6248 = 0;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field6250 = 0;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "[I")
    public static int[] field6251 = new int[14];

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "[I")
    public static int[] field6249;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method261(int arg0, byte arg1) {
        ++field6242;
        if (arg1 >= -76) {
            field6248 = -50;
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(this.field6241 ? -arg0 + class104.field1388 : arg0, 27123, 0);
            if (!this.field6243) {
                class642.method3475(var4, 0, var3, 0, class418.field5518);
            } else {
                for (int var5 = 0; ~class418.field5518 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class511.field6519];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V", line = 45)
    public static final void method2717(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6247;
        for (class53 var5 = (class53) class409.field5429.method3591(0); var5 != null; var5 = (class53) class409.field5429.method3600((byte) 110)) {
            class218.method1432(-12955, var5, arg0, arg3, arg4, arg1);
        }
        for (class53 var6 = (class53) class418.field5515.method3591(0); var6 != null; var6 = (class53) class418.field5515.method3600((byte) 57)) {
            byte var12 = 1;
            class68 var13 = var6.field682.method2169(0);
            if (var6.field682.field4696 != -1 && !var6.field682.field4715) {
                if (~var6.field682.field4696 != ~var13.field915 && ~var6.field682.field4696 != ~var13.field931 && var6.field682.field4696 != var13.field918 && ~var6.field682.field4696 != ~var13.field911) {
                    if (var6.field682.field4696 == var13.field897 || var6.field682.field4696 == var13.field894 || var6.field682.field4696 == var13.field898 || var6.field682.field4696 == var13.field890) {
                        var12 = 3;
                    }
                } else {
                    var12 = 2;
                }
            } else {
                var12 = 0;
            }
            if (~var6.field677 != ~var12) {
                int var14 = class364.method2094(var6.field682, (byte) 121);
                class240 var15 = var6.field682.field9545;
                if (var15.field3289 != null) {
                    var15 = var15.method1585((byte) -100, class381.field4705);
                }
                if (var15 != null && var14 != -1) {
                    if (var6.field698 == var14 && !var15.field3252 != var6.field678) {
                        var6.field677 = var12;
                        var6.field675 = var15.field3251;
                    } else {
                        boolean var16 = false;
                        if (var6.field686 == null) {
                            var16 = true;
                        } else {
                            var6.field675 -= 512;
                            if (var6.field675 <= 0) {
                                class1.field10.method30(var6.field686);
                                var16 = true;
                                var6.field686 = null;
                            }
                        }
                        if (var16) {
                            var6.field698 = var14;
                            var6.field677 = var12;
                            var6.field684 = null;
                            var6.field674 = null;
                            var6.field675 = var15.field3251;
                            var6.field678 = var15.field3252;
                        }
                    }
                } else {
                    var6.field677 = var12;
                    var6.field678 = false;
                    var6.field698 = -1;
                }
            }
            var6.field673 = var6.field682.field2896;
            var6.field680 = var6.field682.field2896 + (var6.field682.method190((byte) -113) << 8);
            var6.field683 = var6.field682.field2900;
            var6.field691 = var6.field682.field2900 + (var6.field682.method190((byte) 83) << 8);
            class218.method1432(-12955, var6, arg0, arg3, arg4, arg1);
        }
        if (arg2 > -54) {
            field6251 = null;
        }
        for (class53 var7 = (class53) class548.field6848.method2610((byte) -54); var7 != null; var7 = (class53) class548.field6848.method2620(0)) {
            byte var8 = 1;
            class68 var9 = var7.field695.method2169(0);
            if (var7.field695.field4696 != -1 && !var7.field695.field4715) {
                if (var7.field695.field4696 != var9.field915 && var7.field695.field4696 != var9.field931 && ~var7.field695.field4696 != ~var9.field918 && var7.field695.field4696 != var9.field911) {
                    if (var7.field695.field4696 == var9.field897 || ~var7.field695.field4696 == ~var9.field894 || var7.field695.field4696 == var9.field898 || var7.field695.field4696 == var9.field890) {
                        var8 = 3;
                    }
                } else {
                    var8 = 2;
                }
            } else {
                var8 = 0;
            }
            if (var7.field677 != var8) {
                int var10 = class364.method2090(var7.field695, -16422);
                if (var7.field698 == var10 && !var7.field695.field370 == !var7.field678) {
                    var7.field677 = var8;
                    var7.field675 = var7.field695.field346;
                } else {
                    boolean var11 = false;
                    if (var7.field686 != null) {
                        var7.field675 -= 512;
                        if (~var7.field675 >= -1) {
                            class1.field10.method30(var7.field686);
                            var7.field686 = null;
                            var11 = true;
                        }
                    } else {
                        var11 = true;
                    }
                    if (var11) {
                        var7.field675 = var7.field695.field346;
                        var7.field678 = var7.field695.field370;
                        var7.field677 = var8;
                        var7.field698 = var10;
                        var7.field674 = null;
                        var7.field684 = null;
                    }
                }
            }
            var7.field673 = var7.field695.field2896;
            var7.field680 = var7.field695.field2896 + (var7.field695.method190((byte) 60) << 8);
            var7.field683 = var7.field695.field2900;
            var7.field691 = var7.field695.field2900 - -(var7.field695.method190((byte) 79) << 8);
            class218.method1432(-12955, var7, arg0, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 350)
    public class484() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lmc;II)V", line = 226)
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field7646 = ~arg0.method1509(true) == -2;
                }
            } else {
                this.field6241 = ~arg0.method1509(true) == -2;
            }
        } else {
            this.field6243 = ~arg0.method1509(true) == -2;
        }
        int var5 = 28 % ((arg2 - 40) / 52);
        ++field6246;
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V", line = 269)
    public static void method2718(int arg0) {
        field6251 = null;
        field6245 = null;
        if (arg0 == -21990) {
            field6249 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[[I", line = 282)
    public final int[][] method638(int arg0, int arg1) {
        ++field6244;
        if (arg0 != 2017) {
            field6245 = null;
        }
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[][] var4 = this.method3247((byte) -107, 0, !this.field6241 ? arg1 : -arg1 + class104.field1388);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6243) {
                for (int var11 = 0; class418.field5518 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; var12 < class418.field5518; ++var12) {
                    var8[var12] = var5[-var12 + class511.field6519];
                    var9[var12] = var6[-var12 + class511.field6519];
                    var10[var12] = var7[-var12 + class511.field6519];
                }
            }
        }
        return var3;
    }
}
