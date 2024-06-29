import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class268 extends class141 {

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "[B")
    public byte[] field4544;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Loe;")
    public class79 field4545;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 4)
    public final void method1888() {
        if (this.field4545 != null) {
            return;
        }
        this.field4545 = new class79(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class158 var3 = new class158(this.field4544);
        int var4 = var3.method1143();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method1148(var5);
            var3.method1140(var5);
            var3.method1145(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method1147();
                int var7 = var3.field2743[var6];
                while (var3.field2743[var6] == var7) {
                    var3.method1148(var6);
                    int var8 = var3.method1137(var6);
                    if (var8 == 1) {
                        var3.method1142();
                        var3.method1145(var6);
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
                            class325 var19 = (class325) this.field4545.method507((long) var18, 602425312);
                            if (var19 == null) {
                                var19 = new class325(new byte[128]);
                                this.field4545.method503((long) var18, -99, var19);
                            }
                            var19.field5577[var16] = 1;
                        }
                    }
                    var3.method1140(var6);
                    var3.method1145(var6);
                }
            }
        } while (!var3.method1138());
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lum;II)Lji;", line = 113)
    public static final class268 method1889(class222 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1577(arg1, arg2, -29569);
        return var3 == null ? null : new class268(new class153(var3));
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()V", line = 121)
    public final void method1890() {
        this.field4545 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lbc;)V", line = 124)
    private class268(class153 arg0) {
        arg0.field2611 = arg0.field2598.length - 3;
        int var2 = arg0.method1082(-109);
        int var3 = arg0.method1090(false);
        int var4 = var2 * 10 + 14;
        arg0.field2611 = 0;
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
                int var15 = arg0.method1082(-45);
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
        int var19 = arg0.field2611;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method1080(-118);
        }
        int var22 = arg0.field2611 + var18 - var19;
        int var23 = arg0.field2611;
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
            var36 = var36 + arg0.method1082(-41) & 0x7F;
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
        int var39 = arg0.field2611;
        arg0.field2611 += var34;
        int var40 = arg0.field2611;
        arg0.field2611 += var11;
        int var41 = arg0.field2611;
        arg0.field2611 += var10;
        int var42 = arg0.field2611;
        arg0.field2611 += var9;
        int var43 = arg0.field2611;
        arg0.field2611 += var24;
        int var44 = arg0.field2611;
        arg0.field2611 += var26;
        int var45 = arg0.field2611;
        arg0.field2611 += var28;
        int var46 = arg0.field2611;
        arg0.field2611 += var7 + var8 + var11;
        int var47 = arg0.field2611;
        arg0.field2611 += var7;
        int var48 = arg0.field2611;
        arg0.field2611 += var35;
        int var49 = arg0.field2611;
        arg0.field2611 += var8;
        int var50 = arg0.field2611;
        arg0.field2611 += var25;
        int var51 = arg0.field2611;
        arg0.field2611 += var27;
        int var52 = arg0.field2611;
        arg0.field2611 += var29;
        int var53 = arg0.field2611;
        arg0.field2611 += var12;
        int var54 = arg0.field2611;
        arg0.field2611 += var9;
        int var55 = arg0.field2611;
        arg0.field2611 += var30;
        int var56 = arg0.field2611;
        arg0.field2611 += var31;
        int var57 = arg0.field2611;
        arg0.field2611 += var32;
        int var58 = arg0.field2611;
        arg0.field2611 += var33;
        int var59 = arg0.field2611;
        arg0.field2611 += var5 * 3;
        this.field4544 = new byte[var22];
        class153 var60 = new class153(this.field4544);
        var60.method1065(178808912, 1297377380);
        var60.method1065(178808912, 6);
        var60.method1102((byte) -32, var2 > 1 ? 1 : 0);
        var60.method1102((byte) -31, var2);
        var60.method1102((byte) -52, var3);
        arg0.field2611 = var19;
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
            var60.method1065(178808912, 1297379947);
            var60.field2611 += 4;
            int var71 = var60.field2611;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method1080(-83);
                    var60.method1066(-695710320, var73);
                    int var74 = arg0.field2598[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method1075(255, -1);
                        }
                        var60.method1075(47, -1);
                        var60.method1075(0, -1);
                        var60.method1051(var60.field2611 - var71, (byte) 114);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method1075(255, -1);
                        }
                        var60.method1075(81, -1);
                        var60.method1075(3, -1);
                        var60.method1075(arg0.field2598[var59++], -1);
                        var60.method1075(arg0.field2598[var59++], -1);
                        var60.method1075(arg0.field2598[var59++], -1);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method1075(var61 + 144, -1);
                            }
                            var62 += arg0.field2598[var46++];
                            var63 += arg0.field2598[var47++];
                            var60.method1075(var62 & 0x7F, -1);
                            var60.method1075(var63 & 0x7F, -1);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method1075(var61 + 128, -1);
                            }
                            var62 += arg0.field2598[var46++];
                            var64 += arg0.field2598[var49++];
                            var60.method1075(var62 & 0x7F, -1);
                            var60.method1075(var64 & 0x7F, -1);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method1075(var61 + 176, -1);
                            }
                            var69 = var69 + arg0.field2598[var23++] & 0x7F;
                            var60.method1075(var69, -1);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field2598[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field2598[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field2598[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field2598[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field2598[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field2598[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field2598[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field2598[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field2598[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field2598[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field2598[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field2598[var39++];
                            } else {
                                var76 = arg0.field2598[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method1075(var77 & 0x7F, -1);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method1075(var61 + 224, -1);
                            }
                            int var78 = var65 + arg0.field2598[var54++];
                            var65 = var78 + (arg0.field2598[var42++] << 7);
                            var60.method1075(var65 & 0x7F, -1);
                            var60.method1075(var65 >> 7 & 0x7F, -1);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method1075(var61 + 208, -1);
                            }
                            var66 += arg0.field2598[var41++];
                            var60.method1075(var66 & 0x7F, -1);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method1075(var61 + 160, -1);
                            }
                            var62 += arg0.field2598[var46++];
                            var67 += arg0.field2598[var40++];
                            var60.method1075(var62 & 0x7F, -1);
                            var60.method1075(var67 & 0x7F, -1);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method1075(var61 + 192, -1);
                            }
                            var60.method1075(arg0.field2598[var53++], -1);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
