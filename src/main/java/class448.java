import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class448 extends class35 {

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "[B")
    public byte[] field6529;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Ljj;")
    public class156 field6528;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ldp;II)Lms;")
    public static final class448 method2800(class174 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1355(arg2, -12607, arg1);
        return var3 == null ? null : new class448(new class37(var3));
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()V")
    public final void method2801() {
        this.field6528 = null;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "()V")
    public final void method2802() {
        if (this.field6528 != null) {
            return;
        }
        this.field6528 = new class156(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class442 var3 = new class442(this.field6529);
        int var4 = var3.method2753();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method2762(var5);
            var3.method2760(var5);
            var3.method2758(var5);
        }
        label53: do {
            while (true) {
                int var6 = var3.method2767();
                int var7 = var3.field6419[var6];
                while (var3.field6419[var6] == var7) {
                    var3.method2762(var6);
                    int var8 = var3.method2765(var6);
                    if (var8 == 1) {
                        var3.method2759();
                        var3.method2758(var6);
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
                            class106 var19 = (class106) this.field6528.method1219((long) var18, -112);
                            if (var19 == null) {
                                var19 = new class106(new byte[128]);
                                this.field6528.method1217(1, (long) var18, var19);
                            }
                            var19.field1750[var16] = 1;
                        }
                    }
                    var3.method2760(var6);
                    var3.method2758(var6);
                }
            }
        } while (!var3.method2756());
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lec;)V")
    private class448(class37 arg0) {
        arg0.field565 = arg0.field578.length - 3;
        int var2 = arg0.method271((byte) 121);
        int var3 = arg0.method320((byte) -87);
        int var4 = var2 * 10 + 14;
        arg0.field565 = 0;
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
                int var78 = arg0.method271((byte) 100);
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
        int var17 = arg0.field565;
        int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var19 = 0; var19 < var18; var19++) {
            arg0.method281(0);
        }
        int var20 = arg0.field565 + var16 - var17;
        int var21 = arg0.field565;
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
            var34 = var34 + arg0.method271((byte) 116) & 0x7F;
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
        int var37 = arg0.field565;
        arg0.field565 += var32;
        int var38 = arg0.field565;
        arg0.field565 += var11;
        int var39 = arg0.field565;
        arg0.field565 += var10;
        int var40 = arg0.field565;
        arg0.field565 += var9;
        int var41 = arg0.field565;
        arg0.field565 += var22;
        int var42 = arg0.field565;
        arg0.field565 += var24;
        int var43 = arg0.field565;
        arg0.field565 += var26;
        int var44 = arg0.field565;
        arg0.field565 += var7 + var8 + var11;
        int var45 = arg0.field565;
        arg0.field565 += var7;
        int var46 = arg0.field565;
        arg0.field565 += var33;
        int var47 = arg0.field565;
        arg0.field565 += var8;
        int var48 = arg0.field565;
        arg0.field565 += var23;
        int var49 = arg0.field565;
        arg0.field565 += var25;
        int var50 = arg0.field565;
        arg0.field565 += var27;
        int var51 = arg0.field565;
        arg0.field565 += var12;
        int var52 = arg0.field565;
        arg0.field565 += var9;
        int var53 = arg0.field565;
        arg0.field565 += var28;
        int var54 = arg0.field565;
        arg0.field565 += var29;
        int var55 = arg0.field565;
        arg0.field565 += var30;
        int var56 = arg0.field565;
        arg0.field565 += var31;
        int var57 = arg0.field565;
        arg0.field565 += var5 * 3;
        this.field6529 = new byte[var20];
        class37 var58 = new class37(this.field6529);
        var58.method275(1297377380, 1414495172);
        var58.method275(6, 1414495172);
        var58.method324(var2 > 1 ? 1 : 0, -70);
        var58.method324(var2, -30);
        var58.method324(var3, -41);
        arg0.field565 = var17;
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
            var58.method275(1297379947, 1414495172);
            var58.field565 += 4;
            int var69 = var58.field565;
            int var70 = -1;
            while (true) {
                while (true) {
                    int var71 = arg0.method281(0);
                    var58.method296((byte) 104, var71);
                    int var72 = arg0.field578[var36++] & 0xFF;
                    boolean var73 = var70 != var72;
                    var70 = var72 & 0xF;
                    if (var72 == 7) {
                        if (var73) {
                            var58.method267(255, false);
                        }
                        var58.method267(47, false);
                        var58.method267(0, false);
                        var58.method323((byte) 125, var58.field565 - var69);
                        continue label223;
                    }
                    if (var72 == 23) {
                        if (var73) {
                            var58.method267(255, false);
                        }
                        var58.method267(81, false);
                        var58.method267(3, false);
                        var58.method267(arg0.field578[var57++], false);
                        var58.method267(arg0.field578[var57++], false);
                        var58.method267(arg0.field578[var57++], false);
                    } else {
                        var59 ^= var72 >> 4;
                        if (var70 == 0) {
                            if (var73) {
                                var58.method267(var59 + 144, false);
                            }
                            var60 += arg0.field578[var44++];
                            var61 += arg0.field578[var45++];
                            var58.method267(var60 & 0x7F, false);
                            var58.method267(var61 & 0x7F, false);
                        } else if (var70 == 1) {
                            if (var73) {
                                var58.method267(var59 + 128, false);
                            }
                            var60 += arg0.field578[var44++];
                            var62 += arg0.field578[var47++];
                            var58.method267(var60 & 0x7F, false);
                            var58.method267(var62 & 0x7F, false);
                        } else if (var70 == 2) {
                            if (var73) {
                                var58.method267(var59 + 176, false);
                            }
                            var67 = var67 + arg0.field578[var21++] & 0x7F;
                            var58.method267(var67, false);
                            byte var74;
                            if (var67 == 0 || var67 == 32) {
                                var74 = arg0.field578[var51++];
                            } else if (var67 == 1) {
                                var74 = arg0.field578[var41++];
                            } else if (var67 == 33) {
                                var74 = arg0.field578[var48++];
                            } else if (var67 == 7) {
                                var74 = arg0.field578[var42++];
                            } else if (var67 == 39) {
                                var74 = arg0.field578[var49++];
                            } else if (var67 == 10) {
                                var74 = arg0.field578[var43++];
                            } else if (var67 == 42) {
                                var74 = arg0.field578[var50++];
                            } else if (var67 == 99) {
                                var74 = arg0.field578[var53++];
                            } else if (var67 == 98) {
                                var74 = arg0.field578[var54++];
                            } else if (var67 == 101) {
                                var74 = arg0.field578[var55++];
                            } else if (var67 == 100) {
                                var74 = arg0.field578[var56++];
                            } else if (var67 == 64 || var67 == 65 || var67 == 120 || var67 == 121 || var67 == 123) {
                                var74 = arg0.field578[var37++];
                            } else {
                                var74 = arg0.field578[var46++];
                            }
                            int var75 = var66[var67] + var74;
                            var66[var67] = var75;
                            var58.method267(var75 & 0x7F, false);
                        } else if (var70 == 3) {
                            if (var73) {
                                var58.method267(var59 + 224, false);
                            }
                            int var76 = var63 + arg0.field578[var52++];
                            var63 = var76 + (arg0.field578[var40++] << 7);
                            var58.method267(var63 & 0x7F, false);
                            var58.method267(var63 >> 7 & 0x7F, false);
                        } else if (var70 == 4) {
                            if (var73) {
                                var58.method267(var59 + 208, false);
                            }
                            var64 += arg0.field578[var39++];
                            var58.method267(var64 & 0x7F, false);
                        } else if (var70 == 5) {
                            if (var73) {
                                var58.method267(var59 + 160, false);
                            }
                            var60 += arg0.field578[var44++];
                            var65 += arg0.field578[var38++];
                            var58.method267(var60 & 0x7F, false);
                            var58.method267(var65 & 0x7F, false);
                        } else if (var70 == 6) {
                            if (var73) {
                                var58.method267(var59 + 192, false);
                            }
                            var58.method267(arg0.field578[var51++], false);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
