import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 extends class105 {

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "[Leh;")
    public static class47[] field303 = new class47[100];

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    public static int field305 = 0;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "Loc;")
    public static class129 field299;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "Lah;")
    public static class9 field298;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIILdg;IBI)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, class37 arg4, int arg5, byte arg6, int arg7) {
        ++field300;
        if (class204.field4029 && ~(class182.field3490[0][arg1][arg0] & 2) == -1) {
            if (~(class182.field3490[arg7][arg1][arg0] & 16) != -1) {
                return;
            }
            if (~class25.method235(arg0, arg7, arg1, (byte) 101) != ~class107.field2226) {
                return;
            }
        }
        if (~class195.field3803 < ~arg7) {
            class195.field3803 = arg7;
        }
        class202 var8 = class99.method806(arg6 + -81, arg3);
        int var9;
        int var10;
        if (~arg2 != -2 && ~arg2 != -4) {
            var9 = var8.field3949;
            var10 = var8.field3980;
        } else {
            var10 = var8.field3949;
            var9 = var8.field3980;
        }
        int var11;
        int var12;
        if (arg1 + var10 > 104) {
            var11 = arg1;
            var12 = arg1 - -1;
        } else {
            var11 = (var10 >> 1) + arg1;
            var12 = (var10 - -1 >> 1) + arg1;
        }
        int var13;
        int var14;
        if (arg0 + var9 <= 104) {
            var13 = (var9 + 1 >> 1) + arg0;
            var14 = arg0 - -(var9 >> 1);
        } else {
            var13 = arg0 + 1;
            var14 = arg0;
        }
        int[][] var15 = class103.field2171[arg7];
        int var16 = (arg1 << 7) + (var10 << 6);
        int var17 = var15[var11][var14] + var15[var12][var13] + var15[var12][var14] - -var15[var11][var13] >> 2;
        int var18 = (arg0 << 7) + (var9 << 6);
        long var19 = (long) (arg2 << 20 | arg5 << 14 | arg0 << 7 | arg1 | 1073741824);
        if (~var8.field3926 == -1) {
            var19 |= Long.MIN_VALUE;
        }
        if (var8.field3927 == 1) {
            var19 |= 4194304L;
        }
        long var21 = var19 | (long) arg3 << 32;
        if (var8.method1324(19694)) {
            class131.method968(2048, arg0, var8, arg1, arg2, arg7);
        }
        if (~arg5 == -23) {
            if (!class204.field4029 || var8.field3926 != 0 || ~var8.field3969 == -2 || var8.field3986) {
                class92 var23;
                if (~var8.field3942 == 0 && var8.field3945 == null) {
                    var23 = var8.method1322(var18, var16, 22, var15, var17, arg2, (byte) -9);
                } else {
                    var23 = new class141(arg3, 22, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                }
                class151.method1061(arg7, arg1, arg0, var17, var23, var21);
                if (var8.field3969 == 1 && arg4 != null) {
                    arg4.method319(true, arg1, arg0);
                }
            }
        } else if (arg5 != 10 && arg5 != 11) {
            if (~arg5 <= -13) {
                class92 var24;
                if (~var8.field3942 == 0 && var8.field3945 == null) {
                    var24 = var8.method1322(var18, var16, arg5, var15, var17, arg2, (byte) -9);
                } else {
                    var24 = new class141(arg3, arg5, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                }
                class103.method844(arg7, arg1, arg0, var17, 1, 1, var24, 0, var21);
                if (~arg5 <= -13 && arg5 <= 17 && ~arg5 != -14 && arg7 > 0) {
                    class148.field2911[arg7][arg1][arg0] = class57.method495(class148.field2911[arg7][arg1][arg0], 2340);
                }
                if (~var8.field3969 != -1 && arg4 != null) {
                    arg4.method317(arg0, (byte) 67, var10, arg1, var8.field3962, var9);
                }
            } else if (arg5 == 0) {
                class92 var25;
                if (var8.field3942 == -1 && var8.field3945 == null) {
                    var25 = var8.method1322(var18, var16, 0, var15, var17, arg2, (byte) -9);
                } else {
                    var25 = new class141(arg3, 0, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                }
                class192.method1262(arg7, arg1, arg0, var17, var25, (class92) null, class130.field2580[arg2], 0, var21);
                if (arg2 != 0) {
                    if (~arg2 == -2) {
                        if (var8.field3974) {
                            class197.field3846[arg7][arg1][arg0 + 1] = 50;
                            class197.field3846[arg7][arg1 + 1][arg0 + 1] = 50;
                        }
                        if (var8.field3939) {
                            class148.field2911[arg7][arg1][arg0 + 1] = class57.method495(class148.field2911[arg7][arg1][arg0 + 1], 1170);
                        }
                    } else if (~arg2 == -3) {
                        if (var8.field3974) {
                            class197.field3846[arg7][arg1 + 1][arg0] = 50;
                            class197.field3846[arg7][arg1 + 1][arg0 + 1] = 50;
                        }
                        if (var8.field3939) {
                            class148.field2911[arg7][arg1 + 1][arg0] = class57.method495(class148.field2911[arg7][arg1 + 1][arg0], 585);
                        }
                    } else if (~arg2 == -4) {
                        if (var8.field3974) {
                            class197.field3846[arg7][arg1][arg0] = 50;
                            class197.field3846[arg7][arg1 + 1][arg0] = 50;
                        }
                        if (var8.field3939) {
                            class148.field2911[arg7][arg1][arg0] = class57.method495(class148.field2911[arg7][arg1][arg0], 1170);
                        }
                    }
                } else {
                    if (var8.field3974) {
                        class197.field3846[arg7][arg1][arg0] = 50;
                        class197.field3846[arg7][arg1][arg0 + 1] = 50;
                    }
                    if (var8.field3939) {
                        class148.field2911[arg7][arg1][arg0] = class57.method495(class148.field2911[arg7][arg1][arg0], 585);
                    }
                }
                if (var8.field3969 != 0 && arg4 != null) {
                    arg4.method321(arg0, arg2, (byte) 127, arg5, arg1, var8.field3962);
                }
                if (~var8.field3973 != -17) {
                    class87.method712(arg7, arg1, arg0, var8.field3973);
                }
            } else if (arg5 == 1) {
                class92 var26;
                if (var8.field3942 == -1 && var8.field3945 == null) {
                    var26 = var8.method1322(var18, var16, 1, var15, var17, arg2, (byte) -9);
                } else {
                    var26 = new class141(arg3, 1, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                }
                class192.method1262(arg7, arg1, arg0, var17, var26, (class92) null, class155.field3028[arg2], 0, var21);
                if (var8.field3974) {
                    if (~arg2 == -1) {
                        class197.field3846[arg7][arg1][arg0 + 1] = 50;
                    } else if (~arg2 != -2) {
                        if (~arg2 != -3) {
                            if (~arg2 == -4) {
                                class197.field3846[arg7][arg1][arg0] = 50;
                            }
                        } else {
                            class197.field3846[arg7][arg1 + 1][arg0] = 50;
                        }
                    } else {
                        class197.field3846[arg7][arg1 + 1][arg0 + 1] = 50;
                    }
                }
                if (var8.field3969 != 0 && arg4 != null) {
                    arg4.method321(arg0, arg2, (byte) 126, arg5, arg1, var8.field3962);
                }
            } else if (~arg5 == -3) {
                int var27 = 3 & arg2 + 1;
                class92 var28;
                class92 var29;
                if (var8.field3942 == -1 && var8.field3945 == null) {
                    var28 = var8.method1322(var18, var16, 2, var15, var17, arg2 + 4, (byte) -9);
                    var29 = var8.method1322(var18, var16, 2, var15, var17, var27, (byte) -9);
                } else {
                    var28 = new class141(arg3, 2, arg2 + 4, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                    var29 = new class141(arg3, 2, var27, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                }
                class192.method1262(arg7, arg1, arg0, var17, var28, var29, class130.field2580[arg2], class130.field2580[var27], var21);
                if (var8.field3939) {
                    if (~arg2 == -1) {
                        class148.field2911[arg7][arg1][arg0] = class57.method495(class148.field2911[arg7][arg1][arg0], 585);
                        class148.field2911[arg7][arg1][arg0 + 1] = class57.method495(class148.field2911[arg7][arg1][arg0 + 1], 1170);
                    } else if (~arg2 != -2) {
                        if (~arg2 != -3) {
                            if (arg2 == 3) {
                                class148.field2911[arg7][arg1][arg0] = class57.method495(class148.field2911[arg7][arg1][arg0], 1170);
                                class148.field2911[arg7][arg1][arg0] = class57.method495(class148.field2911[arg7][arg1][arg0], 585);
                            }
                        } else {
                            class148.field2911[arg7][arg1 + 1][arg0] = class57.method495(class148.field2911[arg7][arg1 + 1][arg0], 585);
                            class148.field2911[arg7][arg1][arg0] = class57.method495(class148.field2911[arg7][arg1][arg0], 1170);
                        }
                    } else {
                        class148.field2911[arg7][arg1][arg0 - -1] = class57.method495(class148.field2911[arg7][arg1][arg0 - -1], 1170);
                        class148.field2911[arg7][arg1 + 1][arg0] = class57.method495(class148.field2911[arg7][arg1 + 1][arg0], 585);
                    }
                }
                if (~var8.field3969 != -1 && arg4 != null) {
                    arg4.method321(arg0, arg2, (byte) 123, arg5, arg1, var8.field3962);
                }
                if (~var8.field3973 != -17) {
                    class87.method712(arg7, arg1, arg0, var8.field3973);
                }
            } else if (arg5 == 3) {
                class92 var30;
                if (~var8.field3942 == 0 && var8.field3945 == null) {
                    var30 = var8.method1322(var18, var16, 3, var15, var17, arg2, (byte) -9);
                } else {
                    var30 = new class141(arg3, 3, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                }
                class192.method1262(arg7, arg1, arg0, var17, var30, (class92) null, class155.field3028[arg2], 0, var21);
                if (var8.field3974) {
                    if (arg2 != 0) {
                        if (arg2 != 1) {
                            if (~arg2 != -3) {
                                if (arg2 == 3) {
                                    class197.field3846[arg7][arg1][arg0] = 50;
                                }
                            } else {
                                class197.field3846[arg7][arg1 + 1][arg0] = 50;
                            }
                        } else {
                            class197.field3846[arg7][arg1 + 1][arg0 + 1] = 50;
                        }
                    } else {
                        class197.field3846[arg7][arg1][arg0 - -1] = 50;
                    }
                }
                if (var8.field3969 != 0 && arg4 != null) {
                    arg4.method321(arg0, arg2, (byte) 127, arg5, arg1, var8.field3962);
                }
            } else if (~arg5 == -10) {
                class92 var31;
                if (~var8.field3942 == 0 && var8.field3945 == null) {
                    var31 = var8.method1322(var18, var16, arg5, var15, var17, arg2, (byte) -9);
                } else {
                    var31 = new class141(arg3, arg5, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                }
                class103.method844(arg7, arg1, arg0, var17, 1, 1, var31, 0, var21);
                if (var8.field3969 != 0 && arg4 != null) {
                    arg4.method317(arg0, (byte) 67, var10, arg1, var8.field3962, var9);
                }
                if (var8.field3973 != 16) {
                    class87.method712(arg7, arg1, arg0, var8.field3973);
                }
            } else if (arg5 == 4) {
                class92 var32;
                if (~var8.field3942 == 0 && var8.field3945 == null) {
                    var32 = var8.method1322(var18, var16, 4, var15, var17, arg2, (byte) -9);
                } else {
                    var32 = new class141(arg3, 4, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                }
                class120.method929(arg7, arg1, arg0, var17, var32, (class92) null, class130.field2580[arg2], 0, 0, 0, var21);
            } else {
                if (arg6 != 81) {
                    method126(26);
                }
                if (~arg5 == -6) {
                    long var33 = class92.method743(arg7, arg1, arg0);
                    int var35 = 16;
                    if (var33 != 0L) {
                        var35 = class99.method806(arg6 ^ 81, Integer.MAX_VALUE & (int) (var33 >>> 32)).field3973;
                    }
                    class92 var36;
                    if (~var8.field3942 == 0 && var8.field3945 == null) {
                        var36 = var8.method1322(var18, var16, 4, var15, var17, arg2, (byte) -9);
                    } else {
                        var36 = new class141(arg3, 4, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                    }
                    class120.method929(arg7, arg1, arg0, var17, var36, (class92) null, class130.field2580[arg2], 0, class118.field2400[arg2] * var35, class136.field2667[arg2] * var35, var21);
                } else if (arg5 == 6) {
                    int var37 = 8;
                    long var38 = class92.method743(arg7, arg1, arg0);
                    if (var38 != 0L) {
                        var37 = class99.method806(0, Integer.MAX_VALUE & (int) (var38 >>> 32)).field3973 / 2;
                    }
                    class92 var40;
                    if (var8.field3942 == -1 && var8.field3945 == null) {
                        var40 = var8.method1322(var18, var16, 4, var15, var17, arg2 + 4, (byte) -9);
                    } else {
                        var40 = new class141(arg3, 4, arg2 + 4, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                    }
                    class120.method929(arg7, arg1, arg0, var17, var40, (class92) null, 256, arg2, class72.field1552[arg2] * var37, class122.field2479[arg2] * var37, var21);
                } else if (arg5 == 7) {
                    int var41 = arg2 + 2 & 3;
                    class92 var42;
                    if (~var8.field3942 == 0 && var8.field3945 == null) {
                        var42 = var8.method1322(var18, var16, 4, var15, var17, var41 + 4, (byte) -9);
                    } else {
                        var42 = new class141(arg3, 4, var41 + 4, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                    }
                    class120.method929(arg7, arg1, arg0, var17, var42, (class92) null, 256, var41, 0, 0, var21);
                } else if (arg5 == 8) {
                    int var43 = 8;
                    int var44 = arg2 - -2 & 3;
                    long var45 = class92.method743(arg7, arg1, arg0);
                    if (~var45 != -1L) {
                        var43 = class99.method806(arg6 + -81, Integer.MAX_VALUE & (int) (var45 >>> 32)).field3973 / 2;
                    }
                    class92 var47;
                    class92 var48;
                    if (var8.field3942 == -1 && var8.field3945 == null) {
                        var47 = var8.method1322(var18, var16, 4, var15, var17, arg2 + 4, (byte) -9);
                        var48 = var8.method1322(var18, var16, 4, var15, var17, var44 - -4, (byte) -9);
                    } else {
                        var47 = new class141(arg3, 4, arg2 + 4, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                        var48 = new class141(arg3, 4, var44 + 4, arg7, arg1, arg0, var8.field3942, true, (class92) null);
                    }
                    class120.method929(arg7, arg1, arg0, var17, var47, var48, 256, arg2, class72.field1552[arg2] * var43, class122.field2479[arg2] * var43, var21);
                }
            }
        } else {
            class92 var49;
            if (var8.field3942 == -1 && var8.field3945 == null) {
                var49 = var8.method1322(var18, var16, 10, var15, var17, arg2, (byte) -9);
            } else {
                var49 = new class141(arg3, 10, arg2, arg7, arg1, arg0, var8.field3942, true, (class92) null);
            }
            if (var49 != null && class103.method844(arg7, arg1, arg0, var17, var10, var9, var49, arg5 != 11 ? 0 : 256, var21) && var8.field3974) {
                int var50 = 15;
                if (var49 instanceof class30) {
                    var50 = ((class30) var49).method269() / 4;
                    if (~var50 < -31) {
                        var50 = 30;
                    }
                }
                for (int var51 = 0; var51 <= var10; ++var51) {
                    for (int var52 = 0; ~var52 >= ~var9; ++var52) {
                        if (~class197.field3846[arg7][arg1 + var51][arg0 + var52] > ~var50) {
                            class197.field3846[arg7][arg1 + var51][arg0 + var52] = (byte) var50;
                        }
                    }
                }
            }
            if (var8.field3969 != 0 && arg4 != null) {
                arg4.method317(arg0, (byte) 67, var10, arg1, var8.field3962, var9);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        int[] var3 = super.field2192.method336(-55, arg0);
        ++field297;
        if (arg1 < 78) {
            field299 = null;
        }
        if (super.field2192.field770) {
            for (int var4 = 0; ~var4 > ~class149.field2928; ++var4) {
                this.method124(var4, 116, arg0);
                int[] var5 = this.method851(0, true, class36.field692);
                var3[var4] = var5[class176.field3376];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
    private final void method124(int arg0, int arg1, int arg2) {
        int var4 = class26.field500[arg2];
        if (arg1 <= 83) {
            method123(39, 87, 83, 67, (class37) null, 35, (byte) -3, -121);
        }
        int var5 = class167.field3237[arg0];
        ++field296;
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class176.field3376 = arg0;
            class36.field692 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class36.field692 = arg0;
            class176.field3376 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class176.field3376 = class149.field2928 - arg2;
            class36.field692 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class176.field3376 = arg0;
            class36.field692 = class120.field2422 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class176.field3376 = -arg0 + class149.field2928;
            class36.field692 = -arg2 + class120.field2422;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class176.field3376 = -arg2 + class149.field2928;
            class36.field692 = -arg0 + class120.field2422;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class36.field692 = -arg0 + class120.field2422;
            class176.field3376 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class176.field3376 = -arg0 + class149.field2928;
            class36.field692 = arg2;
        }
        class36.field692 &= class122.field2468;
        class176.field3376 &= class121.field2453;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILjava/awt/Color;Leh;)V")
    public static final void method125(int arg0, int arg1, Color arg2, class47 arg3) {
        ++field295;
        try {
            Graphics var4 = class47.field949.getGraphics();
            if (class82.field1756 == null) {
                class82.field1756 = new Font("Helvetica", 1, 13);
                class156.field3048 = class47.field949.getFontMetrics(class82.field1756);
            }
            if (class63.field1346) {
                class63.field1346 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class19.field370, class123.field2486);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (client.field544 == null) {
                    client.field544 = class47.field949.createImage(304, 34);
                }
                Graphics var5 = client.field544.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + 300, 30);
                var5.setFont(class82.field1756);
                var5.setColor(Color.white);
                arg3.method408(var5, 22, (byte) 121, (-arg3.method413(class156.field3048, -121) + 304) / arg1);
                var4.drawImage(client.field544, class19.field370 / 2 - 152, class123.field2486 / 2 + -18, (ImageObserver) null);
            } catch (Exception var8) {
                int var6 = class19.field370 / 2 + -152;
                int var7 = class123.field2486 / 2 + -18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2 + var6, var7 - -2, -(arg0 * 3) + 300, 30);
                var4.setFont(class82.field1756);
                var4.setColor(Color.white);
                arg3.method408(var4, var7 + 22, (byte) 121, var6 - -((-arg3.method413(class156.field3048, -119) + 304) / 2));
            }
        } catch (Exception var9) {
            class47.field949.repaint();
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    public static void method126(int arg0) {
        field298 = null;
        field299 = null;
        field303 = null;
        if (arg0 <= 41) {
            field305 = 25;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 != -256) {
            this.method17(-121, (class68) null, -4);
        }
        ++field301;
        if (~arg0 == -1) {
            super.field2179 = ~arg1.method604((byte) -128) == -2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class14() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field294;
        if (!arg1) {
            this.method15(45, false);
        }
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        int[] var4 = var3[0];
        int[] var5 = var3[1];
        int[] var6 = var3[2];
        if (super.field2186.field28) {
            for (int var7 = 0; ~class149.field2928 < ~var7; ++var7) {
                this.method124(var7, 89, arg0);
                int[][] var8 = this.method854(0, (byte) 10, class36.field692);
                var4[var7] = var8[0][class176.field3376];
                var5[var7] = var8[1][class176.field3376];
                var6[var7] = var8[2][class176.field3376];
            }
        }
        return var3;
    }
}
