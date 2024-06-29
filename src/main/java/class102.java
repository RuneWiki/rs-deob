import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class102 extends class30 {

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    private int field1153;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "F")
    public static float field1155 = 0.0F;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "[I")
    public static int[] field1165 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!op", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1162 = "slide:";

    @OriginalMember(owner = "client!op", name = "E", descriptor = "[I")
    public static int[] field1168 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!op", name = "q", descriptor = "[Lqa;")
    public static class134[] field1154 = new class134[16];

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "Lbd;")
    public static class38 field1152;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIILmb;Lmb;)V")
    public static final void method548(int arg0, int arg1, int arg2, class143 arg3, class143 arg4) {
        if (class19.field202[arg0][arg1][arg2] == null) {
            class252.method1578(arg0, arg1, arg2);
        }
        class19.field202[arg0][arg1][arg2].field4311 = arg3;
        class19.field202[arg0][arg1][arg2].field4306 = arg4;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static final void method549(int arg0) {
        ++field1158;
        if (~class213.field2908 != -3) {
            try {
                class250.method1569("tbrefresh", class407.field5920, 18050);
            } catch (Throwable var1) {
            }
            if (arg0 > -97) {
                field1168 = null;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIBII)V")
    public static final void method550(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field1151;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = 10 / ((61 - arg3) / 58);
        int var19 = ((arg2 << 1) + -3) * var11;
        int var20 = (var6 + 1) * var16;
        int var21 = (arg2 + -1) * var15;
        if (~arg5 <= ~class20.field209 && ~arg5 >= ~class407.field5914) {
            int var22 = class115.method640((byte) -68, class128.field1785, arg0 + arg4, class143.field2029);
            int var23 = class115.method640((byte) -120, class128.field1785, -arg4 + arg0, class143.field2029);
            class105.method564(arg1, var23, 0, class318.field4522[arg5], var22);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var14 += var20;
                    var13 += var17;
                    var17 += var16;
                    ++var6;
                    var20 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var20;
                var17 += var16;
                ++var6;
                var20 += var16;
            }
            var13 += -var21;
            var14 += -var19;
            var19 -= var15;
            --var7;
            var21 -= var15;
            int var24 = arg5 - var7;
            int var25 = arg5 + var7;
            if (var25 >= class20.field209 && var24 <= class407.field5914) {
                int var26 = class115.method640((byte) -119, class128.field1785, arg0 + var6, class143.field2029);
                int var27 = class115.method640((byte) -90, class128.field1785, arg0 - var6, class143.field2029);
                if (class20.field209 <= var24) {
                    class105.method564(arg1, var27, 0, class318.field4522[var24], var26);
                }
                if (~class407.field5914 <= ~var25) {
                    class105.method564(arg1, var27, 0, class318.field4522[var25], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIIII)V")
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1166 = arg2;
        this.field1153 = arg1;
        this.field1149 = arg0;
        this.field1156 = arg3;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public static void method551(int arg0) {
        field1162 = null;
        field1154 = null;
        if (arg0 <= -73) {
            field1165 = null;
            field1152 = null;
            field1168 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
    public final void method174(int arg0, int arg1, int arg2) {
        ++field1164;
        int var4 = this.field1149 * arg0 >> 12;
        if (arg1 != 27492) {
            method549(-33);
        }
        int var5 = this.field1166 * arg0 >> 12;
        int var6 = this.field1153 * arg2 >> 12;
        int var7 = this.field1156 * arg2 >> 12;
        class41.method258(var7, var5, var6, super.field276, (byte) -127, var4);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIB)V")
    public final void method170(int arg0, int arg1, byte arg2) {
        if (arg2 <= 99) {
            method554(-91, -128, -118);
        }
        ++field1159;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(IIB)V")
    public final void method172(int arg0, int arg1, byte arg2) {
        ++field1148;
        int var4 = this.field1149 * arg1 >> 12;
        if (arg2 == 78) {
            int var5 = this.field1166 * arg1 >> 12;
            int var6 = this.field1153 * arg0 >> 12;
            int var7 = this.field1156 * arg0 >> 12;
            class150.method892(super.field276, super.field270, var7, 1, super.field277, var4, var5, var6);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method552(byte arg0, byte[] arg1) {
        ++field1160;
        class211 var2 = new class211(arg1);
        int var3 = var2.method1342((byte) -126);
        if (arg0 > -86) {
            return null;
        } else {
            int var4 = var2.method1336((byte) -67);
            if (~var4 <= -1 && (class436.field6393 == 0 || class436.field6393 >= var4)) {
                if (~var3 == -1) {
                    byte[] var5 = new byte[var4];
                    var2.method1370(var5, 0, 19294, var4);
                    return var5;
                } else {
                    int var6 = var2.method1336((byte) -113);
                    if (~var6 <= -1 && (class436.field6393 == 0 || class436.field6393 >= var6)) {
                        byte[] var7 = new byte[var6];
                        if (var3 != 1) {
                            class97.field1088.method2174((byte) 29, var7, var2);
                        } else {
                            class429.method2669(var7, var6, arg1, var4, 9);
                        }
                        return var7;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLen;Lra;)V")
    public static final void method553(boolean arg0, class174 arg1, class57 arg2) {
        ++field1169;
        if (!class390.field5714) {
            arg1.method929(0);
            class51.field589 = arg1.method955(class145.method862(arg2, class302.field4325), true);
            class51.field589.method90((class38.field389 + -class51.field589.method52()) / 2, (class222.field3039 + -class51.field589.method47()) / 2);
            class32.field302 = arg1.method955(class145.method862(arg2, class382.field5605), true);
            class32.field302.method90((class38.field389 - class32.field302.method52()) / 2, 18);
            class390.field5714 = arg0;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(III)V")
    public static final void method554(int arg0, int arg1, int arg2) {
        class302 var3 = class19.field202[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field4313 != null) {
                var3.field4313 = null;
            }
            if (var3.field4324 != null) {
                var3.field4324 = null;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
    public static final void method555(int arg0) {
        if (arg0 != 3) {
            method552((byte) 115, (byte[]) null);
        }
        ++field1167;
        class331 var1 = class350.field5107;
        synchronized (class350.field5107) {
            class350.field5107.method2052(0);
        }
        class331 var2 = class422.field6060;
        synchronized (class422.field6060) {
            class422.field6060.method2052(0);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Llj;Ldn;)V")
    public static final void method556(class362 arg0, class302 arg1) {
        if (arg1.field4312) {
            short var2 = arg1.field4315;
            short var3 = arg1.field4323;
            byte var4 = arg1.field4321;
            byte var5 = arg1.field4303;
            int var6 = (var2 << 7) + 64;
            int var7 = (var3 << 7) + 64;
            class302[][] var8 = class19.field202[var4];
            float var10;
            if (class132.field1814 == class111.field1285) {
                int var9 = class41.field481[var2][var3];
                class118.field1400.method928(class78.field887[0].method1991(var6, var7), var9 & 16777215, var9 >>> 21 & 2040);
                var10 = 201.5F;
            } else {
                var10 = 201.5F - (float) (var5 + 1) * 50.0F;
            }
            class118.field1400.method1017(3000.0F, var10 * 1.5F);
            if (arg1.field4304) {
                if (class362.field5275) {
                    if (var4 > 0) {
                        class302 var11 = class19.field202[var4 - 1][var2][var3];
                        if (var11 != null && var11.field4312) {
                            return;
                        }
                    }
                    if (var2 <= class239.field3251 && var2 > class279.field3932) {
                        class302 var12 = var8[var2 - 1][var3];
                        if (var12 != null && var12.field4312 && (var12.field4304 || (arg1.field4319 & 1) == 0)) {
                            return;
                        }
                    }
                    if (var2 >= class239.field3251 && var2 < class197.field2682 - 1) {
                        class302 var13 = var8[var2 + 1][var3];
                        if (var13 != null && var13.field4312 && (var13.field4304 || (arg1.field4319 & 4) == 0)) {
                            return;
                        }
                    }
                    if (var3 <= class326.field4585 && var3 > class256.field3445) {
                        class302 var14 = var8[var2][var3 - 1];
                        if (var14 != null && var14.field4312 && (var14.field4304 || (arg1.field4319 & 8) == 0)) {
                            return;
                        }
                    }
                    if (var3 >= class326.field4585 && var3 < class440.field6441 - 1) {
                        class302 var15 = var8[var2][var3 + 1];
                        if (var15 != null && var15.field4312 && (var15.field4304 || (arg1.field4319 & 2) == 0)) {
                            return;
                        }
                    }
                } else {
                    class362.field5275 = true;
                }
                arg1.field4304 = false;
                if (arg1.field4327 != null) {
                    class302 var16 = arg1.field4327;
                    class118.field1400.method1017(3000.0F, (201.5F - (float) (var16.field4303 + 1) * 50.0F) * 1.5F);
                    if (!class377.method2370(var16.field4303, var2, var3)) {
                        class132.field1814[var16.field4303].method1982(var2, var3);
                    }
                    class436 var17 = var16.field4313;
                    if (var17 != null) {
                        if (class324.field4572) {
                            if ((var17.field6396 & arg1.field4314) != 0) {
                                class139.method828(arg0, var17.field6396, var5, var2, var3);
                            } else {
                                class201.method1290(arg0, var4, var2, var3);
                            }
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        var17.method213(-24, class118.field1400);
                    }
                    for (class299 var18 = var16.field4308; var18 != null; var18 = var18.field4263) {
                        class113 var19 = var18.field4261;
                        if (var19 != null) {
                            if (class324.field4572) {
                                class201.method1290(arg0, var4, var2, var3);
                                class118.field1400.method926(arg0.field5282, arg0.field5280);
                            }
                            var19.method213(-35, class118.field1400);
                        }
                    }
                    class118.field1400.method1017(3000.0F, var10 * 1.5F);
                }
                boolean var20 = !class377.method2370(var5, var2, var3);
                if (var20) {
                    class132.field1814[var5].method1982(var2, var3);
                    class276 var21 = arg1.field4310;
                    if (var21 != null && var21.field3887) {
                        if (var21.field3890) {
                            class118.field1400.method1017(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class324.field4572) {
                            class201.method1290(arg0, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var22 = var21.method213(-125, class118.field1400);
                        if (var22 != null) {
                            var22.field189 = var21;
                            var22.field193 = var4;
                            var22.field190 = var2;
                            var22.field194 = var3;
                            class148.field2068.method1605(var22, -14638);
                        }
                        if (var21.field3890) {
                            class118.field1400.method1017(3000.0F, var10 * 1.5F);
                        }
                    }
                }
                int var23 = 0;
                int var24 = 0;
                class436 var25 = arg1.field4313;
                class143 var26 = arg1.field4311;
                if (var25 != null || var26 != null) {
                    if (class239.field3251 == var2) {
                        ++var23;
                    } else if (class239.field3251 < var2) {
                        var23 += 2;
                    }
                    if (class326.field4585 == var3) {
                        var23 += 3;
                    } else if (class326.field4585 > var3) {
                        var23 += 6;
                    }
                    var24 = class275.field3881[var23];
                    arg1.field4314 = class155.field2212[var23];
                }
                if (var25 != null) {
                    if ((var25.field6396 & class216.field2938[var23]) != 0) {
                        if (var25.field6396 == 16) {
                            arg1.field4305 = 3;
                            arg1.field4328 = class146.field2050[var23];
                            arg1.field4317 = (byte) (3 - arg1.field4328);
                        } else if (var25.field6396 == 32) {
                            arg1.field4305 = 6;
                            arg1.field4328 = class52.field595[var23];
                            arg1.field4317 = (byte) (6 - arg1.field4328);
                        } else if (var25.field6396 == 64) {
                            arg1.field4305 = 12;
                            arg1.field4328 = class217.field2976[var23];
                            arg1.field4317 = (byte) (12 - arg1.field4328);
                        } else {
                            arg1.field4305 = 9;
                            arg1.field4328 = class195.field2646[var23];
                            arg1.field4317 = (byte) (9 - arg1.field4328);
                        }
                    } else {
                        arg1.field4305 = 0;
                    }
                    if ((var25.field6396 & var24) != 0 && !class144.method851(var5, var2, var3, var25.field6396)) {
                        if (class324.field4572) {
                            class201.method1290(arg0, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var27 = var25.method213(-55, class118.field1400);
                        if (var27 != null) {
                            var27.field189 = var25;
                            var27.field193 = var4;
                            var27.field190 = var2;
                            var27.field194 = var3;
                            class148.field2068.method1605(var27, -14638);
                        }
                    }
                    class436 var28 = arg1.field4324;
                    if (var28 != null && (var28.field6396 & var24) != 0 && !class144.method851(var5, var2, var3, var28.field6396)) {
                        if (class324.field4572) {
                            class201.method1290(arg0, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var29 = var28.method213(-25, class118.field1400);
                        if (var29 != null) {
                            var29.field189 = var28;
                            var29.field193 = var4;
                            var29.field190 = var2;
                            var29.field194 = var3;
                            class148.field2068.method1605(var29, -14638);
                        }
                    }
                }
                if (var26 != null && !class324.method2001(var5, var2, var3, var26.method431(119))) {
                    class143 var30 = arg1.field4306;
                    class118.field1400.method1017(3000.0F, (var10 - 0.5F) * 1.5F);
                    if ((var26.field2014 & var24) != 0) {
                        if (class324.field4572) {
                            class201.method1290(arg0, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var31 = var26.method213(-30, class118.field1400);
                        if (var31 != null) {
                            var31.field189 = var26;
                            var31.field193 = var4;
                            var31.field190 = var2;
                            var31.field194 = var3;
                            class148.field2068.method1605(var31, -14638);
                        }
                    } else if (var26.field2014 == 256) {
                        int var32 = var26.field2018 - class170.field2390;
                        int var33 = var26.field2021 - class24.field238;
                        int var34 = var26.field2019;
                        int var35;
                        if (var34 != 1 && var34 != 2) {
                            var35 = var32;
                        } else {
                            var35 = -var32;
                        }
                        int var36;
                        if (var34 != 2 && var34 != 3) {
                            var36 = var33;
                        } else {
                            var36 = -var33;
                        }
                        if (class324.field4572) {
                            class201.method1290(arg0, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        if (var36 < var35) {
                            class19 var37 = var26.method213(-12, class118.field1400);
                            if (var37 != null) {
                                var37.field189 = var26;
                                var37.field193 = var4;
                                var37.field190 = var2;
                                var37.field194 = var3;
                                class148.field2068.method1605(var37, -14638);
                            }
                        } else if (var30 != null) {
                            class19 var38 = var30.method213(-8, class118.field1400);
                            if (var38 != null) {
                                var38.field189 = var30;
                                var38.field193 = var4;
                                var38.field190 = var2;
                                var38.field194 = var3;
                                class148.field2068.method1605(var38, -14638);
                            }
                        }
                    }
                    class118.field1400.method1017(3000.0F, var10 * 1.5F);
                }
                if (var20) {
                    class276 var39 = arg1.field4310;
                    if (var39 != null && !var39.field3887) {
                        if (var39.field3890) {
                            class118.field1400.method1017(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class324.field4572) {
                            class201.method1290(arg0, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var40 = var39.method213(-75, class118.field1400);
                        if (var40 != null) {
                            var40.field189 = var39;
                            var40.field193 = var4;
                            var40.field190 = var2;
                            var40.field194 = var3;
                            class148.field2068.method1605(var40, -14638);
                        }
                        if (var39.field3890) {
                            class118.field1400.method1017(3000.0F, var10 * 1.5F);
                        }
                    }
                    class240 var41 = arg1.field4316;
                    if (var41 != null && !var41.field3258) {
                        if (class324.field4572) {
                            class201.method1290(arg0, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var42 = var41.method213(-79, class118.field1400);
                        if (var42 != null) {
                            var42.field189 = var41;
                            var42.field193 = var4;
                            var42.field190 = var2;
                            var42.field194 = var3;
                            class148.field2068.method1605(var42, -14638);
                        }
                    }
                }
                byte var43 = arg1.field4319;
                if (var43 != 0) {
                    if (var2 < class239.field3251 && (var43 & 4) != 0) {
                        class302 var44 = var8[var2 + 1][var3];
                        if (var44 != null && var44.field4312) {
                            class341.field5015.method1091(var44, -32426);
                        }
                    }
                    if (var3 < class326.field4585 && (var43 & 2) != 0) {
                        class302 var45 = var8[var2][var3 + 1];
                        if (var45 != null && var45.field4312) {
                            class341.field5015.method1091(var45, -32426);
                        }
                    }
                    if (var2 > class239.field3251 && (var43 & 1) != 0) {
                        class302 var46 = var8[var2 - 1][var3];
                        if (var46 != null && var46.field4312) {
                            class341.field5015.method1091(var46, -32426);
                        }
                    }
                    if (var3 > class326.field4585 && (var43 & 8) != 0) {
                        class302 var47 = var8[var2][var3 - 1];
                        if (var47 != null && var47.field4312) {
                            class341.field5015.method1091(var47, -32426);
                        }
                    }
                }
            }
            if (arg1.field4305 != 0) {
                boolean var48 = true;
                for (class299 var49 = arg1.field4308; var49 != null; var49 = var49.field4263) {
                    if (class281.field3953 != var49.field4261.field1315 && (var49.field4259 & arg1.field4305) == arg1.field4328) {
                        var48 = false;
                        break;
                    }
                }
                if (var48) {
                    class436 var50 = arg1.field4313;
                    if (!class144.method851(var5, var2, var3, var50.field6396)) {
                        if (class324.field4572) {
                            label687: {
                                if (var50.field6396 >= 16) {
                                    int var51 = var2 - class239.field3251;
                                    int var52 = var3 - class326.field4585;
                                    if (var50.field6396 == 16) {
                                        var51 -= 64;
                                        var52 += 64;
                                        if (var52 < var51 && var2 > 0 && var3 <= class52.field598) {
                                            class201.method1290(arg0, var4, var2 - 1, var3 + 1);
                                            break label687;
                                        }
                                    } else if (var50.field6396 == 32) {
                                        var51 += 64;
                                        var52 += 64;
                                        if (var52 < -var51 && var2 < class158.field2245 && var3 < class52.field598) {
                                            class201.method1290(arg0, var4, var2 + 1, var3 + 1);
                                            break label687;
                                        }
                                    } else if (var50.field6396 == 64) {
                                        var51 += 64;
                                        var52 -= 64;
                                        if (var52 > var51 && var2 < class158.field2245 && var3 > 0) {
                                            class201.method1290(arg0, var4, var2 + 1, var3 - 1);
                                            break label687;
                                        }
                                    } else if (var50.field6396 == 128) {
                                        var51 -= 64;
                                        var52 -= 64;
                                        if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                            class201.method1290(arg0, var4, var2 - 1, var3 - 1);
                                            break label687;
                                        }
                                    }
                                }
                                class201.method1290(arg0, var4, var2, var3);
                            }
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var53 = var50.method213(-35, class118.field1400);
                        if (var53 != null) {
                            var53.field189 = var50;
                            var53.field193 = var4;
                            var53.field190 = var2;
                            var53.field194 = var3;
                            class148.field2068.method1605(var53, -14638);
                        }
                    }
                    arg1.field4305 = 0;
                }
            }
            if (arg1.field4307) {
                try {
                    arg1.field4307 = false;
                    int var54 = 0;
                    label630: for (class299 var55 = arg1.field4308; var55 != null; var55 = var55.field4263) {
                        class113 var56 = var55.field4261;
                        if (class281.field3953 != var56.field1315) {
                            for (int var57 = var56.field1316; var57 <= var56.field1298; ++var57) {
                                for (int var58 = var56.field1305; var58 <= var56.field1299; ++var58) {
                                    class302 var59 = var8[var57][var58];
                                    if (var59.field4304) {
                                        arg1.field4307 = true;
                                        continue label630;
                                    }
                                    if (var59.field4305 != 0) {
                                        int var60 = 0;
                                        if (var57 > var56.field1316) {
                                            ++var60;
                                        }
                                        if (var57 < var56.field1298) {
                                            var60 += 4;
                                        }
                                        if (var58 > var56.field1305) {
                                            var60 += 8;
                                        }
                                        if (var58 < var56.field1299) {
                                            var60 += 2;
                                        }
                                        if ((var60 & var59.field4305) == arg1.field4317) {
                                            arg1.field4307 = true;
                                            continue label630;
                                        }
                                    }
                                }
                            }
                            int var61 = class239.field3251 - var56.field1316;
                            int var62 = var56.field1298 - class239.field3251;
                            if (var62 > var61) {
                                var61 = var62;
                            }
                            int var63 = class326.field4585 - var56.field1305;
                            int var64 = var56.field1299 - class326.field4585;
                            if (var64 > var63) {
                                var63 = var64;
                            }
                            arg0.field5272[var54] = var56;
                            arg0.field5278[var54++] = var61 + var63;
                        }
                    }
                    while (var54 > 0) {
                        int var65 = -50;
                        int var66 = -1;
                        for (int var67 = 0; var67 < var54; ++var67) {
                            class113 var68 = arg0.field5272[var67];
                            if (class281.field3953 != var68.field1315) {
                                int var69 = arg0.field5278[var67];
                                if (var69 > var65) {
                                    var65 = var69;
                                    var66 = var67;
                                } else if (var65 == var69) {
                                    int var70 = var68.field1304 - class170.field2390;
                                    int var71 = var68.field1311 - class24.field238;
                                    int var72 = arg0.field5272[var66].field1304 - class170.field2390;
                                    int var73 = arg0.field5272[var66].field1311 - class24.field238;
                                    if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                        var66 = var67;
                                    }
                                }
                            }
                        }
                        if (var66 == -1) {
                            break;
                        }
                        class113 var74 = arg0.field5272[var66];
                        var74.field1315 = class281.field3953;
                        if (!class311.method1950(var5, var74.field1316, var74.field1298, var74.field1305, var74.field1299, var74.method222(26841))) {
                            if (class324.field4572) {
                                if (var74.field1307 != 0) {
                                    class201.method1290(arg0, var4, var2, var3);
                                    int var75 = var2 - class239.field3251;
                                    int var76 = var3 - class326.field4585;
                                    if (var74.field1307 == 2) {
                                        if (var76 > -var75) {
                                            class282.method1807(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                        } else {
                                            class282.method1807(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                        }
                                    } else if (var76 > var75) {
                                        class282.method1807(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                    } else {
                                        class282.method1807(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                    }
                                } else {
                                    class421.method2612(arg0, var4, var74.field1316, var74.field1305, var74.field1298, var74.field1299);
                                }
                                class118.field1400.method926(arg0.field5282, arg0.field5280);
                            }
                            class19 var77 = var74.method213(-108, class118.field1400);
                            if (var77 != null) {
                                var77.field189 = var74;
                                var77.field193 = var4;
                                var77.field190 = var74.field1316;
                                var77.field194 = var74.field1305;
                                class148.field2068.method1605(var77, -14638);
                            }
                        }
                        for (int var78 = var74.field1316; var78 <= var74.field1298; ++var78) {
                            for (int var79 = var74.field1305; var79 <= var74.field1299; ++var79) {
                                class302 var80 = var8[var78][var79];
                                if (var80.field4305 != 0) {
                                    class341.field5015.method1091(var80, -32426);
                                } else if ((var2 != var78 || var3 != var79) && var80.field4312) {
                                    class341.field5015.method1091(var80, -32426);
                                }
                            }
                        }
                    }
                    if (arg1.field4307) {
                        return;
                    }
                } catch (Exception var113) {
                    arg1.field4307 = false;
                }
            }
            if (arg1.field4322 != null) {
                if ((byte) (class225.field3072 & 255) == arg1.field4329) {
                    class271 var81 = arg1.field4322;
                    int var82 = class132.field1814[var4].method1990(var2, var3);
                    int var83;
                    if (var4 < 3) {
                        var83 = class132.field1814[var4].method1990(var2, var3) - class132.field1814[var4 + 1].method1990(var2, var3);
                    } else {
                        var83 = 1024;
                    }
                    class300.field4277.method130(var6, var82, var7, arg0.field5271);
                    int var84 = arg0.field5271[2];
                    class300.field4277.method130(var6, var82 - var83, var7, arg0.field5271);
                    int var85 = arg0.field5271[2];
                    int var86 = var84;
                    int var87 = var85;
                    if (var84 > var85) {
                        var86 = var85;
                        var87 = var84;
                    }
                    var86 -= 91;
                    var87 += 91;
                    if (var86 < var87 - 1597) {
                        var86 = var87 - 1597;
                    }
                    var81.field3846 = var86;
                    var81.field3848 = var87;
                    var81.field3847 = true;
                    class118.field1400.method921(var81);
                } else {
                    arg1.field4322 = null;
                }
            }
            if (arg1.field4312) {
                if (arg1.field4305 != 0) {
                    return;
                }
                if (var2 <= class239.field3251 && var2 > class279.field3932) {
                    class302 var88 = var8[var2 - 1][var3];
                    if (var88 != null && var88.field4312) {
                        return;
                    }
                }
                if (var2 >= class239.field3251 && var2 < class197.field2682 - 1) {
                    class302 var89 = var8[var2 + 1][var3];
                    if (var89 != null && var89.field4312) {
                        return;
                    }
                }
                if (var3 <= class326.field4585 && var3 > class256.field3445) {
                    class302 var90 = var8[var2][var3 - 1];
                    if (var90 != null && var90.field4312) {
                        return;
                    }
                }
                if (var3 >= class326.field4585 && var3 < class440.field6441 - 1) {
                    class302 var91 = var8[var2][var3 + 1];
                    if (var91 != null && var91.field4312) {
                        return;
                    }
                }
                arg1.field4312 = false;
                --class215.field2926;
                class240 var92 = arg1.field4316;
                if (var92 != null && var92.field3258) {
                    if (class324.field4572) {
                        class201.method1290(arg0, var4, var2, var3);
                        class118.field1400.method926(arg0.field5282, arg0.field5280);
                    }
                    class19 var93 = var92.method213(-127, class118.field1400);
                    if (var93 != null) {
                        var93.field189 = var92;
                        var93.field193 = var4;
                        var93.field190 = var2;
                        var93.field194 = var3;
                        class148.field2068.method1605(var93, -14638);
                    }
                }
                if (arg1.field4314 != 0) {
                    class143 var94 = arg1.field4311;
                    if (var94 != null && !class324.method2001(var5, var2, var3, var94.method431(88))) {
                        if ((var94.field2014 & arg1.field4314) != 0) {
                            if (class324.field4572) {
                                class201.method1290(arg0, var4, var2, var3);
                                class118.field1400.method926(arg0.field5282, arg0.field5280);
                            }
                            class19 var95 = var94.method213(-101, class118.field1400);
                            if (var95 != null) {
                                var95.field189 = var94;
                                var95.field193 = var4;
                                var95.field190 = var2;
                                var95.field194 = var3;
                                class148.field2068.method1605(var95, -14638);
                            }
                        } else if (var94.field2014 == 256) {
                            int var96 = var94.field2018 - class170.field2390;
                            int var97 = var94.field2021 - class24.field238;
                            int var98 = var94.field2019;
                            int var99;
                            if (var98 != 1 && var98 != 2) {
                                var99 = var96;
                            } else {
                                var99 = -var96;
                            }
                            int var100;
                            if (var98 != 2 && var98 != 3) {
                                var100 = var97;
                            } else {
                                var100 = -var97;
                            }
                            if (class324.field4572) {
                                class201.method1290(arg0, var4, var2, var3);
                                class118.field1400.method926(arg0.field5282, arg0.field5280);
                            }
                            class143 var101 = arg1.field4306;
                            if (var100 > var99) {
                                class19 var102 = var94.method213(-96, class118.field1400);
                                if (var102 != null) {
                                    var102.field189 = var94;
                                    var102.field193 = var4;
                                    var102.field190 = var2;
                                    var102.field194 = var3;
                                    class148.field2068.method1605(var102, -14638);
                                }
                            } else if (var101 != null) {
                                class19 var103 = var101.method213(-53, class118.field1400);
                                if (var103 != null) {
                                    var103.field189 = var101;
                                    var103.field193 = var4;
                                    var103.field190 = var2;
                                    var103.field194 = var3;
                                    class148.field2068.method1605(var103, -14638);
                                }
                            }
                        }
                    }
                    class436 var104 = arg1.field4313;
                    class436 var105 = arg1.field4324;
                    if (var105 != null && (var105.field6396 & arg1.field4314) != 0 && !class144.method851(var5, var2, var3, var105.field6396)) {
                        if (class324.field4572) {
                            class139.method828(arg0, var105.field6396, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var106 = var105.method213(-34, class118.field1400);
                        if (var106 != null) {
                            var106.field189 = var105;
                            var106.field193 = var4;
                            var106.field190 = var2;
                            var106.field194 = var3;
                            class148.field2068.method1605(var106, -14638);
                        }
                    }
                    if (var104 != null && (var104.field6396 & arg1.field4314) != 0 && !class144.method851(var5, var2, var3, var104.field6396)) {
                        if (class324.field4572) {
                            class139.method828(arg0, var104.field6396, var4, var2, var3);
                            class118.field1400.method926(arg0.field5282, arg0.field5280);
                        }
                        class19 var107 = var104.method213(-58, class118.field1400);
                        if (var107 != null) {
                            var107.field189 = var104;
                            var107.field193 = var4;
                            var107.field190 = var2;
                            var107.field194 = var3;
                            class148.field2068.method1605(var107, -14638);
                        }
                    }
                }
                if (var4 < class52.field594 - 1) {
                    class302 var108 = class19.field202[var4 + 1][var2][var3];
                    if (var108 != null && var108.field4312) {
                        class341.field5015.method1099(0, var108);
                    }
                }
                if (var2 < class239.field3251) {
                    class302 var109 = var8[var2 + 1][var3];
                    if (var109 != null && var109.field4312) {
                        class341.field5015.method1091(var109, -32426);
                    }
                }
                if (var3 < class326.field4585) {
                    class302 var110 = var8[var2][var3 + 1];
                    if (var110 != null && var110.field4312) {
                        class341.field5015.method1091(var110, -32426);
                    }
                }
                if (var2 > class239.field3251) {
                    class302 var111 = var8[var2 - 1][var3];
                    if (var111 != null && var111.field4312) {
                        class341.field5015.method1091(var111, -32426);
                    }
                }
                if (var3 > class326.field4585) {
                    class302 var112 = var8[var2][var3 - 1];
                    if (var112 != null && var112.field4312) {
                        class341.field5015.method1091(var112, -32426);
                    }
                }
            }
        }
    }
}
