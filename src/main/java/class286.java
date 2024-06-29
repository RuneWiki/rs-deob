import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class286 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
    public static int[] field4920 = new int[2000];

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4921 = 2;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field4927 = 500;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lwa;")
    public static class75 field4928 = class66.method560(")2", false);

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lja;")
    public static class60 field4923 = new class60(new byte[5000]);

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lre;")
    public static class262 field4929 = null;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lwa;")
    public static class75 field4930 = class66.method560(" steht bereits auf Ihrer Ignorieren)2Liste(Q", false);

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[Lpk;")
    public static class104[] field4931 = new class104[4];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lcb;")
    public static class267 field4925;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)Lbc;", line = 16)
    public static final class110 method2010(boolean arg0) {
        field4918++;
        if (arg0) {
            return (class110) null;
        }
        try {
            return (class110) Class.forName("ae").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 43)
    public static void method2011(int arg0) {
        field4923 = null;
        field4931 = null;
        field4920 = null;
        field4930 = null;
        field4928 = null;
        field4929 = null;
        field4925 = null;
        if (arg0 <= 88) {
            method2016();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 78)
    public static final void method2012(byte arg0) {
        class291.method2027(class270.field4675, 14580);
        class113.field1915++;
        field4917++;
        int var1 = -96 % ((-arg0 - 69) / 38);
        if (class235.field3966 && class260.field4356) {
            int var2 = class66.field1135;
            int var3 = var2 - class25.field328;
            if (class93.field1516 > var3) {
                var3 = class93.field1516;
            }
            if (var3 + class270.field4675.field4531 > class93.field1516 + class126.field2175.field4531) {
                var3 = class93.field1516 + class126.field2175.field4531 - class270.field4675.field4531;
            }
            int var4 = var3 - class113.field1930;
            int var5 = class270.field4675.field4380;
            int var6 = var3 + class126.field2175.field4430 - class93.field1516;
            int var7 = class26.field351;
            int var8 = var7 - class87.field1438;
            if (var8 < class9.field118) {
                var8 = class9.field118;
            }
            if ((class9.field118 + class126.field2175.field4517) < (var8 + class270.field4675.field4517)) {
                var8 = class9.field118 + class126.field2175.field4517 - class270.field4675.field4517;
            }
            int var9 = var8 - class32.field462;
            if (class113.field1915 > class270.field4675.field4385 && (var4 > var5 || (-var5) > var4 || var5 < var9 || var9 < -var5)) {
                class285.field4916 = true;
            }
            int var10 = class126.field2175.field4501 + var8 - class9.field118;
            if (class270.field4675.field4475 != null && class285.field4916) {
                class24 var11 = new class24();
                var11.field309 = var6;
                var11.field301 = class270.field4675;
                var11.field302 = class270.field4675.field4475;
                var11.field308 = var10;
                class204.method1515(var11, (byte) 9);
            }
            if (class61.field1066 == 0) {
                if (class285.field4916) {
                    if (class270.field4675.field4449 != null) {
                        class24 var12 = new class24();
                        var12.field304 = class171.field2879;
                        var12.field301 = class270.field4675;
                        var12.field309 = var6;
                        var12.field302 = class270.field4675.field4449;
                        var12.field308 = var10;
                        class204.method1515(var12, (byte) 9);
                    }
                    if (class171.field2879 != null && client.method1738(class270.field4675) != null) {
                        class147.field2557++;
                        class89.field1470.method87(65280, 29);
                        class89.field1470.method527(69, class270.field4675.field4418);
                        class89.field1470.method513((byte) 108, class171.field2879.field4382);
                        class89.field1470.method513((byte) 6, class270.field4675.field4382);
                        class89.field1470.method509(class171.field2879.field4418, 121);
                    }
                } else if ((class275.field4735 == 1 || class10.method48(class126.field2188 - 1, true)) && class126.field2188 > 2) {
                    class35.method235(true);
                } else if (class126.field2188 > 0) {
                    class19.method127(11078);
                }
                class270.field4675 = null;
            }
        } else if (class113.field1915 > 1) {
            class270.field4675 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIZ)V", line = 304)
    public static final void method2013(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field4929 = (class262) null;
        }
        field4920[arg1] = arg0;
        field4924++;
        class272 var3 = (class272) class242.field4080.method1007((long) arg1, -17004);
        if (var3 == null) {
            class272 var4 = new class272(class78.method669(2047) + 500L);
            class242.field4080.method1004((byte) 73, (long) arg1, var4);
        } else {
            var3.field4696 = class78.method669(2047) + 500L;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ldc;IIILre;Ldc;II)V", line = 351)
    public static final void method2014(class101 arg0, int arg1, int arg2, int arg3, class262 arg4, class101 arg5, int arg6, int arg7) {
        class86.field1416 = arg7;
        class75.field1250 = arg2;
        field4926++;
        class147.field2555 = arg6;
        class306.field5232 = arg1;
        class155.field2654 = arg4;
        if (class16.field202 != null) {
            return;
        }
        class195.field3281 = true;
        if (class7.field92 == null) {
            class7.field92 = class134.method1037(class152.field2608, -114, 0, class136.field2333);
        }
        if (class99.field1643 == null) {
            class99.field1643 = class117.method899(0, class136.field2333, (byte) -120, class279.field4842);
        }
        if (class70.field1195 == null) {
            class70.field1195 = class117.method899(0, class136.field2333, (byte) -124, class63.field1108);
        }
        if (class246.field4168 == null) {
            class246.field4168 = class117.method899(0, class136.field2333, (byte) -126, class261.field4372);
        }
        int var8 = class86.field1416 / 5 * 4;
        int var9 = class86.field1416 / 5;
        class222.method1641(class306.field5232, class75.field1250, class86.field1416, class147.field2555, 0, 168);
        class222.method1637(class306.field5232, class75.field1250, var9, 23, 12425273, 9135624);
        class222.method1637(class306.field5232 + var9, class75.field1250, var8, 23, 5197647, 2697513);
        arg0.method774(class65.field1119, class306.field5232 + (var9 / 2), class75.field1250 - -15, 0, -1);
        if (class246.field4168 != null) {
            class246.field4168[1].method351(var9 + class306.field5232 + 2, class75.field1250 + 1);
            arg5.method784(class229.field3896, class306.field5232 + var9 + 12, class75.field1250 + 10, 16777215, -1);
            class246.field4168[0].method351(class306.field5232 + var9 + 2, class75.field1250 - -12);
            arg5.method784(class198.field3318, class306.field5232 + var9 + 12, class75.field1250 - -21, 16777215, -1);
        }
        if (class70.field1195 != null) {
            int var10 = class306.field5232 + var9 + 140;
            if (class216.field3703[0] == 0 && class288.field4948[0] == 0) {
                class70.field1195[2].method351(var10, class75.field1250 + 4);
            } else {
                class70.field1195[0].method351(var10, class75.field1250 + 4);
            }
            if (class216.field3703[0] == 0 && class288.field4948[0] == 1) {
                class70.field1195[3].method351(var10 + 15, class75.field1250 - -4);
            } else {
                class70.field1195[1].method351(var10 + 15, class75.field1250 + 4);
            }
            arg0.method784(class106.field1790, var10 + 32, class75.field1250 - -17, 16777215, -1);
            int var11 = class306.field5232 + var9 + 250;
            if (class216.field3703[0] == 1 && class288.field4948[0] == 0) {
                class70.field1195[2].method351(var11, class75.field1250 + 4);
            } else {
                class70.field1195[0].method351(var11, class75.field1250 + 4);
            }
            if (class216.field3703[0] == 1 && class288.field4948[0] == 1) {
                class70.field1195[3].method351(var11 + 15, class75.field1250 - -4);
            } else {
                class70.field1195[1].method351(var11 + 15, class75.field1250 + 4);
            }
            arg0.method784(class272.field4694, var11 + 32, class75.field1250 - -17, 16777215, -1);
            int var12 = var9 + class306.field5232 + 360;
            if (class216.field3703[0] == 2 && class288.field4948[0] == 0) {
                class70.field1195[2].method351(var12, class75.field1250 + 4);
            } else {
                class70.field1195[0].method351(var12, class75.field1250 + 4);
            }
            if (class216.field3703[0] == 2 && class288.field4948[0] == 1) {
                class70.field1195[3].method351(var12 + 15, class75.field1250 + 4);
            } else {
                class70.field1195[1].method351(var12 + 15, class75.field1250 + 4);
            }
            arg0.method784(class139.field2399, var12 + 32, class75.field1250 + 17, 16777215, -1);
            int var13 = class306.field5232 + var9 + 470;
            if (class216.field3703[0] == 3 && class288.field4948[0] == 0) {
                class70.field1195[2].method351(var13, class75.field1250 + 4);
            } else {
                class70.field1195[0].method351(var13, class75.field1250 + 4);
            }
            if (class216.field3703[0] == 3 && class288.field4948[0] == 1) {
                class70.field1195[3].method351(var13 + 15, class75.field1250 - -4);
            } else {
                class70.field1195[1].method351(var13 + 15, class75.field1250 - -4);
            }
            arg0.method784(class26.field343, var13 + 32, class75.field1250 - -17, 16777215, -1);
        }
        class222.method1632(class86.field1416 - 58 - 10, class75.field1250 - -4, 58, 16, 0);
        int var14 = 102 % ((-arg3 - 17) / 36);
        class75.field1311 = -1;
        if (class7.field92 == null) {
            return;
        }
        byte var15 = 88;
        int var16 = class86.field1416 / (var15 + 1);
        byte var17 = 19;
        int var18 = (class147.field2555 - 23) / (var17 + 1);
        int var19;
        int var20;
        do {
            var19 = var18;
            var20 = var16;
            if (class168.field2833 <= (var16 - 1) * var18) {
                var16--;
            }
            if (class168.field2833 <= (var18 - 1) * var16) {
                var18--;
            }
            if (class168.field2833 <= ((var18 - 1) * var16)) {
                var18--;
            }
        } while (var18 != var19 || var16 != var20);
        int var21 = (class86.field1416 - (var15 * var16)) / (var16 + 1);
        if (var21 > 5) {
            var21 = 5;
        }
        int var22 = (class147.field2555 - (var17 * var18) - 23) / (var18 + 1);
        int var23 = (class86.field1416 - (var15 * var16) - (var16 + -1) * var21) / 2;
        if (var22 > 5) {
            var22 = 5;
        }
        int var24 = (class147.field2555 - ((var18 - 1) * var22) - var17 * var18 - 23) / 2;
        int var25 = var24 + 23;
        int var26 = var23;
        int var27 = 0;
        for (int var28 = 0; var28 < class168.field2833; var28++) {
            class29 var29 = class115.field1946[var28];
            boolean var30 = true;
            class75 var31 = class67.method565(72, var29.field402);
            if (var29.field402 == -1) {
                var30 = false;
                var31 = class207.field3510;
            } else if (var29.field402 > 1980) {
                var30 = false;
                var31 = class304.field5200;
            }
            if (var26 <= class66.field1135 && class26.field351 >= var25 && var15 + var26 > class66.field1135 && class26.field351 < (var17 + var25) && var30) {
                class75.field1311 = var28;
                class7.field92[var29.field407 ? 1 : 0].method1330(class306.field5232 + var26, class75.field1250 + var25, 128, 16777215);
            } else {
                class7.field92[var29.field407 ? 1 : 0].method157(class306.field5232 + var26, class75.field1250 + var25);
            }
            if (class99.field1643 != null) {
                class99.field1643[(var29.field407 ? class99.field1643.length / 2 : 0) + var29.field415].method351(var26 + class306.field5232 + 29, class75.field1250 + var25);
            }
            arg0.method774(class67.method565(116, var29.field410), class306.field5232 + var26 + 15, class75.field1250 - (-(var17 / 2) - 5) + var25, 0, -1);
            arg5.method774(var31, class306.field5232 + var26 + 60, var17 / 2 + class75.field1250 + 5 + var25, 268435455, -1);
            var25 += var22 + var17;
            var27++;
            if (var18 <= var27) {
                var26 += var15 + var21;
                var25 = var24 + 23;
                var27 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIZILcc;IIILhj;III)Lcc;", line = 607)
    public static final class234 method2015(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class234 arg6, int arg7, int arg8, int arg9, class28 arg10, int arg11, int arg12, int arg13) {
        field4919++;
        long var14 = ((long) arg1 << 48) + ((long) arg12 << 32) + (long) (arg9 - -(arg13 << 16) - -(arg7 << 24));
        class234 var16 = (class234) class163.field2768.method1193(var14, 85);
        if (var16 == null) {
            byte var17;
            if (arg9 == 1) {
                var17 = 9;
            } else if (arg9 == 2) {
                var17 = 12;
            } else if (arg9 == 3) {
                var17 = 15;
            } else if (arg9 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class146 var20 = new class146((var17 * var18) + 1, var17 * var18 * 2 + -var17, 0);
            int var21 = var20.method1125(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class21.field288[var27] * var24 + arg8 >> 16;
                    int var29 = arg2 + (class21.field286[var27] * var25) >> 16;
                    var22[var23][var26] = var20.method1125(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg7 * var31 + arg13 * var32 >> 8);
                short var34 = (short) (((arg1 & 0x380) * var31 + (arg12 & 0x380) * var32 & 0x38000) + ((arg1 & 0xFC00) * var31 + (arg12 & 0xFC00) * var32 & 0xFC0000) + ((arg1 & 0x7F) * var31 + (arg12 & 0x7F) * var32 & 0x7F00) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1119(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1119(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method1119(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method1114(64, 768, -50, -10, -50);
            class163.field2768.method1194(var16, var14, false);
        }
        int var36 = arg9 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg6.method417();
        int var42 = arg6.method411();
        if (arg4) {
            if (arg3 > 640 && arg3 < 1408) {
                var39 = var36 + 128;
            }
            if (arg3 > 128 && arg3 < 896) {
                var37 -= 128;
            }
            if (arg3 > 1152 && arg3 < 1920) {
                var40 = var36 + 128;
            }
            if (arg3 > 1664 || arg3 < 384) {
                var38 -= 128;
            }
        }
        if (arg5 > -20) {
            field4928 = (class75) null;
        }
        int var43 = arg6.method453();
        if (var37 > var41) {
            var41 = var37;
        }
        if (var43 < var38) {
            var43 = var38;
        }
        int var44 = arg6.method412();
        if (var40 < var42) {
            var42 = var40;
        }
        if (var44 > var39) {
            var44 = var39;
        }
        class176 var45 = null;
        if (arg10 != null) {
            int var46 = arg10.field368[arg11];
            var45 = class79.method672(var46 >> 16, 16);
            arg11 = var46 & 0xFFFF;
        }
        class234 var47;
        if (var45 == null) {
            var47 = var16.method451(true, true);
            var47.method455((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method410((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method451(!var45.method1302((byte) -102, arg11), true);
            var47.method455((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method410((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method425(var45, arg11);
        }
        if (arg3 != 0) {
            var47.method422(arg3);
        }
        class57 var48 = (class57) var47;
        if (arg0 != class32.method217(arg8 + var41, arg2 + var43, true, class67.field1174) || class32.method217(arg8 + var42, arg2 + var44, true, class67.field1174) != arg0) {
            for (int var49 = 0; var49 < var48.field953; var49++) {
                var48.field938[var49] += class32.method217(var48.field939[var49] + arg8, var48.field944[var49] + arg2, true, class67.field1174) - arg0;
            }
            var48.field923.field2316 = false;
            var48.field964.field4227 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V", line = 820)
    public static final void method2016() {
        GL var0 = class47.field739;
        var0.glDisableClientState(32886);
        class47.method321(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class47.method345();
        for (int var1 = 0; var1 < class170.field2856[0].length; var1++) {
            class38 var2 = class170.field2856[0][var1];
            if (var2.field557 >= 0 && class21.field279.method1057(var2.field557, (byte) -114) == 4) {
                var0.glColor4fv(class203.method1512((byte) -99, var2.field576), 0);
                float var3 = 201.5F - (var2.field567 ? 1.0F : 0.5F);
                var2.method254(class271.field4681, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class47.method334();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class47.method325();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILja;)Lpa;", line = 903)
    public static final class2 method2017(int arg0, class60 arg1) {
        field4922++;
        if (arg0 != -1) {
            method2016();
        }
        return new class2(arg1.method487((byte) -126), arg1.method487((byte) -69), arg1.method487((byte) -89), arg1.method487((byte) -127), arg1.method487((byte) -82), arg1.method487((byte) -71), arg1.method487((byte) -112), arg1.method487((byte) -106), arg1.method489(-116), arg1.method501(0));
    }
}
