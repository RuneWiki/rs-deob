import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class375 extends class214 {

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
    private int field5305 = 4096;

    @OriginalMember(owner = "client!pr", name = "S", descriptor = "I")
    private int field5309 = 0;

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
    public static int field5302 = 0;

    @OriginalMember(owner = "client!pr", name = "U", descriptor = "Z")
    public static boolean field5311 = true;

    @OriginalMember(owner = "client!pr", name = "W", descriptor = "Z")
    public static boolean field5313 = true;

    @OriginalMember(owner = "client!pr", name = "T", descriptor = "Lsm;")
    public static class249 field5310 = new class249();

    @OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!pr", name = "K", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!pr", name = "R", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!pr", name = "V", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!pr", name = "X", descriptor = "Lu;")
    public static class394 field5314;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)V")
    public static final void method2240(int arg0) {
        ++field5300;
        if (arg0 >= 75) {
            int var1 = class372.method2228(-106);
            if (var1 == 0) {
                class484.field6821 = null;
                class133.method800(0, (byte) -59);
            } else if (~var1 == -2) {
                class123.method760(22586, (byte) 0);
                class133.method800(512, (byte) -114);
                if (class205.field2947 != null) {
                    class79.method542(0);
                }
            } else {
                class123.method760(22586, (byte) (255 & class195.field2771 + -4));
                class133.method800(2, (byte) -90);
            }
            class270.field3747 = class76.field1161;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class375() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lkm;ILfc;)V")
    public static final void method2241(class487 arg0, int arg1, class343 arg2) {
        ++field5301;
        class140[] var3 = class140.method864(arg2, class289.field3980, 0);
        class19.field304 = new class385[var3.length];
        for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
            class19.field304[var4] = arg0.method1139(var3[var4], true);
        }
        class140[] var5 = class140.method864(arg2, class357.field4989, 0);
        class36.field626 = new class385[var5.length];
        for (int var6 = 0; ~var5.length < ~var6; ++var6) {
            class36.field626[var6] = arg0.method1139(var5[var6], true);
        }
        class140[] var7 = class140.method864(arg2, class174.field2566, 0);
        class64.field976 = new class385[var7.length];
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class64.field976[var8] = arg0.method1139(var7[var8], true);
        }
        class140[] var9 = class140.method864(arg2, class440.field6041, 0);
        class388.field5462 = new class385[var9.length];
        for (int var10 = 0; ~var9.length < ~var10; ++var10) {
            class388.field5462[var10] = arg0.method1139(var9[var10], true);
        }
        class140[] var11 = class140.method864(arg2, class122.field1701, 0);
        class308.field4210 = new class385[var11.length];
        for (int var12 = 0; var11.length > var12; ++var12) {
            class308.field4210[var12] = arg0.method1139(var11[var12], true);
        }
        class140[] var13 = class140.method864(arg2, class460.field6472, 0);
        if (arg1 != -8292) {
            method2240(-28);
        }
        class289.field3971 = new class385[var13.length];
        for (int var14 = 0; ~var13.length < ~var14; ++var14) {
            class289.field3971[var14] = arg0.method1139(var13[var14], true);
        }
        class140[] var15 = class140.method864(arg2, class19.field318, 0);
        class376.field5318 = new class385[var15.length];
        for (int var16 = 0; var15.length > var16; ++var16) {
            class376.field5318[var16] = arg0.method1139(var15[var16], true);
        }
        class140[] var17 = class140.method864(arg2, class346.field4728, 0);
        class154.field2221 = new class385[var17.length];
        for (int var18 = 0; ~var17.length < ~var18; ++var18) {
            class154.field2221[var18] = arg0.method1139(var17[var18], true);
        }
        class140[] var19 = class140.method864(arg2, client.field5503, 0);
        class128.field1818 = new class385[var19.length];
        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
            class128.field1818[var20] = arg0.method1139(var19[var20], true);
        }
        class140[] var21 = class140.method864(arg2, class361.field5043, 0);
        class37.field638 = new class385[var21.length];
        for (int var22 = 0; var22 < var21.length; ++var22) {
            class37.field638[var22] = arg0.method1139(var21[var22], true);
        }
        class140[] var23 = class140.method864(arg2, class135.field1888, 0);
        class68.field1006 = new class385[var23.length];
        for (int var24 = 0; var23.length > var24; ++var24) {
            class68.field1006[var24] = arg0.method1139(var23[var24], true);
        }
        class140[] var25 = class140.method864(arg2, class411.field5704, 0);
        class145.field2027 = new class385[var25.length];
        for (int var26 = 0; var26 < var25.length; ++var26) {
            class145.field2027[var26] = arg0.method1139(var25[var26], true);
        }
        class394.field5543 = arg0.method1139(class140.method854(arg2, class396.field5560, 0), true);
        class490.field6912 = arg0.method1139(class140.method854(arg2, class33.field525, 0), true);
        class140[] var27 = class140.method864(arg2, class136.field1925, 0);
        class154.field2225 = new class385[var27.length];
        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
            class154.field2225[var28] = arg0.method1139(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field5304;
        if (arg1 <= -114) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    this.field5305 = arg0.method2508(true);
                }
            } else {
                this.field5309 = arg0.method2508(true);
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
    public static void method2242(byte arg0) {
        field5314 = null;
        if (arg0 != -15) {
            field5313 = false;
        }
        field5310 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V")
    public static final void method2243(boolean arg0, int arg1) {
        class36.field625 = 0;
        class477.field6744 = 0;
        ++field5306;
        class79.method546(0);
        class8.method92(-128, arg0);
        class445.method2591(false);
        if (arg1 != -1) {
            field5302 = -20;
        }
        for (int var2 = 0; ~class36.field625 < ~var2; ++var2) {
            int var4 = class295.field4082[var2];
            if (~class356.field4972 != ~class256.field3581[var4].field1090) {
                if (class256.field3581[var4].field2789.method776(0)) {
                    class7.method87(arg1 + -112, class256.field3581[var4]);
                }
                class256.field3581[var4].method1248((class127) null, -2);
                class256.field3581[var4] = null;
            }
        }
        if (class7.field136 != class388.field5458.field5830) {
            throw new RuntimeException("gnp1 pos:" + class388.field5458.field5830 + " psize:" + class7.field136);
        } else {
            for (int var3 = 0; class32.field520 > var3; ++var3) {
                if (class256.field3581[class42.field718[var3]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class32.field520);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lvb;IILkm;Lms;IIII)V")
    public static final void method2244(class90 arg0, int arg1, int arg2, class487 arg3, class363 arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5303;
        if (arg1 != 0) {
            field5302 = -91;
        }
        class442 var9 = class292.field4009.method85(arg5, true);
        if (var9 != null && var9.field6096 && var9.method2571(true, class320.field4376)) {
            if (var9.field6063 != null) {
                int[] var10 = new int[var9.field6063.length];
                for (int var11 = 0; var10.length / 2 > var11; ++var11) {
                    int var13;
                    if (field5312 != 4) {
                        var13 = (int) class418.field5750 + class361.field5042 & 16383;
                    } else {
                        var13 = 16383 & (int) class418.field5750;
                    }
                    int var14 = class432.field5955[var13];
                    int var15 = class432.field5957[var13];
                    if (~field5312 != -5) {
                        var14 = var14 * 256 / (class351.field4804 + 256);
                        var15 = var15 * 256 / (class351.field4804 + 256);
                    }
                    var10[var11 * 2] = ((var9.field6063[var11 * 2] * 4 + arg6) * var15 + (var9.field6063[var11 * 2 - -1] * 4 + arg7) * var14 >> 15) + arg4.field5101 / 2 + arg2;
                    var10[var11 * 2 + 1] = -((var9.field6063[var11 * 2 + 1] * 4 + arg7) * var15 + -((var9.field6063[var11 * 2] * 4 + arg6) * var14) >> 15) + arg8 - -(arg4.field5200 / 2);
                }
                class276.method1727(arg3, var10, var9.field6067, arg4.field5193, arg4.field5174);
                for (int var12 = 0; ~(var10.length / 2 + -1) < ~var12; ++var12) {
                    arg3.method1090(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 2 + 1], var9.field6099, 1, arg0, arg2, arg8);
                }
                arg3.method1090(var10[var10.length - 2], var10[var10.length + -1], var10[0], var10[1], var9.field6099, 1, arg0, arg2, arg8);
            }
            class385 var16 = null;
            if (var9.field6071 != -1) {
                var16 = var9.method2566(false, (byte) -128, arg3);
                if (var16 != null) {
                    class232.method1455(-256, arg7, arg4, arg2, arg6, arg0, var16, arg8);
                }
            }
            if (var9.field6068 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method394();
                }
                class485 var18 = class96.field1381;
                class76 var19 = class329.field4538;
                if (var9.field6094 == 1) {
                    var18 = class262.field3662;
                    var19 = class437.field5993;
                }
                if (var9.field6094 == 2) {
                    var19 = class328.field4531;
                    var18 = class211.field2981;
                }
                class340.method2013((byte) 101, arg0, arg2, var9.field6064, arg7, var9.field6068, arg6, arg8, var19, arg4, var17, var18);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field5308;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (arg0 != 123) {
            method2244((class90) null, 64, -84, (class487) null, (class363) null, -87, -82, -87, -52);
        }
        if (super.field3024.field6135) {
            int[] var4 = this.method1352(arg1, 0, -54);
            for (int var5 = 0; ~var5 > ~class399.field5585; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field5309 <= var6 && this.field5305 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
