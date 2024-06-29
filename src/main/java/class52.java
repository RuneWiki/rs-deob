import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class52 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "F")
    public static float field706;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V", line = 6)
    public static final void method383(int arg0, int arg1) {
        field700++;
        class188 var2 = class147.method1111(-5, arg0, 3);
        var2.method1393((byte) -105);
        if (arg1 < 28) {
            method389(94, (byte[]) null, 75, -78, (class345[]) null, 69, true, 19);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V", line = 42)
    public static final void method384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class234.field3569 && arg2 <= class322.field4965) {
            int var5 = class335.method2343(arg3 - 2, class212.field3261, arg0, class182.field2888);
            int var6 = class335.method2343(-1, class212.field3261, arg1, class182.field2888);
            class97.method726(arg2, var6, arg4, true, var5);
        }
        field698++;
        if (arg3 != 1) {
            field706 = 0.31447667F;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V", line = 62)
    public static final void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field697++;
        int var6 = 0;
        if (arg3 != -22812) {
            return;
        }
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = var8 << 2;
        int var13 = arg2 << 1;
        int var14 = var9 - (var13 - 1) * var10;
        int var15 = (1 - var13) * var8 + var11;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = ((arg2 << 1) - 3) * var10;
        if (arg0 >= class212.field3261 && class182.field2888 >= arg0) {
            int var19 = class335.method2343(-1, class234.field3569, arg1 + arg4, class322.field4965);
            int var20 = class335.method2343(arg3 ^ 0x591B, class234.field3569, arg1 - arg4, class322.field4965);
            class7.method72(var19, -7, var20, class79.field1178[arg0], arg5);
        }
        int var21 = (arg2 - 1) * var12;
        int var22 = (var6 + 1) * var16;
        while (var7 > 0) {
            var7--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var6++;
                    var14 += var22;
                    var22 += var16;
                    var15 += var17;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var15 += var17;
                var14 += var22;
                var6++;
                var22 += var16;
                var17 += var16;
            }
            int var23 = arg0 + var7;
            var14 += -var18;
            int var24 = arg0 - var7;
            if (class212.field3261 <= var23 && class182.field2888 >= var24) {
                int var25 = class335.method2343(-1, class234.field3569, arg1 + var6, class322.field4965);
                int var26 = class335.method2343(-1, class234.field3569, arg1 - var6, class322.field4965);
                if (var24 >= class212.field3261) {
                    class7.method72(var25, -7, var26, class79.field1178[var24], arg5);
                }
                if (var23 <= class182.field2888) {
                    class7.method72(var25, arg3 + 22805, var26, class79.field1178[var23], arg5);
                }
            }
            var18 -= var12;
            var15 += -var21;
            var21 -= var12;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[B)Lg;", line = 171)
    public static final class68 method386(int arg0, byte[] arg1) {
        field695++;
        if (arg1 == null) {
            return null;
        } else {
            class68 var2 = new class68(arg1, class304.field4666, class27.field293, class133.field2028, class209.field3191, class220.field3362);
            class245.method1684(255);
            return arg0 == -22416 ? var2 : (class68) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lmg;Ljd;ZLjd;Ljd;)Z", line = 192)
    public static final boolean method387(class64 arg0, class95 arg1, boolean arg2, class95 arg3, class95 arg4) {
        class201.field3101 = arg4;
        if (!arg2) {
            return true;
        }
        class216.field3310 = arg0;
        class129.field1955 = arg1;
        class275.field4280 = arg3;
        field696++;
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILqh;IBII)Z", line = 211)
    public static final boolean method388(int arg0, int arg1, class32 arg2, int arg3, byte arg4, int arg5, int arg6) {
        field703++;
        class219 var7 = class283.method1960(arg2.field422, 34);
        if (var7.field3349 == -1) {
            return true;
        }
        int var8;
        if (arg2.field427) {
            int var9 = arg2.field470 + arg1;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        if (arg4 <= 98) {
            field706 = -1.2326666F;
        }
        class42 var10 = var7.method1558(arg2.field419, -16287, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg2.field416;
        int var12 = var10.field5052;
        int var13 = arg2.field413;
        if ((var8 & 0x1) == 1) {
            var13 = arg2.field416;
            var11 = arg2.field413;
        }
        int var14 = var10.field5051;
        if (var7.field3355) {
            var12 = var11 * 4;
            var14 = var13 * 4;
        }
        if (var7.field3354 == 0) {
            var10.method328(arg0 * 4 + 48, (-arg6 + 104 + -var13) * 4 + 48, var12, var14);
        } else {
            var10.method326(arg0 * 4 + 48, (-var13 + 104 + -arg6) * 4 + 48, var12, var14, var7.field3354);
        }
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[BII[Lf;IZI)[I", line = 280)
    public static final int[] method389(int arg0, byte[] arg1, int arg2, int arg3, class345[] arg4, int arg5, boolean arg6, int arg7) {
        field707++;
        if (!arg6) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg5 + var9) > 0 && arg5 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                            arg4[var8].field5357[arg5 + var9][arg3 + var10] = class149.method1117(arg4[var8].field5357[arg5 + var9][arg3 + var10], -2097153);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg6) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class254 var12 = new class254(arg1);
        int var13 = 10 % ((arg2 - 67) / 34);
        int var14 = arg0 + arg5;
        int var15 = arg3 + arg7;
        for (int var16 = 0; var16 < var11; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    class258.method1824(var17 + arg5, arg6, 0, 0, var12, false, (byte) -81, var16, var14 + var17, var18 - -arg3, 0, var15 + var18);
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        while (var12.field3866 < var12.field3840.length) {
            int var21 = var12.method1774((byte) -97);
            if (var21 == 128) {
                class142.field2185[0] = var12.method1755(false);
                var19 = true;
                class142.field2185[1] = var12.method1768(65536);
                class142.field2185[2] = var12.method1768(65536);
                class142.field2185[3] = var12.method1768(65536);
                class142.field2185[4] = var12.method1755(false);
            } else {
                if (var21 != 129) {
                    var12.field3866--;
                    break;
                }
                var20 = true;
                for (int var22 = 0; var22 < 4; var22++) {
                    byte var23 = var12.method1733(2023893896);
                    if (var23 == 0) {
                        int var33 = arg5 + 64;
                        int var34 = arg3;
                        int var35 = arg3 + 64;
                        int var36 = arg5;
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        if (arg3 < 0) {
                            var34 = 0;
                        } else if (arg3 >= 104) {
                            var34 = 104;
                        }
                        if (arg5 < 0) {
                            var36 = 0;
                        } else if (arg5 >= 104) {
                            var36 = 104;
                        }
                        while (var33 > var36) {
                            while (var35 > var34) {
                                class78.field1142[var22][var36][var34] = 0;
                                var34++;
                            }
                            var36++;
                        }
                    } else if (var23 == 1) {
                        for (int var28 = 0; var28 < 64; var28 += 4) {
                            for (int var29 = 0; var29 < 64; var29 += 4) {
                                byte var30 = var12.method1733(2023893896);
                                for (int var31 = arg5 + var28; var31 < (var28 + arg5 + 4); var31++) {
                                    for (int var32 = arg3 + var29; var32 < (arg3 + var29 + 4); var32++) {
                                        if (var31 >= 0 && var31 < 104 && var32 >= 0 && var32 < 104) {
                                            class78.field1142[var22][var31][var32] = var30;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var23 == 2 && var22 > 0) {
                        int var24 = arg5;
                        if (arg5 < 0) {
                            var24 = 0;
                        } else if (arg5 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg3;
                        if (arg3 < 0) {
                            var25 = 0;
                        } else if (arg3 >= 104) {
                            var25 = 104;
                        }
                        int var26 = arg5 + 64;
                        int var27 = arg3 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 >= 104) {
                            var27 = 104;
                        }
                        while (var26 > var24) {
                            while (var27 > var25) {
                                class78.field1142[var22][var24][var25] = class78.field1142[var22 - 1][var24][var25];
                                var25++;
                            }
                            var24++;
                        }
                    }
                }
            }
        }
        if (class73.field1058 && !arg6) {
            class61 var37 = null;
            label285: while (true) {
                while (true) {
                    while (var12.field3840.length > var12.field3866) {
                        int var38 = var12.method1774((byte) 99);
                        if (var38 == 0) {
                            var37 = new class61(var12);
                        } else if (var38 == 1) {
                            int var39 = var12.method1774((byte) 79);
                            if (var39 > 0) {
                                for (int var40 = 0; var40 < var39; var40++) {
                                    class255 var41 = new class255(var12);
                                    if (var41.field3881 == 31) {
                                        class206 var42 = class313.method2143((byte) -70, var12.method1755(false));
                                        var41.method1795(var42.field3166, var42.field3164, var42.field3155, (byte) 115, var42.field3154);
                                    }
                                    var41.field3902 += arg3 << 7;
                                    var41.field3882 += arg5 << 7;
                                    int var43 = var41.field3902 >> 7;
                                    int var44 = var41.field3882 >> 7;
                                    if (var44 >= 0 && var43 >= 0 && var44 < 104 && var43 < 104) {
                                        var41.field3893 = (class324.field5005[1][var44][var43] & 0x2) != 0;
                                        var41.field3895 = class203.field3111[var41.field3911][var44][var43] - var41.field3895;
                                        class315.method2157(var41);
                                    }
                                }
                            }
                        } else if (var38 == 2) {
                            if (var37 == null) {
                                var37 = new class61();
                            }
                            var37.method422((byte) 80, var12);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var37 == null) {
                        var37 = new class61();
                    }
                    for (int var45 = 0; var45 < 8; var45++) {
                        for (int var46 = 0; var46 < 8; var46++) {
                            int var47 = (arg5 >> 3) + var45;
                            int var48 = (arg3 >> 3) + var46;
                            if (var47 >= 0 && var47 < 13 && var48 >= 0 && var48 < 13) {
                                class258.field3966[var47][var48] = var37;
                            }
                        }
                    }
                    break label285;
                }
            }
        }
        if (!var20) {
            for (int var49 = 0; var49 < 4; var49++) {
                for (int var50 = 0; var50 < 16; var50++) {
                    for (int var51 = 0; var51 < 16; var51++) {
                        int var52 = (arg5 >> 2) + var50;
                        int var53 = (arg3 >> 2) + var51;
                        if (var52 >= 0 && var52 < 26 && var53 >= 0 && var53 < 26) {
                            class78.field1142[var49][var52][var53] = 0;
                        }
                    }
                }
            }
        }
        return var19 ? class142.field2185 : null;
    }
}
