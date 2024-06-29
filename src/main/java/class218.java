import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class218 extends class163 {

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[B")
    public byte[] field3857;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lrj;")
    public class254 field3858;

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lra;)V", line = 7)
    private class218(class41 arg0) {
        arg0.field738 = arg0.field772.length - 3;
        int var2 = arg0.method357(false);
        int var3 = arg0.method346(-16);
        int var4 = var2 * 10 + 14;
        arg0.field738 = 0;
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
                int var15 = arg0.method357(false);
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
        int var19 = arg0.field738;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method333(-128);
        }
        int var22 = arg0.field738 + var18 - var19;
        int var23 = arg0.field738;
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
            var36 = var36 + arg0.method357(false) & 0x7F;
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
        int var39 = arg0.field738;
        arg0.field738 += var34;
        int var40 = arg0.field738;
        arg0.field738 += var11;
        int var41 = arg0.field738;
        arg0.field738 += var10;
        int var42 = arg0.field738;
        arg0.field738 += var9;
        int var43 = arg0.field738;
        arg0.field738 += var24;
        int var44 = arg0.field738;
        arg0.field738 += var26;
        int var45 = arg0.field738;
        arg0.field738 += var28;
        int var46 = arg0.field738;
        arg0.field738 += var7 + var8 + var11;
        int var47 = arg0.field738;
        arg0.field738 += var7;
        int var48 = arg0.field738;
        arg0.field738 += var35;
        int var49 = arg0.field738;
        arg0.field738 += var8;
        int var50 = arg0.field738;
        arg0.field738 += var25;
        int var51 = arg0.field738;
        arg0.field738 += var27;
        int var52 = arg0.field738;
        arg0.field738 += var29;
        int var53 = arg0.field738;
        arg0.field738 += var12;
        int var54 = arg0.field738;
        arg0.field738 += var9;
        int var55 = arg0.field738;
        arg0.field738 += var30;
        int var56 = arg0.field738;
        arg0.field738 += var31;
        int var57 = arg0.field738;
        arg0.field738 += var32;
        int var58 = arg0.field738;
        arg0.field738 += var33;
        int var59 = arg0.field738;
        arg0.field738 += var5 * 3;
        this.field3857 = new byte[var22];
        class41 var60 = new class41(this.field3857);
        var60.method365((byte) -32, 1297377380);
        var60.method365((byte) -32, 6);
        var60.method366(var2 > 1 ? 1 : 0, -117);
        var60.method366(var2, -103);
        var60.method366(var3, -114);
        arg0.field738 = var19;
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
            var60.method365((byte) -32, 1297379947);
            var60.field738 += 4;
            int var71 = var60.field738;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method333(-119);
                    var60.method347(true, var73);
                    int var74 = arg0.field772[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method308(255, -2);
                        }
                        var60.method308(47, -2);
                        var60.method308(0, -2);
                        var60.method342((byte) 87, var60.field738 - var71);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method308(255, -2);
                        }
                        var60.method308(81, -2);
                        var60.method308(3, -2);
                        var60.method308(arg0.field772[var59++], -2);
                        var60.method308(arg0.field772[var59++], -2);
                        var60.method308(arg0.field772[var59++], -2);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method308(var61 + 144, -2);
                            }
                            var62 += arg0.field772[var46++];
                            var63 += arg0.field772[var47++];
                            var60.method308(var62 & 0x7F, -2);
                            var60.method308(var63 & 0x7F, -2);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method308(var61 + 128, -2);
                            }
                            var62 += arg0.field772[var46++];
                            var64 += arg0.field772[var49++];
                            var60.method308(var62 & 0x7F, -2);
                            var60.method308(var64 & 0x7F, -2);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method308(var61 + 176, -2);
                            }
                            var69 = var69 + arg0.field772[var23++] & 0x7F;
                            var60.method308(var69, -2);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field772[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field772[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field772[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field772[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field772[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field772[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field772[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field772[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field772[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field772[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field772[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field772[var39++];
                            } else {
                                var76 = arg0.field772[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method308(var77 & 0x7F, -2);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method308(var61 + 224, -2);
                            }
                            int var78 = var65 + arg0.field772[var54++];
                            var65 = var78 + (arg0.field772[var42++] << 7);
                            var60.method308(var65 & 0x7F, -2);
                            var60.method308(var65 >> 7 & 0x7F, -2);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method308(var61 + 208, -2);
                            }
                            var66 += arg0.field772[var41++];
                            var60.method308(var66 & 0x7F, -2);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method308(var61 + 160, -2);
                            }
                            var62 += arg0.field772[var46++];
                            var67 += arg0.field772[var40++];
                            var60.method308(var62 & 0x7F, -2);
                            var60.method308(var67 & 0x7F, -2);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method308(var61 + 192, -2);
                            }
                            var60.method308(arg0.field772[var53++], -2);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "()V", line = 489)
    public final void method1515() {
        if (this.field3858 != null) {
            return;
        }
        this.field3858 = new class254(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class20 var3 = new class20(this.field3857);
        int var4 = var3.method125();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method134(var5);
            var3.method126(var5);
            var3.method132(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method130();
                int var7 = var3.field270[var6];
                while (var3.field270[var6] == var7) {
                    var3.method134(var6);
                    int var8 = var3.method122(var6);
                    if (var8 == 1) {
                        var3.method135();
                        var3.method132(var6);
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
                            class146 var19 = (class146) this.field3858.method1744((byte) 127, (long) var18);
                            if (var19 == null) {
                                var19 = new class146(new byte[128]);
                                this.field3858.method1749(true, var19, (long) var18);
                            }
                            var19.field2568[var16] = 1;
                        }
                    }
                    var3.method126(var6);
                    var3.method132(var6);
                }
            }
        } while (!var3.method127());
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "()V", line = 595)
    public final void method1516() {
        this.field3858 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lng;II)Llh;", line = 600)
    public static final class218 method1517(class138 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1016(arg1, 100, arg2);
        return var3 == null ? null : new class218(new class41(var3));
    }
}
