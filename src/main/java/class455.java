import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class455 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    private int field6701 = 0;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    private int field6710 = 0;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    private int field6700 = 0;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lwh;")
    private class148 field6699;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Ljga;")
    private class718 field6707;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[Lcca;")
    private class249[] field6695;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Lsh;")
    public class70 field6712;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field6698 = 0;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lbs;I)V", line = 3)
    public static final void method2782(class689 arg0, int arg1) {
        field6696++;
        class449 var2 = (class449) class87.field1236.method2287((long) arg0.field6118, (byte) -117);
        if (var2 != null) {
            if (var2.field6659 != null) {
                class171.field2666.method3834(var2.field6659);
                var2.field6659 = null;
            }
            var2.method1304((byte) 7);
        }
        if (arg1 <= 117) {
            field6702 = -75;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FIFIIIFI)[F", line = 30)
    public static final float[] method2783(float arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6, int arg7) {
        field6708++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[1] = 0.0F;
        var8[8] = var10;
        var8[0] = var10;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[6] = -var11;
        var8[4] = 1.0F;
        if (arg5 <= 103) {
            field6698 = -16;
        }
        var8[3] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg7 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + (arg4 * arg4)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg4) / var19;
                var15 = (float) arg1 / var19;
            }
            var13[7] = -var14 * var17;
            var13[2] = var14 * var15 * var18;
            var13[8] = var15 * var15 * var18 + var16;
            var13[3] = -var15 * var17;
            var13[5] = var14 * var17;
            var13[0] = var14 * var14 * var18 + var16;
            var13[6] = var14 * var15 * var18;
            var13[1] = var15 * var17;
            var13[4] = var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg0;
        var9[8] *= arg0;
        var9[1] *= arg6;
        var9[4] *= arg2;
        var9[0] *= arg6;
        var9[5] *= arg2;
        var9[2] *= arg6;
        var9[3] *= arg2;
        var9[7] *= arg0;
        return var9;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Z", line = 112)
    public final boolean method2784(int arg0, int arg1) {
        field6711++;
        if (arg1 != -3953) {
            this.method2787(-78, true, false, (byte) 3, -98, -49);
        }
        return this.field6695[arg0].method605(2);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lme;II)Z", line = 130)
    public final boolean method2785(class195 arg0, int arg1, int arg2) {
        field6709++;
        if (arg1 != 0) {
            return true;
        } else if (this.field6700 == 0) {
            return false;
        } else {
            this.field6695[Integer.MAX_VALUE & this.field6700].method603(arg0, true, arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lwh;)V", line = 1141)
    public class455(class148 arg0) {
        this.field6699 = arg0;
        this.field6707 = new class718(arg0);
        this.field6695 = new class249[10];
        this.field6695[1] = new class523(arg0);
        this.field6695[2] = new class347(arg0, this.field6707);
        this.field6695[4] = new class226(arg0, this.field6707);
        this.field6695[5] = new class685(arg0, this.field6707);
        this.field6695[6] = new class731(arg0);
        this.field6695[7] = new class354(arg0);
        this.field6695[3] = this.field6712 = new class70(arg0);
        this.field6695[8] = new class114(arg0, this.field6707);
        this.field6695[9] = new class136(arg0, this.field6707);
        if (!this.field6695[8].method605(2)) {
            this.field6695[8] = this.field6695[4];
        }
        if (!this.field6695[9].method605(2)) {
            this.field6695[9] = this.field6695[8];
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIBII)V", line = 154)
    public static final void method2786(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field6697++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class180.field2772 + ((class349.field5106 - class180.field2772) * var8 / 100);
        class188.field2859 = class188.field2856 * var9 >> 8;
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg1 & 0x3FFF;
        int var12 = 16384 - arg0 & 0x3FFF;
        int var13 = 0;
        if (arg5 != -101) {
            field6702 = -84;
        }
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class373.field5548[var11] * -var10 >> 14;
            var15 = class373.field5549[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class373.field5548[var12] * var15 >> 14;
            var15 = class373.field5549[var12] * var15 >> 14;
        }
        class120.field1650 = arg1;
        class364.field5254 = arg3 - var13;
        class460.field6783 = arg4 - var15;
        class660.field9234 = arg0;
        class259.field3700 = arg2 - var14;
        class253.field3649 = 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZZBII)V", line = 208)
    public final void method2787(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        boolean var7 = arg2 & this.field6699.method483();
        if (arg3 != -122) {
            this.field6712 = null;
        }
        field6703++;
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg4 = arg0;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg1) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field6700 != arg5) {
            if (this.field6700 != 0) {
                this.field6695[this.field6700 & Integer.MAX_VALUE].method611(2);
            }
            if (arg5 != 0) {
                this.field6695[Integer.MAX_VALUE & arg5].method610(1, arg1);
                this.field6695[arg5 & Integer.MAX_VALUE].method608(true, arg1);
                this.field6695[arg5 & Integer.MAX_VALUE].method607(arg0, -13582, arg4);
            }
            this.field6701 = arg4;
            this.field6710 = arg0;
            this.field6700 = arg5;
        } else if (this.field6700 != 0) {
            this.field6695[Integer.MAX_VALUE & this.field6700].method608(true, arg1);
            if (this.field6710 != arg0 || this.field6701 != arg4) {
                this.field6695[Integer.MAX_VALUE & this.field6700].method607(arg0, -13582, arg4);
                this.field6701 = arg4;
                this.field6710 = arg0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIZ[Lsca;II)V", line = 265)
    public static final void method2788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class46[] arg8, int arg9, int arg10) {
        if (arg6 != 100) {
            method2783(0.75029385F, 44, -1.1722504F, -21, -82, -78, 2.140641F, 55);
        }
        field6706++;
        class736.field10316.method476(arg10, arg2, arg5, arg0);
        for (int var11 = 0; var11 < arg8.length; var11++) {
            class46 var12 = arg8[var11];
            if (var12 != null && (var12.field557 == arg3 || arg3 == -1412584499 && class609.field8613 == var12)) {
                int var13 = var12.field669 + arg9;
                int var14 = var12.field643 + arg4;
                int var15 = var13 + var12.field549 + 1;
                int var16 = var12.field574 + var14 + 1;
                int var17;
                if (arg1 == -1) {
                    class184.field2816[class196.field2983].setBounds(var12.field669 + arg9, var12.field643 + arg4, var12.field549, var12.field574);
                    var17 = class196.field2983++;
                } else {
                    var17 = arg1;
                }
                var12.field567 = class357.field5189;
                var12.field566 = var17;
                if (!client.method1889(var12)) {
                    if (var12.field521 != 0) {
                        class726.method4093(var12, (byte) -60);
                    }
                    int var18 = var12.field669 + arg9;
                    int var19 = var12.field643 + arg4;
                    int var20 = 0;
                    int var21 = 0;
                    if (class419.field6265) {
                        var20 = class210.method1422(true);
                        var21 = class407.method2589((byte) -45);
                    }
                    int var22 = var12.field652;
                    if (class501.field7119 && (client.method1886(var12).field3393 != 0 || var12.field577 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class609.field8613 == var12) {
                        if (arg3 != -1412584499 && (class173.field2686 == var12.field553 || class689.field9508 == var12.field553)) {
                            class754.field10541 = arg4;
                            class181.field2779 = arg9;
                            class421.field6283 = arg8;
                            continue;
                        }
                        if (class439.field6503 && class172.field2674) {
                            int var23 = class632.field8840.method2697(4212) + var20;
                            int var24 = var21 + class632.field8840.method2698(arg6 ^ 0x64);
                            int var25 = var24 - class289.field4114;
                            int var26 = var23 - class612.field8649;
                            if (var26 < class339.field4933) {
                                var26 = class339.field4933;
                            }
                            if ((var12.field549 + var26) > (class339.field4933 + class531.field7570.field549)) {
                                var26 = class531.field7570.field549 + class339.field4933 - var12.field549;
                            }
                            if (class242.field3518 > var25) {
                                var25 = class242.field3518;
                            }
                            var18 = var26;
                            if (class242.field3518 + class531.field7570.field574 < var12.field574 + var25) {
                                var25 = class242.field3518 + class531.field7570.field574 - var12.field574;
                            }
                            var19 = var25;
                        }
                        if (class689.field9508 == var12.field553) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field577 == 2) {
                        var31 = arg5;
                        var32 = arg0;
                        var30 = arg2;
                        var29 = arg10;
                    } else {
                        int var27 = var12.field549 + var18;
                        int var28 = var12.field574 + var19;
                        var29 = arg10 >= var18 ? arg10 : var18;
                        var30 = var19 <= arg2 ? arg2 : var19;
                        if (var12.field577 == 9) {
                            var27++;
                            var28++;
                        }
                        var31 = var27 < arg5 ? var27 : arg5;
                        var32 = arg0 <= var28 ? arg0 : var28;
                    }
                    if (var31 > var29 && var30 < var32) {
                        if (var12.field521 != 0) {
                            if (class476.field6917 == var12.field521 || class239.field3475 == var12.field521) {
                                class325.method2065(var18, var12, -11167, var19);
                                if (!class419.field6265) {
                                    class9.method65(var19, (byte) -90, class239.field3475 == var12.field521, var12.field574, var18, var12.field549);
                                    class736.field10316.method476(arg10, arg2, arg5, arg0);
                                }
                                class228.field3352[var17] = true;
                                continue;
                            }
                            if (class221.field3248 == var12.field521) {
                                if (var12.method339(class736.field10316, arg6 + 30375) != null) {
                                    class290.method1858((byte) 11);
                                    class580.method3366(class736.field10316, var19, var12, 59, var18);
                                    class50.field715[var17] = true;
                                    class736.field10316.method476(arg10, arg2, arg5, arg0);
                                    if (class419.field6265) {
                                        if (arg7) {
                                            class497.method2963(var16, var15, (byte) -122, var14, var13);
                                        } else {
                                            class557.method3247(var13, var16, 0, var14, var15);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class444.field6595 == var12.field521) {
                                if (var12.method339(class736.field10316, 30475) != null) {
                                    class59.method412((byte) -87, var12, var18, var19);
                                    class50.field715[var17] = true;
                                    class736.field10316.method476(arg10, arg2, arg5, arg0);
                                    if (class419.field6265) {
                                        if (arg7) {
                                            class497.method2963(var16, var15, (byte) -119, var14, var13);
                                        } else {
                                            class557.method3247(var13, var16, 0, var14, var15);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class246.field3577 == var12.field521) {
                                class445.method2756(var12.field574, var12.field549, var19, var18, class409.field6166, (byte) -120, class736.field10316);
                                class228.field3352[var17] = true;
                                class736.field10316.method476(arg10, arg2, arg5, arg0);
                                continue;
                            }
                            if (class248.field3607 == var12.field521) {
                                class490.method2931(var12.field549, var19, var12.field574, var18, 81, class736.field10316);
                                class228.field3352[var17] = true;
                                class736.field10316.method476(arg10, arg2, arg5, arg0);
                                continue;
                            }
                            if (class10.field150 == var12.field521) {
                                if (!class475.field6906 && !class405.field6090) {
                                    continue;
                                }
                                int var33 = var12.field549 + var18;
                                int var34 = var19 + 15;
                                if (class419.field6265) {
                                    if (arg7) {
                                        class497.method2963(var16, var15, (byte) -24, var14, var13);
                                    } else {
                                        class557.method3247(var13, var16, 0, var14, var15);
                                    }
                                }
                                if (class475.field6906) {
                                    int var35 = -256;
                                    if (class195.field2953 < 20) {
                                        var35 = -65536;
                                    }
                                    class358.field5201.method545(var33, "Fps:" + class195.field2953, -1, var35, var34, (byte) 126);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class580.field8247) {
                                            class67.method593(16);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class618.method3559("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", false, 4);
                                            }
                                        }
                                    }
                                    class358.field5201.method545(var33, "Mem:" + var37 + "k", -1, var38, var34, (byte) 114);
                                    var34 += 15;
                                    class358.field5201.method545(var33, "In:" + class286.field4072 + "B/s Out:" + class181.field2782 + "B/s", -1, -256, var34, (byte) 118);
                                    var34 += 15;
                                    int var40 = class736.field10316.method464() / 1024;
                                    class358.field5201.method545(var33, "Offheap:" + var40 + "k", -1, ~var40 >= -65537 ? -256 : -65536, var34, (byte) 121);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class573.field8096[var44] != null) {
                                            var41 += class573.field8096[var44].method4207((byte) 7);
                                            var42 += class573.field8096[var44].method4209(9620);
                                            var43 += class573.field8096[var44].method4211(-14246);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class230.method1543((long) var46, (byte) 126, 2, 0, true) + "% (" + var45 + "%)";
                                    class427.field6332.method545(var33, var47, -1, -256, var34, (byte) 114);
                                    var34 += 12;
                                }
                                if (class515.field7306 > 0) {
                                    class427.field6332.method545(var33, "Particles: " + class285.field4052 + " / " + class515.field7306, -1, -256, var34, (byte) 119);
                                }
                                var34 += 12;
                                if (class405.field6090) {
                                    class427.field6332.method545(var33, "Polys: " + class736.field10316.method461() + " Models: " + class736.field10316.method508(), -1, -256, var34, (byte) 118);
                                    var34 += 12;
                                    class427.field6332.method545(var33, "Ls: " + class49.field699 + " La: " + class420.field6278 + " NPC: " + class421.field6284 + " Pl: " + class228.field3349, -1, -256, var34, (byte) 120);
                                    var34 += 12;
                                    class400.method2541((byte) -122);
                                }
                                class228.field3352[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field577 == 0) {
                            if (class289.field4134 == var12.field521 && class736.field10316.method441()) {
                                class736.field10316.method419(var18, var19, var12.field549, var12.field574);
                            }
                            method2788(var32, var17, var30, var12.field610, var19 - var12.field554, var31, 100, arg7, arg8, var18 - var12.field527, var29);
                            if (var12.field621 != null) {
                                method2788(var32, var17, var30, var12.field610, var19 - var12.field554, var31, arg6, arg7, var12.field621, var18 - var12.field527, var29);
                            }
                            class421 var48 = (class421) class291.field4168.method2287((long) var12.field610, (byte) -117);
                            if (var48 != null) {
                                class10.method72(var31, var18, var32, var30, var17, var19, (byte) -99, var29, var48.field6282);
                            }
                            if (class289.field4134 == var12.field521 && class736.field10316.method441()) {
                                class736.field10316.method536();
                            }
                            class736.field10316.method476(arg10, arg2, arg5, arg0);
                        }
                        if (class432.field6444[var17] || class425.field6308 > 1) {
                            if (var12.field577 == 3) {
                                if (var22 == 0) {
                                    if (var12.field555) {
                                        class736.field10316.method516(var18, var19, var12.field549, var12.field574, var12.field592, 0);
                                    } else {
                                        class736.field10316.method525(var18, var19, var12.field549, var12.field574, var12.field592, 0);
                                    }
                                } else if (var12.field555) {
                                    class736.field10316.method516(var18, var19, var12.field549, var12.field574, 255 - (var22 & 0xFF) << 24 | var12.field592 & 0xFFFFFF, 1);
                                } else {
                                    class736.field10316.method525(var18, var19, var12.field549, var12.field574, var12.field592 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                }
                                if (class419.field6265) {
                                    if (arg7) {
                                        class497.method2963(var16, var15, (byte) -120, var14, var13);
                                    } else {
                                        class557.method3247(var13, var16, arg6 ^ 0x64, var14, var15);
                                    }
                                }
                            } else if (var12.field577 == 4) {
                                class61 var49 = var12.method345(class736.field10316, -127);
                                if (var49 != null) {
                                    int var50 = var12.field592;
                                    String var51 = var12.field654;
                                    if (var12.field687 != -1) {
                                        class578 var52 = class336.field4876.method2079(var12.field687, (byte) 111);
                                        var51 = var52.field8231;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field8158 == 1 || var12.field562 != 1) && var12.field562 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class209.method1413(var12.field562, false);
                                        }
                                    }
                                    if (var12.field520 != -1) {
                                        var51 = class296.method1874((byte) 117, var12.field520);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class625.field8742 == var12) {
                                        var51 = class430.field6401.method2679(class650.field9160, 124);
                                        var50 = var12.field592;
                                    }
                                    if (class68.field971) {
                                        class736.field10316.method509(var18, var19, var12.field549 + var18, var12.field574 + var19);
                                    }
                                    var49.method541(var12.field574, class391.field5894, null, var19, var12.field613, -2, var12.field582, var12.field548, 0, var12.field651, 0, 255 - (var22 & 0xFF) << 24 | var50, null, var18, var12.field634 ? 255 - (var22 & 0xFF) << 24 : -1, var12.field549, var51);
                                    if (class68.field971) {
                                        class736.field10316.method476(arg10, arg2, arg5, arg0);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class68.field971) {
                                            class66 var53 = class45.method328(class736.field10316, var12.field671, (byte) 69);
                                            int var54 = var53.method583(var12.field549, class391.field5894, arg6 ^ 0x64, var51);
                                            int var55 = var53.method590(arg6 ^ 0x34, class391.field5894, var51, var12.field549, var12.field613);
                                            if (class419.field6265) {
                                                if (arg7) {
                                                    class497.method2963(var19 + var55, var18 + var54, (byte) -103, var19, var18);
                                                } else {
                                                    class557.method3247(var18, var19 + var55, arg6 + -100, var19, var18 + var54);
                                                }
                                            }
                                        } else if (class419.field6265) {
                                            if (arg7) {
                                                class497.method2963(var16, var15, (byte) -90, var14, var13);
                                            } else {
                                                class557.method3247(var13, var16, 0, var14, var15);
                                            }
                                        }
                                    }
                                } else if (class456.field6723) {
                                    class673.method3850(var12, (byte) -77);
                                }
                            } else if (var12.field577 == 5) {
                                if (var12.field559 >= 0) {
                                    var12.method340(-512, class288.field4108, class684.field9464).method2669(var12.field578 << 3, var19, 0, var12.field549, class736.field10316, var18, var12.field675 << 3, var12.field574, 1, 0);
                                } else {
                                    class536 var56;
                                    if (var12.field687 != -1) {
                                        class386 var57 = var12.field534 ? class130.field1749.field9495 : null;
                                        var56 = class336.field4876.method2085(class736.field10316, var12.field683, var12.field687, -123, var12.field537, var12.field628 | 0xFF000000, var12.field562, var57);
                                    } else if (var12.field520 == -1) {
                                        var56 = var12.method341((byte) -83, class736.field10316);
                                    } else {
                                        var56 = class201.method1382((byte) 121, class736.field10316, var12.field520);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method1504();
                                        int var59 = var56.method1514();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field592 == 0 ? 16777215 : var12.field592 & 0xFFFFFF);
                                        if (var12.field623) {
                                            class736.field10316.method509(var18, var19, var12.field549 + var18, var19 - -var12.field574);
                                            if (var12.field589 != 0) {
                                                int var61 = (var12.field549 + var58 - 1) / var58;
                                                int var62 = (var59 - (1 - var12.field574)) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field592 == 0) {
                                                            var56.method3147((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field589);
                                                        } else {
                                                            var56.method3141((float) var58 / 2.0F + (float) (var18 + (var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field589, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field592 == 0 && var22 == 0) {
                                                var56.method3150(var18, var19, var12.field549, var12.field574);
                                            } else {
                                                var56.method1513(var18, var19, var12.field549, var12.field574, 0, var60, 1);
                                            }
                                            class736.field10316.method476(arg10, arg2, arg5, arg0);
                                        } else if (var12.field592 == 0 && var22 == 0) {
                                            if (var12.field589 != 0) {
                                                var56.method3147((float) var12.field549 / 2.0F + (float) var18, (float) var12.field574 / 2.0F + (float) var19, var12.field549 * 4096 / var58, var12.field589);
                                            } else if (var12.field549 == var58 && var12.field574 == var59) {
                                                var56.method3142(var18, var19);
                                            } else {
                                                var56.method3149(var18, var19, var12.field549, var12.field574);
                                            }
                                        } else if (var12.field589 != 0) {
                                            var56.method3141((float) var12.field549 / 2.0F + (float) var18, (float) var12.field574 / 2.0F + (float) var19, var12.field549 * 4096 / var58, var12.field589, 0, var60, 1);
                                        } else if (var12.field549 == var58 && var12.field574 == var59) {
                                            var56.method133(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method3144(var18, var19, var12.field549, var12.field574, 0, var60, 1);
                                        }
                                    } else if (class456.field6723) {
                                        class673.method3850(var12, (byte) 111);
                                    }
                                }
                                if (class419.field6265) {
                                    if (arg7) {
                                        class497.method2963(var16, var15, (byte) 39, var14, var13);
                                    } else {
                                        class557.method3247(var13, var16, 0, var14, var15);
                                    }
                                }
                            } else if (var12.field577 == 6) {
                                class630.method3632((byte) 95);
                                Object var65 = null;
                                class473 var66 = null;
                                int var67 = 0;
                                if (var12.field687 != -1) {
                                    class578 var68 = class336.field4876.method2079(var12.field687, (byte) 117);
                                    if (var68 != null) {
                                        class578 var69 = var68.method3344((byte) 106, var12.field562);
                                        class288 var70 = var12.field544 == -1 ? null : class742.field10404.method2663(0, var12.field544);
                                        class386 var71 = var12.field534 ? class130.field1749.field9495 : null;
                                        var66 = var69.method3361(var12.field607, 1, var12.field522, var71, 2048, arg6 - 99, class736.field10316, var70, var12.field619);
                                        if (var66 == null) {
                                            class673.method3850(var12, (byte) -52);
                                        } else {
                                            var67 = -var66.method253() >> 1;
                                        }
                                    }
                                } else if (var12.field585 == 5) {
                                    int var72 = var12.field679;
                                    if (var72 >= 0 && var72 < 2048) {
                                        class689 var73 = class314.field4456[var72];
                                        class288 var74 = var12.field544 == -1 ? null : class742.field10404.method2663(0, var12.field544);
                                        if (var73 != null && (class701.field9775 == var72 || class30.method148(true, var73.field9513) == var12.field529)) {
                                            var66 = var73.field9495.method2481(null, null, class736.field10316, class582.field8291, 0, var12.field619, class742.field10404, var12.field607, class95.field1354, 0, -1, 0, 127, class336.field4876, var74, null, class74.field1032, 2048, true, var12.field522, class83.field1160);
                                        }
                                    }
                                } else if (var12.field585 == 8 || var12.field585 == 9) {
                                    class384 var76 = class529.method3090(false, (byte) 82, var12.field679);
                                    class288 var77 = var12.field544 == -1 ? null : class742.field10404.method2663(0, var12.field544);
                                    if (var76 != null) {
                                        class386 var78 = var12.field534 ? class130.field1749.field9495 : null;
                                        var66 = var76.method2472(var78, class736.field10316, var12.field607, var77, 2048, var12.field522, var12.field619, -25, ~var12.field585 == -10, var12.field529);
                                    }
                                } else if (var12.field544 == -1) {
                                    var66 = var12.method331(class95.field1354, class336.field4876, null, class83.field1160, -1, class74.field1032, class736.field10316, class582.field8291, class742.field10404, 0, (class367) var65, class130.field1749.field9495, -1, (byte) 110, 2048);
                                    if (var66 == null && class456.field6723) {
                                        class673.method3850(var12, (byte) -26);
                                    }
                                } else {
                                    class288 var75 = class742.field10404.method2663(0, var12.field544);
                                    var66 = var12.method331(class95.field1354, class336.field4876, var75, class83.field1160, var12.field522, class74.field1032, class736.field10316, class582.field8291, class742.field10404, var12.field607, (class367) var65, class130.field1749.field9495, var12.field619, (byte) 51, 2048);
                                    if (var66 == null && class456.field6723) {
                                        class673.method3850(var12, (byte) -112);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field659 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field549 << 9) / var12.field659;
                                    }
                                    int var80;
                                    if (var12.field531 > 0) {
                                        var80 = (var12.field574 << 9) / var12.field531;
                                    } else {
                                        var80 = 512;
                                    }
                                    int var81 = var12.field549 / 2 + var18;
                                    int var82 = var12.field574 / 2 + var19;
                                    if (!var12.field558) {
                                        var81 += var12.field594 * var79 >> 9;
                                        var82 += var12.field596 * var80 >> 9;
                                    }
                                    class124.field1673.method769();
                                    class736.field10316.method534(class124.field1673);
                                    class736.field10316.method500(var81, var82, var79, var80);
                                    class736.field10316.method444();
                                    if (var12.field541) {
                                        class736.field10316.method463(false);
                                    }
                                    if (var12.field558) {
                                        class562.field8014.method765(var12.field629);
                                        class562.field8014.method768(var12.field523);
                                        class562.field8014.method760(var12.field528);
                                        class562.field8014.method758(var12.field594, var12.field596, var12.field639);
                                    } else {
                                        int var83 = (var12.field686 << 2) * class373.field5548[var12.field629 << 3] >> 14;
                                        int var84 = (var12.field686 << 2) * class373.field5549[var12.field629 << 3] >> 14;
                                        class562.field8014.method777(-var12.field528 << 3);
                                        class562.field8014.method768(var12.field523 << 3);
                                        class562.field8014.method758(var12.field680 << 2, (var12.field620 << 2) + var83 + var67, (var12.field620 << 2) + var84);
                                        class562.field8014.method763(var12.field629 << 3);
                                    }
                                    var12.method347(class736.field10316, class562.field8014, var66, false, class357.field5189);
                                    if (class68.field971) {
                                        class736.field10316.method509(var18, var19, var12.field549 + var18, var12.field574 + var19);
                                    }
                                    if (var12.field558) {
                                        if (var12.field650) {
                                            var66.method235(class562.field8014, null, var12.field686, 1);
                                        } else {
                                            var66.method265(class562.field8014, null, 1);
                                            if (var12.field530 != null) {
                                                class736.field10316.method523(var12.field530.method3614());
                                            }
                                        }
                                    } else if (var12.field650) {
                                        var66.method235(class562.field8014, null, var12.field686 << 2, 1);
                                    } else {
                                        var66.method265(class562.field8014, null, 1);
                                        if (var12.field530 != null) {
                                            class736.field10316.method523(var12.field530.method3614());
                                        }
                                    }
                                    if (class68.field971) {
                                        class736.field10316.method476(arg10, arg2, arg5, arg0);
                                    }
                                    if (var12.field541) {
                                        class736.field10316.method463(true);
                                    }
                                }
                                if (class419.field6265) {
                                    if (arg7) {
                                        class497.method2963(var16, var15, (byte) 80, var14, var13);
                                    } else {
                                        class557.method3247(var13, var16, 0, var14, var15);
                                    }
                                }
                            } else if (var12.field577 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field664) {
                                    var88 = var18;
                                    var85 = var12.field574 + var19;
                                    var87 = var19;
                                    var86 = var12.field549 + var18;
                                } else {
                                    var85 = var19;
                                    var86 = var12.field549 + var18;
                                    var87 = var19 + var12.field574;
                                    var88 = var18;
                                }
                                if (var12.field518 == 1) {
                                    class736.field10316.method436(var88, var85, var86, var87, var12.field592, 0);
                                } else {
                                    class736.field10316.method511(var88, var85, var86, var87, var12.field592, var12.field518, 0);
                                }
                                if (class419.field6265) {
                                    if (arg7) {
                                        class497.method2963(var16, var15, (byte) 101, var14, var13);
                                    } else {
                                        class557.method3247(var13, var16, 0, var14, var15);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lgda;BLgda;)V", line = 1123)
    public static final void method2789(class55 arg0, byte arg1, class55 arg2) {
        if (arg1 != 72) {
            field6698 = -80;
        }
        field6704++;
        if (arg2.field766 != null) {
            arg2.method385((byte) -39);
        }
        arg2.field762 = arg0;
        arg2.field766 = arg0.field766;
        arg2.field766.field762 = arg2;
        arg2.field762.field766 = arg2;
    }
}
