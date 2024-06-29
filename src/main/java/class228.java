import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class228 extends class69 {

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "[B")
    public byte[] field3992;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lge;")
    public class235 field3991;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
    public final void method1556() {
        if (this.field3991 != null) {
            return;
        }
        this.field3991 = new class235(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class91 var3 = new class91(this.field3992);
        int var4 = var3.method710();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method704(var5);
            var3.method701(var5);
            var3.method716(var5);
        }
        label53: do {
            while (true) {
                int var6 = var3.method705();
                int var7 = var3.field1708[var6];
                while (var3.field1708[var6] == var7) {
                    var3.method704(var6);
                    int var8 = var3.method708(var6);
                    if (var8 == 1) {
                        var3.method715();
                        var3.method716(var6);
                        continue label53;
                    }
                    int var9 = var8 & 0xF0;
                    if (var9 == 176) {
                        int var10 = var8 & 0xF;
                        int var11 = var8 >> 8 & 0x7F;
                        int var12 = var8 >> 16 & 0x7F;
                        if (var11 == 0) {
                            var1[var10] = (var12 << 14) + (var1[var10] & 0xFFE03FFF);
                        }
                        if (var11 == 32) {
                            var1[var10] = (var12 << 7) + (var1[var10] & 0xFFFFC07F);
                        }
                    }
                    if (var9 == 192) {
                        int var13 = var8 & 0xF;
                        int var14 = var8 >> 8 & 0x7F;
                        var2[var13] = var1[var13] + var14;
                    }
                    if (var9 == 144) {
                        int var15 = var8 & 0xF;
                        int var16 = var8 >> 8 & 0x7F;
                        int var17 = var8 >> 16 & 0x7F;
                        if (var17 > 0) {
                            int var18 = var2[var15];
                            class115 var19 = (class115) this.field3991.method1601(106, (long) var18);
                            if (var19 == null) {
                                var19 = new class115(new byte[128]);
                                this.field3991.method1597((long) var18, (byte) -126, var19);
                            }
                            var19.field2170[var16] = 1;
                        }
                    }
                    var3.method701(var6);
                    var3.method716(var6);
                }
            }
        } while (!var3.method702());
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()V")
    public final void method1557() {
        this.field3991 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lpi;II)Lef;")
    public static final class228 method1558(class181 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1293(arg2, arg1, (byte) -105);
        return var3 == null ? null : new class228(new class75(var3));
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lwe;)V")
    private class228(class75 arg0) {
        arg0.field1380 = arg0.field1368.length - 3;
        int var2 = arg0.method558(1);
        int var3 = arg0.method545((byte) -64);
        int var4 = var2 * 10 + 14;
        arg0.field1380 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var77 = -1;
            while (true) {
                int var78 = arg0.method558(1);
                if (var77 != var78) {
                    var4++;
                }
                var77 = var78 & 0xF;
                if (var78 == 7) {
                    break;
                }
                if (var78 == 23) {
                    var5++;
                } else if (var77 == 0) {
                    var7++;
                } else if (var77 == 1) {
                    var8++;
                } else if (var77 == 2) {
                    var6++;
                } else if (var77 == 3) {
                    var9++;
                } else if (var77 == 4) {
                    var10++;
                } else if (var77 == 5) {
                    var11++;
                } else if (var77 == 6) {
                    var12++;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        int var14 = var5 * 5 + var4;
        int var15 = (var7 + var8 + var6 + var9 + var11) * 2 + var14;
        int var16 = var10 + var12 + var15;
        int var17 = arg0.field1380;
        int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var19 = 0; var19 < var18; var19++) {
            arg0.method585(95);
        }
        int var20 = arg0.field1380 + var16 - var17;
        int var21 = arg0.field1380;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < var6; var35++) {
            var34 = var34 + arg0.method558(1) & 0x7F;
            if (var34 == 0 || var34 == 32) {
                var12++;
            } else if (var34 == 1) {
                var22++;
            } else if (var34 == 33) {
                var23++;
            } else if (var34 == 7) {
                var24++;
            } else if (var34 == 39) {
                var25++;
            } else if (var34 == 10) {
                var26++;
            } else if (var34 == 42) {
                var27++;
            } else if (var34 == 99) {
                var28++;
            } else if (var34 == 98) {
                var29++;
            } else if (var34 == 101) {
                var30++;
            } else if (var34 == 100) {
                var31++;
            } else if (var34 == 64 || var34 == 65 || var34 == 120 || var34 == 121 || var34 == 123) {
                var32++;
            } else {
                var33++;
            }
        }
        int var36 = 0;
        int var37 = arg0.field1380;
        arg0.field1380 += var32;
        int var38 = arg0.field1380;
        arg0.field1380 += var11;
        int var39 = arg0.field1380;
        arg0.field1380 += var10;
        int var40 = arg0.field1380;
        arg0.field1380 += var9;
        int var41 = arg0.field1380;
        arg0.field1380 += var22;
        int var42 = arg0.field1380;
        arg0.field1380 += var24;
        int var43 = arg0.field1380;
        arg0.field1380 += var26;
        int var44 = arg0.field1380;
        arg0.field1380 += var7 + var8 + var11;
        int var45 = arg0.field1380;
        arg0.field1380 += var7;
        int var46 = arg0.field1380;
        arg0.field1380 += var33;
        int var47 = arg0.field1380;
        arg0.field1380 += var8;
        int var48 = arg0.field1380;
        arg0.field1380 += var23;
        int var49 = arg0.field1380;
        arg0.field1380 += var25;
        int var50 = arg0.field1380;
        arg0.field1380 += var27;
        int var51 = arg0.field1380;
        arg0.field1380 += var12;
        int var52 = arg0.field1380;
        arg0.field1380 += var9;
        int var53 = arg0.field1380;
        arg0.field1380 += var28;
        int var54 = arg0.field1380;
        arg0.field1380 += var29;
        int var55 = arg0.field1380;
        arg0.field1380 += var30;
        int var56 = arg0.field1380;
        arg0.field1380 += var31;
        int var57 = arg0.field1380;
        arg0.field1380 += var5 * 3;
        this.field3992 = new byte[var20];
        class75 var58 = new class75(this.field3992);
        var58.method581(true, 1297377380);
        var58.method581(true, 6);
        var58.method546((byte) 97, var2 > 1 ? 1 : 0);
        var58.method546((byte) 101, var2);
        var58.method546((byte) 117, var3);
        arg0.field1380 = var17;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int[] var66 = new int[128];
        int var67 = 0;
        label223: for (int var68 = 0; var68 < var2; var68++) {
            var58.method581(true, 1297379947);
            var58.field1380 += 4;
            int var69 = var58.field1380;
            int var70 = -1;
            while (true) {
                while (true) {
                    int var71 = arg0.method585(84);
                    var58.method571(-64, var71);
                    int var72 = arg0.field1368[var36++] & 0xFF;
                    boolean var73 = var70 != var72;
                    var70 = var72 & 0xF;
                    if (var72 == 7) {
                        if (var73) {
                            var58.method570(255, 15619);
                        }
                        var58.method570(47, 15619);
                        var58.method570(0, 15619);
                        var58.method548(var58.field1380 - var69, -22315);
                        continue label223;
                    }
                    if (var72 == 23) {
                        if (var73) {
                            var58.method570(255, 15619);
                        }
                        var58.method570(81, 15619);
                        var58.method570(3, 15619);
                        var58.method570(arg0.field1368[var57++], 15619);
                        var58.method570(arg0.field1368[var57++], 15619);
                        var58.method570(arg0.field1368[var57++], 15619);
                    } else {
                        var59 ^= var72 >> 4;
                        if (var70 == 0) {
                            if (var73) {
                                var58.method570(var59 + 144, 15619);
                            }
                            var60 += arg0.field1368[var44++];
                            var61 += arg0.field1368[var45++];
                            var58.method570(var60 & 0x7F, 15619);
                            var58.method570(var61 & 0x7F, 15619);
                        } else if (var70 == 1) {
                            if (var73) {
                                var58.method570(var59 + 128, 15619);
                            }
                            var60 += arg0.field1368[var44++];
                            var62 += arg0.field1368[var47++];
                            var58.method570(var60 & 0x7F, 15619);
                            var58.method570(var62 & 0x7F, 15619);
                        } else if (var70 == 2) {
                            if (var73) {
                                var58.method570(var59 + 176, 15619);
                            }
                            var67 = var67 + arg0.field1368[var21++] & 0x7F;
                            var58.method570(var67, 15619);
                            byte var74;
                            if (var67 == 0 || var67 == 32) {
                                var74 = arg0.field1368[var51++];
                            } else if (var67 == 1) {
                                var74 = arg0.field1368[var41++];
                            } else if (var67 == 33) {
                                var74 = arg0.field1368[var48++];
                            } else if (var67 == 7) {
                                var74 = arg0.field1368[var42++];
                            } else if (var67 == 39) {
                                var74 = arg0.field1368[var49++];
                            } else if (var67 == 10) {
                                var74 = arg0.field1368[var43++];
                            } else if (var67 == 42) {
                                var74 = arg0.field1368[var50++];
                            } else if (var67 == 99) {
                                var74 = arg0.field1368[var53++];
                            } else if (var67 == 98) {
                                var74 = arg0.field1368[var54++];
                            } else if (var67 == 101) {
                                var74 = arg0.field1368[var55++];
                            } else if (var67 == 100) {
                                var74 = arg0.field1368[var56++];
                            } else if (var67 == 64 || var67 == 65 || var67 == 120 || var67 == 121 || var67 == 123) {
                                var74 = arg0.field1368[var37++];
                            } else {
                                var74 = arg0.field1368[var46++];
                            }
                            int var75 = var66[var67] + var74;
                            var66[var67] = var75;
                            var58.method570(var75 & 0x7F, 15619);
                        } else if (var70 == 3) {
                            if (var73) {
                                var58.method570(var59 + 224, 15619);
                            }
                            int var76 = var63 + arg0.field1368[var52++];
                            var63 = var76 + (arg0.field1368[var40++] << 7);
                            var58.method570(var63 & 0x7F, 15619);
                            var58.method570(var63 >> 7 & 0x7F, 15619);
                        } else if (var70 == 4) {
                            if (var73) {
                                var58.method570(var59 + 208, 15619);
                            }
                            var64 += arg0.field1368[var39++];
                            var58.method570(var64 & 0x7F, 15619);
                        } else if (var70 == 5) {
                            if (var73) {
                                var58.method570(var59 + 160, 15619);
                            }
                            var60 += arg0.field1368[var44++];
                            var65 += arg0.field1368[var38++];
                            var58.method570(var60 & 0x7F, 15619);
                            var58.method570(var65 & 0x7F, 15619);
                        } else if (var70 == 6) {
                            if (var73) {
                                var58.method570(var59 + 192, 15619);
                            }
                            var58.method570(arg0.field1368[var51++], 15619);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
