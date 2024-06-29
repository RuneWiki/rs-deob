import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class15 extends class188 {

    @OriginalMember(owner = "client!se", name = "k", descriptor = "[B")
    public byte[] field152;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lqb;")
    public class117 field153;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V", line = 3)
    public final void method90() {
        if (this.field153 != null) {
            return;
        }
        this.field153 = new class117(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class59 var3 = new class59(this.field152);
        int var4 = var3.method358();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method360(var5);
            var3.method353(var5);
            var3.method356(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method363();
                int var7 = var3.field692[var6];
                while (var3.field692[var6] == var7) {
                    var3.method360(var6);
                    int var8 = var3.method355(var6);
                    if (var8 == 1) {
                        var3.method352();
                        var3.method356(var6);
                        continue label52;
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
                            class251 var19 = (class251) this.field153.method770((long) var18, 114);
                            if (var19 == null) {
                                var19 = new class251(new byte[128]);
                                this.field153.method764(24369, var19, (long) var18);
                            }
                            var19.field3980[var16] = 1;
                        }
                    }
                    var3.method353(var6);
                    var3.method356(var6);
                }
            }
        } while (!var3.method361());
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()V", line = 111)
    public final void method91() {
        this.field153 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lnk;II)Lse;", line = 115)
    public static final class15 method92(class16 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method100(arg1, arg2, (byte) -107);
        return var3 == null ? null : new class15(new class143(var3));
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Llf;)V", line = 126)
    private class15(class143 arg0) {
        arg0.field2295 = arg0.field2260.length - 3;
        int var2 = arg0.method1043(true);
        int var3 = arg0.method1051(1);
        int var4 = var2 * 10 + 14;
        arg0.field2295 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var14 = -1;
            while (true) {
                int var15 = arg0.method1043(true);
                if (var14 != var15) {
                    var4++;
                }
                var14 = var15 & 0xF;
                if (var15 == 7) {
                    break;
                }
                if (var15 == 23) {
                    var5++;
                } else if (var14 == 0) {
                    var7++;
                } else if (var14 == 1) {
                    var8++;
                } else if (var14 == 2) {
                    var6++;
                } else if (var14 == 3) {
                    var9++;
                } else if (var14 == 4) {
                    var10++;
                } else if (var14 == 5) {
                    var11++;
                } else if (var14 == 6) {
                    var12++;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        int var16 = var5 * 5 + var4;
        int var17 = (var7 + var8 + var6 + var9 + var11) * 2 + var16;
        int var18 = var10 + var12 + var17;
        int var19 = arg0.field2295;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method1015(true);
        }
        int var22 = arg0.field2295 + var18 - var19;
        int var23 = arg0.field2295;
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
        int var35 = 0;
        int var36 = 0;
        for (int var37 = 0; var37 < var6; var37++) {
            var36 = var36 + arg0.method1043(true) & 0x7F;
            if (var36 == 0 || var36 == 32) {
                var12++;
            } else if (var36 == 1) {
                var24++;
            } else if (var36 == 33) {
                var25++;
            } else if (var36 == 7) {
                var26++;
            } else if (var36 == 39) {
                var27++;
            } else if (var36 == 10) {
                var28++;
            } else if (var36 == 42) {
                var29++;
            } else if (var36 == 99) {
                var30++;
            } else if (var36 == 98) {
                var31++;
            } else if (var36 == 101) {
                var32++;
            } else if (var36 == 100) {
                var33++;
            } else if (var36 == 64 || var36 == 65 || var36 == 120 || var36 == 121 || var36 == 123) {
                var34++;
            } else {
                var35++;
            }
        }
        int var38 = 0;
        int var39 = arg0.field2295;
        arg0.field2295 += var34;
        int var40 = arg0.field2295;
        arg0.field2295 += var11;
        int var41 = arg0.field2295;
        arg0.field2295 += var10;
        int var42 = arg0.field2295;
        arg0.field2295 += var9;
        int var43 = arg0.field2295;
        arg0.field2295 += var24;
        int var44 = arg0.field2295;
        arg0.field2295 += var26;
        int var45 = arg0.field2295;
        arg0.field2295 += var28;
        int var46 = arg0.field2295;
        arg0.field2295 += var7 + var8 + var11;
        int var47 = arg0.field2295;
        arg0.field2295 += var7;
        int var48 = arg0.field2295;
        arg0.field2295 += var35;
        int var49 = arg0.field2295;
        arg0.field2295 += var8;
        int var50 = arg0.field2295;
        arg0.field2295 += var25;
        int var51 = arg0.field2295;
        arg0.field2295 += var27;
        int var52 = arg0.field2295;
        arg0.field2295 += var29;
        int var53 = arg0.field2295;
        arg0.field2295 += var12;
        int var54 = arg0.field2295;
        arg0.field2295 += var9;
        int var55 = arg0.field2295;
        arg0.field2295 += var30;
        int var56 = arg0.field2295;
        arg0.field2295 += var31;
        int var57 = arg0.field2295;
        arg0.field2295 += var32;
        int var58 = arg0.field2295;
        arg0.field2295 += var33;
        int var59 = arg0.field2295;
        arg0.field2295 += var5 * 3;
        this.field152 = new byte[var22];
        class143 var60 = new class143(this.field152);
        var60.method1052(1297377380, false);
        var60.method1052(6, false);
        var60.method1003(var2 > 1 ? 1 : 0, -2);
        var60.method1003(var2, -2);
        var60.method1003(var3, -2);
        arg0.field2295 = var19;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        int var67 = 0;
        int[] var68 = new int[128];
        int var69 = 0;
        label223: for (int var70 = 0; var70 < var2; var70++) {
            var60.method1052(1297379947, false);
            var60.field2295 += 4;
            int var71 = var60.field2295;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method1015(true);
                    var60.method1042(-1, var73);
                    int var74 = arg0.field2260[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method1055(255, 119);
                        }
                        var60.method1055(47, 123);
                        var60.method1055(0, 103);
                        var60.method1038(var60.field2295 - var71, 30);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method1055(255, 103);
                        }
                        var60.method1055(81, 102);
                        var60.method1055(3, 111);
                        var60.method1055(arg0.field2260[var59++], 79);
                        var60.method1055(arg0.field2260[var59++], 106);
                        var60.method1055(arg0.field2260[var59++], 81);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method1055(var61 + 144, 124);
                            }
                            var62 += arg0.field2260[var46++];
                            var63 += arg0.field2260[var47++];
                            var60.method1055(var62 & 0x7F, 96);
                            var60.method1055(var63 & 0x7F, 85);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method1055(var61 + 128, 104);
                            }
                            var62 += arg0.field2260[var46++];
                            var64 += arg0.field2260[var49++];
                            var60.method1055(var62 & 0x7F, 93);
                            var60.method1055(var64 & 0x7F, 110);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method1055(var61 + 176, 93);
                            }
                            var69 = var69 + arg0.field2260[var23++] & 0x7F;
                            var60.method1055(var69, 106);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field2260[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field2260[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field2260[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field2260[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field2260[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field2260[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field2260[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field2260[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field2260[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field2260[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field2260[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field2260[var39++];
                            } else {
                                var76 = arg0.field2260[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method1055(var77 & 0x7F, 126);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method1055(var61 + 224, 82);
                            }
                            int var78 = var65 + arg0.field2260[var54++];
                            var65 = var78 + (arg0.field2260[var42++] << 7);
                            var60.method1055(var65 & 0x7F, 93);
                            var60.method1055(var65 >> 7 & 0x7F, 125);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method1055(var61 + 208, 82);
                            }
                            var66 += arg0.field2260[var41++];
                            var60.method1055(var66 & 0x7F, 102);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method1055(var61 + 160, 85);
                            }
                            var62 += arg0.field2260[var46++];
                            var67 += arg0.field2260[var40++];
                            var60.method1055(var62 & 0x7F, 89);
                            var60.method1055(var67 & 0x7F, 81);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method1055(var61 + 192, 101);
                            }
                            var60.method1055(arg0.field2260[var53++], 104);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
