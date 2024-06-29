import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class263 extends class278 {

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "[S")
    private short[] field3606 = new short[257];

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    private int field3610 = 0;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3604;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "[I")
    private int[] field3601;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "[I")
    private int[] field3603;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "[[I")
    private int[][] field3611;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLlh;)Lth;", line = 4)
    public static final class422 method1515(byte arg0, class365 arg1) {
        ++field3609;
        if (arg0 != -18) {
            field3600 = 68;
        }
        return new class422(arg1.method2069(-126), arg1.method2069(-124), arg1.method2069(-123), arg1.method2069(arg0 + -101), arg1.method2111(-2), arg1.method2099(255));
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 21)
    public final void method207(int arg0) {
        if (this.field3611 == null) {
            this.field3611 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3607;
        if (arg0 > this.field3611.length) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3610 == -3) {
                this.method1522(-91);
            }
            class99.method664((byte) -69);
            this.method1516(1);
        }
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V", line = 41)
    private final void method1516(int arg0) {
        ++field3598;
        if (arg0 == 1) {
            int var2 = this.field3610;
            if (var2 != 2) {
                if (var2 == 1) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; ~var5 > ~(this.field3611.length + -1) && ~var4 <= ~this.field3611[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field3611[var5 - 1];
                        int[] var7 = this.field3611[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = -class441.field6422[(var8 & 8162) >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (var11 >= 32768) {
                            var11 = 32767;
                        }
                        this.field3606[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; var14 < this.field3611.length - 1 && this.field3611[var14][0] <= var13; ++var14) {
                        }
                        int[] var15 = this.field3611[var14 + -1];
                        int[] var16 = this.field3611[var14];
                        int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                        int var18 = 4096 - var17;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (~var19 <= -32769) {
                            var19 = 32767;
                        }
                        this.field3606[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; this.field3611.length + -1 > var22 && var21 >= this.field3611[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field3611[var22 + -1];
                    int[] var24 = this.field3611[var22];
                    int var25 = this.method1521(var22 + -2, 83)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method1521(var22 + 1, arg0 ^ 51)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var25 + var26 + -var27 + var28;
                    int var32 = var25 - var26 - var31;
                    int var33 = var27 - var25;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var36 - -var26 + var35 + var37;
                    if (var38 <= -32768) {
                        var38 = -32767;
                    }
                    if (var38 >= 32768) {
                        var38 = 32767;
                    }
                    this.field3606[var20] = (short) var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BZLss;)V", line = 221)
    public static final void method1517(byte arg0, boolean arg1, class295 arg2) {
        ++field3605;
        int var3 = arg2.field4034 != 0 ? arg2.field4034 : arg2.field4022;
        int var4 = arg2.field4051 == 0 ? arg2.field3960 : arg2.field4051;
        class85.method600(var4, 18219, class522.field7701[arg2.field4073 >> 16], arg2.field4073, arg1, var3);
        if (arg0 < 0) {
            if (arg2.field4050 != null) {
                class85.method600(var4, 18219, arg2.field4050, arg2.field4073, arg1, var3);
            }
            class14 var5 = (class14) class269.field3690.method979((byte) 28, (long) arg2.field4073);
            if (var5 != null) {
                class505.method2968(arg1, var3, var4, var5.field167, (byte) -106);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 249)
    public class263() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Llh;II)V", line = 255)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 != -30446) {
            this.field3611 = null;
        }
        ++field3608;
        if (~arg2 == -1) {
            this.field3610 = arg0.method2099(255);
            this.field3611 = new int[arg0.method2099(arg1 + 30701)][2];
            for (int var4 = 0; ~var4 > ~this.field3611.length; ++var4) {
                this.field3611[var4][0] = arg0.method2062((byte) 14);
                this.field3611[var4][1] = arg0.method2062((byte) 14);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "(I)V", line = 281)
    public static void method1518(int arg0) {
        field3604 = null;
        if (arg0 != -30566) {
            field3604 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)[I", line = 292)
    public final int[] method208(int arg0, int arg1) {
        ++field3599;
        if (arg0 != -9) {
            this.field3611 = null;
        }
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int[] var4 = this.method1570(arg0 + 9, 0, arg1);
            for (int var5 = 0; ~var5 > ~class507.field7456; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3606[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lpp;Lsd;)V", line = 334)
    public static final void method1519(class267 arg0, class61 arg1) {
        if (arg1.field827) {
            short var2 = arg1.field815;
            short var3 = arg1.field822;
            byte var4 = arg1.field826;
            byte var5 = arg1.field836;
            int var6 = (var2 << class34.field484) + class77.field1110;
            int var7 = (var3 << class34.field484) + class77.field1110;
            class61[][] var8 = class385.field5410[var4];
            float var9;
            if (class383.field5391 == class364.field5058) {
                class344.field4741.method466(class19.field195[0].method232(var6, var7), class366.method2119(var2, var3), class232.method1355(var2, var3), class3.method18(var2, var3));
                var9 = 251.5F;
            } else {
                var9 = 201.5F - (float) (var5 + 1) * 50.0F;
            }
            class344.field4741.method440(3000.0F, var9 * 1.5F);
            if (arg1.field817) {
                if (class142.field2033) {
                    if (var4 > 0) {
                        class61 var10 = class385.field5410[var4 - 1][var2][var3];
                        if (var10 != null && var10.field827) {
                            return;
                        }
                    }
                    if (var2 <= class192.field2742 && var2 > class436.field6347) {
                        class61 var11 = var8[var2 - 1][var3];
                        if (var11 != null && var11.field827 && (var11.field817 || (arg1.field828 & 1) == 0)) {
                            return;
                        }
                    }
                    if (var2 >= class192.field2742 && var2 < class364.field5059 - 1) {
                        class61 var12 = var8[var2 + 1][var3];
                        if (var12 != null && var12.field827 && (var12.field817 || (arg1.field828 & 4) == 0)) {
                            return;
                        }
                    }
                    if (var3 <= class141.field2010 && var3 > class300.field4130) {
                        class61 var13 = var8[var2][var3 - 1];
                        if (var13 != null && var13.field827 && (var13.field817 || (arg1.field828 & 8) == 0)) {
                            return;
                        }
                    }
                    if (var3 >= class141.field2010 && var3 < class450.field6492 - 1) {
                        class61 var14 = var8[var2][var3 + 1];
                        if (var14 != null && var14.field827 && (var14.field817 || (arg1.field828 & 2) == 0)) {
                            return;
                        }
                    }
                } else {
                    class142.field2033 = true;
                }
                arg1.field817 = false;
                if (arg1.field834 != null) {
                    class61 var15 = arg1.field834;
                    class344.field4741.method440(3000.0F, (201.5F - (float) (var15.field836 + 1) * 50.0F) * 1.5F);
                    if (!class140.method906(var15.field836, var2, var3)) {
                        class383.field5391[var15.field836].method225(var2, var3);
                    }
                    class134 var16 = var15.field814;
                    if (var16 != null) {
                        if (class132.field1886) {
                            if ((var16.field1942 & arg1.field823) != 0) {
                                class99.method661(arg0, var16.field1942, var5, var2, var3);
                            } else {
                                class205.method1244(arg0, var4, var2, var3);
                            }
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        var16.method402(class344.field4741, 16562);
                    }
                    for (class302 var17 = var15.field819; var17 != null; var17 = var17.field4140) {
                        class33 var18 = var17.field4136;
                        if (var18 != null) {
                            if (class132.field1886) {
                                class205.method1244(arg0, var4, var2, var3);
                                class344.field4741.method490(arg0.field3660, arg0.field3665);
                            }
                            var18.method402(class344.field4741, 16562);
                        }
                    }
                    class344.field4741.method440(3000.0F, var9 * 1.5F);
                }
                boolean var19 = !class140.method906(var5, var2, var3);
                if (var19) {
                    class383.field5391[var5].method225(var2, var3);
                    class180 var20 = arg1.field824;
                    if (var20 != null && var20.field2538) {
                        if (var20.field2537) {
                            class344.field4741.method440(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class132.field1886) {
                            class205.method1244(arg0, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var21 = var20.method402(class344.field4741, 16562);
                        if (var21 != null) {
                            var21.field7328 = var20;
                            var21.field7333 = var4;
                            var21.field7334 = var2;
                            var21.field7330 = var3;
                            class521.field7677.method2310(var21, -21801);
                        }
                        if (var20.field2537) {
                            class344.field4741.method440(3000.0F, var9 * 1.5F);
                        }
                    }
                }
                int var22 = 0;
                int var23 = 0;
                class134 var24 = arg1.field814;
                class463 var25 = arg1.field825;
                if (var24 != null || var25 != null) {
                    if (class192.field2742 == var2) {
                        ++var22;
                    } else if (class192.field2742 < var2) {
                        var22 += 2;
                    }
                    if (class141.field2010 == var3) {
                        var22 += 3;
                    } else if (class141.field2010 > var3) {
                        var22 += 6;
                    }
                    var23 = class450.field6495[var22];
                    arg1.field823 = class437.field6381[var22];
                }
                if (var24 != null) {
                    if ((var24.field1942 & class279.field3770[var22]) != 0) {
                        if (var24.field1942 == 16) {
                            arg1.field830 = 3;
                            arg1.field831 = class496.field7312[var22];
                            arg1.field829 = (byte) (3 - arg1.field831);
                        } else if (var24.field1942 == 32) {
                            arg1.field830 = 6;
                            arg1.field831 = class135.field1945[var22];
                            arg1.field829 = (byte) (6 - arg1.field831);
                        } else if (var24.field1942 == 64) {
                            arg1.field830 = 12;
                            arg1.field831 = class356.field4868[var22];
                            arg1.field829 = (byte) (12 - arg1.field831);
                        } else {
                            arg1.field830 = 9;
                            arg1.field831 = class53.field746[var22];
                            arg1.field829 = (byte) (9 - arg1.field831);
                        }
                    } else {
                        arg1.field830 = 0;
                    }
                    if ((var24.field1942 & var23) != 0 && !class192.method1163(var5, var2, var3, var24.field1942)) {
                        if (class132.field1886) {
                            class205.method1244(arg0, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var26 = var24.method402(class344.field4741, 16562);
                        if (var26 != null) {
                            var26.field7328 = var24;
                            var26.field7333 = var4;
                            var26.field7334 = var2;
                            var26.field7330 = var3;
                            class521.field7677.method2310(var26, -21801);
                        }
                    }
                    class134 var27 = arg1.field832;
                    if (var27 != null && (var27.field1942 & var23) != 0 && !class192.method1163(var5, var2, var3, var27.field1942)) {
                        if (class132.field1886) {
                            class205.method1244(arg0, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var28 = var27.method402(class344.field4741, 16562);
                        if (var28 != null) {
                            var28.field7328 = var27;
                            var28.field7333 = var4;
                            var28.field7334 = var2;
                            var28.field7330 = var3;
                            class521.field7677.method2310(var28, -21801);
                        }
                    }
                }
                if (var25 != null && !class330.method1836(var5, var2, var3, var25.method1837(-96))) {
                    class463 var29 = arg1.field816;
                    class344.field4741.method440(3000.0F, (var9 - 0.5F) * 1.5F);
                    if ((var25.field6728 & var23) != 0) {
                        if (class132.field1886) {
                            class205.method1244(arg0, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var30 = var25.method402(class344.field4741, 16562);
                        if (var30 != null) {
                            var30.field7328 = var25;
                            var30.field7333 = var4;
                            var30.field7334 = var2;
                            var30.field7330 = var3;
                            class521.field7677.method2310(var30, -21801);
                        }
                    } else if (var25.field6728 == 256) {
                        int var31 = var25.field6735 - field3600;
                        int var32 = var25.field6725 - class304.field4172;
                        int var33 = var25.field6724;
                        int var34;
                        if (var33 != 1 && var33 != 2) {
                            var34 = var31;
                        } else {
                            var34 = -var31;
                        }
                        int var35;
                        if (var33 != 2 && var33 != 3) {
                            var35 = var32;
                        } else {
                            var35 = -var32;
                        }
                        if (class132.field1886) {
                            class205.method1244(arg0, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        if (var35 < var34) {
                            class498 var36 = var25.method402(class344.field4741, 16562);
                            if (var36 != null) {
                                var36.field7328 = var25;
                                var36.field7333 = var4;
                                var36.field7334 = var2;
                                var36.field7330 = var3;
                                class521.field7677.method2310(var36, -21801);
                            }
                        } else if (var29 != null) {
                            class498 var37 = var29.method402(class344.field4741, 16562);
                            if (var37 != null) {
                                var37.field7328 = var29;
                                var37.field7333 = var4;
                                var37.field7334 = var2;
                                var37.field7330 = var3;
                                class521.field7677.method2310(var37, -21801);
                            }
                        }
                    }
                    class344.field4741.method440(3000.0F, var9 * 1.5F);
                }
                if (var19) {
                    class180 var38 = arg1.field824;
                    if (var38 != null && !var38.field2538) {
                        if (var38.field2537) {
                            class344.field4741.method440(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class132.field1886) {
                            class205.method1244(arg0, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var39 = var38.method402(class344.field4741, 16562);
                        if (var39 != null) {
                            var39.field7328 = var38;
                            var39.field7333 = var4;
                            var39.field7334 = var2;
                            var39.field7330 = var3;
                            class521.field7677.method2310(var39, -21801);
                        }
                        if (var38.field2537) {
                            class344.field4741.method440(3000.0F, var9 * 1.5F);
                        }
                    }
                    class305 var40 = arg1.field837;
                    if (var40 != null && !var40.field4183) {
                        if (class132.field1886) {
                            class205.method1244(arg0, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var41 = var40.method402(class344.field4741, 16562);
                        if (var41 != null) {
                            var41.field7328 = var40;
                            var41.field7333 = var4;
                            var41.field7334 = var2;
                            var41.field7330 = var3;
                            class521.field7677.method2310(var41, -21801);
                        }
                    }
                }
                byte var42 = arg1.field828;
                if (var42 != 0) {
                    if (var2 < class192.field2742 && (var42 & 4) != 0) {
                        class61 var43 = var8[var2 + 1][var3];
                        if (var43 != null && var43.field827) {
                            class210.field2984.method1956(-128, var43);
                        }
                    }
                    if (var3 < class141.field2010 && (var42 & 2) != 0) {
                        class61 var44 = var8[var2][var3 + 1];
                        if (var44 != null && var44.field827) {
                            class210.field2984.method1956(-119, var44);
                        }
                    }
                    if (var2 > class192.field2742 && (var42 & 1) != 0) {
                        class61 var45 = var8[var2 - 1][var3];
                        if (var45 != null && var45.field827) {
                            class210.field2984.method1956(-125, var45);
                        }
                    }
                    if (var3 > class141.field2010 && (var42 & 8) != 0) {
                        class61 var46 = var8[var2][var3 - 1];
                        if (var46 != null && var46.field827) {
                            class210.field2984.method1956(-119, var46);
                        }
                    }
                }
            }
            if (arg1.field830 != 0) {
                boolean var47 = true;
                for (class302 var48 = arg1.field819; var48 != null; var48 = var48.field4140) {
                    if (class322.field4444 != var48.field4136.field462 && (var48.field4139 & arg1.field830) == arg1.field831) {
                        var47 = false;
                        break;
                    }
                }
                if (var47) {
                    class134 var49 = arg1.field814;
                    if (!class192.method1163(var5, var2, var3, var49.field1942)) {
                        if (class132.field1886) {
                            label682: {
                                if (var49.field1942 >= 16) {
                                    int var50 = var2 - class192.field2742;
                                    int var51 = var3 - class141.field2010;
                                    if (var49.field1942 == 16) {
                                        int var52 = var50 - class77.field1110;
                                        int var53 = class77.field1110 + var51;
                                        if (var53 < var52 && var2 > 0 && var3 <= class472.field6900) {
                                            class205.method1244(arg0, var4, var2 - 1, var3 + 1);
                                            break label682;
                                        }
                                    } else if (var49.field1942 == 32) {
                                        int var54 = class77.field1110 + var50;
                                        int var55 = class77.field1110 + var51;
                                        if (var55 < -var54 && var2 < class469.field6860 && var3 < class472.field6900) {
                                            class205.method1244(arg0, var4, var2 + 1, var3 + 1);
                                            break label682;
                                        }
                                    } else if (var49.field1942 == 64) {
                                        int var56 = class77.field1110 + var50;
                                        int var57 = var51 - class77.field1110;
                                        if (var57 > var56 && var2 < class469.field6860 && var3 > 0) {
                                            class205.method1244(arg0, var4, var2 + 1, var3 - 1);
                                            break label682;
                                        }
                                    } else if (var49.field1942 == 128) {
                                        int var58 = var50 - class77.field1110;
                                        int var59 = var51 - class77.field1110;
                                        if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                            class205.method1244(arg0, var4, var2 - 1, var3 - 1);
                                            break label682;
                                        }
                                    }
                                }
                                class205.method1244(arg0, var4, var2, var3);
                            }
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var60 = var49.method402(class344.field4741, 16562);
                        if (var60 != null) {
                            var60.field7328 = var49;
                            var60.field7333 = var4;
                            var60.field7334 = var2;
                            var60.field7330 = var3;
                            class521.field7677.method2310(var60, -21801);
                        }
                    }
                    arg1.field830 = 0;
                }
            }
            if (arg1.field833) {
                try {
                    arg1.field833 = false;
                    int var61 = 0;
                    label625: for (class302 var62 = arg1.field819; var62 != null; var62 = var62.field4140) {
                        class33 var63 = var62.field4136;
                        if (class322.field4444 != var63.field462) {
                            for (int var64 = var63.field463; var64 <= var63.field456; ++var64) {
                                for (int var65 = var63.field468; var65 <= var63.field471; ++var65) {
                                    class61 var66 = var8[var64][var65];
                                    if (var66.field817) {
                                        arg1.field833 = true;
                                        continue label625;
                                    }
                                    if (var66.field830 != 0) {
                                        int var67 = 0;
                                        if (var64 > var63.field463) {
                                            ++var67;
                                        }
                                        if (var64 < var63.field456) {
                                            var67 += 4;
                                        }
                                        if (var65 > var63.field468) {
                                            var67 += 8;
                                        }
                                        if (var65 < var63.field471) {
                                            var67 += 2;
                                        }
                                        if ((var67 & var66.field830) == arg1.field829) {
                                            arg1.field833 = true;
                                            continue label625;
                                        }
                                    }
                                }
                            }
                            int var68 = class192.field2742 - var63.field463;
                            int var69 = var63.field456 - class192.field2742;
                            if (var69 > var68) {
                                var68 = var69;
                            }
                            int var70 = class141.field2010 - var63.field468;
                            int var71 = var63.field471 - class141.field2010;
                            if (var71 > var70) {
                                var70 = var71;
                            }
                            arg0.field3663[var61] = var63;
                            arg0.field3667[var61++] = var68 + var70;
                        }
                    }
                    while (var61 > 0) {
                        int var72 = -50;
                        int var73 = -1;
                        for (int var74 = 0; var74 < var61; ++var74) {
                            class33 var75 = arg0.field3663[var74];
                            if (class322.field4444 != var75.field462) {
                                int var76 = arg0.field3667[var74];
                                if (var76 > var72) {
                                    var72 = var76;
                                    var73 = var74;
                                } else if (var72 == var76) {
                                    int var77 = var75.field466 - field3600;
                                    int var78 = var75.field461 - class304.field4172;
                                    int var79 = arg0.field3663[var73].field466 - field3600;
                                    int var80 = arg0.field3663[var73].field461 - class304.field4172;
                                    if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                        var73 = var74;
                                    }
                                }
                            }
                        }
                        if (var73 == -1) {
                            break;
                        }
                        class33 var81 = arg0.field3663[var73];
                        var81.field462 = class322.field4444;
                        if (!class295.method1692(var5, var81.field463, var81.field456, var81.field468, var81.field471, var81.method215(0))) {
                            if (class132.field1886) {
                                if (var81.field458 != 0) {
                                    class205.method1244(arg0, var4, var2, var3);
                                    int var82 = var2 - class192.field2742;
                                    int var83 = var3 - class141.field2010;
                                    if (var81.field458 == 2) {
                                        if (var83 > -var82) {
                                            class450.method2653(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                        } else {
                                            class450.method2653(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                        }
                                    } else if (var83 > var82) {
                                        class450.method2653(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                    } else {
                                        class450.method2653(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                    }
                                } else {
                                    class283.method1620(arg0, var4, var81.field463, var81.field468, var81.field456, var81.field471);
                                }
                                class344.field4741.method490(arg0.field3660, arg0.field3665);
                            }
                            class498 var84 = var81.method402(class344.field4741, 16562);
                            if (var84 != null) {
                                var84.field7328 = var81;
                                var84.field7333 = var4;
                                var84.field7334 = var81.field463;
                                var84.field7330 = var81.field468;
                                class521.field7677.method2310(var84, -21801);
                            }
                        }
                        for (int var85 = var81.field463; var85 <= var81.field456; ++var85) {
                            for (int var86 = var81.field468; var86 <= var81.field471; ++var86) {
                                class61 var87 = var8[var85][var86];
                                if (var87.field830 != 0) {
                                    class210.field2984.method1956(-128, var87);
                                } else if ((var2 != var85 || var3 != var86) && var87.field827) {
                                    class210.field2984.method1956(-123, var87);
                                }
                            }
                        }
                    }
                    if (arg1.field833) {
                        return;
                    }
                } catch (Exception var122) {
                    arg1.field833 = false;
                }
            }
            if (arg1.field821 != null && (byte) (class49.field669 & 255) == arg1.field818) {
                class148 var88 = arg1.field821;
                int var89 = class383.field5391[var4].method221(var2, var3);
                int var90;
                if (var4 < class401.field5574 - 1) {
                    var90 = class383.field5391[var4].method221(var2, var3) - class383.field5391[var4 + 1].method221(var2, var3);
                } else {
                    var90 = 8 << class34.field484;
                }
                class246.field3427.method332(var6, var89, var7, arg0.field3659);
                int var91 = arg0.field3659[2];
                class246.field3427.method332(var6, var89 - var90, var7, arg0.field3659);
                int var92 = arg0.field3659[2];
                int var93 = var91;
                int var94 = var92;
                if (var91 > var92) {
                    var93 = var92;
                    var94 = var91;
                }
                int var95 = var93 - class319.field4409;
                int var96 = class319.field4409 + var94;
                var88.field2094 = var95;
                var88.field2091 = var96;
                var88.field2093 = true;
                class344.field4741.method436(var88);
            }
            if (arg1.field827) {
                if (arg1.field830 != 0) {
                    return;
                }
                if (var2 <= class192.field2742 && var2 > class436.field6347) {
                    class61 var97 = var8[var2 - 1][var3];
                    if (var97 != null && var97.field827) {
                        return;
                    }
                }
                if (var2 >= class192.field2742 && var2 < class364.field5059 - 1) {
                    class61 var98 = var8[var2 + 1][var3];
                    if (var98 != null && var98.field827) {
                        return;
                    }
                }
                if (var3 <= class141.field2010 && var3 > class300.field4130) {
                    class61 var99 = var8[var2][var3 - 1];
                    if (var99 != null && var99.field827) {
                        return;
                    }
                }
                if (var3 >= class141.field2010 && var3 < class450.field6492 - 1) {
                    class61 var100 = var8[var2][var3 + 1];
                    if (var100 != null && var100.field827) {
                        return;
                    }
                }
                arg1.field827 = false;
                --class46.field643;
                class305 var101 = arg1.field837;
                if (var101 != null && var101.field4183) {
                    if (class132.field1886) {
                        class205.method1244(arg0, var4, var2, var3);
                        class344.field4741.method490(arg0.field3660, arg0.field3665);
                    }
                    class498 var102 = var101.method402(class344.field4741, 16562);
                    if (var102 != null) {
                        var102.field7328 = var101;
                        var102.field7333 = var4;
                        var102.field7334 = var2;
                        var102.field7330 = var3;
                        class521.field7677.method2310(var102, -21801);
                    }
                }
                if (arg1.field823 != 0) {
                    class463 var103 = arg1.field825;
                    if (var103 != null && !class330.method1836(var5, var2, var3, var103.method1837(-114))) {
                        if ((var103.field6728 & arg1.field823) != 0) {
                            if (class132.field1886) {
                                class205.method1244(arg0, var4, var2, var3);
                                class344.field4741.method490(arg0.field3660, arg0.field3665);
                            }
                            class498 var104 = var103.method402(class344.field4741, 16562);
                            if (var104 != null) {
                                var104.field7328 = var103;
                                var104.field7333 = var4;
                                var104.field7334 = var2;
                                var104.field7330 = var3;
                                class521.field7677.method2310(var104, -21801);
                            }
                        } else if (var103.field6728 == 256) {
                            int var105 = var103.field6735 - field3600;
                            int var106 = var103.field6725 - class304.field4172;
                            int var107 = var103.field6724;
                            int var108;
                            if (var107 != 1 && var107 != 2) {
                                var108 = var105;
                            } else {
                                var108 = -var105;
                            }
                            int var109;
                            if (var107 != 2 && var107 != 3) {
                                var109 = var106;
                            } else {
                                var109 = -var106;
                            }
                            if (class132.field1886) {
                                class205.method1244(arg0, var4, var2, var3);
                                class344.field4741.method490(arg0.field3660, arg0.field3665);
                            }
                            class463 var110 = arg1.field816;
                            if (var109 > var108) {
                                class498 var111 = var103.method402(class344.field4741, 16562);
                                if (var111 != null) {
                                    var111.field7328 = var103;
                                    var111.field7333 = var4;
                                    var111.field7334 = var2;
                                    var111.field7330 = var3;
                                    class521.field7677.method2310(var111, -21801);
                                }
                            } else if (var110 != null) {
                                class498 var112 = var110.method402(class344.field4741, 16562);
                                if (var112 != null) {
                                    var112.field7328 = var110;
                                    var112.field7333 = var4;
                                    var112.field7334 = var2;
                                    var112.field7330 = var3;
                                    class521.field7677.method2310(var112, -21801);
                                }
                            }
                        }
                    }
                    class134 var113 = arg1.field814;
                    class134 var114 = arg1.field832;
                    if (var114 != null && (var114.field1942 & arg1.field823) != 0 && !class192.method1163(var5, var2, var3, var114.field1942)) {
                        if (class132.field1886) {
                            class99.method661(arg0, var114.field1942, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var115 = var114.method402(class344.field4741, 16562);
                        if (var115 != null) {
                            var115.field7328 = var114;
                            var115.field7333 = var4;
                            var115.field7334 = var2;
                            var115.field7330 = var3;
                            class521.field7677.method2310(var115, -21801);
                        }
                    }
                    if (var113 != null && (var113.field1942 & arg1.field823) != 0 && !class192.method1163(var5, var2, var3, var113.field1942)) {
                        if (class132.field1886) {
                            class99.method661(arg0, var113.field1942, var4, var2, var3);
                            class344.field4741.method490(arg0.field3660, arg0.field3665);
                        }
                        class498 var116 = var113.method402(class344.field4741, 16562);
                        if (var116 != null) {
                            var116.field7328 = var113;
                            var116.field7333 = var4;
                            var116.field7334 = var2;
                            var116.field7330 = var3;
                            class521.field7677.method2310(var116, -21801);
                        }
                    }
                }
                if (var4 < class401.field5574 - 1) {
                    class61 var117 = class385.field5410[var4 + 1][var2][var3];
                    if (var117 != null && var117.field827) {
                        class210.field2984.method1957(true, var117);
                    }
                }
                if (var2 < class192.field2742) {
                    class61 var118 = var8[var2 + 1][var3];
                    if (var118 != null && var118.field827) {
                        class210.field2984.method1956(-123, var118);
                    }
                }
                if (var3 < class141.field2010) {
                    class61 var119 = var8[var2][var3 + 1];
                    if (var119 != null && var119.field827) {
                        class210.field2984.method1956(-120, var119);
                    }
                }
                if (var2 > class192.field2742) {
                    class61 var120 = var8[var2 - 1][var3];
                    if (var120 != null && var120.field827) {
                        class210.field2984.method1956(-125, var120);
                    }
                }
                if (var3 > class141.field2010) {
                    class61 var121 = var8[var2][var3 - 1];
                    if (var121 != null && var121.field827) {
                        class210.field2984.method1956(-122, var121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIBIIZIILqp;Lqa;ILc;II)Lc;", line = 1452)
    public static final class121 method1520(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class467 arg9, class162 arg10, int arg11, class121 arg12, int arg13, int arg14) {
        ++field3602;
        if (arg3 != -53) {
            method1515((byte) 82, (class365) null);
        }
        if (arg12 == null) {
            return null;
        } else {
            int var15 = 2055;
            if (arg9 != null) {
                int var16 = var15 | arg9.method2745(false, 29742, -1, arg0);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg13 << 48) + ((long) arg11 << 32) + (long) ((arg7 << 24) + (arg1 << 16) + arg2);
            class9 var19 = class380.field5354;
            class121 var20;
            synchronized (class380.field5354) {
                var20 = (class121) class380.field5354.method56(var17, arg3 + 133);
            }
            if (var20 == null || ~arg10.method472(var20.method775(), var15) != -1) {
                if (var20 != null) {
                    var15 = arg10.method463(var15, var20.method775());
                }
                byte var21;
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        var21 = 12;
                    } else if (arg2 == 3) {
                        var21 = 15;
                    } else if (~arg2 == -5) {
                        var21 = 18;
                    } else {
                        var21 = 21;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class94 var24 = new class94(1 - -(var21 * var22), var21 * 2 * var22 + -var21, 0);
                int var25 = var24.method633(0, 0, 0, -25200);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; var22 > var27; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; ~var30 > ~var21; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class377.field5316[var31] * var28 >> 15;
                        int var33 = class377.field5315[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method633(var33, 0, var32, arg3 + -25147);
                    }
                }
                for (int var34 = 0; var34 < var22; ++var34) {
                    int var35 = (var34 * 256 - -128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg1 * var36 + arg7 * var35 >> 8);
                    short var38 = (short) ((229376 & (896 & arg11) * var36 + (896 & arg13) * var35) + ((64512 & arg11) * var36 + (arg13 & 64512) * var35 & 16515072) + ((arg11 & 127) * var36 + (arg13 & 127) * var35 & 32512) >> 8);
                    for (int var39 = 0; ~var39 > ~var21; ++var39) {
                        if (~var34 == -1) {
                            var24.method629((byte) 127, (short) -1, var26[0][var39], (byte) 1, var38, var26[0][(var39 + 1) % var21], var37, var25, (byte) -1);
                        } else {
                            var24.method629((byte) 118, (short) -1, var26[var34][(var39 + 1) % var21], (byte) 1, var38, var26[var34 + -1][(var39 + 1) % var21], var37, var26[var34 + -1][var39], (byte) -1);
                            var24.method629((byte) 123, (short) -1, var26[var34][var39], (byte) 1, var38, var26[var34][(var39 + 1) % var21], var37, var26[var34 + -1][var39], (byte) -1);
                        }
                    }
                }
                var20 = arg10.method540(var24, var15, class23.field379, 64, 768);
                class9 var40 = class380.field5354;
                synchronized (class380.field5354) {
                    class380.field5354.method73(var17, var20, 26425);
                }
            }
            int var41 = (arg2 << 6) + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg6) {
                if (~arg14 < -13313 || ~arg14 > -3073) {
                    var43 -= 128;
                }
                if (~arg14 < -5121 && arg14 < 11264) {
                    var45 = var41 + 128;
                }
                if (~arg14 < -9217 && ~arg14 > -15361) {
                    var44 = var41 + 128;
                }
                if (~arg14 < -1025 && arg14 < 7168) {
                    var42 -= 128;
                }
            }
            int var46 = arg12.method778();
            int var47 = arg12.method783();
            int var48 = arg12.method799();
            if (~var46 > ~var42) {
                var46 = var42;
            }
            if (var43 > var48) {
                var48 = var43;
            }
            if (var44 < var47) {
                var47 = var44;
            }
            int var49 = arg12.method765();
            if (~var49 < ~var45) {
                var49 = var45;
            }
            class102 var50 = null;
            if (arg9 != null) {
                int var51 = arg9.field6806[arg0];
                var50 = class275.field3740.method1488(-24, var51 >> 16);
                arg0 = var51 & 65535;
            }
            class121 var52;
            if (var50 != null) {
                var52 = var20.method761((byte) 3, var15, true);
                var52.method769(var47 - var46 >> 1, 128, -var48 + var49 >> 1);
                var52.method797(var46 - -var47 >> 1, 0, var48 + var49 >> 1);
                var52.method790(arg0, (byte) -113, var50);
            } else {
                var52 = var20.method761((byte) 3, var15, true);
                var52.method769(var47 - var46 >> 1, 128, -var48 + var49 >> 1);
                var52.method797(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            }
            if (~arg8 != -1) {
                var52.method773(arg8);
            }
            if (arg5 != 0) {
                var52.method805(arg5);
            }
            if (arg4 != 0) {
                var52.method797(0, arg4, 0);
            }
            return var52;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)[I", line = 1668)
    private final int[] method1521(int arg0, int arg1) {
        ++field3597;
        if (~arg0 > -1) {
            return this.field3601;
        } else if (~this.field3611.length >= ~arg0) {
            return this.field3603;
        } else {
            int var3 = -65 / ((-34 - arg1) / 55);
            return this.field3611[arg0];
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V", line = 1687)
    private final void method1522(int arg0) {
        ++field3596;
        int[] var2 = this.field3611[0];
        int var3 = -121 % ((arg0 - -23) / 52);
        int[] var4 = this.field3611[1];
        int[] var5 = this.field3611[this.field3611.length - 2];
        int[] var6 = this.field3611[this.field3611.length + -1];
        this.field3603 = new int[] { -var6[0] - (-var5[0] - var5[0]), var5[1] - (var6[1] + -var5[1]) };
        this.field3601 = new int[] { var2[0] + -var4[0] + var2[0], var2[1] + var2[1] + -var4[1] };
    }
}
