import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class177 extends class477 {

    @OriginalMember(owner = "client!di", name = "x", descriptor = "Z")
    private boolean field2269;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Lhd;")
    private class211 field2267;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "Lhd;")
    private class211 field2274;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lhd;")
    private class211 field2262;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Lhd;")
    private class211 field2257;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Lhb;")
    public static class250 field2272 = new class250(42, 3);

    @OriginalMember(owner = "client!di", name = "o", descriptor = "F")
    public static float field2260;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Z")
    private boolean field2264;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Z")
    private boolean field2271;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V")
    public final void method270(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field2271 = arg1;
            ++field2270;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
    public final void method271(boolean arg0, int arg1) {
        ++field2268;
        if (arg1 != -13) {
            method1150((byte) 40);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public final void method1144(int arg0) {
        ++field2259;
        class421.field5653[3] = (float) super.field6964.field6758;
        OpenGL.glTexGenfv(8192, 9474, class421.field5653, 0);
        if (this.field2271) {
            OpenGL.glBindProgramARB(34336, ~super.field6964.field6758 == Integer.MIN_VALUE ? this.field2274.field2716 : this.field2257.field2716);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field6964.field6758 != Integer.MIN_VALUE ? this.field2262.field2716 : this.field2267.field2716);
        }
        OpenGL.glEnable(arg0);
        this.field2264 = true;
        this.method1149((byte) 0);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
    public final void method269(byte arg0) {
        if (this.field2264) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2264 = false;
        }
        if (arg0 == 126) {
            ++field2265;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z")
    public final boolean method264(byte arg0) {
        ++field2255;
        if (arg0 < 45) {
            this.field2257 = null;
        }
        return this.field2269;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lrh;II)V")
    public final void method266(class31 arg0, int arg1, int arg2) {
        ++field2263;
        if (arg1 != -11) {
            field2272 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1145(int arg0, int arg1, String arg2) {
        ++field2258;
        ++class85.field1148;
        if (arg1 == -543) {
            class420.method2472((byte) -101, class407.field5447);
            class319.field4112.method565(52, 1 + class415.method2442(-65, arg2));
            class319.field4112.method597(arg1 ^ 608, arg2);
            class319.field4112.method598(arg0, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)V")
    public final void method272(byte arg0, int arg1, int arg2) {
        ++field2266;
        if (arg0 < 33) {
            field2272 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2261;
        for (class52 var7 = (class52) client.field7513.method2122(arg1 ^ arg1); var7 != null; var7 = (class52) client.field7513.method2129(arg1 + -34282)) {
            if (~var7.field712 >= ~class264.field3353) {
                var7.method2336((byte) 118);
            } else {
                class476.method2859(var7.field714, (var7.field711 << 7) + 64, (var7.field710 << 7) - -64, 0, arg3, arg5 >> 1, arg0 >> 1, arg6, var7.field709 * 2);
                class200.field2590.method1105(var7.field705, class267.field3388[0] + arg4, class267.field3388[1] + arg2, (byte) -113, -16777216 | var7.field717, 0);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lsc;Ltg;)V")
    public static final void method1147(class265 arg0, class510 arg1) {
        if (arg1.field7493) {
            short var2 = arg1.field7488;
            short var3 = arg1.field7486;
            byte var4 = arg1.field7484;
            byte var5 = arg1.field7500;
            int var6 = (var2 << class169.field2206) + class477.field6971;
            int var7 = (var3 << class169.field2206) + class477.field6971;
            class510[][] var8 = class470.field6877[var4];
            float var9;
            if (class92.field1285 == class283.field3620) {
                class372.field4831.method848(class405.field5436[0].method1185(var6, var7), class12.method92(var2, var3), class124.method785(var2, var3), class44.method287(var2, var3));
                var9 = 251.5F;
            } else {
                var9 = 201.5F - (float) (var5 + 1) * 50.0F;
            }
            class372.field4831.method913(3000.0F, var9 * 1.5F);
            if (arg1.field7504) {
                if (class255.field3227) {
                    if (var4 > 0) {
                        class510 var10 = class470.field6877[var4 - 1][var2][var3];
                        if (var10 != null && var10.field7493) {
                            return;
                        }
                    }
                    if (var2 <= class225.field2922 && var2 > class297.field3862) {
                        class510 var11 = var8[var2 - 1][var3];
                        if (var11 != null && var11.field7493 && (var11.field7504 || (arg1.field7489 & 1) == 0)) {
                            return;
                        }
                    }
                    if (var2 >= class225.field2922 && var2 < class411.field5491 - 1) {
                        class510 var12 = var8[var2 + 1][var3];
                        if (var12 != null && var12.field7493 && (var12.field7504 || (arg1.field7489 & 4) == 0)) {
                            return;
                        }
                    }
                    if (var3 <= class477.field6969 && var3 > class83.field1027) {
                        class510 var13 = var8[var2][var3 - 1];
                        if (var13 != null && var13.field7493 && (var13.field7504 || (arg1.field7489 & 8) == 0)) {
                            return;
                        }
                    }
                    if (var3 >= class477.field6969 && var3 < class271.field3438 - 1) {
                        class510 var14 = var8[var2][var3 + 1];
                        if (var14 != null && var14.field7493 && (var14.field7504 || (arg1.field7489 & 2) == 0)) {
                            return;
                        }
                    }
                } else {
                    class255.field3227 = true;
                }
                arg1.field7504 = false;
                if (arg1.field7483 != null) {
                    class510 var15 = arg1.field7483;
                    class372.field4831.method913(3000.0F, (201.5F - (float) (var15.field7500 + 1) * 50.0F) * 1.5F);
                    if (!class60.method340(var15.field7500, var2, var3)) {
                        class92.field1285[var15.field7500].method1174(var2, var3);
                    }
                    class270 var16 = var15.field7499;
                    if (var16 != null) {
                        if (class98.field1368) {
                            if ((var16.field3424 & arg1.field7481) != 0) {
                                class151.method1041(arg0, var16.field3424, var5, var2, var3);
                            } else {
                                class492.method2941(arg0, var4, var2, var3);
                            }
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        var16.method172(class372.field4831, (byte) -97);
                    }
                    for (class319 var17 = var15.field7494; var17 != null; var17 = var17.field4102) {
                        class448 var18 = var17.field4107;
                        if (var18 != null) {
                            if (class98.field1368) {
                                class492.method2941(arg0, var4, var2, var3);
                                class372.field4831.method906(arg0.field3363, arg0.field3359);
                            }
                            var18.method172(class372.field4831, (byte) 116);
                        }
                    }
                    class372.field4831.method913(3000.0F, var9 * 1.5F);
                }
                boolean var19 = !class60.method340(var5, var2, var3);
                if (var19) {
                    class92.field1285[var5].method1174(var2, var3);
                    class338 var20 = arg1.field7492;
                    if (var20 != null && var20.field4316) {
                        if (var20.field4312) {
                            class372.field4831.method913(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class98.field1368) {
                            class492.method2941(arg0, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var21 = var20.method172(class372.field4831, (byte) -73);
                        if (var21 != null) {
                            var21.field6835 = var20;
                            var21.field6834 = var4;
                            var21.field6836 = var2;
                            var21.field6841 = var3;
                            class193.field2500.method2124(var21, -32);
                        }
                        if (var20.field4312) {
                            class372.field4831.method913(3000.0F, var9 * 1.5F);
                        }
                    }
                }
                int var22 = 0;
                int var23 = 0;
                class270 var24 = arg1.field7499;
                class303 var25 = arg1.field7485;
                if (var24 != null || var25 != null) {
                    if (class225.field2922 == var2) {
                        ++var22;
                    } else if (class225.field2922 < var2) {
                        var22 += 2;
                    }
                    if (class477.field6969 == var3) {
                        var22 += 3;
                    } else if (class477.field6969 > var3) {
                        var22 += 6;
                    }
                    var23 = class236.field3078[var22];
                    arg1.field7481 = class78.field1001[var22];
                }
                if (var24 != null) {
                    if ((var24.field3424 & class183.field2411[var22]) != 0) {
                        if (var24.field3424 == 16) {
                            arg1.field7503 = 3;
                            arg1.field7495 = class512.field7536[var22];
                            arg1.field7482 = (byte) (3 - arg1.field7495);
                        } else if (var24.field3424 == 32) {
                            arg1.field7503 = 6;
                            arg1.field7495 = class274.field3482[var22];
                            arg1.field7482 = (byte) (6 - arg1.field7495);
                        } else if (var24.field3424 == 64) {
                            arg1.field7503 = 12;
                            arg1.field7495 = class53.field720[var22];
                            arg1.field7482 = (byte) (12 - arg1.field7495);
                        } else {
                            arg1.field7503 = 9;
                            arg1.field7495 = class449.field6255[var22];
                            arg1.field7482 = (byte) (9 - arg1.field7495);
                        }
                    } else {
                        arg1.field7503 = 0;
                    }
                    if ((var24.field3424 & var23) != 0 && !class212.method1356(var5, var2, var3, var24.field3424)) {
                        if (class98.field1368) {
                            class492.method2941(arg0, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var26 = var24.method172(class372.field4831, (byte) -128);
                        if (var26 != null) {
                            var26.field6835 = var24;
                            var26.field6834 = var4;
                            var26.field6836 = var2;
                            var26.field6841 = var3;
                            class193.field2500.method2124(var26, -58);
                        }
                    }
                    class270 var27 = arg1.field7502;
                    if (var27 != null && (var27.field3424 & var23) != 0 && !class212.method1356(var5, var2, var3, var27.field3424)) {
                        if (class98.field1368) {
                            class492.method2941(arg0, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var28 = var27.method172(class372.field4831, (byte) -19);
                        if (var28 != null) {
                            var28.field6835 = var27;
                            var28.field6834 = var4;
                            var28.field6836 = var2;
                            var28.field6841 = var3;
                            class193.field2500.method2124(var28, 100);
                        }
                    }
                }
                if (var25 != null && !class113.method740(var5, var2, var3, var25.method1131((byte) 94))) {
                    class303 var29 = arg1.field7497;
                    class372.field4831.method913(3000.0F, (var9 - 0.5F) * 1.5F);
                    if ((var25.field3930 & var23) != 0) {
                        if (class98.field1368) {
                            class492.method2941(arg0, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var30 = var25.method172(class372.field4831, (byte) -69);
                        if (var30 != null) {
                            var30.field6835 = var25;
                            var30.field6834 = var4;
                            var30.field6836 = var2;
                            var30.field6841 = var3;
                            class193.field2500.method2124(var30, -121);
                        }
                    } else if (var25.field3930 == 256) {
                        int var31 = var25.field3926 - class273.field3472;
                        int var32 = var25.field3929 - class436.field5986;
                        int var33 = var25.field3933;
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
                        if (class98.field1368) {
                            class492.method2941(arg0, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        if (var35 < var34) {
                            class465 var36 = var25.method172(class372.field4831, (byte) -47);
                            if (var36 != null) {
                                var36.field6835 = var25;
                                var36.field6834 = var4;
                                var36.field6836 = var2;
                                var36.field6841 = var3;
                                class193.field2500.method2124(var36, -38);
                            }
                        } else if (var29 != null) {
                            class465 var37 = var29.method172(class372.field4831, (byte) -39);
                            if (var37 != null) {
                                var37.field6835 = var29;
                                var37.field6834 = var4;
                                var37.field6836 = var2;
                                var37.field6841 = var3;
                                class193.field2500.method2124(var37, 77);
                            }
                        }
                    }
                    class372.field4831.method913(3000.0F, var9 * 1.5F);
                }
                if (var19) {
                    class338 var38 = arg1.field7492;
                    if (var38 != null && !var38.field4316) {
                        if (var38.field4312) {
                            class372.field4831.method913(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class98.field1368) {
                            class492.method2941(arg0, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var39 = var38.method172(class372.field4831, (byte) 126);
                        if (var39 != null) {
                            var39.field6835 = var38;
                            var39.field6834 = var4;
                            var39.field6836 = var2;
                            var39.field6841 = var3;
                            class193.field2500.method2124(var39, 122);
                        }
                        if (var38.field4312) {
                            class372.field4831.method913(3000.0F, var9 * 1.5F);
                        }
                    }
                    class428 var40 = arg1.field7496;
                    if (var40 != null && !var40.field5865) {
                        if (class98.field1368) {
                            class492.method2941(arg0, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var41 = var40.method172(class372.field4831, (byte) 123);
                        if (var41 != null) {
                            var41.field6835 = var40;
                            var41.field6834 = var4;
                            var41.field6836 = var2;
                            var41.field6841 = var3;
                            class193.field2500.method2124(var41, 112);
                        }
                    }
                }
                byte var42 = arg1.field7489;
                if (var42 != 0) {
                    if (var2 < class225.field2922 && (var42 & 4) != 0) {
                        class510 var43 = var8[var2 + 1][var3];
                        if (var43 != null && var43.field7493) {
                            class522.field7748.method196(true, var43);
                        }
                    }
                    if (var3 < class477.field6969 && (var42 & 2) != 0) {
                        class510 var44 = var8[var2][var3 + 1];
                        if (var44 != null && var44.field7493) {
                            class522.field7748.method196(true, var44);
                        }
                    }
                    if (var2 > class225.field2922 && (var42 & 1) != 0) {
                        class510 var45 = var8[var2 - 1][var3];
                        if (var45 != null && var45.field7493) {
                            class522.field7748.method196(true, var45);
                        }
                    }
                    if (var3 > class477.field6969 && (var42 & 8) != 0) {
                        class510 var46 = var8[var2][var3 - 1];
                        if (var46 != null && var46.field7493) {
                            class522.field7748.method196(true, var46);
                        }
                    }
                }
            }
            if (arg1.field7503 != 0) {
                boolean var47 = true;
                for (class319 var48 = arg1.field7494; var48 != null; var48 = var48.field4102) {
                    if (class206.field2685 != var48.field4107.field6227 && (var48.field4104 & arg1.field7503) == arg1.field7495) {
                        var47 = false;
                        break;
                    }
                }
                if (var47) {
                    class270 var49 = arg1.field7499;
                    if (!class212.method1356(var5, var2, var3, var49.field3424)) {
                        if (class98.field1368) {
                            label682: {
                                if (var49.field3424 >= 16) {
                                    int var50 = var2 - class225.field2922;
                                    int var51 = var3 - class477.field6969;
                                    if (var49.field3424 == 16) {
                                        int var52 = var50 - class477.field6971;
                                        int var53 = class477.field6971 + var51;
                                        if (var53 < var52 && var2 > 0 && var3 <= class13.field230) {
                                            class492.method2941(arg0, var4, var2 - 1, var3 + 1);
                                            break label682;
                                        }
                                    } else if (var49.field3424 == 32) {
                                        int var54 = class477.field6971 + var50;
                                        int var55 = class477.field6971 + var51;
                                        if (var55 < -var54 && var2 < class166.field2155 && var3 < class13.field230) {
                                            class492.method2941(arg0, var4, var2 + 1, var3 + 1);
                                            break label682;
                                        }
                                    } else if (var49.field3424 == 64) {
                                        int var56 = class477.field6971 + var50;
                                        int var57 = var51 - class477.field6971;
                                        if (var57 > var56 && var2 < class166.field2155 && var3 > 0) {
                                            class492.method2941(arg0, var4, var2 + 1, var3 - 1);
                                            break label682;
                                        }
                                    } else if (var49.field3424 == 128) {
                                        int var58 = var50 - class477.field6971;
                                        int var59 = var51 - class477.field6971;
                                        if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                            class492.method2941(arg0, var4, var2 - 1, var3 - 1);
                                            break label682;
                                        }
                                    }
                                }
                                class492.method2941(arg0, var4, var2, var3);
                            }
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var60 = var49.method172(class372.field4831, (byte) -24);
                        if (var60 != null) {
                            var60.field6835 = var49;
                            var60.field6834 = var4;
                            var60.field6836 = var2;
                            var60.field6841 = var3;
                            class193.field2500.method2124(var60, 98);
                        }
                    }
                    arg1.field7503 = 0;
                }
            }
            if (arg1.field7487) {
                try {
                    arg1.field7487 = false;
                    int var61 = 0;
                    label625: for (class319 var62 = arg1.field7494; var62 != null; var62 = var62.field4102) {
                        class448 var63 = var62.field4107;
                        if (class206.field2685 != var63.field6227) {
                            for (int var64 = var63.field6238; var64 <= var63.field6229; ++var64) {
                                for (int var65 = var63.field6228; var65 <= var63.field6221; ++var65) {
                                    class510 var66 = var8[var64][var65];
                                    if (var66.field7504) {
                                        arg1.field7487 = true;
                                        continue label625;
                                    }
                                    if (var66.field7503 != 0) {
                                        int var67 = 0;
                                        if (var64 > var63.field6238) {
                                            ++var67;
                                        }
                                        if (var64 < var63.field6229) {
                                            var67 += 4;
                                        }
                                        if (var65 > var63.field6228) {
                                            var67 += 8;
                                        }
                                        if (var65 < var63.field6221) {
                                            var67 += 2;
                                        }
                                        if ((var67 & var66.field7503) == arg1.field7482) {
                                            arg1.field7487 = true;
                                            continue label625;
                                        }
                                    }
                                }
                            }
                            int var68 = class225.field2922 - var63.field6238;
                            int var69 = var63.field6229 - class225.field2922;
                            if (var69 > var68) {
                                var68 = var69;
                            }
                            int var70 = class477.field6969 - var63.field6228;
                            int var71 = var63.field6221 - class477.field6969;
                            if (var71 > var70) {
                                var70 = var71;
                            }
                            arg0.field3362[var61] = var63;
                            arg0.field3357[var61++] = var68 + var70;
                        }
                    }
                    while (var61 > 0) {
                        int var72 = -50;
                        int var73 = -1;
                        for (int var74 = 0; var74 < var61; ++var74) {
                            class448 var75 = arg0.field3362[var74];
                            if (class206.field2685 != var75.field6227) {
                                int var76 = arg0.field3357[var74];
                                if (var76 > var72) {
                                    var72 = var76;
                                    var73 = var74;
                                } else if (var72 == var76) {
                                    int var77 = var75.field6239 - class273.field3472;
                                    int var78 = var75.field6241 - class436.field5986;
                                    int var79 = arg0.field3362[var73].field6239 - class273.field3472;
                                    int var80 = arg0.field3362[var73].field6241 - class436.field5986;
                                    if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                        var73 = var74;
                                    }
                                }
                            }
                        }
                        if (var73 == -1) {
                            break;
                        }
                        class448 var81 = arg0.field3362[var73];
                        var81.field6227 = class206.field2685;
                        if (!class163.method1085(var5, var81.field6238, var81.field6229, var81.field6228, var81.field6221, var81.method180(-86))) {
                            if (class98.field1368) {
                                if (var81.field6232 != 0) {
                                    class492.method2941(arg0, var4, var2, var3);
                                    int var82 = var2 - class225.field2922;
                                    int var83 = var3 - class477.field6969;
                                    if (var81.field6232 == 2) {
                                        if (var83 > -var82) {
                                            class478.method2869(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                        } else {
                                            class478.method2869(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                        }
                                    } else if (var83 > var82) {
                                        class478.method2869(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                    } else {
                                        class478.method2869(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                    }
                                } else {
                                    class21.method152(arg0, var4, var81.field6238, var81.field6228, var81.field6229, var81.field6221);
                                }
                                class372.field4831.method906(arg0.field3363, arg0.field3359);
                            }
                            class465 var84 = var81.method172(class372.field4831, (byte) -118);
                            if (var84 != null) {
                                var84.field6835 = var81;
                                var84.field6834 = var4;
                                var84.field6836 = var81.field6238;
                                var84.field6841 = var81.field6228;
                                class193.field2500.method2124(var84, 110);
                            }
                        }
                        for (int var85 = var81.field6238; var85 <= var81.field6229; ++var85) {
                            for (int var86 = var81.field6228; var86 <= var81.field6221; ++var86) {
                                class510 var87 = var8[var85][var86];
                                if (var87.field7503 != 0) {
                                    class522.field7748.method196(true, var87);
                                } else if ((var2 != var85 || var3 != var86) && var87.field7493) {
                                    class522.field7748.method196(true, var87);
                                }
                            }
                        }
                    }
                    if (arg1.field7487) {
                        return;
                    }
                } catch (Exception var122) {
                    arg1.field7487 = false;
                }
            }
            if (arg1.field7501 != null && (byte) (class8.field82 & 255) == arg1.field7498) {
                class287 var88 = arg1.field7501;
                int var89 = class92.field1285[var4].method1187(var2, var3);
                int var90;
                if (var4 < class412.field5495 - 1) {
                    var90 = class92.field1285[var4].method1187(var2, var3) - class92.field1285[var4 + 1].method1187(var2, var3);
                } else {
                    var90 = 8 << class169.field2206;
                }
                class370.field4774.method992(var6, var89, var7, arg0.field3360);
                int var91 = arg0.field3360[2];
                class370.field4774.method992(var6, var89 - var90, var7, arg0.field3360);
                int var92 = arg0.field3360[2];
                int var93 = var91;
                int var94 = var92;
                if (var91 > var92) {
                    var93 = var92;
                    var94 = var91;
                }
                int var95 = var93 - class440.field6127;
                int var96 = class440.field6127 + var94;
                var88.field3670 = var95;
                var88.field3668 = var96;
                var88.field3667 = true;
                class372.field4831.method838(var88);
            }
            if (arg1.field7493) {
                if (arg1.field7503 != 0) {
                    return;
                }
                if (var2 <= class225.field2922 && var2 > class297.field3862) {
                    class510 var97 = var8[var2 - 1][var3];
                    if (var97 != null && var97.field7493) {
                        return;
                    }
                }
                if (var2 >= class225.field2922 && var2 < class411.field5491 - 1) {
                    class510 var98 = var8[var2 + 1][var3];
                    if (var98 != null && var98.field7493) {
                        return;
                    }
                }
                if (var3 <= class477.field6969 && var3 > class83.field1027) {
                    class510 var99 = var8[var2][var3 - 1];
                    if (var99 != null && var99.field7493) {
                        return;
                    }
                }
                if (var3 >= class477.field6969 && var3 < class271.field3438 - 1) {
                    class510 var100 = var8[var2][var3 + 1];
                    if (var100 != null && var100.field7493) {
                        return;
                    }
                }
                arg1.field7493 = false;
                --class489.field7124;
                class428 var101 = arg1.field7496;
                if (var101 != null && var101.field5865) {
                    if (class98.field1368) {
                        class492.method2941(arg0, var4, var2, var3);
                        class372.field4831.method906(arg0.field3363, arg0.field3359);
                    }
                    class465 var102 = var101.method172(class372.field4831, (byte) -37);
                    if (var102 != null) {
                        var102.field6835 = var101;
                        var102.field6834 = var4;
                        var102.field6836 = var2;
                        var102.field6841 = var3;
                        class193.field2500.method2124(var102, 56);
                    }
                }
                if (arg1.field7481 != 0) {
                    class303 var103 = arg1.field7485;
                    if (var103 != null && !class113.method740(var5, var2, var3, var103.method1131((byte) 83))) {
                        if ((var103.field3930 & arg1.field7481) != 0) {
                            if (class98.field1368) {
                                class492.method2941(arg0, var4, var2, var3);
                                class372.field4831.method906(arg0.field3363, arg0.field3359);
                            }
                            class465 var104 = var103.method172(class372.field4831, (byte) 122);
                            if (var104 != null) {
                                var104.field6835 = var103;
                                var104.field6834 = var4;
                                var104.field6836 = var2;
                                var104.field6841 = var3;
                                class193.field2500.method2124(var104, 60);
                            }
                        } else if (var103.field3930 == 256) {
                            int var105 = var103.field3926 - class273.field3472;
                            int var106 = var103.field3929 - class436.field5986;
                            int var107 = var103.field3933;
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
                            if (class98.field1368) {
                                class492.method2941(arg0, var4, var2, var3);
                                class372.field4831.method906(arg0.field3363, arg0.field3359);
                            }
                            class303 var110 = arg1.field7497;
                            if (var109 > var108) {
                                class465 var111 = var103.method172(class372.field4831, (byte) 119);
                                if (var111 != null) {
                                    var111.field6835 = var103;
                                    var111.field6834 = var4;
                                    var111.field6836 = var2;
                                    var111.field6841 = var3;
                                    class193.field2500.method2124(var111, 59);
                                }
                            } else if (var110 != null) {
                                class465 var112 = var110.method172(class372.field4831, (byte) -120);
                                if (var112 != null) {
                                    var112.field6835 = var110;
                                    var112.field6834 = var4;
                                    var112.field6836 = var2;
                                    var112.field6841 = var3;
                                    class193.field2500.method2124(var112, 91);
                                }
                            }
                        }
                    }
                    class270 var113 = arg1.field7499;
                    class270 var114 = arg1.field7502;
                    if (var114 != null && (var114.field3424 & arg1.field7481) != 0 && !class212.method1356(var5, var2, var3, var114.field3424)) {
                        if (class98.field1368) {
                            class151.method1041(arg0, var114.field3424, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var115 = var114.method172(class372.field4831, (byte) 108);
                        if (var115 != null) {
                            var115.field6835 = var114;
                            var115.field6834 = var4;
                            var115.field6836 = var2;
                            var115.field6841 = var3;
                            class193.field2500.method2124(var115, -57);
                        }
                    }
                    if (var113 != null && (var113.field3424 & arg1.field7481) != 0 && !class212.method1356(var5, var2, var3, var113.field3424)) {
                        if (class98.field1368) {
                            class151.method1041(arg0, var113.field3424, var4, var2, var3);
                            class372.field4831.method906(arg0.field3363, arg0.field3359);
                        }
                        class465 var116 = var113.method172(class372.field4831, (byte) -13);
                        if (var116 != null) {
                            var116.field6835 = var113;
                            var116.field6834 = var4;
                            var116.field6836 = var2;
                            var116.field6841 = var3;
                            class193.field2500.method2124(var116, 101);
                        }
                    }
                }
                if (var4 < class412.field5495 - 1) {
                    class510 var117 = class470.field6877[var4 + 1][var2][var3];
                    if (var117 != null && var117.field7493) {
                        class522.field7748.method197(var117, (byte) 124);
                    }
                }
                if (var2 < class225.field2922) {
                    class510 var118 = var8[var2 + 1][var3];
                    if (var118 != null && var118.field7493) {
                        class522.field7748.method196(true, var118);
                    }
                }
                if (var3 < class477.field6969) {
                    class510 var119 = var8[var2][var3 + 1];
                    if (var119 != null && var119.field7493) {
                        class522.field7748.method196(true, var119);
                    }
                }
                if (var2 > class225.field2922) {
                    class510 var120 = var8[var2 - 1][var3];
                    if (var120 != null && var120.field7493) {
                        class522.field7748.method196(true, var120);
                    }
                }
                if (var3 > class477.field6969) {
                    class510 var121 = var8[var2][var3 - 1];
                    if (var121 != null && var121.field7493) {
                        class522.field7748.method196(true, var121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI[Leo;III)V")
    public static final void method1148(boolean arg0, int arg1, class423[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg2.length; ++var6) {
            class423 var7 = arg2[var6];
            if (var7 != null && ~var7.field5823 == ~arg5) {
                class132.method932(var7, arg4, -190, arg3, arg0);
                class343.method2017(arg4, (byte) 105, arg3, var7);
                if (~(-var7.field5735 + var7.field5797) > ~var7.field5678) {
                    var7.field5678 = -var7.field5735 + var7.field5797;
                }
                if (var7.field5678 < 0) {
                    var7.field5678 = 0;
                }
                if (-var7.field5726 + var7.field5768 < var7.field5686) {
                    var7.field5686 = -var7.field5726 + var7.field5768;
                }
                if (~var7.field5686 > -1) {
                    var7.field5686 = 0;
                }
                if (~var7.field5741 == -1) {
                    class474.method2838(arg0, var7, 23311);
                }
            }
        }
        if (arg1 == 3) {
            ++field2273;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V")
    public final void method1149(byte arg0) {
        if (this.field2264) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field6964.field6729 + -1280), (float) (super.field6964.field6729 + -768), 1.0F / (float) super.field6964.field6742, (float) super.field6964.field6808 / 255.0F);
        }
        if (arg0 != 0) {
            field2272 = null;
        }
        ++field2256;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
    public static void method1150(byte arg0) {
        field2272 = null;
        if (arg0 <= 108) {
            field2272 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lgk;)V")
    public class177(class463 arg0) {
        super(arg0);
        if (!super.field6964.field6772) {
            this.field2269 = false;
        } else {
            this.field2267 = class334.method1983("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -6416, 34336, super.field6964);
            this.field2274 = class334.method1983("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -6416, 34336, super.field6964);
            this.field2262 = class334.method1983("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -6416, 34336, super.field6964);
            this.field2257 = class334.method1983("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -6416, 34336, super.field6964);
            this.field2269 = this.field2257 != null & this.field2262 != null & this.field2267 != null & this.field2274 != null;
        }
    }

    static {
        new class169("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
