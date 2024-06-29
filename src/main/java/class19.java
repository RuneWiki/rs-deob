import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 {

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Ljf;")
    public class64 field217 = new class64();

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Loa;")
    private static class99 field202 = class221.method1463(2844, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Loa;")
    public static class99 field209 = class221.method1463(2844, ")1a2)1m");

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Loa;")
    public static class99 field208 = field202;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Loa;")
    public static class99 field216 = class221.method1463(2844, "(Z");

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Ltg;")
    public static class182 field211;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Ltg;")
    public static class182 field212;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "[Lpi;")
    public static class139[] field218;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method109(byte arg0) {
        field215++;
        if (class24.field361 == -1 || class220.field3824 == -1) {
            return;
        }
        int var1 = ((class149.field2617 - class240.field4142) * class100.field1709 >> 16) + class240.field4142;
        class100.field1709 += var1;
        int var2 = class193.field3389 * 2;
        if (arg0 > -47) {
            method114((byte) 82, (class109) null);
        }
        if (class100.field1709 < 65535) {
            class250.field4321 = false;
            class289.field5055 = false;
        } else {
            class100.field1709 = 65535;
            if (class289.field5055) {
                class250.field4321 = false;
            } else {
                class250.field4321 = true;
            }
            class289.field5055 = true;
        }
        float var3 = (float) class100.field1709 / 65535.0F;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class149.field2614[class24.field361][var2][var5] * 3;
            int var22 = class149.field2614[class24.field361][var2 + 1][var5] * 3;
            int var23 = (-class149.field2614[class24.field361][var2 + 3][var5] - (-class149.field2614[class24.field361][var2 + 2][var5] - class149.field2614[class24.field361][var2 + 2][var5])) * 3;
            int var24 = var22 - var21;
            int var25 = class149.field2614[class24.field361][var2][var5];
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class149.field2614[class24.field361][var2 + 2][var5] + var22 - var25 - var23;
            var4[var5] = (((float) var27 * var3 + (float) var26) * var3 + (float) var24) * var3 + (float) var25;
        }
        class221.field3850 = (int) var4[2] - (class215.field3731 * 128);
        class2.field13 = (int) var4[0] - (class280.field4910 * 128);
        class24.field367 = (int) var4[1] * -1;
        int var6 = class41.field694 * 2;
        float[] var7 = new float[3];
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class149.field2614[class220.field3824][var6][var8] * 3;
            int var15 = class149.field2614[class220.field3824][var6 + 1][var8] * 3;
            int var16 = var15 - var14;
            int var17 = (class149.field2614[class220.field3824][var6 + 2][var8] + class149.field2614[class220.field3824][var6 + 2][var8] - class149.field2614[class220.field3824][var6 + 3][var8]) * 3;
            int var18 = class149.field2614[class220.field3824][var6][var8];
            int var19 = var14 + var17 - (var15 * 2);
            int var20 = class149.field2614[class220.field3824][var6 + 2][var8] + var15 - var17 - var18;
            var7[var8] = (((float) var20 * var3 + (float) var19) * var3 + (float) var16) * var3 + (float) var18;
        }
        float var9 = var7[0] - var4[0];
        float var10 = (var7[1] - var4[1]) * -1.0F;
        float var11 = var7[2] - var4[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class20.field238 = (float) Math.atan2((double) var10, var12);
        class280.field4912 = -((float) Math.atan2((double) var9, (double) var11));
        class267.field4709 = (int) ((double) class20.field238 * 325.949D) & 0x7FF;
        class173.field3061 = (int) ((double) class280.field4912 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lw;")
    public static final class144 method110(boolean arg0) {
        field205++;
        if (class106.field1776.length > class137.field2405) {
            return class106.field1776[class137.field2405++];
        } else if (arg0) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Loa;ZI)V")
    public static final void method111(class99 arg0, boolean arg1, int arg2) {
        class99 var3 = arg0.method686(68);
        field207++;
        int var4 = 0;
        short[] var5 = new short[16];
        if (arg2 > -67) {
            field202 = null;
        }
        for (int var6 = 0; var6 < class244.field4207; var6++) {
            class166 var9 = class222.method1468(1, var6);
            if ((!arg1 || var9.field2936) && var9.field2904 == -1 && var9.field2924 == -1 && var9.field2954 == 0 && var9.field2963.method686(80).method702(9596, var3) != -1) {
                if (var4 >= 250) {
                    class270.field4753 = -1;
                    class108.field1958 = null;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class108.field1958 = var5;
        class193.field3400 = 0;
        class270.field4753 = var4;
        class99[] var7 = new class99[class270.field4753];
        for (int var8 = 0; var8 < class270.field4753; var8++) {
            var7[var8] = class222.method1468(1, var5[var8]).field2963;
        }
        class259.method1677(var7, (byte) -1, class108.field1958);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBIII)V")
    public static final void method112(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg4 - arg2 >= class197.field3437 && class79.field1395 >= arg2 + arg4 && arg0 - arg2 >= class178.field3101 && class137.field2414 >= (arg0 + arg2)) {
            class227.method1493(0, arg4, arg2, arg3, arg0);
        } else {
            class77.method545(arg3, arg4, arg2, -76, arg0);
        }
        int var5 = 52 / ((arg1 - 64) / 59);
        field203++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public final void method113(int arg0) {
        while (true) {
            class64 var2 = this.field217.field1081;
            if (this.field217 == var2) {
                if (arg0 != 0) {
                    field214 = -6;
                }
                field213++;
                return;
            }
            var2.method422(124);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLde;)V")
    public static final void method114(byte arg0, class109 arg1) {
        field210++;
        short var2 = 256;
        for (int var3 = 0; var3 < class219.field3818.length; var3++) {
            class219.field3818[var3] = 0;
        }
        if (arg0 != 96) {
            field211 = null;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class219.field3818[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class171.field3041[var15] = (class219.field3818[var15 - 1] + class219.field3818[var15 + 1] + class219.field3818[var15 - 128] + class219.field3818[var15 + 128]) / 4;
                }
            }
            int[] var13 = class219.field3818;
            class219.field3818 = class171.field3041;
            class171.field3041 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3030; var7++) {
            for (int var8 = 0; var8 < arg1.field3023; var8++) {
                if (arg1.field1961[var6++] != 0) {
                    int var9 = var8 - (-arg1.field3021 - 16);
                    int var10 = var7 + arg1.field3026 + 16;
                    int var11 = (var10 << 7) + var9;
                    class219.field3818[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lte;)V")
    public static final void method115(class77 arg0) {
        for (int var1 = arg0.field1362; var1 <= arg0.field1361; var1++) {
            for (int var2 = arg0.field1357; var2 <= arg0.field1371; var2++) {
                class216 var3 = class128.field2236[arg0.field1374][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3748; var4++) {
                        if (var3.field3743[var4] == arg0) {
                            var3.field3748--;
                            for (int var5 = var4; var5 < var3.field3748; var5++) {
                                var3.field3743[var5] = var3.field3743[var5 + 1];
                                var3.field3755[var5] = var3.field3755[var5 + 1];
                            }
                            var3.field3743[var3.field3748] = null;
                            break;
                        }
                    }
                    var3.field3753 = 0;
                    for (int var6 = 0; var6 < var3.field3748; var6++) {
                        var3.field3753 |= var3.field3755[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static void method116(int arg0) {
        field208 = null;
        if (arg0 > -81) {
            field211 = null;
        }
        field209 = null;
        field212 = null;
        field216 = null;
        field211 = null;
        field218 = null;
        field202 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIBII[IIZ)V")
    public static final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int[] arg8, int arg9, boolean arg10) {
        field201++;
        int var11 = arg3;
        if (class68.field1135 <= arg3) {
            return;
        }
        if (arg3 < class68.field1133) {
            var11 = class68.field1133;
        }
        int var12 = arg3 + arg7;
        if (arg5 <= 37) {
            field212 = null;
        }
        if (class68.field1133 >= var12) {
            return;
        }
        if (var12 > class68.field1135) {
            var12 = class68.field1135;
        }
        int var13 = arg4;
        if (arg4 >= class68.field1138) {
            return;
        }
        int var14 = arg2 + arg4;
        if (arg4 < class68.field1136) {
            var13 = class68.field1136;
        }
        if (class68.field1136 >= var14) {
            return;
        }
        if (class68.field1138 < var14) {
            var14 = class68.field1138;
        }
        int var15 = var14 - arg4;
        if (arg9 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg9 = 1;
        }
        int var16 = class68.field1140 * var13 + var11;
        int var17 = var13 - arg4;
        int var18 = class68.field1140 + var11 - var12;
        int var19 = var12 - arg3;
        int var20 = arg7 - var19;
        if (arg9 == 10) {
            arg9 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg9 == 11) {
            arg9 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        int var21 = var11 - arg3;
        int var22 = arg7 - var21;
        int var23 = arg2 - var15;
        int var24 = arg2 - var17;
        if (arg9 == 1) {
            if (arg1 == 0) {
                for (int var25 = var17; var25 < var15; var25++) {
                    for (int var26 = var21; var26 < var19; var26++) {
                        if (var25 >= var26) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var21; var28 < var19; var28++) {
                        if (var27 >= var28) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var21; var30 < var19; var30++) {
                        if (var29 <= var30) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var21; var32 < var19; var32++) {
                        if (var32 >= var31) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 2) {
            if (arg1 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var21; var34 < var19; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var21; var36 < var19; var36++) {
                        if (var16 >= 0 && var16 < arg8.length) {
                            if (var35 << 1 <= var36) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg1 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var20; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var22 - 1; var40 >= var20; var40--) {
                        if (var39 << 1 <= var40) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 3) {
            if (arg1 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var22 - 1; var42 >= var20; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var21; var44 < var19; var44++) {
                        if (var43 << 1 <= var44) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 2) {
                for (int var45 = var17; var45 < var15; var45++) {
                    for (int var46 = var21; var46 < var19; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 3) {
                for (int var47 = var17; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var20; var48--) {
                        if (var47 << 1 <= var48) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 4) {
            if (arg1 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var21; var50 < var19; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 1) {
                for (int var51 = var17; var51 < var15; var51++) {
                    for (int var52 = var21; var52 < var19; var52++) {
                        if (var52 <= (var51 << 1)) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 2) {
                for (int var53 = var17; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var20; var54--) {
                        if ((var53 >> 1) <= var54) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg1 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var22 - 1; var56 >= var20; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg8[var16] = arg0;
                        } else if (arg10) {
                            arg8[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg1 == 0) {
                    for (int var65 = var17; var65 < var15; var65++) {
                        for (int var66 = var21; var66 < var19; var66++) {
                            if (var66 <= (arg7 / 2)) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var67 = var17; var67 < var15; var67++) {
                        for (int var68 = var21; var68 < var19; var68++) {
                            if (var67 <= arg2 / 2) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var69 = var17; var69 < var15; var69++) {
                        for (int var70 = var21; var70 < var19; var70++) {
                            if ((arg7 / 2) <= var70) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var71 = var17; var71 < var15; var71++) {
                        for (int var72 = var21; var72 < var19; var72++) {
                            if ((arg2 / 2) <= var71) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg9 == 7) {
                if (arg1 == 0) {
                    for (int var73 = var17; var73 < var15; var73++) {
                        for (int var74 = var21; var74 < var19; var74++) {
                            if (var73 - (arg2 / 2) >= var74) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var21; var76 < var19; var76++) {
                            if (var76 <= (var75 - (arg2 / 2))) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var22 - 1; var78 >= var20; var78--) {
                            if (var78 <= (var77 - arg2 / 2)) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var79 = var17; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var20; var80--) {
                            if (var80 <= (var79 - (arg2 / 2))) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg1 == 0) {
                    for (int var81 = var17; var81 < var15; var81++) {
                        for (int var82 = var21; var82 < var19; var82++) {
                            if (var82 >= var81 - arg2 / 2) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var21; var84 < var19; var84++) {
                            if (var84 >= var83 - (arg2 / 2)) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var22 - 1; var86 >= var20; var86--) {
                            if (var85 - (arg2 / 2) <= var86) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var87 = var17; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var20; var88--) {
                            if (var88 >= var87 - (arg2 / 2)) {
                                arg8[var16] = arg0;
                            } else if (arg10) {
                                arg8[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var22 - 1; var58 >= var20; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg8[var16] = arg0;
                    } else if (arg10) {
                        arg8[var16] = arg6;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg1 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var21; var60 < var19; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg8[var16] = arg0;
                    } else if (arg10) {
                        arg8[var16] = arg6;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg1 == 2) {
            for (int var61 = var17; var61 < var15; var61++) {
                for (int var62 = var21; var62 < var19; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg8[var16] = arg0;
                    } else if (arg10) {
                        arg8[var16] = arg6;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg1 == 3) {
            for (int var63 = var17; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var20; var64--) {
                    if (var64 <= var63 << 1) {
                        arg8[var16] = arg0;
                    } else if (arg10) {
                        arg8[var16] = arg6;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjf;)V")
    public final void method118(int arg0, class64 arg1) {
        field206++;
        if (arg1.field1075 != null) {
            arg1.method422(119);
        }
        int var3 = 17 / ((arg0 + 69) / 53);
        arg1.field1075 = this.field217.field1075;
        arg1.field1081 = this.field217;
        arg1.field1075.field1081 = arg1;
        arg1.field1081.field1075 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class19() {
        this.field217.field1075 = this.field217;
        this.field217.field1081 = this.field217;
    }
}
