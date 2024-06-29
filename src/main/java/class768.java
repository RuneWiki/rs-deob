import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class768 extends class518 {

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "[I")
    private int[] field10969 = new int[257];

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field10976 = new String[] { method5552(method5551("\u000b%~if")), method5552(method5551("\u0018{~\u00043")), method5552(method5551("\r <F")), method5552(method5551("\u000b%~kf")), method5552(method5551("\u000b%~lf")), method5552(method5551("*;&K\"\n1pM<\u000219O \u0017u X+\u00100$")), method5552(method5551("\u000b%~nf")), method5552(method5551("\u000b%~hf")), method5552(method5551("\u000b%~cf")), method5552(method5551("\u000b%~of")), method5552(method5551("\u000b%~`f")) };

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "[I")
    public static int[] field10974 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "Lui;")
    public static class251 field10968 = new class251(64);

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    public static int field10964;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field10966;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public static int field10967;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field10970;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field10971;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field10972;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    public static int field10973;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    public static int field10975;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "[[I")
    private int[][] field10965;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 5)
    public final void method12(int arg0) {
        try {
            ++field10972;
            if (this.field10965 == null) {
                this.method5549(-13942, 1);
            }
            this.method5550(255);
            if (arg0 < 38) {
                this.method17(-89, (class711) null, -117);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10976[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLha;I)Lcd;", line = 19)
    public static final class161 method5545(byte arg0, class18 arg1, int arg2) {
        try {
            ++field10964;
            class488 var3 = class520.method3953((byte) 40, arg1, true, arg2);
            if (arg0 != -126) {
                return null;
            } else {
                return var3 == null ? null : var3.field7159;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10976[8] + arg0 + ',' + (arg1 != null ? field10976[1] : field10976[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 37)
    public static final void method5546(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class643.field9160 = 0;
        class98.field1329 = 0;
        ++class429.field6220;
        if ((arg5 & 2) == 0) {
            for (class202 var8 = class563.field8239[var7]; var8 != null; var8 = var8.field2977) {
                if (!class617.method4547(var8, arg0, arg1, arg2, arg3)) {
                    class325.method2571(var8);
                    if (var8.field2970 != -1) {
                        class723.field10288[class643.field9160++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 1) == 0) {
            for (class202 var9 = class210.field3050[var7]; var9 != null; var9 = var9.field2977) {
                if (!class617.method4547(var9, arg0, arg1, arg2, arg3)) {
                    class325.method2571(var9);
                    if (var9.field2970 != -1) {
                        class457.field6672[class98.field1329++] = var9;
                    }
                }
            }
            for (class202 var10 = class391.field5707[var7]; var10 != null; var10 = var10.field2977) {
                if (!class617.method4547(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method579(false)) {
                        class325.method2571(var10);
                        if (var10.field2970 != -1) {
                            class457.field6672[class98.field1329++] = var10;
                        }
                    } else {
                        class325.method2571(var10);
                        if (var10.field2970 != -1) {
                            class723.field10288[class643.field9160++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class433.field6273; ++var11) {
                    if (!class617.method4547(class640.field9121[var11], arg0, arg1, arg2, arg3)) {
                        class325.method2571(class640.field9121[var11]);
                        if (class640.field9121[var11].field2970 != -1) {
                            if (class640.field9121[var11].method579(false)) {
                                class457.field6672[class98.field1329++] = class640.field9121[var11];
                            } else {
                                class723.field10288[class643.field9160++] = class640.field9121[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class643.field9160 > 0) {
            class53.method565(class723.field10288, 0, class643.field9160 - 1);
            for (int var12 = 0; var12 < class643.field9160; ++var12) {
                class756.method5482(class723.field10288[var12], true, arg6);
            }
        }
        if (class721.field10271) {
            class531.field7699.method189(0, (class330[]) null);
        }
        if ((arg5 & 2) == 0) {
            for (int var13 = class210.field3055; var13 < class293.field4121; ++var13) {
                if (var13 >= arg2 && arg1 != null) {
                    int var14 = class30.field385.length;
                    if (class30.field385.length + class123.field1548 > class508.field7455) {
                        var14 -= class30.field385.length + class123.field1548 - class508.field7455;
                    }
                    int var15 = class30.field385[0].length;
                    if (class30.field385[0].length + class32.field407 > class700.field9795) {
                        var15 -= class30.field385[0].length + class32.field407 - class700.field9795;
                    }
                    boolean[][] var16 = class261.field3705;
                    if (class765.field10925) {
                        if (class335.field4851) {
                            var16 = class173.field2290[var13];
                        }
                        for (int var17 = class727.field10412; var17 < var14; ++var17) {
                            int var18 = class123.field1548 + var17 - class727.field10412;
                            for (int var19 = class193.field2537; var19 < var15; ++var19) {
                                var16[var17][var19] = false;
                                if (class30.field385[var17][var19]) {
                                    int var20 = class32.field407 + var19 - class193.field2537;
                                    for (int var21 = var13; var21 >= 0; --var21) {
                                        if (class608.field8715[var21][var18][var20] != null && class608.field8715[var21][var18][var20].field8846 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class499.method3829(-1, var13, var20, var18)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class335.field4851) {
                        if (arg4 >= 0) {
                            class107.field1413[var13].method2471(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class107.field1413[var13].method2476(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class643.field9161; ++var22) {
                            class658.field9320[var22].method2981((byte) 75, new class257(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class107.field1413[var13].method2471(class269.field3812, class98.field1331, class501.field7316, class261.field3705, false, arg4, arg5);
                    } else {
                        class107.field1413[var13].method2476(class269.field3812, class98.field1331, class501.field7316, class261.field3705, false, arg5);
                    }
                } else {
                    int var23 = class30.field385.length;
                    if (class30.field385.length + class123.field1548 > class508.field7455) {
                        var23 -= class30.field385.length + class123.field1548 - class508.field7455;
                    }
                    int var24 = class30.field385[0].length;
                    if (class30.field385[0].length + class32.field407 > class700.field9795) {
                        var24 -= class30.field385[0].length + class32.field407 - class700.field9795;
                    }
                    boolean[][] var25 = class261.field3705;
                    if (class765.field10925) {
                        if (class335.field4851) {
                            var25 = class173.field2290[var13];
                        }
                        for (int var26 = class727.field10412; var26 < var23; ++var26) {
                            int var27 = class123.field1548 + var26 - class727.field10412;
                            for (int var28 = class193.field2537; var28 < var24; ++var28) {
                                if (class30.field385[var26][var28] && !class499.method3829(-1, var13, class32.field407 + var28 - class193.field2537, var27)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class335.field4851) {
                        if (arg4 >= 0) {
                            class107.field1413[var13].method2471(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class107.field1413[var13].method2476(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class643.field9161; ++var29) {
                            class658.field9320[var29].method2981((byte) 74, new class257(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class107.field1413[var13].method2471(class269.field3812, class98.field1331, class501.field7316, class261.field3705, true, arg4, arg5);
                    } else {
                        class107.field1413[var13].method2476(class269.field3812, class98.field1331, class501.field7316, class261.field3705, true, arg5);
                    }
                }
            }
        }
        if (class98.field1329 > 0) {
            class301.method2406(class457.field6672, 0, class98.field1329 - 1);
            for (int var30 = 0; var30 < class98.field1329; ++var30) {
                class756.method5482(class457.field6672[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)V", line = 338)
    public static void method5547(int arg0) {
        try {
            field10974 = null;
            field10968 = null;
            if (arg0 != 3) {
                method5545((byte) 68, (class18) null, 73);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10976[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(III)Z", line = 355)
    public static final boolean method5548(int arg0, int arg1, int arg2) {
        try {
            if (arg0 < 92) {
                return true;
            } else {
                ++field10970;
                return (class195.method1696(arg1, (byte) -45, arg2) | class450.method3492(arg1, arg2, -1) | class45.method486(true, arg2, arg1)) & class318.method2528(arg2, 2048, arg1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10976[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V", line = 367)
    public class768() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)V", line = 370)
    private final void method5549(int arg0, int arg1) {
        try {
            if (arg0 != -13942) {
                field10968 = null;
            }
            ++field10971;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (~arg1 == -7) {
                                        this.field10965 = new int[4][4];
                                        this.field10965[0][0] = 2048;
                                        this.field10965[0][3] = 0;
                                        this.field10965[0][2] = 4096;
                                        this.field10965[0][1] = 0;
                                        this.field10965[1][0] = 2867;
                                        this.field10965[1][2] = 4096;
                                        this.field10965[1][1] = 4096;
                                        this.field10965[1][3] = 0;
                                        this.field10965[2][1] = 4096;
                                        this.field10965[2][0] = 3276;
                                        this.field10965[2][2] = 4096;
                                        this.field10965[2][3] = 0;
                                        this.field10965[3][2] = 0;
                                        this.field10965[3][0] = 4096;
                                        this.field10965[3][1] = 4096;
                                        this.field10965[3][3] = 0;
                                    } else {
                                        throw new RuntimeException(field10976[5]);
                                    }
                                } else {
                                    this.field10965 = new int[16][4];
                                    this.field10965[0][3] = 321;
                                    this.field10965[0][0] = 0;
                                    this.field10965[0][1] = 80;
                                    this.field10965[0][2] = 192;
                                    this.field10965[1][2] = 449;
                                    this.field10965[1][1] = 321;
                                    this.field10965[1][0] = 155;
                                    this.field10965[1][3] = 562;
                                    this.field10965[2][1] = 578;
                                    this.field10965[2][3] = 803;
                                    this.field10965[2][2] = 690;
                                    this.field10965[2][0] = 389;
                                    this.field10965[3][0] = 671;
                                    this.field10965[3][2] = 995;
                                    this.field10965[3][3] = 1140;
                                    this.field10965[3][1] = 947;
                                    this.field10965[4][3] = 1509;
                                    this.field10965[4][0] = 897;
                                    this.field10965[4][2] = 1397;
                                    this.field10965[4][1] = 1285;
                                    this.field10965[5][0] = 1175;
                                    this.field10965[5][3] = 1413;
                                    this.field10965[5][1] = 1525;
                                    this.field10965[5][2] = 1429;
                                    this.field10965[6][2] = 1461;
                                    this.field10965[6][3] = 1333;
                                    this.field10965[6][1] = 1734;
                                    this.field10965[6][0] = 1368;
                                    this.field10965[7][2] = 1525;
                                    this.field10965[7][0] = 1507;
                                    this.field10965[7][3] = 1702;
                                    this.field10965[7][1] = 1413;
                                    this.field10965[8][2] = 1590;
                                    this.field10965[8][0] = 1736;
                                    this.field10965[8][1] = 1108;
                                    this.field10965[8][3] = 2056;
                                    this.field10965[9][2] = 2056;
                                    this.field10965[9][0] = 2088;
                                    this.field10965[9][3] = 2666;
                                    this.field10965[9][1] = 1766;
                                    this.field10965[10][1] = 2409;
                                    this.field10965[10][2] = 2586;
                                    this.field10965[10][3] = 3276;
                                    this.field10965[10][0] = 2355;
                                    this.field10965[11][3] = 3228;
                                    this.field10965[11][1] = 3116;
                                    this.field10965[11][0] = 2691;
                                    this.field10965[11][2] = 3148;
                                    this.field10965[12][1] = 3806;
                                    this.field10965[12][3] = 3196;
                                    this.field10965[12][2] = 3710;
                                    this.field10965[12][0] = 3031;
                                    this.field10965[13][2] = 3421;
                                    this.field10965[13][0] = 3522;
                                    this.field10965[13][1] = 3437;
                                    this.field10965[13][3] = 3019;
                                    this.field10965[14][2] = 3148;
                                    this.field10965[14][1] = 3116;
                                    this.field10965[14][3] = 3228;
                                    this.field10965[14][0] = 3727;
                                    this.field10965[15][2] = 2505;
                                    this.field10965[15][1] = 2377;
                                    this.field10965[15][3] = 2746;
                                    this.field10965[15][0] = 4096;
                                }
                            } else {
                                this.field10965 = new int[6][4];
                                this.field10965[0][1] = 0;
                                this.field10965[0][3] = 0;
                                this.field10965[0][0] = 0;
                                this.field10965[0][2] = 0;
                                this.field10965[1][2] = 0;
                                this.field10965[1][3] = 1493;
                                this.field10965[1][0] = 1843;
                                this.field10965[1][1] = 0;
                                this.field10965[2][3] = 2939;
                                this.field10965[2][0] = 2457;
                                this.field10965[2][1] = 0;
                                this.field10965[2][2] = 0;
                                this.field10965[3][0] = 2781;
                                this.field10965[3][1] = 0;
                                this.field10965[3][2] = 1124;
                                this.field10965[3][3] = 3565;
                                this.field10965[4][3] = 4031;
                                this.field10965[4][2] = 3084;
                                this.field10965[4][1] = 546;
                                this.field10965[4][0] = 3481;
                                this.field10965[5][2] = 4096;
                                this.field10965[5][0] = 4096;
                                this.field10965[5][1] = 4096;
                                this.field10965[5][3] = 4096;
                            }
                        } else {
                            this.field10965 = new int[7][4];
                            this.field10965[0][1] = 0;
                            this.field10965[0][3] = 4096;
                            this.field10965[0][0] = 0;
                            this.field10965[0][2] = 0;
                            this.field10965[1][1] = 0;
                            this.field10965[1][0] = 663;
                            this.field10965[1][3] = 4096;
                            this.field10965[1][2] = 4096;
                            this.field10965[2][3] = 0;
                            this.field10965[2][1] = 0;
                            this.field10965[2][2] = 4096;
                            this.field10965[2][0] = 1363;
                            this.field10965[3][0] = 2048;
                            this.field10965[3][2] = 4096;
                            this.field10965[3][3] = 0;
                            this.field10965[3][1] = 4096;
                            this.field10965[4][2] = 0;
                            this.field10965[4][0] = 2727;
                            this.field10965[4][1] = 4096;
                            this.field10965[4][3] = 0;
                            this.field10965[5][0] = 3411;
                            this.field10965[5][1] = 4096;
                            this.field10965[5][3] = 4096;
                            this.field10965[5][2] = 0;
                            this.field10965[6][2] = 0;
                            this.field10965[6][1] = 0;
                            this.field10965[6][3] = 4096;
                            this.field10965[6][0] = 4096;
                        }
                    } else {
                        this.field10965 = new int[8][4];
                        this.field10965[0][3] = 2361;
                        this.field10965[0][0] = 0;
                        this.field10965[0][1] = 2650;
                        this.field10965[0][2] = 2602;
                        this.field10965[1][2] = 1799;
                        this.field10965[1][0] = 2867;
                        this.field10965[1][3] = 1558;
                        this.field10965[1][1] = 2313;
                        this.field10965[2][1] = 2618;
                        this.field10965[2][2] = 1734;
                        this.field10965[2][0] = 3072;
                        this.field10965[2][3] = 1413;
                        this.field10965[3][2] = 1220;
                        this.field10965[3][0] = 3276;
                        this.field10965[3][3] = 947;
                        this.field10965[3][1] = 2296;
                        this.field10965[4][0] = 3481;
                        this.field10965[4][3] = 722;
                        this.field10965[4][2] = 963;
                        this.field10965[4][1] = 2072;
                        this.field10965[5][2] = 2152;
                        this.field10965[5][1] = 2730;
                        this.field10965[5][3] = 1766;
                        this.field10965[5][0] = 3686;
                        this.field10965[6][2] = 1060;
                        this.field10965[6][1] = 2232;
                        this.field10965[6][3] = 915;
                        this.field10965[6][0] = 3891;
                        this.field10965[7][0] = 4096;
                        this.field10965[7][3] = 1140;
                        this.field10965[7][2] = 1413;
                        this.field10965[7][1] = 1686;
                    }
                } else {
                    this.field10965 = new int[2][4];
                    this.field10965[0][1] = 0;
                    this.field10965[0][0] = 0;
                    this.field10965[0][2] = 0;
                    this.field10965[0][3] = 0;
                    this.field10965[1][3] = 4096;
                    this.field10965[1][2] = 4096;
                    this.field10965[1][0] = 4096;
                    this.field10965[1][1] = 4096;
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10976[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V", line = 624)
    private final void method5550(int arg0) {
        try {
            ++field10966;
            if (arg0 == 255) {
                int var2 = this.field10965.length;
                if (~var2 < -1) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = 0;
                        int var5 = var3 << 4;
                        for (int var6 = 0; var2 > var6 && ~this.field10965[var6][0] >= ~var5; ++var6) {
                            ++var4;
                        }
                        int var11;
                        int var12;
                        int var13;
                        if (var2 > var4) {
                            int[] var7 = this.field10965[var4];
                            if (~var4 < -1) {
                                int[] var8 = this.field10965[var4 + -1];
                                int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                                int var10 = -var9 + 4096;
                                var11 = var7[3] * var9 + var8[3] * var10 >> 12;
                                var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                                var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                            } else {
                                var13 = var7[2];
                                var12 = var7[1];
                                var11 = var7[3];
                            }
                        } else {
                            int[] var14 = this.field10965[var2 + -1];
                            var11 = var14[3];
                            var12 = var14[1];
                            var13 = var14[2];
                        }
                        int var15 = var11 >> 4;
                        int var16 = var12 >> 4;
                        int var17 = var13 >> 4;
                        if (~var17 <= -1) {
                            if (var17 > 255) {
                                var17 = 255;
                            }
                        } else {
                            var17 = 0;
                        }
                        if (~var16 > -1) {
                            var16 = 0;
                        } else if (~var16 < -256) {
                            var16 = 255;
                        }
                        if (~var15 <= -1) {
                            if (var15 > 255) {
                                var15 = 255;
                            }
                        } else {
                            var15 = 0;
                        }
                        this.field10969[var3] = class10.method71(class10.method71(var17 << 8, var16 << 16), var15);
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field10976[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjc;I)V", line = 728)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 != -3) {
                this.method349(-116, 113);
            }
            if (~arg0 == -1) {
                int var4 = arg1.method5128(0);
                if (var4 != 0) {
                    this.method5549(arg2 ^ 13943, var4);
                } else {
                    this.field10965 = new int[arg1.method5128(0)][4];
                    for (int var5 = 0; ~var5 > ~this.field10965.length; ++var5) {
                        this.field10965[var5][0] = arg1.method5116((byte) -106);
                        this.field10965[var5][1] = arg1.method5128(0) << 4;
                        this.field10965[var5][2] = arg1.method5128(0) << 4;
                        this.field10965[var5][3] = arg1.method5128(0) << 4;
                    }
                }
            }
            ++field10973;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10976[0] + arg0 + ',' + (arg1 != null ? field10976[1] : field10976[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)[[I", line = 766)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field10967;
            if (arg0 != 0) {
                this.method349(-107, -44);
            }
            int[][] var3 = super.field7575.method1955(arg1, arg0 ^ -2);
            if (super.field7575.field3416) {
                int[] var4 = this.method3944(arg1, 0, (byte) 73);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; var8 < class110.field1436; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field10969[var9];
                    var5[var8] = class434.method3377(var10 >> 12, 4080);
                    var6[var8] = class434.method3377(var10, 65280) >> 4;
                    var7[var8] = class434.method3377(255, var10) << 4;
                }
            }
            return var3;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field10976[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5551(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5552(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
