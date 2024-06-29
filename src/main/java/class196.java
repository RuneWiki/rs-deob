import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class196 extends class74 {

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "Z")
    private boolean field3079 = true;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "Z")
    private boolean field3089 = true;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "Z")
    public static boolean field3083 = true;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public static int field3082 = 1;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "[I")
    public static int[] field3090 = new int[32];

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V")
    public static void method1312(int arg0) {
        if (arg0 != 8424) {
            method1316(-87, -91, (byte) 119);
        }
        field3090 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BZ)V")
    public static final void method1313(byte arg0, boolean arg1) {
        ++field3091;
        byte var2 = 4;
        byte[][] var3 = class259.field3987;
        int[] var4 = null;
        for (int var5 = 0; var2 > var5; ++var5) {
            class130.method916(-111);
            for (int var6 = 0; ~var6 > -14; ++var6) {
                for (int var7 = 0; ~var7 > -14; ++var7) {
                    boolean var8 = false;
                    int var9 = class290.field4566[var5][var6][var7];
                    if (~var9 != 0) {
                        int var10 = (var9 & 54979699) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = (var9 & 16765328) >> 14;
                            int var12 = 3 & var9 >> 1;
                            int var13 = (16382 & var9) >> 3;
                            int var14 = (var11 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class221.field3454.length; ++var15) {
                                if (class221.field3454[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class16.method154(class72.field1142, var3[var15], arg1, var11, var7 * 8, var10, var12, (byte) -52, var13, var6 * 8, var5);
                                    var8 = true;
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class130.method918(var5, 8, 106, 8, var7 * 8, var6 * 8);
                    }
                }
            }
        }
        if (arg0 < 4) {
            field3083 = false;
        }
        if (var4 != null) {
            class188.field3013 = var4[1];
            class224.field3523 = var4[3];
            class69.field1097 = var4[0];
            class167.field2528 = var4[2];
            class177.field2651 = var4[4];
        } else {
            class69.field1097 = -1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([BZI[Lng;II)V")
    public static final void method1314(byte[] arg0, boolean arg1, int arg2, class77[] arg3, int arg4, int arg5) {
        ++field3087;
        class37 var6 = new class37(arg0);
        int var7 = -1;
        if (arg4 == 2) {
            while (true) {
                int var8 = var6.method317(-101);
                if (~var8 == -1) {
                    return;
                }
                var7 += var8;
                int var9 = 0;
                while (true) {
                    int var10 = var6.method285((byte) 35);
                    if (var10 == 0) {
                        break;
                    }
                    int var11 = var6.method333((byte) -59);
                    int var12 = 3 & var11;
                    int var13 = var11 >> 2;
                    var9 += var10 + -1;
                    int var14 = (var9 & 4038) >> 6;
                    int var15 = arg2 + var14;
                    int var16 = var9 >> 12;
                    int var17 = var9 & 63;
                    int var18 = var17 - -arg5;
                    if (~var15 < -1 && ~var18 < -1 && ~var15 > -104 && var18 < 103) {
                        class77 var19 = null;
                        if (!arg1) {
                            int var20 = var16;
                            if ((class191.field3041[1][var15][var18] & 2) == 2) {
                                var20 = var16 - 1;
                            }
                            if (~var20 <= -1) {
                                var19 = arg3[var20];
                            }
                        }
                        class7.method83(arg1, var7, var12, var16, var18, var16, var13, var15, -125, !arg1, var19);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        if (arg1 > -112) {
            this.field3089 = true;
        }
        ++field3084;
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[][] var4 = this.method592(!this.field3079 ? arg0 : -arg0 + class218.field3419, 0, 115);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field3089) {
                for (int var11 = 0; ~var11 > ~class178.field2662; ++var11) {
                    var7[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var8[var11];
                }
            } else {
                for (int var12 = 0; class178.field2662 > var12; ++var12) {
                    var7[var12] = var5[-var12 + class129.field2012];
                    var9[var12] = var6[class129.field2012 - var12];
                    var10[var12] = var8[-var12 + class129.field2012];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            return null;
        } else {
            if (super.field1254.field3118) {
                int[] var4 = this.method590(0, 0, this.field3079 ? class218.field3419 - arg1 : arg1);
                if (this.field3089) {
                    for (int var5 = 0; class178.field2662 > var5; ++var5) {
                        var3[var5] = var4[-var5 + class129.field2012];
                    }
                } else {
                    class236.method1585(var4, 0, var3, 0, class178.field2662);
                }
            }
            ++field3088;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(Z)V")
    public static final void method1315(boolean arg0) {
        if (class33.field531 != null) {
            class33.field531.method70(50);
        }
        ++field3081;
        if (class46.field737 != null) {
            class46.field737.method70(50);
        }
        if (arg0) {
            field3090 = null;
        }
        class153.method1030(class43.field688, 22050, 2, 1729);
        class33.field531 = class47.method385(0, -124, class22.field329, class189.field3021, 22050);
        class33.field531.method55((byte) -124, class102.field1631);
        class46.field737 = class47.method385(1, -122, class22.field329, class189.field3021, 2048);
        class46.field737.method55((byte) -121, class39.field661);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIB)V")
    public static final void method1316(int arg0, int arg1, byte arg2) {
        class295 var3 = class250.method1673(9, 12, arg1);
        ++field3086;
        int var4 = -92 % ((arg2 - -23) / 46);
        var3.method1980(1022716908);
        var3.field4632 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class196() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            this.method448(-36, -54);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1245 = ~arg1.method333((byte) -59) == -2;
                }
            } else {
                this.field3079 = arg1.method333((byte) -59) == 1;
            }
        } else {
            this.field3089 = ~arg1.method333((byte) -59) == -2;
        }
        ++field3085;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field3090[var1] = var0 + -1;
            var0 += var0;
        }
    }
}
