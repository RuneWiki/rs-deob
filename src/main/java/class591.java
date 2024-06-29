import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class591 extends class115 {

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Lce;")
    private class295 field8095;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "()V")
    public final void method675() {
        super.field1439.field5367 = this.field8095.field3956;
        super.field1439.field5368 = this.field8095.field3961;
        super.field1439.field5347 = this.field8095.field3964;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lkb;[Lmd;)V")
    private class591(class633 arg0, class591[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    private final void method3290(int arg0) {
        if (super.field1397[arg0]) {
            this.method3292(arg0);
        } else {
            short var2 = super.field1441[arg0];
            short var3 = super.field1460[arg0];
            short var4 = super.field1481[arg0];
            this.field8095.field3966 = super.field1448[arg0];
            if (super.field1417 == null) {
                this.field8095.field3954 = 0;
            } else {
                this.field8095.field3954 = super.field1417[arg0] & 255;
            }
            if (super.field1458 != null && super.field1458[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field1424 != null && super.field1424[arg0] != -1) {
                    int var5 = super.field1424[arg0] & 255;
                    var6 = super.field1410[var5];
                    var7 = super.field1440[var5];
                    var8 = super.field1403[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field1462[arg0] == -1) {
                    this.field8095.method1754(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var6], super.field1421[var7], super.field1421[var8], super.field1434[var6], super.field1434[var7], super.field1434[var8], super.field1461[var6], super.field1461[var7], super.field1461[var8], super.field1458[arg0]);
                } else {
                    this.field8095.method1754(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1455[arg0], super.field1470[arg0], super.field1462[arg0], super.field1421[var6], super.field1421[var7], super.field1421[var8], super.field1434[var6], super.field1434[var7], super.field1434[var8], super.field1461[var6], super.field1461[var7], super.field1461[var8], super.field1458[arg0]);
                }
            } else if (super.field1462[arg0] == -1) {
                this.field8095.method1764(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], class554.field7586[super.field1455[arg0] & 65535]);
            } else {
                this.field8095.method1759(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1455[arg0] & 65535, super.field1470[arg0] & 65535, super.field1462[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method666(int arg0) {
        this.field8095.field3953 = (arg0 & 1) == 0;
        this.field8095.field3960 = false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZZIIZI)V")
    public final void method698(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7;
        if (arg3 + 2 > 2200) {
            var7 = 1 + class335.method2138(arg3, 36161) - class115.field1430;
            arg3 = (arg3 >> var7) + 2;
        } else {
            var7 = 0;
            arg3 += 2;
        }
        for (int var8 = 0; var8 < 2200; ++var8) {
            super.field1437[var8] = 0;
        }
        int var9 = 0;
        if (super.field1392 != null) {
            int var10 = 0;
            while (var10 < super.field1447) {
                class628 var11 = super.field1392[var10];
                super.field1454[var11.field8534] = var10++;
            }
        }
        for (int var12 = 0; var12 < super.field1383; ++var12) {
            if (super.field1462[var12] != -2) {
                short var159 = super.field1441[var12];
                short var160 = super.field1460[var12];
                short var161 = super.field1481[var12];
                int var162 = super.field1457[var159];
                int var163 = super.field1457[var160];
                int var164 = super.field1457[var161];
                if (!arg0 || var162 != -5000 && var163 != -5000 && var164 != -5000) {
                    if (super.field1454[var12] != -1 || (super.field1482[var161] - super.field1482[var160]) * (var162 - var163) - (super.field1482[var159] - super.field1482[var160]) * (var164 - var163) > 0) {
                        super.field1397[var12] = false;
                        if (var162 >= 0 && var163 >= 0 && var164 >= 0 && var162 <= super.field1439.field5367 && var163 <= super.field1439.field5367 && var164 <= super.field1439.field5367) {
                            super.field1448[var12] = false;
                        } else {
                            super.field1448[var12] = true;
                        }
                        int var185 = (super.field1479[var159] + super.field1479[var160] + super.field1479[var161]) / 3 >> var7;
                        if (super.field1437[var185] < 64) {
                            super.field1432[var185][super.field1437[var185]++] = var12;
                        } else {
                            int var186 = super.field1437[var185];
                            if (var186 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field1433[var9] = 0;
                                super.field1437[var185] = var186 = 65 + var9++;
                            }
                            var186 -= 65;
                            super.field1414[var186][super.field1433[var186]++] = var12;
                        }
                    }
                } else {
                    int var165 = super.field1421[var159];
                    int var166 = super.field1421[var160];
                    int var167 = super.field1421[var161];
                    int var168 = super.field1434[var159];
                    int var169 = super.field1434[var160];
                    int var170 = super.field1434[var161];
                    int var171 = super.field1461[var159];
                    int var172 = super.field1461[var160];
                    int var173 = super.field1461[var161];
                    int var174 = var165 - var166;
                    int var175 = var167 - var166;
                    int var176 = var168 - var169;
                    int var177 = var170 - var169;
                    int var178 = var171 - var172;
                    int var179 = var173 - var172;
                    int var180 = var176 * var179 - var177 * var178;
                    int var181 = var175 * var178 - var174 * var179;
                    int var182 = var174 * var177 - var175 * var176;
                    if (var172 * var182 + var166 * var180 + var169 * var181 > 0) {
                        super.field1397[var12] = true;
                        int var183 = (super.field1479[var159] + super.field1479[var160] + super.field1479[var161]) / 3 >> var7;
                        if (super.field1437[var183] < 64) {
                            super.field1432[var183][super.field1437[var183]++] = var12;
                        } else {
                            int var184 = super.field1437[var183];
                            if (var184 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field1433[var9] = 0;
                                super.field1437[var183] = var184 = 65 + var9++;
                            }
                            var184 -= 65;
                            super.field1414[var184][super.field1433[var184]++] = var12;
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                int var14 = super.field1422[var13] - arg2 >> var7;
                if (var14 >= 0 && var14 < 2200) {
                    if (super.field1437[var14] < 64) {
                        super.field1432[var14][super.field1437[var14]++] = var13 + 1 << 16;
                    } else {
                        int var15 = super.field1437[var14];
                        if (var15 == 64) {
                            if (var9 == 512) {
                                continue;
                            }
                            super.field1433[var9] = 0;
                            super.field1437[var14] = var15 = 65 + var9++;
                        }
                        var15 -= 65;
                        super.field1414[var15][super.field1433[var15]++] = var13 + 1 << 16;
                    }
                }
            }
        }
        if (super.field1415 == null) {
            if (!arg4 && super.field1392 == null) {
                if (arg1) {
                    for (int var16 = arg3 - 1; var16 >= 0; --var16) {
                        int var17 = super.field1437[var16];
                        if (var17 > 0) {
                            int var18 = var17 > 64 ? 64 : var17;
                            int[] var19 = super.field1432[var16];
                            for (int var20 = 0; var20 < var18; ++var20) {
                                this.method3291(var19[var20]);
                            }
                        }
                        if (var17 > 64) {
                            int var21 = super.field1437[var16] - 64 - 1;
                            int[] var22 = super.field1414[var21];
                            for (int var23 = 0; var23 < super.field1433[var21]; ++var23) {
                                this.method3291(var22[var23]);
                            }
                        }
                    }
                } else {
                    for (int var24 = arg3 - 1; var24 >= 0; --var24) {
                        int var25 = super.field1437[var24];
                        if (var25 > 0) {
                            int var26 = var25 > 64 ? 64 : var25;
                            int[] var27 = super.field1432[var24];
                            for (int var28 = 0; var28 < var26; ++var28) {
                                this.method3290(var27[var28]);
                            }
                        }
                        if (var25 > 64) {
                            int var29 = super.field1437[var24] - 64 - 1;
                            int[] var30 = super.field1414[var29];
                            for (int var31 = 0; var31 < super.field1433[var29]; ++var31) {
                                this.method3290(var30[var31]);
                            }
                        }
                    }
                }
            } else if (arg1) {
                for (int var32 = arg3 - 1; var32 >= 0; --var32) {
                    int var33 = super.field1437[var32];
                    if (var33 > 0) {
                        int var34 = var33 > 64 ? 64 : var33;
                        int[] var35 = super.field1432[var32];
                        for (int var36 = 0; var36 < var34; ++var36) {
                            int var37 = var35[var36];
                            if (var37 < 65536) {
                                int var38 = super.field1454[var37];
                                if (var38 == -1 || !super.field1392[var38].field8537) {
                                    this.method3291(var37);
                                }
                            }
                        }
                    }
                    if (var33 > 64) {
                        int var39 = super.field1437[var32] - 64 - 1;
                        int[] var40 = super.field1414[var39];
                        for (int var41 = 0; var41 < super.field1433[var39]; ++var41) {
                            int var42 = var40[var41];
                            if (var42 < 65536) {
                                int var43 = super.field1454[var42];
                                if (var43 == -1 || !super.field1392[var43].field8537) {
                                    this.method3291(var42);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var44 = arg3 - 1; var44 >= 0; --var44) {
                    int var45 = super.field1437[var44];
                    if (var45 > 0) {
                        int var46 = var45 > 64 ? 64 : var45;
                        int[] var47 = super.field1432[var44];
                        for (int var48 = 0; var48 < var46; ++var48) {
                            int var49 = var47[var48];
                            if (var49 < 65536) {
                                int var50 = super.field1454[var49];
                                if (var50 != -1) {
                                    class628 var51 = super.field1392[var50];
                                    class634 var52 = super.field1463[var50];
                                    if (!var51.field8537) {
                                        this.method3290(var49);
                                    }
                                    super.field1436.method1795(var52.field8642, var52.field8640, var52.field8639, var52.field8647, var52.field8637, var52.field8648, var51.field8541 & 65535, var52.field8645, var51.field8533, var51.field8540);
                                } else {
                                    this.method3290(var47[var48]);
                                }
                            } else {
                                int var53 = (var49 >> 16) - 1;
                                class220 var54 = super.field1428[var53];
                                int var55 = super.field1422[var53];
                                if (var55 == 0) {
                                    var55 = 1;
                                }
                                super.field1436.method1788(var54, super.field1402[var53], super.field1459[var53], var55, (super.field1436.field8611 * var54.field2860 >> 12) / var55);
                            }
                        }
                    }
                    if (var45 > 64) {
                        int var56 = super.field1437[var44] - 64 - 1;
                        int[] var57 = super.field1414[var56];
                        for (int var58 = 0; var58 < super.field1433[var56]; ++var58) {
                            int var59 = var57[var58];
                            if (var59 < 65536) {
                                int var60 = super.field1454[var59];
                                if (var60 != -1) {
                                    class628 var61 = super.field1392[var60];
                                    class634 var62 = super.field1463[var60];
                                    if (!var61.field8537) {
                                        this.method3290(var59);
                                    }
                                    super.field1436.method1795(var62.field8642, var62.field8640, var62.field8639, var62.field8647, var62.field8637, var62.field8648, var61.field8541 & 65535, var62.field8645, var61.field8533, var61.field8540);
                                } else {
                                    this.method3290(var57[var58]);
                                }
                            } else {
                                int var63 = (var59 >> 16) - 1;
                                class220 var64 = super.field1428[var63];
                                int var65 = super.field1422[var63];
                                if (var65 == 0) {
                                    var65 = 1;
                                }
                                super.field1436.method1788(var64, super.field1402[var63], super.field1459[var63], var65, (super.field1436.field8611 * var64.field2860 >> 12) / var65);
                            }
                        }
                    }
                }
            }
        } else {
            for (int var66 = 0; var66 < 12; ++var66) {
                super.field1396[var66] = 0;
                super.field1411[var66] = 0;
            }
            if (arg4) {
                for (int var67 = arg3 - 1; var67 >= 0; --var67) {
                    int var68 = super.field1437[var67];
                    if (var68 > 0) {
                        int var69;
                        if (var68 > 64) {
                            var69 = 64;
                        } else {
                            var69 = var68;
                        }
                        int[] var70 = super.field1432[var67];
                        for (int var71 = 0; var71 < var69; ++var71) {
                            int var72 = var70[var71];
                            if (var72 < 65536) {
                                byte var73 = super.field1415[var72];
                                int var74 = super.field1396[var73]++;
                                super.field1385[var73][var74] = var72;
                                if (var73 < 10) {
                                    super.field1411[var73] += var67;
                                } else if (var73 == 10) {
                                    super.field1381[var74] = var67;
                                } else {
                                    super.field1408[var74] = var67;
                                }
                            } else {
                                byte var75 = super.field1428[(var72 >> 16) - 1].field2862;
                                int var76 = super.field1396[var75]++;
                                super.field1385[var75][var76] = var72;
                                if (var75 < 10) {
                                    super.field1411[var75] += var67;
                                } else if (var75 == 10) {
                                    super.field1381[var76] = var67;
                                } else {
                                    super.field1408[var76] = var67;
                                }
                            }
                        }
                    }
                    if (var68 > 64) {
                        int var77 = super.field1437[var67] - 64 - 1;
                        int[] var78 = super.field1414[var77];
                        for (int var79 = 0; var79 < super.field1433[var77]; ++var79) {
                            int var80 = var78[var79];
                            if (var80 < 65536) {
                                byte var81 = super.field1415[var80];
                                int var82 = super.field1396[var81]++;
                                super.field1385[var81][var82] = var80;
                                if (var81 < 10) {
                                    super.field1411[var81] += var67;
                                } else if (var81 == 10) {
                                    super.field1381[var82] = var67;
                                } else {
                                    super.field1408[var82] = var67;
                                }
                            } else {
                                byte var83 = super.field1428[(var80 >> 16) - 1].field2862;
                                int var84 = super.field1396[var83]++;
                                super.field1385[var83][var84] = var80;
                                if (var83 < 10) {
                                    super.field1411[var83] += var67;
                                } else if (var83 == 10) {
                                    super.field1381[var84] = var67;
                                } else {
                                    super.field1408[var84] = var67;
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var85 = arg3 - 1; var85 >= 0; --var85) {
                    int var146 = super.field1437[var85];
                    if (var146 > 0) {
                        int var147;
                        if (var146 > 64) {
                            var147 = 64;
                        } else {
                            var147 = var146;
                        }
                        int[] var148 = super.field1432[var85];
                        for (int var149 = 0; var149 < var147; ++var149) {
                            int var150 = var148[var149];
                            byte var151 = super.field1415[var150];
                            int var152 = super.field1396[var151]++;
                            super.field1385[var151][var152] = var150;
                            if (var151 < 10) {
                                super.field1411[var151] += var85;
                            } else if (var151 == 10) {
                                super.field1381[var152] = var85;
                            } else {
                                super.field1408[var152] = var85;
                            }
                        }
                    }
                    if (var146 > 64) {
                        int var153 = super.field1437[var85] - 64 - 1;
                        int[] var154 = super.field1414[var153];
                        for (int var155 = 0; var155 < super.field1433[var153]; ++var155) {
                            int var156 = var154[var155];
                            byte var157 = super.field1415[var156];
                            int var158 = super.field1396[var157]++;
                            super.field1385[var157][var158] = var156;
                            if (var157 < 10) {
                                super.field1411[var157] += var85;
                            } else if (var157 == 10) {
                                super.field1381[var158] = var85;
                            } else {
                                super.field1408[var158] = var85;
                            }
                        }
                    }
                }
            }
            int var86 = 0;
            if (super.field1396[1] > 0 || super.field1396[2] > 0) {
                var86 = (super.field1411[1] + super.field1411[2]) / (super.field1396[1] + super.field1396[2]);
            }
            int var87 = 0;
            if (super.field1396[3] > 0 || super.field1396[4] > 0) {
                var87 = (super.field1411[3] + super.field1411[4]) / (super.field1396[3] + super.field1396[4]);
            }
            int var88 = 0;
            if (super.field1396[6] > 0 || super.field1396[8] > 0) {
                var88 = (super.field1411[6] + super.field1411[8]) / (super.field1396[6] + super.field1396[8]);
            }
            int var89 = 0;
            int var90 = super.field1396[10];
            int[] var91 = super.field1385[10];
            int[] var92 = super.field1381;
            if (var89 == var90) {
                var89 = 0;
                var90 = super.field1396[11];
                var91 = super.field1385[11];
                var92 = super.field1408;
            }
            int var93;
            if (var89 < var90) {
                var93 = var92[var89];
            } else {
                var93 = -1000;
            }
            for (int var94 = 0; var94 < 10; ++var94) {
                if (arg1) {
                    while (var94 == 0 && var93 > var86) {
                        int var104 = var91[var89++];
                        if (var104 < 65536) {
                            int var105 = super.field1454[var104];
                            if (var105 == -1 || !super.field1392[var105].field8537) {
                                this.method3291(var104);
                            }
                        }
                        if (var89 == var90 && super.field1385[11] != var91) {
                            var89 = 0;
                            var90 = super.field1396[11];
                            var91 = super.field1385[11];
                            var92 = super.field1408;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 3 && var93 > var87) {
                        int var106 = var91[var89++];
                        if (var106 < 65536) {
                            int var107 = super.field1454[var106];
                            if (var107 == -1 || !super.field1392[var107].field8537) {
                                this.method3291(var106);
                            }
                        }
                        if (var89 == var90 && super.field1385[11] != var91) {
                            var89 = 0;
                            var90 = super.field1396[11];
                            var91 = super.field1385[11];
                            var92 = super.field1408;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 5 && var93 > var88) {
                        int var108 = var91[var89++];
                        if (var108 < 65536) {
                            int var109 = super.field1454[var108];
                            if (var109 == -1 || !super.field1392[var109].field8537) {
                                this.method3291(var108);
                            }
                        }
                        if (var89 == var90 && super.field1385[11] != var91) {
                            var89 = 0;
                            var90 = super.field1396[11];
                            var91 = super.field1385[11];
                            var92 = super.field1408;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var94 == 0 && var93 > var86) {
                        int var110 = var91[var89++];
                        if (var110 < 65536) {
                            int var111 = super.field1454[var110];
                            if (var111 != -1) {
                                class628 var112 = super.field1392[var111];
                                class634 var113 = super.field1463[var111];
                                if (!var112.field8537) {
                                    this.method3290(var110);
                                }
                                super.field1436.method1795(var113.field8642, var113.field8640, var113.field8639, var113.field8647, var113.field8637, var113.field8648, var112.field8541 & 65535, var113.field8645, var112.field8533, var112.field8540);
                            } else {
                                this.method3290(var110);
                            }
                        } else {
                            int var114 = (var110 >> 16) - 1;
                            class220 var115 = super.field1428[var114];
                            int var116 = super.field1422[var114];
                            if (var116 == 0) {
                                var116 = 1;
                            }
                            super.field1436.method1788(var115, super.field1402[var114], super.field1459[var114], var116, (super.field1436.field8611 * var115.field2860 >> 12) / var116);
                        }
                        if (var89 == var90 && super.field1385[11] != var91) {
                            var89 = 0;
                            var90 = super.field1396[11];
                            var91 = super.field1385[11];
                            var92 = super.field1408;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 3 && var93 > var87) {
                        int var117 = var91[var89++];
                        if (var117 < 65536) {
                            int var118 = super.field1454[var117];
                            if (var118 != -1) {
                                class628 var119 = super.field1392[var118];
                                class634 var120 = super.field1463[var118];
                                if (!var119.field8537) {
                                    this.method3290(var117);
                                }
                                super.field1436.method1795(var120.field8642, var120.field8640, var120.field8639, var120.field8647, var120.field8637, var120.field8648, var119.field8541 & 65535, var120.field8645, var119.field8533, var119.field8540);
                            } else {
                                this.method3290(var117);
                            }
                        } else {
                            int var121 = (var117 >> 16) - 1;
                            class220 var122 = super.field1428[var121];
                            int var123 = super.field1422[var121];
                            if (var123 == 0) {
                                var123 = 1;
                            }
                            super.field1436.method1788(var122, super.field1402[var121], super.field1459[var121], var123, (super.field1436.field8611 * var122.field2860 >> 12) / var123);
                        }
                        if (var89 == var90 && super.field1385[11] != var91) {
                            var89 = 0;
                            var90 = super.field1396[11];
                            var91 = super.field1385[11];
                            var92 = super.field1408;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 5 && var93 > var88) {
                        int var124 = var91[var89++];
                        if (var124 < 65536) {
                            int var125 = super.field1454[var124];
                            if (var125 != -1) {
                                class628 var126 = super.field1392[var125];
                                class634 var127 = super.field1463[var125];
                                if (!var126.field8537) {
                                    this.method3290(var124);
                                }
                                super.field1436.method1795(var127.field8642, var127.field8640, var127.field8639, var127.field8647, var127.field8637, var127.field8648, var126.field8541 & 65535, var127.field8645, var126.field8533, var126.field8540);
                            } else {
                                this.method3290(var124);
                            }
                        } else {
                            int var128 = (var124 >> 16) - 1;
                            class220 var129 = super.field1428[var128];
                            int var130 = super.field1422[var128];
                            if (var130 == 0) {
                                var130 = 1;
                            }
                            super.field1436.method1788(var129, super.field1402[var128], super.field1459[var128], var130, (super.field1436.field8611 * var129.field2860 >> 12) / var130);
                        }
                        if (var89 == var90 && super.field1385[11] != var91) {
                            var89 = 0;
                            var90 = super.field1396[11];
                            var91 = super.field1385[11];
                            var92 = super.field1408;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
                int var131 = super.field1396[var94];
                int[] var132 = super.field1385[var94];
                if (!arg4 && super.field1392 == null) {
                    if (arg1) {
                        for (int var133 = 0; var133 < var131; ++var133) {
                            this.method3291(var132[var133]);
                        }
                    } else {
                        for (int var134 = 0; var134 < var131; ++var134) {
                            this.method3290(var132[var134]);
                        }
                    }
                } else if (!arg1) {
                    for (int var138 = 0; var138 < var131; ++var138) {
                        int var139 = var132[var138];
                        if (var139 < 65536) {
                            int var140 = super.field1454[var139];
                            if (var140 != -1) {
                                class628 var141 = super.field1392[var140];
                                class634 var142 = super.field1463[var140];
                                if (!var141.field8537) {
                                    this.method3290(var139);
                                }
                                super.field1436.method1795(var142.field8642, var142.field8640, var142.field8639, var142.field8647, var142.field8637, var142.field8648, var141.field8541 & 65535, var142.field8645, var141.field8533, var141.field8540);
                            } else {
                                this.method3290(var139);
                            }
                        } else {
                            int var143 = (var139 >> 16) - 1;
                            class220 var144 = super.field1428[var143];
                            int var145 = super.field1422[var143];
                            if (var145 == 0) {
                                var145 = 1;
                            }
                            super.field1436.method1788(var144, super.field1402[var143], super.field1459[var143], var145, (super.field1436.field8611 * var144.field2860 >> 12) / var145);
                        }
                    }
                } else {
                    for (int var135 = 0; var135 < var131; ++var135) {
                        int var136 = var132[var135];
                        if (var136 < 65536) {
                            int var137 = super.field1454[var136];
                            if (var137 == -1 || !super.field1392[var137].field8537) {
                                this.method3291(var136);
                            }
                        }
                    }
                }
            }
            if (!arg4 && super.field1392 == null) {
                if (arg1) {
                    while (var93 != -1000) {
                        this.method3291(var91[var89++]);
                        if (var89 == var90 && super.field1385[11] != var91) {
                            var89 = 0;
                            var91 = super.field1385[11];
                            var90 = super.field1396[11];
                            var92 = super.field1408;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var93 != -1000) {
                        this.method3290(var91[var89++]);
                        if (var89 == var90 && super.field1385[11] != var91) {
                            var89 = 0;
                            var91 = super.field1385[11];
                            var90 = super.field1396[11];
                            var92 = super.field1408;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
            } else if (!arg1) {
                while (var93 != -1000) {
                    int var97 = var91[var89++];
                    if (var97 < 65536) {
                        int var98 = super.field1454[var97];
                        if (var98 != -1) {
                            class628 var99 = super.field1392[var98];
                            class634 var100 = super.field1463[var98];
                            if (!var99.field8537) {
                                this.method3290(var97);
                            }
                            super.field1436.method1795(var100.field8642, var100.field8640, var100.field8639, var100.field8647, var100.field8637, var100.field8648, var99.field8541 & 65535, var100.field8645, var99.field8533, var99.field8540);
                        } else {
                            this.method3290(var97);
                        }
                    } else {
                        int var101 = (var97 >> 16) - 1;
                        class220 var102 = super.field1428[var101];
                        int var103 = super.field1422[var101];
                        if (var103 == 0) {
                            var103 = 1;
                        }
                        super.field1436.method1788(var102, super.field1402[var101], super.field1459[var101], var103, (super.field1436.field8611 * var102.field2860 >> 12) / var103);
                    }
                    if (var89 == var90 && super.field1385[11] != var91) {
                        var89 = 0;
                        var91 = super.field1385[11];
                        var90 = super.field1396[11];
                        var92 = super.field1408;
                    }
                    if (var89 < var90) {
                        var93 = var92[var89];
                    } else {
                        var93 = -1000;
                    }
                }
            } else {
                while (var93 != -1000) {
                    int var95 = var91[var89++];
                    if (var95 < 65536) {
                        int var96 = super.field1454[var95];
                        if (var96 == -1 || !super.field1392[var96].field8537) {
                            this.method3291(var95);
                        }
                    }
                    if (var89 == var90 && super.field1385[11] != var91) {
                        var89 = 0;
                        var91 = super.field1385[11];
                        var90 = super.field1396[11];
                        var92 = super.field1408;
                    }
                    if (var89 < var90) {
                        var93 = var92[var89];
                    } else {
                        var93 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lkb;)V")
    public class591(class633 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!md", name = "j", descriptor = "()V")
    public final void method654() {
        this.field8095 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lkb;Lrf;IIII)V")
    public class591(class633 arg0, class238 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BIZ)Lba;")
    public final class629 method659(byte arg0, int arg1, boolean arg2) {
        this.method663(Thread.currentThread());
        class115 var4;
        class115 var5;
        if (arg0 == 1) {
            var4 = super.field1386;
            var5 = super.field1412;
        } else if (arg0 == 2) {
            var4 = super.field1390;
            var5 = super.field1399;
        } else if (arg0 == 3) {
            var4 = super.field1475;
            var5 = super.field1400;
        } else if (arg0 == 4) {
            var4 = super.field1472;
            var5 = super.field1398;
        } else if (arg0 == 5) {
            var4 = super.field1484;
            var5 = super.field1466;
        } else {
            var5 = var4 = new class591(super.field1436);
        }
        return this.method689(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    private final void method3291(int arg0) {
        if (!super.field1436.field8618) {
            short var2 = super.field1441[arg0];
            short var3 = super.field1460[arg0];
            short var4 = super.field1481[arg0];
            int var5 = super.field1431[var2] - super.field1436.field8631;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1431[var3] - super.field1436.field8631;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field1431[var4] - super.field1436.field8631;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method3290(arg0);
                } else {
                    if (super.field1417 == null) {
                        this.field8095.field3954 = 0;
                    } else {
                        this.field8095.field3954 = super.field1417[arg0] & 255;
                    }
                    this.field8095.field3966 = super.field1448[arg0];
                    if (super.field1458 != null && super.field1458[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field1424 != null && super.field1424[arg0] != -1) {
                            int var9 = super.field1424[arg0] & 255;
                            var10 = super.field1410[var9];
                            var11 = super.field1440[var9];
                            var12 = super.field1403[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field1462[arg0] == -1) {
                            this.field8095.method1760(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1436.field8605, var5, var6, var7, super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var10], super.field1421[var11], super.field1421[var12], super.field1434[var10], super.field1434[var11], super.field1434[var12], super.field1461[var10], super.field1461[var11], super.field1461[var12], super.field1458[arg0]);
                        } else {
                            this.field8095.method1760(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1436.field8605, var5, var6, var7, super.field1455[arg0], super.field1470[arg0], super.field1462[arg0], super.field1421[var10], super.field1421[var11], super.field1421[var12], super.field1434[var10], super.field1434[var11], super.field1434[var12], super.field1461[var10], super.field1461[var11], super.field1461[var12], super.field1458[arg0]);
                        }
                    } else if (super.field1462[arg0] == -1) {
                        this.field8095.method1757(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], class584.method3272(var5 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var6 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var7 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96));
                    } else {
                        this.field8095.method1757(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], class584.method3272(var5 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var6 << 24 | super.field1436.field8605, class554.field7586[super.field1470[arg0] & 65535], (byte) 96), class584.method3272(var7 << 24 | super.field1436.field8605, class554.field7586[super.field1462[arg0] & 65535], (byte) 96));
                    }
                }
            }
        } else if (!super.field1397[arg0]) {
            short var13 = super.field1441[arg0];
            short var14 = super.field1460[arg0];
            short var15 = super.field1481[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field1465[var13] > super.field1436.field8623) {
                var16 = 255;
            } else if (super.field1465[var13] > super.field1436.field8626) {
                var16 = (super.field1436.field8626 - super.field1465[var13]) * 255 / (super.field1436.field8626 - super.field1436.field8623);
            }
            if (super.field1465[var14] > super.field1436.field8623) {
                var17 = 255;
            } else if (super.field1465[var14] > super.field1436.field8626) {
                var17 = (super.field1436.field8626 - super.field1465[var14]) * 255 / (super.field1436.field8626 - super.field1436.field8623);
            }
            if (super.field1465[var15] > super.field1436.field8623) {
                var18 = 255;
            } else if (super.field1465[var15] > super.field1436.field8626) {
                var18 = (super.field1436.field8626 - super.field1465[var15]) * 255 / (super.field1436.field8626 - super.field1436.field8623);
            }
            if (super.field1417 == null) {
                this.field8095.field3954 = 0;
            } else {
                this.field8095.field3954 = super.field1417[arg0] & 255;
            }
            this.field8095.field3966 = super.field1448[arg0];
            if (super.field1458 != null && super.field1458[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field1424 != null && super.field1424[arg0] != -1) {
                    int var19 = super.field1424[arg0] & 255;
                    var20 = super.field1410[var19];
                    var21 = super.field1440[var19];
                    var22 = super.field1403[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field1462[arg0] == -1) {
                    this.field8095.method1760(super.field1482[var13], super.field1482[var14], super.field1482[var15], super.field1457[var13], super.field1457[var14], super.field1457[var15], super.field1436.field8605, var16, var17, var18, super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var20], super.field1421[var21], super.field1421[var22], super.field1434[var20], super.field1434[var21], super.field1434[var22], super.field1461[var20], super.field1461[var21], super.field1461[var22], super.field1458[arg0]);
                } else {
                    this.field8095.method1760(super.field1482[var13], super.field1482[var14], super.field1482[var15], super.field1457[var13], super.field1457[var14], super.field1457[var15], super.field1436.field8605, var16, var17, var18, super.field1455[arg0], super.field1470[arg0], super.field1462[arg0], super.field1421[var20], super.field1421[var21], super.field1421[var22], super.field1434[var20], super.field1434[var21], super.field1434[var22], super.field1461[var20], super.field1461[var21], super.field1461[var22], super.field1458[arg0]);
                }
            } else if (super.field1462[arg0] == -1) {
                this.field8095.method1757(super.field1482[var13], super.field1482[var14], super.field1482[var15], super.field1457[var13], super.field1457[var14], super.field1457[var15], class584.method3272(var16 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var17 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var18 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96));
            } else {
                this.field8095.method1757(super.field1482[var13], super.field1482[var14], super.field1482[var15], super.field1457[var13], super.field1457[var14], super.field1457[var15], class584.method3272(var16 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var17 << 24 | super.field1436.field8605, class554.field7586[super.field1470[arg0] & 65535], (byte) 96), class584.method3272(var18 << 24 | super.field1436.field8605, class554.field7586[super.field1462[arg0] & 65535], (byte) 96));
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Ljava/lang/Thread;)V")
    public final void method696(Thread arg0) {
        super.method696(arg0);
        class644 var2 = (class644) super.field1436.method1789(arg0);
        this.field8095 = var2.field9124;
        super.field1479 = var2.field9121;
        super.field1437 = var2.field9122;
        super.field1432 = var2.field9117;
        super.field1433 = var2.field9134;
        super.field1414 = var2.field9116;
        super.field1396 = var2.field9119;
        super.field1385 = var2.field9120;
        super.field1381 = var2.field9133;
        super.field1408 = var2.field9126;
        super.field1411 = var2.field9125;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    private final void method3292(int arg0) {
        int var2 = 0;
        int var3 = super.field1436.field8607;
        short var4 = super.field1441[arg0];
        short var5 = super.field1460[arg0];
        short var6 = super.field1481[arg0];
        int var7 = super.field1461[var4];
        int var8 = super.field1461[var5];
        int var9 = super.field1461[var6];
        if (super.field1417 == null) {
            this.field8095.field3954 = 0;
        } else {
            this.field8095.field3954 = super.field1417[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field1391[var2] = super.field1457[var4];
            super.field1468[var2] = super.field1482[var4];
            super.field1425[var2++] = super.field1455[arg0] & 65535;
        } else {
            int var10 = super.field1421[var4];
            int var11 = super.field1434[var4];
            int var12 = super.field1455[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class115.field1485[var9 - var7];
                super.field1391[var2] = (((super.field1421[var6] - var10) * var13 >> 16) + var10) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var6] - var11) * var13 >> 16) + var11) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1425[var2++] = (((super.field1462[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class115.field1485[var8 - var7];
                super.field1391[var2] = (((super.field1421[var5] - var10) * var14 >> 16) + var10) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var5] - var11) * var14 >> 16) + var11) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1425[var2++] = (((super.field1470[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field1391[var2] = super.field1457[var5];
            super.field1468[var2] = super.field1482[var5];
            super.field1425[var2++] = super.field1470[arg0] & 65535;
        } else {
            int var15 = super.field1421[var5];
            int var16 = super.field1434[var5];
            int var17 = super.field1470[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class115.field1485[var7 - var8];
                super.field1391[var2] = (((super.field1421[var4] - var15) * var18 >> 16) + var15) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var4] - var16) * var18 >> 16) + var16) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1425[var2++] = (((super.field1455[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class115.field1485[var9 - var8];
                super.field1391[var2] = (((super.field1421[var6] - var15) * var19 >> 16) + var15) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var6] - var16) * var19 >> 16) + var16) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1425[var2++] = (((super.field1462[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field1391[var2] = super.field1457[var6];
            super.field1468[var2] = super.field1482[var6];
            super.field1425[var2++] = super.field1462[arg0] & 65535;
        } else {
            int var20 = super.field1421[var6];
            int var21 = super.field1434[var6];
            int var22 = super.field1462[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class115.field1485[var8 - var9];
                super.field1391[var2] = (((super.field1421[var5] - var20) * var23 >> 16) + var20) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var5] - var21) * var23 >> 16) + var21) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1425[var2++] = (((super.field1470[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class115.field1485[var7 - var9];
                super.field1391[var2] = (((super.field1421[var4] - var20) * var24 >> 16) + var20) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var4] - var21) * var24 >> 16) + var21) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1425[var2++] = (((super.field1455[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field1391[0];
        int var26 = super.field1391[1];
        int var27 = super.field1391[2];
        int var28 = super.field1468[0];
        int var29 = super.field1468[1];
        int var30 = super.field1468[2];
        this.field8095.field3966 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field1439.field5367 || var26 > super.field1439.field5367 || var27 > super.field1439.field5367) {
                this.field8095.field3966 = true;
            }
            if (super.field1458 != null && super.field1458[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field1424 != null && super.field1424[arg0] != -1) {
                    int var31 = super.field1424[arg0] & 255;
                    var32 = super.field1410[var31];
                    var33 = super.field1440[var31];
                    var34 = super.field1403[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field1462[arg0] == -1) {
                    this.field8095.method1754(var28, var29, var30, var25, var26, var27, super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var32], super.field1421[var33], super.field1421[var34], super.field1434[var32], super.field1434[var33], super.field1434[var34], super.field1461[var32], super.field1461[var33], super.field1461[var34], super.field1458[arg0]);
                } else {
                    this.field8095.method1754(var28, var29, var30, var25, var26, var27, super.field1425[0], super.field1425[1], super.field1425[2], super.field1421[var32], super.field1421[var33], super.field1421[var34], super.field1434[var32], super.field1434[var33], super.field1434[var34], super.field1461[var32], super.field1461[var33], super.field1461[var34], super.field1458[arg0]);
                }
            } else if (super.field1462[arg0] == -1) {
                this.field8095.method1764(var28, var29, var30, var25, var26, var27, class554.field7586[super.field1455[arg0] & 65535]);
            } else {
                this.field8095.method1759(var28, var29, var30, var25, var26, var27, super.field1425[0], super.field1425[1], super.field1425[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field1439.field5367 || var26 > super.field1439.field5367 || var27 > super.field1439.field5367 || super.field1391[3] < 0 || super.field1391[3] > super.field1439.field5367) {
                this.field8095.field3966 = true;
            }
            if (super.field1458 == null || super.field1458[arg0] == -1) {
                if (super.field1462[arg0] == -1) {
                    int var40 = class554.field7586[super.field1455[arg0] & 65535];
                    this.field8095.method1764(var28, var29, var30, var25, var26, var27, var40);
                    this.field8095.method1764(var28, var30, super.field1468[3], var25, var27, super.field1391[3], var40);
                    return;
                }
                this.field8095.method1759(var28, var29, var30, var25, var26, var27, super.field1425[0], super.field1425[1], super.field1425[2]);
                this.field8095.method1759(var28, var30, super.field1468[3], var25, var27, super.field1391[3], super.field1425[0], super.field1425[2], super.field1425[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field1424 != null && super.field1424[arg0] != -1) {
                int var35 = super.field1424[arg0] & 255;
                var36 = super.field1410[var35];
                var37 = super.field1440[var35];
                var38 = super.field1403[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field1458[arg0];
            if (super.field1462[arg0] == -1) {
                this.field8095.method1754(var28, var29, var30, var25, var26, var27, super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var36], super.field1421[var37], super.field1421[var38], super.field1434[var36], super.field1434[var37], super.field1434[var38], super.field1461[var36], super.field1461[var37], super.field1461[var38], var39);
                this.field8095.method1754(var28, var30, super.field1468[3], var25, var27, super.field1391[3], super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var36], super.field1421[var37], super.field1421[var38], super.field1434[var36], super.field1434[var37], super.field1434[var38], super.field1461[var36], super.field1461[var37], super.field1461[var38], var39);
                return;
            }
            this.field8095.method1754(var28, var29, var30, var25, var26, var27, super.field1425[0], super.field1425[1], super.field1425[2], super.field1421[var36], super.field1421[var37], super.field1421[var38], super.field1434[var36], super.field1434[var37], super.field1434[var38], super.field1461[var36], super.field1461[var37], super.field1461[var38], var39);
            this.field8095.method1754(var28, var30, super.field1468[3], var25, var27, super.field1391[3], super.field1425[0], super.field1425[2], super.field1425[3], super.field1421[var36], super.field1421[var37], super.field1421[var38], super.field1434[var36], super.field1434[var37], super.field1434[var38], super.field1461[var36], super.field1461[var37], super.field1461[var38], var39);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lgk;[Lmd;)Lmd;")
    public static final class591 method3293(class300 arg0, class591[] arg1) {
        int var2 = 0;
        class591 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class591(arg0, arg1);
        }
    }
}
