import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class174 extends class35 {

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    private int field2576 = -1;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "Ljs;")
    private class216 field2565;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "[[I")
    public int[][] field2564;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "[[B")
    private byte[][] field2557;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "[[B")
    private byte[][] field2575;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    private int field2567;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    private int field2569;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    private int field2570;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    private int field2574;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "[[Ltb;")
    private class273[][] field2561;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "[[Lhj;")
    private class399[][] field2577;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "[[Lvm;")
    private class481[][] field2560;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "[[Lwn;")
    private class507[][] field2559;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III[[ZZ)V")
    public final void method207(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class510 var6 = this.field2565.field3133;
        this.field2576 = -1;
        this.field2571 = var6.field7446;
        this.field2566 = var6.field7440;
        this.field2574 = var6.field7448;
        this.field2569 = var6.field7442;
        this.field2558 = var6.field7447;
        this.field2573 = var6.field7445;
        this.field2567 = var6.field7437;
        this.field2578 = var6.field7438;
        this.field2568 = var6.field7439;
        this.field2563 = var6.field7444;
        this.field2570 = var6.field7441;
        this.field2562 = var6.field7443;
    }

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "(II)I")
    public final int method201(int arg0, int arg1) {
        return this.field2564[arg0][arg1];
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
    public final void method204(int arg0, int arg1) {
        class248 var3 = this.field2565.method1504(Thread.currentThread());
        var3.field3647.field1488 = 0;
        if (this.field2577 != null) {
            this.method1189(arg0, arg1, this.field2565.field3132, var3.field3647, var3.field3695, var3.field3670, var3.field3681);
        } else {
            if (this.field2559 != null) {
                this.method1193(arg0, arg1, var3.field3647, var3.field3695, var3.field3670, var3.field3681);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIZLvf;[I[I[I)V")
    private final void method1189(int arg0, int arg1, boolean arg2, class103 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class399 var8 = this.field2577[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5974 & 2) == 0) {
                int var9 = super.field365 * arg0;
                int var10 = super.field365 + var9;
                int var11 = super.field365 * arg1;
                int var12 = super.field365 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field5974 & 1) != 0 && !arg2) {
                    int var17 = this.field2564[arg0][arg1];
                    if (this.field2576 == -1) {
                        int var18 = this.field2563 * var17;
                        var19 = (this.field2570 * var11 + this.field2568 * var9 + var18 >> 15) + this.field2562;
                        if (var19 <= this.field2565.field3142) {
                            return;
                        }
                        var20 = (this.field2570 * var11 + this.field2568 * var10 + var18 >> 15) + this.field2562;
                        if (var20 <= this.field2565.field3142) {
                            return;
                        }
                        var21 = (this.field2570 * var12 + this.field2568 * var10 + var18 >> 15) + this.field2562;
                        if (var21 <= this.field2565.field3142) {
                            return;
                        }
                        var22 = (this.field2570 * var12 + this.field2568 * var9 + var18 >> 15) + this.field2562;
                        if (var22 <= this.field2565.field3142) {
                            return;
                        }
                    } else {
                        var22 = this.field2576;
                        var21 = this.field2576;
                        var20 = this.field2576;
                        var19 = this.field2576;
                    }
                    if (this.field2565.field3150) {
                        int var23 = var19 - this.field2565.field3136;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field2565.field3136;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field2565.field3136;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field2565.field3136;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field2566 * var17;
                    int var28 = this.field2573 * var17;
                    var29 = (this.field2574 * var11 + this.field2571 * var9 + var27 >> 15) + this.field2569;
                    var30 = this.field2565.field3149 * var29 / var19 + arg3.field1486;
                    var31 = (this.field2567 * var11 + this.field2558 * var9 + var28 >> 15) + this.field2578;
                    var32 = this.field2565.field3143 * var31 / var19 + arg3.field1487;
                    var33 = (this.field2574 * var11 + this.field2571 * var10 + var27 >> 15) + this.field2569;
                    var34 = this.field2565.field3149 * var33 / var20 + arg3.field1486;
                    var35 = (this.field2567 * var11 + this.field2558 * var10 + var28 >> 15) + this.field2578;
                    var36 = this.field2565.field3143 * var35 / var20 + arg3.field1487;
                    var37 = (this.field2574 * var12 + this.field2571 * var10 + var27 >> 15) + this.field2569;
                    var38 = this.field2565.field3149 * var37 / var21 + arg3.field1486;
                    var39 = (this.field2567 * var12 + this.field2558 * var10 + var28 >> 15) + this.field2578;
                    var40 = this.field2565.field3143 * var39 / var21 + arg3.field1487;
                    var41 = (this.field2574 * var12 + this.field2571 * var9 + var27 >> 15) + this.field2569;
                    var42 = this.field2565.field3149 * var41 / var22 + arg3.field1486;
                    var43 = (this.field2567 * var12 + this.field2558 * var9 + var28 >> 15) + this.field2578;
                    var44 = this.field2565.field3143 * var43 / var22 + arg3.field1487;
                } else {
                    int var45 = this.field2564[arg0][arg1];
                    int var46 = this.field2564[arg0 + 1][arg1];
                    int var47 = this.field2564[arg0 + 1][arg1 + 1];
                    int var48 = this.field2564[arg0][arg1 + 1];
                    if (this.field2576 == -1) {
                        var19 = (this.field2570 * var11 + this.field2568 * var9 + this.field2563 * var45 >> 15) + this.field2562;
                        if (var19 <= this.field2565.field3142) {
                            return;
                        }
                        var20 = (this.field2570 * var11 + this.field2568 * var10 + this.field2563 * var46 >> 15) + this.field2562;
                        if (var20 <= this.field2565.field3142) {
                            return;
                        }
                        var21 = (this.field2570 * var12 + this.field2568 * var10 + this.field2563 * var47 >> 15) + this.field2562;
                        if (var21 <= this.field2565.field3142) {
                            return;
                        }
                        var22 = (this.field2570 * var12 + this.field2568 * var9 + this.field2563 * var48 >> 15) + this.field2562;
                        if (var22 <= this.field2565.field3142) {
                            return;
                        }
                    } else {
                        var22 = this.field2576;
                        var21 = this.field2576;
                        var20 = this.field2576;
                        var19 = this.field2576;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field2565.field3136;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field5976 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field2565.field3136;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field5971 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field2565.field3136;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field5981 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field2565.field3136;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field5972 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field2565.field3150) {
                        int var57 = var19 - this.field2565.field3136;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field2565.field3136;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field2565.field3136;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field2565.field3136;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field2574 * var11 + this.field2571 * var9 + this.field2566 * var45 >> 15) + this.field2569;
                    var30 = this.field2565.field3149 * var29 / var19 + arg3.field1486;
                    var31 = (this.field2567 * var11 + this.field2573 * var45 + this.field2558 * var9 >> 15) + this.field2578;
                    var32 = this.field2565.field3143 * var31 / var19 + arg3.field1487;
                    var33 = (this.field2574 * var11 + this.field2571 * var10 + this.field2566 * var46 >> 15) + this.field2569;
                    var34 = this.field2565.field3149 * var33 / var20 + arg3.field1486;
                    var35 = (this.field2567 * var11 + this.field2573 * var46 + this.field2558 * var10 >> 15) + this.field2578;
                    var36 = this.field2565.field3143 * var35 / var20 + arg3.field1487;
                    var37 = (this.field2574 * var12 + this.field2571 * var10 + this.field2566 * var47 >> 15) + this.field2569;
                    var38 = this.field2565.field3149 * var37 / var21 + arg3.field1486;
                    var39 = (this.field2567 * var12 + this.field2573 * var47 + this.field2558 * var10 >> 15) + this.field2578;
                    var40 = this.field2565.field3143 * var39 / var21 + arg3.field1487;
                    var41 = (this.field2574 * var12 + this.field2571 * var9 + this.field2566 * var48 >> 15) + this.field2569;
                    var42 = this.field2565.field3149 * var41 / var22 + arg3.field1486;
                    var43 = (this.field2567 * var12 + this.field2573 * var48 + this.field2558 * var9 >> 15) + this.field2578;
                    var44 = this.field2565.field3143 * var43 / var22 + arg3.field1487;
                }
                boolean var61 = var8.field5980 != -1 && this.method1194(this.field2565.field2379.method838(true, var8.field5980).field4585);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field1481 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field1477 || var42 > arg3.field1477 || var34 > arg3.field1477;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field1488 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field5980 >= 0) {
                                arg3.method625(var40, var44, var36, var38, var42, var34, this.field2565.field3155, var15, var16, var14, var8.field5979, var8.field5977, var8.field5978, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5980);
                            } else {
                                arg3.method628(var40, var44, var36, var38, var42, var34, class498.method2986(var15 << 24 | this.field2565.field3155, var8.field5979, -16711936), class498.method2986(var16 << 24 | this.field2565.field3155, var8.field5977, -16711936), class498.method2986(var14 << 24 | this.field2565.field3155, var8.field5978, -16711936));
                            }
                        } else if (var8.field5980 >= 0) {
                            arg3.method638(var40, var44, var36, var38, var42, var34, var8.field5979, var8.field5977, var8.field5978, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5980);
                        } else {
                            arg3.method628(var40, var44, var36, var38, var42, var34, var8.field5979, var8.field5977, var8.field5978);
                        }
                        arg3.field1488 = 0;
                    } else {
                        arg3.method635(var40, var44, var36, var38, var42, var34, this.field2565.field3155);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field1481 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field1477 || var34 > arg3.field1477 || var42 > arg3.field1477;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field1488 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field5980 >= 0) {
                                arg3.method625(var32, var36, var44, var30, var34, var42, this.field2565.field3155, var13, var14, var16, var8.field5973, var8.field5978, var8.field5977, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5980);
                            } else {
                                arg3.method628(var32, var36, var44, var30, var34, var42, class498.method2986(var13 << 24 | this.field2565.field3155, var8.field5973, -16711936), class498.method2986(var14 << 24 | this.field2565.field3155, var8.field5978, -16711936), class498.method2986(var16 << 24 | this.field2565.field3155, var8.field5977, -16711936));
                            }
                        } else if (var8.field5980 >= 0) {
                            arg3.method638(var32, var36, var44, var30, var34, var42, var8.field5973, var8.field5978, var8.field5977, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5980);
                        } else {
                            arg3.method628(var32, var36, var44, var30, var34, var42, var8.field5973, var8.field5978, var8.field5977);
                        }
                        arg3.field1488 = 0;
                        return;
                    }
                    arg3.method635(var32, var36, var44, var30, var34, var42, this.field2565.field3155);
                }
            }
        } else {
            class481 var64 = this.field2560[arg0][arg1];
            if (var64 != null) {
                if (this.field2576 == -1) {
                    for (int var65 = 0; var65 < var64.field7052; ++var65) {
                        int var66 = (arg0 << super.field372) + var64.field7060[var65];
                        int var67 = var64.field7056[var65];
                        int var68 = (arg1 << super.field372) + var64.field7051[var65];
                        int var69 = (this.field2570 * var68 + this.field2568 * var66 + this.field2563 * var67 >> 15) + this.field2562;
                        if (var69 <= this.field2565.field3142) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field2565.field3136;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field7053[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field2565.field3150) {
                            int var72 = var69 - this.field2565.field3136;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field2574 * var68 + this.field2571 * var66 + this.field2566 * var67 >> 15) + this.field2569;
                        int var74 = (this.field2567 * var68 + this.field2573 * var67 + this.field2558 * var66 >> 15) + this.field2578;
                        arg4[var65] = this.field2565.field3149 * var73 / var69 + arg3.field1486;
                        arg5[var65] = this.field2565.field3143 * var74 / var69 + arg3.field1487;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field7052; ++var75) {
                        int var115 = (arg0 << super.field372) + var64.field7060[var75];
                        int var116 = var64.field7056[var75];
                        int var117 = (arg1 << super.field372) + var64.field7051[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field2576 - this.field2565.field3136;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field7053[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field2565.field3150) {
                            int var120 = this.field2576 - this.field2565.field3136;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field2574 * var117 + this.field2571 * var115 + this.field2566 * var116 >> 15) + this.field2569;
                        int var122 = (this.field2567 * var117 + this.field2573 * var116 + this.field2558 * var115 >> 15) + this.field2578;
                        arg4[var75] = this.field2565.field3149 * var121 / this.field2576 + arg3.field1486;
                        arg5[var75] = this.field2565.field3143 * var122 / this.field2576 + arg3.field1487;
                    }
                }
                if (var64.field7058 != null) {
                    int var76 = this.field2564[arg0][arg1];
                    int var77 = this.field2564[arg0 + 1][arg1];
                    int var78 = this.field2564[arg0][arg1 + 1];
                    int var79 = super.field365 * arg0;
                    int var80 = super.field365 + var79;
                    int var81 = super.field365 * arg1;
                    int var82 = super.field365 + var81;
                    int var83 = (this.field2574 * var81 + this.field2571 * var79 + this.field2566 * var76 >> 15) + this.field2569;
                    int var84 = (this.field2567 * var81 + this.field2573 * var76 + this.field2558 * var79 >> 15) + this.field2578;
                    int var85 = (this.field2570 * var81 + this.field2568 * var79 + this.field2563 * var76 >> 15) + this.field2562;
                    int var86 = (this.field2574 * var81 + this.field2571 * var80 + this.field2566 * var77 >> 15) + this.field2569;
                    int var87 = (this.field2567 * var81 + this.field2573 * var77 + this.field2558 * var80 >> 15) + this.field2578;
                    int var88 = (this.field2570 * var81 + this.field2568 * var80 + this.field2563 * var77 >> 15) + this.field2562;
                    int var89 = (this.field2574 * var82 + this.field2571 * var79 + this.field2566 * var78 >> 15) + this.field2569;
                    int var90 = (this.field2567 * var82 + this.field2573 * var78 + this.field2558 * var79 >> 15) + this.field2578;
                    int var91 = (this.field2570 * var82 + this.field2568 * var79 + this.field2563 * var78 >> 15) + this.field2562;
                    for (int var92 = 0; var92 < var64.field7054; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field1481 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field1477 || var97 > arg3.field1477 || var98 > arg3.field1477;
                            short var103 = var64.field7058[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method1194(this.field2565.field2379.method838(true, var103).field4585)) {
                                    arg3.field1488 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method625(var99, var100, var101, var96, var97, var98, this.field2565.field3155, arg6[var93], arg6[var94], arg6[var95], var64.field7057[var93], var64.field7057[var94], var64.field7057[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field7057[var93] & 16777215) != 0) {
                                        arg3.method628(var99, var100, var101, var96, var97, var98, class498.method2986(arg6[var93] << 24 | this.field2565.field3155, var64.field7057[var93], -16711936), class498.method2986(arg6[var94] << 24 | this.field2565.field3155, var64.field7057[var94], -16711936), class498.method2986(arg6[var95] << 24 | this.field2565.field3155, var64.field7057[var95], -16711936));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method638(var99, var100, var101, var96, var97, var98, var64.field7057[var93], var64.field7057[var94], var64.field7057[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field7057[var93] & 16777215) != 0) {
                                    arg3.method628(var99, var100, var101, var96, var97, var98, var64.field7057[var93], var64.field7057[var94], var64.field7057[var95]);
                                }
                                arg3.field1488 = 0;
                            } else {
                                arg3.method635(var99, var100, var101, var96, var97, var98, this.field2565.field3155);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field7054; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field1481 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field1477 || var109 > arg3.field1477 || var110 > arg3.field1477;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field7057[var105] & 16777215) != 0) {
                                    arg3.method628(var111, var112, var113, var108, var109, var110, class246.method1652(arg6[var105], -14942, var64.field7057[var105], this.field2565.field3155), class246.method1652(arg6[var106], -14942, var64.field7057[var106], this.field2565.field3155), class246.method1652(arg6[var107], -14942, var64.field7057[var107], this.field2565.field3155));
                                }
                            } else if ((var64.field7057[var105] & 16777215) != 0) {
                                arg3.method628(var111, var112, var113, var108, var109, var110, var64.field7057[var105], var64.field7057[var106], var64.field7057[var107]);
                            }
                        } else {
                            arg3.method635(var111, var112, var113, var108, var109, var110, this.field2565.field3155);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public final void method208(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIII[[ZLvf;[I[I)V")
    private final void method1190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class103 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1483 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field2559[var16][var17] != null) {
                        class507 var18 = this.field2559[var16][var17];
                        if (var18.field7404 != -1 && (var18.field7406 & 2) == 0 && var18.field7405 == -1) {
                            int var19 = this.field2565.method1505(var18.field7404);
                            arg8.method632(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class283.method1830(var19, (byte) -11, var18.field7407 & 65535), class283.method1830(var19, (byte) 122, var18.field7403 & 65535), class283.method1830(var19, (byte) 76, var18.field7402 & 65535));
                            arg8.method632(var15, var15, var15 - var13, var14, var13 + var14, var14, class283.method1830(var19, (byte) 40, var18.field7401 & 65535), class283.method1830(var19, (byte) -113, var18.field7402 & 65535), class283.method1830(var19, (byte) 111, var18.field7403 & 65535));
                        } else if (var18.field7405 == -1) {
                            arg8.method632(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field7407 & 65535, var18.field7403 & 65535, var18.field7402 & 65535);
                            arg8.method632(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field7401 & 65535, var18.field7402 & 65535, var18.field7403 & 65535);
                        } else {
                            int var20 = var18.field7405;
                            arg8.method632(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method632(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field2561[var16][var17] != null) {
                        class273 var21 = this.field2561[var16][var17];
                        for (int var22 = 0; var22 < var21.field3964; ++var22) {
                            arg9[var22] = var21.field3969[var22] * var13 / super.field365 + var14;
                            arg10[var22] = var15 - var21.field3966[var22] * var13 / super.field365;
                        }
                        for (int var23 = 0; var23 < var21.field3959; ++var23) {
                            short var24 = var21.field3963[var23];
                            short var25 = var21.field3968[var23];
                            short var26 = var21.field3965[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3960 != null && var21.field3960[var23] != -1) {
                                int var33 = var21.field3960[var23];
                                arg8.method632(var30, var31, var32, var27, var28, var29, class283.method1830(var33, (byte) -114, var21.field3961[var24]), class283.method1830(var33, (byte) -127, var21.field3961[var25]), class283.method1830(var33, (byte) -107, var21.field3961[var26]));
                            } else if (var21.field3962 != null && var21.field3962[var23] != -1) {
                                int var34 = this.field2565.method1505(var21.field3962[var23]);
                                arg8.method632(var30, var31, var32, var27, var28, var29, class283.method1830(var34, (byte) -115, var21.field3961[var24]), class283.method1830(var34, (byte) -114, var21.field3961[var25]), class283.method1830(var34, (byte) 83, var21.field3961[var26]));
                            } else {
                                int var35 = var21.field3958[var23];
                                arg8.method632(var30, var31, var32, var27, var28, var29, class283.method1830(var35, (byte) 92, var21.field3961[var24]), class283.method1830(var35, (byte) -104, var21.field3961[var25]), class283.method1830(var35, (byte) -19, var21.field3961[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1483 = true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public final boolean method196(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!rn", name = "QA", descriptor = "(III)V")
    public final void method198(int arg0, int arg1, int arg2) {
        if (this.field2575[arg0][arg1] < arg2) {
            this.field2575[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljs;IIII[[I[[II)V")
    public class174(class216 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field2565 = arg0;
        this.field2572 = arg2;
        this.field2564 = arg5;
        this.field2557 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field2565.field3146 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field2565.field3158 * var18 + this.field2565.field3167 * var17 + this.field2565.field3147 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field2557[var11][var10] = (byte) var20;
            }
        }
        this.field2575 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class248 var9 = this.field2565.method1504(Thread.currentThread());
        class103 var10 = var9.field3647;
        var10.field1488 = 0;
        var10.field1481 = false;
        if (this.field2577 != null) {
            this.method1191(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field3695, var9.field3670);
        } else {
            if (this.field2559 != null) {
                this.method1190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field3695, var9.field3670);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIIIIII[[ZLvf;[I[I)V")
    private final void method1191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class103 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1483 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field2577[var16][var17] != null) {
                        class399 var18 = this.field2577[var16][var17];
                        if (var18.field5980 != -1 && (var18.field5974 & 2) == 0 && var18.field5975 == 0) {
                            int var19 = this.field2565.method1505(var18.field5980);
                            arg8.method632(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class283.method1830(var19, (byte) -13, var18.field5979), class283.method1830(var19, (byte) 108, var18.field5977), class283.method1830(var19, (byte) 33, var18.field5978));
                            arg8.method632(var15, var15, var15 - var13, var14, var13 + var14, var14, class283.method1830(var19, (byte) 60, var18.field5973), class283.method1830(var19, (byte) -126, var18.field5978), class283.method1830(var19, (byte) -115, var18.field5977));
                        } else if (var18.field5975 == 0) {
                            arg8.method628(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5979, var18.field5977, var18.field5978);
                            arg8.method628(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5973, var18.field5978, var18.field5977);
                        } else {
                            int var20 = var18.field5975;
                            arg8.method628(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class498.method2986(var18.field5979 & -16777216, var20, -16711936), class498.method2986(var18.field5977 & -16777216, var20, -16711936), class498.method2986(var18.field5978 & -16777216, var20, -16711936));
                            arg8.method628(var15, var15, var15 - var13, var14, var13 + var14, var14, class498.method2986(var18.field5973 & -16777216, var20, -16711936), class498.method2986(var18.field5978 & -16777216, var20, -16711936), class498.method2986(var18.field5977 & -16777216, var20, -16711936));
                        }
                    } else if (this.field2560[var16][var17] != null) {
                        class481 var21 = this.field2560[var16][var17];
                        for (int var22 = 0; var22 < var21.field7052; ++var22) {
                            arg9[var22] = var21.field7060[var22] * var13 / super.field365 + var14;
                            arg10[var22] = var15 - var21.field7051[var22] * var13 / super.field365;
                        }
                        for (int var23 = 0; var23 < var21.field7054; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field7055 == null || var21.field7055[var23] == 0 || var21.field7058 != null && (var21.field7058 == null || var21.field7058[var23] != -1)) {
                                if (var21.field7058 != null && var21.field7058[var23] != -1) {
                                    int var34 = this.field2565.method1505(var21.field7058[var23]);
                                    arg8.method632(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method628(var30, var31, var32, var27, var28, var29, var21.field7057[var24], var21.field7057[var25], var21.field7057[var26]);
                                }
                            } else {
                                int var33 = var21.field7055[var23];
                                arg8.method628(var30, var31, var32, var27, var28, var29, class498.method2986(-16777216 - (var21.field7057[var24] & -16777216), var33, -16711936), class498.method2986(-16777216 - (var21.field7057[var25] & -16777216), var33, -16711936), class498.method2986(-16777216 - (var21.field7057[var26] & -16777216), var33, -16711936));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1483 = true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method195(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field2559 == null) {
            this.field2559 = new class507[super.field370][super.field369];
            this.field2561 = new class273[super.field370][super.field369];
        } else if (this.field2577 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field365 != var20 || var21 != 0 && super.field365 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class273 var22 = new class273();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3964 = var23;
            var22.field3961 = new short[var23];
            var22.field3969 = new short[var23];
            var22.field3970 = new short[var23];
            var22.field3966 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field3961[var25] = (short) (this.field2557[arg0][arg1] - this.field2575[arg0][arg1]);
                } else if (var30 == 0 && super.field365 == var31) {
                    var22.field3961[var25] = (short) (this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1]);
                } else if (super.field365 == var30 && super.field365 == var31) {
                    var22.field3961[var25] = (short) (this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1]);
                } else if (super.field365 == var30 && var31 == 0) {
                    var22.field3961[var25] = (short) (this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1]) * var30 + (this.field2557[arg0][arg1] - this.field2575[arg0][arg1]) * (super.field365 - var30);
                    int var33 = (this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1]) * var30 + (this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1]) * (super.field365 - var30);
                    var22.field3961[var25] = (short) ((super.field365 - var31) * var32 + var31 * var33 >> super.field372 * 2);
                }
                int var34 = (arg0 << super.field372) + var30;
                int var35 = (arg1 << super.field372) + var31;
                var22.field3969[var25] = (short) var30;
                var22.field3966[var25] = (short) var31;
                var22.field3970[var25] = (short) (this.method202(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field3961[var25] < 2) {
                    var22.field3961[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field2565.field2379.method838(true, arg11[var28]).field4593) {
                    var26 = true;
                }
            }
            var22.field3958 = new int[var27];
            if (arg10 != null) {
                var22.field3960 = new int[var27];
            }
            var22.field3963 = new short[var27];
            var22.field3968 = new short[var27];
            var22.field3965 = new short[var27];
            if (var26) {
                var22.field3962 = new short[var27];
                var22.field3967 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3958[var22.field3959] = class491.method2935(arg9[var29], 0);
                    } else {
                        var22.field3958[var22.field3959] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3960[var22.field3959] = class491.method2935(arg10[var29], 0);
                        } else {
                            var22.field3960[var22.field3959] = -1;
                        }
                    }
                    var22.field3963[var22.field3959] = (short) arg6[var29];
                    var22.field3968[var22.field3959] = (short) arg7[var29];
                    var22.field3965[var22.field3959] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field2565.field2379.method838(true, arg11[var29]).field4593) {
                            var22.field3962[var22.field3959] = (short) arg11[var29];
                            var22.field3967[var22.field3959] = (short) arg12[var29];
                        } else {
                            var22.field3962[var22.field3959] = -1;
                        }
                    }
                    ++var22.field3959;
                }
            }
            this.field2561[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class507 var36 = new class507();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field7405 = class283.method1830(class491.method2935(arg10[0], 0), (byte) -113, this.field2557[arg0][arg1] - this.field2575[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field7406 = (byte) (var36.field7406 | 2);
                    }
                }
                if (this.field2564[arg0 + 1][arg1] == this.field2564[arg0][arg1] && this.field2564[arg0 + 1][arg1 + 1] == this.field2564[arg0][arg1] && this.field2564[arg0][arg1 + 1] == this.field2564[arg0][arg1]) {
                    var36.field7406 = (byte) (var36.field7406 | 1);
                }
                if (var38 != -1 && (var36.field7406 & 2) == 0 && !this.field2565.field2379.method838(true, var38).field4593) {
                    var36.field7401 = (short) (this.field2557[arg0][arg1] - this.field2575[arg0][arg1]);
                    var36.field7402 = (short) (this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1]);
                    var36.field7407 = (short) (this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1]);
                    var36.field7403 = (short) (this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1]);
                    var36.field7404 = (short) var38;
                } else {
                    short var39 = class491.method2935(var37, 0);
                    var36.field7401 = (short) class283.method1830(var39, (byte) 70, this.field2557[arg0][arg1] - this.field2575[arg0][arg1]);
                    var36.field7402 = (short) class283.method1830(var39, (byte) 41, this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1]);
                    var36.field7407 = (short) class283.method1830(var39, (byte) 105, this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1]);
                    var36.field7403 = (short) class283.method1830(var39, (byte) 45, this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1]);
                    var36.field7404 = -1;
                }
                this.field2559[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "va", descriptor = "(II)I")
    public final int method202(int arg0, int arg1) {
        int var3 = arg0 >> super.field372;
        int var4 = arg1 >> super.field372;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field370 - 1 && var4 <= super.field369 - 1) {
            int var5 = arg0 & super.field365 - 1;
            int var6 = arg1 & super.field365 - 1;
            int var7 = (super.field365 - var5) * this.field2564[var3][var4] + this.field2564[var3 + 1][var4] * var5 >> super.field372;
            int var8 = (super.field365 - var5) * this.field2564[var3][var4 + 1] + this.field2564[var3 + 1][var4 + 1] * var5 >> super.field372;
            return (super.field365 - var6) * var7 + var6 * var8 >> super.field372;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method206(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field2577 == null) {
            this.field2577 = new class399[super.field370][super.field369];
            this.field2560 = new class481[super.field370][super.field369];
        } else if (this.field2559 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class263.field3858[class491.method2935(arg6[var15], 0) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class263.field3858[class491.method2935(arg7[var16], 0) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field365 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field365 && arg4[var22] == super.field365) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field365) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field365 != arg2[var24] && arg2[0] - super.field365 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field365 != arg4[var24] && arg4[0] - super.field365 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class399 var25 = new class399();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field5975 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field5974 = (byte) (var25.field5974 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field2564[arg0 + 1][arg1] == this.field2564[arg0][arg1] && this.field2564[arg0 + 1][arg1 + 1] == this.field2564[arg0][arg1] && this.field2564[arg0][arg1 + 1] == this.field2564[arg0][arg1]) {
                    var25.field5974 = (byte) (var25.field5974 | 1);
                }
                if (var27 != -1 && (var25.field5974 & 2) == 0 && !this.field2565.field2379.method838(true, var27).field4593) {
                    var25.field5973 = this.field2557[arg0][arg1] - this.field2575[arg0][arg1];
                    var25.field5978 = this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1];
                    var25.field5979 = this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1];
                    var25.field5977 = this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1];
                    var25.field5980 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field5973 = class246.method1652(var28, -14942, method1192(arg6[var18] >> 8, this.field2557[arg0][arg1] - this.field2575[arg0][arg1]), arg10);
                    if (var25.field5975 != 0) {
                        var25.field5973 |= 255 - (this.field2557[arg0][arg1] - this.field2575[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field5978 = class246.method1652(var29, -14942, method1192(arg6[var19] >> 8, this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1]), arg10);
                    if (var25.field5975 != 0) {
                        var25.field5978 |= 255 - (this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field5979 = class246.method1652(var30, -14942, method1192(arg6[var20] >> 8, this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1]), arg10);
                    if (var25.field5975 != 0) {
                        var25.field5979 |= 255 - (this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field5977 = class246.method1652(var31, -14942, method1192(arg6[var21] >> 8, this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1]), arg10);
                    if (var25.field5975 != 0) {
                        var25.field5977 |= 255 - (this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1]) << 25;
                    }
                    var25.field5980 = -1;
                }
                if (arg5 != null) {
                    var25.field5981 = (short) arg5[var20];
                    var25.field5972 = (short) arg5[var21];
                    var25.field5971 = (short) arg5[var19];
                    var25.field5976 = (short) arg5[var18];
                }
                this.field2577[arg0][arg1] = var25;
            } else {
                class481 var32 = new class481();
                var32.field7052 = (short) arg2.length;
                var32.field7054 = (short) (arg2.length / 3);
                var32.field7060 = new short[var32.field7052];
                var32.field7056 = new short[var32.field7052];
                var32.field7051 = new short[var32.field7052];
                var32.field7057 = new int[var32.field7052];
                if (arg5 != null) {
                    var32.field7053 = new short[var32.field7052];
                }
                for (int var33 = 0; var33 < var32.field7052; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field2557[arg0][arg1] - this.field2575[arg0][arg1];
                    } else if (var48 == 0 && super.field365 == var49) {
                        var51 = this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1];
                    } else if (super.field365 == var48 && super.field365 == var49) {
                        var51 = this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1];
                    } else if (super.field365 == var48 && var49 == 0) {
                        var51 = this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field2557[arg0 + 1][arg1] - this.field2575[arg0 + 1][arg1]) * var48 + (this.field2557[arg0][arg1] - this.field2575[arg0][arg1]) * (super.field365 - var48);
                        int var53 = (this.field2557[arg0 + 1][arg1 + 1] - this.field2575[arg0 + 1][arg1 + 1]) * var48 + (this.field2557[arg0][arg1 + 1] - this.field2575[arg0][arg1 + 1]) * (super.field365 - var48);
                        var51 = (super.field365 - var49) * var52 + var49 * var53 >> super.field372 * 2;
                    }
                    int var54 = (arg0 << super.field372) + var48;
                    int var55 = (arg1 << super.field372) + var49;
                    var32.field7060[var33] = (short) var48;
                    var32.field7051[var33] = (short) var49;
                    var32.field7056[var33] = (short) (this.method202(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field2565.field2379.method838(true, arg8[var33]).field4593) {
                        var32.field7057[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field7057[var33] = var51 << 25;
                        } else {
                            var32.field7057[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field7053[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field7057[var33] = class246.method1652(var56, -14942, method1192(arg6[var33] >> 8, var51), arg10);
                        if (arg7 != null) {
                            var32.field7057[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field7054; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field2565.field2379.method838(true, arg8[var35 * 3]).field4593) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field7055 = new int[var32.field7054];
                }
                if (var34) {
                    var32.field7058 = new short[var32.field7054];
                    var32.field7059 = new short[var32.field7054];
                }
                for (int var36 = 0; var36 < var32.field7054; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field7055[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field2565.field2379.method838(true, var42).field4593) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field2565.field2379.method838(true, var43).field4593) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field2565.field2379.method838(true, var44).field4593) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field7058[var36] = (short) var44;
                            var32.field7059[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field2565.field2379.method838(true, var45).field4593) {
                                    var32.field7057[var37] = class263.field3858[class491.method2935(this.field2565.field2379.method838(true, var45).field4602 & 65535, 0) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field2565.field2379.method838(true, var46).field4593) {
                                    var32.field7057[var38] = class263.field3858[class491.method2935(this.field2565.field2379.method838(true, var46).field4602 & 65535, 0) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field2565.field2379.method838(true, var47).field4593) {
                                    var32.field7057[var39] = class263.field3858[class491.method2935(this.field2565.field2379.method838(true, var47).field4602 & 65535, 0) & 65535];
                                }
                            }
                            var32.field7058[var36] = -1;
                        }
                    }
                }
                this.field2560[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "()V")
    public final void method199() {
        this.field2557 = null;
        this.field2575 = null;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)I")
    private static final int method1192(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILvf;[I[I[I)V")
    private final void method1193(int arg0, int arg1, class103 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class507 var7 = this.field2559[arg0][arg1];
        if (var7 != null) {
            if ((var7.field7406 & 2) == 0) {
                int var8 = super.field365 * arg0;
                int var9 = super.field365 + var8;
                int var10 = super.field365 * arg1;
                int var11 = super.field365 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field7406 & 1) != 0) {
                    int var12 = this.field2564[arg0][arg1];
                    int var16;
                    if (this.field2576 == -1) {
                        int var13 = this.field2563 * var12;
                        var14 = (this.field2570 * var10 + this.field2568 * var8 + var13 >> 15) + this.field2562;
                        if (var14 <= this.field2565.field3142) {
                            return;
                        }
                        var15 = (this.field2570 * var10 + this.field2568 * var9 + var13 >> 15) + this.field2562;
                        if (var15 <= this.field2565.field3142) {
                            return;
                        }
                        var16 = (this.field2570 * var11 + this.field2568 * var9 + var13 >> 15) + this.field2562;
                        if (var16 <= this.field2565.field3142) {
                            return;
                        }
                        var17 = (this.field2570 * var11 + this.field2568 * var8 + var13 >> 15) + this.field2562;
                        if (var17 <= this.field2565.field3142) {
                            return;
                        }
                    } else {
                        var17 = this.field2576;
                        var16 = this.field2576;
                        var15 = this.field2576;
                        var14 = this.field2576;
                    }
                    int var18 = this.field2566 * var12;
                    int var19 = this.field2573 * var12;
                    var20 = (this.field2574 * var10 + this.field2571 * var8 + var18 >> 15) + this.field2569;
                    var21 = this.field2565.field3149 * var20 / var14 + arg2.field1486;
                    var22 = (this.field2567 * var10 + this.field2558 * var8 + var19 >> 15) + this.field2578;
                    var23 = this.field2565.field3143 * var22 / var14 + arg2.field1487;
                    var24 = (this.field2574 * var10 + this.field2571 * var9 + var18 >> 15) + this.field2569;
                    var25 = this.field2565.field3149 * var24 / var15 + arg2.field1486;
                    var26 = (this.field2567 * var10 + this.field2558 * var9 + var19 >> 15) + this.field2578;
                    var27 = this.field2565.field3143 * var26 / var15 + arg2.field1487;
                    int var28 = (this.field2574 * var11 + this.field2571 * var9 + var18 >> 15) + this.field2569;
                    var29 = this.field2565.field3149 * var28 / var16 + arg2.field1486;
                    int var30 = (this.field2567 * var11 + this.field2558 * var9 + var19 >> 15) + this.field2578;
                    var31 = this.field2565.field3143 * var30 / var16 + arg2.field1487;
                    var32 = (this.field2574 * var11 + this.field2571 * var8 + var18 >> 15) + this.field2569;
                    var33 = this.field2565.field3149 * var32 / var17 + arg2.field1486;
                    var34 = (this.field2567 * var11 + this.field2558 * var8 + var19 >> 15) + this.field2578;
                    var35 = this.field2565.field3143 * var34 / var17 + arg2.field1487;
                } else {
                    int var36 = this.field2564[arg0][arg1];
                    int var37 = this.field2564[arg0 + 1][arg1];
                    int var38 = this.field2564[arg0 + 1][arg1 + 1];
                    int var39 = this.field2564[arg0][arg1 + 1];
                    int var40;
                    if (this.field2576 == -1) {
                        var14 = (this.field2570 * var10 + this.field2568 * var8 + this.field2563 * var36 >> 15) + this.field2562;
                        if (var14 <= this.field2565.field3142) {
                            return;
                        }
                        var15 = (this.field2570 * var10 + this.field2568 * var9 + this.field2563 * var37 >> 15) + this.field2562;
                        if (var15 <= this.field2565.field3142) {
                            return;
                        }
                        var40 = (this.field2570 * var11 + this.field2568 * var9 + this.field2563 * var38 >> 15) + this.field2562;
                        if (var40 <= this.field2565.field3142) {
                            return;
                        }
                        var17 = (this.field2570 * var11 + this.field2568 * var8 + this.field2563 * var39 >> 15) + this.field2562;
                        if (var17 <= this.field2565.field3142) {
                            return;
                        }
                    } else {
                        var17 = this.field2576;
                        var40 = this.field2576;
                        var15 = this.field2576;
                        var14 = this.field2576;
                    }
                    var20 = (this.field2574 * var10 + this.field2571 * var8 + this.field2566 * var36 >> 15) + this.field2569;
                    var21 = this.field2565.field3149 * var20 / var14 + arg2.field1486;
                    var22 = (this.field2567 * var10 + this.field2573 * var36 + this.field2558 * var8 >> 15) + this.field2578;
                    var23 = this.field2565.field3143 * var22 / var14 + arg2.field1487;
                    var24 = (this.field2574 * var10 + this.field2571 * var9 + this.field2566 * var37 >> 15) + this.field2569;
                    var25 = this.field2565.field3149 * var24 / var15 + arg2.field1486;
                    var26 = (this.field2567 * var10 + this.field2573 * var37 + this.field2558 * var9 >> 15) + this.field2578;
                    var27 = this.field2565.field3143 * var26 / var15 + arg2.field1487;
                    int var41 = (this.field2574 * var11 + this.field2571 * var9 + this.field2566 * var38 >> 15) + this.field2569;
                    var29 = this.field2565.field3149 * var41 / var40 + arg2.field1486;
                    int var42 = (this.field2567 * var11 + this.field2573 * var38 + this.field2558 * var9 >> 15) + this.field2578;
                    var31 = this.field2565.field3143 * var42 / var40 + arg2.field1487;
                    var32 = (this.field2574 * var11 + this.field2571 * var8 + this.field2566 * var39 >> 15) + this.field2569;
                    var33 = this.field2565.field3149 * var32 / var17 + arg2.field1486;
                    var34 = (this.field2567 * var11 + this.field2573 * var39 + this.field2558 * var8 >> 15) + this.field2578;
                    var35 = this.field2565.field3143 * var34 / var17 + arg2.field1487;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field1481 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field1477 || var33 > arg2.field1477 || var25 > arg2.field1477;
                    if (var7.field7404 >= 0) {
                        if (this.method1194(this.field2565.field2379.method838(true, var7.field7404).field4585)) {
                            arg2.field1488 = 100;
                        }
                        arg2.method638(var31, var35, var27, var29, var33, var25, var7.field7407 & 65535, var7.field7403 & 65535, var7.field7402 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field7404);
                        arg2.field1488 = 0;
                    } else {
                        arg2.method632(var31, var35, var27, var29, var33, var25, var7.field7407 & 65535, var7.field7403 & 65535, var7.field7402 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field1481 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field1477 || var25 > arg2.field1477 || var33 > arg2.field1477;
                    if (var7.field7404 >= 0) {
                        if (this.method1194(this.field2565.field2379.method838(true, var7.field7404).field4585)) {
                            arg2.field1488 = 100;
                        }
                        arg2.method638(var23, var27, var35, var21, var25, var33, var7.field7401 & 65535, var7.field7402 & 65535, var7.field7403 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field7404);
                        arg2.field1488 = 0;
                        return;
                    }
                    arg2.method632(var23, var27, var35, var21, var25, var33, var7.field7401 & 65535, var7.field7402 & 65535, var7.field7403 & 65535);
                }
            }
        } else {
            class273 var43 = this.field2561[arg0][arg1];
            if (var43 != null) {
                if (this.field2576 == -1) {
                    for (int var44 = 0; var44 < var43.field3964; ++var44) {
                        int var45 = (arg0 << super.field372) + var43.field3969[var44];
                        short var46 = var43.field3970[var44];
                        int var47 = (arg1 << super.field372) + var43.field3966[var44];
                        int var48 = (this.field2570 * var47 + this.field2568 * var45 + this.field2563 * var46 >> 15) + this.field2562;
                        if (var48 <= this.field2565.field3142) {
                            return;
                        }
                        int var49 = (this.field2574 * var47 + this.field2571 * var45 + this.field2566 * var46 >> 15) + this.field2569;
                        int var50 = (this.field2567 * var47 + this.field2573 * var46 + this.field2558 * var45 >> 15) + this.field2578;
                        arg3[var44] = this.field2565.field3149 * var49 / var48 + arg2.field1486;
                        arg4[var44] = this.field2565.field3143 * var50 / var48 + arg2.field1487;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field3964; ++var51) {
                        int var91 = (arg0 << super.field372) + var43.field3969[var51];
                        short var92 = var43.field3970[var51];
                        int var93 = (arg1 << super.field372) + var43.field3966[var51];
                        int var94 = (this.field2574 * var93 + this.field2571 * var91 + this.field2566 * var92 >> 15) + this.field2569;
                        int var95 = (this.field2567 * var93 + this.field2573 * var92 + this.field2558 * var91 >> 15) + this.field2578;
                        arg3[var51] = this.field2565.field3149 * var94 / this.field2576 + arg2.field1486;
                        arg4[var51] = this.field2565.field3143 * var95 / this.field2576 + arg2.field1487;
                    }
                }
                if (var43.field3962 != null) {
                    int var52 = this.field2564[arg0][arg1];
                    int var53 = this.field2564[arg0 + 1][arg1];
                    int var54 = this.field2564[arg0][arg1 + 1];
                    int var55 = super.field365 * arg0;
                    int var56 = super.field365 + var55;
                    int var57 = super.field365 * arg1;
                    int var58 = super.field365 + var57;
                    int var59 = (this.field2574 * var57 + this.field2571 * var55 + this.field2566 * var52 >> 15) + this.field2569;
                    int var60 = (this.field2567 * var57 + this.field2573 * var52 + this.field2558 * var55 >> 15) + this.field2578;
                    int var61 = (this.field2570 * var57 + this.field2568 * var55 + this.field2563 * var52 >> 15) + this.field2562;
                    int var62 = (this.field2574 * var57 + this.field2571 * var56 + this.field2566 * var53 >> 15) + this.field2569;
                    int var63 = (this.field2567 * var57 + this.field2573 * var53 + this.field2558 * var56 >> 15) + this.field2578;
                    int var64 = (this.field2570 * var57 + this.field2568 * var56 + this.field2563 * var53 >> 15) + this.field2562;
                    int var65 = (this.field2574 * var58 + this.field2571 * var55 + this.field2566 * var54 >> 15) + this.field2569;
                    int var66 = (this.field2567 * var58 + this.field2573 * var54 + this.field2558 * var55 >> 15) + this.field2578;
                    int var67 = (this.field2570 * var58 + this.field2568 * var55 + this.field2563 * var54 >> 15) + this.field2562;
                    for (int var68 = 0; var68 < var43.field3959; ++var68) {
                        short var69 = var43.field3963[var68];
                        short var70 = var43.field3968[var68];
                        short var71 = var43.field3965[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field1481 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field1477 || var73 > arg2.field1477 || var74 > arg2.field1477;
                            short var78 = var43.field3962[var68];
                            if (var78 != -1) {
                                if (this.method1194(this.field2565.field2379.method838(true, var78).field4585)) {
                                    arg2.field1488 = 100;
                                }
                                arg2.method638(var75, var76, var77, var72, var73, var74, var43.field3961[var69], var43.field3961[var70], var43.field3961[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field1488 = 0;
                            } else {
                                int var79 = var43.field3958[var68];
                                if (var79 != -1) {
                                    arg2.method632(var75, var76, var77, var72, var73, var74, class283.method1830(var79, (byte) -122, var43.field3961[var69]), class283.method1830(var79, (byte) -13, var43.field3961[var70]), class283.method1830(var79, (byte) -114, var43.field3961[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field3959; ++var80) {
                    short var81 = var43.field3963[var80];
                    short var82 = var43.field3968[var80];
                    short var83 = var43.field3965[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field3958[var80];
                        if (var90 != -1) {
                            arg2.field1481 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field1477 || var85 > arg2.field1477 || var86 > arg2.field1477;
                            arg2.method632(var87, var88, var89, var84, var85, var86, class283.method1830(var90, (byte) -127, var43.field3961[var81]), class283.method1830(var90, (byte) -16, var43.field3961[var82]), class283.method1830(var90, (byte) -120, var43.field3961[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "U", descriptor = "(Lj;IIIIZ)V")
    public final void method205(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "(IILj;)Lj;")
    public final class377 method197(int arg0, int arg1, class377 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lkt;[I)V")
    public final void method200(class107 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Z")
    private final boolean method1194(int arg0) {
        if ((this.field2572 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }
}
